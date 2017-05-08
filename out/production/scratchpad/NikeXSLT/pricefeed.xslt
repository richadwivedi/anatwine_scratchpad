<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                xmlns:fn="http://www.w3.org/2005/xpath-functions"
                exclude-result-prefixes="#all">

    <xsl:output method="xml" indent="yes"/>
    <xsl:param name="blackListedProductTypes"/>

    <!-- root template -->
    <xsl:template match="products">
        <priceData xmlns="http://api.anatwine.com/schemas/brand/v3/price">
            <products>
                <xsl:apply-templates/>
            </products>
        </priceData>
    </xsl:template>

    <xsl:template match="PRODUCT">
        <xsl:variable name="currentNikeType"><xsl:value-of select="niketype"/></xsl:variable>
        <xsl:choose>
            <!--<xsl:when test="fn:index-of($blackListedProductTypes, $currentNikeType)">-->
            <xsl:when test="fn:contains($blackListedProductTypes, $currentNikeType)">
                <!--DO NOTHING-->
            </xsl:when>
            <xsl:otherwise>
                <product>
                    <articles>
                        <xsl:apply-templates select="sizes"/>
                    </articles>
                </product>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <!-- Converts Nike size 'id' into 'brandArticleSku' & Nike size 'ean' into 'upc' -->
    <xsl:template match="size">
        <article>
            <brandArticleSku><xsl:value-of select="@id"/></brandArticleSku>
            <ean><xsl:value-of select="upc"/></ean>
            <channels>
                <xsl:apply-templates select="ancestor::PRODUCT/prices"/>
            </channels>
        </article>
    </xsl:template>

    <!-- Converts Nike price 'country' into 'countryChannel', Nike price 'list' into 'brandRRP'.
         If Nike price 'onsale' is 1, then converts Nike price 'saleprice' into 'salesprice'-->
    <xsl:template match="price">
        <xsl:element name="countryChannel">
            <xsl:attribute name="countryCode" select="@country"/>
            <prices>
                <brandRRP>
                    <currency><xsl:value-of select="@currency"/></currency>
                    <value><xsl:value-of select="listprice"/></value>
                </brandRRP>

                <!-- If onsale, then add salesprice tag -->
                <xsl:if test="onsale = 1">
                    <salesPrice>
                        <currency><xsl:value-of select="@currency"/></currency>
                        <value><xsl:value-of select="saleprice"/></value>
                    </salesPrice>
                </xsl:if>
            </prices>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>
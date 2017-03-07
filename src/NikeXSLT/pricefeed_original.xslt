<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                exclude-result-prefixes="#all">

    <xsl:output method="xml" indent="yes"/>

    <!-- root template -->
    <xsl:template match="products">
        <priceData xmlns="http://api.anatwine.com/schemas/brand/v3/price">
            <products>
                <xsl:apply-templates/>
            </products>
        </priceData>
    </xsl:template>

    <xsl:template match="PRODUCT">
        <product>
            <articles>
                <xsl:apply-templates select="sizes"/>
            </articles>
        </product>
    </xsl:template>

    <!-- Converts size 'id' into 'brandArticleSku' & size 'ean' into 'upc' -->
    <xsl:template match="size">
        <article>
            <brandArticleSku><xsl:value-of select="@id"/></brandArticleSku>
            <ean><xsl:value-of select="upc"/></ean>
            <channels>
                <xsl:apply-templates select="ancestor::PRODUCT/prices"/>
            </channels>
        </article>
    </xsl:template>

    <!-- Converts price 'country' into 'countryChannel', price 'list' into 'brandRRP'.
         If price 'onsale' is 1, then converts price 'saleprice' into 'salesprice'-->
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
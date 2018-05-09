<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                exclude-result-prefixes="#all">

    <xsl:output method="xml" indent="yes" encoding="UTF-8" omit-xml-declaration="yes"/>
    <xsl:strip-space elements="*"/>

    <!-- root template -->
    <xsl:template match="Envelope">
        <a1>
            <xsl:element name="countryChannel">
        <xsl:apply-templates/>
            </xsl:element>
        </a1>
    </xsl:template>

    <xsl:template match="Body/GetMyeBaySellingResponse/ActiveList/ItemArray">
        <xsl:apply-templates/>
    </xsl:template>

    <xsl:template match="Item">
        <b1>
        <xsl:apply-templates select="Variations"/>
        </b1>
    </xsl:template>

    <xsl:template match="Variation">
        <brandArticleId>
            <xsl:value-of select="SKU"/>
        </brandArticleId>
    </xsl:template>

</xsl:stylesheet>

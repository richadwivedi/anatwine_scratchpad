<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                exclude-result-prefixes="#all">

    <xsl:output method="xml" indent="yes" encoding="UTF-8" omit-xml-declaration="yes"/>
    <xsl:strip-space elements="*"/>
    <xsl:param name="retailerChannels"/>

    <!-- root template -->
    <xsl:template match="products">
        <xsl:if test="(PRODUCT/attributes/attribute/@type = 'partnerprograms')">
            <xsl:apply-templates/>
        </xsl:if>
    </xsl:template>

    <xsl:template match="PRODUCT">
        <xsl:if test="(attributes/attribute/@type = 'partnerprograms')">
            <xsl:variable name="partnercode" select="attributes/attribute/code" />
            <xsl:variable name="partnumber" select="partnumber" />
            <!--<THOMAS><xsl:value-of select="$partnercode"/></THOMAS>-->
            <xsl:for-each select="tokenize($retailerChannels, ',')">
                <xsl:if test="(. = $partnercode)">
                    <item><xsl:value-of select="." /></item>
                    <brandProductLineId>
                        <xsl:value-of select="$partnumber"/>
                    </brandProductLineId>
                    <!--<xsl:variable name="pos" select="position()" />-->
                    <!--<itemPos><xsl:value-of select="$pos" /></itemPos>-->
                    <!--<itemName><xsl:value-of select="." /></itemName>-->
                </xsl:if>
            </xsl:for-each>
        </xsl:if>
    </xsl:template>
</xsl:stylesheet>

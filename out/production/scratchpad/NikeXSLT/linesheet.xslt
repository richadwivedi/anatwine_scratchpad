<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                exclude-result-prefixes="#all">

    <xsl:output method="xml" indent="yes" encoding="UTF-8" omit-xml-declaration="yes"/>
    <xsl:strip-space elements="*"/>

    <!-- root template -->
    <xsl:template match="products">
        <xsl:if test="(PRODUCT/attributes/attribute/@type = 'partnerprogram') and ((PRODUCT/attributes/attribute/code = 'Zalando') or (PRODUCT/attributes/attribute/code = 'zalando'))">
            <xsl:apply-templates/>
            <!--<linesheet>-->
                <!--<brandProductLineIds>-->
                    <!--<xsl:apply-templates/>-->
                <!--</brandProductLineIds>-->
            <!--</linesheet>-->
        </xsl:if>
    </xsl:template>

    <xsl:template match="PRODUCT">
        <xsl:if test="(attributes/attribute/@type = 'partnerprogram') and ((attributes/attribute/code = 'Zalando') or (attributes/attribute/code = 'zalando'))">
            <brandProductLineId><xsl:value-of select="partnumber"/></brandProductLineId>
        </xsl:if>
    </xsl:template>

</xsl:stylesheet>

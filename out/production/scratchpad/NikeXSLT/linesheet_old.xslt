<!--<xsl:stylesheet version="2.0"-->
                <!--xmlns:xsl="http://www.w3.org/1999/XSL/Transform"-->
                <!--xmlns:xs="http://www.w3.org/2001/XMLSchema"-->
                <!--exclude-result-prefixes="#all">-->

    <!--<xsl:output method="xml" indent="yes"/>-->

    <!--&lt;!&ndash; root template &ndash;&gt;-->
    <!--<xsl:template match="products">-->
        <!--<xsl:apply-templates/>-->
    <!--</xsl:template>-->

    <!--<xsl:template match="PRODUCT">-->
        <!--<xsl:if test="(attributes/attribute/@type = 'partnerprogram') and (attributes/attribute/code = 'Zalando')">-->
            <!--<linesheet xmlns="http://api.anatwine.com/schemas/brand/v3/linesheet">-->
                <!--<retailerChannelCode>TODO_TomWoodman_RetailerCodeCalculation</retailerChannelCode>-->
                <!--<season>-->
                    <!--<seasonType>CONTINUITY</seasonType>-->
                    <!--<seasonYear><xsl:value-of select="format-dateTime(current-dateTime(),'[Y0001]')"/></seasonYear>-->
                <!--</season>-->
                <!--<brandProductLineIds>-->
                    <!--<brandProductLineId><xsl:value-of select="partnumber"/></brandProductLineId>-->
                <!--</brandProductLineIds>-->
            <!--</linesheet>-->
        <!--</xsl:if>-->
    <!--</xsl:template>-->

<!--</xsl:stylesheet>-->


 <!-- NEW below -->

<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                exclude-result-prefixes="#all">

<xsl:output method="xml" indent="yes" encoding="UTF-8" omit-xml-declaration="yes"/>
<xsl:strip-space elements="*"/>

<!-- root template -->
<xsl:template match="products">
    <xsl:apply-templates/>
</xsl:template>

<xsl:template match="PRODUCT">
    <xsl:if test="(attributes/attribute/@type = 'partnerprogram') and ((attributes/attribute/code = 'Zalando') or (attributes/attribute/code = 'zalando'))">
        <linesheet>
            <brandProductLineIds>
                <brandProductLineId><xsl:value-of select="partnumber"/></brandProductLineId>
            </brandProductLineIds>
        </linesheet>
    </xsl:if>
</xsl:template>

</xsl:stylesheet>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                exclude-result-prefixes="#all">


    <xsl:output method="xml" indent="yes"/>

    <!-- root template -->
    <!--<xsl:template match="products">-->
    <!--<xsl:apply-templates/>-->
    <!--&lt;!&ndash; If onsale, then add salesprice tag &ndash;&gt;-->
    <!--<xsl:if test="onsale = 1">-->
    <!--<linesheet xmlns="http://api.anatwine.com/schemas/brand/v3/linesheet">-->
    <!--<retailerChannelCode>TODO_TomWoodman_RetailerCodeCalculation</retailerChannelCode>-->
    <!--<season>-->
    <!--<seasonType>CONTINUITY</seasonType>-->
    <!--<seasonYear><xsl:value-of select="format-dateTime(current-dateTime(),'[Y0001]')"/></seasonYear>-->
    <!--</season>-->
    <!--<brandProductLineIds>-->
    <!--<xsl:apply-templates/>-->
    <!--</brandProductLineIds>-->
    <!--</linesheet>-->
    <!--</xsl:if>-->
    <!--</xsl:template>-->

    <xsl:template match="PRODUCT">
        <xsl:apply-templates select="attributes"/>
    </xsl:template>

    <xsl:template match="attribute">
        <!--<testingcrap xmlns="http://api.anatwine.com/schemas/brand/v3/linesheet">-->
        <!--<xsl:if test="(@type = 'partnerprogram')">-->
        <!--<xsl:attribute name="partner" select="@type"/>-->
        <!--</xsl:if>-->

        <!--<xsl:attribute name="partnercode" select="code"/>-->
        <xsl:if test="(@type = 'partnerprogram') and (code = 'Zalando')">
            <linesheet xmlns="http://api.anatwine.com/schemas/brand/v3/linesheet">
                <retailerChannelCode>TODO_TomWoodman_RetailerCodeCalculation</retailerChannelCode>
                <season>
                    <seasonType>CONTINUITY</seasonType>
                    <seasonYear><xsl:value-of select="format-dateTime(current-dateTime(),'[Y0001]')"/></seasonYear>
                </season>
                <brandProductLineIds>
                    <brandProductLineId><xsl:value-of select="ancestor::PRODUCT/partnumber"/></brandProductLineId>
                    <!--<xsl:apply-templates select="ancestor::PRODUCT"/>-->
                </brandProductLineIds>
            </linesheet>
        </xsl:if>
        <!--</testingcrap>-->
    </xsl:template>

    <!--<xsl:template match="PRODUCT">-->
    <!--<brandProductLineId><xsl:value-of select="partnumber"/></brandProductLineId>-->
    <!--</xsl:template>-->

</xsl:stylesheet>
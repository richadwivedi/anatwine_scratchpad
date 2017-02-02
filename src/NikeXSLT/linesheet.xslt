<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xs="http://www.w3.org/2001/XMLSchema"
                exclude-result-prefixes="#all">


    <xsl:output method="xml" indent="yes"/>

    <!-- root template -->
    <xsl:template match="products">
        <linesheet xmlns="http://api.anatwine.com/schemas/brand/v3/linesheet">
            <retailerChannelCode>TODO_TomWoodman_RetailerCodeCalculation</retailerChannelCode>
            <season>
                <seasonType>CONTINUITY</seasonType>
                <seasonYear><xsl:value-of select="format-dateTime(current-dateTime(),'[Y0001]')"/></seasonYear>
            </season>
            <brandProductLineIds>
                <xsl:apply-templates/>
            </brandProductLineIds>
        </linesheet>
    </xsl:template>

    <xsl:template match="PRODUCT">
        <brandProductLineId><xsl:value-of select="partnumber"/></brandProductLineId>
    </xsl:template>

</xsl:stylesheet>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                exclude-result-prefixes="#all"
                xmlns="http://api.anatwine.com/schemas/brand/v3/order"
                xpath-default-namespace="http://api.anatwine.com/schemas/brand/v3/order">

    <xsl:output method="xml" indent="yes" encoding="UTF-8" omit-xml-declaration="yes"/>
    <xsl:strip-space elements="*"/>

    <!-- By default, transform every node and attribute into a copy of itself -->
    <xsl:template match="node()|@*">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>

    <!-- Transform retailerArticleSku element with truncation to length 13 -->
    <xsl:template match="retailerArticleSku[string-length(.) &gt; 13]">
        <xsl:copy>
            <xsl:apply-templates select="@*"/>
            <xsl:value-of select="substring(., 1, 13)"/>
        </xsl:copy>
    </xsl:template>

    <!-- Transform orderLine element by adding deliveryServiceCode element for the specified retailerChannelCode -->
    <xsl:template match="articleDescription">
        <xsl:copy>
            <xsl:apply-templates/>
        </xsl:copy>
        <xsl:if test="ancestor::orders/order/orderHeader[retailerChannelCode='surperrynl']">
            <deliveryServiceCode>NDA</deliveryServiceCode>
        </xsl:if>
    </xsl:template>

</xsl:stylesheet>

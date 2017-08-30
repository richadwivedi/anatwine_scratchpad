<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:ext="http://exslt.org/common"
                exclude-result-prefixes="#all"
                xpath-default-namespace="http://api.anatwine.com/schemas/brand/v3/order">

    <xsl:output method="xml" indent="yes" encoding="UTF-8" omit-xml-declaration="yes"/>
    <xsl:strip-space elements="*"/>
    <xsl:param name="pNamespace" select="'http://api.anatwine.com/schemas/brand/v3/order'"/>

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
        <xsl:if test="ancestor::order/orderHeader[retailerChannelCode='zadede']">
            <deliveryServiceCode>NDA</deliveryServiceCode>
        </xsl:if>
    </xsl:template>

</xsl:stylesheet>



<!--
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                exclude-result-prefixes="#all"
                xpath-default-namespace="http://api.anatwine.com/schemas/brand/v3/order">

    <xsl:output method="xml" indent="yes" encoding="UTF-8" omit-xml-declaration="yes"/>
    <xsl:strip-space elements="*"/>

    <xsl:template match="node()|@*">
        <xsl:copy>
            <xsl:apply-templates select="node()|@*"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="articleDescription">
        <xsl:copy>
            <xsl:apply-templates/>
        </xsl:copy>
        <xsl:if test="ancestor::order/orderHeader[retailerChannelCode='zadede']">
            <deliveryServiceCode>NDA</deliveryServiceCode>
        </xsl:if>
    </xsl:template>

</xsl:stylesheet>
-->


<!--
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                exclude-result-prefixes="#all"
                xpath-default-namespace="http://api.anatwine.com/schemas/brand/v3/order">

    <xsl:output method="xml" indent="yes" encoding="UTF-8" omit-xml-declaration="yes"/>
    <xsl:strip-space elements="*"/>


    <xsl:template match="orderFile">
        <xsl:if test="(orders/order/orderHeader/retailerChannelCode = 'zadede') ">
            <xsl:apply-templates select="orders/order/orderLines"/>
        </xsl:if>
    </xsl:template>

    <xsl:template match="orderLine">
        <deliveryServiceCode>NDA</deliveryServiceCode>
    </xsl:template>

</xsl:stylesheet>
-->
<!--
<xsl:stylesheet version="2.0"
                    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                    exclude-result-prefixes="#all"
                    xpath-default-namespace="http://api.anatwine.com/schemas/brand/v3/order">
    <xsl:output method="xml" indent="yes"/>
    <xsl:strip-space elements="*"/>

    <xsl:param name="deliveryServiceCode">deliveryServiceCode</xsl:param>

    <xsl:template match="//orderLines">
        <xsl:call-template name="Copy"/>
        <xsl:choose>
            <xsl:when test="ancestor::order/orderHeader[retailerChannelCode='zadede']">
                <xsl:element name="{deliveryServiceCode}">
                    <xsl:value-of select="'NDA'" />
                </xsl:element>
            </xsl:when>
        </xsl:choose>
    </xsl:template>

    <xsl:template match="@* | node()" name="Copy">
        <xsl:copy>
            <xsl:apply-templates select="@* | node()"/>
        </xsl:copy>
    </xsl:template>

</xsl:stylesheet>
-->
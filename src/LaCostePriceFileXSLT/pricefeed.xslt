<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xpath-default-namespace="http://api.anatwine.com/schemas/brand/v3/stock"
                xmlns:ns0="http://api.anatwine.com/schemas/brand/v3/price">
    <xsl:strip-space elements="*"/>
    <xsl:output method="xml" omit-xml-declaration="yes" indent="yes"/>

    <!-- The first template copies everything as is from the input document, except for the nodes that match the second template.
    The second template matches elements with name 'ns0:dateActiveTo' within 'ns0:brandRRP'. For these nodes, do nothing i.e. delete them -->

    <xsl:template match="@*|node()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>

    <xsl:template match="ns0:brandRRP/ns0:dateActiveTo"/>

</xsl:stylesheet>
<xsl:stylesheet version="2.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xpath-default-namespace="http://api.anatwine.com/schemas/brand/v3/stock">

    <xsl:strip-space elements="*"/>
    <xsl:output method="xml" omit-xml-declaration="yes" indent="yes"/>

    <!-- Do the following transformations:
    *
    * Store the value of incoming element 'StockFeed' in a variable.
    * Use this value to transform the top level element 'stockData' by adding another attribute to that element with the variable value.
    * Delete the 'StockFeed' element
    * Delete the 'ean' element
    -->

    <xsl:variable name="stockfeedname" select="stockData/stocks/StockFeed" />

    <!-- The first template copies everything as is from the input document -->
    <xsl:template match="@*|node()">
       <xsl:copy>
           <xsl:apply-templates select="@*|node()"/>
       </xsl:copy>
    </xsl:template>

   <!-- The second template updates the stockData element with an extra attribute and copies everything else as is from the input document,
    except for the nodes that match the remaining templates.
    The remaining templates matches elements with name ean & StockFeed. For these nodes, do nothing i.e. delete them -->

    <xsl:template match="stockData">
        <xsl:copy>
            <!-- insert new attribute and value from variable -->
            <xsl:attribute name="stockFeedName">
                <xsl:value-of select="$stockfeedname"/>
            </xsl:attribute>
            <xsl:apply-templates select="@*|node()" />
        </xsl:copy>
    </xsl:template>

    <!-- Delete the nodes for ean and StockFeed -->
    <xsl:template match="ean"/>
    <xsl:template match="StockFeed"/>

</xsl:stylesheet>
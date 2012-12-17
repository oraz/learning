<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:strUtil="xalan://xalan.learning.functions.StringUtils">

    <xsl:output method="text"/>

    <xsl:template match="/">
        <xsl:value-of select="strUtil:toUpperCase('hello!')"/>
    </xsl:template>

</xsl:stylesheet>
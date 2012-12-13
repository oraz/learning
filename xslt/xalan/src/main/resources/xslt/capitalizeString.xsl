<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:wordUtils="xalan://org.apache.commons.lang.WordUtils">

    <xsl:output method="text"/>

    <xsl:template match="/">
        <xsl:value-of select="wordUtils:capitalize('hello world!')"/>
    </xsl:template>

</xsl:stylesheet>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:str="http://java.lang.String">

    <xsl:output method="text"/>

    <xsl:template match="/">
        <xsl:value-of select="concat('hex(100) = ', str:format('0x%X', 100))"/>

        <xsl:text>&#13;&#10;</xsl:text>

        <xsl:value-of select="concat('hex(200) = ', str:format('0x%X', 200))"/>
    </xsl:template>

</xsl:stylesheet>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:tags="http://saxon.learning.TagLibrary"
                extension-element-prefixes="tags">

    <xsl:output method="text"/>

    <xsl:template match="/root">
        <tags:sayHello to="{text()}"/>
    </xsl:template>

</xsl:stylesheet>
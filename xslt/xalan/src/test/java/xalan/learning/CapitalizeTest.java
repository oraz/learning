package xalan.learning;

import org.testng.annotations.Test;

import javax.xml.transform.TransformerException;

import static org.testng.Assert.assertEquals;
import static xslt.learning.SourceUtils.fromString;
import static xslt.learning.XsltUtils.transform;

public class CapitalizeTest {
    @Test
    public void testCapitalize() throws TransformerException {
        final String result = transform("/xslt/capitalizeString.xsl", fromString("<root/>"));

        assertEquals(result, "Hello World!");
    }
}

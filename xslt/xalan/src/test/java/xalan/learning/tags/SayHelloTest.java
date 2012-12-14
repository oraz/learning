package xalan.learning.tags;

import org.testng.annotations.Test;

import javax.xml.transform.TransformerException;

import static java.lang.String.format;
import static org.apache.commons.lang.RandomStringUtils.randomAlphabetic;
import static org.testng.Assert.assertEquals;
import static xslt.learning.StringSource.fromString;
import static xslt.learning.XsltUtils.transform;

public class SayHelloTest {
    @Test
    public void testSayHello() throws TransformerException {
        final String name = randomAlphabetic(10);

        final String result = transform("/xslt/customTagSayHello.xsl", fromString(format("<root>%s</root>", name)));

        assertEquals(result, format("Hello %s", name));
    }
}

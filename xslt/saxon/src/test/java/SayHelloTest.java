import org.testng.annotations.Test;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;

import static java.lang.String.format;
import static org.apache.commons.lang.RandomStringUtils.randomAlphabetic;
import static org.testng.Assert.assertEquals;

public class SayHelloTest {
    @Test
    public void testSayHello() throws TransformerException {
        final String name = randomAlphabetic(10);

        final String result = transform("/xslt/customTagSayHello.xslt", fromString(format("<root>%s</root>", name)));

        assertEquals(result, format("Hello %s", name));
    }

    private String transform(final String xsltResource, final Source source) throws TransformerException {
        return transform(transformer(xsltResource), source);
    }

    private String transform(final Transformer transformer, final Source source) throws TransformerException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        transformer.transform(source, new StreamResult(baos));
        return baos.toString();
    }

    private Transformer transformer(final String xsltResource) throws TransformerConfigurationException {
        final TransformerFactory transformerFactory = TransformerFactory.newInstance();
        final Templates templates = transformerFactory.newTemplates(new StreamSource(getClass().getResource(xsltResource).getFile()));
        return templates.newTransformer();
    }

    private Source fromString(final String xmlDoc) {
        return new StreamSource(new StringReader(xmlDoc));
    }
}

package xslt.learning;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.ByteArrayOutputStream;

public class XsltUtils {
    public static String transform(final String xsltResource, final Source source) throws TransformerException {
        return transform(transformer(xsltResource), source);
    }

    private static String transform(final Transformer transformer, final Source source) throws TransformerException {
        final ByteArrayOutputStream result = new ByteArrayOutputStream();
        transformer.transform(source, new StreamResult(result));
        return result.toString();
    }

    private static Transformer transformer(final String xsltResource) throws TransformerConfigurationException {
        final Source xslt = new StreamSource(XsltUtils.class.getResource(xsltResource).getFile());
        return TransformerFactory.newInstance().newTemplates(xslt).newTransformer();
    }
}

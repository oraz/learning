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
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        transformer.transform(source, new StreamResult(baos));
        return baos.toString();
    }

    private static Transformer transformer(final String xsltResource) throws TransformerConfigurationException {
        final TransformerFactory transformerFactory = TransformerFactory.newInstance();
        final Templates templates = transformerFactory.newTemplates(new StreamSource(XsltUtils.class.getResource(xsltResource).getFile()));
        return templates.newTransformer();
    }
}

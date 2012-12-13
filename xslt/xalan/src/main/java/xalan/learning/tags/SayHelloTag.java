package xalan.learning.tags;

import org.apache.xalan.extensions.XSLProcessorContext;
import org.apache.xalan.templates.ElemExtensionCall;

import javax.xml.transform.TransformerException;

public class SayHelloTag implements Tag<String> {
    @Override
    public String process(final XSLProcessorContext context,
                          final ElemExtensionCall extensionElement) throws TransformerException {
        final String to = extensionElement.getAttribute("to", context.getContextNode(), context.getTransformer());
        return String.format("Hello %s", to);
    }
}

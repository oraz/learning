package xalan.learning;

import org.apache.xalan.extensions.XSLProcessorContext;
import org.apache.xalan.templates.ElemExtensionCall;
import xalan.learning.tags.SayHelloTag;

import javax.xml.transform.TransformerException;

public class TagLibrary {
    public static String sayHello(final XSLProcessorContext context, final ElemExtensionCall extensionElement) throws TransformerException {
        return new SayHelloTag().process(context, extensionElement);
    }
}

package xalan.learning.tags;

import org.apache.xalan.extensions.XSLProcessorContext;
import org.apache.xalan.templates.ElemExtensionCall;

import javax.xml.transform.TransformerException;

public interface Tag<ResultType> {
    ResultType process(XSLProcessorContext context, final ElemExtensionCall extensionElement) throws TransformerException;
}

package saxon.learning.tags;

import net.sf.saxon.expr.Expression;
import net.sf.saxon.expr.SimpleExpression;
import net.sf.saxon.expr.XPathContext;
import net.sf.saxon.instruct.Executable;
import net.sf.saxon.style.ExtensionInstruction;
import net.sf.saxon.trans.XPathException;

import static java.lang.String.format;

public class SayHello extends ExtensionInstruction {
    private Expression to;

    @Override
    protected void prepareAttributes() throws XPathException {
        to = makeAttributeValueTemplate(getAttributeValue("to"));
    }

    @Override
    public Expression compile(final Executable exec) throws XPathException {
        return new SayHelloExpression(to);
    }

    private static class SayHelloExpression extends SimpleExpression {
        public SayHelloExpression(final Expression to) {
            setArguments(new Expression[]{to});
        }

        @Override
        public void process(final XPathContext context) throws XPathException {
            final CharSequence to = arguments[0].evaluateAsString(context);
            context.getReceiver().characters(format("Hello %s", to), locationId, 0);
        }
    }
}

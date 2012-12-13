package saxon.learning;

import net.sf.saxon.style.ExtensionElementFactory;

import static org.apache.commons.lang.StringUtils.capitalize;

public class TagLibrary implements ExtensionElementFactory {
    public Class getExtensionClass(final String localname) {
        try {
            return Class.forName("saxon.learning.tags." + capitalize(localname));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

package xslt.learning;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;

public class StringSource {
    public static Source fromString(final String xmlDoc) {
        return new StreamSource(new StringReader(xmlDoc));
    }
}

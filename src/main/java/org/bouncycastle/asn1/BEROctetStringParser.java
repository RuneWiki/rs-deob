package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

public class BEROctetStringParser implements ASN1OctetStringParser {

    public ASN1StreamParser _parser;

    public ASN1Primitive toASN1Primitive() {
        try {
            return this.getLoadedObject();
        } catch (IOException var2) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + var2.getMessage(), var2);
        }
    }

    public InputStream getOctetStream() {
        return new ConstructedOctetStream(this._parser);
    }

    public BEROctetStringParser(ASN1StreamParser arg0) {
        this._parser = arg0;
    }

    public ASN1Primitive getLoadedObject() throws IOException {
        return new BEROctetString(Streams.readAll(this.getOctetStream()));
    }
}

package org.bouncycastle.asn1;

import java.io.IOException;

public class BERApplicationSpecificParser implements ASN1ApplicationSpecificParser {

    public final int tag;

    public final ASN1StreamParser parser;

    public BERApplicationSpecificParser(int arg0, ASN1StreamParser arg1) {
        this.tag = arg0;
        this.parser = arg1;
    }

    public ASN1Encodable readObject() throws IOException {
        return this.parser.readObject();
    }

    public ASN1Primitive toASN1Primitive() {
        try {
            return this.getLoadedObject();
        } catch (IOException var2) {
            throw new ASN1ParsingException(var2.getMessage(), var2);
        }
    }

    public ASN1Primitive getLoadedObject() throws IOException {
        return new BERApplicationSpecific(this.tag, this.parser.readVector());
    }
}

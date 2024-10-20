package org.bouncycastle.asn1;

import java.io.IOException;

public class DERSequenceParser implements ASN1SequenceParser {

    public ASN1StreamParser _parser;

    public ASN1Primitive toASN1Primitive() {
        try {
            return this.getLoadedObject();
        } catch (IOException var2) {
            throw new IllegalStateException(var2.getMessage());
        }
    }

    public ASN1Encodable readObject() throws IOException {
        return this._parser.readObject();
    }

    public DERSequenceParser(ASN1StreamParser arg0) {
        this._parser = arg0;
    }

    public ASN1Primitive getLoadedObject() throws IOException {
        return new DERSequence(this._parser.readVector());
    }
}

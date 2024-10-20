package org.bouncycastle.asn1;

import java.io.IOException;

public class DERSetParser implements ASN1SetParser {

    public ASN1StreamParser _parser;

    public DERSetParser(ASN1StreamParser arg0) {
        this._parser = arg0;
    }

    public ASN1Encodable readObject() throws IOException {
        return this._parser.readObject();
    }

    public ASN1Primitive getLoadedObject() throws IOException {
        return new DERSet(this._parser.readVector(), false);
    }

    public ASN1Primitive toASN1Primitive() {
        try {
            return this.getLoadedObject();
        } catch (IOException var2) {
            throw new ASN1ParsingException(var2.getMessage(), var2);
        }
    }
}

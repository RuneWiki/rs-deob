package org.bouncycastle.asn1;

import java.io.IOException;

public class DERExternalParser implements ASN1Encodable, InMemoryRepresentable {

    public ASN1StreamParser _parser;

    public ASN1Primitive getLoadedObject() throws IOException {
        try {
            return new DERExternal(this._parser.readVector());
        } catch (IllegalArgumentException var2) {
            throw new ASN1Exception(var2.getMessage(), var2);
        }
    }

    public ASN1Encodable readObject() throws IOException {
        return this._parser.readObject();
    }

    public ASN1Primitive toASN1Primitive() {
        try {
            return this.getLoadedObject();
        } catch (IOException var3) {
            throw new ASN1ParsingException("unable to get DER object", var3);
        } catch (IllegalArgumentException var4) {
            throw new ASN1ParsingException("unable to get DER object", var4);
        }
    }

    public DERExternalParser(ASN1StreamParser arg0) {
        this._parser = arg0;
    }
}
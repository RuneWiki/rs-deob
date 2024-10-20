package org.bouncycastle.asn1;

import java.io.IOException;

public class BERTaggedObjectParser implements ASN1TaggedObjectParser {

    public boolean _constructed;

    public int _tagNumber;

    public ASN1StreamParser _parser;

    public ASN1Primitive toASN1Primitive() {
        try {
            return this.getLoadedObject();
        } catch (IOException var2) {
            throw new ASN1ParsingException(var2.getMessage());
        }
    }

    public boolean isConstructed() {
        return this._constructed;
    }

    public int getTagNo() {
        return this._tagNumber;
    }

    public BERTaggedObjectParser(boolean arg0, int arg1, ASN1StreamParser arg2) {
        this._constructed = arg0;
        this._tagNumber = arg1;
        this._parser = arg2;
    }

    public ASN1Primitive getLoadedObject() throws IOException {
        return this._parser.readTaggedObject(this._constructed, this._tagNumber);
    }

    public ASN1Encodable getObjectParser(int arg0, boolean arg1) throws IOException {
        if (!arg1) {
            return this._parser.readImplicit(this._constructed, arg0);
        } else if (this._constructed) {
            return this._parser.readObject();
        } else {
            throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
        }
    }
}

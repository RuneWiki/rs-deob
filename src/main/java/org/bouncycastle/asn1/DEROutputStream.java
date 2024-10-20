package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

public class DEROutputStream extends ASN1OutputStream {

    public ASN1OutputStream getDERSubStream() {
        return this;
    }

    public ASN1OutputStream getDLSubStream() {
        return this;
    }

    public void writeObject(ASN1Encodable arg0) throws IOException {
        if (arg0 == null) {
            throw new IOException("null object detected");
        }
        arg0.toASN1Primitive().toDERObject().encode(this);
    }

    public DEROutputStream(OutputStream arg0) {
        super(arg0);
    }
}

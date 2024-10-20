package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

public class DLOutputStream extends ASN1OutputStream {

    public DLOutputStream(OutputStream arg0) {
        super(arg0);
    }

    public void writeObject(ASN1Encodable arg0) throws IOException {
        if (arg0 == null) {
            throw new IOException("null object detected");
        }
        arg0.toASN1Primitive().toDLObject().encode(this);
    }
}

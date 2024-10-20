package org.bouncycastle.asn1;

import java.io.IOException;

public class DERNull extends ASN1Null {

    public static final DERNull INSTANCE = new DERNull();

    public static final byte[] zeroBytes = new byte[0];

    public boolean isConstructed() {
        return false;
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(5, zeroBytes);
    }

    public int encodedLength() {
        return 2;
    }
}

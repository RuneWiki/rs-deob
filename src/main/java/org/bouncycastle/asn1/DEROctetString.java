package org.bouncycastle.asn1;

import java.io.IOException;

public class DEROctetString extends ASN1OctetString {

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
    }

    public static void encode(DEROutputStream arg0, byte[] arg1) throws IOException {
        arg0.writeEncoded(4, arg1);
    }

    public boolean isConstructed() {
        return false;
    }

    public DEROctetString(ASN1Encodable arg0) throws IOException {
        super(arg0.toASN1Primitive().getEncoded("DER"));
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(4, this.string);
    }

    public DEROctetString(byte[] arg0) {
        super(arg0);
    }
}

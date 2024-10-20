package org.bouncycastle.asn1;

import java.io.IOException;

public abstract class ASN1Primitive extends ASN1Object {

    public static ASN1Primitive fromByteArray(byte[] arg0) throws IOException {
        ASN1InputStream var1 = new ASN1InputStream(arg0);
        try {
            ASN1Primitive var2 = var1.readObject();
            if (var1.available() != 0) {
                throw new IOException("Extra data detected in stream");
            }
            return var2;
        } catch (ClassCastException var4) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public ASN1Primitive toDLObject() {
        return this;
    }

    public final boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else {
            return arg0 instanceof ASN1Encodable && this.asn1Equals(((ASN1Encodable) arg0).toASN1Primitive());
        }
    }

    public ASN1Primitive toASN1Primitive() {
        return this;
    }

    public ASN1Primitive toDERObject() {
        return this;
    }

    public abstract int hashCode();

    public final boolean gd(Object arg0) {
        if (this == arg0) {
            return true;
        } else {
            return arg0 instanceof ASN1Encodable && this.asn1Equals(((ASN1Encodable) arg0).toASN1Primitive());
        }
    }

    public abstract int encodedLength() throws IOException;

    public abstract void encode(ASN1OutputStream arg0) throws IOException;

    public abstract boolean isConstructed();

    public abstract boolean asn1Equals(ASN1Primitive arg0);

    public abstract int ank();

    public abstract int anb();
}

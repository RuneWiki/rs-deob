package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.util.Encodable;

public abstract class ASN1Object implements ASN1Encodable, Encodable {

    public boolean bo(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ASN1Encodable)) {
            ASN1Encodable var2 = (ASN1Encodable) arg0;
            return this.toASN1Primitive().equals(var2.toASN1Primitive());
        } else {
            return false;
        }
    }

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        ASN1OutputStream var2 = new ASN1OutputStream(var1);
        var2.writeObject(this);
        return var1.toByteArray();
    }

    public byte[] getEncoded(String arg0) throws IOException {
        if (arg0.equals("DER")) {
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();
            DEROutputStream var3 = new DEROutputStream(var2);
            var3.writeObject(this);
            return var2.toByteArray();
        } else if (arg0.equals("DL")) {
            ByteArrayOutputStream var4 = new ByteArrayOutputStream();
            DLOutputStream var5 = new DLOutputStream(var4);
            var5.writeObject(this);
            return var4.toByteArray();
        } else {
            return this.getEncoded();
        }
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ASN1Encodable)) {
            ASN1Encodable var2 = (ASN1Encodable) arg0;
            return this.toASN1Primitive().equals(var2.toASN1Primitive());
        } else {
            return false;
        }
    }

    public boolean be(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ASN1Encodable)) {
            ASN1Encodable var2 = (ASN1Encodable) arg0;
            return this.toASN1Primitive().equals(var2.toASN1Primitive());
        } else {
            return false;
        }
    }

    public static boolean hasEncodedTagValue(Object arg0, int arg1) {
        return arg0 instanceof byte[] && ((byte[]) ((byte[]) arg0))[0] == arg1;
    }

    /**
     * @deprecated
     */
    public ASN1Primitive toASN1Object() {
        return this.toASN1Primitive();
    }

    public abstract ASN1Primitive toASN1Primitive();

    public boolean bf(Object arg0) {
        if (this == arg0) {
            return true;
        } else if ((arg0 instanceof ASN1Encodable)) {
            ASN1Encodable var2 = (ASN1Encodable) arg0;
            return this.toASN1Primitive().equals(var2.toASN1Primitive());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.toASN1Primitive().hashCode();
    }

    public int afi() {
        return this.toASN1Primitive().hashCode();
    }
}

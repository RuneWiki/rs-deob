package org.bouncycastle.asn1;

import java.io.IOException;

public abstract class ASN1Null extends ASN1Primitive {

    public static ASN1Null getInstance(Object arg0) {
        if (arg0 instanceof ASN1Null) {
            return (ASN1Null) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) ((byte[]) arg0)));
            } catch (IOException var3) {
                throw new IllegalArgumentException("failed to construct NULL from byte[]: " + var3.getMessage());
            } catch (ClassCastException var4) {
                throw new IllegalArgumentException("unknown object in getInstance(): " + arg0.getClass().getName());
            }
        }
    }

    public int hashCode() {
        return -1;
    }

    public abstract void encode(ASN1OutputStream arg0) throws IOException;

    public boolean asn1Equals(ASN1Primitive arg0) {
        return arg0 instanceof ASN1Null;
    }

    public int ahv() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }

    public int ahh() {
        return -1;
    }

    public int aht() {
        return -1;
    }

    public String ahm() {
        return "NULL";
    }

    public String ahp() {
        return "NULL";
    }

    public String ahj() {
        return "NULL";
    }
}

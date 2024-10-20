package org.bouncycastle.asn1;

import java.io.IOException;

public abstract class ASN1Null extends ASN1Primitive {

    public abstract void encode(ASN1OutputStream arg0) throws IOException;

    public String amp() {
        return "NULL";
    }

    public int hashCode() {
        return -1;
    }

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

    public String toString() {
        return "NULL";
    }

    public int amy() {
        return -1;
    }

    public int amd() {
        return -1;
    }

    public String aml() {
        return "NULL";
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        return arg0 instanceof ASN1Null;
    }

    public String ame() {
        return "NULL";
    }
}

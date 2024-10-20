package org.bouncycastle.asn1;

import java.io.IOException;

public abstract class ASN1Null extends ASN1Primitive {

    public int ajz() {
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

    public int ajf() {
        return -1;
    }

    public abstract void encode(ASN1OutputStream arg0) throws IOException;

    public String toString() {
        return "NULL";
    }

    public int ajs() {
        return -1;
    }

    public int ajq() {
        return -1;
    }

    public int hashCode() {
        return -1;
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        return arg0 instanceof ASN1Null;
    }

    public String ajt() {
        return "NULL";
    }
}

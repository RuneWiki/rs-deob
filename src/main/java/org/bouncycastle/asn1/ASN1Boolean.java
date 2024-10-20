package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

public class ASN1Boolean extends ASN1Primitive {

    public final byte[] value;

    public static final byte[] TRUE_VALUE = new byte[] { -1 };

    public static final byte[] FALSE_VALUE = new byte[] { 0 };

    public static final ASN1Boolean FALSE = new ASN1Boolean(false);

    public static final ASN1Boolean TRUE = new ASN1Boolean(true);

    public ASN1Boolean(byte[] arg0) {
        if (arg0.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        } else if (arg0[0] == 0) {
            this.value = FALSE_VALUE;
        } else if ((arg0[0] & 0xFF) == 255) {
            this.value = TRUE_VALUE;
        } else {
            this.value = Arrays.clone(arg0);
        }
    }

    public static ASN1Boolean getInstance(boolean arg0) {
        return arg0 ? TRUE : FALSE;
    }

    public static ASN1Boolean getInstance(int arg0) {
        return arg0 == 0 ? FALSE : TRUE;
    }

    public static ASN1Boolean getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof ASN1Boolean) ? getInstance(var2) : fromOctetString(((ASN1OctetString) var2).getOctets());
    }

    public int ajf() {
        return this.value[0];
    }

    public static ASN1Boolean getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof ASN1Boolean)) {
            return (ASN1Boolean) arg0;
        } else if (arg0 instanceof byte[]) {
            byte[] var1 = (byte[]) ((byte[]) arg0);
            try {
                return (ASN1Boolean) fromByteArray(var1);
            } catch (IOException var3) {
                throw new IllegalArgumentException("failed to construct boolean from byte[]: " + var3.getMessage());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public boolean isConstructed() {
        return false;
    }

    public int encodedLength() {
        return 3;
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if (arg0 instanceof ASN1Boolean) {
            return this.value[0] == ((ASN1Boolean) arg0).value[0];
        } else {
            return false;
        }
    }

    public static ASN1Boolean fromOctetString(byte[] arg0) {
        if (arg0.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        } else if (arg0[0] == 0) {
            return FALSE;
        } else if ((arg0[0] & 0xFF) == 255) {
            return TRUE;
        } else {
            return new ASN1Boolean(arg0);
        }
    }

    public int hashCode() {
        return this.value[0];
    }

    public String toString() {
        return this.value[0] == 0 ? "FALSE" : "TRUE";
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(1, this.value);
    }

    /**
     * @deprecated
     */
    public ASN1Boolean(boolean arg0) {
        this.value = arg0 ? TRUE_VALUE : FALSE_VALUE;
    }

    public int ajs() {
        return this.value[0];
    }

    public int ajq() {
        return this.value[0];
    }

    public boolean isTrue() {
        return this.value[0] != 0;
    }

    public int ajz() {
        return this.value[0];
    }

    public String ajt() {
        return this.value[0] == 0 ? "FALSE" : "TRUE";
    }
}

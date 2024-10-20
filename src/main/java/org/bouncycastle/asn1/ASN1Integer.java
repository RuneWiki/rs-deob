package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

public class ASN1Integer extends ASN1Primitive {

    public final byte[] bytes;

    public ASN1Integer(byte[] arg0, boolean arg1) {
        if (arg0.length > 1) {
            if (arg0[0] == 0 && (arg0[1] & 0x80) == 0) {
                throw new IllegalArgumentException("malformed integer");
            }
            if (arg0[0] == -1 && (arg0[1] & 0x80) != 0) {
                throw new IllegalArgumentException("malformed integer");
            }
        }
        this.bytes = arg1 ? Arrays.clone(arg0) : arg0;
    }

    public ASN1Integer(byte[] arg0) {
        this(arg0, true);
    }

    public ASN1Integer(long arg0) {
        this.bytes = BigInteger.valueOf(arg0).toByteArray();
    }

    public ASN1Integer(BigInteger arg0) {
        this.bytes = arg0.toByteArray();
    }

    public String acj() {
        return this.getValue().toString();
    }

    public int ach() {
        int var1 = 0;
        for (int var2 = 0; var2 != this.bytes.length; var2++) {
            var1 ^= (this.bytes[var2] & 0xFF) << var2 % 4;
        }
        return var1;
    }

    public BigInteger getValue() {
        return new BigInteger(this.bytes);
    }

    public BigInteger getPositiveValue() {
        return new BigInteger(1, this.bytes);
    }

    public boolean isConstructed() {
        return false;
    }

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.bytes.length) + this.bytes.length;
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(2, this.bytes);
    }

    public int hashCode() {
        int var1 = 0;
        for (int var2 = 0; var2 != this.bytes.length; var2++) {
            var1 ^= (this.bytes[var2] & 0xFF) << var2 % 4;
        }
        return var1;
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof ASN1Integer)) {
            ASN1Integer var2 = (ASN1Integer) arg0;
            return Arrays.areEqual(this.bytes, var2.bytes);
        } else {
            return false;
        }
    }

    public static ASN1Integer getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof ASN1Integer) ? getInstance(var2) : new ASN1Integer(ASN1OctetString.getInstance(arg0.getObject()).getOctets());
    }

    public static ASN1Integer getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof ASN1Integer)) {
            return (ASN1Integer) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (ASN1Integer) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public int acn() {
        int var1 = 0;
        for (int var2 = 0; var2 != this.bytes.length; var2++) {
            var1 ^= (this.bytes[var2] & 0xFF) << var2 % 4;
        }
        return var1;
    }

    public int acy() {
        int var1 = 0;
        for (int var2 = 0; var2 != this.bytes.length; var2++) {
            var1 ^= (this.bytes[var2] & 0xFF) << var2 % 4;
        }
        return var1;
    }

    public String act() {
        return this.getValue().toString();
    }

    public String acr() {
        return this.getValue().toString();
    }

    public String toString() {
        return this.getValue().toString();
    }

    public String adm() {
        return this.getValue().toString();
    }
}

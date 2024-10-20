package org.bouncycastle.asn1;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

public class ASN1Enumerated extends ASN1Primitive {

    public final byte[] bytes;

    public static ASN1Enumerated[] cache = new ASN1Enumerated[12];

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof ASN1Enumerated)) {
            ASN1Enumerated var2 = (ASN1Enumerated) arg0;
            return Arrays.areEqual(this.bytes, var2.bytes);
        } else {
            return false;
        }
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(10, this.bytes);
    }

    public ASN1Enumerated(int arg0) {
        this.bytes = BigInteger.valueOf((long) arg0).toByteArray();
    }

    public ASN1Enumerated(BigInteger arg0) {
        this.bytes = arg0.toByteArray();
    }

    public ASN1Enumerated(byte[] arg0) {
        if (arg0.length > 1) {
            if (arg0[0] == 0 && (arg0[1] & 0x80) == 0) {
                throw new IllegalArgumentException("malformed enumerated");
            }
            if (arg0[0] == -1 && (arg0[1] & 0x80) != 0) {
                throw new IllegalArgumentException("malformed enumerated");
            }
        }
        this.bytes = Arrays.clone(arg0);
    }

    public BigInteger getValue() {
        return new BigInteger(this.bytes);
    }

    public boolean isConstructed() {
        return false;
    }

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.bytes.length) + this.bytes.length;
    }

    public static ASN1Enumerated getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof ASN1Enumerated) ? getInstance(var2) : fromOctetString(((ASN1OctetString) var2).getOctets());
    }

    public int hashCode() {
        return Arrays.hashCode(this.bytes);
    }

    public static ASN1Enumerated fromOctetString(byte[] arg0) {
        if (arg0.length > 1) {
            return new ASN1Enumerated(arg0);
        } else if (arg0.length == 0) {
            throw new IllegalArgumentException("ENUMERATED has zero length");
        } else {
            int var1 = arg0[0] & 0xFF;
            if (var1 >= cache.length) {
                return new ASN1Enumerated(Arrays.clone(arg0));
            }
            ASN1Enumerated var2 = cache[var1];
            if (var2 == null) {
                var2 = cache[var1] = new ASN1Enumerated(Arrays.clone(arg0));
            }
            return var2;
        }
    }

    public static ASN1Enumerated getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof ASN1Enumerated)) {
            return (ASN1Enumerated) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (ASN1Enumerated) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public int adz() {
        return Arrays.hashCode(this.bytes);
    }

    public int adm() {
        return Arrays.hashCode(this.bytes);
    }
}

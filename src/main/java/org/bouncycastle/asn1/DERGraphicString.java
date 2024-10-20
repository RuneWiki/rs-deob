package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERGraphicString extends ASN1Primitive implements ASN1String {

    public final byte[] string;

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(25, this.string);
    }

    public static DERGraphicString getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERGraphicString) ? getInstance(var2) : new DERGraphicString(((ASN1OctetString) var2).getOctets());
    }

    public DERGraphicString(byte[] arg0) {
        this.string = Arrays.clone(arg0);
    }

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    public boolean isConstructed() {
        return false;
    }

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
    }

    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public int ajs() {
        return Arrays.hashCode(this.string);
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof DERGraphicString)) {
            DERGraphicString var2 = (DERGraphicString) arg0;
            return Arrays.areEqual(this.string, var2.string);
        } else {
            return false;
        }
    }

    public String getString() {
        return Strings.fromByteArray(this.string);
    }

    public static DERGraphicString getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERGraphicString)) {
            return (DERGraphicString) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERGraphicString) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public int ajq() {
        return Arrays.hashCode(this.string);
    }

    public int ajf() {
        return Arrays.hashCode(this.string);
    }

    public int ajz() {
        return Arrays.hashCode(this.string);
    }
}

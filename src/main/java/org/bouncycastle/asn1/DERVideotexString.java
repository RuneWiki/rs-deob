package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERVideotexString extends ASN1Primitive implements ASN1String {

    public final byte[] string;

    public boolean isConstructed() {
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public DERVideotexString(byte[] arg0) {
        this.string = Arrays.clone(arg0);
    }

    public static DERVideotexString getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERVideotexString)) {
            return (DERVideotexString) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERVideotexString) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public String getString() {
        return Strings.fromByteArray(this.string);
    }

    public static DERVideotexString getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERVideotexString) ? getInstance(var2) : new DERVideotexString(((ASN1OctetString) var2).getOctets());
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(21, this.string);
    }

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof DERVideotexString)) {
            DERVideotexString var2 = (DERVideotexString) arg0;
            return Arrays.areEqual(this.string, var2.string);
        } else {
            return false;
        }
    }

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    public int afu() {
        return Arrays.hashCode(this.string);
    }

    public int afj() {
        return Arrays.hashCode(this.string);
    }
}

package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERGeneralString extends ASN1Primitive implements ASN1String {

    public final byte[] string;

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    public static DERGeneralString getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERGeneralString) ? getInstance(var2) : new DERGeneralString(((ASN1OctetString) var2).getOctets());
    }

    public DERGeneralString(byte[] arg0) {
        this.string = arg0;
    }

    public static DERGeneralString getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERGeneralString)) {
            return (DERGeneralString) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERGeneralString) fromByteArray((byte[]) ((byte[]) arg0));
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

    public String toString() {
        return this.getString();
    }

    public String afq() {
        return this.getString();
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(27, this.string);
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

    public DERGeneralString(String arg0) {
        this.string = Strings.toByteArray(arg0);
    }

    public int afu() {
        return Arrays.hashCode(this.string);
    }

    public int afj() {
        return Arrays.hashCode(this.string);
    }

    public String afl() {
        return this.getString();
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof DERGeneralString)) {
            DERGeneralString var2 = (DERGeneralString) arg0;
            return Arrays.areEqual(this.string, var2.string);
        } else {
            return false;
        }
    }
}

package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERVisibleString extends ASN1Primitive implements ASN1String {

    public final byte[] string;

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    public static DERVisibleString getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERVisibleString) ? getInstance(var2) : new DERVisibleString(ASN1OctetString.getInstance(var2).getOctets());
    }

    public int ahh() {
        return Arrays.hashCode(this.string);
    }

    public DERVisibleString(String arg0) {
        this.string = Strings.toByteArray(arg0);
    }

    public String getString() {
        return Strings.fromByteArray(this.string);
    }

    public String toString() {
        return this.getString();
    }

    public int ahv() {
        return Arrays.hashCode(this.string);
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        return (arg0 instanceof DERVisibleString) ? Arrays.areEqual(this.string, ((DERVisibleString) arg0).string) : false;
    }

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(26, this.string);
    }

    public String ahm() {
        return this.getString();
    }

    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public boolean isConstructed() {
        return false;
    }

    public int aht() {
        return Arrays.hashCode(this.string);
    }

    public static DERVisibleString getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERVisibleString)) {
            return (DERVisibleString) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERVisibleString) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public DERVisibleString(byte[] arg0) {
        this.string = arg0;
    }

    public String ahp() {
        return this.getString();
    }

    public String ahj() {
        return this.getString();
    }
}

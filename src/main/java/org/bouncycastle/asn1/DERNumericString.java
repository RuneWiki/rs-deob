package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERNumericString extends ASN1Primitive implements ASN1String {

    public final byte[] string;

    public static DERNumericString getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERNumericString)) {
            return (DERNumericString) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERNumericString) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public boolean isConstructed() {
        return false;
    }

    public DERNumericString(byte[] arg0) {
        this.string = arg0;
    }

    public DERNumericString(String arg0) {
        this(arg0, false);
    }

    public DERNumericString(String arg0, boolean arg1) {
        if (arg1 && !isNumericString(arg0)) {
            throw new IllegalArgumentException("string contains illegal characters");
        }
        this.string = Strings.toByteArray(arg0);
    }

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    public String toString() {
        return this.getString();
    }

    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public static DERNumericString getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERNumericString) ? getInstance(var2) : new DERNumericString(ASN1OctetString.getInstance(var2).getOctets());
    }

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
    }

    public String getString() {
        return Strings.fromByteArray(this.string);
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(18, this.string);
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof DERNumericString)) {
            DERNumericString var2 = (DERNumericString) arg0;
            return Arrays.areEqual(this.string, var2.string);
        } else {
            return false;
        }
    }

    public static boolean isNumericString(String arg0) {
        for (int var1 = arg0.length() - 1; var1 >= 0; var1--) {
            char var2 = arg0.charAt(var1);
            if (var2 > 127) {
                return false;
            }
            if (('0' > var2 || var2 > '9') && var2 != ' ') {
                return false;
            }
        }
        return true;
    }

    public int ada() {
        return Arrays.hashCode(this.string);
    }

    public int adh() {
        return Arrays.hashCode(this.string);
    }

    public int adb() {
        return Arrays.hashCode(this.string);
    }

    public String adi() {
        return this.getString();
    }

    public String adf() {
        return this.getString();
    }
}

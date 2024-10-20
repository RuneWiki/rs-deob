package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERIA5String extends ASN1Primitive implements ASN1String {

    public final byte[] string;

    public String agd() {
        return this.getString();
    }

    public String agb() {
        return this.getString();
    }

    public DERIA5String(byte[] arg0) {
        this.string = arg0;
    }

    public DERIA5String(String arg0) {
        this(arg0, false);
    }

    public DERIA5String(String arg0, boolean arg1) {
        if (arg0 == null) {
            throw new NullPointerException("string cannot be null");
        } else if (arg1 && !isIA5String(arg0)) {
            throw new IllegalArgumentException("string contains illegal characters");
        } else {
            this.string = Strings.toByteArray(arg0);
        }
    }

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    public static DERIA5String getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERIA5String) ? getInstance(var2) : new DERIA5String(((ASN1OctetString) var2).getOctets());
    }

    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public boolean isConstructed() {
        return false;
    }

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(22, this.string);
    }

    public String getString() {
        return Strings.fromByteArray(this.string);
    }

    public String toString() {
        return this.getString();
    }

    public static boolean isIA5String(String arg0) {
        for (int var1 = arg0.length() - 1; var1 >= 0; var1--) {
            char var2 = arg0.charAt(var1);
            if (var2 > 127) {
                return false;
            }
        }
        return true;
    }

    public int agk() {
        return Arrays.hashCode(this.string);
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof DERIA5String)) {
            DERIA5String var2 = (DERIA5String) arg0;
            return Arrays.areEqual(this.string, var2.string);
        } else {
            return false;
        }
    }

    public static DERIA5String getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERIA5String)) {
            return (DERIA5String) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERIA5String) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public String agp() {
        return this.getString();
    }
}

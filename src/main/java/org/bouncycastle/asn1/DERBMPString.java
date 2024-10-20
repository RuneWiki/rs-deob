package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

public class DERBMPString extends ASN1Primitive implements ASN1String {

    public final char[] string;

    public boolean isConstructed() {
        return false;
    }

    public String toString() {
        return this.getString();
    }

    public DERBMPString(byte[] arg0) {
        char[] var2 = new char[arg0.length / 2];
        for (int var3 = 0; var3 != var2.length; var3++) {
            var2[var3] = (char) (arg0[var3 * 2] << 8 | arg0[var3 * 2 + 1] & 0xFF);
        }
        this.string = var2;
    }

    public DERBMPString(char[] arg0) {
        this.string = arg0;
    }

    public DERBMPString(String arg0) {
        this.string = arg0.toCharArray();
    }

    public String getString() {
        return new String(this.string);
    }

    public String akp() {
        return this.getString();
    }

    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public static DERBMPString getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERBMPString) ? getInstance(var2) : new DERBMPString(ASN1OctetString.getInstance(var2).getOctets());
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof DERBMPString)) {
            DERBMPString var2 = (DERBMPString) arg0;
            return Arrays.areEqual(this.string, var2.string);
        } else {
            return false;
        }
    }

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.string.length * 2) + this.string.length * 2;
    }

    public String aky() {
        return this.getString();
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.write(30);
        arg0.writeLength(this.string.length * 2);
        for (int var2 = 0; var2 != this.string.length; var2++) {
            char var3 = this.string[var2];
            arg0.write((byte) (var3 >> 8));
            arg0.write((byte) var3);
        }
    }

    public int akm() {
        return Arrays.hashCode(this.string);
    }

    public int akx() {
        return Arrays.hashCode(this.string);
    }

    public int akj() {
        return Arrays.hashCode(this.string);
    }

    public String akn() {
        return this.getString();
    }

    public static DERBMPString getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERBMPString)) {
            return (DERBMPString) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERBMPString) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }
}

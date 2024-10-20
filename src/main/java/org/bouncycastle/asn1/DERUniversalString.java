package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.util.Arrays;

public class DERUniversalString extends ASN1Primitive implements ASN1String {

    public final byte[] string;

    public static final char[] table = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

    public static DERUniversalString getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERUniversalString) ? getInstance(var2) : new DERUniversalString(((ASN1OctetString) var2).getOctets());
    }

    public int ajq() {
        return Arrays.hashCode(this.string);
    }

    public static DERUniversalString getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERUniversalString)) {
            return (DERUniversalString) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERUniversalString) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public String toString() {
        return this.getString();
    }

    public DERUniversalString(byte[] arg0) {
        this.string = Arrays.clone(arg0);
    }

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    public boolean isConstructed() {
        return false;
    }

    public String getString() {
        StringBuffer var1 = new StringBuffer("#");
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        ASN1OutputStream var3 = new ASN1OutputStream(var2);
        try {
            var3.writeObject(this);
        } catch (IOException var7) {
            throw new ASN1ParsingException("internal error encoding BitString");
        }
        byte[] var5 = var2.toByteArray();
        for (int var6 = 0; var6 != var5.length; var6++) {
            var1.append(table[var5[var6] >>> 4 & 0xF]);
            var1.append(table[var5[var6] & 0xF]);
        }
        return var1.toString();
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(28, this.getOctets());
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        return (arg0 instanceof DERUniversalString) ? Arrays.areEqual(this.string, ((DERUniversalString) arg0).string) : false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public int ajs() {
        return Arrays.hashCode(this.string);
    }

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
    }

    public int ajf() {
        return Arrays.hashCode(this.string);
    }

    public int ajz() {
        return Arrays.hashCode(this.string);
    }

    public String ajt() {
        return this.getString();
    }
}

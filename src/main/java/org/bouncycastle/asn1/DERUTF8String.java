package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERUTF8String extends ASN1Primitive implements ASN1String {

    public final byte[] string;

    public String acj() {
        return this.getString();
    }

    public static DERUTF8String getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERUTF8String) ? getInstance(var2) : new DERUTF8String(ASN1OctetString.getInstance(var2).getOctets());
    }

    public int encodedLength() throws IOException {
        return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
    }

    public DERUTF8String(String arg0) {
        this.string = Strings.toUTF8ByteArray(arg0);
    }

    public int acy() {
        return Arrays.hashCode(this.string);
    }

    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public static DERUTF8String getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERUTF8String)) {
            return (DERUTF8String) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERUTF8String) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof DERUTF8String)) {
            DERUTF8String var2 = (DERUTF8String) arg0;
            return Arrays.areEqual(this.string, var2.string);
        } else {
            return false;
        }
    }

    public boolean isConstructed() {
        return false;
    }

    public String acr() {
        return this.getString();
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(12, this.string);
    }

    public int ach() {
        return Arrays.hashCode(this.string);
    }

    public int acn() {
        return Arrays.hashCode(this.string);
    }

    public String getString() {
        return Strings.fromUTF8ByteArray(this.string);
    }

    public String act() {
        return this.getString();
    }

    public DERUTF8String(byte[] arg0) {
        this.string = arg0;
    }

    public String toString() {
        return this.getString();
    }

    public String adm() {
        return this.getString();
    }
}

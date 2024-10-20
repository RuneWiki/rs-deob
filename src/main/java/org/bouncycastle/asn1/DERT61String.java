package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERT61String extends ASN1Primitive implements ASN1String {

    public byte[] string;

    public static DERT61String getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERT61String) ? getInstance(var2) : new DERT61String(ASN1OctetString.getInstance(var2).getOctets());
    }

    public String amw() {
        return this.getString();
    }

    public DERT61String(byte[] arg0) {
        this.string = Arrays.clone(arg0);
    }

    public DERT61String(String arg0) {
        this.string = Strings.toByteArray(arg0);
    }

    public String getString() {
        return Strings.fromByteArray(this.string);
    }

    public static DERT61String getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERT61String)) {
            return (DERT61String) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERT61String) fromByteArray((byte[]) ((byte[]) arg0));
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

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.string.length) + this.string.length;
    }

    public int amb() {
        return Arrays.hashCode(this.string);
    }

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    public String toString() {
        return this.getString();
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        return (arg0 instanceof DERT61String) ? Arrays.areEqual(this.string, ((DERT61String) arg0).string) : false;
    }

    public int ams() {
        return Arrays.hashCode(this.string);
    }

    public int amf() {
        return Arrays.hashCode(this.string);
    }

    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(20, this.string);
    }

    public int aml() {
        return Arrays.hashCode(this.string);
    }

    public int amg() {
        return Arrays.hashCode(this.string);
    }

    public String amu() {
        return this.getString();
    }
}

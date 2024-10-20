package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

public class DERPrintableString extends ASN1Primitive implements ASN1String {

    public final byte[] string;

    public byte[] getOctets() {
        return Arrays.clone(this.string);
    }

    public static DERPrintableString getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERPrintableString) ? getInstance(var2) : new DERPrintableString(ASN1OctetString.getInstance(var2).getOctets());
    }

    public DERPrintableString(byte[] arg0) {
        this.string = arg0;
    }

    public DERPrintableString(String arg0) {
        this(arg0, false);
    }

    public int amb() {
        return Arrays.hashCode(this.string);
    }

    public String getString() {
        return Strings.fromByteArray(this.string);
    }

    public static DERPrintableString getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERPrintableString)) {
            return (DERPrintableString) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERPrintableString) fromByteArray((byte[]) ((byte[]) arg0));
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

    public void encode(ASN1OutputStream arg0) throws IOException {
        arg0.writeEncoded(19, this.string);
    }

    public int hashCode() {
        return Arrays.hashCode(this.string);
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof DERPrintableString)) {
            DERPrintableString var2 = (DERPrintableString) arg0;
            return Arrays.areEqual(this.string, var2.string);
        } else {
            return false;
        }
    }

    public String toString() {
        return this.getString();
    }

    public int amg() {
        return Arrays.hashCode(this.string);
    }

    public int ams() {
        return Arrays.hashCode(this.string);
    }

    public int amf() {
        return Arrays.hashCode(this.string);
    }

    public String amu() {
        return this.getString();
    }

    public static boolean isPrintableString(String arg0) {
        for (int var1 = arg0.length() - 1; var1 >= 0; var1--) {
            char var2 = arg0.charAt(var1);
            if (var2 > 127) {
                return false;
            }
            if (('a' > var2 || var2 > 'z') && ('A' > var2 || var2 > 'Z') && ('0' > var2 || var2 > '9')) {
                switch(var2) {
                    case ' ':
                    case '\'':
                    case '(':
                    case ')':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                    case ':':
                    case '=':
                    case '?':
                        break;
                    case '!':
                    case '"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '*':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ';':
                    case '<':
                    case '>':
                    default:
                        return false;
                }
            }
        }
        return true;
    }

    public int aml() {
        return Arrays.hashCode(this.string);
    }

    public String amw() {
        return this.getString();
    }

    public DERPrintableString(String arg0, boolean arg1) {
        if (arg1 && !isPrintableString(arg0)) {
            throw new IllegalArgumentException("string contains illegal characters");
        }
        this.string = Strings.toByteArray(arg0);
    }
}

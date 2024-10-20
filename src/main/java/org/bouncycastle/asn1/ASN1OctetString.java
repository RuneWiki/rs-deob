package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

public abstract class ASN1OctetString extends ASN1Primitive implements ASN1OctetStringParser {

    public byte[] string;

    public ASN1Primitive toDLObject() {
        return new DEROctetString(this.string);
    }

    public InputStream getOctetStream() {
        return new ByteArrayInputStream(this.string);
    }

    public ASN1OctetString(byte[] arg0) {
        if (arg0 == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.string = arg0;
    }

    public static ASN1OctetString getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof ASN1OctetString)) {
            return (ASN1OctetString) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) ((byte[]) arg0)));
            } catch (IOException var3) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + var3.getMessage());
            }
        } else {
            if (arg0 instanceof ASN1Encodable) {
                ASN1Primitive var2 = ((ASN1Encodable) arg0).toASN1Primitive();
                if (var2 instanceof ASN1OctetString) {
                    return (ASN1OctetString) var2;
                }
            }
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public ASN1OctetStringParser parser() {
        return this;
    }

    public byte[] getOctets() {
        return this.string;
    }

    public String toString() {
        return "#" + Strings.fromByteArray(Hex.encode(this.string));
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof ASN1OctetString)) {
            ASN1OctetString var2 = (ASN1OctetString) arg0;
            return Arrays.areEqual(this.string, var2.string);
        } else {
            return false;
        }
    }

    public ASN1Primitive getLoadedObject() {
        return this.toASN1Primitive();
    }

    public ASN1Primitive toDERObject() {
        return new DEROctetString(this.string);
    }

    public String anj() {
        return "#" + Strings.fromByteArray(Hex.encode(this.string));
    }

    public abstract void encode(ASN1OutputStream arg0) throws IOException;

    public int hashCode() {
        return Arrays.hashCode(this.getOctets());
    }

    public int ank() {
        return Arrays.hashCode(this.getOctets());
    }

    public int anb() {
        return Arrays.hashCode(this.getOctets());
    }

    public String ant() {
        return "#" + Strings.fromByteArray(Hex.encode(this.string));
    }

    public static ASN1OctetString getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof ASN1OctetString) ? getInstance(var2) : BEROctetString.fromSequence(ASN1Sequence.getInstance(var2));
    }
}

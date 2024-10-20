package org.bouncycastle.asn1;

import java.io.IOException;

public class DERBitString extends ASN1BitString {

    public static DERBitString getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof DERBitString)) {
            return (DERBitString) arg0;
        } else if (arg0 instanceof DLBitString) {
            return new DERBitString(((DLBitString) arg0).data, ((DLBitString) arg0).padBits);
        } else if (arg0 instanceof byte[]) {
            try {
                return (DERBitString) fromByteArray((byte[]) ((byte[]) arg0));
            } catch (Exception var2) {
                throw new IllegalArgumentException("encoding error in getInstance: " + var2.toString());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + arg0.getClass().getName());
        }
    }

    public static DERBitString getInstance(ASN1TaggedObject arg0, boolean arg1) {
        ASN1Primitive var2 = arg0.getObject();
        return arg1 || (var2 instanceof DERBitString) ? getInstance(var2) : fromOctetString(((ASN1OctetString) var2).getOctets());
    }

    public static DERBitString fromOctetString(byte[] arg0) {
        if (arg0.length < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        byte var1 = arg0[0];
        byte[] var2 = new byte[arg0.length - 1];
        if (var2.length != 0) {
            System.arraycopy(arg0, 1, var2, 0, arg0.length - 1);
        }
        return new DERBitString(var2, var1);
    }

    public static byte[] toByteArray(byte arg0) {
        return new byte[] { arg0 };
    }

    public DERBitString(byte[] arg0, int arg1) {
        super(arg0, arg1);
    }

    public DERBitString(byte[] arg0) {
        this(arg0, 0);
    }

    public DERBitString(int arg0) {
        super(getBytes(arg0), getPadBits(arg0));
    }

    public DERBitString(byte arg0, int arg1) {
        this(toByteArray(arg0), arg1);
    }

    public DERBitString(ASN1Encodable arg0) throws IOException {
        super(arg0.toASN1Primitive().getEncoded("DER"), 0);
    }

    public int encodedLength() {
        return 1 + StreamUtil.calculateBodyLength(this.data.length + 1) + this.data.length + 1;
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        byte[] var2 = derForm(this.data, this.padBits);
        byte[] var3 = new byte[var2.length + 1];
        var3[0] = (byte) this.getPadBits();
        System.arraycopy(var2, 0, var3, 1, var3.length - 1);
        arg0.writeEncoded(3, var3);
    }

    public boolean isConstructed() {
        return false;
    }
}

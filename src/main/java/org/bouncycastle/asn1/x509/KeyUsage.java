package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;

public class KeyUsage extends ASN1Object {

    public DERBitString bitString;

    public static final int cRLSign = 2;

    public static final int dataEncipherment = 16;

    public static final int decipherOnly = 32768;

    public static final int digitalSignature = 128;

    public static final int encipherOnly = 1;

    public static final int keyAgreement = 8;

    public static final int keyCertSign = 4;

    public static final int keyEncipherment = 32;

    public static final int nonRepudiation = 64;

    public int getPadBits() {
        return this.bitString.getPadBits();
    }

    public static KeyUsage getInstance(Object arg0) {
        if (arg0 instanceof KeyUsage) {
            return (KeyUsage) arg0;
        } else if (arg0 == null) {
            return null;
        } else {
            return new KeyUsage(DERBitString.getInstance(arg0));
        }
    }

    public String toString() {
        byte[] var1 = this.bitString.getBytes();
        return var1.length == 1 ? "KeyUsage: 0x" + Integer.toHexString(var1[0] & 0xFF) : "KeyUsage: 0x" + Integer.toHexString((var1[1] & 0xFF) << 8 | var1[0] & 0xFF);
    }

    public KeyUsage(DERBitString arg0) {
        this.bitString = arg0;
    }

    public boolean hasUsages(int arg0) {
        return (this.bitString.intValue() & arg0) == arg0;
    }

    public byte[] getBytes() {
        return this.bitString.getBytes();
    }

    public static KeyUsage fromExtensions(Extensions arg0) {
        return getInstance(arg0.getExtensionParsedValue(Extension.keyUsage));
    }

    public ASN1Primitive toASN1Primitive() {
        return this.bitString;
    }

    public KeyUsage(int arg0) {
        this.bitString = new DERBitString(arg0);
    }

    public String agb() {
        byte[] var1 = this.bitString.getBytes();
        return var1.length == 1 ? "KeyUsage: 0x" + Integer.toHexString(var1[0] & 0xFF) : "KeyUsage: 0x" + Integer.toHexString((var1[1] & 0xFF) << 8 | var1[0] & 0xFF);
    }

    public String agd() {
        byte[] var1 = this.bitString.getBytes();
        return var1.length == 1 ? "KeyUsage: 0x" + Integer.toHexString(var1[0] & 0x194421F8) : "KeyUsage: 0x" + Integer.toHexString((var1[1] & 0xFF) << 8 | var1[0] & 0x7163CD89);
    }

    public String agp() {
        byte[] var1 = this.bitString.getBytes();
        return var1.length == 1 ? "KeyUsage: 0x" + Integer.toHexString(var1[0] & 0x2AC28DF5) : "KeyUsage: 0x" + Integer.toHexString((var1[1] & 0xFF) << 8 | var1[0] & 0xFF);
    }
}

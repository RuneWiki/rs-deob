package org.bouncycastle.asn1;

import java.io.IOException;
import org.bouncycastle.util.Arrays;

public abstract class ASN1ApplicationSpecific extends ASN1Primitive {

    public final boolean isConstructed;

    public final int tag;

    public final byte[] octets;

    public static ASN1ApplicationSpecific getInstance(Object arg0) {
        if (arg0 == null || (arg0 instanceof ASN1ApplicationSpecific)) {
            return (ASN1ApplicationSpecific) arg0;
        } else if (arg0 instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) ((byte[]) arg0)));
            } catch (IOException var2) {
                throw new IllegalArgumentException("Failed to construct object from byte[]: " + var2.getMessage());
            }
        } else {
            throw new IllegalArgumentException("unknown object in getInstance: " + arg0.getClass().getName());
        }
    }

    public int hashCode() {
        return (this.isConstructed ? 1 : 0) ^ this.tag ^ Arrays.hashCode(this.octets);
    }

    public static int getLengthOfHeader(byte[] arg0) {
        int var1 = arg0[1] & 0xFF;
        if (var1 == 128) {
            return 2;
        } else if (var1 > 127) {
            int var2 = var1 & 0x7F;
            if (var2 > 4) {
                throw new IllegalStateException("DER length more than 4 bytes: " + var2);
            }
            return var2 + 2;
        } else {
            return 2;
        }
    }

    public boolean isConstructed() {
        return this.isConstructed;
    }

    public byte[] getContents() {
        return Arrays.clone(this.octets);
    }

    public int getApplicationTag() {
        return this.tag;
    }

    public ASN1Primitive getObject(int arg0) throws IOException {
        if (arg0 >= 31) {
            throw new IOException("unsupported tag number");
        }
        byte[] var2 = this.getEncoded();
        byte[] var3 = this.replaceTagNumber(arg0, var2);
        if ((var2[0] & 0x20) != 0) {
            var3[0] = (byte) (var3[0] | 0x20);
        }
        return ASN1Primitive.fromByteArray(var3);
    }

    public int encodedLength() throws IOException {
        return StreamUtil.calculateTagLength(this.tag) + StreamUtil.calculateBodyLength(this.octets.length) + this.octets.length;
    }

    public ASN1ApplicationSpecific(boolean arg0, int arg1, byte[] arg2) {
        this.isConstructed = arg0;
        this.tag = arg1;
        this.octets = Arrays.clone(arg2);
    }

    public ASN1Primitive getObject() throws IOException {
        return ASN1Primitive.fromByteArray(this.getContents());
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof ASN1ApplicationSpecific)) {
            ASN1ApplicationSpecific var2 = (ASN1ApplicationSpecific) arg0;
            return this.isConstructed == var2.isConstructed && this.tag == var2.tag && Arrays.areEqual(this.octets, var2.octets);
        } else {
            return false;
        }
    }

    public void encode(ASN1OutputStream arg0) throws IOException {
        int var2 = 64;
        if (this.isConstructed) {
            var2 |= 0x20;
        }
        arg0.writeEncoded(var2, this.tag, this.octets);
    }

    public byte[] replaceTagNumber(int arg0, byte[] arg1) throws IOException {
        int var3 = arg1[0] & 0x1F;
        int var4 = 1;
        if (var3 == 31) {
            int var5 = 0;
            int var6 = arg1[var4++] & 0xFF;
            if ((var6 & 0x7F) == 0) {
                throw new ASN1ParsingException("corrupted stream - invalid high tag number found");
            }
            while (var6 >= 0 && (var6 & 0x80) != 0) {
                int var7 = var5 | var6 & 0x7F;
                var5 = var7 << 7;
                var6 = arg1[var4++] & 0xFF;
            }
        }
        byte[] var8 = new byte[arg1.length - var4 + 1];
        System.arraycopy(arg1, var4, var8, 1, var8.length - 1);
        var8[0] = (byte) arg0;
        return var8;
    }

    public int afi() {
        return (this.isConstructed ? 1 : 0) ^ this.tag ^ Arrays.hashCode(this.octets);
    }
}

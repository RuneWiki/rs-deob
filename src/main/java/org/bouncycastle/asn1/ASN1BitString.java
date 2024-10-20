package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

public abstract class ASN1BitString extends ASN1Primitive implements ASN1String {

    public final byte[] data;

    public final int padBits;

    public static final char[] table = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

    public static ASN1BitString fromInputStream(int arg0, InputStream arg1) throws IOException {
        if (arg0 < 1) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int var2 = arg1.read();
        byte[] var3 = new byte[arg0 - 1];
        if (var3.length != 0) {
            if (Streams.readFully(arg1, var3) != var3.length) {
                throw new EOFException("EOF encountered in middle of BIT STRING");
            }
            if (var2 > 0 && var2 < 8 && var3[var3.length - 1] != (byte) (var3[var3.length - 1] & 0xFF << var2)) {
                return new DLBitString(var3, var2);
            }
        }
        return new DERBitString(var3, var2);
    }

    public static byte[] getBytes(int arg0) {
        if (arg0 == 0) {
            return new byte[0];
        }
        int var1 = 4;
        for (int var2 = 3; var2 >= 1 && (arg0 & 0xFF << var2 * 8) == 0; var2--) {
            var1--;
        }
        byte[] var3 = new byte[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = (byte) (arg0 >> var4 * 8 & 0xFF);
        }
        return var3;
    }

    public ASN1BitString(byte[] arg0, int arg1) {
        if (arg0 == null) {
            throw new NullPointerException("data cannot be null");
        } else if (arg0.length == 0 && arg1 != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (arg1 <= 7 && arg1 >= 0) {
            this.data = Arrays.clone(arg0);
            this.padBits = arg1;
        } else {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
    }

    public String getString() {
        StringBuffer var1 = new StringBuffer("#");
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        ASN1OutputStream var3 = new ASN1OutputStream(var2);
        try {
            var3.writeObject(this);
        } catch (IOException var7) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + var7.getMessage(), var7);
        }
        byte[] var5 = var2.toByteArray();
        for (int var6 = 0; var6 != var5.length; var6++) {
            var1.append(table[var5[var6] >>> 4 & 0xF]);
            var1.append(table[var5[var6] & 0xF]);
        }
        return var1.toString();
    }

    public int getPadBits() {
        return this.padBits;
    }

    public byte[] getOctets() {
        if (this.padBits != 0) {
            throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
        }
        return Arrays.clone(this.data);
    }

    public String toString() {
        return this.getString();
    }

    public boolean asn1Equals(ASN1Primitive arg0) {
        if ((arg0 instanceof ASN1BitString)) {
            ASN1BitString var2 = (ASN1BitString) arg0;
            return this.padBits == var2.padBits && Arrays.areEqual(this.getBytes(), var2.getBytes());
        } else {
            return false;
        }
    }

    public static int getPadBits(int arg0) {
        int var1 = 0;
        for (int var2 = 3; var2 >= 0; var2--) {
            if (var2 == 0) {
                if (arg0 != 0) {
                    var1 = arg0 & 0xFF;
                    break;
                }
            } else if (arg0 >> var2 * 8 != 0) {
                var1 = arg0 >> var2 * 8 & 0xFF;
                break;
            }
        }
        if (var1 == 0) {
            return 0;
        }
        int var3 = 1;
        while (((var1 <<= 0x1) & 0xFF) != 0) {
            var3++;
        }
        return 8 - var3;
    }

    public int hashCode() {
        return this.padBits ^ Arrays.hashCode(this.getBytes());
    }

    public static byte[] derForm(byte[] arg0, int arg1) {
        byte[] var2 = Arrays.clone(arg0);
        if (arg1 > 0) {
            var2[arg0.length - 1] = (byte) (var2[arg0.length - 1] & 0xFF << arg1);
        }
        return var2;
    }

    public byte[] getBytes() {
        return derForm(this.data, this.padBits);
    }

    public ASN1Primitive getLoadedObject() {
        return this.toASN1Primitive();
    }

    public ASN1Primitive toDERObject() {
        return new DERBitString(this.data, this.padBits);
    }

    public ASN1Primitive toDLObject() {
        return new DLBitString(this.data, this.padBits);
    }

    public abstract void encode(ASN1OutputStream arg0) throws IOException;

    public int intValue() {
        int var1 = 0;
        byte[] var2 = this.data;
        if (this.padBits > 0 && this.data.length <= 4) {
            var2 = derForm(this.data, this.padBits);
        }
        for (int var3 = 0; var2.length != var3 && var3 != 4; var3++) {
            var1 |= (var2[var3] & 0xFF) << var3 * 8;
        }
        return var1;
    }

    public int ada() {
        return this.padBits ^ Arrays.hashCode(this.getBytes());
    }

    public int adh() {
        return this.padBits ^ Arrays.hashCode(this.getBytes());
    }

    public int adb() {
        return this.padBits ^ Arrays.hashCode(this.getBytes());
    }

    public String adi() {
        return this.getString();
    }

    public String adf() {
        return this.getString();
    }
}

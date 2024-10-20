package org.bouncycastle.util.encoders;

import java.io.IOException;
import java.io.OutputStream;

public class HexEncoder implements Encoder {

    public final byte[] encodingTable = new byte[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };

    public final byte[] decodingTable = new byte[128];

    public int decode(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        int var5 = 0;
        int var6;
        for (var6 = arg1 + arg2; var6 > arg1 && ignore((char) arg0[var6 - 1]); var6--) {
        }
        int var7 = arg1;
        while (var7 < var6) {
            while (var7 < var6 && ignore((char) arg0[var7])) {
                var7++;
            }
            byte var8 = this.decodingTable[arg0[var7++]];
            while (var7 < var6 && ignore((char) arg0[var7])) {
                var7++;
            }
            byte var9 = this.decodingTable[arg0[var7++]];
            if ((var8 | var9) < 0) {
                throw new IOException("invalid characters encountered in Hex data");
            }
            arg3.write(var8 << 4 | var9);
            var5++;
        }
        return var5;
    }

    public static boolean ignore(char arg0) {
        return arg0 == '\n' || arg0 == '\r' || arg0 == '\t' || arg0 == ' ';
    }

    public void initialiseDecodingTable() {
        for (int var1 = 0; var1 < this.decodingTable.length; var1++) {
            this.decodingTable[var1] = -1;
        }
        for (int var2 = 0; var2 < this.encodingTable.length; var2++) {
            this.decodingTable[this.encodingTable[var2]] = (byte) var2;
        }
        this.decodingTable[65] = this.decodingTable[97];
        this.decodingTable[66] = this.decodingTable[98];
        this.decodingTable[67] = this.decodingTable[99];
        this.decodingTable[68] = this.decodingTable[100];
        this.decodingTable[69] = this.decodingTable[101];
        this.decodingTable[70] = this.decodingTable[102];
    }

    public int encode(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        for (int var5 = arg1; var5 < arg1 + arg2; var5++) {
            int var6 = arg0[var5] & 0xFF;
            arg3.write(this.encodingTable[var6 >>> 4]);
            arg3.write(this.encodingTable[var6 & 0xF]);
        }
        return arg2 * 2;
    }

    public HexEncoder() {
        this.initialiseDecodingTable();
    }

    public int decode(String arg0, OutputStream arg1) throws IOException {
        int var3 = 0;
        int var4;
        for (var4 = arg0.length(); var4 > 0 && ignore(arg0.charAt(var4 - 1)); var4--) {
        }
        int var5 = 0;
        while (var5 < var4) {
            while (var5 < var4 && ignore(arg0.charAt(var5))) {
                var5++;
            }
            byte var6 = this.decodingTable[arg0.charAt(var5++)];
            while (var5 < var4 && ignore(arg0.charAt(var5))) {
                var5++;
            }
            byte var7 = this.decodingTable[arg0.charAt(var5++)];
            if ((var6 | var7) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            arg1.write(var6 << 4 | var7);
            var3++;
        }
        return var3;
    }
}

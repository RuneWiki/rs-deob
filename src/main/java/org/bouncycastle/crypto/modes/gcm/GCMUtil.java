package org.bouncycastle.crypto.modes.gcm;

import org.bouncycastle.util.Pack;

public abstract class GCMUtil {

    public static final int[] LOOKUP = generateLookup();

    public static final int E1 = -520093696;

    public static final long E1L = -2233785415175766016L;

    public static byte[] asBytes(long[] arg0) {
        byte[] var1 = new byte[16];
        Pack.longToBigEndian(arg0, var1, 0);
        return var1;
    }

    public static int[] generateLookup() {
        int[] var0 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            int var2 = 0;
            for (int var3 = 7; var3 >= 0; var3--) {
                if ((var1 & 0x1 << var3) != 0) {
                    var2 ^= 0xE1000000 >>> 7 - var3;
                }
            }
            var0[var1] = var2;
        }
        return var0;
    }

    public static void asBytes(int[] arg0, byte[] arg1) {
        Pack.intToBigEndian(arg0, arg1, 0);
    }

    public static byte[] oneAsBytes() {
        byte[] var0 = new byte[16];
        var0[0] = -128;
        return var0;
    }

    public static byte[] asBytes(int[] arg0) {
        byte[] var1 = new byte[16];
        Pack.intToBigEndian(arg0, var1, 0);
        return var1;
    }

    public static void asLongs(byte[] arg0, long[] arg1) {
        Pack.bigEndianToLong(arg0, 0, arg1);
    }

    public static void xor(int[] arg0, int[] arg1) {
        arg0[0] ^= arg1[0];
        arg0[1] ^= arg1[1];
        arg0[2] ^= arg1[2];
        arg0[3] ^= arg1[3];
    }

    public static void asBytes(long[] arg0, byte[] arg1) {
        Pack.longToBigEndian(arg0, arg1, 0);
    }

    public static int[] oneAsInts() {
        int[] var0 = new int[4];
        var0[0] = Integer.MIN_VALUE;
        return var0;
    }

    public static void asInts(byte[] arg0, int[] arg1) {
        Pack.bigEndianToInt(arg0, 0, arg1);
    }

    public static long[] asLongs(byte[] arg0) {
        long[] var1 = new long[2];
        Pack.bigEndianToLong(arg0, 0, var1);
        return var1;
    }

    public static void xor(byte[] arg0, byte[] arg1, byte[] arg2) {
        int var3 = 0;
        do {
            arg2[var3] = (byte) (arg0[var3] ^ arg1[var3]);
            var3++;
            arg2[var3] = (byte) (arg0[var3] ^ arg1[var3]);
            var3++;
            arg2[var3] = (byte) (arg0[var3] ^ arg1[var3]);
            var3++;
            arg2[var3] = (byte) (arg0[var3] ^ arg1[var3]);
            var3++;
        } while (var3 < 16);
    }

    public static long shiftRight(long[] arg0) {
        long var1 = arg0[0];
        arg0[0] = var1 >>> 1;
        long var3 = var1 << 63;
        long var5 = arg0[1];
        arg0[1] = var5 >>> 1 | var3;
        return var5 << 63;
    }

    public static void multiply(int[] arg0, int[] arg1) {
        int var2 = arg0[0];
        int var3 = arg0[1];
        int var4 = arg0[2];
        int var5 = arg0[3];
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = arg1[var10];
            for (int var12 = 0; var12 < 32; var12++) {
                int var13 = var11 >> 31;
                var11 <<= 0x1;
                var6 ^= var2 & var13;
                var7 ^= var3 & var13;
                var8 ^= var4 & var13;
                var9 ^= var5 & var13;
                int var14 = var5 << 31 >> 8;
                var5 = var5 >>> 1 | var4 << 31;
                var4 = var4 >>> 1 | var3 << 31;
                var3 = var3 >>> 1 | var2 << 31;
                var2 = var2 >>> 1 ^ var14 & 0xE1000000;
            }
        }
        arg0[0] = var6;
        arg0[1] = var7;
        arg0[2] = var8;
        arg0[3] = var9;
    }

    public static void multiply(long[] arg0, long[] arg1) {
        long var2 = arg0[0];
        long var4 = arg0[1];
        long var6 = 0L;
        long var8 = 0L;
        for (int var10 = 0; var10 < 2; var10++) {
            long var11 = arg1[var10];
            for (int var13 = 0; var13 < 64; var13++) {
                long var14 = var11 >> 63;
                var11 <<= 0x1;
                var6 ^= var2 & var14;
                var8 ^= var4 & var14;
                long var16 = var4 << 63 >> 8;
                var4 = var4 >>> 1 | var2 << 63;
                var2 = var2 >>> 1 ^ var16 & 0xE100000000000000L;
            }
        }
        arg0[0] = var6;
        arg0[1] = var8;
    }

    public static void xor(long[] arg0, long[] arg1, long[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
    }

    public static void multiplyP(int[] arg0, int[] arg1) {
        int var2 = shiftRight(arg0, arg1) >> 8;
        arg1[0] ^= var2 & 0xE1000000;
    }

    public static void multiplyP8(int[] arg0) {
        int var1 = shiftRightN(arg0, 8);
        arg0[0] ^= LOOKUP[var1 >>> 24];
    }

    public static void multiplyP8(int[] arg0, int[] arg1) {
        int var2 = shiftRightN(arg0, 8, arg1);
        arg1[0] ^= LOOKUP[var2 >>> 24];
    }

    public static int shiftRight(int[] arg0) {
        int var1 = arg0[0];
        arg0[0] = var1 >>> 1;
        int var2 = var1 << 31;
        int var3 = arg0[1];
        arg0[1] = var3 >>> 1 | var2;
        int var4 = var3 << 31;
        int var5 = arg0[2];
        arg0[2] = var5 >>> 1 | var4;
        int var6 = var5 << 31;
        int var7 = arg0[3];
        arg0[3] = var7 >>> 1 | var6;
        return var7 << 31;
    }

    public static int shiftRight(int[] arg0, int[] arg1) {
        int var2 = arg0[0];
        arg1[0] = var2 >>> 1;
        int var3 = var2 << 31;
        int var4 = arg0[1];
        arg1[1] = var4 >>> 1 | var3;
        int var5 = var4 << 31;
        int var6 = arg0[2];
        arg1[2] = var6 >>> 1 | var5;
        int var7 = var6 << 31;
        int var8 = arg0[3];
        arg1[3] = var8 >>> 1 | var7;
        return var8 << 31;
    }

    public static long shiftRight(long[] arg0, long[] arg1) {
        long var2 = arg0[0];
        arg1[0] = var2 >>> 1;
        long var4 = var2 << 63;
        long var6 = arg0[1];
        arg1[1] = var6 >>> 1 | var4;
        return var6 << 63;
    }

    public static int shiftRightN(int[] arg0, int arg1) {
        int var2 = arg0[0];
        int var3 = 32 - arg1;
        arg0[0] = var2 >>> arg1;
        int var4 = var2 << var3;
        int var5 = arg0[1];
        arg0[1] = var5 >>> arg1 | var4;
        int var6 = var5 << var3;
        int var7 = arg0[2];
        arg0[2] = var7 >>> arg1 | var6;
        int var8 = var7 << var3;
        int var9 = arg0[3];
        arg0[3] = var9 >>> arg1 | var8;
        return var9 << var3;
    }

    public static int shiftRightN(int[] arg0, int arg1, int[] arg2) {
        int var3 = arg0[0];
        int var4 = 32 - arg1;
        arg2[0] = var3 >>> arg1;
        int var5 = var3 << var4;
        int var6 = arg0[1];
        arg2[1] = var6 >>> arg1 | var5;
        int var7 = var6 << var4;
        int var8 = arg0[2];
        arg2[2] = var8 >>> arg1 | var7;
        int var9 = var8 << var4;
        int var10 = arg0[3];
        arg2[3] = var10 >>> arg1 | var9;
        return var10 << var4;
    }

    public static void xor(byte[] arg0, byte[] arg1) {
        int var2 = 0;
        do {
            arg0[var2] ^= arg1[var2];
            var2++;
            arg0[var2] ^= arg1[var2];
            var2++;
            arg0[var2] ^= arg1[var2];
            var2++;
            arg0[var2] ^= arg1[var2];
            var2++;
        } while (var2 < 16);
    }

    public static void xor(byte[] arg0, byte[] arg1, int arg2, int arg3) {
        while (true) {
            arg3--;
            if (arg3 < 0) {
                return;
            }
            arg0[arg3] ^= arg1[arg2 + arg3];
        }
    }

    public static void multiply(byte[] arg0, byte[] arg1) {
        int[] var2 = asInts(arg0);
        int[] var3 = asInts(arg1);
        multiply(var2, var3);
        asBytes(var2, arg0);
    }

    public static long[] oneAsLongs() {
        return new long[] { Long.MIN_VALUE, 0L };
    }

    public static void xor(int[] arg0, int[] arg1, int[] arg2) {
        arg2[0] = arg0[0] ^ arg1[0];
        arg2[1] = arg0[1] ^ arg1[1];
        arg2[2] = arg0[2] ^ arg1[2];
        arg2[3] = arg0[3] ^ arg1[3];
    }

    public static int[] asInts(byte[] arg0) {
        int[] var1 = new int[4];
        Pack.bigEndianToInt(arg0, 0, var1);
        return var1;
    }

    public static void xor(long[] arg0, long[] arg1) {
        arg0[0] ^= arg1[0];
        arg0[1] ^= arg1[1];
    }

    public static void multiplyP(int[] arg0) {
        int var1 = shiftRight(arg0) >> 8;
        arg0[0] ^= var1 & 0xE1000000;
    }
}

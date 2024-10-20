package org.bouncycastle.util;

public abstract class Pack {

    public static short bigEndianToShort(byte[] arg0, int arg1) {
        int var2 = (arg0[arg1] & 0xFF) << 8;
        int var4 = arg1 + 1;
        int var3 = var2 | arg0[var4] & 0xFF;
        return (short) var3;
    }

    public static byte[] longToBigEndian(long[] arg0) {
        byte[] var1 = new byte[arg0.length * 8];
        longToBigEndian(arg0, var1, 0);
        return var1;
    }

    public static int bigEndianToInt(byte[] arg0, int arg1) {
        int var2 = arg0[arg1] << 24;
        int var6 = arg1 + 1;
        int var3 = var2 | (arg0[var6] & 0xFF) << 16;
        int var7 = var6 + 1;
        int var4 = var3 | (arg0[var7] & 0xFF) << 8;
        int var8 = var7 + 1;
        return var4 | arg0[var8] & 0xFF;
    }

    public static short littleEndianToShort(byte[] arg0, int arg1) {
        int var2 = arg0[arg1] & 0xFF;
        int var4 = arg1 + 1;
        int var3 = var2 | (arg0[var4] & 0xFF) << 8;
        return (short) var3;
    }

    public static byte[] intToBigEndian(int arg0) {
        byte[] var1 = new byte[4];
        intToBigEndian(arg0, var1, 0);
        return var1;
    }

    public static void intToBigEndian(int arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) (arg0 >>> 24);
        int var3 = arg2 + 1;
        arg1[var3] = (byte) (arg0 >>> 16);
        int var4 = var3 + 1;
        arg1[var4] = (byte) (arg0 >>> 8);
        int var5 = var4 + 1;
        arg1[var5] = (byte) arg0;
    }

    public static byte[] intToBigEndian(int[] arg0) {
        byte[] var1 = new byte[arg0.length * 4];
        intToBigEndian(arg0, var1, 0);
        return var1;
    }

    public static byte[] longToLittleEndian(long[] arg0) {
        byte[] var1 = new byte[arg0.length * 8];
        longToLittleEndian(arg0, var1, 0);
        return var1;
    }

    public static long bigEndianToLong(byte[] arg0, int arg1) {
        int var2 = bigEndianToInt(arg0, arg1);
        int var3 = bigEndianToInt(arg0, arg1 + 4);
        return ((long) var2 & 0xFFFFFFFFL) << 32 | (long) var3 & 0xFFFFFFFFL;
    }

    public static void bigEndianToLong(byte[] arg0, int arg1, long[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            arg2[var3] = bigEndianToLong(arg0, arg1);
            arg1 += 8;
        }
    }

    public static void longToLittleEndian(long arg0, byte[] arg1, int arg2) {
        intToLittleEndian((int) (arg0 & 0xFFFFFFFFL), arg1, arg2);
        intToLittleEndian((int) (arg0 >>> 32), arg1, arg2 + 4);
    }

    public static void longToBigEndian(long arg0, byte[] arg1, int arg2) {
        intToBigEndian((int) (arg0 >>> 32), arg1, arg2);
        intToBigEndian((int) (arg0 & 0xFFFFFFFFL), arg1, arg2 + 4);
    }

    public static void bigEndianToInt(byte[] arg0, int arg1, int[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            arg2[var3] = bigEndianToInt(arg0, arg1);
            arg1 += 4;
        }
    }

    public static void longToBigEndian(long[] arg0, byte[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            longToBigEndian(arg0[var3], arg1, arg2);
            arg2 += 8;
        }
    }

    public static int littleEndianToInt(byte[] arg0, int arg1) {
        int var2 = arg0[arg1] & 0xFF;
        int var6 = arg1 + 1;
        int var3 = var2 | (arg0[var6] & 0xFF) << 8;
        int var7 = var6 + 1;
        int var4 = var3 | (arg0[var7] & 0xFF) << 16;
        int var8 = var7 + 1;
        return var4 | arg0[var8] << 24;
    }

    public static void littleEndianToInt(byte[] arg0, int arg1, int[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            arg2[var3] = littleEndianToInt(arg0, arg1);
            arg1 += 4;
        }
    }

    public static void littleEndianToInt(byte[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < arg4; var5++) {
            arg2[arg3 + var5] = littleEndianToInt(arg0, arg1);
            arg1 += 4;
        }
    }

    public static void littleEndianToLong(byte[] arg0, int arg1, long[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            arg2[var3] = littleEndianToLong(arg0, arg1);
            arg1 += 8;
        }
    }

    public static byte[] shortToLittleEndian(short arg0) {
        byte[] var1 = new byte[2];
        shortToLittleEndian(arg0, var1, 0);
        return var1;
    }

    public static void shortToLittleEndian(short arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) arg0;
        int var3 = arg2 + 1;
        arg1[var3] = (byte) (arg0 >>> 8);
    }

    public static byte[] intToLittleEndian(int arg0) {
        byte[] var1 = new byte[4];
        intToLittleEndian(arg0, var1, 0);
        return var1;
    }

    public static void intToLittleEndian(int arg0, byte[] arg1, int arg2) {
        arg1[arg2] = (byte) arg0;
        int var3 = arg2 + 1;
        arg1[var3] = (byte) (arg0 >>> 8);
        int var4 = var3 + 1;
        arg1[var4] = (byte) (arg0 >>> 16);
        int var5 = var4 + 1;
        arg1[var5] = (byte) (arg0 >>> 24);
    }

    public static byte[] intToLittleEndian(int[] arg0) {
        byte[] var1 = new byte[arg0.length * 4];
        intToLittleEndian(arg0, var1, 0);
        return var1;
    }

    public static void intToLittleEndian(int[] arg0, byte[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            intToLittleEndian(arg0[var3], arg1, arg2);
            arg2 += 4;
        }
    }

    public static long littleEndianToLong(byte[] arg0, int arg1) {
        int var2 = littleEndianToInt(arg0, arg1);
        int var3 = littleEndianToInt(arg0, arg1 + 4);
        return ((long) var3 & 0xFFFFFFFFL) << 32 | (long) var2 & 0xFFFFFFFFL;
    }

    public static int[] littleEndianToInt(byte[] arg0, int arg1, int arg2) {
        int[] var3 = new int[arg2];
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4] = littleEndianToInt(arg0, arg1);
            arg1 += 4;
        }
        return var3;
    }

    public static byte[] longToBigEndian(long arg0) {
        byte[] var2 = new byte[8];
        longToBigEndian(arg0, var2, 0);
        return var2;
    }

    public static byte[] longToLittleEndian(long arg0) {
        byte[] var2 = new byte[8];
        longToLittleEndian(arg0, var2, 0);
        return var2;
    }

    public static void intToBigEndian(int[] arg0, byte[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            intToBigEndian(arg0[var3], arg1, arg2);
            arg2 += 4;
        }
    }

    public static void longToLittleEndian(long[] arg0, byte[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg0.length; var3++) {
            longToLittleEndian(arg0[var3], arg1, arg2);
            arg2 += 8;
        }
    }
}

package org.bouncycastle.math.raw;

public class Interleave {

    public static final long M32 = 1431655765L;

    public static final long M64 = 6148914691236517205L;

    public static void expand64To128(long arg0, long[] arg1, int arg2) {
        long var4 = (arg0 ^ arg0 >>> 16) & 0xFFFF0000L;
        long var6 = arg0 ^ var4 ^ var4 << 16;
        long var8 = (var6 ^ var6 >>> 8) & 0xFF000000FF00L;
        long var10 = var6 ^ var8 ^ var8 << 8;
        long var12 = (var10 ^ var10 >>> 4) & 0xF000F000F000F0L;
        long var14 = var10 ^ var12 ^ var12 << 4;
        long var16 = (var14 ^ var14 >>> 2) & 0xC0C0C0C0C0C0C0CL;
        long var18 = var14 ^ var16 ^ var16 << 2;
        long var20 = (var18 ^ var18 >>> 1) & 0x2222222222222222L;
        long var22 = var18 ^ var20 ^ var20 << 1;
        arg1[arg2] = var22 & 0x5555555555555555L;
        arg1[arg2 + 1] = var22 >>> 1 & 0x5555555555555555L;
    }

    public static int expand16to32(int arg0) {
        int var1 = arg0 & 0xFFFF;
        int var2 = (var1 | var1 << 8) & 0xFF00FF;
        int var3 = (var2 | var2 << 4) & 0xF0F0F0F;
        int var4 = (var3 | var3 << 2) & 0x33333333;
        return (var4 | var4 << 1) & 0x55555555;
    }

    public static long expand32to64(int arg0) {
        int var1 = (arg0 ^ arg0 >>> 8) & 0xFF00;
        int var2 = arg0 ^ var1 ^ var1 << 8;
        int var3 = (var2 ^ var2 >>> 4) & 0xF000F0;
        int var4 = var2 ^ var3 ^ var3 << 4;
        int var5 = (var4 ^ var4 >>> 2) & 0xC0C0C0C;
        int var6 = var4 ^ var5 ^ var5 << 2;
        int var7 = (var6 ^ var6 >>> 1) & 0x22222222;
        int var8 = var6 ^ var7 ^ var7 << 1;
        return ((long) (var8 >>> 1) & 0x55555555L) << 32 | (long) var8 & 0x55555555L;
    }

    public static long unshuffle(long arg0) {
        long var2 = (arg0 ^ arg0 >>> 1) & 0x2222222222222222L;
        long var4 = arg0 ^ var2 ^ var2 << 1;
        long var6 = (var4 ^ var4 >>> 2) & 0xC0C0C0C0C0C0C0CL;
        long var8 = var4 ^ var6 ^ var6 << 2;
        long var10 = (var8 ^ var8 >>> 4) & 0xF000F000F000F0L;
        long var12 = var8 ^ var10 ^ var10 << 4;
        long var14 = (var12 ^ var12 >>> 8) & 0xFF000000FF00L;
        long var16 = var12 ^ var14 ^ var14 << 8;
        long var18 = (var16 ^ var16 >>> 16) & 0xFFFF0000L;
        return var16 ^ var18 ^ var18 << 16;
    }

    public static int expand8to16(int arg0) {
        int var1 = arg0 & 0xFF;
        int var2 = (var1 | var1 << 4) & 0xF0F;
        int var3 = (var2 | var2 << 2) & 0x3333;
        return (var3 | var3 << 1) & 0x5555;
    }
}

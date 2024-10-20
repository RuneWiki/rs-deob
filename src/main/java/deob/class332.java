package deob;

@ObfuscatedName("md")
public class class332 {

    @ObfuscatedName("md.ap")
    public static int[] field3610;

    static {
        new Object();
        field3610 = new int[33];
        field3610[0] = 0;
        int var0 = 2;
        for (int var1 = 1; var1 < 33; var1++) {
            field3610[var1] = var0 - 1;
            var0 += var0;
        }
    }

    public class332() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.ap(III)I")
    public static int method2442(int arg0, int arg1) {
        int var2 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var2 = arg0 * var2;
            }
            arg0 *= arg0;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg0 * var2;
        } else {
            return var2;
        }
    }

    @ObfuscatedName("cr.aw(II)I")
    public static int method2255(int arg0) {
        return field3610[arg0];
    }

    @ObfuscatedName("qj.ak(IB)I")
    public static int method7504(int arg0) {
        int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
        int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
        int var4 = (var3 >>> 8) + var3;
        int var5 = (var4 >>> 16) + var4;
        return var5 & 0xFF;
    }

    @ObfuscatedName("gx.aj(IIIB)I")
    public static int method3540(int arg0, int arg1, int arg2) {
        int var3 = method2255(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 & ~var4;
    }

    @ObfuscatedName("mr.ai(IIII)I")
    public static int method5946(int arg0, int arg1, int arg2) {
        int var3 = method2255(arg2 - arg1 + 1);
        int var4 = var3 << arg1;
        return arg0 | var4;
    }

    @ObfuscatedName("di.ay(II)I")
    public static int method2832(int arg0) {
        int var6 = arg0 - 1;
        int var1 = var6 | var6 >>> 1;
        int var2 = var1 | var1 >>> 2;
        int var3 = var2 | var2 >>> 4;
        int var4 = var3 | var3 >>> 8;
        int var5 = var4 | var4 >>> 16;
        return var5 + 1;
    }

    @ObfuscatedName("cg.as(II)I")
    public static int method1200(int arg0) {
        int var1 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var1 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var1 += 8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var1 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var1 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var1++;
        }
        return arg0 + var1;
    }

    @ObfuscatedName("lb.ae(IIII)I")
    public static int method5813(int arg0, int arg1, int arg2) {
        if (arg1 < arg0) {
            throw new IllegalArgumentException("max: " + arg1 + " can not be lower than min: " + arg0);
        }
        return Math.max(arg0, Math.min(arg2, arg1));
    }

    @ObfuscatedName("cx.am(FFFI)F")
    public static float method1218(float arg0, float arg1, float arg2) {
        if (arg1 < arg0) {
            throw new IllegalArgumentException("max: " + arg1 + " can not be lower than min: " + arg0);
        }
        return Math.max(arg0, Math.min(arg2, arg1));
    }

    @ObfuscatedName("ld.at(IIIIIIIIFFFB)F")
    public static float method5802(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8, float arg9, float arg10) {
        float var11 = (float) ((arg2 - arg4) * (arg6 - arg7) + (arg4 - arg3) * (arg5 - arg7));
        float var12 = (float) ((arg0 - arg4) * (arg6 - arg7) + (arg1 - arg7) * (arg4 - arg3)) / var11;
        float var13 = (float) ((arg0 - arg4) * (arg7 - arg5) + (arg1 - arg7) * (arg2 - arg4)) / var11;
        float var14 = 1.0F - var12 - var13;
        return arg10 * var14 + arg8 * var12 + arg9 * var13;
    }
}

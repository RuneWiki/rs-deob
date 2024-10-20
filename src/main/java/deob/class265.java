package deob;

@ObfuscatedName("kn")
public class class265 {

    @ObfuscatedName("kn.ak")
    public static boolean field2950 = false;

    @ObfuscatedName("kn.al")
    public static int field2946 = 0;

    @ObfuscatedName("kn.aj")
    public static int field2947 = 0;

    @ObfuscatedName("kn.az")
    public static boolean field2955 = false;

    @ObfuscatedName("kn.ap")
    public static int field2956 = 0;

    @ObfuscatedName("kn.ae")
    public static long[] field2949 = new long[1000];

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hk.ak(I)I")
    public static int method3569() {
        return field2956;
    }

    @ObfuscatedName("lr.aj(J)I")
    public static int method5518(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("ev.az(J)I")
    public static int method2640(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("cv.af(J)Z")
    public static boolean method2020(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("en.aa(J)I")
    public static int method2622(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("lg.at(II)I")
    public static int method5430(int arg0) {
        return method4072(field2949[arg0]);
    }

    @ObfuscatedName("ih.ab(J)I")
    public static int method4072(long arg0) {
        return (int) (arg0 >>> 49 & 0x7FFL);
    }

    @ObfuscatedName("ho.ac(IIIZIIB)J")
    public static long method3598(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        long var6 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17 | ((long) arg5 & 0x7FFL) << 49;
        if (arg3) {
            var6 |= 0x10000L;
        }
        return var6;
    }

    @ObfuscatedName("kl.ao(III)V")
    public static final void method4787(int arg0, int arg1) {
        field2946 = arg0;
        field2947 = arg1;
        field2950 = true;
        field2956 = 0;
        field2955 = false;
    }

    @ObfuscatedName("fx.ah(I)V")
    public static final void method3044() {
        field2950 = false;
        field2956 = 0;
    }

    @ObfuscatedName("dx.av(B)Z")
    public static final boolean method2512() {
        return field2950;
    }

    @ObfuscatedName("av.aq(IIIII)V")
    public static final void method102(int arg0, int arg1, int arg2, int arg3) {
        if (field2955) {
            return;
        }
        byte var8 = 50;
        int var9 = class251.method4492();
        int var10 = (field2946 - class248.method4352()) * var8 / class248.method4339();
        int var11 = (field2947 - class248.method4335()) * var8 / class248.method4339();
        int var12 = (field2946 - class248.method4352()) * var9 / class248.method4339();
        int var13 = (field2947 - class248.method4335()) * var9 / class248.method4339();
        int var14 = class263.method2989(var11, var8, arg1, arg0);
        int var15 = arg1 * var8 - arg0 * var11 >> 16;
        int var18 = class263.method2989(var13, var9, arg1, arg0);
        int var19 = arg1 * var9 - arg0 * var13 >> 16;
        int var22 = arg3 * var10 - arg2 * var15 >> 16;
        int var24 = arg2 * var10 + arg3 * var15 >> 16;
        int var27 = arg3 * var12 - arg2 * var19 >> 16;
        int var29 = arg2 * var12 + arg3 * var19 >> 16;
        Statics.field2948 = (var22 + var27) / 2;
        Statics.field3736 = (var14 + var18) / 2;
        Statics.field1530 = (var24 + var29) / 2;
        Statics.field2945 = (var27 - var22) / 2;
        Statics.field3706 = (var18 - var14) / 2;
        Statics.field2951 = (var29 - var24) / 2;
        Statics.field2952 = Math.abs(Statics.field2945);
        Statics.field2953 = Math.abs(Statics.field3706);
        Statics.field2954 = Math.abs(Statics.field2951);
    }

    @ObfuscatedName("gx.ap(Lkb;IIIIIIIIB)Z")
    public static final boolean method3189(class264 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!method2512()) {
            return false;
        }
        method102(arg5, arg6, arg7, arg8);
        class255 var9 = (class255) arg0.field2913.get(arg1);
        int var10 = var9.field2799 + arg2;
        int var11 = var9.field2798 + arg3;
        int var12 = var9.field2797 + arg4;
        int var13 = var9.field2800;
        int var14 = var9.field2796;
        int var15 = var9.field2795;
        int var16 = Statics.field2948 - var10;
        int var17 = Statics.field3736 - var11;
        int var18 = Statics.field1530 - var12;
        if (Math.abs(var16) > Statics.field2952 + var13) {
            return false;
        } else if (Math.abs(var17) > Statics.field2953 + var14) {
            return false;
        } else if (Math.abs(var18) > Statics.field2954 + var15) {
            return false;
        } else if (Math.abs(Statics.field3706 * var18 - Statics.field2951 * var17) > Statics.field2954 * var14 + Statics.field2953 * var15) {
            return false;
        } else if (Math.abs(Statics.field2951 * var16 - Statics.field2945 * var18) > Statics.field2954 * var13 + Statics.field2952 * var15) {
            return false;
        } else {
            return Math.abs(Statics.field2945 * var17 - Statics.field3706 * var16) <= Statics.field2953 * var13 + Statics.field2952 * var14;
        }
    }
}

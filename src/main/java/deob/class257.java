package deob;

@ObfuscatedName("jr")
public class class257 {

    @ObfuscatedName("jr.ap")
    public static boolean field2896 = false;

    @ObfuscatedName("jr.aw")
    public static int field2890 = 0;

    @ObfuscatedName("jr.ak")
    public static int field2894 = 0;

    @ObfuscatedName("jr.aj")
    public static boolean field2892 = false;

    @ObfuscatedName("jr.af")
    public static class427 field2898 = new class427();

    @ObfuscatedName("jr.ar")
    public static int field2889 = 0;

    @ObfuscatedName("jr.ab")
    public static long[] field2900 = new long[1000];

    public class257() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("tm.ap(I)I")
    public static int method8659() {
        return field2889;
    }

    @ObfuscatedName("pl.aw(J)Z")
    public static boolean method7140(long arg0) {
        return arg0 != 0L && !Statics.method3790(arg0);
    }

    @ObfuscatedName("gt.ak(IB)I")
    public static int method3583(int arg0) {
        return method3216(field2900[arg0]);
    }

    @ObfuscatedName("fu.aj(J)I")
    public static int method3216(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("rj.ai(II)I")
    public static int method8056(int arg0) {
        return method7176(field2900[arg0]);
    }

    @ObfuscatedName("pj.ay(J)I")
    public static int method7176(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("la.ae(J)I")
    public static int method5896(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("ll.am(II)I")
    public static int method5850(int arg0) {
        long var1 = field2900[arg0];
        return (int) (var1 >>> 49 & 0x7FFL);
    }

    @ObfuscatedName("fd.at(IIIZIIB)J")
    public static long method3345(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        long var6 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17 | ((long) arg5 & 0x7FFL) << 49;
        if (arg3) {
            var6 |= 0x10000L;
        }
        return var6;
    }

    @ObfuscatedName("ix.au(J)V")
    public static final void method4217(long arg0) {
        field2900[++field2889 - 1] = arg0;
    }

    @ObfuscatedName("ei.an(I)I")
    public static final int method3114() {
        return field2890;
    }

    @ObfuscatedName("cw.ao(B)I")
    public static final int method2241() {
        return field2894;
    }

    @ObfuscatedName("ex.af(IIIIB)V")
    public static final void method3091(int arg0, int arg1, int arg2, int arg3) {
        if (field2892) {
            return;
        }
        byte var8 = 50;
        int var9 = class243.method4649();
        int var10 = (field2890 - class240.method4498()) * var8 / class240.method4504();
        int var11 = (field2894 - class240.method4499()) * var8 / class240.method4504();
        int var12 = (field2890 - class240.method4498()) * var9 / class240.method4504();
        int var13 = (field2894 - class240.method4499()) * var9 / class240.method4504();
        int var14 = class255.method3529(var11, var8, arg1, arg0);
        int var15 = arg1 * var8 - arg0 * var11 >> 16;
        int var18 = class255.method3529(var13, var9, arg1, arg0);
        int var19 = arg1 * var9 - arg0 * var13 >> 16;
        int var22 = arg3 * var10 - arg2 * var15 >> 16;
        int var24 = arg2 * var10 + arg3 * var15 >> 16;
        int var27 = arg3 * var12 - arg2 * var19 >> 16;
        int var29 = arg2 * var12 + arg3 * var19 >> 16;
        Statics.field2893 = (var22 + var27) / 2;
        Statics.field2899 = (var14 + var18) / 2;
        Statics.field2891 = (var24 + var29) / 2;
        Statics.field2895 = (var27 - var22) / 2;
        Statics.field2751 = (var18 - var14) / 2;
        Statics.field4766 = (var29 - var24) / 2;
        Statics.field2897 = Math.abs(Statics.field2895);
        Statics.field1884 = Math.abs(Statics.field2751);
        Statics.field5316 = Math.abs(Statics.field4766);
        field2898.method7566((float) (var27 - var22), (float) (var18 - var14), (float) (var29 - var24));
        field2898.method7538();
        field2892 = true;
    }

    @ObfuscatedName("du.ar(Ljy;IIIIIIIII)Z")
    public static final boolean method2446(class256 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        boolean var9 = field2896;
        if (!var9) {
            return false;
        }
        method3091(arg5, arg6, arg7, arg8);
        class247 var10 = (class247) arg0.field2867.get(arg1);
        int var11 = var10.field2742 + arg2;
        int var12 = var10.field2738 + arg3;
        int var13 = var10.field2737 + arg4;
        int var14 = var10.field2740;
        int var15 = var10.field2741;
        int var16 = var10.field2739;
        int var17 = Statics.field2893 - var11;
        int var18 = Statics.field2899 - var12;
        int var19 = Statics.field2891 - var13;
        if (Math.abs(var17) > Statics.field2897 + var14) {
            return false;
        } else if (Math.abs(var18) > Statics.field1884 + var15) {
            return false;
        } else if (Math.abs(var19) > Statics.field5316 + var16) {
            return false;
        } else if (Math.abs(Statics.field2751 * var19 - Statics.field4766 * var18) > Statics.field5316 * var15 + Statics.field1884 * var16) {
            return false;
        } else if (Math.abs(Statics.field4766 * var17 - Statics.field2895 * var19) > Statics.field5316 * var14 + Statics.field2897 * var16) {
            return false;
        } else {
            return Math.abs(Statics.field2895 * var18 - Statics.field2751 * var17) <= Statics.field2897 * var15 + Statics.field1884 * var14;
        }
    }

    @ObfuscatedName("aq.ab(IIIIIIIB)Z")
    public static final boolean method318(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2894 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2894 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2890 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2890 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }

    @ObfuscatedName("gs.az(IIIIB)Lqt;")
    public static final class427 method3586(int arg0, int arg1, int arg2, int arg3) {
        float var4 = 1.0E-5F;
        class427 var5 = class427.method1235((float) arg1, (float) arg2, (float) arg3);
        class427 var6 = class427.method1235(0.0F, (float) arg0, 0.0F);
        class427 var7 = class427.method1235(0.0F, 1.0F, 0.0F);
        class427 var8 = field2898;
        float var9 = var7.method7542(var8);
        if (Math.abs(var9) < 1.0E-5F) {
            return null;
        }
        class427[] var11 = class427.field4769;
        class427 var12;
        synchronized (class427.field4769) {
            if (class427.field4771 == 0) {
                var12 = new class427(var5);
            } else {
                class427.field4769[--class427.field4771].method7535(var5);
                var12 = class427.field4769[class427.field4771];
            }
        }
        var12.method7562(var6);
        float var17 = -class427.method4240(var7, var12) / var9;
        if (var17 < 0.0F) {
            return null;
        }
        var5.method7534();
        var6.method7534();
        var7.method7534();
        var12.method7534();
        return class427.method4942(var5, class427.method6987(field2898, var17));
    }
}

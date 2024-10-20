package deob;

@ObfuscatedName("gd")
public class class208 {

    @ObfuscatedName("gd.s")
    public static boolean field2490 = false;

    @ObfuscatedName("gd.t")
    public static int field2488 = 0;

    @ObfuscatedName("gd.v")
    public static int field2476 = 0;

    @ObfuscatedName("gd.j")
    public static boolean field2477 = false;

    @ObfuscatedName("gd.k")
    public static int field2484 = 0;

    @ObfuscatedName("gd.a")
    public static long[] field2485 = new long[1000];

    public class208() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.s(I)I")
    public static int method1858() {
        return field2484;
    }

    @ObfuscatedName("ga.t(J)Z")
    public static boolean method3736(long arg0) {
        return method4388(arg0) == 2;
    }

    @ObfuscatedName("gj.v(IB)I")
    public static int method3537(int arg0) {
        return Statics.method816(field2485[arg0]);
    }

    @ObfuscatedName("jj.l(II)I")
    public static int method4605(int arg0) {
        long var1 = field2485[arg0];
        return (int) (var1 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("cl.n(J)I")
    public static int method1885(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("jz.w(J)I")
    public static int method4388(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("cb.f(J)I")
    public static int method1867(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("fe.o(IIIZIB)J")
    public static long method3213(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("bu.x(I)V")
    public static final void method1690() {
        field2490 = false;
        field2484 = 0;
    }

    @ObfuscatedName("gk.r(I)Z")
    public static final boolean method3274() {
        return field2490;
    }

    @ObfuscatedName("cm.p(S)I")
    public static final int method2045() {
        return field2476;
    }

    @ObfuscatedName("dl.h(Lgl;IIIB)Z")
    public static final boolean method2279(class207 arg0, int arg1, int arg2, int arg3) {
        if (!method3274()) {
            return false;
        }
        if (!field2477) {
            int var4 = Statics.field2327;
            int var5 = Statics.field2306;
            int var6 = Statics.field2291;
            int var7 = Statics.field2289;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field2488 - Statics.field2259) * var8 / class198.field2262;
            int var11 = (field2476 - Statics.field2260) * var8 / class198.field2262;
            int var12 = (field2488 - Statics.field2259) * var9 / class198.field2262;
            int var13 = (field2476 - Statics.field2260) * var9 / class198.field2262;
            int var14 = class198.method3494(var11, var8, var5, var4);
            int var15 = class198.method3479(var11, var8, var5, var4);
            int var17 = class198.method3494(var13, var9, var5, var4);
            int var18 = class198.method3479(var13, var9, var5, var4);
            int var20 = class198.method3506(var10, var15, var7, var6);
            int var21 = class198.method3477(var10, var15, var7, var6);
            int var23 = class198.method3506(var12, var18, var7, var6);
            int var24 = class198.method3477(var12, var18, var7, var6);
            Statics.field2478 = (var20 + var23) / 2;
            Statics.field2479 = (var14 + var17) / 2;
            Statics.field3629 = (var21 + var24) / 2;
            Statics.field2480 = (var23 - var20) / 2;
            Statics.field2481 = (var17 - var14) / 2;
            Statics.field2482 = (var24 - var21) / 2;
            Statics.field373 = Math.abs(Statics.field2480);
            Statics.field4260 = Math.abs(Statics.field2481);
            Statics.field2483 = Math.abs(Statics.field2482);
        }
        int var26 = arg0.field2413 + arg1;
        int var27 = arg0.field2437 + arg2;
        int var28 = arg0.field2438 + arg3;
        int var29 = arg0.field2439;
        int var30 = arg0.field2407;
        int var31 = arg0.field2411;
        int var32 = Statics.field2478 - var26;
        int var33 = Statics.field2479 - var27;
        int var34 = Statics.field3629 - var28;
        if (Math.abs(var32) > Statics.field373 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field4260 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field2483 + var31) {
            return false;
        } else if (Math.abs(Statics.field2481 * var34 - Statics.field2482 * var33) > Statics.field4260 * var31 + Statics.field2483 * var30) {
            return false;
        } else if (Math.abs(Statics.field2482 * var32 - Statics.field2480 * var34) > Statics.field373 * var31 + Statics.field2483 * var29) {
            return false;
        } else {
            return Math.abs(Statics.field2480 * var33 - Statics.field2481 * var32) <= Statics.field4260 * var29 + Statics.field373 * var30;
        }
    }

    @ObfuscatedName("jb.k(IIIIIIII)Z")
    public static final boolean method4542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2476 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2476 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2488 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2488 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

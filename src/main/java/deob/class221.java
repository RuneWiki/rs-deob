package deob;

@ObfuscatedName("hq")
public class class221 {

    @ObfuscatedName("hq.l")
    public static boolean field2578 = false;

    @ObfuscatedName("hq.q")
    public static int field2576 = 0;

    @ObfuscatedName("hq.f")
    public static int field2575 = 0;

    @ObfuscatedName("hq.j")
    public static boolean field2579 = false;

    @ObfuscatedName("hq.v")
    public static int field2582 = 0;

    @ObfuscatedName("hq.s")
    public static long[] field2583 = new long[1000];

    public class221() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dq.l(B)I")
    public static int method2351() {
        return field2582;
    }

    @ObfuscatedName("ca.q(J)Z")
    public static boolean method1970(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("a.f(J)Z")
    public static boolean method57(long arg0) {
        return arg0 != 0L && !method2501(arg0);
    }

    @ObfuscatedName("gy.j(II)J")
    public static long method3572(int arg0) {
        return field2583[arg0];
    }

    @ObfuscatedName("ok.m(II)I")
    public static int method6534(int arg0) {
        return method4595(field2583[arg0]);
    }

    @ObfuscatedName("jt.k(J)I")
    public static int method4595(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("fa.t(J)I")
    public static int method3072(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("ee.a(J)Z")
    public static boolean method2501(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("ct.e(J)I")
    public static int method1972(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("io.i(IIIZIB)J")
    public static long method4293(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("bh.y(III)V")
    public static final void method1801(int arg0, int arg1) {
        field2576 = arg0;
        field2575 = arg1;
        field2578 = true;
        field2582 = 0;
        field2579 = false;
    }

    @ObfuscatedName("ay.w(B)Z")
    public static final boolean method503() {
        return field2578;
    }

    @ObfuscatedName("cw.g(S)I")
    public static final int method2131() {
        return field2576;
    }

    @ObfuscatedName("fd.v(B)I")
    public static final int method2896() {
        return field2575;
    }

    @ObfuscatedName("cp.s(B)V")
    public static final void method2062() {
        if (field2579) {
            return;
        }
        int var0 = Statics.field2408;
        int var1 = Statics.field2409;
        int var2 = Statics.field2410;
        int var3 = Statics.field2411;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2576 - Statics.field2358) * var4 / class211.field2357;
        int var7 = (field2575 - Statics.field2354) * var4 / class211.field2357;
        int var8 = (field2576 - Statics.field2358) * var5 / class211.field2357;
        int var9 = (field2575 - Statics.field2354) * var5 / class211.field2357;
        int var10 = class211.method3768(var7, var4, var1, var0);
        int var11 = class211.method3810(var7, var4, var1, var0);
        int var13 = class211.method3768(var9, var5, var1, var0);
        int var14 = class211.method3810(var9, var5, var1, var0);
        int var16 = class211.method3766(var6, var11, var3, var2);
        int var17 = class211.method3752(var6, var11, var3, var2);
        int var19 = class211.method3766(var8, var14, var3, var2);
        int var20 = class211.method3752(var8, var14, var3, var2);
        Statics.field1427 = (var16 + var19) / 2;
        Statics.field2586 = (var10 + var13) / 2;
        Statics.field3213 = (var17 + var20) / 2;
        Statics.field1589 = (var19 - var16) / 2;
        Statics.field2580 = (var13 - var10) / 2;
        Statics.field1413 = (var20 - var17) / 2;
        Statics.field830 = Math.abs(Statics.field1589);
        Statics.field2581 = Math.abs(Statics.field2580);
        Statics.field99 = Math.abs(Statics.field1413);
    }

    @ObfuscatedName("s.c(Lhl;IIIB)Z")
    public static final boolean method172(class220 arg0, int arg1, int arg2, int arg3) {
        if (!method503()) {
            return false;
        }
        method2062();
        int var4 = arg0.field2506 + arg1;
        int var5 = arg0.field2538 + arg2;
        int var6 = arg0.field2523 + arg3;
        int var7 = arg0.field2535;
        int var8 = arg0.field2541;
        int var9 = arg0.field2542;
        int var10 = Statics.field1427 - var4;
        int var11 = Statics.field2586 - var5;
        int var12 = Statics.field3213 - var6;
        if (Math.abs(var10) > Statics.field830 + var7) {
            return false;
        } else if (Math.abs(var11) > Statics.field2581 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field99 + var9) {
            return false;
        } else if (Math.abs(Statics.field2580 * var12 - Statics.field1413 * var11) > Statics.field99 * var8 + Statics.field2581 * var9) {
            return false;
        } else if (Math.abs(Statics.field1413 * var10 - Statics.field1589 * var12) > Statics.field99 * var7 + Statics.field830 * var9) {
            return false;
        } else {
            return Math.abs(Statics.field1589 * var11 - Statics.field2580 * var10) <= Statics.field830 * var8 + Statics.field2581 * var7;
        }
    }
}

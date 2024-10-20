package deob;

@ObfuscatedName("gy")
public class class206 {

    @ObfuscatedName("gy.v")
    public static boolean field2494 = false;

    @ObfuscatedName("gy.n")
    public static int field2499 = 0;

    @ObfuscatedName("gy.f")
    public static int field2495 = 0;

    @ObfuscatedName("gy.y")
    public static boolean field2496 = false;

    @ObfuscatedName("gy.c")
    public static int field2500 = 0;

    @ObfuscatedName("gy.e")
    public static long[] field2501 = new long[1000];

    public class206() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.v(I)I")
    public static int method2843() {
        return field2500;
    }

    @ObfuscatedName("dy.n(J)Z")
    public static boolean method2219(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("et.f(II)J")
    public static long method2485(int arg0) {
        return field2501[arg0];
    }

    @ObfuscatedName("j.y(IB)I")
    public static int method49(int arg0) {
        return method2395(field2501[arg0]);
    }

    @ObfuscatedName("ex.p(J)I")
    public static int method2395(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("bk.j(II)I")
    public static int method1005(int arg0) {
        return method3982(field2501[arg0]);
    }

    @ObfuscatedName("hu.r(J)I")
    public static int method3982(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("jw.b(IB)I")
    public static int method4403(int arg0) {
        long var1 = field2501[arg0];
        return (int) (var1 >>> 14 & 0x3L);
    }

    @ObfuscatedName("av.s(IIIZII)J")
    public static long method281(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("ed.u(IIB)V")
    public static final void method2364(int arg0, int arg1) {
        field2499 = arg0;
        field2495 = arg1;
        field2494 = true;
        field2500 = 0;
        field2496 = false;
    }

    @ObfuscatedName("cv.l(I)V")
    public static final void method1723() {
        field2494 = false;
        field2500 = 0;
    }

    @ObfuscatedName("cy.o(J)V")
    public static final void method1990(long arg0) {
        field2501[++field2500 - 1] = arg0;
    }

    @ObfuscatedName("dq.c(I)I")
    public static final int method2283() {
        return field2499;
    }

    @ObfuscatedName("di.e(I)I")
    public static final int method2093() {
        return field2495;
    }

    @ObfuscatedName("ec.g(I)V")
    public static final void method2322() {
        if (field2496) {
            return;
        }
        int var0 = Statics.field2319;
        int var1 = Statics.field2320;
        int var2 = Statics.field2321;
        int var3 = Statics.field2322;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2499 - Statics.field2272) * var4 / class196.field2271;
        int var7 = (field2495 - Statics.field2265) * var4 / class196.field2271;
        int var8 = (field2499 - Statics.field2272) * var5 / class196.field2271;
        int var9 = (field2495 - Statics.field2265) * var5 / class196.field2271;
        int var10 = class196.method3513(var7, var4, var1, var0);
        int var11 = class196.method3543(var7, var4, var1, var0);
        int var13 = class196.method3513(var9, var5, var1, var0);
        int var14 = class196.method3543(var9, var5, var1, var0);
        int var16 = class196.method3511(var6, var11, var3, var2);
        int var17 = class196.method3512(var6, var11, var3, var2);
        int var19 = class196.method3511(var8, var14, var3, var2);
        int var20 = class196.method3512(var8, var14, var3, var2);
        Statics.field2493 = (var16 + var19) / 2;
        Statics.field3119 = (var10 + var13) / 2;
        Statics.field2498 = (var17 + var20) / 2;
        Statics.field2497 = (var19 - var16) / 2;
        Statics.field2083 = (var13 - var10) / 2;
        Statics.field3127 = (var20 - var17) / 2;
        Statics.field1921 = Math.abs(Statics.field2497);
        Statics.field141 = Math.abs(Statics.field2083);
        Statics.field630 = Math.abs(Statics.field3127);
    }

    @ObfuscatedName("ck.a(IIIIIIII)Z")
    public static final boolean method1868(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2495 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2495 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2499 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2499 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

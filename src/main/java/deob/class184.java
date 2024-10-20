package deob;

@ObfuscatedName("gj")
public class class184 {

    @ObfuscatedName("gj.f")
    public static boolean field2140 = false;

    @ObfuscatedName("gj.o")
    public static int field2133 = 0;

    @ObfuscatedName("gj.u")
    public static int field2134 = 0;

    @ObfuscatedName("gj.p")
    public static boolean field2135 = false;

    @ObfuscatedName("gj.c")
    public static int field2139 = 0;

    @ObfuscatedName("gj.j")
    public static long[] field2132 = new long[1000];

    public class184() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.f(I)I")
    public static int method2204() {
        return field2139;
    }

    @ObfuscatedName("w.o(J)Z")
    public static boolean method192(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("cg.u(J)I")
    public static int method1708(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ab.p(II)I")
    public static int method343(int arg0) {
        long var1 = field2132[arg0];
        return (int) (var1 >>> 14 & 0x3L);
    }

    @ObfuscatedName("l.b(J)Z")
    public static boolean method84(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("x.e(IB)I")
    public static int method181(int arg0) {
        return method2752(field2132[arg0]);
    }

    @ObfuscatedName("ff.k(J)I")
    public static int method2752(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("dy.g(IIIZII)J")
    public static long method1978(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("fh.h(I)Z")
    public static final boolean method3193() {
        return field2140;
    }

    @ObfuscatedName("dd.n(I)I")
    public static final int method2251() {
        return field2134;
    }

    @ObfuscatedName("ea.l(I)V")
    public static final void method2728() {
        if (field2135) {
            return;
        }
        int var0 = Statics.field1958;
        int var1 = Statics.field1961;
        int var2 = Statics.field1960;
        int var3 = Statics.field1939;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2133 - Statics.field1908) * var4 / class174.field1912;
        int var7 = (field2134 - Statics.field1911) * var4 / class174.field1912;
        int var8 = (field2133 - Statics.field1908) * var5 / class174.field1912;
        int var9 = (field2134 - Statics.field1911) * var5 / class174.field1912;
        int var10 = class174.method2964(var7, var4, var1, var0);
        int var11 = class174.method2931(var7, var4, var1, var0);
        int var13 = class174.method2964(var9, var5, var1, var0);
        int var14 = class174.method2931(var9, var5, var1, var0);
        int var16 = class174.method2943(var6, var11, var3, var2);
        int var17 = class174.method2944(var6, var11, var3, var2);
        int var19 = class174.method2943(var8, var14, var3, var2);
        int var20 = class174.method2944(var8, var14, var3, var2);
        Statics.field1440 = (var16 + var19) / 2;
        Statics.field2545 = (var10 + var13) / 2;
        Statics.field1569 = (var17 + var20) / 2;
        Statics.field2136 = (var19 - var16) / 2;
        Statics.field2137 = (var13 - var10) / 2;
        Statics.field2581 = (var20 - var17) / 2;
        Statics.field1019 = Math.abs(Statics.field2136);
        Statics.field2138 = Math.abs(Statics.field2137);
        Statics.field190 = Math.abs(Statics.field2581);
    }

    @ObfuscatedName("jb.m(IIIIIIII)Z")
    public static final boolean method4140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2134 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2134 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2133 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2133 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

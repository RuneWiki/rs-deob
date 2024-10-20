package deob;

@ObfuscatedName("in")
public class class242 {

    @ObfuscatedName("in.v")
    public static boolean field2799 = false;

    @ObfuscatedName("in.c")
    public static int field2800 = 0;

    @ObfuscatedName("in.i")
    public static int field2801 = 0;

    @ObfuscatedName("in.f")
    public static boolean field2802 = false;

    @ObfuscatedName("in.k")
    public static int field2807 = 0;

    @ObfuscatedName("in.d")
    public static long[] field2808 = new long[1000];

    public class242() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gh.v(I)I")
    public static int method3281() {
        return field2807;
    }

    @ObfuscatedName("bb.c(IB)I")
    public static int method1589(int arg0) {
        long var1 = field2808[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("hp.i(J)I")
    public static int method4114(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("im.f(IS)I")
    public static int method4452(int arg0) {
        return method2963(field2808[arg0]);
    }

    @ObfuscatedName("fm.b(J)I")
    public static int method2963(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("iy.n(IIIZIB)J")
    public static long method4607(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("cv.s(I)V")
    public static final void method2010() {
        field2799 = false;
        field2807 = 0;
    }

    @ObfuscatedName("e.l(J)V")
    public static final void method345(long arg0) {
        field2808[++field2807 - 1] = arg0;
    }

    @ObfuscatedName("df.q(I)I")
    public static final int method2619() {
        return field2801;
    }

    @ObfuscatedName("gk.o(B)V")
    public static final void method3890() {
        if (field2802) {
            return;
        }
        int var0 = Statics.field2615;
        int var1 = Statics.field2619;
        int var2 = Statics.field2620;
        int var3 = Statics.field2621;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2800 - Statics.field2552) * var4 / class231.field2562;
        int var7 = (field2801 - Statics.field2564) * var4 / class231.field2562;
        int var8 = (field2800 - Statics.field2552) * var5 / class231.field2562;
        int var9 = (field2801 - Statics.field2564) * var5 / class231.field2562;
        int var10 = class231.method4178(var7, var4, var1, var0);
        int var11 = class231.method4152(var7, var4, var1, var0);
        int var13 = class231.method4178(var9, var5, var1, var0);
        int var14 = class231.method4152(var9, var5, var1, var0);
        int var16 = class231.method4149(var6, var11, var3, var2);
        int var17 = class231.method4150(var6, var11, var3, var2);
        int var19 = class231.method4149(var8, var14, var3, var2);
        int var20 = class231.method4150(var8, var14, var3, var2);
        Statics.field2665 = (var16 + var19) / 2;
        Statics.field2077 = (var10 + var13) / 2;
        Statics.field2803 = (var17 + var20) / 2;
        Statics.field2806 = (var19 - var16) / 2;
        Statics.field2805 = (var13 - var10) / 2;
        Statics.field96 = (var20 - var17) / 2;
        Statics.field36 = Math.abs(Statics.field2806);
        Statics.field2809 = Math.abs(Statics.field2805);
        Statics.field2205 = Math.abs(Statics.field96);
    }

    @ObfuscatedName("ei.r(IIIIIIII)Z")
    public static final boolean method2719(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2801 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2801 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2800 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2800 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

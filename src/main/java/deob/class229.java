package deob;

@ObfuscatedName("hu")
public class class229 {

    @ObfuscatedName("hu.f")
    public static boolean field2752 = false;

    @ObfuscatedName("hu.w")
    public static int field2751 = 0;

    @ObfuscatedName("hu.v")
    public static int field2747 = 0;

    @ObfuscatedName("hu.s")
    public static boolean field2748 = false;

    @ObfuscatedName("hu.m")
    public static int field2749 = 0;

    @ObfuscatedName("hu.t")
    public static long[] field2750 = new long[1000];

    public class229() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.f(J)Z")
    public static boolean method3016(long arg0) {
        return method2847(arg0) == 2;
    }

    @ObfuscatedName("ht.w(II)J")
    public static long method4491(int arg0) {
        return field2750[arg0];
    }

    @ObfuscatedName("cn.v(IB)I")
    public static int method2597(int arg0) {
        return method4494(field2750[arg0]);
    }

    @ObfuscatedName("ij.s(J)I")
    public static int method4494(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("gk.z(IB)I")
    public static int method3333(int arg0) {
        return method2993(field2750[arg0]);
    }

    @ObfuscatedName("ed.j(J)I")
    public static int method2993(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("ds.i(J)I")
    public static int method2847(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("du.n(J)I")
    public static int method2897(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("hi.l(IIIZII)J")
    public static long method3883(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("de.k(III)V")
    public static final void method2891(int arg0, int arg1) {
        field2751 = arg0;
        field2747 = arg1;
        field2752 = true;
        field2749 = 0;
        field2748 = false;
    }

    @ObfuscatedName("ex.c(I)V")
    public static final void method2997() {
        field2752 = false;
        field2749 = 0;
    }

    @ObfuscatedName("mv.r(J)V")
    public static final void method6141(long arg0) {
        field2750[++field2749 - 1] = arg0;
    }

    @ObfuscatedName("on.b(I)V")
    public static final void method6985() {
        if (field2748) {
            return;
        }
        int var0 = Statics.field2560;
        int var1 = Statics.field2555;
        int var2 = Statics.field2568;
        int var3 = Statics.field2585;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2751 - Statics.field2502) * var4 / class217.field2495;
        int var7 = (field2747 - Statics.field2503) * var4 / class217.field2495;
        int var8 = (field2751 - Statics.field2502) * var5 / class217.field2495;
        int var9 = (field2747 - Statics.field2503) * var5 / class217.field2495;
        int var10 = class217.method4010(var7, var4, var1, var0);
        int var11 = class217.method4008(var7, var4, var1, var0);
        int var13 = class217.method4010(var9, var5, var1, var0);
        int var14 = class217.method4008(var9, var5, var1, var0);
        int var16 = class217.method4005(var6, var11, var3, var2);
        int var17 = class217.method4006(var6, var11, var3, var2);
        int var19 = class217.method4005(var8, var14, var3, var2);
        int var20 = class217.method4006(var8, var14, var3, var2);
        Statics.field1703 = (var16 + var19) / 2;
        Statics.field4285 = (var10 + var13) / 2;
        Statics.field2745 = (var17 + var20) / 2;
        Statics.field4662 = (var19 - var16) / 2;
        Statics.field2072 = (var13 - var10) / 2;
        Statics.field80 = (var20 - var17) / 2;
        Statics.field1869 = Math.abs(Statics.field4662);
        Statics.field1640 = Math.abs(Statics.field2072);
        Statics.field1744 = Math.abs(Statics.field80);
    }
}

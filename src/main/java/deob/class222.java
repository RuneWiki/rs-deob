package deob;

@ObfuscatedName("hz")
public class class222 {

    @ObfuscatedName("hz.a")
    public static boolean field2681 = false;

    @ObfuscatedName("hz.f")
    public static int field2670 = 0;

    @ObfuscatedName("hz.c")
    public static int field2671 = 0;

    @ObfuscatedName("hz.x")
    public static boolean field2677 = false;

    @ObfuscatedName("hz.b")
    public static int field2674 = 0;

    @ObfuscatedName("hz.o")
    public static long[] field2669 = new long[1000];

    public class222() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bb.a(I)I")
    public static int method1935() {
        return field2674;
    }

    @ObfuscatedName("bq.f(J)Z")
    public static boolean method1076(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("kh.c(J)Z")
    public static boolean method5675(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("oy.x(J)I")
    public static int method7000(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("o.h(IB)I")
    public static int method172(int arg0) {
        return method3789(field2669[arg0]);
    }

    @ObfuscatedName("gn.j(J)I")
    public static int method3789(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("cb.y(J)I")
    public static int method2431(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("gy.d(IIIZII)J")
    public static long method3289(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("di.n(I)Z")
    public static final boolean method2746() {
        return field2681;
    }

    @ObfuscatedName("it.r(I)I")
    public static final int method4380() {
        return field2670;
    }

    @ObfuscatedName("di.l(I)V")
    public static final void method2745() {
        if (field2677) {
            return;
        }
        int var0 = Statics.field2515;
        int var1 = Statics.field2480;
        int var2 = Statics.field2481;
        int var3 = Statics.field2482;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2670 - Statics.field2427) * var4 / class211.field2423;
        int var7 = (field2671 - Statics.field2413) * var4 / class211.field2423;
        int var8 = (field2670 - Statics.field2427) * var5 / class211.field2423;
        int var9 = (field2671 - Statics.field2413) * var5 / class211.field2423;
        int var10 = class211.method3842(var7, var4, var1, var0);
        int var11 = class211.method3852(var7, var4, var1, var0);
        int var13 = class211.method3842(var9, var5, var1, var0);
        int var14 = class211.method3852(var9, var5, var1, var0);
        int var16 = class211.method3867(var6, var11, var3, var2);
        int var17 = class211.method3825(var6, var11, var3, var2);
        int var19 = class211.method3867(var8, var14, var3, var2);
        int var20 = class211.method3825(var8, var14, var3, var2);
        Statics.field2673 = (var16 + var19) / 2;
        Statics.field2678 = (var10 + var13) / 2;
        Statics.field2675 = (var17 + var20) / 2;
        Statics.field3658 = (var19 - var16) / 2;
        Statics.field1436 = (var13 - var10) / 2;
        Statics.field888 = (var20 - var17) / 2;
        Statics.field2676 = Math.abs(Statics.field3658);
        Statics.field4686 = Math.abs(Statics.field1436);
        Statics.field18 = Math.abs(Statics.field888);
    }

    @ObfuscatedName("r.s(IIIIIIIB)Z")
    public static final boolean method70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2671 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2671 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2670 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2670 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

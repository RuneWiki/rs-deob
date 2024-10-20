package deob;

@ObfuscatedName("hk")
public class class221 {

    @ObfuscatedName("hk.n")
    public static boolean field2573 = false;

    @ObfuscatedName("hk.c")
    public static int field2565 = 0;

    @ObfuscatedName("hk.m")
    public static int field2566 = 0;

    @ObfuscatedName("hk.k")
    public static boolean field2567 = false;

    @ObfuscatedName("hk.f")
    public static int field2570 = 0;

    @ObfuscatedName("hk.s")
    public static long[] field2574 = new long[1000];

    public class221() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.n(J)Z")
    public static boolean method2592(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("fw.c(J)Z")
    public static boolean method3110(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("dz.m(II)J")
    public static long method2379(int arg0) {
        return field2574[arg0];
    }

    @ObfuscatedName("ch.k(II)I")
    public static int method2072(int arg0) {
        long var1 = field2574[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("gn.o(IB)I")
    public static int method3465(int arg0) {
        return method4634(field2574[arg0]);
    }

    @ObfuscatedName("je.g(J)I")
    public static int method4634(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("hs.z(II)I")
    public static int method3697(int arg0) {
        return method2676(field2574[arg0]);
    }

    @ObfuscatedName("ft.a(J)I")
    public static int method2676(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("di.u(IIIZIB)J")
    public static long method2438(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("ec.e(I)V")
    public static final void method2461() {
        field2573 = false;
        field2570 = 0;
    }

    @ObfuscatedName("al.l(J)V")
    public static final void method396(long arg0) {
        field2574[++field2570 - 1] = arg0;
    }

    @ObfuscatedName("lm.y(I)Z")
    public static final boolean method5295() {
        return field2573;
    }

    @ObfuscatedName("gz.v(Lhg;IIII)Z")
    public static final boolean method3509(class220 arg0, int arg1, int arg2, int arg3) {
        if (!method5295()) {
            return false;
        }
        if (!field2567) {
            int var4 = Statics.field2398;
            int var5 = Statics.field2389;
            int var6 = Statics.field2390;
            int var7 = Statics.field2391;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field2565 - Statics.field2343) * var8 / class211.field2342;
            int var11 = (field2566 - Statics.field2344) * var8 / class211.field2342;
            int var12 = (field2565 - Statics.field2343) * var9 / class211.field2342;
            int var13 = (field2566 - Statics.field2344) * var9 / class211.field2342;
            int var14 = class211.method3721(var11, var8, var5, var4);
            int var15 = class211.method3766(var11, var8, var5, var4);
            int var17 = class211.method3721(var13, var9, var5, var4);
            int var18 = class211.method3766(var13, var9, var5, var4);
            int var20 = class211.method3777(var10, var15, var7, var6);
            int var21 = class211.method3720(var10, var15, var7, var6);
            int var23 = class211.method3777(var12, var18, var7, var6);
            int var24 = class211.method3720(var12, var18, var7, var6);
            Statics.field2106 = (var20 + var23) / 2;
            Statics.field2569 = (var14 + var17) / 2;
            Statics.field2571 = (var21 + var24) / 2;
            Statics.field2572 = (var23 - var20) / 2;
            Statics.field2564 = (var17 - var14) / 2;
            Statics.field1381 = (var24 - var21) / 2;
            Statics.field476 = Math.abs(Statics.field2572);
            Statics.field1648 = Math.abs(Statics.field2564);
            Statics.field2568 = Math.abs(Statics.field1381);
        }
        int var26 = arg0.field2526 + arg1;
        int var27 = arg0.field2527 + arg2;
        int var28 = arg0.field2528 + arg3;
        int var29 = arg0.field2529;
        int var30 = arg0.field2530;
        int var31 = arg0.field2531;
        int var32 = Statics.field2106 - var26;
        int var33 = Statics.field2569 - var27;
        int var34 = Statics.field2571 - var28;
        if (Math.abs(var32) > Statics.field476 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field1648 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field2568 + var31) {
            return false;
        } else if (Math.abs(Statics.field2564 * var34 - Statics.field1381 * var33) > Statics.field2568 * var30 + Statics.field1648 * var31) {
            return false;
        } else if (Math.abs(Statics.field1381 * var32 - Statics.field2572 * var34) > Statics.field476 * var31 + Statics.field2568 * var29) {
            return false;
        } else {
            return Math.abs(Statics.field2572 * var33 - Statics.field2564 * var32) <= Statics.field476 * var30 + Statics.field1648 * var29;
        }
    }
}

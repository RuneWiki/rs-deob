package deob;

@ObfuscatedName("hg")
public class class212 {

    @ObfuscatedName("hg.s")
    public static boolean field2592 = false;

    @ObfuscatedName("hg.h")
    public static int field2591 = 0;

    @ObfuscatedName("hg.w")
    public static int field2595 = 0;

    @ObfuscatedName("hg.v")
    public static boolean field2593 = false;

    @ObfuscatedName("hg.u")
    public static int field2596 = 0;

    @ObfuscatedName("hg.l")
    public static long[] field2601 = new long[1000];

    public class212() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mw.s(J)Z")
    public static boolean method5653(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("gt.w(II)I")
    public static int method3890(int arg0) {
        return method2911(field2601[arg0]);
    }

    @ObfuscatedName("ff.v(J)I")
    public static int method2911(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("dm.c(II)I")
    public static int method2591(int arg0) {
        return method4145(field2601[arg0]);
    }

    @ObfuscatedName("hs.q(J)I")
    public static int method4145(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("mr.k(III)V")
    public static final void method5607(int arg0, int arg1) {
        field2591 = arg0;
        field2595 = arg1;
        field2592 = true;
        field2596 = 0;
        field2593 = false;
    }

    @ObfuscatedName("bw.o(J)V")
    public static final void method1006(long arg0) {
        field2601[++field2596 - 1] = arg0;
    }

    @ObfuscatedName("gh.n(I)I")
    public static final int method3433() {
        return field2591;
    }

    @ObfuscatedName("dt.d(I)I")
    public static final int method2583() {
        return field2595;
    }

    @ObfuscatedName("gg.a(I)V")
    public static final void method3594() {
        if (field2593) {
            return;
        }
        int var0 = Statics.field2407;
        int var1 = Statics.field2408;
        int var2 = Statics.field2409;
        int var3 = Statics.field2410;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2591 - Statics.field2345) * var4 / class201.field2349;
        int var7 = (field2595 - Statics.field2350) * var4 / class201.field2349;
        int var8 = (field2591 - Statics.field2345) * var5 / class201.field2349;
        int var9 = (field2595 - Statics.field2350) * var5 / class201.field2349;
        int var10 = class201.method3602(var7, var4, var1, var0);
        int var11 = class201.method3623(var7, var4, var1, var0);
        int var13 = class201.method3602(var9, var5, var1, var0);
        int var14 = class201.method3623(var9, var5, var1, var0);
        int var16 = class201.method3603(var6, var11, var3, var2);
        int var17 = class201.method3621(var6, var11, var3, var2);
        int var19 = class201.method3603(var8, var14, var3, var2);
        int var20 = class201.method3621(var8, var14, var3, var2);
        Statics.field1635 = (var16 + var19) / 2;
        Statics.field2594 = (var10 + var13) / 2;
        Statics.field1640 = (var17 + var20) / 2;
        Statics.field323 = (var19 - var16) / 2;
        Statics.field2871 = (var13 - var10) / 2;
        Statics.field2600 = (var20 - var17) / 2;
        Statics.field1356 = Math.abs(Statics.field323);
        Statics.field1518 = Math.abs(Statics.field2871);
        Statics.field1678 = Math.abs(Statics.field2600);
    }

    @ObfuscatedName("gm.m(Lhp;IIII)Z")
    public static final boolean method3207(class211 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field2592;
        if (!var4) {
            return false;
        }
        method3594();
        int var5 = arg0.field2547 + arg1;
        int var6 = arg0.field2548 + arg2;
        int var7 = arg0.field2549 + arg3;
        int var8 = arg0.field2581;
        int var9 = arg0.field2563;
        int var10 = arg0.field2552;
        int var11 = Statics.field1635 - var5;
        int var12 = Statics.field2594 - var6;
        int var13 = Statics.field1640 - var7;
        if (Math.abs(var11) > Statics.field1356 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field1518 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field1678 + var10) {
            return false;
        } else if (Math.abs(Statics.field2871 * var13 - Statics.field2600 * var12) > Statics.field1678 * var9 + Statics.field1518 * var10) {
            return false;
        } else if (Math.abs(Statics.field2600 * var11 - Statics.field323 * var13) > Statics.field1678 * var8 + Statics.field1356 * var10) {
            return false;
        } else {
            return Math.abs(Statics.field323 * var12 - Statics.field2871 * var11) <= Statics.field1518 * var8 + Statics.field1356 * var9;
        }
    }
}

package deob;

@ObfuscatedName("ei")
public class class138 {

    @ObfuscatedName("ei.x")
    public static boolean field1762 = false;

    @ObfuscatedName("ei.m")
    public static int field1755 = 0;

    @ObfuscatedName("ei.k")
    public static int field1753 = 0;

    @ObfuscatedName("ei.d")
    public static boolean field1756 = false;

    @ObfuscatedName("ei.u")
    public static int field1760 = 0;

    @ObfuscatedName("ei.h")
    public static long[] field1758 = new long[1000];

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.x(I)I")
    public static int method1094() {
        return field1760;
    }

    @ObfuscatedName("dx.m(J)Z")
    public static boolean method2405(long arg0) {
        return arg0 != 0L && !method3841(arg0);
    }

    @ObfuscatedName("ag.k(II)J")
    public static long method735(int arg0) {
        return field1758[arg0];
    }

    @ObfuscatedName("dv.d(II)I")
    public static int method2172(int arg0) {
        long var1 = field1758[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ap.w(II)I")
    public static int method313(int arg0) {
        return method3202(field1758[arg0]);
    }

    @ObfuscatedName("fd.v(J)I")
    public static int method3202(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("jo.q(II)I")
    public static int method4640(int arg0) {
        long var1 = field1758[arg0];
        return (int) (var1 >>> 14 & 0x3L);
    }

    @ObfuscatedName("ha.z(J)Z")
    public static boolean method3841(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("af.t(IB)I")
    public static int method358(int arg0) {
        return method351(field1758[arg0]);
    }

    @ObfuscatedName("ar.e(J)I")
    public static int method351(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("lp.s(IIIZII)J")
    public static long method5881(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("lt.p(III)V")
    public static final void method5428(int arg0, int arg1) {
        field1755 = arg0;
        field1753 = arg1;
        field1762 = true;
        field1760 = 0;
        field1756 = false;
    }

    @ObfuscatedName("br.n(I)V")
    public static final void method999() {
        field1762 = false;
        field1760 = 0;
    }

    @ObfuscatedName("bf.u(I)I")
    public static final int method749() {
        return field1755;
    }

    @ObfuscatedName("cp.h(I)V")
    public static final void method2093() {
        if (field1756) {
            return;
        }
        int var0 = Statics.field1837;
        int var1 = Statics.field1838;
        int var2 = Statics.field1839;
        int var3 = Statics.field1840;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1755 - Statics.field1776) * var4 / class140.field1781;
        int var7 = (field1753 - Statics.field1789) * var4 / class140.field1781;
        int var8 = (field1755 - Statics.field1776) * var5 / class140.field1781;
        int var9 = (field1753 - Statics.field1789) * var5 / class140.field1781;
        int var10 = class140.method2887(var7, var4, var1, var0);
        int var11 = class140.method2854(var7, var4, var1, var0);
        int var13 = class140.method2887(var9, var5, var1, var0);
        int var14 = class140.method2854(var9, var5, var1, var0);
        int var16 = class140.method2851(var6, var11, var3, var2);
        int var17 = class140.method2852(var6, var11, var3, var2);
        int var19 = class140.method2851(var8, var14, var3, var2);
        int var20 = class140.method2852(var8, var14, var3, var2);
        Statics.field1757 = (var16 + var19) / 2;
        Statics.field3654 = (var10 + var13) / 2;
        Statics.field3457 = (var17 + var20) / 2;
        Statics.field1754 = (var19 - var16) / 2;
        Statics.field2062 = (var13 - var10) / 2;
        Statics.field76 = (var20 - var17) / 2;
        Statics.field135 = Math.abs(Statics.field1754);
        Statics.field1759 = Math.abs(Statics.field2062);
        Statics.field1183 = Math.abs(Statics.field76);
    }

    @ObfuscatedName("bx.g(Lel;IIII)Z")
    public static final boolean method1096(class137 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1762;
        if (!var4) {
            return false;
        }
        method2093();
        int var5 = arg0.field1690 + arg1;
        int var6 = arg0.field1716 + arg2;
        int var7 = arg0.field1710 + arg3;
        int var8 = arg0.field1730;
        int var9 = arg0.field1718;
        int var10 = arg0.field1720;
        int var11 = Statics.field1757 - var5;
        int var12 = Statics.field3654 - var6;
        int var13 = Statics.field3457 - var7;
        if (Math.abs(var11) > Statics.field135 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field1759 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field1183 + var10) {
            return false;
        } else if (Math.abs(Statics.field2062 * var13 - Statics.field76 * var12) > Statics.field1759 * var10 + Statics.field1183 * var9) {
            return false;
        } else if (Math.abs(Statics.field76 * var11 - Statics.field1754 * var13) > Statics.field135 * var10 + Statics.field1183 * var8) {
            return false;
        } else {
            return Math.abs(Statics.field1754 * var12 - Statics.field2062 * var11) <= Statics.field1759 * var8 + Statics.field135 * var9;
        }
    }
}

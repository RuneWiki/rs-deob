package deob;

@ObfuscatedName("ei")
public class class138 {

    @ObfuscatedName("ei.m")
    public static boolean field1767 = false;

    @ObfuscatedName("ei.o")
    public static int field1770 = 0;

    @ObfuscatedName("ei.q")
    public static int field1769 = 0;

    @ObfuscatedName("ei.j")
    public static boolean field1773 = false;

    @ObfuscatedName("ei.h")
    public static int field1775 = 0;

    @ObfuscatedName("ei.k")
    public static long[] field1768 = new long[1000];

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("am.m(I)I")
    public static int method317() {
        return field1775;
    }

    @ObfuscatedName("eu.o(J)Z")
    public static boolean method2691(long arg0) {
        return method3245(arg0) == 2;
    }

    @ObfuscatedName("ar.q(IB)J")
    public static long method405(int arg0) {
        return field1768[arg0];
    }

    @ObfuscatedName("dg.j(IB)I")
    public static int method2375(int arg0) {
        return method4723(field1768[arg0]);
    }

    @ObfuscatedName("jh.p(J)I")
    public static int method4723(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ff.g(J)I")
    public static int method3245(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("q.n(IS)I")
    public static int method19(int arg0) {
        return method3443(field1768[arg0]);
    }

    @ObfuscatedName("gz.u(J)I")
    public static int method3443(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("gs.a(IIIZIB)J")
    public static long method3462(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("ao.z(I)V")
    public static final void method270() {
        field1767 = false;
        field1775 = 0;
    }

    @ObfuscatedName("cn.w(J)V")
    public static final void method1816(long arg0) {
        field1768[++field1775 - 1] = arg0;
    }

    @ObfuscatedName("o.y(B)I")
    public static final int method12() {
        return field1770;
    }

    @ObfuscatedName("bo.c(I)I")
    public static final int method1012() {
        return field1769;
    }

    @ObfuscatedName("id.h(Lef;IIII)Z")
    public static final boolean method3875(class137 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1767;
        if (!var4) {
            return false;
        }
        if (!field1773) {
            int var5 = Statics.field1855;
            int var6 = Statics.field1842;
            int var7 = Statics.field1857;
            int var8 = Statics.field1858;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1770 - Statics.field1809) * var9 / class140.field1798;
            int var12 = (field1769 - Statics.field1800) * var9 / class140.field1798;
            int var13 = (field1770 - Statics.field1809) * var10 / class140.field1798;
            int var14 = (field1769 - Statics.field1800) * var10 / class140.field1798;
            int var15 = class140.method2849(var12, var9, var6, var5);
            int var16 = class140.method2850(var12, var9, var6, var5);
            int var18 = class140.method2849(var14, var10, var6, var5);
            int var19 = class140.method2850(var14, var10, var6, var5);
            int var21 = class140.method2872(var11, var16, var8, var7);
            int var22 = class140.method2848(var11, var16, var8, var7);
            int var24 = class140.method2872(var13, var19, var8, var7);
            int var25 = class140.method2848(var13, var19, var8, var7);
            Statics.field1771 = (var21 + var24) / 2;
            Statics.field4063 = (var15 + var18) / 2;
            Statics.field1467 = (var22 + var25) / 2;
            Statics.field1772 = (var24 - var21) / 2;
            Statics.field1776 = (var18 - var15) / 2;
            Statics.field1774 = (var25 - var22) / 2;
            Statics.field631 = Math.abs(Statics.field1772);
            Statics.field2423 = Math.abs(Statics.field1776);
            Statics.field2004 = Math.abs(Statics.field1774);
        }
        int var27 = arg0.field1744 + arg1;
        int var28 = arg0.field1706 + arg2;
        int var29 = arg0.field1750 + arg3;
        int var30 = arg0.field1754;
        int var31 = arg0.field1733;
        int var32 = arg0.field1734;
        int var33 = Statics.field1771 - var27;
        int var34 = Statics.field4063 - var28;
        int var35 = Statics.field1467 - var29;
        if (Math.abs(var33) > Statics.field631 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field2423 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field2004 + var32) {
            return false;
        } else if (Math.abs(Statics.field1776 * var35 - Statics.field1774 * var34) > Statics.field2423 * var32 + Statics.field2004 * var31) {
            return false;
        } else if (Math.abs(Statics.field1774 * var33 - Statics.field1772 * var35) > Statics.field631 * var32 + Statics.field2004 * var30) {
            return false;
        } else {
            return Math.abs(Statics.field1772 * var34 - Statics.field1776 * var33) <= Statics.field631 * var31 + Statics.field2423 * var30;
        }
    }
}

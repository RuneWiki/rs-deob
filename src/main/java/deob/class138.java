package deob;

@ObfuscatedName("eb")
public class class138 {

    @ObfuscatedName("eb.n")
    public static boolean field1754 = false;

    @ObfuscatedName("eb.v")
    public static int field1757 = 0;

    @ObfuscatedName("eb.d")
    public static int field1756 = 0;

    @ObfuscatedName("eb.c")
    public static boolean field1764 = false;

    @ObfuscatedName("eb.w")
    public static int field1765 = 0;

    @ObfuscatedName("eb.k")
    public static long[] field1762 = new long[1000];

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ac.n(I)I")
    public static int method311() {
        return field1765;
    }

    @ObfuscatedName("cc.v(J)Z")
    public static boolean method2087(long arg0) {
        return arg0 != 0L && !method3874(arg0);
    }

    @ObfuscatedName("ck.d(II)J")
    public static long method1882(int arg0) {
        return field1762[arg0];
    }

    @ObfuscatedName("gx.c(II)I")
    public static int method3545(int arg0) {
        return method2271(field1762[arg0]);
    }

    @ObfuscatedName("du.y(J)I")
    public static int method2271(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ca.h(IB)I")
    public static int method2010(int arg0) {
        return method178(field1762[arg0]);
    }

    @ObfuscatedName("t.z(J)I")
    public static int method178(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("kq.e(J)I")
    public static int method5066(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("hv.q(J)Z")
    public static boolean method3874(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("aj.l(II)I")
    public static int method616(int arg0) {
        return method229(field1762[arg0]);
    }

    @ObfuscatedName("j.s(J)I")
    public static int method229(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("da.b(IIIZIB)J")
    public static long method2665(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("k.a(III)V")
    public static final void method114(int arg0, int arg1) {
        field1757 = arg0;
        field1756 = arg1;
        field1754 = true;
        field1765 = 0;
        field1764 = false;
    }

    @ObfuscatedName("k.w(J)V")
    public static final void method106(long arg0) {
        field1762[++field1765 - 1] = arg0;
    }

    @ObfuscatedName("gw.k(B)I")
    public static final int method3553() {
        return field1756;
    }

    @ObfuscatedName("al.i(Lef;IIII)Z")
    public static final boolean method435(class137 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1754;
        if (!var4) {
            return false;
        }
        if (!field1764) {
            int var5 = Statics.field1841;
            int var6 = Statics.field1859;
            int var7 = Statics.field1843;
            int var8 = Statics.field1844;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1757 - Statics.field1787) * var9 / class140.field1786;
            int var12 = (field1756 - Statics.field1788) * var9 / class140.field1786;
            int var13 = (field1757 - Statics.field1787) * var10 / class140.field1786;
            int var14 = (field1756 - Statics.field1788) * var10 / class140.field1786;
            int var15 = class140.method2948(var12, var9, var6, var5);
            int var16 = class140.method2949(var12, var9, var6, var5);
            int var18 = class140.method2948(var14, var10, var6, var5);
            int var19 = class140.method2949(var14, var10, var6, var5);
            int var21 = class140.method2946(var11, var16, var8, var7);
            int var22 = class140.method2947(var11, var16, var8, var7);
            int var24 = class140.method2946(var13, var19, var8, var7);
            int var25 = class140.method2947(var13, var19, var8, var7);
            Statics.field1758 = (var21 + var24) / 2;
            Statics.field46 = (var15 + var18) / 2;
            Statics.field289 = (var22 + var25) / 2;
            Statics.field1759 = (var24 - var21) / 2;
            Statics.field1760 = (var18 - var15) / 2;
            Statics.field147 = (var25 - var22) / 2;
            Statics.field2517 = Math.abs(Statics.field1759);
            Statics.field36 = Math.abs(Statics.field1760);
            Statics.field1312 = Math.abs(Statics.field147);
        }
        int var27 = arg0.field1716 + arg1;
        int var28 = arg0.field1695 + arg2;
        int var29 = arg0.field1734 + arg3;
        int var30 = arg0.field1730;
        int var31 = arg0.field1720;
        int var32 = arg0.field1710;
        int var33 = Statics.field1758 - var27;
        int var34 = Statics.field46 - var28;
        int var35 = Statics.field289 - var29;
        if (Math.abs(var33) > Statics.field2517 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field36 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field1312 + var32) {
            return false;
        } else if (Math.abs(Statics.field1760 * var35 - Statics.field147 * var34) > Statics.field36 * var32 + Statics.field1312 * var31) {
            return false;
        } else if (Math.abs(Statics.field147 * var33 - Statics.field1759 * var35) > Statics.field2517 * var32 + Statics.field1312 * var30) {
            return false;
        } else {
            return Math.abs(Statics.field1759 * var34 - Statics.field1760 * var33) <= Statics.field36 * var30 + Statics.field2517 * var31;
        }
    }

    @ObfuscatedName("fc.x(IIIIIIIB)Z")
    public static final boolean method3312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1756 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1756 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1757 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1757 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

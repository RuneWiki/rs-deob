package deob;

@ObfuscatedName("ew")
public class class138 {

    @ObfuscatedName("ew.f")
    public static boolean field1770 = false;

    @ObfuscatedName("ew.b")
    public static int field1767 = 0;

    @ObfuscatedName("ew.l")
    public static int field1768 = 0;

    @ObfuscatedName("ew.m")
    public static boolean field1766 = false;

    @ObfuscatedName("ew.x")
    public static int field1774 = 0;

    @ObfuscatedName("ew.p")
    public static long[] field1775 = new long[1000];

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("b.f(J)Z")
    public static boolean method9(long arg0) {
        return method762(arg0) == 2;
    }

    @ObfuscatedName("bg.b(J)Z")
    public static boolean method782(long arg0) {
        return arg0 != 0L && !method615(arg0);
    }

    @ObfuscatedName("bm.l(J)I")
    public static int method1069(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("bp.m(J)I")
    public static int method762(long arg0) {
        return (int) (arg0 >>> 14 & 0x3L);
    }

    @ObfuscatedName("aa.z(J)Z")
    public static boolean method615(long arg0) {
        return (int) (arg0 >>> 16 & 0x1L) == 1;
    }

    @ObfuscatedName("jo.q(IB)I")
    public static int method4299(int arg0) {
        return method1840(field1775[arg0]);
    }

    @ObfuscatedName("cl.k(J)I")
    public static int method1840(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("bu.c(IIIZIB)J")
    public static long method1223(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("g.u(B)V")
    public static final void method220() {
        field1770 = false;
        field1774 = 0;
    }

    @ObfuscatedName("bk.t(J)V")
    public static final void method1156(long arg0) {
        field1775[++field1774 - 1] = arg0;
    }

    @ObfuscatedName("ah.e(I)Z")
    public static final boolean method349() {
        return field1770;
    }

    @ObfuscatedName("iv.o(B)I")
    public static final int method3898() {
        return field1767;
    }

    @ObfuscatedName("ih.n(I)V")
    public static final void method3888() {
        if (field1766) {
            return;
        }
        int var0 = Statics.field1834;
        int var1 = Statics.field1856;
        int var2 = Statics.field1883;
        int var3 = Statics.field1858;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1767 - Statics.field1790) * var4 / class140.field1792;
        int var7 = (field1768 - Statics.field1803) * var4 / class140.field1792;
        int var8 = (field1767 - Statics.field1790) * var5 / class140.field1792;
        int var9 = (field1768 - Statics.field1803) * var5 / class140.field1792;
        int var10 = class140.method2931(var7, var4, var1, var0);
        int var11 = class140.method2896(var7, var4, var1, var0);
        int var13 = class140.method2931(var9, var5, var1, var0);
        int var14 = class140.method2896(var9, var5, var1, var0);
        int var16 = class140.method2893(var6, var11, var3, var2);
        int var17 = class140.method2894(var6, var11, var3, var2);
        int var19 = class140.method2893(var8, var14, var3, var2);
        int var20 = class140.method2894(var8, var14, var3, var2);
        Statics.field1771 = (var16 + var19) / 2;
        Statics.field378 = (var10 + var13) / 2;
        Statics.field1769 = (var17 + var20) / 2;
        Statics.field1772 = (var19 - var16) / 2;
        Statics.field82 = (var13 - var10) / 2;
        Statics.field554 = (var20 - var17) / 2;
        Statics.field4 = Math.abs(Statics.field1772);
        Statics.field571 = Math.abs(Statics.field82);
        Statics.field1773 = Math.abs(Statics.field554);
    }

    @ObfuscatedName("gc.x(Leh;IIIB)Z")
    public static final boolean method3485(class137 arg0, int arg1, int arg2, int arg3) {
        if (!method349()) {
            return false;
        }
        method3888();
        int var4 = arg0.field1728 + arg1;
        int var5 = arg0.field1729 + arg2;
        int var6 = arg0.field1730 + arg3;
        int var7 = arg0.field1731;
        int var8 = arg0.field1732;
        int var9 = arg0.field1733;
        int var10 = Statics.field1771 - var4;
        int var11 = Statics.field378 - var5;
        int var12 = Statics.field1769 - var6;
        if (Math.abs(var10) > Statics.field4 + var7) {
            return false;
        } else if (Math.abs(var11) > Statics.field571 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field1773 + var9) {
            return false;
        } else if (Math.abs(Statics.field82 * var12 - Statics.field554 * var11) > Statics.field571 * var9 + Statics.field1773 * var8) {
            return false;
        } else if (Math.abs(Statics.field554 * var10 - Statics.field1772 * var12) > Statics.field4 * var9 + Statics.field1773 * var7) {
            return false;
        } else {
            return Math.abs(Statics.field1772 * var11 - Statics.field82 * var10) <= Statics.field571 * var7 + Statics.field4 * var8;
        }
    }
}

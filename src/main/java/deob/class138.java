package deob;

@ObfuscatedName("ep")
public class class138 {

    @ObfuscatedName("ep.z")
    public static boolean field1773 = false;

    @ObfuscatedName("ep.k")
    public static int field1766 = 0;

    @ObfuscatedName("ep.s")
    public static int field1779 = 0;

    @ObfuscatedName("ep.t")
    public static boolean field1765 = false;

    @ObfuscatedName("ep.a")
    public static int field1767 = 0;

    @ObfuscatedName("ep.q")
    public static long[] field1768 = new long[1000];

    public class138() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bu.z(J)Z")
    public static boolean method1047(long arg0) {
        int var2 = (int) (arg0 >>> 14 & 0x3L);
        return var2 == 2;
    }

    @ObfuscatedName("y.k(J)Z")
    public static boolean method139(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("ap.s(II)I")
    public static int method325(int arg0) {
        return method2023(field1768[arg0]);
    }

    @ObfuscatedName("ch.t(J)I")
    public static int method2023(long arg0) {
        return (int) (arg0 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("ef.i(II)I")
    public static int method3147(int arg0) {
        return method3219(field1768[arg0]);
    }

    @ObfuscatedName("fv.o(J)I")
    public static int method3219(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("hs.x(IIIZII)J")
    public static long method3833(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("ke.w(IIB)V")
    public static final void method4977(int arg0, int arg1) {
        field1766 = arg0;
        field1779 = arg1;
        field1773 = true;
        field1767 = 0;
        field1765 = false;
    }

    @ObfuscatedName("cj.g(I)V")
    public static final void method1966() {
        field1773 = false;
        field1767 = 0;
    }

    @ObfuscatedName("cb.m(J)V")
    public static final void method2143(long arg0) {
        field1768[++field1767 - 1] = arg0;
    }

    @ObfuscatedName("gl.n(I)Z")
    public static final boolean method3460() {
        return field1773;
    }

    @ObfuscatedName("mr.d(B)V")
    public static final void method5927() {
        if (field1765) {
            return;
        }
        int var0 = Statics.field1877;
        int var1 = Statics.field1880;
        int var2 = Statics.field1861;
        int var3 = Statics.field1862;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1766 - Statics.field1800) * var4 / class140.field1797;
        int var7 = (field1779 - Statics.field1799) * var4 / class140.field1797;
        int var8 = (field1766 - Statics.field1800) * var5 / class140.field1797;
        int var9 = (field1779 - Statics.field1799) * var5 / class140.field1797;
        int var10 = class140.method2890(var7, var4, var1, var0);
        int var11 = class140.method2882(var7, var4, var1, var0);
        int var13 = class140.method2890(var9, var5, var1, var0);
        int var14 = class140.method2882(var9, var5, var1, var0);
        int var16 = class140.method2889(var6, var11, var3, var2);
        int var17 = class140.method2869(var6, var11, var3, var2);
        int var19 = class140.method2889(var8, var14, var3, var2);
        int var20 = class140.method2869(var8, var14, var3, var2);
        Statics.field1769 = (var16 + var19) / 2;
        Statics.field2538 = (var10 + var13) / 2;
        Statics.field1770 = (var17 + var20) / 2;
        Statics.field2553 = (var19 - var16) / 2;
        Statics.field179 = (var13 - var10) / 2;
        Statics.field1771 = (var20 - var17) / 2;
        Statics.field26 = Math.abs(Statics.field2553);
        Statics.field3101 = Math.abs(Statics.field179);
        Statics.field1772 = Math.abs(Statics.field1771);
    }

    @ObfuscatedName("hs.h(Ler;IIII)Z")
    public static final boolean method3840(class137 arg0, int arg1, int arg2, int arg3) {
        if (!method3460()) {
            return false;
        }
        method5927();
        int var4 = arg0.field1727 + arg1;
        int var5 = arg0.field1739 + arg2;
        int var6 = arg0.field1714 + arg3;
        int var7 = arg0.field1731;
        int var8 = arg0.field1759;
        int var9 = arg0.field1732;
        int var10 = Statics.field1769 - var4;
        int var11 = Statics.field2538 - var5;
        int var12 = Statics.field1770 - var6;
        if (Math.abs(var10) > Statics.field26 + var7) {
            return false;
        } else if (Math.abs(var11) > Statics.field3101 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field1772 + var9) {
            return false;
        } else if (Math.abs(Statics.field179 * var12 - Statics.field1771 * var11) > Statics.field3101 * var9 + Statics.field1772 * var8) {
            return false;
        } else if (Math.abs(Statics.field1771 * var10 - Statics.field2553 * var12) > Statics.field26 * var9 + Statics.field1772 * var7) {
            return false;
        } else {
            return Math.abs(Statics.field2553 * var11 - Statics.field179 * var10) <= Statics.field3101 * var7 + Statics.field26 * var8;
        }
    }

    @ObfuscatedName("dy.a(IIIIIIII)Z")
    public static final boolean method2380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1779 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1779 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1766 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1766 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

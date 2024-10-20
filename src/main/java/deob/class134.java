package deob;

@ObfuscatedName("eq")
public class class134 {

    @ObfuscatedName("eq.d")
    public static boolean field1909 = false;

    @ObfuscatedName("eq.x")
    public static int field1901 = 0;

    @ObfuscatedName("eq.k")
    public static int field1902 = 0;

    @ObfuscatedName("eq.z")
    public static boolean field1903 = false;

    @ObfuscatedName("eq.c")
    public static int field1910 = 0;

    @ObfuscatedName("eq.y")
    public static int[] field1904 = new int[1000];

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fv.d(III)V")
    public static final void method3261(int arg0, int arg1) {
        field1901 = arg0;
        field1902 = arg1;
        field1909 = true;
        field1910 = 0;
        field1903 = false;
    }

    @ObfuscatedName("dx.x(I)V")
    public static final void method2290() {
        field1909 = false;
        field1910 = 0;
    }

    @ObfuscatedName("cg.k(B)Z")
    public static final boolean method1628() {
        return field1909;
    }

    @ObfuscatedName("v.z(I)I")
    public static final int method12() {
        return field1901;
    }

    @ObfuscatedName("fn.v(B)V")
    public static final void method2933() {
        if (field1903) {
            return;
        }
        int var0 = Statics.field1994;
        int var1 = Statics.field1986;
        int var2 = Statics.field1987;
        int var3 = Statics.field1988;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1901 - Statics.field1931) * var4 / class136.field1929;
        int var7 = (field1902 - Statics.field1918) * var4 / class136.field1929;
        int var8 = (field1901 - Statics.field1931) * var5 / class136.field1929;
        int var9 = (field1902 - Statics.field1918) * var5 / class136.field1929;
        int var10 = class136.method2520(var7, var4, var1, var0);
        int var11 = class136.method2521(var7, var4, var1, var0);
        int var13 = class136.method2520(var9, var5, var1, var0);
        int var14 = class136.method2521(var9, var5, var1, var0);
        int var16 = class136.method2518(var6, var11, var3, var2);
        int var17 = class136.method2519(var6, var11, var3, var2);
        int var19 = class136.method2518(var8, var14, var3, var2);
        int var20 = class136.method2519(var8, var14, var3, var2);
        Statics.field1900 = (var16 + var19) / 2;
        Statics.field3311 = (var10 + var13) / 2;
        Statics.field1905 = (var17 + var20) / 2;
        Statics.field1906 = (var19 - var16) / 2;
        Statics.field1907 = (var13 - var10) / 2;
        Statics.field240 = (var20 - var17) / 2;
        Statics.field790 = Math.abs(Statics.field1906);
        Statics.field760 = Math.abs(Statics.field1907);
        Statics.field1908 = Math.abs(Statics.field240);
    }

    @ObfuscatedName("hn.m(Leh;IIIS)Z")
    public static final boolean method3762(class133 arg0, int arg1, int arg2, int arg3) {
        if (!method1628()) {
            return false;
        }
        method2933();
        int var4 = arg0.field1832 + arg1;
        int var5 = arg0.field1839 + arg2;
        int var6 = arg0.field1894 + arg3;
        int var7 = arg0.field1865;
        int var8 = arg0.field1866;
        int var9 = arg0.field1867;
        int var10 = Statics.field1900 - var4;
        int var11 = Statics.field3311 - var5;
        int var12 = Statics.field1905 - var6;
        if (Math.abs(var10) > Statics.field790 + var7) {
            return false;
        } else if (Math.abs(var11) > Statics.field760 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field1908 + var9) {
            return false;
        } else if (Math.abs(Statics.field1907 * var12 - Statics.field240 * var11) > Statics.field760 * var9 + Statics.field1908 * var8) {
            return false;
        } else if (Math.abs(Statics.field240 * var10 - Statics.field1906 * var12) > Statics.field790 * var9 + Statics.field1908 * var7) {
            return false;
        } else {
            return Math.abs(Statics.field1906 * var11 - Statics.field1907 * var10) <= Statics.field790 * var8 + Statics.field760 * var7;
        }
    }

    @ObfuscatedName("z.b(IIIIIIII)Z")
    public static final boolean method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1902 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1902 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1901 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1901 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

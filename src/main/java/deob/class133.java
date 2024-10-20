package deob;

@ObfuscatedName("ej")
public class class133 {

    @ObfuscatedName("ej.t")
    public static boolean field1899 = false;

    @ObfuscatedName("ej.q")
    public static int field1895 = 0;

    @ObfuscatedName("ej.i")
    public static int field1896 = 0;

    @ObfuscatedName("ej.a")
    public static boolean field1897 = false;

    @ObfuscatedName("ej.v")
    public static int field1901 = 0;

    @ObfuscatedName("ej.u")
    public static int[] field1902 = new int[1000];

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.t(III)V")
    public static final void method1578(int arg0, int arg1) {
        field1895 = arg0;
        field1896 = arg1;
        field1899 = true;
        field1901 = 0;
        field1897 = false;
    }

    @ObfuscatedName("g.q(II)V")
    public static final void method43(int arg0) {
        field1902[++field1901 - 1] = arg0;
    }

    @ObfuscatedName("ci.i(I)V")
    public static final void method1791() {
        if (field1897) {
            return;
        }
        int var0 = Statics.field1960;
        int var1 = Statics.field1983;
        int var2 = Statics.field1972;
        int var3 = Statics.field1962;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1895 - Statics.field1921) * var4 / class135.field1930;
        int var7 = (field1896 - Statics.field1911) * var4 / class135.field1930;
        int var8 = (field1895 - Statics.field1921) * var5 / class135.field1930;
        int var9 = (field1896 - Statics.field1911) * var5 / class135.field1930;
        int var10 = class135.method2579(var7, var4, var1, var0);
        int var11 = class135.method2564(var7, var4, var1, var0);
        int var13 = class135.method2579(var9, var5, var1, var0);
        int var14 = class135.method2564(var9, var5, var1, var0);
        int var16 = class135.method2577(var6, var11, var3, var2);
        int var17 = class135.method2578(var6, var11, var3, var2);
        int var19 = class135.method2577(var8, var14, var3, var2);
        int var20 = class135.method2578(var8, var14, var3, var2);
        Statics.field31 = (var16 + var19) / 2;
        Statics.field1898 = (var10 + var13) / 2;
        Statics.field699 = (var17 + var20) / 2;
        Statics.field1283 = (var19 - var16) / 2;
        Statics.field3452 = (var13 - var10) / 2;
        Statics.field2670 = (var20 - var17) / 2;
        Statics.field3957 = Math.abs(Statics.field1283);
        Statics.field1894 = Math.abs(Statics.field3452);
        Statics.field1900 = Math.abs(Statics.field2670);
    }

    @ObfuscatedName("bv.a(Lek;IIII)Z")
    public static final boolean method1086(class132 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1899;
        if (!var4) {
            return false;
        }
        method1791();
        int var5 = arg0.field1856 + arg1;
        int var6 = arg0.field1859 + arg2;
        int var7 = arg0.field1844 + arg3;
        int var8 = arg0.field1835;
        int var9 = arg0.field1860;
        int var10 = arg0.field1861;
        int var11 = Statics.field31 - var5;
        int var12 = Statics.field1898 - var6;
        int var13 = Statics.field699 - var7;
        if (Math.abs(var11) > Statics.field3957 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field1894 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field1900 + var10) {
            return false;
        } else if (Math.abs(Statics.field3452 * var13 - Statics.field2670 * var12) > Statics.field1900 * var9 + Statics.field1894 * var10) {
            return false;
        } else if (Math.abs(Statics.field2670 * var11 - Statics.field1283 * var13) > Statics.field3957 * var10 + Statics.field1900 * var8) {
            return false;
        } else {
            return Math.abs(Statics.field1283 * var12 - Statics.field3452 * var11) <= Statics.field3957 * var9 + Statics.field1894 * var8;
        }
    }
}

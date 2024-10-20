package deob;

@ObfuscatedName("ep")
public class class133 {

    @ObfuscatedName("ep.o")
    public static boolean field1929 = false;

    @ObfuscatedName("ep.k")
    public static int field1923 = 0;

    @ObfuscatedName("ep.t")
    public static int field1919 = 0;

    @ObfuscatedName("ep.d")
    public static boolean field1922 = false;

    @ObfuscatedName("ep.n")
    public static int field1928 = 0;

    @ObfuscatedName("ep.l")
    public static int[] field1930 = new int[1000];

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.o(II)V")
    public static final void method1783(int arg0) {
        field1930[++field1928 - 1] = arg0;
    }

    @ObfuscatedName("jv.k(I)Z")
    public static final boolean method4258() {
        return field1929;
    }

    @ObfuscatedName("aq.t(I)I")
    public static final int method372() {
        return field1919;
    }

    @ObfuscatedName("af.d(B)V")
    public static final void method370() {
        if (field1922) {
            return;
        }
        int var0 = Statics.field2008;
        int var1 = Statics.field2009;
        int var2 = Statics.field2010;
        int var3 = Statics.field2011;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1923 - Statics.field1949) * var4 / class135.field1942;
        int var7 = (field1919 - Statics.field1951) * var4 / class135.field1942;
        int var8 = (field1923 - Statics.field1949) * var5 / class135.field1942;
        int var9 = (field1919 - Statics.field1951) * var5 / class135.field1942;
        int var10 = class135.method2552(var7, var4, var1, var0);
        int var11 = class135.method2576(var7, var4, var1, var0);
        int var13 = class135.method2552(var9, var5, var1, var0);
        int var14 = class135.method2576(var9, var5, var1, var0);
        int var16 = class135.method2573(var6, var11, var3, var2);
        int var17 = class135.method2585(var6, var11, var3, var2);
        int var19 = class135.method2573(var8, var14, var3, var2);
        int var20 = class135.method2585(var8, var14, var3, var2);
        Statics.field1920 = (var16 + var19) / 2;
        Statics.field1924 = (var10 + var13) / 2;
        Statics.field1925 = (var17 + var20) / 2;
        Statics.field1926 = (var19 - var16) / 2;
        Statics.field503 = (var13 - var10) / 2;
        Statics.field1630 = (var20 - var17) / 2;
        Statics.field337 = Math.abs(Statics.field1926);
        Statics.field1927 = Math.abs(Statics.field503);
        Statics.field3400 = Math.abs(Statics.field1630);
    }

    @ObfuscatedName("dm.h(Lei;IIII)Z")
    public static final boolean method2076(class132 arg0, int arg1, int arg2, int arg3) {
        if (!method4258()) {
            return false;
        }
        method370();
        int var4 = arg0.field1881 + arg1;
        int var5 = arg0.field1882 + arg2;
        int var6 = arg0.field1886 + arg3;
        int var7 = arg0.field1884;
        int var8 = arg0.field1885;
        int var9 = arg0.field1907;
        int var10 = Statics.field1920 - var4;
        int var11 = Statics.field1924 - var5;
        int var12 = Statics.field1925 - var6;
        if (Math.abs(var10) > Statics.field337 + var7) {
            return false;
        } else if (Math.abs(var11) > Statics.field1927 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field3400 + var9) {
            return false;
        } else if (Math.abs(Statics.field503 * var12 - Statics.field1630 * var11) > Statics.field3400 * var8 + Statics.field1927 * var9) {
            return false;
        } else if (Math.abs(Statics.field1630 * var10 - Statics.field1926 * var12) > Statics.field3400 * var7 + Statics.field337 * var9) {
            return false;
        } else {
            return Math.abs(Statics.field1926 * var11 - Statics.field503 * var10) <= Statics.field337 * var8 + Statics.field1927 * var7;
        }
    }
}

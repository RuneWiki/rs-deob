package deob;

@ObfuscatedName("ex")
public class class134 {

    @ObfuscatedName("ex.n")
    public static boolean field1909 = false;

    @ObfuscatedName("ex.v")
    public static int field1900 = 0;

    @ObfuscatedName("ex.y")
    public static int field1901 = 0;

    @ObfuscatedName("ex.r")
    public static boolean field1902 = false;

    @ObfuscatedName("ex.w")
    public static int field1899 = 0;

    @ObfuscatedName("ex.t")
    public static int[] field1908 = new int[1000];

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.n(II)V")
    public static final void method929(int arg0) {
        field1908[++field1899 - 1] = arg0;
    }

    @ObfuscatedName("hj.v(I)I")
    public static final int method3557() {
        return field1901;
    }

    @ObfuscatedName("o.y(Les;IIII)Z")
    public static final boolean method85(class133 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1909;
        if (!var4) {
            return false;
        }
        if (!field1902) {
            int var5 = Statics.field1983;
            int var6 = Statics.field2004;
            int var7 = Statics.field1988;
            int var8 = Statics.field1964;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1900 - Statics.field1928) * var9 / class136.field1927;
            int var12 = (field1901 - Statics.field1929) * var9 / class136.field1927;
            int var13 = (field1900 - Statics.field1928) * var10 / class136.field1927;
            int var14 = (field1901 - Statics.field1929) * var10 / class136.field1927;
            int var15 = class136.method2464(var12, var9, var6, var5);
            int var16 = class136.method2474(var12, var9, var6, var5);
            int var18 = class136.method2464(var14, var10, var6, var5);
            int var19 = class136.method2474(var14, var10, var6, var5);
            int var21 = class136.method2456(var11, var16, var8, var7);
            int var22 = class136.method2459(var11, var16, var8, var7);
            int var24 = class136.method2456(var13, var19, var8, var7);
            int var25 = class136.method2459(var13, var19, var8, var7);
            Statics.field2247 = (var21 + var24) / 2;
            Statics.field1904 = (var15 + var18) / 2;
            Statics.field1903 = (var22 + var25) / 2;
            Statics.field236 = (var24 - var21) / 2;
            Statics.field2023 = (var18 - var15) / 2;
            Statics.field1905 = (var25 - var22) / 2;
            Statics.field1906 = Math.abs(Statics.field236);
            Statics.field1907 = Math.abs(Statics.field2023);
            Statics.field1913 = Math.abs(Statics.field1905);
        }
        int var27 = arg0.field1897 + arg1;
        int var28 = arg0.field1862 + arg2;
        int var29 = arg0.field1863 + arg3;
        int var30 = arg0.field1864;
        int var31 = arg0.field1865;
        int var32 = arg0.field1886;
        int var33 = Statics.field2247 - var27;
        int var34 = Statics.field1904 - var28;
        int var35 = Statics.field1903 - var29;
        if (Math.abs(var33) > Statics.field1906 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field1907 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field1913 + var32) {
            return false;
        } else if (Math.abs(Statics.field2023 * var35 - Statics.field1905 * var34) > Statics.field1913 * var31 + Statics.field1907 * var32) {
            return false;
        } else if (Math.abs(Statics.field1905 * var33 - Statics.field236 * var35) > Statics.field1913 * var30 + Statics.field1906 * var32) {
            return false;
        } else {
            return Math.abs(Statics.field236 * var34 - Statics.field2023 * var33) <= Statics.field1907 * var30 + Statics.field1906 * var31;
        }
    }

    @ObfuscatedName("dm.r(IIIIIIII)Z")
    public static final boolean method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1901 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1901 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1900 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1900 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

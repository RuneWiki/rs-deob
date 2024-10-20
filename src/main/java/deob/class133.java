package deob;

@ObfuscatedName("ez")
public class class133 {

    @ObfuscatedName("ez.g")
    public static boolean field1903 = false;

    @ObfuscatedName("ez.e")
    public static int field1899 = 0;

    @ObfuscatedName("ez.b")
    public static int field1894 = 0;

    @ObfuscatedName("ez.z")
    public static boolean field1895 = false;

    @ObfuscatedName("ez.r")
    public static int field1901 = 0;

    @ObfuscatedName("ez.p")
    public static int[] field1902 = new int[1000];

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gv.g(III)V")
    public static final void method3279(int arg0, int arg1) {
        field1899 = arg0;
        field1894 = arg1;
        field1903 = true;
        field1901 = 0;
        field1895 = false;
    }

    @ObfuscatedName("ba.e(I)V")
    public static final void method1022() {
        field1903 = false;
        field1901 = 0;
    }

    @ObfuscatedName("bz.b(B)I")
    public static final int method956() {
        return field1899;
    }

    @ObfuscatedName("cm.z(Lee;IIII)Z")
    public static final boolean method1842(class132 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1903;
        if (!var4) {
            return false;
        }
        if (!field1895) {
            int var5 = Statics.field1970;
            int var6 = Statics.field1985;
            int var7 = Statics.field1986;
            int var8 = Statics.field1968;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1899 - Statics.field1935) * var9 / class135.field1926;
            int var12 = (field1894 - Statics.field1927) * var9 / class135.field1926;
            int var13 = (field1899 - Statics.field1935) * var10 / class135.field1926;
            int var14 = (field1894 - Statics.field1927) * var10 / class135.field1926;
            int var15 = class135.method2693(var12, var9, var6, var5);
            int var16 = class135.method2710(var12, var9, var6, var5);
            int var18 = class135.method2693(var14, var10, var6, var5);
            int var19 = class135.method2710(var14, var10, var6, var5);
            int var21 = class135.method2691(var11, var16, var8, var7);
            int var22 = class135.method2692(var11, var16, var8, var7);
            int var24 = class135.method2691(var13, var19, var8, var7);
            int var25 = class135.method2692(var13, var19, var8, var7);
            Statics.field1896 = (var21 + var24) / 2;
            Statics.field2124 = (var15 + var18) / 2;
            Statics.field1897 = (var22 + var25) / 2;
            Statics.field21 = (var24 - var21) / 2;
            Statics.field1892 = (var18 - var15) / 2;
            Statics.field1905 = (var25 - var22) / 2;
            Statics.field3828 = Math.abs(Statics.field21);
            Statics.field1900 = Math.abs(Statics.field1892);
            Statics.field3504 = Math.abs(Statics.field1905);
        }
        int var27 = arg0.field1854 + arg1;
        int var28 = arg0.field1831 + arg2;
        int var29 = arg0.field1856 + arg3;
        int var30 = arg0.field1857;
        int var31 = arg0.field1858;
        int var32 = arg0.field1885;
        int var33 = Statics.field1896 - var27;
        int var34 = Statics.field2124 - var28;
        int var35 = Statics.field1897 - var29;
        if (Math.abs(var33) > Statics.field3828 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field1900 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field3504 + var32) {
            return false;
        } else if (Math.abs(Statics.field1892 * var35 - Statics.field1905 * var34) > Statics.field3504 * var31 + Statics.field1900 * var32) {
            return false;
        } else if (Math.abs(Statics.field1905 * var33 - Statics.field21 * var35) > Statics.field3828 * var32 + Statics.field3504 * var30) {
            return false;
        } else {
            return Math.abs(Statics.field21 * var34 - Statics.field1892 * var33) <= Statics.field3828 * var31 + Statics.field1900 * var30;
        }
    }
}

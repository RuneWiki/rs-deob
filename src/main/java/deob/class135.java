package deob;

@ObfuscatedName("er")
public class class135 {

    @ObfuscatedName("er.d")
    public static boolean field1974 = false;

    @ObfuscatedName("er.q")
    public static int field1968 = 0;

    @ObfuscatedName("er.x")
    public static int field1965 = 0;

    @ObfuscatedName("er.y")
    public static boolean field1966 = false;

    @ObfuscatedName("er.p")
    public static int field1971 = 0;

    @ObfuscatedName("er.u")
    public static int[] field1972 = new int[1000];

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.d(IIB)V")
    public static final void method1994(int arg0, int arg1) {
        field1968 = arg0;
        field1965 = arg1;
        field1974 = true;
        field1971 = 0;
        field1966 = false;
    }

    @ObfuscatedName("et.q(B)Z")
    public static final boolean method2680() {
        return field1974;
    }

    @ObfuscatedName("a.x(B)I")
    public static final int method154() {
        return field1965;
    }

    @ObfuscatedName("bl.y(Lev;IIII)Z")
    public static final boolean method942(class134 arg0, int arg1, int arg2, int arg3) {
        if (!method2680()) {
            return false;
        }
        if (!field1966) {
            int var4 = Statics.field2083;
            int var5 = Statics.field2063;
            int var6 = Statics.field2052;
            int var7 = Statics.field2053;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field1968 - Statics.field2006) * var8 / class137.field1999;
            int var11 = (field1965 - Statics.field1993) * var8 / class137.field1999;
            int var12 = (field1968 - Statics.field2006) * var9 / class137.field1999;
            int var13 = (field1965 - Statics.field1993) * var9 / class137.field1999;
            int var14 = class137.method2388(var11, var8, var5, var4);
            int var15 = class137.method2385(var11, var8, var5, var4);
            int var17 = class137.method2388(var13, var9, var5, var4);
            int var18 = class137.method2385(var13, var9, var5, var4);
            int var20 = class137.method2386(var10, var15, var7, var6);
            int var21 = class137.method2387(var10, var15, var7, var6);
            int var23 = class137.method2386(var12, var18, var7, var6);
            int var24 = class137.method2387(var12, var18, var7, var6);
            Statics.field1967 = (var20 + var23) / 2;
            Statics.field1378 = (var14 + var17) / 2;
            Statics.field1648 = (var21 + var24) / 2;
            Statics.field510 = (var23 - var20) / 2;
            Statics.field3745 = (var17 - var14) / 2;
            Statics.field1970 = (var24 - var21) / 2;
            Statics.field1969 = Math.abs(Statics.field510);
            Statics.field1539 = Math.abs(Statics.field3745);
            Statics.field1973 = Math.abs(Statics.field1970);
        }
        int var26 = arg0.field1926 + arg1;
        int var27 = arg0.field1954 + arg2;
        int var28 = arg0.field1927 + arg3;
        int var29 = arg0.field1907;
        int var30 = arg0.field1929;
        int var31 = arg0.field1930;
        int var32 = Statics.field1967 - var26;
        int var33 = Statics.field1378 - var27;
        int var34 = Statics.field1648 - var28;
        if (Math.abs(var32) > Statics.field1969 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field1539 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field1973 + var31) {
            return false;
        } else if (Math.abs(Statics.field3745 * var34 - Statics.field1970 * var33) > Statics.field1973 * var30 + Statics.field1539 * var31) {
            return false;
        } else if (Math.abs(Statics.field1970 * var32 - Statics.field510 * var34) > Statics.field1973 * var29 + Statics.field1969 * var31) {
            return false;
        } else {
            return Math.abs(Statics.field510 * var33 - Statics.field3745 * var32) <= Statics.field1969 * var30 + Statics.field1539 * var29;
        }
    }

    @ObfuscatedName("at.e(IIIIIIII)Z")
    public static final boolean method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1965 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1965 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1968 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1968 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

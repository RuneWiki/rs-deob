package deob;

@ObfuscatedName("er")
public class class135 {

    @ObfuscatedName("er.p")
    public static boolean field2007 = false;

    @ObfuscatedName("er.m")
    public static int field1995 = 0;

    @ObfuscatedName("er.e")
    public static int field1996 = 0;

    @ObfuscatedName("er.t")
    public static boolean field2005 = false;

    @ObfuscatedName("er.a")
    public static int field2001 = 0;

    @ObfuscatedName("er.g")
    public static int[] field2003 = new int[1000];

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.p(I)V")
    public static final void method455() {
        field2007 = false;
        field2001 = 0;
    }

    @ObfuscatedName("dd.m(IS)V")
    public static final void method2105(int arg0) {
        field2003[++field2001 - 1] = arg0;
    }

    @ObfuscatedName("ij.e(I)Z")
    public static final boolean method4108() {
        return field2007;
    }

    @ObfuscatedName("ib.t(Les;IIII)Z")
    public static final boolean method3700(class134 arg0, int arg1, int arg2, int arg3) {
        if (!method4108()) {
            return false;
        }
        if (!field2005) {
            int var4 = Statics.field2080;
            int var5 = Statics.field2086;
            int var6 = Statics.field2107;
            int var7 = Statics.field2088;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field1995 - Statics.field2026) * var8 / class137.field2025;
            int var11 = (field1996 - Statics.field2027) * var8 / class137.field2025;
            int var12 = (field1995 - Statics.field2026) * var9 / class137.field2025;
            int var13 = (field1996 - Statics.field2027) * var9 / class137.field2025;
            int var14 = class137.method2354(var11, var8, var5, var4);
            int var15 = class137.method2360(var11, var8, var5, var4);
            int var17 = class137.method2354(var13, var9, var5, var4);
            int var18 = class137.method2360(var13, var9, var5, var4);
            int var20 = class137.method2339(var10, var15, var7, var6);
            int var21 = class137.method2340(var10, var15, var7, var6);
            int var23 = class137.method2339(var12, var18, var7, var6);
            int var24 = class137.method2340(var12, var18, var7, var6);
            Statics.field1994 = (var20 + var23) / 2;
            Statics.field1999 = (var14 + var17) / 2;
            Statics.field1275 = (var21 + var24) / 2;
            Statics.field3760 = (var23 - var20) / 2;
            Statics.field2000 = (var17 - var14) / 2;
            Statics.field1302 = (var24 - var21) / 2;
            Statics.field1536 = Math.abs(Statics.field3760);
            Statics.field2210 = Math.abs(Statics.field2000);
            Statics.field1998 = Math.abs(Statics.field1302);
        }
        int var26 = arg0.field1956 + arg1;
        int var27 = arg0.field1957 + arg2;
        int var28 = arg0.field1958 + arg3;
        int var29 = arg0.field1959;
        int var30 = arg0.field1960;
        int var31 = arg0.field1929;
        int var32 = Statics.field1994 - var26;
        int var33 = Statics.field1999 - var27;
        int var34 = Statics.field1275 - var28;
        if (Math.abs(var32) > Statics.field1536 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field2210 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field1998 + var31) {
            return false;
        } else if (Math.abs(Statics.field2000 * var34 - Statics.field1302 * var33) > Statics.field2210 * var31 + Statics.field1998 * var30) {
            return false;
        } else if (Math.abs(Statics.field1302 * var32 - Statics.field3760 * var34) > Statics.field1998 * var29 + Statics.field1536 * var31) {
            return false;
        } else {
            return Math.abs(Statics.field3760 * var33 - Statics.field2000 * var32) <= Statics.field2210 * var29 + Statics.field1536 * var30;
        }
    }

    @ObfuscatedName("bu.w(IIIIIIIB)Z")
    public static final boolean method1343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1996 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1996 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1995 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1995 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

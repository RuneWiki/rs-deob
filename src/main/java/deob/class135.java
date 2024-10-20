package deob;

@ObfuscatedName("ec")
public class class135 {

    @ObfuscatedName("ec.s")
    public static boolean field1998 = false;

    @ObfuscatedName("ec.c")
    public static int field1993 = 0;

    @ObfuscatedName("ec.f")
    public static int field1994 = 0;

    @ObfuscatedName("ec.m")
    public static boolean field1996 = false;

    @ObfuscatedName("ec.k")
    public static int field2002 = 0;

    @ObfuscatedName("ec.e")
    public static int[] field1995 = new int[1000];

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cp.s(B)V")
    public static final void method1714() {
        field1998 = false;
        field2002 = 0;
    }

    @ObfuscatedName("cm.c(II)V")
    public static final void method1666(int arg0) {
        field1995[++field2002 - 1] = arg0;
    }

    @ObfuscatedName("hf.f(Leb;IIIB)Z")
    public static final boolean method3659(class134 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1998;
        if (!var4) {
            return false;
        }
        if (!field1996) {
            int var5 = Statics.field2094;
            int var6 = Statics.field2078;
            int var7 = Statics.field2082;
            int var8 = Statics.field2105;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field1993 - Statics.field2016) * var9 / class137.field2030;
            int var12 = (field1994 - Statics.field2022) * var9 / class137.field2030;
            int var13 = (field1993 - Statics.field2016) * var10 / class137.field2030;
            int var14 = (field1994 - Statics.field2022) * var10 / class137.field2030;
            int var15 = class137.method2455(var12, var9, var6, var5);
            int var16 = class137.method2456(var12, var9, var6, var5);
            int var18 = class137.method2455(var14, var10, var6, var5);
            int var19 = class137.method2456(var14, var10, var6, var5);
            int var21 = class137.method2453(var11, var16, var8, var7);
            int var22 = class137.method2457(var11, var16, var8, var7);
            int var24 = class137.method2453(var13, var19, var8, var7);
            int var25 = class137.method2457(var13, var19, var8, var7);
            Statics.field16 = (var21 + var24) / 2;
            Statics.field873 = (var15 + var18) / 2;
            Statics.field1997 = (var22 + var25) / 2;
            Statics.field2001 = (var24 - var21) / 2;
            Statics.field682 = (var18 - var15) / 2;
            Statics.field660 = (var25 - var22) / 2;
            Statics.field1999 = Math.abs(Statics.field2001);
            Statics.field2273 = Math.abs(Statics.field682);
            Statics.field2000 = Math.abs(Statics.field660);
        }
        int var27 = arg0.field1962 + arg1;
        int var28 = arg0.field1956 + arg2;
        int var29 = arg0.field1976 + arg3;
        int var30 = arg0.field1959;
        int var31 = arg0.field1974;
        int var32 = arg0.field1960;
        int var33 = Statics.field16 - var27;
        int var34 = Statics.field873 - var28;
        int var35 = Statics.field1997 - var29;
        if (Math.abs(var33) > Statics.field1999 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field2273 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field2000 + var32) {
            return false;
        } else if (Math.abs(Statics.field682 * var35 - Statics.field660 * var34) > Statics.field2273 * var32 + Statics.field2000 * var31) {
            return false;
        } else if (Math.abs(Statics.field660 * var33 - Statics.field2001 * var35) > Statics.field2000 * var30 + Statics.field1999 * var32) {
            return false;
        } else {
            return Math.abs(Statics.field2001 * var34 - Statics.field682 * var33) <= Statics.field2273 * var30 + Statics.field1999 * var31;
        }
    }
}

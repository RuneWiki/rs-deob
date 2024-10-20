package deob;

@ObfuscatedName("ep")
public class class135 {

    @ObfuscatedName("ep.e")
    public static boolean field2000 = false;

    @ObfuscatedName("ep.o")
    public static int field1990 = 0;

    @ObfuscatedName("ep.m")
    public static int field1991 = 0;

    @ObfuscatedName("ep.g")
    public static boolean field1992 = false;

    @ObfuscatedName("ep.n")
    public static int field1998 = 0;

    @ObfuscatedName("ep.c")
    public static int[] field1999 = new int[1000];

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.e(IIB)V")
    public static final void method2646(int arg0, int arg1) {
        field1990 = arg0;
        field1991 = arg1;
        field2000 = true;
        field1998 = 0;
        field1992 = false;
    }

    @ObfuscatedName("ix.o(II)V")
    public static final void method3995(int arg0) {
        field1999[++field1998 - 1] = arg0;
    }

    @ObfuscatedName("ed.m(I)Z")
    public static final boolean method2458() {
        return field2000;
    }

    @ObfuscatedName("eu.g(Leo;IIII)Z")
    public static final boolean method2380(class134 arg0, int arg1, int arg2, int arg3) {
        if (!method2458()) {
            return false;
        }
        if (!field1992) {
            int var4 = Statics.field2080;
            int var5 = Statics.field2081;
            int var6 = Statics.field2072;
            int var7 = Statics.field2083;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field1990 - Statics.field2011) * var8 / class137.field2021;
            int var11 = (field1991 - Statics.field2022) * var8 / class137.field2021;
            int var12 = (field1990 - Statics.field2011) * var9 / class137.field2021;
            int var13 = (field1991 - Statics.field2022) * var9 / class137.field2021;
            int var14 = class137.method2446(var11, var8, var5, var4);
            int var15 = class137.method2404(var11, var8, var5, var4);
            int var17 = class137.method2446(var13, var9, var5, var4);
            int var18 = class137.method2404(var13, var9, var5, var4);
            int var20 = class137.method2401(var10, var15, var7, var6);
            int var21 = class137.method2437(var10, var15, var7, var6);
            int var23 = class137.method2401(var12, var18, var7, var6);
            int var24 = class137.method2437(var12, var18, var7, var6);
            Statics.field263 = (var20 + var23) / 2;
            Statics.field1989 = (var14 + var17) / 2;
            Statics.field2001 = (var21 + var24) / 2;
            Statics.field1995 = (var23 - var20) / 2;
            Statics.field3124 = (var17 - var14) / 2;
            Statics.field310 = (var24 - var21) / 2;
            Statics.field1996 = Math.abs(Statics.field1995);
            Statics.field1997 = Math.abs(Statics.field3124);
            Statics.field1629 = Math.abs(Statics.field310);
        }
        int var26 = arg0.field1951 + arg1;
        int var27 = arg0.field1952 + arg2;
        int var28 = arg0.field1953 + arg3;
        int var29 = arg0.field1954;
        int var30 = arg0.field1920;
        int var31 = arg0.field1986;
        int var32 = Statics.field263 - var26;
        int var33 = Statics.field1989 - var27;
        int var34 = Statics.field2001 - var28;
        if (Math.abs(var32) > Statics.field1996 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field1997 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field1629 + var31) {
            return false;
        } else if (Math.abs(Statics.field3124 * var34 - Statics.field310 * var33) > Statics.field1997 * var31 + Statics.field1629 * var30) {
            return false;
        } else if (Math.abs(Statics.field310 * var32 - Statics.field1995 * var34) > Statics.field1996 * var31 + Statics.field1629 * var29) {
            return false;
        } else {
            return Math.abs(Statics.field1995 * var33 - Statics.field3124 * var32) <= Statics.field1997 * var29 + Statics.field1996 * var30;
        }
    }
}

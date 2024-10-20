package deob;

@ObfuscatedName("ex")
public class class135 {

    @ObfuscatedName("ex.i")
    public static boolean field2004 = false;

    @ObfuscatedName("ex.w")
    public static int field2015 = 0;

    @ObfuscatedName("ex.a")
    public static int field2009 = 0;

    @ObfuscatedName("ex.t")
    public static boolean field2005 = false;

    @ObfuscatedName("ex.l")
    public static int field2011 = 0;

    @ObfuscatedName("ex.c")
    public static int[] field2012 = new int[1000];

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.i(B)V")
    public static final void method233() {
        field2004 = false;
        field2011 = 0;
    }

    @ObfuscatedName("gr.w(II)V")
    public static final void method3149(int arg0) {
        field2012[++field2011 - 1] = arg0;
    }

    @ObfuscatedName("bs.a(Let;IIII)Z")
    public static final boolean method1016(class134 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field2004;
        if (!var4) {
            return false;
        }
        if (!field2005) {
            int var5 = Statics.field2116;
            int var6 = Statics.field2096;
            int var7 = Statics.field2125;
            int var8 = Statics.field2076;
            byte var9 = 50;
            short var10 = 3500;
            int var11 = (field2015 - Statics.field2035) * var9 / class137.field2032;
            int var12 = (field2009 - Statics.field2034) * var9 / class137.field2032;
            int var13 = (field2015 - Statics.field2035) * var10 / class137.field2032;
            int var14 = (field2009 - Statics.field2034) * var10 / class137.field2032;
            int var15 = class137.method2418(var12, var9, var6, var5);
            int var16 = class137.method2362(var12, var9, var6, var5);
            int var18 = class137.method2418(var14, var10, var6, var5);
            int var19 = class137.method2362(var14, var10, var6, var5);
            int var21 = class137.method2378(var11, var16, var8, var7);
            int var22 = class137.method2384(var11, var16, var8, var7);
            int var24 = class137.method2378(var13, var19, var8, var7);
            int var25 = class137.method2384(var13, var19, var8, var7);
            Statics.field2002 = (var21 + var24) / 2;
            Statics.field2007 = (var15 + var18) / 2;
            Statics.field2008 = (var22 + var25) / 2;
            Statics.field398 = (var24 - var21) / 2;
            Statics.field2003 = (var18 - var15) / 2;
            Statics.field2583 = (var25 - var22) / 2;
            Statics.field2010 = Math.abs(Statics.field398);
            Statics.field3322 = Math.abs(Statics.field2003);
            Statics.field1577 = Math.abs(Statics.field2583);
        }
        int var27 = arg0.field1970 + arg1;
        int var28 = arg0.field1990 + arg2;
        int var29 = arg0.field1933 + arg3;
        int var30 = arg0.field1967;
        int var31 = arg0.field1968;
        int var32 = arg0.field1969;
        int var33 = Statics.field2002 - var27;
        int var34 = Statics.field2007 - var28;
        int var35 = Statics.field2008 - var29;
        if (Math.abs(var33) > Statics.field2010 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field3322 + var31) {
            return false;
        } else if (Math.abs(var35) > Statics.field1577 + var32) {
            return false;
        } else if (Math.abs(Statics.field2003 * var35 - Statics.field2583 * var34) > Statics.field3322 * var32 + Statics.field1577 * var31) {
            return false;
        } else if (Math.abs(Statics.field2583 * var33 - Statics.field398 * var35) > Statics.field2010 * var32 + Statics.field1577 * var30) {
            return false;
        } else {
            return Math.abs(Statics.field398 * var34 - Statics.field2003 * var33) <= Statics.field3322 * var30 + Statics.field2010 * var31;
        }
    }
}

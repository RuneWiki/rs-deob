package deob;

@ObfuscatedName("ez")
public class class135 {

    @ObfuscatedName("ez.i")
    public static boolean field2019 = false;

    @ObfuscatedName("ez.c")
    public static int field2009 = 0;

    @ObfuscatedName("ez.e")
    public static int field2008 = 0;

    @ObfuscatedName("ez.v")
    public static boolean field2016 = false;

    @ObfuscatedName("ez.q")
    public static int field2014 = 0;

    @ObfuscatedName("ez.j")
    public static int[] field2015 = new int[1000];

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.i(I)V")
    public static final void method97() {
        field2019 = false;
        field2014 = 0;
    }

    @ObfuscatedName("bf.c(I)Z")
    public static final boolean method771() {
        return field2019;
    }

    @ObfuscatedName("hr.e(I)I")
    public static final int method3747() {
        return field2009;
    }

    @ObfuscatedName("ew.v(I)I")
    public static final int method2647() {
        return field2008;
    }

    @ObfuscatedName("hu.y(Led;IIII)Z")
    public static final boolean method3749(class134 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field2019;
        if (!var4) {
            return false;
        }
        Statics.method2853();
        int var5 = arg0.field1970 + arg1;
        int var6 = arg0.field1938 + arg2;
        int var7 = arg0.field1981 + arg3;
        int var8 = arg0.field1973;
        int var9 = arg0.field1974;
        int var10 = arg0.field1982;
        int var11 = Statics.field2012 - var5;
        int var12 = Statics.field2011 - var6;
        int var13 = Statics.field843 - var7;
        if (Math.abs(var11) > Statics.field354 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field305 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field2196 + var10) {
            return false;
        } else if (Math.abs(Statics.field3141 * var13 - Statics.field1430 * var12) > Statics.field305 * var10 + Statics.field2196 * var9) {
            return false;
        } else if (Math.abs(Statics.field1430 * var11 - Statics.field2240 * var13) > Statics.field354 * var10 + Statics.field2196 * var8) {
            return false;
        } else {
            return Math.abs(Statics.field2240 * var12 - Statics.field3141 * var11) <= Statics.field354 * var9 + Statics.field305 * var8;
        }
    }

    @ObfuscatedName("eu.h(IIIIIIII)Z")
    public static final boolean method2656(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2008 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2008 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2009 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2009 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

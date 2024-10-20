package deob;

@ObfuscatedName("ee")
public class class135 {

    @ObfuscatedName("ee.n")
    public static boolean field2008 = false;

    @ObfuscatedName("ee.p")
    public static int field2002 = 0;

    @ObfuscatedName("ee.i")
    public static int field2004 = 0;

    @ObfuscatedName("ee.j")
    public static boolean field2005 = false;

    @ObfuscatedName("ee.a")
    public static int field2010 = 0;

    @ObfuscatedName("ee.y")
    public static int[] field2003 = new int[1000];

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.n(I)V")
    public static final void method91() {
        field2008 = false;
        field2010 = 0;
    }

    @ObfuscatedName("fr.p(I)Z")
    public static final boolean method2883() {
        return field2008;
    }

    @ObfuscatedName("v.i(I)I")
    public static final int method145() {
        return field2002;
    }

    @ObfuscatedName("er.j(Lek;IIIB)Z")
    public static final boolean method2685(class134 arg0, int arg1, int arg2, int arg3) {
        if (!method2883()) {
            return false;
        }
        if (!field2005) {
            int var4 = Statics.field2087;
            int var5 = Statics.field2115;
            int var6 = Statics.field2089;
            int var7 = Statics.field2100;
            byte var8 = 50;
            short var9 = 3500;
            int var10 = (field2002 - Statics.field2030) * var8 / class137.field2029;
            int var11 = (field2004 - Statics.field2031) * var8 / class137.field2029;
            int var12 = (field2002 - Statics.field2030) * var9 / class137.field2029;
            int var13 = (field2004 - Statics.field2031) * var9 / class137.field2029;
            int var14 = class137.method2449(var11, var8, var5, var4);
            int var15 = class137.method2476(var11, var8, var5, var4);
            int var17 = class137.method2449(var13, var9, var5, var4);
            int var18 = class137.method2476(var13, var9, var5, var4);
            int var20 = class137.method2477(var10, var15, var7, var6);
            int var21 = class137.method2423(var10, var15, var7, var6);
            int var23 = class137.method2477(var12, var18, var7, var6);
            int var24 = class137.method2423(var12, var18, var7, var6);
            Statics.field1527 = (var20 + var23) / 2;
            Statics.field2011 = (var14 + var17) / 2;
            Statics.field2006 = (var21 + var24) / 2;
            Statics.field2012 = (var23 - var20) / 2;
            Statics.field254 = (var17 - var14) / 2;
            Statics.field769 = (var24 - var21) / 2;
            Statics.field23 = Math.abs(Statics.field2012);
            Statics.field1787 = Math.abs(Statics.field254);
            Statics.field2009 = Math.abs(Statics.field769);
        }
        int var26 = arg0.field1993 + arg1;
        int var27 = arg0.field1933 + arg2;
        int var28 = arg0.field1934 + arg3;
        int var29 = arg0.field1967;
        int var30 = arg0.field1968;
        int var31 = arg0.field1954;
        int var32 = Statics.field1527 - var26;
        int var33 = Statics.field2011 - var27;
        int var34 = Statics.field2006 - var28;
        if (Math.abs(var32) > Statics.field23 + var29) {
            return false;
        } else if (Math.abs(var33) > Statics.field1787 + var30) {
            return false;
        } else if (Math.abs(var34) > Statics.field2009 + var31) {
            return false;
        } else if (Math.abs(Statics.field254 * var34 - Statics.field769 * var33) > Statics.field2009 * var30 + Statics.field1787 * var31) {
            return false;
        } else if (Math.abs(Statics.field769 * var32 - Statics.field2012 * var34) > Statics.field23 * var31 + Statics.field2009 * var29) {
            return false;
        } else {
            return Math.abs(Statics.field2012 * var33 - Statics.field254 * var32) <= Statics.field23 * var30 + Statics.field1787 * var29;
        }
    }
}

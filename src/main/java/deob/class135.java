package deob;

@ObfuscatedName("eq")
public class class135 {

    @ObfuscatedName("eq.w")
    public static boolean field2002 = false;

    @ObfuscatedName("eq.o")
    public static int field2005 = 0;

    @ObfuscatedName("eq.x")
    public static int field2008 = 0;

    @ObfuscatedName("eq.k")
    public static boolean field2004 = false;

    @ObfuscatedName("eq.p")
    public static int field2006 = 0;

    @ObfuscatedName("eq.q")
    public static int[] field2007 = new int[1000];

    public class135() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("da.w(III)V")
    public static final void method1870(int arg0, int arg1) {
        field2005 = arg0;
        field2008 = arg1;
        field2002 = true;
        field2006 = 0;
        field2004 = false;
    }

    @ObfuscatedName("cq.o(I)V")
    public static final void method1531() {
        field2002 = false;
        field2006 = 0;
    }

    @ObfuscatedName("n.x(B)I")
    public static final int method116() {
        return field2005;
    }

    @ObfuscatedName("u.k(B)I")
    public static final int method41() {
        return field2008;
    }

    @ObfuscatedName("ar.f(B)V")
    public static final void method248() {
        if (field2004) {
            return;
        }
        int var0 = Statics.field2125;
        int var1 = Statics.field2105;
        int var2 = Statics.field2069;
        int var3 = Statics.field2092;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2005 - Statics.field2030) * var4 / class137.field2029;
        int var7 = (field2008 - Statics.field2042) * var4 / class137.field2029;
        int var8 = (field2005 - Statics.field2030) * var5 / class137.field2029;
        int var9 = (field2008 - Statics.field2042) * var5 / class137.field2029;
        int var10 = class137.method2370(var7, var4, var1, var0);
        int var11 = class137.method2384(var7, var4, var1, var0);
        int var13 = class137.method2370(var9, var5, var1, var0);
        int var14 = class137.method2384(var9, var5, var1, var0);
        int var16 = class137.method2368(var6, var11, var3, var2);
        int var17 = class137.method2415(var6, var11, var3, var2);
        int var19 = class137.method2368(var8, var14, var3, var2);
        int var20 = class137.method2415(var8, var14, var3, var2);
        Statics.field277 = (var16 + var19) / 2;
        Statics.field3319 = (var10 + var13) / 2;
        Statics.field701 = (var17 + var20) / 2;
        Statics.field848 = (var19 - var16) / 2;
        Statics.field3284 = (var13 - var10) / 2;
        Statics.field41 = (var20 - var17) / 2;
        Statics.field762 = Math.abs(Statics.field848);
        Statics.field273 = Math.abs(Statics.field3284);
        Statics.field3180 = Math.abs(Statics.field41);
    }

    @ObfuscatedName("cl.i(Lev;IIIB)Z")
    public static final boolean method1457(class134 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field2002;
        if (!var4) {
            return false;
        }
        method248();
        int var5 = arg0.field1942 + arg1;
        int var6 = arg0.field1965 + arg2;
        int var7 = arg0.field1966 + arg3;
        int var8 = arg0.field1967;
        int var9 = arg0.field1978;
        int var10 = arg0.field1969;
        int var11 = Statics.field277 - var5;
        int var12 = Statics.field3319 - var6;
        int var13 = Statics.field701 - var7;
        if (Math.abs(var11) > Statics.field762 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field273 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field3180 + var10) {
            return false;
        } else if (Math.abs(Statics.field3284 * var13 - Statics.field41 * var12) > Statics.field3180 * var9 + Statics.field273 * var10) {
            return false;
        } else if (Math.abs(Statics.field41 * var11 - Statics.field848 * var13) > Statics.field762 * var10 + Statics.field3180 * var8) {
            return false;
        } else {
            return Math.abs(Statics.field848 * var12 - Statics.field3284 * var11) <= Statics.field762 * var9 + Statics.field273 * var8;
        }
    }
}

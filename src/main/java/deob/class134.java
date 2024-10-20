package deob;

@ObfuscatedName("eo")
public class class134 {

    @ObfuscatedName("eo.m")
    public static boolean field1918 = false;

    @ObfuscatedName("eo.p")
    public static int field1915 = 0;

    @ObfuscatedName("eo.i")
    public static int field1913 = 0;

    @ObfuscatedName("eo.j")
    public static boolean field1916 = false;

    @ObfuscatedName("eo.w")
    public static int field1922 = 0;

    @ObfuscatedName("eo.k")
    public static int[] field1923 = new int[1000];

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fy.m(B)V")
    public static final void method2930() {
        field1918 = false;
        field1922 = 0;
    }

    @ObfuscatedName("bo.p(I)Z")
    public static final boolean method744() {
        return field1918;
    }

    @ObfuscatedName("cu.j(I)V")
    public static final void method1738() {
        if (field1916) {
            return;
        }
        int var0 = Statics.field1997;
        int var1 = Statics.field1998;
        int var2 = Statics.field1971;
        int var3 = Statics.field2000;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1915 - Statics.field1942) * var4 / class136.field1941;
        int var7 = (field1913 - Statics.field1935) * var4 / class136.field1941;
        int var8 = (field1915 - Statics.field1942) * var5 / class136.field1941;
        int var9 = (field1913 - Statics.field1935) * var5 / class136.field1941;
        int var10 = class136.method2495(var7, var4, var1, var0);
        int var11 = class136.method2536(var7, var4, var1, var0);
        int var13 = class136.method2495(var9, var5, var1, var0);
        int var14 = class136.method2536(var9, var5, var1, var0);
        int var16 = class136.method2493(var6, var11, var3, var2);
        int var17 = class136.method2494(var6, var11, var3, var2);
        int var19 = class136.method2493(var8, var14, var3, var2);
        int var20 = class136.method2494(var8, var14, var3, var2);
        Statics.field1920 = (var16 + var19) / 2;
        Statics.field1917 = (var10 + var13) / 2;
        Statics.field476 = (var17 + var20) / 2;
        Statics.field1919 = (var19 - var16) / 2;
        Statics.field3445 = (var13 - var10) / 2;
        Statics.field1914 = (var20 - var17) / 2;
        Statics.field1424 = Math.abs(Statics.field1919);
        Statics.field1921 = Math.abs(Statics.field3445);
        Statics.field3260 = Math.abs(Statics.field1914);
    }

    @ObfuscatedName("ad.v(Len;IIIB)Z")
    public static final boolean method679(class133 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1918;
        if (!var4) {
            return false;
        }
        method1738();
        int var5 = arg0.field1893 + arg1;
        int var6 = arg0.field1876 + arg2;
        int var7 = arg0.field1877 + arg3;
        int var8 = arg0.field1878;
        int var9 = arg0.field1879;
        int var10 = arg0.field1880;
        int var11 = Statics.field1920 - var5;
        int var12 = Statics.field1917 - var6;
        int var13 = Statics.field476 - var7;
        if (Math.abs(var11) > Statics.field1424 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field1921 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field3260 + var10) {
            return false;
        } else if (Math.abs(Statics.field3445 * var13 - Statics.field1914 * var12) > Statics.field3260 * var9 + Statics.field1921 * var10) {
            return false;
        } else if (Math.abs(Statics.field1914 * var11 - Statics.field1919 * var13) > Statics.field3260 * var8 + Statics.field1424 * var10) {
            return false;
        } else {
            return Math.abs(Statics.field1919 * var12 - Statics.field3445 * var11) <= Statics.field1921 * var8 + Statics.field1424 * var9;
        }
    }

    @ObfuscatedName("ai.x(IIIIIIIB)Z")
    public static final boolean method595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1913 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1913 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1915 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1915 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

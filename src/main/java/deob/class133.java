package deob;

@ObfuscatedName("ec")
public class class133 {

    @ObfuscatedName("ec.c")
    public static boolean field1917 = false;

    @ObfuscatedName("ec.i")
    public static int field1913 = 0;

    @ObfuscatedName("ec.o")
    public static int field1920 = 0;

    @ObfuscatedName("ec.j")
    public static boolean field1915 = false;

    @ObfuscatedName("ec.f")
    public static int field1914 = 0;

    @ObfuscatedName("ec.l")
    public static int[] field1921 = new int[1000];

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("av.c(III)V")
    public static final void method614(int arg0, int arg1) {
        field1913 = arg0;
        field1920 = arg1;
        field1917 = true;
        field1914 = 0;
        field1915 = false;
    }

    @ObfuscatedName("cf.i(II)V")
    public static final void method1837(int arg0) {
        field1921[++field1914 - 1] = arg0;
    }

    @ObfuscatedName("ag.o(I)I")
    public static final int method558() {
        return field1920;
    }

    @ObfuscatedName("fl.j(B)V")
    public static final void method3005() {
        if (field1915) {
            return;
        }
        int var0 = Statics.field2003;
        int var1 = Statics.field2039;
        int var2 = Statics.field2005;
        int var3 = Statics.field2026;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1913 - Statics.field1943) * var4 / class135.field1942;
        int var7 = (field1920 - Statics.field1944) * var4 / class135.field1942;
        int var8 = (field1913 - Statics.field1943) * var5 / class135.field1942;
        int var9 = (field1920 - Statics.field1944) * var5 / class135.field1942;
        int var10 = class135.method2601(var7, var4, var1, var0);
        int var11 = class135.method2602(var7, var4, var1, var0);
        int var13 = class135.method2601(var9, var5, var1, var0);
        int var14 = class135.method2602(var9, var5, var1, var0);
        int var16 = class135.method2599(var6, var11, var3, var2);
        int var17 = class135.method2600(var6, var11, var3, var2);
        int var19 = class135.method2599(var8, var14, var3, var2);
        int var20 = class135.method2600(var8, var14, var3, var2);
        Statics.field1916 = (var16 + var19) / 2;
        Statics.field1571 = (var10 + var13) / 2;
        Statics.field1919 = (var17 + var20) / 2;
        Statics.field307 = (var19 - var16) / 2;
        Statics.field1407 = (var13 - var10) / 2;
        Statics.field1918 = (var20 - var17) / 2;
        Statics.field358 = Math.abs(Statics.field307);
        Statics.field1471 = Math.abs(Statics.field1407);
        Statics.field2259 = Math.abs(Statics.field1918);
    }

    @ObfuscatedName("ap.k(Led;IIII)Z")
    public static final boolean method224(class132 arg0, int arg1, int arg2, int arg3) {
        boolean var4 = field1917;
        if (!var4) {
            return false;
        }
        method3005();
        int var5 = arg0.field1874 + arg1;
        int var6 = arg0.field1875 + arg2;
        int var7 = arg0.field1876 + arg3;
        int var8 = arg0.field1877;
        int var9 = arg0.field1878;
        int var10 = arg0.field1879;
        int var11 = Statics.field1916 - var5;
        int var12 = Statics.field1571 - var6;
        int var13 = Statics.field1919 - var7;
        if (Math.abs(var11) > Statics.field358 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field1471 + var9) {
            return false;
        } else if (Math.abs(var13) > Statics.field2259 + var10) {
            return false;
        } else if (Math.abs(Statics.field1407 * var13 - Statics.field1918 * var12) > Statics.field2259 * var9 + Statics.field1471 * var10) {
            return false;
        } else if (Math.abs(Statics.field1918 * var11 - Statics.field307 * var13) > Statics.field358 * var10 + Statics.field2259 * var8) {
            return false;
        } else {
            return Math.abs(Statics.field307 * var12 - Statics.field1407 * var11) <= Statics.field358 * var9 + Statics.field1471 * var8;
        }
    }
}

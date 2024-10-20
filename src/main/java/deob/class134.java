package deob;

@ObfuscatedName("ek")
public class class134 {

    @ObfuscatedName("ek.b")
    public static boolean field1904 = false;

    @ObfuscatedName("ek.s")
    public static int field1901 = 0;

    @ObfuscatedName("ek.r")
    public static int field1907 = 0;

    @ObfuscatedName("ek.g")
    public static boolean field1909 = false;

    @ObfuscatedName("ek.q")
    public static int field1908 = 0;

    @ObfuscatedName("ek.j")
    public static int[] field1903 = new int[1000];

    public class134() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.b(IIS)V")
    public static final void method1689(int arg0, int arg1) {
        field1901 = arg0;
        field1907 = arg1;
        field1904 = true;
        field1908 = 0;
        field1909 = false;
    }

    @ObfuscatedName("bv.s(II)V")
    public static final void method952(int arg0) {
        field1903[++field1908 - 1] = arg0;
    }

    @ObfuscatedName("ei.r(I)Z")
    public static final boolean method2485() {
        return field1904;
    }

    @ObfuscatedName("d.g(B)I")
    public static final int method52() {
        return field1907;
    }

    @ObfuscatedName("e.x(I)V")
    public static final void method158() {
        if (field1909) {
            return;
        }
        int var0 = Statics.field1991;
        int var1 = Statics.field1983;
        int var2 = Statics.field2003;
        int var3 = Statics.field1985;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1901 - Statics.field1917) * var4 / class136.field1927;
        int var7 = (field1907 - Statics.field1941) * var4 / class136.field1927;
        int var8 = (field1901 - Statics.field1917) * var5 / class136.field1927;
        int var9 = (field1907 - Statics.field1941) * var5 / class136.field1927;
        int var10 = class136.method2424(var7, var4, var1, var0);
        int var11 = class136.method2425(var7, var4, var1, var0);
        int var13 = class136.method2424(var9, var5, var1, var0);
        int var14 = class136.method2425(var9, var5, var1, var0);
        int var16 = class136.method2410(var6, var11, var3, var2);
        int var17 = class136.method2468(var6, var11, var3, var2);
        int var19 = class136.method2410(var8, var14, var3, var2);
        int var20 = class136.method2468(var8, var14, var3, var2);
        Statics.field1905 = (var16 + var19) / 2;
        Statics.field1393 = (var10 + var13) / 2;
        Statics.field1906 = (var17 + var20) / 2;
        Statics.field1574 = (var19 - var16) / 2;
        Statics.field1209 = (var13 - var10) / 2;
        Statics.field1902 = (var20 - var17) / 2;
        Statics.field612 = Math.abs(Statics.field1574);
        Statics.field318 = Math.abs(Statics.field1209);
        Statics.field855 = Math.abs(Statics.field1902);
    }

    @ObfuscatedName("eq.u(IIIIIIII)Z")
    public static final boolean method2741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field1907 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field1907 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field1901 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field1901 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}

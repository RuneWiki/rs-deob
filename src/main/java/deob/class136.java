package deob;

@ObfuscatedName("es")
public class class136 {

    @ObfuscatedName("es.e")
    public static boolean field1985 = false;

    @ObfuscatedName("es.n")
    public static int field1984 = 0;

    @ObfuscatedName("es.g")
    public static int field1992 = 0;

    @ObfuscatedName("es.y")
    public static boolean field1994 = false;

    @ObfuscatedName("es.h")
    public static int field1989 = 0;

    @ObfuscatedName("es.s")
    public static int[] field1990 = new int[1000];

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.e(I)V")
    public static final void method1404() {
        field1985 = false;
        field1989 = 0;
    }

    @ObfuscatedName("as.n(I)Z")
    public static final boolean method543() {
        return field1985;
    }

    @ObfuscatedName("cj.g(B)I")
    public static final int method1541() {
        return field1992;
    }

    @ObfuscatedName("ce.y(B)V")
    public static final void method1682() {
        if (field1994) {
            return;
        }
        int var0 = Statics.field2083;
        int var1 = Statics.field2058;
        int var2 = Statics.field2075;
        int var3 = Statics.field2076;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field1984 - Statics.field2013) * var4 / class138.field2012;
        int var7 = (field1992 - Statics.field2025) * var4 / class138.field2012;
        int var8 = (field1984 - Statics.field2013) * var5 / class138.field2012;
        int var9 = (field1992 - Statics.field2025) * var5 / class138.field2012;
        int var10 = class138.method2450(var7, var4, var1, var0);
        int var11 = class138.method2499(var7, var4, var1, var0);
        int var13 = class138.method2450(var9, var5, var1, var0);
        int var14 = class138.method2499(var9, var5, var1, var0);
        int var16 = class138.method2448(var6, var11, var3, var2);
        int var17 = class138.method2449(var6, var11, var3, var2);
        int var19 = class138.method2448(var8, var14, var3, var2);
        int var20 = class138.method2449(var8, var14, var3, var2);
        Statics.field1987 = (var16 + var19) / 2;
        Statics.field327 = (var10 + var13) / 2;
        Statics.field33 = (var17 + var20) / 2;
        Statics.field1429 = (var19 - var16) / 2;
        Statics.field3219 = (var13 - var10) / 2;
        Statics.field2028 = (var20 - var17) / 2;
        Statics.field1988 = Math.abs(Statics.field1429);
        Statics.field326 = Math.abs(Statics.field3219);
        Statics.field791 = Math.abs(Statics.field2028);
    }

    @ObfuscatedName("cx.w(Lew;IIII)Z")
    public static final boolean method1613(class135 arg0, int arg1, int arg2, int arg3) {
        if (!method543()) {
            return false;
        }
        method1682();
        int var4 = arg0.field1945 + arg1;
        int var5 = arg0.field1946 + arg2;
        int var6 = arg0.field1947 + arg3;
        int var7 = arg0.field1940;
        int var8 = arg0.field1949;
        int var9 = arg0.field1943;
        int var10 = Statics.field1987 - var4;
        int var11 = Statics.field327 - var5;
        int var12 = Statics.field33 - var6;
        if (Math.abs(var10) > Statics.field1988 + var7) {
            return false;
        } else if (Math.abs(var11) > Statics.field326 + var8) {
            return false;
        } else if (Math.abs(var12) > Statics.field791 + var9) {
            return false;
        } else if (Math.abs(Statics.field3219 * var12 - Statics.field2028 * var11) > Statics.field791 * var8 + Statics.field326 * var9) {
            return false;
        } else if (Math.abs(Statics.field2028 * var10 - Statics.field1429 * var12) > Statics.field791 * var7 + Statics.field1988 * var9) {
            return false;
        } else {
            return Math.abs(Statics.field1429 * var11 - Statics.field3219 * var10) <= Statics.field326 * var7 + Statics.field1988 * var8;
        }
    }
}

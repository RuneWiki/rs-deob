package deob;

@ObfuscatedName("x")
public class class8 {

    @ObfuscatedName("x.i")
    public static boolean field237 = false;

    @ObfuscatedName("x.c")
    public static boolean field236 = false;

    @ObfuscatedName("x.e")
    public static boolean field238 = false;

    @ObfuscatedName("x.v")
    public static class12 field241 = class12.field269;

    @ObfuscatedName("x.b")
    public static class192 field240 = new class192();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bz.i(Led;IIII)V")
    public static final void method940(class134 arg0, int arg1, int arg2, int arg3) {
        if (class135.method3749(arg0, arg1, arg2, arg3)) {
            method748(arg0, arg1, arg2, arg3, -65281);
        } else if (field241 == class12.field264) {
            method748(arg0, arg1, arg2, arg3, -16776961);
        }
    }

    @ObfuscatedName("bp.c(Led;IB)V")
    public static final void method1383(class134 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1946; var2++) {
            if (arg0.field1952[var2] != -2) {
                int var3 = arg0.field1947[var2];
                int var4 = arg0.field1948[var2];
                int var5 = arg0.field1949[var2];
                int var6 = class134.field1979[var3];
                int var7 = class134.field1979[var4];
                int var8 = class134.field1979[var5];
                int var9 = class134.field1980[var3];
                int var10 = class134.field1980[var4];
                int var11 = class134.field1980[var5];
                int var12 = Math.min(var6, Math.min(var7, var8)) - arg1;
                int var13 = Math.max(var6, Math.max(var7, var8)) + arg1;
                int var14 = Math.min(var9, Math.min(var10, var11)) - arg1;
                int var15 = Math.max(var9, Math.max(var10, var11)) + arg1;
                method857(var12, var14, var13, var15, -49088);
            }
        }
    }

    @ObfuscatedName("bf.e(Led;IIIII)V")
    public static final void method748(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        field240.method3249(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("bg.v(IIIIIS)V")
    public static final void method857(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field240.method3249(new class9(arg0, arg1, arg2, arg3, arg4));
    }
}

package deob;

@ObfuscatedName("z")
public class class8 {

    @ObfuscatedName("z.n")
    public static boolean field232 = false;

    @ObfuscatedName("z.p")
    public static boolean field233 = false;

    @ObfuscatedName("z.i")
    public static boolean field236 = false;

    @ObfuscatedName("z.j")
    public static class12 field235 = class12.field269;

    @ObfuscatedName("z.f")
    public static class192 field237 = new class192();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("he.n(Lek;II)V")
    public static final void method3671(class134 arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.field1940; var2++) {
            if (arg0.field1948[var2] != -2) {
                int var3 = arg0.field1999[var2];
                int var4 = arg0.field1942[var2];
                int var5 = arg0.field1943[var2];
                int var6 = class134.field1973[var3];
                int var7 = class134.field1973[var4];
                int var8 = class134.field1973[var5];
                method2480(class134.field1974[var3], class134.field1974[var4], class134.field1974[var5], var6, var7, var8, arg1);
            }
        }
    }

    @ObfuscatedName("ey.p(IIIIIIII)V")
    public static final void method2480(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        method236(var7, var9, var8, var10, -49088);
    }

    @ObfuscatedName("by.i(Lek;IIIII)V")
    public static final void method980(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        field237.method3324(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("ad.j(IIIIIB)V")
    public static final void method236(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field237.method3324(new class9(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("he.f(I)V")
    public static final void method3668() {
        while (true) {
            class10 var0 = (class10) field237.method3320();
            if (var0 == null) {
                return;
            }
            var0.method48();
        }
    }
}

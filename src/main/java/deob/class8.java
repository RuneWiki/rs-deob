package deob;

@ObfuscatedName("p")
public class class8 {

    @ObfuscatedName("p.c")
    public static boolean field229 = false;

    @ObfuscatedName("p.i")
    public static boolean field226 = false;

    @ObfuscatedName("p.o")
    public static boolean field228 = false;

    @ObfuscatedName("p.j")
    public static class12 field231 = class12.field255;

    @ObfuscatedName("p.k")
    public static class216 field230 = new class216();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.c(IIIIIIIS)V")
    public static final void method386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        Statics.method4171(var7, var9, var8, var10, -49088);
    }

    @ObfuscatedName("aw.i(Led;IIIIB)V")
    public static final void method516(class132 arg0, int arg1, int arg2, int arg3, int arg4) {
        field230.method3680(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("cy.j(I)V")
    public static final void method1660() {
        while (true) {
            class10 var0 = (class10) field230.method3702();
            if (var0 == null) {
                return;
            }
            var0.method43();
        }
    }
}

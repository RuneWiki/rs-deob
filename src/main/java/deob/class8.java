package deob;

@ObfuscatedName("y")
public class class8 {

    @ObfuscatedName("y.i")
    public static boolean field237 = false;

    @ObfuscatedName("y.w")
    public static boolean field239 = false;

    @ObfuscatedName("y.a")
    public static boolean field233 = false;

    @ObfuscatedName("y.t")
    public static class12 field234 = class12.field269;

    @ObfuscatedName("y.s")
    public static class192 field235 = new class192();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.i(Let;IIII)V")
    public static final void method1015(class134 arg0, int arg1, int arg2, int arg3) {
        if (class135.method1016(arg0, arg1, arg2, arg3)) {
            method568(arg0, arg1, arg2, arg3, -65281);
        } else if (field234 == class12.field264) {
            method568(arg0, arg1, arg2, arg3, -16776961);
        }
    }

    @ObfuscatedName("x.w(IIIIIIIB)V")
    public static final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        field235.method3262(new class9(var7, var9, var8, var10, -49088));
    }

    @ObfuscatedName("al.a(Let;IIIII)V")
    public static final void method568(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        field235.method3262(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("v.t(I)V")
    public static final void method24() {
        while (true) {
            class10 var0 = (class10) field235.method3265();
            if (var0 == null) {
                return;
            }
            var0.method41();
        }
    }
}

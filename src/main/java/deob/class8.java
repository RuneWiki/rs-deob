package deob;

@ObfuscatedName("s")
public class class8 {

    @ObfuscatedName("s.a")
    public static boolean field233 = false;

    @ObfuscatedName("s.j")
    public static boolean field228 = false;

    @ObfuscatedName("s.n")
    public static boolean field229 = false;

    @ObfuscatedName("s.r")
    public static class12 field230 = class12.field274;

    @ObfuscatedName("s.v")
    public static class192 field227 = new class192();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.a(IIIIIIII)V")
    public static final void method550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        field227.method3287(new class9(var7, var9, var8, var10, -49088));
    }

    @ObfuscatedName("hq.j(Lej;IIIIB)V")
    public static final void method3750(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
        field227.method3287(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("j.n(B)V")
    public static final void method3() {
        while (true) {
            class10 var0 = (class10) field227.method3283();
            if (var0 == null) {
                return;
            }
            var0.method38();
        }
    }
}

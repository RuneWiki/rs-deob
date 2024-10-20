package deob;

@ObfuscatedName("f")
public class class8 {

    @ObfuscatedName("f.a")
    public static boolean field224 = false;

    @ObfuscatedName("f.w")
    public static boolean field228 = false;

    @ObfuscatedName("f.e")
    public static boolean field225 = false;

    @ObfuscatedName("f.k")
    public static class12 field226 = class12.field259;

    @ObfuscatedName("f.u")
    public static class203 field227 = new class203();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.a(IIIIIIII)V")
    public static final void method922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        field227.method3417(new class9(var7, var9, var8, var10, -49088));
    }

    @ObfuscatedName("cx.w(Lef;IIIII)V")
    public static final void method1723(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        field227.method3417(new class11(arg0, arg1, arg2, arg3, arg4));
    }
}

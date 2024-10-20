package deob;

@ObfuscatedName("y")
public class class8 {

    @ObfuscatedName("y.b")
    public static boolean field230 = false;

    @ObfuscatedName("y.q")
    public static boolean field225 = false;

    @ObfuscatedName("y.o")
    public static boolean field224 = false;

    @ObfuscatedName("y.p")
    public static class12 field223 = class12.field256;

    @ObfuscatedName("y.a")
    public static class212 field226 = new class212();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gl.b(Lee;IIIB)V")
    public static final void method3227(class131 arg0, int arg1, int arg2, int arg3) {
        if (class132.method5(arg0, arg1, arg2, arg3)) {
            field226.method3720(new class11(arg0, arg1, arg2, arg3, -65281));
        } else if (field223 == class12.field253) {
            field226.method3720(new class11(arg0, arg1, arg2, arg3, -16776961));
        }
    }

    @ObfuscatedName("gt.o(IIIIIIII)V")
    public static final void method3139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        field226.method3720(new class9(var7, var9, var8, var10, -49088));
    }
}

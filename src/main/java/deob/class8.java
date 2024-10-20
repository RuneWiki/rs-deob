package deob;

@ObfuscatedName("z")
public class class8 {

    @ObfuscatedName("z.e")
    public static boolean field232 = false;

    @ObfuscatedName("z.n")
    public static boolean field236 = false;

    @ObfuscatedName("z.g")
    public static boolean field228 = false;

    @ObfuscatedName("z.y")
    public static class12 field229 = class12.field268;

    @ObfuscatedName("z.w")
    public static class193 field230 = new class193();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("il.e(Lew;IIII)V")
    public static final void method4073(class135 arg0, int arg1, int arg2, int arg3) {
        if (class136.method1613(arg0, arg1, arg2, arg3)) {
            field230.method3326(new class11(arg0, arg1, arg2, arg3, -65281));
        } else if (field229 == class12.field266) {
            field230.method3326(new class11(arg0, arg1, arg2, arg3, -16776961));
        }
    }

    @ObfuscatedName("fv.n(IIIIIIII)V")
    public static final void method2780(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = Math.min(arg3, Math.min(arg4, arg5)) - arg6;
        int var8 = Math.max(arg3, Math.max(arg4, arg5)) + arg6;
        int var9 = Math.min(arg0, Math.min(arg1, arg2)) - arg6;
        int var10 = Math.max(arg0, Math.max(arg1, arg2)) + arg6;
        field230.method3326(new class9(var7, var9, var8, var10, -49088));
    }

    @ObfuscatedName("et.g(I)V")
    public static final void method2722() {
        while (true) {
            class10 var0 = (class10) field230.method3330();
            if (var0 == null) {
                return;
            }
            var0.method36();
        }
    }
}

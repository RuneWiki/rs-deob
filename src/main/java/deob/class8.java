package deob;

@ObfuscatedName("t")
public class class8 {

    @ObfuscatedName("t.d")
    public static boolean field228 = false;

    @ObfuscatedName("t.x")
    public static boolean field223 = false;

    @ObfuscatedName("t.k")
    public static boolean field225 = false;

    @ObfuscatedName("t.z")
    public static class12 field226 = class12.field259;

    @ObfuscatedName("t.v")
    public static class199 field227 = new class199();

    public class8() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ec.d(Leh;IIIB)V")
    public static final void method2496(class133 arg0, int arg1, int arg2, int arg3) {
        if (class134.method3762(arg0, arg1, arg2, arg3)) {
            method225(arg0, arg1, arg2, arg3, -65281);
        } else if (field226 == class12.field255) {
            method225(arg0, arg1, arg2, arg3, -16776961);
        }
    }

    @ObfuscatedName("aa.x(Leh;IIIII)V")
    public static final void method225(class133 arg0, int arg1, int arg2, int arg3, int arg4) {
        field227.method3455(new class11(arg0, arg1, arg2, arg3, arg4));
    }

    @ObfuscatedName("ap.k(B)V")
    public static final void method501() {
        while (true) {
            class10 var0 = (class10) field227.method3469();
            if (var0 == null) {
                return;
            }
            var0.method44();
        }
    }
}

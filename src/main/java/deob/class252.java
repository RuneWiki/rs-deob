package deob;

@ObfuscatedName("ie")
public class class252 extends class196 {

    @ObfuscatedName("ie.j")
    public static class191 field3381 = new class191(64);

    @ObfuscatedName("ie.a")
    public int field3383;

    @ObfuscatedName("ie.r")
    public int field3385;

    @ObfuscatedName("ie.o")
    public int field3382;

    @ObfuscatedName("do.i(Lii;I)V")
    public static void method2294(class237 arg0) {
        Statics.field3384 = arg0;
    }

    @ObfuscatedName("iy.j(IB)Lie;")
    public static class252 method4073(int arg0) {
        class252 var1 = (class252) field3381.method3347((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3384.method3824(14, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4102(new class175(var2));
        }
        field3381.method3346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.a(Lfp;I)V")
    public void method4102(class175 arg0) {
        while (true) {
            int var2 = arg0.method2999();
            if (var2 == 0) {
                return;
            }
            this.method4103(arg0, var2);
        }
    }

    @ObfuscatedName("ie.r(Lfp;II)V")
    public void method4103(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3383 = arg0.method2995();
            this.field3385 = arg0.method2999();
            this.field3382 = arg0.method2999();
        }
    }

    @ObfuscatedName("fu.o(B)V")
    public static void method3201() {
        field3381.method3355();
    }
}

package deob;

@ObfuscatedName("iw")
public class class254 extends class181 {

    @ObfuscatedName("iw.f")
    public static class146 field3308 = new class146(64);

    @ObfuscatedName("iw.q")
    public boolean field3310 = false;

    @ObfuscatedName("en.m(Lir;I)V")
    public static void method2983(class245 arg0) {
        Statics.field3312 = arg0;
    }

    @ObfuscatedName("gu.f(II)Liw;")
    public static class254 method3666(int arg0) {
        class254 var1 = (class254) field3308.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3312.method4156(19, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4385(new class202(var2));
        }
        field3308.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.q(Lgr;I)V")
    public void method4385(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4381(arg0, var2);
        }
    }

    @ObfuscatedName("iw.w(Lgr;II)V")
    public void method4381(class202 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3310 = true;
        }
    }
}

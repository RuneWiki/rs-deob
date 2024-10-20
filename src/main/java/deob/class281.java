package deob;

@ObfuscatedName("jv")
public class class281 extends class346 {

    @ObfuscatedName("jv.o")
    public static class199 field3429 = new class199(64);

    @ObfuscatedName("jv.u")
    public boolean field3428 = false;

    @ObfuscatedName("km.f(Lir;I)V")
    public static void method4945(class253 arg0) {
        Statics.field3427 = arg0;
    }

    @ObfuscatedName("jv.u(Lnu;B)V")
    public void method4368(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4369(arg0, var2);
        }
    }

    @ObfuscatedName("jv.p(Lnu;II)V")
    public void method4369(class382 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3428 = true;
        }
    }
}

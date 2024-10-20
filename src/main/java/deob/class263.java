package deob;

@ObfuscatedName("je")
public class class263 extends class214 {

    @ObfuscatedName("je.h")
    public static class208 field3332 = new class208(64);

    @ObfuscatedName("je.l")
    public boolean field3333 = false;

    @ObfuscatedName("ev.n(Lij;I)V")
    public static void method3082(class254 arg0) {
        Statics.field3334 = arg0;
    }

    @ObfuscatedName("je.h(Lgc;I)V")
    public void method4680(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4678(arg0, var2);
        }
    }

    @ObfuscatedName("je.l(Lgc;IB)V")
    public void method4678(class190 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3333 = true;
        }
    }
}

package deob;

@ObfuscatedName("ix")
public class class245 extends class195 {

    @ObfuscatedName("ix.m")
    public static class190 field3329 = new class190(64);

    @ObfuscatedName("ix.e")
    public boolean field3327 = false;

    @ObfuscatedName("ap.p(Lil;I)V")
    public static void method248(class236 arg0) {
        Statics.field354 = arg0;
    }

    @ObfuscatedName("ix.m(Lfr;I)V")
    public void method3898(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method3899(arg0, var2);
        }
    }

    @ObfuscatedName("ix.e(Lfr;IB)V")
    public void method3899(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3327 = true;
        }
    }
}

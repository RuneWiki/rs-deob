package deob;

@ObfuscatedName("im")
public class class252 extends class202 {

    @ObfuscatedName("im.s")
    public static class197 field3372 = new class197(64);

    @ObfuscatedName("im.r")
    public boolean field3371 = false;

    @ObfuscatedName("an.b(Lij;I)V")
    public static void method217(class243 arg0) {
        Statics.field3373 = arg0;
    }

    @ObfuscatedName("im.s(Lfs;I)V")
    public void method4012(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4013(arg0, var2);
        }
    }

    @ObfuscatedName("im.r(Lfs;IB)V")
    public void method4013(class181 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3371 = true;
        }
    }
}

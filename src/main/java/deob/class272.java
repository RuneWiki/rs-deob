package deob;

@ObfuscatedName("jz")
public class class272 extends class219 {

    @ObfuscatedName("jz.q")
    public static class213 field3483 = new class213(64);

    @ObfuscatedName("jz.i")
    public boolean field3485 = false;

    @ObfuscatedName("af.t(Ljc;I)V")
    public static void method669(class262 arg0) {
        Statics.field3486 = arg0;
    }

    @ObfuscatedName("jz.q(Lgb;I)V")
    public void method4410(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4408(arg0, var2);
        }
    }

    @ObfuscatedName("jz.i(Lgb;II)V")
    public void method4408(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3485 = true;
        }
    }
}

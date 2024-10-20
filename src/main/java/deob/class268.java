package deob;

@ObfuscatedName("ja")
public class class268 extends class219 {

    @ObfuscatedName("ja.q")
    public static class213 field3445 = new class213(64);

    @ObfuscatedName("ja.i")
    public int field3446 = 0;

    @ObfuscatedName("gn.t(Ljc;I)V")
    public static void method3489(class262 arg0) {
        Statics.field3444 = arg0;
    }

    @ObfuscatedName("ja.q(Lgb;I)V")
    public void method4363(class195 arg0) {
        while (true) {
            int var2 = arg0.method3236();
            if (var2 == 0) {
                return;
            }
            this.method4364(arg0, var2);
        }
    }

    @ObfuscatedName("ja.i(Lgb;II)V")
    public void method4364(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3446 = arg0.method3238();
        }
    }
}

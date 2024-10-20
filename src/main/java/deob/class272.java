package deob;

@ObfuscatedName("jq")
public class class272 extends class219 {

    @ObfuscatedName("jq.k")
    public static class213 field3481 = new class213(64);

    @ObfuscatedName("jq.t")
    public boolean field3480 = false;

    @ObfuscatedName("g.o(Ljf;I)V")
    public static void method161(class262 arg0) {
        Statics.field3482 = arg0;
    }

    @ObfuscatedName("jq.k(Lgc;I)V")
    public void method4401(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4402(arg0, var2);
        }
    }

    @ObfuscatedName("jq.t(Lgc;II)V")
    public void method4402(class195 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3480 = true;
        }
    }
}

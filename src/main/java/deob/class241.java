package deob;

@ObfuscatedName("iu")
public class class241 extends class195 {

    @ObfuscatedName("iu.s")
    public static class190 field3274 = new class190(64);

    @ObfuscatedName("iu.q")
    public int field3276 = 0;

    @ObfuscatedName("bn.w(Lip;I)V")
    public static void method979(class236 arg0) {
        Statics.field3277 = arg0;
    }

    @ObfuscatedName("iu.s(Lfz;I)V")
    public void method4013(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4014(arg0, var2);
        }
    }

    @ObfuscatedName("iu.q(Lfz;IB)V")
    public void method4014(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3276 = arg0.method3178();
        }
    }
}

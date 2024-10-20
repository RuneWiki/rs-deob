package deob;

@ObfuscatedName("ip")
public class class253 extends class206 {

    @ObfuscatedName("ip.w")
    public static class201 field3349 = new class201(64);

    @ObfuscatedName("ip.s")
    public int field3350 = 0;

    @ObfuscatedName("iu.p(Lik;I)V")
    public static void method4022(class247 arg0) {
        Statics.field2414 = arg0;
        Statics.field3352 = Statics.field2414.method4044(16);
    }

    @ObfuscatedName("ip.i(Lgj;I)V")
    public void method4197(class185 arg0) {
        while (true) {
            int var2 = arg0.method3197();
            if (var2 == 0) {
                return;
            }
            this.method4189(arg0, var2);
        }
    }

    @ObfuscatedName("ip.w(Lgj;II)V")
    public void method4189(class185 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3350 = arg0.method3124();
        }
    }
}

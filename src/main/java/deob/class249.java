package deob;

@ObfuscatedName("ip")
public class class249 extends class202 {

    @ObfuscatedName("ip.k")
    public static class197 field3361 = new class197(64);

    @ObfuscatedName("ip.z")
    public int field3359 = 0;

    @ObfuscatedName("bv.d(Lid;I)V")
    public static void method737(class243 arg0) {
        Statics.field3360 = arg0;
        Statics.field3358 = Statics.field3360.method3946(16);
    }

    @ObfuscatedName("ip.x(Lfr;I)V")
    public void method4098(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4090(arg0, var2);
        }
    }

    @ObfuscatedName("ip.k(Lfr;IB)V")
    public void method4090(class181 arg0, int arg1) {
        if (arg1 == 5) {
            this.field3359 = arg0.method3179();
        }
    }
}

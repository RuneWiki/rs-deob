package deob;

@ObfuscatedName("am")
public class class38 extends class174 {

    @ObfuscatedName("am.t")
    public static class170 field944 = new class170(64);

    @ObfuscatedName("am.n")
    public int field947;

    @ObfuscatedName("am.e")
    public int field946;

    @ObfuscatedName("am.l")
    public int field943;

    @ObfuscatedName("am.f(Ldq;I)V")
    public void method794(class127 arg0) {
        while (true) {
            int var2 = arg0.method2458();
            if (var2 == 0) {
                return;
            }
            this.method795(arg0, var2);
        }
    }

    @ObfuscatedName("am.t(Ldq;II)V")
    public void method795(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field947 = arg0.method2460();
            this.field946 = arg0.method2458();
            this.field943 = arg0.method2458();
        }
    }
}

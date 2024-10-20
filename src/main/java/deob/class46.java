package deob;

@ObfuscatedName("aw")
public class class46 extends class194 {

    @ObfuscatedName("aw.s")
    public static class183 field1008 = new class183(64);

    @ObfuscatedName("aw.h")
    public int field1009 = 0;

    @ObfuscatedName("aw.q(Ldx;I)V")
    public void method843(class111 arg0) {
        while (true) {
            int var2 = arg0.method2231();
            if (var2 == 0) {
                return;
            }
            this.method845(arg0, var2);
        }
    }

    @ObfuscatedName("aw.s(Ldx;IB)V")
    public void method845(class111 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1009 = arg0.method2307();
        }
    }
}

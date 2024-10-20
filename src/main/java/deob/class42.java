package deob;

@ObfuscatedName("aq")
public class class42 extends class183 {

    @ObfuscatedName("aq.g")
    public static class172 field973 = new class172(64);

    @ObfuscatedName("aq.x")
    public int field980;

    @ObfuscatedName("aq.c")
    public int field972;

    @ObfuscatedName("aq.n")
    public int field969;

    @ObfuscatedName("aq.p(Ldp;I)V")
    public void method844(class107 arg0) {
        while (true) {
            int var2 = arg0.method2173();
            if (var2 == 0) {
                return;
            }
            this.method845(arg0, var2);
        }
    }

    @ObfuscatedName("aq.g(Ldp;IB)V")
    public void method845(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field980 = arg0.method2175();
            this.field972 = arg0.method2173();
            this.field969 = arg0.method2173();
        }
    }
}

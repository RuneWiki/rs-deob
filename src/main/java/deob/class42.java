package deob;

@ObfuscatedName("ao")
public class class42 extends class183 {

    @ObfuscatedName("ao.x")
    public static class172 field974 = new class172(64);

    @ObfuscatedName("ao.k")
    public int field976;

    @ObfuscatedName("ao.i")
    public int field973;

    @ObfuscatedName("ao.d")
    public int field977;

    @ObfuscatedName("ao.n(Ldw;I)V")
    public void method819(class107 arg0) {
        while (true) {
            int var2 = arg0.method2148();
            if (var2 == 0) {
                return;
            }
            this.method820(arg0, var2);
        }
    }

    @ObfuscatedName("ao.x(Ldw;IB)V")
    public void method820(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field976 = arg0.method2140();
            this.field973 = arg0.method2148();
            this.field977 = arg0.method2148();
        }
    }
}

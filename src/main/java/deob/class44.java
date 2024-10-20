package deob;

@ObfuscatedName("aq")
public class class44 extends class183 {

    @ObfuscatedName("aq.x")
    public static class172 field1003 = new class172(64);

    @ObfuscatedName("aq.k")
    public int field998 = 0;

    @ObfuscatedName("aq.n(Ldw;I)V")
    public void method837(class107 arg0) {
        while (true) {
            int var2 = arg0.method2148();
            if (var2 == 0) {
                return;
            }
            this.method835(arg0, var2);
        }
    }

    @ObfuscatedName("aq.x(Ldw;IB)V")
    public void method835(class107 arg0, int arg1) {
        if (arg1 == 2) {
            this.field998 = arg0.method2140();
        }
    }
}

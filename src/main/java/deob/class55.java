package deob;

@ObfuscatedName("bh")
public class class55 extends class208 {

    @ObfuscatedName("bh.r")
    public static class197 field1144 = new class197(64);

    @ObfuscatedName("bh.j")
    public int field1145 = 0;

    @ObfuscatedName("bh.r(Ldp;I)V")
    public void method1058(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method1057(arg0, var2);
        }
    }

    @ObfuscatedName("bh.j(Ldp;IB)V")
    public void method1057(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1145 = arg0.method2403();
        }
    }
}

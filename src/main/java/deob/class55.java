package deob;

@ObfuscatedName("bx")
public class class55 extends class208 {

    @ObfuscatedName("bx.w")
    public static class197 field1167 = new class197(64);

    @ObfuscatedName("bx.e")
    public int field1168 = 0;

    @ObfuscatedName("bx.m(Ldj;I)V")
    public void method1095(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method1091(arg0, var2);
        }
    }

    @ObfuscatedName("bx.w(Ldj;IB)V")
    public void method1091(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1168 = arg0.method2548();
        }
    }
}

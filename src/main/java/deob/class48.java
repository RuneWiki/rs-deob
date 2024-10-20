package deob;

@ObfuscatedName("al")
public class class48 extends class208 {

    @ObfuscatedName("al.e")
    public static class197 field1047 = new class197(64);

    @ObfuscatedName("al.n")
    public boolean field1052 = false;

    @ObfuscatedName("al.f(Ldx;I)V")
    public void method941(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method945(arg0, var2);
        }
    }

    @ObfuscatedName("al.e(Ldx;IB)V")
    public void method945(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1052 = true;
        }
    }
}

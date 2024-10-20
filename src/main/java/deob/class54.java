package deob;

@ObfuscatedName("bk")
public class class54 extends class208 {

    @ObfuscatedName("bk.e")
    public static class197 field1138 = new class197(64);

    @ObfuscatedName("bk.n")
    public boolean field1140 = false;

    @ObfuscatedName("bk.f(Ldx;I)V")
    public void method1062(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method1061(arg0, var2);
        }
    }

    @ObfuscatedName("bk.e(Ldx;II)V")
    public void method1061(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1140 = true;
        }
    }
}

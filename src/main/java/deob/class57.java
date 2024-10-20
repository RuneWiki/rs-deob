package deob;

@ObfuscatedName("bk")
public class class57 extends class208 {

    @ObfuscatedName("bk.t")
    public static class197 field1204 = new class197(64);

    @ObfuscatedName("bk.y")
    public int field1200 = 0;

    @ObfuscatedName("bk.z(Ldy;B)V")
    public void method1122(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1123(arg0, var2);
        }
    }

    @ObfuscatedName("bk.t(Ldy;II)V")
    public void method1123(class123 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1200 = arg0.method2550();
        }
    }
}

package deob;

@ObfuscatedName("bf")
public class class54 extends class208 {

    @ObfuscatedName("bf.d")
    public static class197 field1165 = new class197(64);

    @ObfuscatedName("bf.v")
    public boolean field1158 = false;

    @ObfuscatedName("ch.a(Lfu;I)V")
    public static void method1622(class171 arg0) {
        Statics.field1156 = arg0;
    }

    @ObfuscatedName("bf.d(Ldb;I)V")
    public void method1082(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method1081(arg0, var2);
        }
    }

    @ObfuscatedName("bf.v(Ldb;IB)V")
    public void method1081(class123 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1158 = true;
        }
    }
}

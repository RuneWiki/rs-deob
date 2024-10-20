package deob;

@ObfuscatedName("am")
public class class50 extends class204 {

    @ObfuscatedName("am.q")
    public static class193 field1088 = new class193(64);

    @ObfuscatedName("am.c")
    public boolean field1089 = false;

    @ObfuscatedName("am.n(Ldc;I)V")
    public void method1004(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method1007(arg0, var2);
        }
    }

    @ObfuscatedName("am.q(Ldc;IB)V")
    public void method1007(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1089 = true;
        }
    }
}

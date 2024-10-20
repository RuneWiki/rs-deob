package deob;

@ObfuscatedName("aj")
public class class50 extends class204 {

    @ObfuscatedName("aj.m")
    public static class193 field1074 = new class193(64);

    @ObfuscatedName("aj.f")
    public boolean field1073 = false;

    @ObfuscatedName("bo.j(Lfa;B)V")
    public static void method1586(class167 arg0) {
        Statics.field1077 = arg0;
    }

    @ObfuscatedName("aj.m(Ldc;I)V")
    public void method1005(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method1006(arg0, var2);
        }
    }

    @ObfuscatedName("aj.f(Ldc;IB)V")
    public void method1006(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1073 = true;
        }
    }
}

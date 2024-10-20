package deob;

@ObfuscatedName("at")
public class class51 extends class204 {

    @ObfuscatedName("at.f")
    public static class193 field1093 = new class193(64);

    @ObfuscatedName("at.i")
    public int field1094 = 0;

    @ObfuscatedName("at.o(Ldc;I)V")
    public void method961(class119 arg0) {
        while (true) {
            int var2 = arg0.method2290();
            if (var2 == 0) {
                return;
            }
            this.method962(arg0, var2);
        }
    }

    @ObfuscatedName("at.f(Ldc;IB)V")
    public void method962(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1094 = arg0.method2292();
        }
    }
}

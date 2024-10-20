package deob;

@ObfuscatedName("al")
public class class51 extends class204 {

    @ObfuscatedName("al.s")
    public static class193 field1098 = new class193(64);

    @ObfuscatedName("al.q")
    public int field1102 = 0;

    @ObfuscatedName("ai.f(Lfx;B)V")
    public static void method880(class167 arg0) {
        Statics.field1106 = arg0;
    }

    @ObfuscatedName("al.s(Ldn;I)V")
    public void method998(class119 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1000(arg0, var2);
        }
    }

    @ObfuscatedName("al.q(Ldn;IB)V")
    public void method1000(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1102 = arg0.method2353();
        }
    }
}

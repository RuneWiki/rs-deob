package deob;

@ObfuscatedName("ai")
public class class48 extends class204 {

    @ObfuscatedName("ai.q")
    public static class193 field1070 = new class193(64);

    @ObfuscatedName("ai.v")
    public int field1071;

    @ObfuscatedName("ai.n")
    public int field1074;

    @ObfuscatedName("ai.f")
    public int field1073;

    @ObfuscatedName("ai.h(Ldm;I)V")
    public void method961(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method959(arg0, var2);
        }
    }

    @ObfuscatedName("ai.q(Ldm;II)V")
    public void method959(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1071 = arg0.method2385();
            this.field1074 = arg0.method2383();
            this.field1073 = arg0.method2383();
        }
    }
}

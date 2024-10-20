package deob;

@ObfuscatedName("ao")
public class class48 extends class204 {

    @ObfuscatedName("ao.d")
    public static class193 field1047 = new class193(64);

    @ObfuscatedName("ao.s")
    public int field1053;

    @ObfuscatedName("ao.q")
    public int field1049;

    @ObfuscatedName("ao.j")
    public int field1050;

    @ObfuscatedName("ao.n(Ldq;I)V")
    public void method934(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method936(arg0, var2);
        }
    }

    @ObfuscatedName("ao.d(Ldq;IS)V")
    public void method936(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1053 = arg0.method2377();
            this.field1049 = arg0.method2338();
            this.field1050 = arg0.method2338();
        }
    }

    @ObfuscatedName("t.s(I)V")
    public static void method168() {
        field1047.method3480();
    }
}

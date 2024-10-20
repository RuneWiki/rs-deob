package deob;

@ObfuscatedName("ax")
public class class48 extends class204 {

    @ObfuscatedName("ax.f")
    public static class193 field1058 = new class193(64);

    @ObfuscatedName("ax.i")
    public int field1060;

    @ObfuscatedName("ax.d")
    public int field1061;

    @ObfuscatedName("ax.o")
    public int field1066;

    @ObfuscatedName("ax.v(Ldx;B)V")
    public void method952(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method953(arg0, var2);
        }
    }

    @ObfuscatedName("ax.f(Ldx;II)V")
    public void method953(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1060 = arg0.method2334();
            this.field1061 = arg0.method2400();
            this.field1066 = arg0.method2400();
        }
    }
}

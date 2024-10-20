package deob;

@ObfuscatedName("ae")
public class class51 extends class204 {

    @ObfuscatedName("ae.d")
    public static class193 field1088 = new class193(64);

    @ObfuscatedName("ae.s")
    public int field1086 = 0;

    @ObfuscatedName("y.n(Lfm;B)V")
    public static void method154(class167 arg0) {
        Statics.field1087 = arg0;
    }

    @ObfuscatedName("ae.d(Ldq;I)V")
    public void method962(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method963(arg0, var2);
        }
    }

    @ObfuscatedName("ae.s(Ldq;II)V")
    public void method963(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1086 = arg0.method2377();
        }
    }
}

package deob;

@ObfuscatedName("aw")
public class class51 extends class204 {

    @ObfuscatedName("aw.e")
    public static class193 field1091 = new class193(64);

    @ObfuscatedName("aw.q")
    public int field1082 = 0;

    @ObfuscatedName("ah.l(Lfo;I)V")
    public static void method701(class167 arg0) {
        Statics.field1083 = arg0;
    }

    @ObfuscatedName("aw.e(Ldl;I)V")
    public void method1012(class119 arg0) {
        while (true) {
            int var2 = arg0.method2388();
            if (var2 == 0) {
                return;
            }
            this.method1019(arg0, var2);
        }
    }

    @ObfuscatedName("aw.q(Ldl;II)V")
    public void method1019(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1082 = arg0.method2440();
        }
    }
}

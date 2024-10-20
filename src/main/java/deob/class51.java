package deob;

@ObfuscatedName("ai")
public class class51 extends class204 {

    @ObfuscatedName("ai.e")
    public static class193 field1091 = new class193(64);

    @ObfuscatedName("ai.u")
    public int field1090 = 0;

    @ObfuscatedName("fd.o(Lfq;B)V")
    public static void method3020(class167 arg0) {
        Statics.field1092 = arg0;
    }

    @ObfuscatedName("ai.e(Ldi;B)V")
    public void method979(class119 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method982(arg0, var2);
        }
    }

    @ObfuscatedName("ai.u(Ldi;II)V")
    public void method982(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1090 = arg0.method2339();
        }
    }
}

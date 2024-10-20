package deob;

@ObfuscatedName("ah")
public class class51 extends class204 {

    @ObfuscatedName("ah.l")
    public static class193 field1109 = new class193(64);

    @ObfuscatedName("ah.a")
    public int field1101 = 0;

    @ObfuscatedName("aj.j(Lff;I)V")
    public static void method1032(class167 arg0) {
        Statics.field1108 = arg0;
    }

    @ObfuscatedName("ah.l(Ldc;I)V")
    public void method995(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method994(arg0, var2);
        }
    }

    @ObfuscatedName("ah.a(Ldc;II)V")
    public void method994(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1101 = arg0.method2318();
        }
    }
}

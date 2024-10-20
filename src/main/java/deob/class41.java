package deob;

@ObfuscatedName("ak")
public class class41 extends class174 {

    @ObfuscatedName("ak.r")
    public static class170 field1025 = new class170(64);

    @ObfuscatedName("ak.v")
    public int field1026 = 0;

    @ObfuscatedName("ew.j(Lez;I)V")
    public static void method2941(class152 arg0) {
        Statics.field1030 = arg0;
    }

    @ObfuscatedName("ak.r(Ldn;I)V")
    public void method861(class127 arg0) {
        while (true) {
            int var2 = arg0.method2441();
            if (var2 == 0) {
                return;
            }
            this.method862(arg0, var2);
        }
    }

    @ObfuscatedName("ak.v(Ldn;II)V")
    public void method862(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1026 = arg0.method2609();
        }
    }
}

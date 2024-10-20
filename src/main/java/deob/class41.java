package deob;

@ObfuscatedName("aw")
public class class41 extends class174 {

    @ObfuscatedName("aw.p")
    public static class170 field1035 = new class170(64);

    @ObfuscatedName("aw.a")
    public int field1036 = 0;

    @ObfuscatedName("d.i(Lef;I)V")
    public static void method70(class152 arg0) {
        Statics.field1041 = arg0;
    }

    @ObfuscatedName("aw.p(Ldn;B)V")
    public void method858(class127 arg0) {
        while (true) {
            int var2 = arg0.method2411();
            if (var2 == 0) {
                return;
            }
            this.method861(arg0, var2);
        }
    }

    @ObfuscatedName("aw.a(Ldn;II)V")
    public void method861(class127 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1036 = arg0.method2413();
        }
    }
}

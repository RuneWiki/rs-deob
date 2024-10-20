package deob;

@ObfuscatedName("ap")
public class class41 extends class174 {

    @ObfuscatedName("ap.e")
    public static class170 field1014 = new class170(64);

    @ObfuscatedName("ap.g")
    public int field1013 = 0;

    @ObfuscatedName("f.b(Lej;S)V")
    public static void method51(class153 arg0) {
        Statics.field1019 = arg0;
    }

    @ObfuscatedName("ap.e(Ldv;I)V")
    public void method859(class126 arg0) {
        while (true) {
            int var2 = arg0.method2436();
            if (var2 == 0) {
                return;
            }
            this.method857(arg0, var2);
        }
    }

    @ObfuscatedName("ap.g(Ldv;II)V")
    public void method857(class126 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1013 = arg0.method2572();
        }
    }
}

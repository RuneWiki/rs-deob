package deob;

@ObfuscatedName("an")
public class class42 extends class174 {

    @ObfuscatedName("an.k")
    public static class170 field1011 = new class170(64);

    @ObfuscatedName("an.a")
    public int field1019 = 0;

    @ObfuscatedName("bw.x(Lej;I)V")
    public static void method1349(class152 arg0) {
        Statics.field1013 = arg0;
        Statics.field1010 = Statics.field1013.method2929(16);
    }

    @ObfuscatedName("an.p(Ldg;I)V")
    public void method874(class127 arg0) {
        while (true) {
            int var2 = arg0.method2484();
            if (var2 == 0) {
                return;
            }
            this.method875(arg0, var2);
        }
    }

    @ObfuscatedName("an.k(Ldg;II)V")
    public void method875(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1019 = arg0.method2539();
        }
    }

    @ObfuscatedName("aj.a(B)V")
    public static void method611() {
        field1011.method3198();
    }
}

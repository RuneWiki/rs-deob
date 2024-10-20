package deob;

@ObfuscatedName("au")
public class class38 extends class174 {

    @ObfuscatedName("au.q")
    public static class170 field971 = new class170(64);

    @ObfuscatedName("au.y")
    public int field979;

    @ObfuscatedName("au.v")
    public int field978;

    @ObfuscatedName("au.g")
    public int field969;

    @ObfuscatedName("au.c(Ldg;I)V")
    public void method773(class127 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method772(arg0, var2);
        }
    }

    @ObfuscatedName("au.q(Ldg;II)V")
    public void method772(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field979 = arg0.method2327();
            this.field978 = arg0.method2383();
            this.field969 = arg0.method2383();
        }
    }
}

package deob;

@ObfuscatedName("af")
public class class51 extends class204 {

    @ObfuscatedName("af.q")
    public static class193 field1097 = new class193(64);

    @ObfuscatedName("af.k")
    public int field1090 = 0;

    @ObfuscatedName("n.z(Lfl;B)V")
    public static void method126(class167 arg0) {
        Statics.field1088 = arg0;
    }

    @ObfuscatedName("af.k(Lda;I)V")
    public void method978(class119 arg0) {
        while (true) {
            int var2 = arg0.method2457();
            if (var2 == 0) {
                return;
            }
            this.method980(arg0, var2);
        }
    }

    @ObfuscatedName("af.f(Lda;II)V")
    public void method980(class119 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1090 = arg0.method2415();
        }
    }
}

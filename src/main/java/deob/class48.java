package deob;

@ObfuscatedName("at")
public class class48 extends class194 {

    @ObfuscatedName("at.h")
    public static class183 field1067 = new class183(64);

    @ObfuscatedName("at.e")
    public int field1065 = 0;

    @ObfuscatedName("ep.q(Lff;S)V")
    public static void method2679(class158 arg0) {
        Statics.field1072 = arg0;
        Statics.field1066 = Statics.field1072.method2808(16);
    }

    @ObfuscatedName("at.h(Ldx;B)V")
    public void method903(class111 arg0) {
        while (true) {
            int var2 = arg0.method2231();
            if (var2 == 0) {
                return;
            }
            this.method904(arg0, var2);
        }
    }

    @ObfuscatedName("at.e(Ldx;II)V")
    public void method904(class111 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1065 = arg0.method2307();
        }
    }

    @ObfuscatedName("r.n(I)V")
    public static void method532() {
        field1067.method3246();
    }
}

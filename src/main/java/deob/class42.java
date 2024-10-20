package deob;

@ObfuscatedName("au")
public class class42 extends class174 {

    @ObfuscatedName("au.d")
    public static class170 field1025 = new class170(64);

    @ObfuscatedName("au.k")
    public int field1019 = 0;

    @ObfuscatedName("as.y(Lel;I)V")
    public static void method235(class152 arg0) {
        Statics.field1027 = arg0;
        Statics.field1022 = Statics.field1027.method2994(16);
    }

    @ObfuscatedName("au.m(Ldp;I)V")
    public void method910(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method911(arg0, var2);
        }
    }

    @ObfuscatedName("au.d(Ldp;II)V")
    public void method911(class127 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1019 = arg0.method2460();
        }
    }

    @ObfuscatedName("do.k(I)V")
    public static void method2361() {
        field1025.method3297();
    }
}

package deob;

@ObfuscatedName("au")
public class class42 extends class182 {

    @ObfuscatedName("au.o")
    public static class171 field968 = new class171(64);

    @ObfuscatedName("au.i")
    public int field967;

    @ObfuscatedName("au.p")
    public int field970;

    @ObfuscatedName("au.c")
    public int field971;

    @ObfuscatedName("ap.t(Ley;I)V")
    public static void method564(class146 arg0) {
        Statics.field969 = arg0;
    }

    @ObfuscatedName("au.o(Ldg;I)V")
    public void method806(class107 arg0) {
        while (true) {
            int var2 = arg0.method2118();
            if (var2 == 0) {
                return;
            }
            this.method803(arg0, var2);
        }
    }

    @ObfuscatedName("au.i(Ldg;II)V")
    public void method803(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field967 = arg0.method2120();
            this.field970 = arg0.method2118();
            this.field971 = arg0.method2118();
        }
    }
}

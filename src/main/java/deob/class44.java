package deob;

@ObfuscatedName("au")
public class class44 extends class194 {

    @ObfuscatedName("au.s")
    public static class183 field987 = new class183(64);

    @ObfuscatedName("au.h")
    public int field985;

    @ObfuscatedName("au.e")
    public int field986;

    @ObfuscatedName("au.n")
    public int field990;

    @ObfuscatedName("av.q(Lff;I)V")
    public static void method579(class158 arg0) {
        Statics.field2516 = arg0;
    }

    @ObfuscatedName("au.s(Ldx;I)V")
    public void method822(class111 arg0) {
        while (true) {
            int var2 = arg0.method2231();
            if (var2 == 0) {
                return;
            }
            this.method821(arg0, var2);
        }
    }

    @ObfuscatedName("au.h(Ldx;II)V")
    public void method821(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field985 = arg0.method2307();
            this.field986 = arg0.method2231();
            this.field990 = arg0.method2231();
        }
    }

    @ObfuscatedName("fz.e(I)V")
    public static void method3052() {
        field987.method3246();
    }
}

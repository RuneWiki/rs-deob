package deob;

@ObfuscatedName("ih")
public class class252 extends class196 {

    @ObfuscatedName("ih.n")
    public static class191 field3372 = new class191(64);

    @ObfuscatedName("ih.g")
    public int field3371;

    @ObfuscatedName("ih.y")
    public int field3374;

    @ObfuscatedName("ih.w")
    public int field3375;

    @ObfuscatedName("en.e(Lit;I)V")
    public static void method2698(class237 arg0) {
        Statics.field3377 = arg0;
    }

    @ObfuscatedName("ih.n(Lfh;I)V")
    public void method4124(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4130(arg0, var2);
        }
    }

    @ObfuscatedName("ih.g(Lfh;II)V")
    public void method4130(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3371 = arg0.method3091();
            this.field3374 = arg0.method2928();
            this.field3375 = arg0.method2928();
        }
    }

    @ObfuscatedName("hk.y(I)V")
    public static void method3706() {
        field3372.method3282();
    }
}

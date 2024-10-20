package deob;

@ObfuscatedName("av")
public class class169 extends class6 {

    @ObfuscatedName("av.k")
    public int field2508;

    @ObfuscatedName("av.h")
    public static class2 field2507 = new class2(64);

    @ObfuscatedName("av.w")
    public int field2509;

    @ObfuscatedName("av.t")
    public int field2510;

    @ObfuscatedName("av.h(Ldp;I)V")
    public void method2932(class50 arg0) {
        while (true) {
            int var2 = arg0.method726();
            if (var2 == 0) {
                return;
            }
            this.method2933(arg0, var2);
        }
    }

    @ObfuscatedName("av.k(Ldp;II)V")
    public void method2933(class50 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2508 = arg0.method720();
            this.field2509 = arg0.method726();
            this.field2510 = arg0.method726();
        }
    }

    @ObfuscatedName("z.b(Lek;I)V")
    public static void method1414(class89 arg0) {
        Statics.field2511 = arg0;
    }
}

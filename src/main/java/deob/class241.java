package deob;

@ObfuscatedName("it")
public class class241 extends class195 {

    @ObfuscatedName("it.m")
    public static class190 field3287 = new class190(64);

    @ObfuscatedName("it.e")
    public int field3288 = 0;

    @ObfuscatedName("io.p(Lil;I)V")
    public static void method3839(class236 arg0) {
        Statics.field3289 = arg0;
    }

    @ObfuscatedName("it.m(Lfr;I)V")
    public void method3849(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method3842(arg0, var2);
        }
    }

    @ObfuscatedName("it.e(Lfr;II)V")
    public void method3842(class174 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3288 = arg0.method2824();
        }
    }
}

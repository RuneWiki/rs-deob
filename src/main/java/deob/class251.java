package deob;

@ObfuscatedName("ig")
public class class251 extends class195 {

    @ObfuscatedName("ig.m")
    public static class190 field3390 = new class190(64);

    @ObfuscatedName("ig.e")
    public int field3394;

    @ObfuscatedName("ig.t")
    public int field3389;

    @ObfuscatedName("ig.w")
    public int field3393;

    @ObfuscatedName("bi.p(Lil;I)V")
    public static void method676(class236 arg0) {
        Statics.field3391 = arg0;
    }

    @ObfuscatedName("ig.m(Lfr;I)V")
    public void method3993(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method3995(arg0, var2);
        }
    }

    @ObfuscatedName("ig.e(Lfr;II)V")
    public void method3995(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3394 = arg0.method2824();
            this.field3389 = arg0.method2810();
            this.field3393 = arg0.method2810();
        }
    }
}

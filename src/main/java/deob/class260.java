package deob;

@ObfuscatedName("iv")
public class class260 extends class185 {

    @ObfuscatedName("iv.v")
    public static class155 field3325 = new class155(64);

    @ObfuscatedName("iv.x")
    public int field3327;

    @ObfuscatedName("iv.w")
    public int field3329;

    @ObfuscatedName("iv.t")
    public int field3328;

    @ObfuscatedName("gp.h(Lib;B)V")
    public static void method3411(class245 arg0) {
        Statics.field3324 = arg0;
    }

    @ObfuscatedName("iv.v(Lkj;I)V")
    public void method4148(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4151(arg0, var2);
        }
    }

    @ObfuscatedName("iv.x(Lkj;II)V")
    public void method4151(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3327 = arg0.method5342();
            this.field3329 = arg0.method5274();
            this.field3328 = arg0.method5274();
        }
    }
}

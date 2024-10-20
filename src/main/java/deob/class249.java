package deob;

@ObfuscatedName("ib")
public class class249 extends class176 {

    @ObfuscatedName("ib.t")
    public static class146 field3285 = new class146(64);

    @ObfuscatedName("ib.n")
    public int field3288;

    @ObfuscatedName("ib.q")
    public int field3287;

    @ObfuscatedName("ib.v")
    public int field3290;

    @ObfuscatedName("cr.a(Lhq;B)V")
    public static void method2000(class234 arg0) {
        Statics.field3284 = arg0;
    }

    @ObfuscatedName("ib.t(Lkc;I)V")
    public void method4198(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4200(arg0, var2);
        }
    }

    @ObfuscatedName("ib.n(Lkc;II)V")
    public void method4200(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3288 = arg0.method5166();
            this.field3287 = arg0.method5123();
            this.field3290 = arg0.method5123();
        }
    }
}

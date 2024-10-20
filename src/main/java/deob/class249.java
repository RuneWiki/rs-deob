package deob;

@ObfuscatedName("im")
public class class249 extends class176 {

    @ObfuscatedName("im.j")
    public static class146 field3276 = new class146(64);

    @ObfuscatedName("im.i")
    public int field3277;

    @ObfuscatedName("im.k")
    public int field3278;

    @ObfuscatedName("im.u")
    public int field3279;

    @ObfuscatedName("gm.s(Lhz;I)V")
    public static void method3370(class234 arg0) {
        Statics.field3281 = arg0;
    }

    @ObfuscatedName("im.j(Lky;I)V")
    public void method4081(class300 arg0) {
        while (true) {
            int var2 = arg0.method5179();
            if (var2 == 0) {
                return;
            }
            this.method4082(arg0, var2);
        }
    }

    @ObfuscatedName("im.i(Lky;IB)V")
    public void method4082(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3277 = arg0.method5054();
            this.field3278 = arg0.method5179();
            this.field3279 = arg0.method5179();
        }
    }

    @ObfuscatedName("f.k(B)V")
    public static void method107() {
        field3276.method3068();
    }
}

package deob;

@ObfuscatedName("iy")
public class class251 extends class195 {

    @ObfuscatedName("iy.s")
    public static class190 field3378 = new class190(64);

    @ObfuscatedName("iy.q")
    public int field3379;

    @ObfuscatedName("iy.o")
    public int field3381;

    @ObfuscatedName("iy.g")
    public int field3382;

    @ObfuscatedName("v.w(Lip;I)V")
    public static void method18(class236 arg0) {
        Statics.field3380 = arg0;
    }

    @ObfuscatedName("iy.s(Lfz;I)V")
    public void method4165(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4166(arg0, var2);
        }
    }

    @ObfuscatedName("iy.q(Lfz;II)V")
    public void method4166(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3379 = arg0.method3178();
            this.field3381 = arg0.method2971();
            this.field3382 = arg0.method2971();
        }
    }

    @ObfuscatedName("g.o(I)V")
    public static void method14() {
        field3378.method3361();
    }
}

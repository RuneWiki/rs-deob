package deob;

@ObfuscatedName("ir")
public class class245 extends class176 {

    @ObfuscatedName("ir.t")
    public static class146 field3241 = new class146(64);

    @ObfuscatedName("ir.n")
    public int field3240 = 0;

    @ObfuscatedName("ir.q")
    public int field3245;

    @ObfuscatedName("ir.v")
    public int field3244;

    @ObfuscatedName("ir.l")
    public int field3249;

    @ObfuscatedName("ir.c")
    public int field3246;

    @ObfuscatedName("gp.a(Lhq;I)V")
    public static void method3458(class234 arg0) {
        Statics.field3242 = arg0;
    }

    @ObfuscatedName("ir.t(B)V")
    public void method4145() {
        this.method4140(this.field3240);
    }

    @ObfuscatedName("ir.n(Lkc;II)V")
    public void method4139(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5123();
            if (var3 == 0) {
                return;
            }
            this.method4149(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ir.q(Lkc;III)V")
    public void method4149(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3240 = arg0.method5127();
        }
    }

    @ObfuscatedName("ir.v(IB)V")
    public void method4140(int arg0) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        this.field3244 = (int) (var14 * 256.0D);
        this.field3249 = (int) (var16 * 256.0D);
        if (this.field3244 < 0) {
            this.field3244 = 0;
        } else if (this.field3244 > 255) {
            this.field3244 = 255;
        }
        if (this.field3249 < 0) {
            this.field3249 = 0;
        } else if (this.field3249 > 255) {
            this.field3249 = 255;
        }
        if (var16 > 0.5D) {
            this.field3246 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3246 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3246 < 1) {
            this.field3246 = 1;
        }
        this.field3245 = (int) ((double) this.field3246 * var18);
    }

    @ObfuscatedName("ci.l(I)V")
    public static void method2037() {
        field3241.method3123();
    }
}

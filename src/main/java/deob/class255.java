package deob;

@ObfuscatedName("iu")
public class class255 extends class185 {

    @ObfuscatedName("iu.k")
    public static class155 field3282 = new class155(64);

    @ObfuscatedName("iu.s")
    public int field3283 = 0;

    @ObfuscatedName("iu.t")
    public int field3284;

    @ObfuscatedName("iu.i")
    public int field3281;

    @ObfuscatedName("iu.o")
    public int field3286;

    @ObfuscatedName("iu.x")
    public int field3287;

    @ObfuscatedName("co.z(Lic;I)V")
    public static void method2071(class244 arg0) {
        Statics.field3285 = arg0;
    }

    @ObfuscatedName("iu.k(B)V")
    public void method4138() {
        this.method4139(this.field3283);
    }

    @ObfuscatedName("iu.s(Lkf;II)V")
    public void method4147(class310 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5193();
            if (var3 == 0) {
                return;
            }
            this.method4136(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iu.t(Lkf;III)V")
    public void method4136(class310 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3283 = arg0.method5197();
        }
    }

    @ObfuscatedName("iu.i(IB)V")
    public void method4139(int arg0) {
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
        this.field3281 = (int) (var14 * 256.0D);
        this.field3286 = (int) (var16 * 256.0D);
        if (this.field3281 < 0) {
            this.field3281 = 0;
        } else if (this.field3281 > 255) {
            this.field3281 = 255;
        }
        if (this.field3286 < 0) {
            this.field3286 = 0;
        } else if (this.field3286 > 255) {
            this.field3286 = 255;
        }
        if (var16 > 0.5D) {
            this.field3287 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3287 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3287 < 1) {
            this.field3287 = 1;
        }
        this.field3284 = (int) ((double) this.field3287 * var18);
    }
}

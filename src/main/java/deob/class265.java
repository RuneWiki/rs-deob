package deob;

@ObfuscatedName("jm")
public class class265 extends class214 {

    @ObfuscatedName("jm.h")
    public static class208 field3352 = new class208(64);

    @ObfuscatedName("jm.l")
    public int field3359 = 0;

    @ObfuscatedName("jm.g")
    public int field3355;

    @ObfuscatedName("jm.b")
    public int field3353;

    @ObfuscatedName("jm.a")
    public int field3357;

    @ObfuscatedName("jm.c")
    public int field3358;

    @ObfuscatedName("jm.h(B)V")
    public void method4703() {
        this.method4706(this.field3359);
    }

    @ObfuscatedName("jm.l(Lgc;IB)V")
    public void method4704(class190 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3511();
            if (var3 == 0) {
                return;
            }
            this.method4705(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jm.g(Lgc;III)V")
    public void method4705(class190 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3359 = arg0.method3515();
        }
    }

    @ObfuscatedName("jm.b(II)V")
    public void method4706(int arg0) {
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
        this.field3353 = (int) (var14 * 256.0D);
        this.field3357 = (int) (var16 * 256.0D);
        if (this.field3353 < 0) {
            this.field3353 = 0;
        } else if (this.field3353 > 255) {
            this.field3353 = 255;
        }
        if (this.field3357 < 0) {
            this.field3357 = 0;
        } else if (this.field3357 > 255) {
            this.field3357 = 255;
        }
        if (var16 > 0.5D) {
            this.field3358 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3358 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3358 < 1) {
            this.field3358 = 1;
        }
        this.field3355 = (int) ((double) this.field3358 * var18);
    }

    @ObfuscatedName("io.a(I)V")
    public static void method4627() {
        field3352.method3899();
    }
}

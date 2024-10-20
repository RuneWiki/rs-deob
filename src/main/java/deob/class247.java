package deob;

@ObfuscatedName("iz")
public class class247 extends class195 {

    @ObfuscatedName("iz.m")
    public static class190 field3350 = new class190(64);

    @ObfuscatedName("iz.e")
    public int field3349 = 0;

    @ObfuscatedName("iz.t")
    public int field3357;

    @ObfuscatedName("iz.w")
    public int field3351;

    @ObfuscatedName("iz.z")
    public int field3353;

    @ObfuscatedName("iz.j")
    public int field3354;

    @ObfuscatedName("hw.p(Lil;I)V")
    public static void method3596(class236 arg0) {
        Statics.field670 = arg0;
    }

    @ObfuscatedName("ca.m(II)Liz;")
    public static class247 method1418(int arg0) {
        class247 var1 = (class247) field3350.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field670.method3720(1, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method3923(new class174(var2), arg0);
        }
        var3.method3922();
        field3350.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.e(B)V")
    public void method3922() {
        this.method3925(this.field3349);
    }

    @ObfuscatedName("iz.t(Lfr;IB)V")
    public void method3923(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2810();
            if (var3 == 0) {
                return;
            }
            this.method3929(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iz.w(Lfr;III)V")
    public void method3929(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3349 = arg0.method2832();
        }
    }

    @ObfuscatedName("iz.z(II)V")
    public void method3925(int arg0) {
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
        this.field3351 = (int) (var14 * 256.0D);
        this.field3353 = (int) (var16 * 256.0D);
        if (this.field3351 < 0) {
            this.field3351 = 0;
        } else if (this.field3351 > 255) {
            this.field3351 = 255;
        }
        if (this.field3353 < 0) {
            this.field3353 = 0;
        } else if (this.field3353 > 255) {
            this.field3353 = 255;
        }
        if (var16 > 0.5D) {
            this.field3354 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3354 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3354 < 1) {
            this.field3354 = 1;
        }
        this.field3357 = (int) ((double) this.field3354 * var18);
    }
}

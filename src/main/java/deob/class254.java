package deob;

@ObfuscatedName("ie")
public class class254 extends class202 {

    @ObfuscatedName("ie.s")
    public static class197 field3392 = new class197(64);

    @ObfuscatedName("ie.r")
    public int field3396 = 0;

    @ObfuscatedName("ie.g")
    public int field3394;

    @ObfuscatedName("ie.x")
    public int field3395;

    @ObfuscatedName("ie.f")
    public int field3399;

    @ObfuscatedName("ie.u")
    public int field3397;

    @ObfuscatedName("ec.b(Lij;I)V")
    public static void method2304(class243 arg0) {
        Statics.field3393 = arg0;
    }

    @ObfuscatedName("hy.s(IS)Lie;")
    public static class254 method3676(int arg0) {
        class254 var1 = (class254) field3392.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3393.method3887(1, arg0);
        class254 var3 = new class254();
        if (var2 != null) {
            var3.method4033(new class181(var2), arg0);
        }
        var3.method4032();
        field3392.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.r(I)V")
    public void method4032() {
        this.method4047(this.field3396);
    }

    @ObfuscatedName("ie.g(Lfs;IB)V")
    public void method4033(class181 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2945();
            if (var3 == 0) {
                return;
            }
            this.method4034(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ie.x(Lfs;III)V")
    public void method4034(class181 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3396 = arg0.method3010();
        }
    }

    @ObfuscatedName("ie.f(II)V")
    public void method4047(int arg0) {
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
        this.field3395 = (int) (var14 * 256.0D);
        this.field3399 = (int) (var16 * 256.0D);
        if (this.field3395 < 0) {
            this.field3395 = 0;
        } else if (this.field3395 > 255) {
            this.field3395 = 255;
        }
        if (this.field3399 < 0) {
            this.field3399 = 0;
        } else if (this.field3399 > 255) {
            this.field3399 = 255;
        }
        if (var16 > 0.5D) {
            this.field3397 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3397 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3397 < 1) {
            this.field3397 = 1;
        }
        this.field3394 = (int) ((double) this.field3397 * var18);
    }
}

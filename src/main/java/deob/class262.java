package deob;

@ObfuscatedName("jc")
public class class262 extends class209 {

    @ObfuscatedName("jc.s")
    public static class203 field3309 = new class203(64);

    @ObfuscatedName("jc.o")
    public int field3311 = 0;

    @ObfuscatedName("jc.k")
    public int field3315;

    @ObfuscatedName("jc.u")
    public int field3313;

    @ObfuscatedName("jc.i")
    public int field3314;

    @ObfuscatedName("jc.t")
    public int field3318;

    @ObfuscatedName("ew.v(Lis;I)V")
    public static void method2947(class250 arg0) {
        Statics.field3312 = arg0;
    }

    @ObfuscatedName("he.s(IB)Ljc;")
    public static class262 method4013(int arg0) {
        class262 var1 = (class262) field3309.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3312.method4270(1, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4549(new class185(var2), arg0);
        }
        var3.method4550();
        field3309.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.o(I)V")
    public void method4550() {
        this.method4538(this.field3311);
    }

    @ObfuscatedName("jc.k(Lgx;IS)V")
    public void method4549(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3274();
            if (var3 == 0) {
                return;
            }
            this.method4545(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jc.u(Lgx;IIB)V")
    public void method4545(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3311 = arg0.method3494();
        }
    }

    @ObfuscatedName("jc.i(IS)V")
    public void method4538(int arg0) {
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
        this.field3313 = (int) (var14 * 256.0D);
        this.field3314 = (int) (var16 * 256.0D);
        if (this.field3313 < 0) {
            this.field3313 = 0;
        } else if (this.field3313 > 255) {
            this.field3313 = 255;
        }
        if (this.field3314 < 0) {
            this.field3314 = 0;
        } else if (this.field3314 > 255) {
            this.field3314 = 255;
        }
        if (var16 > 0.5D) {
            this.field3318 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3318 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3318 < 1) {
            this.field3318 = 1;
        }
        this.field3315 = (int) ((double) this.field3318 * var18);
    }
}

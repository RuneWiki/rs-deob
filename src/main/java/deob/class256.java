package deob;

@ObfuscatedName("ih")
public class class256 extends class181 {

    @ObfuscatedName("ih.f")
    public static class146 field3331 = new class146(64);

    @ObfuscatedName("ih.q")
    public int field3333 = 0;

    @ObfuscatedName("ih.w")
    public int field3330;

    @ObfuscatedName("ih.o")
    public int field3334;

    @ObfuscatedName("ih.u")
    public int field3335;

    @ObfuscatedName("ih.g")
    public int field3336;

    @ObfuscatedName("hv.m(Lir;I)V")
    public static void method3999(class245 arg0) {
        Statics.field3337 = arg0;
    }

    @ObfuscatedName("is.f(II)Lih;")
    public static class256 method4148(int arg0) {
        class256 var1 = (class256) field3331.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3337.method4156(1, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4413(new class202(var2), arg0);
        }
        var3.method4429();
        field3331.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ih.q(I)V")
    public void method4429() {
        this.method4415(this.field3333);
    }

    @ObfuscatedName("ih.w(Lgr;II)V")
    public void method4413(class202 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3551();
            if (var3 == 0) {
                return;
            }
            this.method4414(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ih.o(Lgr;III)V")
    public void method4414(class202 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3333 = arg0.method3421();
        }
    }

    @ObfuscatedName("ih.u(IB)V")
    public void method4415(int arg0) {
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
        this.field3334 = (int) (var14 * 256.0D);
        this.field3335 = (int) (var16 * 256.0D);
        if (this.field3334 < 0) {
            this.field3334 = 0;
        } else if (this.field3334 > 255) {
            this.field3334 = 255;
        }
        if (this.field3335 < 0) {
            this.field3335 = 0;
        } else if (this.field3335 > 255) {
            this.field3335 = 255;
        }
        if (var16 > 0.5D) {
            this.field3336 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3336 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3336 < 1) {
            this.field3336 = 1;
        }
        this.field3330 = (int) ((double) this.field3336 * var18);
    }

    @ObfuscatedName("dj.g(I)V")
    public static void method2616() {
        field3331.method3010();
    }
}

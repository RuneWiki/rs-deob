package deob;

@ObfuscatedName("jt")
public class class268 extends class185 {

    @ObfuscatedName("jt.k")
    public static class155 field3528 = new class155(64);

    @ObfuscatedName("jt.s")
    public int field3532 = 0;

    @ObfuscatedName("jt.t")
    public int field3523 = -1;

    @ObfuscatedName("jt.i")
    public boolean field3526 = true;

    @ObfuscatedName("jt.o")
    public int field3524 = -1;

    @ObfuscatedName("jt.x")
    public int field3530;

    @ObfuscatedName("jt.w")
    public int field3529;

    @ObfuscatedName("jt.g")
    public int field3527;

    @ObfuscatedName("jt.m")
    public int field3531;

    @ObfuscatedName("jt.n")
    public int field3525;

    @ObfuscatedName("jt.d")
    public int field3533;

    @ObfuscatedName("dy.z(II)Ljt;")
    public static class268 method2382(int arg0) {
        class268 var1 = (class268) field3528.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3.method3873(4, arg0);
        class268 var3 = new class268();
        if (var2 != null) {
            var3.method4488(new class310(var2), arg0);
        }
        var3.method4494();
        field3528.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jt.k(I)V")
    public void method4494() {
        if (this.field3524 != -1) {
            this.method4480(this.field3524);
            this.field3531 = this.field3530;
            this.field3525 = this.field3529;
            this.field3533 = this.field3527;
        }
        this.method4480(this.field3532);
    }

    @ObfuscatedName("jt.s(Lkf;II)V")
    public void method4488(class310 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5193();
            if (var3 == 0) {
                return;
            }
            this.method4482(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jt.t(Lkf;III)V")
    public void method4482(class310 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3532 = arg0.method5197();
        } else if (arg1 == 2) {
            this.field3523 = arg0.method5193();
        } else if (arg1 == 5) {
            this.field3526 = false;
        } else if (arg1 == 7) {
            this.field3524 = arg0.method5197();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jt.i(II)V")
    public void method4480(int arg0) {
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
        this.field3530 = (int) (var18 * 256.0D);
        this.field3529 = (int) (var14 * 256.0D);
        this.field3527 = (int) (var16 * 256.0D);
        if (this.field3529 < 0) {
            this.field3529 = 0;
        } else if (this.field3529 > 255) {
            this.field3529 = 255;
        }
        if (this.field3527 < 0) {
            this.field3527 = 0;
        } else if (this.field3527 > 255) {
            this.field3527 = 255;
        }
    }

    @ObfuscatedName("s.o(I)V")
    public static void method24() {
        field3528.method3172();
    }
}

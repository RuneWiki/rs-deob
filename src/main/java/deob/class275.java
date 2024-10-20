package deob;

@ObfuscatedName("jm")
public class class275 extends class209 {

    @ObfuscatedName("jm.s")
    public static class203 field3550 = new class203(64);

    @ObfuscatedName("jm.o")
    public int field3551 = 0;

    @ObfuscatedName("jm.k")
    public int field3556 = -1;

    @ObfuscatedName("jm.u")
    public boolean field3553 = true;

    @ObfuscatedName("jm.i")
    public int field3554 = -1;

    @ObfuscatedName("jm.t")
    public int field3555;

    @ObfuscatedName("jm.p")
    public int field3552;

    @ObfuscatedName("jm.l")
    public int field3549;

    @ObfuscatedName("jm.b")
    public int field3558;

    @ObfuscatedName("jm.c")
    public int field3557;

    @ObfuscatedName("jm.d")
    public int field3560;

    @ObfuscatedName("gz.v(IB)Ljm;")
    public static class275 method3574(int arg0) {
        class275 var1 = (class275) field3550.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3559.method4270(4, arg0);
        class275 var3 = new class275();
        if (var2 != null) {
            var3.method4856(new class185(var2), arg0);
        }
        var3.method4844();
        field3550.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.s(I)V")
    public void method4844() {
        if (this.field3554 != -1) {
            this.method4846(this.field3554);
            this.field3558 = this.field3555;
            this.field3557 = this.field3552;
            this.field3560 = this.field3549;
        }
        this.method4846(this.field3551);
    }

    @ObfuscatedName("jm.o(Lgx;IB)V")
    public void method4856(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3274();
            if (var3 == 0) {
                return;
            }
            this.method4845(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jm.k(Lgx;III)V")
    public void method4845(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3551 = arg0.method3494();
        } else if (arg1 == 2) {
            this.field3556 = arg0.method3274();
        } else if (arg1 == 5) {
            this.field3553 = false;
        } else if (arg1 == 7) {
            this.field3554 = arg0.method3494();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jm.u(II)V")
    public void method4846(int arg0) {
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
        this.field3555 = (int) (var18 * 256.0D);
        this.field3552 = (int) (var14 * 256.0D);
        this.field3549 = (int) (var16 * 256.0D);
        if (this.field3552 < 0) {
            this.field3552 = 0;
        } else if (this.field3552 > 255) {
            this.field3552 = 255;
        }
        if (this.field3549 < 0) {
            this.field3549 = 0;
        } else if (this.field3549 > 255) {
            this.field3549 = 255;
        }
    }

    @ObfuscatedName("k.i(I)V")
    public static void method42() {
        field3550.method3697();
    }
}

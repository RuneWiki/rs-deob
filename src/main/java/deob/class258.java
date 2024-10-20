package deob;

@ObfuscatedName("in")
public class class258 extends class206 {

    @ObfuscatedName("in.i")
    public static class201 field3400 = new class201(64);

    @ObfuscatedName("in.w")
    public int field3401 = 0;

    @ObfuscatedName("in.s")
    public int field3405;

    @ObfuscatedName("in.j")
    public int field3403;

    @ObfuscatedName("in.a")
    public int field3404;

    @ObfuscatedName("in.t")
    public int field3402;

    @ObfuscatedName("a.p(IS)Lin;")
    public static class258 method21(int arg0) {
        class258 var1 = (class258) field3400.method3504((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3399.method4032(1, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4276(new class185(var2), arg0);
        }
        var3.method4262();
        field3400.method3506(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.i(I)V")
    public void method4262() {
        this.method4266(this.field3401);
    }

    @ObfuscatedName("in.w(Lgj;II)V")
    public void method4276(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3197();
            if (var3 == 0) {
                return;
            }
            this.method4275(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("in.s(Lgj;III)V")
    public void method4275(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3401 = arg0.method3138();
        }
    }

    @ObfuscatedName("in.j(II)V")
    public void method4266(int arg0) {
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
        this.field3403 = (int) (var14 * 256.0D);
        this.field3404 = (int) (var16 * 256.0D);
        if (this.field3403 < 0) {
            this.field3403 = 0;
        } else if (this.field3403 > 255) {
            this.field3403 = 255;
        }
        if (this.field3404 < 0) {
            this.field3404 = 0;
        } else if (this.field3404 > 255) {
            this.field3404 = 255;
        }
        if (var16 > 0.5D) {
            this.field3402 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3402 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3402 < 1) {
            this.field3402 = 1;
        }
        this.field3405 = (int) ((double) this.field3402 * var18);
    }
}

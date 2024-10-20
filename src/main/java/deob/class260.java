package deob;

@ObfuscatedName("iz")
public class class260 extends class195 {

    @ObfuscatedName("iz.q")
    public static class190 field3568 = new class190(64);

    @ObfuscatedName("iz.x")
    public int field3569 = 0;

    @ObfuscatedName("iz.y")
    public int field3567 = -1;

    @ObfuscatedName("iz.e")
    public boolean field3574 = true;

    @ObfuscatedName("iz.f")
    public int field3572 = -1;

    @ObfuscatedName("iz.v")
    public int field3571;

    @ObfuscatedName("iz.t")
    public int field3577;

    @ObfuscatedName("iz.i")
    public int field3575;

    @ObfuscatedName("iz.r")
    public int field3576;

    @ObfuscatedName("iz.g")
    public int field3573;

    @ObfuscatedName("iz.s")
    public int field3578;

    @ObfuscatedName("w.d(Lim;S)V")
    public static void method107(class236 arg0) {
        Statics.field3580 = arg0;
    }

    @ObfuscatedName("hh.q(II)Liz;")
    public static class260 method3726(int arg0) {
        class260 var1 = (class260) field3568.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3580.method3750(4, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4281(new class174(var2), arg0);
        }
        var3.method4290();
        field3568.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.x(I)V")
    public void method4290() {
        if (this.field3572 != -1) {
            this.method4283(this.field3572);
            this.field3576 = this.field3571;
            this.field3573 = this.field3577;
            this.field3578 = this.field3575;
        }
        this.method4283(this.field3569);
    }

    @ObfuscatedName("iz.y(Lfw;IB)V")
    public void method4281(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2921();
            if (var3 == 0) {
                return;
            }
            this.method4282(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iz.e(Lfw;III)V")
    public void method4282(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3569 = arg0.method2918();
        } else if (arg1 == 2) {
            this.field3567 = arg0.method2921();
        } else if (arg1 == 5) {
            this.field3574 = false;
        } else if (arg1 == 7) {
            this.field3572 = arg0.method2918();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("iz.f(II)V")
    public void method4283(int arg0) {
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
        this.field3571 = (int) (var18 * 256.0D);
        this.field3577 = (int) (var14 * 256.0D);
        this.field3575 = (int) (var16 * 256.0D);
        if (this.field3577 < 0) {
            this.field3577 = 0;
        } else if (this.field3577 > 255) {
            this.field3577 = 255;
        }
        if (this.field3575 < 0) {
            this.field3575 = 0;
        } else if (this.field3575 > 255) {
            this.field3575 = 255;
        }
    }
}

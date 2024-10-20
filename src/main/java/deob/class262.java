package deob;

@ObfuscatedName("ju")
public class class262 extends class209 {

    @ObfuscatedName("ju.r")
    public static class203 field3360 = new class203(64);

    @ObfuscatedName("ju.e")
    public int field3359 = 0;

    @ObfuscatedName("ju.q")
    public int field3362;

    @ObfuscatedName("ju.c")
    public int field3365;

    @ObfuscatedName("ju.l")
    public int field3364;

    @ObfuscatedName("ju.b")
    public int field3361;

    @ObfuscatedName("u.g(II)Lju;")
    public static class262 method455(int arg0) {
        class262 var1 = (class262) field3360.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3366.method4438(1, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4718(new class185(var2), arg0);
        }
        var3.method4703();
        field3360.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ju.r(B)V")
    public void method4703() {
        this.method4706(this.field3359);
    }

    @ObfuscatedName("ju.e(Lgl;IB)V")
    public void method4718(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3679();
            if (var3 == 0) {
                return;
            }
            this.method4705(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ju.q(Lgl;III)V")
    public void method4705(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3359 = arg0.method3469();
        }
    }

    @ObfuscatedName("ju.c(II)V")
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
        this.field3365 = (int) (var14 * 256.0D);
        this.field3364 = (int) (var16 * 256.0D);
        if (this.field3365 < 0) {
            this.field3365 = 0;
        } else if (this.field3365 > 255) {
            this.field3365 = 255;
        }
        if (this.field3364 < 0) {
            this.field3364 = 0;
        } else if (this.field3364 > 255) {
            this.field3364 = 255;
        }
        if (var16 > 0.5D) {
            this.field3361 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3361 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3361 < 1) {
            this.field3361 = 1;
        }
        this.field3362 = (int) ((double) this.field3361 * var18);
    }
}

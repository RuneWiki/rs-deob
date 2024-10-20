package deob;

@ObfuscatedName("jp")
public class class267 extends class215 {

    @ObfuscatedName("jp.q")
    public static class210 field3437 = new class210(64);

    @ObfuscatedName("jp.o")
    public int field3441 = 0;

    @ObfuscatedName("jp.p")
    public int field3439;

    @ObfuscatedName("jp.a")
    public int field3440;

    @ObfuscatedName("jp.h")
    public int field3436;

    @ObfuscatedName("jp.l")
    public int field3442;

    @ObfuscatedName("co.b(IS)Ljp;")
    public static class267 method1776(int arg0) {
        class267 var1 = (class267) field3437.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3438.method4158(1, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4399(new class194(var2), arg0);
        }
        var3.method4402();
        field3437.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.q(I)V")
    public void method4402() {
        this.method4401(this.field3441);
    }

    @ObfuscatedName("jp.o(Lgn;IB)V")
    public void method4399(class194 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3247();
            if (var3 == 0) {
                return;
            }
            this.method4400(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jp.p(Lgn;III)V")
    public void method4400(class194 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3441 = arg0.method3251();
        }
    }

    @ObfuscatedName("jp.a(II)V")
    public void method4401(int arg0) {
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
        this.field3440 = (int) (var14 * 256.0D);
        this.field3436 = (int) (var16 * 256.0D);
        if (this.field3440 < 0) {
            this.field3440 = 0;
        } else if (this.field3440 > 255) {
            this.field3440 = 255;
        }
        if (this.field3436 < 0) {
            this.field3436 = 0;
        } else if (this.field3436 > 255) {
            this.field3436 = 255;
        }
        if (var16 > 0.5D) {
            this.field3442 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3442 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3442 < 1) {
            this.field3442 = 1;
        }
        this.field3439 = (int) ((double) this.field3442 * var18);
    }
}

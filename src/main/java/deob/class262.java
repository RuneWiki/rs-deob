package deob;

@ObfuscatedName("jz")
public class class262 extends class209 {

    @ObfuscatedName("jz.h")
    public static class203 field3343 = new class203(64);

    @ObfuscatedName("jz.e")
    public int field3339 = 0;

    @ObfuscatedName("jz.b")
    public int field3340;

    @ObfuscatedName("jz.l")
    public int field3341;

    @ObfuscatedName("jz.w")
    public int field3342;

    @ObfuscatedName("jz.d")
    public int field3338;

    @ObfuscatedName("ic.f(II)Ljz;")
    public static class262 method4474(int arg0) {
        class262 var1 = (class262) field3343.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3337.method4267(1, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4511(new class185(var2), arg0);
        }
        var3.method4508();
        field3343.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.h(B)V")
    public void method4508() {
        this.method4510(this.field3339);
    }

    @ObfuscatedName("jz.e(Lgx;II)V")
    public void method4511(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3323();
            if (var3 == 0) {
                return;
            }
            this.method4509(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jz.b(Lgx;III)V")
    public void method4509(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3339 = arg0.method3327();
        }
    }

    @ObfuscatedName("jz.l(II)V")
    public void method4510(int arg0) {
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
        this.field3341 = (int) (var14 * 256.0D);
        this.field3342 = (int) (var16 * 256.0D);
        if (this.field3341 < 0) {
            this.field3341 = 0;
        } else if (this.field3341 > 255) {
            this.field3341 = 255;
        }
        if (this.field3342 < 0) {
            this.field3342 = 0;
        } else if (this.field3342 > 255) {
            this.field3342 = 255;
        }
        if (var16 > 0.5D) {
            this.field3338 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3338 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3338 < 1) {
            this.field3338 = 1;
        }
        this.field3340 = (int) ((double) this.field3338 * var18);
    }

    @ObfuscatedName("ar.w(I)V")
    public static void method654() {
        field3343.method3725();
    }
}

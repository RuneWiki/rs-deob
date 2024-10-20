package deob;

@ObfuscatedName("jv")
public class class262 extends class209 {

    @ObfuscatedName("jv.l")
    public static class203 field3347 = new class203(64);

    @ObfuscatedName("jv.w")
    public int field3349 = 0;

    @ObfuscatedName("jv.s")
    public int field3352;

    @ObfuscatedName("jv.e")
    public int field3351;

    @ObfuscatedName("jv.a")
    public int field3350;

    @ObfuscatedName("jv.c")
    public int field3353;

    @ObfuscatedName("ev.f(II)Ljv;")
    public static class262 method3020(int arg0) {
        class262 var1 = (class262) field3347.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3356.method4289(1, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4547(new class185(var2), arg0);
        }
        var3.method4549();
        field3347.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jv.l(B)V")
    public void method4549() {
        this.method4565(this.field3349);
    }

    @ObfuscatedName("jv.w(Lgm;II)V")
    public void method4547(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3344();
            if (var3 == 0) {
                return;
            }
            this.method4548(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jv.s(Lgm;III)V")
    public void method4548(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3349 = arg0.method3348();
        }
    }

    @ObfuscatedName("jv.e(II)V")
    public void method4565(int arg0) {
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
        this.field3351 = (int) (var14 * 256.0D);
        this.field3350 = (int) (var16 * 256.0D);
        if (this.field3351 < 0) {
            this.field3351 = 0;
        } else if (this.field3351 > 255) {
            this.field3351 = 255;
        }
        if (this.field3350 < 0) {
            this.field3350 = 0;
        } else if (this.field3350 > 255) {
            this.field3350 = 255;
        }
        if (var16 > 0.5D) {
            this.field3353 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3353 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3353 < 1) {
            this.field3353 = 1;
        }
        this.field3352 = (int) ((double) this.field3353 * var18);
    }

    @ObfuscatedName("kq.c(I)V")
    public static void method5185() {
        field3347.method3740();
    }
}

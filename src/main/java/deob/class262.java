package deob;

@ObfuscatedName("jg")
public class class262 extends class209 {

    @ObfuscatedName("jg.c")
    public static class203 field3333 = new class203(64);

    @ObfuscatedName("jg.n")
    public int field3335 = 0;

    @ObfuscatedName("jg.u")
    public int field3340;

    @ObfuscatedName("jg.i")
    public int field3337;

    @ObfuscatedName("jg.r")
    public int field3338;

    @ObfuscatedName("jg.j")
    public int field3334;

    @ObfuscatedName("bs.y(Liu;I)V")
    public static void method1657(class250 arg0) {
        Statics.field3339 = arg0;
    }

    @ObfuscatedName("ie.c(II)Ljg;")
    public static class262 method4427(int arg0) {
        class262 var1 = (class262) field3333.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3339.method4263(1, arg0);
        class262 var3 = new class262();
        if (var2 != null) {
            var3.method4513(new class185(var2), arg0);
        }
        var3.method4519();
        field3333.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.n(I)V")
    public void method4519() {
        this.method4521(this.field3335);
    }

    @ObfuscatedName("jg.u(Lge;II)V")
    public void method4513(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3299();
            if (var3 == 0) {
                return;
            }
            this.method4512(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jg.i(Lge;IIB)V")
    public void method4512(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3335 = arg0.method3272();
        }
    }

    @ObfuscatedName("jg.p(IB)V")
    public void method4521(int arg0) {
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
        this.field3337 = (int) (var14 * 256.0D);
        this.field3338 = (int) (var16 * 256.0D);
        if (this.field3337 < 0) {
            this.field3337 = 0;
        } else if (this.field3337 > 255) {
            this.field3337 = 255;
        }
        if (this.field3338 < 0) {
            this.field3338 = 0;
        } else if (this.field3338 > 255) {
            this.field3338 = 255;
        }
        if (var16 > 0.5D) {
            this.field3334 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3334 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3334 < 1) {
            this.field3334 = 1;
        }
        this.field3340 = (int) ((double) this.field3334 * var18);
    }
}

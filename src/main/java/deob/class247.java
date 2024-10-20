package deob;

@ObfuscatedName("ik")
public class class247 extends class195 {

    @ObfuscatedName("ik.p")
    public static class190 field3344 = new class190(64);

    @ObfuscatedName("ik.i")
    public int field3346 = 0;

    @ObfuscatedName("ik.j")
    public int field3347;

    @ObfuscatedName("ik.f")
    public int field3348;

    @ObfuscatedName("ik.m")
    public int field3349;

    @ObfuscatedName("ik.c")
    public int field3350;

    @ObfuscatedName("fb.n(II)Lik;")
    public static class247 method2819(int arg0) {
        class247 var1 = (class247) field3344.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3345.method3880(1, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method4063(new class174(var2), arg0);
        }
        var3.method4070();
        field3344.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.p(I)V")
    public void method4070() {
        this.method4062(this.field3346);
    }

    @ObfuscatedName("ik.i(Lfl;II)V")
    public void method4063(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2925();
            if (var3 == 0) {
                return;
            }
            this.method4064(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ik.j(Lfl;III)V")
    public void method4064(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3346 = arg0.method2910();
        }
    }

    @ObfuscatedName("ik.f(II)V")
    public void method4062(int arg0) {
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
        this.field3348 = (int) (var14 * 256.0D);
        this.field3349 = (int) (var16 * 256.0D);
        if (this.field3348 < 0) {
            this.field3348 = 0;
        } else if (this.field3348 > 255) {
            this.field3348 = 255;
        }
        if (this.field3349 < 0) {
            this.field3349 = 0;
        } else if (this.field3349 > 255) {
            this.field3349 = 255;
        }
        if (var16 > 0.5D) {
            this.field3350 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3350 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3350 < 1) {
            this.field3350 = 1;
        }
        this.field3347 = (int) ((double) this.field3350 * var18);
    }

    @ObfuscatedName("fd.m(I)V")
    public static void method2885() {
        field3344.method3286();
    }
}

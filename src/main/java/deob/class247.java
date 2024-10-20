package deob;

@ObfuscatedName("io")
public class class247 extends class195 {

    @ObfuscatedName("io.h")
    public static class190 field3337 = new class190(64);

    @ObfuscatedName("io.u")
    public int field3332 = 0;

    @ObfuscatedName("io.q")
    public int field3333;

    @ObfuscatedName("io.g")
    public int field3330;

    @ObfuscatedName("io.v")
    public int field3331;

    @ObfuscatedName("io.t")
    public int field3334;

    @ObfuscatedName("cc.i(Liy;I)V")
    public static void method1736(class236 arg0) {
        Statics.field3335 = arg0;
    }

    @ObfuscatedName("il.h(II)Lio;")
    public static class247 method3983(int arg0) {
        class247 var1 = (class247) field3337.method3308((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3335.method3836(1, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method4066(new class174(var2), arg0);
        }
        var3.method4067();
        field3337.method3316(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.u(I)V")
    public void method4067() {
        this.method4070(this.field3332);
    }

    @ObfuscatedName("io.q(Lfv;II)V")
    public void method4066(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2930();
            if (var3 == 0) {
                return;
            }
            this.method4082(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("io.g(Lfv;III)V")
    public void method4082(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3332 = arg0.method3033();
        }
    }

    @ObfuscatedName("io.v(IB)V")
    public void method4070(int arg0) {
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
        this.field3330 = (int) (var14 * 256.0D);
        this.field3331 = (int) (var16 * 256.0D);
        if (this.field3330 < 0) {
            this.field3330 = 0;
        } else if (this.field3330 > 255) {
            this.field3330 = 255;
        }
        if (this.field3331 < 0) {
            this.field3331 = 0;
        } else if (this.field3331 > 255) {
            this.field3331 = 255;
        }
        if (var16 > 0.5D) {
            this.field3334 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3334 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3334 < 1) {
            this.field3334 = 1;
        }
        this.field3333 = (int) ((double) this.field3334 * var18);
    }

    @ObfuscatedName("bm.t(B)V")
    public static void method1009() {
        field3337.method3311();
    }
}

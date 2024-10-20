package deob;

@ObfuscatedName("if")
public class class248 extends class196 {

    @ObfuscatedName("if.n")
    public static class191 field3334 = new class191(64);

    @ObfuscatedName("if.g")
    public int field3335 = 0;

    @ObfuscatedName("if.y")
    public int field3336;

    @ObfuscatedName("if.w")
    public int field3337;

    @ObfuscatedName("if.k")
    public int field3338;

    @ObfuscatedName("if.v")
    public int field3339;

    @ObfuscatedName("ha.e(Lit;I)V")
    public static void method3638(class237 arg0) {
        Statics.field3333 = arg0;
    }

    @ObfuscatedName("az.n(II)Lif;")
    public static class248 method463(int arg0) {
        class248 var1 = (class248) field3334.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3333.method3817(1, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4044(new class175(var2), arg0);
        }
        var3.method4043();
        field3334.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.g(I)V")
    public void method4043() {
        this.method4046(this.field3335);
    }

    @ObfuscatedName("if.y(Lfh;IB)V")
    public void method4044(class175 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2928();
            if (var3 == 0) {
                return;
            }
            this.method4045(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("if.w(Lfh;IIS)V")
    public void method4045(class175 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3335 = arg0.method2932();
        }
    }

    @ObfuscatedName("if.k(II)V")
    public void method4046(int arg0) {
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
            this.field3339 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3339 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3339 < 1) {
            this.field3339 = 1;
        }
        this.field3336 = (int) ((double) this.field3339 * var18);
    }

    @ObfuscatedName("ab.v(I)V")
    public static void method582() {
        field3334.method3282();
    }
}

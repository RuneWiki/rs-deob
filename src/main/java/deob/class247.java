package deob;

@ObfuscatedName("io")
public class class247 extends class195 {

    @ObfuscatedName("io.o")
    public static class190 field3317 = new class190(64);

    @ObfuscatedName("io.m")
    public int field3318 = 0;

    @ObfuscatedName("io.g")
    public int field3316;

    @ObfuscatedName("io.d")
    public int field3320;

    @ObfuscatedName("io.b")
    public int field3321;

    @ObfuscatedName("io.k")
    public int field3322;

    @ObfuscatedName("ik.e(Lin;I)V")
    public static void method3872(class236 arg0) {
        Statics.field3319 = arg0;
    }

    @ObfuscatedName("fe.o(II)Lio;")
    public static class247 method2800(int arg0) {
        class247 var1 = (class247) field3317.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3319.method3760(1, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method3974(new class174(var2), arg0);
        }
        var3.method3986();
        field3317.method3250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.m(S)V")
    public void method3986() {
        this.method3976(this.field3318);
    }

    @ObfuscatedName("io.g(Lfw;IB)V")
    public void method3974(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2891();
            if (var3 == 0) {
                return;
            }
            this.method3975(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("io.d(Lfw;III)V")
    public void method3975(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3318 = arg0.method2890();
        }
    }

    @ObfuscatedName("io.b(II)V")
    public void method3976(int arg0) {
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
        this.field3320 = (int) (var14 * 256.0D);
        this.field3321 = (int) (var16 * 256.0D);
        if (this.field3320 < 0) {
            this.field3320 = 0;
        } else if (this.field3320 > 255) {
            this.field3320 = 255;
        }
        if (this.field3321 < 0) {
            this.field3321 = 0;
        } else if (this.field3321 > 255) {
            this.field3321 = 255;
        }
        if (var16 > 0.5D) {
            this.field3322 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3322 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3322 < 1) {
            this.field3322 = 1;
        }
        this.field3316 = (int) ((double) this.field3322 * var18);
    }
}

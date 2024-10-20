package deob;

@ObfuscatedName("iy")
public class class247 extends class195 {

    @ObfuscatedName("iy.o")
    public static class190 field3323 = new class190(64);

    @ObfuscatedName("iy.i")
    public int field3317 = 0;

    @ObfuscatedName("iy.u")
    public int field3318;

    @ObfuscatedName("iy.g")
    public int field3321;

    @ObfuscatedName("iy.m")
    public int field3320;

    @ObfuscatedName("iy.s")
    public int field3316;

    @ObfuscatedName("fk.c(II)Liy;")
    public static class247 method2764(int arg0) {
        class247 var1 = (class247) field3323.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3319.method3741(1, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method3934(new class174(var2), arg0);
        }
        var3.method3933();
        field3323.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.o(I)V")
    public void method3933() {
        this.method3936(this.field3317);
    }

    @ObfuscatedName("iy.i(Lfp;II)V")
    public void method3934(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2843();
            if (var3 == 0) {
                return;
            }
            this.method3940(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iy.u(Lfp;IIB)V")
    public void method3940(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3317 = arg0.method2994();
        }
    }

    @ObfuscatedName("iy.g(II)V")
    public void method3936(int arg0) {
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
        this.field3321 = (int) (var14 * 256.0D);
        this.field3320 = (int) (var16 * 256.0D);
        if (this.field3321 < 0) {
            this.field3321 = 0;
        } else if (this.field3321 > 255) {
            this.field3321 = 255;
        }
        if (this.field3320 < 0) {
            this.field3320 = 0;
        } else if (this.field3320 > 255) {
            this.field3320 = 255;
        }
        if (var16 > 0.5D) {
            this.field3316 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3316 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3316 < 1) {
            this.field3316 = 1;
        }
        this.field3318 = (int) ((double) this.field3316 * var18);
    }

    @ObfuscatedName("em.m(I)V")
    public static void method2422() {
        field3323.method3223();
    }
}

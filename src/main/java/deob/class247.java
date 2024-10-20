package deob;

@ObfuscatedName("ij")
public class class247 extends class195 {

    @ObfuscatedName("ij.j")
    public static class190 field3343 = new class190(64);

    @ObfuscatedName("ij.n")
    public int field3345 = 0;

    @ObfuscatedName("ij.r")
    public int field3344;

    @ObfuscatedName("ij.v")
    public int field3342;

    @ObfuscatedName("ij.e")
    public int field3347;

    @ObfuscatedName("ij.l")
    public int field3348;

    @ObfuscatedName("do.a(II)Lij;")
    public static class247 method1919(int arg0) {
        class247 var1 = (class247) field3343.method3245((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3346.method3787(1, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method3969(new class174(var2), arg0);
        }
        var3.method3967();
        field3343.method3247(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.j(I)V")
    public void method3967() {
        this.method3971(this.field3345);
    }

    @ObfuscatedName("ij.n(Lfe;II)V")
    public void method3969(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2871();
            if (var3 == 0) {
                return;
            }
            this.method3970(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ij.r(Lfe;III)V")
    public void method3970(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3345 = arg0.method2875();
        }
    }

    @ObfuscatedName("ij.v(II)V")
    public void method3971(int arg0) {
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
        this.field3342 = (int) (var14 * 256.0D);
        this.field3347 = (int) (var16 * 256.0D);
        if (this.field3342 < 0) {
            this.field3342 = 0;
        } else if (this.field3342 > 255) {
            this.field3342 = 255;
        }
        if (this.field3347 < 0) {
            this.field3347 = 0;
        } else if (this.field3347 > 255) {
            this.field3347 = 255;
        }
        if (var16 > 0.5D) {
            this.field3348 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3348 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3348 < 1) {
            this.field3348 = 1;
        }
        this.field3344 = (int) ((double) this.field3348 * var18);
    }
}

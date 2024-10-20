package deob;

@ObfuscatedName("iy")
public class class247 extends class195 {

    @ObfuscatedName("iy.q")
    public static class190 field3329 = new class190(64);

    @ObfuscatedName("iy.x")
    public int field3324 = 0;

    @ObfuscatedName("iy.y")
    public int field3325;

    @ObfuscatedName("iy.e")
    public int field3326;

    @ObfuscatedName("iy.f")
    public int field3327;

    @ObfuscatedName("iy.v")
    public int field3323;

    @ObfuscatedName("fh.d(IS)Liy;")
    public static class247 method2881(int arg0) {
        class247 var1 = (class247) field3329.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3322.method3750(1, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method3950(new class174(var2), arg0);
        }
        var3.method3952();
        field3329.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iy.q(S)V")
    public void method3952() {
        this.method3948(this.field3324);
    }

    @ObfuscatedName("iy.x(Lfw;II)V")
    public void method3950(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2921();
            if (var3 == 0) {
                return;
            }
            this.method3949(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iy.y(Lfw;III)V")
    public void method3949(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3324 = arg0.method2918();
        }
    }

    @ObfuscatedName("iy.e(II)V")
    public void method3948(int arg0) {
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
        this.field3326 = (int) (var14 * 256.0D);
        this.field3327 = (int) (var16 * 256.0D);
        if (this.field3326 < 0) {
            this.field3326 = 0;
        } else if (this.field3326 > 255) {
            this.field3326 = 255;
        }
        if (this.field3327 < 0) {
            this.field3327 = 0;
        } else if (this.field3327 > 255) {
            this.field3327 = 255;
        }
        if (var16 > 0.5D) {
            this.field3323 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3323 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3323 < 1) {
            this.field3323 = 1;
        }
        this.field3325 = (int) ((double) this.field3323 * var18);
    }
}

package deob;

@ObfuscatedName("ij")
public class class260 extends class207 {

    @ObfuscatedName("ij.m")
    public static class201 field3303 = new class201(64);

    @ObfuscatedName("ij.q")
    public int field3304 = 0;

    @ObfuscatedName("ij.b")
    public int field3305;

    @ObfuscatedName("ij.f")
    public int field3306;

    @ObfuscatedName("ij.n")
    public int field3307;

    @ObfuscatedName("ij.h")
    public int field3308;

    @ObfuscatedName("ie.w(Liv;I)V")
    public static void method4473(class248 arg0) {
        Statics.field2760 = arg0;
    }

    @ObfuscatedName("ep.m(IB)Lij;")
    public static class260 method2894(int arg0) {
        class260 var1 = (class260) field3303.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2760.method4250(1, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4493(new class183(var2), arg0);
        }
        var3.method4507();
        field3303.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ij.q(I)V")
    public void method4507() {
        this.method4495(this.field3304);
    }

    @ObfuscatedName("ij.x(Lgy;IB)V")
    public void method4493(class183 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3436();
            if (var3 == 0) {
                return;
            }
            this.method4494(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ij.j(Lgy;III)V")
    public void method4494(class183 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3304 = arg0.method3266();
        }
    }

    @ObfuscatedName("ij.a(II)V")
    public void method4495(int arg0) {
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
        this.field3306 = (int) (var14 * 256.0D);
        this.field3307 = (int) (var16 * 256.0D);
        if (this.field3306 < 0) {
            this.field3306 = 0;
        } else if (this.field3306 > 255) {
            this.field3306 = 255;
        }
        if (this.field3307 < 0) {
            this.field3307 = 0;
        } else if (this.field3307 > 255) {
            this.field3307 = 255;
        }
        if (var16 > 0.5D) {
            this.field3308 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3308 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3308 < 1) {
            this.field3308 = 1;
        }
        this.field3305 = (int) ((double) this.field3308 * var18);
    }
}

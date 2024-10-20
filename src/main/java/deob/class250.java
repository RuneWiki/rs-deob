package deob;

@ObfuscatedName("ic")
public class class250 extends class198 {

    @ObfuscatedName("ic.c")
    public static class193 field3357 = new class193(64);

    @ObfuscatedName("ic.f")
    public int field3354 = 0;

    @ObfuscatedName("ic.m")
    public int field3355;

    @ObfuscatedName("ic.h")
    public int field3352;

    @ObfuscatedName("ic.t")
    public int field3358;

    @ObfuscatedName("ic.p")
    public int field3353;

    @ObfuscatedName("it.s(II)Lic;")
    public static class250 method3832(int arg0) {
        class250 var1 = (class250) field3357.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3356.method3840(1, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4073(new class177(var2), arg0);
        }
        var3.method4072();
        field3357.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.c(I)V")
    public void method4072() {
        this.method4075(this.field3354);
    }

    @ObfuscatedName("ic.f(Lfs;II)V")
    public void method4073(class177 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2965();
            if (var3 == 0) {
                return;
            }
            this.method4074(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ic.m(Lfs;III)V")
    public void method4074(class177 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3354 = arg0.method2969();
        }
    }

    @ObfuscatedName("ic.h(II)V")
    public void method4075(int arg0) {
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
        this.field3352 = (int) (var14 * 256.0D);
        this.field3358 = (int) (var16 * 256.0D);
        if (this.field3352 < 0) {
            this.field3352 = 0;
        } else if (this.field3352 > 255) {
            this.field3352 = 255;
        }
        if (this.field3358 < 0) {
            this.field3358 = 0;
        } else if (this.field3358 > 255) {
            this.field3358 = 255;
        }
        if (var16 > 0.5D) {
            this.field3353 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3353 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3353 < 1) {
            this.field3353 = 1;
        }
        this.field3355 = (int) ((double) this.field3353 * var18);
    }

    @ObfuscatedName("f.t(I)V")
    public static void method4() {
        field3357.method3316();
    }
}

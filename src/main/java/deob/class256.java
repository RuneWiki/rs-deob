package deob;

@ObfuscatedName("ia")
public class class256 extends class185 {

    @ObfuscatedName("ia.b")
    public static class155 field3285 = new class155(64);

    @ObfuscatedName("ia.l")
    public int field3286 = 0;

    @ObfuscatedName("ia.m")
    public int field3287;

    @ObfuscatedName("ia.z")
    public int field3288;

    @ObfuscatedName("ia.q")
    public int field3289;

    @ObfuscatedName("ia.k")
    public int field3290;

    @ObfuscatedName("bm.f(Liw;I)V")
    public static void method1065(class245 arg0) {
        Statics.field3291 = arg0;
    }

    @ObfuscatedName("is.b(IS)Lia;")
    public static class256 method3877(int arg0) {
        class256 var1 = (class256) field3285.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3291.method3905(1, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4180(new class311(var2), arg0);
        }
        var3.method4190();
        field3285.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.l(I)V")
    public void method4190() {
        this.method4182(this.field3286);
    }

    @ObfuscatedName("ia.m(Lkb;II)V")
    public void method4180(class311 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5276();
            if (var3 == 0) {
                return;
            }
            this.method4181(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ia.z(Lkb;IIS)V")
    public void method4181(class311 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3286 = arg0.method5184();
        }
    }

    @ObfuscatedName("ia.q(II)V")
    public void method4182(int arg0) {
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
        this.field3288 = (int) (var14 * 256.0D);
        this.field3289 = (int) (var16 * 256.0D);
        if (this.field3288 < 0) {
            this.field3288 = 0;
        } else if (this.field3288 > 255) {
            this.field3288 = 255;
        }
        if (this.field3289 < 0) {
            this.field3289 = 0;
        } else if (this.field3289 > 255) {
            this.field3289 = 255;
        }
        if (var16 > 0.5D) {
            this.field3290 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3290 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3290 < 1) {
            this.field3290 = 1;
        }
        this.field3287 = (int) ((double) this.field3290 * var18);
    }

    @ObfuscatedName("gv.k(I)V")
    public static void method3616() {
        field3285.method3158();
    }
}

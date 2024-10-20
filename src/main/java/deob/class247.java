package deob;

@ObfuscatedName("ia")
public class class247 extends class195 {

    @ObfuscatedName("ia.w")
    public static class190 field3350 = new class190(64);

    @ObfuscatedName("ia.a")
    public int field3356 = 0;

    @ObfuscatedName("ia.t")
    public int field3352;

    @ObfuscatedName("ia.s")
    public int field3349;

    @ObfuscatedName("ia.r")
    public int field3354;

    @ObfuscatedName("ia.v")
    public int field3355;

    @ObfuscatedName("r.i(Liq;I)V")
    public static void method22(class236 arg0) {
        Statics.field3351 = arg0;
    }

    @ObfuscatedName("hs.w(IB)Lia;")
    public static class247 method3728(int arg0) {
        class247 var1 = (class247) field3350.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3351.method3768(1, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method4019(new class174(var2), arg0);
        }
        var3.method4009();
        field3350.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.a(I)V")
    public void method4009() {
        this.method4001(this.field3356);
    }

    @ObfuscatedName("ia.t(Lfp;II)V")
    public void method4019(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3061();
            if (var3 == 0) {
                return;
            }
            this.method4000(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ia.s(Lfp;III)V")
    public void method4000(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3356 = arg0.method2917();
        }
    }

    @ObfuscatedName("ia.r(IB)V")
    public void method4001(int arg0) {
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
        this.field3349 = (int) (var14 * 256.0D);
        this.field3354 = (int) (var16 * 256.0D);
        if (this.field3349 < 0) {
            this.field3349 = 0;
        } else if (this.field3349 > 255) {
            this.field3349 = 255;
        }
        if (this.field3354 < 0) {
            this.field3354 = 0;
        } else if (this.field3354 > 255) {
            this.field3354 = 255;
        }
        if (var16 > 0.5D) {
            this.field3355 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3355 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3355 < 1) {
            this.field3355 = 1;
        }
        this.field3352 = (int) ((double) this.field3355 * var18);
    }

    @ObfuscatedName("ek.v(I)V")
    public static void method2356() {
        field3350.method3232();
    }
}

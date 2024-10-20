package deob;

@ObfuscatedName("gh")
public class class190 extends class428 {

    @ObfuscatedName("gh.e")
    public static class269 field2098 = new class269(64);

    @ObfuscatedName("gh.v")
    public int field2100 = 0;

    @ObfuscatedName("gh.x")
    public int field2096;

    @ObfuscatedName("gh.m")
    public int field2097;

    @ObfuscatedName("gh.q")
    public int field2099;

    @ObfuscatedName("gh.f")
    public int field2102;

    @ObfuscatedName("ea.h(Lly;I)V")
    public static void method2905(class333 arg0) {
        Statics.field3329 = arg0;
    }

    @ObfuscatedName("p.e(IB)Lgh;")
    public static class190 method295(int arg0) {
        class190 var1 = (class190) field2098.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3329.method5909(1, arg0);
        class190 var3 = new class190();
        if (var2 != null) {
            var3.method3414(new class467(var2), arg0);
        }
        var3.method3403();
        field2098.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.v(I)V")
    public void method3403() {
        this.method3406(this.field2100);
    }

    @ObfuscatedName("gh.x(Lqy;IB)V")
    public void method3414(class467 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7792();
            if (var3 == 0) {
                return;
            }
            this.method3405(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gh.m(Lqy;III)V")
    public void method3405(class467 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2100 = arg0.method7796();
        }
    }

    @ObfuscatedName("gh.q(II)V")
    public void method3406(int arg0) {
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
        this.field2097 = (int) (var14 * 256.0D);
        this.field2099 = (int) (var16 * 256.0D);
        if (this.field2097 < 0) {
            this.field2097 = 0;
        } else if (this.field2097 > 255) {
            this.field2097 = 255;
        }
        if (this.field2099 < 0) {
            this.field2099 = 0;
        } else if (this.field2099 > 255) {
            this.field2099 = 255;
        }
        if (var16 > 0.5D) {
            this.field2102 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2102 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2102 < 1) {
            this.field2102 = 1;
        }
        this.field2096 = (int) ((double) this.field2102 * var18);
    }
}

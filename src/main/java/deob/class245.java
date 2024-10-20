package deob;

@ObfuscatedName("ie")
public class class245 extends class176 {

    @ObfuscatedName("ie.j")
    public static class146 field3237 = new class146(64);

    @ObfuscatedName("ie.i")
    public int field3241 = 0;

    @ObfuscatedName("ie.k")
    public int field3239;

    @ObfuscatedName("ie.u")
    public int field3243;

    @ObfuscatedName("ie.n")
    public int field3236;

    @ObfuscatedName("ie.t")
    public int field3242;

    @ObfuscatedName("fm.s(Lhz;I)V")
    public static void method3289(class234 arg0) {
        Statics.field3238 = arg0;
    }

    @ObfuscatedName("hv.j(II)Lie;")
    public static class245 method3759(int arg0) {
        class245 var1 = (class245) field3237.method3065((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3238.method3790(1, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method4033(new class300(var2), arg0);
        }
        var3.method4035();
        field3237.method3067(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.i(B)V")
    public void method4035() {
        this.method4026(this.field3241);
    }

    @ObfuscatedName("ie.k(Lky;IB)V")
    public void method4033(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5179();
            if (var3 == 0) {
                return;
            }
            this.method4024(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ie.u(Lky;III)V")
    public void method4024(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3241 = arg0.method5169();
        }
    }

    @ObfuscatedName("ie.n(II)V")
    public void method4026(int arg0) {
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
        this.field3243 = (int) (var14 * 256.0D);
        this.field3236 = (int) (var16 * 256.0D);
        if (this.field3243 < 0) {
            this.field3243 = 0;
        } else if (this.field3243 > 255) {
            this.field3243 = 255;
        }
        if (this.field3236 < 0) {
            this.field3236 = 0;
        } else if (this.field3236 > 255) {
            this.field3236 = 255;
        }
        if (var16 > 0.5D) {
            this.field3242 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3242 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3242 < 1) {
            this.field3242 = 1;
        }
        this.field3239 = (int) ((double) this.field3242 * var18);
    }
}

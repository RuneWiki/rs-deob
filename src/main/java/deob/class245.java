package deob;

@ObfuscatedName("iu")
public class class245 extends class176 {

    @ObfuscatedName("iu.n")
    public static class146 field3233 = new class146(64);

    @ObfuscatedName("iu.v")
    public int field3235 = 0;

    @ObfuscatedName("iu.u")
    public int field3236;

    @ObfuscatedName("iu.r")
    public int field3234;

    @ObfuscatedName("iu.p")
    public int field3238;

    @ObfuscatedName("iu.q")
    public int field3239;

    @ObfuscatedName("el.z(IB)Liu;")
    public static class245 method3057(int arg0) {
        class245 var1 = (class245) field3233.method2992((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3241.method3726(1, arg0);
        class245 var3 = new class245();
        if (var2 != null) {
            var3.method3990(new class300(var2), arg0);
        }
        var3.method3989();
        field3233.method2994(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.n(I)V")
    public void method3989() {
        this.method3994(this.field3235);
    }

    @ObfuscatedName("iu.v(Lkl;II)V")
    public void method3990(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method4990();
            if (var3 == 0) {
                return;
            }
            this.method3999(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iu.u(Lkl;III)V")
    public void method3999(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3235 = arg0.method4994();
        }
    }

    @ObfuscatedName("iu.r(II)V")
    public void method3994(int arg0) {
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
        this.field3234 = (int) (var14 * 256.0D);
        this.field3238 = (int) (var16 * 256.0D);
        if (this.field3234 < 0) {
            this.field3234 = 0;
        } else if (this.field3234 > 255) {
            this.field3234 = 255;
        }
        if (this.field3238 < 0) {
            this.field3238 = 0;
        } else if (this.field3238 > 255) {
            this.field3238 = 255;
        }
        if (var16 > 0.5D) {
            this.field3239 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3239 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3239 < 1) {
            this.field3239 = 1;
        }
        this.field3236 = (int) ((double) this.field3239 * var18);
    }
}

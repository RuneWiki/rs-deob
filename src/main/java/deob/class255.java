package deob;

@ObfuscatedName("if")
public class class255 extends class185 {

    @ObfuscatedName("if.m")
    public static class155 field3259 = new class155(64);

    @ObfuscatedName("if.k")
    public int field3255 = 0;

    @ObfuscatedName("if.d")
    public int field3256;

    @ObfuscatedName("if.w")
    public int field3257;

    @ObfuscatedName("if.v")
    public int field3253;

    @ObfuscatedName("if.q")
    public int field3254;

    @ObfuscatedName("bt.x(II)Lif;")
    public static class255 method839(int arg0) {
        class255 var1 = (class255) field3259.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3258.method3869(1, arg0);
        class255 var3 = new class255();
        if (var2 != null) {
            var3.method4123(new class310(var2), arg0);
        }
        var3.method4111();
        field3259.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.m(I)V")
    public void method4111() {
        this.method4114(this.field3255);
    }

    @ObfuscatedName("if.k(Lkb;II)V")
    public void method4123(class310 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5137();
            if (var3 == 0) {
                return;
            }
            this.method4113(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("if.d(Lkb;III)V")
    public void method4113(class310 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3255 = arg0.method5264();
        }
    }

    @ObfuscatedName("if.w(II)V")
    public void method4114(int arg0) {
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
        this.field3257 = (int) (var14 * 256.0D);
        this.field3253 = (int) (var16 * 256.0D);
        if (this.field3257 < 0) {
            this.field3257 = 0;
        } else if (this.field3257 > 255) {
            this.field3257 = 255;
        }
        if (this.field3253 < 0) {
            this.field3253 = 0;
        } else if (this.field3253 > 255) {
            this.field3253 = 255;
        }
        if (var16 > 0.5D) {
            this.field3254 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3254 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3254 < 1) {
            this.field3254 = 1;
        }
        this.field3256 = (int) ((double) this.field3254 * var18);
    }
}

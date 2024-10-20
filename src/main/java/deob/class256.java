package deob;

@ObfuscatedName("iw")
public class class256 extends class185 {

    @ObfuscatedName("iw.v")
    public static class155 field3289 = new class155(64);

    @ObfuscatedName("iw.x")
    public int field3290 = 0;

    @ObfuscatedName("iw.w")
    public int field3291;

    @ObfuscatedName("iw.t")
    public int field3293;

    @ObfuscatedName("iw.j")
    public int field3292;

    @ObfuscatedName("iw.n")
    public int field3294;

    @ObfuscatedName("iy.h(II)Liw;")
    public static class256 method4036(int arg0) {
        class256 var1 = (class256) field3289.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3288.method3834(1, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4079(new class311(var2), arg0);
        }
        var3.method4078();
        field3289.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.v(I)V")
    public void method4078() {
        this.method4081(this.field3290);
    }

    @ObfuscatedName("iw.x(Lkj;II)V")
    public void method4079(class311 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5274();
            if (var3 == 0) {
                return;
            }
            this.method4080(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iw.w(Lkj;IIB)V")
    public void method4080(class311 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3290 = arg0.method5119();
        }
    }

    @ObfuscatedName("iw.t(II)V")
    public void method4081(int arg0) {
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
        this.field3293 = (int) (var14 * 256.0D);
        this.field3292 = (int) (var16 * 256.0D);
        if (this.field3293 < 0) {
            this.field3293 = 0;
        } else if (this.field3293 > 255) {
            this.field3293 = 255;
        }
        if (this.field3292 < 0) {
            this.field3292 = 0;
        } else if (this.field3292 > 255) {
            this.field3292 = 255;
        }
        if (var16 > 0.5D) {
            this.field3294 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3294 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3294 < 1) {
            this.field3294 = 1;
        }
        this.field3291 = (int) ((double) this.field3294 * var18);
    }
}

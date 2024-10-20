package deob;

@ObfuscatedName("iw")
public class class256 extends class185 {

    @ObfuscatedName("iw.v")
    public static class155 field3293 = new class155(64);

    @ObfuscatedName("iw.d")
    public int field3290 = 0;

    @ObfuscatedName("iw.c")
    public int field3292;

    @ObfuscatedName("iw.y")
    public int field3289;

    @ObfuscatedName("iw.h")
    public int field3294;

    @ObfuscatedName("iw.z")
    public int field3295;

    @ObfuscatedName("ao.n(II)Liw;")
    public static class256 method738(int arg0) {
        class256 var1 = (class256) field3293.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3291.method4032(1, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4228(new class311(var2), arg0);
        }
        var3.method4242();
        field3293.method3217(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iw.v(I)V")
    public void method4242() {
        this.method4230(this.field3290);
    }

    @ObfuscatedName("iw.d(Lkx;II)V")
    public void method4228(class311 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5310();
            if (var3 == 0) {
                return;
            }
            this.method4229(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iw.c(Lkx;III)V")
    public void method4229(class311 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3290 = arg0.method5263();
        }
    }

    @ObfuscatedName("iw.y(II)V")
    public void method4230(int arg0) {
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
        this.field3289 = (int) (var14 * 256.0D);
        this.field3294 = (int) (var16 * 256.0D);
        if (this.field3289 < 0) {
            this.field3289 = 0;
        } else if (this.field3289 > 255) {
            this.field3289 = 255;
        }
        if (this.field3294 < 0) {
            this.field3294 = 0;
        } else if (this.field3294 > 255) {
            this.field3294 = 255;
        }
        if (var16 > 0.5D) {
            this.field3295 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3295 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3295 < 1) {
            this.field3295 = 1;
        }
        this.field3292 = (int) ((double) this.field3295 * var18);
    }
}

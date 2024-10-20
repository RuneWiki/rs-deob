package deob;

@ObfuscatedName("iw")
public class class255 extends class185 {

    @ObfuscatedName("iw.o")
    public static class155 field3288 = new class155(64);

    @ObfuscatedName("iw.q")
    public int field3290 = 0;

    @ObfuscatedName("iw.j")
    public int field3291;

    @ObfuscatedName("iw.p")
    public int field3292;

    @ObfuscatedName("iw.g")
    public int field3289;

    @ObfuscatedName("iw.n")
    public int field3293;

    @ObfuscatedName("cn.m(Lic;I)V")
    public static void method1805(class244 arg0) {
        Statics.field3287 = arg0;
    }

    @ObfuscatedName("iw.o(I)V")
    public void method4166() {
        this.method4169(this.field3290);
    }

    @ObfuscatedName("iw.q(Lkn;IB)V")
    public void method4167(class310 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5227();
            if (var3 == 0) {
                return;
            }
            this.method4176(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iw.j(Lkn;IIB)V")
    public void method4176(class310 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3290 = arg0.method5231();
        }
    }

    @ObfuscatedName("iw.p(IB)V")
    public void method4169(int arg0) {
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
        this.field3292 = (int) (var14 * 256.0D);
        this.field3289 = (int) (var16 * 256.0D);
        if (this.field3292 < 0) {
            this.field3292 = 0;
        } else if (this.field3292 > 255) {
            this.field3292 = 255;
        }
        if (this.field3289 < 0) {
            this.field3289 = 0;
        } else if (this.field3289 > 255) {
            this.field3289 = 255;
        }
        if (var16 > 0.5D) {
            this.field3293 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3293 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3293 < 1) {
            this.field3293 = 1;
        }
        this.field3291 = (int) ((double) this.field3293 * var18);
    }
}

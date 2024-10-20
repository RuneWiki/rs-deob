package deob;

@ObfuscatedName("am")
public class class33 extends class174 {

    @ObfuscatedName("am.v")
    public static class170 field878 = new class170(64);

    @ObfuscatedName("am.m")
    public int field886 = 0;

    @ObfuscatedName("am.j")
    public int field880;

    @ObfuscatedName("am.o")
    public int field881;

    @ObfuscatedName("am.l")
    public int field882;

    @ObfuscatedName("am.g")
    public int field883;

    @ObfuscatedName("am.v(I)V")
    public void method711() {
        this.method700(this.field886);
    }

    @ObfuscatedName("am.m(Lda;II)V")
    public void method696(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2491();
            if (var3 == 0) {
                return;
            }
            this.method709(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("am.j(Lda;IIB)V")
    public void method709(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field886 = arg0.method2494();
        }
    }

    @ObfuscatedName("am.o(II)V")
    public void method700(int arg0) {
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
        this.field881 = (int) (var14 * 256.0D);
        this.field882 = (int) (var16 * 256.0D);
        if (this.field881 < 0) {
            this.field881 = 0;
        } else if (this.field881 > 255) {
            this.field881 = 255;
        }
        if (this.field882 < 0) {
            this.field882 = 0;
        } else if (this.field882 > 255) {
            this.field882 = 255;
        }
        if (var16 > 0.5D) {
            this.field883 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field883 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field883 < 1) {
            this.field883 = 1;
        }
        this.field880 = (int) ((double) this.field883 * var18);
    }

    @ObfuscatedName("bg.l(I)V")
    public static void method1403() {
        field878.method3311();
    }
}

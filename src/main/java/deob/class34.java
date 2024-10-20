package deob;

@ObfuscatedName("ag")
public class class34 extends class176 {

    @ObfuscatedName("ag.b")
    public static class172 field879 = new class172(64);

    @ObfuscatedName("ag.r")
    public int field870 = 0;

    @ObfuscatedName("ag.l")
    public int field871;

    @ObfuscatedName("ag.s")
    public int field882;

    @ObfuscatedName("ag.d")
    public int field873;

    @ObfuscatedName("ag.e")
    public int field874;

    @ObfuscatedName("at.i(Leg;I)V")
    public static void method595(class155 arg0) {
        Statics.field872 = arg0;
    }

    @ObfuscatedName("ag.b(B)V")
    public void method699() {
        this.method702(this.field870);
    }

    @ObfuscatedName("ag.r(Lds;II)V")
    public void method700(class128 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2531();
            if (var3 == 0) {
                return;
            }
            this.method701(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ag.l(Lds;IIB)V")
    public void method701(class128 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field870 = arg0.method2599();
        }
    }

    @ObfuscatedName("ag.s(IS)V")
    public void method702(int arg0) {
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
        this.field882 = (int) (var14 * 256.0D);
        this.field873 = (int) (var16 * 256.0D);
        if (this.field882 < 0) {
            this.field882 = 0;
        } else if (this.field882 > 255) {
            this.field882 = 255;
        }
        if (this.field873 < 0) {
            this.field873 = 0;
        } else if (this.field873 > 255) {
            this.field873 = 255;
        }
        if (var16 > 0.5D) {
            this.field874 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field874 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field874 < 1) {
            this.field874 = 1;
        }
        this.field871 = (int) ((double) this.field874 * var18);
    }

    @ObfuscatedName("z.d(I)V")
    public static void method162() {
        field879.method3279();
    }
}

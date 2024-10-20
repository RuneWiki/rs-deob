package deob;

@ObfuscatedName("ay")
public class class37 extends class183 {

    @ObfuscatedName("ay.i")
    public static class172 field901 = new class172(64);

    @ObfuscatedName("ay.k")
    public int field902 = 0;

    @ObfuscatedName("ay.e")
    public int field903;

    @ObfuscatedName("ay.w")
    public int field907;

    @ObfuscatedName("ay.m")
    public int field905;

    @ObfuscatedName("ay.u")
    public int field906;

    @ObfuscatedName("cv.g(Leo;I)V")
    public static void method1853(class147 arg0) {
        Statics.field900 = arg0;
    }

    @ObfuscatedName("ay.i(B)V")
    public void method665() {
        this.method676(this.field902);
    }

    @ObfuscatedName("ay.k(Ldk;II)V")
    public void method666(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2092();
            if (var3 == 0) {
                return;
            }
            this.method671(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ay.e(Ldk;III)V")
    public void method671(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field902 = arg0.method2096();
        }
    }

    @ObfuscatedName("ay.w(II)V")
    public void method676(int arg0) {
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
        this.field907 = (int) (var14 * 256.0D);
        this.field905 = (int) (var16 * 256.0D);
        if (this.field907 < 0) {
            this.field907 = 0;
        } else if (this.field907 > 255) {
            this.field907 = 255;
        }
        if (this.field905 < 0) {
            this.field905 = 0;
        } else if (this.field905 > 255) {
            this.field905 = 255;
        }
        if (var16 > 0.5D) {
            this.field906 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field906 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field906 < 1) {
            this.field906 = 1;
        }
        this.field903 = (int) ((double) this.field906 * var18);
    }

    @ObfuscatedName("fd.m(I)V")
    public static void method3044() {
        field901.method3138();
    }
}

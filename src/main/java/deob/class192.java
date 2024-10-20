package deob;

@ObfuscatedName("gb")
public class class192 extends class130 {

    @ObfuscatedName("gb.m")
    public static class125 field2818 = new class125(64);

    @ObfuscatedName("gb.b")
    public int field2817 = 0;

    @ObfuscatedName("gb.g")
    public int field2811;

    @ObfuscatedName("gb.h")
    public int field2813;

    @ObfuscatedName("gb.v")
    public int field2810;

    @ObfuscatedName("gb.l")
    public int field2809;

    @ObfuscatedName("gb.o(B)V")
    public void method3191() {
        this.method3200(this.field2817);
    }

    @ObfuscatedName("gb.m(Lez;II)V")
    public void method3192(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2552();
            if (var3 == 0) {
                return;
            }
            this.method3193(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gb.b(Lez;IIS)V")
    public void method3193(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2817 = arg0.method2556();
        }
    }

    @ObfuscatedName("gb.g(II)V")
    public void method3200(int arg0) {
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
        this.field2813 = (int) (var14 * 256.0D);
        this.field2810 = (int) (var16 * 256.0D);
        if (this.field2813 < 0) {
            this.field2813 = 0;
        } else if (this.field2813 > 255) {
            this.field2813 = 255;
        }
        if (this.field2810 < 0) {
            this.field2810 = 0;
        } else if (this.field2810 > 255) {
            this.field2810 = 255;
        }
        if (var16 > 0.5D) {
            this.field2809 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2809 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2809 < 1) {
            this.field2809 = 1;
        }
        this.field2811 = (int) ((double) this.field2809 * var18);
    }
}

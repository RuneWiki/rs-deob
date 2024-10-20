package deob;

@ObfuscatedName("gi")
public class class192 extends class130 {

    @ObfuscatedName("gi.n")
    public static class125 field2817 = new class125(64);

    @ObfuscatedName("gi.g")
    public int field2814 = 0;

    @ObfuscatedName("gi.v")
    public int field2816;

    @ObfuscatedName("gi.y")
    public int field2812;

    @ObfuscatedName("gi.p")
    public int field2815;

    @ObfuscatedName("gi.j")
    public int field2818;

    @ObfuscatedName("gi.x(I)V")
    public void method3344() {
        this.method3341(this.field2814);
    }

    @ObfuscatedName("gi.n(Leq;II)V")
    public void method3339(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2878();
            if (var3 == 0) {
                return;
            }
            this.method3343(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gi.g(Leq;III)V")
    public void method3343(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2814 = arg0.method2705();
        }
    }

    @ObfuscatedName("gi.v(II)V")
    public void method3341(int arg0) {
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
        this.field2812 = (int) (var14 * 256.0D);
        this.field2815 = (int) (var16 * 256.0D);
        if (this.field2812 < 0) {
            this.field2812 = 0;
        } else if (this.field2812 > 255) {
            this.field2812 = 255;
        }
        if (this.field2815 < 0) {
            this.field2815 = 0;
        } else if (this.field2815 > 255) {
            this.field2815 = 255;
        }
        if (var16 > 0.5D) {
            this.field2818 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2818 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2818 < 1) {
            this.field2818 = 1;
        }
        this.field2816 = (int) ((double) this.field2818 * var18);
    }
}

package deob;

@ObfuscatedName("ax")
public class class38 extends class185 {

    @ObfuscatedName("ax.y")
    public static class174 field882 = new class174(64);

    @ObfuscatedName("ax.g")
    public int field883 = 0;

    @ObfuscatedName("ax.j")
    public int field884;

    @ObfuscatedName("ax.w")
    public int field889;

    @ObfuscatedName("ax.c")
    public int field886;

    @ObfuscatedName("ax.x")
    public int field887;

    @ObfuscatedName("ax.l(I)V")
    public void method693() {
        this.method708(this.field883);
    }

    @ObfuscatedName("ax.y(Ldk;II)V")
    public void method694(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2291();
            if (var3 == 0) {
                return;
            }
            this.method695(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ax.g(Ldk;IIS)V")
    public void method695(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field883 = arg0.method2214();
        }
    }

    @ObfuscatedName("ax.j(II)V")
    public void method708(int arg0) {
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
        this.field889 = (int) (var14 * 256.0D);
        this.field886 = (int) (var16 * 256.0D);
        if (this.field889 < 0) {
            this.field889 = 0;
        } else if (this.field889 > 255) {
            this.field889 = 255;
        }
        if (this.field886 < 0) {
            this.field886 = 0;
        } else if (this.field886 > 255) {
            this.field886 = 255;
        }
        if (var16 > 0.5D) {
            this.field887 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field887 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field887 < 1) {
            this.field887 = 1;
        }
        this.field884 = (int) ((double) this.field887 * var18);
    }
}

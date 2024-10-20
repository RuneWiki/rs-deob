package deob;

@ObfuscatedName("ag")
public class class38 extends class185 {

    @ObfuscatedName("ag.j")
    public static class174 field902 = new class174(64);

    @ObfuscatedName("ag.z")
    public int field903 = 0;

    @ObfuscatedName("ag.b")
    public int field904;

    @ObfuscatedName("ag.k")
    public int field905;

    @ObfuscatedName("ag.c")
    public int field906;

    @ObfuscatedName("ag.w")
    public int field910;

    @ObfuscatedName("z.g(Lei;I)V")
    public static void method22(class149 arg0) {
        Statics.field911 = arg0;
    }

    @ObfuscatedName("ag.j(I)V")
    public void method654() {
        this.method657(this.field903);
    }

    @ObfuscatedName("ag.z(Ldf;IB)V")
    public void method653(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2083();
            if (var3 == 0) {
                return;
            }
            this.method660(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ag.b(Ldf;III)V")
    public void method660(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field903 = arg0.method2260();
        }
    }

    @ObfuscatedName("ag.k(II)V")
    public void method657(int arg0) {
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
        this.field905 = (int) (var14 * 256.0D);
        this.field906 = (int) (var16 * 256.0D);
        if (this.field905 < 0) {
            this.field905 = 0;
        } else if (this.field905 > 255) {
            this.field905 = 255;
        }
        if (this.field906 < 0) {
            this.field906 = 0;
        } else if (this.field906 > 255) {
            this.field906 = 255;
        }
        if (var16 > 0.5D) {
            this.field910 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field910 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field910 < 1) {
            this.field910 = 1;
        }
        this.field904 = (int) ((double) this.field910 * var18);
    }
}

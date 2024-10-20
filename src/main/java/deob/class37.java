package deob;

@ObfuscatedName("af")
public class class37 extends class182 {

    @ObfuscatedName("af.v")
    public static class171 field882 = new class171(64);

    @ObfuscatedName("af.i")
    public int field883 = 0;

    @ObfuscatedName("af.g")
    public int field884;

    @ObfuscatedName("af.x")
    public int field885;

    @ObfuscatedName("af.b")
    public int field888;

    @ObfuscatedName("af.q")
    public int field886;

    @ObfuscatedName("af.e(I)V")
    public void method678() {
        this.method686(this.field883);
    }

    @ObfuscatedName("af.v(Ldk;II)V")
    public void method677(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2226();
            if (var3 == 0) {
                return;
            }
            this.method680(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("af.i(Ldk;III)V")
    public void method680(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field883 = arg0.method2112();
        }
    }

    @ObfuscatedName("af.g(IB)V")
    public void method686(int arg0) {
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
        this.field885 = (int) (var14 * 256.0D);
        this.field888 = (int) (var16 * 256.0D);
        if (this.field885 < 0) {
            this.field885 = 0;
        } else if (this.field885 > 255) {
            this.field885 = 255;
        }
        if (this.field888 < 0) {
            this.field888 = 0;
        } else if (this.field888 > 255) {
            this.field888 = 255;
        }
        if (var16 > 0.5D) {
            this.field886 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field886 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field886 < 1) {
            this.field886 = 1;
        }
        this.field884 = (int) ((double) this.field886 * var18);
    }

    @ObfuscatedName("cd.x(B)V")
    public static void method1963() {
        field882.method3128();
    }
}

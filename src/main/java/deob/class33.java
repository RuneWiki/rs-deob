package deob;

@ObfuscatedName("an")
public class class33 extends class174 {

    @ObfuscatedName("an.l")
    public static class170 field887 = new class170(64);

    @ObfuscatedName("an.c")
    public int field890 = 0;

    @ObfuscatedName("an.d")
    public int field889;

    @ObfuscatedName("an.b")
    public int field897;

    @ObfuscatedName("an.i")
    public int field892;

    @ObfuscatedName("an.p")
    public int field888;

    @ObfuscatedName("an.t(I)V")
    public void method714() {
        this.method709(this.field890);
    }

    @ObfuscatedName("an.l(Ldo;IB)V")
    public void method707(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2438();
            if (var3 == 0) {
                return;
            }
            this.method708(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("an.c(Ldo;III)V")
    public void method708(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field890 = arg0.method2442();
        }
    }

    @ObfuscatedName("an.d(II)V")
    public void method709(int arg0) {
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
        this.field897 = (int) (var14 * 256.0D);
        this.field892 = (int) (var16 * 256.0D);
        if (this.field897 < 0) {
            this.field897 = 0;
        } else if (this.field897 > 255) {
            this.field897 = 255;
        }
        if (this.field892 < 0) {
            this.field892 = 0;
        } else if (this.field892 > 255) {
            this.field892 = 255;
        }
        if (var16 > 0.5D) {
            this.field888 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field888 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field888 < 1) {
            this.field888 = 1;
        }
        this.field889 = (int) ((double) this.field888 * var18);
    }

    @ObfuscatedName("cy.b(I)V")
    public static void method1873() {
        field887.method3264();
    }
}

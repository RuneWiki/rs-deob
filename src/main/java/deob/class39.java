package deob;

@ObfuscatedName("ao")
public class class39 extends class195 {

    @ObfuscatedName("ao.w")
    public static class184 field921 = new class184(64);

    @ObfuscatedName("ao.i")
    public int field922 = 0;

    @ObfuscatedName("ao.e")
    public int field920;

    @ObfuscatedName("ao.h")
    public int field924;

    @ObfuscatedName("ao.q")
    public int field925;

    @ObfuscatedName("ao.l")
    public int field926;

    @ObfuscatedName("ao.n(I)V")
    public void method721() {
        this.method729(this.field922);
    }

    @ObfuscatedName("ao.w(Ldo;IB)V")
    public void method733(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2155();
            if (var3 == 0) {
                return;
            }
            this.method720(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ao.i(Ldo;III)V")
    public void method720(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field922 = arg0.method2315();
        }
    }

    @ObfuscatedName("ao.e(II)V")
    public void method729(int arg0) {
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
        this.field924 = (int) (var14 * 256.0D);
        this.field925 = (int) (var16 * 256.0D);
        if (this.field924 < 0) {
            this.field924 = 0;
        } else if (this.field924 > 255) {
            this.field924 = 255;
        }
        if (this.field925 < 0) {
            this.field925 = 0;
        } else if (this.field925 > 255) {
            this.field925 = 255;
        }
        if (var16 > 0.5D) {
            this.field926 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field926 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field926 < 1) {
            this.field926 = 1;
        }
        this.field920 = (int) ((double) this.field926 * var18);
    }
}

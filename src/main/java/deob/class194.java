package deob;

@ObfuscatedName("gn")
public class class194 extends class151 {

    @ObfuscatedName("gn.c")
    public static class146 field2823 = new class146(64);

    @ObfuscatedName("gn.n")
    public int field2822 = 0;

    @ObfuscatedName("gn.q")
    public int field2826;

    @ObfuscatedName("gn.t")
    public int field2824;

    @ObfuscatedName("gn.p")
    public int field2820;

    @ObfuscatedName("gn.u")
    public int field2825;

    @ObfuscatedName("gn.d(I)V")
    public void method3277() {
        this.method3280(this.field2822);
    }

    @ObfuscatedName("gn.c(Ldu;II)V")
    public void method3275(class130 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2379();
            if (var3 == 0) {
                return;
            }
            this.method3293(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gn.n(Ldu;III)V")
    public void method3293(class130 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2822 = arg0.method2233();
        }
    }

    @ObfuscatedName("gn.q(II)V")
    public void method3280(int arg0) {
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
        this.field2824 = (int) (var14 * 256.0D);
        this.field2820 = (int) (var16 * 256.0D);
        if (this.field2824 < 0) {
            this.field2824 = 0;
        } else if (this.field2824 > 255) {
            this.field2824 = 255;
        }
        if (this.field2820 < 0) {
            this.field2820 = 0;
        } else if (this.field2820 > 255) {
            this.field2820 = 255;
        }
        if (var16 > 0.5D) {
            this.field2825 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2825 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2825 < 1) {
            this.field2825 = 1;
        }
        this.field2826 = (int) ((double) this.field2825 * var18);
    }
}

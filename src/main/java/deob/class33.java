package deob;

@ObfuscatedName("aq")
public class class33 extends class174 {

    @ObfuscatedName("aq.r")
    public static class170 field846 = new class170(64);

    @ObfuscatedName("aq.u")
    public int field848 = 0;

    @ObfuscatedName("aq.t")
    public int field849;

    @ObfuscatedName("aq.k")
    public int field847;

    @ObfuscatedName("aq.x")
    public int field851;

    @ObfuscatedName("aq.v")
    public int field852;

    @ObfuscatedName("aq.a(B)V")
    public void method636() {
        this.method645(this.field848);
    }

    @ObfuscatedName("aq.r(Ldf;II)V")
    public void method637(class126 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2481();
            if (var3 == 0) {
                return;
            }
            this.method639(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aq.u(Ldf;III)V")
    public void method639(class126 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field848 = arg0.method2382();
        }
    }

    @ObfuscatedName("aq.t(II)V")
    public void method645(int arg0) {
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
        this.field847 = (int) (var14 * 256.0D);
        this.field851 = (int) (var16 * 256.0D);
        if (this.field847 < 0) {
            this.field847 = 0;
        } else if (this.field847 > 255) {
            this.field847 = 255;
        }
        if (this.field851 < 0) {
            this.field851 = 0;
        } else if (this.field851 > 255) {
            this.field851 = 255;
        }
        if (var16 > 0.5D) {
            this.field852 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field852 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field852 < 1) {
            this.field852 = 1;
        }
        this.field849 = (int) ((double) this.field852 * var18);
    }
}

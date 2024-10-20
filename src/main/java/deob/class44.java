package deob;

@ObfuscatedName("af")
public class class44 extends class208 {

    @ObfuscatedName("af.q")
    public static class197 field988 = new class197(64);

    @ObfuscatedName("af.f")
    public int field989 = 0;

    @ObfuscatedName("af.c")
    public int field990;

    @ObfuscatedName("af.v")
    public int field996;

    @ObfuscatedName("af.j")
    public int field991;

    @ObfuscatedName("af.m")
    public int field999;

    @ObfuscatedName("af.k(I)V")
    public void method850() {
        this.method857(this.field989);
    }

    @ObfuscatedName("af.q(Lde;II)V")
    public void method847(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2427();
            if (var3 == 0) {
                return;
            }
            this.method843(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("af.f(Lde;III)V")
    public void method843(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field989 = arg0.method2431();
        }
    }

    @ObfuscatedName("af.c(II)V")
    public void method857(int arg0) {
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
        this.field996 = (int) (var14 * 256.0D);
        this.field991 = (int) (var16 * 256.0D);
        if (this.field996 < 0) {
            this.field996 = 0;
        } else if (this.field996 > 255) {
            this.field996 = 255;
        }
        if (this.field991 < 0) {
            this.field991 = 0;
        } else if (this.field991 > 255) {
            this.field991 = 255;
        }
        if (var16 > 0.5D) {
            this.field999 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field999 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field999 < 1) {
            this.field999 = 1;
        }
        this.field990 = (int) ((double) this.field999 * var18);
    }
}

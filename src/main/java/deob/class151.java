package deob;

@ObfuscatedName("en")
public class class151 extends class349 {

    @ObfuscatedName("en.t")
    public static class223 field1680 = new class223(64);

    @ObfuscatedName("en.v")
    public int field1681 = 0;

    @ObfuscatedName("en.j")
    public int field1682;

    @ObfuscatedName("en.l")
    public int field1686;

    @ObfuscatedName("en.n")
    public int field1684;

    @ObfuscatedName("en.w")
    public int field1685;

    @ObfuscatedName("bv.s(Ljy;I)V")
    public static void method1612(class277 arg0) {
        Statics.field1683 = arg0;
    }

    @ObfuscatedName("en.t(S)V")
    public void method2558() {
        this.method2557(this.field1681);
    }

    @ObfuscatedName("en.v(Lnv;II)V")
    public void method2559(class385 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5958();
            if (var3 == 0) {
                return;
            }
            this.method2560(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("en.j(Lnv;III)V")
    public void method2560(class385 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field1681 = arg0.method5962();
        }
    }

    @ObfuscatedName("en.l(II)V")
    public void method2557(int arg0) {
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
        this.field1686 = (int) (var14 * 256.0D);
        this.field1684 = (int) (var16 * 256.0D);
        if (this.field1686 < 0) {
            this.field1686 = 0;
        } else if (this.field1686 > 255) {
            this.field1686 = 255;
        }
        if (this.field1684 < 0) {
            this.field1684 = 0;
        } else if (this.field1684 > 255) {
            this.field1684 = 255;
        }
        if (var16 > 0.5D) {
            this.field1685 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field1685 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field1685 < 1) {
            this.field1685 = 1;
        }
        this.field1682 = (int) ((double) this.field1685 * var18);
    }

    @ObfuscatedName("ig.n(I)V")
    public static void method4358() {
        field1680.method3930();
    }
}

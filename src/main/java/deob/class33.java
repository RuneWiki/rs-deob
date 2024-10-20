package deob;

@ObfuscatedName("ac")
public class class33 extends class174 {

    @ObfuscatedName("ac.q")
    public static class170 field881 = new class170(64);

    @ObfuscatedName("ac.y")
    public int field895 = 0;

    @ObfuscatedName("ac.v")
    public int field883;

    @ObfuscatedName("ac.g")
    public int field884;

    @ObfuscatedName("ac.x")
    public int field897;

    @ObfuscatedName("ac.u")
    public int field886;

    @ObfuscatedName("ac.c(I)V")
    public void method652() {
        this.method668(this.field895);
    }

    @ObfuscatedName("ac.q(Ldg;IB)V")
    public void method653(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2383();
            if (var3 == 0) {
                return;
            }
            this.method654(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ac.y(Ldg;IIB)V")
    public void method654(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field895 = arg0.method2322();
        }
    }

    @ObfuscatedName("ac.v(II)V")
    public void method668(int arg0) {
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
        this.field884 = (int) (var14 * 256.0D);
        this.field897 = (int) (var16 * 256.0D);
        if (this.field884 < 0) {
            this.field884 = 0;
        } else if (this.field884 > 255) {
            this.field884 = 255;
        }
        if (this.field897 < 0) {
            this.field897 = 0;
        } else if (this.field897 > 255) {
            this.field897 = 255;
        }
        if (var16 > 0.5D) {
            this.field886 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field886 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field886 < 1) {
            this.field886 = 1;
        }
        this.field883 = (int) ((double) this.field886 * var18);
    }

    @ObfuscatedName("l.g(S)V")
    public static void method57() {
        field881.method3093();
    }
}

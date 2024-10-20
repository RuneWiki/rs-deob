package deob;

@ObfuscatedName("am")
public class class33 extends class174 {

    @ObfuscatedName("am.m")
    public static class170 field855 = new class170(64);

    @ObfuscatedName("am.d")
    public int field854 = 0;

    @ObfuscatedName("am.k")
    public int field851;

    @ObfuscatedName("am.n")
    public int field852;

    @ObfuscatedName("am.s")
    public int field849;

    @ObfuscatedName("am.x")
    public int field848;

    @ObfuscatedName("t.y(Lel;I)V")
    public static void method149(class152 arg0) {
        Statics.field853 = arg0;
    }

    @ObfuscatedName("am.m(B)V")
    public void method689() {
        this.method692(this.field854);
    }

    @ObfuscatedName("am.d(Ldp;II)V")
    public void method690(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2534();
            if (var3 == 0) {
                return;
            }
            this.method704(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("am.k(Ldp;III)V")
    public void method704(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field854 = arg0.method2462();
        }
    }

    @ObfuscatedName("am.n(II)V")
    public void method692(int arg0) {
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
        this.field852 = (int) (var14 * 256.0D);
        this.field849 = (int) (var16 * 256.0D);
        if (this.field852 < 0) {
            this.field852 = 0;
        } else if (this.field852 > 255) {
            this.field852 = 255;
        }
        if (this.field849 < 0) {
            this.field849 = 0;
        } else if (this.field849 > 255) {
            this.field849 = 255;
        }
        if (var16 > 0.5D) {
            this.field848 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field848 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field848 < 1) {
            this.field848 = 1;
        }
        this.field851 = (int) ((double) this.field848 * var18);
    }
}

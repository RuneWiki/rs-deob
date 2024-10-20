package deob;

@ObfuscatedName("aj")
public class class39 extends class195 {

    @ObfuscatedName("aj.k")
    public static class184 field928 = new class184(64);

    @ObfuscatedName("aj.e")
    public int field936 = 0;

    @ObfuscatedName("aj.f")
    public int field930;

    @ObfuscatedName("aj.w")
    public int field932;

    @ObfuscatedName("aj.t")
    public int field931;

    @ObfuscatedName("aj.s")
    public int field933;

    @ObfuscatedName("h.p(Lff;I)V")
    public static void method130(class158 arg0) {
        Statics.field934 = arg0;
    }

    @ObfuscatedName("aj.k(B)V")
    public void method726() {
        this.method728(this.field936);
    }

    @ObfuscatedName("aj.e(Lde;II)V")
    public void method733(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2314();
            if (var3 == 0) {
                return;
            }
            this.method730(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aj.f(Lde;III)V")
    public void method730(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field936 = arg0.method2179();
        }
    }

    @ObfuscatedName("aj.w(IB)V")
    public void method728(int arg0) {
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
        this.field932 = (int) (var14 * 256.0D);
        this.field931 = (int) (var16 * 256.0D);
        if (this.field932 < 0) {
            this.field932 = 0;
        } else if (this.field932 > 255) {
            this.field932 = 255;
        }
        if (this.field931 < 0) {
            this.field931 = 0;
        } else if (this.field931 > 255) {
            this.field931 = 255;
        }
        if (var16 > 0.5D) {
            this.field933 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field933 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field933 < 1) {
            this.field933 = 1;
        }
        this.field930 = (int) ((double) this.field933 * var18);
    }
}

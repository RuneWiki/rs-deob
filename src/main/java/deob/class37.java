package deob;

@ObfuscatedName("ah")
public class class37 extends class174 {

    @ObfuscatedName("ah.t")
    public static class170 field938 = new class170(64);

    @ObfuscatedName("ah.n")
    public int field932 = 0;

    @ObfuscatedName("ah.e")
    public int field933 = -1;

    @ObfuscatedName("ah.l")
    public boolean field934 = true;

    @ObfuscatedName("ah.d")
    public int field935 = -1;

    @ObfuscatedName("ah.r")
    public int field942;

    @ObfuscatedName("ah.k")
    public int field930;

    @ObfuscatedName("ah.u")
    public int field936;

    @ObfuscatedName("ah.o")
    public int field939;

    @ObfuscatedName("ah.g")
    public int field940;

    @ObfuscatedName("ah.s")
    public int field941;

    @ObfuscatedName("ah.f(B)V")
    public void method779() {
        if (this.field935 != -1) {
            this.method782(this.field935);
            this.field939 = this.field942;
            this.field940 = this.field930;
            this.field941 = this.field936;
        }
        this.method782(this.field932);
    }

    @ObfuscatedName("ah.t(Ldq;IB)V")
    public void method780(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2458();
            if (var3 == 0) {
                return;
            }
            this.method792(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ah.n(Ldq;III)V")
    public void method792(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field932 = arg0.method2554();
        } else if (arg1 == 2) {
            this.field933 = arg0.method2458();
        } else if (arg1 == 5) {
            this.field934 = false;
        } else if (arg1 == 7) {
            this.field935 = arg0.method2554();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ah.e(II)V")
    public void method782(int arg0) {
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
        this.field942 = (int) (var18 * 256.0D);
        this.field930 = (int) (var14 * 256.0D);
        this.field936 = (int) (var16 * 256.0D);
        if (this.field930 < 0) {
            this.field930 = 0;
        } else if (this.field930 > 255) {
            this.field930 = 255;
        }
        if (this.field936 < 0) {
            this.field936 = 0;
        } else if (this.field936 > 255) {
            this.field936 = 255;
        }
    }
}

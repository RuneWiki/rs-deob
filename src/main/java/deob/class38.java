package deob;

@ObfuscatedName("ar")
public class class38 extends class174 {

    @ObfuscatedName("ar.k")
    public static class167 field928 = new class167(64);

    @ObfuscatedName("ar.y")
    public int field929 = 0;

    @ObfuscatedName("ar.g")
    public int field935 = -1;

    @ObfuscatedName("ar.r")
    public boolean field927 = true;

    @ObfuscatedName("ar.i")
    public int field932 = -1;

    @ObfuscatedName("ar.f")
    public int field933;

    @ObfuscatedName("ar.a")
    public int field934;

    @ObfuscatedName("ar.w")
    public int field936;

    @ObfuscatedName("ar.u")
    public int field931;

    @ObfuscatedName("ar.d")
    public int field937;

    @ObfuscatedName("ar.t")
    public int field938;

    @ObfuscatedName("g.m(Lek;I)V")
    public static void method34(class142 arg0) {
        Statics.field942 = arg0;
    }

    @ObfuscatedName("ar.k(I)V")
    public void method758() {
        if (this.field932 != -1) {
            this.method749(this.field932);
            this.field931 = this.field933;
            this.field937 = this.field934;
            this.field938 = this.field936;
        }
        this.method749(this.field929);
    }

    @ObfuscatedName("ar.y(Lcb;IB)V")
    public void method747(class104 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2190();
            if (var3 == 0) {
                return;
            }
            this.method750(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ar.g(Lcb;IIB)V")
    public void method750(class104 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field929 = arg0.method2134();
        } else if (arg1 == 2) {
            this.field935 = arg0.method2190();
        } else if (arg1 == 5) {
            this.field927 = false;
        } else if (arg1 == 7) {
            this.field932 = arg0.method2134();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ar.r(II)V")
    public void method749(int arg0) {
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
        this.field933 = (int) (var18 * 256.0D);
        this.field934 = (int) (var14 * 256.0D);
        this.field936 = (int) (var16 * 256.0D);
        if (this.field934 < 0) {
            this.field934 = 0;
        } else if (this.field934 > 255) {
            this.field934 = 255;
        }
        if (this.field936 < 0) {
            this.field936 = 0;
        } else if (this.field936 > 255) {
            this.field936 = 255;
        }
    }
}

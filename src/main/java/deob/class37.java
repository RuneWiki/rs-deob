package deob;

@ObfuscatedName("aq")
public class class37 extends class175 {

    @ObfuscatedName("aq.b")
    public static class171 field930 = new class171(64);

    @ObfuscatedName("aq.o")
    public int field931 = 0;

    @ObfuscatedName("aq.w")
    public int field932 = -1;

    @ObfuscatedName("aq.r")
    public boolean field936 = true;

    @ObfuscatedName("aq.k")
    public int field933 = -1;

    @ObfuscatedName("aq.z")
    public int field935;

    @ObfuscatedName("aq.g")
    public int field934;

    @ObfuscatedName("aq.n")
    public int field943;

    @ObfuscatedName("aq.j")
    public int field938;

    @ObfuscatedName("aq.c")
    public int field939;

    @ObfuscatedName("aq.m")
    public int field940;

    @ObfuscatedName("j.l(II)Laq;")
    public static class37 method116(int arg0) {
        class37 var1 = (class37) field930.method3255((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field929.method3029(4, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method790(new class127(var2), arg0);
        }
        var3.method789();
        field930.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.b(I)V")
    public void method789() {
        if (this.field933 != -1) {
            this.method792(this.field933);
            this.field938 = this.field935;
            this.field939 = this.field934;
            this.field940 = this.field943;
        }
        this.method792(this.field931);
    }

    @ObfuscatedName("aq.o(Ldm;II)V")
    public void method790(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2440();
            if (var3 == 0) {
                return;
            }
            this.method799(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aq.w(Ldm;III)V")
    public void method799(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field931 = arg0.method2441();
        } else if (arg1 == 2) {
            this.field932 = arg0.method2440();
        } else if (arg1 == 5) {
            this.field936 = false;
        } else if (arg1 == 7) {
            this.field933 = arg0.method2441();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("aq.r(II)V")
    public void method792(int arg0) {
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
        this.field935 = (int) (var18 * 256.0D);
        this.field934 = (int) (var14 * 256.0D);
        this.field943 = (int) (var16 * 256.0D);
        if (this.field934 < 0) {
            this.field934 = 0;
        } else if (this.field934 > 255) {
            this.field934 = 255;
        }
        if (this.field943 < 0) {
            this.field943 = 0;
        } else if (this.field943 > 255) {
            this.field943 = 255;
        }
    }
}

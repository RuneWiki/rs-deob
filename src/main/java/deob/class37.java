package deob;

@ObfuscatedName("at")
public class class37 extends class182 {

    @ObfuscatedName("at.v")
    public static class171 field884 = new class171(64);

    @ObfuscatedName("at.z")
    public int field892 = 0;

    @ObfuscatedName("at.h")
    public int field886;

    @ObfuscatedName("at.k")
    public int field887;

    @ObfuscatedName("at.l")
    public int field885;

    @ObfuscatedName("at.e")
    public int field890;

    @ObfuscatedName("at.g(I)V")
    public void method701() {
        this.method692(this.field892);
    }

    @ObfuscatedName("at.v(Ldm;II)V")
    public void method694(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2139();
            if (var3 == 0) {
                return;
            }
            this.method691(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("at.z(Ldm;III)V")
    public void method691(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field892 = arg0.method2230();
        }
    }

    @ObfuscatedName("at.h(IB)V")
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
        this.field887 = (int) (var14 * 256.0D);
        this.field885 = (int) (var16 * 256.0D);
        if (this.field887 < 0) {
            this.field887 = 0;
        } else if (this.field887 > 255) {
            this.field887 = 255;
        }
        if (this.field885 < 0) {
            this.field885 = 0;
        } else if (this.field885 > 255) {
            this.field885 = 255;
        }
        if (var16 > 0.5D) {
            this.field890 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field890 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field890 < 1) {
            this.field890 = 1;
        }
        this.field886 = (int) ((double) this.field890 * var18);
    }
}

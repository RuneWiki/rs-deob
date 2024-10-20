package deob;

@ObfuscatedName("aw")
public class class38 extends class185 {

    @ObfuscatedName("aw.v")
    public static class174 field904 = new class174(64);

    @ObfuscatedName("aw.m")
    public int field910 = 0;

    @ObfuscatedName("aw.e")
    public int field906;

    @ObfuscatedName("aw.h")
    public int field903;

    @ObfuscatedName("aw.p")
    public int field905;

    @ObfuscatedName("aw.j")
    public int field909;

    @ObfuscatedName("az.x(Ley;I)V")
    public static void method637(class149 arg0) {
        Statics.field907 = arg0;
    }

    @ObfuscatedName("aw.v(I)V")
    public void method716() {
        this.method721(this.field910);
    }

    @ObfuscatedName("aw.m(Ldm;IB)V")
    public void method717(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2299();
            if (var3 == 0) {
                return;
            }
            this.method718(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aw.e(Ldm;III)V")
    public void method718(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field910 = arg0.method2131();
        }
    }

    @ObfuscatedName("aw.h(II)V")
    public void method721(int arg0) {
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
        this.field903 = (int) (var14 * 256.0D);
        this.field905 = (int) (var16 * 256.0D);
        if (this.field903 < 0) {
            this.field903 = 0;
        } else if (this.field903 > 255) {
            this.field903 = 255;
        }
        if (this.field905 < 0) {
            this.field905 = 0;
        } else if (this.field905 > 255) {
            this.field905 = 255;
        }
        if (var16 > 0.5D) {
            this.field909 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field909 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field909 < 1) {
            this.field909 = 1;
        }
        this.field906 = (int) ((double) this.field909 * var18);
    }
}

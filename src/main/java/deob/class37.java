package deob;

@ObfuscatedName("af")
public class class37 extends class180 {

    @ObfuscatedName("af.u")
    public static class170 field871 = new class170(64);

    @ObfuscatedName("af.k")
    public int field872 = 0;

    @ObfuscatedName("af.v")
    public int field877;

    @ObfuscatedName("af.l")
    public int field874;

    @ObfuscatedName("af.g")
    public int field875;

    @ObfuscatedName("af.a")
    public int field873;

    @ObfuscatedName("u.y(Lev;B)V")
    public static void method9(class145 arg0) {
        Statics.field870 = arg0;
    }

    @ObfuscatedName("af.k(B)V")
    public void method664() {
        this.method667(this.field872);
    }

    @ObfuscatedName("af.v(Ldo;II)V")
    public void method665(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2109();
            if (var3 == 0) {
                return;
            }
            this.method669(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("af.l(Ldo;III)V")
    public void method669(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field872 = arg0.method2113();
        }
    }

    @ObfuscatedName("af.g(II)V")
    public void method667(int arg0) {
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
        this.field874 = (int) (var14 * 256.0D);
        this.field875 = (int) (var16 * 256.0D);
        if (this.field874 < 0) {
            this.field874 = 0;
        } else if (this.field874 > 255) {
            this.field874 = 255;
        }
        if (this.field875 < 0) {
            this.field875 = 0;
        } else if (this.field875 > 255) {
            this.field875 = 255;
        }
        if (var16 > 0.5D) {
            this.field873 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field873 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field873 < 1) {
            this.field873 = 1;
        }
        this.field877 = (int) ((double) this.field873 * var18);
    }

    @ObfuscatedName("b.a(S)V")
    public static void method449() {
        field871.method3141();
    }
}

package deob;

@ObfuscatedName("aj")
public class class33 extends class174 {

    @ObfuscatedName("aj.i")
    public static class170 field869 = new class170(64);

    @ObfuscatedName("aj.o")
    public int field865 = 0;

    @ObfuscatedName("aj.n")
    public int field867;

    @ObfuscatedName("aj.l")
    public int field868;

    @ObfuscatedName("aj.v")
    public int field875;

    @ObfuscatedName("aj.g")
    public int field870;

    @ObfuscatedName("k.p(Lep;I)V")
    public static void method223(class152 arg0) {
        Statics.field872 = arg0;
    }

    @ObfuscatedName("aj.i(B)V")
    public void method723() {
        this.method717(this.field865);
    }

    @ObfuscatedName("aj.o(Ldt;IB)V")
    public void method715(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2659();
            if (var3 == 0) {
                return;
            }
            this.method716(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("aj.n(Ldt;III)V")
    public void method716(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field865 = arg0.method2595();
        }
    }

    @ObfuscatedName("aj.l(II)V")
    public void method717(int arg0) {
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
        this.field868 = (int) (var14 * 256.0D);
        this.field875 = (int) (var16 * 256.0D);
        if (this.field868 < 0) {
            this.field868 = 0;
        } else if (this.field868 > 255) {
            this.field868 = 255;
        }
        if (this.field875 < 0) {
            this.field875 = 0;
        } else if (this.field875 > 255) {
            this.field875 = 255;
        }
        if (var16 > 0.5D) {
            this.field870 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field870 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field870 < 1) {
            this.field870 = 1;
        }
        this.field867 = (int) ((double) this.field870 * var18);
    }

    @ObfuscatedName("cw.v(B)V")
    public static void method1679() {
        field869.method3265();
    }
}

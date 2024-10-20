package deob;

@ObfuscatedName("ab")
public class class33 extends class174 {

    @ObfuscatedName("ab.p")
    public static class170 field844 = new class170(64);

    @ObfuscatedName("ab.k")
    public int field839 = 0;

    @ObfuscatedName("ab.a")
    public int field840;

    @ObfuscatedName("ab.q")
    public int field841;

    @ObfuscatedName("ab.j")
    public int field842;

    @ObfuscatedName("ab.v")
    public int field843;

    @ObfuscatedName("ez.x(Lej;I)V")
    public static void method2917(class152 arg0) {
        Statics.field838 = arg0;
    }

    @ObfuscatedName("ab.p(I)V")
    public void method669() {
        this.method657(this.field839);
    }

    @ObfuscatedName("ab.k(Ldg;IS)V")
    public void method654(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2484();
            if (var3 == 0) {
                return;
            }
            this.method656(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ab.a(Ldg;IIB)V")
    public void method656(class127 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field839 = arg0.method2403();
        }
    }

    @ObfuscatedName("ab.q(II)V")
    public void method657(int arg0) {
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
        this.field841 = (int) (var14 * 256.0D);
        this.field842 = (int) (var16 * 256.0D);
        if (this.field841 < 0) {
            this.field841 = 0;
        } else if (this.field841 > 255) {
            this.field841 = 255;
        }
        if (this.field842 < 0) {
            this.field842 = 0;
        } else if (this.field842 > 255) {
            this.field842 = 255;
        }
        if (var16 > 0.5D) {
            this.field843 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field843 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field843 < 1) {
            this.field843 = 1;
        }
        this.field840 = (int) ((double) this.field843 * var18);
    }

    @ObfuscatedName("o.j(B)V")
    public static void method196() {
        field844.method3198();
    }
}

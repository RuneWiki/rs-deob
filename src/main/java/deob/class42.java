package deob;

@ObfuscatedName("ax")
public class class42 extends class204 {

    @ObfuscatedName("ax.v")
    public static class193 field972 = new class193(64);

    @ObfuscatedName("ax.r")
    public int field973 = 0;

    @ObfuscatedName("ax.n")
    public int field974;

    @ObfuscatedName("ax.x")
    public int field971;

    @ObfuscatedName("ax.q")
    public int field976;

    @ObfuscatedName("ax.h")
    public int field977;

    @ObfuscatedName("et.i(Lfe;I)V")
    public static void method2939(class167 arg0) {
        Statics.field978 = arg0;
    }

    @ObfuscatedName("ax.v(I)V")
    public void method844() {
        this.method862(this.field973);
    }

    @ObfuscatedName("ax.r(Ldx;II)V")
    public void method847(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2380();
            if (var3 == 0) {
                return;
            }
            this.method843(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ax.n(Ldx;III)V")
    public void method843(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field973 = arg0.method2349();
        }
    }

    @ObfuscatedName("ax.x(IB)V")
    public void method862(int arg0) {
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
        this.field971 = (int) (var14 * 256.0D);
        this.field976 = (int) (var16 * 256.0D);
        if (this.field971 < 0) {
            this.field971 = 0;
        } else if (this.field971 > 255) {
            this.field971 = 255;
        }
        if (this.field976 < 0) {
            this.field976 = 0;
        } else if (this.field976 > 255) {
            this.field976 = 255;
        }
        if (var16 > 0.5D) {
            this.field977 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field977 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field977 < 1) {
            this.field977 = 1;
        }
        this.field974 = (int) ((double) this.field977 * var18);
    }

    @ObfuscatedName("ah.q(I)V")
    public static void method670() {
        field972.method3467();
    }
}

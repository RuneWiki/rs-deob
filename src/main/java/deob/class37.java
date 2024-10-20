package deob;

@ObfuscatedName("ap")
public class class37 extends class182 {

    @ObfuscatedName("ap.o")
    public static class171 field905 = new class171(64);

    @ObfuscatedName("ap.y")
    public int field903 = 0;

    @ObfuscatedName("ap.b")
    public int field900;

    @ObfuscatedName("ap.w")
    public int field901;

    @ObfuscatedName("ap.r")
    public int field902;

    @ObfuscatedName("ap.l")
    public int field899;

    @ObfuscatedName("t.e(Lez;I)V")
    public static void method503(class146 arg0) {
        Statics.field897 = arg0;
    }

    @ObfuscatedName("ap.o(I)V")
    public void method676() {
        this.method679(this.field903);
    }

    @ObfuscatedName("ap.y(Ldl;II)V")
    public void method677(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2123();
            if (var3 == 0) {
                return;
            }
            this.method682(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ap.b(Ldl;III)V")
    public void method682(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field903 = arg0.method2215();
        }
    }

    @ObfuscatedName("ap.w(IS)V")
    public void method679(int arg0) {
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
        this.field901 = (int) (var14 * 256.0D);
        this.field902 = (int) (var16 * 256.0D);
        if (this.field901 < 0) {
            this.field901 = 0;
        } else if (this.field901 > 255) {
            this.field901 = 255;
        }
        if (this.field902 < 0) {
            this.field902 = 0;
        } else if (this.field902 > 255) {
            this.field902 = 255;
        }
        if (var16 > 0.5D) {
            this.field899 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field899 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field899 < 1) {
            this.field899 = 1;
        }
        this.field900 = (int) ((double) this.field899 * var18);
    }
}

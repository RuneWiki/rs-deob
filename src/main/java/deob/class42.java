package deob;

@ObfuscatedName("as")
public class class42 extends class204 {

    @ObfuscatedName("as.d")
    public static class193 field973 = new class193(64);

    @ObfuscatedName("as.g")
    public int field970 = 0;

    @ObfuscatedName("as.w")
    public int field978;

    @ObfuscatedName("as.e")
    public int field972;

    @ObfuscatedName("as.c")
    public int field968;

    @ObfuscatedName("as.a")
    public int field974;

    @ObfuscatedName("ak.y(Lfu;B)V")
    public static void method737(class167 arg0) {
        Statics.field971 = arg0;
    }

    @ObfuscatedName("as.d(I)V")
    public void method812() {
        this.method826(this.field970);
    }

    @ObfuscatedName("as.g(Ldd;II)V")
    public void method813(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2326();
            if (var3 == 0) {
                return;
            }
            this.method814(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("as.w(Ldd;IIB)V")
    public void method814(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field970 = arg0.method2476();
        }
    }

    @ObfuscatedName("as.e(II)V")
    public void method826(int arg0) {
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
        this.field972 = (int) (var14 * 256.0D);
        this.field968 = (int) (var16 * 256.0D);
        if (this.field972 < 0) {
            this.field972 = 0;
        } else if (this.field972 > 255) {
            this.field972 = 255;
        }
        if (this.field968 < 0) {
            this.field968 = 0;
        } else if (this.field968 > 255) {
            this.field968 = 255;
        }
        if (var16 > 0.5D) {
            this.field974 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field974 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field974 < 1) {
            this.field974 = 1;
        }
        this.field978 = (int) ((double) this.field974 * var18);
    }

    @ObfuscatedName("d.c(I)V")
    public static void method7() {
        field973.method3428();
    }
}

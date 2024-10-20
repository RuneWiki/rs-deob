package deob;

@ObfuscatedName("ao")
public class class42 extends class204 {

    @ObfuscatedName("ao.f")
    public static class193 field970 = new class193(64);

    @ObfuscatedName("ao.i")
    public int field975 = 0;

    @ObfuscatedName("ao.d")
    public int field971;

    @ObfuscatedName("ao.o")
    public int field972;

    @ObfuscatedName("ao.c")
    public int field973;

    @ObfuscatedName("ao.p")
    public int field974;

    @ObfuscatedName("ao.v(I)V")
    public void method838() {
        this.method825(this.field975);
    }

    @ObfuscatedName("ao.f(Ldx;IB)V")
    public void method823(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2400();
            if (var3 == 0) {
                return;
            }
            this.method824(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ao.i(Ldx;IIB)V")
    public void method824(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field975 = arg0.method2353();
        }
    }

    @ObfuscatedName("ao.d(II)V")
    public void method825(int arg0) {
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
        this.field973 = (int) (var16 * 256.0D);
        if (this.field972 < 0) {
            this.field972 = 0;
        } else if (this.field972 > 255) {
            this.field972 = 255;
        }
        if (this.field973 < 0) {
            this.field973 = 0;
        } else if (this.field973 > 255) {
            this.field973 = 255;
        }
        if (var16 > 0.5D) {
            this.field974 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field974 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field974 < 1) {
            this.field974 = 1;
        }
        this.field971 = (int) ((double) this.field974 * var18);
    }
}

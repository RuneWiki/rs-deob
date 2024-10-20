package deob;

@ObfuscatedName("ag")
public class class42 extends class204 {

    @ObfuscatedName("ag.r")
    public static class193 field982 = new class193(64);

    @ObfuscatedName("ag.f")
    public int field977 = 0;

    @ObfuscatedName("ag.s")
    public int field975;

    @ObfuscatedName("ag.y")
    public int field979;

    @ObfuscatedName("ag.e")
    public int field980;

    @ObfuscatedName("ag.g")
    public int field978;

    @ObfuscatedName("ag.a(I)V")
    public void method825() {
        this.method828(this.field977);
    }

    @ObfuscatedName("ag.r(Lds;IB)V")
    public void method826(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2412();
            if (var3 == 0) {
                return;
            }
            this.method831(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ag.f(Lds;III)V")
    public void method831(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field977 = arg0.method2349();
        }
    }

    @ObfuscatedName("ag.s(II)V")
    public void method828(int arg0) {
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
        this.field979 = (int) (var14 * 256.0D);
        this.field980 = (int) (var16 * 256.0D);
        if (this.field979 < 0) {
            this.field979 = 0;
        } else if (this.field979 > 255) {
            this.field979 = 255;
        }
        if (this.field980 < 0) {
            this.field980 = 0;
        } else if (this.field980 > 255) {
            this.field980 = 255;
        }
        if (var16 > 0.5D) {
            this.field978 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field978 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field978 < 1) {
            this.field978 = 1;
        }
        this.field975 = (int) ((double) this.field978 * var18);
    }
}

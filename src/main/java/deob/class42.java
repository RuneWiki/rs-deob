package deob;

@ObfuscatedName("au")
public class class42 extends class205 {

    @ObfuscatedName("au.w")
    public static class194 field979 = new class194(64);

    @ObfuscatedName("au.d")
    public int field985 = 0;

    @ObfuscatedName("au.c")
    public int field982;

    @ObfuscatedName("au.y")
    public int field981;

    @ObfuscatedName("au.k")
    public int field984;

    @ObfuscatedName("au.r")
    public int field983;

    @ObfuscatedName("au.a(I)V")
    public void method914() {
        this.method919(this.field985);
    }

    @ObfuscatedName("au.w(Ldx;IB)V")
    public void method915(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2462();
            if (var3 == 0) {
                return;
            }
            this.method916(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("au.d(Ldx;III)V")
    public void method916(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field985 = arg0.method2466();
        }
    }

    @ObfuscatedName("au.c(IB)V")
    public void method919(int arg0) {
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
        this.field981 = (int) (var14 * 256.0D);
        this.field984 = (int) (var16 * 256.0D);
        if (this.field981 < 0) {
            this.field981 = 0;
        } else if (this.field981 > 255) {
            this.field981 = 255;
        }
        if (this.field984 < 0) {
            this.field984 = 0;
        } else if (this.field984 > 255) {
            this.field984 = 255;
        }
        if (var16 > 0.5D) {
            this.field983 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field983 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field983 < 1) {
            this.field983 = 1;
        }
        this.field982 = (int) ((double) this.field983 * var18);
    }
}

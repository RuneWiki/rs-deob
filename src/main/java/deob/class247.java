package deob;

@ObfuscatedName("iv")
public class class247 extends class195 {

    @ObfuscatedName("iv.k")
    public static class190 field3340 = new class190(64);

    @ObfuscatedName("iv.e")
    public int field3341 = 0;

    @ObfuscatedName("iv.p")
    public int field3339;

    @ObfuscatedName("iv.q")
    public int field3343;

    @ObfuscatedName("iv.s")
    public int field3344;

    @ObfuscatedName("iv.r")
    public int field3345;

    @ObfuscatedName("iv.k(I)V")
    public void method4086() {
        this.method4089(this.field3341);
    }

    @ObfuscatedName("iv.e(Lfg;II)V")
    public void method4097(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2955();
            if (var3 == 0) {
                return;
            }
            this.method4088(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iv.p(Lfg;III)V")
    public void method4088(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3341 = arg0.method3059();
        }
    }

    @ObfuscatedName("iv.q(IB)V")
    public void method4089(int arg0) {
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
        this.field3343 = (int) (var14 * 256.0D);
        this.field3344 = (int) (var16 * 256.0D);
        if (this.field3343 < 0) {
            this.field3343 = 0;
        } else if (this.field3343 > 255) {
            this.field3343 = 255;
        }
        if (this.field3344 < 0) {
            this.field3344 = 0;
        } else if (this.field3344 > 255) {
            this.field3344 = 255;
        }
        if (var16 > 0.5D) {
            this.field3345 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3345 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3345 < 1) {
            this.field3345 = 1;
        }
        this.field3339 = (int) ((double) this.field3345 * var18);
    }
}

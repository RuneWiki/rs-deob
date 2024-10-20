package deob;

@ObfuscatedName("az")
public class class37 extends class183 {

    @ObfuscatedName("az.s")
    public static class172 field881 = new class172(64);

    @ObfuscatedName("az.h")
    public int field882 = 0;

    @ObfuscatedName("az.m")
    public int field884;

    @ObfuscatedName("az.u")
    public int field885;

    @ObfuscatedName("az.j")
    public int field886;

    @ObfuscatedName("az.b")
    public int field887;

    @ObfuscatedName("az.g(I)V")
    public void method690() {
        this.method693(this.field882);
    }

    @ObfuscatedName("az.s(Ldi;II)V")
    public void method691(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2101();
            if (var3 == 0) {
                return;
            }
            this.method700(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.h(Ldi;III)V")
    public void method700(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field882 = arg0.method2105();
        }
    }

    @ObfuscatedName("az.m(II)V")
    public void method693(int arg0) {
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
        this.field885 = (int) (var14 * 256.0D);
        this.field886 = (int) (var16 * 256.0D);
        if (this.field885 < 0) {
            this.field885 = 0;
        } else if (this.field885 > 255) {
            this.field885 = 255;
        }
        if (this.field886 < 0) {
            this.field886 = 0;
        } else if (this.field886 > 255) {
            this.field886 = 255;
        }
        if (var16 > 0.5D) {
            this.field887 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field887 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field887 < 1) {
            this.field887 = 1;
        }
        this.field884 = (int) ((double) this.field887 * var18);
    }

    @ObfuscatedName("r.u(I)V")
    public static void method167() {
        field881.method3127();
    }
}

package deob;

@ObfuscatedName("az")
public class class38 extends class187 {

    @ObfuscatedName("az.t")
    public static class176 field897 = new class176(64);

    @ObfuscatedName("az.f")
    public int field892 = 0;

    @ObfuscatedName("az.j")
    public int field891;

    @ObfuscatedName("az.l")
    public int field894;

    @ObfuscatedName("az.g")
    public int field900;

    @ObfuscatedName("az.k")
    public int field896;

    @ObfuscatedName("f.v(Lem;I)V")
    public static void method20(class151 arg0) {
        Statics.field901 = arg0;
    }

    @ObfuscatedName("az.t(I)V")
    public void method691() {
        this.method694(this.field892);
    }

    @ObfuscatedName("az.f(Ldp;II)V")
    public void method692(class110 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2257();
            if (var3 == 0) {
                return;
            }
            this.method697(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.j(Ldp;III)V")
    public void method697(class110 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field892 = arg0.method2267();
        }
    }

    @ObfuscatedName("az.l(II)V")
    public void method694(int arg0) {
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
        this.field894 = (int) (var14 * 256.0D);
        this.field900 = (int) (var16 * 256.0D);
        if (this.field894 < 0) {
            this.field894 = 0;
        } else if (this.field894 > 255) {
            this.field894 = 255;
        }
        if (this.field900 < 0) {
            this.field900 = 0;
        } else if (this.field900 > 255) {
            this.field900 = 255;
        }
        if (var16 > 0.5D) {
            this.field896 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field896 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field896 < 1) {
            this.field896 = 1;
        }
        this.field891 = (int) ((double) this.field896 * var18);
    }

    @ObfuscatedName("by.g(I)V")
    public static void method1605() {
        field897.method3229();
    }
}

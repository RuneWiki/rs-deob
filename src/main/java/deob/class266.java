package deob;

@ObfuscatedName("jo")
public class class266 extends class214 {

    @ObfuscatedName("jo.s")
    public static class208 field3370 = new class208(64);

    @ObfuscatedName("jo.g")
    public int field3367 = 0;

    @ObfuscatedName("jo.x")
    public int field3368;

    @ObfuscatedName("jo.h")
    public int field3369;

    @ObfuscatedName("jo.f")
    public int field3371;

    @ObfuscatedName("jo.p")
    public int field3365;

    @ObfuscatedName("bu.a(Liz;B)V")
    public static void method1618(class255 arg0) {
        Statics.field3366 = arg0;
    }

    @ObfuscatedName("jo.s(I)V")
    public void method4659() {
        this.method4671(this.field3367);
    }

    @ObfuscatedName("jo.g(Lgx;II)V")
    public void method4669(class190 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3443();
            if (var3 == 0) {
                return;
            }
            this.method4660(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jo.x(Lgx;III)V")
    public void method4660(class190 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3367 = arg0.method3459();
        }
    }

    @ObfuscatedName("jo.h(II)V")
    public void method4671(int arg0) {
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
        this.field3369 = (int) (var14 * 256.0D);
        this.field3371 = (int) (var16 * 256.0D);
        if (this.field3369 < 0) {
            this.field3369 = 0;
        } else if (this.field3369 > 255) {
            this.field3369 = 255;
        }
        if (this.field3371 < 0) {
            this.field3371 = 0;
        } else if (this.field3371 > 255) {
            this.field3371 = 255;
        }
        if (var16 > 0.5D) {
            this.field3365 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3365 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3365 < 1) {
            this.field3365 = 1;
        }
        this.field3368 = (int) ((double) this.field3365 * var18);
    }
}

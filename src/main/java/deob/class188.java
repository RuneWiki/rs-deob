package deob;

@ObfuscatedName("gc")
public class class188 extends class425 {

    @ObfuscatedName("gc.f")
    public static class266 field2027 = new class266(64);

    @ObfuscatedName("gc.c")
    public int field2026 = 0;

    @ObfuscatedName("gc.x")
    public int field2024;

    @ObfuscatedName("gc.h")
    public int field2028;

    @ObfuscatedName("gc.j")
    public int field2029;

    @ObfuscatedName("gc.y")
    public int field2030;

    @ObfuscatedName("jj.a(Llg;I)V")
    public static void method4853(class330 arg0) {
        Statics.field2025 = arg0;
    }

    @ObfuscatedName("gc.f(I)V")
    public void method3292() {
        this.method3310(this.field2026);
    }

    @ObfuscatedName("gc.c(Lqr;II)V")
    public void method3293(class464 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7735();
            if (var3 == 0) {
                return;
            }
            this.method3294(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gc.x(Lqr;III)V")
    public void method3294(class464 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2026 = arg0.method7906();
        }
    }

    @ObfuscatedName("gc.h(IB)V")
    public void method3310(int arg0) {
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
        this.field2028 = (int) (var14 * 256.0D);
        this.field2029 = (int) (var16 * 256.0D);
        if (this.field2028 < 0) {
            this.field2028 = 0;
        } else if (this.field2028 > 255) {
            this.field2028 = 255;
        }
        if (this.field2029 < 0) {
            this.field2029 = 0;
        } else if (this.field2029 > 255) {
            this.field2029 = 255;
        }
        if (var16 > 0.5D) {
            this.field2030 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2030 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2030 < 1) {
            this.field2030 = 1;
        }
        this.field2024 = (int) ((double) this.field2030 * var18);
    }

    @ObfuscatedName("ez.j(B)V")
    public static void method2939() {
        field2027.method4837();
    }
}

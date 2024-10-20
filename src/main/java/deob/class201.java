package deob;

@ObfuscatedName("gx")
public class class201 extends class130 {

    @ObfuscatedName("gx.e")
    public static class125 field3053 = new class125(64);

    @ObfuscatedName("gx.c")
    public int field3057 = 0;

    @ObfuscatedName("gx.l")
    public int field3050 = -1;

    @ObfuscatedName("gx.y")
    public boolean field3051 = true;

    @ObfuscatedName("gx.j")
    public int field3052 = -1;

    @ObfuscatedName("gx.g")
    public int field3049;

    @ObfuscatedName("gx.s")
    public int field3047;

    @ObfuscatedName("gx.r")
    public int field3055;

    @ObfuscatedName("gx.t")
    public int field3054;

    @ObfuscatedName("gx.k")
    public int field3048;

    @ObfuscatedName("gx.f")
    public int field3058;

    @ObfuscatedName("cb.b(Lgv;I)V")
    public static void method1645(class183 arg0) {
        Statics.field3056 = arg0;
    }

    @ObfuscatedName("gx.e(I)V")
    public void method3565() {
        if (this.field3052 != -1) {
            this.method3573(this.field3052);
            this.field3054 = this.field3049;
            this.field3048 = this.field3047;
            this.field3058 = this.field3055;
        }
        this.method3573(this.field3057);
    }

    @ObfuscatedName("gx.c(Lec;II)V")
    public void method3560(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2669();
            if (var3 == 0) {
                return;
            }
            this.method3561(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gx.l(Lec;IIB)V")
    public void method3561(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3057 = arg0.method2689();
        } else if (arg1 == 2) {
            this.field3050 = arg0.method2669();
        } else if (arg1 == 5) {
            this.field3051 = false;
        } else if (arg1 == 7) {
            this.field3052 = arg0.method2689();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gx.y(II)V")
    public void method3573(int arg0) {
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
        this.field3049 = (int) (var18 * 256.0D);
        this.field3047 = (int) (var14 * 256.0D);
        this.field3055 = (int) (var16 * 256.0D);
        if (this.field3047 < 0) {
            this.field3047 = 0;
        } else if (this.field3047 > 255) {
            this.field3047 = 255;
        }
        if (this.field3055 < 0) {
            this.field3055 = 0;
        } else if (this.field3055 > 255) {
            this.field3055 = 255;
        }
    }

    @ObfuscatedName("ea.j(I)V")
    public static void method2607() {
        field3053.method2249();
    }
}

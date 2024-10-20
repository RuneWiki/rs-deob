package deob;

@ObfuscatedName("gu")
public class class192 extends class130 {

    @ObfuscatedName("gu.l")
    public static class125 field2813 = new class125(64);

    @ObfuscatedName("gu.i")
    public int field2817 = 0;

    @ObfuscatedName("gu.t")
    public int field2814;

    @ObfuscatedName("gu.k")
    public int field2815;

    @ObfuscatedName("gu.h")
    public int field2811;

    @ObfuscatedName("gu.n")
    public int field2812;

    @ObfuscatedName("go.b(Lgj;B)V")
    public static void method3296(class183 arg0) {
        Statics.field2816 = arg0;
    }

    @ObfuscatedName("q.l(II)Lgu;")
    public static class192 method210(int arg0) {
        class192 var1 = (class192) field2813.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2816.method3226(1, arg0);
        class192 var3 = new class192();
        if (var2 != null) {
            var3.method3354(new class154(var2), arg0);
        }
        var3.method3346();
        field2813.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.i(I)V")
    public void method3346() {
        this.method3360(this.field2817);
    }

    @ObfuscatedName("gu.t(Leg;II)V")
    public void method3354(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2678();
            if (var3 == 0) {
                return;
            }
            this.method3345(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gu.k(Leg;III)V")
    public void method3345(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2817 = arg0.method2682();
        }
    }

    @ObfuscatedName("gu.x(II)V")
    public void method3360(int arg0) {
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
        this.field2815 = (int) (var14 * 256.0D);
        this.field2811 = (int) (var16 * 256.0D);
        if (this.field2815 < 0) {
            this.field2815 = 0;
        } else if (this.field2815 > 255) {
            this.field2815 = 255;
        }
        if (this.field2811 < 0) {
            this.field2811 = 0;
        } else if (this.field2811 > 255) {
            this.field2811 = 255;
        }
        if (var16 > 0.5D) {
            this.field2812 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2812 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2812 < 1) {
            this.field2812 = 1;
        }
        this.field2814 = (int) ((double) this.field2812 * var18);
    }

    @ObfuscatedName("am.z(I)V")
    public static void method770() {
        field2813.method2257();
    }
}

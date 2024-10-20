package deob;

@ObfuscatedName("gw")
public class class192 extends class130 {

    @ObfuscatedName("gw.i")
    public static class125 field2822 = new class125(64);

    @ObfuscatedName("gw.u")
    public int field2825 = 0;

    @ObfuscatedName("gw.h")
    public int field2824;

    @ObfuscatedName("gw.r")
    public int field2821;

    @ObfuscatedName("gw.o")
    public int field2826;

    @ObfuscatedName("gw.l")
    public int field2827;

    @ObfuscatedName("cb.f(Lgb;I)V")
    public static void method1852(class183 arg0) {
        Statics.field2823 = arg0;
    }

    @ObfuscatedName("fd.i(II)Lgw;")
    public static class192 method2922(int arg0) {
        class192 var1 = (class192) field2822.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2823.method3163(1, arg0);
        class192 var3 = new class192();
        if (var2 != null) {
            var3.method3320(new class154(var2), arg0);
        }
        var3.method3308();
        field2822.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gw.u(I)V")
    public void method3308() {
        this.method3310(this.field2825);
    }

    @ObfuscatedName("gw.r(Leo;II)V")
    public void method3320(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2666();
            if (var3 == 0) {
                return;
            }
            this.method3314(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gw.o(Leo;III)V")
    public void method3314(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2825 = arg0.method2670();
        }
    }

    @ObfuscatedName("gw.l(II)V")
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
        this.field2821 = (int) (var14 * 256.0D);
        this.field2826 = (int) (var16 * 256.0D);
        if (this.field2821 < 0) {
            this.field2821 = 0;
        } else if (this.field2821 > 255) {
            this.field2821 = 255;
        }
        if (this.field2826 < 0) {
            this.field2826 = 0;
        } else if (this.field2826 > 255) {
            this.field2826 = 255;
        }
        if (var16 > 0.5D) {
            this.field2827 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2827 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2827 < 1) {
            this.field2827 = 1;
        }
        this.field2824 = (int) ((double) this.field2827 * var18);
    }
}

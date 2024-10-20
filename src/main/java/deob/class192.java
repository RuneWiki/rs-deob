package deob;

@ObfuscatedName("go")
public class class192 extends class130 {

    @ObfuscatedName("go.j")
    public static class125 field2803 = new class125(64);

    @ObfuscatedName("go.c")
    public int field2804 = 0;

    @ObfuscatedName("go.d")
    public int field2811;

    @ObfuscatedName("go.w")
    public int field2806;

    @ObfuscatedName("go.h")
    public int field2805;

    @ObfuscatedName("go.u")
    public int field2808;

    @ObfuscatedName("p.x(II)Lgo;")
    public static class192 method240(int arg0) {
        class192 var1 = (class192) field2803.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2807.method3121(1, arg0);
        class192 var3 = new class192();
        if (var2 != null) {
            var3.method3274(new class154(var2), arg0);
        }
        var3.method3273();
        field2803.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("go.j(I)V")
    public void method3273() {
        this.method3278(this.field2804);
    }

    @ObfuscatedName("go.c(Lek;II)V")
    public void method3274(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2701();
            if (var3 == 0) {
                return;
            }
            this.method3275(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("go.d(Lek;IIB)V")
    public void method3275(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2804 = arg0.method2643();
        }
    }

    @ObfuscatedName("go.w(II)V")
    public void method3278(int arg0) {
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
        this.field2806 = (int) (var14 * 256.0D);
        this.field2805 = (int) (var16 * 256.0D);
        if (this.field2806 < 0) {
            this.field2806 = 0;
        } else if (this.field2806 > 255) {
            this.field2806 = 255;
        }
        if (this.field2805 < 0) {
            this.field2805 = 0;
        } else if (this.field2805 > 255) {
            this.field2805 = 255;
        }
        if (var16 > 0.5D) {
            this.field2808 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2808 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2808 < 1) {
            this.field2808 = 1;
        }
        this.field2811 = (int) ((double) this.field2808 * var18);
    }
}

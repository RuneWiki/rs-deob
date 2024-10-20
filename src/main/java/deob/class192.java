package deob;

@ObfuscatedName("go")
public class class192 extends class130 {

    @ObfuscatedName("go.e")
    public static class125 field2810 = new class125(64);

    @ObfuscatedName("go.f")
    public int field2811 = 0;

    @ObfuscatedName("go.k")
    public int field2812;

    @ObfuscatedName("go.g")
    public int field2813;

    @ObfuscatedName("go.n")
    public int field2816;

    @ObfuscatedName("go.a")
    public int field2809;

    @ObfuscatedName("gs.i(II)Lgo;")
    public static class192 method3110(int arg0) {
        class192 var1 = (class192) field2810.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2814.method3014(1, arg0);
        class192 var3 = new class192();
        if (var2 != null) {
            var3.method3223(new class154(var2), arg0);
        }
        var3.method3228();
        field2810.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("go.e(I)V")
    public void method3228() {
        this.method3217(this.field2811);
    }

    @ObfuscatedName("go.f(Let;II)V")
    public void method3223(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2573();
            if (var3 == 0) {
                return;
            }
            this.method3216(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("go.k(Let;III)V")
    public void method3216(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2811 = arg0.method2706();
        }
    }

    @ObfuscatedName("go.a(IB)V")
    public void method3217(int arg0) {
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
        this.field2813 = (int) (var14 * 256.0D);
        this.field2816 = (int) (var16 * 256.0D);
        if (this.field2813 < 0) {
            this.field2813 = 0;
        } else if (this.field2813 > 255) {
            this.field2813 = 255;
        }
        if (this.field2816 < 0) {
            this.field2816 = 0;
        } else if (this.field2816 > 255) {
            this.field2816 = 255;
        }
        if (var16 > 0.5D) {
            this.field2809 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2809 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2809 < 1) {
            this.field2809 = 1;
        }
        this.field2812 = (int) ((double) this.field2809 * var18);
    }
}

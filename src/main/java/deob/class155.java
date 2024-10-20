package deob;

@ObfuscatedName("ez")
public class class155 extends class143 {

    @ObfuscatedName("ez.r")
    public static class101 field2350 = new class101(64);

    @ObfuscatedName("ez.d")
    public int field2352 = 0;

    @ObfuscatedName("ez.k")
    public int field2353;

    @ObfuscatedName("ez.u")
    public int field2354;

    @ObfuscatedName("ez.v")
    public int field2355;

    @ObfuscatedName("ez.f")
    public int field2356;

    @ObfuscatedName("ac.k(II)Lez;")
    public static class155 method481(int arg0) {
        class155 var1 = (class155) field2350.method1236((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2351.method1024(1, arg0);
        class155 var3 = new class155();
        if (var2 != null) {
            var3.method2403(new class136(var2), arg0);
        }
        var3.method2410();
        field2350.method1238(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ez.u(B)V")
    public void method2410() {
        this.method2408(this.field2352);
    }

    @ObfuscatedName("ez.v(Let;II)V")
    public void method2403(class136 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1602();
            if (var3 == 0) {
                return;
            }
            this.method2402(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ez.f(Let;III)V")
    public void method2402(class136 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2352 = arg0.method1606();
        }
    }

    @ObfuscatedName("ez.s(IB)V")
    public void method2408(int arg0) {
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
        this.field2354 = (int) (var14 * 256.0D);
        this.field2355 = (int) (var16 * 256.0D);
        if (this.field2354 < 0) {
            this.field2354 = 0;
        } else if (this.field2354 > 255) {
            this.field2354 = 255;
        }
        if (this.field2355 < 0) {
            this.field2355 = 0;
        } else if (this.field2355 > 255) {
            this.field2355 = 255;
        }
        if (var16 > 0.5D) {
            this.field2356 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2356 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2356 < 1) {
            this.field2356 = 1;
        }
        this.field2353 = (int) ((double) this.field2356 * var18);
    }
}

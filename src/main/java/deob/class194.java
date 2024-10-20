package deob;

@ObfuscatedName("gc")
public class class194 extends class435 {

    @ObfuscatedName("gc.w")
    public static class273 field2100 = new class273(64);

    @ObfuscatedName("gc.v")
    public int field2102 = 0;

    @ObfuscatedName("gc.s")
    public int field2103;

    @ObfuscatedName("gc.z")
    public int field2106;

    @ObfuscatedName("gc.j")
    public int field2105;

    @ObfuscatedName("gc.i")
    public int field2101;

    @ObfuscatedName("of.f(IB)Lgc;")
    public static class194 method7212(int arg0) {
        class194 var1 = (class194) field2100.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2104.method5990(1, arg0);
        class194 var3 = new class194();
        if (var2 != null) {
            var3.method3498(new class474(var2), arg0);
        }
        var3.method3488();
        field2100.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gc.w(I)V")
    public void method3488() {
        this.method3491(this.field2102);
    }

    @ObfuscatedName("gc.v(Lrd;IS)V")
    public void method3498(class474 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method7964();
            if (var3 == 0) {
                return;
            }
            this.method3490(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gc.s(Lrd;III)V")
    public void method3490(class474 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2102 = arg0.method8132();
        }
    }

    @ObfuscatedName("gc.z(II)V")
    public void method3491(int arg0) {
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
        this.field2106 = (int) (var14 * 256.0D);
        this.field2105 = (int) (var16 * 256.0D);
        if (this.field2106 < 0) {
            this.field2106 = 0;
        } else if (this.field2106 > 255) {
            this.field2106 = 255;
        }
        if (this.field2105 < 0) {
            this.field2105 = 0;
        } else if (this.field2105 > 255) {
            this.field2105 = 255;
        }
        if (var16 > 0.5D) {
            this.field2101 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2101 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2101 < 1) {
            this.field2101 = 1;
        }
        this.field2103 = (int) ((double) this.field2101 * var18);
    }
}

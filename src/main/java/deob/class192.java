package deob;

@ObfuscatedName("gq")
public class class192 extends class130 {

    @ObfuscatedName("gq.g")
    public static class125 field2807 = new class125(64);

    @ObfuscatedName("gq.x")
    public int field2808 = 0;

    @ObfuscatedName("gq.q")
    public int field2809;

    @ObfuscatedName("gq.d")
    public int field2810;

    @ObfuscatedName("gq.k")
    public int field2806;

    @ObfuscatedName("gq.j")
    public int field2813;

    @ObfuscatedName("du.p(Lgp;B)V")
    public static void method2069(class183 arg0) {
        Statics.field2812 = arg0;
    }

    @ObfuscatedName("ct.g(IB)Lgq;")
    public static class192 method1823(int arg0) {
        class192 var1 = (class192) field2807.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2812.method3044(1, arg0);
        class192 var3 = new class192();
        if (var2 != null) {
            var3.method3229(new class154(var2), arg0);
        }
        var3.method3230();
        field2807.method2174(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gq.x(B)V")
    public void method3230() {
        this.method3220(this.field2808);
    }

    @ObfuscatedName("gq.q(Lev;IB)V")
    public void method3229(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2593();
            if (var3 == 0) {
                return;
            }
            this.method3219(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gq.d(Lev;III)V")
    public void method3219(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2808 = arg0.method2748();
        }
    }

    @ObfuscatedName("gq.k(II)V")
    public void method3220(int arg0) {
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
        this.field2810 = (int) (var14 * 256.0D);
        this.field2806 = (int) (var16 * 256.0D);
        if (this.field2810 < 0) {
            this.field2810 = 0;
        } else if (this.field2810 > 255) {
            this.field2810 = 255;
        }
        if (this.field2806 < 0) {
            this.field2806 = 0;
        } else if (this.field2806 > 255) {
            this.field2806 = 255;
        }
        if (var16 > 0.5D) {
            this.field2813 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field2813 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field2813 < 1) {
            this.field2813 = 1;
        }
        this.field2809 = (int) ((double) this.field2813 * var18);
    }

    @ObfuscatedName("dz.j(I)V")
    public static void method2024() {
        field2807.method2170();
    }
}

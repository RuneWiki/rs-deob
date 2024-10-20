package deob;

@ObfuscatedName("az")
public class class44 extends class208 {

    @ObfuscatedName("az.z")
    public static class197 field965 = new class197(64);

    @ObfuscatedName("az.t")
    public int field960 = 0;

    @ObfuscatedName("az.y")
    public int field961;

    @ObfuscatedName("az.p")
    public int field962;

    @ObfuscatedName("az.g")
    public int field964;

    @ObfuscatedName("az.m")
    public int field959;

    @ObfuscatedName("a.s(Lfu;I)V")
    public static void method181(class171 arg0) {
        Statics.field2249 = arg0;
    }

    @ObfuscatedName("bq.z(II)Laz;")
    public static class44 method1540(int arg0) {
        class44 var1 = (class44) field965.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2249.method3091(1, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method845(new class123(var2), arg0);
        }
        var3.method842();
        field965.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.t(I)V")
    public void method842() {
        this.method860(this.field960);
    }

    @ObfuscatedName("az.y(Ldy;II)V")
    public void method845(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2363();
            if (var3 == 0) {
                return;
            }
            this.method843(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("az.p(Ldy;III)V")
    public void method843(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field960 = arg0.method2367();
        }
    }

    @ObfuscatedName("az.g(II)V")
    public void method860(int arg0) {
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
        this.field962 = (int) (var14 * 256.0D);
        this.field964 = (int) (var16 * 256.0D);
        if (this.field962 < 0) {
            this.field962 = 0;
        } else if (this.field962 > 255) {
            this.field962 = 255;
        }
        if (this.field964 < 0) {
            this.field964 = 0;
        } else if (this.field964 > 255) {
            this.field964 = 255;
        }
        if (var16 > 0.5D) {
            this.field959 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field959 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field959 < 1) {
            this.field959 = 1;
        }
        this.field961 = (int) ((double) this.field959 * var18);
    }
}

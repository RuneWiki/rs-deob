package deob;

@ObfuscatedName("ah")
public class class38 extends class185 {

    @ObfuscatedName("ah.j")
    public static class174 field896 = new class174(64);

    @ObfuscatedName("ah.y")
    public int field892 = 0;

    @ObfuscatedName("ah.r")
    public int field898;

    @ObfuscatedName("ah.f")
    public int field894;

    @ObfuscatedName("ah.l")
    public int field895;

    @ObfuscatedName("ah.b")
    public int field890;

    @ObfuscatedName("aj.c(IS)Lah;")
    public static class38 method775(int arg0) {
        class38 var1 = (class38) field896.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field891.method2746(1, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method677(new class108(var2), arg0);
        }
        var3.method683();
        field896.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.j(I)V")
    public void method683() {
        this.method678(this.field892);
    }

    @ObfuscatedName("ah.y(Ldx;IB)V")
    public void method677(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2134();
            if (var3 == 0) {
                return;
            }
            this.method680(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ah.r(Ldx;III)V")
    public void method680(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field892 = arg0.method2138();
        }
    }

    @ObfuscatedName("ah.f(IB)V")
    public void method678(int arg0) {
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
        this.field894 = (int) (var14 * 256.0D);
        this.field895 = (int) (var16 * 256.0D);
        if (this.field894 < 0) {
            this.field894 = 0;
        } else if (this.field894 > 255) {
            this.field894 = 255;
        }
        if (this.field895 < 0) {
            this.field895 = 0;
        } else if (this.field895 > 255) {
            this.field895 = 255;
        }
        if (var16 > 0.5D) {
            this.field890 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field890 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field890 < 1) {
            this.field890 = 1;
        }
        this.field898 = (int) ((double) this.field890 * var18);
    }

    @ObfuscatedName("dp.l(I)V")
    public static void method2445() {
        field896.method3168();
    }
}

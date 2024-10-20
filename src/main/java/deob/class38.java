package deob;

@ObfuscatedName("ag")
public class class38 extends class185 {

    @ObfuscatedName("ag.v")
    public static class174 field895 = new class174(64);

    @ObfuscatedName("ag.k")
    public int field897 = 0;

    @ObfuscatedName("ag.g")
    public int field898;

    @ObfuscatedName("ag.q")
    public int field899;

    @ObfuscatedName("ag.l")
    public int field900;

    @ObfuscatedName("ag.a")
    public int field901;

    @ObfuscatedName("cx.e(Lep;I)V")
    public static void method2036(class149 arg0) {
        Statics.field905 = arg0;
    }

    @ObfuscatedName("ay.v(II)Lag;")
    public static class38 method803(int arg0) {
        class38 var1 = (class38) field895.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field905.method2721(1, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method678(new class108(var2), arg0);
        }
        var3.method675();
        field895.method3156(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.k(I)V")
    public void method675() {
        this.method677(this.field897);
    }

    @ObfuscatedName("ag.g(Ldd;II)V")
    public void method678(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2122();
            if (var3 == 0) {
                return;
            }
            this.method691(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ag.q(Ldd;III)V")
    public void method691(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field897 = arg0.method2126();
        }
    }

    @ObfuscatedName("ag.l(II)V")
    public void method677(int arg0) {
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
        this.field899 = (int) (var14 * 256.0D);
        this.field900 = (int) (var16 * 256.0D);
        if (this.field899 < 0) {
            this.field899 = 0;
        } else if (this.field899 > 255) {
            this.field899 = 255;
        }
        if (this.field900 < 0) {
            this.field900 = 0;
        } else if (this.field900 > 255) {
            this.field900 = 255;
        }
        if (var16 > 0.5D) {
            this.field901 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field901 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field901 < 1) {
            this.field901 = 1;
        }
        this.field898 = (int) ((double) this.field901 * var18);
    }

    @ObfuscatedName("cw.a(S)V")
    public static void method1777() {
        field895.method3157();
    }
}

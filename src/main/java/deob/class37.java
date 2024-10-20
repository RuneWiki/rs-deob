package deob;

@ObfuscatedName("ax")
public class class37 extends class182 {

    @ObfuscatedName("ax.r")
    public static class171 field891 = new class171(64);

    @ObfuscatedName("ax.y")
    public int field892 = 0;

    @ObfuscatedName("ax.w")
    public int field894;

    @ObfuscatedName("ax.m")
    public int field898;

    @ObfuscatedName("ax.j")
    public int field893;

    @ObfuscatedName("ax.g")
    public int field897;

    @ObfuscatedName("an.k(II)Lax;")
    public static class37 method584(int arg0) {
        class37 var1 = (class37) field891.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field895.method2749(1, arg0);
        class37 var3 = new class37();
        if (var2 != null) {
            var3.method680(new class107(var2), arg0);
        }
        var3.method674();
        field891.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.r(I)V")
    public void method674() {
        this.method677(this.field892);
    }

    @ObfuscatedName("ax.y(Lde;II)V")
    public void method680(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2111();
            if (var3 == 0) {
                return;
            }
            this.method673(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ax.w(Lde;III)V")
    public void method673(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field892 = arg0.method2262();
        }
    }

    @ObfuscatedName("ax.m(II)V")
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
        this.field898 = (int) (var14 * 256.0D);
        this.field893 = (int) (var16 * 256.0D);
        if (this.field898 < 0) {
            this.field898 = 0;
        } else if (this.field898 > 255) {
            this.field898 = 255;
        }
        if (this.field893 < 0) {
            this.field893 = 0;
        } else if (this.field893 > 255) {
            this.field893 = 255;
        }
        if (var16 > 0.5D) {
            this.field897 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field897 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field897 < 1) {
            this.field897 = 1;
        }
        this.field894 = (int) ((double) this.field897 * var18);
    }

    @ObfuscatedName("z.j(B)V")
    public static void method515() {
        field891.method3138();
    }
}

package deob;

@ObfuscatedName("au")
public class class42 extends class205 {

    @ObfuscatedName("au.x")
    public static class194 field982 = new class194(64);

    @ObfuscatedName("au.t")
    public int field989 = 0;

    @ObfuscatedName("au.p")
    public int field984;

    @ObfuscatedName("au.e")
    public int field985;

    @ObfuscatedName("au.y")
    public int field986;

    @ObfuscatedName("au.m")
    public int field987;

    @ObfuscatedName("client.w(Lfx;B)V")
    public static void method354(class168 arg0) {
        Statics.field983 = arg0;
    }

    @ObfuscatedName("aj.x(II)Lau;")
    public static class42 method750(int arg0) {
        class42 var1 = (class42) field982.method3520((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field983.method3127(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method858(new class120(var2), arg0);
        }
        var3.method856();
        field982.method3522(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.t(I)V")
    public void method856() {
        this.method873(this.field989);
    }

    @ObfuscatedName("au.p(Lde;II)V")
    public void method858(class120 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2363();
            if (var3 == 0) {
                return;
            }
            this.method859(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("au.e(Lde;IIB)V")
    public void method859(class120 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field989 = arg0.method2367();
        }
    }

    @ObfuscatedName("au.y(II)V")
    public void method873(int arg0) {
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
        this.field985 = (int) (var14 * 256.0D);
        this.field986 = (int) (var16 * 256.0D);
        if (this.field985 < 0) {
            this.field985 = 0;
        } else if (this.field985 > 255) {
            this.field985 = 255;
        }
        if (this.field986 < 0) {
            this.field986 = 0;
        } else if (this.field986 > 255) {
            this.field986 = 255;
        }
        if (var16 > 0.5D) {
            this.field987 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field987 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field987 < 1) {
            this.field987 = 1;
        }
        this.field984 = (int) ((double) this.field987 * var18);
    }

    @ObfuscatedName("bq.m(B)V")
    public static void method1501() {
        field982.method3525();
    }
}

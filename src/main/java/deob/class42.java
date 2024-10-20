package deob;

@ObfuscatedName("ao")
public class class42 extends class204 {

    @ObfuscatedName("ao.b")
    public static class193 field979 = new class193(64);

    @ObfuscatedName("ao.w")
    public int field980 = 0;

    @ObfuscatedName("ao.d")
    public int field981;

    @ObfuscatedName("ao.z")
    public int field982;

    @ObfuscatedName("ao.l")
    public int field978;

    @ObfuscatedName("ao.m")
    public int field984;

    @ObfuscatedName("dg.g(Lfc;B)V")
    public static void method2297(class167 arg0) {
        Statics.field988 = arg0;
    }

    @ObfuscatedName("ax.b(IB)Lao;")
    public static class42 method750(int arg0) {
        class42 var1 = (class42) field979.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field988.method3112(1, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method845(new class119(var2), arg0);
        }
        var3.method844();
        field979.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.w(B)V")
    public void method844() {
        this.method847(this.field980);
    }

    @ObfuscatedName("ao.d(Ldm;II)V")
    public void method845(class119 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2362();
            if (var3 == 0) {
                return;
            }
            this.method846(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ao.z(Ldm;IIS)V")
    public void method846(class119 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field980 = arg0.method2366();
        }
    }

    @ObfuscatedName("ao.l(II)V")
    public void method847(int arg0) {
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
        this.field982 = (int) (var14 * 256.0D);
        this.field978 = (int) (var16 * 256.0D);
        if (this.field982 < 0) {
            this.field982 = 0;
        } else if (this.field982 > 255) {
            this.field982 = 255;
        }
        if (this.field978 < 0) {
            this.field978 = 0;
        } else if (this.field978 > 255) {
            this.field978 = 255;
        }
        if (var16 > 0.5D) {
            this.field984 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field984 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field984 < 1) {
            this.field984 = 1;
        }
        this.field981 = (int) ((double) this.field984 * var18);
    }

    @ObfuscatedName("r.m(S)V")
    public static void method192() {
        field979.method3532();
    }
}

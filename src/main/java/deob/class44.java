package deob;

@ObfuscatedName("ag")
public class class44 extends class208 {

    @ObfuscatedName("ag.e")
    public static class197 field976 = new class197(64);

    @ObfuscatedName("ag.n")
    public int field977 = 0;

    @ObfuscatedName("ag.t")
    public int field978;

    @ObfuscatedName("ag.v")
    public int field979;

    @ObfuscatedName("ag.b")
    public int field984;

    @ObfuscatedName("ag.m")
    public int field981;

    @ObfuscatedName("ax.f(II)Lag;")
    public static class44 method656(int arg0) {
        class44 var1 = (class44) field976.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field982.method3107(1, arg0);
        class44 var3 = new class44();
        if (var2 != null) {
            var3.method842(new class123(var2), arg0);
        }
        var3.method841();
        field976.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.e(I)V")
    public void method841() {
        this.method844(this.field977);
    }

    @ObfuscatedName("ag.n(Ldx;II)V")
    public void method842(class123 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2522();
            if (var3 == 0) {
                return;
            }
            this.method843(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ag.t(Ldx;IIB)V")
    public void method843(class123 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field977 = arg0.method2403();
        }
    }

    @ObfuscatedName("ag.v(II)V")
    public void method844(int arg0) {
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
        this.field979 = (int) (var14 * 256.0D);
        this.field984 = (int) (var16 * 256.0D);
        if (this.field979 < 0) {
            this.field979 = 0;
        } else if (this.field979 > 255) {
            this.field979 = 255;
        }
        if (this.field984 < 0) {
            this.field984 = 0;
        } else if (this.field984 > 255) {
            this.field984 = 255;
        }
        if (var16 > 0.5D) {
            this.field981 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field981 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field981 < 1) {
            this.field981 = 1;
        }
        this.field978 = (int) ((double) this.field981 * var18);
    }

    @ObfuscatedName("as.b(I)V")
    public static void method745() {
        field976.method3572();
    }
}

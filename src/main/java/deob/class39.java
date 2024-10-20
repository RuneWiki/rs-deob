package deob;

@ObfuscatedName("ad")
public class class39 extends class195 {

    @ObfuscatedName("ad.l")
    public static class184 field915 = new class184(64);

    @ObfuscatedName("ad.g")
    public int field918 = 0;

    @ObfuscatedName("ad.u")
    public int field911;

    @ObfuscatedName("ad.q")
    public int field912;

    @ObfuscatedName("ad.r")
    public int field913;

    @ObfuscatedName("ad.v")
    public int field914;

    @ObfuscatedName("aw.o(Lfg;I)V")
    public static void method814(class158 arg0) {
        Statics.field916 = arg0;
    }

    @ObfuscatedName("ax.l(IB)Lad;")
    public static class39 method822(int arg0) {
        class39 var1 = (class39) field915.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field916.method2940(1, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method749(new class111(var2), arg0);
        }
        var3.method771();
        field915.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.g(B)V")
    public void method771() {
        this.method766(this.field918);
    }

    @ObfuscatedName("ad.u(Ldk;II)V")
    public void method749(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2219();
            if (var3 == 0) {
                return;
            }
            this.method750(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ad.q(Ldk;IIB)V")
    public void method750(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field918 = arg0.method2258();
        }
    }

    @ObfuscatedName("ad.r(II)V")
    public void method766(int arg0) {
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
        this.field912 = (int) (var14 * 256.0D);
        this.field913 = (int) (var16 * 256.0D);
        if (this.field912 < 0) {
            this.field912 = 0;
        } else if (this.field912 > 255) {
            this.field912 = 255;
        }
        if (this.field913 < 0) {
            this.field913 = 0;
        } else if (this.field913 > 255) {
            this.field913 = 255;
        }
        if (var16 > 0.5D) {
            this.field914 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field914 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field914 < 1) {
            this.field914 = 1;
        }
        this.field911 = (int) ((double) this.field914 * var18);
    }

    @ObfuscatedName("dm.v(B)V")
    public static void method2147() {
        field915.method3404();
    }
}

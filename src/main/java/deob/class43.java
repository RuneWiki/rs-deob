package deob;

@ObfuscatedName("ax")
public class class43 extends class194 {

    @ObfuscatedName("ax.s")
    public static class183 field968 = new class183(64);

    @ObfuscatedName("ax.h")
    public int field970 = 0;

    @ObfuscatedName("ax.e")
    public int field977 = -1;

    @ObfuscatedName("ax.n")
    public boolean field972 = true;

    @ObfuscatedName("ax.t")
    public int field973 = -1;

    @ObfuscatedName("ax.l")
    public int field971;

    @ObfuscatedName("ax.m")
    public int field975;

    @ObfuscatedName("ax.o")
    public int field981;

    @ObfuscatedName("ax.k")
    public int field974;

    @ObfuscatedName("ax.p")
    public int field978;

    @ObfuscatedName("ax.u")
    public int field979;

    @ObfuscatedName("ac.q(II)Lax;")
    public static class43 method599(int arg0) {
        class43 var1 = (class43) field968.method3243((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field976.method2811(4, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method804(new class111(var2), arg0);
        }
        var3.method803();
        field968.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.s(I)V")
    public void method803() {
        if (this.field973 != -1) {
            this.method805(this.field973);
            this.field974 = this.field971;
            this.field978 = this.field975;
            this.field979 = this.field981;
        }
        this.method805(this.field970);
    }

    @ObfuscatedName("ax.h(Ldx;II)V")
    public void method804(class111 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2231();
            if (var3 == 0) {
                return;
            }
            this.method810(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ax.e(Ldx;IIB)V")
    public void method810(class111 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field970 = arg0.method2150();
        } else if (arg1 == 2) {
            this.field977 = arg0.method2231();
        } else if (arg1 == 5) {
            this.field972 = false;
        } else if (arg1 == 7) {
            this.field973 = arg0.method2150();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ax.n(II)V")
    public void method805(int arg0) {
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
        this.field971 = (int) (var18 * 256.0D);
        this.field975 = (int) (var14 * 256.0D);
        this.field981 = (int) (var16 * 256.0D);
        if (this.field975 < 0) {
            this.field975 = 0;
        } else if (this.field975 > 255) {
            this.field975 = 255;
        }
        if (this.field981 < 0) {
            this.field981 = 0;
        } else if (this.field981 > 255) {
            this.field981 = 255;
        }
    }

    @ObfuscatedName("ad.t(I)V")
    public static void method543() {
        field968.method3246();
    }
}

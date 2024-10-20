package deob;

@ObfuscatedName("ad")
public class class42 extends class185 {

    @ObfuscatedName("ad.k")
    public static class174 field982 = new class174(64);

    @ObfuscatedName("ad.y")
    public int field976 = 0;

    @ObfuscatedName("ad.e")
    public int field977 = -1;

    @ObfuscatedName("ad.r")
    public boolean field989 = true;

    @ObfuscatedName("ad.a")
    public int field984 = -1;

    @ObfuscatedName("ad.n")
    public int field978;

    @ObfuscatedName("ad.x")
    public int field975;

    @ObfuscatedName("ad.g")
    public int field974;

    @ObfuscatedName("ad.o")
    public int field983;

    @ObfuscatedName("ad.p")
    public int field980;

    @ObfuscatedName("ad.v")
    public int field985;

    @ObfuscatedName("gw.f(Lev;I)V")
    public static void method3421(class149 arg0) {
        Statics.field981 = arg0;
    }

    @ObfuscatedName("i.k(II)Lad;")
    public static class42 method552(int arg0) {
        class42 var1 = (class42) field982.method3207((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field981.method2763(4, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method827(new class108(var2), arg0);
        }
        var3.method826();
        field982.method3209(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.y(B)V")
    public void method826() {
        if (this.field984 != -1) {
            this.method829(this.field984);
            this.field983 = this.field978;
            this.field980 = this.field975;
            this.field985 = this.field974;
        }
        this.method829(this.field976);
    }

    @ObfuscatedName("ad.e(Ldu;IB)V")
    public void method827(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2158();
            if (var3 == 0) {
                return;
            }
            this.method839(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ad.r(Ldu;III)V")
    public void method839(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field976 = arg0.method2314();
        } else if (arg1 == 2) {
            this.field977 = arg0.method2158();
        } else if (arg1 == 5) {
            this.field989 = false;
        } else if (arg1 == 7) {
            this.field984 = arg0.method2314();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ad.a(II)V")
    public void method829(int arg0) {
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
        this.field978 = (int) (var18 * 256.0D);
        this.field975 = (int) (var14 * 256.0D);
        this.field974 = (int) (var16 * 256.0D);
        if (this.field975 < 0) {
            this.field975 = 0;
        } else if (this.field975 > 255) {
            this.field975 = 255;
        }
        if (this.field974 < 0) {
            this.field974 = 0;
        } else if (this.field974 > 255) {
            this.field974 = 255;
        }
    }

    @ObfuscatedName("y.n(S)V")
    public static void method24() {
        field982.method3223();
    }
}

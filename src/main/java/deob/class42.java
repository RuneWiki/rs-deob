package deob;

@ObfuscatedName("an")
public class class42 extends class185 {

    @ObfuscatedName("an.v")
    public static class174 field984 = new class174(64);

    @ObfuscatedName("an.k")
    public int field982 = 0;

    @ObfuscatedName("an.g")
    public int field976 = -1;

    @ObfuscatedName("an.q")
    public boolean field977 = true;

    @ObfuscatedName("an.l")
    public int field978 = -1;

    @ObfuscatedName("an.a")
    public int field979;

    @ObfuscatedName("an.b")
    public int field980;

    @ObfuscatedName("an.z")
    public int field981;

    @ObfuscatedName("an.w")
    public int field985;

    @ObfuscatedName("an.j")
    public int field983;

    @ObfuscatedName("an.p")
    public int field986;

    @ObfuscatedName("du.e(II)Lan;")
    public static class42 method2579(int arg0) {
        class42 var1 = (class42) field984.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field974.method2721(4, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method781(new class108(var2), arg0);
        }
        var3.method780();
        field984.method3156(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.v(I)V")
    public void method780() {
        if (this.field978 != -1) {
            this.method783(this.field978);
            this.field985 = this.field979;
            this.field983 = this.field980;
            this.field986 = this.field981;
        }
        this.method783(this.field982);
    }

    @ObfuscatedName("an.k(Ldd;II)V")
    public void method781(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2122();
            if (var3 == 0) {
                return;
            }
            this.method793(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("an.g(Ldd;III)V")
    public void method793(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field982 = arg0.method2126();
        } else if (arg1 == 2) {
            this.field976 = arg0.method2122();
        } else if (arg1 == 5) {
            this.field977 = false;
        } else if (arg1 == 7) {
            this.field978 = arg0.method2126();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("an.q(II)V")
    public void method783(int arg0) {
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
        this.field979 = (int) (var18 * 256.0D);
        this.field980 = (int) (var14 * 256.0D);
        this.field981 = (int) (var16 * 256.0D);
        if (this.field980 < 0) {
            this.field980 = 0;
        } else if (this.field980 > 255) {
            this.field980 = 255;
        }
        if (this.field981 < 0) {
            this.field981 = 0;
        } else if (this.field981 > 255) {
            this.field981 = 255;
        }
    }

    @ObfuscatedName("di.l(I)V")
    public static void method2535() {
        field984.method3157();
    }
}

package deob;

@ObfuscatedName("ax")
public class class42 extends class185 {

    @ObfuscatedName("ax.j")
    public static class174 field975 = new class174(64);

    @ObfuscatedName("ax.z")
    public int field970 = 0;

    @ObfuscatedName("ax.b")
    public int field968 = -1;

    @ObfuscatedName("ax.k")
    public boolean field972 = true;

    @ObfuscatedName("ax.c")
    public int field973 = -1;

    @ObfuscatedName("ax.w")
    public int field974;

    @ObfuscatedName("ax.l")
    public int field971;

    @ObfuscatedName("ax.n")
    public int field976;

    @ObfuscatedName("ax.d")
    public int field977;

    @ObfuscatedName("ax.h")
    public int field978;

    @ObfuscatedName("ax.y")
    public int field979;

    @ObfuscatedName("af.j(II)Lax;")
    public static class42 method869(int arg0) {
        class42 var1 = (class42) field975.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field969.method2660(4, arg0);
        class42 var3 = new class42();
        if (var2 != null) {
            var3.method761(new class108(var2), arg0);
        }
        var3.method774();
        field975.method3099(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ax.z(I)V")
    public void method774() {
        if (this.field973 != -1) {
            this.method763(this.field973);
            this.field977 = this.field974;
            this.field978 = this.field971;
            this.field979 = this.field976;
        }
        this.method763(this.field970);
    }

    @ObfuscatedName("ax.b(Ldf;II)V")
    public void method761(class108 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2083();
            if (var3 == 0) {
                return;
            }
            this.method760(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ax.k(Ldf;III)V")
    public void method760(class108 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field970 = arg0.method2260();
        } else if (arg1 == 2) {
            this.field968 = arg0.method2083();
        } else if (arg1 == 5) {
            this.field972 = false;
        } else if (arg1 == 7) {
            this.field973 = arg0.method2260();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ax.c(II)V")
    public void method763(int arg0) {
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
        this.field974 = (int) (var18 * 256.0D);
        this.field971 = (int) (var14 * 256.0D);
        this.field976 = (int) (var16 * 256.0D);
        if (this.field971 < 0) {
            this.field971 = 0;
        } else if (this.field971 > 255) {
            this.field971 = 255;
        }
        if (this.field976 < 0) {
            this.field976 = 0;
        } else if (this.field976 > 255) {
            this.field976 = 255;
        }
    }
}

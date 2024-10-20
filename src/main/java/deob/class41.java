package deob;

@ObfuscatedName("at")
public class class41 extends class182 {

    @ObfuscatedName("at.o")
    public static class171 field972 = new class171(64);

    @ObfuscatedName("at.y")
    public int field986 = 0;

    @ObfuscatedName("at.b")
    public int field974 = -1;

    @ObfuscatedName("at.w")
    public boolean field975 = true;

    @ObfuscatedName("at.r")
    public int field976 = -1;

    @ObfuscatedName("at.l")
    public int field977;

    @ObfuscatedName("at.s")
    public int field978;

    @ObfuscatedName("at.f")
    public int field979;

    @ObfuscatedName("at.x")
    public int field980;

    @ObfuscatedName("at.h")
    public int field982;

    @ObfuscatedName("at.a")
    public int field981;

    @ObfuscatedName("at.e(B)V")
    public void method795() {
        if (this.field976 != -1) {
            this.method784(this.field976);
            this.field980 = this.field977;
            this.field982 = this.field978;
            this.field981 = this.field979;
        }
        this.method784(this.field986);
    }

    @ObfuscatedName("at.o(Ldl;II)V")
    public void method782(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2123();
            if (var3 == 0) {
                return;
            }
            this.method783(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("at.y(Ldl;III)V")
    public void method783(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field986 = arg0.method2215();
        } else if (arg1 == 2) {
            this.field974 = arg0.method2123();
        } else if (arg1 == 5) {
            this.field975 = false;
        } else if (arg1 == 7) {
            this.field976 = arg0.method2215();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("at.b(IB)V")
    public void method784(int arg0) {
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
        this.field977 = (int) (var18 * 256.0D);
        this.field978 = (int) (var14 * 256.0D);
        this.field979 = (int) (var16 * 256.0D);
        if (this.field978 < 0) {
            this.field978 = 0;
        } else if (this.field978 > 255) {
            this.field978 = 255;
        }
        if (this.field979 < 0) {
            this.field979 = 0;
        } else if (this.field979 > 255) {
            this.field979 = 255;
        }
    }

    @ObfuscatedName("i.w(B)V")
    public static void method144() {
        field972.method3065();
    }
}

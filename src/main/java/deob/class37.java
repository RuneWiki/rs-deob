package deob;

@ObfuscatedName("au")
public class class37 extends class183 {

    @ObfuscatedName("au.y")
    public static class172 field877 = new class172(64);

    @ObfuscatedName("au.s")
    public int field878 = 0;

    @ObfuscatedName("au.g")
    public int field879;

    @ObfuscatedName("au.h")
    public int field883;

    @ObfuscatedName("au.l")
    public int field876;

    @ObfuscatedName("au.e")
    public int field881;

    @ObfuscatedName("al.k(Lei;I)V")
    public static void method527(class147 arg0) {
        Statics.field882 = arg0;
    }

    @ObfuscatedName("au.y(I)V")
    public void method658() {
        this.method676(this.field878);
    }

    @ObfuscatedName("au.s(Ldy;II)V")
    public void method659(class107 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2138();
            if (var3 == 0) {
                return;
            }
            this.method660(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("au.g(Ldy;III)V")
    public void method660(class107 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field878 = arg0.method2142();
        }
    }

    @ObfuscatedName("au.h(II)V")
    public void method676(int arg0) {
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
        this.field883 = (int) (var14 * 256.0D);
        this.field876 = (int) (var16 * 256.0D);
        if (this.field883 < 0) {
            this.field883 = 0;
        } else if (this.field883 > 255) {
            this.field883 = 255;
        }
        if (this.field876 < 0) {
            this.field876 = 0;
        } else if (this.field876 > 255) {
            this.field876 = 255;
        }
        if (var16 > 0.5D) {
            this.field881 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field881 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field881 < 1) {
            this.field881 = 1;
        }
        this.field879 = (int) ((double) this.field881 * var18);
    }

    @ObfuscatedName("q.l(I)V")
    public static void method465() {
        field877.method3210();
    }
}

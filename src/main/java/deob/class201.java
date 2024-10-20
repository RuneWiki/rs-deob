package deob;

@ObfuscatedName("gu")
public class class201 extends class130 {

    @ObfuscatedName("gu.n")
    public static class125 field3048 = new class125(64);

    @ObfuscatedName("gu.g")
    public int field3046 = 0;

    @ObfuscatedName("gu.v")
    public int field3047 = -1;

    @ObfuscatedName("gu.y")
    public boolean field3058 = true;

    @ObfuscatedName("gu.p")
    public int field3049 = -1;

    @ObfuscatedName("gu.j")
    public int field3045;

    @ObfuscatedName("gu.m")
    public int field3051;

    @ObfuscatedName("gu.a")
    public int field3050;

    @ObfuscatedName("gu.i")
    public int field3057;

    @ObfuscatedName("gu.s")
    public int field3054;

    @ObfuscatedName("gu.k")
    public int field3055;

    @ObfuscatedName("gp.x(Lgo;I)V")
    public static void method3397(class183 arg0) {
        Statics.field37 = arg0;
    }

    @ObfuscatedName("gu.n(B)V")
    public void method3591() {
        if (this.field3049 != -1) {
            this.method3593(this.field3049);
            this.field3057 = this.field3045;
            this.field3054 = this.field3051;
            this.field3055 = this.field3050;
        }
        this.method3593(this.field3046);
    }

    @ObfuscatedName("gu.g(Leq;IB)V")
    public void method3592(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2878();
            if (var3 == 0) {
                return;
            }
            this.method3604(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gu.v(Leq;IIB)V")
    public void method3604(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3046 = arg0.method2705();
        } else if (arg1 == 2) {
            this.field3047 = arg0.method2878();
        } else if (arg1 == 5) {
            this.field3058 = false;
        } else if (arg1 == 7) {
            this.field3049 = arg0.method2705();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gu.y(II)V")
    public void method3593(int arg0) {
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
        this.field3045 = (int) (var18 * 256.0D);
        this.field3051 = (int) (var14 * 256.0D);
        this.field3050 = (int) (var16 * 256.0D);
        if (this.field3051 < 0) {
            this.field3051 = 0;
        } else if (this.field3051 > 255) {
            this.field3051 = 255;
        }
        if (this.field3050 < 0) {
            this.field3050 = 0;
        } else if (this.field3050 > 255) {
            this.field3050 = 255;
        }
    }

    @ObfuscatedName("gs.p(I)V")
    public static void method3349() {
        field3048.method2277();
    }
}

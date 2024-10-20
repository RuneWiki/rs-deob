package deob;

@ObfuscatedName("gv")
public class class201 extends class130 {

    @ObfuscatedName("gv.c")
    public static class125 field3047 = new class125(64);

    @ObfuscatedName("gv.f")
    public int field3043 = 0;

    @ObfuscatedName("gv.h")
    public int field3046 = -1;

    @ObfuscatedName("gv.a")
    public boolean field3052 = true;

    @ObfuscatedName("gv.g")
    public int field3045 = -1;

    @ObfuscatedName("gv.k")
    public int field3042;

    @ObfuscatedName("gv.u")
    public int field3048;

    @ObfuscatedName("gv.b")
    public int field3049;

    @ObfuscatedName("gv.x")
    public int field3044;

    @ObfuscatedName("gv.r")
    public int field3051;

    @ObfuscatedName("gv.n")
    public int field3050;

    @ObfuscatedName("gv.c(I)V")
    public void method3395() {
        if (this.field3045 != -1) {
            this.method3394(this.field3045);
            this.field3044 = this.field3042;
            this.field3051 = this.field3048;
            this.field3050 = this.field3049;
        }
        this.method3394(this.field3043);
    }

    @ObfuscatedName("gv.f(Lea;II)V")
    public void method3393(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2545();
            if (var3 == 0) {
                return;
            }
            this.method3397(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gv.g(Lea;IIB)V")
    public void method3397(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3043 = arg0.method2549();
        } else if (arg1 == 2) {
            this.field3046 = arg0.method2545();
        } else if (arg1 == 5) {
            this.field3052 = false;
        } else if (arg1 == 7) {
            this.field3045 = arg0.method2549();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gv.k(II)V")
    public void method3394(int arg0) {
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
        this.field3042 = (int) (var18 * 256.0D);
        this.field3048 = (int) (var14 * 256.0D);
        this.field3049 = (int) (var16 * 256.0D);
        if (this.field3048 < 0) {
            this.field3048 = 0;
        } else if (this.field3048 > 255) {
            this.field3048 = 255;
        }
        if (this.field3049 < 0) {
            this.field3049 = 0;
        } else if (this.field3049 > 255) {
            this.field3049 = 255;
        }
    }

    @ObfuscatedName("gh.u(B)V")
    public static void method3116() {
        field3047.method2124();
    }
}

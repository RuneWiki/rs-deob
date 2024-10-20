package deob;

@ObfuscatedName("gf")
public class class201 extends class130 {

    @ObfuscatedName("gf.g")
    public static class125 field3031 = new class125(64);

    @ObfuscatedName("gf.x")
    public int field3033 = 0;

    @ObfuscatedName("gf.q")
    public int field3034 = -1;

    @ObfuscatedName("gf.d")
    public boolean field3035 = true;

    @ObfuscatedName("gf.k")
    public int field3036 = -1;

    @ObfuscatedName("gf.j")
    public int field3037;

    @ObfuscatedName("gf.s")
    public int field3039;

    @ObfuscatedName("gf.o")
    public int field3032;

    @ObfuscatedName("gf.a")
    public int field3040;

    @ObfuscatedName("gf.c")
    public int field3041;

    @ObfuscatedName("gf.m")
    public int field3042;

    @ObfuscatedName("ba.p(Lgp;I)V")
    public static void method1104(class183 arg0) {
        Statics.field3038 = arg0;
    }

    @ObfuscatedName("gf.g(I)V")
    public void method3495() {
        if (this.field3036 != -1) {
            this.method3497(this.field3036);
            this.field3040 = this.field3037;
            this.field3041 = this.field3039;
            this.field3042 = this.field3032;
        }
        this.method3497(this.field3033);
    }

    @ObfuscatedName("gf.x(Lev;IB)V")
    public void method3487(class154 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2593();
            if (var3 == 0) {
                return;
            }
            this.method3482(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("gf.q(Lev;III)V")
    public void method3482(class154 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3033 = arg0.method2748();
        } else if (arg1 == 2) {
            this.field3034 = arg0.method2593();
        } else if (arg1 == 5) {
            this.field3035 = false;
        } else if (arg1 == 7) {
            this.field3036 = arg0.method2748();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("gf.d(IB)V")
    public void method3497(int arg0) {
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
        this.field3037 = (int) (var18 * 256.0D);
        this.field3039 = (int) (var14 * 256.0D);
        this.field3032 = (int) (var16 * 256.0D);
        if (this.field3039 < 0) {
            this.field3039 = 0;
        } else if (this.field3039 > 255) {
            this.field3039 = 255;
        }
        if (this.field3032 < 0) {
            this.field3032 = 0;
        } else if (this.field3032 > 255) {
            this.field3032 = 255;
        }
    }
}

package deob;

@ObfuscatedName("ip")
public class class258 extends class176 {

    @ObfuscatedName("ip.x")
    public static class146 field3484 = new class146(64);

    @ObfuscatedName("ip.t")
    public int field3480 = 0;

    @ObfuscatedName("ip.g")
    public int field3475 = -1;

    @ObfuscatedName("ip.l")
    public boolean field3476 = true;

    @ObfuscatedName("ip.u")
    public int field3474 = -1;

    @ObfuscatedName("ip.j")
    public int field3478;

    @ObfuscatedName("ip.v")
    public int field3479;

    @ObfuscatedName("ip.d")
    public int field3472;

    @ObfuscatedName("ip.z")
    public int field3481;

    @ObfuscatedName("ip.n")
    public int field3473;

    @ObfuscatedName("ip.h")
    public int field3483;

    @ObfuscatedName("by.c(Lhz;I)V")
    public static void method1102(class234 arg0) {
        Statics.field3477 = arg0;
    }

    @ObfuscatedName("ip.x(B)V")
    public void method4418() {
        if (this.field3474 != -1) {
            this.method4426(this.field3474);
            this.field3481 = this.field3478;
            this.field3473 = this.field3479;
            this.field3483 = this.field3472;
        }
        this.method4426(this.field3480);
    }

    @ObfuscatedName("ip.t(Lkz;II)V")
    public void method4419(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5103();
            if (var3 == 0) {
                return;
            }
            this.method4420(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ip.g(Lkz;III)V")
    public void method4420(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3480 = arg0.method5107();
        } else if (arg1 == 2) {
            this.field3475 = arg0.method5103();
        } else if (arg1 == 5) {
            this.field3476 = false;
        } else if (arg1 == 7) {
            this.field3474 = arg0.method5107();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ip.l(II)V")
    public void method4426(int arg0) {
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
        this.field3478 = (int) (var18 * 256.0D);
        this.field3479 = (int) (var14 * 256.0D);
        this.field3472 = (int) (var16 * 256.0D);
        if (this.field3479 < 0) {
            this.field3479 = 0;
        } else if (this.field3479 > 255) {
            this.field3479 = 255;
        }
        if (this.field3472 < 0) {
            this.field3472 = 0;
        } else if (this.field3472 > 255) {
            this.field3472 = 255;
        }
    }

    @ObfuscatedName("bt.u(I)V")
    public static void method1013() {
        field3484.method3063();
    }
}

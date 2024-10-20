package deob;

@ObfuscatedName("jy")
public class class275 extends class209 {

    @ObfuscatedName("jy.l")
    public static class203 field3602 = new class203(64);

    @ObfuscatedName("jy.w")
    public int field3598 = 0;

    @ObfuscatedName("jy.s")
    public int field3599 = -1;

    @ObfuscatedName("jy.e")
    public boolean field3597 = true;

    @ObfuscatedName("jy.a")
    public int field3601 = -1;

    @ObfuscatedName("jy.c")
    public int field3603;

    @ObfuscatedName("jy.p")
    public int field3604;

    @ObfuscatedName("jy.r")
    public int field3596;

    @ObfuscatedName("jy.m")
    public int field3605;

    @ObfuscatedName("jy.d")
    public int field3606;

    @ObfuscatedName("jy.z")
    public int field3607;

    @ObfuscatedName("jy.f(I)V")
    public void method4888() {
        if (this.field3601 != -1) {
            this.method4891(this.field3601);
            this.field3605 = this.field3603;
            this.field3606 = this.field3604;
            this.field3607 = this.field3596;
        }
        this.method4891(this.field3598);
    }

    @ObfuscatedName("jy.l(Lgm;II)V")
    public void method4889(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3344();
            if (var3 == 0) {
                return;
            }
            this.method4887(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jy.w(Lgm;IIS)V")
    public void method4887(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3598 = arg0.method3348();
        } else if (arg1 == 2) {
            this.field3599 = arg0.method3344();
        } else if (arg1 == 5) {
            this.field3597 = false;
        } else if (arg1 == 7) {
            this.field3601 = arg0.method3348();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jy.s(IB)V")
    public void method4891(int arg0) {
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
        this.field3603 = (int) (var18 * 256.0D);
        this.field3604 = (int) (var14 * 256.0D);
        this.field3596 = (int) (var16 * 256.0D);
        if (this.field3604 < 0) {
            this.field3604 = 0;
        } else if (this.field3604 > 255) {
            this.field3604 = 255;
        }
        if (this.field3596 < 0) {
            this.field3596 = 0;
        } else if (this.field3596 > 255) {
            this.field3596 = 255;
        }
    }

    @ObfuscatedName("hp.e(I)V")
    public static void method4101() {
        field3602.method3740();
    }
}

package deob;

@ObfuscatedName("ic")
public class class260 extends class195 {

    @ObfuscatedName("ic.j")
    public static class190 field3590 = new class190(64);

    @ObfuscatedName("ic.n")
    public int field3591 = 0;

    @ObfuscatedName("ic.r")
    public int field3602 = -1;

    @ObfuscatedName("ic.v")
    public boolean field3589 = true;

    @ObfuscatedName("ic.e")
    public int field3593 = -1;

    @ObfuscatedName("ic.l")
    public int field3601;

    @ObfuscatedName("ic.s")
    public int field3596;

    @ObfuscatedName("ic.w")
    public int field3597;

    @ObfuscatedName("ic.p")
    public int field3598;

    @ObfuscatedName("ic.m")
    public int field3599;

    @ObfuscatedName("ic.u")
    public int field3600;

    @ObfuscatedName("ij.a(Lif;I)V")
    public static void method3985(class236 arg0) {
        Statics.field3595 = arg0;
    }

    @ObfuscatedName("ic.n(B)V")
    public void method4266() {
        if (this.field3593 != -1) {
            this.method4273(this.field3593);
            this.field3598 = this.field3601;
            this.field3599 = this.field3596;
            this.field3600 = this.field3597;
        }
        this.method4273(this.field3591);
    }

    @ObfuscatedName("ic.r(Lfe;II)V")
    public void method4267(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2871();
            if (var3 == 0) {
                return;
            }
            this.method4268(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ic.v(Lfe;IIB)V")
    public void method4268(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3591 = arg0.method2875();
        } else if (arg1 == 2) {
            this.field3602 = arg0.method2871();
        } else if (arg1 == 5) {
            this.field3589 = false;
        } else if (arg1 == 7) {
            this.field3593 = arg0.method2875();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ic.e(II)V")
    public void method4273(int arg0) {
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
        this.field3601 = (int) (var18 * 256.0D);
        this.field3596 = (int) (var14 * 256.0D);
        this.field3597 = (int) (var16 * 256.0D);
        if (this.field3596 < 0) {
            this.field3596 = 0;
        } else if (this.field3596 > 255) {
            this.field3596 = 255;
        }
        if (this.field3597 < 0) {
            this.field3597 = 0;
        } else if (this.field3597 > 255) {
            this.field3597 = 255;
        }
    }
}

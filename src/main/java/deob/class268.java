package deob;

@ObfuscatedName("jt")
public class class268 extends class185 {

    @ObfuscatedName("jt.o")
    public static class155 field3533 = new class155(64);

    @ObfuscatedName("jt.q")
    public int field3536 = 0;

    @ObfuscatedName("jt.j")
    public int field3541 = -1;

    @ObfuscatedName("jt.p")
    public boolean field3542 = true;

    @ObfuscatedName("jt.g")
    public int field3537 = -1;

    @ObfuscatedName("jt.n")
    public int field3538;

    @ObfuscatedName("jt.u")
    public int field3539;

    @ObfuscatedName("jt.a")
    public int field3540;

    @ObfuscatedName("jt.z")
    public int field3532;

    @ObfuscatedName("jt.w")
    public int field3534;

    @ObfuscatedName("jt.y")
    public int field3543;

    @ObfuscatedName("jt.m(S)V")
    public void method4512() {
        if (this.field3537 != -1) {
            this.method4503(this.field3537);
            this.field3532 = this.field3538;
            this.field3534 = this.field3539;
            this.field3543 = this.field3540;
        }
        this.method4503(this.field3536);
    }

    @ObfuscatedName("jt.o(Lkn;II)V")
    public void method4501(class310 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5227();
            if (var3 == 0) {
                return;
            }
            this.method4516(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jt.q(Lkn;III)V")
    public void method4516(class310 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3536 = arg0.method5231();
        } else if (arg1 == 2) {
            this.field3541 = arg0.method5227();
        } else if (arg1 == 5) {
            this.field3542 = false;
        } else if (arg1 == 7) {
            this.field3537 = arg0.method5231();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jt.j(IB)V")
    public void method4503(int arg0) {
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
        this.field3538 = (int) (var18 * 256.0D);
        this.field3539 = (int) (var14 * 256.0D);
        this.field3540 = (int) (var16 * 256.0D);
        if (this.field3539 < 0) {
            this.field3539 = 0;
        } else if (this.field3539 > 255) {
            this.field3539 = 255;
        }
        if (this.field3540 < 0) {
            this.field3540 = 0;
        } else if (this.field3540 > 255) {
            this.field3540 = 255;
        }
    }
}

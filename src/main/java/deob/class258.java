package deob;

@ObfuscatedName("it")
public class class258 extends class176 {

    @ObfuscatedName("it.w")
    public static class146 field3504 = new class146(64);

    @ObfuscatedName("it.e")
    public int field3513 = 0;

    @ObfuscatedName("it.p")
    public int field3509 = -1;

    @ObfuscatedName("it.k")
    public boolean field3507 = true;

    @ObfuscatedName("it.l")
    public int field3508 = -1;

    @ObfuscatedName("it.b")
    public int field3514;

    @ObfuscatedName("it.i")
    public int field3510;

    @ObfuscatedName("it.c")
    public int field3511;

    @ObfuscatedName("it.f")
    public int field3512;

    @ObfuscatedName("it.m")
    public int field3505;

    @ObfuscatedName("it.u")
    public int field3515;

    @ObfuscatedName("it.q(I)V")
    public void method4358() {
        if (this.field3508 != -1) {
            this.method4364(this.field3508);
            this.field3512 = this.field3514;
            this.field3505 = this.field3510;
            this.field3515 = this.field3511;
        }
        this.method4364(this.field3513);
    }

    @ObfuscatedName("it.w(Lkf;IB)V")
    public void method4359(class301 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5077();
            if (var3 == 0) {
                return;
            }
            this.method4360(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("it.e(Lkf;IIB)V")
    public void method4360(class301 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3513 = arg0.method5140();
        } else if (arg1 == 2) {
            this.field3509 = arg0.method5077();
        } else if (arg1 == 5) {
            this.field3507 = false;
        } else if (arg1 == 7) {
            this.field3508 = arg0.method5140();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("it.p(II)V")
    public void method4364(int arg0) {
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
        this.field3514 = (int) (var18 * 256.0D);
        this.field3510 = (int) (var14 * 256.0D);
        this.field3511 = (int) (var16 * 256.0D);
        if (this.field3510 < 0) {
            this.field3510 = 0;
        } else if (this.field3510 > 255) {
            this.field3510 = 255;
        }
        if (this.field3511 < 0) {
            this.field3511 = 0;
        } else if (this.field3511 > 255) {
            this.field3511 = 255;
        }
    }

    @ObfuscatedName("gf.k(B)V")
    public static void method3361() {
        field3504.method3042();
    }
}

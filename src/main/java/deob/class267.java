package deob;

@ObfuscatedName("jx")
public class class267 extends class202 {

    @ObfuscatedName("jx.s")
    public static class197 field3639 = new class197(64);

    @ObfuscatedName("jx.r")
    public int field3640 = 0;

    @ObfuscatedName("jx.g")
    public int field3641 = -1;

    @ObfuscatedName("jx.x")
    public boolean field3642 = true;

    @ObfuscatedName("jx.f")
    public int field3645 = -1;

    @ObfuscatedName("jx.u")
    public int field3644;

    @ObfuscatedName("jx.t")
    public int field3638;

    @ObfuscatedName("jx.k")
    public int field3643;

    @ObfuscatedName("jx.n")
    public int field3647;

    @ObfuscatedName("jx.d")
    public int field3648;

    @ObfuscatedName("jx.o")
    public int field3649;

    @ObfuscatedName("am.b(Lij;I)V")
    public static void method292(class243 arg0) {
        Statics.field3646 = arg0;
    }

    @ObfuscatedName("fi.s(II)Ljx;")
    public static class267 method2853(int arg0) {
        class267 var1 = (class267) field3639.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3646.method3887(4, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4366(new class181(var2), arg0);
        }
        var3.method4372();
        field3639.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.r(I)V")
    public void method4372() {
        if (this.field3645 != -1) {
            this.method4368(this.field3645);
            this.field3647 = this.field3644;
            this.field3648 = this.field3638;
            this.field3649 = this.field3643;
        }
        this.method4368(this.field3640);
    }

    @ObfuscatedName("jx.g(Lfs;IB)V")
    public void method4366(class181 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2945();
            if (var3 == 0) {
                return;
            }
            this.method4367(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jx.x(Lfs;III)V")
    public void method4367(class181 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3640 = arg0.method3010();
        } else if (arg1 == 2) {
            this.field3641 = arg0.method2945();
        } else if (arg1 == 5) {
            this.field3642 = false;
        } else if (arg1 == 7) {
            this.field3645 = arg0.method3010();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jx.f(II)V")
    public void method4368(int arg0) {
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
        this.field3644 = (int) (var18 * 256.0D);
        this.field3638 = (int) (var14 * 256.0D);
        this.field3643 = (int) (var16 * 256.0D);
        if (this.field3638 < 0) {
            this.field3638 = 0;
        } else if (this.field3638 > 255) {
            this.field3638 = 255;
        }
        if (this.field3643 < 0) {
            this.field3643 = 0;
        } else if (this.field3643 > 255) {
            this.field3643 = 255;
        }
    }

    @ObfuscatedName("fg.u(I)V")
    public static void method2761() {
        field3639.method3333();
    }
}

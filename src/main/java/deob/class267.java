package deob;

@ObfuscatedName("jc")
public class class267 extends class202 {

    @ObfuscatedName("jc.x")
    public static class197 field3653 = new class197(64);

    @ObfuscatedName("jc.k")
    public int field3654 = 0;

    @ObfuscatedName("jc.z")
    public int field3664 = -1;

    @ObfuscatedName("jc.v")
    public boolean field3658 = true;

    @ObfuscatedName("jc.m")
    public int field3657 = -1;

    @ObfuscatedName("jc.b")
    public int field3652;

    @ObfuscatedName("jc.t")
    public int field3659;

    @ObfuscatedName("jc.p")
    public int field3660;

    @ObfuscatedName("jc.r")
    public int field3661;

    @ObfuscatedName("jc.l")
    public int field3662;

    @ObfuscatedName("jc.u")
    public int field3655;

    @ObfuscatedName("fu.d(Lid;I)V")
    public static void method2929(class243 arg0) {
        Statics.field3663 = arg0;
    }

    @ObfuscatedName("an.x(II)Ljc;")
    public static class267 method517(int arg0) {
        class267 var1 = (class267) field3653.method3418((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3663.method3935(4, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4520(new class181(var2), arg0);
        }
        var3.method4525();
        field3653.method3417(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.k(I)V")
    public void method4525() {
        if (this.field3657 != -1) {
            this.method4522(this.field3657);
            this.field3661 = this.field3652;
            this.field3662 = this.field3659;
            this.field3655 = this.field3660;
        }
        this.method4522(this.field3654);
    }

    @ObfuscatedName("jc.z(Lfr;IB)V")
    public void method4520(class181 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3204();
            if (var3 == 0) {
                return;
            }
            this.method4521(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jc.v(Lfr;IIB)V")
    public void method4521(class181 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3654 = arg0.method3235();
        } else if (arg1 == 2) {
            this.field3664 = arg0.method3204();
        } else if (arg1 == 5) {
            this.field3658 = false;
        } else if (arg1 == 7) {
            this.field3657 = arg0.method3235();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jc.m(IB)V")
    public void method4522(int arg0) {
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
        this.field3652 = (int) (var18 * 256.0D);
        this.field3659 = (int) (var14 * 256.0D);
        this.field3660 = (int) (var16 * 256.0D);
        if (this.field3659 < 0) {
            this.field3659 = 0;
        } else if (this.field3659 > 255) {
            this.field3659 = 255;
        }
        if (this.field3660 < 0) {
            this.field3660 = 0;
        } else if (this.field3660 > 255) {
            this.field3660 = 255;
        }
    }
}

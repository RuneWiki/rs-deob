package deob;

@ObfuscatedName("jy")
public class class267 extends class202 {

    @ObfuscatedName("jy.p")
    public static class197 field3652 = new class197(64);

    @ObfuscatedName("jy.i")
    public int field3643 = 0;

    @ObfuscatedName("jy.j")
    public int field3645 = -1;

    @ObfuscatedName("jy.v")
    public boolean field3646 = true;

    @ObfuscatedName("jy.x")
    public int field3647 = -1;

    @ObfuscatedName("jy.e")
    public int field3644;

    @ObfuscatedName("jy.l")
    public int field3649;

    @ObfuscatedName("jy.b")
    public int field3650;

    @ObfuscatedName("jy.n")
    public int field3642;

    @ObfuscatedName("jy.c")
    public int field3651;

    @ObfuscatedName("jy.a")
    public int field3653;

    @ObfuscatedName("ic.m(Lik;I)V")
    public static void method4075(class243 arg0) {
        Statics.field3648 = arg0;
    }

    @ObfuscatedName("cr.p(II)Ljy;")
    public static class267 method1587(int arg0) {
        class267 var1 = (class267) field3652.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3648.method3930(4, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4487(new class181(var2), arg0);
        }
        var3.method4498();
        field3652.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.i(B)V")
    public void method4498() {
        if (this.field3647 != -1) {
            this.method4486(this.field3647);
            this.field3642 = this.field3644;
            this.field3651 = this.field3649;
            this.field3653 = this.field3650;
        }
        this.method4486(this.field3643);
    }

    @ObfuscatedName("jy.j(Lfv;IB)V")
    public void method4487(class181 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3012();
            if (var3 == 0) {
                return;
            }
            this.method4485(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jy.v(Lfv;III)V")
    public void method4485(class181 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3643 = arg0.method3075();
        } else if (arg1 == 2) {
            this.field3645 = arg0.method3012();
        } else if (arg1 == 5) {
            this.field3646 = false;
        } else if (arg1 == 7) {
            this.field3647 = arg0.method3075();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jy.x(II)V")
    public void method4486(int arg0) {
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
        this.field3649 = (int) (var14 * 256.0D);
        this.field3650 = (int) (var16 * 256.0D);
        if (this.field3649 < 0) {
            this.field3649 = 0;
        } else if (this.field3649 > 255) {
            this.field3649 = 255;
        }
        if (this.field3650 < 0) {
            this.field3650 = 0;
        } else if (this.field3650 > 255) {
            this.field3650 = 255;
        }
    }
}

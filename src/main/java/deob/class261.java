package deob;

@ObfuscatedName("ja")
public class class261 extends class196 {

    @ObfuscatedName("ja.h")
    public static class191 field3588 = new class191(64);

    @ObfuscatedName("ja.f")
    public int field3582 = 0;

    @ObfuscatedName("ja.p")
    public int field3587 = -1;

    @ObfuscatedName("ja.x")
    public boolean field3580 = true;

    @ObfuscatedName("ja.g")
    public int field3581 = -1;

    @ObfuscatedName("ja.c")
    public int field3577;

    @ObfuscatedName("ja.l")
    public int field3583;

    @ObfuscatedName("ja.w")
    public int field3584;

    @ObfuscatedName("ja.b")
    public int field3585;

    @ObfuscatedName("ja.o")
    public int field3586;

    @ObfuscatedName("ja.m")
    public int field3579;

    @ObfuscatedName("im.j(II)Lja;")
    public static class261 method4305(int arg0) {
        class261 var1 = (class261) field3588.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3365.method3773(4, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4343(new class175(var2), arg0);
        }
        var3.method4342();
        field3588.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ja.h(I)V")
    public void method4342() {
        if (this.field3581 != -1) {
            this.method4345(this.field3581);
            this.field3585 = this.field3577;
            this.field3586 = this.field3583;
            this.field3579 = this.field3584;
        }
        this.method4345(this.field3582);
    }

    @ObfuscatedName("ja.f(Lfb;IB)V")
    public void method4343(class175 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2903();
            if (var3 == 0) {
                return;
            }
            this.method4344(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ja.p(Lfb;IIB)V")
    public void method4344(class175 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3582 = arg0.method3070();
        } else if (arg1 == 2) {
            this.field3587 = arg0.method2903();
        } else if (arg1 == 5) {
            this.field3580 = false;
        } else if (arg1 == 7) {
            this.field3581 = arg0.method3070();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ja.x(IS)V")
    public void method4345(int arg0) {
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
        this.field3577 = (int) (var18 * 256.0D);
        this.field3583 = (int) (var14 * 256.0D);
        this.field3584 = (int) (var16 * 256.0D);
        if (this.field3583 < 0) {
            this.field3583 = 0;
        } else if (this.field3583 > 255) {
            this.field3583 = 255;
        }
        if (this.field3584 < 0) {
            this.field3584 = 0;
        } else if (this.field3584 > 255) {
            this.field3584 = 255;
        }
    }

    @ObfuscatedName("bd.g(B)V")
    public static void method1027() {
        field3588.method3259();
    }
}

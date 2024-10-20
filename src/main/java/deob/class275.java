package deob;

@ObfuscatedName("jy")
public class class275 extends class209 {

    @ObfuscatedName("jy.h")
    public static class203 field3580 = new class203(64);

    @ObfuscatedName("jy.e")
    public int field3581 = 0;

    @ObfuscatedName("jy.b")
    public int field3582 = -1;

    @ObfuscatedName("jy.l")
    public boolean field3583 = true;

    @ObfuscatedName("jy.w")
    public int field3588 = -1;

    @ObfuscatedName("jy.d")
    public int field3585;

    @ObfuscatedName("jy.n")
    public int field3591;

    @ObfuscatedName("jy.s")
    public int field3587;

    @ObfuscatedName("jy.g")
    public int field3586;

    @ObfuscatedName("jy.a")
    public int field3579;

    @ObfuscatedName("jy.r")
    public int field3590;

    @ObfuscatedName("f.f(Lie;B)V")
    public static void method14(class250 arg0) {
        Statics.field3584 = arg0;
    }

    @ObfuscatedName("cn.h(II)Ljy;")
    public static class275 method1734(int arg0) {
        class275 var1 = (class275) field3580.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3584.method4267(4, arg0);
        class275 var3 = new class275();
        if (var2 != null) {
            var3.method4822(new class185(var2), arg0);
        }
        var3.method4838();
        field3580.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jy.e(I)V")
    public void method4838() {
        if (this.field3588 != -1) {
            this.method4824(this.field3588);
            this.field3586 = this.field3585;
            this.field3579 = this.field3591;
            this.field3590 = this.field3587;
        }
        this.method4824(this.field3581);
    }

    @ObfuscatedName("jy.b(Lgx;II)V")
    public void method4822(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3323();
            if (var3 == 0) {
                return;
            }
            this.method4823(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jy.l(Lgx;III)V")
    public void method4823(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3581 = arg0.method3327();
        } else if (arg1 == 2) {
            this.field3582 = arg0.method3323();
        } else if (arg1 == 5) {
            this.field3583 = false;
        } else if (arg1 == 7) {
            this.field3588 = arg0.method3327();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jy.w(II)V")
    public void method4824(int arg0) {
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
        this.field3585 = (int) (var18 * 256.0D);
        this.field3591 = (int) (var14 * 256.0D);
        this.field3587 = (int) (var16 * 256.0D);
        if (this.field3591 < 0) {
            this.field3591 = 0;
        } else if (this.field3591 > 255) {
            this.field3591 = 255;
        }
        if (this.field3587 < 0) {
            this.field3587 = 0;
        } else if (this.field3587 > 255) {
            this.field3587 = 255;
        }
    }

    @ObfuscatedName("f.d(I)V")
    public static void method13() {
        field3580.method3725();
    }
}

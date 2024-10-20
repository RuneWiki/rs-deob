package deob;

@ObfuscatedName("jf")
public class class275 extends class209 {

    @ObfuscatedName("jf.c")
    public static class203 field3573 = new class203(64);

    @ObfuscatedName("jf.n")
    public int field3575 = 0;

    @ObfuscatedName("jf.u")
    public int field3578 = -1;

    @ObfuscatedName("jf.i")
    public boolean field3576 = true;

    @ObfuscatedName("jf.r")
    public int field3582 = -1;

    @ObfuscatedName("jf.j")
    public int field3580;

    @ObfuscatedName("jf.p")
    public int field3579;

    @ObfuscatedName("jf.e")
    public int field3583;

    @ObfuscatedName("jf.s")
    public int field3581;

    @ObfuscatedName("jf.v")
    public int field3574;

    @ObfuscatedName("jf.k")
    public int field3572;

    @ObfuscatedName("fk.y(II)Ljf;")
    public static class275 method3059(int arg0) {
        class275 var1 = (class275) field3573.method3685((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3577.method4263(4, arg0);
        class275 var3 = new class275();
        if (var2 != null) {
            var3.method4837(new class185(var2), arg0);
        }
        var3.method4851();
        field3573.method3687(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jf.c(B)V")
    public void method4851() {
        if (this.field3582 != -1) {
            this.method4839(this.field3582);
            this.field3581 = this.field3580;
            this.field3574 = this.field3579;
            this.field3572 = this.field3583;
        }
        this.method4839(this.field3575);
    }

    @ObfuscatedName("jf.n(Lge;IB)V")
    public void method4837(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3299();
            if (var3 == 0) {
                return;
            }
            this.method4838(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jf.u(Lge;IIB)V")
    public void method4838(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3575 = arg0.method3272();
        } else if (arg1 == 2) {
            this.field3578 = arg0.method3299();
        } else if (arg1 == 5) {
            this.field3576 = false;
        } else if (arg1 == 7) {
            this.field3582 = arg0.method3272();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jf.i(II)V")
    public void method4839(int arg0) {
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
        this.field3580 = (int) (var18 * 256.0D);
        this.field3579 = (int) (var14 * 256.0D);
        this.field3583 = (int) (var16 * 256.0D);
        if (this.field3579 < 0) {
            this.field3579 = 0;
        } else if (this.field3579 > 255) {
            this.field3579 = 255;
        }
        if (this.field3583 < 0) {
            this.field3583 = 0;
        } else if (this.field3583 > 255) {
            this.field3583 = 255;
        }
    }

    @ObfuscatedName("r.p(I)V")
    public static void method64() {
        field3573.method3695();
    }
}

package deob;

@ObfuscatedName("jf")
public class class269 extends class181 {

    @ObfuscatedName("jf.f")
    public static class146 field3572 = new class146(64);

    @ObfuscatedName("jf.q")
    public int field3576 = 0;

    @ObfuscatedName("jf.w")
    public int field3570 = -1;

    @ObfuscatedName("jf.o")
    public boolean field3574 = true;

    @ObfuscatedName("jf.u")
    public int field3575 = -1;

    @ObfuscatedName("jf.g")
    public int field3577;

    @ObfuscatedName("jf.l")
    public int field3571;

    @ObfuscatedName("jf.e")
    public int field3573;

    @ObfuscatedName("jf.x")
    public int field3579;

    @ObfuscatedName("jf.d")
    public int field3580;

    @ObfuscatedName("jf.k")
    public int field3581;

    @ObfuscatedName("ch.m(Lir;I)V")
    public static void method1976(class245 arg0) {
        Statics.field3578 = arg0;
    }

    @ObfuscatedName("jf.f(I)V")
    public void method4754() {
        if (this.field3575 != -1) {
            this.method4755(this.field3575);
            this.field3579 = this.field3577;
            this.field3580 = this.field3571;
            this.field3581 = this.field3573;
        }
        this.method4755(this.field3576);
    }

    @ObfuscatedName("jf.q(Lgr;II)V")
    public void method4750(class202 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3551();
            if (var3 == 0) {
                return;
            }
            this.method4751(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jf.w(Lgr;III)V")
    public void method4751(class202 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3576 = arg0.method3421();
        } else if (arg1 == 2) {
            this.field3570 = arg0.method3551();
        } else if (arg1 == 5) {
            this.field3574 = false;
        } else if (arg1 == 7) {
            this.field3575 = arg0.method3421();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jf.o(II)V")
    public void method4755(int arg0) {
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
        this.field3571 = (int) (var14 * 256.0D);
        this.field3573 = (int) (var16 * 256.0D);
        if (this.field3571 < 0) {
            this.field3571 = 0;
        } else if (this.field3571 > 255) {
            this.field3571 = 255;
        }
        if (this.field3573 < 0) {
            this.field3573 = 0;
        } else if (this.field3573 > 255) {
            this.field3573 = 255;
        }
    }

    @ObfuscatedName("o.u(I)V")
    public static void method38() {
        field3572.method3010();
    }
}

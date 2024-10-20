package deob;

@ObfuscatedName("ir")
public class class260 extends class195 {

    @ObfuscatedName("ir.o")
    public static class190 field3580 = new class190(64);

    @ObfuscatedName("ir.m")
    public int field3569 = 0;

    @ObfuscatedName("ir.g")
    public int field3570 = -1;

    @ObfuscatedName("ir.d")
    public boolean field3571 = true;

    @ObfuscatedName("ir.b")
    public int field3568 = -1;

    @ObfuscatedName("ir.k")
    public int field3573;

    @ObfuscatedName("ir.f")
    public int field3574;

    @ObfuscatedName("ir.j")
    public int field3572;

    @ObfuscatedName("ir.q")
    public int field3576;

    @ObfuscatedName("ir.h")
    public int field3567;

    @ObfuscatedName("ir.i")
    public int field3578;

    @ObfuscatedName("w.e(Lin;I)V")
    public static void method96(class236 arg0) {
        Statics.field3575 = arg0;
    }

    @ObfuscatedName("iq.o(II)Lir;")
    public static class260 method3909(int arg0) {
        class260 var1 = (class260) field3580.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3575.method3760(4, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4310(new class174(var2), arg0);
        }
        var3.method4320();
        field3580.method3250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.m(B)V")
    public void method4320() {
        if (this.field3568 != -1) {
            this.method4328(this.field3568);
            this.field3576 = this.field3573;
            this.field3567 = this.field3574;
            this.field3578 = this.field3572;
        }
        this.method4328(this.field3569);
    }

    @ObfuscatedName("ir.g(Lfw;II)V")
    public void method4310(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2891();
            if (var3 == 0) {
                return;
            }
            this.method4311(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ir.d(Lfw;III)V")
    public void method4311(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3569 = arg0.method2890();
        } else if (arg1 == 2) {
            this.field3570 = arg0.method2891();
        } else if (arg1 == 5) {
            this.field3571 = false;
        } else if (arg1 == 7) {
            this.field3568 = arg0.method2890();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ir.b(II)V")
    public void method4328(int arg0) {
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
        this.field3573 = (int) (var18 * 256.0D);
        this.field3574 = (int) (var14 * 256.0D);
        this.field3572 = (int) (var16 * 256.0D);
        if (this.field3574 < 0) {
            this.field3574 = 0;
        } else if (this.field3574 > 255) {
            this.field3574 = 255;
        }
        if (this.field3572 < 0) {
            this.field3572 = 0;
        } else if (this.field3572 > 255) {
            this.field3572 = 255;
        }
    }

    @ObfuscatedName("hz.k(I)V")
    public static void method3745() {
        field3580.method3247();
    }
}

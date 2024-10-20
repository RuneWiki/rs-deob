package deob;

@ObfuscatedName("ju")
public class class275 extends class209 {

    @ObfuscatedName("ju.q")
    public static class203 field3570 = new class203(64);

    @ObfuscatedName("ju.m")
    public int field3571 = 0;

    @ObfuscatedName("ju.j")
    public int field3576 = -1;

    @ObfuscatedName("ju.g")
    public boolean field3573 = true;

    @ObfuscatedName("ju.i")
    public int field3574 = -1;

    @ObfuscatedName("ju.h")
    public int field3569;

    @ObfuscatedName("ju.l")
    public int field3572;

    @ObfuscatedName("ju.d")
    public int field3577;

    @ObfuscatedName("ju.o")
    public int field3578;

    @ObfuscatedName("ju.s")
    public int field3575;

    @ObfuscatedName("ju.k")
    public int field3580;

    @ObfuscatedName("fr.c(IB)Lju;")
    public static class275 method3141(int arg0) {
        class275 var1 = (class275) field3570.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3579.method4210(4, arg0);
        class275 var3 = new class275();
        if (var2 != null) {
            var3.method4842(new class185(var2), arg0);
        }
        var3.method4845();
        field3570.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ju.q(S)V")
    public void method4845() {
        if (this.field3574 != -1) {
            this.method4833(this.field3574);
            this.field3578 = this.field3569;
            this.field3575 = this.field3572;
            this.field3580 = this.field3577;
        }
        this.method4833(this.field3571);
    }

    @ObfuscatedName("ju.m(Lgg;II)V")
    public void method4842(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3243();
            if (var3 == 0) {
                return;
            }
            this.method4832(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ju.j(Lgg;IIB)V")
    public void method4832(class185 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3571 = arg0.method3247();
        } else if (arg1 == 2) {
            this.field3576 = arg0.method3243();
        } else if (arg1 == 5) {
            this.field3573 = false;
        } else if (arg1 == 7) {
            this.field3574 = arg0.method3247();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ju.g(IB)V")
    public void method4833(int arg0) {
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
        this.field3569 = (int) (var18 * 256.0D);
        this.field3572 = (int) (var14 * 256.0D);
        this.field3577 = (int) (var16 * 256.0D);
        if (this.field3572 < 0) {
            this.field3572 = 0;
        } else if (this.field3572 > 255) {
            this.field3572 = 255;
        }
        if (this.field3577 < 0) {
            this.field3577 = 0;
        } else if (this.field3577 > 255) {
            this.field3577 = 255;
        }
    }

    @ObfuscatedName("cq.i(I)V")
    public static void method1687() {
        field3570.method3647();
    }
}

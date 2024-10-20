package deob;

@ObfuscatedName("io")
public class class260 extends class195 {

    @ObfuscatedName("io.o")
    public static class190 field3565 = new class190(64);

    @ObfuscatedName("io.i")
    public int field3566 = 0;

    @ObfuscatedName("io.u")
    public int field3567 = -1;

    @ObfuscatedName("io.g")
    public boolean field3568 = true;

    @ObfuscatedName("io.m")
    public int field3564 = -1;

    @ObfuscatedName("io.s")
    public int field3570;

    @ObfuscatedName("io.x")
    public int field3578;

    @ObfuscatedName("io.p")
    public int field3574;

    @ObfuscatedName("io.k")
    public int field3573;

    @ObfuscatedName("io.r")
    public int field3572;

    @ObfuscatedName("io.w")
    public int field3575;

    @ObfuscatedName("fg.c(IS)Lio;")
    public static class260 method2681(int arg0) {
        class260 var1 = (class260) field3565.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3571.method3741(4, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4243(new class174(var2), arg0);
        }
        var3.method4246();
        field3565.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.o(B)V")
    public void method4246() {
        if (this.field3564 != -1) {
            this.method4245(this.field3564);
            this.field3573 = this.field3570;
            this.field3572 = this.field3578;
            this.field3575 = this.field3574;
        }
        this.method4245(this.field3566);
    }

    @ObfuscatedName("io.i(Lfp;II)V")
    public void method4243(class174 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2843();
            if (var3 == 0) {
                return;
            }
            this.method4244(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("io.u(Lfp;III)V")
    public void method4244(class174 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3566 = arg0.method2994();
        } else if (arg1 == 2) {
            this.field3567 = arg0.method2843();
        } else if (arg1 == 5) {
            this.field3568 = false;
        } else if (arg1 == 7) {
            this.field3564 = arg0.method2994();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("io.g(IB)V")
    public void method4245(int arg0) {
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
        this.field3570 = (int) (var18 * 256.0D);
        this.field3578 = (int) (var14 * 256.0D);
        this.field3574 = (int) (var16 * 256.0D);
        if (this.field3578 < 0) {
            this.field3578 = 0;
        } else if (this.field3578 > 255) {
            this.field3578 = 255;
        }
        if (this.field3574 < 0) {
            this.field3574 = 0;
        } else if (this.field3574 > 255) {
            this.field3574 = 255;
        }
    }

    @ObfuscatedName("cm.m(B)V")
    public static void method1366() {
        field3565.method3223();
    }
}

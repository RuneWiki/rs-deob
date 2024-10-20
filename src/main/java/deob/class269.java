package deob;

@ObfuscatedName("jp")
public class class269 extends class185 {

    @ObfuscatedName("jp.b")
    public static class155 field3523 = new class155(64);

    @ObfuscatedName("jp.l")
    public int field3528 = 0;

    @ObfuscatedName("jp.m")
    public int field3525 = -1;

    @ObfuscatedName("jp.z")
    public boolean field3527 = true;

    @ObfuscatedName("jp.q")
    public int field3533 = -1;

    @ObfuscatedName("jp.k")
    public int field3526;

    @ObfuscatedName("jp.c")
    public int field3529;

    @ObfuscatedName("jp.u")
    public int field3530;

    @ObfuscatedName("jp.t")
    public int field3531;

    @ObfuscatedName("jp.e")
    public int field3532;

    @ObfuscatedName("jp.o")
    public int field3524;

    @ObfuscatedName("bz.f(IB)Ljp;")
    public static class269 method1660(int arg0) {
        class269 var1 = (class269) field3523.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3522.method3905(4, arg0);
        class269 var3 = new class269();
        if (var2 != null) {
            var3.method4509(new class311(var2), arg0);
        }
        var3.method4504();
        field3523.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jp.b(I)V")
    public void method4504() {
        if (this.field3533 != -1) {
            this.method4507(this.field3533);
            this.field3531 = this.field3526;
            this.field3532 = this.field3529;
            this.field3524 = this.field3530;
        }
        this.method4507(this.field3528);
    }

    @ObfuscatedName("jp.l(Lkb;IB)V")
    public void method4509(class311 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5276();
            if (var3 == 0) {
                return;
            }
            this.method4506(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jp.m(Lkb;III)V")
    public void method4506(class311 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3528 = arg0.method5184();
        } else if (arg1 == 2) {
            this.field3525 = arg0.method5276();
        } else if (arg1 == 5) {
            this.field3527 = false;
        } else if (arg1 == 7) {
            this.field3533 = arg0.method5184();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jp.z(IS)V")
    public void method4507(int arg0) {
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
        this.field3526 = (int) (var18 * 256.0D);
        this.field3529 = (int) (var14 * 256.0D);
        this.field3530 = (int) (var16 * 256.0D);
        if (this.field3529 < 0) {
            this.field3529 = 0;
        } else if (this.field3529 > 255) {
            this.field3529 = 255;
        }
        if (this.field3530 < 0) {
            this.field3530 = 0;
        } else if (this.field3530 > 255) {
            this.field3530 = 255;
        }
    }
}

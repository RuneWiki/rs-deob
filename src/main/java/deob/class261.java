package deob;

@ObfuscatedName("jh")
public class class261 extends class196 {

    @ObfuscatedName("jh.n")
    public static class191 field3582 = new class191(64);

    @ObfuscatedName("jh.g")
    public int field3583 = 0;

    @ObfuscatedName("jh.y")
    public int field3590 = -1;

    @ObfuscatedName("jh.w")
    public boolean field3585 = true;

    @ObfuscatedName("jh.k")
    public int field3586 = -1;

    @ObfuscatedName("jh.v")
    public int field3587;

    @ObfuscatedName("jh.z")
    public int field3588;

    @ObfuscatedName("jh.r")
    public int field3589;

    @ObfuscatedName("jh.u")
    public int field3584;

    @ObfuscatedName("jh.d")
    public int field3592;

    @ObfuscatedName("jh.o")
    public int field3581;

    @ObfuscatedName("hr.e(II)Ljh;")
    public static class261 method3795(int arg0) {
        class261 var1 = (class261) field3582.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3591.method3817(4, arg0);
        class261 var3 = new class261();
        if (var2 != null) {
            var3.method4382(new class175(var2), arg0);
        }
        var3.method4381();
        field3582.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.n(I)V")
    public void method4381() {
        if (this.field3586 != -1) {
            this.method4384(this.field3586);
            this.field3584 = this.field3587;
            this.field3592 = this.field3588;
            this.field3581 = this.field3589;
        }
        this.method4384(this.field3583);
    }

    @ObfuscatedName("jh.g(Lfh;IB)V")
    public void method4382(class175 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2928();
            if (var3 == 0) {
                return;
            }
            this.method4383(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("jh.y(Lfh;III)V")
    public void method4383(class175 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3583 = arg0.method2932();
        } else if (arg1 == 2) {
            this.field3590 = arg0.method2928();
        } else if (arg1 == 5) {
            this.field3585 = false;
        } else if (arg1 == 7) {
            this.field3586 = arg0.method2932();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("jh.w(IB)V")
    public void method4384(int arg0) {
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
        this.field3587 = (int) (var18 * 256.0D);
        this.field3588 = (int) (var14 * 256.0D);
        this.field3589 = (int) (var16 * 256.0D);
        if (this.field3588 < 0) {
            this.field3588 = 0;
        } else if (this.field3588 > 255) {
            this.field3588 = 255;
        }
        if (this.field3589 < 0) {
            this.field3589 = 0;
        } else if (this.field3589 > 255) {
            this.field3589 = 255;
        }
    }

    @ObfuscatedName("g.k(B)V")
    public static void method1() {
        field3582.method3282();
    }
}

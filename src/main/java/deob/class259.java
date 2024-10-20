package deob;

@ObfuscatedName("ig")
public class class259 extends class176 {

    @ObfuscatedName("ig.t")
    public static class146 field3502 = new class146(64);

    @ObfuscatedName("ig.o")
    public int field3498 = 0;

    @ObfuscatedName("ig.e")
    public int field3507 = -1;

    @ObfuscatedName("ig.i")
    public boolean field3501 = true;

    @ObfuscatedName("ig.g")
    public int field3500 = -1;

    @ObfuscatedName("ig.d")
    public int field3503;

    @ObfuscatedName("ig.l")
    public int field3504;

    @ObfuscatedName("ig.j")
    public int field3505;

    @ObfuscatedName("ig.m")
    public int field3499;

    @ObfuscatedName("ig.p")
    public int field3506;

    @ObfuscatedName("ig.h")
    public int field3508;

    @ObfuscatedName("bp.c(II)Lig;")
    public static class259 method1023(int arg0) {
        class259 var1 = (class259) field3502.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3497.method3845(4, arg0);
        class259 var3 = new class259();
        if (var2 != null) {
            var3.method4419(new class301(var2), arg0);
        }
        var3.method4428();
        field3502.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.t(I)V")
    public void method4428() {
        if (this.field3500 != -1) {
            this.method4417(this.field3500);
            this.field3499 = this.field3503;
            this.field3506 = this.field3504;
            this.field3508 = this.field3505;
        }
        this.method4417(this.field3498);
    }

    @ObfuscatedName("ig.o(Lkp;IB)V")
    public void method4419(class301 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5129();
            if (var3 == 0) {
                return;
            }
            this.method4420(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ig.e(Lkp;IIB)V")
    public void method4420(class301 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3498 = arg0.method5133();
        } else if (arg1 == 2) {
            this.field3507 = arg0.method5129();
        } else if (arg1 == 5) {
            this.field3501 = false;
        } else if (arg1 == 7) {
            this.field3500 = arg0.method5133();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ig.i(II)V")
    public void method4417(int arg0) {
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
        this.field3503 = (int) (var18 * 256.0D);
        this.field3504 = (int) (var14 * 256.0D);
        this.field3505 = (int) (var16 * 256.0D);
        if (this.field3504 < 0) {
            this.field3504 = 0;
        } else if (this.field3504 > 255) {
            this.field3504 = 255;
        }
        if (this.field3505 < 0) {
            this.field3505 = 0;
        } else if (this.field3505 > 255) {
            this.field3505 = 255;
        }
    }

    @ObfuscatedName("ec.g(I)V")
    public static void method2888() {
        field3502.method3103();
    }
}

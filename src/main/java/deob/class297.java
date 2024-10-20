package deob;

@ObfuscatedName("ke")
public class class297 extends class346 {

    @ObfuscatedName("ke.o")
    public static class199 field3697 = new class199(64);

    @ObfuscatedName("ke.u")
    public int field3705 = 0;

    @ObfuscatedName("ke.p")
    public int field3699 = -1;

    @ObfuscatedName("ke.b")
    public boolean field3700 = true;

    @ObfuscatedName("ke.e")
    public int field3701 = -1;

    @ObfuscatedName("ke.k")
    public int field3702;

    @ObfuscatedName("ke.g")
    public int field3703;

    @ObfuscatedName("ke.h")
    public int field3704;

    @ObfuscatedName("ke.n")
    public int field3706;

    @ObfuscatedName("ke.l")
    public int field3698;

    @ObfuscatedName("ke.m")
    public int field3696;

    @ObfuscatedName("cg.f(II)Lke;")
    public static class297 method1709(int arg0) {
        class297 var1 = (class297) field3697.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3707.method3933(4, arg0);
        class297 var3 = new class297();
        if (var2 != null) {
            var3.method4722(new class382(var2), arg0);
        }
        var3.method4727();
        field3697.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ke.o(B)V")
    public void method4727() {
        if (this.field3701 != -1) {
            this.method4720(this.field3701);
            this.field3706 = this.field3702;
            this.field3698 = this.field3703;
            this.field3696 = this.field3704;
        }
        this.method4720(this.field3705);
    }

    @ObfuscatedName("ke.u(Lnu;IB)V")
    public void method4722(class382 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5856();
            if (var3 == 0) {
                return;
            }
            this.method4723(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ke.p(Lnu;III)V")
    public void method4723(class382 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3705 = arg0.method5875();
        } else if (arg1 == 2) {
            this.field3699 = arg0.method5856();
        } else if (arg1 == 5) {
            this.field3700 = false;
        } else if (arg1 == 7) {
            this.field3701 = arg0.method5875();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ke.b(II)V")
    public void method4720(int arg0) {
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
        this.field3702 = (int) (var18 * 256.0D);
        this.field3703 = (int) (var14 * 256.0D);
        this.field3704 = (int) (var16 * 256.0D);
        if (this.field3703 < 0) {
            this.field3703 = 0;
        } else if (this.field3703 > 255) {
            this.field3703 = 255;
        }
        if (this.field3704 < 0) {
            this.field3704 = 0;
        } else if (this.field3704 > 255) {
            this.field3704 = 255;
        }
    }

    @ObfuscatedName("bm.e(B)V")
    public static void method968() {
        field3697.method3392();
    }
}

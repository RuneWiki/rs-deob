package deob;

@ObfuscatedName("ky")
public class class290 extends class346 {

    @ObfuscatedName("ky.o")
    public static class199 field3538 = new class199(64);

    @ObfuscatedName("ky.u")
    public int field3544 = 0;

    @ObfuscatedName("ky.p")
    public int field3539;

    @ObfuscatedName("ky.b")
    public int field3542;

    @ObfuscatedName("ky.e")
    public int field3543;

    @ObfuscatedName("ky.k")
    public int field3541;

    @ObfuscatedName("f.f(Lir;I)V")
    public static void method14(class253 arg0) {
        Statics.field3540 = arg0;
    }

    @ObfuscatedName("ch.o(II)Lky;")
    public static class290 method1770(int arg0) {
        class290 var1 = (class290) field3538.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3540.method3933(1, arg0);
        class290 var3 = new class290();
        if (var2 != null) {
            var3.method4487(new class382(var2), arg0);
        }
        var3.method4484();
        field3538.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ky.u(I)V")
    public void method4484() {
        this.method4488(this.field3544);
    }

    @ObfuscatedName("ky.p(Lnu;II)V")
    public void method4487(class382 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5856();
            if (var3 == 0) {
                return;
            }
            this.method4493(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ky.b(Lnu;III)V")
    public void method4493(class382 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3544 = arg0.method5875();
        }
    }

    @ObfuscatedName("ky.e(IB)V")
    public void method4488(int arg0) {
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
        this.field3542 = (int) (var14 * 256.0D);
        this.field3543 = (int) (var16 * 256.0D);
        if (this.field3542 < 0) {
            this.field3542 = 0;
        } else if (this.field3542 > 255) {
            this.field3542 = 255;
        }
        if (this.field3543 < 0) {
            this.field3543 = 0;
        } else if (this.field3543 > 255) {
            this.field3543 = 255;
        }
        if (var16 > 0.5D) {
            this.field3541 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3541 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3541 < 1) {
            this.field3541 = 1;
        }
        this.field3539 = (int) ((double) this.field3541 * var18);
    }
}

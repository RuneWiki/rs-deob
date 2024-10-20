package deob;

@ObfuscatedName("iu")
public class class248 extends class196 {

    @ObfuscatedName("iu.h")
    public static class191 field3329 = new class191(64);

    @ObfuscatedName("iu.f")
    public int field3330 = 0;

    @ObfuscatedName("iu.p")
    public int field3333;

    @ObfuscatedName("iu.x")
    public int field3328;

    @ObfuscatedName("iu.g")
    public int field3332;

    @ObfuscatedName("iu.c")
    public int field3334;

    @ObfuscatedName("ae.j(Lia;B)V")
    public static void method466(class237 arg0) {
        Statics.field3331 = arg0;
    }

    @ObfuscatedName("bj.h(IB)Liu;")
    public static class248 method960(int arg0) {
        class248 var1 = (class248) field3329.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3331.method3773(1, arg0);
        class248 var3 = new class248();
        if (var2 != null) {
            var3.method4018(new class175(var2), arg0);
        }
        var3.method4021();
        field3329.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.f(I)V")
    public void method4021() {
        this.method4020(this.field3330);
    }

    @ObfuscatedName("iu.p(Lfb;II)V")
    public void method4018(class175 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2903();
            if (var3 == 0) {
                return;
            }
            this.method4016(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("iu.x(Lfb;IIB)V")
    public void method4016(class175 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3330 = arg0.method3070();
        }
    }

    @ObfuscatedName("iu.g(II)V")
    public void method4020(int arg0) {
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
        this.field3328 = (int) (var14 * 256.0D);
        this.field3332 = (int) (var16 * 256.0D);
        if (this.field3328 < 0) {
            this.field3328 = 0;
        } else if (this.field3328 > 255) {
            this.field3328 = 255;
        }
        if (this.field3332 < 0) {
            this.field3332 = 0;
        } else if (this.field3332 > 255) {
            this.field3332 = 255;
        }
        if (var16 > 0.5D) {
            this.field3334 = (int) ((1.0D - var16) * var14 * 512.0D);
        } else {
            this.field3334 = (int) (var14 * var16 * 512.0D);
        }
        if (this.field3334 < 1) {
            this.field3334 = 1;
        }
        this.field3333 = (int) ((double) this.field3334 * var18);
    }

    @ObfuscatedName("y.c(I)V")
    public static void method151() {
        field3329.method3259();
    }
}

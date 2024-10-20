package deob;

@ObfuscatedName("ib")
public class class258 extends class183 {

    @ObfuscatedName("ib.i")
    public static class155 field3467 = new class155(64);

    @ObfuscatedName("ib.y")
    public int field3468 = 0;

    @ObfuscatedName("ib.w")
    public int field3471 = -1;

    @ObfuscatedName("ib.p")
    public boolean field3470 = true;

    @ObfuscatedName("ib.b")
    public int field3475 = -1;

    @ObfuscatedName("ib.e")
    public int field3473;

    @ObfuscatedName("ib.x")
    public int field3466;

    @ObfuscatedName("ib.a")
    public int field3474;

    @ObfuscatedName("ib.d")
    public int field3472;

    @ObfuscatedName("ib.c")
    public int field3476;

    @ObfuscatedName("ib.o")
    public int field3477;

    @ObfuscatedName("lg.f(Lhz;I)V")
    public static void method5621(class234 arg0) {
        Statics.field3469 = arg0;
    }

    @ObfuscatedName("ce.i(IB)Lib;")
    public static class258 method2052(int arg0) {
        class258 var1 = (class258) field3467.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3469.method3752(4, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4386(new class300(var2), arg0);
        }
        var3.method4383();
        field3467.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.y(B)V")
    public void method4383() {
        if (this.field3475 != -1) {
            this.method4382(this.field3475);
            this.field3472 = this.field3473;
            this.field3476 = this.field3466;
            this.field3477 = this.field3474;
        }
        this.method4382(this.field3468);
    }

    @ObfuscatedName("ib.w(Lkq;IB)V")
    public void method4386(class300 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method5110();
            if (var3 == 0) {
                return;
            }
            this.method4390(arg0, var3, arg1);
        }
    }

    @ObfuscatedName("ib.p(Lkq;IIB)V")
    public void method4390(class300 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field3468 = arg0.method5226();
        } else if (arg1 == 2) {
            this.field3471 = arg0.method5110();
        } else if (arg1 == 5) {
            this.field3470 = false;
        } else if (arg1 == 7) {
            this.field3475 = arg0.method5226();
        } else if (arg1 == 8) {
        }
    }

    @ObfuscatedName("ib.b(IB)V")
    public void method4382(int arg0) {
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
        this.field3473 = (int) (var18 * 256.0D);
        this.field3466 = (int) (var14 * 256.0D);
        this.field3474 = (int) (var16 * 256.0D);
        if (this.field3466 < 0) {
            this.field3466 = 0;
        } else if (this.field3466 > 255) {
            this.field3466 = 255;
        }
        if (this.field3474 < 0) {
            this.field3474 = 0;
        } else if (this.field3474 > 255) {
            this.field3474 = 255;
        }
    }

    @ObfuscatedName("fz.e(I)V")
    public static void method3283() {
        field3467.method3102();
    }
}

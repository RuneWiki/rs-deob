package deob;

@ObfuscatedName("iv")
public class class253 extends class202 {

    @ObfuscatedName("iv.i")
    public static class197 field3379 = new class197(64);

    @ObfuscatedName("iv.j")
    public static class197 field3384 = new class197(30);

    @ObfuscatedName("iv.v")
    public int field3385;

    @ObfuscatedName("iv.x")
    public int field3383;

    @ObfuscatedName("iv.e")
    public int field3387 = -1;

    @ObfuscatedName("iv.l")
    public short[] field3380;

    @ObfuscatedName("iv.b")
    public short[] field3386;

    @ObfuscatedName("iv.n")
    public short[] field3381;

    @ObfuscatedName("iv.c")
    public short[] field3388;

    @ObfuscatedName("iv.a")
    public int field3389 = 128;

    @ObfuscatedName("iv.y")
    public int field3390 = 128;

    @ObfuscatedName("iv.w")
    public int field3382 = 0;

    @ObfuscatedName("iv.k")
    public int field3392 = 0;

    @ObfuscatedName("iv.t")
    public int field3393 = 0;

    @ObfuscatedName("fb.m(Lik;Lik;I)V")
    public static void method2979(class243 arg0, class243 arg1) {
        Statics.field313 = arg0;
        Statics.field3391 = arg1;
    }

    @ObfuscatedName("jw.p(II)Liv;")
    public static class253 method4750(int arg0) {
        class253 var1 = (class253) field3379.method3419((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field313.method3930(13, arg0);
        class253 var3 = new class253();
        var3.field3385 = arg0;
        if (var2 != null) {
            var3.method4152(new class181(var2));
        }
        field3379.method3418(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.i(Lfv;I)V")
    public void method4152(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4153(arg0, var2);
        }
    }

    @ObfuscatedName("iv.j(Lfv;II)V")
    public void method4153(class181 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3383 = arg0.method3009();
        } else if (arg1 == 2) {
            this.field3387 = arg0.method3009();
        } else if (arg1 == 4) {
            this.field3389 = arg0.method3009();
        } else if (arg1 == 5) {
            this.field3390 = arg0.method3009();
        } else if (arg1 == 6) {
            this.field3382 = arg0.method3009();
        } else if (arg1 == 7) {
            this.field3392 = arg0.method3012();
        } else if (arg1 == 8) {
            this.field3393 = arg0.method3012();
        } else if (arg1 == 40) {
            int var3 = arg0.method3012();
            this.field3380 = new short[var3];
            this.field3386 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3380[var4] = (short) arg0.method3009();
                this.field3386[var4] = (short) arg0.method3009();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3012();
            this.field3381 = new short[var5];
            this.field3388 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3381[var6] = (short) arg0.method3009();
                this.field3388[var6] = (short) arg0.method3009();
            }
        }
    }

    @ObfuscatedName("iv.v(II)Len;")
    public final class133 method4154(int arg0) {
        class133 var2 = (class133) field3384.method3419((long) this.field3385);
        if (var2 == null) {
            class127 var3 = class127.method2302(Statics.field3391, this.field3383, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3380 != null) {
                for (int var4 = 0; var4 < this.field3380.length; var4++) {
                    var3.method2360(this.field3380[var4], this.field3386[var4]);
                }
            }
            if (this.field3381 != null) {
                for (int var5 = 0; var5 < this.field3381.length; var5++) {
                    var3.method2305(this.field3381[var5], this.field3388[var5]);
                }
            }
            var2 = var3.method2335(this.field3392 + 64, this.field3393 + 850, -30, -50, -30);
            field3384.method3418(var2, (long) this.field3385);
        }
        class133 var6;
        if (this.field3387 == -1 || arg0 == -1) {
            var6 = var2.method2382(true);
        } else {
            var6 = class268.method2289(this.field3387).method4508(var2, arg0);
        }
        if (this.field3389 != 128 || this.field3390 != 128) {
            var6.method2397(this.field3389, this.field3390, this.field3389);
        }
        if (this.field3382 != 0) {
            if (this.field3382 == 90) {
                var6.method2446();
            }
            if (this.field3382 == 180) {
                var6.method2446();
                var6.method2446();
            }
            if (this.field3382 == 270) {
                var6.method2446();
                var6.method2446();
                var6.method2446();
            }
        }
        return var6;
    }
}

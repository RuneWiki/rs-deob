package deob;

@ObfuscatedName("iz")
public class class256 extends class202 {

    @ObfuscatedName("iz.i")
    public static class197 field3417 = new class197(64);

    @ObfuscatedName("iz.j")
    public static class197 field3424 = new class197(64);

    @ObfuscatedName("iz.v")
    public int field3420;

    @ObfuscatedName("iz.l")
    public int field3423 = 255;

    @ObfuscatedName("iz.b")
    public int field3426 = 255;

    @ObfuscatedName("iz.n")
    public int field3416 = -1;

    @ObfuscatedName("iz.c")
    public int field3428 = 1;

    @ObfuscatedName("iz.a")
    public int field3427 = 70;

    @ObfuscatedName("iz.y")
    public int field3418 = -1;

    @ObfuscatedName("iz.w")
    public int field3429 = -1;

    @ObfuscatedName("iz.k")
    public int field3430 = 30;

    @ObfuscatedName("iz.t")
    public int field3431 = 0;

    @ObfuscatedName("el.m(Lik;Lik;I)V")
    public static void method2734(class243 arg0, class243 arg1) {
        Statics.field3421 = arg0;
        Statics.field3422 = arg1;
    }

    @ObfuscatedName("iz.p(Lfv;B)V")
    public void method4206(class181 arg0) {
        while (true) {
            int var2 = arg0.method3012();
            if (var2 == 0) {
                return;
            }
            this.method4207(arg0, var2);
        }
    }

    @ObfuscatedName("iz.i(Lfv;II)V")
    public void method4207(class181 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3009();
        } else if (arg1 == 2) {
            this.field3423 = arg0.method3012();
        } else if (arg1 == 3) {
            this.field3426 = arg0.method3012();
        } else if (arg1 == 4) {
            this.field3416 = 0;
        } else if (arg1 == 5) {
            this.field3427 = arg0.method3009();
        } else if (arg1 == 6) {
            arg0.method3012();
        } else if (arg1 == 7) {
            this.field3418 = arg0.method3028();
        } else if (arg1 == 8) {
            this.field3429 = arg0.method3028();
        } else if (arg1 == 11) {
            this.field3416 = arg0.method3009();
        } else if (arg1 == 14) {
            this.field3430 = arg0.method3012();
        } else if (arg1 == 15) {
            this.field3431 = arg0.method3012();
        }
    }

    @ObfuscatedName("iz.j(B)Lkd;")
    public class295 method4208() {
        if (this.field3418 < 0) {
            return null;
        }
        class295 var1 = (class295) field3424.method3419((long) this.field3418);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method166(Statics.field3422, this.field3418, 0);
        if (var2 != null) {
            field3424.method3418(var2, (long) this.field3418);
        }
        return var2;
    }

    @ObfuscatedName("iz.v(I)Lkd;")
    public class295 method4218() {
        if (this.field3429 < 0) {
            return null;
        }
        class295 var1 = (class295) field3424.method3419((long) this.field3429);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method166(Statics.field3422, this.field3429, 0);
        if (var2 != null) {
            field3424.method3418(var2, (long) this.field3429);
        }
        return var2;
    }

    @ObfuscatedName("q.x(I)V")
    public static void method192() {
        field3417.method3423();
        field3424.method3423();
    }
}

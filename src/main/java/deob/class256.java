package deob;

@ObfuscatedName("is")
public class class256 extends class202 {

    @ObfuscatedName("is.k")
    public static class197 field3433 = new class197(64);

    @ObfuscatedName("is.z")
    public static class197 field3434 = new class197(64);

    @ObfuscatedName("is.v")
    public int field3440;

    @ObfuscatedName("is.t")
    public int field3445 = 255;

    @ObfuscatedName("is.p")
    public int field3438 = 255;

    @ObfuscatedName("is.r")
    public int field3439 = -1;

    @ObfuscatedName("is.l")
    public int field3437 = 1;

    @ObfuscatedName("is.u")
    public int field3441 = 70;

    @ObfuscatedName("is.n")
    public int field3442 = -1;

    @ObfuscatedName("is.c")
    public int field3435 = -1;

    @ObfuscatedName("is.y")
    public int field3444 = 30;

    @ObfuscatedName("is.j")
    public int field3432 = 0;

    @ObfuscatedName("fp.d(Lid;Lid;I)V")
    public static void method2936(class243 arg0, class243 arg1) {
        Statics.field3443 = arg0;
        Statics.field865 = arg1;
    }

    @ObfuscatedName("is.x(Lfr;I)V")
    public void method4204(class181 arg0) {
        while (true) {
            int var2 = arg0.method3204();
            if (var2 == 0) {
                return;
            }
            this.method4211(arg0, var2);
        }
    }

    @ObfuscatedName("is.k(Lfr;II)V")
    public void method4211(class181 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3179();
        } else if (arg1 == 2) {
            this.field3445 = arg0.method3204();
        } else if (arg1 == 3) {
            this.field3438 = arg0.method3204();
        } else if (arg1 == 4) {
            this.field3439 = 0;
        } else if (arg1 == 5) {
            this.field3441 = arg0.method3179();
        } else if (arg1 == 6) {
            arg0.method3204();
        } else if (arg1 == 7) {
            this.field3442 = arg0.method3184();
        } else if (arg1 == 8) {
            this.field3435 = arg0.method3184();
        } else if (arg1 == 11) {
            this.field3439 = arg0.method3179();
        } else if (arg1 == 14) {
            this.field3444 = arg0.method3204();
        } else if (arg1 == 15) {
            this.field3432 = arg0.method3204();
        }
    }

    @ObfuscatedName("is.z(I)Lky;")
    public class295 method4206() {
        if (this.field3442 < 0) {
            return null;
        }
        class295 var1 = (class295) field3434.method3418((long) this.field3442);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method4769(Statics.field865, this.field3442, 0);
        if (var2 != null) {
            field3434.method3417(var2, (long) this.field3442);
        }
        return var2;
    }

    @ObfuscatedName("is.v(I)Lky;")
    public class295 method4207() {
        if (this.field3435 < 0) {
            return null;
        }
        class295 var1 = (class295) field3434.method3418((long) this.field3435);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method4769(Statics.field865, this.field3435, 0);
        if (var2 != null) {
            field3434.method3417(var2, (long) this.field3435);
        }
        return var2;
    }

    @ObfuscatedName("gm.m(I)V")
    public static void method3264() {
        field3433.method3422();
        field3434.method3422();
    }
}

package deob;

@ObfuscatedName("iv")
public class class256 extends class202 {

    @ObfuscatedName("iv.r")
    public static class197 field3425 = new class197(64);

    @ObfuscatedName("iv.g")
    public static class197 field3419 = new class197(64);

    @ObfuscatedName("iv.x")
    public int field3415;

    @ObfuscatedName("iv.t")
    public int field3416 = 255;

    @ObfuscatedName("iv.k")
    public int field3417 = 255;

    @ObfuscatedName("iv.n")
    public int field3418 = -1;

    @ObfuscatedName("iv.d")
    public int field3413 = 1;

    @ObfuscatedName("iv.o")
    public int field3412 = 70;

    @ObfuscatedName("iv.a")
    public int field3421 = -1;

    @ObfuscatedName("iv.q")
    public int field3420 = -1;

    @ObfuscatedName("iv.j")
    public int field3423 = 30;

    @ObfuscatedName("iv.m")
    public int field3424 = 0;

    @ObfuscatedName("dv.b(II)Liv;")
    public static class256 method2218(int arg0) {
        class256 var1 = (class256) field3425.method3330((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3414.method3887(33, arg0);
        class256 var3 = new class256();
        if (var2 != null) {
            var3.method4086(new class181(var2));
        }
        field3425.method3332(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.s(Lfs;I)V")
    public void method4086(class181 arg0) {
        while (true) {
            int var2 = arg0.method2945();
            if (var2 == 0) {
                return;
            }
            this.method4084(arg0, var2);
        }
    }

    @ObfuscatedName("iv.r(Lfs;II)V")
    public void method4084(class181 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3081();
        } else if (arg1 == 2) {
            this.field3416 = arg0.method2945();
        } else if (arg1 == 3) {
            this.field3417 = arg0.method2945();
        } else if (arg1 == 4) {
            this.field3418 = 0;
        } else if (arg1 == 5) {
            this.field3412 = arg0.method3081();
        } else if (arg1 == 6) {
            arg0.method2945();
        } else if (arg1 == 7) {
            this.field3421 = arg0.method2960();
        } else if (arg1 == 8) {
            this.field3420 = arg0.method2960();
        } else if (arg1 == 11) {
            this.field3418 = arg0.method3081();
        } else if (arg1 == 14) {
            this.field3423 = arg0.method2945();
        } else if (arg1 == 15) {
            this.field3424 = arg0.method2945();
        }
    }

    @ObfuscatedName("iv.g(B)Lkb;")
    public class295 method4082() {
        if (this.field3421 < 0) {
            return null;
        }
        class295 var1 = (class295) field3419.method3330((long) this.field3421);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method2845(Statics.field295, this.field3421, 0);
        if (var2 != null) {
            field3419.method3332(var2, (long) this.field3421);
        }
        return var2;
    }

    @ObfuscatedName("iv.x(I)Lkb;")
    public class295 method4090() {
        if (this.field3420 < 0) {
            return null;
        }
        class295 var1 = (class295) field3419.method3330((long) this.field3420);
        if (var1 != null) {
            return var1;
        }
        class295 var2 = class296.method2845(Statics.field295, this.field3420, 0);
        if (var2 != null) {
            field3419.method3332(var2, (long) this.field3420);
        }
        return var2;
    }
}

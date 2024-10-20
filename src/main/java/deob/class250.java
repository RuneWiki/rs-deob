package deob;

@ObfuscatedName("iv")
public class class250 extends class196 {

    @ObfuscatedName("iv.g")
    public static class191 field3363 = new class191(64);

    @ObfuscatedName("iv.y")
    public static class191 field3362 = new class191(64);

    @ObfuscatedName("iv.w")
    public int field3357;

    @ObfuscatedName("iv.z")
    public int field3360 = 255;

    @ObfuscatedName("iv.r")
    public int field3361 = 255;

    @ObfuscatedName("iv.u")
    public int field3366 = -1;

    @ObfuscatedName("iv.d")
    public int field3369 = 1;

    @ObfuscatedName("iv.o")
    public int field3364 = 70;

    @ObfuscatedName("iv.l")
    public int field3365 = -1;

    @ObfuscatedName("iv.h")
    public int field3359 = -1;

    @ObfuscatedName("iv.s")
    public int field3367 = 30;

    @ObfuscatedName("iv.c")
    public int field3355 = 0;

    @ObfuscatedName("ff.e(IB)Liv;")
    public static class250 method3134(int arg0) {
        class250 var1 = (class250) field3363.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3358.method3817(33, arg0);
        class250 var3 = new class250();
        if (var2 != null) {
            var3.method4097(new class175(var2));
        }
        field3363.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.n(Lfh;I)V")
    public void method4097(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4093(arg0, var2);
        }
    }

    @ObfuscatedName("iv.g(Lfh;II)V")
    public void method4093(class175 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3091();
        } else if (arg1 == 2) {
            this.field3360 = arg0.method2928();
        } else if (arg1 == 3) {
            this.field3361 = arg0.method2928();
        } else if (arg1 == 4) {
            this.field3366 = 0;
        } else if (arg1 == 5) {
            this.field3364 = arg0.method3091();
        } else if (arg1 == 6) {
            arg0.method2928();
        } else if (arg1 == 7) {
            this.field3365 = arg0.method2943();
        } else if (arg1 == 8) {
            this.field3359 = arg0.method2943();
        } else if (arg1 == 11) {
            this.field3366 = arg0.method3091();
        } else if (arg1 == 14) {
            this.field3367 = arg0.method2928();
        } else if (arg1 == 15) {
            this.field3355 = arg0.method2928();
        }
    }

    @ObfuscatedName("iv.y(I)Lkn;")
    public class287 method4094() {
        if (this.field3365 < 0) {
            return null;
        }
        class287 var1 = (class287) field3362.method3288((long) this.field3365);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method994(Statics.field3356, this.field3365, 0);
        if (var2 != null) {
            field3362.method3278(var2, (long) this.field3365);
        }
        return var2;
    }

    @ObfuscatedName("iv.w(I)Lkn;")
    public class287 method4096() {
        if (this.field3359 < 0) {
            return null;
        }
        class287 var1 = (class287) field3362.method3288((long) this.field3359);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method994(Statics.field3356, this.field3359, 0);
        if (var2 != null) {
            field3362.method3278(var2, (long) this.field3359);
        }
        return var2;
    }

    @ObfuscatedName("aa.k(I)V")
    public static void method675() {
        field3363.method3282();
        field3362.method3282();
    }
}

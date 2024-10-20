package deob;

@ObfuscatedName("ik")
public class class252 extends class198 {

    @ObfuscatedName("ik.x")
    public static class193 field3380 = new class193(64);

    @ObfuscatedName("ik.k")
    public static class193 field3371 = new class193(64);

    @ObfuscatedName("ik.f")
    public int field3382;

    @ObfuscatedName("ik.m")
    public int field3375 = 255;

    @ObfuscatedName("ik.u")
    public int field3376 = 255;

    @ObfuscatedName("ik.r")
    public int field3377 = -1;

    @ObfuscatedName("ik.v")
    public int field3378 = 1;

    @ObfuscatedName("ik.h")
    public int field3370 = 70;

    @ObfuscatedName("ik.a")
    public int field3379 = -1;

    @ObfuscatedName("ik.p")
    public int field3381 = -1;

    @ObfuscatedName("ik.q")
    public int field3372 = 30;

    @ObfuscatedName("ik.l")
    public int field3383 = 0;

    @ObfuscatedName("bc.w(II)Lik;")
    public static class252 method1013(int arg0) {
        class252 var1 = (class252) field3380.method3239((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3368.method3754(33, arg0);
        class252 var3 = new class252();
        if (var2 != null) {
            var3.method4001(new class177(var2));
        }
        field3380.method3241(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.o(Lfi;I)V")
    public void method4001(class177 arg0) {
        while (true) {
            int var2 = arg0.method2931();
            if (var2 == 0) {
                return;
            }
            this.method4005(arg0, var2);
        }
    }

    @ObfuscatedName("ik.x(Lfi;II)V")
    public void method4005(class177 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2886();
        } else if (arg1 == 2) {
            this.field3375 = arg0.method2931();
        } else if (arg1 == 3) {
            this.field3376 = arg0.method2931();
        } else if (arg1 == 4) {
            this.field3377 = 0;
        } else if (arg1 == 5) {
            this.field3370 = arg0.method2886();
        } else if (arg1 == 6) {
            arg0.method2931();
        } else if (arg1 == 7) {
            this.field3379 = arg0.method2899();
        } else if (arg1 == 8) {
            this.field3381 = arg0.method2899();
        } else if (arg1 == 11) {
            this.field3377 = arg0.method2886();
        } else if (arg1 == 14) {
            this.field3372 = arg0.method2931();
        } else if (arg1 == 15) {
            this.field3383 = arg0.method2931();
        }
    }

    @ObfuscatedName("ik.k(I)Lkh;")
    public class289 method4003() {
        if (this.field3379 < 0) {
            return null;
        }
        class289 var1 = (class289) field3371.method3239((long) this.field3379);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method3390(Statics.field3369, this.field3379, 0);
        if (var2 != null) {
            field3371.method3241(var2, (long) this.field3379);
        }
        return var2;
    }

    @ObfuscatedName("ik.f(I)Lkh;")
    public class289 method4004() {
        if (this.field3381 < 0) {
            return null;
        }
        class289 var1 = (class289) field3371.method3239((long) this.field3381);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method3390(Statics.field3369, this.field3381, 0);
        if (var2 != null) {
            field3371.method3241(var2, (long) this.field3381);
        }
        return var2;
    }

    @ObfuscatedName("z.i(B)V")
    public static void method127() {
        field3380.method3242();
        field3371.method3242();
    }
}

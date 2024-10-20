package deob;

@ObfuscatedName("jc")
public class class264 extends class209 {

    @ObfuscatedName("jc.w")
    public static class203 field3372 = new class203(64);

    @ObfuscatedName("jc.s")
    public static class203 field3382 = new class203(64);

    @ObfuscatedName("jc.e")
    public int field3369;

    @ObfuscatedName("jc.p")
    public int field3378 = 255;

    @ObfuscatedName("jc.r")
    public int field3376 = 255;

    @ObfuscatedName("jc.m")
    public int field3377 = -1;

    @ObfuscatedName("jc.d")
    public int field3383 = 1;

    @ObfuscatedName("jc.z")
    public int field3379 = 70;

    @ObfuscatedName("jc.x")
    public int field3380 = -1;

    @ObfuscatedName("jc.v")
    public int field3381 = -1;

    @ObfuscatedName("jc.g")
    public int field3373 = 30;

    @ObfuscatedName("jc.j")
    public int field3371 = 0;

    @ObfuscatedName("do.f(Lik;Lik;I)V")
    public static void method2363(class250 arg0, class250 arg1) {
        Statics.field3374 = arg0;
        Statics.field3370 = arg1;
    }

    @ObfuscatedName("eo.l(IB)Ljc;")
    public static class264 method2921(int arg0) {
        class264 var1 = (class264) field3372.method3737((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3374.method4289(33, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4611(new class185(var2));
        }
        field3372.method3744(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jc.w(Lgm;I)V")
    public void method4611(class185 arg0) {
        while (true) {
            int var2 = arg0.method3344();
            if (var2 == 0) {
                return;
            }
            this.method4598(arg0, var2);
        }
    }

    @ObfuscatedName("jc.s(Lgm;IB)V")
    public void method4598(class185 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3346();
        } else if (arg1 == 2) {
            this.field3378 = arg0.method3344();
        } else if (arg1 == 3) {
            this.field3376 = arg0.method3344();
        } else if (arg1 == 4) {
            this.field3377 = 0;
        } else if (arg1 == 5) {
            this.field3379 = arg0.method3346();
        } else if (arg1 == 6) {
            arg0.method3344();
        } else if (arg1 == 7) {
            this.field3380 = arg0.method3381();
        } else if (arg1 == 8) {
            this.field3381 = arg0.method3381();
        } else if (arg1 == 11) {
            this.field3377 = arg0.method3346();
        } else if (arg1 == 14) {
            this.field3373 = arg0.method3344();
        } else if (arg1 == 15) {
            this.field3371 = arg0.method3344();
        }
    }

    @ObfuscatedName("jc.e(I)Llp;")
    public class324 method4599() {
        if (this.field3380 < 0) {
            return null;
        }
        class324 var1 = (class324) field3382.method3737((long) this.field3380);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method2923(Statics.field3370, this.field3380, 0);
        if (var2 != null) {
            field3382.method3744(var2, (long) this.field3380);
        }
        return var2;
    }

    @ObfuscatedName("jc.c(B)Llp;")
    public class324 method4608() {
        if (this.field3381 < 0) {
            return null;
        }
        class324 var1 = (class324) field3382.method3737((long) this.field3381);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method2923(Statics.field3370, this.field3381, 0);
        if (var2 != null) {
            field3382.method3744(var2, (long) this.field3381);
        }
        return var2;
    }

    @ObfuscatedName("hc.p(B)V")
    public static void method4037() {
        field3372.method3740();
        field3382.method3740();
    }
}

package deob;

@ObfuscatedName("jm")
public class class264 extends class209 {

    @ObfuscatedName("jm.e")
    public static class203 field3359 = new class203(64);

    @ObfuscatedName("jm.b")
    public static class203 field3360 = new class203(64);

    @ObfuscatedName("jm.l")
    public int field3370;

    @ObfuscatedName("jm.n")
    public int field3364 = 255;

    @ObfuscatedName("jm.s")
    public int field3361 = 255;

    @ObfuscatedName("jm.g")
    public int field3363 = -1;

    @ObfuscatedName("jm.a")
    public int field3365 = 1;

    @ObfuscatedName("jm.r")
    public int field3366 = 70;

    @ObfuscatedName("jm.k")
    public int field3362 = -1;

    @ObfuscatedName("jm.m")
    public int field3368 = -1;

    @ObfuscatedName("jm.q")
    public int field3369 = 30;

    @ObfuscatedName("jm.x")
    public int field3358 = 0;

    @ObfuscatedName("cu.f(II)Ljm;")
    public static class264 method1906(int arg0) {
        class264 var1 = (class264) field3359.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2354.method4267(33, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4558(new class185(var2));
        }
        field3359.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jm.h(Lgx;I)V")
    public void method4558(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4569(arg0, var2);
        }
    }

    @ObfuscatedName("jm.e(Lgx;IB)V")
    public void method4569(class185 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3325();
        } else if (arg1 == 2) {
            this.field3364 = arg0.method3323();
        } else if (arg1 == 3) {
            this.field3361 = arg0.method3323();
        } else if (arg1 == 4) {
            this.field3363 = 0;
        } else if (arg1 == 5) {
            this.field3366 = arg0.method3325();
        } else if (arg1 == 6) {
            arg0.method3323();
        } else if (arg1 == 7) {
            this.field3362 = arg0.method3340();
        } else if (arg1 == 8) {
            this.field3368 = arg0.method3340();
        } else if (arg1 == 11) {
            this.field3363 = arg0.method3325();
        } else if (arg1 == 14) {
            this.field3369 = arg0.method3323();
        } else if (arg1 == 15) {
            this.field3358 = arg0.method3323();
        }
    }

    @ObfuscatedName("jm.b(I)Lly;")
    public class324 method4555() {
        if (this.field3362 < 0) {
            return null;
        }
        class324 var1 = (class324) field3360.method3724((long) this.field3362);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method149(Statics.field3367, this.field3362, 0);
        if (var2 != null) {
            field3360.method3723(var2, (long) this.field3362);
        }
        return var2;
    }

    @ObfuscatedName("jm.l(I)Lly;")
    public class324 method4559() {
        if (this.field3368 < 0) {
            return null;
        }
        class324 var1 = (class324) field3360.method3724((long) this.field3368);
        if (var1 != null) {
            return var1;
        }
        class324 var2 = class325.method149(Statics.field3367, this.field3368, 0);
        if (var2 != null) {
            field3360.method3723(var2, (long) this.field3368);
        }
        return var2;
    }
}

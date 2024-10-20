package deob;

@ObfuscatedName("jj")
public class class276 extends class219 {

    @ObfuscatedName("jj.b")
    public static class213 field3525 = new class213(64);

    @ObfuscatedName("jj.z")
    public static class213 field3526 = new class213(64);

    @ObfuscatedName("jj.n")
    public int field3536;

    @ObfuscatedName("jj.y")
    public int field3529 = 255;

    @ObfuscatedName("jj.c")
    public int field3530 = 255;

    @ObfuscatedName("jj.h")
    public int field3531 = -1;

    @ObfuscatedName("jj.i")
    public int field3535 = 1;

    @ObfuscatedName("jj.o")
    public int field3533 = 70;

    @ObfuscatedName("jj.d")
    public int field3534 = -1;

    @ObfuscatedName("jj.r")
    public int field3532 = -1;

    @ObfuscatedName("jj.p")
    public int field3523 = 30;

    @ObfuscatedName("jj.q")
    public int field3537 = 0;

    @ObfuscatedName("cf.g(Ljr;Ljr;I)V")
    public static void method1816(class262 arg0, class262 arg1) {
        Statics.field3527 = arg0;
        Statics.field3524 = arg1;
    }

    @ObfuscatedName("jj.e(Lgg;I)V")
    public void method4566(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4577(arg0, var2);
        }
    }

    @ObfuscatedName("jj.b(Lgg;IB)V")
    public void method4577(class195 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3310();
        } else if (arg1 == 2) {
            this.field3529 = arg0.method3332();
        } else if (arg1 == 3) {
            this.field3530 = arg0.method3332();
        } else if (arg1 == 4) {
            this.field3531 = 0;
        } else if (arg1 == 5) {
            this.field3533 = arg0.method3310();
        } else if (arg1 == 6) {
            arg0.method3332();
        } else if (arg1 == 7) {
            this.field3534 = arg0.method3324();
        } else if (arg1 == 8) {
            this.field3532 = arg0.method3324();
        } else if (arg1 == 11) {
            this.field3531 = arg0.method3310();
        } else if (arg1 == 14) {
            this.field3523 = arg0.method3332();
        } else if (arg1 == 15) {
            this.field3537 = arg0.method3332();
        }
    }

    @ObfuscatedName("jj.z(B)Llv;")
    public class332 method4568() {
        if (this.field3534 < 0) {
            return null;
        }
        class332 var1 = (class332) field3526.method3706((long) this.field3534);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method3538(Statics.field3524, this.field3534, 0);
        if (var2 != null) {
            field3526.method3712(var2, (long) this.field3534);
        }
        return var2;
    }

    @ObfuscatedName("jj.n(B)Llv;")
    public class332 method4569() {
        if (this.field3532 < 0) {
            return null;
        }
        class332 var1 = (class332) field3526.method3706((long) this.field3532);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method3538(Statics.field3524, this.field3532, 0);
        if (var2 != null) {
            field3526.method3712(var2, (long) this.field3532);
        }
        return var2;
    }

    @ObfuscatedName("ad.l(B)V")
    public static void method511() {
        field3525.method3709();
        field3526.method3709();
    }
}

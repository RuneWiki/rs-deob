package deob;

@ObfuscatedName("jj")
public class class276 extends class219 {

    @ObfuscatedName("jj.t")
    public static class213 field3525 = new class213(64);

    @ObfuscatedName("jj.d")
    public static class213 field3532 = new class213(64);

    @ObfuscatedName("jj.h")
    public int field3527;

    @ObfuscatedName("jj.i")
    public int field3537 = 255;

    @ObfuscatedName("jj.u")
    public int field3530 = 255;

    @ObfuscatedName("jj.x")
    public int field3524 = -1;

    @ObfuscatedName("jj.y")
    public int field3531 = 1;

    @ObfuscatedName("jj.a")
    public int field3523 = 70;

    @ObfuscatedName("jj.w")
    public int field3534 = -1;

    @ObfuscatedName("jj.n")
    public int field3535 = -1;

    @ObfuscatedName("jj.l")
    public int field3536 = 30;

    @ObfuscatedName("jj.s")
    public int field3526 = 0;

    @ObfuscatedName("ja.o(Ljf;Ljf;I)V")
    public static void method4667(class262 arg0, class262 arg1) {
        Statics.field3533 = arg0;
        Statics.field3529 = arg1;
    }

    @ObfuscatedName("jj.k(Lgc;I)V")
    public void method4474(class195 arg0) {
        while (true) {
            int var2 = arg0.method3205();
            if (var2 == 0) {
                return;
            }
            this.method4487(arg0, var2);
        }
    }

    @ObfuscatedName("jj.t(Lgc;II)V")
    public void method4487(class195 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3207();
        } else if (arg1 == 2) {
            this.field3537 = arg0.method3205();
        } else if (arg1 == 3) {
            this.field3530 = arg0.method3205();
        } else if (arg1 == 4) {
            this.field3524 = 0;
        } else if (arg1 == 5) {
            this.field3523 = arg0.method3207();
        } else if (arg1 == 6) {
            arg0.method3205();
        } else if (arg1 == 7) {
            this.field3534 = arg0.method3264();
        } else if (arg1 == 8) {
            this.field3535 = arg0.method3264();
        } else if (arg1 == 11) {
            this.field3524 = arg0.method3207();
        } else if (arg1 == 14) {
            this.field3536 = arg0.method3205();
        } else if (arg1 == 15) {
            this.field3526 = arg0.method3205();
        }
    }

    @ObfuscatedName("jj.d(I)Lld;")
    public class332 method4476() {
        if (this.field3534 < 0) {
            return null;
        }
        class332 var1 = (class332) field3532.method3601((long) this.field3534);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method704(Statics.field3529, this.field3534, 0);
        if (var2 != null) {
            field3532.method3603(var2, (long) this.field3534);
        }
        return var2;
    }

    @ObfuscatedName("jj.h(I)Lld;")
    public class332 method4477() {
        if (this.field3535 < 0) {
            return null;
        }
        class332 var1 = (class332) field3532.method3601((long) this.field3535);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method704(Statics.field3529, this.field3535, 0);
        if (var2 != null) {
            field3532.method3603(var2, (long) this.field3535);
        }
        return var2;
    }
}

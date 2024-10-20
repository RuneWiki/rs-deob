package deob;

@ObfuscatedName("jk")
public class class267 extends class214 {

    @ObfuscatedName("jk.l")
    public static class208 field3388 = new class208(64);

    @ObfuscatedName("jk.g")
    public static class208 field3377 = new class208(64);

    @ObfuscatedName("jk.b")
    public int field3378;

    @ObfuscatedName("jk.z")
    public int field3376 = 255;

    @ObfuscatedName("jk.j")
    public int field3374 = 255;

    @ObfuscatedName("jk.d")
    public int field3386 = -1;

    @ObfuscatedName("jk.t")
    public int field3383 = 1;

    @ObfuscatedName("jk.f")
    public int field3384 = 70;

    @ObfuscatedName("jk.i")
    public int field3382 = -1;

    @ObfuscatedName("jk.m")
    public int field3381 = -1;

    @ObfuscatedName("jk.v")
    public int field3387 = 30;

    @ObfuscatedName("jk.r")
    public int field3385 = 0;

    @ObfuscatedName("hj.n(Lij;Lij;I)V")
    public static void method4209(class254 arg0, class254 arg1) {
        Statics.field3380 = arg0;
        Statics.field3375 = arg1;
    }

    @ObfuscatedName("hj.h(II)Ljk;")
    public static class267 method4210(int arg0) {
        class267 var1 = (class267) field3388.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3380.method4494(33, arg0);
        class267 var3 = new class267();
        if (var2 != null) {
            var3.method4739(new class190(var2));
        }
        field3388.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.l(Lgc;B)V")
    public void method4739(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4740(arg0, var2);
        }
    }

    @ObfuscatedName("jk.g(Lgc;IB)V")
    public void method4740(class190 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3513();
        } else if (arg1 == 2) {
            this.field3376 = arg0.method3511();
        } else if (arg1 == 3) {
            this.field3374 = arg0.method3511();
        } else if (arg1 == 4) {
            this.field3386 = 0;
        } else if (arg1 == 5) {
            this.field3384 = arg0.method3513();
        } else if (arg1 == 6) {
            arg0.method3511();
        } else if (arg1 == 7) {
            this.field3382 = arg0.method3516();
        } else if (arg1 == 8) {
            this.field3381 = arg0.method3516();
        } else if (arg1 == 11) {
            this.field3386 = arg0.method3513();
        } else if (arg1 == 14) {
            this.field3387 = arg0.method3511();
        } else if (arg1 == 15) {
            this.field3385 = arg0.method3511();
        }
    }

    @ObfuscatedName("jk.b(I)Llu;")
    public class327 method4754() {
        if (this.field3382 < 0) {
            return null;
        }
        class327 var1 = (class327) field3377.method3902((long) this.field3382);
        if (var1 != null) {
            return var1;
        }
        class327 var2 = class328.method1038(Statics.field3375, this.field3382, 0);
        if (var2 != null) {
            field3377.method3908(var2, (long) this.field3382);
        }
        return var2;
    }

    @ObfuscatedName("jk.a(I)Llu;")
    public class327 method4742() {
        if (this.field3381 < 0) {
            return null;
        }
        class327 var1 = (class327) field3377.method3902((long) this.field3381);
        if (var1 != null) {
            return var1;
        }
        class327 var2 = class328.method1038(Statics.field3375, this.field3381, 0);
        if (var2 != null) {
            field3377.method3908(var2, (long) this.field3381);
        }
        return var2;
    }
}

package deob;

@ObfuscatedName("jo")
public class class276 extends class219 {

    @ObfuscatedName("jo.o")
    public static class213 field3526 = new class213(64);

    @ObfuscatedName("jo.j")
    public static class213 field3519 = new class213(64);

    @ObfuscatedName("jo.k")
    public int field3530;

    @ObfuscatedName("jo.p")
    public int field3521 = 255;

    @ObfuscatedName("jo.w")
    public int field3522 = 255;

    @ObfuscatedName("jo.r")
    public int field3523 = -1;

    @ObfuscatedName("jo.d")
    public int field3518 = 1;

    @ObfuscatedName("jo.a")
    public int field3525 = 70;

    @ObfuscatedName("jo.e")
    public int field3520 = -1;

    @ObfuscatedName("jo.f")
    public int field3527 = -1;

    @ObfuscatedName("jo.l")
    public int field3528 = 30;

    @ObfuscatedName("jo.m")
    public int field3529 = 0;

    @ObfuscatedName("jv.c(Ljm;Ljm;B)V")
    public static void method4184(class262 arg0, class262 arg1) {
        Statics.field442 = arg0;
        Statics.field3920 = arg1;
    }

    @ObfuscatedName("fb.i(II)Ljo;")
    public static class276 method2955(int arg0) {
        class276 var1 = (class276) field3526.method3625((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field442.method4190(33, arg0);
        class276 var3 = new class276();
        if (var2 != null) {
            var3.method4493(new class195(var2));
        }
        field3526.method3628(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jo.o(Lgp;I)V")
    public void method4493(class195 arg0) {
        while (true) {
            int var2 = arg0.method3429();
            if (var2 == 0) {
                return;
            }
            this.method4486(arg0, var2);
        }
    }

    @ObfuscatedName("jo.j(Lgp;II)V")
    public void method4486(class195 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3218();
        } else if (arg1 == 2) {
            this.field3521 = arg0.method3429();
        } else if (arg1 == 3) {
            this.field3522 = arg0.method3429();
        } else if (arg1 == 4) {
            this.field3523 = 0;
        } else if (arg1 == 5) {
            this.field3525 = arg0.method3218();
        } else if (arg1 == 6) {
            arg0.method3429();
        } else if (arg1 == 7) {
            this.field3520 = arg0.method3309();
        } else if (arg1 == 8) {
            this.field3527 = arg0.method3309();
        } else if (arg1 == 11) {
            this.field3523 = arg0.method3218();
        } else if (arg1 == 14) {
            this.field3528 = arg0.method3429();
        } else if (arg1 == 15) {
            this.field3529 = arg0.method3429();
        }
    }

    @ObfuscatedName("jo.k(B)Lla;")
    public class332 method4487() {
        if (this.field3520 < 0) {
            return null;
        }
        class332 var1 = (class332) field3519.method3625((long) this.field3520);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method5407(Statics.field3920, this.field3520, 0);
        if (var2 != null) {
            field3519.method3628(var2, (long) this.field3520);
        }
        return var2;
    }

    @ObfuscatedName("jo.x(B)Lla;")
    public class332 method4500() {
        if (this.field3527 < 0) {
            return null;
        }
        class332 var1 = (class332) field3519.method3625((long) this.field3527);
        if (var1 != null) {
            return var1;
        }
        class332 var2 = class333.method5407(Statics.field3920, this.field3527, 0);
        if (var2 != null) {
            field3519.method3628(var2, (long) this.field3527);
        }
        return var2;
    }
}

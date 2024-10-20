package deob;

@ObfuscatedName("ip")
public class class249 extends class195 {

    @ObfuscatedName("ip.i")
    public static class190 field3366 = new class190(64);

    @ObfuscatedName("ip.j")
    public static class190 field3367 = new class190(64);

    @ObfuscatedName("ip.f")
    public int field3368;

    @ObfuscatedName("ip.z")
    public int field3369 = 255;

    @ObfuscatedName("ip.h")
    public int field3370 = 255;

    @ObfuscatedName("ip.g")
    public int field3372 = -1;

    @ObfuscatedName("ip.e")
    public int field3373 = 1;

    @ObfuscatedName("ip.o")
    public int field3371 = 70;

    @ObfuscatedName("ip.x")
    public int field3365 = -1;

    @ObfuscatedName("ip.a")
    public int field3375 = -1;

    @ObfuscatedName("ip.y")
    public int field3376 = 30;

    @ObfuscatedName("ip.r")
    public int field3377 = 0;

    @ObfuscatedName("q.n(II)Lip;")
    public static class249 method177(int arg0) {
        class249 var1 = (class249) field3366.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3374.method3880(33, arg0);
        class249 var3 = new class249();
        if (var2 != null) {
            var3.method4104(new class174(var2));
        }
        field3366.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ip.p(Lfl;I)V")
    public void method4104(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4105(arg0, var2);
        }
    }

    @ObfuscatedName("ip.i(Lfl;II)V")
    public void method4105(class174 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3065();
        } else if (arg1 == 2) {
            this.field3369 = arg0.method2925();
        } else if (arg1 == 3) {
            this.field3370 = arg0.method2925();
        } else if (arg1 == 4) {
            this.field3372 = 0;
        } else if (arg1 == 5) {
            this.field3371 = arg0.method3065();
        } else if (arg1 == 6) {
            arg0.method2925();
        } else if (arg1 == 7) {
            this.field3365 = arg0.method3100();
        } else if (arg1 == 8) {
            this.field3375 = arg0.method3100();
        } else if (arg1 == 11) {
            this.field3372 = arg0.method3065();
        } else if (arg1 == 14) {
            this.field3376 = arg0.method2925();
        } else if (arg1 == 15) {
            this.field3377 = arg0.method2925();
        }
    }

    @ObfuscatedName("ip.j(I)Ljp;")
    public class286 method4112() {
        if (this.field3365 < 0) {
            return null;
        }
        class286 var1 = (class286) field3367.method3280((long) this.field3365);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2679(Statics.field41, this.field3365, 0);
        if (var2 != null) {
            field3367.method3282(var2, (long) this.field3365);
        }
        return var2;
    }

    @ObfuscatedName("ip.f(B)Ljp;")
    public class286 method4106() {
        if (this.field3375 < 0) {
            return null;
        }
        class286 var1 = (class286) field3367.method3280((long) this.field3375);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2679(Statics.field41, this.field3375, 0);
        if (var2 != null) {
            field3367.method3282(var2, (long) this.field3375);
        }
        return var2;
    }
}

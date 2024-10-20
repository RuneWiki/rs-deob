package deob;

@ObfuscatedName("io")
public class class249 extends class195 {

    @ObfuscatedName("io.q")
    public static class190 field3361 = new class190(64);

    @ObfuscatedName("io.o")
    public static class190 field3359 = new class190(64);

    @ObfuscatedName("io.g")
    public int field3363;

    @ObfuscatedName("io.e")
    public int field3362 = 255;

    @ObfuscatedName("io.d")
    public int field3366 = 255;

    @ObfuscatedName("io.x")
    public int field3367 = -1;

    @ObfuscatedName("io.z")
    public int field3371 = 1;

    @ObfuscatedName("io.n")
    public int field3369 = 70;

    @ObfuscatedName("io.u")
    public int field3360 = -1;

    @ObfuscatedName("io.t")
    public int field3373 = -1;

    @ObfuscatedName("io.a")
    public int field3372 = 30;

    @ObfuscatedName("io.i")
    public int field3365 = 0;

    @ObfuscatedName("hk.w(Lip;Lip;S)V")
    public static void method3856(class236 arg0, class236 arg1) {
        Statics.field3368 = arg0;
        Statics.field3370 = arg1;
    }

    @ObfuscatedName("hu.s(II)Lio;")
    public static class249 method3871(int arg0) {
        class249 var1 = (class249) field3361.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3368.method3876(33, arg0);
        class249 var3 = new class249();
        if (var2 != null) {
            var3.method4152(new class174(var2));
        }
        field3361.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.q(Lfz;B)V")
    public void method4152(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4136(arg0, var2);
        }
    }

    @ObfuscatedName("io.o(Lfz;IB)V")
    public void method4136(class174 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3178();
        } else if (arg1 == 2) {
            this.field3362 = arg0.method2971();
        } else if (arg1 == 3) {
            this.field3366 = arg0.method2971();
        } else if (arg1 == 4) {
            this.field3367 = 0;
        } else if (arg1 == 5) {
            this.field3369 = arg0.method3178();
        } else if (arg1 == 6) {
            arg0.method2971();
        } else if (arg1 == 7) {
            this.field3360 = arg0.method3015();
        } else if (arg1 == 8) {
            this.field3373 = arg0.method3015();
        } else if (arg1 == 11) {
            this.field3367 = arg0.method3178();
        } else if (arg1 == 14) {
            this.field3372 = arg0.method2971();
        } else if (arg1 == 15) {
            this.field3365 = arg0.method2971();
        }
    }

    @ObfuscatedName("io.g(I)Lky;")
    public class287 method4154() {
        if (this.field3360 < 0) {
            return null;
        }
        class287 var1 = (class287) field3359.method3357((long) this.field3360);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method3863(Statics.field3370, this.field3360, 0);
        if (var2 != null) {
            field3359.method3371(var2, (long) this.field3360);
        }
        return var2;
    }

    @ObfuscatedName("io.v(I)Lky;")
    public class287 method4138() {
        if (this.field3373 < 0) {
            return null;
        }
        class287 var1 = (class287) field3359.method3357((long) this.field3373);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method3863(Statics.field3370, this.field3373, 0);
        if (var2 != null) {
            field3359.method3371(var2, (long) this.field3373);
        }
        return var2;
    }

    @ObfuscatedName("gr.p(B)V")
    public static void method3273() {
        field3361.method3361();
        field3359.method3361();
    }
}

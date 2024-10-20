package deob;

@ObfuscatedName("iz")
public class class249 extends class195 {

    @ObfuscatedName("iz.e")
    public static class190 field3363 = new class190(64);

    @ObfuscatedName("iz.p")
    public static class190 field3364 = new class190(64);

    @ObfuscatedName("iz.q")
    public int field3365;

    @ObfuscatedName("iz.g")
    public int field3361 = 255;

    @ObfuscatedName("iz.v")
    public int field3370 = 255;

    @ObfuscatedName("iz.t")
    public int field3366 = -1;

    @ObfuscatedName("iz.y")
    public int field3371 = 1;

    @ObfuscatedName("iz.o")
    public int field3372 = 70;

    @ObfuscatedName("iz.i")
    public int field3373 = -1;

    @ObfuscatedName("iz.u")
    public int field3374 = -1;

    @ObfuscatedName("iz.b")
    public int field3375 = 30;

    @ObfuscatedName("iz.f")
    public int field3368 = 0;

    @ObfuscatedName("i.d(IB)Liz;")
    public static class249 method65(int arg0) {
        class249 var1 = (class249) field3363.method3341((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3367.method3875(33, arg0);
        class249 var3 = new class249();
        if (var2 != null) {
            var3.method4129(new class174(var2));
        }
        field3363.method3343(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.k(Lfg;I)V")
    public void method4129(class174 arg0) {
        while (true) {
            int var2 = arg0.method2955();
            if (var2 == 0) {
                return;
            }
            this.method4130(arg0, var2);
        }
    }

    @ObfuscatedName("iz.e(Lfg;II)V")
    public void method4130(class174 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3035();
        } else if (arg1 == 2) {
            this.field3361 = arg0.method2955();
        } else if (arg1 == 3) {
            this.field3370 = arg0.method2955();
        } else if (arg1 == 4) {
            this.field3366 = 0;
        } else if (arg1 == 5) {
            this.field3372 = arg0.method3035();
        } else if (arg1 == 6) {
            arg0.method2955();
        } else if (arg1 == 7) {
            this.field3373 = arg0.method2971();
        } else if (arg1 == 8) {
            this.field3374 = arg0.method2971();
        } else if (arg1 == 11) {
            this.field3366 = arg0.method3035();
        } else if (arg1 == 14) {
            this.field3375 = arg0.method2955();
        } else if (arg1 == 15) {
            this.field3368 = arg0.method2955();
        }
    }

    @ObfuscatedName("iz.p(I)Lkr;")
    public class287 method4146() {
        if (this.field3373 < 0) {
            return null;
        }
        class287 var1 = (class287) field3364.method3341((long) this.field3373);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method1953(Statics.field3362, this.field3373, 0);
        if (var2 != null) {
            field3364.method3343(var2, (long) this.field3373);
        }
        return var2;
    }

    @ObfuscatedName("iz.q(I)Lkr;")
    public class287 method4132() {
        if (this.field3374 < 0) {
            return null;
        }
        class287 var1 = (class287) field3364.method3341((long) this.field3374);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method1953(Statics.field3362, this.field3374, 0);
        if (var2 != null) {
            field3364.method3343(var2, (long) this.field3374);
        }
        return var2;
    }
}

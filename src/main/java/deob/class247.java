package deob;

@ObfuscatedName("iz")
public class class247 extends class176 {

    @ObfuscatedName("iz.b")
    public static class146 field3284 = new class146(64);

    @ObfuscatedName("iz.g")
    public static class146 field3291 = new class146(64);

    @ObfuscatedName("iz.z")
    public int field3295;

    @ObfuscatedName("iz.y")
    public int field3287 = 255;

    @ObfuscatedName("iz.w")
    public int field3288 = 255;

    @ObfuscatedName("iz.i")
    public int field3289 = -1;

    @ObfuscatedName("iz.k")
    public int field3290 = 1;

    @ObfuscatedName("iz.x")
    public int field3282 = 70;

    @ObfuscatedName("iz.o")
    public int field3292 = -1;

    @ObfuscatedName("iz.e")
    public int field3285 = -1;

    @ObfuscatedName("iz.n")
    public int field3294 = 30;

    @ObfuscatedName("iz.r")
    public int field3286 = 0;

    @ObfuscatedName("bg.u(Lhf;Lhf;I)V")
    public static void method1134(class234 arg0, class234 arg1) {
        Statics.field3293 = arg0;
        Statics.field3283 = arg1;
    }

    @ObfuscatedName("ae.f(IB)Liz;")
    public static class247 method659(int arg0) {
        class247 var1 = (class247) field3284.method3076((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3293.method3928(33, arg0);
        class247 var3 = new class247();
        if (var2 != null) {
            var3.method4166(new class300(var2));
        }
        field3284.method3078(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.b(Lkg;I)V")
    public void method4166(class300 arg0) {
        while (true) {
            int var2 = arg0.method5138();
            if (var2 == 0) {
                return;
            }
            this.method4152(arg0, var2);
        }
    }

    @ObfuscatedName("iz.g(Lkg;II)V")
    public void method4152(class300 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method5337();
        } else if (arg1 == 2) {
            this.field3287 = arg0.method5138();
        } else if (arg1 == 3) {
            this.field3288 = arg0.method5138();
        } else if (arg1 == 4) {
            this.field3289 = 0;
        } else if (arg1 == 5) {
            this.field3282 = arg0.method5337();
        } else if (arg1 == 6) {
            arg0.method5138();
        } else if (arg1 == 7) {
            this.field3292 = arg0.method5155();
        } else if (arg1 == 8) {
            this.field3285 = arg0.method5155();
        } else if (arg1 == 11) {
            this.field3289 = arg0.method5337();
        } else if (arg1 == 14) {
            this.field3294 = arg0.method5138();
        } else if (arg1 == 15) {
            this.field3286 = arg0.method5138();
        }
    }

    @ObfuscatedName("iz.z(I)Lln;")
    public class325 method4155() {
        if (this.field3292 < 0) {
            return null;
        }
        class325 var1 = (class325) field3291.method3076((long) this.field3292);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4926(Statics.field3283, this.field3292, 0);
        if (var2 != null) {
            field3291.method3078(var2, (long) this.field3292);
        }
        return var2;
    }

    @ObfuscatedName("iz.p(I)Lln;")
    public class325 method4153() {
        if (this.field3285 < 0) {
            return null;
        }
        class325 var1 = (class325) field3291.method3076((long) this.field3285);
        if (var1 != null) {
            return var1;
        }
        class325 var2 = class326.method4926(Statics.field3283, this.field3285, 0);
        if (var2 != null) {
            field3291.method3078(var2, (long) this.field3285);
        }
        return var2;
    }

    @ObfuscatedName("if.h(I)V")
    public static void method4021() {
        field3284.method3075();
        field3291.method3075();
    }
}

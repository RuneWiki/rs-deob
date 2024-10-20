package deob;

@ObfuscatedName("ia")
public class class252 extends class198 {

    @ObfuscatedName("ia.f")
    public static class193 field3377 = new class193(64);

    @ObfuscatedName("ia.m")
    public static class193 field3390 = new class193(64);

    @ObfuscatedName("ia.h")
    public int field3378;

    @ObfuscatedName("ia.d")
    public int field3389 = 255;

    @ObfuscatedName("ia.n")
    public int field3381 = 255;

    @ObfuscatedName("ia.z")
    public int field3383 = -1;

    @ObfuscatedName("ia.o")
    public int field3384 = 1;

    @ObfuscatedName("ia.q")
    public int field3375 = 70;

    @ObfuscatedName("ia.u")
    public int field3386 = -1;

    @ObfuscatedName("ia.k")
    public int field3387 = -1;

    @ObfuscatedName("ia.e")
    public int field3388 = 30;

    @ObfuscatedName("ia.r")
    public int field3382 = 0;

    @ObfuscatedName("ea.s(Liw;Liw;I)V")
    public static void method2340(class239 arg0, class239 arg1) {
        Statics.field3385 = arg0;
        Statics.field3376 = arg1;
    }

    @ObfuscatedName("ia.c(Lfs;I)V")
    public void method4122(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4121(arg0, var2);
        }
    }

    @ObfuscatedName("ia.f(Lfs;II)V")
    public void method4121(class177 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2967();
        } else if (arg1 == 2) {
            this.field3389 = arg0.method2965();
        } else if (arg1 == 3) {
            this.field3381 = arg0.method2965();
        } else if (arg1 == 4) {
            this.field3383 = 0;
        } else if (arg1 == 5) {
            this.field3375 = arg0.method2967();
        } else if (arg1 == 6) {
            arg0.method2965();
        } else if (arg1 == 7) {
            this.field3386 = arg0.method2980();
        } else if (arg1 == 8) {
            this.field3387 = arg0.method2980();
        } else if (arg1 == 11) {
            this.field3383 = arg0.method2967();
        } else if (arg1 == 14) {
            this.field3388 = arg0.method2965();
        } else if (arg1 == 15) {
            this.field3382 = arg0.method2965();
        }
    }

    @ObfuscatedName("ia.m(I)Lkb;")
    public class289 method4130() {
        if (this.field3386 < 0) {
            return null;
        }
        class289 var1 = (class289) field3390.method3319((long) this.field3386);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method4624(Statics.field3376, this.field3386, 0);
        if (var2 != null) {
            field3390.method3315(var2, (long) this.field3386);
        }
        return var2;
    }

    @ObfuscatedName("ia.h(I)Lkb;")
    public class289 method4123() {
        if (this.field3387 < 0) {
            return null;
        }
        class289 var1 = (class289) field3390.method3319((long) this.field3387);
        if (var1 != null) {
            return var1;
        }
        class289 var2 = class290.method4624(Statics.field3376, this.field3387, 0);
        if (var2 != null) {
            field3390.method3315(var2, (long) this.field3387);
        }
        return var2;
    }
}

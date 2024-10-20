package deob;

@ObfuscatedName("id")
public class class250 extends class196 {

    @ObfuscatedName("id.f")
    public static class191 field3351 = new class191(64);

    @ObfuscatedName("id.p")
    public static class191 field3352 = new class191(64);

    @ObfuscatedName("id.x")
    public int field3353;

    @ObfuscatedName("id.l")
    public int field3349 = 255;

    @ObfuscatedName("id.w")
    public int field3354 = 255;

    @ObfuscatedName("id.b")
    public int field3356 = -1;

    @ObfuscatedName("id.o")
    public int field3361 = 1;

    @ObfuscatedName("id.m")
    public int field3358 = 70;

    @ObfuscatedName("id.i")
    public int field3359 = -1;

    @ObfuscatedName("id.s")
    public int field3355 = -1;

    @ObfuscatedName("id.r")
    public int field3357 = 30;

    @ObfuscatedName("id.e")
    public int field3362 = 0;

    @ObfuscatedName("id.j(Lfb;I)V")
    public void method4065(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4066(arg0, var2);
        }
    }

    @ObfuscatedName("id.h(Lfb;IB)V")
    public void method4066(class175 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3023();
        } else if (arg1 == 2) {
            this.field3349 = arg0.method2903();
        } else if (arg1 == 3) {
            this.field3354 = arg0.method2903();
        } else if (arg1 == 4) {
            this.field3356 = 0;
        } else if (arg1 == 5) {
            this.field3358 = arg0.method3023();
        } else if (arg1 == 6) {
            arg0.method2903();
        } else if (arg1 == 7) {
            this.field3359 = arg0.method2918();
        } else if (arg1 == 8) {
            this.field3355 = arg0.method2918();
        } else if (arg1 == 11) {
            this.field3356 = arg0.method3023();
        } else if (arg1 == 14) {
            this.field3357 = arg0.method2903();
        } else if (arg1 == 15) {
            this.field3362 = arg0.method2903();
        }
    }

    @ObfuscatedName("id.f(I)Lkp;")
    public class287 method4072() {
        if (this.field3359 < 0) {
            return null;
        }
        class287 var1 = (class287) field3352.method3271((long) this.field3359);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4115(Statics.field3360, this.field3359, 0);
        if (var2 != null) {
            field3352.method3270(var2, (long) this.field3359);
        }
        return var2;
    }

    @ObfuscatedName("id.p(I)Lkp;")
    public class287 method4068() {
        if (this.field3355 < 0) {
            return null;
        }
        class287 var1 = (class287) field3352.method3271((long) this.field3355);
        if (var1 != null) {
            return var1;
        }
        class287 var2 = class288.method4115(Statics.field3360, this.field3355, 0);
        if (var2 != null) {
            field3352.method3270(var2, (long) this.field3355);
        }
        return var2;
    }
}

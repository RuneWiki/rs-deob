package deob;

@ObfuscatedName("ii")
public class class258 extends class181 {

    @ObfuscatedName("ii.q")
    public static class146 field3354 = new class146(64);

    @ObfuscatedName("ii.w")
    public static class146 field3352 = new class146(64);

    @ObfuscatedName("ii.o")
    public int field3356;

    @ObfuscatedName("ii.l")
    public int field3358 = 255;

    @ObfuscatedName("ii.e")
    public int field3359 = 255;

    @ObfuscatedName("ii.x")
    public int field3360 = -1;

    @ObfuscatedName("ii.d")
    public int field3361 = 1;

    @ObfuscatedName("ii.k")
    public int field3362 = 70;

    @ObfuscatedName("ii.n")
    public int field3363 = -1;

    @ObfuscatedName("ii.i")
    public int field3364 = -1;

    @ObfuscatedName("ii.a")
    public int field3365 = 30;

    @ObfuscatedName("ii.z")
    public int field3355 = 0;

    @ObfuscatedName("ii.m(Lgr;I)V")
    public void method4467(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4483(arg0, var2);
        }
    }

    @ObfuscatedName("ii.f(Lgr;IB)V")
    public void method4483(class202 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method3530();
        } else if (arg1 == 2) {
            this.field3358 = arg0.method3551();
        } else if (arg1 == 3) {
            this.field3359 = arg0.method3551();
        } else if (arg1 == 4) {
            this.field3360 = 0;
        } else if (arg1 == 5) {
            this.field3362 = arg0.method3530();
        } else if (arg1 == 6) {
            arg0.method3551();
        } else if (arg1 == 7) {
            this.field3363 = arg0.method3434();
        } else if (arg1 == 8) {
            this.field3364 = arg0.method3434();
        } else if (arg1 == 11) {
            this.field3360 = arg0.method3530();
        } else if (arg1 == 14) {
            this.field3365 = arg0.method3551();
        } else if (arg1 == 15) {
            this.field3355 = arg0.method3551();
        }
    }

    @ObfuscatedName("ii.q(B)Lln;")
    public class328 method4469() {
        if (this.field3363 < 0) {
            return null;
        }
        class328 var1 = (class328) field3352.method3011((long) this.field3363);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method5456(Statics.field3353, this.field3363, 0);
        if (var2 != null) {
            field3352.method3009(var2, (long) this.field3363);
        }
        return var2;
    }

    @ObfuscatedName("ii.w(B)Lln;")
    public class328 method4468() {
        if (this.field3364 < 0) {
            return null;
        }
        class328 var1 = (class328) field3352.method3011((long) this.field3364);
        if (var1 != null) {
            return var1;
        }
        class328 var2 = class329.method5456(Statics.field3353, this.field3364, 0);
        if (var2 != null) {
            field3352.method3009(var2, (long) this.field3364);
        }
        return var2;
    }

    @ObfuscatedName("gr.o(B)V")
    public static void method3564() {
        field3354.method3010();
        field3352.method3010();
    }
}

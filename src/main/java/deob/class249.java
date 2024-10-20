package deob;

@ObfuscatedName("iq")
public class class249 extends class195 {

    @ObfuscatedName("iq.u")
    public static class190 field3353 = new class190(64);

    @ObfuscatedName("iq.q")
    public static class190 field3369 = new class190(64);

    @ObfuscatedName("iq.g")
    public int field3355;

    @ObfuscatedName("iq.p")
    public int field3358 = 255;

    @ObfuscatedName("iq.l")
    public int field3359 = 255;

    @ObfuscatedName("iq.a")
    public int field3364 = -1;

    @ObfuscatedName("iq.k")
    public int field3361 = 1;

    @ObfuscatedName("iq.r")
    public int field3360 = 70;

    @ObfuscatedName("iq.b")
    public int field3363 = -1;

    @ObfuscatedName("iq.x")
    public int field3352 = -1;

    @ObfuscatedName("iq.o")
    public int field3365 = 30;

    @ObfuscatedName("iq.j")
    public int field3366 = 0;

    @ObfuscatedName("iq.h(Lfv;I)V")
    public void method4109(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4121(arg0, var2);
        }
    }

    @ObfuscatedName("iq.u(Lfv;II)V")
    public void method4121(class174 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2932();
        } else if (arg1 == 2) {
            this.field3358 = arg0.method2930();
        } else if (arg1 == 3) {
            this.field3359 = arg0.method2930();
        } else if (arg1 == 4) {
            this.field3364 = 0;
        } else if (arg1 == 5) {
            this.field3360 = arg0.method2932();
        } else if (arg1 == 6) {
            arg0.method2930();
        } else if (arg1 == 7) {
            this.field3363 = arg0.method2945();
        } else if (arg1 == 8) {
            this.field3352 = arg0.method2945();
        } else if (arg1 == 11) {
            this.field3364 = arg0.method2932();
        } else if (arg1 == 14) {
            this.field3365 = arg0.method2930();
        } else if (arg1 == 15) {
            this.field3366 = arg0.method2930();
        }
    }

    @ObfuscatedName("iq.q(I)Ljk;")
    public class286 method4111() {
        if (this.field3363 < 0) {
            return null;
        }
        class286 var1 = (class286) field3369.method3308((long) this.field3363);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2165(Statics.field3655, this.field3363, 0);
        if (var2 != null) {
            field3369.method3316(var2, (long) this.field3363);
        }
        return var2;
    }

    @ObfuscatedName("iq.g(I)Ljk;")
    public class286 method4112() {
        if (this.field3352 < 0) {
            return null;
        }
        class286 var1 = (class286) field3369.method3308((long) this.field3352);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method2165(Statics.field3655, this.field3352, 0);
        if (var2 != null) {
            field3369.method3316(var2, (long) this.field3352);
        }
        return var2;
    }

    @ObfuscatedName("ev.v(B)V")
    public static void method2737() {
        field3353.method3311();
        field3369.method3311();
    }
}

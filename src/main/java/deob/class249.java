package deob;

@ObfuscatedName("iq")
public class class249 extends class195 {

    @ObfuscatedName("iq.n")
    public static class190 field3365 = new class190(64);

    @ObfuscatedName("iq.r")
    public static class190 field3371 = new class190(64);

    @ObfuscatedName("iq.v")
    public int field3367;

    @ObfuscatedName("iq.s")
    public int field3369 = 255;

    @ObfuscatedName("iq.w")
    public int field3370 = 255;

    @ObfuscatedName("iq.p")
    public int field3366 = -1;

    @ObfuscatedName("iq.m")
    public int field3364 = 1;

    @ObfuscatedName("iq.u")
    public int field3373 = 70;

    @ObfuscatedName("iq.g")
    public int field3372 = -1;

    @ObfuscatedName("iq.k")
    public int field3375 = -1;

    @ObfuscatedName("iq.t")
    public int field3376 = 30;

    @ObfuscatedName("iq.c")
    public int field3377 = 0;

    @ObfuscatedName("er.a(Lif;Lif;I)V")
    public static void method2642(class236 arg0, class236 arg1) {
        Statics.field3374 = arg0;
        Statics.field3899 = arg1;
    }

    @ObfuscatedName("iq.j(Lfe;B)V")
    public void method4023(class174 arg0) {
        while (true) {
            int var2 = arg0.method2871();
            if (var2 == 0) {
                return;
            }
            this.method4019(arg0, var2);
        }
    }

    @ObfuscatedName("iq.n(Lfe;II)V")
    public void method4019(class174 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2873();
        } else if (arg1 == 2) {
            this.field3369 = arg0.method2871();
        } else if (arg1 == 3) {
            this.field3370 = arg0.method2871();
        } else if (arg1 == 4) {
            this.field3366 = 0;
        } else if (arg1 == 5) {
            this.field3373 = arg0.method2873();
        } else if (arg1 == 6) {
            arg0.method2871();
        } else if (arg1 == 7) {
            this.field3372 = arg0.method2954();
        } else if (arg1 == 8) {
            this.field3375 = arg0.method2954();
        } else if (arg1 == 11) {
            this.field3366 = arg0.method2873();
        } else if (arg1 == 14) {
            this.field3376 = arg0.method2871();
        } else if (arg1 == 15) {
            this.field3377 = arg0.method2871();
        }
    }

    @ObfuscatedName("iq.r(I)Ljt;")
    public class286 method4013() {
        if (this.field3372 < 0) {
            return null;
        }
        class286 var1 = (class286) field3371.method3245((long) this.field3372);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method208(Statics.field3899, this.field3372, 0);
        if (var2 != null) {
            field3371.method3247(var2, (long) this.field3372);
        }
        return var2;
    }

    @ObfuscatedName("iq.v(I)Ljt;")
    public class286 method4022() {
        if (this.field3375 < 0) {
            return null;
        }
        class286 var1 = (class286) field3371.method3245((long) this.field3375);
        if (var1 != null) {
            return var1;
        }
        class286 var2 = class287.method208(Statics.field3899, this.field3375, 0);
        if (var2 != null) {
            field3371.method3247(var2, (long) this.field3375);
        }
        return var2;
    }

    @ObfuscatedName("ed.e(I)V")
    public static void method2658() {
        field3365.method3244();
        field3371.method3244();
    }
}

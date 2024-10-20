package deob;

@ObfuscatedName("gm")
public class class194 extends class130 {

    @ObfuscatedName("gm.i")
    public static class125 field2833 = new class125(64);

    @ObfuscatedName("gm.t")
    public static class125 field2835 = new class125(64);

    @ObfuscatedName("gm.k")
    public int field2843;

    @ObfuscatedName("gm.f")
    public int field2837 = 255;

    @ObfuscatedName("gm.a")
    public int field2842 = 255;

    @ObfuscatedName("gm.r")
    public int field2839 = -1;

    @ObfuscatedName("gm.x")
    public int field2840 = 1;

    @ObfuscatedName("gm.z")
    public int field2841 = 70;

    @ObfuscatedName("gm.p")
    public int field2831 = -1;

    @ObfuscatedName("gm.s")
    public int field2845 = -1;

    @ObfuscatedName("gm.o")
    public int field2844 = 30;

    @ObfuscatedName("gm.y")
    public int field2834 = 0;

    @ObfuscatedName("ce.b(Lgj;Lgj;I)V")
    public static void method1676(class183 arg0, class183 arg1) {
        Statics.field2849 = arg0;
        Statics.field2832 = arg1;
    }

    @ObfuscatedName("az.l(II)Lgm;")
    public static class194 method943(int arg0) {
        class194 var1 = (class194) field2833.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2849.method3226(33, arg0);
        class194 var3 = new class194();
        if (var2 != null) {
            var3.method3393(new class154(var2));
        }
        field2833.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.i(Leg;B)V")
    public void method3393(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3394(arg0, var2);
        }
    }

    @ObfuscatedName("gm.t(Leg;II)V")
    public void method3394(class154 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2801();
        } else if (arg1 == 2) {
            this.field2837 = arg0.method2678();
        } else if (arg1 == 3) {
            this.field2842 = arg0.method2678();
        } else if (arg1 == 4) {
            this.field2839 = 0;
        } else if (arg1 == 5) {
            this.field2841 = arg0.method2801();
        } else if (arg1 == 6) {
            arg0.method2678();
        } else if (arg1 == 7) {
            this.field2831 = arg0.method2788();
        } else if (arg1 == 8) {
            this.field2845 = arg0.method2788();
        } else if (arg1 == 11) {
            this.field2839 = arg0.method2801();
        } else if (arg1 == 14) {
            this.field2844 = arg0.method2678();
        } else if (arg1 == 15) {
            this.field2834 = arg0.method2678();
        }
    }

    @ObfuscatedName("gm.k(B)Lhq;")
    public class225 method3395() {
        if (this.field2831 < 0) {
            return null;
        }
        class225 var1 = (class225) field2835.method2256((long) this.field2831);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3607(Statics.field2832, this.field2831, 0);
        if (var2 != null) {
            field2835.method2258(var2, (long) this.field2831);
        }
        return var2;
    }

    @ObfuscatedName("gm.x(B)Lhq;")
    public class225 method3396() {
        if (this.field2845 < 0) {
            return null;
        }
        class225 var1 = (class225) field2835.method2256((long) this.field2845);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3607(Statics.field2832, this.field2845, 0);
        if (var2 != null) {
            field2835.method2258(var2, (long) this.field2845);
        }
        return var2;
    }
}

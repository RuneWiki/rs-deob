package deob;

@ObfuscatedName("gt")
public class class194 extends class130 {

    @ObfuscatedName("gt.b")
    public static class125 field2831 = new class125(64);

    @ObfuscatedName("gt.g")
    public static class125 field2833 = new class125(64);

    @ObfuscatedName("gt.h")
    public int field2835;

    @ObfuscatedName("gt.c")
    public int field2840 = 255;

    @ObfuscatedName("gt.u")
    public int field2837 = 255;

    @ObfuscatedName("gt.k")
    public int field2838 = -1;

    @ObfuscatedName("gt.z")
    public int field2836 = 1;

    @ObfuscatedName("gt.y")
    public int field2834 = 70;

    @ObfuscatedName("gt.j")
    public int field2841 = -1;

    @ObfuscatedName("gt.f")
    public int field2842 = -1;

    @ObfuscatedName("gt.p")
    public int field2843 = 30;

    @ObfuscatedName("gt.i")
    public int field2844 = 0;

    @ObfuscatedName("dw.o(II)Lgt;")
    public static class194 method2086(int arg0) {
        class194 var1 = (class194) field2831.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2839.method3012(33, arg0);
        class194 var3 = new class194();
        if (var2 != null) {
            var3.method3238(new class154(var2));
        }
        field2831.method2132(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gt.m(Lez;B)V")
    public void method3238(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3233(arg0, var2);
        }
    }

    @ObfuscatedName("gt.b(Lez;II)V")
    public void method3233(class154 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2554();
        } else if (arg1 == 2) {
            this.field2840 = arg0.method2552();
        } else if (arg1 == 3) {
            this.field2837 = arg0.method2552();
        } else if (arg1 == 4) {
            this.field2838 = 0;
        } else if (arg1 == 5) {
            this.field2834 = arg0.method2554();
        } else if (arg1 == 6) {
            arg0.method2552();
        } else if (arg1 == 7) {
            this.field2841 = arg0.method2567();
        } else if (arg1 == 8) {
            this.field2842 = arg0.method2567();
        } else if (arg1 == 11) {
            this.field2838 = arg0.method2554();
        } else if (arg1 == 14) {
            this.field2843 = arg0.method2552();
        } else if (arg1 == 15) {
            this.field2844 = arg0.method2552();
        }
    }

    @ObfuscatedName("gt.g(B)Lhm;")
    public class225 method3239() {
        if (this.field2841 < 0) {
            return null;
        }
        class225 var1 = (class225) field2833.method2130((long) this.field2841);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2535(Statics.field2832, this.field2841, 0);
        if (var2 != null) {
            field2833.method2132(var2, (long) this.field2841);
        }
        return var2;
    }

    @ObfuscatedName("gt.l(B)Lhm;")
    public class225 method3235() {
        if (this.field2842 < 0) {
            return null;
        }
        class225 var1 = (class225) field2833.method2130((long) this.field2842);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2535(Statics.field2832, this.field2842, 0);
        if (var2 != null) {
            field2833.method2132(var2, (long) this.field2842);
        }
        return var2;
    }

    @ObfuscatedName("j.c(S)V")
    public static void method164() {
        field2831.method2139();
        field2833.method2139();
    }
}

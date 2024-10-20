package deob;

@ObfuscatedName("gn")
public class class194 extends class130 {

    @ObfuscatedName("gn.f")
    public static class125 field2838 = new class125(64);

    @ObfuscatedName("gn.k")
    public static class125 field2834 = new class125(64);

    @ObfuscatedName("gn.g")
    public int field2835;

    @ObfuscatedName("gn.q")
    public int field2845 = 255;

    @ObfuscatedName("gn.w")
    public int field2840 = 255;

    @ObfuscatedName("gn.v")
    public int field2839 = -1;

    @ObfuscatedName("gn.h")
    public int field2831 = 1;

    @ObfuscatedName("gn.p")
    public int field2842 = 70;

    @ObfuscatedName("gn.l")
    public int field2843 = -1;

    @ObfuscatedName("gn.c")
    public int field2844 = -1;

    @ObfuscatedName("gn.m")
    public int field2841 = 30;

    @ObfuscatedName("gn.r")
    public int field2846 = 0;

    @ObfuscatedName("m.i(IB)Lgn;")
    public static class194 method169(int arg0) {
        class194 var1 = (class194) field2838.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2833.method3014(33, arg0);
        class194 var3 = new class194();
        if (var2 != null) {
            var3.method3263(new class154(var2));
        }
        field2838.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gn.e(Let;I)V")
    public void method3263(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3266(arg0, var2);
        }
    }

    @ObfuscatedName("gn.f(Let;IB)V")
    public void method3266(class154 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2575();
        } else if (arg1 == 2) {
            this.field2845 = arg0.method2573();
        } else if (arg1 == 3) {
            this.field2840 = arg0.method2573();
        } else if (arg1 == 4) {
            this.field2839 = 0;
        } else if (arg1 == 5) {
            this.field2842 = arg0.method2575();
        } else if (arg1 == 6) {
            arg0.method2573();
        } else if (arg1 == 7) {
            this.field2843 = arg0.method2588();
        } else if (arg1 == 8) {
            this.field2844 = arg0.method2588();
        } else if (arg1 == 11) {
            this.field2839 = arg0.method2575();
        } else if (arg1 == 14) {
            this.field2841 = arg0.method2573();
        } else if (arg1 == 15) {
            this.field2846 = arg0.method2573();
        }
    }

    @ObfuscatedName("gn.k(B)Lhj;")
    public class225 method3264() {
        if (this.field2843 < 0) {
            return null;
        }
        class225 var1 = (class225) field2834.method2150((long) this.field2843);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method219(Statics.field2832, this.field2843, 0);
        if (var2 != null) {
            field2834.method2152(var2, (long) this.field2843);
        }
        return var2;
    }

    @ObfuscatedName("gn.a(B)Lhj;")
    public class225 method3265() {
        if (this.field2844 < 0) {
            return null;
        }
        class225 var1 = (class225) field2834.method2150((long) this.field2844);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method219(Statics.field2832, this.field2844, 0);
        if (var2 != null) {
            field2834.method2152(var2, (long) this.field2844);
        }
        return var2;
    }

    @ObfuscatedName("ft.q(B)V")
    public static void method2765() {
        field2838.method2155();
        field2834.method2155();
    }
}

package deob;

@ObfuscatedName("gp")
public class class194 extends class130 {

    @ObfuscatedName("gp.g")
    public static class125 field2837 = new class125(64);

    @ObfuscatedName("gp.v")
    public static class125 field2838 = new class125(64);

    @ObfuscatedName("gp.y")
    public int field2839;

    @ObfuscatedName("gp.m")
    public int field2841 = 255;

    @ObfuscatedName("gp.a")
    public int field2842 = 255;

    @ObfuscatedName("gp.i")
    public int field2835 = -1;

    @ObfuscatedName("gp.s")
    public int field2843 = 1;

    @ObfuscatedName("gp.k")
    public int field2849 = 70;

    @ObfuscatedName("gp.f")
    public int field2846 = -1;

    @ObfuscatedName("gp.o")
    public int field2845 = -1;

    @ObfuscatedName("gp.q")
    public int field2848 = 30;

    @ObfuscatedName("gp.c")
    public int field2844 = 0;

    @ObfuscatedName("gp.n(Leq;B)V")
    public void method3379(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3387(arg0, var2);
        }
    }

    @ObfuscatedName("gp.g(Leq;II)V")
    public void method3387(class154 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2833();
        } else if (arg1 == 2) {
            this.field2841 = arg0.method2878();
        } else if (arg1 == 3) {
            this.field2842 = arg0.method2878();
        } else if (arg1 == 4) {
            this.field2835 = 0;
        } else if (arg1 == 5) {
            this.field2849 = arg0.method2833();
        } else if (arg1 == 6) {
            arg0.method2878();
        } else if (arg1 == 7) {
            this.field2846 = arg0.method2716();
        } else if (arg1 == 8) {
            this.field2845 = arg0.method2716();
        } else if (arg1 == 11) {
            this.field2835 = arg0.method2833();
        } else if (arg1 == 14) {
            this.field2848 = arg0.method2878();
        } else if (arg1 == 15) {
            this.field2844 = arg0.method2878();
        }
    }

    @ObfuscatedName("gp.v(B)Lhe;")
    public class225 method3378() {
        if (this.field2846 < 0) {
            return null;
        }
        class225 var1 = (class225) field2838.method2275((long) this.field2846);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2149(Statics.field2851, this.field2846, 0);
        if (var2 != null) {
            field2838.method2282(var2, (long) this.field2846);
        }
        return var2;
    }

    @ObfuscatedName("gp.y(I)Lhe;")
    public class225 method3382() {
        if (this.field2845 < 0) {
            return null;
        }
        class225 var1 = (class225) field2838.method2275((long) this.field2845);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2149(Statics.field2851, this.field2845, 0);
        if (var2 != null) {
            field2838.method2282(var2, (long) this.field2845);
        }
        return var2;
    }

    @ObfuscatedName("aj.p(B)V")
    public static void method818() {
        field2837.method2277();
        field2838.method2277();
    }
}

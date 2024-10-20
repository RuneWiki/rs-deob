package deob;

@ObfuscatedName("gf")
public class class194 extends class130 {

    @ObfuscatedName("gf.f")
    public static class125 field2848 = new class125(64);

    @ObfuscatedName("gf.h")
    public static class125 field2838 = new class125(64);

    @ObfuscatedName("gf.a")
    public int field2839;

    @ObfuscatedName("gf.u")
    public int field2841 = 255;

    @ObfuscatedName("gf.b")
    public int field2837 = 255;

    @ObfuscatedName("gf.x")
    public int field2843 = -1;

    @ObfuscatedName("gf.r")
    public int field2847 = 1;

    @ObfuscatedName("gf.n")
    public int field2850 = 70;

    @ObfuscatedName("gf.m")
    public int field2845 = -1;

    @ObfuscatedName("gf.j")
    public int field2846 = -1;

    @ObfuscatedName("gf.w")
    public int field2842 = 30;

    @ObfuscatedName("gf.p")
    public int field2849 = 0;

    @ObfuscatedName("ff.s(IB)Lgf;")
    public static class194 method2767(int arg0) {
        class194 var1 = (class194) field2848.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field74.method2986(33, arg0);
        class194 var3 = new class194();
        if (var2 != null) {
            var3.method3205(new class154(var2));
        }
        field2848.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gf.c(Lea;I)V")
    public void method3205(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3206(arg0, var2);
        }
    }

    @ObfuscatedName("gf.f(Lea;IB)V")
    public void method3206(class154 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2541();
        } else if (arg1 == 2) {
            this.field2841 = arg0.method2545();
        } else if (arg1 == 3) {
            this.field2837 = arg0.method2545();
        } else if (arg1 == 4) {
            this.field2843 = 0;
        } else if (arg1 == 5) {
            this.field2850 = arg0.method2541();
        } else if (arg1 == 6) {
            arg0.method2545();
        } else if (arg1 == 7) {
            this.field2845 = arg0.method2560();
        } else if (arg1 == 8) {
            this.field2846 = arg0.method2560();
        } else if (arg1 == 11) {
            this.field2843 = arg0.method2541();
        } else if (arg1 == 14) {
            this.field2842 = arg0.method2545();
        } else if (arg1 == 15) {
            this.field2849 = arg0.method2545();
        }
    }

    @ObfuscatedName("gf.g(I)Lhk;")
    public class225 method3207() {
        if (this.field2845 < 0) {
            return null;
        }
        class225 var1 = (class225) field2838.method2121((long) this.field2845);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method706(Statics.field1849, this.field2845, 0);
        if (var2 != null) {
            field2838.method2123(var2, (long) this.field2845);
        }
        return var2;
    }

    @ObfuscatedName("gf.k(I)Lhk;")
    public class225 method3208() {
        if (this.field2846 < 0) {
            return null;
        }
        class225 var1 = (class225) field2838.method2121((long) this.field2846);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method706(Statics.field1849, this.field2846, 0);
        if (var2 != null) {
            field2838.method2123(var2, (long) this.field2846);
        }
        return var2;
    }

    @ObfuscatedName("ae.u(B)V")
    public static void method663() {
        field2848.method2124();
        field2838.method2124();
    }
}

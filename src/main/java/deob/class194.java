package deob;

@ObfuscatedName("go")
public class class194 extends class130 {

    @ObfuscatedName("go.u")
    public static class125 field2842 = new class125(64);

    @ObfuscatedName("go.h")
    public static class125 field2855 = new class125(64);

    @ObfuscatedName("go.r")
    public int field2846;

    @ObfuscatedName("go.n")
    public int field2840 = 255;

    @ObfuscatedName("go.m")
    public int field2850 = 255;

    @ObfuscatedName("go.w")
    public int field2848 = -1;

    @ObfuscatedName("go.j")
    public int field2849 = 1;

    @ObfuscatedName("go.s")
    public int field2841 = 70;

    @ObfuscatedName("go.q")
    public int field2851 = -1;

    @ObfuscatedName("go.d")
    public int field2852 = -1;

    @ObfuscatedName("go.p")
    public int field2844 = 30;

    @ObfuscatedName("go.y")
    public int field2854 = 0;

    @ObfuscatedName("go.f(Leo;I)V")
    public void method3348(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3351(arg0, var2);
        }
    }

    @ObfuscatedName("go.i(Leo;IB)V")
    public void method3351(class154 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2668();
        } else if (arg1 == 2) {
            this.field2840 = arg0.method2666();
        } else if (arg1 == 3) {
            this.field2850 = arg0.method2666();
        } else if (arg1 == 4) {
            this.field2848 = 0;
        } else if (arg1 == 5) {
            this.field2841 = arg0.method2668();
        } else if (arg1 == 6) {
            arg0.method2666();
        } else if (arg1 == 7) {
            this.field2851 = arg0.method2681();
        } else if (arg1 == 8) {
            this.field2852 = arg0.method2681();
        } else if (arg1 == 11) {
            this.field2848 = arg0.method2668();
        } else if (arg1 == 14) {
            this.field2844 = arg0.method2666();
        } else if (arg1 == 15) {
            this.field2854 = arg0.method2666();
        }
    }

    @ObfuscatedName("go.u(S)Lhe;")
    public class225 method3349() {
        if (this.field2851 < 0) {
            return null;
        }
        class225 var1 = (class225) field2855.method2240((long) this.field2851);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = Statics.method565(Statics.field2843, this.field2851, 0);
        if (var2 != null) {
            field2855.method2246(var2, (long) this.field2851);
        }
        return var2;
    }

    @ObfuscatedName("go.r(I)Lhe;")
    public class225 method3350() {
        if (this.field2852 < 0) {
            return null;
        }
        class225 var1 = (class225) field2855.method2240((long) this.field2852);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = Statics.method565(Statics.field2843, this.field2852, 0);
        if (var2 != null) {
            field2855.method2246(var2, (long) this.field2852);
        }
        return var2;
    }

    @ObfuscatedName("gn.o(I)V")
    public static void method3453() {
        field2842.method2244();
        field2855.method2244();
    }
}

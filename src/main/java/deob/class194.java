package deob;

@ObfuscatedName("gk")
public class class194 extends class130 {

    @ObfuscatedName("gk.m")
    public static class125 field2834 = new class125(64);

    @ObfuscatedName("gk.h")
    public static class125 field2832 = new class125(64);

    @ObfuscatedName("gk.w")
    public int field2836;

    @ObfuscatedName("gk.p")
    public int field2839 = 255;

    @ObfuscatedName("gk.g")
    public int field2841 = 255;

    @ObfuscatedName("gk.z")
    public int field2838 = -1;

    @ObfuscatedName("gk.q")
    public int field2840 = 1;

    @ObfuscatedName("gk.l")
    public int field2842 = 70;

    @ObfuscatedName("gk.y")
    public int field2843 = -1;

    @ObfuscatedName("gk.e")
    public int field2835 = -1;

    @ObfuscatedName("gk.x")
    public int field2845 = 30;

    @ObfuscatedName("gk.f")
    public int field2846 = 0;

    @ObfuscatedName("ee.n(Lgj;Lgj;I)V")
    public static void method2489(class183 arg0, class183 arg1) {
        Statics.field2844 = arg0;
        Statics.field2833 = arg1;
    }

    @ObfuscatedName("gk.d(Lfa;I)V")
    public void method3335(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3326(arg0, var2);
        }
    }

    @ObfuscatedName("gk.m(Lfa;II)V")
    public void method3326(class161 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2887();
        } else if (arg1 == 2) {
            this.field2839 = arg0.method2823();
        } else if (arg1 == 3) {
            this.field2841 = arg0.method2823();
        } else if (arg1 == 4) {
            this.field2838 = 0;
        } else if (arg1 == 5) {
            this.field2842 = arg0.method2887();
        } else if (arg1 == 6) {
            arg0.method2823();
        } else if (arg1 == 7) {
            this.field2843 = arg0.method2795();
        } else if (arg1 == 8) {
            this.field2835 = arg0.method2795();
        } else if (arg1 == 11) {
            this.field2838 = arg0.method2887();
        } else if (arg1 == 14) {
            this.field2845 = arg0.method2823();
        } else if (arg1 == 15) {
            this.field2846 = arg0.method2823();
        }
    }

    @ObfuscatedName("gk.h(I)Lhf;")
    public class225 method3328() {
        if (this.field2843 < 0) {
            return null;
        }
        class225 var1 = (class225) field2832.method2221((long) this.field2843);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3650(Statics.field2833, this.field2843, 0);
        if (var2 != null) {
            field2832.method2219(var2, (long) this.field2843);
        }
        return var2;
    }

    @ObfuscatedName("gk.w(I)Lhf;")
    public class225 method3343() {
        if (this.field2835 < 0) {
            return null;
        }
        class225 var1 = (class225) field2832.method2221((long) this.field2835);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3650(Statics.field2833, this.field2835, 0);
        if (var2 != null) {
            field2832.method2219(var2, (long) this.field2835);
        }
        return var2;
    }

    @ObfuscatedName("dk.r(S)V")
    public static void method1994() {
        field2834.method2220();
        field2832.method2220();
    }
}

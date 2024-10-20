package deob;

@ObfuscatedName("gz")
public class class196 extends class151 {

    @ObfuscatedName("gz.n")
    public static class146 field2849 = new class146(64);

    @ObfuscatedName("gz.q")
    public static class146 field2856 = new class146(64);

    @ObfuscatedName("gz.t")
    public int field2857;

    @ObfuscatedName("gz.z")
    public int field2852 = 255;

    @ObfuscatedName("gz.l")
    public int field2854 = 255;

    @ObfuscatedName("gz.v")
    public int field2850 = -1;

    @ObfuscatedName("gz.g")
    public int field2855 = 1;

    @ObfuscatedName("gz.w")
    public int field2851 = 70;

    @ObfuscatedName("gz.r")
    public int field2847 = -1;

    @ObfuscatedName("gz.s")
    public int field2858 = -1;

    @ObfuscatedName("gz.k")
    public int field2859 = 30;

    @ObfuscatedName("gz.e")
    public int field2860 = 0;

    @ObfuscatedName("fg.d(Lgd;Lgd;I)V")
    public static void method2840(class185 arg0, class185 arg1) {
        Statics.field2853 = arg0;
        Statics.field2848 = arg1;
    }

    @ObfuscatedName("gz.c(Ldu;I)V")
    public void method3338(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3328(arg0, var2);
        }
    }

    @ObfuscatedName("gz.n(Ldu;II)V")
    public void method3328(class130 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2232();
        } else if (arg1 == 2) {
            this.field2852 = arg0.method2379();
        } else if (arg1 == 3) {
            this.field2854 = arg0.method2379();
        } else if (arg1 == 4) {
            this.field2850 = 0;
        } else if (arg1 == 5) {
            this.field2851 = arg0.method2232();
        } else if (arg1 == 6) {
            arg0.method2379();
        } else if (arg1 == 7) {
            this.field2847 = arg0.method2244();
        } else if (arg1 == 8) {
            this.field2858 = arg0.method2244();
        } else if (arg1 == 11) {
            this.field2850 = arg0.method2232();
        } else if (arg1 == 14) {
            this.field2859 = arg0.method2379();
        } else if (arg1 == 15) {
            this.field2860 = arg0.method2379();
        }
    }

    @ObfuscatedName("gz.q(I)Lhu;")
    public class229 method3329() {
        if (this.field2847 < 0) {
            return null;
        }
        class229 var1 = (class229) field2856.method2598((long) this.field2847);
        if (var1 != null) {
            return var1;
        }
        class229 var2 = class230.method204(Statics.field2848, this.field2847, 0);
        if (var2 != null) {
            field2856.method2607(var2, (long) this.field2847);
        }
        return var2;
    }

    @ObfuscatedName("gz.t(S)Lhu;")
    public class229 method3339() {
        if (this.field2858 < 0) {
            return null;
        }
        class229 var1 = (class229) field2856.method2598((long) this.field2858);
        if (var1 != null) {
            return var1;
        }
        class229 var2 = class230.method204(Statics.field2848, this.field2858, 0);
        if (var2 != null) {
            field2856.method2607(var2, (long) this.field2858);
        }
        return var2;
    }

    @ObfuscatedName("gr.p(B)V")
    public static void method3257() {
        field2849.method2603();
        field2856.method2603();
    }
}

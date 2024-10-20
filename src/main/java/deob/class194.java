package deob;

@ObfuscatedName("gb")
public class class194 extends class130 {

    @ObfuscatedName("gb.x")
    public static class125 field2839 = new class125(64);

    @ObfuscatedName("gb.q")
    public static class125 field2828 = new class125(64);

    @ObfuscatedName("gb.d")
    public int field2832;

    @ObfuscatedName("gb.s")
    public int field2833 = 255;

    @ObfuscatedName("gb.o")
    public int field2838 = 255;

    @ObfuscatedName("gb.a")
    public int field2834 = -1;

    @ObfuscatedName("gb.c")
    public int field2835 = 1;

    @ObfuscatedName("gb.m")
    public int field2836 = 70;

    @ObfuscatedName("gb.h")
    public int field2837 = -1;

    @ObfuscatedName("gb.r")
    public int field2829 = -1;

    @ObfuscatedName("gb.u")
    public int field2827 = 30;

    @ObfuscatedName("gb.i")
    public int field2840 = 0;

    @ObfuscatedName("fj.p(Lgp;Lgp;I)V")
    public static void method3008(class183 arg0, class183 arg1) {
        Statics.field2184 = arg0;
        Statics.field3171 = arg1;
    }

    @ObfuscatedName("gb.x(Lev;B)V")
    public void method3265(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3266(arg0, var2);
        }
    }

    @ObfuscatedName("gb.q(Lev;II)V")
    public void method3266(class154 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2595();
        } else if (arg1 == 2) {
            this.field2833 = arg0.method2593();
        } else if (arg1 == 3) {
            this.field2838 = arg0.method2593();
        } else if (arg1 == 4) {
            this.field2834 = 0;
        } else if (arg1 == 5) {
            this.field2836 = arg0.method2595();
        } else if (arg1 == 6) {
            arg0.method2593();
        } else if (arg1 == 7) {
            this.field2837 = arg0.method2622();
        } else if (arg1 == 8) {
            this.field2829 = arg0.method2622();
        } else if (arg1 == 11) {
            this.field2834 = arg0.method2595();
        } else if (arg1 == 14) {
            this.field2827 = arg0.method2593();
        } else if (arg1 == 15) {
            this.field2840 = arg0.method2593();
        }
    }

    @ObfuscatedName("gb.d(I)Lhs;")
    public class225 method3264() {
        if (this.field2837 < 0) {
            return null;
        }
        class225 var1 = (class225) field2828.method2169((long) this.field2837);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3170(Statics.field3171, this.field2837, 0);
        if (var2 != null) {
            field2828.method2174(var2, (long) this.field2837);
        }
        return var2;
    }

    @ObfuscatedName("gb.k(B)Lhs;")
    public class225 method3268() {
        if (this.field2829 < 0) {
            return null;
        }
        class225 var1 = (class225) field2828.method2169((long) this.field2829);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3170(Statics.field3171, this.field2829, 0);
        if (var2 != null) {
            field2828.method2174(var2, (long) this.field2829);
        }
        return var2;
    }

    @ObfuscatedName("u.j(B)V")
    public static void method179() {
        field2839.method2170();
        field2828.method2170();
    }
}

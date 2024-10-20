package deob;

@ObfuscatedName("gb")
public class class194 extends class130 {

    @ObfuscatedName("gb.c")
    public static class125 field2843 = new class125(64);

    @ObfuscatedName("gb.l")
    public static class125 field2842 = new class125(64);

    @ObfuscatedName("gb.y")
    public int field2841;

    @ObfuscatedName("gb.s")
    public int field2854 = 255;

    @ObfuscatedName("gb.r")
    public int field2844 = 255;

    @ObfuscatedName("gb.t")
    public int field2845 = -1;

    @ObfuscatedName("gb.k")
    public int field2847 = 1;

    @ObfuscatedName("gb.f")
    public int field2848 = 70;

    @ObfuscatedName("gb.a")
    public int field2849 = -1;

    @ObfuscatedName("gb.v")
    public int field2850 = -1;

    @ObfuscatedName("gb.d")
    public int field2851 = 30;

    @ObfuscatedName("gb.o")
    public int field2852 = 0;

    @ObfuscatedName("hx.b(Lgv;Lgv;I)V")
    public static void method3795(class183 arg0, class183 arg1) {
        Statics.field2839 = arg0;
        Statics.field2846 = arg1;
    }

    @ObfuscatedName("hx.e(IB)Lgb;")
    public static class194 method3794(int arg0) {
        class194 var1 = (class194) field2843.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2839.method3126(33, arg0);
        class194 var3 = new class194();
        if (var2 != null) {
            var3.method3359(new class154(var2));
        }
        field2843.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gb.c(Lec;I)V")
    public void method3359(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3360(arg0, var2);
        }
    }

    @ObfuscatedName("gb.l(Lec;II)V")
    public void method3360(class154 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2671();
        } else if (arg1 == 2) {
            this.field2854 = arg0.method2669();
        } else if (arg1 == 3) {
            this.field2844 = arg0.method2669();
        } else if (arg1 == 4) {
            this.field2845 = 0;
        } else if (arg1 == 5) {
            this.field2848 = arg0.method2671();
        } else if (arg1 == 6) {
            arg0.method2669();
        } else if (arg1 == 7) {
            this.field2849 = arg0.method2684();
        } else if (arg1 == 8) {
            this.field2850 = arg0.method2684();
        } else if (arg1 == 11) {
            this.field2845 = arg0.method2671();
        } else if (arg1 == 14) {
            this.field2851 = arg0.method2669();
        } else if (arg1 == 15) {
            this.field2852 = arg0.method2669();
        }
    }

    @ObfuscatedName("gb.y(B)Lhg;")
    public class225 method3361() {
        if (this.field2849 < 0) {
            return null;
        }
        class225 var1 = (class225) field2842.method2246((long) this.field2849);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2507(Statics.field2846, this.field2849, 0);
        if (var2 != null) {
            field2842.method2250(var2, (long) this.field2849);
        }
        return var2;
    }

    @ObfuscatedName("gb.j(I)Lhg;")
    public class225 method3362() {
        if (this.field2850 < 0) {
            return null;
        }
        class225 var1 = (class225) field2842.method2246((long) this.field2850);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method2507(Statics.field2846, this.field2850, 0);
        if (var2 != null) {
            field2842.method2250(var2, (long) this.field2850);
        }
        return var2;
    }
}

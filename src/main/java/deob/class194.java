package deob;

@ObfuscatedName("gd")
public class class194 extends class130 {

    @ObfuscatedName("gd.i")
    public static class125 field2816 = new class125(64);

    @ObfuscatedName("gd.a")
    public static class125 field2825 = new class125(64);

    @ObfuscatedName("gd.f")
    public int field2818;

    @ObfuscatedName("gd.l")
    public int field2814 = 255;

    @ObfuscatedName("gd.g")
    public int field2820 = 255;

    @ObfuscatedName("gd.z")
    public int field2823 = -1;

    @ObfuscatedName("gd.t")
    public int field2824 = 1;

    @ObfuscatedName("gd.m")
    public int field2815 = 70;

    @ObfuscatedName("gd.q")
    public int field2829 = -1;

    @ObfuscatedName("gd.e")
    public int field2827 = -1;

    @ObfuscatedName("gd.v")
    public int field2828 = 30;

    @ObfuscatedName("gd.j")
    public int field2821 = 0;

    @ObfuscatedName("dw.u(Lgt;Lgt;B)V")
    public static void method2068(class183 arg0, class183 arg1) {
        Statics.field2822 = arg0;
        Statics.field2817 = arg1;
    }

    @ObfuscatedName("cw.x(II)Lgd;")
    public static class194 method1784(int arg0) {
        class194 var1 = (class194) field2816.method2186((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2822.method3071(33, arg0);
        class194 var3 = new class194();
        if (var2 != null) {
            var3.method3308(new class154(var2));
        }
        field2816.method2179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gd.i(Len;I)V")
    public void method3308(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3306(arg0, var2);
        }
    }

    @ObfuscatedName("gd.a(Len;IB)V")
    public void method3306(class154 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2581();
        } else if (arg1 == 2) {
            this.field2814 = arg0.method2708();
        } else if (arg1 == 3) {
            this.field2820 = arg0.method2708();
        } else if (arg1 == 4) {
            this.field2823 = 0;
        } else if (arg1 == 5) {
            this.field2815 = arg0.method2581();
        } else if (arg1 == 6) {
            arg0.method2708();
        } else if (arg1 == 7) {
            this.field2829 = arg0.method2603();
        } else if (arg1 == 8) {
            this.field2827 = arg0.method2603();
        } else if (arg1 == 11) {
            this.field2823 = arg0.method2581();
        } else if (arg1 == 14) {
            this.field2828 = arg0.method2708();
        } else if (arg1 == 15) {
            this.field2821 = arg0.method2708();
        }
    }

    @ObfuscatedName("gd.c(I)Lhs;")
    public class225 method3312() {
        if (this.field2829 < 0) {
            return null;
        }
        class225 var1 = (class225) field2825.method2186((long) this.field2829);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1340(Statics.field2817, this.field2829, 0);
        if (var2 != null) {
            field2825.method2179(var2, (long) this.field2829);
        }
        return var2;
    }

    @ObfuscatedName("gd.g(I)Lhs;")
    public class225 method3310() {
        if (this.field2827 < 0) {
            return null;
        }
        class225 var1 = (class225) field2825.method2186((long) this.field2827);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1340(Statics.field2817, this.field2827, 0);
        if (var2 != null) {
            field2825.method2179(var2, (long) this.field2827);
        }
        return var2;
    }
}

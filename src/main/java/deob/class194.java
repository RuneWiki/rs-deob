package deob;

@ObfuscatedName("gq")
public class class194 extends class130 {

    @ObfuscatedName("gq.c")
    public static class125 field2829 = new class125(64);

    @ObfuscatedName("gq.d")
    public static class125 field2841 = new class125(64);

    @ObfuscatedName("gq.w")
    public int field2838;

    @ObfuscatedName("gq.k")
    public int field2834 = 255;

    @ObfuscatedName("gq.g")
    public int field2835 = 255;

    @ObfuscatedName("gq.y")
    public int field2836 = -1;

    @ObfuscatedName("gq.e")
    public int field2837 = 1;

    @ObfuscatedName("gq.q")
    public int field2830 = 70;

    @ObfuscatedName("gq.v")
    public int field2839 = -1;

    @ObfuscatedName("gq.l")
    public int field2840 = -1;

    @ObfuscatedName("gq.s")
    public int field2844 = 30;

    @ObfuscatedName("gq.r")
    public int field2842 = 0;

    @ObfuscatedName("gg.x(IB)Lgq;")
    public static class194 method3316(int arg0) {
        class194 var1 = (class194) field2829.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2828.method3121(33, arg0);
        class194 var3 = new class194();
        if (var2 != null) {
            var3.method3318(new class154(var2));
        }
        field2829.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gq.j(Lek;B)V")
    public void method3318(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3319(arg0, var2);
        }
    }

    @ObfuscatedName("gq.c(Lek;IB)V")
    public void method3319(class154 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2745();
        } else if (arg1 == 2) {
            this.field2834 = arg0.method2701();
        } else if (arg1 == 3) {
            this.field2835 = arg0.method2701();
        } else if (arg1 == 4) {
            this.field2836 = 0;
        } else if (arg1 == 5) {
            this.field2830 = arg0.method2745();
        } else if (arg1 == 6) {
            arg0.method2701();
        } else if (arg1 == 7) {
            this.field2839 = arg0.method2654();
        } else if (arg1 == 8) {
            this.field2840 = arg0.method2654();
        } else if (arg1 == 11) {
            this.field2836 = arg0.method2745();
        } else if (arg1 == 14) {
            this.field2844 = arg0.method2701();
        } else if (arg1 == 15) {
            this.field2842 = arg0.method2701();
        }
    }

    @ObfuscatedName("gq.d(I)Lhs;")
    public class225 method3320() {
        if (this.field2839 < 0) {
            return null;
        }
        class225 var1 = (class225) field2841.method2221((long) this.field2839);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1887(Statics.field2827, this.field2839, 0);
        if (var2 != null) {
            field2841.method2223(var2, (long) this.field2839);
        }
        return var2;
    }

    @ObfuscatedName("gq.w(I)Lhs;")
    public class225 method3321() {
        if (this.field2840 < 0) {
            return null;
        }
        class225 var1 = (class225) field2841.method2221((long) this.field2840);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1887(Statics.field2827, this.field2840, 0);
        if (var2 != null) {
            field2841.method2223(var2, (long) this.field2840);
        }
        return var2;
    }

    @ObfuscatedName("fe.u(B)V")
    public static void method3075() {
        field2829.method2225();
        field2841.method2225();
    }
}

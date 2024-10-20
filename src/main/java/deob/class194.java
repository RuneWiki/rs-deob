package deob;

@ObfuscatedName("gy")
public class class194 extends class130 {

    @ObfuscatedName("gy.o")
    public static class125 field2822 = new class125(64);

    @ObfuscatedName("gy.r")
    public static class125 field2815 = new class125(64);

    @ObfuscatedName("gy.w")
    public int field2818;

    @ObfuscatedName("gy.d")
    public int field2821 = 255;

    @ObfuscatedName("gy.n")
    public int field2819 = 255;

    @ObfuscatedName("gy.c")
    public int field2823 = -1;

    @ObfuscatedName("gy.s")
    public int field2824 = 1;

    @ObfuscatedName("gy.g")
    public int field2817 = 70;

    @ObfuscatedName("gy.i")
    public int field2826 = -1;

    @ObfuscatedName("gy.v")
    public int field2829 = -1;

    @ObfuscatedName("gy.a")
    public int field2828 = 30;

    @ObfuscatedName("gy.h")
    public int field2825 = 0;

    @ObfuscatedName("m.k(II)Lgy;")
    public static class194 method232(int arg0) {
        class194 var1 = (class194) field2822.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2827.method3065(33, arg0);
        class194 var3 = new class194();
        if (var2 != null) {
            var3.method3296(new class161(var2));
        }
        field2822.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.y(Lfm;I)V")
    public void method3296(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3301(arg0, var2);
        }
    }

    @ObfuscatedName("gy.o(Lfm;II)V")
    public void method3301(class161 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2735();
        } else if (arg1 == 2) {
            this.field2821 = arg0.method2733();
        } else if (arg1 == 3) {
            this.field2819 = arg0.method2733();
        } else if (arg1 == 4) {
            this.field2823 = 0;
        } else if (arg1 == 5) {
            this.field2817 = arg0.method2735();
        } else if (arg1 == 6) {
            arg0.method2733();
        } else if (arg1 == 7) {
            this.field2826 = arg0.method2902();
        } else if (arg1 == 8) {
            this.field2829 = arg0.method2902();
        } else if (arg1 == 11) {
            this.field2823 = arg0.method2735();
        } else if (arg1 == 14) {
            this.field2828 = arg0.method2733();
        } else if (arg1 == 15) {
            this.field2825 = arg0.method2733();
        }
    }

    @ObfuscatedName("gy.r(S)Lhv;")
    public class225 method3310() {
        if (this.field2826 < 0) {
            return null;
        }
        class225 var1 = (class225) field2815.method2159((long) this.field2826);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1109(Statics.field2816, this.field2826, 0);
        if (var2 != null) {
            field2815.method2164(var2, (long) this.field2826);
        }
        return var2;
    }

    @ObfuscatedName("gy.w(I)Lhv;")
    public class225 method3299() {
        if (this.field2829 < 0) {
            return null;
        }
        class225 var1 = (class225) field2815.method2159((long) this.field2829);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method1109(Statics.field2816, this.field2829, 0);
        if (var2 != null) {
            field2815.method2164(var2, (long) this.field2829);
        }
        return var2;
    }

    @ObfuscatedName("ah.j(B)V")
    public static void method690() {
        field2822.method2161();
        field2815.method2161();
    }
}

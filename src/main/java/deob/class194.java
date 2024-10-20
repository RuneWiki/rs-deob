package deob;

@ObfuscatedName("gt")
public class class194 extends class130 {

    @ObfuscatedName("gt.h")
    public static class125 field2835 = new class125(64);

    @ObfuscatedName("gt.p")
    public static class125 field2836 = new class125(64);

    @ObfuscatedName("gt.j")
    public int field2842;

    @ObfuscatedName("gt.c")
    public int field2844 = 255;

    @ObfuscatedName("gt.i")
    public int field2845 = 255;

    @ObfuscatedName("gt.o")
    public int field2840 = -1;

    @ObfuscatedName("gt.m")
    public int field2841 = 1;

    @ObfuscatedName("gt.s")
    public int field2839 = 70;

    @ObfuscatedName("gt.u")
    public int field2843 = -1;

    @ObfuscatedName("gt.b")
    public int field2833 = -1;

    @ObfuscatedName("gt.v")
    public int field2837 = 30;

    @ObfuscatedName("gt.f")
    public int field2846 = 0;

    @ObfuscatedName("ac.q(II)Lgt;")
    public static class194 method777(int arg0) {
        class194 var1 = (class194) field2835.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2838.method3133(33, arg0);
        class194 var3 = new class194();
        if (var2 != null) {
            var3.method3335(new class154(var2));
        }
        field2835.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gt.d(Lel;I)V")
    public void method3335(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3355(arg0, var2);
        }
    }

    @ObfuscatedName("gt.h(Lel;II)V")
    public void method3355(class154 arg0, int arg1) {
        if (arg1 == 1) {
            arg0.method2668();
        } else if (arg1 == 2) {
            this.field2844 = arg0.method2666();
        } else if (arg1 == 3) {
            this.field2845 = arg0.method2666();
        } else if (arg1 == 4) {
            this.field2840 = 0;
        } else if (arg1 == 5) {
            this.field2839 = arg0.method2668();
        } else if (arg1 == 6) {
            arg0.method2666();
        } else if (arg1 == 7) {
            this.field2843 = arg0.method2862();
        } else if (arg1 == 8) {
            this.field2833 = arg0.method2862();
        } else if (arg1 == 11) {
            this.field2840 = arg0.method2668();
        } else if (arg1 == 14) {
            this.field2837 = arg0.method2666();
        } else if (arg1 == 15) {
            this.field2846 = arg0.method2666();
        }
    }

    @ObfuscatedName("gt.p(I)Lhy;")
    public class225 method3351() {
        if (this.field2843 < 0) {
            return null;
        }
        class225 var1 = (class225) field2836.method2258((long) this.field2843);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3118(Statics.field2834, this.field2843, 0);
        if (var2 != null) {
            field2836.method2248(var2, (long) this.field2843);
        }
        return var2;
    }

    @ObfuscatedName("gt.j(I)Lhy;")
    public class225 method3337() {
        if (this.field2833 < 0) {
            return null;
        }
        class225 var1 = (class225) field2836.method2258((long) this.field2833);
        if (var1 != null) {
            return var1;
        }
        class225 var2 = class226.method3118(Statics.field2834, this.field2833, 0);
        if (var2 != null) {
            field2836.method2248(var2, (long) this.field2833);
        }
        return var2;
    }
}

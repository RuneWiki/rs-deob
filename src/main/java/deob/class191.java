package deob;

@ObfuscatedName("gt")
public class class191 extends class130 {

    @ObfuscatedName("gt.u")
    public static class125 field2805 = new class125(64);

    @ObfuscatedName("gt.h")
    public static class125 field2819 = new class125(30);

    @ObfuscatedName("gt.r")
    public int field2807;

    @ObfuscatedName("gt.o")
    public int field2808;

    @ObfuscatedName("gt.l")
    public int field2809 = -1;

    @ObfuscatedName("gt.n")
    public short[] field2818;

    @ObfuscatedName("gt.m")
    public short[] field2810;

    @ObfuscatedName("gt.w")
    public short[] field2820;

    @ObfuscatedName("gt.j")
    public short[] field2813;

    @ObfuscatedName("gt.s")
    public int field2814 = 128;

    @ObfuscatedName("gt.q")
    public int field2815 = 128;

    @ObfuscatedName("gt.d")
    public int field2816 = 0;

    @ObfuscatedName("gt.p")
    public int field2817 = 0;

    @ObfuscatedName("gt.y")
    public int field2812 = 0;

    @ObfuscatedName("hd.f(Lgb;Lgb;B)V")
    public static void method3754(class183 arg0, class183 arg1) {
        Statics.field2806 = arg0;
        Statics.field2804 = arg1;
    }

    @ObfuscatedName("ef.i(IB)Lgt;")
    public static class191 method2599(int arg0) {
        class191 var1 = (class191) field2805.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2806.method3163(13, arg0);
        class191 var3 = new class191();
        var3.field2807 = arg0;
        if (var2 != null) {
            var3.method3291(new class154(var2));
        }
        field2805.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gt.u(Leo;B)V")
    public void method3291(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3304(arg0, var2);
        }
    }

    @ObfuscatedName("gt.r(Leo;II)V")
    public void method3304(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2808 = arg0.method2668();
        } else if (arg1 == 2) {
            this.field2809 = arg0.method2668();
        } else if (arg1 == 4) {
            this.field2814 = arg0.method2668();
        } else if (arg1 == 5) {
            this.field2815 = arg0.method2668();
        } else if (arg1 == 6) {
            this.field2816 = arg0.method2668();
        } else if (arg1 == 7) {
            this.field2817 = arg0.method2666();
        } else if (arg1 == 8) {
            this.field2812 = arg0.method2666();
        } else if (arg1 == 40) {
            int var3 = arg0.method2666();
            this.field2818 = new short[var3];
            this.field2810 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2818[var4] = (short) arg0.method2668();
                this.field2810[var4] = (short) arg0.method2668();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2666();
            this.field2820 = new short[var5];
            this.field2813 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2820[var6] = (short) arg0.method2668();
                this.field2813[var6] = (short) arg0.method2668();
            }
        }
    }

    @ObfuscatedName("gt.o(II)Lce;")
    public final class83 method3293(int arg0) {
        class83 var2 = (class83) field2819.method2240((long) this.field2807);
        if (var2 == null) {
            class77 var3 = class77.method1408(Statics.field2804, this.field2808, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2818 != null) {
                for (int var4 = 0; var4 < this.field2818.length; var4++) {
                    var3.method1422(this.field2818[var4], this.field2810[var4]);
                }
            }
            if (this.field2820 != null) {
                for (int var5 = 0; var5 < this.field2820.length; var5++) {
                    var3.method1423(this.field2820[var5], this.field2813[var5]);
                }
            }
            var2 = var3.method1437(this.field2817 + 64, this.field2812 + 850, -30, -50, -30);
            field2819.method2246(var2, (long) this.field2807);
        }
        class83 var6;
        if (this.field2809 == -1 || arg0 == -1) {
            var6 = var2.method1498(true);
        } else {
            var6 = class202.method164(this.field2809).method3567(var2, arg0);
        }
        if (this.field2814 != 128 || this.field2815 != 128) {
            var6.method1527(this.field2814, this.field2815, this.field2814);
        }
        if (this.field2816 != 0) {
            if (this.field2816 == 90) {
                var6.method1569();
            }
            if (this.field2816 == 180) {
                var6.method1569();
                var6.method1569();
            }
            if (this.field2816 == 270) {
                var6.method1569();
                var6.method1569();
                var6.method1569();
            }
        }
        return var6;
    }
}

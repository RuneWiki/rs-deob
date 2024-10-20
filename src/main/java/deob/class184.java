package deob;

@ObfuscatedName("ah")
public class class184 extends class6 {

    @ObfuscatedName("ah.f")
    public short[] field2808;

    @ObfuscatedName("ah.g")
    public int field2819 = 128;

    @ObfuscatedName("ah.d")
    public int field2813;

    @ObfuscatedName("ah.e")
    public int field2815 = 0;

    @ObfuscatedName("ah.o")
    public int field2821 = 128;

    @ObfuscatedName("ah.l")
    public int field2814 = -1;

    @ObfuscatedName("ah.j")
    public short[] field2811;

    @ObfuscatedName("ah.k")
    public static class2 field2810 = new class2(64);

    @ObfuscatedName("ah.w")
    public static class2 field2820 = new class2(30);

    @ObfuscatedName("ah.t")
    public int field2812;

    @ObfuscatedName("ah.s")
    public short[] field2816;

    @ObfuscatedName("ah.q")
    public int field2822 = 0;

    @ObfuscatedName("ah.z")
    public int field2823 = 0;

    @ObfuscatedName("ah.x")
    public short[] field2817;

    @ObfuscatedName("ah.w(Ldp;IB)V")
    public void method3338(class50 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2813 = arg0.method720();
        } else if (arg1 == 2) {
            this.field2814 = arg0.method720();
        } else if (arg1 == 4) {
            this.field2819 = arg0.method720();
        } else if (arg1 == 5) {
            this.field2821 = arg0.method720();
        } else if (arg1 == 6) {
            this.field2815 = arg0.method720();
        } else if (arg1 == 7) {
            this.field2822 = arg0.method726();
        } else if (arg1 == 8) {
            this.field2823 = arg0.method726();
        } else if (arg1 == 40) {
            int var3 = arg0.method726();
            this.field2808 = new short[var3];
            this.field2816 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2808[var4] = (short) arg0.method720();
                this.field2816[var4] = (short) arg0.method720();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method726();
            this.field2811 = new short[var5];
            this.field2817 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2811[var6] = (short) arg0.method720();
                this.field2817[var6] = (short) arg0.method720();
            }
        }
    }

    @ObfuscatedName("ah.t(II)Ldu;")
    public final class27 method3339(int arg0) {
        class27 var2 = (class27) field2820.method1((long) this.field2812);
        if (var2 == null) {
            class157 var3 = class157.method2663(Statics.field2809, this.field2813, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2808 != null) {
                for (int var4 = 0; var4 < this.field2808.length; var4++) {
                    var3.method2701(this.field2808[var4], this.field2816[var4]);
                }
            }
            if (this.field2811 != null) {
                for (int var5 = 0; var5 < this.field2811.length; var5++) {
                    var3.method2678(this.field2811[var5], this.field2817[var5]);
                }
            }
            var2 = var3.method2706(this.field2822 + 64, this.field2823 + 850, -30, -50, -30);
            field2820.method4(var2, (long) this.field2812);
        }
        class27 var6;
        if (this.field2814 == -1 || arg0 == -1) {
            var6 = var2.method403(true);
        } else {
            var6 = class173.method3098(this.field2814).method3018(var2, arg0);
        }
        if (this.field2819 != 128 || this.field2821 != 128) {
            var6.method399(this.field2819, this.field2821, this.field2819);
        }
        if (this.field2815 != 0) {
            if (this.field2815 == 90) {
                var6.method395();
            }
            if (this.field2815 == 180) {
                var6.method395();
                var6.method395();
            }
            if (this.field2815 == 270) {
                var6.method395();
                var6.method395();
                var6.method395();
            }
        }
        return var6;
    }

    @ObfuscatedName("ah.k(Ldp;I)V")
    public void method3340(class50 arg0) {
        while (true) {
            int var2 = arg0.method726();
            if (var2 == 0) {
                return;
            }
            this.method3338(arg0, var2);
        }
    }

    @ObfuscatedName("dm.b(Lek;Lek;B)V")
    public static void method599(class89 arg0, class89 arg1) {
        Statics.field2818 = arg0;
        Statics.field2809 = arg1;
    }

    @ObfuscatedName("p.h(II)Lah;")
    public static class184 method1375(int arg0) {
        class184 var1 = (class184) field2810.method1((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2818.method1266(13, arg0);
        class184 var3 = new class184();
        var3.field2812 = arg0;
        if (var2 != null) {
            var3.method3340(new class50(var2));
        }
        field2810.method4(var3, (long) arg0);
        return var3;
    }
}

package deob;

@ObfuscatedName("gp")
public class class191 extends class130 {

    @ObfuscatedName("gp.c")
    public static class125 field2806 = new class125(64);

    @ObfuscatedName("gp.l")
    public static class125 field2799 = new class125(30);

    @ObfuscatedName("gp.y")
    public int field2798;

    @ObfuscatedName("gp.j")
    public int field2801;

    @ObfuscatedName("gp.g")
    public int field2802 = -1;

    @ObfuscatedName("gp.s")
    public short[] field2803;

    @ObfuscatedName("gp.r")
    public short[] field2800;

    @ObfuscatedName("gp.t")
    public short[] field2796;

    @ObfuscatedName("gp.k")
    public short[] field2812;

    @ObfuscatedName("gp.f")
    public int field2807 = 128;

    @ObfuscatedName("gp.a")
    public int field2805 = 128;

    @ObfuscatedName("gp.v")
    public int field2809 = 0;

    @ObfuscatedName("gp.d")
    public int field2810 = 0;

    @ObfuscatedName("gp.o")
    public int field2811 = 0;

    @ObfuscatedName("cs.b(Lgv;Lgv;I)V")
    public static void method1867(class183 arg0, class183 arg1) {
        Statics.field2804 = arg0;
        Statics.field2797 = arg1;
    }

    @ObfuscatedName("fx.e(II)Lgp;")
    public static class191 method3117(int arg0) {
        class191 var1 = (class191) field2806.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2804.method3126(13, arg0);
        class191 var3 = new class191();
        var3.field2798 = arg0;
        if (var2 != null) {
            var3.method3307(new class154(var2));
        }
        field2806.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gp.c(Lec;I)V")
    public void method3307(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3302(arg0, var2);
        }
    }

    @ObfuscatedName("gp.l(Lec;II)V")
    public void method3302(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2801 = arg0.method2671();
        } else if (arg1 == 2) {
            this.field2802 = arg0.method2671();
        } else if (arg1 == 4) {
            this.field2807 = arg0.method2671();
        } else if (arg1 == 5) {
            this.field2805 = arg0.method2671();
        } else if (arg1 == 6) {
            this.field2809 = arg0.method2671();
        } else if (arg1 == 7) {
            this.field2810 = arg0.method2669();
        } else if (arg1 == 8) {
            this.field2811 = arg0.method2669();
        } else if (arg1 == 40) {
            int var3 = arg0.method2669();
            this.field2803 = new short[var3];
            this.field2800 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2803[var4] = (short) arg0.method2671();
                this.field2800[var4] = (short) arg0.method2671();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2669();
            this.field2796 = new short[var5];
            this.field2812 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2796[var6] = (short) arg0.method2671();
                this.field2812[var6] = (short) arg0.method2671();
            }
        }
    }

    @ObfuscatedName("gp.y(II)Lco;")
    public final class83 method3304(int arg0) {
        class83 var2 = (class83) field2799.method2246((long) this.field2798);
        if (var2 == null) {
            class77 var3 = class77.method1409(Statics.field2797, this.field2801, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2803 != null) {
                for (int var4 = 0; var4 < this.field2803.length; var4++) {
                    var3.method1480(this.field2803[var4], this.field2800[var4]);
                }
            }
            if (this.field2796 != null) {
                for (int var5 = 0; var5 < this.field2796.length; var5++) {
                    var3.method1423(this.field2796[var5], this.field2812[var5]);
                }
            }
            var2 = var3.method1457(this.field2810 + 64, this.field2811 + 850, -30, -50, -30);
            field2799.method2250(var2, (long) this.field2798);
        }
        class83 var6;
        if (this.field2802 == -1 || arg0 == -1) {
            var6 = var2.method1503(true);
        } else {
            var6 = class202.method17(this.field2802).method3599(var2, arg0);
        }
        if (this.field2807 != 128 || this.field2805 != 128) {
            var6.method1514(this.field2807, this.field2805, this.field2807);
        }
        if (this.field2809 != 0) {
            if (this.field2809 == 90) {
                var6.method1511();
            }
            if (this.field2809 == 180) {
                var6.method1511();
                var6.method1511();
            }
            if (this.field2809 == 270) {
                var6.method1511();
                var6.method1511();
                var6.method1511();
            }
        }
        return var6;
    }
}

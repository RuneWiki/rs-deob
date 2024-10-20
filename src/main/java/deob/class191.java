package deob;

@ObfuscatedName("gf")
public class class191 extends class130 {

    @ObfuscatedName("gf.m")
    public static class125 field2797 = new class125(64);

    @ObfuscatedName("gf.h")
    public static class125 field2798 = new class125(30);

    @ObfuscatedName("gf.w")
    public int field2799;

    @ObfuscatedName("gf.r")
    public int field2800;

    @ObfuscatedName("gf.c")
    public int field2801 = -1;

    @ObfuscatedName("gf.p")
    public short[] field2795;

    @ObfuscatedName("gf.g")
    public short[] field2804;

    @ObfuscatedName("gf.z")
    public short[] field2805;

    @ObfuscatedName("gf.q")
    public short[] field2803;

    @ObfuscatedName("gf.l")
    public int field2811 = 128;

    @ObfuscatedName("gf.y")
    public int field2807 = 128;

    @ObfuscatedName("gf.e")
    public int field2806 = 0;

    @ObfuscatedName("gf.x")
    public int field2809 = 0;

    @ObfuscatedName("gf.f")
    public int field2810 = 0;

    @ObfuscatedName("fv.n(II)Lgf;")
    public static class191 method3085(int arg0) {
        class191 var1 = (class191) field2797.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2808.method3093(13, arg0);
        class191 var3 = new class191();
        var3.field2799 = arg0;
        if (var2 != null) {
            var3.method3282(new class161(var2));
        }
        field2797.method2219(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gf.d(Lfa;I)V")
    public void method3282(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3267(arg0, var2);
        }
    }

    @ObfuscatedName("gf.m(Lfa;II)V")
    public void method3267(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2800 = arg0.method2887();
        } else if (arg1 == 2) {
            this.field2801 = arg0.method2887();
        } else if (arg1 == 4) {
            this.field2811 = arg0.method2887();
        } else if (arg1 == 5) {
            this.field2807 = arg0.method2887();
        } else if (arg1 == 6) {
            this.field2806 = arg0.method2887();
        } else if (arg1 == 7) {
            this.field2809 = arg0.method2823();
        } else if (arg1 == 8) {
            this.field2810 = arg0.method2823();
        } else if (arg1 == 40) {
            int var3 = arg0.method2823();
            this.field2795 = new short[var3];
            this.field2804 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2795[var4] = (short) arg0.method2887();
                this.field2804[var4] = (short) arg0.method2887();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2823();
            this.field2805 = new short[var5];
            this.field2803 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2805[var6] = (short) arg0.method2887();
                this.field2803[var6] = (short) arg0.method2887();
            }
        }
    }

    @ObfuscatedName("gf.h(II)Lca;")
    public final class83 method3266(int arg0) {
        class83 var2 = (class83) field2798.method2221((long) this.field2799);
        if (var2 == null) {
            class77 var3 = class77.method1401(Statics.field2796, this.field2800, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2795 != null) {
                for (int var4 = 0; var4 < this.field2795.length; var4++) {
                    var3.method1400(this.field2795[var4], this.field2804[var4]);
                }
            }
            if (this.field2805 != null) {
                for (int var5 = 0; var5 < this.field2805.length; var5++) {
                    var3.method1416(this.field2805[var5], this.field2803[var5]);
                }
            }
            var2 = var3.method1422(this.field2809 + 64, this.field2810 + 850, -30, -50, -30);
            field2798.method2219(var2, (long) this.field2799);
        }
        class83 var6;
        if (this.field2801 == -1 || arg0 == -1) {
            var6 = var2.method1493(true);
        } else {
            var6 = class202.method119(this.field2801).method3567(var2, arg0);
        }
        if (this.field2811 != 128 || this.field2807 != 128) {
            var6.method1505(this.field2811, this.field2807, this.field2811);
        }
        if (this.field2806 != 0) {
            if (this.field2806 == 90) {
                var6.method1500();
            }
            if (this.field2806 == 180) {
                var6.method1500();
                var6.method1500();
            }
            if (this.field2806 == 270) {
                var6.method1500();
                var6.method1500();
                var6.method1500();
            }
        }
        return var6;
    }

    @ObfuscatedName("ab.w(B)V")
    public static void method757() {
        field2797.method2220();
        field2798.method2220();
    }
}

package deob;

@ObfuscatedName("gb")
public class class191 extends class130 {

    @ObfuscatedName("gb.f")
    public static class125 field2808 = new class125(64);

    @ObfuscatedName("gb.h")
    public static class125 field2799 = new class125(30);

    @ObfuscatedName("gb.a")
    public int field2798;

    @ObfuscatedName("gb.g")
    public int field2809;

    @ObfuscatedName("gb.k")
    public int field2802 = -1;

    @ObfuscatedName("gb.u")
    public short[] field2803;

    @ObfuscatedName("gb.b")
    public short[] field2804;

    @ObfuscatedName("gb.x")
    public short[] field2800;

    @ObfuscatedName("gb.r")
    public short[] field2797;

    @ObfuscatedName("gb.n")
    public int field2807 = 128;

    @ObfuscatedName("gb.m")
    public int field2801 = 128;

    @ObfuscatedName("gb.j")
    public int field2796 = 0;

    @ObfuscatedName("gb.w")
    public int field2810 = 0;

    @ObfuscatedName("gb.p")
    public int field2811 = 0;

    @ObfuscatedName("ak.s(II)Lgb;")
    public static class191 method827(int arg0) {
        class191 var1 = (class191) field2808.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2805.method2986(13, arg0);
        class191 var3 = new class191();
        var3.field2798 = arg0;
        if (var2 != null) {
            var3.method3161(new class154(var2));
        }
        field2808.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gb.c(Lea;I)V")
    public void method3161(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3151(arg0, var2);
        }
    }

    @ObfuscatedName("gb.f(Lea;II)V")
    public void method3151(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2809 = arg0.method2541();
        } else if (arg1 == 2) {
            this.field2802 = arg0.method2541();
        } else if (arg1 == 4) {
            this.field2807 = arg0.method2541();
        } else if (arg1 == 5) {
            this.field2801 = arg0.method2541();
        } else if (arg1 == 6) {
            this.field2796 = arg0.method2541();
        } else if (arg1 == 7) {
            this.field2810 = arg0.method2545();
        } else if (arg1 == 8) {
            this.field2811 = arg0.method2545();
        } else if (arg1 == 40) {
            int var3 = arg0.method2545();
            this.field2803 = new short[var3];
            this.field2804 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2803[var4] = (short) arg0.method2541();
                this.field2804[var4] = (short) arg0.method2541();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2545();
            this.field2800 = new short[var5];
            this.field2797 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2800[var6] = (short) arg0.method2541();
                this.field2797[var6] = (short) arg0.method2541();
            }
        }
    }

    @ObfuscatedName("gb.g(II)Lcz;")
    public final class83 method3150(int arg0) {
        class83 var2 = (class83) field2799.method2121((long) this.field2798);
        if (var2 == null) {
            class77 var3 = class77.method1351(Statics.field2806, this.field2809, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2803 != null) {
                for (int var4 = 0; var4 < this.field2803.length; var4++) {
                    var3.method1364(this.field2803[var4], this.field2804[var4]);
                }
            }
            if (this.field2800 != null) {
                for (int var5 = 0; var5 < this.field2800.length; var5++) {
                    var3.method1365(this.field2800[var5], this.field2797[var5]);
                }
            }
            var2 = var3.method1371(this.field2810 + 64, this.field2811 + 850, -30, -50, -30);
            field2799.method2123(var2, (long) this.field2798);
        }
        class83 var6;
        if (this.field2802 == -1 || arg0 == -1) {
            var6 = var2.method1445(true);
        } else {
            var6 = class202.method1914(this.field2802).method3410(var2, arg0);
        }
        if (this.field2807 != 128 || this.field2801 != 128) {
            var6.method1471(this.field2807, this.field2801, this.field2807);
        }
        if (this.field2796 != 0) {
            if (this.field2796 == 90) {
                var6.method1514();
            }
            if (this.field2796 == 180) {
                var6.method1514();
                var6.method1514();
            }
            if (this.field2796 == 270) {
                var6.method1514();
                var6.method1514();
                var6.method1514();
            }
        }
        return var6;
    }

    @ObfuscatedName("z.k(I)V")
    public static void method161() {
        field2808.method2124();
        field2799.method2124();
    }
}

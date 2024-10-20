package deob;

@ObfuscatedName("gw")
public class class191 extends class130 {

    @ObfuscatedName("gw.g")
    public static class125 field2796 = new class125(64);

    @ObfuscatedName("gw.v")
    public static class125 field2797 = new class125(30);

    @ObfuscatedName("gw.y")
    public int field2811;

    @ObfuscatedName("gw.p")
    public int field2805;

    @ObfuscatedName("gw.j")
    public int field2798 = -1;

    @ObfuscatedName("gw.m")
    public short[] field2801;

    @ObfuscatedName("gw.a")
    public short[] field2802;

    @ObfuscatedName("gw.i")
    public short[] field2803;

    @ObfuscatedName("gw.s")
    public short[] field2804;

    @ObfuscatedName("gw.k")
    public int field2807 = 128;

    @ObfuscatedName("gw.f")
    public int field2806 = 128;

    @ObfuscatedName("gw.o")
    public int field2795 = 0;

    @ObfuscatedName("gw.q")
    public int field2808 = 0;

    @ObfuscatedName("gw.c")
    public int field2809 = 0;

    @ObfuscatedName("fh.x(II)Lgw;")
    public static class191 method2936(int arg0) {
        class191 var1 = (class191) field2796.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2799.method3153(13, arg0);
        class191 var3 = new class191();
        var3.field2811 = arg0;
        if (var2 != null) {
            var3.method3324(new class154(var2));
        }
        field2796.method2282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gw.n(Leq;B)V")
    public void method3324(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3325(arg0, var2);
        }
    }

    @ObfuscatedName("gw.g(Leq;IB)V")
    public void method3325(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2805 = arg0.method2833();
        } else if (arg1 == 2) {
            this.field2798 = arg0.method2833();
        } else if (arg1 == 4) {
            this.field2807 = arg0.method2833();
        } else if (arg1 == 5) {
            this.field2806 = arg0.method2833();
        } else if (arg1 == 6) {
            this.field2795 = arg0.method2833();
        } else if (arg1 == 7) {
            this.field2808 = arg0.method2878();
        } else if (arg1 == 8) {
            this.field2809 = arg0.method2878();
        } else if (arg1 == 40) {
            int var3 = arg0.method2878();
            this.field2801 = new short[var3];
            this.field2802 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2801[var4] = (short) arg0.method2833();
                this.field2802[var4] = (short) arg0.method2833();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2878();
            this.field2803 = new short[var5];
            this.field2804 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2803[var6] = (short) arg0.method2833();
                this.field2804[var6] = (short) arg0.method2833();
            }
        }
    }

    @ObfuscatedName("gw.v(II)Lcj;")
    public final class83 method3326(int arg0) {
        class83 var2 = (class83) field2797.method2275((long) this.field2811);
        if (var2 == null) {
            class77 var3 = class77.method1469(Statics.field3082, this.field2805, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2801 != null) {
                for (int var4 = 0; var4 < this.field2801.length; var4++) {
                    var3.method1539(this.field2801[var4], this.field2802[var4]);
                }
            }
            if (this.field2803 != null) {
                for (int var5 = 0; var5 < this.field2803.length; var5++) {
                    var3.method1534(this.field2803[var5], this.field2804[var5]);
                }
            }
            var2 = var3.method1546(this.field2808 + 64, this.field2809 + 850, -30, -50, -30);
            field2797.method2282(var2, (long) this.field2811);
        }
        class83 var6;
        if (this.field2798 == -1 || arg0 == -1) {
            var6 = var2.method1569(true);
        } else {
            var6 = Statics.method1464(this.field2798).method3611(var2, arg0);
        }
        if (this.field2807 != 128 || this.field2806 != 128) {
            var6.method1582(this.field2807, this.field2806, this.field2807);
        }
        if (this.field2795 != 0) {
            if (this.field2795 == 90) {
                var6.method1640();
            }
            if (this.field2795 == 180) {
                var6.method1640();
                var6.method1640();
            }
            if (this.field2795 == 270) {
                var6.method1640();
                var6.method1640();
                var6.method1640();
            }
        }
        return var6;
    }

    @ObfuscatedName("fi.y(I)V")
    public static void method3116() {
        field2796.method2277();
        field2797.method2277();
    }
}

package deob;

@ObfuscatedName("gj")
public class class191 extends class130 {

    @ObfuscatedName("gj.f")
    public static class125 field2794 = new class125(64);

    @ObfuscatedName("gj.k")
    public static class125 field2804 = new class125(30);

    @ObfuscatedName("gj.g")
    public int field2796;

    @ObfuscatedName("gj.n")
    public int field2797;

    @ObfuscatedName("gj.a")
    public int field2798 = -1;

    @ObfuscatedName("gj.q")
    public short[] field2799;

    @ObfuscatedName("gj.w")
    public short[] field2795;

    @ObfuscatedName("gj.v")
    public short[] field2801;

    @ObfuscatedName("gj.h")
    public short[] field2802;

    @ObfuscatedName("gj.p")
    public int field2803 = 128;

    @ObfuscatedName("gj.l")
    public int field2805 = 128;

    @ObfuscatedName("gj.c")
    public int field2792 = 0;

    @ObfuscatedName("gj.m")
    public int field2806 = 0;

    @ObfuscatedName("gj.r")
    public int field2800 = 0;

    @ObfuscatedName("fm.i(Lgq;Lgq;I)V")
    public static void method2862(class183 arg0, class183 arg1) {
        Statics.field2807 = arg0;
        Statics.field2793 = arg1;
    }

    @ObfuscatedName("d.e(IB)Lgj;")
    public static class191 method194(int arg0) {
        class191 var1 = (class191) field2794.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2807.method3014(13, arg0);
        class191 var3 = new class191();
        var3.field2796 = arg0;
        if (var2 != null) {
            var3.method3195(new class154(var2));
        }
        field2794.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gj.f(Let;I)V")
    public void method3195(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3196(arg0, var2);
        }
    }

    @ObfuscatedName("gj.k(Let;IB)V")
    public void method3196(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2797 = arg0.method2575();
        } else if (arg1 == 2) {
            this.field2798 = arg0.method2575();
        } else if (arg1 == 4) {
            this.field2803 = arg0.method2575();
        } else if (arg1 == 5) {
            this.field2805 = arg0.method2575();
        } else if (arg1 == 6) {
            this.field2792 = arg0.method2575();
        } else if (arg1 == 7) {
            this.field2806 = arg0.method2573();
        } else if (arg1 == 8) {
            this.field2800 = arg0.method2573();
        } else if (arg1 == 40) {
            int var3 = arg0.method2573();
            this.field2799 = new short[var3];
            this.field2795 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2799[var4] = (short) arg0.method2575();
                this.field2795[var4] = (short) arg0.method2575();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2573();
            this.field2801 = new short[var5];
            this.field2802 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2801[var6] = (short) arg0.method2575();
                this.field2802[var6] = (short) arg0.method2575();
            }
        }
    }

    @ObfuscatedName("gj.a(IB)Lch;")
    public final class83 method3208(int arg0) {
        class83 var2 = (class83) field2804.method2150((long) this.field2796);
        if (var2 == null) {
            class77 var3 = class77.method1374(Statics.field2793, this.field2797, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2799 != null) {
                for (int var4 = 0; var4 < this.field2799.length; var4++) {
                    var3.method1405(this.field2799[var4], this.field2795[var4]);
                }
            }
            if (this.field2801 != null) {
                for (int var5 = 0; var5 < this.field2801.length; var5++) {
                    var3.method1398(this.field2801[var5], this.field2802[var5]);
                }
            }
            var2 = var3.method1402(this.field2806 + 64, this.field2800 + 850, -30, -50, -30);
            field2804.method2152(var2, (long) this.field2796);
        }
        class83 var6;
        if (this.field2798 == -1 || arg0 == -1) {
            var6 = var2.method1464(true);
        } else {
            var6 = class202.method2010(this.field2798).method3506(var2, arg0);
        }
        if (this.field2803 != 128 || this.field2805 != 128) {
            var6.method1477(this.field2803, this.field2805, this.field2803);
        }
        if (this.field2792 != 0) {
            if (this.field2792 == 90) {
                var6.method1472();
            }
            if (this.field2792 == 180) {
                var6.method1472();
                var6.method1472();
            }
            if (this.field2792 == 270) {
                var6.method1472();
                var6.method1472();
                var6.method1472();
            }
        }
        return var6;
    }
}

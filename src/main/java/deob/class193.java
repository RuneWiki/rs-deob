package deob;

@ObfuscatedName("gw")
public class class193 extends class151 {

    @ObfuscatedName("gw.n")
    public static class146 field2802 = new class146(64);

    @ObfuscatedName("gw.q")
    public static class146 field2809 = new class146(30);

    @ObfuscatedName("gw.t")
    public int field2817;

    @ObfuscatedName("gw.p")
    public int field2805;

    @ObfuscatedName("gw.u")
    public int field2812 = -1;

    @ObfuscatedName("gw.z")
    public short[] field2807;

    @ObfuscatedName("gw.l")
    public short[] field2808;

    @ObfuscatedName("gw.v")
    public short[] field2806;

    @ObfuscatedName("gw.g")
    public short[] field2810;

    @ObfuscatedName("gw.w")
    public int field2811 = 128;

    @ObfuscatedName("gw.r")
    public int field2803 = 128;

    @ObfuscatedName("gw.s")
    public int field2813 = 0;

    @ObfuscatedName("gw.k")
    public int field2814 = 0;

    @ObfuscatedName("gw.e")
    public int field2815 = 0;

    @ObfuscatedName("co.d(Lgd;Lgd;I)V")
    public static void method1823(class185 arg0, class185 arg1) {
        Statics.field2800 = arg0;
        Statics.field2801 = arg1;
    }

    @ObfuscatedName("gl.c(II)Lgw;")
    public static class193 method3249(int arg0) {
        class193 var1 = (class193) field2802.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2800.method3129(13, arg0);
        class193 var3 = new class193();
        var3.field2817 = arg0;
        if (var2 != null) {
            var3.method3262(new class130(var2));
        }
        field2802.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gw.n(Ldu;I)V")
    public void method3262(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3264(arg0, var2);
        }
    }

    @ObfuscatedName("gw.q(Ldu;II)V")
    public void method3264(class130 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2805 = arg0.method2232();
        } else if (arg1 == 2) {
            this.field2812 = arg0.method2232();
        } else if (arg1 == 4) {
            this.field2811 = arg0.method2232();
        } else if (arg1 == 5) {
            this.field2803 = arg0.method2232();
        } else if (arg1 == 6) {
            this.field2813 = arg0.method2232();
        } else if (arg1 == 7) {
            this.field2814 = arg0.method2379();
        } else if (arg1 == 8) {
            this.field2815 = arg0.method2379();
        } else if (arg1 == 40) {
            int var3 = arg0.method2379();
            this.field2807 = new short[var3];
            this.field2808 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2807[var4] = (short) arg0.method2232();
                this.field2808[var4] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2379();
            this.field2806 = new short[var5];
            this.field2810 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2806[var6] = (short) arg0.method2232();
                this.field2810[var6] = (short) arg0.method2232();
            }
        }
    }

    @ObfuscatedName("gw.t(II)Lcf;")
    public final class83 method3265(int arg0) {
        class83 var2 = (class83) field2809.method2598((long) this.field2817);
        if (var2 == null) {
            class77 var3 = class77.method1394(Statics.field2801, this.field2805, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2807 != null) {
                for (int var4 = 0; var4 < this.field2807.length; var4++) {
                    var3.method1406(this.field2807[var4], this.field2808[var4]);
                }
            }
            if (this.field2806 != null) {
                for (int var5 = 0; var5 < this.field2806.length; var5++) {
                    var3.method1407(this.field2806[var5], this.field2810[var5]);
                }
            }
            var2 = var3.method1417(this.field2814 + 64, this.field2815 + 850, -30, -50, -30);
            field2809.method2607(var2, (long) this.field2817);
        }
        class83 var6;
        if (this.field2812 == -1 || arg0 == -1) {
            var6 = var2.method1487(true);
        } else {
            var6 = class207.method3621(this.field2812).method3651(var2, arg0);
        }
        if (this.field2811 != 128 || this.field2803 != 128) {
            var6.method1497(this.field2811, this.field2803, this.field2811);
        }
        if (this.field2813 != 0) {
            if (this.field2813 == 90) {
                var6.method1513();
            }
            if (this.field2813 == 180) {
                var6.method1513();
                var6.method1513();
            }
            if (this.field2813 == 270) {
                var6.method1513();
                var6.method1513();
                var6.method1513();
            }
        }
        return var6;
    }
}

package deob;

@ObfuscatedName("gz")
public class class191 extends class130 {

    @ObfuscatedName("gz.i")
    public static class125 field2810 = new class125(64);

    @ObfuscatedName("gz.t")
    public static class125 field2792 = new class125(30);

    @ObfuscatedName("gz.k")
    public int field2799;

    @ObfuscatedName("gz.h")
    public int field2797;

    @ObfuscatedName("gz.n")
    public int field2798 = -1;

    @ObfuscatedName("gz.f")
    public short[] field2802;

    @ObfuscatedName("gz.a")
    public short[] field2794;

    @ObfuscatedName("gz.r")
    public short[] field2801;

    @ObfuscatedName("gz.x")
    public short[] field2796;

    @ObfuscatedName("gz.z")
    public int field2803 = 128;

    @ObfuscatedName("gz.p")
    public int field2804 = 128;

    @ObfuscatedName("gz.s")
    public int field2805 = 0;

    @ObfuscatedName("gz.o")
    public int field2806 = 0;

    @ObfuscatedName("gz.y")
    public int field2807 = 0;

    @ObfuscatedName("fy.b(IB)Lgz;")
    public static class191 method2966(int arg0) {
        class191 var1 = (class191) field2810.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2795.method3226(13, arg0);
        class191 var3 = new class191();
        var3.field2799 = arg0;
        if (var2 != null) {
            var3.method3332(new class154(var2));
        }
        field2810.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gz.l(Leg;I)V")
    public void method3332(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3333(arg0, var2);
        }
    }

    @ObfuscatedName("gz.i(Leg;IB)V")
    public void method3333(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2797 = arg0.method2801();
        } else if (arg1 == 2) {
            this.field2798 = arg0.method2801();
        } else if (arg1 == 4) {
            this.field2803 = arg0.method2801();
        } else if (arg1 == 5) {
            this.field2804 = arg0.method2801();
        } else if (arg1 == 6) {
            this.field2805 = arg0.method2801();
        } else if (arg1 == 7) {
            this.field2806 = arg0.method2678();
        } else if (arg1 == 8) {
            this.field2807 = arg0.method2678();
        } else if (arg1 == 40) {
            int var3 = arg0.method2678();
            this.field2802 = new short[var3];
            this.field2794 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2802[var4] = (short) arg0.method2801();
                this.field2794[var4] = (short) arg0.method2801();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2678();
            this.field2801 = new short[var5];
            this.field2796 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2801[var6] = (short) arg0.method2801();
                this.field2796[var6] = (short) arg0.method2801();
            }
        }
    }

    @ObfuscatedName("gz.t(IB)Lcs;")
    public final class83 method3334(int arg0) {
        class83 var2 = (class83) field2792.method2256((long) this.field2799);
        if (var2 == null) {
            class77 var3 = class77.method1486(Statics.field2793, this.field2797, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2802 != null) {
                for (int var4 = 0; var4 < this.field2802.length; var4++) {
                    var3.method1502(this.field2802[var4], this.field2794[var4]);
                }
            }
            if (this.field2801 != null) {
                for (int var5 = 0; var5 < this.field2801.length; var5++) {
                    var3.method1464(this.field2801[var5], this.field2796[var5]);
                }
            }
            var2 = var3.method1467(this.field2806 + 64, this.field2807 + 850, -30, -50, -30);
            field2792.method2258(var2, (long) this.field2799);
        }
        class83 var6;
        if (this.field2798 == -1 || arg0 == -1) {
            var6 = var2.method1595(true);
        } else {
            var6 = class202.method262(this.field2798).method3656(var2, arg0);
        }
        if (this.field2803 != 128 || this.field2804 != 128) {
            var6.method1571(this.field2803, this.field2804, this.field2803);
        }
        if (this.field2805 != 0) {
            if (this.field2805 == 90) {
                var6.method1578();
            }
            if (this.field2805 == 180) {
                var6.method1578();
                var6.method1578();
            }
            if (this.field2805 == 270) {
                var6.method1578();
                var6.method1578();
                var6.method1578();
            }
        }
        return var6;
    }
}

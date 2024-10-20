package deob;

@ObfuscatedName("gw")
public class class191 extends class130 {

    @ObfuscatedName("gw.x")
    public static class125 field2798 = new class125(64);

    @ObfuscatedName("gw.q")
    public static class125 field2790 = new class125(30);

    @ObfuscatedName("gw.d")
    public int field2791;

    @ObfuscatedName("gw.k")
    public int field2792;

    @ObfuscatedName("gw.j")
    public int field2793 = -1;

    @ObfuscatedName("gw.s")
    public short[] field2794;

    @ObfuscatedName("gw.o")
    public short[] field2789;

    @ObfuscatedName("gw.a")
    public short[] field2796;

    @ObfuscatedName("gw.c")
    public short[] field2797;

    @ObfuscatedName("gw.m")
    public int field2805 = 128;

    @ObfuscatedName("gw.h")
    public int field2799 = 128;

    @ObfuscatedName("gw.r")
    public int field2795 = 0;

    @ObfuscatedName("gw.u")
    public int field2800 = 0;

    @ObfuscatedName("gw.i")
    public int field2802 = 0;

    @ObfuscatedName("bh.p(IS)Lgw;")
    public static class191 method1354(int arg0) {
        class191 var1 = (class191) field2798.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field39.method3044(13, arg0);
        class191 var3 = new class191();
        var3.field2791 = arg0;
        if (var2 != null) {
            var3.method3207(new class154(var2));
        }
        field2798.method2174(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gw.g(Lev;B)V")
    public void method3207(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3210(arg0, var2);
        }
    }

    @ObfuscatedName("gw.x(Lev;IB)V")
    public void method3210(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2792 = arg0.method2595();
        } else if (arg1 == 2) {
            this.field2793 = arg0.method2595();
        } else if (arg1 == 4) {
            this.field2805 = arg0.method2595();
        } else if (arg1 == 5) {
            this.field2799 = arg0.method2595();
        } else if (arg1 == 6) {
            this.field2795 = arg0.method2595();
        } else if (arg1 == 7) {
            this.field2800 = arg0.method2593();
        } else if (arg1 == 8) {
            this.field2802 = arg0.method2593();
        } else if (arg1 == 40) {
            int var3 = arg0.method2593();
            this.field2794 = new short[var3];
            this.field2789 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2794[var4] = (short) arg0.method2595();
                this.field2789[var4] = (short) arg0.method2595();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2593();
            this.field2796 = new short[var5];
            this.field2797 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2796[var6] = (short) arg0.method2595();
                this.field2797[var6] = (short) arg0.method2595();
            }
        }
    }

    @ObfuscatedName("gw.q(II)Lcw;")
    public final class83 method3209(int arg0) {
        class83 var2 = (class83) field2790.method2169((long) this.field2791);
        if (var2 == null) {
            class77 var3 = class77.method1361(Statics.field2801, this.field2792, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2794 != null) {
                for (int var4 = 0; var4 < this.field2794.length; var4++) {
                    var3.method1373(this.field2794[var4], this.field2789[var4]);
                }
            }
            if (this.field2796 != null) {
                for (int var5 = 0; var5 < this.field2796.length; var5++) {
                    var3.method1374(this.field2796[var5], this.field2797[var5]);
                }
            }
            var2 = var3.method1381(this.field2800 + 64, this.field2802 + 850, -30, -50, -30);
            field2790.method2174(var2, (long) this.field2791);
        }
        class83 var6;
        if (this.field2793 == -1 || arg0 == -1) {
            var6 = var2.method1458(true);
        } else {
            var6 = class202.method2533(this.field2793).method3505(var2, arg0);
        }
        if (this.field2805 != 128 || this.field2799 != 128) {
            var6.method1503(this.field2805, this.field2799, this.field2805);
        }
        if (this.field2795 != 0) {
            if (this.field2795 == 90) {
                var6.method1470();
            }
            if (this.field2795 == 180) {
                var6.method1470();
                var6.method1470();
            }
            if (this.field2795 == 270) {
                var6.method1470();
                var6.method1470();
                var6.method1470();
            }
        }
        return var6;
    }
}

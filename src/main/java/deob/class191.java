package deob;

@ObfuscatedName("gm")
public class class191 extends class130 {

    @ObfuscatedName("gm.b")
    public static class125 field2794 = new class125(64);

    @ObfuscatedName("gm.g")
    public static class125 field2795 = new class125(30);

    @ObfuscatedName("gm.h")
    public int field2796;

    @ObfuscatedName("gm.v")
    public int field2797;

    @ObfuscatedName("gm.l")
    public int field2804 = -1;

    @ObfuscatedName("gm.c")
    public short[] field2800;

    @ObfuscatedName("gm.u")
    public short[] field2803;

    @ObfuscatedName("gm.k")
    public short[] field2798;

    @ObfuscatedName("gm.z")
    public short[] field2802;

    @ObfuscatedName("gm.y")
    public int field2793 = 128;

    @ObfuscatedName("gm.j")
    public int field2806 = 128;

    @ObfuscatedName("gm.f")
    public int field2805 = 0;

    @ObfuscatedName("gm.p")
    public int field2799 = 0;

    @ObfuscatedName("gm.i")
    public int field2807 = 0;

    @ObfuscatedName("gh.o(IB)Lgm;")
    public static class191 method3446(int arg0) {
        class191 var1 = (class191) field2794.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2801.method3012(13, arg0);
        class191 var3 = new class191();
        var3.field2796 = arg0;
        if (var2 != null) {
            var3.method3179(new class154(var2));
        }
        field2794.method2132(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.m(Lez;I)V")
    public void method3179(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3180(arg0, var2);
        }
    }

    @ObfuscatedName("gm.b(Lez;IB)V")
    public void method3180(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2797 = arg0.method2554();
        } else if (arg1 == 2) {
            this.field2804 = arg0.method2554();
        } else if (arg1 == 4) {
            this.field2793 = arg0.method2554();
        } else if (arg1 == 5) {
            this.field2806 = arg0.method2554();
        } else if (arg1 == 6) {
            this.field2805 = arg0.method2554();
        } else if (arg1 == 7) {
            this.field2799 = arg0.method2552();
        } else if (arg1 == 8) {
            this.field2807 = arg0.method2552();
        } else if (arg1 == 40) {
            int var3 = arg0.method2552();
            this.field2800 = new short[var3];
            this.field2803 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2800[var4] = (short) arg0.method2554();
                this.field2803[var4] = (short) arg0.method2554();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2552();
            this.field2798 = new short[var5];
            this.field2802 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2798[var6] = (short) arg0.method2554();
                this.field2802[var6] = (short) arg0.method2554();
            }
        }
    }

    @ObfuscatedName("gm.g(II)Lcy;")
    public final class83 method3188(int arg0) {
        class83 var2 = (class83) field2795.method2130((long) this.field2796);
        if (var2 == null) {
            class77 var3 = class77.method1358(Statics.field2784, this.field2797, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2800 != null) {
                for (int var4 = 0; var4 < this.field2800.length; var4++) {
                    var3.method1372(this.field2800[var4], this.field2803[var4]);
                }
            }
            if (this.field2798 != null) {
                for (int var5 = 0; var5 < this.field2798.length; var5++) {
                    var3.method1373(this.field2798[var5], this.field2802[var5]);
                }
            }
            var2 = var3.method1389(this.field2799 + 64, this.field2807 + 850, -30, -50, -30);
            field2795.method2132(var2, (long) this.field2796);
        }
        class83 var6;
        if (this.field2804 == -1 || arg0 == -1) {
            var6 = var2.method1448(true);
        } else {
            var6 = class202.method658(this.field2804).method3468(var2, arg0);
        }
        if (this.field2793 != 128 || this.field2806 != 128) {
            var6.method1461(this.field2793, this.field2806, this.field2793);
        }
        if (this.field2805 != 0) {
            if (this.field2805 == 90) {
                var6.method1456();
            }
            if (this.field2805 == 180) {
                var6.method1456();
                var6.method1456();
            }
            if (this.field2805 == 270) {
                var6.method1456();
                var6.method1456();
                var6.method1456();
            }
        }
        return var6;
    }

    @ObfuscatedName("av.l(I)V")
    public static void method648() {
        field2794.method2139();
        field2795.method2139();
    }
}

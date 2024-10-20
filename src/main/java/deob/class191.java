package deob;

@ObfuscatedName("gy")
public class class191 extends class130 {

    @ObfuscatedName("gy.h")
    public static class125 field2804 = new class125(64);

    @ObfuscatedName("gy.p")
    public static class125 field2799 = new class125(30);

    @ObfuscatedName("gy.j")
    public int field2800;

    @ObfuscatedName("gy.n")
    public int field2801;

    @ObfuscatedName("gy.r")
    public int field2808 = -1;

    @ObfuscatedName("gy.c")
    public short[] field2803;

    @ObfuscatedName("gy.i")
    public short[] field2798;

    @ObfuscatedName("gy.o")
    public short[] field2805;

    @ObfuscatedName("gy.m")
    public short[] field2806;

    @ObfuscatedName("gy.s")
    public int field2807 = 128;

    @ObfuscatedName("gy.u")
    public int field2811 = 128;

    @ObfuscatedName("gy.b")
    public int field2802 = 0;

    @ObfuscatedName("gy.v")
    public int field2809 = 0;

    @ObfuscatedName("gy.f")
    public int field2810 = 0;

    @ObfuscatedName("cg.q(II)Lgy;")
    public static class191 method1883(int arg0) {
        class191 var1 = (class191) field2804.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2029.method3133(13, arg0);
        class191 var3 = new class191();
        var3.field2800 = arg0;
        if (var2 != null) {
            var3.method3284(new class154(var2));
        }
        field2804.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.d(Lel;I)V")
    public void method3284(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3278(arg0, var2);
        }
    }

    @ObfuscatedName("gy.h(Lel;II)V")
    public void method3278(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2801 = arg0.method2668();
        } else if (arg1 == 2) {
            this.field2808 = arg0.method2668();
        } else if (arg1 == 4) {
            this.field2807 = arg0.method2668();
        } else if (arg1 == 5) {
            this.field2811 = arg0.method2668();
        } else if (arg1 == 6) {
            this.field2802 = arg0.method2668();
        } else if (arg1 == 7) {
            this.field2809 = arg0.method2666();
        } else if (arg1 == 8) {
            this.field2810 = arg0.method2666();
        } else if (arg1 == 40) {
            int var3 = arg0.method2666();
            this.field2803 = new short[var3];
            this.field2798 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2803[var4] = (short) arg0.method2668();
                this.field2798[var4] = (short) arg0.method2668();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2666();
            this.field2805 = new short[var5];
            this.field2806 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2805[var6] = (short) arg0.method2668();
                this.field2806[var6] = (short) arg0.method2668();
            }
        }
    }

    @ObfuscatedName("gy.p(IB)Lcf;")
    public final class83 method3279(int arg0) {
        class83 var2 = (class83) field2799.method2258((long) this.field2800);
        if (var2 == null) {
            class77 var3 = class77.method1494(Statics.field7, this.field2801, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field2803 != null) {
                for (int var4 = 0; var4 < this.field2803.length; var4++) {
                    var3.method1461(this.field2803[var4], this.field2798[var4]);
                }
            }
            if (this.field2805 != null) {
                for (int var5 = 0; var5 < this.field2805.length; var5++) {
                    var3.method1499(this.field2805[var5], this.field2806[var5]);
                }
            }
            var2 = var3.method1469(this.field2809 + 64, this.field2810 + 850, -30, -50, -30);
            field2799.method2248(var2, (long) this.field2800);
        }
        class83 var6;
        if (this.field2808 == -1 || arg0 == -1) {
            var6 = var2.method1550(true);
        } else {
            var6 = class202.method3379(this.field2808).method3618(var2, arg0);
        }
        if (this.field2807 != 128 || this.field2811 != 128) {
            var6.method1563(this.field2807, this.field2811, this.field2807);
        }
        if (this.field2802 != 0) {
            if (this.field2802 == 90) {
                var6.method1558();
            }
            if (this.field2802 == 180) {
                var6.method1558();
                var6.method1558();
            }
            if (this.field2802 == 270) {
                var6.method1558();
                var6.method1558();
                var6.method1558();
            }
        }
        return var6;
    }

    @ObfuscatedName("dx.j(B)V")
    public static void method2005() {
        field2804.method2249();
        field2799.method2249();
    }
}

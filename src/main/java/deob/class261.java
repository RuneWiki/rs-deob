package deob;

@ObfuscatedName("je")
public class class261 extends class209 {

    @ObfuscatedName("je.o")
    public static class203 field3300 = new class203(64);

    @ObfuscatedName("je.k")
    public static class203 field3293 = new class203(30);

    @ObfuscatedName("je.u")
    public int field3297;

    @ObfuscatedName("je.i")
    public int field3298;

    @ObfuscatedName("je.t")
    public int field3301 = -1;

    @ObfuscatedName("je.p")
    public short[] field3306;

    @ObfuscatedName("je.l")
    public short[] field3299;

    @ObfuscatedName("je.b")
    public short[] field3302;

    @ObfuscatedName("je.c")
    public short[] field3303;

    @ObfuscatedName("je.d")
    public int field3304 = 128;

    @ObfuscatedName("je.w")
    public int field3305 = 128;

    @ObfuscatedName("je.a")
    public int field3295 = 0;

    @ObfuscatedName("je.z")
    public int field3307 = 0;

    @ObfuscatedName("je.e")
    public int field3308 = 0;

    @ObfuscatedName("ik.v(Lis;Lis;B)V")
    public static void method4264(class250 arg0, class250 arg1) {
        Statics.field3296 = arg0;
        Statics.field3294 = arg1;
    }

    @ObfuscatedName("ez.s(II)Lje;")
    public static class261 method2850(int arg0) {
        class261 var1 = (class261) field3300.method3687((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3296.method4270(13, arg0);
        class261 var3 = new class261();
        var3.field3297 = arg0;
        if (var2 != null) {
            var3.method4517(new class185(var2));
        }
        field3300.method3689(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("je.o(Lgx;S)V")
    public void method4517(class185 arg0) {
        while (true) {
            int var2 = arg0.method3274();
            if (var2 == 0) {
                return;
            }
            this.method4520(arg0, var2);
        }
    }

    @ObfuscatedName("je.k(Lgx;IB)V")
    public void method4520(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3298 = arg0.method3276();
        } else if (arg1 == 2) {
            this.field3301 = arg0.method3276();
        } else if (arg1 == 4) {
            this.field3304 = arg0.method3276();
        } else if (arg1 == 5) {
            this.field3305 = arg0.method3276();
        } else if (arg1 == 6) {
            this.field3295 = arg0.method3276();
        } else if (arg1 == 7) {
            this.field3307 = arg0.method3274();
        } else if (arg1 == 8) {
            this.field3308 = arg0.method3274();
        } else if (arg1 == 40) {
            int var3 = arg0.method3274();
            this.field3306 = new short[var3];
            this.field3299 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3306[var4] = (short) arg0.method3276();
                this.field3299[var4] = (short) arg0.method3276();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3274();
            this.field3302 = new short[var5];
            this.field3303 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3302[var6] = (short) arg0.method3276();
                this.field3303[var6] = (short) arg0.method3276();
            }
        }
    }

    @ObfuscatedName("je.u(IB)Lda;")
    public final class122 method4519(int arg0) {
        class122 var2 = (class122) field3293.method3687((long) this.field3297);
        if (var2 == null) {
            class116 var3 = class116.method2418(Statics.field3294, this.field3298, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3306 != null) {
                for (int var4 = 0; var4 < this.field3306.length; var4++) {
                    var3.method2391(this.field3306[var4], this.field3299[var4]);
                }
            }
            if (this.field3302 != null) {
                for (int var5 = 0; var5 < this.field3302.length; var5++) {
                    var3.method2436(this.field3302[var5], this.field3303[var5]);
                }
            }
            var2 = var3.method2399(this.field3307 + 64, this.field3308 + 850, -30, -50, -30);
            field3293.method3689(var2, (long) this.field3297);
        }
        class122 var6;
        if (this.field3301 == -1 || arg0 == -1) {
            var6 = var2.method2470(true);
        } else {
            var6 = class276.method115(this.field3301).method4864(var2, arg0);
        }
        if (this.field3304 != 128 || this.field3305 != 128) {
            var6.method2490(this.field3304, this.field3305, this.field3304);
        }
        if (this.field3295 != 0) {
            if (this.field3295 == 90) {
                var6.method2480();
            }
            if (this.field3295 == 180) {
                var6.method2480();
                var6.method2480();
            }
            if (this.field3295 == 270) {
                var6.method2480();
                var6.method2480();
                var6.method2480();
            }
        }
        return var6;
    }

    @ObfuscatedName("gr.i(B)V")
    public static void method3539() {
        field3300.method3697();
        field3293.method3697();
    }
}

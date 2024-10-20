package deob;

@ObfuscatedName("jr")
public class class261 extends class209 {

    @ObfuscatedName("jr.e")
    public static class203 field3322 = new class203(64);

    @ObfuscatedName("jr.b")
    public static class203 field3327 = new class203(30);

    @ObfuscatedName("jr.l")
    public int field3324;

    @ObfuscatedName("jr.w")
    public int field3325;

    @ObfuscatedName("jr.d")
    public int field3321 = -1;

    @ObfuscatedName("jr.n")
    public short[] field3333;

    @ObfuscatedName("jr.s")
    public short[] field3328;

    @ObfuscatedName("jr.g")
    public short[] field3320;

    @ObfuscatedName("jr.a")
    public short[] field3330;

    @ObfuscatedName("jr.r")
    public int field3331 = 128;

    @ObfuscatedName("jr.k")
    public int field3332 = 128;

    @ObfuscatedName("jr.m")
    public int field3326 = 0;

    @ObfuscatedName("jr.q")
    public int field3334 = 0;

    @ObfuscatedName("jr.x")
    public int field3335 = 0;

    @ObfuscatedName("ik.f(Lie;Lie;I)V")
    public static void method4247(class250 arg0, class250 arg1) {
        Statics.field3323 = arg0;
        Statics.field3329 = arg1;
    }

    @ObfuscatedName("ei.h(IB)Ljr;")
    public static class261 method2874(int arg0) {
        class261 var1 = (class261) field3322.method3724((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3323.method4267(13, arg0);
        class261 var3 = new class261();
        var3.field3324 = arg0;
        if (var2 != null) {
            var3.method4491(new class185(var2));
        }
        field3322.method3723(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jr.e(Lgx;B)V")
    public void method4491(class185 arg0) {
        while (true) {
            int var2 = arg0.method3323();
            if (var2 == 0) {
                return;
            }
            this.method4504(arg0, var2);
        }
    }

    @ObfuscatedName("jr.b(Lgx;IB)V")
    public void method4504(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3325 = arg0.method3325();
        } else if (arg1 == 2) {
            this.field3321 = arg0.method3325();
        } else if (arg1 == 4) {
            this.field3331 = arg0.method3325();
        } else if (arg1 == 5) {
            this.field3332 = arg0.method3325();
        } else if (arg1 == 6) {
            this.field3326 = arg0.method3325();
        } else if (arg1 == 7) {
            this.field3334 = arg0.method3323();
        } else if (arg1 == 8) {
            this.field3335 = arg0.method3323();
        } else if (arg1 == 40) {
            int var3 = arg0.method3323();
            this.field3333 = new short[var3];
            this.field3328 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3333[var4] = (short) arg0.method3325();
                this.field3328[var4] = (short) arg0.method3325();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3323();
            this.field3320 = new short[var5];
            this.field3330 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3320[var6] = (short) arg0.method3325();
                this.field3330[var6] = (short) arg0.method3325();
            }
        }
    }

    @ObfuscatedName("jr.l(II)Lds;")
    public final class122 method4493(int arg0) {
        class122 var2 = (class122) field3327.method3724((long) this.field3324);
        if (var2 == null) {
            class116 var3 = class116.method2385(Statics.field3329, this.field3325, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3333 != null) {
                for (int var4 = 0; var4 < this.field3333.length; var4++) {
                    var3.method2398(this.field3333[var4], this.field3328[var4]);
                }
            }
            if (this.field3320 != null) {
                for (int var5 = 0; var5 < this.field3320.length; var5++) {
                    var3.method2399(this.field3320[var5], this.field3330[var5]);
                }
            }
            var2 = var3.method2406(this.field3334 + 64, this.field3335 + 850, -30, -50, -30);
            field3327.method3723(var2, (long) this.field3324);
        }
        class122 var6;
        if (this.field3321 == -1 || arg0 == -1) {
            var6 = var2.method2488(true);
        } else {
            var6 = class276.method2865(this.field3321).method4844(var2, arg0);
        }
        if (this.field3331 != 128 || this.field3332 != 128) {
            var6.method2502(this.field3331, this.field3332, this.field3331);
        }
        if (this.field3326 != 0) {
            if (this.field3326 == 90) {
                var6.method2499();
            }
            if (this.field3326 == 180) {
                var6.method2499();
                var6.method2499();
            }
            if (this.field3326 == 270) {
                var6.method2499();
                var6.method2499();
                var6.method2499();
            }
        }
        return var6;
    }

    @ObfuscatedName("ld.w(I)V")
    public static void method5606() {
        field3322.method3725();
        field3327.method3725();
    }
}

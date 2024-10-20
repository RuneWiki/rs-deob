package deob;

@ObfuscatedName("ja")
public class class264 extends class214 {

    @ObfuscatedName("ja.l")
    public static class208 field3335 = new class208(64);

    @ObfuscatedName("ja.g")
    public static class208 field3337 = new class208(30);

    @ObfuscatedName("ja.b")
    public int field3338;

    @ObfuscatedName("ja.a")
    public int field3339;

    @ObfuscatedName("ja.c")
    public int field3345 = -1;

    @ObfuscatedName("ja.z")
    public short[] field3341;

    @ObfuscatedName("ja.j")
    public short[] field3343;

    @ObfuscatedName("ja.d")
    public short[] field3342;

    @ObfuscatedName("ja.t")
    public short[] field3344;

    @ObfuscatedName("ja.f")
    public int field3340 = 128;

    @ObfuscatedName("ja.i")
    public int field3346 = 128;

    @ObfuscatedName("ja.m")
    public int field3351 = 0;

    @ObfuscatedName("ja.v")
    public int field3348 = 0;

    @ObfuscatedName("ja.r")
    public int field3349 = 0;

    @ObfuscatedName("bm.n(Lij;Lij;I)V")
    public static void method1018(class254 arg0, class254 arg1) {
        Statics.field3347 = arg0;
        Statics.field2375 = arg1;
    }

    @ObfuscatedName("cg.h(II)Lja;")
    public static class264 method2268(int arg0) {
        class264 var1 = (class264) field3335.method3902((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3347.method4494(13, arg0);
        class264 var3 = new class264();
        var3.field3338 = arg0;
        if (var2 != null) {
            var3.method4684(new class190(var2));
        }
        field3335.method3908(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ja.l(Lgc;S)V")
    public void method4684(class190 arg0) {
        while (true) {
            int var2 = arg0.method3511();
            if (var2 == 0) {
                return;
            }
            this.method4685(arg0, var2);
        }
    }

    @ObfuscatedName("ja.g(Lgc;II)V")
    public void method4685(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3339 = arg0.method3513();
        } else if (arg1 == 2) {
            this.field3345 = arg0.method3513();
        } else if (arg1 == 4) {
            this.field3340 = arg0.method3513();
        } else if (arg1 == 5) {
            this.field3346 = arg0.method3513();
        } else if (arg1 == 6) {
            this.field3351 = arg0.method3513();
        } else if (arg1 == 7) {
            this.field3348 = arg0.method3511();
        } else if (arg1 == 8) {
            this.field3349 = arg0.method3511();
        } else if (arg1 == 40) {
            int var3 = arg0.method3511();
            this.field3341 = new short[var3];
            this.field3343 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3341[var4] = (short) arg0.method3513();
                this.field3343[var4] = (short) arg0.method3513();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3511();
            this.field3342 = new short[var5];
            this.field3344 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3342[var6] = (short) arg0.method3513();
                this.field3344[var6] = (short) arg0.method3513();
            }
        }
    }

    @ObfuscatedName("ja.b(II)Ldq;")
    public final class127 method4686(int arg0) {
        class127 var2 = (class127) field3337.method3902((long) this.field3338);
        if (var2 == null) {
            class121 var3 = class121.method2653(Statics.field2375, this.field3339, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3341 != null) {
                for (int var4 = 0; var4 < this.field3341.length; var4++) {
                    var3.method2648(this.field3341[var4], this.field3343[var4]);
                }
            }
            if (this.field3342 != null) {
                for (int var5 = 0; var5 < this.field3342.length; var5++) {
                    var3.method2590(this.field3342[var5], this.field3344[var5]);
                }
            }
            var2 = var3.method2611(this.field3348 + 64, this.field3349 + 850, -30, -50, -30);
            field3337.method3908(var2, (long) this.field3338);
        }
        class127 var6;
        if (this.field3345 == -1 || arg0 == -1) {
            var6 = var2.method2673(true);
        } else {
            var6 = class279.method2783(this.field3345).method5052(var2, arg0);
        }
        if (this.field3340 != 128 || this.field3346 != 128) {
            var6.method2722(this.field3340, this.field3346, this.field3340);
        }
        if (this.field3351 != 0) {
            if (this.field3351 == 90) {
                var6.method2683();
            }
            if (this.field3351 == 180) {
                var6.method2683();
                var6.method2683();
            }
            if (this.field3351 == 270) {
                var6.method2683();
                var6.method2683();
                var6.method2683();
            }
        }
        return var6;
    }

    @ObfuscatedName("g.a(I)V")
    public static void method30() {
        field3335.method3899();
        field3337.method3899();
    }
}

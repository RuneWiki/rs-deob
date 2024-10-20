package deob;

@ObfuscatedName("io")
public class class255 extends class181 {

    @ObfuscatedName("io.q")
    public static class146 field3328 = new class146(64);

    @ObfuscatedName("io.w")
    public static class146 field3317 = new class146(30);

    @ObfuscatedName("io.o")
    public int field3318;

    @ObfuscatedName("io.u")
    public int field3319;

    @ObfuscatedName("io.g")
    public int field3315 = -1;

    @ObfuscatedName("io.l")
    public short[] field3321;

    @ObfuscatedName("io.e")
    public short[] field3325;

    @ObfuscatedName("io.x")
    public short[] field3323;

    @ObfuscatedName("io.d")
    public short[] field3324;

    @ObfuscatedName("io.k")
    public int field3322 = 128;

    @ObfuscatedName("io.n")
    public int field3326 = 128;

    @ObfuscatedName("io.i")
    public int field3316 = 0;

    @ObfuscatedName("io.a")
    public int field3327 = 0;

    @ObfuscatedName("io.z")
    public int field3329 = 0;

    @ObfuscatedName("af.m(IB)Lio;")
    public static class255 method756(int arg0) {
        class255 var1 = (class255) field3328.method3011((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3320.method4156(13, arg0);
        class255 var3 = new class255();
        var3.field3318 = arg0;
        if (var2 != null) {
            var3.method4410(new class202(var2));
        }
        field3328.method3009(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.f(Lgr;I)V")
    public void method4410(class202 arg0) {
        while (true) {
            int var2 = arg0.method3551();
            if (var2 == 0) {
                return;
            }
            this.method4394(arg0, var2);
        }
    }

    @ObfuscatedName("io.q(Lgr;II)V")
    public void method4394(class202 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3319 = arg0.method3530();
        } else if (arg1 == 2) {
            this.field3315 = arg0.method3530();
        } else if (arg1 == 4) {
            this.field3322 = arg0.method3530();
        } else if (arg1 == 5) {
            this.field3326 = arg0.method3530();
        } else if (arg1 == 6) {
            this.field3316 = arg0.method3530();
        } else if (arg1 == 7) {
            this.field3327 = arg0.method3551();
        } else if (arg1 == 8) {
            this.field3329 = arg0.method3551();
        } else if (arg1 == 40) {
            int var3 = arg0.method3551();
            this.field3321 = new short[var3];
            this.field3325 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3321[var4] = (short) arg0.method3530();
                this.field3325[var4] = (short) arg0.method3530();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3551();
            this.field3323 = new short[var5];
            this.field3324 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3323[var6] = (short) arg0.method3530();
                this.field3324[var6] = (short) arg0.method3530();
            }
        }
    }

    @ObfuscatedName("io.w(II)Ldu;")
    public final class128 method4396(int arg0) {
        class128 var2 = (class128) field3317.method3011((long) this.field3318);
        if (var2 == null) {
            class122 var3 = class122.method2537(Statics.field3314, this.field3319, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3321 != null) {
                for (int var4 = 0; var4 < this.field3321.length; var4++) {
                    var3.method2538(this.field3321[var4], this.field3325[var4]);
                }
            }
            if (this.field3323 != null) {
                for (int var5 = 0; var5 < this.field3323.length; var5++) {
                    var3.method2543(this.field3323[var5], this.field3324[var5]);
                }
            }
            var2 = var3.method2572(this.field3327 + 64, this.field3329 + 850, -30, -50, -30);
            field3317.method3009(var2, (long) this.field3318);
        }
        class128 var6;
        if (this.field3315 == -1 || arg0 == -1) {
            var6 = var2.method2620(true);
        } else {
            var6 = class270.method596(this.field3315).method4770(var2, arg0);
        }
        if (this.field3322 != 128 || this.field3326 != 128) {
            var6.method2635(this.field3322, this.field3326, this.field3322);
        }
        if (this.field3316 != 0) {
            if (this.field3316 == 90) {
                var6.method2660();
            }
            if (this.field3316 == 180) {
                var6.method2660();
                var6.method2660();
            }
            if (this.field3316 == 270) {
                var6.method2660();
                var6.method2660();
                var6.method2660();
            }
        }
        return var6;
    }

    @ObfuscatedName("fq.o(I)V")
    public static void method3097() {
        field3328.method3010();
        field3317.method3010();
    }
}

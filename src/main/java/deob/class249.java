package deob;

@ObfuscatedName("ig")
public class class249 extends class198 {

    @ObfuscatedName("ig.f")
    public static class193 field3337 = new class193(64);

    @ObfuscatedName("ig.m")
    public static class193 field3350 = new class193(30);

    @ObfuscatedName("ig.h")
    public int field3339;

    @ObfuscatedName("ig.t")
    public int field3341;

    @ObfuscatedName("ig.p")
    public int field3338 = -1;

    @ObfuscatedName("ig.d")
    public short[] field3342;

    @ObfuscatedName("ig.n")
    public short[] field3343;

    @ObfuscatedName("ig.z")
    public short[] field3344;

    @ObfuscatedName("ig.o")
    public short[] field3345;

    @ObfuscatedName("ig.q")
    public int field3346 = 128;

    @ObfuscatedName("ig.u")
    public int field3347 = 128;

    @ObfuscatedName("ig.k")
    public int field3348 = 0;

    @ObfuscatedName("ig.e")
    public int field3349 = 0;

    @ObfuscatedName("ig.r")
    public int field3340 = 0;

    @ObfuscatedName("gd.s(Liw;Liw;B)V")
    public static void method3202(class239 arg0, class239 arg1) {
        Statics.field3336 = arg0;
        Statics.field649 = arg1;
    }

    @ObfuscatedName("iu.c(II)Lig;")
    public static class249 method3835(int arg0) {
        class249 var1 = (class249) field3337.method3319((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3336.method3840(13, arg0);
        class249 var3 = new class249();
        var3.field3339 = arg0;
        if (var2 != null) {
            var3.method4066(new class177(var2));
        }
        field3337.method3315(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ig.f(Lfs;I)V")
    public void method4066(class177 arg0) {
        while (true) {
            int var2 = arg0.method2965();
            if (var2 == 0) {
                return;
            }
            this.method4058(arg0, var2);
        }
    }

    @ObfuscatedName("ig.m(Lfs;II)V")
    public void method4058(class177 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3341 = arg0.method2967();
        } else if (arg1 == 2) {
            this.field3338 = arg0.method2967();
        } else if (arg1 == 4) {
            this.field3346 = arg0.method2967();
        } else if (arg1 == 5) {
            this.field3347 = arg0.method2967();
        } else if (arg1 == 6) {
            this.field3348 = arg0.method2967();
        } else if (arg1 == 7) {
            this.field3349 = arg0.method2965();
        } else if (arg1 == 8) {
            this.field3340 = arg0.method2965();
        } else if (arg1 == 40) {
            int var3 = arg0.method2965();
            this.field3342 = new short[var3];
            this.field3343 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3342[var4] = (short) arg0.method2967();
                this.field3343[var4] = (short) arg0.method2967();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2965();
            this.field3344 = new short[var5];
            this.field3345 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3344[var6] = (short) arg0.method2967();
                this.field3345[var6] = (short) arg0.method2967();
            }
        }
    }

    @ObfuscatedName("ig.h(II)Leb;")
    public final class134 method4051(int arg0) {
        class134 var2 = (class134) field3350.method3319((long) this.field3339);
        if (var2 == null) {
            class128 var3 = class128.method2239(Statics.field649, this.field3341, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3342 != null) {
                for (int var4 = 0; var4 < this.field3342.length; var4++) {
                    var3.method2249(this.field3342[var4], this.field3343[var4]);
                }
            }
            if (this.field3344 != null) {
                for (int var5 = 0; var5 < this.field3344.length; var5++) {
                    var3.method2250(this.field3344[var5], this.field3345[var5]);
                }
            }
            var2 = var3.method2257(this.field3349 + 64, this.field3340 + 850, -30, -50, -30);
            field3350.method3315(var2, (long) this.field3339);
        }
        class134 var6;
        if (this.field3338 == -1 || arg0 == -1) {
            var6 = var2.method2344(true);
        } else {
            var6 = class264.method341(this.field3338).method4440(var2, arg0);
        }
        if (this.field3346 != 128 || this.field3347 != 128) {
            var6.method2358(this.field3346, this.field3347, this.field3346);
        }
        if (this.field3348 != 0) {
            if (this.field3348 == 90) {
                var6.method2353();
            }
            if (this.field3348 == 180) {
                var6.method2353();
                var6.method2353();
            }
            if (this.field3348 == 270) {
                var6.method2353();
                var6.method2353();
                var6.method2353();
            }
        }
        return var6;
    }

    @ObfuscatedName("ai.t(I)V")
    public static void method668() {
        field3337.method3316();
        field3350.method3316();
    }
}

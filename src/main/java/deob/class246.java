package deob;

@ObfuscatedName("iq")
public class class246 extends class195 {

    @ObfuscatedName("iq.i")
    public static class190 field3328 = new class190(64);

    @ObfuscatedName("iq.j")
    public static class190 field3329 = new class190(30);

    @ObfuscatedName("iq.f")
    public int field3335;

    @ObfuscatedName("iq.m")
    public int field3332;

    @ObfuscatedName("iq.c")
    public int field3341 = -1;

    @ObfuscatedName("iq.z")
    public short[] field3326;

    @ObfuscatedName("iq.h")
    public short[] field3334;

    @ObfuscatedName("iq.g")
    public short[] field3340;

    @ObfuscatedName("iq.e")
    public short[] field3336;

    @ObfuscatedName("iq.o")
    public int field3337 = 128;

    @ObfuscatedName("iq.x")
    public int field3333 = 128;

    @ObfuscatedName("iq.a")
    public int field3339 = 0;

    @ObfuscatedName("iq.y")
    public int field3338 = 0;

    @ObfuscatedName("iq.r")
    public int field3330 = 0;

    @ObfuscatedName("ff.n(Lis;Lis;I)V")
    public static void method2753(class236 arg0, class236 arg1) {
        Statics.field3327 = arg0;
        Statics.field3331 = arg1;
    }

    @ObfuscatedName("cx.p(II)Liq;")
    public static class246 method1711(int arg0) {
        class246 var1 = (class246) field3328.method3280((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3327.method3880(13, arg0);
        class246 var3 = new class246();
        var3.field3335 = arg0;
        if (var2 != null) {
            var3.method4046(new class174(var2));
        }
        field3328.method3282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.i(Lfl;I)V")
    public void method4046(class174 arg0) {
        while (true) {
            int var2 = arg0.method2925();
            if (var2 == 0) {
                return;
            }
            this.method4047(arg0, var2);
        }
    }

    @ObfuscatedName("iq.j(Lfl;II)V")
    public void method4047(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3332 = arg0.method3065();
        } else if (arg1 == 2) {
            this.field3341 = arg0.method3065();
        } else if (arg1 == 4) {
            this.field3337 = arg0.method3065();
        } else if (arg1 == 5) {
            this.field3333 = arg0.method3065();
        } else if (arg1 == 6) {
            this.field3339 = arg0.method3065();
        } else if (arg1 == 7) {
            this.field3338 = arg0.method2925();
        } else if (arg1 == 8) {
            this.field3330 = arg0.method2925();
        } else if (arg1 == 40) {
            int var3 = arg0.method2925();
            this.field3326 = new short[var3];
            this.field3334 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3326[var4] = (short) arg0.method3065();
                this.field3334[var4] = (short) arg0.method3065();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2925();
            this.field3340 = new short[var5];
            this.field3336 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3340[var6] = (short) arg0.method3065();
                this.field3336[var6] = (short) arg0.method3065();
            }
        }
    }

    @ObfuscatedName("iq.f(II)Lek;")
    public final class134 method4048(int arg0) {
        class134 var2 = (class134) field3329.method3280((long) this.field3335);
        if (var2 == null) {
            class128 var3 = class128.method2225(Statics.field3331, this.field3332, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3326 != null) {
                for (int var4 = 0; var4 < this.field3326.length; var4++) {
                    var3.method2299(this.field3326[var4], this.field3334[var4]);
                }
            }
            if (this.field3340 != null) {
                for (int var5 = 0; var5 < this.field3340.length; var5++) {
                    var3.method2239(this.field3340[var5], this.field3336[var5]);
                }
            }
            var2 = var3.method2246(this.field3338 + 64, this.field3330 + 850, -30, -50, -30);
            field3329.method3282(var2, (long) this.field3335);
        }
        class134 var6;
        if (this.field3341 == -1 || arg0 == -1) {
            var6 = var2.method2321(true);
        } else {
            var6 = class261.method2887(this.field3341).method4418(var2, arg0);
        }
        if (this.field3337 != 128 || this.field3333 != 128) {
            var6.method2336(this.field3337, this.field3333, this.field3337);
        }
        if (this.field3339 != 0) {
            if (this.field3339 == 90) {
                var6.method2331();
            }
            if (this.field3339 == 180) {
                var6.method2331();
                var6.method2331();
            }
            if (this.field3339 == 270) {
                var6.method2331();
                var6.method2331();
                var6.method2331();
            }
        }
        return var6;
    }
}

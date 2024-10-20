package deob;

@ObfuscatedName("ib")
public class class247 extends class196 {

    @ObfuscatedName("ib.g")
    public static class191 field3318 = new class191(64);

    @ObfuscatedName("ib.y")
    public static class191 field3319 = new class191(30);

    @ObfuscatedName("ib.w")
    public int field3320;

    @ObfuscatedName("ib.k")
    public int field3321;

    @ObfuscatedName("ib.v")
    public int field3332 = -1;

    @ObfuscatedName("ib.z")
    public short[] field3316;

    @ObfuscatedName("ib.r")
    public short[] field3322;

    @ObfuscatedName("ib.u")
    public short[] field3325;

    @ObfuscatedName("ib.d")
    public short[] field3326;

    @ObfuscatedName("ib.o")
    public int field3327 = 128;

    @ObfuscatedName("ib.l")
    public int field3330 = 128;

    @ObfuscatedName("ib.h")
    public int field3329 = 0;

    @ObfuscatedName("ib.s")
    public int field3324 = 0;

    @ObfuscatedName("ib.c")
    public int field3331 = 0;

    @ObfuscatedName("io.e(Lit;Lit;B)V")
    public static void method3995(class237 arg0, class237 arg1) {
        Statics.field3323 = arg0;
        Statics.field3317 = arg1;
    }

    @ObfuscatedName("bp.n(II)Lib;")
    public static class247 method891(int arg0) {
        class247 var1 = (class247) field3318.method3288((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3323.method3817(13, arg0);
        class247 var3 = new class247();
        var3.field3320 = arg0;
        if (var2 != null) {
            var3.method4033(new class175(var2));
        }
        field3318.method3278(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ib.g(Lfh;I)V")
    public void method4033(class175 arg0) {
        while (true) {
            int var2 = arg0.method2928();
            if (var2 == 0) {
                return;
            }
            this.method4022(arg0, var2);
        }
    }

    @ObfuscatedName("ib.y(Lfh;IB)V")
    public void method4022(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3321 = arg0.method3091();
        } else if (arg1 == 2) {
            this.field3332 = arg0.method3091();
        } else if (arg1 == 4) {
            this.field3327 = arg0.method3091();
        } else if (arg1 == 5) {
            this.field3330 = arg0.method3091();
        } else if (arg1 == 6) {
            this.field3329 = arg0.method3091();
        } else if (arg1 == 7) {
            this.field3324 = arg0.method2928();
        } else if (arg1 == 8) {
            this.field3331 = arg0.method2928();
        } else if (arg1 == 40) {
            int var3 = arg0.method2928();
            this.field3316 = new short[var3];
            this.field3322 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3316[var4] = (short) arg0.method3091();
                this.field3322[var4] = (short) arg0.method3091();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2928();
            this.field3325 = new short[var5];
            this.field3326 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3325[var6] = (short) arg0.method3091();
                this.field3326[var6] = (short) arg0.method3091();
            }
        }
    }

    @ObfuscatedName("ib.w(II)Lew;")
    public final class135 method4024(int arg0) {
        class135 var2 = (class135) field3319.method3288((long) this.field3320);
        if (var2 == null) {
            class129 var3 = class129.method2235(Statics.field3317, this.field3321, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3316 != null) {
                for (int var4 = 0; var4 < this.field3316.length; var4++) {
                    var3.method2234(this.field3316[var4], this.field3322[var4]);
                }
            }
            if (this.field3325 != null) {
                for (int var5 = 0; var5 < this.field3325.length; var5++) {
                    var3.method2248(this.field3325[var5], this.field3326[var5]);
                }
            }
            var2 = var3.method2242(this.field3324 + 64, this.field3331 + 850, -30, -50, -30);
            field3319.method3278(var2, (long) this.field3320);
        }
        class135 var6;
        if (this.field3332 == -1 || arg0 == -1) {
            var6 = var2.method2355(true);
        } else {
            var6 = class262.method1025(this.field3332).method4401(var2, arg0);
        }
        if (this.field3327 != 128 || this.field3330 != 128) {
            var6.method2332(this.field3327, this.field3330, this.field3327);
        }
        if (this.field3329 != 0) {
            if (this.field3329 == 90) {
                var6.method2357();
            }
            if (this.field3329 == 180) {
                var6.method2357();
                var6.method2357();
            }
            if (this.field3329 == 270) {
                var6.method2357();
                var6.method2357();
                var6.method2357();
            }
        }
        return var6;
    }

    @ObfuscatedName("ay.k(I)V")
    public static void method211() {
        field3318.method3282();
        field3319.method3282();
    }
}

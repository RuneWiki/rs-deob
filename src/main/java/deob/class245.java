package deob;

@ObfuscatedName("iu")
public class class245 extends class176 {

    @ObfuscatedName("iu.o")
    public static class146 field3236 = new class146(64);

    @ObfuscatedName("iu.e")
    public static class146 field3237 = new class146(30);

    @ObfuscatedName("iu.i")
    public int field3238;

    @ObfuscatedName("iu.g")
    public int field3239;

    @ObfuscatedName("iu.d")
    public int field3246 = -1;

    @ObfuscatedName("iu.l")
    public short[] field3249;

    @ObfuscatedName("iu.j")
    public short[] field3244;

    @ObfuscatedName("iu.m")
    public short[] field3243;

    @ObfuscatedName("iu.p")
    public short[] field3240;

    @ObfuscatedName("iu.h")
    public int field3245 = 128;

    @ObfuscatedName("iu.v")
    public int field3235 = 128;

    @ObfuscatedName("iu.n")
    public int field3247 = 0;

    @ObfuscatedName("iu.x")
    public int field3248 = 0;

    @ObfuscatedName("iu.w")
    public int field3253 = 0;

    @ObfuscatedName("bm.c(II)Liu;")
    public static class245 method1108(int arg0) {
        class245 var1 = (class245) field3236.method3100((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3241.method3845(13, arg0);
        class245 var3 = new class245();
        var3.field3238 = arg0;
        if (var2 != null) {
            var3.method4088(new class301(var2));
        }
        field3236.method3102(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.t(Lkp;B)V")
    public void method4088(class301 arg0) {
        while (true) {
            int var2 = arg0.method5129();
            if (var2 == 0) {
                return;
            }
            this.method4089(arg0, var2);
        }
    }

    @ObfuscatedName("iu.o(Lkp;IB)V")
    public void method4089(class301 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3239 = arg0.method5124();
        } else if (arg1 == 2) {
            this.field3246 = arg0.method5124();
        } else if (arg1 == 4) {
            this.field3245 = arg0.method5124();
        } else if (arg1 == 5) {
            this.field3235 = arg0.method5124();
        } else if (arg1 == 6) {
            this.field3247 = arg0.method5124();
        } else if (arg1 == 7) {
            this.field3248 = arg0.method5129();
        } else if (arg1 == 8) {
            this.field3253 = arg0.method5129();
        } else if (arg1 == 40) {
            int var3 = arg0.method5129();
            this.field3249 = new short[var3];
            this.field3244 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3249[var4] = (short) arg0.method5124();
                this.field3244[var4] = (short) arg0.method5124();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5129();
            this.field3243 = new short[var5];
            this.field3240 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3243[var6] = (short) arg0.method5124();
                this.field3240[var6] = (short) arg0.method5124();
            }
        }
    }

    @ObfuscatedName("iu.e(II)Ldx;")
    public final class128 method4090(int arg0) {
        class128 var2 = (class128) field3237.method3100((long) this.field3238);
        if (var2 == null) {
            class122 var3 = class122.method2633(Statics.field3155, this.field3239, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3249 != null) {
                for (int var4 = 0; var4 < this.field3249.length; var4++) {
                    var3.method2588(this.field3249[var4], this.field3244[var4]);
                }
            }
            if (this.field3243 != null) {
                for (int var5 = 0; var5 < this.field3243.length; var5++) {
                    var3.method2589(this.field3243[var5], this.field3240[var5]);
                }
            }
            var2 = var3.method2595(this.field3248 + 64, this.field3253 + 850, -30, -50, -30);
            field3237.method3102(var2, (long) this.field3238);
        }
        class128 var6;
        if (this.field3246 == -1 || arg0 == -1) {
            var6 = var2.method2667(true);
        } else {
            var6 = class260.method5476(this.field3246).method4444(var2, arg0);
        }
        if (this.field3245 != 128 || this.field3235 != 128) {
            var6.method2750(this.field3245, this.field3235, this.field3245);
        }
        if (this.field3247 != 0) {
            if (this.field3247 == 90) {
                var6.method2689();
            }
            if (this.field3247 == 180) {
                var6.method2689();
                var6.method2689();
            }
            if (this.field3247 == 270) {
                var6.method2689();
                var6.method2689();
                var6.method2689();
            }
        }
        return var6;
    }

    @ObfuscatedName("w.i(B)V")
    public static void method161() {
        field3236.method3103();
        field3237.method3103();
    }
}

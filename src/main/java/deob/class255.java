package deob;

@ObfuscatedName("ik")
public class class255 extends class185 {

    @ObfuscatedName("ik.x")
    public static class155 field3282 = new class155(64);

    @ObfuscatedName("ik.w")
    public static class155 field3274 = new class155(30);

    @ObfuscatedName("ik.t")
    public int field3275;

    @ObfuscatedName("ik.j")
    public int field3276;

    @ObfuscatedName("ik.n")
    public int field3285 = -1;

    @ObfuscatedName("ik.p")
    public short[] field3278;

    @ObfuscatedName("ik.l")
    public short[] field3279;

    @ObfuscatedName("ik.z")
    public short[] field3283;

    @ObfuscatedName("ik.u")
    public short[] field3281;

    @ObfuscatedName("ik.e")
    public int field3280 = 128;

    @ObfuscatedName("ik.m")
    public int field3273 = 128;

    @ObfuscatedName("ik.c")
    public int field3284 = 0;

    @ObfuscatedName("ik.i")
    public int field3277 = 0;

    @ObfuscatedName("ik.f")
    public int field3271 = 0;

    @ObfuscatedName("et.h(Lib;Lib;I)V")
    public static void method3101(class245 arg0, class245 arg1) {
        Statics.field3286 = arg0;
        Statics.field3272 = arg1;
    }

    @ObfuscatedName("ct.v(IB)Lik;")
    public static class255 method2025(int arg0) {
        class255 var1 = (class255) field3282.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3286.method3834(13, arg0);
        class255 var3 = new class255();
        var3.field3275 = arg0;
        if (var2 != null) {
            var3.method4061(new class311(var2));
        }
        field3282.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ik.x(Lkj;I)V")
    public void method4061(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4062(arg0, var2);
        }
    }

    @ObfuscatedName("ik.w(Lkj;IB)V")
    public void method4062(class311 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3276 = arg0.method5342();
        } else if (arg1 == 2) {
            this.field3285 = arg0.method5342();
        } else if (arg1 == 4) {
            this.field3280 = arg0.method5342();
        } else if (arg1 == 5) {
            this.field3273 = arg0.method5342();
        } else if (arg1 == 6) {
            this.field3284 = arg0.method5342();
        } else if (arg1 == 7) {
            this.field3277 = arg0.method5274();
        } else if (arg1 == 8) {
            this.field3271 = arg0.method5274();
        } else if (arg1 == 40) {
            int var3 = arg0.method5274();
            this.field3278 = new short[var3];
            this.field3279 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3278[var4] = (short) arg0.method5342();
                this.field3279[var4] = (short) arg0.method5342();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5274();
            this.field3283 = new short[var5];
            this.field3281 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3283[var6] = (short) arg0.method5342();
                this.field3281[var6] = (short) arg0.method5342();
            }
        }
    }

    @ObfuscatedName("ik.t(II)Leh;")
    public final class137 method4075(int arg0) {
        class137 var2 = (class137) field3274.method3147((long) this.field3275);
        if (var2 == null) {
            class131 var3 = class131.method2622(Statics.field3272, this.field3276, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3278 != null) {
                for (int var4 = 0; var4 < this.field3278.length; var4++) {
                    var3.method2635(this.field3278[var4], this.field3279[var4]);
                }
            }
            if (this.field3283 != null) {
                for (int var5 = 0; var5 < this.field3283.length; var5++) {
                    var3.method2631(this.field3283[var5], this.field3281[var5]);
                }
            }
            var2 = var3.method2674(this.field3277 + 64, this.field3271 + 850, -30, -50, -30);
            field3274.method3145(var2, (long) this.field3275);
        }
        class137 var6;
        if (this.field3285 == -1 || arg0 == -1) {
            var6 = var2.method2720(true);
        } else {
            var6 = class270.method4174(this.field3285).method4446(var2, arg0);
        }
        if (this.field3280 != 128 || this.field3273 != 128) {
            var6.method2735(this.field3280, this.field3273, this.field3280);
        }
        if (this.field3284 != 0) {
            if (this.field3284 == 90) {
                var6.method2743();
            }
            if (this.field3284 == 180) {
                var6.method2743();
                var6.method2743();
            }
            if (this.field3284 == 270) {
                var6.method2743();
                var6.method2743();
                var6.method2743();
            }
        }
        return var6;
    }

    @ObfuscatedName("ey.j(I)V")
    public static void method3122() {
        field3282.method3146();
        field3274.method3146();
    }
}

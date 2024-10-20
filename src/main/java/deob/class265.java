package deob;

@ObfuscatedName("jh")
public class class265 extends class214 {

    @ObfuscatedName("jh.g")
    public static class208 field3350 = new class208(64);

    @ObfuscatedName("jh.x")
    public static class208 field3351 = new class208(30);

    @ObfuscatedName("jh.h")
    public int field3357;

    @ObfuscatedName("jh.f")
    public int field3353;

    @ObfuscatedName("jh.p")
    public int field3359 = -1;

    @ObfuscatedName("jh.m")
    public short[] field3355;

    @ObfuscatedName("jh.q")
    public short[] field3352;

    @ObfuscatedName("jh.b")
    public short[] field3348;

    @ObfuscatedName("jh.n")
    public short[] field3358;

    @ObfuscatedName("jh.e")
    public int field3356 = 128;

    @ObfuscatedName("jh.r")
    public int field3360 = 128;

    @ObfuscatedName("jh.t")
    public int field3361 = 0;

    @ObfuscatedName("jh.l")
    public int field3362 = 0;

    @ObfuscatedName("jh.o")
    public int field3363 = 0;

    @ObfuscatedName("ax.a(Liz;Liz;I)V")
    public static void method717(class255 arg0, class255 arg1) {
        Statics.field3354 = arg0;
        Statics.field3349 = arg1;
    }

    @ObfuscatedName("dz.s(II)Ljh;")
    public static class265 method2303(int arg0) {
        class265 var1 = (class265) field3350.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3354.method4422(13, arg0);
        class265 var3 = new class265();
        var3.field3357 = arg0;
        if (var2 != null) {
            var3.method4645(new class190(var2));
        }
        field3350.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jh.g(Lgx;I)V")
    public void method4645(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4647(arg0, var2);
        }
    }

    @ObfuscatedName("jh.x(Lgx;II)V")
    public void method4647(class190 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3353 = arg0.method3610();
        } else if (arg1 == 2) {
            this.field3359 = arg0.method3610();
        } else if (arg1 == 4) {
            this.field3356 = arg0.method3610();
        } else if (arg1 == 5) {
            this.field3360 = arg0.method3610();
        } else if (arg1 == 6) {
            this.field3361 = arg0.method3610();
        } else if (arg1 == 7) {
            this.field3362 = arg0.method3443();
        } else if (arg1 == 8) {
            this.field3363 = arg0.method3443();
        } else if (arg1 == 40) {
            int var3 = arg0.method3443();
            this.field3355 = new short[var3];
            this.field3352 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3355[var4] = (short) arg0.method3610();
                this.field3352[var4] = (short) arg0.method3610();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3443();
            this.field3348 = new short[var5];
            this.field3358 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3348[var6] = (short) arg0.method3610();
                this.field3358[var6] = (short) arg0.method3610();
            }
        }
    }

    @ObfuscatedName("jh.h(IB)Ldv;")
    public final class127 method4644(int arg0) {
        class127 var2 = (class127) field3351.method3885((long) this.field3357);
        if (var2 == null) {
            class121 var3 = class121.method2585(Statics.field3349, this.field3353, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3355 != null) {
                for (int var4 = 0; var4 < this.field3355.length; var4++) {
                    var3.method2607(this.field3355[var4], this.field3352[var4]);
                }
            }
            if (this.field3348 != null) {
                for (int var5 = 0; var5 < this.field3348.length; var5++) {
                    var3.method2656(this.field3348[var5], this.field3358[var5]);
                }
            }
            var2 = var3.method2658(this.field3362 + 64, this.field3363 + 850, -30, -50, -30);
            field3351.method3878(var2, (long) this.field3357);
        }
        class127 var6;
        if (this.field3359 == -1 || arg0 == -1) {
            var6 = var2.method2679(true);
        } else {
            var6 = class280.method3173(this.field3359).method5015(var2, arg0);
        }
        if (this.field3356 != 128 || this.field3360 != 128) {
            var6.method2693(this.field3356, this.field3360, this.field3356);
        }
        if (this.field3361 != 0) {
            if (this.field3361 == 90) {
                var6.method2692();
            }
            if (this.field3361 == 180) {
                var6.method2692();
                var6.method2692();
            }
            if (this.field3361 == 270) {
                var6.method2692();
                var6.method2692();
                var6.method2692();
            }
        }
        return var6;
    }

    @ObfuscatedName("aa.f(I)V")
    public static void method509() {
        field3350.method3879();
        field3351.method3879();
    }
}

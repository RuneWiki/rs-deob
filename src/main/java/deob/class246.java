package deob;

@ObfuscatedName("ic")
public class class246 extends class195 {

    @ObfuscatedName("ic.m")
    public static class190 field3300 = new class190(64);

    @ObfuscatedName("ic.g")
    public static class190 field3301 = new class190(30);

    @ObfuscatedName("ic.d")
    public int field3302;

    @ObfuscatedName("ic.b")
    public int field3298;

    @ObfuscatedName("ic.k")
    public int field3304 = -1;

    @ObfuscatedName("ic.f")
    public short[] field3305;

    @ObfuscatedName("ic.j")
    public short[] field3309;

    @ObfuscatedName("ic.q")
    public short[] field3307;

    @ObfuscatedName("ic.h")
    public short[] field3308;

    @ObfuscatedName("ic.i")
    public int field3310 = 128;

    @ObfuscatedName("ic.s")
    public int field3311 = 128;

    @ObfuscatedName("ic.n")
    public int field3306 = 0;

    @ObfuscatedName("ic.c")
    public int field3312 = 0;

    @ObfuscatedName("ic.v")
    public int field3313 = 0;

    @ObfuscatedName("bv.e(Lin;Lin;I)V")
    public static void method1052(class236 arg0, class236 arg1) {
        Statics.field3315 = arg0;
        Statics.field3299 = arg1;
    }

    @ObfuscatedName("bs.o(IB)Lic;")
    public static class246 method707(int arg0) {
        class246 var1 = (class246) field3300.method3248((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3315.method3760(13, arg0);
        class246 var3 = new class246();
        var3.field3302 = arg0;
        if (var2 != null) {
            var3.method3968(new class174(var2));
        }
        field3300.method3250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.m(Lfw;S)V")
    public void method3968(class174 arg0) {
        while (true) {
            int var2 = arg0.method2891();
            if (var2 == 0) {
                return;
            }
            this.method3956(arg0, var2);
        }
    }

    @ObfuscatedName("ic.g(Lfw;II)V")
    public void method3956(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3298 = arg0.method2930();
        } else if (arg1 == 2) {
            this.field3304 = arg0.method2930();
        } else if (arg1 == 4) {
            this.field3310 = arg0.method2930();
        } else if (arg1 == 5) {
            this.field3311 = arg0.method2930();
        } else if (arg1 == 6) {
            this.field3306 = arg0.method2930();
        } else if (arg1 == 7) {
            this.field3312 = arg0.method2891();
        } else if (arg1 == 8) {
            this.field3313 = arg0.method2891();
        } else if (arg1 == 40) {
            int var3 = arg0.method2891();
            this.field3305 = new short[var3];
            this.field3309 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3305[var4] = (short) arg0.method2930();
                this.field3309[var4] = (short) arg0.method2930();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2891();
            this.field3307 = new short[var5];
            this.field3308 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3307[var6] = (short) arg0.method2930();
                this.field3308[var6] = (short) arg0.method2930();
            }
        }
    }

    @ObfuscatedName("ic.d(IB)Leo;")
    public final class134 method3957(int arg0) {
        class134 var2 = (class134) field3301.method3248((long) this.field3302);
        if (var2 == null) {
            class128 var3 = class128.method2202(Statics.field3299, this.field3298, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3305 != null) {
                for (int var4 = 0; var4 < this.field3305.length; var4++) {
                    var3.method2189(this.field3305[var4], this.field3309[var4]);
                }
            }
            if (this.field3307 != null) {
                for (int var5 = 0; var5 < this.field3307.length; var5++) {
                    var3.method2190(this.field3307[var5], this.field3308[var5]);
                }
            }
            var2 = var3.method2226(this.field3312 + 64, this.field3313 + 850, -30, -50, -30);
            field3301.method3250(var2, (long) this.field3302);
        }
        class134 var6;
        if (this.field3304 == -1 || arg0 == -1) {
            var6 = var2.method2314(true);
        } else {
            var6 = class261.method2746(this.field3304).method4336(var2, arg0);
        }
        if (this.field3310 != 128 || this.field3311 != 128) {
            var6.method2292(this.field3310, this.field3311, this.field3310);
        }
        if (this.field3306 != 0) {
            if (this.field3306 == 90) {
                var6.method2288();
            }
            if (this.field3306 == 180) {
                var6.method2288();
                var6.method2288();
            }
            if (this.field3306 == 270) {
                var6.method2288();
                var6.method2288();
                var6.method2288();
            }
        }
        return var6;
    }

    @ObfuscatedName("ax.b(I)V")
    public static void method468() {
        field3300.method3247();
        field3301.method3247();
    }
}

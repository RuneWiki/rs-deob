package deob;

@ObfuscatedName("iz")
public class class259 extends class207 {

    @ObfuscatedName("iz.q")
    public static class201 field3301 = new class201(64);

    @ObfuscatedName("iz.b")
    public static class201 field3300 = new class201(30);

    @ObfuscatedName("iz.f")
    public int field3291;

    @ObfuscatedName("iz.n")
    public int field3292;

    @ObfuscatedName("iz.h")
    public int field3293 = -1;

    @ObfuscatedName("iz.x")
    public short[] field3290;

    @ObfuscatedName("iz.j")
    public short[] field3295;

    @ObfuscatedName("iz.a")
    public short[] field3302;

    @ObfuscatedName("iz.l")
    public short[] field3297;

    @ObfuscatedName("iz.d")
    public int field3288 = 128;

    @ObfuscatedName("iz.s")
    public int field3299 = 128;

    @ObfuscatedName("iz.p")
    public int field3296 = 0;

    @ObfuscatedName("iz.g")
    public int field3294 = 0;

    @ObfuscatedName("iz.y")
    public int field3298 = 0;

    @ObfuscatedName("client.w(Liv;Liv;I)V")
    public static void method1463(class248 arg0, class248 arg1) {
        Statics.field3289 = arg0;
        Statics.field1202 = arg1;
    }

    @ObfuscatedName("ak.m(II)Liz;")
    public static class259 method973(int arg0) {
        class259 var1 = (class259) field3301.method3707((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3289.method4250(13, arg0);
        class259 var3 = new class259();
        var3.field3291 = arg0;
        if (var2 != null) {
            var3.method4475(new class183(var2));
        }
        field3301.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.q(Lgy;I)V")
    public void method4475(class183 arg0) {
        while (true) {
            int var2 = arg0.method3436();
            if (var2 == 0) {
                return;
            }
            this.method4476(arg0, var2);
        }
    }

    @ObfuscatedName("iz.x(Lgy;II)V")
    public void method4476(class183 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3292 = arg0.method3268();
        } else if (arg1 == 2) {
            this.field3293 = arg0.method3268();
        } else if (arg1 == 4) {
            this.field3288 = arg0.method3268();
        } else if (arg1 == 5) {
            this.field3299 = arg0.method3268();
        } else if (arg1 == 6) {
            this.field3296 = arg0.method3268();
        } else if (arg1 == 7) {
            this.field3294 = arg0.method3436();
        } else if (arg1 == 8) {
            this.field3298 = arg0.method3436();
        } else if (arg1 == 40) {
            int var3 = arg0.method3436();
            this.field3290 = new short[var3];
            this.field3295 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3290[var4] = (short) arg0.method3268();
                this.field3295[var4] = (short) arg0.method3268();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3436();
            this.field3302 = new short[var5];
            this.field3297 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3302[var6] = (short) arg0.method3268();
                this.field3297[var6] = (short) arg0.method3268();
            }
        }
    }

    @ObfuscatedName("iz.j(II)Ldk;")
    public final class120 method4477(int arg0) {
        class120 var2 = (class120) field3300.method3707((long) this.field3291);
        if (var2 == null) {
            class114 var3 = class114.method2406(Statics.field1202, this.field3292, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3290 != null) {
                for (int var4 = 0; var4 < this.field3290.length; var4++) {
                    var3.method2476(this.field3290[var4], this.field3295[var4]);
                }
            }
            if (this.field3302 != null) {
                for (int var5 = 0; var5 < this.field3302.length; var5++) {
                    var3.method2419(this.field3302[var5], this.field3297[var5]);
                }
            }
            var2 = var3.method2418(this.field3294 + 64, this.field3298 + 850, -30, -50, -30);
            field3300.method3712(var2, (long) this.field3291);
        }
        class120 var6;
        if (this.field3293 == -1 || arg0 == -1) {
            var6 = var2.method2509(true);
        } else {
            var6 = class274.method2918(this.field3293).method4834(var2, arg0);
        }
        if (this.field3288 != 128 || this.field3299 != 128) {
            var6.method2546(this.field3288, this.field3299, this.field3288);
        }
        if (this.field3296 != 0) {
            if (this.field3296 == 90) {
                var6.method2519();
            }
            if (this.field3296 == 180) {
                var6.method2519();
                var6.method2519();
            }
            if (this.field3296 == 270) {
                var6.method2519();
                var6.method2519();
                var6.method2519();
            }
        }
        return var6;
    }

    @ObfuscatedName("ec.a(I)V")
    public static void method2872() {
        field3301.method3708();
        field3300.method3708();
    }
}

package deob;

@ObfuscatedName("iz")
public class class246 extends class195 {

    @ObfuscatedName("iz.i")
    public static class190 field3310 = new class190(64);

    @ObfuscatedName("iz.u")
    public static class190 field3301 = new class190(30);

    @ObfuscatedName("iz.g")
    public int field3302;

    @ObfuscatedName("iz.m")
    public int field3303;

    @ObfuscatedName("iz.s")
    public int field3300 = -1;

    @ObfuscatedName("iz.x")
    public short[] field3305;

    @ObfuscatedName("iz.p")
    public short[] field3306;

    @ObfuscatedName("iz.k")
    public short[] field3308;

    @ObfuscatedName("iz.r")
    public short[] field3304;

    @ObfuscatedName("iz.w")
    public int field3309 = 128;

    @ObfuscatedName("iz.v")
    public int field3312 = 128;

    @ObfuscatedName("iz.h")
    public int field3311 = 0;

    @ObfuscatedName("iz.t")
    public int field3307 = 0;

    @ObfuscatedName("iz.a")
    public int field3313 = 0;

    @ObfuscatedName("gz.c(II)Liz;")
    public static class246 method3494(int arg0) {
        class246 var1 = (class246) field3310.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3298.method3741(13, arg0);
        class246 var3 = new class246();
        var3.field3302 = arg0;
        if (var2 != null) {
            var3.method3918(new class174(var2));
        }
        field3310.method3233(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.o(Lfp;B)V")
    public void method3918(class174 arg0) {
        while (true) {
            int var2 = arg0.method2843();
            if (var2 == 0) {
                return;
            }
            this.method3919(arg0, var2);
        }
    }

    @ObfuscatedName("iz.i(Lfp;II)V")
    public void method3919(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3303 = arg0.method2861();
        } else if (arg1 == 2) {
            this.field3300 = arg0.method2861();
        } else if (arg1 == 4) {
            this.field3309 = arg0.method2861();
        } else if (arg1 == 5) {
            this.field3312 = arg0.method2861();
        } else if (arg1 == 6) {
            this.field3311 = arg0.method2861();
        } else if (arg1 == 7) {
            this.field3307 = arg0.method2843();
        } else if (arg1 == 8) {
            this.field3313 = arg0.method2843();
        } else if (arg1 == 40) {
            int var3 = arg0.method2843();
            this.field3305 = new short[var3];
            this.field3306 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3305[var4] = (short) arg0.method2861();
                this.field3306[var4] = (short) arg0.method2861();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2843();
            this.field3308 = new short[var5];
            this.field3304 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3308[var6] = (short) arg0.method2861();
                this.field3304[var6] = (short) arg0.method2861();
            }
        }
    }

    @ObfuscatedName("iz.u(II)Leo;")
    public final class134 method3925(int arg0) {
        class134 var2 = (class134) field3301.method3220((long) this.field3302);
        if (var2 == null) {
            class128 var3 = class128.method2138(Statics.field3299, this.field3303, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3305 != null) {
                for (int var4 = 0; var4 < this.field3305.length; var4++) {
                    var3.method2153(this.field3305[var4], this.field3306[var4]);
                }
            }
            if (this.field3308 != null) {
                for (int var5 = 0; var5 < this.field3308.length; var5++) {
                    var3.method2154(this.field3308[var5], this.field3304[var5]);
                }
            }
            var2 = var3.method2142(this.field3307 + 64, this.field3313 + 850, -30, -50, -30);
            field3301.method3233(var2, (long) this.field3302);
        }
        class134 var6;
        if (this.field3300 == -1 || arg0 == -1) {
            var6 = var2.method2237(true);
        } else {
            var6 = Statics.method240(this.field3300).method4286(var2, arg0);
        }
        if (this.field3309 != 128 || this.field3312 != 128) {
            var6.method2294(this.field3309, this.field3312, this.field3309);
        }
        if (this.field3311 != 0) {
            if (this.field3311 == 90) {
                var6.method2246();
            }
            if (this.field3311 == 180) {
                var6.method2246();
                var6.method2246();
            }
            if (this.field3311 == 270) {
                var6.method2246();
                var6.method2246();
                var6.method2246();
            }
        }
        return var6;
    }

    @ObfuscatedName("hi.g(I)V")
    public static void method3692() {
        field3310.method3223();
        field3301.method3223();
    }
}

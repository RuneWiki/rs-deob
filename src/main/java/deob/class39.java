package deob;

@ObfuscatedName("ad")
public class class39 extends class183 {

    @ObfuscatedName("ad.h")
    public static class172 field919 = new class172(64);

    @ObfuscatedName("ad.m")
    public static class172 field920 = new class172(30);

    @ObfuscatedName("ad.u")
    public int field921;

    @ObfuscatedName("ad.j")
    public int field931;

    @ObfuscatedName("ad.b")
    public int field917 = -1;

    @ObfuscatedName("ad.v")
    public short[] field923;

    @ObfuscatedName("ad.y")
    public short[] field925;

    @ObfuscatedName("ad.w")
    public short[] field926;

    @ObfuscatedName("ad.x")
    public short[] field937;

    @ObfuscatedName("ad.k")
    public int field928 = 128;

    @ObfuscatedName("ad.o")
    public int field924 = 128;

    @ObfuscatedName("ad.a")
    public int field930 = 0;

    @ObfuscatedName("ad.f")
    public int field918 = 0;

    @ObfuscatedName("ad.r")
    public int field929 = 0;

    @ObfuscatedName("n.g(Leh;Leh;I)V")
    public static void method501(class147 arg0, class147 arg1) {
        Statics.field935 = arg0;
        Statics.field933 = arg1;
    }

    @ObfuscatedName("gj.s(IS)Lad;")
    public static class39 method3306(int arg0) {
        class39 var1 = (class39) field919.method3130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field935.method2667(13, arg0);
        class39 var3 = new class39();
        var3.field921 = arg0;
        if (var2 != null) {
            var3.method749(new class107(var2));
        }
        field919.method3126(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.h(Ldi;I)V")
    public void method749(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method742(arg0, var2);
        }
    }

    @ObfuscatedName("ad.m(Ldi;II)V")
    public void method742(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field931 = arg0.method2166();
        } else if (arg1 == 2) {
            this.field917 = arg0.method2166();
        } else if (arg1 == 4) {
            this.field928 = arg0.method2166();
        } else if (arg1 == 5) {
            this.field924 = arg0.method2166();
        } else if (arg1 == 6) {
            this.field930 = arg0.method2166();
        } else if (arg1 == 7) {
            this.field918 = arg0.method2101();
        } else if (arg1 == 8) {
            this.field929 = arg0.method2101();
        } else if (arg1 == 40) {
            int var3 = arg0.method2101();
            this.field923 = new short[var3];
            this.field925 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field923[var4] = (short) arg0.method2166();
                this.field925[var4] = (short) arg0.method2166();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2101();
            this.field926 = new short[var5];
            this.field937 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field926[var6] = (short) arg0.method2166();
                this.field937[var6] = (short) arg0.method2166();
            }
        }
    }

    @ObfuscatedName("ad.u(II)Lcl;")
    public final class98 method743(int arg0) {
        class98 var2 = (class98) field920.method3130((long) this.field921);
        if (var2 == null) {
            class93 var3 = class93.method1865(Statics.field933, this.field931, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field923 != null) {
                for (int var4 = 0; var4 < this.field923.length; var4++) {
                    var3.method1877(this.field923[var4], this.field925[var4]);
                }
            }
            if (this.field926 != null) {
                for (int var5 = 0; var5 < this.field926.length; var5++) {
                    var3.method1878(this.field926[var5], this.field937[var5]);
                }
            }
            var2 = var3.method1885(this.field918 + 64, this.field929 + 850, -30, -50, -30);
            field920.method3126(var2, (long) this.field921);
        }
        class98 var6;
        if (this.field917 == -1 || arg0 == -1) {
            var6 = var2.method1994(true);
        } else {
            var6 = class38.method114(this.field917).method736(var2, arg0);
        }
        if (this.field928 != 128 || this.field924 != 128) {
            var6.method1969(this.field928, this.field924, this.field928);
        }
        if (this.field930 != 0) {
            if (this.field930 == 90) {
                var6.method2010();
            }
            if (this.field930 == 180) {
                var6.method2010();
                var6.method2010();
            }
            if (this.field930 == 270) {
                var6.method2010();
                var6.method2010();
                var6.method2010();
            }
        }
        return var6;
    }
}

package deob;

@ObfuscatedName("ar")
public class class39 extends class182 {

    @ObfuscatedName("ar.y")
    public static class171 field925 = new class171(64);

    @ObfuscatedName("ar.w")
    public static class171 field926 = new class171(30);

    @ObfuscatedName("ar.m")
    public int field927;

    @ObfuscatedName("ar.j")
    public int field931;

    @ObfuscatedName("ar.g")
    public int field930 = -1;

    @ObfuscatedName("ar.p")
    public short[] field923;

    @ObfuscatedName("ar.o")
    public short[] field929;

    @ObfuscatedName("ar.b")
    public short[] field932;

    @ObfuscatedName("ar.x")
    public short[] field933;

    @ObfuscatedName("ar.n")
    public int field934 = 128;

    @ObfuscatedName("ar.d")
    public int field935 = 128;

    @ObfuscatedName("ar.s")
    public int field936 = 0;

    @ObfuscatedName("ar.v")
    public int field937 = 0;

    @ObfuscatedName("ar.t")
    public int field938 = 0;

    @ObfuscatedName("dk.k(Lee;Lee;B)V")
    public static void method2410(class146 arg0, class146 arg1) {
        Statics.field924 = arg0;
        Statics.field928 = arg1;
    }

    @ObfuscatedName("bi.r(II)Lar;")
    public static class39 method1416(int arg0) {
        class39 var1 = (class39) field925.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field924.method2749(13, arg0);
        class39 var3 = new class39();
        var3.field927 = arg0;
        if (var2 != null) {
            var3.method744(new class107(var2));
        }
        field925.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.y(Lde;B)V")
    public void method744(class107 arg0) {
        while (true) {
            int var2 = arg0.method2111();
            if (var2 == 0) {
                return;
            }
            this.method745(arg0, var2);
        }
    }

    @ObfuscatedName("ar.w(Lde;II)V")
    public void method745(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field931 = arg0.method2232();
        } else if (arg1 == 2) {
            this.field930 = arg0.method2232();
        } else if (arg1 == 4) {
            this.field934 = arg0.method2232();
        } else if (arg1 == 5) {
            this.field935 = arg0.method2232();
        } else if (arg1 == 6) {
            this.field936 = arg0.method2232();
        } else if (arg1 == 7) {
            this.field937 = arg0.method2111();
        } else if (arg1 == 8) {
            this.field938 = arg0.method2111();
        } else if (arg1 == 40) {
            int var3 = arg0.method2111();
            this.field923 = new short[var3];
            this.field929 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field923[var4] = (short) arg0.method2232();
                this.field929[var4] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2111();
            this.field932 = new short[var5];
            this.field933 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field932[var6] = (short) arg0.method2232();
                this.field933[var6] = (short) arg0.method2232();
            }
        }
    }

    @ObfuscatedName("ar.m(II)Lcp;")
    public final class98 method746(int arg0) {
        class98 var2 = (class98) field926.method3141((long) this.field927);
        if (var2 == null) {
            class93 var3 = class93.method1922(Statics.field928, this.field931, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field923 != null) {
                for (int var4 = 0; var4 < this.field923.length; var4++) {
                    var3.method1925(this.field923[var4], this.field929[var4]);
                }
            }
            if (this.field932 != null) {
                for (int var5 = 0; var5 < this.field932.length; var5++) {
                    var3.method1885(this.field932[var5], this.field933[var5]);
                }
            }
            var2 = var3.method1892(this.field937 + 64, this.field938 + 850, -30, -50, -30);
            field926.method3137(var2, (long) this.field927);
        }
        class98 var6;
        if (this.field930 == -1 || arg0 == -1) {
            var6 = var2.method2010(true);
        } else {
            var6 = class38.method102(this.field930).method702(var2, arg0);
        }
        if (this.field934 != 128 || this.field935 != 128) {
            var6.method1991(this.field934, this.field935, this.field934);
        }
        if (this.field936 != 0) {
            if (this.field936 == 90) {
                var6.method2004();
            }
            if (this.field936 == 180) {
                var6.method2004();
                var6.method2004();
            }
            if (this.field936 == 270) {
                var6.method2004();
                var6.method2004();
                var6.method2004();
            }
        }
        return var6;
    }
}

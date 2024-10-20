package deob;

@ObfuscatedName("ay")
public class class39 extends class183 {

    @ObfuscatedName("ay.v")
    public static class172 field922 = new class172(64);

    @ObfuscatedName("ay.o")
    public static class172 field919 = new class172(30);

    @ObfuscatedName("ay.k")
    public int field923;

    @ObfuscatedName("ay.m")
    public int field937;

    @ObfuscatedName("ay.i")
    public int field921 = -1;

    @ObfuscatedName("ay.t")
    public short[] field926;

    @ObfuscatedName("ay.l")
    public short[] field933;

    @ObfuscatedName("ay.p")
    public short[] field928;

    @ObfuscatedName("ay.r")
    public short[] field929;

    @ObfuscatedName("ay.j")
    public int field930 = 128;

    @ObfuscatedName("ay.c")
    public int field931 = 128;

    @ObfuscatedName("ay.q")
    public int field932 = 0;

    @ObfuscatedName("ay.n")
    public int field924 = 0;

    @ObfuscatedName("ay.h")
    public int field934 = 0;

    @ObfuscatedName("aq.g(Let;Let;I)V")
    public static void method732(class147 arg0, class147 arg1) {
        Statics.field940 = arg0;
        Statics.field920 = arg1;
    }

    @ObfuscatedName("au.s(II)Lay;")
    public static class39 method612(int arg0) {
        class39 var1 = (class39) field922.method3112((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field940.method2703(13, arg0);
        class39 var3 = new class39();
        var3.field923 = arg0;
        if (var2 != null) {
            var3.method735(new class107(var2));
        }
        field922.method3115(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.v(Lde;B)V")
    public void method735(class107 arg0) {
        while (true) {
            int var2 = arg0.method2116();
            if (var2 == 0) {
                return;
            }
            this.method736(arg0, var2);
        }
    }

    @ObfuscatedName("ay.o(Lde;II)V")
    public void method736(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field937 = arg0.method2094();
        } else if (arg1 == 2) {
            this.field921 = arg0.method2094();
        } else if (arg1 == 4) {
            this.field930 = arg0.method2094();
        } else if (arg1 == 5) {
            this.field931 = arg0.method2094();
        } else if (arg1 == 6) {
            this.field932 = arg0.method2094();
        } else if (arg1 == 7) {
            this.field924 = arg0.method2116();
        } else if (arg1 == 8) {
            this.field934 = arg0.method2116();
        } else if (arg1 == 40) {
            int var3 = arg0.method2116();
            this.field926 = new short[var3];
            this.field933 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field926[var4] = (short) arg0.method2094();
                this.field933[var4] = (short) arg0.method2094();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2116();
            this.field928 = new short[var5];
            this.field929 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field928[var6] = (short) arg0.method2094();
                this.field929[var6] = (short) arg0.method2094();
            }
        }
    }

    @ObfuscatedName("ay.k(II)Lcg;")
    public final class98 method745(int arg0) {
        class98 var2 = (class98) field919.method3112((long) this.field923);
        if (var2 == null) {
            class93 var3 = class93.method1890(Statics.field920, this.field937, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field926 != null) {
                for (int var4 = 0; var4 < this.field926.length; var4++) {
                    var3.method1859(this.field926[var4], this.field933[var4]);
                }
            }
            if (this.field928 != null) {
                for (int var5 = 0; var5 < this.field928.length; var5++) {
                    var3.method1860(this.field928[var5], this.field929[var5]);
                }
            }
            var2 = var3.method1867(this.field924 + 64, this.field934 + 850, -30, -50, -30);
            field919.method3115(var2, (long) this.field923);
        }
        class98 var6;
        if (this.field921 == -1 || arg0 == -1) {
            var6 = var2.method1973(true);
        } else {
            var6 = class38.method1935(this.field921).method722(var2, arg0);
        }
        if (this.field930 != 128 || this.field931 != 128) {
            var6.method1954(this.field930, this.field931, this.field930);
        }
        if (this.field932 != 0) {
            if (this.field932 == 90) {
                var6.method2018();
            }
            if (this.field932 == 180) {
                var6.method2018();
                var6.method2018();
            }
            if (this.field932 == 270) {
                var6.method2018();
                var6.method2018();
                var6.method2018();
            }
        }
        return var6;
    }
}

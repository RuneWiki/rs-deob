package deob;

@ObfuscatedName("as")
public class class40 extends class187 {

    @ObfuscatedName("as.i")
    public static class176 field934 = new class176(64);

    @ObfuscatedName("as.k")
    public static class176 field925 = new class176(30);

    @ObfuscatedName("as.h")
    public int field935;

    @ObfuscatedName("as.p")
    public int field928;

    @ObfuscatedName("as.n")
    public int field929 = -1;

    @ObfuscatedName("as.o")
    public short[] field930;

    @ObfuscatedName("as.g")
    public short[] field931;

    @ObfuscatedName("as.z")
    public short[] field926;

    @ObfuscatedName("as.t")
    public short[] field933;

    @ObfuscatedName("as.y")
    public int field923 = 128;

    @ObfuscatedName("as.w")
    public int field932 = 128;

    @ObfuscatedName("as.x")
    public int field936 = 0;

    @ObfuscatedName("as.v")
    public int field937 = 0;

    @ObfuscatedName("as.q")
    public int field927 = 0;

    @ObfuscatedName("a.b(Lex;Lex;I)V")
    public static void method465(class151 arg0, class151 arg1) {
        Statics.field938 = arg0;
        Statics.field924 = arg1;
    }

    @ObfuscatedName("ck.e(II)Las;")
    public static class40 method1763(int arg0) {
        class40 var1 = (class40) field934.method3218((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field938.method2761(13, arg0);
        class40 var3 = new class40();
        var3.field935 = arg0;
        if (var2 != null) {
            var3.method754(new class110(var2));
        }
        field934.method3220(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.i(Ldc;B)V")
    public void method754(class110 arg0) {
        while (true) {
            int var2 = arg0.method2142();
            if (var2 == 0) {
                return;
            }
            this.method753(arg0, var2);
        }
    }

    @ObfuscatedName("as.k(Ldc;II)V")
    public void method753(class110 arg0, int arg1) {
        if (arg1 == 1) {
            this.field928 = arg0.method2292();
        } else if (arg1 == 2) {
            this.field929 = arg0.method2292();
        } else if (arg1 == 4) {
            this.field923 = arg0.method2292();
        } else if (arg1 == 5) {
            this.field932 = arg0.method2292();
        } else if (arg1 == 6) {
            this.field936 = arg0.method2292();
        } else if (arg1 == 7) {
            this.field937 = arg0.method2142();
        } else if (arg1 == 8) {
            this.field927 = arg0.method2142();
        } else if (arg1 == 40) {
            int var3 = arg0.method2142();
            this.field930 = new short[var3];
            this.field931 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field930[var4] = (short) arg0.method2292();
                this.field931[var4] = (short) arg0.method2292();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2142();
            this.field926 = new short[var5];
            this.field933 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field926[var6] = (short) arg0.method2292();
                this.field933[var6] = (short) arg0.method2292();
            }
        }
    }

    @ObfuscatedName("as.h(II)Lcr;")
    public final class99 method763(int arg0) {
        class99 var2 = (class99) field925.method3218((long) this.field935);
        if (var2 == null) {
            class94 var3 = class94.method1874(Statics.field924, this.field928, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field930 != null) {
                for (int var4 = 0; var4 < this.field930.length; var4++) {
                    var3.method1879(this.field930[var4], this.field931[var4]);
                }
            }
            if (this.field926 != null) {
                for (int var5 = 0; var5 < this.field926.length; var5++) {
                    var3.method1892(this.field926[var5], this.field933[var5]);
                }
            }
            var2 = var3.method1940(this.field937 + 64, this.field927 + 850, -30, -50, -30);
            field925.method3220(var2, (long) this.field935);
        }
        class99 var6;
        if (this.field929 == -1 || arg0 == -1) {
            var6 = var2.method1974(true);
        } else {
            var6 = class39.method1863(this.field929).method735(var2, arg0);
        }
        if (this.field923 != 128 || this.field932 != 128) {
            var6.method2022(this.field923, this.field932, this.field923);
        }
        if (this.field936 != 0) {
            if (this.field936 == 90) {
                var6.method1982();
            }
            if (this.field936 == 180) {
                var6.method1982();
                var6.method1982();
            }
            if (this.field936 == 270) {
                var6.method1982();
                var6.method1982();
                var6.method1982();
            }
        }
        return var6;
    }

    @ObfuscatedName("j.p(S)V")
    public static void method503() {
        field934.method3231();
        field925.method3231();
    }
}

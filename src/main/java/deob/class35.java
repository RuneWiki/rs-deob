package deob;

@ObfuscatedName("ad")
public class class35 extends class174 {

    @ObfuscatedName("ad.y")
    public static class170 field922 = new class170(64);

    @ObfuscatedName("ad.v")
    public static class170 field923 = new class170(30);

    @ObfuscatedName("ad.g")
    public int field924;

    @ObfuscatedName("ad.x")
    public int field928;

    @ObfuscatedName("ad.u")
    public int field926 = -1;

    @ObfuscatedName("ad.l")
    public short[] field927;

    @ObfuscatedName("ad.a")
    public short[] field925;

    @ObfuscatedName("ad.h")
    public short[] field920;

    @ObfuscatedName("ad.t")
    public short[] field934;

    @ObfuscatedName("ad.m")
    public int field931 = 128;

    @ObfuscatedName("ad.s")
    public int field932 = 128;

    @ObfuscatedName("ad.j")
    public int field933 = 0;

    @ObfuscatedName("ad.b")
    public int field930 = 0;

    @ObfuscatedName("ad.n")
    public int field935 = 0;

    @ObfuscatedName("ai.c(II)Lad;")
    public static class35 method743(int arg0) {
        class35 var1 = (class35) field922.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field929.method2886(13, arg0);
        class35 var3 = new class35();
        var3.field924 = arg0;
        if (var2 != null) {
            var3.method718(new class127(var2));
        }
        field922.method3092(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.q(Ldg;I)V")
    public void method718(class127 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method732(arg0, var2);
        }
    }

    @ObfuscatedName("ad.y(Ldg;II)V")
    public void method732(class127 arg0, int arg1) {
        if (arg1 == 1) {
            this.field928 = arg0.method2327();
        } else if (arg1 == 2) {
            this.field926 = arg0.method2327();
        } else if (arg1 == 4) {
            this.field931 = arg0.method2327();
        } else if (arg1 == 5) {
            this.field932 = arg0.method2327();
        } else if (arg1 == 6) {
            this.field933 = arg0.method2327();
        } else if (arg1 == 7) {
            this.field930 = arg0.method2383();
        } else if (arg1 == 8) {
            this.field935 = arg0.method2383();
        } else if (arg1 == 40) {
            int var3 = arg0.method2383();
            this.field927 = new short[var3];
            this.field925 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field927[var4] = (short) arg0.method2327();
                this.field925[var4] = (short) arg0.method2327();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2383();
            this.field920 = new short[var5];
            this.field934 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field920[var6] = (short) arg0.method2327();
                this.field934[var6] = (short) arg0.method2327();
            }
        }
    }

    @ObfuscatedName("ad.v(IB)Ldl;")
    public final class112 method720(int arg0) {
        class112 var2 = (class112) field923.method3097((long) this.field924);
        if (var2 == null) {
            class101 var3 = class101.method1979(Statics.field921, this.field928, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field927 != null) {
                for (int var4 = 0; var4 < this.field927.length; var4++) {
                    var3.method1976(this.field927[var4], this.field925[var4]);
                }
            }
            if (this.field920 != null) {
                for (int var5 = 0; var5 < this.field920.length; var5++) {
                    var3.method1980(this.field920[var5], this.field934[var5]);
                }
            }
            var2 = var3.method1971(this.field930 + 64, this.field935 + 850, -30, -50, -30);
            field923.method3092(var2, (long) this.field924);
        }
        class112 var6;
        if (this.field926 == -1 || arg0 == -1) {
            var6 = var2.method2136(true);
        } else {
            var6 = Statics.method1425(this.field926).method680(var2, arg0);
        }
        if (this.field931 != 128 || this.field932 != 128) {
            var6.method2149(this.field931, this.field932, this.field931);
        }
        if (this.field933 != 0) {
            if (this.field933 == 90) {
                var6.method2144();
            }
            if (this.field933 == 180) {
                var6.method2144();
                var6.method2144();
            }
            if (this.field933 == 270) {
                var6.method2144();
                var6.method2144();
                var6.method2144();
            }
        }
        return var6;
    }
}

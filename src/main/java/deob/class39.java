package deob;

@ObfuscatedName("ag")
public class class39 extends class182 {

    @ObfuscatedName("ag.z")
    public static class171 field921 = new class171(64);

    @ObfuscatedName("ag.h")
    public static class171 field922 = new class171(30);

    @ObfuscatedName("ag.k")
    public int field930;

    @ObfuscatedName("ag.l")
    public int field933;

    @ObfuscatedName("ag.e")
    public int field925 = -1;

    @ObfuscatedName("ag.j")
    public short[] field926;

    @ObfuscatedName("ag.n")
    public short[] field924;

    @ObfuscatedName("ag.f")
    public short[] field923;

    @ObfuscatedName("ag.a")
    public short[] field929;

    @ObfuscatedName("ag.i")
    public int field920 = 128;

    @ObfuscatedName("ag.y")
    public int field931 = 128;

    @ObfuscatedName("ag.p")
    public int field932 = 0;

    @ObfuscatedName("ag.q")
    public int field928 = 0;

    @ObfuscatedName("ag.t")
    public int field934 = 0;

    @ObfuscatedName("av.g(Lec;Lec;I)V")
    public static void method628(class146 arg0, class146 arg1) {
        Statics.field927 = arg0;
        Statics.field1902 = arg1;
    }

    @ObfuscatedName("ai.v(IB)Lag;")
    public static class39 method563(int arg0) {
        class39 var1 = (class39) field921.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field927.method2708(13, arg0);
        class39 var3 = new class39();
        var3.field930 = arg0;
        if (var2 != null) {
            var3.method752(new class107(var2));
        }
        field921.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.z(Ldm;S)V")
    public void method752(class107 arg0) {
        while (true) {
            int var2 = arg0.method2139();
            if (var2 == 0) {
                return;
            }
            this.method750(arg0, var2);
        }
    }

    @ObfuscatedName("ag.h(Ldm;IS)V")
    public void method750(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field933 = arg0.method2141();
        } else if (arg1 == 2) {
            this.field925 = arg0.method2141();
        } else if (arg1 == 4) {
            this.field920 = arg0.method2141();
        } else if (arg1 == 5) {
            this.field931 = arg0.method2141();
        } else if (arg1 == 6) {
            this.field932 = arg0.method2141();
        } else if (arg1 == 7) {
            this.field928 = arg0.method2139();
        } else if (arg1 == 8) {
            this.field934 = arg0.method2139();
        } else if (arg1 == 40) {
            int var3 = arg0.method2139();
            this.field926 = new short[var3];
            this.field924 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field926[var4] = (short) arg0.method2141();
                this.field924[var4] = (short) arg0.method2141();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2139();
            this.field923 = new short[var5];
            this.field929 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field923[var6] = (short) arg0.method2141();
                this.field929[var6] = (short) arg0.method2141();
            }
        }
    }

    @ObfuscatedName("ag.k(II)Lce;")
    public final class98 method751(int arg0) {
        class98 var2 = (class98) field922.method3166((long) this.field930);
        if (var2 == null) {
            class93 var3 = class93.method1903(Statics.field1902, this.field933, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field926 != null) {
                for (int var4 = 0; var4 < this.field926.length; var4++) {
                    var3.method1916(this.field926[var4], this.field924[var4]);
                }
            }
            if (this.field923 != null) {
                for (int var5 = 0; var5 < this.field923.length; var5++) {
                    var3.method1917(this.field923[var5], this.field929[var5]);
                }
            }
            var2 = var3.method1963(this.field928 + 64, this.field934 + 850, -30, -50, -30);
            field922.method3167(var2, (long) this.field930);
        }
        class98 var6;
        if (this.field925 == -1 || arg0 == -1) {
            var6 = var2.method2055(true);
        } else {
            var6 = class38.method1996(this.field925).method713(var2, arg0);
        }
        if (this.field920 != 128 || this.field931 != 128) {
            var6.method2014(this.field920, this.field931, this.field920);
        }
        if (this.field932 != 0) {
            if (this.field932 == 90) {
                var6.method2052();
            }
            if (this.field932 == 180) {
                var6.method2052();
                var6.method2052();
            }
            if (this.field932 == 270) {
                var6.method2052();
                var6.method2052();
                var6.method2052();
            }
        }
        return var6;
    }
}

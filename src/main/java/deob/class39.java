package deob;

@ObfuscatedName("av")
public class class39 extends class183 {

    @ObfuscatedName("av.x")
    public static class172 field925 = new class172(64);

    @ObfuscatedName("av.c")
    public static class172 field939 = new class172(30);

    @ObfuscatedName("av.n")
    public int field926;

    @ObfuscatedName("av.s")
    public int field940;

    @ObfuscatedName("av.r")
    public int field928 = -1;

    @ObfuscatedName("av.w")
    public short[] field929;

    @ObfuscatedName("av.u")
    public short[] field930;

    @ObfuscatedName("av.d")
    public short[] field931;

    @ObfuscatedName("av.h")
    public short[] field932;

    @ObfuscatedName("av.a")
    public int field937 = 128;

    @ObfuscatedName("av.y")
    public int field927 = 128;

    @ObfuscatedName("av.v")
    public int field935 = 0;

    @ObfuscatedName("av.e")
    public int field936 = 0;

    @ObfuscatedName("av.b")
    public int field934 = 0;

    @ObfuscatedName("ak.p(Ler;Ler;B)V")
    public static void method608(class147 arg0, class147 arg1) {
        Statics.field924 = arg0;
        Statics.field923 = arg1;
    }

    @ObfuscatedName("ge.g(IB)Lav;")
    public static class39 method3391(int arg0) {
        class39 var1 = (class39) field925.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field924.method2855(13, arg0);
        class39 var3 = new class39();
        var3.field926 = arg0;
        if (var2 != null) {
            var3.method773(new class107(var2));
        }
        field925.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.x(Ldp;I)V")
    public void method773(class107 arg0) {
        while (true) {
            int var2 = arg0.method2173();
            if (var2 == 0) {
                return;
            }
            this.method787(arg0, var2);
        }
    }

    @ObfuscatedName("av.c(Ldp;IB)V")
    public void method787(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field940 = arg0.method2175();
        } else if (arg1 == 2) {
            this.field928 = arg0.method2175();
        } else if (arg1 == 4) {
            this.field937 = arg0.method2175();
        } else if (arg1 == 5) {
            this.field927 = arg0.method2175();
        } else if (arg1 == 6) {
            this.field935 = arg0.method2175();
        } else if (arg1 == 7) {
            this.field936 = arg0.method2173();
        } else if (arg1 == 8) {
            this.field934 = arg0.method2173();
        } else if (arg1 == 40) {
            int var3 = arg0.method2173();
            this.field929 = new short[var3];
            this.field930 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field929[var4] = (short) arg0.method2175();
                this.field930[var4] = (short) arg0.method2175();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2173();
            this.field931 = new short[var5];
            this.field932 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field931[var6] = (short) arg0.method2175();
                this.field932[var6] = (short) arg0.method2175();
            }
        }
    }

    @ObfuscatedName("av.n(IB)Lcn;")
    public final class98 method776(int arg0) {
        class98 var2 = (class98) field939.method3225((long) this.field926);
        if (var2 == null) {
            class93 var3 = class93.method1943(Statics.field923, this.field940, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field929 != null) {
                for (int var4 = 0; var4 < this.field929.length; var4++) {
                    var3.method1955(this.field929[var4], this.field930[var4]);
                }
            }
            if (this.field931 != null) {
                for (int var5 = 0; var5 < this.field931.length; var5++) {
                    var3.method1956(this.field931[var5], this.field932[var5]);
                }
            }
            var2 = var3.method1952(this.field936 + 64, this.field934 + 850, -30, -50, -30);
            field939.method3234(var2, (long) this.field926);
        }
        class98 var6;
        if (this.field928 == -1 || arg0 == -1) {
            var6 = var2.method2032(true);
        } else {
            var6 = class38.method507(this.field928).method743(var2, arg0);
        }
        if (this.field937 != 128 || this.field927 != 128) {
            var6.method2045(this.field937, this.field927, this.field937);
        }
        if (this.field935 != 0) {
            if (this.field935 == 90) {
                var6.method2082();
            }
            if (this.field935 == 180) {
                var6.method2082();
                var6.method2082();
            }
            if (this.field935 == 270) {
                var6.method2082();
                var6.method2082();
                var6.method2082();
            }
        }
        return var6;
    }

    @ObfuscatedName("af.s(I)V")
    public static void method659() {
        field925.method3227();
        field939.method3227();
    }
}

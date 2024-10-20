package deob;

@ObfuscatedName("ad")
public class class39 extends class181 {

    @ObfuscatedName("ad.y")
    public static class171 field925 = new class171(64);

    @ObfuscatedName("ad.h")
    public static class171 field936 = new class171(30);

    @ObfuscatedName("ad.r")
    public int field923;

    @ObfuscatedName("ad.e")
    public int field928;

    @ObfuscatedName("ad.k")
    public int field929 = -1;

    @ObfuscatedName("ad.b")
    public short[] field930;

    @ObfuscatedName("ad.n")
    public short[] field938;

    @ObfuscatedName("ad.a")
    public short[] field932;

    @ObfuscatedName("ad.q")
    public short[] field933;

    @ObfuscatedName("ad.i")
    public int field934 = 128;

    @ObfuscatedName("ad.f")
    public int field931 = 128;

    @ObfuscatedName("ad.o")
    public int field935 = 0;

    @ObfuscatedName("ad.t")
    public int field939 = 0;

    @ObfuscatedName("ad.c")
    public int field937 = 0;

    @ObfuscatedName("ch.j(Leg;Leg;I)V")
    public static void method1786(class146 arg0, class146 arg1) {
        Statics.field926 = arg0;
        Statics.field924 = arg1;
    }

    @ObfuscatedName("gv.z(II)Lad;")
    public static class39 method3319(int arg0) {
        class39 var1 = (class39) field925.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field926.method2739(13, arg0);
        class39 var3 = new class39();
        var3.field923 = arg0;
        if (var2 != null) {
            var3.method715(new class107(var2));
        }
        field925.method3173(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.y(Lde;I)V")
    public void method715(class107 arg0) {
        while (true) {
            int var2 = arg0.method2130();
            if (var2 == 0) {
                return;
            }
            this.method716(arg0, var2);
        }
    }

    @ObfuscatedName("ad.h(Lde;II)V")
    public void method716(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field928 = arg0.method2132();
        } else if (arg1 == 2) {
            this.field929 = arg0.method2132();
        } else if (arg1 == 4) {
            this.field934 = arg0.method2132();
        } else if (arg1 == 5) {
            this.field931 = arg0.method2132();
        } else if (arg1 == 6) {
            this.field935 = arg0.method2132();
        } else if (arg1 == 7) {
            this.field939 = arg0.method2130();
        } else if (arg1 == 8) {
            this.field937 = arg0.method2130();
        } else if (arg1 == 40) {
            int var3 = arg0.method2130();
            this.field930 = new short[var3];
            this.field938 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field930[var4] = (short) arg0.method2132();
                this.field938[var4] = (short) arg0.method2132();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2130();
            this.field932 = new short[var5];
            this.field933 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field932[var6] = (short) arg0.method2132();
                this.field933[var6] = (short) arg0.method2132();
            }
        }
    }

    @ObfuscatedName("ad.r(II)Lcl;")
    public final class98 method714(int arg0) {
        class98 var2 = (class98) field936.method3171((long) this.field923);
        if (var2 == null) {
            class93 var3 = class93.method1938(Statics.field924, this.field928, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field930 != null) {
                for (int var4 = 0; var4 < this.field930.length; var4++) {
                    var3.method1906(this.field930[var4], this.field938[var4]);
                }
            }
            if (this.field932 != null) {
                for (int var5 = 0; var5 < this.field932.length; var5++) {
                    var3.method1907(this.field932[var5], this.field933[var5]);
                }
            }
            var2 = var3.method1914(this.field939 + 64, this.field937 + 850, -30, -50, -30);
            field936.method3173(var2, (long) this.field923);
        }
        class98 var6;
        if (this.field929 == -1 || arg0 == -1) {
            var6 = var2.method1986(true);
        } else {
            var6 = class38.method38(this.field929).method705(var2, arg0);
        }
        if (this.field934 != 128 || this.field931 != 128) {
            var6.method1998(this.field934, this.field931, this.field934);
        }
        if (this.field935 != 0) {
            if (this.field935 == 90) {
                var6.method1993();
            }
            if (this.field935 == 180) {
                var6.method1993();
                var6.method1993();
            }
            if (this.field935 == 270) {
                var6.method1993();
                var6.method1993();
                var6.method1993();
            }
        }
        return var6;
    }

    @ObfuscatedName("dl.e(I)V")
    public static void method2437() {
        field925.method3170();
        field936.method3170();
    }
}

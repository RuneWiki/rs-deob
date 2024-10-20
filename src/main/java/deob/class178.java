package deob;

@ObfuscatedName("fj")
public class class178 extends class406 {

    @ObfuscatedName("fj.w")
    public static class256 field1903 = new class256(64);

    @ObfuscatedName("fj.v")
    public static class256 field1904 = new class256(50);

    @ObfuscatedName("fj.c")
    public int field1905;

    @ObfuscatedName("fj.q")
    public String field1936 = class309.field3624;

    @ObfuscatedName("fj.i")
    public int field1907 = 1;

    @ObfuscatedName("fj.k")
    public int[] field1908;

    @ObfuscatedName("fj.o")
    public int[] field1917;

    @ObfuscatedName("fj.n")
    public int field1910 = -1;

    @ObfuscatedName("fj.d")
    public int field1928 = -1;

    @ObfuscatedName("fj.a")
    public int field1912 = -1;

    @ObfuscatedName("fj.m")
    public int field1913 = -1;

    @ObfuscatedName("fj.u")
    public int field1914 = -1;

    @ObfuscatedName("fj.l")
    public int field1944 = -1;

    @ObfuscatedName("fj.z")
    public int field1916 = -1;

    @ObfuscatedName("fj.r")
    public int field1915 = -1;

    @ObfuscatedName("fj.y")
    public int field1920 = -1;

    @ObfuscatedName("fj.p")
    public int field1919 = -1;

    @ObfuscatedName("fj.e")
    public int field1939 = -1;

    @ObfuscatedName("fj.b")
    public int field1921 = -1;

    @ObfuscatedName("fj.x")
    public int field1934 = -1;

    @ObfuscatedName("fj.f")
    public int field1923 = -1;

    @ObfuscatedName("fj.t")
    public int field1924 = -1;

    @ObfuscatedName("fj.j")
    public short[] field1925;

    @ObfuscatedName("fj.g")
    public short[] field1909;

    @ObfuscatedName("fj.ar")
    public short[] field1927;

    @ObfuscatedName("fj.aq")
    public short[] field1918;

    @ObfuscatedName("fj.av")
    public String[] field1929 = new String[5];

    @ObfuscatedName("fj.aj")
    public boolean field1930 = true;

    @ObfuscatedName("fj.ax")
    public int field1931 = -1;

    @ObfuscatedName("fj.ab")
    public int field1942 = 128;

    @ObfuscatedName("fj.ak")
    public int field1933 = 128;

    @ObfuscatedName("fj.au")
    public boolean field1932 = false;

    @ObfuscatedName("fj.ae")
    public int field1935 = 0;

    @ObfuscatedName("fj.as")
    public int field1922 = 0;

    @ObfuscatedName("fj.ay")
    public int field1937 = -1;

    @ObfuscatedName("fj.ag")
    public int field1938 = 32;

    @ObfuscatedName("fj.ad")
    public int[] field1943;

    @ObfuscatedName("fj.af")
    public int field1940 = -1;

    @ObfuscatedName("fj.aw")
    public int field1941 = -1;

    @ObfuscatedName("fj.ai")
    public boolean field1901 = true;

    @ObfuscatedName("fj.ap")
    public boolean field1926 = true;

    @ObfuscatedName("fj.az")
    public boolean field1911 = false;

    @ObfuscatedName("fj.an")
    public class420 field1945;

    @ObfuscatedName("dt.h(II)Lfj;")
    public static class178 method2587(int arg0) {
        class178 var1 = (class178) field1903.method4599((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1906.method5179(9, arg0);
        class178 var3 = new class178();
        var3.field1905 = arg0;
        if (var2 != null) {
            var3.method3067(new class444(var2));
        }
        var3.method3075();
        field1903.method4600(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fj.w(B)V")
    public void method3075() {
    }

    @ObfuscatedName("fj.v(Lqr;I)V")
    public void method3067(class444 arg0) {
        while (true) {
            int var2 = arg0.method6929();
            if (var2 == 0) {
                return;
            }
            this.method3069(arg0, var2);
        }
    }

    @ObfuscatedName("fj.c(Lqr;II)V")
    public void method3069(class444 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6929();
            this.field1908 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1908[var4] = arg0.method7120();
            }
        } else if (arg1 == 2) {
            this.field1936 = arg0.method6975();
        } else if (arg1 == 12) {
            this.field1907 = arg0.method6929();
        } else if (arg1 == 13) {
            this.field1910 = arg0.method7120();
        } else if (arg1 == 14) {
            this.field1913 = arg0.method7120();
        } else if (arg1 == 15) {
            this.field1928 = arg0.method7120();
        } else if (arg1 == 16) {
            this.field1912 = arg0.method7120();
        } else if (arg1 == 17) {
            this.field1913 = arg0.method7120();
            this.field1914 = arg0.method7120();
            this.field1944 = arg0.method7120();
            this.field1916 = arg0.method7120();
        } else if (arg1 == 18) {
            arg0.method7120();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1929[arg1 - 30] = arg0.method6975();
            if (this.field1929[arg1 - 30].equalsIgnoreCase(class309.field3619)) {
                this.field1929[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method6929();
            this.field1925 = new short[var5];
            this.field1909 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1925[var6] = (short) arg0.method7120();
                this.field1909[var6] = (short) arg0.method7120();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6929();
            this.field1927 = new short[var7];
            this.field1918 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1927[var8] = (short) arg0.method7120();
                this.field1918[var8] = (short) arg0.method7120();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method6929();
            this.field1917 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1917[var10] = arg0.method7120();
            }
        } else if (arg1 == 93) {
            this.field1930 = false;
        } else if (arg1 == 95) {
            this.field1931 = arg0.method7120();
        } else if (arg1 == 97) {
            this.field1942 = arg0.method7120();
        } else if (arg1 == 98) {
            this.field1933 = arg0.method7120();
        } else if (arg1 == 99) {
            this.field1932 = true;
        } else if (arg1 == 100) {
            this.field1935 = arg0.method6930();
        } else if (arg1 == 101) {
            this.field1922 = arg0.method6930();
        } else if (arg1 == 102) {
            this.field1937 = arg0.method7120();
        } else if (arg1 == 103) {
            this.field1938 = arg0.method7120();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1940 = arg0.method7120();
            if (this.field1940 == 65535) {
                this.field1940 = -1;
            }
            this.field1941 = arg0.method7120();
            if (this.field1941 == 65535) {
                this.field1941 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method7120();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method6929();
            this.field1943 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1943[var13] = arg0.method7120();
                if (this.field1943[var13] == 65535) {
                    this.field1943[var13] = -1;
                }
            }
            this.field1943[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1901 = false;
        } else if (arg1 == 109) {
            this.field1926 = false;
        } else if (arg1 == 111) {
            this.field1911 = true;
        } else if (arg1 == 114) {
            this.field1915 = arg0.method7120();
        } else if (arg1 == 115) {
            this.field1915 = arg0.method7120();
            this.field1920 = arg0.method7120();
            this.field1919 = arg0.method7120();
            this.field1939 = arg0.method7120();
        } else if (arg1 == 116) {
            this.field1921 = arg0.method7120();
        } else if (arg1 == 117) {
            this.field1921 = arg0.method7120();
            this.field1934 = arg0.method7120();
            this.field1923 = arg0.method7120();
            this.field1924 = arg0.method7120();
        } else if (arg1 == 249) {
            this.field1945 = class175.method1527(arg0, this.field1945);
        }
    }

    @ObfuscatedName("fj.q(Lgh;ILgh;II)Lhp;")
    public final class211 method3070(class190 arg0, int arg1, class190 arg2, int arg3) {
        if (this.field1943 != null) {
            class178 var5 = this.method3101();
            return var5 == null ? null : var5.method3070(arg0, arg1, arg2, arg3);
        }
        class211 var6 = (class211) field1904.method4599((long) this.field1905);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1908.length; var8++) {
                if (!Statics.field1902.method5234(this.field1908[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class196[] var9 = new class196[this.field1908.length];
            for (int var10 = 0; var10 < this.field1908.length; var10++) {
                var9[var10] = class196.method3512(Statics.field1902, this.field1908[var10], 0);
            }
            class196 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class196(var9, var9.length);
            }
            if (this.field1925 != null) {
                for (int var12 = 0; var12 < this.field1925.length; var12++) {
                    var11.method3497(this.field1925[var12], this.field1909[var12]);
                }
            }
            if (this.field1927 != null) {
                for (int var13 = 0; var13 < this.field1927.length; var13++) {
                    var11.method3500(this.field1927[var13], this.field1918[var13]);
                }
            }
            var6 = var11.method3565(this.field1935 + 64, this.field1922 * 5 + 850, -30, -50, -30);
            field1904.method4600(var6, (long) this.field1905);
        }
        class211 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3385(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3382(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method3965(true);
        } else {
            var14 = arg2.method3382(var6, arg3);
        }
        if (this.field1942 != 128 || this.field1933 != 128) {
            var14.method3947(this.field1942, this.field1933, this.field1942);
        }
        return var14;
    }

    @ObfuscatedName("fj.i(I)Lgp;")
    public final class196 method3071() {
        if (this.field1943 != null) {
            class178 var1 = this.method3101();
            return var1 == null ? null : var1.method3071();
        } else if (this.field1917 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1917.length; var3++) {
                if (!Statics.field1902.method5234(this.field1917[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class196[] var4 = new class196[this.field1917.length];
            for (int var5 = 0; var5 < this.field1917.length; var5++) {
                var4[var5] = class196.method3512(Statics.field1902, this.field1917[var5], 0);
            }
            class196 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class196(var4, var4.length);
            }
            if (this.field1925 != null) {
                for (int var7 = 0; var7 < this.field1925.length; var7++) {
                    var6.method3497(this.field1925[var7], this.field1909[var7]);
                }
            }
            if (this.field1927 != null) {
                for (int var8 = 0; var8 < this.field1927.length; var8++) {
                    var6.method3500(this.field1927[var8], this.field1918[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("fj.k(I)Lfj;")
    public final class178 method3101() {
        int var1 = -1;
        if (this.field1940 != -1) {
            var1 = Statics.method2652(this.field1940);
        } else if (this.field1941 != -1) {
            var1 = class289.field3313[this.field1941];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1943.length - 1) {
            var2 = this.field1943[var1];
        } else {
            var2 = this.field1943[this.field1943.length - 1];
        }
        return var2 == -1 ? null : method2587(var2);
    }

    @ObfuscatedName("fj.o(I)Z")
    public boolean method3073() {
        if (this.field1943 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1940 != -1) {
            var1 = Statics.method2652(this.field1940);
        } else if (this.field1941 != -1) {
            var1 = class289.field3313[this.field1941];
        }
        if (var1 >= 0 && var1 < this.field1943.length) {
            return this.field1943[var1] != -1;
        } else {
            return this.field1943[this.field1943.length - 1] != -1;
        }
    }

    @ObfuscatedName("fj.n(IIB)I")
    public int method3074(int arg0, int arg1) {
        return class175.method959(this.field1945, arg0, arg1);
    }

    @ObfuscatedName("fj.d(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3105(int arg0, String arg1) {
        return class175.method2648(this.field1945, arg0, arg1);
    }

    @ObfuscatedName("et.a(I)V")
    public static void method2759() {
        field1903.method4603();
        field1904.method4603();
    }
}

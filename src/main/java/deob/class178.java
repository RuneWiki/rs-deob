package deob;

@ObfuscatedName("fj")
public class class178 extends class405 {

    @ObfuscatedName("fj.q")
    public static class256 field1948 = new class256(64);

    @ObfuscatedName("fj.f")
    public static class256 field1918 = new class256(50);

    @ObfuscatedName("fj.j")
    public int field1938;

    @ObfuscatedName("fj.e")
    public String field1915 = class308.field3624;

    @ObfuscatedName("fj.g")
    public int field1919 = 1;

    @ObfuscatedName("fj.w")
    public int[] field1922;

    @ObfuscatedName("fj.y")
    public int[] field1958;

    @ObfuscatedName("fj.i")
    public int field1924 = -1;

    @ObfuscatedName("fj.s")
    public int field1923 = -1;

    @ObfuscatedName("fj.t")
    public int field1926 = -1;

    @ObfuscatedName("fj.z")
    public int field1927 = -1;

    @ObfuscatedName("fj.r")
    public int field1920 = -1;

    @ObfuscatedName("fj.u")
    public int field1929 = -1;

    @ObfuscatedName("fj.k")
    public int field1941 = -1;

    @ObfuscatedName("fj.h")
    public int field1932 = -1;

    @ObfuscatedName("fj.x")
    public int field1945 = -1;

    @ObfuscatedName("fj.l")
    public int field1933 = -1;

    @ObfuscatedName("fj.a")
    public int field1934 = -1;

    @ObfuscatedName("fj.p")
    public int field1935 = -1;

    @ObfuscatedName("fj.b")
    public int field1936 = -1;

    @ObfuscatedName("fj.n")
    public int field1937 = -1;

    @ObfuscatedName("fj.o")
    public int field1931 = -1;

    @ObfuscatedName("fj.m")
    public short[] field1930;

    @ObfuscatedName("fj.d")
    public short[] field1928;

    @ObfuscatedName("fj.ad")
    public short[] field1940;

    @ObfuscatedName("fj.ak")
    public short[] field1942;

    @ObfuscatedName("fj.al")
    public String[] field1943 = new String[5];

    @ObfuscatedName("fj.ao")
    public boolean field1944 = true;

    @ObfuscatedName("fj.ab")
    public int field1921 = -1;

    @ObfuscatedName("fj.ap")
    public int field1946 = 128;

    @ObfuscatedName("fj.ac")
    public int field1925 = 128;

    @ObfuscatedName("fj.ae")
    public boolean field1947 = false;

    @ObfuscatedName("fj.aj")
    public int field1939 = 0;

    @ObfuscatedName("fj.am")
    public int field1950 = 0;

    @ObfuscatedName("fj.an")
    public int field1951 = -1;

    @ObfuscatedName("fj.af")
    public int field1952 = 32;

    @ObfuscatedName("fj.ax")
    public int[] field1953;

    @ObfuscatedName("fj.ar")
    public int field1954 = -1;

    @ObfuscatedName("fj.at")
    public int field1955 = -1;

    @ObfuscatedName("fj.ag")
    public boolean field1956 = true;

    @ObfuscatedName("fj.aq")
    public boolean field1957 = true;

    @ObfuscatedName("fj.ah")
    public boolean field1949 = false;

    @ObfuscatedName("fj.ai")
    public class419 field1959;

    @ObfuscatedName("ds.c(II)Lfj;")
    public static class178 method2492(int arg0) {
        class178 var1 = (class178) field1948.method4691((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1917.method5305(9, arg0);
        class178 var3 = new class178();
        var3.field1938 = arg0;
        if (var2 != null) {
            var3.method3169(new class443(var2));
        }
        var3.method3168();
        field1948.method4693(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fj.v(I)V")
    public void method3168() {
    }

    @ObfuscatedName("fj.q(Lqt;I)V")
    public void method3169(class443 arg0) {
        while (true) {
            int var2 = arg0.method7047();
            if (var2 == 0) {
                return;
            }
            this.method3189(arg0, var2);
        }
    }

    @ObfuscatedName("fj.f(Lqt;II)V")
    public void method3189(class443 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7047();
            this.field1922 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1922[var4] = arg0.method7049();
            }
        } else if (arg1 == 2) {
            this.field1915 = arg0.method7057();
        } else if (arg1 == 12) {
            this.field1919 = arg0.method7047();
        } else if (arg1 == 13) {
            this.field1924 = arg0.method7049();
        } else if (arg1 == 14) {
            this.field1927 = arg0.method7049();
        } else if (arg1 == 15) {
            this.field1923 = arg0.method7049();
        } else if (arg1 == 16) {
            this.field1926 = arg0.method7049();
        } else if (arg1 == 17) {
            this.field1927 = arg0.method7049();
            this.field1920 = arg0.method7049();
            this.field1929 = arg0.method7049();
            this.field1941 = arg0.method7049();
        } else if (arg1 == 18) {
            arg0.method7049();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1943[arg1 - 30] = arg0.method7057();
            if (this.field1943[arg1 - 30].equalsIgnoreCase(class308.field3619)) {
                this.field1943[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method7047();
            this.field1930 = new short[var5];
            this.field1928 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1930[var6] = (short) arg0.method7049();
                this.field1928[var6] = (short) arg0.method7049();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method7047();
            this.field1940 = new short[var7];
            this.field1942 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1940[var8] = (short) arg0.method7049();
                this.field1942[var8] = (short) arg0.method7049();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method7047();
            this.field1958 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1958[var10] = arg0.method7049();
            }
        } else if (arg1 == 93) {
            this.field1944 = false;
        } else if (arg1 == 95) {
            this.field1921 = arg0.method7049();
        } else if (arg1 == 97) {
            this.field1946 = arg0.method7049();
        } else if (arg1 == 98) {
            this.field1925 = arg0.method7049();
        } else if (arg1 == 99) {
            this.field1947 = true;
        } else if (arg1 == 100) {
            this.field1939 = arg0.method7048();
        } else if (arg1 == 101) {
            this.field1950 = arg0.method7048();
        } else if (arg1 == 102) {
            this.field1951 = arg0.method7049();
        } else if (arg1 == 103) {
            this.field1952 = arg0.method7049();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1954 = arg0.method7049();
            if (this.field1954 == 65535) {
                this.field1954 = -1;
            }
            this.field1955 = arg0.method7049();
            if (this.field1955 == 65535) {
                this.field1955 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method7049();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method7047();
            this.field1953 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1953[var13] = arg0.method7049();
                if (this.field1953[var13] == 65535) {
                    this.field1953[var13] = -1;
                }
            }
            this.field1953[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1956 = false;
        } else if (arg1 == 109) {
            this.field1957 = false;
        } else if (arg1 == 111) {
            this.field1949 = true;
        } else if (arg1 == 114) {
            this.field1932 = arg0.method7049();
        } else if (arg1 == 115) {
            this.field1932 = arg0.method7049();
            this.field1945 = arg0.method7049();
            this.field1933 = arg0.method7049();
            this.field1934 = arg0.method7049();
        } else if (arg1 == 116) {
            this.field1935 = arg0.method7049();
        } else if (arg1 == 117) {
            this.field1935 = arg0.method7049();
            this.field1936 = arg0.method7049();
            this.field1937 = arg0.method7049();
            this.field1931 = arg0.method7049();
        } else if (arg1 == 249) {
            this.field1959 = class175.method2132(arg0, this.field1959);
        }
    }

    @ObfuscatedName("fj.j(Lgc;ILgc;II)Lhy;")
    public final class211 method3176(class190 arg0, int arg1, class190 arg2, int arg3) {
        if (this.field1953 != null) {
            class178 var5 = this.method3173();
            return var5 == null ? null : var5.method3176(arg0, arg1, arg2, arg3);
        }
        class211 var6 = (class211) field1918.method4691((long) this.field1938);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1922.length; var8++) {
                if (!Statics.field1916.method5302(this.field1922[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class196[] var9 = new class196[this.field1922.length];
            for (int var10 = 0; var10 < this.field1922.length; var10++) {
                var9[var10] = class196.method3646(Statics.field1916, this.field1922[var10], 0);
            }
            class196 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class196(var9, var9.length);
            }
            if (this.field1930 != null) {
                for (int var12 = 0; var12 < this.field1930.length; var12++) {
                    var11.method3606(this.field1930[var12], this.field1928[var12]);
                }
            }
            if (this.field1940 != null) {
                for (int var13 = 0; var13 < this.field1940.length; var13++) {
                    var11.method3626(this.field1940[var13], this.field1942[var13]);
                }
            }
            var6 = var11.method3658(this.field1939 + 64, this.field1950 * 5 + 850, -30, -50, -30);
            field1918.method4693(var6, (long) this.field1938);
        }
        class211 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3540(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3531(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method4074(true);
        } else {
            var14 = arg2.method3531(var6, arg3);
        }
        if (this.field1946 != 128 || this.field1925 != 128) {
            var14.method4058(this.field1946, this.field1925, this.field1946);
        }
        return var14;
    }

    @ObfuscatedName("fj.e(B)Lgw;")
    public final class196 method3196() {
        if (this.field1953 != null) {
            class178 var1 = this.method3173();
            return var1 == null ? null : var1.method3196();
        } else if (this.field1958 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1958.length; var3++) {
                if (!Statics.field1916.method5302(this.field1958[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class196[] var4 = new class196[this.field1958.length];
            for (int var5 = 0; var5 < this.field1958.length; var5++) {
                var4[var5] = class196.method3646(Statics.field1916, this.field1958[var5], 0);
            }
            class196 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class196(var4, var4.length);
            }
            if (this.field1930 != null) {
                for (int var7 = 0; var7 < this.field1930.length; var7++) {
                    var6.method3606(this.field1930[var7], this.field1928[var7]);
                }
            }
            if (this.field1940 != null) {
                for (int var8 = 0; var8 < this.field1940.length; var8++) {
                    var6.method3626(this.field1940[var8], this.field1942[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("fj.g(I)Lfj;")
    public final class178 method3173() {
        int var1 = -1;
        if (this.field1954 != -1) {
            var1 = class288.method6395(this.field1954);
        } else if (this.field1955 != -1) {
            var1 = class288.field3326[this.field1955];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1953.length - 1) {
            var2 = this.field1953[var1];
        } else {
            var2 = this.field1953[this.field1953.length - 1];
        }
        return var2 == -1 ? null : method2492(var2);
    }

    @ObfuscatedName("fj.w(I)Z")
    public boolean method3174() {
        if (this.field1953 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1954 != -1) {
            var1 = class288.method6395(this.field1954);
        } else if (this.field1955 != -1) {
            var1 = class288.field3326[this.field1955];
        }
        if (var1 >= 0 && var1 < this.field1953.length) {
            return this.field1953[var1] != -1;
        } else {
            return this.field1953[this.field1953.length - 1] != -1;
        }
    }

    @ObfuscatedName("fj.y(IIB)I")
    public int method3181(int arg0, int arg1) {
        return class175.method2678(this.field1959, arg0, arg1);
    }

    @ObfuscatedName("fj.i(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3175(int arg0, String arg1) {
        class419 var3 = this.field1959;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class406 var5 = (class406) var3.method6756((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4458;
            }
        }
        return var4;
    }

    @ObfuscatedName("jt.s(I)V")
    public static void method4709() {
        field1948.method4695();
        field1918.method4695();
    }
}

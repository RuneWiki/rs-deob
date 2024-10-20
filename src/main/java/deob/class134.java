package deob;

@ObfuscatedName("ej")
public class class134 extends class142 {

    @ObfuscatedName("ej.a")
    public static class134 field1954 = new class134();

    @ObfuscatedName("ej.j")
    public static byte[] field1957 = new byte[1];

    @ObfuscatedName("ej.n")
    public static class134 field1920 = new class134();

    @ObfuscatedName("ej.r")
    public static byte[] field1921 = new byte[1];

    @ObfuscatedName("ej.v")
    public int field1942 = 0;

    @ObfuscatedName("ej.e")
    public int[] field1923;

    @ObfuscatedName("ej.l")
    public int[] field1946;

    @ObfuscatedName("ej.s")
    public int[] field1925;

    @ObfuscatedName("ej.w")
    public int field1973 = 0;

    @ObfuscatedName("ej.p")
    public int[] field1927;

    @ObfuscatedName("ej.m")
    public int[] field1928;

    @ObfuscatedName("ej.u")
    public int[] field1918;

    @ObfuscatedName("ej.g")
    public int[] field1962;

    @ObfuscatedName("ej.k")
    public int[] field1931;

    @ObfuscatedName("ej.t")
    public int[] field1932;

    @ObfuscatedName("ej.c")
    public byte[] field1926;

    @ObfuscatedName("ej.o")
    public byte[] field1934;

    @ObfuscatedName("ej.x")
    public byte[] field1935;

    @ObfuscatedName("ej.f")
    public short[] field1936;

    @ObfuscatedName("ej.h")
    public byte field1984 = 0;

    @ObfuscatedName("ej.z")
    public int field1938 = 0;

    @ObfuscatedName("ej.i")
    public int[] field1939;

    @ObfuscatedName("ej.d")
    public int[] field1940;

    @ObfuscatedName("ej.b")
    public int[] field1941;

    @ObfuscatedName("ej.q")
    public int[][] field1958;

    @ObfuscatedName("ej.y")
    public int[][] field1943;

    @ObfuscatedName("ej.ai")
    public boolean field1976 = false;

    @ObfuscatedName("ej.ae")
    public int field1945;

    @ObfuscatedName("ej.au")
    public int field1959;

    @ObfuscatedName("ej.ak")
    public int field1947;

    @ObfuscatedName("ej.ap")
    public int field1944;

    @ObfuscatedName("ej.ar")
    public int field1949;

    @ObfuscatedName("ej.am")
    public int field1950;

    @ObfuscatedName("ej.aw")
    public int field1951;

    @ObfuscatedName("ej.aq")
    public int field1952;

    @ObfuscatedName("ej.aa")
    public int field1948 = -1;

    @ObfuscatedName("ej.ag")
    public int field1975 = -1;

    @ObfuscatedName("ej.aj")
    public int field1955 = -1;

    @ObfuscatedName("ej.ad")
    public static boolean[] field1972 = new boolean[4700];

    @ObfuscatedName("ej.az")
    public static boolean[] field1953 = new boolean[4700];

    @ObfuscatedName("ej.as")
    public static int[] field1983 = new int[4700];

    @ObfuscatedName("ej.av")
    public static int[] field1960 = new int[4700];

    @ObfuscatedName("ej.ab")
    public static int[] field1961 = new int[4700];

    @ObfuscatedName("ej.at")
    public static int[] field1937 = new int[4700];

    @ObfuscatedName("ej.al")
    public static int[] field1963 = new int[4700];

    @ObfuscatedName("ej.ah")
    public static int[] field1964 = new int[4700];

    @ObfuscatedName("ej.ay")
    public static int[] field1966 = new int[1600];

    @ObfuscatedName("ej.ao")
    public static int[][] field1967 = new int[1600][512];

    @ObfuscatedName("ej.ac")
    public static int[] field1968 = new int[12];

    @ObfuscatedName("ej.af")
    public static int[][] field1969 = new int[12][2000];

    @ObfuscatedName("ej.bp")
    public static int[] field1970 = new int[2000];

    @ObfuscatedName("ej.bi")
    public static int[] field1971 = new int[2000];

    @ObfuscatedName("ej.ba")
    public static int[] field1922 = new int[12];

    @ObfuscatedName("ej.bd")
    public static int[] field1987 = new int[10];

    @ObfuscatedName("ej.bl")
    public static int[] field1974 = new int[10];

    @ObfuscatedName("ej.bc")
    public static int[] field1929 = new int[10];

    @ObfuscatedName("ej.bh")
    public static boolean field1979 = true;

    @ObfuscatedName("ej.bw")
    public static int[] field1982 = class137.field2009;

    @ObfuscatedName("ej.bg")
    public static int[] field1933 = class137.field2035;

    @ObfuscatedName("ej.bt")
    public static int[] field1924 = class137.field2034;

    @ObfuscatedName("ej.bz")
    public static int[] field1919 = class137.field2033;

    public class134() {
    }

    public class134(class134[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1942 = 0;
        this.field1973 = 0;
        this.field1938 = 0;
        this.field1984 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class134 var8 = arg0[var7];
            if (var8 != null) {
                this.field1942 += var8.field1942;
                this.field1973 += var8.field1973;
                this.field1938 += var8.field1938;
                if (var8.field1926 == null) {
                    if (this.field1984 == -1) {
                        this.field1984 = var8.field1984;
                    }
                    if (this.field1984 != var8.field1984) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1934 != null;
                var5 |= var8.field1936 != null;
                var6 |= var8.field1935 != null;
            }
        }
        this.field1923 = new int[this.field1942];
        this.field1946 = new int[this.field1942];
        this.field1925 = new int[this.field1942];
        this.field1927 = new int[this.field1973];
        this.field1928 = new int[this.field1973];
        this.field1918 = new int[this.field1973];
        this.field1962 = new int[this.field1973];
        this.field1931 = new int[this.field1973];
        this.field1932 = new int[this.field1973];
        if (var3) {
            this.field1926 = new byte[this.field1973];
        }
        if (var4) {
            this.field1934 = new byte[this.field1973];
        }
        if (var5) {
            this.field1936 = new short[this.field1973];
        }
        if (var6) {
            this.field1935 = new byte[this.field1973];
        }
        if (this.field1938 > 0) {
            this.field1939 = new int[this.field1938];
            this.field1940 = new int[this.field1938];
            this.field1941 = new int[this.field1938];
        }
        this.field1942 = 0;
        this.field1973 = 0;
        this.field1938 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class134 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1973; var11++) {
                    this.field1927[this.field1973] = var10.field1927[var11] + this.field1942;
                    this.field1928[this.field1973] = var10.field1928[var11] + this.field1942;
                    this.field1918[this.field1973] = var10.field1918[var11] + this.field1942;
                    this.field1962[this.field1973] = var10.field1962[var11];
                    this.field1931[this.field1973] = var10.field1931[var11];
                    this.field1932[this.field1973] = var10.field1932[var11];
                    if (var3) {
                        if (var10.field1926 == null) {
                            this.field1926[this.field1973] = var10.field1984;
                        } else {
                            this.field1926[this.field1973] = var10.field1926[var11];
                        }
                    }
                    if (var4 && var10.field1934 != null) {
                        this.field1934[this.field1973] = var10.field1934[var11];
                    }
                    if (var5) {
                        if (var10.field1936 == null) {
                            this.field1936[this.field1973] = -1;
                        } else {
                            this.field1936[this.field1973] = var10.field1936[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1935 == null || var10.field1935[var11] == -1) {
                            this.field1935[this.field1973] = -1;
                        } else {
                            this.field1935[this.field1973] = (byte) (var10.field1935[var11] + this.field1938);
                        }
                    }
                    this.field1973++;
                }
                for (int var12 = 0; var12 < var10.field1938; var12++) {
                    this.field1939[this.field1938] = var10.field1939[var12] + this.field1942;
                    this.field1940[this.field1938] = var10.field1940[var12] + this.field1942;
                    this.field1941[this.field1938] = var10.field1941[var12] + this.field1942;
                    this.field1938++;
                }
                for (int var13 = 0; var13 < var10.field1942; var13++) {
                    this.field1923[this.field1942] = var10.field1923[var13];
                    this.field1946[this.field1942] = var10.field1946[var13];
                    this.field1925[this.field1942] = var10.field1925[var13];
                    this.field1942++;
                }
            }
        }
    }

    @ObfuscatedName("ej.a([[IIIIZI)Lej;")
    public class134 method2302(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2319();
        int var7 = arg1 - this.field1947;
        int var8 = this.field1947 + arg1;
        int var9 = arg3 - this.field1947;
        int var10 = this.field1947 + arg3;
        if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var11 = var7 >> 7;
        int var12 = var8 + 127 >> 7;
        int var13 = var9 >> 7;
        int var14 = var10 + 127 >> 7;
        if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
            return this;
        }
        class134 var15;
        if (arg4) {
            var15 = new class134();
            var15.field1942 = this.field1942;
            var15.field1973 = this.field1973;
            var15.field1938 = this.field1938;
            var15.field1923 = this.field1923;
            var15.field1925 = this.field1925;
            var15.field1927 = this.field1927;
            var15.field1928 = this.field1928;
            var15.field1918 = this.field1918;
            var15.field1962 = this.field1962;
            var15.field1931 = this.field1931;
            var15.field1932 = this.field1932;
            var15.field1926 = this.field1926;
            var15.field1934 = this.field1934;
            var15.field1935 = this.field1935;
            var15.field1936 = this.field1936;
            var15.field1984 = this.field1984;
            var15.field1939 = this.field1939;
            var15.field1940 = this.field1940;
            var15.field1941 = this.field1941;
            var15.field1958 = this.field1958;
            var15.field1943 = this.field1943;
            var15.field1976 = this.field1976;
            var15.field1946 = new int[var15.field1942];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1942; var16++) {
                int var17 = this.field1923[var16] + arg1;
                int var18 = this.field1925[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1946[var16] = this.field1946[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1942; var26++) {
                int var27 = (-this.field1946[var26] << 16) / this.field2119;
                if (var27 < arg5) {
                    int var28 = this.field1923[var26] + arg1;
                    int var29 = this.field1925[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1946[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1946[var26];
                }
            }
        }
        var15.method2336();
        return var15;
    }

    @ObfuscatedName("ej.j(Z)Lej;")
    public class134 method2272(boolean arg0) {
        if (!arg0 && field1957.length < this.field1973) {
            field1957 = new byte[this.field1973 + 100];
        }
        return this.method2270(arg0, field1954, field1957);
    }

    @ObfuscatedName("ej.r(Z)Lej;")
    public class134 method2273(boolean arg0) {
        if (!arg0 && field1921.length < this.field1973) {
            field1921 = new byte[this.field1973 + 100];
        }
        return this.method2270(arg0, field1920, field1921);
    }

    @ObfuscatedName("ej.v(ZLej;[B)Lej;")
    public class134 method2270(boolean arg0, class134 arg1, byte[] arg2) {
        arg1.field1942 = this.field1942;
        arg1.field1973 = this.field1973;
        arg1.field1938 = this.field1938;
        if (arg1.field1923 == null || arg1.field1923.length < this.field1942) {
            arg1.field1923 = new int[this.field1942 + 100];
            arg1.field1946 = new int[this.field1942 + 100];
            arg1.field1925 = new int[this.field1942 + 100];
        }
        for (int var4 = 0; var4 < this.field1942; var4++) {
            arg1.field1923[var4] = this.field1923[var4];
            arg1.field1946[var4] = this.field1946[var4];
            arg1.field1925[var4] = this.field1925[var4];
        }
        if (arg0) {
            arg1.field1934 = this.field1934;
        } else {
            arg1.field1934 = arg2;
            if (this.field1934 == null) {
                for (int var5 = 0; var5 < this.field1973; var5++) {
                    arg1.field1934[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1973; var6++) {
                    arg1.field1934[var6] = this.field1934[var6];
                }
            }
        }
        arg1.field1927 = this.field1927;
        arg1.field1928 = this.field1928;
        arg1.field1918 = this.field1918;
        arg1.field1962 = this.field1962;
        arg1.field1931 = this.field1931;
        arg1.field1932 = this.field1932;
        arg1.field1926 = this.field1926;
        arg1.field1935 = this.field1935;
        arg1.field1936 = this.field1936;
        arg1.field1984 = this.field1984;
        arg1.field1939 = this.field1939;
        arg1.field1940 = this.field1940;
        arg1.field1941 = this.field1941;
        arg1.field1958 = this.field1958;
        arg1.field1943 = this.field1943;
        arg1.field1976 = this.field1976;
        arg1.method2336();
        return arg1;
    }

    @ObfuscatedName("ej.e(I)V")
    public void method2275(int arg0) {
        if (this.field1948 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1933[arg0];
        int var9 = field1982[arg0];
        for (int var10 = 0; var10 < this.field1942; var10++) {
            int var11 = class137.method2432(this.field1923[var10], this.field1925[var10], var8, var9);
            int var12 = this.field1946[var10];
            int var13 = class137.method2389(this.field1923[var10], this.field1925[var10], var8, var9);
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        this.field1950 = (var2 + var5) / 2;
        this.field1951 = (var3 + var6) / 2;
        this.field1952 = (var4 + var7) / 2;
        this.field1948 = (var5 - var2 + 1) / 2;
        this.field1975 = (var6 - var3 + 1) / 2;
        this.field1955 = (var7 - var4 + 1) / 2;
        if (this.field1948 < 32) {
            this.field1948 = 32;
        }
        if (this.field1955 < 32) {
            this.field1955 = 32;
        }
        if (this.field1976) {
            this.field1948 += 8;
            this.field1955 += 8;
        }
    }

    @ObfuscatedName("ej.l()V")
    public void method2319() {
        if (this.field1945 == 1) {
            return;
        }
        this.field1945 = 1;
        this.field2119 = 0;
        this.field1959 = 0;
        this.field1947 = 0;
        for (int var1 = 0; var1 < this.field1942; var1++) {
            int var2 = this.field1923[var1];
            int var3 = this.field1946[var1];
            int var4 = this.field1925[var1];
            if (-var3 > this.field2119) {
                this.field2119 = -var3;
            }
            if (var3 > this.field1959) {
                this.field1959 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1947) {
                this.field1947 = var5;
            }
        }
        this.field1947 = (int) (Math.sqrt((double) this.field1947) + 0.99D);
        this.field1949 = (int) (Math.sqrt((double) (this.field2119 * this.field2119 + this.field1947 * this.field1947)) + 0.99D);
        this.field1944 = this.field1949 + (int) (Math.sqrt((double) (this.field1959 * this.field1959 + this.field1947 * this.field1947)) + 0.99D);
    }

    @ObfuscatedName("ej.s()V")
    public void method2277() {
        if (this.field1945 == 2) {
            return;
        }
        this.field1945 = 2;
        this.field1947 = 0;
        for (int var1 = 0; var1 < this.field1942; var1++) {
            int var2 = this.field1923[var1];
            int var3 = this.field1946[var1];
            int var4 = this.field1925[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1947) {
                this.field1947 = var5;
            }
        }
        this.field1947 = (int) (Math.sqrt((double) this.field1947) + 0.99D);
        this.field1949 = this.field1947;
        this.field1944 = this.field1947 + this.field1947;
    }

    @ObfuscatedName("ej.w()I")
    public int method2299() {
        this.method2319();
        return this.field1947;
    }

    @ObfuscatedName("ej.p()V")
    public void method2336() {
        this.field1945 = 0;
        this.field1948 = -1;
    }

    @ObfuscatedName("ej.m(Let;I)V")
    public void method2296(class145 arg0, int arg1) {
        if (this.field1958 == null || arg1 == -1) {
            return;
        }
        class132 var3 = arg0.field2139[arg1];
        class139 var4 = var3.field1884;
        Statics.field1985 = 0;
        Statics.field1977 = 0;
        Statics.field1978 = 0;
        for (int var5 = 0; var5 < var3.field1885; var5++) {
            int var6 = var3.field1887[var5];
            this.method2282(var4.field2049[var6], var4.field2048[var6], var3.field1880[var5], var3.field1882[var5], var3.field1889[var5]);
        }
        this.method2336();
    }

    @ObfuscatedName("ej.u(Let;ILet;I[I)V")
    public void method2281(class145 arg0, int arg1, class145 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2296(arg0, arg1);
            return;
        }
        class132 var6 = arg0.field2139[arg1];
        class132 var7 = arg2.field2139[arg3];
        class139 var8 = var6.field1884;
        Statics.field1985 = 0;
        Statics.field1977 = 0;
        Statics.field1978 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1885; var11++) {
            int var12 = var6.field1887[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2049[var12] == 0) {
                this.method2282(var8.field2049[var12], var8.field2048[var12], var6.field1880[var11], var6.field1882[var11], var6.field1889[var11]);
            }
        }
        Statics.field1985 = 0;
        Statics.field1977 = 0;
        Statics.field1978 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1885; var15++) {
            int var16 = var7.field1887[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2049[var16] == 0) {
                this.method2282(var8.field2049[var16], var8.field2048[var16], var7.field1880[var15], var7.field1882[var15], var7.field1889[var15]);
            }
        }
        this.method2336();
    }

    @ObfuscatedName("ej.g(I[IIII)V")
    public void method2282(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1985 = 0;
            Statics.field1977 = 0;
            Statics.field1978 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1958.length) {
                    int[] var10 = this.field1958[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1985 += this.field1923[var12];
                        Statics.field1977 += this.field1946[var12];
                        Statics.field1978 += this.field1925[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1985 = Statics.field1985 / var7 + arg2;
                Statics.field1977 = Statics.field1977 / var7 + arg3;
                Statics.field1978 = Statics.field1978 / var7 + arg4;
            } else {
                Statics.field1985 = arg2;
                Statics.field1977 = arg3;
                Statics.field1978 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1958.length) {
                    int[] var15 = this.field1958[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1923[var17] += arg2;
                        this.field1946[var17] += arg3;
                        this.field1925[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1958.length) {
                    int[] var20 = this.field1958[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1923[var22] -= Statics.field1985;
                        this.field1946[var22] -= Statics.field1977;
                        this.field1925[var22] -= Statics.field1978;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1982[var25];
                            int var27 = field1933[var25];
                            int var28 = this.field1946[var22] * var26 + this.field1923[var22] * var27 >> 16;
                            this.field1946[var22] = this.field1946[var22] * var27 - this.field1923[var22] * var26 >> 16;
                            this.field1923[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1982[var23];
                            int var30 = field1933[var23];
                            int var31 = this.field1946[var22] * var30 - this.field1925[var22] * var29 >> 16;
                            this.field1925[var22] = this.field1946[var22] * var29 + this.field1925[var22] * var30 >> 16;
                            this.field1946[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1982[var24];
                            int var33 = field1933[var24];
                            int var34 = this.field1925[var22] * var32 + this.field1923[var22] * var33 >> 16;
                            this.field1925[var22] = this.field1925[var22] * var33 - this.field1923[var22] * var32 >> 16;
                            this.field1923[var22] = var34;
                        }
                        this.field1923[var22] += Statics.field1985;
                        this.field1946[var22] += Statics.field1977;
                        this.field1925[var22] += Statics.field1978;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1958.length) {
                    int[] var37 = this.field1958[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1923[var39] -= Statics.field1985;
                        this.field1946[var39] -= Statics.field1977;
                        this.field1925[var39] -= Statics.field1978;
                        this.field1923[var39] = this.field1923[var39] * arg2 / 128;
                        this.field1946[var39] = this.field1946[var39] * arg3 / 128;
                        this.field1925[var39] = this.field1925[var39] * arg4 / 128;
                        this.field1923[var39] += Statics.field1985;
                        this.field1946[var39] += Statics.field1977;
                        this.field1925[var39] += Statics.field1978;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1943 != null && this.field1934 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1943.length) {
                    int[] var42 = this.field1943[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1934[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1934[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ej.c()V")
    public void method2283() {
        for (int var1 = 0; var1 < this.field1942; var1++) {
            int var2 = this.field1923[var1];
            this.field1923[var1] = this.field1925[var1];
            this.field1925[var1] = -var2;
        }
        this.method2336();
    }

    @ObfuscatedName("ej.o()V")
    public void method2292() {
        for (int var1 = 0; var1 < this.field1942; var1++) {
            this.field1923[var1] = -this.field1923[var1];
            this.field1925[var1] = -this.field1925[var1];
        }
        this.method2336();
    }

    @ObfuscatedName("ej.x()V")
    public void method2298() {
        for (int var1 = 0; var1 < this.field1942; var1++) {
            int var2 = this.field1925[var1];
            this.field1925[var1] = this.field1923[var1];
            this.field1923[var1] = -var2;
        }
        this.method2336();
    }

    @ObfuscatedName("ej.h(I)V")
    public void method2286(int arg0) {
        int var2 = field1982[arg0];
        int var3 = field1933[arg0];
        for (int var4 = 0; var4 < this.field1942; var4++) {
            int var5 = this.field1946[var4] * var3 - this.field1925[var4] * var2 >> 16;
            this.field1925[var4] = this.field1946[var4] * var2 + this.field1925[var4] * var3 >> 16;
            this.field1946[var4] = var5;
        }
        this.method2336();
    }

    @ObfuscatedName("ej.z(III)V")
    public void method2352(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1942; var4++) {
            this.field1923[var4] += arg0;
            this.field1946[var4] += arg1;
            this.field1925[var4] += arg2;
        }
        this.method2336();
    }

    @ObfuscatedName("ej.i(III)V")
    public void method2301(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1942; var4++) {
            this.field1923[var4] = this.field1923[var4] * arg0 / 128;
            this.field1946[var4] = this.field1946[var4] * arg1 / 128;
            this.field1925[var4] = this.field1925[var4] * arg2 / 128;
        }
        this.method2336();
    }

    @ObfuscatedName("ej.d(IIIIIII)V")
    public final void method2289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1966[0] = -1;
        if (this.field1945 != 2 && this.field1945 != 1) {
            this.method2277();
        }
        int var8 = Statics.field2021;
        int var9 = Statics.field2032;
        int var10 = field1982[arg0];
        int var11 = field1933[arg0];
        int var12 = field1982[arg1];
        int var13 = field1933[arg1];
        int var14 = field1982[arg2];
        int var15 = field1933[arg2];
        int var16 = field1982[arg3];
        int var17 = field1933[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1942; var19++) {
            int var20 = this.field1923[var19];
            int var21 = this.field1946[var19];
            int var22 = this.field1925[var19];
            if (arg2 != 0) {
                int var23 = var14 * var21 + var15 * var20 >> 16;
                var21 = var15 * var21 - var14 * var20 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                int var24 = var11 * var21 - var10 * var22 >> 16;
                var22 = var10 * var21 + var11 * var22 >> 16;
                var21 = var24;
            }
            if (arg1 != 0) {
                int var25 = var12 * var22 + var13 * var20 >> 16;
                var22 = var13 * var22 - var12 * var20 >> 16;
                var20 = var25;
            }
            int var26 = arg4 + var20;
            int var27 = arg5 + var21;
            int var28 = arg6 + var22;
            int var29 = var17 * var27 - var16 * var28 >> 16;
            int var30 = var16 * var27 + var17 * var28 >> 16;
            field1961[var19] = var30 - var18;
            field1983[var19] = class137.field2027 * var26 / var30 + var8;
            field1960[var19] = class137.field2027 * var29 / var30 + var9;
            if (this.field1938 > 0) {
                field1937[var19] = var26;
                field1963[var19] = var29;
                field1964[var19] = var30;
            }
        }
        try {
            this.method2280(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ej.ai(IIIIIIII)V")
    public final void method2290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1966[0] = -1;
        if (this.field1945 != 2 && this.field1945 != 1) {
            this.method2277();
        }
        int var9 = Statics.field2021;
        int var10 = Statics.field2032;
        int var11 = field1982[arg0];
        int var12 = field1933[arg0];
        int var13 = field1982[arg1];
        int var14 = field1933[arg1];
        int var15 = field1982[arg2];
        int var16 = field1933[arg2];
        int var17 = field1982[arg3];
        int var18 = field1933[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1942; var20++) {
            int var21 = this.field1923[var20];
            int var22 = this.field1946[var20];
            int var23 = this.field1925[var20];
            if (arg2 != 0) {
                int var24 = var15 * var22 + var16 * var21 >> 16;
                var22 = var16 * var22 - var15 * var21 >> 16;
                var21 = var24;
            }
            if (arg0 != 0) {
                int var25 = var12 * var22 - var11 * var23 >> 16;
                var23 = var11 * var22 + var12 * var23 >> 16;
                var22 = var25;
            }
            if (arg1 != 0) {
                int var26 = var13 * var23 + var14 * var21 >> 16;
                var23 = var14 * var23 - var13 * var21 >> 16;
                var21 = var26;
            }
            int var27 = arg4 + var21;
            int var28 = arg5 + var22;
            int var29 = arg6 + var23;
            int var30 = var18 * var28 - var17 * var29 >> 16;
            int var31 = var17 * var28 + var18 * var29 >> 16;
            field1961[var20] = var31 - var19;
            field1983[var20] = class137.field2027 * var27 / arg7 + var9;
            field1960[var20] = class137.field2027 * var30 / arg7 + var10;
            if (this.field1938 > 0) {
                field1937[var20] = var27;
                field1963[var20] = var30;
                field1964[var20] = var31;
            }
        }
        try {
            this.method2280(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ej.cf(IIIIIIIII)V")
    public void method2291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1966[0] = -1;
        if (this.field1945 != 1) {
            this.method2319();
        }
        this.method2275(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1947 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1947) * class137.field2027;
        if (var15 / var13 >= Statics.field2026) {
            return;
        }
        int var16 = (this.field1947 + var14) * class137.field2027;
        if (var16 / var13 <= Statics.field2025) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1947 * arg1 >> 16;
        int var19 = (var17 + var18) * class137.field2027;
        if (var19 / var13 <= Statics.field2022) {
            return;
        }
        int var20 = (this.field2119 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class137.field2027;
        if (var21 / var13 >= Statics.field2028) {
            return;
        }
        int var22 = (this.field2119 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1938 > 0;
        int var26 = class135.method4457();
        int var27 = class135.field1997;
        boolean var29 = Statics.method540();
        if (class8.field233 && arg8 > 0) {
            if (class135.method10(this, arg5, arg6, arg7)) {
                class8.method3750(this, arg5, arg6, arg7, -65281);
            } else if (class8.field230 == class12.field271) {
                class8.method3750(this, arg5, arg6, arg7, -16776961);
            }
        }
        if (class8.field228 && arg8 > 0) {
            int var31 = var11 - var12;
            if (var31 <= 50) {
                var31 = 50;
            }
            int var36;
            int var37;
            if (var14 > 0) {
                var36 = var15 / var13;
                var37 = var16 / var31;
            } else {
                var37 = var16 / var13;
                var36 = var15 / var31;
            }
            int var38;
            int var39;
            if (var17 > 0) {
                var38 = var21 / var13;
                var39 = var19 / var31;
            } else {
                var39 = var19 / var13;
                var38 = var21 / var31;
            }
            int var40 = -8355840;
            int var41 = var26 - Statics.field2021;
            int var42 = var27 - Statics.field2032;
            if (var41 > var36 && var41 < var37 && var42 > var38 && var42 < var39) {
                var40 = -256;
            }
            int var43 = Statics.field2021 + var36;
            int var44 = Statics.field2032 + var38;
            int var45 = Statics.field2021 + var37;
            int var46 = Statics.field2032 + var39;
            class8.field227.method3287(new class9(var43, var44, var45, var46, var40));
        }
        boolean var47 = false;
        if (arg8 > 0 && var29) {
            boolean var48 = false;
            if (field1979) {
                var48 = class135.method10(this, arg5, arg6, arg7);
            } else {
                int var49 = var11 - var12;
                if (var49 <= 50) {
                    var49 = 50;
                }
                int var50;
                int var51;
                if (var14 > 0) {
                    var50 = var15 / var13;
                    var51 = var16 / var49;
                } else {
                    var51 = var16 / var13;
                    var50 = var15 / var49;
                }
                int var52;
                int var53;
                if (var17 > 0) {
                    var52 = var21 / var13;
                    var53 = var19 / var49;
                } else {
                    var53 = var19 / var13;
                    var52 = var21 / var49;
                }
                int var54 = var26 - Statics.field2021;
                int var55 = var27 - Statics.field2032;
                if (var54 > var50 && var54 < var51 && var55 > var52 && var55 < var53) {
                    var48 = true;
                }
            }
            if (var48) {
                if (this.field1976) {
                    class135.method1516(arg8);
                } else {
                    var47 = true;
                }
            }
        }
        int var56 = Statics.field2021;
        int var57 = Statics.field2032;
        int var58 = 0;
        int var59 = 0;
        if (arg0 != 0) {
            var58 = field1982[arg0];
            var59 = field1933[arg0];
        }
        for (int var60 = 0; var60 < this.field1942; var60++) {
            int var61 = this.field1923[var60];
            int var62 = this.field1946[var60];
            int var63 = this.field1925[var60];
            if (arg0 != 0) {
                int var64 = var58 * var63 + var59 * var61 >> 16;
                var63 = var59 * var63 - var58 * var61 >> 16;
                var61 = var64;
            }
            int var65 = arg5 + var61;
            int var66 = arg6 + var62;
            int var67 = arg7 + var63;
            int var68 = arg3 * var67 + arg4 * var65 >> 16;
            int var69 = arg4 * var67 - arg3 * var65 >> 16;
            int var71 = arg2 * var66 - arg1 * var69 >> 16;
            int var72 = arg1 * var66 + arg2 * var69 >> 16;
            field1961[var60] = var72 - var11;
            if (var72 >= 50) {
                field1983[var60] = class137.field2027 * var68 / var72 + var56;
                field1960[var60] = class137.field2027 * var71 / var72 + var57;
            } else {
                field1983[var60] = -5000;
                var23 = true;
            }
            if (var25) {
                field1937[var60] = var68;
                field1963[var60] = var71;
                field1964[var60] = var72;
            }
        }
        try {
            this.method2280(var23, var47, this.field1976, arg8);
        } catch (Exception var75) {
        }
    }

    @ObfuscatedName("ej.ae(ZZZI)V")
    public final void method2280(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1944 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1944; var5++) {
            field1966[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field229 && arg1) {
            class134 var7 = this;
            for (int var8 = 0; var8 < var7.field1973; var8++) {
                if (var7.field1932[var8] != -2) {
                    int var9 = var7.field1927[var8];
                    int var10 = var7.field1928[var8];
                    int var11 = var7.field1918[var8];
                    int var12 = field1983[var9];
                    int var13 = field1983[var10];
                    int var14 = field1983[var11];
                    class8.method550(field1960[var9], field1960[var10], field1960[var11], var12, var13, var14, var6);
                }
            }
        }
        for (int var15 = 0; var15 < this.field1973; var15++) {
            if (this.field1932[var15] != -2) {
                int var16 = this.field1927[var15];
                int var17 = this.field1928[var15];
                int var18 = this.field1918[var15];
                int var19 = field1983[var16];
                int var20 = field1983[var17];
                int var21 = field1983[var18];
                if (arg0 && var19 == -5000 || var20 == -5000 || var21 == -5000) {
                    int var22 = field1937[var16];
                    int var23 = field1937[var17];
                    int var24 = field1937[var18];
                    int var25 = field1963[var16];
                    int var26 = field1963[var17];
                    int var27 = field1963[var18];
                    int var28 = field1964[var16];
                    int var29 = field1964[var17];
                    int var30 = field1964[var18];
                    int var31 = var22 - var23;
                    int var32 = var24 - var23;
                    int var33 = var25 - var26;
                    int var34 = var27 - var26;
                    int var35 = var28 - var29;
                    int var36 = var30 - var29;
                    int var37 = var33 * var36 - var34 * var35;
                    int var38 = var32 * var35 - var31 * var36;
                    int var39 = var31 * var34 - var32 * var33;
                    if (var29 * var39 + var23 * var37 + var26 * var38 > 0) {
                        field1953[var15] = true;
                        int var40 = (field1961[var16] + field1961[var17] + field1961[var18]) / 3 + this.field1949;
                        field1967[var40][field1966[var40]++] = var15;
                    }
                } else {
                    if (arg1) {
                        int var41 = field1960[var16];
                        int var42 = field1960[var17];
                        int var43 = field1960[var18];
                        int var44 = class135.field1997 + var6;
                        boolean var45;
                        if (var44 < var41 && var44 < var42 && var44 < var43) {
                            var45 = false;
                        } else {
                            int var46 = class135.field1997 - var6;
                            if (var46 > var41 && var46 > var42 && var46 > var43) {
                                var45 = false;
                            } else {
                                int var47 = class135.field1992 + var6;
                                if (var47 < var19 && var47 < var20 && var47 < var21) {
                                    var45 = false;
                                } else {
                                    int var48 = class135.field1992 - var6;
                                    if (var48 > var19 && var48 > var20 && var48 > var21) {
                                        var45 = false;
                                    } else {
                                        var45 = true;
                                    }
                                }
                            }
                        }
                        if (var45) {
                            class135.method1516(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field1960[var18] - field1960[var17]) * (var19 - var20) - (field1960[var16] - field1960[var17]) * (var21 - var20) > 0) {
                        field1953[var15] = false;
                        if (var19 >= 0 && var20 >= 0 && var21 >= 0 && var19 <= Statics.field2023 && var20 <= Statics.field2023 && var21 <= Statics.field2023) {
                            field1972[var15] = false;
                        } else {
                            field1972[var15] = true;
                        }
                        int var49 = (field1961[var16] + field1961[var17] + field1961[var18]) / 3 + this.field1949;
                        field1967[var49][field1966[var49]++] = var15;
                    }
                }
            }
        }
        if (this.field1926 == null) {
            for (int var50 = this.field1944 - 1; var50 >= 0; var50--) {
                int var51 = field1966[var50];
                if (var51 > 0) {
                    int[] var52 = field1967[var50];
                    for (int var53 = 0; var53 < var51; var53++) {
                        this.method2293(var52[var53]);
                    }
                }
            }
            return;
        }
        for (int var54 = 0; var54 < 12; var54++) {
            field1968[var54] = 0;
            field1922[var54] = 0;
        }
        for (int var55 = this.field1944 - 1; var55 >= 0; var55--) {
            int var56 = field1966[var55];
            if (var56 > 0) {
                int[] var57 = field1967[var55];
                for (int var58 = 0; var58 < var56; var58++) {
                    int var59 = var57[var58];
                    byte var60 = this.field1926[var59];
                    int var61 = field1968[var60]++;
                    field1969[var60][var61] = var59;
                    if (var60 < 10) {
                        field1922[var60] += var55;
                    } else if (var60 == 10) {
                        field1970[var61] = var55;
                    } else {
                        field1971[var61] = var55;
                    }
                }
            }
        }
        int var62 = 0;
        if (field1968[1] > 0 || field1968[2] > 0) {
            var62 = (field1922[1] + field1922[2]) / (field1968[1] + field1968[2]);
        }
        int var63 = 0;
        if (field1968[3] > 0 || field1968[4] > 0) {
            var63 = (field1922[3] + field1922[4]) / (field1968[3] + field1968[4]);
        }
        int var64 = 0;
        if (field1968[6] > 0 || field1968[8] > 0) {
            var64 = (field1922[6] + field1922[8]) / (field1968[6] + field1968[8]);
        }
        int var65 = 0;
        int var66 = field1968[10];
        int[] var67 = field1969[10];
        int[] var68 = field1970;
        if (var65 == var66) {
            var65 = 0;
            var66 = field1968[11];
            var67 = field1969[11];
            var68 = field1971;
        }
        int var69;
        if (var65 < var66) {
            var69 = var68[var65];
        } else {
            var69 = -1000;
        }
        for (int var70 = 0; var70 < 10; var70++) {
            while (var70 == 0 && var69 > var62) {
                this.method2293(var67[var65++]);
                if (var65 == var66 && field1969[11] != var67) {
                    var65 = 0;
                    var66 = field1968[11];
                    var67 = field1969[11];
                    var68 = field1971;
                }
                if (var65 < var66) {
                    var69 = var68[var65];
                } else {
                    var69 = -1000;
                }
            }
            while (var70 == 3 && var69 > var63) {
                this.method2293(var67[var65++]);
                if (var65 == var66 && field1969[11] != var67) {
                    var65 = 0;
                    var66 = field1968[11];
                    var67 = field1969[11];
                    var68 = field1971;
                }
                if (var65 < var66) {
                    var69 = var68[var65];
                } else {
                    var69 = -1000;
                }
            }
            while (var70 == 5 && var69 > var64) {
                this.method2293(var67[var65++]);
                if (var65 == var66 && field1969[11] != var67) {
                    var65 = 0;
                    var66 = field1968[11];
                    var67 = field1969[11];
                    var68 = field1971;
                }
                if (var65 < var66) {
                    var69 = var68[var65];
                } else {
                    var69 = -1000;
                }
            }
            int var71 = field1968[var70];
            int[] var72 = field1969[var70];
            for (int var73 = 0; var73 < var71; var73++) {
                this.method2293(var72[var73]);
            }
        }
        while (var69 != -1000) {
            this.method2293(var67[var65++]);
            if (var65 == var66 && field1969[11] != var67) {
                var65 = 0;
                var67 = field1969[11];
                var66 = field1968[11];
                var68 = field1971;
            }
            if (var65 < var66) {
                var69 = var68[var65];
            } else {
                var69 = -1000;
            }
        }
    }

    @ObfuscatedName("ej.au(I)V")
    public final void method2293(int arg0) {
        if (field1953[arg0]) {
            this.method2294(arg0);
            return;
        }
        int var2 = this.field1927[arg0];
        int var3 = this.field1928[arg0];
        int var4 = this.field1918[arg0];
        class137.field2030 = field1972[arg0];
        if (this.field1934 == null) {
            class137.field2013 = 0;
        } else {
            class137.field2013 = this.field1934[arg0] & 0xFF;
        }
        if (this.field1936 != null && this.field1936[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1935 == null || this.field1935[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1935[arg0] & 0xFF;
                var6 = this.field1939[var5];
                var7 = this.field1940[var5];
                var8 = this.field1941[var5];
            }
            if (this.field1932[arg0] == -1) {
                class137.method2384(field1960[var2], field1960[var3], field1960[var4], field1983[var2], field1983[var3], field1983[var4], this.field1962[arg0], this.field1962[arg0], this.field1962[arg0], field1937[var6], field1937[var7], field1937[var8], field1963[var6], field1963[var7], field1963[var8], field1964[var6], field1964[var7], field1964[var8], this.field1936[arg0]);
            } else {
                class137.method2384(field1960[var2], field1960[var3], field1960[var4], field1983[var2], field1983[var3], field1983[var4], this.field1962[arg0], this.field1931[arg0], this.field1932[arg0], field1937[var6], field1937[var7], field1937[var8], field1963[var6], field1963[var7], field1963[var8], field1964[var6], field1964[var7], field1964[var8], this.field1936[arg0]);
            }
        } else if (this.field1932[arg0] == -1) {
            class137.method2388(field1960[var2], field1960[var3], field1960[var4], field1983[var2], field1983[var3], field1983[var4], field1924[this.field1962[arg0]]);
        } else {
            class137.method2380(field1960[var2], field1960[var3], field1960[var4], field1983[var2], field1983[var3], field1983[var4], this.field1962[arg0], this.field1931[arg0], this.field1932[arg0]);
        }
    }

    @ObfuscatedName("ej.ak(I)V")
    public final void method2294(int arg0) {
        int var2 = Statics.field2021;
        int var3 = Statics.field2032;
        int var4 = 0;
        int var5 = this.field1927[arg0];
        int var6 = this.field1928[arg0];
        int var7 = this.field1918[arg0];
        int var8 = field1964[var5];
        int var9 = field1964[var6];
        int var10 = field1964[var7];
        if (this.field1934 == null) {
            class137.field2013 = 0;
        } else {
            class137.field2013 = this.field1934[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1987[var4] = field1983[var5];
            field1974[var4] = field1960[var5];
            field1929[var4++] = this.field1962[arg0];
        } else {
            int var11 = field1937[var5];
            int var12 = field1963[var5];
            int var13 = this.field1962[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1919[var10 - var8];
                field1987[var4] = (((field1937[var7] - var11) * var14 >> 16) + var11) * class137.field2027 / 50 + var2;
                field1974[var4] = (((field1963[var7] - var12) * var14 >> 16) + var12) * class137.field2027 / 50 + var3;
                field1929[var4++] = ((this.field1932[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1919[var9 - var8];
                field1987[var4] = (((field1937[var6] - var11) * var15 >> 16) + var11) * class137.field2027 / 50 + var2;
                field1974[var4] = (((field1963[var6] - var12) * var15 >> 16) + var12) * class137.field2027 / 50 + var3;
                field1929[var4++] = ((this.field1931[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1987[var4] = field1983[var6];
            field1974[var4] = field1960[var6];
            field1929[var4++] = this.field1931[arg0];
        } else {
            int var16 = field1937[var6];
            int var17 = field1963[var6];
            int var18 = this.field1931[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1919[var8 - var9];
                field1987[var4] = (((field1937[var5] - var16) * var19 >> 16) + var16) * class137.field2027 / 50 + var2;
                field1974[var4] = (((field1963[var5] - var17) * var19 >> 16) + var17) * class137.field2027 / 50 + var3;
                field1929[var4++] = ((this.field1962[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1919[var10 - var9];
                field1987[var4] = (((field1937[var7] - var16) * var20 >> 16) + var16) * class137.field2027 / 50 + var2;
                field1974[var4] = (((field1963[var7] - var17) * var20 >> 16) + var17) * class137.field2027 / 50 + var3;
                field1929[var4++] = ((this.field1932[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1987[var4] = field1983[var7];
            field1974[var4] = field1960[var7];
            field1929[var4++] = this.field1932[arg0];
        } else {
            int var21 = field1937[var7];
            int var22 = field1963[var7];
            int var23 = this.field1932[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1919[var9 - var10];
                field1987[var4] = (((field1937[var6] - var21) * var24 >> 16) + var21) * class137.field2027 / 50 + var2;
                field1974[var4] = (((field1963[var6] - var22) * var24 >> 16) + var22) * class137.field2027 / 50 + var3;
                field1929[var4++] = ((this.field1931[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1919[var8 - var10];
                field1987[var4] = (((field1937[var5] - var21) * var25 >> 16) + var21) * class137.field2027 / 50 + var2;
                field1974[var4] = (((field1963[var5] - var22) * var25 >> 16) + var22) * class137.field2027 / 50 + var3;
                field1929[var4++] = ((this.field1962[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1987[0];
        int var27 = field1987[1];
        int var28 = field1987[2];
        int var29 = field1974[0];
        int var30 = field1974[1];
        int var31 = field1974[2];
        class137.field2030 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2023 || var27 > Statics.field2023 || var28 > Statics.field2023) {
                class137.field2030 = true;
            }
            if (this.field1936 != null && this.field1936[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1935 == null || this.field1935[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1935[arg0] & 0xFF;
                    var33 = this.field1939[var32];
                    var34 = this.field1940[var32];
                    var35 = this.field1941[var32];
                }
                if (this.field1932[arg0] == -1) {
                    class137.method2384(var29, var30, var31, var26, var27, var28, this.field1962[arg0], this.field1962[arg0], this.field1962[arg0], field1937[var33], field1937[var34], field1937[var35], field1963[var33], field1963[var34], field1963[var35], field1964[var33], field1964[var34], field1964[var35], this.field1936[arg0]);
                } else {
                    class137.method2384(var29, var30, var31, var26, var27, var28, field1929[0], field1929[1], field1929[2], field1937[var33], field1937[var34], field1937[var35], field1963[var33], field1963[var34], field1963[var35], field1964[var33], field1964[var34], field1964[var35], this.field1936[arg0]);
                }
            } else if (this.field1932[arg0] == -1) {
                class137.method2388(var29, var30, var31, var26, var27, var28, field1924[this.field1962[arg0]]);
            } else {
                class137.method2380(var29, var30, var31, var26, var27, var28, field1929[0], field1929[1], field1929[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2023 || var27 > Statics.field2023 || var28 > Statics.field2023 || field1987[3] < 0 || field1987[3] > Statics.field2023) {
            class137.field2030 = true;
        }
        if (this.field1936 != null && this.field1936[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1935 == null || this.field1935[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1935[arg0] & 0xFF;
                var37 = this.field1939[var36];
                var38 = this.field1940[var36];
                var39 = this.field1941[var36];
            }
            short var40 = this.field1936[arg0];
            if (this.field1932[arg0] == -1) {
                class137.method2384(var29, var30, var31, var26, var27, var28, this.field1962[arg0], this.field1962[arg0], this.field1962[arg0], field1937[var37], field1937[var38], field1937[var39], field1963[var37], field1963[var38], field1963[var39], field1964[var37], field1964[var38], field1964[var39], var40);
                class137.method2384(var29, var31, field1974[3], var26, var28, field1987[3], this.field1962[arg0], this.field1962[arg0], this.field1962[arg0], field1937[var37], field1937[var38], field1937[var39], field1963[var37], field1963[var38], field1963[var39], field1964[var37], field1964[var38], field1964[var39], var40);
            } else {
                class137.method2384(var29, var30, var31, var26, var27, var28, field1929[0], field1929[1], field1929[2], field1937[var37], field1937[var38], field1937[var39], field1963[var37], field1963[var38], field1963[var39], field1964[var37], field1964[var38], field1964[var39], var40);
                class137.method2384(var29, var31, field1974[3], var26, var28, field1987[3], field1929[0], field1929[2], field1929[3], field1937[var37], field1937[var38], field1937[var39], field1963[var37], field1963[var38], field1963[var39], field1964[var37], field1964[var38], field1964[var39], var40);
            }
        } else if (this.field1932[arg0] == -1) {
            int var41 = field1924[this.field1962[arg0]];
            class137.method2388(var29, var30, var31, var26, var27, var28, var41);
            class137.method2388(var29, var31, field1974[3], var26, var28, field1987[3], var41);
        } else {
            class137.method2380(var29, var30, var31, var26, var27, var28, field1929[0], field1929[1], field1929[2]);
            class137.method2380(var29, var31, field1974[3], var26, var28, field1987[3], field1929[0], field1929[2], field1929[3]);
        }
    }
}

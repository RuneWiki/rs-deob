package deob;

@ObfuscatedName("es")
public class class134 extends class142 {

    @ObfuscatedName("es.p")
    public static class134 field1985 = new class134();

    @ObfuscatedName("es.m")
    public static byte[] field1925 = new byte[1];

    @ObfuscatedName("es.e")
    public static class134 field1989 = new class134();

    @ObfuscatedName("es.t")
    public static byte[] field1966 = new byte[1];

    @ObfuscatedName("es.w")
    public int field1928 = 0;

    @ObfuscatedName("es.z")
    public int[] field1924;

    @ObfuscatedName("es.j")
    public int[] field1930;

    @ObfuscatedName("es.i")
    public int[] field1981;

    @ObfuscatedName("es.f")
    public int field1931 = 0;

    @ObfuscatedName("es.c")
    public int[] field1933;

    @ObfuscatedName("es.o")
    public int[] field1934;

    @ObfuscatedName("es.q")
    public int[] field1935;

    @ObfuscatedName("es.n")
    public int[] field1936;

    @ObfuscatedName("es.a")
    public int[] field1937;

    @ObfuscatedName("es.g")
    public int[] field1965;

    @ObfuscatedName("es.v")
    public byte[] field1939;

    @ObfuscatedName("es.s")
    public byte[] field1940;

    @ObfuscatedName("es.k")
    public byte[] field1975;

    @ObfuscatedName("es.r")
    public short[] field1942;

    @ObfuscatedName("es.l")
    public byte field1978 = 0;

    @ObfuscatedName("es.h")
    public int field1961 = 0;

    @ObfuscatedName("es.d")
    public int[] field1927;

    @ObfuscatedName("es.x")
    public int[] field1946;

    @ObfuscatedName("es.b")
    public int[] field1947;

    @ObfuscatedName("es.y")
    public int[][] field1948;

    @ObfuscatedName("es.u")
    public int[][] field1977;

    @ObfuscatedName("es.av")
    public boolean field1950 = false;

    @ObfuscatedName("es.ax")
    public int field1951;

    @ObfuscatedName("es.af")
    public int field1952;

    @ObfuscatedName("es.ae")
    public int field1953;

    @ObfuscatedName("es.ap")
    public int field1954;

    @ObfuscatedName("es.ak")
    public int field1955;

    @ObfuscatedName("es.al")
    public int field1956;

    @ObfuscatedName("es.ab")
    public int field1957;

    @ObfuscatedName("es.am")
    public int field1958;

    @ObfuscatedName("es.ar")
    public int field1959 = -1;

    @ObfuscatedName("es.ao")
    public int field1960 = -1;

    @ObfuscatedName("es.ac")
    public int field1929 = -1;

    @ObfuscatedName("es.ay")
    public static boolean[] field1963 = new boolean[4700];

    @ObfuscatedName("es.aj")
    public static boolean[] field1964 = new boolean[4700];

    @ObfuscatedName("es.ag")
    public static int[] field1932 = new int[4700];

    @ObfuscatedName("es.aq")
    public static int[] field1938 = new int[4700];

    @ObfuscatedName("es.as")
    public static int[] field1967 = new int[4700];

    @ObfuscatedName("es.an")
    public static int[] field1943 = new int[4700];

    @ObfuscatedName("es.az")
    public static int[] field1969 = new int[4700];

    @ObfuscatedName("es.ai")
    public static int[] field1970 = new int[4700];

    @ObfuscatedName("es.au")
    public static int[] field1972 = new int[1600];

    @ObfuscatedName("es.ah")
    public static int[][] field1973 = new int[1600][512];

    @ObfuscatedName("es.ad")
    public static int[] field1974 = new int[12];

    @ObfuscatedName("es.at")
    public static int[][] field1944 = new int[12][2000];

    @ObfuscatedName("es.bg")
    public static int[] field1976 = new int[2000];

    @ObfuscatedName("es.bf")
    public static int[] field1941 = new int[2000];

    @ObfuscatedName("es.bi")
    public static int[] field1990 = new int[12];

    @ObfuscatedName("es.bv")
    public static int[] field1949 = new int[10];

    @ObfuscatedName("es.bz")
    public static int[] field1980 = new int[10];

    @ObfuscatedName("es.ba")
    public static int[] field1979 = new int[10];

    @ObfuscatedName("es.bc")
    public static boolean field1926 = true;

    @ObfuscatedName("es.bq")
    public static int[] field1988 = class137.field2039;

    @ObfuscatedName("es.bd")
    public static int[] field1968 = class137.field2023;

    @ObfuscatedName("es.bo")
    public static int[] field1945 = class137.field2035;

    @ObfuscatedName("es.bm")
    public static int[] field1991 = class137.field2038;

    public class134() {
    }

    public class134(class134[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1928 = 0;
        this.field1931 = 0;
        this.field1961 = 0;
        this.field1978 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class134 var8 = arg0[var7];
            if (var8 != null) {
                this.field1928 += var8.field1928;
                this.field1931 += var8.field1931;
                this.field1961 += var8.field1961;
                if (var8.field1939 == null) {
                    if (this.field1978 == -1) {
                        this.field1978 = var8.field1978;
                    }
                    if (this.field1978 != var8.field1978) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1940 != null;
                var5 |= var8.field1942 != null;
                var6 |= var8.field1975 != null;
            }
        }
        this.field1924 = new int[this.field1928];
        this.field1930 = new int[this.field1928];
        this.field1981 = new int[this.field1928];
        this.field1933 = new int[this.field1931];
        this.field1934 = new int[this.field1931];
        this.field1935 = new int[this.field1931];
        this.field1936 = new int[this.field1931];
        this.field1937 = new int[this.field1931];
        this.field1965 = new int[this.field1931];
        if (var3) {
            this.field1939 = new byte[this.field1931];
        }
        if (var4) {
            this.field1940 = new byte[this.field1931];
        }
        if (var5) {
            this.field1942 = new short[this.field1931];
        }
        if (var6) {
            this.field1975 = new byte[this.field1931];
        }
        if (this.field1961 > 0) {
            this.field1927 = new int[this.field1961];
            this.field1946 = new int[this.field1961];
            this.field1947 = new int[this.field1961];
        }
        this.field1928 = 0;
        this.field1931 = 0;
        this.field1961 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class134 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1931; var11++) {
                    this.field1933[this.field1931] = var10.field1933[var11] + this.field1928;
                    this.field1934[this.field1931] = var10.field1934[var11] + this.field1928;
                    this.field1935[this.field1931] = var10.field1935[var11] + this.field1928;
                    this.field1936[this.field1931] = var10.field1936[var11];
                    this.field1937[this.field1931] = var10.field1937[var11];
                    this.field1965[this.field1931] = var10.field1965[var11];
                    if (var3) {
                        if (var10.field1939 == null) {
                            this.field1939[this.field1931] = var10.field1978;
                        } else {
                            this.field1939[this.field1931] = var10.field1939[var11];
                        }
                    }
                    if (var4 && var10.field1940 != null) {
                        this.field1940[this.field1931] = var10.field1940[var11];
                    }
                    if (var5) {
                        if (var10.field1942 == null) {
                            this.field1942[this.field1931] = -1;
                        } else {
                            this.field1942[this.field1931] = var10.field1942[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1975 == null || var10.field1975[var11] == -1) {
                            this.field1975[this.field1931] = -1;
                        } else {
                            this.field1975[this.field1931] = (byte) (var10.field1975[var11] + this.field1961);
                        }
                    }
                    this.field1931++;
                }
                for (int var12 = 0; var12 < var10.field1961; var12++) {
                    this.field1927[this.field1961] = var10.field1927[var12] + this.field1928;
                    this.field1946[this.field1961] = var10.field1946[var12] + this.field1928;
                    this.field1947[this.field1961] = var10.field1947[var12] + this.field1928;
                    this.field1961++;
                }
                for (int var13 = 0; var13 < var10.field1928; var13++) {
                    this.field1924[this.field1928] = var10.field1924[var13];
                    this.field1930[this.field1928] = var10.field1930[var13];
                    this.field1981[this.field1928] = var10.field1981[var13];
                    this.field1928++;
                }
            }
        }
    }

    @ObfuscatedName("es.p([[IIIIZI)Les;")
    public class134 method2219(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2224();
        int var7 = arg1 - this.field1953;
        int var8 = this.field1953 + arg1;
        int var9 = arg3 - this.field1953;
        int var10 = this.field1953 + arg3;
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
            var15.field1928 = this.field1928;
            var15.field1931 = this.field1931;
            var15.field1961 = this.field1961;
            var15.field1924 = this.field1924;
            var15.field1981 = this.field1981;
            var15.field1933 = this.field1933;
            var15.field1934 = this.field1934;
            var15.field1935 = this.field1935;
            var15.field1936 = this.field1936;
            var15.field1937 = this.field1937;
            var15.field1965 = this.field1965;
            var15.field1939 = this.field1939;
            var15.field1940 = this.field1940;
            var15.field1975 = this.field1975;
            var15.field1942 = this.field1942;
            var15.field1978 = this.field1978;
            var15.field1927 = this.field1927;
            var15.field1946 = this.field1946;
            var15.field1947 = this.field1947;
            var15.field1948 = this.field1948;
            var15.field1977 = this.field1977;
            var15.field1950 = this.field1950;
            var15.field1930 = new int[var15.field1928];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1928; var16++) {
                int var17 = this.field1924[var16] + arg1;
                int var18 = this.field1981[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1930[var16] = this.field1930[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1928; var26++) {
                int var27 = (-this.field1930[var26] << 16) / this.field2129;
                if (var27 < arg5) {
                    int var28 = this.field1924[var26] + arg1;
                    int var29 = this.field1981[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1930[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1930[var26];
                }
            }
        }
        var15.method2227();
        return var15;
    }

    @ObfuscatedName("es.m(Z)Les;")
    public class134 method2220(boolean arg0) {
        if (!arg0 && field1925.length < this.field1931) {
            field1925 = new byte[this.field1931 + 100];
        }
        return this.method2222(arg0, field1985, field1925);
    }

    @ObfuscatedName("es.t(Z)Les;")
    public class134 method2221(boolean arg0) {
        if (!arg0 && field1966.length < this.field1931) {
            field1966 = new byte[this.field1931 + 100];
        }
        return this.method2222(arg0, field1989, field1966);
    }

    @ObfuscatedName("es.w(ZLes;[B)Les;")
    public class134 method2222(boolean arg0, class134 arg1, byte[] arg2) {
        arg1.field1928 = this.field1928;
        arg1.field1931 = this.field1931;
        arg1.field1961 = this.field1961;
        if (arg1.field1924 == null || arg1.field1924.length < this.field1928) {
            arg1.field1924 = new int[this.field1928 + 100];
            arg1.field1930 = new int[this.field1928 + 100];
            arg1.field1981 = new int[this.field1928 + 100];
        }
        for (int var4 = 0; var4 < this.field1928; var4++) {
            arg1.field1924[var4] = this.field1924[var4];
            arg1.field1930[var4] = this.field1930[var4];
            arg1.field1981[var4] = this.field1981[var4];
        }
        if (arg0) {
            arg1.field1940 = this.field1940;
        } else {
            arg1.field1940 = arg2;
            if (this.field1940 == null) {
                for (int var5 = 0; var5 < this.field1931; var5++) {
                    arg1.field1940[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1931; var6++) {
                    arg1.field1940[var6] = this.field1940[var6];
                }
            }
        }
        arg1.field1933 = this.field1933;
        arg1.field1934 = this.field1934;
        arg1.field1935 = this.field1935;
        arg1.field1936 = this.field1936;
        arg1.field1937 = this.field1937;
        arg1.field1965 = this.field1965;
        arg1.field1939 = this.field1939;
        arg1.field1975 = this.field1975;
        arg1.field1942 = this.field1942;
        arg1.field1978 = this.field1978;
        arg1.field1927 = this.field1927;
        arg1.field1946 = this.field1946;
        arg1.field1947 = this.field1947;
        arg1.field1948 = this.field1948;
        arg1.field1977 = this.field1977;
        arg1.field1950 = this.field1950;
        arg1.method2227();
        return arg1;
    }

    @ObfuscatedName("es.z(I)V")
    public void method2223(int arg0) {
        if (this.field1959 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1968[arg0];
        int var9 = field1988[arg0];
        for (int var10 = 0; var10 < this.field1928; var10++) {
            int var11 = class137.method2337(this.field1924[var10], this.field1981[var10], var8, var9);
            int var12 = this.field1930[var10];
            int var13 = class137.method2338(this.field1924[var10], this.field1981[var10], var8, var9);
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
        this.field1956 = (var2 + var5) / 2;
        this.field1957 = (var3 + var6) / 2;
        this.field1958 = (var4 + var7) / 2;
        this.field1959 = (var5 - var2 + 1) / 2;
        this.field1960 = (var6 - var3 + 1) / 2;
        this.field1929 = (var7 - var4 + 1) / 2;
        if (this.field1959 < 32) {
            this.field1959 = 32;
        }
        if (this.field1929 < 32) {
            this.field1929 = 32;
        }
        if (this.field1950) {
            this.field1959 += 8;
            this.field1929 += 8;
        }
    }

    @ObfuscatedName("es.j()V")
    public void method2224() {
        if (this.field1951 == 1) {
            return;
        }
        this.field1951 = 1;
        this.field2129 = 0;
        this.field1952 = 0;
        this.field1953 = 0;
        for (int var1 = 0; var1 < this.field1928; var1++) {
            int var2 = this.field1924[var1];
            int var3 = this.field1930[var1];
            int var4 = this.field1981[var1];
            if (-var3 > this.field2129) {
                this.field2129 = -var3;
            }
            if (var3 > this.field1952) {
                this.field1952 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1953) {
                this.field1953 = var5;
            }
        }
        this.field1953 = (int) (Math.sqrt((double) this.field1953) + 0.99D);
        this.field1955 = (int) (Math.sqrt((double) (this.field2129 * this.field2129 + this.field1953 * this.field1953)) + 0.99D);
        this.field1954 = this.field1955 + (int) (Math.sqrt((double) (this.field1953 * this.field1953 + this.field1952 * this.field1952)) + 0.99D);
    }

    @ObfuscatedName("es.c()V")
    public void method2225() {
        if (this.field1951 == 2) {
            return;
        }
        this.field1951 = 2;
        this.field1953 = 0;
        for (int var1 = 0; var1 < this.field1928; var1++) {
            int var2 = this.field1924[var1];
            int var3 = this.field1930[var1];
            int var4 = this.field1981[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1953) {
                this.field1953 = var5;
            }
        }
        this.field1953 = (int) (Math.sqrt((double) this.field1953) + 0.99D);
        this.field1955 = this.field1953;
        this.field1954 = this.field1953 + this.field1953;
    }

    @ObfuscatedName("es.o()I")
    public int method2226() {
        this.method2224();
        return this.field1953;
    }

    @ObfuscatedName("es.q()V")
    public void method2227() {
        this.field1951 = 0;
        this.field1959 = -1;
    }

    @ObfuscatedName("es.n(Lea;I)V")
    public void method2228(class145 arg0, int arg1) {
        if (this.field1948 == null || arg1 == -1) {
            return;
        }
        class132 var3 = arg0.field2152[arg1];
        class139 var4 = var3.field1891;
        Statics.field1982 = 0;
        Statics.field1983 = 0;
        Statics.field1984 = 0;
        for (int var5 = 0; var5 < var3.field1892; var5++) {
            int var6 = var3.field1895[var5];
            this.method2230(var4.field2051[var6], var4.field2053[var6], var3.field1893[var5], var3.field1889[var5], var3.field1896[var5]);
        }
        this.method2227();
    }

    @ObfuscatedName("es.v(Lea;ILea;I[I)V")
    public void method2233(class145 arg0, int arg1, class145 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2228(arg0, arg1);
            return;
        }
        class132 var6 = arg0.field2152[arg1];
        class132 var7 = arg2.field2152[arg3];
        class139 var8 = var6.field1891;
        Statics.field1982 = 0;
        Statics.field1983 = 0;
        Statics.field1984 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1892; var11++) {
            int var12 = var6.field1895[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2051[var12] == 0) {
                this.method2230(var8.field2051[var12], var8.field2053[var12], var6.field1893[var11], var6.field1889[var11], var6.field1896[var11]);
            }
        }
        Statics.field1982 = 0;
        Statics.field1983 = 0;
        Statics.field1984 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1892; var15++) {
            int var16 = var7.field1895[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2051[var16] == 0) {
                this.method2230(var8.field2051[var16], var8.field2053[var16], var7.field1893[var15], var7.field1889[var15], var7.field1896[var15]);
            }
        }
        this.method2227();
    }

    @ObfuscatedName("es.s(I[IIII)V")
    public void method2230(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1982 = 0;
            Statics.field1983 = 0;
            Statics.field1984 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1948.length) {
                    int[] var10 = this.field1948[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1982 += this.field1924[var12];
                        Statics.field1983 += this.field1930[var12];
                        Statics.field1984 += this.field1981[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1982 = Statics.field1982 / var7 + arg2;
                Statics.field1983 = Statics.field1983 / var7 + arg3;
                Statics.field1984 = Statics.field1984 / var7 + arg4;
            } else {
                Statics.field1982 = arg2;
                Statics.field1983 = arg3;
                Statics.field1984 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1948.length) {
                    int[] var15 = this.field1948[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1924[var17] += arg2;
                        this.field1930[var17] += arg3;
                        this.field1981[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1948.length) {
                    int[] var20 = this.field1948[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1924[var22] -= Statics.field1982;
                        this.field1930[var22] -= Statics.field1983;
                        this.field1981[var22] -= Statics.field1984;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1988[var25];
                            int var27 = field1968[var25];
                            int var28 = this.field1930[var22] * var26 + this.field1924[var22] * var27 >> 16;
                            this.field1930[var22] = this.field1930[var22] * var27 - this.field1924[var22] * var26 >> 16;
                            this.field1924[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1988[var23];
                            int var30 = field1968[var23];
                            int var31 = this.field1930[var22] * var30 - this.field1981[var22] * var29 >> 16;
                            this.field1981[var22] = this.field1981[var22] * var30 + this.field1930[var22] * var29 >> 16;
                            this.field1930[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1988[var24];
                            int var33 = field1968[var24];
                            int var34 = this.field1981[var22] * var32 + this.field1924[var22] * var33 >> 16;
                            this.field1981[var22] = this.field1981[var22] * var33 - this.field1924[var22] * var32 >> 16;
                            this.field1924[var22] = var34;
                        }
                        this.field1924[var22] += Statics.field1982;
                        this.field1930[var22] += Statics.field1983;
                        this.field1981[var22] += Statics.field1984;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1948.length) {
                    int[] var37 = this.field1948[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1924[var39] -= Statics.field1982;
                        this.field1930[var39] -= Statics.field1983;
                        this.field1981[var39] -= Statics.field1984;
                        this.field1924[var39] = this.field1924[var39] * arg2 / 128;
                        this.field1930[var39] = this.field1930[var39] * arg3 / 128;
                        this.field1981[var39] = this.field1981[var39] * arg4 / 128;
                        this.field1924[var39] += Statics.field1982;
                        this.field1930[var39] += Statics.field1983;
                        this.field1981[var39] += Statics.field1984;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1977 != null && this.field1940 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1977.length) {
                    int[] var42 = this.field1977[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1940[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1940[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("es.k()V")
    public void method2254() {
        for (int var1 = 0; var1 < this.field1928; var1++) {
            int var2 = this.field1924[var1];
            this.field1924[var1] = this.field1981[var1];
            this.field1981[var1] = -var2;
        }
        this.method2227();
    }

    @ObfuscatedName("es.r()V")
    public void method2232() {
        for (int var1 = 0; var1 < this.field1928; var1++) {
            this.field1924[var1] = -this.field1924[var1];
            this.field1981[var1] = -this.field1981[var1];
        }
        this.method2227();
    }

    @ObfuscatedName("es.l()V")
    public void method2265() {
        for (int var1 = 0; var1 < this.field1928; var1++) {
            int var2 = this.field1981[var1];
            this.field1981[var1] = this.field1924[var1];
            this.field1924[var1] = -var2;
        }
        this.method2227();
    }

    @ObfuscatedName("es.d(I)V")
    public void method2234(int arg0) {
        int var2 = field1988[arg0];
        int var3 = field1968[arg0];
        for (int var4 = 0; var4 < this.field1928; var4++) {
            int var5 = this.field1930[var4] * var3 - this.field1981[var4] * var2 >> 16;
            this.field1981[var4] = this.field1981[var4] * var3 + this.field1930[var4] * var2 >> 16;
            this.field1930[var4] = var5;
        }
        this.method2227();
    }

    @ObfuscatedName("es.x(III)V")
    public void method2235(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1928; var4++) {
            this.field1924[var4] += arg0;
            this.field1930[var4] += arg1;
            this.field1981[var4] += arg2;
        }
        this.method2227();
    }

    @ObfuscatedName("es.b(III)V")
    public void method2236(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1928; var4++) {
            this.field1924[var4] = this.field1924[var4] * arg0 / 128;
            this.field1930[var4] = this.field1930[var4] * arg1 / 128;
            this.field1981[var4] = this.field1981[var4] * arg2 / 128;
        }
        this.method2227();
    }

    @ObfuscatedName("es.y(IIIIIII)V")
    public final void method2267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1972[0] = -1;
        if (this.field1951 != 2 && this.field1951 != 1) {
            this.method2225();
        }
        int var8 = Statics.field2026;
        int var9 = Statics.field2027;
        int var10 = field1988[arg0];
        int var11 = field1968[arg0];
        int var12 = field1988[arg1];
        int var13 = field1968[arg1];
        int var14 = field1988[arg2];
        int var15 = field1968[arg2];
        int var16 = field1988[arg3];
        int var17 = field1968[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1928; var19++) {
            int var20 = this.field1924[var19];
            int var21 = this.field1930[var19];
            int var22 = this.field1981[var19];
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
            field1967[var19] = var30 - var18;
            field1932[var19] = class137.field2025 * var26 / var30 + var8;
            field1938[var19] = class137.field2025 * var29 / var30 + var9;
            if (this.field1961 > 0) {
                field1943[var19] = var26;
                field1969[var19] = var29;
                field1970[var19] = var30;
            }
        }
        try {
            this.method2240(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("es.u(IIIIIIII)V")
    public final void method2238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1972[0] = -1;
        if (this.field1951 != 2 && this.field1951 != 1) {
            this.method2225();
        }
        int var9 = Statics.field2026;
        int var10 = Statics.field2027;
        int var11 = field1988[arg0];
        int var12 = field1968[arg0];
        int var13 = field1988[arg1];
        int var14 = field1968[arg1];
        int var15 = field1988[arg2];
        int var16 = field1968[arg2];
        int var17 = field1988[arg3];
        int var18 = field1968[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1928; var20++) {
            int var21 = this.field1924[var20];
            int var22 = this.field1930[var20];
            int var23 = this.field1981[var20];
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
            field1967[var20] = var31 - var19;
            field1932[var20] = class137.field2025 * var27 / arg7 + var9;
            field1938[var20] = class137.field2025 * var30 / arg7 + var10;
            if (this.field1961 > 0) {
                field1943[var20] = var27;
                field1969[var20] = var30;
                field1970[var20] = var31;
            }
        }
        try {
            this.method2240(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("es.bj(IIIIIIIII)V")
    public void method2239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1972[0] = -1;
        if (this.field1951 != 1) {
            this.method2224();
        }
        this.method2223(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1953 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1953) * class137.field2025;
        if (var15 / var13 >= Statics.field2031) {
            return;
        }
        int var16 = (this.field1953 + var14) * class137.field2025;
        if (var16 / var13 <= Statics.field2030) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1953 * arg1 >> 16;
        int var19 = (var17 + var18) * class137.field2025;
        if (var19 / var13 <= Statics.field2028) {
            return;
        }
        int var20 = (this.field2129 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class137.field2025;
        if (var21 / var13 >= Statics.field2033) {
            return;
        }
        int var22 = (this.field2129 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1961 > 0;
        int var26 = class135.field1995;
        int var28 = class135.field1996;
        boolean var30 = class135.method4108();
        if (class8.field239 && arg8 > 0) {
            if (class135.method3700(this, arg5, arg6, arg7)) {
                class8.field238.method3206(new class11(this, arg5, arg6, arg7, -65281));
            } else if (class8.field234 == class12.field271) {
                class8.field238.method3206(new class11(this, arg5, arg6, arg7, -16776961));
            }
        }
        if (class8.field235 && arg8 > 0) {
            int var32 = var11 - var12;
            if (var32 <= 50) {
                var32 = 50;
            }
            int var37;
            int var38;
            if (var14 > 0) {
                var37 = var15 / var13;
                var38 = var16 / var32;
            } else {
                var38 = var16 / var13;
                var37 = var15 / var32;
            }
            int var39;
            int var40;
            if (var17 > 0) {
                var39 = var21 / var13;
                var40 = var19 / var32;
            } else {
                var40 = var19 / var13;
                var39 = var21 / var32;
            }
            int var41 = -8355840;
            int var42 = var26 - Statics.field2026;
            int var43 = var28 - Statics.field2027;
            if (var42 > var37 && var42 < var38 && var43 > var39 && var43 < var40) {
                var41 = -256;
            }
            Statics.method4415(Statics.field2026 + var37, Statics.field2027 + var39, Statics.field2026 + var38, Statics.field2027 + var40, var41);
        }
        boolean var44 = false;
        if (arg8 > 0 && var30) {
            boolean var45 = false;
            if (field1926) {
                var45 = class135.method3700(this, arg5, arg6, arg7);
            } else {
                int var46 = var11 - var12;
                if (var46 <= 50) {
                    var46 = 50;
                }
                int var47;
                int var48;
                if (var14 > 0) {
                    var47 = var15 / var13;
                    var48 = var16 / var46;
                } else {
                    var48 = var16 / var13;
                    var47 = var15 / var46;
                }
                int var49;
                int var50;
                if (var17 > 0) {
                    var49 = var21 / var13;
                    var50 = var19 / var46;
                } else {
                    var50 = var19 / var13;
                    var49 = var21 / var46;
                }
                int var51 = var26 - Statics.field2026;
                int var52 = var28 - Statics.field2027;
                if (var51 > var47 && var51 < var48 && var52 > var49 && var52 < var50) {
                    var45 = true;
                }
            }
            if (var45) {
                if (this.field1950) {
                    class135.method2105(arg8);
                } else {
                    var44 = true;
                }
            }
        }
        int var53 = Statics.field2026;
        int var54 = Statics.field2027;
        int var55 = 0;
        int var56 = 0;
        if (arg0 != 0) {
            var55 = field1988[arg0];
            var56 = field1968[arg0];
        }
        for (int var57 = 0; var57 < this.field1928; var57++) {
            int var58 = this.field1924[var57];
            int var59 = this.field1930[var57];
            int var60 = this.field1981[var57];
            if (arg0 != 0) {
                int var61 = var55 * var60 + var56 * var58 >> 16;
                var60 = var56 * var60 - var55 * var58 >> 16;
                var58 = var61;
            }
            int var62 = arg5 + var58;
            int var63 = arg6 + var59;
            int var64 = arg7 + var60;
            int var65 = arg3 * var64 + arg4 * var62 >> 16;
            int var66 = arg4 * var64 - arg3 * var62 >> 16;
            int var68 = arg2 * var63 - arg1 * var66 >> 16;
            int var69 = arg1 * var63 + arg2 * var66 >> 16;
            field1967[var57] = var69 - var11;
            if (var69 >= 50) {
                field1932[var57] = class137.field2025 * var65 / var69 + var53;
                field1938[var57] = class137.field2025 * var68 / var69 + var54;
            } else {
                field1932[var57] = -5000;
                var23 = true;
            }
            if (var25) {
                field1943[var57] = var65;
                field1969[var57] = var68;
                field1970[var57] = var69;
            }
        }
        try {
            this.method2240(var23, var44, this.field1950, arg8);
        } catch (Exception var72) {
        }
    }

    @ObfuscatedName("es.av(ZZZI)V")
    public final void method2240(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1954 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1954; var5++) {
            field1972[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field236 && arg1) {
            class8.method662(this, var6);
        }
        for (int var7 = 0; var7 < this.field1931; var7++) {
            if (this.field1965[var7] != -2) {
                int var8 = this.field1933[var7];
                int var9 = this.field1934[var7];
                int var10 = this.field1935[var7];
                int var11 = field1932[var8];
                int var12 = field1932[var9];
                int var13 = field1932[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1943[var8];
                    int var15 = field1943[var9];
                    int var16 = field1943[var10];
                    int var17 = field1969[var8];
                    int var18 = field1969[var9];
                    int var19 = field1969[var10];
                    int var20 = field1970[var8];
                    int var21 = field1970[var9];
                    int var22 = field1970[var10];
                    int var23 = var14 - var15;
                    int var24 = var16 - var15;
                    int var25 = var17 - var18;
                    int var26 = var19 - var18;
                    int var27 = var20 - var21;
                    int var28 = var22 - var21;
                    int var29 = var25 * var28 - var26 * var27;
                    int var30 = var24 * var27 - var23 * var28;
                    int var31 = var23 * var26 - var24 * var25;
                    if (var21 * var31 + var15 * var29 + var18 * var30 > 0) {
                        field1964[var7] = true;
                        int var32 = (field1967[var8] + field1967[var9] + field1967[var10]) / 3 + this.field1955;
                        field1973[var32][field1972[var32]++] = var7;
                    }
                } else {
                    if (arg1 && class135.method1343(field1938[var8], field1938[var9], field1938[var10], var11, var12, var13, var6)) {
                        class135.method2105(arg3);
                        arg1 = false;
                    }
                    if ((field1938[var10] - field1938[var9]) * (var11 - var12) - (field1938[var8] - field1938[var9]) * (var13 - var12) > 0) {
                        field1964[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field2019 && var12 <= Statics.field2019 && var13 <= Statics.field2019) {
                            field1963[var7] = false;
                        } else {
                            field1963[var7] = true;
                        }
                        int var33 = (field1967[var8] + field1967[var9] + field1967[var10]) / 3 + this.field1955;
                        field1973[var33][field1972[var33]++] = var7;
                    }
                }
            }
        }
        if (this.field1939 == null) {
            for (int var34 = this.field1954 - 1; var34 >= 0; var34--) {
                int var35 = field1972[var34];
                if (var35 > 0) {
                    int[] var36 = field1973[var34];
                    for (int var37 = 0; var37 < var35; var37++) {
                        this.method2241(var36[var37]);
                    }
                }
            }
            return;
        }
        for (int var38 = 0; var38 < 12; var38++) {
            field1974[var38] = 0;
            field1990[var38] = 0;
        }
        for (int var39 = this.field1954 - 1; var39 >= 0; var39--) {
            int var40 = field1972[var39];
            if (var40 > 0) {
                int[] var41 = field1973[var39];
                for (int var42 = 0; var42 < var40; var42++) {
                    int var43 = var41[var42];
                    byte var44 = this.field1939[var43];
                    int var45 = field1974[var44]++;
                    field1944[var44][var45] = var43;
                    if (var44 < 10) {
                        field1990[var44] += var39;
                    } else if (var44 == 10) {
                        field1976[var45] = var39;
                    } else {
                        field1941[var45] = var39;
                    }
                }
            }
        }
        int var46 = 0;
        if (field1974[1] > 0 || field1974[2] > 0) {
            var46 = (field1990[1] + field1990[2]) / (field1974[1] + field1974[2]);
        }
        int var47 = 0;
        if (field1974[3] > 0 || field1974[4] > 0) {
            var47 = (field1990[3] + field1990[4]) / (field1974[3] + field1974[4]);
        }
        int var48 = 0;
        if (field1974[6] > 0 || field1974[8] > 0) {
            var48 = (field1990[6] + field1990[8]) / (field1974[6] + field1974[8]);
        }
        int var49 = 0;
        int var50 = field1974[10];
        int[] var51 = field1944[10];
        int[] var52 = field1976;
        if (var49 == var50) {
            var49 = 0;
            var50 = field1974[11];
            var51 = field1944[11];
            var52 = field1941;
        }
        int var53;
        if (var49 < var50) {
            var53 = var52[var49];
        } else {
            var53 = -1000;
        }
        for (int var54 = 0; var54 < 10; var54++) {
            while (var54 == 0 && var53 > var46) {
                this.method2241(var51[var49++]);
                if (var49 == var50 && field1944[11] != var51) {
                    var49 = 0;
                    var50 = field1974[11];
                    var51 = field1944[11];
                    var52 = field1941;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            while (var54 == 3 && var53 > var47) {
                this.method2241(var51[var49++]);
                if (var49 == var50 && field1944[11] != var51) {
                    var49 = 0;
                    var50 = field1974[11];
                    var51 = field1944[11];
                    var52 = field1941;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            while (var54 == 5 && var53 > var48) {
                this.method2241(var51[var49++]);
                if (var49 == var50 && field1944[11] != var51) {
                    var49 = 0;
                    var50 = field1974[11];
                    var51 = field1944[11];
                    var52 = field1941;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            int var55 = field1974[var54];
            int[] var56 = field1944[var54];
            for (int var57 = 0; var57 < var55; var57++) {
                this.method2241(var56[var57]);
            }
        }
        while (var53 != -1000) {
            this.method2241(var51[var49++]);
            if (var49 == var50 && field1944[11] != var51) {
                var49 = 0;
                var51 = field1944[11];
                var50 = field1974[11];
                var52 = field1941;
            }
            if (var49 < var50) {
                var53 = var52[var49];
            } else {
                var53 = -1000;
            }
        }
    }

    @ObfuscatedName("es.ax(I)V")
    public final void method2241(int arg0) {
        if (field1964[arg0]) {
            this.method2283(arg0);
            return;
        }
        int var2 = this.field1933[arg0];
        int var3 = this.field1934[arg0];
        int var4 = this.field1935[arg0];
        class137.field2036 = field1963[arg0];
        if (this.field1940 == null) {
            class137.field2014 = 0;
        } else {
            class137.field2014 = this.field1940[arg0] & 0xFF;
        }
        if (this.field1942 != null && this.field1942[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1975 == null || this.field1975[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1975[arg0] & 0xFF;
                var6 = this.field1927[var5];
                var7 = this.field1946[var5];
                var8 = this.field1947[var5];
            }
            if (this.field1965[arg0] == -1) {
                class137.method2333(field1938[var2], field1938[var3], field1938[var4], field1932[var2], field1932[var3], field1932[var4], this.field1936[arg0], this.field1936[arg0], this.field1936[arg0], field1943[var6], field1943[var7], field1943[var8], field1969[var6], field1969[var7], field1969[var8], field1970[var6], field1970[var7], field1970[var8], this.field1942[arg0]);
            } else {
                class137.method2333(field1938[var2], field1938[var3], field1938[var4], field1932[var2], field1932[var3], field1932[var4], this.field1936[arg0], this.field1937[arg0], this.field1965[arg0], field1943[var6], field1943[var7], field1943[var8], field1969[var6], field1969[var7], field1969[var8], field1970[var6], field1970[var7], field1970[var8], this.field1942[arg0]);
            }
        } else if (this.field1965[arg0] == -1) {
            class137.method2368(field1938[var2], field1938[var3], field1938[var4], field1932[var2], field1932[var3], field1932[var4], field1945[this.field1936[arg0]]);
        } else {
            class137.method2329(field1938[var2], field1938[var3], field1938[var4], field1932[var2], field1932[var3], field1932[var4], this.field1936[arg0], this.field1937[arg0], this.field1965[arg0]);
        }
    }

    @ObfuscatedName("es.af(I)V")
    public final void method2283(int arg0) {
        int var2 = Statics.field2026;
        int var3 = Statics.field2027;
        int var4 = 0;
        int var5 = this.field1933[arg0];
        int var6 = this.field1934[arg0];
        int var7 = this.field1935[arg0];
        int var8 = field1970[var5];
        int var9 = field1970[var6];
        int var10 = field1970[var7];
        if (this.field1940 == null) {
            class137.field2014 = 0;
        } else {
            class137.field2014 = this.field1940[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1949[var4] = field1932[var5];
            field1980[var4] = field1938[var5];
            field1979[var4++] = this.field1936[arg0];
        } else {
            int var11 = field1943[var5];
            int var12 = field1969[var5];
            int var13 = this.field1936[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1991[var10 - var8];
                field1949[var4] = (((field1943[var7] - var11) * var14 >> 16) + var11) * class137.field2025 / 50 + var2;
                field1980[var4] = (((field1969[var7] - var12) * var14 >> 16) + var12) * class137.field2025 / 50 + var3;
                field1979[var4++] = ((this.field1965[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1991[var9 - var8];
                field1949[var4] = (((field1943[var6] - var11) * var15 >> 16) + var11) * class137.field2025 / 50 + var2;
                field1980[var4] = (((field1969[var6] - var12) * var15 >> 16) + var12) * class137.field2025 / 50 + var3;
                field1979[var4++] = ((this.field1937[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1949[var4] = field1932[var6];
            field1980[var4] = field1938[var6];
            field1979[var4++] = this.field1937[arg0];
        } else {
            int var16 = field1943[var6];
            int var17 = field1969[var6];
            int var18 = this.field1937[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1991[var8 - var9];
                field1949[var4] = (((field1943[var5] - var16) * var19 >> 16) + var16) * class137.field2025 / 50 + var2;
                field1980[var4] = (((field1969[var5] - var17) * var19 >> 16) + var17) * class137.field2025 / 50 + var3;
                field1979[var4++] = ((this.field1936[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1991[var10 - var9];
                field1949[var4] = (((field1943[var7] - var16) * var20 >> 16) + var16) * class137.field2025 / 50 + var2;
                field1980[var4] = (((field1969[var7] - var17) * var20 >> 16) + var17) * class137.field2025 / 50 + var3;
                field1979[var4++] = ((this.field1965[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1949[var4] = field1932[var7];
            field1980[var4] = field1938[var7];
            field1979[var4++] = this.field1965[arg0];
        } else {
            int var21 = field1943[var7];
            int var22 = field1969[var7];
            int var23 = this.field1965[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1991[var9 - var10];
                field1949[var4] = (((field1943[var6] - var21) * var24 >> 16) + var21) * class137.field2025 / 50 + var2;
                field1980[var4] = (((field1969[var6] - var22) * var24 >> 16) + var22) * class137.field2025 / 50 + var3;
                field1979[var4++] = ((this.field1937[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1991[var8 - var10];
                field1949[var4] = (((field1943[var5] - var21) * var25 >> 16) + var21) * class137.field2025 / 50 + var2;
                field1980[var4] = (((field1969[var5] - var22) * var25 >> 16) + var22) * class137.field2025 / 50 + var3;
                field1979[var4++] = ((this.field1936[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1949[0];
        int var27 = field1949[1];
        int var28 = field1949[2];
        int var29 = field1980[0];
        int var30 = field1980[1];
        int var31 = field1980[2];
        class137.field2036 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2019 || var27 > Statics.field2019 || var28 > Statics.field2019) {
                class137.field2036 = true;
            }
            if (this.field1942 != null && this.field1942[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1975 == null || this.field1975[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1975[arg0] & 0xFF;
                    var33 = this.field1927[var32];
                    var34 = this.field1946[var32];
                    var35 = this.field1947[var32];
                }
                if (this.field1965[arg0] == -1) {
                    class137.method2333(var29, var30, var31, var26, var27, var28, this.field1936[arg0], this.field1936[arg0], this.field1936[arg0], field1943[var33], field1943[var34], field1943[var35], field1969[var33], field1969[var34], field1969[var35], field1970[var33], field1970[var34], field1970[var35], this.field1942[arg0]);
                } else {
                    class137.method2333(var29, var30, var31, var26, var27, var28, field1979[0], field1979[1], field1979[2], field1943[var33], field1943[var34], field1943[var35], field1969[var33], field1969[var34], field1969[var35], field1970[var33], field1970[var34], field1970[var35], this.field1942[arg0]);
                }
            } else if (this.field1965[arg0] == -1) {
                class137.method2368(var29, var30, var31, var26, var27, var28, field1945[this.field1936[arg0]]);
            } else {
                class137.method2329(var29, var30, var31, var26, var27, var28, field1979[0], field1979[1], field1979[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2019 || var27 > Statics.field2019 || var28 > Statics.field2019 || field1949[3] < 0 || field1949[3] > Statics.field2019) {
            class137.field2036 = true;
        }
        if (this.field1942 != null && this.field1942[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1975 == null || this.field1975[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1975[arg0] & 0xFF;
                var37 = this.field1927[var36];
                var38 = this.field1946[var36];
                var39 = this.field1947[var36];
            }
            short var40 = this.field1942[arg0];
            if (this.field1965[arg0] == -1) {
                class137.method2333(var29, var30, var31, var26, var27, var28, this.field1936[arg0], this.field1936[arg0], this.field1936[arg0], field1943[var37], field1943[var38], field1943[var39], field1969[var37], field1969[var38], field1969[var39], field1970[var37], field1970[var38], field1970[var39], var40);
                class137.method2333(var29, var31, field1980[3], var26, var28, field1949[3], this.field1936[arg0], this.field1936[arg0], this.field1936[arg0], field1943[var37], field1943[var38], field1943[var39], field1969[var37], field1969[var38], field1969[var39], field1970[var37], field1970[var38], field1970[var39], var40);
            } else {
                class137.method2333(var29, var30, var31, var26, var27, var28, field1979[0], field1979[1], field1979[2], field1943[var37], field1943[var38], field1943[var39], field1969[var37], field1969[var38], field1969[var39], field1970[var37], field1970[var38], field1970[var39], var40);
                class137.method2333(var29, var31, field1980[3], var26, var28, field1949[3], field1979[0], field1979[2], field1979[3], field1943[var37], field1943[var38], field1943[var39], field1969[var37], field1969[var38], field1969[var39], field1970[var37], field1970[var38], field1970[var39], var40);
            }
        } else if (this.field1965[arg0] == -1) {
            int var41 = field1945[this.field1936[arg0]];
            class137.method2368(var29, var30, var31, var26, var27, var28, var41);
            class137.method2368(var29, var31, field1980[3], var26, var28, field1949[3], var41);
        } else {
            class137.method2329(var29, var30, var31, var26, var27, var28, field1979[0], field1979[1], field1979[2]);
            class137.method2329(var29, var31, field1980[3], var26, var28, field1949[3], field1979[0], field1979[2], field1979[3]);
        }
    }
}

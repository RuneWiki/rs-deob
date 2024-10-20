package deob;

@ObfuscatedName("eo")
public class class134 extends class142 {

    @ObfuscatedName("eo.e")
    public static class134 field1958 = new class134();

    @ObfuscatedName("eo.o")
    public static byte[] field1944 = new byte[1];

    @ObfuscatedName("eo.m")
    public static class134 field1967 = new class134();

    @ObfuscatedName("eo.g")
    public static byte[] field1942 = new byte[1];

    @ObfuscatedName("eo.d")
    public int field1974 = 0;

    @ObfuscatedName("eo.b")
    public int[] field1924;

    @ObfuscatedName("eo.k")
    public int[] field1925;

    @ObfuscatedName("eo.f")
    public int[] field1940;

    @ObfuscatedName("eo.j")
    public int field1927 = 0;

    @ObfuscatedName("eo.q")
    public int[] field1934;

    @ObfuscatedName("eo.h")
    public int[] field1929;

    @ObfuscatedName("eo.i")
    public int[] field1930;

    @ObfuscatedName("eo.s")
    public int[] field1931;

    @ObfuscatedName("eo.n")
    public int[] field1988;

    @ObfuscatedName("eo.c")
    public int[] field1933;

    @ObfuscatedName("eo.v")
    public byte[] field1962;

    @ObfuscatedName("eo.u")
    public byte[] field1980;

    @ObfuscatedName("eo.w")
    public byte[] field1936;

    @ObfuscatedName("eo.z")
    public short[] field1937;

    @ObfuscatedName("eo.y")
    public byte field1938 = 0;

    @ObfuscatedName("eo.p")
    public int field1939 = 0;

    @ObfuscatedName("eo.l")
    public int[] field1955;

    @ObfuscatedName("eo.x")
    public int[] field1941;

    @ObfuscatedName("eo.r")
    public int[] field1950;

    @ObfuscatedName("eo.t")
    public int[][] field1943;

    @ObfuscatedName("eo.a")
    public int[][] field1979;

    @ObfuscatedName("eo.ad")
    public boolean field1945 = false;

    @ObfuscatedName("eo.ay")
    public int field1946;

    @ObfuscatedName("eo.am")
    public int field1956;

    @ObfuscatedName("eo.ae")
    public int field1948;

    @ObfuscatedName("eo.az")
    public int field1949;

    @ObfuscatedName("eo.ar")
    public int field1961;

    @ObfuscatedName("eo.ai")
    public int field1951;

    @ObfuscatedName("eo.ap")
    public int field1952;

    @ObfuscatedName("eo.al")
    public int field1953;

    @ObfuscatedName("eo.aw")
    public int field1954 = -1;

    @ObfuscatedName("eo.ak")
    public int field1920 = -1;

    @ObfuscatedName("eo.ax")
    public int field1986 = -1;

    @ObfuscatedName("eo.ao")
    public static boolean[] field1972 = new boolean[4700];

    @ObfuscatedName("eo.aq")
    public static boolean[] field1959 = new boolean[4700];

    @ObfuscatedName("eo.ab")
    public static int[] field1960 = new int[4700];

    @ObfuscatedName("eo.as")
    public static int[] field1935 = new int[4700];

    @ObfuscatedName("eo.av")
    public static int[] field1923 = new int[4700];

    @ObfuscatedName("eo.ac")
    public static int[] field1963 = new int[4700];

    @ObfuscatedName("eo.ag")
    public static int[] field1947 = new int[4700];

    @ObfuscatedName("eo.au")
    public static int[] field1965 = new int[4700];

    @ObfuscatedName("eo.an")
    public static int[] field1919 = new int[1600];

    @ObfuscatedName("eo.aj")
    public static int[][] field1968 = new int[1600][512];

    @ObfuscatedName("eo.af")
    public static int[] field1969 = new int[12];

    @ObfuscatedName("eo.ah")
    public static int[][] field1970 = new int[12][2000];

    @ObfuscatedName("eo.bz")
    public static int[] field1971 = new int[2000];

    @ObfuscatedName("eo.bo")
    public static int[] field1926 = new int[2000];

    @ObfuscatedName("eo.bp")
    public static int[] field1973 = new int[12];

    @ObfuscatedName("eo.bh")
    public static int[] field1964 = new int[10];

    @ObfuscatedName("eo.bs")
    public static int[] field1975 = new int[10];

    @ObfuscatedName("eo.bq")
    public static int[] field1976 = new int[10];

    @ObfuscatedName("eo.bb")
    public static boolean field1921 = true;

    @ObfuscatedName("eo.bt")
    public static int[] field1983 = class137.field2034;

    @ObfuscatedName("eo.bw")
    public static int[] field1984 = class137.field2035;

    @ObfuscatedName("eo.bc")
    public static int[] field1985 = class137.field2030;

    @ObfuscatedName("eo.by")
    public static int[] field1932 = class137.field2033;

    public class134() {
    }

    public class134(class134[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1974 = 0;
        this.field1927 = 0;
        this.field1939 = 0;
        this.field1938 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class134 var8 = arg0[var7];
            if (var8 != null) {
                this.field1974 += var8.field1974;
                this.field1927 += var8.field1927;
                this.field1939 += var8.field1939;
                if (var8.field1962 == null) {
                    if (this.field1938 == -1) {
                        this.field1938 = var8.field1938;
                    }
                    if (this.field1938 != var8.field1938) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1980 != null;
                var5 |= var8.field1937 != null;
                var6 |= var8.field1936 != null;
            }
        }
        this.field1924 = new int[this.field1974];
        this.field1925 = new int[this.field1974];
        this.field1940 = new int[this.field1974];
        this.field1934 = new int[this.field1927];
        this.field1929 = new int[this.field1927];
        this.field1930 = new int[this.field1927];
        this.field1931 = new int[this.field1927];
        this.field1988 = new int[this.field1927];
        this.field1933 = new int[this.field1927];
        if (var3) {
            this.field1962 = new byte[this.field1927];
        }
        if (var4) {
            this.field1980 = new byte[this.field1927];
        }
        if (var5) {
            this.field1937 = new short[this.field1927];
        }
        if (var6) {
            this.field1936 = new byte[this.field1927];
        }
        if (this.field1939 > 0) {
            this.field1955 = new int[this.field1939];
            this.field1941 = new int[this.field1939];
            this.field1950 = new int[this.field1939];
        }
        this.field1974 = 0;
        this.field1927 = 0;
        this.field1939 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class134 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1927; var11++) {
                    this.field1934[this.field1927] = var10.field1934[var11] + this.field1974;
                    this.field1929[this.field1927] = var10.field1929[var11] + this.field1974;
                    this.field1930[this.field1927] = var10.field1930[var11] + this.field1974;
                    this.field1931[this.field1927] = var10.field1931[var11];
                    this.field1988[this.field1927] = var10.field1988[var11];
                    this.field1933[this.field1927] = var10.field1933[var11];
                    if (var3) {
                        if (var10.field1962 == null) {
                            this.field1962[this.field1927] = var10.field1938;
                        } else {
                            this.field1962[this.field1927] = var10.field1962[var11];
                        }
                    }
                    if (var4 && var10.field1980 != null) {
                        this.field1980[this.field1927] = var10.field1980[var11];
                    }
                    if (var5) {
                        if (var10.field1937 == null) {
                            this.field1937[this.field1927] = -1;
                        } else {
                            this.field1937[this.field1927] = var10.field1937[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1936 == null || var10.field1936[var11] == -1) {
                            this.field1936[this.field1927] = -1;
                        } else {
                            this.field1936[this.field1927] = (byte) (var10.field1936[var11] + this.field1939);
                        }
                    }
                    this.field1927++;
                }
                for (int var12 = 0; var12 < var10.field1939; var12++) {
                    this.field1955[this.field1939] = var10.field1955[var12] + this.field1974;
                    this.field1941[this.field1939] = var10.field1941[var12] + this.field1974;
                    this.field1950[this.field1939] = var10.field1950[var12] + this.field1974;
                    this.field1939++;
                }
                for (int var13 = 0; var13 < var10.field1974; var13++) {
                    this.field1924[this.field1974] = var10.field1924[var13];
                    this.field1925[this.field1974] = var10.field1925[var13];
                    this.field1940[this.field1974] = var10.field1940[var13];
                    this.field1974++;
                }
            }
        }
    }

    @ObfuscatedName("eo.e([[IIIIZI)Leo;")
    public class134 method2276(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2281();
        int var7 = arg1 - this.field1948;
        int var8 = this.field1948 + arg1;
        int var9 = arg3 - this.field1948;
        int var10 = this.field1948 + arg3;
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
            var15.field1974 = this.field1974;
            var15.field1927 = this.field1927;
            var15.field1939 = this.field1939;
            var15.field1924 = this.field1924;
            var15.field1940 = this.field1940;
            var15.field1934 = this.field1934;
            var15.field1929 = this.field1929;
            var15.field1930 = this.field1930;
            var15.field1931 = this.field1931;
            var15.field1988 = this.field1988;
            var15.field1933 = this.field1933;
            var15.field1962 = this.field1962;
            var15.field1980 = this.field1980;
            var15.field1936 = this.field1936;
            var15.field1937 = this.field1937;
            var15.field1938 = this.field1938;
            var15.field1955 = this.field1955;
            var15.field1941 = this.field1941;
            var15.field1950 = this.field1950;
            var15.field1943 = this.field1943;
            var15.field1979 = this.field1979;
            var15.field1945 = this.field1945;
            var15.field1925 = new int[var15.field1974];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1974; var16++) {
                int var17 = this.field1924[var16] + arg1;
                int var18 = this.field1940[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1925[var16] = this.field1925[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1974; var26++) {
                int var27 = (-this.field1925[var26] << 16) / this.field2121;
                if (var27 < arg5) {
                    int var28 = this.field1924[var26] + arg1;
                    int var29 = this.field1940[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1925[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1925[var26];
                }
            }
        }
        var15.method2275();
        return var15;
    }

    @ObfuscatedName("eo.o(Z)Leo;")
    public class134 method2277(boolean arg0) {
        if (!arg0 && field1944.length < this.field1927) {
            field1944 = new byte[this.field1927 + 100];
        }
        return this.method2279(arg0, field1958, field1944);
    }

    @ObfuscatedName("eo.g(Z)Leo;")
    public class134 method2314(boolean arg0) {
        if (!arg0 && field1942.length < this.field1927) {
            field1942 = new byte[this.field1927 + 100];
        }
        return this.method2279(arg0, field1967, field1942);
    }

    @ObfuscatedName("eo.d(ZLeo;[B)Leo;")
    public class134 method2279(boolean arg0, class134 arg1, byte[] arg2) {
        arg1.field1974 = this.field1974;
        arg1.field1927 = this.field1927;
        arg1.field1939 = this.field1939;
        if (arg1.field1924 == null || arg1.field1924.length < this.field1974) {
            arg1.field1924 = new int[this.field1974 + 100];
            arg1.field1925 = new int[this.field1974 + 100];
            arg1.field1940 = new int[this.field1974 + 100];
        }
        for (int var4 = 0; var4 < this.field1974; var4++) {
            arg1.field1924[var4] = this.field1924[var4];
            arg1.field1925[var4] = this.field1925[var4];
            arg1.field1940[var4] = this.field1940[var4];
        }
        if (arg0) {
            arg1.field1980 = this.field1980;
        } else {
            arg1.field1980 = arg2;
            if (this.field1980 == null) {
                for (int var5 = 0; var5 < this.field1927; var5++) {
                    arg1.field1980[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1927; var6++) {
                    arg1.field1980[var6] = this.field1980[var6];
                }
            }
        }
        arg1.field1934 = this.field1934;
        arg1.field1929 = this.field1929;
        arg1.field1930 = this.field1930;
        arg1.field1931 = this.field1931;
        arg1.field1988 = this.field1988;
        arg1.field1933 = this.field1933;
        arg1.field1962 = this.field1962;
        arg1.field1936 = this.field1936;
        arg1.field1937 = this.field1937;
        arg1.field1938 = this.field1938;
        arg1.field1955 = this.field1955;
        arg1.field1941 = this.field1941;
        arg1.field1950 = this.field1950;
        arg1.field1943 = this.field1943;
        arg1.field1979 = this.field1979;
        arg1.field1945 = this.field1945;
        arg1.method2275();
        return arg1;
    }

    @ObfuscatedName("eo.b(I)V")
    public void method2280(int arg0) {
        if (this.field1954 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1984[arg0];
        int var9 = field1983[arg0];
        for (int var10 = 0; var10 < this.field1974; var10++) {
            int var11 = class137.method2399(this.field1924[var10], this.field1940[var10], var8, var9);
            int var12 = this.field1925[var10];
            int var13 = class137.method2400(this.field1924[var10], this.field1940[var10], var8, var9);
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
        this.field1951 = (var2 + var5) / 2;
        this.field1952 = (var3 + var6) / 2;
        this.field1953 = (var4 + var7) / 2;
        this.field1954 = (var5 - var2 + 1) / 2;
        this.field1920 = (var6 - var3 + 1) / 2;
        this.field1986 = (var7 - var4 + 1) / 2;
    }

    @ObfuscatedName("eo.k()V")
    public void method2281() {
        if (this.field1946 == 1) {
            return;
        }
        this.field1946 = 1;
        this.field2121 = 0;
        this.field1956 = 0;
        this.field1948 = 0;
        for (int var1 = 0; var1 < this.field1974; var1++) {
            int var2 = this.field1924[var1];
            int var3 = this.field1925[var1];
            int var4 = this.field1940[var1];
            if (-var3 > this.field2121) {
                this.field2121 = -var3;
            }
            if (var3 > this.field1956) {
                this.field1956 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1948) {
                this.field1948 = var5;
            }
        }
        this.field1948 = (int) (Math.sqrt((double) this.field1948) + 0.99D);
        this.field1961 = (int) (Math.sqrt((double) (this.field2121 * this.field2121 + this.field1948 * this.field1948)) + 0.99D);
        this.field1949 = this.field1961 + (int) (Math.sqrt((double) (this.field1956 * this.field1956 + this.field1948 * this.field1948)) + 0.99D);
    }

    @ObfuscatedName("eo.q()V")
    public void method2282() {
        if (this.field1946 == 2) {
            return;
        }
        this.field1946 = 2;
        this.field1948 = 0;
        for (int var1 = 0; var1 < this.field1974; var1++) {
            int var2 = this.field1924[var1];
            int var3 = this.field1925[var1];
            int var4 = this.field1940[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1948) {
                this.field1948 = var5;
            }
        }
        this.field1948 = (int) (Math.sqrt((double) this.field1948) + 0.99D);
        this.field1961 = this.field1948;
        this.field1949 = this.field1948 + this.field1948;
    }

    @ObfuscatedName("eo.h()I")
    public int method2283() {
        this.method2281();
        return this.field1948;
    }

    @ObfuscatedName("eo.i()V")
    public void method2275() {
        this.field1946 = 0;
        this.field1954 = -1;
    }

    @ObfuscatedName("eo.s(Leh;I)V")
    public void method2285(class145 arg0, int arg1) {
        if (this.field1943 == null || arg1 == -1) {
            return;
        }
        class132 var3 = arg0.field2138[arg1];
        class139 var4 = var3.field1886;
        Statics.field1977 = 0;
        Statics.field1978 = 0;
        Statics.field1922 = 0;
        for (int var5 = 0; var5 < var3.field1887; var5++) {
            int var6 = var3.field1888[var5];
            this.method2302(var4.field2052[var6], var4.field2049[var6], var3.field1885[var5], var3.field1889[var5], var3.field1891[var5]);
        }
        this.method2275();
    }

    @ObfuscatedName("eo.u(Leh;ILeh;I[I)V")
    public void method2286(class145 arg0, int arg1, class145 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2285(arg0, arg1);
            return;
        }
        class132 var6 = arg0.field2138[arg1];
        class132 var7 = arg2.field2138[arg3];
        class139 var8 = var6.field1886;
        Statics.field1977 = 0;
        Statics.field1978 = 0;
        Statics.field1922 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1887; var11++) {
            int var12 = var6.field1888[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2052[var12] == 0) {
                this.method2302(var8.field2052[var12], var8.field2049[var12], var6.field1885[var11], var6.field1889[var11], var6.field1891[var11]);
            }
        }
        Statics.field1977 = 0;
        Statics.field1978 = 0;
        Statics.field1922 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1887; var15++) {
            int var16 = var7.field1888[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2052[var16] == 0) {
                this.method2302(var8.field2052[var16], var8.field2049[var16], var7.field1885[var15], var7.field1889[var15], var7.field1891[var15]);
            }
        }
        this.method2275();
    }

    @ObfuscatedName("eo.w(I[IIII)V")
    public void method2302(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1977 = 0;
            Statics.field1978 = 0;
            Statics.field1922 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1943.length) {
                    int[] var10 = this.field1943[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1977 += this.field1924[var12];
                        Statics.field1978 += this.field1925[var12];
                        Statics.field1922 += this.field1940[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1977 = Statics.field1977 / var7 + arg2;
                Statics.field1978 = Statics.field1978 / var7 + arg3;
                Statics.field1922 = Statics.field1922 / var7 + arg4;
            } else {
                Statics.field1977 = arg2;
                Statics.field1978 = arg3;
                Statics.field1922 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1943.length) {
                    int[] var15 = this.field1943[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1924[var17] += arg2;
                        this.field1925[var17] += arg3;
                        this.field1940[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1943.length) {
                    int[] var20 = this.field1943[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1924[var22] -= Statics.field1977;
                        this.field1925[var22] -= Statics.field1978;
                        this.field1940[var22] -= Statics.field1922;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1983[var25];
                            int var27 = field1984[var25];
                            int var28 = this.field1925[var22] * var26 + this.field1924[var22] * var27 >> 16;
                            this.field1925[var22] = this.field1925[var22] * var27 - this.field1924[var22] * var26 >> 16;
                            this.field1924[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1983[var23];
                            int var30 = field1984[var23];
                            int var31 = this.field1925[var22] * var30 - this.field1940[var22] * var29 >> 16;
                            this.field1940[var22] = this.field1940[var22] * var30 + this.field1925[var22] * var29 >> 16;
                            this.field1925[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1983[var24];
                            int var33 = field1984[var24];
                            int var34 = this.field1940[var22] * var32 + this.field1924[var22] * var33 >> 16;
                            this.field1940[var22] = this.field1940[var22] * var33 - this.field1924[var22] * var32 >> 16;
                            this.field1924[var22] = var34;
                        }
                        this.field1924[var22] += Statics.field1977;
                        this.field1925[var22] += Statics.field1978;
                        this.field1940[var22] += Statics.field1922;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1943.length) {
                    int[] var37 = this.field1943[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1924[var39] -= Statics.field1977;
                        this.field1925[var39] -= Statics.field1978;
                        this.field1940[var39] -= Statics.field1922;
                        this.field1924[var39] = this.field1924[var39] * arg2 / 128;
                        this.field1925[var39] = this.field1925[var39] * arg3 / 128;
                        this.field1940[var39] = this.field1940[var39] * arg4 / 128;
                        this.field1924[var39] += Statics.field1977;
                        this.field1925[var39] += Statics.field1978;
                        this.field1940[var39] += Statics.field1922;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1979 != null && this.field1980 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1979.length) {
                    int[] var42 = this.field1979[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1980[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1980[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("eo.p()V")
    public void method2288() {
        for (int var1 = 0; var1 < this.field1974; var1++) {
            int var2 = this.field1924[var1];
            this.field1924[var1] = this.field1940[var1];
            this.field1940[var1] = -var2;
        }
        this.method2275();
    }

    @ObfuscatedName("eo.l()V")
    public void method2274() {
        for (int var1 = 0; var1 < this.field1974; var1++) {
            this.field1924[var1] = -this.field1924[var1];
            this.field1940[var1] = -this.field1940[var1];
        }
        this.method2275();
    }

    @ObfuscatedName("eo.x()V")
    public void method2289() {
        for (int var1 = 0; var1 < this.field1974; var1++) {
            int var2 = this.field1940[var1];
            this.field1940[var1] = this.field1924[var1];
            this.field1924[var1] = -var2;
        }
        this.method2275();
    }

    @ObfuscatedName("eo.r(I)V")
    public void method2287(int arg0) {
        int var2 = field1983[arg0];
        int var3 = field1984[arg0];
        for (int var4 = 0; var4 < this.field1974; var4++) {
            int var5 = this.field1925[var4] * var3 - this.field1940[var4] * var2 >> 16;
            this.field1940[var4] = this.field1940[var4] * var3 + this.field1925[var4] * var2 >> 16;
            this.field1925[var4] = var5;
        }
        this.method2275();
    }

    @ObfuscatedName("eo.t(III)V")
    public void method2291(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1974; var4++) {
            this.field1924[var4] += arg0;
            this.field1925[var4] += arg1;
            this.field1940[var4] += arg2;
        }
        this.method2275();
    }

    @ObfuscatedName("eo.a(III)V")
    public void method2292(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1974; var4++) {
            this.field1924[var4] = this.field1924[var4] * arg0 / 128;
            this.field1925[var4] = this.field1925[var4] * arg1 / 128;
            this.field1940[var4] = this.field1940[var4] * arg2 / 128;
        }
        this.method2275();
    }

    @ObfuscatedName("eo.ad(IIIIIII)V")
    public final void method2293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1919[0] = -1;
        if (this.field1946 != 2 && this.field1946 != 1) {
            this.method2282();
        }
        int var8 = Statics.field2011;
        int var9 = Statics.field2022;
        int var10 = field1983[arg0];
        int var11 = field1984[arg0];
        int var12 = field1983[arg1];
        int var13 = field1984[arg1];
        int var14 = field1983[arg2];
        int var15 = field1984[arg2];
        int var16 = field1983[arg3];
        int var17 = field1984[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1974; var19++) {
            int var20 = this.field1924[var19];
            int var21 = this.field1925[var19];
            int var22 = this.field1940[var19];
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
            field1923[var19] = var30 - var18;
            field1960[var19] = class137.field2021 * var26 / var30 + var8;
            field1935[var19] = class137.field2021 * var29 / var30 + var9;
            if (this.field1939 > 0) {
                field1963[var19] = var26;
                field1947[var19] = var29;
                field1965[var19] = var30;
            }
        }
        try {
            this.method2296(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("eo.ay(IIIIIIII)V")
    public final void method2294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1919[0] = -1;
        if (this.field1946 != 2 && this.field1946 != 1) {
            this.method2282();
        }
        int var9 = Statics.field2011;
        int var10 = Statics.field2022;
        int var11 = field1983[arg0];
        int var12 = field1984[arg0];
        int var13 = field1983[arg1];
        int var14 = field1984[arg1];
        int var15 = field1983[arg2];
        int var16 = field1984[arg2];
        int var17 = field1983[arg3];
        int var18 = field1984[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1974; var20++) {
            int var21 = this.field1924[var20];
            int var22 = this.field1925[var20];
            int var23 = this.field1940[var20];
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
            field1923[var20] = var31 - var19;
            field1960[var20] = class137.field2021 * var27 / arg7 + var9;
            field1935[var20] = class137.field2021 * var30 / arg7 + var10;
            if (this.field1939 > 0) {
                field1963[var20] = var27;
                field1947[var20] = var30;
                field1965[var20] = var31;
            }
        }
        try {
            this.method2296(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("eo.cu(IIIIIIIII)V")
    public void method2295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1919[0] = -1;
        if (this.field1946 != 1) {
            this.method2281();
        }
        this.method2280(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1948 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1948) * class137.field2021;
        if (var15 / var13 >= Statics.field2023) {
            return;
        }
        int var16 = (this.field1948 + var14) * class137.field2021;
        if (var16 / var13 <= Statics.field2018) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1948 * arg1 >> 16;
        int var19 = (var17 + var18) * class137.field2021;
        if (var19 / var13 <= Statics.field2025) {
            return;
        }
        int var20 = (this.field2121 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class137.field2021;
        if (var21 / var13 >= Statics.field2028) {
            return;
        }
        int var22 = (this.field2121 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1939 > 0;
        int var26 = class135.field1990;
        int var28 = class135.field1991;
        boolean var30 = class135.method2458();
        if (class8.field227 && arg8 > 0) {
            if (class135.method2380(this, arg5, arg6, arg7)) {
                class8.field232.method3276(new class11(this, arg5, arg6, arg7, -65281));
            } else if (class8.field231 == class12.field260) {
                class8.field232.method3276(new class11(this, arg5, arg6, arg7, -16776961));
            }
        }
        if (class8.field228 && arg8 > 0) {
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
            int var42 = var26 - Statics.field2011;
            int var43 = var28 - Statics.field2022;
            if (var42 > var37 && var42 < var38 && var43 > var39 && var43 < var40) {
                var41 = -256;
            }
            class8.method29(Statics.field2011 + var37, Statics.field2022 + var39, Statics.field2011 + var38, Statics.field2022 + var40, var41);
        }
        boolean var44 = false;
        if (arg8 > 0 && var30) {
            boolean var45 = false;
            if (field1921) {
                var45 = class135.method2380(this, arg5, arg6, arg7);
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
                int var51 = var26 - Statics.field2011;
                int var52 = var28 - Statics.field2022;
                if (var51 > var47 && var51 < var48 && var52 > var49 && var52 < var50) {
                    var45 = true;
                }
            }
            if (var45) {
                if (this.field1945) {
                    class135.method3995(arg8);
                } else {
                    var44 = true;
                }
            }
        }
        int var53 = Statics.field2011;
        int var54 = Statics.field2022;
        int var55 = 0;
        int var56 = 0;
        if (arg0 != 0) {
            var55 = field1983[arg0];
            var56 = field1984[arg0];
        }
        for (int var57 = 0; var57 < this.field1974; var57++) {
            int var58 = this.field1924[var57];
            int var59 = this.field1925[var57];
            int var60 = this.field1940[var57];
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
            field1923[var57] = var69 - var11;
            if (var69 >= 50) {
                field1960[var57] = class137.field2021 * var65 / var69 + var53;
                field1935[var57] = class137.field2021 * var68 / var69 + var54;
            } else {
                field1960[var57] = -5000;
                var23 = true;
            }
            if (var25) {
                field1963[var57] = var65;
                field1947[var57] = var68;
                field1965[var57] = var69;
            }
        }
        try {
            this.method2296(var23, var44, this.field1945, arg8);
        } catch (Exception var72) {
        }
    }

    @ObfuscatedName("eo.am(ZZZI)V")
    public final void method2296(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1949 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1949; var5++) {
            field1919[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field229 && arg1) {
            class134 var7 = this;
            for (int var8 = 0; var8 < var7.field1927; var8++) {
                if (var7.field1933[var8] != -2) {
                    int var9 = var7.field1934[var8];
                    int var10 = var7.field1929[var8];
                    int var11 = var7.field1930[var8];
                    int var12 = field1960[var9];
                    int var13 = field1960[var10];
                    int var14 = field1960[var11];
                    int var15 = field1935[var9];
                    int var16 = field1935[var10];
                    int var17 = field1935[var11];
                    int var18 = Math.min(var12, Math.min(var13, var14)) - var6;
                    int var19 = Math.max(var12, Math.max(var13, var14)) + var6;
                    int var20 = Math.min(var15, Math.min(var16, var17)) - var6;
                    int var21 = Math.max(var15, Math.max(var16, var17)) + var6;
                    class8.method29(var18, var20, var19, var21, -49088);
                }
            }
        }
        for (int var22 = 0; var22 < this.field1927; var22++) {
            if (this.field1933[var22] != -2) {
                int var23 = this.field1934[var22];
                int var24 = this.field1929[var22];
                int var25 = this.field1930[var22];
                int var26 = field1960[var23];
                int var27 = field1960[var24];
                int var28 = field1960[var25];
                if (arg0 && var26 == -5000 || var27 == -5000 || var28 == -5000) {
                    int var29 = field1963[var23];
                    int var30 = field1963[var24];
                    int var31 = field1963[var25];
                    int var32 = field1947[var23];
                    int var33 = field1947[var24];
                    int var34 = field1947[var25];
                    int var35 = field1965[var23];
                    int var36 = field1965[var24];
                    int var37 = field1965[var25];
                    int var38 = var29 - var30;
                    int var39 = var31 - var30;
                    int var40 = var32 - var33;
                    int var41 = var34 - var33;
                    int var42 = var35 - var36;
                    int var43 = var37 - var36;
                    int var44 = var40 * var43 - var41 * var42;
                    int var45 = var39 * var42 - var38 * var43;
                    int var46 = var38 * var41 - var39 * var40;
                    if (var36 * var46 + var30 * var44 + var33 * var45 > 0) {
                        field1959[var22] = true;
                        int var47 = (field1923[var23] + field1923[var24] + field1923[var25]) / 3 + this.field1961;
                        field1968[var47][field1919[var47]++] = var22;
                    }
                } else {
                    if (arg1) {
                        int var48 = field1935[var23];
                        int var49 = field1935[var24];
                        int var50 = field1935[var25];
                        int var51 = class135.field1991 + var6;
                        boolean var52;
                        if (var51 < var48 && var51 < var49 && var51 < var50) {
                            var52 = false;
                        } else {
                            int var53 = class135.field1991 - var6;
                            if (var53 > var48 && var53 > var49 && var53 > var50) {
                                var52 = false;
                            } else {
                                int var54 = class135.field1990 + var6;
                                if (var54 < var26 && var54 < var27 && var54 < var28) {
                                    var52 = false;
                                } else {
                                    int var55 = class135.field1990 - var6;
                                    if (var55 > var26 && var55 > var27 && var55 > var28) {
                                        var52 = false;
                                    } else {
                                        var52 = true;
                                    }
                                }
                            }
                        }
                        if (var52) {
                            class135.method3995(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field1935[var25] - field1935[var24]) * (var26 - var27) - (field1935[var23] - field1935[var24]) * (var28 - var27) > 0) {
                        field1959[var22] = false;
                        if (var26 >= 0 && var27 >= 0 && var28 >= 0 && var26 <= Statics.field2015 && var27 <= Statics.field2015 && var28 <= Statics.field2015) {
                            field1972[var22] = false;
                        } else {
                            field1972[var22] = true;
                        }
                        int var56 = (field1923[var23] + field1923[var24] + field1923[var25]) / 3 + this.field1961;
                        field1968[var56][field1919[var56]++] = var22;
                    }
                }
            }
        }
        if (this.field1962 == null) {
            for (int var57 = this.field1949 - 1; var57 >= 0; var57--) {
                int var58 = field1919[var57];
                if (var58 > 0) {
                    int[] var59 = field1968[var57];
                    for (int var60 = 0; var60 < var58; var60++) {
                        this.method2316(var59[var60]);
                    }
                }
            }
            return;
        }
        for (int var61 = 0; var61 < 12; var61++) {
            field1969[var61] = 0;
            field1973[var61] = 0;
        }
        for (int var62 = this.field1949 - 1; var62 >= 0; var62--) {
            int var63 = field1919[var62];
            if (var63 > 0) {
                int[] var64 = field1968[var62];
                for (int var65 = 0; var65 < var63; var65++) {
                    int var66 = var64[var65];
                    byte var67 = this.field1962[var66];
                    int var68 = field1969[var67]++;
                    field1970[var67][var68] = var66;
                    if (var67 < 10) {
                        field1973[var67] += var62;
                    } else if (var67 == 10) {
                        field1971[var68] = var62;
                    } else {
                        field1926[var68] = var62;
                    }
                }
            }
        }
        int var69 = 0;
        if (field1969[1] > 0 || field1969[2] > 0) {
            var69 = (field1973[1] + field1973[2]) / (field1969[1] + field1969[2]);
        }
        int var70 = 0;
        if (field1969[3] > 0 || field1969[4] > 0) {
            var70 = (field1973[3] + field1973[4]) / (field1969[3] + field1969[4]);
        }
        int var71 = 0;
        if (field1969[6] > 0 || field1969[8] > 0) {
            var71 = (field1973[6] + field1973[8]) / (field1969[6] + field1969[8]);
        }
        int var72 = 0;
        int var73 = field1969[10];
        int[] var74 = field1970[10];
        int[] var75 = field1971;
        if (var72 == var73) {
            var72 = 0;
            var73 = field1969[11];
            var74 = field1970[11];
            var75 = field1926;
        }
        int var76;
        if (var72 < var73) {
            var76 = var75[var72];
        } else {
            var76 = -1000;
        }
        for (int var77 = 0; var77 < 10; var77++) {
            while (var77 == 0 && var76 > var69) {
                this.method2316(var74[var72++]);
                if (var72 == var73 && field1970[11] != var74) {
                    var72 = 0;
                    var73 = field1969[11];
                    var74 = field1970[11];
                    var75 = field1926;
                }
                if (var72 < var73) {
                    var76 = var75[var72];
                } else {
                    var76 = -1000;
                }
            }
            while (var77 == 3 && var76 > var70) {
                this.method2316(var74[var72++]);
                if (var72 == var73 && field1970[11] != var74) {
                    var72 = 0;
                    var73 = field1969[11];
                    var74 = field1970[11];
                    var75 = field1926;
                }
                if (var72 < var73) {
                    var76 = var75[var72];
                } else {
                    var76 = -1000;
                }
            }
            while (var77 == 5 && var76 > var71) {
                this.method2316(var74[var72++]);
                if (var72 == var73 && field1970[11] != var74) {
                    var72 = 0;
                    var73 = field1969[11];
                    var74 = field1970[11];
                    var75 = field1926;
                }
                if (var72 < var73) {
                    var76 = var75[var72];
                } else {
                    var76 = -1000;
                }
            }
            int var78 = field1969[var77];
            int[] var79 = field1970[var77];
            for (int var80 = 0; var80 < var78; var80++) {
                this.method2316(var79[var80]);
            }
        }
        while (var76 != -1000) {
            this.method2316(var74[var72++]);
            if (var72 == var73 && field1970[11] != var74) {
                var72 = 0;
                var74 = field1970[11];
                var73 = field1969[11];
                var75 = field1926;
            }
            if (var72 < var73) {
                var76 = var75[var72];
            } else {
                var76 = -1000;
            }
        }
    }

    @ObfuscatedName("eo.ae(I)V")
    public final void method2316(int arg0) {
        if (field1959[arg0]) {
            this.method2298(arg0);
            return;
        }
        int var2 = this.field1934[arg0];
        int var3 = this.field1929[arg0];
        int var4 = this.field1930[arg0];
        class137.field2017 = field1972[arg0];
        if (this.field1980 == null) {
            class137.field2014 = 0;
        } else {
            class137.field2014 = this.field1980[arg0] & 0xFF;
        }
        if (this.field1937 != null && this.field1937[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1936 == null || this.field1936[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1936[arg0] & 0xFF;
                var6 = this.field1955[var5];
                var7 = this.field1941[var5];
                var8 = this.field1950[var5];
            }
            if (this.field1933[arg0] == -1) {
                class137.method2394(field1935[var2], field1935[var3], field1935[var4], field1960[var2], field1960[var3], field1960[var4], this.field1931[arg0], this.field1931[arg0], this.field1931[arg0], field1963[var6], field1963[var7], field1963[var8], field1947[var6], field1947[var7], field1947[var8], field1965[var6], field1965[var7], field1965[var8], this.field1937[arg0]);
            } else {
                class137.method2394(field1935[var2], field1935[var3], field1935[var4], field1960[var2], field1960[var3], field1960[var4], this.field1931[arg0], this.field1988[arg0], this.field1933[arg0], field1963[var6], field1963[var7], field1963[var8], field1947[var6], field1947[var7], field1947[var8], field1965[var6], field1965[var7], field1965[var8], this.field1937[arg0]);
            }
        } else if (this.field1933[arg0] == -1) {
            class137.method2392(field1935[var2], field1935[var3], field1935[var4], field1960[var2], field1960[var3], field1960[var4], field1985[this.field1931[arg0]]);
        } else {
            class137.method2390(field1935[var2], field1935[var3], field1935[var4], field1960[var2], field1960[var3], field1960[var4], this.field1931[arg0], this.field1988[arg0], this.field1933[arg0]);
        }
    }

    @ObfuscatedName("eo.az(I)V")
    public final void method2298(int arg0) {
        int var2 = Statics.field2011;
        int var3 = Statics.field2022;
        int var4 = 0;
        int var5 = this.field1934[arg0];
        int var6 = this.field1929[arg0];
        int var7 = this.field1930[arg0];
        int var8 = field1965[var5];
        int var9 = field1965[var6];
        int var10 = field1965[var7];
        if (this.field1980 == null) {
            class137.field2014 = 0;
        } else {
            class137.field2014 = this.field1980[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1964[var4] = field1960[var5];
            field1975[var4] = field1935[var5];
            field1976[var4++] = this.field1931[arg0];
        } else {
            int var11 = field1963[var5];
            int var12 = field1947[var5];
            int var13 = this.field1931[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1932[var10 - var8];
                field1964[var4] = (((field1963[var7] - var11) * var14 >> 16) + var11) * class137.field2021 / 50 + var2;
                field1975[var4] = (((field1947[var7] - var12) * var14 >> 16) + var12) * class137.field2021 / 50 + var3;
                field1976[var4++] = ((this.field1933[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1932[var9 - var8];
                field1964[var4] = (((field1963[var6] - var11) * var15 >> 16) + var11) * class137.field2021 / 50 + var2;
                field1975[var4] = (((field1947[var6] - var12) * var15 >> 16) + var12) * class137.field2021 / 50 + var3;
                field1976[var4++] = ((this.field1988[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1964[var4] = field1960[var6];
            field1975[var4] = field1935[var6];
            field1976[var4++] = this.field1988[arg0];
        } else {
            int var16 = field1963[var6];
            int var17 = field1947[var6];
            int var18 = this.field1988[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1932[var8 - var9];
                field1964[var4] = (((field1963[var5] - var16) * var19 >> 16) + var16) * class137.field2021 / 50 + var2;
                field1975[var4] = (((field1947[var5] - var17) * var19 >> 16) + var17) * class137.field2021 / 50 + var3;
                field1976[var4++] = ((this.field1931[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1932[var10 - var9];
                field1964[var4] = (((field1963[var7] - var16) * var20 >> 16) + var16) * class137.field2021 / 50 + var2;
                field1975[var4] = (((field1947[var7] - var17) * var20 >> 16) + var17) * class137.field2021 / 50 + var3;
                field1976[var4++] = ((this.field1933[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1964[var4] = field1960[var7];
            field1975[var4] = field1935[var7];
            field1976[var4++] = this.field1933[arg0];
        } else {
            int var21 = field1963[var7];
            int var22 = field1947[var7];
            int var23 = this.field1933[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1932[var9 - var10];
                field1964[var4] = (((field1963[var6] - var21) * var24 >> 16) + var21) * class137.field2021 / 50 + var2;
                field1975[var4] = (((field1947[var6] - var22) * var24 >> 16) + var22) * class137.field2021 / 50 + var3;
                field1976[var4++] = ((this.field1988[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1932[var8 - var10];
                field1964[var4] = (((field1963[var5] - var21) * var25 >> 16) + var21) * class137.field2021 / 50 + var2;
                field1975[var4] = (((field1947[var5] - var22) * var25 >> 16) + var22) * class137.field2021 / 50 + var3;
                field1976[var4++] = ((this.field1931[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1964[0];
        int var27 = field1964[1];
        int var28 = field1964[2];
        int var29 = field1975[0];
        int var30 = field1975[1];
        int var31 = field1975[2];
        class137.field2017 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2015 || var27 > Statics.field2015 || var28 > Statics.field2015) {
                class137.field2017 = true;
            }
            if (this.field1937 != null && this.field1937[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1936 == null || this.field1936[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1936[arg0] & 0xFF;
                    var33 = this.field1955[var32];
                    var34 = this.field1941[var32];
                    var35 = this.field1950[var32];
                }
                if (this.field1933[arg0] == -1) {
                    class137.method2394(var29, var30, var31, var26, var27, var28, this.field1931[arg0], this.field1931[arg0], this.field1931[arg0], field1963[var33], field1963[var34], field1963[var35], field1947[var33], field1947[var34], field1947[var35], field1965[var33], field1965[var34], field1965[var35], this.field1937[arg0]);
                } else {
                    class137.method2394(var29, var30, var31, var26, var27, var28, field1976[0], field1976[1], field1976[2], field1963[var33], field1963[var34], field1963[var35], field1947[var33], field1947[var34], field1947[var35], field1965[var33], field1965[var34], field1965[var35], this.field1937[arg0]);
                }
            } else if (this.field1933[arg0] == -1) {
                class137.method2392(var29, var30, var31, var26, var27, var28, field1985[this.field1931[arg0]]);
            } else {
                class137.method2390(var29, var30, var31, var26, var27, var28, field1976[0], field1976[1], field1976[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2015 || var27 > Statics.field2015 || var28 > Statics.field2015 || field1964[3] < 0 || field1964[3] > Statics.field2015) {
            class137.field2017 = true;
        }
        if (this.field1937 != null && this.field1937[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1936 == null || this.field1936[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1936[arg0] & 0xFF;
                var37 = this.field1955[var36];
                var38 = this.field1941[var36];
                var39 = this.field1950[var36];
            }
            short var40 = this.field1937[arg0];
            if (this.field1933[arg0] == -1) {
                class137.method2394(var29, var30, var31, var26, var27, var28, this.field1931[arg0], this.field1931[arg0], this.field1931[arg0], field1963[var37], field1963[var38], field1963[var39], field1947[var37], field1947[var38], field1947[var39], field1965[var37], field1965[var38], field1965[var39], var40);
                class137.method2394(var29, var31, field1975[3], var26, var28, field1964[3], this.field1931[arg0], this.field1931[arg0], this.field1931[arg0], field1963[var37], field1963[var38], field1963[var39], field1947[var37], field1947[var38], field1947[var39], field1965[var37], field1965[var38], field1965[var39], var40);
            } else {
                class137.method2394(var29, var30, var31, var26, var27, var28, field1976[0], field1976[1], field1976[2], field1963[var37], field1963[var38], field1963[var39], field1947[var37], field1947[var38], field1947[var39], field1965[var37], field1965[var38], field1965[var39], var40);
                class137.method2394(var29, var31, field1975[3], var26, var28, field1964[3], field1976[0], field1976[2], field1976[3], field1963[var37], field1963[var38], field1963[var39], field1947[var37], field1947[var38], field1947[var39], field1965[var37], field1965[var38], field1965[var39], var40);
            }
        } else if (this.field1933[arg0] == -1) {
            int var41 = field1985[this.field1931[arg0]];
            class137.method2392(var29, var30, var31, var26, var27, var28, var41);
            class137.method2392(var29, var31, field1975[3], var26, var28, field1964[3], var41);
        } else {
            class137.method2390(var29, var30, var31, var26, var27, var28, field1976[0], field1976[1], field1976[2]);
            class137.method2390(var29, var31, field1975[3], var26, var28, field1964[3], field1976[0], field1976[2], field1976[3]);
        }
    }
}

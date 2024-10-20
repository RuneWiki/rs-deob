package deob;

@ObfuscatedName("eb")
public class class134 extends class142 {

    @ObfuscatedName("eb.s")
    public static class134 field1985 = new class134();

    @ObfuscatedName("eb.c")
    public static byte[] field1924 = new byte[1];

    @ObfuscatedName("eb.f")
    public static class134 field1964 = new class134();

    @ObfuscatedName("eb.m")
    public static byte[] field1926 = new byte[1];

    @ObfuscatedName("eb.h")
    public int field1927 = 0;

    @ObfuscatedName("eb.t")
    public int[] field1928;

    @ObfuscatedName("eb.p")
    public int[] field1929;

    @ObfuscatedName("eb.d")
    public int[] field1932;

    @ObfuscatedName("eb.n")
    public int field1931 = 0;

    @ObfuscatedName("eb.z")
    public int[] field1987;

    @ObfuscatedName("eb.o")
    public int[] field1933;

    @ObfuscatedName("eb.q")
    public int[] field1934;

    @ObfuscatedName("eb.u")
    public int[] field1935;

    @ObfuscatedName("eb.k")
    public int[] field1936;

    @ObfuscatedName("eb.e")
    public int[] field1937;

    @ObfuscatedName("eb.r")
    public byte[] field1949;

    @ObfuscatedName("eb.l")
    public byte[] field1939;

    @ObfuscatedName("eb.y")
    public byte[] field1940;

    @ObfuscatedName("eb.w")
    public short[] field1923;

    @ObfuscatedName("eb.i")
    public byte field1938 = 0;

    @ObfuscatedName("eb.g")
    public int field1943 = 0;

    @ObfuscatedName("eb.a")
    public int[] field1944;

    @ObfuscatedName("eb.x")
    public int[] field1945;

    @ObfuscatedName("eb.b")
    public int[] field1946;

    @ObfuscatedName("eb.j")
    public int[][] field1957;

    @ObfuscatedName("eb.v")
    public int[][] field1948;

    @ObfuscatedName("eb.ap")
    public boolean field1950 = false;

    @ObfuscatedName("eb.ar")
    public int field1982;

    @ObfuscatedName("eb.am")
    public int field1951;

    @ObfuscatedName("eb.ab")
    public int field1952;

    @ObfuscatedName("eb.af")
    public int field1953;

    @ObfuscatedName("eb.aa")
    public int field1954;

    @ObfuscatedName("eb.aq")
    public int field1962;

    @ObfuscatedName("eb.aj")
    public int field1956;

    @ObfuscatedName("eb.as")
    public int field1976;

    @ObfuscatedName("eb.av")
    public int field1959 = -1;

    @ObfuscatedName("eb.ao")
    public int field1974 = -1;

    @ObfuscatedName("eb.ag")
    public int field1960 = -1;

    @ObfuscatedName("eb.ax")
    public static boolean[] field1990 = new boolean[4700];

    @ObfuscatedName("eb.ad")
    public static boolean[] field1963 = new boolean[4700];

    @ObfuscatedName("eb.ae")
    public static int[] field1979 = new int[4700];

    @ObfuscatedName("eb.ac")
    public static int[] field1965 = new int[4700];

    @ObfuscatedName("eb.az")
    public static int[] field1983 = new int[4700];

    @ObfuscatedName("eb.ah")
    public static int[] field1967 = new int[4700];

    @ObfuscatedName("eb.at")
    public static int[] field1958 = new int[4700];

    @ObfuscatedName("eb.al")
    public static int[] field1969 = new int[4700];

    @ObfuscatedName("eb.ak")
    public static int[] field1971 = new int[1600];

    @ObfuscatedName("eb.aw")
    public static int[][] field1972 = new int[1600][512];

    @ObfuscatedName("eb.an")
    public static int[] field1973 = new int[12];

    @ObfuscatedName("eb.ai")
    public static int[][] field1947 = new int[12][2000];

    @ObfuscatedName("eb.bk")
    public static int[] field1975 = new int[2000];

    @ObfuscatedName("eb.bh")
    public static int[] field1970 = new int[2000];

    @ObfuscatedName("eb.bv")
    public static int[] field1977 = new int[12];

    @ObfuscatedName("eb.bf")
    public static int[] field1941 = new int[10];

    @ObfuscatedName("eb.bl")
    public static int[] field1978 = new int[10];

    @ObfuscatedName("eb.bp")
    public static int[] field1988 = new int[10];

    @ObfuscatedName("eb.by")
    public static boolean field1980 = true;

    @ObfuscatedName("eb.bn")
    public static int[] field1984 = class137.field2034;

    @ObfuscatedName("eb.bd")
    public static int[] field1955 = class137.field2019;

    @ObfuscatedName("eb.bm")
    public static int[] field1968 = class137.field2035;

    @ObfuscatedName("eb.bi")
    public static int[] field1986 = class137.field2033;

    public class134() {
    }

    public class134(class134[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1927 = 0;
        this.field1931 = 0;
        this.field1943 = 0;
        this.field1938 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class134 var8 = arg0[var7];
            if (var8 != null) {
                this.field1927 += var8.field1927;
                this.field1931 += var8.field1931;
                this.field1943 += var8.field1943;
                if (var8.field1949 == null) {
                    if (this.field1938 == -1) {
                        this.field1938 = var8.field1938;
                    }
                    if (this.field1938 != var8.field1938) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1939 != null;
                var5 |= var8.field1923 != null;
                var6 |= var8.field1940 != null;
            }
        }
        this.field1928 = new int[this.field1927];
        this.field1929 = new int[this.field1927];
        this.field1932 = new int[this.field1927];
        this.field1987 = new int[this.field1931];
        this.field1933 = new int[this.field1931];
        this.field1934 = new int[this.field1931];
        this.field1935 = new int[this.field1931];
        this.field1936 = new int[this.field1931];
        this.field1937 = new int[this.field1931];
        if (var3) {
            this.field1949 = new byte[this.field1931];
        }
        if (var4) {
            this.field1939 = new byte[this.field1931];
        }
        if (var5) {
            this.field1923 = new short[this.field1931];
        }
        if (var6) {
            this.field1940 = new byte[this.field1931];
        }
        if (this.field1943 > 0) {
            this.field1944 = new int[this.field1943];
            this.field1945 = new int[this.field1943];
            this.field1946 = new int[this.field1943];
        }
        this.field1927 = 0;
        this.field1931 = 0;
        this.field1943 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class134 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1931; var11++) {
                    this.field1987[this.field1931] = var10.field1987[var11] + this.field1927;
                    this.field1933[this.field1931] = var10.field1933[var11] + this.field1927;
                    this.field1934[this.field1931] = var10.field1934[var11] + this.field1927;
                    this.field1935[this.field1931] = var10.field1935[var11];
                    this.field1936[this.field1931] = var10.field1936[var11];
                    this.field1937[this.field1931] = var10.field1937[var11];
                    if (var3) {
                        if (var10.field1949 == null) {
                            this.field1949[this.field1931] = var10.field1938;
                        } else {
                            this.field1949[this.field1931] = var10.field1949[var11];
                        }
                    }
                    if (var4 && var10.field1939 != null) {
                        this.field1939[this.field1931] = var10.field1939[var11];
                    }
                    if (var5) {
                        if (var10.field1923 == null) {
                            this.field1923[this.field1931] = -1;
                        } else {
                            this.field1923[this.field1931] = var10.field1923[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1940 == null || var10.field1940[var11] == -1) {
                            this.field1940[this.field1931] = -1;
                        } else {
                            this.field1940[this.field1931] = (byte) (var10.field1940[var11] + this.field1943);
                        }
                    }
                    this.field1931++;
                }
                for (int var12 = 0; var12 < var10.field1943; var12++) {
                    this.field1944[this.field1943] = var10.field1944[var12] + this.field1927;
                    this.field1945[this.field1943] = var10.field1945[var12] + this.field1927;
                    this.field1946[this.field1943] = var10.field1946[var12] + this.field1927;
                    this.field1943++;
                }
                for (int var13 = 0; var13 < var10.field1927; var13++) {
                    this.field1928[this.field1927] = var10.field1928[var13];
                    this.field1929[this.field1927] = var10.field1929[var13];
                    this.field1932[this.field1927] = var10.field1932[var13];
                    this.field1927++;
                }
            }
        }
    }

    @ObfuscatedName("eb.s([[IIIIZI)Leb;")
    public class134 method2342(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2346();
        int var7 = arg1 - this.field1952;
        int var8 = this.field1952 + arg1;
        int var9 = arg3 - this.field1952;
        int var10 = this.field1952 + arg3;
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
            var15.field1927 = this.field1927;
            var15.field1931 = this.field1931;
            var15.field1943 = this.field1943;
            var15.field1928 = this.field1928;
            var15.field1932 = this.field1932;
            var15.field1987 = this.field1987;
            var15.field1933 = this.field1933;
            var15.field1934 = this.field1934;
            var15.field1935 = this.field1935;
            var15.field1936 = this.field1936;
            var15.field1937 = this.field1937;
            var15.field1949 = this.field1949;
            var15.field1939 = this.field1939;
            var15.field1940 = this.field1940;
            var15.field1923 = this.field1923;
            var15.field1938 = this.field1938;
            var15.field1944 = this.field1944;
            var15.field1945 = this.field1945;
            var15.field1946 = this.field1946;
            var15.field1957 = this.field1957;
            var15.field1948 = this.field1948;
            var15.field1950 = this.field1950;
            var15.field1929 = new int[var15.field1927];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1927; var16++) {
                int var17 = this.field1928[var16] + arg1;
                int var18 = this.field1932[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1929[var16] = this.field1929[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1927; var26++) {
                int var27 = (-this.field1929[var26] << 16) / this.field2117;
                if (var27 < arg5) {
                    int var28 = this.field1928[var26] + arg1;
                    int var29 = this.field1932[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1929[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1929[var26];
                }
            }
        }
        var15.method2349();
        return var15;
    }

    @ObfuscatedName("eb.c(Z)Leb;")
    public class134 method2343(boolean arg0) {
        if (!arg0 && field1924.length < this.field1931) {
            field1924 = new byte[this.field1931 + 100];
        }
        return this.method2345(arg0, field1985, field1924);
    }

    @ObfuscatedName("eb.m(Z)Leb;")
    public class134 method2344(boolean arg0) {
        if (!arg0 && field1926.length < this.field1931) {
            field1926 = new byte[this.field1931 + 100];
        }
        return this.method2345(arg0, field1964, field1926);
    }

    @ObfuscatedName("eb.h(ZLeb;[B)Leb;")
    public class134 method2345(boolean arg0, class134 arg1, byte[] arg2) {
        arg1.field1927 = this.field1927;
        arg1.field1931 = this.field1931;
        arg1.field1943 = this.field1943;
        if (arg1.field1928 == null || arg1.field1928.length < this.field1927) {
            arg1.field1928 = new int[this.field1927 + 100];
            arg1.field1929 = new int[this.field1927 + 100];
            arg1.field1932 = new int[this.field1927 + 100];
        }
        for (int var4 = 0; var4 < this.field1927; var4++) {
            arg1.field1928[var4] = this.field1928[var4];
            arg1.field1929[var4] = this.field1929[var4];
            arg1.field1932[var4] = this.field1932[var4];
        }
        if (arg0) {
            arg1.field1939 = this.field1939;
        } else {
            arg1.field1939 = arg2;
            if (this.field1939 == null) {
                for (int var5 = 0; var5 < this.field1931; var5++) {
                    arg1.field1939[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1931; var6++) {
                    arg1.field1939[var6] = this.field1939[var6];
                }
            }
        }
        arg1.field1987 = this.field1987;
        arg1.field1933 = this.field1933;
        arg1.field1934 = this.field1934;
        arg1.field1935 = this.field1935;
        arg1.field1936 = this.field1936;
        arg1.field1937 = this.field1937;
        arg1.field1949 = this.field1949;
        arg1.field1940 = this.field1940;
        arg1.field1923 = this.field1923;
        arg1.field1938 = this.field1938;
        arg1.field1944 = this.field1944;
        arg1.field1945 = this.field1945;
        arg1.field1946 = this.field1946;
        arg1.field1957 = this.field1957;
        arg1.field1948 = this.field1948;
        arg1.field1950 = this.field1950;
        arg1.method2349();
        return arg1;
    }

    @ObfuscatedName("eb.t(I)V")
    public void method2408(int arg0) {
        if (this.field1959 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1955[arg0];
        int var9 = field1984[arg0];
        for (int var10 = 0; var10 < this.field1927; var10++) {
            int var11 = class137.method2510(this.field1928[var10], this.field1932[var10], var8, var9);
            int var12 = this.field1929[var10];
            int var13 = class137.method2432(this.field1928[var10], this.field1932[var10], var8, var9);
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
        this.field1962 = (var2 + var5) / 2;
        this.field1956 = (var3 + var6) / 2;
        this.field1976 = (var4 + var7) / 2;
        this.field1959 = (var5 - var2 + 1) / 2;
        this.field1974 = (var6 - var3 + 1) / 2;
        this.field1960 = (var7 - var4 + 1) / 2;
        if (this.field1959 < 32) {
            this.field1959 = 32;
        }
        if (this.field1960 < 32) {
            this.field1960 = 32;
        }
        if (this.field1950) {
            this.field1959 += 8;
            this.field1960 += 8;
        }
    }

    @ObfuscatedName("eb.p()V")
    public void method2346() {
        if (this.field1982 == 1) {
            return;
        }
        this.field1982 = 1;
        this.field2117 = 0;
        this.field1951 = 0;
        this.field1952 = 0;
        for (int var1 = 0; var1 < this.field1927; var1++) {
            int var2 = this.field1928[var1];
            int var3 = this.field1929[var1];
            int var4 = this.field1932[var1];
            if (-var3 > this.field2117) {
                this.field2117 = -var3;
            }
            if (var3 > this.field1951) {
                this.field1951 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1952) {
                this.field1952 = var5;
            }
        }
        this.field1952 = (int) (Math.sqrt((double) this.field1952) + 0.99D);
        this.field1954 = (int) (Math.sqrt((double) (this.field2117 * this.field2117 + this.field1952 * this.field1952)) + 0.99D);
        this.field1953 = this.field1954 + (int) (Math.sqrt((double) (this.field1952 * this.field1952 + this.field1951 * this.field1951)) + 0.99D);
    }

    @ObfuscatedName("eb.d()V")
    public void method2347() {
        if (this.field1982 == 2) {
            return;
        }
        this.field1982 = 2;
        this.field1952 = 0;
        for (int var1 = 0; var1 < this.field1927; var1++) {
            int var2 = this.field1928[var1];
            int var3 = this.field1929[var1];
            int var4 = this.field1932[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1952) {
                this.field1952 = var5;
            }
        }
        this.field1952 = (int) (Math.sqrt((double) this.field1952) + 0.99D);
        this.field1954 = this.field1952;
        this.field1953 = this.field1952 + this.field1952;
    }

    @ObfuscatedName("eb.n()I")
    public int method2388() {
        this.method2346();
        return this.field1952;
    }

    @ObfuscatedName("eb.z()V")
    public void method2349() {
        this.field1982 = 0;
        this.field1959 = -1;
    }

    @ObfuscatedName("eb.o(Lez;I)V")
    public void method2350(class145 arg0, int arg1) {
        if (this.field1957 == null || arg1 == -1) {
            return;
        }
        class132 var3 = arg0.field2139[arg1];
        class139 var4 = var3.field1889;
        Statics.field1981 = 0;
        Statics.field1942 = 0;
        Statics.field1930 = 0;
        for (int var5 = 0; var5 < var3.field1897; var5++) {
            int var6 = var3.field1892[var5];
            this.method2352(var4.field2047[var6], var4.field2050[var6], var3.field1895[var5], var3.field1896[var5], var3.field1888[var5]);
        }
        this.method2349();
    }

    @ObfuscatedName("eb.u(Lez;ILez;I[I)V")
    public void method2351(class145 arg0, int arg1, class145 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2350(arg0, arg1);
            return;
        }
        class132 var6 = arg0.field2139[arg1];
        class132 var7 = arg2.field2139[arg3];
        class139 var8 = var6.field1889;
        Statics.field1981 = 0;
        Statics.field1942 = 0;
        Statics.field1930 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1897; var11++) {
            int var12 = var6.field1892[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2047[var12] == 0) {
                this.method2352(var8.field2047[var12], var8.field2050[var12], var6.field1895[var11], var6.field1896[var11], var6.field1888[var11]);
            }
        }
        Statics.field1981 = 0;
        Statics.field1942 = 0;
        Statics.field1930 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1897; var15++) {
            int var16 = var7.field1892[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2047[var16] == 0) {
                this.method2352(var8.field2047[var16], var8.field2050[var16], var7.field1895[var15], var7.field1896[var15], var7.field1888[var15]);
            }
        }
        this.method2349();
    }

    @ObfuscatedName("eb.r(I[IIII)V")
    public void method2352(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1981 = 0;
            Statics.field1942 = 0;
            Statics.field1930 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1957.length) {
                    int[] var10 = this.field1957[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1981 += this.field1928[var12];
                        Statics.field1942 += this.field1929[var12];
                        Statics.field1930 += this.field1932[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1981 = Statics.field1981 / var7 + arg2;
                Statics.field1942 = Statics.field1942 / var7 + arg3;
                Statics.field1930 = Statics.field1930 / var7 + arg4;
            } else {
                Statics.field1981 = arg2;
                Statics.field1942 = arg3;
                Statics.field1930 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1957.length) {
                    int[] var15 = this.field1957[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1928[var17] += arg2;
                        this.field1929[var17] += arg3;
                        this.field1932[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1957.length) {
                    int[] var20 = this.field1957[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1928[var22] -= Statics.field1981;
                        this.field1929[var22] -= Statics.field1942;
                        this.field1932[var22] -= Statics.field1930;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1984[var25];
                            int var27 = field1955[var25];
                            int var28 = this.field1929[var22] * var26 + this.field1928[var22] * var27 >> 16;
                            this.field1929[var22] = this.field1929[var22] * var27 - this.field1928[var22] * var26 >> 16;
                            this.field1928[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1984[var23];
                            int var30 = field1955[var23];
                            int var31 = this.field1929[var22] * var30 - this.field1932[var22] * var29 >> 16;
                            this.field1932[var22] = this.field1932[var22] * var30 + this.field1929[var22] * var29 >> 16;
                            this.field1929[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1984[var24];
                            int var33 = field1955[var24];
                            int var34 = this.field1932[var22] * var32 + this.field1928[var22] * var33 >> 16;
                            this.field1932[var22] = this.field1932[var22] * var33 - this.field1928[var22] * var32 >> 16;
                            this.field1928[var22] = var34;
                        }
                        this.field1928[var22] += Statics.field1981;
                        this.field1929[var22] += Statics.field1942;
                        this.field1932[var22] += Statics.field1930;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1957.length) {
                    int[] var37 = this.field1957[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1928[var39] -= Statics.field1981;
                        this.field1929[var39] -= Statics.field1942;
                        this.field1932[var39] -= Statics.field1930;
                        this.field1928[var39] = this.field1928[var39] * arg2 / 128;
                        this.field1929[var39] = this.field1929[var39] * arg3 / 128;
                        this.field1932[var39] = this.field1932[var39] * arg4 / 128;
                        this.field1928[var39] += Statics.field1981;
                        this.field1929[var39] += Statics.field1942;
                        this.field1932[var39] += Statics.field1930;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1948 != null && this.field1939 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1948.length) {
                    int[] var42 = this.field1948[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1939[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1939[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("eb.l()V")
    public void method2353() {
        for (int var1 = 0; var1 < this.field1927; var1++) {
            int var2 = this.field1928[var1];
            this.field1928[var1] = this.field1932[var1];
            this.field1932[var1] = -var2;
        }
        this.method2349();
    }

    @ObfuscatedName("eb.y()V")
    public void method2376() {
        for (int var1 = 0; var1 < this.field1927; var1++) {
            this.field1928[var1] = -this.field1928[var1];
            this.field1932[var1] = -this.field1932[var1];
        }
        this.method2349();
    }

    @ObfuscatedName("eb.w()V")
    public void method2398() {
        for (int var1 = 0; var1 < this.field1927; var1++) {
            int var2 = this.field1932[var1];
            this.field1932[var1] = this.field1928[var1];
            this.field1928[var1] = -var2;
        }
        this.method2349();
    }

    @ObfuscatedName("eb.g(I)V")
    public void method2365(int arg0) {
        int var2 = field1984[arg0];
        int var3 = field1955[arg0];
        for (int var4 = 0; var4 < this.field1927; var4++) {
            int var5 = this.field1929[var4] * var3 - this.field1932[var4] * var2 >> 16;
            this.field1932[var4] = this.field1932[var4] * var3 + this.field1929[var4] * var2 >> 16;
            this.field1929[var4] = var5;
        }
        this.method2349();
    }

    @ObfuscatedName("eb.a(III)V")
    public void method2357(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1927; var4++) {
            this.field1928[var4] += arg0;
            this.field1929[var4] += arg1;
            this.field1932[var4] += arg2;
        }
        this.method2349();
    }

    @ObfuscatedName("eb.x(III)V")
    public void method2358(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1927; var4++) {
            this.field1928[var4] = this.field1928[var4] * arg0 / 128;
            this.field1929[var4] = this.field1929[var4] * arg1 / 128;
            this.field1932[var4] = this.field1932[var4] * arg2 / 128;
        }
        this.method2349();
    }

    @ObfuscatedName("eb.j(IIIIIII)V")
    public final void method2359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1971[0] = -1;
        if (this.field1982 != 2 && this.field1982 != 1) {
            this.method2347();
        }
        int var8 = Statics.field2016;
        int var9 = Statics.field2022;
        int var10 = field1984[arg0];
        int var11 = field1955[arg0];
        int var12 = field1984[arg1];
        int var13 = field1955[arg1];
        int var14 = field1984[arg2];
        int var15 = field1955[arg2];
        int var16 = field1984[arg3];
        int var17 = field1955[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1927; var19++) {
            int var20 = this.field1928[var19];
            int var21 = this.field1929[var19];
            int var22 = this.field1932[var19];
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
            field1983[var19] = var30 - var18;
            field1979[var19] = class137.field2030 * var26 / var30 + var8;
            field1965[var19] = class137.field2030 * var29 / var30 + var9;
            if (this.field1943 > 0) {
                field1967[var19] = var26;
                field1958[var19] = var29;
                field1969[var19] = var30;
            }
        }
        try {
            this.method2362(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("eb.v(IIIIIIII)V")
    public final void method2360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1971[0] = -1;
        if (this.field1982 != 2 && this.field1982 != 1) {
            this.method2347();
        }
        int var9 = Statics.field2016;
        int var10 = Statics.field2022;
        int var11 = field1984[arg0];
        int var12 = field1955[arg0];
        int var13 = field1984[arg1];
        int var14 = field1955[arg1];
        int var15 = field1984[arg2];
        int var16 = field1955[arg2];
        int var17 = field1984[arg3];
        int var18 = field1955[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1927; var20++) {
            int var21 = this.field1928[var20];
            int var22 = this.field1929[var20];
            int var23 = this.field1932[var20];
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
            field1983[var20] = var31 - var19;
            field1979[var20] = class137.field2030 * var27 / arg7 + var9;
            field1965[var20] = class137.field2030 * var30 / arg7 + var10;
            if (this.field1943 > 0) {
                field1967[var20] = var27;
                field1958[var20] = var30;
                field1969[var20] = var31;
            }
        }
        try {
            this.method2362(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("eb.cb(IIIIIIIII)V")
    public void method2378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1971[0] = -1;
        if (this.field1982 != 1) {
            this.method2346();
        }
        this.method2408(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1952 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1952) * class137.field2030;
        if (var15 / var13 >= Statics.field2020) {
            return;
        }
        int var16 = (this.field1952 + var14) * class137.field2030;
        if (var16 / var13 <= Statics.field2023) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1952 * arg1 >> 16;
        int var19 = (var17 + var18) * class137.field2030;
        if (var19 / var13 <= Statics.field2027) {
            return;
        }
        int var20 = (this.field2117 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class137.field2030;
        if (var21 / var13 >= Statics.field2028) {
            return;
        }
        int var22 = (this.field2117 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1943 > 0;
        int var26 = class135.field1993;
        int var28 = class135.field1994;
        boolean var30 = class135.field1998;
        if (class8.field235 && arg8 > 0) {
            if (class135.method3659(this, arg5, arg6, arg7)) {
                class8.field237.method3348(new class11(this, arg5, arg6, arg7, -65281));
            } else if (class8.field233 == class12.field279) {
                class8.field237.method3348(new class11(this, arg5, arg6, arg7, -16776961));
            }
        }
        if (class8.field234 && arg8 > 0) {
            int var33 = var11 - var12;
            if (var33 <= 50) {
                var33 = 50;
            }
            int var38;
            int var39;
            if (var14 > 0) {
                var38 = var15 / var13;
                var39 = var16 / var33;
            } else {
                var39 = var16 / var13;
                var38 = var15 / var33;
            }
            int var40;
            int var41;
            if (var17 > 0) {
                var40 = var21 / var13;
                var41 = var19 / var33;
            } else {
                var41 = var19 / var13;
                var40 = var21 / var33;
            }
            int var42 = -8355840;
            int var43 = var26 - Statics.field2016;
            int var44 = var28 - Statics.field2022;
            if (var43 > var38 && var43 < var39 && var44 > var40 && var44 < var41) {
                var42 = -256;
            }
            class8.method39(Statics.field2016 + var38, Statics.field2022 + var40, Statics.field2016 + var39, Statics.field2022 + var41, var42);
        }
        boolean var45 = false;
        if (arg8 > 0 && var30) {
            boolean var46 = false;
            if (field1980) {
                var46 = class135.method3659(this, arg5, arg6, arg7);
            } else {
                int var47 = var11 - var12;
                if (var47 <= 50) {
                    var47 = 50;
                }
                int var48;
                int var49;
                if (var14 > 0) {
                    var48 = var15 / var13;
                    var49 = var16 / var47;
                } else {
                    var49 = var16 / var13;
                    var48 = var15 / var47;
                }
                int var50;
                int var51;
                if (var17 > 0) {
                    var50 = var21 / var13;
                    var51 = var19 / var47;
                } else {
                    var51 = var19 / var13;
                    var50 = var21 / var47;
                }
                int var52 = var26 - Statics.field2016;
                int var53 = var28 - Statics.field2022;
                if (var52 > var48 && var52 < var49 && var53 > var50 && var53 < var51) {
                    var46 = true;
                }
            }
            if (var46) {
                if (this.field1950) {
                    class135.method1666(arg8);
                } else {
                    var45 = true;
                }
            }
        }
        int var54 = Statics.field2016;
        int var55 = Statics.field2022;
        int var56 = 0;
        int var57 = 0;
        if (arg0 != 0) {
            var56 = field1984[arg0];
            var57 = field1955[arg0];
        }
        for (int var58 = 0; var58 < this.field1927; var58++) {
            int var59 = this.field1928[var58];
            int var60 = this.field1929[var58];
            int var61 = this.field1932[var58];
            if (arg0 != 0) {
                int var62 = var56 * var61 + var57 * var59 >> 16;
                var61 = var57 * var61 - var56 * var59 >> 16;
                var59 = var62;
            }
            int var63 = arg5 + var59;
            int var64 = arg6 + var60;
            int var65 = arg7 + var61;
            int var66 = arg3 * var65 + arg4 * var63 >> 16;
            int var67 = arg4 * var65 - arg3 * var63 >> 16;
            int var69 = arg2 * var64 - arg1 * var67 >> 16;
            int var70 = arg1 * var64 + arg2 * var67 >> 16;
            field1983[var58] = var70 - var11;
            if (var70 >= 50) {
                field1979[var58] = class137.field2030 * var66 / var70 + var54;
                field1965[var58] = class137.field2030 * var69 / var70 + var55;
            } else {
                field1979[var58] = -5000;
                var23 = true;
            }
            if (var25) {
                field1967[var58] = var66;
                field1958[var58] = var69;
                field1969[var58] = var70;
            }
        }
        try {
            this.method2362(var23, var45, this.field1950, arg8);
        } catch (Exception var73) {
        }
    }

    @ObfuscatedName("eb.ap(ZZZI)V")
    public final void method2362(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1953 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1953; var5++) {
            field1971[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field232 && arg1) {
            class8.method53(this, var6);
        }
        for (int var7 = 0; var7 < this.field1931; var7++) {
            if (this.field1937[var7] != -2) {
                int var8 = this.field1987[var7];
                int var9 = this.field1933[var7];
                int var10 = this.field1934[var7];
                int var11 = field1979[var8];
                int var12 = field1979[var9];
                int var13 = field1979[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1967[var8];
                    int var15 = field1967[var9];
                    int var16 = field1967[var10];
                    int var17 = field1958[var8];
                    int var18 = field1958[var9];
                    int var19 = field1958[var10];
                    int var20 = field1969[var8];
                    int var21 = field1969[var9];
                    int var22 = field1969[var10];
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
                        field1963[var7] = true;
                        int var32 = (field1983[var8] + field1983[var9] + field1983[var10]) / 3 + this.field1954;
                        field1972[var32][field1971[var32]++] = var7;
                    }
                } else {
                    if (arg1) {
                        int var33 = field1965[var8];
                        int var34 = field1965[var9];
                        int var35 = field1965[var10];
                        int var36 = class135.field1994 + var6;
                        boolean var37;
                        if (var36 < var33 && var36 < var34 && var36 < var35) {
                            var37 = false;
                        } else {
                            int var38 = class135.field1994 - var6;
                            if (var38 > var33 && var38 > var34 && var38 > var35) {
                                var37 = false;
                            } else {
                                int var39 = class135.field1993 + var6;
                                if (var39 < var11 && var39 < var12 && var39 < var13) {
                                    var37 = false;
                                } else {
                                    int var40 = class135.field1993 - var6;
                                    if (var40 > var11 && var40 > var12 && var40 > var13) {
                                        var37 = false;
                                    } else {
                                        var37 = true;
                                    }
                                }
                            }
                        }
                        if (var37) {
                            class135.field1995[++class135.field2002 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1965[var10] - field1965[var9]) * (var11 - var12) - (field1965[var8] - field1965[var9]) * (var13 - var12) > 0) {
                        field1963[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field2011 && var12 <= Statics.field2011 && var13 <= Statics.field2011) {
                            field1990[var7] = false;
                        } else {
                            field1990[var7] = true;
                        }
                        int var42 = (field1983[var8] + field1983[var9] + field1983[var10]) / 3 + this.field1954;
                        field1972[var42][field1971[var42]++] = var7;
                    }
                }
            }
        }
        if (this.field1949 == null) {
            for (int var43 = this.field1953 - 1; var43 >= 0; var43--) {
                int var44 = field1971[var43];
                if (var44 > 0) {
                    int[] var45 = field1972[var43];
                    for (int var46 = 0; var46 < var44; var46++) {
                        this.method2380(var45[var46]);
                    }
                }
            }
            return;
        }
        for (int var47 = 0; var47 < 12; var47++) {
            field1973[var47] = 0;
            field1977[var47] = 0;
        }
        for (int var48 = this.field1953 - 1; var48 >= 0; var48--) {
            int var49 = field1971[var48];
            if (var49 > 0) {
                int[] var50 = field1972[var48];
                for (int var51 = 0; var51 < var49; var51++) {
                    int var52 = var50[var51];
                    byte var53 = this.field1949[var52];
                    int var54 = field1973[var53]++;
                    field1947[var53][var54] = var52;
                    if (var53 < 10) {
                        field1977[var53] += var48;
                    } else if (var53 == 10) {
                        field1975[var54] = var48;
                    } else {
                        field1970[var54] = var48;
                    }
                }
            }
        }
        int var55 = 0;
        if (field1973[1] > 0 || field1973[2] > 0) {
            var55 = (field1977[1] + field1977[2]) / (field1973[1] + field1973[2]);
        }
        int var56 = 0;
        if (field1973[3] > 0 || field1973[4] > 0) {
            var56 = (field1977[3] + field1977[4]) / (field1973[3] + field1973[4]);
        }
        int var57 = 0;
        if (field1973[6] > 0 || field1973[8] > 0) {
            var57 = (field1977[6] + field1977[8]) / (field1973[6] + field1973[8]);
        }
        int var58 = 0;
        int var59 = field1973[10];
        int[] var60 = field1947[10];
        int[] var61 = field1975;
        if (var58 == var59) {
            var58 = 0;
            var59 = field1973[11];
            var60 = field1947[11];
            var61 = field1970;
        }
        int var62;
        if (var58 < var59) {
            var62 = var61[var58];
        } else {
            var62 = -1000;
        }
        for (int var63 = 0; var63 < 10; var63++) {
            while (var63 == 0 && var62 > var55) {
                this.method2380(var60[var58++]);
                if (var58 == var59 && field1947[11] != var60) {
                    var58 = 0;
                    var59 = field1973[11];
                    var60 = field1947[11];
                    var61 = field1970;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 3 && var62 > var56) {
                this.method2380(var60[var58++]);
                if (var58 == var59 && field1947[11] != var60) {
                    var58 = 0;
                    var59 = field1973[11];
                    var60 = field1947[11];
                    var61 = field1970;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 5 && var62 > var57) {
                this.method2380(var60[var58++]);
                if (var58 == var59 && field1947[11] != var60) {
                    var58 = 0;
                    var59 = field1973[11];
                    var60 = field1947[11];
                    var61 = field1970;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            int var64 = field1973[var63];
            int[] var65 = field1947[var63];
            for (int var66 = 0; var66 < var64; var66++) {
                this.method2380(var65[var66]);
            }
        }
        while (var62 != -1000) {
            this.method2380(var60[var58++]);
            if (var58 == var59 && field1947[11] != var60) {
                var58 = 0;
                var60 = field1947[11];
                var59 = field1973[11];
                var61 = field1970;
            }
            if (var58 < var59) {
                var62 = var61[var58];
            } else {
                var62 = -1000;
            }
        }
    }

    @ObfuscatedName("eb.ar(I)V")
    public final void method2380(int arg0) {
        if (field1963[arg0]) {
            this.method2396(arg0);
            return;
        }
        int var2 = this.field1987[arg0];
        int var3 = this.field1933[arg0];
        int var4 = this.field1934[arg0];
        class137.field2025 = field1990[arg0];
        if (this.field1939 == null) {
            class137.field2013 = 0;
        } else {
            class137.field2013 = this.field1939[arg0] & 0xFF;
        }
        if (this.field1923 != null && this.field1923[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1940 == null || this.field1940[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1940[arg0] & 0xFF;
                var6 = this.field1944[var5];
                var7 = this.field1945[var5];
                var8 = this.field1946[var5];
            }
            if (this.field1937[arg0] == -1) {
                class137.method2446(field1965[var2], field1965[var3], field1965[var4], field1979[var2], field1979[var3], field1979[var4], this.field1935[arg0], this.field1935[arg0], this.field1935[arg0], field1967[var6], field1967[var7], field1967[var8], field1958[var6], field1958[var7], field1958[var8], field1969[var6], field1969[var7], field1969[var8], this.field1923[arg0]);
            } else {
                class137.method2446(field1965[var2], field1965[var3], field1965[var4], field1979[var2], field1979[var3], field1979[var4], this.field1935[arg0], this.field1936[arg0], this.field1937[arg0], field1967[var6], field1967[var7], field1967[var8], field1958[var6], field1958[var7], field1958[var8], field1969[var6], field1969[var7], field1969[var8], this.field1923[arg0]);
            }
        } else if (this.field1937[arg0] == -1) {
            class137.method2444(field1965[var2], field1965[var3], field1965[var4], field1979[var2], field1979[var3], field1979[var4], field1968[this.field1935[arg0]]);
        } else {
            class137.method2482(field1965[var2], field1965[var3], field1965[var4], field1979[var2], field1979[var3], field1979[var4], this.field1935[arg0], this.field1936[arg0], this.field1937[arg0]);
        }
    }

    @ObfuscatedName("eb.am(I)V")
    public final void method2396(int arg0) {
        int var2 = Statics.field2016;
        int var3 = Statics.field2022;
        int var4 = 0;
        int var5 = this.field1987[arg0];
        int var6 = this.field1933[arg0];
        int var7 = this.field1934[arg0];
        int var8 = field1969[var5];
        int var9 = field1969[var6];
        int var10 = field1969[var7];
        if (this.field1939 == null) {
            class137.field2013 = 0;
        } else {
            class137.field2013 = this.field1939[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1941[var4] = field1979[var5];
            field1978[var4] = field1965[var5];
            field1988[var4++] = this.field1935[arg0];
        } else {
            int var11 = field1967[var5];
            int var12 = field1958[var5];
            int var13 = this.field1935[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1986[var10 - var8];
                field1941[var4] = (((field1967[var7] - var11) * var14 >> 16) + var11) * class137.field2030 / 50 + var2;
                field1978[var4] = (((field1958[var7] - var12) * var14 >> 16) + var12) * class137.field2030 / 50 + var3;
                field1988[var4++] = ((this.field1937[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1986[var9 - var8];
                field1941[var4] = (((field1967[var6] - var11) * var15 >> 16) + var11) * class137.field2030 / 50 + var2;
                field1978[var4] = (((field1958[var6] - var12) * var15 >> 16) + var12) * class137.field2030 / 50 + var3;
                field1988[var4++] = ((this.field1936[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1941[var4] = field1979[var6];
            field1978[var4] = field1965[var6];
            field1988[var4++] = this.field1936[arg0];
        } else {
            int var16 = field1967[var6];
            int var17 = field1958[var6];
            int var18 = this.field1936[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1986[var8 - var9];
                field1941[var4] = (((field1967[var5] - var16) * var19 >> 16) + var16) * class137.field2030 / 50 + var2;
                field1978[var4] = (((field1958[var5] - var17) * var19 >> 16) + var17) * class137.field2030 / 50 + var3;
                field1988[var4++] = ((this.field1935[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1986[var10 - var9];
                field1941[var4] = (((field1967[var7] - var16) * var20 >> 16) + var16) * class137.field2030 / 50 + var2;
                field1978[var4] = (((field1958[var7] - var17) * var20 >> 16) + var17) * class137.field2030 / 50 + var3;
                field1988[var4++] = ((this.field1937[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1941[var4] = field1979[var7];
            field1978[var4] = field1965[var7];
            field1988[var4++] = this.field1937[arg0];
        } else {
            int var21 = field1967[var7];
            int var22 = field1958[var7];
            int var23 = this.field1937[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1986[var9 - var10];
                field1941[var4] = (((field1967[var6] - var21) * var24 >> 16) + var21) * class137.field2030 / 50 + var2;
                field1978[var4] = (((field1958[var6] - var22) * var24 >> 16) + var22) * class137.field2030 / 50 + var3;
                field1988[var4++] = ((this.field1936[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1986[var8 - var10];
                field1941[var4] = (((field1967[var5] - var21) * var25 >> 16) + var21) * class137.field2030 / 50 + var2;
                field1978[var4] = (((field1958[var5] - var22) * var25 >> 16) + var22) * class137.field2030 / 50 + var3;
                field1988[var4++] = ((this.field1935[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1941[0];
        int var27 = field1941[1];
        int var28 = field1941[2];
        int var29 = field1978[0];
        int var30 = field1978[1];
        int var31 = field1978[2];
        class137.field2025 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2011 || var27 > Statics.field2011 || var28 > Statics.field2011) {
                class137.field2025 = true;
            }
            if (this.field1923 != null && this.field1923[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1940 == null || this.field1940[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1940[arg0] & 0xFF;
                    var33 = this.field1944[var32];
                    var34 = this.field1945[var32];
                    var35 = this.field1946[var32];
                }
                if (this.field1937[arg0] == -1) {
                    class137.method2446(var29, var30, var31, var26, var27, var28, this.field1935[arg0], this.field1935[arg0], this.field1935[arg0], field1967[var33], field1967[var34], field1967[var35], field1958[var33], field1958[var34], field1958[var35], field1969[var33], field1969[var34], field1969[var35], this.field1923[arg0]);
                } else {
                    class137.method2446(var29, var30, var31, var26, var27, var28, field1988[0], field1988[1], field1988[2], field1967[var33], field1967[var34], field1967[var35], field1958[var33], field1958[var34], field1958[var35], field1969[var33], field1969[var34], field1969[var35], this.field1923[arg0]);
                }
            } else if (this.field1937[arg0] == -1) {
                class137.method2444(var29, var30, var31, var26, var27, var28, field1968[this.field1935[arg0]]);
            } else {
                class137.method2482(var29, var30, var31, var26, var27, var28, field1988[0], field1988[1], field1988[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2011 || var27 > Statics.field2011 || var28 > Statics.field2011 || field1941[3] < 0 || field1941[3] > Statics.field2011) {
            class137.field2025 = true;
        }
        if (this.field1923 != null && this.field1923[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1940 == null || this.field1940[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1940[arg0] & 0xFF;
                var37 = this.field1944[var36];
                var38 = this.field1945[var36];
                var39 = this.field1946[var36];
            }
            short var40 = this.field1923[arg0];
            if (this.field1937[arg0] == -1) {
                class137.method2446(var29, var30, var31, var26, var27, var28, this.field1935[arg0], this.field1935[arg0], this.field1935[arg0], field1967[var37], field1967[var38], field1967[var39], field1958[var37], field1958[var38], field1958[var39], field1969[var37], field1969[var38], field1969[var39], var40);
                class137.method2446(var29, var31, field1978[3], var26, var28, field1941[3], this.field1935[arg0], this.field1935[arg0], this.field1935[arg0], field1967[var37], field1967[var38], field1967[var39], field1958[var37], field1958[var38], field1958[var39], field1969[var37], field1969[var38], field1969[var39], var40);
            } else {
                class137.method2446(var29, var30, var31, var26, var27, var28, field1988[0], field1988[1], field1988[2], field1967[var37], field1967[var38], field1967[var39], field1958[var37], field1958[var38], field1958[var39], field1969[var37], field1969[var38], field1969[var39], var40);
                class137.method2446(var29, var31, field1978[3], var26, var28, field1941[3], field1988[0], field1988[2], field1988[3], field1967[var37], field1967[var38], field1967[var39], field1958[var37], field1958[var38], field1958[var39], field1969[var37], field1969[var38], field1969[var39], var40);
            }
        } else if (this.field1937[arg0] == -1) {
            int var41 = field1968[this.field1935[arg0]];
            class137.method2444(var29, var30, var31, var26, var27, var28, var41);
            class137.method2444(var29, var31, field1978[3], var26, var28, field1941[3], var41);
        } else {
            class137.method2482(var29, var30, var31, var26, var27, var28, field1988[0], field1988[1], field1988[2]);
            class137.method2482(var29, var31, field1978[3], var26, var28, field1941[3], field1988[0], field1988[2], field1988[3]);
        }
    }
}

package deob;

@ObfuscatedName("eo")
public class class135 extends class143 {

    @ObfuscatedName("eo.j")
    public static class135 field1952 = new class135();

    @ObfuscatedName("eo.h")
    public static byte[] field1956 = new byte[1];

    @ObfuscatedName("eo.f")
    public static class135 field1968 = new class135();

    @ObfuscatedName("eo.p")
    public static byte[] field1930 = new byte[1];

    @ObfuscatedName("eo.x")
    public int field1931 = 0;

    @ObfuscatedName("eo.g")
    public int[] field1932;

    @ObfuscatedName("eo.c")
    public int[] field1933;

    @ObfuscatedName("eo.l")
    public int[] field1934;

    @ObfuscatedName("eo.w")
    public int field1935 = 0;

    @ObfuscatedName("eo.b")
    public int[] field1936;

    @ObfuscatedName("eo.o")
    public int[] field1937;

    @ObfuscatedName("eo.m")
    public int[] field1938;

    @ObfuscatedName("eo.i")
    public int[] field1947;

    @ObfuscatedName("eo.s")
    public int[] field1940;

    @ObfuscatedName("eo.r")
    public int[] field1941;

    @ObfuscatedName("eo.e")
    public byte[] field1942;

    @ObfuscatedName("eo.a")
    public byte[] field1973;

    @ObfuscatedName("eo.v")
    public byte[] field1944;

    @ObfuscatedName("eo.t")
    public short[] field1945;

    @ObfuscatedName("eo.y")
    public byte field1978 = 0;

    @ObfuscatedName("eo.z")
    public int field1950 = 0;

    @ObfuscatedName("eo.u")
    public int[] field1948;

    @ObfuscatedName("eo.k")
    public int[] field1949;

    @ObfuscatedName("eo.q")
    public int[] field1928;

    @ObfuscatedName("eo.n")
    public int[][] field1964;

    @ObfuscatedName("eo.d")
    public int[][] field1961;

    @ObfuscatedName("eo.ax")
    public boolean field1991 = false;

    @ObfuscatedName("eo.ao")
    public int field1954;

    @ObfuscatedName("eo.an")
    public int field1987;

    @ObfuscatedName("eo.ar")
    public int field1980;

    @ObfuscatedName("eo.ag")
    public int field1957;

    @ObfuscatedName("eo.av")
    public int field1955;

    @ObfuscatedName("eo.ab")
    public int field1970;

    @ObfuscatedName("eo.aj")
    public int field1960;

    @ObfuscatedName("eo.ae")
    public int field1988;

    @ObfuscatedName("eo.at")
    public int field1943 = -1;

    @ObfuscatedName("eo.as")
    public int field1963 = -1;

    @ObfuscatedName("eo.af")
    public int field1984 = -1;

    @ObfuscatedName("eo.az")
    public static boolean[] field1927 = new boolean[4700];

    @ObfuscatedName("eo.al")
    public static boolean[] field1967 = new boolean[4700];

    @ObfuscatedName("eo.am")
    public static int[] field1953 = new int[4700];

    @ObfuscatedName("eo.ah")
    public static int[] field1969 = new int[4700];

    @ObfuscatedName("eo.ap")
    public static int[] field1965 = new int[4700];

    @ObfuscatedName("eo.ad")
    public static int[] field1971 = new int[4700];

    @ObfuscatedName("eo.aa")
    public static int[] field1972 = new int[4700];

    @ObfuscatedName("eo.aw")
    public static int[] field1985 = new int[4700];

    @ObfuscatedName("eo.ai")
    public static int[] field1975 = new int[1600];

    @ObfuscatedName("eo.ak")
    public static int[][] field1976 = new int[1600][512];

    @ObfuscatedName("eo.ac")
    public static int[] field1977 = new int[12];

    @ObfuscatedName("eo.ay")
    public static int[][] field1959 = new int[12][2000];

    @ObfuscatedName("eo.bk")
    public static int[] field1929 = new int[2000];

    @ObfuscatedName("eo.bi")
    public static int[] field1958 = new int[2000];

    @ObfuscatedName("eo.ba")
    public static int[] field1981 = new int[12];

    @ObfuscatedName("eo.bn")
    public static int[] field1982 = new int[10];

    @ObfuscatedName("eo.by")
    public static int[] field1983 = new int[10];

    @ObfuscatedName("eo.bc")
    public static int[] field1966 = new int[10];

    @ObfuscatedName("eo.bp")
    public static boolean field1939 = true;

    @ObfuscatedName("eo.bb")
    public static int[] field1946 = class138.field2041;

    @ObfuscatedName("eo.bd")
    public static int[] field1992 = class138.field2030;

    @ObfuscatedName("eo.bq")
    public static int[] field1993 = class138.field2036;

    @ObfuscatedName("eo.be")
    public static int[] field1994 = class138.field2040;

    public class135() {
    }

    public class135(class135[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1931 = 0;
        this.field1935 = 0;
        this.field1950 = 0;
        this.field1978 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class135 var8 = arg0[var7];
            if (var8 != null) {
                this.field1931 += var8.field1931;
                this.field1935 += var8.field1935;
                this.field1950 += var8.field1950;
                if (var8.field1942 == null) {
                    if (this.field1978 == -1) {
                        this.field1978 = var8.field1978;
                    }
                    if (this.field1978 != var8.field1978) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1973 != null;
                var5 |= var8.field1945 != null;
                var6 |= var8.field1944 != null;
            }
        }
        this.field1932 = new int[this.field1931];
        this.field1933 = new int[this.field1931];
        this.field1934 = new int[this.field1931];
        this.field1936 = new int[this.field1935];
        this.field1937 = new int[this.field1935];
        this.field1938 = new int[this.field1935];
        this.field1947 = new int[this.field1935];
        this.field1940 = new int[this.field1935];
        this.field1941 = new int[this.field1935];
        if (var3) {
            this.field1942 = new byte[this.field1935];
        }
        if (var4) {
            this.field1973 = new byte[this.field1935];
        }
        if (var5) {
            this.field1945 = new short[this.field1935];
        }
        if (var6) {
            this.field1944 = new byte[this.field1935];
        }
        if (this.field1950 > 0) {
            this.field1948 = new int[this.field1950];
            this.field1949 = new int[this.field1950];
            this.field1928 = new int[this.field1950];
        }
        this.field1931 = 0;
        this.field1935 = 0;
        this.field1950 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class135 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1935; var11++) {
                    this.field1936[this.field1935] = var10.field1936[var11] + this.field1931;
                    this.field1937[this.field1935] = var10.field1937[var11] + this.field1931;
                    this.field1938[this.field1935] = var10.field1938[var11] + this.field1931;
                    this.field1947[this.field1935] = var10.field1947[var11];
                    this.field1940[this.field1935] = var10.field1940[var11];
                    this.field1941[this.field1935] = var10.field1941[var11];
                    if (var3) {
                        if (var10.field1942 == null) {
                            this.field1942[this.field1935] = var10.field1978;
                        } else {
                            this.field1942[this.field1935] = var10.field1942[var11];
                        }
                    }
                    if (var4 && var10.field1973 != null) {
                        this.field1973[this.field1935] = var10.field1973[var11];
                    }
                    if (var5) {
                        if (var10.field1945 == null) {
                            this.field1945[this.field1935] = -1;
                        } else {
                            this.field1945[this.field1935] = var10.field1945[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1944 == null || var10.field1944[var11] == -1) {
                            this.field1944[this.field1935] = -1;
                        } else {
                            this.field1944[this.field1935] = (byte) (var10.field1944[var11] + this.field1950);
                        }
                    }
                    this.field1935++;
                }
                for (int var12 = 0; var12 < var10.field1950; var12++) {
                    this.field1948[this.field1950] = var10.field1948[var12] + this.field1931;
                    this.field1949[this.field1950] = var10.field1949[var12] + this.field1931;
                    this.field1928[this.field1950] = var10.field1928[var12] + this.field1931;
                    this.field1950++;
                }
                for (int var13 = 0; var13 < var10.field1931; var13++) {
                    this.field1932[this.field1931] = var10.field1932[var13];
                    this.field1933[this.field1931] = var10.field1933[var13];
                    this.field1934[this.field1931] = var10.field1934[var13];
                    this.field1931++;
                }
            }
        }
    }

    @ObfuscatedName("eo.j([[IIIIZI)Leo;")
    public class135 method2301(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2305();
        int var7 = arg1 - this.field1980;
        int var8 = this.field1980 + arg1;
        int var9 = arg3 - this.field1980;
        int var10 = this.field1980 + arg3;
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
        class135 var15;
        if (arg4) {
            var15 = new class135();
            var15.field1931 = this.field1931;
            var15.field1935 = this.field1935;
            var15.field1950 = this.field1950;
            var15.field1932 = this.field1932;
            var15.field1934 = this.field1934;
            var15.field1936 = this.field1936;
            var15.field1937 = this.field1937;
            var15.field1938 = this.field1938;
            var15.field1947 = this.field1947;
            var15.field1940 = this.field1940;
            var15.field1941 = this.field1941;
            var15.field1942 = this.field1942;
            var15.field1973 = this.field1973;
            var15.field1944 = this.field1944;
            var15.field1945 = this.field1945;
            var15.field1978 = this.field1978;
            var15.field1948 = this.field1948;
            var15.field1949 = this.field1949;
            var15.field1928 = this.field1928;
            var15.field1964 = this.field1964;
            var15.field1961 = this.field1961;
            var15.field1991 = this.field1991;
            var15.field1933 = new int[var15.field1931];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1931; var16++) {
                int var17 = this.field1932[var16] + arg1;
                int var18 = this.field1934[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1933[var16] = this.field1933[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1931; var26++) {
                int var27 = (-this.field1933[var26] << 16) / this.field2130;
                if (var27 < arg5) {
                    int var28 = this.field1932[var26] + arg1;
                    int var29 = this.field1934[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1933[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1933[var26];
                }
            }
        }
        var15.method2323();
        return var15;
    }

    @ObfuscatedName("eo.h(Z)Leo;")
    public class135 method2302(boolean arg0) {
        if (!arg0 && field1956.length < this.field1935) {
            field1956 = new byte[this.field1935 + 100];
        }
        return this.method2339(arg0, field1952, field1956);
    }

    @ObfuscatedName("eo.p(Z)Leo;")
    public class135 method2303(boolean arg0) {
        if (!arg0 && field1930.length < this.field1935) {
            field1930 = new byte[this.field1935 + 100];
        }
        return this.method2339(arg0, field1968, field1930);
    }

    @ObfuscatedName("eo.x(ZLeo;[B)Leo;")
    public class135 method2339(boolean arg0, class135 arg1, byte[] arg2) {
        arg1.field1931 = this.field1931;
        arg1.field1935 = this.field1935;
        arg1.field1950 = this.field1950;
        if (arg1.field1932 == null || arg1.field1932.length < this.field1931) {
            arg1.field1932 = new int[this.field1931 + 100];
            arg1.field1933 = new int[this.field1931 + 100];
            arg1.field1934 = new int[this.field1931 + 100];
        }
        for (int var4 = 0; var4 < this.field1931; var4++) {
            arg1.field1932[var4] = this.field1932[var4];
            arg1.field1933[var4] = this.field1933[var4];
            arg1.field1934[var4] = this.field1934[var4];
        }
        if (arg0) {
            arg1.field1973 = this.field1973;
        } else {
            arg1.field1973 = arg2;
            if (this.field1973 == null) {
                for (int var5 = 0; var5 < this.field1935; var5++) {
                    arg1.field1973[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1935; var6++) {
                    arg1.field1973[var6] = this.field1973[var6];
                }
            }
        }
        arg1.field1936 = this.field1936;
        arg1.field1937 = this.field1937;
        arg1.field1938 = this.field1938;
        arg1.field1947 = this.field1947;
        arg1.field1940 = this.field1940;
        arg1.field1941 = this.field1941;
        arg1.field1942 = this.field1942;
        arg1.field1944 = this.field1944;
        arg1.field1945 = this.field1945;
        arg1.field1978 = this.field1978;
        arg1.field1948 = this.field1948;
        arg1.field1949 = this.field1949;
        arg1.field1928 = this.field1928;
        arg1.field1964 = this.field1964;
        arg1.field1961 = this.field1961;
        arg1.field1991 = this.field1991;
        arg1.method2323();
        return arg1;
    }

    @ObfuscatedName("eo.g(I)V")
    public void method2317(int arg0) {
        if (this.field1943 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1992[arg0];
        int var9 = field1946[arg0];
        for (int var10 = 0; var10 < this.field1931; var10++) {
            int var11 = class138.method2403(this.field1932[var10], this.field1934[var10], var8, var9);
            int var12 = this.field1933[var10];
            int var13 = class138.method2410(this.field1932[var10], this.field1934[var10], var8, var9);
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
        this.field1970 = (var2 + var5) / 2;
        this.field1960 = (var3 + var6) / 2;
        this.field1988 = (var4 + var7) / 2;
        this.field1943 = (var5 - var2 + 1) / 2;
        this.field1963 = (var6 - var3 + 1) / 2;
        this.field1984 = (var7 - var4 + 1) / 2;
        if (this.field1943 < 32) {
            this.field1943 = 32;
        }
        if (this.field1984 < 32) {
            this.field1984 = 32;
        }
        if (this.field1991) {
            this.field1943 += 8;
            this.field1984 += 8;
        }
    }

    @ObfuscatedName("eo.c()V")
    public void method2305() {
        if (this.field1954 == 1) {
            return;
        }
        this.field1954 = 1;
        this.field2130 = 0;
        this.field1987 = 0;
        this.field1980 = 0;
        for (int var1 = 0; var1 < this.field1931; var1++) {
            int var2 = this.field1932[var1];
            int var3 = this.field1933[var1];
            int var4 = this.field1934[var1];
            if (-var3 > this.field2130) {
                this.field2130 = -var3;
            }
            if (var3 > this.field1987) {
                this.field1987 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1980) {
                this.field1980 = var5;
            }
        }
        this.field1980 = (int) (Math.sqrt((double) this.field1980) + 0.99D);
        this.field1955 = (int) (Math.sqrt((double) (this.field2130 * this.field2130 + this.field1980 * this.field1980)) + 0.99D);
        this.field1957 = this.field1955 + (int) (Math.sqrt((double) (this.field1987 * this.field1987 + this.field1980 * this.field1980)) + 0.99D);
    }

    @ObfuscatedName("eo.l()V")
    public void method2306() {
        if (this.field1954 == 2) {
            return;
        }
        this.field1954 = 2;
        this.field1980 = 0;
        for (int var1 = 0; var1 < this.field1931; var1++) {
            int var2 = this.field1932[var1];
            int var3 = this.field1933[var1];
            int var4 = this.field1934[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1980) {
                this.field1980 = var5;
            }
        }
        this.field1980 = (int) (Math.sqrt((double) this.field1980) + 0.99D);
        this.field1955 = this.field1980;
        this.field1957 = this.field1980 + this.field1980;
    }

    @ObfuscatedName("eo.w()I")
    public int method2307() {
        this.method2305();
        return this.field1980;
    }

    @ObfuscatedName("eo.b()V")
    public void method2323() {
        this.field1954 = 0;
        this.field1943 = -1;
    }

    @ObfuscatedName("eo.o(Lef;I)V")
    public void method2308(class146 arg0, int arg1) {
        if (this.field1964 == null || arg1 == -1) {
            return;
        }
        class133 var3 = arg0.field2152[arg1];
        class140 var4 = var3.field1893;
        Statics.field1979 = 0;
        Statics.field1986 = 0;
        Statics.field1962 = 0;
        for (int var5 = 0; var5 < var3.field1895; var5++) {
            int var6 = var3.field1897[var5];
            this.method2357(var4.field2054[var6], var4.field2059[var6], var3.field1898[var5], var3.field1899[var5], var3.field1900[var5]);
        }
        this.method2323();
    }

    @ObfuscatedName("eo.e(Lef;ILef;I[I)V")
    public void method2329(class146 arg0, int arg1, class146 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2308(arg0, arg1);
            return;
        }
        class133 var6 = arg0.field2152[arg1];
        class133 var7 = arg2.field2152[arg3];
        class140 var8 = var6.field1893;
        Statics.field1979 = 0;
        Statics.field1986 = 0;
        Statics.field1962 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1895; var11++) {
            int var12 = var6.field1897[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2054[var12] == 0) {
                this.method2357(var8.field2054[var12], var8.field2059[var12], var6.field1898[var11], var6.field1899[var11], var6.field1900[var11]);
            }
        }
        Statics.field1979 = 0;
        Statics.field1986 = 0;
        Statics.field1962 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1895; var15++) {
            int var16 = var7.field1897[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2054[var16] == 0) {
                this.method2357(var8.field2054[var16], var8.field2059[var16], var7.field1898[var15], var7.field1899[var15], var7.field1900[var15]);
            }
        }
        this.method2323();
    }

    @ObfuscatedName("eo.a(I[IIII)V")
    public void method2357(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1979 = 0;
            Statics.field1986 = 0;
            Statics.field1962 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1964.length) {
                    int[] var10 = this.field1964[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1979 += this.field1932[var12];
                        Statics.field1986 += this.field1933[var12];
                        Statics.field1962 += this.field1934[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1979 = Statics.field1979 / var7 + arg2;
                Statics.field1986 = Statics.field1986 / var7 + arg3;
                Statics.field1962 = Statics.field1962 / var7 + arg4;
            } else {
                Statics.field1979 = arg2;
                Statics.field1986 = arg3;
                Statics.field1962 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1964.length) {
                    int[] var15 = this.field1964[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1932[var17] += arg2;
                        this.field1933[var17] += arg3;
                        this.field1934[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1964.length) {
                    int[] var20 = this.field1964[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1932[var22] -= Statics.field1979;
                        this.field1933[var22] -= Statics.field1986;
                        this.field1934[var22] -= Statics.field1962;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1946[var25];
                            int var27 = field1992[var25];
                            int var28 = this.field1933[var22] * var26 + this.field1932[var22] * var27 >> 16;
                            this.field1933[var22] = this.field1933[var22] * var27 - this.field1932[var22] * var26 >> 16;
                            this.field1932[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1946[var23];
                            int var30 = field1992[var23];
                            int var31 = this.field1933[var22] * var30 - this.field1934[var22] * var29 >> 16;
                            this.field1934[var22] = this.field1934[var22] * var30 + this.field1933[var22] * var29 >> 16;
                            this.field1933[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1946[var24];
                            int var33 = field1992[var24];
                            int var34 = this.field1934[var22] * var32 + this.field1932[var22] * var33 >> 16;
                            this.field1934[var22] = this.field1934[var22] * var33 - this.field1932[var22] * var32 >> 16;
                            this.field1932[var22] = var34;
                        }
                        this.field1932[var22] += Statics.field1979;
                        this.field1933[var22] += Statics.field1986;
                        this.field1934[var22] += Statics.field1962;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1964.length) {
                    int[] var37 = this.field1964[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1932[var39] -= Statics.field1979;
                        this.field1933[var39] -= Statics.field1986;
                        this.field1934[var39] -= Statics.field1962;
                        this.field1932[var39] = this.field1932[var39] * arg2 / 128;
                        this.field1933[var39] = this.field1933[var39] * arg3 / 128;
                        this.field1934[var39] = this.field1934[var39] * arg4 / 128;
                        this.field1932[var39] += Statics.field1979;
                        this.field1933[var39] += Statics.field1986;
                        this.field1934[var39] += Statics.field1962;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1961 != null && this.field1973 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1961.length) {
                    int[] var42 = this.field1961[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1973[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1973[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("eo.v()V")
    public void method2312() {
        for (int var1 = 0; var1 < this.field1931; var1++) {
            int var2 = this.field1932[var1];
            this.field1932[var1] = this.field1934[var1];
            this.field1934[var1] = -var2;
        }
        this.method2323();
    }

    @ObfuscatedName("eo.t()V")
    public void method2336() {
        for (int var1 = 0; var1 < this.field1931; var1++) {
            this.field1932[var1] = -this.field1932[var1];
            this.field1934[var1] = -this.field1934[var1];
        }
        this.method2323();
    }

    @ObfuscatedName("eo.y()V")
    public void method2313() {
        for (int var1 = 0; var1 < this.field1931; var1++) {
            int var2 = this.field1934[var1];
            this.field1934[var1] = this.field1932[var1];
            this.field1932[var1] = -var2;
        }
        this.method2323();
    }

    @ObfuscatedName("eo.u(I)V")
    public void method2314(int arg0) {
        int var2 = field1946[arg0];
        int var3 = field1992[arg0];
        for (int var4 = 0; var4 < this.field1931; var4++) {
            int var5 = this.field1933[var4] * var3 - this.field1934[var4] * var2 >> 16;
            this.field1934[var4] = this.field1934[var4] * var3 + this.field1933[var4] * var2 >> 16;
            this.field1933[var4] = var5;
        }
        this.method2323();
    }

    @ObfuscatedName("eo.n(III)V")
    public void method2315(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1931; var4++) {
            this.field1932[var4] += arg0;
            this.field1933[var4] += arg1;
            this.field1934[var4] += arg2;
        }
        this.method2323();
    }

    @ObfuscatedName("eo.d(III)V")
    public void method2316(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1931; var4++) {
            this.field1932[var4] = this.field1932[var4] * arg0 / 128;
            this.field1933[var4] = this.field1933[var4] * arg1 / 128;
            this.field1934[var4] = this.field1934[var4] * arg2 / 128;
        }
        this.method2323();
    }

    @ObfuscatedName("eo.ax(IIIIIII)V")
    public final void method2340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1975[0] = -1;
        if (this.field1954 != 2 && this.field1954 != 1) {
            this.method2306();
        }
        int var8 = Statics.field2028;
        int var9 = Statics.field2029;
        int var10 = field1946[arg0];
        int var11 = field1992[arg0];
        int var12 = field1946[arg1];
        int var13 = field1992[arg1];
        int var14 = field1946[arg2];
        int var15 = field1992[arg2];
        int var16 = field1946[arg3];
        int var17 = field1992[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1931; var19++) {
            int var20 = this.field1932[var19];
            int var21 = this.field1933[var19];
            int var22 = this.field1934[var19];
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
            field1965[var19] = var30 - var18;
            field1953[var19] = class138.field2027 * var26 / var30 + var8;
            field1969[var19] = class138.field2027 * var29 / var30 + var9;
            if (this.field1950 > 0) {
                field1971[var19] = var26;
                field1972[var19] = var29;
                field1985[var19] = var30;
            }
        }
        try {
            this.method2311(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("eo.ao(IIIIIIII)V")
    public final void method2318(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1975[0] = -1;
        if (this.field1954 != 2 && this.field1954 != 1) {
            this.method2306();
        }
        int var9 = Statics.field2028;
        int var10 = Statics.field2029;
        int var11 = field1946[arg0];
        int var12 = field1992[arg0];
        int var13 = field1946[arg1];
        int var14 = field1992[arg1];
        int var15 = field1946[arg2];
        int var16 = field1992[arg2];
        int var17 = field1946[arg3];
        int var18 = field1992[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1931; var20++) {
            int var21 = this.field1932[var20];
            int var22 = this.field1933[var20];
            int var23 = this.field1934[var20];
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
            field1965[var20] = var31 - var19;
            field1953[var20] = class138.field2027 * var27 / arg7 + var9;
            field1969[var20] = class138.field2027 * var30 / arg7 + var10;
            if (this.field1950 > 0) {
                field1971[var20] = var27;
                field1972[var20] = var30;
                field1985[var20] = var31;
            }
        }
        try {
            this.method2311(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("eo.ci(IIIIIIIII)V")
    public void method2319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1975[0] = -1;
        if (this.field1954 != 1) {
            this.method2305();
        }
        this.method2317(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1980 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1980) * class138.field2027;
        if (var15 / var13 >= Statics.field2033) {
            return;
        }
        int var16 = (this.field1980 + var14) * class138.field2027;
        if (var16 / var13 <= Statics.field2026) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1980 * arg1 >> 16;
        int var19 = (var17 + var18) * class138.field2027;
        if (var19 / var13 <= Statics.field2034) {
            return;
        }
        int var20 = (this.field2130 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class138.field2027;
        if (var21 / var13 >= Statics.field2035) {
            return;
        }
        int var22 = (this.field2130 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1950 > 0;
        int var26 = class136.field1997;
        int var28 = class136.field1999;
        boolean var30 = class136.method2203();
        if (class8.field228 && arg8 > 0) {
            if (class136.method1036(this, arg5, arg6, arg7)) {
                class8.method3585(this, arg5, arg6, arg7, -65281);
            } else if (class8.field231 == class12.field264) {
                class8.method3585(this, arg5, arg6, arg7, -16776961);
            }
        }
        if (class8.field229 && arg8 > 0) {
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
            int var42 = var26 - Statics.field2028;
            int var43 = var28 - Statics.field2029;
            if (var42 > var37 && var42 < var38 && var43 > var39 && var43 < var40) {
                var41 = -256;
            }
            class8.method1(Statics.field2028 + var37, Statics.field2029 + var39, Statics.field2028 + var38, Statics.field2029 + var40, var41);
        }
        boolean var44 = false;
        if (arg8 > 0 && var30) {
            boolean var45 = false;
            if (field1939) {
                var45 = class136.method1036(this, arg5, arg6, arg7);
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
                int var51 = var26 - Statics.field2028;
                int var52 = var28 - Statics.field2029;
                if (var51 > var47 && var51 < var48 && var52 > var49 && var52 < var50) {
                    var45 = true;
                }
            }
            if (var45) {
                if (this.field1991) {
                    class136.method215(arg8);
                } else {
                    var44 = true;
                }
            }
        }
        int var53 = Statics.field2028;
        int var54 = Statics.field2029;
        int var55 = 0;
        int var56 = 0;
        if (arg0 != 0) {
            var55 = field1946[arg0];
            var56 = field1992[arg0];
        }
        for (int var57 = 0; var57 < this.field1931; var57++) {
            int var58 = this.field1932[var57];
            int var59 = this.field1933[var57];
            int var60 = this.field1934[var57];
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
            field1965[var57] = var69 - var11;
            if (var69 >= 50) {
                field1953[var57] = class138.field2027 * var65 / var69 + var53;
                field1969[var57] = class138.field2027 * var68 / var69 + var54;
            } else {
                field1953[var57] = -5000;
                var23 = true;
            }
            if (var25) {
                field1971[var57] = var65;
                field1972[var57] = var68;
                field1985[var57] = var69;
            }
        }
        try {
            this.method2311(var23, var44, this.field1991, arg8);
        } catch (Exception var72) {
        }
    }

    @ObfuscatedName("eo.an(ZZZI)V")
    public final void method2311(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1957 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1957; var5++) {
            field1975[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field230 && arg1) {
            class8.method106(this, var6);
        }
        for (int var7 = 0; var7 < this.field1935; var7++) {
            if (this.field1941[var7] != -2) {
                int var8 = this.field1936[var7];
                int var9 = this.field1937[var7];
                int var10 = this.field1938[var7];
                int var11 = field1953[var8];
                int var12 = field1953[var9];
                int var13 = field1953[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1971[var8];
                    int var15 = field1971[var9];
                    int var16 = field1971[var10];
                    int var17 = field1972[var8];
                    int var18 = field1972[var9];
                    int var19 = field1972[var10];
                    int var20 = field1985[var8];
                    int var21 = field1985[var9];
                    int var22 = field1985[var10];
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
                        field1967[var7] = true;
                        int var32 = (field1965[var8] + field1965[var9] + field1965[var10]) / 3 + this.field1955;
                        field1976[var32][field1975[var32]++] = var7;
                    }
                } else {
                    if (arg1 && class136.method2205(field1969[var8], field1969[var9], field1969[var10], var11, var12, var13, var6)) {
                        class136.method215(arg3);
                        arg1 = false;
                    }
                    if ((field1969[var10] - field1969[var9]) * (var11 - var12) - (field1969[var8] - field1969[var9]) * (var13 - var12) > 0) {
                        field1967[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field2042 && var12 <= Statics.field2042 && var13 <= Statics.field2042) {
                            field1927[var7] = false;
                        } else {
                            field1927[var7] = true;
                        }
                        int var33 = (field1965[var8] + field1965[var9] + field1965[var10]) / 3 + this.field1955;
                        field1976[var33][field1975[var33]++] = var7;
                    }
                }
            }
        }
        if (this.field1942 == null) {
            for (int var34 = this.field1957 - 1; var34 >= 0; var34--) {
                int var35 = field1975[var34];
                if (var35 > 0) {
                    int[] var36 = field1976[var34];
                    for (int var37 = 0; var37 < var35; var37++) {
                        this.method2349(var36[var37]);
                    }
                }
            }
            return;
        }
        for (int var38 = 0; var38 < 12; var38++) {
            field1977[var38] = 0;
            field1981[var38] = 0;
        }
        for (int var39 = this.field1957 - 1; var39 >= 0; var39--) {
            int var40 = field1975[var39];
            if (var40 > 0) {
                int[] var41 = field1976[var39];
                for (int var42 = 0; var42 < var40; var42++) {
                    int var43 = var41[var42];
                    byte var44 = this.field1942[var43];
                    int var45 = field1977[var44]++;
                    field1959[var44][var45] = var43;
                    if (var44 < 10) {
                        field1981[var44] += var39;
                    } else if (var44 == 10) {
                        field1929[var45] = var39;
                    } else {
                        field1958[var45] = var39;
                    }
                }
            }
        }
        int var46 = 0;
        if (field1977[1] > 0 || field1977[2] > 0) {
            var46 = (field1981[1] + field1981[2]) / (field1977[1] + field1977[2]);
        }
        int var47 = 0;
        if (field1977[3] > 0 || field1977[4] > 0) {
            var47 = (field1981[3] + field1981[4]) / (field1977[3] + field1977[4]);
        }
        int var48 = 0;
        if (field1977[6] > 0 || field1977[8] > 0) {
            var48 = (field1981[6] + field1981[8]) / (field1977[6] + field1977[8]);
        }
        int var49 = 0;
        int var50 = field1977[10];
        int[] var51 = field1959[10];
        int[] var52 = field1929;
        if (var49 == var50) {
            var49 = 0;
            var50 = field1977[11];
            var51 = field1959[11];
            var52 = field1958;
        }
        int var53;
        if (var49 < var50) {
            var53 = var52[var49];
        } else {
            var53 = -1000;
        }
        for (int var54 = 0; var54 < 10; var54++) {
            while (var54 == 0 && var53 > var46) {
                this.method2349(var51[var49++]);
                if (var49 == var50 && field1959[11] != var51) {
                    var49 = 0;
                    var50 = field1977[11];
                    var51 = field1959[11];
                    var52 = field1958;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            while (var54 == 3 && var53 > var47) {
                this.method2349(var51[var49++]);
                if (var49 == var50 && field1959[11] != var51) {
                    var49 = 0;
                    var50 = field1977[11];
                    var51 = field1959[11];
                    var52 = field1958;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            while (var54 == 5 && var53 > var48) {
                this.method2349(var51[var49++]);
                if (var49 == var50 && field1959[11] != var51) {
                    var49 = 0;
                    var50 = field1977[11];
                    var51 = field1959[11];
                    var52 = field1958;
                }
                if (var49 < var50) {
                    var53 = var52[var49];
                } else {
                    var53 = -1000;
                }
            }
            int var55 = field1977[var54];
            int[] var56 = field1959[var54];
            for (int var57 = 0; var57 < var55; var57++) {
                this.method2349(var56[var57]);
            }
        }
        while (var53 != -1000) {
            this.method2349(var51[var49++]);
            if (var49 == var50 && field1959[11] != var51) {
                var49 = 0;
                var51 = field1959[11];
                var50 = field1977[11];
                var52 = field1958;
            }
            if (var49 < var50) {
                var53 = var52[var49];
            } else {
                var53 = -1000;
            }
        }
    }

    @ObfuscatedName("eo.ar(I)V")
    public final void method2349(int arg0) {
        if (field1967[arg0]) {
            this.method2322(arg0);
            return;
        }
        int var2 = this.field1936[arg0];
        int var3 = this.field1937[arg0];
        int var4 = this.field1938[arg0];
        class138.field2039 = field1927[arg0];
        if (this.field1973 == null) {
            class138.field2020 = 0;
        } else {
            class138.field2020 = this.field1973[arg0] & 0xFF;
        }
        if (this.field1945 != null && this.field1945[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1944 == null || this.field1944[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1944[arg0] & 0xFF;
                var6 = this.field1948[var5];
                var7 = this.field1949[var5];
                var8 = this.field1928[var5];
            }
            if (this.field1941[arg0] == -1) {
                class138.method2404(field1969[var2], field1969[var3], field1969[var4], field1953[var2], field1953[var3], field1953[var4], this.field1947[arg0], this.field1947[arg0], this.field1947[arg0], field1971[var6], field1971[var7], field1971[var8], field1972[var6], field1972[var7], field1972[var8], field1985[var6], field1985[var7], field1985[var8], this.field1945[arg0]);
            } else {
                class138.method2404(field1969[var2], field1969[var3], field1969[var4], field1953[var2], field1953[var3], field1953[var4], this.field1947[arg0], this.field1940[arg0], this.field1941[arg0], field1971[var6], field1971[var7], field1971[var8], field1972[var6], field1972[var7], field1972[var8], field1985[var6], field1985[var7], field1985[var8], this.field1945[arg0]);
            }
        } else if (this.field1941[arg0] == -1) {
            class138.method2402(field1969[var2], field1969[var3], field1969[var4], field1953[var2], field1953[var3], field1953[var4], field1993[this.field1947[arg0]]);
        } else {
            class138.method2400(field1969[var2], field1969[var3], field1969[var4], field1953[var2], field1953[var3], field1953[var4], this.field1947[arg0], this.field1940[arg0], this.field1941[arg0]);
        }
    }

    @ObfuscatedName("eo.ag(I)V")
    public final void method2322(int arg0) {
        int var2 = Statics.field2028;
        int var3 = Statics.field2029;
        int var4 = 0;
        int var5 = this.field1936[arg0];
        int var6 = this.field1937[arg0];
        int var7 = this.field1938[arg0];
        int var8 = field1985[var5];
        int var9 = field1985[var6];
        int var10 = field1985[var7];
        if (this.field1973 == null) {
            class138.field2020 = 0;
        } else {
            class138.field2020 = this.field1973[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1982[var4] = field1953[var5];
            field1983[var4] = field1969[var5];
            field1966[var4++] = this.field1947[arg0];
        } else {
            int var11 = field1971[var5];
            int var12 = field1972[var5];
            int var13 = this.field1947[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1994[var10 - var8];
                field1982[var4] = (((field1971[var7] - var11) * var14 >> 16) + var11) * class138.field2027 / 50 + var2;
                field1983[var4] = (((field1972[var7] - var12) * var14 >> 16) + var12) * class138.field2027 / 50 + var3;
                field1966[var4++] = ((this.field1941[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1994[var9 - var8];
                field1982[var4] = (((field1971[var6] - var11) * var15 >> 16) + var11) * class138.field2027 / 50 + var2;
                field1983[var4] = (((field1972[var6] - var12) * var15 >> 16) + var12) * class138.field2027 / 50 + var3;
                field1966[var4++] = ((this.field1940[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1982[var4] = field1953[var6];
            field1983[var4] = field1969[var6];
            field1966[var4++] = this.field1940[arg0];
        } else {
            int var16 = field1971[var6];
            int var17 = field1972[var6];
            int var18 = this.field1940[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1994[var8 - var9];
                field1982[var4] = (((field1971[var5] - var16) * var19 >> 16) + var16) * class138.field2027 / 50 + var2;
                field1983[var4] = (((field1972[var5] - var17) * var19 >> 16) + var17) * class138.field2027 / 50 + var3;
                field1966[var4++] = ((this.field1947[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1994[var10 - var9];
                field1982[var4] = (((field1971[var7] - var16) * var20 >> 16) + var16) * class138.field2027 / 50 + var2;
                field1983[var4] = (((field1972[var7] - var17) * var20 >> 16) + var17) * class138.field2027 / 50 + var3;
                field1966[var4++] = ((this.field1941[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1982[var4] = field1953[var7];
            field1983[var4] = field1969[var7];
            field1966[var4++] = this.field1941[arg0];
        } else {
            int var21 = field1971[var7];
            int var22 = field1972[var7];
            int var23 = this.field1941[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1994[var9 - var10];
                field1982[var4] = (((field1971[var6] - var21) * var24 >> 16) + var21) * class138.field2027 / 50 + var2;
                field1983[var4] = (((field1972[var6] - var22) * var24 >> 16) + var22) * class138.field2027 / 50 + var3;
                field1966[var4++] = ((this.field1940[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1994[var8 - var10];
                field1982[var4] = (((field1971[var5] - var21) * var25 >> 16) + var21) * class138.field2027 / 50 + var2;
                field1983[var4] = (((field1972[var5] - var22) * var25 >> 16) + var22) * class138.field2027 / 50 + var3;
                field1966[var4++] = ((this.field1947[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1982[0];
        int var27 = field1982[1];
        int var28 = field1982[2];
        int var29 = field1983[0];
        int var30 = field1983[1];
        int var31 = field1983[2];
        class138.field2039 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2042 || var27 > Statics.field2042 || var28 > Statics.field2042) {
                class138.field2039 = true;
            }
            if (this.field1945 != null && this.field1945[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1944 == null || this.field1944[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1944[arg0] & 0xFF;
                    var33 = this.field1948[var32];
                    var34 = this.field1949[var32];
                    var35 = this.field1928[var32];
                }
                if (this.field1941[arg0] == -1) {
                    class138.method2404(var29, var30, var31, var26, var27, var28, this.field1947[arg0], this.field1947[arg0], this.field1947[arg0], field1971[var33], field1971[var34], field1971[var35], field1972[var33], field1972[var34], field1972[var35], field1985[var33], field1985[var34], field1985[var35], this.field1945[arg0]);
                } else {
                    class138.method2404(var29, var30, var31, var26, var27, var28, field1966[0], field1966[1], field1966[2], field1971[var33], field1971[var34], field1971[var35], field1972[var33], field1972[var34], field1972[var35], field1985[var33], field1985[var34], field1985[var35], this.field1945[arg0]);
                }
            } else if (this.field1941[arg0] == -1) {
                class138.method2402(var29, var30, var31, var26, var27, var28, field1993[this.field1947[arg0]]);
            } else {
                class138.method2400(var29, var30, var31, var26, var27, var28, field1966[0], field1966[1], field1966[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2042 || var27 > Statics.field2042 || var28 > Statics.field2042 || field1982[3] < 0 || field1982[3] > Statics.field2042) {
            class138.field2039 = true;
        }
        if (this.field1945 != null && this.field1945[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1944 == null || this.field1944[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1944[arg0] & 0xFF;
                var37 = this.field1948[var36];
                var38 = this.field1949[var36];
                var39 = this.field1928[var36];
            }
            short var40 = this.field1945[arg0];
            if (this.field1941[arg0] == -1) {
                class138.method2404(var29, var30, var31, var26, var27, var28, this.field1947[arg0], this.field1947[arg0], this.field1947[arg0], field1971[var37], field1971[var38], field1971[var39], field1972[var37], field1972[var38], field1972[var39], field1985[var37], field1985[var38], field1985[var39], var40);
                class138.method2404(var29, var31, field1983[3], var26, var28, field1982[3], this.field1947[arg0], this.field1947[arg0], this.field1947[arg0], field1971[var37], field1971[var38], field1971[var39], field1972[var37], field1972[var38], field1972[var39], field1985[var37], field1985[var38], field1985[var39], var40);
            } else {
                class138.method2404(var29, var30, var31, var26, var27, var28, field1966[0], field1966[1], field1966[2], field1971[var37], field1971[var38], field1971[var39], field1972[var37], field1972[var38], field1972[var39], field1985[var37], field1985[var38], field1985[var39], var40);
                class138.method2404(var29, var31, field1983[3], var26, var28, field1982[3], field1966[0], field1966[2], field1966[3], field1971[var37], field1971[var38], field1971[var39], field1972[var37], field1972[var38], field1972[var39], field1985[var37], field1985[var38], field1985[var39], var40);
            }
        } else if (this.field1941[arg0] == -1) {
            int var41 = field1993[this.field1947[arg0]];
            class138.method2402(var29, var30, var31, var26, var27, var28, var41);
            class138.method2402(var29, var31, field1983[3], var26, var28, field1982[3], var41);
        } else {
            class138.method2400(var29, var30, var31, var26, var27, var28, field1966[0], field1966[1], field1966[2]);
            class138.method2400(var29, var31, field1983[3], var26, var28, field1982[3], field1966[0], field1966[2], field1966[3]);
        }
    }
}

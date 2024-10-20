package deob;

@ObfuscatedName("et")
public class class134 extends class142 {

    @ObfuscatedName("et.i")
    public static class134 field1965 = new class134();

    @ObfuscatedName("et.w")
    public static byte[] field1956 = new byte[1];

    @ObfuscatedName("et.a")
    public static class134 field1998 = new class134();

    @ObfuscatedName("et.t")
    public static byte[] field1935 = new byte[1];

    @ObfuscatedName("et.s")
    public int field1962 = 0;

    @ObfuscatedName("et.r")
    public int[] field1937;

    @ObfuscatedName("et.v")
    public int[] field1938;

    @ObfuscatedName("et.y")
    public int[] field1977;

    @ObfuscatedName("et.j")
    public int field1940 = 0;

    @ObfuscatedName("et.k")
    public int[] field1941;

    @ObfuscatedName("et.e")
    public int[] field1942;

    @ObfuscatedName("et.o")
    public int[] field1943;

    @ObfuscatedName("et.z")
    public int[] field1944;

    @ObfuscatedName("et.l")
    public int[] field1966;

    @ObfuscatedName("et.c")
    public int[] field1946;

    @ObfuscatedName("et.m")
    public byte[] field1947;

    @ObfuscatedName("et.b")
    public byte[] field1948;

    @ObfuscatedName("et.f")
    public byte[] field1945;

    @ObfuscatedName("et.n")
    public short[] field1950;

    @ObfuscatedName("et.u")
    public byte field1995 = 0;

    @ObfuscatedName("et.p")
    public int field1952 = 0;

    @ObfuscatedName("et.q")
    public int[] field1953;

    @ObfuscatedName("et.d")
    public int[] field1954;

    @ObfuscatedName("et.h")
    public int[] field1932;

    @ObfuscatedName("et.g")
    public int[][] field1996;

    @ObfuscatedName("et.x")
    public int[][] field1957;

    @ObfuscatedName("et.ah")
    public boolean field1951 = false;

    @ObfuscatedName("et.ab")
    public int field1959;

    @ObfuscatedName("et.aw")
    public int field1960;

    @ObfuscatedName("et.ai")
    public int field1949;

    @ObfuscatedName("et.an")
    public int field1961;

    @ObfuscatedName("et.au")
    public int field1963;

    @ObfuscatedName("et.ar")
    public int field1970;

    @ObfuscatedName("et.ay")
    public int field1990;

    @ObfuscatedName("et.ao")
    public int field1933;

    @ObfuscatedName("et.as")
    public int field1967 = -1;

    @ObfuscatedName("et.ak")
    public int field1968 = -1;

    @ObfuscatedName("et.aq")
    public int field1969 = -1;

    @ObfuscatedName("et.ac")
    public static boolean[] field1971 = new boolean[4700];

    @ObfuscatedName("et.at")
    public static boolean[] field1972 = new boolean[4700];

    @ObfuscatedName("et.av")
    public static int[] field1964 = new int[4700];

    @ObfuscatedName("et.aa")
    public static int[] field1974 = new int[4700];

    @ObfuscatedName("et.am")
    public static int[] field1975 = new int[4700];

    @ObfuscatedName("et.az")
    public static int[] field1976 = new int[4700];

    @ObfuscatedName("et.al")
    public static int[] field1979 = new int[4700];

    @ObfuscatedName("et.ad")
    public static int[] field1978 = new int[4700];

    @ObfuscatedName("et.ag")
    public static int[] field1958 = new int[1600];

    @ObfuscatedName("et.ap")
    public static int[][] field1981 = new int[1600][512];

    @ObfuscatedName("et.af")
    public static int[] field1982 = new int[12];

    @ObfuscatedName("et.aj")
    public static int[][] field1983 = new int[12][2000];

    @ObfuscatedName("et.bb")
    public static int[] field1984 = new int[2000];

    @ObfuscatedName("et.bc")
    public static int[] field1985 = new int[2000];

    @ObfuscatedName("et.be")
    public static int[] field1986 = new int[12];

    @ObfuscatedName("et.bv")
    public static int[] field1987 = new int[10];

    @ObfuscatedName("et.bt")
    public static int[] field1988 = new int[10];

    @ObfuscatedName("et.bl")
    public static int[] field1989 = new int[10];

    @ObfuscatedName("et.bo")
    public static boolean field1993 = true;

    @ObfuscatedName("et.bj")
    public static int[] field2000 = class137.field2046;

    @ObfuscatedName("et.bx")
    public static int[] field1997 = class137.field2023;

    @ObfuscatedName("et.bz")
    public static int[] field1934 = class137.field2042;

    @ObfuscatedName("et.bh")
    public static int[] field1999 = class137.field2031;

    public class134() {
    }

    public class134(class134[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1962 = 0;
        this.field1940 = 0;
        this.field1952 = 0;
        this.field1995 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class134 var8 = arg0[var7];
            if (var8 != null) {
                this.field1962 += var8.field1962;
                this.field1940 += var8.field1940;
                this.field1952 += var8.field1952;
                if (var8.field1947 == null) {
                    if (this.field1995 == -1) {
                        this.field1995 = var8.field1995;
                    }
                    if (this.field1995 != var8.field1995) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1948 != null;
                var5 |= var8.field1950 != null;
                var6 |= var8.field1945 != null;
            }
        }
        this.field1937 = new int[this.field1962];
        this.field1938 = new int[this.field1962];
        this.field1977 = new int[this.field1962];
        this.field1941 = new int[this.field1940];
        this.field1942 = new int[this.field1940];
        this.field1943 = new int[this.field1940];
        this.field1944 = new int[this.field1940];
        this.field1966 = new int[this.field1940];
        this.field1946 = new int[this.field1940];
        if (var3) {
            this.field1947 = new byte[this.field1940];
        }
        if (var4) {
            this.field1948 = new byte[this.field1940];
        }
        if (var5) {
            this.field1950 = new short[this.field1940];
        }
        if (var6) {
            this.field1945 = new byte[this.field1940];
        }
        if (this.field1952 > 0) {
            this.field1953 = new int[this.field1952];
            this.field1954 = new int[this.field1952];
            this.field1932 = new int[this.field1952];
        }
        this.field1962 = 0;
        this.field1940 = 0;
        this.field1952 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class134 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1940; var11++) {
                    this.field1941[this.field1940] = var10.field1941[var11] + this.field1962;
                    this.field1942[this.field1940] = var10.field1942[var11] + this.field1962;
                    this.field1943[this.field1940] = var10.field1943[var11] + this.field1962;
                    this.field1944[this.field1940] = var10.field1944[var11];
                    this.field1966[this.field1940] = var10.field1966[var11];
                    this.field1946[this.field1940] = var10.field1946[var11];
                    if (var3) {
                        if (var10.field1947 == null) {
                            this.field1947[this.field1940] = var10.field1995;
                        } else {
                            this.field1947[this.field1940] = var10.field1947[var11];
                        }
                    }
                    if (var4 && var10.field1948 != null) {
                        this.field1948[this.field1940] = var10.field1948[var11];
                    }
                    if (var5) {
                        if (var10.field1950 == null) {
                            this.field1950[this.field1940] = -1;
                        } else {
                            this.field1950[this.field1940] = var10.field1950[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1945 == null || var10.field1945[var11] == -1) {
                            this.field1945[this.field1940] = -1;
                        } else {
                            this.field1945[this.field1940] = (byte) (var10.field1945[var11] + this.field1952);
                        }
                    }
                    this.field1940++;
                }
                for (int var12 = 0; var12 < var10.field1952; var12++) {
                    this.field1953[this.field1952] = var10.field1953[var12] + this.field1962;
                    this.field1954[this.field1952] = var10.field1954[var12] + this.field1962;
                    this.field1932[this.field1952] = var10.field1932[var12] + this.field1962;
                    this.field1952++;
                }
                for (int var13 = 0; var13 < var10.field1962; var13++) {
                    this.field1937[this.field1962] = var10.field1937[var13];
                    this.field1938[this.field1962] = var10.field1938[var13];
                    this.field1977[this.field1962] = var10.field1977[var13];
                    this.field1962++;
                }
            }
        }
    }

    @ObfuscatedName("et.i([[IIIIZI)Let;")
    public class134 method2315(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2269();
        int var7 = arg1 - this.field1949;
        int var8 = this.field1949 + arg1;
        int var9 = arg3 - this.field1949;
        int var10 = this.field1949 + arg3;
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
            var15.field1962 = this.field1962;
            var15.field1940 = this.field1940;
            var15.field1952 = this.field1952;
            var15.field1937 = this.field1937;
            var15.field1977 = this.field1977;
            var15.field1941 = this.field1941;
            var15.field1942 = this.field1942;
            var15.field1943 = this.field1943;
            var15.field1944 = this.field1944;
            var15.field1966 = this.field1966;
            var15.field1946 = this.field1946;
            var15.field1947 = this.field1947;
            var15.field1948 = this.field1948;
            var15.field1945 = this.field1945;
            var15.field1950 = this.field1950;
            var15.field1995 = this.field1995;
            var15.field1953 = this.field1953;
            var15.field1954 = this.field1954;
            var15.field1932 = this.field1932;
            var15.field1996 = this.field1996;
            var15.field1957 = this.field1957;
            var15.field1951 = this.field1951;
            var15.field1938 = new int[var15.field1962];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1962; var16++) {
                int var17 = this.field1937[var16] + arg1;
                int var18 = this.field1977[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1938[var16] = this.field1938[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1962; var26++) {
                int var27 = (-this.field1938[var26] << 16) / this.field2136;
                if (var27 < arg5) {
                    int var28 = this.field1937[var26] + arg1;
                    int var29 = this.field1977[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1938[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1938[var26];
                }
            }
        }
        var15.method2272();
        return var15;
    }

    @ObfuscatedName("et.w(Z)Let;")
    public class134 method2306(boolean arg0) {
        if (!arg0 && field1956.length < this.field1940) {
            field1956 = new byte[this.field1940 + 100];
        }
        return this.method2267(arg0, field1965, field1956);
    }

    @ObfuscatedName("et.t(Z)Let;")
    public class134 method2276(boolean arg0) {
        if (!arg0 && field1935.length < this.field1940) {
            field1935 = new byte[this.field1940 + 100];
        }
        return this.method2267(arg0, field1998, field1935);
    }

    @ObfuscatedName("et.s(ZLet;[B)Let;")
    public class134 method2267(boolean arg0, class134 arg1, byte[] arg2) {
        arg1.field1962 = this.field1962;
        arg1.field1940 = this.field1940;
        arg1.field1952 = this.field1952;
        if (arg1.field1937 == null || arg1.field1937.length < this.field1962) {
            arg1.field1937 = new int[this.field1962 + 100];
            arg1.field1938 = new int[this.field1962 + 100];
            arg1.field1977 = new int[this.field1962 + 100];
        }
        for (int var4 = 0; var4 < this.field1962; var4++) {
            arg1.field1937[var4] = this.field1937[var4];
            arg1.field1938[var4] = this.field1938[var4];
            arg1.field1977[var4] = this.field1977[var4];
        }
        if (arg0) {
            arg1.field1948 = this.field1948;
        } else {
            arg1.field1948 = arg2;
            if (this.field1948 == null) {
                for (int var5 = 0; var5 < this.field1940; var5++) {
                    arg1.field1948[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1940; var6++) {
                    arg1.field1948[var6] = this.field1948[var6];
                }
            }
        }
        arg1.field1941 = this.field1941;
        arg1.field1942 = this.field1942;
        arg1.field1943 = this.field1943;
        arg1.field1944 = this.field1944;
        arg1.field1966 = this.field1966;
        arg1.field1946 = this.field1946;
        arg1.field1947 = this.field1947;
        arg1.field1945 = this.field1945;
        arg1.field1950 = this.field1950;
        arg1.field1995 = this.field1995;
        arg1.field1953 = this.field1953;
        arg1.field1954 = this.field1954;
        arg1.field1932 = this.field1932;
        arg1.field1996 = this.field1996;
        arg1.field1957 = this.field1957;
        arg1.field1951 = this.field1951;
        arg1.method2272();
        return arg1;
    }

    @ObfuscatedName("et.r(I)V")
    public void method2268(int arg0) {
        if (this.field1967 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1997[arg0];
        int var9 = field2000[arg0];
        for (int var10 = 0; var10 < this.field1962; var10++) {
            int var11 = class137.method2376(this.field1937[var10], this.field1977[var10], var8, var9);
            int var12 = this.field1938[var10];
            int var13 = class137.method2420(this.field1937[var10], this.field1977[var10], var8, var9);
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
        this.field1990 = (var3 + var6) / 2;
        this.field1933 = (var4 + var7) / 2;
        this.field1967 = (var5 - var2 + 1) / 2;
        this.field1968 = (var6 - var3 + 1) / 2;
        this.field1969 = (var7 - var4 + 1) / 2;
        if (this.field1967 < 32) {
            this.field1967 = 32;
        }
        if (this.field1969 < 32) {
            this.field1969 = 32;
        }
        if (this.field1951) {
            this.field1967 += 8;
            this.field1969 += 8;
        }
    }

    @ObfuscatedName("et.v()V")
    public void method2269() {
        if (this.field1959 == 1) {
            return;
        }
        this.field1959 = 1;
        this.field2136 = 0;
        this.field1960 = 0;
        this.field1949 = 0;
        for (int var1 = 0; var1 < this.field1962; var1++) {
            int var2 = this.field1937[var1];
            int var3 = this.field1938[var1];
            int var4 = this.field1977[var1];
            if (-var3 > this.field2136) {
                this.field2136 = -var3;
            }
            if (var3 > this.field1960) {
                this.field1960 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1949) {
                this.field1949 = var5;
            }
        }
        this.field1949 = (int) (Math.sqrt((double) this.field1949) + 0.99D);
        this.field1963 = (int) (Math.sqrt((double) (this.field2136 * this.field2136 + this.field1949 * this.field1949)) + 0.99D);
        this.field1961 = this.field1963 + (int) (Math.sqrt((double) (this.field1960 * this.field1960 + this.field1949 * this.field1949)) + 0.99D);
    }

    @ObfuscatedName("et.y()V")
    public void method2270() {
        if (this.field1959 == 2) {
            return;
        }
        this.field1959 = 2;
        this.field1949 = 0;
        for (int var1 = 0; var1 < this.field1962; var1++) {
            int var2 = this.field1937[var1];
            int var3 = this.field1938[var1];
            int var4 = this.field1977[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1949) {
                this.field1949 = var5;
            }
        }
        this.field1949 = (int) (Math.sqrt((double) this.field1949) + 0.99D);
        this.field1963 = this.field1949;
        this.field1961 = this.field1949 + this.field1949;
    }

    @ObfuscatedName("et.j()I")
    public int method2329() {
        this.method2269();
        return this.field1949;
    }

    @ObfuscatedName("et.k()V")
    public void method2272() {
        this.field1959 = 0;
        this.field1967 = -1;
    }

    @ObfuscatedName("et.e(Leq;I)V")
    public void method2273(class145 arg0, int arg1) {
        if (this.field1996 == null || arg1 == -1) {
            return;
        }
        class132 var3 = arg0.field2161[arg1];
        class139 var4 = var3.field1895;
        Statics.field1973 = 0;
        Statics.field1991 = 0;
        Statics.field1992 = 0;
        for (int var5 = 0; var5 < var3.field1900; var5++) {
            int var6 = var3.field1901[var5];
            this.method2301(var4.field2063[var6], var4.field2062[var6], var3.field1902[var5], var3.field1903[var5], var3.field1899[var5]);
        }
        this.method2272();
    }

    @ObfuscatedName("et.o(Leq;ILeq;I[I)V")
    public void method2274(class145 arg0, int arg1, class145 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2273(arg0, arg1);
            return;
        }
        class132 var6 = arg0.field2161[arg1];
        class132 var7 = arg2.field2161[arg3];
        class139 var8 = var6.field1895;
        Statics.field1973 = 0;
        Statics.field1991 = 0;
        Statics.field1992 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1900; var11++) {
            int var12 = var6.field1901[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2063[var12] == 0) {
                this.method2301(var8.field2063[var12], var8.field2062[var12], var6.field1902[var11], var6.field1903[var11], var6.field1899[var11]);
            }
        }
        Statics.field1973 = 0;
        Statics.field1991 = 0;
        Statics.field1992 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1900; var15++) {
            int var16 = var7.field1901[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2063[var16] == 0) {
                this.method2301(var8.field2063[var16], var8.field2062[var16], var7.field1902[var15], var7.field1903[var15], var7.field1899[var15]);
            }
        }
        this.method2272();
    }

    @ObfuscatedName("et.z(I[IIII)V")
    public void method2301(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1973 = 0;
            Statics.field1991 = 0;
            Statics.field1992 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1996.length) {
                    int[] var10 = this.field1996[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1973 += this.field1937[var12];
                        Statics.field1991 += this.field1938[var12];
                        Statics.field1992 += this.field1977[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1973 = Statics.field1973 / var7 + arg2;
                Statics.field1991 = Statics.field1991 / var7 + arg3;
                Statics.field1992 = Statics.field1992 / var7 + arg4;
            } else {
                Statics.field1973 = arg2;
                Statics.field1991 = arg3;
                Statics.field1992 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1996.length) {
                    int[] var15 = this.field1996[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1937[var17] += arg2;
                        this.field1938[var17] += arg3;
                        this.field1977[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1996.length) {
                    int[] var20 = this.field1996[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1937[var22] -= Statics.field1973;
                        this.field1938[var22] -= Statics.field1991;
                        this.field1977[var22] -= Statics.field1992;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2000[var25];
                            int var27 = field1997[var25];
                            int var28 = this.field1938[var22] * var26 + this.field1937[var22] * var27 >> 16;
                            this.field1938[var22] = this.field1938[var22] * var27 - this.field1937[var22] * var26 >> 16;
                            this.field1937[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2000[var23];
                            int var30 = field1997[var23];
                            int var31 = this.field1938[var22] * var30 - this.field1977[var22] * var29 >> 16;
                            this.field1977[var22] = this.field1977[var22] * var30 + this.field1938[var22] * var29 >> 16;
                            this.field1938[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2000[var24];
                            int var33 = field1997[var24];
                            int var34 = this.field1977[var22] * var32 + this.field1937[var22] * var33 >> 16;
                            this.field1977[var22] = this.field1977[var22] * var33 - this.field1937[var22] * var32 >> 16;
                            this.field1937[var22] = var34;
                        }
                        this.field1937[var22] += Statics.field1973;
                        this.field1938[var22] += Statics.field1991;
                        this.field1977[var22] += Statics.field1992;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1996.length) {
                    int[] var37 = this.field1996[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1937[var39] -= Statics.field1973;
                        this.field1938[var39] -= Statics.field1991;
                        this.field1977[var39] -= Statics.field1992;
                        this.field1937[var39] = this.field1937[var39] * arg2 / 128;
                        this.field1938[var39] = this.field1938[var39] * arg3 / 128;
                        this.field1977[var39] = this.field1977[var39] * arg4 / 128;
                        this.field1937[var39] += Statics.field1973;
                        this.field1938[var39] += Statics.field1991;
                        this.field1977[var39] += Statics.field1992;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1957 != null && this.field1948 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1957.length) {
                    int[] var42 = this.field1957[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1948[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1948[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("et.l()V")
    public void method2263() {
        for (int var1 = 0; var1 < this.field1962; var1++) {
            int var2 = this.field1937[var1];
            this.field1937[var1] = this.field1977[var1];
            this.field1977[var1] = -var2;
        }
        this.method2272();
    }

    @ObfuscatedName("et.c()V")
    public void method2271() {
        for (int var1 = 0; var1 < this.field1962; var1++) {
            this.field1937[var1] = -this.field1937[var1];
            this.field1977[var1] = -this.field1977[var1];
        }
        this.method2272();
    }

    @ObfuscatedName("et.b()V")
    public void method2278() {
        for (int var1 = 0; var1 < this.field1962; var1++) {
            int var2 = this.field1977[var1];
            this.field1977[var1] = this.field1937[var1];
            this.field1937[var1] = -var2;
        }
        this.method2272();
    }

    @ObfuscatedName("et.f(I)V")
    public void method2279(int arg0) {
        int var2 = field2000[arg0];
        int var3 = field1997[arg0];
        for (int var4 = 0; var4 < this.field1962; var4++) {
            int var5 = this.field1938[var4] * var3 - this.field1977[var4] * var2 >> 16;
            this.field1977[var4] = this.field1977[var4] * var3 + this.field1938[var4] * var2 >> 16;
            this.field1938[var4] = var5;
        }
        this.method2272();
    }

    @ObfuscatedName("et.n(III)V")
    public void method2280(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1962; var4++) {
            this.field1937[var4] += arg0;
            this.field1938[var4] += arg1;
            this.field1977[var4] += arg2;
        }
        this.method2272();
    }

    @ObfuscatedName("et.u(III)V")
    public void method2342(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1962; var4++) {
            this.field1937[var4] = this.field1937[var4] * arg0 / 128;
            this.field1938[var4] = this.field1938[var4] * arg1 / 128;
            this.field1977[var4] = this.field1977[var4] * arg2 / 128;
        }
        this.method2272();
    }

    @ObfuscatedName("et.p(IIIIIII)V")
    public final void method2282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1958[0] = -1;
        if (this.field1959 != 2 && this.field1959 != 1) {
            this.method2270();
        }
        int var8 = Statics.field2035;
        int var9 = Statics.field2034;
        int var10 = field2000[arg0];
        int var11 = field1997[arg0];
        int var12 = field2000[arg1];
        int var13 = field1997[arg1];
        int var14 = field2000[arg2];
        int var15 = field1997[arg2];
        int var16 = field2000[arg3];
        int var17 = field1997[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1962; var19++) {
            int var20 = this.field1937[var19];
            int var21 = this.field1938[var19];
            int var22 = this.field1977[var19];
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
            field1975[var19] = var30 - var18;
            field1964[var19] = class137.field2032 * var26 / var30 + var8;
            field1974[var19] = class137.field2032 * var29 / var30 + var9;
            if (this.field1952 > 0) {
                field1976[var19] = var26;
                field1979[var19] = var29;
                field1978[var19] = var30;
            }
        }
        try {
            this.method2285(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("et.q(IIIIIIII)V")
    public final void method2283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1958[0] = -1;
        if (this.field1959 != 2 && this.field1959 != 1) {
            this.method2270();
        }
        int var9 = Statics.field2035;
        int var10 = Statics.field2034;
        int var11 = field2000[arg0];
        int var12 = field1997[arg0];
        int var13 = field2000[arg1];
        int var14 = field1997[arg1];
        int var15 = field2000[arg2];
        int var16 = field1997[arg2];
        int var17 = field2000[arg3];
        int var18 = field1997[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1962; var20++) {
            int var21 = this.field1937[var20];
            int var22 = this.field1938[var20];
            int var23 = this.field1977[var20];
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
            field1975[var20] = var31 - var19;
            field1964[var20] = class137.field2032 * var27 / arg7 + var9;
            field1974[var20] = class137.field2032 * var30 / arg7 + var10;
            if (this.field1952 > 0) {
                field1976[var20] = var27;
                field1979[var20] = var30;
                field1978[var20] = var31;
            }
        }
        try {
            this.method2285(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("et.by(IIIIIIIII)V")
    public void method2284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1958[0] = -1;
        if (this.field1959 != 1) {
            this.method2269();
        }
        this.method2268(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1949 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1949) * class137.field2032;
        if (var15 / var13 >= Statics.field2047) {
            return;
        }
        int var16 = (this.field1949 + var14) * class137.field2032;
        if (var16 / var13 <= Statics.field2037) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1949 * arg1 >> 16;
        int var19 = (var17 + var18) * class137.field2032;
        if (var19 / var13 <= Statics.field2039) {
            return;
        }
        int var20 = (this.field2136 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class137.field2032;
        if (var21 / var13 >= Statics.field2040) {
            return;
        }
        int var22 = (this.field2136 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1952 > 0;
        int var26 = class135.field2015;
        int var28 = class135.field2009;
        boolean var30 = class135.field2004;
        if (class8.field237 && arg8 > 0) {
            class8.method1015(this, arg5, arg6, arg7);
        }
        if (class8.field239 && arg8 > 0) {
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
            int var42 = var26 - Statics.field2035;
            int var43 = var28 - Statics.field2034;
            if (var42 > var37 && var42 < var38 && var43 > var39 && var43 < var40) {
                var41 = -256;
            }
            int var44 = Statics.field2035 + var37;
            int var45 = Statics.field2034 + var39;
            int var46 = Statics.field2035 + var38;
            int var47 = Statics.field2034 + var40;
            class8.field235.method3262(new class9(var44, var45, var46, var47, var41));
        }
        boolean var48 = false;
        if (arg8 > 0 && var30) {
            boolean var49 = false;
            if (field1993) {
                var49 = class135.method1016(this, arg5, arg6, arg7);
            } else {
                int var50 = var11 - var12;
                if (var50 <= 50) {
                    var50 = 50;
                }
                int var51;
                int var52;
                if (var14 > 0) {
                    var51 = var15 / var13;
                    var52 = var16 / var50;
                } else {
                    var52 = var16 / var13;
                    var51 = var15 / var50;
                }
                int var53;
                int var54;
                if (var17 > 0) {
                    var53 = var21 / var13;
                    var54 = var19 / var50;
                } else {
                    var54 = var19 / var13;
                    var53 = var21 / var50;
                }
                int var55 = var26 - Statics.field2035;
                int var56 = var28 - Statics.field2034;
                if (var55 > var51 && var55 < var52 && var56 > var53 && var56 < var54) {
                    var49 = true;
                }
            }
            if (var49) {
                if (this.field1951) {
                    class135.method3149(arg8);
                } else {
                    var48 = true;
                }
            }
        }
        int var57 = Statics.field2035;
        int var58 = Statics.field2034;
        int var59 = 0;
        int var60 = 0;
        if (arg0 != 0) {
            var59 = field2000[arg0];
            var60 = field1997[arg0];
        }
        for (int var61 = 0; var61 < this.field1962; var61++) {
            int var62 = this.field1937[var61];
            int var63 = this.field1938[var61];
            int var64 = this.field1977[var61];
            if (arg0 != 0) {
                int var65 = var59 * var64 + var60 * var62 >> 16;
                var64 = var60 * var64 - var59 * var62 >> 16;
                var62 = var65;
            }
            int var66 = arg5 + var62;
            int var67 = arg6 + var63;
            int var68 = arg7 + var64;
            int var69 = arg3 * var68 + arg4 * var66 >> 16;
            int var70 = arg4 * var68 - arg3 * var66 >> 16;
            int var72 = arg2 * var67 - arg1 * var70 >> 16;
            int var73 = arg1 * var67 + arg2 * var70 >> 16;
            field1975[var61] = var73 - var11;
            if (var73 >= 50) {
                field1964[var61] = class137.field2032 * var69 / var73 + var57;
                field1974[var61] = class137.field2032 * var72 / var73 + var58;
            } else {
                field1964[var61] = -5000;
                var23 = true;
            }
            if (var25) {
                field1976[var61] = var69;
                field1979[var61] = var72;
                field1978[var61] = var73;
            }
        }
        try {
            this.method2285(var23, var48, this.field1951, arg8);
        } catch (Exception var76) {
        }
    }

    @ObfuscatedName("et.d(ZZZI)V")
    public final void method2285(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1961 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1961; var5++) {
            field1958[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field233 && arg1) {
            class134 var7 = this;
            for (int var8 = 0; var8 < var7.field1940; var8++) {
                if (var7.field1946[var8] != -2) {
                    int var9 = var7.field1941[var8];
                    int var10 = var7.field1942[var8];
                    int var11 = var7.field1943[var8];
                    int var12 = field1964[var9];
                    int var13 = field1964[var10];
                    int var14 = field1964[var11];
                    class8.method157(field1974[var9], field1974[var10], field1974[var11], var12, var13, var14, var6);
                }
            }
        }
        for (int var15 = 0; var15 < this.field1940; var15++) {
            if (this.field1946[var15] != -2) {
                int var16 = this.field1941[var15];
                int var17 = this.field1942[var15];
                int var18 = this.field1943[var15];
                int var19 = field1964[var16];
                int var20 = field1964[var17];
                int var21 = field1964[var18];
                if (arg0 && var19 == -5000 || var20 == -5000 || var21 == -5000) {
                    int var22 = field1976[var16];
                    int var23 = field1976[var17];
                    int var24 = field1976[var18];
                    int var25 = field1979[var16];
                    int var26 = field1979[var17];
                    int var27 = field1979[var18];
                    int var28 = field1978[var16];
                    int var29 = field1978[var17];
                    int var30 = field1978[var18];
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
                        field1972[var15] = true;
                        int var40 = (field1975[var16] + field1975[var17] + field1975[var18]) / 3 + this.field1963;
                        field1981[var40][field1958[var40]++] = var15;
                    }
                } else {
                    if (arg1 && Statics.method558(field1974[var16], field1974[var17], field1974[var18], var19, var20, var21, var6)) {
                        class135.method3149(arg3);
                        arg1 = false;
                    }
                    if ((field1974[var18] - field1974[var17]) * (var19 - var20) - (field1974[var16] - field1974[var17]) * (var21 - var20) > 0) {
                        field1972[var15] = false;
                        if (var19 >= 0 && var20 >= 0 && var21 >= 0 && var19 <= Statics.field2022 && var20 <= Statics.field2022 && var21 <= Statics.field2022) {
                            field1971[var15] = false;
                        } else {
                            field1971[var15] = true;
                        }
                        int var41 = (field1975[var16] + field1975[var17] + field1975[var18]) / 3 + this.field1963;
                        field1981[var41][field1958[var41]++] = var15;
                    }
                }
            }
        }
        if (this.field1947 == null) {
            for (int var42 = this.field1961 - 1; var42 >= 0; var42--) {
                int var43 = field1958[var42];
                if (var43 > 0) {
                    int[] var44 = field1981[var42];
                    for (int var45 = 0; var45 < var43; var45++) {
                        this.method2286(var44[var45]);
                    }
                }
            }
            return;
        }
        for (int var46 = 0; var46 < 12; var46++) {
            field1982[var46] = 0;
            field1986[var46] = 0;
        }
        for (int var47 = this.field1961 - 1; var47 >= 0; var47--) {
            int var48 = field1958[var47];
            if (var48 > 0) {
                int[] var49 = field1981[var47];
                for (int var50 = 0; var50 < var48; var50++) {
                    int var51 = var49[var50];
                    byte var52 = this.field1947[var51];
                    int var53 = field1982[var52]++;
                    field1983[var52][var53] = var51;
                    if (var52 < 10) {
                        field1986[var52] += var47;
                    } else if (var52 == 10) {
                        field1984[var53] = var47;
                    } else {
                        field1985[var53] = var47;
                    }
                }
            }
        }
        int var54 = 0;
        if (field1982[1] > 0 || field1982[2] > 0) {
            var54 = (field1986[1] + field1986[2]) / (field1982[1] + field1982[2]);
        }
        int var55 = 0;
        if (field1982[3] > 0 || field1982[4] > 0) {
            var55 = (field1986[3] + field1986[4]) / (field1982[3] + field1982[4]);
        }
        int var56 = 0;
        if (field1982[6] > 0 || field1982[8] > 0) {
            var56 = (field1986[6] + field1986[8]) / (field1982[6] + field1982[8]);
        }
        int var57 = 0;
        int var58 = field1982[10];
        int[] var59 = field1983[10];
        int[] var60 = field1984;
        if (var57 == var58) {
            var57 = 0;
            var58 = field1982[11];
            var59 = field1983[11];
            var60 = field1985;
        }
        int var61;
        if (var57 < var58) {
            var61 = var60[var57];
        } else {
            var61 = -1000;
        }
        for (int var62 = 0; var62 < 10; var62++) {
            while (var62 == 0 && var61 > var54) {
                this.method2286(var59[var57++]);
                if (var57 == var58 && field1983[11] != var59) {
                    var57 = 0;
                    var58 = field1982[11];
                    var59 = field1983[11];
                    var60 = field1985;
                }
                if (var57 < var58) {
                    var61 = var60[var57];
                } else {
                    var61 = -1000;
                }
            }
            while (var62 == 3 && var61 > var55) {
                this.method2286(var59[var57++]);
                if (var57 == var58 && field1983[11] != var59) {
                    var57 = 0;
                    var58 = field1982[11];
                    var59 = field1983[11];
                    var60 = field1985;
                }
                if (var57 < var58) {
                    var61 = var60[var57];
                } else {
                    var61 = -1000;
                }
            }
            while (var62 == 5 && var61 > var56) {
                this.method2286(var59[var57++]);
                if (var57 == var58 && field1983[11] != var59) {
                    var57 = 0;
                    var58 = field1982[11];
                    var59 = field1983[11];
                    var60 = field1985;
                }
                if (var57 < var58) {
                    var61 = var60[var57];
                } else {
                    var61 = -1000;
                }
            }
            int var63 = field1982[var62];
            int[] var64 = field1983[var62];
            for (int var65 = 0; var65 < var63; var65++) {
                this.method2286(var64[var65]);
            }
        }
        while (var61 != -1000) {
            this.method2286(var59[var57++]);
            if (var57 == var58 && field1983[11] != var59) {
                var57 = 0;
                var59 = field1983[11];
                var58 = field1982[11];
                var60 = field1985;
            }
            if (var57 < var58) {
                var61 = var60[var57];
            } else {
                var61 = -1000;
            }
        }
    }

    @ObfuscatedName("et.x(I)V")
    public final void method2286(int arg0) {
        if (field1972[arg0]) {
            this.method2287(arg0);
            return;
        }
        int var2 = this.field1941[arg0];
        int var3 = this.field1942[arg0];
        int var4 = this.field1943[arg0];
        class137.field2043 = field1971[arg0];
        if (this.field1948 == null) {
            class137.field2025 = 0;
        } else {
            class137.field2025 = this.field1948[arg0] & 0xFF;
        }
        if (this.field1950 != null && this.field1950[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1945 == null || this.field1945[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1945[arg0] & 0xFF;
                var6 = this.field1953[var5];
                var7 = this.field1954[var5];
                var8 = this.field1932[var5];
            }
            if (this.field1946[arg0] == -1) {
                class137.method2390(field1974[var2], field1974[var3], field1974[var4], field1964[var2], field1964[var3], field1964[var4], this.field1944[arg0], this.field1944[arg0], this.field1944[arg0], field1976[var6], field1976[var7], field1976[var8], field1979[var6], field1979[var7], field1979[var8], field1978[var6], field1978[var7], field1978[var8], this.field1950[arg0]);
            } else {
                class137.method2390(field1974[var2], field1974[var3], field1974[var4], field1964[var2], field1964[var3], field1964[var4], this.field1944[arg0], this.field1966[arg0], this.field1946[arg0], field1976[var6], field1976[var7], field1976[var8], field1979[var6], field1979[var7], field1979[var8], field1978[var6], field1978[var7], field1978[var8], this.field1950[arg0]);
            }
        } else if (this.field1946[arg0] == -1) {
            class137.method2369(field1974[var2], field1974[var3], field1974[var4], field1964[var2], field1964[var3], field1964[var4], field1934[this.field1944[arg0]]);
        } else {
            class137.method2367(field1974[var2], field1974[var3], field1974[var4], field1964[var2], field1964[var3], field1964[var4], this.field1944[arg0], this.field1966[arg0], this.field1946[arg0]);
        }
    }

    @ObfuscatedName("et.ai(I)V")
    public final void method2287(int arg0) {
        int var2 = Statics.field2035;
        int var3 = Statics.field2034;
        int var4 = 0;
        int var5 = this.field1941[arg0];
        int var6 = this.field1942[arg0];
        int var7 = this.field1943[arg0];
        int var8 = field1978[var5];
        int var9 = field1978[var6];
        int var10 = field1978[var7];
        if (this.field1948 == null) {
            class137.field2025 = 0;
        } else {
            class137.field2025 = this.field1948[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1987[var4] = field1964[var5];
            field1988[var4] = field1974[var5];
            field1989[var4++] = this.field1944[arg0];
        } else {
            int var11 = field1976[var5];
            int var12 = field1979[var5];
            int var13 = this.field1944[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1999[var10 - var8];
                field1987[var4] = (((field1976[var7] - var11) * var14 >> 16) + var11) * class137.field2032 / 50 + var2;
                field1988[var4] = (((field1979[var7] - var12) * var14 >> 16) + var12) * class137.field2032 / 50 + var3;
                field1989[var4++] = ((this.field1946[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1999[var9 - var8];
                field1987[var4] = (((field1976[var6] - var11) * var15 >> 16) + var11) * class137.field2032 / 50 + var2;
                field1988[var4] = (((field1979[var6] - var12) * var15 >> 16) + var12) * class137.field2032 / 50 + var3;
                field1989[var4++] = ((this.field1966[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1987[var4] = field1964[var6];
            field1988[var4] = field1974[var6];
            field1989[var4++] = this.field1966[arg0];
        } else {
            int var16 = field1976[var6];
            int var17 = field1979[var6];
            int var18 = this.field1966[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1999[var8 - var9];
                field1987[var4] = (((field1976[var5] - var16) * var19 >> 16) + var16) * class137.field2032 / 50 + var2;
                field1988[var4] = (((field1979[var5] - var17) * var19 >> 16) + var17) * class137.field2032 / 50 + var3;
                field1989[var4++] = ((this.field1944[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1999[var10 - var9];
                field1987[var4] = (((field1976[var7] - var16) * var20 >> 16) + var16) * class137.field2032 / 50 + var2;
                field1988[var4] = (((field1979[var7] - var17) * var20 >> 16) + var17) * class137.field2032 / 50 + var3;
                field1989[var4++] = ((this.field1946[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1987[var4] = field1964[var7];
            field1988[var4] = field1974[var7];
            field1989[var4++] = this.field1946[arg0];
        } else {
            int var21 = field1976[var7];
            int var22 = field1979[var7];
            int var23 = this.field1946[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1999[var9 - var10];
                field1987[var4] = (((field1976[var6] - var21) * var24 >> 16) + var21) * class137.field2032 / 50 + var2;
                field1988[var4] = (((field1979[var6] - var22) * var24 >> 16) + var22) * class137.field2032 / 50 + var3;
                field1989[var4++] = ((this.field1966[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1999[var8 - var10];
                field1987[var4] = (((field1976[var5] - var21) * var25 >> 16) + var21) * class137.field2032 / 50 + var2;
                field1988[var4] = (((field1979[var5] - var22) * var25 >> 16) + var22) * class137.field2032 / 50 + var3;
                field1989[var4++] = ((this.field1944[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1987[0];
        int var27 = field1987[1];
        int var28 = field1987[2];
        int var29 = field1988[0];
        int var30 = field1988[1];
        int var31 = field1988[2];
        class137.field2043 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2022 || var27 > Statics.field2022 || var28 > Statics.field2022) {
                class137.field2043 = true;
            }
            if (this.field1950 != null && this.field1950[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1945 == null || this.field1945[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1945[arg0] & 0xFF;
                    var33 = this.field1953[var32];
                    var34 = this.field1954[var32];
                    var35 = this.field1932[var32];
                }
                if (this.field1946[arg0] == -1) {
                    class137.method2390(var29, var30, var31, var26, var27, var28, this.field1944[arg0], this.field1944[arg0], this.field1944[arg0], field1976[var33], field1976[var34], field1976[var35], field1979[var33], field1979[var34], field1979[var35], field1978[var33], field1978[var34], field1978[var35], this.field1950[arg0]);
                } else {
                    class137.method2390(var29, var30, var31, var26, var27, var28, field1989[0], field1989[1], field1989[2], field1976[var33], field1976[var34], field1976[var35], field1979[var33], field1979[var34], field1979[var35], field1978[var33], field1978[var34], field1978[var35], this.field1950[arg0]);
                }
            } else if (this.field1946[arg0] == -1) {
                class137.method2369(var29, var30, var31, var26, var27, var28, field1934[this.field1944[arg0]]);
            } else {
                class137.method2367(var29, var30, var31, var26, var27, var28, field1989[0], field1989[1], field1989[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2022 || var27 > Statics.field2022 || var28 > Statics.field2022 || field1987[3] < 0 || field1987[3] > Statics.field2022) {
            class137.field2043 = true;
        }
        if (this.field1950 != null && this.field1950[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1945 == null || this.field1945[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1945[arg0] & 0xFF;
                var37 = this.field1953[var36];
                var38 = this.field1954[var36];
                var39 = this.field1932[var36];
            }
            short var40 = this.field1950[arg0];
            if (this.field1946[arg0] == -1) {
                class137.method2390(var29, var30, var31, var26, var27, var28, this.field1944[arg0], this.field1944[arg0], this.field1944[arg0], field1976[var37], field1976[var38], field1976[var39], field1979[var37], field1979[var38], field1979[var39], field1978[var37], field1978[var38], field1978[var39], var40);
                class137.method2390(var29, var31, field1988[3], var26, var28, field1987[3], this.field1944[arg0], this.field1944[arg0], this.field1944[arg0], field1976[var37], field1976[var38], field1976[var39], field1979[var37], field1979[var38], field1979[var39], field1978[var37], field1978[var38], field1978[var39], var40);
            } else {
                class137.method2390(var29, var30, var31, var26, var27, var28, field1989[0], field1989[1], field1989[2], field1976[var37], field1976[var38], field1976[var39], field1979[var37], field1979[var38], field1979[var39], field1978[var37], field1978[var38], field1978[var39], var40);
                class137.method2390(var29, var31, field1988[3], var26, var28, field1987[3], field1989[0], field1989[2], field1989[3], field1976[var37], field1976[var38], field1976[var39], field1979[var37], field1979[var38], field1979[var39], field1978[var37], field1978[var38], field1978[var39], var40);
            }
        } else if (this.field1946[arg0] == -1) {
            int var41 = field1934[this.field1944[arg0]];
            class137.method2369(var29, var30, var31, var26, var27, var28, var41);
            class137.method2369(var29, var31, field1988[3], var26, var28, field1987[3], var41);
        } else {
            class137.method2367(var29, var30, var31, var26, var27, var28, field1989[0], field1989[1], field1989[2]);
            class137.method2367(var29, var31, field1988[3], var26, var28, field1987[3], field1989[0], field1989[2], field1989[3]);
        }
    }
}

package deob;

@ObfuscatedName("ev")
public class class134 extends class142 {

    @ObfuscatedName("ev.w")
    public static class134 field1937 = new class134();

    @ObfuscatedName("ev.o")
    public static byte[] field1933 = new byte[1];

    @ObfuscatedName("ev.x")
    public static class134 field1934 = new class134();

    @ObfuscatedName("ev.k")
    public static byte[] field1935 = new byte[1];

    @ObfuscatedName("ev.f")
    public int field1964 = 0;

    @ObfuscatedName("ev.i")
    public int[] field1954;

    @ObfuscatedName("ev.j")
    public int[] field1938;

    @ObfuscatedName("ev.m")
    public int[] field1939;

    @ObfuscatedName("ev.u")
    public int field1936 = 0;

    @ObfuscatedName("ev.r")
    public int[] field1941;

    @ObfuscatedName("ev.v")
    public int[] field1946;

    @ObfuscatedName("ev.h")
    public int[] field1986;

    @ObfuscatedName("ev.a")
    public int[] field1932;

    @ObfuscatedName("ev.p")
    public int[] field1945;

    @ObfuscatedName("ev.q")
    public int[] field1989;

    @ObfuscatedName("ev.l")
    public byte[] field1947;

    @ObfuscatedName("ev.c")
    public byte[] field1948;

    @ObfuscatedName("ev.n")
    public byte[] field1983;

    @ObfuscatedName("ev.z")
    public short[] field1968;

    @ObfuscatedName("ev.e")
    public byte field1951 = 0;

    @ObfuscatedName("ev.g")
    public int field1952 = 0;

    @ObfuscatedName("ev.d")
    public int[] field1953;

    @ObfuscatedName("ev.y")
    public int[] field1944;

    @ObfuscatedName("ev.t")
    public int[] field1955;

    @ObfuscatedName("ev.b")
    public int[][] field1956;

    @ObfuscatedName("ev.s")
    public int[][] field1957;

    @ObfuscatedName("ev.ap")
    public boolean field1975 = false;

    @ObfuscatedName("ev.ac")
    public int field1959;

    @ObfuscatedName("ev.af")
    public int field1960;

    @ObfuscatedName("ev.ai")
    public int field1949;

    @ObfuscatedName("ev.ad")
    public int field1962;

    @ObfuscatedName("ev.ar")
    public int field1963;

    @ObfuscatedName("ev.aq")
    public int field1942;

    @ObfuscatedName("ev.ag")
    public int field1965;

    @ObfuscatedName("ev.ak")
    public int field1966;

    @ObfuscatedName("ev.ae")
    public int field1967 = -1;

    @ObfuscatedName("ev.am")
    public int field1978 = -1;

    @ObfuscatedName("ev.az")
    public int field1969 = -1;

    @ObfuscatedName("ev.as")
    public static boolean[] field1971 = new boolean[4700];

    @ObfuscatedName("ev.aw")
    public static boolean[] field1972 = new boolean[4700];

    @ObfuscatedName("ev.at")
    public static int[] field1997 = new int[4700];

    @ObfuscatedName("ev.aj")
    public static int[] field1974 = new int[4700];

    @ObfuscatedName("ev.ax")
    public static int[] field1940 = new int[4700];

    @ObfuscatedName("ev.an")
    public static int[] field1976 = new int[4700];

    @ObfuscatedName("ev.ab")
    public static int[] field1977 = new int[4700];

    @ObfuscatedName("ev.av")
    public static int[] field2000 = new int[4700];

    @ObfuscatedName("ev.ah")
    public static int[] field1979 = new int[1600];

    @ObfuscatedName("ev.au")
    public static int[][] field1943 = new int[1600][512];

    @ObfuscatedName("ev.aa")
    public static int[] field1982 = new int[12];

    @ObfuscatedName("ev.ao")
    public static int[][] field1970 = new int[12][2000];

    @ObfuscatedName("ev.bm")
    public static int[] field1984 = new int[2000];

    @ObfuscatedName("ev.bd")
    public static int[] field1985 = new int[2000];

    @ObfuscatedName("ev.bn")
    public static int[] field1973 = new int[12];

    @ObfuscatedName("ev.by")
    public static int[] field1987 = new int[10];

    @ObfuscatedName("ev.bo")
    public static int[] field1988 = new int[10];

    @ObfuscatedName("ev.ba")
    public static int[] field1950 = new int[10];

    @ObfuscatedName("ev.bg")
    public static boolean field1993 = true;

    @ObfuscatedName("ev.bp")
    public static int[] field1996 = class137.field2043;

    @ObfuscatedName("ev.bu")
    public static int[] field1961 = class137.field2037;

    @ObfuscatedName("ev.bf")
    public static int[] field1990 = class137.field2018;

    @ObfuscatedName("ev.br")
    public static int[] field1999 = class137.field2038;

    public class134() {
    }

    public class134(class134[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1964 = 0;
        this.field1936 = 0;
        this.field1952 = 0;
        this.field1951 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class134 var8 = arg0[var7];
            if (var8 != null) {
                this.field1964 += var8.field1964;
                this.field1936 += var8.field1936;
                this.field1952 += var8.field1952;
                if (var8.field1947 == null) {
                    if (this.field1951 == -1) {
                        this.field1951 = var8.field1951;
                    }
                    if (this.field1951 != var8.field1951) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1948 != null;
                var5 |= var8.field1968 != null;
                var6 |= var8.field1983 != null;
            }
        }
        this.field1954 = new int[this.field1964];
        this.field1938 = new int[this.field1964];
        this.field1939 = new int[this.field1964];
        this.field1941 = new int[this.field1936];
        this.field1946 = new int[this.field1936];
        this.field1986 = new int[this.field1936];
        this.field1932 = new int[this.field1936];
        this.field1945 = new int[this.field1936];
        this.field1989 = new int[this.field1936];
        if (var3) {
            this.field1947 = new byte[this.field1936];
        }
        if (var4) {
            this.field1948 = new byte[this.field1936];
        }
        if (var5) {
            this.field1968 = new short[this.field1936];
        }
        if (var6) {
            this.field1983 = new byte[this.field1936];
        }
        if (this.field1952 > 0) {
            this.field1953 = new int[this.field1952];
            this.field1944 = new int[this.field1952];
            this.field1955 = new int[this.field1952];
        }
        this.field1964 = 0;
        this.field1936 = 0;
        this.field1952 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class134 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1936; var11++) {
                    this.field1941[this.field1936] = var10.field1941[var11] + this.field1964;
                    this.field1946[this.field1936] = var10.field1946[var11] + this.field1964;
                    this.field1986[this.field1936] = var10.field1986[var11] + this.field1964;
                    this.field1932[this.field1936] = var10.field1932[var11];
                    this.field1945[this.field1936] = var10.field1945[var11];
                    this.field1989[this.field1936] = var10.field1989[var11];
                    if (var3) {
                        if (var10.field1947 == null) {
                            this.field1947[this.field1936] = var10.field1951;
                        } else {
                            this.field1947[this.field1936] = var10.field1947[var11];
                        }
                    }
                    if (var4 && var10.field1948 != null) {
                        this.field1948[this.field1936] = var10.field1948[var11];
                    }
                    if (var5) {
                        if (var10.field1968 == null) {
                            this.field1968[this.field1936] = -1;
                        } else {
                            this.field1968[this.field1936] = var10.field1968[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1983 == null || var10.field1983[var11] == -1) {
                            this.field1983[this.field1936] = -1;
                        } else {
                            this.field1983[this.field1936] = (byte) (var10.field1983[var11] + this.field1952);
                        }
                    }
                    this.field1936++;
                }
                for (int var12 = 0; var12 < var10.field1952; var12++) {
                    this.field1953[this.field1952] = var10.field1953[var12] + this.field1964;
                    this.field1944[this.field1952] = var10.field1944[var12] + this.field1964;
                    this.field1955[this.field1952] = var10.field1955[var12] + this.field1964;
                    this.field1952++;
                }
                for (int var13 = 0; var13 < var10.field1964; var13++) {
                    this.field1954[this.field1964] = var10.field1954[var13];
                    this.field1938[this.field1964] = var10.field1938[var13];
                    this.field1939[this.field1964] = var10.field1939[var13];
                    this.field1964++;
                }
            }
        }
    }

    @ObfuscatedName("ev.w([[IIIIZI)Lev;")
    public class134 method2249(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2303();
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
            var15.field1964 = this.field1964;
            var15.field1936 = this.field1936;
            var15.field1952 = this.field1952;
            var15.field1954 = this.field1954;
            var15.field1939 = this.field1939;
            var15.field1941 = this.field1941;
            var15.field1946 = this.field1946;
            var15.field1986 = this.field1986;
            var15.field1932 = this.field1932;
            var15.field1945 = this.field1945;
            var15.field1989 = this.field1989;
            var15.field1947 = this.field1947;
            var15.field1948 = this.field1948;
            var15.field1983 = this.field1983;
            var15.field1968 = this.field1968;
            var15.field1951 = this.field1951;
            var15.field1953 = this.field1953;
            var15.field1944 = this.field1944;
            var15.field1955 = this.field1955;
            var15.field1956 = this.field1956;
            var15.field1957 = this.field1957;
            var15.field1975 = this.field1975;
            var15.field1938 = new int[var15.field1964];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1964; var16++) {
                int var17 = this.field1954[var16] + arg1;
                int var18 = this.field1939[var16] + arg3;
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
            for (int var26 = 0; var26 < var15.field1964; var26++) {
                int var27 = (-this.field1938[var26] << 16) / this.field2130;
                if (var27 < arg5) {
                    int var28 = this.field1954[var26] + arg1;
                    int var29 = this.field1939[var26] + arg3;
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
        var15.method2257();
        return var15;
    }

    @ObfuscatedName("ev.o(Z)Lev;")
    public class134 method2295(boolean arg0) {
        if (!arg0 && field1933.length < this.field1936) {
            field1933 = new byte[this.field1936 + 100];
        }
        return this.method2252(arg0, field1937, field1933);
    }

    @ObfuscatedName("ev.k(Z)Lev;")
    public class134 method2251(boolean arg0) {
        if (!arg0 && field1935.length < this.field1936) {
            field1935 = new byte[this.field1936 + 100];
        }
        return this.method2252(arg0, field1934, field1935);
    }

    @ObfuscatedName("ev.f(ZLev;[B)Lev;")
    public class134 method2252(boolean arg0, class134 arg1, byte[] arg2) {
        arg1.field1964 = this.field1964;
        arg1.field1936 = this.field1936;
        arg1.field1952 = this.field1952;
        if (arg1.field1954 == null || arg1.field1954.length < this.field1964) {
            arg1.field1954 = new int[this.field1964 + 100];
            arg1.field1938 = new int[this.field1964 + 100];
            arg1.field1939 = new int[this.field1964 + 100];
        }
        for (int var4 = 0; var4 < this.field1964; var4++) {
            arg1.field1954[var4] = this.field1954[var4];
            arg1.field1938[var4] = this.field1938[var4];
            arg1.field1939[var4] = this.field1939[var4];
        }
        if (arg0) {
            arg1.field1948 = this.field1948;
        } else {
            arg1.field1948 = arg2;
            if (this.field1948 == null) {
                for (int var5 = 0; var5 < this.field1936; var5++) {
                    arg1.field1948[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1936; var6++) {
                    arg1.field1948[var6] = this.field1948[var6];
                }
            }
        }
        arg1.field1941 = this.field1941;
        arg1.field1946 = this.field1946;
        arg1.field1986 = this.field1986;
        arg1.field1932 = this.field1932;
        arg1.field1945 = this.field1945;
        arg1.field1989 = this.field1989;
        arg1.field1947 = this.field1947;
        arg1.field1983 = this.field1983;
        arg1.field1968 = this.field1968;
        arg1.field1951 = this.field1951;
        arg1.field1953 = this.field1953;
        arg1.field1944 = this.field1944;
        arg1.field1955 = this.field1955;
        arg1.field1956 = this.field1956;
        arg1.field1957 = this.field1957;
        arg1.field1975 = this.field1975;
        arg1.method2257();
        return arg1;
    }

    @ObfuscatedName("ev.i(I)V")
    public void method2253(int arg0) {
        if (this.field1967 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1961[arg0];
        int var9 = field1996[arg0];
        for (int var10 = 0; var10 < this.field1964; var10++) {
            int var11 = class137.method2366(this.field1954[var10], this.field1939[var10], var8, var9);
            int var12 = this.field1938[var10];
            int var13 = class137.method2360(this.field1954[var10], this.field1939[var10], var8, var9);
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
        this.field1942 = (var2 + var5) / 2;
        this.field1965 = (var3 + var6) / 2;
        this.field1966 = (var4 + var7) / 2;
        this.field1967 = (var5 - var2 + 1) / 2;
        this.field1978 = (var6 - var3 + 1) / 2;
        this.field1969 = (var7 - var4 + 1) / 2;
        if (this.field1967 < 32) {
            this.field1967 = 32;
        }
        if (this.field1969 < 32) {
            this.field1969 = 32;
        }
        if (this.field1975) {
            this.field1967 += 8;
            this.field1969 += 8;
        }
    }

    @ObfuscatedName("ev.j()V")
    public void method2303() {
        if (this.field1959 == 1) {
            return;
        }
        this.field1959 = 1;
        this.field2130 = 0;
        this.field1960 = 0;
        this.field1949 = 0;
        for (int var1 = 0; var1 < this.field1964; var1++) {
            int var2 = this.field1954[var1];
            int var3 = this.field1938[var1];
            int var4 = this.field1939[var1];
            if (-var3 > this.field2130) {
                this.field2130 = -var3;
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
        this.field1963 = (int) (Math.sqrt((double) (this.field2130 * this.field2130 + this.field1949 * this.field1949)) + 0.99D);
        this.field1962 = this.field1963 + (int) (Math.sqrt((double) (this.field1960 * this.field1960 + this.field1949 * this.field1949)) + 0.99D);
    }

    @ObfuscatedName("ev.m()V")
    public void method2255() {
        if (this.field1959 == 2) {
            return;
        }
        this.field1959 = 2;
        this.field1949 = 0;
        for (int var1 = 0; var1 < this.field1964; var1++) {
            int var2 = this.field1954[var1];
            int var3 = this.field1938[var1];
            int var4 = this.field1939[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1949) {
                this.field1949 = var5;
            }
        }
        this.field1949 = (int) (Math.sqrt((double) this.field1949) + 0.99D);
        this.field1963 = this.field1949;
        this.field1962 = this.field1949 + this.field1949;
    }

    @ObfuscatedName("ev.u()I")
    public int method2256() {
        this.method2303();
        return this.field1949;
    }

    @ObfuscatedName("ev.a()V")
    public void method2257() {
        this.field1959 = 0;
        this.field1967 = -1;
    }

    @ObfuscatedName("ev.p(Lek;I)V")
    public void method2301(class145 arg0, int arg1) {
        if (this.field1956 == null || arg1 == -1) {
            return;
        }
        class132 var3 = arg0.field2150[arg1];
        class139 var4 = var3.field1901;
        Statics.field1958 = 0;
        Statics.field1991 = 0;
        Statics.field1992 = 0;
        for (int var5 = 0; var5 < var3.field1902; var5++) {
            int var6 = var3.field1903[var5];
            this.method2260(var4.field2057[var6], var4.field2060[var6], var3.field1897[var5], var3.field1904[var5], var3.field1906[var5]);
        }
        this.method2257();
    }

    @ObfuscatedName("ev.q(Lek;ILek;I[I)V")
    public void method2259(class145 arg0, int arg1, class145 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2301(arg0, arg1);
            return;
        }
        class132 var6 = arg0.field2150[arg1];
        class132 var7 = arg2.field2150[arg3];
        class139 var8 = var6.field1901;
        Statics.field1958 = 0;
        Statics.field1991 = 0;
        Statics.field1992 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1902; var11++) {
            int var12 = var6.field1903[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2057[var12] == 0) {
                this.method2260(var8.field2057[var12], var8.field2060[var12], var6.field1897[var11], var6.field1904[var11], var6.field1906[var11]);
            }
        }
        Statics.field1958 = 0;
        Statics.field1991 = 0;
        Statics.field1992 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1902; var15++) {
            int var16 = var7.field1903[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2057[var16] == 0) {
                this.method2260(var8.field2057[var16], var8.field2060[var16], var7.field1897[var15], var7.field1904[var15], var7.field1906[var15]);
            }
        }
        this.method2257();
    }

    @ObfuscatedName("ev.l(I[IIII)V")
    public void method2260(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1958 = 0;
            Statics.field1991 = 0;
            Statics.field1992 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1956.length) {
                    int[] var10 = this.field1956[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1958 += this.field1954[var12];
                        Statics.field1991 += this.field1938[var12];
                        Statics.field1992 += this.field1939[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1958 = Statics.field1958 / var7 + arg2;
                Statics.field1991 = Statics.field1991 / var7 + arg3;
                Statics.field1992 = Statics.field1992 / var7 + arg4;
            } else {
                Statics.field1958 = arg2;
                Statics.field1991 = arg3;
                Statics.field1992 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1956.length) {
                    int[] var15 = this.field1956[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1954[var17] += arg2;
                        this.field1938[var17] += arg3;
                        this.field1939[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1956.length) {
                    int[] var20 = this.field1956[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1954[var22] -= Statics.field1958;
                        this.field1938[var22] -= Statics.field1991;
                        this.field1939[var22] -= Statics.field1992;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1996[var25];
                            int var27 = field1961[var25];
                            int var28 = this.field1954[var22] * var27 + this.field1938[var22] * var26 >> 16;
                            this.field1938[var22] = this.field1938[var22] * var27 - this.field1954[var22] * var26 >> 16;
                            this.field1954[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1996[var23];
                            int var30 = field1961[var23];
                            int var31 = this.field1938[var22] * var30 - this.field1939[var22] * var29 >> 16;
                            this.field1939[var22] = this.field1939[var22] * var30 + this.field1938[var22] * var29 >> 16;
                            this.field1938[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1996[var24];
                            int var33 = field1961[var24];
                            int var34 = this.field1954[var22] * var33 + this.field1939[var22] * var32 >> 16;
                            this.field1939[var22] = this.field1939[var22] * var33 - this.field1954[var22] * var32 >> 16;
                            this.field1954[var22] = var34;
                        }
                        this.field1954[var22] += Statics.field1958;
                        this.field1938[var22] += Statics.field1991;
                        this.field1939[var22] += Statics.field1992;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1956.length) {
                    int[] var37 = this.field1956[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1954[var39] -= Statics.field1958;
                        this.field1938[var39] -= Statics.field1991;
                        this.field1939[var39] -= Statics.field1992;
                        this.field1954[var39] = this.field1954[var39] * arg2 / 128;
                        this.field1938[var39] = this.field1938[var39] * arg3 / 128;
                        this.field1939[var39] = this.field1939[var39] * arg4 / 128;
                        this.field1954[var39] += Statics.field1958;
                        this.field1938[var39] += Statics.field1991;
                        this.field1939[var39] += Statics.field1992;
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

    @ObfuscatedName("ev.c()V")
    public void method2261() {
        for (int var1 = 0; var1 < this.field1964; var1++) {
            int var2 = this.field1954[var1];
            this.field1954[var1] = this.field1939[var1];
            this.field1939[var1] = -var2;
        }
        this.method2257();
    }

    @ObfuscatedName("ev.n()V")
    public void method2250() {
        for (int var1 = 0; var1 < this.field1964; var1++) {
            this.field1954[var1] = -this.field1954[var1];
            this.field1939[var1] = -this.field1939[var1];
        }
        this.method2257();
    }

    @ObfuscatedName("ev.z()V")
    public void method2263() {
        for (int var1 = 0; var1 < this.field1964; var1++) {
            int var2 = this.field1939[var1];
            this.field1939[var1] = this.field1954[var1];
            this.field1954[var1] = -var2;
        }
        this.method2257();
    }

    @ObfuscatedName("ev.e(I)V")
    public void method2289(int arg0) {
        int var2 = field1996[arg0];
        int var3 = field1961[arg0];
        for (int var4 = 0; var4 < this.field1964; var4++) {
            int var5 = this.field1938[var4] * var3 - this.field1939[var4] * var2 >> 16;
            this.field1939[var4] = this.field1939[var4] * var3 + this.field1938[var4] * var2 >> 16;
            this.field1938[var4] = var5;
        }
        this.method2257();
    }

    @ObfuscatedName("ev.t(III)V")
    public void method2285(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1964; var4++) {
            this.field1954[var4] += arg0;
            this.field1938[var4] += arg1;
            this.field1939[var4] += arg2;
        }
        this.method2257();
    }

    @ObfuscatedName("ev.b(III)V")
    public void method2266(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1964; var4++) {
            this.field1954[var4] = this.field1954[var4] * arg0 / 128;
            this.field1938[var4] = this.field1938[var4] * arg1 / 128;
            this.field1939[var4] = this.field1939[var4] * arg2 / 128;
        }
        this.method2257();
    }

    @ObfuscatedName("ev.s(IIIIIII)V")
    public final void method2267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1979[0] = -1;
        if (this.field1959 != 2 && this.field1959 != 1) {
            this.method2255();
        }
        int var8 = Statics.field2030;
        int var9 = Statics.field2042;
        int var10 = field1996[arg0];
        int var11 = field1961[arg0];
        int var12 = field1996[arg1];
        int var13 = field1961[arg1];
        int var14 = field1996[arg2];
        int var15 = field1961[arg2];
        int var16 = field1996[arg3];
        int var17 = field1961[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1964; var19++) {
            int var20 = this.field1954[var19];
            int var21 = this.field1938[var19];
            int var22 = this.field1939[var19];
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
            field1940[var19] = var30 - var18;
            field1997[var19] = class137.field2029 * var26 / var30 + var8;
            field1974[var19] = class137.field2029 * var29 / var30 + var9;
            if (this.field1952 > 0) {
                field1976[var19] = var26;
                field1977[var19] = var29;
                field2000[var19] = var30;
            }
        }
        try {
            this.method2270(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ev.ap(IIIIIIII)V")
    public final void method2268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1979[0] = -1;
        if (this.field1959 != 2 && this.field1959 != 1) {
            this.method2255();
        }
        int var9 = Statics.field2030;
        int var10 = Statics.field2042;
        int var11 = field1996[arg0];
        int var12 = field1961[arg0];
        int var13 = field1996[arg1];
        int var14 = field1961[arg1];
        int var15 = field1996[arg2];
        int var16 = field1961[arg2];
        int var17 = field1996[arg3];
        int var18 = field1961[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1964; var20++) {
            int var21 = this.field1954[var20];
            int var22 = this.field1938[var20];
            int var23 = this.field1939[var20];
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
            field1940[var20] = var31 - var19;
            field1997[var20] = class137.field2029 * var27 / arg7 + var9;
            field1974[var20] = class137.field2029 * var30 / arg7 + var10;
            if (this.field1952 > 0) {
                field1976[var20] = var27;
                field1977[var20] = var30;
                field2000[var20] = var31;
            }
        }
        try {
            this.method2270(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ev.ca(IIIIIIIII)V")
    public void method2269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1979[0] = -1;
        if (this.field1959 != 1) {
            this.method2303();
        }
        this.method2253(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1949 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1949) * class137.field2029;
        if (var15 / var13 >= Statics.field2035) {
            return;
        }
        int var16 = (this.field1949 + var14) * class137.field2029;
        if (var16 / var13 <= Statics.field2034) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1949 * arg1 >> 16;
        int var19 = (var17 + var18) * class137.field2029;
        if (var19 / var13 <= Statics.field2031) {
            return;
        }
        int var20 = (this.field2130 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class137.field2029;
        if (var21 / var13 >= Statics.field2041) {
            return;
        }
        int var22 = (this.field2130 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1952 > 0;
        int var26 = class135.method116();
        int var27 = class135.method41();
        boolean var28 = class135.field2002;
        if (class8.field241 && arg8 > 0) {
            if (class135.method1457(this, arg5, arg6, arg7)) {
                class8.method3828(this, arg5, arg6, arg7, -65281);
            } else if (class8.field239 == class12.field272) {
                class8.method3828(this, arg5, arg6, arg7, -16776961);
            }
        }
        if (class8.field237 && arg8 > 0) {
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
            int var41 = var26 - Statics.field2030;
            int var42 = var27 - Statics.field2042;
            if (var41 > var36 && var41 < var37 && var42 > var38 && var42 < var39) {
                var40 = -256;
            }
            int var43 = Statics.field2030 + var36;
            int var44 = Statics.field2042 + var38;
            int var45 = Statics.field2030 + var37;
            int var46 = Statics.field2042 + var39;
            class8.field240.method3283(new class9(var43, var44, var45, var46, var40));
        }
        boolean var47 = false;
        if (arg8 > 0 && var28) {
            boolean var48 = false;
            if (field1993) {
                var48 = class135.method1457(this, arg5, arg6, arg7);
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
                int var54 = var26 - Statics.field2030;
                int var55 = var27 - Statics.field2042;
                if (var54 > var50 && var54 < var51 && var55 > var52 && var55 < var53) {
                    var48 = true;
                }
            }
            if (var48) {
                if (this.field1975) {
                    class135.field2007[++class135.field2006 - 1] = arg8;
                } else {
                    var47 = true;
                }
            }
        }
        int var57 = Statics.field2030;
        int var58 = Statics.field2042;
        int var59 = 0;
        int var60 = 0;
        if (arg0 != 0) {
            var59 = field1996[arg0];
            var60 = field1961[arg0];
        }
        for (int var61 = 0; var61 < this.field1964; var61++) {
            int var62 = this.field1954[var61];
            int var63 = this.field1938[var61];
            int var64 = this.field1939[var61];
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
            field1940[var61] = var73 - var11;
            if (var73 >= 50) {
                field1997[var61] = class137.field2029 * var69 / var73 + var57;
                field1974[var61] = class137.field2029 * var72 / var73 + var58;
            } else {
                field1997[var61] = -5000;
                var23 = true;
            }
            if (var25) {
                field1976[var61] = var69;
                field1977[var61] = var72;
                field2000[var61] = var73;
            }
        }
        try {
            this.method2270(var23, var47, this.field1975, arg8);
        } catch (Exception var76) {
        }
    }

    @ObfuscatedName("ev.ac(ZZZI)V")
    public final void method2270(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1962 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1962; var5++) {
            field1979[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field238 && arg1) {
            class8.method581(this, var6);
        }
        for (int var7 = 0; var7 < this.field1936; var7++) {
            if (this.field1989[var7] != -2) {
                int var8 = this.field1941[var7];
                int var9 = this.field1946[var7];
                int var10 = this.field1986[var7];
                int var11 = field1997[var8];
                int var12 = field1997[var9];
                int var13 = field1997[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1976[var8];
                    int var15 = field1976[var9];
                    int var16 = field1976[var10];
                    int var17 = field1977[var8];
                    int var18 = field1977[var9];
                    int var19 = field1977[var10];
                    int var20 = field2000[var8];
                    int var21 = field2000[var9];
                    int var22 = field2000[var10];
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
                        field1972[var7] = true;
                        int var32 = (field1940[var8] + field1940[var9] + field1940[var10]) / 3 + this.field1963;
                        field1943[var32][field1979[var32]++] = var7;
                    }
                } else {
                    if (arg1) {
                        int var33 = field1974[var8];
                        int var34 = field1974[var9];
                        int var35 = field1974[var10];
                        int var36 = class135.field2008 + var6;
                        boolean var37;
                        if (var36 < var33 && var36 < var34 && var36 < var35) {
                            var37 = false;
                        } else {
                            int var38 = class135.field2008 - var6;
                            if (var38 > var33 && var38 > var34 && var38 > var35) {
                                var37 = false;
                            } else {
                                int var39 = class135.field2005 + var6;
                                if (var39 < var11 && var39 < var12 && var39 < var13) {
                                    var37 = false;
                                } else {
                                    int var40 = class135.field2005 - var6;
                                    if (var40 > var11 && var40 > var12 && var40 > var13) {
                                        var37 = false;
                                    } else {
                                        var37 = true;
                                    }
                                }
                            }
                        }
                        if (var37) {
                            class135.field2007[++class135.field2006 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1974[var10] - field1974[var9]) * (var11 - var12) - (field1974[var8] - field1974[var9]) * (var13 - var12) > 0) {
                        field1972[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field2032 && var12 <= Statics.field2032 && var13 <= Statics.field2032) {
                            field1971[var7] = false;
                        } else {
                            field1971[var7] = true;
                        }
                        int var42 = (field1940[var8] + field1940[var9] + field1940[var10]) / 3 + this.field1963;
                        field1943[var42][field1979[var42]++] = var7;
                    }
                }
            }
        }
        if (this.field1947 == null) {
            for (int var43 = this.field1962 - 1; var43 >= 0; var43--) {
                int var44 = field1979[var43];
                if (var44 > 0) {
                    int[] var45 = field1943[var43];
                    for (int var46 = 0; var46 < var44; var46++) {
                        this.method2271(var45[var46]);
                    }
                }
            }
            return;
        }
        for (int var47 = 0; var47 < 12; var47++) {
            field1982[var47] = 0;
            field1973[var47] = 0;
        }
        for (int var48 = this.field1962 - 1; var48 >= 0; var48--) {
            int var49 = field1979[var48];
            if (var49 > 0) {
                int[] var50 = field1943[var48];
                for (int var51 = 0; var51 < var49; var51++) {
                    int var52 = var50[var51];
                    byte var53 = this.field1947[var52];
                    int var54 = field1982[var53]++;
                    field1970[var53][var54] = var52;
                    if (var53 < 10) {
                        field1973[var53] += var48;
                    } else if (var53 == 10) {
                        field1984[var54] = var48;
                    } else {
                        field1985[var54] = var48;
                    }
                }
            }
        }
        int var55 = 0;
        if (field1982[1] > 0 || field1982[2] > 0) {
            var55 = (field1973[1] + field1973[2]) / (field1982[1] + field1982[2]);
        }
        int var56 = 0;
        if (field1982[3] > 0 || field1982[4] > 0) {
            var56 = (field1973[3] + field1973[4]) / (field1982[3] + field1982[4]);
        }
        int var57 = 0;
        if (field1982[6] > 0 || field1982[8] > 0) {
            var57 = (field1973[6] + field1973[8]) / (field1982[6] + field1982[8]);
        }
        int var58 = 0;
        int var59 = field1982[10];
        int[] var60 = field1970[10];
        int[] var61 = field1984;
        if (var58 == var59) {
            var58 = 0;
            var59 = field1982[11];
            var60 = field1970[11];
            var61 = field1985;
        }
        int var62;
        if (var58 < var59) {
            var62 = var61[var58];
        } else {
            var62 = -1000;
        }
        for (int var63 = 0; var63 < 10; var63++) {
            while (var63 == 0 && var62 > var55) {
                this.method2271(var60[var58++]);
                if (var58 == var59 && field1970[11] != var60) {
                    var58 = 0;
                    var59 = field1982[11];
                    var60 = field1970[11];
                    var61 = field1985;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 3 && var62 > var56) {
                this.method2271(var60[var58++]);
                if (var58 == var59 && field1970[11] != var60) {
                    var58 = 0;
                    var59 = field1982[11];
                    var60 = field1970[11];
                    var61 = field1985;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 5 && var62 > var57) {
                this.method2271(var60[var58++]);
                if (var58 == var59 && field1970[11] != var60) {
                    var58 = 0;
                    var59 = field1982[11];
                    var60 = field1970[11];
                    var61 = field1985;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            int var64 = field1982[var63];
            int[] var65 = field1970[var63];
            for (int var66 = 0; var66 < var64; var66++) {
                this.method2271(var65[var66]);
            }
        }
        while (var62 != -1000) {
            this.method2271(var60[var58++]);
            if (var58 == var59 && field1970[11] != var60) {
                var58 = 0;
                var60 = field1970[11];
                var59 = field1982[11];
                var61 = field1985;
            }
            if (var58 < var59) {
                var62 = var61[var58];
            } else {
                var62 = -1000;
            }
        }
    }

    @ObfuscatedName("ev.af(I)V")
    public final void method2271(int arg0) {
        if (field1972[arg0]) {
            this.method2322(arg0);
            return;
        }
        int var2 = this.field1941[arg0];
        int var3 = this.field1946[arg0];
        int var4 = this.field1986[arg0];
        class137.field2044 = field1971[arg0];
        if (this.field1948 == null) {
            class137.field2022 = 0;
        } else {
            class137.field2022 = this.field1948[arg0] & 0xFF;
        }
        if (this.field1968 != null && this.field1968[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1983 == null || this.field1983[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1983[arg0] & 0xFF;
                var6 = this.field1953[var5];
                var7 = this.field1944[var5];
                var8 = this.field1955[var5];
            }
            if (this.field1989[arg0] == -1) {
                class137.method2416(field1974[var2], field1974[var3], field1974[var4], field1997[var2], field1997[var3], field1997[var4], this.field1932[arg0], this.field1932[arg0], this.field1932[arg0], field1976[var6], field1976[var7], field1976[var8], field1977[var6], field1977[var7], field1977[var8], field2000[var6], field2000[var7], field2000[var8], this.field1968[arg0]);
            } else {
                class137.method2416(field1974[var2], field1974[var3], field1974[var4], field1997[var2], field1997[var3], field1997[var4], this.field1932[arg0], this.field1945[arg0], this.field1989[arg0], field1976[var6], field1976[var7], field1976[var8], field1977[var6], field1977[var7], field1977[var8], field2000[var6], field2000[var7], field2000[var8], this.field1968[arg0]);
            }
        } else if (this.field1989[arg0] == -1) {
            class137.method2371(field1974[var2], field1974[var3], field1974[var4], field1997[var2], field1997[var3], field1997[var4], field1990[this.field1932[arg0]]);
        } else {
            class137.method2357(field1974[var2], field1974[var3], field1974[var4], field1997[var2], field1997[var3], field1997[var4], this.field1932[arg0], this.field1945[arg0], this.field1989[arg0]);
        }
    }

    @ObfuscatedName("ev.ai(I)V")
    public final void method2322(int arg0) {
        int var2 = Statics.field2030;
        int var3 = Statics.field2042;
        int var4 = 0;
        int var5 = this.field1941[arg0];
        int var6 = this.field1946[arg0];
        int var7 = this.field1986[arg0];
        int var8 = field2000[var5];
        int var9 = field2000[var6];
        int var10 = field2000[var7];
        if (this.field1948 == null) {
            class137.field2022 = 0;
        } else {
            class137.field2022 = this.field1948[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1987[var4] = field1997[var5];
            field1988[var4] = field1974[var5];
            field1950[var4++] = this.field1932[arg0];
        } else {
            int var11 = field1976[var5];
            int var12 = field1977[var5];
            int var13 = this.field1932[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1999[var10 - var8];
                field1987[var4] = (((field1976[var7] - var11) * var14 >> 16) + var11) * class137.field2029 / 50 + var2;
                field1988[var4] = (((field1977[var7] - var12) * var14 >> 16) + var12) * class137.field2029 / 50 + var3;
                field1950[var4++] = ((this.field1989[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1999[var9 - var8];
                field1987[var4] = (((field1976[var6] - var11) * var15 >> 16) + var11) * class137.field2029 / 50 + var2;
                field1988[var4] = (((field1977[var6] - var12) * var15 >> 16) + var12) * class137.field2029 / 50 + var3;
                field1950[var4++] = ((this.field1945[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1987[var4] = field1997[var6];
            field1988[var4] = field1974[var6];
            field1950[var4++] = this.field1945[arg0];
        } else {
            int var16 = field1976[var6];
            int var17 = field1977[var6];
            int var18 = this.field1945[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1999[var8 - var9];
                field1987[var4] = (((field1976[var5] - var16) * var19 >> 16) + var16) * class137.field2029 / 50 + var2;
                field1988[var4] = (((field1977[var5] - var17) * var19 >> 16) + var17) * class137.field2029 / 50 + var3;
                field1950[var4++] = ((this.field1932[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1999[var10 - var9];
                field1987[var4] = (((field1976[var7] - var16) * var20 >> 16) + var16) * class137.field2029 / 50 + var2;
                field1988[var4] = (((field1977[var7] - var17) * var20 >> 16) + var17) * class137.field2029 / 50 + var3;
                field1950[var4++] = ((this.field1989[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1987[var4] = field1997[var7];
            field1988[var4] = field1974[var7];
            field1950[var4++] = this.field1989[arg0];
        } else {
            int var21 = field1976[var7];
            int var22 = field1977[var7];
            int var23 = this.field1989[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1999[var9 - var10];
                field1987[var4] = (((field1976[var6] - var21) * var24 >> 16) + var21) * class137.field2029 / 50 + var2;
                field1988[var4] = (((field1977[var6] - var22) * var24 >> 16) + var22) * class137.field2029 / 50 + var3;
                field1950[var4++] = ((this.field1945[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1999[var8 - var10];
                field1987[var4] = (((field1976[var5] - var21) * var25 >> 16) + var21) * class137.field2029 / 50 + var2;
                field1988[var4] = (((field1977[var5] - var22) * var25 >> 16) + var22) * class137.field2029 / 50 + var3;
                field1950[var4++] = ((this.field1932[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1987[0];
        int var27 = field1987[1];
        int var28 = field1987[2];
        int var29 = field1988[0];
        int var30 = field1988[1];
        int var31 = field1988[2];
        class137.field2044 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2032 || var27 > Statics.field2032 || var28 > Statics.field2032) {
                class137.field2044 = true;
            }
            if (this.field1968 != null && this.field1968[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1983 == null || this.field1983[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1983[arg0] & 0xFF;
                    var33 = this.field1953[var32];
                    var34 = this.field1944[var32];
                    var35 = this.field1955[var32];
                }
                if (this.field1989[arg0] == -1) {
                    class137.method2416(var29, var30, var31, var26, var27, var28, this.field1932[arg0], this.field1932[arg0], this.field1932[arg0], field1976[var33], field1976[var34], field1976[var35], field1977[var33], field1977[var34], field1977[var35], field2000[var33], field2000[var34], field2000[var35], this.field1968[arg0]);
                } else {
                    class137.method2416(var29, var30, var31, var26, var27, var28, field1950[0], field1950[1], field1950[2], field1976[var33], field1976[var34], field1976[var35], field1977[var33], field1977[var34], field1977[var35], field2000[var33], field2000[var34], field2000[var35], this.field1968[arg0]);
                }
            } else if (this.field1989[arg0] == -1) {
                class137.method2371(var29, var30, var31, var26, var27, var28, field1990[this.field1932[arg0]]);
            } else {
                class137.method2357(var29, var30, var31, var26, var27, var28, field1950[0], field1950[1], field1950[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2032 || var27 > Statics.field2032 || var28 > Statics.field2032 || field1987[3] < 0 || field1987[3] > Statics.field2032) {
            class137.field2044 = true;
        }
        if (this.field1968 != null && this.field1968[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1983 == null || this.field1983[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1983[arg0] & 0xFF;
                var37 = this.field1953[var36];
                var38 = this.field1944[var36];
                var39 = this.field1955[var36];
            }
            short var40 = this.field1968[arg0];
            if (this.field1989[arg0] == -1) {
                class137.method2416(var29, var30, var31, var26, var27, var28, this.field1932[arg0], this.field1932[arg0], this.field1932[arg0], field1976[var37], field1976[var38], field1976[var39], field1977[var37], field1977[var38], field1977[var39], field2000[var37], field2000[var38], field2000[var39], var40);
                class137.method2416(var29, var31, field1988[3], var26, var28, field1987[3], this.field1932[arg0], this.field1932[arg0], this.field1932[arg0], field1976[var37], field1976[var38], field1976[var39], field1977[var37], field1977[var38], field1977[var39], field2000[var37], field2000[var38], field2000[var39], var40);
            } else {
                class137.method2416(var29, var30, var31, var26, var27, var28, field1950[0], field1950[1], field1950[2], field1976[var37], field1976[var38], field1976[var39], field1977[var37], field1977[var38], field1977[var39], field2000[var37], field2000[var38], field2000[var39], var40);
                class137.method2416(var29, var31, field1988[3], var26, var28, field1987[3], field1950[0], field1950[2], field1950[3], field1976[var37], field1976[var38], field1976[var39], field1977[var37], field1977[var38], field1977[var39], field2000[var37], field2000[var38], field2000[var39], var40);
            }
        } else if (this.field1989[arg0] == -1) {
            int var41 = field1990[this.field1932[arg0]];
            class137.method2371(var29, var30, var31, var26, var27, var28, var41);
            class137.method2371(var29, var31, field1988[3], var26, var28, field1987[3], var41);
        } else {
            class137.method2357(var29, var30, var31, var26, var27, var28, field1950[0], field1950[1], field1950[2]);
            class137.method2357(var29, var31, field1988[3], var26, var28, field1987[3], field1950[0], field1950[2], field1950[3]);
        }
    }
}

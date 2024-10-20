package deob;

@ObfuscatedName("em")
public class class133 extends class141 {

    @ObfuscatedName("em.i")
    public static class133 field2000 = new class133();

    @ObfuscatedName("em.j")
    public static byte[] field1978 = new byte[1];

    @ObfuscatedName("em.a")
    public static class133 field1934 = new class133();

    @ObfuscatedName("em.r")
    public static byte[] field1935 = new byte[1];

    @ObfuscatedName("em.o")
    public int field1936 = 0;

    @ObfuscatedName("em.n")
    public int[] field1937;

    @ObfuscatedName("em.q")
    public int[] field1953;

    @ObfuscatedName("em.b")
    public int[] field1939;

    @ObfuscatedName("em.k")
    public int field1940 = 0;

    @ObfuscatedName("em.s")
    public int[] field1941;

    @ObfuscatedName("em.d")
    public int[] field1942;

    @ObfuscatedName("em.l")
    public int[] field1986;

    @ObfuscatedName("em.t")
    public int[] field1944;

    @ObfuscatedName("em.y")
    public int[] field1945;

    @ObfuscatedName("em.v")
    public int[] field2001;

    @ObfuscatedName("em.c")
    public byte[] field1947;

    @ObfuscatedName("em.z")
    public byte[] field1985;

    @ObfuscatedName("em.u")
    public byte[] field1949;

    @ObfuscatedName("em.e")
    public short[] field1950;

    @ObfuscatedName("em.p")
    public byte field1999 = 0;

    @ObfuscatedName("em.m")
    public int field1952 = 0;

    @ObfuscatedName("em.x")
    public int[] field1932;

    @ObfuscatedName("em.h")
    public int[] field1954;

    @ObfuscatedName("em.f")
    public int[] field1955;

    @ObfuscatedName("em.g")
    public int[][] field1956;

    @ObfuscatedName("em.w")
    public int[][] field1961;

    @ObfuscatedName("em.ar")
    public boolean field1958 = false;

    @ObfuscatedName("em.ax")
    public int field1959;

    @ObfuscatedName("em.al")
    public int field1968;

    @ObfuscatedName("em.ag")
    public int field1973;

    @ObfuscatedName("em.ad")
    public int field1962;

    @ObfuscatedName("em.ab")
    public int field1963;

    @ObfuscatedName("em.am")
    public int field1964;

    @ObfuscatedName("em.aq")
    public int field1933;

    @ObfuscatedName("em.at")
    public int field1966;

    @ObfuscatedName("em.az")
    public int field1976 = -1;

    @ObfuscatedName("em.ac")
    public int field1983 = -1;

    @ObfuscatedName("em.aa")
    public int field1969 = -1;

    @ObfuscatedName("em.ay")
    public static boolean[] field1974 = new boolean[4700];

    @ObfuscatedName("em.av")
    public static boolean[] field1972 = new boolean[4700];

    @ObfuscatedName("em.ao")
    public static int[] field1984 = new int[4700];

    @ObfuscatedName("em.aw")
    public static int[] field1971 = new int[4700];

    @ObfuscatedName("em.ah")
    public static int[] field1997 = new int[4700];

    @ObfuscatedName("em.an")
    public static int[] field1951 = new int[4700];

    @ObfuscatedName("em.af")
    public static int[] field1977 = new int[4700];

    @ObfuscatedName("em.ak")
    public static int[] field1960 = new int[4700];

    @ObfuscatedName("em.ap")
    public static int[] field1980 = new int[1600];

    @ObfuscatedName("em.ae")
    public static int[][] field1981 = new int[1600][512];

    @ObfuscatedName("em.ai")
    public static int[] field1982 = new int[12];

    @ObfuscatedName("em.au")
    public static int[][] field1965 = new int[12][2000];

    @ObfuscatedName("em.bp")
    public static int[] field1948 = new int[2000];

    @ObfuscatedName("em.bd")
    public static int[] field1946 = new int[2000];

    @ObfuscatedName("em.bs")
    public static int[] field1990 = new int[12];

    @ObfuscatedName("em.bc")
    public static int[] field1987 = new int[10];

    @ObfuscatedName("em.bv")
    public static int[] field1988 = new int[10];

    @ObfuscatedName("em.bw")
    public static int[] field1989 = new int[10];

    @ObfuscatedName("em.bz")
    public static boolean field1993 = true;

    @ObfuscatedName("em.bi")
    public static int[] field1996 = class136.field2045;

    @ObfuscatedName("em.bf")
    public static int[] field1938 = class136.field2029;

    @ObfuscatedName("em.bn")
    public static int[] field1998 = class136.field2041;

    @ObfuscatedName("em.be")
    public static int[] field1970 = class136.field2044;

    public class133() {
    }

    public class133(class133[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1936 = 0;
        this.field1940 = 0;
        this.field1952 = 0;
        this.field1999 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class133 var8 = arg0[var7];
            if (var8 != null) {
                this.field1936 += var8.field1936;
                this.field1940 += var8.field1940;
                this.field1952 += var8.field1952;
                if (var8.field1947 == null) {
                    if (this.field1999 == -1) {
                        this.field1999 = var8.field1999;
                    }
                    if (this.field1999 != var8.field1999) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1985 != null;
                var5 |= var8.field1950 != null;
                var6 |= var8.field1949 != null;
            }
        }
        this.field1937 = new int[this.field1936];
        this.field1953 = new int[this.field1936];
        this.field1939 = new int[this.field1936];
        this.field1941 = new int[this.field1940];
        this.field1942 = new int[this.field1940];
        this.field1986 = new int[this.field1940];
        this.field1944 = new int[this.field1940];
        this.field1945 = new int[this.field1940];
        this.field2001 = new int[this.field1940];
        if (var3) {
            this.field1947 = new byte[this.field1940];
        }
        if (var4) {
            this.field1985 = new byte[this.field1940];
        }
        if (var5) {
            this.field1950 = new short[this.field1940];
        }
        if (var6) {
            this.field1949 = new byte[this.field1940];
        }
        if (this.field1952 > 0) {
            this.field1932 = new int[this.field1952];
            this.field1954 = new int[this.field1952];
            this.field1955 = new int[this.field1952];
        }
        this.field1936 = 0;
        this.field1940 = 0;
        this.field1952 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class133 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1940; var11++) {
                    this.field1941[this.field1940] = var10.field1941[var11] + this.field1936;
                    this.field1942[this.field1940] = var10.field1942[var11] + this.field1936;
                    this.field1986[this.field1940] = var10.field1986[var11] + this.field1936;
                    this.field1944[this.field1940] = var10.field1944[var11];
                    this.field1945[this.field1940] = var10.field1945[var11];
                    this.field2001[this.field1940] = var10.field2001[var11];
                    if (var3) {
                        if (var10.field1947 == null) {
                            this.field1947[this.field1940] = var10.field1999;
                        } else {
                            this.field1947[this.field1940] = var10.field1947[var11];
                        }
                    }
                    if (var4 && var10.field1985 != null) {
                        this.field1985[this.field1940] = var10.field1985[var11];
                    }
                    if (var5) {
                        if (var10.field1950 == null) {
                            this.field1950[this.field1940] = -1;
                        } else {
                            this.field1950[this.field1940] = var10.field1950[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1949 == null || var10.field1949[var11] == -1) {
                            this.field1949[this.field1940] = -1;
                        } else {
                            this.field1949[this.field1940] = (byte) (var10.field1949[var11] + this.field1952);
                        }
                    }
                    this.field1940++;
                }
                for (int var12 = 0; var12 < var10.field1952; var12++) {
                    this.field1932[this.field1952] = var10.field1932[var12] + this.field1936;
                    this.field1954[this.field1952] = var10.field1954[var12] + this.field1936;
                    this.field1955[this.field1952] = var10.field1955[var12] + this.field1936;
                    this.field1952++;
                }
                for (int var13 = 0; var13 < var10.field1936; var13++) {
                    this.field1937[this.field1936] = var10.field1937[var13];
                    this.field1953[this.field1936] = var10.field1953[var13];
                    this.field1939[this.field1936] = var10.field1939[var13];
                    this.field1936++;
                }
            }
        }
    }

    @ObfuscatedName("em.i([[IIIIZI)Lem;")
    public class133 method2305(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2310();
        int var7 = arg1 - this.field1973;
        int var8 = this.field1973 + arg1;
        int var9 = arg3 - this.field1973;
        int var10 = this.field1973 + arg3;
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
        class133 var15;
        if (arg4) {
            var15 = new class133();
            var15.field1936 = this.field1936;
            var15.field1940 = this.field1940;
            var15.field1952 = this.field1952;
            var15.field1937 = this.field1937;
            var15.field1939 = this.field1939;
            var15.field1941 = this.field1941;
            var15.field1942 = this.field1942;
            var15.field1986 = this.field1986;
            var15.field1944 = this.field1944;
            var15.field1945 = this.field1945;
            var15.field2001 = this.field2001;
            var15.field1947 = this.field1947;
            var15.field1985 = this.field1985;
            var15.field1949 = this.field1949;
            var15.field1950 = this.field1950;
            var15.field1999 = this.field1999;
            var15.field1932 = this.field1932;
            var15.field1954 = this.field1954;
            var15.field1955 = this.field1955;
            var15.field1956 = this.field1956;
            var15.field1961 = this.field1961;
            var15.field1958 = this.field1958;
            var15.field1953 = new int[var15.field1936];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1936; var16++) {
                int var17 = this.field1937[var16] + arg1;
                int var18 = this.field1939[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1953[var16] = this.field1953[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1936; var26++) {
                int var27 = (-this.field1953[var26] << 16) / this.field2129;
                if (var27 < arg5) {
                    int var28 = this.field1937[var26] + arg1;
                    int var29 = this.field1939[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1953[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1953[var26];
                }
            }
        }
        var15.method2383();
        return var15;
    }

    @ObfuscatedName("em.j(Z)Lem;")
    public class133 method2306(boolean arg0) {
        if (!arg0 && field1978.length < this.field1940) {
            field1978 = new byte[this.field1940 + 100];
        }
        return this.method2308(arg0, field2000, field1978);
    }

    @ObfuscatedName("em.r(Z)Lem;")
    public class133 method2325(boolean arg0) {
        if (!arg0 && field1935.length < this.field1940) {
            field1935 = new byte[this.field1940 + 100];
        }
        return this.method2308(arg0, field1934, field1935);
    }

    @ObfuscatedName("em.o(ZLem;[B)Lem;")
    public class133 method2308(boolean arg0, class133 arg1, byte[] arg2) {
        arg1.field1936 = this.field1936;
        arg1.field1940 = this.field1940;
        arg1.field1952 = this.field1952;
        if (arg1.field1937 == null || arg1.field1937.length < this.field1936) {
            arg1.field1937 = new int[this.field1936 + 100];
            arg1.field1953 = new int[this.field1936 + 100];
            arg1.field1939 = new int[this.field1936 + 100];
        }
        for (int var4 = 0; var4 < this.field1936; var4++) {
            arg1.field1937[var4] = this.field1937[var4];
            arg1.field1953[var4] = this.field1953[var4];
            arg1.field1939[var4] = this.field1939[var4];
        }
        if (arg0) {
            arg1.field1985 = this.field1985;
        } else {
            arg1.field1985 = arg2;
            if (this.field1985 == null) {
                for (int var5 = 0; var5 < this.field1940; var5++) {
                    arg1.field1985[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1940; var6++) {
                    arg1.field1985[var6] = this.field1985[var6];
                }
            }
        }
        arg1.field1941 = this.field1941;
        arg1.field1942 = this.field1942;
        arg1.field1986 = this.field1986;
        arg1.field1944 = this.field1944;
        arg1.field1945 = this.field1945;
        arg1.field2001 = this.field2001;
        arg1.field1947 = this.field1947;
        arg1.field1949 = this.field1949;
        arg1.field1950 = this.field1950;
        arg1.field1999 = this.field1999;
        arg1.field1932 = this.field1932;
        arg1.field1954 = this.field1954;
        arg1.field1955 = this.field1955;
        arg1.field1956 = this.field1956;
        arg1.field1961 = this.field1961;
        arg1.field1958 = this.field1958;
        arg1.method2383();
        return arg1;
    }

    @ObfuscatedName("em.n(I)V")
    public void method2311(int arg0) {
        if (this.field1976 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1938[arg0];
        int var9 = field1996[arg0];
        for (int var10 = 0; var10 < this.field1936; var10++) {
            int var11 = class136.method2429(this.field1937[var10], this.field1939[var10], var8, var9);
            int var12 = this.field1953[var10];
            int var13 = class136.method2430(this.field1937[var10], this.field1939[var10], var8, var9);
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
        this.field1964 = (var2 + var5) / 2;
        this.field1933 = (var3 + var6) / 2;
        this.field1966 = (var4 + var7) / 2;
        this.field1976 = (var5 - var2 + 1) / 2;
        this.field1983 = (var6 - var3 + 1) / 2;
        this.field1969 = (var7 - var4 + 1) / 2;
        if (this.field1976 < 32) {
            this.field1976 = 32;
        }
        if (this.field1969 < 32) {
            this.field1969 = 32;
        }
        if (this.field1958) {
            this.field1976 += 8;
            this.field1969 += 8;
        }
    }

    @ObfuscatedName("em.q()V")
    public void method2310() {
        if (this.field1959 == 1) {
            return;
        }
        this.field1959 = 1;
        this.field2129 = 0;
        this.field1968 = 0;
        this.field1973 = 0;
        for (int var1 = 0; var1 < this.field1936; var1++) {
            int var2 = this.field1937[var1];
            int var3 = this.field1953[var1];
            int var4 = this.field1939[var1];
            if (-var3 > this.field2129) {
                this.field2129 = -var3;
            }
            if (var3 > this.field1968) {
                this.field1968 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1973) {
                this.field1973 = var5;
            }
        }
        this.field1973 = (int) (Math.sqrt((double) this.field1973) + 0.99D);
        this.field1963 = (int) (Math.sqrt((double) (this.field2129 * this.field2129 + this.field1973 * this.field1973)) + 0.99D);
        this.field1962 = this.field1963 + (int) (Math.sqrt((double) (this.field1973 * this.field1973 + this.field1968 * this.field1968)) + 0.99D);
    }

    @ObfuscatedName("em.b()V")
    public void method2374() {
        if (this.field1959 == 2) {
            return;
        }
        this.field1959 = 2;
        this.field1973 = 0;
        for (int var1 = 0; var1 < this.field1936; var1++) {
            int var2 = this.field1937[var1];
            int var3 = this.field1953[var1];
            int var4 = this.field1939[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1973) {
                this.field1973 = var5;
            }
        }
        this.field1973 = (int) (Math.sqrt((double) this.field1973) + 0.99D);
        this.field1963 = this.field1973;
        this.field1962 = this.field1973 + this.field1973;
    }

    @ObfuscatedName("em.k()I")
    public int method2357() {
        this.method2310();
        return this.field1973;
    }

    @ObfuscatedName("em.d()V")
    public void method2383() {
        this.field1959 = 0;
        this.field1976 = -1;
    }

    @ObfuscatedName("em.l(Leg;I)V")
    public void method2314(class144 arg0, int arg1) {
        if (this.field1956 == null || arg1 == -1) {
            return;
        }
        class131 var3 = arg0.field2145[arg1];
        class138 var4 = var3.field1902;
        Statics.field1957 = 0;
        Statics.field1991 = 0;
        Statics.field1992 = 0;
        for (int var5 = 0; var5 < var3.field1908; var5++) {
            int var6 = var3.field1904[var5];
            this.method2316(var4.field2059[var6], var4.field2060[var6], var3.field1898[var5], var3.field1906[var5], var3.field1899[var5]);
        }
        this.method2383();
    }

    @ObfuscatedName("em.c(Leg;ILeg;I[I)V")
    public void method2315(class144 arg0, int arg1, class144 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2314(arg0, arg1);
            return;
        }
        class131 var6 = arg0.field2145[arg1];
        class131 var7 = arg2.field2145[arg3];
        class138 var8 = var6.field1902;
        Statics.field1957 = 0;
        Statics.field1991 = 0;
        Statics.field1992 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1908; var11++) {
            int var12 = var6.field1904[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2059[var12] == 0) {
                this.method2316(var8.field2059[var12], var8.field2060[var12], var6.field1898[var11], var6.field1906[var11], var6.field1899[var11]);
            }
        }
        Statics.field1957 = 0;
        Statics.field1991 = 0;
        Statics.field1992 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1908; var15++) {
            int var16 = var7.field1904[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2059[var16] == 0) {
                this.method2316(var8.field2059[var16], var8.field2060[var16], var7.field1898[var15], var7.field1906[var15], var7.field1899[var15]);
            }
        }
        this.method2383();
    }

    @ObfuscatedName("em.u(I[IIII)V")
    public void method2316(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1957 = 0;
            Statics.field1991 = 0;
            Statics.field1992 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1956.length) {
                    int[] var10 = this.field1956[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1957 += this.field1937[var12];
                        Statics.field1991 += this.field1953[var12];
                        Statics.field1992 += this.field1939[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1957 = Statics.field1957 / var7 + arg2;
                Statics.field1991 = Statics.field1991 / var7 + arg3;
                Statics.field1992 = Statics.field1992 / var7 + arg4;
            } else {
                Statics.field1957 = arg2;
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
                        this.field1937[var17] += arg2;
                        this.field1953[var17] += arg3;
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
                        this.field1937[var22] -= Statics.field1957;
                        this.field1953[var22] -= Statics.field1991;
                        this.field1939[var22] -= Statics.field1992;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1996[var25];
                            int var27 = field1938[var25];
                            int var28 = this.field1953[var22] * var26 + this.field1937[var22] * var27 >> 16;
                            this.field1953[var22] = this.field1953[var22] * var27 - this.field1937[var22] * var26 >> 16;
                            this.field1937[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1996[var23];
                            int var30 = field1938[var23];
                            int var31 = this.field1953[var22] * var30 - this.field1939[var22] * var29 >> 16;
                            this.field1939[var22] = this.field1953[var22] * var29 + this.field1939[var22] * var30 >> 16;
                            this.field1953[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1996[var24];
                            int var33 = field1938[var24];
                            int var34 = this.field1939[var22] * var32 + this.field1937[var22] * var33 >> 16;
                            this.field1939[var22] = this.field1939[var22] * var33 - this.field1937[var22] * var32 >> 16;
                            this.field1937[var22] = var34;
                        }
                        this.field1937[var22] += Statics.field1957;
                        this.field1953[var22] += Statics.field1991;
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
                        this.field1937[var39] -= Statics.field1957;
                        this.field1953[var39] -= Statics.field1991;
                        this.field1939[var39] -= Statics.field1992;
                        this.field1937[var39] = this.field1937[var39] * arg2 / 128;
                        this.field1953[var39] = this.field1953[var39] * arg3 / 128;
                        this.field1939[var39] = this.field1939[var39] * arg4 / 128;
                        this.field1937[var39] += Statics.field1957;
                        this.field1953[var39] += Statics.field1991;
                        this.field1939[var39] += Statics.field1992;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1961 != null && this.field1985 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1961.length) {
                    int[] var42 = this.field1961[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1985[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1985[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("em.e()V")
    public void method2304() {
        for (int var1 = 0; var1 < this.field1936; var1++) {
            int var2 = this.field1937[var1];
            this.field1937[var1] = this.field1939[var1];
            this.field1939[var1] = -var2;
        }
        this.method2383();
    }

    @ObfuscatedName("em.p()V")
    public void method2318() {
        for (int var1 = 0; var1 < this.field1936; var1++) {
            this.field1937[var1] = -this.field1937[var1];
            this.field1939[var1] = -this.field1939[var1];
        }
        this.method2383();
    }

    @ObfuscatedName("em.m()V")
    public void method2382() {
        for (int var1 = 0; var1 < this.field1936; var1++) {
            int var2 = this.field1939[var1];
            this.field1939[var1] = this.field1937[var1];
            this.field1937[var1] = -var2;
        }
        this.method2383();
    }

    @ObfuscatedName("em.x(I)V")
    public void method2320(int arg0) {
        int var2 = field1996[arg0];
        int var3 = field1938[arg0];
        for (int var4 = 0; var4 < this.field1936; var4++) {
            int var5 = this.field1953[var4] * var3 - this.field1939[var4] * var2 >> 16;
            this.field1939[var4] = this.field1953[var4] * var2 + this.field1939[var4] * var3 >> 16;
            this.field1953[var4] = var5;
        }
        this.method2383();
    }

    @ObfuscatedName("em.g(III)V")
    public void method2321(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1936; var4++) {
            this.field1937[var4] += arg0;
            this.field1953[var4] += arg1;
            this.field1939[var4] += arg2;
        }
        this.method2383();
    }

    @ObfuscatedName("em.w(III)V")
    public void method2345(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1936; var4++) {
            this.field1937[var4] = this.field1937[var4] * arg0 / 128;
            this.field1953[var4] = this.field1953[var4] * arg1 / 128;
            this.field1939[var4] = this.field1939[var4] * arg2 / 128;
        }
        this.method2383();
    }

    @ObfuscatedName("em.ar(IIIIIII)V")
    public final void method2323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1980[0] = -1;
        if (this.field1959 != 2 && this.field1959 != 1) {
            this.method2374();
        }
        int var8 = Statics.field2032;
        int var9 = Statics.field2020;
        int var10 = field1996[arg0];
        int var11 = field1938[arg0];
        int var12 = field1996[arg1];
        int var13 = field1938[arg1];
        int var14 = field1996[arg2];
        int var15 = field1938[arg2];
        int var16 = field1996[arg3];
        int var17 = field1938[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1936; var19++) {
            int var20 = this.field1937[var19];
            int var21 = this.field1953[var19];
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
            field1997[var19] = var30 - var18;
            field1984[var19] = class136.field2031 * var26 / var30 + var8;
            field1971[var19] = class136.field2031 * var29 / var30 + var9;
            if (this.field1952 > 0) {
                field1951[var19] = var26;
                field1977[var19] = var29;
                field1960[var19] = var30;
            }
        }
        try {
            this.method2351(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("em.ax(IIIIIIII)V")
    public final void method2384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1980[0] = -1;
        if (this.field1959 != 2 && this.field1959 != 1) {
            this.method2374();
        }
        int var9 = Statics.field2032;
        int var10 = Statics.field2020;
        int var11 = field1996[arg0];
        int var12 = field1938[arg0];
        int var13 = field1996[arg1];
        int var14 = field1938[arg1];
        int var15 = field1996[arg2];
        int var16 = field1938[arg2];
        int var17 = field1996[arg3];
        int var18 = field1938[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1936; var20++) {
            int var21 = this.field1937[var20];
            int var22 = this.field1953[var20];
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
            field1997[var20] = var31 - var19;
            field1984[var20] = class136.field2031 * var27 / arg7 + var9;
            field1971[var20] = class136.field2031 * var30 / arg7 + var10;
            if (this.field1952 > 0) {
                field1951[var20] = var27;
                field1977[var20] = var30;
                field1960[var20] = var31;
            }
        }
        try {
            this.method2351(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("em.cx(IIIIIIIII)V")
    public void method2349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1980[0] = -1;
        if (this.field1959 != 1) {
            this.method2310();
        }
        this.method2311(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1973 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1973) * class136.field2031;
        if (var15 / var13 >= Statics.field2046) {
            return;
        }
        int var16 = (this.field1973 + var14) * class136.field2031;
        if (var16 / var13 <= Statics.field2036) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1973 * arg1 >> 16;
        int var19 = (var17 + var18) * class136.field2031;
        if (var19 / var13 <= Statics.field2038) {
            return;
        }
        int var20 = (this.field2129 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class136.field2031;
        if (var21 / var13 >= Statics.field2028) {
            return;
        }
        int var22 = (this.field2129 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1952 > 0;
        int var26 = class134.method2171();
        int var27 = class134.method3974();
        boolean var28 = class134.method79();
        if (class8.field233 && arg8 > 0) {
            if (class134.method50(this, arg5, arg6, arg7)) {
                class8.method1403(this, arg5, arg6, arg7, -65281);
            } else if (class8.field230 == class12.field274) {
                class8.method1403(this, arg5, arg6, arg7, -16776961);
            }
        }
        if (class8.field229 && arg8 > 0) {
            int var30 = var11 - var12;
            if (var30 <= 50) {
                var30 = 50;
            }
            int var35;
            int var36;
            if (var14 > 0) {
                var35 = var15 / var13;
                var36 = var16 / var30;
            } else {
                var36 = var16 / var13;
                var35 = var15 / var30;
            }
            int var37;
            int var38;
            if (var17 > 0) {
                var37 = var21 / var13;
                var38 = var19 / var30;
            } else {
                var38 = var19 / var13;
                var37 = var21 / var30;
            }
            int var39 = -8355840;
            int var40 = var26 - Statics.field2032;
            int var41 = var27 - Statics.field2020;
            if (var40 > var35 && var40 < var36 && var41 > var37 && var41 < var38) {
                var39 = -256;
            }
            class8.method3970(Statics.field2032 + var35, Statics.field2020 + var37, Statics.field2032 + var36, Statics.field2020 + var38, var39);
        }
        boolean var42 = false;
        if (arg8 > 0 && var28) {
            boolean var43 = false;
            if (field1993) {
                var43 = class134.method50(this, arg5, arg6, arg7);
            } else {
                int var44 = var11 - var12;
                if (var44 <= 50) {
                    var44 = 50;
                }
                int var45;
                int var46;
                if (var14 > 0) {
                    var45 = var15 / var13;
                    var46 = var16 / var44;
                } else {
                    var46 = var16 / var13;
                    var45 = var15 / var44;
                }
                int var47;
                int var48;
                if (var17 > 0) {
                    var47 = var21 / var13;
                    var48 = var19 / var44;
                } else {
                    var48 = var19 / var13;
                    var47 = var21 / var44;
                }
                int var49 = var26 - Statics.field2032;
                int var50 = var27 - Statics.field2020;
                if (var49 > var45 && var49 < var46 && var50 > var47 && var50 < var48) {
                    var43 = true;
                }
            }
            if (var43) {
                if (this.field1958) {
                    class134.field2004[++class134.field2010 - 1] = arg8;
                } else {
                    var42 = true;
                }
            }
        }
        int var52 = Statics.field2032;
        int var53 = Statics.field2020;
        int var54 = 0;
        int var55 = 0;
        if (arg0 != 0) {
            var54 = field1996[arg0];
            var55 = field1938[arg0];
        }
        for (int var56 = 0; var56 < this.field1936; var56++) {
            int var57 = this.field1937[var56];
            int var58 = this.field1953[var56];
            int var59 = this.field1939[var56];
            if (arg0 != 0) {
                int var60 = var54 * var59 + var55 * var57 >> 16;
                var59 = var55 * var59 - var54 * var57 >> 16;
                var57 = var60;
            }
            int var61 = arg5 + var57;
            int var62 = arg6 + var58;
            int var63 = arg7 + var59;
            int var64 = arg3 * var63 + arg4 * var61 >> 16;
            int var65 = arg4 * var63 - arg3 * var61 >> 16;
            int var67 = arg2 * var62 - arg1 * var65 >> 16;
            int var68 = arg1 * var62 + arg2 * var65 >> 16;
            field1997[var56] = var68 - var11;
            if (var68 >= 50) {
                field1984[var56] = class136.field2031 * var64 / var68 + var52;
                field1971[var56] = class136.field2031 * var67 / var68 + var53;
            } else {
                field1984[var56] = -5000;
                var23 = true;
            }
            if (var25) {
                field1951[var56] = var64;
                field1977[var56] = var67;
                field1960[var56] = var68;
            }
        }
        try {
            this.method2351(var23, var42, this.field1958, arg8);
        } catch (Exception var71) {
        }
    }

    @ObfuscatedName("em.al(ZZZI)V")
    public final void method2351(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1962 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1962; var5++) {
            field1980[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field237 && arg1) {
            class8.method2915(this, var6);
        }
        for (int var7 = 0; var7 < this.field1940; var7++) {
            if (this.field2001[var7] != -2) {
                int var8 = this.field1941[var7];
                int var9 = this.field1942[var7];
                int var10 = this.field1986[var7];
                int var11 = field1984[var8];
                int var12 = field1984[var9];
                int var13 = field1984[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1951[var8];
                    int var15 = field1951[var9];
                    int var16 = field1951[var10];
                    int var17 = field1977[var8];
                    int var18 = field1977[var9];
                    int var19 = field1977[var10];
                    int var20 = field1960[var8];
                    int var21 = field1960[var9];
                    int var22 = field1960[var10];
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
                        int var32 = (field1997[var8] + field1997[var9] + field1997[var10]) / 3 + this.field1963;
                        field1981[var32][field1980[var32]++] = var7;
                    }
                } else {
                    if (arg1 && Statics.method753(field1971[var8], field1971[var9], field1971[var10], var11, var12, var13, var6)) {
                        class134.field2004[++class134.field2010 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1971[var10] - field1971[var9]) * (var11 - var12) - (field1971[var8] - field1971[var9]) * (var13 - var12) > 0) {
                        field1972[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field2035 && var12 <= Statics.field2035 && var13 <= Statics.field2035) {
                            field1974[var7] = false;
                        } else {
                            field1974[var7] = true;
                        }
                        int var34 = (field1997[var8] + field1997[var9] + field1997[var10]) / 3 + this.field1963;
                        field1981[var34][field1980[var34]++] = var7;
                    }
                }
            }
        }
        if (this.field1947 == null) {
            for (int var35 = this.field1962 - 1; var35 >= 0; var35--) {
                int var36 = field1980[var35];
                if (var36 > 0) {
                    int[] var37 = field1981[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method2327(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field1982[var39] = 0;
            field1990[var39] = 0;
        }
        for (int var40 = this.field1962 - 1; var40 >= 0; var40--) {
            int var41 = field1980[var40];
            if (var41 > 0) {
                int[] var42 = field1981[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field1947[var44];
                    int var46 = field1982[var45]++;
                    field1965[var45][var46] = var44;
                    if (var45 < 10) {
                        field1990[var45] += var40;
                    } else if (var45 == 10) {
                        field1948[var46] = var40;
                    } else {
                        field1946[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field1982[1] > 0 || field1982[2] > 0) {
            var47 = (field1990[1] + field1990[2]) / (field1982[1] + field1982[2]);
        }
        int var48 = 0;
        if (field1982[3] > 0 || field1982[4] > 0) {
            var48 = (field1990[3] + field1990[4]) / (field1982[3] + field1982[4]);
        }
        int var49 = 0;
        if (field1982[6] > 0 || field1982[8] > 0) {
            var49 = (field1990[6] + field1990[8]) / (field1982[6] + field1982[8]);
        }
        int var50 = 0;
        int var51 = field1982[10];
        int[] var52 = field1965[10];
        int[] var53 = field1948;
        if (var50 == var51) {
            var50 = 0;
            var51 = field1982[11];
            var52 = field1965[11];
            var53 = field1946;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method2327(var52[var50++]);
                if (var50 == var51 && field1965[11] != var52) {
                    var50 = 0;
                    var51 = field1982[11];
                    var52 = field1965[11];
                    var53 = field1946;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method2327(var52[var50++]);
                if (var50 == var51 && field1965[11] != var52) {
                    var50 = 0;
                    var51 = field1982[11];
                    var52 = field1965[11];
                    var53 = field1946;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method2327(var52[var50++]);
                if (var50 == var51 && field1965[11] != var52) {
                    var50 = 0;
                    var51 = field1982[11];
                    var52 = field1965[11];
                    var53 = field1946;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field1982[var55];
            int[] var57 = field1965[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method2327(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method2327(var52[var50++]);
            if (var50 == var51 && field1965[11] != var52) {
                var50 = 0;
                var52 = field1965[11];
                var51 = field1982[11];
                var53 = field1946;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("em.ag(I)V")
    public final void method2327(int arg0) {
        if (field1972[arg0]) {
            this.method2328(arg0);
            return;
        }
        int var2 = this.field1941[arg0];
        int var3 = this.field1942[arg0];
        int var4 = this.field1986[arg0];
        class136.field2025 = field1974[arg0];
        if (this.field1985 == null) {
            class136.field2024 = 0;
        } else {
            class136.field2024 = this.field1985[arg0] & 0xFF;
        }
        if (this.field1950 != null && this.field1950[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1949 == null || this.field1949[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1949[arg0] & 0xFF;
                var6 = this.field1932[var5];
                var7 = this.field1954[var5];
                var8 = this.field1955[var5];
            }
            if (this.field2001[arg0] == -1) {
                class136.method2424(field1971[var2], field1971[var3], field1971[var4], field1984[var2], field1984[var3], field1984[var4], this.field1944[arg0], this.field1944[arg0], this.field1944[arg0], field1951[var6], field1951[var7], field1951[var8], field1977[var6], field1977[var7], field1977[var8], field1960[var6], field1960[var7], field1960[var8], this.field1950[arg0]);
            } else {
                class136.method2424(field1971[var2], field1971[var3], field1971[var4], field1984[var2], field1984[var3], field1984[var4], this.field1944[arg0], this.field1945[arg0], this.field2001[arg0], field1951[var6], field1951[var7], field1951[var8], field1977[var6], field1977[var7], field1977[var8], field1960[var6], field1960[var7], field1960[var8], this.field1950[arg0]);
            }
        } else if (this.field2001[arg0] == -1) {
            class136.method2425(field1971[var2], field1971[var3], field1971[var4], field1984[var2], field1984[var3], field1984[var4], field1998[this.field1944[arg0]]);
        } else {
            class136.method2420(field1971[var2], field1971[var3], field1971[var4], field1984[var2], field1984[var3], field1984[var4], this.field1944[arg0], this.field1945[arg0], this.field2001[arg0]);
        }
    }

    @ObfuscatedName("em.ad(I)V")
    public final void method2328(int arg0) {
        int var2 = Statics.field2032;
        int var3 = Statics.field2020;
        int var4 = 0;
        int var5 = this.field1941[arg0];
        int var6 = this.field1942[arg0];
        int var7 = this.field1986[arg0];
        int var8 = field1960[var5];
        int var9 = field1960[var6];
        int var10 = field1960[var7];
        if (this.field1985 == null) {
            class136.field2024 = 0;
        } else {
            class136.field2024 = this.field1985[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1987[var4] = field1984[var5];
            field1988[var4] = field1971[var5];
            field1989[var4++] = this.field1944[arg0];
        } else {
            int var11 = field1951[var5];
            int var12 = field1977[var5];
            int var13 = this.field1944[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1970[var10 - var8];
                field1987[var4] = (((field1951[var7] - var11) * var14 >> 16) + var11) * class136.field2031 / 50 + var2;
                field1988[var4] = (((field1977[var7] - var12) * var14 >> 16) + var12) * class136.field2031 / 50 + var3;
                field1989[var4++] = ((this.field2001[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1970[var9 - var8];
                field1987[var4] = (((field1951[var6] - var11) * var15 >> 16) + var11) * class136.field2031 / 50 + var2;
                field1988[var4] = (((field1977[var6] - var12) * var15 >> 16) + var12) * class136.field2031 / 50 + var3;
                field1989[var4++] = ((this.field1945[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1987[var4] = field1984[var6];
            field1988[var4] = field1971[var6];
            field1989[var4++] = this.field1945[arg0];
        } else {
            int var16 = field1951[var6];
            int var17 = field1977[var6];
            int var18 = this.field1945[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1970[var8 - var9];
                field1987[var4] = (((field1951[var5] - var16) * var19 >> 16) + var16) * class136.field2031 / 50 + var2;
                field1988[var4] = (((field1977[var5] - var17) * var19 >> 16) + var17) * class136.field2031 / 50 + var3;
                field1989[var4++] = ((this.field1944[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1970[var10 - var9];
                field1987[var4] = (((field1951[var7] - var16) * var20 >> 16) + var16) * class136.field2031 / 50 + var2;
                field1988[var4] = (((field1977[var7] - var17) * var20 >> 16) + var17) * class136.field2031 / 50 + var3;
                field1989[var4++] = ((this.field2001[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1987[var4] = field1984[var7];
            field1988[var4] = field1971[var7];
            field1989[var4++] = this.field2001[arg0];
        } else {
            int var21 = field1951[var7];
            int var22 = field1977[var7];
            int var23 = this.field2001[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1970[var9 - var10];
                field1987[var4] = (((field1951[var6] - var21) * var24 >> 16) + var21) * class136.field2031 / 50 + var2;
                field1988[var4] = (((field1977[var6] - var22) * var24 >> 16) + var22) * class136.field2031 / 50 + var3;
                field1989[var4++] = ((this.field1945[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1970[var8 - var10];
                field1987[var4] = (((field1951[var5] - var21) * var25 >> 16) + var21) * class136.field2031 / 50 + var2;
                field1988[var4] = (((field1977[var5] - var22) * var25 >> 16) + var22) * class136.field2031 / 50 + var3;
                field1989[var4++] = ((this.field1944[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1987[0];
        int var27 = field1987[1];
        int var28 = field1987[2];
        int var29 = field1988[0];
        int var30 = field1988[1];
        int var31 = field1988[2];
        class136.field2025 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2035 || var27 > Statics.field2035 || var28 > Statics.field2035) {
                class136.field2025 = true;
            }
            if (this.field1950 != null && this.field1950[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1949 == null || this.field1949[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1949[arg0] & 0xFF;
                    var33 = this.field1932[var32];
                    var34 = this.field1954[var32];
                    var35 = this.field1955[var32];
                }
                if (this.field2001[arg0] == -1) {
                    class136.method2424(var29, var30, var31, var26, var27, var28, this.field1944[arg0], this.field1944[arg0], this.field1944[arg0], field1951[var33], field1951[var34], field1951[var35], field1977[var33], field1977[var34], field1977[var35], field1960[var33], field1960[var34], field1960[var35], this.field1950[arg0]);
                } else {
                    class136.method2424(var29, var30, var31, var26, var27, var28, field1989[0], field1989[1], field1989[2], field1951[var33], field1951[var34], field1951[var35], field1977[var33], field1977[var34], field1977[var35], field1960[var33], field1960[var34], field1960[var35], this.field1950[arg0]);
                }
            } else if (this.field2001[arg0] == -1) {
                class136.method2425(var29, var30, var31, var26, var27, var28, field1998[this.field1944[arg0]]);
            } else {
                class136.method2420(var29, var30, var31, var26, var27, var28, field1989[0], field1989[1], field1989[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2035 || var27 > Statics.field2035 || var28 > Statics.field2035 || field1987[3] < 0 || field1987[3] > Statics.field2035) {
            class136.field2025 = true;
        }
        if (this.field1950 != null && this.field1950[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1949 == null || this.field1949[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1949[arg0] & 0xFF;
                var37 = this.field1932[var36];
                var38 = this.field1954[var36];
                var39 = this.field1955[var36];
            }
            short var40 = this.field1950[arg0];
            if (this.field2001[arg0] == -1) {
                class136.method2424(var29, var30, var31, var26, var27, var28, this.field1944[arg0], this.field1944[arg0], this.field1944[arg0], field1951[var37], field1951[var38], field1951[var39], field1977[var37], field1977[var38], field1977[var39], field1960[var37], field1960[var38], field1960[var39], var40);
                class136.method2424(var29, var31, field1988[3], var26, var28, field1987[3], this.field1944[arg0], this.field1944[arg0], this.field1944[arg0], field1951[var37], field1951[var38], field1951[var39], field1977[var37], field1977[var38], field1977[var39], field1960[var37], field1960[var38], field1960[var39], var40);
            } else {
                class136.method2424(var29, var30, var31, var26, var27, var28, field1989[0], field1989[1], field1989[2], field1951[var37], field1951[var38], field1951[var39], field1977[var37], field1977[var38], field1977[var39], field1960[var37], field1960[var38], field1960[var39], var40);
                class136.method2424(var29, var31, field1988[3], var26, var28, field1987[3], field1989[0], field1989[2], field1989[3], field1951[var37], field1951[var38], field1951[var39], field1977[var37], field1977[var38], field1977[var39], field1960[var37], field1960[var38], field1960[var39], var40);
            }
        } else if (this.field2001[arg0] == -1) {
            int var41 = field1998[this.field1944[arg0]];
            class136.method2425(var29, var30, var31, var26, var27, var28, var41);
            class136.method2425(var29, var31, field1988[3], var26, var28, field1987[3], var41);
        } else {
            class136.method2420(var29, var30, var31, var26, var27, var28, field1989[0], field1989[1], field1989[2]);
            class136.method2420(var29, var31, field1988[3], var26, var28, field1987[3], field1989[0], field1989[2], field1989[3]);
        }
    }
}

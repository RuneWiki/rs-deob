package deob;

@ObfuscatedName("ed")
public class class134 extends class142 {

    @ObfuscatedName("ed.i")
    public static class134 field1962 = new class134();

    @ObfuscatedName("ed.c")
    public static byte[] field1939 = new byte[1];

    @ObfuscatedName("ed.e")
    public static class134 field1940 = new class134();

    @ObfuscatedName("ed.v")
    public static byte[] field1965 = new byte[1];

    @ObfuscatedName("ed.b")
    public int field1942 = 0;

    @ObfuscatedName("ed.y")
    public int[] field1943;

    @ObfuscatedName("ed.h")
    public int[] field1978;

    @ObfuscatedName("ed.x")
    public int[] field1998;

    @ObfuscatedName("ed.f")
    public int field1946 = 0;

    @ObfuscatedName("ed.n")
    public int[] field1947;

    @ObfuscatedName("ed.a")
    public int[] field1948;

    @ObfuscatedName("ed.o")
    public int[] field1949;

    @ObfuscatedName("ed.z")
    public int[] field1950;

    @ObfuscatedName("ed.q")
    public int[] field1975;

    @ObfuscatedName("ed.j")
    public int[] field1952;

    @ObfuscatedName("ed.k")
    public byte[] field1953;

    @ObfuscatedName("ed.r")
    public byte[] field2003;

    @ObfuscatedName("ed.m")
    public byte[] field1955;

    @ObfuscatedName("ed.d")
    public short[] field1956;

    @ObfuscatedName("ed.s")
    public byte field1957 = 0;

    @ObfuscatedName("ed.g")
    public int field1958 = 0;

    @ObfuscatedName("ed.w")
    public int[] field1959;

    @ObfuscatedName("ed.p")
    public int[] field1960;

    @ObfuscatedName("ed.l")
    public int[] field1964;

    @ObfuscatedName("ed.u")
    public int[][] field1945;

    @ObfuscatedName("ed.t")
    public int[][] field1963;

    @ObfuscatedName("ed.ad")
    public boolean field1988 = false;

    @ObfuscatedName("ed.ar")
    public int field2002;

    @ObfuscatedName("ed.an")
    public int field2007;

    @ObfuscatedName("ed.af")
    public int field1967;

    @ObfuscatedName("ed.at")
    public int field1968;

    @ObfuscatedName("ed.ah")
    public int field1983;

    @ObfuscatedName("ed.ai")
    public int field1970;

    @ObfuscatedName("ed.aw")
    public int field1938;

    @ObfuscatedName("ed.al")
    public int field1981;

    @ObfuscatedName("ed.ab")
    public int field1973 = -1;

    @ObfuscatedName("ed.aa")
    public int field1974 = -1;

    @ObfuscatedName("ed.ap")
    public int field1982 = -1;

    @ObfuscatedName("ed.as")
    public static boolean[] field1977 = new boolean[4700];

    @ObfuscatedName("ed.av")
    public static boolean[] field1976 = new boolean[4700];

    @ObfuscatedName("ed.ag")
    public static int[] field1979 = new int[4700];

    @ObfuscatedName("ed.az")
    public static int[] field1980 = new int[4700];

    @ObfuscatedName("ed.ac")
    public static int[] field1971 = new int[4700];

    @ObfuscatedName("ed.ax")
    public static int[] field1986 = new int[4700];

    @ObfuscatedName("ed.au")
    public static int[] field1972 = new int[4700];

    @ObfuscatedName("ed.aj")
    public static int[] field1984 = new int[4700];

    @ObfuscatedName("ed.ay")
    public static int[] field1961 = new int[1600];

    @ObfuscatedName("ed.ak")
    public static int[][] field1954 = new int[1600][512];

    @ObfuscatedName("ed.ao")
    public static int[] field1944 = new int[12];

    @ObfuscatedName("ed.am")
    public static int[][] field1989 = new int[12][2000];

    @ObfuscatedName("ed.be")
    public static int[] field1990 = new int[2000];

    @ObfuscatedName("ed.bs")
    public static int[] field1991 = new int[2000];

    @ObfuscatedName("ed.bu")
    public static int[] field1992 = new int[12];

    @ObfuscatedName("ed.bo")
    public static int[] field1987 = new int[10];

    @ObfuscatedName("ed.bj")
    public static int[] field1994 = new int[10];

    @ObfuscatedName("ed.bh")
    public static int[] field1995 = new int[10];

    @ObfuscatedName("ed.bz")
    public static boolean field1999 = true;

    @ObfuscatedName("ed.bi")
    public static int[] field1951 = class137.field2053;

    @ObfuscatedName("ed.by")
    public static int[] field1966 = class137.field2041;

    @ObfuscatedName("ed.bb")
    public static int[] field2004 = class137.field2054;

    @ObfuscatedName("ed.ba")
    public static int[] field2005 = class137.field2051;

    public class134() {
    }

    public class134(class134[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1942 = 0;
        this.field1946 = 0;
        this.field1958 = 0;
        this.field1957 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class134 var8 = arg0[var7];
            if (var8 != null) {
                this.field1942 += var8.field1942;
                this.field1946 += var8.field1946;
                this.field1958 += var8.field1958;
                if (var8.field1953 == null) {
                    if (this.field1957 == -1) {
                        this.field1957 = var8.field1957;
                    }
                    if (this.field1957 != var8.field1957) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field2003 != null;
                var5 |= var8.field1956 != null;
                var6 |= var8.field1955 != null;
            }
        }
        this.field1943 = new int[this.field1942];
        this.field1978 = new int[this.field1942];
        this.field1998 = new int[this.field1942];
        this.field1947 = new int[this.field1946];
        this.field1948 = new int[this.field1946];
        this.field1949 = new int[this.field1946];
        this.field1950 = new int[this.field1946];
        this.field1975 = new int[this.field1946];
        this.field1952 = new int[this.field1946];
        if (var3) {
            this.field1953 = new byte[this.field1946];
        }
        if (var4) {
            this.field2003 = new byte[this.field1946];
        }
        if (var5) {
            this.field1956 = new short[this.field1946];
        }
        if (var6) {
            this.field1955 = new byte[this.field1946];
        }
        if (this.field1958 > 0) {
            this.field1959 = new int[this.field1958];
            this.field1960 = new int[this.field1958];
            this.field1964 = new int[this.field1958];
        }
        this.field1942 = 0;
        this.field1946 = 0;
        this.field1958 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class134 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1946; var11++) {
                    this.field1947[this.field1946] = var10.field1947[var11] + this.field1942;
                    this.field1948[this.field1946] = var10.field1948[var11] + this.field1942;
                    this.field1949[this.field1946] = var10.field1949[var11] + this.field1942;
                    this.field1950[this.field1946] = var10.field1950[var11];
                    this.field1975[this.field1946] = var10.field1975[var11];
                    this.field1952[this.field1946] = var10.field1952[var11];
                    if (var3) {
                        if (var10.field1953 == null) {
                            this.field1953[this.field1946] = var10.field1957;
                        } else {
                            this.field1953[this.field1946] = var10.field1953[var11];
                        }
                    }
                    if (var4 && var10.field2003 != null) {
                        this.field2003[this.field1946] = var10.field2003[var11];
                    }
                    if (var5) {
                        if (var10.field1956 == null) {
                            this.field1956[this.field1946] = -1;
                        } else {
                            this.field1956[this.field1946] = var10.field1956[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1955 == null || var10.field1955[var11] == -1) {
                            this.field1955[this.field1946] = -1;
                        } else {
                            this.field1955[this.field1946] = (byte) (var10.field1955[var11] + this.field1958);
                        }
                    }
                    this.field1946++;
                }
                for (int var12 = 0; var12 < var10.field1958; var12++) {
                    this.field1959[this.field1958] = var10.field1959[var12] + this.field1942;
                    this.field1960[this.field1958] = var10.field1960[var12] + this.field1942;
                    this.field1964[this.field1958] = var10.field1964[var12] + this.field1942;
                    this.field1958++;
                }
                for (int var13 = 0; var13 < var10.field1942; var13++) {
                    this.field1943[this.field1942] = var10.field1943[var13];
                    this.field1978[this.field1942] = var10.field1978[var13];
                    this.field1998[this.field1942] = var10.field1998[var13];
                    this.field1942++;
                }
            }
        }
    }

    @ObfuscatedName("ed.i([[IIIIZI)Led;")
    public class134 method2332(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2277();
        int var7 = arg1 - this.field1967;
        int var8 = this.field1967 + arg1;
        int var9 = arg3 - this.field1967;
        int var10 = this.field1967 + arg3;
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
            var15.field1946 = this.field1946;
            var15.field1958 = this.field1958;
            var15.field1943 = this.field1943;
            var15.field1998 = this.field1998;
            var15.field1947 = this.field1947;
            var15.field1948 = this.field1948;
            var15.field1949 = this.field1949;
            var15.field1950 = this.field1950;
            var15.field1975 = this.field1975;
            var15.field1952 = this.field1952;
            var15.field1953 = this.field1953;
            var15.field2003 = this.field2003;
            var15.field1955 = this.field1955;
            var15.field1956 = this.field1956;
            var15.field1957 = this.field1957;
            var15.field1959 = this.field1959;
            var15.field1960 = this.field1960;
            var15.field1964 = this.field1964;
            var15.field1945 = this.field1945;
            var15.field1963 = this.field1963;
            var15.field1988 = this.field1988;
            var15.field1978 = new int[var15.field1942];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1942; var16++) {
                int var17 = this.field1943[var16] + arg1;
                int var18 = this.field1998[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1978[var16] = this.field1978[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1942; var26++) {
                int var27 = (-this.field1978[var26] << 16) / this.field2141;
                if (var27 < arg5) {
                    int var28 = this.field1943[var26] + arg1;
                    int var29 = this.field1998[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1978[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1978[var26];
                }
            }
        }
        var15.method2281();
        return var15;
    }

    @ObfuscatedName("ed.c(Z)Led;")
    public class134 method2322(boolean arg0) {
        if (!arg0 && field1939.length < this.field1946) {
            field1939 = new byte[this.field1946 + 100];
        }
        return this.method2275(arg0, field1962, field1939);
    }

    @ObfuscatedName("ed.v(Z)Led;")
    public class134 method2296(boolean arg0) {
        if (!arg0 && field1965.length < this.field1946) {
            field1965 = new byte[this.field1946 + 100];
        }
        return this.method2275(arg0, field1940, field1965);
    }

    @ObfuscatedName("ed.b(ZLed;[B)Led;")
    public class134 method2275(boolean arg0, class134 arg1, byte[] arg2) {
        arg1.field1942 = this.field1942;
        arg1.field1946 = this.field1946;
        arg1.field1958 = this.field1958;
        if (arg1.field1943 == null || arg1.field1943.length < this.field1942) {
            arg1.field1943 = new int[this.field1942 + 100];
            arg1.field1978 = new int[this.field1942 + 100];
            arg1.field1998 = new int[this.field1942 + 100];
        }
        for (int var4 = 0; var4 < this.field1942; var4++) {
            arg1.field1943[var4] = this.field1943[var4];
            arg1.field1978[var4] = this.field1978[var4];
            arg1.field1998[var4] = this.field1998[var4];
        }
        if (arg0) {
            arg1.field2003 = this.field2003;
        } else {
            arg1.field2003 = arg2;
            if (this.field2003 == null) {
                for (int var5 = 0; var5 < this.field1946; var5++) {
                    arg1.field2003[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1946; var6++) {
                    arg1.field2003[var6] = this.field2003[var6];
                }
            }
        }
        arg1.field1947 = this.field1947;
        arg1.field1948 = this.field1948;
        arg1.field1949 = this.field1949;
        arg1.field1950 = this.field1950;
        arg1.field1975 = this.field1975;
        arg1.field1952 = this.field1952;
        arg1.field1953 = this.field1953;
        arg1.field1955 = this.field1955;
        arg1.field1956 = this.field1956;
        arg1.field1957 = this.field1957;
        arg1.field1959 = this.field1959;
        arg1.field1960 = this.field1960;
        arg1.field1964 = this.field1964;
        arg1.field1945 = this.field1945;
        arg1.field1963 = this.field1963;
        arg1.field1988 = this.field1988;
        arg1.method2281();
        return arg1;
    }

    @ObfuscatedName("ed.y(I)V")
    public void method2276(int arg0) {
        if (this.field1973 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1966[arg0];
        int var9 = field1951[arg0];
        for (int var10 = 0; var10 < this.field1942; var10++) {
            int var11 = class137.method2389(this.field1943[var10], this.field1998[var10], var8, var9);
            int var12 = this.field1978[var10];
            int var13 = class137.method2390(this.field1943[var10], this.field1998[var10], var8, var9);
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
        this.field1938 = (var3 + var6) / 2;
        this.field1981 = (var4 + var7) / 2;
        this.field1973 = (var5 - var2 + 1) / 2;
        this.field1974 = (var6 - var3 + 1) / 2;
        this.field1982 = (var7 - var4 + 1) / 2;
        if (this.field1973 < 32) {
            this.field1973 = 32;
        }
        if (this.field1982 < 32) {
            this.field1982 = 32;
        }
        if (this.field1988) {
            this.field1973 += 16;
            this.field1982 += 16;
        }
    }

    @ObfuscatedName("ed.h()V")
    public void method2277() {
        if (this.field2002 == 1) {
            return;
        }
        this.field2002 = 1;
        this.field2141 = 0;
        this.field2007 = 0;
        this.field1967 = 0;
        for (int var1 = 0; var1 < this.field1942; var1++) {
            int var2 = this.field1943[var1];
            int var3 = this.field1978[var1];
            int var4 = this.field1998[var1];
            if (-var3 > this.field2141) {
                this.field2141 = -var3;
            }
            if (var3 > this.field2007) {
                this.field2007 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1967) {
                this.field1967 = var5;
            }
        }
        this.field1967 = (int) (Math.sqrt((double) this.field1967) + 0.99D);
        this.field1983 = (int) (Math.sqrt((double) (this.field2141 * this.field2141 + this.field1967 * this.field1967)) + 0.99D);
        this.field1968 = this.field1983 + (int) (Math.sqrt((double) (this.field2007 * this.field2007 + this.field1967 * this.field1967)) + 0.99D);
    }

    @ObfuscatedName("ed.x()V")
    public void method2278() {
        if (this.field2002 == 2) {
            return;
        }
        this.field2002 = 2;
        this.field1967 = 0;
        for (int var1 = 0; var1 < this.field1942; var1++) {
            int var2 = this.field1943[var1];
            int var3 = this.field1978[var1];
            int var4 = this.field1998[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1967) {
                this.field1967 = var5;
            }
        }
        this.field1967 = (int) (Math.sqrt((double) this.field1967) + 0.99D);
        this.field1983 = this.field1967;
        this.field1968 = this.field1967 + this.field1967;
    }

    @ObfuscatedName("ed.f()I")
    public int method2279() {
        this.method2277();
        return this.field1967;
    }

    @ObfuscatedName("ed.n()V")
    public void method2281() {
        this.field2002 = 0;
        this.field1973 = -1;
    }

    @ObfuscatedName("ed.a(Lew;I)V")
    public void method2280(class145 arg0, int arg1) {
        if (this.field1945 == null || arg1 == -1) {
            return;
        }
        class132 var3 = arg0.field2164[arg1];
        class139 var4 = var3.field1908;
        Statics.field1996 = 0;
        Statics.field1997 = 0;
        Statics.field1941 = 0;
        for (int var5 = 0; var5 < var3.field1907; var5++) {
            int var6 = var3.field1910[var5];
            this.method2282(var4.field2070[var6], var4.field2071[var6], var3.field1911[var5], var3.field1912[var5], var3.field1913[var5]);
        }
        this.method2281();
    }

    @ObfuscatedName("ed.o(Lew;ILew;I[I)V")
    public void method2274(class145 arg0, int arg1, class145 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2280(arg0, arg1);
            return;
        }
        class132 var6 = arg0.field2164[arg1];
        class132 var7 = arg2.field2164[arg3];
        class139 var8 = var6.field1908;
        Statics.field1996 = 0;
        Statics.field1997 = 0;
        Statics.field1941 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1907; var11++) {
            int var12 = var6.field1910[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2070[var12] == 0) {
                this.method2282(var8.field2070[var12], var8.field2071[var12], var6.field1911[var11], var6.field1912[var11], var6.field1913[var11]);
            }
        }
        Statics.field1996 = 0;
        Statics.field1997 = 0;
        Statics.field1941 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1907; var15++) {
            int var16 = var7.field1910[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2070[var16] == 0) {
                this.method2282(var8.field2070[var16], var8.field2071[var16], var7.field1911[var15], var7.field1912[var15], var7.field1913[var15]);
            }
        }
        this.method2281();
    }

    @ObfuscatedName("ed.z(I[IIII)V")
    public void method2282(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1996 = 0;
            Statics.field1997 = 0;
            Statics.field1941 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1945.length) {
                    int[] var10 = this.field1945[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1996 += this.field1943[var12];
                        Statics.field1997 += this.field1978[var12];
                        Statics.field1941 += this.field1998[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1996 = Statics.field1996 / var7 + arg2;
                Statics.field1997 = Statics.field1997 / var7 + arg3;
                Statics.field1941 = Statics.field1941 / var7 + arg4;
            } else {
                Statics.field1996 = arg2;
                Statics.field1997 = arg3;
                Statics.field1941 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1945.length) {
                    int[] var15 = this.field1945[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1943[var17] += arg2;
                        this.field1978[var17] += arg3;
                        this.field1998[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1945.length) {
                    int[] var20 = this.field1945[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1943[var22] -= Statics.field1996;
                        this.field1978[var22] -= Statics.field1997;
                        this.field1998[var22] -= Statics.field1941;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1951[var25];
                            int var27 = field1966[var25];
                            int var28 = this.field1978[var22] * var26 + this.field1943[var22] * var27 >> 16;
                            this.field1978[var22] = this.field1978[var22] * var27 - this.field1943[var22] * var26 >> 16;
                            this.field1943[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1951[var23];
                            int var30 = field1966[var23];
                            int var31 = this.field1978[var22] * var30 - this.field1998[var22] * var29 >> 16;
                            this.field1998[var22] = this.field1998[var22] * var30 + this.field1978[var22] * var29 >> 16;
                            this.field1978[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1951[var24];
                            int var33 = field1966[var24];
                            int var34 = this.field1998[var22] * var32 + this.field1943[var22] * var33 >> 16;
                            this.field1998[var22] = this.field1998[var22] * var33 - this.field1943[var22] * var32 >> 16;
                            this.field1943[var22] = var34;
                        }
                        this.field1943[var22] += Statics.field1996;
                        this.field1978[var22] += Statics.field1997;
                        this.field1998[var22] += Statics.field1941;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1945.length) {
                    int[] var37 = this.field1945[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1943[var39] -= Statics.field1996;
                        this.field1978[var39] -= Statics.field1997;
                        this.field1998[var39] -= Statics.field1941;
                        this.field1943[var39] = this.field1943[var39] * arg2 / 128;
                        this.field1978[var39] = this.field1978[var39] * arg3 / 128;
                        this.field1998[var39] = this.field1998[var39] * arg4 / 128;
                        this.field1943[var39] += Statics.field1996;
                        this.field1978[var39] += Statics.field1997;
                        this.field1998[var39] += Statics.field1941;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1963 != null && this.field2003 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1963.length) {
                    int[] var42 = this.field1963[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2003[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2003[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ed.j()V")
    public void method2283() {
        for (int var1 = 0; var1 < this.field1942; var1++) {
            int var2 = this.field1943[var1];
            this.field1943[var1] = this.field1998[var1];
            this.field1998[var1] = -var2;
        }
        this.method2281();
    }

    @ObfuscatedName("ed.l()V")
    public void method2286() {
        for (int var1 = 0; var1 < this.field1942; var1++) {
            this.field1943[var1] = -this.field1943[var1];
            this.field1998[var1] = -this.field1998[var1];
        }
        this.method2281();
    }

    @ObfuscatedName("ed.u()V")
    public void method2271() {
        for (int var1 = 0; var1 < this.field1942; var1++) {
            int var2 = this.field1998[var1];
            this.field1998[var1] = this.field1943[var1];
            this.field1943[var1] = -var2;
        }
        this.method2281();
    }

    @ObfuscatedName("ed.t(I)V")
    public void method2298(int arg0) {
        int var2 = field1951[arg0];
        int var3 = field1966[arg0];
        for (int var4 = 0; var4 < this.field1942; var4++) {
            int var5 = this.field1978[var4] * var3 - this.field1998[var4] * var2 >> 16;
            this.field1998[var4] = this.field1998[var4] * var3 + this.field1978[var4] * var2 >> 16;
            this.field1978[var4] = var5;
        }
        this.method2281();
    }

    @ObfuscatedName("ed.ad(III)V")
    public void method2294(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1942; var4++) {
            this.field1943[var4] += arg0;
            this.field1978[var4] += arg1;
            this.field1998[var4] += arg2;
        }
        this.method2281();
    }

    @ObfuscatedName("ed.ar(III)V")
    public void method2288(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1942; var4++) {
            this.field1943[var4] = this.field1943[var4] * arg0 / 128;
            this.field1978[var4] = this.field1978[var4] * arg1 / 128;
            this.field1998[var4] = this.field1998[var4] * arg2 / 128;
        }
        this.method2281();
    }

    @ObfuscatedName("ed.an(IIIIIII)V")
    public final void method2289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1961[0] = -1;
        if (this.field2002 != 2 && this.field2002 != 1) {
            this.method2278();
        }
        int var8 = Statics.field2033;
        int var9 = Statics.field2047;
        int var10 = field1951[arg0];
        int var11 = field1966[arg0];
        int var12 = field1951[arg1];
        int var13 = field1966[arg1];
        int var14 = field1951[arg2];
        int var15 = field1966[arg2];
        int var16 = field1951[arg3];
        int var17 = field1966[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1942; var19++) {
            int var20 = this.field1943[var19];
            int var21 = this.field1978[var19];
            int var22 = this.field1998[var19];
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
            field1971[var19] = var30 - var18;
            field1979[var19] = class137.field2039 * var26 / var30 + var8;
            field1980[var19] = class137.field2039 * var29 / var30 + var9;
            if (this.field1958 > 0) {
                field1986[var19] = var26;
                field1972[var19] = var29;
                field1984[var19] = var30;
            }
        }
        try {
            this.method2284(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ed.af(IIIIIIII)V")
    public final void method2290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1961[0] = -1;
        if (this.field2002 != 2 && this.field2002 != 1) {
            this.method2278();
        }
        int var9 = Statics.field2033;
        int var10 = Statics.field2047;
        int var11 = field1951[arg0];
        int var12 = field1966[arg0];
        int var13 = field1951[arg1];
        int var14 = field1966[arg1];
        int var15 = field1951[arg2];
        int var16 = field1966[arg2];
        int var17 = field1951[arg3];
        int var18 = field1966[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1942; var20++) {
            int var21 = this.field1943[var20];
            int var22 = this.field1978[var20];
            int var23 = this.field1998[var20];
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
            field1971[var20] = var31 - var19;
            field1979[var20] = class137.field2039 * var27 / arg7 + var9;
            field1980[var20] = class137.field2039 * var30 / arg7 + var10;
            if (this.field1958 > 0) {
                field1986[var20] = var27;
                field1972[var20] = var30;
                field1984[var20] = var31;
            }
        }
        try {
            this.method2284(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ed.ci(IIIIIIIII)V")
    public void method2291(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1961[0] = -1;
        if (this.field2002 != 1) {
            this.method2277();
        }
        this.method2276(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1967 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1967) * class137.field2039;
        if (var15 / var13 >= Statics.field2045) {
            return;
        }
        int var16 = (this.field1967 + var14) * class137.field2039;
        if (var16 / var13 <= Statics.field2044) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1967 * arg1 >> 16;
        int var19 = (var17 + var18) * class137.field2039;
        if (var19 / var13 <= Statics.field2049) {
            return;
        }
        int var20 = (this.field2141 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class137.field2039;
        if (var21 / var13 >= Statics.field2040) {
            return;
        }
        int var22 = (this.field2141 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1958 > 0;
        int var26 = class135.method3747();
        int var27 = class135.method2647();
        boolean var28 = class135.method771();
        if (class8.field237 && arg8 > 0) {
            class8.method940(this, arg5, arg6, arg7);
        }
        if (class8.field236 && arg8 > 0) {
            int var29 = var11 - var12;
            if (var29 <= 50) {
                var29 = 50;
            }
            int var34;
            int var35;
            if (var14 > 0) {
                var34 = var15 / var13;
                var35 = var16 / var29;
            } else {
                var35 = var16 / var13;
                var34 = var15 / var29;
            }
            int var36;
            int var37;
            if (var17 > 0) {
                var36 = var21 / var13;
                var37 = var19 / var29;
            } else {
                var37 = var19 / var13;
                var36 = var21 / var29;
            }
            int var38 = -8355840;
            int var39 = var26 - Statics.field2033;
            int var40 = var27 - Statics.field2047;
            if (var39 > var34 && var39 < var35 && var40 > var36 && var40 < var37) {
                var38 = -256;
            }
            class8.method857(Statics.field2033 + var34, Statics.field2047 + var36, Statics.field2033 + var35, Statics.field2047 + var37, var38);
        }
        boolean var41 = false;
        if (arg8 > 0 && var28) {
            boolean var42 = false;
            if (field1999) {
                var42 = class135.method3749(this, arg5, arg6, arg7);
            } else {
                int var43 = var11 - var12;
                if (var43 <= 50) {
                    var43 = 50;
                }
                int var44;
                int var45;
                if (var14 > 0) {
                    var44 = var15 / var13;
                    var45 = var16 / var43;
                } else {
                    var45 = var16 / var13;
                    var44 = var15 / var43;
                }
                int var46;
                int var47;
                if (var17 > 0) {
                    var46 = var21 / var13;
                    var47 = var19 / var43;
                } else {
                    var47 = var19 / var13;
                    var46 = var21 / var43;
                }
                int var48 = var26 - Statics.field2033;
                int var49 = var27 - Statics.field2047;
                if (var48 > var44 && var48 < var45 && var49 > var46 && var49 < var47) {
                    var42 = true;
                }
            }
            if (var42) {
                if (this.field1988) {
                    class135.field2015[++class135.field2014 - 1] = arg8;
                } else {
                    var41 = true;
                }
            }
        }
        int var51 = Statics.field2033;
        int var52 = Statics.field2047;
        int var53 = 0;
        int var54 = 0;
        if (arg0 != 0) {
            var53 = field1951[arg0];
            var54 = field1966[arg0];
        }
        for (int var55 = 0; var55 < this.field1942; var55++) {
            int var56 = this.field1943[var55];
            int var57 = this.field1978[var55];
            int var58 = this.field1998[var55];
            if (arg0 != 0) {
                int var59 = var53 * var58 + var54 * var56 >> 16;
                var58 = var54 * var58 - var53 * var56 >> 16;
                var56 = var59;
            }
            int var60 = arg5 + var56;
            int var61 = arg6 + var57;
            int var62 = arg7 + var58;
            int var63 = arg3 * var62 + arg4 * var60 >> 16;
            int var64 = arg4 * var62 - arg3 * var60 >> 16;
            int var66 = arg2 * var61 - arg1 * var64 >> 16;
            int var67 = arg1 * var61 + arg2 * var64 >> 16;
            field1971[var55] = var67 - var11;
            if (var67 >= 50) {
                field1979[var55] = class137.field2039 * var63 / var67 + var51;
                field1980[var55] = class137.field2039 * var66 / var67 + var52;
            } else {
                field1979[var55] = -5000;
                var23 = true;
            }
            if (var25) {
                field1986[var55] = var63;
                field1972[var55] = var66;
                field1984[var55] = var67;
            }
        }
        try {
            this.method2284(var23, var41, this.field1988, arg8);
        } catch (Exception var70) {
        }
    }

    @ObfuscatedName("ed.at(ZZZI)V")
    public final void method2284(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1968 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1968; var5++) {
            field1961[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field238 && arg1) {
            class8.method1383(this, var6);
        }
        for (int var7 = 0; var7 < this.field1946; var7++) {
            if (this.field1952[var7] != -2) {
                int var8 = this.field1947[var7];
                int var9 = this.field1948[var7];
                int var10 = this.field1949[var7];
                int var11 = field1979[var8];
                int var12 = field1979[var9];
                int var13 = field1979[var10];
                if (arg0 && var11 == -5000 || var12 == -5000 || var13 == -5000) {
                    int var14 = field1986[var8];
                    int var15 = field1986[var9];
                    int var16 = field1986[var10];
                    int var17 = field1972[var8];
                    int var18 = field1972[var9];
                    int var19 = field1972[var10];
                    int var20 = field1984[var8];
                    int var21 = field1984[var9];
                    int var22 = field1984[var10];
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
                        field1976[var7] = true;
                        int var32 = (field1971[var8] + field1971[var9] + field1971[var10]) / 3 + this.field1983;
                        field1954[var32][field1961[var32]++] = var7;
                    }
                } else {
                    if (arg1 && class135.method2656(field1980[var8], field1980[var9], field1980[var10], var11, var12, var13, var6)) {
                        class135.field2015[++class135.field2014 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1980[var10] - field1980[var9]) * (var11 - var12) - (field1980[var8] - field1980[var9]) * (var13 - var12) > 0) {
                        field1976[var7] = false;
                        if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= Statics.field2042 && var12 <= Statics.field2042 && var13 <= Statics.field2042) {
                            field1977[var7] = false;
                        } else {
                            field1977[var7] = true;
                        }
                        int var34 = (field1971[var8] + field1971[var9] + field1971[var10]) / 3 + this.field1983;
                        field1954[var34][field1961[var34]++] = var7;
                    }
                }
            }
        }
        if (this.field1953 == null) {
            for (int var35 = this.field1968 - 1; var35 >= 0; var35--) {
                int var36 = field1961[var35];
                if (var36 > 0) {
                    int[] var37 = field1954[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method2293(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field1944[var39] = 0;
            field1992[var39] = 0;
        }
        for (int var40 = this.field1968 - 1; var40 >= 0; var40--) {
            int var41 = field1961[var40];
            if (var41 > 0) {
                int[] var42 = field1954[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field1953[var44];
                    int var46 = field1944[var45]++;
                    field1989[var45][var46] = var44;
                    if (var45 < 10) {
                        field1992[var45] += var40;
                    } else if (var45 == 10) {
                        field1990[var46] = var40;
                    } else {
                        field1991[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field1944[1] > 0 || field1944[2] > 0) {
            var47 = (field1992[1] + field1992[2]) / (field1944[1] + field1944[2]);
        }
        int var48 = 0;
        if (field1944[3] > 0 || field1944[4] > 0) {
            var48 = (field1992[3] + field1992[4]) / (field1944[3] + field1944[4]);
        }
        int var49 = 0;
        if (field1944[6] > 0 || field1944[8] > 0) {
            var49 = (field1992[6] + field1992[8]) / (field1944[6] + field1944[8]);
        }
        int var50 = 0;
        int var51 = field1944[10];
        int[] var52 = field1989[10];
        int[] var53 = field1990;
        if (var50 == var51) {
            var50 = 0;
            var51 = field1944[11];
            var52 = field1989[11];
            var53 = field1991;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method2293(var52[var50++]);
                if (var50 == var51 && field1989[11] != var52) {
                    var50 = 0;
                    var51 = field1944[11];
                    var52 = field1989[11];
                    var53 = field1991;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method2293(var52[var50++]);
                if (var50 == var51 && field1989[11] != var52) {
                    var50 = 0;
                    var51 = field1944[11];
                    var52 = field1989[11];
                    var53 = field1991;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method2293(var52[var50++]);
                if (var50 == var51 && field1989[11] != var52) {
                    var50 = 0;
                    var51 = field1944[11];
                    var52 = field1989[11];
                    var53 = field1991;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field1944[var55];
            int[] var57 = field1989[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method2293(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method2293(var52[var50++]);
            if (var50 == var51 && field1989[11] != var52) {
                var50 = 0;
                var52 = field1989[11];
                var51 = field1944[11];
                var53 = field1991;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("ed.ah(I)V")
    public final void method2293(int arg0) {
        if (field1976[arg0]) {
            this.method2311(arg0);
            return;
        }
        int var2 = this.field1947[arg0];
        int var3 = this.field1948[arg0];
        int var4 = this.field1949[arg0];
        class137.field2046 = field1977[arg0];
        if (this.field2003 == null) {
            class137.field2034 = 0;
        } else {
            class137.field2034 = this.field2003[arg0] & 0xFF;
        }
        if (this.field1956 != null && this.field1956[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1955 == null || this.field1955[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1955[arg0] & 0xFF;
                var6 = this.field1959[var5];
                var7 = this.field1960[var5];
                var8 = this.field1964[var5];
            }
            if (this.field1952[arg0] == -1) {
                class137.method2384(field1980[var2], field1980[var3], field1980[var4], field1979[var2], field1979[var3], field1979[var4], this.field1950[arg0], this.field1950[arg0], this.field1950[arg0], field1986[var6], field1986[var7], field1986[var8], field1972[var6], field1972[var7], field1972[var8], field1984[var6], field1984[var7], field1984[var8], this.field1956[arg0]);
            } else {
                class137.method2384(field1980[var2], field1980[var3], field1980[var4], field1979[var2], field1979[var3], field1979[var4], this.field1950[arg0], this.field1975[arg0], this.field1952[arg0], field1986[var6], field1986[var7], field1986[var8], field1972[var6], field1972[var7], field1972[var8], field1984[var6], field1984[var7], field1984[var8], this.field1956[arg0]);
            }
        } else if (this.field1952[arg0] == -1) {
            class137.method2382(field1980[var2], field1980[var3], field1980[var4], field1979[var2], field1979[var3], field1979[var4], field2004[this.field1950[arg0]]);
        } else {
            class137.method2380(field1980[var2], field1980[var3], field1980[var4], field1979[var2], field1979[var3], field1979[var4], this.field1950[arg0], this.field1975[arg0], this.field1952[arg0]);
        }
    }

    @ObfuscatedName("ed.ai(I)V")
    public final void method2311(int arg0) {
        int var2 = Statics.field2033;
        int var3 = Statics.field2047;
        int var4 = 0;
        int var5 = this.field1947[arg0];
        int var6 = this.field1948[arg0];
        int var7 = this.field1949[arg0];
        int var8 = field1984[var5];
        int var9 = field1984[var6];
        int var10 = field1984[var7];
        if (this.field2003 == null) {
            class137.field2034 = 0;
        } else {
            class137.field2034 = this.field2003[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1987[var4] = field1979[var5];
            field1994[var4] = field1980[var5];
            field1995[var4++] = this.field1950[arg0];
        } else {
            int var11 = field1986[var5];
            int var12 = field1972[var5];
            int var13 = this.field1950[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2005[var10 - var8];
                field1987[var4] = (((field1986[var7] - var11) * var14 >> 16) + var11) * class137.field2039 / 50 + var2;
                field1994[var4] = (((field1972[var7] - var12) * var14 >> 16) + var12) * class137.field2039 / 50 + var3;
                field1995[var4++] = ((this.field1952[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2005[var9 - var8];
                field1987[var4] = (((field1986[var6] - var11) * var15 >> 16) + var11) * class137.field2039 / 50 + var2;
                field1994[var4] = (((field1972[var6] - var12) * var15 >> 16) + var12) * class137.field2039 / 50 + var3;
                field1995[var4++] = ((this.field1975[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1987[var4] = field1979[var6];
            field1994[var4] = field1980[var6];
            field1995[var4++] = this.field1975[arg0];
        } else {
            int var16 = field1986[var6];
            int var17 = field1972[var6];
            int var18 = this.field1975[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2005[var8 - var9];
                field1987[var4] = (((field1986[var5] - var16) * var19 >> 16) + var16) * class137.field2039 / 50 + var2;
                field1994[var4] = (((field1972[var5] - var17) * var19 >> 16) + var17) * class137.field2039 / 50 + var3;
                field1995[var4++] = ((this.field1950[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2005[var10 - var9];
                field1987[var4] = (((field1986[var7] - var16) * var20 >> 16) + var16) * class137.field2039 / 50 + var2;
                field1994[var4] = (((field1972[var7] - var17) * var20 >> 16) + var17) * class137.field2039 / 50 + var3;
                field1995[var4++] = ((this.field1952[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1987[var4] = field1979[var7];
            field1994[var4] = field1980[var7];
            field1995[var4++] = this.field1952[arg0];
        } else {
            int var21 = field1986[var7];
            int var22 = field1972[var7];
            int var23 = this.field1952[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2005[var9 - var10];
                field1987[var4] = (((field1986[var6] - var21) * var24 >> 16) + var21) * class137.field2039 / 50 + var2;
                field1994[var4] = (((field1972[var6] - var22) * var24 >> 16) + var22) * class137.field2039 / 50 + var3;
                field1995[var4++] = ((this.field1975[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2005[var8 - var10];
                field1987[var4] = (((field1986[var5] - var21) * var25 >> 16) + var21) * class137.field2039 / 50 + var2;
                field1994[var4] = (((field1972[var5] - var22) * var25 >> 16) + var22) * class137.field2039 / 50 + var3;
                field1995[var4++] = ((this.field1950[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1987[0];
        int var27 = field1987[1];
        int var28 = field1987[2];
        int var29 = field1994[0];
        int var30 = field1994[1];
        int var31 = field1994[2];
        class137.field2046 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2042 || var27 > Statics.field2042 || var28 > Statics.field2042) {
                class137.field2046 = true;
            }
            if (this.field1956 != null && this.field1956[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1955 == null || this.field1955[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1955[arg0] & 0xFF;
                    var33 = this.field1959[var32];
                    var34 = this.field1960[var32];
                    var35 = this.field1964[var32];
                }
                if (this.field1952[arg0] == -1) {
                    class137.method2384(var29, var30, var31, var26, var27, var28, this.field1950[arg0], this.field1950[arg0], this.field1950[arg0], field1986[var33], field1986[var34], field1986[var35], field1972[var33], field1972[var34], field1972[var35], field1984[var33], field1984[var34], field1984[var35], this.field1956[arg0]);
                } else {
                    class137.method2384(var29, var30, var31, var26, var27, var28, field1995[0], field1995[1], field1995[2], field1986[var33], field1986[var34], field1986[var35], field1972[var33], field1972[var34], field1972[var35], field1984[var33], field1984[var34], field1984[var35], this.field1956[arg0]);
                }
            } else if (this.field1952[arg0] == -1) {
                class137.method2382(var29, var30, var31, var26, var27, var28, field2004[this.field1950[arg0]]);
            } else {
                class137.method2380(var29, var30, var31, var26, var27, var28, field1995[0], field1995[1], field1995[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2042 || var27 > Statics.field2042 || var28 > Statics.field2042 || field1987[3] < 0 || field1987[3] > Statics.field2042) {
            class137.field2046 = true;
        }
        if (this.field1956 != null && this.field1956[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1955 == null || this.field1955[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1955[arg0] & 0xFF;
                var37 = this.field1959[var36];
                var38 = this.field1960[var36];
                var39 = this.field1964[var36];
            }
            short var40 = this.field1956[arg0];
            if (this.field1952[arg0] == -1) {
                class137.method2384(var29, var30, var31, var26, var27, var28, this.field1950[arg0], this.field1950[arg0], this.field1950[arg0], field1986[var37], field1986[var38], field1986[var39], field1972[var37], field1972[var38], field1972[var39], field1984[var37], field1984[var38], field1984[var39], var40);
                class137.method2384(var29, var31, field1994[3], var26, var28, field1987[3], this.field1950[arg0], this.field1950[arg0], this.field1950[arg0], field1986[var37], field1986[var38], field1986[var39], field1972[var37], field1972[var38], field1972[var39], field1984[var37], field1984[var38], field1984[var39], var40);
            } else {
                class137.method2384(var29, var30, var31, var26, var27, var28, field1995[0], field1995[1], field1995[2], field1986[var37], field1986[var38], field1986[var39], field1972[var37], field1972[var38], field1972[var39], field1984[var37], field1984[var38], field1984[var39], var40);
                class137.method2384(var29, var31, field1994[3], var26, var28, field1987[3], field1995[0], field1995[2], field1995[3], field1986[var37], field1986[var38], field1986[var39], field1972[var37], field1972[var38], field1972[var39], field1984[var37], field1984[var38], field1984[var39], var40);
            }
        } else if (this.field1952[arg0] == -1) {
            int var41 = field2004[this.field1950[arg0]];
            class137.method2382(var29, var30, var31, var26, var27, var28, var41);
            class137.method2382(var29, var31, field1994[3], var26, var28, field1987[3], var41);
        } else {
            class137.method2380(var29, var30, var31, var26, var27, var28, field1995[0], field1995[1], field1995[2]);
            class137.method2380(var29, var31, field1994[3], var26, var28, field1987[3], field1995[0], field1995[2], field1995[3]);
        }
    }
}

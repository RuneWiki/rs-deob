package deob;

@ObfuscatedName("gv")
public class class183 extends class177 {

    @ObfuscatedName("gv.f")
    public static class183 field2112 = new class183();

    @ObfuscatedName("gv.o")
    public static byte[] field2063 = new byte[1];

    @ObfuscatedName("gv.u")
    public static class183 field2064 = new class183();

    @ObfuscatedName("gv.p")
    public static byte[] field2065 = new byte[1];

    @ObfuscatedName("gv.b")
    public int field2066 = 0;

    @ObfuscatedName("gv.e")
    public int[] field2067;

    @ObfuscatedName("gv.k")
    public int[] field2068;

    @ObfuscatedName("gv.g")
    public int[] field2069;

    @ObfuscatedName("gv.h")
    public int field2071 = 0;

    @ObfuscatedName("gv.n")
    public int[] field2124;

    @ObfuscatedName("gv.l")
    public int[] field2087;

    @ObfuscatedName("gv.m")
    public int[] field2116;

    @ObfuscatedName("gv.d")
    public int[] field2074;

    @ObfuscatedName("gv.c")
    public int[] field2075;

    @ObfuscatedName("gv.j")
    public int[] field2076;

    @ObfuscatedName("gv.r")
    public byte[] field2077;

    @ObfuscatedName("gv.q")
    public byte[] field2080;

    @ObfuscatedName("gv.t")
    public byte[] field2079;

    @ObfuscatedName("gv.v")
    public short[] field2119;

    @ObfuscatedName("gv.x")
    public byte field2081 = 0;

    @ObfuscatedName("gv.z")
    public int field2082 = 0;

    @ObfuscatedName("gv.i")
    public int[] field2083;

    @ObfuscatedName("gv.a")
    public int[] field2084;

    @ObfuscatedName("gv.w")
    public int[] field2096;

    @ObfuscatedName("gv.s")
    public int[][] field2086;

    @ObfuscatedName("gv.y")
    public int[][] field2109;

    @ObfuscatedName("gv.ac")
    public boolean field2078 = false;

    @ObfuscatedName("gv.ay")
    public int field2089;

    @ObfuscatedName("gv.am")
    public int field2090;

    @ObfuscatedName("gv.ag")
    public int field2091;

    @ObfuscatedName("gv.aq")
    public int field2088;

    @ObfuscatedName("gv.at")
    public int field2093;

    @ObfuscatedName("gv.aj")
    public int field2094;

    @ObfuscatedName("gv.aw")
    public int field2095;

    @ObfuscatedName("gv.ap")
    public int field2102;

    @ObfuscatedName("gv.ax")
    public int field2097 = -1;

    @ObfuscatedName("gv.as")
    public int field2125 = -1;

    @ObfuscatedName("gv.ad")
    public int field2092 = -1;

    @ObfuscatedName("gv.ao")
    public static boolean[] field2101 = new boolean[4700];

    @ObfuscatedName("gv.ai")
    public static boolean[] field2085 = new boolean[4700];

    @ObfuscatedName("gv.av")
    public static int[] field2103 = new int[4700];

    @ObfuscatedName("gv.az")
    public static int[] field2104 = new int[4700];

    @ObfuscatedName("gv.au")
    public static int[] field2105 = new int[4700];

    @ObfuscatedName("gv.ab")
    public static int[] field2106 = new int[4700];

    @ObfuscatedName("gv.aa")
    public static int[] field2107 = new int[4700];

    @ObfuscatedName("gv.al")
    public static int[] field2062 = new int[4700];

    @ObfuscatedName("gv.ak")
    public static int[] field2110 = new int[1600];

    @ObfuscatedName("gv.an")
    public static int[][] field2111 = new int[1600][512];

    @ObfuscatedName("gv.ah")
    public static int[] field2098 = new int[12];

    @ObfuscatedName("gv.ae")
    public static int[][] field2113 = new int[12][2000];

    @ObfuscatedName("gv.bh")
    public static int[] field2114 = new int[2000];

    @ObfuscatedName("gv.br")
    public static int[] field2130 = new int[2000];

    @ObfuscatedName("gv.bn")
    public static int[] field2123 = new int[12];

    @ObfuscatedName("gv.bi")
    public static int[] field2117 = new int[10];

    @ObfuscatedName("gv.bb")
    public static int[] field2118 = new int[10];

    @ObfuscatedName("gv.bk")
    public static int[] field2073 = new int[10];

    @ObfuscatedName("gv.bo")
    public static boolean field2115 = true;

    @ObfuscatedName("gv.bw")
    public static int[] field2099 = class174.field1924;

    @ObfuscatedName("gv.by")
    public static int[] field2127 = class174.field1909;

    @ObfuscatedName("gv.bq")
    public static int[] field2128 = class174.field1899;

    @ObfuscatedName("gv.bf")
    public static int[] field2129 = class174.field1923;

    public class183() {
    }

    public class183(class183[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field2066 = 0;
        this.field2071 = 0;
        this.field2082 = 0;
        this.field2081 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class183 var8 = arg0[var7];
            if (var8 != null) {
                this.field2066 += var8.field2066;
                this.field2071 += var8.field2071;
                this.field2082 += var8.field2082;
                if (var8.field2077 == null) {
                    if (this.field2081 == -1) {
                        this.field2081 = var8.field2081;
                    }
                    if (this.field2081 != var8.field2081) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field2080 != null;
                var5 |= var8.field2119 != null;
                var6 |= var8.field2079 != null;
            }
        }
        this.field2067 = new int[this.field2066];
        this.field2068 = new int[this.field2066];
        this.field2069 = new int[this.field2066];
        this.field2124 = new int[this.field2071];
        this.field2087 = new int[this.field2071];
        this.field2116 = new int[this.field2071];
        this.field2074 = new int[this.field2071];
        this.field2075 = new int[this.field2071];
        this.field2076 = new int[this.field2071];
        if (var3) {
            this.field2077 = new byte[this.field2071];
        }
        if (var4) {
            this.field2080 = new byte[this.field2071];
        }
        if (var5) {
            this.field2119 = new short[this.field2071];
        }
        if (var6) {
            this.field2079 = new byte[this.field2071];
        }
        if (this.field2082 > 0) {
            this.field2083 = new int[this.field2082];
            this.field2084 = new int[this.field2082];
            this.field2096 = new int[this.field2082];
        }
        this.field2066 = 0;
        this.field2071 = 0;
        this.field2082 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class183 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field2071; var11++) {
                    this.field2124[this.field2071] = var10.field2124[var11] + this.field2066;
                    this.field2087[this.field2071] = var10.field2087[var11] + this.field2066;
                    this.field2116[this.field2071] = var10.field2116[var11] + this.field2066;
                    this.field2074[this.field2071] = var10.field2074[var11];
                    this.field2075[this.field2071] = var10.field2075[var11];
                    this.field2076[this.field2071] = var10.field2076[var11];
                    if (var3) {
                        if (var10.field2077 == null) {
                            this.field2077[this.field2071] = var10.field2081;
                        } else {
                            this.field2077[this.field2071] = var10.field2077[var11];
                        }
                    }
                    if (var4 && var10.field2080 != null) {
                        this.field2080[this.field2071] = var10.field2080[var11];
                    }
                    if (var5) {
                        if (var10.field2119 == null) {
                            this.field2119[this.field2071] = -1;
                        } else {
                            this.field2119[this.field2071] = var10.field2119[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field2079 == null || var10.field2079[var11] == -1) {
                            this.field2079[this.field2071] = -1;
                        } else {
                            this.field2079[this.field2071] = (byte) (var10.field2079[var11] + this.field2082);
                        }
                    }
                    this.field2071++;
                }
                for (int var12 = 0; var12 < var10.field2082; var12++) {
                    this.field2083[this.field2082] = var10.field2083[var12] + this.field2066;
                    this.field2084[this.field2082] = var10.field2084[var12] + this.field2066;
                    this.field2096[this.field2082] = var10.field2096[var12] + this.field2066;
                    this.field2082++;
                }
                for (int var13 = 0; var13 < var10.field2066; var13++) {
                    this.field2067[this.field2066] = var10.field2067[var13];
                    this.field2068[this.field2066] = var10.field2068[var13];
                    this.field2069[this.field2066] = var10.field2069[var13];
                    this.field2066++;
                }
            }
        }
    }

    @ObfuscatedName("gv.f([[IIIIZI)Lgv;")
    public class183 method3235(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method3240();
        int var7 = arg1 - this.field2091;
        int var8 = this.field2091 + arg1;
        int var9 = arg3 - this.field2091;
        int var10 = this.field2091 + arg3;
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
        class183 var15;
        if (arg4) {
            var15 = new class183();
            var15.field2066 = this.field2066;
            var15.field2071 = this.field2071;
            var15.field2082 = this.field2082;
            var15.field2067 = this.field2067;
            var15.field2069 = this.field2069;
            var15.field2124 = this.field2124;
            var15.field2087 = this.field2087;
            var15.field2116 = this.field2116;
            var15.field2074 = this.field2074;
            var15.field2075 = this.field2075;
            var15.field2076 = this.field2076;
            var15.field2077 = this.field2077;
            var15.field2080 = this.field2080;
            var15.field2079 = this.field2079;
            var15.field2119 = this.field2119;
            var15.field2081 = this.field2081;
            var15.field2083 = this.field2083;
            var15.field2084 = this.field2084;
            var15.field2096 = this.field2096;
            var15.field2086 = this.field2086;
            var15.field2109 = this.field2109;
            var15.field2078 = this.field2078;
            var15.field2068 = new int[var15.field2066];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field2066; var16++) {
                int var17 = this.field2067[var16] + arg1;
                int var18 = this.field2069[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field2068[var16] = this.field2068[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field2066; var26++) {
                int var27 = (-this.field2068[var26] << 16) / this.field1999;
                if (var27 < arg5) {
                    int var28 = this.field2067[var26] + arg1;
                    int var29 = this.field2069[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field2068[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field2068[var26];
                }
            }
        }
        var15.method3273();
        return var15;
    }

    @ObfuscatedName("gv.u(Z)Lgv;")
    public class183 method3272(boolean arg0) {
        if (!arg0 && field2063.length < this.field2071) {
            field2063 = new byte[this.field2071 + 100];
        }
        return this.method3238(arg0, field2112, field2063);
    }

    @ObfuscatedName("gv.p(Z)Lgv;")
    public class183 method3301(boolean arg0) {
        if (!arg0 && field2065.length < this.field2071) {
            field2065 = new byte[this.field2071 + 100];
        }
        return this.method3238(arg0, field2064, field2065);
    }

    @ObfuscatedName("gv.k(ZLgv;[B)Lgv;")
    public class183 method3238(boolean arg0, class183 arg1, byte[] arg2) {
        arg1.field2066 = this.field2066;
        arg1.field2071 = this.field2071;
        arg1.field2082 = this.field2082;
        if (arg1.field2067 == null || arg1.field2067.length < this.field2066) {
            arg1.field2067 = new int[this.field2066 + 100];
            arg1.field2068 = new int[this.field2066 + 100];
            arg1.field2069 = new int[this.field2066 + 100];
        }
        for (int var4 = 0; var4 < this.field2066; var4++) {
            arg1.field2067[var4] = this.field2067[var4];
            arg1.field2068[var4] = this.field2068[var4];
            arg1.field2069[var4] = this.field2069[var4];
        }
        if (arg0) {
            arg1.field2080 = this.field2080;
        } else {
            arg1.field2080 = arg2;
            if (this.field2080 == null) {
                for (int var5 = 0; var5 < this.field2071; var5++) {
                    arg1.field2080[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field2071; var6++) {
                    arg1.field2080[var6] = this.field2080[var6];
                }
            }
        }
        arg1.field2124 = this.field2124;
        arg1.field2087 = this.field2087;
        arg1.field2116 = this.field2116;
        arg1.field2074 = this.field2074;
        arg1.field2075 = this.field2075;
        arg1.field2076 = this.field2076;
        arg1.field2077 = this.field2077;
        arg1.field2079 = this.field2079;
        arg1.field2119 = this.field2119;
        arg1.field2081 = this.field2081;
        arg1.field2083 = this.field2083;
        arg1.field2084 = this.field2084;
        arg1.field2096 = this.field2096;
        arg1.field2086 = this.field2086;
        arg1.field2109 = this.field2109;
        arg1.field2078 = this.field2078;
        arg1.method3273();
        return arg1;
    }

    @ObfuscatedName("gv.g(I)V")
    public void method3239(int arg0) {
        if (this.field2097 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field2127[arg0];
        int var9 = field2099[arg0];
        for (int var10 = 0; var10 < this.field2066; var10++) {
            int var11 = class174.method2941(this.field2067[var10], this.field2069[var10], var8, var9);
            int var12 = this.field2068[var10];
            int var13 = class174.method2942(this.field2067[var10], this.field2069[var10], var8, var9);
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
        this.field2094 = (var2 + var5) / 2;
        this.field2095 = (var3 + var6) / 2;
        this.field2102 = (var4 + var7) / 2;
        this.field2097 = (var5 - var2 + 1) / 2;
        this.field2125 = (var6 - var3 + 1) / 2;
        this.field2092 = (var7 - var4 + 1) / 2;
        if (this.field2097 < 32) {
            this.field2097 = 32;
        }
        if (this.field2092 < 32) {
            this.field2092 = 32;
        }
        if (this.field2078) {
            this.field2097 += 8;
            this.field2092 += 8;
        }
    }

    @ObfuscatedName("gv.h()V")
    public void method3240() {
        if (this.field2089 == 1) {
            return;
        }
        this.field2089 = 1;
        this.field1999 = 0;
        this.field2090 = 0;
        this.field2091 = 0;
        for (int var1 = 0; var1 < this.field2066; var1++) {
            int var2 = this.field2067[var1];
            int var3 = this.field2068[var1];
            int var4 = this.field2069[var1];
            if (-var3 > this.field1999) {
                this.field1999 = -var3;
            }
            if (var3 > this.field2090) {
                this.field2090 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field2091) {
                this.field2091 = var5;
            }
        }
        this.field2091 = (int) (Math.sqrt((double) this.field2091) + 0.99D);
        this.field2093 = (int) (Math.sqrt((double) (this.field1999 * this.field1999 + this.field2091 * this.field2091)) + 0.99D);
        this.field2088 = this.field2093 + (int) (Math.sqrt((double) (this.field2091 * this.field2091 + this.field2090 * this.field2090)) + 0.99D);
    }

    @ObfuscatedName("gv.n()V")
    public void method3241() {
        if (this.field2089 == 2) {
            return;
        }
        this.field2089 = 2;
        this.field2091 = 0;
        for (int var1 = 0; var1 < this.field2066; var1++) {
            int var2 = this.field2067[var1];
            int var3 = this.field2068[var1];
            int var4 = this.field2069[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field2091) {
                this.field2091 = var5;
            }
        }
        this.field2091 = (int) (Math.sqrt((double) this.field2091) + 0.99D);
        this.field2093 = this.field2091;
        this.field2088 = this.field2091 + this.field2091;
    }

    @ObfuscatedName("gv.l()I")
    public int method3234() {
        this.method3240();
        return this.field2091;
    }

    @ObfuscatedName("gv.m()V")
    public void method3273() {
        this.field2089 = 0;
        this.field2097 = -1;
    }

    @ObfuscatedName("gv.d(Lfb;I)V")
    public void method3244(class179 arg0, int arg1) {
        if (this.field2086 == null || arg1 == -1) {
            return;
        }
        class172 var3 = arg0.field2009[arg1];
        class175 var4 = var3.field1862;
        Statics.field2120 = 0;
        Statics.field2121 = 0;
        Statics.field2122 = 0;
        for (int var5 = 0; var5 < var3.field1865; var5++) {
            int var6 = var3.field1866[var5];
            this.method3246(var4.field1926[var6], var4.field1929[var6], var3.field1867[var5], var3.field1868[var5], var3.field1860[var5]);
        }
        this.method3273();
    }

    @ObfuscatedName("gv.c(Lfb;ILfb;I[I)V")
    public void method3245(class179 arg0, int arg1, class179 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method3244(arg0, arg1);
            return;
        }
        class172 var6 = arg0.field2009[arg1];
        class172 var7 = arg2.field2009[arg3];
        class175 var8 = var6.field1862;
        Statics.field2120 = 0;
        Statics.field2121 = 0;
        Statics.field2122 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1865; var11++) {
            int var12 = var6.field1866[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1926[var12] == 0) {
                this.method3246(var8.field1926[var12], var8.field1929[var12], var6.field1867[var11], var6.field1868[var11], var6.field1860[var11]);
            }
        }
        Statics.field2120 = 0;
        Statics.field2121 = 0;
        Statics.field2122 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1865; var15++) {
            int var16 = var7.field1866[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1926[var16] == 0) {
                this.method3246(var8.field1926[var16], var8.field1929[var16], var7.field1867[var15], var7.field1868[var15], var7.field1860[var15]);
            }
        }
        this.method3273();
    }

    @ObfuscatedName("gv.j(I[IIII)V")
    public void method3246(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field2120 = 0;
            Statics.field2121 = 0;
            Statics.field2122 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field2086.length) {
                    int[] var10 = this.field2086[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field2120 += this.field2067[var12];
                        Statics.field2121 += this.field2068[var12];
                        Statics.field2122 += this.field2069[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field2120 = Statics.field2120 / var7 + arg2;
                Statics.field2121 = Statics.field2121 / var7 + arg3;
                Statics.field2122 = Statics.field2122 / var7 + arg4;
            } else {
                Statics.field2120 = arg2;
                Statics.field2121 = arg3;
                Statics.field2122 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field2086.length) {
                    int[] var15 = this.field2086[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field2067[var17] += arg2;
                        this.field2068[var17] += arg3;
                        this.field2069[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field2086.length) {
                    int[] var20 = this.field2086[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field2067[var22] -= Statics.field2120;
                        this.field2068[var22] -= Statics.field2121;
                        this.field2069[var22] -= Statics.field2122;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field2099[var25];
                            int var27 = field2127[var25];
                            int var28 = this.field2068[var22] * var26 + this.field2067[var22] * var27 >> 16;
                            this.field2068[var22] = this.field2068[var22] * var27 - this.field2067[var22] * var26 >> 16;
                            this.field2067[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field2099[var23];
                            int var30 = field2127[var23];
                            int var31 = this.field2068[var22] * var30 - this.field2069[var22] * var29 >> 16;
                            this.field2069[var22] = this.field2069[var22] * var30 + this.field2068[var22] * var29 >> 16;
                            this.field2068[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field2099[var24];
                            int var33 = field2127[var24];
                            int var34 = this.field2069[var22] * var32 + this.field2067[var22] * var33 >> 16;
                            this.field2069[var22] = this.field2069[var22] * var33 - this.field2067[var22] * var32 >> 16;
                            this.field2067[var22] = var34;
                        }
                        this.field2067[var22] += Statics.field2120;
                        this.field2068[var22] += Statics.field2121;
                        this.field2069[var22] += Statics.field2122;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field2086.length) {
                    int[] var37 = this.field2086[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field2067[var39] -= Statics.field2120;
                        this.field2068[var39] -= Statics.field2121;
                        this.field2069[var39] -= Statics.field2122;
                        this.field2067[var39] = this.field2067[var39] * arg2 / 128;
                        this.field2068[var39] = this.field2068[var39] * arg3 / 128;
                        this.field2069[var39] = this.field2069[var39] * arg4 / 128;
                        this.field2067[var39] += Statics.field2120;
                        this.field2068[var39] += Statics.field2121;
                        this.field2069[var39] += Statics.field2122;
                    }
                }
            }
        } else if (arg0 == 5 && this.field2109 != null && this.field2080 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field2109.length) {
                    int[] var42 = this.field2109[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field2080[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field2080[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("gv.r()V")
    public void method3247() {
        for (int var1 = 0; var1 < this.field2066; var1++) {
            int var2 = this.field2067[var1];
            this.field2067[var1] = this.field2069[var1];
            this.field2069[var1] = -var2;
        }
        this.method3273();
    }

    @ObfuscatedName("gv.q()V")
    public void method3248() {
        for (int var1 = 0; var1 < this.field2066; var1++) {
            this.field2067[var1] = -this.field2067[var1];
            this.field2069[var1] = -this.field2069[var1];
        }
        this.method3273();
    }

    @ObfuscatedName("gv.t()V")
    public void method3294() {
        for (int var1 = 0; var1 < this.field2066; var1++) {
            int var2 = this.field2069[var1];
            this.field2069[var1] = this.field2067[var1];
            this.field2067[var1] = -var2;
        }
        this.method3273();
    }

    @ObfuscatedName("gv.v(I)V")
    public void method3250(int arg0) {
        int var2 = field2099[arg0];
        int var3 = field2127[arg0];
        for (int var4 = 0; var4 < this.field2066; var4++) {
            int var5 = this.field2068[var4] * var3 - this.field2069[var4] * var2 >> 16;
            this.field2069[var4] = this.field2069[var4] * var3 + this.field2068[var4] * var2 >> 16;
            this.field2068[var4] = var5;
        }
        this.method3273();
    }

    @ObfuscatedName("gv.x(III)V")
    public void method3251(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2066; var4++) {
            this.field2067[var4] += arg0;
            this.field2068[var4] += arg1;
            this.field2069[var4] += arg2;
        }
        this.method3273();
    }

    @ObfuscatedName("gv.z(III)V")
    public void method3252(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2066; var4++) {
            this.field2067[var4] = this.field2067[var4] * arg0 / 128;
            this.field2068[var4] = this.field2068[var4] * arg1 / 128;
            this.field2069[var4] = this.field2069[var4] * arg2 / 128;
        }
        this.method3273();
    }

    @ObfuscatedName("gv.i(IIIIIII)V")
    public final void method3253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2110[0] = -1;
        if (this.field2089 != 2 && this.field2089 != 1) {
            this.method3241();
        }
        int var8 = Statics.field1908;
        int var9 = Statics.field1911;
        int var10 = field2099[arg0];
        int var11 = field2127[arg0];
        int var12 = field2099[arg1];
        int var13 = field2127[arg1];
        int var14 = field2099[arg2];
        int var15 = field2127[arg2];
        int var16 = field2099[arg3];
        int var17 = field2127[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field2066; var19++) {
            int var20 = this.field2067[var19];
            int var21 = this.field2068[var19];
            int var22 = this.field2069[var19];
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
            field2105[var19] = var30 - var18;
            field2103[var19] = class174.field1912 * var26 / var30 + var8;
            field2104[var19] = class174.field1912 * var29 / var30 + var9;
            if (this.field2082 > 0) {
                field2106[var19] = var26;
                field2107[var19] = var29;
                field2062[var19] = var30;
            }
        }
        try {
            this.method3289(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("gv.a(IIIIIIII)V")
    public final void method3254(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2110[0] = -1;
        if (this.field2089 != 2 && this.field2089 != 1) {
            this.method3241();
        }
        int var9 = Statics.field1908;
        int var10 = Statics.field1911;
        int var11 = field2099[arg0];
        int var12 = field2127[arg0];
        int var13 = field2099[arg1];
        int var14 = field2127[arg1];
        int var15 = field2099[arg2];
        int var16 = field2127[arg2];
        int var17 = field2099[arg3];
        int var18 = field2127[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field2066; var20++) {
            int var21 = this.field2067[var20];
            int var22 = this.field2068[var20];
            int var23 = this.field2069[var20];
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
            field2105[var20] = var31 - var19;
            field2103[var20] = class174.field1912 * var27 / arg7 + var9;
            field2104[var20] = class174.field1912 * var30 / arg7 + var10;
            if (this.field2082 > 0) {
                field2106[var20] = var27;
                field2107[var20] = var30;
                field2062[var20] = var31;
            }
        }
        try {
            this.method3289(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("gv.bu(IIIIIIIIJ)V")
    public void method3187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2110[0] = -1;
        if (this.field2089 != 1) {
            this.method3240();
        }
        this.method3239(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field2091 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field2091) * class174.field1912;
        if (var16 / var14 >= Statics.field1916) {
            return;
        }
        int var17 = (this.field2091 + var15) * class174.field1912;
        if (var17 / var14 <= Statics.field1902) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field2091 * arg1 >> 16;
        int var20 = (var18 + var19) * class174.field1912;
        if (var20 / var14 <= Statics.field1917) {
            return;
        }
        int var21 = (this.field1999 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class174.field1912;
        if (var22 / var14 >= Statics.field1918) {
            return;
        }
        int var23 = (this.field1999 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field2082 > 0;
        int var27 = class184.field2133;
        int var29 = class184.method2251();
        boolean var30 = class184.method3193();
        boolean var31 = arg8 != 0L && !class184.method84(arg8);
        boolean var33 = false;
        if (var31 && var30) {
            boolean var34 = false;
            if (field2115) {
                boolean var36;
                if (class184.method3193()) {
                    class184.method2728();
                    int var37 = this.field2094 + arg5;
                    int var38 = this.field2095 + arg6;
                    int var39 = this.field2102 + arg7;
                    int var40 = this.field2097;
                    int var41 = this.field2125;
                    int var42 = this.field2092;
                    int var43 = Statics.field1440 - var37;
                    int var44 = Statics.field2545 - var38;
                    int var45 = Statics.field1569 - var39;
                    if (Math.abs(var43) > Statics.field1019 + var40) {
                        var36 = false;
                    } else if (Math.abs(var44) > Statics.field2138 + var41) {
                        var36 = false;
                    } else if (Math.abs(var45) > Statics.field190 + var42) {
                        var36 = false;
                    } else if (Math.abs(Statics.field2137 * var45 - Statics.field2581 * var44) > Statics.field2138 * var42 + Statics.field190 * var41) {
                        var36 = false;
                    } else if (Math.abs(Statics.field2581 * var43 - Statics.field2136 * var45) > Statics.field190 * var40 + Statics.field1019 * var42) {
                        var36 = false;
                    } else if (Math.abs(Statics.field2136 * var44 - Statics.field2137 * var43) > Statics.field2138 * var40 + Statics.field1019 * var41) {
                        var36 = false;
                    } else {
                        var36 = true;
                    }
                } else {
                    var36 = false;
                }
                var34 = var36;
            } else {
                int var46 = var12 - var13;
                if (var46 <= 50) {
                    var46 = 50;
                }
                int var47;
                int var48;
                if (var15 > 0) {
                    var47 = var16 / var14;
                    var48 = var17 / var46;
                } else {
                    var48 = var17 / var14;
                    var47 = var16 / var46;
                }
                int var49;
                int var50;
                if (var18 > 0) {
                    var49 = var22 / var14;
                    var50 = var20 / var46;
                } else {
                    var50 = var20 / var14;
                    var49 = var22 / var46;
                }
                int var51 = var27 - Statics.field1908;
                int var52 = var29 - Statics.field1911;
                if (var51 > var47 && var51 < var48 && var52 > var49 && var52 < var50) {
                    var34 = true;
                }
            }
            if (var34) {
                if (this.field2078) {
                    class184.field2132[++class184.field2139 - 1] = arg8;
                } else {
                    var33 = true;
                }
            }
        }
        int var55 = Statics.field1908;
        int var56 = Statics.field1911;
        int var57 = 0;
        int var58 = 0;
        if (arg0 != 0) {
            var57 = field2099[arg0];
            var58 = field2127[arg0];
        }
        for (int var59 = 0; var59 < this.field2066; var59++) {
            int var60 = this.field2067[var59];
            int var61 = this.field2068[var59];
            int var62 = this.field2069[var59];
            if (arg0 != 0) {
                int var63 = var57 * var62 + var58 * var60 >> 16;
                var62 = var58 * var62 - var57 * var60 >> 16;
                var60 = var63;
            }
            int var64 = arg5 + var60;
            int var65 = arg6 + var61;
            int var66 = arg7 + var62;
            int var67 = arg3 * var66 + arg4 * var64 >> 16;
            int var68 = arg4 * var66 - arg3 * var64 >> 16;
            int var70 = arg2 * var65 - arg1 * var68 >> 16;
            int var71 = arg1 * var65 + arg2 * var68 >> 16;
            field2105[var59] = var71 - var12;
            if (var71 >= 50) {
                field2103[var59] = class174.field1912 * var67 / var71 + var55;
                field2104[var59] = class174.field1912 * var70 / var71 + var56;
            } else {
                field2103[var59] = -5000;
                var24 = true;
            }
            if (var26) {
                field2106[var59] = var67;
                field2107[var59] = var70;
                field2062[var59] = var71;
            }
        }
        try {
            this.method3289(var24, var33, this.field2078, arg8);
        } catch (Exception var74) {
        }
    }

    @ObfuscatedName("gv.w(ZZZJ)V")
    public final void method3289(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field2088 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field2088; var6++) {
            field2110[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field2071; var8++) {
            if (this.field2076[var8] != -2) {
                int var9 = this.field2124[var8];
                int var10 = this.field2087[var8];
                int var11 = this.field2116[var8];
                int var12 = field2103[var9];
                int var13 = field2103[var10];
                int var14 = field2103[var11];
                if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                    int var15 = field2106[var9];
                    int var16 = field2106[var10];
                    int var17 = field2106[var11];
                    int var18 = field2107[var9];
                    int var19 = field2107[var10];
                    int var20 = field2107[var11];
                    int var21 = field2062[var9];
                    int var22 = field2062[var10];
                    int var23 = field2062[var11];
                    int var24 = var15 - var16;
                    int var25 = var17 - var16;
                    int var26 = var18 - var19;
                    int var27 = var20 - var19;
                    int var28 = var21 - var22;
                    int var29 = var23 - var22;
                    int var30 = var26 * var29 - var27 * var28;
                    int var31 = var25 * var28 - var24 * var29;
                    int var32 = var24 * var27 - var25 * var26;
                    if (var22 * var32 + var16 * var30 + var19 * var31 > 0) {
                        field2085[var8] = true;
                        int var33 = (field2105[var9] + field2105[var10] + field2105[var11]) / 3 + this.field2093;
                        field2111[var33][field2110[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class184.method4140(field2104[var9], field2104[var10], field2104[var11], var12, var13, var14, var7)) {
                        class184.field2132[++class184.field2139 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field2104[var11] - field2104[var10]) * (var12 - var13) - (field2104[var9] - field2104[var10]) * (var14 - var13) > 0) {
                        field2085[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1910 && var13 <= Statics.field1910 && var14 <= Statics.field1910) {
                            field2101[var8] = false;
                        } else {
                            field2101[var8] = true;
                        }
                        int var36 = (field2105[var9] + field2105[var10] + field2105[var11]) / 3 + this.field2093;
                        field2111[var36][field2110[var36]++] = var8;
                    }
                }
            }
        }
        if (this.field2077 == null) {
            for (int var37 = this.field2088 - 1; var37 >= 0; var37--) {
                int var38 = field2110[var37];
                if (var38 > 0) {
                    int[] var39 = field2111[var37];
                    for (int var40 = 0; var40 < var38; var40++) {
                        this.method3283(var39[var40]);
                    }
                }
            }
            return;
        }
        for (int var41 = 0; var41 < 12; var41++) {
            field2098[var41] = 0;
            field2123[var41] = 0;
        }
        for (int var42 = this.field2088 - 1; var42 >= 0; var42--) {
            int var43 = field2110[var42];
            if (var43 > 0) {
                int[] var44 = field2111[var42];
                for (int var45 = 0; var45 < var43; var45++) {
                    int var46 = var44[var45];
                    byte var47 = this.field2077[var46];
                    int var48 = field2098[var47]++;
                    field2113[var47][var48] = var46;
                    if (var47 < 10) {
                        field2123[var47] += var42;
                    } else if (var47 == 10) {
                        field2114[var48] = var42;
                    } else {
                        field2130[var48] = var42;
                    }
                }
            }
        }
        int var49 = 0;
        if (field2098[1] > 0 || field2098[2] > 0) {
            var49 = (field2123[1] + field2123[2]) / (field2098[1] + field2098[2]);
        }
        int var50 = 0;
        if (field2098[3] > 0 || field2098[4] > 0) {
            var50 = (field2123[3] + field2123[4]) / (field2098[3] + field2098[4]);
        }
        int var51 = 0;
        if (field2098[6] > 0 || field2098[8] > 0) {
            var51 = (field2123[6] + field2123[8]) / (field2098[6] + field2098[8]);
        }
        int var52 = 0;
        int var53 = field2098[10];
        int[] var54 = field2113[10];
        int[] var55 = field2114;
        if (var52 == var53) {
            var52 = 0;
            var53 = field2098[11];
            var54 = field2113[11];
            var55 = field2130;
        }
        int var56;
        if (var52 < var53) {
            var56 = var55[var52];
        } else {
            var56 = -1000;
        }
        for (int var57 = 0; var57 < 10; var57++) {
            while (var57 == 0 && var56 > var49) {
                this.method3283(var54[var52++]);
                if (var52 == var53 && field2113[11] != var54) {
                    var52 = 0;
                    var53 = field2098[11];
                    var54 = field2113[11];
                    var55 = field2130;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 3 && var56 > var50) {
                this.method3283(var54[var52++]);
                if (var52 == var53 && field2113[11] != var54) {
                    var52 = 0;
                    var53 = field2098[11];
                    var54 = field2113[11];
                    var55 = field2130;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            while (var57 == 5 && var56 > var51) {
                this.method3283(var54[var52++]);
                if (var52 == var53 && field2113[11] != var54) {
                    var52 = 0;
                    var53 = field2098[11];
                    var54 = field2113[11];
                    var55 = field2130;
                }
                if (var52 < var53) {
                    var56 = var55[var52];
                } else {
                    var56 = -1000;
                }
            }
            int var58 = field2098[var57];
            int[] var59 = field2113[var57];
            for (int var60 = 0; var60 < var58; var60++) {
                this.method3283(var59[var60]);
            }
        }
        while (var56 != -1000) {
            this.method3283(var54[var52++]);
            if (var52 == var53 && field2113[11] != var54) {
                var52 = 0;
                var54 = field2113[11];
                var53 = field2098[11];
                var55 = field2130;
            }
            if (var52 < var53) {
                var56 = var55[var52];
            } else {
                var56 = -1000;
            }
        }
    }

    @ObfuscatedName("gv.s(I)V")
    public final void method3283(int arg0) {
        if (field2085[arg0]) {
            this.method3302(arg0);
            return;
        }
        int var2 = this.field2124[arg0];
        int var3 = this.field2087[arg0];
        int var4 = this.field2116[arg0];
        class174.field1900 = field2101[arg0];
        if (this.field2080 == null) {
            class174.field1903 = 0;
        } else {
            class174.field1903 = this.field2080[arg0] & 0xFF;
        }
        if (this.field2119 != null && this.field2119[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field2079 == null || this.field2079[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field2079[arg0] & 0xFF;
                var6 = this.field2083[var5];
                var7 = this.field2084[var5];
                var8 = this.field2096[var5];
            }
            if (this.field2076[arg0] == -1) {
                class174.method2936(field2104[var2], field2104[var3], field2104[var4], field2103[var2], field2103[var3], field2103[var4], this.field2074[arg0], this.field2074[arg0], this.field2074[arg0], field2106[var6], field2106[var7], field2106[var8], field2107[var6], field2107[var7], field2107[var8], field2062[var6], field2062[var7], field2062[var8], this.field2119[arg0]);
            } else {
                class174.method2936(field2104[var2], field2104[var3], field2104[var4], field2103[var2], field2103[var3], field2103[var4], this.field2074[arg0], this.field2075[arg0], this.field2076[arg0], field2106[var6], field2106[var7], field2106[var8], field2107[var6], field2107[var7], field2107[var8], field2062[var6], field2062[var7], field2062[var8], this.field2119[arg0]);
            }
        } else if (this.field2076[arg0] == -1) {
            class174.method2934(field2104[var2], field2104[var3], field2104[var4], field2103[var2], field2103[var3], field2103[var4], field2128[this.field2074[arg0]]);
        } else {
            class174.method2947(field2104[var2], field2104[var3], field2104[var4], field2103[var2], field2103[var3], field2103[var4], this.field2074[arg0], this.field2075[arg0], this.field2076[arg0]);
        }
    }

    @ObfuscatedName("gv.y(I)V")
    public final void method3302(int arg0) {
        int var2 = Statics.field1908;
        int var3 = Statics.field1911;
        int var4 = 0;
        int var5 = this.field2124[arg0];
        int var6 = this.field2087[arg0];
        int var7 = this.field2116[arg0];
        int var8 = field2062[var5];
        int var9 = field2062[var6];
        int var10 = field2062[var7];
        if (this.field2080 == null) {
            class174.field1903 = 0;
        } else {
            class174.field1903 = this.field2080[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field2117[var4] = field2103[var5];
            field2118[var4] = field2104[var5];
            field2073[var4++] = this.field2074[arg0];
        } else {
            int var11 = field2106[var5];
            int var12 = field2107[var5];
            int var13 = this.field2074[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field2129[var10 - var8];
                field2117[var4] = (((field2106[var7] - var11) * var14 >> 16) + var11) * class174.field1912 / 50 + var2;
                field2118[var4] = (((field2107[var7] - var12) * var14 >> 16) + var12) * class174.field1912 / 50 + var3;
                field2073[var4++] = ((this.field2076[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field2129[var9 - var8];
                field2117[var4] = (((field2106[var6] - var11) * var15 >> 16) + var11) * class174.field1912 / 50 + var2;
                field2118[var4] = (((field2107[var6] - var12) * var15 >> 16) + var12) * class174.field1912 / 50 + var3;
                field2073[var4++] = ((this.field2075[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field2117[var4] = field2103[var6];
            field2118[var4] = field2104[var6];
            field2073[var4++] = this.field2075[arg0];
        } else {
            int var16 = field2106[var6];
            int var17 = field2107[var6];
            int var18 = this.field2075[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field2129[var8 - var9];
                field2117[var4] = (((field2106[var5] - var16) * var19 >> 16) + var16) * class174.field1912 / 50 + var2;
                field2118[var4] = (((field2107[var5] - var17) * var19 >> 16) + var17) * class174.field1912 / 50 + var3;
                field2073[var4++] = ((this.field2074[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field2129[var10 - var9];
                field2117[var4] = (((field2106[var7] - var16) * var20 >> 16) + var16) * class174.field1912 / 50 + var2;
                field2118[var4] = (((field2107[var7] - var17) * var20 >> 16) + var17) * class174.field1912 / 50 + var3;
                field2073[var4++] = ((this.field2076[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field2117[var4] = field2103[var7];
            field2118[var4] = field2104[var7];
            field2073[var4++] = this.field2076[arg0];
        } else {
            int var21 = field2106[var7];
            int var22 = field2107[var7];
            int var23 = this.field2076[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field2129[var9 - var10];
                field2117[var4] = (((field2106[var6] - var21) * var24 >> 16) + var21) * class174.field1912 / 50 + var2;
                field2118[var4] = (((field2107[var6] - var22) * var24 >> 16) + var22) * class174.field1912 / 50 + var3;
                field2073[var4++] = ((this.field2075[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field2129[var8 - var10];
                field2117[var4] = (((field2106[var5] - var21) * var25 >> 16) + var21) * class174.field1912 / 50 + var2;
                field2118[var4] = (((field2107[var5] - var22) * var25 >> 16) + var22) * class174.field1912 / 50 + var3;
                field2073[var4++] = ((this.field2074[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field2117[0];
        int var27 = field2117[1];
        int var28 = field2117[2];
        int var29 = field2118[0];
        int var30 = field2118[1];
        int var31 = field2118[2];
        class174.field1900 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1910 || var27 > Statics.field1910 || var28 > Statics.field1910) {
                class174.field1900 = true;
            }
            if (this.field2119 != null && this.field2119[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field2079 == null || this.field2079[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field2079[arg0] & 0xFF;
                    var33 = this.field2083[var32];
                    var34 = this.field2084[var32];
                    var35 = this.field2096[var32];
                }
                if (this.field2076[arg0] == -1) {
                    class174.method2936(var29, var30, var31, var26, var27, var28, this.field2074[arg0], this.field2074[arg0], this.field2074[arg0], field2106[var33], field2106[var34], field2106[var35], field2107[var33], field2107[var34], field2107[var35], field2062[var33], field2062[var34], field2062[var35], this.field2119[arg0]);
                } else {
                    class174.method2936(var29, var30, var31, var26, var27, var28, field2073[0], field2073[1], field2073[2], field2106[var33], field2106[var34], field2106[var35], field2107[var33], field2107[var34], field2107[var35], field2062[var33], field2062[var34], field2062[var35], this.field2119[arg0]);
                }
            } else if (this.field2076[arg0] == -1) {
                class174.method2934(var29, var30, var31, var26, var27, var28, field2128[this.field2074[arg0]]);
            } else {
                class174.method2947(var29, var30, var31, var26, var27, var28, field2073[0], field2073[1], field2073[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1910 || var27 > Statics.field1910 || var28 > Statics.field1910 || field2117[3] < 0 || field2117[3] > Statics.field1910) {
            class174.field1900 = true;
        }
        if (this.field2119 != null && this.field2119[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field2079 == null || this.field2079[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field2079[arg0] & 0xFF;
                var37 = this.field2083[var36];
                var38 = this.field2084[var36];
                var39 = this.field2096[var36];
            }
            short var40 = this.field2119[arg0];
            if (this.field2076[arg0] == -1) {
                class174.method2936(var29, var30, var31, var26, var27, var28, this.field2074[arg0], this.field2074[arg0], this.field2074[arg0], field2106[var37], field2106[var38], field2106[var39], field2107[var37], field2107[var38], field2107[var39], field2062[var37], field2062[var38], field2062[var39], var40);
                class174.method2936(var29, var31, field2118[3], var26, var28, field2117[3], this.field2074[arg0], this.field2074[arg0], this.field2074[arg0], field2106[var37], field2106[var38], field2106[var39], field2107[var37], field2107[var38], field2107[var39], field2062[var37], field2062[var38], field2062[var39], var40);
            } else {
                class174.method2936(var29, var30, var31, var26, var27, var28, field2073[0], field2073[1], field2073[2], field2106[var37], field2106[var38], field2106[var39], field2107[var37], field2107[var38], field2107[var39], field2062[var37], field2062[var38], field2062[var39], var40);
                class174.method2936(var29, var31, field2118[3], var26, var28, field2117[3], field2073[0], field2073[2], field2073[3], field2106[var37], field2106[var38], field2106[var39], field2107[var37], field2107[var38], field2107[var39], field2062[var37], field2062[var38], field2062[var39], var40);
            }
        } else if (this.field2076[arg0] == -1) {
            int var41 = field2128[this.field2074[arg0]];
            class174.method2934(var29, var30, var31, var26, var27, var28, var41);
            class174.method2934(var29, var31, field2118[3], var26, var28, field2117[3], var41);
        } else {
            class174.method2947(var29, var30, var31, var26, var27, var28, field2073[0], field2073[1], field2073[2]);
            class174.method2947(var29, var31, field2118[3], var26, var28, field2117[3], field2073[0], field2073[2], field2073[3]);
        }
    }
}

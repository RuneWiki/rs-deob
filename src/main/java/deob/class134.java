package deob;

@ObfuscatedName("ew")
public class class134 extends class142 {

    @ObfuscatedName("ew.i")
    public static class134 field1915 = new class134();

    @ObfuscatedName("ew.h")
    public static byte[] field1910 = new byte[1];

    @ObfuscatedName("ew.u")
    public static class134 field1977 = new class134();

    @ObfuscatedName("ew.q")
    public static byte[] field1912 = new byte[1];

    @ObfuscatedName("ew.g")
    public int field1913 = 0;

    @ObfuscatedName("ew.v")
    public int[] field1914;

    @ObfuscatedName("ew.t")
    public int[] field1947;

    @ObfuscatedName("ew.p")
    public int[] field1952;

    @ObfuscatedName("ew.l")
    public int field1917 = 0;

    @ObfuscatedName("ew.a")
    public int[] field1918;

    @ObfuscatedName("ew.k")
    public int[] field1916;

    @ObfuscatedName("ew.r")
    public int[] field1923;

    @ObfuscatedName("ew.b")
    public int[] field1921;

    @ObfuscatedName("ew.x")
    public int[] field1922;

    @ObfuscatedName("ew.o")
    public int[] field1967;

    @ObfuscatedName("ew.j")
    public byte[] field1924;

    @ObfuscatedName("ew.m")
    public byte[] field1925;

    @ObfuscatedName("ew.d")
    public byte[] field1919;

    @ObfuscatedName("ew.e")
    public short[] field1927;

    @ObfuscatedName("ew.s")
    public byte field1928 = 0;

    @ObfuscatedName("ew.n")
    public int field1929 = 0;

    @ObfuscatedName("ew.y")
    public int[] field1941;

    @ObfuscatedName("ew.w")
    public int[] field1931;

    @ObfuscatedName("ew.f")
    public int[] field1930;

    @ObfuscatedName("ew.c")
    public int[][] field1933;

    @ObfuscatedName("ew.z")
    public int[][] field1934;

    @ObfuscatedName("ew.ay")
    public boolean field1909 = false;

    @ObfuscatedName("ew.ah")
    public int field1936;

    @ObfuscatedName("ew.az")
    public int field1937;

    @ObfuscatedName("ew.ac")
    public int field1938;

    @ObfuscatedName("ew.aq")
    public int field1939;

    @ObfuscatedName("ew.af")
    public int field1940;

    @ObfuscatedName("ew.aj")
    public int field1920;

    @ObfuscatedName("ew.ax")
    public int field1942;

    @ObfuscatedName("ew.ad")
    public int field1943;

    @ObfuscatedName("ew.av")
    public int field1964 = -1;

    @ObfuscatedName("ew.ae")
    public int field1957 = -1;

    @ObfuscatedName("ew.ar")
    public int field1946 = -1;

    @ObfuscatedName("ew.at")
    public static boolean[] field1948 = new boolean[4700];

    @ObfuscatedName("ew.ai")
    public static boolean[] field1949 = new boolean[4700];

    @ObfuscatedName("ew.ao")
    public static int[] field1950 = new int[4700];

    @ObfuscatedName("ew.am")
    public static int[] field1951 = new int[4700];

    @ObfuscatedName("ew.ap")
    public static int[] field1911 = new int[4700];

    @ObfuscatedName("ew.as")
    public static int[] field1945 = new int[4700];

    @ObfuscatedName("ew.aw")
    public static int[] field1954 = new int[4700];

    @ObfuscatedName("ew.al")
    public static int[] field1953 = new int[4700];

    @ObfuscatedName("ew.aa")
    public static int[] field1955 = new int[1600];

    @ObfuscatedName("ew.an")
    public static int[][] field1958 = new int[1600][512];

    @ObfuscatedName("ew.au")
    public static int[] field1959 = new int[12];

    @ObfuscatedName("ew.ab")
    public static int[][] field1960 = new int[12][2000];

    @ObfuscatedName("ew.bz")
    public static int[] field1961 = new int[2000];

    @ObfuscatedName("ew.bd")
    public static int[] field1962 = new int[2000];

    @ObfuscatedName("ew.bp")
    public static int[] field1963 = new int[12];

    @ObfuscatedName("ew.bf")
    public static int[] field1935 = new int[10];

    @ObfuscatedName("ew.bb")
    public static int[] field1965 = new int[10];

    @ObfuscatedName("ew.bw")
    public static int[] field1966 = new int[10];

    @ObfuscatedName("ew.bq")
    public static boolean field1970 = true;

    @ObfuscatedName("ew.bt")
    public static int[] field1974 = class137.field2021;

    @ObfuscatedName("ew.bv")
    public static int[] field1976 = class137.field2022;

    @ObfuscatedName("ew.bm")
    public static int[] field1975 = class137.field2017;

    @ObfuscatedName("ew.bo")
    public static int[] field1932 = class137.field2003;

    public class134() {
    }

    public class134(class134[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1913 = 0;
        this.field1917 = 0;
        this.field1929 = 0;
        this.field1928 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class134 var8 = arg0[var7];
            if (var8 != null) {
                this.field1913 += var8.field1913;
                this.field1917 += var8.field1917;
                this.field1929 += var8.field1929;
                if (var8.field1924 == null) {
                    if (this.field1928 == -1) {
                        this.field1928 = var8.field1928;
                    }
                    if (this.field1928 != var8.field1928) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1925 != null;
                var5 |= var8.field1927 != null;
                var6 |= var8.field1919 != null;
            }
        }
        this.field1914 = new int[this.field1913];
        this.field1947 = new int[this.field1913];
        this.field1952 = new int[this.field1913];
        this.field1918 = new int[this.field1917];
        this.field1916 = new int[this.field1917];
        this.field1923 = new int[this.field1917];
        this.field1921 = new int[this.field1917];
        this.field1922 = new int[this.field1917];
        this.field1967 = new int[this.field1917];
        if (var3) {
            this.field1924 = new byte[this.field1917];
        }
        if (var4) {
            this.field1925 = new byte[this.field1917];
        }
        if (var5) {
            this.field1927 = new short[this.field1917];
        }
        if (var6) {
            this.field1919 = new byte[this.field1917];
        }
        if (this.field1929 > 0) {
            this.field1941 = new int[this.field1929];
            this.field1931 = new int[this.field1929];
            this.field1930 = new int[this.field1929];
        }
        this.field1913 = 0;
        this.field1917 = 0;
        this.field1929 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class134 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1917; var11++) {
                    this.field1918[this.field1917] = var10.field1918[var11] + this.field1913;
                    this.field1916[this.field1917] = var10.field1916[var11] + this.field1913;
                    this.field1923[this.field1917] = var10.field1923[var11] + this.field1913;
                    this.field1921[this.field1917] = var10.field1921[var11];
                    this.field1922[this.field1917] = var10.field1922[var11];
                    this.field1967[this.field1917] = var10.field1967[var11];
                    if (var3) {
                        if (var10.field1924 == null) {
                            this.field1924[this.field1917] = var10.field1928;
                        } else {
                            this.field1924[this.field1917] = var10.field1924[var11];
                        }
                    }
                    if (var4 && var10.field1925 != null) {
                        this.field1925[this.field1917] = var10.field1925[var11];
                    }
                    if (var5) {
                        if (var10.field1927 == null) {
                            this.field1927[this.field1917] = -1;
                        } else {
                            this.field1927[this.field1917] = var10.field1927[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1919 == null || var10.field1919[var11] == -1) {
                            this.field1919[this.field1917] = -1;
                        } else {
                            this.field1919[this.field1917] = (byte) (var10.field1919[var11] + this.field1929);
                        }
                    }
                    this.field1917++;
                }
                for (int var12 = 0; var12 < var10.field1929; var12++) {
                    this.field1941[this.field1929] = var10.field1941[var12] + this.field1913;
                    this.field1931[this.field1929] = var10.field1931[var12] + this.field1913;
                    this.field1930[this.field1929] = var10.field1930[var12] + this.field1913;
                    this.field1929++;
                }
                for (int var13 = 0; var13 < var10.field1913; var13++) {
                    this.field1914[this.field1913] = var10.field1914[var13];
                    this.field1947[this.field1913] = var10.field1947[var13];
                    this.field1952[this.field1913] = var10.field1952[var13];
                    this.field1913++;
                }
            }
        }
    }

    @ObfuscatedName("ew.i([[IIIIZI)Lew;")
    public class134 method2318(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2359();
        int var7 = arg1 - this.field1938;
        int var8 = this.field1938 + arg1;
        int var9 = arg3 - this.field1938;
        int var10 = this.field1938 + arg3;
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
            var15.field1913 = this.field1913;
            var15.field1917 = this.field1917;
            var15.field1929 = this.field1929;
            var15.field1914 = this.field1914;
            var15.field1952 = this.field1952;
            var15.field1918 = this.field1918;
            var15.field1916 = this.field1916;
            var15.field1923 = this.field1923;
            var15.field1921 = this.field1921;
            var15.field1922 = this.field1922;
            var15.field1967 = this.field1967;
            var15.field1924 = this.field1924;
            var15.field1925 = this.field1925;
            var15.field1919 = this.field1919;
            var15.field1927 = this.field1927;
            var15.field1928 = this.field1928;
            var15.field1941 = this.field1941;
            var15.field1931 = this.field1931;
            var15.field1930 = this.field1930;
            var15.field1933 = this.field1933;
            var15.field1934 = this.field1934;
            var15.field1909 = this.field1909;
            var15.field1947 = new int[var15.field1913];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1913; var16++) {
                int var17 = this.field1914[var16] + arg1;
                int var18 = this.field1952[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1947[var16] = this.field1947[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1913; var26++) {
                int var27 = (-this.field1947[var26] << 16) / this.field2104;
                if (var27 < arg5) {
                    int var28 = this.field1914[var26] + arg1;
                    int var29 = this.field1952[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1947[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1947[var26];
                }
            }
        }
        var15.method2355();
        return var15;
    }

    @ObfuscatedName("ew.h(Z)Lew;")
    public class134 method2319(boolean arg0) {
        if (!arg0 && field1910.length < this.field1917) {
            field1910 = new byte[this.field1917 + 100];
        }
        return this.method2321(arg0, field1915, field1910);
    }

    @ObfuscatedName("ew.q(Z)Lew;")
    public class134 method2342(boolean arg0) {
        if (!arg0 && field1912.length < this.field1917) {
            field1912 = new byte[this.field1917 + 100];
        }
        return this.method2321(arg0, field1977, field1912);
    }

    @ObfuscatedName("ew.g(ZLew;[B)Lew;")
    public class134 method2321(boolean arg0, class134 arg1, byte[] arg2) {
        arg1.field1913 = this.field1913;
        arg1.field1917 = this.field1917;
        arg1.field1929 = this.field1929;
        if (arg1.field1914 == null || arg1.field1914.length < this.field1913) {
            arg1.field1914 = new int[this.field1913 + 100];
            arg1.field1947 = new int[this.field1913 + 100];
            arg1.field1952 = new int[this.field1913 + 100];
        }
        for (int var4 = 0; var4 < this.field1913; var4++) {
            arg1.field1914[var4] = this.field1914[var4];
            arg1.field1947[var4] = this.field1947[var4];
            arg1.field1952[var4] = this.field1952[var4];
        }
        if (arg0) {
            arg1.field1925 = this.field1925;
        } else {
            arg1.field1925 = arg2;
            if (this.field1925 == null) {
                for (int var5 = 0; var5 < this.field1917; var5++) {
                    arg1.field1925[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1917; var6++) {
                    arg1.field1925[var6] = this.field1925[var6];
                }
            }
        }
        arg1.field1918 = this.field1918;
        arg1.field1916 = this.field1916;
        arg1.field1923 = this.field1923;
        arg1.field1921 = this.field1921;
        arg1.field1922 = this.field1922;
        arg1.field1967 = this.field1967;
        arg1.field1924 = this.field1924;
        arg1.field1919 = this.field1919;
        arg1.field1927 = this.field1927;
        arg1.field1928 = this.field1928;
        arg1.field1941 = this.field1941;
        arg1.field1931 = this.field1931;
        arg1.field1930 = this.field1930;
        arg1.field1933 = this.field1933;
        arg1.field1934 = this.field1934;
        arg1.field1909 = this.field1909;
        arg1.method2355();
        return arg1;
    }

    @ObfuscatedName("ew.v(I)V")
    public void method2322(int arg0) {
        if (this.field1964 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1976[arg0];
        int var9 = field1974[arg0];
        for (int var10 = 0; var10 < this.field1913; var10++) {
            int var11 = class137.method2424(this.field1914[var10], this.field1952[var10], var8, var9);
            int var12 = this.field1947[var10];
            int var13 = class137.method2475(this.field1914[var10], this.field1952[var10], var8, var9);
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
        this.field1920 = (var2 + var5) / 2;
        this.field1942 = (var3 + var6) / 2;
        this.field1943 = (var4 + var7) / 2;
        this.field1964 = (var5 - var2 + 1) / 2;
        this.field1957 = (var6 - var3 + 1) / 2;
        this.field1946 = (var7 - var4 + 1) / 2;
    }

    @ObfuscatedName("ew.t()V")
    public void method2359() {
        if (this.field1936 == 1) {
            return;
        }
        this.field1936 = 1;
        this.field2104 = 0;
        this.field1937 = 0;
        this.field1938 = 0;
        for (int var1 = 0; var1 < this.field1913; var1++) {
            int var2 = this.field1914[var1];
            int var3 = this.field1947[var1];
            int var4 = this.field1952[var1];
            if (-var3 > this.field2104) {
                this.field2104 = -var3;
            }
            if (var3 > this.field1937) {
                this.field1937 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1938) {
                this.field1938 = var5;
            }
        }
        this.field1938 = (int) (Math.sqrt((double) this.field1938) + 0.99D);
        this.field1940 = (int) (Math.sqrt((double) (this.field2104 * this.field2104 + this.field1938 * this.field1938)) + 0.99D);
        this.field1939 = this.field1940 + (int) (Math.sqrt((double) (this.field1938 * this.field1938 + this.field1937 * this.field1937)) + 0.99D);
    }

    @ObfuscatedName("ew.p()V")
    public void method2324() {
        if (this.field1936 == 2) {
            return;
        }
        this.field1936 = 2;
        this.field1938 = 0;
        for (int var1 = 0; var1 < this.field1913; var1++) {
            int var2 = this.field1914[var1];
            int var3 = this.field1947[var1];
            int var4 = this.field1952[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1938) {
                this.field1938 = var5;
            }
        }
        this.field1938 = (int) (Math.sqrt((double) this.field1938) + 0.99D);
        this.field1940 = this.field1938;
        this.field1939 = this.field1938 + this.field1938;
    }

    @ObfuscatedName("ew.l()I")
    public int method2325() {
        this.method2359();
        return this.field1938;
    }

    @ObfuscatedName("ew.a()V")
    public void method2355() {
        this.field1936 = 0;
        this.field1964 = -1;
    }

    @ObfuscatedName("ew.k(Ler;I)V")
    public void method2327(class145 arg0, int arg1) {
        if (this.field1933 == null || arg1 == -1) {
            return;
        }
        class132 var3 = arg0.field2125[arg1];
        class139 var4 = var3.field1879;
        Statics.field1926 = 0;
        Statics.field1968 = 0;
        Statics.field1969 = 0;
        for (int var5 = 0; var5 < var3.field1880; var5++) {
            int var6 = var3.field1881[var5];
            this.method2329(var4.field2036[var6], var4.field2034[var6], var3.field1885[var5], var3.field1884[var5], var3.field1875[var5]);
        }
        this.method2355();
    }

    @ObfuscatedName("ew.b(Ler;ILer;I[I)V")
    public void method2328(class145 arg0, int arg1, class145 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2327(arg0, arg1);
            return;
        }
        class132 var6 = arg0.field2125[arg1];
        class132 var7 = arg2.field2125[arg3];
        class139 var8 = var6.field1879;
        Statics.field1926 = 0;
        Statics.field1968 = 0;
        Statics.field1969 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1880; var11++) {
            int var12 = var6.field1881[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2036[var12] == 0) {
                this.method2329(var8.field2036[var12], var8.field2034[var12], var6.field1885[var11], var6.field1884[var11], var6.field1875[var11]);
            }
        }
        Statics.field1926 = 0;
        Statics.field1968 = 0;
        Statics.field1969 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1880; var15++) {
            int var16 = var7.field1881[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2036[var16] == 0) {
                this.method2329(var8.field2036[var16], var8.field2034[var16], var7.field1885[var15], var7.field1884[var15], var7.field1875[var15]);
            }
        }
        this.method2355();
    }

    @ObfuscatedName("ew.s(I[IIII)V")
    public void method2329(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1926 = 0;
            Statics.field1968 = 0;
            Statics.field1969 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1933.length) {
                    int[] var10 = this.field1933[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1926 += this.field1914[var12];
                        Statics.field1968 += this.field1947[var12];
                        Statics.field1969 += this.field1952[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1926 = Statics.field1926 / var7 + arg2;
                Statics.field1968 = Statics.field1968 / var7 + arg3;
                Statics.field1969 = Statics.field1969 / var7 + arg4;
            } else {
                Statics.field1926 = arg2;
                Statics.field1968 = arg3;
                Statics.field1969 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1933.length) {
                    int[] var15 = this.field1933[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1914[var17] += arg2;
                        this.field1947[var17] += arg3;
                        this.field1952[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1933.length) {
                    int[] var20 = this.field1933[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1914[var22] -= Statics.field1926;
                        this.field1947[var22] -= Statics.field1968;
                        this.field1952[var22] -= Statics.field1969;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1974[var25];
                            int var27 = field1976[var25];
                            int var28 = this.field1947[var22] * var26 + this.field1914[var22] * var27 >> 16;
                            this.field1947[var22] = this.field1947[var22] * var27 - this.field1914[var22] * var26 >> 16;
                            this.field1914[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1974[var23];
                            int var30 = field1976[var23];
                            int var31 = this.field1947[var22] * var30 - this.field1952[var22] * var29 >> 16;
                            this.field1952[var22] = this.field1952[var22] * var30 + this.field1947[var22] * var29 >> 16;
                            this.field1947[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1974[var24];
                            int var33 = field1976[var24];
                            int var34 = this.field1952[var22] * var32 + this.field1914[var22] * var33 >> 16;
                            this.field1952[var22] = this.field1952[var22] * var33 - this.field1914[var22] * var32 >> 16;
                            this.field1914[var22] = var34;
                        }
                        this.field1914[var22] += Statics.field1926;
                        this.field1947[var22] += Statics.field1968;
                        this.field1952[var22] += Statics.field1969;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1933.length) {
                    int[] var37 = this.field1933[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1914[var39] -= Statics.field1926;
                        this.field1947[var39] -= Statics.field1968;
                        this.field1952[var39] -= Statics.field1969;
                        this.field1914[var39] = this.field1914[var39] * arg2 / 128;
                        this.field1947[var39] = this.field1947[var39] * arg3 / 128;
                        this.field1952[var39] = this.field1952[var39] * arg4 / 128;
                        this.field1914[var39] += Statics.field1926;
                        this.field1947[var39] += Statics.field1968;
                        this.field1952[var39] += Statics.field1969;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1934 != null && this.field1925 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1934.length) {
                    int[] var42 = this.field1934[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1925[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1925[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ew.n()V")
    public void method2330() {
        for (int var1 = 0; var1 < this.field1913; var1++) {
            int var2 = this.field1914[var1];
            this.field1914[var1] = this.field1952[var1];
            this.field1952[var1] = -var2;
        }
        this.method2355();
    }

    @ObfuscatedName("ew.y()V")
    public void method2331() {
        for (int var1 = 0; var1 < this.field1913; var1++) {
            this.field1914[var1] = -this.field1914[var1];
            this.field1952[var1] = -this.field1952[var1];
        }
        this.method2355();
    }

    @ObfuscatedName("ew.w()V")
    public void method2369() {
        for (int var1 = 0; var1 < this.field1913; var1++) {
            int var2 = this.field1952[var1];
            this.field1952[var1] = this.field1914[var1];
            this.field1914[var1] = -var2;
        }
        this.method2355();
    }

    @ObfuscatedName("ew.f(I)V")
    public void method2333(int arg0) {
        int var2 = field1974[arg0];
        int var3 = field1976[arg0];
        for (int var4 = 0; var4 < this.field1913; var4++) {
            int var5 = this.field1947[var4] * var3 - this.field1952[var4] * var2 >> 16;
            this.field1952[var4] = this.field1952[var4] * var3 + this.field1947[var4] * var2 >> 16;
            this.field1947[var4] = var5;
        }
        this.method2355();
    }

    @ObfuscatedName("ew.c(III)V")
    public void method2349(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1913; var4++) {
            this.field1914[var4] += arg0;
            this.field1947[var4] += arg1;
            this.field1952[var4] += arg2;
        }
        this.method2355();
    }

    @ObfuscatedName("ew.z(III)V")
    public void method2317(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1913; var4++) {
            this.field1914[var4] = this.field1914[var4] * arg0 / 128;
            this.field1947[var4] = this.field1947[var4] * arg1 / 128;
            this.field1952[var4] = this.field1952[var4] * arg2 / 128;
        }
        this.method2355();
    }

    @ObfuscatedName("ew.ay(IIIIIII)V")
    public final void method2336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1955[0] = -1;
        if (this.field1936 != 2 && this.field1936 != 1) {
            this.method2324();
        }
        int var8 = Statics.field2008;
        int var9 = Statics.field2009;
        int var10 = field1974[arg0];
        int var11 = field1976[arg0];
        int var12 = field1974[arg1];
        int var13 = field1976[arg1];
        int var14 = field1974[arg2];
        int var15 = field1976[arg2];
        int var16 = field1974[arg3];
        int var17 = field1976[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1913; var19++) {
            int var20 = this.field1914[var19];
            int var21 = this.field1947[var19];
            int var22 = this.field1952[var19];
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
            field1911[var19] = var30 - var18;
            field1950[var19] = class137.field1999 * var26 / var30 + var8;
            field1951[var19] = class137.field1999 * var29 / var30 + var9;
            if (this.field1929 > 0) {
                field1945[var19] = var26;
                field1954[var19] = var29;
                field1953[var19] = var30;
            }
        }
        try {
            this.method2339(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ew.ah(IIIIIIII)V")
    public final void method2337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1955[0] = -1;
        if (this.field1936 != 2 && this.field1936 != 1) {
            this.method2324();
        }
        int var9 = Statics.field2008;
        int var10 = Statics.field2009;
        int var11 = field1974[arg0];
        int var12 = field1976[arg0];
        int var13 = field1974[arg1];
        int var14 = field1976[arg1];
        int var15 = field1974[arg2];
        int var16 = field1976[arg2];
        int var17 = field1974[arg3];
        int var18 = field1976[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1913; var20++) {
            int var21 = this.field1914[var20];
            int var22 = this.field1947[var20];
            int var23 = this.field1952[var20];
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
            field1911[var20] = var31 - var19;
            field1950[var20] = class137.field1999 * var27 / arg7 + var9;
            field1951[var20] = class137.field1999 * var30 / arg7 + var10;
            if (this.field1929 > 0) {
                field1945[var20] = var27;
                field1954[var20] = var30;
                field1953[var20] = var31;
            }
        }
        try {
            this.method2339(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ew.ck(IIIIIIIII)V")
    public void method2338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1955[0] = -1;
        if (this.field1936 != 1) {
            this.method2359();
        }
        this.method2322(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1938 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1938) * class137.field1999;
        if (var15 / var13 >= Statics.field2013) {
            return;
        }
        int var16 = (this.field1938 + var14) * class137.field1999;
        if (var16 / var13 <= Statics.field2012) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1938 * arg1 >> 16;
        int var19 = (var17 + var18) * class137.field1999;
        if (var19 / var13 <= Statics.field2014) {
            return;
        }
        int var20 = (this.field2104 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class137.field1999;
        if (var21 / var13 >= Statics.field2005) {
            return;
        }
        int var22 = (this.field2104 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1929 > 0;
        int var26 = class135.method2191();
        int var27 = class135.method1012();
        boolean var28 = class135.field1981;
        if (class8.field237 && arg8 > 0) {
            if (class135.method465(this, arg5, arg6, arg7)) {
                class8.method3819(this, arg5, arg6, arg7, -65281);
            } else if (class8.field232 == class12.field264) {
                class8.method3819(this, arg5, arg6, arg7, -16776961);
            }
        }
        if (class8.field229 && arg8 > 0) {
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
            int var41 = var26 - Statics.field2008;
            int var42 = var27 - Statics.field2009;
            if (var41 > var36 && var41 < var37 && var42 > var38 && var42 < var39) {
                var40 = -256;
            }
            class8.method2686(Statics.field2008 + var36, Statics.field2009 + var38, Statics.field2008 + var37, Statics.field2009 + var39, var40);
        }
        boolean var43 = false;
        if (arg8 > 0 && var28) {
            boolean var44 = false;
            if (field1970) {
                var44 = class135.method465(this, arg5, arg6, arg7);
            } else {
                int var45 = var11 - var12;
                if (var45 <= 50) {
                    var45 = 50;
                }
                int var46;
                int var47;
                if (var14 > 0) {
                    var46 = var15 / var13;
                    var47 = var16 / var45;
                } else {
                    var47 = var16 / var13;
                    var46 = var15 / var45;
                }
                int var48;
                int var49;
                if (var17 > 0) {
                    var48 = var21 / var13;
                    var49 = var19 / var45;
                } else {
                    var49 = var19 / var13;
                    var48 = var21 / var45;
                }
                int var50 = var26 - Statics.field2008;
                int var51 = var27 - Statics.field2009;
                if (var50 > var46 && var50 < var47 && var51 > var48 && var51 < var49) {
                    var44 = true;
                }
            }
            if (var44) {
                if (this.field1909) {
                    class135.method1498(arg8);
                } else {
                    var43 = true;
                }
            }
        }
        int var52 = Statics.field2008;
        int var53 = Statics.field2009;
        int var54 = 0;
        int var55 = 0;
        if (arg0 != 0) {
            var54 = field1974[arg0];
            var55 = field1976[arg0];
        }
        for (int var56 = 0; var56 < this.field1913; var56++) {
            int var57 = this.field1914[var56];
            int var58 = this.field1947[var56];
            int var59 = this.field1952[var56];
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
            field1911[var56] = var68 - var11;
            if (var68 >= 50) {
                field1950[var56] = class137.field1999 * var64 / var68 + var52;
                field1951[var56] = class137.field1999 * var67 / var68 + var53;
            } else {
                field1950[var56] = -5000;
                var23 = true;
            }
            if (var25) {
                field1945[var56] = var64;
                field1954[var56] = var67;
                field1953[var56] = var68;
            }
        }
        try {
            this.method2339(var23, var43, this.field1909, arg8);
        } catch (Exception var71) {
        }
    }

    @ObfuscatedName("ew.az(ZZZI)V")
    public final void method2339(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1939 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1939; var5++) {
            field1955[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field231 && arg1) {
            class134 var7 = this;
            for (int var8 = 0; var8 < var7.field1917; var8++) {
                if (var7.field1967[var8] != -2) {
                    int var9 = var7.field1918[var8];
                    int var10 = var7.field1916[var8];
                    int var11 = var7.field1923[var8];
                    int var12 = field1950[var9];
                    int var13 = field1950[var10];
                    int var14 = field1950[var11];
                    int var15 = field1951[var9];
                    int var16 = field1951[var10];
                    int var17 = field1951[var11];
                    int var18 = Math.min(var12, Math.min(var13, var14)) - var6;
                    int var19 = Math.max(var12, Math.max(var13, var14)) + var6;
                    int var20 = Math.min(var15, Math.min(var16, var17)) - var6;
                    int var21 = Math.max(var15, Math.max(var16, var17)) + var6;
                    class8.method2686(var18, var20, var19, var21, -49088);
                }
            }
        }
        for (int var22 = 0; var22 < this.field1917; var22++) {
            if (this.field1967[var22] != -2) {
                int var23 = this.field1918[var22];
                int var24 = this.field1916[var22];
                int var25 = this.field1923[var22];
                int var26 = field1950[var23];
                int var27 = field1950[var24];
                int var28 = field1950[var25];
                if (arg0 && var26 == -5000 || var27 == -5000 || var28 == -5000) {
                    int var29 = field1945[var23];
                    int var30 = field1945[var24];
                    int var31 = field1945[var25];
                    int var32 = field1954[var23];
                    int var33 = field1954[var24];
                    int var34 = field1954[var25];
                    int var35 = field1953[var23];
                    int var36 = field1953[var24];
                    int var37 = field1953[var25];
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
                        field1949[var22] = true;
                        int var47 = (field1911[var23] + field1911[var24] + field1911[var25]) / 3 + this.field1940;
                        field1958[var47][field1955[var47]++] = var22;
                    }
                } else {
                    if (arg1) {
                        int var48 = field1951[var23];
                        int var49 = field1951[var24];
                        int var50 = field1951[var25];
                        int var51 = class135.field1989 + var6;
                        boolean var52;
                        if (var51 < var48 && var51 < var49 && var51 < var50) {
                            var52 = false;
                        } else {
                            int var53 = class135.field1989 - var6;
                            if (var53 > var48 && var53 > var49 && var53 > var50) {
                                var52 = false;
                            } else {
                                int var54 = class135.field1980 + var6;
                                if (var54 < var26 && var54 < var27 && var54 < var28) {
                                    var52 = false;
                                } else {
                                    int var55 = class135.field1980 - var6;
                                    if (var55 > var26 && var55 > var27 && var55 > var28) {
                                        var52 = false;
                                    } else {
                                        var52 = true;
                                    }
                                }
                            }
                        }
                        if (var52) {
                            class135.method1498(arg3);
                            arg1 = false;
                        }
                    }
                    if ((field1951[var25] - field1951[var24]) * (var26 - var27) - (field1951[var23] - field1951[var24]) * (var28 - var27) > 0) {
                        field1949[var22] = false;
                        if (var26 >= 0 && var27 >= 0 && var28 >= 0 && var26 <= Statics.field2010 && var27 <= Statics.field2010 && var28 <= Statics.field2010) {
                            field1948[var22] = false;
                        } else {
                            field1948[var22] = true;
                        }
                        int var56 = (field1911[var23] + field1911[var24] + field1911[var25]) / 3 + this.field1940;
                        field1958[var56][field1955[var56]++] = var22;
                    }
                }
            }
        }
        if (this.field1924 == null) {
            for (int var57 = this.field1939 - 1; var57 >= 0; var57--) {
                int var58 = field1955[var57];
                if (var58 > 0) {
                    int[] var59 = field1958[var57];
                    for (int var60 = 0; var60 < var58; var60++) {
                        this.method2383(var59[var60]);
                    }
                }
            }
            return;
        }
        for (int var61 = 0; var61 < 12; var61++) {
            field1959[var61] = 0;
            field1963[var61] = 0;
        }
        for (int var62 = this.field1939 - 1; var62 >= 0; var62--) {
            int var63 = field1955[var62];
            if (var63 > 0) {
                int[] var64 = field1958[var62];
                for (int var65 = 0; var65 < var63; var65++) {
                    int var66 = var64[var65];
                    byte var67 = this.field1924[var66];
                    int var68 = field1959[var67]++;
                    field1960[var67][var68] = var66;
                    if (var67 < 10) {
                        field1963[var67] += var62;
                    } else if (var67 == 10) {
                        field1961[var68] = var62;
                    } else {
                        field1962[var68] = var62;
                    }
                }
            }
        }
        int var69 = 0;
        if (field1959[1] > 0 || field1959[2] > 0) {
            var69 = (field1963[1] + field1963[2]) / (field1959[1] + field1959[2]);
        }
        int var70 = 0;
        if (field1959[3] > 0 || field1959[4] > 0) {
            var70 = (field1963[3] + field1963[4]) / (field1959[3] + field1959[4]);
        }
        int var71 = 0;
        if (field1959[6] > 0 || field1959[8] > 0) {
            var71 = (field1963[6] + field1963[8]) / (field1959[6] + field1959[8]);
        }
        int var72 = 0;
        int var73 = field1959[10];
        int[] var74 = field1960[10];
        int[] var75 = field1961;
        if (var72 == var73) {
            var72 = 0;
            var73 = field1959[11];
            var74 = field1960[11];
            var75 = field1962;
        }
        int var76;
        if (var72 < var73) {
            var76 = var75[var72];
        } else {
            var76 = -1000;
        }
        for (int var77 = 0; var77 < 10; var77++) {
            while (var77 == 0 && var76 > var69) {
                this.method2383(var74[var72++]);
                if (var72 == var73 && field1960[11] != var74) {
                    var72 = 0;
                    var73 = field1959[11];
                    var74 = field1960[11];
                    var75 = field1962;
                }
                if (var72 < var73) {
                    var76 = var75[var72];
                } else {
                    var76 = -1000;
                }
            }
            while (var77 == 3 && var76 > var70) {
                this.method2383(var74[var72++]);
                if (var72 == var73 && field1960[11] != var74) {
                    var72 = 0;
                    var73 = field1959[11];
                    var74 = field1960[11];
                    var75 = field1962;
                }
                if (var72 < var73) {
                    var76 = var75[var72];
                } else {
                    var76 = -1000;
                }
            }
            while (var77 == 5 && var76 > var71) {
                this.method2383(var74[var72++]);
                if (var72 == var73 && field1960[11] != var74) {
                    var72 = 0;
                    var73 = field1959[11];
                    var74 = field1960[11];
                    var75 = field1962;
                }
                if (var72 < var73) {
                    var76 = var75[var72];
                } else {
                    var76 = -1000;
                }
            }
            int var78 = field1959[var77];
            int[] var79 = field1960[var77];
            for (int var80 = 0; var80 < var78; var80++) {
                this.method2383(var79[var80]);
            }
        }
        while (var76 != -1000) {
            this.method2383(var74[var72++]);
            if (var72 == var73 && field1960[11] != var74) {
                var72 = 0;
                var74 = field1960[11];
                var73 = field1959[11];
                var75 = field1962;
            }
            if (var72 < var73) {
                var76 = var75[var72];
            } else {
                var76 = -1000;
            }
        }
    }

    @ObfuscatedName("ew.ac(I)V")
    public final void method2383(int arg0) {
        if (field1949[arg0]) {
            this.method2348(arg0);
            return;
        }
        int var2 = this.field1918[arg0];
        int var3 = this.field1916[arg0];
        int var4 = this.field1923[arg0];
        class137.field2015 = field1948[arg0];
        if (this.field1925 == null) {
            class137.field2002 = 0;
        } else {
            class137.field2002 = this.field1925[arg0] & 0xFF;
        }
        if (this.field1927 != null && this.field1927[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1919 == null || this.field1919[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1919[arg0] & 0xFF;
                var6 = this.field1941[var5];
                var7 = this.field1931[var5];
                var8 = this.field1930[var5];
            }
            if (this.field1967[arg0] == -1) {
                class137.method2419(field1951[var2], field1951[var3], field1951[var4], field1950[var2], field1950[var3], field1950[var4], this.field1921[arg0], this.field1921[arg0], this.field1921[arg0], field1945[var6], field1945[var7], field1945[var8], field1954[var6], field1954[var7], field1954[var8], field1953[var6], field1953[var7], field1953[var8], this.field1927[arg0]);
            } else {
                class137.method2419(field1951[var2], field1951[var3], field1951[var4], field1950[var2], field1950[var3], field1950[var4], this.field1921[arg0], this.field1922[arg0], this.field1967[arg0], field1945[var6], field1945[var7], field1945[var8], field1954[var6], field1954[var7], field1954[var8], field1953[var6], field1953[var7], field1953[var8], this.field1927[arg0]);
            }
        } else if (this.field1967[arg0] == -1) {
            class137.method2479(field1951[var2], field1951[var3], field1951[var4], field1950[var2], field1950[var3], field1950[var4], field1975[this.field1921[arg0]]);
        } else {
            class137.method2415(field1951[var2], field1951[var3], field1951[var4], field1950[var2], field1950[var3], field1950[var4], this.field1921[arg0], this.field1922[arg0], this.field1967[arg0]);
        }
    }

    @ObfuscatedName("ew.aq(I)V")
    public final void method2348(int arg0) {
        int var2 = Statics.field2008;
        int var3 = Statics.field2009;
        int var4 = 0;
        int var5 = this.field1918[arg0];
        int var6 = this.field1916[arg0];
        int var7 = this.field1923[arg0];
        int var8 = field1953[var5];
        int var9 = field1953[var6];
        int var10 = field1953[var7];
        if (this.field1925 == null) {
            class137.field2002 = 0;
        } else {
            class137.field2002 = this.field1925[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1935[var4] = field1950[var5];
            field1965[var4] = field1951[var5];
            field1966[var4++] = this.field1921[arg0];
        } else {
            int var11 = field1945[var5];
            int var12 = field1954[var5];
            int var13 = this.field1921[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1932[var10 - var8];
                field1935[var4] = (((field1945[var7] - var11) * var14 >> 16) + var11) * class137.field1999 / 50 + var2;
                field1965[var4] = (((field1954[var7] - var12) * var14 >> 16) + var12) * class137.field1999 / 50 + var3;
                field1966[var4++] = ((this.field1967[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1932[var9 - var8];
                field1935[var4] = (((field1945[var6] - var11) * var15 >> 16) + var11) * class137.field1999 / 50 + var2;
                field1965[var4] = (((field1954[var6] - var12) * var15 >> 16) + var12) * class137.field1999 / 50 + var3;
                field1966[var4++] = ((this.field1922[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1935[var4] = field1950[var6];
            field1965[var4] = field1951[var6];
            field1966[var4++] = this.field1922[arg0];
        } else {
            int var16 = field1945[var6];
            int var17 = field1954[var6];
            int var18 = this.field1922[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1932[var8 - var9];
                field1935[var4] = (((field1945[var5] - var16) * var19 >> 16) + var16) * class137.field1999 / 50 + var2;
                field1965[var4] = (((field1954[var5] - var17) * var19 >> 16) + var17) * class137.field1999 / 50 + var3;
                field1966[var4++] = ((this.field1921[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1932[var10 - var9];
                field1935[var4] = (((field1945[var7] - var16) * var20 >> 16) + var16) * class137.field1999 / 50 + var2;
                field1965[var4] = (((field1954[var7] - var17) * var20 >> 16) + var17) * class137.field1999 / 50 + var3;
                field1966[var4++] = ((this.field1967[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1935[var4] = field1950[var7];
            field1965[var4] = field1951[var7];
            field1966[var4++] = this.field1967[arg0];
        } else {
            int var21 = field1945[var7];
            int var22 = field1954[var7];
            int var23 = this.field1967[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1932[var9 - var10];
                field1935[var4] = (((field1945[var6] - var21) * var24 >> 16) + var21) * class137.field1999 / 50 + var2;
                field1965[var4] = (((field1954[var6] - var22) * var24 >> 16) + var22) * class137.field1999 / 50 + var3;
                field1966[var4++] = ((this.field1922[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1932[var8 - var10];
                field1935[var4] = (((field1945[var5] - var21) * var25 >> 16) + var21) * class137.field1999 / 50 + var2;
                field1965[var4] = (((field1954[var5] - var22) * var25 >> 16) + var22) * class137.field1999 / 50 + var3;
                field1966[var4++] = ((this.field1921[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1935[0];
        int var27 = field1935[1];
        int var28 = field1935[2];
        int var29 = field1965[0];
        int var30 = field1965[1];
        int var31 = field1965[2];
        class137.field2015 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2010 || var27 > Statics.field2010 || var28 > Statics.field2010) {
                class137.field2015 = true;
            }
            if (this.field1927 != null && this.field1927[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1919 == null || this.field1919[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1919[arg0] & 0xFF;
                    var33 = this.field1941[var32];
                    var34 = this.field1931[var32];
                    var35 = this.field1930[var32];
                }
                if (this.field1967[arg0] == -1) {
                    class137.method2419(var29, var30, var31, var26, var27, var28, this.field1921[arg0], this.field1921[arg0], this.field1921[arg0], field1945[var33], field1945[var34], field1945[var35], field1954[var33], field1954[var34], field1954[var35], field1953[var33], field1953[var34], field1953[var35], this.field1927[arg0]);
                } else {
                    class137.method2419(var29, var30, var31, var26, var27, var28, field1966[0], field1966[1], field1966[2], field1945[var33], field1945[var34], field1945[var35], field1954[var33], field1954[var34], field1954[var35], field1953[var33], field1953[var34], field1953[var35], this.field1927[arg0]);
                }
            } else if (this.field1967[arg0] == -1) {
                class137.method2479(var29, var30, var31, var26, var27, var28, field1975[this.field1921[arg0]]);
            } else {
                class137.method2415(var29, var30, var31, var26, var27, var28, field1966[0], field1966[1], field1966[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2010 || var27 > Statics.field2010 || var28 > Statics.field2010 || field1935[3] < 0 || field1935[3] > Statics.field2010) {
            class137.field2015 = true;
        }
        if (this.field1927 != null && this.field1927[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1919 == null || this.field1919[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1919[arg0] & 0xFF;
                var37 = this.field1941[var36];
                var38 = this.field1931[var36];
                var39 = this.field1930[var36];
            }
            short var40 = this.field1927[arg0];
            if (this.field1967[arg0] == -1) {
                class137.method2419(var29, var30, var31, var26, var27, var28, this.field1921[arg0], this.field1921[arg0], this.field1921[arg0], field1945[var37], field1945[var38], field1945[var39], field1954[var37], field1954[var38], field1954[var39], field1953[var37], field1953[var38], field1953[var39], var40);
                class137.method2419(var29, var31, field1965[3], var26, var28, field1935[3], this.field1921[arg0], this.field1921[arg0], this.field1921[arg0], field1945[var37], field1945[var38], field1945[var39], field1954[var37], field1954[var38], field1954[var39], field1953[var37], field1953[var38], field1953[var39], var40);
            } else {
                class137.method2419(var29, var30, var31, var26, var27, var28, field1966[0], field1966[1], field1966[2], field1945[var37], field1945[var38], field1945[var39], field1954[var37], field1954[var38], field1954[var39], field1953[var37], field1953[var38], field1953[var39], var40);
                class137.method2419(var29, var31, field1965[3], var26, var28, field1935[3], field1966[0], field1966[2], field1966[3], field1945[var37], field1945[var38], field1945[var39], field1954[var37], field1954[var38], field1954[var39], field1953[var37], field1953[var38], field1953[var39], var40);
            }
        } else if (this.field1967[arg0] == -1) {
            int var41 = field1975[this.field1921[arg0]];
            class137.method2479(var29, var30, var31, var26, var27, var28, var41);
            class137.method2479(var29, var31, field1965[3], var26, var28, field1935[3], var41);
        } else {
            class137.method2415(var29, var30, var31, var26, var27, var28, field1966[0], field1966[1], field1966[2]);
            class137.method2415(var29, var31, field1965[3], var26, var28, field1935[3], field1966[0], field1966[2], field1966[3]);
        }
    }
}

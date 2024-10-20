package deob;

@ObfuscatedName("ew")
public class class135 extends class143 {

    @ObfuscatedName("ew.e")
    public static class135 field1948 = new class135();

    @ObfuscatedName("ew.n")
    public static byte[] field1914 = new byte[1];

    @ObfuscatedName("ew.g")
    public static class135 field1913 = new class135();

    @ObfuscatedName("ew.y")
    public static byte[] field1971 = new byte[1];

    @ObfuscatedName("ew.w")
    public int field1917 = 0;

    @ObfuscatedName("ew.k")
    public int[] field1918;

    @ObfuscatedName("ew.v")
    public int[] field1919;

    @ObfuscatedName("ew.z")
    public int[] field1941;

    @ObfuscatedName("ew.r")
    public int field1921 = 0;

    @ObfuscatedName("ew.u")
    public int[] field1922;

    @ObfuscatedName("ew.d")
    public int[] field1958;

    @ObfuscatedName("ew.o")
    public int[] field1924;

    @ObfuscatedName("ew.l")
    public int[] field1925;

    @ObfuscatedName("ew.h")
    public int[] field1974;

    @ObfuscatedName("ew.s")
    public int[] field1927;

    @ObfuscatedName("ew.c")
    public byte[] field1928;

    @ObfuscatedName("ew.m")
    public byte[] field1929;

    @ObfuscatedName("ew.a")
    public byte[] field1930;

    @ObfuscatedName("ew.t")
    public short[] field1951;

    @ObfuscatedName("ew.p")
    public byte field1933 = 0;

    @ObfuscatedName("ew.f")
    public int field1961 = 0;

    @ObfuscatedName("ew.b")
    public int[] field1926;

    @ObfuscatedName("ew.x")
    public int[] field1981;

    @ObfuscatedName("ew.i")
    public int[] field1936;

    @ObfuscatedName("ew.j")
    public int[][] field1937;

    @ObfuscatedName("ew.q")
    public int[][] field1938;

    @ObfuscatedName("ew.ag")
    public boolean field1939 = false;

    @ObfuscatedName("ew.ay")
    public int field1915;

    @ObfuscatedName("ew.au")
    public int field1934;

    @ObfuscatedName("ew.ah")
    public int field1950;

    @ObfuscatedName("ew.ao")
    public int field1964;

    @ObfuscatedName("ew.al")
    public int field1944;

    @ObfuscatedName("ew.ae")
    public int field1945;

    @ObfuscatedName("ew.ax")
    public int field1946;

    @ObfuscatedName("ew.az")
    public int field1947;

    @ObfuscatedName("ew.aw")
    public int field1940 = -1;

    @ObfuscatedName("ew.av")
    public int field1949 = -1;

    @ObfuscatedName("ew.ac")
    public int field1943 = -1;

    @ObfuscatedName("ew.ad")
    public static boolean[] field1952 = new boolean[4700];

    @ObfuscatedName("ew.at")
    public static boolean[] field1953 = new boolean[4700];

    @ObfuscatedName("ew.af")
    public static int[] field1954 = new int[4700];

    @ObfuscatedName("ew.am")
    public static int[] field1955 = new int[4700];

    @ObfuscatedName("ew.aq")
    public static int[] field1956 = new int[4700];

    @ObfuscatedName("ew.as")
    public static int[] field1957 = new int[4700];

    @ObfuscatedName("ew.ab")
    public static int[] field1980 = new int[4700];

    @ObfuscatedName("ew.ap")
    public static int[] field1959 = new int[4700];

    @ObfuscatedName("ew.an")
    public static int[] field1942 = new int[1600];

    @ObfuscatedName("ew.ar")
    public static int[][] field1962 = new int[1600][512];

    @ObfuscatedName("ew.aj")
    public static int[] field1923 = new int[12];

    @ObfuscatedName("ew.aa")
    public static int[][] field1935 = new int[12][2000];

    @ObfuscatedName("ew.bn")
    public static int[] field1965 = new int[2000];

    @ObfuscatedName("ew.bo")
    public static int[] field1916 = new int[2000];

    @ObfuscatedName("ew.bq")
    public static int[] field1920 = new int[12];

    @ObfuscatedName("ew.ba")
    public static int[] field1968 = new int[10];

    @ObfuscatedName("ew.bg")
    public static int[] field1969 = new int[10];

    @ObfuscatedName("ew.bd")
    public static int[] field1970 = new int[10];

    @ObfuscatedName("ew.bc")
    public static boolean field1977 = true;

    @ObfuscatedName("ew.bz")
    public static int[] field1932 = class138.field2004;

    @ObfuscatedName("ew.br")
    public static int[] field1978 = class138.field2027;

    @ObfuscatedName("ew.bm")
    public static int[] field1979 = class138.field2010;

    @ObfuscatedName("ew.bj")
    public static int[] field1967 = class138.field2006;

    public class135() {
    }

    public class135(class135[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1917 = 0;
        this.field1921 = 0;
        this.field1961 = 0;
        this.field1933 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class135 var8 = arg0[var7];
            if (var8 != null) {
                this.field1917 += var8.field1917;
                this.field1921 += var8.field1921;
                this.field1961 += var8.field1961;
                if (var8.field1928 == null) {
                    if (this.field1933 == -1) {
                        this.field1933 = var8.field1933;
                    }
                    if (this.field1933 != var8.field1933) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1929 != null;
                var5 |= var8.field1951 != null;
                var6 |= var8.field1930 != null;
            }
        }
        this.field1918 = new int[this.field1917];
        this.field1919 = new int[this.field1917];
        this.field1941 = new int[this.field1917];
        this.field1922 = new int[this.field1921];
        this.field1958 = new int[this.field1921];
        this.field1924 = new int[this.field1921];
        this.field1925 = new int[this.field1921];
        this.field1974 = new int[this.field1921];
        this.field1927 = new int[this.field1921];
        if (var3) {
            this.field1928 = new byte[this.field1921];
        }
        if (var4) {
            this.field1929 = new byte[this.field1921];
        }
        if (var5) {
            this.field1951 = new short[this.field1921];
        }
        if (var6) {
            this.field1930 = new byte[this.field1921];
        }
        if (this.field1961 > 0) {
            this.field1926 = new int[this.field1961];
            this.field1981 = new int[this.field1961];
            this.field1936 = new int[this.field1961];
        }
        this.field1917 = 0;
        this.field1921 = 0;
        this.field1961 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class135 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1921; var11++) {
                    this.field1922[this.field1921] = var10.field1922[var11] + this.field1917;
                    this.field1958[this.field1921] = var10.field1958[var11] + this.field1917;
                    this.field1924[this.field1921] = var10.field1924[var11] + this.field1917;
                    this.field1925[this.field1921] = var10.field1925[var11];
                    this.field1974[this.field1921] = var10.field1974[var11];
                    this.field1927[this.field1921] = var10.field1927[var11];
                    if (var3) {
                        if (var10.field1928 == null) {
                            this.field1928[this.field1921] = var10.field1933;
                        } else {
                            this.field1928[this.field1921] = var10.field1928[var11];
                        }
                    }
                    if (var4 && var10.field1929 != null) {
                        this.field1929[this.field1921] = var10.field1929[var11];
                    }
                    if (var5) {
                        if (var10.field1951 == null) {
                            this.field1951[this.field1921] = -1;
                        } else {
                            this.field1951[this.field1921] = var10.field1951[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1930 == null || var10.field1930[var11] == -1) {
                            this.field1930[this.field1921] = -1;
                        } else {
                            this.field1930[this.field1921] = (byte) (var10.field1930[var11] + this.field1961);
                        }
                    }
                    this.field1921++;
                }
                for (int var12 = 0; var12 < var10.field1961; var12++) {
                    this.field1926[this.field1961] = var10.field1926[var12] + this.field1917;
                    this.field1981[this.field1961] = var10.field1981[var12] + this.field1917;
                    this.field1936[this.field1961] = var10.field1936[var12] + this.field1917;
                    this.field1961++;
                }
                for (int var13 = 0; var13 < var10.field1917; var13++) {
                    this.field1918[this.field1917] = var10.field1918[var13];
                    this.field1919[this.field1917] = var10.field1919[var13];
                    this.field1941[this.field1917] = var10.field1941[var13];
                    this.field1917++;
                }
            }
        }
    }

    @ObfuscatedName("ew.e([[IIIIZI)Lew;")
    public class135 method2346(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2320();
        int var7 = arg1 - this.field1950;
        int var8 = this.field1950 + arg1;
        int var9 = arg3 - this.field1950;
        int var10 = this.field1950 + arg3;
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
            var15.field1917 = this.field1917;
            var15.field1921 = this.field1921;
            var15.field1961 = this.field1961;
            var15.field1918 = this.field1918;
            var15.field1941 = this.field1941;
            var15.field1922 = this.field1922;
            var15.field1958 = this.field1958;
            var15.field1924 = this.field1924;
            var15.field1925 = this.field1925;
            var15.field1974 = this.field1974;
            var15.field1927 = this.field1927;
            var15.field1928 = this.field1928;
            var15.field1929 = this.field1929;
            var15.field1930 = this.field1930;
            var15.field1951 = this.field1951;
            var15.field1933 = this.field1933;
            var15.field1926 = this.field1926;
            var15.field1981 = this.field1981;
            var15.field1936 = this.field1936;
            var15.field1937 = this.field1937;
            var15.field1938 = this.field1938;
            var15.field1939 = this.field1939;
            var15.field1919 = new int[var15.field1917];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1917; var16++) {
                int var17 = this.field1918[var16] + arg1;
                int var18 = this.field1941[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1919[var16] = this.field1919[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1917; var26++) {
                int var27 = (-this.field1919[var26] << 16) / this.field2113;
                if (var27 < arg5) {
                    int var28 = this.field1918[var26] + arg1;
                    int var29 = this.field1941[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1919[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1919[var26];
                }
            }
        }
        var15.method2385();
        return var15;
    }

    @ObfuscatedName("ew.n(Z)Lew;")
    public class135 method2409(boolean arg0) {
        if (!arg0 && field1914.length < this.field1921) {
            field1914 = new byte[this.field1921 + 100];
        }
        return this.method2338(arg0, field1948, field1914);
    }

    @ObfuscatedName("ew.y(Z)Lew;")
    public class135 method2355(boolean arg0) {
        if (!arg0 && field1971.length < this.field1921) {
            field1971 = new byte[this.field1921 + 100];
        }
        return this.method2338(arg0, field1913, field1971);
    }

    @ObfuscatedName("ew.w(ZLew;[B)Lew;")
    public class135 method2338(boolean arg0, class135 arg1, byte[] arg2) {
        arg1.field1917 = this.field1917;
        arg1.field1921 = this.field1921;
        arg1.field1961 = this.field1961;
        if (arg1.field1918 == null || arg1.field1918.length < this.field1917) {
            arg1.field1918 = new int[this.field1917 + 100];
            arg1.field1919 = new int[this.field1917 + 100];
            arg1.field1941 = new int[this.field1917 + 100];
        }
        for (int var4 = 0; var4 < this.field1917; var4++) {
            arg1.field1918[var4] = this.field1918[var4];
            arg1.field1919[var4] = this.field1919[var4];
            arg1.field1941[var4] = this.field1941[var4];
        }
        if (arg0) {
            arg1.field1929 = this.field1929;
        } else {
            arg1.field1929 = arg2;
            if (this.field1929 == null) {
                for (int var5 = 0; var5 < this.field1921; var5++) {
                    arg1.field1929[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1921; var6++) {
                    arg1.field1929[var6] = this.field1929[var6];
                }
            }
        }
        arg1.field1922 = this.field1922;
        arg1.field1958 = this.field1958;
        arg1.field1924 = this.field1924;
        arg1.field1925 = this.field1925;
        arg1.field1974 = this.field1974;
        arg1.field1927 = this.field1927;
        arg1.field1928 = this.field1928;
        arg1.field1930 = this.field1930;
        arg1.field1951 = this.field1951;
        arg1.field1933 = this.field1933;
        arg1.field1926 = this.field1926;
        arg1.field1981 = this.field1981;
        arg1.field1936 = this.field1936;
        arg1.field1937 = this.field1937;
        arg1.field1938 = this.field1938;
        arg1.field1939 = this.field1939;
        arg1.method2385();
        return arg1;
    }

    @ObfuscatedName("ew.k(I)V")
    public void method2407(int arg0) {
        if (this.field1940 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1978[arg0];
        int var9 = field1932[arg0];
        for (int var10 = 0; var10 < this.field1917; var10++) {
            int var11 = class138.method2446(this.field1918[var10], this.field1941[var10], var8, var9);
            int var12 = this.field1919[var10];
            int var13 = class138.method2447(this.field1918[var10], this.field1941[var10], var8, var9);
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
        this.field1945 = (var2 + var5) / 2;
        this.field1946 = (var3 + var6) / 2;
        this.field1947 = (var4 + var7) / 2;
        this.field1940 = (var5 - var2 + 1) / 2;
        this.field1949 = (var6 - var3 + 1) / 2;
        this.field1943 = (var7 - var4 + 1) / 2;
        if (this.field1940 < 32) {
            this.field1940 = 32;
        }
        if (this.field1943 < 32) {
            this.field1943 = 32;
        }
        if (this.field1939) {
            this.field1940 += 8;
            this.field1943 += 8;
        }
    }

    @ObfuscatedName("ew.v()V")
    public void method2320() {
        if (this.field1915 == 1) {
            return;
        }
        this.field1915 = 1;
        this.field2113 = 0;
        this.field1934 = 0;
        this.field1950 = 0;
        for (int var1 = 0; var1 < this.field1917; var1++) {
            int var2 = this.field1918[var1];
            int var3 = this.field1919[var1];
            int var4 = this.field1941[var1];
            if (-var3 > this.field2113) {
                this.field2113 = -var3;
            }
            if (var3 > this.field1934) {
                this.field1934 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1950) {
                this.field1950 = var5;
            }
        }
        this.field1950 = (int) (Math.sqrt((double) this.field1950) + 0.99D);
        this.field1944 = (int) (Math.sqrt((double) (this.field2113 * this.field2113 + this.field1950 * this.field1950)) + 0.99D);
        this.field1964 = this.field1944 + (int) (Math.sqrt((double) (this.field1950 * this.field1950 + this.field1934 * this.field1934)) + 0.99D);
    }

    @ObfuscatedName("ew.z()V")
    public void method2402() {
        if (this.field1915 == 2) {
            return;
        }
        this.field1915 = 2;
        this.field1950 = 0;
        for (int var1 = 0; var1 < this.field1917; var1++) {
            int var2 = this.field1918[var1];
            int var3 = this.field1919[var1];
            int var4 = this.field1941[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1950) {
                this.field1950 = var5;
            }
        }
        this.field1950 = (int) (Math.sqrt((double) this.field1950) + 0.99D);
        this.field1944 = this.field1950;
        this.field1964 = this.field1950 + this.field1950;
    }

    @ObfuscatedName("ew.r()I")
    public int method2322() {
        this.method2320();
        return this.field1950;
    }

    @ObfuscatedName("ew.u()V")
    public void method2385() {
        this.field1915 = 0;
        this.field1940 = -1;
    }

    @ObfuscatedName("ew.d(Lea;I)V")
    public void method2324(class146 arg0, int arg1) {
        if (this.field1937 == null || arg1 == -1) {
            return;
        }
        class133 var3 = arg0.field2132[arg1];
        class140 var4 = var3.field1876;
        Statics.field1931 = 0;
        Statics.field1972 = 0;
        Statics.field1973 = 0;
        for (int var5 = 0; var5 < var3.field1881; var5++) {
            int var6 = var3.field1880[var5];
            this.method2367(var4.field2041[var6], var4.field2040[var6], var3.field1883[var5], var3.field1884[var5], var3.field1885[var5]);
        }
        this.method2385();
    }

    @ObfuscatedName("ew.o(Lea;ILea;I[I)V")
    public void method2325(class146 arg0, int arg1, class146 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2324(arg0, arg1);
            return;
        }
        class133 var6 = arg0.field2132[arg1];
        class133 var7 = arg2.field2132[arg3];
        class140 var8 = var6.field1876;
        Statics.field1931 = 0;
        Statics.field1972 = 0;
        Statics.field1973 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1881; var11++) {
            int var12 = var6.field1880[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field2041[var12] == 0) {
                this.method2367(var8.field2041[var12], var8.field2040[var12], var6.field1883[var11], var6.field1884[var11], var6.field1885[var11]);
            }
        }
        Statics.field1931 = 0;
        Statics.field1972 = 0;
        Statics.field1973 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1881; var15++) {
            int var16 = var7.field1880[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field2041[var16] == 0) {
                this.method2367(var8.field2041[var16], var8.field2040[var16], var7.field1883[var15], var7.field1884[var15], var7.field1885[var15]);
            }
        }
        this.method2385();
    }

    @ObfuscatedName("ew.m(I[IIII)V")
    public void method2367(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1931 = 0;
            Statics.field1972 = 0;
            Statics.field1973 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1937.length) {
                    int[] var10 = this.field1937[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1931 += this.field1918[var12];
                        Statics.field1972 += this.field1919[var12];
                        Statics.field1973 += this.field1941[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1931 = Statics.field1931 / var7 + arg2;
                Statics.field1972 = Statics.field1972 / var7 + arg3;
                Statics.field1973 = Statics.field1973 / var7 + arg4;
            } else {
                Statics.field1931 = arg2;
                Statics.field1972 = arg3;
                Statics.field1973 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1937.length) {
                    int[] var15 = this.field1937[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1918[var17] += arg2;
                        this.field1919[var17] += arg3;
                        this.field1941[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1937.length) {
                    int[] var20 = this.field1937[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1918[var22] -= Statics.field1931;
                        this.field1919[var22] -= Statics.field1972;
                        this.field1941[var22] -= Statics.field1973;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1932[var25];
                            int var27 = field1978[var25];
                            int var28 = this.field1919[var22] * var26 + this.field1918[var22] * var27 >> 16;
                            this.field1919[var22] = this.field1919[var22] * var27 - this.field1918[var22] * var26 >> 16;
                            this.field1918[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1932[var23];
                            int var30 = field1978[var23];
                            int var31 = this.field1919[var22] * var30 - this.field1941[var22] * var29 >> 16;
                            this.field1941[var22] = this.field1941[var22] * var30 + this.field1919[var22] * var29 >> 16;
                            this.field1919[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1932[var24];
                            int var33 = field1978[var24];
                            int var34 = this.field1941[var22] * var32 + this.field1918[var22] * var33 >> 16;
                            this.field1941[var22] = this.field1941[var22] * var33 - this.field1918[var22] * var32 >> 16;
                            this.field1918[var22] = var34;
                        }
                        this.field1918[var22] += Statics.field1931;
                        this.field1919[var22] += Statics.field1972;
                        this.field1941[var22] += Statics.field1973;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1937.length) {
                    int[] var37 = this.field1937[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1918[var39] -= Statics.field1931;
                        this.field1919[var39] -= Statics.field1972;
                        this.field1941[var39] -= Statics.field1973;
                        this.field1918[var39] = this.field1918[var39] * arg2 / 128;
                        this.field1919[var39] = this.field1919[var39] * arg3 / 128;
                        this.field1941[var39] = this.field1941[var39] * arg4 / 128;
                        this.field1918[var39] += Statics.field1931;
                        this.field1919[var39] += Statics.field1972;
                        this.field1941[var39] += Statics.field1973;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1938 != null && this.field1929 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1938.length) {
                    int[] var42 = this.field1938[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1929[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1929[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ew.a()V")
    public void method2357() {
        for (int var1 = 0; var1 < this.field1917; var1++) {
            int var2 = this.field1918[var1];
            this.field1918[var1] = this.field1941[var1];
            this.field1941[var1] = -var2;
        }
        this.method2385();
    }

    @ObfuscatedName("ew.t()V")
    public void method2315() {
        for (int var1 = 0; var1 < this.field1917; var1++) {
            this.field1918[var1] = -this.field1918[var1];
            this.field1941[var1] = -this.field1941[var1];
        }
        this.method2385();
    }

    @ObfuscatedName("ew.p()V")
    public void method2329() {
        for (int var1 = 0; var1 < this.field1917; var1++) {
            int var2 = this.field1941[var1];
            this.field1941[var1] = this.field1918[var1];
            this.field1918[var1] = -var2;
        }
        this.method2385();
    }

    @ObfuscatedName("ew.f(I)V")
    public void method2330(int arg0) {
        int var2 = field1932[arg0];
        int var3 = field1978[arg0];
        for (int var4 = 0; var4 < this.field1917; var4++) {
            int var5 = this.field1919[var4] * var3 - this.field1941[var4] * var2 >> 16;
            this.field1941[var4] = this.field1941[var4] * var3 + this.field1919[var4] * var2 >> 16;
            this.field1919[var4] = var5;
        }
        this.method2385();
    }

    @ObfuscatedName("ew.x(III)V")
    public void method2327(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1917; var4++) {
            this.field1918[var4] += arg0;
            this.field1919[var4] += arg1;
            this.field1941[var4] += arg2;
        }
        this.method2385();
    }

    @ObfuscatedName("ew.q(III)V")
    public void method2332(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1917; var4++) {
            this.field1918[var4] = this.field1918[var4] * arg0 / 128;
            this.field1919[var4] = this.field1919[var4] * arg1 / 128;
            this.field1941[var4] = this.field1941[var4] * arg2 / 128;
        }
        this.method2385();
    }

    @ObfuscatedName("ew.ag(IIIIIII)V")
    public final void method2333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1942[0] = -1;
        if (this.field1915 != 2 && this.field1915 != 1) {
            this.method2402();
        }
        int var8 = Statics.field2013;
        int var9 = Statics.field2025;
        int var10 = field1932[arg0];
        int var11 = field1978[arg0];
        int var12 = field1932[arg1];
        int var13 = field1978[arg1];
        int var14 = field1932[arg2];
        int var15 = field1978[arg2];
        int var16 = field1932[arg3];
        int var17 = field1978[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1917; var19++) {
            int var20 = this.field1918[var19];
            int var21 = this.field1919[var19];
            int var22 = this.field1941[var19];
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
            field1956[var19] = var30 - var18;
            field1954[var19] = class138.field2012 * var26 / var30 + var8;
            field1955[var19] = class138.field2012 * var29 / var30 + var9;
            if (this.field1961 > 0) {
                field1957[var19] = var26;
                field1980[var19] = var29;
                field1959[var19] = var30;
            }
        }
        try {
            this.method2383(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ew.ay(IIIIIIII)V")
    public final void method2334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1942[0] = -1;
        if (this.field1915 != 2 && this.field1915 != 1) {
            this.method2402();
        }
        int var9 = Statics.field2013;
        int var10 = Statics.field2025;
        int var11 = field1932[arg0];
        int var12 = field1978[arg0];
        int var13 = field1932[arg1];
        int var14 = field1978[arg1];
        int var15 = field1932[arg2];
        int var16 = field1978[arg2];
        int var17 = field1932[arg3];
        int var18 = field1978[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1917; var20++) {
            int var21 = this.field1918[var20];
            int var22 = this.field1919[var20];
            int var23 = this.field1941[var20];
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
            field1956[var20] = var31 - var19;
            field1954[var20] = class138.field2012 * var27 / arg7 + var9;
            field1955[var20] = class138.field2012 * var30 / arg7 + var10;
            if (this.field1961 > 0) {
                field1957[var20] = var27;
                field1980[var20] = var30;
                field1959[var20] = var31;
            }
        }
        try {
            this.method2383(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ew.cg(IIIIIIIII)V")
    public void method2337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1942[0] = -1;
        if (this.field1915 != 1) {
            this.method2320();
        }
        this.method2407(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1950 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1950) * class138.field2012;
        if (var15 / var13 >= Statics.field2018) {
            return;
        }
        int var16 = (this.field1950 + var14) * class138.field2012;
        if (var16 / var13 <= Statics.field2017) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1950 * arg1 >> 16;
        int var19 = (var17 + var18) * class138.field2012;
        if (var19 / var13 <= Statics.field2019) {
            return;
        }
        int var20 = (this.field2113 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class138.field2012;
        if (var21 / var13 >= Statics.field2026) {
            return;
        }
        int var22 = (this.field2113 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1961 > 0;
        int var26 = class136.field1984;
        int var28 = class136.method1541();
        boolean var29 = class136.method543();
        if (class8.field232 && arg8 > 0) {
            class8.method4073(this, arg5, arg6, arg7);
        }
        if (class8.field236 && arg8 > 0) {
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
            int var40 = var26 - Statics.field2013;
            int var41 = var28 - Statics.field2025;
            if (var40 > var35 && var40 < var36 && var41 > var37 && var41 < var38) {
                var39 = -256;
            }
            int var42 = Statics.field2013 + var35;
            int var43 = Statics.field2025 + var37;
            int var44 = Statics.field2013 + var36;
            int var45 = Statics.field2025 + var38;
            class8.field230.method3326(new class9(var42, var43, var44, var45, var39));
        }
        boolean var46 = false;
        if (arg8 > 0 && var29) {
            boolean var47 = false;
            if (field1977) {
                var47 = class136.method1613(this, arg5, arg6, arg7);
            } else {
                int var48 = var11 - var12;
                if (var48 <= 50) {
                    var48 = 50;
                }
                int var49;
                int var50;
                if (var14 > 0) {
                    var49 = var15 / var13;
                    var50 = var16 / var48;
                } else {
                    var50 = var16 / var13;
                    var49 = var15 / var48;
                }
                int var51;
                int var52;
                if (var17 > 0) {
                    var51 = var21 / var13;
                    var52 = var19 / var48;
                } else {
                    var52 = var19 / var13;
                    var51 = var21 / var48;
                }
                int var53 = var26 - Statics.field2013;
                int var54 = var28 - Statics.field2025;
                if (var53 > var49 && var53 < var50 && var54 > var51 && var54 < var52) {
                    var47 = true;
                }
            }
            if (var47) {
                if (this.field1939) {
                    class136.field1990[++class136.field1989 - 1] = arg8;
                } else {
                    var46 = true;
                }
            }
        }
        int var56 = Statics.field2013;
        int var57 = Statics.field2025;
        int var58 = 0;
        int var59 = 0;
        if (arg0 != 0) {
            var58 = field1932[arg0];
            var59 = field1978[arg0];
        }
        for (int var60 = 0; var60 < this.field1917; var60++) {
            int var61 = this.field1918[var60];
            int var62 = this.field1919[var60];
            int var63 = this.field1941[var60];
            if (arg0 != 0) {
                int var64 = var58 * var63 + var59 * var61 >> 16;
                var63 = var59 * var63 - var58 * var61 >> 16;
                var61 = var64;
            }
            int var65 = arg5 + var61;
            int var66 = arg6 + var62;
            int var67 = arg7 + var63;
            int var68 = arg3 * var67 + arg4 * var65 >> 16;
            int var69 = arg4 * var67 - arg3 * var65 >> 16;
            int var71 = arg2 * var66 - arg1 * var69 >> 16;
            int var72 = arg1 * var66 + arg2 * var69 >> 16;
            field1956[var60] = var72 - var11;
            if (var72 >= 50) {
                field1954[var60] = class138.field2012 * var68 / var72 + var56;
                field1955[var60] = class138.field2012 * var71 / var72 + var57;
            } else {
                field1954[var60] = -5000;
                var23 = true;
            }
            if (var25) {
                field1957[var60] = var68;
                field1980[var60] = var71;
                field1959[var60] = var72;
            }
        }
        try {
            this.method2383(var23, var46, this.field1939, arg8);
        } catch (Exception var75) {
        }
    }

    @ObfuscatedName("ew.au(ZZZI)V")
    public final void method2383(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1964 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1964; var5++) {
            field1942[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field228 && arg1) {
            class135 var7 = this;
            for (int var8 = 0; var8 < var7.field1921; var8++) {
                if (var7.field1927[var8] != -2) {
                    int var9 = var7.field1922[var8];
                    int var10 = var7.field1958[var8];
                    int var11 = var7.field1924[var8];
                    int var12 = field1954[var9];
                    int var13 = field1954[var10];
                    int var14 = field1954[var11];
                    class8.method2780(field1955[var9], field1955[var10], field1955[var11], var12, var13, var14, var6);
                }
            }
        }
        for (int var15 = 0; var15 < this.field1921; var15++) {
            if (this.field1927[var15] != -2) {
                int var16 = this.field1922[var15];
                int var17 = this.field1958[var15];
                int var18 = this.field1924[var15];
                int var19 = field1954[var16];
                int var20 = field1954[var17];
                int var21 = field1954[var18];
                if (arg0 && var19 == -5000 || var20 == -5000 || var21 == -5000) {
                    int var22 = field1957[var16];
                    int var23 = field1957[var17];
                    int var24 = field1957[var18];
                    int var25 = field1980[var16];
                    int var26 = field1980[var17];
                    int var27 = field1980[var18];
                    int var28 = field1959[var16];
                    int var29 = field1959[var17];
                    int var30 = field1959[var18];
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
                        field1953[var15] = true;
                        int var40 = (field1956[var16] + field1956[var17] + field1956[var18]) / 3 + this.field1944;
                        field1962[var40][field1942[var40]++] = var15;
                    }
                } else {
                    if (arg1 && Statics.method2299(field1955[var16], field1955[var17], field1955[var18], var19, var20, var21, var6)) {
                        class136.field1990[++class136.field1989 - 1] = arg3;
                        arg1 = false;
                    }
                    if ((field1955[var18] - field1955[var17]) * (var19 - var20) - (field1955[var16] - field1955[var17]) * (var21 - var20) > 0) {
                        field1953[var15] = false;
                        if (var19 >= 0 && var20 >= 0 && var21 >= 0 && var19 <= Statics.field2015 && var20 <= Statics.field2015 && var21 <= Statics.field2015) {
                            field1952[var15] = false;
                        } else {
                            field1952[var15] = true;
                        }
                        int var42 = (field1956[var16] + field1956[var17] + field1956[var18]) / 3 + this.field1944;
                        field1962[var42][field1942[var42]++] = var15;
                    }
                }
            }
        }
        if (this.field1928 == null) {
            for (int var43 = this.field1964 - 1; var43 >= 0; var43--) {
                int var44 = field1942[var43];
                if (var44 > 0) {
                    int[] var45 = field1962[var43];
                    for (int var46 = 0; var46 < var44; var46++) {
                        this.method2360(var45[var46]);
                    }
                }
            }
            return;
        }
        for (int var47 = 0; var47 < 12; var47++) {
            field1923[var47] = 0;
            field1920[var47] = 0;
        }
        for (int var48 = this.field1964 - 1; var48 >= 0; var48--) {
            int var49 = field1942[var48];
            if (var49 > 0) {
                int[] var50 = field1962[var48];
                for (int var51 = 0; var51 < var49; var51++) {
                    int var52 = var50[var51];
                    byte var53 = this.field1928[var52];
                    int var54 = field1923[var53]++;
                    field1935[var53][var54] = var52;
                    if (var53 < 10) {
                        field1920[var53] += var48;
                    } else if (var53 == 10) {
                        field1965[var54] = var48;
                    } else {
                        field1916[var54] = var48;
                    }
                }
            }
        }
        int var55 = 0;
        if (field1923[1] > 0 || field1923[2] > 0) {
            var55 = (field1920[1] + field1920[2]) / (field1923[1] + field1923[2]);
        }
        int var56 = 0;
        if (field1923[3] > 0 || field1923[4] > 0) {
            var56 = (field1920[3] + field1920[4]) / (field1923[3] + field1923[4]);
        }
        int var57 = 0;
        if (field1923[6] > 0 || field1923[8] > 0) {
            var57 = (field1920[6] + field1920[8]) / (field1923[6] + field1923[8]);
        }
        int var58 = 0;
        int var59 = field1923[10];
        int[] var60 = field1935[10];
        int[] var61 = field1965;
        if (var58 == var59) {
            var58 = 0;
            var59 = field1923[11];
            var60 = field1935[11];
            var61 = field1916;
        }
        int var62;
        if (var58 < var59) {
            var62 = var61[var58];
        } else {
            var62 = -1000;
        }
        for (int var63 = 0; var63 < 10; var63++) {
            while (var63 == 0 && var62 > var55) {
                this.method2360(var60[var58++]);
                if (var58 == var59 && field1935[11] != var60) {
                    var58 = 0;
                    var59 = field1923[11];
                    var60 = field1935[11];
                    var61 = field1916;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 3 && var62 > var56) {
                this.method2360(var60[var58++]);
                if (var58 == var59 && field1935[11] != var60) {
                    var58 = 0;
                    var59 = field1923[11];
                    var60 = field1935[11];
                    var61 = field1916;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            while (var63 == 5 && var62 > var57) {
                this.method2360(var60[var58++]);
                if (var58 == var59 && field1935[11] != var60) {
                    var58 = 0;
                    var59 = field1923[11];
                    var60 = field1935[11];
                    var61 = field1916;
                }
                if (var58 < var59) {
                    var62 = var61[var58];
                } else {
                    var62 = -1000;
                }
            }
            int var64 = field1923[var63];
            int[] var65 = field1935[var63];
            for (int var66 = 0; var66 < var64; var66++) {
                this.method2360(var65[var66]);
            }
        }
        while (var62 != -1000) {
            this.method2360(var60[var58++]);
            if (var58 == var59 && field1935[11] != var60) {
                var58 = 0;
                var60 = field1935[11];
                var59 = field1923[11];
                var61 = field1916;
            }
            if (var58 < var59) {
                var62 = var61[var58];
            } else {
                var62 = -1000;
            }
        }
    }

    @ObfuscatedName("ew.ah(I)V")
    public final void method2360(int arg0) {
        if (field1953[arg0]) {
            this.method2318(arg0);
            return;
        }
        int var2 = this.field1922[arg0];
        int var3 = this.field1958[arg0];
        int var4 = this.field1924[arg0];
        class138.field2022 = field1952[arg0];
        if (this.field1929 == null) {
            class138.field2001 = 0;
        } else {
            class138.field2001 = this.field1929[arg0] & 0xFF;
        }
        if (this.field1951 != null && this.field1951[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1930 == null || this.field1930[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1930[arg0] & 0xFF;
                var6 = this.field1926[var5];
                var7 = this.field1981[var5];
                var8 = this.field1936[var5];
            }
            if (this.field1927[arg0] == -1) {
                class138.method2491(field1955[var2], field1955[var3], field1955[var4], field1954[var2], field1954[var3], field1954[var4], this.field1925[arg0], this.field1925[arg0], this.field1925[arg0], field1957[var6], field1957[var7], field1957[var8], field1980[var6], field1980[var7], field1980[var8], field1959[var6], field1959[var7], field1959[var8], this.field1951[arg0]);
            } else {
                class138.method2491(field1955[var2], field1955[var3], field1955[var4], field1954[var2], field1954[var3], field1954[var4], this.field1925[arg0], this.field1974[arg0], this.field1927[arg0], field1957[var6], field1957[var7], field1957[var8], field1980[var6], field1980[var7], field1980[var8], field1959[var6], field1959[var7], field1959[var8], this.field1951[arg0]);
            }
        } else if (this.field1927[arg0] == -1) {
            class138.method2441(field1955[var2], field1955[var3], field1955[var4], field1954[var2], field1954[var3], field1954[var4], field1979[this.field1925[arg0]]);
        } else {
            class138.method2437(field1955[var2], field1955[var3], field1955[var4], field1954[var2], field1954[var3], field1954[var4], this.field1925[arg0], this.field1974[arg0], this.field1927[arg0]);
        }
    }

    @ObfuscatedName("ew.ao(I)V")
    public final void method2318(int arg0) {
        int var2 = Statics.field2013;
        int var3 = Statics.field2025;
        int var4 = 0;
        int var5 = this.field1922[arg0];
        int var6 = this.field1958[arg0];
        int var7 = this.field1924[arg0];
        int var8 = field1959[var5];
        int var9 = field1959[var6];
        int var10 = field1959[var7];
        if (this.field1929 == null) {
            class138.field2001 = 0;
        } else {
            class138.field2001 = this.field1929[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1968[var4] = field1954[var5];
            field1969[var4] = field1955[var5];
            field1970[var4++] = this.field1925[arg0];
        } else {
            int var11 = field1957[var5];
            int var12 = field1980[var5];
            int var13 = this.field1925[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1967[var10 - var8];
                field1968[var4] = (((field1957[var7] - var11) * var14 >> 16) + var11) * class138.field2012 / 50 + var2;
                field1969[var4] = (((field1980[var7] - var12) * var14 >> 16) + var12) * class138.field2012 / 50 + var3;
                field1970[var4++] = ((this.field1927[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1967[var9 - var8];
                field1968[var4] = (((field1957[var6] - var11) * var15 >> 16) + var11) * class138.field2012 / 50 + var2;
                field1969[var4] = (((field1980[var6] - var12) * var15 >> 16) + var12) * class138.field2012 / 50 + var3;
                field1970[var4++] = ((this.field1974[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1968[var4] = field1954[var6];
            field1969[var4] = field1955[var6];
            field1970[var4++] = this.field1974[arg0];
        } else {
            int var16 = field1957[var6];
            int var17 = field1980[var6];
            int var18 = this.field1974[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1967[var8 - var9];
                field1968[var4] = (((field1957[var5] - var16) * var19 >> 16) + var16) * class138.field2012 / 50 + var2;
                field1969[var4] = (((field1980[var5] - var17) * var19 >> 16) + var17) * class138.field2012 / 50 + var3;
                field1970[var4++] = ((this.field1925[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1967[var10 - var9];
                field1968[var4] = (((field1957[var7] - var16) * var20 >> 16) + var16) * class138.field2012 / 50 + var2;
                field1969[var4] = (((field1980[var7] - var17) * var20 >> 16) + var17) * class138.field2012 / 50 + var3;
                field1970[var4++] = ((this.field1927[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1968[var4] = field1954[var7];
            field1969[var4] = field1955[var7];
            field1970[var4++] = this.field1927[arg0];
        } else {
            int var21 = field1957[var7];
            int var22 = field1980[var7];
            int var23 = this.field1927[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1967[var9 - var10];
                field1968[var4] = (((field1957[var6] - var21) * var24 >> 16) + var21) * class138.field2012 / 50 + var2;
                field1969[var4] = (((field1980[var6] - var22) * var24 >> 16) + var22) * class138.field2012 / 50 + var3;
                field1970[var4++] = ((this.field1974[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1967[var8 - var10];
                field1968[var4] = (((field1957[var5] - var21) * var25 >> 16) + var21) * class138.field2012 / 50 + var2;
                field1969[var4] = (((field1980[var5] - var22) * var25 >> 16) + var22) * class138.field2012 / 50 + var3;
                field1970[var4++] = ((this.field1925[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1968[0];
        int var27 = field1968[1];
        int var28 = field1968[2];
        int var29 = field1969[0];
        int var30 = field1969[1];
        int var31 = field1969[2];
        class138.field2022 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2015 || var27 > Statics.field2015 || var28 > Statics.field2015) {
                class138.field2022 = true;
            }
            if (this.field1951 != null && this.field1951[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1930 == null || this.field1930[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1930[arg0] & 0xFF;
                    var33 = this.field1926[var32];
                    var34 = this.field1981[var32];
                    var35 = this.field1936[var32];
                }
                if (this.field1927[arg0] == -1) {
                    class138.method2491(var29, var30, var31, var26, var27, var28, this.field1925[arg0], this.field1925[arg0], this.field1925[arg0], field1957[var33], field1957[var34], field1957[var35], field1980[var33], field1980[var34], field1980[var35], field1959[var33], field1959[var34], field1959[var35], this.field1951[arg0]);
                } else {
                    class138.method2491(var29, var30, var31, var26, var27, var28, field1970[0], field1970[1], field1970[2], field1957[var33], field1957[var34], field1957[var35], field1980[var33], field1980[var34], field1980[var35], field1959[var33], field1959[var34], field1959[var35], this.field1951[arg0]);
                }
            } else if (this.field1927[arg0] == -1) {
                class138.method2441(var29, var30, var31, var26, var27, var28, field1979[this.field1925[arg0]]);
            } else {
                class138.method2437(var29, var30, var31, var26, var27, var28, field1970[0], field1970[1], field1970[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field2015 || var27 > Statics.field2015 || var28 > Statics.field2015 || field1968[3] < 0 || field1968[3] > Statics.field2015) {
            class138.field2022 = true;
        }
        if (this.field1951 != null && this.field1951[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1930 == null || this.field1930[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1930[arg0] & 0xFF;
                var37 = this.field1926[var36];
                var38 = this.field1981[var36];
                var39 = this.field1936[var36];
            }
            short var40 = this.field1951[arg0];
            if (this.field1927[arg0] == -1) {
                class138.method2491(var29, var30, var31, var26, var27, var28, this.field1925[arg0], this.field1925[arg0], this.field1925[arg0], field1957[var37], field1957[var38], field1957[var39], field1980[var37], field1980[var38], field1980[var39], field1959[var37], field1959[var38], field1959[var39], var40);
                class138.method2491(var29, var31, field1969[3], var26, var28, field1968[3], this.field1925[arg0], this.field1925[arg0], this.field1925[arg0], field1957[var37], field1957[var38], field1957[var39], field1980[var37], field1980[var38], field1980[var39], field1959[var37], field1959[var38], field1959[var39], var40);
            } else {
                class138.method2491(var29, var30, var31, var26, var27, var28, field1970[0], field1970[1], field1970[2], field1957[var37], field1957[var38], field1957[var39], field1980[var37], field1980[var38], field1980[var39], field1959[var37], field1959[var38], field1959[var39], var40);
                class138.method2491(var29, var31, field1969[3], var26, var28, field1968[3], field1970[0], field1970[2], field1970[3], field1957[var37], field1957[var38], field1957[var39], field1980[var37], field1980[var38], field1980[var39], field1959[var37], field1959[var38], field1959[var39], var40);
            }
        } else if (this.field1927[arg0] == -1) {
            int var41 = field1979[this.field1925[arg0]];
            class138.method2441(var29, var30, var31, var26, var27, var28, var41);
            class138.method2441(var29, var31, field1969[3], var26, var28, field1968[3], var41);
        } else {
            class138.method2437(var29, var30, var31, var26, var27, var28, field1970[0], field1970[1], field1970[2]);
            class138.method2437(var29, var31, field1969[3], var26, var28, field1968[3], field1970[0], field1970[2], field1970[3]);
        }
    }
}

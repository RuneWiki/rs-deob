package deob;

@ObfuscatedName("eh")
public class class140 extends class69 {

    @ObfuscatedName("eh.i")
    public class126 field1937 = new class126(128);

    @ObfuscatedName("eh.e")
    public int field1925 = 256;

    @ObfuscatedName("eh.f")
    public int field1926 = 1000000;

    @ObfuscatedName("eh.k")
    public int[] field1927 = new int[16];

    @ObfuscatedName("eh.g")
    public int[] field1928 = new int[16];

    @ObfuscatedName("eh.n")
    public int[] field1929 = new int[16];

    @ObfuscatedName("eh.a")
    public int[] field1950 = new int[16];

    @ObfuscatedName("eh.q")
    public int[] field1943 = new int[16];

    @ObfuscatedName("eh.v")
    public int[] field1931 = new int[16];

    @ObfuscatedName("eh.h")
    public int[] field1933 = new int[16];

    @ObfuscatedName("eh.p")
    public int[] field1952 = new int[16];

    @ObfuscatedName("eh.l")
    public int[] field1935 = new int[16];

    @ObfuscatedName("eh.d")
    public int[] field1936 = new int[16];

    @ObfuscatedName("eh.y")
    public int[] field1938 = new int[16];

    @ObfuscatedName("eh.s")
    public int[] field1924 = new int[16];

    @ObfuscatedName("eh.t")
    public int[] field1939 = new int[16];

    @ObfuscatedName("eh.z")
    public int[] field1940 = new int[16];

    @ObfuscatedName("eh.b")
    public int[] field1941 = new int[16];

    @ObfuscatedName("eh.o")
    public class141[][] field1944 = new class141[16][128];

    @ObfuscatedName("eh.ak")
    public class141[][] field1942 = new class141[16][128];

    @ObfuscatedName("eh.ai")
    public class142 field1932 = new class142();

    @ObfuscatedName("eh.aq")
    public boolean field1945;

    @ObfuscatedName("eh.an")
    public int field1946;

    @ObfuscatedName("eh.ay")
    public int field1947;

    @ObfuscatedName("eh.ap")
    public long field1948;

    @ObfuscatedName("eh.aj")
    public long field1949;

    @ObfuscatedName("eh.aw")
    public class144 field1930 = new class144(this);

    public class140() {
        this.method2406();
    }

    @ObfuscatedName("eh.i(II)V")
    public synchronized void method2319(int arg0) {
        this.field1925 = arg0;
    }

    @ObfuscatedName("eh.e(B)I")
    public int method2403() {
        return this.field1925;
    }

    @ObfuscatedName("eh.f(Lee;Lgq;Lbm;II)Z")
    public synchronized boolean method2312(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2490();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2011.method2163(); var7 != null; var7 = (class135) arg0.field2011.method2171()) {
            int var8 = (int) var7.field1879;
            class143 var9 = (class143) this.field1937.method2161((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3019(var8);
                class143 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class143(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field1937.method2162(var11, (long) var8);
            }
            if (!var9.method2473(arg2, var7.field1893, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2491();
        }
        return var5;
    }

    @ObfuscatedName("eh.k(B)V")
    public synchronized void method2317() {
        for (class143 var1 = (class143) this.field1937.method2163(); var1 != null; var1 = (class143) this.field1937.method2171()) {
            var1.method2472();
        }
    }

    @ObfuscatedName("eh.a(B)V")
    public synchronized void method2314() {
        for (class143 var1 = (class143) this.field1937.method2163(); var1 != null; var1 = (class143) this.field1937.method2171()) {
            var1.method2200();
        }
    }

    @ObfuscatedName("eh.p(Lee;ZI)V")
    public synchronized void method2340(class145 arg0, boolean arg1) {
        this.method2315();
        this.field1932.method2430(arg0.field2010);
        this.field1945 = arg1;
        this.field1948 = 0L;
        int var3 = this.field1932.method2433();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1932.method2434(var4);
            this.field1932.method2463(var4);
            this.field1932.method2435(var4);
        }
        this.field1946 = this.field1932.method2441();
        this.field1947 = this.field1932.field1981[this.field1946];
        this.field1949 = this.field1932.method2464(this.field1947);
    }

    @ObfuscatedName("eh.c(I)V")
    public synchronized void method2315() {
        this.field1932.method2431();
        this.method2406();
    }

    @ObfuscatedName("eh.m(I)Z")
    public synchronized boolean method2310() {
        return this.field1932.method2447();
    }

    @ObfuscatedName("eh.r(III)V")
    public synchronized void method2341(int arg0, int arg1) {
        this.method2318(arg0, arg1);
    }

    @ObfuscatedName("eh.u(III)V")
    public void method2318(int arg0, int arg1) {
        this.field1950[arg0] = arg1;
        this.field1931[arg0] = arg1 & 0xFFFFFF80;
        this.method2375(arg0, arg1);
    }

    @ObfuscatedName("eh.j(III)V")
    public void method2375(int arg0, int arg1) {
        if (this.field1943[arg0] != arg1) {
            this.field1943[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1942[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eh.x(IIII)V")
    public void method2396(int arg0, int arg1, int arg2) {
        this.method2321(arg0, arg1, 64);
        if ((this.field1936[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1930.field2006.method2210(); var4 != null; var4 = (class141) this.field1930.field2006.method2212()) {
                if (var4.field1964 == arg0 && var4.field1967 < 0) {
                    this.field1944[arg0][var4.field1958] = null;
                    this.field1944[arg0][arg1] = var4;
                    int var5 = (var4.field1962 * var4.field1955 >> 12) + var4.field1961;
                    var4.field1961 += arg1 - var4.field1958 << 8;
                    var4.field1962 = var5 - var4.field1961;
                    var4.field1955 = 4096;
                    var4.field1958 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1937.method2161((long) this.field1943[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field1998[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1964 = arg0;
        var8.field1954 = var6;
        var8.field1969 = var7;
        var8.field1956 = var6.field2000[arg1];
        var8.field1957 = var6.field1996[arg1];
        var8.field1958 = arg1;
        var8.field1976 = var6.field1999 * arg2 * arg2 * var6.field1994[arg1] + 1024 >> 11;
        var8.field1953 = var6.field1995[arg1] & 0xFF;
        var8.field1961 = (arg1 << 8) - (var6.field1992[arg1] & 0x7FFF);
        var8.field1971 = 0;
        var8.field1965 = 0;
        var8.field1966 = 0;
        var8.field1967 = -1;
        var8.field1974 = 0;
        if (this.field1939[arg0] == 0) {
            var8.field1963 = class67.method1123(var7, this.method2395(var8), this.method2332(var8), this.method2333(var8));
        } else {
            var8.field1963 = class67.method1123(var7, this.method2395(var8), 0, this.method2333(var8));
            this.method2320(var8, var6.field1992[arg1] < 0);
        }
        if (var6.field1992[arg1] < 0) {
            var8.field1963.method1125(-1);
        }
        if (var8.field1957 >= 0) {
            class141 var9 = this.field1942[arg0][var8.field1957];
            if (var9 != null && var9.field1967 < 0) {
                this.field1944[arg0][var9.field1958] = null;
                var9.field1967 = 0;
            }
            this.field1942[arg0][var8.field1957] = var8;
        }
        this.field1930.field2006.method2226(var8);
        this.field1944[arg0][arg1] = var8;
    }

    @ObfuscatedName("eh.d(Lef;ZB)V")
    public void method2320(class141 arg0, boolean arg1) {
        int var3 = arg0.field1969.field1023.length;
        int var5;
        if (arg1 && arg0.field1969.field1025) {
            int var4 = var3 + var3 - arg0.field1969.field1024;
            var5 = (int) ((long) this.field1939[arg0.field1964] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1963.method1227(true);
            }
        } else {
            var5 = (int) ((long) this.field1939[arg0.field1964] * (long) var3 >> 6);
        }
        arg0.field1963.method1131(var5);
    }

    @ObfuscatedName("eh.y(IIII)V")
    public void method2321(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1944[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1944[arg0][arg1] = null;
        if ((this.field1936[arg0] & 0x2) == 0) {
            var4.field1967 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1930.field2006.method2209(); var5 != null; var5 = (class141) this.field1930.field2006.method2211()) {
            if (var4.field1964 == var5.field1964 && var5.field1967 < 0 && var4 != var5) {
                var4.field1967 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("eh.aj(IIII)V")
    public void method2322(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eh.aw(III)V")
    public void method2323(int arg0, int arg1) {
    }

    @ObfuscatedName("eh.am(III)V")
    public void method2400(int arg0, int arg1) {
        this.field1933[arg0] = arg1;
    }

    @ObfuscatedName("eh.av(IS)V")
    public void method2313(int arg0) {
        for (class141 var2 = (class141) this.field1930.field2006.method2209(); var2 != null; var2 = (class141) this.field1930.field2006.method2211()) {
            if (arg0 < 0 || var2.field1964 == arg0) {
                if (var2.field1963 != null) {
                    var2.field1963.method1136(Statics.field1054 / 100);
                    if (var2.field1963.method1221()) {
                        this.field1930.field2005.method865(var2.field1963);
                    }
                    var2.method2424();
                }
                if (var2.field1967 < 0) {
                    this.field1944[var2.field1964][var2.field1958] = null;
                }
                var2.method2200();
            }
        }
    }

    @ObfuscatedName("eh.aa(IB)V")
    public void method2325(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2325(var2);
            }
            return;
        }
        this.field1927[arg0] = 12800;
        this.field1928[arg0] = 8192;
        this.field1929[arg0] = 16383;
        this.field1933[arg0] = 8192;
        this.field1952[arg0] = 0;
        this.field1935[arg0] = 8192;
        this.method2327(arg0);
        this.method2328(arg0);
        this.field1936[arg0] = 0;
        this.field1938[arg0] = 32767;
        this.field1924[arg0] = 256;
        this.field1939[arg0] = 0;
        this.method2330(arg0, 8192);
    }

    @ObfuscatedName("eh.ad(II)V")
    public void method2373(int arg0) {
        for (class141 var2 = (class141) this.field1930.field2006.method2209(); var2 != null; var2 = (class141) this.field1930.field2006.method2211()) {
            if ((arg0 < 0 || var2.field1964 == arg0) && var2.field1967 < 0) {
                this.field1944[var2.field1964][var2.field1958] = null;
                var2.field1967 = 0;
            }
        }
    }

    @ObfuscatedName("eh.ab(I)V")
    public void method2406() {
        this.method2313(-1);
        this.method2325(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1943[var1] = this.field1950[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1931[var2] = this.field1950[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eh.al(II)V")
    public void method2327(int arg0) {
        if ((this.field1936[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1930.field2006.method2209(); var2 != null; var2 = (class141) this.field1930.field2006.method2211()) {
            if (var2.field1964 == arg0 && this.field1944[arg0][var2.field1958] == null && var2.field1967 < 0) {
                var2.field1967 = 0;
            }
        }
    }

    @ObfuscatedName("eh.ar(II)V")
    public void method2328(int arg0) {
        if ((this.field1936[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1930.field2006.method2209(); var2 != null; var2 = (class141) this.field1930.field2006.method2211()) {
            if (var2.field1964 == arg0) {
                var2.field1973 = 0;
            }
        }
    }

    @ObfuscatedName("eh.at(II)V")
    public void method2329(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2321(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2396(var6, var7, var8);
            } else {
                this.method2321(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2322(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1931[var12] = (var14 << 14) + (this.field1931[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1931[var12] = (var14 << 7) + (this.field1931[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1952[var12] = (var14 << 7) + (this.field1952[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1952[var12] = (this.field1952[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1935[var12] = (var14 << 7) + (this.field1935[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1935[var12] = (this.field1935[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1927[var12] = (var14 << 7) + (this.field1927[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1927[var12] = (this.field1927[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1928[var12] = (var14 << 7) + (this.field1928[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1928[var12] = (this.field1928[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1929[var12] = (var14 << 7) + (this.field1929[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1929[var12] = (this.field1929[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1936[var12] |= 0x1;
                } else {
                    this.field1936[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1936[var12] |= 0x2;
                } else {
                    this.method2327(var12);
                    this.field1936[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1938[var12] = (var14 << 7) + (this.field1938[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1938[var12] = (this.field1938[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1938[var12] = (var14 << 7) + (this.field1938[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1938[var12] = (this.field1938[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2313(var12);
            }
            if (var13 == 121) {
                this.method2325(var12);
            }
            if (var13 == 123) {
                this.method2373(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1938[var12];
                if (var15 == 16384) {
                    this.field1924[var12] = (var14 << 7) + (this.field1924[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1938[var12];
                if (var16 == 16384) {
                    this.field1924[var12] = (this.field1924[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1939[var12] = (var14 << 7) + (this.field1939[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1939[var12] = (this.field1939[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1936[var12] |= 0x4;
                } else {
                    this.method2328(var12);
                    this.field1936[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2330(var12, (var14 << 7) + (this.field1940[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2330(var12, (this.field1940[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2375(var17, this.field1931[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2323(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2400(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2406();
            }
        }
    }

    @ObfuscatedName("eh.ax(III)V")
    public void method2330(int arg0, int arg1) {
        this.field1940[arg0] = arg1;
        this.field1941[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eh.ao(Lef;I)I")
    public int method2395(class141 arg0) {
        int var2 = (arg0.field1962 * arg0.field1955 >> 12) + arg0.field1961;
        int var3 = ((this.field1933[arg0.field1964] - 8192) * this.field1924[arg0.field1964] >> 12) + var2;
        class138 var4 = arg0.field1956;
        if (var4.field1910 > 0 && (var4.field1904 > 0 || this.field1952[arg0.field1964] > 0)) {
            int var5 = var4.field1904 << 2;
            int var6 = var4.field1906 << 1;
            if (arg0.field1960 < var6) {
                var5 = arg0.field1960 * var5 / var6;
            }
            int var7 = (this.field1952[arg0.field1964] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1970 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1969.field1027 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1054 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eh.ah(Lef;I)I")
    public int method2332(class141 arg0) {
        class138 var2 = arg0.field1956;
        int var3 = this.field1929[arg0.field1964] * this.field1927[arg0.field1964] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1976 * var4 + 16384 >> 15;
        int var6 = this.field1925 * var5 + 128 >> 8;
        if (var2.field1900 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1971 * 1.953125E-5D * (double) var2.field1900) + 0.5D);
        }
        if (var2.field1902 != null) {
            int var7 = arg0.field1965;
            int var8 = var2.field1902[arg0.field1966 + 1];
            if (arg0.field1966 < var2.field1902.length - 2) {
                int var9 = (var2.field1902[arg0.field1966] & 0xFF) << 8;
                int var10 = (var2.field1902[arg0.field1966 + 2] & 0xFF) << 8;
                var8 += (var2.field1902[arg0.field1966 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1967 > 0 && var2.field1899 != null) {
            int var11 = arg0.field1967;
            int var12 = var2.field1899[arg0.field1974 + 1];
            if (arg0.field1974 < var2.field1899.length - 2) {
                int var13 = (var2.field1899[arg0.field1974] & 0xFF) << 8;
                int var14 = (var2.field1899[arg0.field1974 + 2] & 0xFF) << 8;
                var12 += (var2.field1899[arg0.field1974 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eh.ac(Lef;B)I")
    public int method2333(class141 arg0) {
        int var2 = this.field1928[arg0.field1964];
        return var2 < 8192 ? arg0.field1953 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1953) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eh.q()Lbg;")
    public synchronized class69 method868() {
        return this.field1930;
    }

    @ObfuscatedName("eh.w()Lbg;")
    public synchronized class69 method871() {
        return null;
    }

    @ObfuscatedName("eh.v()I")
    public synchronized int method872() {
        return 0;
    }

    @ObfuscatedName("eh.h([III)V")
    public synchronized void method873(int[] arg0, int arg1, int arg2) {
        if (this.field1932.method2447()) {
            int var4 = this.field1926 * this.field1932.field1978 / Statics.field1054;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1948;
                if (this.field1949 - var5 >= 0L) {
                    this.field1948 = var5;
                    break;
                }
                int var7 = (int) ((this.field1949 - this.field1948 + (long) var4 - 1L) / (long) var4);
                this.field1948 += (long) var4 * (long) var7;
                this.field1930.method873(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2337();
            } while (this.field1932.method2447());
        }
        this.field1930.method873(arg0, arg1, arg2);
    }

    @ObfuscatedName("eh.l(I)V")
    public synchronized void method875(int arg0) {
        if (this.field1932.method2447()) {
            int var2 = this.field1926 * this.field1932.field1978 / Statics.field1054;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1948;
                if (this.field1949 - var3 >= 0L) {
                    this.field1948 = var3;
                    break;
                }
                int var5 = (int) ((this.field1949 - this.field1948 + (long) var2 - 1L) / (long) var2);
                this.field1948 += (long) var2 * (long) var5;
                this.field1930.method875(var5);
                arg0 -= var5;
                this.method2337();
            } while (this.field1932.method2447());
        }
        this.field1930.method875(arg0);
    }

    @ObfuscatedName("eh.ae(I)V")
    public void method2337() {
        int var1 = this.field1946;
        int var2 = this.field1947;
        long var3 = this.field1949;
        while (this.field1947 == var2) {
            while (this.field1932.field1981[var1] == var2) {
                this.field1932.method2434(var1);
                int var5 = this.field1932.method2437(var1);
                if (var5 == 1) {
                    this.field1932.method2429();
                    this.field1932.method2435(var1);
                    if (this.field1932.method2442()) {
                        if (!this.field1945 || var2 == 0) {
                            this.method2406();
                            this.field1932.method2431();
                            return;
                        }
                        this.field1932.method2443(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2329(var5);
                }
                this.field1932.method2463(var1);
                this.field1932.method2435(var1);
            }
            var1 = this.field1932.method2441();
            var2 = this.field1932.field1981[var1];
            var3 = this.field1932.method2464(var2);
        }
        this.field1946 = var1;
        this.field1947 = var2;
        this.field1949 = var3;
    }

    @ObfuscatedName("eh.au(Lef;S)Z")
    public boolean method2338(class141 arg0) {
        if (arg0.field1963 != null) {
            return false;
        }
        if (arg0.field1967 >= 0) {
            arg0.method2200();
            if (arg0.field1957 > 0 && this.field1942[arg0.field1964][arg0.field1957] == arg0) {
                this.field1942[arg0.field1964][arg0.field1957] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eh.ag(Lef;[IIII)Z")
    public boolean method2339(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1972 = Statics.field1054 / 100;
        if (arg0.field1967 >= 0 && arg0.field1963 == null || arg0.field1963.method1138()) {
            arg0.method2424();
            arg0.method2200();
            if (arg0.field1957 > 0 && this.field1942[arg0.field1964][arg0.field1957] == arg0) {
                this.field1942[arg0.field1964][arg0.field1957] = null;
            }
            return true;
        }
        int var5 = arg0.field1955;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1935[arg0.field1964] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1955 = var6;
        }
        arg0.field1963.method1137(this.method2395(arg0));
        class138 var7 = arg0.field1956;
        boolean var8 = false;
        arg0.field1960++;
        arg0.field1970 += var7.field1910;
        double var9 = (double) ((arg0.field1958 - 60 << 8) + (arg0.field1962 * arg0.field1955 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1900 > 0) {
            if (var7.field1903 > 0) {
                arg0.field1971 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1903 * var9) + 0.5D);
            } else {
                arg0.field1971 += 128;
            }
        }
        if (var7.field1902 != null) {
            if (var7.field1901 > 0) {
                arg0.field1965 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1901 * var9) + 0.5D);
            } else {
                arg0.field1965 += 128;
            }
            while (arg0.field1966 < var7.field1902.length - 2 && arg0.field1965 > (var7.field1902[arg0.field1966 + 2] & 0xFF) << 8) {
                arg0.field1966 += 2;
            }
            if (arg0.field1966 == var7.field1902.length - 2 && var7.field1902[arg0.field1966 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1967 >= 0 && var7.field1899 != null && (this.field1936[arg0.field1964] & 0x1) == 0 && (arg0.field1957 < 0 || this.field1942[arg0.field1964][arg0.field1957] != arg0)) {
            if (var7.field1908 > 0) {
                arg0.field1967 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1908 * var9) + 0.5D);
            } else {
                arg0.field1967 += 128;
            }
            while (arg0.field1974 < var7.field1899.length - 2 && arg0.field1967 > (var7.field1899[arg0.field1974 + 2] & 0xFF) << 8) {
                arg0.field1974 += 2;
            }
            if (arg0.field1974 == var7.field1899.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1963.method1135(arg0.field1972, this.method2332(arg0), this.method2333(arg0));
            return false;
        }
        arg0.field1963.method1136(arg0.field1972);
        if (arg1 == null) {
            arg0.field1963.method875(arg3);
        } else {
            arg0.field1963.method873(arg1, arg2, arg3);
        }
        if (arg0.field1963.method1221()) {
            this.field1930.field2005.method865(arg0.field1963);
        }
        arg0.method2424();
        if (arg0.field1967 >= 0) {
            arg0.method2200();
            if (arg0.field1957 > 0 && this.field1942[arg0.field1964][arg0.field1957] == arg0) {
                this.field1942[arg0.field1964][arg0.field1957] = null;
            }
        }
        return true;
    }
}

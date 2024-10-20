package deob;

@ObfuscatedName("em")
public class class140 extends class69 {

    @ObfuscatedName("em.x")
    public class126 field1941 = new class126(128);

    @ObfuscatedName("em.j")
    public int field1928 = 256;

    @ObfuscatedName("em.c")
    public int field1929 = 1000000;

    @ObfuscatedName("em.d")
    public int[] field1950 = new int[16];

    @ObfuscatedName("em.h")
    public int[] field1931 = new int[16];

    @ObfuscatedName("em.u")
    public int[] field1932 = new int[16];

    @ObfuscatedName("em.k")
    public int[] field1933 = new int[16];

    @ObfuscatedName("em.g")
    public int[] field1934 = new int[16];

    @ObfuscatedName("em.y")
    public int[] field1954 = new int[16];

    @ObfuscatedName("em.e")
    public int[] field1936 = new int[16];

    @ObfuscatedName("em.q")
    public int[] field1937 = new int[16];

    @ObfuscatedName("em.v")
    public int[] field1951 = new int[16];

    @ObfuscatedName("em.b")
    public int[] field1939 = new int[16];

    @ObfuscatedName("em.t")
    public int[] field1956 = new int[16];

    @ObfuscatedName("em.z")
    public int[] field1938 = new int[16];

    @ObfuscatedName("em.p")
    public int[] field1942 = new int[16];

    @ObfuscatedName("em.n")
    public int[] field1940 = new int[16];

    @ObfuscatedName("em.a")
    public int[] field1944 = new int[16];

    @ObfuscatedName("em.o")
    public class141[][] field1930 = new class141[16][128];

    @ObfuscatedName("em.an")
    public class141[][] field1946 = new class141[16][128];

    @ObfuscatedName("em.ar")
    public class142 field1947 = new class142();

    @ObfuscatedName("em.aa")
    public boolean field1935;

    @ObfuscatedName("em.af")
    public int field1949;

    @ObfuscatedName("em.ax")
    public int field1952;

    @ObfuscatedName("em.ah")
    public long field1948;

    @ObfuscatedName("em.az")
    public long field1945;

    @ObfuscatedName("em.at")
    public class144 field1953 = new class144(this);

    public class140() {
        this.method2391();
    }

    @ObfuscatedName("em.x(II)V")
    public synchronized void method2403(int arg0) {
        this.field1928 = arg0;
    }

    @ObfuscatedName("em.j(I)I")
    public int method2373() {
        return this.field1928;
    }

    @ObfuscatedName("em.c(Led;Lgk;Lbe;II)Z")
    public synchronized boolean method2431(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2557();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2012.method2233(); var7 != null; var7 = (class135) arg0.field2012.method2234()) {
            int var8 = (int) var7.field1885;
            class143 var9 = (class143) this.field1941.method2247((long) var8);
            if (var9 == null) {
                var9 = class143.method1606(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field1941.method2245(var9, (long) var8);
            }
            if (!var9.method2532(arg2, var7.field1899, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2560();
        }
        return var5;
    }

    @ObfuscatedName("em.d(B)V")
    public synchronized void method2375() {
        for (class143 var1 = (class143) this.field1941.method2233(); var1 != null; var1 = (class143) this.field1941.method2234()) {
            var1.method2533();
        }
    }

    @ObfuscatedName("em.w(I)V")
    public synchronized void method2438() {
        for (class143 var1 = (class143) this.field1941.method2233(); var1 != null; var1 = (class143) this.field1941.method2234()) {
            var1.method2278();
        }
    }

    @ObfuscatedName("em.v(Led;ZI)V")
    public synchronized void method2392(class145 arg0, boolean arg1) {
        this.method2378();
        this.field1947.method2487(arg0.field2013);
        this.field1935 = arg1;
        this.field1948 = 0L;
        int var3 = this.field1947.method2525();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1947.method2491(var4);
            this.field1947.method2489(var4);
            this.field1947.method2492(var4);
        }
        this.field1949 = this.field1947.method2499();
        this.field1952 = this.field1947.field1987[this.field1949];
        this.field1945 = this.field1947.method2498(this.field1952);
    }

    @ObfuscatedName("em.s(I)V")
    public synchronized void method2378() {
        this.field1947.method2488();
        this.method2391();
    }

    @ObfuscatedName("em.r(B)Z")
    public synchronized boolean method2379() {
        return this.field1947.method2516();
    }

    @ObfuscatedName("em.m(III)V")
    public synchronized void method2380(int arg0, int arg1) {
        this.method2464(arg0, arg1);
    }

    @ObfuscatedName("em.i(III)V")
    public void method2464(int arg0, int arg1) {
        this.field1933[arg0] = arg1;
        this.field1954[arg0] = arg1 & 0xFFFFFF80;
        this.method2382(arg0, arg1);
    }

    @ObfuscatedName("em.f(III)V")
    public void method2382(int arg0, int arg1) {
        if (this.field1934[arg0] != arg1) {
            this.field1934[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1946[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("em.b(IIII)V")
    public void method2452(int arg0, int arg1, int arg2) {
        this.method2385(arg0, arg1, 64);
        if ((this.field1939[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1953.field2009.method2291(); var4 != null; var4 = (class141) this.field1953.field2009.method2293()) {
                if (var4.field1958 == arg0 && var4.field1971 < 0) {
                    this.field1930[arg0][var4.field1962] = null;
                    this.field1930[arg0][arg1] = var4;
                    int var5 = (var4.field1967 * var4.field1960 >> 12) + var4.field1965;
                    var4.field1965 += arg1 - var4.field1962 << 8;
                    var4.field1960 = var5 - var4.field1965;
                    var4.field1967 = 4096;
                    var4.field1962 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1941.method2247((long) this.field1934[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2004[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1958 = arg0;
        var8.field1972 = var6;
        var8.field1959 = var7;
        var8.field1964 = var6.field1998[arg1];
        var8.field1961 = var6.field2003[arg1];
        var8.field1962 = arg1;
        var8.field1963 = var6.field2002 * arg2 * arg2 * var6.field2006[arg1] + 1024 >> 11;
        var8.field1980 = var6.field2001[arg1] & 0xFF;
        var8.field1965 = (arg1 << 8) - (var6.field1997[arg1] & 0x7FFF);
        var8.field1968 = 0;
        var8.field1969 = 0;
        var8.field1977 = 0;
        var8.field1971 = -1;
        var8.field1974 = 0;
        if (this.field1942[arg0] == 0) {
            var8.field1975 = class67.method1204(var7, this.method2381(var8), this.method2396(var8), this.method2458(var8));
        } else {
            var8.field1975 = class67.method1204(var7, this.method2381(var8), 0, this.method2458(var8));
            this.method2420(var8, var6.field1997[arg1] < 0);
        }
        if (var6.field1997[arg1] < 0) {
            var8.field1975.method1279(-1);
        }
        if (var8.field1961 >= 0) {
            class141 var9 = this.field1946[arg0][var8.field1961];
            if (var9 != null && var9.field1971 < 0) {
                this.field1930[arg0][var9.field1962] = null;
                var9.field1971 = 0;
            }
            this.field1946[arg0][var8.field1961] = var8;
        }
        this.field1953.field2009.method2300(var8);
        this.field1930[arg0][arg1] = var8;
    }

    @ObfuscatedName("em.t(Lee;ZI)V")
    public void method2420(class141 arg0, boolean arg1) {
        int var3 = arg0.field1959.field1036.length;
        int var5;
        if (arg1 && arg0.field1959.field1035) {
            int var4 = var3 + var3 - arg0.field1959.field1034;
            var5 = (int) ((long) this.field1942[arg0.field1958] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1975.method1207(true);
            }
        } else {
            var5 = (int) ((long) this.field1942[arg0.field1958] * (long) var3 >> 6);
        }
        arg0.field1975.method1212(var5);
    }

    @ObfuscatedName("em.z(IIII)V")
    public void method2385(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1930[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1930[arg0][arg1] = null;
        if ((this.field1939[arg0] & 0x2) == 0) {
            var4.field1971 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1953.field2009.method2290(); var5 != null; var5 = (class141) this.field1953.field2009.method2287()) {
            if (var4.field1958 == var5.field1958 && var5.field1971 < 0 && var4 != var5) {
                var4.field1971 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("em.p(IIIB)V")
    public void method2374(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("em.n(IIB)V")
    public void method2397(int arg0, int arg1) {
    }

    @ObfuscatedName("em.a(IIB)V")
    public void method2478(int arg0, int arg1) {
        this.field1936[arg0] = arg1;
    }

    @ObfuscatedName("em.o(II)V")
    public void method2432(int arg0) {
        for (class141 var2 = (class141) this.field1953.field2009.method2290(); var2 != null; var2 = (class141) this.field1953.field2009.method2287()) {
            if (arg0 < 0 || var2.field1958 == arg0) {
                if (var2.field1975 != null) {
                    var2.field1975.method1217(Statics.field2034 / 100);
                    if (var2.field1975.method1221()) {
                        this.field1953.field2008.method973(var2.field1975);
                    }
                    var2.method2481();
                }
                if (var2.field1971 < 0) {
                    this.field1930[var2.field1958][var2.field1962] = null;
                }
                var2.method2278();
            }
        }
    }

    @ObfuscatedName("em.an(II)V")
    public void method2389(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2389(var2);
            }
            return;
        }
        this.field1950[arg0] = 12800;
        this.field1931[arg0] = 8192;
        this.field1932[arg0] = 16383;
        this.field1936[arg0] = 8192;
        this.field1937[arg0] = 0;
        this.field1951[arg0] = 8192;
        this.method2428(arg0);
        this.method2387(arg0);
        this.field1939[arg0] = 0;
        this.field1956[arg0] = 32767;
        this.field1938[arg0] = 256;
        this.field1942[arg0] = 0;
        this.method2395(arg0, 8192);
    }

    @ObfuscatedName("em.ar(II)V")
    public void method2390(int arg0) {
        for (class141 var2 = (class141) this.field1953.field2009.method2290(); var2 != null; var2 = (class141) this.field1953.field2009.method2287()) {
            if ((arg0 < 0 || var2.field1958 == arg0) && var2.field1971 < 0) {
                this.field1930[var2.field1958][var2.field1962] = null;
                var2.field1971 = 0;
            }
        }
    }

    @ObfuscatedName("em.aa(I)V")
    public void method2391() {
        this.method2432(-1);
        this.method2389(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1934[var1] = this.field1933[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1954[var2] = this.field1933[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("em.ay(IS)V")
    public void method2428(int arg0) {
        if ((this.field1939[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1953.field2009.method2290(); var2 != null; var2 = (class141) this.field1953.field2009.method2287()) {
            if (var2.field1958 == arg0 && this.field1930[arg0][var2.field1962] == null && var2.field1971 < 0) {
                var2.field1971 = 0;
            }
        }
    }

    @ObfuscatedName("em.aq(II)V")
    public void method2387(int arg0) {
        if ((this.field1939[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1953.field2009.method2290(); var2 != null; var2 = (class141) this.field1953.field2009.method2287()) {
            if (var2.field1958 == arg0) {
                var2.field1970 = 0;
            }
        }
    }

    @ObfuscatedName("em.aj(IB)V")
    public void method2394(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2385(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2452(var6, var7, var8);
            } else {
                this.method2385(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2374(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1954[var12] = (var14 << 14) + (this.field1954[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1954[var12] = (var14 << 7) + (this.field1954[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1937[var12] = (var14 << 7) + (this.field1937[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1937[var12] = (this.field1937[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1951[var12] = (var14 << 7) + (this.field1951[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1951[var12] = (this.field1951[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1950[var12] = (var14 << 7) + (this.field1950[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1950[var12] = (this.field1950[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1931[var12] = (var14 << 7) + (this.field1931[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1931[var12] = (this.field1931[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1932[var12] = (var14 << 7) + (this.field1932[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1932[var12] = (this.field1932[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1939[var12] |= 0x1;
                } else {
                    this.field1939[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1939[var12] |= 0x2;
                } else {
                    this.method2428(var12);
                    this.field1939[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1956[var12] = (var14 << 7) + (this.field1956[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1956[var12] = (this.field1956[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1956[var12] = (var14 << 7) + (this.field1956[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1956[var12] = (this.field1956[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2432(var12);
            }
            if (var13 == 121) {
                this.method2389(var12);
            }
            if (var13 == 123) {
                this.method2390(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1956[var12];
                if (var15 == 16384) {
                    this.field1938[var12] = (var14 << 7) + (this.field1938[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1956[var12];
                if (var16 == 16384) {
                    this.field1938[var12] = (this.field1938[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1942[var12] = (var14 << 7) + (this.field1942[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1942[var12] = (this.field1942[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1939[var12] |= 0x4;
                } else {
                    this.method2387(var12);
                    this.field1939[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2395(var12, (var14 << 7) + (this.field1940[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2395(var12, (this.field1940[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2382(var17, this.field1954[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2397(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2478(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2391();
            }
        }
    }

    @ObfuscatedName("em.ac(IIB)V")
    public void method2395(int arg0, int arg1) {
        this.field1940[arg0] = arg1;
        this.field1944[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("em.av(Lee;I)I")
    public int method2381(class141 arg0) {
        int var2 = (arg0.field1967 * arg0.field1960 >> 12) + arg0.field1965;
        int var3 = ((this.field1936[arg0.field1958] - 8192) * this.field1938[arg0.field1958] >> 12) + var2;
        class138 var4 = arg0.field1964;
        if (var4.field1912 > 0 && (var4.field1910 > 0 || this.field1937[arg0.field1958] > 0)) {
            int var5 = var4.field1910 << 2;
            int var6 = var4.field1907 << 1;
            if (arg0.field1973 < var6) {
                var5 = arg0.field1973 * var5 / var6;
            }
            int var7 = (this.field1937[arg0.field1958] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1957 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1959.field1038 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field2034 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("em.al(Lee;I)I")
    public int method2396(class141 arg0) {
        class138 var2 = arg0.field1964;
        int var3 = this.field1950[arg0.field1958] * this.field1932[arg0.field1958] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1963 * var4 + 16384 >> 15;
        int var6 = this.field1928 * var5 + 128 >> 8;
        if (var2.field1906 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1968 * 1.953125E-5D * (double) var2.field1906) + 0.5D);
        }
        if (var2.field1911 != null) {
            int var7 = arg0.field1969;
            int var8 = var2.field1911[arg0.field1977 + 1];
            if (arg0.field1977 < var2.field1911.length - 2) {
                int var9 = (var2.field1911[arg0.field1977] & 0xFF) << 8;
                int var10 = (var2.field1911[arg0.field1977 + 2] & 0xFF) << 8;
                var8 += (var2.field1911[arg0.field1977 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1971 > 0 && var2.field1905 != null) {
            int var11 = arg0.field1971;
            int var12 = var2.field1905[arg0.field1974 + 1];
            if (arg0.field1974 < var2.field1905.length - 2) {
                int var13 = (var2.field1905[arg0.field1974] & 0xFF) << 8;
                int var14 = (var2.field1905[arg0.field1974 + 2] & 0xFF) << 8;
                var12 += (var2.field1905[arg0.field1974 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("em.ag(Lee;I)I")
    public int method2458(class141 arg0) {
        int var2 = this.field1931[arg0.field1958];
        return var2 < 8192 ? arg0.field1980 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1980) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("em.u()Lbo;")
    public synchronized class69 method969() {
        return this.field1953;
    }

    @ObfuscatedName("em.y()Lbo;")
    public synchronized class69 method970() {
        return null;
    }

    @ObfuscatedName("em.e()I")
    public synchronized int method971() {
        return 0;
    }

    @ObfuscatedName("em.q([III)V")
    public synchronized void method972(int[] arg0, int arg1, int arg2) {
        if (this.field1947.method2516()) {
            int var4 = this.field1929 * this.field1947.field1993 / Statics.field2034;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1948;
                if (this.field1945 - var5 >= 0L) {
                    this.field1948 = var5;
                    break;
                }
                int var7 = (int) ((this.field1945 - this.field1948 + (long) var4 - 1L) / (long) var4);
                this.field1948 += (long) var4 * (long) var7;
                this.field1953.method972(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2399();
            } while (this.field1947.method2516());
        }
        this.field1953.method972(arg0, arg1, arg2);
    }

    @ObfuscatedName("em.l(I)V")
    public synchronized void method974(int arg0) {
        if (this.field1947.method2516()) {
            int var2 = this.field1929 * this.field1947.field1993 / Statics.field2034;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1948;
                if (this.field1945 - var3 >= 0L) {
                    this.field1948 = var3;
                    break;
                }
                int var5 = (int) ((this.field1945 - this.field1948 + (long) var2 - 1L) / (long) var2);
                this.field1948 += (long) var2 * (long) var5;
                this.field1953.method974(var5);
                arg0 -= var5;
                this.method2399();
            } while (this.field1947.method2516());
        }
        this.field1953.method974(arg0);
    }

    @ObfuscatedName("em.aw(I)V")
    public void method2399() {
        int var1 = this.field1949;
        int var2 = this.field1952;
        long var3 = this.field1945;
        while (this.field1952 == var2) {
            while (this.field1947.field1987[var1] == var2) {
                this.field1947.method2491(var1);
                int var5 = this.field1947.method2495(var1);
                if (var5 == 1) {
                    this.field1947.method2503();
                    this.field1947.method2492(var1);
                    if (this.field1947.method2501()) {
                        if (!this.field1935 || var2 == 0) {
                            this.method2391();
                            this.field1947.method2488();
                            return;
                        }
                        this.field1947.method2521(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2394(var5);
                }
                this.field1947.method2489(var1);
                this.field1947.method2492(var1);
            }
            var1 = this.field1947.method2499();
            var2 = this.field1947.field1987[var1];
            var3 = this.field1947.method2498(var2);
        }
        this.field1949 = var1;
        this.field1952 = var2;
        this.field1945 = var3;
    }

    @ObfuscatedName("em.ad(Lee;I)Z")
    public boolean method2400(class141 arg0) {
        if (arg0.field1975 != null) {
            return false;
        }
        if (arg0.field1971 >= 0) {
            arg0.method2278();
            if (arg0.field1961 > 0 && this.field1946[arg0.field1958][arg0.field1961] == arg0) {
                this.field1946[arg0.field1958][arg0.field1961] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("em.au(Lee;[IIII)Z")
    public boolean method2462(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1976 = Statics.field2034 / 100;
        if (arg0.field1971 >= 0 && arg0.field1975 == null || arg0.field1975.method1286()) {
            arg0.method2481();
            arg0.method2278();
            if (arg0.field1961 > 0 && this.field1946[arg0.field1958][arg0.field1961] == arg0) {
                this.field1946[arg0.field1958][arg0.field1961] = null;
            }
            return true;
        }
        int var5 = arg0.field1967;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1951[arg0.field1958] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1967 = var6;
        }
        arg0.field1975.method1218(this.method2381(arg0));
        class138 var7 = arg0.field1964;
        boolean var8 = false;
        arg0.field1973++;
        arg0.field1957 += var7.field1912;
        double var9 = (double) ((arg0.field1962 - 60 << 8) + (arg0.field1967 * arg0.field1960 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1906 > 0) {
            if (var7.field1909 > 0) {
                arg0.field1968 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1909 * var9) + 0.5D);
            } else {
                arg0.field1968 += 128;
            }
        }
        if (var7.field1911 != null) {
            if (var7.field1915 > 0) {
                arg0.field1969 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1915 * var9) + 0.5D);
            } else {
                arg0.field1969 += 128;
            }
            while (arg0.field1977 < var7.field1911.length - 2 && arg0.field1969 > (var7.field1911[arg0.field1977 + 2] & 0xFF) << 8) {
                arg0.field1977 += 2;
            }
            if (arg0.field1977 == var7.field1911.length - 2 && var7.field1911[arg0.field1977 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1971 >= 0 && var7.field1905 != null && (this.field1939[arg0.field1958] & 0x1) == 0 && (arg0.field1961 < 0 || this.field1946[arg0.field1958][arg0.field1961] != arg0)) {
            if (var7.field1908 > 0) {
                arg0.field1971 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1908 * var9) + 0.5D);
            } else {
                arg0.field1971 += 128;
            }
            while (arg0.field1974 < var7.field1905.length - 2 && arg0.field1971 > (var7.field1905[arg0.field1974 + 2] & 0xFF) << 8) {
                arg0.field1974 += 2;
            }
            if (arg0.field1974 == var7.field1905.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1975.method1216(arg0.field1976, this.method2396(arg0), this.method2458(arg0));
            return false;
        }
        arg0.field1975.method1217(arg0.field1976);
        if (arg1 == null) {
            arg0.field1975.method974(arg3);
        } else {
            arg0.field1975.method972(arg1, arg2, arg3);
        }
        if (arg0.field1975.method1221()) {
            this.field1953.field2008.method973(arg0.field1975);
        }
        arg0.method2481();
        if (arg0.field1971 >= 0) {
            arg0.method2278();
            if (arg0.field1961 > 0 && this.field1946[arg0.field1958][arg0.field1961] == arg0) {
                this.field1946[arg0.field1958][arg0.field1961] = null;
            }
        }
        return true;
    }
}

package deob;

@ObfuscatedName("ea")
public class class140 extends class69 {

    @ObfuscatedName("ea.o")
    public class126 field1938 = new class126(128);

    @ObfuscatedName("ea.m")
    public int field1955 = 256;

    @ObfuscatedName("ea.b")
    public int field1962 = 1000000;

    @ObfuscatedName("ea.g")
    public int[] field1940 = new int[16];

    @ObfuscatedName("ea.h")
    public int[] field1966 = new int[16];

    @ObfuscatedName("ea.v")
    public int[] field1937 = new int[16];

    @ObfuscatedName("ea.l")
    public int[] field1965 = new int[16];

    @ObfuscatedName("ea.c")
    public int[] field1944 = new int[16];

    @ObfuscatedName("ea.u")
    public int[] field1945 = new int[16];

    @ObfuscatedName("ea.k")
    public int[] field1939 = new int[16];

    @ObfuscatedName("ea.z")
    public int[] field1947 = new int[16];

    @ObfuscatedName("ea.y")
    public int[] field1961 = new int[16];

    @ObfuscatedName("ea.w")
    public int[] field1951 = new int[16];

    @ObfuscatedName("ea.n")
    public int[] field1943 = new int[16];

    @ObfuscatedName("ea.q")
    public int[] field1953 = new int[16];

    @ObfuscatedName("ea.t")
    public int[] field1954 = new int[16];

    @ObfuscatedName("ea.r")
    public int[] field1957 = new int[16];

    @ObfuscatedName("ea.a")
    public int[] field1956 = new int[16];

    @ObfuscatedName("ea.e")
    public class141[][] field1946 = new class141[16][128];

    @ObfuscatedName("ea.am")
    public class141[][] field1958 = new class141[16][128];

    @ObfuscatedName("ea.ag")
    public class142 field1959 = new class142();

    @ObfuscatedName("ea.au")
    public boolean field1960;

    @ObfuscatedName("ea.aa")
    public int field1967;

    @ObfuscatedName("ea.ae")
    public int field1948;

    @ObfuscatedName("ea.av")
    public long field1963;

    @ObfuscatedName("ea.ao")
    public long field1964;

    @ObfuscatedName("ea.ah")
    public class144 field1941 = new class144(this);

    public class140() {
        this.method2347();
    }

    @ObfuscatedName("ea.o(II)V")
    public synchronized void method2299(int arg0) {
        this.field1955 = arg0;
    }

    @ObfuscatedName("ea.m(I)I")
    public int method2300() {
        return this.field1955;
    }

    @ObfuscatedName("ea.b(Lep;Lgl;Lbe;II)Z")
    public synchronized boolean method2361(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2478();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2024.method2148(); var7 != null; var7 = (class135) arg0.field2024.method2152()) {
            int var8 = (int) var7.field1894;
            class143 var9 = (class143) this.field1938.method2151((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3017(var8);
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
                this.field1938.method2143(var11, (long) var8);
            }
            if (!var9.method2456(arg2, var7.field1910, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2479();
        }
        return var5;
    }

    @ObfuscatedName("ea.g(I)V")
    public synchronized void method2305() {
        for (class143 var1 = (class143) this.field1938.method2148(); var1 != null; var1 = (class143) this.field1938.method2152()) {
            var1.method2457();
        }
    }

    @ObfuscatedName("ea.l(I)V")
    public synchronized void method2303() {
        for (class143 var1 = (class143) this.field1938.method2148(); var1 != null; var1 = (class143) this.field1938.method2152()) {
            var1.method2189();
        }
    }

    @ObfuscatedName("ea.y(Lep;ZB)V")
    public synchronized void method2363(class145 arg0, boolean arg1) {
        this.method2333();
        this.field1959.method2420(arg0.field2023);
        this.field1960 = arg1;
        this.field1963 = 0L;
        int var3 = this.field1959.method2413();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1959.method2414(var4);
            this.field1959.method2410(var4);
            this.field1959.method2415(var4);
        }
        this.field1967 = this.field1959.method2421();
        this.field1948 = this.field1959.field1997[this.field1967];
        this.field1964 = this.field1959.method2437(this.field1948);
    }

    @ObfuscatedName("ea.f(I)V")
    public synchronized void method2333() {
        this.field1959.method2411();
        this.method2347();
    }

    @ObfuscatedName("ea.p(I)Z")
    public synchronized boolean method2306() {
        return this.field1959.method2444();
    }

    @ObfuscatedName("ea.i(III)V")
    public synchronized void method2338(int arg0, int arg1) {
        this.method2308(arg0, arg1);
    }

    @ObfuscatedName("ea.s(IIB)V")
    public void method2308(int arg0, int arg1) {
        this.field1965[arg0] = arg1;
        this.field1945[arg0] = arg1 & 0xFFFFFF80;
        this.method2309(arg0, arg1);
    }

    @ObfuscatedName("ea.x(III)V")
    public void method2309(int arg0, int arg1) {
        if (this.field1944[arg0] != arg1) {
            this.field1944[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1958[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ea.d(IIII)V")
    public void method2310(int arg0, int arg1, int arg2) {
        this.method2311(arg0, arg1, 64);
        if ((this.field1951[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1941.field2018.method2224(); var4 != null; var4 = (class141) this.field1941.field2018.method2214()) {
                if (var4.field1985 == arg0 && var4.field1979 < 0) {
                    this.field1946[arg0][var4.field1974] = null;
                    this.field1946[arg0][arg1] = var4;
                    int var5 = (var4.field1980 * var4.field1978 >> 12) + var4.field1977;
                    var4.field1977 += arg1 - var4.field1974 << 8;
                    var4.field1978 = var5 - var4.field1977;
                    var4.field1980 = 4096;
                    var4.field1974 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1938.method2151((long) this.field1944[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2008[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1985 = arg0;
        var8.field1970 = var6;
        var8.field1971 = var7;
        var8.field1972 = var6.field2007[arg1];
        var8.field1973 = var6.field2013[arg1];
        var8.field1974 = arg1;
        var8.field1986 = var6.field2012 * arg2 * arg2 * var6.field2009[arg1] + 1024 >> 11;
        var8.field1975 = var6.field2011[arg1] & 0xFF;
        var8.field1977 = (arg1 << 8) - (var6.field2014[arg1] & 0x7FFF);
        var8.field1981 = 0;
        var8.field1991 = 0;
        var8.field1982 = 0;
        var8.field1979 = -1;
        var8.field1984 = 0;
        if (this.field1954[arg0] == 0) {
            var8.field1987 = class67.method1235(var7, this.method2323(var8), this.method2324(var8), this.method2325(var8));
        } else {
            var8.field1987 = class67.method1235(var7, this.method2323(var8), 0, this.method2325(var8));
            this.method2307(var8, var6.field2014[arg1] < 0);
        }
        if (var6.field2014[arg1] < 0) {
            var8.field1987.method1210(-1);
        }
        if (var8.field1973 >= 0) {
            class141 var9 = this.field1958[arg0][var8.field1973];
            if (var9 != null && var9.field1979 < 0) {
                this.field1946[arg0][var9.field1974] = null;
                var9.field1979 = 0;
            }
            this.field1958[arg0][var8.field1973] = var8;
        }
        this.field1941.field2018.method2213(var8);
        this.field1946[arg0][arg1] = var8;
    }

    @ObfuscatedName("ea.w(Leh;ZB)V")
    public void method2307(class141 arg0, boolean arg1) {
        int var3 = arg0.field1971.field1023.length;
        int var5;
        if (arg1 && arg0.field1971.field1024) {
            int var4 = var3 + var3 - arg0.field1971.field1026;
            var5 = (int) ((long) this.field1954[arg0.field1985] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1987.method1121(true);
            }
        } else {
            var5 = (int) ((long) this.field1954[arg0.field1985] * (long) var3 >> 6);
        }
        arg0.field1987.method1130(var5);
    }

    @ObfuscatedName("ea.n(IIII)V")
    public void method2311(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1946[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1946[arg0][arg1] = null;
        if ((this.field1951[arg0] & 0x2) == 0) {
            var4.field1979 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1941.field2018.method2201(); var5 != null; var5 = (class141) this.field1941.field2018.method2203()) {
            if (var4.field1985 == var5.field1985 && var5.field1979 < 0 && var4 != var5) {
                var4.field1979 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ea.q(IIII)V")
    public void method2369(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ea.t(IIB)V")
    public void method2313(int arg0, int arg1) {
    }

    @ObfuscatedName("ea.r(III)V")
    public void method2397(int arg0, int arg1) {
        this.field1939[arg0] = arg1;
    }

    @ObfuscatedName("ea.a(II)V")
    public void method2315(int arg0) {
        for (class141 var2 = (class141) this.field1941.field2018.method2201(); var2 != null; var2 = (class141) this.field1941.field2018.method2203()) {
            if (arg0 < 0 || var2.field1985 == arg0) {
                if (var2.field1987 != null) {
                    var2.field1987.method1135(Statics.field1043 / 100);
                    if (var2.field1987.method1139()) {
                        this.field1941.field2019.method880(var2.field1987);
                    }
                    var2.method2405();
                }
                if (var2.field1979 < 0) {
                    this.field1946[var2.field1985][var2.field1974] = null;
                }
                var2.method2189();
            }
        }
    }

    @ObfuscatedName("ea.av(II)V")
    public void method2316(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2316(var2);
            }
            return;
        }
        this.field1940[arg0] = 12800;
        this.field1966[arg0] = 8192;
        this.field1937[arg0] = 16383;
        this.field1939[arg0] = 8192;
        this.field1947[arg0] = 0;
        this.field1961[arg0] = 8192;
        this.method2319(arg0);
        this.method2320(arg0);
        this.field1951[arg0] = 0;
        this.field1943[arg0] = 32767;
        this.field1953[arg0] = 256;
        this.field1954[arg0] = 0;
        this.method2322(arg0, 8192);
    }

    @ObfuscatedName("ea.ak(II)V")
    public void method2317(int arg0) {
        for (class141 var2 = (class141) this.field1941.field2018.method2201(); var2 != null; var2 = (class141) this.field1941.field2018.method2203()) {
            if ((arg0 < 0 || var2.field1985 == arg0) && var2.field1979 < 0) {
                this.field1946[var2.field1985][var2.field1974] = null;
                var2.field1979 = 0;
            }
        }
    }

    @ObfuscatedName("ea.ay(I)V")
    public void method2347() {
        this.method2315(-1);
        this.method2316(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1944[var1] = this.field1965[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1945[var2] = this.field1965[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ea.an(II)V")
    public void method2319(int arg0) {
        if ((this.field1951[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1941.field2018.method2201(); var2 != null; var2 = (class141) this.field1941.field2018.method2203()) {
            if (var2.field1985 == arg0 && this.field1946[arg0][var2.field1974] == null && var2.field1979 < 0) {
                var2.field1979 = 0;
            }
        }
    }

    @ObfuscatedName("ea.aw(II)V")
    public void method2320(int arg0) {
        if ((this.field1951[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1941.field2018.method2201(); var2 != null; var2 = (class141) this.field1941.field2018.method2203()) {
            if (var2.field1985 == arg0) {
                var2.field1990 = 0;
            }
        }
    }

    @ObfuscatedName("ea.af(IB)V")
    public void method2334(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2311(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2310(var6, var7, var8);
            } else {
                this.method2311(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2369(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1945[var12] = (var14 << 14) + (this.field1945[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1945[var12] = (var14 << 7) + (this.field1945[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1947[var12] = (var14 << 7) + (this.field1947[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1947[var12] = (this.field1947[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1961[var12] = (var14 << 7) + (this.field1961[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1961[var12] = (this.field1961[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1940[var12] = (var14 << 7) + (this.field1940[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1940[var12] = (this.field1940[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1966[var12] = (var14 << 7) + (this.field1966[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1966[var12] = (this.field1966[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1937[var12] = (var14 << 7) + (this.field1937[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1937[var12] = (this.field1937[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1951[var12] |= 0x1;
                } else {
                    this.field1951[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1951[var12] |= 0x2;
                } else {
                    this.method2319(var12);
                    this.field1951[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1943[var12] = (var14 << 7) + (this.field1943[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1943[var12] = (this.field1943[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1943[var12] = (var14 << 7) + (this.field1943[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1943[var12] = (this.field1943[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2315(var12);
            }
            if (var13 == 121) {
                this.method2316(var12);
            }
            if (var13 == 123) {
                this.method2317(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1943[var12];
                if (var15 == 16384) {
                    this.field1953[var12] = (var14 << 7) + (this.field1953[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1943[var12];
                if (var16 == 16384) {
                    this.field1953[var12] = (this.field1953[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1954[var12] = (var14 << 7) + (this.field1954[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1954[var12] = (this.field1954[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1951[var12] |= 0x4;
                } else {
                    this.method2320(var12);
                    this.field1951[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2322(var12, (var14 << 7) + (this.field1957[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2322(var12, (this.field1957[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2309(var17, this.field1945[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2313(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2397(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2347();
            }
        }
    }

    @ObfuscatedName("ea.ac(IIB)V")
    public void method2322(int arg0, int arg1) {
        this.field1957[arg0] = arg1;
        this.field1956[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ea.ar(Leh;B)I")
    public int method2323(class141 arg0) {
        int var2 = (arg0.field1980 * arg0.field1978 >> 12) + arg0.field1977;
        int var3 = ((this.field1939[arg0.field1985] - 8192) * this.field1953[arg0.field1985] >> 12) + var2;
        class138 var4 = arg0.field1972;
        if (var4.field1922 > 0 && (var4.field1921 > 0 || this.field1947[arg0.field1985] > 0)) {
            int var5 = var4.field1921 << 2;
            int var6 = var4.field1918 << 1;
            if (arg0.field1983 < var6) {
                var5 = arg0.field1983 * var5 / var6;
            }
            int var7 = (this.field1947[arg0.field1985] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1969 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1971.field1022 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1043 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ea.at(Leh;I)I")
    public int method2324(class141 arg0) {
        class138 var2 = arg0.field1972;
        int var3 = this.field1937[arg0.field1985] * this.field1940[arg0.field1985] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1986 * var4 + 16384 >> 15;
        int var6 = this.field1955 * var5 + 128 >> 8;
        if (var2.field1917 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1981 * 1.953125E-5D * (double) var2.field1917) + 0.5D);
        }
        if (var2.field1923 != null) {
            int var7 = arg0.field1991;
            int var8 = var2.field1923[arg0.field1982 + 1];
            if (arg0.field1982 < var2.field1923.length - 2) {
                int var9 = (var2.field1923[arg0.field1982] & 0xFF) << 8;
                int var10 = (var2.field1923[arg0.field1982 + 2] & 0xFF) << 8;
                var8 += (var2.field1923[arg0.field1982 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1979 > 0 && var2.field1916 != null) {
            int var11 = arg0.field1979;
            int var12 = var2.field1916[arg0.field1984 + 1];
            if (arg0.field1984 < var2.field1916.length - 2) {
                int var13 = (var2.field1916[arg0.field1984] & 0xFF) << 8;
                int var14 = (var2.field1916[arg0.field1984 + 2] & 0xFF) << 8;
                var12 += (var2.field1916[arg0.field1984 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ea.al(Leh;I)I")
    public int method2325(class141 arg0) {
        int var2 = this.field1966[arg0.field1985];
        return var2 < 8192 ? arg0.field1975 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1975) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ea.c()Lbi;")
    public synchronized class69 method882() {
        return this.field1941;
    }

    @ObfuscatedName("ea.u()Lbi;")
    public synchronized class69 method885() {
        return null;
    }

    @ObfuscatedName("ea.k()I")
    public synchronized int method886() {
        return 0;
    }

    @ObfuscatedName("ea.z([III)V")
    public synchronized void method887(int[] arg0, int arg1, int arg2) {
        if (this.field1959.method2444()) {
            int var4 = this.field1962 * this.field1959.field1994 / Statics.field1043;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1963;
                if (this.field1964 - var5 >= 0L) {
                    this.field1963 = var5;
                    break;
                }
                int var7 = (int) ((this.field1964 - this.field1963 + (long) var4 - 1L) / (long) var4);
                this.field1963 += (long) var4 * (long) var7;
                this.field1941.method887(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2330();
            } while (this.field1959.method2444());
        }
        this.field1941.method887(arg0, arg1, arg2);
    }

    @ObfuscatedName("ea.j(I)V")
    public synchronized void method889(int arg0) {
        if (this.field1959.method2444()) {
            int var2 = this.field1962 * this.field1959.field1994 / Statics.field1043;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1963;
                if (this.field1964 - var3 >= 0L) {
                    this.field1963 = var3;
                    break;
                }
                int var5 = (int) ((this.field1964 - this.field1963 + (long) var2 - 1L) / (long) var2);
                this.field1963 += (long) var2 * (long) var5;
                this.field1941.method889(var5);
                arg0 -= var5;
                this.method2330();
            } while (this.field1959.method2444());
        }
        this.field1941.method889(arg0);
    }

    @ObfuscatedName("ea.ax(I)V")
    public void method2330() {
        int var1 = this.field1967;
        int var2 = this.field1948;
        long var3 = this.field1964;
        while (this.field1948 == var2) {
            while (this.field1959.field1997[var1] == var2) {
                this.field1959.method2414(var1);
                int var5 = this.field1959.method2417(var1);
                if (var5 == 1) {
                    this.field1959.method2416();
                    this.field1959.method2415(var1);
                    if (this.field1959.method2431()) {
                        if (!this.field1960 || var2 == 0) {
                            this.method2347();
                            this.field1959.method2411();
                            return;
                        }
                        this.field1959.method2423(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2334(var5);
                }
                this.field1959.method2410(var1);
                this.field1959.method2415(var1);
            }
            var1 = this.field1959.method2421();
            var2 = this.field1959.field1997[var1];
            var3 = this.field1959.method2437(var2);
        }
        this.field1967 = var1;
        this.field1948 = var2;
        this.field1964 = var3;
    }

    @ObfuscatedName("ea.az(Leh;I)Z")
    public boolean method2331(class141 arg0) {
        if (arg0.field1987 != null) {
            return false;
        }
        if (arg0.field1979 >= 0) {
            arg0.method2189();
            if (arg0.field1973 > 0 && this.field1958[arg0.field1985][arg0.field1973] == arg0) {
                this.field1958[arg0.field1985][arg0.field1973] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ea.ai(Leh;[IIIB)Z")
    public boolean method2332(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1988 = Statics.field1043 / 100;
        if (arg0.field1979 >= 0 && arg0.field1987 == null || arg0.field1987.method1138()) {
            arg0.method2405();
            arg0.method2189();
            if (arg0.field1973 > 0 && this.field1958[arg0.field1985][arg0.field1973] == arg0) {
                this.field1958[arg0.field1985][arg0.field1973] = null;
            }
            return true;
        }
        int var5 = arg0.field1980;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1961[arg0.field1985] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1980 = var6;
        }
        arg0.field1987.method1166(this.method2323(arg0));
        class138 var7 = arg0.field1972;
        boolean var8 = false;
        arg0.field1983++;
        arg0.field1969 += var7.field1922;
        double var9 = (double) ((arg0.field1974 - 60 << 8) + (arg0.field1980 * arg0.field1978 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1917 > 0) {
            if (var7.field1915 > 0) {
                arg0.field1981 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1915 * var9) + 0.5D);
            } else {
                arg0.field1981 += 128;
            }
        }
        if (var7.field1923 != null) {
            if (var7.field1920 > 0) {
                arg0.field1991 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1920 * var9) + 0.5D);
            } else {
                arg0.field1991 += 128;
            }
            while (arg0.field1982 < var7.field1923.length - 2 && arg0.field1991 > (var7.field1923[arg0.field1982 + 2] & 0xFF) << 8) {
                arg0.field1982 += 2;
            }
            if (arg0.field1982 == var7.field1923.length - 2 && var7.field1923[arg0.field1982 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1979 >= 0 && var7.field1916 != null && (this.field1951[arg0.field1985] & 0x1) == 0 && (arg0.field1973 < 0 || this.field1958[arg0.field1985][arg0.field1973] != arg0)) {
            if (var7.field1919 > 0) {
                arg0.field1979 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1919 * var9) + 0.5D);
            } else {
                arg0.field1979 += 128;
            }
            while (arg0.field1984 < var7.field1916.length - 2 && arg0.field1979 > (var7.field1916[arg0.field1984 + 2] & 0xFF) << 8) {
                arg0.field1984 += 2;
            }
            if (arg0.field1984 == var7.field1916.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1987.method1134(arg0.field1988, this.method2324(arg0), this.method2325(arg0));
            return false;
        }
        arg0.field1987.method1135(arg0.field1988);
        if (arg1 == null) {
            arg0.field1987.method889(arg3);
        } else {
            arg0.field1987.method887(arg1, arg2, arg3);
        }
        if (arg0.field1987.method1139()) {
            this.field1941.field2019.method880(arg0.field1987);
        }
        arg0.method2405();
        if (arg0.field1979 >= 0) {
            arg0.method2189();
            if (arg0.field1973 > 0 && this.field1958[arg0.field1985][arg0.field1973] == arg0) {
                this.field1958[arg0.field1985][arg0.field1973] = null;
            }
        }
        return true;
    }
}

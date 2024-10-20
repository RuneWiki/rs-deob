package deob;

@ObfuscatedName("eq")
public class class140 extends class69 {

    @ObfuscatedName("eq.s")
    public class126 field1948 = new class126(128);

    @ObfuscatedName("eq.c")
    public int field1936 = 256;

    @ObfuscatedName("eq.f")
    public int field1937 = 1000000;

    @ObfuscatedName("eq.h")
    public int[] field1938 = new int[16];

    @ObfuscatedName("eq.a")
    public int[] field1935 = new int[16];

    @ObfuscatedName("eq.g")
    public int[] field1940 = new int[16];

    @ObfuscatedName("eq.k")
    public int[] field1956 = new int[16];

    @ObfuscatedName("eq.u")
    public int[] field1941 = new int[16];

    @ObfuscatedName("eq.b")
    public int[] field1943 = new int[16];

    @ObfuscatedName("eq.x")
    public int[] field1945 = new int[16];

    @ObfuscatedName("eq.r")
    public int[] field1942 = new int[16];

    @ObfuscatedName("eq.n")
    public int[] field1946 = new int[16];

    @ObfuscatedName("eq.e")
    public int[] field1939 = new int[16];

    @ObfuscatedName("eq.d")
    public int[] field1964 = new int[16];

    @ObfuscatedName("eq.t")
    public int[] field1962 = new int[16];

    @ObfuscatedName("eq.q")
    public int[] field1950 = new int[16];

    @ObfuscatedName("eq.y")
    public int[] field1951 = new int[16];

    @ObfuscatedName("eq.l")
    public int[] field1947 = new int[16];

    @ObfuscatedName("eq.v")
    public class141[][] field1953 = new class141[16][128];

    @ObfuscatedName("eq.az")
    public class141[][] field1954 = new class141[16][128];

    @ObfuscatedName("eq.ai")
    public class142 field1955 = new class142();

    @ObfuscatedName("eq.ad")
    public boolean field1960;

    @ObfuscatedName("eq.aa")
    public int field1957;

    @ObfuscatedName("eq.ao")
    public int field1958;

    @ObfuscatedName("eq.ax")
    public long field1959;

    @ObfuscatedName("eq.ae")
    public long field1952;

    @ObfuscatedName("eq.al")
    public class144 field1961 = new class144(this);

    public class140() {
        this.method2290();
    }

    @ObfuscatedName("eq.s(IB)V")
    public synchronized void method2373(int arg0) {
        this.field1936 = arg0;
    }

    @ObfuscatedName("eq.c(I)I")
    public int method2271() {
        return this.field1936;
    }

    @ObfuscatedName("eq.f(Leg;Lgp;Lbh;IS)Z")
    public synchronized boolean method2272(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2458();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2015.method2140(); var7 != null; var7 = (class135) arg0.field2015.method2134()) {
            int var8 = (int) var7.field1889;
            class143 var9 = (class143) this.field1948.method2131((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method2991(var8);
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
                this.field1948.method2139(var11, (long) var8);
            }
            if (!var9.method2444(arg2, var7.field1903, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2464();
        }
        return var5;
    }

    @ObfuscatedName("eq.g(I)V")
    public synchronized void method2303() {
        for (class143 var1 = (class143) this.field1948.method2140(); var1 != null; var1 = (class143) this.field1948.method2134()) {
            var1.method2445();
        }
    }

    @ObfuscatedName("eq.k(I)V")
    public synchronized void method2274() {
        for (class143 var1 = (class143) this.field1948.method2140(); var1 != null; var1 = (class143) this.field1948.method2134()) {
            var1.method2179();
        }
    }

    @ObfuscatedName("eq.n(Leg;ZI)V")
    public synchronized void method2275(class145 arg0, boolean arg1) {
        this.method2346();
        this.field1955.method2439(arg0.field2016);
        this.field1960 = arg1;
        this.field1959 = 0L;
        int var3 = this.field1955.method2397();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1955.method2399(var4);
            this.field1955.method2402(var4);
            this.field1955.method2400(var4);
        }
        this.field1957 = this.field1955.method2406();
        this.field1958 = this.field1955.field1998[this.field1957];
        this.field1952 = this.field1955.method2405(this.field1958);
    }

    @ObfuscatedName("eq.j(B)V")
    public synchronized void method2346() {
        this.field1955.method2396();
        this.method2290();
    }

    @ObfuscatedName("eq.w(I)Z")
    public synchronized boolean method2277() {
        return this.field1955.method2401();
    }

    @ObfuscatedName("eq.p(III)V")
    public synchronized void method2350(int arg0, int arg1) {
        this.method2279(arg0, arg1);
    }

    @ObfuscatedName("eq.o(III)V")
    public void method2279(int arg0, int arg1) {
        this.field1956[arg0] = arg1;
        this.field1943[arg0] = arg1 & 0xFFFFFF80;
        this.method2280(arg0, arg1);
    }

    @ObfuscatedName("eq.i(IIB)V")
    public void method2280(int arg0, int arg1) {
        if (this.field1941[arg0] != arg1) {
            this.field1941[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1954[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("eq.z(IIIS)V")
    public void method2281(int arg0, int arg1, int arg2) {
        this.method2326(arg0, arg1, 64);
        if ((this.field1939[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1961.field2013.method2188(); var4 != null; var4 = (class141) this.field1961.field2013.method2192()) {
                if (var4.field1980 == arg0 && var4.field1979 < 0) {
                    this.field1953[arg0][var4.field1970] = null;
                    this.field1953[arg0][arg1] = var4;
                    int var5 = (var4.field1974 * var4.field1968 >> 12) + var4.field1973;
                    var4.field1973 += arg1 - var4.field1970 << 8;
                    var4.field1974 = var5 - var4.field1973;
                    var4.field1968 = 4096;
                    var4.field1970 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1948.method2131((long) this.field1941[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2002[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1980 = arg0;
        var8.field1966 = var6;
        var8.field1969 = var7;
        var8.field1975 = var6.field2006[arg1];
        var8.field1983 = var6.field2001[arg1];
        var8.field1970 = arg1;
        var8.field1971 = var6.field2005 * arg2 * arg2 * var6.field2004[arg1] + 1024 >> 11;
        var8.field1972 = var6.field2007[arg1] & 0xFF;
        var8.field1973 = (arg1 << 8) - (var6.field2003[arg1] & 0x7FFF);
        var8.field1976 = 0;
        var8.field1977 = 0;
        var8.field1978 = 0;
        var8.field1979 = -1;
        var8.field1986 = 0;
        if (this.field1950[arg0] == 0) {
            var8.field1967 = class67.method1089(var7, this.method2295(var8), this.method2299(var8), this.method2297(var8));
        } else {
            var8.field1967 = class67.method1089(var7, this.method2295(var8), 0, this.method2297(var8));
            this.method2304(var8, var6.field2003[arg1] < 0);
        }
        if (var6.field2003[arg1] < 0) {
            var8.field1967.method1121(-1);
        }
        if (var8.field1983 >= 0) {
            class141 var9 = this.field1954[arg0][var8.field1983];
            if (var9 != null && var9.field1979 < 0) {
                this.field1953[arg0][var9.field1970] = null;
                var9.field1979 = 0;
            }
            this.field1954[arg0][var8.field1983] = var8;
        }
        this.field1961.field2013.method2190(var8);
        this.field1953[arg0][arg1] = var8;
    }

    @ObfuscatedName("eq.e(Lel;ZI)V")
    public void method2304(class141 arg0, boolean arg1) {
        int var3 = arg0.field1969.field1021.length;
        int var5;
        if (arg1 && arg0.field1969.field1024) {
            int var4 = var3 + var3 - arg0.field1969.field1020;
            var5 = (int) ((long) this.field1950[arg0.field1980] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1967.method1098(true);
            }
        } else {
            var5 = (int) ((long) this.field1950[arg0.field1980] * (long) var3 >> 6);
        }
        arg0.field1967.method1115(var5);
    }

    @ObfuscatedName("eq.d(IIII)V")
    public void method2326(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1953[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1953[arg0][arg1] = null;
        if ((this.field1939[arg0] & 0x2) == 0) {
            var4.field1979 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1961.field2013.method2187(); var5 != null; var5 = (class141) this.field1961.field2013.method2203()) {
            if (var4.field1980 == var5.field1980 && var5.field1979 < 0 && var4 != var5) {
                var4.field1979 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("eq.t(IIII)V")
    public void method2284(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("eq.q(III)V")
    public void method2285(int arg0, int arg1) {
    }

    @ObfuscatedName("eq.y(IIS)V")
    public void method2364(int arg0, int arg1) {
        this.field1945[arg0] = arg1;
    }

    @ObfuscatedName("eq.aw(II)V")
    public void method2287(int arg0) {
        for (class141 var2 = (class141) this.field1961.field2013.method2187(); var2 != null; var2 = (class141) this.field1961.field2013.method2203()) {
            if (arg0 < 0 || var2.field1980 == arg0) {
                if (var2.field1967 != null) {
                    var2.field1967.method1101(Statics.field1058 / 100);
                    if (var2.field1967.method1105()) {
                        this.field1961.field2011.method848(var2.field1967);
                    }
                    var2.method2386();
                }
                if (var2.field1979 < 0) {
                    this.field1953[var2.field1980][var2.field1970] = null;
                }
                var2.method2179();
            }
        }
    }

    @ObfuscatedName("eq.ar(II)V")
    public void method2288(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2288(var2);
            }
            return;
        }
        this.field1938[arg0] = 12800;
        this.field1935[arg0] = 8192;
        this.field1940[arg0] = 16383;
        this.field1945[arg0] = 8192;
        this.field1942[arg0] = 0;
        this.field1946[arg0] = 8192;
        this.method2291(arg0);
        this.method2354(arg0);
        this.field1939[arg0] = 0;
        this.field1964[arg0] = 32767;
        this.field1962[arg0] = 256;
        this.field1950[arg0] = 0;
        this.method2270(arg0, 8192);
    }

    @ObfuscatedName("eq.ay(IB)V")
    public void method2289(int arg0) {
        for (class141 var2 = (class141) this.field1961.field2013.method2187(); var2 != null; var2 = (class141) this.field1961.field2013.method2203()) {
            if ((arg0 < 0 || var2.field1980 == arg0) && var2.field1979 < 0) {
                this.field1953[var2.field1980][var2.field1970] = null;
                var2.field1979 = 0;
            }
        }
    }

    @ObfuscatedName("eq.aq(I)V")
    public void method2290() {
        this.method2287(-1);
        this.method2288(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1941[var1] = this.field1956[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1943[var2] = this.field1956[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("eq.af(IB)V")
    public void method2291(int arg0) {
        if ((this.field1939[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1961.field2013.method2187(); var2 != null; var2 = (class141) this.field1961.field2013.method2203()) {
            if (var2.field1980 == arg0 && this.field1953[arg0][var2.field1970] == null && var2.field1979 < 0) {
                var2.field1979 = 0;
            }
        }
    }

    @ObfuscatedName("eq.aj(II)V")
    public void method2354(int arg0) {
        if ((this.field1939[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1961.field2013.method2187(); var2 != null; var2 = (class141) this.field1961.field2013.method2203()) {
            if (var2.field1980 == arg0) {
                var2.field1985 = 0;
            }
        }
    }

    @ObfuscatedName("eq.ap(II)V")
    public void method2323(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2326(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2281(var6, var7, var8);
            } else {
                this.method2326(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2284(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1943[var12] = (var14 << 14) + (this.field1943[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1943[var12] = (var14 << 7) + (this.field1943[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1942[var12] = (var14 << 7) + (this.field1942[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1942[var12] = (this.field1942[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1946[var12] = (var14 << 7) + (this.field1946[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1946[var12] = (this.field1946[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1938[var12] = (var14 << 7) + (this.field1938[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1938[var12] = (this.field1938[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1935[var12] = (var14 << 7) + (this.field1935[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1935[var12] = (this.field1935[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1940[var12] = (var14 << 7) + (this.field1940[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1940[var12] = (this.field1940[var12] & 0xFFFFFF80) + var14;
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
                    this.method2291(var12);
                    this.field1939[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1964[var12] = (var14 << 7) + (this.field1964[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1964[var12] = (this.field1964[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1964[var12] = (var14 << 7) + (this.field1964[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1964[var12] = (this.field1964[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2287(var12);
            }
            if (var13 == 121) {
                this.method2288(var12);
            }
            if (var13 == 123) {
                this.method2289(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1964[var12];
                if (var15 == 16384) {
                    this.field1962[var12] = (var14 << 7) + (this.field1962[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1964[var12];
                if (var16 == 16384) {
                    this.field1962[var12] = (this.field1962[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1950[var12] = (var14 << 7) + (this.field1950[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1950[var12] = (this.field1950[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1939[var12] |= 0x4;
                } else {
                    this.method2354(var12);
                    this.field1939[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2270(var12, (var14 << 7) + (this.field1951[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2270(var12, (this.field1951[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2280(var17, this.field1943[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2285(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2364(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2290();
            }
        }
    }

    @ObfuscatedName("eq.ac(III)V")
    public void method2270(int arg0, int arg1) {
        this.field1951[arg0] = arg1;
        this.field1947[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("eq.at(Lel;I)I")
    public int method2295(class141 arg0) {
        int var2 = (arg0.field1974 * arg0.field1968 >> 12) + arg0.field1973;
        int var3 = ((this.field1945[arg0.field1980] - 8192) * this.field1962[arg0.field1980] >> 12) + var2;
        class138 var4 = arg0.field1975;
        if (var4.field1915 > 0 && (var4.field1914 > 0 || this.field1942[arg0.field1980] > 0)) {
            int var5 = var4.field1914 << 2;
            int var6 = var4.field1912 << 1;
            if (arg0.field1981 < var6) {
                var5 = arg0.field1981 * var5 / var6;
            }
            int var7 = (this.field1942[arg0.field1980] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1982 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1969.field1022 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1058 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("eq.av(Lel;B)I")
    public int method2299(class141 arg0) {
        class138 var2 = arg0.field1975;
        int var3 = this.field1940[arg0.field1980] * this.field1938[arg0.field1980] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1971 * var4 + 16384 >> 15;
        int var6 = this.field1936 * var5 + 128 >> 8;
        if (var2.field1918 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1976 * 1.953125E-5D * (double) var2.field1918) + 0.5D);
        }
        if (var2.field1917 != null) {
            int var7 = arg0.field1977;
            int var8 = var2.field1917[arg0.field1978 + 1];
            if (arg0.field1978 < var2.field1917.length - 2) {
                int var9 = (var2.field1917[arg0.field1978] & 0xFF) << 8;
                int var10 = (var2.field1917[arg0.field1978 + 2] & 0xFF) << 8;
                var8 += (var2.field1917[arg0.field1978 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1979 > 0 && var2.field1909 != null) {
            int var11 = arg0.field1979;
            int var12 = var2.field1909[arg0.field1986 + 1];
            if (arg0.field1986 < var2.field1909.length - 2) {
                int var13 = (var2.field1909[arg0.field1986] & 0xFF) << 8;
                int var14 = (var2.field1909[arg0.field1986 + 2] & 0xFF) << 8;
                var12 += (var2.field1909[arg0.field1986 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("eq.am(Lel;I)I")
    public int method2297(class141 arg0) {
        int var2 = this.field1935[arg0.field1980];
        return var2 < 8192 ? arg0.field1972 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1972) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("eq.u()Lby;")
    public synchronized class69 method852() {
        return this.field1961;
    }

    @ObfuscatedName("eq.b()Lby;")
    public synchronized class69 method854() {
        return null;
    }

    @ObfuscatedName("eq.x()I")
    public synchronized int method855() {
        return 0;
    }

    @ObfuscatedName("eq.r([III)V")
    public synchronized void method869(int[] arg0, int arg1, int arg2) {
        if (this.field1955.method2401()) {
            int var4 = this.field1937 * this.field1955.field1988 / Statics.field1058;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1959;
                if (this.field1952 - var5 >= 0L) {
                    this.field1959 = var5;
                    break;
                }
                int var7 = (int) ((this.field1952 - this.field1959 + (long) var4 - 1L) / (long) var4);
                this.field1959 += (long) var4 * (long) var7;
                this.field1961.method869(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2300();
            } while (this.field1955.method2401());
        }
        this.field1961.method869(arg0, arg1, arg2);
    }

    @ObfuscatedName("eq.m(I)V")
    public synchronized void method857(int arg0) {
        if (this.field1955.method2401()) {
            int var2 = this.field1937 * this.field1955.field1988 / Statics.field1058;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1959;
                if (this.field1952 - var3 >= 0L) {
                    this.field1959 = var3;
                    break;
                }
                int var5 = (int) ((this.field1952 - this.field1959 + (long) var2 - 1L) / (long) var2);
                this.field1959 += (long) var2 * (long) var5;
                this.field1961.method857(var5);
                arg0 -= var5;
                this.method2300();
            } while (this.field1955.method2401());
        }
        this.field1961.method857(arg0);
    }

    @ObfuscatedName("eq.ak(I)V")
    public void method2300() {
        int var1 = this.field1957;
        int var2 = this.field1958;
        long var3 = this.field1952;
        while (this.field1958 == var2) {
            while (this.field1955.field1998[var1] == var2) {
                this.field1955.method2399(var1);
                int var5 = this.field1955.method2395(var1);
                if (var5 == 1) {
                    this.field1955.method2419();
                    this.field1955.method2400(var1);
                    if (this.field1955.method2407()) {
                        if (!this.field1960 || var2 == 0) {
                            this.method2290();
                            this.field1955.method2396();
                            return;
                        }
                        this.field1955.method2408(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2323(var5);
                }
                this.field1955.method2402(var1);
                this.field1955.method2400(var1);
            }
            var1 = this.field1955.method2406();
            var2 = this.field1955.field1998[var1];
            var3 = this.field1955.method2405(var2);
        }
        this.field1957 = var1;
        this.field1958 = var2;
        this.field1952 = var3;
    }

    @ObfuscatedName("eq.au(Lel;I)Z")
    public boolean method2293(class141 arg0) {
        if (arg0.field1967 != null) {
            return false;
        }
        if (arg0.field1979 >= 0) {
            arg0.method2179();
            if (arg0.field1983 > 0 && this.field1954[arg0.field1980][arg0.field1983] == arg0) {
                this.field1954[arg0.field1980][arg0.field1983] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("eq.ag(Lel;[IIII)Z")
    public boolean method2302(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1965 = Statics.field1058 / 100;
        if (arg0.field1979 >= 0 && arg0.field1967 == null || arg0.field1967.method1124()) {
            arg0.method2386();
            arg0.method2179();
            if (arg0.field1983 > 0 && this.field1954[arg0.field1980][arg0.field1983] == arg0) {
                this.field1954[arg0.field1980][arg0.field1983] = null;
            }
            return true;
        }
        int var5 = arg0.field1968;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1946[arg0.field1980] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1968 = var6;
        }
        arg0.field1967.method1112(this.method2295(arg0));
        class138 var7 = arg0.field1975;
        boolean var8 = false;
        arg0.field1981++;
        arg0.field1982 += var7.field1915;
        double var9 = (double) ((arg0.field1970 - 60 << 8) + (arg0.field1974 * arg0.field1968 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1918 > 0) {
            if (var7.field1913 > 0) {
                arg0.field1976 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1913 * var9) + 0.5D);
            } else {
                arg0.field1976 += 128;
            }
        }
        if (var7.field1917 != null) {
            if (var7.field1916 > 0) {
                arg0.field1977 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1916 * var9) + 0.5D);
            } else {
                arg0.field1977 += 128;
            }
            while (arg0.field1978 < var7.field1917.length - 2 && arg0.field1977 > (var7.field1917[arg0.field1978 + 2] & 0xFF) << 8) {
                arg0.field1978 += 2;
            }
            if (arg0.field1978 == var7.field1917.length - 2 && var7.field1917[arg0.field1978 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1979 >= 0 && var7.field1909 != null && (this.field1939[arg0.field1980] & 0x1) == 0 && (arg0.field1983 < 0 || this.field1954[arg0.field1980][arg0.field1983] != arg0)) {
            if (var7.field1911 > 0) {
                arg0.field1979 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1911 * var9) + 0.5D);
            } else {
                arg0.field1979 += 128;
            }
            while (arg0.field1986 < var7.field1909.length - 2 && arg0.field1979 > (var7.field1909[arg0.field1986 + 2] & 0xFF) << 8) {
                arg0.field1986 += 2;
            }
            if (arg0.field1986 == var7.field1909.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1967.method1093(arg0.field1965, this.method2299(arg0), this.method2297(arg0));
            return false;
        }
        arg0.field1967.method1101(arg0.field1965);
        if (arg1 == null) {
            arg0.field1967.method857(arg3);
        } else {
            arg0.field1967.method869(arg1, arg2, arg3);
        }
        if (arg0.field1967.method1105()) {
            this.field1961.field2011.method848(arg0.field1967);
        }
        arg0.method2386();
        if (arg0.field1979 >= 0) {
            arg0.method2179();
            if (arg0.field1983 > 0 && this.field1954[arg0.field1980][arg0.field1983] == arg0) {
                this.field1954[arg0.field1980][arg0.field1983] = null;
            }
        }
        return true;
    }
}

package deob;

@ObfuscatedName("ex")
public class class140 extends class69 {

    @ObfuscatedName("ex.k")
    public class126 field1939 = new class126(128);

    @ObfuscatedName("ex.y")
    public int field1919 = 256;

    @ObfuscatedName("ex.o")
    public int field1920 = 1000000;

    @ObfuscatedName("ex.r")
    public int[] field1921 = new int[16];

    @ObfuscatedName("ex.j")
    public int[] field1946 = new int[16];

    @ObfuscatedName("ex.q")
    public int[] field1937 = new int[16];

    @ObfuscatedName("ex.d")
    public int[] field1924 = new int[16];

    @ObfuscatedName("ex.n")
    public int[] field1925 = new int[16];

    @ObfuscatedName("ex.c")
    public int[] field1926 = new int[16];

    @ObfuscatedName("ex.s")
    public int[] field1927 = new int[16];

    @ObfuscatedName("ex.g")
    public int[] field1928 = new int[16];

    @ObfuscatedName("ex.i")
    public int[] field1944 = new int[16];

    @ObfuscatedName("ex.z")
    public int[] field1918 = new int[16];

    @ObfuscatedName("ex.u")
    public int[] field1931 = new int[16];

    @ObfuscatedName("ex.b")
    public int[] field1930 = new int[16];

    @ObfuscatedName("ex.m")
    public int[] field1933 = new int[16];

    @ObfuscatedName("ex.e")
    public int[] field1932 = new int[16];

    @ObfuscatedName("ex.l")
    public int[] field1935 = new int[16];

    @ObfuscatedName("ex.x")
    public class141[][] field1936 = new class141[16][128];

    @ObfuscatedName("ex.ap")
    public class141[][] field1929 = new class141[16][128];

    @ObfuscatedName("ex.aq")
    public class142 field1938 = new class142();

    @ObfuscatedName("ex.aw")
    public boolean field1934;

    @ObfuscatedName("ex.as")
    public int field1942;

    @ObfuscatedName("ex.ah")
    public int field1941;

    @ObfuscatedName("ex.aa")
    public long field1922;

    @ObfuscatedName("ex.ai")
    public long field1943;

    @ObfuscatedName("ex.af")
    public class144 field1923 = new class144(this);

    public class140() {
        this.method2327();
    }

    @ObfuscatedName("ex.k(II)V")
    public synchronized void method2308(int arg0) {
        this.field1919 = arg0;
    }

    @ObfuscatedName("ex.y(I)I")
    public int method2421() {
        return this.field1919;
    }

    @ObfuscatedName("ex.o(Lev;Lgh;Lbf;IB)Z")
    public synchronized boolean method2335(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2517();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2002.method2174(); var7 != null; var7 = (class135) arg0.field2002.method2175()) {
            int var8 = (int) var7.field1874;
            class143 var9 = (class143) this.field1939.method2171((long) var8);
            if (var9 == null) {
                var9 = class143.method642(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field1939.method2173(var9, (long) var8);
            }
            if (!var9.method2506(arg2, var7.field1889, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2518();
        }
        return var5;
    }

    @ObfuscatedName("ex.r(I)V")
    public synchronized void method2429() {
        for (class143 var1 = (class143) this.field1939.method2174(); var1 != null; var1 = (class143) this.field1939.method2175()) {
            var1.method2494();
        }
    }

    @ObfuscatedName("ex.w(I)V")
    public synchronized void method2312() {
        for (class143 var1 = (class143) this.field1939.method2174(); var1 != null; var1 = (class143) this.field1939.method2175()) {
            var1.method2214();
        }
    }

    @ObfuscatedName("ex.v(Lev;ZB)V")
    public synchronized void method2313(class145 arg0, boolean arg1) {
        this.method2314();
        this.field1938.method2438(arg0.field2003);
        this.field1934 = arg1;
        this.field1922 = 0L;
        int var3 = this.field1938.method2441();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1938.method2442(var4);
            this.field1938.method2458(var4);
            this.field1938.method2443(var4);
        }
        this.field1942 = this.field1938.method2482();
        this.field1941 = this.field1938.field1975[this.field1942];
        this.field1943 = this.field1938.method2449(this.field1941);
    }

    @ObfuscatedName("ex.h(I)V")
    public synchronized void method2314() {
        this.field1938.method2439();
        this.method2327();
    }

    @ObfuscatedName("ex.p(I)Z")
    public synchronized boolean method2315() {
        return this.field1938.method2440();
    }

    @ObfuscatedName("ex.t(III)V")
    public synchronized void method2378(int arg0, int arg1) {
        this.method2309(arg0, arg1);
    }

    @ObfuscatedName("ex.f(III)V")
    public void method2309(int arg0, int arg1) {
        this.field1924[arg0] = arg1;
        this.field1926[arg0] = arg1 & 0xFFFFFF80;
        this.method2318(arg0, arg1);
    }

    @ObfuscatedName("ex.z(IIS)V")
    public void method2318(int arg0, int arg1) {
        if (this.field1925[arg0] != arg1) {
            this.field1925[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1929[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ex.u(IIII)V")
    public void method2319(int arg0, int arg1, int arg2) {
        this.method2342(arg0, arg1, 64);
        if ((this.field1918[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1923.field2001.method2226(); var4 != null; var4 = (class141) this.field1923.field2001.method2249()) {
                if (var4.field1960 == arg0 && var4.field1963 < 0) {
                    this.field1936[arg0][var4.field1954] = null;
                    this.field1936[arg0][arg1] = var4;
                    int var5 = (var4.field1959 * var4.field1958 >> 12) + var4.field1965;
                    var4.field1965 += arg1 - var4.field1954 << 8;
                    var4.field1958 = var5 - var4.field1965;
                    var4.field1959 = 4096;
                    var4.field1954 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1939.method2171((long) this.field1925[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field1986[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1960 = arg0;
        var8.field1950 = var6;
        var8.field1962 = var7;
        var8.field1952 = var6.field1991[arg1];
        var8.field1967 = var6.field1993[arg1];
        var8.field1954 = arg1;
        var8.field1955 = var6.field1989 * arg2 * arg2 * var6.field1987[arg1] + 1024 >> 11;
        var8.field1956 = var6.field1990[arg1] & 0xFF;
        var8.field1965 = (arg1 << 8) - (var6.field1988[arg1] & 0x7FFF);
        var8.field1953 = 0;
        var8.field1961 = 0;
        var8.field1964 = 0;
        var8.field1963 = -1;
        var8.field1957 = 0;
        if (this.field1933[arg0] == 0) {
            var8.field1971 = class67.method1203(var7, this.method2332(var8), this.method2406(var8), this.method2361(var8));
        } else {
            var8.field1971 = class67.method1203(var7, this.method2332(var8), 0, this.method2361(var8));
            this.method2311(var8, var6.field1988[arg1] < 0);
        }
        if (var6.field1988[arg1] < 0) {
            var8.field1971.method1146(-1);
        }
        if (var8.field1967 >= 0) {
            class141 var9 = this.field1929[arg0][var8.field1967];
            if (var9 != null && var9.field1963 < 0) {
                this.field1936[arg0][var9.field1954] = null;
                var9.field1963 = 0;
            }
            this.field1929[arg0][var8.field1967] = var8;
        }
        this.field1923.field2001.method2220(var8);
        this.field1936[arg0][arg1] = var8;
    }

    @ObfuscatedName("ex.b(Leg;ZB)V")
    public void method2311(class141 arg0, boolean arg1) {
        int var3 = arg0.field1962.field1024.length;
        int var5;
        if (arg1 && arg0.field1962.field1028) {
            int var4 = var3 + var3 - arg0.field1962.field1026;
            var5 = (int) ((long) this.field1933[arg0.field1960] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1971.method1232(true);
            }
        } else {
            var5 = (int) ((long) this.field1933[arg0.field1960] * (long) var3 >> 6);
        }
        arg0.field1971.method1151(var5);
    }

    @ObfuscatedName("ex.m(IIII)V")
    public void method2342(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1936[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1936[arg0][arg1] = null;
        if ((this.field1918[arg0] & 0x2) == 0) {
            var4.field1963 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1923.field2001.method2243(); var5 != null; var5 = (class141) this.field1923.field2001.method2238()) {
            if (var4.field1960 == var5.field1960 && var5.field1963 < 0 && var4 != var5) {
                var4.field1963 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ex.e(IIII)V")
    public void method2322(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ex.l(III)V")
    public void method2323(int arg0, int arg1) {
    }

    @ObfuscatedName("ex.x(III)V")
    public void method2405(int arg0, int arg1) {
        this.field1927[arg0] = arg1;
    }

    @ObfuscatedName("ex.ap(II)V")
    public void method2324(int arg0) {
        for (class141 var2 = (class141) this.field1923.field2001.method2243(); var2 != null; var2 = (class141) this.field1923.field2001.method2238()) {
            if (arg0 < 0 || var2.field1960 == arg0) {
                if (var2.field1971 != null) {
                    var2.field1971.method1155(Statics.field1046 / 100);
                    if (var2.field1971.method1140()) {
                        this.field1923.field1998.method891(var2.field1971);
                    }
                    var2.method2435();
                }
                if (var2.field1963 < 0) {
                    this.field1936[var2.field1960][var2.field1954] = null;
                }
                var2.method2214();
            }
        }
    }

    @ObfuscatedName("ex.aq(IB)V")
    public void method2416(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2416(var2);
            }
            return;
        }
        this.field1921[arg0] = 12800;
        this.field1946[arg0] = 8192;
        this.field1937[arg0] = 16383;
        this.field1927[arg0] = 8192;
        this.field1928[arg0] = 0;
        this.field1944[arg0] = 8192;
        this.method2352(arg0);
        this.method2415(arg0);
        this.field1918[arg0] = 0;
        this.field1931[arg0] = 32767;
        this.field1930[arg0] = 256;
        this.field1933[arg0] = 0;
        this.method2331(arg0, 8192);
    }

    @ObfuscatedName("ex.aw(II)V")
    public void method2326(int arg0) {
        for (class141 var2 = (class141) this.field1923.field2001.method2243(); var2 != null; var2 = (class141) this.field1923.field2001.method2238()) {
            if ((arg0 < 0 || var2.field1960 == arg0) && var2.field1963 < 0) {
                this.field1936[var2.field1960][var2.field1954] = null;
                var2.field1963 = 0;
            }
        }
    }

    @ObfuscatedName("ex.ac(B)V")
    public void method2327() {
        this.method2324(-1);
        this.method2416(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1925[var1] = this.field1924[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1926[var2] = this.field1924[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ex.ag(II)V")
    public void method2352(int arg0) {
        if ((this.field1918[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1923.field2001.method2243(); var2 != null; var2 = (class141) this.field1923.field2001.method2238()) {
            if (var2.field1960 == arg0 && this.field1936[arg0][var2.field1954] == null && var2.field1963 < 0) {
                var2.field1963 = 0;
            }
        }
    }

    @ObfuscatedName("ex.at(II)V")
    public void method2415(int arg0) {
        if ((this.field1918[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1923.field2001.method2243(); var2 != null; var2 = (class141) this.field1923.field2001.method2238()) {
            if (var2.field1960 == arg0) {
                var2.field1969 = 0;
            }
        }
    }

    @ObfuscatedName("ex.au(II)V")
    public void method2330(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2342(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2319(var6, var7, var8);
            } else {
                this.method2342(var6, var7, 64);
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
                this.field1926[var12] = (var14 << 14) + (this.field1926[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1926[var12] = (var14 << 7) + (this.field1926[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1928[var12] = (var14 << 7) + (this.field1928[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1928[var12] = (this.field1928[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1944[var12] = (var14 << 7) + (this.field1944[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1944[var12] = (this.field1944[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1921[var12] = (var14 << 7) + (this.field1921[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1921[var12] = (this.field1921[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1946[var12] = (var14 << 7) + (this.field1946[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1946[var12] = (this.field1946[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1937[var12] = (var14 << 7) + (this.field1937[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1937[var12] = (this.field1937[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1918[var12] |= 0x1;
                } else {
                    this.field1918[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1918[var12] |= 0x2;
                } else {
                    this.method2352(var12);
                    this.field1918[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1931[var12] = (var14 << 7) + (this.field1931[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1931[var12] = (this.field1931[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1931[var12] = (var14 << 7) + (this.field1931[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1931[var12] = (this.field1931[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2324(var12);
            }
            if (var13 == 121) {
                this.method2416(var12);
            }
            if (var13 == 123) {
                this.method2326(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1931[var12];
                if (var15 == 16384) {
                    this.field1930[var12] = (var14 << 7) + (this.field1930[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1931[var12];
                if (var16 == 16384) {
                    this.field1930[var12] = (this.field1930[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1933[var12] = (var14 << 7) + (this.field1933[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1933[var12] = (this.field1933[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1918[var12] |= 0x4;
                } else {
                    this.method2415(var12);
                    this.field1918[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2331(var12, (var14 << 7) + (this.field1932[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2331(var12, (this.field1932[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2318(var17, this.field1926[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2323(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2405(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2327();
            }
        }
    }

    @ObfuscatedName("ex.ae(III)V")
    public void method2331(int arg0, int arg1) {
        this.field1932[arg0] = arg1;
        this.field1935[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ex.ab(Leg;I)I")
    public int method2332(class141 arg0) {
        int var2 = (arg0.field1959 * arg0.field1958 >> 12) + arg0.field1965;
        int var3 = ((this.field1927[arg0.field1960] - 8192) * this.field1930[arg0.field1960] >> 12) + var2;
        class138 var4 = arg0.field1952;
        if (var4.field1901 > 0 && (var4.field1896 > 0 || this.field1928[arg0.field1960] > 0)) {
            int var5 = var4.field1896 << 2;
            int var6 = var4.field1900 << 1;
            if (arg0.field1951 < var6) {
                var5 = arg0.field1951 * var5 / var6;
            }
            int var7 = (this.field1928[arg0.field1960] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1966 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1962.field1025 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1046 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ex.al(Leg;I)I")
    public int method2406(class141 arg0) {
        class138 var2 = arg0.field1952;
        int var3 = this.field1937[arg0.field1960] * this.field1921[arg0.field1960] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1955 * var4 + 16384 >> 15;
        int var6 = this.field1919 * var5 + 128 >> 8;
        if (var2.field1899 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1953 * 1.953125E-5D * (double) var2.field1899) + 0.5D);
        }
        if (var2.field1902 != null) {
            int var7 = arg0.field1961;
            int var8 = var2.field1902[arg0.field1964 + 1];
            if (arg0.field1964 < var2.field1902.length - 2) {
                int var9 = (var2.field1902[arg0.field1964] & 0xFF) << 8;
                int var10 = (var2.field1902[arg0.field1964 + 2] & 0xFF) << 8;
                var8 += (var2.field1902[arg0.field1964 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1963 > 0 && var2.field1895 != null) {
            int var11 = arg0.field1963;
            int var12 = var2.field1895[arg0.field1957 + 1];
            if (arg0.field1957 < var2.field1895.length - 2) {
                int var13 = (var2.field1895[arg0.field1957] & 0xFF) << 8;
                int var14 = (var2.field1895[arg0.field1957 + 2] & 0xFF) << 8;
                var12 += (var2.field1895[arg0.field1957 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ex.av(Leg;I)I")
    public int method2361(class141 arg0) {
        int var2 = this.field1946[arg0.field1960];
        return var2 < 8192 ? arg0.field1956 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1956) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ex.j()Lbs;")
    public synchronized class69 method896() {
        return this.field1923;
    }

    @ObfuscatedName("ex.c()Lbs;")
    public synchronized class69 method897() {
        return null;
    }

    @ObfuscatedName("ex.g()I")
    public synchronized int method898() {
        return 0;
    }

    @ObfuscatedName("ex.i([III)V")
    public synchronized void method907(int[] arg0, int arg1, int arg2) {
        if (this.field1938.method2440()) {
            int var4 = this.field1920 * this.field1938.field1979 / Statics.field1046;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1922;
                if (this.field1943 - var5 >= 0L) {
                    this.field1922 = var5;
                    break;
                }
                int var7 = (int) ((this.field1943 - this.field1922 + (long) var4 - 1L) / (long) var4);
                this.field1922 += (long) var4 * (long) var7;
                this.field1923.method907(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2336();
            } while (this.field1938.method2440());
        }
        this.field1923.method907(arg0, arg1, arg2);
    }

    @ObfuscatedName("ex.a(I)V")
    public synchronized void method919(int arg0) {
        if (this.field1938.method2440()) {
            int var2 = this.field1920 * this.field1938.field1979 / Statics.field1046;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1922;
                if (this.field1943 - var3 >= 0L) {
                    this.field1922 = var3;
                    break;
                }
                int var5 = (int) ((this.field1943 - this.field1922 + (long) var2 - 1L) / (long) var2);
                this.field1922 += (long) var2 * (long) var5;
                this.field1923.method919(var5);
                arg0 -= var5;
                this.method2336();
            } while (this.field1938.method2440());
        }
        this.field1923.method919(arg0);
    }

    @ObfuscatedName("ex.ak(B)V")
    public void method2336() {
        int var1 = this.field1942;
        int var2 = this.field1941;
        long var3 = this.field1943;
        while (this.field1941 == var2) {
            while (this.field1938.field1975[var1] == var2) {
                this.field1938.method2442(var1);
                int var5 = this.field1938.method2468(var1);
                if (var5 == 1) {
                    this.field1938.method2444();
                    this.field1938.method2443(var1);
                    if (this.field1938.method2451()) {
                        if (!this.field1934 || var2 == 0) {
                            this.method2327();
                            this.field1938.method2439();
                            return;
                        }
                        this.field1938.method2465(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2330(var5);
                }
                this.field1938.method2458(var1);
                this.field1938.method2443(var1);
            }
            var1 = this.field1938.method2482();
            var2 = this.field1938.field1975[var1];
            var3 = this.field1938.method2449(var2);
        }
        this.field1942 = var1;
        this.field1941 = var2;
        this.field1943 = var3;
    }

    @ObfuscatedName("ex.an(Leg;I)Z")
    public boolean method2337(class141 arg0) {
        if (arg0.field1971 != null) {
            return false;
        }
        if (arg0.field1963 >= 0) {
            arg0.method2214();
            if (arg0.field1967 > 0 && this.field1929[arg0.field1960][arg0.field1967] == arg0) {
                this.field1929[arg0.field1960][arg0.field1967] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ex.bb(Leg;[IIII)Z")
    public boolean method2389(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1968 = Statics.field1046 / 100;
        if (arg0.field1963 >= 0 && arg0.field1971 == null || arg0.field1971.method1227()) {
            arg0.method2435();
            arg0.method2214();
            if (arg0.field1967 > 0 && this.field1929[arg0.field1960][arg0.field1967] == arg0) {
                this.field1929[arg0.field1960][arg0.field1967] = null;
            }
            return true;
        }
        int var5 = arg0.field1959;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1944[arg0.field1960] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1959 = var6;
        }
        arg0.field1971.method1156(this.method2332(arg0));
        class138 var7 = arg0.field1952;
        boolean var8 = false;
        arg0.field1951++;
        arg0.field1966 += var7.field1901;
        double var9 = (double) ((arg0.field1954 - 60 << 8) + (arg0.field1959 * arg0.field1958 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1899 > 0) {
            if (var7.field1904 > 0) {
                arg0.field1953 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1904 * var9) + 0.5D);
            } else {
                arg0.field1953 += 128;
            }
        }
        if (var7.field1902 != null) {
            if (var7.field1897 > 0) {
                arg0.field1961 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1897 * var9) + 0.5D);
            } else {
                arg0.field1961 += 128;
            }
            while (arg0.field1964 < var7.field1902.length - 2 && arg0.field1961 > (var7.field1902[arg0.field1964 + 2] & 0xFF) << 8) {
                arg0.field1964 += 2;
            }
            if (arg0.field1964 == var7.field1902.length - 2 && var7.field1902[arg0.field1964 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1963 >= 0 && var7.field1895 != null && (this.field1918[arg0.field1960] & 0x1) == 0 && (arg0.field1967 < 0 || this.field1929[arg0.field1960][arg0.field1967] != arg0)) {
            if (var7.field1898 > 0) {
                arg0.field1963 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1898 * var9) + 0.5D);
            } else {
                arg0.field1963 += 128;
            }
            while (arg0.field1957 < var7.field1895.length - 2 && arg0.field1963 > (var7.field1895[arg0.field1957 + 2] & 0xFF) << 8) {
                arg0.field1957 += 2;
            }
            if (arg0.field1957 == var7.field1895.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1971.method1154(arg0.field1968, this.method2406(arg0), this.method2361(arg0));
            return false;
        }
        arg0.field1971.method1155(arg0.field1968);
        if (arg1 == null) {
            arg0.field1971.method919(arg3);
        } else {
            arg0.field1971.method907(arg1, arg2, arg3);
        }
        if (arg0.field1971.method1140()) {
            this.field1923.field1998.method891(arg0.field1971);
        }
        arg0.method2435();
        if (arg0.field1963 >= 0) {
            arg0.method2214();
            if (arg0.field1967 > 0 && this.field1929[arg0.field1960][arg0.field1967] == arg0) {
                this.field1929[arg0.field1960][arg0.field1967] = null;
            }
        }
        return true;
    }
}

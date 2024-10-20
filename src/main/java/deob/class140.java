package deob;

@ObfuscatedName("ep")
public class class140 extends class69 {

    @ObfuscatedName("ep.f")
    public class126 field1971 = new class126(128);

    @ObfuscatedName("ep.i")
    public int field1948 = 256;

    @ObfuscatedName("ep.u")
    public int field1949 = 1000000;

    @ObfuscatedName("ep.h")
    public int[] field1950 = new int[16];

    @ObfuscatedName("ep.r")
    public int[] field1961 = new int[16];

    @ObfuscatedName("ep.o")
    public int[] field1953 = new int[16];

    @ObfuscatedName("ep.l")
    public int[] field1956 = new int[16];

    @ObfuscatedName("ep.n")
    public int[] field1954 = new int[16];

    @ObfuscatedName("ep.m")
    public int[] field1955 = new int[16];

    @ObfuscatedName("ep.j")
    public int[] field1952 = new int[16];

    @ObfuscatedName("ep.s")
    public int[] field1957 = new int[16];

    @ObfuscatedName("ep.q")
    public int[] field1962 = new int[16];

    @ObfuscatedName("ep.x")
    public int[] field1959 = new int[16];

    @ObfuscatedName("ep.g")
    public int[] field1960 = new int[16];

    @ObfuscatedName("ep.b")
    public int[] field1958 = new int[16];

    @ObfuscatedName("ep.k")
    public int[] field1970 = new int[16];

    @ObfuscatedName("ep.t")
    public int[] field1963 = new int[16];

    @ObfuscatedName("ep.c")
    public int[] field1964 = new int[16];

    @ObfuscatedName("ep.e")
    public class141[][] field1965 = new class141[16][128];

    @ObfuscatedName("ep.am")
    public class141[][] field1966 = new class141[16][128];

    @ObfuscatedName("ep.an")
    public class142 field1967 = new class142();

    @ObfuscatedName("ep.aq")
    public boolean field1968;

    @ObfuscatedName("ep.ah")
    public int field1969;

    @ObfuscatedName("ep.ag")
    public int field1951;

    @ObfuscatedName("ep.ab")
    public long field1947;

    @ObfuscatedName("ep.aw")
    public long field1972;

    @ObfuscatedName("ep.ax")
    public class144 field1973 = new class144(this);

    public class140() {
        this.method2409();
    }

    @ObfuscatedName("ep.f(II)V")
    public synchronized void method2401(int arg0) {
        this.field1948 = arg0;
    }

    @ObfuscatedName("ep.i(I)I")
    public int method2391() {
        return this.field1948;
    }

    @ObfuscatedName("ep.u(Led;Lgb;Lbv;II)Z")
    public synchronized boolean method2458(class145 arg0, class183 arg1, class61 arg2, int arg3) {
        arg0.method2584();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class135 var7 = (class135) arg0.field2030.method2257(); var7 != null; var7 = (class135) arg0.field2030.method2259()) {
            int var8 = (int) var7.field1905;
            class143 var9 = (class143) this.field1971.method2254((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method3170(var8);
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
                this.field1971.method2255(var11, (long) var8);
            }
            if (!var9.method2559(arg2, var7.field1920, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2588();
        }
        return var5;
    }

    @ObfuscatedName("ep.r(I)V")
    public synchronized void method2393() {
        for (class143 var1 = (class143) this.field1971.method2257(); var1 != null; var1 = (class143) this.field1971.method2259()) {
            var1.method2555();
        }
    }

    @ObfuscatedName("ep.o(I)V")
    public synchronized void method2394() {
        for (class143 var1 = (class143) this.field1971.method2257(); var1 != null; var1 = (class143) this.field1971.method2259()) {
            var1.method2289();
        }
    }

    @ObfuscatedName("ep.j(Led;ZB)V")
    public synchronized void method2395(class145 arg0, boolean arg1) {
        this.method2421();
        this.field1967.method2505(arg0.field2029);
        this.field1968 = arg1;
        this.field1947 = 0L;
        int var3 = this.field1967.method2543();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1967.method2546(var4);
            this.field1967.method2512(var4);
            this.field1967.method2510(var4);
        }
        this.field1969 = this.field1967.method2517();
        this.field1951 = this.field1967.field1998[this.field1969];
        this.field1972 = this.field1967.method2516(this.field1951);
    }

    @ObfuscatedName("ep.q(S)V")
    public synchronized void method2421() {
        this.field1967.method2532();
        this.method2409();
    }

    @ObfuscatedName("ep.d(I)Z")
    public synchronized boolean method2392() {
        return this.field1967.method2507();
    }

    @ObfuscatedName("ep.p(III)V")
    public synchronized void method2413(int arg0, int arg1) {
        this.method2417(arg0, arg1);
    }

    @ObfuscatedName("ep.y(IIB)V")
    public void method2417(int arg0, int arg1) {
        this.field1956[arg0] = arg1;
        this.field1955[arg0] = arg1 & 0xFFFFFF80;
        this.method2476(arg0, arg1);
    }

    @ObfuscatedName("ep.a(IIB)V")
    public void method2476(int arg0, int arg1) {
        if (this.field1954[arg0] != arg1) {
            this.field1954[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field1966[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ep.v(IIII)V")
    public void method2426(int arg0, int arg1, int arg2) {
        this.method2403(arg0, arg1, 64);
        if ((this.field1959[arg0] & 0x2) != 0) {
            for (class141 var4 = (class141) this.field1973.field2025.method2306(); var4 != null; var4 = (class141) this.field1973.field2025.method2304()) {
                if (var4.field1991 == arg0 && var4.field1984 < 0) {
                    this.field1965[arg0][var4.field1981] = null;
                    this.field1965[arg0][arg1] = var4;
                    int var5 = (var4.field1986 * var4.field1985 >> 12) + var4.field1982;
                    var4.field1982 += arg1 - var4.field1981 << 8;
                    var4.field1985 = var5 - var4.field1982;
                    var4.field1986 = 4096;
                    var4.field1981 = arg1;
                    return;
                }
            }
        }
        class143 var6 = (class143) this.field1971.method2254((long) this.field1954[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2020[arg1];
        if (var7 == null) {
            return;
        }
        class141 var8 = new class141();
        var8.field1991 = arg0;
        var8.field1977 = var6;
        var8.field1987 = var7;
        var8.field1996 = var6.field2018[arg1];
        var8.field1980 = var6.field2013[arg1];
        var8.field1981 = arg1;
        var8.field1978 = var6.field2017 * arg2 * arg2 * var6.field2015[arg1] + 1024 >> 11;
        var8.field1979 = var6.field2016[arg1] & 0xFF;
        var8.field1982 = (arg1 << 8) - (var6.field2014[arg1] & 0x7FFF);
        var8.field1976 = 0;
        var8.field1988 = 0;
        var8.field1989 = 0;
        var8.field1984 = -1;
        var8.field1990 = 0;
        if (this.field1970[arg0] == 0) {
            var8.field1994 = class67.method1206(var7, this.method2414(var8), this.method2415(var8), this.method2416(var8));
        } else {
            var8.field1994 = class67.method1206(var7, this.method2414(var8), 0, this.method2416(var8));
            this.method2410(var8, var6.field2014[arg1] < 0);
        }
        if (var6.field2014[arg1] < 0) {
            var8.field1994.method1169(-1);
        }
        if (var8.field1980 >= 0) {
            class141 var9 = this.field1966[arg0][var8.field1980];
            if (var9 != null && var9.field1984 < 0) {
                this.field1965[arg0][var9.field1981] = null;
                var9.field1984 = 0;
            }
            this.field1966[arg0][var8.field1980] = var8;
        }
        this.field1973.field2025.method2296(var8);
        this.field1965[arg0][arg1] = var8;
    }

    @ObfuscatedName("ep.z(Leu;ZB)V")
    public void method2410(class141 arg0, boolean arg1) {
        int var3 = arg0.field1987.field1045.length;
        int var5;
        if (arg1 && arg0.field1987.field1049) {
            int var4 = var3 + var3 - arg0.field1987.field1046;
            var5 = (int) ((long) this.field1970[arg0.field1991] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1994.method1173(true);
            }
        } else {
            var5 = (int) ((long) this.field1970[arg0.field1991] * (long) var3 >> 6);
        }
        arg0.field1994.method1172(var5);
    }

    @ObfuscatedName("ep.x(IIII)V")
    public void method2403(int arg0, int arg1, int arg2) {
        class141 var4 = this.field1965[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field1965[arg0][arg1] = null;
        if ((this.field1959[arg0] & 0x2) == 0) {
            var4.field1984 = 0;
            return;
        }
        for (class141 var5 = (class141) this.field1973.field2025.method2301(); var5 != null; var5 = (class141) this.field1973.field2025.method2309()) {
            if (var4.field1991 == var5.field1991 && var5.field1984 < 0 && var4 != var5) {
                var4.field1984 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ep.g(IIII)V")
    public void method2404(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ep.b(IIB)V")
    public void method2405(int arg0, int arg1) {
    }

    @ObfuscatedName("ep.k(III)V")
    public void method2406(int arg0, int arg1) {
        this.field1952[arg0] = arg1;
    }

    @ObfuscatedName("ep.t(II)V")
    public void method2412(int arg0) {
        for (class141 var2 = (class141) this.field1973.field2025.method2301(); var2 != null; var2 = (class141) this.field1973.field2025.method2309()) {
            if (arg0 < 0 || var2.field1991 == arg0) {
                if (var2.field1994 != null) {
                    var2.field1994.method1195(Statics.field1078 / 100);
                    if (var2.field1994.method1179()) {
                        this.field1973.field2024.method920(var2.field1994);
                    }
                    var2.method2500();
                }
                if (var2.field1984 < 0) {
                    this.field1965[var2.field1991][var2.field1981] = null;
                }
                var2.method2289();
            }
        }
    }

    @ObfuscatedName("ep.c(II)V")
    public void method2407(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2407(var2);
            }
            return;
        }
        this.field1950[arg0] = 12800;
        this.field1961[arg0] = 8192;
        this.field1953[arg0] = 16383;
        this.field1952[arg0] = 8192;
        this.field1957[arg0] = 0;
        this.field1962[arg0] = 8192;
        this.method2398(arg0);
        this.method2411(arg0);
        this.field1959[arg0] = 0;
        this.field1960[arg0] = 32767;
        this.field1958[arg0] = 256;
        this.field1970[arg0] = 0;
        this.method2439(arg0, 8192);
    }

    @ObfuscatedName("ep.ap(II)V")
    public void method2462(int arg0) {
        for (class141 var2 = (class141) this.field1973.field2025.method2301(); var2 != null; var2 = (class141) this.field1973.field2025.method2309()) {
            if ((arg0 < 0 || var2.field1991 == arg0) && var2.field1984 < 0) {
                this.field1965[var2.field1991][var2.field1981] = null;
                var2.field1984 = 0;
            }
        }
    }

    @ObfuscatedName("ep.au(B)V")
    public void method2409() {
        this.method2412(-1);
        this.method2407(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field1954[var1] = this.field1956[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field1955[var2] = this.field1956[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ep.ad(IB)V")
    public void method2398(int arg0) {
        if ((this.field1959[arg0] & 0x2) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1973.field2025.method2301(); var2 != null; var2 = (class141) this.field1973.field2025.method2309()) {
            if (var2.field1991 == arg0 && this.field1965[arg0][var2.field1981] == null && var2.field1984 < 0) {
                var2.field1984 = 0;
            }
        }
    }

    @ObfuscatedName("ep.av(II)V")
    public void method2411(int arg0) {
        if ((this.field1959[arg0] & 0x4) == 0) {
            return;
        }
        for (class141 var2 = (class141) this.field1973.field2025.method2301(); var2 != null; var2 = (class141) this.field1973.field2025.method2309()) {
            if (var2.field1991 == arg0) {
                var2.field1997 = 0;
            }
        }
    }

    @ObfuscatedName("ep.ao(IB)V")
    public void method2408(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2403(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2426(var6, var7, var8);
            } else {
                this.method2403(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2404(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field1955[var12] = (var14 << 14) + (this.field1955[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field1955[var12] = (var14 << 7) + (this.field1955[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field1957[var12] = (var14 << 7) + (this.field1957[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field1957[var12] = (this.field1957[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field1962[var12] = (var14 << 7) + (this.field1962[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field1962[var12] = (this.field1962[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field1950[var12] = (var14 << 7) + (this.field1950[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field1950[var12] = (this.field1950[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field1961[var12] = (var14 << 7) + (this.field1961[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field1961[var12] = (this.field1961[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field1953[var12] = (var14 << 7) + (this.field1953[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field1953[var12] = (this.field1953[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field1959[var12] |= 0x1;
                } else {
                    this.field1959[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field1959[var12] |= 0x2;
                } else {
                    this.method2398(var12);
                    this.field1959[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field1960[var12] = (var14 << 7) + (this.field1960[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field1960[var12] = (this.field1960[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field1960[var12] = (var14 << 7) + (this.field1960[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field1960[var12] = (this.field1960[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2412(var12);
            }
            if (var13 == 121) {
                this.method2407(var12);
            }
            if (var13 == 123) {
                this.method2462(var12);
            }
            if (var13 == 6) {
                int var15 = this.field1960[var12];
                if (var15 == 16384) {
                    this.field1958[var12] = (var14 << 7) + (this.field1958[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field1960[var12];
                if (var16 == 16384) {
                    this.field1958[var12] = (this.field1958[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field1970[var12] = (var14 << 7) + (this.field1970[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field1970[var12] = (this.field1970[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field1959[var12] |= 0x4;
                } else {
                    this.method2411(var12);
                    this.field1959[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2439(var12, (var14 << 7) + (this.field1963[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2439(var12, (this.field1963[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2476(var17, this.field1955[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2405(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2406(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2409();
            }
        }
    }

    @ObfuscatedName("ep.ae(IIB)V")
    public void method2439(int arg0, int arg1) {
        this.field1963[arg0] = arg1;
        this.field1964[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ep.aa(Leu;I)I")
    public int method2414(class141 arg0) {
        int var2 = (arg0.field1986 * arg0.field1985 >> 12) + arg0.field1982;
        int var3 = ((this.field1952[arg0.field1991] - 8192) * this.field1958[arg0.field1991] >> 12) + var2;
        class138 var4 = arg0.field1996;
        if (var4.field1932 > 0 && (var4.field1935 > 0 || this.field1957[arg0.field1991] > 0)) {
            int var5 = var4.field1935 << 2;
            int var6 = var4.field1933 << 1;
            if (arg0.field1992 < var6) {
                var5 = arg0.field1992 * var5 / var6;
            }
            int var7 = (this.field1957[arg0.field1991] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1993 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1987.field1048 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1078 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ep.al(Leu;I)I")
    public int method2415(class141 arg0) {
        class138 var2 = arg0.field1996;
        int var3 = this.field1953[arg0.field1991] * this.field1950[arg0.field1991] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1978 * var4 + 16384 >> 15;
        int var6 = this.field1948 * var5 + 128 >> 8;
        if (var2.field1927 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1976 * 1.953125E-5D * (double) var2.field1927) + 0.5D);
        }
        if (var2.field1925 != null) {
            int var7 = arg0.field1988;
            int var8 = var2.field1925[arg0.field1989 + 1];
            if (arg0.field1989 < var2.field1925.length - 2) {
                int var9 = (var2.field1925[arg0.field1989] & 0xFF) << 8;
                int var10 = (var2.field1925[arg0.field1989 + 2] & 0xFF) << 8;
                var8 += (var2.field1925[arg0.field1989 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1984 > 0 && var2.field1926 != null) {
            int var11 = arg0.field1984;
            int var12 = var2.field1926[arg0.field1990 + 1];
            if (arg0.field1990 < var2.field1926.length - 2) {
                int var13 = (var2.field1926[arg0.field1990] & 0xFF) << 8;
                int var14 = (var2.field1926[arg0.field1990 + 2] & 0xFF) << 8;
                var12 += (var2.field1926[arg0.field1990 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ep.az(Leu;I)I")
    public int method2416(class141 arg0) {
        int var2 = this.field1961[arg0.field1991];
        return var2 < 8192 ? arg0.field1979 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1979) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ep.l()Lbm;")
    public synchronized class69 method936() {
        return this.field1973;
    }

    @ObfuscatedName("ep.n()Lbm;")
    public synchronized class69 method928() {
        return null;
    }

    @ObfuscatedName("ep.m()I")
    public synchronized int method960() {
        return 0;
    }

    @ObfuscatedName("ep.w([III)V")
    public synchronized void method930(int[] arg0, int arg1, int arg2) {
        if (this.field1967.method2507()) {
            int var4 = this.field1949 * this.field1967.field1999 / Statics.field1078;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field1947;
                if (this.field1972 - var5 >= 0L) {
                    this.field1947 = var5;
                    break;
                }
                int var7 = (int) ((this.field1972 - this.field1947 + (long) var4 - 1L) / (long) var4);
                this.field1947 += (long) var4 * (long) var7;
                this.field1973.method930(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2444();
            } while (this.field1967.method2507());
        }
        this.field1973.method930(arg0, arg1, arg2);
    }

    @ObfuscatedName("ep.s(I)V")
    public synchronized void method929(int arg0) {
        if (this.field1967.method2507()) {
            int var2 = this.field1949 * this.field1967.field1999 / Statics.field1078;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field1947;
                if (this.field1972 - var3 >= 0L) {
                    this.field1947 = var3;
                    break;
                }
                int var5 = (int) ((this.field1972 - this.field1947 + (long) var2 - 1L) / (long) var2);
                this.field1947 += (long) var2 * (long) var5;
                this.field1973.method929(var5);
                arg0 -= var5;
                this.method2444();
            } while (this.field1967.method2507());
        }
        this.field1973.method929(arg0);
    }

    @ObfuscatedName("ep.ay(B)V")
    public void method2444() {
        int var1 = this.field1969;
        int var2 = this.field1951;
        long var3 = this.field1972;
        while (this.field1951 == var2) {
            while (this.field1967.field1998[var1] == var2) {
                this.field1967.method2546(var1);
                int var5 = this.field1967.method2513(var1);
                if (var5 == 1) {
                    this.field1967.method2539();
                    this.field1967.method2510(var1);
                    if (this.field1967.method2522()) {
                        if (!this.field1968 || var2 == 0) {
                            this.method2409();
                            this.field1967.method2532();
                            return;
                        }
                        this.field1967.method2519(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2408(var5);
                }
                this.field1967.method2512(var1);
                this.field1967.method2510(var1);
            }
            var1 = this.field1967.method2517();
            var2 = this.field1967.field1998[var1];
            var3 = this.field1967.method2516(var2);
        }
        this.field1969 = var1;
        this.field1951 = var2;
        this.field1972 = var3;
    }

    @ObfuscatedName("ep.ac(Leu;I)Z")
    public boolean method2418(class141 arg0) {
        if (arg0.field1994 != null) {
            return false;
        }
        if (arg0.field1984 >= 0) {
            arg0.method2289();
            if (arg0.field1980 > 0 && this.field1966[arg0.field1991][arg0.field1980] == arg0) {
                this.field1966[arg0.field1991][arg0.field1980] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ep.af(Leu;[IIII)Z")
    public boolean method2419(class141 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1995 = Statics.field1078 / 100;
        if (arg0.field1984 >= 0 && arg0.field1994 == null || arg0.field1994.method1258()) {
            arg0.method2500();
            arg0.method2289();
            if (arg0.field1980 > 0 && this.field1966[arg0.field1991][arg0.field1980] == arg0) {
                this.field1966[arg0.field1991][arg0.field1980] = null;
            }
            return true;
        }
        int var5 = arg0.field1986;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field1962[arg0.field1991] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1986 = var6;
        }
        arg0.field1994.method1226(this.method2414(arg0));
        class138 var7 = arg0.field1996;
        boolean var8 = false;
        arg0.field1992++;
        arg0.field1993 += var7.field1932;
        double var9 = (double) ((arg0.field1981 - 60 << 8) + (arg0.field1986 * arg0.field1985 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1927 > 0) {
            if (var7.field1930 > 0) {
                arg0.field1976 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1930 * var9) + 0.5D);
            } else {
                arg0.field1976 += 128;
            }
        }
        if (var7.field1925 != null) {
            if (var7.field1931 > 0) {
                arg0.field1988 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1931 * var9) + 0.5D);
            } else {
                arg0.field1988 += 128;
            }
            while (arg0.field1989 < var7.field1925.length - 2 && arg0.field1988 > (var7.field1925[arg0.field1989 + 2] & 0xFF) << 8) {
                arg0.field1989 += 2;
            }
            if (arg0.field1989 == var7.field1925.length - 2 && var7.field1925[arg0.field1989 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1984 >= 0 && var7.field1926 != null && (this.field1959[arg0.field1991] & 0x1) == 0 && (arg0.field1980 < 0 || this.field1966[arg0.field1991][arg0.field1980] != arg0)) {
            if (var7.field1929 > 0) {
                arg0.field1984 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1929 * var9) + 0.5D);
            } else {
                arg0.field1984 += 128;
            }
            while (arg0.field1990 < var7.field1926.length - 2 && arg0.field1984 > (var7.field1926[arg0.field1990 + 2] & 0xFF) << 8) {
                arg0.field1990 += 2;
            }
            if (arg0.field1990 == var7.field1926.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1994.method1176(arg0.field1995, this.method2415(arg0), this.method2416(arg0));
            return false;
        }
        arg0.field1994.method1195(arg0.field1995);
        if (arg1 == null) {
            arg0.field1994.method929(arg3);
        } else {
            arg0.field1994.method930(arg1, arg2, arg3);
        }
        if (arg0.field1994.method1179()) {
            this.field1973.field2024.method920(arg0.field1994);
        }
        arg0.method2500();
        if (arg0.field1984 >= 0) {
            arg0.method2289();
            if (arg0.field1980 > 0 && this.field1966[arg0.field1991][arg0.field1980] == arg0) {
                this.field1966[arg0.field1991][arg0.field1980] = null;
            }
        }
        return true;
    }
}

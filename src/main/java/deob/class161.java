package deob;

@ObfuscatedName("fg")
public class class161 extends class69 {

    @ObfuscatedName("fg.d")
    public class147 field2088 = new class147(128);

    @ObfuscatedName("fg.c")
    public int field2096 = 256;

    @ObfuscatedName("fg.n")
    public int field2081 = 1000000;

    @ObfuscatedName("fg.q")
    public int[] field2078 = new int[16];

    @ObfuscatedName("fg.t")
    public int[] field2079 = new int[16];

    @ObfuscatedName("fg.p")
    public int[] field2080 = new int[16];

    @ObfuscatedName("fg.u")
    public int[] field2084 = new int[16];

    @ObfuscatedName("fg.z")
    public int[] field2082 = new int[16];

    @ObfuscatedName("fg.l")
    public int[] field2083 = new int[16];

    @ObfuscatedName("fg.v")
    public int[] field2075 = new int[16];

    @ObfuscatedName("fg.g")
    public int[] field2085 = new int[16];

    @ObfuscatedName("fg.r")
    public int[] field2086 = new int[16];

    @ObfuscatedName("fg.x")
    public int[] field2087 = new int[16];

    @ObfuscatedName("fg.h")
    public int[] field2095 = new int[16];

    @ObfuscatedName("fg.b")
    public int[] field2089 = new int[16];

    @ObfuscatedName("fg.f")
    public int[] field2090 = new int[16];

    @ObfuscatedName("fg.o")
    public int[] field2091 = new int[16];

    @ObfuscatedName("fg.m")
    public int[] field2092 = new int[16];

    @ObfuscatedName("fg.y")
    public class162[][] field2093 = new class162[16][128];

    @ObfuscatedName("fg.am")
    public class162[][] field2094 = new class162[16][128];

    @ObfuscatedName("fg.ax")
    public class163 field2100 = new class163();

    @ObfuscatedName("fg.ac")
    public boolean field2077;

    @ObfuscatedName("fg.az")
    public int field2102;

    @ObfuscatedName("fg.ao")
    public int field2076;

    @ObfuscatedName("fg.ak")
    public long field2097;

    @ObfuscatedName("fg.aa")
    public long field2099;

    @ObfuscatedName("fg.aj")
    public class165 field2101 = new class165(this);

    public class161() {
        this.method2763();
    }

    @ObfuscatedName("fg.d(IS)V")
    public synchronized void method2821(int arg0) {
        this.field2096 = arg0;
    }

    @ObfuscatedName("fg.c(I)I")
    public int method2778() {
        return this.field2096;
    }

    @ObfuscatedName("fg.n(Lft;Lgd;Lbf;II)Z")
    public synchronized boolean method2803(class166 arg0, class185 arg1, class62 arg2, int arg3) {
        arg0.method2919();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class156 var7 = (class156) arg0.field2164.method2614(); var7 != null; var7 = (class156) arg0.field2164.method2615()) {
            int var8 = (int) var7.field2034;
            class164 var9 = (class164) this.field2088.method2611((long) var8);
            if (var9 == null) {
                var9 = class164.method165(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2088.method2612(var9, (long) var8);
            }
            if (!var9.method2901(arg2, var7.field2048, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method2920();
        }
        return var5;
    }

    @ObfuscatedName("fg.q(S)V")
    public synchronized void method2796() {
        for (class164 var1 = (class164) this.field2088.method2614(); var1 != null; var1 = (class164) this.field2088.method2615()) {
            var1.method2902();
        }
    }

    @ObfuscatedName("fg.t(I)V")
    public synchronized void method2748() {
        for (class164 var1 = (class164) this.field2088.method2614(); var1 != null; var1 = (class164) this.field2088.method2615()) {
            var1.method2652();
        }
    }

    @ObfuscatedName("fg.s(Lft;ZI)V")
    public synchronized void method2749(class166 arg0, boolean arg1) {
        this.method2773();
        this.field2100.method2874(arg0.field2163);
        this.field2077 = arg1;
        this.field2097 = 0L;
        int var3 = this.field2100.method2850();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2100.method2852(var4);
            this.field2100.method2855(var4);
            this.field2100.method2853(var4);
        }
        this.field2102 = this.field2100.method2868();
        this.field2076 = this.field2100.field2137[this.field2102];
        this.field2099 = this.field2100.method2859(this.field2076);
    }

    @ObfuscatedName("fg.e(I)V")
    public synchronized void method2773() {
        this.field2100.method2888();
        this.method2763();
    }

    @ObfuscatedName("fg.j(I)Z")
    public synchronized boolean method2750() {
        return this.field2100.method2870();
    }

    @ObfuscatedName("fg.i(III)V")
    public synchronized void method2751(int arg0, int arg1) {
        this.method2752(arg0, arg1);
    }

    @ObfuscatedName("fg.a(III)V")
    public void method2752(int arg0, int arg1) {
        this.field2084[arg0] = arg1;
        this.field2083[arg0] = arg1 & 0xFFFFFF80;
        this.method2753(arg0, arg1);
    }

    @ObfuscatedName("fg.x(III)V")
    public void method2753(int arg0, int arg1) {
        if (this.field2082[arg0] != arg1) {
            this.field2082[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2094[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("fg.h(IIII)V")
    public void method2754(int arg0, int arg1, int arg2) {
        this.method2756(arg0, arg1, 64);
        if ((this.field2087[arg0] & 0x2) != 0) {
            for (class162 var4 = (class162) this.field2101.field2153.method2667(); var4 != null; var4 = (class162) this.field2101.field2153.method2669()) {
                if (var4.field2124 == arg0 && var4.field2120 < 0) {
                    this.field2093[arg0][var4.field2111] = null;
                    this.field2093[arg0][arg1] = var4;
                    int var5 = (var4.field2115 * var4.field2106 >> 12) + var4.field2107;
                    var4.field2107 += arg1 - var4.field2111 << 8;
                    var4.field2115 = var5 - var4.field2107;
                    var4.field2106 = 4096;
                    var4.field2111 = arg1;
                    return;
                }
            }
        }
        class164 var6 = (class164) this.field2088.method2611((long) this.field2082[arg0]);
        if (var6 == null) {
            return;
        }
        class56 var7 = var6.field2143[arg1];
        if (var7 == null) {
            return;
        }
        class162 var8 = new class162();
        var8.field2124 = arg0;
        var8.field2110 = var6;
        var8.field2114 = var7;
        var8.field2109 = var6.field2144[arg1];
        var8.field2123 = var6.field2147[arg1];
        var8.field2111 = arg1;
        var8.field2112 = var6.field2148 * arg2 * arg2 * var6.field2142[arg1] + 1024 >> 11;
        var8.field2122 = var6.field2146[arg1] & 0xFF;
        var8.field2107 = (arg1 << 8) - (var6.field2145[arg1] & 0x7FFF);
        var8.field2117 = 0;
        var8.field2118 = 0;
        var8.field2119 = 0;
        var8.field2120 = -1;
        var8.field2121 = 0;
        if (this.field2090[arg0] == 0) {
            var8.field2113 = class67.method1153(var7, this.method2767(var8), this.method2768(var8), this.method2769(var8));
        } else {
            var8.field2113 = class67.method1153(var7, this.method2767(var8), 0, this.method2769(var8));
            this.method2798(var8, var6.field2145[arg1] < 0);
        }
        if (var6.field2145[arg1] < 0) {
            var8.field2113.method1220(-1);
        }
        if (var8.field2123 >= 0) {
            class162 var9 = this.field2094[arg0][var8.field2123];
            if (var9 != null && var9.field2120 < 0) {
                this.field2093[arg0][var9.field2111] = null;
                var9.field2120 = 0;
            }
            this.field2094[arg0][var8.field2123] = var8;
        }
        this.field2101.field2153.method2662(var8);
        this.field2093[arg0][arg1] = var8;
    }

    @ObfuscatedName("fg.b(Lfd;ZI)V")
    public void method2798(class162 arg0, boolean arg1) {
        int var3 = arg0.field2114.field1013.length;
        int var5;
        if (arg1 && arg0.field2114.field1016) {
            int var4 = var3 + var3 - arg0.field2114.field1015;
            var5 = (int) ((long) this.field2090[arg0.field2124] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field2113.method1161(true);
            }
        } else {
            var5 = (int) ((long) this.field2090[arg0.field2124] * (long) var3 >> 6);
        }
        arg0.field2113.method1160(var5);
    }

    @ObfuscatedName("fg.f(IIII)V")
    public void method2756(int arg0, int arg1, int arg2) {
        class162 var4 = this.field2093[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2093[arg0][arg1] = null;
        if ((this.field2087[arg0] & 0x2) == 0) {
            var4.field2120 = 0;
            return;
        }
        for (class162 var5 = (class162) this.field2101.field2153.method2666(); var5 != null; var5 = (class162) this.field2101.field2153.method2668()) {
            if (var4.field2124 == var5.field2124 && var5.field2120 < 0 && var4 != var5) {
                var4.field2120 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("fg.o(IIII)V")
    public void method2757(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("fg.m(IIB)V")
    public void method2758(int arg0, int arg1) {
    }

    @ObfuscatedName("fg.y(IIS)V")
    public void method2759(int arg0, int arg1) {
        this.field2075[arg0] = arg1;
    }

    @ObfuscatedName("fg.am(IB)V")
    public void method2760(int arg0) {
        for (class162 var2 = (class162) this.field2101.field2153.method2666(); var2 != null; var2 = (class162) this.field2101.field2153.method2668()) {
            if (arg0 < 0 || var2.field2124 == arg0) {
                if (var2.field2113 != null) {
                    var2.field2113.method1165(Statics.field1033 / 100);
                    if (var2.field2113.method1198()) {
                        this.field2101.field2162.method907(var2.field2113);
                    }
                    var2.method2843();
                }
                if (var2.field2120 < 0) {
                    this.field2093[var2.field2124][var2.field2111] = null;
                }
                var2.method2652();
            }
        }
    }

    @ObfuscatedName("fg.ax(II)V")
    public void method2831(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2831(var2);
            }
            return;
        }
        this.field2078[arg0] = 12800;
        this.field2079[arg0] = 8192;
        this.field2080[arg0] = 16383;
        this.field2075[arg0] = 8192;
        this.field2085[arg0] = 0;
        this.field2086[arg0] = 8192;
        this.method2837(arg0);
        this.method2764(arg0);
        this.field2087[arg0] = 0;
        this.field2095[arg0] = 32767;
        this.field2089[arg0] = 256;
        this.field2090[arg0] = 0;
        this.method2794(arg0, 8192);
    }

    @ObfuscatedName("fg.ag(IB)V")
    public void method2762(int arg0) {
        for (class162 var2 = (class162) this.field2101.field2153.method2666(); var2 != null; var2 = (class162) this.field2101.field2153.method2668()) {
            if ((arg0 < 0 || var2.field2124 == arg0) && var2.field2120 < 0) {
                this.field2093[var2.field2124][var2.field2111] = null;
                var2.field2120 = 0;
            }
        }
    }

    @ObfuscatedName("fg.af(I)V")
    public void method2763() {
        this.method2760(-1);
        this.method2831(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2082[var1] = this.field2084[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2083[var2] = this.field2084[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("fg.ab(IB)V")
    public void method2837(int arg0) {
        if ((this.field2087[arg0] & 0x2) == 0) {
            return;
        }
        for (class162 var2 = (class162) this.field2101.field2153.method2666(); var2 != null; var2 = (class162) this.field2101.field2153.method2668()) {
            if (var2.field2124 == arg0 && this.field2093[arg0][var2.field2111] == null && var2.field2120 < 0) {
                var2.field2120 = 0;
            }
        }
    }

    @ObfuscatedName("fg.as(IB)V")
    public void method2764(int arg0) {
        if ((this.field2087[arg0] & 0x4) == 0) {
            return;
        }
        for (class162 var2 = (class162) this.field2101.field2153.method2666(); var2 != null; var2 = (class162) this.field2101.field2153.method2668()) {
            if (var2.field2124 == arg0) {
                var2.field2126 = 0;
            }
        }
    }

    @ObfuscatedName("fg.ai(IB)V")
    public void method2765(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2756(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2754(var6, var7, var8);
            } else {
                this.method2756(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2757(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2083[var12] = (var14 << 14) + (this.field2083[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2083[var12] = (var14 << 7) + (this.field2083[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2085[var12] = (var14 << 7) + (this.field2085[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2085[var12] = (this.field2085[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2086[var12] = (var14 << 7) + (this.field2086[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2086[var12] = (this.field2086[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2078[var12] = (var14 << 7) + (this.field2078[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2078[var12] = (this.field2078[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2079[var12] = (var14 << 7) + (this.field2079[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2079[var12] = (this.field2079[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2080[var12] = (var14 << 7) + (this.field2080[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2080[var12] = (this.field2080[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2087[var12] |= 0x1;
                } else {
                    this.field2087[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2087[var12] |= 0x2;
                } else {
                    this.method2837(var12);
                    this.field2087[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2095[var12] = (var14 << 7) + (this.field2095[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2095[var12] = (this.field2095[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2095[var12] = (var14 << 7) + (this.field2095[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2095[var12] = (this.field2095[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2760(var12);
            }
            if (var13 == 121) {
                this.method2831(var12);
            }
            if (var13 == 123) {
                this.method2762(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2095[var12];
                if (var15 == 16384) {
                    this.field2089[var12] = (var14 << 7) + (this.field2089[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2095[var12];
                if (var16 == 16384) {
                    this.field2089[var12] = (this.field2089[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2090[var12] = (var14 << 7) + (this.field2090[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2090[var12] = (this.field2090[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2087[var12] |= 0x4;
                } else {
                    this.method2764(var12);
                    this.field2087[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2794(var12, (var14 << 7) + (this.field2091[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2794(var12, (this.field2091[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2753(var17, this.field2083[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2758(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2759(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2763();
            }
        }
    }

    @ObfuscatedName("fg.at(III)V")
    public void method2794(int arg0, int arg1) {
        this.field2091[arg0] = arg1;
        this.field2092[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("fg.ah(Lfd;B)I")
    public int method2767(class162 arg0) {
        int var2 = (arg0.field2115 * arg0.field2106 >> 12) + arg0.field2107;
        int var3 = ((this.field2075[arg0.field2124] - 8192) * this.field2089[arg0.field2124] >> 12) + var2;
        class159 var4 = arg0.field2109;
        if (var4.field2060 > 0 && (var4.field2054 > 0 || this.field2085[arg0.field2124] > 0)) {
            int var5 = var4.field2054 << 2;
            int var6 = var4.field2061 << 1;
            if (arg0.field2116 < var6) {
                var5 = arg0.field2116 * var5 / var6;
            }
            int var7 = (this.field2085[arg0.field2124] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field2108 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field2114.field1012 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field1033 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("fg.ap(Lfd;I)I")
    public int method2768(class162 arg0) {
        class159 var2 = arg0.field2109;
        int var3 = this.field2080[arg0.field2124] * this.field2078[arg0.field2124] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field2112 * var4 + 16384 >> 15;
        int var6 = this.field2096 * var5 + 128 >> 8;
        if (var2.field2055 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field2117 * 1.953125E-5D * (double) var2.field2055) + 0.5D);
        }
        if (var2.field2059 != null) {
            int var7 = arg0.field2118;
            int var8 = var2.field2059[arg0.field2119 + 1];
            if (arg0.field2119 < var2.field2059.length - 2) {
                int var9 = (var2.field2059[arg0.field2119] & 0xFF) << 8;
                int var10 = (var2.field2059[arg0.field2119 + 2] & 0xFF) << 8;
                var8 += (var2.field2059[arg0.field2119 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field2120 > 0 && var2.field2057 != null) {
            int var11 = arg0.field2120;
            int var12 = var2.field2057[arg0.field2121 + 1];
            if (arg0.field2121 < var2.field2057.length - 2) {
                int var13 = (var2.field2057[arg0.field2121] & 0xFF) << 8;
                int var14 = (var2.field2057[arg0.field2121 + 2] & 0xFF) << 8;
                var12 += (var2.field2057[arg0.field2121 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("fg.au(Lfd;I)I")
    public int method2769(class162 arg0) {
        int var2 = this.field2079[arg0.field2124];
        return var2 < 8192 ? arg0.field2122 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field2122) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("fg.p()Lbc;")
    public synchronized class69 method910() {
        return this.field2101;
    }

    @ObfuscatedName("fg.u()Lbc;")
    public synchronized class69 method913() {
        return null;
    }

    @ObfuscatedName("fg.w()I")
    public synchronized int method914() {
        return 0;
    }

    @ObfuscatedName("fg.r([III)V")
    public synchronized void method915(int[] arg0, int arg1, int arg2) {
        if (this.field2100.method2870()) {
            int var4 = this.field2081 * this.field2100.field2132 / Statics.field1033;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2097;
                if (this.field2099 - var5 >= 0L) {
                    this.field2097 = var5;
                    break;
                }
                int var7 = (int) ((this.field2099 - this.field2097 + (long) var4 - 1L) / (long) var4);
                this.field2097 += (long) var4 * (long) var7;
                this.field2101.method915(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2804();
            } while (this.field2100.method2870());
        }
        this.field2101.method915(arg0, arg1, arg2);
    }

    @ObfuscatedName("fg.k(I)V")
    public synchronized void method920(int arg0) {
        if (this.field2100.method2870()) {
            int var2 = this.field2081 * this.field2100.field2132 / Statics.field1033;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2097;
                if (this.field2099 - var3 >= 0L) {
                    this.field2097 = var3;
                    break;
                }
                int var5 = (int) ((this.field2099 - this.field2097 + (long) var2 - 1L) / (long) var2);
                this.field2097 += (long) var2 * (long) var5;
                this.field2101.method920(var5);
                arg0 -= var5;
                this.method2804();
            } while (this.field2100.method2870());
        }
        this.field2101.method920(arg0);
    }

    @ObfuscatedName("fg.bu(I)V")
    public void method2804() {
        int var1 = this.field2102;
        int var2 = this.field2076;
        long var3 = this.field2099;
        while (this.field2076 == var2) {
            while (this.field2100.field2137[var1] == var2) {
                this.field2100.method2852(var1);
                int var5 = this.field2100.method2856(var1);
                if (var5 == 1) {
                    this.field2100.method2854();
                    this.field2100.method2853(var1);
                    if (this.field2100.method2883()) {
                        if (!this.field2077 || var2 == 0) {
                            this.method2763();
                            this.field2100.method2888();
                            return;
                        }
                        this.field2100.method2862(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2765(var5);
                }
                this.field2100.method2855(var1);
                this.field2100.method2853(var1);
            }
            var1 = this.field2100.method2868();
            var2 = this.field2100.field2137[var1];
            var3 = this.field2100.method2859(var2);
        }
        this.field2102 = var1;
        this.field2076 = var2;
        this.field2099 = var3;
    }

    @ObfuscatedName("fg.br(Lfd;I)Z")
    public boolean method2774(class162 arg0) {
        if (arg0.field2113 != null) {
            return false;
        }
        if (arg0.field2120 >= 0) {
            arg0.method2652();
            if (arg0.field2123 > 0 && this.field2094[arg0.field2124][arg0.field2123] == arg0) {
                this.field2094[arg0.field2124][arg0.field2123] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("fg.bk(Lfd;[IIII)Z")
    public boolean method2775(class162 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field2125 = Statics.field1033 / 100;
        if (arg0.field2120 >= 0 && arg0.field2113 == null || arg0.field2113.method1167()) {
            arg0.method2843();
            arg0.method2652();
            if (arg0.field2123 > 0 && this.field2094[arg0.field2124][arg0.field2123] == arg0) {
                this.field2094[arg0.field2124][arg0.field2123] = null;
            }
            return true;
        }
        int var5 = arg0.field2106;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2086[arg0.field2124] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field2106 = var6;
        }
        arg0.field2113.method1166(this.method2767(arg0));
        class159 var7 = arg0.field2109;
        boolean var8 = false;
        arg0.field2116++;
        arg0.field2108 += var7.field2060;
        double var9 = (double) ((arg0.field2111 - 60 << 8) + (arg0.field2115 * arg0.field2106 >> 12)) * 5.086263020833333E-6D;
        if (var7.field2055 > 0) {
            if (var7.field2062 > 0) {
                arg0.field2117 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2062 * var9) + 0.5D);
            } else {
                arg0.field2117 += 128;
            }
        }
        if (var7.field2059 != null) {
            if (var7.field2056 > 0) {
                arg0.field2118 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2056 * var9) + 0.5D);
            } else {
                arg0.field2118 += 128;
            }
            while (arg0.field2119 < var7.field2059.length - 2 && arg0.field2118 > (var7.field2059[arg0.field2119 + 2] & 0xFF) << 8) {
                arg0.field2119 += 2;
            }
            if (arg0.field2119 == var7.field2059.length - 2 && var7.field2059[arg0.field2119 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field2120 >= 0 && var7.field2057 != null && (this.field2087[arg0.field2124] & 0x1) == 0 && (arg0.field2123 < 0 || this.field2094[arg0.field2124][arg0.field2123] != arg0)) {
            if (var7.field2063 > 0) {
                arg0.field2120 += (int) (128.0D * Math.pow(2.0D, (double) var7.field2063 * var9) + 0.5D);
            } else {
                arg0.field2120 += 128;
            }
            while (arg0.field2121 < var7.field2057.length - 2 && arg0.field2120 > (var7.field2057[arg0.field2121 + 2] & 0xFF) << 8) {
                arg0.field2121 += 2;
            }
            if (arg0.field2121 == var7.field2057.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field2113.method1193(arg0.field2125, this.method2768(arg0), this.method2769(arg0));
            return false;
        }
        arg0.field2113.method1165(arg0.field2125);
        if (arg1 == null) {
            arg0.field2113.method920(arg3);
        } else {
            arg0.field2113.method915(arg1, arg2, arg3);
        }
        if (arg0.field2113.method1198()) {
            this.field2101.field2162.method907(arg0.field2113);
        }
        arg0.method2843();
        if (arg0.field2120 >= 0) {
            arg0.method2652();
            if (arg0.field2123 > 0 && this.field2094[arg0.field2124][arg0.field2123] == arg0) {
                this.field2094[arg0.field2124][arg0.field2123] = null;
            }
        }
        return true;
    }
}

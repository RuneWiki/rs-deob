package deob;

@ObfuscatedName("ew")
public class class148 extends class129 {

    @ObfuscatedName("ew.i")
    public class103 field2230 = new class103(128);

    @ObfuscatedName("ew.e")
    public int field2225 = 256;

    @ObfuscatedName("ew.a")
    public int field2222 = 1000000;

    @ObfuscatedName("ew.g")
    public int[] field2223 = new int[16];

    @ObfuscatedName("ew.w")
    public int[] field2231 = new int[16];

    @ObfuscatedName("ew.v")
    public int[] field2227 = new int[16];

    @ObfuscatedName("ew.u")
    public int[] field2241 = new int[16];

    @ObfuscatedName("ew.m")
    public int[] field2233 = new int[16];

    @ObfuscatedName("ew.b")
    public int[] field2235 = new int[16];

    @ObfuscatedName("ew.f")
    public int[] field2238 = new int[16];

    @ObfuscatedName("ew.d")
    public int[] field2242 = new int[16];

    @ObfuscatedName("ew.x")
    public int[] field2226 = new int[16];

    @ObfuscatedName("ew.y")
    public int[] field2247 = new int[16];

    @ObfuscatedName("ew.j")
    public int[] field2236 = new int[16];

    @ObfuscatedName("ew.s")
    public int[] field2237 = new int[16];

    @ObfuscatedName("ew.p")
    public int[] field2239 = new int[16];

    @ObfuscatedName("ew.ak")
    public int[] field2221 = new int[16];

    @ObfuscatedName("ew.ap")
    public int[] field2240 = new int[16];

    @ObfuscatedName("ew.ai")
    public class138[][] field2229 = new class138[16][128];

    @ObfuscatedName("ew.ae")
    public class138[][] field2224 = new class138[16][128];

    @ObfuscatedName("ew.ad")
    public class80 field2243 = new class80();

    @ObfuscatedName("ew.am")
    public boolean field2244;

    @ObfuscatedName("ew.ah")
    public int field2245;

    @ObfuscatedName("ew.au")
    public int field2246;

    @ObfuscatedName("ew.ac")
    public long field2220;

    @ObfuscatedName("ew.at")
    public long field2248;

    @ObfuscatedName("ew.aq")
    public class149 field2249 = new class149(this);

    public class148() {
        this.method2214();
    }

    @ObfuscatedName("ew.ak(II)V")
    public synchronized void method2194(int arg0) {
        this.field2225 = arg0;
    }

    @ObfuscatedName("ew.ap(B)I")
    public int method2268() {
        return this.field2225;
    }

    @ObfuscatedName("ew.ai(Leu;Lcy;Ly;IB)Z")
    public synchronized boolean method2196(class136 arg0, class86 arg1, class23 arg2, int arg3) {
        arg0.method1743();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class143 var7 = (class143) arg0.field1729.method1262(); var7 != null; var7 = (class143) arg0.field1729.method1266()) {
            int var8 = (int) var7.field1500;
            class137 var9 = (class137) this.field2230.method1259((long) var8);
            if (var9 == null) {
                byte[] var10 = arg1.method1013(var8);
                class137 var11;
                if (var10 == null) {
                    var11 = null;
                } else {
                    var11 = new class137(var10);
                }
                var9 = var11;
                if (var11 == null) {
                    var5 = false;
                    continue;
                }
                this.field2230.method1265(var11, (long) var8);
            }
            if (!var9.method1753(arg2, var7.field1898, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method1751();
        }
        return var5;
    }

    @ObfuscatedName("ew.ae(I)V")
    public synchronized void method2197() {
        for (class137 var1 = (class137) this.field2230.method1262(); var1 != null; var1 = (class137) this.field2230.method1266()) {
            var1.method1754();
        }
    }

    @ObfuscatedName("ew.ad(B)V")
    public synchronized void method2198() {
        for (class137 var1 = (class137) this.field2230.method1262(); var1 != null; var1 = (class137) this.field2230.method1266()) {
            var1.method1307();
        }
    }

    @ObfuscatedName("ew.am(Leu;ZI)V")
    public synchronized void method2199(class136 arg0, boolean arg1) {
        this.method2263();
        this.field2243.method901(arg0.field1728);
        this.field2244 = arg1;
        this.field2220 = 0L;
        int var3 = this.field2243.method904();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2243.method905(var4);
            this.field2243.method906(var4);
            this.field2243.method915(var4);
        }
        this.field2245 = this.field2243.method912();
        this.field2246 = this.field2243.field1130[this.field2245];
        this.field2248 = this.field2243.method911(this.field2246);
    }

    @ObfuscatedName("ew.ah(I)V")
    public synchronized void method2263() {
        this.field2243.method902();
        this.method2214();
    }

    @ObfuscatedName("ew.au(B)Z")
    public synchronized boolean method2275() {
        return this.field2243.method903();
    }

    @ObfuscatedName("ew.ac(III)V")
    public synchronized void method2226(int arg0, int arg1) {
        this.method2203(arg0, arg1);
    }

    @ObfuscatedName("ew.at(III)V")
    public void method2203(int arg0, int arg1) {
        this.field2241[arg0] = arg1;
        this.field2235[arg0] = arg1 & 0xFFFFFF80;
        this.method2218(arg0, arg1);
    }

    @ObfuscatedName("ew.aq(III)V")
    public void method2218(int arg0, int arg1) {
        if (this.field2233[arg0] != arg1) {
            this.field2233[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2224[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("ew.ar(IIII)V")
    public void method2205(int arg0, int arg1, int arg2) {
        this.method2221(arg0, arg1, 64);
        if ((this.field2247[arg0] & 0x2) != 0) {
            for (class138 var4 = (class138) this.field2249.field2251.method1286(); var4 != null; var4 = (class138) this.field2249.field2251.method1288()) {
                if (var4.field1748 == arg0 && var4.field1746 < 0) {
                    this.field2229[arg0][var4.field1745] = null;
                    this.field2229[arg0][arg1] = var4;
                    int var5 = (var4.field1750 * var4.field1749 >> 12) + var4.field1741;
                    var4.field1741 += arg1 - var4.field1745 << 8;
                    var4.field1749 = var5 - var4.field1741;
                    var4.field1750 = 4096;
                    var4.field1745 = arg1;
                    return;
                }
            }
        }
        class137 var6 = (class137) this.field2230.method1259((long) this.field2233[arg0]);
        if (var6 == null) {
            return;
        }
        class145 var7 = var6.field1730[arg1];
        if (var7 == null) {
            return;
        }
        class138 var8 = new class138();
        var8.field1748 = arg0;
        var8.field1754 = var6;
        var8.field1742 = var7;
        var8.field1743 = var6.field1735[arg1];
        var8.field1740 = var6.field1736[arg1];
        var8.field1745 = arg1;
        var8.field1744 = var6.field1737 * arg2 * arg2 * var6.field1733[arg1] + 1024 >> 11;
        var8.field1753 = var6.field1734[arg1] & 0xFF;
        var8.field1741 = (arg1 << 8) - (var6.field1732[arg1] & 0x7FFF);
        var8.field1751 = 0;
        var8.field1752 = 0;
        var8.field1758 = 0;
        var8.field1746 = -1;
        var8.field1755 = 0;
        if (this.field2239[arg0] == 0) {
            var8.field1747 = class146.method2133(var7, this.method2201(var8), this.method2219(var8), this.method2220(var8));
        } else {
            var8.field1747 = class146.method2133(var7, this.method2201(var8), 0, this.method2220(var8));
            this.method2206(var8, var6.field1732[arg1] < 0);
        }
        if (var6.field1732[arg1] < 0) {
            var8.field1747.method2056(-1);
        }
        if (var8.field1740 >= 0) {
            class138 var9 = this.field2224[arg0][var8.field1740];
            if (var9 != null && var9.field1746 < 0) {
                this.field2229[arg0][var9.field1745] = null;
                var9.field1746 = 0;
            }
            this.field2224[arg0][var8.field1740] = var8;
        }
        this.field2249.field2251.method1284(var8);
        this.field2229[arg0][arg1] = var8;
    }

    @ObfuscatedName("ew.aa(Lem;ZI)V")
    public void method2206(class138 arg0, boolean arg1) {
        int var3 = arg0.field1742.field2199.length;
        int var5;
        if (arg1 && arg0.field1742.field2200) {
            int var4 = var3 + var3 - arg0.field1742.field2198;
            var5 = (int) ((long) this.field2239[arg0.field1748] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1747.method2062(true);
            }
        } else {
            var5 = (int) ((long) this.field2239[arg0.field1748] * (long) var3 >> 6);
        }
        arg0.field1747.method2061(var5);
    }

    @ObfuscatedName("ew.ay(IIII)V")
    public void method2221(int arg0, int arg1, int arg2) {
        class138 var4 = this.field2229[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2229[arg0][arg1] = null;
        if ((this.field2247[arg0] & 0x2) == 0) {
            var4.field1746 = 0;
            return;
        }
        for (class138 var5 = (class138) this.field2249.field2251.method1305(); var5 != null; var5 = (class138) this.field2249.field2251.method1287()) {
            if (var4.field1748 == var5.field1748 && var5.field1746 < 0 && var4 != var5) {
                var4.field1746 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("ew.ax(IIII)V")
    public void method2246(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("ew.av(III)V")
    public void method2209(int arg0, int arg1) {
    }

    @ObfuscatedName("ew.az(III)V")
    public void method2210(int arg0, int arg1) {
        this.field2238[arg0] = arg1;
    }

    @ObfuscatedName("ew.al(II)V")
    public void method2200(int arg0) {
        for (class138 var2 = (class138) this.field2249.field2251.method1305(); var2 != null; var2 = (class138) this.field2249.field2251.method1287()) {
            if (arg0 < 0 || var2.field1748 == arg0) {
                if (var2.field1747 != null) {
                    var2.field1747.method2075(Statics.field823 / 100);
                    if (var2.field1747.method2070()) {
                        this.field2249.field2253.method2172(var2.field1747);
                    }
                    var2.method1757();
                }
                if (var2.field1746 < 0) {
                    this.field2229[var2.field1748][var2.field1745] = null;
                }
                var2.method1307();
            }
        }
    }

    @ObfuscatedName("ew.ag(II)V")
    public void method2212(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2212(var2);
            }
            return;
        }
        this.field2223[arg0] = 12800;
        this.field2231[arg0] = 8192;
        this.field2227[arg0] = 16383;
        this.field2238[arg0] = 8192;
        this.field2242[arg0] = 0;
        this.field2226[arg0] = 8192;
        this.method2215(arg0);
        this.method2216(arg0);
        this.field2247[arg0] = 0;
        this.field2236[arg0] = 32767;
        this.field2237[arg0] = 256;
        this.field2239[arg0] = 0;
        this.method2259(arg0, 8192);
    }

    @ObfuscatedName("ew.as(II)V")
    public void method2213(int arg0) {
        for (class138 var2 = (class138) this.field2249.field2251.method1305(); var2 != null; var2 = (class138) this.field2249.field2251.method1287()) {
            if ((arg0 < 0 || var2.field1748 == arg0) && var2.field1746 < 0) {
                this.field2229[var2.field1748][var2.field1745] = null;
                var2.field1746 = 0;
            }
        }
    }

    @ObfuscatedName("ew.ab(I)V")
    public void method2214() {
        this.method2200(-1);
        this.method2212(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2233[var1] = this.field2241[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2235[var2] = this.field2241[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("ew.af(IB)V")
    public void method2215(int arg0) {
        if ((this.field2247[arg0] & 0x2) == 0) {
            return;
        }
        for (class138 var2 = (class138) this.field2249.field2251.method1305(); var2 != null; var2 = (class138) this.field2249.field2251.method1287()) {
            if (var2.field1748 == arg0 && this.field2229[arg0][var2.field1745] == null && var2.field1746 < 0) {
                var2.field1746 = 0;
            }
        }
    }

    @ObfuscatedName("ew.aw(II)V")
    public void method2216(int arg0) {
        if ((this.field2247[arg0] & 0x4) == 0) {
            return;
        }
        for (class138 var2 = (class138) this.field2249.field2251.method1305(); var2 != null; var2 = (class138) this.field2249.field2251.method1287()) {
            if (var2.field1748 == arg0) {
                var2.field1761 = 0;
            }
        }
    }

    @ObfuscatedName("ew.bk(II)V")
    public void method2217(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2221(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2205(var6, var7, var8);
            } else {
                this.method2221(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2246(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2235[var12] = (var14 << 14) + (this.field2235[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2235[var12] = (var14 << 7) + (this.field2235[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2242[var12] = (var14 << 7) + (this.field2242[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2242[var12] = (this.field2242[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2226[var12] = (var14 << 7) + (this.field2226[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2226[var12] = (this.field2226[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2223[var12] = (var14 << 7) + (this.field2223[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2223[var12] = (this.field2223[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2231[var12] = (var14 << 7) + (this.field2231[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2231[var12] = (this.field2231[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2227[var12] = (var14 << 7) + (this.field2227[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2227[var12] = (this.field2227[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2247[var12] |= 0x1;
                } else {
                    this.field2247[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2247[var12] |= 0x2;
                } else {
                    this.method2215(var12);
                    this.field2247[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2236[var12] = (var14 << 7) + (this.field2236[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2236[var12] = (this.field2236[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2236[var12] = (var14 << 7) + (this.field2236[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2236[var12] = (this.field2236[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2200(var12);
            }
            if (var13 == 121) {
                this.method2212(var12);
            }
            if (var13 == 123) {
                this.method2213(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2236[var12];
                if (var15 == 16384) {
                    this.field2237[var12] = (var14 << 7) + (this.field2237[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2236[var12];
                if (var16 == 16384) {
                    this.field2237[var12] = (this.field2237[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2239[var12] = (var14 << 7) + (this.field2239[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2239[var12] = (this.field2239[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2247[var12] |= 0x4;
                } else {
                    this.method2216(var12);
                    this.field2247[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2259(var12, (var14 << 7) + (this.field2221[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2259(var12, (this.field2221[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2218(var17, this.field2235[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2209(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
            this.method2210(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2214();
            }
        }
    }

    @ObfuscatedName("ew.ba(III)V")
    public void method2259(int arg0, int arg1) {
        this.field2221[arg0] = arg1;
        this.field2240[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("ew.bj(Lem;I)I")
    public int method2201(class138 arg0) {
        int var2 = (arg0.field1750 * arg0.field1749 >> 12) + arg0.field1741;
        int var3 = ((this.field2238[arg0.field1748] - 8192) * this.field2237[arg0.field1748] >> 12) + var2;
        class79 var4 = arg0.field1743;
        if (var4.field1123 > 0 && (var4.field1122 > 0 || this.field2242[arg0.field1748] > 0)) {
            int var5 = var4.field1122 << 2;
            int var6 = var4.field1124 << 1;
            if (arg0.field1756 < var6) {
                var5 = arg0.field1756 * var5 / var6;
            }
            int var7 = (this.field2242[arg0.field1748] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1757 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1742.field2196 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field823 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("ew.bs(Lem;I)I")
    public int method2219(class138 arg0) {
        class79 var2 = arg0.field1743;
        int var3 = this.field2223[arg0.field1748] * this.field2227[arg0.field1748] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1744 * var4 + 16384 >> 15;
        int var6 = this.field2225 * var5 + 128 >> 8;
        if (var2.field1118 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1751 * 1.953125E-5D * (double) var2.field1118) + 0.5D);
        }
        if (var2.field1119 != null) {
            int var7 = arg0.field1752;
            int var8 = var2.field1119[arg0.field1758 + 1];
            if (arg0.field1758 < var2.field1119.length - 2) {
                int var9 = (var2.field1119[arg0.field1758] & 0xFF) << 8;
                int var10 = (var2.field1119[arg0.field1758 + 2] & 0xFF) << 8;
                var8 += (var2.field1119[arg0.field1758 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1746 > 0 && var2.field1117 != null) {
            int var11 = arg0.field1746;
            int var12 = var2.field1117[arg0.field1755 + 1];
            if (arg0.field1755 < var2.field1117.length - 2) {
                int var13 = (var2.field1117[arg0.field1755] & 0xFF) << 8;
                int var14 = (var2.field1117[arg0.field1755 + 2] & 0xFF) << 8;
                var12 += (var2.field1117[arg0.field1755 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("ew.bz(Lem;I)I")
    public int method2220(class138 arg0) {
        int var2 = this.field2231[arg0.field1748];
        return var2 < 8192 ? arg0.field1753 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1753) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("ew.l()Ldb;")
    public synchronized class129 method1512() {
        return this.field2249;
    }

    @ObfuscatedName("ew.i()Ldb;")
    public synchronized class129 method1493() {
        return null;
    }

    @ObfuscatedName("ew.e()I")
    public synchronized int method1504() {
        return 0;
    }

    @ObfuscatedName("ew.g([III)V")
    public synchronized void method1499(int[] arg0, int arg1, int arg2) {
        if (this.field2243.method903()) {
            int var4 = this.field2222 * this.field2243.field1129 / Statics.field823;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2220;
                if (this.field2248 - var5 >= 0L) {
                    this.field2220 = var5;
                    break;
                }
                int var7 = (int) ((this.field2248 - this.field2220 + (long) var4 - 1L) / (long) var4);
                this.field2220 += (long) var4 * (long) var7;
                this.field2249.method1499(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2223();
            } while (this.field2243.method903());
        }
        this.field2249.method1499(arg0, arg1, arg2);
    }

    @ObfuscatedName("ew.w(I)V")
    public synchronized void method1500(int arg0) {
        if (this.field2243.method903()) {
            int var2 = this.field2222 * this.field2243.field1129 / Statics.field823;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2220;
                if (this.field2248 - var3 >= 0L) {
                    this.field2220 = var3;
                    break;
                }
                int var5 = (int) ((this.field2248 - this.field2220 + (long) var2 - 1L) / (long) var2);
                this.field2220 += (long) var2 * (long) var5;
                this.field2249.method1500(var5);
                arg0 -= var5;
                this.method2223();
            } while (this.field2243.method903());
        }
        this.field2249.method1500(arg0);
    }

    @ObfuscatedName("ew.bl(B)V")
    public void method2223() {
        int var1 = this.field2245;
        int var2 = this.field2246;
        long var3 = this.field2248;
        while (this.field2246 == var2) {
            while (this.field2243.field1130[var1] == var2) {
                this.field2243.method905(var1);
                int var5 = this.field2243.method908(var1);
                if (var5 == 1) {
                    this.field2243.method907();
                    this.field2243.method915(var1);
                    if (this.field2243.method931()) {
                        if (!this.field2244 || var2 == 0) {
                            this.method2214();
                            this.field2243.method902();
                            return;
                        }
                        this.field2243.method914(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2217(var5);
                }
                this.field2243.method906(var1);
                this.field2243.method915(var1);
            }
            var1 = this.field2243.method912();
            var2 = this.field2243.field1130[var1];
            var3 = this.field2243.method911(var2);
        }
        this.field2245 = var1;
        this.field2246 = var2;
        this.field2248 = var3;
    }

    @ObfuscatedName("ew.bf(Lem;I)Z")
    public boolean method2224(class138 arg0) {
        if (arg0.field1747 != null) {
            return false;
        }
        if (arg0.field1746 >= 0) {
            arg0.method1307();
            if (arg0.field1740 > 0 && this.field2224[arg0.field1748][arg0.field1740] == arg0) {
                this.field2224[arg0.field1748][arg0.field1740] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("ew.bn(Lem;[IIIB)Z")
    public boolean method2260(class138 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1759 = Statics.field823 / 100;
        if (arg0.field1746 >= 0 && arg0.field1747 == null || arg0.field1747.method2069()) {
            arg0.method1757();
            arg0.method1307();
            if (arg0.field1740 > 0 && this.field2224[arg0.field1748][arg0.field1740] == arg0) {
                this.field2224[arg0.field1748][arg0.field1740] = null;
            }
            return true;
        }
        int var5 = arg0.field1750;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2226[arg0.field1748] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1750 = var6;
        }
        arg0.field1747.method2128(this.method2201(arg0));
        class79 var7 = arg0.field1743;
        boolean var8 = false;
        arg0.field1756++;
        arg0.field1757 += var7.field1123;
        double var9 = (double) ((arg0.field1745 - 60 << 8) + (arg0.field1750 * arg0.field1749 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1118 > 0) {
            if (var7.field1121 > 0) {
                arg0.field1751 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1121 * var9) + 0.5D);
            } else {
                arg0.field1751 += 128;
            }
        }
        if (var7.field1119 != null) {
            if (var7.field1116 > 0) {
                arg0.field1752 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1116 * var9) + 0.5D);
            } else {
                arg0.field1752 += 128;
            }
            while (arg0.field1758 < var7.field1119.length - 2 && arg0.field1752 > (var7.field1119[arg0.field1758 + 2] & 0xFF) << 8) {
                arg0.field1758 += 2;
            }
            if (arg0.field1758 == var7.field1119.length - 2 && var7.field1119[arg0.field1758 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1746 >= 0 && var7.field1117 != null && (this.field2247[arg0.field1748] & 0x1) == 0 && (arg0.field1740 < 0 || this.field2224[arg0.field1748][arg0.field1740] != arg0)) {
            if (var7.field1120 > 0) {
                arg0.field1746 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1120 * var9) + 0.5D);
            } else {
                arg0.field1746 += 128;
            }
            while (arg0.field1755 < var7.field1117.length - 2 && arg0.field1746 > (var7.field1117[arg0.field1755 + 2] & 0xFF) << 8) {
                arg0.field1755 += 2;
            }
            if (arg0.field1755 == var7.field1117.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1747.method2065(arg0.field1759, this.method2219(arg0), this.method2220(arg0));
            return false;
        }
        arg0.field1747.method2075(arg0.field1759);
        if (arg1 == null) {
            arg0.field1747.method1500(arg3);
        } else {
            arg0.field1747.method1499(arg1, arg2, arg3);
        }
        if (arg0.field1747.method2070()) {
            this.field2249.field2253.method2172(arg0.field1747);
        }
        arg0.method1757();
        if (arg0.field1746 >= 0) {
            arg0.method1307();
            if (arg0.field1740 > 0 && this.field2224[arg0.field1748][arg0.field1740] == arg0) {
                this.field2224[arg0.field1748][arg0.field1740] = null;
            }
        }
        return true;
    }
}

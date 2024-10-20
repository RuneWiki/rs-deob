package deob;

@ObfuscatedName("em")
public class class149 extends class130 {

    @ObfuscatedName("em.d")
    public class104 field2240 = new class104(128);

    @ObfuscatedName("em.k")
    public int field2224 = 256;

    @ObfuscatedName("em.u")
    public int field2225 = 1000000;

    @ObfuscatedName("em.v")
    public int[] field2226 = new int[16];

    @ObfuscatedName("em.f")
    public int[] field2227 = new int[16];

    @ObfuscatedName("em.s")
    public int[] field2250 = new int[16];

    @ObfuscatedName("em.j")
    public int[] field2249 = new int[16];

    @ObfuscatedName("em.e")
    public int[] field2223 = new int[16];

    @ObfuscatedName("em.t")
    public int[] field2231 = new int[16];

    @ObfuscatedName("em.y")
    public int[] field2229 = new int[16];

    @ObfuscatedName("em.b")
    public int[] field2248 = new int[16];

    @ObfuscatedName("em.w")
    public int[] field2230 = new int[16];

    @ObfuscatedName("em.n")
    public int[] field2238 = new int[16];

    @ObfuscatedName("em.x")
    public int[] field2239 = new int[16];

    @ObfuscatedName("em.i")
    public int[] field2234 = new int[16];

    @ObfuscatedName("em.m")
    public int[] field2241 = new int[16];

    @ObfuscatedName("em.ai")
    public int[] field2242 = new int[16];

    @ObfuscatedName("em.aa")
    public int[] field2228 = new int[16];

    @ObfuscatedName("em.af")
    public class139[][] field2244 = new class139[16][128];

    @ObfuscatedName("em.ae")
    public class139[][] field2245 = new class139[16][128];

    @ObfuscatedName("em.at")
    public class81 field2246 = new class81();

    @ObfuscatedName("em.aj")
    public boolean field2247;

    @ObfuscatedName("em.ar")
    public int field2232;

    @ObfuscatedName("em.au")
    public int field2243;

    @ObfuscatedName("em.an")
    public long field2233;

    @ObfuscatedName("em.az")
    public long field2251;

    @ObfuscatedName("em.ac")
    public class150 field2252 = new class150(this);

    public class149() {
        this.method2226();
    }

    @ObfuscatedName("em.ar(IB)V")
    public synchronized void method2207(int arg0) {
        this.field2224 = arg0;
    }

    @ObfuscatedName("em.au(I)I")
    public int method2208() {
        return this.field2224;
    }

    @ObfuscatedName("em.an(Len;Lcv;Ln;II)Z")
    public synchronized boolean method2209(class137 arg0, class87 arg1, class23 arg2, int arg3) {
        arg0.method1772();
        boolean var5 = true;
        int[] var6 = null;
        if (arg3 > 0) {
            var6 = new int[] { arg3 };
        }
        for (class144 var7 = (class144) arg0.field1728.method1280(); var7 != null; var7 = (class144) arg0.field1728.method1282()) {
            int var8 = (int) var7.field1513;
            class138 var9 = (class138) this.field2240.method1290((long) var8);
            if (var9 == null) {
                var9 = class138.method8(arg1, var8);
                if (var9 == null) {
                    var5 = false;
                    continue;
                }
                this.field2240.method1279(var9, (long) var8);
            }
            if (!var9.method1777(arg2, var7.field1896, var6)) {
                var5 = false;
            }
        }
        if (var5) {
            arg0.method1773();
        }
        return var5;
    }

    @ObfuscatedName("em.az(I)V")
    public synchronized void method2210() {
        for (class138 var1 = (class138) this.field2240.method1280(); var1 != null; var1 = (class138) this.field2240.method1282()) {
            var1.method1778();
        }
    }

    @ObfuscatedName("em.ac(I)V")
    public synchronized void method2211() {
        for (class138 var1 = (class138) this.field2240.method1280(); var1 != null; var1 = (class138) this.field2240.method1282()) {
            var1.method1328();
        }
    }

    @ObfuscatedName("em.ap(Len;ZI)V")
    public synchronized void method2212(class137 arg0, boolean arg1) {
        this.method2286();
        this.field2246.method954(arg0.field1729);
        this.field2247 = arg1;
        this.field2233 = 0L;
        int var3 = this.field2246.method930();
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2246.method922(var4);
            this.field2246.method929(var4);
            this.field2246.method927(var4);
        }
        this.field2232 = this.field2246.method933();
        this.field2243 = this.field2246.field1150[this.field2232];
        this.field2251 = this.field2246.method932(this.field2243);
    }

    @ObfuscatedName("em.ad(I)V")
    public synchronized void method2286() {
        this.field2246.method953();
        this.method2226();
    }

    @ObfuscatedName("em.ax(I)Z")
    public synchronized boolean method2214() {
        return this.field2246.method920();
    }

    @ObfuscatedName("em.as(III)V")
    public synchronized void method2215(int arg0, int arg1) {
        this.method2216(arg0, arg1);
    }

    @ObfuscatedName("em.ak(IIS)V")
    public void method2216(int arg0, int arg1) {
        this.field2249[arg0] = arg1;
        this.field2231[arg0] = arg1 & 0xFFFFFF80;
        this.method2217(arg0, arg1);
    }

    @ObfuscatedName("em.av(III)V")
    public void method2217(int arg0, int arg1) {
        if (this.field2223[arg0] != arg1) {
            this.field2223[arg0] = arg1;
            for (int var3 = 0; var3 < 128; var3++) {
                this.field2245[arg0][var3] = null;
            }
        }
    }

    @ObfuscatedName("em.ay(IIII)V")
    public void method2218(int arg0, int arg1, int arg2) {
        this.method2285(arg0, arg1, 64);
        if ((this.field2238[arg0] & 0x2) != 0) {
            for (class139 var4 = (class139) this.field2252.field2253.method1296(); var4 != null; var4 = (class139) this.field2252.field2253.method1300()) {
                if (var4.field1742 == arg0 && var4.field1753 < 0) {
                    this.field2244[arg0][var4.field1758] = null;
                    this.field2244[arg0][arg1] = var4;
                    int var5 = (var4.field1757 * var4.field1748 >> 12) + var4.field1747;
                    var4.field1747 += arg1 - var4.field1758 << 8;
                    var4.field1748 = var5 - var4.field1747;
                    var4.field1757 = 4096;
                    var4.field1758 = arg1;
                    return;
                }
            }
        }
        class138 var6 = (class138) this.field2240.method1290((long) this.field2223[arg0]);
        if (var6 == null) {
            return;
        }
        class146 var7 = var6.field1731[arg1];
        if (var7 == null) {
            return;
        }
        class139 var8 = new class139();
        var8.field1742 = arg0;
        var8.field1740 = var6;
        var8.field1741 = var7;
        var8.field1745 = var6.field1730[arg1];
        var8.field1751 = var6.field1736[arg1];
        var8.field1758 = arg1;
        var8.field1755 = var6.field1737 * arg2 * arg2 * var6.field1733[arg1] + 1024 >> 11;
        var8.field1746 = var6.field1734[arg1] & 0xFF;
        var8.field1747 = (arg1 << 8) - (var6.field1732[arg1] & 0x7FFF);
        var8.field1750 = 0;
        var8.field1749 = 0;
        var8.field1752 = 0;
        var8.field1753 = -1;
        var8.field1754 = 0;
        if (this.field2241[arg0] == 0) {
            var8.field1744 = class147.method2056(var7, this.method2276(var8), this.method2232(var8), this.method2233(var8));
        } else {
            var8.field1744 = class147.method2056(var7, this.method2276(var8), 0, this.method2233(var8));
            this.method2219(var8, var6.field1732[arg1] < 0);
        }
        if (var6.field1732[arg1] < 0) {
            var8.field1744.method2058(-1);
        }
        if (var8.field1751 >= 0) {
            class139 var9 = this.field2245[arg0][var8.field1751];
            if (var9 != null && var9.field1753 < 0) {
                this.field2244[arg0][var9.field1758] = null;
                var9.field1753 = 0;
            }
            this.field2245[arg0][var8.field1751] = var8;
        }
        this.field2252.field2253.method1293(var8);
        this.field2244[arg0][arg1] = var8;
    }

    @ObfuscatedName("em.aw(Lep;ZI)V")
    public void method2219(class139 arg0, boolean arg1) {
        int var3 = arg0.field1741.field2200.length;
        int var5;
        if (arg1 && arg0.field1741.field2199) {
            int var4 = var3 + var3 - arg0.field1741.field2201;
            var5 = (int) ((long) this.field2241[arg0.field1742] * (long) var4 >> 6);
            int var6 = var3 << 8;
            if (var5 >= var6) {
                var5 = var6 + var6 - 1 - var5;
                arg0.field1744.method2065(true);
            }
        } else {
            var5 = (int) ((long) this.field2241[arg0.field1742] * (long) var3 >> 6);
        }
        arg0.field1744.method2064(var5);
    }

    @ObfuscatedName("em.ag(IIII)V")
    public void method2285(int arg0, int arg1, int arg2) {
        class139 var4 = this.field2244[arg0][arg1];
        if (var4 == null) {
            return;
        }
        this.field2244[arg0][arg1] = null;
        if ((this.field2238[arg0] & 0x2) == 0) {
            var4.field1753 = 0;
            return;
        }
        for (class139 var5 = (class139) this.field2252.field2253.method1298(); var5 != null; var5 = (class139) this.field2252.field2253.method1299()) {
            if (var4.field1742 == var5.field1742 && var5.field1753 < 0 && var4 != var5) {
                var4.field1753 = 0;
                break;
            }
        }
    }

    @ObfuscatedName("em.al(IIIB)V")
    public void method2221(int arg0, int arg1, int arg2) {
    }

    @ObfuscatedName("em.aq(IIB)V")
    public void method2292(int arg0, int arg1) {
    }

    @ObfuscatedName("em.ah(III)V")
    public void method2223(int arg0, int arg1) {
        this.field2229[arg0] = arg1;
    }

    @ObfuscatedName("em.ao(II)V")
    public void method2264(int arg0) {
        for (class139 var2 = (class139) this.field2252.field2253.method1298(); var2 != null; var2 = (class139) this.field2252.field2253.method1299()) {
            if (arg0 < 0 || var2.field1742 == arg0) {
                if (var2.field1744 != null) {
                    var2.field1744.method2069(Statics.field354 / 100);
                    if (var2.field1744.method2118()) {
                        this.field2252.field2255.method2194(var2.field1744);
                    }
                    var2.method1783();
                }
                if (var2.field1753 < 0) {
                    this.field2244[var2.field1742][var2.field1758] = null;
                }
                var2.method1328();
            }
        }
    }

    @ObfuscatedName("em.bg(II)V")
    public void method2220(int arg0) {
        if (arg0 < 0) {
            for (int var2 = 0; var2 < 16; var2++) {
                this.method2220(var2);
            }
            return;
        }
        this.field2226[arg0] = 12800;
        this.field2227[arg0] = 8192;
        this.field2250[arg0] = 16383;
        this.field2229[arg0] = 8192;
        this.field2248[arg0] = 0;
        this.field2230[arg0] = 8192;
        this.method2275(arg0);
        this.method2228(arg0);
        this.field2238[arg0] = 0;
        this.field2239[arg0] = 32767;
        this.field2234[arg0] = 256;
        this.field2241[arg0] = 0;
        this.method2237(arg0, 8192);
    }

    @ObfuscatedName("em.be(II)V")
    public void method2225(int arg0) {
        for (class139 var2 = (class139) this.field2252.field2253.method1298(); var2 != null; var2 = (class139) this.field2252.field2253.method1299()) {
            if ((arg0 < 0 || var2.field1742 == arg0) && var2.field1753 < 0) {
                this.field2244[var2.field1742][var2.field1758] = null;
                var2.field1753 = 0;
            }
        }
    }

    @ObfuscatedName("em.bi(I)V")
    public void method2226() {
        this.method2264(-1);
        this.method2220(-1);
        for (int var1 = 0; var1 < 16; var1++) {
            this.field2223[var1] = this.field2249[var1];
        }
        for (int var2 = 0; var2 < 16; var2++) {
            this.field2231[var2] = this.field2249[var2] & 0xFFFFFF80;
        }
    }

    @ObfuscatedName("em.bp(II)V")
    public void method2275(int arg0) {
        if ((this.field2238[arg0] & 0x2) == 0) {
            return;
        }
        for (class139 var2 = (class139) this.field2252.field2253.method1298(); var2 != null; var2 = (class139) this.field2252.field2253.method1299()) {
            if (var2.field1742 == arg0 && this.field2244[arg0][var2.field1758] == null && var2.field1753 < 0) {
                var2.field1753 = 0;
            }
        }
    }

    @ObfuscatedName("em.bw(IB)V")
    public void method2228(int arg0) {
        if ((this.field2238[arg0] & 0x4) == 0) {
            return;
        }
        for (class139 var2 = (class139) this.field2252.field2253.method1298(); var2 != null; var2 = (class139) this.field2252.field2253.method1299()) {
            if (var2.field1742 == arg0) {
                var2.field1760 = 0;
            }
        }
    }

    @ObfuscatedName("em.bu(II)V")
    public void method2229(int arg0) {
        int var2 = arg0 & 0xF0;
        if (var2 == 128) {
            int var3 = arg0 & 0xF;
            int var4 = arg0 >> 8 & 0x7F;
            int var5 = arg0 >> 16 & 0x7F;
            this.method2285(var3, var4, var5);
        } else if (var2 == 144) {
            int var6 = arg0 & 0xF;
            int var7 = arg0 >> 8 & 0x7F;
            int var8 = arg0 >> 16 & 0x7F;
            if (var8 > 0) {
                this.method2218(var6, var7, var8);
            } else {
                this.method2285(var6, var7, 64);
            }
        } else if (var2 == 160) {
            int var9 = arg0 & 0xF;
            int var10 = arg0 >> 8 & 0x7F;
            int var11 = arg0 >> 16 & 0x7F;
            this.method2221(var9, var10, var11);
        } else if (var2 == 176) {
            int var12 = arg0 & 0xF;
            int var13 = arg0 >> 8 & 0x7F;
            int var14 = arg0 >> 16 & 0x7F;
            if (var13 == 0) {
                this.field2231[var12] = (var14 << 14) + (this.field2231[var12] & 0xFFE03FFF);
            }
            if (var13 == 32) {
                this.field2231[var12] = (var14 << 7) + (this.field2231[var12] & 0xFFFFC07F);
            }
            if (var13 == 1) {
                this.field2248[var12] = (var14 << 7) + (this.field2248[var12] & 0xFFFFC07F);
            }
            if (var13 == 33) {
                this.field2248[var12] = (this.field2248[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 5) {
                this.field2230[var12] = (var14 << 7) + (this.field2230[var12] & 0xFFFFC07F);
            }
            if (var13 == 37) {
                this.field2230[var12] = (this.field2230[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 7) {
                this.field2226[var12] = (var14 << 7) + (this.field2226[var12] & 0xFFFFC07F);
            }
            if (var13 == 39) {
                this.field2226[var12] = (this.field2226[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 10) {
                this.field2227[var12] = (var14 << 7) + (this.field2227[var12] & 0xFFFFC07F);
            }
            if (var13 == 42) {
                this.field2227[var12] = (this.field2227[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 11) {
                this.field2250[var12] = (var14 << 7) + (this.field2250[var12] & 0xFFFFC07F);
            }
            if (var13 == 43) {
                this.field2250[var12] = (this.field2250[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 64) {
                if (var14 >= 64) {
                    this.field2238[var12] |= 0x1;
                } else {
                    this.field2238[var12] &= 0xFFFFFFFE;
                }
            }
            if (var13 == 65) {
                if (var14 >= 64) {
                    this.field2238[var12] |= 0x2;
                } else {
                    this.method2275(var12);
                    this.field2238[var12] &= 0xFFFFFFFD;
                }
            }
            if (var13 == 99) {
                this.field2239[var12] = (var14 << 7) + (this.field2239[var12] & 0x7F);
            }
            if (var13 == 98) {
                this.field2239[var12] = (this.field2239[var12] & 0x3F80) + var14;
            }
            if (var13 == 101) {
                this.field2239[var12] = (var14 << 7) + (this.field2239[var12] & 0x7F) + 16384;
            }
            if (var13 == 100) {
                this.field2239[var12] = (this.field2239[var12] & 0x3F80) + 16384 + var14;
            }
            if (var13 == 120) {
                this.method2264(var12);
            }
            if (var13 == 121) {
                this.method2220(var12);
            }
            if (var13 == 123) {
                this.method2225(var12);
            }
            if (var13 == 6) {
                int var15 = this.field2239[var12];
                if (var15 == 16384) {
                    this.field2234[var12] = (var14 << 7) + (this.field2234[var12] & 0xFFFFC07F);
                }
            }
            if (var13 == 38) {
                int var16 = this.field2239[var12];
                if (var16 == 16384) {
                    this.field2234[var12] = (this.field2234[var12] & 0xFFFFFF80) + var14;
                }
            }
            if (var13 == 16) {
                this.field2241[var12] = (var14 << 7) + (this.field2241[var12] & 0xFFFFC07F);
            }
            if (var13 == 48) {
                this.field2241[var12] = (this.field2241[var12] & 0xFFFFFF80) + var14;
            }
            if (var13 == 81) {
                if (var14 >= 64) {
                    this.field2238[var12] |= 0x4;
                } else {
                    this.method2228(var12);
                    this.field2238[var12] &= 0xFFFFFFFB;
                }
            }
            if (var13 == 17) {
                this.method2237(var12, (var14 << 7) + (this.field2242[var12] & 0xFFFFC07F));
            }
            if (var13 == 49) {
                this.method2237(var12, (this.field2242[var12] & 0xFFFFFF80) + var14);
            }
        } else if (var2 == 192) {
            int var17 = arg0 & 0xF;
            int var18 = arg0 >> 8 & 0x7F;
            this.method2217(var17, this.field2231[var17] + var18);
        } else if (var2 == 208) {
            int var19 = arg0 & 0xF;
            int var20 = arg0 >> 8 & 0x7F;
            this.method2292(var19, var20);
        } else if (var2 == 224) {
            int var21 = arg0 & 0xF;
            int var22 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
            this.method2223(var21, var22);
        } else {
            int var23 = arg0 & 0xFF;
            if (var23 == 255) {
                this.method2226();
            }
        }
    }

    @ObfuscatedName("em.bf(III)V")
    public void method2237(int arg0, int arg1) {
        this.field2242[arg0] = arg1;
        this.field2228[arg0] = (int) (2097152.0D * Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) + 0.5D);
    }

    @ObfuscatedName("em.bc(Lep;B)I")
    public int method2276(class139 arg0) {
        int var2 = (arg0.field1757 * arg0.field1748 >> 12) + arg0.field1747;
        int var3 = ((this.field2229[arg0.field1742] - 8192) * this.field2234[arg0.field1742] >> 12) + var2;
        class80 var4 = arg0.field1745;
        if (var4.field1137 > 0 && (var4.field1142 > 0 || this.field2248[arg0.field1742] > 0)) {
            int var5 = var4.field1142 << 2;
            int var6 = var4.field1144 << 1;
            if (arg0.field1739 < var6) {
                var5 = arg0.field1739 * var5 / var6;
            }
            int var7 = (this.field2248[arg0.field1742] >> 7) + var5;
            double var8 = Math.sin((double) (arg0.field1756 & 0x1FF) * 0.01227184630308513D);
            var3 += (int) ((double) var7 * var8);
        }
        int var10 = (int) ((double) (arg0.field1741.field2203 * 256) * Math.pow(2.0D, (double) var3 * 3.255208333333333E-4D) / (double) Statics.field354 + 0.5D);
        return var10 < 1 ? 1 : var10;
    }

    @ObfuscatedName("em.bn(Lep;I)I")
    public int method2232(class139 arg0) {
        class80 var2 = arg0.field1745;
        int var3 = this.field2226[arg0.field1742] * this.field2250[arg0.field1742] + 4096 >> 13;
        int var4 = var3 * var3 + 16384 >> 15;
        int var5 = arg0.field1755 * var4 + 16384 >> 15;
        int var6 = this.field2224 * var5 + 128 >> 8;
        if (var2.field1138 > 0) {
            var6 = (int) ((double) var6 * Math.pow(0.5D, (double) arg0.field1750 * 1.953125E-5D * (double) var2.field1138) + 0.5D);
        }
        if (var2.field1143 != null) {
            int var7 = arg0.field1749;
            int var8 = var2.field1143[arg0.field1752 + 1];
            if (arg0.field1752 < var2.field1143.length - 2) {
                int var9 = (var2.field1143[arg0.field1752] & 0xFF) << 8;
                int var10 = (var2.field1143[arg0.field1752 + 2] & 0xFF) << 8;
                var8 += (var2.field1143[arg0.field1752 + 3] - var8) * (var7 - var9) / (var10 - var9);
            }
            var6 = var6 * var8 + 32 >> 6;
        }
        if (arg0.field1753 > 0 && var2.field1136 != null) {
            int var11 = arg0.field1753;
            int var12 = var2.field1136[arg0.field1754 + 1];
            if (arg0.field1754 < var2.field1136.length - 2) {
                int var13 = (var2.field1136[arg0.field1754] & 0xFF) << 8;
                int var14 = (var2.field1136[arg0.field1754 + 2] & 0xFF) << 8;
                var12 += (var2.field1136[arg0.field1754 + 3] - var12) * (var11 - var13) / (var14 - var13);
            }
            var6 = var6 * var12 + 32 >> 6;
        }
        return var6;
    }

    @ObfuscatedName("em.bk(Lep;I)I")
    public int method2233(class139 arg0) {
        int var2 = this.field2227[arg0.field1742];
        return var2 < 8192 ? arg0.field1746 * var2 + 32 >> 6 : 16384 - ((128 - arg0.field1746) * (16384 - var2) + 32 >> 6);
    }

    @ObfuscatedName("em.d()Ldr;")
    public synchronized class130 method1527() {
        return this.field2252;
    }

    @ObfuscatedName("em.k()Ldr;")
    public synchronized class130 method1511() {
        return null;
    }

    @ObfuscatedName("em.u()I")
    public synchronized int method1512() {
        return 0;
    }

    @ObfuscatedName("em.f([III)V")
    public synchronized void method1514(int[] arg0, int arg1, int arg2) {
        if (this.field2246.method920()) {
            int var4 = this.field2225 * this.field2246.field1153 / Statics.field354;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field2233;
                if (this.field2251 - var5 >= 0L) {
                    this.field2233 = var5;
                    break;
                }
                int var7 = (int) ((this.field2251 - this.field2233 + (long) var4 - 1L) / (long) var4);
                this.field2233 += (long) var4 * (long) var7;
                this.field2252.method1514(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method2234();
            } while (this.field2246.method920());
        }
        this.field2252.method1514(arg0, arg1, arg2);
    }

    @ObfuscatedName("em.s(I)V")
    public synchronized void method1515(int arg0) {
        if (this.field2246.method920()) {
            int var2 = this.field2225 * this.field2246.field1153 / Statics.field354;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field2233;
                if (this.field2251 - var3 >= 0L) {
                    this.field2233 = var3;
                    break;
                }
                int var5 = (int) ((this.field2251 - this.field2233 + (long) var2 - 1L) / (long) var2);
                this.field2233 += (long) var2 * (long) var5;
                this.field2252.method1515(var5);
                arg0 -= var5;
                this.method2234();
            } while (this.field2246.method920());
        }
        this.field2252.method1515(arg0);
    }

    @ObfuscatedName("em.bz(B)V")
    public void method2234() {
        int var1 = this.field2232;
        int var2 = this.field2243;
        long var3 = this.field2251;
        while (this.field2243 == var2) {
            while (this.field2246.field1150[var1] == var2) {
                this.field2246.method922(var1);
                int var5 = this.field2246.method924(var1);
                if (var5 == 1) {
                    this.field2246.method928();
                    this.field2246.method927(var1);
                    if (this.field2246.method934()) {
                        if (!this.field2247 || var2 == 0) {
                            this.method2226();
                            this.field2246.method953();
                            return;
                        }
                        this.field2246.method923(var3);
                    }
                    break;
                }
                if ((var5 & 0x80) != 0) {
                    this.method2229(var5);
                }
                this.field2246.method929(var1);
                this.field2246.method927(var1);
            }
            var1 = this.field2246.method933();
            var2 = this.field2246.field1150[var1];
            var3 = this.field2246.method932(var2);
        }
        this.field2232 = var1;
        this.field2243 = var2;
        this.field2251 = var3;
    }

    @ObfuscatedName("em.bj(Lep;I)Z")
    public boolean method2235(class139 arg0) {
        if (arg0.field1744 != null) {
            return false;
        }
        if (arg0.field1753 >= 0) {
            arg0.method1328();
            if (arg0.field1751 > 0 && this.field2245[arg0.field1742][arg0.field1751] == arg0) {
                this.field2245[arg0.field1742][arg0.field1751] = null;
            }
        }
        return true;
    }

    @ObfuscatedName("em.bt(Lep;[IIII)Z")
    public boolean method2236(class139 arg0, int[] arg1, int arg2, int arg3) {
        arg0.field1743 = Statics.field354 / 100;
        if (arg0.field1753 >= 0 && arg0.field1744 == null || arg0.field1744.method2072()) {
            arg0.method1783();
            arg0.method1328();
            if (arg0.field1751 > 0 && this.field2245[arg0.field1742][arg0.field1751] == arg0) {
                this.field2245[arg0.field1742][arg0.field1751] = null;
            }
            return true;
        }
        int var5 = arg0.field1757;
        if (var5 > 0) {
            int var6 = var5 - (int) (16.0D * Math.pow(2.0D, (double) this.field2230[arg0.field1742] * 4.921259842519685E-4D) + 0.5D);
            if (var6 < 0) {
                var6 = 0;
            }
            arg0.field1757 = var6;
        }
        arg0.field1744.method2070(this.method2276(arg0));
        class80 var7 = arg0.field1745;
        boolean var8 = false;
        arg0.field1739++;
        arg0.field1756 += var7.field1137;
        double var9 = (double) ((arg0.field1758 - 60 << 8) + (arg0.field1757 * arg0.field1748 >> 12)) * 5.086263020833333E-6D;
        if (var7.field1138 > 0) {
            if (var7.field1141 > 0) {
                arg0.field1750 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1141 * var9) + 0.5D);
            } else {
                arg0.field1750 += 128;
            }
        }
        if (var7.field1143 != null) {
            if (var7.field1139 > 0) {
                arg0.field1749 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1139 * var9) + 0.5D);
            } else {
                arg0.field1749 += 128;
            }
            while (arg0.field1752 < var7.field1143.length - 2 && arg0.field1749 > (var7.field1143[arg0.field1752 + 2] & 0xFF) << 8) {
                arg0.field1752 += 2;
            }
            if (arg0.field1752 == var7.field1143.length - 2 && var7.field1143[arg0.field1752 + 1] == 0) {
                var8 = true;
            }
        }
        if (arg0.field1753 >= 0 && var7.field1136 != null && (this.field2238[arg0.field1742] & 0x1) == 0 && (arg0.field1751 < 0 || this.field2245[arg0.field1742][arg0.field1751] != arg0)) {
            if (var7.field1140 > 0) {
                arg0.field1753 += (int) (128.0D * Math.pow(2.0D, (double) var7.field1140 * var9) + 0.5D);
            } else {
                arg0.field1753 += 128;
            }
            while (arg0.field1754 < var7.field1136.length - 2 && arg0.field1753 > (var7.field1136[arg0.field1754 + 2] & 0xFF) << 8) {
                arg0.field1754 += 2;
            }
            if (arg0.field1754 == var7.field1136.length - 2) {
                var8 = true;
            }
        }
        if (!var8) {
            arg0.field1744.method2128(arg0.field1743, this.method2232(arg0), this.method2233(arg0));
            return false;
        }
        arg0.field1744.method2069(arg0.field1743);
        if (arg1 == null) {
            arg0.field1744.method1515(arg3);
        } else {
            arg0.field1744.method1514(arg1, arg2, arg3);
        }
        if (arg0.field1744.method2118()) {
            this.field2252.field2255.method2194(arg0.field1744);
        }
        arg0.method1783();
        if (arg0.field1753 >= 0) {
            arg0.method1328();
            if (arg0.field1751 > 0 && this.field2245[arg0.field1742][arg0.field1751] == arg0) {
                this.field2245[arg0.field1742][arg0.field1751] = null;
            }
        }
        return true;
    }
}

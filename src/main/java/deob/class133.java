package deob;

@ObfuscatedName("ef")
public class class133 extends class141 {

    @ObfuscatedName("ef.a")
    public static class133 field1842 = new class133();

    @ObfuscatedName("ef.w")
    public static byte[] field1835 = new byte[1];

    @ObfuscatedName("ef.e")
    public static class133 field1827 = new class133();

    @ObfuscatedName("ef.k")
    public static byte[] field1814 = new byte[1];

    @ObfuscatedName("ef.u")
    public int field1812 = 0;

    @ObfuscatedName("ef.z")
    public int[] field1816;

    @ObfuscatedName("ef.t")
    public int[] field1817;

    @ObfuscatedName("ef.f")
    public int[] field1818;

    @ObfuscatedName("ef.g")
    public int field1873 = 0;

    @ObfuscatedName("ef.j")
    public int[] field1820;

    @ObfuscatedName("ef.x")
    public int[] field1821;

    @ObfuscatedName("ef.c")
    public int[] field1822;

    @ObfuscatedName("ef.s")
    public int[] field1819;

    @ObfuscatedName("ef.n")
    public int[] field1824;

    @ObfuscatedName("ef.y")
    public int[] field1811;

    @ObfuscatedName("ef.o")
    public byte[] field1858;

    @ObfuscatedName("ef.r")
    public byte[] field1815;

    @ObfuscatedName("ef.i")
    public byte[] field1869;

    @ObfuscatedName("ef.l")
    public short[] field1829;

    @ObfuscatedName("ef.m")
    public byte field1830 = 0;

    @ObfuscatedName("ef.q")
    public int field1831 = 0;

    @ObfuscatedName("ef.b")
    public int[] field1832;

    @ObfuscatedName("ef.h")
    public int[] field1857;

    @ObfuscatedName("ef.d")
    public int[] field1834;

    @ObfuscatedName("ef.v")
    public int[][] field1851;

    @ObfuscatedName("ef.p")
    public int[][] field1836;

    @ObfuscatedName("ef.ab")
    public boolean field1852 = false;

    @ObfuscatedName("ef.ad")
    public int field1838;

    @ObfuscatedName("ef.ag")
    public int field1839;

    @ObfuscatedName("ef.ak")
    public int field1840;

    @ObfuscatedName("ef.as")
    public int field1833;

    @ObfuscatedName("ef.aq")
    public int field1847;

    @ObfuscatedName("ef.ax")
    public int field1843;

    @ObfuscatedName("ef.at")
    public int field1844;

    @ObfuscatedName("ef.ap")
    public int field1845;

    @ObfuscatedName("ef.an")
    public int field1846 = -1;

    @ObfuscatedName("ef.ac")
    public int field1825 = -1;

    @ObfuscatedName("ef.aw")
    public int field1848 = -1;

    @ObfuscatedName("ef.ay")
    public static boolean[] field1850 = new boolean[4700];

    @ObfuscatedName("ef.ai")
    public static boolean[] field1867 = new boolean[4700];

    @ObfuscatedName("ef.af")
    public static int[] field1823 = new int[4700];

    @ObfuscatedName("ef.ah")
    public static int[] field1853 = new int[4700];

    @ObfuscatedName("ef.az")
    public static int[] field1813 = new int[4700];

    @ObfuscatedName("ef.av")
    public static int[] field1855 = new int[4700];

    @ObfuscatedName("ef.ae")
    public static int[] field1866 = new int[4700];

    @ObfuscatedName("ef.am")
    public static int[] field1841 = new int[4700];

    @ObfuscatedName("ef.aj")
    public static int[] field1859 = new int[1600];

    @ObfuscatedName("ef.ao")
    public static int[][] field1861 = new int[1600][512];

    @ObfuscatedName("ef.ar")
    public static int[] field1864 = new int[12];

    @ObfuscatedName("ef.au")
    public static int[][] field1862 = new int[12][2000];

    @ObfuscatedName("ef.bb")
    public static int[] field1863 = new int[2000];

    @ObfuscatedName("ef.bc")
    public static int[] field1854 = new int[2000];

    @ObfuscatedName("ef.bp")
    public static int[] field1865 = new int[12];

    @ObfuscatedName("ef.bn")
    public static int[] field1826 = new int[10];

    @ObfuscatedName("ef.bg")
    public static int[] field1856 = new int[10];

    @ObfuscatedName("ef.bq")
    public static int[] field1868 = new int[10];

    @ObfuscatedName("ef.bf")
    public static boolean field1872 = true;

    @ObfuscatedName("ef.bk")
    public static int[] field1875 = class136.field1927;

    @ObfuscatedName("ef.bh")
    public static int[] field1876 = class136.field1926;

    @ObfuscatedName("ef.bm")
    public static int[] field1877 = class136.field1923;

    @ObfuscatedName("ef.bt")
    public static int[] field1878 = class136.field1918;

    public class133() {
    }

    public class133(class133[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1812 = 0;
        this.field1873 = 0;
        this.field1831 = 0;
        this.field1830 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class133 var8 = arg0[var7];
            if (var8 != null) {
                this.field1812 += var8.field1812;
                this.field1873 += var8.field1873;
                this.field1831 += var8.field1831;
                if (var8.field1858 == null) {
                    if (this.field1830 == -1) {
                        this.field1830 = var8.field1830;
                    }
                    if (this.field1830 != var8.field1830) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1815 != null;
                var5 |= var8.field1829 != null;
                var6 |= var8.field1869 != null;
            }
        }
        this.field1816 = new int[this.field1812];
        this.field1817 = new int[this.field1812];
        this.field1818 = new int[this.field1812];
        this.field1820 = new int[this.field1873];
        this.field1821 = new int[this.field1873];
        this.field1822 = new int[this.field1873];
        this.field1819 = new int[this.field1873];
        this.field1824 = new int[this.field1873];
        this.field1811 = new int[this.field1873];
        if (var3) {
            this.field1858 = new byte[this.field1873];
        }
        if (var4) {
            this.field1815 = new byte[this.field1873];
        }
        if (var5) {
            this.field1829 = new short[this.field1873];
        }
        if (var6) {
            this.field1869 = new byte[this.field1873];
        }
        if (this.field1831 > 0) {
            this.field1832 = new int[this.field1831];
            this.field1857 = new int[this.field1831];
            this.field1834 = new int[this.field1831];
        }
        this.field1812 = 0;
        this.field1873 = 0;
        this.field1831 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class133 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1873; var11++) {
                    this.field1820[this.field1873] = var10.field1820[var11] + this.field1812;
                    this.field1821[this.field1873] = var10.field1821[var11] + this.field1812;
                    this.field1822[this.field1873] = var10.field1822[var11] + this.field1812;
                    this.field1819[this.field1873] = var10.field1819[var11];
                    this.field1824[this.field1873] = var10.field1824[var11];
                    this.field1811[this.field1873] = var10.field1811[var11];
                    if (var3) {
                        if (var10.field1858 == null) {
                            this.field1858[this.field1873] = var10.field1830;
                        } else {
                            this.field1858[this.field1873] = var10.field1858[var11];
                        }
                    }
                    if (var4 && var10.field1815 != null) {
                        this.field1815[this.field1873] = var10.field1815[var11];
                    }
                    if (var5) {
                        if (var10.field1829 == null) {
                            this.field1829[this.field1873] = -1;
                        } else {
                            this.field1829[this.field1873] = var10.field1829[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1869 == null || var10.field1869[var11] == -1) {
                            this.field1869[this.field1873] = -1;
                        } else {
                            this.field1869[this.field1873] = (byte) (var10.field1869[var11] + this.field1831);
                        }
                    }
                    this.field1873++;
                }
                for (int var12 = 0; var12 < var10.field1831; var12++) {
                    this.field1832[this.field1831] = var10.field1832[var12] + this.field1812;
                    this.field1857[this.field1831] = var10.field1857[var12] + this.field1812;
                    this.field1834[this.field1831] = var10.field1834[var12] + this.field1812;
                    this.field1831++;
                }
                for (int var13 = 0; var13 < var10.field1812; var13++) {
                    this.field1816[this.field1812] = var10.field1816[var13];
                    this.field1817[this.field1812] = var10.field1817[var13];
                    this.field1818[this.field1812] = var10.field1818[var13];
                    this.field1812++;
                }
            }
        }
    }

    @ObfuscatedName("ef.a([[IIIIZI)Lef;")
    public class133 method2307(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2302();
        int var7 = arg1 - this.field1840;
        int var8 = this.field1840 + arg1;
        int var9 = arg3 - this.field1840;
        int var10 = this.field1840 + arg3;
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
        class133 var15;
        if (arg4) {
            var15 = new class133();
            var15.field1812 = this.field1812;
            var15.field1873 = this.field1873;
            var15.field1831 = this.field1831;
            var15.field1816 = this.field1816;
            var15.field1818 = this.field1818;
            var15.field1820 = this.field1820;
            var15.field1821 = this.field1821;
            var15.field1822 = this.field1822;
            var15.field1819 = this.field1819;
            var15.field1824 = this.field1824;
            var15.field1811 = this.field1811;
            var15.field1858 = this.field1858;
            var15.field1815 = this.field1815;
            var15.field1869 = this.field1869;
            var15.field1829 = this.field1829;
            var15.field1830 = this.field1830;
            var15.field1832 = this.field1832;
            var15.field1857 = this.field1857;
            var15.field1834 = this.field1834;
            var15.field1851 = this.field1851;
            var15.field1836 = this.field1836;
            var15.field1852 = this.field1852;
            var15.field1817 = new int[var15.field1812];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1812; var16++) {
                int var17 = this.field1816[var16] + arg1;
                int var18 = this.field1818[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1817[var16] = this.field1817[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1812; var26++) {
                int var27 = (-this.field1817[var26] << 16) / this.field2010;
                if (var27 < arg5) {
                    int var28 = this.field1816[var26] + arg1;
                    int var29 = this.field1818[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1817[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1817[var26];
                }
            }
        }
        var15.method2305();
        return var15;
    }

    @ObfuscatedName("ef.w(Z)Lef;")
    public class133 method2298(boolean arg0) {
        if (!arg0 && field1835.length < this.field1873) {
            field1835 = new byte[this.field1873 + 100];
        }
        return this.method2300(arg0, field1842, field1835);
    }

    @ObfuscatedName("ef.k(Z)Lef;")
    public class133 method2344(boolean arg0) {
        if (!arg0 && field1814.length < this.field1873) {
            field1814 = new byte[this.field1873 + 100];
        }
        return this.method2300(arg0, field1827, field1814);
    }

    @ObfuscatedName("ef.u(ZLef;[B)Lef;")
    public class133 method2300(boolean arg0, class133 arg1, byte[] arg2) {
        arg1.field1812 = this.field1812;
        arg1.field1873 = this.field1873;
        arg1.field1831 = this.field1831;
        if (arg1.field1816 == null || arg1.field1816.length < this.field1812) {
            arg1.field1816 = new int[this.field1812 + 100];
            arg1.field1817 = new int[this.field1812 + 100];
            arg1.field1818 = new int[this.field1812 + 100];
        }
        for (int var4 = 0; var4 < this.field1812; var4++) {
            arg1.field1816[var4] = this.field1816[var4];
            arg1.field1817[var4] = this.field1817[var4];
            arg1.field1818[var4] = this.field1818[var4];
        }
        if (arg0) {
            arg1.field1815 = this.field1815;
        } else {
            arg1.field1815 = arg2;
            if (this.field1815 == null) {
                for (int var5 = 0; var5 < this.field1873; var5++) {
                    arg1.field1815[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1873; var6++) {
                    arg1.field1815[var6] = this.field1815[var6];
                }
            }
        }
        arg1.field1820 = this.field1820;
        arg1.field1821 = this.field1821;
        arg1.field1822 = this.field1822;
        arg1.field1819 = this.field1819;
        arg1.field1824 = this.field1824;
        arg1.field1811 = this.field1811;
        arg1.field1858 = this.field1858;
        arg1.field1869 = this.field1869;
        arg1.field1829 = this.field1829;
        arg1.field1830 = this.field1830;
        arg1.field1832 = this.field1832;
        arg1.field1857 = this.field1857;
        arg1.field1834 = this.field1834;
        arg1.field1851 = this.field1851;
        arg1.field1836 = this.field1836;
        arg1.field1852 = this.field1852;
        arg1.method2305();
        return arg1;
    }

    @ObfuscatedName("ef.z(I)V")
    public void method2301(int arg0) {
        if (this.field1846 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1876[arg0];
        int var9 = field1875[arg0];
        for (int var10 = 0; var10 < this.field1812; var10++) {
            int var11 = class136.method2423(this.field1816[var10], this.field1818[var10], var8, var9);
            int var12 = this.field1817[var10];
            int var13 = class136.method2412(this.field1816[var10], this.field1818[var10], var8, var9);
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
        this.field1843 = (var2 + var5) / 2;
        this.field1844 = (var3 + var6) / 2;
        this.field1845 = (var4 + var7) / 2;
        this.field1846 = (var5 - var2 + 1) / 2;
        this.field1825 = (var6 - var3 + 1) / 2;
        this.field1848 = (var7 - var4 + 1) / 2;
        if (this.field1846 < 32) {
            this.field1846 = 32;
        }
        if (this.field1848 < 32) {
            this.field1848 = 32;
        }
        if (this.field1852) {
            this.field1846 += 8;
            this.field1848 += 8;
        }
    }

    @ObfuscatedName("ef.t()V")
    public void method2302() {
        if (this.field1838 == 1) {
            return;
        }
        this.field1838 = 1;
        this.field2010 = 0;
        this.field1839 = 0;
        this.field1840 = 0;
        for (int var1 = 0; var1 < this.field1812; var1++) {
            int var2 = this.field1816[var1];
            int var3 = this.field1817[var1];
            int var4 = this.field1818[var1];
            if (-var3 > this.field2010) {
                this.field2010 = -var3;
            }
            if (var3 > this.field1839) {
                this.field1839 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1840) {
                this.field1840 = var5;
            }
        }
        this.field1840 = (int) (Math.sqrt((double) this.field1840) + 0.99D);
        this.field1847 = (int) (Math.sqrt((double) (this.field2010 * this.field2010 + this.field1840 * this.field1840)) + 0.99D);
        this.field1833 = this.field1847 + (int) (Math.sqrt((double) (this.field1840 * this.field1840 + this.field1839 * this.field1839)) + 0.99D);
    }

    @ObfuscatedName("ef.f()V")
    public void method2303() {
        if (this.field1838 == 2) {
            return;
        }
        this.field1838 = 2;
        this.field1840 = 0;
        for (int var1 = 0; var1 < this.field1812; var1++) {
            int var2 = this.field1816[var1];
            int var3 = this.field1817[var1];
            int var4 = this.field1818[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1840) {
                this.field1840 = var5;
            }
        }
        this.field1840 = (int) (Math.sqrt((double) this.field1840) + 0.99D);
        this.field1847 = this.field1840;
        this.field1833 = this.field1840 + this.field1840;
    }

    @ObfuscatedName("ef.g()I")
    public int method2304() {
        this.method2302();
        return this.field1840;
    }

    @ObfuscatedName("ef.x()V")
    public void method2305() {
        this.field1838 = 0;
        this.field1846 = -1;
    }

    @ObfuscatedName("ef.c(Lec;I)V")
    public void method2306(class144 arg0, int arg1) {
        if (this.field1851 == null || arg1 == -1) {
            return;
        }
        class131 var3 = arg0.field2027[arg1];
        class138 var4 = var3.field1786;
        Statics.field1860 = 0;
        Statics.field1870 = 0;
        Statics.field1871 = 0;
        for (int var5 = 0; var5 < var3.field1781; var5++) {
            int var6 = var3.field1783[var5];
            this.method2308(var4.field1941[var6], var4.field1942[var6], var3.field1784[var5], var3.field1785[var5], var3.field1778[var5]);
        }
        this.method2305();
    }

    @ObfuscatedName("ef.r(Lec;ILec;I[I)V")
    public void method2377(class144 arg0, int arg1, class144 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2306(arg0, arg1);
            return;
        }
        class131 var6 = arg0.field2027[arg1];
        class131 var7 = arg2.field2027[arg3];
        class138 var8 = var6.field1786;
        Statics.field1860 = 0;
        Statics.field1870 = 0;
        Statics.field1871 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1781; var11++) {
            int var12 = var6.field1783[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1941[var12] == 0) {
                this.method2308(var8.field1941[var12], var8.field1942[var12], var6.field1784[var11], var6.field1785[var11], var6.field1778[var11]);
            }
        }
        Statics.field1860 = 0;
        Statics.field1870 = 0;
        Statics.field1871 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1781; var15++) {
            int var16 = var7.field1783[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1941[var16] == 0) {
                this.method2308(var8.field1941[var16], var8.field1942[var16], var7.field1784[var15], var7.field1785[var15], var7.field1778[var15]);
            }
        }
        this.method2305();
    }

    @ObfuscatedName("ef.i(I[IIII)V")
    public void method2308(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1860 = 0;
            Statics.field1870 = 0;
            Statics.field1871 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1851.length) {
                    int[] var10 = this.field1851[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1860 += this.field1816[var12];
                        Statics.field1870 += this.field1817[var12];
                        Statics.field1871 += this.field1818[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1860 = Statics.field1860 / var7 + arg2;
                Statics.field1870 = Statics.field1870 / var7 + arg3;
                Statics.field1871 = Statics.field1871 / var7 + arg4;
            } else {
                Statics.field1860 = arg2;
                Statics.field1870 = arg3;
                Statics.field1871 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1851.length) {
                    int[] var15 = this.field1851[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1816[var17] += arg2;
                        this.field1817[var17] += arg3;
                        this.field1818[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1851.length) {
                    int[] var20 = this.field1851[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1816[var22] -= Statics.field1860;
                        this.field1817[var22] -= Statics.field1870;
                        this.field1818[var22] -= Statics.field1871;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1875[var25];
                            int var27 = field1876[var25];
                            int var28 = this.field1817[var22] * var26 + this.field1816[var22] * var27 >> 16;
                            this.field1817[var22] = this.field1817[var22] * var27 - this.field1816[var22] * var26 >> 16;
                            this.field1816[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1875[var23];
                            int var30 = field1876[var23];
                            int var31 = this.field1817[var22] * var30 - this.field1818[var22] * var29 >> 16;
                            this.field1818[var22] = this.field1818[var22] * var30 + this.field1817[var22] * var29 >> 16;
                            this.field1817[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1875[var24];
                            int var33 = field1876[var24];
                            int var34 = this.field1818[var22] * var32 + this.field1816[var22] * var33 >> 16;
                            this.field1818[var22] = this.field1818[var22] * var33 - this.field1816[var22] * var32 >> 16;
                            this.field1816[var22] = var34;
                        }
                        this.field1816[var22] += Statics.field1860;
                        this.field1817[var22] += Statics.field1870;
                        this.field1818[var22] += Statics.field1871;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1851.length) {
                    int[] var37 = this.field1851[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1816[var39] -= Statics.field1860;
                        this.field1817[var39] -= Statics.field1870;
                        this.field1818[var39] -= Statics.field1871;
                        this.field1816[var39] = this.field1816[var39] * arg2 / 128;
                        this.field1817[var39] = this.field1817[var39] * arg3 / 128;
                        this.field1818[var39] = this.field1818[var39] * arg4 / 128;
                        this.field1816[var39] += Statics.field1860;
                        this.field1817[var39] += Statics.field1870;
                        this.field1818[var39] += Statics.field1871;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1836 != null && this.field1815 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1836.length) {
                    int[] var42 = this.field1836[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1815[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1815[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ef.q()V")
    public void method2309() {
        for (int var1 = 0; var1 < this.field1812; var1++) {
            int var2 = this.field1816[var1];
            this.field1816[var1] = this.field1818[var1];
            this.field1818[var1] = -var2;
        }
        this.method2305();
    }

    @ObfuscatedName("ef.b()V")
    public void method2310() {
        for (int var1 = 0; var1 < this.field1812; var1++) {
            this.field1816[var1] = -this.field1816[var1];
            this.field1818[var1] = -this.field1818[var1];
        }
        this.method2305();
    }

    @ObfuscatedName("ef.h()V")
    public void method2311() {
        for (int var1 = 0; var1 < this.field1812; var1++) {
            int var2 = this.field1818[var1];
            this.field1818[var1] = this.field1816[var1];
            this.field1816[var1] = -var2;
        }
        this.method2305();
    }

    @ObfuscatedName("ef.d(I)V")
    public void method2362(int arg0) {
        int var2 = field1875[arg0];
        int var3 = field1876[arg0];
        for (int var4 = 0; var4 < this.field1812; var4++) {
            int var5 = this.field1817[var4] * var3 - this.field1818[var4] * var2 >> 16;
            this.field1818[var4] = this.field1818[var4] * var3 + this.field1817[var4] * var2 >> 16;
            this.field1817[var4] = var5;
        }
        this.method2305();
    }

    @ObfuscatedName("ef.v(III)V")
    public void method2321(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1812; var4++) {
            this.field1816[var4] += arg0;
            this.field1817[var4] += arg1;
            this.field1818[var4] += arg2;
        }
        this.method2305();
    }

    @ObfuscatedName("ef.p(III)V")
    public void method2314(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1812; var4++) {
            this.field1816[var4] = this.field1816[var4] * arg0 / 128;
            this.field1817[var4] = this.field1817[var4] * arg1 / 128;
            this.field1818[var4] = this.field1818[var4] * arg2 / 128;
        }
        this.method2305();
    }

    @ObfuscatedName("ef.ab(IIIIIII)V")
    public final void method2315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1859[0] = -1;
        if (this.field1838 != 2 && this.field1838 != 1) {
            this.method2303();
        }
        int var8 = Statics.field1914;
        int var9 = Statics.field1912;
        int var10 = field1875[arg0];
        int var11 = field1876[arg0];
        int var12 = field1875[arg1];
        int var13 = field1876[arg1];
        int var14 = field1875[arg2];
        int var15 = field1876[arg2];
        int var16 = field1875[arg3];
        int var17 = field1876[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1812; var19++) {
            int var20 = this.field1816[var19];
            int var21 = this.field1817[var19];
            int var22 = this.field1818[var19];
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
            field1813[var19] = var30 - var18;
            field1823[var19] = class136.field1913 * var26 / var30 + var8;
            field1853[var19] = class136.field1913 * var29 / var30 + var9;
            if (this.field1831 > 0) {
                field1855[var19] = var26;
                field1866[var19] = var29;
                field1841[var19] = var30;
            }
        }
        try {
            this.method2318(false, false, false, 0);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("ef.ad(IIIIIIII)V")
    public final void method2316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1859[0] = -1;
        if (this.field1838 != 2 && this.field1838 != 1) {
            this.method2303();
        }
        int var9 = Statics.field1914;
        int var10 = Statics.field1912;
        int var11 = field1875[arg0];
        int var12 = field1876[arg0];
        int var13 = field1875[arg1];
        int var14 = field1876[arg1];
        int var15 = field1875[arg2];
        int var16 = field1876[arg2];
        int var17 = field1875[arg3];
        int var18 = field1876[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1812; var20++) {
            int var21 = this.field1816[var20];
            int var22 = this.field1817[var20];
            int var23 = this.field1818[var20];
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
            field1813[var20] = var31 - var19;
            field1823[var20] = class136.field1913 * var27 / arg7 + var9;
            field1853[var20] = class136.field1913 * var30 / arg7 + var10;
            if (this.field1831 > 0) {
                field1855[var20] = var27;
                field1866[var20] = var30;
                field1841[var20] = var31;
            }
        }
        try {
            this.method2318(false, false, false, 0);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("ef.ce(IIIIIIIII)V")
    public void method2317(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1859[0] = -1;
        if (this.field1838 != 1) {
            this.method2302();
        }
        this.method2301(arg0);
        int var10 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var11 = arg1 * arg6 + arg2 * var10 >> 16;
        int var12 = this.field1840 * arg2 >> 16;
        int var13 = var11 + var12;
        if (var13 <= 50 || var11 >= 3500) {
            return;
        }
        int var14 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var15 = (var14 - this.field1840) * class136.field1913;
        if (var15 / var13 >= Statics.field1915) {
            return;
        }
        int var16 = (this.field1840 + var14) * class136.field1913;
        if (var16 / var13 <= Statics.field1902) {
            return;
        }
        int var17 = arg2 * arg6 - arg1 * var10 >> 16;
        int var18 = this.field1840 * arg1 >> 16;
        int var19 = (var17 + var18) * class136.field1913;
        if (var19 / var13 <= Statics.field1903) {
            return;
        }
        int var20 = (this.field2010 * arg2 >> 16) + var18;
        int var21 = (var17 - var20) * class136.field1913;
        if (var21 / var13 >= Statics.field1921) {
            return;
        }
        int var22 = (this.field2010 * arg1 >> 16) + var12;
        boolean var23 = false;
        boolean var24 = false;
        if (var11 - var22 <= 50) {
            var24 = true;
        }
        boolean var25 = var24 || this.field1831 > 0;
        int var26 = class134.method3863();
        int var27 = class134.field1883;
        boolean var29 = class134.method941();
        if (class8.field224 && arg8 > 0) {
            if (class134.method230(this, arg5, arg6, arg7)) {
                class8.method1723(this, arg5, arg6, arg7, -65281);
            } else if (class8.field226 == class12.field257) {
                class8.method1723(this, arg5, arg6, arg7, -16776961);
            }
        }
        if (class8.field228 && arg8 > 0) {
            int var31 = var11 - var12;
            if (var31 <= 50) {
                var31 = 50;
            }
            int var36;
            int var37;
            if (var14 > 0) {
                var36 = var15 / var13;
                var37 = var16 / var31;
            } else {
                var37 = var16 / var13;
                var36 = var15 / var31;
            }
            int var38;
            int var39;
            if (var17 > 0) {
                var38 = var21 / var13;
                var39 = var19 / var31;
            } else {
                var39 = var19 / var13;
                var38 = var21 / var31;
            }
            int var40 = -8355840;
            int var41 = var26 - Statics.field1914;
            int var42 = var27 - Statics.field1912;
            if (var41 > var36 && var41 < var37 && var42 > var38 && var42 < var39) {
                var40 = -256;
            }
            int var43 = Statics.field1914 + var36;
            int var44 = Statics.field1912 + var38;
            int var45 = Statics.field1914 + var37;
            int var46 = Statics.field1912 + var39;
            class8.field227.method3417(new class9(var43, var44, var45, var46, var40));
        }
        boolean var47 = false;
        if (arg8 > 0 && var29) {
            boolean var48 = false;
            if (field1872) {
                var48 = class134.method230(this, arg5, arg6, arg7);
            } else {
                int var49 = var11 - var12;
                if (var49 <= 50) {
                    var49 = 50;
                }
                int var50;
                int var51;
                if (var14 > 0) {
                    var50 = var15 / var13;
                    var51 = var16 / var49;
                } else {
                    var51 = var16 / var13;
                    var50 = var15 / var49;
                }
                int var52;
                int var53;
                if (var17 > 0) {
                    var52 = var21 / var13;
                    var53 = var19 / var49;
                } else {
                    var53 = var19 / var13;
                    var52 = var21 / var49;
                }
                int var54 = var26 - Statics.field1914;
                int var55 = var27 - Statics.field1912;
                if (var54 > var50 && var54 < var51 && var55 > var52 && var55 < var53) {
                    var48 = true;
                }
            }
            if (var48) {
                if (this.field1852) {
                    class134.field1889[++class134.field1888 - 1] = arg8;
                } else {
                    var47 = true;
                }
            }
        }
        int var57 = Statics.field1914;
        int var58 = Statics.field1912;
        int var59 = 0;
        int var60 = 0;
        if (arg0 != 0) {
            var59 = field1875[arg0];
            var60 = field1876[arg0];
        }
        for (int var61 = 0; var61 < this.field1812; var61++) {
            int var62 = this.field1816[var61];
            int var63 = this.field1817[var61];
            int var64 = this.field1818[var61];
            if (arg0 != 0) {
                int var65 = var59 * var64 + var60 * var62 >> 16;
                var64 = var60 * var64 - var59 * var62 >> 16;
                var62 = var65;
            }
            int var66 = arg5 + var62;
            int var67 = arg6 + var63;
            int var68 = arg7 + var64;
            int var69 = arg3 * var68 + arg4 * var66 >> 16;
            int var70 = arg4 * var68 - arg3 * var66 >> 16;
            int var72 = arg2 * var67 - arg1 * var70 >> 16;
            int var73 = arg1 * var67 + arg2 * var70 >> 16;
            field1813[var61] = var73 - var11;
            if (var73 >= 50) {
                field1823[var61] = class136.field1913 * var69 / var73 + var57;
                field1853[var61] = class136.field1913 * var72 / var73 + var58;
            } else {
                field1823[var61] = -5000;
                var23 = true;
            }
            if (var25) {
                field1855[var61] = var69;
                field1866[var61] = var72;
                field1841[var61] = var73;
            }
        }
        try {
            this.method2318(var23, var47, this.field1852, arg8);
        } catch (Exception var76) {
        }
    }

    @ObfuscatedName("ef.ag(ZZZI)V")
    public final void method2318(boolean arg0, boolean arg1, boolean arg2, int arg3) {
        if (this.field1833 >= 1600) {
            return;
        }
        for (int var5 = 0; var5 < this.field1833; var5++) {
            field1859[var5] = 0;
        }
        int var6 = arg2 ? 20 : 5;
        if (class8.field225 && arg1) {
            class133 var7 = this;
            for (int var8 = 0; var8 < var7.field1873; var8++) {
                if (var7.field1811[var8] != -2) {
                    int var9 = var7.field1820[var8];
                    int var10 = var7.field1821[var8];
                    int var11 = var7.field1822[var8];
                    int var12 = field1823[var9];
                    int var13 = field1823[var10];
                    int var14 = field1823[var11];
                    class8.method922(field1853[var9], field1853[var10], field1853[var11], var12, var13, var14, var6);
                }
            }
        }
        for (int var15 = 0; var15 < this.field1873; var15++) {
            if (this.field1811[var15] != -2) {
                int var16 = this.field1820[var15];
                int var17 = this.field1821[var15];
                int var18 = this.field1822[var15];
                int var19 = field1823[var16];
                int var20 = field1823[var17];
                int var21 = field1823[var18];
                if (arg0 && var19 == -5000 || var20 == -5000 || var21 == -5000) {
                    int var22 = field1855[var16];
                    int var23 = field1855[var17];
                    int var24 = field1855[var18];
                    int var25 = field1866[var16];
                    int var26 = field1866[var17];
                    int var27 = field1866[var18];
                    int var28 = field1841[var16];
                    int var29 = field1841[var17];
                    int var30 = field1841[var18];
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
                        field1867[var15] = true;
                        int var40 = (field1813[var16] + field1813[var17] + field1813[var18]) / 3 + this.field1847;
                        field1861[var40][field1859[var40]++] = var15;
                    }
                } else {
                    if (arg1) {
                        int var41 = field1853[var16];
                        int var42 = field1853[var17];
                        int var43 = field1853[var18];
                        int var44 = class134.field1883 + var6;
                        boolean var45;
                        if (var44 < var41 && var44 < var42 && var44 < var43) {
                            var45 = false;
                        } else {
                            int var46 = class134.field1883 - var6;
                            if (var46 > var41 && var46 > var42 && var46 > var43) {
                                var45 = false;
                            } else {
                                int var47 = class134.field1886 + var6;
                                if (var47 < var19 && var47 < var20 && var47 < var21) {
                                    var45 = false;
                                } else {
                                    int var48 = class134.field1886 - var6;
                                    if (var48 > var19 && var48 > var20 && var48 > var21) {
                                        var45 = false;
                                    } else {
                                        var45 = true;
                                    }
                                }
                            }
                        }
                        if (var45) {
                            class134.field1889[++class134.field1888 - 1] = arg3;
                            arg1 = false;
                        }
                    }
                    if ((field1853[var18] - field1853[var17]) * (var19 - var20) - (field1853[var16] - field1853[var17]) * (var21 - var20) > 0) {
                        field1867[var15] = false;
                        if (var19 >= 0 && var20 >= 0 && var21 >= 0 && var19 <= Statics.field1916 && var20 <= Statics.field1916 && var21 <= Statics.field1916) {
                            field1850[var15] = false;
                        } else {
                            field1850[var15] = true;
                        }
                        int var50 = (field1813[var16] + field1813[var17] + field1813[var18]) / 3 + this.field1847;
                        field1861[var50][field1859[var50]++] = var15;
                    }
                }
            }
        }
        if (this.field1858 == null) {
            for (int var51 = this.field1833 - 1; var51 >= 0; var51--) {
                int var52 = field1859[var51];
                if (var52 > 0) {
                    int[] var53 = field1861[var51];
                    for (int var54 = 0; var54 < var52; var54++) {
                        this.method2319(var53[var54]);
                    }
                }
            }
            return;
        }
        for (int var55 = 0; var55 < 12; var55++) {
            field1864[var55] = 0;
            field1865[var55] = 0;
        }
        for (int var56 = this.field1833 - 1; var56 >= 0; var56--) {
            int var57 = field1859[var56];
            if (var57 > 0) {
                int[] var58 = field1861[var56];
                for (int var59 = 0; var59 < var57; var59++) {
                    int var60 = var58[var59];
                    byte var61 = this.field1858[var60];
                    int var62 = field1864[var61]++;
                    field1862[var61][var62] = var60;
                    if (var61 < 10) {
                        field1865[var61] += var56;
                    } else if (var61 == 10) {
                        field1863[var62] = var56;
                    } else {
                        field1854[var62] = var56;
                    }
                }
            }
        }
        int var63 = 0;
        if (field1864[1] > 0 || field1864[2] > 0) {
            var63 = (field1865[1] + field1865[2]) / (field1864[1] + field1864[2]);
        }
        int var64 = 0;
        if (field1864[3] > 0 || field1864[4] > 0) {
            var64 = (field1865[3] + field1865[4]) / (field1864[3] + field1864[4]);
        }
        int var65 = 0;
        if (field1864[6] > 0 || field1864[8] > 0) {
            var65 = (field1865[6] + field1865[8]) / (field1864[6] + field1864[8]);
        }
        int var66 = 0;
        int var67 = field1864[10];
        int[] var68 = field1862[10];
        int[] var69 = field1863;
        if (var66 == var67) {
            var66 = 0;
            var67 = field1864[11];
            var68 = field1862[11];
            var69 = field1854;
        }
        int var70;
        if (var66 < var67) {
            var70 = var69[var66];
        } else {
            var70 = -1000;
        }
        for (int var71 = 0; var71 < 10; var71++) {
            while (var71 == 0 && var70 > var63) {
                this.method2319(var68[var66++]);
                if (var66 == var67 && field1862[11] != var68) {
                    var66 = 0;
                    var67 = field1864[11];
                    var68 = field1862[11];
                    var69 = field1854;
                }
                if (var66 < var67) {
                    var70 = var69[var66];
                } else {
                    var70 = -1000;
                }
            }
            while (var71 == 3 && var70 > var64) {
                this.method2319(var68[var66++]);
                if (var66 == var67 && field1862[11] != var68) {
                    var66 = 0;
                    var67 = field1864[11];
                    var68 = field1862[11];
                    var69 = field1854;
                }
                if (var66 < var67) {
                    var70 = var69[var66];
                } else {
                    var70 = -1000;
                }
            }
            while (var71 == 5 && var70 > var65) {
                this.method2319(var68[var66++]);
                if (var66 == var67 && field1862[11] != var68) {
                    var66 = 0;
                    var67 = field1864[11];
                    var68 = field1862[11];
                    var69 = field1854;
                }
                if (var66 < var67) {
                    var70 = var69[var66];
                } else {
                    var70 = -1000;
                }
            }
            int var72 = field1864[var71];
            int[] var73 = field1862[var71];
            for (int var74 = 0; var74 < var72; var74++) {
                this.method2319(var73[var74]);
            }
        }
        while (var70 != -1000) {
            this.method2319(var68[var66++]);
            if (var66 == var67 && field1862[11] != var68) {
                var66 = 0;
                var68 = field1862[11];
                var67 = field1864[11];
                var69 = field1854;
            }
            if (var66 < var67) {
                var70 = var69[var66];
            } else {
                var70 = -1000;
            }
        }
    }

    @ObfuscatedName("ef.ak(I)V")
    public final void method2319(int arg0) {
        if (field1867[arg0]) {
            this.method2320(arg0);
            return;
        }
        int var2 = this.field1820[arg0];
        int var3 = this.field1821[arg0];
        int var4 = this.field1822[arg0];
        class136.field1920 = field1850[arg0];
        if (this.field1815 == null) {
            class136.field1919 = 0;
        } else {
            class136.field1919 = this.field1815[arg0] & 0xFF;
        }
        if (this.field1829 != null && this.field1829[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1869 == null || this.field1869[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1869[arg0] & 0xFF;
                var6 = this.field1832[var5];
                var7 = this.field1857[var5];
                var8 = this.field1834[var5];
            }
            if (this.field1811[arg0] == -1) {
                class136.method2406(field1853[var2], field1853[var3], field1853[var4], field1823[var2], field1823[var3], field1823[var4], this.field1819[arg0], this.field1819[arg0], this.field1819[arg0], field1855[var6], field1855[var7], field1855[var8], field1866[var6], field1866[var7], field1866[var8], field1841[var6], field1841[var7], field1841[var8], this.field1829[arg0]);
            } else {
                class136.method2406(field1853[var2], field1853[var3], field1853[var4], field1823[var2], field1823[var3], field1823[var4], this.field1819[arg0], this.field1824[arg0], this.field1811[arg0], field1855[var6], field1855[var7], field1855[var8], field1866[var6], field1866[var7], field1866[var8], field1841[var6], field1841[var7], field1841[var8], this.field1829[arg0]);
            }
        } else if (this.field1811[arg0] == -1) {
            class136.method2404(field1853[var2], field1853[var3], field1853[var4], field1823[var2], field1823[var3], field1823[var4], field1877[this.field1819[arg0]]);
        } else {
            class136.method2402(field1853[var2], field1853[var3], field1853[var4], field1823[var2], field1823[var3], field1823[var4], this.field1819[arg0], this.field1824[arg0], this.field1811[arg0]);
        }
    }

    @ObfuscatedName("ef.as(I)V")
    public final void method2320(int arg0) {
        int var2 = Statics.field1914;
        int var3 = Statics.field1912;
        int var4 = 0;
        int var5 = this.field1820[arg0];
        int var6 = this.field1821[arg0];
        int var7 = this.field1822[arg0];
        int var8 = field1841[var5];
        int var9 = field1841[var6];
        int var10 = field1841[var7];
        if (this.field1815 == null) {
            class136.field1919 = 0;
        } else {
            class136.field1919 = this.field1815[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1826[var4] = field1823[var5];
            field1856[var4] = field1853[var5];
            field1868[var4++] = this.field1819[arg0];
        } else {
            int var11 = field1855[var5];
            int var12 = field1866[var5];
            int var13 = this.field1819[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1878[var10 - var8];
                field1826[var4] = (((field1855[var7] - var11) * var14 >> 16) + var11) * class136.field1913 / 50 + var2;
                field1856[var4] = (((field1866[var7] - var12) * var14 >> 16) + var12) * class136.field1913 / 50 + var3;
                field1868[var4++] = ((this.field1811[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1878[var9 - var8];
                field1826[var4] = (((field1855[var6] - var11) * var15 >> 16) + var11) * class136.field1913 / 50 + var2;
                field1856[var4] = (((field1866[var6] - var12) * var15 >> 16) + var12) * class136.field1913 / 50 + var3;
                field1868[var4++] = ((this.field1824[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1826[var4] = field1823[var6];
            field1856[var4] = field1853[var6];
            field1868[var4++] = this.field1824[arg0];
        } else {
            int var16 = field1855[var6];
            int var17 = field1866[var6];
            int var18 = this.field1824[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1878[var8 - var9];
                field1826[var4] = (((field1855[var5] - var16) * var19 >> 16) + var16) * class136.field1913 / 50 + var2;
                field1856[var4] = (((field1866[var5] - var17) * var19 >> 16) + var17) * class136.field1913 / 50 + var3;
                field1868[var4++] = ((this.field1819[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1878[var10 - var9];
                field1826[var4] = (((field1855[var7] - var16) * var20 >> 16) + var16) * class136.field1913 / 50 + var2;
                field1856[var4] = (((field1866[var7] - var17) * var20 >> 16) + var17) * class136.field1913 / 50 + var3;
                field1868[var4++] = ((this.field1811[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1826[var4] = field1823[var7];
            field1856[var4] = field1853[var7];
            field1868[var4++] = this.field1811[arg0];
        } else {
            int var21 = field1855[var7];
            int var22 = field1866[var7];
            int var23 = this.field1811[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1878[var9 - var10];
                field1826[var4] = (((field1855[var6] - var21) * var24 >> 16) + var21) * class136.field1913 / 50 + var2;
                field1856[var4] = (((field1866[var6] - var22) * var24 >> 16) + var22) * class136.field1913 / 50 + var3;
                field1868[var4++] = ((this.field1824[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1878[var8 - var10];
                field1826[var4] = (((field1855[var5] - var21) * var25 >> 16) + var21) * class136.field1913 / 50 + var2;
                field1856[var4] = (((field1866[var5] - var22) * var25 >> 16) + var22) * class136.field1913 / 50 + var3;
                field1868[var4++] = ((this.field1819[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1826[0];
        int var27 = field1826[1];
        int var28 = field1826[2];
        int var29 = field1856[0];
        int var30 = field1856[1];
        int var31 = field1856[2];
        class136.field1920 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1916 || var27 > Statics.field1916 || var28 > Statics.field1916) {
                class136.field1920 = true;
            }
            if (this.field1829 != null && this.field1829[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1869 == null || this.field1869[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1869[arg0] & 0xFF;
                    var33 = this.field1832[var32];
                    var34 = this.field1857[var32];
                    var35 = this.field1834[var32];
                }
                if (this.field1811[arg0] == -1) {
                    class136.method2406(var29, var30, var31, var26, var27, var28, this.field1819[arg0], this.field1819[arg0], this.field1819[arg0], field1855[var33], field1855[var34], field1855[var35], field1866[var33], field1866[var34], field1866[var35], field1841[var33], field1841[var34], field1841[var35], this.field1829[arg0]);
                } else {
                    class136.method2406(var29, var30, var31, var26, var27, var28, field1868[0], field1868[1], field1868[2], field1855[var33], field1855[var34], field1855[var35], field1866[var33], field1866[var34], field1866[var35], field1841[var33], field1841[var34], field1841[var35], this.field1829[arg0]);
                }
            } else if (this.field1811[arg0] == -1) {
                class136.method2404(var29, var30, var31, var26, var27, var28, field1877[this.field1819[arg0]]);
            } else {
                class136.method2402(var29, var30, var31, var26, var27, var28, field1868[0], field1868[1], field1868[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1916 || var27 > Statics.field1916 || var28 > Statics.field1916 || field1826[3] < 0 || field1826[3] > Statics.field1916) {
            class136.field1920 = true;
        }
        if (this.field1829 != null && this.field1829[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1869 == null || this.field1869[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1869[arg0] & 0xFF;
                var37 = this.field1832[var36];
                var38 = this.field1857[var36];
                var39 = this.field1834[var36];
            }
            short var40 = this.field1829[arg0];
            if (this.field1811[arg0] == -1) {
                class136.method2406(var29, var30, var31, var26, var27, var28, this.field1819[arg0], this.field1819[arg0], this.field1819[arg0], field1855[var37], field1855[var38], field1855[var39], field1866[var37], field1866[var38], field1866[var39], field1841[var37], field1841[var38], field1841[var39], var40);
                class136.method2406(var29, var31, field1856[3], var26, var28, field1826[3], this.field1819[arg0], this.field1819[arg0], this.field1819[arg0], field1855[var37], field1855[var38], field1855[var39], field1866[var37], field1866[var38], field1866[var39], field1841[var37], field1841[var38], field1841[var39], var40);
            } else {
                class136.method2406(var29, var30, var31, var26, var27, var28, field1868[0], field1868[1], field1868[2], field1855[var37], field1855[var38], field1855[var39], field1866[var37], field1866[var38], field1866[var39], field1841[var37], field1841[var38], field1841[var39], var40);
                class136.method2406(var29, var31, field1856[3], var26, var28, field1826[3], field1868[0], field1868[2], field1868[3], field1855[var37], field1855[var38], field1855[var39], field1866[var37], field1866[var38], field1866[var39], field1841[var37], field1841[var38], field1841[var39], var40);
            }
        } else if (this.field1811[arg0] == -1) {
            int var41 = field1877[this.field1819[arg0]];
            class136.method2404(var29, var30, var31, var26, var27, var28, var41);
            class136.method2404(var29, var31, field1856[3], var26, var28, field1826[3], var41);
        } else {
            class136.method2402(var29, var30, var31, var26, var27, var28, field1868[0], field1868[1], field1868[2]);
            class136.method2402(var29, var31, field1856[3], var26, var28, field1826[3], field1868[0], field1868[2], field1868[3]);
        }
    }
}

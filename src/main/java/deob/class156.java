package deob;

@ObfuscatedName("ef")
public class class156 extends class348 {

    @ObfuscatedName("ef.d")
    public static class222 field1808 = new class222(64);

    @ObfuscatedName("ef.z")
    public static class222 field1818 = new class222(50);

    @ObfuscatedName("ef.b")
    public static class222 field1816 = new class222(200);

    @ObfuscatedName("ef.k")
    public int field1838;

    @ObfuscatedName("ef.g")
    public int field1819;

    @ObfuscatedName("ef.t")
    public String field1855 = class269.field3238;

    @ObfuscatedName("ef.x")
    public short[] field1825;

    @ObfuscatedName("ef.u")
    public short[] field1809;

    @ObfuscatedName("ef.q")
    public short[] field1823;

    @ObfuscatedName("ef.s")
    public short[] field1824;

    @ObfuscatedName("ef.p")
    public int field1861 = 2000;

    @ObfuscatedName("ef.c")
    public int field1826 = 0;

    @ObfuscatedName("ef.n")
    public int field1827 = 0;

    @ObfuscatedName("ef.l")
    public int field1828 = 0;

    @ObfuscatedName("ef.w")
    public int field1829 = 0;

    @ObfuscatedName("ef.a")
    public int field1830 = 0;

    @ObfuscatedName("ef.aw")
    public int field1831 = 0;

    @ObfuscatedName("ef.ak")
    public int field1832 = 1;

    @ObfuscatedName("ef.ad")
    public boolean field1833 = false;

    @ObfuscatedName("ef.at")
    public String[] field1834 = new String[] { null, null, class269.field3231, null, null };

    @ObfuscatedName("ef.ah")
    public String[] field1853 = new String[] { null, null, null, null, class269.field3232 };

    @ObfuscatedName("ef.ap")
    public int field1835 = -2;

    @ObfuscatedName("ef.ag")
    public int field1852 = -1;

    @ObfuscatedName("ef.ab")
    public int field1839 = -1;

    @ObfuscatedName("ef.aq")
    public int field1820 = 0;

    @ObfuscatedName("ef.ae")
    public int field1815 = -1;

    @ObfuscatedName("ef.ao")
    public int field1841 = -1;

    @ObfuscatedName("ef.an")
    public int field1842 = 0;

    @ObfuscatedName("ef.al")
    public int field1843 = -1;

    @ObfuscatedName("ef.aj")
    public int field1844 = -1;

    @ObfuscatedName("ef.ac")
    public int field1845 = -1;

    @ObfuscatedName("ef.as")
    public int field1846 = -1;

    @ObfuscatedName("ef.au")
    public int field1847 = -1;

    @ObfuscatedName("ef.ay")
    public int field1848 = -1;

    @ObfuscatedName("ef.am")
    public int[] field1840;

    @ObfuscatedName("ef.aa")
    public int[] field1850;

    @ObfuscatedName("ef.ai")
    public int field1821 = -1;

    @ObfuscatedName("ef.av")
    public int field1854 = -1;

    @ObfuscatedName("ef.ax")
    public int field1822 = 128;

    @ObfuscatedName("ef.ar")
    public int field1865 = 128;

    @ObfuscatedName("ef.af")
    public int field1836 = 128;

    @ObfuscatedName("ef.bq")
    public int field1856 = 0;

    @ObfuscatedName("ef.bx")
    public int field1857 = 0;

    @ObfuscatedName("ef.bi")
    public int field1858 = 0;

    @ObfuscatedName("ef.bz")
    public class362 field1859;

    @ObfuscatedName("ef.bb")
    public boolean field1860 = false;

    @ObfuscatedName("ef.bv")
    public int field1837 = -1;

    @ObfuscatedName("ef.bc")
    public int field1862 = -1;

    @ObfuscatedName("ef.be")
    public int field1863 = -1;

    @ObfuscatedName("ef.ba")
    public int field1864 = -1;

    @ObfuscatedName("iz.f(II)Lef;")
    public static class156 method4403(int arg0) {
        class156 var1 = (class156) field1808.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1811.method4504(10, arg0);
        class156 var3 = new class156();
        var3.field1838 = arg0;
        if (var2 != null) {
            var3.method2818(new class384(var2));
        }
        var3.method2758();
        if (var3.field1854 != -1) {
            var3.method2761(method4403(var3.field1854), method4403(var3.field1821));
        }
        if (var3.field1862 != -1) {
            var3.method2791(method4403(var3.field1862), method4403(var3.field1837));
        }
        if (var3.field1864 != -1) {
            var3.method2780(method4403(var3.field1864), method4403(var3.field1863));
        }
        if (!Statics.field1849 && var3.field1833) {
            var3.field1855 = class269.field3431;
            var3.field1860 = false;
            for (int var4 = 0; var4 < var3.field1834.length; var4++) {
                var3.field1834[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field1853.length; var5++) {
                if (var5 != 4) {
                    var3.field1853[var5] = null;
                }
            }
            var3.field1835 = -2;
            var3.field1858 = 0;
            if (var3.field1859 != null) {
                boolean var6 = false;
                for (class353 var7 = var3.field1859.method5671(); var7 != null; var7 = var3.field1859.method5672()) {
                    class152 var8 = class152.method2294((int) var7.field3937);
                    if (var8.field1722) {
                        var7.method5407();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field1859 = null;
                }
            }
        }
        field1808.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ef.e(I)V")
    public void method2758() {
    }

    @ObfuscatedName("ef.v(Lnt;I)V")
    public void method2818(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2760(arg0, var2);
        }
    }

    @ObfuscatedName("ef.y(Lnt;II)V")
    public void method2760(class384 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1819 = arg0.method5899();
        } else if (arg1 == 2) {
            this.field1855 = arg0.method5906();
        } else if (arg1 == 4) {
            this.field1861 = arg0.method5899();
        } else if (arg1 == 5) {
            this.field1826 = arg0.method5899();
        } else if (arg1 == 6) {
            this.field1827 = arg0.method5899();
        } else if (arg1 == 7) {
            this.field1829 = arg0.method5899();
            if (this.field1829 > 32767) {
                this.field1829 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1830 = arg0.method5899();
            if (this.field1830 > 32767) {
                this.field1830 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method5906();
        } else if (arg1 == 11) {
            this.field1831 = 1;
        } else if (arg1 == 12) {
            this.field1832 = arg0.method5965();
        } else if (arg1 == 16) {
            this.field1833 = true;
        } else if (arg1 == 23) {
            this.field1852 = arg0.method5899();
            this.field1820 = arg0.method5902();
        } else if (arg1 == 24) {
            this.field1839 = arg0.method5899();
        } else if (arg1 == 25) {
            this.field1815 = arg0.method5899();
            this.field1842 = arg0.method5902();
        } else if (arg1 == 26) {
            this.field1841 = arg0.method5899();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1834[arg1 - 30] = arg0.method5906();
            if (this.field1834[arg1 - 30].equalsIgnoreCase(class269.field3233)) {
                this.field1834[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1853[arg1 - 35] = arg0.method5906();
        } else if (arg1 == 40) {
            int var3 = arg0.method5902();
            this.field1825 = new short[var3];
            this.field1809 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1825[var4] = (short) arg0.method5899();
                this.field1809[var4] = (short) arg0.method5899();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5902();
            this.field1823 = new short[var5];
            this.field1824 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1823[var6] = (short) arg0.method5899();
                this.field1824[var6] = (short) arg0.method5899();
            }
        } else if (arg1 == 42) {
            this.field1835 = arg0.method5968();
        } else if (arg1 == 65) {
            this.field1860 = true;
        } else if (arg1 == 78) {
            this.field1843 = arg0.method5899();
        } else if (arg1 == 79) {
            this.field1844 = arg0.method5899();
        } else if (arg1 == 90) {
            this.field1845 = arg0.method5899();
        } else if (arg1 == 91) {
            this.field1847 = arg0.method5899();
        } else if (arg1 == 92) {
            this.field1846 = arg0.method5899();
        } else if (arg1 == 93) {
            this.field1848 = arg0.method5899();
        } else if (arg1 == 94) {
            arg0.method5899();
        } else if (arg1 == 95) {
            this.field1828 = arg0.method5899();
        } else if (arg1 == 97) {
            this.field1821 = arg0.method5899();
        } else if (arg1 == 98) {
            this.field1854 = arg0.method5899();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1840 == null) {
                this.field1840 = new int[10];
                this.field1850 = new int[10];
            }
            this.field1840[arg1 - 100] = arg0.method5899();
            this.field1850[arg1 - 100] = arg0.method5899();
        } else if (arg1 == 110) {
            this.field1822 = arg0.method5899();
        } else if (arg1 == 111) {
            this.field1865 = arg0.method5899();
        } else if (arg1 == 112) {
            this.field1836 = arg0.method5899();
        } else if (arg1 == 113) {
            this.field1856 = arg0.method5968();
        } else if (arg1 == 114) {
            this.field1857 = arg0.method5968() * 5;
        } else if (arg1 == 115) {
            this.field1858 = arg0.method5902();
        } else if (arg1 == 139) {
            this.field1837 = arg0.method5899();
        } else if (arg1 == 140) {
            this.field1862 = arg0.method5899();
        } else if (arg1 == 148) {
            this.field1863 = arg0.method5899();
        } else if (arg1 == 149) {
            this.field1864 = arg0.method5899();
        } else if (arg1 == 249) {
            this.field1859 = class144.method181(arg0, this.field1859);
        }
    }

    @ObfuscatedName("ef.j(Lef;Lef;I)V")
    public void method2761(class156 arg0, class156 arg1) {
        this.field1819 = arg0.field1819;
        this.field1861 = arg0.field1861;
        this.field1826 = arg0.field1826;
        this.field1827 = arg0.field1827;
        this.field1828 = arg0.field1828;
        this.field1829 = arg0.field1829;
        this.field1830 = arg0.field1830;
        this.field1825 = arg0.field1825;
        this.field1809 = arg0.field1809;
        this.field1823 = arg0.field1823;
        this.field1824 = arg0.field1824;
        this.field1855 = arg1.field1855;
        this.field1833 = arg1.field1833;
        this.field1832 = arg1.field1832;
        this.field1831 = 1;
    }

    @ObfuscatedName("ef.o(Lef;Lef;I)V")
    public void method2791(class156 arg0, class156 arg1) {
        this.field1819 = arg0.field1819;
        this.field1861 = arg0.field1861;
        this.field1826 = arg0.field1826;
        this.field1827 = arg0.field1827;
        this.field1828 = arg0.field1828;
        this.field1829 = arg0.field1829;
        this.field1830 = arg0.field1830;
        this.field1825 = arg1.field1825;
        this.field1809 = arg1.field1809;
        this.field1823 = arg1.field1823;
        this.field1824 = arg1.field1824;
        this.field1855 = arg1.field1855;
        this.field1833 = arg1.field1833;
        this.field1831 = arg1.field1831;
        this.field1852 = arg1.field1852;
        this.field1839 = arg1.field1839;
        this.field1843 = arg1.field1843;
        this.field1815 = arg1.field1815;
        this.field1841 = arg1.field1841;
        this.field1844 = arg1.field1844;
        this.field1845 = arg1.field1845;
        this.field1846 = arg1.field1846;
        this.field1847 = arg1.field1847;
        this.field1848 = arg1.field1848;
        this.field1858 = arg1.field1858;
        this.field1834 = arg1.field1834;
        this.field1853 = new String[5];
        if (arg1.field1853 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1853[var3] = arg1.field1853[var3];
            }
        }
        this.field1853[4] = class269.field3237;
        this.field1832 = 0;
    }

    @ObfuscatedName("ef.m(Lef;Lef;I)V")
    public void method2780(class156 arg0, class156 arg1) {
        this.field1819 = arg0.field1819;
        this.field1861 = arg0.field1861;
        this.field1826 = arg0.field1826;
        this.field1827 = arg0.field1827;
        this.field1828 = arg0.field1828;
        this.field1829 = arg0.field1829;
        this.field1830 = arg0.field1830;
        this.field1825 = arg0.field1825;
        this.field1809 = arg0.field1809;
        this.field1823 = arg0.field1823;
        this.field1824 = arg0.field1824;
        this.field1831 = arg0.field1831;
        this.field1855 = arg1.field1855;
        this.field1832 = 0;
        this.field1833 = false;
        this.field1860 = false;
    }

    @ObfuscatedName("ef.r(IB)Lga;")
    public final class192 method2763(int arg0) {
        if (this.field1840 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1850[var3] && this.field1850[var3] != 0) {
                    var2 = this.field1840[var3];
                }
            }
            if (var2 != -1) {
                return method4403(var2).method2763(1);
            }
        }
        class192 var4 = class192.method3422(Statics.field443, this.field1819, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1822 != 128 || this.field1865 != 128 || this.field1836 != 128) {
            var4.method3423(this.field1822, this.field1865, this.field1836);
        }
        if (this.field1825 != null) {
            for (int var5 = 0; var5 < this.field1825.length; var5++) {
                var4.method3420(this.field1825[var5], this.field1809[var5]);
            }
        }
        if (this.field1823 != null) {
            for (int var6 = 0; var6 < this.field1823.length; var6++) {
                var4.method3474(this.field1823[var6], this.field1824[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ef.h(IB)Lgd;")
    public final class206 method2764(int arg0) {
        if (this.field1840 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1850[var3] && this.field1850[var3] != 0) {
                    var2 = this.field1840[var3];
                }
            }
            if (var2 != -1) {
                return method4403(var2).method2764(1);
            }
        }
        class206 var4 = (class206) field1818.method3987((long) this.field1838);
        if (var4 != null) {
            return var4;
        }
        class192 var5 = class192.method3422(Statics.field443, this.field1819, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1822 != 128 || this.field1865 != 128 || this.field1836 != 128) {
            var5.method3423(this.field1822, this.field1865, this.field1836);
        }
        if (this.field1825 != null) {
            for (int var6 = 0; var6 < this.field1825.length; var6++) {
                var5.method3420(this.field1825[var6], this.field1809[var6]);
            }
        }
        if (this.field1823 != null) {
            for (int var7 = 0; var7 < this.field1823.length; var7++) {
                var5.method3474(this.field1823[var7], this.field1824[var7]);
            }
        }
        class206 var8 = var5.method3428(this.field1856 + 64, this.field1857 + 768, -50, -10, -50);
        var8.field2445 = true;
        field1818.method3988(var8, (long) this.field1838);
        return var8;
    }

    @ObfuscatedName("ef.d(II)Lef;")
    public class156 method2765(int arg0) {
        if (this.field1840 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1850[var3] && this.field1850[var3] != 0) {
                    var2 = this.field1840[var3];
                }
            }
            if (var2 != -1) {
                return method4403(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("eu.z(IIIIIZI)Loa;")
    public static final class397 method2591(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class397 var8 = (class397) field1816.method3987(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class156 var9 = method4403(arg0);
        if (arg1 > 1 && var9.field1840 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1850[var11] && var9.field1850[var11] != 0) {
                    var10 = var9.field1840[var11];
                }
            }
            if (var10 != -1) {
                var9 = method4403(var10);
            }
        }
        class206 var12 = var9.method2764(1);
        if (var12 == null) {
            return null;
        }
        class397 var13 = null;
        if (var9.field1854 != -1) {
            var13 = method2591(var9.field1821, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1862 != -1) {
            var13 = method2591(var9.field1837, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1864 != -1) {
            var13 = method2591(var9.field1863, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4230;
        int var15 = Statics.field4233;
        int var16 = Statics.field4232;
        int[] var17 = new int[4];
        class393.method6175(var17);
        class397 var18 = new class397(36, 32);
        class393.method6174(var18.field4263, 36, 32);
        class393.method6180();
        class197.method3493();
        class197.method3492(16, 16);
        class197.field2282 = false;
        if (var9.field1864 != -1) {
            var13.method6352(0, 0);
        }
        int var19 = var9.field1861;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class197.field2271[var9.field1826] * var19 >> 16;
        int var21 = class197.field2285[var9.field1826] * var19 >> 16;
        var12.method3842();
        var12.method3883(0, var9.field1827, var9.field1828, var9.field1826, var9.field1829, var9.field1830 + var12.field2359 / 2 + var20, var9.field1830 + var21);
        if (var9.field1862 != -1) {
            var13.method6352(0, 0);
        }
        if (arg2 >= 1) {
            var18.method6327(1);
        }
        if (arg2 >= 2) {
            var18.method6327(16777215);
        }
        if (arg3 != 0) {
            var18.method6282(arg3);
        }
        class393.method6174(var18.field4263, 36, 32);
        if (var9.field1854 != -1) {
            var13.method6352(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1831 == 1) {
            Statics.field1817.method4924(method1769(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1816.method3988(var18, var6);
        }
        class393.method6174(var14, var15, var16);
        class393.method6179(var17);
        class197.method3493();
        class197.field2282 = true;
        return var18;
    }

    @ObfuscatedName("cz.b(II)Ljava/lang/String;")
    public static final String method1769(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class269.field3448 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class269.field3324 + "</col>";
        }
    }

    @ObfuscatedName("ef.i(ZI)Z")
    public final boolean method2766(boolean arg0) {
        int var2 = this.field1852;
        int var3 = this.field1839;
        int var4 = this.field1843;
        if (arg0) {
            var2 = this.field1815;
            var3 = this.field1841;
            var4 = this.field1844;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field443.method4506(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field443.method4506(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field443.method4506(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ef.k(ZI)Lga;")
    public final class192 method2757(boolean arg0) {
        int var2 = this.field1852;
        int var3 = this.field1839;
        int var4 = this.field1843;
        if (arg0) {
            var2 = this.field1815;
            var3 = this.field1841;
            var4 = this.field1844;
        }
        if (var2 == -1) {
            return null;
        }
        class192 var5 = class192.method3422(Statics.field443, var2, 0);
        if (var3 != -1) {
            class192 var6 = class192.method3422(Statics.field443, var3, 0);
            if (var4 == -1) {
                class192[] var9 = new class192[] { var5, var6 };
                var5 = new class192(var9, 2);
            } else {
                class192 var7 = class192.method3422(Statics.field443, var4, 0);
                class192[] var8 = new class192[] { var5, var6, var7 };
                var5 = new class192(var8, 3);
            }
        }
        if (!arg0 && this.field1820 != 0) {
            var5.method3473(0, this.field1820, 0);
        }
        if (arg0 && this.field1842 != 0) {
            var5.method3473(0, this.field1842, 0);
        }
        if (this.field1825 != null) {
            for (int var10 = 0; var10 < this.field1825.length; var10++) {
                var5.method3420(this.field1825[var10], this.field1809[var10]);
            }
        }
        if (this.field1823 != null) {
            for (int var11 = 0; var11 < this.field1823.length; var11++) {
                var5.method3474(this.field1823[var11], this.field1824[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ef.g(ZI)Z")
    public final boolean method2789(boolean arg0) {
        int var2 = this.field1845;
        int var3 = this.field1846;
        if (arg0) {
            var2 = this.field1847;
            var3 = this.field1848;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field443.method4506(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field443.method4506(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ef.t(ZI)Lga;")
    public final class192 method2769(boolean arg0) {
        int var2 = this.field1845;
        int var3 = this.field1846;
        if (arg0) {
            var2 = this.field1847;
            var3 = this.field1848;
        }
        if (var2 == -1) {
            return null;
        }
        class192 var4 = class192.method3422(Statics.field443, var2, 0);
        if (var3 != -1) {
            class192 var5 = class192.method3422(Statics.field443, var3, 0);
            class192[] var6 = new class192[] { var4, var5 };
            var4 = new class192(var6, 2);
        }
        if (this.field1825 != null) {
            for (int var7 = 0; var7 < this.field1825.length; var7++) {
                var4.method3420(this.field1825[var7], this.field1809[var7]);
            }
        }
        if (this.field1823 != null) {
            for (int var8 = 0; var8 < this.field1823.length; var8++) {
                var4.method3474(this.field1823[var8], this.field1824[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ef.x(III)I")
    public int method2770(int arg0, int arg1) {
        class362 var3 = this.field1859;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class352 var5 = (class352) var3.method5668((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field3934;
            }
        }
        return var4;
    }

    @ObfuscatedName("ef.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2771(int arg0, String arg1) {
        return class144.method2439(this.field1859, arg0, arg1);
    }

    @ObfuscatedName("ef.q(I)I")
    public int method2792() {
        if (this.field1835 == -1 || this.field1853 == null) {
            return -1;
        } else if (this.field1835 >= 0) {
            return this.field1853[this.field1835] == null ? -1 : this.field1835;
        } else if (class269.field3232.equalsIgnoreCase(this.field1853[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cp.s(I)V")
    public static void method1816() {
        field1808.method3989();
        field1818.method3989();
        field1816.method3989();
    }

    @ObfuscatedName("ef.p(I)Z")
    public boolean method2773() {
        return this.field1809 != null;
    }

    @ObfuscatedName("ef.c(B)Z")
    public boolean method2826() {
        return this.field1824 != null;
    }
}

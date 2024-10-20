package deob;

@ObfuscatedName("eq")
public class class155 extends class347 {

    @ObfuscatedName("eq.s")
    public static class221 field1810 = new class221(64);

    @ObfuscatedName("eq.u")
    public static class221 field1811 = new class221(50);

    @ObfuscatedName("eq.l")
    public static class221 field1812 = new class221(200);

    @ObfuscatedName("eq.c")
    public int field1856;

    @ObfuscatedName("eq.e")
    public int field1814;

    @ObfuscatedName("eq.g")
    public String field1815 = class268.field3242;

    @ObfuscatedName("eq.a")
    public short[] field1849;

    @ObfuscatedName("eq.k")
    public short[] field1817;

    @ObfuscatedName("eq.m")
    public short[] field1818;

    @ObfuscatedName("eq.x")
    public short[] field1819;

    @ObfuscatedName("eq.z")
    public int field1821 = 2000;

    @ObfuscatedName("eq.w")
    public int field1841 = 0;

    @ObfuscatedName("eq.t")
    public int field1822 = 0;

    @ObfuscatedName("eq.h")
    public int field1823 = 0;

    @ObfuscatedName("eq.q")
    public int field1824 = 0;

    @ObfuscatedName("eq.i")
    public int field1825 = 0;

    @ObfuscatedName("eq.ae")
    public int field1813 = 0;

    @ObfuscatedName("eq.ap")
    public int field1827 = 1;

    @ObfuscatedName("eq.ab")
    public boolean field1828 = false;

    @ObfuscatedName("eq.al")
    public String[] field1829 = new String[] { null, null, class268.field3235, null, null };

    @ObfuscatedName("eq.ad")
    public String[] field1838 = new String[] { null, null, null, null, class268.field3236 };

    @ObfuscatedName("eq.ar")
    public int field1831 = -2;

    @ObfuscatedName("eq.ag")
    public int field1832 = -1;

    @ObfuscatedName("eq.ax")
    public int field1833 = -1;

    @ObfuscatedName("eq.as")
    public int field1834 = 0;

    @ObfuscatedName("eq.aj")
    public int field1830 = -1;

    @ObfuscatedName("eq.am")
    public int field1835 = -1;

    @ObfuscatedName("eq.az")
    public int field1836 = 0;

    @ObfuscatedName("eq.av")
    public int field1826 = -1;

    @ObfuscatedName("eq.ac")
    public int field1839 = -1;

    @ObfuscatedName("eq.at")
    public int field1840 = -1;

    @ObfuscatedName("eq.ah")
    public int field1847 = -1;

    @ObfuscatedName("eq.ao")
    public int field1845 = -1;

    @ObfuscatedName("eq.aq")
    public int field1843 = -1;

    @ObfuscatedName("eq.aw")
    public int[] field1844;

    @ObfuscatedName("eq.af")
    public int[] field1820;

    @ObfuscatedName("eq.ak")
    public int field1806 = -1;

    @ObfuscatedName("eq.ay")
    public int field1851 = -1;

    @ObfuscatedName("eq.aa")
    public int field1848 = 128;

    @ObfuscatedName("eq.au")
    public int field1805 = 128;

    @ObfuscatedName("eq.an")
    public int field1837 = 128;

    @ObfuscatedName("eq.bd")
    public int field1850 = 0;

    @ObfuscatedName("eq.bt")
    public int field1852 = 0;

    @ObfuscatedName("eq.bq")
    public int field1846 = 0;

    @ObfuscatedName("eq.bu")
    public class361 field1854;

    @ObfuscatedName("eq.bl")
    public boolean field1855 = false;

    @ObfuscatedName("eq.bv")
    public int field1842 = -1;

    @ObfuscatedName("eq.bm")
    public int field1857 = -1;

    @ObfuscatedName("eq.bz")
    public int field1858 = -1;

    @ObfuscatedName("eq.bh")
    public int field1859 = -1;

    @ObfuscatedName("ji.v(II)Leq;")
    public static class155 method4399(int arg0) {
        class155 var1 = (class155) field1810.method3948((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3927.method4468(10, arg0);
        class155 var3 = new class155();
        var3.field1856 = arg0;
        if (var2 != null) {
            var3.method2769(new class383(var2));
        }
        var3.method2768();
        if (var3.field1851 != -1) {
            var3.method2771(method4399(var3.field1851), method4399(var3.field1806));
        }
        if (var3.field1857 != -1) {
            var3.method2772(method4399(var3.field1857), method4399(var3.field1842));
        }
        if (var3.field1859 != -1) {
            var3.method2809(method4399(var3.field1859), method4399(var3.field1858));
        }
        if (!Statics.field1153 && var3.field1828) {
            var3.field1815 = class268.field3453;
            var3.field1855 = false;
            var3.field1829 = null;
            var3.field1838 = null;
            var3.field1831 = -1;
            var3.field1846 = 0;
            if (var3.field1854 != null) {
                boolean var4 = false;
                for (class352 var5 = var3.field1854.method5750(); var5 != null; var5 = var3.field1854.method5751()) {
                    class151 var6 = class151.method2140((int) var5.field3938);
                    if (var6.field1719) {
                        var5.method5496();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field1854 = null;
                }
            }
        }
        field1810.method3947(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eq.n(I)V")
    public void method2768() {
    }

    @ObfuscatedName("eq.f(Lnd;I)V")
    public void method2769(class383 arg0) {
        while (true) {
            int var2 = arg0.method5965();
            if (var2 == 0) {
                return;
            }
            this.method2828(arg0, var2);
        }
    }

    @ObfuscatedName("eq.y(Lnd;II)V")
    public void method2828(class383 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1814 = arg0.method5967();
        } else if (arg1 == 2) {
            this.field1815 = arg0.method5974();
        } else if (arg1 == 4) {
            this.field1821 = arg0.method5967();
        } else if (arg1 == 5) {
            this.field1841 = arg0.method5967();
        } else if (arg1 == 6) {
            this.field1822 = arg0.method5967();
        } else if (arg1 == 7) {
            this.field1824 = arg0.method5967();
            if (this.field1824 > 32767) {
                this.field1824 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1825 = arg0.method5967();
            if (this.field1825 > 32767) {
                this.field1825 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1813 = 1;
        } else if (arg1 == 12) {
            this.field1827 = arg0.method5970();
        } else if (arg1 == 16) {
            this.field1828 = true;
        } else if (arg1 == 23) {
            this.field1832 = arg0.method5967();
            this.field1834 = arg0.method5965();
        } else if (arg1 == 24) {
            this.field1833 = arg0.method5967();
        } else if (arg1 == 25) {
            this.field1830 = arg0.method5967();
            this.field1836 = arg0.method5965();
        } else if (arg1 == 26) {
            this.field1835 = arg0.method5967();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1829[arg1 - 30] = arg0.method5974();
            if (this.field1829[arg1 - 30].equalsIgnoreCase(class268.field3237)) {
                this.field1829[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1838[arg1 - 35] = arg0.method5974();
        } else if (arg1 == 40) {
            int var3 = arg0.method5965();
            this.field1849 = new short[var3];
            this.field1817 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1849[var4] = (short) arg0.method5967();
                this.field1817[var4] = (short) arg0.method5967();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5965();
            this.field1818 = new short[var5];
            this.field1819 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1818[var6] = (short) arg0.method5967();
                this.field1819[var6] = (short) arg0.method5967();
            }
        } else if (arg1 == 42) {
            this.field1831 = arg0.method5966();
        } else if (arg1 == 65) {
            this.field1855 = true;
        } else if (arg1 == 78) {
            this.field1826 = arg0.method5967();
        } else if (arg1 == 79) {
            this.field1839 = arg0.method5967();
        } else if (arg1 == 90) {
            this.field1840 = arg0.method5967();
        } else if (arg1 == 91) {
            this.field1845 = arg0.method5967();
        } else if (arg1 == 92) {
            this.field1847 = arg0.method5967();
        } else if (arg1 == 93) {
            this.field1843 = arg0.method5967();
        } else if (arg1 == 95) {
            this.field1823 = arg0.method5967();
        } else if (arg1 == 97) {
            this.field1806 = arg0.method5967();
        } else if (arg1 == 98) {
            this.field1851 = arg0.method5967();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1844 == null) {
                this.field1844 = new int[10];
                this.field1820 = new int[10];
            }
            this.field1844[arg1 - 100] = arg0.method5967();
            this.field1820[arg1 - 100] = arg0.method5967();
        } else if (arg1 == 110) {
            this.field1848 = arg0.method5967();
        } else if (arg1 == 111) {
            this.field1805 = arg0.method5967();
        } else if (arg1 == 112) {
            this.field1837 = arg0.method5967();
        } else if (arg1 == 113) {
            this.field1850 = arg0.method5966();
        } else if (arg1 == 114) {
            this.field1852 = arg0.method5966() * 5;
        } else if (arg1 == 115) {
            this.field1846 = arg0.method5965();
        } else if (arg1 == 139) {
            this.field1842 = arg0.method5967();
        } else if (arg1 == 140) {
            this.field1857 = arg0.method5967();
        } else if (arg1 == 148) {
            this.field1858 = arg0.method5967();
        } else if (arg1 == 149) {
            this.field1859 = arg0.method5967();
        } else if (arg1 == 249) {
            this.field1854 = class143.method4696(arg0, this.field1854);
        }
    }

    @ObfuscatedName("eq.p(Leq;Leq;B)V")
    public void method2771(class155 arg0, class155 arg1) {
        this.field1814 = arg0.field1814;
        this.field1821 = arg0.field1821;
        this.field1841 = arg0.field1841;
        this.field1822 = arg0.field1822;
        this.field1823 = arg0.field1823;
        this.field1824 = arg0.field1824;
        this.field1825 = arg0.field1825;
        this.field1849 = arg0.field1849;
        this.field1817 = arg0.field1817;
        this.field1818 = arg0.field1818;
        this.field1819 = arg0.field1819;
        this.field1815 = arg1.field1815;
        this.field1828 = arg1.field1828;
        this.field1827 = arg1.field1827;
        this.field1813 = 1;
    }

    @ObfuscatedName("eq.j(Leq;Leq;I)V")
    public void method2772(class155 arg0, class155 arg1) {
        this.field1814 = arg0.field1814;
        this.field1821 = arg0.field1821;
        this.field1841 = arg0.field1841;
        this.field1822 = arg0.field1822;
        this.field1823 = arg0.field1823;
        this.field1824 = arg0.field1824;
        this.field1825 = arg0.field1825;
        this.field1849 = arg1.field1849;
        this.field1817 = arg1.field1817;
        this.field1818 = arg1.field1818;
        this.field1819 = arg1.field1819;
        this.field1815 = arg1.field1815;
        this.field1828 = arg1.field1828;
        this.field1813 = arg1.field1813;
        this.field1832 = arg1.field1832;
        this.field1833 = arg1.field1833;
        this.field1826 = arg1.field1826;
        this.field1830 = arg1.field1830;
        this.field1835 = arg1.field1835;
        this.field1839 = arg1.field1839;
        this.field1840 = arg1.field1840;
        this.field1847 = arg1.field1847;
        this.field1845 = arg1.field1845;
        this.field1843 = arg1.field1843;
        this.field1846 = arg1.field1846;
        this.field1829 = arg1.field1829;
        this.field1838 = new String[5];
        if (arg1.field1838 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1838[var3] = arg1.field1838[var3];
            }
        }
        this.field1838[4] = class268.field3427;
        this.field1827 = 0;
    }

    @ObfuscatedName("eq.r(Leq;Leq;I)V")
    public void method2809(class155 arg0, class155 arg1) {
        this.field1814 = arg0.field1814;
        this.field1821 = arg0.field1821;
        this.field1841 = arg0.field1841;
        this.field1822 = arg0.field1822;
        this.field1823 = arg0.field1823;
        this.field1824 = arg0.field1824;
        this.field1825 = arg0.field1825;
        this.field1849 = arg0.field1849;
        this.field1817 = arg0.field1817;
        this.field1818 = arg0.field1818;
        this.field1819 = arg0.field1819;
        this.field1813 = arg0.field1813;
        this.field1815 = arg1.field1815;
        this.field1827 = 0;
        this.field1828 = false;
        this.field1855 = false;
    }

    @ObfuscatedName("eq.b(II)Lgm;")
    public final class191 method2824(int arg0) {
        if (this.field1844 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1820[var3] && this.field1820[var3] != 0) {
                    var2 = this.field1844[var3];
                }
            }
            if (var2 != -1) {
                return method4399(var2).method2824(1);
            }
        }
        class191 var4 = class191.method3418(Statics.field3784, this.field1814, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1848 != 128 || this.field1805 != 128 || this.field1837 != 128) {
            var4.method3440(this.field1848, this.field1805, this.field1837);
        }
        if (this.field1849 != null) {
            for (int var5 = 0; var5 < this.field1849.length; var5++) {
                var4.method3414(this.field1849[var5], this.field1817[var5]);
            }
        }
        if (this.field1818 != null) {
            for (int var6 = 0; var6 < this.field1818.length; var6++) {
                var4.method3412(this.field1818[var6], this.field1819[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("eq.d(II)Lgr;")
    public final class205 method2776(int arg0) {
        if (this.field1844 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1820[var3] && this.field1820[var3] != 0) {
                    var2 = this.field1844[var3];
                }
            }
            if (var2 != -1) {
                return method4399(var2).method2776(1);
            }
        }
        class205 var4 = (class205) field1811.method3948((long) this.field1856);
        if (var4 != null) {
            return var4;
        }
        class191 var5 = class191.method3418(Statics.field3784, this.field1814, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1848 != 128 || this.field1805 != 128 || this.field1837 != 128) {
            var5.method3440(this.field1848, this.field1805, this.field1837);
        }
        if (this.field1849 != null) {
            for (int var6 = 0; var6 < this.field1849.length; var6++) {
                var5.method3414(this.field1849[var6], this.field1817[var6]);
            }
        }
        if (this.field1818 != null) {
            for (int var7 = 0; var7 < this.field1818.length; var7++) {
                var5.method3412(this.field1818[var7], this.field1819[var7]);
            }
        }
        class205 var8 = var5.method3421(this.field1850 + 64, this.field1852 + 768, -50, -10, -50);
        var8.field2449 = true;
        field1811.method3947(var8, (long) this.field1856);
        return var8;
    }

    @ObfuscatedName("eq.s(IS)Leq;")
    public class155 method2781(int arg0) {
        if (this.field1844 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1820[var3] && this.field1820[var3] != 0) {
                    var2 = this.field1844[var3];
                }
            }
            if (var2 != -1) {
                return method4399(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("hy.u(IIIIIZI)Loh;")
    public static final class396 method3900(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class396 var8 = (class396) field1812.method3948(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class155 var9 = method4399(arg0);
        if (arg1 > 1 && var9.field1844 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1820[var11] && var9.field1820[var11] != 0) {
                    var10 = var9.field1844[var11];
                }
            }
            if (var10 != -1) {
                var9 = method4399(var10);
            }
        }
        class205 var12 = var9.method2776(1);
        if (var12 == null) {
            return null;
        }
        class396 var13 = null;
        if (var9.field1851 != -1) {
            var13 = method3900(var9.field1806, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1857 != -1) {
            var13 = method3900(var9.field1842, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1859 != -1) {
            var13 = method3900(var9.field1858, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4227;
        int var15 = Statics.field4221;
        int var16 = Statics.field4223;
        int[] var17 = new int[4];
        class392.method6239(var17);
        class396 var18 = new class396(36, 32);
        class392.method6240(var18.field4247, 36, 32);
        class392.method6246();
        class196.method3491();
        class196.method3494(16, 16);
        class196.field2283 = false;
        if (var9.field1859 != -1) {
            var13.method6355(0, 0);
        }
        int var19 = var9.field1821;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class196.field2275[var9.field1841] * var19 >> 16;
        int var21 = class196.field2286[var9.field1841] * var19 >> 16;
        var12.method3791();
        var12.method3855(0, var9.field1822, var9.field1823, var9.field1841, var9.field1824, var9.field1825 + var12.field2360 / 2 + var20, var9.field1825 + var21);
        if (var9.field1857 != -1) {
            var13.method6355(0, 0);
        }
        if (arg2 >= 1) {
            var18.method6351(1);
        }
        if (arg2 >= 2) {
            var18.method6351(16777215);
        }
        if (arg3 != 0) {
            var18.method6352(arg3);
        }
        class392.method6240(var18.field4247, 36, 32);
        if (var9.field1851 != -1) {
            var13.method6355(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1813 == 1) {
            class300 var22 = Statics.field3673;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class268.field3295 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class268.field3241 + "</col>";
            }
            var22.method4891(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1812.method3947(var18, var6);
        }
        class392.method6240(var14, var15, var16);
        class392.method6273(var17);
        class196.method3491();
        class196.field2283 = true;
        return var18;
    }

    @ObfuscatedName("eq.l(ZB)Z")
    public final boolean method2805(boolean arg0) {
        int var2 = this.field1832;
        int var3 = this.field1833;
        int var4 = this.field1826;
        if (arg0) {
            var2 = this.field1830;
            var3 = this.field1835;
            var4 = this.field1839;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3784.method4470(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3784.method4470(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3784.method4470(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("eq.o(ZI)Lgm;")
    public final class191 method2777(boolean arg0) {
        int var2 = this.field1832;
        int var3 = this.field1833;
        int var4 = this.field1826;
        if (arg0) {
            var2 = this.field1830;
            var3 = this.field1835;
            var4 = this.field1839;
        }
        if (var2 == -1) {
            return null;
        }
        class191 var5 = class191.method3418(Statics.field3784, var2, 0);
        if (var3 != -1) {
            class191 var6 = class191.method3418(Statics.field3784, var3, 0);
            if (var4 == -1) {
                class191[] var9 = new class191[] { var5, var6 };
                var5 = new class191(var9, 2);
            } else {
                class191 var7 = class191.method3418(Statics.field3784, var4, 0);
                class191[] var8 = new class191[] { var5, var6, var7 };
                var5 = new class191(var8, 3);
            }
        }
        if (!arg0 && this.field1834 != 0) {
            var5.method3425(0, this.field1834, 0);
        }
        if (arg0 && this.field1836 != 0) {
            var5.method3425(0, this.field1836, 0);
        }
        if (this.field1849 != null) {
            for (int var10 = 0; var10 < this.field1849.length; var10++) {
                var5.method3414(this.field1849[var10], this.field1817[var10]);
            }
        }
        if (this.field1818 != null) {
            for (int var11 = 0; var11 < this.field1818.length; var11++) {
                var5.method3412(this.field1818[var11], this.field1819[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("eq.c(ZI)Z")
    public final boolean method2778(boolean arg0) {
        int var2 = this.field1840;
        int var3 = this.field1847;
        if (arg0) {
            var2 = this.field1845;
            var3 = this.field1843;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3784.method4470(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3784.method4470(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("eq.e(ZB)Lgm;")
    public final class191 method2779(boolean arg0) {
        int var2 = this.field1840;
        int var3 = this.field1847;
        if (arg0) {
            var2 = this.field1845;
            var3 = this.field1843;
        }
        if (var2 == -1) {
            return null;
        }
        class191 var4 = class191.method3418(Statics.field3784, var2, 0);
        if (var3 != -1) {
            class191 var5 = class191.method3418(Statics.field3784, var3, 0);
            class191[] var6 = new class191[] { var4, var5 };
            var4 = new class191(var6, 2);
        }
        if (this.field1849 != null) {
            for (int var7 = 0; var7 < this.field1849.length; var7++) {
                var4.method3414(this.field1849[var7], this.field1817[var7]);
            }
        }
        if (this.field1818 != null) {
            for (int var8 = 0; var8 < this.field1818.length; var8++) {
                var4.method3412(this.field1818[var8], this.field1819[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("eq.g(IIB)I")
    public int method2780(int arg0, int arg1) {
        return class143.method1790(this.field1854, arg0, arg1);
    }

    @ObfuscatedName("eq.a(ILjava/lang/String;S)Ljava/lang/String;")
    public String method2792(int arg0, String arg1) {
        return class143.method5166(this.field1854, arg0, arg1);
    }

    @ObfuscatedName("eq.k(I)I")
    public int method2782() {
        if (this.field1831 == -1 || this.field1838 == null) {
            return -1;
        } else if (this.field1831 >= 0) {
            return this.field1838[this.field1831] == null ? -1 : this.field1831;
        } else if (class268.field3236.equalsIgnoreCase(this.field1838[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ga.m(I)V")
    public static void method3897() {
        field1810.method3957();
        field1811.method3957();
        field1812.method3957();
    }

    @ObfuscatedName("be.x(I)V")
    public static void method912() {
        field1812.method3957();
    }

    @ObfuscatedName("ix.z(ZI)V")
    public static void method4395(boolean arg0) {
        if (Statics.field1153 != arg0) {
            method3897();
            Statics.field1153 = arg0;
        }
    }

    @ObfuscatedName("eq.w(S)Z")
    public boolean method2783() {
        return this.field1817 != null;
    }

    @ObfuscatedName("eq.t(I)Z")
    public boolean method2784() {
        return this.field1819 != null;
    }
}

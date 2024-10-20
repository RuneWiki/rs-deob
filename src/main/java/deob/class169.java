package deob;

@ObfuscatedName("ff")
public class class169 extends class364 {

    @ObfuscatedName("ff.n")
    public static boolean field1849 = false;

    @ObfuscatedName("ff.k")
    public static class236 field1830 = new class236(4096);

    @ObfuscatedName("ff.o")
    public static class236 field1823 = new class236(500);

    @ObfuscatedName("ff.g")
    public static class236 field1831 = new class236(30);

    @ObfuscatedName("ff.z")
    public static class236 field1825 = new class236(30);

    @ObfuscatedName("ff.a")
    public static class206[] field1826 = new class206[4];

    @ObfuscatedName("ff.u")
    public int field1827;

    @ObfuscatedName("ff.e")
    public int[] field1828;

    @ObfuscatedName("ff.l")
    public int[] field1829;

    @ObfuscatedName("ff.y")
    public String field1845 = class283.field3339;

    @ObfuscatedName("ff.v")
    public short[] field1834;

    @ObfuscatedName("ff.f")
    public short[] field1832;

    @ObfuscatedName("ff.s")
    public short[] field1854;

    @ObfuscatedName("ff.h")
    public short[] field1843;

    @ObfuscatedName("ff.d")
    public int field1835 = 1;

    @ObfuscatedName("ff.q")
    public int field1836 = 1;

    @ObfuscatedName("ff.j")
    public int field1837 = 2;

    @ObfuscatedName("ff.x")
    public boolean field1838 = true;

    @ObfuscatedName("ff.b")
    public int field1839 = -1;

    @ObfuscatedName("ff.t")
    public int field1840 = -1;

    @ObfuscatedName("ff.r")
    public boolean field1822 = false;

    @ObfuscatedName("ff.p")
    public boolean field1842 = false;

    @ObfuscatedName("ff.w")
    public int field1824 = -1;

    @ObfuscatedName("ff.i")
    public int field1844 = 16;

    @ObfuscatedName("ff.aq")
    public int field1863 = 0;

    @ObfuscatedName("ff.ad")
    public int field1846 = 0;

    @ObfuscatedName("ff.al")
    public String[] field1847 = new String[5];

    @ObfuscatedName("ff.aa")
    public int field1852 = -1;

    @ObfuscatedName("ff.aw")
    public int field1869 = -1;

    @ObfuscatedName("ff.at")
    public boolean field1850 = false;

    @ObfuscatedName("ff.as")
    public boolean field1851 = true;

    @ObfuscatedName("ff.ae")
    public int field1864 = 128;

    @ObfuscatedName("ff.av")
    public int field1853 = 128;

    @ObfuscatedName("ff.ak")
    public int field1819 = 128;

    @ObfuscatedName("ff.an")
    public int field1848 = 0;

    @ObfuscatedName("ff.ab")
    public int field1856 = 0;

    @ObfuscatedName("ff.au")
    public int field1857 = 0;

    @ObfuscatedName("ff.am")
    public boolean field1858 = false;

    @ObfuscatedName("ff.ao")
    public boolean field1841 = false;

    @ObfuscatedName("ff.ay")
    public int field1860 = -1;

    @ObfuscatedName("ff.aj")
    public int[] field1861;

    @ObfuscatedName("ff.ap")
    public int field1862 = -1;

    @ObfuscatedName("ff.ai")
    public int field1859 = -1;

    @ObfuscatedName("ff.ac")
    public int field1868 = -1;

    @ObfuscatedName("ff.ag")
    public int field1865 = 0;

    @ObfuscatedName("ff.ar")
    public int field1866 = 0;

    @ObfuscatedName("ff.az")
    public int field1867 = 0;

    @ObfuscatedName("ff.ah")
    public int[] field1872;

    @ObfuscatedName("ff.af")
    public boolean field1855 = true;

    @ObfuscatedName("ff.ax")
    public class378 field1870;

    @ObfuscatedName("fe.n(IB)Lff;")
    public static class169 method2878(int arg0) {
        class169 var1 = (class169) field1830.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1820.method4710(6, arg0);
        class169 var3 = new class169();
        var3.field1827 = arg0;
        if (var2 != null) {
            var3.method2891(new class400(var2));
        }
        var3.method2883();
        if (var3.field1841) {
            var3.field1837 = 0;
            var3.field1838 = false;
        }
        field1830.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ff.c(I)V")
    public void method2883() {
        if (this.field1839 == -1) {
            this.field1839 = 0;
            if (this.field1828 != null && (this.field1829 == null || this.field1829[0] == 10)) {
                this.field1839 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field1847[var1] != null) {
                    this.field1839 = 1;
                }
            }
        }
        if (this.field1860 == -1) {
            this.field1860 = this.field1837 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ff.m(Lot;B)V")
    public void method2891(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2894(arg0, var2);
        }
    }

    @ObfuscatedName("ff.k(Lot;II)V")
    public void method2894(class400 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6217();
            if (var3 > 0) {
                if (this.field1828 == null || field1849) {
                    this.field1829 = new int[var3];
                    this.field1828 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field1828[var4] = arg0.method6219();
                        this.field1829[var4] = arg0.method6217();
                    }
                } else {
                    arg0.field4272 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field1845 = arg0.method6226();
        } else if (arg1 == 5) {
            int var5 = arg0.method6217();
            if (var5 > 0) {
                if (this.field1828 == null || field1849) {
                    this.field1829 = null;
                    this.field1828 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1828[var6] = arg0.method6219();
                    }
                } else {
                    arg0.field4272 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field1835 = arg0.method6217();
        } else if (arg1 == 15) {
            this.field1836 = arg0.method6217();
        } else if (arg1 == 17) {
            this.field1837 = 0;
            this.field1838 = false;
        } else if (arg1 == 18) {
            this.field1838 = false;
        } else if (arg1 == 19) {
            this.field1839 = arg0.method6217();
        } else if (arg1 == 21) {
            this.field1840 = 0;
        } else if (arg1 == 22) {
            this.field1822 = true;
        } else if (arg1 == 23) {
            this.field1842 = true;
        } else if (arg1 == 24) {
            this.field1824 = arg0.method6219();
            if (this.field1824 == 65535) {
                this.field1824 = -1;
            }
        } else if (arg1 == 27) {
            this.field1837 = 1;
        } else if (arg1 == 28) {
            this.field1844 = arg0.method6217();
        } else if (arg1 == 29) {
            this.field1863 = arg0.method6218();
        } else if (arg1 == 39) {
            this.field1846 = arg0.method6218() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1847[arg1 - 30] = arg0.method6226();
            if (this.field1847[arg1 - 30].equalsIgnoreCase(class283.field3403)) {
                this.field1847[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method6217();
            this.field1834 = new short[var7];
            this.field1832 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1834[var8] = (short) arg0.method6219();
                this.field1832[var8] = (short) arg0.method6219();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method6217();
            this.field1854 = new short[var9];
            this.field1843 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1854[var10] = (short) arg0.method6219();
                this.field1843[var10] = (short) arg0.method6219();
            }
        } else if (arg1 == 61) {
            arg0.method6219();
        } else if (arg1 == 62) {
            this.field1850 = true;
        } else if (arg1 == 64) {
            this.field1851 = false;
        } else if (arg1 == 65) {
            this.field1864 = arg0.method6219();
        } else if (arg1 == 66) {
            this.field1853 = arg0.method6219();
        } else if (arg1 == 67) {
            this.field1819 = arg0.method6219();
        } else if (arg1 == 68) {
            this.field1869 = arg0.method6219();
        } else if (arg1 == 69) {
            arg0.method6217();
        } else if (arg1 == 70) {
            this.field1848 = arg0.method6220();
        } else if (arg1 == 71) {
            this.field1856 = arg0.method6220();
        } else if (arg1 == 72) {
            this.field1857 = arg0.method6220();
        } else if (arg1 == 73) {
            this.field1858 = true;
        } else if (arg1 == 74) {
            this.field1841 = true;
        } else if (arg1 == 75) {
            this.field1860 = arg0.method6217();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field1862 = arg0.method6219();
            if (this.field1862 == 65535) {
                this.field1862 = -1;
            }
            this.field1859 = arg0.method6219();
            if (this.field1859 == 65535) {
                this.field1859 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method6219();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method6217();
            this.field1861 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field1861[var15] = arg0.method6219();
                if (this.field1861[var15] == 65535) {
                    this.field1861[var15] = -1;
                }
            }
            this.field1861[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field1868 = arg0.method6219();
            this.field1865 = arg0.method6217();
        } else if (arg1 == 79) {
            this.field1866 = arg0.method6219();
            this.field1867 = arg0.method6219();
            this.field1865 = arg0.method6217();
            int var11 = arg0.method6217();
            this.field1872 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1872[var12] = arg0.method6219();
            }
        } else if (arg1 == 81) {
            this.field1840 = arg0.method6217() * 256;
        } else if (arg1 == 82) {
            this.field1852 = arg0.method6219();
        } else if (arg1 == 89) {
            this.field1855 = false;
        } else if (arg1 == 249) {
            this.field1870 = class158.method2378(arg0, this.field1870);
        }
    }

    @ObfuscatedName("ff.o(II)Z")
    public final boolean method2886(int arg0) {
        if (this.field1829 != null) {
            for (int var4 = 0; var4 < this.field1829.length; var4++) {
                if (this.field1829[var4] == arg0) {
                    return Statics.field1821.method4735(this.field1828[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field1828 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1828.length; var3++) {
                var2 &= Statics.field1821.method4735(this.field1828[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ff.g(B)Z")
    public final boolean method2887() {
        if (this.field1828 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1828.length; var2++) {
            var1 &= Statics.field1821.method4735(this.field1828[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ff.z(II[[IIIIB)Lhr;")
    public final class214 method2888(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1829 == null) {
            var7 = (long) ((this.field1827 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1827 << 10) + (arg0 << 3) + arg1);
        }
        class214 var9 = (class214) field1831.method4167(var7);
        if (var9 == null) {
            class206 var10 = this.method2913(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field1822) {
                var10.field2269 = (short) (this.field1863 + 64);
                var10.field2260 = (short) (this.field1846 + 768);
                var10.method3644();
                var9 = var10;
            } else {
                var9 = var10.method3627(this.field1863 + 64, this.field1846 + 768, -50, -10, -50);
            }
            field1831.method4169(var9, var7);
        }
        if (this.field1822) {
            var9 = ((class206) var9).method3611();
        }
        if (this.field1840 >= 0) {
            if (var9 instanceof class220) {
                var9 = ((class220) var9).method4014(arg2, arg3, arg4, arg5, true, this.field1840);
            } else if (var9 instanceof class206) {
                var9 = ((class206) var9).method3612(arg2, arg3, arg4, arg5, true, this.field1840);
            }
        }
        return var9;
    }

    @ObfuscatedName("ff.a(II[[IIIII)Lhg;")
    public final class220 method2889(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1829 == null) {
            var7 = (long) ((this.field1827 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1827 << 10) + (arg0 << 3) + arg1);
        }
        class220 var9 = (class220) field1825.method4167(var7);
        if (var9 == null) {
            class206 var10 = this.method2913(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3627(this.field1863 + 64, this.field1846 + 768, -50, -10, -50);
            field1825.method4169(var9, var7);
        }
        if (this.field1840 >= 0) {
            var9 = var9.method4014(arg2, arg3, arg4, arg5, true, this.field1840);
        }
        return var9;
    }

    @ObfuscatedName("ff.u(II[[IIIILfa;II)Lhg;")
    public final class220 method2890(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class172 arg6, int arg7) {
        long var9;
        if (this.field1829 == null) {
            var9 = (long) ((this.field1827 << 10) + arg1);
        } else {
            var9 = (long) ((this.field1827 << 10) + (arg0 << 3) + arg1);
        }
        class220 var11 = (class220) field1825.method4167(var9);
        if (var11 == null) {
            class206 var12 = this.method2913(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3627(this.field1863 + 64, this.field1846 + 768, -50, -10, -50);
            field1825.method4169(var11, var9);
        }
        if (arg6 == null && this.field1840 == -1) {
            return var11;
        }
        class220 var13;
        if (arg6 == null) {
            var13 = var11.method4015(true);
        } else {
            var13 = arg6.method3065(var11, arg7, arg1);
        }
        if (this.field1840 >= 0) {
            var13 = var13.method4014(arg2, arg3, arg4, arg5, false, this.field1840);
        }
        return var13;
    }

    @ObfuscatedName("ff.e(IIS)Lgl;")
    public final class206 method2913(int arg0, int arg1) {
        class206 var3 = null;
        if (this.field1829 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field1828 == null) {
                return null;
            }
            boolean var4 = this.field1850;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field1828.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field1828[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class206) field1823.method4167((long) var7);
                if (var3 == null) {
                    var3 = class206.method3631(Statics.field1821, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3633();
                    }
                    field1823.method4169(var3, (long) var7);
                }
                if (var5 > 1) {
                    field1826[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class206(field1826, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field1829.length; var9++) {
                if (this.field1829[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field1828[var8];
            boolean var11 = this.field1850 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class206) field1823.method4167((long) var10);
            if (var3 == null) {
                var3 = class206.method3631(Statics.field1821, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3633();
                }
                field1823.method4169(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field1864 == 128 && this.field1853 == 128 && this.field1819 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field1848 == 0 && this.field1856 == 0 && this.field1857 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class206 var14 = new class206(var3, arg1 == 0 && !var12 && !var13, this.field1834 == null, this.field1854 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3617(256);
            var14.method3610(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3614();
        } else if (var15 == 2) {
            var14.method3615();
        } else if (var15 == 3) {
            var14.method3666();
        }
        if (this.field1834 != null) {
            for (int var16 = 0; var16 < this.field1834.length; var16++) {
                var14.method3673(this.field1834[var16], this.field1832[var16]);
            }
        }
        if (this.field1854 != null) {
            for (int var17 = 0; var17 < this.field1854.length; var17++) {
                var14.method3620(this.field1854[var17], this.field1843[var17]);
            }
        }
        if (var12) {
            var14.method3622(this.field1864, this.field1853, this.field1819);
        }
        if (var13) {
            var14.method3610(this.field1848, this.field1856, this.field1857);
        }
        return var14;
    }

    @ObfuscatedName("ff.l(I)Lff;")
    public final class169 method2895() {
        int var1 = -1;
        if (this.field1862 != -1) {
            var1 = class257.method4239(this.field1862);
        } else if (this.field1859 != -1) {
            var1 = class257.field3001[this.field1859];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1861.length - 1) {
            var2 = this.field1861[var1];
        } else {
            var2 = this.field1861[this.field1861.length - 1];
        }
        return var2 == -1 ? null : method2878(var2);
    }

    @ObfuscatedName("ff.y(III)I")
    public int method2904(int arg0, int arg1) {
        class378 var3 = this.field1870;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class368 var5 = (class368) var3.method5996((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4054;
            }
        }
        return var4;
    }

    @ObfuscatedName("ff.v(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2925(int arg0, String arg1) {
        return class158.method2382(this.field1870, arg0, arg1);
    }

    @ObfuscatedName("ff.f(I)Z")
    public boolean method2914() {
        if (this.field1861 == null) {
            return this.field1868 != -1 || this.field1872 != null;
        }
        for (int var1 = 0; var1 < this.field1861.length; var1++) {
            if (this.field1861[var1] != -1) {
                class169 var2 = method2878(this.field1861[var1]);
                if (var2.field1868 != -1 || var2.field1872 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

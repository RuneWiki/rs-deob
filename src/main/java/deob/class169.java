package deob;

@ObfuscatedName("fe")
public class class169 extends class365 {

    @ObfuscatedName("fe.i")
    public static boolean field1837 = false;

    @ObfuscatedName("fe.a")
    public static class236 field1826 = new class236(4096);

    @ObfuscatedName("fe.o")
    public static class236 field1827 = new class236(500);

    @ObfuscatedName("fe.g")
    public static class236 field1866 = new class236(30);

    @ObfuscatedName("fe.e")
    public static class236 field1843 = new class236(30);

    @ObfuscatedName("fe.p")
    public static class206[] field1830 = new class206[4];

    @ObfuscatedName("fe.j")
    public int field1825;

    @ObfuscatedName("fe.b")
    public int[] field1832;

    @ObfuscatedName("fe.x")
    public int[] field1833;

    @ObfuscatedName("fe.y")
    public String field1834 = class283.field3566;

    @ObfuscatedName("fe.k")
    public short[] field1835;

    @ObfuscatedName("fe.t")
    public short[] field1836;

    @ObfuscatedName("fe.l")
    public short[] field1870;

    @ObfuscatedName("fe.u")
    public short[] field1838;

    @ObfuscatedName("fe.n")
    public int field1828 = 1;

    @ObfuscatedName("fe.z")
    public int field1840 = 1;

    @ObfuscatedName("fe.q")
    public int field1841 = 2;

    @ObfuscatedName("fe.d")
    public boolean field1842 = true;

    @ObfuscatedName("fe.r")
    public int field1869 = -1;

    @ObfuscatedName("fe.m")
    public int field1844 = -1;

    @ObfuscatedName("fe.c")
    public boolean field1845 = false;

    @ObfuscatedName("fe.f")
    public boolean field1846 = false;

    @ObfuscatedName("fe.h")
    public int field1847 = -1;

    @ObfuscatedName("fe.v")
    public int field1848 = 16;

    @ObfuscatedName("fe.ag")
    public int field1823 = 0;

    @ObfuscatedName("fe.ae")
    public int field1868 = 0;

    @ObfuscatedName("fe.aq")
    public String[] field1851 = new String[5];

    @ObfuscatedName("fe.al")
    public int field1829 = -1;

    @ObfuscatedName("fe.am")
    public int field1871 = -1;

    @ObfuscatedName("fe.ai")
    public boolean field1854 = false;

    @ObfuscatedName("fe.ah")
    public boolean field1855 = true;

    @ObfuscatedName("fe.as")
    public int field1856 = 128;

    @ObfuscatedName("fe.at")
    public int field1857 = 128;

    @ObfuscatedName("fe.az")
    public int field1858 = 128;

    @ObfuscatedName("fe.ac")
    public int field1859 = 0;

    @ObfuscatedName("fe.ak")
    public int field1860 = 0;

    @ObfuscatedName("fe.ab")
    public int field1861 = 0;

    @ObfuscatedName("fe.ar")
    public boolean field1862 = false;

    @ObfuscatedName("fe.ad")
    public boolean field1863 = false;

    @ObfuscatedName("fe.an")
    public int field1864 = -1;

    @ObfuscatedName("fe.ax")
    public int[] field1824;

    @ObfuscatedName("fe.av")
    public int field1850 = -1;

    @ObfuscatedName("fe.ap")
    public int field1865 = -1;

    @ObfuscatedName("fe.au")
    public int field1867 = -1;

    @ObfuscatedName("fe.aj")
    public int field1875 = 0;

    @ObfuscatedName("fe.af")
    public int field1852 = 0;

    @ObfuscatedName("fe.aw")
    public int field1849 = 0;

    @ObfuscatedName("fe.ao")
    public int[] field1872;

    @ObfuscatedName("fe.aa")
    public boolean field1873 = true;

    @ObfuscatedName("fe.ay")
    public class379 field1874;

    @ObfuscatedName("fe.w(I)V")
    public void method2972() {
        if (this.field1869 == -1) {
            this.field1869 = 0;
            if (this.field1832 != null && (this.field1833 == null || this.field1833[0] == 10)) {
                this.field1869 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field1851[var1] != null) {
                    this.field1869 = 1;
                }
            }
        }
        if (this.field1864 == -1) {
            this.field1864 = this.field1841 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("fe.s(Lop;I)V")
    public void method3012(class401 arg0) {
        while (true) {
            int var2 = arg0.method6240();
            if (var2 == 0) {
                return;
            }
            this.method2973(arg0, var2);
        }
    }

    @ObfuscatedName("fe.a(Lop;IB)V")
    public void method2973(class401 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6240();
            if (var3 > 0) {
                if (this.field1832 == null || field1837) {
                    this.field1833 = new int[var3];
                    this.field1832 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field1832[var4] = arg0.method6242();
                        this.field1833[var4] = arg0.method6240();
                    }
                } else {
                    arg0.field4300 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field1834 = arg0.method6335();
        } else if (arg1 == 5) {
            int var5 = arg0.method6240();
            if (var5 > 0) {
                if (this.field1832 == null || field1837) {
                    this.field1833 = null;
                    this.field1832 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1832[var6] = arg0.method6242();
                    }
                } else {
                    arg0.field4300 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field1828 = arg0.method6240();
        } else if (arg1 == 15) {
            this.field1840 = arg0.method6240();
        } else if (arg1 == 17) {
            this.field1841 = 0;
            this.field1842 = false;
        } else if (arg1 == 18) {
            this.field1842 = false;
        } else if (arg1 == 19) {
            this.field1869 = arg0.method6240();
        } else if (arg1 == 21) {
            this.field1844 = 0;
        } else if (arg1 == 22) {
            this.field1845 = true;
        } else if (arg1 == 23) {
            this.field1846 = true;
        } else if (arg1 == 24) {
            this.field1847 = arg0.method6242();
            if (this.field1847 == 65535) {
                this.field1847 = -1;
            }
        } else if (arg1 == 27) {
            this.field1841 = 1;
        } else if (arg1 == 28) {
            this.field1848 = arg0.method6240();
        } else if (arg1 == 29) {
            this.field1823 = arg0.method6241();
        } else if (arg1 == 39) {
            this.field1868 = arg0.method6241();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1851[arg1 - 30] = arg0.method6335();
            if (this.field1851[arg1 - 30].equalsIgnoreCase(class283.field3634)) {
                this.field1851[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method6240();
            this.field1835 = new short[var7];
            this.field1836 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1835[var8] = (short) arg0.method6242();
                this.field1836[var8] = (short) arg0.method6242();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method6240();
            this.field1870 = new short[var9];
            this.field1838 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1870[var10] = (short) arg0.method6242();
                this.field1838[var10] = (short) arg0.method6242();
            }
        } else if (arg1 == 61) {
            arg0.method6242();
        } else if (arg1 == 62) {
            this.field1854 = true;
        } else if (arg1 == 64) {
            this.field1855 = false;
        } else if (arg1 == 65) {
            this.field1856 = arg0.method6242();
        } else if (arg1 == 66) {
            this.field1857 = arg0.method6242();
        } else if (arg1 == 67) {
            this.field1858 = arg0.method6242();
        } else if (arg1 == 68) {
            this.field1871 = arg0.method6242();
        } else if (arg1 == 69) {
            arg0.method6240();
        } else if (arg1 == 70) {
            this.field1859 = arg0.method6243();
        } else if (arg1 == 71) {
            this.field1860 = arg0.method6243();
        } else if (arg1 == 72) {
            this.field1861 = arg0.method6243();
        } else if (arg1 == 73) {
            this.field1862 = true;
        } else if (arg1 == 74) {
            this.field1863 = true;
        } else if (arg1 == 75) {
            this.field1864 = arg0.method6240();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field1850 = arg0.method6242();
            if (this.field1850 == 65535) {
                this.field1850 = -1;
            }
            this.field1865 = arg0.method6242();
            if (this.field1865 == 65535) {
                this.field1865 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method6242();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method6240();
            this.field1824 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field1824[var15] = arg0.method6242();
                if (this.field1824[var15] == 65535) {
                    this.field1824[var15] = -1;
                }
            }
            this.field1824[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field1867 = arg0.method6242();
            this.field1875 = arg0.method6240();
        } else if (arg1 == 79) {
            this.field1852 = arg0.method6242();
            this.field1849 = arg0.method6242();
            this.field1875 = arg0.method6240();
            int var11 = arg0.method6240();
            this.field1872 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1872[var12] = arg0.method6242();
            }
        } else if (arg1 == 81) {
            this.field1844 = arg0.method6240() * 256;
        } else if (arg1 == 82) {
            this.field1829 = arg0.method6242();
        } else if (arg1 == 89) {
            this.field1873 = false;
        } else if (arg1 == 249) {
            this.field1874 = class158.method164(arg0, this.field1874);
        }
    }

    @ObfuscatedName("fe.o(II)Z")
    public final boolean method2987(int arg0) {
        if (this.field1833 != null) {
            for (int var4 = 0; var4 < this.field1833.length; var4++) {
                if (this.field1833[var4] == arg0) {
                    return Statics.field1853.method4745(this.field1832[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field1832 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1832.length; var3++) {
                var2 &= Statics.field1853.method4745(this.field1832[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fe.g(I)Z")
    public final boolean method2975() {
        if (this.field1832 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1832.length; var2++) {
            var1 &= Statics.field1853.method4745(this.field1832[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("fe.e(II[[IIIIB)Lhj;")
    public final class214 method2976(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1833 == null) {
            var7 = (long) ((this.field1825 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1825 << 10) + (arg0 << 3) + arg1);
        }
        class214 var9 = (class214) field1866.method4205(var7);
        if (var9 == null) {
            class206 var10 = this.method3006(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field1845) {
                var10.field2275 = (short) (this.field1823 + 64);
                var10.field2271 = (short) (this.field1868 * 25 + 768);
                var10.method3675();
                var9 = var10;
            } else {
                var9 = var10.method3679(this.field1823 + 64, this.field1868 * 25 + 768, -50, -10, -50);
            }
            field1866.method4206(var9, var7);
        }
        if (this.field1845) {
            var9 = ((class206) var9).method3663();
        }
        if (this.field1844 >= 0) {
            if (var9 instanceof class220) {
                var9 = ((class220) var9).method4063(arg2, arg3, arg4, arg5, true, this.field1844);
            } else if (var9 instanceof class206) {
                var9 = ((class206) var9).method3683(arg2, arg3, arg4, arg5, true, this.field1844);
            }
        }
        return var9;
    }

    @ObfuscatedName("fe.p(II[[IIIIB)Lhl;")
    public final class220 method2977(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1833 == null) {
            var7 = (long) ((this.field1825 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1825 << 10) + (arg0 << 3) + arg1);
        }
        class220 var9 = (class220) field1843.method4205(var7);
        if (var9 == null) {
            class206 var10 = this.method3006(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3679(this.field1823 + 64, this.field1868 * 25 + 768, -50, -10, -50);
            field1843.method4206(var9, var7);
        }
        if (this.field1844 >= 0) {
            var9 = var9.method4063(arg2, arg3, arg4, arg5, true, this.field1844);
        }
        return var9;
    }

    @ObfuscatedName("fe.j(II[[IIIILfm;IB)Lhl;")
    public final class220 method2978(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class172 arg6, int arg7) {
        long var9;
        if (this.field1833 == null) {
            var9 = (long) ((this.field1825 << 10) + arg1);
        } else {
            var9 = (long) ((this.field1825 << 10) + (arg0 << 3) + arg1);
        }
        class220 var11 = (class220) field1843.method4205(var9);
        if (var11 == null) {
            class206 var12 = this.method3006(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3679(this.field1823 + 64, this.field1868 * 25 + 768, -50, -10, -50);
            field1843.method4206(var11, var9);
        }
        if (arg6 == null && this.field1844 == -1) {
            return var11;
        }
        class220 var13;
        if (arg6 == null) {
            var13 = var11.method4065(true);
        } else {
            var13 = arg6.method3128(var11, arg7, arg1);
        }
        if (this.field1844 >= 0) {
            var13 = var13.method4063(arg2, arg3, arg4, arg5, false, this.field1844);
        }
        return var13;
    }

    @ObfuscatedName("fe.b(III)Lgk;")
    public final class206 method3006(int arg0, int arg1) {
        class206 var3 = null;
        if (this.field1833 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field1832 == null) {
                return null;
            }
            boolean var4 = this.field1854;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field1832.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field1832[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class206) field1827.method4205((long) var7);
                if (var3 == null) {
                    var3 = class206.method3658(Statics.field1853, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3673();
                    }
                    field1827.method4206(var3, (long) var7);
                }
                if (var5 > 1) {
                    field1830[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class206(field1830, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field1833.length; var9++) {
                if (this.field1833[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field1832[var8];
            boolean var11 = this.field1854 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class206) field1827.method4205((long) var10);
            if (var3 == null) {
                var3 = class206.method3658(Statics.field1853, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3673();
                }
                field1827.method4206(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field1856 == 128 && this.field1857 == 128 && this.field1858 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field1859 == 0 && this.field1860 == 0 && this.field1861 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class206 var14 = new class206(var3, arg1 == 0 && !var12 && !var13, this.field1835 == null, this.field1870 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3659(256);
            var14.method3670(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3706();
        } else if (var15 == 2) {
            var14.method3667();
        } else if (var15 == 3) {
            var14.method3668();
        }
        if (this.field1835 != null) {
            for (int var16 = 0; var16 < this.field1835.length; var16++) {
                var14.method3687(this.field1835[var16], this.field1836[var16]);
            }
        }
        if (this.field1870 != null) {
            for (int var17 = 0; var17 < this.field1870.length; var17++) {
                var14.method3672(this.field1870[var17], this.field1838[var17]);
            }
        }
        if (var12) {
            var14.method3705(this.field1856, this.field1857, this.field1858);
        }
        if (var13) {
            var14.method3670(this.field1859, this.field1860, this.field1861);
        }
        return var14;
    }

    @ObfuscatedName("fe.x(B)Lfe;")
    public final class169 method2980() {
        int var1 = -1;
        if (this.field1850 != -1) {
            var1 = class257.method2410(this.field1850);
        } else if (this.field1865 != -1) {
            var1 = class257.field3015[this.field1865];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1824.length - 1) {
            var2 = this.field1824[var1];
        } else {
            var2 = this.field1824[this.field1824.length - 1];
        }
        return var2 == -1 ? null : Statics.method2740(var2);
    }

    @ObfuscatedName("fe.y(III)I")
    public int method2995(int arg0, int arg1) {
        return class158.method2133(this.field1874, arg0, arg1);
    }

    @ObfuscatedName("fe.k(ILjava/lang/String;S)Ljava/lang/String;")
    public String method3013(int arg0, String arg1) {
        return class158.method2887(this.field1874, arg0, arg1);
    }

    @ObfuscatedName("mr.t(B)V")
    public static void method5643() {
        field1826.method4207();
        field1827.method4207();
        field1866.method4207();
        field1843.method4207();
    }

    @ObfuscatedName("fe.l(I)Z")
    public boolean method2998() {
        if (this.field1824 == null) {
            return this.field1867 != -1 || this.field1872 != null;
        }
        for (int var1 = 0; var1 < this.field1824.length; var1++) {
            if (this.field1824[var1] != -1) {
                class169 var2 = Statics.method2740(this.field1824[var1]);
                if (var2.field1867 != -1 || var2.field1872 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

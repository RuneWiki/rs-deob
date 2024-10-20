package deob;

@ObfuscatedName("fo")
public class class169 extends class365 {

    @ObfuscatedName("fo.l")
    public static boolean field1867 = false;

    @ObfuscatedName("fo.j")
    public static class236 field1824 = new class236(4096);

    @ObfuscatedName("fo.m")
    public static class236 field1825 = new class236(500);

    @ObfuscatedName("fo.k")
    public static class236 field1826 = new class236(30);

    @ObfuscatedName("fo.t")
    public static class236 field1827 = new class236(30);

    @ObfuscatedName("fo.a")
    public static class206[] field1831 = new class206[4];

    @ObfuscatedName("fo.e")
    public int field1833;

    @ObfuscatedName("fo.i")
    public int[] field1830;

    @ObfuscatedName("fo.y")
    public int[] field1860;

    @ObfuscatedName("fo.w")
    public String field1832 = class283.field3360;

    @ObfuscatedName("fo.g")
    public short[] field1875;

    @ObfuscatedName("fo.v")
    public short[] field1834;

    @ObfuscatedName("fo.s")
    public short[] field1835;

    @ObfuscatedName("fo.c")
    public short[] field1836;

    @ObfuscatedName("fo.b")
    public int field1845 = 1;

    @ObfuscatedName("fo.x")
    public int field1829 = 1;

    @ObfuscatedName("fo.p")
    public int field1839 = 2;

    @ObfuscatedName("fo.z")
    public boolean field1866 = true;

    @ObfuscatedName("fo.h")
    public int field1841 = -1;

    @ObfuscatedName("fo.o")
    public int field1842 = -1;

    @ObfuscatedName("fo.r")
    public boolean field1843 = false;

    @ObfuscatedName("fo.n")
    public boolean field1844 = false;

    @ObfuscatedName("fo.u")
    public int field1846 = -1;

    @ObfuscatedName("fo.d")
    public int field1838 = 16;

    @ObfuscatedName("fo.ab")
    public int field1847 = 0;

    @ObfuscatedName("fo.ad")
    public int field1848 = 0;

    @ObfuscatedName("fo.as")
    public String[] field1849 = new String[5];

    @ObfuscatedName("fo.ak")
    public int field1850 = -1;

    @ObfuscatedName("fo.ah")
    public int field1851 = -1;

    @ObfuscatedName("fo.ay")
    public boolean field1852 = false;

    @ObfuscatedName("fo.al")
    public boolean field1840 = true;

    @ObfuscatedName("fo.ao")
    public int field1854 = 128;

    @ObfuscatedName("fo.au")
    public int field1855 = 128;

    @ObfuscatedName("fo.aa")
    public int field1856 = 128;

    @ObfuscatedName("fo.ag")
    public int field1857 = 0;

    @ObfuscatedName("fo.aq")
    public int field1858 = 0;

    @ObfuscatedName("fo.ar")
    public int field1859 = 0;

    @ObfuscatedName("fo.ac")
    public boolean field1828 = false;

    @ObfuscatedName("fo.at")
    public boolean field1861 = false;

    @ObfuscatedName("fo.ax")
    public int field1864 = -1;

    @ObfuscatedName("fo.an")
    public int[] field1863;

    @ObfuscatedName("fo.av")
    public int field1821 = -1;

    @ObfuscatedName("fo.ap")
    public int field1865 = -1;

    @ObfuscatedName("fo.aj")
    public int field1823 = -1;

    @ObfuscatedName("fo.am")
    public int field1862 = 0;

    @ObfuscatedName("fo.aw")
    public int field1873 = 0;

    @ObfuscatedName("fo.az")
    public int field1869 = 0;

    @ObfuscatedName("fo.ae")
    public int[] field1870;

    @ObfuscatedName("fo.ai")
    public boolean field1871 = true;

    @ObfuscatedName("fo.af")
    public class379 field1872;

    @ObfuscatedName("dj.l(Lkl;Lkl;ZI)V")
    public static void method2375(class290 arg0, class290 arg1, boolean arg2) {
        Statics.field1822 = arg0;
        Statics.field1868 = arg1;
        field1867 = arg2;
    }

    @ObfuscatedName("ir.q(II)Lfo;")
    public static class169 method4277(int arg0) {
        class169 var1 = (class169) field1824.method4223((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1822.method4756(6, arg0);
        class169 var3 = new class169();
        var3.field1833 = arg0;
        if (var2 != null) {
            var3.method2945(new class401(var2));
        }
        var3.method2944();
        if (var3.field1861) {
            var3.field1839 = 0;
            var3.field1866 = false;
        }
        field1824.method4225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fo.f(I)V")
    public void method2944() {
        if (this.field1841 == -1) {
            this.field1841 = 0;
            if (this.field1830 != null && (this.field1860 == null || this.field1860[0] == 10)) {
                this.field1841 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field1849[var1] != null) {
                    this.field1841 = 1;
                }
            }
        }
        if (this.field1864 == -1) {
            this.field1864 = this.field1839 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("fo.j(Lot;I)V")
    public void method2945(class401 arg0) {
        while (true) {
            int var2 = arg0.method6272();
            if (var2 == 0) {
                return;
            }
            this.method2946(arg0, var2);
        }
    }

    @ObfuscatedName("fo.m(Lot;IB)V")
    public void method2946(class401 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6272();
            if (var3 > 0) {
                if (this.field1830 == null || field1867) {
                    this.field1860 = new int[var3];
                    this.field1830 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field1830[var4] = arg0.method6284();
                        this.field1860[var4] = arg0.method6272();
                    }
                } else {
                    arg0.field4292 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field1832 = arg0.method6474();
        } else if (arg1 == 5) {
            int var5 = arg0.method6272();
            if (var5 > 0) {
                if (this.field1830 == null || field1867) {
                    this.field1860 = null;
                    this.field1830 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1830[var6] = arg0.method6284();
                    }
                } else {
                    arg0.field4292 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field1845 = arg0.method6272();
        } else if (arg1 == 15) {
            this.field1829 = arg0.method6272();
        } else if (arg1 == 17) {
            this.field1839 = 0;
            this.field1866 = false;
        } else if (arg1 == 18) {
            this.field1866 = false;
        } else if (arg1 == 19) {
            this.field1841 = arg0.method6272();
        } else if (arg1 == 21) {
            this.field1842 = 0;
        } else if (arg1 == 22) {
            this.field1843 = true;
        } else if (arg1 == 23) {
            this.field1844 = true;
        } else if (arg1 == 24) {
            this.field1846 = arg0.method6284();
            if (this.field1846 == 65535) {
                this.field1846 = -1;
            }
        } else if (arg1 == 27) {
            this.field1839 = 1;
        } else if (arg1 == 28) {
            this.field1838 = arg0.method6272();
        } else if (arg1 == 29) {
            this.field1847 = arg0.method6273();
        } else if (arg1 == 39) {
            this.field1848 = arg0.method6273() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1849[arg1 - 30] = arg0.method6474();
            if (this.field1849[arg1 - 30].equalsIgnoreCase(class283.field3329)) {
                this.field1849[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method6272();
            this.field1875 = new short[var7];
            this.field1834 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1875[var8] = (short) arg0.method6284();
                this.field1834[var8] = (short) arg0.method6284();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method6272();
            this.field1835 = new short[var9];
            this.field1836 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1835[var10] = (short) arg0.method6284();
                this.field1836[var10] = (short) arg0.method6284();
            }
        } else if (arg1 == 61) {
            arg0.method6284();
        } else if (arg1 == 62) {
            this.field1852 = true;
        } else if (arg1 == 64) {
            this.field1840 = false;
        } else if (arg1 == 65) {
            this.field1854 = arg0.method6284();
        } else if (arg1 == 66) {
            this.field1855 = arg0.method6284();
        } else if (arg1 == 67) {
            this.field1856 = arg0.method6284();
        } else if (arg1 == 68) {
            this.field1851 = arg0.method6284();
        } else if (arg1 == 69) {
            arg0.method6272();
        } else if (arg1 == 70) {
            this.field1857 = arg0.method6308();
        } else if (arg1 == 71) {
            this.field1858 = arg0.method6308();
        } else if (arg1 == 72) {
            this.field1859 = arg0.method6308();
        } else if (arg1 == 73) {
            this.field1828 = true;
        } else if (arg1 == 74) {
            this.field1861 = true;
        } else if (arg1 == 75) {
            this.field1864 = arg0.method6272();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field1821 = arg0.method6284();
            if (this.field1821 == 65535) {
                this.field1821 = -1;
            }
            this.field1865 = arg0.method6284();
            if (this.field1865 == 65535) {
                this.field1865 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method6284();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method6272();
            this.field1863 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field1863[var15] = arg0.method6284();
                if (this.field1863[var15] == 65535) {
                    this.field1863[var15] = -1;
                }
            }
            this.field1863[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field1823 = arg0.method6284();
            this.field1862 = arg0.method6272();
        } else if (arg1 == 79) {
            this.field1873 = arg0.method6284();
            this.field1869 = arg0.method6284();
            this.field1862 = arg0.method6272();
            int var11 = arg0.method6272();
            this.field1870 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1870[var12] = arg0.method6284();
            }
        } else if (arg1 == 81) {
            this.field1842 = arg0.method6272() * 256;
        } else if (arg1 == 82) {
            this.field1850 = arg0.method6284();
        } else if (arg1 == 89) {
            this.field1871 = false;
        } else if (arg1 == 249) {
            this.field1872 = class158.method360(arg0, this.field1872);
        }
    }

    @ObfuscatedName("fo.k(II)Z")
    public final boolean method2958(int arg0) {
        if (this.field1860 != null) {
            for (int var4 = 0; var4 < this.field1860.length; var4++) {
                if (this.field1860[var4] == arg0) {
                    return Statics.field1868.method4758(this.field1830[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field1830 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1830.length; var3++) {
                var2 &= Statics.field1868.method4758(this.field1830[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("fo.t(I)Z")
    public final boolean method2948() {
        if (this.field1830 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field1830.length; var2++) {
            var1 &= Statics.field1868.method4758(this.field1830[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("fo.a(II[[IIIII)Lhi;")
    public final class214 method2950(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1860 == null) {
            var7 = (long) ((this.field1833 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1833 << 10) + (arg0 << 3) + arg1);
        }
        class214 var9 = (class214) field1826.method4223(var7);
        if (var9 == null) {
            class206 var10 = this.method2952(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field1843) {
                var10.field2271 = (short) (this.field1847 + 64);
                var10.field2250 = (short) (this.field1848 + 768);
                var10.method3667();
                var9 = var10;
            } else {
                var9 = var10.method3671(this.field1847 + 64, this.field1848 + 768, -50, -10, -50);
            }
            field1826.method4225(var9, var7);
        }
        if (this.field1843) {
            var9 = ((class206) var9).method3655();
        }
        if (this.field1842 >= 0) {
            if (var9 instanceof class220) {
                var9 = ((class220) var9).method4124(arg2, arg3, arg4, arg5, true, this.field1842);
            } else if (var9 instanceof class206) {
                var9 = ((class206) var9).method3710(arg2, arg3, arg4, arg5, true, this.field1842);
            }
        }
        return var9;
    }

    @ObfuscatedName("fo.e(II[[IIIII)Lhl;")
    public final class220 method2943(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field1860 == null) {
            var7 = (long) ((this.field1833 << 10) + arg1);
        } else {
            var7 = (long) ((this.field1833 << 10) + (arg0 << 3) + arg1);
        }
        class220 var9 = (class220) field1827.method4223(var7);
        if (var9 == null) {
            class206 var10 = this.method2952(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3671(this.field1847 + 64, this.field1848 + 768, -50, -10, -50);
            field1827.method4225(var9, var7);
        }
        if (this.field1842 >= 0) {
            var9 = var9.method4124(arg2, arg3, arg4, arg5, true, this.field1842);
        }
        return var9;
    }

    @ObfuscatedName("fo.i(II[[IIIILfe;IB)Lhl;")
    public final class220 method2976(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class172 arg6, int arg7) {
        long var9;
        if (this.field1860 == null) {
            var9 = (long) ((this.field1833 << 10) + arg1);
        } else {
            var9 = (long) ((this.field1833 << 10) + (arg0 << 3) + arg1);
        }
        class220 var11 = (class220) field1827.method4223(var9);
        if (var11 == null) {
            class206 var12 = this.method2952(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3671(this.field1847 + 64, this.field1848 + 768, -50, -10, -50);
            field1827.method4225(var11, var9);
        }
        if (arg6 == null && this.field1842 == -1) {
            return var11;
        }
        class220 var13;
        if (arg6 == null) {
            var13 = var11.method4062(true);
        } else {
            var13 = arg6.method3107(var11, arg7, arg1);
        }
        if (this.field1842 >= 0) {
            var13 = var13.method4124(arg2, arg3, arg4, arg5, false, this.field1842);
        }
        return var13;
    }

    @ObfuscatedName("fo.y(III)Lgi;")
    public final class206 method2952(int arg0, int arg1) {
        class206 var3 = null;
        if (this.field1860 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field1830 == null) {
                return null;
            }
            boolean var4 = this.field1852;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field1830.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field1830[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class206) field1825.method4223((long) var7);
                if (var3 == null) {
                    var3 = class206.method3692(Statics.field1868, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3665();
                    }
                    field1825.method4225(var3, (long) var7);
                }
                if (var5 > 1) {
                    field1831[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class206(field1831, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field1860.length; var9++) {
                if (this.field1860[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field1830[var8];
            boolean var11 = this.field1852 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class206) field1825.method4223((long) var10);
            if (var3 == null) {
                var3 = class206.method3692(Statics.field1868, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3665();
                }
                field1825.method4225(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field1854 == 128 && this.field1855 == 128 && this.field1856 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field1857 == 0 && this.field1858 == 0 && this.field1859 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class206 var14 = new class206(var3, arg1 == 0 && !var12 && !var13, this.field1875 == null, this.field1835 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3661(256);
            var14.method3662(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3658();
        } else if (var15 == 2) {
            var14.method3659();
        } else if (var15 == 3) {
            var14.method3660();
        }
        if (this.field1875 != null) {
            for (int var16 = 0; var16 < this.field1875.length; var16++) {
                var14.method3663(this.field1875[var16], this.field1834[var16]);
            }
        }
        if (this.field1835 != null) {
            for (int var17 = 0; var17 < this.field1835.length; var17++) {
                var14.method3664(this.field1835[var17], this.field1836[var17]);
            }
        }
        if (var12) {
            var14.method3666(this.field1854, this.field1855, this.field1856);
        }
        if (var13) {
            var14.method3662(this.field1857, this.field1858, this.field1859);
        }
        return var14;
    }

    @ObfuscatedName("fo.w(B)Lfo;")
    public final class169 method2967() {
        int var1 = -1;
        if (this.field1821 != -1) {
            var1 = class257.method2185(this.field1821);
        } else if (this.field1865 != -1) {
            var1 = class257.field3009[this.field1865];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1863.length - 1) {
            var2 = this.field1863[var1];
        } else {
            var2 = this.field1863[this.field1863.length - 1];
        }
        return var2 == -1 ? null : method4277(var2);
    }

    @ObfuscatedName("fo.g(IIS)I")
    public int method2954(int arg0, int arg1) {
        class379 var3 = this.field1872;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class369 var5 = (class369) var3.method6049((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4074;
            }
        }
        return var4;
    }

    @ObfuscatedName("fo.v(ILjava/lang/String;B)Ljava/lang/String;")
    public String method2965(int arg0, String arg1) {
        class379 var3 = this.field1872;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class366 var5 = (class366) var3.method6049((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4071;
            }
        }
        return var4;
    }

    @ObfuscatedName("cl.s(B)V")
    public static void method2079() {
        field1824.method4226();
        field1825.method4226();
        field1826.method4226();
        field1827.method4226();
    }

    @ObfuscatedName("fo.c(B)Z")
    public boolean method2960() {
        if (this.field1863 == null) {
            return this.field1823 != -1 || this.field1870 != null;
        }
        for (int var1 = 0; var1 < this.field1863.length; var1++) {
            if (this.field1863[var1] != -1) {
                class169 var2 = method4277(this.field1863[var1]);
                if (var2.field1823 != -1 || var2.field1870 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

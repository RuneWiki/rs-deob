package deob;

@ObfuscatedName("fi")
public class class171 extends class382 {

    @ObfuscatedName("fi.p")
    public static class249 field1835 = new class249(64);

    @ObfuscatedName("fi.m")
    public static class249 field1836 = new class249(50);

    @ObfuscatedName("fi.t")
    public int field1850;

    @ObfuscatedName("fi.s")
    public String field1845 = class295.field3477;

    @ObfuscatedName("fi.j")
    public int field1839 = 1;

    @ObfuscatedName("fi.w")
    public int[] field1840;

    @ObfuscatedName("fi.n")
    public int[] field1869;

    @ObfuscatedName("fi.r")
    public int field1842 = -1;

    @ObfuscatedName("fi.o")
    public int field1843 = -1;

    @ObfuscatedName("fi.v")
    public int field1844 = -1;

    @ObfuscatedName("fi.d")
    public int field1841 = -1;

    @ObfuscatedName("fi.h")
    public int field1846 = -1;

    @ObfuscatedName("fi.g")
    public int field1847 = -1;

    @ObfuscatedName("fi.e")
    public int field1833 = -1;

    @ObfuscatedName("fi.a")
    public short[] field1849;

    @ObfuscatedName("fi.u")
    public short[] field1861;

    @ObfuscatedName("fi.k")
    public short[] field1851;

    @ObfuscatedName("fi.f")
    public short[] field1856;

    @ObfuscatedName("fi.l")
    public String[] field1857 = new String[5];

    @ObfuscatedName("fi.q")
    public boolean field1863 = true;

    @ObfuscatedName("fi.x")
    public int field1855 = -1;

    @ObfuscatedName("fi.z")
    public int field1860 = 128;

    @ObfuscatedName("fi.i")
    public int field1852 = 128;

    @ObfuscatedName("fi.y")
    public boolean field1858 = false;

    @ObfuscatedName("fi.ah")
    public int field1859 = 0;

    @ObfuscatedName("fi.ao")
    public int field1848 = 0;

    @ObfuscatedName("fi.ab")
    public int field1853 = -1;

    @ObfuscatedName("fi.an")
    public int field1862 = 32;

    @ObfuscatedName("fi.ax")
    public int[] field1838;

    @ObfuscatedName("fi.am")
    public int field1864 = -1;

    @ObfuscatedName("fi.az")
    public int field1865 = -1;

    @ObfuscatedName("fi.au")
    public boolean field1866 = true;

    @ObfuscatedName("fi.av")
    public boolean field1867 = true;

    @ObfuscatedName("fi.ap")
    public boolean field1868 = false;

    @ObfuscatedName("fi.ac")
    public class396 field1837;

    @ObfuscatedName("ii.c(Lku;Lku;I)V")
    public static void method4570(class302 arg0, class302 arg1) {
        Statics.field1854 = arg0;
        Statics.field1834 = arg1;
    }

    @ObfuscatedName("hh.b(II)Lfi;")
    public static class171 method4029(int arg0) {
        class171 var1 = (class171) field1835.method4514((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1854.method5053(9, arg0);
        class171 var3 = new class171();
        var3.field1850 = arg0;
        if (var2 != null) {
            var3.method2993(new class419(var2));
        }
        var3.method2992();
        field1835.method4515(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fi.p(B)V")
    public void method2992() {
    }

    @ObfuscatedName("fi.m(Lpi;S)V")
    public void method2993(class419 arg0) {
        while (true) {
            int var2 = arg0.method6781();
            if (var2 == 0) {
                return;
            }
            this.method3004(arg0, var2);
        }
    }

    @ObfuscatedName("fi.t(Lpi;II)V")
    public void method3004(class419 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6781();
            this.field1840 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1840[var4] = arg0.method6672();
            }
        } else if (arg1 == 2) {
            this.field1845 = arg0.method6707();
        } else if (arg1 == 12) {
            this.field1839 = arg0.method6781();
        } else if (arg1 == 13) {
            this.field1842 = arg0.method6672();
        } else if (arg1 == 14) {
            this.field1841 = arg0.method6672();
        } else if (arg1 == 15) {
            this.field1843 = arg0.method6672();
        } else if (arg1 == 16) {
            this.field1844 = arg0.method6672();
        } else if (arg1 == 17) {
            this.field1841 = arg0.method6672();
            this.field1846 = arg0.method6672();
            this.field1847 = arg0.method6672();
            this.field1833 = arg0.method6672();
        } else if (arg1 == 18) {
            arg0.method6672();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1857[arg1 - 30] = arg0.method6707();
            if (this.field1857[arg1 - 30].equalsIgnoreCase(class295.field3472)) {
                this.field1857[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method6781();
            this.field1849 = new short[var5];
            this.field1861 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1849[var6] = (short) arg0.method6672();
                this.field1861[var6] = (short) arg0.method6672();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6781();
            this.field1851 = new short[var7];
            this.field1856 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1851[var8] = (short) arg0.method6672();
                this.field1856[var8] = (short) arg0.method6672();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method6781();
            this.field1869 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1869[var10] = arg0.method6672();
            }
        } else if (arg1 == 93) {
            this.field1863 = false;
        } else if (arg1 == 95) {
            this.field1855 = arg0.method6672();
        } else if (arg1 == 97) {
            this.field1860 = arg0.method6672();
        } else if (arg1 == 98) {
            this.field1852 = arg0.method6672();
        } else if (arg1 == 99) {
            this.field1858 = true;
        } else if (arg1 == 100) {
            this.field1859 = arg0.method6846();
        } else if (arg1 == 101) {
            this.field1848 = arg0.method6846() * 5;
        } else if (arg1 == 102) {
            this.field1853 = arg0.method6672();
        } else if (arg1 == 103) {
            this.field1862 = arg0.method6672();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1864 = arg0.method6672();
            if (this.field1864 == 65535) {
                this.field1864 = -1;
            }
            this.field1865 = arg0.method6672();
            if (this.field1865 == 65535) {
                this.field1865 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method6672();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method6781();
            this.field1838 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1838[var13] = arg0.method6672();
                if (this.field1838[var13] == 65535) {
                    this.field1838[var13] = -1;
                }
            }
            this.field1838[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1866 = false;
        } else if (arg1 == 109) {
            this.field1867 = false;
        } else if (arg1 == 111) {
            this.field1868 = true;
        } else if (arg1 == 249) {
            this.field1837 = class168.method399(arg0, this.field1837);
        }
    }

    @ObfuscatedName("fi.s(Lgn;ILgn;II)Lgo;")
    public final class204 method2995(class183 arg0, int arg1, class183 arg2, int arg3) {
        if (this.field1838 != null) {
            class171 var5 = this.method3014();
            return var5 == null ? null : var5.method2995(arg0, arg1, arg2, arg3);
        }
        class204 var6 = (class204) field1836.method4514((long) this.field1850);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1840.length; var8++) {
                if (!Statics.field1834.method5055(this.field1840[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class189[] var9 = new class189[this.field1840.length];
            for (int var10 = 0; var10 < this.field1840.length; var10++) {
                var9[var10] = class189.method3427(Statics.field1834, this.field1840[var10], 0);
            }
            class189 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class189(var9, var9.length);
            }
            if (this.field1849 != null) {
                for (int var12 = 0; var12 < this.field1849.length; var12++) {
                    var11.method3443(this.field1849[var12], this.field1861[var12]);
                }
            }
            if (this.field1851 != null) {
                for (int var13 = 0; var13 < this.field1851.length; var13++) {
                    var11.method3456(this.field1851[var13], this.field1856[var13]);
                }
            }
            var6 = var11.method3450(this.field1859 + 64, this.field1848 + 850, -30, -50, -30);
            field1836.method4515(var6, (long) this.field1850);
        }
        class204 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3370(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3332(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method3868(true);
        } else {
            var14 = arg2.method3332(var6, arg3);
        }
        if (this.field1860 != 128 || this.field1852 != 128) {
            var14.method3889(this.field1860, this.field1852, this.field1860);
        }
        return var14;
    }

    @ObfuscatedName("fi.j(I)Lge;")
    public final class189 method2991() {
        if (this.field1838 != null) {
            class171 var1 = this.method3014();
            return var1 == null ? null : var1.method2991();
        } else if (this.field1869 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1869.length; var3++) {
                if (!Statics.field1834.method5055(this.field1869[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class189[] var4 = new class189[this.field1869.length];
            for (int var5 = 0; var5 < this.field1869.length; var5++) {
                var4[var5] = class189.method3427(Statics.field1834, this.field1869[var5], 0);
            }
            class189 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class189(var4, var4.length);
            }
            if (this.field1849 != null) {
                for (int var7 = 0; var7 < this.field1849.length; var7++) {
                    var6.method3443(this.field1849[var7], this.field1861[var7]);
                }
            }
            if (this.field1851 != null) {
                for (int var8 = 0; var8 < this.field1851.length; var8++) {
                    var6.method3456(this.field1851[var8], this.field1856[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("fi.w(I)Lfi;")
    public final class171 method3014() {
        int var1 = -1;
        if (this.field1864 != -1) {
            var1 = class276.method4820(this.field1864);
        } else if (this.field1865 != -1) {
            var1 = class276.field3185[this.field1865];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1838.length - 1) {
            var2 = this.field1838[var1];
        } else {
            var2 = this.field1838[this.field1838.length - 1];
        }
        return var2 == -1 ? null : method4029(var2);
    }

    @ObfuscatedName("fi.n(I)Z")
    public boolean method3006() {
        if (this.field1838 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1864 != -1) {
            var1 = class276.method4820(this.field1864);
        } else if (this.field1865 != -1) {
            var1 = class276.field3185[this.field1865];
        }
        if (var1 >= 0 && var1 < this.field1838.length) {
            return this.field1838[var1] != -1;
        } else {
            return this.field1838[this.field1838.length - 1] != -1;
        }
    }

    @ObfuscatedName("fi.r(III)I")
    public int method2999(int arg0, int arg1) {
        return class168.method150(this.field1837, arg0, arg1);
    }

    @ObfuscatedName("fi.o(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3000(int arg0, String arg1) {
        return class168.method3632(this.field1837, arg0, arg1);
    }
}

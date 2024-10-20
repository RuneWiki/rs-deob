package deob;

@ObfuscatedName("fj")
public class class171 extends class387 {

    @ObfuscatedName("fj.s")
    public static class249 field1850 = new class249(64);

    @ObfuscatedName("fj.e")
    public static class249 field1851 = new class249(50);

    @ObfuscatedName("fj.r")
    public int field1852;

    @ObfuscatedName("fj.o")
    public String field1862 = class300.field3605;

    @ObfuscatedName("fj.i")
    public int field1854 = 1;

    @ObfuscatedName("fj.w")
    public int[] field1855;

    @ObfuscatedName("fj.v")
    public int[] field1874;

    @ObfuscatedName("fj.a")
    public int field1857 = -1;

    @ObfuscatedName("fj.y")
    public int field1858 = -1;

    @ObfuscatedName("fj.u")
    public int field1882 = -1;

    @ObfuscatedName("fj.h")
    public int field1860 = -1;

    @ObfuscatedName("fj.q")
    public int field1861 = -1;

    @ObfuscatedName("fj.x")
    public int field1848 = -1;

    @ObfuscatedName("fj.p")
    public int field1864 = -1;

    @ObfuscatedName("fj.n")
    public short[] field1881;

    @ObfuscatedName("fj.m")
    public short[] field1865;

    @ObfuscatedName("fj.d")
    public short[] field1866;

    @ObfuscatedName("fj.j")
    public short[] field1867;

    @ObfuscatedName("fj.f")
    public String[] field1868 = new String[5];

    @ObfuscatedName("fj.g")
    public boolean field1869 = true;

    @ObfuscatedName("fj.t")
    public int field1870 = -1;

    @ObfuscatedName("fj.k")
    public int field1871 = 128;

    @ObfuscatedName("fj.b")
    public int field1872 = 128;

    @ObfuscatedName("fj.z")
    public boolean field1873 = false;

    @ObfuscatedName("fj.ap")
    public int field1859 = 0;

    @ObfuscatedName("fj.af")
    public int field1875 = 0;

    @ObfuscatedName("fj.ak")
    public int field1876 = -1;

    @ObfuscatedName("fj.av")
    public int field1877 = 32;

    @ObfuscatedName("fj.ar")
    public int[] field1856;

    @ObfuscatedName("fj.al")
    public int field1879 = -1;

    @ObfuscatedName("fj.aa")
    public int field1880 = -1;

    @ObfuscatedName("fj.ao")
    public boolean field1878 = true;

    @ObfuscatedName("fj.aq")
    public boolean field1863 = true;

    @ObfuscatedName("fj.ay")
    public boolean field1883 = false;

    @ObfuscatedName("fj.ac")
    public class401 field1884;

    @ObfuscatedName("hc.c(Lkq;Lkq;B)V")
    public static void method3948(class307 arg0, class307 arg1) {
        Statics.field1853 = arg0;
        Statics.field1849 = arg1;
    }

    @ObfuscatedName("db.l(II)Lfj;")
    public static class171 method2378(int arg0) {
        class171 var1 = (class171) field1850.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1853.method5066(9, arg0);
        class171 var3 = new class171();
        var3.field1852 = arg0;
        if (var2 != null) {
            var3.method2969(new class421(var2));
        }
        var3.method2999();
        field1850.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fj.s(I)V")
    public void method2999() {
    }

    @ObfuscatedName("fj.e(Lpi;I)V")
    public void method2969(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method2970(arg0, var2);
        }
    }

    @ObfuscatedName("fj.r(Lpi;II)V")
    public void method2970(class421 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6686();
            this.field1855 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1855[var4] = arg0.method6666();
            }
        } else if (arg1 == 2) {
            this.field1862 = arg0.method6674();
        } else if (arg1 == 12) {
            this.field1854 = arg0.method6686();
        } else if (arg1 == 13) {
            this.field1857 = arg0.method6666();
        } else if (arg1 == 14) {
            this.field1860 = arg0.method6666();
        } else if (arg1 == 15) {
            this.field1858 = arg0.method6666();
        } else if (arg1 == 16) {
            this.field1882 = arg0.method6666();
        } else if (arg1 == 17) {
            this.field1860 = arg0.method6666();
            this.field1861 = arg0.method6666();
            this.field1848 = arg0.method6666();
            this.field1864 = arg0.method6666();
        } else if (arg1 == 18) {
            arg0.method6666();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1868[arg1 - 30] = arg0.method6674();
            if (this.field1868[arg1 - 30].equalsIgnoreCase(class300.field3527)) {
                this.field1868[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method6686();
            this.field1881 = new short[var5];
            this.field1865 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1881[var6] = (short) arg0.method6666();
                this.field1865[var6] = (short) arg0.method6666();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method6686();
            this.field1866 = new short[var7];
            this.field1867 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1866[var8] = (short) arg0.method6666();
                this.field1867[var8] = (short) arg0.method6666();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method6686();
            this.field1874 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1874[var10] = arg0.method6666();
            }
        } else if (arg1 == 93) {
            this.field1869 = false;
        } else if (arg1 == 95) {
            this.field1870 = arg0.method6666();
        } else if (arg1 == 97) {
            this.field1871 = arg0.method6666();
        } else if (arg1 == 98) {
            this.field1872 = arg0.method6666();
        } else if (arg1 == 99) {
            this.field1873 = true;
        } else if (arg1 == 100) {
            this.field1859 = arg0.method6664();
        } else if (arg1 == 101) {
            this.field1875 = arg0.method6664() * 5;
        } else if (arg1 == 102) {
            this.field1876 = arg0.method6666();
        } else if (arg1 == 103) {
            this.field1877 = arg0.method6666();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field1879 = arg0.method6666();
            if (this.field1879 == 65535) {
                this.field1879 = -1;
            }
            this.field1880 = arg0.method6666();
            if (this.field1880 == 65535) {
                this.field1880 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method6666();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method6686();
            this.field1856 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field1856[var13] = arg0.method6666();
                if (this.field1856[var13] == 65535) {
                    this.field1856[var13] = -1;
                }
            }
            this.field1856[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field1878 = false;
        } else if (arg1 == 109) {
            this.field1863 = false;
        } else if (arg1 == 111) {
            this.field1883 = true;
        } else if (arg1 == 249) {
            this.field1884 = class168.method4950(arg0, this.field1884);
        }
    }

    @ObfuscatedName("fj.o(Lgm;ILgm;IB)Lgf;")
    public final class204 method2971(class183 arg0, int arg1, class183 arg2, int arg3) {
        if (this.field1856 != null) {
            class171 var5 = this.method2973();
            return var5 == null ? null : var5.method2971(arg0, arg1, arg2, arg3);
        }
        class204 var6 = (class204) field1851.method4472((long) this.field1852);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field1855.length; var8++) {
                if (!Statics.field1849.method5057(this.field1855[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class189[] var9 = new class189[this.field1855.length];
            for (int var10 = 0; var10 < this.field1855.length; var10++) {
                var9[var10] = class189.method3374(Statics.field1849, this.field1855[var10], 0);
            }
            class189 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class189(var9, var9.length);
            }
            if (this.field1881 != null) {
                for (int var12 = 0; var12 < this.field1881.length; var12++) {
                    var11.method3380(this.field1881[var12], this.field1865[var12]);
                }
            }
            if (this.field1866 != null) {
                for (int var13 = 0; var13 < this.field1866.length; var13++) {
                    var11.method3404(this.field1866[var13], this.field1867[var13]);
                }
            }
            var6 = var11.method3396(this.field1859 + 64, this.field1875 + 850, -30, -50, -30);
            field1851.method4482(var6, (long) this.field1852);
        }
        class204 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method3281(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method3306(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method3844(true);
        } else {
            var14 = arg2.method3306(var6, arg3);
        }
        if (this.field1871 != 128 || this.field1872 != 128) {
            var14.method3824(this.field1871, this.field1872, this.field1871);
        }
        return var14;
    }

    @ObfuscatedName("fj.i(I)Lgq;")
    public final class189 method2972() {
        if (this.field1856 != null) {
            class171 var1 = this.method2973();
            return var1 == null ? null : var1.method2972();
        } else if (this.field1874 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field1874.length; var3++) {
                if (!Statics.field1849.method5057(this.field1874[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class189[] var4 = new class189[this.field1874.length];
            for (int var5 = 0; var5 < this.field1874.length; var5++) {
                var4[var5] = class189.method3374(Statics.field1849, this.field1874[var5], 0);
            }
            class189 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class189(var4, var4.length);
            }
            if (this.field1881 != null) {
                for (int var7 = 0; var7 < this.field1881.length; var7++) {
                    var6.method3380(this.field1881[var7], this.field1865[var7]);
                }
            }
            if (this.field1866 != null) {
                for (int var8 = 0; var8 < this.field1866.length; var8++) {
                    var6.method3404(this.field1866[var8], this.field1867[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("fj.w(B)Lfj;")
    public final class171 method2973() {
        int var1 = -1;
        if (this.field1879 != -1) {
            var1 = class281.method6117(this.field1879);
        } else if (this.field1880 != -1) {
            var1 = class281.field3224[this.field1880];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field1856.length - 1) {
            var2 = this.field1856[var1];
        } else {
            var2 = this.field1856[this.field1856.length - 1];
        }
        return var2 == -1 ? null : method2378(var2);
    }

    @ObfuscatedName("fj.v(B)Z")
    public boolean method2974() {
        if (this.field1856 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field1879 != -1) {
            var1 = class281.method6117(this.field1879);
        } else if (this.field1880 != -1) {
            var1 = class281.field3224[this.field1880];
        }
        if (var1 >= 0 && var1 < this.field1856.length) {
            return this.field1856[var1] != -1;
        } else {
            return this.field1856[this.field1856.length - 1] != -1;
        }
    }

    @ObfuscatedName("fj.a(III)I")
    public int method2975(int arg0, int arg1) {
        return class168.method6932(this.field1884, arg0, arg1);
    }

    @ObfuscatedName("fj.y(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2982(int arg0, String arg1) {
        return class168.method4942(this.field1884, arg0, arg1);
    }

    @ObfuscatedName("dm.u(I)V")
    public static void method2479() {
        field1850.method4475();
        field1851.method4475();
    }
}

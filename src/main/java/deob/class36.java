package deob;

@ObfuscatedName("ao")
public class class36 extends class183 {

    @ObfuscatedName("ao.g")
    public static boolean field858 = false;

    @ObfuscatedName("ao.m")
    public static class172 field831 = new class172(64);

    @ObfuscatedName("ao.u")
    public static class172 field832 = new class172(500);

    @ObfuscatedName("ao.j")
    public static class172 field833 = new class172(30);

    @ObfuscatedName("ao.b")
    public static class172 field834 = new class172(30);

    @ObfuscatedName("ao.v")
    public static class93[] field835 = new class93[4];

    @ObfuscatedName("ao.y")
    public int field836;

    @ObfuscatedName("ao.w")
    public int[] field837;

    @ObfuscatedName("ao.x")
    public int[] field838;

    @ObfuscatedName("ao.k")
    public String field839 = "null";

    @ObfuscatedName("ao.o")
    public short[] field840;

    @ObfuscatedName("ao.a")
    public short[] field841;

    @ObfuscatedName("ao.f")
    public short[] field857;

    @ObfuscatedName("ao.r")
    public short[] field843;

    @ObfuscatedName("ao.e")
    public int field844 = 1;

    @ObfuscatedName("ao.t")
    public int field845 = 1;

    @ObfuscatedName("ao.c")
    public int field850 = 2;

    @ObfuscatedName("ao.l")
    public boolean field847 = true;

    @ObfuscatedName("ao.n")
    public int field867 = -1;

    @ObfuscatedName("ao.d")
    public int field849 = -1;

    @ObfuscatedName("ao.p")
    public boolean field842 = false;

    @ObfuscatedName("ao.z")
    public boolean field829 = false;

    @ObfuscatedName("ao.q")
    public int field852 = -1;

    @ObfuscatedName("ao.i")
    public int field853 = 16;

    @ObfuscatedName("ao.ah")
    public int field854 = 0;

    @ObfuscatedName("ao.aj")
    public int field855 = 0;

    @ObfuscatedName("ao.aq")
    public String[] field856 = new String[5];

    @ObfuscatedName("ao.aa")
    public int field872 = -1;

    @ObfuscatedName("ao.ar")
    public int field866 = -1;

    @ObfuscatedName("ao.at")
    public boolean field859 = false;

    @ObfuscatedName("ao.av")
    public boolean field869 = true;

    @ObfuscatedName("ao.af")
    public int field861 = 128;

    @ObfuscatedName("ao.ap")
    public int field862 = 128;

    @ObfuscatedName("ao.ao")
    public int field863 = 128;

    @ObfuscatedName("ao.az")
    public int field868 = 0;

    @ObfuscatedName("ao.ac")
    public int field865 = 0;

    @ObfuscatedName("ao.ad")
    public int field848 = 0;

    @ObfuscatedName("ao.al")
    public boolean field828 = false;

    @ObfuscatedName("ao.ay")
    public boolean field870 = false;

    @ObfuscatedName("ao.ag")
    public int field851 = -1;

    @ObfuscatedName("ao.ak")
    public int[] field846;

    @ObfuscatedName("ao.an")
    public int field871 = -1;

    @ObfuscatedName("ao.ab")
    public int field864 = -1;

    @ObfuscatedName("ao.am")
    public int field873 = -1;

    @ObfuscatedName("ao.aw")
    public int field874 = 0;

    @ObfuscatedName("ao.as")
    public int field875 = 0;

    @ObfuscatedName("ao.au")
    public int field876 = 0;

    @ObfuscatedName("ao.ax")
    public int[] field877;

    @ObfuscatedName("bt.g(Leh;Leh;ZI)V")
    public static void method1422(class147 arg0, class147 arg1, boolean arg2) {
        Statics.field860 = arg0;
        Statics.field830 = arg1;
        field858 = arg2;
    }

    @ObfuscatedName("eg.s(IB)Lao;")
    public static class36 method2773(int arg0) {
        class36 var1 = (class36) field831.method3130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field860.method2667(6, arg0);
        class36 var3 = new class36();
        var3.field836 = arg0;
        if (var2 != null) {
            var3.method682(new class107(var2));
        }
        var3.method651();
        if (var3.field870) {
            var3.field850 = 0;
            var3.field847 = false;
        }
        field831.method3126(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.h(I)V")
    public void method651() {
        if (this.field867 == -1) {
            this.field867 = 0;
            if (this.field837 != null && (this.field838 == null || this.field838[0] == 10)) {
                this.field867 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field856[var1] != null) {
                    this.field867 = 1;
                }
            }
        }
        if (this.field851 == -1) {
            this.field851 = this.field850 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ao.m(Ldi;I)V")
    public void method682(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method653(arg0, var2);
        }
    }

    @ObfuscatedName("ao.u(Ldi;II)V")
    public void method653(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2101();
            if (var3 > 0) {
                if (this.field837 == null || field858) {
                    this.field838 = new int[var3];
                    this.field837 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field837[var4] = arg0.method2166();
                        this.field838[var4] = arg0.method2101();
                    }
                } else {
                    arg0.field1835 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field839 = arg0.method2137();
        } else if (arg1 == 5) {
            int var5 = arg0.method2101();
            if (var5 > 0) {
                if (this.field837 == null || field858) {
                    this.field838 = null;
                    this.field837 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field837[var6] = arg0.method2166();
                    }
                } else {
                    arg0.field1835 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field844 = arg0.method2101();
        } else if (arg1 == 15) {
            this.field845 = arg0.method2101();
        } else if (arg1 == 17) {
            this.field850 = 0;
            this.field847 = false;
        } else if (arg1 == 18) {
            this.field847 = false;
        } else if (arg1 == 19) {
            this.field867 = arg0.method2101();
        } else if (arg1 == 21) {
            this.field849 = 0;
        } else if (arg1 == 22) {
            this.field842 = true;
        } else if (arg1 == 23) {
            this.field829 = true;
        } else if (arg1 == 24) {
            this.field852 = arg0.method2166();
            if (this.field852 == 65535) {
                this.field852 = -1;
            }
        } else if (arg1 == 27) {
            this.field850 = 1;
        } else if (arg1 == 28) {
            this.field853 = arg0.method2101();
        } else if (arg1 == 29) {
            this.field854 = arg0.method2263();
        } else if (arg1 == 39) {
            this.field855 = arg0.method2263();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field856[arg1 - 30] = arg0.method2137();
            if (this.field856[arg1 - 30].equalsIgnoreCase(class143.field2143)) {
                this.field856[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2101();
            this.field840 = new short[var7];
            this.field841 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field840[var8] = (short) arg0.method2166();
                this.field841[var8] = (short) arg0.method2166();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2101();
            this.field857 = new short[var9];
            this.field843 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field857[var10] = (short) arg0.method2166();
                this.field843[var10] = (short) arg0.method2166();
            }
        } else if (arg1 == 60) {
            this.field872 = arg0.method2166();
        } else if (arg1 == 62) {
            this.field859 = true;
        } else if (arg1 == 64) {
            this.field869 = false;
        } else if (arg1 == 65) {
            this.field861 = arg0.method2166();
        } else if (arg1 == 66) {
            this.field862 = arg0.method2166();
        } else if (arg1 == 67) {
            this.field863 = arg0.method2166();
        } else if (arg1 == 68) {
            this.field866 = arg0.method2166();
        } else if (arg1 == 69) {
            arg0.method2101();
        } else if (arg1 == 70) {
            this.field868 = arg0.method2104();
        } else if (arg1 == 71) {
            this.field865 = arg0.method2104();
        } else if (arg1 == 72) {
            this.field848 = arg0.method2104();
        } else if (arg1 == 73) {
            this.field828 = true;
        } else if (arg1 == 74) {
            this.field870 = true;
        } else if (arg1 == 75) {
            this.field851 = arg0.method2101();
        } else if (arg1 == 77) {
            this.field871 = arg0.method2166();
            if (this.field871 == 65535) {
                this.field871 = -1;
            }
            this.field864 = arg0.method2166();
            if (this.field864 == 65535) {
                this.field864 = -1;
            }
            int var11 = arg0.method2101();
            this.field846 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field846[var12] = arg0.method2166();
                if (this.field846[var12] == 65535) {
                    this.field846[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field873 = arg0.method2166();
            this.field874 = arg0.method2101();
        } else if (arg1 == 79) {
            this.field875 = arg0.method2166();
            this.field876 = arg0.method2166();
            this.field874 = arg0.method2101();
            int var13 = arg0.method2101();
            this.field877 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field877[var14] = arg0.method2166();
            }
        } else if (arg1 == 81) {
            this.field849 = arg0.method2101() * 256;
        }
    }

    @ObfuscatedName("ao.j(II)Z")
    public final boolean method654(int arg0) {
        if (this.field838 != null) {
            for (int var4 = 0; var4 < this.field838.length; var4++) {
                if (this.field838[var4] == arg0) {
                    return Statics.field830.method2716(this.field837[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field837 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field837.length; var3++) {
                var2 &= Statics.field830.method2716(this.field837[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ao.b(I)Z")
    public final boolean method655() {
        if (this.field837 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field837.length; var2++) {
            var1 &= Statics.field830.method2716(this.field837[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ao.v(II[[IIIII)Lbh;")
    public final class78 method656(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field838 == null) {
            var7 = (long) ((this.field836 << 10) + arg1);
        } else {
            var7 = (long) ((this.field836 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field833.method3130(var7);
        if (var9 == null) {
            class93 var10 = this.method659(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field842) {
                var10.field1617 = (short) (this.field854 + 64);
                var10.field1618 = (short) (this.field855 * 25 + 768);
                var10.method1881();
                var9 = var10;
            } else {
                var9 = var10.method1885(this.field854 + 64, this.field855 * 25 + 768, -50, -10, -50);
            }
            field833.method3126(var9, var7);
        }
        if (this.field842) {
            var9 = ((class93) var9).method1870();
        }
        if (this.field849 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method1954(arg2, arg3, arg4, arg5, true, this.field849);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1871(arg2, arg3, arg4, arg5, true, this.field849);
            }
        }
        return var9;
    }

    @ObfuscatedName("ao.y(II[[IIIII)Lcl;")
    public final class98 method652(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field838 == null) {
            var7 = (long) ((this.field836 << 10) + arg1);
        } else {
            var7 = (long) ((this.field836 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field834.method3130(var7);
        if (var9 == null) {
            class93 var10 = this.method659(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1885(this.field854 + 64, this.field855 * 25 + 768, -50, -10, -50);
            field834.method3126(var9, var7);
        }
        if (this.field849 >= 0) {
            var9 = var9.method1954(arg2, arg3, arg4, arg5, true, this.field849);
        }
        return var9;
    }

    @ObfuscatedName("ao.w(II[[IIIILac;IB)Lcl;")
    public final class98 method658(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field838 == null) {
            var9 = (long) ((this.field836 << 10) + arg1);
        } else {
            var9 = (long) ((this.field836 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field834.method3130(var9);
        if (var11 == null) {
            class93 var12 = this.method659(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1885(this.field854 + 64, this.field855 * 25 + 768, -50, -10, -50);
            field834.method3126(var11, var9);
        }
        if (arg6 == null && this.field849 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1955(true);
        } else {
            var13 = arg6.method709(var11, arg7, arg1);
        }
        if (this.field849 >= 0) {
            var13 = var13.method1954(arg2, arg3, arg4, arg5, false, this.field849);
        }
        return var13;
    }

    @ObfuscatedName("ao.x(III)Lcv;")
    public final class93 method659(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field838 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field837 == null) {
                return null;
            }
            boolean var4 = this.field859;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field837.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field837[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field832.method3130((long) var7);
                if (var3 == null) {
                    var3 = class93.method1865(Statics.field830, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1864();
                    }
                    field832.method3126(var3, (long) var7);
                }
                if (var5 > 1) {
                    field835[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field835, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field838.length; var9++) {
                if (this.field838[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field837[var8];
            boolean var11 = this.field859 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field832.method3130((long) var10);
            if (var3 == null) {
                var3 = class93.method1865(Statics.field830, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1864();
                }
                field832.method3126(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field861 == 128 && this.field862 == 128 && this.field863 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field868 == 0 && this.field865 == 0 && this.field848 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field840 == null, this.field857 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1867(256);
            var14.method1876(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1900();
        } else if (var15 == 2) {
            var14.method1932();
        } else if (var15 == 3) {
            var14.method1874();
        }
        if (this.field840 != null) {
            for (int var16 = 0; var16 < this.field840.length; var16++) {
                var14.method1877(this.field840[var16], this.field841[var16]);
            }
        }
        if (this.field857 != null) {
            for (int var17 = 0; var17 < this.field857.length; var17++) {
                var14.method1878(this.field857[var17], this.field843[var17]);
            }
        }
        if (var12) {
            var14.method1880(this.field861, this.field862, this.field863);
        }
        if (var13) {
            var14.method1876(this.field868, this.field865, this.field848);
        }
        return var14;
    }

    @ObfuscatedName("ao.k(B)Lao;")
    public final class36 method660() {
        int var1 = -1;
        if (this.field871 != -1) {
            var1 = class155.method1855(this.field871);
        } else if (this.field864 != -1) {
            var1 = class155.field2664[this.field864];
        }
        return var1 < 0 || var1 >= this.field846.length || this.field846[var1] == -1 ? null : method2773(this.field846[var1]);
    }

    @ObfuscatedName("ao.o(B)Z")
    public boolean method650() {
        if (this.field846 == null) {
            return this.field873 != -1 || this.field877 != null;
        }
        for (int var1 = 0; var1 < this.field846.length; var1++) {
            if (this.field846[var1] != -1) {
                class36 var2 = method2773(this.field846[var1]);
                if (var2.field873 != -1 || var2.field877 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

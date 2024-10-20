package deob;

@ObfuscatedName("aj")
public class class32 extends class174 {

    @ObfuscatedName("aj.c")
    public static boolean field856 = false;

    @ObfuscatedName("aj.v")
    public static class170 field876 = new class170(64);

    @ObfuscatedName("aj.g")
    public static class170 field830 = new class170(500);

    @ObfuscatedName("aj.x")
    public static class170 field843 = new class170(30);

    @ObfuscatedName("aj.u")
    public static class170 field832 = new class170(30);

    @ObfuscatedName("aj.l")
    public static class101[] field833 = new class101[4];

    @ObfuscatedName("aj.a")
    public int field834;

    @ObfuscatedName("aj.h")
    public int[] field855;

    @ObfuscatedName("aj.t")
    public int[] field836;

    @ObfuscatedName("aj.m")
    public String field837 = "null";

    @ObfuscatedName("aj.s")
    public short[] field851;

    @ObfuscatedName("aj.j")
    public short[] field839;

    @ObfuscatedName("aj.b")
    public short[] field873;

    @ObfuscatedName("aj.n")
    public short[] field849;

    @ObfuscatedName("aj.z")
    public int field842 = 1;

    @ObfuscatedName("aj.d")
    public int field835 = 1;

    @ObfuscatedName("aj.f")
    public int field844 = 2;

    @ObfuscatedName("aj.o")
    public boolean field845 = true;

    @ObfuscatedName("aj.r")
    public int field841 = -1;

    @ObfuscatedName("aj.k")
    public int field847 = -1;

    @ObfuscatedName("aj.w")
    public boolean field848 = false;

    @ObfuscatedName("aj.e")
    public boolean field863 = false;

    @ObfuscatedName("aj.p")
    public int field850 = -1;

    @ObfuscatedName("aj.i")
    public int field859 = 16;

    @ObfuscatedName("aj.ap")
    public int field852 = 0;

    @ObfuscatedName("aj.as")
    public int field853 = 0;

    @ObfuscatedName("aj.ak")
    public String[] field854 = new String[5];

    @ObfuscatedName("aj.af")
    public int field838 = -1;

    @ObfuscatedName("aj.ag")
    public int field861 = -1;

    @ObfuscatedName("aj.aj")
    public boolean field840 = false;

    @ObfuscatedName("aj.ac")
    public boolean field858 = true;

    @ObfuscatedName("aj.an")
    public int field831 = 128;

    @ObfuscatedName("aj.ad")
    public int field860 = 128;

    @ObfuscatedName("aj.ai")
    public int field846 = 128;

    @ObfuscatedName("aj.ae")
    public int field862 = 0;

    @ObfuscatedName("aj.au")
    public int field875 = 0;

    @ObfuscatedName("aj.at")
    public int field864 = 0;

    @ObfuscatedName("aj.ax")
    public boolean field865 = false;

    @ObfuscatedName("aj.aq")
    public boolean field866 = false;

    @ObfuscatedName("aj.aw")
    public int field867 = -1;

    @ObfuscatedName("aj.ao")
    public int[] field868;

    @ObfuscatedName("aj.aa")
    public int field877 = -1;

    @ObfuscatedName("aj.ah")
    public int field870 = -1;

    @ObfuscatedName("aj.av")
    public int field871 = -1;

    @ObfuscatedName("aj.am")
    public int field872 = 0;

    @ObfuscatedName("aj.ab")
    public int field826 = 0;

    @ObfuscatedName("aj.az")
    public int field857 = 0;

    @ObfuscatedName("aj.al")
    public int[] field869;

    @ObfuscatedName("ad.c(Ley;Ley;ZI)V")
    public static void method726(class153 arg0, class153 arg1, boolean arg2) {
        Statics.field829 = arg0;
        Statics.field828 = arg1;
        field856 = arg2;
    }

    @ObfuscatedName("bz.q(II)Laj;")
    public static class32 method1446(int arg0) {
        class32 var1 = (class32) field876.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field829.method2886(6, arg0);
        class32 var3 = new class32();
        var3.field834 = arg0;
        if (var2 != null) {
            var3.method650(new class127(var2));
        }
        var3.method608();
        if (var3.field866) {
            var3.field844 = 0;
            var3.field845 = false;
        }
        field876.method3092(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.y(I)V")
    public void method608() {
        if (this.field841 == -1) {
            this.field841 = 0;
            if (this.field855 != null && (this.field836 == null || this.field836[0] == 10)) {
                this.field841 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field854[var1] != null) {
                    this.field841 = 1;
                }
            }
        }
        if (this.field867 == -1) {
            this.field867 = this.field844 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("aj.v(Ldg;I)V")
    public void method650(class127 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method632(arg0, var2);
        }
    }

    @ObfuscatedName("aj.g(Ldg;II)V")
    public void method632(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2383();
            if (var3 > 0) {
                if (this.field855 == null || field856) {
                    this.field836 = new int[var3];
                    this.field855 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field855[var4] = arg0.method2327();
                        this.field836[var4] = arg0.method2383();
                    }
                } else {
                    arg0.field2052 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field837 = arg0.method2315();
        } else if (arg1 == 5) {
            int var5 = arg0.method2383();
            if (var5 > 0) {
                if (this.field855 == null || field856) {
                    this.field836 = null;
                    this.field855 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field855[var6] = arg0.method2327();
                    }
                } else {
                    arg0.field2052 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field842 = arg0.method2383();
        } else if (arg1 == 15) {
            this.field835 = arg0.method2383();
        } else if (arg1 == 17) {
            this.field844 = 0;
            this.field845 = false;
        } else if (arg1 == 18) {
            this.field845 = false;
        } else if (arg1 == 19) {
            this.field841 = arg0.method2383();
        } else if (arg1 == 21) {
            this.field847 = 0;
        } else if (arg1 == 22) {
            this.field848 = true;
        } else if (arg1 == 23) {
            this.field863 = true;
        } else if (arg1 == 24) {
            this.field850 = arg0.method2327();
            if (this.field850 == 65535) {
                this.field850 = -1;
            }
        } else if (arg1 == 27) {
            this.field844 = 1;
        } else if (arg1 == 28) {
            this.field859 = arg0.method2383();
        } else if (arg1 == 29) {
            this.field852 = arg0.method2319();
        } else if (arg1 == 39) {
            this.field853 = arg0.method2319();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field854[arg1 - 30] = arg0.method2315();
            if (this.field854[arg1 - 30].equalsIgnoreCase(class135.field2118)) {
                this.field854[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2383();
            this.field851 = new short[var7];
            this.field839 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field851[var8] = (short) arg0.method2327();
                this.field839[var8] = (short) arg0.method2327();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2383();
            this.field873 = new short[var9];
            this.field849 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field873[var10] = (short) arg0.method2327();
                this.field849[var10] = (short) arg0.method2327();
            }
        } else if (arg1 == 60) {
            this.field838 = arg0.method2327();
        } else if (arg1 == 62) {
            this.field840 = true;
        } else if (arg1 == 64) {
            this.field858 = false;
        } else if (arg1 == 65) {
            this.field831 = arg0.method2327();
        } else if (arg1 == 66) {
            this.field860 = arg0.method2327();
        } else if (arg1 == 67) {
            this.field846 = arg0.method2327();
        } else if (arg1 == 68) {
            this.field861 = arg0.method2327();
        } else if (arg1 == 69) {
            arg0.method2383();
        } else if (arg1 == 70) {
            this.field862 = arg0.method2321();
        } else if (arg1 == 71) {
            this.field875 = arg0.method2321();
        } else if (arg1 == 72) {
            this.field864 = arg0.method2321();
        } else if (arg1 == 73) {
            this.field865 = true;
        } else if (arg1 == 74) {
            this.field866 = true;
        } else if (arg1 == 75) {
            this.field867 = arg0.method2383();
        } else if (arg1 == 77) {
            this.field877 = arg0.method2327();
            if (this.field877 == 65535) {
                this.field877 = -1;
            }
            this.field870 = arg0.method2327();
            if (this.field870 == 65535) {
                this.field870 = -1;
            }
            int var11 = arg0.method2383();
            this.field868 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field868[var12] = arg0.method2327();
                if (this.field868[var12] == 65535) {
                    this.field868[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field871 = arg0.method2327();
            this.field872 = arg0.method2383();
        } else if (arg1 == 79) {
            this.field826 = arg0.method2327();
            this.field857 = arg0.method2327();
            this.field872 = arg0.method2383();
            int var13 = arg0.method2383();
            this.field869 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field869[var14] = arg0.method2327();
            }
        } else if (arg1 == 81) {
            this.field847 = arg0.method2383() * 256;
        }
    }

    @ObfuscatedName("aj.x(IB)Z")
    public final boolean method612(int arg0) {
        if (this.field836 != null) {
            for (int var4 = 0; var4 < this.field836.length; var4++) {
                if (this.field836[var4] == arg0) {
                    return Statics.field828.method2888(this.field855[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field855 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field855.length; var3++) {
                var2 &= Statics.field828.method2888(this.field855[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("aj.u(I)Z")
    public final boolean method611() {
        if (this.field855 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field855.length; var2++) {
            var1 &= Statics.field828.method2888(this.field855[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("aj.l(II[[IIIIB)Lcn;")
    public final class94 method613(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field836 == null) {
            var7 = (long) ((this.field834 << 10) + arg1);
        } else {
            var7 = (long) ((this.field834 << 10) + (arg0 << 3) + arg1);
        }
        class94 var9 = (class94) field843.method3097(var7);
        if (var9 == null) {
            class101 var10 = this.method643(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field848) {
                var10.field1723 = (short) (this.field852 + 64);
                var10.field1724 = (short) (this.field853 * 25 + 768);
                var10.method1983();
                var9 = var10;
            } else {
                var9 = var10.method1971(this.field852 + 64, this.field853 * 25 + 768, -50, -10, -50);
            }
            field843.method3092(var9, var7);
        }
        if (this.field848) {
            var9 = ((class101) var9).method2008();
        }
        if (this.field847 >= 0) {
            if (var9 instanceof class112) {
                var9 = ((class112) var9).method2134(arg2, arg3, arg4, arg5, true, this.field847);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method1972(arg2, arg3, arg4, arg5, true, this.field847);
            }
        }
        return var9;
    }

    @ObfuscatedName("aj.a(II[[IIIII)Ldl;")
    public final class112 method614(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field836 == null) {
            var7 = (long) ((this.field834 << 10) + arg1);
        } else {
            var7 = (long) ((this.field834 << 10) + (arg0 << 3) + arg1);
        }
        class112 var9 = (class112) field832.method3097(var7);
        if (var9 == null) {
            class101 var10 = this.method643(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1971(this.field852 + 64, this.field853 * 25 + 768, -50, -10, -50);
            field832.method3092(var9, var7);
        }
        if (this.field847 >= 0) {
            var9 = var9.method2134(arg2, arg3, arg4, arg5, true, this.field847);
        }
        return var9;
    }

    @ObfuscatedName("aj.h(II[[IIIILan;II)Ldl;")
    public final class112 method615(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class34 arg6, int arg7) {
        long var9;
        if (this.field836 == null) {
            var9 = (long) ((this.field834 << 10) + arg1);
        } else {
            var9 = (long) ((this.field834 << 10) + (arg0 << 3) + arg1);
        }
        class112 var11 = (class112) field832.method3097(var9);
        if (var11 == null) {
            class101 var12 = this.method643(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1971(this.field852 + 64, this.field853 * 25 + 768, -50, -10, -50);
            field832.method3092(var11, var9);
        }
        if (arg6 == null && this.field847 == -1) {
            return var11;
        }
        class112 var13;
        if (arg6 == null) {
            var13 = var11.method2138(true);
        } else {
            var13 = arg6.method679(var11, arg7, arg1);
        }
        if (this.field847 >= 0) {
            var13 = var13.method2134(arg2, arg3, arg4, arg5, false, this.field847);
        }
        return var13;
    }

    @ObfuscatedName("aj.t(IIB)Lcz;")
    public final class101 method643(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field836 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field855 == null) {
                return null;
            }
            boolean var4 = this.field840;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field855.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field855[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field830.method3097((long) var7);
                if (var3 == null) {
                    var3 = class101.method1979(Statics.field828, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1981();
                    }
                    field830.method3092(var3, (long) var7);
                }
                if (var5 > 1) {
                    field833[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field833, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field836.length; var9++) {
                if (this.field836[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field855[var8];
            boolean var11 = this.field840 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field830.method3097((long) var10);
            if (var3 == null) {
                var3 = class101.method1979(Statics.field828, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1981();
                }
                field830.method3092(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field831 == 128 && this.field860 == 128 && this.field846 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field862 == 0 && this.field875 == 0 && this.field864 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field851 == null, this.field873 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1977(256);
            var14.method1995(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1974();
        } else if (var15 == 2) {
            var14.method1975();
        } else if (var15 == 3) {
            var14.method1996();
        }
        if (this.field851 != null) {
            for (int var16 = 0; var16 < this.field851.length; var16++) {
                var14.method1976(this.field851[var16], this.field839[var16]);
            }
        }
        if (this.field873 != null) {
            for (int var17 = 0; var17 < this.field873.length; var17++) {
                var14.method1980(this.field873[var17], this.field849[var17]);
            }
        }
        if (var12) {
            var14.method1982(this.field831, this.field860, this.field846);
        }
        if (var13) {
            var14.method1995(this.field862, this.field875, this.field864);
        }
        return var14;
    }

    @ObfuscatedName("aj.m(I)Laj;")
    public final class32 method628() {
        int var1 = -1;
        if (this.field877 != -1) {
            var1 = class160.method2195(this.field877);
        } else if (this.field870 != -1) {
            var1 = class160.field2731[this.field870];
        }
        return var1 < 0 || var1 >= this.field868.length || this.field868[var1] == -1 ? null : method1446(this.field868[var1]);
    }

    @ObfuscatedName("bp.s(B)V")
    public static void method1365() {
        field876.method3093();
        field830.method3093();
        field843.method3093();
        field832.method3093();
    }

    @ObfuscatedName("aj.j(I)Z")
    public boolean method617() {
        if (this.field868 == null) {
            return this.field871 != -1 || this.field869 != null;
        }
        for (int var1 = 0; var1 < this.field868.length; var1++) {
            if (this.field868[var1] != -1) {
                class32 var2 = method1446(this.field868[var1]);
                if (var2.field871 != -1 || var2.field869 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

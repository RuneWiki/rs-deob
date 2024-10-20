package deob;

@ObfuscatedName("ac")
public class class36 extends class180 {

    @ObfuscatedName("ac.e")
    public static boolean field868 = false;

    @ObfuscatedName("ac.g")
    public static class170 field827 = new class170(64);

    @ObfuscatedName("ac.u")
    public static class170 field839 = new class170(500);

    @ObfuscatedName("ac.k")
    public static class170 field829 = new class170(30);

    @ObfuscatedName("ac.m")
    public static class170 field830 = new class170(30);

    @ObfuscatedName("ac.t")
    public static class93[] field865 = new class93[4];

    @ObfuscatedName("ac.l")
    public int field832;

    @ObfuscatedName("ac.f")
    public int[] field833;

    @ObfuscatedName("ac.c")
    public int[] field864;

    @ObfuscatedName("ac.i")
    public String field831 = "null";

    @ObfuscatedName("ac.o")
    public short[] field836;

    @ObfuscatedName("ac.d")
    public short[] field838;

    @ObfuscatedName("ac.b")
    public short[] field870;

    @ObfuscatedName("ac.v")
    public short[] field867;

    @ObfuscatedName("ac.n")
    public int field840 = 1;

    @ObfuscatedName("ac.w")
    public int field824 = 1;

    @ObfuscatedName("ac.z")
    public int field844 = 2;

    @ObfuscatedName("ac.x")
    public boolean field828 = true;

    @ObfuscatedName("ac.q")
    public int field852 = -1;

    @ObfuscatedName("ac.s")
    public int field845 = -1;

    @ObfuscatedName("ac.j")
    public boolean field846 = false;

    @ObfuscatedName("ac.y")
    public boolean field847 = false;

    @ObfuscatedName("ac.r")
    public int field848 = -1;

    @ObfuscatedName("ac.h")
    public int field849 = 16;

    @ObfuscatedName("ac.ak")
    public int field850 = 0;

    @ObfuscatedName("ac.ab")
    public int field851 = 0;

    @ObfuscatedName("ac.as")
    public String[] field837 = new String[5];

    @ObfuscatedName("ac.aq")
    public int field853 = -1;

    @ObfuscatedName("ac.ai")
    public int field842 = -1;

    @ObfuscatedName("ac.aw")
    public boolean field855 = false;

    @ObfuscatedName("ac.aj")
    public boolean field856 = true;

    @ObfuscatedName("ac.ax")
    public int field876 = 128;

    @ObfuscatedName("ac.ar")
    public int field858 = 128;

    @ObfuscatedName("ac.ac")
    public int field859 = 128;

    @ObfuscatedName("ac.ap")
    public int field860 = 0;

    @ObfuscatedName("ac.az")
    public int field861 = 0;

    @ObfuscatedName("ac.ae")
    public int field872 = 0;

    @ObfuscatedName("ac.ah")
    public boolean field863 = false;

    @ObfuscatedName("ac.ad")
    public boolean field875 = false;

    @ObfuscatedName("ac.ay")
    public int field873 = -1;

    @ObfuscatedName("ac.at")
    public int[] field866;

    @ObfuscatedName("ac.au")
    public int field841 = -1;

    @ObfuscatedName("ac.an")
    public int field843 = -1;

    @ObfuscatedName("ac.al")
    public int field869 = -1;

    @ObfuscatedName("ac.am")
    public int field854 = 0;

    @ObfuscatedName("ac.av")
    public int field871 = 0;

    @ObfuscatedName("ac.ag")
    public int field835 = 0;

    @ObfuscatedName("ac.af")
    public int[] field862;

    @ObfuscatedName("el.e(Lec;Lec;ZI)V")
    public static void method2845(class145 arg0, class145 arg1, boolean arg2) {
        Statics.field825 = arg0;
        Statics.field826 = arg1;
        field868 = arg2;
    }

    @ObfuscatedName("ch.p(IB)Lac;")
    public static class36 method1794(int arg0) {
        class36 var1 = (class36) field827.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field825.method2717(6, arg0);
        class36 var3 = new class36();
        var3.field832 = arg0;
        if (var2 != null) {
            var3.method688(new class107(var2));
        }
        var3.method675();
        if (var3.field875) {
            var3.field844 = 0;
            var3.field828 = false;
        }
        field827.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.a(B)V")
    public void method675() {
        if (this.field852 == -1) {
            this.field852 = 0;
            if (this.field833 != null && (this.field864 == null || this.field864[0] == 10)) {
                this.field852 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field837[var1] != null) {
                    this.field852 = 1;
                }
            }
        }
        if (this.field873 == -1) {
            this.field873 = this.field844 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ac.g(Ldp;I)V")
    public void method688(class107 arg0) {
        while (true) {
            int var2 = arg0.method2125();
            if (var2 == 0) {
                return;
            }
            this.method651(arg0, var2);
        }
    }

    @ObfuscatedName("ac.u(Ldp;II)V")
    public void method651(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2125();
            if (var3 > 0) {
                if (this.field833 == null || field868) {
                    this.field864 = new int[var3];
                    this.field833 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field833[var4] = arg0.method2182();
                        this.field864[var4] = arg0.method2125();
                    }
                } else {
                    arg0.field1841 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field831 = arg0.method2149();
        } else if (arg1 == 5) {
            int var5 = arg0.method2125();
            if (var5 > 0) {
                if (this.field833 == null || field868) {
                    this.field864 = null;
                    this.field833 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field833[var6] = arg0.method2182();
                    }
                } else {
                    arg0.field1841 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field840 = arg0.method2125();
        } else if (arg1 == 15) {
            this.field824 = arg0.method2125();
        } else if (arg1 == 17) {
            this.field844 = 0;
            this.field828 = false;
        } else if (arg1 == 18) {
            this.field828 = false;
        } else if (arg1 == 19) {
            this.field852 = arg0.method2125();
        } else if (arg1 == 21) {
            this.field845 = 0;
        } else if (arg1 == 22) {
            this.field846 = true;
        } else if (arg1 == 23) {
            this.field847 = true;
        } else if (arg1 == 24) {
            this.field848 = arg0.method2182();
            if (this.field848 == 65535) {
                this.field848 = -1;
            }
        } else if (arg1 == 27) {
            this.field844 = 1;
        } else if (arg1 == 28) {
            this.field849 = arg0.method2125();
        } else if (arg1 == 29) {
            this.field850 = arg0.method2201();
        } else if (arg1 == 39) {
            this.field851 = arg0.method2201() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field837[arg1 - 30] = arg0.method2149();
            if (this.field837[arg1 - 30].equalsIgnoreCase(class142.field2147)) {
                this.field837[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2125();
            this.field836 = new short[var7];
            this.field838 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field836[var8] = (short) arg0.method2182();
                this.field838[var8] = (short) arg0.method2182();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2125();
            this.field870 = new short[var9];
            this.field867 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field870[var10] = (short) arg0.method2182();
                this.field867[var10] = (short) arg0.method2182();
            }
        } else if (arg1 == 60) {
            this.field853 = arg0.method2182();
        } else if (arg1 == 62) {
            this.field855 = true;
        } else if (arg1 == 64) {
            this.field856 = false;
        } else if (arg1 == 65) {
            this.field876 = arg0.method2182();
        } else if (arg1 == 66) {
            this.field858 = arg0.method2182();
        } else if (arg1 == 67) {
            this.field859 = arg0.method2182();
        } else if (arg1 == 68) {
            this.field842 = arg0.method2182();
        } else if (arg1 == 69) {
            arg0.method2125();
        } else if (arg1 == 70) {
            this.field860 = arg0.method2144();
        } else if (arg1 == 71) {
            this.field861 = arg0.method2144();
        } else if (arg1 == 72) {
            this.field872 = arg0.method2144();
        } else if (arg1 == 73) {
            this.field863 = true;
        } else if (arg1 == 74) {
            this.field875 = true;
        } else if (arg1 == 75) {
            this.field873 = arg0.method2125();
        } else if (arg1 == 77) {
            this.field841 = arg0.method2182();
            if (this.field841 == 65535) {
                this.field841 = -1;
            }
            this.field843 = arg0.method2182();
            if (this.field843 == 65535) {
                this.field843 = -1;
            }
            int var11 = arg0.method2125();
            this.field866 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field866[var12] = arg0.method2182();
                if (this.field866[var12] == 65535) {
                    this.field866[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field869 = arg0.method2182();
            this.field854 = arg0.method2125();
        } else if (arg1 == 79) {
            this.field871 = arg0.method2182();
            this.field835 = arg0.method2182();
            this.field854 = arg0.method2125();
            int var13 = arg0.method2125();
            this.field862 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field862[var14] = arg0.method2182();
            }
        } else if (arg1 == 81) {
            this.field845 = arg0.method2125() * 256;
        }
    }

    @ObfuscatedName("ac.k(II)Z")
    public final boolean method692(int arg0) {
        if (this.field864 != null) {
            for (int var4 = 0; var4 < this.field864.length; var4++) {
                if (this.field864[var4] == arg0) {
                    return Statics.field826.method2719(this.field833[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field833 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field833.length; var3++) {
                var2 &= Statics.field826.method2719(this.field833[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ac.m(I)Z")
    public final boolean method653() {
        if (this.field833 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field833.length; var2++) {
            var1 &= Statics.field826.method2719(this.field833[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ac.t(II[[IIIII)Lbp;")
    public final class78 method654(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field864 == null) {
            var7 = (long) ((this.field832 << 10) + arg1);
        } else {
            var7 = (long) ((this.field832 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field829.method3166(var7);
        if (var9 == null) {
            class93 var10 = this.method657(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field846) {
                var10.field1602 = (short) (this.field850 + 64);
                var10.field1578 = (short) (this.field851 + 768);
                var10.method1907();
                var9 = var10;
            } else {
                var9 = var10.method1911(this.field850 + 64, this.field851 + 768, -50, -10, -50);
            }
            field829.method3161(var9, var7);
        }
        if (this.field846) {
            var9 = ((class93) var9).method1895();
        }
        if (this.field845 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method2063(arg2, arg3, arg4, arg5, true, this.field845);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1933(arg2, arg3, arg4, arg5, true, this.field845);
            }
        }
        return var9;
    }

    @ObfuscatedName("ac.l(II[[IIIIB)Lcs;")
    public final class98 method655(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field864 == null) {
            var7 = (long) ((this.field832 << 10) + arg1);
        } else {
            var7 = (long) ((this.field832 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field830.method3166(var7);
        if (var9 == null) {
            class93 var10 = this.method657(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1911(this.field850 + 64, this.field851 + 768, -50, -10, -50);
            field830.method3161(var9, var7);
        }
        if (this.field845 >= 0) {
            var9 = var9.method2063(arg2, arg3, arg4, arg5, true, this.field845);
        }
        return var9;
    }

    @ObfuscatedName("ac.f(II[[IIIILaz;II)Lcs;")
    public final class98 method686(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field864 == null) {
            var9 = (long) ((this.field832 << 10) + arg1);
        } else {
            var9 = (long) ((this.field832 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field830.method3166(var9);
        if (var11 == null) {
            class93 var12 = this.method657(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1911(this.field850 + 64, this.field851 + 768, -50, -10, -50);
            field830.method3161(var11, var9);
        }
        if (arg6 == null && this.field845 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1985(true);
        } else {
            var13 = arg6.method729(var11, arg7, arg1);
        }
        if (this.field845 >= 0) {
            var13 = var13.method2063(arg2, arg3, arg4, arg5, false, this.field845);
        }
        return var13;
    }

    @ObfuscatedName("ac.c(III)Lcw;")
    public final class93 method657(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field864 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field833 == null) {
                return null;
            }
            boolean var4 = this.field855;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field833.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field833[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field839.method3166((long) var7);
                if (var3 == null) {
                    var3 = class93.method1960(Statics.field826, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1905();
                    }
                    field839.method3161(var3, (long) var7);
                }
                if (var5 > 1) {
                    field865[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field865, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field864.length; var9++) {
                if (this.field864[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field833[var8];
            boolean var11 = this.field855 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field839.method3166((long) var10);
            if (var3 == null) {
                var3 = class93.method1960(Statics.field826, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1905();
                }
                field839.method3161(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field876 == 128 && this.field858 == 128 && this.field859 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field860 == 0 && this.field861 == 0 && this.field872 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field836 == null, this.field870 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1901(256);
            var14.method1902(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1922();
        } else if (var15 == 2) {
            var14.method1958();
        } else if (var15 == 3) {
            var14.method1900();
        }
        if (this.field836 != null) {
            for (int var16 = 0; var16 < this.field836.length; var16++) {
                var14.method1892(this.field836[var16], this.field838[var16]);
            }
        }
        if (this.field870 != null) {
            for (int var17 = 0; var17 < this.field870.length; var17++) {
                var14.method1904(this.field870[var17], this.field867[var17]);
            }
        }
        if (var12) {
            var14.method1923(this.field876, this.field858, this.field859);
        }
        if (var13) {
            var14.method1902(this.field860, this.field861, this.field872);
        }
        return var14;
    }

    @ObfuscatedName("ac.i(B)Lac;")
    public final class36 method649() {
        int var1 = -1;
        if (this.field841 != -1) {
            var1 = class153.method3431(this.field841);
        } else if (this.field843 != -1) {
            var1 = class153.field2645[this.field843];
        }
        return var1 < 0 || var1 >= this.field866.length || this.field866[var1] == -1 ? null : method1794(this.field866[var1]);
    }

    @ObfuscatedName("ac.o(B)Z")
    public boolean method659() {
        if (this.field866 == null) {
            return this.field869 != -1 || this.field862 != null;
        }
        for (int var1 = 0; var1 < this.field866.length; var1++) {
            if (this.field866[var1] != -1) {
                class36 var2 = method1794(this.field866[var1]);
                if (var2.field869 != -1 || var2.field862 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

package deob;

@ObfuscatedName("aq")
public class class36 extends class182 {

    @ObfuscatedName("aq.t")
    public static boolean field871 = false;

    @ObfuscatedName("aq.e")
    public static class171 field862 = new class171(64);

    @ObfuscatedName("aq.d")
    public static class171 field827 = new class171(500);

    @ObfuscatedName("aq.n")
    public static class171 field828 = new class171(30);

    @ObfuscatedName("aq.v")
    public static class171 field829 = new class171(30);

    @ObfuscatedName("aq.z")
    public static class93[] field830 = new class93[4];

    @ObfuscatedName("aq.j")
    public int field858;

    @ObfuscatedName("aq.u")
    public int[] field840;

    @ObfuscatedName("aq.g")
    public int[] field869;

    @ObfuscatedName("aq.a")
    public String field834 = "null";

    @ObfuscatedName("aq.c")
    public short[] field842;

    @ObfuscatedName("aq.w")
    public short[] field864;

    @ObfuscatedName("aq.l")
    public short[] field835;

    @ObfuscatedName("aq.q")
    public short[] field838;

    @ObfuscatedName("aq.x")
    public int field839 = 1;

    @ObfuscatedName("aq.p")
    public int field833 = 1;

    @ObfuscatedName("aq.y")
    public int field841 = 2;

    @ObfuscatedName("aq.r")
    public boolean field826 = true;

    @ObfuscatedName("aq.k")
    public int field843 = -1;

    @ObfuscatedName("aq.b")
    public int field844 = -1;

    @ObfuscatedName("aq.h")
    public boolean field845 = false;

    @ObfuscatedName("aq.i")
    public boolean field846 = false;

    @ObfuscatedName("aq.o")
    public int field837 = -1;

    @ObfuscatedName("aq.m")
    public int field854 = 16;

    @ObfuscatedName("aq.ak")
    public int field849 = 0;

    @ObfuscatedName("aq.aw")
    public int field850 = 0;

    @ObfuscatedName("aq.af")
    public String[] field823 = new String[5];

    @ObfuscatedName("aq.ab")
    public int field852 = -1;

    @ObfuscatedName("aq.ao")
    public int field853 = -1;

    @ObfuscatedName("aq.ah")
    public boolean field851 = false;

    @ObfuscatedName("aq.ae")
    public boolean field855 = true;

    @ObfuscatedName("aq.ax")
    public int field856 = 128;

    @ObfuscatedName("aq.ar")
    public int field857 = 128;

    @ObfuscatedName("aq.aq")
    public int field836 = 128;

    @ObfuscatedName("aq.am")
    public int field859 = 0;

    @ObfuscatedName("aq.az")
    public int field860 = 0;

    @ObfuscatedName("aq.an")
    public int field861 = 0;

    @ObfuscatedName("aq.at")
    public boolean field873 = false;

    @ObfuscatedName("aq.av")
    public boolean field863 = false;

    @ObfuscatedName("aq.aa")
    public int field831 = -1;

    @ObfuscatedName("aq.ag")
    public int[] field865;

    @ObfuscatedName("aq.au")
    public int field866 = -1;

    @ObfuscatedName("aq.aj")
    public int field867 = -1;

    @ObfuscatedName("aq.ay")
    public int field868 = -1;

    @ObfuscatedName("aq.ac")
    public int field848 = 0;

    @ObfuscatedName("aq.al")
    public int field870 = 0;

    @ObfuscatedName("aq.as")
    public int field847 = 0;

    @ObfuscatedName("aq.ai")
    public int[] field872;

    @ObfuscatedName("a.t(Leg;Leg;ZI)V")
    public static void method137(class146 arg0, class146 arg1, boolean arg2) {
        Statics.field824 = arg0;
        Statics.field825 = arg1;
        field871 = arg2;
    }

    @ObfuscatedName("n.s(II)Laq;")
    public static class36 method83(int arg0) {
        class36 var1 = (class36) field862.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field824.method2709(6, arg0);
        class36 var3 = new class36();
        var3.field858 = arg0;
        if (var2 != null) {
            var3.method637(new class107(var2));
        }
        var3.method623();
        if (var3.field863) {
            var3.field841 = 0;
            var3.field826 = false;
        }
        field862.method3168(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.f(I)V")
    public void method623() {
        if (this.field843 == -1) {
            this.field843 = 0;
            if (this.field840 != null && (this.field869 == null || this.field869[0] == 10)) {
                this.field843 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field823[var1] != null) {
                    this.field843 = 1;
                }
            }
        }
        if (this.field831 == -1) {
            this.field831 = this.field841 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("aq.e(Ldb;B)V")
    public void method637(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method652(arg0, var2);
        }
    }

    @ObfuscatedName("aq.d(Ldb;II)V")
    public void method652(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2101();
            if (var3 > 0) {
                if (this.field840 == null || field871) {
                    this.field869 = new int[var3];
                    this.field840 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field840[var4] = arg0.method2103();
                        this.field869[var4] = arg0.method2101();
                    }
                } else {
                    arg0.field1830 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field834 = arg0.method2109();
        } else if (arg1 == 5) {
            int var5 = arg0.method2101();
            if (var5 > 0) {
                if (this.field840 == null || field871) {
                    this.field869 = null;
                    this.field840 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field840[var6] = arg0.method2103();
                    }
                } else {
                    arg0.field1830 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field839 = arg0.method2101();
        } else if (arg1 == 15) {
            this.field833 = arg0.method2101();
        } else if (arg1 == 17) {
            this.field841 = 0;
            this.field826 = false;
        } else if (arg1 == 18) {
            this.field826 = false;
        } else if (arg1 == 19) {
            this.field843 = arg0.method2101();
        } else if (arg1 == 21) {
            this.field844 = 0;
        } else if (arg1 == 22) {
            this.field845 = true;
        } else if (arg1 == 23) {
            this.field846 = true;
        } else if (arg1 == 24) {
            this.field837 = arg0.method2103();
            if (this.field837 == 65535) {
                this.field837 = -1;
            }
        } else if (arg1 == 27) {
            this.field841 = 1;
        } else if (arg1 == 28) {
            this.field854 = arg0.method2101();
        } else if (arg1 == 29) {
            this.field849 = arg0.method2102();
        } else if (arg1 == 39) {
            this.field850 = arg0.method2102() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field823[arg1 - 30] = arg0.method2109();
            if (this.field823[arg1 - 30].equalsIgnoreCase(class142.field2229)) {
                this.field823[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2101();
            this.field842 = new short[var7];
            this.field864 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field842[var8] = (short) arg0.method2103();
                this.field864[var8] = (short) arg0.method2103();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2101();
            this.field835 = new short[var9];
            this.field838 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field835[var10] = (short) arg0.method2103();
                this.field838[var10] = (short) arg0.method2103();
            }
        } else if (arg1 == 60) {
            this.field852 = arg0.method2103();
        } else if (arg1 == 62) {
            this.field851 = true;
        } else if (arg1 == 64) {
            this.field855 = false;
        } else if (arg1 == 65) {
            this.field856 = arg0.method2103();
        } else if (arg1 == 66) {
            this.field857 = arg0.method2103();
        } else if (arg1 == 67) {
            this.field836 = arg0.method2103();
        } else if (arg1 == 68) {
            this.field853 = arg0.method2103();
        } else if (arg1 == 69) {
            arg0.method2101();
        } else if (arg1 == 70) {
            this.field859 = arg0.method2104();
        } else if (arg1 == 71) {
            this.field860 = arg0.method2104();
        } else if (arg1 == 72) {
            this.field861 = arg0.method2104();
        } else if (arg1 == 73) {
            this.field873 = true;
        } else if (arg1 == 74) {
            this.field863 = true;
        } else if (arg1 == 75) {
            this.field831 = arg0.method2101();
        } else if (arg1 == 77) {
            this.field866 = arg0.method2103();
            if (this.field866 == 65535) {
                this.field866 = -1;
            }
            this.field867 = arg0.method2103();
            if (this.field867 == 65535) {
                this.field867 = -1;
            }
            int var11 = arg0.method2101();
            this.field865 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field865[var12] = arg0.method2103();
                if (this.field865[var12] == 65535) {
                    this.field865[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field868 = arg0.method2103();
            this.field848 = arg0.method2101();
        } else if (arg1 == 79) {
            this.field870 = arg0.method2103();
            this.field847 = arg0.method2103();
            this.field848 = arg0.method2101();
            int var13 = arg0.method2101();
            this.field872 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field872[var14] = arg0.method2103();
            }
        } else if (arg1 == 81) {
            this.field844 = arg0.method2101() * 256;
        }
    }

    @ObfuscatedName("aq.n(II)Z")
    public final boolean method626(int arg0) {
        if (this.field869 != null) {
            for (int var4 = 0; var4 < this.field869.length; var4++) {
                if (this.field869[var4] == arg0) {
                    return Statics.field825.method2740(this.field840[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field840 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field840.length; var3++) {
                var2 &= Statics.field825.method2740(this.field840[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("aq.v(I)Z")
    public final boolean method622() {
        if (this.field840 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field840.length; var2++) {
            var1 &= Statics.field825.method2740(this.field840[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("aq.z(II[[IIIII)Lbq;")
    public final class78 method628(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field869 == null) {
            var7 = (long) ((this.field858 << 10) + arg1);
        } else {
            var7 = (long) ((this.field858 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field828.method3170(var7);
        if (var9 == null) {
            class93 var10 = this.method643(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field845) {
                var10.field1588 = (short) (this.field849 + 64);
                var10.field1609 = (short) (this.field850 + 768);
                var10.method1868();
                var9 = var10;
            } else {
                var9 = var10.method1871(this.field849 + 64, this.field850 + 768, -50, -10, -50);
            }
            field828.method3168(var9, var7);
        }
        if (this.field845) {
            var9 = ((class93) var9).method1856();
        }
        if (this.field844 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method2022(arg2, arg3, arg4, arg5, true, this.field844);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1853(arg2, arg3, arg4, arg5, true, this.field844);
            }
        }
        return var9;
    }

    @ObfuscatedName("aq.j(II[[IIIIB)Lcc;")
    public final class98 method629(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field869 == null) {
            var7 = (long) ((this.field858 << 10) + arg1);
        } else {
            var7 = (long) ((this.field858 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field829.method3170(var7);
        if (var9 == null) {
            class93 var10 = this.method643(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1871(this.field849 + 64, this.field850 + 768, -50, -10, -50);
            field829.method3168(var9, var7);
        }
        if (this.field844 >= 0) {
            var9 = var9.method2022(arg2, arg3, arg4, arg5, true, this.field844);
        }
        return var9;
    }

    @ObfuscatedName("aq.u(II[[IIIILaz;II)Lcc;")
    public final class98 method630(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field869 == null) {
            var9 = (long) ((this.field858 << 10) + arg1);
        } else {
            var9 = (long) ((this.field858 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field829.method3170(var9);
        if (var11 == null) {
            class93 var12 = this.method643(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1871(this.field849 + 64, this.field850 + 768, -50, -10, -50);
            field829.method3168(var11, var9);
        }
        if (arg6 == null && this.field844 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1975(true);
        } else {
            var13 = arg6.method693(var11, arg7, arg1);
        }
        if (this.field844 >= 0) {
            var13 = var13.method2022(arg2, arg3, arg4, arg5, false, this.field844);
        }
        return var13;
    }

    @ObfuscatedName("aq.g(III)Lca;")
    public final class93 method643(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field869 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field840 == null) {
                return null;
            }
            boolean var4 = this.field851;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field840.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field840[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field827.method3170((long) var7);
                if (var3 == null) {
                    var3 = class93.method1872(Statics.field825, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1866();
                    }
                    field827.method3168(var3, (long) var7);
                }
                if (var5 > 1) {
                    field830[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field830, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field869.length; var9++) {
                if (this.field869[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field840[var8];
            boolean var11 = this.field851 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field827.method3170((long) var10);
            if (var3 == null) {
                var3 = class93.method1872(Statics.field825, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1866();
                }
                field827.method3168(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field856 == 128 && this.field857 == 128 && this.field836 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field859 == 0 && this.field860 == 0 && this.field861 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field842 == null, this.field835 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1889(256);
            var14.method1863(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1859();
        } else if (var15 == 2) {
            var14.method1918();
        } else if (var15 == 3) {
            var14.method1861();
        }
        if (this.field842 != null) {
            for (int var16 = 0; var16 < this.field842.length; var16++) {
                var14.method1864(this.field842[var16], this.field864[var16]);
            }
        }
        if (this.field835 != null) {
            for (int var17 = 0; var17 < this.field835.length; var17++) {
                var14.method1865(this.field835[var17], this.field838[var17]);
            }
        }
        if (var12) {
            var14.method1867(this.field856, this.field857, this.field836);
        }
        if (var13) {
            var14.method1863(this.field859, this.field860, this.field861);
        }
        return var14;
    }

    @ObfuscatedName("aq.a(B)Laq;")
    public final class36 method649() {
        int var1 = -1;
        if (this.field866 != -1) {
            var1 = class154.method2402(this.field866);
        } else if (this.field867 != -1) {
            var1 = class154.field2650[this.field867];
        }
        return var1 < 0 || var1 >= this.field865.length || this.field865[var1] == -1 ? null : method83(this.field865[var1]);
    }

    @ObfuscatedName("z.c(I)V")
    public static void method95() {
        field862.method3171();
        field827.method3171();
        field828.method3171();
        field829.method3171();
    }

    @ObfuscatedName("aq.w(B)Z")
    public boolean method633() {
        if (this.field865 == null) {
            return this.field868 != -1 || this.field872 != null;
        }
        for (int var1 = 0; var1 < this.field865.length; var1++) {
            if (this.field865[var1] != -1) {
                class36 var2 = method83(this.field865[var1]);
                if (var2.field868 != -1 || var2.field872 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

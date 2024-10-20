package deob;

@ObfuscatedName("an")
public class class36 extends class182 {

    @ObfuscatedName("an.g")
    public static boolean field851 = false;

    @ObfuscatedName("an.h")
    public static class171 field833 = new class171(64);

    @ObfuscatedName("an.k")
    public static class171 field841 = new class171(500);

    @ObfuscatedName("an.l")
    public static class171 field844 = new class171(30);

    @ObfuscatedName("an.e")
    public static class171 field836 = new class171(30);

    @ObfuscatedName("an.j")
    public static class93[] field837 = new class93[4];

    @ObfuscatedName("an.n")
    public int field866;

    @ObfuscatedName("an.f")
    public int[] field839;

    @ObfuscatedName("an.a")
    public int[] field840;

    @ObfuscatedName("an.i")
    public String field838 = "null";

    @ObfuscatedName("an.y")
    public short[] field842;

    @ObfuscatedName("an.p")
    public short[] field861;

    @ObfuscatedName("an.q")
    public short[] field830;

    @ObfuscatedName("an.t")
    public short[] field845;

    @ObfuscatedName("an.r")
    public int field846 = 1;

    @ObfuscatedName("an.x")
    public int field847 = 1;

    @ObfuscatedName("an.s")
    public int field859 = 2;

    @ObfuscatedName("an.d")
    public boolean field879 = true;

    @ObfuscatedName("an.m")
    public int field853 = -1;

    @ObfuscatedName("an.o")
    public int field870 = -1;

    @ObfuscatedName("an.b")
    public boolean field852 = false;

    @ObfuscatedName("an.c")
    public boolean field876 = false;

    @ObfuscatedName("an.w")
    public int field854 = -1;

    @ObfuscatedName("an.u")
    public int field834 = 16;

    @ObfuscatedName("an.ac")
    public int field856 = 0;

    @ObfuscatedName("an.ap")
    public int field857 = 0;

    @ObfuscatedName("an.ai")
    public String[] field858 = new String[5];

    @ObfuscatedName("an.as")
    public int field843 = -1;

    @ObfuscatedName("an.aa")
    public int field860 = -1;

    @ObfuscatedName("an.aq")
    public boolean field873 = false;

    @ObfuscatedName("an.aw")
    public boolean field862 = true;

    @ObfuscatedName("an.am")
    public int field863 = 128;

    @ObfuscatedName("an.av")
    public int field864 = 128;

    @ObfuscatedName("an.an")
    public int field865 = 128;

    @ObfuscatedName("an.at")
    public int field850 = 0;

    @ObfuscatedName("an.ao")
    public int field867 = 0;

    @ObfuscatedName("an.ag")
    public int field868 = 0;

    @ObfuscatedName("an.ax")
    public boolean field869 = false;

    @ObfuscatedName("an.ay")
    public boolean field835 = false;

    @ObfuscatedName("an.ab")
    public int field871 = -1;

    @ObfuscatedName("an.al")
    public int[] field872;

    @ObfuscatedName("an.ae")
    public int field855 = -1;

    @ObfuscatedName("an.af")
    public int field874 = -1;

    @ObfuscatedName("an.aj")
    public int field875 = -1;

    @ObfuscatedName("an.ah")
    public int field848 = 0;

    @ObfuscatedName("an.au")
    public int field877 = 0;

    @ObfuscatedName("an.ad")
    public int field878 = 0;

    @ObfuscatedName("an.az")
    public int[] field849;

    @ObfuscatedName("z.g(Lec;Lec;ZI)V")
    public static void method28(class146 arg0, class146 arg1, boolean arg2) {
        Statics.field831 = arg0;
        Statics.field832 = arg1;
        field851 = arg2;
    }

    @ObfuscatedName("c.v(IB)Lan;")
    public static class36 method505(int arg0) {
        class36 var1 = (class36) field833.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field831.method2708(6, arg0);
        class36 var3 = new class36();
        var3.field866 = arg0;
        if (var2 != null) {
            var3.method657(new class107(var2));
        }
        var3.method638();
        if (var3.field835) {
            var3.field859 = 0;
            var3.field879 = false;
        }
        field833.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.z(I)V")
    public void method638() {
        if (this.field853 == -1) {
            this.field853 = 0;
            if (this.field839 != null && (this.field840 == null || this.field840[0] == 10)) {
                this.field853 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field858[var1] != null) {
                    this.field853 = 1;
                }
            }
        }
        if (this.field871 == -1) {
            this.field871 = this.field859 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("an.h(Ldm;B)V")
    public void method657(class107 arg0) {
        while (true) {
            int var2 = arg0.method2139();
            if (var2 == 0) {
                return;
            }
            this.method640(arg0, var2);
        }
    }

    @ObfuscatedName("an.k(Ldm;IB)V")
    public void method640(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2139();
            if (var3 > 0) {
                if (this.field839 == null || field851) {
                    this.field840 = new int[var3];
                    this.field839 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field839[var4] = arg0.method2141();
                        this.field840[var4] = arg0.method2139();
                    }
                } else {
                    arg0.field1839 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field838 = arg0.method2147();
        } else if (arg1 == 5) {
            int var5 = arg0.method2139();
            if (var5 > 0) {
                if (this.field839 == null || field851) {
                    this.field840 = null;
                    this.field839 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field839[var6] = arg0.method2141();
                    }
                } else {
                    arg0.field1839 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field846 = arg0.method2139();
        } else if (arg1 == 15) {
            this.field847 = arg0.method2139();
        } else if (arg1 == 17) {
            this.field859 = 0;
            this.field879 = false;
        } else if (arg1 == 18) {
            this.field879 = false;
        } else if (arg1 == 19) {
            this.field853 = arg0.method2139();
        } else if (arg1 == 21) {
            this.field870 = 0;
        } else if (arg1 == 22) {
            this.field852 = true;
        } else if (arg1 == 23) {
            this.field876 = true;
        } else if (arg1 == 24) {
            this.field854 = arg0.method2141();
            if (this.field854 == 65535) {
                this.field854 = -1;
            }
        } else if (arg1 == 27) {
            this.field859 = 1;
        } else if (arg1 == 28) {
            this.field834 = arg0.method2139();
        } else if (arg1 == 29) {
            this.field856 = arg0.method2140();
        } else if (arg1 == 39) {
            this.field857 = arg0.method2140();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field858[arg1 - 30] = arg0.method2147();
            if (this.field858[arg1 - 30].equalsIgnoreCase(class142.field2207)) {
                this.field858[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2139();
            this.field842 = new short[var7];
            this.field861 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field842[var8] = (short) arg0.method2141();
                this.field861[var8] = (short) arg0.method2141();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2139();
            this.field830 = new short[var9];
            this.field845 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field830[var10] = (short) arg0.method2141();
                this.field845[var10] = (short) arg0.method2141();
            }
        } else if (arg1 == 60) {
            this.field843 = arg0.method2141();
        } else if (arg1 == 62) {
            this.field873 = true;
        } else if (arg1 == 64) {
            this.field862 = false;
        } else if (arg1 == 65) {
            this.field863 = arg0.method2141();
        } else if (arg1 == 66) {
            this.field864 = arg0.method2141();
        } else if (arg1 == 67) {
            this.field865 = arg0.method2141();
        } else if (arg1 == 68) {
            this.field860 = arg0.method2141();
        } else if (arg1 == 69) {
            arg0.method2139();
        } else if (arg1 == 70) {
            this.field850 = arg0.method2142();
        } else if (arg1 == 71) {
            this.field867 = arg0.method2142();
        } else if (arg1 == 72) {
            this.field868 = arg0.method2142();
        } else if (arg1 == 73) {
            this.field869 = true;
        } else if (arg1 == 74) {
            this.field835 = true;
        } else if (arg1 == 75) {
            this.field871 = arg0.method2139();
        } else if (arg1 == 77) {
            this.field855 = arg0.method2141();
            if (this.field855 == 65535) {
                this.field855 = -1;
            }
            this.field874 = arg0.method2141();
            if (this.field874 == 65535) {
                this.field874 = -1;
            }
            int var11 = arg0.method2139();
            this.field872 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field872[var12] = arg0.method2141();
                if (this.field872[var12] == 65535) {
                    this.field872[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field875 = arg0.method2141();
            this.field848 = arg0.method2139();
        } else if (arg1 == 79) {
            this.field877 = arg0.method2141();
            this.field878 = arg0.method2141();
            this.field848 = arg0.method2139();
            int var13 = arg0.method2139();
            this.field849 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field849[var14] = arg0.method2141();
            }
        } else if (arg1 == 81) {
            this.field870 = arg0.method2139() * 256;
        }
    }

    @ObfuscatedName("an.l(II)Z")
    public final boolean method647(int arg0) {
        if (this.field840 != null) {
            for (int var4 = 0; var4 < this.field840.length; var4++) {
                if (this.field840[var4] == arg0) {
                    return Statics.field832.method2710(this.field839[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field839 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field839.length; var3++) {
                var2 &= Statics.field832.method2710(this.field839[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("an.e(B)Z")
    public final boolean method642() {
        if (this.field839 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field839.length; var2++) {
            var1 &= Statics.field832.method2710(this.field839[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("an.j(II[[IIIIB)Lbj;")
    public final class78 method643(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field840 == null) {
            var7 = (long) ((this.field866 << 10) + arg1);
        } else {
            var7 = (long) ((this.field866 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field844.method3166(var7);
        if (var9 == null) {
            class93 var10 = this.method677(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field852) {
                var10.field1589 = (short) (this.field856 + 64);
                var10.field1613 = (short) (this.field857 * 25 + 768);
                var10.method1920();
                var9 = var10;
            } else {
                var9 = var10.method1963(this.field856 + 64, this.field857 * 25 + 768, -50, -10, -50);
            }
            field844.method3167(var9, var7);
        }
        if (this.field852) {
            var9 = ((class93) var9).method1908();
        }
        if (this.field870 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method2038(arg2, arg3, arg4, arg5, true, this.field870);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1955(arg2, arg3, arg4, arg5, true, this.field870);
            }
        }
        return var9;
    }

    @ObfuscatedName("an.n(II[[IIIII)Lce;")
    public final class98 method644(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field840 == null) {
            var7 = (long) ((this.field866 << 10) + arg1);
        } else {
            var7 = (long) ((this.field866 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field836.method3166(var7);
        if (var9 == null) {
            class93 var10 = this.method677(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1963(this.field856 + 64, this.field857 * 25 + 768, -50, -10, -50);
            field836.method3167(var9, var7);
        }
        if (this.field870 >= 0) {
            var9 = var9.method2038(arg2, arg3, arg4, arg5, true, this.field870);
        }
        return var9;
    }

    @ObfuscatedName("an.f(II[[IIIILao;IB)Lce;")
    public final class98 method641(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field840 == null) {
            var9 = (long) ((this.field866 << 10) + arg1);
        } else {
            var9 = (long) ((this.field866 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field836.method3166(var9);
        if (var11 == null) {
            class93 var12 = this.method677(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1963(this.field856 + 64, this.field857 * 25 + 768, -50, -10, -50);
            field836.method3167(var11, var9);
        }
        if (arg6 == null && this.field870 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method2000(true);
        } else {
            var13 = arg6.method717(var11, arg7, arg1);
        }
        if (this.field870 >= 0) {
            var13 = var13.method2038(arg2, arg3, arg4, arg5, false, this.field870);
        }
        return var13;
    }

    @ObfuscatedName("an.a(III)Lcv;")
    public final class93 method677(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field840 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field839 == null) {
                return null;
            }
            boolean var4 = this.field873;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field839.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field839[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field841.method3166((long) var7);
                if (var3 == null) {
                    var3 = class93.method1903(Statics.field832, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1958();
                    }
                    field841.method3167(var3, (long) var7);
                }
                if (var5 > 1) {
                    field837[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field837, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field840.length; var9++) {
                if (this.field840[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field839[var8];
            boolean var11 = this.field873 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field841.method3166((long) var10);
            if (var3 == null) {
                var3 = class93.method1903(Statics.field832, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1958();
                }
                field841.method3167(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field863 == 128 && this.field864 == 128 && this.field865 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field850 == 0 && this.field867 == 0 && this.field868 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field842 == null, this.field830 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1911(256);
            var14.method1915(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1950();
        } else if (var15 == 2) {
            var14.method1940();
        } else if (var15 == 3) {
            var14.method1913();
        }
        if (this.field842 != null) {
            for (int var16 = 0; var16 < this.field842.length; var16++) {
                var14.method1916(this.field842[var16], this.field861[var16]);
            }
        }
        if (this.field830 != null) {
            for (int var17 = 0; var17 < this.field830.length; var17++) {
                var14.method1917(this.field830[var17], this.field845[var17]);
            }
        }
        if (var12) {
            var14.method1919(this.field863, this.field864, this.field865);
        }
        if (var13) {
            var14.method1915(this.field850, this.field867, this.field868);
        }
        return var14;
    }

    @ObfuscatedName("an.i(B)Lan;")
    public final class36 method648() {
        int var1 = -1;
        if (this.field855 != -1) {
            var1 = class154.method2684(this.field855);
        } else if (this.field874 != -1) {
            var1 = class154.field2660[this.field874];
        }
        return var1 < 0 || var1 >= this.field872.length || this.field872[var1] == -1 ? null : method505(this.field872[var1]);
    }

    @ObfuscatedName("h.y(I)V")
    public static void method33() {
        field833.method3176();
        field841.method3176();
        field844.method3176();
        field836.method3176();
    }

    @ObfuscatedName("an.p(B)Z")
    public boolean method670() {
        if (this.field872 == null) {
            return this.field875 != -1 || this.field849 != null;
        }
        for (int var1 = 0; var1 < this.field872.length; var1++) {
            if (this.field872[var1] != -1) {
                class36 var2 = method505(this.field872[var1]);
                if (var2.field875 != -1 || var2.field849 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

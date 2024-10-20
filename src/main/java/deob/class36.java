package deob;

@ObfuscatedName("ap")
public class class36 extends class182 {

    @ObfuscatedName("ap.k")
    public static boolean field870 = false;

    @ObfuscatedName("ap.i")
    public static class171 field876 = new class171(64);

    @ObfuscatedName("ap.t")
    public static class171 field835 = new class171(500);

    @ObfuscatedName("ap.z")
    public static class171 field836 = new class171(30);

    @ObfuscatedName("ap.g")
    public static class171 field837 = new class171(30);

    @ObfuscatedName("ap.c")
    public static class93[] field859 = new class93[4];

    @ObfuscatedName("ap.o")
    public int field880;

    @ObfuscatedName("ap.q")
    public int[] field840;

    @ObfuscatedName("ap.w")
    public int[] field841;

    @ObfuscatedName("ap.y")
    public String field842 = "null";

    @ObfuscatedName("ap.p")
    public short[] field852;

    @ObfuscatedName("ap.m")
    public short[] field875;

    @ObfuscatedName("ap.a")
    public short[] field845;

    @ObfuscatedName("ap.u")
    public short[] field844;

    @ObfuscatedName("ap.n")
    public int field854 = 1;

    @ObfuscatedName("ap.x")
    public int field839 = 1;

    @ObfuscatedName("ap.f")
    public int field849 = 2;

    @ObfuscatedName("ap.v")
    public boolean field863 = true;

    @ObfuscatedName("ap.s")
    public int field851 = -1;

    @ObfuscatedName("ap.r")
    public int field856 = -1;

    @ObfuscatedName("ap.j")
    public boolean field834 = false;

    @ObfuscatedName("ap.h")
    public boolean field831 = false;

    @ObfuscatedName("ap.d")
    public int field855 = -1;

    @ObfuscatedName("ap.l")
    public int field850 = 16;

    @ObfuscatedName("ap.ag")
    public int field857 = 0;

    @ObfuscatedName("ap.au")
    public int field858 = 0;

    @ObfuscatedName("ap.ak")
    public String[] field865 = new String[5];

    @ObfuscatedName("ap.aw")
    public int field860 = -1;

    @ObfuscatedName("ap.at")
    public int field861 = -1;

    @ObfuscatedName("ap.ah")
    public boolean field862 = false;

    @ObfuscatedName("ap.aj")
    public boolean field848 = true;

    @ObfuscatedName("ap.an")
    public int field864 = 128;

    @ObfuscatedName("ap.as")
    public int field847 = 128;

    @ObfuscatedName("ap.ap")
    public int field843 = 128;

    @ObfuscatedName("ap.ai")
    public int field867 = 0;

    @ObfuscatedName("ap.av")
    public int field868 = 0;

    @ObfuscatedName("ap.ae")
    public int field869 = 0;

    @ObfuscatedName("ap.ay")
    public boolean field853 = false;

    @ObfuscatedName("ap.ab")
    public boolean field871 = false;

    @ObfuscatedName("ap.az")
    public int field872 = -1;

    @ObfuscatedName("ap.ad")
    public int[] field873;

    @ObfuscatedName("ap.ao")
    public int field874 = -1;

    @ObfuscatedName("ap.am")
    public int field838 = -1;

    @ObfuscatedName("ap.al")
    public int field866 = -1;

    @ObfuscatedName("ap.ac")
    public int field877 = 0;

    @ObfuscatedName("ap.ax")
    public int field878 = 0;

    @ObfuscatedName("ap.aa")
    public int field879 = 0;

    @ObfuscatedName("ap.aq")
    public int[] field846;

    @ObfuscatedName("cc.k(Ley;Ley;ZI)V")
    public static void method1872(class146 arg0, class146 arg1, boolean arg2) {
        Statics.field832 = arg0;
        Statics.field833 = arg1;
        field870 = arg2;
    }

    @ObfuscatedName("c.b(II)Lap;")
    public static class36 method93(int arg0) {
        class36 var1 = (class36) field876.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field832.method2759(6, arg0);
        class36 var3 = new class36();
        var3.field880 = arg0;
        if (var2 != null) {
            var3.method640(new class107(var2));
        }
        var3.method669();
        if (var3.field871) {
            var3.field849 = 0;
            var3.field863 = false;
        }
        field876.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.e(B)V")
    public void method669() {
        if (this.field851 == -1) {
            this.field851 = 0;
            if (this.field840 != null && (this.field841 == null || this.field841[0] == 10)) {
                this.field851 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field865[var1] != null) {
                    this.field851 = 1;
                }
            }
        }
        if (this.field872 == -1) {
            this.field872 = this.field849 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ap.i(Ldi;I)V")
    public void method640(class107 arg0) {
        while (true) {
            int var2 = arg0.method2115();
            if (var2 == 0) {
                return;
            }
            this.method641(arg0, var2);
        }
    }

    @ObfuscatedName("ap.t(Ldi;IB)V")
    public void method641(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2115();
            if (var3 > 0) {
                if (this.field840 == null || field870) {
                    this.field841 = new int[var3];
                    this.field840 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field840[var4] = arg0.method2117();
                        this.field841[var4] = arg0.method2115();
                    }
                } else {
                    arg0.field1862 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field842 = arg0.method2123();
        } else if (arg1 == 5) {
            int var5 = arg0.method2115();
            if (var5 > 0) {
                if (this.field840 == null || field870) {
                    this.field841 = null;
                    this.field840 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field840[var6] = arg0.method2117();
                    }
                } else {
                    arg0.field1862 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field854 = arg0.method2115();
        } else if (arg1 == 15) {
            this.field839 = arg0.method2115();
        } else if (arg1 == 17) {
            this.field849 = 0;
            this.field863 = false;
        } else if (arg1 == 18) {
            this.field863 = false;
        } else if (arg1 == 19) {
            this.field851 = arg0.method2115();
        } else if (arg1 == 21) {
            this.field856 = 0;
        } else if (arg1 == 22) {
            this.field834 = true;
        } else if (arg1 == 23) {
            this.field831 = true;
        } else if (arg1 == 24) {
            this.field855 = arg0.method2117();
            if (this.field855 == 65535) {
                this.field855 = -1;
            }
        } else if (arg1 == 27) {
            this.field849 = 1;
        } else if (arg1 == 28) {
            this.field850 = arg0.method2115();
        } else if (arg1 == 29) {
            this.field857 = arg0.method2116();
        } else if (arg1 == 39) {
            this.field858 = arg0.method2116() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field865[arg1 - 30] = arg0.method2123();
            if (this.field865[arg1 - 30].equalsIgnoreCase(class142.field2294)) {
                this.field865[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2115();
            this.field852 = new short[var7];
            this.field875 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field852[var8] = (short) arg0.method2117();
                this.field875[var8] = (short) arg0.method2117();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2115();
            this.field845 = new short[var9];
            this.field844 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field845[var10] = (short) arg0.method2117();
                this.field844[var10] = (short) arg0.method2117();
            }
        } else if (arg1 == 60) {
            this.field860 = arg0.method2117();
        } else if (arg1 == 62) {
            this.field862 = true;
        } else if (arg1 == 64) {
            this.field848 = false;
        } else if (arg1 == 65) {
            this.field864 = arg0.method2117();
        } else if (arg1 == 66) {
            this.field847 = arg0.method2117();
        } else if (arg1 == 67) {
            this.field843 = arg0.method2117();
        } else if (arg1 == 68) {
            this.field861 = arg0.method2117();
        } else if (arg1 == 69) {
            arg0.method2115();
        } else if (arg1 == 70) {
            this.field867 = arg0.method2118();
        } else if (arg1 == 71) {
            this.field868 = arg0.method2118();
        } else if (arg1 == 72) {
            this.field869 = arg0.method2118();
        } else if (arg1 == 73) {
            this.field853 = true;
        } else if (arg1 == 74) {
            this.field871 = true;
        } else if (arg1 == 75) {
            this.field872 = arg0.method2115();
        } else if (arg1 == 77) {
            this.field874 = arg0.method2117();
            if (this.field874 == 65535) {
                this.field874 = -1;
            }
            this.field838 = arg0.method2117();
            if (this.field838 == 65535) {
                this.field838 = -1;
            }
            int var11 = arg0.method2115();
            this.field873 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field873[var12] = arg0.method2117();
                if (this.field873[var12] == 65535) {
                    this.field873[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field866 = arg0.method2117();
            this.field877 = arg0.method2115();
        } else if (arg1 == 79) {
            this.field878 = arg0.method2117();
            this.field879 = arg0.method2117();
            this.field877 = arg0.method2115();
            int var13 = arg0.method2115();
            this.field846 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field846[var14] = arg0.method2117();
            }
        } else if (arg1 == 81) {
            this.field856 = arg0.method2115() * 256;
        }
    }

    @ObfuscatedName("ap.z(IB)Z")
    public final boolean method639(int arg0) {
        if (this.field841 != null) {
            for (int var4 = 0; var4 < this.field841.length; var4++) {
                if (this.field841[var4] == arg0) {
                    return Statics.field833.method2700(this.field840[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field840 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field840.length; var3++) {
                var2 &= Statics.field833.method2700(this.field840[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ap.g(I)Z")
    public final boolean method643() {
        if (this.field840 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field840.length; var2++) {
            var1 &= Statics.field833.method2700(this.field840[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ap.c(II[[IIIIS)Lbz;")
    public final class78 method644(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field841 == null) {
            var7 = (long) ((this.field880 << 10) + arg1);
        } else {
            var7 = (long) ((this.field880 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field836.method3166(var7);
        if (var9 == null) {
            class93 var10 = this.method647(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field834) {
                var10.field1627 = (short) (this.field857 + 64);
                var10.field1628 = (short) (this.field858 + 768);
                var10.method1887();
                var9 = var10;
            } else {
                var9 = var10.method1902(this.field857 + 64, this.field858 + 768, -50, -10, -50);
            }
            field836.method3161(var9, var7);
        }
        if (this.field834) {
            var9 = ((class93) var9).method1945();
        }
        if (this.field856 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method1975(arg2, arg3, arg4, arg5, true, this.field856);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1898(arg2, arg3, arg4, arg5, true, this.field856);
            }
        }
        return var9;
    }

    @ObfuscatedName("ap.o(II[[IIIII)Lck;")
    public final class98 method645(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field841 == null) {
            var7 = (long) ((this.field880 << 10) + arg1);
        } else {
            var7 = (long) ((this.field880 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field837.method3166(var7);
        if (var9 == null) {
            class93 var10 = this.method647(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1902(this.field857 + 64, this.field858 + 768, -50, -10, -50);
            field837.method3161(var9, var7);
        }
        if (this.field856 >= 0) {
            var9 = var9.method1975(arg2, arg3, arg4, arg5, true, this.field856);
        }
        return var9;
    }

    @ObfuscatedName("ap.q(II[[IIIILav;IB)Lck;")
    public final class98 method646(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field841 == null) {
            var9 = (long) ((this.field880 << 10) + arg1);
        } else {
            var9 = (long) ((this.field880 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field837.method3166(var9);
        if (var11 == null) {
            class93 var12 = this.method647(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1902(this.field857 + 64, this.field858 + 768, -50, -10, -50);
            field837.method3161(var11, var9);
        }
        if (arg6 == null && this.field856 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method2001(true);
        } else {
            var13 = arg6.method702(var11, arg7, arg1);
        }
        if (this.field856 >= 0) {
            var13 = var13.method1975(arg2, arg3, arg4, arg5, false, this.field856);
        }
        return var13;
    }

    @ObfuscatedName("ap.w(III)Lcv;")
    public final class93 method647(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field841 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field840 == null) {
                return null;
            }
            boolean var4 = this.field862;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field840.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field840[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field835.method3166((long) var7);
                if (var3 == null) {
                    var3 = class93.method1881(Statics.field833, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1897();
                    }
                    field835.method3161(var3, (long) var7);
                }
                if (var5 > 1) {
                    field859[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field859, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field841.length; var9++) {
                if (this.field841[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field840[var8];
            boolean var11 = this.field862 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field835.method3166((long) var10);
            if (var3 == null) {
                var3 = class93.method1881(Statics.field833, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1897();
                }
                field835.method3161(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field864 == 128 && this.field847 == 128 && this.field843 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field867 == 0 && this.field868 == 0 && this.field869 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field852 == null, this.field845 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1893(256);
            var14.method1894(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1880();
        } else if (var15 == 2) {
            var14.method1882();
        } else if (var15 == 3) {
            var14.method1892();
        }
        if (this.field852 != null) {
            for (int var16 = 0; var16 < this.field852.length; var16++) {
                var14.method1895(this.field852[var16], this.field875[var16]);
            }
        }
        if (this.field845 != null) {
            for (int var17 = 0; var17 < this.field845.length; var17++) {
                var14.method1924(this.field845[var17], this.field844[var17]);
            }
        }
        if (var12) {
            var14.method1923(this.field864, this.field847, this.field843);
        }
        if (var13) {
            var14.method1894(this.field867, this.field868, this.field869);
        }
        return var14;
    }

    @ObfuscatedName("ap.y(B)Lap;")
    public final class36 method648() {
        int var1 = -1;
        if (this.field874 != -1) {
            var1 = class154.method2880(this.field874);
        } else if (this.field838 != -1) {
            var1 = class154.field2661[this.field838];
        }
        return var1 < 0 || var1 >= this.field873.length || this.field873[var1] == -1 ? null : method93(this.field873[var1]);
    }

    @ObfuscatedName("ap.p(I)Z")
    public boolean method649() {
        if (this.field873 == null) {
            return this.field866 != -1 || this.field846 != null;
        }
        for (int var1 = 0; var1 < this.field873.length; var1++) {
            if (this.field873[var1] != -1) {
                class36 var2 = method93(this.field873[var1]);
                if (var2.field866 != -1 || var2.field846 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

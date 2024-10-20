package deob;

@ObfuscatedName("af")
public class class36 extends class182 {

    @ObfuscatedName("af.t")
    public static boolean field870 = false;

    @ObfuscatedName("af.p")
    public static class171 field827 = new class171(64);

    @ObfuscatedName("af.c")
    public static class171 field828 = new class171(500);

    @ObfuscatedName("af.y")
    public static class171 field854 = new class171(30);

    @ObfuscatedName("af.g")
    public static class171 field830 = new class171(30);

    @ObfuscatedName("af.l")
    public static class93[] field831 = new class93[4];

    @ObfuscatedName("af.h")
    public int field852;

    @ObfuscatedName("af.n")
    public int[] field833;

    @ObfuscatedName("af.w")
    public int[] field834;

    @ObfuscatedName("af.m")
    public String field835 = "null";

    @ObfuscatedName("af.x")
    public short[] field836;

    @ObfuscatedName("af.b")
    public short[] field837;

    @ObfuscatedName("af.u")
    public short[] field838;

    @ObfuscatedName("af.r")
    public short[] field839;

    @ObfuscatedName("af.z")
    public int field856 = 1;

    @ObfuscatedName("af.v")
    public int field841 = 1;

    @ObfuscatedName("af.k")
    public int field842 = 2;

    @ObfuscatedName("af.a")
    public boolean field848 = true;

    @ObfuscatedName("af.d")
    public int field844 = -1;

    @ObfuscatedName("af.j")
    public int field846 = -1;

    @ObfuscatedName("af.s")
    public boolean field859 = false;

    @ObfuscatedName("af.f")
    public boolean field847 = false;

    @ObfuscatedName("af.e")
    public int field872 = -1;

    @ObfuscatedName("af.q")
    public int field849 = 16;

    @ObfuscatedName("af.al")
    public int field850 = 0;

    @ObfuscatedName("af.ao")
    public int field851 = 0;

    @ObfuscatedName("af.ap")
    public String[] field857 = new String[5];

    @ObfuscatedName("af.aa")
    public int field853 = -1;

    @ObfuscatedName("af.ak")
    public int field832 = -1;

    @ObfuscatedName("af.ah")
    public boolean field855 = false;

    @ObfuscatedName("af.as")
    public boolean field871 = true;

    @ObfuscatedName("af.aw")
    public int field845 = 128;

    @ObfuscatedName("af.aj")
    public int field840 = 128;

    @ObfuscatedName("af.af")
    public int field824 = 128;

    @ObfuscatedName("af.am")
    public int field865 = 0;

    @ObfuscatedName("af.ab")
    public int field861 = 0;

    @ObfuscatedName("af.ai")
    public int field862 = 0;

    @ObfuscatedName("af.an")
    public boolean field863 = false;

    @ObfuscatedName("af.ac")
    public boolean field864 = false;

    @ObfuscatedName("af.au")
    public int field858 = -1;

    @ObfuscatedName("af.av")
    public int[] field866;

    @ObfuscatedName("af.at")
    public int field867 = -1;

    @ObfuscatedName("af.ax")
    public int field868 = -1;

    @ObfuscatedName("af.ae")
    public int field869 = -1;

    @ObfuscatedName("af.az")
    public int field826 = 0;

    @ObfuscatedName("af.ar")
    public int field843 = 0;

    @ObfuscatedName("af.aq")
    public int field829 = 0;

    @ObfuscatedName("af.ag")
    public int[] field879;

    @ObfuscatedName("s.t(Ley;Ley;ZI)V")
    public static void method498(class146 arg0, class146 arg1, boolean arg2) {
        Statics.field825 = arg0;
        Statics.field877 = arg1;
        field870 = arg2;
    }

    @ObfuscatedName("t.o(II)Laf;")
    public static class36 method3(int arg0) {
        class36 var1 = (class36) field827.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field825.method2668(6, arg0);
        class36 var3 = new class36();
        var3.field852 = arg0;
        if (var2 != null) {
            var3.method678(new class107(var2));
        }
        var3.method639();
        if (var3.field864) {
            var3.field842 = 0;
            var3.field848 = false;
        }
        field827.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.i(I)V")
    public void method639() {
        if (this.field844 == -1) {
            this.field844 = 0;
            if (this.field833 != null && (this.field834 == null || this.field834[0] == 10)) {
                this.field844 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field857[var1] != null) {
                    this.field844 = 1;
                }
            }
        }
        if (this.field858 == -1) {
            this.field858 = this.field842 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("af.p(Ldg;I)V")
    public void method678(class107 arg0) {
        while (true) {
            int var2 = arg0.method2118();
            if (var2 == 0) {
                return;
            }
            this.method641(arg0, var2);
        }
    }

    @ObfuscatedName("af.c(Ldg;IB)V")
    public void method641(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2118();
            if (var3 > 0) {
                if (this.field833 == null || field870) {
                    this.field834 = new int[var3];
                    this.field833 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field833[var4] = arg0.method2120();
                        this.field834[var4] = arg0.method2118();
                    }
                } else {
                    arg0.field1827 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field835 = arg0.method2126();
        } else if (arg1 == 5) {
            int var5 = arg0.method2118();
            if (var5 > 0) {
                if (this.field833 == null || field870) {
                    this.field834 = null;
                    this.field833 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field833[var6] = arg0.method2120();
                    }
                } else {
                    arg0.field1827 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field856 = arg0.method2118();
        } else if (arg1 == 15) {
            this.field841 = arg0.method2118();
        } else if (arg1 == 17) {
            this.field842 = 0;
            this.field848 = false;
        } else if (arg1 == 18) {
            this.field848 = false;
        } else if (arg1 == 19) {
            this.field844 = arg0.method2118();
        } else if (arg1 == 21) {
            this.field846 = 0;
        } else if (arg1 == 22) {
            this.field859 = true;
        } else if (arg1 == 23) {
            this.field847 = true;
        } else if (arg1 == 24) {
            this.field872 = arg0.method2120();
            if (this.field872 == 65535) {
                this.field872 = -1;
            }
        } else if (arg1 == 27) {
            this.field842 = 1;
        } else if (arg1 == 28) {
            this.field849 = arg0.method2118();
        } else if (arg1 == 29) {
            this.field850 = arg0.method2253();
        } else if (arg1 == 39) {
            this.field851 = arg0.method2253() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field857[arg1 - 30] = arg0.method2126();
            if (this.field857[arg1 - 30].equalsIgnoreCase(class142.field2121)) {
                this.field857[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2118();
            this.field836 = new short[var7];
            this.field837 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field836[var8] = (short) arg0.method2120();
                this.field837[var8] = (short) arg0.method2120();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2118();
            this.field838 = new short[var9];
            this.field839 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field838[var10] = (short) arg0.method2120();
                this.field839[var10] = (short) arg0.method2120();
            }
        } else if (arg1 == 60) {
            this.field853 = arg0.method2120();
        } else if (arg1 == 62) {
            this.field855 = true;
        } else if (arg1 == 64) {
            this.field871 = false;
        } else if (arg1 == 65) {
            this.field845 = arg0.method2120();
        } else if (arg1 == 66) {
            this.field840 = arg0.method2120();
        } else if (arg1 == 67) {
            this.field824 = arg0.method2120();
        } else if (arg1 == 68) {
            this.field832 = arg0.method2120();
        } else if (arg1 == 69) {
            arg0.method2118();
        } else if (arg1 == 70) {
            this.field865 = arg0.method2252();
        } else if (arg1 == 71) {
            this.field861 = arg0.method2252();
        } else if (arg1 == 72) {
            this.field862 = arg0.method2252();
        } else if (arg1 == 73) {
            this.field863 = true;
        } else if (arg1 == 74) {
            this.field864 = true;
        } else if (arg1 == 75) {
            this.field858 = arg0.method2118();
        } else if (arg1 == 77) {
            this.field867 = arg0.method2120();
            if (this.field867 == 65535) {
                this.field867 = -1;
            }
            this.field868 = arg0.method2120();
            if (this.field868 == 65535) {
                this.field868 = -1;
            }
            int var11 = arg0.method2118();
            this.field866 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field866[var12] = arg0.method2120();
                if (this.field866[var12] == 65535) {
                    this.field866[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field869 = arg0.method2120();
            this.field826 = arg0.method2118();
        } else if (arg1 == 79) {
            this.field843 = arg0.method2120();
            this.field829 = arg0.method2120();
            this.field826 = arg0.method2118();
            int var13 = arg0.method2118();
            this.field879 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field879[var14] = arg0.method2120();
            }
        } else if (arg1 == 81) {
            this.field846 = arg0.method2118() * 256;
        }
    }

    @ObfuscatedName("af.y(IB)Z")
    public final boolean method642(int arg0) {
        if (this.field834 != null) {
            for (int var4 = 0; var4 < this.field834.length; var4++) {
                if (this.field834[var4] == arg0) {
                    return Statics.field877.method2670(this.field833[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field833 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field833.length; var3++) {
                var2 &= Statics.field877.method2670(this.field833[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("af.g(I)Z")
    public final boolean method660() {
        if (this.field833 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field833.length; var2++) {
            var1 &= Statics.field877.method2670(this.field833[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("af.l(II[[IIIII)Lbf;")
    public final class78 method644(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field834 == null) {
            var7 = (long) ((this.field852 << 10) + arg1);
        } else {
            var7 = (long) ((this.field852 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field854.method3099(var7);
        if (var9 == null) {
            class93 var10 = this.method647(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field859) {
                var10.field1601 = (short) (this.field850 + 64);
                var10.field1611 = (short) (this.field851 + 768);
                var10.method1899();
                var9 = var10;
            } else {
                var9 = var10.method1917(this.field850 + 64, this.field851 + 768, -50, -10, -50);
            }
            field854.method3101(var9, var7);
        }
        if (this.field859) {
            var9 = ((class93) var9).method1887();
        }
        if (this.field846 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method2044(arg2, arg3, arg4, arg5, true, this.field846);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1912(arg2, arg3, arg4, arg5, true, this.field846);
            }
        }
        return var9;
    }

    @ObfuscatedName("af.h(II[[IIIII)Lcx;")
    public final class98 method645(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field834 == null) {
            var7 = (long) ((this.field852 << 10) + arg1);
        } else {
            var7 = (long) ((this.field852 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field830.method3099(var7);
        if (var9 == null) {
            class93 var10 = this.method647(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1917(this.field850 + 64, this.field851 + 768, -50, -10, -50);
            field830.method3101(var9, var7);
        }
        if (this.field846 >= 0) {
            var9 = var9.method2044(arg2, arg3, arg4, arg5, true, this.field846);
        }
        return var9;
    }

    @ObfuscatedName("af.n(II[[IIIILab;IB)Lcx;")
    public final class98 method646(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field834 == null) {
            var9 = (long) ((this.field852 << 10) + arg1);
        } else {
            var9 = (long) ((this.field852 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field830.method3099(var9);
        if (var11 == null) {
            class93 var12 = this.method647(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1917(this.field850 + 64, this.field851 + 768, -50, -10, -50);
            field830.method3101(var11, var9);
        }
        if (arg6 == null && this.field846 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1971(true);
        } else {
            var13 = arg6.method736(var11, arg7, arg1);
        }
        if (this.field846 >= 0) {
            var13 = var13.method2044(arg2, arg3, arg4, arg5, false, this.field846);
        }
        return var13;
    }

    @ObfuscatedName("af.w(III)Lcd;")
    public final class93 method647(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field834 == null) {
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
                var3 = (class93) field828.method3099((long) var7);
                if (var3 == null) {
                    var3 = class93.method1883(Statics.field877, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1956();
                    }
                    field828.method3101(var3, (long) var7);
                }
                if (var5 > 1) {
                    field831[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field831, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field834.length; var9++) {
                if (this.field834[var9] == arg0) {
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
            var3 = (class93) field828.method3099((long) var10);
            if (var3 == null) {
                var3 = class93.method1883(Statics.field877, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1956();
                }
                field828.method3101(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field845 == 128 && this.field840 == 128 && this.field824 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field865 == 0 && this.field861 == 0 && this.field862 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field836 == null, this.field838 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1893(256);
            var14.method1895(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1890();
        } else if (var15 == 2) {
            var14.method1903();
        } else if (var15 == 3) {
            var14.method1943();
        }
        if (this.field836 != null) {
            for (int var16 = 0; var16 < this.field836.length; var16++) {
                var14.method1924(this.field836[var16], this.field837[var16]);
            }
        }
        if (this.field838 != null) {
            for (int var17 = 0; var17 < this.field838.length; var17++) {
                var14.method1945(this.field838[var17], this.field839[var17]);
            }
        }
        if (var12) {
            var14.method1898(this.field845, this.field840, this.field824);
        }
        if (var13) {
            var14.method1895(this.field865, this.field861, this.field862);
        }
        return var14;
    }

    @ObfuscatedName("af.m(I)Laf;")
    public final class36 method648() {
        int var1 = -1;
        if (this.field867 != -1) {
            var1 = Statics.method2786(this.field867);
        } else if (this.field868 != -1) {
            var1 = class154.field2642[this.field868];
        }
        return var1 < 0 || var1 >= this.field866.length || this.field866[var1] == -1 ? null : method3(this.field866[var1]);
    }

    @ObfuscatedName("af.x(I)Z")
    public boolean method649() {
        if (this.field866 == null) {
            return this.field869 != -1 || this.field879 != null;
        }
        for (int var1 = 0; var1 < this.field866.length; var1++) {
            if (this.field866[var1] != -1) {
                class36 var2 = method3(this.field866[var1]);
                if (var2.field869 != -1 || var2.field879 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

package deob;

@ObfuscatedName("az")
public class class36 extends class182 {

    @ObfuscatedName("az.k")
    public static boolean field868 = false;

    @ObfuscatedName("az.w")
    public static class171 field883 = new class171(64);

    @ObfuscatedName("az.m")
    public static class171 field841 = new class171(500);

    @ObfuscatedName("az.j")
    public static class171 field842 = new class171(30);

    @ObfuscatedName("az.g")
    public static class171 field843 = new class171(30);

    @ObfuscatedName("az.p")
    public static class93[] field840 = new class93[4];

    @ObfuscatedName("az.o")
    public int field859;

    @ObfuscatedName("az.b")
    public int[] field869;

    @ObfuscatedName("az.x")
    public int[] field847;

    @ObfuscatedName("az.n")
    public String field871 = "null";

    @ObfuscatedName("az.d")
    public short[] field849;

    @ObfuscatedName("az.s")
    public short[] field850;

    @ObfuscatedName("az.v")
    public short[] field851;

    @ObfuscatedName("az.t")
    public short[] field852;

    @ObfuscatedName("az.u")
    public int field854 = 1;

    @ObfuscatedName("az.l")
    public int field846 = 1;

    @ObfuscatedName("az.i")
    public int field865 = 2;

    @ObfuscatedName("az.h")
    public boolean field855 = true;

    @ObfuscatedName("az.e")
    public int field857 = -1;

    @ObfuscatedName("az.a")
    public int field858 = -1;

    @ObfuscatedName("az.c")
    public boolean field873 = false;

    @ObfuscatedName("az.f")
    public boolean field870 = false;

    @ObfuscatedName("az.q")
    public int field861 = -1;

    @ObfuscatedName("az.z")
    public int field862 = 16;

    @ObfuscatedName("az.aa")
    public int field863 = 0;

    @ObfuscatedName("az.ak")
    public int field844 = 0;

    @ObfuscatedName("az.al")
    public String[] field856 = new String[5];

    @ObfuscatedName("az.aw")
    public int field866 = -1;

    @ObfuscatedName("az.ai")
    public int field867 = -1;

    @ObfuscatedName("az.av")
    public boolean field837 = false;

    @ObfuscatedName("az.an")
    public boolean field864 = true;

    @ObfuscatedName("az.aq")
    public int field880 = 128;

    @ObfuscatedName("az.aj")
    public int field875 = 128;

    @ObfuscatedName("az.az")
    public int field872 = 128;

    @ObfuscatedName("az.ax")
    public int field848 = 0;

    @ObfuscatedName("az.ap")
    public int field845 = 0;

    @ObfuscatedName("az.ar")
    public int field860 = 0;

    @ObfuscatedName("az.am")
    public boolean field876 = false;

    @ObfuscatedName("az.ae")
    public boolean field877 = false;

    @ObfuscatedName("az.as")
    public int field878 = -1;

    @ObfuscatedName("az.ad")
    public int[] field879;

    @ObfuscatedName("az.af")
    public int field853 = -1;

    @ObfuscatedName("az.ab")
    public int field881 = -1;

    @ObfuscatedName("az.at")
    public int field882 = -1;

    @ObfuscatedName("az.ag")
    public int field874 = 0;

    @ObfuscatedName("az.ah")
    public int field884 = 0;

    @ObfuscatedName("az.ac")
    public int field885 = 0;

    @ObfuscatedName("az.ay")
    public int[] field886;

    @ObfuscatedName("bh.k(Lee;Lee;ZB)V")
    public static void method1079(class146 arg0, class146 arg1, boolean arg2) {
        Statics.field838 = arg0;
        Statics.field839 = arg1;
        field868 = arg2;
    }

    @ObfuscatedName("t.r(II)Laz;")
    public static class36 method147(int arg0) {
        class36 var1 = (class36) field883.method3141((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field838.method2749(6, arg0);
        class36 var3 = new class36();
        var3.field859 = arg0;
        if (var2 != null) {
            var3.method666(new class107(var2));
        }
        var3.method627();
        if (var3.field877) {
            var3.field865 = 0;
            var3.field855 = false;
        }
        field883.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.y(B)V")
    public void method627() {
        if (this.field857 == -1) {
            this.field857 = 0;
            if (this.field869 != null && (this.field847 == null || this.field847[0] == 10)) {
                this.field857 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field856[var1] != null) {
                    this.field857 = 1;
                }
            }
        }
        if (this.field878 == -1) {
            this.field878 = this.field865 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("az.w(Lde;I)V")
    public void method666(class107 arg0) {
        while (true) {
            int var2 = arg0.method2111();
            if (var2 == 0) {
                return;
            }
            this.method662(arg0, var2);
        }
    }

    @ObfuscatedName("az.m(Lde;II)V")
    public void method662(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2111();
            if (var3 > 0) {
                if (this.field869 == null || field868) {
                    this.field847 = new int[var3];
                    this.field869 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field869[var4] = arg0.method2232();
                        this.field847[var4] = arg0.method2111();
                    }
                } else {
                    arg0.field1863 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field871 = arg0.method2119();
        } else if (arg1 == 5) {
            int var5 = arg0.method2111();
            if (var5 > 0) {
                if (this.field869 == null || field868) {
                    this.field847 = null;
                    this.field869 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field869[var6] = arg0.method2232();
                    }
                } else {
                    arg0.field1863 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field854 = arg0.method2111();
        } else if (arg1 == 15) {
            this.field846 = arg0.method2111();
        } else if (arg1 == 17) {
            this.field865 = 0;
            this.field855 = false;
        } else if (arg1 == 18) {
            this.field855 = false;
        } else if (arg1 == 19) {
            this.field857 = arg0.method2111();
        } else if (arg1 == 21) {
            this.field858 = 0;
        } else if (arg1 == 22) {
            this.field873 = true;
        } else if (arg1 == 23) {
            this.field870 = true;
        } else if (arg1 == 24) {
            this.field861 = arg0.method2232();
            if (this.field861 == 65535) {
                this.field861 = -1;
            }
        } else if (arg1 == 27) {
            this.field865 = 1;
        } else if (arg1 == 28) {
            this.field862 = arg0.method2111();
        } else if (arg1 == 29) {
            this.field863 = arg0.method2112();
        } else if (arg1 == 39) {
            this.field844 = arg0.method2112() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field856[arg1 - 30] = arg0.method2119();
            if (this.field856[arg1 - 30].equalsIgnoreCase(class142.field2205)) {
                this.field856[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2111();
            this.field849 = new short[var7];
            this.field850 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field849[var8] = (short) arg0.method2232();
                this.field850[var8] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2111();
            this.field851 = new short[var9];
            this.field852 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field851[var10] = (short) arg0.method2232();
                this.field852[var10] = (short) arg0.method2232();
            }
        } else if (arg1 == 60) {
            this.field866 = arg0.method2232();
        } else if (arg1 == 62) {
            this.field837 = true;
        } else if (arg1 == 64) {
            this.field864 = false;
        } else if (arg1 == 65) {
            this.field880 = arg0.method2232();
        } else if (arg1 == 66) {
            this.field875 = arg0.method2232();
        } else if (arg1 == 67) {
            this.field872 = arg0.method2232();
        } else if (arg1 == 68) {
            this.field867 = arg0.method2232();
        } else if (arg1 == 69) {
            arg0.method2111();
        } else if (arg1 == 70) {
            this.field848 = arg0.method2240();
        } else if (arg1 == 71) {
            this.field845 = arg0.method2240();
        } else if (arg1 == 72) {
            this.field860 = arg0.method2240();
        } else if (arg1 == 73) {
            this.field876 = true;
        } else if (arg1 == 74) {
            this.field877 = true;
        } else if (arg1 == 75) {
            this.field878 = arg0.method2111();
        } else if (arg1 == 77) {
            this.field853 = arg0.method2232();
            if (this.field853 == 65535) {
                this.field853 = -1;
            }
            this.field881 = arg0.method2232();
            if (this.field881 == 65535) {
                this.field881 = -1;
            }
            int var11 = arg0.method2111();
            this.field879 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field879[var12] = arg0.method2232();
                if (this.field879[var12] == 65535) {
                    this.field879[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field882 = arg0.method2232();
            this.field874 = arg0.method2111();
        } else if (arg1 == 79) {
            this.field884 = arg0.method2232();
            this.field885 = arg0.method2232();
            this.field874 = arg0.method2111();
            int var13 = arg0.method2111();
            this.field886 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field886[var14] = arg0.method2232();
            }
        } else if (arg1 == 81) {
            this.field858 = arg0.method2111() * 256;
        }
    }

    @ObfuscatedName("az.j(IB)Z")
    public final boolean method630(int arg0) {
        if (this.field847 != null) {
            for (int var4 = 0; var4 < this.field847.length; var4++) {
                if (this.field847[var4] == arg0) {
                    return Statics.field839.method2727(this.field869[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field869 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field869.length; var3++) {
                var2 &= Statics.field839.method2727(this.field869[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("az.g(S)Z")
    public final boolean method631() {
        if (this.field869 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field869.length; var2++) {
            var1 &= Statics.field839.method2727(this.field869[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("az.p(II[[IIIIB)Lbx;")
    public final class78 method640(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field847 == null) {
            var7 = (long) ((this.field859 << 10) + arg1);
        } else {
            var7 = (long) ((this.field859 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field842.method3141(var7);
        if (var9 == null) {
            class93 var10 = this.method648(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field873) {
                var10.field1625 = (short) (this.field863 + 64);
                var10.field1619 = (short) (this.field844 + 768);
                var10.method1904();
                var9 = var10;
            } else {
                var9 = var10.method1892(this.field863 + 64, this.field844 + 768, -50, -10, -50);
            }
            field842.method3137(var9, var7);
        }
        if (this.field873) {
            var9 = ((class93) var9).method1920();
        }
        if (this.field858 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method1976(arg2, arg3, arg4, arg5, true, this.field858);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1878(arg2, arg3, arg4, arg5, true, this.field858);
            }
        }
        return var9;
    }

    @ObfuscatedName("az.o(II[[IIIIB)Lcp;")
    public final class98 method660(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field847 == null) {
            var7 = (long) ((this.field859 << 10) + arg1);
        } else {
            var7 = (long) ((this.field859 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field843.method3141(var7);
        if (var9 == null) {
            class93 var10 = this.method648(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1892(this.field863 + 64, this.field844 + 768, -50, -10, -50);
            field843.method3137(var9, var7);
        }
        if (this.field858 >= 0) {
            var9 = var9.method1976(arg2, arg3, arg4, arg5, true, this.field858);
        }
        return var9;
    }

    @ObfuscatedName("az.b(II[[IIIILap;II)Lcp;")
    public final class98 method634(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field847 == null) {
            var9 = (long) ((this.field859 << 10) + arg1);
        } else {
            var9 = (long) ((this.field859 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field843.method3141(var9);
        if (var11 == null) {
            class93 var12 = this.method648(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1892(this.field863 + 64, this.field844 + 768, -50, -10, -50);
            field843.method3137(var11, var9);
        }
        if (arg6 == null && this.field858 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1977(true);
        } else {
            var13 = arg6.method699(var11, arg7, arg1);
        }
        if (this.field858 >= 0) {
            var13 = var13.method1976(arg2, arg3, arg4, arg5, false, this.field858);
        }
        return var13;
    }

    @ObfuscatedName("az.x(III)Lcl;")
    public final class93 method648(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field847 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field869 == null) {
                return null;
            }
            boolean var4 = this.field837;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field869.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field869[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field841.method3141((long) var7);
                if (var3 == null) {
                    var3 = class93.method1922(Statics.field839, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1886();
                    }
                    field841.method3137(var3, (long) var7);
                }
                if (var5 > 1) {
                    field840[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field840, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field847.length; var9++) {
                if (this.field847[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field869[var8];
            boolean var11 = this.field837 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field841.method3141((long) var10);
            if (var3 == null) {
                var3 = class93.method1922(Statics.field839, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1886();
                }
                field841.method3137(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field880 == 128 && this.field875 == 128 && this.field872 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field848 == 0 && this.field845 == 0 && this.field860 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field849 == null, this.field851 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1957(256);
            var14.method1883(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1876();
        } else if (var15 == 2) {
            var14.method1881();
        } else if (var15 == 3) {
            var14.method1882();
        }
        if (this.field849 != null) {
            for (int var16 = 0; var16 < this.field849.length; var16++) {
                var14.method1925(this.field849[var16], this.field850[var16]);
            }
        }
        if (this.field851 != null) {
            for (int var17 = 0; var17 < this.field851.length; var17++) {
                var14.method1885(this.field851[var17], this.field852[var17]);
            }
        }
        if (var12) {
            var14.method1887(this.field880, this.field875, this.field872);
        }
        if (var13) {
            var14.method1883(this.field848, this.field845, this.field860);
        }
        return var14;
    }

    @ObfuscatedName("az.n(I)Laz;")
    public final class36 method636() {
        int var1 = -1;
        if (this.field853 != -1) {
            var1 = class154.method2548(this.field853);
        } else if (this.field881 != -1) {
            var1 = class154.field2665[this.field881];
        }
        return var1 < 0 || var1 >= this.field879.length || this.field879[var1] == -1 ? null : method147(this.field879[var1]);
    }

    @ObfuscatedName("az.d(B)Z")
    public boolean method637() {
        if (this.field879 == null) {
            return this.field882 != -1 || this.field886 != null;
        }
        for (int var1 = 0; var1 < this.field879.length; var1++) {
            if (this.field879[var1] != -1) {
                class36 var2 = method147(this.field879[var1]);
                if (var2.field882 != -1 || var2.field886 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

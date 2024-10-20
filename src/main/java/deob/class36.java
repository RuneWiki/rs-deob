package deob;

@ObfuscatedName("av")
public class class36 extends class181 {

    @ObfuscatedName("av.j")
    public static boolean field857 = false;

    @ObfuscatedName("av.h")
    public static class171 field841 = new class171(64);

    @ObfuscatedName("av.r")
    public static class171 field842 = new class171(500);

    @ObfuscatedName("av.e")
    public static class171 field855 = new class171(30);

    @ObfuscatedName("av.k")
    public static class171 field844 = new class171(30);

    @ObfuscatedName("av.b")
    public static class93[] field845 = new class93[4];

    @ObfuscatedName("av.n")
    public int field846;

    @ObfuscatedName("av.a")
    public int[] field847;

    @ObfuscatedName("av.q")
    public int[] field871;

    @ObfuscatedName("av.i")
    public String field849 = "null";

    @ObfuscatedName("av.f")
    public short[] field850;

    @ObfuscatedName("av.o")
    public short[] field851;

    @ObfuscatedName("av.t")
    public short[] field838;

    @ObfuscatedName("av.c")
    public short[] field848;

    @ObfuscatedName("av.d")
    public int field878 = 1;

    @ObfuscatedName("av.g")
    public int field854 = 1;

    @ObfuscatedName("av.s")
    public int field856 = 2;

    @ObfuscatedName("av.m")
    public boolean field873 = true;

    @ObfuscatedName("av.v")
    public int field858 = -1;

    @ObfuscatedName("av.u")
    public int field863 = -1;

    @ObfuscatedName("av.p")
    public boolean field860 = false;

    @ObfuscatedName("av.l")
    public boolean field861 = false;

    @ObfuscatedName("av.w")
    public int field862 = -1;

    @ObfuscatedName("av.x")
    public int field859 = 16;

    @ObfuscatedName("av.aj")
    public int field864 = 0;

    @ObfuscatedName("av.al")
    public int field865 = 0;

    @ObfuscatedName("av.af")
    public String[] field852 = new String[5];

    @ObfuscatedName("av.ai")
    public int field867 = -1;

    @ObfuscatedName("av.ak")
    public int field839 = -1;

    @ObfuscatedName("av.ae")
    public boolean field869 = false;

    @ObfuscatedName("av.ag")
    public boolean field870 = true;

    @ObfuscatedName("av.ar")
    public int field853 = 128;

    @ObfuscatedName("av.an")
    public int field872 = 128;

    @ObfuscatedName("av.av")
    public int field866 = 128;

    @ObfuscatedName("av.aw")
    public int field874 = 0;

    @ObfuscatedName("av.aq")
    public int field875 = 0;

    @ObfuscatedName("av.ad")
    public int field843 = 0;

    @ObfuscatedName("av.at")
    public boolean field877 = false;

    @ObfuscatedName("av.aa")
    public boolean field889 = false;

    @ObfuscatedName("av.ay")
    public int field879 = -1;

    @ObfuscatedName("av.am")
    public int[] field880;

    @ObfuscatedName("av.az")
    public int field881 = -1;

    @ObfuscatedName("av.au")
    public int field882 = -1;

    @ObfuscatedName("av.ac")
    public int field883 = -1;

    @ObfuscatedName("av.ab")
    public int field884 = 0;

    @ObfuscatedName("av.ao")
    public int field885 = 0;

    @ObfuscatedName("av.ah")
    public int field886 = 0;

    @ObfuscatedName("av.ap")
    public int[] field887;

    @ObfuscatedName("ct.j(Leg;Leg;ZI)V")
    public static void method1891(class146 arg0, class146 arg1, boolean arg2) {
        Statics.field876 = arg0;
        Statics.field840 = arg1;
        field857 = arg2;
    }

    @ObfuscatedName("cs.z(II)Lav;")
    public static class36 method2079(int arg0) {
        class36 var1 = (class36) field841.method3171((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field876.method2739(6, arg0);
        class36 var3 = new class36();
        var3.field846 = arg0;
        if (var2 != null) {
            var3.method624(new class107(var2));
        }
        var3.method623();
        if (var3.field889) {
            var3.field856 = 0;
            var3.field873 = false;
        }
        field841.method3173(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.y(I)V")
    public void method623() {
        if (this.field858 == -1) {
            this.field858 = 0;
            if (this.field847 != null && (this.field871 == null || this.field871[0] == 10)) {
                this.field858 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field852[var1] != null) {
                    this.field858 = 1;
                }
            }
        }
        if (this.field879 == -1) {
            this.field879 = this.field856 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("av.h(Lde;S)V")
    public void method624(class107 arg0) {
        while (true) {
            int var2 = arg0.method2130();
            if (var2 == 0) {
                return;
            }
            this.method625(arg0, var2);
        }
    }

    @ObfuscatedName("av.r(Lde;II)V")
    public void method625(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2130();
            if (var3 > 0) {
                if (this.field847 == null || field857) {
                    this.field871 = new int[var3];
                    this.field847 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field847[var4] = arg0.method2132();
                        this.field871[var4] = arg0.method2130();
                    }
                } else {
                    arg0.field1847 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field849 = arg0.method2138();
        } else if (arg1 == 5) {
            int var5 = arg0.method2130();
            if (var5 > 0) {
                if (this.field847 == null || field857) {
                    this.field871 = null;
                    this.field847 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field847[var6] = arg0.method2132();
                    }
                } else {
                    arg0.field1847 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field878 = arg0.method2130();
        } else if (arg1 == 15) {
            this.field854 = arg0.method2130();
        } else if (arg1 == 17) {
            this.field856 = 0;
            this.field873 = false;
        } else if (arg1 == 18) {
            this.field873 = false;
        } else if (arg1 == 19) {
            this.field858 = arg0.method2130();
        } else if (arg1 == 21) {
            this.field863 = 0;
        } else if (arg1 == 22) {
            this.field860 = true;
        } else if (arg1 == 23) {
            this.field861 = true;
        } else if (arg1 == 24) {
            this.field862 = arg0.method2132();
            if (this.field862 == 65535) {
                this.field862 = -1;
            }
        } else if (arg1 == 27) {
            this.field856 = 1;
        } else if (arg1 == 28) {
            this.field859 = arg0.method2130();
        } else if (arg1 == 29) {
            this.field864 = arg0.method2131();
        } else if (arg1 == 39) {
            this.field865 = arg0.method2131() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field852[arg1 - 30] = arg0.method2138();
            if (this.field852[arg1 - 30].equalsIgnoreCase(class142.field2158)) {
                this.field852[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2130();
            this.field850 = new short[var7];
            this.field851 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field850[var8] = (short) arg0.method2132();
                this.field851[var8] = (short) arg0.method2132();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2130();
            this.field838 = new short[var9];
            this.field848 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field838[var10] = (short) arg0.method2132();
                this.field848[var10] = (short) arg0.method2132();
            }
        } else if (arg1 == 60) {
            this.field867 = arg0.method2132();
        } else if (arg1 == 62) {
            this.field869 = true;
        } else if (arg1 == 64) {
            this.field870 = false;
        } else if (arg1 == 65) {
            this.field853 = arg0.method2132();
        } else if (arg1 == 66) {
            this.field872 = arg0.method2132();
        } else if (arg1 == 67) {
            this.field866 = arg0.method2132();
        } else if (arg1 == 68) {
            this.field839 = arg0.method2132();
        } else if (arg1 == 69) {
            arg0.method2130();
        } else if (arg1 == 70) {
            this.field874 = arg0.method2133();
        } else if (arg1 == 71) {
            this.field875 = arg0.method2133();
        } else if (arg1 == 72) {
            this.field843 = arg0.method2133();
        } else if (arg1 == 73) {
            this.field877 = true;
        } else if (arg1 == 74) {
            this.field889 = true;
        } else if (arg1 == 75) {
            this.field879 = arg0.method2130();
        } else if (arg1 == 77) {
            this.field881 = arg0.method2132();
            if (this.field881 == 65535) {
                this.field881 = -1;
            }
            this.field882 = arg0.method2132();
            if (this.field882 == 65535) {
                this.field882 = -1;
            }
            int var11 = arg0.method2130();
            this.field880 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field880[var12] = arg0.method2132();
                if (this.field880[var12] == 65535) {
                    this.field880[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field883 = arg0.method2132();
            this.field884 = arg0.method2130();
        } else if (arg1 == 79) {
            this.field885 = arg0.method2132();
            this.field886 = arg0.method2132();
            this.field884 = arg0.method2130();
            int var13 = arg0.method2130();
            this.field887 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field887[var14] = arg0.method2132();
            }
        } else if (arg1 == 81) {
            this.field863 = arg0.method2130() * 256;
        }
    }

    @ObfuscatedName("av.e(II)Z")
    public final boolean method646(int arg0) {
        if (this.field871 != null) {
            for (int var4 = 0; var4 < this.field871.length; var4++) {
                if (this.field871[var4] == arg0) {
                    return Statics.field840.method2741(this.field847[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field847 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field847.length; var3++) {
                var2 &= Statics.field840.method2741(this.field847[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("av.k(I)Z")
    public final boolean method659() {
        if (this.field847 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field847.length; var2++) {
            var1 &= Statics.field840.method2741(this.field847[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("av.b(II[[IIIII)Lbv;")
    public final class78 method628(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field871 == null) {
            var7 = (long) ((this.field846 << 10) + arg1);
        } else {
            var7 = (long) ((this.field846 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field855.method3171(var7);
        if (var9 == null) {
            class93 var10 = this.method622(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field860) {
                var10.field1594 = (short) (this.field864 + 64);
                var10.field1623 = (short) (this.field865 + 768);
                var10.method1894();
                var9 = var10;
            } else {
                var9 = var10.method1914(this.field864 + 64, this.field865 + 768, -50, -10, -50);
            }
            field855.method3173(var9, var7);
        }
        if (this.field860) {
            var9 = ((class93) var9).method1899();
        }
        if (this.field863 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method1984(arg2, arg3, arg4, arg5, true, this.field863);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1900(arg2, arg3, arg4, arg5, true, this.field863);
            }
        }
        return var9;
    }

    @ObfuscatedName("av.n(II[[IIIII)Lcl;")
    public final class98 method629(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field871 == null) {
            var7 = (long) ((this.field846 << 10) + arg1);
        } else {
            var7 = (long) ((this.field846 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field844.method3171(var7);
        if (var9 == null) {
            class93 var10 = this.method622(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1914(this.field864 + 64, this.field865 + 768, -50, -10, -50);
            field844.method3173(var9, var7);
        }
        if (this.field863 >= 0) {
            var9 = var9.method1984(arg2, arg3, arg4, arg5, true, this.field863);
        }
        return var9;
    }

    @ObfuscatedName("av.a(II[[IIIILaq;II)Lcl;")
    public final class98 method630(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field871 == null) {
            var9 = (long) ((this.field846 << 10) + arg1);
        } else {
            var9 = (long) ((this.field846 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field844.method3171(var9);
        if (var11 == null) {
            class93 var12 = this.method622(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1914(this.field864 + 64, this.field865 + 768, -50, -10, -50);
            field844.method3173(var11, var9);
        }
        if (arg6 == null && this.field863 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1985(true);
        } else {
            var13 = arg6.method687(var11, arg7, arg1);
        }
        if (this.field863 >= 0) {
            var13 = var13.method1984(arg2, arg3, arg4, arg5, false, this.field863);
        }
        return var13;
    }

    @ObfuscatedName("av.q(III)Lcx;")
    public final class93 method622(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field871 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field847 == null) {
                return null;
            }
            boolean var4 = this.field869;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field847.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field847[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field842.method3171((long) var7);
                if (var3 == null) {
                    var3 = class93.method1938(Statics.field840, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1955();
                    }
                    field842.method3173(var3, (long) var7);
                }
                if (var5 > 1) {
                    field845[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field845, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field871.length; var9++) {
                if (this.field871[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field847[var8];
            boolean var11 = this.field869 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field842.method3171((long) var10);
            if (var3 == null) {
                var3 = class93.method1938(Statics.field840, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1955();
                }
                field842.method3173(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field853 == 128 && this.field872 == 128 && this.field866 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field874 == 0 && this.field875 == 0 && this.field843 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field850 == null, this.field838 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1897(256);
            var14.method1905(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1910();
        } else if (var15 == 2) {
            var14.method1903();
        } else if (var15 == 3) {
            var14.method1912();
        }
        if (this.field850 != null) {
            for (int var16 = 0; var16 < this.field850.length; var16++) {
                var14.method1906(this.field850[var16], this.field851[var16]);
            }
        }
        if (this.field838 != null) {
            for (int var17 = 0; var17 < this.field838.length; var17++) {
                var14.method1907(this.field838[var17], this.field848[var17]);
            }
        }
        if (var12) {
            var14.method1909(this.field853, this.field872, this.field866);
        }
        if (var13) {
            var14.method1905(this.field874, this.field875, this.field843);
        }
        return var14;
    }

    @ObfuscatedName("av.i(B)Lav;")
    public final class36 method626() {
        int var1 = -1;
        if (this.field881 != -1) {
            var1 = class154.method480(this.field881);
        } else if (this.field882 != -1) {
            var1 = class154.field2664[this.field882];
        }
        return var1 < 0 || var1 >= this.field880.length || this.field880[var1] == -1 ? null : method2079(this.field880[var1]);
    }

    @ObfuscatedName("ec.f(B)V")
    public static void method2709() {
        field841.method3170();
        field842.method3170();
        field855.method3170();
        field844.method3170();
    }

    @ObfuscatedName("av.o(S)Z")
    public boolean method637() {
        if (this.field880 == null) {
            return this.field883 != -1 || this.field887 != null;
        }
        for (int var1 = 0; var1 < this.field880.length; var1++) {
            if (this.field880[var1] != -1) {
                class36 var2 = method2079(this.field880[var1]);
                if (var2.field883 != -1 || var2.field887 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

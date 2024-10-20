package deob;

@ObfuscatedName("ap")
public class class37 extends class187 {

    @ObfuscatedName("ap.v")
    public static boolean field876 = false;

    @ObfuscatedName("ap.j")
    public static class176 field850 = new class176(64);

    @ObfuscatedName("ap.l")
    public static class176 field842 = new class176(500);

    @ObfuscatedName("ap.g")
    public static class176 field879 = new class176(30);

    @ObfuscatedName("ap.k")
    public static class176 field844 = new class176(30);

    @ObfuscatedName("ap.p")
    public static class94[] field839 = new class94[4];

    @ObfuscatedName("ap.y")
    public int field882;

    @ObfuscatedName("ap.m")
    public int[] field847;

    @ObfuscatedName("ap.o")
    public int[] field848;

    @ObfuscatedName("ap.c")
    public String field849 = "null";

    @ObfuscatedName("ap.r")
    public short[] field846;

    @ObfuscatedName("ap.s")
    public short[] field851;

    @ObfuscatedName("ap.n")
    public short[] field852;

    @ObfuscatedName("ap.q")
    public short[] field853;

    @ObfuscatedName("ap.e")
    public int field854 = 1;

    @ObfuscatedName("ap.d")
    public int field875 = 1;

    @ObfuscatedName("ap.b")
    public int field856 = 2;

    @ObfuscatedName("ap.a")
    public boolean field843 = true;

    @ObfuscatedName("ap.i")
    public int field855 = -1;

    @ObfuscatedName("ap.w")
    public int field845 = -1;

    @ObfuscatedName("ap.x")
    public boolean field860 = false;

    @ObfuscatedName("ap.h")
    public boolean field841 = false;

    @ObfuscatedName("ap.z")
    public int field861 = -1;

    @ObfuscatedName("ap.u")
    public int field863 = 16;

    @ObfuscatedName("ap.ad")
    public int field864 = 0;

    @ObfuscatedName("ap.ah")
    public int field865 = 0;

    @ObfuscatedName("ap.ao")
    public String[] field866 = new String[5];

    @ObfuscatedName("ap.as")
    public int field862 = -1;

    @ObfuscatedName("ap.at")
    public int field868 = -1;

    @ObfuscatedName("ap.ai")
    public boolean field869 = false;

    @ObfuscatedName("ap.aj")
    public boolean field877 = true;

    @ObfuscatedName("ap.aq")
    public int field871 = 128;

    @ObfuscatedName("ap.an")
    public int field872 = 128;

    @ObfuscatedName("ap.ac")
    public int field873 = 128;

    @ObfuscatedName("ap.ap")
    public int field874 = 0;

    @ObfuscatedName("ap.az")
    public int field858 = 0;

    @ObfuscatedName("ap.ax")
    public int field883 = 0;

    @ObfuscatedName("ap.al")
    public boolean field859 = false;

    @ObfuscatedName("ap.am")
    public boolean field878 = false;

    @ObfuscatedName("ap.av")
    public int field870 = -1;

    @ObfuscatedName("ap.ar")
    public int[] field880;

    @ObfuscatedName("ap.ak")
    public int field881 = -1;

    @ObfuscatedName("ap.aw")
    public int field867 = -1;

    @ObfuscatedName("ap.ag")
    public int field889 = -1;

    @ObfuscatedName("ap.ay")
    public int field857 = 0;

    @ObfuscatedName("ap.af")
    public int field884 = 0;

    @ObfuscatedName("ap.au")
    public int field886 = 0;

    @ObfuscatedName("ap.aa")
    public int[] field887;

    @ObfuscatedName("t.v(II)Lap;")
    public static class37 method7(int arg0) {
        class37 var1 = (class37) field850.method3231((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2955.method2852(6, arg0);
        class37 var3 = new class37();
        var3.field882 = arg0;
        if (var2 != null) {
            var3.method685(new class110(var2));
        }
        var3.method656();
        if (var3.field878) {
            var3.field856 = 0;
            var3.field843 = false;
        }
        field850.method3228(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.t(B)V")
    public void method656() {
        if (this.field855 == -1) {
            this.field855 = 0;
            if (this.field847 != null && (this.field848 == null || this.field848[0] == 10)) {
                this.field855 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field866[var1] != null) {
                    this.field855 = 1;
                }
            }
        }
        if (this.field870 == -1) {
            this.field870 = this.field856 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ap.f(Ldp;I)V")
    public void method685(class110 arg0) {
        while (true) {
            int var2 = arg0.method2257();
            if (var2 == 0) {
                return;
            }
            this.method674(arg0, var2);
        }
    }

    @ObfuscatedName("ap.j(Ldp;II)V")
    public void method674(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2257();
            if (var3 > 0) {
                if (this.field847 == null || field876) {
                    this.field848 = new int[var3];
                    this.field847 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field847[var4] = arg0.method2194();
                        this.field848[var4] = arg0.method2257();
                    }
                } else {
                    arg0.field1847 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field849 = arg0.method2159();
        } else if (arg1 == 5) {
            int var5 = arg0.method2257();
            if (var5 > 0) {
                if (this.field847 == null || field876) {
                    this.field848 = null;
                    this.field847 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field847[var6] = arg0.method2194();
                    }
                } else {
                    arg0.field1847 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field854 = arg0.method2257();
        } else if (arg1 == 15) {
            this.field875 = arg0.method2257();
        } else if (arg1 == 17) {
            this.field856 = 0;
            this.field843 = false;
        } else if (arg1 == 18) {
            this.field843 = false;
        } else if (arg1 == 19) {
            this.field855 = arg0.method2257();
        } else if (arg1 == 21) {
            this.field845 = 0;
        } else if (arg1 == 22) {
            this.field860 = true;
        } else if (arg1 == 23) {
            this.field841 = true;
        } else if (arg1 == 24) {
            this.field861 = arg0.method2194();
            if (this.field861 == 65535) {
                this.field861 = -1;
            }
        } else if (arg1 == 27) {
            this.field856 = 1;
        } else if (arg1 == 28) {
            this.field863 = arg0.method2257();
        } else if (arg1 == 29) {
            this.field864 = arg0.method2162();
        } else if (arg1 == 39) {
            this.field865 = arg0.method2162() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field866[arg1 - 30] = arg0.method2159();
            if (this.field866[arg1 - 30].equalsIgnoreCase(class147.field2164)) {
                this.field866[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2257();
            this.field846 = new short[var7];
            this.field851 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field846[var8] = (short) arg0.method2194();
                this.field851[var8] = (short) arg0.method2194();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2257();
            this.field852 = new short[var9];
            this.field853 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field852[var10] = (short) arg0.method2194();
                this.field853[var10] = (short) arg0.method2194();
            }
        } else if (arg1 == 60) {
            this.field862 = arg0.method2194();
        } else if (arg1 == 62) {
            this.field869 = true;
        } else if (arg1 == 64) {
            this.field877 = false;
        } else if (arg1 == 65) {
            this.field871 = arg0.method2194();
        } else if (arg1 == 66) {
            this.field872 = arg0.method2194();
        } else if (arg1 == 67) {
            this.field873 = arg0.method2194();
        } else if (arg1 == 68) {
            this.field868 = arg0.method2194();
        } else if (arg1 == 69) {
            arg0.method2257();
        } else if (arg1 == 70) {
            this.field874 = arg0.method2308();
        } else if (arg1 == 71) {
            this.field858 = arg0.method2308();
        } else if (arg1 == 72) {
            this.field883 = arg0.method2308();
        } else if (arg1 == 73) {
            this.field859 = true;
        } else if (arg1 == 74) {
            this.field878 = true;
        } else if (arg1 == 75) {
            this.field870 = arg0.method2257();
        } else if (arg1 == 77) {
            this.field881 = arg0.method2194();
            if (this.field881 == 65535) {
                this.field881 = -1;
            }
            this.field867 = arg0.method2194();
            if (this.field867 == 65535) {
                this.field867 = -1;
            }
            int var11 = arg0.method2257();
            this.field880 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field880[var12] = arg0.method2194();
                if (this.field880[var12] == 65535) {
                    this.field880[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field889 = arg0.method2194();
            this.field857 = arg0.method2257();
        } else if (arg1 == 79) {
            this.field884 = arg0.method2194();
            this.field886 = arg0.method2194();
            this.field857 = arg0.method2257();
            int var13 = arg0.method2257();
            this.field887 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field887[var14] = arg0.method2194();
            }
        } else if (arg1 == 81) {
            this.field845 = arg0.method2257() * 256;
        }
    }

    @ObfuscatedName("ap.l(II)Z")
    public final boolean method659(int arg0) {
        if (this.field848 != null) {
            for (int var4 = 0; var4 < this.field848.length; var4++) {
                if (this.field848[var4] == arg0) {
                    return Statics.field840.method2786(this.field847[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field847 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field847.length; var3++) {
                var2 &= Statics.field840.method2786(this.field847[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ap.g(I)Z")
    public final boolean method660() {
        if (this.field847 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field847.length; var2++) {
            var1 &= Statics.field840.method2786(this.field847[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ap.k(II[[IIIII)Lcg;")
    public final class79 method661(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field848 == null) {
            var7 = (long) ((this.field882 << 10) + arg1);
        } else {
            var7 = (long) ((this.field882 << 10) + (arg0 << 3) + arg1);
        }
        class79 var9 = (class79) field879.method3231(var7);
        if (var9 == null) {
            class94 var10 = this.method664(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field860) {
                var10.field1586 = (short) (this.field864 + 64);
                var10.field1605 = (short) (this.field865 + 768);
                var10.method1914();
                var9 = var10;
            } else {
                var9 = var10.method1918(this.field864 + 64, this.field865 + 768, -50, -10, -50);
            }
            field879.method3228(var9, var7);
        }
        if (this.field860) {
            var9 = ((class94) var9).method1904();
        }
        if (this.field845 >= 0) {
            if (var9 instanceof class99) {
                var9 = ((class99) var9).method2058(arg2, arg3, arg4, arg5, true, this.field845);
            } else if (var9 instanceof class94) {
                var9 = ((class94) var9).method1951(arg2, arg3, arg4, arg5, true, this.field845);
            }
        }
        return var9;
    }

    @ObfuscatedName("ap.p(II[[IIIIB)Lcy;")
    public final class99 method662(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field848 == null) {
            var7 = (long) ((this.field882 << 10) + arg1);
        } else {
            var7 = (long) ((this.field882 << 10) + (arg0 << 3) + arg1);
        }
        class99 var9 = (class99) field844.method3231(var7);
        if (var9 == null) {
            class94 var10 = this.method664(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1918(this.field864 + 64, this.field865 + 768, -50, -10, -50);
            field844.method3228(var9, var7);
        }
        if (this.field845 >= 0) {
            var9 = var9.method2058(arg2, arg3, arg4, arg5, true, this.field845);
        }
        return var9;
    }

    @ObfuscatedName("ap.y(II[[IIIILax;IB)Lcy;")
    public final class99 method663(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7) {
        long var9;
        if (this.field848 == null) {
            var9 = (long) ((this.field882 << 10) + arg1);
        } else {
            var9 = (long) ((this.field882 << 10) + (arg0 << 3) + arg1);
        }
        class99 var11 = (class99) field844.method3231(var9);
        if (var11 == null) {
            class94 var12 = this.method664(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1918(this.field864 + 64, this.field865 + 768, -50, -10, -50);
            field844.method3228(var11, var9);
        }
        if (arg6 == null && this.field845 == -1) {
            return var11;
        }
        class99 var13;
        if (arg6 == null) {
            var13 = var11.method2004(true);
        } else {
            var13 = arg6.method749(var11, arg7, arg1);
        }
        if (this.field845 >= 0) {
            var13 = var13.method2058(arg2, arg3, arg4, arg5, false, this.field845);
        }
        return var13;
    }

    @ObfuscatedName("ap.m(IIB)Lcu;")
    public final class94 method664(int arg0, int arg1) {
        class94 var3 = null;
        if (this.field848 == null) {
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
                var3 = (class94) field842.method3231((long) var7);
                if (var3 == null) {
                    var3 = class94.method1899(Statics.field840, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1912();
                    }
                    field842.method3228(var3, (long) var7);
                }
                if (var5 > 1) {
                    field839[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class94(field839, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field848.length; var9++) {
                if (this.field848[var9] == arg0) {
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
            var3 = (class94) field842.method3231((long) var10);
            if (var3 == null) {
                var3 = class94.method1899(Statics.field840, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1912();
                }
                field842.method3228(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field871 == 128 && this.field872 == 128 && this.field873 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field874 == 0 && this.field858 == 0 && this.field883 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class94 var14 = new class94(var3, arg1 == 0 && !var12 && !var13, this.field846 == null, this.field852 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1909(256);
            var14.method1910(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1906();
        } else if (var15 == 2) {
            var14.method1961();
        } else if (var15 == 3) {
            var14.method1908();
        }
        if (this.field846 != null) {
            for (int var16 = 0; var16 < this.field846.length; var16++) {
                var14.method1976(this.field846[var16], this.field851[var16]);
            }
        }
        if (this.field852 != null) {
            for (int var17 = 0; var17 < this.field852.length; var17++) {
                var14.method1981(this.field852[var17], this.field853[var17]);
            }
        }
        if (var12) {
            var14.method1913(this.field871, this.field872, this.field873);
        }
        if (var13) {
            var14.method1910(this.field874, this.field858, this.field883);
        }
        return var14;
    }

    @ObfuscatedName("ap.o(I)Lap;")
    public final class37 method665() {
        int var1 = -1;
        if (this.field881 != -1) {
            var1 = class159.method127(this.field881);
        } else if (this.field867 != -1) {
            var1 = class159.field2680[this.field867];
        }
        return var1 < 0 || var1 >= this.field880.length || this.field880[var1] == -1 ? null : method7(this.field880[var1]);
    }

    @ObfuscatedName("ap.c(B)Z")
    public boolean method666() {
        if (this.field880 == null) {
            return this.field889 != -1 || this.field887 != null;
        }
        for (int var1 = 0; var1 < this.field880.length; var1++) {
            if (this.field880[var1] != -1) {
                class37 var2 = method7(this.field880[var1]);
                if (var2.field889 != -1 || var2.field887 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

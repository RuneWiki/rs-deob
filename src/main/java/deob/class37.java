package deob;

@ObfuscatedName("at")
public class class37 extends class187 {

    @ObfuscatedName("at.b")
    public static boolean field876 = false;

    @ObfuscatedName("at.k")
    public static class176 field890 = new class176(64);

    @ObfuscatedName("at.h")
    public static class176 field843 = new class176(500);

    @ObfuscatedName("at.p")
    public static class176 field877 = new class176(30);

    @ObfuscatedName("at.n")
    public static class176 field875 = new class176(30);

    @ObfuscatedName("at.o")
    public static class94[] field846 = new class94[4];

    @ObfuscatedName("at.g")
    public int field845;

    @ObfuscatedName("at.z")
    public int[] field847;

    @ObfuscatedName("at.t")
    public int[] field849;

    @ObfuscatedName("at.y")
    public String field850 = "null";

    @ObfuscatedName("at.w")
    public short[] field851;

    @ObfuscatedName("at.x")
    public short[] field852;

    @ObfuscatedName("at.v")
    public short[] field884;

    @ObfuscatedName("at.q")
    public short[] field854;

    @ObfuscatedName("at.f")
    public int field855 = 1;

    @ObfuscatedName("at.s")
    public int field856 = 1;

    @ObfuscatedName("at.a")
    public int field857 = 2;

    @ObfuscatedName("at.m")
    public boolean field858 = true;

    @ObfuscatedName("at.c")
    public int field848 = -1;

    @ObfuscatedName("at.j")
    public int field879 = -1;

    @ObfuscatedName("at.d")
    public boolean field859 = false;

    @ObfuscatedName("at.l")
    public boolean field862 = false;

    @ObfuscatedName("at.u")
    public int field863 = -1;

    @ObfuscatedName("at.r")
    public int field864 = 16;

    @ObfuscatedName("at.an")
    public int field865 = 0;

    @ObfuscatedName("at.ao")
    public int field866 = 0;

    @ObfuscatedName("at.ah")
    public String[] field867 = new String[5];

    @ObfuscatedName("at.ai")
    public int field844 = -1;

    @ObfuscatedName("at.aa")
    public int field869 = -1;

    @ObfuscatedName("at.ag")
    public boolean field870 = false;

    @ObfuscatedName("at.ar")
    public boolean field871 = true;

    @ObfuscatedName("at.al")
    public int field874 = 128;

    @ObfuscatedName("at.ae")
    public int field873 = 128;

    @ObfuscatedName("at.ak")
    public int field841 = 128;

    @ObfuscatedName("at.at")
    public int field861 = 0;

    @ObfuscatedName("at.am")
    public int field872 = 0;

    @ObfuscatedName("at.aw")
    public int field886 = 0;

    @ObfuscatedName("at.as")
    public boolean field878 = false;

    @ObfuscatedName("at.aq")
    public boolean field868 = false;

    @ObfuscatedName("at.ac")
    public int field880 = -1;

    @ObfuscatedName("at.aj")
    public int[] field881;

    @ObfuscatedName("at.av")
    public int field882 = -1;

    @ObfuscatedName("at.ax")
    public int field883 = -1;

    @ObfuscatedName("at.ap")
    public int field860 = -1;

    @ObfuscatedName("at.af")
    public int field885 = 0;

    @ObfuscatedName("at.az")
    public int field853 = 0;

    @ObfuscatedName("at.ay")
    public int field887 = 0;

    @ObfuscatedName("at.au")
    public int[] field888;

    @ObfuscatedName("df.b(Lex;Lex;ZI)V")
    public static void method2412(class151 arg0, class151 arg1, boolean arg2) {
        Statics.field840 = arg0;
        Statics.field839 = arg1;
        field876 = arg2;
    }

    @ObfuscatedName("fv.e(II)Lat;")
    public static class37 method2940(int arg0) {
        class37 var1 = (class37) field890.method3218((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field840.method2761(6, arg0);
        class37 var3 = new class37();
        var3.field845 = arg0;
        if (var2 != null) {
            var3.method650(new class110(var2));
        }
        var3.method648();
        if (var3.field868) {
            var3.field857 = 0;
            var3.field858 = false;
        }
        field890.method3220(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.i(I)V")
    public void method648() {
        if (this.field848 == -1) {
            this.field848 = 0;
            if (this.field847 != null && (this.field849 == null || this.field849[0] == 10)) {
                this.field848 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field867[var1] != null) {
                    this.field848 = 1;
                }
            }
        }
        if (this.field880 == -1) {
            this.field880 = this.field857 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("at.k(Ldc;I)V")
    public void method650(class110 arg0) {
        while (true) {
            int var2 = arg0.method2142();
            if (var2 == 0) {
                return;
            }
            this.method676(arg0, var2);
        }
    }

    @ObfuscatedName("at.h(Ldc;II)V")
    public void method676(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2142();
            if (var3 > 0) {
                if (this.field847 == null || field876) {
                    this.field849 = new int[var3];
                    this.field847 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field847[var4] = arg0.method2292();
                        this.field849[var4] = arg0.method2142();
                    }
                } else {
                    arg0.field1855 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field850 = arg0.method2150();
        } else if (arg1 == 5) {
            int var5 = arg0.method2142();
            if (var5 > 0) {
                if (this.field847 == null || field876) {
                    this.field849 = null;
                    this.field847 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field847[var6] = arg0.method2292();
                    }
                } else {
                    arg0.field1855 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field855 = arg0.method2142();
        } else if (arg1 == 15) {
            this.field856 = arg0.method2142();
        } else if (arg1 == 17) {
            this.field857 = 0;
            this.field858 = false;
        } else if (arg1 == 18) {
            this.field858 = false;
        } else if (arg1 == 19) {
            this.field848 = arg0.method2142();
        } else if (arg1 == 21) {
            this.field879 = 0;
        } else if (arg1 == 22) {
            this.field859 = true;
        } else if (arg1 == 23) {
            this.field862 = true;
        } else if (arg1 == 24) {
            this.field863 = arg0.method2292();
            if (this.field863 == 65535) {
                this.field863 = -1;
            }
        } else if (arg1 == 27) {
            this.field857 = 1;
        } else if (arg1 == 28) {
            this.field864 = arg0.method2142();
        } else if (arg1 == 29) {
            this.field865 = arg0.method2294();
        } else if (arg1 == 39) {
            this.field866 = arg0.method2294();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field867[arg1 - 30] = arg0.method2150();
            if (this.field867[arg1 - 30].equalsIgnoreCase(class147.field2178)) {
                this.field867[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2142();
            this.field851 = new short[var7];
            this.field852 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field851[var8] = (short) arg0.method2292();
                this.field852[var8] = (short) arg0.method2292();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2142();
            this.field884 = new short[var9];
            this.field854 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field884[var10] = (short) arg0.method2292();
                this.field854[var10] = (short) arg0.method2292();
            }
        } else if (arg1 == 60) {
            this.field844 = arg0.method2292();
        } else if (arg1 == 62) {
            this.field870 = true;
        } else if (arg1 == 64) {
            this.field871 = false;
        } else if (arg1 == 65) {
            this.field874 = arg0.method2292();
        } else if (arg1 == 66) {
            this.field873 = arg0.method2292();
        } else if (arg1 == 67) {
            this.field841 = arg0.method2292();
        } else if (arg1 == 68) {
            this.field869 = arg0.method2292();
        } else if (arg1 == 69) {
            arg0.method2142();
        } else if (arg1 == 70) {
            this.field861 = arg0.method2256();
        } else if (arg1 == 71) {
            this.field872 = arg0.method2256();
        } else if (arg1 == 72) {
            this.field886 = arg0.method2256();
        } else if (arg1 == 73) {
            this.field878 = true;
        } else if (arg1 == 74) {
            this.field868 = true;
        } else if (arg1 == 75) {
            this.field880 = arg0.method2142();
        } else if (arg1 == 77) {
            this.field882 = arg0.method2292();
            if (this.field882 == 65535) {
                this.field882 = -1;
            }
            this.field883 = arg0.method2292();
            if (this.field883 == 65535) {
                this.field883 = -1;
            }
            int var11 = arg0.method2142();
            this.field881 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field881[var12] = arg0.method2292();
                if (this.field881[var12] == 65535) {
                    this.field881[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field860 = arg0.method2292();
            this.field885 = arg0.method2142();
        } else if (arg1 == 79) {
            this.field853 = arg0.method2292();
            this.field887 = arg0.method2292();
            this.field885 = arg0.method2142();
            int var13 = arg0.method2142();
            this.field888 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field888[var14] = arg0.method2292();
            }
        } else if (arg1 == 81) {
            this.field879 = arg0.method2142() * 256;
        }
    }

    @ObfuscatedName("at.p(II)Z")
    public final boolean method651(int arg0) {
        if (this.field849 != null) {
            for (int var4 = 0; var4 < this.field849.length; var4++) {
                if (this.field849[var4] == arg0) {
                    return Statics.field839.method2824(this.field847[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field847 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field847.length; var3++) {
                var2 &= Statics.field839.method2824(this.field847[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("at.n(B)Z")
    public final boolean method652() {
        if (this.field847 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field847.length; var2++) {
            var1 &= Statics.field839.method2824(this.field847[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("at.o(II[[IIIII)Lci;")
    public final class79 method653(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field849 == null) {
            var7 = (long) ((this.field845 << 10) + arg1);
        } else {
            var7 = (long) ((this.field845 << 10) + (arg0 << 3) + arg1);
        }
        class79 var9 = (class79) field877.method3218(var7);
        if (var9 == null) {
            class94 var10 = this.method655(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field859) {
                var10.field1618 = (short) (this.field865 + 64);
                var10.field1619 = (short) (this.field866 * 25 + 768);
                var10.method1891();
                var9 = var10;
            } else {
                var9 = var10.method1940(this.field865 + 64, this.field866 * 25 + 768, -50, -10, -50);
            }
            field877.method3220(var9, var7);
        }
        if (this.field859) {
            var9 = ((class94) var9).method1888();
        }
        if (this.field879 >= 0) {
            if (var9 instanceof class99) {
                var9 = ((class99) var9).method1972(arg2, arg3, arg4, arg5, true, this.field879);
            } else if (var9 instanceof class94) {
                var9 = ((class94) var9).method1919(arg2, arg3, arg4, arg5, true, this.field879);
            }
        }
        return var9;
    }

    @ObfuscatedName("at.g(II[[IIIII)Lcr;")
    public final class99 method654(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field849 == null) {
            var7 = (long) ((this.field845 << 10) + arg1);
        } else {
            var7 = (long) ((this.field845 << 10) + (arg0 << 3) + arg1);
        }
        class99 var9 = (class99) field875.method3218(var7);
        if (var9 == null) {
            class94 var10 = this.method655(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1940(this.field865 + 64, this.field866 * 25 + 768, -50, -10, -50);
            field875.method3220(var9, var7);
        }
        if (this.field879 >= 0) {
            var9 = var9.method1972(arg2, arg3, arg4, arg5, true, this.field879);
        }
        return var9;
    }

    @ObfuscatedName("at.z(II[[IIIILaw;II)Lcr;")
    public final class99 method661(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7) {
        long var9;
        if (this.field849 == null) {
            var9 = (long) ((this.field845 << 10) + arg1);
        } else {
            var9 = (long) ((this.field845 << 10) + (arg0 << 3) + arg1);
        }
        class99 var11 = (class99) field875.method3218(var9);
        if (var11 == null) {
            class94 var12 = this.method655(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1940(this.field865 + 64, this.field866 * 25 + 768, -50, -10, -50);
            field875.method3220(var11, var9);
        }
        if (arg6 == null && this.field879 == -1) {
            return var11;
        }
        class99 var13;
        if (arg6 == null) {
            var13 = var11.method2008(true);
        } else {
            var13 = arg6.method721(var11, arg7, arg1);
        }
        if (this.field879 >= 0) {
            var13 = var13.method1972(arg2, arg3, arg4, arg5, false, this.field879);
        }
        return var13;
    }

    @ObfuscatedName("at.t(III)Lcs;")
    public final class94 method655(int arg0, int arg1) {
        class94 var3 = null;
        if (this.field849 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field847 == null) {
                return null;
            }
            boolean var4 = this.field870;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field847.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field847[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class94) field843.method3218((long) var7);
                if (var3 == null) {
                    var3 = class94.method1874(Statics.field839, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1922();
                    }
                    field843.method3220(var3, (long) var7);
                }
                if (var5 > 1) {
                    field846[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class94(field846, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field849.length; var9++) {
                if (this.field849[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field847[var8];
            boolean var11 = this.field870 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class94) field843.method3218((long) var10);
            if (var3 == null) {
                var3 = class94.method1874(Statics.field839, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1922();
                }
                field843.method3220(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field874 == 128 && this.field873 == 128 && this.field841 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field861 == 0 && this.field872 == 0 && this.field886 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class94 var14 = new class94(var3, arg1 == 0 && !var12 && !var13, this.field851 == null, this.field884 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1877(256);
            var14.method1932(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1882();
        } else if (var15 == 2) {
            var14.method1883();
        } else if (var15 == 3) {
            var14.method1884();
        }
        if (this.field851 != null) {
            for (int var16 = 0; var16 < this.field851.length; var16++) {
                var14.method1879(this.field851[var16], this.field852[var16]);
            }
        }
        if (this.field884 != null) {
            for (int var17 = 0; var17 < this.field884.length; var17++) {
                var14.method1892(this.field884[var17], this.field854[var17]);
            }
        }
        if (var12) {
            var14.method1890(this.field874, this.field873, this.field841);
        }
        if (var13) {
            var14.method1932(this.field861, this.field872, this.field886);
        }
        return var14;
    }

    @ObfuscatedName("at.y(I)Lat;")
    public final class37 method656() {
        int var1 = -1;
        if (this.field882 != -1) {
            var1 = class159.method2741(this.field882);
        } else if (this.field883 != -1) {
            var1 = class159.field2692[this.field883];
        }
        return var1 < 0 || var1 >= this.field881.length || this.field881[var1] == -1 ? null : method2940(this.field881[var1]);
    }

    @ObfuscatedName("a.w(I)V")
    public static void method463() {
        field890.method3231();
        field843.method3231();
        field877.method3231();
        field875.method3231();
    }

    @ObfuscatedName("at.x(B)Z")
    public boolean method668() {
        if (this.field881 == null) {
            return this.field860 != -1 || this.field888 != null;
        }
        for (int var1 = 0; var1 < this.field881.length; var1++) {
            if (this.field881[var1] != -1) {
                class37 var2 = method2940(this.field881[var1]);
                if (var2.field860 != -1 || var2.field888 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

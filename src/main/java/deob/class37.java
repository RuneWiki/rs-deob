package deob;

@ObfuscatedName("al")
public class class37 extends class185 {

    @ObfuscatedName("al.g")
    public static boolean field897 = false;

    @ObfuscatedName("al.b")
    public static class174 field852 = new class174(64);

    @ObfuscatedName("al.k")
    public static class174 field853 = new class174(500);

    @ObfuscatedName("al.c")
    public static class174 field867 = new class174(30);

    @ObfuscatedName("al.w")
    public static class174 field886 = new class174(30);

    @ObfuscatedName("al.l")
    public static class94[] field885 = new class94[4];

    @ObfuscatedName("al.n")
    public int field857;

    @ObfuscatedName("al.d")
    public int[] field858;

    @ObfuscatedName("al.h")
    public int[] field849;

    @ObfuscatedName("al.y")
    public String field860 = "null";

    @ObfuscatedName("al.p")
    public short[] field872;

    @ObfuscatedName("al.i")
    public short[] field862;

    @ObfuscatedName("al.s")
    public short[] field863;

    @ObfuscatedName("al.f")
    public short[] field875;

    @ObfuscatedName("al.u")
    public int field865 = 1;

    @ObfuscatedName("al.v")
    public int field866 = 1;

    @ObfuscatedName("al.r")
    public int field879 = 2;

    @ObfuscatedName("al.q")
    public boolean field868 = true;

    @ObfuscatedName("al.x")
    public int field869 = -1;

    @ObfuscatedName("al.t")
    public int field874 = -1;

    @ObfuscatedName("al.e")
    public boolean field871 = false;

    @ObfuscatedName("al.m")
    public boolean field882 = false;

    @ObfuscatedName("al.o")
    public int field873 = -1;

    @ObfuscatedName("al.a")
    public int field854 = 16;

    @ObfuscatedName("al.am")
    public int field892 = 0;

    @ObfuscatedName("al.ac")
    public int field876 = 0;

    @ObfuscatedName("al.ap")
    public String[] field877 = new String[5];

    @ObfuscatedName("al.aq")
    public int field878 = -1;

    @ObfuscatedName("al.az")
    public int field859 = -1;

    @ObfuscatedName("al.ae")
    public boolean field880 = false;

    @ObfuscatedName("al.at")
    public boolean field881 = true;

    @ObfuscatedName("al.as")
    public int field864 = 128;

    @ObfuscatedName("al.aj")
    public int field883 = 128;

    @ObfuscatedName("al.an")
    public int field856 = 128;

    @ObfuscatedName("al.al")
    public int field855 = 0;

    @ObfuscatedName("al.ag")
    public int field884 = 0;

    @ObfuscatedName("al.ah")
    public int field861 = 0;

    @ObfuscatedName("al.ar")
    public boolean field888 = false;

    @ObfuscatedName("al.aa")
    public boolean field889 = false;

    @ObfuscatedName("al.ax")
    public int field890 = -1;

    @ObfuscatedName("al.ay")
    public int[] field891;

    @ObfuscatedName("al.ao")
    public int field851 = -1;

    @ObfuscatedName("al.ad")
    public int field893 = -1;

    @ObfuscatedName("al.ab")
    public int field894 = -1;

    @ObfuscatedName("al.af")
    public int field895 = 0;

    @ObfuscatedName("al.aw")
    public int field896 = 0;

    @ObfuscatedName("al.ai")
    public int field870 = 0;

    @ObfuscatedName("al.ak")
    public int[] field898;

    @ObfuscatedName("ad.g(Lei;Lei;ZI)V")
    public static void method799(class149 arg0, class149 arg1, boolean arg2) {
        Statics.field850 = arg0;
        Statics.field887 = arg1;
        field897 = arg2;
    }

    @ObfuscatedName("gd.j(II)Lal;")
    public static class37 method3266(int arg0) {
        class37 var1 = (class37) field852.method3097((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field850.method2660(6, arg0);
        class37 var3 = new class37();
        var3.field857 = arg0;
        if (var2 != null) {
            var3.method650(new class108(var2));
        }
        var3.method608();
        if (var3.field889) {
            var3.field879 = 0;
            var3.field868 = false;
        }
        field852.method3099(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.z(I)V")
    public void method608() {
        if (this.field869 == -1) {
            this.field869 = 0;
            if (this.field858 != null && (this.field849 == null || this.field849[0] == 10)) {
                this.field869 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field877[var1] != null) {
                    this.field869 = 1;
                }
            }
        }
        if (this.field890 == -1) {
            this.field890 = this.field879 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("al.b(Ldf;I)V")
    public void method650(class108 arg0) {
        while (true) {
            int var2 = arg0.method2083();
            if (var2 == 0) {
                return;
            }
            this.method607(arg0, var2);
        }
    }

    @ObfuscatedName("al.k(Ldf;II)V")
    public void method607(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2083();
            if (var3 > 0) {
                if (this.field858 == null || field897) {
                    this.field849 = new int[var3];
                    this.field858 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field858[var4] = arg0.method2263();
                        this.field849[var4] = arg0.method2083();
                    }
                } else {
                    arg0.field1824 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field860 = arg0.method2091();
        } else if (arg1 == 5) {
            int var5 = arg0.method2083();
            if (var5 > 0) {
                if (this.field858 == null || field897) {
                    this.field849 = null;
                    this.field858 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field858[var6] = arg0.method2263();
                    }
                } else {
                    arg0.field1824 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field865 = arg0.method2083();
        } else if (arg1 == 15) {
            this.field866 = arg0.method2083();
        } else if (arg1 == 17) {
            this.field879 = 0;
            this.field868 = false;
        } else if (arg1 == 18) {
            this.field868 = false;
        } else if (arg1 == 19) {
            this.field869 = arg0.method2083();
        } else if (arg1 == 21) {
            this.field874 = 0;
        } else if (arg1 == 22) {
            this.field871 = true;
        } else if (arg1 == 23) {
            this.field882 = true;
        } else if (arg1 == 24) {
            this.field873 = arg0.method2263();
            if (this.field873 == 65535) {
                this.field873 = -1;
            }
        } else if (arg1 == 27) {
            this.field879 = 1;
        } else if (arg1 == 28) {
            this.field854 = arg0.method2083();
        } else if (arg1 == 29) {
            this.field892 = arg0.method2173();
        } else if (arg1 == 39) {
            this.field876 = arg0.method2173();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field877[arg1 - 30] = arg0.method2091();
            if (this.field877[arg1 - 30].equalsIgnoreCase(class145.field2151)) {
                this.field877[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2083();
            this.field872 = new short[var7];
            this.field862 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field872[var8] = (short) arg0.method2263();
                this.field862[var8] = (short) arg0.method2263();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2083();
            this.field863 = new short[var9];
            this.field875 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field863[var10] = (short) arg0.method2263();
                this.field875[var10] = (short) arg0.method2263();
            }
        } else if (arg1 == 60) {
            this.field878 = arg0.method2263();
        } else if (arg1 == 62) {
            this.field880 = true;
        } else if (arg1 == 64) {
            this.field881 = false;
        } else if (arg1 == 65) {
            this.field864 = arg0.method2263();
        } else if (arg1 == 66) {
            this.field883 = arg0.method2263();
        } else if (arg1 == 67) {
            this.field856 = arg0.method2263();
        } else if (arg1 == 68) {
            this.field859 = arg0.method2263();
        } else if (arg1 == 69) {
            arg0.method2083();
        } else if (arg1 == 70) {
            this.field855 = arg0.method2214();
        } else if (arg1 == 71) {
            this.field884 = arg0.method2214();
        } else if (arg1 == 72) {
            this.field861 = arg0.method2214();
        } else if (arg1 == 73) {
            this.field888 = true;
        } else if (arg1 == 74) {
            this.field889 = true;
        } else if (arg1 == 75) {
            this.field890 = arg0.method2083();
        } else if (arg1 == 77) {
            this.field851 = arg0.method2263();
            if (this.field851 == 65535) {
                this.field851 = -1;
            }
            this.field893 = arg0.method2263();
            if (this.field893 == 65535) {
                this.field893 = -1;
            }
            int var11 = arg0.method2083();
            this.field891 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field891[var12] = arg0.method2263();
                if (this.field891[var12] == 65535) {
                    this.field891[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field894 = arg0.method2263();
            this.field895 = arg0.method2083();
        } else if (arg1 == 79) {
            this.field896 = arg0.method2263();
            this.field870 = arg0.method2263();
            this.field895 = arg0.method2083();
            int var13 = arg0.method2083();
            this.field898 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field898[var14] = arg0.method2263();
            }
        } else if (arg1 == 81) {
            this.field874 = arg0.method2083() * 256;
        }
    }

    @ObfuscatedName("al.c(II)Z")
    public final boolean method617(int arg0) {
        if (this.field849 != null) {
            for (int var4 = 0; var4 < this.field849.length; var4++) {
                if (this.field849[var4] == arg0) {
                    return Statics.field887.method2712(this.field858[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field858 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field858.length; var3++) {
                var2 &= Statics.field887.method2712(this.field858[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("al.w(I)Z")
    public final boolean method609() {
        if (this.field858 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field858.length; var2++) {
            var1 &= Statics.field887.method2712(this.field858[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("al.l(II[[IIIII)Lca;")
    public final class79 method648(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field849 == null) {
            var7 = (long) ((this.field857 << 10) + arg1);
        } else {
            var7 = (long) ((this.field857 << 10) + (arg0 << 3) + arg1);
        }
        class79 var9 = (class79) field867.method3097(var7);
        if (var9 == null) {
            class94 var10 = this.method613(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field871) {
                var10.field1612 = (short) (this.field892 + 64);
                var10.field1611 = (short) (this.field876 * 25 + 768);
                var10.method1864();
                var9 = var10;
            } else {
                var9 = var10.method1917(this.field892 + 64, this.field876 * 25 + 768, -50, -10, -50);
            }
            field867.method3099(var9, var7);
        }
        if (this.field871) {
            var9 = ((class94) var9).method1853();
        }
        if (this.field874 >= 0) {
            if (var9 instanceof class99) {
                var9 = ((class99) var9).method1958(arg2, arg3, arg4, arg5, true, this.field874);
            } else if (var9 instanceof class94) {
                var9 = ((class94) var9).method1857(arg2, arg3, arg4, arg5, true, this.field874);
            }
        }
        return var9;
    }

    @ObfuscatedName("al.n(II[[IIIII)Lcx;")
    public final class99 method604(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field849 == null) {
            var7 = (long) ((this.field857 << 10) + arg1);
        } else {
            var7 = (long) ((this.field857 << 10) + (arg0 << 3) + arg1);
        }
        class99 var9 = (class99) field886.method3097(var7);
        if (var9 == null) {
            class94 var10 = this.method613(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1917(this.field892 + 64, this.field876 * 25 + 768, -50, -10, -50);
            field886.method3099(var9, var7);
        }
        if (this.field874 >= 0) {
            var9 = var9.method1958(arg2, arg3, arg4, arg5, true, this.field874);
        }
        return var9;
    }

    @ObfuscatedName("al.d(II[[IIIILah;II)Lcx;")
    public final class99 method612(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7) {
        long var9;
        if (this.field849 == null) {
            var9 = (long) ((this.field857 << 10) + arg1);
        } else {
            var9 = (long) ((this.field857 << 10) + (arg0 << 3) + arg1);
        }
        class99 var11 = (class99) field886.method3097(var9);
        if (var11 == null) {
            class94 var12 = this.method613(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1917(this.field892 + 64, this.field876 * 25 + 768, -50, -10, -50);
            field886.method3099(var11, var9);
        }
        if (arg6 == null && this.field874 == -1) {
            return var11;
        }
        class99 var13;
        if (arg6 == null) {
            var13 = var11.method1937(true);
        } else {
            var13 = arg6.method672(var11, arg7, arg1);
        }
        if (this.field874 >= 0) {
            var13 = var13.method1958(arg2, arg3, arg4, arg5, false, this.field874);
        }
        return var13;
    }

    @ObfuscatedName("al.h(IIB)Lci;")
    public final class94 method613(int arg0, int arg1) {
        class94 var3 = null;
        if (this.field849 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field858 == null) {
                return null;
            }
            boolean var4 = this.field880;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field858.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field858[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class94) field853.method3097((long) var7);
                if (var3 == null) {
                    var3 = class94.method1848(Statics.field887, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1862();
                    }
                    field853.method3099(var3, (long) var7);
                }
                if (var5 > 1) {
                    field885[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class94(field885, var5);
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
            int var10 = this.field858[var8];
            boolean var11 = this.field880 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class94) field853.method3097((long) var10);
            if (var3 == null) {
                var3 = class94.method1848(Statics.field887, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1862();
                }
                field853.method3099(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field864 == 128 && this.field883 == 128 && this.field856 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field855 == 0 && this.field884 == 0 && this.field861 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class94 var14 = new class94(var3, arg1 == 0 && !var12 && !var13, this.field872 == null, this.field863 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1858(256);
            var14.method1868(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1910();
        } else if (var15 == 2) {
            var14.method1856();
        } else if (var15 == 3) {
            var14.method1918();
        }
        if (this.field872 != null) {
            for (int var16 = 0; var16 < this.field872.length; var16++) {
                var14.method1847(this.field872[var16], this.field862[var16]);
            }
        }
        if (this.field863 != null) {
            for (int var17 = 0; var17 < this.field863.length; var17++) {
                var14.method1861(this.field863[var17], this.field875[var17]);
            }
        }
        if (var12) {
            var14.method1863(this.field864, this.field883, this.field856);
        }
        if (var13) {
            var14.method1868(this.field855, this.field884, this.field861);
        }
        return var14;
    }

    @ObfuscatedName("al.y(I)Lal;")
    public final class37 method614() {
        int var1 = -1;
        if (this.field851 != -1) {
            var1 = class157.method671(this.field851);
        } else if (this.field893 != -1) {
            var1 = class157.field2672[this.field893];
        }
        return var1 < 0 || var1 >= this.field891.length || this.field891[var1] == -1 ? null : method3266(this.field891[var1]);
    }

    @ObfuscatedName("r.p(I)V")
    public static void method462() {
        field852.method3100();
        field853.method3100();
        field867.method3100();
        field886.method3100();
    }

    @ObfuscatedName("al.i(B)Z")
    public boolean method615() {
        if (this.field891 == null) {
            return this.field894 != -1 || this.field898 != null;
        }
        for (int var1 = 0; var1 < this.field891.length; var1++) {
            if (this.field891[var1] != -1) {
                class37 var2 = method3266(this.field891[var1]);
                if (var2.field894 != -1 || var2.field898 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

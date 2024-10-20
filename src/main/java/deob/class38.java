package deob;

@ObfuscatedName("ao")
public class class38 extends class194 {

    @ObfuscatedName("ao.q")
    public static boolean field886 = false;

    @ObfuscatedName("ao.e")
    public static class183 field864 = new class183(64);

    @ObfuscatedName("ao.n")
    public static class183 field852 = new class183(500);

    @ObfuscatedName("ao.t")
    public static class183 field853 = new class183(30);

    @ObfuscatedName("ao.l")
    public static class183 field854 = new class183(30);

    @ObfuscatedName("ao.m")
    public static class95[] field890 = new class95[4];

    @ObfuscatedName("ao.o")
    public int field869;

    @ObfuscatedName("ao.k")
    public int[] field857;

    @ObfuscatedName("ao.p")
    public int[] field888;

    @ObfuscatedName("ao.u")
    public String field859 = "null";

    @ObfuscatedName("ao.g")
    public short[] field860;

    @ObfuscatedName("ao.a")
    public short[] field851;

    @ObfuscatedName("ao.y")
    public short[] field862;

    @ObfuscatedName("ao.d")
    public short[] field855;

    @ObfuscatedName("ao.b")
    public int field863 = 1;

    @ObfuscatedName("ao.j")
    public int field865 = 1;

    @ObfuscatedName("ao.f")
    public int field849 = 2;

    @ObfuscatedName("ao.w")
    public boolean field867 = true;

    @ObfuscatedName("ao.z")
    public int field868 = -1;

    @ObfuscatedName("ao.x")
    public int field876 = -1;

    @ObfuscatedName("ao.v")
    public boolean field870 = false;

    @ObfuscatedName("ao.i")
    public boolean field877 = false;

    @ObfuscatedName("ao.c")
    public int field872 = -1;

    @ObfuscatedName("ao.r")
    public int field873 = 16;

    @ObfuscatedName("ao.an")
    public int field874 = 0;

    @ObfuscatedName("ao.ad")
    public int field848 = 0;

    @ObfuscatedName("ao.ai")
    public String[] field866 = new String[5];

    @ObfuscatedName("ao.ae")
    public int field893 = -1;

    @ObfuscatedName("ao.aq")
    public int field878 = -1;

    @ObfuscatedName("ao.av")
    public boolean field850 = false;

    @ObfuscatedName("ao.am")
    public boolean field880 = true;

    @ObfuscatedName("ao.ac")
    public int field858 = 128;

    @ObfuscatedName("ao.ak")
    public int field871 = 128;

    @ObfuscatedName("ao.aa")
    public int field883 = 128;

    @ObfuscatedName("ao.al")
    public int field884 = 0;

    @ObfuscatedName("ao.ao")
    public int field885 = 0;

    @ObfuscatedName("ao.af")
    public int field861 = 0;

    @ObfuscatedName("ao.as")
    public boolean field887 = false;

    @ObfuscatedName("ao.ab")
    public boolean field881 = false;

    @ObfuscatedName("ao.ay")
    public int field889 = -1;

    @ObfuscatedName("ao.ax")
    public int[] field875;

    @ObfuscatedName("ao.au")
    public int field891 = -1;

    @ObfuscatedName("ao.ap")
    public int field892 = -1;

    @ObfuscatedName("ao.aw")
    public int field856 = -1;

    @ObfuscatedName("ao.ar")
    public int field894 = 0;

    @ObfuscatedName("ao.at")
    public int field895 = 0;

    @ObfuscatedName("ao.ah")
    public int field896 = 0;

    @ObfuscatedName("ao.ag")
    public int[] field897;

    @ObfuscatedName("el.q(IB)Lao;")
    public static class38 method2727(int arg0) {
        class38 var1 = (class38) field864.method3243((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field879.method2811(6, arg0);
        class38 var3 = new class38();
        var3.field869 = arg0;
        if (var2 != null) {
            var3.method682(new class111(var2));
        }
        var3.method662();
        if (var3.field881) {
            var3.field849 = 0;
            var3.field867 = false;
        }
        field864.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.s(B)V")
    public void method662() {
        if (this.field868 == -1) {
            this.field868 = 0;
            if (this.field857 != null && (this.field888 == null || this.field888[0] == 10)) {
                this.field868 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field866[var1] != null) {
                    this.field868 = 1;
                }
            }
        }
        if (this.field889 == -1) {
            this.field889 = this.field849 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ao.h(Ldx;I)V")
    public void method682(class111 arg0) {
        while (true) {
            int var2 = arg0.method2231();
            if (var2 == 0) {
                return;
            }
            this.method664(arg0, var2);
        }
    }

    @ObfuscatedName("ao.e(Ldx;IB)V")
    public void method664(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2231();
            if (var3 > 0) {
                if (this.field857 == null || field886) {
                    this.field888 = new int[var3];
                    this.field857 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field857[var4] = arg0.method2307();
                        this.field888[var4] = arg0.method2231();
                    }
                } else {
                    arg0.field1852 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field859 = arg0.method2156();
        } else if (arg1 == 5) {
            int var5 = arg0.method2231();
            if (var5 > 0) {
                if (this.field857 == null || field886) {
                    this.field888 = null;
                    this.field857 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field857[var6] = arg0.method2307();
                    }
                } else {
                    arg0.field1852 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field863 = arg0.method2231();
        } else if (arg1 == 15) {
            this.field865 = arg0.method2231();
        } else if (arg1 == 17) {
            this.field849 = 0;
            this.field867 = false;
        } else if (arg1 == 18) {
            this.field867 = false;
        } else if (arg1 == 19) {
            this.field868 = arg0.method2231();
        } else if (arg1 == 21) {
            this.field876 = 0;
        } else if (arg1 == 22) {
            this.field870 = true;
        } else if (arg1 == 23) {
            this.field877 = true;
        } else if (arg1 == 24) {
            this.field872 = arg0.method2307();
            if (this.field872 == 65535) {
                this.field872 = -1;
            }
        } else if (arg1 == 27) {
            this.field849 = 1;
        } else if (arg1 == 28) {
            this.field873 = arg0.method2231();
        } else if (arg1 == 29) {
            this.field874 = arg0.method2149();
        } else if (arg1 == 39) {
            this.field848 = arg0.method2149() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field866[arg1 - 30] = arg0.method2156();
            if (this.field866[arg1 - 30].equalsIgnoreCase(class148.field2156)) {
                this.field866[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2231();
            this.field860 = new short[var7];
            this.field851 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field860[var8] = (short) arg0.method2307();
                this.field851[var8] = (short) arg0.method2307();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2231();
            this.field862 = new short[var9];
            this.field855 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field862[var10] = (short) arg0.method2307();
                this.field855[var10] = (short) arg0.method2307();
            }
        } else if (arg1 == 60) {
            this.field893 = arg0.method2307();
        } else if (arg1 == 62) {
            this.field850 = true;
        } else if (arg1 == 64) {
            this.field880 = false;
        } else if (arg1 == 65) {
            this.field858 = arg0.method2307();
        } else if (arg1 == 66) {
            this.field871 = arg0.method2307();
        } else if (arg1 == 67) {
            this.field883 = arg0.method2307();
        } else if (arg1 == 68) {
            this.field878 = arg0.method2307();
        } else if (arg1 == 69) {
            arg0.method2231();
        } else if (arg1 == 70) {
            this.field884 = arg0.method2151();
        } else if (arg1 == 71) {
            this.field885 = arg0.method2151();
        } else if (arg1 == 72) {
            this.field861 = arg0.method2151();
        } else if (arg1 == 73) {
            this.field887 = true;
        } else if (arg1 == 74) {
            this.field881 = true;
        } else if (arg1 == 75) {
            this.field889 = arg0.method2231();
        } else if (arg1 == 77) {
            this.field891 = arg0.method2307();
            if (this.field891 == 65535) {
                this.field891 = -1;
            }
            this.field892 = arg0.method2307();
            if (this.field892 == 65535) {
                this.field892 = -1;
            }
            int var11 = arg0.method2231();
            this.field875 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field875[var12] = arg0.method2307();
                if (this.field875[var12] == 65535) {
                    this.field875[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field856 = arg0.method2307();
            this.field894 = arg0.method2231();
        } else if (arg1 == 79) {
            this.field895 = arg0.method2307();
            this.field896 = arg0.method2307();
            this.field894 = arg0.method2231();
            int var13 = arg0.method2231();
            this.field897 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field897[var14] = arg0.method2307();
            }
        } else if (arg1 == 81) {
            this.field876 = arg0.method2231() * 256;
        }
    }

    @ObfuscatedName("ao.n(IB)Z")
    public final boolean method665(int arg0) {
        if (this.field888 != null) {
            for (int var4 = 0; var4 < this.field888.length; var4++) {
                if (this.field888[var4] == arg0) {
                    return Statics.field882.method2877(this.field857[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field857 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field857.length; var3++) {
                var2 &= Statics.field882.method2877(this.field857[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ao.t(I)Z")
    public final boolean method661() {
        if (this.field857 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field857.length; var2++) {
            var1 &= Statics.field882.method2877(this.field857[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ao.l(II[[IIIIB)Lcq;")
    public final class80 method700(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field888 == null) {
            var7 = (long) ((this.field869 << 10) + arg1);
        } else {
            var7 = (long) ((this.field869 << 10) + (arg0 << 3) + arg1);
        }
        class80 var9 = (class80) field853.method3243(var7);
        if (var9 == null) {
            class95 var10 = this.method669(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field870) {
                var10.field1611 = (short) (this.field874 + 64);
                var10.field1594 = (short) (this.field848 + 768);
                var10.method1915();
                var9 = var10;
            } else {
                var9 = var10.method1965(this.field874 + 64, this.field848 + 768, -50, -10, -50);
            }
            field853.method3253(var9, var7);
        }
        if (this.field870) {
            var9 = ((class95) var9).method1904();
        }
        if (this.field876 >= 0) {
            if (var9 instanceof class100) {
                var9 = ((class100) var9).method1993(arg2, arg3, arg4, arg5, true, this.field876);
            } else if (var9 instanceof class95) {
                var9 = ((class95) var9).method1941(arg2, arg3, arg4, arg5, true, this.field876);
            }
        }
        return var9;
    }

    @ObfuscatedName("ao.m(II[[IIIII)Lch;")
    public final class100 method692(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field888 == null) {
            var7 = (long) ((this.field869 << 10) + arg1);
        } else {
            var7 = (long) ((this.field869 << 10) + (arg0 << 3) + arg1);
        }
        class100 var9 = (class100) field854.method3243(var7);
        if (var9 == null) {
            class95 var10 = this.method669(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1965(this.field874 + 64, this.field848 + 768, -50, -10, -50);
            field854.method3253(var9, var7);
        }
        if (this.field876 >= 0) {
            var9 = var9.method1993(arg2, arg3, arg4, arg5, true, this.field876);
        }
        return var9;
    }

    @ObfuscatedName("ao.o(II[[IIIILas;II)Lch;")
    public final class100 method668(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        long var9;
        if (this.field888 == null) {
            var9 = (long) ((this.field869 << 10) + arg1);
        } else {
            var9 = (long) ((this.field869 << 10) + (arg0 << 3) + arg1);
        }
        class100 var11 = (class100) field854.method3243(var9);
        if (var11 == null) {
            class95 var12 = this.method669(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1965(this.field874 + 64, this.field848 + 768, -50, -10, -50);
            field854.method3253(var11, var9);
        }
        if (arg6 == null && this.field876 == -1) {
            return var11;
        }
        class100 var13;
        if (arg6 == null) {
            var13 = var11.method1992(true);
        } else {
            var13 = arg6.method749(var11, arg7, arg1);
        }
        if (this.field876 >= 0) {
            var13 = var13.method1993(arg2, arg3, arg4, arg5, false, this.field876);
        }
        return var13;
    }

    @ObfuscatedName("ao.k(IIB)Lcl;")
    public final class95 method669(int arg0, int arg1) {
        class95 var3 = null;
        if (this.field888 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field857 == null) {
                return null;
            }
            boolean var4 = this.field850;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field857.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field857[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class95) field852.method3243((long) var7);
                if (var3 == null) {
                    var3 = class95.method1899(Statics.field882, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1961();
                    }
                    field852.method3253(var3, (long) var7);
                }
                if (var5 > 1) {
                    field890[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class95(field890, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field888.length; var9++) {
                if (this.field888[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field857[var8];
            boolean var11 = this.field850 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class95) field852.method3243((long) var10);
            if (var3 == null) {
                var3 = class95.method1899(Statics.field882, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1961();
                }
                field852.method3253(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field858 == 128 && this.field871 == 128 && this.field883 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field884 == 0 && this.field885 == 0 && this.field861 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class95 var14 = new class95(var3, arg1 == 0 && !var12 && !var13, this.field860 == null, this.field862 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1910(256);
            var14.method1911(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1907();
        } else if (var15 == 2) {
            var14.method1908();
        } else if (var15 == 3) {
            var14.method1909();
        }
        if (this.field860 != null) {
            for (int var16 = 0; var16 < this.field860.length; var16++) {
                var14.method1912(this.field860[var16], this.field851[var16]);
            }
        }
        if (this.field862 != null) {
            for (int var17 = 0; var17 < this.field862.length; var17++) {
                var14.method1913(this.field862[var17], this.field855[var17]);
            }
        }
        if (var12) {
            var14.method1916(this.field858, this.field871, this.field883);
        }
        if (var13) {
            var14.method1911(this.field884, this.field885, this.field861);
        }
        return var14;
    }

    @ObfuscatedName("ao.p(B)Lao;")
    public final class38 method670() {
        int var1 = -1;
        if (this.field891 != -1) {
            var1 = class166.method531(this.field891);
        } else if (this.field892 != -1) {
            var1 = class166.field2742[this.field892];
        }
        return var1 < 0 || var1 >= this.field875.length || this.field875[var1] == -1 ? null : method2727(this.field875[var1]);
    }

    @ObfuscatedName("p.u(I)V")
    public static void method130() {
        field864.method3246();
        field852.method3246();
        field853.method3246();
        field854.method3246();
    }

    @ObfuscatedName("ao.g(I)Z")
    public boolean method671() {
        if (this.field875 == null) {
            return this.field856 != -1 || this.field897 != null;
        }
        for (int var1 = 0; var1 < this.field875.length; var1++) {
            if (this.field875[var1] != -1) {
                class38 var2 = method2727(this.field875[var1]);
                if (var2.field856 != -1 || var2.field897 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

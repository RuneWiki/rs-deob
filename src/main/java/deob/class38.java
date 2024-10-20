package deob;

@ObfuscatedName("al")
public class class38 extends class195 {

    @ObfuscatedName("al.t")
    public static boolean field847 = false;

    @ObfuscatedName("al.e")
    public static class184 field891 = new class184(64);

    @ObfuscatedName("al.i")
    public static class184 field848 = new class184(500);

    @ObfuscatedName("al.o")
    public static class184 field864 = new class184(30);

    @ObfuscatedName("al.f")
    public static class184 field850 = new class184(30);

    @ObfuscatedName("al.d")
    public static class95[] field853 = new class95[4];

    @ObfuscatedName("al.j")
    public int field852;

    @ObfuscatedName("al.x")
    public int[] field865;

    @ObfuscatedName("al.v")
    public int[] field854;

    @ObfuscatedName("al.a")
    public String field876 = "null";

    @ObfuscatedName("al.l")
    public short[] field856;

    @ObfuscatedName("al.h")
    public short[] field875;

    @ObfuscatedName("al.c")
    public short[] field858;

    @ObfuscatedName("al.u")
    public short[] field861;

    @ObfuscatedName("al.r")
    public int field860 = 1;

    @ObfuscatedName("al.k")
    public int field859 = 1;

    @ObfuscatedName("al.w")
    public int field862 = 2;

    @ObfuscatedName("al.q")
    public boolean field863 = true;

    @ObfuscatedName("al.g")
    public int field857 = -1;

    @ObfuscatedName("al.z")
    public int field882 = -1;

    @ObfuscatedName("al.m")
    public boolean field866 = false;

    @ObfuscatedName("al.y")
    public boolean field867 = false;

    @ObfuscatedName("al.n")
    public int field868 = -1;

    @ObfuscatedName("al.s")
    public int field869 = 16;

    @ObfuscatedName("al.ac")
    public int field870 = 0;

    @ObfuscatedName("al.au")
    public int field855 = 0;

    @ObfuscatedName("al.ap")
    public String[] field849 = new String[5];

    @ObfuscatedName("al.ah")
    public int field873 = -1;

    @ObfuscatedName("al.ae")
    public int field874 = -1;

    @ObfuscatedName("al.ag")
    public boolean field894 = false;

    @ObfuscatedName("al.as")
    public boolean field890 = true;

    @ObfuscatedName("al.at")
    public int field877 = 128;

    @ObfuscatedName("al.aw")
    public int field878 = 128;

    @ObfuscatedName("al.ay")
    public int field879 = 128;

    @ObfuscatedName("al.ao")
    public int field880 = 0;

    @ObfuscatedName("al.al")
    public int field881 = 0;

    @ObfuscatedName("al.ab")
    public int field871 = 0;

    @ObfuscatedName("al.aj")
    public boolean field883 = false;

    @ObfuscatedName("al.ak")
    public boolean field884 = false;

    @ObfuscatedName("al.ar")
    public int field851 = -1;

    @ObfuscatedName("al.ai")
    public int[] field886;

    @ObfuscatedName("al.ax")
    public int field887 = -1;

    @ObfuscatedName("al.az")
    public int field888 = -1;

    @ObfuscatedName("al.aq")
    public int field889 = -1;

    @ObfuscatedName("al.ad")
    public int field885 = 0;

    @ObfuscatedName("al.af")
    public int field872 = 0;

    @ObfuscatedName("al.aa")
    public int field892 = 0;

    @ObfuscatedName("al.av")
    public int[] field893;

    @ObfuscatedName("bm.t(II)Lal;")
    public static class38 method1473(int arg0) {
        class38 var1 = (class38) field891.method3339((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field845.method2881(6, arg0);
        class38 var3 = new class38();
        var3.field852 = arg0;
        if (var2 != null) {
            var3.method744(new class111(var2));
        }
        var3.method715();
        if (var3.field884) {
            var3.field862 = 0;
            var3.field863 = false;
        }
        field891.method3341(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("al.b(B)V")
    public void method715() {
        if (this.field857 == -1) {
            this.field857 = 0;
            if (this.field865 != null && (this.field854 == null || this.field854[0] == 10)) {
                this.field857 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field849[var1] != null) {
                    this.field857 = 1;
                }
            }
        }
        if (this.field851 == -1) {
            this.field851 = this.field862 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("al.p(Ldc;I)V")
    public void method744(class111 arg0) {
        while (true) {
            int var2 = arg0.method2172();
            if (var2 == 0) {
                return;
            }
            this.method738(arg0, var2);
        }
    }

    @ObfuscatedName("al.e(Ldc;II)V")
    public void method738(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2172();
            if (var3 > 0) {
                if (this.field865 == null || field847) {
                    this.field854 = new int[var3];
                    this.field865 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field865[var4] = arg0.method2255();
                        this.field854[var4] = arg0.method2172();
                    }
                } else {
                    arg0.field1867 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field876 = arg0.method2180();
        } else if (arg1 == 5) {
            int var5 = arg0.method2172();
            if (var5 > 0) {
                if (this.field865 == null || field847) {
                    this.field854 = null;
                    this.field865 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field865[var6] = arg0.method2255();
                    }
                } else {
                    arg0.field1867 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field860 = arg0.method2172();
        } else if (arg1 == 15) {
            this.field859 = arg0.method2172();
        } else if (arg1 == 17) {
            this.field862 = 0;
            this.field863 = false;
        } else if (arg1 == 18) {
            this.field863 = false;
        } else if (arg1 == 19) {
            this.field857 = arg0.method2172();
        } else if (arg1 == 21) {
            this.field882 = 0;
        } else if (arg1 == 22) {
            this.field866 = true;
        } else if (arg1 == 23) {
            this.field867 = true;
        } else if (arg1 == 24) {
            this.field868 = arg0.method2255();
            if (this.field868 == 65535) {
                this.field868 = -1;
            }
        } else if (arg1 == 27) {
            this.field862 = 1;
        } else if (arg1 == 28) {
            this.field869 = arg0.method2172();
        } else if (arg1 == 29) {
            this.field870 = arg0.method2358();
        } else if (arg1 == 39) {
            this.field855 = arg0.method2358() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field849[arg1 - 30] = arg0.method2180();
            if (this.field849[arg1 - 30].equalsIgnoreCase(class148.field2189)) {
                this.field849[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2172();
            this.field856 = new short[var7];
            this.field875 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field856[var8] = (short) arg0.method2255();
                this.field875[var8] = (short) arg0.method2255();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2172();
            this.field858 = new short[var9];
            this.field861 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field858[var10] = (short) arg0.method2255();
                this.field861[var10] = (short) arg0.method2255();
            }
        } else if (arg1 == 60) {
            this.field873 = arg0.method2255();
        } else if (arg1 == 62) {
            this.field894 = true;
        } else if (arg1 == 64) {
            this.field890 = false;
        } else if (arg1 == 65) {
            this.field877 = arg0.method2255();
        } else if (arg1 == 66) {
            this.field878 = arg0.method2255();
        } else if (arg1 == 67) {
            this.field879 = arg0.method2255();
        } else if (arg1 == 68) {
            this.field874 = arg0.method2255();
        } else if (arg1 == 69) {
            arg0.method2172();
        } else if (arg1 == 70) {
            this.field880 = arg0.method2304();
        } else if (arg1 == 71) {
            this.field881 = arg0.method2304();
        } else if (arg1 == 72) {
            this.field871 = arg0.method2304();
        } else if (arg1 == 73) {
            this.field883 = true;
        } else if (arg1 == 74) {
            this.field884 = true;
        } else if (arg1 == 75) {
            this.field851 = arg0.method2172();
        } else if (arg1 == 77) {
            this.field887 = arg0.method2255();
            if (this.field887 == 65535) {
                this.field887 = -1;
            }
            this.field888 = arg0.method2255();
            if (this.field888 == 65535) {
                this.field888 = -1;
            }
            int var11 = arg0.method2172();
            this.field886 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field886[var12] = arg0.method2255();
                if (this.field886[var12] == 65535) {
                    this.field886[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field889 = arg0.method2255();
            this.field885 = arg0.method2172();
        } else if (arg1 == 79) {
            this.field872 = arg0.method2255();
            this.field892 = arg0.method2255();
            this.field885 = arg0.method2172();
            int var13 = arg0.method2172();
            this.field893 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field893[var14] = arg0.method2255();
            }
        } else if (arg1 == 81) {
            this.field882 = arg0.method2172() * 256;
        }
    }

    @ObfuscatedName("al.i(IB)Z")
    public final boolean method718(int arg0) {
        if (this.field854 != null) {
            for (int var4 = 0; var4 < this.field854.length; var4++) {
                if (this.field854[var4] == arg0) {
                    return Statics.field846.method2953(this.field865[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field865 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field865.length; var3++) {
                var2 &= Statics.field846.method2953(this.field865[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("al.o(I)Z")
    public final boolean method743() {
        if (this.field865 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field865.length; var2++) {
            var1 &= Statics.field846.method2953(this.field865[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("al.f(II[[IIIII)Lcq;")
    public final class80 method720(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field854 == null) {
            var7 = (long) ((this.field852 << 10) + arg1);
        } else {
            var7 = (long) ((this.field852 << 10) + (arg0 << 3) + arg1);
        }
        class80 var9 = (class80) field864.method3339(var7);
        if (var9 == null) {
            class95 var10 = this.method723(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field866) {
                var10.field1645 = (short) (this.field870 + 64);
                var10.field1638 = (short) (this.field855 + 768);
                var10.method1946();
                var9 = var10;
            } else {
                var9 = var10.method1950(this.field870 + 64, this.field855 + 768, -50, -10, -50);
            }
            field864.method3341(var9, var7);
        }
        if (this.field866) {
            var9 = ((class95) var9).method1934();
        }
        if (this.field882 >= 0) {
            if (var9 instanceof class100) {
                var9 = ((class100) var9).method2046(arg2, arg3, arg4, arg5, true, this.field882);
            } else if (var9 instanceof class95) {
                var9 = ((class95) var9).method1935(arg2, arg3, arg4, arg5, true, this.field882);
            }
        }
        return var9;
    }

    @ObfuscatedName("al.d(II[[IIIIB)Lcs;")
    public final class100 method721(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field854 == null) {
            var7 = (long) ((this.field852 << 10) + arg1);
        } else {
            var7 = (long) ((this.field852 << 10) + (arg0 << 3) + arg1);
        }
        class100 var9 = (class100) field850.method3339(var7);
        if (var9 == null) {
            class95 var10 = this.method723(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1950(this.field870 + 64, this.field855 + 768, -50, -10, -50);
            field850.method3341(var9, var7);
        }
        if (this.field882 >= 0) {
            var9 = var9.method2046(arg2, arg3, arg4, arg5, true, this.field882);
        }
        return var9;
    }

    @ObfuscatedName("al.j(II[[IIIILaj;IB)Lcs;")
    public final class100 method722(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class40 arg6, int arg7) {
        long var9;
        if (this.field854 == null) {
            var9 = (long) ((this.field852 << 10) + arg1);
        } else {
            var9 = (long) ((this.field852 << 10) + (arg0 << 3) + arg1);
        }
        class100 var11 = (class100) field850.method3339(var9);
        if (var11 == null) {
            class95 var12 = this.method723(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1950(this.field870 + 64, this.field855 + 768, -50, -10, -50);
            field850.method3341(var11, var9);
        }
        if (arg6 == null && this.field882 == -1) {
            return var11;
        }
        class100 var13;
        if (arg6 == null) {
            var13 = var11.method2053(true);
        } else {
            var13 = arg6.method810(var11, arg7, arg1);
        }
        if (this.field882 >= 0) {
            var13 = var13.method2046(arg2, arg3, arg4, arg5, false, this.field882);
        }
        return var13;
    }

    @ObfuscatedName("al.x(III)Lcg;")
    public final class95 method723(int arg0, int arg1) {
        class95 var3 = null;
        if (this.field854 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field865 == null) {
                return null;
            }
            boolean var4 = this.field894;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field865.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field865[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class95) field848.method3339((long) var7);
                if (var3 == null) {
                    var3 = class95.method1964(Statics.field846, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1944();
                    }
                    field848.method3341(var3, (long) var7);
                }
                if (var5 > 1) {
                    field853[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class95(field853, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field854.length; var9++) {
                if (this.field854[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field865[var8];
            boolean var11 = this.field894 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class95) field848.method3339((long) var10);
            if (var3 == null) {
                var3 = class95.method1964(Statics.field846, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1944();
                }
                field848.method3341(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field877 == 128 && this.field878 == 128 && this.field879 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field880 == 0 && this.field881 == 0 && this.field871 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class95 var14 = new class95(var3, arg1 == 0 && !var12 && !var13, this.field856 == null, this.field858 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1940(256);
            var14.method1941(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1937();
        } else if (var15 == 2) {
            var14.method1985();
        } else if (var15 == 3) {
            var14.method1965();
        }
        if (this.field856 != null) {
            for (int var16 = 0; var16 < this.field856.length; var16++) {
                var14.method1995(this.field856[var16], this.field875[var16]);
            }
        }
        if (this.field858 != null) {
            for (int var17 = 0; var17 < this.field858.length; var17++) {
                var14.method1943(this.field858[var17], this.field861[var17]);
            }
        }
        if (var12) {
            var14.method1945(this.field877, this.field878, this.field879);
        }
        if (var13) {
            var14.method1941(this.field880, this.field881, this.field871);
        }
        return var14;
    }

    @ObfuscatedName("al.v(I)Lal;")
    public final class38 method724() {
        int var1 = -1;
        if (this.field887 != -1) {
            var1 = class167.method2416(this.field887);
        } else if (this.field888 != -1) {
            var1 = class167.field2787[this.field888];
        }
        return var1 < 0 || var1 >= this.field886.length || this.field886[var1] == -1 ? null : method1473(this.field886[var1]);
    }

    @ObfuscatedName("dv.a(B)V")
    public static void method2113() {
        field891.method3342();
        field848.method3342();
        field864.method3342();
        field850.method3342();
    }

    @ObfuscatedName("al.l(I)Z")
    public boolean method725() {
        if (this.field886 == null) {
            return this.field889 != -1 || this.field893 != null;
        }
        for (int var1 = 0; var1 < this.field886.length; var1++) {
            if (this.field886[var1] != -1) {
                class38 var2 = method1473(this.field886[var1]);
                if (var2.field889 != -1 || var2.field893 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

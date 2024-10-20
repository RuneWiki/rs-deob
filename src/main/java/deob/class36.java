package deob;

@ObfuscatedName("ai")
public class class36 extends class183 {

    @ObfuscatedName("ai.g")
    public static boolean field888 = false;

    @ObfuscatedName("ai.e")
    public static class172 field848 = new class172(64);

    @ObfuscatedName("ai.w")
    public static class172 field894 = new class172(500);

    @ObfuscatedName("ai.m")
    public static class172 field850 = new class172(30);

    @ObfuscatedName("ai.u")
    public static class172 field899 = new class172(30);

    @ObfuscatedName("ai.j")
    public static class93[] field852 = new class93[4];

    @ObfuscatedName("ai.o")
    public int field853;

    @ObfuscatedName("ai.h")
    public int[] field854;

    @ObfuscatedName("ai.b")
    public int[] field855;

    @ObfuscatedName("ai.r")
    public String field856 = "null";

    @ObfuscatedName("ai.l")
    public short[] field857;

    @ObfuscatedName("ai.x")
    public short[] field858;

    @ObfuscatedName("ai.q")
    public short[] field882;

    @ObfuscatedName("ai.t")
    public short[] field860;

    @ObfuscatedName("ai.y")
    public int field868 = 1;

    @ObfuscatedName("ai.d")
    public int field862 = 1;

    @ObfuscatedName("ai.z")
    public int field863 = 2;

    @ObfuscatedName("ai.n")
    public boolean field875 = true;

    @ObfuscatedName("ai.v")
    public int field865 = -1;

    @ObfuscatedName("ai.f")
    public int field895 = -1;

    @ObfuscatedName("ai.a")
    public boolean field851 = false;

    @ObfuscatedName("ai.p")
    public boolean field893 = false;

    @ObfuscatedName("ai.s")
    public int field897 = -1;

    @ObfuscatedName("ai.c")
    public int field870 = 16;

    @ObfuscatedName("ai.ar")
    public int field871 = 0;

    @ObfuscatedName("ai.ac")
    public int field872 = 0;

    @ObfuscatedName("ai.ah")
    public String[] field873 = new String[5];

    @ObfuscatedName("ai.ap")
    public int field874 = -1;

    @ObfuscatedName("ai.aj")
    public int field877 = -1;

    @ObfuscatedName("ai.as")
    public boolean field876 = false;

    @ObfuscatedName("ai.aa")
    public boolean field864 = true;

    @ObfuscatedName("ai.am")
    public int field878 = 128;

    @ObfuscatedName("ai.ae")
    public int field879 = 128;

    @ObfuscatedName("ai.ai")
    public int field880 = 128;

    @ObfuscatedName("ai.ay")
    public int field845 = 0;

    @ObfuscatedName("ai.ax")
    public int field887 = 0;

    @ObfuscatedName("ai.au")
    public int field883 = 0;

    @ObfuscatedName("ai.az")
    public boolean field884 = false;

    @ObfuscatedName("ai.aw")
    public boolean field885 = false;

    @ObfuscatedName("ai.ag")
    public int field886 = -1;

    @ObfuscatedName("ai.ao")
    public int[] field867;

    @ObfuscatedName("ai.aq")
    public int field846 = -1;

    @ObfuscatedName("ai.ak")
    public int field889 = -1;

    @ObfuscatedName("ai.al")
    public int field890 = -1;

    @ObfuscatedName("ai.at")
    public int field891 = 0;

    @ObfuscatedName("ai.an")
    public int field892 = 0;

    @ObfuscatedName("ai.av")
    public int field881 = 0;

    @ObfuscatedName("ai.ab")
    public int[] field861;

    @ObfuscatedName("cg.g(II)Lai;")
    public static class36 method1847(int arg0) {
        class36 var1 = (class36) field848.method3135((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field869.method2734(6, arg0);
        class36 var3 = new class36();
        var3.field853 = arg0;
        if (var2 != null) {
            var3.method654(new class107(var2));
        }
        var3.method624();
        if (var3.field885) {
            var3.field863 = 0;
            var3.field875 = false;
        }
        field848.method3140(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.i(I)V")
    public void method624() {
        if (this.field865 == -1) {
            this.field865 = 0;
            if (this.field854 != null && (this.field855 == null || this.field855[0] == 10)) {
                this.field865 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field873[var1] != null) {
                    this.field865 = 1;
                }
            }
        }
        if (this.field886 == -1) {
            this.field886 = this.field863 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.k(Ldk;I)V")
    public void method654(class107 arg0) {
        while (true) {
            int var2 = arg0.method2092();
            if (var2 == 0) {
                return;
            }
            this.method626(arg0, var2);
        }
    }

    @ObfuscatedName("ai.e(Ldk;IS)V")
    public void method626(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2092();
            if (var3 > 0) {
                if (this.field854 == null || field888) {
                    this.field855 = new int[var3];
                    this.field854 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field854[var4] = arg0.method2094();
                        this.field855[var4] = arg0.method2092();
                    }
                } else {
                    arg0.field1844 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field856 = arg0.method2251();
        } else if (arg1 == 5) {
            int var5 = arg0.method2092();
            if (var5 > 0) {
                if (this.field854 == null || field888) {
                    this.field855 = null;
                    this.field854 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field854[var6] = arg0.method2094();
                    }
                } else {
                    arg0.field1844 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field868 = arg0.method2092();
        } else if (arg1 == 15) {
            this.field862 = arg0.method2092();
        } else if (arg1 == 17) {
            this.field863 = 0;
            this.field875 = false;
        } else if (arg1 == 18) {
            this.field875 = false;
        } else if (arg1 == 19) {
            this.field865 = arg0.method2092();
        } else if (arg1 == 21) {
            this.field895 = 0;
        } else if (arg1 == 22) {
            this.field851 = true;
        } else if (arg1 == 23) {
            this.field893 = true;
        } else if (arg1 == 24) {
            this.field897 = arg0.method2094();
            if (this.field897 == 65535) {
                this.field897 = -1;
            }
        } else if (arg1 == 27) {
            this.field863 = 1;
        } else if (arg1 == 28) {
            this.field870 = arg0.method2092();
        } else if (arg1 == 29) {
            this.field871 = arg0.method2117();
        } else if (arg1 == 39) {
            this.field872 = arg0.method2117();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field873[arg1 - 30] = arg0.method2251();
            if (this.field873[arg1 - 30].equalsIgnoreCase(class143.field2173)) {
                this.field873[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2092();
            this.field857 = new short[var7];
            this.field858 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field857[var8] = (short) arg0.method2094();
                this.field858[var8] = (short) arg0.method2094();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2092();
            this.field882 = new short[var9];
            this.field860 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field882[var10] = (short) arg0.method2094();
                this.field860[var10] = (short) arg0.method2094();
            }
        } else if (arg1 == 60) {
            this.field874 = arg0.method2094();
        } else if (arg1 == 62) {
            this.field876 = true;
        } else if (arg1 == 64) {
            this.field864 = false;
        } else if (arg1 == 65) {
            this.field878 = arg0.method2094();
        } else if (arg1 == 66) {
            this.field879 = arg0.method2094();
        } else if (arg1 == 67) {
            this.field880 = arg0.method2094();
        } else if (arg1 == 68) {
            this.field877 = arg0.method2094();
        } else if (arg1 == 69) {
            arg0.method2092();
        } else if (arg1 == 70) {
            this.field845 = arg0.method2099();
        } else if (arg1 == 71) {
            this.field887 = arg0.method2099();
        } else if (arg1 == 72) {
            this.field883 = arg0.method2099();
        } else if (arg1 == 73) {
            this.field884 = true;
        } else if (arg1 == 74) {
            this.field885 = true;
        } else if (arg1 == 75) {
            this.field886 = arg0.method2092();
        } else if (arg1 == 77) {
            this.field846 = arg0.method2094();
            if (this.field846 == 65535) {
                this.field846 = -1;
            }
            this.field889 = arg0.method2094();
            if (this.field889 == 65535) {
                this.field889 = -1;
            }
            int var11 = arg0.method2092();
            this.field867 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field867[var12] = arg0.method2094();
                if (this.field867[var12] == 65535) {
                    this.field867[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field890 = arg0.method2094();
            this.field891 = arg0.method2092();
        } else if (arg1 == 79) {
            this.field892 = arg0.method2094();
            this.field881 = arg0.method2094();
            this.field891 = arg0.method2092();
            int var13 = arg0.method2092();
            this.field861 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field861[var14] = arg0.method2094();
            }
        } else if (arg1 == 81) {
            this.field895 = arg0.method2092() * 256;
        }
    }

    @ObfuscatedName("ai.w(II)Z")
    public final boolean method627(int arg0) {
        if (this.field855 != null) {
            for (int var4 = 0; var4 < this.field855.length; var4++) {
                if (this.field855[var4] == arg0) {
                    return Statics.field847.method2724(this.field854[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field854 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field854.length; var3++) {
                var2 &= Statics.field847.method2724(this.field854[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.m(I)Z")
    public final boolean method623() {
        if (this.field854 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field854.length; var2++) {
            var1 &= Statics.field847.method2724(this.field854[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.u(II[[IIIII)Lbl;")
    public final class78 method629(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field855 == null) {
            var7 = (long) ((this.field853 << 10) + arg1);
        } else {
            var7 = (long) ((this.field853 << 10) + (arg0 << 3) + arg1);
        }
        class78 var9 = (class78) field850.method3135(var7);
        if (var9 == null) {
            class93 var10 = this.method632(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field851) {
                var10.field1613 = (short) (this.field871 + 64);
                var10.field1597 = (short) (this.field872 * 25 + 768);
                var10.method1877();
                var9 = var10;
            } else {
                var9 = var10.method1881(this.field871 + 64, this.field872 * 25 + 768, -50, -10, -50);
            }
            field850.method3140(var9, var7);
        }
        if (this.field851) {
            var9 = ((class93) var9).method1884();
        }
        if (this.field895 >= 0) {
            if (var9 instanceof class98) {
                var9 = ((class98) var9).method2002(arg2, arg3, arg4, arg5, true, this.field895);
            } else if (var9 instanceof class93) {
                var9 = ((class93) var9).method1913(arg2, arg3, arg4, arg5, true, this.field895);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.j(II[[IIIII)Lce;")
    public final class98 method630(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field855 == null) {
            var7 = (long) ((this.field853 << 10) + arg1);
        } else {
            var7 = (long) ((this.field853 << 10) + (arg0 << 3) + arg1);
        }
        class98 var9 = (class98) field899.method3135(var7);
        if (var9 == null) {
            class93 var10 = this.method632(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1881(this.field871 + 64, this.field872 * 25 + 768, -50, -10, -50);
            field899.method3140(var9, var7);
        }
        if (this.field895 >= 0) {
            var9 = var9.method2002(arg2, arg3, arg4, arg5, true, this.field895);
        }
        return var9;
    }

    @ObfuscatedName("ai.o(II[[IIIILax;II)Lce;")
    public final class98 method651(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class38 arg6, int arg7) {
        long var9;
        if (this.field855 == null) {
            var9 = (long) ((this.field853 << 10) + arg1);
        } else {
            var9 = (long) ((this.field853 << 10) + (arg0 << 3) + arg1);
        }
        class98 var11 = (class98) field899.method3135(var9);
        if (var11 == null) {
            class93 var12 = this.method632(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1881(this.field871 + 64, this.field872 * 25 + 768, -50, -10, -50);
            field899.method3140(var11, var9);
        }
        if (arg6 == null && this.field895 == -1) {
            return var11;
        }
        class98 var13;
        if (arg6 == null) {
            var13 = var11.method1983(true);
        } else {
            var13 = arg6.method692(var11, arg7, arg1);
        }
        if (this.field895 >= 0) {
            var13 = var13.method2002(arg2, arg3, arg4, arg5, false, this.field895);
        }
        return var13;
    }

    @ObfuscatedName("ai.h(III)Lcr;")
    public final class93 method632(int arg0, int arg1) {
        class93 var3 = null;
        if (this.field855 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field854 == null) {
                return null;
            }
            boolean var4 = this.field876;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field854.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field854[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class93) field894.method3135((long) var7);
                if (var3 == null) {
                    var3 = class93.method1903(Statics.field847, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1875();
                    }
                    field894.method3140(var3, (long) var7);
                }
                if (var5 > 1) {
                    field852[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class93(field852, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field855.length; var9++) {
                if (this.field855[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field854[var8];
            boolean var11 = this.field876 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class93) field894.method3135((long) var10);
            if (var3 == null) {
                var3 = class93.method1903(Statics.field847, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1875();
                }
                field894.method3140(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field878 == 128 && this.field879 == 128 && this.field880 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field845 == 0 && this.field887 == 0 && this.field883 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class93 var14 = new class93(var3, arg1 == 0 && !var12 && !var13, this.field857 == null, this.field882 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1871(256);
            var14.method1865(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1868();
        } else if (var15 == 2) {
            var14.method1934();
        } else if (var15 == 3) {
            var14.method1870();
        }
        if (this.field857 != null) {
            for (int var16 = 0; var16 < this.field857.length; var16++) {
                var14.method1873(this.field857[var16], this.field858[var16]);
            }
        }
        if (this.field882 != null) {
            for (int var17 = 0; var17 < this.field882.length; var17++) {
                var14.method1874(this.field882[var17], this.field860[var17]);
            }
        }
        if (var12) {
            var14.method1876(this.field878, this.field879, this.field880);
        }
        if (var13) {
            var14.method1865(this.field845, this.field887, this.field883);
        }
        return var14;
    }

    @ObfuscatedName("ai.b(I)Lai;")
    public final class36 method633() {
        int var1 = -1;
        if (this.field846 != -1) {
            var1 = class155.method879(this.field846);
        } else if (this.field889 != -1) {
            var1 = class155.field2684[this.field889];
        }
        return var1 < 0 || var1 >= this.field867.length || this.field867[var1] == -1 ? null : method1847(this.field867[var1]);
    }

    @ObfuscatedName("cn.r(B)V")
    public static void method1745() {
        field848.method3138();
        field894.method3138();
        field850.method3138();
        field899.method3138();
    }

    @ObfuscatedName("ai.l(S)Z")
    public boolean method634() {
        if (this.field867 == null) {
            return this.field890 != -1 || this.field861 != null;
        }
        for (int var1 = 0; var1 < this.field867.length; var1++) {
            if (this.field867[var1] != -1) {
                class36 var2 = method1847(this.field867[var1]);
                if (var2.field890 != -1 || var2.field861 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

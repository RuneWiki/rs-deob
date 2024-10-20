package deob;

@ObfuscatedName("ai")
public class class37 extends class185 {

    @ObfuscatedName("ai.e")
    public static boolean field892 = false;

    @ObfuscatedName("ai.g")
    public static class174 field845 = new class174(64);

    @ObfuscatedName("ai.q")
    public static class174 field843 = new class174(500);

    @ObfuscatedName("ai.l")
    public static class174 field876 = new class174(30);

    @ObfuscatedName("ai.a")
    public static class174 field848 = new class174(30);

    @ObfuscatedName("ai.b")
    public static class94[] field860 = new class94[4];

    @ObfuscatedName("ai.z")
    public int field850;

    @ObfuscatedName("ai.w")
    public int[] field851;

    @ObfuscatedName("ai.j")
    public int[] field885;

    @ObfuscatedName("ai.p")
    public String field853 = "null";

    @ObfuscatedName("ai.n")
    public short[] field856;

    @ObfuscatedName("ai.r")
    public short[] field855;

    @ObfuscatedName("ai.s")
    public short[] field847;

    @ObfuscatedName("ai.f")
    public short[] field857;

    @ObfuscatedName("ai.c")
    public int field858 = 1;

    @ObfuscatedName("ai.t")
    public int field859 = 1;

    @ObfuscatedName("ai.i")
    public int field854 = 2;

    @ObfuscatedName("ai.u")
    public boolean field861 = true;

    @ObfuscatedName("ai.y")
    public int field874 = -1;

    @ObfuscatedName("ai.o")
    public int field849 = -1;

    @ObfuscatedName("ai.m")
    public boolean field846 = false;

    @ObfuscatedName("ai.h")
    public boolean field865 = false;

    @ObfuscatedName("ai.x")
    public int field866 = -1;

    @ObfuscatedName("ai.d")
    public int field867 = 16;

    @ObfuscatedName("ai.ac")
    public int field868 = 0;

    @ObfuscatedName("ai.ax")
    public int field869 = 0;

    @ObfuscatedName("ai.af")
    public String[] field870 = new String[5];

    @ObfuscatedName("ai.am")
    public int field871 = -1;

    @ObfuscatedName("ai.ah")
    public int field872 = -1;

    @ObfuscatedName("ai.ar")
    public boolean field873 = false;

    @ObfuscatedName("ai.ad")
    public boolean field883 = true;

    @ObfuscatedName("ai.ao")
    public int field875 = 128;

    @ObfuscatedName("ai.ae")
    public int field863 = 128;

    @ObfuscatedName("ai.ab")
    public int field877 = 128;

    @ObfuscatedName("ai.ai")
    public int field878 = 0;

    @ObfuscatedName("ai.ag")
    public int field879 = 0;

    @ObfuscatedName("ai.ap")
    public int field880 = 0;

    @ObfuscatedName("ai.at")
    public boolean field881 = false;

    @ObfuscatedName("ai.az")
    public boolean field882 = false;

    @ObfuscatedName("ai.an")
    public int field887 = -1;

    @ObfuscatedName("ai.ay")
    public int[] field884;

    @ObfuscatedName("ai.aw")
    public int field852 = -1;

    @ObfuscatedName("ai.ak")
    public int field886 = -1;

    @ObfuscatedName("ai.aq")
    public int field864 = -1;

    @ObfuscatedName("ai.aa")
    public int field862 = 0;

    @ObfuscatedName("ai.aj")
    public int field889 = 0;

    @ObfuscatedName("ai.au")
    public int field890 = 0;

    @ObfuscatedName("ai.al")
    public int[] field891;

    @ObfuscatedName("q.e(Lep;Lep;ZI)V")
    public static void method34(class149 arg0, class149 arg1, boolean arg2) {
        Statics.field690 = arg0;
        Statics.field844 = arg1;
        field892 = arg2;
    }

    @ObfuscatedName("du.v(II)Lai;")
    public static class37 method2581(int arg0) {
        class37 var1 = (class37) field845.method3154((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field690.method2721(6, arg0);
        class37 var3 = new class37();
        var3.field850 = arg0;
        if (var2 != null) {
            var3.method631(new class108(var2));
        }
        var3.method655();
        if (var3.field882) {
            var3.field854 = 0;
            var3.field861 = false;
        }
        field845.method3156(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.k(B)V")
    public void method655() {
        if (this.field874 == -1) {
            this.field874 = 0;
            if (this.field851 != null && (this.field885 == null || this.field885[0] == 10)) {
                this.field874 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field870[var1] != null) {
                    this.field874 = 1;
                }
            }
        }
        if (this.field887 == -1) {
            this.field887 = this.field854 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.g(Ldd;I)V")
    public void method631(class108 arg0) {
        while (true) {
            int var2 = arg0.method2122();
            if (var2 == 0) {
                return;
            }
            this.method632(arg0, var2);
        }
    }

    @ObfuscatedName("ai.q(Ldd;II)V")
    public void method632(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2122();
            if (var3 > 0) {
                if (this.field851 == null || field892) {
                    this.field885 = new int[var3];
                    this.field851 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field851[var4] = arg0.method2124();
                        this.field885[var4] = arg0.method2122();
                    }
                } else {
                    arg0.field1841 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field853 = arg0.method2130();
        } else if (arg1 == 5) {
            int var5 = arg0.method2122();
            if (var5 > 0) {
                if (this.field851 == null || field892) {
                    this.field885 = null;
                    this.field851 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field851[var6] = arg0.method2124();
                    }
                } else {
                    arg0.field1841 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field858 = arg0.method2122();
        } else if (arg1 == 15) {
            this.field859 = arg0.method2122();
        } else if (arg1 == 17) {
            this.field854 = 0;
            this.field861 = false;
        } else if (arg1 == 18) {
            this.field861 = false;
        } else if (arg1 == 19) {
            this.field874 = arg0.method2122();
        } else if (arg1 == 21) {
            this.field849 = 0;
        } else if (arg1 == 22) {
            this.field846 = true;
        } else if (arg1 == 23) {
            this.field865 = true;
        } else if (arg1 == 24) {
            this.field866 = arg0.method2124();
            if (this.field866 == 65535) {
                this.field866 = -1;
            }
        } else if (arg1 == 27) {
            this.field854 = 1;
        } else if (arg1 == 28) {
            this.field867 = arg0.method2122();
        } else if (arg1 == 29) {
            this.field868 = arg0.method2190();
        } else if (arg1 == 39) {
            this.field869 = arg0.method2190() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field870[arg1 - 30] = arg0.method2130();
            if (this.field870[arg1 - 30].equalsIgnoreCase(class145.field2335)) {
                this.field870[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2122();
            this.field856 = new short[var7];
            this.field855 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field856[var8] = (short) arg0.method2124();
                this.field855[var8] = (short) arg0.method2124();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2122();
            this.field847 = new short[var9];
            this.field857 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field847[var10] = (short) arg0.method2124();
                this.field857[var10] = (short) arg0.method2124();
            }
        } else if (arg1 == 60) {
            this.field871 = arg0.method2124();
        } else if (arg1 == 62) {
            this.field873 = true;
        } else if (arg1 == 64) {
            this.field883 = false;
        } else if (arg1 == 65) {
            this.field875 = arg0.method2124();
        } else if (arg1 == 66) {
            this.field863 = arg0.method2124();
        } else if (arg1 == 67) {
            this.field877 = arg0.method2124();
        } else if (arg1 == 68) {
            this.field872 = arg0.method2124();
        } else if (arg1 == 69) {
            arg0.method2122();
        } else if (arg1 == 70) {
            this.field878 = arg0.method2125();
        } else if (arg1 == 71) {
            this.field879 = arg0.method2125();
        } else if (arg1 == 72) {
            this.field880 = arg0.method2125();
        } else if (arg1 == 73) {
            this.field881 = true;
        } else if (arg1 == 74) {
            this.field882 = true;
        } else if (arg1 == 75) {
            this.field887 = arg0.method2122();
        } else if (arg1 == 77) {
            this.field852 = arg0.method2124();
            if (this.field852 == 65535) {
                this.field852 = -1;
            }
            this.field886 = arg0.method2124();
            if (this.field886 == 65535) {
                this.field886 = -1;
            }
            int var11 = arg0.method2122();
            this.field884 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field884[var12] = arg0.method2124();
                if (this.field884[var12] == 65535) {
                    this.field884[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field864 = arg0.method2124();
            this.field862 = arg0.method2122();
        } else if (arg1 == 79) {
            this.field889 = arg0.method2124();
            this.field890 = arg0.method2124();
            this.field862 = arg0.method2122();
            int var13 = arg0.method2122();
            this.field891 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field891[var14] = arg0.method2124();
            }
        } else if (arg1 == 81) {
            this.field849 = arg0.method2122() * 256;
        }
    }

    @ObfuscatedName("ai.l(IB)Z")
    public final boolean method659(int arg0) {
        if (this.field885 != null) {
            for (int var4 = 0; var4 < this.field885.length; var4++) {
                if (this.field885[var4] == arg0) {
                    return Statics.field844.method2767(this.field851[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field851 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field851.length; var3++) {
                var2 &= Statics.field844.method2767(this.field851[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.a(I)Z")
    public final boolean method637() {
        if (this.field851 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field851.length; var2++) {
            var1 &= Statics.field844.method2767(this.field851[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.b(II[[IIIII)Lck;")
    public final class79 method634(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field885 == null) {
            var7 = (long) ((this.field850 << 10) + arg1);
        } else {
            var7 = (long) ((this.field850 << 10) + (arg0 << 3) + arg1);
        }
        class79 var9 = (class79) field876.method3154(var7);
        if (var9 == null) {
            class94 var10 = this.method639(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field846) {
                var10.field1613 = (short) (this.field868 + 64);
                var10.field1640 = (short) (this.field869 + 768);
                var10.method1905();
                var9 = var10;
            } else {
                var9 = var10.method1909(this.field868 + 64, this.field869 + 768, -50, -10, -50);
            }
            field876.method3156(var9, var7);
        }
        if (this.field846) {
            var9 = ((class94) var9).method1897();
        }
        if (this.field849 >= 0) {
            if (var9 instanceof class99) {
                var9 = ((class99) var9).method1968(arg2, arg3, arg4, arg5, true, this.field849);
            } else if (var9 instanceof class94) {
                var9 = ((class94) var9).method1935(arg2, arg3, arg4, arg5, true, this.field849);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.z(II[[IIIIB)Lcu;")
    public final class99 method635(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field885 == null) {
            var7 = (long) ((this.field850 << 10) + arg1);
        } else {
            var7 = (long) ((this.field850 << 10) + (arg0 << 3) + arg1);
        }
        class99 var9 = (class99) field848.method3154(var7);
        if (var9 == null) {
            class94 var10 = this.method639(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1909(this.field868 + 64, this.field869 + 768, -50, -10, -50);
            field848.method3156(var9, var7);
        }
        if (this.field849 >= 0) {
            var9 = var9.method1968(arg2, arg3, arg4, arg5, true, this.field849);
        }
        return var9;
    }

    @ObfuscatedName("ai.w(II[[IIIILap;IB)Lcu;")
    public final class99 method636(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7) {
        long var9;
        if (this.field885 == null) {
            var9 = (long) ((this.field850 << 10) + arg1);
        } else {
            var9 = (long) ((this.field850 << 10) + (arg0 << 3) + arg1);
        }
        class99 var11 = (class99) field848.method3154(var9);
        if (var11 == null) {
            class94 var12 = this.method639(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1909(this.field868 + 64, this.field869 + 768, -50, -10, -50);
            field848.method3156(var11, var9);
        }
        if (arg6 == null && this.field849 == -1) {
            return var11;
        }
        class99 var13;
        if (arg6 == null) {
            var13 = var11.method1996(true);
        } else {
            var13 = arg6.method707(var11, arg7, arg1);
        }
        if (this.field849 >= 0) {
            var13 = var13.method1968(arg2, arg3, arg4, arg5, false, this.field849);
        }
        return var13;
    }

    @ObfuscatedName("ai.j(IIB)Lcd;")
    public final class94 method639(int arg0, int arg1) {
        class94 var3 = null;
        if (this.field885 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field851 == null) {
                return null;
            }
            boolean var4 = this.field873;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field851.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field851[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class94) field843.method3154((long) var7);
                if (var3 == null) {
                    var3 = class94.method1890(Statics.field844, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1903();
                    }
                    field843.method3156(var3, (long) var7);
                }
                if (var5 > 1) {
                    field860[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class94(field860, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field885.length; var9++) {
                if (this.field885[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field851[var8];
            boolean var11 = this.field873 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class94) field843.method3154((long) var10);
            if (var3 == null) {
                var3 = class94.method1890(Statics.field844, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1903();
                }
                field843.method3156(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field875 == 128 && this.field863 == 128 && this.field877 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field878 == 0 && this.field879 == 0 && this.field880 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class94 var14 = new class94(var3, arg1 == 0 && !var12 && !var13, this.field856 == null, this.field847 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1899(256);
            var14.method1900(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1911();
        } else if (var15 == 2) {
            var14.method1916();
        } else if (var15 == 3) {
            var14.method1898();
        }
        if (this.field856 != null) {
            for (int var16 = 0; var16 < this.field856.length; var16++) {
                var14.method1901(this.field856[var16], this.field855[var16]);
            }
        }
        if (this.field847 != null) {
            for (int var17 = 0; var17 < this.field847.length; var17++) {
                var14.method1902(this.field847[var17], this.field857[var17]);
            }
        }
        if (var12) {
            var14.method1904(this.field875, this.field863, this.field877);
        }
        if (var13) {
            var14.method1900(this.field878, this.field879, this.field880);
        }
        return var14;
    }

    @ObfuscatedName("ai.p(I)Lai;")
    public final class37 method661() {
        int var1 = -1;
        if (this.field852 != -1) {
            var1 = class157.method82(this.field852);
        } else if (this.field886 != -1) {
            var1 = class157.field2678[this.field886];
        }
        return var1 < 0 || var1 >= this.field884.length || this.field884[var1] == -1 ? null : method2581(this.field884[var1]);
    }

    @ObfuscatedName("ai.n(S)Z")
    public boolean method630() {
        if (this.field884 == null) {
            return this.field864 != -1 || this.field891 != null;
        }
        for (int var1 = 0; var1 < this.field884.length; var1++) {
            if (this.field884[var1] != -1) {
                class37 var2 = method2581(this.field884[var1]);
                if (var2.field864 != -1 || var2.field891 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

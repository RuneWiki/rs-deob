package deob;

@ObfuscatedName("an")
public class class37 extends class185 {

    @ObfuscatedName("an.c")
    public static boolean field863 = false;

    @ObfuscatedName("an.r")
    public static class174 field842 = new class174(64);

    @ObfuscatedName("an.f")
    public static class174 field843 = new class174(500);

    @ObfuscatedName("an.l")
    public static class174 field844 = new class174(30);

    @ObfuscatedName("an.b")
    public static class174 field840 = new class174(30);

    @ObfuscatedName("an.k")
    public static class94[] field846 = new class94[4];

    @ObfuscatedName("an.g")
    public int field871;

    @ObfuscatedName("an.v")
    public int[] field848;

    @ObfuscatedName("an.i")
    public int[] field872;

    @ObfuscatedName("an.x")
    public String field850 = "null";

    @ObfuscatedName("an.h")
    public short[] field851;

    @ObfuscatedName("an.w")
    public short[] field852;

    @ObfuscatedName("an.s")
    public short[] field853;

    @ObfuscatedName("an.p")
    public short[] field854;

    @ObfuscatedName("an.z")
    public int field855 = 1;

    @ObfuscatedName("an.n")
    public int field885 = 1;

    @ObfuscatedName("an.u")
    public int field857 = 2;

    @ObfuscatedName("an.a")
    public boolean field858 = true;

    @ObfuscatedName("an.d")
    public int field886 = -1;

    @ObfuscatedName("an.m")
    public int field864 = -1;

    @ObfuscatedName("an.q")
    public boolean field861 = false;

    @ObfuscatedName("an.e")
    public boolean field877 = false;

    @ObfuscatedName("an.t")
    public int field849 = -1;

    @ObfuscatedName("an.o")
    public int field865 = 16;

    @ObfuscatedName("an.at")
    public int field847 = 0;

    @ObfuscatedName("an.ag")
    public int field866 = 0;

    @ObfuscatedName("an.ae")
    public String[] field867 = new String[5];

    @ObfuscatedName("an.ak")
    public int field860 = -1;

    @ObfuscatedName("an.ap")
    public int field869 = -1;

    @ObfuscatedName("an.ao")
    public boolean field870 = false;

    @ObfuscatedName("an.ac")
    public boolean field887 = true;

    @ObfuscatedName("an.as")
    public int field862 = 128;

    @ObfuscatedName("an.ai")
    public int field873 = 128;

    @ObfuscatedName("an.ab")
    public int field874 = 128;

    @ObfuscatedName("an.an")
    public int field875 = 0;

    @ObfuscatedName("an.ah")
    public int field876 = 0;

    @ObfuscatedName("an.ad")
    public int field879 = 0;

    @ObfuscatedName("an.af")
    public boolean field878 = false;

    @ObfuscatedName("an.aj")
    public boolean field881 = false;

    @ObfuscatedName("an.am")
    public int field880 = -1;

    @ObfuscatedName("an.ay")
    public int[] field868;

    @ObfuscatedName("an.au")
    public int field882 = -1;

    @ObfuscatedName("an.aa")
    public int field883 = -1;

    @ObfuscatedName("an.aq")
    public int field884 = -1;

    @ObfuscatedName("an.av")
    public int field859 = 0;

    @ObfuscatedName("an.aw")
    public int field856 = 0;

    @ObfuscatedName("an.az")
    public int field845 = 0;

    @ObfuscatedName("an.al")
    public int[] field888;

    @ObfuscatedName("ai.c(Ler;Ler;ZI)V")
    public static void method597(class149 arg0, class149 arg1, boolean arg2) {
        Statics.field841 = arg0;
        Statics.field3013 = arg1;
        field863 = arg2;
    }

    @ObfuscatedName("ar.j(II)Lan;")
    public static class37 method1041(int arg0) {
        class37 var1 = (class37) field842.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field841.method2746(6, arg0);
        class37 var3 = new class37();
        var3.field871 = arg0;
        if (var2 != null) {
            var3.method633(new class108(var2));
        }
        var3.method632();
        if (var3.field881) {
            var3.field857 = 0;
            var3.field858 = false;
        }
        field842.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.y(I)V")
    public void method632() {
        if (this.field886 == -1) {
            this.field886 = 0;
            if (this.field848 != null && (this.field872 == null || this.field872[0] == 10)) {
                this.field886 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field867[var1] != null) {
                    this.field886 = 1;
                }
            }
        }
        if (this.field880 == -1) {
            this.field880 = this.field857 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("an.r(Ldx;B)V")
    public void method633(class108 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method634(arg0, var2);
        }
    }

    @ObfuscatedName("an.f(Ldx;II)V")
    public void method634(class108 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2134();
            if (var3 > 0) {
                if (this.field848 == null || field863) {
                    this.field872 = new int[var3];
                    this.field848 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field848[var4] = arg0.method2136();
                        this.field872[var4] = arg0.method2134();
                    }
                } else {
                    arg0.field1826 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field850 = arg0.method2216();
        } else if (arg1 == 5) {
            int var5 = arg0.method2134();
            if (var5 > 0) {
                if (this.field848 == null || field863) {
                    this.field872 = null;
                    this.field848 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field848[var6] = arg0.method2136();
                    }
                } else {
                    arg0.field1826 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field855 = arg0.method2134();
        } else if (arg1 == 15) {
            this.field885 = arg0.method2134();
        } else if (arg1 == 17) {
            this.field857 = 0;
            this.field858 = false;
        } else if (arg1 == 18) {
            this.field858 = false;
        } else if (arg1 == 19) {
            this.field886 = arg0.method2134();
        } else if (arg1 == 21) {
            this.field864 = 0;
        } else if (arg1 == 22) {
            this.field861 = true;
        } else if (arg1 == 23) {
            this.field877 = true;
        } else if (arg1 == 24) {
            this.field849 = arg0.method2136();
            if (this.field849 == 65535) {
                this.field849 = -1;
            }
        } else if (arg1 == 27) {
            this.field857 = 1;
        } else if (arg1 == 28) {
            this.field865 = arg0.method2134();
        } else if (arg1 == 29) {
            this.field847 = arg0.method2229();
        } else if (arg1 == 39) {
            this.field866 = arg0.method2229() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field867[arg1 - 30] = arg0.method2216();
            if (this.field867[arg1 - 30].equalsIgnoreCase(class145.field2153)) {
                this.field867[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2134();
            this.field851 = new short[var7];
            this.field852 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field851[var8] = (short) arg0.method2136();
                this.field852[var8] = (short) arg0.method2136();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2134();
            this.field853 = new short[var9];
            this.field854 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field853[var10] = (short) arg0.method2136();
                this.field854[var10] = (short) arg0.method2136();
            }
        } else if (arg1 == 60) {
            this.field860 = arg0.method2136();
        } else if (arg1 == 62) {
            this.field870 = true;
        } else if (arg1 == 64) {
            this.field887 = false;
        } else if (arg1 == 65) {
            this.field862 = arg0.method2136();
        } else if (arg1 == 66) {
            this.field873 = arg0.method2136();
        } else if (arg1 == 67) {
            this.field874 = arg0.method2136();
        } else if (arg1 == 68) {
            this.field869 = arg0.method2136();
        } else if (arg1 == 69) {
            arg0.method2134();
        } else if (arg1 == 70) {
            this.field875 = arg0.method2137();
        } else if (arg1 == 71) {
            this.field876 = arg0.method2137();
        } else if (arg1 == 72) {
            this.field879 = arg0.method2137();
        } else if (arg1 == 73) {
            this.field878 = true;
        } else if (arg1 == 74) {
            this.field881 = true;
        } else if (arg1 == 75) {
            this.field880 = arg0.method2134();
        } else if (arg1 == 77) {
            this.field882 = arg0.method2136();
            if (this.field882 == 65535) {
                this.field882 = -1;
            }
            this.field883 = arg0.method2136();
            if (this.field883 == 65535) {
                this.field883 = -1;
            }
            int var11 = arg0.method2134();
            this.field868 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field868[var12] = arg0.method2136();
                if (this.field868[var12] == 65535) {
                    this.field868[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field884 = arg0.method2136();
            this.field859 = arg0.method2134();
        } else if (arg1 == 79) {
            this.field856 = arg0.method2136();
            this.field845 = arg0.method2136();
            this.field859 = arg0.method2134();
            int var13 = arg0.method2134();
            this.field888 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field888[var14] = arg0.method2136();
            }
        } else if (arg1 == 81) {
            this.field864 = arg0.method2134() * 256;
        }
    }

    @ObfuscatedName("an.l(II)Z")
    public final boolean method635(int arg0) {
        if (this.field872 != null) {
            for (int var4 = 0; var4 < this.field872.length; var4++) {
                if (this.field872[var4] == arg0) {
                    return Statics.field3013.method2777(this.field848[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field848 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field848.length; var3++) {
                var2 &= Statics.field3013.method2777(this.field848[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("an.b(I)Z")
    public final boolean method636() {
        if (this.field848 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field848.length; var2++) {
            var1 &= Statics.field3013.method2777(this.field848[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("an.k(II[[IIIII)Lcg;")
    public final class79 method656(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field872 == null) {
            var7 = (long) ((this.field871 << 10) + arg1);
        } else {
            var7 = (long) ((this.field871 << 10) + (arg0 << 3) + arg1);
        }
        class79 var9 = (class79) field844.method3178(var7);
        if (var9 == null) {
            class94 var10 = this.method640(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field861) {
                var10.field1618 = (short) (this.field847 + 64);
                var10.field1607 = (short) (this.field866 + 768);
                var10.method1916();
                var9 = var10;
            } else {
                var9 = var10.method1922(this.field847 + 64, this.field866 + 768, -50, -10, -50);
            }
            field844.method3167(var9, var7);
        }
        if (this.field861) {
            var9 = ((class94) var9).method1933();
        }
        if (this.field864 >= 0) {
            if (var9 instanceof class99) {
                var9 = ((class99) var9).method2018(arg2, arg3, arg4, arg5, true, this.field864);
            } else if (var9 instanceof class94) {
                var9 = ((class94) var9).method1907(arg2, arg3, arg4, arg5, true, this.field864);
            }
        }
        return var9;
    }

    @ObfuscatedName("an.g(II[[IIIIB)Lcl;")
    public final class99 method638(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field872 == null) {
            var7 = (long) ((this.field871 << 10) + arg1);
        } else {
            var7 = (long) ((this.field871 << 10) + (arg0 << 3) + arg1);
        }
        class99 var9 = (class99) field840.method3178(var7);
        if (var9 == null) {
            class94 var10 = this.method640(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1922(this.field847 + 64, this.field866 + 768, -50, -10, -50);
            field840.method3167(var9, var7);
        }
        if (this.field864 >= 0) {
            var9 = var9.method2018(arg2, arg3, arg4, arg5, true, this.field864);
        }
        return var9;
    }

    @ObfuscatedName("an.v(II[[IIIILad;IB)Lcl;")
    public final class99 method639(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7) {
        long var9;
        if (this.field872 == null) {
            var9 = (long) ((this.field871 << 10) + arg1);
        } else {
            var9 = (long) ((this.field871 << 10) + (arg0 << 3) + arg1);
        }
        class99 var11 = (class99) field840.method3178(var9);
        if (var11 == null) {
            class94 var12 = this.method640(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1922(this.field847 + 64, this.field866 + 768, -50, -10, -50);
            field840.method3167(var11, var9);
        }
        if (arg6 == null && this.field864 == -1) {
            return var11;
        }
        class99 var13;
        if (arg6 == null) {
            var13 = var11.method1986(true);
        } else {
            var13 = arg6.method696(var11, arg7, arg1);
        }
        if (this.field864 >= 0) {
            var13 = var13.method2018(arg2, arg3, arg4, arg5, false, this.field864);
        }
        return var13;
    }

    @ObfuscatedName("an.i(III)Lce;")
    public final class94 method640(int arg0, int arg1) {
        class94 var3 = null;
        if (this.field872 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field848 == null) {
                return null;
            }
            boolean var4 = this.field870;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field848.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field848[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class94) field843.method3178((long) var7);
                if (var3 == null) {
                    var3 = class94.method1955(Statics.field3013, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1901();
                    }
                    field843.method3167(var3, (long) var7);
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
            for (int var9 = 0; var9 < this.field872.length; var9++) {
                if (this.field872[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field848[var8];
            boolean var11 = this.field870 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class94) field843.method3178((long) var10);
            if (var3 == null) {
                var3 = class94.method1955(Statics.field3013, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1901();
                }
                field843.method3167(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field862 == 128 && this.field873 == 128 && this.field874 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field875 == 0 && this.field876 == 0 && this.field879 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class94 var14 = new class94(var3, arg1 == 0 && !var12 && !var13, this.field851 == null, this.field853 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1912(256);
            var14.method1910(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1909();
        } else if (var15 == 2) {
            var14.method1904();
        } else if (var15 == 3) {
            var14.method1911();
        }
        if (this.field851 != null) {
            for (int var16 = 0; var16 < this.field851.length; var16++) {
                var14.method1914(this.field851[var16], this.field852[var16]);
            }
        }
        if (this.field853 != null) {
            for (int var17 = 0; var17 < this.field853.length; var17++) {
                var14.method1915(this.field853[var17], this.field854[var17]);
            }
        }
        if (var12) {
            var14.method1917(this.field862, this.field873, this.field874);
        }
        if (var13) {
            var14.method1910(this.field875, this.field876, this.field879);
        }
        return var14;
    }

    @ObfuscatedName("an.x(B)Lan;")
    public final class37 method673() {
        int var1 = -1;
        if (this.field882 != -1) {
            var1 = class157.method461(this.field882);
        } else if (this.field883 != -1) {
            var1 = class157.field2671[this.field883];
        }
        return var1 < 0 || var1 >= this.field868.length || this.field868[var1] == -1 ? null : method1041(this.field868[var1]);
    }

    @ObfuscatedName("an.h(I)Z")
    public boolean method642() {
        if (this.field868 == null) {
            return this.field884 != -1 || this.field888 != null;
        }
        for (int var1 = 0; var1 < this.field868.length; var1++) {
            if (this.field868[var1] != -1) {
                class37 var2 = method1041(this.field868[var1]);
                if (var2.field884 != -1 || var2.field888 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

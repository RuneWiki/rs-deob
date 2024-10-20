package deob;

@ObfuscatedName("gb")
public class class198 extends class130 {

    @ObfuscatedName("gb.k")
    public static boolean field2879 = false;

    @ObfuscatedName("gb.r")
    public static class125 field2883 = new class125(64);

    @ObfuscatedName("gb.w")
    public static class125 field2878 = new class125(500);

    @ObfuscatedName("gb.j")
    public static class125 field2907 = new class125(30);

    @ObfuscatedName("gb.q")
    public static class125 field2880 = new class125(30);

    @ObfuscatedName("gb.d")
    public static class77[] field2881 = new class77[4];

    @ObfuscatedName("gb.n")
    public int field2882;

    @ObfuscatedName("gb.c")
    public int[] field2927;

    @ObfuscatedName("gb.s")
    public int[] field2884;

    @ObfuscatedName("gb.g")
    public String field2885 = "null";

    @ObfuscatedName("gb.i")
    public short[] field2886;

    @ObfuscatedName("gb.v")
    public short[] field2905;

    @ObfuscatedName("gb.a")
    public short[] field2888;

    @ObfuscatedName("gb.h")
    public short[] field2914;

    @ObfuscatedName("gb.p")
    public int field2919 = 1;

    @ObfuscatedName("gb.t")
    public int field2891 = 1;

    @ObfuscatedName("gb.f")
    public int field2902 = 2;

    @ObfuscatedName("gb.z")
    public boolean field2877 = true;

    @ObfuscatedName("gb.u")
    public int field2911 = -1;

    @ObfuscatedName("gb.b")
    public int field2895 = -1;

    @ObfuscatedName("gb.m")
    public boolean field2894 = false;

    @ObfuscatedName("gb.e")
    public boolean field2897 = false;

    @ObfuscatedName("gb.l")
    public int field2887 = -1;

    @ObfuscatedName("gb.x")
    public int field2899 = 16;

    @ObfuscatedName("gb.ap")
    public int field2889 = 0;

    @ObfuscatedName("gb.aq")
    public int field2912 = 0;

    @ObfuscatedName("gb.aw")
    public String[] field2893 = new String[5];

    @ObfuscatedName("gb.as")
    public int field2900 = -1;

    @ObfuscatedName("gb.ah")
    public int field2904 = -1;

    @ObfuscatedName("gb.aa")
    public boolean field2890 = false;

    @ObfuscatedName("gb.ai")
    public boolean field2906 = true;

    @ObfuscatedName("gb.af")
    public int field2918 = 128;

    @ObfuscatedName("gb.aj")
    public int field2908 = 128;

    @ObfuscatedName("gb.am")
    public int field2909 = 128;

    @ObfuscatedName("gb.ar")
    public int field2910 = 0;

    @ObfuscatedName("gb.ad")
    public int field2903 = 0;

    @ObfuscatedName("gb.ay")
    public int field2896 = 0;

    @ObfuscatedName("gb.ao")
    public boolean field2913 = false;

    @ObfuscatedName("gb.ac")
    public boolean field2892 = false;

    @ObfuscatedName("gb.ag")
    public int field2915 = -1;

    @ObfuscatedName("gb.at")
    public int[] field2916;

    @ObfuscatedName("gb.au")
    public int field2917 = -1;

    @ObfuscatedName("gb.ax")
    public int field2898 = -1;

    @ObfuscatedName("gb.ae")
    public int field2901 = -1;

    @ObfuscatedName("gb.ab")
    public int field2920 = 0;

    @ObfuscatedName("gb.al")
    public int field2875 = 0;

    @ObfuscatedName("gb.az")
    public int field2922 = 0;

    @ObfuscatedName("gb.av")
    public int[] field2923;

    @ObfuscatedName("ds.k(Lgh;Lgh;ZI)V")
    public static void method2036(class183 arg0, class183 arg1, boolean arg2) {
        Statics.field2876 = arg0;
        Statics.field2642 = arg1;
        field2879 = arg2;
    }

    @ObfuscatedName("fc.y(IB)Lgb;")
    public static class198 method2703(int arg0) {
        class198 var1 = (class198) field2883.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2876.method3065(6, arg0);
        class198 var3 = new class198();
        var3.field2882 = arg0;
        if (var2 != null) {
            var3.method3422(new class161(var2));
        }
        var3.method3383();
        if (var3.field2892) {
            var3.field2902 = 0;
            var3.field2877 = false;
        }
        field2883.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gb.o(I)V")
    public void method3383() {
        if (this.field2911 == -1) {
            this.field2911 = 0;
            if (this.field2927 != null && (this.field2884 == null || this.field2884[0] == 10)) {
                this.field2911 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2893[var1] != null) {
                    this.field2911 = 1;
                }
            }
        }
        if (this.field2915 == -1) {
            this.field2915 = this.field2902 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gb.r(Lfm;I)V")
    public void method3422(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3385(arg0, var2);
        }
    }

    @ObfuscatedName("gb.w(Lfm;II)V")
    public void method3385(class161 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2733();
            if (var3 > 0) {
                if (this.field2927 == null || field2879) {
                    this.field2884 = new int[var3];
                    this.field2927 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2927[var4] = arg0.method2735();
                        this.field2884[var4] = arg0.method2733();
                    }
                } else {
                    arg0.field2267 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2885 = arg0.method2740();
        } else if (arg1 == 5) {
            int var5 = arg0.method2733();
            if (var5 > 0) {
                if (this.field2927 == null || field2879) {
                    this.field2884 = null;
                    this.field2927 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2927[var6] = arg0.method2735();
                    }
                } else {
                    arg0.field2267 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2919 = arg0.method2733();
        } else if (arg1 == 15) {
            this.field2891 = arg0.method2733();
        } else if (arg1 == 17) {
            this.field2902 = 0;
            this.field2877 = false;
        } else if (arg1 == 18) {
            this.field2877 = false;
        } else if (arg1 == 19) {
            this.field2911 = arg0.method2733();
        } else if (arg1 == 21) {
            this.field2895 = 0;
        } else if (arg1 == 22) {
            this.field2894 = true;
        } else if (arg1 == 23) {
            this.field2897 = true;
        } else if (arg1 == 24) {
            this.field2887 = arg0.method2735();
            if (this.field2887 == 65535) {
                this.field2887 = -1;
            }
        } else if (arg1 == 27) {
            this.field2902 = 1;
        } else if (arg1 == 28) {
            this.field2899 = arg0.method2733();
        } else if (arg1 == 29) {
            this.field2889 = arg0.method2734();
        } else if (arg1 == 39) {
            this.field2912 = arg0.method2734();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2893[arg1 - 30] = arg0.method2740();
            if (this.field2893[arg1 - 30].equalsIgnoreCase(class174.field2344)) {
                this.field2893[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2733();
            this.field2886 = new short[var7];
            this.field2905 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2886[var8] = (short) arg0.method2735();
                this.field2905[var8] = (short) arg0.method2735();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2733();
            this.field2888 = new short[var9];
            this.field2914 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2888[var10] = (short) arg0.method2735();
                this.field2914[var10] = (short) arg0.method2735();
            }
        } else if (arg1 == 60) {
            this.field2900 = arg0.method2735();
        } else if (arg1 == 62) {
            this.field2890 = true;
        } else if (arg1 == 64) {
            this.field2906 = false;
        } else if (arg1 == 65) {
            this.field2918 = arg0.method2735();
        } else if (arg1 == 66) {
            this.field2908 = arg0.method2735();
        } else if (arg1 == 67) {
            this.field2909 = arg0.method2735();
        } else if (arg1 == 68) {
            this.field2904 = arg0.method2735();
        } else if (arg1 == 69) {
            arg0.method2733();
        } else if (arg1 == 70) {
            this.field2910 = arg0.method2736();
        } else if (arg1 == 71) {
            this.field2903 = arg0.method2736();
        } else if (arg1 == 72) {
            this.field2896 = arg0.method2736();
        } else if (arg1 == 73) {
            this.field2913 = true;
        } else if (arg1 == 74) {
            this.field2892 = true;
        } else if (arg1 == 75) {
            this.field2915 = arg0.method2733();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2917 = arg0.method2735();
            if (this.field2917 == 65535) {
                this.field2917 = -1;
            }
            this.field2898 = arg0.method2735();
            if (this.field2898 == 65535) {
                this.field2898 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2735();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2733();
            this.field2916 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2916[var15] = arg0.method2735();
                if (this.field2916[var15] == 65535) {
                    this.field2916[var15] = -1;
                }
            }
            this.field2916[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2901 = arg0.method2735();
            this.field2920 = arg0.method2733();
        } else if (arg1 == 79) {
            this.field2875 = arg0.method2735();
            this.field2922 = arg0.method2735();
            this.field2920 = arg0.method2733();
            int var11 = arg0.method2733();
            this.field2923 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2923[var12] = arg0.method2735();
            }
        } else if (arg1 == 81) {
            this.field2895 = arg0.method2733() * 256;
        }
    }

    @ObfuscatedName("gb.j(IB)Z")
    public final boolean method3401(int arg0) {
        if (this.field2884 != null) {
            for (int var4 = 0; var4 < this.field2884.length; var4++) {
                if (this.field2884[var4] == arg0) {
                    return Statics.field2642.method3067(this.field2927[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2927 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2927.length; var3++) {
                var2 &= Statics.field2642.method3067(this.field2927[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gb.c(I)Z")
    public final boolean method3386() {
        if (this.field2927 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2927.length; var2++) {
            var1 &= Statics.field2642.method3067(this.field2927[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gb.g(II[[IIIII)Lcg;")
    public final class90 method3387(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2884 == null) {
            var7 = (long) ((this.field2882 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2882 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2907.method2159(var7);
        if (var9 == null) {
            class77 var10 = this.method3390(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2894) {
                var10.field1256 = (short) (this.field2889 + 64);
                var10.field1257 = (short) (this.field2912 * 25 + 768);
                var10.method1401();
                var9 = var10;
            } else {
                var9 = var10.method1405(this.field2889 + 64, this.field2912 * 25 + 768, -50, -10, -50);
            }
            field2907.method2164(var9, var7);
        }
        if (this.field2894) {
            var9 = ((class77) var9).method1389();
        }
        if (this.field2895 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1478(arg2, arg3, arg4, arg5, true, this.field2895);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1390(arg2, arg3, arg4, arg5, true, this.field2895);
            }
        }
        return var9;
    }

    @ObfuscatedName("gb.i(II[[IIIII)Lcu;")
    public final class83 method3388(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2884 == null) {
            var7 = (long) ((this.field2882 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2882 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2880.method2159(var7);
        if (var9 == null) {
            class77 var10 = this.method3390(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1405(this.field2889 + 64, this.field2912 * 25 + 768, -50, -10, -50);
            field2880.method2164(var9, var7);
        }
        if (this.field2895 >= 0) {
            var9 = var9.method1478(arg2, arg3, arg4, arg5, true, this.field2895);
        }
        return var9;
    }

    @ObfuscatedName("gb.v(II[[IIIILgc;II)Lcu;")
    public final class83 method3389(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2884 == null) {
            var9 = (long) ((this.field2882 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2882 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2880.method2159(var9);
        if (var11 == null) {
            class77 var12 = this.method3390(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1405(this.field2889 + 64, this.field2912 * 25 + 768, -50, -10, -50);
            field2880.method2164(var11, var9);
        }
        if (arg6 == null && this.field2895 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1479(true);
        } else {
            var13 = arg6.method3556(var11, arg7, arg1);
        }
        if (this.field2895 >= 0) {
            var13 = var13.method1478(arg2, arg3, arg4, arg5, false, this.field2895);
        }
        return var13;
    }

    @ObfuscatedName("gb.a(III)Lbg;")
    public final class77 method3390(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2884 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2927 == null) {
                return null;
            }
            boolean var4 = this.field2890;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2927.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2927[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2878.method2159((long) var7);
                if (var3 == null) {
                    var3 = class77.method1384(Statics.field2642, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1418();
                    }
                    field2878.method2164(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2881[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2881, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2884.length; var9++) {
                if (this.field2884[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2927[var8];
            boolean var11 = this.field2890 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2878.method2159((long) var10);
            if (var3 == null) {
                var3 = class77.method1384(Statics.field2642, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1418();
                }
                field2878.method2164(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2918 == 128 && this.field2908 == 128 && this.field2909 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2910 == 0 && this.field2903 == 0 && this.field2896 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2886 == null, this.field2888 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1387(256);
            var14.method1396(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1392();
        } else if (var15 == 2) {
            var14.method1393();
        } else if (var15 == 3) {
            var14.method1394();
        }
        if (this.field2886 != null) {
            for (int var16 = 0; var16 < this.field2886.length; var16++) {
                var14.method1388(this.field2886[var16], this.field2905[var16]);
            }
        }
        if (this.field2888 != null) {
            for (int var17 = 0; var17 < this.field2888.length; var17++) {
                var14.method1398(this.field2888[var17], this.field2914[var17]);
            }
        }
        if (var12) {
            var14.method1429(this.field2918, this.field2908, this.field2909);
        }
        if (var13) {
            var14.method1396(this.field2910, this.field2903, this.field2896);
        }
        return var14;
    }

    @ObfuscatedName("gb.h(I)Lgb;")
    public final class198 method3409() {
        int var1 = -1;
        if (this.field2917 != -1) {
            var1 = class147.method128(this.field2917);
        } else if (this.field2898 != -1) {
            var1 = class147.field2012[this.field2898];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2916.length - 1) {
            var2 = this.field2916[var1];
        } else {
            var2 = this.field2916[this.field2916.length - 1];
        }
        return var2 == -1 ? null : method2703(var2);
    }

    @ObfuscatedName("k.p(B)V")
    public static void method1() {
        field2883.method2161();
        field2878.method2161();
        field2907.method2161();
        field2880.method2161();
    }

    @ObfuscatedName("gb.t(B)Z")
    public boolean method3392() {
        if (this.field2916 == null) {
            return this.field2901 != -1 || this.field2923 != null;
        }
        for (int var1 = 0; var1 < this.field2916.length; var1++) {
            if (this.field2916[var1] != -1) {
                class198 var2 = method2703(this.field2916[var1]);
                if (var2.field2901 != -1 || var2.field2923 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

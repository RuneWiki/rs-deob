package deob;

@ObfuscatedName("gh")
public class class198 extends class130 {

    @ObfuscatedName("gh.n")
    public static boolean field2936 = false;

    @ObfuscatedName("gh.h")
    public static class125 field2903 = new class125(64);

    @ObfuscatedName("gh.w")
    public static class125 field2905 = new class125(500);

    @ObfuscatedName("gh.r")
    public static class125 field2891 = new class125(30);

    @ObfuscatedName("gh.c")
    public static class125 field2897 = new class125(30);

    @ObfuscatedName("gh.p")
    public static class77[] field2898 = new class77[4];

    @ObfuscatedName("gh.g")
    public int field2919;

    @ObfuscatedName("gh.z")
    public int[] field2900;

    @ObfuscatedName("gh.q")
    public int[] field2901;

    @ObfuscatedName("gh.l")
    public String field2902 = "null";

    @ObfuscatedName("gh.y")
    public short[] field2906;

    @ObfuscatedName("gh.e")
    public short[] field2917;

    @ObfuscatedName("gh.x")
    public short[] field2894;

    @ObfuscatedName("gh.f")
    public short[] field2933;

    @ObfuscatedName("gh.s")
    public int field2904 = 1;

    @ObfuscatedName("gh.o")
    public int field2908 = 1;

    @ObfuscatedName("gh.i")
    public int field2909 = 2;

    @ObfuscatedName("gh.a")
    public boolean field2910 = true;

    @ObfuscatedName("gh.b")
    public int field2911 = -1;

    @ObfuscatedName("gh.j")
    public int field2912 = -1;

    @ObfuscatedName("gh.k")
    public boolean field2940 = false;

    @ObfuscatedName("gh.v")
    public boolean field2914 = false;

    @ObfuscatedName("gh.u")
    public int field2915 = -1;

    @ObfuscatedName("gh.t")
    public int field2916 = 16;

    @ObfuscatedName("gh.av")
    public int field2938 = 0;

    @ObfuscatedName("gh.aw")
    public int field2935 = 0;

    @ObfuscatedName("gh.ay")
    public String[] field2895 = new String[5];

    @ObfuscatedName("gh.as")
    public int field2920 = -1;

    @ObfuscatedName("gh.ai")
    public int field2921 = -1;

    @ObfuscatedName("gh.aq")
    public boolean field2922 = false;

    @ObfuscatedName("gh.ac")
    public boolean field2892 = true;

    @ObfuscatedName("gh.ae")
    public int field2924 = 128;

    @ObfuscatedName("gh.ag")
    public int field2925 = 128;

    @ObfuscatedName("gh.am")
    public int field2926 = 128;

    @ObfuscatedName("gh.af")
    public int field2927 = 0;

    @ObfuscatedName("gh.ap")
    public int field2928 = 0;

    @ObfuscatedName("gh.az")
    public int field2929 = 0;

    @ObfuscatedName("gh.ab")
    public boolean field2930 = false;

    @ObfuscatedName("gh.ax")
    public boolean field2931 = false;

    @ObfuscatedName("gh.ad")
    public int field2932 = -1;

    @ObfuscatedName("gh.ah")
    public int[] field2918;

    @ObfuscatedName("gh.al")
    public int field2934 = -1;

    @ObfuscatedName("gh.aa")
    public int field2907 = -1;

    @ObfuscatedName("gh.an")
    public int field2923 = -1;

    @ObfuscatedName("gh.at")
    public int field2937 = 0;

    @ObfuscatedName("gh.au")
    public int field2899 = 0;

    @ObfuscatedName("gh.ak")
    public int field2939 = 0;

    @ObfuscatedName("gh.ar")
    public int[] field2896;

    @ObfuscatedName("f.n(II)Lgh;")
    public static class198 method197(int arg0) {
        class198 var1 = (class198) field2903.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2913.method3093(6, arg0);
        class198 var3 = new class198();
        var3.field2919 = arg0;
        if (var2 != null) {
            var3.method3410(new class161(var2));
        }
        var3.method3426();
        if (var3.field2931) {
            var3.field2909 = 0;
            var3.field2910 = false;
        }
        field2903.method2219(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.d(B)V")
    public void method3426() {
        if (this.field2911 == -1) {
            this.field2911 = 0;
            if (this.field2900 != null && (this.field2901 == null || this.field2901[0] == 10)) {
                this.field2911 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2895[var1] != null) {
                    this.field2911 = 1;
                }
            }
        }
        if (this.field2932 == -1) {
            this.field2932 = this.field2909 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gh.m(Lfa;I)V")
    public void method3410(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3432(arg0, var2);
        }
    }

    @ObfuscatedName("gh.h(Lfa;IB)V")
    public void method3432(class161 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2823();
            if (var3 > 0) {
                if (this.field2900 == null || field2936) {
                    this.field2901 = new int[var3];
                    this.field2900 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2900[var4] = arg0.method2887();
                        this.field2901[var4] = arg0.method2823();
                    }
                } else {
                    arg0.field2285 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2902 = arg0.method2847();
        } else if (arg1 == 5) {
            int var5 = arg0.method2823();
            if (var5 > 0) {
                if (this.field2900 == null || field2936) {
                    this.field2901 = null;
                    this.field2900 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2900[var6] = arg0.method2887();
                    }
                } else {
                    arg0.field2285 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2904 = arg0.method2823();
        } else if (arg1 == 15) {
            this.field2908 = arg0.method2823();
        } else if (arg1 == 17) {
            this.field2909 = 0;
            this.field2910 = false;
        } else if (arg1 == 18) {
            this.field2910 = false;
        } else if (arg1 == 19) {
            this.field2911 = arg0.method2823();
        } else if (arg1 == 21) {
            this.field2912 = 0;
        } else if (arg1 == 22) {
            this.field2940 = true;
        } else if (arg1 == 23) {
            this.field2914 = true;
        } else if (arg1 == 24) {
            this.field2915 = arg0.method2887();
            if (this.field2915 == 65535) {
                this.field2915 = -1;
            }
        } else if (arg1 == 27) {
            this.field2909 = 1;
        } else if (arg1 == 28) {
            this.field2916 = arg0.method2823();
        } else if (arg1 == 29) {
            this.field2938 = arg0.method2837();
        } else if (arg1 == 39) {
            this.field2935 = arg0.method2837() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2895[arg1 - 30] = arg0.method2847();
            if (this.field2895[arg1 - 30].equalsIgnoreCase(class174.field2429)) {
                this.field2895[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2823();
            this.field2906 = new short[var7];
            this.field2917 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2906[var8] = (short) arg0.method2887();
                this.field2917[var8] = (short) arg0.method2887();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2823();
            this.field2894 = new short[var9];
            this.field2933 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2894[var10] = (short) arg0.method2887();
                this.field2933[var10] = (short) arg0.method2887();
            }
        } else if (arg1 == 60) {
            this.field2920 = arg0.method2887();
        } else if (arg1 == 62) {
            this.field2922 = true;
        } else if (arg1 == 64) {
            this.field2892 = false;
        } else if (arg1 == 65) {
            this.field2924 = arg0.method2887();
        } else if (arg1 == 66) {
            this.field2925 = arg0.method2887();
        } else if (arg1 == 67) {
            this.field2926 = arg0.method2887();
        } else if (arg1 == 68) {
            this.field2921 = arg0.method2887();
        } else if (arg1 == 69) {
            arg0.method2823();
        } else if (arg1 == 70) {
            this.field2927 = arg0.method2783();
        } else if (arg1 == 71) {
            this.field2928 = arg0.method2783();
        } else if (arg1 == 72) {
            this.field2929 = arg0.method2783();
        } else if (arg1 == 73) {
            this.field2930 = true;
        } else if (arg1 == 74) {
            this.field2931 = true;
        } else if (arg1 == 75) {
            this.field2932 = arg0.method2823();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2934 = arg0.method2887();
            if (this.field2934 == 65535) {
                this.field2934 = -1;
            }
            this.field2907 = arg0.method2887();
            if (this.field2907 == 65535) {
                this.field2907 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2887();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2823();
            this.field2918 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2918[var15] = arg0.method2887();
                if (this.field2918[var15] == 65535) {
                    this.field2918[var15] = -1;
                }
            }
            this.field2918[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2923 = arg0.method2887();
            this.field2937 = arg0.method2823();
        } else if (arg1 == 79) {
            this.field2899 = arg0.method2887();
            this.field2939 = arg0.method2887();
            this.field2937 = arg0.method2823();
            int var11 = arg0.method2823();
            this.field2896 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2896[var12] = arg0.method2887();
            }
        } else if (arg1 == 81) {
            this.field2912 = arg0.method2823() * 256;
        }
    }

    @ObfuscatedName("gh.w(IB)Z")
    public final boolean method3409(int arg0) {
        if (this.field2901 != null) {
            for (int var4 = 0; var4 < this.field2901.length; var4++) {
                if (this.field2901[var4] == arg0) {
                    return Statics.field2893.method3111(this.field2900[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2900 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2900.length; var3++) {
                var2 &= Statics.field2893.method3111(this.field2900[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gh.r(I)Z")
    public final boolean method3445() {
        if (this.field2900 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2900.length; var2++) {
            var1 &= Statics.field2893.method3111(this.field2900[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gh.c(II[[IIIII)Lcz;")
    public final class90 method3411(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2901 == null) {
            var7 = (long) ((this.field2919 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2919 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2891.method2221(var7);
        if (var9 == null) {
            class77 var10 = this.method3434(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2940) {
                var10.field1248 = (short) (this.field2938 + 64);
                var10.field1217 = (short) (this.field2935 + 768);
                var10.method1476();
                var9 = var10;
            } else {
                var9 = var10.method1422(this.field2938 + 64, this.field2935 + 768, -50, -10, -50);
            }
            field2891.method2219(var9, var7);
        }
        if (this.field2940) {
            var9 = ((class77) var9).method1407();
        }
        if (this.field2912 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1491(arg2, arg3, arg4, arg5, true, this.field2912);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1471(arg2, arg3, arg4, arg5, true, this.field2912);
            }
        }
        return var9;
    }

    @ObfuscatedName("gh.z(II[[IIIIB)Lca;")
    public final class83 method3408(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2901 == null) {
            var7 = (long) ((this.field2919 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2919 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2897.method2221(var7);
        if (var9 == null) {
            class77 var10 = this.method3434(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1422(this.field2938 + 64, this.field2935 + 768, -50, -10, -50);
            field2897.method2219(var9, var7);
        }
        if (this.field2912 >= 0) {
            var9 = var9.method1491(arg2, arg3, arg4, arg5, true, this.field2912);
        }
        return var9;
    }

    @ObfuscatedName("gh.q(II[[IIIILgm;II)Lca;")
    public final class83 method3413(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2901 == null) {
            var9 = (long) ((this.field2919 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2919 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2897.method2221(var9);
        if (var11 == null) {
            class77 var12 = this.method3434(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1422(this.field2938 + 64, this.field2935 + 768, -50, -10, -50);
            field2897.method2219(var11, var9);
        }
        if (arg6 == null && this.field2912 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1492(true);
        } else {
            var13 = arg6.method3558(var11, arg7, arg1);
        }
        if (this.field2912 >= 0) {
            var13 = var13.method1491(arg2, arg3, arg4, arg5, false, this.field2912);
        }
        return var13;
    }

    @ObfuscatedName("gh.l(III)Lbz;")
    public final class77 method3434(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2901 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2900 == null) {
                return null;
            }
            boolean var4 = this.field2922;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2900.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2900[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2905.method2221((long) var7);
                if (var3 == null) {
                    var3 = class77.method1401(Statics.field2893, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1417();
                    }
                    field2905.method2219(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2898[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2898, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2901.length; var9++) {
                if (this.field2901[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2900[var8];
            boolean var11 = this.field2922 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2905.method2221((long) var10);
            if (var3 == null) {
                var3 = class77.method1401(Statics.field2893, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1417();
                }
                field2905.method2219(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2924 == 128 && this.field2925 == 128 && this.field2926 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2927 == 0 && this.field2928 == 0 && this.field2929 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2906 == null, this.field2894 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1412(256);
            var14.method1414(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1410();
        } else if (var15 == 2) {
            var14.method1411();
        } else if (var15 == 3) {
            var14.method1450();
        }
        if (this.field2906 != null) {
            for (int var16 = 0; var16 < this.field2906.length; var16++) {
                var14.method1400(this.field2906[var16], this.field2917[var16]);
            }
        }
        if (this.field2894 != null) {
            for (int var17 = 0; var17 < this.field2894.length; var17++) {
                var14.method1416(this.field2894[var17], this.field2933[var17]);
            }
        }
        if (var12) {
            var14.method1418(this.field2924, this.field2925, this.field2926);
        }
        if (var13) {
            var14.method1414(this.field2927, this.field2928, this.field2929);
        }
        return var14;
    }

    @ObfuscatedName("gh.y(B)Lgh;")
    public final class198 method3415() {
        int var1 = -1;
        if (this.field2934 != -1) {
            var1 = class147.method748(this.field2934);
        } else if (this.field2907 != -1) {
            var1 = class147.field2032[this.field2907];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2918.length - 1) {
            var2 = this.field2918[var1];
        } else {
            var2 = this.field2918[this.field2918.length - 1];
        }
        return var2 == -1 ? null : method197(var2);
    }

    @ObfuscatedName("gh.e(I)Z")
    public boolean method3416() {
        if (this.field2918 == null) {
            return this.field2923 != -1 || this.field2896 != null;
        }
        for (int var1 = 0; var1 < this.field2918.length; var1++) {
            if (this.field2918[var1] != -1) {
                class198 var2 = method197(this.field2918[var1]);
                if (var2.field2923 != -1 || var2.field2896 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

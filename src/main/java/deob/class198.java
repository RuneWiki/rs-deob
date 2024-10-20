package deob;

@ObfuscatedName("gv")
public class class198 extends class130 {

    @ObfuscatedName("gv.b")
    public static boolean field2899 = false;

    @ObfuscatedName("gv.t")
    public static class125 field2900 = new class125(64);

    @ObfuscatedName("gv.k")
    public static class125 field2901 = new class125(500);

    @ObfuscatedName("gv.h")
    public static class125 field2935 = new class125(30);

    @ObfuscatedName("gv.n")
    public static class125 field2946 = new class125(30);

    @ObfuscatedName("gv.f")
    public static class77[] field2904 = new class77[4];

    @ObfuscatedName("gv.a")
    public int field2929;

    @ObfuscatedName("gv.r")
    public int[] field2906;

    @ObfuscatedName("gv.x")
    public int[] field2907;

    @ObfuscatedName("gv.z")
    public String field2908 = "null";

    @ObfuscatedName("gv.p")
    public short[] field2909;

    @ObfuscatedName("gv.s")
    public short[] field2910;

    @ObfuscatedName("gv.o")
    public short[] field2928;

    @ObfuscatedName("gv.y")
    public short[] field2912;

    @ObfuscatedName("gv.w")
    public int field2913 = 1;

    @ObfuscatedName("gv.m")
    public int field2914 = 1;

    @ObfuscatedName("gv.u")
    public int field2915 = 2;

    @ObfuscatedName("gv.q")
    public boolean field2916 = true;

    @ObfuscatedName("gv.c")
    public int field2923 = -1;

    @ObfuscatedName("gv.v")
    public int field2918 = -1;

    @ObfuscatedName("gv.e")
    public boolean field2919 = false;

    @ObfuscatedName("gv.j")
    public boolean field2920 = false;

    @ObfuscatedName("gv.d")
    public int field2921 = -1;

    @ObfuscatedName("gv.g")
    public int field2925 = 16;

    @ObfuscatedName("gv.ap")
    public int field2938 = 0;

    @ObfuscatedName("gv.aj")
    public int field2924 = 0;

    @ObfuscatedName("gv.ab")
    public String[] field2911 = new String[5];

    @ObfuscatedName("gv.af")
    public int field2903 = -1;

    @ObfuscatedName("gv.aw")
    public int field2927 = -1;

    @ObfuscatedName("gv.ac")
    public boolean field2917 = false;

    @ObfuscatedName("gv.an")
    public boolean field2905 = true;

    @ObfuscatedName("gv.ae")
    public int field2930 = 128;

    @ObfuscatedName("gv.au")
    public int field2931 = 128;

    @ObfuscatedName("gv.am")
    public int field2932 = 128;

    @ObfuscatedName("gv.as")
    public int field2933 = 0;

    @ObfuscatedName("gv.ay")
    public int field2937 = 0;

    @ObfuscatedName("gv.at")
    public int field2922 = 0;

    @ObfuscatedName("gv.ai")
    public boolean field2936 = false;

    @ObfuscatedName("gv.aa")
    public boolean field2898 = false;

    @ObfuscatedName("gv.ar")
    public int field2944 = -1;

    @ObfuscatedName("gv.ag")
    public int[] field2939;

    @ObfuscatedName("gv.ad")
    public int field2943 = -1;

    @ObfuscatedName("gv.al")
    public int field2941 = -1;

    @ObfuscatedName("gv.ah")
    public int field2942 = -1;

    @ObfuscatedName("gv.ak")
    public int field2940 = 0;

    @ObfuscatedName("gv.ax")
    public int field2948 = 0;

    @ObfuscatedName("gv.av")
    public int field2945 = 0;

    @ObfuscatedName("gv.az")
    public int[] field2934;

    @ObfuscatedName("ey.b(Lgj;Lgj;ZI)V")
    public static void method2514(class183 arg0, class183 arg1, boolean arg2) {
        Statics.field3246 = arg0;
        Statics.field2902 = arg1;
        field2899 = arg2;
    }

    @ObfuscatedName("gs.l(II)Lgv;")
    public static class198 method3471(int arg0) {
        class198 var1 = (class198) field2900.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3246.method3226(6, arg0);
        class198 var3 = new class198();
        var3.field2929 = arg0;
        if (var2 != null) {
            var3.method3489(new class154(var2));
        }
        var3.method3490();
        if (var3.field2898) {
            var3.field2915 = 0;
            var3.field2916 = false;
        }
        field2900.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gv.i(I)V")
    public void method3490() {
        if (this.field2923 == -1) {
            this.field2923 = 0;
            if (this.field2906 != null && (this.field2907 == null || this.field2907[0] == 10)) {
                this.field2923 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2911[var1] != null) {
                    this.field2923 = 1;
                }
            }
        }
        if (this.field2944 == -1) {
            this.field2944 = this.field2915 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gv.t(Leg;I)V")
    public void method3489(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3478(arg0, var2);
        }
    }

    @ObfuscatedName("gv.k(Leg;IB)V")
    public void method3478(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2678();
            if (var3 > 0) {
                if (this.field2906 == null || field2899) {
                    this.field2907 = new int[var3];
                    this.field2906 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2906[var4] = arg0.method2801();
                        this.field2907[var4] = arg0.method2678();
                    }
                } else {
                    arg0.field2085 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2908 = arg0.method2686();
        } else if (arg1 == 5) {
            int var5 = arg0.method2678();
            if (var5 > 0) {
                if (this.field2906 == null || field2899) {
                    this.field2907 = null;
                    this.field2906 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2906[var6] = arg0.method2801();
                    }
                } else {
                    arg0.field2085 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2913 = arg0.method2678();
        } else if (arg1 == 15) {
            this.field2914 = arg0.method2678();
        } else if (arg1 == 17) {
            this.field2915 = 0;
            this.field2916 = false;
        } else if (arg1 == 18) {
            this.field2916 = false;
        } else if (arg1 == 19) {
            this.field2923 = arg0.method2678();
        } else if (arg1 == 21) {
            this.field2918 = 0;
        } else if (arg1 == 22) {
            this.field2919 = true;
        } else if (arg1 == 23) {
            this.field2920 = true;
        } else if (arg1 == 24) {
            this.field2921 = arg0.method2801();
            if (this.field2921 == 65535) {
                this.field2921 = -1;
            }
        } else if (arg1 == 27) {
            this.field2915 = 1;
        } else if (arg1 == 28) {
            this.field2925 = arg0.method2678();
        } else if (arg1 == 29) {
            this.field2938 = arg0.method2679();
        } else if (arg1 == 39) {
            this.field2924 = arg0.method2679();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2911[arg1 - 30] = arg0.method2686();
            if (this.field2911[arg1 - 30].equalsIgnoreCase(class174.field2358)) {
                this.field2911[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2678();
            this.field2909 = new short[var7];
            this.field2910 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2909[var8] = (short) arg0.method2801();
                this.field2910[var8] = (short) arg0.method2801();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2678();
            this.field2928 = new short[var9];
            this.field2912 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2928[var10] = (short) arg0.method2801();
                this.field2912[var10] = (short) arg0.method2801();
            }
        } else if (arg1 == 60) {
            this.field2903 = arg0.method2801();
        } else if (arg1 == 62) {
            this.field2917 = true;
        } else if (arg1 == 64) {
            this.field2905 = false;
        } else if (arg1 == 65) {
            this.field2930 = arg0.method2801();
        } else if (arg1 == 66) {
            this.field2931 = arg0.method2801();
        } else if (arg1 == 67) {
            this.field2932 = arg0.method2801();
        } else if (arg1 == 68) {
            this.field2927 = arg0.method2801();
        } else if (arg1 == 69) {
            arg0.method2678();
        } else if (arg1 == 70) {
            this.field2933 = arg0.method2681();
        } else if (arg1 == 71) {
            this.field2937 = arg0.method2681();
        } else if (arg1 == 72) {
            this.field2922 = arg0.method2681();
        } else if (arg1 == 73) {
            this.field2936 = true;
        } else if (arg1 == 74) {
            this.field2898 = true;
        } else if (arg1 == 75) {
            this.field2944 = arg0.method2678();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2943 = arg0.method2801();
            if (this.field2943 == 65535) {
                this.field2943 = -1;
            }
            this.field2941 = arg0.method2801();
            if (this.field2941 == 65535) {
                this.field2941 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2801();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2678();
            this.field2939 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2939[var15] = arg0.method2801();
                if (this.field2939[var15] == 65535) {
                    this.field2939[var15] = -1;
                }
            }
            this.field2939[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2942 = arg0.method2801();
            this.field2940 = arg0.method2678();
        } else if (arg1 == 79) {
            this.field2948 = arg0.method2801();
            this.field2945 = arg0.method2801();
            this.field2940 = arg0.method2678();
            int var11 = arg0.method2678();
            this.field2934 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2934[var12] = arg0.method2801();
            }
        } else if (arg1 == 81) {
            this.field2918 = arg0.method2678() * 256;
        }
    }

    @ObfuscatedName("gv.x(II)Z")
    public final boolean method3512(int arg0) {
        if (this.field2907 != null) {
            for (int var4 = 0; var4 < this.field2907.length; var4++) {
                if (this.field2907[var4] == arg0) {
                    return Statics.field2902.method3215(this.field2906[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2906 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2906.length; var3++) {
                var2 &= Statics.field2902.method3215(this.field2906[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gv.z(I)Z")
    public final boolean method3479() {
        if (this.field2906 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2906.length; var2++) {
            var1 &= Statics.field2902.method3215(this.field2906[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gv.p(II[[IIIII)Lcb;")
    public final class90 method3480(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2907 == null) {
            var7 = (long) ((this.field2929 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2929 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2935.method2256(var7);
        if (var9 == null) {
            class77 var10 = this.method3483(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2919) {
                var10.field1217 = (short) (this.field2938 + 64);
                var10.field1241 = (short) (this.field2924 * 25 + 768);
                var10.method1460();
                var9 = var10;
            } else {
                var9 = var10.method1467(this.field2938 + 64, this.field2924 * 25 + 768, -50, -10, -50);
            }
            field2935.method2258(var9, var7);
        }
        if (this.field2919) {
            var9 = ((class77) var9).method1449();
        }
        if (this.field2918 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1546(arg2, arg3, arg4, arg5, true, this.field2918);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1483(arg2, arg3, arg4, arg5, true, this.field2918);
            }
        }
        return var9;
    }

    @ObfuscatedName("gv.s(II[[IIIII)Lcs;")
    public final class83 method3501(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2907 == null) {
            var7 = (long) ((this.field2929 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2929 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2946.method2256(var7);
        if (var9 == null) {
            class77 var10 = this.method3483(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1467(this.field2938 + 64, this.field2924 * 25 + 768, -50, -10, -50);
            field2946.method2258(var9, var7);
        }
        if (this.field2918 >= 0) {
            var9 = var9.method1546(arg2, arg3, arg4, arg5, true, this.field2918);
        }
        return var9;
    }

    @ObfuscatedName("gv.o(II[[IIIILgb;IB)Lcs;")
    public final class83 method3482(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2907 == null) {
            var9 = (long) ((this.field2929 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2929 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2946.method2256(var9);
        if (var11 == null) {
            class77 var12 = this.method3483(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1467(this.field2938 + 64, this.field2924 * 25 + 768, -50, -10, -50);
            field2946.method2258(var11, var9);
        }
        if (arg6 == null && this.field2918 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1533(true);
        } else {
            var13 = arg6.method3655(var11, arg7, arg1);
        }
        if (this.field2918 >= 0) {
            var13 = var13.method1546(arg2, arg3, arg4, arg5, false, this.field2918);
        }
        return var13;
    }

    @ObfuscatedName("gv.y(III)Lbh;")
    public final class77 method3483(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2907 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2906 == null) {
                return null;
            }
            boolean var4 = this.field2917;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2906.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2906[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2901.method2256((long) var7);
                if (var3 == null) {
                    var3 = class77.method1486(Statics.field2902, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1458();
                    }
                    field2901.method2258(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2904[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2904, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2907.length; var9++) {
                if (this.field2907[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2906[var8];
            boolean var11 = this.field2917 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2901.method2256((long) var10);
            if (var3 == null) {
                var3 = class77.method1486(Statics.field2902, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1458();
                }
                field2901.method2258(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2930 == 128 && this.field2931 == 128 && this.field2932 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2933 == 0 && this.field2937 == 0 && this.field2922 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2909 == null, this.field2928 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1455(256);
            var14.method1481(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1452();
        } else if (var15 == 2) {
            var14.method1453();
        } else if (var15 == 3) {
            var14.method1454();
        }
        if (this.field2909 != null) {
            for (int var16 = 0; var16 < this.field2909.length; var16++) {
                var14.method1502(this.field2909[var16], this.field2910[var16]);
            }
        }
        if (this.field2928 != null) {
            for (int var17 = 0; var17 < this.field2928.length; var17++) {
                var14.method1464(this.field2928[var17], this.field2912[var17]);
            }
        }
        if (var12) {
            var14.method1459(this.field2930, this.field2931, this.field2932);
        }
        if (var13) {
            var14.method1481(this.field2933, this.field2937, this.field2922);
        }
        return var14;
    }

    @ObfuscatedName("gv.w(B)Lgv;")
    public final class198 method3484() {
        int var1 = -1;
        if (this.field2943 != -1) {
            var1 = class166.method2904(this.field2943);
        } else if (this.field2941 != -1) {
            var1 = class166.field2156[this.field2941];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2939.length - 1) {
            var2 = this.field2939[var1];
        } else {
            var2 = this.field2939[this.field2939.length - 1];
        }
        return var2 == -1 ? null : method3471(var2);
    }

    @ObfuscatedName("dh.m(I)V")
    public static void method2125() {
        field2900.method2257();
        field2901.method2257();
        field2935.method2257();
        field2946.method2257();
    }

    @ObfuscatedName("gv.u(I)Z")
    public boolean method3485() {
        if (this.field2939 == null) {
            return this.field2942 != -1 || this.field2934 != null;
        }
        for (int var1 = 0; var1 < this.field2939.length; var1++) {
            if (this.field2939[var1] != -1) {
                class198 var2 = method3471(this.field2939[var1]);
                if (var2.field2942 != -1 || var2.field2934 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

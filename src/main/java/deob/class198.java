package deob;

@ObfuscatedName("gx")
public class class198 extends class130 {

    @ObfuscatedName("gx.q")
    public static boolean field2906 = false;

    @ObfuscatedName("gx.p")
    public static class125 field2896 = new class125(64);

    @ObfuscatedName("gx.j")
    public static class125 field2897 = new class125(500);

    @ObfuscatedName("gx.n")
    public static class125 field2898 = new class125(30);

    @ObfuscatedName("gx.r")
    public static class125 field2936 = new class125(30);

    @ObfuscatedName("gx.c")
    public static class77[] field2900 = new class77[4];

    @ObfuscatedName("gx.i")
    public int field2901;

    @ObfuscatedName("gx.o")
    public int[] field2902;

    @ObfuscatedName("gx.m")
    public int[] field2903;

    @ObfuscatedName("gx.s")
    public String field2904 = "null";

    @ObfuscatedName("gx.u")
    public short[] field2905;

    @ObfuscatedName("gx.b")
    public short[] field2921;

    @ObfuscatedName("gx.v")
    public short[] field2907;

    @ObfuscatedName("gx.f")
    public short[] field2908;

    @ObfuscatedName("gx.z")
    public int field2909 = 1;

    @ObfuscatedName("gx.t")
    public int field2917 = 1;

    @ObfuscatedName("gx.y")
    public int field2944 = 2;

    @ObfuscatedName("gx.w")
    public boolean field2912 = true;

    @ObfuscatedName("gx.a")
    public int field2913 = -1;

    @ObfuscatedName("gx.k")
    public int field2932 = -1;

    @ObfuscatedName("gx.l")
    public boolean field2915 = false;

    @ObfuscatedName("gx.x")
    public boolean field2893 = false;

    @ObfuscatedName("gx.g")
    public int field2916 = -1;

    @ObfuscatedName("gx.e")
    public int field2918 = 16;

    @ObfuscatedName("gx.ae")
    public int field2919 = 0;

    @ObfuscatedName("gx.aq")
    public int field2914 = 0;

    @ObfuscatedName("gx.at")
    public String[] field2945 = new String[5];

    @ObfuscatedName("gx.au")
    public int field2922 = -1;

    @ObfuscatedName("gx.am")
    public int field2934 = -1;

    @ObfuscatedName("gx.ad")
    public boolean field2924 = false;

    @ObfuscatedName("gx.ai")
    public boolean field2940 = true;

    @ObfuscatedName("gx.ac")
    public int field2925 = 128;

    @ObfuscatedName("gx.ao")
    public int field2911 = 128;

    @ObfuscatedName("gx.as")
    public int field2928 = 128;

    @ObfuscatedName("gx.aa")
    public int field2926 = 0;

    @ObfuscatedName("gx.ah")
    public int field2930 = 0;

    @ObfuscatedName("gx.aj")
    public int field2931 = 0;

    @ObfuscatedName("gx.aw")
    public boolean field2941 = false;

    @ObfuscatedName("gx.ap")
    public boolean field2927 = false;

    @ObfuscatedName("gx.ak")
    public int field2933 = -1;

    @ObfuscatedName("gx.ag")
    public int[] field2935;

    @ObfuscatedName("gx.al")
    public int field2899 = -1;

    @ObfuscatedName("gx.an")
    public int field2920 = -1;

    @ObfuscatedName("gx.ar")
    public int field2938 = -1;

    @ObfuscatedName("gx.ab")
    public int field2923 = 0;

    @ObfuscatedName("gx.az")
    public int field2939 = 0;

    @ObfuscatedName("gx.ay")
    public int field2937 = 0;

    @ObfuscatedName("gx.av")
    public int[] field2942;

    @ObfuscatedName("ed.q(Lgj;Lgj;ZI)V")
    public static void method2566(class183 arg0, class183 arg1, boolean arg2) {
        Statics.field2894 = arg0;
        Statics.field2895 = arg1;
        field2906 = arg2;
    }

    @ObfuscatedName("gg.d(II)Lgx;")
    public static class198 method3257(int arg0) {
        class198 var1 = (class198) field2896.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2894.method3133(6, arg0);
        class198 var3 = new class198();
        var3.field2901 = arg0;
        if (var2 != null) {
            var3.method3447(new class154(var2));
        }
        var3.method3461();
        if (var3.field2927) {
            var3.field2944 = 0;
            var3.field2912 = false;
        }
        field2896.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.h(I)V")
    public void method3461() {
        if (this.field2913 == -1) {
            this.field2913 = 0;
            if (this.field2902 != null && (this.field2903 == null || this.field2903[0] == 10)) {
                this.field2913 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2945[var1] != null) {
                    this.field2913 = 1;
                }
            }
        }
        if (this.field2933 == -1) {
            this.field2933 = this.field2944 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gx.p(Lel;I)V")
    public void method3447(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3426(arg0, var2);
        }
    }

    @ObfuscatedName("gx.j(Lel;II)V")
    public void method3426(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2666();
            if (var3 > 0) {
                if (this.field2902 == null || field2906) {
                    this.field2903 = new int[var3];
                    this.field2902 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2902[var4] = arg0.method2668();
                        this.field2903[var4] = arg0.method2666();
                    }
                } else {
                    arg0.field2091 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2904 = arg0.method2701();
        } else if (arg1 == 5) {
            int var5 = arg0.method2666();
            if (var5 > 0) {
                if (this.field2902 == null || field2906) {
                    this.field2903 = null;
                    this.field2902 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2902[var6] = arg0.method2668();
                    }
                } else {
                    arg0.field2091 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2909 = arg0.method2666();
        } else if (arg1 == 15) {
            this.field2917 = arg0.method2666();
        } else if (arg1 == 17) {
            this.field2944 = 0;
            this.field2912 = false;
        } else if (arg1 == 18) {
            this.field2912 = false;
        } else if (arg1 == 19) {
            this.field2913 = arg0.method2666();
        } else if (arg1 == 21) {
            this.field2932 = 0;
        } else if (arg1 == 22) {
            this.field2915 = true;
        } else if (arg1 == 23) {
            this.field2893 = true;
        } else if (arg1 == 24) {
            this.field2916 = arg0.method2668();
            if (this.field2916 == 65535) {
                this.field2916 = -1;
            }
        } else if (arg1 == 27) {
            this.field2944 = 1;
        } else if (arg1 == 28) {
            this.field2918 = arg0.method2666();
        } else if (arg1 == 29) {
            this.field2919 = arg0.method2835();
        } else if (arg1 == 39) {
            this.field2914 = arg0.method2835() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2945[arg1 - 30] = arg0.method2701();
            if (this.field2945[arg1 - 30].equalsIgnoreCase(class174.field2585)) {
                this.field2945[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2666();
            this.field2905 = new short[var7];
            this.field2921 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2905[var8] = (short) arg0.method2668();
                this.field2921[var8] = (short) arg0.method2668();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2666();
            this.field2907 = new short[var9];
            this.field2908 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2907[var10] = (short) arg0.method2668();
                this.field2908[var10] = (short) arg0.method2668();
            }
        } else if (arg1 == 60) {
            this.field2922 = arg0.method2668();
        } else if (arg1 == 62) {
            this.field2924 = true;
        } else if (arg1 == 64) {
            this.field2940 = false;
        } else if (arg1 == 65) {
            this.field2925 = arg0.method2668();
        } else if (arg1 == 66) {
            this.field2911 = arg0.method2668();
        } else if (arg1 == 67) {
            this.field2928 = arg0.method2668();
        } else if (arg1 == 68) {
            this.field2934 = arg0.method2668();
        } else if (arg1 == 69) {
            arg0.method2666();
        } else if (arg1 == 70) {
            this.field2926 = arg0.method2669();
        } else if (arg1 == 71) {
            this.field2930 = arg0.method2669();
        } else if (arg1 == 72) {
            this.field2931 = arg0.method2669();
        } else if (arg1 == 73) {
            this.field2941 = true;
        } else if (arg1 == 74) {
            this.field2927 = true;
        } else if (arg1 == 75) {
            this.field2933 = arg0.method2666();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2899 = arg0.method2668();
            if (this.field2899 == 65535) {
                this.field2899 = -1;
            }
            this.field2920 = arg0.method2668();
            if (this.field2920 == 65535) {
                this.field2920 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2668();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2666();
            this.field2935 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2935[var15] = arg0.method2668();
                if (this.field2935[var15] == 65535) {
                    this.field2935[var15] = -1;
                }
            }
            this.field2935[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2938 = arg0.method2668();
            this.field2923 = arg0.method2666();
        } else if (arg1 == 79) {
            this.field2939 = arg0.method2668();
            this.field2937 = arg0.method2668();
            this.field2923 = arg0.method2666();
            int var11 = arg0.method2666();
            this.field2942 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2942[var12] = arg0.method2668();
            }
        } else if (arg1 == 81) {
            this.field2932 = arg0.method2666() * 256;
        }
    }

    @ObfuscatedName("gx.n(II)Z")
    public final boolean method3427(int arg0) {
        if (this.field2903 != null) {
            for (int var4 = 0; var4 < this.field2903.length; var4++) {
                if (this.field2903[var4] == arg0) {
                    return Statics.field2895.method3189(this.field2902[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2902 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2902.length; var3++) {
                var2 &= Statics.field2895.method3189(this.field2902[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gx.c(B)Z")
    public final boolean method3428() {
        if (this.field2902 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2902.length; var2++) {
            var1 &= Statics.field2895.method3189(this.field2902[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gx.o(II[[IIIII)Lcg;")
    public final class90 method3455(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2903 == null) {
            var7 = (long) ((this.field2901 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2901 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2898.method2258(var7);
        if (var9 == null) {
            class77 var10 = this.method3457(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2915) {
                var10.field1273 = (short) (this.field2919 + 64);
                var10.field1274 = (short) (this.field2914 + 768);
                var10.method1465();
                var9 = var10;
            } else {
                var9 = var10.method1469(this.field2919 + 64, this.field2914 + 768, -50, -10, -50);
            }
            field2898.method2248(var9, var7);
        }
        if (this.field2915) {
            var9 = ((class77) var9).method1453();
        }
        if (this.field2932 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1548(arg2, arg3, arg4, arg5, true, this.field2932);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1454(arg2, arg3, arg4, arg5, true, this.field2932);
            }
        }
        return var9;
    }

    @ObfuscatedName("gx.s(II[[IIIII)Lcf;")
    public final class83 method3460(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2903 == null) {
            var7 = (long) ((this.field2901 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2901 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2936.method2258(var7);
        if (var9 == null) {
            class77 var10 = this.method3457(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1469(this.field2919 + 64, this.field2914 + 768, -50, -10, -50);
            field2936.method2248(var9, var7);
        }
        if (this.field2932 >= 0) {
            var9 = var9.method1548(arg2, arg3, arg4, arg5, true, this.field2932);
        }
        return var9;
    }

    @ObfuscatedName("gx.u(II[[IIIILgf;II)Lcf;")
    public final class83 method3430(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2903 == null) {
            var9 = (long) ((this.field2901 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2901 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2936.method2258(var9);
        if (var11 == null) {
            class77 var12 = this.method3457(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1469(this.field2919 + 64, this.field2914 + 768, -50, -10, -50);
            field2936.method2248(var11, var9);
        }
        if (arg6 == null && this.field2932 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1549(true);
        } else {
            var13 = arg6.method3587(var11, arg7, arg1);
        }
        if (this.field2932 >= 0) {
            var13 = var13.method1548(arg2, arg3, arg4, arg5, false, this.field2932);
        }
        return var13;
    }

    @ObfuscatedName("gx.b(IIB)Lbx;")
    public final class77 method3457(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2903 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2902 == null) {
                return null;
            }
            boolean var4 = this.field2924;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2902.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2902[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2897.method2258((long) var7);
                if (var3 == null) {
                    var3 = class77.method1494(Statics.field2895, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1463();
                    }
                    field2897.method2248(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2900[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2900, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2903.length; var9++) {
                if (this.field2903[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2902[var8];
            boolean var11 = this.field2924 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2897.method2258((long) var10);
            if (var3 == null) {
                var3 = class77.method1494(Statics.field2895, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1463();
                }
                field2897.method2248(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2925 == 128 && this.field2911 == 128 && this.field2928 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2926 == 0 && this.field2930 == 0 && this.field2931 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2905 == null, this.field2907 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1459(256);
            var14.method1496(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1456();
        } else if (var15 == 2) {
            var14.method1474();
        } else if (var15 == 3) {
            var14.method1457();
        }
        if (this.field2905 != null) {
            for (int var16 = 0; var16 < this.field2905.length; var16++) {
                var14.method1461(this.field2905[var16], this.field2921[var16]);
            }
        }
        if (this.field2907 != null) {
            for (int var17 = 0; var17 < this.field2907.length; var17++) {
                var14.method1499(this.field2907[var17], this.field2908[var17]);
            }
        }
        if (var12) {
            var14.method1464(this.field2925, this.field2911, this.field2928);
        }
        if (var13) {
            var14.method1496(this.field2926, this.field2930, this.field2931);
        }
        return var14;
    }

    @ObfuscatedName("gx.v(I)Lgx;")
    public final class198 method3432() {
        int var1 = -1;
        if (this.field2899 != -1) {
            var1 = class166.method2011(this.field2899);
        } else if (this.field2920 != -1) {
            var1 = class166.field2163[this.field2920];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2935.length - 1) {
            var2 = this.field2935[var1];
        } else {
            var2 = this.field2935[this.field2935.length - 1];
        }
        return var2 == -1 ? null : method3257(var2);
    }

    @ObfuscatedName("ae.f(I)V")
    public static void method608() {
        field2896.method2249();
        field2897.method2249();
        field2898.method2249();
        field2936.method2249();
    }

    @ObfuscatedName("gx.z(S)Z")
    public boolean method3433() {
        if (this.field2935 == null) {
            return this.field2938 != -1 || this.field2942 != null;
        }
        for (int var1 = 0; var1 < this.field2935.length; var1++) {
            if (this.field2935[var1] != -1) {
                class198 var2 = method3257(this.field2935[var1]);
                if (var2.field2938 != -1 || var2.field2942 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

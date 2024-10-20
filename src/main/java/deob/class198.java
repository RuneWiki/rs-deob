package deob;

@ObfuscatedName("gl")
public class class198 extends class130 {

    @ObfuscatedName("gl.x")
    public static boolean field2904 = false;

    @ObfuscatedName("gl.d")
    public static class125 field2938 = new class125(64);

    @ObfuscatedName("gl.w")
    public static class125 field2898 = new class125(500);

    @ObfuscatedName("gl.h")
    public static class125 field2899 = new class125(30);

    @ObfuscatedName("gl.u")
    public static class125 field2900 = new class125(30);

    @ObfuscatedName("gl.k")
    public static class77[] field2901 = new class77[4];

    @ObfuscatedName("gl.g")
    public int field2902;

    @ObfuscatedName("gl.y")
    public int[] field2932;

    @ObfuscatedName("gl.e")
    public int[] field2897;

    @ObfuscatedName("gl.q")
    public String field2905 = "null";

    @ObfuscatedName("gl.v")
    public short[] field2895;

    @ObfuscatedName("gl.l")
    public short[] field2907;

    @ObfuscatedName("gl.s")
    public short[] field2908;

    @ObfuscatedName("gl.r")
    public short[] field2909;

    @ObfuscatedName("gl.m")
    public int field2910 = 1;

    @ObfuscatedName("gl.i")
    public int field2911 = 1;

    @ObfuscatedName("gl.f")
    public int field2912 = 2;

    @ObfuscatedName("gl.b")
    public boolean field2921 = true;

    @ObfuscatedName("gl.t")
    public int field2914 = -1;

    @ObfuscatedName("gl.z")
    public int field2915 = -1;

    @ObfuscatedName("gl.p")
    public boolean field2916 = false;

    @ObfuscatedName("gl.n")
    public boolean field2917 = false;

    @ObfuscatedName("gl.a")
    public int field2918 = -1;

    @ObfuscatedName("gl.o")
    public int field2919 = 16;

    @ObfuscatedName("gl.an")
    public int field2928 = 0;

    @ObfuscatedName("gl.ar")
    public int field2906 = 0;

    @ObfuscatedName("gl.aa")
    public String[] field2922 = new String[5];

    @ObfuscatedName("gl.af")
    public int field2923 = -1;

    @ObfuscatedName("gl.ax")
    public int field2943 = -1;

    @ObfuscatedName("gl.ah")
    public boolean field2925 = false;

    @ObfuscatedName("gl.az")
    public boolean field2926 = true;

    @ObfuscatedName("gl.at")
    public int field2927 = 128;

    @ObfuscatedName("gl.ab")
    public int field2913 = 128;

    @ObfuscatedName("gl.ae")
    public int field2929 = 128;

    @ObfuscatedName("gl.ao")
    public int field2930 = 0;

    @ObfuscatedName("gl.am")
    public int field2931 = 0;

    @ObfuscatedName("gl.ak")
    public int field2936 = 0;

    @ObfuscatedName("gl.ay")
    public boolean field2933 = false;

    @ObfuscatedName("gl.aq")
    public boolean field2894 = false;

    @ObfuscatedName("gl.aj")
    public int field2920 = -1;

    @ObfuscatedName("gl.ap")
    public int[] field2935;

    @ObfuscatedName("gl.ai")
    public int field2937 = -1;

    @ObfuscatedName("gl.ac")
    public int field2934 = -1;

    @ObfuscatedName("gl.av")
    public int field2939 = -1;

    @ObfuscatedName("gl.as")
    public int field2940 = 0;

    @ObfuscatedName("gl.al")
    public int field2924 = 0;

    @ObfuscatedName("gl.ag")
    public int field2942 = 0;

    @ObfuscatedName("gl.aw")
    public int[] field2903;

    @ObfuscatedName("gs.x(II)Lgl;")
    public static class198 method3366(int arg0) {
        class198 var1 = (class198) field2938.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2941.method3121(6, arg0);
        class198 var3 = new class198();
        var3.field2902 = arg0;
        if (var2 != null) {
            var3.method3432(new class154(var2));
        }
        var3.method3400();
        if (var3.field2894) {
            var3.field2912 = 0;
            var3.field2921 = false;
        }
        field2938.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gl.j(I)V")
    public void method3400() {
        if (this.field2914 == -1) {
            this.field2914 = 0;
            if (this.field2932 != null && (this.field2897 == null || this.field2897[0] == 10)) {
                this.field2914 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2922[var1] != null) {
                    this.field2914 = 1;
                }
            }
        }
        if (this.field2920 == -1) {
            this.field2920 = this.field2912 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gl.c(Lek;I)V")
    public void method3432(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3399(arg0, var2);
        }
    }

    @ObfuscatedName("gl.d(Lek;IB)V")
    public void method3399(class154 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2701();
            if (var3 > 0) {
                if (this.field2932 == null || field2904) {
                    this.field2897 = new int[var3];
                    this.field2932 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2932[var4] = arg0.method2745();
                        this.field2897[var4] = arg0.method2701();
                    }
                } else {
                    arg0.field2086 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2905 = arg0.method2699();
        } else if (arg1 == 5) {
            int var5 = arg0.method2701();
            if (var5 > 0) {
                if (this.field2932 == null || field2904) {
                    this.field2897 = null;
                    this.field2932 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2932[var6] = arg0.method2745();
                    }
                } else {
                    arg0.field2086 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2910 = arg0.method2701();
        } else if (arg1 == 15) {
            this.field2911 = arg0.method2701();
        } else if (arg1 == 17) {
            this.field2912 = 0;
            this.field2921 = false;
        } else if (arg1 == 18) {
            this.field2921 = false;
        } else if (arg1 == 19) {
            this.field2914 = arg0.method2701();
        } else if (arg1 == 21) {
            this.field2915 = 0;
        } else if (arg1 == 22) {
            this.field2916 = true;
        } else if (arg1 == 23) {
            this.field2917 = true;
        } else if (arg1 == 24) {
            this.field2918 = arg0.method2745();
            if (this.field2918 == 65535) {
                this.field2918 = -1;
            }
        } else if (arg1 == 27) {
            this.field2912 = 1;
        } else if (arg1 == 28) {
            this.field2919 = arg0.method2701();
        } else if (arg1 == 29) {
            this.field2928 = arg0.method2640();
        } else if (arg1 == 39) {
            this.field2906 = arg0.method2640() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2922[arg1 - 30] = arg0.method2699();
            if (this.field2922[arg1 - 30].equalsIgnoreCase(class174.field2347)) {
                this.field2922[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2701();
            this.field2895 = new short[var7];
            this.field2907 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2895[var8] = (short) arg0.method2745();
                this.field2907[var8] = (short) arg0.method2745();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2701();
            this.field2908 = new short[var9];
            this.field2909 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2908[var10] = (short) arg0.method2745();
                this.field2909[var10] = (short) arg0.method2745();
            }
        } else if (arg1 == 60) {
            this.field2923 = arg0.method2745();
        } else if (arg1 == 62) {
            this.field2925 = true;
        } else if (arg1 == 64) {
            this.field2926 = false;
        } else if (arg1 == 65) {
            this.field2927 = arg0.method2745();
        } else if (arg1 == 66) {
            this.field2913 = arg0.method2745();
        } else if (arg1 == 67) {
            this.field2929 = arg0.method2745();
        } else if (arg1 == 68) {
            this.field2943 = arg0.method2745();
        } else if (arg1 == 69) {
            arg0.method2701();
        } else if (arg1 == 70) {
            this.field2930 = arg0.method2695();
        } else if (arg1 == 71) {
            this.field2931 = arg0.method2695();
        } else if (arg1 == 72) {
            this.field2936 = arg0.method2695();
        } else if (arg1 == 73) {
            this.field2933 = true;
        } else if (arg1 == 74) {
            this.field2894 = true;
        } else if (arg1 == 75) {
            this.field2920 = arg0.method2701();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2937 = arg0.method2745();
            if (this.field2937 == 65535) {
                this.field2937 = -1;
            }
            this.field2934 = arg0.method2745();
            if (this.field2934 == 65535) {
                this.field2934 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2745();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2701();
            this.field2935 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2935[var15] = arg0.method2745();
                if (this.field2935[var15] == 65535) {
                    this.field2935[var15] = -1;
                }
            }
            this.field2935[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2939 = arg0.method2745();
            this.field2940 = arg0.method2701();
        } else if (arg1 == 79) {
            this.field2924 = arg0.method2745();
            this.field2942 = arg0.method2745();
            this.field2940 = arg0.method2701();
            int var11 = arg0.method2701();
            this.field2903 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2903[var12] = arg0.method2745();
            }
        } else if (arg1 == 81) {
            this.field2915 = arg0.method2701() * 256;
        }
    }

    @ObfuscatedName("gl.w(II)Z")
    public final boolean method3401(int arg0) {
        if (this.field2897 != null) {
            for (int var4 = 0; var4 < this.field2897.length; var4++) {
                if (this.field2897[var4] == arg0) {
                    return Statics.field2896.method3166(this.field2932[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2932 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2932.length; var3++) {
                var2 &= Statics.field2896.method3166(this.field2932[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gl.u(B)Z")
    public final boolean method3404() {
        if (this.field2932 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2932.length; var2++) {
            var1 &= Statics.field2896.method3166(this.field2932[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gl.y(II[[IIIII)Lcx;")
    public final class90 method3405(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2897 == null) {
            var7 = (long) ((this.field2902 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2902 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2899.method2221(var7);
        if (var9 == null) {
            class77 var10 = this.method3408(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2916) {
                var10.field1245 = (short) (this.field2928 + 64);
                var10.field1270 = (short) (this.field2906 + 768);
                var10.method1487();
                var9 = var10;
            } else {
                var9 = var10.method1458(this.field2928 + 64, this.field2906 + 768, -50, -10, -50);
            }
            field2899.method2223(var9, var7);
        }
        if (this.field2916) {
            var9 = ((class77) var9).method1454();
        }
        if (this.field2915 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1528(arg2, arg3, arg4, arg5, true, this.field2915);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1444(arg2, arg3, arg4, arg5, true, this.field2915);
            }
        }
        return var9;
    }

    @ObfuscatedName("gl.e(II[[IIIII)Lcj;")
    public final class83 method3441(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2897 == null) {
            var7 = (long) ((this.field2902 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2902 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2900.method2221(var7);
        if (var9 == null) {
            class77 var10 = this.method3408(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1458(this.field2928 + 64, this.field2906 + 768, -50, -10, -50);
            field2900.method2223(var9, var7);
        }
        if (this.field2915 >= 0) {
            var9 = var9.method1528(arg2, arg3, arg4, arg5, true, this.field2915);
        }
        return var9;
    }

    @ObfuscatedName("gl.q(II[[IIIILgy;II)Lcj;")
    public final class83 method3402(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class202 arg6, int arg7) {
        long var9;
        if (this.field2897 == null) {
            var9 = (long) ((this.field2902 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2902 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2900.method2221(var9);
        if (var11 == null) {
            class77 var12 = this.method3408(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1458(this.field2928 + 64, this.field2906 + 768, -50, -10, -50);
            field2900.method2223(var11, var9);
        }
        if (arg6 == null && this.field2915 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1529(true);
        } else {
            var13 = arg6.method3554(var11, arg7, arg1);
        }
        if (this.field2915 >= 0) {
            var13 = var13.method1528(arg2, arg3, arg4, arg5, false, this.field2915);
        }
        return var13;
    }

    @ObfuscatedName("gl.v(III)Lbg;")
    public final class77 method3408(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2897 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2932 == null) {
                return null;
            }
            boolean var4 = this.field2925;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2932.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2932[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2898.method2221((long) var7);
                if (var3 == null) {
                    var3 = class77.method1437(Statics.field2896, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1452();
                    }
                    field2898.method2223(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2901[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2901, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2897.length; var9++) {
                if (this.field2897[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2932[var8];
            boolean var11 = this.field2925 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2898.method2221((long) var10);
            if (var3 == null) {
                var3 = class77.method1437(Statics.field2896, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1452();
                }
                field2898.method2223(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2927 == 128 && this.field2913 == 128 && this.field2929 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2930 == 0 && this.field2931 == 0 && this.field2936 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2895 == null, this.field2908 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1449(256);
            var14.method1450(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1446();
        } else if (var15 == 2) {
            var14.method1447();
        } else if (var15 == 3) {
            var14.method1448();
        }
        if (this.field2895 != null) {
            for (int var16 = 0; var16 < this.field2895.length; var16++) {
                var14.method1470(this.field2895[var16], this.field2907[var16]);
            }
        }
        if (this.field2908 != null) {
            for (int var17 = 0; var17 < this.field2908.length; var17++) {
                var14.method1451(this.field2908[var17], this.field2909[var17]);
            }
        }
        if (var12) {
            var14.method1489(this.field2927, this.field2913, this.field2929);
        }
        if (var13) {
            var14.method1450(this.field2930, this.field2931, this.field2936);
        }
        return var14;
    }

    @ObfuscatedName("gl.l(I)Lgl;")
    public final class198 method3409() {
        int var1 = -1;
        if (this.field2937 != -1) {
            var1 = class166.method1852(this.field2937);
        } else if (this.field2934 != -1) {
            var1 = class166.field2154[this.field2934];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2935.length - 1) {
            var2 = this.field2935[var1];
        } else {
            var2 = this.field2935[this.field2935.length - 1];
        }
        return var2 == -1 ? null : method3366(var2);
    }

    @ObfuscatedName("aj.s(B)V")
    public static void method824() {
        field2938.method2225();
        field2898.method2225();
        field2899.method2225();
        field2900.method2225();
    }

    @ObfuscatedName("gl.r(I)Z")
    public boolean method3410() {
        if (this.field2935 == null) {
            return this.field2939 != -1 || this.field2903 != null;
        }
        for (int var1 = 0; var1 < this.field2935.length; var1++) {
            if (this.field2935[var1] != -1) {
                class198 var2 = method3366(this.field2935[var1]);
                if (var2.field2939 != -1 || var2.field2903 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

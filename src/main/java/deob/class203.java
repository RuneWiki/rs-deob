package deob;

@ObfuscatedName("gy")
public class class203 extends class151 {

    @ObfuscatedName("gy.d")
    public static boolean field2948 = false;

    @ObfuscatedName("gy.q")
    public static class146 field2927 = new class146(64);

    @ObfuscatedName("gy.t")
    public static class146 field2928 = new class146(500);

    @ObfuscatedName("gy.p")
    public static class146 field2929 = new class146(30);

    @ObfuscatedName("gy.u")
    public static class146 field2949 = new class146(30);

    @ObfuscatedName("gy.z")
    public static class77[] field2931 = new class77[4];

    @ObfuscatedName("gy.l")
    public int field2942;

    @ObfuscatedName("gy.v")
    public int[] field2933;

    @ObfuscatedName("gy.g")
    public int[] field2934;

    @ObfuscatedName("gy.w")
    public String field2935 = "null";

    @ObfuscatedName("gy.r")
    public short[] field2936;

    @ObfuscatedName("gy.s")
    public short[] field2932;

    @ObfuscatedName("gy.k")
    public short[] field2938;

    @ObfuscatedName("gy.e")
    public short[] field2939;

    @ObfuscatedName("gy.j")
    public int field2964 = 1;

    @ObfuscatedName("gy.i")
    public int field2941 = 1;

    @ObfuscatedName("gy.a")
    public int field2937 = 2;

    @ObfuscatedName("gy.x")
    public boolean field2943 = true;

    @ObfuscatedName("gy.h")
    public int field2944 = -1;

    @ObfuscatedName("gy.b")
    public int field2945 = -1;

    @ObfuscatedName("gy.f")
    public boolean field2946 = false;

    @ObfuscatedName("gy.o")
    public boolean field2940 = false;

    @ObfuscatedName("gy.m")
    public int field2930 = -1;

    @ObfuscatedName("gy.y")
    public int field2952 = 16;

    @ObfuscatedName("gy.am")
    public int field2961 = 0;

    @ObfuscatedName("gy.ax")
    public int field2951 = 0;

    @ObfuscatedName("gy.ac")
    public String[] field2974 = new String[5];

    @ObfuscatedName("gy.az")
    public int field2953 = -1;

    @ObfuscatedName("gy.ao")
    public int field2954 = -1;

    @ObfuscatedName("gy.ak")
    public boolean field2950 = false;

    @ObfuscatedName("gy.aa")
    public boolean field2956 = true;

    @ObfuscatedName("gy.aj")
    public int field2957 = 128;

    @ObfuscatedName("gy.ay")
    public int field2925 = 128;

    @ObfuscatedName("gy.ae")
    public int field2959 = 128;

    @ObfuscatedName("gy.aq")
    public int field2958 = 0;

    @ObfuscatedName("gy.av")
    public int field2973 = 0;

    @ObfuscatedName("gy.aw")
    public int field2962 = 0;

    @ObfuscatedName("gy.ag")
    public boolean field2963 = false;

    @ObfuscatedName("gy.af")
    public boolean field2955 = false;

    @ObfuscatedName("gy.ar")
    public int field2965 = -1;

    @ObfuscatedName("gy.ab")
    public int[] field2966;

    @ObfuscatedName("gy.as")
    public int field2967 = -1;

    @ObfuscatedName("gy.ai")
    public int field2971 = -1;

    @ObfuscatedName("gy.ad")
    public int field2969 = -1;

    @ObfuscatedName("gy.an")
    public int field2970 = 0;

    @ObfuscatedName("gy.al")
    public int field2924 = 0;

    @ObfuscatedName("gy.at")
    public int field2972 = 0;

    @ObfuscatedName("gy.ah")
    public int[] field2960;

    @ObfuscatedName("gy.ap")
    public class143 field2947;

    @ObfuscatedName("j.d(Lgd;Lgd;ZI)V")
    public static void method193(class185 arg0, class185 arg1, boolean arg2) {
        Statics.field2968 = arg0;
        Statics.field2926 = arg1;
        field2948 = arg2;
    }

    @ObfuscatedName("am.c(II)Lgy;")
    public static class203 method579(int arg0) {
        class203 var1 = (class203) field2927.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2968.method3129(6, arg0);
        class203 var3 = new class203();
        var3.field2942 = arg0;
        if (var2 != null) {
            var3.method3480(new class130(var2));
        }
        var3.method3479();
        if (var3.field2955) {
            var3.field2937 = 0;
            var3.field2943 = false;
        }
        field2927.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.n(B)V")
    public void method3479() {
        if (this.field2944 == -1) {
            this.field2944 = 0;
            if (this.field2933 != null && (this.field2934 == null || this.field2934[0] == 10)) {
                this.field2944 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2974[var1] != null) {
                    this.field2944 = 1;
                }
            }
        }
        if (this.field2965 == -1) {
            this.field2965 = this.field2937 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gy.q(Ldu;I)V")
    public void method3480(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3468(arg0, var2);
        }
    }

    @ObfuscatedName("gy.t(Ldu;II)V")
    public void method3468(class130 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2379();
            if (var3 > 0) {
                if (this.field2933 == null || field2948) {
                    this.field2934 = new int[var3];
                    this.field2933 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2933[var4] = arg0.method2232();
                        this.field2934[var4] = arg0.method2379();
                    }
                } else {
                    arg0.field1956 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2935 = arg0.method2314();
        } else if (arg1 == 5) {
            int var5 = arg0.method2379();
            if (var5 > 0) {
                if (this.field2933 == null || field2948) {
                    this.field2934 = null;
                    this.field2933 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2933[var6] = arg0.method2232();
                    }
                } else {
                    arg0.field1956 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2964 = arg0.method2379();
        } else if (arg1 == 15) {
            this.field2941 = arg0.method2379();
        } else if (arg1 == 17) {
            this.field2937 = 0;
            this.field2943 = false;
        } else if (arg1 == 18) {
            this.field2943 = false;
        } else if (arg1 == 19) {
            this.field2944 = arg0.method2379();
        } else if (arg1 == 21) {
            this.field2945 = 0;
        } else if (arg1 == 22) {
            this.field2946 = true;
        } else if (arg1 == 23) {
            this.field2940 = true;
        } else if (arg1 == 24) {
            this.field2930 = arg0.method2232();
            if (this.field2930 == 65535) {
                this.field2930 = -1;
            }
        } else if (arg1 == 27) {
            this.field2937 = 1;
        } else if (arg1 == 28) {
            this.field2952 = arg0.method2379();
        } else if (arg1 == 29) {
            this.field2961 = arg0.method2230();
        } else if (arg1 == 39) {
            this.field2951 = arg0.method2230() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2974[arg1 - 30] = arg0.method2314();
            if (this.field2974[arg1 - 30].equalsIgnoreCase(class176.field2361)) {
                this.field2974[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2379();
            this.field2936 = new short[var7];
            this.field2932 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2936[var8] = (short) arg0.method2232();
                this.field2932[var8] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2379();
            this.field2938 = new short[var9];
            this.field2939 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2938[var10] = (short) arg0.method2232();
                this.field2939[var10] = (short) arg0.method2232();
            }
        } else if (arg1 == 60) {
            this.field2953 = arg0.method2232();
        } else if (arg1 == 62) {
            this.field2950 = true;
        } else if (arg1 == 64) {
            this.field2956 = false;
        } else if (arg1 == 65) {
            this.field2957 = arg0.method2232();
        } else if (arg1 == 66) {
            this.field2925 = arg0.method2232();
        } else if (arg1 == 67) {
            this.field2959 = arg0.method2232();
        } else if (arg1 == 68) {
            this.field2954 = arg0.method2232();
        } else if (arg1 == 69) {
            arg0.method2379();
        } else if (arg1 == 70) {
            this.field2958 = arg0.method2254();
        } else if (arg1 == 71) {
            this.field2973 = arg0.method2254();
        } else if (arg1 == 72) {
            this.field2962 = arg0.method2254();
        } else if (arg1 == 73) {
            this.field2963 = true;
        } else if (arg1 == 74) {
            this.field2955 = true;
        } else if (arg1 == 75) {
            this.field2965 = arg0.method2379();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2967 = arg0.method2232();
            if (this.field2967 == 65535) {
                this.field2967 = -1;
            }
            this.field2971 = arg0.method2232();
            if (this.field2971 == 65535) {
                this.field2971 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method2232();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method2379();
            this.field2966 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2966[var15] = arg0.method2232();
                if (this.field2966[var15] == 65535) {
                    this.field2966[var15] = -1;
                }
            }
            this.field2966[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2969 = arg0.method2232();
            this.field2970 = arg0.method2379();
        } else if (arg1 == 79) {
            this.field2924 = arg0.method2232();
            this.field2972 = arg0.method2232();
            this.field2970 = arg0.method2379();
            int var11 = arg0.method2379();
            this.field2960 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2960[var12] = arg0.method2232();
            }
        } else if (arg1 == 81) {
            this.field2945 = arg0.method2379() * 256;
        } else if (arg1 == 249) {
            this.field2947 = class197.method3079(arg0, this.field2947);
        }
    }

    @ObfuscatedName("gy.p(II)Z")
    public final boolean method3512(int arg0) {
        if (this.field2934 != null) {
            for (int var4 = 0; var4 < this.field2934.length; var4++) {
                if (this.field2934[var4] == arg0) {
                    return Statics.field2926.method3089(this.field2933[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2933 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2933.length; var3++) {
                var2 &= Statics.field2926.method3089(this.field2933[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gy.u(I)Z")
    public final boolean method3470() {
        if (this.field2933 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2933.length; var2++) {
            var1 &= Statics.field2926.method3089(this.field2933[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gy.w(II[[IIIIB)Lcy;")
    public final class90 method3471(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2934 == null) {
            var7 = (long) ((this.field2942 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2942 << 10) + (arg0 << 3) + arg1);
        }
        class90 var9 = (class90) field2929.method2598(var7);
        if (var9 == null) {
            class77 var10 = this.method3484(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2946) {
                var10.field1241 = (short) (this.field2961 + 64);
                var10.field1219 = (short) (this.field2951 + 768);
                var10.method1393();
                var9 = var10;
            } else {
                var9 = var10.method1417(this.field2961 + 64, this.field2951 + 768, -50, -10, -50);
            }
            field2929.method2607(var9, var7);
        }
        if (this.field2946) {
            var9 = ((class77) var9).method1422();
        }
        if (this.field2945 >= 0) {
            if (var9 instanceof class83) {
                var9 = ((class83) var9).method1528(arg2, arg3, arg4, arg5, true, this.field2945);
            } else if (var9 instanceof class77) {
                var9 = ((class77) var9).method1399(arg2, arg3, arg4, arg5, true, this.field2945);
            }
        }
        return var9;
    }

    @ObfuscatedName("gy.r(II[[IIIII)Lcf;")
    public final class83 method3472(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2934 == null) {
            var7 = (long) ((this.field2942 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2942 << 10) + (arg0 << 3) + arg1);
        }
        class83 var9 = (class83) field2949.method2598(var7);
        if (var9 == null) {
            class77 var10 = this.method3484(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1417(this.field2961 + 64, this.field2951 + 768, -50, -10, -50);
            field2949.method2607(var9, var7);
        }
        if (this.field2945 >= 0) {
            var9 = var9.method1528(arg2, arg3, arg4, arg5, true, this.field2945);
        }
        return var9;
    }

    @ObfuscatedName("gy.s(II[[IIIILgg;II)Lcf;")
    public final class83 method3473(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class207 arg6, int arg7) {
        long var9;
        if (this.field2934 == null) {
            var9 = (long) ((this.field2942 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2942 << 10) + (arg0 << 3) + arg1);
        }
        class83 var11 = (class83) field2949.method2598(var9);
        if (var11 == null) {
            class77 var12 = this.method3484(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method1417(this.field2961 + 64, this.field2951 + 768, -50, -10, -50);
            field2949.method2607(var11, var9);
        }
        if (arg6 == null && this.field2945 == -1) {
            return var11;
        }
        class83 var13;
        if (arg6 == null) {
            var13 = var11.method1486(true);
        } else {
            var13 = arg6.method3666(var11, arg7, arg1);
        }
        if (this.field2945 >= 0) {
            var13 = var13.method1528(arg2, arg3, arg4, arg5, false, this.field2945);
        }
        return var13;
    }

    @ObfuscatedName("gy.k(III)Lbd;")
    public final class77 method3484(int arg0, int arg1) {
        class77 var3 = null;
        if (this.field2934 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2933 == null) {
                return null;
            }
            boolean var4 = this.field2950;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2933.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2933[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class77) field2928.method2598((long) var7);
                if (var3 == null) {
                    var3 = class77.method1394(Statics.field2926, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method1408();
                    }
                    field2928.method2607(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2931[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class77(field2931, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2934.length; var9++) {
                if (this.field2934[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2933[var8];
            boolean var11 = this.field2950 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class77) field2928.method2598((long) var10);
            if (var3 == null) {
                var3 = class77.method1394(Statics.field2926, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method1408();
                }
                field2928.method2607(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2957 == 128 && this.field2925 == 128 && this.field2959 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2958 == 0 && this.field2973 == 0 && this.field2962 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class77 var14 = new class77(var3, arg1 == 0 && !var12 && !var13, this.field2936 == null, this.field2938 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method1404(256);
            var14.method1450(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method1457();
        } else if (var15 == 2) {
            var14.method1402();
        } else if (var15 == 3) {
            var14.method1403();
        }
        if (this.field2936 != null) {
            for (int var16 = 0; var16 < this.field2936.length; var16++) {
                var14.method1406(this.field2936[var16], this.field2932[var16]);
            }
        }
        if (this.field2938 != null) {
            for (int var17 = 0; var17 < this.field2938.length; var17++) {
                var14.method1407(this.field2938[var17], this.field2939[var17]);
            }
        }
        if (var12) {
            var14.method1409(this.field2957, this.field2925, this.field2959);
        }
        if (var13) {
            var14.method1450(this.field2958, this.field2973, this.field2962);
        }
        return var14;
    }

    @ObfuscatedName("gy.e(I)Lgy;")
    public final class203 method3475() {
        int var1 = -1;
        if (this.field2967 != -1) {
            var1 = class168.method1112(this.field2967);
        } else if (this.field2971 != -1) {
            var1 = class168.field2174[this.field2971];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2966.length - 1) {
            var2 = this.field2966[var1];
        } else {
            var2 = this.field2966[this.field2966.length - 1];
        }
        return var2 == -1 ? null : method579(var2);
    }

    @ObfuscatedName("gy.j(III)I")
    public int method3481(int arg0, int arg1) {
        return class197.method3195(this.field2947, arg0, arg1);
    }

    @ObfuscatedName("gy.i(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3507(int arg0, String arg1) {
        return Statics.method2910(this.field2947, arg0, arg1);
    }

    @ObfuscatedName("ag.a(I)V")
    public static void method761() {
        field2927.method2603();
        field2928.method2603();
        field2929.method2603();
        field2949.method2603();
    }

    @ObfuscatedName("gy.x(B)Z")
    public boolean method3478() {
        if (this.field2966 == null) {
            return this.field2969 != -1 || this.field2960 != null;
        }
        for (int var1 = 0; var1 < this.field2966.length; var1++) {
            if (this.field2966[var1] != -1) {
                class203 var2 = method579(this.field2966[var1]);
                if (var2.field2969 != -1 || var2.field2960 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}

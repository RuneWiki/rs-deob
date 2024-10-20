package deob;

@ObfuscatedName("gh")
public class class199 extends class130 {

    @ObfuscatedName("gh.l")
    public static class125 field2939 = new class125(64);

    @ObfuscatedName("gh.g")
    public static class125 field2969 = new class125(50);

    @ObfuscatedName("gh.z")
    public static class125 field2941 = new class125(200);

    @ObfuscatedName("gh.m")
    public int field2959;

    @ObfuscatedName("gh.q")
    public int field2948;

    @ObfuscatedName("gh.e")
    public String field2944 = "null";

    @ObfuscatedName("gh.v")
    public short[] field2945;

    @ObfuscatedName("gh.j")
    public short[] field2946;

    @ObfuscatedName("gh.p")
    public short[] field2947;

    @ObfuscatedName("gh.k")
    public short[] field2935;

    @ObfuscatedName("gh.r")
    public int field2949 = 2000;

    @ObfuscatedName("gh.y")
    public int field2950 = 0;

    @ObfuscatedName("gh.h")
    public int field2938 = 0;

    @ObfuscatedName("gh.s")
    public int field2952 = 0;

    @ObfuscatedName("gh.w")
    public int field2953 = 0;

    @ObfuscatedName("gh.n")
    public int field2954 = 0;

    @ObfuscatedName("gh.o")
    public int field2962 = 0;

    @ObfuscatedName("gh.b")
    public int field2956 = 1;

    @ObfuscatedName("gh.aj")
    public boolean field2957 = false;

    @ObfuscatedName("gh.ag")
    public String[] field2961 = new String[] { null, null, class174.field2339, null, null };

    @ObfuscatedName("gh.al")
    public String[] field2979 = new String[] { null, null, null, null, class174.field2340 };

    @ObfuscatedName("gh.an")
    public int field2960 = -1;

    @ObfuscatedName("gh.af")
    public int field2981 = -1;

    @ObfuscatedName("gh.aa")
    public int field2986 = 0;

    @ObfuscatedName("gh.ax")
    public int field2963 = -1;

    @ObfuscatedName("gh.ai")
    public int field2964 = -1;

    @ObfuscatedName("gh.ah")
    public int field2965 = 0;

    @ObfuscatedName("gh.av")
    public int field2966 = -1;

    @ObfuscatedName("gh.at")
    public int field2967 = -1;

    @ObfuscatedName("gh.az")
    public int field2968 = -1;

    @ObfuscatedName("gh.ad")
    public int field2971 = -1;

    @ObfuscatedName("gh.aw")
    public int field2970 = -1;

    @ObfuscatedName("gh.ak")
    public int field2974 = -1;

    @ObfuscatedName("gh.aq")
    public int[] field2972;

    @ObfuscatedName("gh.ac")
    public int[] field2973;

    @ObfuscatedName("gh.am")
    public int field2940 = -1;

    @ObfuscatedName("gh.ay")
    public int field2975 = -1;

    @ObfuscatedName("gh.ar")
    public int field2983 = 128;

    @ObfuscatedName("gh.ab")
    public int field2937 = 128;

    @ObfuscatedName("gh.as")
    public int field2978 = 128;

    @ObfuscatedName("gh.ap")
    public int field2958 = 0;

    @ObfuscatedName("gh.ae")
    public int field2980 = 0;

    @ObfuscatedName("gh.ao")
    public int field2955 = 0;

    @ObfuscatedName("gh.au")
    public boolean field2982 = false;

    @ObfuscatedName("gh.bw")
    public int field2942 = -1;

    @ObfuscatedName("gh.bv")
    public int field2984 = -1;

    @ObfuscatedName("gh.bz")
    public int field2985 = -1;

    @ObfuscatedName("gh.be")
    public int field2943 = -1;

    @ObfuscatedName("eq.u(Lgt;Lgt;ZLhb;I)V")
    public static void method2525(class183 arg0, class183 arg1, boolean arg2, class209 arg3) {
        Statics.field2936 = arg0;
        Statics.field2977 = arg1;
        Statics.field2075 = arg2;
        Statics.field2976 = Statics.field2936.method3122(10);
        Statics.field3076 = arg3;
    }

    @ObfuscatedName("gh.i(I)V")
    public void method3445() {
    }

    @ObfuscatedName("gh.a(Len;B)V")
    public void method3443(class154 arg0) {
        while (true) {
            int var2 = arg0.method2708();
            if (var2 == 0) {
                return;
            }
            this.method3448(arg0, var2);
        }
    }

    @ObfuscatedName("gh.c(Len;II)V")
    public void method3448(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2948 = arg0.method2581();
        } else if (arg1 == 2) {
            this.field2944 = arg0.method2778();
        } else if (arg1 == 4) {
            this.field2949 = arg0.method2581();
        } else if (arg1 == 5) {
            this.field2950 = arg0.method2581();
        } else if (arg1 == 6) {
            this.field2938 = arg0.method2581();
        } else if (arg1 == 7) {
            this.field2953 = arg0.method2581();
            if (this.field2953 > 32767) {
                this.field2953 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2954 = arg0.method2581();
            if (this.field2954 > 32767) {
                this.field2954 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2962 = 1;
        } else if (arg1 == 12) {
            this.field2956 = arg0.method2593();
        } else if (arg1 == 16) {
            this.field2957 = true;
        } else if (arg1 == 23) {
            this.field2960 = arg0.method2581();
            this.field2986 = arg0.method2708();
        } else if (arg1 == 24) {
            this.field2981 = arg0.method2581();
        } else if (arg1 == 25) {
            this.field2963 = arg0.method2581();
            this.field2965 = arg0.method2708();
        } else if (arg1 == 26) {
            this.field2964 = arg0.method2581();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2961[arg1 - 30] = arg0.method2778();
            if (this.field2961[arg1 - 30].equalsIgnoreCase(class174.field2555)) {
                this.field2961[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2979[arg1 - 35] = arg0.method2778();
        } else if (arg1 == 40) {
            int var3 = arg0.method2708();
            this.field2945 = new short[var3];
            this.field2946 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2945[var4] = (short) arg0.method2581();
                this.field2946[var4] = (short) arg0.method2581();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2708();
            this.field2947 = new short[var5];
            this.field2935 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2947[var6] = (short) arg0.method2581();
                this.field2935[var6] = (short) arg0.method2581();
            }
        } else if (arg1 == 65) {
            this.field2982 = true;
        } else if (arg1 == 78) {
            this.field2966 = arg0.method2581();
        } else if (arg1 == 79) {
            this.field2967 = arg0.method2581();
        } else if (arg1 == 90) {
            this.field2968 = arg0.method2581();
        } else if (arg1 == 91) {
            this.field2970 = arg0.method2581();
        } else if (arg1 == 92) {
            this.field2971 = arg0.method2581();
        } else if (arg1 == 93) {
            this.field2974 = arg0.method2581();
        } else if (arg1 == 95) {
            this.field2952 = arg0.method2581();
        } else if (arg1 == 97) {
            this.field2940 = arg0.method2581();
        } else if (arg1 == 98) {
            this.field2975 = arg0.method2581();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2972 == null) {
                this.field2972 = new int[10];
                this.field2973 = new int[10];
            }
            this.field2972[arg1 - 100] = arg0.method2581();
            this.field2973[arg1 - 100] = arg0.method2581();
        } else if (arg1 == 110) {
            this.field2983 = arg0.method2581();
        } else if (arg1 == 111) {
            this.field2937 = arg0.method2581();
        } else if (arg1 == 112) {
            this.field2978 = arg0.method2581();
        } else if (arg1 == 113) {
            this.field2958 = arg0.method2754();
        } else if (arg1 == 114) {
            this.field2980 = arg0.method2754() * 5;
        } else if (arg1 == 115) {
            this.field2955 = arg0.method2708();
        } else if (arg1 == 139) {
            this.field2942 = arg0.method2581();
        } else if (arg1 == 140) {
            this.field2984 = arg0.method2581();
        } else if (arg1 == 148) {
            this.field2985 = arg0.method2581();
        } else if (arg1 == 149) {
            this.field2943 = arg0.method2581();
        }
    }

    @ObfuscatedName("gh.g(Lgh;Lgh;I)V")
    public void method3429(class199 arg0, class199 arg1) {
        this.field2948 = arg0.field2948;
        this.field2949 = arg0.field2949;
        this.field2950 = arg0.field2950;
        this.field2938 = arg0.field2938;
        this.field2952 = arg0.field2952;
        this.field2953 = arg0.field2953;
        this.field2954 = arg0.field2954;
        this.field2945 = arg0.field2945;
        this.field2946 = arg0.field2946;
        this.field2947 = arg0.field2947;
        this.field2935 = arg0.field2935;
        this.field2944 = arg1.field2944;
        this.field2957 = arg1.field2957;
        this.field2956 = arg1.field2956;
        this.field2962 = 1;
    }

    @ObfuscatedName("gh.z(Lgh;Lgh;B)V")
    public void method3430(class199 arg0, class199 arg1) {
        this.field2948 = arg0.field2948;
        this.field2949 = arg0.field2949;
        this.field2950 = arg0.field2950;
        this.field2938 = arg0.field2938;
        this.field2952 = arg0.field2952;
        this.field2953 = arg0.field2953;
        this.field2954 = arg0.field2954;
        this.field2945 = arg1.field2945;
        this.field2946 = arg1.field2946;
        this.field2947 = arg1.field2947;
        this.field2935 = arg1.field2935;
        this.field2944 = arg1.field2944;
        this.field2957 = arg1.field2957;
        this.field2962 = arg1.field2962;
        this.field2960 = arg1.field2960;
        this.field2981 = arg1.field2981;
        this.field2966 = arg1.field2966;
        this.field2963 = arg1.field2963;
        this.field2964 = arg1.field2964;
        this.field2967 = arg1.field2967;
        this.field2968 = arg1.field2968;
        this.field2971 = arg1.field2971;
        this.field2970 = arg1.field2970;
        this.field2974 = arg1.field2974;
        this.field2955 = arg1.field2955;
        this.field2961 = arg1.field2961;
        this.field2979 = new String[5];
        if (arg1.field2979 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2979[var3] = arg1.field2979[var3];
            }
        }
        this.field2979[4] = class174.field2345;
        this.field2956 = 0;
    }

    @ObfuscatedName("gh.t(Lgh;Lgh;I)V")
    public void method3472(class199 arg0, class199 arg1) {
        this.field2948 = arg0.field2948;
        this.field2949 = arg0.field2949;
        this.field2950 = arg0.field2950;
        this.field2938 = arg0.field2938;
        this.field2952 = arg0.field2952;
        this.field2953 = arg0.field2953;
        this.field2954 = arg0.field2954;
        this.field2945 = arg0.field2945;
        this.field2946 = arg0.field2946;
        this.field2947 = arg0.field2947;
        this.field2935 = arg0.field2935;
        this.field2962 = arg0.field2962;
        this.field2944 = arg1.field2944;
        this.field2956 = 0;
        this.field2957 = false;
        this.field2982 = false;
    }

    @ObfuscatedName("gh.m(II)Lbc;")
    public final class77 method3432(int arg0) {
        if (this.field2972 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2973[var3] && this.field2973[var3] != 0) {
                    var2 = this.field2972[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method1768(var2).method3432(1);
            }
        }
        class77 var4 = class77.method1393(Statics.field2977, this.field2948, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2983 != 128 || this.field2937 != 128 || this.field2978 != 128) {
            var4.method1353(this.field2983, this.field2937, this.field2978);
        }
        if (this.field2945 != null) {
            for (int var5 = 0; var5 < this.field2945.length; var5++) {
                var4.method1357(this.field2945[var5], this.field2946[var5]);
            }
        }
        if (this.field2947 != null) {
            for (int var6 = 0; var6 < this.field2947.length; var6++) {
                var4.method1399(this.field2947[var6], this.field2935[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gh.q(II)Lcs;")
    public final class83 method3433(int arg0) {
        if (this.field2972 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2973[var3] && this.field2973[var3] != 0) {
                    var2 = this.field2972[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method1768(var2).method3433(1);
            }
        }
        class83 var4 = (class83) field2969.method2186((long) this.field2959);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1393(Statics.field2977, this.field2948, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2983 != 128 || this.field2937 != 128 || this.field2978 != 128) {
            var5.method1353(this.field2983, this.field2937, this.field2978);
        }
        if (this.field2945 != null) {
            for (int var6 = 0; var6 < this.field2945.length; var6++) {
                var5.method1357(this.field2945[var6], this.field2946[var6]);
            }
        }
        if (this.field2947 != null) {
            for (int var7 = 0; var7 < this.field2947.length; var7++) {
                var5.method1399(this.field2947[var7], this.field2935[var7]);
            }
        }
        class83 var8 = var5.method1416(this.field2958 + 64, this.field2980 + 768, -50, -10, -50);
        var8.field1382 = true;
        field2969.method2179(var8, (long) this.field2959);
        return var8;
    }

    @ObfuscatedName("gh.e(IB)Lgh;")
    public class199 method3434(int arg0) {
        if (this.field2972 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2973[var3] && this.field2973[var3] != 0) {
                    var2 = this.field2972[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method1768(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("aq.v(IIIIIZB)Lhs;")
    public static final class225 method763(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2941.method2186(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = Statics.method1768(arg0);
        if (arg1 > 1 && var9.field2972 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2973[var11] && var9.field2973[var11] != 0) {
                    var10 = var9.field2972[var11];
                }
            }
            if (var10 != -1) {
                var9 = Statics.method1768(var10);
            }
        }
        class83 var12 = var9.method3433(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2975 != -1) {
            var13 = method763(var9.field2940, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2984 != -1) {
            var13 = method763(var9.field2942, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2943 != -1) {
            var13 = method763(var9.field2985, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3171;
        int var15 = Statics.field3175;
        int var16 = Statics.field3170;
        int[] var17 = new int[4];
        class220.method3753(var17);
        class225 var18 = new class225(36, 32);
        class220.method3749(var18.field3203, 36, 32);
        class220.method3793();
        class85.method1544();
        class85.method1534(16, 16);
        class85.field1432 = false;
        if (var9.field2943 != -1) {
            var13.method3884(0, 0);
        }
        int var19 = var9.field2949;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1439[var9.field2950] * var19 >> 16;
        int var21 = class85.field1429[var9.field2950] * var19 >> 16;
        var12.method1462();
        var12.method1461(0, var9.field2938, var9.field2952, var9.field2950, var9.field2953, var9.field2954 + var12.field1541 / 2 + var20, var9.field2954 + var21);
        if (var9.field2984 != -1) {
            var13.method3884(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3917(1);
        }
        if (arg2 >= 2) {
            var18.method3917(16777215);
        }
        if (arg3 != 0) {
            var18.method3903(arg3);
        }
        class220.method3749(var18.field3203, 36, 32);
        if (var9.field2975 != -1) {
            var13.method3884(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2962 == 1) {
            Statics.field3076.method3658(method3042(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2941.method2179(var18, var6);
        }
        class220.method3749(var14, var15, var16);
        class220.method3754(var17);
        class85.method1544();
        class85.field1432 = true;
        return var18;
    }

    @ObfuscatedName("fd.j(II)Ljava/lang/String;")
    public static final String method3042(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class174.field2567 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class174.field2498 + "</col>";
        }
    }

    @ObfuscatedName("gh.p(ZI)Z")
    public final boolean method3435(boolean arg0) {
        int var2 = this.field2960;
        int var3 = this.field2981;
        int var4 = this.field2966;
        if (arg0) {
            var2 = this.field2963;
            var3 = this.field2964;
            var4 = this.field2967;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2977.method3063(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2977.method3063(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2977.method3063(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gh.k(ZI)Lbc;")
    public final class77 method3436(boolean arg0) {
        int var2 = this.field2960;
        int var3 = this.field2981;
        int var4 = this.field2966;
        if (arg0) {
            var2 = this.field2963;
            var3 = this.field2964;
            var4 = this.field2967;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1393(Statics.field2977, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1393(Statics.field2977, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1393(Statics.field2977, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2986 != 0) {
            var5.method1356(0, this.field2986, 0);
        }
        if (arg0 && this.field2965 != 0) {
            var5.method1356(0, this.field2965, 0);
        }
        if (this.field2945 != null) {
            for (int var10 = 0; var10 < this.field2945.length; var10++) {
                var5.method1357(this.field2945[var10], this.field2946[var10]);
            }
        }
        if (this.field2947 != null) {
            for (int var11 = 0; var11 < this.field2947.length; var11++) {
                var5.method1399(this.field2947[var11], this.field2935[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gh.r(ZI)Z")
    public final boolean method3437(boolean arg0) {
        int var2 = this.field2968;
        int var3 = this.field2971;
        if (arg0) {
            var2 = this.field2970;
            var3 = this.field2974;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2977.method3063(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2977.method3063(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gh.y(ZB)Lbc;")
    public final class77 method3483(boolean arg0) {
        int var2 = this.field2968;
        int var3 = this.field2971;
        if (arg0) {
            var2 = this.field2970;
            var3 = this.field2974;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1393(Statics.field2977, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1393(Statics.field2977, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2945 != null) {
            for (int var7 = 0; var7 < this.field2945.length; var7++) {
                var4.method1357(this.field2945[var7], this.field2946[var7]);
            }
        }
        if (this.field2947 != null) {
            for (int var8 = 0; var8 < this.field2947.length; var8++) {
                var4.method1399(this.field2947[var8], this.field2935[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ex.h(I)V")
    public static void method2311() {
        field2939.method2176();
        field2969.method2176();
        field2941.method2176();
    }

    @ObfuscatedName("k.s(ZI)V")
    public static void method186(boolean arg0) {
        if (Statics.field2075 != arg0) {
            method2311();
            Statics.field2075 = arg0;
        }
    }
}

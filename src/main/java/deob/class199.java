package deob;

@ObfuscatedName("gm")
public class class199 extends class130 {

    @ObfuscatedName("gm.d")
    public static class125 field2933 = new class125(64);

    @ObfuscatedName("gm.n")
    public static class125 field2934 = new class125(50);

    @ObfuscatedName("gm.c")
    public static class125 field2935 = new class125(200);

    @ObfuscatedName("gm.g")
    public int field2936;

    @ObfuscatedName("gm.i")
    public int field2937;

    @ObfuscatedName("gm.v")
    public String field2938 = "null";

    @ObfuscatedName("gm.a")
    public short[] field2948;

    @ObfuscatedName("gm.h")
    public short[] field2928;

    @ObfuscatedName("gm.p")
    public short[] field2941;

    @ObfuscatedName("gm.t")
    public short[] field2942;

    @ObfuscatedName("gm.f")
    public int field2943 = 2000;

    @ObfuscatedName("gm.z")
    public int field2944 = 0;

    @ObfuscatedName("gm.u")
    public int field2945 = 0;

    @ObfuscatedName("gm.b")
    public int field2946 = 0;

    @ObfuscatedName("gm.m")
    public int field2947 = 0;

    @ObfuscatedName("gm.e")
    public int field2965 = 0;

    @ObfuscatedName("gm.l")
    public int field2968 = 0;

    @ObfuscatedName("gm.x")
    public int field2955 = 1;

    @ObfuscatedName("gm.ap")
    public boolean field2951 = false;

    @ObfuscatedName("gm.aq")
    public String[] field2952 = new String[] { null, null, class174.field2451, null, null };

    @ObfuscatedName("gm.aw")
    public String[] field2961 = new String[] { null, null, null, null, class174.field2483 };

    @ObfuscatedName("gm.as")
    public int field2980 = -1;

    @ObfuscatedName("gm.ah")
    public int field2966 = -1;

    @ObfuscatedName("gm.aa")
    public int field2956 = 0;

    @ObfuscatedName("gm.ai")
    public int field2957 = -1;

    @ObfuscatedName("gm.af")
    public int field2958 = -1;

    @ObfuscatedName("gm.aj")
    public int field2959 = 0;

    @ObfuscatedName("gm.am")
    public int field2960 = -1;

    @ObfuscatedName("gm.ar")
    public int field2981 = -1;

    @ObfuscatedName("gm.ad")
    public int field2962 = -1;

    @ObfuscatedName("gm.ay")
    public int field2963 = -1;

    @ObfuscatedName("gm.ao")
    public int field2964 = -1;

    @ObfuscatedName("gm.ac")
    public int field2950 = -1;

    @ObfuscatedName("gm.ag")
    public int[] field2949;

    @ObfuscatedName("gm.at")
    public int[] field2967;

    @ObfuscatedName("gm.au")
    public int field2972 = -1;

    @ObfuscatedName("gm.ax")
    public int field2977 = -1;

    @ObfuscatedName("gm.ae")
    public int field2970 = 128;

    @ObfuscatedName("gm.ab")
    public int field2971 = 128;

    @ObfuscatedName("gm.al")
    public int field2978 = 128;

    @ObfuscatedName("gm.az")
    public int field2973 = 0;

    @ObfuscatedName("gm.av")
    public int field2954 = 0;

    @ObfuscatedName("gm.ak")
    public int field2975 = 0;

    @ObfuscatedName("gm.an")
    public boolean field2976 = false;

    @ObfuscatedName("gm.bb")
    public int field2939 = -1;

    @ObfuscatedName("gm.bm")
    public int field2969 = -1;

    @ObfuscatedName("gm.bz")
    public int field2979 = -1;

    @ObfuscatedName("gm.bl")
    public int field2953 = -1;

    @ObfuscatedName("eu.k(II)Lgm;")
    public static class199 method2569(int arg0) {
        class199 var1 = (class199) field2933.method2159((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3080.method3065(10, arg0);
        class199 var3 = new class199();
        var3.field2936 = arg0;
        if (var2 != null) {
            var3.method3426(new class161(var2));
        }
        var3.method3425();
        if (var3.field2977 != -1) {
            var3.method3463(method2569(var3.field2977), method2569(var3.field2972));
        }
        if (var3.field2969 != -1) {
            var3.method3429(method2569(var3.field2969), method2569(var3.field2939));
        }
        if (var3.field2953 != -1) {
            var3.method3451(method2569(var3.field2953), method2569(var3.field2979));
        }
        if (!Statics.field2932 && var3.field2951) {
            var3.field2938 = class174.field2561;
            var3.field2976 = false;
            var3.field2952 = null;
            var3.field2961 = null;
            var3.field2975 = 0;
        }
        field2933.method2164(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gm.y(I)V")
    public void method3425() {
    }

    @ObfuscatedName("gm.o(Lfm;I)V")
    public void method3426(class161 arg0) {
        while (true) {
            int var2 = arg0.method2733();
            if (var2 == 0) {
                return;
            }
            this.method3428(arg0, var2);
        }
    }

    @ObfuscatedName("gm.r(Lfm;II)V")
    public void method3428(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2937 = arg0.method2735();
        } else if (arg1 == 2) {
            this.field2938 = arg0.method2740();
        } else if (arg1 == 4) {
            this.field2943 = arg0.method2735();
        } else if (arg1 == 5) {
            this.field2944 = arg0.method2735();
        } else if (arg1 == 6) {
            this.field2945 = arg0.method2735();
        } else if (arg1 == 7) {
            this.field2947 = arg0.method2735();
            if (this.field2947 > 32767) {
                this.field2947 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2965 = arg0.method2735();
            if (this.field2965 > 32767) {
                this.field2965 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2968 = 1;
        } else if (arg1 == 12) {
            this.field2955 = arg0.method2868();
        } else if (arg1 == 16) {
            this.field2951 = true;
        } else if (arg1 == 23) {
            this.field2980 = arg0.method2735();
            this.field2956 = arg0.method2733();
        } else if (arg1 == 24) {
            this.field2966 = arg0.method2735();
        } else if (arg1 == 25) {
            this.field2957 = arg0.method2735();
            this.field2959 = arg0.method2733();
        } else if (arg1 == 26) {
            this.field2958 = arg0.method2735();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2952[arg1 - 30] = arg0.method2740();
            if (this.field2952[arg1 - 30].equalsIgnoreCase(class174.field2344)) {
                this.field2952[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2961[arg1 - 35] = arg0.method2740();
        } else if (arg1 == 40) {
            int var3 = arg0.method2733();
            this.field2948 = new short[var3];
            this.field2928 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2948[var4] = (short) arg0.method2735();
                this.field2928[var4] = (short) arg0.method2735();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2733();
            this.field2941 = new short[var5];
            this.field2942 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2941[var6] = (short) arg0.method2735();
                this.field2942[var6] = (short) arg0.method2735();
            }
        } else if (arg1 == 65) {
            this.field2976 = true;
        } else if (arg1 == 78) {
            this.field2960 = arg0.method2735();
        } else if (arg1 == 79) {
            this.field2981 = arg0.method2735();
        } else if (arg1 == 90) {
            this.field2962 = arg0.method2735();
        } else if (arg1 == 91) {
            this.field2964 = arg0.method2735();
        } else if (arg1 == 92) {
            this.field2963 = arg0.method2735();
        } else if (arg1 == 93) {
            this.field2950 = arg0.method2735();
        } else if (arg1 == 95) {
            this.field2946 = arg0.method2735();
        } else if (arg1 == 97) {
            this.field2972 = arg0.method2735();
        } else if (arg1 == 98) {
            this.field2977 = arg0.method2735();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2949 == null) {
                this.field2949 = new int[10];
                this.field2967 = new int[10];
            }
            this.field2949[arg1 - 100] = arg0.method2735();
            this.field2967[arg1 - 100] = arg0.method2735();
        } else if (arg1 == 110) {
            this.field2970 = arg0.method2735();
        } else if (arg1 == 111) {
            this.field2971 = arg0.method2735();
        } else if (arg1 == 112) {
            this.field2978 = arg0.method2735();
        } else if (arg1 == 113) {
            this.field2973 = arg0.method2734();
        } else if (arg1 == 114) {
            this.field2954 = arg0.method2734() * 5;
        } else if (arg1 == 115) {
            this.field2975 = arg0.method2733();
        } else if (arg1 == 139) {
            this.field2939 = arg0.method2735();
        } else if (arg1 == 140) {
            this.field2969 = arg0.method2735();
        } else if (arg1 == 148) {
            this.field2979 = arg0.method2735();
        } else if (arg1 == 149) {
            this.field2953 = arg0.method2735();
        }
    }

    @ObfuscatedName("gm.w(Lgm;Lgm;I)V")
    public void method3463(class199 arg0, class199 arg1) {
        this.field2937 = arg0.field2937;
        this.field2943 = arg0.field2943;
        this.field2944 = arg0.field2944;
        this.field2945 = arg0.field2945;
        this.field2946 = arg0.field2946;
        this.field2947 = arg0.field2947;
        this.field2965 = arg0.field2965;
        this.field2948 = arg0.field2948;
        this.field2928 = arg0.field2928;
        this.field2941 = arg0.field2941;
        this.field2942 = arg0.field2942;
        this.field2938 = arg1.field2938;
        this.field2951 = arg1.field2951;
        this.field2955 = arg1.field2955;
        this.field2968 = 1;
    }

    @ObfuscatedName("gm.j(Lgm;Lgm;I)V")
    public void method3429(class199 arg0, class199 arg1) {
        this.field2937 = arg0.field2937;
        this.field2943 = arg0.field2943;
        this.field2944 = arg0.field2944;
        this.field2945 = arg0.field2945;
        this.field2946 = arg0.field2946;
        this.field2947 = arg0.field2947;
        this.field2965 = arg0.field2965;
        this.field2948 = arg1.field2948;
        this.field2928 = arg1.field2928;
        this.field2941 = arg1.field2941;
        this.field2942 = arg1.field2942;
        this.field2938 = arg1.field2938;
        this.field2951 = arg1.field2951;
        this.field2968 = arg1.field2968;
        this.field2980 = arg1.field2980;
        this.field2966 = arg1.field2966;
        this.field2960 = arg1.field2960;
        this.field2957 = arg1.field2957;
        this.field2958 = arg1.field2958;
        this.field2981 = arg1.field2981;
        this.field2962 = arg1.field2962;
        this.field2963 = arg1.field2963;
        this.field2964 = arg1.field2964;
        this.field2950 = arg1.field2950;
        this.field2975 = arg1.field2975;
        this.field2952 = arg1.field2952;
        this.field2961 = new String[5];
        if (arg1.field2961 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2961[var3] = arg1.field2961[var3];
            }
        }
        this.field2961[4] = class174.field2348;
        this.field2955 = 0;
    }

    @ObfuscatedName("gm.c(Lgm;Lgm;I)V")
    public void method3451(class199 arg0, class199 arg1) {
        this.field2937 = arg0.field2937;
        this.field2943 = arg0.field2943;
        this.field2944 = arg0.field2944;
        this.field2945 = arg0.field2945;
        this.field2946 = arg0.field2946;
        this.field2947 = arg0.field2947;
        this.field2965 = arg0.field2965;
        this.field2948 = arg0.field2948;
        this.field2928 = arg0.field2928;
        this.field2941 = arg0.field2941;
        this.field2942 = arg0.field2942;
        this.field2968 = arg0.field2968;
        this.field2938 = arg1.field2938;
        this.field2955 = 0;
        this.field2951 = false;
        this.field2976 = false;
    }

    @ObfuscatedName("gm.g(II)Lbg;")
    public final class77 method3431(int arg0) {
        if (this.field2949 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2967[var3] && this.field2967[var3] != 0) {
                    var2 = this.field2949[var3];
                }
            }
            if (var2 != -1) {
                return method2569(var2).method3431(1);
            }
        }
        class77 var4 = class77.method1384(Statics.field2931, this.field2937, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2970 != 128 || this.field2971 != 128 || this.field2978 != 128) {
            var4.method1429(this.field2970, this.field2971, this.field2978);
        }
        if (this.field2948 != null) {
            for (int var5 = 0; var5 < this.field2948.length; var5++) {
                var4.method1388(this.field2948[var5], this.field2928[var5]);
            }
        }
        if (this.field2941 != null) {
            for (int var6 = 0; var6 < this.field2941.length; var6++) {
                var4.method1398(this.field2941[var6], this.field2942[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gm.i(II)Lcu;")
    public final class83 method3432(int arg0) {
        if (this.field2949 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2967[var3] && this.field2967[var3] != 0) {
                    var2 = this.field2949[var3];
                }
            }
            if (var2 != -1) {
                return method2569(var2).method3432(1);
            }
        }
        class83 var4 = (class83) field2934.method2159((long) this.field2936);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1384(Statics.field2931, this.field2937, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2970 != 128 || this.field2971 != 128 || this.field2978 != 128) {
            var5.method1429(this.field2970, this.field2971, this.field2978);
        }
        if (this.field2948 != null) {
            for (int var6 = 0; var6 < this.field2948.length; var6++) {
                var5.method1388(this.field2948[var6], this.field2928[var6]);
            }
        }
        if (this.field2941 != null) {
            for (int var7 = 0; var7 < this.field2941.length; var7++) {
                var5.method1398(this.field2941[var7], this.field2942[var7]);
            }
        }
        class83 var8 = var5.method1405(this.field2973 + 64, this.field2954 + 768, -50, -10, -50);
        var8.field1379 = true;
        field2934.method2164(var8, (long) this.field2936);
        return var8;
    }

    @ObfuscatedName("gm.v(II)Lgm;")
    public class199 method3437(int arg0) {
        if (this.field2949 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2967[var3] && this.field2967[var3] != 0) {
                    var2 = this.field2949[var3];
                }
            }
            if (var2 != -1) {
                return method2569(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cl.a(IIIIIZB)Lhv;")
    public static final class225 method1797(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2935.method2159(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method2569(arg0);
        if (arg1 > 1 && var9.field2949 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2967[var11] && var9.field2967[var11] != 0) {
                    var10 = var9.field2949[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2569(var10);
            }
        }
        class83 var12 = var9.method3432(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2977 != -1) {
            var13 = method1797(var9.field2972, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2969 != -1) {
            var13 = method1797(var9.field2939, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2953 != -1) {
            var13 = method1797(var9.field2979, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3175;
        int var15 = Statics.field3171;
        int var16 = Statics.field3172;
        int[] var17 = new int[4];
        class220.method3754(var17);
        class225 var18 = new class225(36, 32);
        class220.method3750(var18.field3202, 36, 32);
        class220.method3756();
        class85.method1556();
        class85.method1560(16, 16);
        class85.field1432 = false;
        if (var9.field2953 != -1) {
            var13.method3875(0, 0);
        }
        int var19 = var9.field2943;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1429[var9.field2944] * var19 >> 16;
        int var21 = class85.field1453[var9.field2944] * var19 >> 16;
        var12.method1482();
        var12.method1494(0, var9.field2945, var9.field2946, var9.field2944, var9.field2947, var9.field2965 + var12.field1544 / 2 + var20, var9.field2965 + var21);
        if (var9.field2969 != -1) {
            var13.method3875(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3864(1);
        }
        if (arg2 >= 2) {
            var18.method3864(16777215);
        }
        if (arg3 != 0) {
            var18.method3931(arg3);
        }
        class220.method3750(var18.field3202, 36, 32);
        if (var9.field2977 != -1) {
            var13.method3875(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2968 == 1) {
            class209 var22 = Statics.field3071;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class174.field2597 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class174.field2600 + "</col>";
            }
            var22.method3699(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2935.method2164(var18, var6);
        }
        class220.method3750(var14, var15, var16);
        class220.method3792(var17);
        class85.method1556();
        class85.field1432 = true;
        return var18;
    }

    @ObfuscatedName("gm.h(ZI)Z")
    public final boolean method3424(boolean arg0) {
        int var2 = this.field2980;
        int var3 = this.field2966;
        int var4 = this.field2960;
        if (arg0) {
            var2 = this.field2957;
            var3 = this.field2958;
            var4 = this.field2981;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2931.method3067(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2931.method3067(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2931.method3067(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gm.p(ZI)Lbg;")
    public final class77 method3435(boolean arg0) {
        int var2 = this.field2980;
        int var3 = this.field2966;
        int var4 = this.field2960;
        if (arg0) {
            var2 = this.field2957;
            var3 = this.field2958;
            var4 = this.field2981;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1384(Statics.field2931, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1384(Statics.field2931, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1384(Statics.field2931, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2956 != 0) {
            var5.method1396(0, this.field2956, 0);
        }
        if (arg0 && this.field2959 != 0) {
            var5.method1396(0, this.field2959, 0);
        }
        if (this.field2948 != null) {
            for (int var10 = 0; var10 < this.field2948.length; var10++) {
                var5.method1388(this.field2948[var10], this.field2928[var10]);
            }
        }
        if (this.field2941 != null) {
            for (int var11 = 0; var11 < this.field2941.length; var11++) {
                var5.method1398(this.field2941[var11], this.field2942[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gm.t(ZI)Z")
    public final boolean method3478(boolean arg0) {
        int var2 = this.field2962;
        int var3 = this.field2963;
        if (arg0) {
            var2 = this.field2964;
            var3 = this.field2950;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2931.method3067(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2931.method3067(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gm.f(ZI)Lbg;")
    public final class77 method3427(boolean arg0) {
        int var2 = this.field2962;
        int var3 = this.field2963;
        if (arg0) {
            var2 = this.field2964;
            var3 = this.field2950;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1384(Statics.field2931, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1384(Statics.field2931, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2948 != null) {
            for (int var7 = 0; var7 < this.field2948.length; var7++) {
                var4.method1388(this.field2948[var7], this.field2928[var7]);
            }
        }
        if (this.field2941 != null) {
            for (int var8 = 0; var8 < this.field2941.length; var8++) {
                var4.method1398(this.field2941[var8], this.field2942[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ah.z(B)V")
    public static void method695() {
        field2933.method2161();
        field2934.method2161();
        field2935.method2161();
    }

    @ObfuscatedName("c.u(S)V")
    public static void method121() {
        field2935.method2161();
    }
}

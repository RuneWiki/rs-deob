package deob;

@ObfuscatedName("gx")
public class class199 extends class130 {

    @ObfuscatedName("gx.q")
    public static class125 field2950 = new class125(64);

    @ObfuscatedName("gx.w")
    public static class125 field2951 = new class125(50);

    @ObfuscatedName("gx.v")
    public static class125 field2952 = new class125(200);

    @ObfuscatedName("gx.p")
    public int field2989;

    @ObfuscatedName("gx.l")
    public int field2990;

    @ObfuscatedName("gx.c")
    public String field2946 = "null";

    @ObfuscatedName("gx.m")
    public short[] field2956;

    @ObfuscatedName("gx.r")
    public short[] field2957;

    @ObfuscatedName("gx.u")
    public short[] field2966;

    @ObfuscatedName("gx.j")
    public short[] field2959;

    @ObfuscatedName("gx.x")
    public int field2960 = 2000;

    @ObfuscatedName("gx.d")
    public int field2961 = 0;

    @ObfuscatedName("gx.y")
    public int field2954 = 0;

    @ObfuscatedName("gx.s")
    public int field2963 = 0;

    @ObfuscatedName("gx.t")
    public int field2978 = 0;

    @ObfuscatedName("gx.z")
    public int field2965 = 0;

    @ObfuscatedName("gx.b")
    public int field2979 = 0;

    @ObfuscatedName("gx.o")
    public int field2967 = 1;

    @ObfuscatedName("gx.ak")
    public boolean field2968 = false;

    @ObfuscatedName("gx.ai")
    public String[] field2975 = new String[] { null, null, class174.field2364, null, null };

    @ObfuscatedName("gx.aq")
    public String[] field2970 = new String[] { null, null, null, null, class174.field2565 };

    @ObfuscatedName("gx.an")
    public int field2971 = -1;

    @ObfuscatedName("gx.ay")
    public int field2972 = -1;

    @ObfuscatedName("gx.ap")
    public int field2973 = 0;

    @ObfuscatedName("gx.aj")
    public int field2981 = -1;

    @ObfuscatedName("gx.aw")
    public int field2962 = -1;

    @ObfuscatedName("gx.am")
    public int field2976 = 0;

    @ObfuscatedName("gx.av")
    public int field2977 = -1;

    @ObfuscatedName("gx.af")
    public int field2984 = -1;

    @ObfuscatedName("gx.az")
    public int field2945 = -1;

    @ObfuscatedName("gx.aa")
    public int field2980 = -1;

    @ObfuscatedName("gx.ad")
    public int field2969 = -1;

    @ObfuscatedName("gx.ab")
    public int field2982 = -1;

    @ObfuscatedName("gx.al")
    public int[] field2955;

    @ObfuscatedName("gx.as")
    public int[] field2994;

    @ObfuscatedName("gx.ar")
    public int field2985 = -1;

    @ObfuscatedName("gx.at")
    public int field2986 = -1;

    @ObfuscatedName("gx.ax")
    public int field2987 = 128;

    @ObfuscatedName("gx.ao")
    public int field2988 = 128;

    @ObfuscatedName("gx.ah")
    public int field2948 = 128;

    @ObfuscatedName("gx.ac")
    public int field2983 = 0;

    @ObfuscatedName("gx.ae")
    public int field2991 = 0;

    @ObfuscatedName("gx.au")
    public int field2992 = 0;

    @ObfuscatedName("gx.ag")
    public boolean field2993 = false;

    @ObfuscatedName("gx.bq")
    public int field2974 = -1;

    @ObfuscatedName("gx.bh")
    public int field2995 = -1;

    @ObfuscatedName("gx.bw")
    public int field2996 = -1;

    @ObfuscatedName("gx.ba")
    public int field2997 = -1;

    @ObfuscatedName("cv.i(Lgq;Lgq;ZLhw;I)V")
    public static void method1791(class183 arg0, class183 arg1, boolean arg2, class209 arg3) {
        Statics.field2953 = arg0;
        Statics.field2944 = arg1;
        Statics.field758 = arg2;
        Statics.field2949 = Statics.field2953.method3023(10);
        Statics.field2113 = arg3;
    }

    @ObfuscatedName("q.e(II)Lgx;")
    public static class199 method96(int arg0) {
        class199 var1 = (class199) field2950.method2150((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2953.method3014(10, arg0);
        class199 var3 = new class199();
        var3.field2989 = arg0;
        if (var2 != null) {
            var3.method3385(new class154(var2));
        }
        var3.method3411();
        if (var3.field2986 != -1) {
            var3.method3379(method96(var3.field2986), method96(var3.field2985));
        }
        if (var3.field2995 != -1) {
            var3.method3400(method96(var3.field2995), method96(var3.field2974));
        }
        if (var3.field2997 != -1) {
            var3.method3389(method96(var3.field2997), method96(var3.field2996));
        }
        if (!Statics.field758 && var3.field2968) {
            var3.field2946 = class174.field2470;
            var3.field2993 = false;
            var3.field2975 = null;
            var3.field2970 = null;
            var3.field2992 = 0;
        }
        field2950.method2152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gx.f(S)V")
    public void method3411() {
    }

    @ObfuscatedName("gx.k(Let;I)V")
    public void method3385(class154 arg0) {
        while (true) {
            int var2 = arg0.method2573();
            if (var2 == 0) {
                return;
            }
            this.method3378(arg0, var2);
        }
    }

    @ObfuscatedName("gx.a(Let;II)V")
    public void method3378(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2990 = arg0.method2575();
        } else if (arg1 == 2) {
            this.field2946 = arg0.method2581();
        } else if (arg1 == 4) {
            this.field2960 = arg0.method2575();
        } else if (arg1 == 5) {
            this.field2961 = arg0.method2575();
        } else if (arg1 == 6) {
            this.field2954 = arg0.method2575();
        } else if (arg1 == 7) {
            this.field2978 = arg0.method2575();
            if (this.field2978 > 32767) {
                this.field2978 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2965 = arg0.method2575();
            if (this.field2965 > 32767) {
                this.field2965 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2979 = 1;
        } else if (arg1 == 12) {
            this.field2967 = arg0.method2658();
        } else if (arg1 == 16) {
            this.field2968 = true;
        } else if (arg1 == 23) {
            this.field2971 = arg0.method2575();
            this.field2973 = arg0.method2573();
        } else if (arg1 == 24) {
            this.field2972 = arg0.method2575();
        } else if (arg1 == 25) {
            this.field2981 = arg0.method2575();
            this.field2976 = arg0.method2573();
        } else if (arg1 == 26) {
            this.field2962 = arg0.method2575();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2975[arg1 - 30] = arg0.method2581();
            if (this.field2975[arg1 - 30].equalsIgnoreCase(class174.field2409)) {
                this.field2975[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2970[arg1 - 35] = arg0.method2581();
        } else if (arg1 == 40) {
            int var3 = arg0.method2573();
            this.field2956 = new short[var3];
            this.field2957 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2956[var4] = (short) arg0.method2575();
                this.field2957[var4] = (short) arg0.method2575();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2573();
            this.field2966 = new short[var5];
            this.field2959 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2966[var6] = (short) arg0.method2575();
                this.field2959[var6] = (short) arg0.method2575();
            }
        } else if (arg1 == 65) {
            this.field2993 = true;
        } else if (arg1 == 78) {
            this.field2977 = arg0.method2575();
        } else if (arg1 == 79) {
            this.field2984 = arg0.method2575();
        } else if (arg1 == 90) {
            this.field2945 = arg0.method2575();
        } else if (arg1 == 91) {
            this.field2969 = arg0.method2575();
        } else if (arg1 == 92) {
            this.field2980 = arg0.method2575();
        } else if (arg1 == 93) {
            this.field2982 = arg0.method2575();
        } else if (arg1 == 95) {
            this.field2963 = arg0.method2575();
        } else if (arg1 == 97) {
            this.field2985 = arg0.method2575();
        } else if (arg1 == 98) {
            this.field2986 = arg0.method2575();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2955 == null) {
                this.field2955 = new int[10];
                this.field2994 = new int[10];
            }
            this.field2955[arg1 - 100] = arg0.method2575();
            this.field2994[arg1 - 100] = arg0.method2575();
        } else if (arg1 == 110) {
            this.field2987 = arg0.method2575();
        } else if (arg1 == 111) {
            this.field2988 = arg0.method2575();
        } else if (arg1 == 112) {
            this.field2948 = arg0.method2575();
        } else if (arg1 == 113) {
            this.field2983 = arg0.method2574();
        } else if (arg1 == 114) {
            this.field2991 = arg0.method2574();
        } else if (arg1 == 115) {
            this.field2992 = arg0.method2573();
        } else if (arg1 == 139) {
            this.field2974 = arg0.method2575();
        } else if (arg1 == 140) {
            this.field2995 = arg0.method2575();
        } else if (arg1 == 148) {
            this.field2996 = arg0.method2575();
        } else if (arg1 == 149) {
            this.field2997 = arg0.method2575();
        }
    }

    @ObfuscatedName("gx.q(Lgx;Lgx;I)V")
    public void method3379(class199 arg0, class199 arg1) {
        this.field2990 = arg0.field2990;
        this.field2960 = arg0.field2960;
        this.field2961 = arg0.field2961;
        this.field2954 = arg0.field2954;
        this.field2963 = arg0.field2963;
        this.field2978 = arg0.field2978;
        this.field2965 = arg0.field2965;
        this.field2956 = arg0.field2956;
        this.field2957 = arg0.field2957;
        this.field2966 = arg0.field2966;
        this.field2959 = arg0.field2959;
        this.field2946 = arg1.field2946;
        this.field2968 = arg1.field2968;
        this.field2967 = arg1.field2967;
        this.field2979 = 1;
    }

    @ObfuscatedName("gx.w(Lgx;Lgx;I)V")
    public void method3400(class199 arg0, class199 arg1) {
        this.field2990 = arg0.field2990;
        this.field2960 = arg0.field2960;
        this.field2961 = arg0.field2961;
        this.field2954 = arg0.field2954;
        this.field2963 = arg0.field2963;
        this.field2978 = arg0.field2978;
        this.field2965 = arg0.field2965;
        this.field2956 = arg1.field2956;
        this.field2957 = arg1.field2957;
        this.field2966 = arg1.field2966;
        this.field2959 = arg1.field2959;
        this.field2946 = arg1.field2946;
        this.field2968 = arg1.field2968;
        this.field2979 = arg1.field2979;
        this.field2971 = arg1.field2971;
        this.field2972 = arg1.field2972;
        this.field2977 = arg1.field2977;
        this.field2981 = arg1.field2981;
        this.field2962 = arg1.field2962;
        this.field2984 = arg1.field2984;
        this.field2945 = arg1.field2945;
        this.field2980 = arg1.field2980;
        this.field2969 = arg1.field2969;
        this.field2982 = arg1.field2982;
        this.field2992 = arg1.field2992;
        this.field2975 = arg1.field2975;
        this.field2970 = new String[5];
        if (arg1.field2970 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2970[var3] = arg1.field2970[var3];
            }
        }
        this.field2970[4] = class174.field2370;
        this.field2967 = 0;
    }

    @ObfuscatedName("gx.v(Lgx;Lgx;B)V")
    public void method3389(class199 arg0, class199 arg1) {
        this.field2990 = arg0.field2990;
        this.field2960 = arg0.field2960;
        this.field2961 = arg0.field2961;
        this.field2954 = arg0.field2954;
        this.field2963 = arg0.field2963;
        this.field2978 = arg0.field2978;
        this.field2965 = arg0.field2965;
        this.field2956 = arg0.field2956;
        this.field2957 = arg0.field2957;
        this.field2966 = arg0.field2966;
        this.field2959 = arg0.field2959;
        this.field2979 = arg0.field2979;
        this.field2946 = arg1.field2946;
        this.field2967 = 0;
        this.field2968 = false;
        this.field2993 = false;
    }

    @ObfuscatedName("gx.h(II)Lbv;")
    public final class77 method3382(int arg0) {
        if (this.field2955 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2994[var3] && this.field2994[var3] != 0) {
                    var2 = this.field2955[var3];
                }
            }
            if (var2 != -1) {
                return method96(var2).method3382(1);
            }
        }
        class77 var4 = class77.method1374(Statics.field2944, this.field2990, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2987 != 128 || this.field2988 != 128 || this.field2948 != 128) {
            var4.method1393(this.field2987, this.field2988, this.field2948);
        }
        if (this.field2956 != null) {
            for (int var5 = 0; var5 < this.field2956.length; var5++) {
                var4.method1405(this.field2956[var5], this.field2957[var5]);
            }
        }
        if (this.field2966 != null) {
            for (int var6 = 0; var6 < this.field2966.length; var6++) {
                var4.method1398(this.field2966[var6], this.field2959[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gx.p(II)Lch;")
    public final class83 method3383(int arg0) {
        if (this.field2955 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2994[var3] && this.field2994[var3] != 0) {
                    var2 = this.field2955[var3];
                }
            }
            if (var2 != -1) {
                return method96(var2).method3383(1);
            }
        }
        class83 var4 = (class83) field2951.method2150((long) this.field2989);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1374(Statics.field2944, this.field2990, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2987 != 128 || this.field2988 != 128 || this.field2948 != 128) {
            var5.method1393(this.field2987, this.field2988, this.field2948);
        }
        if (this.field2956 != null) {
            for (int var6 = 0; var6 < this.field2956.length; var6++) {
                var5.method1405(this.field2956[var6], this.field2957[var6]);
            }
        }
        if (this.field2966 != null) {
            for (int var7 = 0; var7 < this.field2966.length; var7++) {
                var5.method1398(this.field2966[var7], this.field2959[var7]);
            }
        }
        class83 var8 = var5.method1402(this.field2983 + 64, this.field2991 * 5 + 768, -50, -10, -50);
        var8.field1382 = true;
        field2951.method2152(var8, (long) this.field2989);
        return var8;
    }

    @ObfuscatedName("gx.l(II)Lgx;")
    public class199 method3384(int arg0) {
        if (this.field2955 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2994[var3] && this.field2994[var3] != 0) {
                    var2 = this.field2955[var3];
                }
            }
            if (var2 != -1) {
                return method96(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("fn.c(IIIIIZI)Lhj;")
    public static final class225 method3010(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2952.method2150(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method96(arg0);
        if (arg1 > 1 && var9.field2955 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2994[var11] && var9.field2994[var11] != 0) {
                    var10 = var9.field2955[var11];
                }
            }
            if (var10 != -1) {
                var9 = method96(var10);
            }
        }
        class83 var12 = var9.method3383(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2986 != -1) {
            var13 = method3010(var9.field2985, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2995 != -1) {
            var13 = method3010(var9.field2974, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2997 != -1) {
            var13 = method3010(var9.field2996, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3174;
        int var15 = Statics.field3173;
        int var16 = Statics.field3176;
        int[] var17 = new int[4];
        class220.method3678(var17);
        class225 var18 = new class225(36, 32);
        class220.method3674(var18.field3210, 36, 32);
        class220.method3734();
        class85.method1548();
        class85.method1551(16, 16);
        class85.field1434 = false;
        if (var9.field2997 != -1) {
            var13.method3795(0, 0);
        }
        int var19 = var9.field2960;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1454[var9.field2961] * var19 >> 16;
        int var21 = class85.field1455[var9.field2961] * var19 >> 16;
        var12.method1468();
        var12.method1478(0, var9.field2954, var9.field2963, var9.field2961, var9.field2978, var9.field2965 + var12.field1540 / 2 + var20, var9.field2965 + var21);
        if (var9.field2995 != -1) {
            var13.method3795(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3791(1);
        }
        if (arg2 >= 2) {
            var18.method3791(16777215);
        }
        if (arg3 != 0) {
            var18.method3792(arg3);
        }
        class220.method3674(var18.field3210, 36, 32);
        if (var9.field2986 != -1) {
            var13.method3795(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2979 == 1) {
            Statics.field2113.method3573(method2993(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2952.method2152(var18, var6);
        }
        class220.method3674(var14, var15, var16);
        class220.method3679(var17);
        class85.method1548();
        class85.field1434 = true;
        return var18;
    }

    @ObfuscatedName("fh.m(IB)Ljava/lang/String;")
    public static final String method2993(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class174.field2397 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class174.field2523 + "</col>";
        }
    }

    @ObfuscatedName("gx.r(ZB)Z")
    public final boolean method3397(boolean arg0) {
        int var2 = this.field2971;
        int var3 = this.field2972;
        int var4 = this.field2977;
        if (arg0) {
            var2 = this.field2981;
            var3 = this.field2962;
            var4 = this.field2984;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2944.method3016(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2944.method3016(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2944.method3016(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gx.u(ZS)Lbv;")
    public final class77 method3386(boolean arg0) {
        int var2 = this.field2971;
        int var3 = this.field2972;
        int var4 = this.field2977;
        if (arg0) {
            var2 = this.field2981;
            var3 = this.field2962;
            var4 = this.field2984;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1374(Statics.field2944, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1374(Statics.field2944, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1374(Statics.field2944, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2973 != 0) {
            var5.method1385(0, this.field2973, 0);
        }
        if (arg0 && this.field2976 != 0) {
            var5.method1385(0, this.field2976, 0);
        }
        if (this.field2956 != null) {
            for (int var10 = 0; var10 < this.field2956.length; var10++) {
                var5.method1405(this.field2956[var10], this.field2957[var10]);
            }
        }
        if (this.field2966 != null) {
            for (int var11 = 0; var11 < this.field2966.length; var11++) {
                var5.method1398(this.field2966[var11], this.field2959[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gx.j(ZI)Z")
    public final boolean method3381(boolean arg0) {
        int var2 = this.field2945;
        int var3 = this.field2980;
        if (arg0) {
            var2 = this.field2969;
            var3 = this.field2982;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2944.method3016(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2944.method3016(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gx.x(ZB)Lbv;")
    public final class77 method3417(boolean arg0) {
        int var2 = this.field2945;
        int var3 = this.field2980;
        if (arg0) {
            var2 = this.field2969;
            var3 = this.field2982;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1374(Statics.field2944, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1374(Statics.field2944, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2956 != null) {
            for (int var7 = 0; var7 < this.field2956.length; var7++) {
                var4.method1405(this.field2956[var7], this.field2957[var7]);
            }
        }
        if (this.field2966 != null) {
            for (int var8 = 0; var8 < this.field2966.length; var8++) {
                var4.method1398(this.field2966[var8], this.field2959[var8]);
            }
        }
        return var4;
    }
}

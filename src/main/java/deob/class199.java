package deob;

@ObfuscatedName("gu")
public class class199 extends class130 {

    @ObfuscatedName("gu.c")
    public static class125 field2944 = new class125(64);

    @ObfuscatedName("gu.u")
    public static class125 field2945 = new class125(50);

    @ObfuscatedName("gu.k")
    public static class125 field2946 = new class125(200);

    @ObfuscatedName("gu.y")
    public int field2948;

    @ObfuscatedName("gu.j")
    public int field2991;

    @ObfuscatedName("gu.f")
    public String field2950 = "null";

    @ObfuscatedName("gu.p")
    public short[] field2967;

    @ObfuscatedName("gu.i")
    public short[] field2952;

    @ObfuscatedName("gu.s")
    public short[] field2953;

    @ObfuscatedName("gu.x")
    public short[] field2964;

    @ObfuscatedName("gu.d")
    public int field2955 = 2000;

    @ObfuscatedName("gu.w")
    public int field2974 = 0;

    @ObfuscatedName("gu.n")
    public int field2978 = 0;

    @ObfuscatedName("gu.q")
    public int field2943 = 0;

    @ObfuscatedName("gu.t")
    public int field2959 = 0;

    @ObfuscatedName("gu.r")
    public int field2960 = 0;

    @ObfuscatedName("gu.a")
    public int field2961 = 0;

    @ObfuscatedName("gu.e")
    public int field2992 = 1;

    @ObfuscatedName("gu.am")
    public boolean field2963 = false;

    @ObfuscatedName("gu.ag")
    public String[] field2965 = new String[] { null, null, class174.field2381, null, null };

    @ObfuscatedName("gu.au")
    public String[] field2954 = new String[] { null, null, null, null, class174.field2365 };

    @ObfuscatedName("gu.aa")
    public int field2972 = -1;

    @ObfuscatedName("gu.ae")
    public int field2962 = -1;

    @ObfuscatedName("gu.av")
    public int field2968 = 0;

    @ObfuscatedName("gu.ao")
    public int field2949 = -1;

    @ObfuscatedName("gu.ah")
    public int field2970 = -1;

    @ObfuscatedName("gu.ak")
    public int field2971 = 0;

    @ObfuscatedName("gu.ab")
    public int field2958 = -1;

    @ObfuscatedName("gu.ay")
    public int field2973 = -1;

    @ObfuscatedName("gu.an")
    public int field2941 = -1;

    @ObfuscatedName("gu.aw")
    public int field2975 = -1;

    @ObfuscatedName("gu.af")
    public int field2976 = -1;

    @ObfuscatedName("gu.ac")
    public int field2977 = -1;

    @ObfuscatedName("gu.ar")
    public int[] field2966;

    @ObfuscatedName("gu.at")
    public int[] field2979;

    @ObfuscatedName("gu.al")
    public int field2980 = -1;

    @ObfuscatedName("gu.ax")
    public int field2981 = -1;

    @ObfuscatedName("gu.az")
    public int field2982 = 128;

    @ObfuscatedName("gu.ai")
    public int field2983 = 128;

    @ObfuscatedName("gu.ap")
    public int field2984 = 128;

    @ObfuscatedName("gu.aj")
    public int field2985 = 0;

    @ObfuscatedName("gu.aq")
    public int field2986 = 0;

    @ObfuscatedName("gu.as")
    public int field2987 = 0;

    @ObfuscatedName("gu.ad")
    public boolean field2988 = false;

    @ObfuscatedName("gu.bm")
    public int field2989 = -1;

    @ObfuscatedName("gu.bd")
    public int field2990 = -1;

    @ObfuscatedName("gu.br")
    public int field2951 = -1;

    @ObfuscatedName("gu.bh")
    public int field2956 = -1;

    @ObfuscatedName("gi.o(Lgl;Lgl;ZLhq;B)V")
    public static void method3312(class183 arg0, class183 arg1, boolean arg2, class209 arg3) {
        Statics.field3167 = arg0;
        Statics.field2942 = arg1;
        Statics.field2343 = arg2;
        Statics.field2969 = Statics.field3167.method3054(10);
        Statics.field2947 = arg3;
    }

    @ObfuscatedName("ey.m(II)Lgu;")
    public static class199 method2268(int arg0) {
        class199 var1 = (class199) field2944.method2130((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3167.method3012(10, arg0);
        class199 var3 = new class199();
        var3.field2948 = arg0;
        if (var2 != null) {
            var3.method3351(new class154(var2));
        }
        var3.method3411();
        if (var3.field2981 != -1) {
            var3.method3353(method2268(var3.field2981), method2268(var3.field2980));
        }
        if (var3.field2990 != -1) {
            var3.method3354(method2268(var3.field2990), method2268(var3.field2989));
        }
        if (var3.field2956 != -1) {
            var3.method3358(method2268(var3.field2956), method2268(var3.field2951));
        }
        if (!Statics.field2343 && var3.field2963) {
            var3.field2950 = class174.field2572;
            var3.field2988 = false;
            var3.field2965 = null;
            var3.field2954 = null;
            var3.field2987 = 0;
        }
        field2944.method2132(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.b(I)V")
    public void method3411() {
    }

    @ObfuscatedName("gu.g(Lez;I)V")
    public void method3351(class154 arg0) {
        while (true) {
            int var2 = arg0.method2552();
            if (var2 == 0) {
                return;
            }
            this.method3403(arg0, var2);
        }
    }

    @ObfuscatedName("gu.l(Lez;II)V")
    public void method3403(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2991 = arg0.method2554();
        } else if (arg1 == 2) {
            this.field2950 = arg0.method2606();
        } else if (arg1 == 4) {
            this.field2955 = arg0.method2554();
        } else if (arg1 == 5) {
            this.field2974 = arg0.method2554();
        } else if (arg1 == 6) {
            this.field2978 = arg0.method2554();
        } else if (arg1 == 7) {
            this.field2959 = arg0.method2554();
            if (this.field2959 > 32767) {
                this.field2959 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2960 = arg0.method2554();
            if (this.field2960 > 32767) {
                this.field2960 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2961 = 1;
        } else if (arg1 == 12) {
            this.field2992 = arg0.method2557();
        } else if (arg1 == 16) {
            this.field2963 = true;
        } else if (arg1 == 23) {
            this.field2972 = arg0.method2554();
            this.field2968 = arg0.method2552();
        } else if (arg1 == 24) {
            this.field2962 = arg0.method2554();
        } else if (arg1 == 25) {
            this.field2949 = arg0.method2554();
            this.field2971 = arg0.method2552();
        } else if (arg1 == 26) {
            this.field2970 = arg0.method2554();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2965[arg1 - 30] = arg0.method2606();
            if (this.field2965[arg1 - 30].equalsIgnoreCase(class174.field2364)) {
                this.field2965[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2954[arg1 - 35] = arg0.method2606();
        } else if (arg1 == 40) {
            int var3 = arg0.method2552();
            this.field2967 = new short[var3];
            this.field2952 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2967[var4] = (short) arg0.method2554();
                this.field2952[var4] = (short) arg0.method2554();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2552();
            this.field2953 = new short[var5];
            this.field2964 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2953[var6] = (short) arg0.method2554();
                this.field2964[var6] = (short) arg0.method2554();
            }
        } else if (arg1 == 65) {
            this.field2988 = true;
        } else if (arg1 == 78) {
            this.field2958 = arg0.method2554();
        } else if (arg1 == 79) {
            this.field2973 = arg0.method2554();
        } else if (arg1 == 90) {
            this.field2941 = arg0.method2554();
        } else if (arg1 == 91) {
            this.field2976 = arg0.method2554();
        } else if (arg1 == 92) {
            this.field2975 = arg0.method2554();
        } else if (arg1 == 93) {
            this.field2977 = arg0.method2554();
        } else if (arg1 == 95) {
            this.field2943 = arg0.method2554();
        } else if (arg1 == 97) {
            this.field2980 = arg0.method2554();
        } else if (arg1 == 98) {
            this.field2981 = arg0.method2554();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2966 == null) {
                this.field2966 = new int[10];
                this.field2979 = new int[10];
            }
            this.field2966[arg1 - 100] = arg0.method2554();
            this.field2979[arg1 - 100] = arg0.method2554();
        } else if (arg1 == 110) {
            this.field2982 = arg0.method2554();
        } else if (arg1 == 111) {
            this.field2983 = arg0.method2554();
        } else if (arg1 == 112) {
            this.field2984 = arg0.method2554();
        } else if (arg1 == 113) {
            this.field2985 = arg0.method2553();
        } else if (arg1 == 114) {
            this.field2986 = arg0.method2553() * 5;
        } else if (arg1 == 115) {
            this.field2987 = arg0.method2552();
        } else if (arg1 == 139) {
            this.field2989 = arg0.method2554();
        } else if (arg1 == 140) {
            this.field2990 = arg0.method2554();
        } else if (arg1 == 148) {
            this.field2951 = arg0.method2554();
        } else if (arg1 == 149) {
            this.field2956 = arg0.method2554();
        }
    }

    @ObfuscatedName("gu.c(Lgu;Lgu;B)V")
    public void method3353(class199 arg0, class199 arg1) {
        this.field2991 = arg0.field2991;
        this.field2955 = arg0.field2955;
        this.field2974 = arg0.field2974;
        this.field2978 = arg0.field2978;
        this.field2943 = arg0.field2943;
        this.field2959 = arg0.field2959;
        this.field2960 = arg0.field2960;
        this.field2967 = arg0.field2967;
        this.field2952 = arg0.field2952;
        this.field2953 = arg0.field2953;
        this.field2964 = arg0.field2964;
        this.field2950 = arg1.field2950;
        this.field2963 = arg1.field2963;
        this.field2992 = arg1.field2992;
        this.field2961 = 1;
    }

    @ObfuscatedName("gu.u(Lgu;Lgu;I)V")
    public void method3354(class199 arg0, class199 arg1) {
        this.field2991 = arg0.field2991;
        this.field2955 = arg0.field2955;
        this.field2974 = arg0.field2974;
        this.field2978 = arg0.field2978;
        this.field2943 = arg0.field2943;
        this.field2959 = arg0.field2959;
        this.field2960 = arg0.field2960;
        this.field2967 = arg1.field2967;
        this.field2952 = arg1.field2952;
        this.field2953 = arg1.field2953;
        this.field2964 = arg1.field2964;
        this.field2950 = arg1.field2950;
        this.field2963 = arg1.field2963;
        this.field2961 = arg1.field2961;
        this.field2972 = arg1.field2972;
        this.field2962 = arg1.field2962;
        this.field2958 = arg1.field2958;
        this.field2949 = arg1.field2949;
        this.field2970 = arg1.field2970;
        this.field2973 = arg1.field2973;
        this.field2941 = arg1.field2941;
        this.field2975 = arg1.field2975;
        this.field2976 = arg1.field2976;
        this.field2977 = arg1.field2977;
        this.field2987 = arg1.field2987;
        this.field2965 = arg1.field2965;
        this.field2954 = new String[5];
        if (arg1.field2954 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2954[var3] = arg1.field2954[var3];
            }
        }
        this.field2954[4] = class174.field2368;
        this.field2992 = 0;
    }

    @ObfuscatedName("gu.k(Lgu;Lgu;I)V")
    public void method3358(class199 arg0, class199 arg1) {
        this.field2991 = arg0.field2991;
        this.field2955 = arg0.field2955;
        this.field2974 = arg0.field2974;
        this.field2978 = arg0.field2978;
        this.field2943 = arg0.field2943;
        this.field2959 = arg0.field2959;
        this.field2960 = arg0.field2960;
        this.field2967 = arg0.field2967;
        this.field2952 = arg0.field2952;
        this.field2953 = arg0.field2953;
        this.field2964 = arg0.field2964;
        this.field2961 = arg0.field2961;
        this.field2950 = arg1.field2950;
        this.field2992 = 0;
        this.field2963 = false;
        this.field2988 = false;
    }

    @ObfuscatedName("gu.z(II)Lbg;")
    public final class77 method3385(int arg0) {
        if (this.field2966 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2979[var3] && this.field2979[var3] != 0) {
                    var2 = this.field2966[var3];
                }
            }
            if (var2 != -1) {
                return method2268(var2).method3385(1);
            }
        }
        class77 var4 = class77.method1358(Statics.field2942, this.field2991, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2982 != 128 || this.field2983 != 128 || this.field2984 != 128) {
            var4.method1422(this.field2982, this.field2983, this.field2984);
        }
        if (this.field2967 != null) {
            for (int var5 = 0; var5 < this.field2967.length; var5++) {
                var4.method1372(this.field2967[var5], this.field2952[var5]);
            }
        }
        if (this.field2953 != null) {
            for (int var6 = 0; var6 < this.field2953.length; var6++) {
                var4.method1373(this.field2953[var6], this.field2964[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gu.y(IS)Lcy;")
    public final class83 method3365(int arg0) {
        if (this.field2966 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2979[var3] && this.field2979[var3] != 0) {
                    var2 = this.field2966[var3];
                }
            }
            if (var2 != -1) {
                return method2268(var2).method3365(1);
            }
        }
        class83 var4 = (class83) field2945.method2130((long) this.field2948);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1358(Statics.field2942, this.field2991, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2982 != 128 || this.field2983 != 128 || this.field2984 != 128) {
            var5.method1422(this.field2982, this.field2983, this.field2984);
        }
        if (this.field2967 != null) {
            for (int var6 = 0; var6 < this.field2967.length; var6++) {
                var5.method1372(this.field2967[var6], this.field2952[var6]);
            }
        }
        if (this.field2953 != null) {
            for (int var7 = 0; var7 < this.field2953.length; var7++) {
                var5.method1373(this.field2953[var7], this.field2964[var7]);
            }
        }
        class83 var8 = var5.method1389(this.field2985 + 64, this.field2986 + 768, -50, -10, -50);
        var8.field1358 = true;
        field2945.method2132(var8, (long) this.field2948);
        return var8;
    }

    @ObfuscatedName("gu.j(II)Lgu;")
    public class199 method3362(int arg0) {
        if (this.field2966 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2979[var3] && this.field2979[var3] != 0) {
                    var2 = this.field2966[var3];
                }
            }
            if (var2 != -1) {
                return method2268(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("cg.f(IIIIIZI)Lhm;")
    public static final class225 method1779(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2946.method2130(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method2268(arg0);
        if (arg1 > 1 && var9.field2966 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2979[var11] && var9.field2979[var11] != 0) {
                    var10 = var9.field2966[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2268(var10);
            }
        }
        class83 var12 = var9.method3365(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2981 != -1) {
            var13 = method1779(var9.field2980, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2990 != -1) {
            var13 = method1779(var9.field2989, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2956 != -1) {
            var13 = method1779(var9.field2951, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3171;
        int var15 = Statics.field3175;
        int var16 = Statics.field3173;
        int[] var17 = new int[4];
        class220.method3736(var17);
        class225 var18 = new class225(36, 32);
        class220.method3692(var18.field3211, 36, 32);
        class220.method3698();
        class85.method1528();
        class85.method1526(16, 16);
        class85.field1426 = false;
        if (var9.field2956 != -1) {
            var13.method3814(0, 0);
        }
        int var19 = var9.field2955;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1436[var9.field2974] * var19 >> 16;
        int var21 = class85.field1447[var9.field2974] * var19 >> 16;
        var12.method1445();
        var12.method1462(0, var9.field2978, var9.field2943, var9.field2974, var9.field2959, var9.field2960 + var12.field1534 / 2 + var20, var9.field2960 + var21);
        if (var9.field2990 != -1) {
            var13.method3814(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3895(1);
        }
        if (arg2 >= 2) {
            var18.method3895(16777215);
        }
        if (arg3 != 0) {
            var18.method3840(arg3);
        }
        class220.method3692(var18.field3211, 36, 32);
        if (var9.field2981 != -1) {
            var13.method3814(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2961 == 1) {
            class209 var22 = Statics.field2947;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class174.field2514 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class174.field2406 + "</col>";
            }
            var22.method3584(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2946.method2132(var18, var6);
        }
        class220.method3692(var14, var15, var16);
        class220.method3721(var17);
        class85.method1528();
        class85.field1426 = true;
        return var18;
    }

    @ObfuscatedName("gu.p(ZI)Z")
    public final boolean method3359(boolean arg0) {
        int var2 = this.field2972;
        int var3 = this.field2962;
        int var4 = this.field2958;
        if (arg0) {
            var2 = this.field2949;
            var3 = this.field2970;
            var4 = this.field2973;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2942.method3014(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2942.method3014(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2942.method3014(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gu.i(ZI)Lbg;")
    public final class77 method3355(boolean arg0) {
        int var2 = this.field2972;
        int var3 = this.field2962;
        int var4 = this.field2958;
        if (arg0) {
            var2 = this.field2949;
            var3 = this.field2970;
            var4 = this.field2973;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1358(Statics.field2942, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1358(Statics.field2942, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1358(Statics.field2942, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2968 != 0) {
            var5.method1371(0, this.field2968, 0);
        }
        if (arg0 && this.field2971 != 0) {
            var5.method1371(0, this.field2971, 0);
        }
        if (this.field2967 != null) {
            for (int var10 = 0; var10 < this.field2967.length; var10++) {
                var5.method1372(this.field2967[var10], this.field2952[var10]);
            }
        }
        if (this.field2953 != null) {
            for (int var11 = 0; var11 < this.field2953.length; var11++) {
                var5.method1373(this.field2953[var11], this.field2964[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gu.s(ZI)Z")
    public final boolean method3361(boolean arg0) {
        int var2 = this.field2941;
        int var3 = this.field2975;
        if (arg0) {
            var2 = this.field2976;
            var3 = this.field2977;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2942.method3014(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2942.method3014(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gu.x(ZB)Lbg;")
    public final class77 method3370(boolean arg0) {
        int var2 = this.field2941;
        int var3 = this.field2975;
        if (arg0) {
            var2 = this.field2976;
            var3 = this.field2977;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1358(Statics.field2942, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1358(Statics.field2942, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2967 != null) {
            for (int var7 = 0; var7 < this.field2967.length; var7++) {
                var4.method1372(this.field2967[var7], this.field2952[var7]);
            }
        }
        if (this.field2953 != null) {
            for (int var8 = 0; var8 < this.field2953.length; var8++) {
                var4.method1373(this.field2953[var8], this.field2964[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("fg.d(B)V")
    public static void method2989() {
        field2944.method2139();
        field2945.method2139();
        field2946.method2139();
    }

    @ObfuscatedName("y.w(ZI)V")
    public static void method150(boolean arg0) {
        if (Statics.field2343 != arg0) {
            method2989();
            Statics.field2343 = arg0;
        }
    }
}

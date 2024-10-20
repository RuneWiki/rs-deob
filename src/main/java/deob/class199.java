package deob;

@ObfuscatedName("gd")
public class class199 extends class130 {

    @ObfuscatedName("gd.s")
    public static class125 field2943 = new class125(64);

    @ObfuscatedName("gd.o")
    public static class125 field2946 = new class125(50);

    @ObfuscatedName("gd.a")
    public static class125 field2954 = new class125(200);

    @ObfuscatedName("gd.m")
    public int field2948;

    @ObfuscatedName("gd.h")
    public int field2949;

    @ObfuscatedName("gd.r")
    public String field2958 = "null";

    @ObfuscatedName("gd.u")
    public short[] field2987;

    @ObfuscatedName("gd.i")
    public short[] field2960;

    @ObfuscatedName("gd.z")
    public short[] field2953;

    @ObfuscatedName("gd.n")
    public short[] field2989;

    @ObfuscatedName("gd.w")
    public int field2955 = 2000;

    @ObfuscatedName("gd.y")
    public int field2956 = 0;

    @ObfuscatedName("gd.v")
    public int field2940 = 0;

    @ObfuscatedName("gd.f")
    public int field2952 = 0;

    @ObfuscatedName("gd.l")
    public int field2951 = 0;

    @ObfuscatedName("gd.t")
    public int field2957 = 0;

    @ObfuscatedName("gd.b")
    public int field2961 = 0;

    @ObfuscatedName("gd.e")
    public int field2959 = 1;

    @ObfuscatedName("gd.ai")
    public boolean field2976 = false;

    @ObfuscatedName("gd.am")
    public String[] field2964 = new String[] { null, null, class174.field2353, null, null };

    @ObfuscatedName("gd.ad")
    public String[] field2965 = new String[] { null, null, null, null, class174.field2358 };

    @ObfuscatedName("gd.ah")
    public int field2978 = -1;

    @ObfuscatedName("gd.aj")
    public int field2967 = -1;

    @ObfuscatedName("gd.ax")
    public int field2969 = 0;

    @ObfuscatedName("gd.ak")
    public int field2939 = -1;

    @ObfuscatedName("gd.ar")
    public int field2970 = -1;

    @ObfuscatedName("gd.aw")
    public int field2966 = 0;

    @ObfuscatedName("gd.ay")
    public int field2972 = -1;

    @ObfuscatedName("gd.af")
    public int field2973 = -1;

    @ObfuscatedName("gd.av")
    public int field2974 = -1;

    @ObfuscatedName("gd.aa")
    public int field2975 = -1;

    @ObfuscatedName("gd.ag")
    public int field2962 = -1;

    @ObfuscatedName("gd.ao")
    public int field2977 = -1;

    @ObfuscatedName("gd.ab")
    public int[] field2971;

    @ObfuscatedName("gd.an")
    public int[] field2979;

    @ObfuscatedName("gd.ac")
    public int field2968 = -1;

    @ObfuscatedName("gd.al")
    public int field2981 = -1;

    @ObfuscatedName("gd.ae")
    public int field2982 = 128;

    @ObfuscatedName("gd.ap")
    public int field2983 = 128;

    @ObfuscatedName("gd.au")
    public int field2980 = 128;

    @ObfuscatedName("gd.aq")
    public int field2985 = 0;

    @ObfuscatedName("gd.at")
    public int field2986 = 0;

    @ObfuscatedName("gd.az")
    public int field2947 = 0;

    @ObfuscatedName("gd.as")
    public boolean field2988 = false;

    @ObfuscatedName("gd.be")
    public int field2963 = -1;

    @ObfuscatedName("gd.bu")
    public int field2990 = -1;

    @ObfuscatedName("gd.bo")
    public int field2991 = -1;

    @ObfuscatedName("gd.br")
    public int field2992 = -1;

    @ObfuscatedName("af.p(IB)Lgd;")
    public static class199 method713(int arg0) {
        class199 var1 = (class199) field2943.method2169((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2942.method3044(10, arg0);
        class199 var3 = new class199();
        var3.field2948 = arg0;
        if (var2 != null) {
            var3.method3401(new class154(var2));
        }
        var3.method3404();
        if (var3.field2981 != -1) {
            var3.method3400(method713(var3.field2981), method713(var3.field2968));
        }
        if (var3.field2990 != -1) {
            var3.method3444(method713(var3.field2990), method713(var3.field2963));
        }
        if (var3.field2992 != -1) {
            var3.method3402(method713(var3.field2992), method713(var3.field2991));
        }
        if (!Statics.field2945 && var3.field2976) {
            var3.field2958 = class174.field2551;
            var3.field2988 = false;
            var3.field2964 = null;
            var3.field2965 = null;
            var3.field2947 = 0;
        }
        field2943.method2174(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gd.g(I)V")
    public void method3404() {
    }

    @ObfuscatedName("gd.x(Lev;I)V")
    public void method3401(class154 arg0) {
        while (true) {
            int var2 = arg0.method2593();
            if (var2 == 0) {
                return;
            }
            this.method3399(arg0, var2);
        }
    }

    @ObfuscatedName("gd.q(Lev;II)V")
    public void method3399(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2949 = arg0.method2595();
        } else if (arg1 == 2) {
            this.field2958 = arg0.method2625();
        } else if (arg1 == 4) {
            this.field2955 = arg0.method2595();
        } else if (arg1 == 5) {
            this.field2956 = arg0.method2595();
        } else if (arg1 == 6) {
            this.field2940 = arg0.method2595();
        } else if (arg1 == 7) {
            this.field2951 = arg0.method2595();
            if (this.field2951 > 32767) {
                this.field2951 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2957 = arg0.method2595();
            if (this.field2957 > 32767) {
                this.field2957 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2961 = 1;
        } else if (arg1 == 12) {
            this.field2959 = arg0.method2598();
        } else if (arg1 == 16) {
            this.field2976 = true;
        } else if (arg1 == 23) {
            this.field2978 = arg0.method2595();
            this.field2969 = arg0.method2593();
        } else if (arg1 == 24) {
            this.field2967 = arg0.method2595();
        } else if (arg1 == 25) {
            this.field2939 = arg0.method2595();
            this.field2966 = arg0.method2593();
        } else if (arg1 == 26) {
            this.field2970 = arg0.method2595();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2964[arg1 - 30] = arg0.method2625();
            if (this.field2964[arg1 - 30].equalsIgnoreCase(class174.field2443)) {
                this.field2964[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2965[arg1 - 35] = arg0.method2625();
        } else if (arg1 == 40) {
            int var3 = arg0.method2593();
            this.field2987 = new short[var3];
            this.field2960 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2987[var4] = (short) arg0.method2595();
                this.field2960[var4] = (short) arg0.method2595();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2593();
            this.field2953 = new short[var5];
            this.field2989 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2953[var6] = (short) arg0.method2595();
                this.field2989[var6] = (short) arg0.method2595();
            }
        } else if (arg1 == 65) {
            this.field2988 = true;
        } else if (arg1 == 78) {
            this.field2972 = arg0.method2595();
        } else if (arg1 == 79) {
            this.field2973 = arg0.method2595();
        } else if (arg1 == 90) {
            this.field2974 = arg0.method2595();
        } else if (arg1 == 91) {
            this.field2962 = arg0.method2595();
        } else if (arg1 == 92) {
            this.field2975 = arg0.method2595();
        } else if (arg1 == 93) {
            this.field2977 = arg0.method2595();
        } else if (arg1 == 95) {
            this.field2952 = arg0.method2595();
        } else if (arg1 == 97) {
            this.field2968 = arg0.method2595();
        } else if (arg1 == 98) {
            this.field2981 = arg0.method2595();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2971 == null) {
                this.field2971 = new int[10];
                this.field2979 = new int[10];
            }
            this.field2971[arg1 - 100] = arg0.method2595();
            this.field2979[arg1 - 100] = arg0.method2595();
        } else if (arg1 == 110) {
            this.field2982 = arg0.method2595();
        } else if (arg1 == 111) {
            this.field2983 = arg0.method2595();
        } else if (arg1 == 112) {
            this.field2980 = arg0.method2595();
        } else if (arg1 == 113) {
            this.field2985 = arg0.method2631();
        } else if (arg1 == 114) {
            this.field2986 = arg0.method2631() * 5;
        } else if (arg1 == 115) {
            this.field2947 = arg0.method2593();
        } else if (arg1 == 139) {
            this.field2963 = arg0.method2595();
        } else if (arg1 == 140) {
            this.field2990 = arg0.method2595();
        } else if (arg1 == 148) {
            this.field2991 = arg0.method2595();
        } else if (arg1 == 149) {
            this.field2992 = arg0.method2595();
        }
    }

    @ObfuscatedName("gd.d(Lgd;Lgd;B)V")
    public void method3400(class199 arg0, class199 arg1) {
        this.field2949 = arg0.field2949;
        this.field2955 = arg0.field2955;
        this.field2956 = arg0.field2956;
        this.field2940 = arg0.field2940;
        this.field2952 = arg0.field2952;
        this.field2951 = arg0.field2951;
        this.field2957 = arg0.field2957;
        this.field2987 = arg0.field2987;
        this.field2960 = arg0.field2960;
        this.field2953 = arg0.field2953;
        this.field2989 = arg0.field2989;
        this.field2958 = arg1.field2958;
        this.field2976 = arg1.field2976;
        this.field2959 = arg1.field2959;
        this.field2961 = 1;
    }

    @ObfuscatedName("gd.k(Lgd;Lgd;B)V")
    public void method3444(class199 arg0, class199 arg1) {
        this.field2949 = arg0.field2949;
        this.field2955 = arg0.field2955;
        this.field2956 = arg0.field2956;
        this.field2940 = arg0.field2940;
        this.field2952 = arg0.field2952;
        this.field2951 = arg0.field2951;
        this.field2957 = arg0.field2957;
        this.field2987 = arg1.field2987;
        this.field2960 = arg1.field2960;
        this.field2953 = arg1.field2953;
        this.field2989 = arg1.field2989;
        this.field2958 = arg1.field2958;
        this.field2976 = arg1.field2976;
        this.field2961 = arg1.field2961;
        this.field2978 = arg1.field2978;
        this.field2967 = arg1.field2967;
        this.field2972 = arg1.field2972;
        this.field2939 = arg1.field2939;
        this.field2970 = arg1.field2970;
        this.field2973 = arg1.field2973;
        this.field2974 = arg1.field2974;
        this.field2975 = arg1.field2975;
        this.field2962 = arg1.field2962;
        this.field2977 = arg1.field2977;
        this.field2947 = arg1.field2947;
        this.field2964 = arg1.field2964;
        this.field2965 = new String[5];
        if (arg1.field2965 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2965[var3] = arg1.field2965[var3];
            }
        }
        this.field2965[4] = class174.field2359;
        this.field2959 = 0;
    }

    @ObfuscatedName("gd.j(Lgd;Lgd;I)V")
    public void method3402(class199 arg0, class199 arg1) {
        this.field2949 = arg0.field2949;
        this.field2955 = arg0.field2955;
        this.field2956 = arg0.field2956;
        this.field2940 = arg0.field2940;
        this.field2952 = arg0.field2952;
        this.field2951 = arg0.field2951;
        this.field2957 = arg0.field2957;
        this.field2987 = arg0.field2987;
        this.field2960 = arg0.field2960;
        this.field2953 = arg0.field2953;
        this.field2989 = arg0.field2989;
        this.field2961 = arg0.field2961;
        this.field2958 = arg1.field2958;
        this.field2959 = 0;
        this.field2976 = false;
        this.field2988 = false;
    }

    @ObfuscatedName("gd.s(II)Lbz;")
    public final class77 method3408(int arg0) {
        if (this.field2971 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2979[var3] && this.field2979[var3] != 0) {
                    var2 = this.field2971[var3];
                }
            }
            if (var2 != -1) {
                return method713(var2).method3408(1);
            }
        }
        class77 var4 = class77.method1361(Statics.field78, this.field2949, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2982 != 128 || this.field2983 != 128 || this.field2980 != 128) {
            var4.method1418(this.field2982, this.field2983, this.field2980);
        }
        if (this.field2987 != null) {
            for (int var5 = 0; var5 < this.field2987.length; var5++) {
                var4.method1373(this.field2987[var5], this.field2960[var5]);
            }
        }
        if (this.field2953 != null) {
            for (int var6 = 0; var6 < this.field2953.length; var6++) {
                var4.method1374(this.field2953[var6], this.field2989[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gd.o(IB)Lcw;")
    public final class83 method3418(int arg0) {
        if (this.field2971 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2979[var3] && this.field2979[var3] != 0) {
                    var2 = this.field2971[var3];
                }
            }
            if (var2 != -1) {
                return method713(var2).method3418(1);
            }
        }
        class83 var4 = (class83) field2946.method2169((long) this.field2948);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1361(Statics.field78, this.field2949, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2982 != 128 || this.field2983 != 128 || this.field2980 != 128) {
            var5.method1418(this.field2982, this.field2983, this.field2980);
        }
        if (this.field2987 != null) {
            for (int var6 = 0; var6 < this.field2987.length; var6++) {
                var5.method1373(this.field2987[var6], this.field2960[var6]);
            }
        }
        if (this.field2953 != null) {
            for (int var7 = 0; var7 < this.field2953.length; var7++) {
                var5.method1374(this.field2953[var7], this.field2989[var7]);
            }
        }
        class83 var8 = var5.method1381(this.field2985 + 64, this.field2986 + 768, -50, -10, -50);
        var8.field1381 = true;
        field2946.method2174(var8, (long) this.field2948);
        return var8;
    }

    @ObfuscatedName("gd.a(II)Lgd;")
    public class199 method3405(int arg0) {
        if (this.field2971 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2979[var3] && this.field2979[var3] != 0) {
                    var2 = this.field2971[var3];
                }
            }
            if (var2 != -1) {
                return method713(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("el.c(IIIIIZI)Lhs;")
    public static final class225 method2510(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2954.method2169(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method713(arg0);
        if (arg1 > 1 && var9.field2971 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2979[var11] && var9.field2979[var11] != 0) {
                    var10 = var9.field2971[var11];
                }
            }
            if (var10 != -1) {
                var9 = method713(var10);
            }
        }
        class83 var12 = var9.method3418(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2981 != -1) {
            var13 = method2510(var9.field2968, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2990 != -1) {
            var13 = method2510(var9.field2963, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2992 != -1) {
            var13 = method2510(var9.field2991, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3175;
        int var15 = Statics.field3174;
        int var16 = Statics.field3173;
        int[] var17 = new int[4];
        class220.method3747(var17);
        class225 var18 = new class225(36, 32);
        class220.method3737(var18.field3209, 36, 32);
        class220.method3735();
        class85.method1580();
        class85.method1550(16, 16);
        class85.field1432 = false;
        if (var9.field2992 != -1) {
            var13.method3864(0, 0);
        }
        int var19 = var9.field2955;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1439[var9.field2956] * var19 >> 16;
        int var21 = class85.field1453[var9.field2956] * var19 >> 16;
        var12.method1504();
        var12.method1485(0, var9.field2940, var9.field2952, var9.field2956, var9.field2951, var9.field2957 + var12.field1544 / 2 + var20, var9.field2957 + var21);
        if (var9.field2990 != -1) {
            var13.method3864(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3860(1);
        }
        if (arg2 >= 2) {
            var18.method3860(16777215);
        }
        if (arg3 != 0) {
            var18.method3861(arg3);
        }
        class220.method3737(var18.field3209, 36, 32);
        if (var9.field2981 != -1) {
            var13.method3864(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2961 == 1) {
            class209 var22 = Statics.field2699;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class174.field2514 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class174.field2495 + "</col>";
            }
            var22.method3628(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2954.method2174(var18, var6);
        }
        class220.method3737(var14, var15, var16);
        class220.method3764(var17);
        class85.method1580();
        class85.field1432 = true;
        return var18;
    }

    @ObfuscatedName("gd.u(ZB)Z")
    public final boolean method3406(boolean arg0) {
        int var2 = this.field2978;
        int var3 = this.field2967;
        int var4 = this.field2972;
        if (arg0) {
            var2 = this.field2939;
            var3 = this.field2970;
            var4 = this.field2973;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field78.method3085(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field78.method3085(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field78.method3085(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gd.i(ZI)Lbz;")
    public final class77 method3407(boolean arg0) {
        int var2 = this.field2978;
        int var3 = this.field2967;
        int var4 = this.field2972;
        if (arg0) {
            var2 = this.field2939;
            var3 = this.field2970;
            var4 = this.field2973;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1361(Statics.field78, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1361(Statics.field78, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1361(Statics.field78, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2969 != 0) {
            var5.method1371(0, this.field2969, 0);
        }
        if (arg0 && this.field2966 != 0) {
            var5.method1371(0, this.field2966, 0);
        }
        if (this.field2987 != null) {
            for (int var10 = 0; var10 < this.field2987.length; var10++) {
                var5.method1373(this.field2987[var10], this.field2960[var10]);
            }
        }
        if (this.field2953 != null) {
            for (int var11 = 0; var11 < this.field2953.length; var11++) {
                var5.method1374(this.field2953[var11], this.field2989[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gd.z(ZI)Z")
    public final boolean method3429(boolean arg0) {
        int var2 = this.field2974;
        int var3 = this.field2975;
        if (arg0) {
            var2 = this.field2962;
            var3 = this.field2977;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field78.method3085(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field78.method3085(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gd.n(ZI)Lbz;")
    public final class77 method3409(boolean arg0) {
        int var2 = this.field2974;
        int var3 = this.field2975;
        if (arg0) {
            var2 = this.field2962;
            var3 = this.field2977;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1361(Statics.field78, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1361(Statics.field78, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2987 != null) {
            for (int var7 = 0; var7 < this.field2987.length; var7++) {
                var4.method1373(this.field2987[var7], this.field2960[var7]);
            }
        }
        if (this.field2953 != null) {
            for (int var8 = 0; var8 < this.field2953.length; var8++) {
                var4.method1374(this.field2953[var8], this.field2989[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cp.w(I)V")
    public static void method1796() {
        field2943.method2170();
        field2946.method2170();
        field2954.method2170();
    }

    @ObfuscatedName("eo.y(ZI)V")
    public static void method2564(boolean arg0) {
        if (Statics.field2945 != arg0) {
            method1796();
            Statics.field2945 = arg0;
        }
    }
}

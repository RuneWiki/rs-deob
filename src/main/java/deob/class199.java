package deob;

@ObfuscatedName("gu")
public class class199 extends class130 {

    @ObfuscatedName("gu.w")
    public static class125 field2953 = new class125(64);

    @ObfuscatedName("gu.j")
    public static class125 field2996 = new class125(50);

    @ObfuscatedName("gu.s")
    public static class125 field2955 = new class125(200);

    @ObfuscatedName("gu.d")
    public int field2974;

    @ObfuscatedName("gu.p")
    public int field2975;

    @ObfuscatedName("gu.y")
    public String field2954 = "null";

    @ObfuscatedName("gu.a")
    public short[] field2960;

    @ObfuscatedName("gu.v")
    public short[] field2961;

    @ObfuscatedName("gu.z")
    public short[] field2962;

    @ObfuscatedName("gu.x")
    public short[] field2963;

    @ObfuscatedName("gu.g")
    public int field2979 = 2000;

    @ObfuscatedName("gu.b")
    public int field2965 = 0;

    @ObfuscatedName("gu.k")
    public int field2966 = 0;

    @ObfuscatedName("gu.t")
    public int field2967 = 0;

    @ObfuscatedName("gu.c")
    public int field2968 = 0;

    @ObfuscatedName("gu.e")
    public int field2969 = 0;

    @ObfuscatedName("gu.am")
    public int field2958 = 0;

    @ObfuscatedName("gu.an")
    public int field2971 = 1;

    @ObfuscatedName("gu.aq")
    public boolean field2972 = false;

    @ObfuscatedName("gu.ah")
    public String[] field2957 = new String[] { null, null, class174.field2376, null, null };

    @ObfuscatedName("gu.ag")
    public String[] field2970 = new String[] { null, null, null, null, class174.field2433 };

    @ObfuscatedName("gu.aw")
    public int field2951 = -2;

    @ObfuscatedName("gu.ax")
    public int field2976 = -1;

    @ObfuscatedName("gu.ar")
    public int field2977 = -1;

    @ObfuscatedName("gu.ak")
    public int field2978 = 0;

    @ObfuscatedName("gu.ai")
    public int field2982 = -1;

    @ObfuscatedName("gu.ap")
    public int field2956 = -1;

    @ObfuscatedName("gu.au")
    public int field2981 = 0;

    @ObfuscatedName("gu.aj")
    public int field2997 = -1;

    @ObfuscatedName("gu.at")
    public int field2983 = -1;

    @ObfuscatedName("gu.ad")
    public int field2984 = -1;

    @ObfuscatedName("gu.av")
    public int field2985 = -1;

    @ObfuscatedName("gu.ao")
    public int field2986 = -1;

    @ObfuscatedName("gu.ae")
    public int field2987 = -1;

    @ObfuscatedName("gu.aa")
    public int[] field2988;

    @ObfuscatedName("gu.as")
    public int[] field2989;

    @ObfuscatedName("gu.al")
    public int field2990 = -1;

    @ObfuscatedName("gu.az")
    public int field2991 = -1;

    @ObfuscatedName("gu.ay")
    public int field2980 = 128;

    @ObfuscatedName("gu.ac")
    public int field2993 = 128;

    @ObfuscatedName("gu.af")
    public int field2992 = 128;

    @ObfuscatedName("gu.bc")
    public int field3000 = 0;

    @ObfuscatedName("gu.bh")
    public int field2948 = 0;

    @ObfuscatedName("gu.bj")
    public int field2999 = 0;

    @ObfuscatedName("gu.br")
    public boolean field2998 = false;

    @ObfuscatedName("gu.bk")
    public int field2964 = -1;

    @ObfuscatedName("gu.bu")
    public int field2952 = -1;

    @ObfuscatedName("gu.by")
    public int field2959 = -1;

    @ObfuscatedName("gu.bl")
    public int field3002 = -1;

    @ObfuscatedName("gc.f(II)Lgu;")
    public static class199 method3402(int arg0) {
        class199 var1 = (class199) field2953.method2240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1593.method3163(10, arg0);
        class199 var3 = new class199();
        var3.field2974 = arg0;
        if (var2 != null) {
            var3.method3456(new class154(var2));
        }
        var3.method3455();
        if (var3.field2991 != -1) {
            var3.method3468(method3402(var3.field2991), method3402(var3.field2990));
        }
        if (var3.field2952 != -1) {
            var3.method3467(method3402(var3.field2952), method3402(var3.field2964));
        }
        if (var3.field3002 != -1) {
            var3.method3469(method3402(var3.field3002), method3402(var3.field2959));
        }
        if (!Statics.field1760 && var3.field2972) {
            var3.field2954 = class174.field2407;
            var3.field2998 = false;
            var3.field2957 = null;
            var3.field2970 = null;
            var3.field2951 = -1;
            var3.field2999 = 0;
        }
        field2953.method2246(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.i(B)V")
    public void method3455() {
    }

    @ObfuscatedName("gu.u(Leo;S)V")
    public void method3456(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3457(arg0, var2);
        }
    }

    @ObfuscatedName("gu.r(Leo;II)V")
    public void method3457(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2975 = arg0.method2668();
        } else if (arg1 == 2) {
            this.field2954 = arg0.method2674();
        } else if (arg1 == 4) {
            this.field2979 = arg0.method2668();
        } else if (arg1 == 5) {
            this.field2965 = arg0.method2668();
        } else if (arg1 == 6) {
            this.field2966 = arg0.method2668();
        } else if (arg1 == 7) {
            this.field2968 = arg0.method2668();
            if (this.field2968 > 32767) {
                this.field2968 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2969 = arg0.method2668();
            if (this.field2969 > 32767) {
                this.field2969 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2958 = 1;
        } else if (arg1 == 12) {
            this.field2971 = arg0.method2695();
        } else if (arg1 == 16) {
            this.field2972 = true;
        } else if (arg1 == 23) {
            this.field2976 = arg0.method2668();
            this.field2978 = arg0.method2666();
        } else if (arg1 == 24) {
            this.field2977 = arg0.method2668();
        } else if (arg1 == 25) {
            this.field2982 = arg0.method2668();
            this.field2981 = arg0.method2666();
        } else if (arg1 == 26) {
            this.field2956 = arg0.method2668();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2957[arg1 - 30] = arg0.method2674();
            if (this.field2957[arg1 - 30].equalsIgnoreCase(class174.field2378)) {
                this.field2957[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2970[arg1 - 35] = arg0.method2674();
        } else if (arg1 == 40) {
            int var3 = arg0.method2666();
            this.field2960 = new short[var3];
            this.field2961 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2960[var4] = (short) arg0.method2668();
                this.field2961[var4] = (short) arg0.method2668();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2666();
            this.field2962 = new short[var5];
            this.field2963 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2962[var6] = (short) arg0.method2668();
                this.field2963[var6] = (short) arg0.method2668();
            }
        } else if (arg1 == 42) {
            this.field2951 = arg0.method2667();
        } else if (arg1 == 65) {
            this.field2998 = true;
        } else if (arg1 == 78) {
            this.field2997 = arg0.method2668();
        } else if (arg1 == 79) {
            this.field2983 = arg0.method2668();
        } else if (arg1 == 90) {
            this.field2984 = arg0.method2668();
        } else if (arg1 == 91) {
            this.field2986 = arg0.method2668();
        } else if (arg1 == 92) {
            this.field2985 = arg0.method2668();
        } else if (arg1 == 93) {
            this.field2987 = arg0.method2668();
        } else if (arg1 == 95) {
            this.field2967 = arg0.method2668();
        } else if (arg1 == 97) {
            this.field2990 = arg0.method2668();
        } else if (arg1 == 98) {
            this.field2991 = arg0.method2668();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2988 == null) {
                this.field2988 = new int[10];
                this.field2989 = new int[10];
            }
            this.field2988[arg1 - 100] = arg0.method2668();
            this.field2989[arg1 - 100] = arg0.method2668();
        } else if (arg1 == 110) {
            this.field2980 = arg0.method2668();
        } else if (arg1 == 111) {
            this.field2993 = arg0.method2668();
        } else if (arg1 == 112) {
            this.field2992 = arg0.method2668();
        } else if (arg1 == 113) {
            this.field3000 = arg0.method2667();
        } else if (arg1 == 114) {
            this.field2948 = arg0.method2667();
        } else if (arg1 == 115) {
            this.field2999 = arg0.method2666();
        } else if (arg1 == 139) {
            this.field2964 = arg0.method2668();
        } else if (arg1 == 140) {
            this.field2952 = arg0.method2668();
        } else if (arg1 == 148) {
            this.field2959 = arg0.method2668();
        } else if (arg1 == 149) {
            this.field3002 = arg0.method2668();
        }
    }

    @ObfuscatedName("gu.o(Lgu;Lgu;I)V")
    public void method3468(class199 arg0, class199 arg1) {
        this.field2975 = arg0.field2975;
        this.field2979 = arg0.field2979;
        this.field2965 = arg0.field2965;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2968 = arg0.field2968;
        this.field2969 = arg0.field2969;
        this.field2960 = arg0.field2960;
        this.field2961 = arg0.field2961;
        this.field2962 = arg0.field2962;
        this.field2963 = arg0.field2963;
        this.field2954 = arg1.field2954;
        this.field2972 = arg1.field2972;
        this.field2971 = arg1.field2971;
        this.field2958 = 1;
    }

    @ObfuscatedName("gu.l(Lgu;Lgu;I)V")
    public void method3467(class199 arg0, class199 arg1) {
        this.field2975 = arg0.field2975;
        this.field2979 = arg0.field2979;
        this.field2965 = arg0.field2965;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2968 = arg0.field2968;
        this.field2969 = arg0.field2969;
        this.field2960 = arg1.field2960;
        this.field2961 = arg1.field2961;
        this.field2962 = arg1.field2962;
        this.field2963 = arg1.field2963;
        this.field2954 = arg1.field2954;
        this.field2972 = arg1.field2972;
        this.field2958 = arg1.field2958;
        this.field2976 = arg1.field2976;
        this.field2977 = arg1.field2977;
        this.field2997 = arg1.field2997;
        this.field2982 = arg1.field2982;
        this.field2956 = arg1.field2956;
        this.field2983 = arg1.field2983;
        this.field2984 = arg1.field2984;
        this.field2985 = arg1.field2985;
        this.field2986 = arg1.field2986;
        this.field2987 = arg1.field2987;
        this.field2999 = arg1.field2999;
        this.field2957 = arg1.field2957;
        this.field2970 = new String[5];
        if (arg1.field2970 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2970[var3] = arg1.field2970[var3];
            }
        }
        this.field2970[4] = class174.field2382;
        this.field2971 = 0;
    }

    @ObfuscatedName("gu.n(Lgu;Lgu;I)V")
    public void method3469(class199 arg0, class199 arg1) {
        this.field2975 = arg0.field2975;
        this.field2979 = arg0.field2979;
        this.field2965 = arg0.field2965;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2968 = arg0.field2968;
        this.field2969 = arg0.field2969;
        this.field2960 = arg0.field2960;
        this.field2961 = arg0.field2961;
        this.field2962 = arg0.field2962;
        this.field2963 = arg0.field2963;
        this.field2958 = arg0.field2958;
        this.field2954 = arg1.field2954;
        this.field2971 = 0;
        this.field2972 = false;
        this.field2998 = false;
    }

    @ObfuscatedName("gu.m(IB)Lbp;")
    public final class77 method3461(int arg0) {
        if (this.field2988 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2989[var3] && this.field2989[var3] != 0) {
                    var2 = this.field2988[var3];
                }
            }
            if (var2 != -1) {
                return method3402(var2).method3461(1);
            }
        }
        class77 var4 = class77.method1408(Statics.field957, this.field2975, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2980 != 128 || this.field2993 != 128 || this.field2992 != 128) {
            var4.method1407(this.field2980, this.field2993, this.field2992);
        }
        if (this.field2960 != null) {
            for (int var5 = 0; var5 < this.field2960.length; var5++) {
                var4.method1422(this.field2960[var5], this.field2961[var5]);
            }
        }
        if (this.field2962 != null) {
            for (int var6 = 0; var6 < this.field2962.length; var6++) {
                var4.method1423(this.field2962[var6], this.field2963[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gu.w(II)Lce;")
    public final class83 method3458(int arg0) {
        if (this.field2988 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2989[var3] && this.field2989[var3] != 0) {
                    var2 = this.field2988[var3];
                }
            }
            if (var2 != -1) {
                return method3402(var2).method3458(1);
            }
        }
        class83 var4 = (class83) field2996.method2240((long) this.field2974);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1408(Statics.field957, this.field2975, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2980 != 128 || this.field2993 != 128 || this.field2992 != 128) {
            var5.method1407(this.field2980, this.field2993, this.field2992);
        }
        if (this.field2960 != null) {
            for (int var6 = 0; var6 < this.field2960.length; var6++) {
                var5.method1422(this.field2960[var6], this.field2961[var6]);
            }
        }
        if (this.field2962 != null) {
            for (int var7 = 0; var7 < this.field2962.length; var7++) {
                var5.method1423(this.field2962[var7], this.field2963[var7]);
            }
        }
        class83 var8 = var5.method1437(this.field3000 + 64, this.field2948 * 5 + 768, -50, -10, -50);
        var8.field1410 = true;
        field2996.method2246(var8, (long) this.field2974);
        return var8;
    }

    @ObfuscatedName("gu.j(II)Lgu;")
    public class199 method3459(int arg0) {
        if (this.field2988 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2989[var3] && this.field2989[var3] != 0) {
                    var2 = this.field2988[var3];
                }
            }
            if (var2 != -1) {
                return method3402(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("o.s(IIIIIZS)Lhe;")
    public static final class225 method69(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2955.method2240(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method3402(arg0);
        if (arg1 > 1 && var9.field2988 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2989[var11] && var9.field2989[var11] != 0) {
                    var10 = var9.field2988[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3402(var10);
            }
        }
        class83 var12 = var9.method3458(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2991 != -1) {
            var13 = method69(var9.field2990, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2952 != -1) {
            var13 = method69(var9.field2964, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3002 != -1) {
            var13 = method69(var9.field2959, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3189;
        int var15 = Statics.field3193;
        int var16 = Statics.field3191;
        int[] var17 = new int[4];
        class220.method3775(var17);
        class225 var18 = new class225(36, 32);
        class220.method3771(var18.field3229, 36, 32);
        class220.method3829();
        class85.method1584();
        class85.method1587(16, 16);
        class85.field1459 = false;
        if (var9.field3002 != -1) {
            var13.method3891(0, 0);
        }
        int var19 = var9.field2979;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1476[var9.field2965] * var19 >> 16;
        int var21 = class85.field1470[var9.field2965] * var19 >> 16;
        var12.method1556();
        var12.method1512(0, var9.field2966, var9.field2967, var9.field2965, var9.field2968, var9.field2969 + var12.field1564 / 2 + var20, var9.field2969 + var21);
        if (var9.field2952 != -1) {
            var13.method3891(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3970(1);
        }
        if (arg2 >= 2) {
            var18.method3970(16777215);
        }
        if (arg3 != 0) {
            var18.method3888(arg3);
        }
        class220.method3771(var18.field3229, 36, 32);
        if (var9.field2991 != -1) {
            var13.method3891(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2958 == 1) {
            class209 var22 = Statics.field2994;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class174.field2537 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class174.field2406 + "</col>";
            }
            var22.method3702(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2955.method2246(var18, var6);
        }
        class220.method3771(var14, var15, var16);
        class220.method3790(var17);
        class85.method1584();
        class85.field1459 = true;
        return var18;
    }

    @ObfuscatedName("gu.q(ZI)Z")
    public final boolean method3476(boolean arg0) {
        int var2 = this.field2976;
        int var3 = this.field2977;
        int var4 = this.field2997;
        if (arg0) {
            var2 = this.field2982;
            var3 = this.field2956;
            var4 = this.field2983;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field957.method3119(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field957.method3119(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field957.method3119(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gu.d(ZB)Lbp;")
    public final class77 method3464(boolean arg0) {
        int var2 = this.field2976;
        int var3 = this.field2977;
        int var4 = this.field2997;
        if (arg0) {
            var2 = this.field2982;
            var3 = this.field2956;
            var4 = this.field2983;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1408(Statics.field957, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1408(Statics.field957, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1408(Statics.field957, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2978 != 0) {
            var5.method1421(0, this.field2978, 0);
        }
        if (arg0 && this.field2981 != 0) {
            var5.method1421(0, this.field2981, 0);
        }
        if (this.field2960 != null) {
            for (int var10 = 0; var10 < this.field2960.length; var10++) {
                var5.method1422(this.field2960[var10], this.field2961[var10]);
            }
        }
        if (this.field2962 != null) {
            for (int var11 = 0; var11 < this.field2962.length; var11++) {
                var5.method1423(this.field2962[var11], this.field2963[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gu.p(ZI)Z")
    public final boolean method3473(boolean arg0) {
        int var2 = this.field2984;
        int var3 = this.field2985;
        if (arg0) {
            var2 = this.field2986;
            var3 = this.field2987;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field957.method3119(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field957.method3119(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gu.y(ZB)Lbp;")
    public final class77 method3466(boolean arg0) {
        int var2 = this.field2984;
        int var3 = this.field2985;
        if (arg0) {
            var2 = this.field2986;
            var3 = this.field2987;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1408(Statics.field957, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1408(Statics.field957, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2960 != null) {
            for (int var7 = 0; var7 < this.field2960.length; var7++) {
                var4.method1422(this.field2960[var7], this.field2961[var7]);
            }
        }
        if (this.field2962 != null) {
            for (int var8 = 0; var8 < this.field2962.length; var8++) {
                var4.method1423(this.field2962[var8], this.field2963[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gu.a(S)I")
    public int method3463() {
        if (this.field2951 == -1 || this.field2970 == null) {
            return -1;
        } else if (this.field2951 >= 0) {
            return this.field2970[this.field2951] == null ? -1 : this.field2951;
        } else if (class174.field2433.equalsIgnoreCase(this.field2970[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("as.v(I)V")
    public static void method885() {
        field2955.method2244();
    }

    @ObfuscatedName("gw.z(ZB)V")
    public static void method3323(boolean arg0) {
        if (Statics.field1760 != arg0) {
            field2953.method2244();
            field2996.method2244();
            field2955.method2244();
            Statics.field1760 = arg0;
        }
    }
}

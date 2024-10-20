package deob;

@ObfuscatedName("gy")
public class class199 extends class130 {

    @ObfuscatedName("gy.r")
    public static class125 field2957 = new class125(64);

    @ObfuscatedName("gy.x")
    public static class125 field2958 = new class125(50);

    @ObfuscatedName("gy.z")
    public static class125 field2959 = new class125(200);

    @ObfuscatedName("gy.s")
    public int field2960;

    @ObfuscatedName("gy.o")
    public int field2961;

    @ObfuscatedName("gy.y")
    public String field2962 = "null";

    @ObfuscatedName("gy.w")
    public short[] field2972;

    @ObfuscatedName("gy.m")
    public short[] field2990;

    @ObfuscatedName("gy.u")
    public short[] field2965;

    @ObfuscatedName("gy.q")
    public short[] field2978;

    @ObfuscatedName("gy.c")
    public int field2967 = 2000;

    @ObfuscatedName("gy.v")
    public int field2968 = 0;

    @ObfuscatedName("gy.e")
    public int field2969 = 0;

    @ObfuscatedName("gy.j")
    public int field2970 = 0;

    @ObfuscatedName("gy.d")
    public int field2971 = 0;

    @ObfuscatedName("gy.g")
    public int field2981 = 0;

    @ObfuscatedName("gy.ap")
    public int field2954 = 0;

    @ObfuscatedName("gy.aj")
    public int field2974 = 1;

    @ObfuscatedName("gy.ab")
    public boolean field3003 = false;

    @ObfuscatedName("gy.af")
    public String[] field2976 = new String[] { null, null, class174.field2356, null, null };

    @ObfuscatedName("gy.aw")
    public String[] field2966 = new String[] { null, null, null, null, class174.field2357 };

    @ObfuscatedName("gy.an")
    public int field2963 = -2;

    @ObfuscatedName("gy.ae")
    public int field2982 = -1;

    @ObfuscatedName("gy.au")
    public int field3005 = -1;

    @ObfuscatedName("gy.am")
    public int field3002 = 0;

    @ObfuscatedName("gy.as")
    public int field2989 = -1;

    @ObfuscatedName("gy.ay")
    public int field2973 = -1;

    @ObfuscatedName("gy.at")
    public int field2984 = 0;

    @ObfuscatedName("gy.ai")
    public int field2985 = -1;

    @ObfuscatedName("gy.aa")
    public int field2986 = -1;

    @ObfuscatedName("gy.ar")
    public int field2987 = -1;

    @ObfuscatedName("gy.ag")
    public int field2988 = -1;

    @ObfuscatedName("gy.ad")
    public int field2997 = -1;

    @ObfuscatedName("gy.al")
    public int field2980 = -1;

    @ObfuscatedName("gy.ah")
    public int[] field2991;

    @ObfuscatedName("gy.ak")
    public int[] field2992;

    @ObfuscatedName("gy.ax")
    public int field2993 = -1;

    @ObfuscatedName("gy.av")
    public int field2994 = -1;

    @ObfuscatedName("gy.az")
    public int field2995 = 128;

    @ObfuscatedName("gy.ao")
    public int field2979 = 128;

    @ObfuscatedName("gy.aq")
    public int field2983 = 128;

    @ObfuscatedName("gy.by")
    public int field2998 = 0;

    @ObfuscatedName("gy.bj")
    public int field2999 = 0;

    @ObfuscatedName("gy.bg")
    public int field2977 = 0;

    @ObfuscatedName("gy.bl")
    public boolean field2951 = false;

    @ObfuscatedName("gy.ba")
    public int field2975 = -1;

    @ObfuscatedName("gy.bi")
    public int field2996 = -1;

    @ObfuscatedName("gy.bf")
    public int field3004 = -1;

    @ObfuscatedName("gy.bd")
    public int field3001 = -1;

    @ObfuscatedName("gg.b(Lgj;Lgj;ZLhm;I)V")
    public static void method3426(class183 arg0, class183 arg1, boolean arg2, class209 arg3) {
        Statics.field2955 = arg0;
        Statics.field797 = arg1;
        Statics.field2956 = arg2;
        Statics.field2638 = Statics.field2955.method3200(10);
        Statics.field1458 = arg3;
    }

    @ObfuscatedName("fp.l(IB)Lgy;")
    public static class199 method3070(int arg0) {
        class199 var1 = (class199) field2957.method2256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2955.method3226(10, arg0);
        class199 var3 = new class199();
        var3.field2960 = arg0;
        if (var2 != null) {
            var3.method3566(new class154(var2));
        }
        var3.method3519();
        if (var3.field2994 != -1) {
            var3.method3584(method3070(var3.field2994), method3070(var3.field2993));
        }
        if (var3.field2996 != -1) {
            var3.method3596(method3070(var3.field2996), method3070(var3.field2975));
        }
        if (var3.field3001 != -1) {
            var3.method3524(method3070(var3.field3001), method3070(var3.field3004));
        }
        if (!Statics.field2956 && var3.field3003) {
            var3.field2962 = class174.field2569;
            var3.field2951 = false;
            var3.field2976 = null;
            var3.field2966 = null;
            var3.field2963 = -1;
            var3.field2977 = 0;
        }
        field2957.method2258(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.i(B)V")
    public void method3519() {
    }

    @ObfuscatedName("gy.t(Leg;I)V")
    public void method3566(class154 arg0) {
        while (true) {
            int var2 = arg0.method2678();
            if (var2 == 0) {
                return;
            }
            this.method3521(arg0, var2);
        }
    }

    @ObfuscatedName("gy.k(Leg;II)V")
    public void method3521(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2961 = arg0.method2801();
        } else if (arg1 == 2) {
            this.field2962 = arg0.method2686();
        } else if (arg1 == 4) {
            this.field2967 = arg0.method2801();
        } else if (arg1 == 5) {
            this.field2968 = arg0.method2801();
        } else if (arg1 == 6) {
            this.field2969 = arg0.method2801();
        } else if (arg1 == 7) {
            this.field2971 = arg0.method2801();
            if (this.field2971 > 32767) {
                this.field2971 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2981 = arg0.method2801();
            if (this.field2981 > 32767) {
                this.field2981 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2954 = 1;
        } else if (arg1 == 12) {
            this.field2974 = arg0.method2683();
        } else if (arg1 == 16) {
            this.field3003 = true;
        } else if (arg1 == 23) {
            this.field2982 = arg0.method2801();
            this.field3002 = arg0.method2678();
        } else if (arg1 == 24) {
            this.field3005 = arg0.method2801();
        } else if (arg1 == 25) {
            this.field2989 = arg0.method2801();
            this.field2984 = arg0.method2678();
        } else if (arg1 == 26) {
            this.field2973 = arg0.method2801();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2976[arg1 - 30] = arg0.method2686();
            if (this.field2976[arg1 - 30].equalsIgnoreCase(class174.field2358)) {
                this.field2976[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2966[arg1 - 35] = arg0.method2686();
        } else if (arg1 == 40) {
            int var3 = arg0.method2678();
            this.field2972 = new short[var3];
            this.field2990 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2972[var4] = (short) arg0.method2801();
                this.field2990[var4] = (short) arg0.method2801();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2678();
            this.field2965 = new short[var5];
            this.field2978 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2965[var6] = (short) arg0.method2801();
                this.field2978[var6] = (short) arg0.method2801();
            }
        } else if (arg1 == 42) {
            this.field2963 = arg0.method2679();
        } else if (arg1 == 65) {
            this.field2951 = true;
        } else if (arg1 == 78) {
            this.field2985 = arg0.method2801();
        } else if (arg1 == 79) {
            this.field2986 = arg0.method2801();
        } else if (arg1 == 90) {
            this.field2987 = arg0.method2801();
        } else if (arg1 == 91) {
            this.field2997 = arg0.method2801();
        } else if (arg1 == 92) {
            this.field2988 = arg0.method2801();
        } else if (arg1 == 93) {
            this.field2980 = arg0.method2801();
        } else if (arg1 == 95) {
            this.field2970 = arg0.method2801();
        } else if (arg1 == 97) {
            this.field2993 = arg0.method2801();
        } else if (arg1 == 98) {
            this.field2994 = arg0.method2801();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2991 == null) {
                this.field2991 = new int[10];
                this.field2992 = new int[10];
            }
            this.field2991[arg1 - 100] = arg0.method2801();
            this.field2992[arg1 - 100] = arg0.method2801();
        } else if (arg1 == 110) {
            this.field2995 = arg0.method2801();
        } else if (arg1 == 111) {
            this.field2979 = arg0.method2801();
        } else if (arg1 == 112) {
            this.field2983 = arg0.method2801();
        } else if (arg1 == 113) {
            this.field2998 = arg0.method2679();
        } else if (arg1 == 114) {
            this.field2999 = arg0.method2679() * 5;
        } else if (arg1 == 115) {
            this.field2977 = arg0.method2678();
        } else if (arg1 == 139) {
            this.field2975 = arg0.method2801();
        } else if (arg1 == 140) {
            this.field2996 = arg0.method2801();
        } else if (arg1 == 148) {
            this.field3004 = arg0.method2801();
        } else if (arg1 == 149) {
            this.field3001 = arg0.method2801();
        }
    }

    @ObfuscatedName("gy.x(Lgy;Lgy;I)V")
    public void method3584(class199 arg0, class199 arg1) {
        this.field2961 = arg0.field2961;
        this.field2967 = arg0.field2967;
        this.field2968 = arg0.field2968;
        this.field2969 = arg0.field2969;
        this.field2970 = arg0.field2970;
        this.field2971 = arg0.field2971;
        this.field2981 = arg0.field2981;
        this.field2972 = arg0.field2972;
        this.field2990 = arg0.field2990;
        this.field2965 = arg0.field2965;
        this.field2978 = arg0.field2978;
        this.field2962 = arg1.field2962;
        this.field3003 = arg1.field3003;
        this.field2974 = arg1.field2974;
        this.field2954 = 1;
    }

    @ObfuscatedName("gy.z(Lgy;Lgy;I)V")
    public void method3596(class199 arg0, class199 arg1) {
        this.field2961 = arg0.field2961;
        this.field2967 = arg0.field2967;
        this.field2968 = arg0.field2968;
        this.field2969 = arg0.field2969;
        this.field2970 = arg0.field2970;
        this.field2971 = arg0.field2971;
        this.field2981 = arg0.field2981;
        this.field2972 = arg1.field2972;
        this.field2990 = arg1.field2990;
        this.field2965 = arg1.field2965;
        this.field2978 = arg1.field2978;
        this.field2962 = arg1.field2962;
        this.field3003 = arg1.field3003;
        this.field2954 = arg1.field2954;
        this.field2982 = arg1.field2982;
        this.field3005 = arg1.field3005;
        this.field2985 = arg1.field2985;
        this.field2989 = arg1.field2989;
        this.field2973 = arg1.field2973;
        this.field2986 = arg1.field2986;
        this.field2987 = arg1.field2987;
        this.field2988 = arg1.field2988;
        this.field2997 = arg1.field2997;
        this.field2980 = arg1.field2980;
        this.field2977 = arg1.field2977;
        this.field2976 = arg1.field2976;
        this.field2966 = new String[5];
        if (arg1.field2966 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2966[var3] = arg1.field2966[var3];
            }
        }
        this.field2966[4] = class174.field2623;
        this.field2974 = 0;
    }

    @ObfuscatedName("gy.p(Lgy;Lgy;I)V")
    public void method3524(class199 arg0, class199 arg1) {
        this.field2961 = arg0.field2961;
        this.field2967 = arg0.field2967;
        this.field2968 = arg0.field2968;
        this.field2969 = arg0.field2969;
        this.field2970 = arg0.field2970;
        this.field2971 = arg0.field2971;
        this.field2981 = arg0.field2981;
        this.field2972 = arg0.field2972;
        this.field2990 = arg0.field2990;
        this.field2965 = arg0.field2965;
        this.field2978 = arg0.field2978;
        this.field2954 = arg0.field2954;
        this.field2962 = arg1.field2962;
        this.field2974 = 0;
        this.field3003 = false;
        this.field2951 = false;
    }

    @ObfuscatedName("gy.s(II)Lbh;")
    public final class77 method3525(int arg0) {
        if (this.field2991 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2992[var3] && this.field2992[var3] != 0) {
                    var2 = this.field2991[var3];
                }
            }
            if (var2 != -1) {
                return method3070(var2).method3525(1);
            }
        }
        class77 var4 = class77.method1486(Statics.field797, this.field2961, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2995 != 128 || this.field2979 != 128 || this.field2983 != 128) {
            var4.method1459(this.field2995, this.field2979, this.field2983);
        }
        if (this.field2972 != null) {
            for (int var5 = 0; var5 < this.field2972.length; var5++) {
                var4.method1502(this.field2972[var5], this.field2990[var5]);
            }
        }
        if (this.field2965 != null) {
            for (int var6 = 0; var6 < this.field2965.length; var6++) {
                var4.method1464(this.field2965[var6], this.field2978[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gy.o(II)Lcs;")
    public final class83 method3590(int arg0) {
        if (this.field2991 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2992[var3] && this.field2992[var3] != 0) {
                    var2 = this.field2991[var3];
                }
            }
            if (var2 != -1) {
                return method3070(var2).method3590(1);
            }
        }
        class83 var4 = (class83) field2958.method2256((long) this.field2960);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1486(Statics.field797, this.field2961, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2995 != 128 || this.field2979 != 128 || this.field2983 != 128) {
            var5.method1459(this.field2995, this.field2979, this.field2983);
        }
        if (this.field2972 != null) {
            for (int var6 = 0; var6 < this.field2972.length; var6++) {
                var5.method1502(this.field2972[var6], this.field2990[var6]);
            }
        }
        if (this.field2965 != null) {
            for (int var7 = 0; var7 < this.field2965.length; var7++) {
                var5.method1464(this.field2965[var7], this.field2978[var7]);
            }
        }
        class83 var8 = var5.method1467(this.field2998 + 64, this.field2999 + 768, -50, -10, -50);
        var8.field1361 = true;
        field2958.method2258(var8, (long) this.field2960);
        return var8;
    }

    @ObfuscatedName("gy.y(II)Lgy;")
    public class199 method3567(int arg0) {
        if (this.field2991 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2992[var3] && this.field2992[var3] != 0) {
                    var2 = this.field2991[var3];
                }
            }
            if (var2 != -1) {
                return method3070(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("fz.w(IIIIIZI)Lhq;")
    public static final class225 method3138(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2959.method2256(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method3070(arg0);
        if (arg1 > 1 && var9.field2991 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2992[var11] && var9.field2992[var11] != 0) {
                    var10 = var9.field2991[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3070(var10);
            }
        }
        class83 var12 = var9.method3590(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2994 != -1) {
            var13 = method3138(var9.field2993, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2996 != -1) {
            var13 = method3138(var9.field2975, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3001 != -1) {
            var13 = method3138(var9.field3004, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3189;
        int var15 = Statics.field3184;
        int var16 = Statics.field3185;
        int[] var17 = new int[4];
        class220.method3879(var17);
        class225 var18 = new class225(36, 32);
        class220.method3875(var18.field3222, 36, 32);
        class220.method3881();
        class85.method1618();
        class85.method1664(16, 16);
        class85.field1429 = false;
        if (var9.field3001 != -1) {
            var13.method4036(0, 0);
        }
        int var19 = var9.field2967;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1436[var9.field2968] * var19 >> 16;
        int var21 = class85.field1433[var9.field2968] * var19 >> 16;
        var12.method1607();
        var12.method1556(0, var9.field2969, var9.field2970, var9.field2968, var9.field2971, var9.field2981 + var12.field1530 / 2 + var20, var9.field2981 + var21);
        if (var9.field2996 != -1) {
            var13.method4036(0, 0);
        }
        if (arg2 >= 1) {
            var18.method4047(1);
        }
        if (arg2 >= 2) {
            var18.method4047(16777215);
        }
        if (arg3 != 0) {
            var18.method4003(arg3);
        }
        class220.method3875(var18.field3222, 36, 32);
        if (var9.field2994 != -1) {
            var13.method4036(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2954 == 1) {
            Statics.field1458.method3769(method1674(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2959.method2258(var18, var6);
        }
        class220.method3875(var14, var15, var16);
        class220.method3880(var17);
        class85.method1618();
        class85.field1429 = true;
        return var18;
    }

    @ObfuscatedName("cz.m(IB)Ljava/lang/String;")
    public static final String method1674(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class174.field2621 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class174.field2515 + "</col>";
        }
    }

    @ObfuscatedName("gy.u(ZI)Z")
    public final boolean method3528(boolean arg0) {
        int var2 = this.field2982;
        int var3 = this.field3005;
        int var4 = this.field2985;
        if (arg0) {
            var2 = this.field2989;
            var3 = this.field2973;
            var4 = this.field2986;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field797.method3215(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field797.method3215(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field797.method3215(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gy.q(ZI)Lbh;")
    public final class77 method3529(boolean arg0) {
        int var2 = this.field2982;
        int var3 = this.field3005;
        int var4 = this.field2985;
        if (arg0) {
            var2 = this.field2989;
            var3 = this.field2973;
            var4 = this.field2986;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1486(Statics.field797, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1486(Statics.field797, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1486(Statics.field797, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field3002 != 0) {
            var5.method1481(0, this.field3002, 0);
        }
        if (arg0 && this.field2984 != 0) {
            var5.method1481(0, this.field2984, 0);
        }
        if (this.field2972 != null) {
            for (int var10 = 0; var10 < this.field2972.length; var10++) {
                var5.method1502(this.field2972[var10], this.field2990[var10]);
            }
        }
        if (this.field2965 != null) {
            for (int var11 = 0; var11 < this.field2965.length; var11++) {
                var5.method1464(this.field2965[var11], this.field2978[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gy.c(ZI)Z")
    public final boolean method3530(boolean arg0) {
        int var2 = this.field2987;
        int var3 = this.field2988;
        if (arg0) {
            var2 = this.field2997;
            var3 = this.field2980;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field797.method3215(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field797.method3215(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gy.v(ZI)Lbh;")
    public final class77 method3568(boolean arg0) {
        int var2 = this.field2987;
        int var3 = this.field2988;
        if (arg0) {
            var2 = this.field2997;
            var3 = this.field2980;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1486(Statics.field797, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1486(Statics.field797, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2972 != null) {
            for (int var7 = 0; var7 < this.field2972.length; var7++) {
                var4.method1502(this.field2972[var7], this.field2990[var7]);
            }
        }
        if (this.field2965 != null) {
            for (int var8 = 0; var8 < this.field2965.length; var8++) {
                var4.method1464(this.field2965[var8], this.field2978[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gy.e(B)I")
    public int method3532() {
        if (this.field2963 == -1 || this.field2966 == null) {
            return -1;
        } else if (this.field2963 >= 0) {
            return this.field2966[this.field2963] == null ? -1 : this.field2963;
        } else if (class174.field2357.equalsIgnoreCase(this.field2966[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("p.j(I)V")
    public static void method177() {
        field2957.method2257();
        field2958.method2257();
        field2959.method2257();
    }

    @ObfuscatedName("fw.d(ZB)V")
    public static void method2985(boolean arg0) {
        if (Statics.field2956 != arg0) {
            method177();
            Statics.field2956 = arg0;
        }
    }
}

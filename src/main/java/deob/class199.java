package deob;

@ObfuscatedName("gh")
public class class199 extends class130 {

    @ObfuscatedName("gh.y")
    public static class125 field2953 = new class125(64);

    @ObfuscatedName("gh.e")
    public static class125 field2954 = new class125(50);

    @ObfuscatedName("gh.q")
    public static class125 field2949 = new class125(200);

    @ObfuscatedName("gh.l")
    public int field2956;

    @ObfuscatedName("gh.s")
    public int field2968;

    @ObfuscatedName("gh.r")
    public String field2958 = "null";

    @ObfuscatedName("gh.m")
    public short[] field2964;

    @ObfuscatedName("gh.i")
    public short[] field2960;

    @ObfuscatedName("gh.f")
    public short[] field2961;

    @ObfuscatedName("gh.b")
    public short[] field2962;

    @ObfuscatedName("gh.t")
    public int field2972 = 2000;

    @ObfuscatedName("gh.z")
    public int field2987 = 0;

    @ObfuscatedName("gh.p")
    public int field3000 = 0;

    @ObfuscatedName("gh.n")
    public int field3002 = 0;

    @ObfuscatedName("gh.a")
    public int field2955 = 0;

    @ObfuscatedName("gh.o")
    public int field2983 = 0;

    @ObfuscatedName("gh.an")
    public int field2969 = 0;

    @ObfuscatedName("gh.ar")
    public int field2993 = 1;

    @ObfuscatedName("gh.aa")
    public boolean field2971 = false;

    @ObfuscatedName("gh.af")
    public String[] field2982 = new String[] { null, null, class174.field2345, null, null };

    @ObfuscatedName("gh.ax")
    public String[] field2973 = new String[] { null, null, null, null, class174.field2346 };

    @ObfuscatedName("gh.az")
    public int field2970 = -2;

    @ObfuscatedName("gh.at")
    public int field2975 = -1;

    @ObfuscatedName("gh.ab")
    public int field2963 = -1;

    @ObfuscatedName("gh.ae")
    public int field2977 = 0;

    @ObfuscatedName("gh.ao")
    public int field2978 = -1;

    @ObfuscatedName("gh.am")
    public int field2979 = -1;

    @ObfuscatedName("gh.ak")
    public int field2980 = 0;

    @ObfuscatedName("gh.ay")
    public int field2981 = -1;

    @ObfuscatedName("gh.aq")
    public int field2947 = -1;

    @ObfuscatedName("gh.aj")
    public int field2967 = -1;

    @ObfuscatedName("gh.ap")
    public int field2984 = -1;

    @ObfuscatedName("gh.ai")
    public int field2985 = -1;

    @ObfuscatedName("gh.ac")
    public int field2986 = -1;

    @ObfuscatedName("gh.av")
    public int[] field2951;

    @ObfuscatedName("gh.as")
    public int[] field2988;

    @ObfuscatedName("gh.al")
    public int field2950 = -1;

    @ObfuscatedName("gh.ag")
    public int field2990 = -1;

    @ObfuscatedName("gh.aw")
    public int field2991 = 128;

    @ObfuscatedName("gh.ad")
    public int field2992 = 128;

    @ObfuscatedName("gh.au")
    public int field2965 = 128;

    @ObfuscatedName("gh.bj")
    public int field2994 = 0;

    @ObfuscatedName("gh.bd")
    public int field2995 = 0;

    @ObfuscatedName("gh.bb")
    public int field2996 = 0;

    @ObfuscatedName("gh.bt")
    public boolean field2997 = false;

    @ObfuscatedName("gh.bl")
    public int field2998 = -1;

    @ObfuscatedName("gh.bv")
    public int field2999 = -1;

    @ObfuscatedName("gh.bm")
    public int field2974 = -1;

    @ObfuscatedName("gh.bc")
    public int field3001 = -1;

    @ObfuscatedName("ac.x(Lgk;Lgk;ZLhf;I)V")
    public static void method868(class183 arg0, class183 arg1, boolean arg2, class209 arg3) {
        Statics.field2976 = arg0;
        Statics.field2952 = arg1;
        Statics.field957 = arg2;
        Statics.field1738 = Statics.field2976.method3108(10);
        Statics.field611 = arg3;
    }

    @ObfuscatedName("eg.j(II)Lgh;")
    public static class199 method2849(int arg0) {
        class199 var1 = (class199) field2953.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2976.method3121(10, arg0);
        class199 var3 = new class199();
        var3.field2956 = arg0;
        if (var2 != null) {
            var3.method3478(new class154(var2));
        }
        var3.method3444();
        if (var3.field2990 != -1) {
            var3.method3447(method2849(var3.field2990), method2849(var3.field2950));
        }
        if (var3.field2999 != -1) {
            var3.method3448(method2849(var3.field2999), method2849(var3.field2998));
        }
        if (var3.field3001 != -1) {
            var3.method3475(method2849(var3.field3001), method2849(var3.field2974));
        }
        if (!Statics.field957 && var3.field2971) {
            var3.field2958 = class174.field2465;
            var3.field2997 = false;
            var3.field2982 = null;
            var3.field2973 = null;
            var3.field2970 = -1;
            var3.field2996 = 0;
        }
        field2953.method2223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gh.c(B)V")
    public void method3444() {
    }

    @ObfuscatedName("gh.d(Lek;B)V")
    public void method3478(class154 arg0) {
        while (true) {
            int var2 = arg0.method2701();
            if (var2 == 0) {
                return;
            }
            this.method3446(arg0, var2);
        }
    }

    @ObfuscatedName("gh.w(Lek;II)V")
    public void method3446(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2968 = arg0.method2745();
        } else if (arg1 == 2) {
            this.field2958 = arg0.method2699();
        } else if (arg1 == 4) {
            this.field2972 = arg0.method2745();
        } else if (arg1 == 5) {
            this.field2987 = arg0.method2745();
        } else if (arg1 == 6) {
            this.field3000 = arg0.method2745();
        } else if (arg1 == 7) {
            this.field2955 = arg0.method2745();
            if (this.field2955 > 32767) {
                this.field2955 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2983 = arg0.method2745();
            if (this.field2983 > 32767) {
                this.field2983 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2969 = 1;
        } else if (arg1 == 12) {
            this.field2993 = arg0.method2644();
        } else if (arg1 == 16) {
            this.field2971 = true;
        } else if (arg1 == 23) {
            this.field2975 = arg0.method2745();
            this.field2977 = arg0.method2701();
        } else if (arg1 == 24) {
            this.field2963 = arg0.method2745();
        } else if (arg1 == 25) {
            this.field2978 = arg0.method2745();
            this.field2980 = arg0.method2701();
        } else if (arg1 == 26) {
            this.field2979 = arg0.method2745();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2982[arg1 - 30] = arg0.method2699();
            if (this.field2982[arg1 - 30].equalsIgnoreCase(class174.field2347)) {
                this.field2982[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2973[arg1 - 35] = arg0.method2699();
        } else if (arg1 == 40) {
            int var3 = arg0.method2701();
            this.field2964 = new short[var3];
            this.field2960 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2964[var4] = (short) arg0.method2745();
                this.field2960[var4] = (short) arg0.method2745();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2701();
            this.field2961 = new short[var5];
            this.field2962 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2961[var6] = (short) arg0.method2745();
                this.field2962[var6] = (short) arg0.method2745();
            }
        } else if (arg1 == 42) {
            this.field2970 = arg0.method2640();
        } else if (arg1 == 65) {
            this.field2997 = true;
        } else if (arg1 == 78) {
            this.field2981 = arg0.method2745();
        } else if (arg1 == 79) {
            this.field2947 = arg0.method2745();
        } else if (arg1 == 90) {
            this.field2967 = arg0.method2745();
        } else if (arg1 == 91) {
            this.field2985 = arg0.method2745();
        } else if (arg1 == 92) {
            this.field2984 = arg0.method2745();
        } else if (arg1 == 93) {
            this.field2986 = arg0.method2745();
        } else if (arg1 == 95) {
            this.field3002 = arg0.method2745();
        } else if (arg1 == 97) {
            this.field2950 = arg0.method2745();
        } else if (arg1 == 98) {
            this.field2990 = arg0.method2745();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2951 == null) {
                this.field2951 = new int[10];
                this.field2988 = new int[10];
            }
            this.field2951[arg1 - 100] = arg0.method2745();
            this.field2988[arg1 - 100] = arg0.method2745();
        } else if (arg1 == 110) {
            this.field2991 = arg0.method2745();
        } else if (arg1 == 111) {
            this.field2992 = arg0.method2745();
        } else if (arg1 == 112) {
            this.field2965 = arg0.method2745();
        } else if (arg1 == 113) {
            this.field2994 = arg0.method2640();
        } else if (arg1 == 114) {
            this.field2995 = arg0.method2640() * 5;
        } else if (arg1 == 115) {
            this.field2996 = arg0.method2701();
        } else if (arg1 == 139) {
            this.field2998 = arg0.method2745();
        } else if (arg1 == 140) {
            this.field2999 = arg0.method2745();
        } else if (arg1 == 148) {
            this.field2974 = arg0.method2745();
        } else if (arg1 == 149) {
            this.field3001 = arg0.method2745();
        }
    }

    @ObfuscatedName("gh.u(Lgh;Lgh;B)V")
    public void method3447(class199 arg0, class199 arg1) {
        this.field2968 = arg0.field2968;
        this.field2972 = arg0.field2972;
        this.field2987 = arg0.field2987;
        this.field3000 = arg0.field3000;
        this.field3002 = arg0.field3002;
        this.field2955 = arg0.field2955;
        this.field2983 = arg0.field2983;
        this.field2964 = arg0.field2964;
        this.field2960 = arg0.field2960;
        this.field2961 = arg0.field2961;
        this.field2962 = arg0.field2962;
        this.field2958 = arg1.field2958;
        this.field2971 = arg1.field2971;
        this.field2993 = arg1.field2993;
        this.field2969 = 1;
    }

    @ObfuscatedName("gh.y(Lgh;Lgh;I)V")
    public void method3448(class199 arg0, class199 arg1) {
        this.field2968 = arg0.field2968;
        this.field2972 = arg0.field2972;
        this.field2987 = arg0.field2987;
        this.field3000 = arg0.field3000;
        this.field3002 = arg0.field3002;
        this.field2955 = arg0.field2955;
        this.field2983 = arg0.field2983;
        this.field2964 = arg1.field2964;
        this.field2960 = arg1.field2960;
        this.field2961 = arg1.field2961;
        this.field2962 = arg1.field2962;
        this.field2958 = arg1.field2958;
        this.field2971 = arg1.field2971;
        this.field2969 = arg1.field2969;
        this.field2975 = arg1.field2975;
        this.field2963 = arg1.field2963;
        this.field2981 = arg1.field2981;
        this.field2978 = arg1.field2978;
        this.field2979 = arg1.field2979;
        this.field2947 = arg1.field2947;
        this.field2967 = arg1.field2967;
        this.field2984 = arg1.field2984;
        this.field2985 = arg1.field2985;
        this.field2986 = arg1.field2986;
        this.field2996 = arg1.field2996;
        this.field2982 = arg1.field2982;
        this.field2973 = new String[5];
        if (arg1.field2973 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2973[var3] = arg1.field2973[var3];
            }
        }
        this.field2973[4] = class174.field2351;
        this.field2993 = 0;
    }

    @ObfuscatedName("gh.e(Lgh;Lgh;I)V")
    public void method3475(class199 arg0, class199 arg1) {
        this.field2968 = arg0.field2968;
        this.field2972 = arg0.field2972;
        this.field2987 = arg0.field2987;
        this.field3000 = arg0.field3000;
        this.field3002 = arg0.field3002;
        this.field2955 = arg0.field2955;
        this.field2983 = arg0.field2983;
        this.field2964 = arg0.field2964;
        this.field2960 = arg0.field2960;
        this.field2961 = arg0.field2961;
        this.field2962 = arg0.field2962;
        this.field2969 = arg0.field2969;
        this.field2958 = arg1.field2958;
        this.field2993 = 0;
        this.field2971 = false;
        this.field2997 = false;
    }

    @ObfuscatedName("gh.q(II)Lbg;")
    public final class77 method3464(int arg0) {
        if (this.field2951 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2988[var3] && this.field2988[var3] != 0) {
                    var2 = this.field2951[var3];
                }
            }
            if (var2 != -1) {
                return method2849(var2).method3464(1);
            }
        }
        class77 var4 = class77.method1437(Statics.field2952, this.field2968, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2991 != 128 || this.field2992 != 128 || this.field2965 != 128) {
            var4.method1489(this.field2991, this.field2992, this.field2965);
        }
        if (this.field2964 != null) {
            for (int var5 = 0; var5 < this.field2964.length; var5++) {
                var4.method1470(this.field2964[var5], this.field2960[var5]);
            }
        }
        if (this.field2961 != null) {
            for (int var6 = 0; var6 < this.field2961.length; var6++) {
                var4.method1451(this.field2961[var6], this.field2962[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gh.v(II)Lcj;")
    public final class83 method3460(int arg0) {
        if (this.field2951 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2988[var3] && this.field2988[var3] != 0) {
                    var2 = this.field2951[var3];
                }
            }
            if (var2 != -1) {
                return method2849(var2).method3460(1);
            }
        }
        class83 var4 = (class83) field2954.method2221((long) this.field2956);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1437(Statics.field2952, this.field2968, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2991 != 128 || this.field2992 != 128 || this.field2965 != 128) {
            var5.method1489(this.field2991, this.field2992, this.field2965);
        }
        if (this.field2964 != null) {
            for (int var6 = 0; var6 < this.field2964.length; var6++) {
                var5.method1470(this.field2964[var6], this.field2960[var6]);
            }
        }
        if (this.field2961 != null) {
            for (int var7 = 0; var7 < this.field2961.length; var7++) {
                var5.method1451(this.field2961[var7], this.field2962[var7]);
            }
        }
        class83 var8 = var5.method1458(this.field2994 + 64, this.field2995 + 768, -50, -10, -50);
        var8.field1391 = true;
        field2954.method2223(var8, (long) this.field2956);
        return var8;
    }

    @ObfuscatedName("gh.l(II)Lgh;")
    public class199 method3451(int arg0) {
        if (this.field2951 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2988[var3] && this.field2988[var3] != 0) {
                    var2 = this.field2951[var3];
                }
            }
            if (var2 != -1) {
                return method2849(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("dx.s(IIIIIZB)Lhs;")
    public static final class225 method2087(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2949.method2221(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method2849(arg0);
        if (arg1 > 1 && var9.field2951 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2988[var11] && var9.field2988[var11] != 0) {
                    var10 = var9.field2951[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2849(var10);
            }
        }
        class83 var12 = var9.method3460(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2990 != -1) {
            var13 = method2087(var9.field2950, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2999 != -1) {
            var13 = method2087(var9.field2998, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3001 != -1) {
            var13 = method2087(var9.field2974, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3189;
        int var15 = Statics.field3194;
        int var16 = Statics.field3190;
        int[] var17 = new int[4];
        class220.method3779(var17);
        class225 var18 = new class225(36, 32);
        class220.method3775(var18.field3231, 36, 32);
        class220.method3809();
        class85.method1622();
        class85.method1612(16, 16);
        class85.field1439 = false;
        if (var9.field3001 != -1) {
            var13.method3903(0, 0);
        }
        int var19 = var9.field2972;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1442[var9.field2987] * var19 >> 16;
        int var21 = class85.field1463[var9.field2987] * var19 >> 16;
        var12.method1532();
        var12.method1544(0, var9.field3000, var9.field3002, var9.field2987, var9.field2955, var9.field2983 + var12.field1556 / 2 + var20, var9.field2983 + var21);
        if (var9.field2999 != -1) {
            var13.method3903(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3985(1);
        }
        if (arg2 >= 2) {
            var18.method3985(16777215);
        }
        if (arg3 != 0) {
            var18.method3924(arg3);
        }
        class220.method3775(var18.field3231, 36, 32);
        if (var9.field2990 != -1) {
            var13.method3903(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2969 == 1) {
            Statics.field611.method3668(method1875(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2949.method2223(var18, var6);
        }
        class220.method3775(var14, var15, var16);
        class220.method3823(var17);
        class85.method1622();
        class85.field1439 = true;
        return var18;
    }

    @ObfuscatedName("cm.r(IB)Ljava/lang/String;")
    public static final String method1875(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class174.field2506 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class174.field2504 + "</col>";
        }
    }

    @ObfuscatedName("gh.m(ZI)Z")
    public final boolean method3463(boolean arg0) {
        int var2 = this.field2975;
        int var3 = this.field2963;
        int var4 = this.field2981;
        if (arg0) {
            var2 = this.field2978;
            var3 = this.field2979;
            var4 = this.field2947;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2952.method3166(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2952.method3166(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2952.method3166(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gh.i(ZI)Lbg;")
    public final class77 method3452(boolean arg0) {
        int var2 = this.field2975;
        int var3 = this.field2963;
        int var4 = this.field2981;
        if (arg0) {
            var2 = this.field2978;
            var3 = this.field2979;
            var4 = this.field2947;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1437(Statics.field2952, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1437(Statics.field2952, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1437(Statics.field2952, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2977 != 0) {
            var5.method1450(0, this.field2977, 0);
        }
        if (arg0 && this.field2980 != 0) {
            var5.method1450(0, this.field2980, 0);
        }
        if (this.field2964 != null) {
            for (int var10 = 0; var10 < this.field2964.length; var10++) {
                var5.method1470(this.field2964[var10], this.field2960[var10]);
            }
        }
        if (this.field2961 != null) {
            for (int var11 = 0; var11 < this.field2961.length; var11++) {
                var5.method1451(this.field2961[var11], this.field2962[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gh.f(ZI)Z")
    public final boolean method3454(boolean arg0) {
        int var2 = this.field2967;
        int var3 = this.field2984;
        if (arg0) {
            var2 = this.field2985;
            var3 = this.field2986;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2952.method3166(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2952.method3166(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gh.b(ZB)Lbg;")
    public final class77 method3445(boolean arg0) {
        int var2 = this.field2967;
        int var3 = this.field2984;
        if (arg0) {
            var2 = this.field2985;
            var3 = this.field2986;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1437(Statics.field2952, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1437(Statics.field2952, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2964 != null) {
            for (int var7 = 0; var7 < this.field2964.length; var7++) {
                var4.method1470(this.field2964[var7], this.field2960[var7]);
            }
        }
        if (this.field2961 != null) {
            for (int var8 = 0; var8 < this.field2961.length; var8++) {
                var4.method1451(this.field2961[var8], this.field2962[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gh.t(I)I")
    public int method3481() {
        if (this.field2970 == -1 || this.field2973 == null) {
            return -1;
        } else if (this.field2970 >= 0) {
            return this.field2973[this.field2970] == null ? -1 : this.field2970;
        } else if (class174.field2346.equalsIgnoreCase(this.field2973[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ay.z(I)V")
    public static void method801() {
        field2953.method2225();
        field2954.method2225();
        field2949.method2225();
    }
}

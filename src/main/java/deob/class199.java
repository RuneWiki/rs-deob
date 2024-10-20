package deob;

@ObfuscatedName("gy")
public class class199 extends class130 {

    @ObfuscatedName("gy.p")
    public static class125 field2946 = new class125(64);

    @ObfuscatedName("gy.g")
    public static class125 field2952 = new class125(50);

    @ObfuscatedName("gy.z")
    public static class125 field2947 = new class125(200);

    @ObfuscatedName("gy.l")
    public int field2948;

    @ObfuscatedName("gy.y")
    public int field2955;

    @ObfuscatedName("gy.e")
    public String field2945 = "null";

    @ObfuscatedName("gy.x")
    public short[] field2951;

    @ObfuscatedName("gy.f")
    public short[] field2950;

    @ObfuscatedName("gy.s")
    public short[] field2989;

    @ObfuscatedName("gy.o")
    public short[] field2977;

    @ObfuscatedName("gy.i")
    public int field2953 = 2000;

    @ObfuscatedName("gy.a")
    public int field2956 = 0;

    @ObfuscatedName("gy.b")
    public int field2983 = 0;

    @ObfuscatedName("gy.j")
    public int field2978 = 0;

    @ObfuscatedName("gy.k")
    public int field2941 = 0;

    @ObfuscatedName("gy.v")
    public int field2960 = 0;

    @ObfuscatedName("gy.u")
    public int field2961 = 0;

    @ObfuscatedName("gy.t")
    public int field2962 = 1;

    @ObfuscatedName("gy.av")
    public boolean field2963 = false;

    @ObfuscatedName("gy.aw")
    public String[] field2964 = new String[] { null, null, class174.field2370, null, null };

    @ObfuscatedName("gy.ay")
    public String[] field2965 = new String[] { null, null, null, null, class174.field2503 };

    @ObfuscatedName("gy.as")
    public int field2975 = -1;

    @ObfuscatedName("gy.ai")
    public int field2990 = -1;

    @ObfuscatedName("gy.aq")
    public int field2968 = 0;

    @ObfuscatedName("gy.ac")
    public int field2969 = -1;

    @ObfuscatedName("gy.ae")
    public int field2970 = -1;

    @ObfuscatedName("gy.ag")
    public int field2971 = 0;

    @ObfuscatedName("gy.am")
    public int field2972 = -1;

    @ObfuscatedName("gy.af")
    public int field2991 = -1;

    @ObfuscatedName("gy.ap")
    public int field2974 = -1;

    @ObfuscatedName("gy.az")
    public int field2954 = -1;

    @ObfuscatedName("gy.ab")
    public int field2949 = -1;

    @ObfuscatedName("gy.ax")
    public int field2976 = -1;

    @ObfuscatedName("gy.ad")
    public int[] field2967;

    @ObfuscatedName("gy.ah")
    public int[] field2979;

    @ObfuscatedName("gy.al")
    public int field2980 = -1;

    @ObfuscatedName("gy.aa")
    public int field2981 = -1;

    @ObfuscatedName("gy.an")
    public int field2982 = 128;

    @ObfuscatedName("gy.at")
    public int field2985 = 128;

    @ObfuscatedName("gy.au")
    public int field2984 = 128;

    @ObfuscatedName("gy.ak")
    public int field2966 = 0;

    @ObfuscatedName("gy.ar")
    public int field2986 = 0;

    @ObfuscatedName("gy.aj")
    public int field2987 = 0;

    @ObfuscatedName("gy.ao")
    public boolean field2988 = false;

    @ObfuscatedName("gy.bn")
    public int field2958 = -1;

    @ObfuscatedName("gy.bt")
    public int field2973 = -1;

    @ObfuscatedName("gy.bv")
    public int field2959 = -1;

    @ObfuscatedName("gy.bd")
    public int field2992 = -1;

    @ObfuscatedName("i.n(IB)Lgy;")
    public static class199 method207(int arg0) {
        class199 var1 = (class199) field2946.method2221((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2943.method3093(10, arg0);
        class199 var3 = new class199();
        var3.field2948 = arg0;
        if (var2 != null) {
            var3.method3455(new class161(var2));
        }
        var3.method3447();
        if (var3.field2981 != -1) {
            var3.method3450(method207(var3.field2981), method207(var3.field2980));
        }
        if (var3.field2973 != -1) {
            var3.method3451(method207(var3.field2973), method207(var3.field2958));
        }
        if (var3.field2992 != -1) {
            var3.method3446(method207(var3.field2992), method207(var3.field2959));
        }
        if (!Statics.field2944 && var3.field2963) {
            var3.field2945 = class174.field2482;
            var3.field2988 = false;
            var3.field2964 = null;
            var3.field2965 = null;
            var3.field2987 = 0;
        }
        field2946.method2219(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.d(B)V")
    public void method3447() {
    }

    @ObfuscatedName("gy.m(Lfa;I)V")
    public void method3455(class161 arg0) {
        while (true) {
            int var2 = arg0.method2823();
            if (var2 == 0) {
                return;
            }
            this.method3449(arg0, var2);
        }
    }

    @ObfuscatedName("gy.h(Lfa;II)V")
    public void method3449(class161 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2955 = arg0.method2887();
        } else if (arg1 == 2) {
            this.field2945 = arg0.method2847();
        } else if (arg1 == 4) {
            this.field2953 = arg0.method2887();
        } else if (arg1 == 5) {
            this.field2956 = arg0.method2887();
        } else if (arg1 == 6) {
            this.field2983 = arg0.method2887();
        } else if (arg1 == 7) {
            this.field2941 = arg0.method2887();
            if (this.field2941 > 32767) {
                this.field2941 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2960 = arg0.method2887();
            if (this.field2960 > 32767) {
                this.field2960 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2961 = 1;
        } else if (arg1 == 12) {
            this.field2962 = arg0.method2785();
        } else if (arg1 == 16) {
            this.field2963 = true;
        } else if (arg1 == 23) {
            this.field2975 = arg0.method2887();
            this.field2968 = arg0.method2823();
        } else if (arg1 == 24) {
            this.field2990 = arg0.method2887();
        } else if (arg1 == 25) {
            this.field2969 = arg0.method2887();
            this.field2971 = arg0.method2823();
        } else if (arg1 == 26) {
            this.field2970 = arg0.method2887();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2964[arg1 - 30] = arg0.method2847();
            if (this.field2964[arg1 - 30].equalsIgnoreCase(class174.field2429)) {
                this.field2964[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2965[arg1 - 35] = arg0.method2847();
        } else if (arg1 == 40) {
            int var3 = arg0.method2823();
            this.field2951 = new short[var3];
            this.field2950 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2951[var4] = (short) arg0.method2887();
                this.field2950[var4] = (short) arg0.method2887();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2823();
            this.field2989 = new short[var5];
            this.field2977 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2989[var6] = (short) arg0.method2887();
                this.field2977[var6] = (short) arg0.method2887();
            }
        } else if (arg1 == 65) {
            this.field2988 = true;
        } else if (arg1 == 78) {
            this.field2972 = arg0.method2887();
        } else if (arg1 == 79) {
            this.field2991 = arg0.method2887();
        } else if (arg1 == 90) {
            this.field2974 = arg0.method2887();
        } else if (arg1 == 91) {
            this.field2949 = arg0.method2887();
        } else if (arg1 == 92) {
            this.field2954 = arg0.method2887();
        } else if (arg1 == 93) {
            this.field2976 = arg0.method2887();
        } else if (arg1 == 95) {
            this.field2978 = arg0.method2887();
        } else if (arg1 == 97) {
            this.field2980 = arg0.method2887();
        } else if (arg1 == 98) {
            this.field2981 = arg0.method2887();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2967 == null) {
                this.field2967 = new int[10];
                this.field2979 = new int[10];
            }
            this.field2967[arg1 - 100] = arg0.method2887();
            this.field2979[arg1 - 100] = arg0.method2887();
        } else if (arg1 == 110) {
            this.field2982 = arg0.method2887();
        } else if (arg1 == 111) {
            this.field2985 = arg0.method2887();
        } else if (arg1 == 112) {
            this.field2984 = arg0.method2887();
        } else if (arg1 == 113) {
            this.field2966 = arg0.method2837();
        } else if (arg1 == 114) {
            this.field2986 = arg0.method2837();
        } else if (arg1 == 115) {
            this.field2987 = arg0.method2823();
        } else if (arg1 == 139) {
            this.field2958 = arg0.method2887();
        } else if (arg1 == 140) {
            this.field2973 = arg0.method2887();
        } else if (arg1 == 148) {
            this.field2959 = arg0.method2887();
        } else if (arg1 == 149) {
            this.field2992 = arg0.method2887();
        }
    }

    @ObfuscatedName("gy.w(Lgy;Lgy;B)V")
    public void method3450(class199 arg0, class199 arg1) {
        this.field2955 = arg0.field2955;
        this.field2953 = arg0.field2953;
        this.field2956 = arg0.field2956;
        this.field2983 = arg0.field2983;
        this.field2978 = arg0.field2978;
        this.field2941 = arg0.field2941;
        this.field2960 = arg0.field2960;
        this.field2951 = arg0.field2951;
        this.field2950 = arg0.field2950;
        this.field2989 = arg0.field2989;
        this.field2977 = arg0.field2977;
        this.field2945 = arg1.field2945;
        this.field2963 = arg1.field2963;
        this.field2962 = arg1.field2962;
        this.field2961 = 1;
    }

    @ObfuscatedName("gy.r(Lgy;Lgy;I)V")
    public void method3451(class199 arg0, class199 arg1) {
        this.field2955 = arg0.field2955;
        this.field2953 = arg0.field2953;
        this.field2956 = arg0.field2956;
        this.field2983 = arg0.field2983;
        this.field2978 = arg0.field2978;
        this.field2941 = arg0.field2941;
        this.field2960 = arg0.field2960;
        this.field2951 = arg1.field2951;
        this.field2950 = arg1.field2950;
        this.field2989 = arg1.field2989;
        this.field2977 = arg1.field2977;
        this.field2945 = arg1.field2945;
        this.field2963 = arg1.field2963;
        this.field2961 = arg1.field2961;
        this.field2975 = arg1.field2975;
        this.field2990 = arg1.field2990;
        this.field2972 = arg1.field2972;
        this.field2969 = arg1.field2969;
        this.field2970 = arg1.field2970;
        this.field2991 = arg1.field2991;
        this.field2974 = arg1.field2974;
        this.field2954 = arg1.field2954;
        this.field2949 = arg1.field2949;
        this.field2976 = arg1.field2976;
        this.field2987 = arg1.field2987;
        this.field2964 = arg1.field2964;
        this.field2965 = new String[5];
        if (arg1.field2965 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2965[var3] = arg1.field2965[var3];
            }
        }
        this.field2965[4] = class174.field2376;
        this.field2962 = 0;
    }

    @ObfuscatedName("gy.c(Lgy;Lgy;I)V")
    public void method3446(class199 arg0, class199 arg1) {
        this.field2955 = arg0.field2955;
        this.field2953 = arg0.field2953;
        this.field2956 = arg0.field2956;
        this.field2983 = arg0.field2983;
        this.field2978 = arg0.field2978;
        this.field2941 = arg0.field2941;
        this.field2960 = arg0.field2960;
        this.field2951 = arg0.field2951;
        this.field2950 = arg0.field2950;
        this.field2989 = arg0.field2989;
        this.field2977 = arg0.field2977;
        this.field2961 = arg0.field2961;
        this.field2945 = arg1.field2945;
        this.field2962 = 0;
        this.field2963 = false;
        this.field2988 = false;
    }

    @ObfuscatedName("gy.z(IB)Lbz;")
    public final class77 method3493(int arg0) {
        if (this.field2967 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2979[var3] && this.field2979[var3] != 0) {
                    var2 = this.field2967[var3];
                }
            }
            if (var2 != -1) {
                return method207(var2).method3493(1);
            }
        }
        class77 var4 = class77.method1401(Statics.field2368, this.field2955, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2982 != 128 || this.field2985 != 128 || this.field2984 != 128) {
            var4.method1418(this.field2982, this.field2985, this.field2984);
        }
        if (this.field2951 != null) {
            for (int var5 = 0; var5 < this.field2951.length; var5++) {
                var4.method1400(this.field2951[var5], this.field2950[var5]);
            }
        }
        if (this.field2989 != null) {
            for (int var6 = 0; var6 < this.field2989.length; var6++) {
                var4.method1416(this.field2989[var6], this.field2977[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gy.q(II)Lca;")
    public final class83 method3462(int arg0) {
        if (this.field2967 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2979[var3] && this.field2979[var3] != 0) {
                    var2 = this.field2967[var3];
                }
            }
            if (var2 != -1) {
                return method207(var2).method3462(1);
            }
        }
        class83 var4 = (class83) field2952.method2221((long) this.field2948);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1401(Statics.field2368, this.field2955, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2982 != 128 || this.field2985 != 128 || this.field2984 != 128) {
            var5.method1418(this.field2982, this.field2985, this.field2984);
        }
        if (this.field2951 != null) {
            for (int var6 = 0; var6 < this.field2951.length; var6++) {
                var5.method1400(this.field2951[var6], this.field2950[var6]);
            }
        }
        if (this.field2989 != null) {
            for (int var7 = 0; var7 < this.field2989.length; var7++) {
                var5.method1416(this.field2989[var7], this.field2977[var7]);
            }
        }
        class83 var8 = var5.method1422(this.field2966 + 64, this.field2986 * 5 + 768, -50, -10, -50);
        var8.field1400 = true;
        field2952.method2219(var8, (long) this.field2948);
        return var8;
    }

    @ObfuscatedName("gy.l(II)Lgy;")
    public class199 method3472(int arg0) {
        if (this.field2967 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2979[var3] && this.field2979[var3] != 0) {
                    var2 = this.field2967[var3];
                }
            }
            if (var2 != -1) {
                return method207(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("r.y(IIIIIZB)Lhf;")
    public static final class225 method81(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2947.method2221(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method207(arg0);
        if (arg1 > 1 && var9.field2967 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2979[var11] && var9.field2979[var11] != 0) {
                    var10 = var9.field2967[var11];
                }
            }
            if (var10 != -1) {
                var9 = method207(var10);
            }
        }
        class83 var12 = var9.method3462(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2981 != -1) {
            var13 = method81(var9.field2980, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2973 != -1) {
            var13 = method81(var9.field2958, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2992 != -1) {
            var13 = method81(var9.field2959, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3171;
        int var15 = Statics.field3167;
        int var16 = Statics.field3168;
        int[] var17 = new int[4];
        class220.method3789(var17);
        class225 var18 = new class225(36, 32);
        class220.method3785(var18.field3207, 36, 32);
        class220.method3807();
        class85.method1576();
        class85.method1579(16, 16);
        class85.field1428 = false;
        if (var9.field2992 != -1) {
            var13.method3914(0, 0);
        }
        int var19 = var9.field2953;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1445[var9.field2956] * var19 >> 16;
        int var21 = class85.field1446[var9.field2956] * var19 >> 16;
        var12.method1494();
        var12.method1506(0, var9.field2983, var9.field2978, var9.field2956, var9.field2941, var9.field2960 + var12.field1535 / 2 + var20, var9.field2960 + var21);
        if (var9.field2973 != -1) {
            var13.method3914(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3998(1);
        }
        if (arg2 >= 2) {
            var18.method3998(16777215);
        }
        if (arg3 != 0) {
            var18.method3911(arg3);
        }
        class220.method3785(var18.field3207, 36, 32);
        if (var9.field2981 != -1) {
            var13.method3914(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2961 == 1) {
            Statics.field2734.method3675(method1398(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2947.method2219(var18, var6);
        }
        class220.method3785(var14, var15, var16);
        class220.method3790(var17);
        class85.method1576();
        class85.field1428 = true;
        return var18;
    }

    @ObfuscatedName("bc.e(IB)Ljava/lang/String;")
    public static final String method1398(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class174.field2433 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class174.field2529 + "</col>";
        }
    }

    @ObfuscatedName("gy.x(ZI)Z")
    public final boolean method3456(boolean arg0) {
        int var2 = this.field2975;
        int var3 = this.field2990;
        int var4 = this.field2972;
        if (arg0) {
            var2 = this.field2969;
            var3 = this.field2970;
            var4 = this.field2991;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2368.method3111(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2368.method3111(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2368.method3111(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gy.f(ZB)Lbz;")
    public final class77 method3457(boolean arg0) {
        int var2 = this.field2975;
        int var3 = this.field2990;
        int var4 = this.field2972;
        if (arg0) {
            var2 = this.field2969;
            var3 = this.field2970;
            var4 = this.field2991;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1401(Statics.field2368, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1401(Statics.field2368, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1401(Statics.field2368, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2968 != 0) {
            var5.method1414(0, this.field2968, 0);
        }
        if (arg0 && this.field2971 != 0) {
            var5.method1414(0, this.field2971, 0);
        }
        if (this.field2951 != null) {
            for (int var10 = 0; var10 < this.field2951.length; var10++) {
                var5.method1400(this.field2951[var10], this.field2950[var10]);
            }
        }
        if (this.field2989 != null) {
            for (int var11 = 0; var11 < this.field2989.length; var11++) {
                var5.method1416(this.field2989[var11], this.field2977[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gy.s(ZI)Z")
    public final boolean method3466(boolean arg0) {
        int var2 = this.field2974;
        int var3 = this.field2954;
        if (arg0) {
            var2 = this.field2949;
            var3 = this.field2976;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2368.method3111(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2368.method3111(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gy.o(ZS)Lbz;")
    public final class77 method3459(boolean arg0) {
        int var2 = this.field2974;
        int var3 = this.field2954;
        if (arg0) {
            var2 = this.field2949;
            var3 = this.field2976;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1401(Statics.field2368, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1401(Statics.field2368, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2951 != null) {
            for (int var7 = 0; var7 < this.field2951.length; var7++) {
                var4.method1400(this.field2951[var7], this.field2950[var7]);
            }
        }
        if (this.field2989 != null) {
            for (int var8 = 0; var8 < this.field2989.length; var8++) {
                var4.method1416(this.field2989[var8], this.field2977[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ch.i(I)V")
    public static void method1823() {
        field2947.method2220();
    }
}

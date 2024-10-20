package deob;

@ObfuscatedName("gr")
public class class199 extends class130 {

    @ObfuscatedName("gr.i")
    public static class125 field2994 = new class125(64);

    @ObfuscatedName("gr.s")
    public static class125 field2961 = new class125(50);

    @ObfuscatedName("gr.k")
    public static class125 field2957 = new class125(200);

    @ObfuscatedName("gr.o")
    public int field2949;

    @ObfuscatedName("gr.q")
    public int field2959;

    @ObfuscatedName("gr.c")
    public String field2960 = "null";

    @ObfuscatedName("gr.b")
    public short[] field3003;

    @ObfuscatedName("gr.w")
    public short[] field2954;

    @ObfuscatedName("gr.l")
    public short[] field2953;

    @ObfuscatedName("gr.r")
    public short[] field2964;

    @ObfuscatedName("gr.u")
    public int field2965 = 2000;

    @ObfuscatedName("gr.e")
    public int field2966 = 0;

    @ObfuscatedName("gr.h")
    public int field2967 = 0;

    @ObfuscatedName("gr.d")
    public int field2955 = 0;

    @ObfuscatedName("gr.z")
    public int field2969 = 0;

    @ObfuscatedName("gr.t")
    public int field2970 = 0;

    @ObfuscatedName("gr.ab")
    public int field2971 = 0;

    @ObfuscatedName("gr.ac")
    public int field2972 = 1;

    @ObfuscatedName("gr.au")
    public boolean field2973 = false;

    @ObfuscatedName("gr.al")
    public String[] field2987 = new String[] { null, null, class174.field2359, null, null };

    @ObfuscatedName("gr.ae")
    public String[] field2975 = new String[] { null, null, null, null, class174.field2566 };

    @ObfuscatedName("gr.aq")
    public int field2962 = -2;

    @ObfuscatedName("gr.aa")
    public int field2977 = -1;

    @ObfuscatedName("gr.af")
    public int field2986 = -1;

    @ObfuscatedName("gr.as")
    public int field2988 = 0;

    @ObfuscatedName("gr.ao")
    public int field2980 = -1;

    @ObfuscatedName("gr.ax")
    public int field2981 = -1;

    @ObfuscatedName("gr.an")
    public int field2982 = 0;

    @ObfuscatedName("gr.ag")
    public int field2983 = -1;

    @ObfuscatedName("gr.aj")
    public int field2976 = -1;

    @ObfuscatedName("gr.ar")
    public int field2968 = -1;

    @ObfuscatedName("gr.az")
    public int field2990 = -1;

    @ObfuscatedName("gr.av")
    public int field2978 = -1;

    @ObfuscatedName("gr.ap")
    public int field2958 = -1;

    @ObfuscatedName("gr.aw")
    public int[] field2989;

    @ObfuscatedName("gr.ay")
    public int[] field2963;

    @ObfuscatedName("gr.ai")
    public int field2991 = -1;

    @ObfuscatedName("gr.at")
    public int field2992 = -1;

    @ObfuscatedName("gr.ah")
    public int field2993 = 128;

    @ObfuscatedName("gr.am")
    public int field2974 = 128;

    @ObfuscatedName("gr.ak")
    public int field2995 = 128;

    @ObfuscatedName("gr.by")
    public int field2996 = 0;

    @ObfuscatedName("gr.bf")
    public int field2997 = 0;

    @ObfuscatedName("gr.bj")
    public int field2951 = 0;

    @ObfuscatedName("gr.bi")
    public boolean field2999 = false;

    @ObfuscatedName("gr.br")
    public int field2984 = -1;

    @ObfuscatedName("gr.bn")
    public int field3001 = -1;

    @ObfuscatedName("gr.bx")
    public int field3002 = -1;

    @ObfuscatedName("gr.bl")
    public int field3000 = -1;

    @ObfuscatedName("am.x(II)Lgr;")
    public static class199 method973(int arg0) {
        class199 var1 = (class199) field2994.method2275((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2979.method3153(10, arg0);
        class199 var3 = new class199();
        var3.field2949 = arg0;
        if (var2 != null) {
            var3.method3518(new class154(var2));
        }
        var3.method3496();
        if (var3.field2992 != -1) {
            var3.method3497(method973(var3.field2992), method973(var3.field2991));
        }
        if (var3.field3001 != -1) {
            var3.method3554(method973(var3.field3001), method973(var3.field2984));
        }
        if (var3.field3000 != -1) {
            var3.method3495(method973(var3.field3000), method973(var3.field3002));
        }
        if (!Statics.field896 && var3.field2973) {
            var3.field2960 = class174.field2368;
            var3.field2999 = false;
            var3.field2987 = null;
            var3.field2975 = null;
            var3.field2962 = -1;
            var3.field2951 = 0;
        }
        field2994.method2282(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gr.n(I)V")
    public void method3496() {
    }

    @ObfuscatedName("gr.g(Leq;B)V")
    public void method3518(class154 arg0) {
        while (true) {
            int var2 = arg0.method2878();
            if (var2 == 0) {
                return;
            }
            this.method3501(arg0, var2);
        }
    }

    @ObfuscatedName("gr.v(Leq;II)V")
    public void method3501(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2959 = arg0.method2833();
        } else if (arg1 == 2) {
            this.field2960 = arg0.method2709();
        } else if (arg1 == 4) {
            this.field2965 = arg0.method2833();
        } else if (arg1 == 5) {
            this.field2966 = arg0.method2833();
        } else if (arg1 == 6) {
            this.field2967 = arg0.method2833();
        } else if (arg1 == 7) {
            this.field2969 = arg0.method2833();
            if (this.field2969 > 32767) {
                this.field2969 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2970 = arg0.method2833();
            if (this.field2970 > 32767) {
                this.field2970 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2971 = 1;
        } else if (arg1 == 12) {
            this.field2972 = arg0.method2803();
        } else if (arg1 == 16) {
            this.field2973 = true;
        } else if (arg1 == 23) {
            this.field2977 = arg0.method2833();
            this.field2988 = arg0.method2878();
        } else if (arg1 == 24) {
            this.field2986 = arg0.method2833();
        } else if (arg1 == 25) {
            this.field2980 = arg0.method2833();
            this.field2982 = arg0.method2878();
        } else if (arg1 == 26) {
            this.field2981 = arg0.method2833();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2987[arg1 - 30] = arg0.method2709();
            if (this.field2987[arg1 - 30].equalsIgnoreCase(class174.field2361)) {
                this.field2987[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2975[arg1 - 35] = arg0.method2709();
        } else if (arg1 == 40) {
            int var3 = arg0.method2878();
            this.field3003 = new short[var3];
            this.field2954 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3003[var4] = (short) arg0.method2833();
                this.field2954[var4] = (short) arg0.method2833();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2878();
            this.field2953 = new short[var5];
            this.field2964 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2953[var6] = (short) arg0.method2833();
                this.field2964[var6] = (short) arg0.method2833();
            }
        } else if (arg1 == 42) {
            this.field2962 = arg0.method2788();
        } else if (arg1 == 65) {
            this.field2999 = true;
        } else if (arg1 == 78) {
            this.field2983 = arg0.method2833();
        } else if (arg1 == 79) {
            this.field2976 = arg0.method2833();
        } else if (arg1 == 90) {
            this.field2968 = arg0.method2833();
        } else if (arg1 == 91) {
            this.field2978 = arg0.method2833();
        } else if (arg1 == 92) {
            this.field2990 = arg0.method2833();
        } else if (arg1 == 93) {
            this.field2958 = arg0.method2833();
        } else if (arg1 == 95) {
            this.field2955 = arg0.method2833();
        } else if (arg1 == 97) {
            this.field2991 = arg0.method2833();
        } else if (arg1 == 98) {
            this.field2992 = arg0.method2833();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2989 == null) {
                this.field2989 = new int[10];
                this.field2963 = new int[10];
            }
            this.field2989[arg1 - 100] = arg0.method2833();
            this.field2963[arg1 - 100] = arg0.method2833();
        } else if (arg1 == 110) {
            this.field2993 = arg0.method2833();
        } else if (arg1 == 111) {
            this.field2974 = arg0.method2833();
        } else if (arg1 == 112) {
            this.field2995 = arg0.method2833();
        } else if (arg1 == 113) {
            this.field2996 = arg0.method2788();
        } else if (arg1 == 114) {
            this.field2997 = arg0.method2788() * 5;
        } else if (arg1 == 115) {
            this.field2951 = arg0.method2878();
        } else if (arg1 == 139) {
            this.field2984 = arg0.method2833();
        } else if (arg1 == 140) {
            this.field3001 = arg0.method2833();
        } else if (arg1 == 148) {
            this.field3002 = arg0.method2833();
        } else if (arg1 == 149) {
            this.field3000 = arg0.method2833();
        }
    }

    @ObfuscatedName("gr.y(Lgr;Lgr;I)V")
    public void method3497(class199 arg0, class199 arg1) {
        this.field2959 = arg0.field2959;
        this.field2965 = arg0.field2965;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2955 = arg0.field2955;
        this.field2969 = arg0.field2969;
        this.field2970 = arg0.field2970;
        this.field3003 = arg0.field3003;
        this.field2954 = arg0.field2954;
        this.field2953 = arg0.field2953;
        this.field2964 = arg0.field2964;
        this.field2960 = arg1.field2960;
        this.field2973 = arg1.field2973;
        this.field2972 = arg1.field2972;
        this.field2971 = 1;
    }

    @ObfuscatedName("gr.p(Lgr;Lgr;I)V")
    public void method3554(class199 arg0, class199 arg1) {
        this.field2959 = arg0.field2959;
        this.field2965 = arg0.field2965;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2955 = arg0.field2955;
        this.field2969 = arg0.field2969;
        this.field2970 = arg0.field2970;
        this.field3003 = arg1.field3003;
        this.field2954 = arg1.field2954;
        this.field2953 = arg1.field2953;
        this.field2964 = arg1.field2964;
        this.field2960 = arg1.field2960;
        this.field2973 = arg1.field2973;
        this.field2971 = arg1.field2971;
        this.field2977 = arg1.field2977;
        this.field2986 = arg1.field2986;
        this.field2983 = arg1.field2983;
        this.field2980 = arg1.field2980;
        this.field2981 = arg1.field2981;
        this.field2976 = arg1.field2976;
        this.field2968 = arg1.field2968;
        this.field2990 = arg1.field2990;
        this.field2978 = arg1.field2978;
        this.field2958 = arg1.field2958;
        this.field2951 = arg1.field2951;
        this.field2987 = arg1.field2987;
        this.field2975 = new String[5];
        if (arg1.field2975 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2975[var3] = arg1.field2975[var3];
            }
        }
        this.field2975[4] = class174.field2365;
        this.field2972 = 0;
    }

    @ObfuscatedName("gr.j(Lgr;Lgr;B)V")
    public void method3495(class199 arg0, class199 arg1) {
        this.field2959 = arg0.field2959;
        this.field2965 = arg0.field2965;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2955 = arg0.field2955;
        this.field2969 = arg0.field2969;
        this.field2970 = arg0.field2970;
        this.field3003 = arg0.field3003;
        this.field2954 = arg0.field2954;
        this.field2953 = arg0.field2953;
        this.field2964 = arg0.field2964;
        this.field2971 = arg0.field2971;
        this.field2960 = arg1.field2960;
        this.field2972 = 0;
        this.field2973 = false;
        this.field2999 = false;
    }

    @ObfuscatedName("gr.s(II)Lbc;")
    public final class77 method3502(int arg0) {
        if (this.field2989 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2963[var3] && this.field2963[var3] != 0) {
                    var2 = this.field2989[var3];
                }
            }
            if (var2 != -1) {
                return method973(var2).method3502(1);
            }
        }
        class77 var4 = class77.method1469(Statics.field2956, this.field2959, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2993 != 128 || this.field2974 != 128 || this.field2995 != 128) {
            var4.method1484(this.field2993, this.field2974, this.field2995);
        }
        if (this.field3003 != null) {
            for (int var5 = 0; var5 < this.field3003.length; var5++) {
                var4.method1539(this.field3003[var5], this.field2954[var5]);
            }
        }
        if (this.field2953 != null) {
            for (int var6 = 0; var6 < this.field2953.length; var6++) {
                var4.method1534(this.field2953[var6], this.field2964[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gr.k(II)Lcj;")
    public final class83 method3503(int arg0) {
        if (this.field2989 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2963[var3] && this.field2963[var3] != 0) {
                    var2 = this.field2989[var3];
                }
            }
            if (var2 != -1) {
                return method973(var2).method3503(1);
            }
        }
        class83 var4 = (class83) field2961.method2275((long) this.field2949);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1469(Statics.field2956, this.field2959, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2993 != 128 || this.field2974 != 128 || this.field2995 != 128) {
            var5.method1484(this.field2993, this.field2974, this.field2995);
        }
        if (this.field3003 != null) {
            for (int var6 = 0; var6 < this.field3003.length; var6++) {
                var5.method1539(this.field3003[var6], this.field2954[var6]);
            }
        }
        if (this.field2953 != null) {
            for (int var7 = 0; var7 < this.field2953.length; var7++) {
                var5.method1534(this.field2953[var7], this.field2964[var7]);
            }
        }
        class83 var8 = var5.method1546(this.field2996 + 64, this.field2997 + 768, -50, -10, -50);
        var8.field1389 = true;
        field2961.method2282(var8, (long) this.field2949);
        return var8;
    }

    @ObfuscatedName("gr.f(IB)Lgr;")
    public class199 method3534(int arg0) {
        if (this.field2989 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2963[var3] && this.field2963[var3] != 0) {
                    var2 = this.field2989[var3];
                }
            }
            if (var2 != -1) {
                return method973(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("fl.o(IIIIIZI)Lhe;")
    public static final class225 method3132(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2957.method2275(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method973(arg0);
        if (arg1 > 1 && var9.field2989 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2963[var11] && var9.field2963[var11] != 0) {
                    var10 = var9.field2989[var11];
                }
            }
            if (var10 != -1) {
                var9 = method973(var10);
            }
        }
        class83 var12 = var9.method3503(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2992 != -1) {
            var13 = method3132(var9.field2991, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3001 != -1) {
            var13 = method3132(var9.field2984, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3000 != -1) {
            var13 = method3132(var9.field3002, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3197;
        int var15 = Statics.field3192;
        int var16 = Statics.field3193;
        int[] var17 = new int[4];
        class220.method3801(var17);
        class225 var18 = new class225(36, 32);
        class220.method3879(var18.field3227, 36, 32);
        class220.method3803();
        class85.method1669();
        class85.method1648(16, 16);
        class85.field1441 = false;
        if (var9.field3000 != -1) {
            var13.method3937(0, 0);
        }
        int var19 = var9.field2965;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1461[var9.field2966] * var19 >> 16;
        int var21 = class85.field1447[var9.field2966] * var19 >> 16;
        var12.method1571();
        var12.method1583(0, var9.field2967, var9.field2955, var9.field2966, var9.field2969, var9.field2970 + var12.field1551 / 2 + var20, var9.field2970 + var21);
        if (var9.field3001 != -1) {
            var13.method3937(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3933(1);
        }
        if (arg2 >= 2) {
            var18.method3933(16777215);
        }
        if (arg3 != 0) {
            var18.method3934(arg3);
        }
        class220.method3879(var18.field3227, 36, 32);
        if (var9.field2992 != -1) {
            var13.method3937(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2971 == 1) {
            Statics.field236.method3759(method3494(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2957.method2282(var18, var6);
        }
        class220.method3879(var14, var15, var16);
        class220.method3802(var17);
        class85.method1669();
        class85.field1441 = true;
        return var18;
    }

    @ObfuscatedName("gt.q(II)Ljava/lang/String;")
    public static final String method3494(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class174.field2520 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class174.field2559 + "</col>";
        }
    }

    @ObfuscatedName("gr.c(ZI)Z")
    public final boolean method3505(boolean arg0) {
        int var2 = this.field2977;
        int var3 = this.field2986;
        int var4 = this.field2983;
        if (arg0) {
            var2 = this.field2980;
            var3 = this.field2981;
            var4 = this.field2976;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2956.method3154(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2956.method3154(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2956.method3154(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gr.b(ZI)Lbc;")
    public final class77 method3506(boolean arg0) {
        int var2 = this.field2977;
        int var3 = this.field2986;
        int var4 = this.field2983;
        if (arg0) {
            var2 = this.field2980;
            var3 = this.field2981;
            var4 = this.field2976;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1469(Statics.field2956, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1469(Statics.field2956, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1469(Statics.field2956, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2988 != 0) {
            var5.method1480(0, this.field2988, 0);
        }
        if (arg0 && this.field2982 != 0) {
            var5.method1480(0, this.field2982, 0);
        }
        if (this.field3003 != null) {
            for (int var10 = 0; var10 < this.field3003.length; var10++) {
                var5.method1539(this.field3003[var10], this.field2954[var10]);
            }
        }
        if (this.field2953 != null) {
            for (int var11 = 0; var11 < this.field2953.length; var11++) {
                var5.method1534(this.field2953[var11], this.field2964[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gr.w(ZI)Z")
    public final boolean method3500(boolean arg0) {
        int var2 = this.field2968;
        int var3 = this.field2990;
        if (arg0) {
            var2 = this.field2978;
            var3 = this.field2958;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2956.method3154(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2956.method3154(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gr.l(ZB)Lbc;")
    public final class77 method3515(boolean arg0) {
        int var2 = this.field2968;
        int var3 = this.field2990;
        if (arg0) {
            var2 = this.field2978;
            var3 = this.field2958;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1469(Statics.field2956, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1469(Statics.field2956, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field3003 != null) {
            for (int var7 = 0; var7 < this.field3003.length; var7++) {
                var4.method1539(this.field3003[var7], this.field2954[var7]);
            }
        }
        if (this.field2953 != null) {
            for (int var8 = 0; var8 < this.field2953.length; var8++) {
                var4.method1534(this.field2953[var8], this.field2964[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gr.r(I)I")
    public int method3545() {
        if (this.field2962 == -1 || this.field2975 == null) {
            return -1;
        } else if (this.field2962 >= 0) {
            return this.field2975[this.field2962] == null ? -1 : this.field2962;
        } else if (class174.field2566.equalsIgnoreCase(this.field2975[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("cs.u(B)V")
    public static void method1908() {
        field2994.method2277();
        field2961.method2277();
        field2957.method2277();
    }
}

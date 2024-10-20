package deob;

@ObfuscatedName("gt")
public class class199 extends class130 {

    @ObfuscatedName("gt.t")
    public static class125 field2958 = new class125(64);

    @ObfuscatedName("gt.k")
    public static class125 field2966 = new class125(50);

    @ObfuscatedName("gt.f")
    public static class125 field2960 = new class125(200);

    @ObfuscatedName("gt.v")
    public int field2961;

    @ObfuscatedName("gt.d")
    public int field2962;

    @ObfuscatedName("gt.o")
    public String field2963 = "null";

    @ObfuscatedName("gt.q")
    public short[] field2964;

    @ObfuscatedName("gt.i")
    public short[] field2965;

    @ObfuscatedName("gt.x")
    public short[] field2970;

    @ObfuscatedName("gt.z")
    public short[] field2967;

    @ObfuscatedName("gt.n")
    public int field2971 = 2000;

    @ObfuscatedName("gt.w")
    public int field2993 = 0;

    @ObfuscatedName("gt.h")
    public int field2975 = 0;

    @ObfuscatedName("gt.u")
    public int field3002 = 0;

    @ObfuscatedName("gt.m")
    public int field2972 = 0;

    @ObfuscatedName("gt.p")
    public int field2973 = 0;

    @ObfuscatedName("gt.aq")
    public int field2974 = 0;

    @ObfuscatedName("gt.aj")
    public int field2968 = 1;

    @ObfuscatedName("gt.ae")
    public boolean field2976 = false;

    @ObfuscatedName("gt.au")
    public String[] field2977 = new String[] { null, null, class174.field2395, null, null };

    @ObfuscatedName("gt.aa")
    public String[] field2995 = new String[] { null, null, null, null, class174.field2362 };

    @ObfuscatedName("gt.at")
    public int field2956 = -2;

    @ObfuscatedName("gt.ap")
    public int field2980 = -1;

    @ObfuscatedName("gt.aw")
    public int field2997 = -1;

    @ObfuscatedName("gt.ah")
    public int field2982 = 0;

    @ObfuscatedName("gt.ao")
    public int field2983 = -1;

    @ObfuscatedName("gt.ag")
    public int field2984 = -1;

    @ObfuscatedName("gt.az")
    public int field2978 = 0;

    @ObfuscatedName("gt.ai")
    public int field2959 = -1;

    @ObfuscatedName("gt.as")
    public int field2954 = -1;

    @ObfuscatedName("gt.ak")
    public int field2988 = -1;

    @ObfuscatedName("gt.an")
    public int field3003 = -1;

    @ObfuscatedName("gt.av")
    public int field2990 = -1;

    @ObfuscatedName("gt.ab")
    public int field2991 = -1;

    @ObfuscatedName("gt.ay")
    public int[] field2969;

    @ObfuscatedName("gt.am")
    public int[] field3006;

    @ObfuscatedName("gt.ar")
    public int field2994 = -1;

    @ObfuscatedName("gt.ad")
    public int field2952 = -1;

    @ObfuscatedName("gt.ax")
    public int field2996 = 128;

    @ObfuscatedName("gt.ac")
    public int field2992 = 128;

    @ObfuscatedName("gt.al")
    public int field2998 = 128;

    @ObfuscatedName("gt.bu")
    public int field2999 = 0;

    @ObfuscatedName("gt.bd")
    public int field3000 = 0;

    @ObfuscatedName("gt.bz")
    public int field2979 = 0;

    @ObfuscatedName("gt.bo")
    public boolean field3001 = false;

    @ObfuscatedName("gt.ba")
    public int field2955 = -1;

    @ObfuscatedName("gt.bf")
    public int field3004 = -1;

    @ObfuscatedName("gt.be")
    public int field3005 = -1;

    @ObfuscatedName("gt.bq")
    public int field2951 = -1;

    @ObfuscatedName("dl.b(Lgv;Lgv;ZLhj;B)V")
    public static void method1989(class183 arg0, class183 arg1, boolean arg2, class209 arg3) {
        Statics.field2989 = arg0;
        Statics.field2986 = arg1;
        Statics.field2957 = arg2;
        Statics.field58 = Statics.field2989.method3136(10);
        Statics.field750 = arg3;
    }

    @ObfuscatedName("ao.e(II)Lgt;")
    public static class199 method751(int arg0) {
        class199 var1 = (class199) field2958.method2246((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2989.method3126(10, arg0);
        class199 var3 = new class199();
        var3.field2961 = arg0;
        if (var2 != null) {
            var3.method3526(new class154(var2));
        }
        var3.method3504();
        if (var3.field2952 != -1) {
            var3.method3487(method751(var3.field2952), method751(var3.field2994));
        }
        if (var3.field3004 != -1) {
            var3.method3488(method751(var3.field3004), method751(var3.field2955));
        }
        if (var3.field2951 != -1) {
            var3.method3516(method751(var3.field2951), method751(var3.field3005));
        }
        if (!Statics.field2957 && var3.field2976) {
            var3.field2963 = class174.field2491;
            var3.field3001 = false;
            var3.field2977 = null;
            var3.field2995 = null;
            var3.field2979 = 0;
        }
        field2958.method2250(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gt.c(I)V")
    public void method3504() {
    }

    @ObfuscatedName("gt.l(Lec;B)V")
    public void method3526(class154 arg0) {
        while (true) {
            int var2 = arg0.method2669();
            if (var2 == 0) {
                return;
            }
            this.method3489(arg0, var2);
        }
    }

    @ObfuscatedName("gt.y(Lec;II)V")
    public void method3489(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2962 = arg0.method2671();
        } else if (arg1 == 2) {
            this.field2963 = arg0.method2677();
        } else if (arg1 == 4) {
            this.field2971 = arg0.method2671();
        } else if (arg1 == 5) {
            this.field2993 = arg0.method2671();
        } else if (arg1 == 6) {
            this.field2975 = arg0.method2671();
        } else if (arg1 == 7) {
            this.field2972 = arg0.method2671();
            if (this.field2972 > 32767) {
                this.field2972 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2973 = arg0.method2671();
            if (this.field2973 > 32767) {
                this.field2973 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2974 = 1;
        } else if (arg1 == 12) {
            this.field2968 = arg0.method2815();
        } else if (arg1 == 16) {
            this.field2976 = true;
        } else if (arg1 == 23) {
            this.field2980 = arg0.method2671();
            this.field2982 = arg0.method2669();
        } else if (arg1 == 24) {
            this.field2997 = arg0.method2671();
        } else if (arg1 == 25) {
            this.field2983 = arg0.method2671();
            this.field2978 = arg0.method2669();
        } else if (arg1 == 26) {
            this.field2984 = arg0.method2671();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2977[arg1 - 30] = arg0.method2677();
            if (this.field2977[arg1 - 30].equalsIgnoreCase(class174.field2467)) {
                this.field2977[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2995[arg1 - 35] = arg0.method2677();
        } else if (arg1 == 40) {
            int var3 = arg0.method2669();
            this.field2964 = new short[var3];
            this.field2965 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2964[var4] = (short) arg0.method2671();
                this.field2965[var4] = (short) arg0.method2671();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2669();
            this.field2970 = new short[var5];
            this.field2967 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2970[var6] = (short) arg0.method2671();
                this.field2967[var6] = (short) arg0.method2671();
            }
        } else if (arg1 == 42) {
            this.field2956 = arg0.method2670();
        } else if (arg1 == 65) {
            this.field3001 = true;
        } else if (arg1 == 78) {
            this.field2959 = arg0.method2671();
        } else if (arg1 == 79) {
            this.field2954 = arg0.method2671();
        } else if (arg1 == 90) {
            this.field2988 = arg0.method2671();
        } else if (arg1 == 91) {
            this.field2990 = arg0.method2671();
        } else if (arg1 == 92) {
            this.field3003 = arg0.method2671();
        } else if (arg1 == 93) {
            this.field2991 = arg0.method2671();
        } else if (arg1 == 95) {
            this.field3002 = arg0.method2671();
        } else if (arg1 == 97) {
            this.field2994 = arg0.method2671();
        } else if (arg1 == 98) {
            this.field2952 = arg0.method2671();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2969 == null) {
                this.field2969 = new int[10];
                this.field3006 = new int[10];
            }
            this.field2969[arg1 - 100] = arg0.method2671();
            this.field3006[arg1 - 100] = arg0.method2671();
        } else if (arg1 == 110) {
            this.field2996 = arg0.method2671();
        } else if (arg1 == 111) {
            this.field2992 = arg0.method2671();
        } else if (arg1 == 112) {
            this.field2998 = arg0.method2671();
        } else if (arg1 == 113) {
            this.field2999 = arg0.method2670();
        } else if (arg1 == 114) {
            this.field3000 = arg0.method2670();
        } else if (arg1 == 115) {
            this.field2979 = arg0.method2669();
        } else if (arg1 == 139) {
            this.field2955 = arg0.method2671();
        } else if (arg1 == 140) {
            this.field3004 = arg0.method2671();
        } else if (arg1 == 148) {
            this.field3005 = arg0.method2671();
        } else if (arg1 == 149) {
            this.field2951 = arg0.method2671();
        }
    }

    @ObfuscatedName("gt.j(Lgt;Lgt;I)V")
    public void method3487(class199 arg0, class199 arg1) {
        this.field2962 = arg0.field2962;
        this.field2971 = arg0.field2971;
        this.field2993 = arg0.field2993;
        this.field2975 = arg0.field2975;
        this.field3002 = arg0.field3002;
        this.field2972 = arg0.field2972;
        this.field2973 = arg0.field2973;
        this.field2964 = arg0.field2964;
        this.field2965 = arg0.field2965;
        this.field2970 = arg0.field2970;
        this.field2967 = arg0.field2967;
        this.field2963 = arg1.field2963;
        this.field2976 = arg1.field2976;
        this.field2968 = arg1.field2968;
        this.field2974 = 1;
    }

    @ObfuscatedName("gt.t(Lgt;Lgt;I)V")
    public void method3488(class199 arg0, class199 arg1) {
        this.field2962 = arg0.field2962;
        this.field2971 = arg0.field2971;
        this.field2993 = arg0.field2993;
        this.field2975 = arg0.field2975;
        this.field3002 = arg0.field3002;
        this.field2972 = arg0.field2972;
        this.field2973 = arg0.field2973;
        this.field2964 = arg1.field2964;
        this.field2965 = arg1.field2965;
        this.field2970 = arg1.field2970;
        this.field2967 = arg1.field2967;
        this.field2963 = arg1.field2963;
        this.field2976 = arg1.field2976;
        this.field2974 = arg1.field2974;
        this.field2980 = arg1.field2980;
        this.field2997 = arg1.field2997;
        this.field2959 = arg1.field2959;
        this.field2983 = arg1.field2983;
        this.field2984 = arg1.field2984;
        this.field2954 = arg1.field2954;
        this.field2988 = arg1.field2988;
        this.field3003 = arg1.field3003;
        this.field2990 = arg1.field2990;
        this.field2991 = arg1.field2991;
        this.field2979 = arg1.field2979;
        this.field2977 = arg1.field2977;
        this.field2995 = new String[5];
        if (arg1.field2995 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2995[var3] = arg1.field2995[var3];
            }
        }
        this.field2995[4] = class174.field2367;
        this.field2968 = 0;
    }

    @ObfuscatedName("gt.k(Lgt;Lgt;I)V")
    public void method3516(class199 arg0, class199 arg1) {
        this.field2962 = arg0.field2962;
        this.field2971 = arg0.field2971;
        this.field2993 = arg0.field2993;
        this.field2975 = arg0.field2975;
        this.field3002 = arg0.field3002;
        this.field2972 = arg0.field2972;
        this.field2973 = arg0.field2973;
        this.field2964 = arg0.field2964;
        this.field2965 = arg0.field2965;
        this.field2970 = arg0.field2970;
        this.field2967 = arg0.field2967;
        this.field2974 = arg0.field2974;
        this.field2963 = arg1.field2963;
        this.field2968 = 0;
        this.field2976 = false;
        this.field3001 = false;
    }

    @ObfuscatedName("gt.f(IB)Lbr;")
    public final class77 method3505(int arg0) {
        if (this.field2969 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3006[var3] && this.field3006[var3] != 0) {
                    var2 = this.field2969[var3];
                }
            }
            if (var2 != -1) {
                return method751(var2).method3505(1);
            }
        }
        class77 var4 = class77.method1409(Statics.field2986, this.field2962, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2996 != 128 || this.field2992 != 128 || this.field2998 != 128) {
            var4.method1424(this.field2996, this.field2992, this.field2998);
        }
        if (this.field2964 != null) {
            for (int var5 = 0; var5 < this.field2964.length; var5++) {
                var4.method1480(this.field2964[var5], this.field2965[var5]);
            }
        }
        if (this.field2970 != null) {
            for (int var6 = 0; var6 < this.field2970.length; var6++) {
                var4.method1423(this.field2970[var6], this.field2967[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gt.a(II)Lco;")
    public final class83 method3491(int arg0) {
        if (this.field2969 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3006[var3] && this.field3006[var3] != 0) {
                    var2 = this.field2969[var3];
                }
            }
            if (var2 != -1) {
                return method751(var2).method3491(1);
            }
        }
        class83 var4 = (class83) field2966.method2246((long) this.field2961);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1409(Statics.field2986, this.field2962, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2996 != 128 || this.field2992 != 128 || this.field2998 != 128) {
            var5.method1424(this.field2996, this.field2992, this.field2998);
        }
        if (this.field2964 != null) {
            for (int var6 = 0; var6 < this.field2964.length; var6++) {
                var5.method1480(this.field2964[var6], this.field2965[var6]);
            }
        }
        if (this.field2970 != null) {
            for (int var7 = 0; var7 < this.field2970.length; var7++) {
                var5.method1423(this.field2970[var7], this.field2967[var7]);
            }
        }
        class83 var8 = var5.method1457(this.field2999 + 64, this.field3000 * 5 + 768, -50, -10, -50);
        var8.field1397 = true;
        field2966.method2250(var8, (long) this.field2961);
        return var8;
    }

    @ObfuscatedName("gt.v(IB)Lgt;")
    public class199 method3492(int arg0) {
        if (this.field2969 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3006[var3] && this.field3006[var3] != 0) {
                    var2 = this.field2969[var3];
                }
            }
            if (var2 != -1) {
                return method751(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("l.d(IIIIIZI)Lhg;")
    public static final class225 method43(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2960.method2246(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method751(arg0);
        if (arg1 > 1 && var9.field2969 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3006[var11] && var9.field3006[var11] != 0) {
                    var10 = var9.field2969[var11];
                }
            }
            if (var10 != -1) {
                var9 = method751(var10);
            }
        }
        class83 var12 = var9.method3491(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2952 != -1) {
            var13 = method43(var9.field2994, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3004 != -1) {
            var13 = method43(var9.field2955, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2951 != -1) {
            var13 = method43(var9.field3005, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3186;
        int var15 = Statics.field3187;
        int var16 = Statics.field3192;
        int[] var17 = new int[4];
        class220.method3811(var17);
        class225 var18 = new class225(36, 32);
        class220.method3807(var18.field3220, 36, 32);
        class220.method3813();
        class85.method1579();
        class85.method1582(16, 16);
        class85.field1454 = false;
        if (var9.field2951 != -1) {
            var13.method3937(0, 0);
        }
        int var19 = var9.field2971;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1460[var9.field2993] * var19 >> 16;
        int var21 = class85.field1461[var9.field2993] * var19 >> 16;
        var12.method1505();
        var12.method1558(0, var9.field2975, var9.field3002, var9.field2993, var9.field2972, var9.field2973 + var12.field1548 / 2 + var20, var9.field2973 + var21);
        if (var9.field3004 != -1) {
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
        class220.method3807(var18.field3220, 36, 32);
        if (var9.field2952 != -1) {
            var13.method3937(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2974 == 1) {
            Statics.field750.method3701(method897(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2960.method2250(var18, var6);
        }
        class220.method3807(var14, var15, var16);
        class220.method3819(var17);
        class85.method1579();
        class85.field1454 = true;
        return var18;
    }

    @ObfuscatedName("ar.o(II)Ljava/lang/String;")
    public static final String method897(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class174.field2435 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class174.field2520 + "</col>";
        }
    }

    @ObfuscatedName("gt.q(ZI)Z")
    public final boolean method3512(boolean arg0) {
        int var2 = this.field2980;
        int var3 = this.field2997;
        int var4 = this.field2959;
        if (arg0) {
            var2 = this.field2983;
            var3 = this.field2984;
            var4 = this.field2954;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2986.method3202(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2986.method3202(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2986.method3202(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gt.i(ZB)Lbr;")
    public final class77 method3494(boolean arg0) {
        int var2 = this.field2980;
        int var3 = this.field2997;
        int var4 = this.field2959;
        if (arg0) {
            var2 = this.field2983;
            var3 = this.field2984;
            var4 = this.field2954;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1409(Statics.field2986, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1409(Statics.field2986, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1409(Statics.field2986, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2982 != 0) {
            var5.method1421(0, this.field2982, 0);
        }
        if (arg0 && this.field2978 != 0) {
            var5.method1421(0, this.field2978, 0);
        }
        if (this.field2964 != null) {
            for (int var10 = 0; var10 < this.field2964.length; var10++) {
                var5.method1480(this.field2964[var10], this.field2965[var10]);
            }
        }
        if (this.field2970 != null) {
            for (int var11 = 0; var11 < this.field2970.length; var11++) {
                var5.method1423(this.field2970[var11], this.field2967[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gt.x(ZI)Z")
    public final boolean method3511(boolean arg0) {
        int var2 = this.field2988;
        int var3 = this.field3003;
        if (arg0) {
            var2 = this.field2990;
            var3 = this.field2991;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2986.method3202(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2986.method3202(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gt.z(ZI)Lbr;")
    public final class77 method3496(boolean arg0) {
        int var2 = this.field2988;
        int var3 = this.field3003;
        if (arg0) {
            var2 = this.field2990;
            var3 = this.field2991;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1409(Statics.field2986, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1409(Statics.field2986, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2964 != null) {
            for (int var7 = 0; var7 < this.field2964.length; var7++) {
                var4.method1480(this.field2964[var7], this.field2965[var7]);
            }
        }
        if (this.field2970 != null) {
            for (int var8 = 0; var8 < this.field2970.length; var8++) {
                var4.method1423(this.field2970[var8], this.field2967[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gt.n(B)I")
    public int method3497() {
        if (this.field2956 == -1) {
            return -1;
        } else if (this.field2956 >= 0) {
            return this.field2995[this.field2956] == null ? -1 : this.field2956;
        } else if (class174.field2362.equalsIgnoreCase(this.field2995[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ee.w(ZI)V")
    public static void method2891(boolean arg0) {
        if (Statics.field2957 != arg0) {
            field2958.method2249();
            field2966.method2249();
            field2960.method2249();
            Statics.field2957 = arg0;
        }
    }
}

package deob;

@ObfuscatedName("gv")
public class class199 extends class130 {

    @ObfuscatedName("gv.o")
    public static class125 field2954 = new class125(64);

    @ObfuscatedName("gv.m")
    public static class125 field3000 = new class125(50);

    @ObfuscatedName("gv.s")
    public static class125 field2956 = new class125(200);

    @ObfuscatedName("gv.b")
    public int field2957;

    @ObfuscatedName("gv.v")
    public int field2958;

    @ObfuscatedName("gv.f")
    public String field2959 = "null";

    @ObfuscatedName("gv.z")
    public short[] field2960;

    @ObfuscatedName("gv.t")
    public short[] field2997;

    @ObfuscatedName("gv.y")
    public short[] field2946;

    @ObfuscatedName("gv.w")
    public short[] field2963;

    @ObfuscatedName("gv.a")
    public int field2991 = 2000;

    @ObfuscatedName("gv.k")
    public int field2968 = 0;

    @ObfuscatedName("gv.l")
    public int field2966 = 0;

    @ObfuscatedName("gv.x")
    public int field2967 = 0;

    @ObfuscatedName("gv.g")
    public int field2965 = 0;

    @ObfuscatedName("gv.e")
    public int field2969 = 0;

    @ObfuscatedName("gv.ae")
    public int field2995 = 0;

    @ObfuscatedName("gv.aq")
    public int field2971 = 1;

    @ObfuscatedName("gv.at")
    public boolean field2985 = false;

    @ObfuscatedName("gv.au")
    public String[] field3002 = new String[] { null, null, class174.field2379, null, null };

    @ObfuscatedName("gv.am")
    public String[] field2974 = new String[] { null, null, null, null, class174.field2635 };

    @ObfuscatedName("gv.ai")
    public int field2975 = -2;

    @ObfuscatedName("gv.ac")
    public int field2976 = -1;

    @ObfuscatedName("gv.ao")
    public int field2989 = -1;

    @ObfuscatedName("gv.as")
    public int field2978 = 0;

    @ObfuscatedName("gv.aa")
    public int field2979 = -1;

    @ObfuscatedName("gv.ah")
    public int field2980 = -1;

    @ObfuscatedName("gv.aj")
    public int field2981 = 0;

    @ObfuscatedName("gv.aw")
    public int field2982 = -1;

    @ObfuscatedName("gv.ap")
    public int field2983 = -1;

    @ObfuscatedName("gv.ak")
    public int field2984 = -1;

    @ObfuscatedName("gv.ag")
    public int field2973 = -1;

    @ObfuscatedName("gv.al")
    public int field2986 = -1;

    @ObfuscatedName("gv.an")
    public int field2987 = -1;

    @ObfuscatedName("gv.ar")
    public int[] field2964;

    @ObfuscatedName("gv.ab")
    public int[] field2955;

    @ObfuscatedName("gv.az")
    public int field2990 = -1;

    @ObfuscatedName("gv.ay")
    public int field2972 = -1;

    @ObfuscatedName("gv.av")
    public int field2992 = 128;

    @ObfuscatedName("gv.af")
    public int field2993 = 128;

    @ObfuscatedName("gv.ax")
    public int field2994 = 128;

    @ObfuscatedName("gv.bn")
    public int field2953 = 0;

    @ObfuscatedName("gv.bp")
    public int field2996 = 0;

    @ObfuscatedName("gv.bt")
    public int field2949 = 0;

    @ObfuscatedName("gv.bj")
    public boolean field2998 = false;

    @ObfuscatedName("gv.bw")
    public int field2999 = -1;

    @ObfuscatedName("gv.bd")
    public int field2970 = -1;

    @ObfuscatedName("gv.bu")
    public int field3001 = -1;

    @ObfuscatedName("gv.bo")
    public int field2977 = -1;

    @ObfuscatedName("ew.q(Lgj;Lgj;ZLhk;I)V")
    public static void method2629(class183 arg0, class183 arg1, boolean arg2, class209 arg3) {
        Statics.field2950 = arg0;
        Statics.field2962 = arg1;
        Statics.field2952 = arg2;
        Statics.field2961 = Statics.field2950.method3126(10);
        Statics.field2769 = arg3;
    }

    @ObfuscatedName("cc.d(II)Lgv;")
    public static class199 method1947(int arg0) {
        class199 var1 = (class199) field2954.method2258((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2950.method3133(10, arg0);
        class199 var3 = new class199();
        var3.field2957 = arg0;
        if (var2 != null) {
            var3.method3499(new class154(var2));
        }
        var3.method3469();
        if (var3.field2972 != -1) {
            var3.method3523(method1947(var3.field2972), method1947(var3.field2990));
        }
        if (var3.field2970 != -1) {
            var3.method3473(method1947(var3.field2970), method1947(var3.field2999));
        }
        if (var3.field2977 != -1) {
            var3.method3474(method1947(var3.field2977), method1947(var3.field3001));
        }
        if (!Statics.field2952 && var3.field2985) {
            var3.field2959 = class174.field2426;
            var3.field2998 = false;
            var3.field3002 = null;
            var3.field2974 = null;
            var3.field2975 = -1;
            var3.field2949 = 0;
        }
        field2954.method2248(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gv.h(I)V")
    public void method3469() {
    }

    @ObfuscatedName("gv.p(Lel;I)V")
    public void method3499(class154 arg0) {
        while (true) {
            int var2 = arg0.method2666();
            if (var2 == 0) {
                return;
            }
            this.method3471(arg0, var2);
        }
    }

    @ObfuscatedName("gv.j(Lel;II)V")
    public void method3471(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2958 = arg0.method2668();
        } else if (arg1 == 2) {
            this.field2959 = arg0.method2701();
        } else if (arg1 == 4) {
            this.field2991 = arg0.method2668();
        } else if (arg1 == 5) {
            this.field2968 = arg0.method2668();
        } else if (arg1 == 6) {
            this.field2966 = arg0.method2668();
        } else if (arg1 == 7) {
            this.field2965 = arg0.method2668();
            if (this.field2965 > 32767) {
                this.field2965 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2969 = arg0.method2668();
            if (this.field2969 > 32767) {
                this.field2969 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2995 = 1;
        } else if (arg1 == 12) {
            this.field2971 = arg0.method2798();
        } else if (arg1 == 16) {
            this.field2985 = true;
        } else if (arg1 == 23) {
            this.field2976 = arg0.method2668();
            this.field2978 = arg0.method2666();
        } else if (arg1 == 24) {
            this.field2989 = arg0.method2668();
        } else if (arg1 == 25) {
            this.field2979 = arg0.method2668();
            this.field2981 = arg0.method2666();
        } else if (arg1 == 26) {
            this.field2980 = arg0.method2668();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3002[arg1 - 30] = arg0.method2701();
            if (this.field3002[arg1 - 30].equalsIgnoreCase(class174.field2585)) {
                this.field3002[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2974[arg1 - 35] = arg0.method2701();
        } else if (arg1 == 40) {
            int var3 = arg0.method2666();
            this.field2960 = new short[var3];
            this.field2997 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2960[var4] = (short) arg0.method2668();
                this.field2997[var4] = (short) arg0.method2668();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2666();
            this.field2946 = new short[var5];
            this.field2963 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2946[var6] = (short) arg0.method2668();
                this.field2963[var6] = (short) arg0.method2668();
            }
        } else if (arg1 == 42) {
            this.field2975 = arg0.method2835();
        } else if (arg1 == 65) {
            this.field2998 = true;
        } else if (arg1 == 78) {
            this.field2982 = arg0.method2668();
        } else if (arg1 == 79) {
            this.field2983 = arg0.method2668();
        } else if (arg1 == 90) {
            this.field2984 = arg0.method2668();
        } else if (arg1 == 91) {
            this.field2986 = arg0.method2668();
        } else if (arg1 == 92) {
            this.field2973 = arg0.method2668();
        } else if (arg1 == 93) {
            this.field2987 = arg0.method2668();
        } else if (arg1 == 95) {
            this.field2967 = arg0.method2668();
        } else if (arg1 == 97) {
            this.field2990 = arg0.method2668();
        } else if (arg1 == 98) {
            this.field2972 = arg0.method2668();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2964 == null) {
                this.field2964 = new int[10];
                this.field2955 = new int[10];
            }
            this.field2964[arg1 - 100] = arg0.method2668();
            this.field2955[arg1 - 100] = arg0.method2668();
        } else if (arg1 == 110) {
            this.field2992 = arg0.method2668();
        } else if (arg1 == 111) {
            this.field2993 = arg0.method2668();
        } else if (arg1 == 112) {
            this.field2994 = arg0.method2668();
        } else if (arg1 == 113) {
            this.field2953 = arg0.method2835();
        } else if (arg1 == 114) {
            this.field2996 = arg0.method2835() * 5;
        } else if (arg1 == 115) {
            this.field2949 = arg0.method2666();
        } else if (arg1 == 139) {
            this.field2999 = arg0.method2668();
        } else if (arg1 == 140) {
            this.field2970 = arg0.method2668();
        } else if (arg1 == 148) {
            this.field3001 = arg0.method2668();
        } else if (arg1 == 149) {
            this.field2977 = arg0.method2668();
        }
    }

    @ObfuscatedName("gv.n(Lgv;Lgv;B)V")
    public void method3523(class199 arg0, class199 arg1) {
        this.field2958 = arg0.field2958;
        this.field2991 = arg0.field2991;
        this.field2968 = arg0.field2968;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2965 = arg0.field2965;
        this.field2969 = arg0.field2969;
        this.field2960 = arg0.field2960;
        this.field2997 = arg0.field2997;
        this.field2946 = arg0.field2946;
        this.field2963 = arg0.field2963;
        this.field2959 = arg1.field2959;
        this.field2985 = arg1.field2985;
        this.field2971 = arg1.field2971;
        this.field2995 = 1;
    }

    @ObfuscatedName("gv.c(Lgv;Lgv;I)V")
    public void method3473(class199 arg0, class199 arg1) {
        this.field2958 = arg0.field2958;
        this.field2991 = arg0.field2991;
        this.field2968 = arg0.field2968;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2965 = arg0.field2965;
        this.field2969 = arg0.field2969;
        this.field2960 = arg1.field2960;
        this.field2997 = arg1.field2997;
        this.field2946 = arg1.field2946;
        this.field2963 = arg1.field2963;
        this.field2959 = arg1.field2959;
        this.field2985 = arg1.field2985;
        this.field2995 = arg1.field2995;
        this.field2976 = arg1.field2976;
        this.field2989 = arg1.field2989;
        this.field2982 = arg1.field2982;
        this.field2979 = arg1.field2979;
        this.field2980 = arg1.field2980;
        this.field2983 = arg1.field2983;
        this.field2984 = arg1.field2984;
        this.field2973 = arg1.field2973;
        this.field2986 = arg1.field2986;
        this.field2987 = arg1.field2987;
        this.field2949 = arg1.field2949;
        this.field3002 = arg1.field3002;
        this.field2974 = new String[5];
        if (arg1.field2974 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2974[var3] = arg1.field2974[var3];
            }
        }
        this.field2974[4] = class174.field2368;
        this.field2971 = 0;
    }

    @ObfuscatedName("gv.o(Lgv;Lgv;I)V")
    public void method3474(class199 arg0, class199 arg1) {
        this.field2958 = arg0.field2958;
        this.field2991 = arg0.field2991;
        this.field2968 = arg0.field2968;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2965 = arg0.field2965;
        this.field2969 = arg0.field2969;
        this.field2960 = arg0.field2960;
        this.field2997 = arg0.field2997;
        this.field2946 = arg0.field2946;
        this.field2963 = arg0.field2963;
        this.field2995 = arg0.field2995;
        this.field2959 = arg1.field2959;
        this.field2971 = 0;
        this.field2985 = false;
        this.field2998 = false;
    }

    @ObfuscatedName("gv.s(IB)Lbx;")
    public final class77 method3520(int arg0) {
        if (this.field2964 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2955[var3] && this.field2955[var3] != 0) {
                    var2 = this.field2964[var3];
                }
            }
            if (var2 != -1) {
                return method1947(var2).method3520(1);
            }
        }
        class77 var4 = class77.method1494(Statics.field2962, this.field2958, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2992 != 128 || this.field2993 != 128 || this.field2994 != 128) {
            var4.method1464(this.field2992, this.field2993, this.field2994);
        }
        if (this.field2960 != null) {
            for (int var5 = 0; var5 < this.field2960.length; var5++) {
                var4.method1461(this.field2960[var5], this.field2997[var5]);
            }
        }
        if (this.field2946 != null) {
            for (int var6 = 0; var6 < this.field2946.length; var6++) {
                var4.method1499(this.field2946[var6], this.field2963[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gv.u(II)Lcf;")
    public final class83 method3476(int arg0) {
        if (this.field2964 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2955[var3] && this.field2955[var3] != 0) {
                    var2 = this.field2964[var3];
                }
            }
            if (var2 != -1) {
                return method1947(var2).method3476(1);
            }
        }
        class83 var4 = (class83) field3000.method2258((long) this.field2957);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1494(Statics.field2962, this.field2958, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2992 != 128 || this.field2993 != 128 || this.field2994 != 128) {
            var5.method1464(this.field2992, this.field2993, this.field2994);
        }
        if (this.field2960 != null) {
            for (int var6 = 0; var6 < this.field2960.length; var6++) {
                var5.method1461(this.field2960[var6], this.field2997[var6]);
            }
        }
        if (this.field2946 != null) {
            for (int var7 = 0; var7 < this.field2946.length; var7++) {
                var5.method1499(this.field2946[var7], this.field2963[var7]);
            }
        }
        class83 var8 = var5.method1469(this.field2953 + 64, this.field2996 + 768, -50, -10, -50);
        var8.field1403 = true;
        field3000.method2248(var8, (long) this.field2957);
        return var8;
    }

    @ObfuscatedName("gv.b(IB)Lgv;")
    public class199 method3479(int arg0) {
        if (this.field2964 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2955[var3] && this.field2955[var3] != 0) {
                    var2 = this.field2964[var3];
                }
            }
            if (var2 != -1) {
                return method1947(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("fw.v(IIIIIZI)Lhy;")
    public static final class225 method3111(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2956.method2258(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method1947(arg0);
        if (arg1 > 1 && var9.field2964 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2955[var11] && var9.field2955[var11] != 0) {
                    var10 = var9.field2964[var11];
                }
            }
            if (var10 != -1) {
                var9 = method1947(var10);
            }
        }
        class83 var12 = var9.method3476(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2972 != -1) {
            var13 = method3111(var9.field2990, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2970 != -1) {
            var13 = method3111(var9.field2999, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2977 != -1) {
            var13 = method3111(var9.field3001, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3194;
        int var15 = Statics.field3189;
        int var16 = Statics.field3191;
        int[] var17 = new int[4];
        class220.method3838(var17);
        class225 var18 = new class225(36, 32);
        class220.method3804(var18.field3227, 36, 32);
        class220.method3845();
        class85.method1621();
        class85.method1647(16, 16);
        class85.field1449 = false;
        if (var9.field2977 != -1) {
            var13.method3941(0, 0);
        }
        int var19 = var9.field2991;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1469[var9.field2968] * var19 >> 16;
        int var21 = class85.field1463[var9.field2968] * var19 >> 16;
        var12.method1582();
        var12.method1564(0, var9.field2966, var9.field2967, var9.field2968, var9.field2965, var9.field2969 + var12.field1558 / 2 + var20, var9.field2969 + var21);
        if (var9.field2970 != -1) {
            var13.method3941(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3937(1);
        }
        if (arg2 >= 2) {
            var18.method3937(16777215);
        }
        if (arg3 != 0) {
            var18.method3959(arg3);
        }
        class220.method3804(var18.field3227, 36, 32);
        if (var9.field2972 != -1) {
            var13.method3941(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2995 == 1) {
            Statics.field2769.method3705(method3236(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2956.method2248(var18, var6);
        }
        class220.method3804(var14, var15, var16);
        class220.method3809(var17);
        class85.method1621();
        class85.field1449 = true;
        return var18;
    }

    @ObfuscatedName("gl.f(IB)Ljava/lang/String;")
    public static final String method3236(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class174.field2607 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class174.field2521 + "</col>";
        }
    }

    @ObfuscatedName("gv.z(ZI)Z")
    public final boolean method3478(boolean arg0) {
        int var2 = this.field2976;
        int var3 = this.field2989;
        int var4 = this.field2982;
        if (arg0) {
            var2 = this.field2979;
            var3 = this.field2980;
            var4 = this.field2983;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2962.method3189(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2962.method3189(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2962.method3189(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gv.t(ZB)Lbx;")
    public final class77 method3514(boolean arg0) {
        int var2 = this.field2976;
        int var3 = this.field2989;
        int var4 = this.field2982;
        if (arg0) {
            var2 = this.field2979;
            var3 = this.field2980;
            var4 = this.field2983;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1494(Statics.field2962, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1494(Statics.field2962, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1494(Statics.field2962, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2978 != 0) {
            var5.method1496(0, this.field2978, 0);
        }
        if (arg0 && this.field2981 != 0) {
            var5.method1496(0, this.field2981, 0);
        }
        if (this.field2960 != null) {
            for (int var10 = 0; var10 < this.field2960.length; var10++) {
                var5.method1461(this.field2960[var10], this.field2997[var10]);
            }
        }
        if (this.field2946 != null) {
            for (int var11 = 0; var11 < this.field2946.length; var11++) {
                var5.method1499(this.field2946[var11], this.field2963[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gv.y(ZI)Z")
    public final boolean method3480(boolean arg0) {
        int var2 = this.field2984;
        int var3 = this.field2973;
        if (arg0) {
            var2 = this.field2986;
            var3 = this.field2987;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2962.method3189(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2962.method3189(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gv.w(ZB)Lbx;")
    public final class77 method3492(boolean arg0) {
        int var2 = this.field2984;
        int var3 = this.field2973;
        if (arg0) {
            var2 = this.field2986;
            var3 = this.field2987;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1494(Statics.field2962, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1494(Statics.field2962, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2960 != null) {
            for (int var7 = 0; var7 < this.field2960.length; var7++) {
                var4.method1461(this.field2960[var7], this.field2997[var7]);
            }
        }
        if (this.field2946 != null) {
            for (int var8 = 0; var8 < this.field2946.length; var8++) {
                var4.method1499(this.field2946[var8], this.field2963[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gv.a(I)I")
    public int method3482() {
        if (this.field2975 == -1 || this.field2974 == null) {
            return -1;
        } else if (this.field2975 >= 0) {
            return this.field2974[this.field2975] == null ? -1 : this.field2975;
        } else if (class174.field2635.equalsIgnoreCase(this.field2974[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("l.k(I)V")
    public static void method224() {
        field2954.method2249();
        field3000.method2249();
        field2956.method2249();
    }

    @ObfuscatedName("ay.l(I)V")
    public static void method956() {
        field2956.method2249();
    }

    @ObfuscatedName("ac.x(ZI)V")
    public static void method782(boolean arg0) {
        if (Statics.field2952 != arg0) {
            method224();
            Statics.field2952 = arg0;
        }
    }
}

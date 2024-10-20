package deob;

@ObfuscatedName("gs")
public class class199 extends class130 {

    @ObfuscatedName("gs.u")
    public static class125 field2987 = new class125(64);

    @ObfuscatedName("gs.b")
    public static class125 field2956 = new class125(50);

    @ObfuscatedName("gs.x")
    public static class125 field2957 = new class125(200);

    @ObfuscatedName("gs.n")
    public int field2959;

    @ObfuscatedName("gs.m")
    public int field2960;

    @ObfuscatedName("gs.j")
    public String field2961 = "null";

    @ObfuscatedName("gs.w")
    public short[] field2970;

    @ObfuscatedName("gs.p")
    public short[] field2995;

    @ObfuscatedName("gs.o")
    public short[] field2972;

    @ObfuscatedName("gs.i")
    public short[] field2965;

    @ObfuscatedName("gs.z")
    public int field2966 = 2000;

    @ObfuscatedName("gs.e")
    public int field2967 = 0;

    @ObfuscatedName("gs.d")
    public int field2962 = 0;

    @ObfuscatedName("gs.t")
    public int field2969 = 0;

    @ObfuscatedName("gs.q")
    public int field2985 = 0;

    @ObfuscatedName("gs.y")
    public int field2968 = 0;

    @ObfuscatedName("gs.l")
    public int field2990 = 0;

    @ObfuscatedName("gs.v")
    public int field2973 = 1;

    @ObfuscatedName("gs.az")
    public boolean field2974 = false;

    @ObfuscatedName("gs.ai")
    public String[] field3001 = new String[] { null, null, class174.field2379, null, null };

    @ObfuscatedName("gs.ad")
    public String[] field2976 = new String[] { null, null, null, null, class174.field2369 };

    @ObfuscatedName("gs.aa")
    public int field2977 = -1;

    @ObfuscatedName("gs.ao")
    public int field2975 = -1;

    @ObfuscatedName("gs.ax")
    public int field2981 = 0;

    @ObfuscatedName("gs.ae")
    public int field2980 = -1;

    @ObfuscatedName("gs.al")
    public int field2986 = -1;

    @ObfuscatedName("gs.an")
    public int field2982 = 0;

    @ObfuscatedName("gs.aw")
    public int field2988 = -1;

    @ObfuscatedName("gs.ah")
    public int field2979 = -1;

    @ObfuscatedName("gs.ar")
    public int field2996 = -1;

    @ObfuscatedName("gs.ay")
    public int field2953 = -1;

    @ObfuscatedName("gs.as")
    public int field2978 = -1;

    @ObfuscatedName("gs.aq")
    public int field2951 = -1;

    @ObfuscatedName("gs.af")
    public int[] field2971;

    @ObfuscatedName("gs.aj")
    public int[] field2984;

    @ObfuscatedName("gs.ap")
    public int field2991 = -1;

    @ObfuscatedName("gs.ac")
    public int field2992 = -1;

    @ObfuscatedName("gs.at")
    public int field2993 = 128;

    @ObfuscatedName("gs.av")
    public int field2994 = 128;

    @ObfuscatedName("gs.am")
    public int field2964 = 128;

    @ObfuscatedName("gs.ak")
    public int field2983 = 0;

    @ObfuscatedName("gs.au")
    public int field2997 = 0;

    @ObfuscatedName("gs.ag")
    public int field2998 = 0;

    @ObfuscatedName("gs.ab")
    public boolean field2999 = false;

    @ObfuscatedName("gs.bt")
    public int field3000 = -1;

    @ObfuscatedName("gs.bw")
    public int field2955 = -1;

    @ObfuscatedName("gs.bd")
    public int field3002 = -1;

    @ObfuscatedName("gs.bs")
    public int field3003 = -1;

    @ObfuscatedName("dh.s(Lgp;Lgp;ZLhi;B)V")
    public static void method1883(class183 arg0, class183 arg1, boolean arg2, class209 arg3) {
        Statics.field225 = arg0;
        Statics.field1571 = arg1;
        Statics.field2989 = arg2;
        Statics.field2963 = Statics.field225.method2996(10);
        Statics.field2958 = arg3;
    }

    @ObfuscatedName("aw.c(II)Lgs;")
    public static class199 method699(int arg0) {
        class199 var1 = (class199) field2987.method2121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field225.method2986(10, arg0);
        class199 var3 = new class199();
        var3.field2959 = arg0;
        if (var2 != null) {
            var3.method3323(new class154(var2));
        }
        var3.method3322();
        if (var3.field2992 != -1) {
            var3.method3325(method699(var3.field2992), method699(var3.field2991));
        }
        if (var3.field2955 != -1) {
            var3.method3326(method699(var3.field2955), method699(var3.field3000));
        }
        if (var3.field3003 != -1) {
            var3.method3327(method699(var3.field3003), method699(var3.field3002));
        }
        if (!Statics.field2989 && var3.field2974) {
            var3.field2961 = class174.field2473;
            var3.field2999 = false;
            var3.field3001 = null;
            var3.field2976 = null;
            var3.field2998 = 0;
        }
        field2987.method2123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gs.f(I)V")
    public void method3322() {
    }

    @ObfuscatedName("gs.g(Lea;I)V")
    public void method3323(class154 arg0) {
        while (true) {
            int var2 = arg0.method2545();
            if (var2 == 0) {
                return;
            }
            this.method3324(arg0, var2);
        }
    }

    @ObfuscatedName("gs.k(Lea;IB)V")
    public void method3324(class154 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2960 = arg0.method2541();
        } else if (arg1 == 2) {
            this.field2961 = arg0.method2734();
        } else if (arg1 == 4) {
            this.field2966 = arg0.method2541();
        } else if (arg1 == 5) {
            this.field2967 = arg0.method2541();
        } else if (arg1 == 6) {
            this.field2962 = arg0.method2541();
        } else if (arg1 == 7) {
            this.field2985 = arg0.method2541();
            if (this.field2985 > 32767) {
                this.field2985 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2968 = arg0.method2541();
            if (this.field2968 > 32767) {
                this.field2968 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field2990 = 1;
        } else if (arg1 == 12) {
            this.field2973 = arg0.method2550();
        } else if (arg1 == 16) {
            this.field2974 = true;
        } else if (arg1 == 23) {
            this.field2977 = arg0.method2541();
            this.field2981 = arg0.method2545();
        } else if (arg1 == 24) {
            this.field2975 = arg0.method2541();
        } else if (arg1 == 25) {
            this.field2980 = arg0.method2541();
            this.field2982 = arg0.method2545();
        } else if (arg1 == 26) {
            this.field2986 = arg0.method2541();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3001[arg1 - 30] = arg0.method2734();
            if (this.field3001[arg1 - 30].equalsIgnoreCase(class174.field2486)) {
                this.field3001[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2976[arg1 - 35] = arg0.method2734();
        } else if (arg1 == 40) {
            int var3 = arg0.method2545();
            this.field2970 = new short[var3];
            this.field2995 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2970[var4] = (short) arg0.method2541();
                this.field2995[var4] = (short) arg0.method2541();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2545();
            this.field2972 = new short[var5];
            this.field2965 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2972[var6] = (short) arg0.method2541();
                this.field2965[var6] = (short) arg0.method2541();
            }
        } else if (arg1 == 65) {
            this.field2999 = true;
        } else if (arg1 == 78) {
            this.field2988 = arg0.method2541();
        } else if (arg1 == 79) {
            this.field2979 = arg0.method2541();
        } else if (arg1 == 90) {
            this.field2996 = arg0.method2541();
        } else if (arg1 == 91) {
            this.field2978 = arg0.method2541();
        } else if (arg1 == 92) {
            this.field2953 = arg0.method2541();
        } else if (arg1 == 93) {
            this.field2951 = arg0.method2541();
        } else if (arg1 == 95) {
            this.field2969 = arg0.method2541();
        } else if (arg1 == 97) {
            this.field2991 = arg0.method2541();
        } else if (arg1 == 98) {
            this.field2992 = arg0.method2541();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2971 == null) {
                this.field2971 = new int[10];
                this.field2984 = new int[10];
            }
            this.field2971[arg1 - 100] = arg0.method2541();
            this.field2984[arg1 - 100] = arg0.method2541();
        } else if (arg1 == 110) {
            this.field2993 = arg0.method2541();
        } else if (arg1 == 111) {
            this.field2994 = arg0.method2541();
        } else if (arg1 == 112) {
            this.field2964 = arg0.method2541();
        } else if (arg1 == 113) {
            this.field2983 = arg0.method2657();
        } else if (arg1 == 114) {
            this.field2997 = arg0.method2657() * 5;
        } else if (arg1 == 115) {
            this.field2998 = arg0.method2545();
        } else if (arg1 == 139) {
            this.field3000 = arg0.method2541();
        } else if (arg1 == 140) {
            this.field2955 = arg0.method2541();
        } else if (arg1 == 148) {
            this.field3002 = arg0.method2541();
        } else if (arg1 == 149) {
            this.field3003 = arg0.method2541();
        }
    }

    @ObfuscatedName("gs.u(Lgs;Lgs;B)V")
    public void method3325(class199 arg0, class199 arg1) {
        this.field2960 = arg0.field2960;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2962 = arg0.field2962;
        this.field2969 = arg0.field2969;
        this.field2985 = arg0.field2985;
        this.field2968 = arg0.field2968;
        this.field2970 = arg0.field2970;
        this.field2995 = arg0.field2995;
        this.field2972 = arg0.field2972;
        this.field2965 = arg0.field2965;
        this.field2961 = arg1.field2961;
        this.field2974 = arg1.field2974;
        this.field2973 = arg1.field2973;
        this.field2990 = 1;
    }

    @ObfuscatedName("gs.b(Lgs;Lgs;I)V")
    public void method3326(class199 arg0, class199 arg1) {
        this.field2960 = arg0.field2960;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2962 = arg0.field2962;
        this.field2969 = arg0.field2969;
        this.field2985 = arg0.field2985;
        this.field2968 = arg0.field2968;
        this.field2970 = arg1.field2970;
        this.field2995 = arg1.field2995;
        this.field2972 = arg1.field2972;
        this.field2965 = arg1.field2965;
        this.field2961 = arg1.field2961;
        this.field2974 = arg1.field2974;
        this.field2990 = arg1.field2990;
        this.field2977 = arg1.field2977;
        this.field2975 = arg1.field2975;
        this.field2988 = arg1.field2988;
        this.field2980 = arg1.field2980;
        this.field2986 = arg1.field2986;
        this.field2979 = arg1.field2979;
        this.field2996 = arg1.field2996;
        this.field2953 = arg1.field2953;
        this.field2978 = arg1.field2978;
        this.field2951 = arg1.field2951;
        this.field2998 = arg1.field2998;
        this.field3001 = arg1.field3001;
        this.field2976 = new String[5];
        if (arg1.field2976 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2976[var3] = arg1.field2976[var3];
            }
        }
        this.field2976[4] = class174.field2376;
        this.field2973 = 0;
    }

    @ObfuscatedName("gs.x(Lgs;Lgs;I)V")
    public void method3327(class199 arg0, class199 arg1) {
        this.field2960 = arg0.field2960;
        this.field2966 = arg0.field2966;
        this.field2967 = arg0.field2967;
        this.field2962 = arg0.field2962;
        this.field2969 = arg0.field2969;
        this.field2985 = arg0.field2985;
        this.field2968 = arg0.field2968;
        this.field2970 = arg0.field2970;
        this.field2995 = arg0.field2995;
        this.field2972 = arg0.field2972;
        this.field2965 = arg0.field2965;
        this.field2990 = arg0.field2990;
        this.field2961 = arg1.field2961;
        this.field2973 = 0;
        this.field2974 = false;
        this.field2999 = false;
    }

    @ObfuscatedName("gs.r(IB)Lbu;")
    public final class77 method3328(int arg0) {
        if (this.field2971 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2984[var3] && this.field2984[var3] != 0) {
                    var2 = this.field2971[var3];
                }
            }
            if (var2 != -1) {
                return method699(var2).method3328(1);
            }
        }
        class77 var4 = class77.method1351(Statics.field1571, this.field2960, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2993 != 128 || this.field2994 != 128 || this.field2964 != 128) {
            var4.method1374(this.field2993, this.field2994, this.field2964);
        }
        if (this.field2970 != null) {
            for (int var5 = 0; var5 < this.field2970.length; var5++) {
                var4.method1364(this.field2970[var5], this.field2995[var5]);
            }
        }
        if (this.field2972 != null) {
            for (int var6 = 0; var6 < this.field2972.length; var6++) {
                var4.method1365(this.field2972[var6], this.field2965[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gs.n(IB)Lcz;")
    public final class83 method3364(int arg0) {
        if (this.field2971 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2984[var3] && this.field2984[var3] != 0) {
                    var2 = this.field2971[var3];
                }
            }
            if (var2 != -1) {
                return method699(var2).method3364(1);
            }
        }
        class83 var4 = (class83) field2956.method2121((long) this.field2959);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1351(Statics.field1571, this.field2960, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2993 != 128 || this.field2994 != 128 || this.field2964 != 128) {
            var5.method1374(this.field2993, this.field2994, this.field2964);
        }
        if (this.field2970 != null) {
            for (int var6 = 0; var6 < this.field2970.length; var6++) {
                var5.method1364(this.field2970[var6], this.field2995[var6]);
            }
        }
        if (this.field2972 != null) {
            for (int var7 = 0; var7 < this.field2972.length; var7++) {
                var5.method1365(this.field2972[var7], this.field2965[var7]);
            }
        }
        class83 var8 = var5.method1371(this.field2983 + 64, this.field2997 + 768, -50, -10, -50);
        var8.field1383 = true;
        field2956.method2123(var8, (long) this.field2959);
        return var8;
    }

    @ObfuscatedName("gs.m(II)Lgs;")
    public class199 method3350(int arg0) {
        if (this.field2971 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2984[var3] && this.field2984[var3] != 0) {
                    var2 = this.field2971[var3];
                }
            }
            if (var2 != -1) {
                return method699(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("bk.j(IIIIIZI)Lhk;")
    public static final class225 method1347(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class225 var8 = (class225) field2957.method2121(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class199 var9 = method699(arg0);
        if (arg1 > 1 && var9.field2971 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2984[var11] && var9.field2984[var11] != 0) {
                    var10 = var9.field2971[var11];
                }
            }
            if (var10 != -1) {
                var9 = method699(var10);
            }
        }
        class83 var12 = var9.method3364(1);
        if (var12 == null) {
            return null;
        }
        class225 var13 = null;
        if (var9.field2992 != -1) {
            var13 = method1347(var9.field2991, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2955 != -1) {
            var13 = method1347(var9.field3000, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3003 != -1) {
            var13 = method1347(var9.field3002, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3175;
        int var15 = Statics.field3176;
        int var16 = Statics.field3177;
        int[] var17 = new int[4];
        class220.method3694(var17);
        class225 var18 = new class225(36, 32);
        class220.method3633(var18.field3207, 36, 32);
        class220.method3659();
        class85.method1558();
        class85.method1521(16, 16);
        class85.field1433 = false;
        if (var9.field3003 != -1) {
            var13.method3744(0, 0);
        }
        int var19 = var9.field2966;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1445[var9.field2967] * var19 >> 16;
        int var21 = class85.field1454[var9.field2967] * var19 >> 16;
        var12.method1443();
        var12.method1459(0, var9.field2962, var9.field2969, var9.field2967, var9.field2985, var9.field2968 + var12.field1546 / 2 + var20, var9.field2968 + var21);
        if (var9.field2955 != -1) {
            var13.method3744(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3743(1);
        }
        if (arg2 >= 2) {
            var18.method3743(16777215);
        }
        if (arg3 != 0) {
            var18.method3741(arg3);
        }
        class220.method3633(var18.field3207, 36, 32);
        if (var9.field2992 != -1) {
            var13.method3744(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2990 == 1) {
            Statics.field2958.method3523(Statics.method2977(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2957.method2123(var18, var6);
        }
        class220.method3633(var14, var15, var16);
        class220.method3638(var17);
        class85.method1558();
        class85.field1433 = true;
        return var18;
    }

    @ObfuscatedName("gs.p(ZI)Z")
    public final boolean method3343(boolean arg0) {
        int var2 = this.field2977;
        int var3 = this.field2975;
        int var4 = this.field2988;
        if (arg0) {
            var2 = this.field2980;
            var3 = this.field2986;
            var4 = this.field2979;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1571.method2988(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1571.method2988(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1571.method2988(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gs.o(ZI)Lbu;")
    public final class77 method3340(boolean arg0) {
        int var2 = this.field2977;
        int var3 = this.field2975;
        int var4 = this.field2988;
        if (arg0) {
            var2 = this.field2980;
            var3 = this.field2986;
            var4 = this.field2979;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1351(Statics.field1571, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1351(Statics.field1571, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1351(Statics.field1571, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field2981 != 0) {
            var5.method1392(0, this.field2981, 0);
        }
        if (arg0 && this.field2982 != 0) {
            var5.method1392(0, this.field2982, 0);
        }
        if (this.field2970 != null) {
            for (int var10 = 0; var10 < this.field2970.length; var10++) {
                var5.method1364(this.field2970[var10], this.field2995[var10]);
            }
        }
        if (this.field2972 != null) {
            for (int var11 = 0; var11 < this.field2972.length; var11++) {
                var5.method1365(this.field2972[var11], this.field2965[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gs.i(ZB)Z")
    public final boolean method3356(boolean arg0) {
        int var2 = this.field2996;
        int var3 = this.field2953;
        if (arg0) {
            var2 = this.field2978;
            var3 = this.field2951;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1571.method2988(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1571.method2988(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gs.z(ZI)Lbu;")
    public final class77 method3334(boolean arg0) {
        int var2 = this.field2996;
        int var3 = this.field2953;
        if (arg0) {
            var2 = this.field2978;
            var3 = this.field2951;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1351(Statics.field1571, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1351(Statics.field1571, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2970 != null) {
            for (int var7 = 0; var7 < this.field2970.length; var7++) {
                var4.method1364(this.field2970[var7], this.field2995[var7]);
            }
        }
        if (this.field2972 != null) {
            for (int var8 = 0; var8 < this.field2972.length; var8++) {
                var4.method1365(this.field2972[var8], this.field2965[var8]);
            }
        }
        return var4;
    }
}

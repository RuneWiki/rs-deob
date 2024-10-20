package deob;

@ObfuscatedName("gu")
public class class204 extends class151 {

    @ObfuscatedName("gu.v")
    public static class146 field2983 = new class146(64);

    @ObfuscatedName("gu.g")
    public static class146 field2984 = new class146(50);

    @ObfuscatedName("gu.w")
    public static class146 field2985 = new class146(200);

    @ObfuscatedName("gu.s")
    public int field3016;

    @ObfuscatedName("gu.k")
    public int field2988;

    @ObfuscatedName("gu.e")
    public String field3022 = "null";

    @ObfuscatedName("gu.j")
    public short[] field2990;

    @ObfuscatedName("gu.i")
    public short[] field2991;

    @ObfuscatedName("gu.a")
    public short[] field2992;

    @ObfuscatedName("gu.x")
    public short[] field2993;

    @ObfuscatedName("gu.h")
    public int field2994 = 2000;

    @ObfuscatedName("gu.b")
    public int field2995 = 0;

    @ObfuscatedName("gu.f")
    public int field3005 = 0;

    @ObfuscatedName("gu.o")
    public int field2997 = 0;

    @ObfuscatedName("gu.m")
    public int field2998 = 0;

    @ObfuscatedName("gu.y")
    public int field2999 = 0;

    @ObfuscatedName("gu.am")
    public int field3000 = 0;

    @ObfuscatedName("gu.ax")
    public int field3023 = 1;

    @ObfuscatedName("gu.ac")
    public boolean field3002 = false;

    @ObfuscatedName("gu.az")
    public String[] field3003 = new String[] { null, null, class176.field2359, null, null };

    @ObfuscatedName("gu.ao")
    public String[] field3004 = new String[] { null, null, null, null, class176.field2360 };

    @ObfuscatedName("gu.aa")
    public int field3032 = -2;

    @ObfuscatedName("gu.aj")
    public int field3010 = -1;

    @ObfuscatedName("gu.ay")
    public int field3007 = -1;

    @ObfuscatedName("gu.ae")
    public int field3008 = 0;

    @ObfuscatedName("gu.aq")
    public int field3009 = -1;

    @ObfuscatedName("gu.av")
    public int field3027 = -1;

    @ObfuscatedName("gu.aw")
    public int field3011 = 0;

    @ObfuscatedName("gu.ag")
    public int field3026 = -1;

    @ObfuscatedName("gu.af")
    public int field3013 = -1;

    @ObfuscatedName("gu.ar")
    public int field3014 = -1;

    @ObfuscatedName("gu.ab")
    public int field3015 = -1;

    @ObfuscatedName("gu.as")
    public int field3012 = -1;

    @ObfuscatedName("gu.ai")
    public int field2976 = -1;

    @ObfuscatedName("gu.ad")
    public int[] field3029;

    @ObfuscatedName("gu.an")
    public int[] field3019;

    @ObfuscatedName("gu.al")
    public int field3020 = -1;

    @ObfuscatedName("gu.at")
    public int field3021 = -1;

    @ObfuscatedName("gu.ah")
    public int field3028 = 128;

    @ObfuscatedName("gu.ap")
    public int field2987 = 128;

    @ObfuscatedName("gu.au")
    public int field3024 = 128;

    @ObfuscatedName("gu.bu")
    public int field3025 = 0;

    @ObfuscatedName("gu.br")
    public int field3033 = 0;

    @ObfuscatedName("gu.bk")
    public int field2996 = 0;

    @ObfuscatedName("gu.bo")
    public class143 field2989;

    @ObfuscatedName("gu.bw")
    public boolean field3018 = false;

    @ObfuscatedName("gu.bi")
    public int field3030 = -1;

    @ObfuscatedName("gu.bl")
    public int field3031 = -1;

    @ObfuscatedName("gu.by")
    public int field3017 = -1;

    @ObfuscatedName("gu.bv")
    public int field3001 = -1;

    @ObfuscatedName("al.d(II)Lgu;")
    public static class204 method868(int arg0) {
        class204 var1 = (class204) field2983.method2598((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2980.method3129(10, arg0);
        class204 var3 = new class204();
        var3.field3016 = arg0;
        if (var2 != null) {
            var3.method3550(new class130(var2));
        }
        var3.method3523();
        if (var3.field3021 != -1) {
            var3.method3526(method868(var3.field3021), method868(var3.field3020));
        }
        if (var3.field3031 != -1) {
            var3.method3554(method868(var3.field3031), method868(var3.field3030));
        }
        if (var3.field3001 != -1) {
            var3.method3532(method868(var3.field3001), method868(var3.field3017));
        }
        if (!Statics.field2981 && var3.field3002) {
            var3.field3022 = class176.field2573;
            var3.field3018 = false;
            var3.field3003 = null;
            var3.field3004 = null;
            var3.field3032 = -1;
            var3.field2996 = 0;
            if (var3.field2989 != null) {
                boolean var4 = false;
                for (class149 var5 = var3.field2989.method2568(); var5 != null; var5 = var3.field2989.method2570()) {
                    class199 var6 = Statics.method3084((int) var5.field2034);
                    if (var6.field2876) {
                        var5.method2652();
                    } else {
                        var4 = true;
                    }
                }
                if (!var4) {
                    var3.field2989 = null;
                }
            }
        }
        field2983.method2607(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gu.c(I)V")
    public void method3523() {
    }

    @ObfuscatedName("gu.n(Ldu;I)V")
    public void method3550(class130 arg0) {
        while (true) {
            int var2 = arg0.method2379();
            if (var2 == 0) {
                return;
            }
            this.method3525(arg0, var2);
        }
    }

    @ObfuscatedName("gu.q(Ldu;II)V")
    public void method3525(class130 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2988 = arg0.method2232();
        } else if (arg1 == 2) {
            this.field3022 = arg0.method2314();
        } else if (arg1 == 4) {
            this.field2994 = arg0.method2232();
        } else if (arg1 == 5) {
            this.field2995 = arg0.method2232();
        } else if (arg1 == 6) {
            this.field3005 = arg0.method2232();
        } else if (arg1 == 7) {
            this.field2998 = arg0.method2232();
            if (this.field2998 > 32767) {
                this.field2998 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2999 = arg0.method2232();
            if (this.field2999 > 32767) {
                this.field2999 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field3000 = 1;
        } else if (arg1 == 12) {
            this.field3023 = arg0.method2246();
        } else if (arg1 == 16) {
            this.field3002 = true;
        } else if (arg1 == 23) {
            this.field3010 = arg0.method2232();
            this.field3008 = arg0.method2379();
        } else if (arg1 == 24) {
            this.field3007 = arg0.method2232();
        } else if (arg1 == 25) {
            this.field3009 = arg0.method2232();
            this.field3011 = arg0.method2379();
        } else if (arg1 == 26) {
            this.field3027 = arg0.method2232();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3003[arg1 - 30] = arg0.method2314();
            if (this.field3003[arg1 - 30].equalsIgnoreCase(class176.field2361)) {
                this.field3003[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field3004[arg1 - 35] = arg0.method2314();
        } else if (arg1 == 40) {
            int var3 = arg0.method2379();
            this.field2990 = new short[var3];
            this.field2991 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2990[var4] = (short) arg0.method2232();
                this.field2991[var4] = (short) arg0.method2232();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2379();
            this.field2992 = new short[var5];
            this.field2993 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2992[var6] = (short) arg0.method2232();
                this.field2993[var6] = (short) arg0.method2232();
            }
        } else if (arg1 == 42) {
            this.field3032 = arg0.method2230();
        } else if (arg1 == 65) {
            this.field3018 = true;
        } else if (arg1 == 78) {
            this.field3026 = arg0.method2232();
        } else if (arg1 == 79) {
            this.field3013 = arg0.method2232();
        } else if (arg1 == 90) {
            this.field3014 = arg0.method2232();
        } else if (arg1 == 91) {
            this.field3012 = arg0.method2232();
        } else if (arg1 == 92) {
            this.field3015 = arg0.method2232();
        } else if (arg1 == 93) {
            this.field2976 = arg0.method2232();
        } else if (arg1 == 95) {
            this.field2997 = arg0.method2232();
        } else if (arg1 == 97) {
            this.field3020 = arg0.method2232();
        } else if (arg1 == 98) {
            this.field3021 = arg0.method2232();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field3029 == null) {
                this.field3029 = new int[10];
                this.field3019 = new int[10];
            }
            this.field3029[arg1 - 100] = arg0.method2232();
            this.field3019[arg1 - 100] = arg0.method2232();
        } else if (arg1 == 110) {
            this.field3028 = arg0.method2232();
        } else if (arg1 == 111) {
            this.field2987 = arg0.method2232();
        } else if (arg1 == 112) {
            this.field3024 = arg0.method2232();
        } else if (arg1 == 113) {
            this.field3025 = arg0.method2230();
        } else if (arg1 == 114) {
            this.field3033 = arg0.method2230();
        } else if (arg1 == 115) {
            this.field2996 = arg0.method2379();
        } else if (arg1 == 139) {
            this.field3030 = arg0.method2232();
        } else if (arg1 == 140) {
            this.field3031 = arg0.method2232();
        } else if (arg1 == 148) {
            this.field3017 = arg0.method2232();
        } else if (arg1 == 149) {
            this.field3001 = arg0.method2232();
        } else if (arg1 == 249) {
            this.field2989 = class197.method3079(arg0, this.field2989);
        }
    }

    @ObfuscatedName("gu.t(Lgu;Lgu;I)V")
    public void method3526(class204 arg0, class204 arg1) {
        this.field2988 = arg0.field2988;
        this.field2994 = arg0.field2994;
        this.field2995 = arg0.field2995;
        this.field3005 = arg0.field3005;
        this.field2997 = arg0.field2997;
        this.field2998 = arg0.field2998;
        this.field2999 = arg0.field2999;
        this.field2990 = arg0.field2990;
        this.field2991 = arg0.field2991;
        this.field2992 = arg0.field2992;
        this.field2993 = arg0.field2993;
        this.field3022 = arg1.field3022;
        this.field3002 = arg1.field3002;
        this.field3023 = arg1.field3023;
        this.field3000 = 1;
    }

    @ObfuscatedName("gu.p(Lgu;Lgu;S)V")
    public void method3554(class204 arg0, class204 arg1) {
        this.field2988 = arg0.field2988;
        this.field2994 = arg0.field2994;
        this.field2995 = arg0.field2995;
        this.field3005 = arg0.field3005;
        this.field2997 = arg0.field2997;
        this.field2998 = arg0.field2998;
        this.field2999 = arg0.field2999;
        this.field2990 = arg1.field2990;
        this.field2991 = arg1.field2991;
        this.field2992 = arg1.field2992;
        this.field2993 = arg1.field2993;
        this.field3022 = arg1.field3022;
        this.field3002 = arg1.field3002;
        this.field3000 = arg1.field3000;
        this.field3010 = arg1.field3010;
        this.field3007 = arg1.field3007;
        this.field3026 = arg1.field3026;
        this.field3009 = arg1.field3009;
        this.field3027 = arg1.field3027;
        this.field3013 = arg1.field3013;
        this.field3014 = arg1.field3014;
        this.field3015 = arg1.field3015;
        this.field3012 = arg1.field3012;
        this.field2976 = arg1.field2976;
        this.field2996 = arg1.field2996;
        this.field3003 = arg1.field3003;
        this.field3004 = new String[5];
        if (arg1.field3004 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field3004[var3] = arg1.field3004[var3];
            }
        }
        this.field3004[4] = class176.field2365;
        this.field3023 = 0;
    }

    @ObfuscatedName("gu.u(Lgu;Lgu;I)V")
    public void method3532(class204 arg0, class204 arg1) {
        this.field2988 = arg0.field2988;
        this.field2994 = arg0.field2994;
        this.field2995 = arg0.field2995;
        this.field3005 = arg0.field3005;
        this.field2997 = arg0.field2997;
        this.field2998 = arg0.field2998;
        this.field2999 = arg0.field2999;
        this.field2990 = arg0.field2990;
        this.field2991 = arg0.field2991;
        this.field2992 = arg0.field2992;
        this.field2993 = arg0.field2993;
        this.field3000 = arg0.field3000;
        this.field3022 = arg1.field3022;
        this.field3023 = 0;
        this.field3002 = false;
        this.field3018 = false;
    }

    @ObfuscatedName("gu.w(II)Lbd;")
    public final class77 method3572(int arg0) {
        if (this.field3029 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3019[var3] && this.field3019[var3] != 0) {
                    var2 = this.field3029[var3];
                }
            }
            if (var2 != -1) {
                return method868(var2).method3572(1);
            }
        }
        class77 var4 = class77.method1394(Statics.field2788, this.field2988, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field3028 != 128 || this.field2987 != 128 || this.field3024 != 128) {
            var4.method1409(this.field3028, this.field2987, this.field3024);
        }
        if (this.field2990 != null) {
            for (int var5 = 0; var5 < this.field2990.length; var5++) {
                var4.method1406(this.field2990[var5], this.field2991[var5]);
            }
        }
        if (this.field2992 != null) {
            for (int var6 = 0; var6 < this.field2992.length; var6++) {
                var4.method1407(this.field2992[var6], this.field2993[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gu.r(II)Lcf;")
    public final class83 method3530(int arg0) {
        if (this.field3029 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3019[var3] && this.field3019[var3] != 0) {
                    var2 = this.field3029[var3];
                }
            }
            if (var2 != -1) {
                return method868(var2).method3530(1);
            }
        }
        class83 var4 = (class83) field2984.method2598((long) this.field3016);
        if (var4 != null) {
            return var4;
        }
        class77 var5 = class77.method1394(Statics.field2788, this.field2988, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field3028 != 128 || this.field2987 != 128 || this.field3024 != 128) {
            var5.method1409(this.field3028, this.field2987, this.field3024);
        }
        if (this.field2990 != null) {
            for (int var6 = 0; var6 < this.field2990.length; var6++) {
                var5.method1406(this.field2990[var6], this.field2991[var6]);
            }
        }
        if (this.field2992 != null) {
            for (int var7 = 0; var7 < this.field2992.length; var7++) {
                var5.method1407(this.field2992[var7], this.field2993[var7]);
            }
        }
        class83 var8 = var5.method1417(this.field3025 + 64, this.field3033 * 5 + 768, -50, -10, -50);
        var8.field1371 = true;
        field2984.method2607(var8, (long) this.field3016);
        return var8;
    }

    @ObfuscatedName("gu.s(II)Lgu;")
    public class204 method3531(int arg0) {
        if (this.field3029 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field3019[var3] && this.field3019[var3] != 0) {
                    var2 = this.field3029[var3];
                }
            }
            if (var2 != -1) {
                return method868(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("eg.k(IIIIIZI)Lhu;")
    public static final class229 method2454(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class229 var8 = (class229) field2985.method2598(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class204 var9 = method868(arg0);
        if (arg1 > 1 && var9.field3029 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field3019[var11] && var9.field3019[var11] != 0) {
                    var10 = var9.field3029[var11];
                }
            }
            if (var10 != -1) {
                var9 = method868(var10);
            }
        }
        class83 var12 = var9.method3530(1);
        if (var12 == null) {
            return null;
        }
        class229 var13 = null;
        if (var9.field3021 != -1) {
            var13 = method2454(var9.field3020, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3031 != -1) {
            var13 = method2454(var9.field3030, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field3001 != -1) {
            var13 = method2454(var9.field3017, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field3213;
        int var15 = Statics.field3210;
        int var16 = Statics.field3211;
        int[] var17 = new int[4];
        class224.method3902(var17);
        class229 var18 = new class229(36, 32);
        class224.method3858(var18.field3238, 36, 32);
        class224.method3900();
        class85.method1564();
        class85.method1567(16, 16);
        class85.field1441 = false;
        if (var9.field3001 != -1) {
            var13.method3981(0, 0);
        }
        int var19 = var9.field2994;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1434[var9.field2995] * var19 >> 16;
        int var21 = class85.field1442[var9.field2995] * var19 >> 16;
        var12.method1489();
        var12.method1501(0, var9.field3005, var9.field2997, var9.field2995, var9.field2998, var9.field2999 + var12.field1532 / 2 + var20, var9.field2999 + var21);
        if (var9.field3031 != -1) {
            var13.method3981(0, 0);
        }
        if (arg2 >= 1) {
            var18.method3977(1);
        }
        if (arg2 >= 2) {
            var18.method3977(16777215);
        }
        if (arg3 != 0) {
            var18.method3976(arg3);
        }
        class224.method3858(var18.field3238, 36, 32);
        if (var9.field3021 != -1) {
            var13.method3981(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field3000 == 1) {
            class208 var22 = Statics.field3006;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class176.field2604 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class176.field2461 + "</col>";
            }
            var22.method3701(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2985.method2607(var18, var6);
        }
        class224.method3858(var14, var15, var16);
        class224.method3863(var17);
        class85.method1564();
        class85.field1441 = true;
        return var18;
    }

    @ObfuscatedName("gu.e(ZI)Z")
    public final boolean method3549(boolean arg0) {
        int var2 = this.field3010;
        int var3 = this.field3007;
        int var4 = this.field3026;
        if (arg0) {
            var2 = this.field3009;
            var3 = this.field3027;
            var4 = this.field3013;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2788.method3089(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2788.method3089(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2788.method3089(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("gu.j(ZB)Lbd;")
    public final class77 method3533(boolean arg0) {
        int var2 = this.field3010;
        int var3 = this.field3007;
        int var4 = this.field3026;
        if (arg0) {
            var2 = this.field3009;
            var3 = this.field3027;
            var4 = this.field3013;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var5 = class77.method1394(Statics.field2788, var2, 0);
        if (var3 != -1) {
            class77 var6 = class77.method1394(Statics.field2788, var3, 0);
            if (var4 == -1) {
                class77[] var9 = new class77[] { var5, var6 };
                var5 = new class77(var9, 2);
            } else {
                class77 var7 = class77.method1394(Statics.field2788, var4, 0);
                class77[] var8 = new class77[] { var5, var6, var7 };
                var5 = new class77(var8, 3);
            }
        }
        if (!arg0 && this.field3008 != 0) {
            var5.method1450(0, this.field3008, 0);
        }
        if (arg0 && this.field3011 != 0) {
            var5.method1450(0, this.field3011, 0);
        }
        if (this.field2990 != null) {
            for (int var10 = 0; var10 < this.field2990.length; var10++) {
                var5.method1406(this.field2990[var10], this.field2991[var10]);
            }
        }
        if (this.field2992 != null) {
            for (int var11 = 0; var11 < this.field2992.length; var11++) {
                var5.method1407(this.field2992[var11], this.field2993[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("gu.i(ZI)Z")
    public final boolean method3534(boolean arg0) {
        int var2 = this.field3014;
        int var3 = this.field3015;
        if (arg0) {
            var2 = this.field3012;
            var3 = this.field2976;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2788.method3089(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2788.method3089(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("gu.a(ZI)Lbd;")
    public final class77 method3535(boolean arg0) {
        int var2 = this.field3014;
        int var3 = this.field3015;
        if (arg0) {
            var2 = this.field3012;
            var3 = this.field2976;
        }
        if (var2 == -1) {
            return null;
        }
        class77 var4 = class77.method1394(Statics.field2788, var2, 0);
        if (var3 != -1) {
            class77 var5 = class77.method1394(Statics.field2788, var3, 0);
            class77[] var6 = new class77[] { var4, var5 };
            var4 = new class77(var6, 2);
        }
        if (this.field2990 != null) {
            for (int var7 = 0; var7 < this.field2990.length; var7++) {
                var4.method1406(this.field2990[var7], this.field2991[var7]);
            }
        }
        if (this.field2992 != null) {
            for (int var8 = 0; var8 < this.field2992.length; var8++) {
                var4.method1407(this.field2992[var8], this.field2993[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("gu.x(III)I")
    public int method3536(int arg0, int arg1) {
        return class197.method3195(this.field2989, arg0, arg1);
    }

    @ObfuscatedName("gu.h(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3537(int arg0, String arg1) {
        return Statics.method2910(this.field2989, arg0, arg1);
    }

    @ObfuscatedName("gu.b(I)I")
    public int method3563() {
        if (this.field3032 == -1 || this.field3004 == null) {
            return -1;
        } else if (this.field3032 >= 0) {
            return this.field3004[this.field3032] == null ? -1 : this.field3032;
        } else if (class176.field2360.equalsIgnoreCase(this.field3004[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("b.f(B)V")
    public static void method223() {
        field2985.method2603();
    }
}

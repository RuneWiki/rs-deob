package deob;

@ObfuscatedName("ag")
public class class45 extends class183 {

    @ObfuscatedName("ag.c")
    public static class172 field1024 = new class172(64);

    @ObfuscatedName("ag.n")
    public static class172 field1040 = new class172(50);

    @ObfuscatedName("ag.s")
    public static class172 field1041 = new class172(100);

    @ObfuscatedName("ag.w")
    public int field1010;

    @ObfuscatedName("ag.u")
    public int field1011;

    @ObfuscatedName("ag.d")
    public String field1012 = "null";

    @ObfuscatedName("ag.h")
    public short[] field1013;

    @ObfuscatedName("ag.a")
    public short[] field1014;

    @ObfuscatedName("ag.y")
    public short[] field1035;

    @ObfuscatedName("ag.v")
    public short[] field1016;

    @ObfuscatedName("ag.e")
    public int field1008 = 2000;

    @ObfuscatedName("ag.b")
    public int field1018 = 0;

    @ObfuscatedName("ag.z")
    public int field1019 = 0;

    @ObfuscatedName("ag.l")
    public int field1020 = 0;

    @ObfuscatedName("ag.t")
    public int field1021 = 0;

    @ObfuscatedName("ag.q")
    public int field1022 = 0;

    @ObfuscatedName("ag.j")
    public int field1023 = 0;

    @ObfuscatedName("ag.o")
    public int field1044 = 1;

    @ObfuscatedName("ag.i")
    public boolean field1025 = false;

    @ObfuscatedName("ag.m")
    public String[] field1050 = new String[] { null, null, class143.field2148, null, null };

    @ObfuscatedName("ag.f")
    public String[] field1027 = new String[] { null, null, null, null, class143.field2149 };

    @ObfuscatedName("ag.k")
    public int field1028 = -1;

    @ObfuscatedName("ag.an")
    public int field1017 = -1;

    @ObfuscatedName("ag.aw")
    public int field1030 = 0;

    @ObfuscatedName("ag.at")
    public int field1031 = -1;

    @ObfuscatedName("ag.al")
    public int field1032 = -1;

    @ObfuscatedName("ag.as")
    public int field1033 = 0;

    @ObfuscatedName("ag.ak")
    public int field1048 = -1;

    @ObfuscatedName("ag.aa")
    public int field1029 = -1;

    @ObfuscatedName("ag.ao")
    public int field1007 = -1;

    @ObfuscatedName("ag.af")
    public int field1037 = -1;

    @ObfuscatedName("ag.aj")
    public int field1006 = -1;

    @ObfuscatedName("ag.az")
    public int field1039 = -1;

    @ObfuscatedName("ag.ae")
    public int[] field1003;

    @ObfuscatedName("ag.av")
    public int[] field1005;

    @ObfuscatedName("ag.ax")
    public int field1042 = -1;

    @ObfuscatedName("ag.ai")
    public int field1043 = -1;

    @ObfuscatedName("ag.aq")
    public int field1034 = 128;

    @ObfuscatedName("ag.ad")
    public int field1045 = 128;

    @ObfuscatedName("ag.au")
    public int field1051 = 128;

    @ObfuscatedName("ag.ag")
    public int field1047 = 0;

    @ObfuscatedName("ag.ar")
    public int field1038 = 0;

    @ObfuscatedName("ag.am")
    public int field1049 = 0;

    @ObfuscatedName("b.p(Ler;Ler;ZLgk;B)V")
    public static void method155(class147 arg0, class147 arg1, boolean arg2, class194 arg3) {
        Statics.field1036 = arg0;
        Statics.field1004 = arg1;
        Statics.field1046 = arg2;
        Statics.field1036.method2796(10);
        Statics.field1009 = arg3;
    }

    @ObfuscatedName("at.g(II)Lag;")
    public static class45 method588(int arg0) {
        class45 var1 = (class45) field1024.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1036.method2855(10, arg0);
        class45 var3 = new class45();
        var3.field1010 = arg0;
        if (var2 != null) {
            var3.method880(new class107(var2));
        }
        var3.method879();
        if (var3.field1043 != -1) {
            var3.method882(method588(var3.field1043), method588(var3.field1042));
        }
        if (!Statics.field1046 && var3.field1025) {
            var3.field1012 = class143.field2381;
            var3.field1050 = null;
            var3.field1027 = null;
            var3.field1049 = 0;
        }
        field1024.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.x(I)V")
    public void method879() {
    }

    @ObfuscatedName("ag.c(Ldp;I)V")
    public void method880(class107 arg0) {
        while (true) {
            int var2 = arg0.method2173();
            if (var2 == 0) {
                return;
            }
            this.method881(arg0, var2);
        }
    }

    @ObfuscatedName("ag.n(Ldp;II)V")
    public void method881(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1011 = arg0.method2175();
        } else if (arg1 == 2) {
            this.field1012 = arg0.method2351();
        } else if (arg1 == 4) {
            this.field1008 = arg0.method2175();
        } else if (arg1 == 5) {
            this.field1018 = arg0.method2175();
        } else if (arg1 == 6) {
            this.field1019 = arg0.method2175();
        } else if (arg1 == 7) {
            this.field1021 = arg0.method2175();
            if (this.field1021 > 32767) {
                this.field1021 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1022 = arg0.method2175();
            if (this.field1022 > 32767) {
                this.field1022 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1023 = 1;
        } else if (arg1 == 12) {
            this.field1044 = arg0.method2305();
        } else if (arg1 == 16) {
            this.field1025 = true;
        } else if (arg1 == 23) {
            this.field1028 = arg0.method2175();
            this.field1030 = arg0.method2173();
        } else if (arg1 == 24) {
            this.field1017 = arg0.method2175();
        } else if (arg1 == 25) {
            this.field1031 = arg0.method2175();
            this.field1033 = arg0.method2173();
        } else if (arg1 == 26) {
            this.field1032 = arg0.method2175();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1050[arg1 - 30] = arg0.method2351();
            if (this.field1050[arg1 - 30].equalsIgnoreCase(class143.field2207)) {
                this.field1050[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1027[arg1 - 35] = arg0.method2351();
        } else if (arg1 == 40) {
            int var3 = arg0.method2173();
            this.field1013 = new short[var3];
            this.field1014 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1013[var4] = (short) arg0.method2175();
                this.field1014[var4] = (short) arg0.method2175();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2173();
            this.field1035 = new short[var5];
            this.field1016 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1035[var6] = (short) arg0.method2175();
                this.field1016[var6] = (short) arg0.method2175();
            }
        } else if (arg1 == 78) {
            this.field1048 = arg0.method2175();
        } else if (arg1 == 79) {
            this.field1029 = arg0.method2175();
        } else if (arg1 == 90) {
            this.field1007 = arg0.method2175();
        } else if (arg1 == 91) {
            this.field1006 = arg0.method2175();
        } else if (arg1 == 92) {
            this.field1037 = arg0.method2175();
        } else if (arg1 == 93) {
            this.field1039 = arg0.method2175();
        } else if (arg1 == 95) {
            this.field1020 = arg0.method2175();
        } else if (arg1 == 97) {
            this.field1042 = arg0.method2175();
        } else if (arg1 == 98) {
            this.field1043 = arg0.method2175();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1003 == null) {
                this.field1003 = new int[10];
                this.field1005 = new int[10];
            }
            this.field1003[arg1 - 100] = arg0.method2175();
            this.field1005[arg1 - 100] = arg0.method2175();
        } else if (arg1 == 110) {
            this.field1034 = arg0.method2175();
        } else if (arg1 == 111) {
            this.field1045 = arg0.method2175();
        } else if (arg1 == 112) {
            this.field1051 = arg0.method2175();
        } else if (arg1 == 113) {
            this.field1047 = arg0.method2174();
        } else if (arg1 == 114) {
            this.field1038 = arg0.method2174() * 5;
        } else if (arg1 == 115) {
            this.field1049 = arg0.method2173();
        }
    }

    @ObfuscatedName("ag.s(Lag;Lag;B)V")
    public void method882(class45 arg0, class45 arg1) {
        this.field1011 = arg0.field1011;
        this.field1008 = arg0.field1008;
        this.field1018 = arg0.field1018;
        this.field1019 = arg0.field1019;
        this.field1020 = arg0.field1020;
        this.field1021 = arg0.field1021;
        this.field1022 = arg0.field1022;
        this.field1013 = arg0.field1013;
        this.field1014 = arg0.field1014;
        this.field1035 = arg0.field1035;
        this.field1016 = arg0.field1016;
        this.field1012 = arg1.field1012;
        this.field1025 = arg1.field1025;
        this.field1044 = arg1.field1044;
        this.field1023 = 1;
    }

    @ObfuscatedName("ag.r(II)Lcq;")
    public final class93 method923(int arg0) {
        if (this.field1003 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1005[var3] && this.field1005[var3] != 0) {
                    var2 = this.field1003[var3];
                }
            }
            if (var2 != -1) {
                return method588(var2).method923(1);
            }
        }
        class93 var4 = class93.method1943(Statics.field1004, this.field1011, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1034 != 128 || this.field1045 != 128 || this.field1051 != 128) {
            var4.method1958(this.field1034, this.field1045, this.field1051);
        }
        if (this.field1013 != null) {
            for (int var5 = 0; var5 < this.field1013.length; var5++) {
                var4.method1955(this.field1013[var5], this.field1014[var5]);
            }
        }
        if (this.field1035 != null) {
            for (int var6 = 0; var6 < this.field1035.length; var6++) {
                var4.method1956(this.field1035[var6], this.field1016[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ag.w(II)Lcn;")
    public final class98 method878(int arg0) {
        if (this.field1003 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1005[var3] && this.field1005[var3] != 0) {
                    var2 = this.field1003[var3];
                }
            }
            if (var2 != -1) {
                return method588(var2).method878(1);
            }
        }
        class98 var4 = (class98) field1040.method3225((long) this.field1010);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1943(Statics.field1004, this.field1011, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1034 != 128 || this.field1045 != 128 || this.field1051 != 128) {
            var5.method1958(this.field1034, this.field1045, this.field1051);
        }
        if (this.field1013 != null) {
            for (int var6 = 0; var6 < this.field1013.length; var6++) {
                var5.method1955(this.field1013[var6], this.field1014[var6]);
            }
        }
        if (this.field1035 != null) {
            for (int var7 = 0; var7 < this.field1035.length; var7++) {
                var5.method1956(this.field1035[var7], this.field1016[var7]);
            }
        }
        class98 var8 = var5.method1952(this.field1047 + 64, this.field1038 + 768, -50, -10, -50);
        var8.field1719 = true;
        field1040.method3234(var8, (long) this.field1010);
        return var8;
    }

    @ObfuscatedName("ag.u(II)Lag;")
    public class45 method884(int arg0) {
        if (this.field1003 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1005[var3] && this.field1005[var3] != 0) {
                    var2 = this.field1003[var3];
                }
            }
            if (var2 != -1) {
                return method588(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("dy.d(IIIIZI)Lbs;")
    public static final class72 method2626(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1041.method3225(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method588(arg0);
        if (arg1 > 1 && var8.field1003 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1005[var10] && var8.field1005[var10] != 0) {
                    var9 = var8.field1003[var10];
                }
            }
            if (var9 != -1) {
                var8 = method588(var9);
            }
        }
        class98 var11 = var8.method878(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1043 != -1) {
            var12 = method2626(var8.field1042, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1322;
        int var14 = Statics.field1319;
        int var15 = Statics.field1318;
        int[] var16 = new int[4];
        class73.method1558(var16);
        class72 var17 = new class72(36, 32);
        class73.method1592(var17.field1312, 36, 32);
        class73.method1574();
        class84.method1835();
        class84.method1889(16, 16);
        class84.field1469 = false;
        int var18 = var8.field1008;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1489[var8.field1018] * var18 >> 16;
        int var20 = class84.field1470[var8.field1018] * var18 >> 16;
        var11.method2034();
        var11.method2086(0, var8.field1019, var8.field1020, var8.field1018, var8.field1021, var8.field1022 + var11.field1357 / 2 + var19, var8.field1022 + var20);
        if (arg2 >= 1) {
            var17.method1474(1);
        }
        if (arg2 >= 2) {
            var17.method1474(16777215);
        }
        if (arg3 != 0) {
            var17.method1482(arg3);
        }
        class73.method1592(var17.field1312, 36, 32);
        if (var8.field1043 != -1) {
            var12.method1478(0, 0);
        }
        if (!arg4 && (var8.field1023 == 1 || arg1 != 1) && arg1 != -1) {
            class194 var21 = Statics.field1009;
            String var22;
            if (arg1 < 100000) {
                var22 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var22 = "<col=ffffff>" + arg1 / 1000 + class143.field2362 + "</col>";
            } else {
                var22 = "<col=00ff80>" + arg1 / 1000000 + class143.field2309 + "</col>";
            }
            var21.method3397(var22, 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1041.method3234(var17, var5);
        }
        class73.method1592(var13, var14, var15);
        class73.method1557(var16);
        class84.method1835();
        class84.field1469 = true;
        return var17;
    }

    @ObfuscatedName("ag.h(ZI)Z")
    public final boolean method886(boolean arg0) {
        int var2 = this.field1028;
        int var3 = this.field1017;
        int var4 = this.field1048;
        if (arg0) {
            var2 = this.field1031;
            var3 = this.field1032;
            var4 = this.field1029;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1004.method2805(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1004.method2805(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1004.method2805(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ag.a(ZI)Lcq;")
    public final class93 method918(boolean arg0) {
        int var2 = this.field1028;
        int var3 = this.field1017;
        int var4 = this.field1048;
        if (arg0) {
            var2 = this.field1031;
            var3 = this.field1032;
            var4 = this.field1029;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1943(Statics.field1004, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1943(Statics.field1004, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1943(Statics.field1004, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1030 != 0) {
            var5.method1954(0, this.field1030, 0);
        }
        if (arg0 && this.field1033 != 0) {
            var5.method1954(0, this.field1033, 0);
        }
        if (this.field1013 != null) {
            for (int var10 = 0; var10 < this.field1013.length; var10++) {
                var5.method1955(this.field1013[var10], this.field1014[var10]);
            }
        }
        if (this.field1035 != null) {
            for (int var11 = 0; var11 < this.field1035.length; var11++) {
                var5.method1956(this.field1035[var11], this.field1016[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ag.y(ZB)Z")
    public final boolean method888(boolean arg0) {
        int var2 = this.field1007;
        int var3 = this.field1037;
        if (arg0) {
            var2 = this.field1006;
            var3 = this.field1039;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1004.method2805(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1004.method2805(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ag.v(ZI)Lcq;")
    public final class93 method889(boolean arg0) {
        int var2 = this.field1007;
        int var3 = this.field1037;
        if (arg0) {
            var2 = this.field1006;
            var3 = this.field1039;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1943(Statics.field1004, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1943(Statics.field1004, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1013 != null) {
            for (int var7 = 0; var7 < this.field1013.length; var7++) {
                var4.method1955(this.field1013[var7], this.field1014[var7]);
            }
        }
        if (this.field1035 != null) {
            for (int var8 = 0; var8 < this.field1035.length; var8++) {
                var4.method1956(this.field1035[var8], this.field1016[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bi.e(I)V")
    public static void method1362() {
        field1041.method3227();
    }

    @ObfuscatedName("m.b(ZI)V")
    public static void method539(boolean arg0) {
        if (Statics.field1046 != arg0) {
            field1024.method3227();
            field1040.method3227();
            field1041.method3227();
            Statics.field1046 = arg0;
        }
    }
}

package deob;

@ObfuscatedName("ah")
public class class45 extends class183 {

    @ObfuscatedName("ah.o")
    public static class172 field1021 = new class172(64);

    @ObfuscatedName("ah.k")
    public static class172 field1046 = new class172(50);

    @ObfuscatedName("ah.m")
    public static class172 field1013 = new class172(100);

    @ObfuscatedName("ah.t")
    public int field1005;

    @ObfuscatedName("ah.l")
    public int field1010;

    @ObfuscatedName("ah.p")
    public String field1011 = "null";

    @ObfuscatedName("ah.r")
    public short[] field1012;

    @ObfuscatedName("ah.j")
    public short[] field1048;

    @ObfuscatedName("ah.c")
    public short[] field1014;

    @ObfuscatedName("ah.q")
    public short[] field1015;

    @ObfuscatedName("ah.n")
    public int field1016 = 2000;

    @ObfuscatedName("ah.h")
    public int field1017 = 0;

    @ObfuscatedName("ah.d")
    public int field1018 = 0;

    @ObfuscatedName("ah.b")
    public int field1019 = 0;

    @ObfuscatedName("ah.w")
    public int field1020 = 0;

    @ObfuscatedName("ah.z")
    public int field1026 = 0;

    @ObfuscatedName("ah.x")
    public int field1022 = 0;

    @ObfuscatedName("ah.e")
    public int field1006 = 1;

    @ObfuscatedName("ah.a")
    public boolean field1024 = false;

    @ObfuscatedName("ah.y")
    public String[] field1025 = new String[] { null, null, class143.field2166, null, null };

    @ObfuscatedName("ah.f")
    public String[] field1034 = new String[] { null, null, null, null, class143.field2299 };

    @ObfuscatedName("ah.u")
    public int field1027 = -1;

    @ObfuscatedName("ah.ab")
    public int field1028 = -1;

    @ObfuscatedName("ah.ai")
    public int field1043 = 0;

    @ObfuscatedName("ah.aj")
    public int field1008 = -1;

    @ObfuscatedName("ah.as")
    public int field1031 = -1;

    @ObfuscatedName("ah.ax")
    public int field1032 = 0;

    @ObfuscatedName("ah.ac")
    public int field1033 = -1;

    @ObfuscatedName("ah.az")
    public int field1004 = -1;

    @ObfuscatedName("ah.au")
    public int field1035 = -1;

    @ObfuscatedName("ah.av")
    public int field1036 = -1;

    @ObfuscatedName("ah.am")
    public int field1037 = -1;

    @ObfuscatedName("ah.ao")
    public int field1038 = -1;

    @ObfuscatedName("ah.aq")
    public int[] field1039;

    @ObfuscatedName("ah.ay")
    public int[] field1050;

    @ObfuscatedName("ah.an")
    public int field1041 = -1;

    @ObfuscatedName("ah.ak")
    public int field1042 = -1;

    @ObfuscatedName("ah.ae")
    public int field1023 = 128;

    @ObfuscatedName("ah.ad")
    public int field1044 = 128;

    @ObfuscatedName("ah.aw")
    public int field1045 = 128;

    @ObfuscatedName("ah.ah")
    public int field1009 = 0;

    @ObfuscatedName("ah.at")
    public int field1047 = 0;

    @ObfuscatedName("ah.aa")
    public int field1030 = 0;

    @ObfuscatedName("da.g(IB)Lah;")
    public static class45 method2351(int arg0) {
        class45 var1 = (class45) field1021.method3112((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1029.method2703(10, arg0);
        class45 var3 = new class45();
        var3.field1005 = arg0;
        if (var2 != null) {
            var3.method838(new class107(var2));
        }
        var3.method843();
        if (var3.field1042 != -1) {
            var3.method859(method2351(var3.field1042), method2351(var3.field1041));
        }
        if (!Statics.field2686 && var3.field1024) {
            var3.field1011 = class143.field2306;
            var3.field1025 = null;
            var3.field1034 = null;
            var3.field1030 = 0;
        }
        field1021.method3115(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.s(I)V")
    public void method843() {
    }

    @ObfuscatedName("ah.v(Lde;B)V")
    public void method838(class107 arg0) {
        while (true) {
            int var2 = arg0.method2116();
            if (var2 == 0) {
                return;
            }
            this.method836(arg0, var2);
        }
    }

    @ObfuscatedName("ah.o(Lde;IB)V")
    public void method836(class107 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1010 = arg0.method2094();
        } else if (arg1 == 2) {
            this.field1011 = arg0.method2100();
        } else if (arg1 == 4) {
            this.field1016 = arg0.method2094();
        } else if (arg1 == 5) {
            this.field1017 = arg0.method2094();
        } else if (arg1 == 6) {
            this.field1018 = arg0.method2094();
        } else if (arg1 == 7) {
            this.field1020 = arg0.method2094();
            if (this.field1020 > 32767) {
                this.field1020 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1026 = arg0.method2094();
            if (this.field1026 > 32767) {
                this.field1026 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1022 = 1;
        } else if (arg1 == 12) {
            this.field1006 = arg0.method2097();
        } else if (arg1 == 16) {
            this.field1024 = true;
        } else if (arg1 == 23) {
            this.field1027 = arg0.method2094();
            this.field1043 = arg0.method2116();
        } else if (arg1 == 24) {
            this.field1028 = arg0.method2094();
        } else if (arg1 == 25) {
            this.field1008 = arg0.method2094();
            this.field1032 = arg0.method2116();
        } else if (arg1 == 26) {
            this.field1031 = arg0.method2094();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1025[arg1 - 30] = arg0.method2100();
            if (this.field1025[arg1 - 30].equalsIgnoreCase(class143.field2168)) {
                this.field1025[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1034[arg1 - 35] = arg0.method2100();
        } else if (arg1 == 40) {
            int var3 = arg0.method2116();
            this.field1012 = new short[var3];
            this.field1048 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1012[var4] = (short) arg0.method2094();
                this.field1048[var4] = (short) arg0.method2094();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2116();
            this.field1014 = new short[var5];
            this.field1015 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1014[var6] = (short) arg0.method2094();
                this.field1015[var6] = (short) arg0.method2094();
            }
        } else if (arg1 == 78) {
            this.field1033 = arg0.method2094();
        } else if (arg1 == 79) {
            this.field1004 = arg0.method2094();
        } else if (arg1 == 90) {
            this.field1035 = arg0.method2094();
        } else if (arg1 == 91) {
            this.field1037 = arg0.method2094();
        } else if (arg1 == 92) {
            this.field1036 = arg0.method2094();
        } else if (arg1 == 93) {
            this.field1038 = arg0.method2094();
        } else if (arg1 == 95) {
            this.field1019 = arg0.method2094();
        } else if (arg1 == 97) {
            this.field1041 = arg0.method2094();
        } else if (arg1 == 98) {
            this.field1042 = arg0.method2094();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1039 == null) {
                this.field1039 = new int[10];
                this.field1050 = new int[10];
            }
            this.field1039[arg1 - 100] = arg0.method2094();
            this.field1050[arg1 - 100] = arg0.method2094();
        } else if (arg1 == 110) {
            this.field1023 = arg0.method2094();
        } else if (arg1 == 111) {
            this.field1044 = arg0.method2094();
        } else if (arg1 == 112) {
            this.field1045 = arg0.method2094();
        } else if (arg1 == 113) {
            this.field1009 = arg0.method2093();
        } else if (arg1 == 114) {
            this.field1047 = arg0.method2093();
        } else if (arg1 == 115) {
            this.field1030 = arg0.method2116();
        }
    }

    @ObfuscatedName("ah.k(Lah;Lah;I)V")
    public void method859(class45 arg0, class45 arg1) {
        this.field1010 = arg0.field1010;
        this.field1016 = arg0.field1016;
        this.field1017 = arg0.field1017;
        this.field1018 = arg0.field1018;
        this.field1019 = arg0.field1019;
        this.field1020 = arg0.field1020;
        this.field1026 = arg0.field1026;
        this.field1012 = arg0.field1012;
        this.field1048 = arg0.field1048;
        this.field1014 = arg0.field1014;
        this.field1015 = arg0.field1015;
        this.field1011 = arg1.field1011;
        this.field1024 = arg1.field1024;
        this.field1006 = arg1.field1006;
        this.field1022 = 1;
    }

    @ObfuscatedName("ah.m(II)Lcn;")
    public final class93 method842(int arg0) {
        if (this.field1039 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1050[var3] && this.field1050[var3] != 0) {
                    var2 = this.field1039[var3];
                }
            }
            if (var2 != -1) {
                return method2351(var2).method842(1);
            }
        }
        class93 var4 = class93.method1890(Statics.field1007, this.field1010, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1023 != 128 || this.field1044 != 128 || this.field1045 != 128) {
            var4.method1862(this.field1023, this.field1044, this.field1045);
        }
        if (this.field1012 != null) {
            for (int var5 = 0; var5 < this.field1012.length; var5++) {
                var4.method1859(this.field1012[var5], this.field1048[var5]);
            }
        }
        if (this.field1014 != null) {
            for (int var6 = 0; var6 < this.field1014.length; var6++) {
                var4.method1860(this.field1014[var6], this.field1015[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ah.i(II)Lcg;")
    public final class98 method840(int arg0) {
        if (this.field1039 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1050[var3] && this.field1050[var3] != 0) {
                    var2 = this.field1039[var3];
                }
            }
            if (var2 != -1) {
                return method2351(var2).method840(1);
            }
        }
        class98 var4 = (class98) field1046.method3112((long) this.field1005);
        if (var4 != null) {
            return var4;
        }
        class93 var5 = class93.method1890(Statics.field1007, this.field1010, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1023 != 128 || this.field1044 != 128 || this.field1045 != 128) {
            var5.method1862(this.field1023, this.field1044, this.field1045);
        }
        if (this.field1012 != null) {
            for (int var6 = 0; var6 < this.field1012.length; var6++) {
                var5.method1859(this.field1012[var6], this.field1048[var6]);
            }
        }
        if (this.field1014 != null) {
            for (int var7 = 0; var7 < this.field1014.length; var7++) {
                var5.method1860(this.field1014[var7], this.field1015[var7]);
            }
        }
        class98 var8 = var5.method1867(this.field1009 + 64, this.field1047 * 5 + 768, -50, -10, -50);
        var8.field1734 = true;
        field1046.method3115(var8, (long) this.field1005);
        return var8;
    }

    @ObfuscatedName("ah.t(II)Lah;")
    public class45 method856(int arg0) {
        if (this.field1039 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1050[var3] && this.field1050[var3] != 0) {
                    var2 = this.field1039[var3];
                }
            }
            if (var2 != -1) {
                return method2351(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("v.l(IIIIZI)Lbr;")
    public static final class72 method25(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        long var5 = ((long) arg3 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg4) {
            class72 var7 = (class72) field1013.method3112(var5);
            if (var7 != null) {
                return var7;
            }
        }
        class45 var8 = method2351(arg0);
        if (arg1 > 1 && var8.field1039 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg1 >= var8.field1050[var10] && var8.field1050[var10] != 0) {
                    var9 = var8.field1039[var10];
                }
            }
            if (var9 != -1) {
                var8 = method2351(var9);
            }
        }
        class98 var11 = var8.method840(1);
        if (var11 == null) {
            return null;
        }
        class72 var12 = null;
        if (var8.field1042 != -1) {
            var12 = method25(var8.field1041, 10, 1, 0, true);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = Statics.field1318;
        int var14 = Statics.field1320;
        int var15 = Statics.field1319;
        int[] var16 = new int[4];
        class73.method1478(var16);
        class72 var17 = new class72(36, 32);
        class73.method1477(var17.field1307, 36, 32);
        class73.method1480();
        class84.method1768();
        class84.method1744(16, 16);
        class84.field1470 = false;
        int var18 = var8.field1016;
        if (arg4) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class84.field1490[var8.field1017] * var18 >> 16;
        int var20 = class84.field1491[var8.field1017] * var18 >> 16;
        var11.method1950();
        var11.method1962(0, var8.field1018, var8.field1019, var8.field1017, var8.field1020, var8.field1026 + var11.field1353 / 2 + var19, var8.field1026 + var20);
        if (arg2 >= 1) {
            var17.method1425(1);
        }
        if (arg2 >= 2) {
            var17.method1425(16777215);
        }
        if (arg3 != 0) {
            var17.method1392(arg3);
        }
        class73.method1477(var17.field1307, 36, 32);
        if (var8.field1042 != -1) {
            var12.method1385(0, 0);
        }
        if (!arg4 && (var8.field1022 == 1 || arg1 != 1) && arg1 != -1) {
            Statics.field142.method3396(method2628(arg1), 0, 9, 16776960, 1);
        }
        if (!arg4) {
            field1013.method3115(var17, var5);
        }
        class73.method1477(var13, var14, var15);
        class73.method1479(var16);
        class84.method1768();
        class84.field1470 = true;
        return var17;
    }

    @ObfuscatedName("er.p(II)Ljava/lang/String;")
    public static final String method2628(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class143.field2329 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class143.field2327 + "</col>";
        }
    }

    @ObfuscatedName("ah.r(ZI)Z")
    public final boolean method847(boolean arg0) {
        int var2 = this.field1027;
        int var3 = this.field1028;
        int var4 = this.field1033;
        if (arg0) {
            var2 = this.field1008;
            var3 = this.field1031;
            var4 = this.field1004;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1007.method2687(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1007.method2687(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1007.method2687(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ah.j(ZS)Lcn;")
    public final class93 method864(boolean arg0) {
        int var2 = this.field1027;
        int var3 = this.field1028;
        int var4 = this.field1033;
        if (arg0) {
            var2 = this.field1008;
            var3 = this.field1031;
            var4 = this.field1004;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var5 = class93.method1890(Statics.field1007, var2, 0);
        if (var3 != -1) {
            class93 var6 = class93.method1890(Statics.field1007, var3, 0);
            if (var4 == -1) {
                class93[] var9 = new class93[] { var5, var6 };
                var5 = new class93(var9, 2);
            } else {
                class93 var7 = class93.method1890(Statics.field1007, var4, 0);
                class93[] var8 = new class93[] { var5, var6, var7 };
                var5 = new class93(var8, 3);
            }
        }
        if (!arg0 && this.field1043 != 0) {
            var5.method1858(0, this.field1043, 0);
        }
        if (arg0 && this.field1032 != 0) {
            var5.method1858(0, this.field1032, 0);
        }
        if (this.field1012 != null) {
            for (int var10 = 0; var10 < this.field1012.length; var10++) {
                var5.method1859(this.field1012[var10], this.field1048[var10]);
            }
        }
        if (this.field1014 != null) {
            for (int var11 = 0; var11 < this.field1014.length; var11++) {
                var5.method1860(this.field1014[var11], this.field1015[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ah.c(ZI)Z")
    public final boolean method845(boolean arg0) {
        int var2 = this.field1035;
        int var3 = this.field1036;
        if (arg0) {
            var2 = this.field1037;
            var3 = this.field1038;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1007.method2687(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1007.method2687(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ah.q(ZB)Lcn;")
    public final class93 method846(boolean arg0) {
        int var2 = this.field1035;
        int var3 = this.field1036;
        if (arg0) {
            var2 = this.field1037;
            var3 = this.field1038;
        }
        if (var2 == -1) {
            return null;
        }
        class93 var4 = class93.method1890(Statics.field1007, var2, 0);
        if (var3 != -1) {
            class93 var5 = class93.method1890(Statics.field1007, var3, 0);
            class93[] var6 = new class93[] { var4, var5 };
            var4 = new class93(var6, 2);
        }
        if (this.field1012 != null) {
            for (int var7 = 0; var7 < this.field1012.length; var7++) {
                var4.method1859(this.field1012[var7], this.field1048[var7]);
            }
        }
        if (this.field1014 != null) {
            for (int var8 = 0; var8 < this.field1014.length; var8++) {
                var4.method1860(this.field1014[var8], this.field1015[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cx.n(B)V")
    public static void method2044() {
        field1021.method3116();
        field1046.method3116();
        field1013.method3116();
    }

    @ObfuscatedName("a.h(ZI)V")
    public static void method495(boolean arg0) {
        if (Statics.field2686 != arg0) {
            method2044();
            Statics.field2686 = arg0;
        }
    }
}

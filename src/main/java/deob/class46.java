package deob;

@ObfuscatedName("aq")
public class class46 extends class185 {

    @ObfuscatedName("aq.k")
    public static class174 field1018 = new class174(64);

    @ObfuscatedName("aq.g")
    public static class174 field1019 = new class174(50);

    @ObfuscatedName("aq.v")
    public static class174 field1020 = new class174(100);

    @ObfuscatedName("aq.x")
    public int field1021;

    @ObfuscatedName("aq.h")
    public int field1022;

    @ObfuscatedName("aq.w")
    public String field1026 = "null";

    @ObfuscatedName("aq.s")
    public short[] field1024;

    @ObfuscatedName("aq.p")
    public short[] field1025;

    @ObfuscatedName("aq.z")
    public short[] field1054;

    @ObfuscatedName("aq.n")
    public short[] field1061;

    @ObfuscatedName("aq.u")
    public int field1016 = 2000;

    @ObfuscatedName("aq.a")
    public int field1041 = 0;

    @ObfuscatedName("aq.d")
    public int field1015 = 0;

    @ObfuscatedName("aq.m")
    public int field1031 = 0;

    @ObfuscatedName("aq.q")
    public int field1032 = 0;

    @ObfuscatedName("aq.e")
    public int field1027 = 0;

    @ObfuscatedName("aq.t")
    public int field1034 = 0;

    @ObfuscatedName("aq.o")
    public int field1035 = 1;

    @ObfuscatedName("aq.at")
    public boolean field1036 = false;

    @ObfuscatedName("aq.ag")
    public String[] field1033 = new String[] { null, null, class145.field2151, null, null };

    @ObfuscatedName("aq.ae")
    public String[] field1038 = new String[] { null, null, null, null, class145.field2152 };

    @ObfuscatedName("aq.ak")
    public int field1039 = -1;

    @ObfuscatedName("aq.ap")
    public int field1040 = -1;

    @ObfuscatedName("aq.ao")
    public int field1059 = 0;

    @ObfuscatedName("aq.ac")
    public int field1042 = -1;

    @ObfuscatedName("aq.as")
    public int field1043 = -1;

    @ObfuscatedName("aq.ai")
    public int field1063 = 0;

    @ObfuscatedName("aq.ab")
    public int field1028 = -1;

    @ObfuscatedName("aq.an")
    public int field1046 = -1;

    @ObfuscatedName("aq.ah")
    public int field1030 = -1;

    @ObfuscatedName("aq.ad")
    public int field1048 = -1;

    @ObfuscatedName("aq.af")
    public int field1012 = -1;

    @ObfuscatedName("aq.aj")
    public int field1050 = -1;

    @ObfuscatedName("aq.am")
    public int[] field1051;

    @ObfuscatedName("aq.ay")
    public int[] field1052;

    @ObfuscatedName("aq.au")
    public int field1053 = -1;

    @ObfuscatedName("aq.aa")
    public int field1062 = -1;

    @ObfuscatedName("aq.aq")
    public int field1055 = 128;

    @ObfuscatedName("aq.av")
    public int field1056 = 128;

    @ObfuscatedName("aq.aw")
    public int field1057 = 128;

    @ObfuscatedName("aq.az")
    public int field1058 = 0;

    @ObfuscatedName("aq.al")
    public int field1047 = 0;

    @ObfuscatedName("aq.ar")
    public int field1060 = 0;

    @ObfuscatedName("aq.ax")
    public boolean field1037 = false;

    @ObfuscatedName("dt.c(Ler;Ler;ZLgt;I)V")
    public static void method2484(class149 arg0, class149 arg1, boolean arg2, class205 arg3) {
        Statics.field1014 = arg0;
        Statics.field1029 = arg1;
        Statics.field1017 = arg2;
        Statics.field1448 = Statics.field1014.method2756(10);
        Statics.field2899 = arg3;
    }

    @ObfuscatedName("x.j(IB)Laq;")
    public static class46 method114(int arg0) {
        class46 var1 = (class46) field1018.method3178((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1014.method2746(10, arg0);
        class46 var3 = new class46();
        var3.field1021 = arg0;
        if (var2 != null) {
            var3.method834(new class108(var2));
        }
        var3.method833();
        if (var3.field1062 != -1) {
            var3.method836(method114(var3.field1062), method114(var3.field1053));
        }
        if (!Statics.field1017 && var3.field1036) {
            var3.field1026 = class145.field2338;
            var3.field1037 = false;
            var3.field1033 = null;
            var3.field1038 = null;
            var3.field1060 = 0;
        }
        field1018.method3167(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.y(I)V")
    public void method833() {
    }

    @ObfuscatedName("aq.r(Ldx;I)V")
    public void method834(class108 arg0) {
        while (true) {
            int var2 = arg0.method2134();
            if (var2 == 0) {
                return;
            }
            this.method835(arg0, var2);
        }
    }

    @ObfuscatedName("aq.f(Ldx;II)V")
    public void method835(class108 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1022 = arg0.method2136();
        } else if (arg1 == 2) {
            this.field1026 = arg0.method2216();
        } else if (arg1 == 4) {
            this.field1016 = arg0.method2136();
        } else if (arg1 == 5) {
            this.field1041 = arg0.method2136();
        } else if (arg1 == 6) {
            this.field1015 = arg0.method2136();
        } else if (arg1 == 7) {
            this.field1032 = arg0.method2136();
            if (this.field1032 > 32767) {
                this.field1032 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1027 = arg0.method2136();
            if (this.field1027 > 32767) {
                this.field1027 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1034 = 1;
        } else if (arg1 == 12) {
            this.field1035 = arg0.method2144();
        } else if (arg1 == 16) {
            this.field1036 = true;
        } else if (arg1 == 23) {
            this.field1039 = arg0.method2136();
            this.field1059 = arg0.method2134();
        } else if (arg1 == 24) {
            this.field1040 = arg0.method2136();
        } else if (arg1 == 25) {
            this.field1042 = arg0.method2136();
            this.field1063 = arg0.method2134();
        } else if (arg1 == 26) {
            this.field1043 = arg0.method2136();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1033[arg1 - 30] = arg0.method2216();
            if (this.field1033[arg1 - 30].equalsIgnoreCase(class145.field2153)) {
                this.field1033[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1038[arg1 - 35] = arg0.method2216();
        } else if (arg1 == 40) {
            int var3 = arg0.method2134();
            this.field1024 = new short[var3];
            this.field1025 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1024[var4] = (short) arg0.method2136();
                this.field1025[var4] = (short) arg0.method2136();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2134();
            this.field1054 = new short[var5];
            this.field1061 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1054[var6] = (short) arg0.method2136();
                this.field1061[var6] = (short) arg0.method2136();
            }
        } else if (arg1 == 65) {
            this.field1037 = true;
        } else if (arg1 == 78) {
            this.field1028 = arg0.method2136();
        } else if (arg1 == 79) {
            this.field1046 = arg0.method2136();
        } else if (arg1 == 90) {
            this.field1030 = arg0.method2136();
        } else if (arg1 == 91) {
            this.field1012 = arg0.method2136();
        } else if (arg1 == 92) {
            this.field1048 = arg0.method2136();
        } else if (arg1 == 93) {
            this.field1050 = arg0.method2136();
        } else if (arg1 == 95) {
            this.field1031 = arg0.method2136();
        } else if (arg1 == 97) {
            this.field1053 = arg0.method2136();
        } else if (arg1 == 98) {
            this.field1062 = arg0.method2136();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1051 == null) {
                this.field1051 = new int[10];
                this.field1052 = new int[10];
            }
            this.field1051[arg1 - 100] = arg0.method2136();
            this.field1052[arg1 - 100] = arg0.method2136();
        } else if (arg1 == 110) {
            this.field1055 = arg0.method2136();
        } else if (arg1 == 111) {
            this.field1056 = arg0.method2136();
        } else if (arg1 == 112) {
            this.field1057 = arg0.method2136();
        } else if (arg1 == 113) {
            this.field1058 = arg0.method2229();
        } else if (arg1 == 114) {
            this.field1047 = arg0.method2229() * 5;
        } else if (arg1 == 115) {
            this.field1060 = arg0.method2134();
        }
    }

    @ObfuscatedName("aq.l(Laq;Laq;I)V")
    public void method836(class46 arg0, class46 arg1) {
        this.field1022 = arg0.field1022;
        this.field1016 = arg0.field1016;
        this.field1041 = arg0.field1041;
        this.field1015 = arg0.field1015;
        this.field1031 = arg0.field1031;
        this.field1032 = arg0.field1032;
        this.field1027 = arg0.field1027;
        this.field1024 = arg0.field1024;
        this.field1025 = arg0.field1025;
        this.field1054 = arg0.field1054;
        this.field1061 = arg0.field1061;
        this.field1026 = arg1.field1026;
        this.field1036 = arg1.field1036;
        this.field1035 = arg1.field1035;
        this.field1034 = 1;
    }

    @ObfuscatedName("aq.b(II)Lce;")
    public final class94 method873(int arg0) {
        if (this.field1051 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1052[var3] && this.field1052[var3] != 0) {
                    var2 = this.field1051[var3];
                }
            }
            if (var2 != -1) {
                return method114(var2).method873(1);
            }
        }
        class94 var4 = class94.method1955(Statics.field1029, this.field1022, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1055 != 128 || this.field1056 != 128 || this.field1057 != 128) {
            var4.method1917(this.field1055, this.field1056, this.field1057);
        }
        if (this.field1024 != null) {
            for (int var5 = 0; var5 < this.field1024.length; var5++) {
                var4.method1914(this.field1024[var5], this.field1025[var5]);
            }
        }
        if (this.field1054 != null) {
            for (int var6 = 0; var6 < this.field1054.length; var6++) {
                var4.method1915(this.field1054[var6], this.field1061[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.k(II)Lcl;")
    public final class99 method884(int arg0) {
        if (this.field1051 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1052[var3] && this.field1052[var3] != 0) {
                    var2 = this.field1051[var3];
                }
            }
            if (var2 != -1) {
                return method114(var2).method884(1);
            }
        }
        class99 var4 = (class99) field1019.method3178((long) this.field1021);
        if (var4 != null) {
            return var4;
        }
        class94 var5 = class94.method1955(Statics.field1029, this.field1022, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1055 != 128 || this.field1056 != 128 || this.field1057 != 128) {
            var5.method1917(this.field1055, this.field1056, this.field1057);
        }
        if (this.field1024 != null) {
            for (int var6 = 0; var6 < this.field1024.length; var6++) {
                var5.method1914(this.field1024[var6], this.field1025[var6]);
            }
        }
        if (this.field1054 != null) {
            for (int var7 = 0; var7 < this.field1054.length; var7++) {
                var5.method1915(this.field1054[var7], this.field1061[var7]);
            }
        }
        class99 var8 = var5.method1922(this.field1058 + 64, this.field1047 + 768, -50, -10, -50);
        var8.field1702 = true;
        field1019.method3167(var8, (long) this.field1021);
        return var8;
    }

    @ObfuscatedName("aq.g(II)Laq;")
    public class46 method839(int arg0) {
        if (this.field1051 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1052[var3] && this.field1052[var3] != 0) {
                    var2 = this.field1051[var3];
                }
            }
            if (var2 != -1) {
                return method114(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("am.v(IIIIIZB)Lbj;")
    public static final class73 method790(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class73 var8 = (class73) field1020.method3178(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class46 var9 = method114(arg0);
        if (arg1 > 1 && var9.field1051 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1052[var11] && var9.field1052[var11] != 0) {
                    var10 = var9.field1051[var11];
                }
            }
            if (var10 != -1) {
                var9 = method114(var10);
            }
        }
        class99 var12 = var9.method884(1);
        if (var12 == null) {
            return null;
        }
        class73 var13 = null;
        if (var9.field1062 != -1) {
            var13 = method790(var9.field1053, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1312;
        int var15 = Statics.field1306;
        int var16 = Statics.field1307;
        int[] var17 = new int[4];
        class74.method1526(var17);
        class73 var18 = new class73(36, 32);
        class74.method1522(var18.field1298, 36, 32);
        class74.method1528();
        class85.method1843();
        class85.method1809(16, 16);
        class85.field1467 = false;
        int var19 = var9.field1016;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class85.field1472[var9.field1041] * var19 >> 16;
        int var21 = class85.field1473[var9.field1041] * var19 >> 16;
        var12.method2022();
        var12.method1999(0, var9.field1015, var9.field1031, var9.field1041, var9.field1032, var9.field1027 + var12.field1347 / 2 + var20, var9.field1027 + var21);
        if (arg2 >= 1) {
            var18.method1433(1);
        }
        if (arg2 >= 2) {
            var18.method1433(16777215);
        }
        if (arg3 != 0) {
            var18.method1436(arg3);
        }
        class74.method1522(var18.field1298, 36, 32);
        if (var9.field1062 != -1) {
            var13.method1507(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1034 == 1) {
            class205 var22 = Statics.field2899;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class145.field2192 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class145.field2312 + "</col>";
            }
            var22.method3497(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1020.method3167(var18, var6);
        }
        class74.method1522(var14, var15, var16);
        class74.method1578(var17);
        class85.method1843();
        class85.field1467 = true;
        return var18;
    }

    @ObfuscatedName("aq.i(ZI)Z")
    public final boolean method840(boolean arg0) {
        int var2 = this.field1039;
        int var3 = this.field1040;
        int var4 = this.field1028;
        if (arg0) {
            var2 = this.field1042;
            var3 = this.field1043;
            var4 = this.field1046;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1029.method2777(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1029.method2777(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1029.method2777(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aq.x(ZI)Lce;")
    public final class94 method841(boolean arg0) {
        int var2 = this.field1039;
        int var3 = this.field1040;
        int var4 = this.field1028;
        if (arg0) {
            var2 = this.field1042;
            var3 = this.field1043;
            var4 = this.field1046;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var5 = class94.method1955(Statics.field1029, var2, 0);
        if (var3 != -1) {
            class94 var6 = class94.method1955(Statics.field1029, var3, 0);
            if (var4 == -1) {
                class94[] var9 = new class94[] { var5, var6 };
                var5 = new class94(var9, 2);
            } else {
                class94 var7 = class94.method1955(Statics.field1029, var4, 0);
                class94[] var8 = new class94[] { var5, var6, var7 };
                var5 = new class94(var8, 3);
            }
        }
        if (!arg0 && this.field1059 != 0) {
            var5.method1910(0, this.field1059, 0);
        }
        if (arg0 && this.field1063 != 0) {
            var5.method1910(0, this.field1063, 0);
        }
        if (this.field1024 != null) {
            for (int var10 = 0; var10 < this.field1024.length; var10++) {
                var5.method1914(this.field1024[var10], this.field1025[var10]);
            }
        }
        if (this.field1054 != null) {
            for (int var11 = 0; var11 < this.field1054.length; var11++) {
                var5.method1915(this.field1054[var11], this.field1061[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aq.h(ZB)Z")
    public final boolean method842(boolean arg0) {
        int var2 = this.field1030;
        int var3 = this.field1048;
        if (arg0) {
            var2 = this.field1012;
            var3 = this.field1050;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1029.method2777(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1029.method2777(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aq.w(ZB)Lce;")
    public final class94 method858(boolean arg0) {
        int var2 = this.field1030;
        int var3 = this.field1048;
        if (arg0) {
            var2 = this.field1012;
            var3 = this.field1050;
        }
        if (var2 == -1) {
            return null;
        }
        class94 var4 = class94.method1955(Statics.field1029, var2, 0);
        if (var3 != -1) {
            class94 var5 = class94.method1955(Statics.field1029, var3, 0);
            class94[] var6 = new class94[] { var4, var5 };
            var4 = new class94(var6, 2);
        }
        if (this.field1024 != null) {
            for (int var7 = 0; var7 < this.field1024.length; var7++) {
                var4.method1914(this.field1024[var7], this.field1025[var7]);
            }
        }
        if (this.field1054 != null) {
            for (int var8 = 0; var8 < this.field1054.length; var8++) {
                var4.method1915(this.field1054[var8], this.field1061[var8]);
            }
        }
        return var4;
    }
}

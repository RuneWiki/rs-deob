package deob;

@ObfuscatedName("ag")
public class class47 extends class195 {

    @ObfuscatedName("ag.y")
    public static class184 field1033 = new class184(64);

    @ObfuscatedName("ag.k")
    public static class184 field1030 = new class184(50);

    @ObfuscatedName("ag.c")
    public static class184 field1035 = new class184(200);

    @ObfuscatedName("ag.m")
    public int field1037;

    @ObfuscatedName("ag.a")
    public int field1038;

    @ObfuscatedName("ag.f")
    public String field1075 = "null";

    @ObfuscatedName("ag.i")
    public short[] field1040;

    @ObfuscatedName("ag.n")
    public short[] field1041;

    @ObfuscatedName("ag.x")
    public short[] field1042;

    @ObfuscatedName("ag.h")
    public short[] field1043;

    @ObfuscatedName("ag.t")
    public int field1059 = 2000;

    @ObfuscatedName("ag.w")
    public int field1045 = 0;

    @ObfuscatedName("ag.p")
    public int field1046 = 0;

    @ObfuscatedName("ag.z")
    public int field1047 = 0;

    @ObfuscatedName("ag.s")
    public int field1070 = 0;

    @ObfuscatedName("ag.d")
    public int field1049 = 0;

    @ObfuscatedName("ag.b")
    public int field1080 = 0;

    @ObfuscatedName("ag.e")
    public int field1051 = 1;

    @ObfuscatedName("ag.ar")
    public boolean field1057 = false;

    @ObfuscatedName("ag.av")
    public String[] field1053 = new String[] { null, null, class148.field2413, null, null };

    @ObfuscatedName("ag.ae")
    public String[] field1054 = new String[] { null, null, null, null, class148.field2199 };

    @ObfuscatedName("ag.aq")
    public int field1077 = -1;

    @ObfuscatedName("ag.ay")
    public int field1062 = -1;

    @ObfuscatedName("ag.ac")
    public int field1064 = 0;

    @ObfuscatedName("ag.ao")
    public int field1058 = -1;

    @ObfuscatedName("ag.ab")
    public int field1028 = -1;

    @ObfuscatedName("ag.at")
    public int field1060 = 0;

    @ObfuscatedName("ag.ai")
    public int field1061 = -1;

    @ObfuscatedName("ag.aa")
    public int field1029 = -1;

    @ObfuscatedName("ag.ap")
    public int field1063 = -1;

    @ObfuscatedName("ag.ad")
    public int field1052 = -1;

    @ObfuscatedName("ag.aw")
    public int field1065 = -1;

    @ObfuscatedName("ag.ax")
    public int field1076 = -1;

    @ObfuscatedName("ag.az")
    public int[] field1067;

    @ObfuscatedName("ag.af")
    public int[] field1068;

    @ObfuscatedName("ag.al")
    public int field1056 = -1;

    @ObfuscatedName("ag.ak")
    public int field1066 = -1;

    @ObfuscatedName("ag.as")
    public int field1071 = 128;

    @ObfuscatedName("ag.ag")
    public int field1072 = 128;

    @ObfuscatedName("ag.an")
    public int field1073 = 128;

    @ObfuscatedName("ag.au")
    public int field1074 = 0;

    @ObfuscatedName("ag.am")
    public int field1069 = 0;

    @ObfuscatedName("ag.aj")
    public int field1036 = 0;

    @ObfuscatedName("ag.ah")
    public boolean field1050 = false;

    @ObfuscatedName("ag.ba")
    public int field1078 = -1;

    @ObfuscatedName("ag.bm")
    public int field1079 = -1;

    @ObfuscatedName("ev.o(IS)Lag;")
    public static class47 method2700(int arg0) {
        class47 var1 = (class47) field1033.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1031.method2940(10, arg0);
        class47 var3 = new class47();
        var3.field1037 = arg0;
        if (var2 != null) {
            var3.method921(new class111(var2));
        }
        var3.method920();
        if (var3.field1066 != -1) {
            var3.method923(method2700(var3.field1066), method2700(var3.field1056));
        }
        if (var3.field1079 != -1) {
            var3.method924(method2700(var3.field1079), method2700(var3.field1078));
        }
        if (!Statics.field1834 && var3.field1057) {
            var3.field1075 = class148.field2306;
            var3.field1050 = false;
            var3.field1053 = null;
            var3.field1054 = null;
            var3.field1036 = 0;
        }
        field1033.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.l(I)V")
    public void method920() {
    }

    @ObfuscatedName("ag.g(Ldk;I)V")
    public void method921(class111 arg0) {
        while (true) {
            int var2 = arg0.method2219();
            if (var2 == 0) {
                return;
            }
            this.method952(arg0, var2);
        }
    }

    @ObfuscatedName("ag.u(Ldk;II)V")
    public void method952(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1038 = arg0.method2397();
        } else if (arg1 == 2) {
            this.field1075 = arg0.method2339();
        } else if (arg1 == 4) {
            this.field1059 = arg0.method2397();
        } else if (arg1 == 5) {
            this.field1045 = arg0.method2397();
        } else if (arg1 == 6) {
            this.field1046 = arg0.method2397();
        } else if (arg1 == 7) {
            this.field1070 = arg0.method2397();
            if (this.field1070 > 32767) {
                this.field1070 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1049 = arg0.method2397();
            if (this.field1049 > 32767) {
                this.field1049 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1080 = 1;
        } else if (arg1 == 12) {
            this.field1051 = arg0.method2273();
        } else if (arg1 == 16) {
            this.field1057 = true;
        } else if (arg1 == 23) {
            this.field1077 = arg0.method2397();
            this.field1064 = arg0.method2219();
        } else if (arg1 == 24) {
            this.field1062 = arg0.method2397();
        } else if (arg1 == 25) {
            this.field1058 = arg0.method2397();
            this.field1060 = arg0.method2219();
        } else if (arg1 == 26) {
            this.field1028 = arg0.method2397();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1053[arg1 - 30] = arg0.method2339();
            if (this.field1053[arg1 - 30].equalsIgnoreCase(class148.field2429)) {
                this.field1053[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1054[arg1 - 35] = arg0.method2339();
        } else if (arg1 == 40) {
            int var3 = arg0.method2219();
            this.field1040 = new short[var3];
            this.field1041 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1040[var4] = (short) arg0.method2397();
                this.field1041[var4] = (short) arg0.method2397();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2219();
            this.field1042 = new short[var5];
            this.field1043 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1042[var6] = (short) arg0.method2397();
                this.field1043[var6] = (short) arg0.method2397();
            }
        } else if (arg1 == 65) {
            this.field1050 = true;
        } else if (arg1 == 78) {
            this.field1061 = arg0.method2397();
        } else if (arg1 == 79) {
            this.field1029 = arg0.method2397();
        } else if (arg1 == 90) {
            this.field1063 = arg0.method2397();
        } else if (arg1 == 91) {
            this.field1065 = arg0.method2397();
        } else if (arg1 == 92) {
            this.field1052 = arg0.method2397();
        } else if (arg1 == 93) {
            this.field1076 = arg0.method2397();
        } else if (arg1 == 95) {
            this.field1047 = arg0.method2397();
        } else if (arg1 == 97) {
            this.field1056 = arg0.method2397();
        } else if (arg1 == 98) {
            this.field1066 = arg0.method2397();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1067 == null) {
                this.field1067 = new int[10];
                this.field1068 = new int[10];
            }
            this.field1067[arg1 - 100] = arg0.method2397();
            this.field1068[arg1 - 100] = arg0.method2397();
        } else if (arg1 == 110) {
            this.field1071 = arg0.method2397();
        } else if (arg1 == 111) {
            this.field1072 = arg0.method2397();
        } else if (arg1 == 112) {
            this.field1073 = arg0.method2397();
        } else if (arg1 == 113) {
            this.field1074 = arg0.method2220();
        } else if (arg1 == 114) {
            this.field1069 = arg0.method2220();
        } else if (arg1 == 115) {
            this.field1036 = arg0.method2219();
        } else if (arg1 == 139) {
            this.field1078 = arg0.method2397();
        } else if (arg1 == 140) {
            this.field1079 = arg0.method2397();
        }
    }

    @ObfuscatedName("ag.q(Lag;Lag;I)V")
    public void method923(class47 arg0, class47 arg1) {
        this.field1038 = arg0.field1038;
        this.field1059 = arg0.field1059;
        this.field1045 = arg0.field1045;
        this.field1046 = arg0.field1046;
        this.field1047 = arg0.field1047;
        this.field1070 = arg0.field1070;
        this.field1049 = arg0.field1049;
        this.field1040 = arg0.field1040;
        this.field1041 = arg0.field1041;
        this.field1042 = arg0.field1042;
        this.field1043 = arg0.field1043;
        this.field1075 = arg1.field1075;
        this.field1057 = arg1.field1057;
        this.field1051 = arg1.field1051;
        this.field1080 = 1;
    }

    @ObfuscatedName("ag.r(Lag;Lag;I)V")
    public void method924(class47 arg0, class47 arg1) {
        this.field1038 = arg0.field1038;
        this.field1059 = arg0.field1059;
        this.field1045 = arg0.field1045;
        this.field1046 = arg0.field1046;
        this.field1047 = arg0.field1047;
        this.field1070 = arg0.field1070;
        this.field1049 = arg0.field1049;
        this.field1040 = arg1.field1040;
        this.field1041 = arg1.field1041;
        this.field1042 = arg1.field1042;
        this.field1043 = arg1.field1043;
        this.field1075 = arg1.field1075;
        this.field1057 = arg1.field1057;
        this.field1080 = arg1.field1080;
        this.field1077 = arg1.field1077;
        this.field1062 = arg1.field1062;
        this.field1061 = arg1.field1061;
        this.field1058 = arg1.field1058;
        this.field1028 = arg1.field1028;
        this.field1029 = arg1.field1029;
        this.field1063 = arg1.field1063;
        this.field1052 = arg1.field1052;
        this.field1065 = arg1.field1065;
        this.field1076 = arg1.field1076;
        this.field1036 = arg1.field1036;
        this.field1053 = arg1.field1053;
        this.field1054 = new String[5];
        if (arg1.field1054 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1054[var3] = arg1.field1054[var3];
            }
        }
        this.field1054[4] = class148.field2204;
        this.field1051 = 0;
    }

    @ObfuscatedName("ag.v(II)Lcl;")
    public final class95 method925(int arg0) {
        if (this.field1067 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1068[var3] && this.field1068[var3] != 0) {
                    var2 = this.field1067[var3];
                }
            }
            if (var2 != -1) {
                return method2700(var2).method925(1);
            }
        }
        class95 var4 = class95.method1967(Statics.field1032, this.field1038, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1071 != 128 || this.field1072 != 128 || this.field1073 != 128) {
            var4.method1974(this.field1071, this.field1072, this.field1073);
        }
        if (this.field1040 != null) {
            for (int var5 = 0; var5 < this.field1040.length; var5++) {
                var4.method1971(this.field1040[var5], this.field1041[var5]);
            }
        }
        if (this.field1042 != null) {
            for (int var6 = 0; var6 < this.field1042.length; var6++) {
                var4.method1979(this.field1042[var6], this.field1043[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ag.y(IB)Lcq;")
    public final class100 method926(int arg0) {
        if (this.field1067 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1068[var3] && this.field1068[var3] != 0) {
                    var2 = this.field1067[var3];
                }
            }
            if (var2 != -1) {
                return method2700(var2).method926(1);
            }
        }
        class100 var4 = (class100) field1030.method3401((long) this.field1037);
        if (var4 != null) {
            return var4;
        }
        class95 var5 = class95.method1967(Statics.field1032, this.field1038, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1071 != 128 || this.field1072 != 128 || this.field1073 != 128) {
            var5.method1974(this.field1071, this.field1072, this.field1073);
        }
        if (this.field1040 != null) {
            for (int var6 = 0; var6 < this.field1040.length; var6++) {
                var5.method1971(this.field1040[var6], this.field1041[var6]);
            }
        }
        if (this.field1042 != null) {
            for (int var7 = 0; var7 < this.field1042.length; var7++) {
                var5.method1979(this.field1042[var7], this.field1043[var7]);
            }
        }
        class100 var8 = var5.method1983(this.field1074 + 64, this.field1069 * 5 + 768, -50, -10, -50);
        var8.field1714 = true;
        field1030.method3403(var8, (long) this.field1037);
        return var8;
    }

    @ObfuscatedName("ag.k(II)Lag;")
    public class47 method927(int arg0) {
        if (this.field1067 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1068[var3] && this.field1068[var3] != 0) {
                    var2 = this.field1067[var3];
                }
            }
            if (var2 != -1) {
                return method2700(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("o.c(IIIIIZI)Lbc;")
    public static final class74 method1(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class74 var8 = (class74) field1035.method3401(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class47 var9 = method2700(arg0);
        if (arg1 > 1 && var9.field1067 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1068[var11] && var9.field1068[var11] != 0) {
                    var10 = var9.field1067[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2700(var10);
            }
        }
        class100 var12 = var9.method926(1);
        if (var12 == null) {
            return null;
        }
        class74 var13 = null;
        if (var9.field1066 != -1) {
            var13 = method1(var9.field1056, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1079 != -1) {
            var13 = method1(var9.field1078, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1341;
        int var15 = Statics.field1337;
        int var16 = Statics.field1338;
        int[] var17 = new int[4];
        class75.method1588(var17);
        class74 var18 = new class74(36, 32);
        class75.method1584(var18.field1330, 36, 32);
        class75.method1590();
        class86.method1849();
        class86.method1868(16, 16);
        class86.field1502 = false;
        int var19 = var9.field1059;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class86.field1501[var9.field1045] * var19 >> 16;
        int var21 = class86.field1478[var9.field1045] * var19 >> 16;
        var12.method2050();
        var12.method2061(0, var9.field1046, var9.field1047, var9.field1045, var9.field1070, var9.field1049 + var12.field1376 / 2 + var20, var9.field1049 + var21);
        if (var9.field1079 != -1) {
            var13.method1489(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1492(1);
        }
        if (arg2 >= 2) {
            var18.method1492(16777215);
        }
        if (arg3 != 0) {
            var18.method1493(arg3);
        }
        class75.method1584(var18.field1330, 36, 32);
        if (var9.field1066 != -1) {
            var13.method1489(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1080 == 1) {
            Statics.field1055.method3656(method2536(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1035.method3403(var18, var6);
        }
        class75.method1584(var14, var15, var16);
        class75.method1589(var17);
        class86.method1849();
        class86.field1502 = true;
        return var18;
    }

    @ObfuscatedName("dj.j(II)Ljava/lang/String;")
    public static final String method2536(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class148.field2362 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class148.field2244 + "</col>";
        }
    }

    @ObfuscatedName("ag.m(ZB)Z")
    public final boolean method928(boolean arg0) {
        int var2 = this.field1077;
        int var3 = this.field1062;
        int var4 = this.field1061;
        if (arg0) {
            var2 = this.field1058;
            var3 = this.field1028;
            var4 = this.field1029;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1032.method2978(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1032.method2978(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1032.method2978(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ag.a(ZI)Lcl;")
    public final class95 method936(boolean arg0) {
        int var2 = this.field1077;
        int var3 = this.field1062;
        int var4 = this.field1061;
        if (arg0) {
            var2 = this.field1058;
            var3 = this.field1028;
            var4 = this.field1029;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var5 = class95.method1967(Statics.field1032, var2, 0);
        if (var3 != -1) {
            class95 var6 = class95.method1967(Statics.field1032, var3, 0);
            if (var4 == -1) {
                class95[] var9 = new class95[] { var5, var6 };
                var5 = new class95(var9, 2);
            } else {
                class95 var7 = class95.method1967(Statics.field1032, var4, 0);
                class95[] var8 = new class95[] { var5, var6, var7 };
                var5 = new class95(var8, 3);
            }
        }
        if (!arg0 && this.field1064 != 0) {
            var5.method1981(0, this.field1064, 0);
        }
        if (arg0 && this.field1060 != 0) {
            var5.method1981(0, this.field1060, 0);
        }
        if (this.field1040 != null) {
            for (int var10 = 0; var10 < this.field1040.length; var10++) {
                var5.method1971(this.field1040[var10], this.field1041[var10]);
            }
        }
        if (this.field1042 != null) {
            for (int var11 = 0; var11 < this.field1042.length; var11++) {
                var5.method1979(this.field1042[var11], this.field1043[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ag.f(ZI)Z")
    public final boolean method929(boolean arg0) {
        int var2 = this.field1063;
        int var3 = this.field1052;
        if (arg0) {
            var2 = this.field1065;
            var3 = this.field1076;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1032.method2978(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1032.method2978(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ag.i(ZI)Lcl;")
    public final class95 method965(boolean arg0) {
        int var2 = this.field1063;
        int var3 = this.field1052;
        if (arg0) {
            var2 = this.field1065;
            var3 = this.field1076;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var4 = class95.method1967(Statics.field1032, var2, 0);
        if (var3 != -1) {
            class95 var5 = class95.method1967(Statics.field1032, var3, 0);
            class95[] var6 = new class95[] { var4, var5 };
            var4 = new class95(var6, 2);
        }
        if (this.field1040 != null) {
            for (int var7 = 0; var7 < this.field1040.length; var7++) {
                var4.method1971(this.field1040[var7], this.field1041[var7]);
            }
        }
        if (this.field1042 != null) {
            for (int var8 = 0; var8 < this.field1042.length; var8++) {
                var4.method1979(this.field1042[var8], this.field1043[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ao.n(I)V")
    public static void method632() {
        field1033.method3404();
        field1030.method3404();
        field1035.method3404();
    }

    @ObfuscatedName("h.x(ZI)V")
    public static void method180(boolean arg0) {
        if (Statics.field1834 != arg0) {
            field1033.method3404();
            field1030.method3404();
            field1035.method3404();
            Statics.field1834 = arg0;
        }
    }
}

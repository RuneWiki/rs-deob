package deob;

@ObfuscatedName("ah")
public class class47 extends class195 {

    @ObfuscatedName("ah.c")
    public static class184 field1064 = new class184(64);

    @ObfuscatedName("ah.d")
    public static class184 field1051 = new class184(50);

    @ObfuscatedName("ah.v")
    public static class184 field1065 = new class184(200);

    @ObfuscatedName("ah.h")
    public int field1054;

    @ObfuscatedName("ah.n")
    public int field1055;

    @ObfuscatedName("ah.x")
    public String field1056 = "null";

    @ObfuscatedName("ah.o")
    public short[] field1053;

    @ObfuscatedName("ah.r")
    public short[] field1052;

    @ObfuscatedName("ah.y")
    public short[] field1073;

    @ObfuscatedName("ah.i")
    public short[] field1101;

    @ObfuscatedName("ah.q")
    public int field1061 = 2000;

    @ObfuscatedName("ah.g")
    public int field1062 = 0;

    @ObfuscatedName("ah.l")
    public int field1063 = 0;

    @ObfuscatedName("ah.u")
    public int field1057 = 0;

    @ObfuscatedName("ah.j")
    public int field1049 = 0;

    @ObfuscatedName("ah.z")
    public int field1066 = 0;

    @ObfuscatedName("ah.b")
    public int field1067 = 0;

    @ObfuscatedName("ah.a")
    public int field1068 = 1;

    @ObfuscatedName("ah.ag")
    public boolean field1069 = false;

    @ObfuscatedName("ah.am")
    public String[] field1090 = new String[] { null, null, class148.field2485, null, null };

    @ObfuscatedName("ah.aa")
    public String[] field1071 = new String[] { null, null, null, null, class148.field2214 };

    @ObfuscatedName("ah.az")
    public int field1072 = -1;

    @ObfuscatedName("ah.aq")
    public int field1070 = -1;

    @ObfuscatedName("ah.ak")
    public int field1074 = 0;

    @ObfuscatedName("ah.ar")
    public int field1075 = -1;

    @ObfuscatedName("ah.al")
    public int field1076 = -1;

    @ObfuscatedName("ah.au")
    public int field1077 = 0;

    @ObfuscatedName("ah.ao")
    public int field1078 = -1;

    @ObfuscatedName("ah.af")
    public int field1086 = -1;

    @ObfuscatedName("ah.ai")
    public int field1080 = -1;

    @ObfuscatedName("ah.aj")
    public int field1081 = -1;

    @ObfuscatedName("ah.aw")
    public int field1082 = -1;

    @ObfuscatedName("ah.ab")
    public int field1083 = -1;

    @ObfuscatedName("ah.ad")
    public int[] field1084;

    @ObfuscatedName("ah.ae")
    public int[] field1085;

    @ObfuscatedName("ah.ay")
    public int field1048 = -1;

    @ObfuscatedName("ah.ap")
    public int field1087 = -1;

    @ObfuscatedName("ah.av")
    public int field1088 = 128;

    @ObfuscatedName("ah.ah")
    public int field1100 = 128;

    @ObfuscatedName("ah.at")
    public int field1046 = 128;

    @ObfuscatedName("ah.an")
    public int field1091 = 0;

    @ObfuscatedName("ah.ac")
    public int field1092 = 0;

    @ObfuscatedName("ah.as")
    public int field1093 = 0;

    @ObfuscatedName("ah.ax")
    public boolean field1060 = false;

    @ObfuscatedName("ah.bg")
    public int field1095 = -1;

    @ObfuscatedName("ah.bw")
    public int field1096 = -1;

    @ObfuscatedName("o.p(Lff;Lff;ZLhp;I)V")
    public static void method162(class158 arg0, class158 arg1, boolean arg2, class215 arg3) {
        Statics.field1865 = arg0;
        Statics.field3067 = arg1;
        Statics.field1050 = arg2;
        Statics.field659 = Statics.field1865.method2904(10);
        Statics.field1058 = arg3;
    }

    @ObfuscatedName("dh.k(IB)Lah;")
    public static class47 method2450(int arg0) {
        class47 var1 = (class47) field1064.method3371((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1865.method2896(10, arg0);
        class47 var3 = new class47();
        var3.field1054 = arg0;
        if (var2 != null) {
            var3.method887(new class111(var2));
        }
        var3.method886();
        if (var3.field1087 != -1) {
            var3.method889(method2450(var3.field1087), method2450(var3.field1048));
        }
        if (var3.field1096 != -1) {
            var3.method890(method2450(var3.field1096), method2450(var3.field1095));
        }
        if (!Statics.field1050 && var3.field1069) {
            var3.field1056 = class148.field2480;
            var3.field1060 = false;
            var3.field1090 = null;
            var3.field1071 = null;
            var3.field1093 = 0;
        }
        field1064.method3370(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.e(I)V")
    public void method886() {
    }

    @ObfuscatedName("ah.f(Lde;I)V")
    public void method887(class111 arg0) {
        while (true) {
            int var2 = arg0.method2314();
            if (var2 == 0) {
                return;
            }
            this.method888(arg0, var2);
        }
    }

    @ObfuscatedName("ah.w(Lde;IB)V")
    public void method888(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1055 = arg0.method2177();
        } else if (arg1 == 2) {
            this.field1056 = arg0.method2265();
        } else if (arg1 == 4) {
            this.field1061 = arg0.method2177();
        } else if (arg1 == 5) {
            this.field1062 = arg0.method2177();
        } else if (arg1 == 6) {
            this.field1063 = arg0.method2177();
        } else if (arg1 == 7) {
            this.field1049 = arg0.method2177();
            if (this.field1049 > 32767) {
                this.field1049 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1066 = arg0.method2177();
            if (this.field1066 > 32767) {
                this.field1066 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1067 = 1;
        } else if (arg1 == 12) {
            this.field1068 = arg0.method2350();
        } else if (arg1 == 16) {
            this.field1069 = true;
        } else if (arg1 == 23) {
            this.field1072 = arg0.method2177();
            this.field1074 = arg0.method2314();
        } else if (arg1 == 24) {
            this.field1070 = arg0.method2177();
        } else if (arg1 == 25) {
            this.field1075 = arg0.method2177();
            this.field1077 = arg0.method2314();
        } else if (arg1 == 26) {
            this.field1076 = arg0.method2177();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1090[arg1 - 30] = arg0.method2265();
            if (this.field1090[arg1 - 30].equalsIgnoreCase(class148.field2215)) {
                this.field1090[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1071[arg1 - 35] = arg0.method2265();
        } else if (arg1 == 40) {
            int var3 = arg0.method2314();
            this.field1053 = new short[var3];
            this.field1052 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1053[var4] = (short) arg0.method2177();
                this.field1052[var4] = (short) arg0.method2177();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2314();
            this.field1073 = new short[var5];
            this.field1101 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1073[var6] = (short) arg0.method2177();
                this.field1101[var6] = (short) arg0.method2177();
            }
        } else if (arg1 == 65) {
            this.field1060 = true;
        } else if (arg1 == 78) {
            this.field1078 = arg0.method2177();
        } else if (arg1 == 79) {
            this.field1086 = arg0.method2177();
        } else if (arg1 == 90) {
            this.field1080 = arg0.method2177();
        } else if (arg1 == 91) {
            this.field1082 = arg0.method2177();
        } else if (arg1 == 92) {
            this.field1081 = arg0.method2177();
        } else if (arg1 == 93) {
            this.field1083 = arg0.method2177();
        } else if (arg1 == 95) {
            this.field1057 = arg0.method2177();
        } else if (arg1 == 97) {
            this.field1048 = arg0.method2177();
        } else if (arg1 == 98) {
            this.field1087 = arg0.method2177();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1084 == null) {
                this.field1084 = new int[10];
                this.field1085 = new int[10];
            }
            this.field1084[arg1 - 100] = arg0.method2177();
            this.field1085[arg1 - 100] = arg0.method2177();
        } else if (arg1 == 110) {
            this.field1088 = arg0.method2177();
        } else if (arg1 == 111) {
            this.field1100 = arg0.method2177();
        } else if (arg1 == 112) {
            this.field1046 = arg0.method2177();
        } else if (arg1 == 113) {
            this.field1091 = arg0.method2176();
        } else if (arg1 == 114) {
            this.field1092 = arg0.method2176() * 5;
        } else if (arg1 == 115) {
            this.field1093 = arg0.method2314();
        } else if (arg1 == 139) {
            this.field1095 = arg0.method2177();
        } else if (arg1 == 140) {
            this.field1096 = arg0.method2177();
        }
    }

    @ObfuscatedName("ah.t(Lah;Lah;I)V")
    public void method889(class47 arg0, class47 arg1) {
        this.field1055 = arg0.field1055;
        this.field1061 = arg0.field1061;
        this.field1062 = arg0.field1062;
        this.field1063 = arg0.field1063;
        this.field1057 = arg0.field1057;
        this.field1049 = arg0.field1049;
        this.field1066 = arg0.field1066;
        this.field1053 = arg0.field1053;
        this.field1052 = arg0.field1052;
        this.field1073 = arg0.field1073;
        this.field1101 = arg0.field1101;
        this.field1056 = arg1.field1056;
        this.field1069 = arg1.field1069;
        this.field1068 = arg1.field1068;
        this.field1067 = 1;
    }

    @ObfuscatedName("ah.s(Lah;Lah;B)V")
    public void method890(class47 arg0, class47 arg1) {
        this.field1055 = arg0.field1055;
        this.field1061 = arg0.field1061;
        this.field1062 = arg0.field1062;
        this.field1063 = arg0.field1063;
        this.field1057 = arg0.field1057;
        this.field1049 = arg0.field1049;
        this.field1066 = arg0.field1066;
        this.field1053 = arg1.field1053;
        this.field1052 = arg1.field1052;
        this.field1073 = arg1.field1073;
        this.field1101 = arg1.field1101;
        this.field1056 = arg1.field1056;
        this.field1069 = arg1.field1069;
        this.field1067 = arg1.field1067;
        this.field1072 = arg1.field1072;
        this.field1070 = arg1.field1070;
        this.field1078 = arg1.field1078;
        this.field1075 = arg1.field1075;
        this.field1076 = arg1.field1076;
        this.field1086 = arg1.field1086;
        this.field1080 = arg1.field1080;
        this.field1081 = arg1.field1081;
        this.field1082 = arg1.field1082;
        this.field1083 = arg1.field1083;
        this.field1093 = arg1.field1093;
        this.field1090 = arg1.field1090;
        this.field1071 = new String[5];
        if (arg1.field1071 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1071[var3] = arg1.field1071[var3];
            }
        }
        this.field1071[4] = class148.field2219;
        this.field1068 = 0;
    }

    @ObfuscatedName("ah.c(IB)Lcv;")
    public final class95 method891(int arg0) {
        if (this.field1084 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1085[var3] && this.field1085[var3] != 0) {
                    var2 = this.field1084[var3];
                }
            }
            if (var2 != -1) {
                return method2450(var2).method891(1);
            }
        }
        class95 var4 = class95.method1916(Statics.field3067, this.field1055, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1088 != 128 || this.field1100 != 128 || this.field1046 != 128) {
            var4.method1932(this.field1088, this.field1100, this.field1046);
        }
        if (this.field1053 != null) {
            for (int var5 = 0; var5 < this.field1053.length; var5++) {
                var4.method1929(this.field1053[var5], this.field1052[var5]);
            }
        }
        if (this.field1073 != null) {
            for (int var6 = 0; var6 < this.field1073.length; var6++) {
                var4.method1930(this.field1073[var6], this.field1101[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ah.d(II)Lcm;")
    public final class100 method885(int arg0) {
        if (this.field1084 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1085[var3] && this.field1085[var3] != 0) {
                    var2 = this.field1084[var3];
                }
            }
            if (var2 != -1) {
                return method2450(var2).method885(1);
            }
        }
        class100 var4 = (class100) field1051.method3371((long) this.field1054);
        if (var4 != null) {
            return var4;
        }
        class95 var5 = class95.method1916(Statics.field3067, this.field1055, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1088 != 128 || this.field1100 != 128 || this.field1046 != 128) {
            var5.method1932(this.field1088, this.field1100, this.field1046);
        }
        if (this.field1053 != null) {
            for (int var6 = 0; var6 < this.field1053.length; var6++) {
                var5.method1929(this.field1053[var6], this.field1052[var6]);
            }
        }
        if (this.field1073 != null) {
            for (int var7 = 0; var7 < this.field1073.length; var7++) {
                var5.method1930(this.field1073[var7], this.field1101[var7]);
            }
        }
        class100 var8 = var5.method1937(this.field1091 + 64, this.field1092 + 768, -50, -10, -50);
        var8.field1755 = true;
        field1051.method3370(var8, (long) this.field1054);
        return var8;
    }

    @ObfuscatedName("ah.v(IB)Lah;")
    public class47 method921(int arg0) {
        if (this.field1084 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1085[var3] && this.field1085[var3] != 0) {
                    var2 = this.field1084[var3];
                }
            }
            if (var2 != -1) {
                return method2450(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("j.m(IIIIIZB)Lbr;")
    public static final class74 method517(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class74 var8 = (class74) field1065.method3371(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class47 var9 = method2450(arg0);
        if (arg1 > 1 && var9.field1084 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1085[var11] && var9.field1085[var11] != 0) {
                    var10 = var9.field1084[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2450(var10);
            }
        }
        class100 var12 = var9.method885(1);
        if (var12 == null) {
            return null;
        }
        class74 var13 = null;
        if (var9.field1087 != -1) {
            var13 = method517(var9.field1048, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1096 != -1) {
            var13 = method517(var9.field1095, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1355;
        int var15 = Statics.field1351;
        int var16 = Statics.field1352;
        int[] var17 = new int[4];
        class75.method1565(var17);
        class74 var18 = new class74(36, 32);
        class75.method1533(var18.field1344, 36, 32);
        class75.method1547();
        class86.method1804();
        class86.method1807(16, 16);
        class86.field1499 = false;
        int var19 = var9.field1061;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class86.field1519[var9.field1062] * var19 >> 16;
        int var21 = class86.field1516[var9.field1062] * var19 >> 16;
        var12.method2053();
        var12.method2039(0, var9.field1063, var9.field1057, var9.field1062, var9.field1049, var9.field1066 + var12.field1390 / 2 + var20, var9.field1066 + var21);
        if (var9.field1096 != -1) {
            var13.method1455(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1451(1);
        }
        if (arg2 >= 2) {
            var18.method1451(16777215);
        }
        if (arg3 != 0) {
            var18.method1458(arg3);
        }
        class75.method1533(var18.field1344, 36, 32);
        if (var9.field1087 != -1) {
            var13.method1455(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1067 == 1) {
            Statics.field1058.method3622(method588(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1065.method3370(var18, var6);
        }
        class75.method1533(var14, var15, var16);
        class75.method1538(var17);
        class86.method1804();
        class86.field1499 = true;
        return var18;
    }

    @ObfuscatedName("aa.h(II)Ljava/lang/String;")
    public static final String method588(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class148.field2377 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class148.field2375 + "</col>";
        }
    }

    @ObfuscatedName("ah.n(ZI)Z")
    public final boolean method906(boolean arg0) {
        int var2 = this.field1072;
        int var3 = this.field1070;
        int var4 = this.field1078;
        if (arg0) {
            var2 = this.field1075;
            var3 = this.field1076;
            var4 = this.field1086;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3067.method2898(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3067.method2898(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3067.method2898(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ah.x(ZB)Lcv;")
    public final class95 method894(boolean arg0) {
        int var2 = this.field1072;
        int var3 = this.field1070;
        int var4 = this.field1078;
        if (arg0) {
            var2 = this.field1075;
            var3 = this.field1076;
            var4 = this.field1086;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var5 = class95.method1916(Statics.field3067, var2, 0);
        if (var3 != -1) {
            class95 var6 = class95.method1916(Statics.field3067, var3, 0);
            if (var4 == -1) {
                class95[] var9 = new class95[] { var5, var6 };
                var5 = new class95(var9, 2);
            } else {
                class95 var7 = class95.method1916(Statics.field3067, var4, 0);
                class95[] var8 = new class95[] { var5, var6, var7 };
                var5 = new class95(var8, 3);
            }
        }
        if (!arg0 && this.field1074 != 0) {
            var5.method1928(0, this.field1074, 0);
        }
        if (arg0 && this.field1077 != 0) {
            var5.method1928(0, this.field1077, 0);
        }
        if (this.field1053 != null) {
            for (int var10 = 0; var10 < this.field1053.length; var10++) {
                var5.method1929(this.field1053[var10], this.field1052[var10]);
            }
        }
        if (this.field1073 != null) {
            for (int var11 = 0; var11 < this.field1073.length; var11++) {
                var5.method1930(this.field1073[var11], this.field1101[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ah.o(ZI)Z")
    public final boolean method895(boolean arg0) {
        int var2 = this.field1080;
        int var3 = this.field1081;
        if (arg0) {
            var2 = this.field1082;
            var3 = this.field1083;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3067.method2898(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3067.method2898(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ah.r(ZI)Lcv;")
    public final class95 method896(boolean arg0) {
        int var2 = this.field1080;
        int var3 = this.field1081;
        if (arg0) {
            var2 = this.field1082;
            var3 = this.field1083;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var4 = class95.method1916(Statics.field3067, var2, 0);
        if (var3 != -1) {
            class95 var5 = class95.method1916(Statics.field3067, var3, 0);
            class95[] var6 = new class95[] { var4, var5 };
            var4 = new class95(var6, 2);
        }
        if (this.field1053 != null) {
            for (int var7 = 0; var7 < this.field1053.length; var7++) {
                var4.method1929(this.field1053[var7], this.field1052[var7]);
            }
        }
        if (this.field1073 != null) {
            for (int var8 = 0; var8 < this.field1073.length; var8++) {
                var4.method1930(this.field1073[var8], this.field1101[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("w.y(I)V")
    public static void method38() {
        field1064.method3374();
        field1051.method3374();
        field1065.method3374();
    }

    @ObfuscatedName("dl.i(I)V")
    public static void method2495() {
        field1065.method3374();
    }
}

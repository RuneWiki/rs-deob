package deob;

@ObfuscatedName("ad")
public class class47 extends class195 {

    @ObfuscatedName("ad.r")
    public static class184 field1063 = new class184(64);

    @ObfuscatedName("ad.l")
    public static class184 field1064 = new class184(50);

    @ObfuscatedName("ad.f")
    public static class184 field1065 = new class184(200);

    @ObfuscatedName("ad.z")
    public int field1066;

    @ObfuscatedName("ad.v")
    public int field1067;

    @ObfuscatedName("ad.x")
    public String field1078 = "null";

    @ObfuscatedName("ad.q")
    public short[] field1069;

    @ObfuscatedName("ad.b")
    public short[] field1070;

    @ObfuscatedName("ad.u")
    public short[] field1097;

    @ObfuscatedName("ad.t")
    public short[] field1072;

    @ObfuscatedName("ad.s")
    public int field1073 = 2000;

    @ObfuscatedName("ad.p")
    public int field1074 = 0;

    @ObfuscatedName("ad.d")
    public int field1087 = 0;

    @ObfuscatedName("ad.j")
    public int field1062 = 0;

    @ObfuscatedName("ad.k")
    public int field1077 = 0;

    @ObfuscatedName("ad.y")
    public int field1086 = 0;

    @ObfuscatedName("ad.c")
    public int field1079 = 0;

    @ObfuscatedName("ad.g")
    public int field1071 = 1;

    @ObfuscatedName("ad.av")
    public boolean field1081 = false;

    @ObfuscatedName("ad.ag")
    public String[] field1108 = new String[] { null, null, class148.field2309, null, null };

    @ObfuscatedName("ad.aq")
    public String[] field1083 = new String[] { null, null, null, null, class148.field2213 };

    @ObfuscatedName("ad.an")
    public int field1076 = -1;

    @ObfuscatedName("ad.ao")
    public int field1085 = -1;

    @ObfuscatedName("ad.aj")
    public int field1082 = 0;

    @ObfuscatedName("ad.ax")
    public int field1109 = -1;

    @ObfuscatedName("ad.ac")
    public int field1089 = -1;

    @ObfuscatedName("ad.al")
    public int field1096 = 0;

    @ObfuscatedName("ad.au")
    public int field1090 = -1;

    @ObfuscatedName("ad.ap")
    public int field1091 = -1;

    @ObfuscatedName("ad.ar")
    public int field1092 = -1;

    @ObfuscatedName("ad.ah")
    public int field1093 = -1;

    @ObfuscatedName("ad.ae")
    public int field1094 = -1;

    @ObfuscatedName("ad.ay")
    public int field1095 = -1;

    @ObfuscatedName("ad.ab")
    public int[] field1084;

    @ObfuscatedName("ad.at")
    public int[] field1102;

    @ObfuscatedName("ad.as")
    public int field1068 = -1;

    @ObfuscatedName("ad.af")
    public int field1099 = -1;

    @ObfuscatedName("ad.aa")
    public int field1106 = 128;

    @ObfuscatedName("ad.ad")
    public int field1101 = 128;

    @ObfuscatedName("ad.ai")
    public int field1075 = 128;

    @ObfuscatedName("ad.aw")
    public int field1103 = 0;

    @ObfuscatedName("ad.ak")
    public int field1104 = 0;

    @ObfuscatedName("ad.az")
    public int field1105 = 0;

    @ObfuscatedName("ad.am")
    public boolean field1080 = false;

    @ObfuscatedName("ad.bj")
    public int field1107 = -1;

    @ObfuscatedName("ad.bf")
    public int field1098 = -1;

    @ObfuscatedName("dl.n(Lfd;Lfd;ZLhe;B)V")
    public static void method2452(class158 arg0, class158 arg1, boolean arg2, class215 arg3) {
        Statics.field1061 = arg0;
        Statics.field2074 = arg1;
        Statics.field3142 = arg2;
        Statics.field1059 = Statics.field1061.method2945(10);
        Statics.field2608 = arg3;
    }

    @ObfuscatedName("e.o(II)Lad;")
    public static class47 method127(int arg0) {
        class47 var1 = (class47) field1063.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1061.method2925(10, arg0);
        class47 var3 = new class47();
        var3.field1066 = arg0;
        if (var2 != null) {
            var3.method910(new class111(var2));
        }
        var3.method953();
        if (var3.field1099 != -1) {
            var3.method912(method127(var3.field1099), method127(var3.field1068));
        }
        if (var3.field1098 != -1) {
            var3.method913(method127(var3.field1098), method127(var3.field1107));
        }
        if (!Statics.field3142 && var3.field1081) {
            var3.field1078 = class148.field2243;
            var3.field1080 = false;
            var3.field1108 = null;
            var3.field1083 = null;
            var3.field1105 = 0;
        }
        field1063.method3372(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ad.a(B)V")
    public void method953() {
    }

    @ObfuscatedName("ad.w(Ldl;B)V")
    public void method910(class111 arg0) {
        while (true) {
            int var2 = arg0.method2234();
            if (var2 == 0) {
                return;
            }
            this.method911(arg0, var2);
        }
    }

    @ObfuscatedName("ad.m(Ldl;II)V")
    public void method911(class111 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1067 = arg0.method2236();
        } else if (arg1 == 2) {
            this.field1078 = arg0.method2242();
        } else if (arg1 == 4) {
            this.field1073 = arg0.method2236();
        } else if (arg1 == 5) {
            this.field1074 = arg0.method2236();
        } else if (arg1 == 6) {
            this.field1087 = arg0.method2236();
        } else if (arg1 == 7) {
            this.field1077 = arg0.method2236();
            if (this.field1077 > 32767) {
                this.field1077 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1086 = arg0.method2236();
            if (this.field1086 > 32767) {
                this.field1086 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1079 = 1;
        } else if (arg1 == 12) {
            this.field1071 = arg0.method2239();
        } else if (arg1 == 16) {
            this.field1081 = true;
        } else if (arg1 == 23) {
            this.field1076 = arg0.method2236();
            this.field1082 = arg0.method2234();
        } else if (arg1 == 24) {
            this.field1085 = arg0.method2236();
        } else if (arg1 == 25) {
            this.field1109 = arg0.method2236();
            this.field1096 = arg0.method2234();
        } else if (arg1 == 26) {
            this.field1089 = arg0.method2236();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1108[arg1 - 30] = arg0.method2242();
            if (this.field1108[arg1 - 30].equalsIgnoreCase(class148.field2214)) {
                this.field1108[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1083[arg1 - 35] = arg0.method2242();
        } else if (arg1 == 40) {
            int var3 = arg0.method2234();
            this.field1069 = new short[var3];
            this.field1070 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1069[var4] = (short) arg0.method2236();
                this.field1070[var4] = (short) arg0.method2236();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2234();
            this.field1097 = new short[var5];
            this.field1072 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1097[var6] = (short) arg0.method2236();
                this.field1072[var6] = (short) arg0.method2236();
            }
        } else if (arg1 == 65) {
            this.field1080 = true;
        } else if (arg1 == 78) {
            this.field1090 = arg0.method2236();
        } else if (arg1 == 79) {
            this.field1091 = arg0.method2236();
        } else if (arg1 == 90) {
            this.field1092 = arg0.method2236();
        } else if (arg1 == 91) {
            this.field1094 = arg0.method2236();
        } else if (arg1 == 92) {
            this.field1093 = arg0.method2236();
        } else if (arg1 == 93) {
            this.field1095 = arg0.method2236();
        } else if (arg1 == 95) {
            this.field1062 = arg0.method2236();
        } else if (arg1 == 97) {
            this.field1068 = arg0.method2236();
        } else if (arg1 == 98) {
            this.field1099 = arg0.method2236();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1084 == null) {
                this.field1084 = new int[10];
                this.field1102 = new int[10];
            }
            this.field1084[arg1 - 100] = arg0.method2236();
            this.field1102[arg1 - 100] = arg0.method2236();
        } else if (arg1 == 110) {
            this.field1106 = arg0.method2236();
        } else if (arg1 == 111) {
            this.field1101 = arg0.method2236();
        } else if (arg1 == 112) {
            this.field1075 = arg0.method2236();
        } else if (arg1 == 113) {
            this.field1103 = arg0.method2235();
        } else if (arg1 == 114) {
            this.field1104 = arg0.method2235() * 5;
        } else if (arg1 == 115) {
            this.field1105 = arg0.method2234();
        } else if (arg1 == 139) {
            this.field1107 = arg0.method2236();
        } else if (arg1 == 140) {
            this.field1098 = arg0.method2236();
        }
    }

    @ObfuscatedName("ad.h(Lad;Lad;I)V")
    public void method912(class47 arg0, class47 arg1) {
        this.field1067 = arg0.field1067;
        this.field1073 = arg0.field1073;
        this.field1074 = arg0.field1074;
        this.field1087 = arg0.field1087;
        this.field1062 = arg0.field1062;
        this.field1077 = arg0.field1077;
        this.field1086 = arg0.field1086;
        this.field1069 = arg0.field1069;
        this.field1070 = arg0.field1070;
        this.field1097 = arg0.field1097;
        this.field1072 = arg0.field1072;
        this.field1078 = arg1.field1078;
        this.field1081 = arg1.field1081;
        this.field1071 = arg1.field1071;
        this.field1079 = 1;
    }

    @ObfuscatedName("ad.i(Lad;Lad;I)V")
    public void method913(class47 arg0, class47 arg1) {
        this.field1067 = arg0.field1067;
        this.field1073 = arg0.field1073;
        this.field1074 = arg0.field1074;
        this.field1087 = arg0.field1087;
        this.field1062 = arg0.field1062;
        this.field1077 = arg0.field1077;
        this.field1086 = arg0.field1086;
        this.field1069 = arg1.field1069;
        this.field1070 = arg1.field1070;
        this.field1097 = arg1.field1097;
        this.field1072 = arg1.field1072;
        this.field1078 = arg1.field1078;
        this.field1081 = arg1.field1081;
        this.field1079 = arg1.field1079;
        this.field1076 = arg1.field1076;
        this.field1085 = arg1.field1085;
        this.field1090 = arg1.field1090;
        this.field1109 = arg1.field1109;
        this.field1089 = arg1.field1089;
        this.field1091 = arg1.field1091;
        this.field1092 = arg1.field1092;
        this.field1093 = arg1.field1093;
        this.field1094 = arg1.field1094;
        this.field1095 = arg1.field1095;
        this.field1105 = arg1.field1105;
        this.field1108 = arg1.field1108;
        this.field1083 = new String[5];
        if (arg1.field1083 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1083[var3] = arg1.field1083[var3];
            }
        }
        this.field1083[4] = class148.field2391;
        this.field1071 = 0;
    }

    @ObfuscatedName("ad.r(II)Lcz;")
    public final class95 method914(int arg0) {
        if (this.field1084 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1102[var3] && this.field1102[var3] != 0) {
                    var2 = this.field1084[var3];
                }
            }
            if (var2 != -1) {
                return method127(var2).method914(1);
            }
        }
        class95 var4 = class95.method2050(Statics.field2074, this.field1067, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1106 != 128 || this.field1101 != 128 || this.field1075 != 128) {
            var4.method2012(this.field1106, this.field1101, this.field1075);
        }
        if (this.field1069 != null) {
            for (int var5 = 0; var5 < this.field1069.length; var5++) {
                var4.method1985(this.field1069[var5], this.field1070[var5]);
            }
        }
        if (this.field1097 != null) {
            for (int var6 = 0; var6 < this.field1097.length; var6++) {
                var4.method1986(this.field1097[var6], this.field1072[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ad.l(II)Lcp;")
    public final class100 method925(int arg0) {
        if (this.field1084 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1102[var3] && this.field1102[var3] != 0) {
                    var2 = this.field1084[var3];
                }
            }
            if (var2 != -1) {
                return method127(var2).method925(1);
            }
        }
        class100 var4 = (class100) field1064.method3373((long) this.field1066);
        if (var4 != null) {
            return var4;
        }
        class95 var5 = class95.method2050(Statics.field2074, this.field1067, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1106 != 128 || this.field1101 != 128 || this.field1075 != 128) {
            var5.method2012(this.field1106, this.field1101, this.field1075);
        }
        if (this.field1069 != null) {
            for (int var6 = 0; var6 < this.field1069.length; var6++) {
                var5.method1985(this.field1069[var6], this.field1070[var6]);
            }
        }
        if (this.field1097 != null) {
            for (int var7 = 0; var7 < this.field1097.length; var7++) {
                var5.method1986(this.field1097[var7], this.field1072[var7]);
            }
        }
        class100 var8 = var5.method2033(this.field1103 + 64, this.field1104 + 768, -50, -10, -50);
        var8.field1745 = true;
        field1064.method3372(var8, (long) this.field1066);
        return var8;
    }

    @ObfuscatedName("ad.f(II)Lad;")
    public class47 method916(int arg0) {
        if (this.field1084 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1102[var3] && this.field1102[var3] != 0) {
                    var2 = this.field1084[var3];
                }
            }
            if (var2 != -1) {
                return method127(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("r.e(IIIIIZB)Lbd;")
    public static final class74 method90(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class74 var8 = (class74) field1065.method3373(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class47 var9 = method127(arg0);
        if (arg1 > 1 && var9.field1084 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1102[var11] && var9.field1102[var11] != 0) {
                    var10 = var9.field1084[var11];
                }
            }
            if (var10 != -1) {
                var9 = method127(var10);
            }
        }
        class100 var12 = var9.method925(1);
        if (var12 == null) {
            return null;
        }
        class74 var13 = null;
        if (var9.field1099 != -1) {
            var13 = method90(var9.field1068, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1098 != -1) {
            var13 = method90(var9.field1107, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1353;
        int var15 = Statics.field1356;
        int var16 = Statics.field1355;
        int[] var17 = new int[4];
        class75.method1602(var17);
        class74 var18 = new class74(36, 32);
        class75.method1597(var18.field1348, 36, 32);
        class75.method1603();
        class86.method1877();
        class86.method1881(16, 16);
        class86.field1500 = false;
        int var19 = var9.field1073;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class86.field1520[var9.field1074] * var19 >> 16;
        int var21 = class86.field1521[var9.field1074] * var19 >> 16;
        var12.method2080();
        var12.method2092(0, var9.field1087, var9.field1062, var9.field1074, var9.field1077, var9.field1086 + var12.field1392 / 2 + var20, var9.field1086 + var21);
        if (var9.field1098 != -1) {
            var13.method1528(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1592(1);
        }
        if (arg2 >= 2) {
            var18.method1592(16777215);
        }
        if (arg3 != 0) {
            var18.method1525(arg3);
        }
        class75.method1597(var18.field1348, 36, 32);
        if (var9.field1099 != -1) {
            var13.method1528(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1079 == 1) {
            Statics.field2608.method3640(method99(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1065.method3372(var18, var6);
        }
        class75.method1597(var14, var15, var16);
        class75.method1596(var17);
        class86.method1877();
        class86.field1500 = true;
        return var18;
    }

    @ObfuscatedName("l.z(II)Ljava/lang/String;")
    public static final String method99(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class148.field2428 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class148.field2374 + "</col>";
        }
    }

    @ObfuscatedName("ad.v(ZI)Z")
    public final boolean method941(boolean arg0) {
        int var2 = this.field1076;
        int var3 = this.field1085;
        int var4 = this.field1090;
        if (arg0) {
            var2 = this.field1109;
            var3 = this.field1089;
            var4 = this.field1091;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2074.method2995(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2074.method2995(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2074.method2995(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ad.x(ZB)Lcz;")
    public final class95 method918(boolean arg0) {
        int var2 = this.field1076;
        int var3 = this.field1085;
        int var4 = this.field1090;
        if (arg0) {
            var2 = this.field1109;
            var3 = this.field1089;
            var4 = this.field1091;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var5 = class95.method2050(Statics.field2074, var2, 0);
        if (var3 != -1) {
            class95 var6 = class95.method2050(Statics.field2074, var3, 0);
            if (var4 == -1) {
                class95[] var9 = new class95[] { var5, var6 };
                var5 = new class95(var9, 2);
            } else {
                class95 var7 = class95.method2050(Statics.field2074, var4, 0);
                class95[] var8 = new class95[] { var5, var6, var7 };
                var5 = new class95(var8, 3);
            }
        }
        if (!arg0 && this.field1082 != 0) {
            var5.method1984(0, this.field1082, 0);
        }
        if (arg0 && this.field1096 != 0) {
            var5.method1984(0, this.field1096, 0);
        }
        if (this.field1069 != null) {
            for (int var10 = 0; var10 < this.field1069.length; var10++) {
                var5.method1985(this.field1069[var10], this.field1070[var10]);
            }
        }
        if (this.field1097 != null) {
            for (int var11 = 0; var11 < this.field1097.length; var11++) {
                var5.method1986(this.field1097[var11], this.field1072[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ad.q(ZB)Z")
    public final boolean method917(boolean arg0) {
        int var2 = this.field1092;
        int var3 = this.field1093;
        if (arg0) {
            var2 = this.field1094;
            var3 = this.field1095;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2074.method2995(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2074.method2995(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ad.b(ZI)Lcz;")
    public final class95 method920(boolean arg0) {
        int var2 = this.field1092;
        int var3 = this.field1093;
        if (arg0) {
            var2 = this.field1094;
            var3 = this.field1095;
        }
        if (var2 == -1) {
            return null;
        }
        class95 var4 = class95.method2050(Statics.field2074, var2, 0);
        if (var3 != -1) {
            class95 var5 = class95.method2050(Statics.field2074, var3, 0);
            class95[] var6 = new class95[] { var4, var5 };
            var4 = new class95(var6, 2);
        }
        if (this.field1069 != null) {
            for (int var7 = 0; var7 < this.field1069.length; var7++) {
                var4.method1985(this.field1069[var7], this.field1070[var7]);
            }
        }
        if (this.field1097 != null) {
            for (int var8 = 0; var8 < this.field1097.length; var8++) {
                var4.method1986(this.field1097[var8], this.field1072[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("cg.u(I)V")
    public static void method1871() {
        field1063.method3376();
        field1064.method3376();
        field1065.method3376();
    }

    @ObfuscatedName("aq.t(I)V")
    public static void method586() {
        field1065.method3376();
    }

    @ObfuscatedName("ef.s(ZI)V")
    public static void method2814(boolean arg0) {
        if (Statics.field3142 != arg0) {
            method1871();
            Statics.field3142 = arg0;
        }
    }
}

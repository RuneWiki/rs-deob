package deob;

@ObfuscatedName("ay")
public class class52 extends class204 {

    @ObfuscatedName("ay.x")
    public static class193 field1072 = new class193(64);

    @ObfuscatedName("ay.g")
    public static class193 field1073 = new class193(50);

    @ObfuscatedName("ay.e")
    public static class193 field1074 = new class193(200);

    @ObfuscatedName("ay.a")
    public int field1112;

    @ObfuscatedName("ay.v")
    public int field1077;

    @ObfuscatedName("ay.c")
    public String field1082 = "null";

    @ObfuscatedName("ay.s")
    public short[] field1079;

    @ObfuscatedName("ay.r")
    public short[] field1080;

    @ObfuscatedName("ay.h")
    public short[] field1071;

    @ObfuscatedName("ay.n")
    public short[] field1090;

    @ObfuscatedName("ay.b")
    public int field1114 = 2000;

    @ObfuscatedName("ay.f")
    public int field1084 = 0;

    @ObfuscatedName("ay.d")
    public int field1085 = 0;

    @ObfuscatedName("ay.q")
    public int field1086 = 0;

    @ObfuscatedName("ay.o")
    public int field1087 = 0;

    @ObfuscatedName("ay.w")
    public int field1081 = 0;

    @ObfuscatedName("ay.z")
    public int field1089 = 0;

    @ObfuscatedName("ay.t")
    public int field1088 = 1;

    @ObfuscatedName("ay.aq")
    public boolean field1091 = false;

    @ObfuscatedName("ay.an")
    public String[] field1070 = new String[] { null, null, class157.field2284, null, null };

    @ObfuscatedName("ay.av")
    public String[] field1103 = new String[] { null, null, null, null, class157.field2285 };

    @ObfuscatedName("ay.ac")
    public int field1094 = -1;

    @ObfuscatedName("ay.ar")
    public int field1095 = -1;

    @ObfuscatedName("ay.ah")
    public int field1096 = 0;

    @ObfuscatedName("ay.ab")
    public int field1097 = -1;

    @ObfuscatedName("ay.au")
    public int field1098 = -1;

    @ObfuscatedName("ay.ao")
    public int field1099 = 0;

    @ObfuscatedName("ay.am")
    public int field1100 = -1;

    @ObfuscatedName("ay.aa")
    public int field1101 = -1;

    @ObfuscatedName("ay.aj")
    public int field1102 = -1;

    @ObfuscatedName("ay.ap")
    public int field1076 = -1;

    @ObfuscatedName("ay.at")
    public int field1069 = -1;

    @ObfuscatedName("ay.az")
    public int field1105 = -1;

    @ObfuscatedName("ay.ai")
    public int[] field1119;

    @ObfuscatedName("ay.af")
    public int[] field1104;

    @ObfuscatedName("ay.aw")
    public int field1083 = -1;

    @ObfuscatedName("ay.al")
    public int field1109 = -1;

    @ObfuscatedName("ay.ax")
    public int field1110 = 128;

    @ObfuscatedName("ay.ag")
    public int field1111 = 128;

    @ObfuscatedName("ay.ak")
    public int field1106 = 128;

    @ObfuscatedName("ay.ad")
    public int field1113 = 0;

    @ObfuscatedName("ay.ae")
    public int field1068 = 0;

    @ObfuscatedName("ay.as")
    public int field1115 = 0;

    @ObfuscatedName("ay.ay")
    public boolean field1116 = false;

    @ObfuscatedName("ay.bz")
    public int field1117 = -1;

    @ObfuscatedName("ay.bx")
    public int field1118 = -1;

    @ObfuscatedName("c.m(IB)Lay;")
    public static class52 method168(int arg0) {
        class52 var1 = (class52) field1072.method3537((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1107.method3080(10, arg0);
        class52 var3 = new class52();
        var3.field1112 = arg0;
        if (var2 != null) {
            var3.method1044(new class119(var2));
        }
        var3.method1038();
        if (var3.field1109 != -1) {
            var3.method1076(method168(var3.field1109), method168(var3.field1083));
        }
        if (var3.field1118 != -1) {
            var3.method1042(method168(var3.field1118), method168(var3.field1117));
        }
        if (!Statics.field2691 && var3.field1091) {
            var3.field1082 = class157.field2462;
            var3.field1116 = false;
            var3.field1070 = null;
            var3.field1103 = null;
            var3.field1115 = 0;
        }
        field1072.method3539(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.l(I)V")
    public void method1038() {
    }

    @ObfuscatedName("ay.y(Ldx;B)V")
    public void method1044(class119 arg0) {
        while (true) {
            int var2 = arg0.method2562();
            if (var2 == 0) {
                return;
            }
            this.method1040(arg0, var2);
        }
    }

    @ObfuscatedName("ay.u(Ldx;IB)V")
    public void method1040(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1077 = arg0.method2541();
        } else if (arg1 == 2) {
            this.field1082 = arg0.method2389();
        } else if (arg1 == 4) {
            this.field1114 = arg0.method2541();
        } else if (arg1 == 5) {
            this.field1084 = arg0.method2541();
        } else if (arg1 == 6) {
            this.field1085 = arg0.method2541();
        } else if (arg1 == 7) {
            this.field1087 = arg0.method2541();
            if (this.field1087 > 32767) {
                this.field1087 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1081 = arg0.method2541();
            if (this.field1081 > 32767) {
                this.field1081 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1089 = 1;
        } else if (arg1 == 12) {
            this.field1088 = arg0.method2386();
        } else if (arg1 == 16) {
            this.field1091 = true;
        } else if (arg1 == 23) {
            this.field1094 = arg0.method2541();
            this.field1096 = arg0.method2562();
        } else if (arg1 == 24) {
            this.field1095 = arg0.method2541();
        } else if (arg1 == 25) {
            this.field1097 = arg0.method2541();
            this.field1099 = arg0.method2562();
        } else if (arg1 == 26) {
            this.field1098 = arg0.method2541();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1070[arg1 - 30] = arg0.method2389();
            if (this.field1070[arg1 - 30].equalsIgnoreCase(class157.field2286)) {
                this.field1070[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1103[arg1 - 35] = arg0.method2389();
        } else if (arg1 == 40) {
            int var3 = arg0.method2562();
            this.field1079 = new short[var3];
            this.field1080 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1079[var4] = (short) arg0.method2541();
                this.field1080[var4] = (short) arg0.method2541();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2562();
            this.field1071 = new short[var5];
            this.field1090 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1071[var6] = (short) arg0.method2541();
                this.field1090[var6] = (short) arg0.method2541();
            }
        } else if (arg1 == 65) {
            this.field1116 = true;
        } else if (arg1 == 78) {
            this.field1100 = arg0.method2541();
        } else if (arg1 == 79) {
            this.field1101 = arg0.method2541();
        } else if (arg1 == 90) {
            this.field1102 = arg0.method2541();
        } else if (arg1 == 91) {
            this.field1069 = arg0.method2541();
        } else if (arg1 == 92) {
            this.field1076 = arg0.method2541();
        } else if (arg1 == 93) {
            this.field1105 = arg0.method2541();
        } else if (arg1 == 95) {
            this.field1086 = arg0.method2541();
        } else if (arg1 == 97) {
            this.field1083 = arg0.method2541();
        } else if (arg1 == 98) {
            this.field1109 = arg0.method2541();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1119 == null) {
                this.field1119 = new int[10];
                this.field1104 = new int[10];
            }
            this.field1119[arg1 - 100] = arg0.method2541();
            this.field1104[arg1 - 100] = arg0.method2541();
        } else if (arg1 == 110) {
            this.field1110 = arg0.method2541();
        } else if (arg1 == 111) {
            this.field1111 = arg0.method2541();
        } else if (arg1 == 112) {
            this.field1106 = arg0.method2541();
        } else if (arg1 == 113) {
            this.field1113 = arg0.method2382();
        } else if (arg1 == 114) {
            this.field1068 = arg0.method2382() * 5;
        } else if (arg1 == 115) {
            this.field1115 = arg0.method2562();
        } else if (arg1 == 139) {
            this.field1117 = arg0.method2541();
        } else if (arg1 == 140) {
            this.field1118 = arg0.method2541();
        }
    }

    @ObfuscatedName("ay.k(Lay;Lay;I)V")
    public void method1076(class52 arg0, class52 arg1) {
        this.field1077 = arg0.field1077;
        this.field1114 = arg0.field1114;
        this.field1084 = arg0.field1084;
        this.field1085 = arg0.field1085;
        this.field1086 = arg0.field1086;
        this.field1087 = arg0.field1087;
        this.field1081 = arg0.field1081;
        this.field1079 = arg0.field1079;
        this.field1080 = arg0.field1080;
        this.field1071 = arg0.field1071;
        this.field1090 = arg0.field1090;
        this.field1082 = arg1.field1082;
        this.field1091 = arg1.field1091;
        this.field1088 = arg1.field1088;
        this.field1089 = 1;
    }

    @ObfuscatedName("ay.j(Lay;Lay;B)V")
    public void method1042(class52 arg0, class52 arg1) {
        this.field1077 = arg0.field1077;
        this.field1114 = arg0.field1114;
        this.field1084 = arg0.field1084;
        this.field1085 = arg0.field1085;
        this.field1086 = arg0.field1086;
        this.field1087 = arg0.field1087;
        this.field1081 = arg0.field1081;
        this.field1079 = arg1.field1079;
        this.field1080 = arg1.field1080;
        this.field1071 = arg1.field1071;
        this.field1090 = arg1.field1090;
        this.field1082 = arg1.field1082;
        this.field1091 = arg1.field1091;
        this.field1089 = arg1.field1089;
        this.field1094 = arg1.field1094;
        this.field1095 = arg1.field1095;
        this.field1100 = arg1.field1100;
        this.field1097 = arg1.field1097;
        this.field1098 = arg1.field1098;
        this.field1101 = arg1.field1101;
        this.field1102 = arg1.field1102;
        this.field1076 = arg1.field1076;
        this.field1069 = arg1.field1069;
        this.field1105 = arg1.field1105;
        this.field1115 = arg1.field1115;
        this.field1070 = arg1.field1070;
        this.field1103 = new String[5];
        if (arg1.field1103 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1103[var3] = arg1.field1103[var3];
            }
        }
        this.field1103[4] = class157.field2435;
        this.field1088 = 0;
    }

    @ObfuscatedName("ay.i(IB)Lcy;")
    public final class100 method1043(int arg0) {
        if (this.field1119 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1104[var3] && this.field1104[var3] != 0) {
                    var2 = this.field1119[var3];
                }
            }
            if (var2 != -1) {
                return method168(var2).method1043(1);
            }
        }
        class100 var4 = class100.method2097(Statics.field2874, this.field1077, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1110 != 128 || this.field1111 != 128 || this.field1106 != 128) {
            var4.method2109(this.field1110, this.field1111, this.field1106);
        }
        if (this.field1079 != null) {
            for (int var5 = 0; var5 < this.field1079.length; var5++) {
                var4.method2106(this.field1079[var5], this.field1080[var5]);
            }
        }
        if (this.field1071 != null) {
            for (int var6 = 0; var6 < this.field1071.length; var6++) {
                var4.method2107(this.field1071[var6], this.field1090[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ay.x(II)Ldb;")
    public final class105 method1065(int arg0) {
        if (this.field1119 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1104[var3] && this.field1104[var3] != 0) {
                    var2 = this.field1119[var3];
                }
            }
            if (var2 != -1) {
                return method168(var2).method1065(1);
            }
        }
        class105 var4 = (class105) field1073.method3537((long) this.field1112);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2097(Statics.field2874, this.field1077, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1110 != 128 || this.field1111 != 128 || this.field1106 != 128) {
            var5.method2109(this.field1110, this.field1111, this.field1106);
        }
        if (this.field1079 != null) {
            for (int var6 = 0; var6 < this.field1079.length; var6++) {
                var5.method2106(this.field1079[var6], this.field1080[var6]);
            }
        }
        if (this.field1071 != null) {
            for (int var7 = 0; var7 < this.field1071.length; var7++) {
                var5.method2107(this.field1071[var7], this.field1090[var7]);
            }
        }
        class105 var8 = var5.method2114(this.field1113 + 64, this.field1068 + 768, -50, -10, -50);
        var8.field1772 = true;
        field1073.method3539(var8, (long) this.field1112);
        return var8;
    }

    @ObfuscatedName("ay.g(II)Lay;")
    public class52 method1045(int arg0) {
        if (this.field1119 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1104[var3] && this.field1104[var3] != 0) {
                    var2 = this.field1119[var3];
                }
            }
            if (var2 != -1) {
                return method168(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("bs.e(IIIIIZI)Lcs;")
    public static final class79 method1528(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1074.method3537(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method168(arg0);
        if (arg1 > 1 && var9.field1119 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1104[var11] && var9.field1104[var11] != 0) {
                    var10 = var9.field1119[var11];
                }
            }
            if (var10 != -1) {
                var9 = method168(var10);
            }
        }
        class105 var12 = var9.method1065(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1109 != -1) {
            var13 = method1528(var9.field1083, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1118 != -1) {
            var13 = method1528(var9.field1117, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1371;
        int var15 = Statics.field1368;
        int var16 = Statics.field1366;
        int[] var17 = new int[4];
        class80.method1731(var17);
        class79 var18 = new class79(36, 32);
        class80.method1771(var18.field1355, 36, 32);
        class80.method1729();
        class91.method2001();
        class91.method2017(16, 16);
        class91.field1515 = false;
        int var19 = var9.field1114;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1530[var9.field1084] * var19 >> 16;
        int var21 = class91.field1536[var9.field1084] * var19 >> 16;
        var12.method2188();
        var12.method2200(0, var9.field1085, var9.field1086, var9.field1084, var9.field1087, var9.field1081 + var12.field1408 / 2 + var20, var9.field1081 + var21);
        if (var9.field1118 != -1) {
            var13.method1650(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1646(1);
        }
        if (arg2 >= 2) {
            var18.method1646(16777215);
        }
        if (arg3 != 0) {
            var18.method1694(arg3);
        }
        class80.method1771(var18.field1355, 36, 32);
        if (var9.field1109 != -1) {
            var13.method1650(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1089 == 1) {
            Statics.field1108.method3826(method3188(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1074.method3539(var18, var6);
        }
        class80.method1771(var14, var15, var16);
        class80.method1732(var17);
        class91.method2001();
        class91.field1515 = true;
        return var18;
    }

    @ObfuscatedName("fl.p(II)Ljava/lang/String;")
    public static final String method3188(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class157.field2448 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class157.field2446 + "</col>";
        }
    }

    @ObfuscatedName("ay.a(ZS)Z")
    public final boolean method1046(boolean arg0) {
        int var2 = this.field1094;
        int var3 = this.field1095;
        int var4 = this.field1100;
        if (arg0) {
            var2 = this.field1097;
            var3 = this.field1098;
            var4 = this.field1101;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2874.method3095(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2874.method3095(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2874.method3095(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ay.v(ZI)Lcy;")
    public final class100 method1089(boolean arg0) {
        int var2 = this.field1094;
        int var3 = this.field1095;
        int var4 = this.field1100;
        if (arg0) {
            var2 = this.field1097;
            var3 = this.field1098;
            var4 = this.field1101;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2097(Statics.field2874, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2097(Statics.field2874, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2097(Statics.field2874, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1096 != 0) {
            var5.method2105(0, this.field1096, 0);
        }
        if (arg0 && this.field1099 != 0) {
            var5.method2105(0, this.field1099, 0);
        }
        if (this.field1079 != null) {
            for (int var10 = 0; var10 < this.field1079.length; var10++) {
                var5.method2106(this.field1079[var10], this.field1080[var10]);
            }
        }
        if (this.field1071 != null) {
            for (int var11 = 0; var11 < this.field1071.length; var11++) {
                var5.method2107(this.field1071[var11], this.field1090[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ay.c(ZI)Z")
    public final boolean method1048(boolean arg0) {
        int var2 = this.field1102;
        int var3 = this.field1076;
        if (arg0) {
            var2 = this.field1069;
            var3 = this.field1105;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2874.method3095(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2874.method3095(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ay.s(ZB)Lcy;")
    public final class100 method1049(boolean arg0) {
        int var2 = this.field1102;
        int var3 = this.field1076;
        if (arg0) {
            var2 = this.field1069;
            var3 = this.field1105;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2097(Statics.field2874, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2097(Statics.field2874, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1079 != null) {
            for (int var7 = 0; var7 < this.field1079.length; var7++) {
                var4.method2106(this.field1079[var7], this.field1080[var7]);
            }
        }
        if (this.field1071 != null) {
            for (int var8 = 0; var8 < this.field1071.length; var8++) {
                var4.method2107(this.field1071[var8], this.field1090[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("m.r(B)V")
    public static void method2() {
        field1072.method3540();
        field1073.method3540();
        field1074.method3540();
    }

    @ObfuscatedName("dr.h(ZI)V")
    public static void method2266(boolean arg0) {
        if (Statics.field2691 != arg0) {
            method2();
            Statics.field2691 = arg0;
        }
    }
}

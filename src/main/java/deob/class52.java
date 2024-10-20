package deob;

@ObfuscatedName("aq")
public class class52 extends class204 {

    @ObfuscatedName("aq.j")
    public static class193 field1129 = new class193(64);

    @ObfuscatedName("aq.a")
    public static class193 field1108 = new class193(50);

    @ObfuscatedName("aq.y")
    public static class193 field1122 = new class193(200);

    @ObfuscatedName("aq.z")
    public int field1110;

    @ObfuscatedName("aq.w")
    public int field1111;

    @ObfuscatedName("aq.l")
    public String field1112 = "null";

    @ObfuscatedName("aq.q")
    public short[] field1113;

    @ObfuscatedName("aq.x")
    public short[] field1140;

    @ObfuscatedName("aq.s")
    public short[] field1101;

    @ObfuscatedName("aq.n")
    public short[] field1116;

    @ObfuscatedName("aq.u")
    public int field1127 = 2000;

    @ObfuscatedName("aq.m")
    public int field1118 = 0;

    @ObfuscatedName("aq.e")
    public int field1119 = 0;

    @ObfuscatedName("aq.k")
    public int field1115 = 0;

    @ObfuscatedName("aq.r")
    public int field1139 = 0;

    @ObfuscatedName("aq.b")
    public int field1126 = 0;

    @ObfuscatedName("aq.t")
    public int field1123 = 0;

    @ObfuscatedName("aq.g")
    public int field1143 = 1;

    @ObfuscatedName("aq.af")
    public boolean field1125 = false;

    @ObfuscatedName("aq.ad")
    public String[] field1109 = new String[] { null, null, class157.field2321, null, null };

    @ObfuscatedName("aq.ak")
    public String[] field1133 = new String[] { null, null, null, null, class157.field2322 };

    @ObfuscatedName("aq.ai")
    public int field1128 = -1;

    @ObfuscatedName("aq.au")
    public int field1105 = -1;

    @ObfuscatedName("aq.ar")
    public int field1130 = 0;

    @ObfuscatedName("aq.aw")
    public int field1117 = -1;

    @ObfuscatedName("aq.at")
    public int field1132 = -1;

    @ObfuscatedName("aq.al")
    public int field1102 = 0;

    @ObfuscatedName("aq.aj")
    public int field1134 = -1;

    @ObfuscatedName("aq.ag")
    public int field1135 = -1;

    @ObfuscatedName("aq.ay")
    public int field1136 = -1;

    @ObfuscatedName("aq.az")
    public int field1137 = -1;

    @ObfuscatedName("aq.ac")
    public int field1138 = -1;

    @ObfuscatedName("aq.aa")
    public int field1107 = -1;

    @ObfuscatedName("aq.ao")
    public int[] field1121;

    @ObfuscatedName("aq.av")
    public int[] field1141;

    @ObfuscatedName("aq.am")
    public int field1142 = -1;

    @ObfuscatedName("aq.an")
    public int field1131 = -1;

    @ObfuscatedName("aq.ae")
    public int field1144 = 128;

    @ObfuscatedName("aq.ap")
    public int field1145 = 128;

    @ObfuscatedName("aq.ax")
    public int field1146 = 128;

    @ObfuscatedName("aq.ab")
    public int field1147 = 0;

    @ObfuscatedName("aq.as")
    public int field1148 = 0;

    @ObfuscatedName("aq.ah")
    public int field1151 = 0;

    @ObfuscatedName("aq.aq")
    public boolean field1150 = false;

    @ObfuscatedName("aq.bw")
    public int field1124 = -1;

    @ObfuscatedName("aq.bt")
    public int field1152 = -1;

    @ObfuscatedName("an.v(Lfh;Lfh;ZLhi;I)V")
    public static void method914(class167 arg0, class167 arg1, boolean arg2, class224 arg3) {
        Statics.field1104 = arg0;
        Statics.field1936 = arg1;
        Statics.field1114 = arg2;
        Statics.field1106 = Statics.field1104.method3093(10);
        Statics.field173 = arg3;
    }

    @ObfuscatedName("i.f(II)Laq;")
    public static class52 method36(int arg0) {
        class52 var1 = (class52) field1129.method3490((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1104.method3082(10, arg0);
        class52 var3 = new class52();
        var3.field1110 = arg0;
        if (var2 != null) {
            var3.method1019(new class119(var2));
        }
        var3.method1000();
        if (var3.field1131 != -1) {
            var3.method1002(method36(var3.field1131), method36(var3.field1142));
        }
        if (var3.field1152 != -1) {
            var3.method1022(method36(var3.field1152), method36(var3.field1124));
        }
        if (!Statics.field1114 && var3.field1125) {
            var3.field1112 = class157.field2485;
            var3.field1150 = false;
            var3.field1109 = null;
            var3.field1133 = null;
            var3.field1151 = 0;
        }
        field1129.method3502(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.i(I)V")
    public void method1000() {
    }

    @ObfuscatedName("aq.d(Ldx;S)V")
    public void method1019(class119 arg0) {
        while (true) {
            int var2 = arg0.method2400();
            if (var2 == 0) {
                return;
            }
            this.method1035(arg0, var2);
        }
    }

    @ObfuscatedName("aq.o(Ldx;IS)V")
    public void method1035(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1111 = arg0.method2334();
        } else if (arg1 == 2) {
            this.field1112 = arg0.method2357();
        } else if (arg1 == 4) {
            this.field1127 = arg0.method2334();
        } else if (arg1 == 5) {
            this.field1118 = arg0.method2334();
        } else if (arg1 == 6) {
            this.field1119 = arg0.method2334();
        } else if (arg1 == 7) {
            this.field1139 = arg0.method2334();
            if (this.field1139 > 32767) {
                this.field1139 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1126 = arg0.method2334();
            if (this.field1126 > 32767) {
                this.field1126 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1123 = 1;
        } else if (arg1 == 12) {
            this.field1143 = arg0.method2354();
        } else if (arg1 == 16) {
            this.field1125 = true;
        } else if (arg1 == 23) {
            this.field1128 = arg0.method2334();
            this.field1130 = arg0.method2400();
        } else if (arg1 == 24) {
            this.field1105 = arg0.method2334();
        } else if (arg1 == 25) {
            this.field1117 = arg0.method2334();
            this.field1102 = arg0.method2400();
        } else if (arg1 == 26) {
            this.field1132 = arg0.method2334();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1109[arg1 - 30] = arg0.method2357();
            if (this.field1109[arg1 - 30].equalsIgnoreCase(class157.field2406)) {
                this.field1109[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1133[arg1 - 35] = arg0.method2357();
        } else if (arg1 == 40) {
            int var3 = arg0.method2400();
            this.field1113 = new short[var3];
            this.field1140 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1113[var4] = (short) arg0.method2334();
                this.field1140[var4] = (short) arg0.method2334();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2400();
            this.field1101 = new short[var5];
            this.field1116 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1101[var6] = (short) arg0.method2334();
                this.field1116[var6] = (short) arg0.method2334();
            }
        } else if (arg1 == 65) {
            this.field1150 = true;
        } else if (arg1 == 78) {
            this.field1134 = arg0.method2334();
        } else if (arg1 == 79) {
            this.field1135 = arg0.method2334();
        } else if (arg1 == 90) {
            this.field1136 = arg0.method2334();
        } else if (arg1 == 91) {
            this.field1138 = arg0.method2334();
        } else if (arg1 == 92) {
            this.field1137 = arg0.method2334();
        } else if (arg1 == 93) {
            this.field1107 = arg0.method2334();
        } else if (arg1 == 95) {
            this.field1115 = arg0.method2334();
        } else if (arg1 == 97) {
            this.field1142 = arg0.method2334();
        } else if (arg1 == 98) {
            this.field1131 = arg0.method2334();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1121 == null) {
                this.field1121 = new int[10];
                this.field1141 = new int[10];
            }
            this.field1121[arg1 - 100] = arg0.method2334();
            this.field1141[arg1 - 100] = arg0.method2334();
        } else if (arg1 == 110) {
            this.field1144 = arg0.method2334();
        } else if (arg1 == 111) {
            this.field1145 = arg0.method2334();
        } else if (arg1 == 112) {
            this.field1146 = arg0.method2334();
        } else if (arg1 == 113) {
            this.field1147 = arg0.method2350();
        } else if (arg1 == 114) {
            this.field1148 = arg0.method2350() * 5;
        } else if (arg1 == 115) {
            this.field1151 = arg0.method2400();
        } else if (arg1 == 139) {
            this.field1124 = arg0.method2334();
        } else if (arg1 == 140) {
            this.field1152 = arg0.method2334();
        }
    }

    @ObfuscatedName("aq.c(Laq;Laq;I)V")
    public void method1002(class52 arg0, class52 arg1) {
        this.field1111 = arg0.field1111;
        this.field1127 = arg0.field1127;
        this.field1118 = arg0.field1118;
        this.field1119 = arg0.field1119;
        this.field1115 = arg0.field1115;
        this.field1139 = arg0.field1139;
        this.field1126 = arg0.field1126;
        this.field1113 = arg0.field1113;
        this.field1140 = arg0.field1140;
        this.field1101 = arg0.field1101;
        this.field1116 = arg0.field1116;
        this.field1112 = arg1.field1112;
        this.field1125 = arg1.field1125;
        this.field1143 = arg1.field1143;
        this.field1123 = 1;
    }

    @ObfuscatedName("aq.p(Laq;Laq;I)V")
    public void method1022(class52 arg0, class52 arg1) {
        this.field1111 = arg0.field1111;
        this.field1127 = arg0.field1127;
        this.field1118 = arg0.field1118;
        this.field1119 = arg0.field1119;
        this.field1115 = arg0.field1115;
        this.field1139 = arg0.field1139;
        this.field1126 = arg0.field1126;
        this.field1113 = arg1.field1113;
        this.field1140 = arg1.field1140;
        this.field1101 = arg1.field1101;
        this.field1116 = arg1.field1116;
        this.field1112 = arg1.field1112;
        this.field1125 = arg1.field1125;
        this.field1123 = arg1.field1123;
        this.field1128 = arg1.field1128;
        this.field1105 = arg1.field1105;
        this.field1134 = arg1.field1134;
        this.field1117 = arg1.field1117;
        this.field1132 = arg1.field1132;
        this.field1135 = arg1.field1135;
        this.field1136 = arg1.field1136;
        this.field1137 = arg1.field1137;
        this.field1138 = arg1.field1138;
        this.field1107 = arg1.field1107;
        this.field1151 = arg1.field1151;
        this.field1109 = arg1.field1109;
        this.field1133 = new String[5];
        if (arg1.field1133 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1133[var3] = arg1.field1133[var3];
            }
        }
        this.field1133[4] = class157.field2327;
        this.field1143 = 0;
    }

    @ObfuscatedName("aq.j(IB)Lca;")
    public final class100 method1004(int arg0) {
        if (this.field1121 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1141[var3] && this.field1141[var3] != 0) {
                    var2 = this.field1121[var3];
                }
            }
            if (var2 != -1) {
                return method36(var2).method1004(1);
            }
        }
        class100 var4 = class100.method2053(Statics.field1936, this.field1111, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1144 != 128 || this.field1145 != 128 || this.field1146 != 128) {
            var4.method2095(this.field1144, this.field1145, this.field1146);
        }
        if (this.field1113 != null) {
            for (int var5 = 0; var5 < this.field1113.length; var5++) {
                var4.method2123(this.field1113[var5], this.field1140[var5]);
            }
        }
        if (this.field1101 != null) {
            for (int var6 = 0; var6 < this.field1101.length; var6++) {
                var4.method2067(this.field1101[var6], this.field1116[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aq.a(II)Ldq;")
    public final class105 method1005(int arg0) {
        if (this.field1121 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1141[var3] && this.field1141[var3] != 0) {
                    var2 = this.field1121[var3];
                }
            }
            if (var2 != -1) {
                return method36(var2).method1005(1);
            }
        }
        class105 var4 = (class105) field1108.method3490((long) this.field1110);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2053(Statics.field1936, this.field1111, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1144 != 128 || this.field1145 != 128 || this.field1146 != 128) {
            var5.method2095(this.field1144, this.field1145, this.field1146);
        }
        if (this.field1113 != null) {
            for (int var6 = 0; var6 < this.field1113.length; var6++) {
                var5.method2123(this.field1113[var6], this.field1140[var6]);
            }
        }
        if (this.field1101 != null) {
            for (int var7 = 0; var7 < this.field1101.length; var7++) {
                var5.method2067(this.field1101[var7], this.field1116[var7]);
            }
        }
        class105 var8 = var5.method2074(this.field1147 + 64, this.field1148 + 768, -50, -10, -50);
        var8.field1796 = true;
        field1108.method3502(var8, (long) this.field1110);
        return var8;
    }

    @ObfuscatedName("aq.y(IB)Laq;")
    public class52 method1006(int arg0) {
        if (this.field1121 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1141[var3] && this.field1141[var3] != 0) {
                    var2 = this.field1121[var3];
                }
            }
            if (var2 != -1) {
                return method36(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("x.h(IIIIIZI)Lcl;")
    public static final class79 method181(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1122.method3490(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method36(arg0);
        if (arg1 > 1 && var9.field1121 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1141[var11] && var9.field1141[var11] != 0) {
                    var10 = var9.field1121[var11];
                }
            }
            if (var10 != -1) {
                var9 = method36(var10);
            }
        }
        class105 var12 = var9.method1005(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1131 != -1) {
            var13 = method181(var9.field1142, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1152 != -1) {
            var13 = method181(var9.field1124, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1407;
        int var15 = Statics.field1406;
        int var16 = Statics.field1405;
        int[] var17 = new int[4];
        class80.method1686(var17);
        class79 var18 = new class79(36, 32);
        class80.method1682(var18.field1397, 36, 32);
        class80.method1688();
        class91.method1958();
        class91.method1961(16, 16);
        class91.field1556 = false;
        int var19 = var9.field1127;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1569[var9.field1118] * var19 >> 16;
        int var21 = class91.field1566[var9.field1118] * var19 >> 16;
        var12.method2159();
        var12.method2192(0, var9.field1119, var9.field1115, var9.field1118, var9.field1139, var9.field1126 + var12.field1443 / 2 + var20, var9.field1126 + var21);
        if (var9.field1152 != -1) {
            var13.method1604(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1610(1);
        }
        if (arg2 >= 2) {
            var18.method1610(16777215);
        }
        if (arg3 != 0) {
            var18.method1611(arg3);
        }
        class80.method1682(var18.field1397, 36, 32);
        if (var9.field1131 != -1) {
            var13.method1604(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1123 == 1) {
            Statics.field173.method3769(method200(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1122.method3502(var18, var6);
        }
        class80.method1682(var14, var15, var16);
        class80.method1687(var17);
        class91.method1958();
        class91.field1556 = true;
        return var18;
    }

    @ObfuscatedName("u.z(IB)Ljava/lang/String;")
    public static final String method200(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class157.field2544 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class157.field2480 + "</col>";
        }
    }

    @ObfuscatedName("aq.w(ZI)Z")
    public final boolean method1007(boolean arg0) {
        int var2 = this.field1128;
        int var3 = this.field1105;
        int var4 = this.field1134;
        if (arg0) {
            var2 = this.field1117;
            var3 = this.field1132;
            var4 = this.field1135;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1936.method3070(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1936.method3070(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1936.method3070(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aq.l(ZI)Lca;")
    public final class100 method1008(boolean arg0) {
        int var2 = this.field1128;
        int var3 = this.field1105;
        int var4 = this.field1134;
        if (arg0) {
            var2 = this.field1117;
            var3 = this.field1132;
            var4 = this.field1135;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2053(Statics.field1936, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2053(Statics.field1936, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2053(Statics.field1936, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1130 != 0) {
            var5.method2065(0, this.field1130, 0);
        }
        if (arg0 && this.field1102 != 0) {
            var5.method2065(0, this.field1102, 0);
        }
        if (this.field1113 != null) {
            for (int var10 = 0; var10 < this.field1113.length; var10++) {
                var5.method2123(this.field1113[var10], this.field1140[var10]);
            }
        }
        if (this.field1101 != null) {
            for (int var11 = 0; var11 < this.field1101.length; var11++) {
                var5.method2067(this.field1101[var11], this.field1116[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aq.q(ZI)Z")
    public final boolean method1009(boolean arg0) {
        int var2 = this.field1136;
        int var3 = this.field1137;
        if (arg0) {
            var2 = this.field1138;
            var3 = this.field1107;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1936.method3070(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1936.method3070(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aq.x(ZI)Lca;")
    public final class100 method1010(boolean arg0) {
        int var2 = this.field1136;
        int var3 = this.field1137;
        if (arg0) {
            var2 = this.field1138;
            var3 = this.field1107;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2053(Statics.field1936, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2053(Statics.field1936, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1113 != null) {
            for (int var7 = 0; var7 < this.field1113.length; var7++) {
                var4.method2123(this.field1113[var7], this.field1140[var7]);
            }
        }
        if (this.field1101 != null) {
            for (int var8 = 0; var8 < this.field1101.length; var8++) {
                var4.method2067(this.field1101[var8], this.field1116[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("db.s(ZI)V")
    public static void method2239(boolean arg0) {
        if (Statics.field1114 != arg0) {
            field1129.method3496();
            field1108.method3496();
            field1122.method3496();
            Statics.field1114 = arg0;
        }
    }
}

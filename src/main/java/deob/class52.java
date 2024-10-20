package deob;

@ObfuscatedName("ao")
public class class52 extends class204 {

    @ObfuscatedName("ao.s")
    public static class193 field1134 = new class193(64);

    @ObfuscatedName("ao.k")
    public static class193 field1111 = new class193(50);

    @ObfuscatedName("ao.b")
    public static class193 field1112 = new class193(200);

    @ObfuscatedName("ao.l")
    public int field1113;

    @ObfuscatedName("ao.p")
    public int field1114;

    @ObfuscatedName("ao.d")
    public String field1151 = "null";

    @ObfuscatedName("ao.i")
    public short[] field1116;

    @ObfuscatedName("ao.x")
    public short[] field1132;

    @ObfuscatedName("ao.j")
    public short[] field1118;

    @ObfuscatedName("ao.w")
    public short[] field1153;

    @ObfuscatedName("ao.r")
    public int field1126 = 2000;

    @ObfuscatedName("ao.u")
    public int field1121 = 0;

    @ObfuscatedName("ao.m")
    public int field1122 = 0;

    @ObfuscatedName("ao.t")
    public int field1123 = 0;

    @ObfuscatedName("ao.z")
    public int field1124 = 0;

    @ObfuscatedName("ao.e")
    public int field1125 = 0;

    @ObfuscatedName("ao.y")
    public int field1109 = 0;

    @ObfuscatedName("ao.a")
    public int field1144 = 1;

    @ObfuscatedName("ao.at")
    public boolean field1128 = false;

    @ObfuscatedName("ao.aa")
    public String[] field1129 = new String[] { null, null, class157.field2350, null, null };

    @ObfuscatedName("ao.ad")
    public String[] field1130 = new String[] { null, null, null, null, class157.field2572 };

    @ObfuscatedName("ao.af")
    public int field1131 = -1;

    @ObfuscatedName("ao.ag")
    public int field1108 = -1;

    @ObfuscatedName("ao.as")
    public int field1133 = 0;

    @ObfuscatedName("ao.al")
    public int field1147 = -1;

    @ObfuscatedName("ao.am")
    public int field1135 = -1;

    @ObfuscatedName("ao.ar")
    public int field1136 = 0;

    @ObfuscatedName("ao.ap")
    public int field1120 = -1;

    @ObfuscatedName("ao.ac")
    public int field1138 = -1;

    @ObfuscatedName("ao.ab")
    public int field1139 = -1;

    @ObfuscatedName("ao.an")
    public int field1140 = -1;

    @ObfuscatedName("ao.ak")
    public int field1141 = -1;

    @ObfuscatedName("ao.ay")
    public int field1142 = -1;

    @ObfuscatedName("ao.au")
    public int[] field1143;

    @ObfuscatedName("ao.az")
    public int[] field1117;

    @ObfuscatedName("ao.aw")
    public int field1145 = -1;

    @ObfuscatedName("ao.av")
    public int field1146 = -1;

    @ObfuscatedName("ao.aq")
    public int field1110 = 128;

    @ObfuscatedName("ao.ax")
    public int field1148 = 128;

    @ObfuscatedName("ao.ai")
    public int field1149 = 128;

    @ObfuscatedName("ao.ae")
    public int field1150 = 0;

    @ObfuscatedName("ao.aj")
    public int field1119 = 0;

    @ObfuscatedName("ao.ah")
    public int field1152 = 0;

    @ObfuscatedName("ao.ao")
    public boolean field1115 = false;

    @ObfuscatedName("ao.bs")
    public int field1154 = -1;

    @ObfuscatedName("ao.be")
    public int field1155 = -1;

    @ObfuscatedName("y.h(II)Lao;")
    public static class52 method588(int arg0) {
        class52 var1 = (class52) field1134.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1107.method3073(10, arg0);
        class52 var3 = new class52();
        var3.field1113 = arg0;
        if (var2 != null) {
            var3.method1044(new class119(var2));
        }
        var3.method1003();
        if (var3.field1146 != -1) {
            var3.method1005(method588(var3.field1146), method588(var3.field1145));
        }
        if (var3.field1155 != -1) {
            var3.method1002(method588(var3.field1155), method588(var3.field1154));
        }
        if (!Statics.field681 && var3.field1128) {
            var3.field1151 = class157.field2445;
            var3.field1115 = false;
            var3.field1129 = null;
            var3.field1130 = null;
            var3.field1152 = 0;
        }
        field1134.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.q(I)V")
    public void method1003() {
    }

    @ObfuscatedName("ao.v(Ldm;I)V")
    public void method1044(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method1004(arg0, var2);
        }
    }

    @ObfuscatedName("ao.n(Ldm;II)V")
    public void method1004(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1114 = arg0.method2385();
        } else if (arg1 == 2) {
            this.field1151 = arg0.method2391();
        } else if (arg1 == 4) {
            this.field1126 = arg0.method2385();
        } else if (arg1 == 5) {
            this.field1121 = arg0.method2385();
        } else if (arg1 == 6) {
            this.field1122 = arg0.method2385();
        } else if (arg1 == 7) {
            this.field1124 = arg0.method2385();
            if (this.field1124 > 32767) {
                this.field1124 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1125 = arg0.method2385();
            if (this.field1125 > 32767) {
                this.field1125 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1109 = 1;
        } else if (arg1 == 12) {
            this.field1144 = arg0.method2388();
        } else if (arg1 == 16) {
            this.field1128 = true;
        } else if (arg1 == 23) {
            this.field1131 = arg0.method2385();
            this.field1133 = arg0.method2383();
        } else if (arg1 == 24) {
            this.field1108 = arg0.method2385();
        } else if (arg1 == 25) {
            this.field1147 = arg0.method2385();
            this.field1136 = arg0.method2383();
        } else if (arg1 == 26) {
            this.field1135 = arg0.method2385();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1129[arg1 - 30] = arg0.method2391();
            if (this.field1129[arg1 - 30].equalsIgnoreCase(class157.field2496)) {
                this.field1129[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1130[arg1 - 35] = arg0.method2391();
        } else if (arg1 == 40) {
            int var3 = arg0.method2383();
            this.field1116 = new short[var3];
            this.field1132 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1116[var4] = (short) arg0.method2385();
                this.field1132[var4] = (short) arg0.method2385();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2383();
            this.field1118 = new short[var5];
            this.field1153 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1118[var6] = (short) arg0.method2385();
                this.field1153[var6] = (short) arg0.method2385();
            }
        } else if (arg1 == 65) {
            this.field1115 = true;
        } else if (arg1 == 78) {
            this.field1120 = arg0.method2385();
        } else if (arg1 == 79) {
            this.field1138 = arg0.method2385();
        } else if (arg1 == 90) {
            this.field1139 = arg0.method2385();
        } else if (arg1 == 91) {
            this.field1141 = arg0.method2385();
        } else if (arg1 == 92) {
            this.field1140 = arg0.method2385();
        } else if (arg1 == 93) {
            this.field1142 = arg0.method2385();
        } else if (arg1 == 95) {
            this.field1123 = arg0.method2385();
        } else if (arg1 == 97) {
            this.field1145 = arg0.method2385();
        } else if (arg1 == 98) {
            this.field1146 = arg0.method2385();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1143 == null) {
                this.field1143 = new int[10];
                this.field1117 = new int[10];
            }
            this.field1143[arg1 - 100] = arg0.method2385();
            this.field1117[arg1 - 100] = arg0.method2385();
        } else if (arg1 == 110) {
            this.field1110 = arg0.method2385();
        } else if (arg1 == 111) {
            this.field1148 = arg0.method2385();
        } else if (arg1 == 112) {
            this.field1149 = arg0.method2385();
        } else if (arg1 == 113) {
            this.field1150 = arg0.method2370();
        } else if (arg1 == 114) {
            this.field1119 = arg0.method2370() * 5;
        } else if (arg1 == 115) {
            this.field1152 = arg0.method2383();
        } else if (arg1 == 139) {
            this.field1154 = arg0.method2385();
        } else if (arg1 == 140) {
            this.field1155 = arg0.method2385();
        }
    }

    @ObfuscatedName("ao.f(Lao;Lao;I)V")
    public void method1005(class52 arg0, class52 arg1) {
        this.field1114 = arg0.field1114;
        this.field1126 = arg0.field1126;
        this.field1121 = arg0.field1121;
        this.field1122 = arg0.field1122;
        this.field1123 = arg0.field1123;
        this.field1124 = arg0.field1124;
        this.field1125 = arg0.field1125;
        this.field1116 = arg0.field1116;
        this.field1132 = arg0.field1132;
        this.field1118 = arg0.field1118;
        this.field1153 = arg0.field1153;
        this.field1151 = arg1.field1151;
        this.field1128 = arg1.field1128;
        this.field1144 = arg1.field1144;
        this.field1109 = 1;
    }

    @ObfuscatedName("ao.g(Lao;Lao;I)V")
    public void method1002(class52 arg0, class52 arg1) {
        this.field1114 = arg0.field1114;
        this.field1126 = arg0.field1126;
        this.field1121 = arg0.field1121;
        this.field1122 = arg0.field1122;
        this.field1123 = arg0.field1123;
        this.field1124 = arg0.field1124;
        this.field1125 = arg0.field1125;
        this.field1116 = arg1.field1116;
        this.field1132 = arg1.field1132;
        this.field1118 = arg1.field1118;
        this.field1153 = arg1.field1153;
        this.field1151 = arg1.field1151;
        this.field1128 = arg1.field1128;
        this.field1109 = arg1.field1109;
        this.field1131 = arg1.field1131;
        this.field1108 = arg1.field1108;
        this.field1120 = arg1.field1120;
        this.field1147 = arg1.field1147;
        this.field1135 = arg1.field1135;
        this.field1138 = arg1.field1138;
        this.field1139 = arg1.field1139;
        this.field1140 = arg1.field1140;
        this.field1141 = arg1.field1141;
        this.field1142 = arg1.field1142;
        this.field1152 = arg1.field1152;
        this.field1129 = arg1.field1129;
        this.field1130 = new String[5];
        if (arg1.field1130 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1130[var3] = arg1.field1130[var3];
            }
        }
        this.field1130[4] = class157.field2310;
        this.field1144 = 0;
    }

    @ObfuscatedName("ao.o(II)Lch;")
    public final class100 method1007(int arg0) {
        if (this.field1143 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1117[var3] && this.field1117[var3] != 0) {
                    var2 = this.field1143[var3];
                }
            }
            if (var2 != -1) {
                return method588(var2).method1007(1);
            }
        }
        class100 var4 = class100.method2084(Statics.field1631, this.field1114, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1110 != 128 || this.field1148 != 128 || this.field1149 != 128) {
            var4.method2157(this.field1110, this.field1148, this.field1149);
        }
        if (this.field1116 != null) {
            for (int var5 = 0; var5 < this.field1116.length; var5++) {
                var4.method2097(this.field1116[var5], this.field1132[var5]);
            }
        }
        if (this.field1118 != null) {
            for (int var6 = 0; var6 < this.field1118.length; var6++) {
                var4.method2149(this.field1118[var6], this.field1153[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ao.s(II)Ldg;")
    public final class105 method1008(int arg0) {
        if (this.field1143 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1117[var3] && this.field1117[var3] != 0) {
                    var2 = this.field1143[var3];
                }
            }
            if (var2 != -1) {
                return method588(var2).method1008(1);
            }
        }
        class105 var4 = (class105) field1111.method3538((long) this.field1113);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2084(Statics.field1631, this.field1114, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1110 != 128 || this.field1148 != 128 || this.field1149 != 128) {
            var5.method2157(this.field1110, this.field1148, this.field1149);
        }
        if (this.field1116 != null) {
            for (int var6 = 0; var6 < this.field1116.length; var6++) {
                var5.method2097(this.field1116[var6], this.field1132[var6]);
            }
        }
        if (this.field1118 != null) {
            for (int var7 = 0; var7 < this.field1118.length; var7++) {
                var5.method2149(this.field1118[var7], this.field1153[var7]);
            }
        }
        class105 var8 = var5.method2112(this.field1150 + 64, this.field1119 + 768, -50, -10, -50);
        var8.field1853 = true;
        field1111.method3540(var8, (long) this.field1113);
        return var8;
    }

    @ObfuscatedName("ao.k(II)Lao;")
    public class52 method1050(int arg0) {
        if (this.field1143 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1117[var3] && this.field1117[var3] != 0) {
                    var2 = this.field1143[var3];
                }
            }
            if (var2 != -1) {
                return method588(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("bk.b(IIIIIZS)Lcl;")
    public static final class79 method1251(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1112.method3538(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method588(arg0);
        if (arg1 > 1 && var9.field1143 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1117[var11] && var9.field1117[var11] != 0) {
                    var10 = var9.field1143[var11];
                }
            }
            if (var10 != -1) {
                var9 = method588(var10);
            }
        }
        class105 var12 = var9.method1008(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1146 != -1) {
            var13 = method1251(var9.field1145, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1155 != -1) {
            var13 = method1251(var9.field1154, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1414;
        int var15 = Statics.field1417;
        int var16 = Statics.field1416;
        int[] var17 = new int[4];
        class80.method1719(var17);
        class79 var18 = new class79(36, 32);
        class80.method1701(var18.field1405, 36, 32);
        class80.method1722();
        class91.method1980();
        class91.method1981(16, 16);
        class91.field1562 = false;
        int var19 = var9.field1126;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1585[var9.field1121] * var19 >> 16;
        int var21 = class91.field1586[var9.field1121] * var19 >> 16;
        var12.method2220();
        var12.method2188(0, var9.field1122, var9.field1123, var9.field1121, var9.field1124, var9.field1125 + var12.field1450 / 2 + var20, var9.field1125 + var21);
        if (var9.field1155 != -1) {
            var13.method1646(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1634(1);
        }
        if (arg2 >= 2) {
            var18.method1634(16777215);
        }
        if (arg3 != 0) {
            var18.method1608(arg3);
        }
        class80.method1701(var18.field1405, 36, 32);
        if (var9.field1146 != -1) {
            var13.method1646(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1109 == 1) {
            class224 var22 = Statics.field2050;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class157.field2468 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class157.field2488 + "</col>";
            }
            var22.method3844(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1112.method3540(var18, var6);
        }
        class80.method1701(var14, var15, var16);
        class80.method1707(var17);
        class91.method1980();
        class91.field1562 = true;
        return var18;
    }

    @ObfuscatedName("ao.c(ZI)Z")
    public final boolean method1030(boolean arg0) {
        int var2 = this.field1131;
        int var3 = this.field1108;
        int var4 = this.field1120;
        if (arg0) {
            var2 = this.field1147;
            var3 = this.field1135;
            var4 = this.field1138;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1631.method3075(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1631.method3075(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1631.method3075(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ao.l(ZB)Lch;")
    public final class100 method1045(boolean arg0) {
        int var2 = this.field1131;
        int var3 = this.field1108;
        int var4 = this.field1120;
        if (arg0) {
            var2 = this.field1147;
            var3 = this.field1135;
            var4 = this.field1138;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2084(Statics.field1631, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2084(Statics.field1631, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2084(Statics.field1631, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1133 != 0) {
            var5.method2096(0, this.field1133, 0);
        }
        if (arg0 && this.field1136 != 0) {
            var5.method2096(0, this.field1136, 0);
        }
        if (this.field1116 != null) {
            for (int var10 = 0; var10 < this.field1116.length; var10++) {
                var5.method2097(this.field1116[var10], this.field1132[var10]);
            }
        }
        if (this.field1118 != null) {
            for (int var11 = 0; var11 < this.field1118.length; var11++) {
                var5.method2149(this.field1118[var11], this.field1153[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ao.p(ZI)Z")
    public final boolean method1032(boolean arg0) {
        int var2 = this.field1139;
        int var3 = this.field1140;
        if (arg0) {
            var2 = this.field1141;
            var3 = this.field1142;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1631.method3075(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1631.method3075(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ao.d(ZI)Lch;")
    public final class100 method1013(boolean arg0) {
        int var2 = this.field1139;
        int var3 = this.field1140;
        if (arg0) {
            var2 = this.field1141;
            var3 = this.field1142;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2084(Statics.field1631, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2084(Statics.field1631, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1116 != null) {
            for (int var7 = 0; var7 < this.field1116.length; var7++) {
                var4.method2097(this.field1116[var7], this.field1132[var7]);
            }
        }
        if (this.field1118 != null) {
            for (int var8 = 0; var8 < this.field1118.length; var8++) {
                var4.method2149(this.field1118[var8], this.field1153[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("eh.i(I)V")
    public static void method2784() {
        field1134.method3541();
        field1111.method3541();
        field1112.method3541();
    }

    @ObfuscatedName("av.x(ZB)V")
    public static void method919(boolean arg0) {
        if (Statics.field681 != arg0) {
            method2784();
            Statics.field681 = arg0;
        }
    }
}

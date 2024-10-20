package deob;

@ObfuscatedName("an")
public class class52 extends class204 {

    @ObfuscatedName("an.y")
    public static class193 field1154 = new class193(64);

    @ObfuscatedName("an.w")
    public static class193 field1119 = new class193(50);

    @ObfuscatedName("an.l")
    public static class193 field1120 = new class193(200);

    @ObfuscatedName("an.k")
    public int field1151;

    @ObfuscatedName("an.o")
    public int field1164;

    @ObfuscatedName("an.u")
    public String field1124 = "null";

    @ObfuscatedName("an.s")
    public short[] field1162;

    @ObfuscatedName("an.g")
    public short[] field1126;

    @ObfuscatedName("an.x")
    public short[] field1142;

    @ObfuscatedName("an.a")
    public short[] field1132;

    @ObfuscatedName("an.t")
    public int field1129 = 2000;

    @ObfuscatedName("an.z")
    public int field1130 = 0;

    @ObfuscatedName("an.r")
    public int field1131 = 0;

    @ObfuscatedName("an.d")
    public int field1114 = 0;

    @ObfuscatedName("an.n")
    public int field1133 = 0;

    @ObfuscatedName("an.j")
    public int field1134 = 0;

    @ObfuscatedName("an.b")
    public int field1135 = 0;

    @ObfuscatedName("an.e")
    public int field1123 = 1;

    @ObfuscatedName("an.ai")
    public boolean field1128 = false;

    @ObfuscatedName("an.ao")
    public String[] field1138 = new String[] { null, null, class157.field2296, null, null };

    @ObfuscatedName("an.af")
    public String[] field1139 = new String[] { null, null, null, null, class157.field2465 };

    @ObfuscatedName("an.ab")
    public int field1140 = -1;

    @ObfuscatedName("an.ax")
    public int field1141 = -1;

    @ObfuscatedName("an.ap")
    public int field1122 = 0;

    @ObfuscatedName("an.as")
    public int field1143 = -1;

    @ObfuscatedName("an.av")
    public int field1144 = -1;

    @ObfuscatedName("an.am")
    public int field1145 = 0;

    @ObfuscatedName("an.aa")
    public int field1136 = -1;

    @ObfuscatedName("an.aq")
    public int field1147 = -1;

    @ObfuscatedName("an.ad")
    public int field1148 = -1;

    @ObfuscatedName("an.ar")
    public int field1149 = -1;

    @ObfuscatedName("an.ag")
    public int field1150 = -1;

    @ObfuscatedName("an.ae")
    public int field1163 = -1;

    @ObfuscatedName("an.ak")
    public int[] field1125;

    @ObfuscatedName("an.az")
    public int[] field1146;

    @ObfuscatedName("an.ac")
    public int field1137 = -1;

    @ObfuscatedName("an.ay")
    public int field1155 = -1;

    @ObfuscatedName("an.al")
    public int field1156 = 128;

    @ObfuscatedName("an.at")
    public int field1157 = 128;

    @ObfuscatedName("an.aj")
    public int field1158 = 128;

    @ObfuscatedName("an.aw")
    public int field1152 = 0;

    @ObfuscatedName("an.au")
    public int field1160 = 0;

    @ObfuscatedName("an.ah")
    public int field1161 = 0;

    @ObfuscatedName("an.an")
    public boolean field1112 = false;

    @ObfuscatedName("an.bm")
    public int field1159 = -1;

    @ObfuscatedName("an.bo")
    public int field1165 = -1;

    @ObfuscatedName("d.h(Lfv;Lfv;ZLhd;I)V")
    public static void method553(class167 arg0, class167 arg1, boolean arg2, class224 arg3) {
        Statics.field1115 = arg0;
        Statics.field1118 = arg1;
        Statics.field784 = arg2;
        Statics.field1117 = Statics.field1115.method3017(10);
        Statics.field1121 = arg3;
    }

    @ObfuscatedName("fg.m(IB)Lan;")
    public static class52 method2933(int arg0) {
        class52 var1 = (class52) field1154.method3472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1115.method3051(10, arg0);
        class52 var3 = new class52();
        var3.field1151 = arg0;
        if (var2 != null) {
            var3.method975(new class119(var2));
        }
        var3.method974();
        if (var3.field1155 != -1) {
            var3.method977(method2933(var3.field1155), method2933(var3.field1137));
        }
        if (var3.field1165 != -1) {
            var3.method978(method2933(var3.field1165), method2933(var3.field1159));
        }
        if (!Statics.field784 && var3.field1128) {
            var3.field1124 = class157.field2386;
            var3.field1112 = false;
            var3.field1138 = null;
            var3.field1139 = null;
            var3.field1161 = 0;
        }
        field1154.method3474(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.i(B)V")
    public void method974() {
    }

    @ObfuscatedName("an.q(Ldp;B)V")
    public void method975(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method976(arg0, var2);
        }
    }

    @ObfuscatedName("an.p(Ldp;II)V")
    public void method976(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1164 = arg0.method2322();
        } else if (arg1 == 2) {
            this.field1124 = arg0.method2350();
        } else if (arg1 == 4) {
            this.field1129 = arg0.method2322();
        } else if (arg1 == 5) {
            this.field1130 = arg0.method2322();
        } else if (arg1 == 6) {
            this.field1131 = arg0.method2322();
        } else if (arg1 == 7) {
            this.field1133 = arg0.method2322();
            if (this.field1133 > 32767) {
                this.field1133 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1134 = arg0.method2322();
            if (this.field1134 > 32767) {
                this.field1134 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1135 = 1;
        } else if (arg1 == 12) {
            this.field1123 = arg0.method2324();
        } else if (arg1 == 16) {
            this.field1128 = true;
        } else if (arg1 == 23) {
            this.field1140 = arg0.method2322();
            this.field1122 = arg0.method2320();
        } else if (arg1 == 24) {
            this.field1141 = arg0.method2322();
        } else if (arg1 == 25) {
            this.field1143 = arg0.method2322();
            this.field1145 = arg0.method2320();
        } else if (arg1 == 26) {
            this.field1144 = arg0.method2322();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1138[arg1 - 30] = arg0.method2350();
            if (this.field1138[arg1 - 30].equalsIgnoreCase(class157.field2298)) {
                this.field1138[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1139[arg1 - 35] = arg0.method2350();
        } else if (arg1 == 40) {
            int var3 = arg0.method2320();
            this.field1162 = new short[var3];
            this.field1126 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1162[var4] = (short) arg0.method2322();
                this.field1126[var4] = (short) arg0.method2322();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2320();
            this.field1142 = new short[var5];
            this.field1132 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1142[var6] = (short) arg0.method2322();
                this.field1132[var6] = (short) arg0.method2322();
            }
        } else if (arg1 == 65) {
            this.field1112 = true;
        } else if (arg1 == 78) {
            this.field1136 = arg0.method2322();
        } else if (arg1 == 79) {
            this.field1147 = arg0.method2322();
        } else if (arg1 == 90) {
            this.field1148 = arg0.method2322();
        } else if (arg1 == 91) {
            this.field1150 = arg0.method2322();
        } else if (arg1 == 92) {
            this.field1149 = arg0.method2322();
        } else if (arg1 == 93) {
            this.field1163 = arg0.method2322();
        } else if (arg1 == 95) {
            this.field1114 = arg0.method2322();
        } else if (arg1 == 97) {
            this.field1137 = arg0.method2322();
        } else if (arg1 == 98) {
            this.field1155 = arg0.method2322();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1125 == null) {
                this.field1125 = new int[10];
                this.field1146 = new int[10];
            }
            this.field1125[arg1 - 100] = arg0.method2322();
            this.field1146[arg1 - 100] = arg0.method2322();
        } else if (arg1 == 110) {
            this.field1156 = arg0.method2322();
        } else if (arg1 == 111) {
            this.field1157 = arg0.method2322();
        } else if (arg1 == 112) {
            this.field1158 = arg0.method2322();
        } else if (arg1 == 113) {
            this.field1152 = arg0.method2425();
        } else if (arg1 == 114) {
            this.field1160 = arg0.method2425() * 5;
        } else if (arg1 == 115) {
            this.field1161 = arg0.method2320();
        } else if (arg1 == 139) {
            this.field1159 = arg0.method2322();
        } else if (arg1 == 140) {
            this.field1165 = arg0.method2322();
        }
    }

    @ObfuscatedName("an.c(Lan;Lan;B)V")
    public void method977(class52 arg0, class52 arg1) {
        this.field1164 = arg0.field1164;
        this.field1129 = arg0.field1129;
        this.field1130 = arg0.field1130;
        this.field1131 = arg0.field1131;
        this.field1114 = arg0.field1114;
        this.field1133 = arg0.field1133;
        this.field1134 = arg0.field1134;
        this.field1162 = arg0.field1162;
        this.field1126 = arg0.field1126;
        this.field1142 = arg0.field1142;
        this.field1132 = arg0.field1132;
        this.field1124 = arg1.field1124;
        this.field1128 = arg1.field1128;
        this.field1123 = arg1.field1123;
        this.field1135 = 1;
    }

    @ObfuscatedName("an.f(Lan;Lan;I)V")
    public void method978(class52 arg0, class52 arg1) {
        this.field1164 = arg0.field1164;
        this.field1129 = arg0.field1129;
        this.field1130 = arg0.field1130;
        this.field1131 = arg0.field1131;
        this.field1114 = arg0.field1114;
        this.field1133 = arg0.field1133;
        this.field1134 = arg0.field1134;
        this.field1162 = arg1.field1162;
        this.field1126 = arg1.field1126;
        this.field1142 = arg1.field1142;
        this.field1132 = arg1.field1132;
        this.field1124 = arg1.field1124;
        this.field1128 = arg1.field1128;
        this.field1135 = arg1.field1135;
        this.field1140 = arg1.field1140;
        this.field1141 = arg1.field1141;
        this.field1136 = arg1.field1136;
        this.field1143 = arg1.field1143;
        this.field1144 = arg1.field1144;
        this.field1147 = arg1.field1147;
        this.field1148 = arg1.field1148;
        this.field1149 = arg1.field1149;
        this.field1150 = arg1.field1150;
        this.field1163 = arg1.field1163;
        this.field1161 = arg1.field1161;
        this.field1138 = arg1.field1138;
        this.field1139 = new String[5];
        if (arg1.field1139 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1139[var3] = arg1.field1139[var3];
            }
        }
        this.field1139[4] = class157.field2302;
        this.field1123 = 0;
    }

    @ObfuscatedName("an.y(II)Lcl;")
    public final class100 method1006(int arg0) {
        if (this.field1125 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1146[var3] && this.field1146[var3] != 0) {
                    var2 = this.field1125[var3];
                }
            }
            if (var2 != -1) {
                return method2933(var2).method1006(1);
            }
        }
        class100 var4 = class100.method2081(Statics.field1118, this.field1164, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1156 != 128 || this.field1157 != 128 || this.field1158 != 128) {
            var4.method2071(this.field1156, this.field1157, this.field1158);
        }
        if (this.field1162 != null) {
            for (int var5 = 0; var5 < this.field1162.length; var5++) {
                var4.method2098(this.field1162[var5], this.field1126[var5]);
            }
        }
        if (this.field1142 != null) {
            for (int var6 = 0; var6 < this.field1142.length; var6++) {
                var4.method2038(this.field1142[var6], this.field1132[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("an.w(II)Ldb;")
    public final class105 method980(int arg0) {
        if (this.field1125 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1146[var3] && this.field1146[var3] != 0) {
                    var2 = this.field1125[var3];
                }
            }
            if (var2 != -1) {
                return method2933(var2).method980(1);
            }
        }
        class105 var4 = (class105) field1119.method3472((long) this.field1151);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2081(Statics.field1118, this.field1164, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1156 != 128 || this.field1157 != 128 || this.field1158 != 128) {
            var5.method2071(this.field1156, this.field1157, this.field1158);
        }
        if (this.field1162 != null) {
            for (int var6 = 0; var6 < this.field1162.length; var6++) {
                var5.method2098(this.field1162[var6], this.field1126[var6]);
            }
        }
        if (this.field1142 != null) {
            for (int var7 = 0; var7 < this.field1142.length; var7++) {
                var5.method2038(this.field1142[var7], this.field1132[var7]);
            }
        }
        class105 var8 = var5.method2067(this.field1152 + 64, this.field1160 + 768, -50, -10, -50);
        var8.field1807 = true;
        field1119.method3474(var8, (long) this.field1151);
        return var8;
    }

    @ObfuscatedName("an.l(II)Lan;")
    public class52 method981(int arg0) {
        if (this.field1125 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1146[var3] && this.field1146[var3] != 0) {
                    var2 = this.field1125[var3];
                }
            }
            if (var2 != -1) {
                return method2933(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ek.v(IIIIIZB)Lcg;")
    public static final class79 method2820(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1120.method3472(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method2933(arg0);
        if (arg1 > 1 && var9.field1125 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1146[var11] && var9.field1146[var11] != 0) {
                    var10 = var9.field1125[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2933(var10);
            }
        }
        class105 var12 = var9.method980(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1155 != -1) {
            var13 = method2820(var9.field1137, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1165 != -1) {
            var13 = method2820(var9.field1159, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1425;
        int var15 = Statics.field1423;
        int var16 = Statics.field1424;
        int[] var17 = new int[4];
        class80.method1659(var17);
        class79 var18 = new class79(36, 32);
        class80.method1655(var18.field1421, 36, 32);
        class80.method1697();
        class91.method1940();
        class91.method1943(16, 16);
        class91.field1581 = false;
        int var19 = var9.field1129;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1561[var9.field1130] * var19 >> 16;
        int var21 = class91.field1585[var9.field1130] * var19 >> 16;
        var12.method2121();
        var12.method2132(0, var9.field1131, var9.field1114, var9.field1130, var9.field1133, var9.field1134 + var12.field1458 / 2 + var20, var9.field1134 + var21);
        if (var9.field1165 != -1) {
            var13.method1589(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1598(1);
        }
        if (arg2 >= 2) {
            var18.method1598(16777215);
        }
        if (arg3 != 0) {
            var18.method1610(arg3);
        }
        class80.method1655(var18.field1421, 36, 32);
        if (var9.field1155 != -1) {
            var13.method1589(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1135 == 1) {
            Statics.field1121.method3734(method820(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1120.method3474(var18, var6);
        }
        class80.method1655(var14, var15, var16);
        class80.method1713(var17);
        class91.method1940();
        class91.field1581 = true;
        return var18;
    }

    @ObfuscatedName("ak.k(II)Ljava/lang/String;")
    public static final String method820(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class157.field2460 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class157.field2458 + "</col>";
        }
    }

    @ObfuscatedName("an.o(ZB)Z")
    public final boolean method1014(boolean arg0) {
        int var2 = this.field1140;
        int var3 = this.field1141;
        int var4 = this.field1136;
        if (arg0) {
            var2 = this.field1143;
            var3 = this.field1144;
            var4 = this.field1147;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1118.method3080(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1118.method3080(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1118.method3080(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("an.u(ZI)Lcl;")
    public final class100 method1022(boolean arg0) {
        int var2 = this.field1140;
        int var3 = this.field1141;
        int var4 = this.field1136;
        if (arg0) {
            var2 = this.field1143;
            var3 = this.field1144;
            var4 = this.field1147;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2081(Statics.field1118, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2081(Statics.field1118, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2081(Statics.field1118, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1122 != 0) {
            var5.method2037(0, this.field1122, 0);
        }
        if (arg0 && this.field1145 != 0) {
            var5.method2037(0, this.field1145, 0);
        }
        if (this.field1162 != null) {
            for (int var10 = 0; var10 < this.field1162.length; var10++) {
                var5.method2098(this.field1162[var10], this.field1126[var10]);
            }
        }
        if (this.field1142 != null) {
            for (int var11 = 0; var11 < this.field1142.length; var11++) {
                var5.method2038(this.field1142[var11], this.field1132[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("an.s(ZI)Z")
    public final boolean method993(boolean arg0) {
        int var2 = this.field1148;
        int var3 = this.field1149;
        if (arg0) {
            var2 = this.field1150;
            var3 = this.field1163;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1118.method3080(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1118.method3080(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("an.g(ZI)Lcl;")
    public final class100 method998(boolean arg0) {
        int var2 = this.field1148;
        int var3 = this.field1149;
        if (arg0) {
            var2 = this.field1150;
            var3 = this.field1163;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2081(Statics.field1118, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2081(Statics.field1118, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1162 != null) {
            for (int var7 = 0; var7 < this.field1162.length; var7++) {
                var4.method2098(this.field1162[var7], this.field1126[var7]);
            }
        }
        if (this.field1142 != null) {
            for (int var8 = 0; var8 < this.field1142.length; var8++) {
                var4.method2038(this.field1142[var8], this.field1132[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("b.x(B)V")
    public static void method571() {
        field1154.method3483();
        field1119.method3483();
        field1120.method3483();
    }

    @ObfuscatedName("y.a(I)V")
    public static void method94() {
        field1120.method3483();
    }
}

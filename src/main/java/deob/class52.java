package deob;

@ObfuscatedName("as")
public class class52 extends class204 {

    @ObfuscatedName("as.n")
    public static class193 field1115 = new class193(64);

    @ObfuscatedName("as.l")
    public static class193 field1116 = new class193(50);

    @ObfuscatedName("as.i")
    public static class193 field1152 = new class193(200);

    @ObfuscatedName("as.v")
    public int field1119;

    @ObfuscatedName("as.o")
    public int field1120;

    @ObfuscatedName("as.p")
    public String field1117 = "null";

    @ObfuscatedName("as.b")
    public short[] field1136;

    @ObfuscatedName("as.z")
    public short[] field1143;

    @ObfuscatedName("as.k")
    public short[] field1124;

    @ObfuscatedName("as.r")
    public short[] field1125;

    @ObfuscatedName("as.d")
    public int field1126 = 2000;

    @ObfuscatedName("as.u")
    public int field1162 = 0;

    @ObfuscatedName("as.a")
    public int field1128 = 0;

    @ObfuscatedName("as.x")
    public int field1129 = 0;

    @ObfuscatedName("as.y")
    public int field1130 = 0;

    @ObfuscatedName("as.c")
    public int field1131 = 0;

    @ObfuscatedName("as.h")
    public int field1109 = 0;

    @ObfuscatedName("as.e")
    public int field1133 = 1;

    @ObfuscatedName("as.ab")
    public boolean field1134 = false;

    @ObfuscatedName("as.af")
    public String[] field1135 = new String[] { null, null, class157.field2354, null, null };

    @ObfuscatedName("as.au")
    public String[] field1127 = new String[] { null, null, null, null, class157.field2391 };

    @ObfuscatedName("as.ae")
    public int field1137 = -1;

    @ObfuscatedName("as.ax")
    public int field1138 = -1;

    @ObfuscatedName("as.az")
    public int field1139 = 0;

    @ObfuscatedName("as.aa")
    public int field1140 = -1;

    @ObfuscatedName("as.ak")
    public int field1141 = -1;

    @ObfuscatedName("as.ac")
    public int field1142 = 0;

    @ObfuscatedName("as.ar")
    public int field1144 = -1;

    @ObfuscatedName("as.ah")
    public int field1113 = -1;

    @ObfuscatedName("as.an")
    public int field1132 = -1;

    @ObfuscatedName("as.aq")
    public int field1146 = -1;

    @ObfuscatedName("as.at")
    public int field1156 = -1;

    @ObfuscatedName("as.am")
    public int field1145 = -1;

    @ObfuscatedName("as.av")
    public int[] field1149;

    @ObfuscatedName("as.ai")
    public int[] field1150;

    @ObfuscatedName("as.ay")
    public int field1151 = -1;

    @ObfuscatedName("as.aw")
    public int field1160 = -1;

    @ObfuscatedName("as.ap")
    public int field1122 = 128;

    @ObfuscatedName("as.aj")
    public int field1154 = 128;

    @ObfuscatedName("as.ao")
    public int field1155 = 128;

    @ObfuscatedName("as.ad")
    public int field1153 = 0;

    @ObfuscatedName("as.ag")
    public int field1157 = 0;

    @ObfuscatedName("as.al")
    public int field1121 = 0;

    @ObfuscatedName("as.as")
    public boolean field1123 = false;

    @ObfuscatedName("as.bi")
    public int field1147 = -1;

    @ObfuscatedName("as.be")
    public int field1161 = -1;

    @ObfuscatedName("as.s(I)V")
    public void method1048() {
    }

    @ObfuscatedName("as.q(Ldn;B)V")
    public void method1013(class119 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1014(arg0, var2);
        }
    }

    @ObfuscatedName("as.g(Ldn;II)V")
    public void method1014(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1120 = arg0.method2353();
        } else if (arg1 == 2) {
            this.field1117 = arg0.method2365();
        } else if (arg1 == 4) {
            this.field1126 = arg0.method2353();
        } else if (arg1 == 5) {
            this.field1162 = arg0.method2353();
        } else if (arg1 == 6) {
            this.field1128 = arg0.method2353();
        } else if (arg1 == 7) {
            this.field1130 = arg0.method2353();
            if (this.field1130 > 32767) {
                this.field1130 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1131 = arg0.method2353();
            if (this.field1131 > 32767) {
                this.field1131 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1109 = 1;
        } else if (arg1 == 12) {
            this.field1133 = arg0.method2368();
        } else if (arg1 == 16) {
            this.field1134 = true;
        } else if (arg1 == 23) {
            this.field1137 = arg0.method2353();
            this.field1139 = arg0.method2363();
        } else if (arg1 == 24) {
            this.field1138 = arg0.method2353();
        } else if (arg1 == 25) {
            this.field1140 = arg0.method2353();
            this.field1142 = arg0.method2363();
        } else if (arg1 == 26) {
            this.field1141 = arg0.method2353();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1135[arg1 - 30] = arg0.method2365();
            if (this.field1135[arg1 - 30].equalsIgnoreCase(class157.field2503)) {
                this.field1135[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1127[arg1 - 35] = arg0.method2365();
        } else if (arg1 == 40) {
            int var3 = arg0.method2363();
            this.field1136 = new short[var3];
            this.field1143 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1136[var4] = (short) arg0.method2353();
                this.field1143[var4] = (short) arg0.method2353();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2363();
            this.field1124 = new short[var5];
            this.field1125 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1124[var6] = (short) arg0.method2353();
                this.field1125[var6] = (short) arg0.method2353();
            }
        } else if (arg1 == 65) {
            this.field1123 = true;
        } else if (arg1 == 78) {
            this.field1144 = arg0.method2353();
        } else if (arg1 == 79) {
            this.field1113 = arg0.method2353();
        } else if (arg1 == 90) {
            this.field1132 = arg0.method2353();
        } else if (arg1 == 91) {
            this.field1156 = arg0.method2353();
        } else if (arg1 == 92) {
            this.field1146 = arg0.method2353();
        } else if (arg1 == 93) {
            this.field1145 = arg0.method2353();
        } else if (arg1 == 95) {
            this.field1129 = arg0.method2353();
        } else if (arg1 == 97) {
            this.field1151 = arg0.method2353();
        } else if (arg1 == 98) {
            this.field1160 = arg0.method2353();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1149 == null) {
                this.field1149 = new int[10];
                this.field1150 = new int[10];
            }
            this.field1149[arg1 - 100] = arg0.method2353();
            this.field1150[arg1 - 100] = arg0.method2353();
        } else if (arg1 == 110) {
            this.field1122 = arg0.method2353();
        } else if (arg1 == 111) {
            this.field1154 = arg0.method2353();
        } else if (arg1 == 112) {
            this.field1155 = arg0.method2353();
        } else if (arg1 == 113) {
            this.field1153 = arg0.method2364();
        } else if (arg1 == 114) {
            this.field1157 = arg0.method2364() * 5;
        } else if (arg1 == 115) {
            this.field1121 = arg0.method2363();
        } else if (arg1 == 139) {
            this.field1147 = arg0.method2353();
        } else if (arg1 == 140) {
            this.field1161 = arg0.method2353();
        }
    }

    @ObfuscatedName("as.m(Las;Las;I)V")
    public void method1047(class52 arg0, class52 arg1) {
        this.field1120 = arg0.field1120;
        this.field1126 = arg0.field1126;
        this.field1162 = arg0.field1162;
        this.field1128 = arg0.field1128;
        this.field1129 = arg0.field1129;
        this.field1130 = arg0.field1130;
        this.field1131 = arg0.field1131;
        this.field1136 = arg0.field1136;
        this.field1143 = arg0.field1143;
        this.field1124 = arg0.field1124;
        this.field1125 = arg0.field1125;
        this.field1117 = arg1.field1117;
        this.field1134 = arg1.field1134;
        this.field1133 = arg1.field1133;
        this.field1109 = 1;
    }

    @ObfuscatedName("as.t(Las;Las;S)V")
    public void method1016(class52 arg0, class52 arg1) {
        this.field1120 = arg0.field1120;
        this.field1126 = arg0.field1126;
        this.field1162 = arg0.field1162;
        this.field1128 = arg0.field1128;
        this.field1129 = arg0.field1129;
        this.field1130 = arg0.field1130;
        this.field1131 = arg0.field1131;
        this.field1136 = arg1.field1136;
        this.field1143 = arg1.field1143;
        this.field1124 = arg1.field1124;
        this.field1125 = arg1.field1125;
        this.field1117 = arg1.field1117;
        this.field1134 = arg1.field1134;
        this.field1109 = arg1.field1109;
        this.field1137 = arg1.field1137;
        this.field1138 = arg1.field1138;
        this.field1144 = arg1.field1144;
        this.field1140 = arg1.field1140;
        this.field1141 = arg1.field1141;
        this.field1113 = arg1.field1113;
        this.field1132 = arg1.field1132;
        this.field1146 = arg1.field1146;
        this.field1156 = arg1.field1156;
        this.field1145 = arg1.field1145;
        this.field1121 = arg1.field1121;
        this.field1135 = arg1.field1135;
        this.field1127 = new String[5];
        if (arg1.field1127 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1127[var3] = arg1.field1127[var3];
            }
        }
        this.field1127[4] = class157.field2302;
        this.field1133 = 0;
    }

    @ObfuscatedName("as.j(II)Lcx;")
    public final class100 method1017(int arg0) {
        if (this.field1149 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1150[var3] && this.field1150[var3] != 0) {
                    var2 = this.field1149[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method975(var2).method1017(1);
            }
        }
        class100 var4 = class100.method2068(Statics.field3135, this.field1120, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1122 != 128 || this.field1154 != 128 || this.field1155 != 128) {
            var4.method2085(this.field1122, this.field1154, this.field1155);
        }
        if (this.field1136 != null) {
            for (int var5 = 0; var5 < this.field1136.length; var5++) {
                var4.method2082(this.field1136[var5], this.field1143[var5]);
            }
        }
        if (this.field1124 != null) {
            for (int var6 = 0; var6 < this.field1124.length; var6++) {
                var4.method2083(this.field1124[var6], this.field1125[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("as.n(IB)Ldu;")
    public final class105 method1018(int arg0) {
        if (this.field1149 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1150[var3] && this.field1150[var3] != 0) {
                    var2 = this.field1149[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method975(var2).method1018(1);
            }
        }
        class105 var4 = (class105) field1116.method3497((long) this.field1119);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2068(Statics.field3135, this.field1120, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1122 != 128 || this.field1154 != 128 || this.field1155 != 128) {
            var5.method2085(this.field1122, this.field1154, this.field1155);
        }
        if (this.field1136 != null) {
            for (int var6 = 0; var6 < this.field1136.length; var6++) {
                var5.method2082(this.field1136[var6], this.field1143[var6]);
            }
        }
        if (this.field1124 != null) {
            for (int var7 = 0; var7 < this.field1124.length; var7++) {
                var5.method2083(this.field1124[var7], this.field1125[var7]);
            }
        }
        class105 var8 = var5.method2090(this.field1153 + 64, this.field1157 + 768, -50, -10, -50);
        var8.field1821 = true;
        field1116.method3508(var8, (long) this.field1119);
        return var8;
    }

    @ObfuscatedName("as.l(II)Las;")
    public class52 method1045(int arg0) {
        if (this.field1149 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1150[var3] && this.field1150[var3] != 0) {
                    var2 = this.field1149[var3];
                }
            }
            if (var2 != -1) {
                return Statics.method975(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("er.i(IIIIIZB)Lcp;")
    public static final class79 method2794(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1152.method3497(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = Statics.method975(arg0);
        if (arg1 > 1 && var9.field1149 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1150[var11] && var9.field1150[var11] != 0) {
                    var10 = var9.field1149[var11];
                }
            }
            if (var10 != -1) {
                var9 = Statics.method975(var10);
            }
        }
        class105 var12 = var9.method1018(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1160 != -1) {
            var13 = method2794(var9.field1151, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1161 != -1) {
            var13 = method2794(var9.field1147, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1426;
        int var15 = Statics.field1424;
        int var16 = Statics.field1423;
        int[] var17 = new int[4];
        class80.method1705(var17);
        class79 var18 = new class79(36, 32);
        class80.method1701(var18.field1411, 36, 32);
        class80.method1707();
        class91.method1965();
        class91.method2021(16, 16);
        class91.field1571 = false;
        int var19 = var9.field1126;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1579[var9.field1162] * var19 >> 16;
        int var21 = class91.field1591[var9.field1162] * var19 >> 16;
        var12.method2161();
        var12.method2179(0, var9.field1128, var9.field1129, var9.field1162, var9.field1130, var9.field1131 + var12.field1462 / 2 + var20, var9.field1131 + var21);
        if (var9.field1161 != -1) {
            var13.method1624(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1620(1);
        }
        if (arg2 >= 2) {
            var18.method1620(16777215);
        }
        if (arg3 != 0) {
            var18.method1621(arg3);
        }
        class80.method1701(var18.field1411, 36, 32);
        if (var9.field1160 != -1) {
            var13.method1624(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1109 == 1) {
            class224 var22 = Statics.field1118;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class157.field2416 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class157.field2458 + "</col>";
            }
            var22.method3796(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1152.method3508(var18, var6);
        }
        class80.method1701(var14, var15, var16);
        class80.method1737(var17);
        class91.method1965();
        class91.field1571 = true;
        return var18;
    }

    @ObfuscatedName("as.w(ZB)Z")
    public final boolean method1015(boolean arg0) {
        int var2 = this.field1137;
        int var3 = this.field1138;
        int var4 = this.field1144;
        if (arg0) {
            var2 = this.field1140;
            var3 = this.field1141;
            var4 = this.field1113;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3135.method3061(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3135.method3061(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3135.method3061(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("as.v(ZI)Lcx;")
    public final class100 method1021(boolean arg0) {
        int var2 = this.field1137;
        int var3 = this.field1138;
        int var4 = this.field1144;
        if (arg0) {
            var2 = this.field1140;
            var3 = this.field1141;
            var4 = this.field1113;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2068(Statics.field3135, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2068(Statics.field3135, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2068(Statics.field3135, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1139 != 0) {
            var5.method2093(0, this.field1139, 0);
        }
        if (arg0 && this.field1142 != 0) {
            var5.method2093(0, this.field1142, 0);
        }
        if (this.field1136 != null) {
            for (int var10 = 0; var10 < this.field1136.length; var10++) {
                var5.method2082(this.field1136[var10], this.field1143[var10]);
            }
        }
        if (this.field1124 != null) {
            for (int var11 = 0; var11 < this.field1124.length; var11++) {
                var5.method2083(this.field1124[var11], this.field1125[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("as.o(ZI)Z")
    public final boolean method1022(boolean arg0) {
        int var2 = this.field1132;
        int var3 = this.field1146;
        if (arg0) {
            var2 = this.field1156;
            var3 = this.field1145;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3135.method3061(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3135.method3061(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("as.p(ZB)Lcx;")
    public final class100 method1023(boolean arg0) {
        int var2 = this.field1132;
        int var3 = this.field1146;
        if (arg0) {
            var2 = this.field1156;
            var3 = this.field1145;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2068(Statics.field3135, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2068(Statics.field3135, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1136 != null) {
            for (int var7 = 0; var7 < this.field1136.length; var7++) {
                var4.method2082(this.field1136[var7], this.field1143[var7]);
            }
        }
        if (this.field1124 != null) {
            for (int var8 = 0; var8 < this.field1124.length; var8++) {
                var4.method2083(this.field1124[var8], this.field1125[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("j.b(I)V")
    public static void method100() {
        field1152.method3499();
    }

    @ObfuscatedName("an.z(ZB)V")
    public static void method735(boolean arg0) {
        if (Statics.field1148 != arg0) {
            field1115.method3499();
            field1116.method3499();
            field1152.method3499();
            Statics.field1148 = arg0;
        }
    }
}

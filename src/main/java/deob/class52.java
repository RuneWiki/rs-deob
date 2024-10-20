package deob;

@ObfuscatedName("ah")
public class class52 extends class204 {

    @ObfuscatedName("ah.w")
    public static class193 field1107 = new class193(64);

    @ObfuscatedName("ah.m")
    public static class193 field1108 = new class193(50);

    @ObfuscatedName("ah.r")
    public static class193 field1126 = new class193(200);

    @ObfuscatedName("ah.q")
    public int field1151;

    @ObfuscatedName("ah.f")
    public int field1142;

    @ObfuscatedName("ah.x")
    public String field1145 = "null";

    @ObfuscatedName("ah.d")
    public short[] field1103;

    @ObfuscatedName("ah.e")
    public short[] field1116;

    @ObfuscatedName("ah.l")
    public short[] field1113;

    @ObfuscatedName("ah.u")
    public short[] field1117;

    @ObfuscatedName("ah.a")
    public int field1118 = 2000;

    @ObfuscatedName("ah.b")
    public int field1119 = 0;

    @ObfuscatedName("ah.s")
    public int field1120 = 0;

    @ObfuscatedName("ah.v")
    public int field1104 = 0;

    @ObfuscatedName("ah.j")
    public int field1122 = 0;

    @ObfuscatedName("ah.z")
    public int field1123 = 0;

    @ObfuscatedName("ah.n")
    public int field1121 = 0;

    @ObfuscatedName("ah.p")
    public int field1125 = 1;

    @ObfuscatedName("ah.aj")
    public boolean field1130 = false;

    @ObfuscatedName("ah.aq")
    public String[] field1124 = new String[] { null, null, class157.field2286, null, null };

    @ObfuscatedName("ah.aw")
    public String[] field1128 = new String[] { null, null, null, null, class157.field2361 };

    @ObfuscatedName("ah.az")
    public int field1129 = -1;

    @ObfuscatedName("ah.at")
    public int field1133 = -1;

    @ObfuscatedName("ah.af")
    public int field1131 = 0;

    @ObfuscatedName("ah.ax")
    public int field1134 = -1;

    @ObfuscatedName("ah.ac")
    public int field1139 = -1;

    @ObfuscatedName("ah.am")
    public int field1111 = 0;

    @ObfuscatedName("ah.ao")
    public int field1135 = -1;

    @ObfuscatedName("ah.ad")
    public int field1136 = -1;

    @ObfuscatedName("ah.ak")
    public int field1137 = -1;

    @ObfuscatedName("ah.au")
    public int field1138 = -1;

    @ObfuscatedName("ah.aa")
    public int field1115 = -1;

    @ObfuscatedName("ah.ai")
    public int field1140 = -1;

    @ObfuscatedName("ah.av")
    public int[] field1141;

    @ObfuscatedName("ah.ar")
    public int[] field1152;

    @ObfuscatedName("ah.as")
    public int field1143 = -1;

    @ObfuscatedName("ah.ap")
    public int field1144 = -1;

    @ObfuscatedName("ah.ag")
    public int field1114 = 128;

    @ObfuscatedName("ah.ab")
    public int field1146 = 128;

    @ObfuscatedName("ah.al")
    public int field1147 = 128;

    @ObfuscatedName("ah.ae")
    public int field1148 = 0;

    @ObfuscatedName("ah.ay")
    public int field1149 = 0;

    @ObfuscatedName("ah.an")
    public int field1150 = 0;

    @ObfuscatedName("ah.ah")
    public boolean field1132 = false;

    @ObfuscatedName("ah.be")
    public int field1109 = -1;

    @ObfuscatedName("ah.bb")
    public int field1153 = -1;

    @ObfuscatedName("gk.c(Lfj;Lfj;ZLhf;I)V")
    public static void method3476(class167 arg0, class167 arg1, boolean arg2, class224 arg3) {
        Statics.field3187 = arg0;
        Statics.field1105 = arg1;
        Statics.field1106 = arg2;
        Statics.field2032 = Statics.field3187.method3046(10);
        Statics.field1110 = arg3;
    }

    @ObfuscatedName("ay.h(II)Lah;")
    public static class52 method971(int arg0) {
        class52 var1 = (class52) field1107.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3187.method2994(10, arg0);
        class52 var3 = new class52();
        var3.field1151 = arg0;
        if (var2 != null) {
            var3.method987(new class119(var2));
        }
        var3.method1001();
        if (var3.field1144 != -1) {
            var3.method990(method971(var3.field1144), method971(var3.field1143));
        }
        if (var3.field1153 != -1) {
            var3.method1025(method971(var3.field1153), method971(var3.field1109));
        }
        if (!Statics.field1106 && var3.field1130) {
            var3.field1145 = class157.field2386;
            var3.field1132 = false;
            var3.field1124 = null;
            var3.field1128 = null;
            var3.field1150 = 0;
        }
        field1107.method3487(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.k(I)V")
    public void method1001() {
    }

    @ObfuscatedName("ah.t(Ldf;I)V")
    public void method987(class119 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method988(arg0, var2);
        }
    }

    @ObfuscatedName("ah.g(Ldf;II)V")
    public void method988(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1142 = arg0.method2293();
        } else if (arg1 == 2) {
            this.field1145 = arg0.method2299();
        } else if (arg1 == 4) {
            this.field1118 = arg0.method2293();
        } else if (arg1 == 5) {
            this.field1119 = arg0.method2293();
        } else if (arg1 == 6) {
            this.field1120 = arg0.method2293();
        } else if (arg1 == 7) {
            this.field1122 = arg0.method2293();
            if (this.field1122 > 32767) {
                this.field1122 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1123 = arg0.method2293();
            if (this.field1123 > 32767) {
                this.field1123 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1121 = 1;
        } else if (arg1 == 12) {
            this.field1125 = arg0.method2296();
        } else if (arg1 == 16) {
            this.field1130 = true;
        } else if (arg1 == 23) {
            this.field1129 = arg0.method2293();
            this.field1131 = arg0.method2291();
        } else if (arg1 == 24) {
            this.field1133 = arg0.method2293();
        } else if (arg1 == 25) {
            this.field1134 = arg0.method2293();
            this.field1111 = arg0.method2291();
        } else if (arg1 == 26) {
            this.field1139 = arg0.method2293();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1124[arg1 - 30] = arg0.method2299();
            if (this.field1124[arg1 - 30].equalsIgnoreCase(class157.field2348)) {
                this.field1124[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1128[arg1 - 35] = arg0.method2299();
        } else if (arg1 == 40) {
            int var3 = arg0.method2291();
            this.field1103 = new short[var3];
            this.field1116 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1103[var4] = (short) arg0.method2293();
                this.field1116[var4] = (short) arg0.method2293();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2291();
            this.field1113 = new short[var5];
            this.field1117 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1113[var6] = (short) arg0.method2293();
                this.field1117[var6] = (short) arg0.method2293();
            }
        } else if (arg1 == 65) {
            this.field1132 = true;
        } else if (arg1 == 78) {
            this.field1135 = arg0.method2293();
        } else if (arg1 == 79) {
            this.field1136 = arg0.method2293();
        } else if (arg1 == 90) {
            this.field1137 = arg0.method2293();
        } else if (arg1 == 91) {
            this.field1115 = arg0.method2293();
        } else if (arg1 == 92) {
            this.field1138 = arg0.method2293();
        } else if (arg1 == 93) {
            this.field1140 = arg0.method2293();
        } else if (arg1 == 95) {
            this.field1104 = arg0.method2293();
        } else if (arg1 == 97) {
            this.field1143 = arg0.method2293();
        } else if (arg1 == 98) {
            this.field1144 = arg0.method2293();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1141 == null) {
                this.field1141 = new int[10];
                this.field1152 = new int[10];
            }
            this.field1141[arg1 - 100] = arg0.method2293();
            this.field1152[arg1 - 100] = arg0.method2293();
        } else if (arg1 == 110) {
            this.field1114 = arg0.method2293();
        } else if (arg1 == 111) {
            this.field1146 = arg0.method2293();
        } else if (arg1 == 112) {
            this.field1147 = arg0.method2293();
        } else if (arg1 == 113) {
            this.field1148 = arg0.method2292();
        } else if (arg1 == 114) {
            this.field1149 = arg0.method2292() * 5;
        } else if (arg1 == 115) {
            this.field1150 = arg0.method2291();
        } else if (arg1 == 139) {
            this.field1109 = arg0.method2293();
        } else if (arg1 == 140) {
            this.field1153 = arg0.method2293();
        }
    }

    @ObfuscatedName("ah.o(Lah;Lah;I)V")
    public void method990(class52 arg0, class52 arg1) {
        this.field1142 = arg0.field1142;
        this.field1118 = arg0.field1118;
        this.field1119 = arg0.field1119;
        this.field1120 = arg0.field1120;
        this.field1104 = arg0.field1104;
        this.field1122 = arg0.field1122;
        this.field1123 = arg0.field1123;
        this.field1103 = arg0.field1103;
        this.field1116 = arg0.field1116;
        this.field1113 = arg0.field1113;
        this.field1117 = arg0.field1117;
        this.field1145 = arg1.field1145;
        this.field1130 = arg1.field1130;
        this.field1125 = arg1.field1125;
        this.field1121 = 1;
    }

    @ObfuscatedName("ah.i(Lah;Lah;I)V")
    public void method1025(class52 arg0, class52 arg1) {
        this.field1142 = arg0.field1142;
        this.field1118 = arg0.field1118;
        this.field1119 = arg0.field1119;
        this.field1120 = arg0.field1120;
        this.field1104 = arg0.field1104;
        this.field1122 = arg0.field1122;
        this.field1123 = arg0.field1123;
        this.field1103 = arg1.field1103;
        this.field1116 = arg1.field1116;
        this.field1113 = arg1.field1113;
        this.field1117 = arg1.field1117;
        this.field1145 = arg1.field1145;
        this.field1130 = arg1.field1130;
        this.field1121 = arg1.field1121;
        this.field1129 = arg1.field1129;
        this.field1133 = arg1.field1133;
        this.field1135 = arg1.field1135;
        this.field1134 = arg1.field1134;
        this.field1139 = arg1.field1139;
        this.field1136 = arg1.field1136;
        this.field1137 = arg1.field1137;
        this.field1138 = arg1.field1138;
        this.field1115 = arg1.field1115;
        this.field1140 = arg1.field1140;
        this.field1150 = arg1.field1150;
        this.field1124 = arg1.field1124;
        this.field1128 = new String[5];
        if (arg1.field1128 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1128[var3] = arg1.field1128[var3];
            }
        }
        this.field1128[4] = class157.field2499;
        this.field1125 = 0;
    }

    @ObfuscatedName("ah.w(IB)Lch;")
    public final class100 method991(int arg0) {
        if (this.field1141 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1152[var3] && this.field1152[var3] != 0) {
                    var2 = this.field1141[var3];
                }
            }
            if (var2 != -1) {
                return method971(var2).method991(1);
            }
        }
        class100 var4 = class100.method2063(Statics.field1105, this.field1142, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1114 != 128 || this.field1146 != 128 || this.field1147 != 128) {
            var4.method2022(this.field1114, this.field1146, this.field1147);
        }
        if (this.field1103 != null) {
            for (int var5 = 0; var5 < this.field1103.length; var5++) {
                var4.method2019(this.field1103[var5], this.field1116[var5]);
            }
        }
        if (this.field1113 != null) {
            for (int var6 = 0; var6 < this.field1113.length; var6++) {
                var4.method2020(this.field1113[var6], this.field1117[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ah.m(II)Ldt;")
    public final class105 method992(int arg0) {
        if (this.field1141 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1152[var3] && this.field1152[var3] != 0) {
                    var2 = this.field1141[var3];
                }
            }
            if (var2 != -1) {
                return method971(var2).method992(1);
            }
        }
        class105 var4 = (class105) field1108.method3485((long) this.field1151);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2063(Statics.field1105, this.field1142, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1114 != 128 || this.field1146 != 128 || this.field1147 != 128) {
            var5.method2022(this.field1114, this.field1146, this.field1147);
        }
        if (this.field1103 != null) {
            for (int var6 = 0; var6 < this.field1103.length; var6++) {
                var5.method2019(this.field1103[var6], this.field1116[var6]);
            }
        }
        if (this.field1113 != null) {
            for (int var7 = 0; var7 < this.field1113.length; var7++) {
                var5.method2020(this.field1113[var7], this.field1117[var7]);
            }
        }
        class105 var8 = var5.method2027(this.field1148 + 64, this.field1149 + 768, -50, -10, -50);
        var8.field1795 = true;
        field1108.method3487(var8, (long) this.field1151);
        return var8;
    }

    @ObfuscatedName("ah.r(II)Lah;")
    public class52 method1033(int arg0) {
        if (this.field1141 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1152[var3] && this.field1152[var3] != 0) {
                    var2 = this.field1141[var3];
                }
            }
            if (var2 != -1) {
                return method971(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("v.y(IIIIIZI)Lcd;")
    public static final class79 method563(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1126.method3485(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method971(arg0);
        if (arg1 > 1 && var9.field1141 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1152[var11] && var9.field1152[var11] != 0) {
                    var10 = var9.field1141[var11];
                }
            }
            if (var10 != -1) {
                var9 = method971(var10);
            }
        }
        class105 var12 = var9.method992(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1144 != -1) {
            var13 = method563(var9.field1143, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1153 != -1) {
            var13 = method563(var9.field1109, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1399;
        int var15 = Statics.field1397;
        int var16 = Statics.field1398;
        int[] var17 = new int[4];
        class80.method1685(var17);
        class79 var18 = new class79(36, 32);
        class80.method1653(var18.field1389, 36, 32);
        class80.method1659();
        class91.method1954();
        class91.method1903(16, 16);
        class91.field1546 = false;
        int var19 = var9.field1118;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1566[var9.field1119] * var19 >> 16;
        int var21 = class91.field1567[var9.field1119] * var19 >> 16;
        var12.method2095();
        var12.method2107(0, var9.field1120, var9.field1104, var9.field1119, var9.field1122, var9.field1123 + var12.field1437 / 2 + var20, var9.field1123 + var21);
        if (var9.field1153 != -1) {
            var13.method1574(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1570(1);
        }
        if (arg2 >= 2) {
            var18.method1570(16777215);
        }
        if (arg3 != 0) {
            var18.method1572(arg3);
        }
        class80.method1653(var18.field1389, 36, 32);
        if (var9.field1144 != -1) {
            var13.method1574(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1121 == 1) {
            class224 var22 = Statics.field1110;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class157.field2450 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class157.field2448 + "</col>";
            }
            var22.method3737(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1126.method3487(var18, var6);
        }
        class80.method1653(var14, var15, var16);
        class80.method1658(var17);
        class91.method1954();
        class91.field1546 = true;
        return var18;
    }

    @ObfuscatedName("ah.q(ZI)Z")
    public final boolean method994(boolean arg0) {
        int var2 = this.field1129;
        int var3 = this.field1133;
        int var4 = this.field1135;
        if (arg0) {
            var2 = this.field1134;
            var3 = this.field1139;
            var4 = this.field1136;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1105.method2996(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1105.method2996(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1105.method2996(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ah.f(ZI)Lch;")
    public final class100 method995(boolean arg0) {
        int var2 = this.field1129;
        int var3 = this.field1133;
        int var4 = this.field1135;
        if (arg0) {
            var2 = this.field1134;
            var3 = this.field1139;
            var4 = this.field1136;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2063(Statics.field1105, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2063(Statics.field1105, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2063(Statics.field1105, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1131 != 0) {
            var5.method2018(0, this.field1131, 0);
        }
        if (arg0 && this.field1111 != 0) {
            var5.method2018(0, this.field1111, 0);
        }
        if (this.field1103 != null) {
            for (int var10 = 0; var10 < this.field1103.length; var10++) {
                var5.method2019(this.field1103[var10], this.field1116[var10]);
            }
        }
        if (this.field1113 != null) {
            for (int var11 = 0; var11 < this.field1113.length; var11++) {
                var5.method2020(this.field1113[var11], this.field1117[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ah.x(ZI)Z")
    public final boolean method996(boolean arg0) {
        int var2 = this.field1137;
        int var3 = this.field1138;
        if (arg0) {
            var2 = this.field1115;
            var3 = this.field1140;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1105.method2996(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1105.method2996(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ah.d(ZI)Lch;")
    public final class100 method1024(boolean arg0) {
        int var2 = this.field1137;
        int var3 = this.field1138;
        if (arg0) {
            var2 = this.field1115;
            var3 = this.field1140;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2063(Statics.field1105, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2063(Statics.field1105, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1103 != null) {
            for (int var7 = 0; var7 < this.field1103.length; var7++) {
                var4.method2019(this.field1103[var7], this.field1116[var7]);
            }
        }
        if (this.field1113 != null) {
            for (int var8 = 0; var8 < this.field1113.length; var8++) {
                var4.method2020(this.field1113[var8], this.field1117[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("e.e(I)V")
    public static void method176() {
        field1107.method3488();
        field1108.method3488();
        field1126.method3488();
    }

    @ObfuscatedName("f.l(I)V")
    public static void method151() {
        field1126.method3488();
    }
}

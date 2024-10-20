package deob;

@ObfuscatedName("aj")
public class class52 extends class204 {

    @ObfuscatedName("aj.h")
    public static class193 field1141 = new class193(64);

    @ObfuscatedName("aj.n")
    public static class193 field1112 = new class193(50);

    @ObfuscatedName("aj.k")
    public static class193 field1119 = new class193(200);

    @ObfuscatedName("aj.b")
    public int field1152;

    @ObfuscatedName("aj.q")
    public int field1121;

    @ObfuscatedName("aj.u")
    public String field1122 = "null";

    @ObfuscatedName("aj.g")
    public short[] field1132;

    @ObfuscatedName("aj.y")
    public short[] field1124;

    @ObfuscatedName("aj.s")
    public short[] field1125;

    @ObfuscatedName("aj.d")
    public short[] field1118;

    @ObfuscatedName("aj.z")
    public int field1127 = 2000;

    @ObfuscatedName("aj.p")
    public int field1128 = 0;

    @ObfuscatedName("aj.w")
    public int field1129 = 0;

    @ObfuscatedName("aj.t")
    public int field1143 = 0;

    @ObfuscatedName("aj.c")
    public int field1131 = 0;

    @ObfuscatedName("aj.x")
    public int field1164 = 0;

    @ObfuscatedName("aj.e")
    public int field1135 = 0;

    @ObfuscatedName("aj.v")
    public int field1134 = 1;

    @ObfuscatedName("aj.ab")
    public boolean field1115 = false;

    @ObfuscatedName("aj.ak")
    public String[] field1136 = new String[] { null, null, class157.field2508, null, null };

    @ObfuscatedName("aj.am")
    public String[] field1137 = new String[] { null, null, null, null, class157.field2317 };

    @ObfuscatedName("aj.aw")
    public int field1138 = -1;

    @ObfuscatedName("aj.az")
    public int field1139 = -1;

    @ObfuscatedName("aj.ac")
    public int field1140 = 0;

    @ObfuscatedName("aj.ax")
    public int field1165 = -1;

    @ObfuscatedName("aj.ai")
    public int field1142 = -1;

    @ObfuscatedName("aj.ar")
    public int field1157 = 0;

    @ObfuscatedName("aj.aa")
    public int field1159 = -1;

    @ObfuscatedName("aj.as")
    public int field1145 = -1;

    @ObfuscatedName("aj.ag")
    public int field1146 = -1;

    @ObfuscatedName("aj.af")
    public int field1147 = -1;

    @ObfuscatedName("aj.ao")
    public int field1148 = -1;

    @ObfuscatedName("aj.an")
    public int field1123 = -1;

    @ObfuscatedName("aj.at")
    public int[] field1150;

    @ObfuscatedName("aj.al")
    public int[] field1151;

    @ObfuscatedName("aj.aq")
    public int field1149 = -1;

    @ObfuscatedName("aj.ae")
    public int field1153 = -1;

    @ObfuscatedName("aj.ap")
    public int field1154 = 128;

    @ObfuscatedName("aj.ad")
    public int field1155 = 128;

    @ObfuscatedName("aj.au")
    public int field1156 = 128;

    @ObfuscatedName("aj.ay")
    public int field1126 = 0;

    @ObfuscatedName("aj.av")
    public int field1114 = 0;

    @ObfuscatedName("aj.ah")
    public int field1120 = 0;

    @ObfuscatedName("aj.aj")
    public boolean field1160 = false;

    @ObfuscatedName("aj.bs")
    public int field1161 = -1;

    @ObfuscatedName("aj.bv")
    public int field1162 = -1;

    @ObfuscatedName("c.j(II)Laj;")
    public static class52 method578(int arg0) {
        class52 var1 = (class52) field1141.method3466((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1130.method3005(10, arg0);
        class52 var3 = new class52();
        var3.field1152 = arg0;
        if (var2 != null) {
            var3.method1011(new class119(var2));
        }
        var3.method1019();
        if (var3.field1153 != -1) {
            var3.method1005(method578(var3.field1153), method578(var3.field1149));
        }
        if (var3.field1162 != -1) {
            var3.method1007(method578(var3.field1162), method578(var3.field1161));
        }
        if (!Statics.field2715 && var3.field1115) {
            var3.field1122 = class157.field2395;
            var3.field1160 = false;
            var3.field1136 = null;
            var3.field1137 = null;
            var3.field1120 = 0;
        }
        field1141.method3468(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aj.l(B)V")
    public void method1019() {
    }

    @ObfuscatedName("aj.a(Ldc;I)V")
    public void method1011(class119 arg0) {
        while (true) {
            int var2 = arg0.method2316();
            if (var2 == 0) {
                return;
            }
            this.method1004(arg0, var2);
        }
    }

    @ObfuscatedName("aj.i(Ldc;II)V")
    public void method1004(class119 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1121 = arg0.method2318();
        } else if (arg1 == 2) {
            this.field1122 = arg0.method2324();
        } else if (arg1 == 4) {
            this.field1127 = arg0.method2318();
        } else if (arg1 == 5) {
            this.field1128 = arg0.method2318();
        } else if (arg1 == 6) {
            this.field1129 = arg0.method2318();
        } else if (arg1 == 7) {
            this.field1131 = arg0.method2318();
            if (this.field1131 > 32767) {
                this.field1131 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1164 = arg0.method2318();
            if (this.field1164 > 32767) {
                this.field1164 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1135 = 1;
        } else if (arg1 == 12) {
            this.field1134 = arg0.method2321();
        } else if (arg1 == 16) {
            this.field1115 = true;
        } else if (arg1 == 23) {
            this.field1138 = arg0.method2318();
            this.field1140 = arg0.method2316();
        } else if (arg1 == 24) {
            this.field1139 = arg0.method2318();
        } else if (arg1 == 25) {
            this.field1165 = arg0.method2318();
            this.field1157 = arg0.method2316();
        } else if (arg1 == 26) {
            this.field1142 = arg0.method2318();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1136[arg1 - 30] = arg0.method2324();
            if (this.field1136[arg1 - 30].equalsIgnoreCase(class157.field2318)) {
                this.field1136[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1137[arg1 - 35] = arg0.method2324();
        } else if (arg1 == 40) {
            int var3 = arg0.method2316();
            this.field1132 = new short[var3];
            this.field1124 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1132[var4] = (short) arg0.method2318();
                this.field1124[var4] = (short) arg0.method2318();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2316();
            this.field1125 = new short[var5];
            this.field1118 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1125[var6] = (short) arg0.method2318();
                this.field1118[var6] = (short) arg0.method2318();
            }
        } else if (arg1 == 65) {
            this.field1160 = true;
        } else if (arg1 == 78) {
            this.field1159 = arg0.method2318();
        } else if (arg1 == 79) {
            this.field1145 = arg0.method2318();
        } else if (arg1 == 90) {
            this.field1146 = arg0.method2318();
        } else if (arg1 == 91) {
            this.field1148 = arg0.method2318();
        } else if (arg1 == 92) {
            this.field1147 = arg0.method2318();
        } else if (arg1 == 93) {
            this.field1123 = arg0.method2318();
        } else if (arg1 == 95) {
            this.field1143 = arg0.method2318();
        } else if (arg1 == 97) {
            this.field1149 = arg0.method2318();
        } else if (arg1 == 98) {
            this.field1153 = arg0.method2318();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1150 == null) {
                this.field1150 = new int[10];
                this.field1151 = new int[10];
            }
            this.field1150[arg1 - 100] = arg0.method2318();
            this.field1151[arg1 - 100] = arg0.method2318();
        } else if (arg1 == 110) {
            this.field1154 = arg0.method2318();
        } else if (arg1 == 111) {
            this.field1155 = arg0.method2318();
        } else if (arg1 == 112) {
            this.field1156 = arg0.method2318();
        } else if (arg1 == 113) {
            this.field1126 = arg0.method2317();
        } else if (arg1 == 114) {
            this.field1114 = arg0.method2317();
        } else if (arg1 == 115) {
            this.field1120 = arg0.method2316();
        } else if (arg1 == 139) {
            this.field1161 = arg0.method2318();
        } else if (arg1 == 140) {
            this.field1162 = arg0.method2318();
        }
    }

    @ObfuscatedName("aj.f(Laj;Laj;B)V")
    public void method1005(class52 arg0, class52 arg1) {
        this.field1121 = arg0.field1121;
        this.field1127 = arg0.field1127;
        this.field1128 = arg0.field1128;
        this.field1129 = arg0.field1129;
        this.field1143 = arg0.field1143;
        this.field1131 = arg0.field1131;
        this.field1164 = arg0.field1164;
        this.field1132 = arg0.field1132;
        this.field1124 = arg0.field1124;
        this.field1125 = arg0.field1125;
        this.field1118 = arg0.field1118;
        this.field1122 = arg1.field1122;
        this.field1115 = arg1.field1115;
        this.field1134 = arg1.field1134;
        this.field1135 = 1;
    }

    @ObfuscatedName("aj.m(Laj;Laj;I)V")
    public void method1007(class52 arg0, class52 arg1) {
        this.field1121 = arg0.field1121;
        this.field1127 = arg0.field1127;
        this.field1128 = arg0.field1128;
        this.field1129 = arg0.field1129;
        this.field1143 = arg0.field1143;
        this.field1131 = arg0.field1131;
        this.field1164 = arg0.field1164;
        this.field1132 = arg1.field1132;
        this.field1124 = arg1.field1124;
        this.field1125 = arg1.field1125;
        this.field1118 = arg1.field1118;
        this.field1122 = arg1.field1122;
        this.field1115 = arg1.field1115;
        this.field1135 = arg1.field1135;
        this.field1138 = arg1.field1138;
        this.field1139 = arg1.field1139;
        this.field1159 = arg1.field1159;
        this.field1165 = arg1.field1165;
        this.field1142 = arg1.field1142;
        this.field1145 = arg1.field1145;
        this.field1146 = arg1.field1146;
        this.field1147 = arg1.field1147;
        this.field1148 = arg1.field1148;
        this.field1123 = arg1.field1123;
        this.field1120 = arg1.field1120;
        this.field1136 = arg1.field1136;
        this.field1137 = new String[5];
        if (arg1.field1137 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1137[var3] = arg1.field1137[var3];
            }
        }
        this.field1137[4] = class157.field2550;
        this.field1134 = 0;
    }

    @ObfuscatedName("aj.o(II)Lcb;")
    public final class100 method1002(int arg0) {
        if (this.field1150 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1151[var3] && this.field1151[var3] != 0) {
                    var2 = this.field1150[var3];
                }
            }
            if (var2 != -1) {
                return method578(var2).method1002(1);
            }
        }
        class100 var4 = class100.method2109(Statics.field1113, this.field1121, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1154 != 128 || this.field1155 != 128 || this.field1156 != 128) {
            var4.method2086(this.field1154, this.field1155, this.field1156);
        }
        if (this.field1132 != null) {
            for (int var5 = 0; var5 < this.field1132.length; var5++) {
                var4.method2061(this.field1132[var5], this.field1124[var5]);
            }
        }
        if (this.field1125 != null) {
            for (int var6 = 0; var6 < this.field1125.length; var6++) {
                var4.method2055(this.field1125[var6], this.field1118[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aj.h(II)Ldd;")
    public final class105 method1017(int arg0) {
        if (this.field1150 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1151[var3] && this.field1151[var3] != 0) {
                    var2 = this.field1150[var3];
                }
            }
            if (var2 != -1) {
                return method578(var2).method1017(1);
            }
        }
        class105 var4 = (class105) field1112.method3466((long) this.field1152);
        if (var4 != null) {
            return var4;
        }
        class100 var5 = class100.method2109(Statics.field1113, this.field1121, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1154 != 128 || this.field1155 != 128 || this.field1156 != 128) {
            var5.method2086(this.field1154, this.field1155, this.field1156);
        }
        if (this.field1132 != null) {
            for (int var6 = 0; var6 < this.field1132.length; var6++) {
                var5.method2061(this.field1132[var6], this.field1124[var6]);
            }
        }
        if (this.field1125 != null) {
            for (int var7 = 0; var7 < this.field1125.length; var7++) {
                var5.method2055(this.field1125[var7], this.field1118[var7]);
            }
        }
        class105 var8 = var5.method2041(this.field1126 + 64, this.field1114 * 5 + 768, -50, -10, -50);
        var8.field1830 = true;
        field1112.method3468(var8, (long) this.field1152);
        return var8;
    }

    @ObfuscatedName("aj.n(II)Laj;")
    public class52 method1001(int arg0) {
        if (this.field1150 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1151[var3] && this.field1151[var3] != 0) {
                    var2 = this.field1150[var3];
                }
            }
            if (var2 != -1) {
                return method578(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ak.k(IIIIIZI)Lcr;")
    public static final class79 method647(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1119.method3466(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method578(arg0);
        if (arg1 > 1 && var9.field1150 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1151[var11] && var9.field1151[var11] != 0) {
                    var10 = var9.field1150[var11];
                }
            }
            if (var10 != -1) {
                var9 = method578(var10);
            }
        }
        class105 var12 = var9.method1017(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1153 != -1) {
            var13 = method647(var9.field1149, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1162 != -1) {
            var13 = method647(var9.field1161, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1427;
        int var15 = Statics.field1424;
        int var16 = Statics.field1425;
        int[] var17 = new int[4];
        class80.method1670(var17);
        class79 var18 = new class79(36, 32);
        class80.method1666(var18.field1413, 36, 32);
        class80.method1672();
        class91.method1999();
        class91.method1947(16, 16);
        class91.field1571 = false;
        int var19 = var9.field1127;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class91.field1588[var9.field1128] * var19 >> 16;
        int var21 = class91.field1591[var9.field1128] * var19 >> 16;
        var12.method2133();
        var12.method2161(0, var9.field1129, var9.field1143, var9.field1128, var9.field1131, var9.field1164 + var12.field1462 / 2 + var20, var9.field1164 + var21);
        if (var9.field1162 != -1) {
            var13.method1604(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1582(1);
        }
        if (arg2 >= 2) {
            var18.method1582(16777215);
        }
        if (arg3 != 0) {
            var18.method1598(arg3);
        }
        class80.method1666(var18.field1413, 36, 32);
        if (var9.field1153 != -1) {
            var13.method1604(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1135 == 1) {
            Statics.field581.method3722(method2020(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1119.method3468(var18, var6);
        }
        class80.method1666(var14, var15, var16);
        class80.method1693(var17);
        class91.method1999();
        class91.field1571 = true;
        return var18;
    }

    @ObfuscatedName("ct.r(II)Ljava/lang/String;")
    public static final String method2020(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class157.field2477 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class157.field2475 + "</col>";
        }
    }

    @ObfuscatedName("aj.b(ZI)Z")
    public final boolean method1018(boolean arg0) {
        int var2 = this.field1138;
        int var3 = this.field1139;
        int var4 = this.field1159;
        if (arg0) {
            var2 = this.field1165;
            var3 = this.field1142;
            var4 = this.field1145;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1113.method3007(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1113.method3007(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1113.method3007(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("aj.q(ZI)Lcb;")
    public final class100 method1060(boolean arg0) {
        int var2 = this.field1138;
        int var3 = this.field1139;
        int var4 = this.field1159;
        if (arg0) {
            var2 = this.field1165;
            var3 = this.field1142;
            var4 = this.field1145;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var5 = class100.method2109(Statics.field1113, var2, 0);
        if (var3 != -1) {
            class100 var6 = class100.method2109(Statics.field1113, var3, 0);
            if (var4 == -1) {
                class100[] var9 = new class100[] { var5, var6 };
                var5 = new class100(var9, 2);
            } else {
                class100 var7 = class100.method2109(Statics.field1113, var4, 0);
                class100[] var8 = new class100[] { var5, var6, var7 };
                var5 = new class100(var8, 3);
            }
        }
        if (!arg0 && this.field1140 != 0) {
            var5.method2053(0, this.field1140, 0);
        }
        if (arg0 && this.field1157 != 0) {
            var5.method2053(0, this.field1157, 0);
        }
        if (this.field1132 != null) {
            for (int var10 = 0; var10 < this.field1132.length; var10++) {
                var5.method2061(this.field1132[var10], this.field1124[var10]);
            }
        }
        if (this.field1125 != null) {
            for (int var11 = 0; var11 < this.field1125.length; var11++) {
                var5.method2055(this.field1125[var11], this.field1118[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("aj.u(ZI)Z")
    public final boolean method1012(boolean arg0) {
        int var2 = this.field1146;
        int var3 = this.field1147;
        if (arg0) {
            var2 = this.field1148;
            var3 = this.field1123;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1113.method3007(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1113.method3007(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("aj.g(ZI)Lcb;")
    public final class100 method1030(boolean arg0) {
        int var2 = this.field1146;
        int var3 = this.field1147;
        if (arg0) {
            var2 = this.field1148;
            var3 = this.field1123;
        }
        if (var2 == -1) {
            return null;
        }
        class100 var4 = class100.method2109(Statics.field1113, var2, 0);
        if (var3 != -1) {
            class100 var5 = class100.method2109(Statics.field1113, var3, 0);
            class100[] var6 = new class100[] { var4, var5 };
            var4 = new class100(var6, 2);
        }
        if (this.field1132 != null) {
            for (int var7 = 0; var7 < this.field1132.length; var7++) {
                var4.method2061(this.field1132[var7], this.field1124[var7]);
            }
        }
        if (this.field1125 != null) {
            for (int var8 = 0; var8 < this.field1125.length; var8++) {
                var4.method2055(this.field1125[var8], this.field1118[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("h.y(I)V")
    public static void method95() {
        field1141.method3475();
        field1112.method3475();
        field1119.method3475();
    }

    @ObfuscatedName("fc.s(ZI)V")
    public static void method3109(boolean arg0) {
        if (Statics.field2715 != arg0) {
            method95();
            Statics.field2715 = arg0;
        }
    }
}

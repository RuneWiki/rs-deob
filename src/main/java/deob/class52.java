package deob;

@ObfuscatedName("ab")
public class class52 extends class205 {

    @ObfuscatedName("ab.m")
    public static class194 field1117 = new class194(64);

    @ObfuscatedName("ab.g")
    public static class194 field1148 = new class194(50);

    @ObfuscatedName("ab.s")
    public static class194 field1119 = new class194(200);

    @ObfuscatedName("ab.k")
    public int field1168;

    @ObfuscatedName("ab.o")
    public int field1122;

    @ObfuscatedName("ab.q")
    public String field1129 = "null";

    @ObfuscatedName("ab.p")
    public short[] field1157;

    @ObfuscatedName("ab.h")
    public short[] field1131;

    @ObfuscatedName("ab.e")
    public short[] field1126;

    @ObfuscatedName("ab.t")
    public short[] field1125;

    @ObfuscatedName("ab.w")
    public int field1128 = 2000;

    @ObfuscatedName("ab.v")
    public int field1118 = 0;

    @ObfuscatedName("ab.y")
    public int field1130 = 0;

    @ObfuscatedName("ab.c")
    public int field1132 = 0;

    @ObfuscatedName("ab.i")
    public int field1134 = 0;

    @ObfuscatedName("ab.a")
    public int field1133 = 0;

    @ObfuscatedName("ab.z")
    public int field1152 = 0;

    @ObfuscatedName("ab.j")
    public int field1135 = 1;

    @ObfuscatedName("ab.ag")
    public boolean field1147 = false;

    @ObfuscatedName("ab.ax")
    public String[] field1137 = new String[] { null, null, class158.field2308, null, null };

    @ObfuscatedName("ab.ao")
    public String[] field1150 = new String[] { null, null, null, null, class158.field2393 };

    @ObfuscatedName("ab.ac")
    public int field1136 = -1;

    @ObfuscatedName("ab.aj")
    public int field1140 = -1;

    @ObfuscatedName("ab.an")
    public int field1141 = 0;

    @ObfuscatedName("ab.al")
    public int field1113 = -1;

    @ObfuscatedName("ab.as")
    public int field1143 = -1;

    @ObfuscatedName("ab.av")
    public int field1127 = 0;

    @ObfuscatedName("ab.am")
    public int field1145 = -1;

    @ObfuscatedName("ab.az")
    public int field1138 = -1;

    @ObfuscatedName("ab.ai")
    public int field1156 = -1;

    @ObfuscatedName("ab.aq")
    public int field1144 = -1;

    @ObfuscatedName("ab.ah")
    public int field1146 = -1;

    @ObfuscatedName("ab.ap")
    public int field1123 = -1;

    @ObfuscatedName("ab.af")
    public int[] field1151;

    @ObfuscatedName("ab.aa")
    public int[] field1139;

    @ObfuscatedName("ab.ay")
    public int field1153 = -1;

    @ObfuscatedName("ab.aw")
    public int field1154 = -1;

    @ObfuscatedName("ab.ak")
    public int field1155 = 128;

    @ObfuscatedName("ab.ae")
    public int field1149 = 128;

    @ObfuscatedName("ab.ad")
    public int field1142 = 128;

    @ObfuscatedName("ab.au")
    public int field1158 = 0;

    @ObfuscatedName("ab.ar")
    public int field1159 = 0;

    @ObfuscatedName("ab.at")
    public int field1160 = 0;

    @ObfuscatedName("ab.ab")
    public boolean field1161 = false;

    @ObfuscatedName("ab.bp")
    public int field1162 = -1;

    @ObfuscatedName("ab.bo")
    public int field1163 = -1;

    @ObfuscatedName("ab.bf")
    public int field1164 = -1;

    @ObfuscatedName("ab.bx")
    public int field1165 = -1;

    @ObfuscatedName("w.f(Lfl;Lfl;ZLhv;I)V")
    public static void method201(class168 arg0, class168 arg1, boolean arg2, class225 arg3) {
        Statics.field1116 = arg0;
        Statics.field3144 = arg1;
        Statics.field2067 = arg2;
        Statics.field74 = Statics.field1116.method3096(10);
        Statics.field1124 = arg3;
    }

    @ObfuscatedName("eo.u(IS)Lab;")
    public static class52 method2827(int arg0) {
        class52 var1 = (class52) field1117.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1116.method3061(10, arg0);
        class52 var3 = new class52();
        var3.field1168 = arg0;
        if (var2 != null) {
            var3.method1050(new class120(var2));
        }
        var3.method1049();
        if (var3.field1154 != -1) {
            var3.method1052(method2827(var3.field1154), method2827(var3.field1153));
        }
        if (var3.field1163 != -1) {
            var3.method1101(method2827(var3.field1163), method2827(var3.field1162));
        }
        if (var3.field1165 != -1) {
            var3.method1054(method2827(var3.field1165), method2827(var3.field1164));
        }
        if (!Statics.field2067 && var3.field1147) {
            var3.field1129 = class158.field2495;
            var3.field1161 = false;
            var3.field1137 = null;
            var3.field1150 = null;
            var3.field1160 = 0;
        }
        field1117.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.x(B)V")
    public void method1049() {
    }

    @ObfuscatedName("ab.b(Ldj;I)V")
    public void method1050(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method1051(arg0, var2);
        }
    }

    @ObfuscatedName("ab.l(Ldj;IB)V")
    public void method1051(class120 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1122 = arg0.method2387();
        } else if (arg1 == 2) {
            this.field1129 = arg0.method2499();
        } else if (arg1 == 4) {
            this.field1128 = arg0.method2387();
        } else if (arg1 == 5) {
            this.field1118 = arg0.method2387();
        } else if (arg1 == 6) {
            this.field1130 = arg0.method2387();
        } else if (arg1 == 7) {
            this.field1134 = arg0.method2387();
            if (this.field1134 > 32767) {
                this.field1134 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1133 = arg0.method2387();
            if (this.field1133 > 32767) {
                this.field1133 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1152 = 1;
        } else if (arg1 == 12) {
            this.field1135 = arg0.method2527();
        } else if (arg1 == 16) {
            this.field1147 = true;
        } else if (arg1 == 23) {
            this.field1136 = arg0.method2387();
            this.field1141 = arg0.method2385();
        } else if (arg1 == 24) {
            this.field1140 = arg0.method2387();
        } else if (arg1 == 25) {
            this.field1113 = arg0.method2387();
            this.field1127 = arg0.method2385();
        } else if (arg1 == 26) {
            this.field1143 = arg0.method2387();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1137[arg1 - 30] = arg0.method2499();
            if (this.field1137[arg1 - 30].equalsIgnoreCase(class158.field2398)) {
                this.field1137[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1150[arg1 - 35] = arg0.method2499();
        } else if (arg1 == 40) {
            int var3 = arg0.method2385();
            this.field1157 = new short[var3];
            this.field1131 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1157[var4] = (short) arg0.method2387();
                this.field1131[var4] = (short) arg0.method2387();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2385();
            this.field1126 = new short[var5];
            this.field1125 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1126[var6] = (short) arg0.method2387();
                this.field1125[var6] = (short) arg0.method2387();
            }
        } else if (arg1 == 65) {
            this.field1161 = true;
        } else if (arg1 == 78) {
            this.field1145 = arg0.method2387();
        } else if (arg1 == 79) {
            this.field1138 = arg0.method2387();
        } else if (arg1 == 90) {
            this.field1156 = arg0.method2387();
        } else if (arg1 == 91) {
            this.field1146 = arg0.method2387();
        } else if (arg1 == 92) {
            this.field1144 = arg0.method2387();
        } else if (arg1 == 93) {
            this.field1123 = arg0.method2387();
        } else if (arg1 == 95) {
            this.field1132 = arg0.method2387();
        } else if (arg1 == 97) {
            this.field1153 = arg0.method2387();
        } else if (arg1 == 98) {
            this.field1154 = arg0.method2387();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1151 == null) {
                this.field1151 = new int[10];
                this.field1139 = new int[10];
            }
            this.field1151[arg1 - 100] = arg0.method2387();
            this.field1139[arg1 - 100] = arg0.method2387();
        } else if (arg1 == 110) {
            this.field1155 = arg0.method2387();
        } else if (arg1 == 111) {
            this.field1149 = arg0.method2387();
        } else if (arg1 == 112) {
            this.field1142 = arg0.method2387();
        } else if (arg1 == 113) {
            this.field1158 = arg0.method2369();
        } else if (arg1 == 114) {
            this.field1159 = arg0.method2369() * 5;
        } else if (arg1 == 115) {
            this.field1160 = arg0.method2385();
        } else if (arg1 == 139) {
            this.field1162 = arg0.method2387();
        } else if (arg1 == 140) {
            this.field1163 = arg0.method2387();
        } else if (arg1 == 148) {
            this.field1164 = arg0.method2387();
        } else if (arg1 == 149) {
            this.field1165 = arg0.method2387();
        }
    }

    @ObfuscatedName("ab.d(Lab;Lab;B)V")
    public void method1052(class52 arg0, class52 arg1) {
        this.field1122 = arg0.field1122;
        this.field1128 = arg0.field1128;
        this.field1118 = arg0.field1118;
        this.field1130 = arg0.field1130;
        this.field1132 = arg0.field1132;
        this.field1134 = arg0.field1134;
        this.field1133 = arg0.field1133;
        this.field1157 = arg0.field1157;
        this.field1131 = arg0.field1131;
        this.field1126 = arg0.field1126;
        this.field1125 = arg0.field1125;
        this.field1129 = arg1.field1129;
        this.field1147 = arg1.field1147;
        this.field1135 = arg1.field1135;
        this.field1152 = 1;
    }

    @ObfuscatedName("ab.n(Lab;Lab;I)V")
    public void method1101(class52 arg0, class52 arg1) {
        this.field1122 = arg0.field1122;
        this.field1128 = arg0.field1128;
        this.field1118 = arg0.field1118;
        this.field1130 = arg0.field1130;
        this.field1132 = arg0.field1132;
        this.field1134 = arg0.field1134;
        this.field1133 = arg0.field1133;
        this.field1157 = arg1.field1157;
        this.field1131 = arg1.field1131;
        this.field1126 = arg1.field1126;
        this.field1125 = arg1.field1125;
        this.field1129 = arg1.field1129;
        this.field1147 = arg1.field1147;
        this.field1152 = arg1.field1152;
        this.field1136 = arg1.field1136;
        this.field1140 = arg1.field1140;
        this.field1145 = arg1.field1145;
        this.field1113 = arg1.field1113;
        this.field1143 = arg1.field1143;
        this.field1138 = arg1.field1138;
        this.field1156 = arg1.field1156;
        this.field1144 = arg1.field1144;
        this.field1146 = arg1.field1146;
        this.field1123 = arg1.field1123;
        this.field1160 = arg1.field1160;
        this.field1137 = arg1.field1137;
        this.field1150 = new String[5];
        if (arg1.field1150 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1150[var3] = arg1.field1150[var3];
            }
        }
        this.field1150[4] = class158.field2314;
        this.field1135 = 0;
    }

    @ObfuscatedName("ab.m(Lab;Lab;I)V")
    public void method1054(class52 arg0, class52 arg1) {
        this.field1122 = arg0.field1122;
        this.field1128 = arg0.field1128;
        this.field1118 = arg0.field1118;
        this.field1130 = arg0.field1130;
        this.field1132 = arg0.field1132;
        this.field1134 = arg0.field1134;
        this.field1133 = arg0.field1133;
        this.field1157 = arg0.field1157;
        this.field1131 = arg0.field1131;
        this.field1126 = arg0.field1126;
        this.field1125 = arg0.field1125;
        this.field1152 = arg0.field1152;
        this.field1129 = arg1.field1129;
        this.field1135 = 0;
        this.field1147 = false;
        this.field1161 = false;
    }

    @ObfuscatedName("ab.g(II)Lct;")
    public final class101 method1055(int arg0) {
        if (this.field1151 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1139[var3] && this.field1139[var3] != 0) {
                    var2 = this.field1151[var3];
                }
            }
            if (var2 != -1) {
                return method2827(var2).method1055(1);
            }
        }
        class101 var4 = class101.method2118(Statics.field3144, this.field1122, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1155 != 128 || this.field1149 != 128 || this.field1142 != 128) {
            var4.method2123(this.field1155, this.field1149, this.field1142);
        }
        if (this.field1157 != null) {
            for (int var5 = 0; var5 < this.field1157.length; var5++) {
                var4.method2179(this.field1157[var5], this.field1131[var5]);
            }
        }
        if (this.field1126 != null) {
            for (int var6 = 0; var6 < this.field1126.length; var6++) {
                var4.method2138(this.field1126[var6], this.field1125[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ab.s(II)Ldr;")
    public final class106 method1085(int arg0) {
        if (this.field1151 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1139[var3] && this.field1139[var3] != 0) {
                    var2 = this.field1151[var3];
                }
            }
            if (var2 != -1) {
                return method2827(var2).method1085(1);
            }
        }
        class106 var4 = (class106) field1148.method3530((long) this.field1168);
        if (var4 != null) {
            return var4;
        }
        class101 var5 = class101.method2118(Statics.field3144, this.field1122, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1155 != 128 || this.field1149 != 128 || this.field1142 != 128) {
            var5.method2123(this.field1155, this.field1149, this.field1142);
        }
        if (this.field1157 != null) {
            for (int var6 = 0; var6 < this.field1157.length; var6++) {
                var5.method2179(this.field1157[var6], this.field1131[var6]);
            }
        }
        if (this.field1126 != null) {
            for (int var7 = 0; var7 < this.field1126.length; var7++) {
                var5.method2138(this.field1126[var7], this.field1125[var7]);
            }
        }
        class106 var8 = var5.method2128(this.field1158 + 64, this.field1159 + 768, -50, -10, -50);
        var8.field1830 = true;
        field1148.method3521(var8, (long) this.field1168);
        return var8;
    }

    @ObfuscatedName("ab.r(II)Lab;")
    public class52 method1058(int arg0) {
        if (this.field1151 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1139[var3] && this.field1139[var3] != 0) {
                    var2 = this.field1151[var3];
                }
            }
            if (var2 != -1) {
                return method2827(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ek.k(IIIIIZI)Lcr;")
    public static final class79 method2780(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class79 var8 = (class79) field1119.method3530(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class52 var9 = method2827(arg0);
        if (arg1 > 1 && var9.field1151 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1139[var11] && var9.field1139[var11] != 0) {
                    var10 = var9.field1151[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2827(var10);
            }
        }
        class106 var12 = var9.method1085(1);
        if (var12 == null) {
            return null;
        }
        class79 var13 = null;
        if (var9.field1154 != -1) {
            var13 = method2780(var9.field1153, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1163 != -1) {
            var13 = method2780(var9.field1162, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1165 != -1) {
            var13 = method2780(var9.field1164, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1422;
        int var15 = Statics.field1420;
        int var16 = Statics.field1426;
        int[] var17 = new int[4];
        class80.method1724(var17);
        class79 var18 = new class79(36, 32);
        class80.method1720(var18.field1410, 36, 32);
        class80.method1726();
        class92.method2006();
        class92.method2000(16, 16);
        class92.field1588 = false;
        if (var9.field1165 != -1) {
            var13.method1637(0, 0);
        }
        int var19 = var9.field1128;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class92.field1598[var9.field1118] * var19 >> 16;
        int var21 = class92.field1578[var9.field1118] * var19 >> 16;
        var12.method2195();
        var12.method2205(0, var9.field1130, var9.field1132, var9.field1118, var9.field1134, var9.field1133 + var12.field1469 / 2 + var20, var9.field1133 + var21);
        if (var9.field1163 != -1) {
            var13.method1637(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1643(1);
        }
        if (arg2 >= 2) {
            var18.method1643(16777215);
        }
        if (arg3 != 0) {
            var18.method1633(arg3);
        }
        class80.method1720(var18.field1410, 36, 32);
        if (var9.field1154 != -1) {
            var13.method1637(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1152 == 1) {
            class225 var22 = Statics.field1124;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class158.field2469 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class158.field2467 + "</col>";
            }
            var22.method3799(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1119.method3521(var18, var6);
        }
        class80.method1720(var14, var15, var16);
        class80.method1729(var17);
        class92.method2006();
        class92.field1588 = true;
        return var18;
    }

    @ObfuscatedName("ab.o(ZB)Z")
    public final boolean method1057(boolean arg0) {
        int var2 = this.field1136;
        int var3 = this.field1140;
        int var4 = this.field1145;
        if (arg0) {
            var2 = this.field1113;
            var3 = this.field1143;
            var4 = this.field1138;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field3144.method3063(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field3144.method3063(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field3144.method3063(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("ab.q(ZI)Lct;")
    public final class101 method1088(boolean arg0) {
        int var2 = this.field1136;
        int var3 = this.field1140;
        int var4 = this.field1145;
        if (arg0) {
            var2 = this.field1113;
            var3 = this.field1143;
            var4 = this.field1138;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var5 = class101.method2118(Statics.field3144, var2, 0);
        if (var3 != -1) {
            class101 var6 = class101.method2118(Statics.field3144, var3, 0);
            if (var4 == -1) {
                class101[] var9 = new class101[] { var5, var6 };
                var5 = new class101(var9, 2);
            } else {
                class101 var7 = class101.method2118(Statics.field3144, var4, 0);
                class101[] var8 = new class101[] { var5, var6, var7 };
                var5 = new class101(var8, 3);
            }
        }
        if (!arg0 && this.field1141 != 0) {
            var5.method2174(0, this.field1141, 0);
        }
        if (arg0 && this.field1127 != 0) {
            var5.method2174(0, this.field1127, 0);
        }
        if (this.field1157 != null) {
            for (int var10 = 0; var10 < this.field1157.length; var10++) {
                var5.method2179(this.field1157[var10], this.field1131[var10]);
            }
        }
        if (this.field1126 != null) {
            for (int var11 = 0; var11 < this.field1126.length; var11++) {
                var5.method2138(this.field1126[var11], this.field1125[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("ab.p(ZI)Z")
    public final boolean method1073(boolean arg0) {
        int var2 = this.field1156;
        int var3 = this.field1144;
        if (arg0) {
            var2 = this.field1146;
            var3 = this.field1123;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field3144.method3063(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field3144.method3063(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("ab.h(ZI)Lct;")
    public final class101 method1072(boolean arg0) {
        int var2 = this.field1156;
        int var3 = this.field1144;
        if (arg0) {
            var2 = this.field1146;
            var3 = this.field1123;
        }
        if (var2 == -1) {
            return null;
        }
        class101 var4 = class101.method2118(Statics.field3144, var2, 0);
        if (var3 != -1) {
            class101 var5 = class101.method2118(Statics.field3144, var3, 0);
            class101[] var6 = new class101[] { var4, var5 };
            var4 = new class101(var6, 2);
        }
        if (this.field1157 != null) {
            for (int var7 = 0; var7 < this.field1157.length; var7++) {
                var4.method2179(this.field1157[var7], this.field1131[var7]);
            }
        }
        if (this.field1126 != null) {
            for (int var8 = 0; var8 < this.field1126.length; var8++) {
                var4.method2138(this.field1126[var8], this.field1125[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("aa.e(B)V")
    public static void method910() {
        field1117.method3529();
        field1148.method3529();
        field1119.method3529();
    }

    @ObfuscatedName("ai.t(I)V")
    public static void method776() {
        field1119.method3529();
    }
}

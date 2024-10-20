package deob;

@ObfuscatedName("bv")
public class class56 extends class208 {

    @ObfuscatedName("bv.k")
    public static class197 field1156 = new class197(64);

    @ObfuscatedName("bv.c")
    public static class197 field1198 = new class197(50);

    @ObfuscatedName("bv.w")
    public static class197 field1158 = new class197(200);

    @ObfuscatedName("bv.h")
    public int field1157;

    @ObfuscatedName("bv.i")
    public int field1170;

    @ObfuscatedName("bv.u")
    public String field1201 = "null";

    @ObfuscatedName("bv.x")
    public short[] field1163;

    @ObfuscatedName("bv.d")
    public short[] field1164;

    @ObfuscatedName("bv.o")
    public short[] field1165;

    @ObfuscatedName("bv.j")
    public short[] field1151;

    @ObfuscatedName("bv.q")
    public int field1167 = 2000;

    @ObfuscatedName("bv.r")
    public int field1185 = 0;

    @ObfuscatedName("bv.a")
    public int field1175 = 0;

    @ObfuscatedName("bv.z")
    public int field1199 = 0;

    @ObfuscatedName("bv.p")
    public int field1171 = 0;

    @ObfuscatedName("bv.y")
    public int field1172 = 0;

    @ObfuscatedName("bv.s")
    public int field1173 = 0;

    @ObfuscatedName("bv.g")
    public int field1181 = 1;

    @ObfuscatedName("bv.aj")
    public boolean field1168 = false;

    @ObfuscatedName("bv.ay")
    public String[] field1176 = new String[] { null, null, class161.field2349, null, null };

    @ObfuscatedName("bv.ah")
    public String[] field1177 = new String[] { null, null, null, null, class161.field2350 };

    @ObfuscatedName("bv.ax")
    public int field1178 = -1;

    @ObfuscatedName("bv.ar")
    public int field1179 = -1;

    @ObfuscatedName("bv.ae")
    public int field1180 = 0;

    @ObfuscatedName("bv.ac")
    public int field1169 = -1;

    @ObfuscatedName("bv.aw")
    public int field1182 = -1;

    @ObfuscatedName("bv.am")
    public int field1183 = 0;

    @ObfuscatedName("bv.aq")
    public int field1184 = -1;

    @ObfuscatedName("bv.at")
    public int field1154 = -1;

    @ObfuscatedName("bv.aa")
    public int field1186 = -1;

    @ObfuscatedName("bv.as")
    public int field1160 = -1;

    @ObfuscatedName("bv.ao")
    public int field1188 = -1;

    @ObfuscatedName("bv.ai")
    public int field1166 = -1;

    @ObfuscatedName("bv.ap")
    public int[] field1190;

    @ObfuscatedName("bv.ak")
    public int[] field1191;

    @ObfuscatedName("bv.ag")
    public int field1192 = -1;

    @ObfuscatedName("bv.az")
    public int field1193 = -1;

    @ObfuscatedName("bv.au")
    public int field1162 = 128;

    @ObfuscatedName("bv.af")
    public int field1161 = 128;

    @ObfuscatedName("bv.al")
    public int field1196 = 128;

    @ObfuscatedName("bv.av")
    public int field1197 = 0;

    @ObfuscatedName("bv.ad")
    public int field1195 = 0;

    @ObfuscatedName("bv.an")
    public int field1194 = 0;

    @ObfuscatedName("bv.ab")
    public boolean field1200 = false;

    @ObfuscatedName("bv.bc")
    public int field1189 = -1;

    @ObfuscatedName("bv.bk")
    public int field1202 = -1;

    @ObfuscatedName("bv.bs")
    public int field1203 = -1;

    @ObfuscatedName("bv.bv")
    public int field1204 = -1;

    @ObfuscatedName("au.f(II)Lbv;")
    public static class56 method905(int arg0) {
        class56 var1 = (class56) field1156.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1153.method3107(10, arg0);
        class56 var3 = new class56();
        var3.field1157 = arg0;
        if (var2 != null) {
            var3.method1136(new class123(var2));
        }
        var3.method1083();
        if (var3.field1193 != -1) {
            var3.method1086(method905(var3.field1193), method905(var3.field1192));
        }
        if (var3.field1202 != -1) {
            var3.method1087(method905(var3.field1202), method905(var3.field1189));
        }
        if (var3.field1204 != -1) {
            var3.method1135(method905(var3.field1204), method905(var3.field1203));
        }
        if (!Statics.field1155 && var3.field1168) {
            var3.field1201 = class161.field2400;
            var3.field1200 = false;
            var3.field1176 = null;
            var3.field1177 = null;
            var3.field1194 = 0;
        }
        field1156.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bv.e(I)V")
    public void method1083() {
    }

    @ObfuscatedName("bv.n(Ldx;B)V")
    public void method1136(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method1085(arg0, var2);
        }
    }

    @ObfuscatedName("bv.t(Ldx;IB)V")
    public void method1085(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1170 = arg0.method2401();
        } else if (arg1 == 2) {
            this.field1201 = arg0.method2407();
        } else if (arg1 == 4) {
            this.field1167 = arg0.method2401();
        } else if (arg1 == 5) {
            this.field1185 = arg0.method2401();
        } else if (arg1 == 6) {
            this.field1175 = arg0.method2401();
        } else if (arg1 == 7) {
            this.field1171 = arg0.method2401();
            if (this.field1171 > 32767) {
                this.field1171 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1172 = arg0.method2401();
            if (this.field1172 > 32767) {
                this.field1172 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1173 = 1;
        } else if (arg1 == 12) {
            this.field1181 = arg0.method2404();
        } else if (arg1 == 16) {
            this.field1168 = true;
        } else if (arg1 == 23) {
            this.field1178 = arg0.method2401();
            this.field1180 = arg0.method2522();
        } else if (arg1 == 24) {
            this.field1179 = arg0.method2401();
        } else if (arg1 == 25) {
            this.field1169 = arg0.method2401();
            this.field1183 = arg0.method2522();
        } else if (arg1 == 26) {
            this.field1182 = arg0.method2401();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1176[arg1 - 30] = arg0.method2407();
            if (this.field1176[arg1 - 30].equalsIgnoreCase(class161.field2351)) {
                this.field1176[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1177[arg1 - 35] = arg0.method2407();
        } else if (arg1 == 40) {
            int var3 = arg0.method2522();
            this.field1163 = new short[var3];
            this.field1164 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1163[var4] = (short) arg0.method2401();
                this.field1164[var4] = (short) arg0.method2401();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2522();
            this.field1165 = new short[var5];
            this.field1151 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1165[var6] = (short) arg0.method2401();
                this.field1151[var6] = (short) arg0.method2401();
            }
        } else if (arg1 == 65) {
            this.field1200 = true;
        } else if (arg1 == 78) {
            this.field1184 = arg0.method2401();
        } else if (arg1 == 79) {
            this.field1154 = arg0.method2401();
        } else if (arg1 == 90) {
            this.field1186 = arg0.method2401();
        } else if (arg1 == 91) {
            this.field1188 = arg0.method2401();
        } else if (arg1 == 92) {
            this.field1160 = arg0.method2401();
        } else if (arg1 == 93) {
            this.field1166 = arg0.method2401();
        } else if (arg1 == 95) {
            this.field1199 = arg0.method2401();
        } else if (arg1 == 97) {
            this.field1192 = arg0.method2401();
        } else if (arg1 == 98) {
            this.field1193 = arg0.method2401();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1190 == null) {
                this.field1190 = new int[10];
                this.field1191 = new int[10];
            }
            this.field1190[arg1 - 100] = arg0.method2401();
            this.field1191[arg1 - 100] = arg0.method2401();
        } else if (arg1 == 110) {
            this.field1162 = arg0.method2401();
        } else if (arg1 == 111) {
            this.field1161 = arg0.method2401();
        } else if (arg1 == 112) {
            this.field1196 = arg0.method2401();
        } else if (arg1 == 113) {
            this.field1197 = arg0.method2400();
        } else if (arg1 == 114) {
            this.field1195 = arg0.method2400() * 5;
        } else if (arg1 == 115) {
            this.field1194 = arg0.method2522();
        } else if (arg1 == 139) {
            this.field1189 = arg0.method2401();
        } else if (arg1 == 140) {
            this.field1202 = arg0.method2401();
        } else if (arg1 == 148) {
            this.field1203 = arg0.method2401();
        } else if (arg1 == 149) {
            this.field1204 = arg0.method2401();
        }
    }

    @ObfuscatedName("bv.v(Lbv;Lbv;B)V")
    public void method1086(class56 arg0, class56 arg1) {
        this.field1170 = arg0.field1170;
        this.field1167 = arg0.field1167;
        this.field1185 = arg0.field1185;
        this.field1175 = arg0.field1175;
        this.field1199 = arg0.field1199;
        this.field1171 = arg0.field1171;
        this.field1172 = arg0.field1172;
        this.field1163 = arg0.field1163;
        this.field1164 = arg0.field1164;
        this.field1165 = arg0.field1165;
        this.field1151 = arg0.field1151;
        this.field1201 = arg1.field1201;
        this.field1168 = arg1.field1168;
        this.field1181 = arg1.field1181;
        this.field1173 = 1;
    }

    @ObfuscatedName("bv.b(Lbv;Lbv;I)V")
    public void method1087(class56 arg0, class56 arg1) {
        this.field1170 = arg0.field1170;
        this.field1167 = arg0.field1167;
        this.field1185 = arg0.field1185;
        this.field1175 = arg0.field1175;
        this.field1199 = arg0.field1199;
        this.field1171 = arg0.field1171;
        this.field1172 = arg0.field1172;
        this.field1163 = arg1.field1163;
        this.field1164 = arg1.field1164;
        this.field1165 = arg1.field1165;
        this.field1151 = arg1.field1151;
        this.field1201 = arg1.field1201;
        this.field1168 = arg1.field1168;
        this.field1173 = arg1.field1173;
        this.field1178 = arg1.field1178;
        this.field1179 = arg1.field1179;
        this.field1184 = arg1.field1184;
        this.field1169 = arg1.field1169;
        this.field1182 = arg1.field1182;
        this.field1154 = arg1.field1154;
        this.field1186 = arg1.field1186;
        this.field1160 = arg1.field1160;
        this.field1188 = arg1.field1188;
        this.field1166 = arg1.field1166;
        this.field1194 = arg1.field1194;
        this.field1176 = arg1.field1176;
        this.field1177 = new String[5];
        if (arg1.field1177 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1177[var3] = arg1.field1177[var3];
            }
        }
        this.field1177[4] = class161.field2355;
        this.field1181 = 0;
    }

    @ObfuscatedName("bv.m(Lbv;Lbv;I)V")
    public void method1135(class56 arg0, class56 arg1) {
        this.field1170 = arg0.field1170;
        this.field1167 = arg0.field1167;
        this.field1185 = arg0.field1185;
        this.field1175 = arg0.field1175;
        this.field1199 = arg0.field1199;
        this.field1171 = arg0.field1171;
        this.field1172 = arg0.field1172;
        this.field1163 = arg0.field1163;
        this.field1164 = arg0.field1164;
        this.field1165 = arg0.field1165;
        this.field1151 = arg0.field1151;
        this.field1173 = arg0.field1173;
        this.field1201 = arg1.field1201;
        this.field1181 = 0;
        this.field1168 = false;
        this.field1200 = false;
    }

    @ObfuscatedName("bv.k(II)Lca;")
    public final class104 method1089(int arg0) {
        if (this.field1190 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1191[var3] && this.field1191[var3] != 0) {
                    var2 = this.field1190[var3];
                }
            }
            if (var2 != -1) {
                return method905(var2).method1089(1);
            }
        }
        class104 var4 = class104.method2114(Statics.field1174, this.field1170, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1162 != 128 || this.field1161 != 128 || this.field1196 != 128) {
            var4.method2129(this.field1162, this.field1161, this.field1196);
        }
        if (this.field1163 != null) {
            for (int var5 = 0; var5 < this.field1163.length; var5++) {
                var4.method2126(this.field1163[var5], this.field1164[var5]);
            }
        }
        if (this.field1165 != null) {
            for (int var6 = 0; var6 < this.field1165.length; var6++) {
                var4.method2127(this.field1165[var6], this.field1151[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bv.c(IB)Ldg;")
    public final class109 method1090(int arg0) {
        if (this.field1190 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1191[var3] && this.field1191[var3] != 0) {
                    var2 = this.field1190[var3];
                }
            }
            if (var2 != -1) {
                return method905(var2).method1090(1);
            }
        }
        class109 var4 = (class109) field1198.method3569((long) this.field1157);
        if (var4 != null) {
            return var4;
        }
        class104 var5 = class104.method2114(Statics.field1174, this.field1170, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1162 != 128 || this.field1161 != 128 || this.field1196 != 128) {
            var5.method2129(this.field1162, this.field1161, this.field1196);
        }
        if (this.field1163 != null) {
            for (int var6 = 0; var6 < this.field1163.length; var6++) {
                var5.method2126(this.field1163[var6], this.field1164[var6]);
            }
        }
        if (this.field1165 != null) {
            for (int var7 = 0; var7 < this.field1165.length; var7++) {
                var5.method2127(this.field1165[var7], this.field1151[var7]);
            }
        }
        class109 var8 = var5.method2134(this.field1197 + 64, this.field1195 + 768, -50, -10, -50);
        var8.field1916 = true;
        field1198.method3571(var8, (long) this.field1157);
        return var8;
    }

    @ObfuscatedName("bv.w(II)Lbv;")
    public class56 method1091(int arg0) {
        if (this.field1190 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1191[var3] && this.field1191[var3] != 0) {
                    var2 = this.field1190[var3];
                }
            }
            if (var2 != -1) {
                return method905(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("bk.l(IIIIIZI)Lcw;")
    public static final class82 method1065(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class82 var8 = (class82) field1158.method3569(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class56 var9 = method905(arg0);
        if (arg1 > 1 && var9.field1190 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1191[var11] && var9.field1191[var11] != 0) {
                    var10 = var9.field1190[var11];
                }
            }
            if (var10 != -1) {
                var9 = method905(var10);
            }
        }
        class109 var12 = var9.method1090(1);
        if (var12 == null) {
            return null;
        }
        class82 var13 = null;
        if (var9.field1193 != -1) {
            var13 = method1065(var9.field1192, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1202 != -1) {
            var13 = method1065(var9.field1189, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1204 != -1) {
            var13 = method1065(var9.field1203, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1466;
        int var15 = Statics.field1465;
        int var16 = Statics.field1468;
        int[] var17 = new int[4];
        class83.method1749(var17);
        class82 var18 = new class82(36, 32);
        class83.method1744(var18.field1453, 36, 32);
        class83.method1751();
        class95.method2023();
        class95.method2026(16, 16);
        class95.field1626 = false;
        if (var9.field1204 != -1) {
            var13.method1670(0, 0);
        }
        int var19 = var9.field1167;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class95.field1636[var9.field1185] * var19 >> 16;
        int var21 = class95.field1647[var9.field1185] * var19 >> 16;
        var12.method2251();
        var12.method2212(0, var9.field1175, var9.field1199, var9.field1185, var9.field1171, var9.field1172 + var12.field1518 / 2 + var20, var9.field1172 + var21);
        if (var9.field1202 != -1) {
            var13.method1670(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1726(1);
        }
        if (arg2 >= 2) {
            var18.method1726(16777215);
        }
        if (arg3 != 0) {
            var18.method1667(arg3);
        }
        class83.method1744(var18.field1453, 36, 32);
        if (var9.field1193 != -1) {
            var13.method1670(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1173 == 1) {
            Statics.field1159.method3852(method558(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1158.method3571(var18, var6);
        }
        class83.method1744(var14, var15, var16);
        class83.method1769(var17);
        class95.method2023();
        class95.field1626 = true;
        return var18;
    }

    @ObfuscatedName("a.h(IS)Ljava/lang/String;")
    public static final String method558(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class161.field2379 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class161.field2508 + "</col>";
        }
    }

    @ObfuscatedName("bv.i(ZI)Z")
    public final boolean method1084(boolean arg0) {
        int var2 = this.field1178;
        int var3 = this.field1179;
        int var4 = this.field1184;
        if (arg0) {
            var2 = this.field1169;
            var3 = this.field1182;
            var4 = this.field1154;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1174.method3156(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1174.method3156(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1174.method3156(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("bv.u(ZI)Lca;")
    public final class104 method1109(boolean arg0) {
        int var2 = this.field1178;
        int var3 = this.field1179;
        int var4 = this.field1184;
        if (arg0) {
            var2 = this.field1169;
            var3 = this.field1182;
            var4 = this.field1154;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var5 = class104.method2114(Statics.field1174, var2, 0);
        if (var3 != -1) {
            class104 var6 = class104.method2114(Statics.field1174, var3, 0);
            if (var4 == -1) {
                class104[] var9 = new class104[] { var5, var6 };
                var5 = new class104(var9, 2);
            } else {
                class104 var7 = class104.method2114(Statics.field1174, var4, 0);
                class104[] var8 = new class104[] { var5, var6, var7 };
                var5 = new class104(var8, 3);
            }
        }
        if (!arg0 && this.field1180 != 0) {
            var5.method2125(0, this.field1180, 0);
        }
        if (arg0 && this.field1183 != 0) {
            var5.method2125(0, this.field1183, 0);
        }
        if (this.field1163 != null) {
            for (int var10 = 0; var10 < this.field1163.length; var10++) {
                var5.method2126(this.field1163[var10], this.field1164[var10]);
            }
        }
        if (this.field1165 != null) {
            for (int var11 = 0; var11 < this.field1165.length; var11++) {
                var5.method2127(this.field1165[var11], this.field1151[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("bv.x(ZI)Z")
    public final boolean method1094(boolean arg0) {
        int var2 = this.field1186;
        int var3 = this.field1160;
        if (arg0) {
            var2 = this.field1188;
            var3 = this.field1166;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1174.method3156(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1174.method3156(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("bv.d(ZI)Lca;")
    public final class104 method1095(boolean arg0) {
        int var2 = this.field1186;
        int var3 = this.field1160;
        if (arg0) {
            var2 = this.field1188;
            var3 = this.field1166;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var4 = class104.method2114(Statics.field1174, var2, 0);
        if (var3 != -1) {
            class104 var5 = class104.method2114(Statics.field1174, var3, 0);
            class104[] var6 = new class104[] { var4, var5 };
            var4 = new class104(var6, 2);
        }
        if (this.field1163 != null) {
            for (int var7 = 0; var7 < this.field1163.length; var7++) {
                var4.method2126(this.field1163[var7], this.field1164[var7]);
            }
        }
        if (this.field1165 != null) {
            for (int var8 = 0; var8 < this.field1165.length; var8++) {
                var4.method2127(this.field1165[var8], this.field1151[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("dq.o(I)V")
    public static void method2345() {
        field1156.method3572();
        field1198.method3572();
        field1158.method3572();
    }
}

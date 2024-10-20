package deob;

@ObfuscatedName("bs")
public class class56 extends class208 {

    @ObfuscatedName("bs.r")
    public static class197 field1179 = new class197(64);

    @ObfuscatedName("bs.x")
    public static class197 field1204 = new class197(50);

    @ObfuscatedName("bs.k")
    public static class197 field1181 = new class197(200);

    @ObfuscatedName("bs.h")
    public int field1182;

    @ObfuscatedName("bs.u")
    public int field1219;

    @ObfuscatedName("bs.y")
    public String field1184 = "null";

    @ObfuscatedName("bs.p")
    public short[] field1185;

    @ObfuscatedName("bs.s")
    public short[] field1174;

    @ObfuscatedName("bs.f")
    public short[] field1187;

    @ObfuscatedName("bs.i")
    public short[] field1188;

    @ObfuscatedName("bs.d")
    public int field1189 = 2000;

    @ObfuscatedName("bs.t")
    public int field1217 = 0;

    @ObfuscatedName("bs.c")
    public int field1191 = 0;

    @ObfuscatedName("bs.z")
    public int field1190 = 0;

    @ObfuscatedName("bs.n")
    public int field1193 = 0;

    @ObfuscatedName("bs.q")
    public int field1194 = 0;

    @ObfuscatedName("bs.a")
    public int field1195 = 0;

    @ObfuscatedName("bs.b")
    public int field1186 = 1;

    @ObfuscatedName("bs.aj")
    public boolean field1197 = false;

    @ObfuscatedName("bs.an")
    public String[] field1198 = new String[] { null, null, class161.field2619, null, null };

    @ObfuscatedName("bs.ap")
    public String[] field1199 = new String[] { null, null, null, null, class161.field2371 };

    @ObfuscatedName("bs.ar")
    public int field1200 = -1;

    @ObfuscatedName("bs.ab")
    public int field1192 = -1;

    @ObfuscatedName("bs.ai")
    public int field1202 = 0;

    @ObfuscatedName("bs.aa")
    public int field1203 = -1;

    @ObfuscatedName("bs.ax")
    public int field1201 = -1;

    @ObfuscatedName("bs.ad")
    public int field1205 = 0;

    @ObfuscatedName("bs.av")
    public int field1213 = -1;

    @ObfuscatedName("bs.aq")
    public int field1207 = -1;

    @ObfuscatedName("bs.af")
    public int field1208 = -1;

    @ObfuscatedName("bs.at")
    public int field1224 = -1;

    @ObfuscatedName("bs.aw")
    public int field1210 = -1;

    @ObfuscatedName("bs.ay")
    public int field1211 = -1;

    @ObfuscatedName("bs.ah")
    public int[] field1212;

    @ObfuscatedName("bs.al")
    public int[] field1209;

    @ObfuscatedName("bs.as")
    public int field1214 = -1;

    @ObfuscatedName("bs.ac")
    public int field1215 = -1;

    @ObfuscatedName("bs.ao")
    public int field1216 = 128;

    @ObfuscatedName("bs.au")
    public int field1177 = 128;

    @ObfuscatedName("bs.am")
    public int field1196 = 128;

    @ObfuscatedName("bs.ag")
    public int field1206 = 0;

    @ObfuscatedName("bs.az")
    public int field1220 = 0;

    @ObfuscatedName("bs.ak")
    public int field1183 = 0;

    @ObfuscatedName("bs.ae")
    public boolean field1221 = false;

    @ObfuscatedName("bs.br")
    public int field1223 = -1;

    @ObfuscatedName("bs.bi")
    public int field1180 = -1;

    @ObfuscatedName("bs.bx")
    public int field1225 = -1;

    @ObfuscatedName("bs.bs")
    public int field1226 = -1;

    @ObfuscatedName("g.m(II)Lbs;")
    public static class56 method43(int arg0) {
        class56 var1 = (class56) field1179.method3556((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1231.method3086(10, arg0);
        class56 var3 = new class56();
        var3.field1182 = arg0;
        if (var2 != null) {
            var3.method1100(new class123(var2));
        }
        var3.method1113();
        if (var3.field1215 != -1) {
            var3.method1107(method43(var3.field1215), method43(var3.field1214));
        }
        if (var3.field1180 != -1) {
            var3.method1103(method43(var3.field1180), method43(var3.field1223));
        }
        if (var3.field1226 != -1) {
            var3.method1104(method43(var3.field1226), method43(var3.field1225));
        }
        if (!Statics.field1176 && var3.field1197) {
            var3.field1184 = class161.field2390;
            var3.field1221 = false;
            var3.field1198 = null;
            var3.field1199 = null;
            var3.field1183 = 0;
        }
        field1179.method3562(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bs.w(I)V")
    public void method1113() {
    }

    @ObfuscatedName("bs.e(Ldj;S)V")
    public void method1100(class123 arg0) {
        while (true) {
            int var2 = arg0.method2398();
            if (var2 == 0) {
                return;
            }
            this.method1123(arg0, var2);
        }
    }

    @ObfuscatedName("bs.o(Ldj;II)V")
    public void method1123(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1219 = arg0.method2548();
        } else if (arg1 == 2) {
            this.field1184 = arg0.method2422();
        } else if (arg1 == 4) {
            this.field1189 = arg0.method2548();
        } else if (arg1 == 5) {
            this.field1217 = arg0.method2548();
        } else if (arg1 == 6) {
            this.field1191 = arg0.method2548();
        } else if (arg1 == 7) {
            this.field1193 = arg0.method2548();
            if (this.field1193 > 32767) {
                this.field1193 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1194 = arg0.method2548();
            if (this.field1194 > 32767) {
                this.field1194 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1195 = 1;
        } else if (arg1 == 12) {
            this.field1186 = arg0.method2419();
        } else if (arg1 == 16) {
            this.field1197 = true;
        } else if (arg1 == 23) {
            this.field1200 = arg0.method2548();
            this.field1202 = arg0.method2398();
        } else if (arg1 == 24) {
            this.field1192 = arg0.method2548();
        } else if (arg1 == 25) {
            this.field1203 = arg0.method2548();
            this.field1205 = arg0.method2398();
        } else if (arg1 == 26) {
            this.field1201 = arg0.method2548();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1198[arg1 - 30] = arg0.method2422();
            if (this.field1198[arg1 - 30].equalsIgnoreCase(class161.field2372)) {
                this.field1198[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1199[arg1 - 35] = arg0.method2422();
        } else if (arg1 == 40) {
            int var3 = arg0.method2398();
            this.field1185 = new short[var3];
            this.field1174 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1185[var4] = (short) arg0.method2548();
                this.field1174[var4] = (short) arg0.method2548();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2398();
            this.field1187 = new short[var5];
            this.field1188 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1187[var6] = (short) arg0.method2548();
                this.field1188[var6] = (short) arg0.method2548();
            }
        } else if (arg1 == 65) {
            this.field1221 = true;
        } else if (arg1 == 78) {
            this.field1213 = arg0.method2548();
        } else if (arg1 == 79) {
            this.field1207 = arg0.method2548();
        } else if (arg1 == 90) {
            this.field1208 = arg0.method2548();
        } else if (arg1 == 91) {
            this.field1210 = arg0.method2548();
        } else if (arg1 == 92) {
            this.field1224 = arg0.method2548();
        } else if (arg1 == 93) {
            this.field1211 = arg0.method2548();
        } else if (arg1 == 95) {
            this.field1190 = arg0.method2548();
        } else if (arg1 == 97) {
            this.field1214 = arg0.method2548();
        } else if (arg1 == 98) {
            this.field1215 = arg0.method2548();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1212 == null) {
                this.field1212 = new int[10];
                this.field1209 = new int[10];
            }
            this.field1212[arg1 - 100] = arg0.method2548();
            this.field1209[arg1 - 100] = arg0.method2548();
        } else if (arg1 == 110) {
            this.field1216 = arg0.method2548();
        } else if (arg1 == 111) {
            this.field1177 = arg0.method2548();
        } else if (arg1 == 112) {
            this.field1196 = arg0.method2548();
        } else if (arg1 == 113) {
            this.field1206 = arg0.method2415();
        } else if (arg1 == 114) {
            this.field1220 = arg0.method2415() * 5;
        } else if (arg1 == 115) {
            this.field1183 = arg0.method2398();
        } else if (arg1 == 139) {
            this.field1223 = arg0.method2548();
        } else if (arg1 == 140) {
            this.field1180 = arg0.method2548();
        } else if (arg1 == 148) {
            this.field1225 = arg0.method2548();
        } else if (arg1 == 149) {
            this.field1226 = arg0.method2548();
        }
    }

    @ObfuscatedName("bs.g(Lbs;Lbs;I)V")
    public void method1107(class56 arg0, class56 arg1) {
        this.field1219 = arg0.field1219;
        this.field1189 = arg0.field1189;
        this.field1217 = arg0.field1217;
        this.field1191 = arg0.field1191;
        this.field1190 = arg0.field1190;
        this.field1193 = arg0.field1193;
        this.field1194 = arg0.field1194;
        this.field1185 = arg0.field1185;
        this.field1174 = arg0.field1174;
        this.field1187 = arg0.field1187;
        this.field1188 = arg0.field1188;
        this.field1184 = arg1.field1184;
        this.field1197 = arg1.field1197;
        this.field1186 = arg1.field1186;
        this.field1195 = 1;
    }

    @ObfuscatedName("bs.l(Lbs;Lbs;B)V")
    public void method1103(class56 arg0, class56 arg1) {
        this.field1219 = arg0.field1219;
        this.field1189 = arg0.field1189;
        this.field1217 = arg0.field1217;
        this.field1191 = arg0.field1191;
        this.field1190 = arg0.field1190;
        this.field1193 = arg0.field1193;
        this.field1194 = arg0.field1194;
        this.field1185 = arg1.field1185;
        this.field1174 = arg1.field1174;
        this.field1187 = arg1.field1187;
        this.field1188 = arg1.field1188;
        this.field1184 = arg1.field1184;
        this.field1197 = arg1.field1197;
        this.field1195 = arg1.field1195;
        this.field1200 = arg1.field1200;
        this.field1192 = arg1.field1192;
        this.field1213 = arg1.field1213;
        this.field1203 = arg1.field1203;
        this.field1201 = arg1.field1201;
        this.field1207 = arg1.field1207;
        this.field1208 = arg1.field1208;
        this.field1224 = arg1.field1224;
        this.field1210 = arg1.field1210;
        this.field1211 = arg1.field1211;
        this.field1183 = arg1.field1183;
        this.field1198 = arg1.field1198;
        this.field1199 = new String[5];
        if (arg1.field1199 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1199[var3] = arg1.field1199[var3];
            }
        }
        this.field1199[4] = class161.field2396;
        this.field1186 = 0;
    }

    @ObfuscatedName("bs.j(Lbs;Lbs;I)V")
    public void method1104(class56 arg0, class56 arg1) {
        this.field1219 = arg0.field1219;
        this.field1189 = arg0.field1189;
        this.field1217 = arg0.field1217;
        this.field1191 = arg0.field1191;
        this.field1190 = arg0.field1190;
        this.field1193 = arg0.field1193;
        this.field1194 = arg0.field1194;
        this.field1185 = arg0.field1185;
        this.field1174 = arg0.field1174;
        this.field1187 = arg0.field1187;
        this.field1188 = arg0.field1188;
        this.field1195 = arg0.field1195;
        this.field1184 = arg1.field1184;
        this.field1186 = 0;
        this.field1197 = false;
        this.field1221 = false;
    }

    @ObfuscatedName("bs.r(II)Lcj;")
    public final class104 method1105(int arg0) {
        if (this.field1212 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1209[var3] && this.field1209[var3] != 0) {
                    var2 = this.field1212[var3];
                }
            }
            if (var2 != -1) {
                return method43(var2).method1105(1);
            }
        }
        class104 var4 = class104.method2177(Statics.field2119, this.field1219, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1216 != 128 || this.field1177 != 128 || this.field1196 != 128) {
            var4.method2202(this.field1216, this.field1177, this.field1196);
        }
        if (this.field1185 != null) {
            for (int var5 = 0; var5 < this.field1185.length; var5++) {
                var4.method2171(this.field1185[var5], this.field1174[var5]);
            }
        }
        if (this.field1187 != null) {
            for (int var6 = 0; var6 < this.field1187.length; var6++) {
                var4.method2152(this.field1187[var6], this.field1188[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bs.x(II)Ldg;")
    public final class109 method1117(int arg0) {
        if (this.field1212 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1209[var3] && this.field1209[var3] != 0) {
                    var2 = this.field1212[var3];
                }
            }
            if (var2 != -1) {
                return method43(var2).method1117(1);
            }
        }
        class109 var4 = (class109) field1204.method3556((long) this.field1182);
        if (var4 != null) {
            return var4;
        }
        class104 var5 = class104.method2177(Statics.field2119, this.field1219, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1216 != 128 || this.field1177 != 128 || this.field1196 != 128) {
            var5.method2202(this.field1216, this.field1177, this.field1196);
        }
        if (this.field1185 != null) {
            for (int var6 = 0; var6 < this.field1185.length; var6++) {
                var5.method2171(this.field1185[var6], this.field1174[var6]);
            }
        }
        if (this.field1187 != null) {
            for (int var7 = 0; var7 < this.field1187.length; var7++) {
                var5.method2152(this.field1187[var7], this.field1188[var7]);
            }
        }
        class109 var8 = var5.method2159(this.field1206 + 64, this.field1220 + 768, -50, -10, -50);
        var8.field1925 = true;
        field1204.method3562(var8, (long) this.field1182);
        return var8;
    }

    @ObfuscatedName("bs.k(IB)Lbs;")
    public class56 method1108(int arg0) {
        if (this.field1212 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1209[var3] && this.field1209[var3] != 0) {
                    var2 = this.field1212[var3];
                }
            }
            if (var2 != -1) {
                return method43(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("o.v(IIIIIZB)Lcz;")
    public static final class82 method39(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class82 var8 = (class82) field1181.method3556(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class56 var9 = method43(arg0);
        if (arg1 > 1 && var9.field1212 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1209[var11] && var9.field1209[var11] != 0) {
                    var10 = var9.field1212[var11];
                }
            }
            if (var10 != -1) {
                var9 = method43(var10);
            }
        }
        class109 var12 = var9.method1117(1);
        if (var12 == null) {
            return null;
        }
        class82 var13 = null;
        if (var9.field1215 != -1) {
            var13 = method39(var9.field1214, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1180 != -1) {
            var13 = method39(var9.field1223, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1226 != -1) {
            var13 = method39(var9.field1225, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1493;
        int var15 = Statics.field1489;
        int var16 = Statics.field1490;
        int[] var17 = new int[4];
        class83.method1769(var17);
        class82 var18 = new class82(36, 32);
        class83.method1765(var18.field1487, 36, 32);
        class83.method1815();
        class95.method2036();
        class95.method2039(16, 16);
        class95.field1648 = false;
        if (var9.field1226 != -1) {
            var13.method1692(0, 0);
        }
        int var19 = var9.field1189;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class95.field1661[var9.field1217] * var19 >> 16;
        int var21 = class95.field1662[var9.field1217] * var19 >> 16;
        var12.method2237();
        var12.method2270(0, var9.field1191, var9.field1190, var9.field1217, var9.field1193, var9.field1194 + var12.field1537 / 2 + var20, var9.field1194 + var21);
        if (var9.field1180 != -1) {
            var13.method1692(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1688(1);
        }
        if (arg2 >= 2) {
            var18.method1688(16777215);
        }
        if (arg3 != 0) {
            var18.method1713(arg3);
        }
        class83.method1765(var18.field1487, 36, 32);
        if (var9.field1215 != -1) {
            var13.method1692(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1195 == 1) {
            class228 var22 = Statics.field1474;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class161.field2531 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class161.field2529 + "</col>";
            }
            var22.method3838(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1181.method3562(var18, var6);
        }
        class83.method1765(var14, var15, var16);
        class83.method1776(var17);
        class95.method2036();
        class95.field1648 = true;
        return var18;
    }

    @ObfuscatedName("bs.h(ZI)Z")
    public final boolean method1126(boolean arg0) {
        int var2 = this.field1200;
        int var3 = this.field1192;
        int var4 = this.field1213;
        if (arg0) {
            var2 = this.field1203;
            var3 = this.field1201;
            var4 = this.field1207;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2119.method3141(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2119.method3141(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2119.method3141(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("bs.u(ZI)Lcj;")
    public final class104 method1128(boolean arg0) {
        int var2 = this.field1200;
        int var3 = this.field1192;
        int var4 = this.field1213;
        if (arg0) {
            var2 = this.field1203;
            var3 = this.field1201;
            var4 = this.field1207;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var5 = class104.method2177(Statics.field2119, var2, 0);
        if (var3 != -1) {
            class104 var6 = class104.method2177(Statics.field2119, var3, 0);
            if (var4 == -1) {
                class104[] var9 = new class104[] { var5, var6 };
                var5 = new class104(var9, 2);
            } else {
                class104 var7 = class104.method2177(Statics.field2119, var4, 0);
                class104[] var8 = new class104[] { var5, var6, var7 };
                var5 = new class104(var8, 3);
            }
        }
        if (!arg0 && this.field1202 != 0) {
            var5.method2168(0, this.field1202, 0);
        }
        if (arg0 && this.field1205 != 0) {
            var5.method2168(0, this.field1205, 0);
        }
        if (this.field1185 != null) {
            for (int var10 = 0; var10 < this.field1185.length; var10++) {
                var5.method2171(this.field1185[var10], this.field1174[var10]);
            }
        }
        if (this.field1187 != null) {
            for (int var11 = 0; var11 < this.field1187.length; var11++) {
                var5.method2152(this.field1187[var11], this.field1188[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("bs.y(ZI)Z")
    public final boolean method1110(boolean arg0) {
        int var2 = this.field1208;
        int var3 = this.field1224;
        if (arg0) {
            var2 = this.field1210;
            var3 = this.field1211;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2119.method3141(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2119.method3141(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("bs.p(ZB)Lcj;")
    public final class104 method1111(boolean arg0) {
        int var2 = this.field1208;
        int var3 = this.field1224;
        if (arg0) {
            var2 = this.field1210;
            var3 = this.field1211;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var4 = class104.method2177(Statics.field2119, var2, 0);
        if (var3 != -1) {
            class104 var5 = class104.method2177(Statics.field2119, var3, 0);
            class104[] var6 = new class104[] { var4, var5 };
            var4 = new class104(var6, 2);
        }
        if (this.field1185 != null) {
            for (int var7 = 0; var7 < this.field1185.length; var7++) {
                var4.method2171(this.field1185[var7], this.field1174[var7]);
            }
        }
        if (this.field1187 != null) {
            for (int var8 = 0; var8 < this.field1187.length; var8++) {
                var4.method2152(this.field1187[var8], this.field1188[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("u.s(I)V")
    public static void method142() {
        field1179.method3553();
        field1204.method3553();
        field1181.method3553();
    }
}

package deob;

@ObfuscatedName("bt")
public class class56 extends class208 {

    @ObfuscatedName("bt.u")
    public static class197 field1187 = new class197(64);

    @ObfuscatedName("bt.n")
    public static class197 field1223 = new class197(50);

    @ObfuscatedName("bt.b")
    public static class197 field1178 = new class197(200);

    @ObfuscatedName("bt.q")
    public int field1185;

    @ObfuscatedName("bt.p")
    public int field1186;

    @ObfuscatedName("bt.w")
    public String field1184 = "null";

    @ObfuscatedName("bt.o")
    public short[] field1210;

    @ObfuscatedName("bt.d")
    public short[] field1202;

    @ObfuscatedName("bt.f")
    public short[] field1224;

    @ObfuscatedName("bt.z")
    public short[] field1183;

    @ObfuscatedName("bt.i")
    public int field1192 = 2000;

    @ObfuscatedName("bt.v")
    public int field1189 = 0;

    @ObfuscatedName("bt.j")
    public int field1194 = 0;

    @ObfuscatedName("bt.x")
    public int field1195 = 0;

    @ObfuscatedName("bt.t")
    public int field1180 = 0;

    @ObfuscatedName("bt.y")
    public int field1197 = 0;

    @ObfuscatedName("bt.a")
    public int field1198 = 0;

    @ObfuscatedName("bt.c")
    public int field1213 = 1;

    @ObfuscatedName("bt.ad")
    public boolean field1200 = false;

    @ObfuscatedName("bt.as")
    public String[] field1201 = new String[] { null, null, class161.field2373, null, null };

    @ObfuscatedName("bt.ac")
    public String[] field1182 = new String[] { null, null, null, null, class161.field2478 };

    @ObfuscatedName("bt.ah")
    public int field1203 = -1;

    @ObfuscatedName("bt.am")
    public int field1204 = -1;

    @ObfuscatedName("bt.aq")
    public int field1205 = 0;

    @ObfuscatedName("bt.az")
    public int field1206 = -1;

    @ObfuscatedName("bt.ak")
    public int field1207 = -1;

    @ObfuscatedName("bt.ag")
    public int field1208 = 0;

    @ObfuscatedName("bt.af")
    public int field1209 = -1;

    @ObfuscatedName("bt.ab")
    public int field1177 = -1;

    @ObfuscatedName("bt.ap")
    public int field1211 = -1;

    @ObfuscatedName("bt.ao")
    public int field1212 = -1;

    @ObfuscatedName("bt.ay")
    public int field1193 = -1;

    @ObfuscatedName("bt.ai")
    public int field1218 = -1;

    @ObfuscatedName("bt.aj")
    public int[] field1215;

    @ObfuscatedName("bt.ae")
    public int[] field1216;

    @ObfuscatedName("bt.ar")
    public int field1217 = -1;

    @ObfuscatedName("bt.at")
    public int field1179 = -1;

    @ObfuscatedName("bt.av")
    public int field1219 = 128;

    @ObfuscatedName("bt.aw")
    public int field1220 = 128;

    @ObfuscatedName("bt.au")
    public int field1221 = 128;

    @ObfuscatedName("bt.ax")
    public int field1222 = 0;

    @ObfuscatedName("bt.al")
    public int field1196 = 0;

    @ObfuscatedName("bt.an")
    public int field1190 = 0;

    @ObfuscatedName("bt.aa")
    public boolean field1225 = false;

    @ObfuscatedName("bt.bc")
    public int field1226 = -1;

    @ObfuscatedName("bt.bq")
    public int field1227 = -1;

    @ObfuscatedName("bt.bj")
    public int field1228 = -1;

    @ObfuscatedName("bt.bt")
    public int field1214 = -1;

    @ObfuscatedName("n.l(Lfp;Lfp;ZLhc;B)V")
    public static void method120(class171 arg0, class171 arg1, boolean arg2, class228 arg3) {
        Statics.field1188 = arg0;
        Statics.field1191 = arg1;
        Statics.field1199 = arg2;
        Statics.field1181 = Statics.field1188.method3204(10);
        Statics.field1073 = arg3;
    }

    @ObfuscatedName("g.g(II)Lbt;")
    public static class56 method15(int arg0) {
        class56 var1 = (class56) field1187.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1188.method3210(10, arg0);
        class56 var3 = new class56();
        var3.field1185 = arg0;
        if (var2 != null) {
            var3.method1200(new class123(var2));
        }
        var3.method1147();
        if (var3.field1179 != -1) {
            var3.method1149(method15(var3.field1179), method15(var3.field1217));
        }
        if (var3.field1227 != -1) {
            var3.method1150(method15(var3.field1227), method15(var3.field1226));
        }
        if (var3.field1214 != -1) {
            var3.method1151(method15(var3.field1214), method15(var3.field1228));
        }
        if (!Statics.field1199 && var3.field1200) {
            var3.field1184 = class161.field2565;
            var3.field1225 = false;
            var3.field1201 = null;
            var3.field1182 = null;
            var3.field1190 = 0;
        }
        field1187.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bt.r(I)V")
    public void method1147() {
    }

    @ObfuscatedName("bt.e(Ldc;I)V")
    public void method1200(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method1208(arg0, var2);
        }
    }

    @ObfuscatedName("bt.h(Ldc;IB)V")
    public void method1208(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1186 = arg0.method2492();
        } else if (arg1 == 2) {
            this.field1184 = arg0.method2520();
        } else if (arg1 == 4) {
            this.field1192 = arg0.method2492();
        } else if (arg1 == 5) {
            this.field1189 = arg0.method2492();
        } else if (arg1 == 6) {
            this.field1194 = arg0.method2492();
        } else if (arg1 == 7) {
            this.field1180 = arg0.method2492();
            if (this.field1180 > 32767) {
                this.field1180 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1197 = arg0.method2492();
            if (this.field1197 > 32767) {
                this.field1197 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1198 = 1;
        } else if (arg1 == 12) {
            this.field1213 = arg0.method2477();
        } else if (arg1 == 16) {
            this.field1200 = true;
        } else if (arg1 == 23) {
            this.field1203 = arg0.method2492();
            this.field1205 = arg0.method2490();
        } else if (arg1 == 24) {
            this.field1204 = arg0.method2492();
        } else if (arg1 == 25) {
            this.field1206 = arg0.method2492();
            this.field1208 = arg0.method2490();
        } else if (arg1 == 26) {
            this.field1207 = arg0.method2492();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1201[arg1 - 30] = arg0.method2520();
            if (this.field1201[arg1 - 30].equalsIgnoreCase(class161.field2378)) {
                this.field1201[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1182[arg1 - 35] = arg0.method2520();
        } else if (arg1 == 40) {
            int var3 = arg0.method2490();
            this.field1210 = new short[var3];
            this.field1202 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1210[var4] = (short) arg0.method2492();
                this.field1202[var4] = (short) arg0.method2492();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2490();
            this.field1224 = new short[var5];
            this.field1183 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1224[var6] = (short) arg0.method2492();
                this.field1183[var6] = (short) arg0.method2492();
            }
        } else if (arg1 == 65) {
            this.field1225 = true;
        } else if (arg1 == 78) {
            this.field1209 = arg0.method2492();
        } else if (arg1 == 79) {
            this.field1177 = arg0.method2492();
        } else if (arg1 == 90) {
            this.field1211 = arg0.method2492();
        } else if (arg1 == 91) {
            this.field1193 = arg0.method2492();
        } else if (arg1 == 92) {
            this.field1212 = arg0.method2492();
        } else if (arg1 == 93) {
            this.field1218 = arg0.method2492();
        } else if (arg1 == 95) {
            this.field1195 = arg0.method2492();
        } else if (arg1 == 97) {
            this.field1217 = arg0.method2492();
        } else if (arg1 == 98) {
            this.field1179 = arg0.method2492();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1215 == null) {
                this.field1215 = new int[10];
                this.field1216 = new int[10];
            }
            this.field1215[arg1 - 100] = arg0.method2492();
            this.field1216[arg1 - 100] = arg0.method2492();
        } else if (arg1 == 110) {
            this.field1219 = arg0.method2492();
        } else if (arg1 == 111) {
            this.field1220 = arg0.method2492();
        } else if (arg1 == 112) {
            this.field1221 = arg0.method2492();
        } else if (arg1 == 113) {
            this.field1222 = arg0.method2491();
        } else if (arg1 == 114) {
            this.field1196 = arg0.method2491();
        } else if (arg1 == 115) {
            this.field1190 = arg0.method2490();
        } else if (arg1 == 139) {
            this.field1226 = arg0.method2492();
        } else if (arg1 == 140) {
            this.field1227 = arg0.method2492();
        } else if (arg1 == 148) {
            this.field1228 = arg0.method2492();
        } else if (arg1 == 149) {
            this.field1214 = arg0.method2492();
        }
    }

    @ObfuscatedName("bt.s(Lbt;Lbt;B)V")
    public void method1149(class56 arg0, class56 arg1) {
        this.field1186 = arg0.field1186;
        this.field1192 = arg0.field1192;
        this.field1189 = arg0.field1189;
        this.field1194 = arg0.field1194;
        this.field1195 = arg0.field1195;
        this.field1180 = arg0.field1180;
        this.field1197 = arg0.field1197;
        this.field1210 = arg0.field1210;
        this.field1202 = arg0.field1202;
        this.field1224 = arg0.field1224;
        this.field1183 = arg0.field1183;
        this.field1184 = arg1.field1184;
        this.field1200 = arg1.field1200;
        this.field1213 = arg1.field1213;
        this.field1198 = 1;
    }

    @ObfuscatedName("bt.k(Lbt;Lbt;B)V")
    public void method1150(class56 arg0, class56 arg1) {
        this.field1186 = arg0.field1186;
        this.field1192 = arg0.field1192;
        this.field1189 = arg0.field1189;
        this.field1194 = arg0.field1194;
        this.field1195 = arg0.field1195;
        this.field1180 = arg0.field1180;
        this.field1197 = arg0.field1197;
        this.field1210 = arg1.field1210;
        this.field1202 = arg1.field1202;
        this.field1224 = arg1.field1224;
        this.field1183 = arg1.field1183;
        this.field1184 = arg1.field1184;
        this.field1200 = arg1.field1200;
        this.field1198 = arg1.field1198;
        this.field1203 = arg1.field1203;
        this.field1204 = arg1.field1204;
        this.field1209 = arg1.field1209;
        this.field1206 = arg1.field1206;
        this.field1207 = arg1.field1207;
        this.field1177 = arg1.field1177;
        this.field1211 = arg1.field1211;
        this.field1212 = arg1.field1212;
        this.field1193 = arg1.field1193;
        this.field1218 = arg1.field1218;
        this.field1190 = arg1.field1190;
        this.field1201 = arg1.field1201;
        this.field1182 = new String[5];
        if (arg1.field1182 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1182[var3] = arg1.field1182[var3];
            }
        }
        this.field1182[4] = class161.field2513;
        this.field1213 = 0;
    }

    @ObfuscatedName("bt.u(Lbt;Lbt;I)V")
    public void method1151(class56 arg0, class56 arg1) {
        this.field1186 = arg0.field1186;
        this.field1192 = arg0.field1192;
        this.field1189 = arg0.field1189;
        this.field1194 = arg0.field1194;
        this.field1195 = arg0.field1195;
        this.field1180 = arg0.field1180;
        this.field1197 = arg0.field1197;
        this.field1210 = arg0.field1210;
        this.field1202 = arg0.field1202;
        this.field1224 = arg0.field1224;
        this.field1183 = arg0.field1183;
        this.field1198 = arg0.field1198;
        this.field1184 = arg1.field1184;
        this.field1213 = 0;
        this.field1200 = false;
        this.field1225 = false;
    }

    @ObfuscatedName("bt.n(II)Lcc;")
    public final class104 method1193(int arg0) {
        if (this.field1215 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1216[var3] && this.field1216[var3] != 0) {
                    var2 = this.field1215[var3];
                }
            }
            if (var2 != -1) {
                return method15(var2).method1193(1);
            }
        }
        class104 var4 = class104.method2237(Statics.field1191, this.field1186, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1219 != 128 || this.field1220 != 128 || this.field1221 != 128) {
            var4.method2243(this.field1219, this.field1220, this.field1221);
        }
        if (this.field1210 != null) {
            for (int var5 = 0; var5 < this.field1210.length; var5++) {
                var4.method2173(this.field1210[var5], this.field1202[var5]);
            }
        }
        if (this.field1224 != null) {
            for (int var6 = 0; var6 < this.field1224.length; var6++) {
                var4.method2174(this.field1224[var6], this.field1183[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bt.b(IB)Ldv;")
    public final class109 method1153(int arg0) {
        if (this.field1215 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1216[var3] && this.field1216[var3] != 0) {
                    var2 = this.field1215[var3];
                }
            }
            if (var2 != -1) {
                return method15(var2).method1153(1);
            }
        }
        class109 var4 = (class109) field1223.method3653((long) this.field1185);
        if (var4 != null) {
            return var4;
        }
        class104 var5 = class104.method2237(Statics.field1191, this.field1186, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1219 != 128 || this.field1220 != 128 || this.field1221 != 128) {
            var5.method2243(this.field1219, this.field1220, this.field1221);
        }
        if (this.field1210 != null) {
            for (int var6 = 0; var6 < this.field1210.length; var6++) {
                var5.method2173(this.field1210[var6], this.field1202[var6]);
            }
        }
        if (this.field1224 != null) {
            for (int var7 = 0; var7 < this.field1224.length; var7++) {
                var5.method2174(this.field1224[var7], this.field1183[var7]);
            }
        }
        class109 var8 = var5.method2189(this.field1222 + 64, this.field1196 * 5 + 768, -50, -10, -50);
        var8.field1893 = true;
        field1223.method3655(var8, (long) this.field1185);
        return var8;
    }

    @ObfuscatedName("bt.m(II)Lbt;")
    public class56 method1160(int arg0) {
        if (this.field1215 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1216[var3] && this.field1216[var3] != 0) {
                    var2 = this.field1215[var3];
                }
            }
            if (var2 != -1) {
                return method15(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ac.q(IIIIIZI)Lcl;")
    public static final class82 method660(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class82 var8 = (class82) field1178.method3653(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class56 var9 = method15(arg0);
        if (arg1 > 1 && var9.field1215 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1216[var11] && var9.field1216[var11] != 0) {
                    var10 = var9.field1215[var11];
                }
            }
            if (var10 != -1) {
                var9 = method15(var10);
            }
        }
        class109 var12 = var9.method1153(1);
        if (var12 == null) {
            return null;
        }
        class82 var13 = null;
        if (var9.field1179 != -1) {
            var13 = method660(var9.field1217, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1227 != -1) {
            var13 = method660(var9.field1226, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1214 != -1) {
            var13 = method660(var9.field1228, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1494;
        int var15 = Statics.field1491;
        int var16 = Statics.field1495;
        int[] var17 = new int[4];
        class83.method1786(var17);
        class82 var18 = new class82(36, 32);
        class83.method1782(var18.field1488, 36, 32);
        class83.method1788();
        class95.method2070();
        class95.method2074(16, 16);
        class95.field1642 = false;
        if (var9.field1214 != -1) {
            var13.method1727(0, 0);
        }
        int var19 = var9.field1192;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class95.field1662[var9.field1189] * var19 >> 16;
        int var21 = class95.field1663[var9.field1189] * var19 >> 16;
        var12.method2270();
        var12.method2282(0, var9.field1194, var9.field1195, var9.field1189, var9.field1180, var9.field1197 + var12.field1539 / 2 + var20, var9.field1197 + var21);
        if (var9.field1227 != -1) {
            var13.method1727(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1705(1);
        }
        if (arg2 >= 2) {
            var18.method1705(16777215);
        }
        if (arg3 != 0) {
            var18.method1706(arg3);
        }
        class83.method1782(var18.field1488, 36, 32);
        if (var9.field1179 != -1) {
            var13.method1727(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1198 == 1) {
            Statics.field1073.method3918(method2261(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1178.method3655(var18, var6);
        }
        class83.method1782(var14, var15, var16);
        class83.method1800(var17);
        class95.method2070();
        class95.field1642 = true;
        return var18;
    }

    @ObfuscatedName("dl.p(IB)Ljava/lang/String;")
    public static final String method2261(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class161.field2534 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class161.field2503 + "</col>";
        }
    }

    @ObfuscatedName("bt.w(ZB)Z")
    public final boolean method1146(boolean arg0) {
        int var2 = this.field1203;
        int var3 = this.field1204;
        int var4 = this.field1209;
        if (arg0) {
            var2 = this.field1206;
            var3 = this.field1207;
            var4 = this.field1177;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1191.method3252(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1191.method3252(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1191.method3252(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("bt.o(ZB)Lcc;")
    public final class104 method1156(boolean arg0) {
        int var2 = this.field1203;
        int var3 = this.field1204;
        int var4 = this.field1209;
        if (arg0) {
            var2 = this.field1206;
            var3 = this.field1207;
            var4 = this.field1177;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var5 = class104.method2237(Statics.field1191, var2, 0);
        if (var3 != -1) {
            class104 var6 = class104.method2237(Statics.field1191, var3, 0);
            if (var4 == -1) {
                class104[] var9 = new class104[] { var5, var6 };
                var5 = new class104(var9, 2);
            } else {
                class104 var7 = class104.method2237(Statics.field1191, var4, 0);
                class104[] var8 = new class104[] { var5, var6, var7 };
                var5 = new class104(var8, 3);
            }
        }
        if (!arg0 && this.field1205 != 0) {
            var5.method2172(0, this.field1205, 0);
        }
        if (arg0 && this.field1208 != 0) {
            var5.method2172(0, this.field1208, 0);
        }
        if (this.field1210 != null) {
            for (int var10 = 0; var10 < this.field1210.length; var10++) {
                var5.method2173(this.field1210[var10], this.field1202[var10]);
            }
        }
        if (this.field1224 != null) {
            for (int var11 = 0; var11 < this.field1224.length; var11++) {
                var5.method2174(this.field1224[var11], this.field1183[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("bt.d(ZI)Z")
    public final boolean method1207(boolean arg0) {
        int var2 = this.field1211;
        int var3 = this.field1212;
        if (arg0) {
            var2 = this.field1193;
            var3 = this.field1218;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1191.method3252(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1191.method3252(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("bt.f(ZI)Lcc;")
    public final class104 method1158(boolean arg0) {
        int var2 = this.field1211;
        int var3 = this.field1212;
        if (arg0) {
            var2 = this.field1193;
            var3 = this.field1218;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var4 = class104.method2237(Statics.field1191, var2, 0);
        if (var3 != -1) {
            class104 var5 = class104.method2237(Statics.field1191, var3, 0);
            class104[] var6 = new class104[] { var4, var5 };
            var4 = new class104(var6, 2);
        }
        if (this.field1210 != null) {
            for (int var7 = 0; var7 < this.field1210.length; var7++) {
                var4.method2173(this.field1210[var7], this.field1202[var7]);
            }
        }
        if (this.field1224 != null) {
            for (int var8 = 0; var8 < this.field1224.length; var8++) {
                var4.method2174(this.field1224[var8], this.field1183[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("k.z(I)V")
    public static void method103() {
        field1178.method3658();
    }

    @ObfuscatedName("an.i(ZB)V")
    public static void method1043(boolean arg0) {
        if (Statics.field1199 != arg0) {
            field1187.method3658();
            field1223.method3658();
            field1178.method3658();
            Statics.field1199 = arg0;
        }
    }
}

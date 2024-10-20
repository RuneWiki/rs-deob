package deob;

@ObfuscatedName("bn")
public class class56 extends class208 {

    @ObfuscatedName("bn.i")
    public static class197 field1182 = new class197(64);

    @ObfuscatedName("bn.g")
    public static class197 field1183 = new class197(50);

    @ObfuscatedName("bn.m")
    public static class197 field1184 = new class197(200);

    @ObfuscatedName("bn.x")
    public int field1222;

    @ObfuscatedName("bn.u")
    public int field1186;

    @ObfuscatedName("bn.j")
    public String field1187 = "null";

    @ObfuscatedName("bn.q")
    public short[] field1188;

    @ObfuscatedName("bn.w")
    public short[] field1189;

    @ObfuscatedName("bn.b")
    public short[] field1219;

    @ObfuscatedName("bn.p")
    public short[] field1191;

    @ObfuscatedName("bn.o")
    public int field1233 = 2000;

    @ObfuscatedName("bn.y")
    public int field1216 = 0;

    @ObfuscatedName("bn.s")
    public int field1194 = 0;

    @ObfuscatedName("bn.e")
    public int field1195 = 0;

    @ObfuscatedName("bn.h")
    public int field1178 = 0;

    @ObfuscatedName("bn.l")
    public int field1217 = 0;

    @ObfuscatedName("bn.c")
    public int field1198 = 0;

    @ObfuscatedName("bn.f")
    public int field1199 = 1;

    @ObfuscatedName("bn.ac")
    public boolean field1200 = false;

    @ObfuscatedName("bn.as")
    public String[] field1201 = new String[] { null, null, class161.field2377, null, null };

    @ObfuscatedName("bn.af")
    public String[] field1202 = new String[] { null, null, null, null, class161.field2528 };

    @ObfuscatedName("bn.am")
    public int field1203 = -1;

    @ObfuscatedName("bn.ap")
    public int field1190 = -1;

    @ObfuscatedName("bn.aa")
    public int field1205 = 0;

    @ObfuscatedName("bn.ar")
    public int field1206 = -1;

    @ObfuscatedName("bn.av")
    public int field1207 = -1;

    @ObfuscatedName("bn.ao")
    public int field1196 = 0;

    @ObfuscatedName("bn.aq")
    public int field1209 = -1;

    @ObfuscatedName("bn.ax")
    public int field1210 = -1;

    @ObfuscatedName("bn.at")
    public int field1211 = -1;

    @ObfuscatedName("bn.aw")
    public int field1223 = -1;

    @ObfuscatedName("bn.ab")
    public int field1213 = -1;

    @ObfuscatedName("bn.al")
    public int field1214 = -1;

    @ObfuscatedName("bn.ad")
    public int[] field1215;

    @ObfuscatedName("bn.ah")
    public int[] field1230;

    @ObfuscatedName("bn.ak")
    public int field1229 = -1;

    @ObfuscatedName("bn.ai")
    public int field1220 = -1;

    @ObfuscatedName("bn.az")
    public int field1232 = 128;

    @ObfuscatedName("bn.au")
    public int field1225 = 128;

    @ObfuscatedName("bn.ay")
    public int field1221 = 128;

    @ObfuscatedName("bn.ag")
    public int field1204 = 0;

    @ObfuscatedName("bn.ae")
    public int field1208 = 0;

    @ObfuscatedName("bn.an")
    public int field1224 = 0;

    @ObfuscatedName("bn.aj")
    public boolean field1192 = false;

    @ObfuscatedName("bn.bg")
    public int field1226 = -1;

    @ObfuscatedName("bn.bf")
    public int field1227 = -1;

    @ObfuscatedName("bn.bl")
    public int field1228 = -1;

    @ObfuscatedName("bn.bn")
    public int field1185 = -1;

    @ObfuscatedName("d.a(Lfu;Lfu;ZLhy;I)V")
    public static void method5(class171 arg0, class171 arg1, boolean arg2, class228 arg3) {
        Statics.field1180 = arg0;
        Statics.field1174 = arg1;
        Statics.field1181 = arg2;
        Statics.field159 = Statics.field1180.method3127(10);
        Statics.field162 = arg3;
    }

    @ObfuscatedName("at.d(IB)Lbn;")
    public static class56 method754(int arg0) {
        class56 var1 = (class56) field1182.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1180.method3117(10, arg0);
        class56 var3 = new class56();
        var3.field1222 = arg0;
        if (var2 != null) {
            var3.method1098(new class123(var2));
        }
        var3.method1107();
        if (var3.field1220 != -1) {
            var3.method1100(method754(var3.field1220), method754(var3.field1229));
        }
        if (var3.field1227 != -1) {
            var3.method1101(method754(var3.field1227), method754(var3.field1226));
        }
        if (var3.field1185 != -1) {
            var3.method1126(method754(var3.field1185), method754(var3.field1228));
        }
        if (!Statics.field1181 && var3.field1200) {
            var3.field1187 = class161.field2521;
            var3.field1192 = false;
            var3.field1201 = null;
            var3.field1202 = null;
            var3.field1224 = 0;
        }
        field1182.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bn.v(I)V")
    public void method1107() {
    }

    @ObfuscatedName("bn.r(Ldb;I)V")
    public void method1098(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method1099(arg0, var2);
        }
    }

    @ObfuscatedName("bn.z(Ldb;II)V")
    public void method1099(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1186 = arg0.method2584();
        } else if (arg1 == 2) {
            this.field1187 = arg0.method2397();
        } else if (arg1 == 4) {
            this.field1233 = arg0.method2584();
        } else if (arg1 == 5) {
            this.field1216 = arg0.method2584();
        } else if (arg1 == 6) {
            this.field1194 = arg0.method2584();
        } else if (arg1 == 7) {
            this.field1178 = arg0.method2584();
            if (this.field1178 > 32767) {
                this.field1178 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1217 = arg0.method2584();
            if (this.field1217 > 32767) {
                this.field1217 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1198 = 1;
        } else if (arg1 == 12) {
            this.field1199 = arg0.method2400();
        } else if (arg1 == 16) {
            this.field1200 = true;
        } else if (arg1 == 23) {
            this.field1203 = arg0.method2584();
            this.field1205 = arg0.method2395();
        } else if (arg1 == 24) {
            this.field1190 = arg0.method2584();
        } else if (arg1 == 25) {
            this.field1206 = arg0.method2584();
            this.field1196 = arg0.method2395();
        } else if (arg1 == 26) {
            this.field1207 = arg0.method2584();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1201[arg1 - 30] = arg0.method2397();
            if (this.field1201[arg1 - 30].equalsIgnoreCase(class161.field2422)) {
                this.field1201[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1202[arg1 - 35] = arg0.method2397();
        } else if (arg1 == 40) {
            int var3 = arg0.method2395();
            this.field1188 = new short[var3];
            this.field1189 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1188[var4] = (short) arg0.method2584();
                this.field1189[var4] = (short) arg0.method2584();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2395();
            this.field1219 = new short[var5];
            this.field1191 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1219[var6] = (short) arg0.method2584();
                this.field1191[var6] = (short) arg0.method2584();
            }
        } else if (arg1 == 65) {
            this.field1192 = true;
        } else if (arg1 == 78) {
            this.field1209 = arg0.method2584();
        } else if (arg1 == 79) {
            this.field1210 = arg0.method2584();
        } else if (arg1 == 90) {
            this.field1211 = arg0.method2584();
        } else if (arg1 == 91) {
            this.field1213 = arg0.method2584();
        } else if (arg1 == 92) {
            this.field1223 = arg0.method2584();
        } else if (arg1 == 93) {
            this.field1214 = arg0.method2584();
        } else if (arg1 == 95) {
            this.field1195 = arg0.method2584();
        } else if (arg1 == 97) {
            this.field1229 = arg0.method2584();
        } else if (arg1 == 98) {
            this.field1220 = arg0.method2584();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1215 == null) {
                this.field1215 = new int[10];
                this.field1230 = new int[10];
            }
            this.field1215[arg1 - 100] = arg0.method2584();
            this.field1230[arg1 - 100] = arg0.method2584();
        } else if (arg1 == 110) {
            this.field1232 = arg0.method2584();
        } else if (arg1 == 111) {
            this.field1225 = arg0.method2584();
        } else if (arg1 == 112) {
            this.field1221 = arg0.method2584();
        } else if (arg1 == 113) {
            this.field1204 = arg0.method2396();
        } else if (arg1 == 114) {
            this.field1208 = arg0.method2396() * 5;
        } else if (arg1 == 115) {
            this.field1224 = arg0.method2395();
        } else if (arg1 == 139) {
            this.field1226 = arg0.method2584();
        } else if (arg1 == 140) {
            this.field1227 = arg0.method2584();
        } else if (arg1 == 148) {
            this.field1228 = arg0.method2584();
        } else if (arg1 == 149) {
            this.field1185 = arg0.method2584();
        }
    }

    @ObfuscatedName("bn.t(Lbn;Lbn;I)V")
    public void method1100(class56 arg0, class56 arg1) {
        this.field1186 = arg0.field1186;
        this.field1233 = arg0.field1233;
        this.field1216 = arg0.field1216;
        this.field1194 = arg0.field1194;
        this.field1195 = arg0.field1195;
        this.field1178 = arg0.field1178;
        this.field1217 = arg0.field1217;
        this.field1188 = arg0.field1188;
        this.field1189 = arg0.field1189;
        this.field1219 = arg0.field1219;
        this.field1191 = arg0.field1191;
        this.field1187 = arg1.field1187;
        this.field1200 = arg1.field1200;
        this.field1199 = arg1.field1199;
        this.field1198 = 1;
    }

    @ObfuscatedName("bn.n(Lbn;Lbn;B)V")
    public void method1101(class56 arg0, class56 arg1) {
        this.field1186 = arg0.field1186;
        this.field1233 = arg0.field1233;
        this.field1216 = arg0.field1216;
        this.field1194 = arg0.field1194;
        this.field1195 = arg0.field1195;
        this.field1178 = arg0.field1178;
        this.field1217 = arg0.field1217;
        this.field1188 = arg1.field1188;
        this.field1189 = arg1.field1189;
        this.field1219 = arg1.field1219;
        this.field1191 = arg1.field1191;
        this.field1187 = arg1.field1187;
        this.field1200 = arg1.field1200;
        this.field1198 = arg1.field1198;
        this.field1203 = arg1.field1203;
        this.field1190 = arg1.field1190;
        this.field1209 = arg1.field1209;
        this.field1206 = arg1.field1206;
        this.field1207 = arg1.field1207;
        this.field1210 = arg1.field1210;
        this.field1211 = arg1.field1211;
        this.field1223 = arg1.field1223;
        this.field1213 = arg1.field1213;
        this.field1214 = arg1.field1214;
        this.field1224 = arg1.field1224;
        this.field1201 = arg1.field1201;
        this.field1202 = new String[5];
        if (arg1.field1202 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1202[var3] = arg1.field1202[var3];
            }
        }
        this.field1202[4] = class161.field2485;
        this.field1199 = 0;
    }

    @ObfuscatedName("bn.i(Lbn;Lbn;I)V")
    public void method1126(class56 arg0, class56 arg1) {
        this.field1186 = arg0.field1186;
        this.field1233 = arg0.field1233;
        this.field1216 = arg0.field1216;
        this.field1194 = arg0.field1194;
        this.field1195 = arg0.field1195;
        this.field1178 = arg0.field1178;
        this.field1217 = arg0.field1217;
        this.field1188 = arg0.field1188;
        this.field1189 = arg0.field1189;
        this.field1219 = arg0.field1219;
        this.field1191 = arg0.field1191;
        this.field1198 = arg0.field1198;
        this.field1187 = arg1.field1187;
        this.field1199 = 0;
        this.field1200 = false;
        this.field1192 = false;
    }

    @ObfuscatedName("bn.g(II)Lcd;")
    public final class104 method1103(int arg0) {
        if (this.field1215 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1230[var3] && this.field1230[var3] != 0) {
                    var2 = this.field1215[var3];
                }
            }
            if (var2 != -1) {
                return method754(var2).method1103(1);
            }
        }
        class104 var4 = class104.method2159(Statics.field1174, this.field1186, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1232 != 128 || this.field1225 != 128 || this.field1221 != 128) {
            var4.method2145(this.field1232, this.field1225, this.field1221);
        }
        if (this.field1188 != null) {
            for (int var5 = 0; var5 < this.field1188.length; var5++) {
                var4.method2114(this.field1188[var5], this.field1189[var5]);
            }
        }
        if (this.field1219 != null) {
            for (int var6 = 0; var6 < this.field1219.length; var6++) {
                var4.method2115(this.field1219[var6], this.field1191[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bn.m(II)Ldp;")
    public final class109 method1104(int arg0) {
        if (this.field1215 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1230[var3] && this.field1230[var3] != 0) {
                    var2 = this.field1215[var3];
                }
            }
            if (var2 != -1) {
                return method754(var2).method1104(1);
            }
        }
        class109 var4 = (class109) field1183.method3544((long) this.field1222);
        if (var4 != null) {
            return var4;
        }
        class104 var5 = class104.method2159(Statics.field1174, this.field1186, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1232 != 128 || this.field1225 != 128 || this.field1221 != 128) {
            var5.method2145(this.field1232, this.field1225, this.field1221);
        }
        if (this.field1188 != null) {
            for (int var6 = 0; var6 < this.field1188.length; var6++) {
                var5.method2114(this.field1188[var6], this.field1189[var6]);
            }
        }
        if (this.field1219 != null) {
            for (int var7 = 0; var7 < this.field1219.length; var7++) {
                var5.method2115(this.field1219[var7], this.field1191[var7]);
            }
        }
        class109 var8 = var5.method2122(this.field1204 + 64, this.field1208 + 768, -50, -10, -50);
        var8.field1909 = true;
        field1183.method3546(var8, (long) this.field1222);
        return var8;
    }

    @ObfuscatedName("bn.k(II)Lbn;")
    public class56 method1105(int arg0) {
        if (this.field1215 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1230[var3] && this.field1230[var3] != 0) {
                    var2 = this.field1215[var3];
                }
            }
            if (var2 != -1) {
                return method754(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("em.x(IIIIIZI)Lcr;")
    public static final class82 method2745(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class82 var8 = (class82) field1184.method3544(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class56 var9 = method754(arg0);
        if (arg1 > 1 && var9.field1215 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1230[var11] && var9.field1230[var11] != 0) {
                    var10 = var9.field1215[var11];
                }
            }
            if (var10 != -1) {
                var9 = method754(var10);
            }
        }
        class109 var12 = var9.method1104(1);
        if (var12 == null) {
            return null;
        }
        class82 var13 = null;
        if (var9.field1220 != -1) {
            var13 = method2745(var9.field1229, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1227 != -1) {
            var13 = method2745(var9.field1226, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1185 != -1) {
            var13 = method2745(var9.field1228, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1493;
        int var15 = Statics.field1490;
        int var16 = Statics.field1495;
        int[] var17 = new int[4];
        class83.method1728(var17);
        class82 var18 = new class82(36, 32);
        class83.method1793(var18.field1477, 36, 32);
        class83.method1754();
        class95.method2005();
        class95.method2008(16, 16);
        class95.field1656 = false;
        if (var9.field1185 != -1) {
            var13.method1649(0, 0);
        }
        int var19 = var9.field1233;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class95.field1671[var9.field1216] * var19 >> 16;
        int var21 = class95.field1677[var9.field1216] * var19 >> 16;
        var12.method2220();
        var12.method2194(0, var9.field1194, var9.field1195, var9.field1216, var9.field1178, var9.field1217 + var12.field1549 / 2 + var20, var9.field1217 + var21);
        if (var9.field1227 != -1) {
            var13.method1649(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1645(1);
        }
        if (arg2 >= 2) {
            var18.method1645(16777215);
        }
        if (arg3 != 0) {
            var18.method1646(arg3);
        }
        class83.method1793(var18.field1477, 36, 32);
        if (var9.field1220 != -1) {
            var13.method1649(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1198 == 1) {
            class228 var22 = Statics.field162;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class161.field2538 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class161.field2536 + "</col>";
            }
            var22.method3920(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1184.method3546(var18, var6);
        }
        class83.method1793(var14, var15, var16);
        class83.method1729(var17);
        class95.method2005();
        class95.field1656 = true;
        return var18;
    }

    @ObfuscatedName("bn.u(ZB)Z")
    public final boolean method1106(boolean arg0) {
        int var2 = this.field1203;
        int var3 = this.field1190;
        int var4 = this.field1209;
        if (arg0) {
            var2 = this.field1206;
            var3 = this.field1207;
            var4 = this.field1210;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1174.method3159(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1174.method3159(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1174.method3159(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("bn.j(ZB)Lcd;")
    public final class104 method1134(boolean arg0) {
        int var2 = this.field1203;
        int var3 = this.field1190;
        int var4 = this.field1209;
        if (arg0) {
            var2 = this.field1206;
            var3 = this.field1207;
            var4 = this.field1210;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var5 = class104.method2159(Statics.field1174, var2, 0);
        if (var3 != -1) {
            class104 var6 = class104.method2159(Statics.field1174, var3, 0);
            if (var4 == -1) {
                class104[] var9 = new class104[] { var5, var6 };
                var5 = new class104(var9, 2);
            } else {
                class104 var7 = class104.method2159(Statics.field1174, var4, 0);
                class104[] var8 = new class104[] { var5, var6, var7 };
                var5 = new class104(var8, 3);
            }
        }
        if (!arg0 && this.field1205 != 0) {
            var5.method2105(0, this.field1205, 0);
        }
        if (arg0 && this.field1196 != 0) {
            var5.method2105(0, this.field1196, 0);
        }
        if (this.field1188 != null) {
            for (int var10 = 0; var10 < this.field1188.length; var10++) {
                var5.method2114(this.field1188[var10], this.field1189[var10]);
            }
        }
        if (this.field1219 != null) {
            for (int var11 = 0; var11 < this.field1219.length; var11++) {
                var5.method2115(this.field1219[var11], this.field1191[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("bn.q(ZB)Z")
    public final boolean method1153(boolean arg0) {
        int var2 = this.field1211;
        int var3 = this.field1223;
        if (arg0) {
            var2 = this.field1213;
            var3 = this.field1214;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1174.method3159(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1174.method3159(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("bn.w(ZB)Lcd;")
    public final class104 method1109(boolean arg0) {
        int var2 = this.field1211;
        int var3 = this.field1223;
        if (arg0) {
            var2 = this.field1213;
            var3 = this.field1214;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var4 = class104.method2159(Statics.field1174, var2, 0);
        if (var3 != -1) {
            class104 var5 = class104.method2159(Statics.field1174, var3, 0);
            class104[] var6 = new class104[] { var4, var5 };
            var4 = new class104(var6, 2);
        }
        if (this.field1188 != null) {
            for (int var7 = 0; var7 < this.field1188.length; var7++) {
                var4.method2114(this.field1188[var7], this.field1189[var7]);
            }
        }
        if (this.field1219 != null) {
            for (int var8 = 0; var8 < this.field1219.length; var8++) {
                var4.method2115(this.field1219[var8], this.field1191[var8]);
            }
        }
        return var4;
    }
}

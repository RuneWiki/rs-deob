package deob;

@ObfuscatedName("by")
public class class56 extends class208 {

    @ObfuscatedName("by.l")
    public static class197 field1168 = new class197(64);

    @ObfuscatedName("by.m")
    public static class197 field1164 = new class197(50);

    @ObfuscatedName("by.j")
    public static class197 field1170 = new class197(200);

    @ObfuscatedName("by.s")
    public int field1171;

    @ObfuscatedName("by.p")
    public int field1172;

    @ObfuscatedName("by.v")
    public String field1216 = "null";

    @ObfuscatedName("by.r")
    public short[] field1174;

    @ObfuscatedName("by.c")
    public short[] field1207;

    @ObfuscatedName("by.w")
    public short[] field1166;

    @ObfuscatedName("by.x")
    public short[] field1203;

    @ObfuscatedName("by.k")
    public int field1178 = 2000;

    @ObfuscatedName("by.z")
    public int field1179 = 0;

    @ObfuscatedName("by.q")
    public int field1180 = 0;

    @ObfuscatedName("by.o")
    public int field1181 = 0;

    @ObfuscatedName("by.f")
    public int field1182 = 0;

    @ObfuscatedName("by.b")
    public int field1183 = 0;

    @ObfuscatedName("by.t")
    public int field1184 = 0;

    @ObfuscatedName("by.a")
    public int field1187 = 1;

    @ObfuscatedName("by.am")
    public boolean field1191 = false;

    @ObfuscatedName("by.as")
    public String[] field1188 = new String[] { null, null, class161.field2356, null, null };

    @ObfuscatedName("by.ad")
    public String[] field1209 = new String[] { null, null, null, null, class161.field2625 };

    @ObfuscatedName("by.af")
    public int field1189 = -1;

    @ObfuscatedName("by.ak")
    public int field1190 = -1;

    @ObfuscatedName("by.aq")
    public int field1197 = 0;

    @ObfuscatedName("by.an")
    public int field1192 = -1;

    @ObfuscatedName("by.ag")
    public int field1193 = -1;

    @ObfuscatedName("by.al")
    public int field1194 = 0;

    @ObfuscatedName("by.au")
    public int field1185 = -1;

    @ObfuscatedName("by.ar")
    public int field1196 = -1;

    @ObfuscatedName("by.aw")
    public int field1173 = -1;

    @ObfuscatedName("by.ah")
    public int field1198 = -1;

    @ObfuscatedName("by.ao")
    public int field1199 = -1;

    @ObfuscatedName("by.ax")
    public int field1169 = -1;

    @ObfuscatedName("by.ac")
    public int[] field1201;

    @ObfuscatedName("by.ai")
    public int[] field1202;

    @ObfuscatedName("by.ap")
    public int field1208 = -1;

    @ObfuscatedName("by.aa")
    public int field1204 = -1;

    @ObfuscatedName("by.ay")
    public int field1205 = 128;

    @ObfuscatedName("by.ab")
    public int field1206 = 128;

    @ObfuscatedName("by.aj")
    public int field1177 = 128;

    @ObfuscatedName("by.az")
    public int field1217 = 0;

    @ObfuscatedName("by.av")
    public int field1175 = 0;

    @ObfuscatedName("by.ae")
    public int field1210 = 0;

    @ObfuscatedName("by.at")
    public boolean field1211 = false;

    @ObfuscatedName("by.bc")
    public int field1212 = -1;

    @ObfuscatedName("by.bv")
    public int field1186 = -1;

    @ObfuscatedName("by.bi")
    public int field1214 = -1;

    @ObfuscatedName("by.by")
    public int field1213 = -1;

    @ObfuscatedName("cn.i(II)Lby;")
    public static class56 method2018(int arg0) {
        class56 var1 = (class56) field1168.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2097.method3086(10, arg0);
        class56 var3 = new class56();
        var3.field1171 = arg0;
        if (var2 != null) {
            var3.method1081(new class123(var2));
        }
        var3.method1100();
        if (var3.field1204 != -1) {
            var3.method1130(method2018(var3.field1204), method2018(var3.field1208));
        }
        if (var3.field1186 != -1) {
            var3.method1084(method2018(var3.field1186), method2018(var3.field1212));
        }
        if (var3.field1213 != -1) {
            var3.method1085(method2018(var3.field1213), method2018(var3.field1214));
        }
        if (!Statics.field3265 && var3.field1191) {
            var3.field1216 = class161.field2622;
            var3.field1211 = false;
            var3.field1188 = null;
            var3.field1209 = null;
            var3.field1210 = 0;
        }
        field1168.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("by.h(I)V")
    public void method1100() {
    }

    @ObfuscatedName("by.e(Ldn;I)V")
    public void method1081(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method1082(arg0, var2);
        }
    }

    @ObfuscatedName("by.g(Ldn;IB)V")
    public void method1082(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1172 = arg0.method2406();
        } else if (arg1 == 2) {
            this.field1216 = arg0.method2412();
        } else if (arg1 == 4) {
            this.field1178 = arg0.method2406();
        } else if (arg1 == 5) {
            this.field1179 = arg0.method2406();
        } else if (arg1 == 6) {
            this.field1180 = arg0.method2406();
        } else if (arg1 == 7) {
            this.field1182 = arg0.method2406();
            if (this.field1182 > 32767) {
                this.field1182 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1183 = arg0.method2406();
            if (this.field1183 > 32767) {
                this.field1183 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1184 = 1;
        } else if (arg1 == 12) {
            this.field1187 = arg0.method2409();
        } else if (arg1 == 16) {
            this.field1191 = true;
        } else if (arg1 == 23) {
            this.field1189 = arg0.method2406();
            this.field1197 = arg0.method2404();
        } else if (arg1 == 24) {
            this.field1190 = arg0.method2406();
        } else if (arg1 == 25) {
            this.field1192 = arg0.method2406();
            this.field1194 = arg0.method2404();
        } else if (arg1 == 26) {
            this.field1193 = arg0.method2406();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1188[arg1 - 30] = arg0.method2412();
            if (this.field1188[arg1 - 30].equalsIgnoreCase(class161.field2437)) {
                this.field1188[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1209[arg1 - 35] = arg0.method2412();
        } else if (arg1 == 40) {
            int var3 = arg0.method2404();
            this.field1174 = new short[var3];
            this.field1207 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1174[var4] = (short) arg0.method2406();
                this.field1207[var4] = (short) arg0.method2406();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2404();
            this.field1166 = new short[var5];
            this.field1203 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1166[var6] = (short) arg0.method2406();
                this.field1203[var6] = (short) arg0.method2406();
            }
        } else if (arg1 == 65) {
            this.field1211 = true;
        } else if (arg1 == 78) {
            this.field1185 = arg0.method2406();
        } else if (arg1 == 79) {
            this.field1196 = arg0.method2406();
        } else if (arg1 == 90) {
            this.field1173 = arg0.method2406();
        } else if (arg1 == 91) {
            this.field1199 = arg0.method2406();
        } else if (arg1 == 92) {
            this.field1198 = arg0.method2406();
        } else if (arg1 == 93) {
            this.field1169 = arg0.method2406();
        } else if (arg1 == 95) {
            this.field1181 = arg0.method2406();
        } else if (arg1 == 97) {
            this.field1208 = arg0.method2406();
        } else if (arg1 == 98) {
            this.field1204 = arg0.method2406();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1201 == null) {
                this.field1201 = new int[10];
                this.field1202 = new int[10];
            }
            this.field1201[arg1 - 100] = arg0.method2406();
            this.field1202[arg1 - 100] = arg0.method2406();
        } else if (arg1 == 110) {
            this.field1205 = arg0.method2406();
        } else if (arg1 == 111) {
            this.field1206 = arg0.method2406();
        } else if (arg1 == 112) {
            this.field1177 = arg0.method2406();
        } else if (arg1 == 113) {
            this.field1217 = arg0.method2405();
        } else if (arg1 == 114) {
            this.field1175 = arg0.method2405() * 5;
        } else if (arg1 == 115) {
            this.field1210 = arg0.method2404();
        } else if (arg1 == 139) {
            this.field1212 = arg0.method2406();
        } else if (arg1 == 140) {
            this.field1186 = arg0.method2406();
        } else if (arg1 == 148) {
            this.field1214 = arg0.method2406();
        } else if (arg1 == 149) {
            this.field1213 = arg0.method2406();
        }
    }

    @ObfuscatedName("by.n(Lby;Lby;B)V")
    public void method1130(class56 arg0, class56 arg1) {
        this.field1172 = arg0.field1172;
        this.field1178 = arg0.field1178;
        this.field1179 = arg0.field1179;
        this.field1180 = arg0.field1180;
        this.field1181 = arg0.field1181;
        this.field1182 = arg0.field1182;
        this.field1183 = arg0.field1183;
        this.field1174 = arg0.field1174;
        this.field1207 = arg0.field1207;
        this.field1166 = arg0.field1166;
        this.field1203 = arg0.field1203;
        this.field1216 = arg1.field1216;
        this.field1191 = arg1.field1191;
        this.field1187 = arg1.field1187;
        this.field1184 = 1;
    }

    @ObfuscatedName("by.u(Lby;Lby;B)V")
    public void method1084(class56 arg0, class56 arg1) {
        this.field1172 = arg0.field1172;
        this.field1178 = arg0.field1178;
        this.field1179 = arg0.field1179;
        this.field1180 = arg0.field1180;
        this.field1181 = arg0.field1181;
        this.field1182 = arg0.field1182;
        this.field1183 = arg0.field1183;
        this.field1174 = arg1.field1174;
        this.field1207 = arg1.field1207;
        this.field1166 = arg1.field1166;
        this.field1203 = arg1.field1203;
        this.field1216 = arg1.field1216;
        this.field1191 = arg1.field1191;
        this.field1184 = arg1.field1184;
        this.field1189 = arg1.field1189;
        this.field1190 = arg1.field1190;
        this.field1185 = arg1.field1185;
        this.field1192 = arg1.field1192;
        this.field1193 = arg1.field1193;
        this.field1196 = arg1.field1196;
        this.field1173 = arg1.field1173;
        this.field1198 = arg1.field1198;
        this.field1199 = arg1.field1199;
        this.field1169 = arg1.field1169;
        this.field1210 = arg1.field1210;
        this.field1188 = arg1.field1188;
        this.field1209 = new String[5];
        if (arg1.field1209 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1209[var3] = arg1.field1209[var3];
            }
        }
        this.field1209[4] = class161.field2418;
        this.field1187 = 0;
    }

    @ObfuscatedName("by.d(Lby;Lby;I)V")
    public void method1085(class56 arg0, class56 arg1) {
        this.field1172 = arg0.field1172;
        this.field1178 = arg0.field1178;
        this.field1179 = arg0.field1179;
        this.field1180 = arg0.field1180;
        this.field1181 = arg0.field1181;
        this.field1182 = arg0.field1182;
        this.field1183 = arg0.field1183;
        this.field1174 = arg0.field1174;
        this.field1207 = arg0.field1207;
        this.field1166 = arg0.field1166;
        this.field1203 = arg0.field1203;
        this.field1184 = arg0.field1184;
        this.field1216 = arg1.field1216;
        this.field1187 = 0;
        this.field1191 = false;
        this.field1211 = false;
    }

    @ObfuscatedName("by.l(II)Lco;")
    public final class104 method1086(int arg0) {
        if (this.field1201 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1202[var3] && this.field1202[var3] != 0) {
                    var2 = this.field1201[var3];
                }
            }
            if (var2 != -1) {
                return method2018(var2).method1086(1);
            }
        }
        class104 var4 = class104.method2115(Statics.field1167, this.field1172, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1205 != 128 || this.field1206 != 128 || this.field1177 != 128) {
            var4.method2130(this.field1205, this.field1206, this.field1177);
        }
        if (this.field1174 != null) {
            for (int var5 = 0; var5 < this.field1174.length; var5++) {
                var4.method2185(this.field1174[var5], this.field1207[var5]);
            }
        }
        if (this.field1166 != null) {
            for (int var6 = 0; var6 < this.field1166.length; var6++) {
                var4.method2128(this.field1166[var6], this.field1203[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("by.m(IB)Ldo;")
    public final class109 method1119(int arg0) {
        if (this.field1201 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1202[var3] && this.field1202[var3] != 0) {
                    var2 = this.field1201[var3];
                }
            }
            if (var2 != -1) {
                return method2018(var2).method1119(1);
            }
        }
        class109 var4 = (class109) field1164.method3541((long) this.field1171);
        if (var4 != null) {
            return var4;
        }
        class104 var5 = class104.method2115(Statics.field1167, this.field1172, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1205 != 128 || this.field1206 != 128 || this.field1177 != 128) {
            var5.method2130(this.field1205, this.field1206, this.field1177);
        }
        if (this.field1174 != null) {
            for (int var6 = 0; var6 < this.field1174.length; var6++) {
                var5.method2185(this.field1174[var6], this.field1207[var6]);
            }
        }
        if (this.field1166 != null) {
            for (int var7 = 0; var7 < this.field1166.length; var7++) {
                var5.method2128(this.field1166[var7], this.field1203[var7]);
            }
        }
        class109 var8 = var5.method2135(this.field1217 + 64, this.field1175 + 768, -50, -10, -50);
        var8.field1882 = true;
        field1164.method3532(var8, (long) this.field1171);
        return var8;
    }

    @ObfuscatedName("by.j(II)Lby;")
    public class56 method1088(int arg0) {
        if (this.field1201 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1202[var3] && this.field1202[var3] != 0) {
                    var2 = this.field1201[var3];
                }
            }
            if (var2 != -1) {
                return method2018(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ga.y(IIIIIZB)Lcm;")
    public static final class82 method3348(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class82 var8 = (class82) field1170.method3541(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class56 var9 = method2018(arg0);
        if (arg1 > 1 && var9.field1201 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1202[var11] && var9.field1202[var11] != 0) {
                    var10 = var9.field1201[var11];
                }
            }
            if (var10 != -1) {
                var9 = method2018(var10);
            }
        }
        class109 var12 = var9.method1119(1);
        if (var12 == null) {
            return null;
        }
        class82 var13 = null;
        if (var9.field1204 != -1) {
            var13 = method3348(var9.field1208, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1186 != -1) {
            var13 = method3348(var9.field1212, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1213 != -1) {
            var13 = method3348(var9.field1214, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1469;
        int var15 = Statics.field1471;
        int var16 = Statics.field1468;
        int[] var17 = new int[4];
        class83.method1735(var17);
        class82 var18 = new class82(36, 32);
        class83.method1748(var18.field1465, 36, 32);
        class83.method1737();
        class95.method2035();
        class95.method2028(16, 16);
        class95.field1622 = false;
        if (var9.field1213 != -1) {
            var13.method1712(0, 0);
        }
        int var19 = var9.field1178;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class95.field1624[var9.field1179] * var19 >> 16;
        int var21 = class95.field1643[var9.field1179] * var19 >> 16;
        var12.method2204();
        var12.method2216(0, var9.field1180, var9.field1181, var9.field1179, var9.field1182, var9.field1183 + var12.field1511 / 2 + var20, var9.field1183 + var21);
        if (var9.field1186 != -1) {
            var13.method1712(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1648(1);
        }
        if (arg2 >= 2) {
            var18.method1648(16777215);
        }
        if (arg3 != 0) {
            var18.method1652(arg3);
        }
        class83.method1748(var18.field1465, 36, 32);
        if (var9.field1204 != -1) {
            var13.method1712(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1184 == 1) {
            class228 var22 = Statics.field1508;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class161.field2596 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class161.field2515 + "</col>";
            }
            var22.method3876(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1170.method3532(var18, var6);
        }
        class83.method1748(var14, var15, var16);
        class83.method1736(var17);
        class95.method2035();
        class95.field1622 = true;
        return var18;
    }

    @ObfuscatedName("by.s(ZI)Z")
    public final boolean method1089(boolean arg0) {
        int var2 = this.field1189;
        int var3 = this.field1190;
        int var4 = this.field1185;
        if (arg0) {
            var2 = this.field1192;
            var3 = this.field1193;
            var4 = this.field1196;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1167.method3085(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1167.method3085(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1167.method3085(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("by.p(ZB)Lco;")
    public final class104 method1090(boolean arg0) {
        int var2 = this.field1189;
        int var3 = this.field1190;
        int var4 = this.field1185;
        if (arg0) {
            var2 = this.field1192;
            var3 = this.field1193;
            var4 = this.field1196;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var5 = class104.method2115(Statics.field1167, var2, 0);
        if (var3 != -1) {
            class104 var6 = class104.method2115(Statics.field1167, var3, 0);
            if (var4 == -1) {
                class104[] var9 = new class104[] { var5, var6 };
                var5 = new class104(var9, 2);
            } else {
                class104 var7 = class104.method2115(Statics.field1167, var4, 0);
                class104[] var8 = new class104[] { var5, var6, var7 };
                var5 = new class104(var8, 3);
            }
        }
        if (!arg0 && this.field1197 != 0) {
            var5.method2120(0, this.field1197, 0);
        }
        if (arg0 && this.field1194 != 0) {
            var5.method2120(0, this.field1194, 0);
        }
        if (this.field1174 != null) {
            for (int var10 = 0; var10 < this.field1174.length; var10++) {
                var5.method2185(this.field1174[var10], this.field1207[var10]);
            }
        }
        if (this.field1166 != null) {
            for (int var11 = 0; var11 < this.field1166.length; var11++) {
                var5.method2128(this.field1166[var11], this.field1203[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("by.v(ZI)Z")
    public final boolean method1111(boolean arg0) {
        int var2 = this.field1173;
        int var3 = this.field1198;
        if (arg0) {
            var2 = this.field1199;
            var3 = this.field1169;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1167.method3085(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1167.method3085(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("by.r(ZS)Lco;")
    public final class104 method1101(boolean arg0) {
        int var2 = this.field1173;
        int var3 = this.field1198;
        if (arg0) {
            var2 = this.field1199;
            var3 = this.field1169;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var4 = class104.method2115(Statics.field1167, var2, 0);
        if (var3 != -1) {
            class104 var5 = class104.method2115(Statics.field1167, var3, 0);
            class104[] var6 = new class104[] { var4, var5 };
            var4 = new class104(var6, 2);
        }
        if (this.field1174 != null) {
            for (int var7 = 0; var7 < this.field1174.length; var7++) {
                var4.method2185(this.field1174[var7], this.field1207[var7]);
            }
        }
        if (this.field1166 != null) {
            for (int var8 = 0; var8 < this.field1166.length; var8++) {
                var4.method2128(this.field1166[var8], this.field1203[var8]);
            }
        }
        return var4;
    }
}

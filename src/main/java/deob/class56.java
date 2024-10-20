package deob;

@ObfuscatedName("bg")
public class class56 extends class208 {

    @ObfuscatedName("bg.y")
    public static class197 field1173 = new class197(64);

    @ObfuscatedName("bg.u")
    public static class197 field1174 = new class197(50);

    @ObfuscatedName("bg.h")
    public static class197 field1175 = new class197(200);

    @ObfuscatedName("bg.b")
    public int field1176;

    @ObfuscatedName("bg.g")
    public int field1177;

    @ObfuscatedName("bg.e")
    public String field1206 = "null";

    @ObfuscatedName("bg.p")
    public short[] field1179;

    @ObfuscatedName("bg.s")
    public short[] field1180;

    @ObfuscatedName("bg.w")
    public short[] field1181;

    @ObfuscatedName("bg.i")
    public short[] field1189;

    @ObfuscatedName("bg.r")
    public int field1183 = 2000;

    @ObfuscatedName("bg.a")
    public int field1184 = 0;

    @ObfuscatedName("bg.n")
    public int field1185 = 0;

    @ObfuscatedName("bg.z")
    public int field1202 = 0;

    @ObfuscatedName("bg.x")
    public int field1187 = 0;

    @ObfuscatedName("bg.d")
    public int field1188 = 0;

    @ObfuscatedName("bg.t")
    public int field1200 = 0;

    @ObfuscatedName("bg.o")
    public int field1190 = 1;

    @ObfuscatedName("bg.aq")
    public boolean field1191 = false;

    @ObfuscatedName("bg.al")
    public String[] field1192 = new String[] { null, null, class161.field2357, null, null };

    @ObfuscatedName("bg.av")
    public String[] field1193 = new String[] { null, null, null, null, class161.field2610 };

    @ObfuscatedName("bg.ad")
    public int field1194 = -1;

    @ObfuscatedName("bg.at")
    public int field1195 = -1;

    @ObfuscatedName("bg.aj")
    public int field1196 = 0;

    @ObfuscatedName("bg.am")
    public int field1221 = -1;

    @ObfuscatedName("bg.ay")
    public int field1198 = -1;

    @ObfuscatedName("bg.ag")
    public int field1220 = 0;

    @ObfuscatedName("bg.aa")
    public int field1186 = -1;

    @ObfuscatedName("bg.ak")
    public int field1201 = -1;

    @ObfuscatedName("bg.ar")
    public int field1210 = -1;

    @ObfuscatedName("bg.ax")
    public int field1203 = -1;

    @ObfuscatedName("bg.ap")
    public int field1182 = -1;

    @ObfuscatedName("bg.ao")
    public int field1205 = -1;

    @ObfuscatedName("bg.aw")
    public int[] field1216;

    @ObfuscatedName("bg.ai")
    public int[] field1207;

    @ObfuscatedName("bg.af")
    public int field1208 = -1;

    @ObfuscatedName("bg.an")
    public int field1178 = -1;

    @ObfuscatedName("bg.au")
    public int field1209 = 128;

    @ObfuscatedName("bg.ac")
    public int field1211 = 128;

    @ObfuscatedName("bg.ae")
    public int field1212 = 128;

    @ObfuscatedName("bg.az")
    public int field1213 = 0;

    @ObfuscatedName("bg.ah")
    public int field1218 = 0;

    @ObfuscatedName("bg.as")
    public int field1215 = 0;

    @ObfuscatedName("bg.ab")
    public boolean field1171 = false;

    @ObfuscatedName("bg.bn")
    public int field1204 = -1;

    @ObfuscatedName("bg.bl")
    public int field1219 = -1;

    @ObfuscatedName("bg.bq")
    public int field1217 = -1;

    @ObfuscatedName("bg.bg")
    public int field1197 = -1;

    @ObfuscatedName("eq.k(Lfo;Lfo;ZLhd;I)V")
    public static void method2979(class171 arg0, class171 arg1, boolean arg2, class228 arg3) {
        Statics.field1170 = arg0;
        Statics.field2028 = arg1;
        Statics.field1214 = arg2;
        Statics.field1168 = Statics.field1170.method3082(10);
        Statics.field171 = arg3;
    }

    @ObfuscatedName("x.q(IS)Lbg;")
    public static class56 method576(int arg0) {
        class56 var1 = (class56) field1173.method3535((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1170.method3097(10, arg0);
        class56 var3 = new class56();
        var3.field1176 = arg0;
        if (var2 != null) {
            var3.method1080(new class123(var2));
        }
        var3.method1079();
        if (var3.field1178 != -1) {
            var3.method1125(method576(var3.field1178), method576(var3.field1208));
        }
        if (var3.field1219 != -1) {
            var3.method1083(method576(var3.field1219), method576(var3.field1204));
        }
        if (var3.field1197 != -1) {
            var3.method1084(method576(var3.field1197), method576(var3.field1217));
        }
        if (!Statics.field1214 && var3.field1191) {
            var3.field1206 = class161.field2618;
            var3.field1171 = false;
            var3.field1192 = null;
            var3.field1193 = null;
            var3.field1215 = 0;
        }
        field1173.method3537(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bg.f(B)V")
    public void method1079() {
    }

    @ObfuscatedName("bg.c(Lde;I)V")
    public void method1080(class123 arg0) {
        while (true) {
            int var2 = arg0.method2427();
            if (var2 == 0) {
                return;
            }
            this.method1081(arg0, var2);
        }
    }

    @ObfuscatedName("bg.v(Lde;II)V")
    public void method1081(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1177 = arg0.method2547();
        } else if (arg1 == 2) {
            this.field1206 = arg0.method2435();
        } else if (arg1 == 4) {
            this.field1183 = arg0.method2547();
        } else if (arg1 == 5) {
            this.field1184 = arg0.method2547();
        } else if (arg1 == 6) {
            this.field1185 = arg0.method2547();
        } else if (arg1 == 7) {
            this.field1187 = arg0.method2547();
            if (this.field1187 > 32767) {
                this.field1187 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1188 = arg0.method2547();
            if (this.field1188 > 32767) {
                this.field1188 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1200 = 1;
        } else if (arg1 == 12) {
            this.field1190 = arg0.method2432();
        } else if (arg1 == 16) {
            this.field1191 = true;
        } else if (arg1 == 23) {
            this.field1194 = arg0.method2547();
            this.field1196 = arg0.method2427();
        } else if (arg1 == 24) {
            this.field1195 = arg0.method2547();
        } else if (arg1 == 25) {
            this.field1221 = arg0.method2547();
            this.field1220 = arg0.method2427();
        } else if (arg1 == 26) {
            this.field1198 = arg0.method2547();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1192[arg1 - 30] = arg0.method2435();
            if (this.field1192[arg1 - 30].equalsIgnoreCase(class161.field2547)) {
                this.field1192[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1193[arg1 - 35] = arg0.method2435();
        } else if (arg1 == 40) {
            int var3 = arg0.method2427();
            this.field1179 = new short[var3];
            this.field1180 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1179[var4] = (short) arg0.method2547();
                this.field1180[var4] = (short) arg0.method2547();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2427();
            this.field1181 = new short[var5];
            this.field1189 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1181[var6] = (short) arg0.method2547();
                this.field1189[var6] = (short) arg0.method2547();
            }
        } else if (arg1 == 65) {
            this.field1171 = true;
        } else if (arg1 == 78) {
            this.field1186 = arg0.method2547();
        } else if (arg1 == 79) {
            this.field1201 = arg0.method2547();
        } else if (arg1 == 90) {
            this.field1210 = arg0.method2547();
        } else if (arg1 == 91) {
            this.field1182 = arg0.method2547();
        } else if (arg1 == 92) {
            this.field1203 = arg0.method2547();
        } else if (arg1 == 93) {
            this.field1205 = arg0.method2547();
        } else if (arg1 == 95) {
            this.field1202 = arg0.method2547();
        } else if (arg1 == 97) {
            this.field1208 = arg0.method2547();
        } else if (arg1 == 98) {
            this.field1178 = arg0.method2547();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1216 == null) {
                this.field1216 = new int[10];
                this.field1207 = new int[10];
            }
            this.field1216[arg1 - 100] = arg0.method2547();
            this.field1207[arg1 - 100] = arg0.method2547();
        } else if (arg1 == 110) {
            this.field1209 = arg0.method2547();
        } else if (arg1 == 111) {
            this.field1211 = arg0.method2547();
        } else if (arg1 == 112) {
            this.field1212 = arg0.method2547();
        } else if (arg1 == 113) {
            this.field1213 = arg0.method2428();
        } else if (arg1 == 114) {
            this.field1218 = arg0.method2428();
        } else if (arg1 == 115) {
            this.field1215 = arg0.method2427();
        } else if (arg1 == 139) {
            this.field1204 = arg0.method2547();
        } else if (arg1 == 140) {
            this.field1219 = arg0.method2547();
        } else if (arg1 == 148) {
            this.field1217 = arg0.method2547();
        } else if (arg1 == 149) {
            this.field1197 = arg0.method2547();
        }
    }

    @ObfuscatedName("bg.j(Lbg;Lbg;I)V")
    public void method1125(class56 arg0, class56 arg1) {
        this.field1177 = arg0.field1177;
        this.field1183 = arg0.field1183;
        this.field1184 = arg0.field1184;
        this.field1185 = arg0.field1185;
        this.field1202 = arg0.field1202;
        this.field1187 = arg0.field1187;
        this.field1188 = arg0.field1188;
        this.field1179 = arg0.field1179;
        this.field1180 = arg0.field1180;
        this.field1181 = arg0.field1181;
        this.field1189 = arg0.field1189;
        this.field1206 = arg1.field1206;
        this.field1191 = arg1.field1191;
        this.field1190 = arg1.field1190;
        this.field1200 = 1;
    }

    @ObfuscatedName("bg.m(Lbg;Lbg;B)V")
    public void method1083(class56 arg0, class56 arg1) {
        this.field1177 = arg0.field1177;
        this.field1183 = arg0.field1183;
        this.field1184 = arg0.field1184;
        this.field1185 = arg0.field1185;
        this.field1202 = arg0.field1202;
        this.field1187 = arg0.field1187;
        this.field1188 = arg0.field1188;
        this.field1179 = arg1.field1179;
        this.field1180 = arg1.field1180;
        this.field1181 = arg1.field1181;
        this.field1189 = arg1.field1189;
        this.field1206 = arg1.field1206;
        this.field1191 = arg1.field1191;
        this.field1200 = arg1.field1200;
        this.field1194 = arg1.field1194;
        this.field1195 = arg1.field1195;
        this.field1186 = arg1.field1186;
        this.field1221 = arg1.field1221;
        this.field1198 = arg1.field1198;
        this.field1201 = arg1.field1201;
        this.field1210 = arg1.field1210;
        this.field1203 = arg1.field1203;
        this.field1182 = arg1.field1182;
        this.field1205 = arg1.field1205;
        this.field1215 = arg1.field1215;
        this.field1192 = arg1.field1192;
        this.field1193 = new String[5];
        if (arg1.field1193 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1193[var3] = arg1.field1193[var3];
            }
        }
        this.field1193[4] = class161.field2489;
        this.field1190 = 0;
    }

    @ObfuscatedName("bg.y(Lbg;Lbg;I)V")
    public void method1084(class56 arg0, class56 arg1) {
        this.field1177 = arg0.field1177;
        this.field1183 = arg0.field1183;
        this.field1184 = arg0.field1184;
        this.field1185 = arg0.field1185;
        this.field1202 = arg0.field1202;
        this.field1187 = arg0.field1187;
        this.field1188 = arg0.field1188;
        this.field1179 = arg0.field1179;
        this.field1180 = arg0.field1180;
        this.field1181 = arg0.field1181;
        this.field1189 = arg0.field1189;
        this.field1200 = arg0.field1200;
        this.field1206 = arg1.field1206;
        this.field1190 = 0;
        this.field1191 = false;
        this.field1171 = false;
    }

    @ObfuscatedName("bg.u(IB)Lcr;")
    public final class104 method1085(int arg0) {
        if (this.field1216 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1207[var3] && this.field1207[var3] != 0) {
                    var2 = this.field1216[var3];
                }
            }
            if (var2 != -1) {
                return method576(var2).method1085(1);
            }
        }
        class104 var4 = class104.method2141(Statics.field2028, this.field1177, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1209 != 128 || this.field1211 != 128 || this.field1212 != 128) {
            var4.method2207(this.field1209, this.field1211, this.field1212);
        }
        if (this.field1179 != null) {
            for (int var5 = 0; var5 < this.field1179.length; var5++) {
                var4.method2152(this.field1179[var5], this.field1180[var5]);
            }
        }
        if (this.field1181 != null) {
            for (int var6 = 0; var6 < this.field1181.length; var6++) {
                var4.method2153(this.field1181[var6], this.field1189[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bg.h(IB)Ldj;")
    public final class109 method1086(int arg0) {
        if (this.field1216 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1207[var3] && this.field1207[var3] != 0) {
                    var2 = this.field1216[var3];
                }
            }
            if (var2 != -1) {
                return method576(var2).method1086(1);
            }
        }
        class109 var4 = (class109) field1174.method3535((long) this.field1176);
        if (var4 != null) {
            return var4;
        }
        class104 var5 = class104.method2141(Statics.field2028, this.field1177, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1209 != 128 || this.field1211 != 128 || this.field1212 != 128) {
            var5.method2207(this.field1209, this.field1211, this.field1212);
        }
        if (this.field1179 != null) {
            for (int var6 = 0; var6 < this.field1179.length; var6++) {
                var5.method2152(this.field1179[var6], this.field1180[var6]);
            }
        }
        if (this.field1181 != null) {
            for (int var7 = 0; var7 < this.field1181.length; var7++) {
                var5.method2153(this.field1181[var7], this.field1189[var7]);
            }
        }
        class109 var8 = var5.method2160(this.field1213 + 64, this.field1218 * 5 + 768, -50, -10, -50);
        var8.field1912 = true;
        field1174.method3537(var8, (long) this.field1176);
        return var8;
    }

    @ObfuscatedName("bg.l(II)Lbg;")
    public class56 method1087(int arg0) {
        if (this.field1216 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1207[var3] && this.field1207[var3] != 0) {
                    var2 = this.field1216[var3];
                }
            }
            if (var2 != -1) {
                return method576(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ao.b(IIIIIZI)Lcn;")
    public static final class82 method761(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class82 var8 = (class82) field1175.method3535(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class56 var9 = method576(arg0);
        if (arg1 > 1 && var9.field1216 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1207[var11] && var9.field1207[var11] != 0) {
                    var10 = var9.field1216[var11];
                }
            }
            if (var10 != -1) {
                var9 = method576(var10);
            }
        }
        class109 var12 = var9.method1086(1);
        if (var12 == null) {
            return null;
        }
        class82 var13 = null;
        if (var9.field1178 != -1) {
            var13 = method761(var9.field1208, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1219 != -1) {
            var13 = method761(var9.field1204, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1197 != -1) {
            var13 = method761(var9.field1217, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1470;
        int var15 = Statics.field1469;
        int var16 = Statics.field1474;
        int[] var17 = new int[4];
        class83.method1747(var17);
        class82 var18 = new class82(36, 32);
        class83.method1750(var18.field1463, 36, 32);
        class83.method1764();
        class95.method2037();
        class95.method2044(16, 16);
        class95.field1645 = false;
        if (var9.field1197 != -1) {
            var13.method1657(0, 0);
        }
        int var19 = var9.field1183;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class95.field1651[var9.field1184] * var19 >> 16;
        int var21 = class95.field1652[var9.field1184] * var19 >> 16;
        var12.method2233();
        var12.method2244(0, var9.field1185, var9.field1202, var9.field1184, var9.field1187, var9.field1188 + var12.field1518 / 2 + var20, var9.field1188 + var21);
        if (var9.field1219 != -1) {
            var13.method1657(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1642(1);
        }
        if (arg2 >= 2) {
            var18.method1642(16777215);
        }
        if (arg3 != 0) {
            var18.method1703(arg3);
        }
        class83.method1750(var18.field1463, 36, 32);
        if (var9.field1178 != -1) {
            var13.method1657(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1200 == 1) {
            class228 var22 = Statics.field171;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class161.field2480 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class161.field2516 + "</col>";
            }
            var22.method3870(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1175.method3537(var18, var6);
        }
        class83.method1750(var14, var15, var16);
        class83.method1734(var17);
        class95.method2037();
        class95.field1645 = true;
        return var18;
    }

    @ObfuscatedName("bg.g(ZB)Z")
    public final boolean method1114(boolean arg0) {
        int var2 = this.field1194;
        int var3 = this.field1195;
        int var4 = this.field1186;
        if (arg0) {
            var2 = this.field1221;
            var3 = this.field1198;
            var4 = this.field1201;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2028.method3074(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2028.method3074(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2028.method3074(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("bg.e(ZI)Lcr;")
    public final class104 method1082(boolean arg0) {
        int var2 = this.field1194;
        int var3 = this.field1195;
        int var4 = this.field1186;
        if (arg0) {
            var2 = this.field1221;
            var3 = this.field1198;
            var4 = this.field1201;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var5 = class104.method2141(Statics.field2028, var2, 0);
        if (var3 != -1) {
            class104 var6 = class104.method2141(Statics.field2028, var3, 0);
            if (var4 == -1) {
                class104[] var9 = new class104[] { var5, var6 };
                var5 = new class104(var9, 2);
            } else {
                class104 var7 = class104.method2141(Statics.field2028, var4, 0);
                class104[] var8 = new class104[] { var5, var6, var7 };
                var5 = new class104(var8, 3);
            }
        }
        if (!arg0 && this.field1196 != 0) {
            var5.method2142(0, this.field1196, 0);
        }
        if (arg0 && this.field1220 != 0) {
            var5.method2142(0, this.field1220, 0);
        }
        if (this.field1179 != null) {
            for (int var10 = 0; var10 < this.field1179.length; var10++) {
                var5.method2152(this.field1179[var10], this.field1180[var10]);
            }
        }
        if (this.field1181 != null) {
            for (int var11 = 0; var11 < this.field1181.length; var11++) {
                var5.method2153(this.field1181[var11], this.field1189[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("bg.p(ZI)Z")
    public final boolean method1090(boolean arg0) {
        int var2 = this.field1210;
        int var3 = this.field1203;
        if (arg0) {
            var2 = this.field1182;
            var3 = this.field1205;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2028.method3074(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2028.method3074(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("bg.s(ZB)Lcr;")
    public final class104 method1091(boolean arg0) {
        int var2 = this.field1210;
        int var3 = this.field1203;
        if (arg0) {
            var2 = this.field1182;
            var3 = this.field1205;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var4 = class104.method2141(Statics.field2028, var2, 0);
        if (var3 != -1) {
            class104 var5 = class104.method2141(Statics.field2028, var3, 0);
            class104[] var6 = new class104[] { var4, var5 };
            var4 = new class104(var6, 2);
        }
        if (this.field1179 != null) {
            for (int var7 = 0; var7 < this.field1179.length; var7++) {
                var4.method2152(this.field1179[var7], this.field1180[var7]);
            }
        }
        if (this.field1181 != null) {
            for (int var8 = 0; var8 < this.field1181.length; var8++) {
                var4.method2153(this.field1181[var8], this.field1189[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("ag.w(B)V")
    public static void method717() {
        field1175.method3538();
    }

    @ObfuscatedName("cy.i(ZB)V")
    public static void method2136(boolean arg0) {
        if (Statics.field1214 != arg0) {
            field1173.method3538();
            field1174.method3538();
            field1175.method3538();
            Statics.field1214 = arg0;
        }
    }
}

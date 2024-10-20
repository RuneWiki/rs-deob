package deob;

@ObfuscatedName("bp")
public class class56 extends class208 {

    @ObfuscatedName("bp.u")
    public static class197 field1178 = new class197(64);

    @ObfuscatedName("bp.o")
    public static class197 field1207 = new class197(50);

    @ObfuscatedName("bp.p")
    public static class197 field1180 = new class197(200);

    @ObfuscatedName("bp.q")
    public int field1182;

    @ObfuscatedName("bp.g")
    public int field1188;

    @ObfuscatedName("bp.j")
    public String field1184 = "null";

    @ObfuscatedName("bp.w")
    public short[] field1185;

    @ObfuscatedName("bp.x")
    public short[] field1186;

    @ObfuscatedName("bp.f")
    public short[] field1199;

    @ObfuscatedName("bp.t")
    public short[] field1222;

    @ObfuscatedName("bp.z")
    public int field1196 = 2000;

    @ObfuscatedName("bp.y")
    public int field1201 = 0;

    @ObfuscatedName("bp.m")
    public int field1187 = 0;

    @ObfuscatedName("bp.v")
    public int field1192 = 0;

    @ObfuscatedName("bp.k")
    public int field1193 = 0;

    @ObfuscatedName("bp.n")
    public int field1194 = 0;

    @ObfuscatedName("bp.d")
    public int field1195 = 0;

    @ObfuscatedName("bp.s")
    public int field1198 = 1;

    @ObfuscatedName("bp.ah")
    public boolean field1197 = false;

    @ObfuscatedName("bp.ak")
    public String[] field1190 = new String[] { null, null, class161.field2360, null, null };

    @ObfuscatedName("bp.as")
    public String[] field1181 = new String[] { null, null, null, null, class161.field2378 };

    @ObfuscatedName("bp.ae")
    public int field1200 = -1;

    @ObfuscatedName("bp.ao")
    public int field1203 = -1;

    @ObfuscatedName("bp.av")
    public int field1202 = 0;

    @ObfuscatedName("bp.al")
    public int field1179 = -1;

    @ObfuscatedName("bp.ap")
    public int field1206 = -1;

    @ObfuscatedName("bp.an")
    public int field1205 = 0;

    @ObfuscatedName("bp.aw")
    public int field1218 = -1;

    @ObfuscatedName("bp.ad")
    public int field1214 = -1;

    @ObfuscatedName("bp.aa")
    public int field1208 = -1;

    @ObfuscatedName("bp.at")
    public int field1209 = -1;

    @ObfuscatedName("bp.ag")
    public int field1210 = -1;

    @ObfuscatedName("bp.aq")
    public int field1211 = -1;

    @ObfuscatedName("bp.af")
    public int[] field1212;

    @ObfuscatedName("bp.ax")
    public int[] field1213;

    @ObfuscatedName("bp.ai")
    public int field1226 = -1;

    @ObfuscatedName("bp.ar")
    public int field1191 = -1;

    @ObfuscatedName("bp.ab")
    public int field1216 = 128;

    @ObfuscatedName("bp.aj")
    public int field1217 = 128;

    @ObfuscatedName("bp.au")
    public int field1221 = 128;

    @ObfuscatedName("bp.am")
    public int field1219 = 0;

    @ObfuscatedName("bp.az")
    public int field1174 = 0;

    @ObfuscatedName("bp.ay")
    public int field1189 = 0;

    @ObfuscatedName("bp.ac")
    public boolean field1183 = false;

    @ObfuscatedName("bp.bw")
    public int field1223 = -1;

    @ObfuscatedName("bp.bu")
    public int field1224 = -1;

    @ObfuscatedName("bp.bl")
    public int field1225 = -1;

    @ObfuscatedName("bp.bp")
    public int field1215 = -1;

    @ObfuscatedName("eq.e(Lfe;Lfe;ZLhu;B)V")
    public static void method2807(class171 arg0, class171 arg1, boolean arg2, class228 arg3) {
        Statics.field1175 = arg0;
        Statics.field1176 = arg1;
        Statics.field722 = arg2;
        Statics.field1177 = Statics.field1175.method3142(10);
        Statics.field1220 = arg3;
    }

    @ObfuscatedName("p.l(II)Lbp;")
    public static class56 method104(int arg0) {
        class56 var1 = (class56) field1178.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1175.method3130(10, arg0);
        class56 var3 = new class56();
        var3.field1182 = arg0;
        if (var2 != null) {
            var3.method1130(new class123(var2));
        }
        var3.method1129();
        if (var3.field1191 != -1) {
            var3.method1166(method104(var3.field1191), method104(var3.field1226));
        }
        if (var3.field1224 != -1) {
            var3.method1132(method104(var3.field1224), method104(var3.field1223));
        }
        if (var3.field1215 != -1) {
            var3.method1134(method104(var3.field1215), method104(var3.field1225));
        }
        if (!Statics.field722 && var3.field1197) {
            var3.field1184 = class161.field2488;
            var3.field1183 = false;
            var3.field1190 = null;
            var3.field1181 = null;
            var3.field1189 = 0;
        }
        field1178.method3591(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bp.c(I)V")
    public void method1129() {
    }

    @ObfuscatedName("bp.h(Ldd;B)V")
    public void method1130(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method1131(arg0, var2);
        }
    }

    @ObfuscatedName("bp.r(Ldd;IB)V")
    public void method1131(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1188 = arg0.method2466();
        } else if (arg1 == 2) {
            this.field1184 = arg0.method2471();
        } else if (arg1 == 4) {
            this.field1196 = arg0.method2466();
        } else if (arg1 == 5) {
            this.field1201 = arg0.method2466();
        } else if (arg1 == 6) {
            this.field1187 = arg0.method2466();
        } else if (arg1 == 7) {
            this.field1193 = arg0.method2466();
            if (this.field1193 > 32767) {
                this.field1193 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1194 = arg0.method2466();
            if (this.field1194 > 32767) {
                this.field1194 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1195 = 1;
        } else if (arg1 == 12) {
            this.field1198 = arg0.method2468();
        } else if (arg1 == 16) {
            this.field1197 = true;
        } else if (arg1 == 23) {
            this.field1200 = arg0.method2466();
            this.field1202 = arg0.method2464();
        } else if (arg1 == 24) {
            this.field1203 = arg0.method2466();
        } else if (arg1 == 25) {
            this.field1179 = arg0.method2466();
            this.field1205 = arg0.method2464();
        } else if (arg1 == 26) {
            this.field1206 = arg0.method2466();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1190[arg1 - 30] = arg0.method2471();
            if (this.field1190[arg1 - 30].equalsIgnoreCase(class161.field2362)) {
                this.field1190[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1181[arg1 - 35] = arg0.method2471();
        } else if (arg1 == 40) {
            int var3 = arg0.method2464();
            this.field1185 = new short[var3];
            this.field1186 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1185[var4] = (short) arg0.method2466();
                this.field1186[var4] = (short) arg0.method2466();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2464();
            this.field1199 = new short[var5];
            this.field1222 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1199[var6] = (short) arg0.method2466();
                this.field1222[var6] = (short) arg0.method2466();
            }
        } else if (arg1 == 65) {
            this.field1183 = true;
        } else if (arg1 == 78) {
            this.field1218 = arg0.method2466();
        } else if (arg1 == 79) {
            this.field1214 = arg0.method2466();
        } else if (arg1 == 90) {
            this.field1208 = arg0.method2466();
        } else if (arg1 == 91) {
            this.field1210 = arg0.method2466();
        } else if (arg1 == 92) {
            this.field1209 = arg0.method2466();
        } else if (arg1 == 93) {
            this.field1211 = arg0.method2466();
        } else if (arg1 == 95) {
            this.field1192 = arg0.method2466();
        } else if (arg1 == 97) {
            this.field1226 = arg0.method2466();
        } else if (arg1 == 98) {
            this.field1191 = arg0.method2466();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1212 == null) {
                this.field1212 = new int[10];
                this.field1213 = new int[10];
            }
            this.field1212[arg1 - 100] = arg0.method2466();
            this.field1213[arg1 - 100] = arg0.method2466();
        } else if (arg1 == 110) {
            this.field1216 = arg0.method2466();
        } else if (arg1 == 111) {
            this.field1217 = arg0.method2466();
        } else if (arg1 == 112) {
            this.field1221 = arg0.method2466();
        } else if (arg1 == 113) {
            this.field1219 = arg0.method2465();
        } else if (arg1 == 114) {
            this.field1174 = arg0.method2465();
        } else if (arg1 == 115) {
            this.field1189 = arg0.method2464();
        } else if (arg1 == 139) {
            this.field1223 = arg0.method2466();
        } else if (arg1 == 140) {
            this.field1224 = arg0.method2466();
        } else if (arg1 == 148) {
            this.field1225 = arg0.method2466();
        } else if (arg1 == 149) {
            this.field1215 = arg0.method2466();
        }
    }

    @ObfuscatedName("bp.a(Lbp;Lbp;I)V")
    public void method1166(class56 arg0, class56 arg1) {
        this.field1188 = arg0.field1188;
        this.field1196 = arg0.field1196;
        this.field1201 = arg0.field1201;
        this.field1187 = arg0.field1187;
        this.field1192 = arg0.field1192;
        this.field1193 = arg0.field1193;
        this.field1194 = arg0.field1194;
        this.field1185 = arg0.field1185;
        this.field1186 = arg0.field1186;
        this.field1199 = arg0.field1199;
        this.field1222 = arg0.field1222;
        this.field1184 = arg1.field1184;
        this.field1197 = arg1.field1197;
        this.field1198 = arg1.field1198;
        this.field1195 = 1;
    }

    @ObfuscatedName("bp.b(Lbp;Lbp;B)V")
    public void method1132(class56 arg0, class56 arg1) {
        this.field1188 = arg0.field1188;
        this.field1196 = arg0.field1196;
        this.field1201 = arg0.field1201;
        this.field1187 = arg0.field1187;
        this.field1192 = arg0.field1192;
        this.field1193 = arg0.field1193;
        this.field1194 = arg0.field1194;
        this.field1185 = arg1.field1185;
        this.field1186 = arg1.field1186;
        this.field1199 = arg1.field1199;
        this.field1222 = arg1.field1222;
        this.field1184 = arg1.field1184;
        this.field1197 = arg1.field1197;
        this.field1195 = arg1.field1195;
        this.field1200 = arg1.field1200;
        this.field1203 = arg1.field1203;
        this.field1218 = arg1.field1218;
        this.field1179 = arg1.field1179;
        this.field1206 = arg1.field1206;
        this.field1214 = arg1.field1214;
        this.field1208 = arg1.field1208;
        this.field1209 = arg1.field1209;
        this.field1210 = arg1.field1210;
        this.field1211 = arg1.field1211;
        this.field1189 = arg1.field1189;
        this.field1190 = arg1.field1190;
        this.field1181 = new String[5];
        if (arg1.field1181 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1181[var3] = arg1.field1181[var3];
            }
        }
        this.field1181[4] = class161.field2366;
        this.field1198 = 0;
    }

    @ObfuscatedName("bp.u(Lbp;Lbp;I)V")
    public void method1134(class56 arg0, class56 arg1) {
        this.field1188 = arg0.field1188;
        this.field1196 = arg0.field1196;
        this.field1201 = arg0.field1201;
        this.field1187 = arg0.field1187;
        this.field1192 = arg0.field1192;
        this.field1193 = arg0.field1193;
        this.field1194 = arg0.field1194;
        this.field1185 = arg0.field1185;
        this.field1186 = arg0.field1186;
        this.field1199 = arg0.field1199;
        this.field1222 = arg0.field1222;
        this.field1195 = arg0.field1195;
        this.field1184 = arg1.field1184;
        this.field1198 = 0;
        this.field1197 = false;
        this.field1183 = false;
    }

    @ObfuscatedName("bp.o(II)Lcv;")
    public final class104 method1135(int arg0) {
        if (this.field1212 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1213[var3] && this.field1213[var3] != 0) {
                    var2 = this.field1212[var3];
                }
            }
            if (var2 != -1) {
                return method104(var2).method1135(1);
            }
        }
        class104 var4 = class104.method2178(Statics.field1176, this.field1188, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1216 != 128 || this.field1217 != 128 || this.field1221 != 128) {
            var4.method2170(this.field1216, this.field1217, this.field1221);
        }
        if (this.field1185 != null) {
            for (int var5 = 0; var5 < this.field1185.length; var5++) {
                var4.method2217(this.field1185[var5], this.field1186[var5]);
            }
        }
        if (this.field1199 != null) {
            for (int var6 = 0; var6 < this.field1199.length; var6++) {
                var4.method2168(this.field1199[var6], this.field1222[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bp.p(II)Lds;")
    public final class109 method1128(int arg0) {
        if (this.field1212 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1213[var3] && this.field1213[var3] != 0) {
                    var2 = this.field1212[var3];
                }
            }
            if (var2 != -1) {
                return method104(var2).method1128(1);
            }
        }
        class109 var4 = (class109) field1207.method3589((long) this.field1182);
        if (var4 != null) {
            return var4;
        }
        class104 var5 = class104.method2178(Statics.field1176, this.field1188, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1216 != 128 || this.field1217 != 128 || this.field1221 != 128) {
            var5.method2170(this.field1216, this.field1217, this.field1221);
        }
        if (this.field1185 != null) {
            for (int var6 = 0; var6 < this.field1185.length; var6++) {
                var5.method2217(this.field1185[var6], this.field1186[var6]);
            }
        }
        if (this.field1199 != null) {
            for (int var7 = 0; var7 < this.field1199.length; var7++) {
                var5.method2168(this.field1199[var7], this.field1222[var7]);
            }
        }
        class109 var8 = var5.method2175(this.field1219 + 64, this.field1174 * 5 + 768, -50, -10, -50);
        var8.field1930 = true;
        field1207.method3591(var8, (long) this.field1182);
        return var8;
    }

    @ObfuscatedName("bp.i(II)Lbp;")
    public class56 method1137(int arg0) {
        if (this.field1212 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1213[var3] && this.field1213[var3] != 0) {
                    var2 = this.field1212[var3];
                }
            }
            if (var2 != -1) {
                return method104(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ap.q(IIIIIZI)Lcf;")
    public static final class82 method698(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class82 var8 = (class82) field1180.method3589(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class56 var9 = method104(arg0);
        if (arg1 > 1 && var9.field1212 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1213[var11] && var9.field1213[var11] != 0) {
                    var10 = var9.field1212[var11];
                }
            }
            if (var10 != -1) {
                var9 = method104(var10);
            }
        }
        class109 var12 = var9.method1128(1);
        if (var12 == null) {
            return null;
        }
        class82 var13 = null;
        if (var9.field1191 != -1) {
            var13 = method698(var9.field1226, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1224 != -1) {
            var13 = method698(var9.field1223, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1215 != -1) {
            var13 = method698(var9.field1225, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1483;
        int var15 = Statics.field1479;
        int var16 = Statics.field1478;
        int[] var17 = new int[4];
        class83.method1787(var17);
        class82 var18 = new class82(36, 32);
        class83.method1834(var18.field1477, 36, 32);
        class83.method1789();
        class95.method2063();
        class95.method2106(16, 16);
        class95.field1636 = false;
        if (var9.field1215 != -1) {
            var13.method1775(0, 0);
        }
        int var19 = var9.field1196;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class95.field1656[var9.field1201] * var19 >> 16;
        int var21 = class95.field1654[var9.field1201] * var19 >> 16;
        var12.method2248();
        var12.method2286(0, var9.field1187, var9.field1192, var9.field1201, var9.field1193, var9.field1194 + var12.field1530 / 2 + var20, var9.field1194 + var21);
        if (var9.field1224 != -1) {
            var13.method1775(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1692(1);
        }
        if (arg2 >= 2) {
            var18.method1692(16777215);
        }
        if (arg3 != 0) {
            var18.method1693(arg3);
        }
        class83.method1834(var18.field1477, 36, 32);
        if (var9.field1191 != -1) {
            var13.method1775(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1195 == 1) {
            Statics.field1220.method3932(method583(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1180.method3591(var18, var6);
        }
        class83.method1834(var14, var15, var16);
        class83.method1814(var17);
        class95.method2063();
        class95.field1636 = true;
        return var18;
    }

    @ObfuscatedName("ah.g(II)Ljava/lang/String;")
    public static final String method583(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class161.field2521 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class161.field2519 + "</col>";
        }
    }

    @ObfuscatedName("bp.j(ZI)Z")
    public final boolean method1138(boolean arg0) {
        int var2 = this.field1200;
        int var3 = this.field1203;
        int var4 = this.field1218;
        if (arg0) {
            var2 = this.field1179;
            var3 = this.field1206;
            var4 = this.field1214;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1176.method3134(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1176.method3134(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1176.method3134(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("bp.w(ZB)Lcv;")
    public final class104 method1175(boolean arg0) {
        int var2 = this.field1200;
        int var3 = this.field1203;
        int var4 = this.field1218;
        if (arg0) {
            var2 = this.field1179;
            var3 = this.field1206;
            var4 = this.field1214;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var5 = class104.method2178(Statics.field1176, var2, 0);
        if (var3 != -1) {
            class104 var6 = class104.method2178(Statics.field1176, var3, 0);
            if (var4 == -1) {
                class104[] var9 = new class104[] { var5, var6 };
                var5 = new class104(var9, 2);
            } else {
                class104 var7 = class104.method2178(Statics.field1176, var4, 0);
                class104[] var8 = new class104[] { var5, var6, var7 };
                var5 = new class104(var8, 3);
            }
        }
        if (!arg0 && this.field1202 != 0) {
            var5.method2169(0, this.field1202, 0);
        }
        if (arg0 && this.field1205 != 0) {
            var5.method2169(0, this.field1205, 0);
        }
        if (this.field1185 != null) {
            for (int var10 = 0; var10 < this.field1185.length; var10++) {
                var5.method2217(this.field1185[var10], this.field1186[var10]);
            }
        }
        if (this.field1199 != null) {
            for (int var11 = 0; var11 < this.field1199.length; var11++) {
                var5.method2168(this.field1199[var11], this.field1222[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("bp.x(ZI)Z")
    public final boolean method1140(boolean arg0) {
        int var2 = this.field1208;
        int var3 = this.field1209;
        if (arg0) {
            var2 = this.field1210;
            var3 = this.field1211;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1176.method3134(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1176.method3134(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("bp.f(ZI)Lcv;")
    public final class104 method1184(boolean arg0) {
        int var2 = this.field1208;
        int var3 = this.field1209;
        if (arg0) {
            var2 = this.field1210;
            var3 = this.field1211;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var4 = class104.method2178(Statics.field1176, var2, 0);
        if (var3 != -1) {
            class104 var5 = class104.method2178(Statics.field1176, var3, 0);
            class104[] var6 = new class104[] { var4, var5 };
            var4 = new class104(var6, 2);
        }
        if (this.field1185 != null) {
            for (int var7 = 0; var7 < this.field1185.length; var7++) {
                var4.method2217(this.field1185[var7], this.field1186[var7]);
            }
        }
        if (this.field1199 != null) {
            for (int var8 = 0; var8 < this.field1199.length; var8++) {
                var4.method2168(this.field1199[var8], this.field1222[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("az.t(I)V")
    public static void method1039() {
        field1178.method3590();
        field1207.method3590();
        field1180.method3590();
    }
}

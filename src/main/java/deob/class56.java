package deob;

@ObfuscatedName("bw")
public class class56 extends class208 {

    @ObfuscatedName("bw.m")
    public static class197 field1160 = new class197(64);

    @ObfuscatedName("bw.p")
    public static class197 field1161 = new class197(50);

    @ObfuscatedName("bw.f")
    public static class197 field1162 = new class197(200);

    @ObfuscatedName("bw.v")
    public int field1163;

    @ObfuscatedName("bw.q")
    public int field1183;

    @ObfuscatedName("bw.t")
    public String field1158 = "null";

    @ObfuscatedName("bw.g")
    public short[] field1182;

    @ObfuscatedName("bw.s")
    public short[] field1167;

    @ObfuscatedName("bw.h")
    public short[] field1166;

    @ObfuscatedName("bw.u")
    public short[] field1202;

    @ObfuscatedName("bw.a")
    public int field1170 = 2000;

    @ObfuscatedName("bw.e")
    public int field1168 = 0;

    @ObfuscatedName("bw.c")
    public int field1172 = 0;

    @ObfuscatedName("bw.n")
    public int field1204 = 0;

    @ObfuscatedName("bw.y")
    public int field1159 = 0;

    @ObfuscatedName("bw.k")
    public int field1169 = 0;

    @ObfuscatedName("bw.w")
    public int field1209 = 0;

    @ObfuscatedName("bw.o")
    public int field1184 = 1;

    @ObfuscatedName("bw.ah")
    public boolean field1178 = false;

    @ObfuscatedName("bw.an")
    public String[] field1179 = new String[] { null, null, class161.field2424, null, null };

    @ObfuscatedName("bw.ag")
    public String[] field1188 = new String[] { null, null, null, null, class161.field2374 };

    @ObfuscatedName("bw.as")
    public int field1165 = -1;

    @ObfuscatedName("bw.aq")
    public int field1177 = -1;

    @ObfuscatedName("bw.ax")
    public int field1164 = 0;

    @ObfuscatedName("bw.az")
    public int field1175 = -1;

    @ObfuscatedName("bw.ap")
    public int field1185 = -1;

    @ObfuscatedName("bw.ao")
    public int field1186 = 0;

    @ObfuscatedName("bw.af")
    public int field1187 = -1;

    @ObfuscatedName("bw.au")
    public int field1173 = -1;

    @ObfuscatedName("bw.ab")
    public int field1189 = -1;

    @ObfuscatedName("bw.at")
    public int field1176 = -1;

    @ObfuscatedName("bw.ay")
    public int field1191 = -1;

    @ObfuscatedName("bw.ad")
    public int field1192 = -1;

    @ObfuscatedName("bw.am")
    public int[] field1193;

    @ObfuscatedName("bw.ac")
    public int[] field1194;

    @ObfuscatedName("bw.aw")
    public int field1195 = -1;

    @ObfuscatedName("bw.ak")
    public int field1196 = -1;

    @ObfuscatedName("bw.ar")
    public int field1197 = 128;

    @ObfuscatedName("bw.aa")
    public int field1198 = 128;

    @ObfuscatedName("bw.av")
    public int field1180 = 128;

    @ObfuscatedName("bw.aj")
    public int field1200 = 0;

    @ObfuscatedName("bw.al")
    public int field1171 = 0;

    @ObfuscatedName("bw.ai")
    public int field1201 = 0;

    @ObfuscatedName("bw.ae")
    public boolean field1203 = false;

    @ObfuscatedName("bw.bf")
    public int field1155 = -1;

    @ObfuscatedName("bw.bx")
    public int field1205 = -1;

    @ObfuscatedName("bw.bh")
    public int field1206 = -1;

    @ObfuscatedName("bw.bw")
    public int field1207 = -1;

    @ObfuscatedName("ab.x(II)Lbw;")
    public static class56 method709(int arg0) {
        class56 var1 = (class56) field1160.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1199.method3079(10, arg0);
        class56 var3 = new class56();
        var3.field1163 = arg0;
        if (var2 != null) {
            var3.method1069(new class123(var2));
        }
        var3.method1068();
        if (var3.field1196 != -1) {
            var3.method1071(method709(var3.field1196), method709(var3.field1195));
        }
        if (var3.field1205 != -1) {
            var3.method1072(method709(var3.field1205), method709(var3.field1155));
        }
        if (var3.field1207 != -1) {
            var3.method1124(method709(var3.field1207), method709(var3.field1206));
        }
        if (!Statics.field1190 && var3.field1178) {
            var3.field1158 = class161.field2573;
            var3.field1203 = false;
            var3.field1179 = null;
            var3.field1188 = null;
            var3.field1201 = 0;
        }
        field1160.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bw.r(B)V")
    public void method1068() {
    }

    @ObfuscatedName("bw.j(Ldp;I)V")
    public void method1069(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method1070(arg0, var2);
        }
    }

    @ObfuscatedName("bw.z(Ldp;IB)V")
    public void method1070(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1183 = arg0.method2403();
        } else if (arg1 == 2) {
            this.field1158 = arg0.method2626();
        } else if (arg1 == 4) {
            this.field1170 = arg0.method2403();
        } else if (arg1 == 5) {
            this.field1168 = arg0.method2403();
        } else if (arg1 == 6) {
            this.field1172 = arg0.method2403();
        } else if (arg1 == 7) {
            this.field1159 = arg0.method2403();
            if (this.field1159 > 32767) {
                this.field1159 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1169 = arg0.method2403();
            if (this.field1169 > 32767) {
                this.field1169 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1209 = 1;
        } else if (arg1 == 12) {
            this.field1184 = arg0.method2413();
        } else if (arg1 == 16) {
            this.field1178 = true;
        } else if (arg1 == 23) {
            this.field1165 = arg0.method2403();
            this.field1164 = arg0.method2408();
        } else if (arg1 == 24) {
            this.field1177 = arg0.method2403();
        } else if (arg1 == 25) {
            this.field1175 = arg0.method2403();
            this.field1186 = arg0.method2408();
        } else if (arg1 == 26) {
            this.field1185 = arg0.method2403();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1179[arg1 - 30] = arg0.method2626();
            if (this.field1179[arg1 - 30].equalsIgnoreCase(class161.field2399)) {
                this.field1179[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1188[arg1 - 35] = arg0.method2626();
        } else if (arg1 == 40) {
            int var3 = arg0.method2408();
            this.field1182 = new short[var3];
            this.field1167 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1182[var4] = (short) arg0.method2403();
                this.field1167[var4] = (short) arg0.method2403();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2408();
            this.field1166 = new short[var5];
            this.field1202 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1166[var6] = (short) arg0.method2403();
                this.field1202[var6] = (short) arg0.method2403();
            }
        } else if (arg1 == 65) {
            this.field1203 = true;
        } else if (arg1 == 78) {
            this.field1187 = arg0.method2403();
        } else if (arg1 == 79) {
            this.field1173 = arg0.method2403();
        } else if (arg1 == 90) {
            this.field1189 = arg0.method2403();
        } else if (arg1 == 91) {
            this.field1191 = arg0.method2403();
        } else if (arg1 == 92) {
            this.field1176 = arg0.method2403();
        } else if (arg1 == 93) {
            this.field1192 = arg0.method2403();
        } else if (arg1 == 95) {
            this.field1204 = arg0.method2403();
        } else if (arg1 == 97) {
            this.field1195 = arg0.method2403();
        } else if (arg1 == 98) {
            this.field1196 = arg0.method2403();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1193 == null) {
                this.field1193 = new int[10];
                this.field1194 = new int[10];
            }
            this.field1193[arg1 - 100] = arg0.method2403();
            this.field1194[arg1 - 100] = arg0.method2403();
        } else if (arg1 == 110) {
            this.field1197 = arg0.method2403();
        } else if (arg1 == 111) {
            this.field1198 = arg0.method2403();
        } else if (arg1 == 112) {
            this.field1180 = arg0.method2403();
        } else if (arg1 == 113) {
            this.field1200 = arg0.method2409();
        } else if (arg1 == 114) {
            this.field1171 = arg0.method2409();
        } else if (arg1 == 115) {
            this.field1201 = arg0.method2408();
        } else if (arg1 == 139) {
            this.field1155 = arg0.method2403();
        } else if (arg1 == 140) {
            this.field1205 = arg0.method2403();
        } else if (arg1 == 148) {
            this.field1206 = arg0.method2403();
        } else if (arg1 == 149) {
            this.field1207 = arg0.method2403();
        }
    }

    @ObfuscatedName("bw.i(Lbw;Lbw;I)V")
    public void method1071(class56 arg0, class56 arg1) {
        this.field1183 = arg0.field1183;
        this.field1170 = arg0.field1170;
        this.field1168 = arg0.field1168;
        this.field1172 = arg0.field1172;
        this.field1204 = arg0.field1204;
        this.field1159 = arg0.field1159;
        this.field1169 = arg0.field1169;
        this.field1182 = arg0.field1182;
        this.field1167 = arg0.field1167;
        this.field1166 = arg0.field1166;
        this.field1202 = arg0.field1202;
        this.field1158 = arg1.field1158;
        this.field1178 = arg1.field1178;
        this.field1184 = arg1.field1184;
        this.field1209 = 1;
    }

    @ObfuscatedName("bw.b(Lbw;Lbw;I)V")
    public void method1072(class56 arg0, class56 arg1) {
        this.field1183 = arg0.field1183;
        this.field1170 = arg0.field1170;
        this.field1168 = arg0.field1168;
        this.field1172 = arg0.field1172;
        this.field1204 = arg0.field1204;
        this.field1159 = arg0.field1159;
        this.field1169 = arg0.field1169;
        this.field1182 = arg1.field1182;
        this.field1167 = arg1.field1167;
        this.field1166 = arg1.field1166;
        this.field1202 = arg1.field1202;
        this.field1158 = arg1.field1158;
        this.field1178 = arg1.field1178;
        this.field1209 = arg1.field1209;
        this.field1165 = arg1.field1165;
        this.field1177 = arg1.field1177;
        this.field1187 = arg1.field1187;
        this.field1175 = arg1.field1175;
        this.field1185 = arg1.field1185;
        this.field1173 = arg1.field1173;
        this.field1189 = arg1.field1189;
        this.field1176 = arg1.field1176;
        this.field1191 = arg1.field1191;
        this.field1192 = arg1.field1192;
        this.field1201 = arg1.field1201;
        this.field1179 = arg1.field1179;
        this.field1188 = new String[5];
        if (arg1.field1188 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1188[var3] = arg1.field1188[var3];
            }
        }
        this.field1188[4] = class161.field2379;
        this.field1184 = 0;
    }

    @ObfuscatedName("bw.l(Lbw;Lbw;I)V")
    public void method1124(class56 arg0, class56 arg1) {
        this.field1183 = arg0.field1183;
        this.field1170 = arg0.field1170;
        this.field1168 = arg0.field1168;
        this.field1172 = arg0.field1172;
        this.field1204 = arg0.field1204;
        this.field1159 = arg0.field1159;
        this.field1169 = arg0.field1169;
        this.field1182 = arg0.field1182;
        this.field1167 = arg0.field1167;
        this.field1166 = arg0.field1166;
        this.field1202 = arg0.field1202;
        this.field1209 = arg0.field1209;
        this.field1158 = arg1.field1158;
        this.field1184 = 0;
        this.field1178 = false;
        this.field1203 = false;
    }

    @ObfuscatedName("bw.m(II)Lcy;")
    public final class104 method1117(int arg0) {
        if (this.field1193 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1194[var3] && this.field1194[var3] != 0) {
                    var2 = this.field1193[var3];
                }
            }
            if (var2 != -1) {
                return method709(var2).method1117(1);
            }
        }
        class104 var4 = class104.method2122(Statics.field170, this.field1183, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1197 != 128 || this.field1198 != 128 || this.field1180 != 128) {
            var4.method2146(this.field1197, this.field1198, this.field1180);
        }
        if (this.field1182 != null) {
            for (int var5 = 0; var5 < this.field1182.length; var5++) {
                var4.method2197(this.field1182[var5], this.field1167[var5]);
            }
        }
        if (this.field1166 != null) {
            for (int var6 = 0; var6 < this.field1166.length; var6++) {
                var4.method2136(this.field1166[var6], this.field1202[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bw.p(II)Ldj;")
    public final class109 method1096(int arg0) {
        if (this.field1193 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1194[var3] && this.field1194[var3] != 0) {
                    var2 = this.field1193[var3];
                }
            }
            if (var2 != -1) {
                return method709(var2).method1096(1);
            }
        }
        class109 var4 = (class109) field1161.method3533((long) this.field1163);
        if (var4 != null) {
            return var4;
        }
        class104 var5 = class104.method2122(Statics.field170, this.field1183, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1197 != 128 || this.field1198 != 128 || this.field1180 != 128) {
            var5.method2146(this.field1197, this.field1198, this.field1180);
        }
        if (this.field1182 != null) {
            for (int var6 = 0; var6 < this.field1182.length; var6++) {
                var5.method2197(this.field1182[var6], this.field1167[var6]);
            }
        }
        if (this.field1166 != null) {
            for (int var7 = 0; var7 < this.field1166.length; var7++) {
                var5.method2136(this.field1166[var7], this.field1202[var7]);
            }
        }
        class109 var8 = var5.method2150(this.field1200 + 64, this.field1171 * 5 + 768, -50, -10, -50);
        var8.field1867 = true;
        field1161.method3535(var8, (long) this.field1163);
        return var8;
    }

    @ObfuscatedName("bw.f(II)Lbw;")
    public class56 method1126(int arg0) {
        if (this.field1193 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1194[var3] && this.field1194[var3] != 0) {
                    var2 = this.field1193[var3];
                }
            }
            if (var2 != -1) {
                return method709(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("bx.d(IIIIIZI)Lcd;")
    public static final class82 method1055(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class82 var8 = (class82) field1162.method3533(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class56 var9 = method709(arg0);
        if (arg1 > 1 && var9.field1193 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1194[var11] && var9.field1194[var11] != 0) {
                    var10 = var9.field1193[var11];
                }
            }
            if (var10 != -1) {
                var9 = method709(var10);
            }
        }
        class109 var12 = var9.method1096(1);
        if (var12 == null) {
            return null;
        }
        class82 var13 = null;
        if (var9.field1196 != -1) {
            var13 = method1055(var9.field1195, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1205 != -1) {
            var13 = method1055(var9.field1155, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1207 != -1) {
            var13 = method1055(var9.field1206, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1450;
        int var15 = Statics.field1448;
        int var16 = Statics.field1449;
        int[] var17 = new int[4];
        class83.method1781(var17);
        class82 var18 = new class82(36, 32);
        class83.method1720(var18.field1436, 36, 32);
        class83.method1726();
        class95.method2023();
        class95.method2011(16, 16);
        class95.field1620 = false;
        if (var9.field1207 != -1) {
            var13.method1637(0, 0);
        }
        int var19 = var9.field1170;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class95.field1640[var9.field1168] * var19 >> 16;
        int var21 = class95.field1641[var9.field1168] * var19 >> 16;
        var12.method2250();
        var12.method2226(0, var9.field1172, var9.field1204, var9.field1168, var9.field1159, var9.field1169 + var12.field1504 / 2 + var20, var9.field1169 + var21);
        if (var9.field1205 != -1) {
            var13.method1637(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1690(1);
        }
        if (arg2 >= 2) {
            var18.method1690(16777215);
        }
        if (arg3 != 0) {
            var18.method1680(arg3);
        }
        class83.method1720(var18.field1436, 36, 32);
        if (var9.field1196 != -1) {
            var13.method1637(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1209 == 1) {
            Statics.field677.method3829(method2700(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1162.method3535(var18, var6);
        }
        class83.method1720(var14, var15, var16);
        class83.method1725(var17);
        class95.method2023();
        class95.field1620 = true;
        return var18;
    }

    @ObfuscatedName("dx.v(II)Ljava/lang/String;")
    public static final String method2700(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class161.field2534 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class161.field2532 + "</col>";
        }
    }

    @ObfuscatedName("bw.q(ZB)Z")
    public final boolean method1077(boolean arg0) {
        int var2 = this.field1165;
        int var3 = this.field1177;
        int var4 = this.field1187;
        if (arg0) {
            var2 = this.field1175;
            var3 = this.field1185;
            var4 = this.field1173;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field170.method3081(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field170.method3081(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field170.method3081(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("bw.t(ZI)Lcy;")
    public final class104 method1073(boolean arg0) {
        int var2 = this.field1165;
        int var3 = this.field1177;
        int var4 = this.field1187;
        if (arg0) {
            var2 = this.field1175;
            var3 = this.field1185;
            var4 = this.field1173;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var5 = class104.method2122(Statics.field170, var2, 0);
        if (var3 != -1) {
            class104 var6 = class104.method2122(Statics.field170, var3, 0);
            if (var4 == -1) {
                class104[] var9 = new class104[] { var5, var6 };
                var5 = new class104(var9, 2);
            } else {
                class104 var7 = class104.method2122(Statics.field170, var4, 0);
                class104[] var8 = new class104[] { var5, var6, var7 };
                var5 = new class104(var8, 3);
            }
        }
        if (!arg0 && this.field1164 != 0) {
            var5.method2144(0, this.field1164, 0);
        }
        if (arg0 && this.field1186 != 0) {
            var5.method2144(0, this.field1186, 0);
        }
        if (this.field1182 != null) {
            for (int var10 = 0; var10 < this.field1182.length; var10++) {
                var5.method2197(this.field1182[var10], this.field1167[var10]);
            }
        }
        if (this.field1166 != null) {
            for (int var11 = 0; var11 < this.field1166.length; var11++) {
                var5.method2136(this.field1166[var11], this.field1202[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("bw.g(ZI)Z")
    public final boolean method1079(boolean arg0) {
        int var2 = this.field1189;
        int var3 = this.field1176;
        if (arg0) {
            var2 = this.field1191;
            var3 = this.field1192;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field170.method3081(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field170.method3081(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("bw.s(ZI)Lcy;")
    public final class104 method1080(boolean arg0) {
        int var2 = this.field1189;
        int var3 = this.field1176;
        if (arg0) {
            var2 = this.field1191;
            var3 = this.field1192;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var4 = class104.method2122(Statics.field170, var2, 0);
        if (var3 != -1) {
            class104 var5 = class104.method2122(Statics.field170, var3, 0);
            class104[] var6 = new class104[] { var4, var5 };
            var4 = new class104(var6, 2);
        }
        if (this.field1182 != null) {
            for (int var7 = 0; var7 < this.field1182.length; var7++) {
                var4.method2197(this.field1182[var7], this.field1167[var7]);
            }
        }
        if (this.field1166 != null) {
            for (int var8 = 0; var8 < this.field1166.length; var8++) {
                var4.method2136(this.field1166[var8], this.field1202[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("dz.h(S)V")
    public static void method2359() {
        field1160.method3534();
        field1161.method3534();
        field1162.method3534();
    }

    @ObfuscatedName("r.u(I)V")
    public static void method14() {
        field1162.method3534();
    }

    @ObfuscatedName("ee.a(ZI)V")
    public static void method2868(boolean arg0) {
        if (Statics.field1190 != arg0) {
            field1160.method3534();
            field1161.method3534();
            field1162.method3534();
            Statics.field1190 = arg0;
        }
    }
}

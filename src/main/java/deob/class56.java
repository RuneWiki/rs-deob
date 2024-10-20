package deob;

@ObfuscatedName("bg")
public class class56 extends class208 {

    @ObfuscatedName("bg.f")
    public static class197 field1164 = new class197(64);

    @ObfuscatedName("bg.k")
    public static class197 field1146 = new class197(50);

    @ObfuscatedName("bg.h")
    public static class197 field1147 = new class197(200);

    @ObfuscatedName("bg.w")
    public int field1149;

    @ObfuscatedName("bg.u")
    public int field1150;

    @ObfuscatedName("bg.n")
    public String field1151 = "null";

    @ObfuscatedName("bg.d")
    public short[] field1154;

    @ObfuscatedName("bg.a")
    public short[] field1161;

    @ObfuscatedName("bg.b")
    public short[] field1181;

    @ObfuscatedName("bg.q")
    public short[] field1193;

    @ObfuscatedName("bg.o")
    public int field1152 = 2000;

    @ObfuscatedName("bg.c")
    public int field1184 = 0;

    @ObfuscatedName("bg.i")
    public int field1158 = 0;

    @ObfuscatedName("bg.x")
    public int field1160 = 0;

    @ObfuscatedName("bg.v")
    public int field1156 = 0;

    @ObfuscatedName("bg.l")
    public int field1187 = 0;

    @ObfuscatedName("bg.e")
    public int field1162 = 0;

    @ObfuscatedName("bg.j")
    public int field1163 = 1;

    @ObfuscatedName("bg.ae")
    public boolean field1140 = false;

    @ObfuscatedName("bg.ah")
    public String[] field1165 = new String[] { null, null, class161.field2357, null, null };

    @ObfuscatedName("bg.am")
    public String[] field1166 = new String[] { null, null, null, null, class161.field2358 };

    @ObfuscatedName("bg.aa")
    public int field1167 = -1;

    @ObfuscatedName("bg.ax")
    public int field1168 = -1;

    @ObfuscatedName("bg.ac")
    public int field1157 = 0;

    @ObfuscatedName("bg.ar")
    public int field1170 = -1;

    @ObfuscatedName("bg.an")
    public int field1171 = -1;

    @ObfuscatedName("bg.ag")
    public int field1175 = 0;

    @ObfuscatedName("bg.ab")
    public int field1172 = -1;

    @ObfuscatedName("bg.ao")
    public int field1174 = -1;

    @ObfuscatedName("bg.av")
    public int field1186 = -1;

    @ObfuscatedName("bg.ap")
    public int field1176 = -1;

    @ObfuscatedName("bg.au")
    public int field1177 = -1;

    @ObfuscatedName("bg.ad")
    public int field1178 = -1;

    @ObfuscatedName("bg.aj")
    public int[] field1179;

    @ObfuscatedName("bg.ai")
    public int[] field1180;

    @ObfuscatedName("bg.az")
    public int field1159 = -1;

    @ObfuscatedName("bg.ay")
    public int field1182 = -1;

    @ObfuscatedName("bg.at")
    public int field1183 = 128;

    @ObfuscatedName("bg.al")
    public int field1145 = 128;

    @ObfuscatedName("bg.aw")
    public int field1185 = 128;

    @ObfuscatedName("bg.ak")
    public int field1194 = 0;

    @ObfuscatedName("bg.as")
    public int field1169 = 0;

    @ObfuscatedName("bg.aq")
    public int field1188 = 0;

    @ObfuscatedName("bg.af")
    public boolean field1189 = false;

    @ObfuscatedName("bg.bp")
    public int field1190 = -1;

    @ObfuscatedName("bg.bh")
    public int field1191 = -1;

    @ObfuscatedName("bg.bo")
    public int field1192 = -1;

    @ObfuscatedName("bg.bg")
    public int field1155 = -1;

    @ObfuscatedName("x.s(Lfu;Lfu;ZLhq;I)V")
    public static void method544(class171 arg0, class171 arg1, boolean arg2, class228 arg3) {
        Statics.field1143 = arg0;
        Statics.field1144 = arg1;
        Statics.field1052 = arg2;
        Statics.field2127 = Statics.field1143.method3079(10);
        Statics.field1153 = arg3;
    }

    @ObfuscatedName("fb.z(II)Lbg;")
    public static class56 method3201(int arg0) {
        class56 var1 = (class56) field1164.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1143.method3091(10, arg0);
        class56 var3 = new class56();
        var3.field1149 = arg0;
        if (var2 != null) {
            var3.method1064(new class123(var2));
        }
        var3.method1063();
        if (var3.field1182 != -1) {
            var3.method1116(method3201(var3.field1182), method3201(var3.field1159));
        }
        if (var3.field1191 != -1) {
            var3.method1067(method3201(var3.field1191), method3201(var3.field1190));
        }
        if (var3.field1155 != -1) {
            var3.method1068(method3201(var3.field1155), method3201(var3.field1192));
        }
        if (!Statics.field1052 && var3.field1140) {
            var3.field1151 = class161.field2622;
            var3.field1189 = false;
            var3.field1165 = null;
            var3.field1166 = null;
            var3.field1188 = 0;
        }
        field1164.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("bg.t(I)V")
    public void method1063() {
    }

    @ObfuscatedName("bg.y(Ldy;B)V")
    public void method1064(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method1096(arg0, var2);
        }
    }

    @ObfuscatedName("bg.p(Ldy;II)V")
    public void method1096(class123 arg0, int arg1) {
        if (arg1 == 1) {
            this.field1150 = arg0.method2550();
        } else if (arg1 == 2) {
            this.field1151 = arg0.method2385();
        } else if (arg1 == 4) {
            this.field1152 = arg0.method2550();
        } else if (arg1 == 5) {
            this.field1184 = arg0.method2550();
        } else if (arg1 == 6) {
            this.field1158 = arg0.method2550();
        } else if (arg1 == 7) {
            this.field1156 = arg0.method2550();
            if (this.field1156 > 32767) {
                this.field1156 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1187 = arg0.method2550();
            if (this.field1187 > 32767) {
                this.field1187 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1162 = 1;
        } else if (arg1 == 12) {
            this.field1163 = arg0.method2408();
        } else if (arg1 == 16) {
            this.field1140 = true;
        } else if (arg1 == 23) {
            this.field1167 = arg0.method2550();
            this.field1157 = arg0.method2363();
        } else if (arg1 == 24) {
            this.field1168 = arg0.method2550();
        } else if (arg1 == 25) {
            this.field1170 = arg0.method2550();
            this.field1175 = arg0.method2363();
        } else if (arg1 == 26) {
            this.field1171 = arg0.method2550();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1165[arg1 - 30] = arg0.method2385();
            if (this.field1165[arg1 - 30].equalsIgnoreCase(class161.field2496)) {
                this.field1165[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1166[arg1 - 35] = arg0.method2385();
        } else if (arg1 == 40) {
            int var3 = arg0.method2363();
            this.field1154 = new short[var3];
            this.field1161 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1154[var4] = (short) arg0.method2550();
                this.field1161[var4] = (short) arg0.method2550();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2363();
            this.field1181 = new short[var5];
            this.field1193 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1181[var6] = (short) arg0.method2550();
                this.field1193[var6] = (short) arg0.method2550();
            }
        } else if (arg1 == 65) {
            this.field1189 = true;
        } else if (arg1 == 78) {
            this.field1172 = arg0.method2550();
        } else if (arg1 == 79) {
            this.field1174 = arg0.method2550();
        } else if (arg1 == 90) {
            this.field1186 = arg0.method2550();
        } else if (arg1 == 91) {
            this.field1177 = arg0.method2550();
        } else if (arg1 == 92) {
            this.field1176 = arg0.method2550();
        } else if (arg1 == 93) {
            this.field1178 = arg0.method2550();
        } else if (arg1 == 95) {
            this.field1160 = arg0.method2550();
        } else if (arg1 == 97) {
            this.field1159 = arg0.method2550();
        } else if (arg1 == 98) {
            this.field1182 = arg0.method2550();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1179 == null) {
                this.field1179 = new int[10];
                this.field1180 = new int[10];
            }
            this.field1179[arg1 - 100] = arg0.method2550();
            this.field1180[arg1 - 100] = arg0.method2550();
        } else if (arg1 == 110) {
            this.field1183 = arg0.method2550();
        } else if (arg1 == 111) {
            this.field1145 = arg0.method2550();
        } else if (arg1 == 112) {
            this.field1185 = arg0.method2550();
        } else if (arg1 == 113) {
            this.field1194 = arg0.method2483();
        } else if (arg1 == 114) {
            this.field1169 = arg0.method2483() * 5;
        } else if (arg1 == 115) {
            this.field1188 = arg0.method2363();
        } else if (arg1 == 139) {
            this.field1190 = arg0.method2550();
        } else if (arg1 == 140) {
            this.field1191 = arg0.method2550();
        } else if (arg1 == 148) {
            this.field1192 = arg0.method2550();
        } else if (arg1 == 149) {
            this.field1155 = arg0.method2550();
        }
    }

    @ObfuscatedName("bg.g(Lbg;Lbg;I)V")
    public void method1116(class56 arg0, class56 arg1) {
        this.field1150 = arg0.field1150;
        this.field1152 = arg0.field1152;
        this.field1184 = arg0.field1184;
        this.field1158 = arg0.field1158;
        this.field1160 = arg0.field1160;
        this.field1156 = arg0.field1156;
        this.field1187 = arg0.field1187;
        this.field1154 = arg0.field1154;
        this.field1161 = arg0.field1161;
        this.field1181 = arg0.field1181;
        this.field1193 = arg0.field1193;
        this.field1151 = arg1.field1151;
        this.field1140 = arg1.field1140;
        this.field1163 = arg1.field1163;
        this.field1162 = 1;
    }

    @ObfuscatedName("bg.m(Lbg;Lbg;I)V")
    public void method1067(class56 arg0, class56 arg1) {
        this.field1150 = arg0.field1150;
        this.field1152 = arg0.field1152;
        this.field1184 = arg0.field1184;
        this.field1158 = arg0.field1158;
        this.field1160 = arg0.field1160;
        this.field1156 = arg0.field1156;
        this.field1187 = arg0.field1187;
        this.field1154 = arg1.field1154;
        this.field1161 = arg1.field1161;
        this.field1181 = arg1.field1181;
        this.field1193 = arg1.field1193;
        this.field1151 = arg1.field1151;
        this.field1140 = arg1.field1140;
        this.field1162 = arg1.field1162;
        this.field1167 = arg1.field1167;
        this.field1168 = arg1.field1168;
        this.field1172 = arg1.field1172;
        this.field1170 = arg1.field1170;
        this.field1171 = arg1.field1171;
        this.field1174 = arg1.field1174;
        this.field1186 = arg1.field1186;
        this.field1176 = arg1.field1176;
        this.field1177 = arg1.field1177;
        this.field1178 = arg1.field1178;
        this.field1188 = arg1.field1188;
        this.field1165 = arg1.field1165;
        this.field1166 = new String[5];
        if (arg1.field1166 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field1166[var3] = arg1.field1166[var3];
            }
        }
        this.field1166[4] = class161.field2363;
        this.field1163 = 0;
    }

    @ObfuscatedName("bg.f(Lbg;Lbg;I)V")
    public void method1068(class56 arg0, class56 arg1) {
        this.field1150 = arg0.field1150;
        this.field1152 = arg0.field1152;
        this.field1184 = arg0.field1184;
        this.field1158 = arg0.field1158;
        this.field1160 = arg0.field1160;
        this.field1156 = arg0.field1156;
        this.field1187 = arg0.field1187;
        this.field1154 = arg0.field1154;
        this.field1161 = arg0.field1161;
        this.field1181 = arg0.field1181;
        this.field1193 = arg0.field1193;
        this.field1162 = arg0.field1162;
        this.field1151 = arg1.field1151;
        this.field1163 = 0;
        this.field1140 = false;
        this.field1189 = false;
    }

    @ObfuscatedName("bg.k(II)Lch;")
    public final class104 method1069(int arg0) {
        if (this.field1179 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1180[var3] && this.field1180[var3] != 0) {
                    var2 = this.field1179[var3];
                }
            }
            if (var2 != -1) {
                return method3201(var2).method1069(1);
            }
        }
        class104 var4 = class104.method2078(Statics.field1144, this.field1150, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field1183 != 128 || this.field1145 != 128 || this.field1185 != 128) {
            var4.method2092(this.field1183, this.field1145, this.field1185);
        }
        if (this.field1154 != null) {
            for (int var5 = 0; var5 < this.field1154.length; var5++) {
                var4.method2091(this.field1154[var5], this.field1161[var5]);
            }
        }
        if (this.field1181 != null) {
            for (int var6 = 0; var6 < this.field1181.length; var6++) {
                var4.method2128(this.field1181[var6], this.field1193[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("bg.h(IB)Lde;")
    public final class109 method1114(int arg0) {
        if (this.field1179 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1180[var3] && this.field1180[var3] != 0) {
                    var2 = this.field1179[var3];
                }
            }
            if (var2 != -1) {
                return method3201(var2).method1114(1);
            }
        }
        class109 var4 = (class109) field1146.method3523((long) this.field1149);
        if (var4 != null) {
            return var4;
        }
        class104 var5 = class104.method2078(Statics.field1144, this.field1150, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field1183 != 128 || this.field1145 != 128 || this.field1185 != 128) {
            var5.method2092(this.field1183, this.field1145, this.field1185);
        }
        if (this.field1154 != null) {
            for (int var6 = 0; var6 < this.field1154.length; var6++) {
                var5.method2091(this.field1154[var6], this.field1161[var6]);
            }
        }
        if (this.field1181 != null) {
            for (int var7 = 0; var7 < this.field1181.length; var7++) {
                var5.method2128(this.field1181[var7], this.field1193[var7]);
            }
        }
        class109 var8 = var5.method2097(this.field1194 + 64, this.field1169 + 768, -50, -10, -50);
        var8.field1865 = true;
        field1146.method3521(var8, (long) this.field1149);
        return var8;
    }

    @ObfuscatedName("bg.r(IS)Lbg;")
    public class56 method1071(int arg0) {
        if (this.field1179 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field1180[var3] && this.field1180[var3] != 0) {
                    var2 = this.field1179[var3];
                }
            }
            if (var2 != -1) {
                return method3201(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("x.w(IIIIIZI)Lca;")
    public static final class82 method538(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class82 var8 = (class82) field1147.method3523(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class56 var9 = method3201(arg0);
        if (arg1 > 1 && var9.field1179 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field1180[var11] && var9.field1180[var11] != 0) {
                    var10 = var9.field1179[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3201(var10);
            }
        }
        class109 var12 = var9.method1114(1);
        if (var12 == null) {
            return null;
        }
        class82 var13 = null;
        if (var9.field1182 != -1) {
            var13 = method538(var9.field1159, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1191 != -1) {
            var13 = method538(var9.field1190, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field1155 != -1) {
            var13 = method538(var9.field1192, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field1458;
        int var15 = Statics.field1452;
        int var16 = Statics.field1454;
        int[] var17 = new int[4];
        class83.method1781(var17);
        class82 var18 = new class82(36, 32);
        class83.method1717(var18.field1449, 36, 32);
        class83.method1787();
        class95.method1985();
        class95.method1993(16, 16);
        class95.field1633 = false;
        if (var9.field1155 != -1) {
            var13.method1632(0, 0);
        }
        int var19 = var9.field1152;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class95.field1632[var9.field1184] * var19 >> 16;
        int var21 = class95.field1622[var9.field1184] * var19 >> 16;
        var12.method2169();
        var12.method2181(0, var9.field1158, var9.field1160, var9.field1184, var9.field1156, var9.field1187 + var12.field1503 / 2 + var20, var9.field1187 + var21);
        if (var9.field1191 != -1) {
            var13.method1632(0, 0);
        }
        if (arg2 >= 1) {
            var18.method1618(1);
        }
        if (arg2 >= 2) {
            var18.method1618(16777215);
        }
        if (arg3 != 0) {
            var18.method1684(arg3);
        }
        class83.method1717(var18.field1449, 36, 32);
        if (var9.field1182 != -1) {
            var13.method1632(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field1162 == 1) {
            class228 var22 = Statics.field1153;
            String var23;
            if (arg1 < 100000) {
                var23 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var23 = "<col=ffffff>" + arg1 / 1000 + class161.field2518 + "</col>";
            } else {
                var23 = "<col=00ff80>" + arg1 / 1000000 + class161.field2388 + "</col>";
            }
            var22.method3812(var23, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field1147.method3521(var18, var6);
        }
        class83.method1717(var14, var15, var16);
        class83.method1712(var17);
        class95.method1985();
        class95.field1633 = true;
        return var18;
    }

    @ObfuscatedName("bg.u(ZB)Z")
    public final boolean method1072(boolean arg0) {
        int var2 = this.field1167;
        int var3 = this.field1168;
        int var4 = this.field1172;
        if (arg0) {
            var2 = this.field1170;
            var3 = this.field1171;
            var4 = this.field1174;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1144.method3071(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1144.method3071(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1144.method3071(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("bg.n(ZI)Lch;")
    public final class104 method1073(boolean arg0) {
        int var2 = this.field1167;
        int var3 = this.field1168;
        int var4 = this.field1172;
        if (arg0) {
            var2 = this.field1170;
            var3 = this.field1171;
            var4 = this.field1174;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var5 = class104.method2078(Statics.field1144, var2, 0);
        if (var3 != -1) {
            class104 var6 = class104.method2078(Statics.field1144, var3, 0);
            if (var4 == -1) {
                class104[] var9 = new class104[] { var5, var6 };
                var5 = new class104(var9, 2);
            } else {
                class104 var7 = class104.method2078(Statics.field1144, var4, 0);
                class104[] var8 = new class104[] { var5, var6, var7 };
                var5 = new class104(var8, 3);
            }
        }
        if (!arg0 && this.field1157 != 0) {
            var5.method2085(0, this.field1157, 0);
        }
        if (arg0 && this.field1175 != 0) {
            var5.method2085(0, this.field1175, 0);
        }
        if (this.field1154 != null) {
            for (int var10 = 0; var10 < this.field1154.length; var10++) {
                var5.method2091(this.field1154[var10], this.field1161[var10]);
            }
        }
        if (this.field1181 != null) {
            for (int var11 = 0; var11 < this.field1181.length; var11++) {
                var5.method2128(this.field1181[var11], this.field1193[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("bg.d(ZI)Z")
    public final boolean method1074(boolean arg0) {
        int var2 = this.field1186;
        int var3 = this.field1176;
        if (arg0) {
            var2 = this.field1177;
            var3 = this.field1178;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1144.method3071(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1144.method3071(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("bg.a(ZI)Lch;")
    public final class104 method1070(boolean arg0) {
        int var2 = this.field1186;
        int var3 = this.field1176;
        if (arg0) {
            var2 = this.field1177;
            var3 = this.field1178;
        }
        if (var2 == -1) {
            return null;
        }
        class104 var4 = class104.method2078(Statics.field1144, var2, 0);
        if (var3 != -1) {
            class104 var5 = class104.method2078(Statics.field1144, var3, 0);
            class104[] var6 = new class104[] { var4, var5 };
            var4 = new class104(var6, 2);
        }
        if (this.field1154 != null) {
            for (int var7 = 0; var7 < this.field1154.length; var7++) {
                var4.method2091(this.field1154[var7], this.field1161[var7]);
            }
        }
        if (this.field1181 != null) {
            for (int var8 = 0; var8 < this.field1181.length; var8++) {
                var4.method2128(this.field1181[var8], this.field1193[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("eb.q(I)V")
    public static void method2703() {
        field1147.method3522();
    }
}

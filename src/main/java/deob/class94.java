package deob;

@ObfuscatedName("dw")
public final class class94 extends class98 {

    @ObfuscatedName("dw.ab")
    public class572 field1138;

    @ObfuscatedName("dw.ay")
    public class358 field1111;

    @ObfuscatedName("dw.au")
    public int field1112 = -1;

    @ObfuscatedName("dw.ax")
    public int field1113 = -1;

    @ObfuscatedName("dw.am")
    public String[] field1127 = new String[3];

    @ObfuscatedName("dw.ac")
    public int field1116;

    @ObfuscatedName("dw.ae")
    public int field1117;

    @ObfuscatedName("dw.ad")
    public int field1137;

    @ObfuscatedName("dw.aq")
    public int field1119;

    @ObfuscatedName("dw.al")
    public int field1141;

    @ObfuscatedName("dw.aj")
    public int field1110;

    @ObfuscatedName("dw.as")
    public int field1122;

    @ObfuscatedName("dw.aw")
    public int field1118;

    @ObfuscatedName("dw.af")
    public class197 field1124;

    @ObfuscatedName("dw.aa")
    public int field1125;

    @ObfuscatedName("dw.ah")
    public int field1126;

    @ObfuscatedName("dw.ag")
    public int field1132;

    @ObfuscatedName("dw.av")
    public int field1128;

    @ObfuscatedName("dw.ar")
    public boolean field1115;

    @ObfuscatedName("dw.ap")
    public int field1120;

    @ObfuscatedName("dw.ak")
    public boolean field1131;

    @ObfuscatedName("dw.ai")
    public int field1130;

    @ObfuscatedName("dw.at")
    public int field1133;

    @ObfuscatedName("dw.az")
    public class477 field1134;

    @ObfuscatedName("dw.bg")
    public class477 field1135;

    @ObfuscatedName("dw.bz")
    public class477 field1136;

    @ObfuscatedName("dw.bj")
    public boolean field1129;

    @ObfuscatedName("dw.bc")
    public int field1123;

    @ObfuscatedName("dw.bo")
    public int field1139;

    @ObfuscatedName("dw.bm")
    public class102 field1140;

    @ObfuscatedName("dw.bd")
    public final int field1114;

    public class94() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1127[var1] = "";
        }
        this.field1116 = 0;
        this.field1117 = 0;
        this.field1119 = 0;
        this.field1141 = 0;
        this.field1115 = false;
        this.field1120 = 0;
        this.field1131 = false;
        this.field1134 = class477.field4943;
        this.field1135 = class477.field4943;
        this.field1136 = class477.field4943;
        this.field1129 = false;
        this.field1140 = Statics.field4799;
        this.field1114 = class547.field5372 < 224 ? 512 : 2048;
    }

    @ObfuscatedName("dw.as(Lvg;B)V")
    public final void method2361(class549 arg0) {
        arg0.field5378 = 0;
        byte var2 = arg0.method8798();
        boolean var3 = true;
        this.field1112 = arg0.method8798();
        this.field1113 = arg0.method8798();
        int var4 = -1;
        this.field1120 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < var5.length; var6++) {
            int var7 = arg0.method9025();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method9025();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8968();
                    break;
                }
                if (this.method2358(var5[var6])) {
                    int var9 = this.method2369(var5[var6]).field2840;
                    if (var9 != 0) {
                        this.field1120 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[12];
        for (int var11 = 0; var11 < var10.length; var11++) {
            int var12 = arg0.method9025();
            if (var12 == 0) {
                var10[var11] = 0;
            } else {
                int var13 = arg0.method9025();
                var10[var11] = (var12 << 8) + var13;
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < var14.length; var15++) {
            int var16 = arg0.method9025();
            if (var16 < 0 || var16 >= Statics.field2554[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1186 = arg0.method8968();
        if (this.field1186 == 65535) {
            this.field1186 = -1;
        }
        this.field1187 = arg0.method8968();
        if (this.field1187 == 65535) {
            this.field1187 = -1;
        }
        this.field1203 = this.field1187;
        this.field1239 = arg0.method8968();
        if (this.field1239 == 65535) {
            this.field1239 = -1;
        }
        this.field1190 = arg0.method8968();
        if (this.field1190 == 65535) {
            this.field1190 = -1;
        }
        this.field1191 = arg0.method8968();
        if (this.field1191 == 65535) {
            this.field1191 = -1;
        }
        this.field1192 = arg0.method8968();
        if (this.field1192 == 65535) {
            this.field1192 = -1;
        }
        this.field1194 = arg0.method8968();
        if (this.field1194 == 65535) {
            this.field1194 = -1;
        }
        this.field1138 = new class572(arg0.method8808(), Statics.field848);
        this.method2355();
        this.method2374();
        this.method2353();
        if (Statics.field2672 == this) {
            Statics.field5022 = this.field1138.method9470();
        }
        this.field1116 = arg0.method9025();
        this.field1117 = arg0.method8968();
        this.field1131 = arg0.method9025() == 1;
        if (client.field505 == 0 && client.field675 >= 2) {
            this.field1131 = false;
        }
        class227[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8968();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class227[12];
            for (int var21 = 0; var21 < var17.length; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    int var25 = var5[var21] - this.field1114;
                    int var26 = arg0.method9025();
                    boolean var27 = (var26 & 0x1) != 0;
                    boolean var28 = (var26 & 0x2) != 0;
                    class227 var29 = new class227(var25);
                    if (var27) {
                        int var30 = arg0.method9025();
                        int[] var31 = new int[] { var30 & 0xF, var30 >> 4 & 0xF };
                        boolean var32 = var29.field2429 != null && var29.field2429.length == var31.length;
                        for (int var33 = 0; var33 < 2; var33++) {
                            if (var31[var33] != 15) {
                                short var34 = (short) arg0.method8968();
                                if (var32) {
                                    var29.field2429[var31[var33]] = var34;
                                }
                            }
                        }
                    }
                    if (var28) {
                        int var35 = arg0.method9025();
                        int[] var36 = new int[] { var35 & 0xF, var35 >> 4 & 0xF };
                        boolean var37 = var29.field2431 != null && var29.field2431.length == var36.length;
                        for (int var38 = 0; var38 < 2; var38++) {
                            if (var36[var38] != 15) {
                                short var39 = (short) arg0.method8968();
                                if (var37) {
                                    var29.field2431[var36[var38]] = var39;
                                }
                            }
                        }
                    }
                    var17[var21] = var29;
                }
            }
        }
        for (int var41 = 0; var41 < 3; var41++) {
            this.field1127[var41] = arg0.method8808();
        }
        byte var42 = arg0.method8798();
        if (this.field1111 == null) {
            this.field1111 = new class358();
        }
        this.field1111.method5996(var10, var5, var17, var20, var14, var2, var4, var42);
    }

    @ObfuscatedName("dw.aw(I)Z")
    public boolean method2354() {
        if (class477.field4943 == this.field1134) {
            this.method2356();
        }
        return class477.field4939 == this.field1134;
    }

    @ObfuscatedName("dw.af(I)V")
    public void method2355() {
        this.field1134 = class477.field4943;
    }

    @ObfuscatedName("dw.aa(B)V")
    public void method2356() {
        this.field1134 = Statics.field3011.method1863(this.field1138) ? class477.field4939 : class477.field4941;
    }

    @ObfuscatedName("dw.ah(I)Z")
    public boolean method2363() {
        if (class477.field4943 == this.field1135) {
            this.method2407();
        }
        return class477.field4939 == this.field1135;
    }

    @ObfuscatedName("dw.ag(I)V")
    public void method2374() {
        this.field1135 = class477.field4943;
    }

    @ObfuscatedName("dw.av(I)V")
    public void method2407() {
        this.field1135 = Statics.field70 != null && Statics.field70.method8000(this.field1138) ? class477.field4939 : class477.field4941;
    }

    @ObfuscatedName("dw.ar(I)V")
    public void method2360() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field741[var1] != null && client.field741[var1].method3218(this.field1138.method9470()) != -1 && var1 != 2) {
                this.field1136 = class477.field4939;
                return;
            }
        }
        this.field1136 = class477.field4941;
    }

    @ObfuscatedName("dw.ap(I)V")
    public void method2353() {
        this.field1136 = class477.field4943;
    }

    @ObfuscatedName("dw.ak(I)Z")
    public boolean method2378() {
        if (class477.field4943 == this.field1136) {
            this.method2360();
        }
        return class477.field4939 == this.field1136;
    }

    @ObfuscatedName("dw.ai(I)I")
    public int method2352() {
        return this.field1111 == null || this.field1111.field3744 == -1 ? 1 : class246.method2916(this.field1111.field3744).field2571;
    }

    @ObfuscatedName("dw.ae(I)Lhr;")
    public final class197 method2088() {
        if (this.field1111 == null) {
            return null;
        }
        class264 var1 = this.field1257 != -1 && this.field1228 == 0 ? class264.method3551(this.field1257) : null;
        class264 var2 = this.field1208 == -1 || this.field1115 || this.field1208 == this.field1186 && var1 != null ? null : class264.method3551(this.field1208);
        class197 var3 = this.field1111.method6003(var1, this.field1226, var2, this.field1183);
        if (var3 == null) {
            return null;
        }
        var3.method3909();
        this.field1240 = var3.field2086;
        int var4 = var3.field2163;
        if (!this.field1115) {
            var3 = this.method2458(var3);
        }
        if (!this.field1115 && this.field1124 != null) {
            if (client.field519 >= this.field1141) {
                this.field1124 = null;
            }
            if (client.field519 >= this.field1119 && client.field519 < this.field1141) {
                class197 var5 = this.field1124;
                var5.method3924(this.field1110 - this.field1249, this.field1122 - this.field1137, this.field1118 - this.field1180);
                if (this.field1247 == 512) {
                    var5.method3920();
                    var5.method3920();
                    var5.method3920();
                } else if (this.field1247 == 1024) {
                    var5.method3920();
                    var5.method3920();
                } else if (this.field1247 == 1536) {
                    var5.method3920();
                }
                class197[] var6 = new class197[] { var3, var5 };
                var3 = new class197(var6, 2);
                if (this.field1247 == 512) {
                    var5.method3920();
                } else if (this.field1247 == 1024) {
                    var5.method3920();
                    var5.method3920();
                } else if (this.field1247 == 1536) {
                    var5.method3920();
                    var5.method3920();
                    var5.method3920();
                }
                var5.method3924(this.field1249 - this.field1110, this.field1137 - this.field1122, this.field1180 - this.field1118);
            }
        }
        var3.field2152 = true;
        if (this.field1221 == 0 || client.field519 < this.field1245 || client.field519 >= this.field1242) {
            var3.field2227 = 0;
        } else {
            var3.field2224 = this.field1243;
            var3.field2195 = this.field1244;
            var3.field2226 = this.field1241;
            var3.field2227 = this.field1221;
            var3.field2228 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("dw.at(Ldy;IILko;I)V")
    public final void method2365(class102 arg0, int arg1, int arg2, class275 arg3) {
        if (this.field1257 != -1 && class264.method3551(this.field1257).field2886 == 1) {
            this.field1257 = -1;
        }
        this.method2428();
        if (arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
            this.method2413(arg1, arg2);
        } else if (this.field1251[0] >= 0 && this.field1251[0] < 104 && this.field1181[0] >= 0 && this.field1181[0] < 104) {
            if (class275.field2985 == arg3) {
                client.method8062(arg0, this, arg1, arg2, class275.field2985);
            }
            this.method2411(arg1, arg2, arg3);
        } else {
            this.method2413(arg1, arg2);
        }
    }

    @ObfuscatedName("dw.az(IIB)V")
    public void method2413(int arg0, int arg1) {
        this.field1217 = 0;
        this.field1256 = 0;
        this.field1254 = 0;
        this.field1251[0] = arg0;
        this.field1181[0] = arg1;
        int var3 = this.method2352();
        this.field1249 = this.field1251[0] * 128 + var3 * 64;
        this.field1180 = this.field1181[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("dw.bg(IILko;B)V")
    public final void method2411(int arg0, int arg1, class275 arg2) {
        if (this.field1217 < 9) {
            this.field1217++;
        }
        for (int var4 = this.field1217; var4 > 0; var4--) {
            this.field1251[var4] = this.field1251[var4 - 1];
            this.field1181[var4] = this.field1181[var4 - 1];
            this.field1253[var4] = this.field1253[var4 - 1];
        }
        this.field1251[0] = arg0;
        this.field1181[0] = arg1;
        this.field1253[0] = arg2;
    }

    @ObfuscatedName("dw.bz(I)Z")
    public final boolean method2367() {
        return this.field1111 != null;
    }

    @ObfuscatedName("dw.bj(II)Z")
    public boolean method2358(int arg0) {
        return arg0 >= this.field1114;
    }

    @ObfuscatedName("dw.bc(II)Lkm;")
    public class262 method2369(int arg0) {
        return class262.method2385(arg0 - this.field1114);
    }
}

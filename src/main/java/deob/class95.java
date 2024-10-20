package deob;

@ObfuscatedName("dv")
public final class class95 extends class100 {

    @ObfuscatedName("dv.ap")
    public class581 field1141;

    @ObfuscatedName("dv.aw")
    public class359 field1136;

    @ObfuscatedName("dv.ak")
    public int field1137 = -1;

    @ObfuscatedName("dv.aj")
    public int field1157 = -1;

    @ObfuscatedName("dv.ay")
    public String[] field1140 = new String[3];

    @ObfuscatedName("dv.as")
    public int field1164;

    @ObfuscatedName("dv.ae")
    public int field1138;

    @ObfuscatedName("dv.am")
    public int field1160;

    @ObfuscatedName("dv.at")
    public int field1135;

    @ObfuscatedName("dv.au")
    public int field1145;

    @ObfuscatedName("dv.ao")
    public int field1139;

    @ObfuscatedName("dv.af")
    public int field1147;

    @ObfuscatedName("dv.ar")
    public int field1153;

    @ObfuscatedName("dv.ab")
    public class256 field1143;

    @ObfuscatedName("dv.az")
    public int field1150;

    @ObfuscatedName("dv.ag")
    public int field1151;

    @ObfuscatedName("dv.ad")
    public int field1152;

    @ObfuscatedName("dv.ac")
    public int field1144;

    @ObfuscatedName("dv.av")
    public boolean field1154;

    @ObfuscatedName("dv.ax")
    public int field1155;

    @ObfuscatedName("dv.aq")
    public boolean field1142;

    @ObfuscatedName("dv.al")
    public int field1148;

    @ObfuscatedName("dv.aa")
    public int field1162;

    @ObfuscatedName("dv.ah")
    public class480 field1159;

    @ObfuscatedName("dv.bh")
    public class480 field1156;

    @ObfuscatedName("dv.bj")
    public class480 field1161;

    @ObfuscatedName("dv.bv")
    public class104 field1146;

    @ObfuscatedName("dv.bx")
    public final int field1163;

    public class95() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1140[var1] = "";
        }
        this.field1164 = 0;
        this.field1138 = 0;
        this.field1135 = 0;
        this.field1145 = 0;
        this.field1154 = false;
        this.field1155 = 0;
        this.field1142 = false;
        this.field1159 = class480.field5026;
        this.field1156 = class480.field5026;
        this.field1161 = class480.field5026;
        this.field1146 = Statics.field2071;
        this.field1163 = class556.field5458 < 224 ? 512 : 2048;
    }

    @ObfuscatedName("dv.af(Lvl;S)V")
    public final void method2507(class558 arg0) {
        arg0.field5462 = 0;
        byte var2 = arg0.method9259();
        boolean var3 = true;
        this.field1137 = arg0.method9259();
        this.field1157 = arg0.method9259();
        int var4 = -1;
        this.field1155 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < var5.length; var6++) {
            int var7 = arg0.method9258();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method9258();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method9260();
                    break;
                }
                if (this.method2522(var5[var6])) {
                    int var9 = this.method2521(var5[var6]).field2281;
                    if (var9 != 0) {
                        this.field1155 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[12];
        for (int var11 = 0; var11 < var10.length; var11++) {
            int var12 = arg0.method9258();
            if (var12 == 0) {
                var10[var11] = 0;
            } else {
                int var13 = arg0.method9258();
                var10[var11] = (var12 << 8) + var13;
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < var14.length; var15++) {
            int var16 = arg0.method9258();
            if (var16 < 0 || var16 >= Statics.field1982[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1223 = arg0.method9260();
        if (this.field1223 == 65535) {
            this.field1223 = -1;
        }
        this.field1267 = arg0.method9260();
        if (this.field1267 == 65535) {
            this.field1267 = -1;
        }
        this.field1280 = this.field1267;
        this.field1226 = arg0.method9260();
        if (this.field1226 == 65535) {
            this.field1226 = -1;
        }
        this.field1227 = arg0.method9260();
        if (this.field1227 == 65535) {
            this.field1227 = -1;
        }
        this.field1228 = arg0.method9260();
        if (this.field1228 == 65535) {
            this.field1228 = -1;
        }
        this.field1265 = arg0.method9260();
        if (this.field1265 == 65535) {
            this.field1265 = -1;
        }
        this.field1266 = arg0.method9260();
        if (this.field1266 == 65535) {
            this.field1266 = -1;
        }
        this.field1141 = new class581(arg0.method9269(), Statics.field3276);
        this.method2509();
        this.method2512();
        this.method2515();
        if (Statics.field3772 == this) {
            Statics.field3309 = this.field1141.method9989();
        }
        this.field1164 = arg0.method9258();
        this.field1138 = arg0.method9260();
        this.field1142 = arg0.method9258() == 1;
        if (client.field530 == 0 && client.field674 >= 2) {
            this.field1142 = false;
        }
        class176[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method9260();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class176[12];
            for (int var21 = 0; var21 < var17.length; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    int var25 = var5[var21] - this.field1163;
                    int var26 = arg0.method9258();
                    boolean var27 = (var26 & 0x1) != 0;
                    boolean var28 = (var26 & 0x2) != 0;
                    boolean var29 = (var26 & 0x4) != 0;
                    boolean var30 = (var26 & 0x8) != 0;
                    class176 var31 = new class176(var25);
                    if (var27) {
                        int var32 = arg0.method9258();
                        int[] var33 = new int[] { var32 & 0xF, var32 >> 4 & 0xF };
                        boolean var34 = var31.field1873 != null && var31.field1873.length == var33.length;
                        for (int var35 = 0; var35 < 2; var35++) {
                            if (var33[var35] != 15) {
                                short var36 = (short) arg0.method9260();
                                if (var34) {
                                    var31.field1873[var33[var35]] = var36;
                                }
                            }
                        }
                    }
                    if (var28) {
                        int var37 = arg0.method9258();
                        int[] var38 = new int[] { var37 & 0xF, var37 >> 4 & 0xF };
                        boolean var39 = var31.field1872 != null && var31.field1872.length == var38.length;
                        for (int var40 = 0; var40 < 2; var40++) {
                            if (var38[var40] != 15) {
                                short var41 = (short) arg0.method9260();
                                if (var39) {
                                    var31.field1872[var38[var40]] = var41;
                                }
                            }
                        }
                    }
                    if (var29) {
                        var31.field1869 = arg0.method9260();
                        var31.field1874 = arg0.method9260();
                    }
                    if (var30) {
                        var31.field1875 = arg0.method9260();
                        var31.field1876 = arg0.method9260();
                    }
                    var17[var21] = var31;
                }
            }
        }
        for (int var43 = 0; var43 < 3; var43++) {
            this.field1140[var43] = arg0.method9269();
        }
        byte var44 = arg0.method9259();
        if (this.field1136 == null) {
            this.field1136 = new class359();
        }
        this.field1136.method6330(var10, var5, var17, var20, var14, var2, var4, var44);
    }

    @ObfuscatedName("dv.ar(S)Z")
    public boolean method2508() {
        if (class480.field5026 == this.field1159) {
            this.method2510();
        }
        return class480.field5028 == this.field1159;
    }

    @ObfuscatedName("dv.ab(I)V")
    public void method2509() {
        this.field1159 = class480.field5026;
    }

    @ObfuscatedName("dv.az(B)V")
    public void method2510() {
        this.field1159 = Statics.field1072.method1936(this.field1141) ? class480.field5028 : class480.field5027;
    }

    @ObfuscatedName("dv.ag(I)Z")
    public boolean method2511() {
        if (class480.field5026 == this.field1156) {
            this.method2513();
        }
        return class480.field5028 == this.field1156;
    }

    @ObfuscatedName("dv.ad(B)V")
    public void method2512() {
        this.field1156 = class480.field5026;
    }

    @ObfuscatedName("dv.ac(I)V")
    public void method2513() {
        this.field1156 = Statics.field1216 != null && Statics.field1216.method8358(this.field1141) ? class480.field5028 : class480.field5027;
    }

    @ObfuscatedName("dv.av(I)V")
    public void method2514() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field776[var1] != null && client.field776[var1].method3489(this.field1141.method9989()) != -1 && var1 != 2) {
                this.field1161 = class480.field5028;
                return;
            }
        }
        this.field1161 = class480.field5027;
    }

    @ObfuscatedName("dv.ax(I)V")
    public void method2515() {
        this.field1161 = class480.field5026;
    }

    @ObfuscatedName("dv.aq(B)Z")
    public boolean method2516() {
        if (class480.field5026 == this.field1161) {
            this.method2514();
        }
        return class480.field5028 == this.field1161;
    }

    @ObfuscatedName("dv.al(B)I")
    public int method2530() {
        return this.field1136 == null || this.field1136.field3832 == -1 ? 1 : class195.method8497(this.field1136.field3832).field2014;
    }

    @ObfuscatedName("dv.au(I)Ljy;")
    public final class256 method2245() {
        if (this.field1136 == null) {
            return null;
        }
        class213 var1 = this.field1275 != -1 && this.field1235 == 0 ? class213.method6692(this.field1275) : null;
        class213 var2 = this.field1217 == -1 || this.field1154 || this.field1223 == this.field1217 && var1 != null ? null : class213.method6692(this.field1217);
        class256 var3 = this.field1136.method6338(var1, this.field1263, var2, this.field1236);
        if (var3 == null) {
            return null;
        }
        var3.method5013();
        this.field1294 = var3.field2745;
        int var4 = var3.field2822;
        if (!this.field1154) {
            var3 = this.method2632(var3);
        }
        if (!this.field1154 && this.field1143 != null) {
            if (client.field518 >= this.field1145) {
                this.field1143 = null;
            }
            if (client.field518 >= this.field1135 && client.field518 < this.field1145) {
                class256 var5 = this.field1143;
                var5.method5016(this.field1139 - this.field1247, this.field1147 - this.field1160, this.field1153 - this.field1270);
                if (this.field1284 == 512) {
                    var5.method5073();
                    var5.method5073();
                    var5.method5073();
                } else if (this.field1284 == 1024) {
                    var5.method5073();
                    var5.method5073();
                } else if (this.field1284 == 1536) {
                    var5.method5073();
                }
                class256[] var6 = new class256[] { var3, var5 };
                var3 = new class256(var6, 2);
                if (this.field1284 == 512) {
                    var5.method5073();
                } else if (this.field1284 == 1024) {
                    var5.method5073();
                    var5.method5073();
                } else if (this.field1284 == 1536) {
                    var5.method5073();
                    var5.method5073();
                    var5.method5073();
                }
                var5.method5016(this.field1247 - this.field1139, this.field1160 - this.field1147, this.field1270 - this.field1153);
            }
        }
        var3.field2842 = true;
        if (this.field1283 == 0 || client.field518 < this.field1278 || client.field518 >= this.field1279) {
            var3.field2850 = 0;
        } else {
            var3.field2883 = this.field1277;
            var3.field2834 = this.field1281;
            var3.field2828 = this.field1282;
            var3.field2850 = this.field1283;
            var3.field2887 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("dv.aa(Ldn;IILkk;B)V")
    public final void method2518(class104 arg0, int arg1, int arg2, class276 arg3) {
        if (this.field1275 != -1 && class213.method6692(this.field1275).field2328 == 1) {
            this.field1275 = -1;
        }
        this.method2628();
        if (arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
            this.method2523(arg1, arg2);
        } else if (this.field1288[0] >= 0 && this.field1288[0] < 104 && this.field1234[0] >= 0 && this.field1234[0] < 104) {
            if (class276.field3058 == arg3) {
                client.method3864(arg0, this, arg1, arg2, class276.field3058);
            }
            this.method2520(arg1, arg2, arg3);
        } else {
            this.method2523(arg1, arg2);
        }
    }

    @ObfuscatedName("dv.ah(IIB)V")
    public void method2523(int arg0, int arg1) {
        this.field1256 = 0;
        this.field1292 = 0;
        this.field1264 = 0;
        this.field1288[0] = arg0;
        this.field1234[0] = arg1;
        int var3 = this.method2530();
        this.field1247 = this.field1288[0] * 128 + var3 * 64;
        this.field1270 = this.field1234[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("dv.bh(IILkk;B)V")
    public final void method2520(int arg0, int arg1, class276 arg2) {
        if (this.field1256 < 9) {
            this.field1256++;
        }
        for (int var4 = this.field1256; var4 > 0; var4--) {
            this.field1288[var4] = this.field1288[var4 - 1];
            this.field1234[var4] = this.field1234[var4 - 1];
            this.field1230[var4] = this.field1230[var4 - 1];
        }
        this.field1288[0] = arg0;
        this.field1234[0] = arg1;
        this.field1230[0] = arg2;
    }

    @ObfuscatedName("dv.bj(I)Z")
    public final boolean method2526() {
        return this.field1136 != null;
    }

    @ObfuscatedName("dv.bv(IS)Z")
    public boolean method2522(int arg0) {
        return arg0 >= this.field1163;
    }

    @ObfuscatedName("dv.bx(IB)Lip;")
    public class211 method2521(int arg0) {
        return class211.method7530(arg0 - this.field1163);
    }
}

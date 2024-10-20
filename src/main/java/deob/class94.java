package deob;

@ObfuscatedName("db")
public final class class94 extends class98 {

    @ObfuscatedName("db.aq")
    public class569 field1137;

    @ObfuscatedName("db.ad")
    public class356 field1147;

    @ObfuscatedName("db.ag")
    public int field1121 = -1;

    @ObfuscatedName("db.ak")
    public int field1138 = -1;

    @ObfuscatedName("db.aj")
    public String[] field1123 = new String[3];

    @ObfuscatedName("db.av")
    public int field1122;

    @ObfuscatedName("db.ab")
    public int field1125;

    @ObfuscatedName("db.ai")
    public int field1124;

    @ObfuscatedName("db.ae")
    public int field1120;

    @ObfuscatedName("db.au")
    public int field1119;

    @ObfuscatedName("db.ah")
    public int field1129;

    @ObfuscatedName("db.az")
    public int field1130;

    @ObfuscatedName("db.ax")
    public int field1131;

    @ObfuscatedName("db.ac")
    public class294 field1132;

    @ObfuscatedName("db.al")
    public int field1133;

    @ObfuscatedName("db.ay")
    public int field1127;

    @ObfuscatedName("db.ao")
    public int field1135;

    @ObfuscatedName("db.aa")
    public int field1140;

    @ObfuscatedName("db.as")
    public boolean field1126;

    @ObfuscatedName("db.aw")
    public int field1144;

    @ObfuscatedName("db.at")
    public boolean field1139;

    @ObfuscatedName("db.af")
    public int field1128;

    @ObfuscatedName("db.am")
    public int field1141;

    @ObfuscatedName("db.ar")
    public class476 field1142;

    @ObfuscatedName("db.bt")
    public class476 field1143;

    @ObfuscatedName("db.bj")
    public class476 field1134;

    @ObfuscatedName("db.be")
    public boolean field1145;

    @ObfuscatedName("db.bm")
    public int field1136;

    @ObfuscatedName("db.bo")
    public int field1146;

    @ObfuscatedName("db.bi")
    public class102 field1148;

    public class94() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1123[var1] = "";
        }
        this.field1122 = 0;
        this.field1125 = 0;
        this.field1120 = 0;
        this.field1119 = 0;
        this.field1126 = false;
        this.field1144 = 0;
        this.field1139 = false;
        this.field1142 = class476.field4959;
        this.field1143 = class476.field4959;
        this.field1134 = class476.field4959;
        this.field1145 = false;
        this.field1148 = Statics.field5138;
    }

    @ObfuscatedName("db.al(Lvp;I)V")
    public final void method2310(class547 arg0) {
        arg0.field5363 = 0;
        byte var2 = arg0.method8857();
        boolean var3 = true;
        this.field1121 = arg0.method8857();
        this.field1138 = arg0.method8857();
        int var4 = -1;
        this.field1144 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method8804();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8804();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8899();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class208.method3193(var5[var6] - 512).field2258;
                    if (var9 != 0) {
                        this.field1144 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[12];
        for (int var11 = 0; var11 < 12; var11++) {
            int var12 = arg0.method8804();
            if (var12 == 0) {
                var10[var11] = 0;
            } else {
                int var13 = arg0.method8804();
                var10[var11] = (var12 << 8) + var13;
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg0.method8804();
            if (var16 < 0 || var16 >= Statics.field1372[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1197 = arg0.method8899();
        if (this.field1197 == 65535) {
            this.field1197 = -1;
        }
        this.field1198 = arg0.method8899();
        if (this.field1198 == 65535) {
            this.field1198 = -1;
        }
        this.field1208 = this.field1198;
        this.field1200 = arg0.method8899();
        if (this.field1200 == 65535) {
            this.field1200 = -1;
        }
        this.field1201 = arg0.method8899();
        if (this.field1201 == 65535) {
            this.field1201 = -1;
        }
        this.field1202 = arg0.method8899();
        if (this.field1202 == 65535) {
            this.field1202 = -1;
        }
        this.field1223 = arg0.method8899();
        if (this.field1223 == 65535) {
            this.field1223 = -1;
        }
        this.field1204 = arg0.method8899();
        if (this.field1204 == 65535) {
            this.field1204 = -1;
        }
        this.field1137 = new class569(arg0.method8739(), Statics.field992);
        this.method2297();
        this.method2344();
        this.method2303();
        if (Statics.field297 == this) {
            Statics.field5519 = this.field1137.method9347();
        }
        this.field1122 = arg0.method8804();
        this.field1125 = arg0.method8899();
        this.field1139 = arg0.method8804() == 1;
        if (client.field502 == 0 && client.field680 >= 2) {
            this.field1139 = false;
        }
        class173[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8899();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class173[12];
            for (int var21 = 0; var21 < 12; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    var17[var21] = class173.method3890(var5[var21] - 512, arg0);
                }
            }
        }
        for (int var23 = 0; var23 < 3; var23++) {
            this.field1123[var23] = arg0.method8739();
        }
        byte var24 = arg0.method8857();
        if (this.field1147 == null) {
            this.field1147 = new class356();
        }
        this.field1147.method5948(var10, var5, var17, var20, var14, var2, var4, var24);
    }

    @ObfuscatedName("db.ay(S)Z")
    public boolean method2296() {
        if (class476.field4959 == this.field1142) {
            this.method2316();
        }
        return class476.field4960 == this.field1142;
    }

    @ObfuscatedName("db.ao(B)V")
    public void method2297() {
        this.field1142 = class476.field4959;
    }

    @ObfuscatedName("db.aa(I)V")
    public void method2316() {
        this.field1142 = Statics.field1599.method1852(this.field1137) ? class476.field4960 : class476.field4961;
    }

    @ObfuscatedName("db.as(I)Z")
    public boolean method2299() {
        if (class476.field4959 == this.field1143) {
            this.method2350();
        }
        return class476.field4960 == this.field1143;
    }

    @ObfuscatedName("db.aw(I)V")
    public void method2344() {
        this.field1143 = class476.field4959;
    }

    @ObfuscatedName("db.at(I)V")
    public void method2350() {
        this.field1143 = Statics.field382 != null && Statics.field382.method7869(this.field1137) ? class476.field4960 : class476.field4961;
    }

    @ObfuscatedName("db.af(I)V")
    public void method2345() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field746[var1] != null && client.field746[var1].method3177(this.field1137.method9347()) != -1 && var1 != 2) {
                this.field1134 = class476.field4960;
                return;
            }
        }
        this.field1134 = class476.field4961;
    }

    @ObfuscatedName("db.am(B)V")
    public void method2303() {
        this.field1134 = class476.field4959;
    }

    @ObfuscatedName("db.ar(I)Z")
    public boolean method2304() {
        if (class476.field4959 == this.field1134) {
            this.method2345();
        }
        return class476.field4960 == this.field1134;
    }

    @ObfuscatedName("db.bt(I)I")
    public int method2305() {
        return this.field1147 == null || this.field1147.field3777 == -1 ? 1 : class193.method2064(this.field1147.field3777).field1991;
    }

    @ObfuscatedName("db.ah(I)Llv;")
    public final class294 method2050() {
        if (this.field1147 == null) {
            return null;
        }
        class210 var1 = this.field1236 != -1 && this.field1239 == 0 ? class210.method5910(this.field1236) : null;
        class210 var2 = this.field1199 == -1 || this.field1126 || this.field1199 == this.field1197 && var1 != null ? null : class210.method5910(this.field1199);
        class294 var3 = this.field1147.method5923(var1, this.field1237, var2, this.field1233);
        if (var3 == null) {
            return null;
        }
        var3.method5249();
        this.field1251 = var3.field3016;
        int var4 = var3.field3092;
        if (!this.field1126) {
            var3 = this.method2363(var3);
        }
        if (!this.field1126 && this.field1132 != null) {
            if (client.field516 >= this.field1119) {
                this.field1132 = null;
            }
            if (client.field516 >= this.field1120 && client.field516 < this.field1119) {
                class294 var5 = this.field1132;
                var5.method5264(this.field1129 - this.field1229, this.field1130 - this.field1124, this.field1131 - this.field1192);
                if (this.field1258 == 512) {
                    var5.method5261();
                    var5.method5261();
                    var5.method5261();
                } else if (this.field1258 == 1024) {
                    var5.method5261();
                    var5.method5261();
                } else if (this.field1258 == 1536) {
                    var5.method5261();
                }
                class294[] var6 = new class294[] { var3, var5 };
                var3 = new class294(var6, 2);
                if (this.field1258 == 512) {
                    var5.method5261();
                } else if (this.field1258 == 1024) {
                    var5.method5261();
                    var5.method5261();
                } else if (this.field1258 == 1536) {
                    var5.method5261();
                    var5.method5261();
                    var5.method5261();
                }
                var5.method5264(this.field1229 - this.field1129, this.field1124 - this.field1130, this.field1192 - this.field1131);
            }
        }
        var3.field3149 = true;
        if (this.field1240 == 0 || client.field516 < this.field1252 || client.field516 >= this.field1216) {
            var3.field3123 = 0;
        } else {
            var3.field3153 = this.field1224;
            var3.field3107 = this.field1255;
            var3.field3155 = this.field1256;
            var3.field3123 = this.field1240;
            var3.field3157 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("db.bj(Lde;IILjb;B)V")
    public final void method2325(class102 arg0, int arg1, int arg2, class239 arg3) {
        if (this.field1236 != -1 && class210.method5910(this.field1236).field2284 == 1) {
            this.field1236 = -1;
        }
        this.method2370();
        if (arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
            this.method2307(arg1, arg2);
        } else if (this.field1205[0] >= 0 && this.field1205[0] < 104 && this.field1247[0] >= 0 && this.field1247[0] < 104) {
            if (class239.field2510 == arg3) {
                class94 var5 = this;
                class239 var6 = class239.field2510;
                int var7 = this.field1205[0];
                int var8 = this.field1247[0];
                int var9 = this.method2305();
                if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && arg1 >= var9 && arg1 < 104 - var9 && arg2 >= var9 && arg2 < 104 - var9) {
                    int var10 = client.field521.method4152(var7, var8, this.method2305(), client.method7658(arg1, arg2), arg0.field1318[this.field1128], true, client.field642, client.field672);
                    if (var10 >= 1) {
                        for (int var11 = 0; var11 < var10 - 1; var11++) {
                            var5.method2308(client.field642[var11], client.field672[var11], var6);
                        }
                    }
                }
            }
            this.method2308(arg1, arg2, arg3);
        } else {
            this.method2307(arg1, arg2);
        }
    }

    @ObfuscatedName("db.be(IIB)V")
    public void method2307(int arg0, int arg1) {
        this.field1230 = 0;
        this.field1266 = 0;
        this.field1265 = 0;
        this.field1205[0] = arg0;
        this.field1247[0] = arg1;
        int var3 = this.method2305();
        this.field1229 = this.field1205[0] * 128 + var3 * 64;
        this.field1192 = this.field1247[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("db.bm(IILjb;B)V")
    public final void method2308(int arg0, int arg1, class239 arg2) {
        if (this.field1230 < 9) {
            this.field1230++;
        }
        for (int var4 = this.field1230; var4 > 0; var4--) {
            this.field1205[var4] = this.field1205[var4 - 1];
            this.field1247[var4] = this.field1247[var4 - 1];
            this.field1264[var4] = this.field1264[var4 - 1];
        }
        this.field1205[0] = arg0;
        this.field1247[0] = arg1;
        this.field1264[0] = arg2;
    }

    @ObfuscatedName("db.bo(I)Z")
    public final boolean method2309() {
        return this.field1147 != null;
    }
}

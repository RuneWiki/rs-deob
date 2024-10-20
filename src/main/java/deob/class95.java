package deob;

@ObfuscatedName("di")
public final class class95 extends class100 {

    @ObfuscatedName("di.ac")
    public class574 field1168;

    @ObfuscatedName("di.ae")
    public class360 field1170;

    @ObfuscatedName("di.ag")
    public int field1144 = -1;

    @ObfuscatedName("di.am")
    public int field1145 = -1;

    @ObfuscatedName("di.aq")
    public String[] field1147 = new String[3];

    @ObfuscatedName("di.af")
    public int field1148;

    @ObfuscatedName("di.at")
    public int field1149;

    @ObfuscatedName("di.au")
    public int field1150;

    @ObfuscatedName("di.ar")
    public int field1164;

    @ObfuscatedName("di.al")
    public int field1152;

    @ObfuscatedName("di.ad")
    public int field1153;

    @ObfuscatedName("di.ah")
    public int field1154;

    @ObfuscatedName("di.ap")
    public int field1151;

    @ObfuscatedName("di.ab")
    public class256 field1156;

    @ObfuscatedName("di.az")
    public int field1157;

    @ObfuscatedName("di.aa")
    public int field1158;

    @ObfuscatedName("di.ai")
    public int field1159;

    @ObfuscatedName("di.ao")
    public int field1173;

    @ObfuscatedName("di.as")
    public boolean field1142;

    @ObfuscatedName("di.ay")
    public int field1162;

    @ObfuscatedName("di.aj")
    public boolean field1163;

    @ObfuscatedName("di.av")
    public int field1167;

    @ObfuscatedName("di.aw")
    public int field1143;

    @ObfuscatedName("di.ak")
    public class479 field1166;

    @ObfuscatedName("di.bn")
    public class479 field1161;

    @ObfuscatedName("di.bh")
    public class479 field1160;

    @ObfuscatedName("di.bd")
    public class104 field1169;

    @ObfuscatedName("di.bx")
    public final int field1155;

    public class95() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1147[var1] = "";
        }
        this.field1148 = 0;
        this.field1149 = 0;
        this.field1164 = 0;
        this.field1152 = 0;
        this.field1142 = false;
        this.field1162 = 0;
        this.field1163 = false;
        this.field1166 = class479.field5002;
        this.field1161 = class479.field5002;
        this.field1160 = class479.field5002;
        this.field1169 = Statics.field1342;
        this.field1155 = class549.field5408 < 224 ? 512 : 2048;
    }

    @ObfuscatedName("di.az(Lvf;I)V")
    public final void method2465(class551 arg0) {
        arg0.field5415 = 0;
        byte var2 = arg0.method8975();
        boolean var3 = true;
        this.field1144 = arg0.method8975();
        this.field1145 = arg0.method8975();
        int var4 = -1;
        this.field1162 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < var5.length; var6++) {
            int var7 = arg0.method8955();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8955();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method9119();
                    break;
                }
                if (this.method2431(var5[var6])) {
                    int var9 = this.method2445(var5[var6]).field2272;
                    if (var9 != 0) {
                        this.field1162 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[12];
        for (int var11 = 0; var11 < var10.length; var11++) {
            int var12 = arg0.method8955();
            if (var12 == 0) {
                var10[var11] = 0;
            } else {
                int var13 = arg0.method8955();
                var10[var11] = (var12 << 8) + var13;
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < var14.length; var15++) {
            int var16 = arg0.method8955();
            if (var16 < 0 || var16 >= Statics.field2770[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1230 = arg0.method9119();
        if (this.field1230 == 65535) {
            this.field1230 = -1;
        }
        this.field1231 = arg0.method9119();
        if (this.field1231 == 65535) {
            this.field1231 = -1;
        }
        this.field1246 = this.field1231;
        this.field1272 = arg0.method9119();
        if (this.field1272 == 65535) {
            this.field1272 = -1;
        }
        this.field1279 = arg0.method9119();
        if (this.field1279 == 65535) {
            this.field1279 = -1;
        }
        this.field1235 = arg0.method9119();
        if (this.field1235 == 65535) {
            this.field1235 = -1;
        }
        this.field1236 = arg0.method9119();
        if (this.field1236 == 65535) {
            this.field1236 = -1;
        }
        this.field1278 = arg0.method9119();
        if (this.field1278 == 65535) {
            this.field1278 = -1;
        }
        this.field1168 = new class574(arg0.method9166(), Statics.field127);
        this.method2468();
        this.method2434();
        this.method2437();
        if (Statics.field4826 == this) {
            Statics.field4792 = this.field1168.method9621();
        }
        this.field1148 = arg0.method8955();
        this.field1149 = arg0.method9119();
        this.field1163 = arg0.method8955() == 1;
        if (client.field518 == 0 && client.field689 >= 2) {
            this.field1163 = false;
        }
        class176[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method9119();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class176[12];
            for (int var21 = 0; var21 < var17.length; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    int var25 = var5[var21] - this.field1155;
                    int var26 = arg0.method8955();
                    boolean var27 = (var26 & 0x1) != 0;
                    boolean var28 = (var26 & 0x2) != 0;
                    class176 var29 = new class176(var25);
                    if (var27) {
                        int var30 = arg0.method8955();
                        int[] var31 = new int[] { var30 & 0xF, var30 >> 4 & 0xF };
                        boolean var32 = var29.field1867 != null && var29.field1867.length == var31.length;
                        for (int var33 = 0; var33 < 2; var33++) {
                            if (var31[var33] != 15) {
                                short var34 = (short) arg0.method9119();
                                if (var32) {
                                    var29.field1867[var31[var33]] = var34;
                                }
                            }
                        }
                    }
                    if (var28) {
                        int var35 = arg0.method8955();
                        int[] var36 = new int[] { var35 & 0xF, var35 >> 4 & 0xF };
                        boolean var37 = var29.field1868 != null && var29.field1868.length == var36.length;
                        for (int var38 = 0; var38 < 2; var38++) {
                            if (var36[var38] != 15) {
                                short var39 = (short) arg0.method9119();
                                if (var37) {
                                    var29.field1868[var36[var38]] = var39;
                                }
                            }
                        }
                    }
                    var17[var21] = var29;
                }
            }
        }
        for (int var41 = 0; var41 < 3; var41++) {
            this.field1147[var41] = arg0.method9166();
        }
        byte var42 = arg0.method8975();
        if (this.field1170 == null) {
            this.field1170 = new class360();
        }
        this.field1170.method6202(var10, var5, var17, var20, var14, var2, var4, var42);
    }

    @ObfuscatedName("di.aa(S)Z")
    public boolean method2444() {
        if (class479.field5002 == this.field1166) {
            this.method2432();
        }
        return class479.field5003 == this.field1166;
    }

    @ObfuscatedName("di.ai(I)V")
    public void method2468() {
        this.field1166 = class479.field5002;
    }

    @ObfuscatedName("di.ao(I)V")
    public void method2432() {
        this.field1166 = Statics.field4723.method1910(this.field1168) ? class479.field5003 : class479.field5005;
    }

    @ObfuscatedName("di.as(I)Z")
    public boolean method2433() {
        if (class479.field5002 == this.field1161) {
            this.method2435();
        }
        return class479.field5003 == this.field1161;
    }

    @ObfuscatedName("di.ay(B)V")
    public void method2434() {
        this.field1161 = class479.field5002;
    }

    @ObfuscatedName("di.aj(B)V")
    public void method2435() {
        this.field1161 = Statics.field1824 != null && Statics.field1824.method8154(this.field1168) ? class479.field5003 : class479.field5005;
    }

    @ObfuscatedName("di.av(I)V")
    public void method2470() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field755[var1] != null && client.field755[var1].method3330(this.field1168.method9621()) != -1 && var1 != 2) {
                this.field1160 = class479.field5003;
                return;
            }
        }
        this.field1160 = class479.field5005;
    }

    @ObfuscatedName("di.aw(I)V")
    public void method2437() {
        this.field1160 = class479.field5002;
    }

    @ObfuscatedName("di.an(I)Z")
    public boolean method2438() {
        if (class479.field5002 == this.field1160) {
            this.method2470();
        }
        return class479.field5003 == this.field1160;
    }

    @ObfuscatedName("di.ak(I)I")
    public int method2478() {
        return this.field1170 == null || this.field1170.field3797 == -1 ? 1 : class195.method3383(this.field1170.field3797).field2010;
    }

    @ObfuscatedName("di.ad(B)Ljm;")
    public final class256 method2182() {
        if (this.field1170 == null) {
            return null;
        }
        class213 var1 = this.field1269 != -1 && this.field1282 == 0 ? class213.method2555(this.field1269) : null;
        class213 var2 = this.field1265 == -1 || this.field1142 || this.field1265 == this.field1230 && var1 != null ? null : class213.method2555(this.field1265);
        class256 var3 = this.field1170.method6177(var1, this.field1270, var2, this.field1266);
        if (var3 == null) {
            return null;
        }
        var3.method4814();
        this.field1284 = var3.field2736;
        int var4 = var3.field2807;
        if (!this.field1142) {
            var3 = this.method2524(var3);
        }
        if (!this.field1142 && this.field1156 != null) {
            if (client.field609 >= this.field1152) {
                this.field1156 = null;
            }
            if (client.field609 >= this.field1164 && client.field609 < this.field1152) {
                class256 var5 = this.field1156;
                var5.method4828(this.field1153 - this.field1300, this.field1154 - this.field1150, this.field1151 - this.field1225);
                if (this.field1243 == 512) {
                    var5.method4805();
                    var5.method4805();
                    var5.method4805();
                } else if (this.field1243 == 1024) {
                    var5.method4805();
                    var5.method4805();
                } else if (this.field1243 == 1536) {
                    var5.method4805();
                }
                class256[] var6 = new class256[] { var3, var5 };
                var3 = new class256(var6, 2);
                if (this.field1243 == 512) {
                    var5.method4805();
                } else if (this.field1243 == 1024) {
                    var5.method4805();
                    var5.method4805();
                } else if (this.field1243 == 1536) {
                    var5.method4805();
                    var5.method4805();
                    var5.method4805();
                }
                var5.method4828(this.field1300 - this.field1153, this.field1150 - this.field1154, this.field1225 - this.field1151);
            }
        }
        var3.field2797 = true;
        if (this.field1286 == 0 || client.field609 < this.field1285 || client.field609 >= this.field1259) {
            var3.field2806 = 0;
        } else {
            var3.field2829 = this.field1260;
            var3.field2833 = this.field1288;
            var3.field2827 = this.field1289;
            var3.field2806 = this.field1286;
            var3.field2835 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("di.bn(Ldd;IILkk;I)V")
    public final void method2440(class104 arg0, int arg1, int arg2, class277 arg3) {
        if (this.field1269 != -1 && class213.method2555(this.field1269).field2328 == 1) {
            this.field1269 = -1;
        }
        this.method2538();
        if (arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
            this.method2449(arg1, arg2);
        } else if (this.field1295[0] >= 0 && this.field1295[0] < 104 && this.field1296[0] >= 0 && this.field1296[0] < 104) {
            if (class277.field3040 == arg3) {
                class95 var5 = this;
                class277 var6 = class277.field3040;
                int var7 = this.field1295[0];
                int var8 = this.field1296[0];
                int var9 = this.method2478();
                class271 var10 = arg0.field1352[this.field1167];
                if (var7 >= var9 && var7 < var10.field2997 - var9 && var8 >= var9 && var8 < var10.field3003 - var9 && arg1 >= var9 && arg1 < var10.field2997 - var9 && arg2 >= var9 && arg2 < var10.field3003 - var9) {
                    int var11 = client.field811.method5199(var7, var8, this.method2478(), client.method3384(arg1, arg2), var10, true, client.field692, client.field818);
                    if (var11 >= 1) {
                        for (int var12 = 0; var12 < var11 - 1; var12++) {
                            var5.method2479(client.field692[var12], client.field818[var12], var6);
                        }
                    }
                }
            }
            this.method2479(arg1, arg2, arg3);
        } else {
            this.method2449(arg1, arg2);
        }
    }

    @ObfuscatedName("di.bh(IIS)V")
    public void method2449(int arg0, int arg1) {
        this.field1294 = 0;
        this.field1299 = 0;
        this.field1291 = 0;
        this.field1295[0] = arg0;
        this.field1296[0] = arg1;
        int var3 = this.method2478();
        this.field1300 = this.field1295[0] * 128 + var3 * 64;
        this.field1225 = this.field1296[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("di.bd(IILkk;B)V")
    public final void method2479(int arg0, int arg1, class277 arg2) {
        if (this.field1294 < 9) {
            this.field1294++;
        }
        for (int var4 = this.field1294; var4 > 0; var4--) {
            this.field1295[var4] = this.field1295[var4 - 1];
            this.field1296[var4] = this.field1296[var4 - 1];
            this.field1290[var4] = this.field1290[var4 - 1];
        }
        this.field1295[0] = arg0;
        this.field1296[0] = arg1;
        this.field1290[0] = arg2;
    }

    @ObfuscatedName("di.bx(I)Z")
    public final boolean method2443() {
        return this.field1170 != null;
    }

    @ObfuscatedName("di.bf(II)Z")
    public boolean method2431(int arg0) {
        return arg0 >= this.field1155;
    }

    @ObfuscatedName("di.bm(II)Lis;")
    public class211 method2445(int arg0) {
        return class211.method2414(arg0 - this.field1155);
    }
}

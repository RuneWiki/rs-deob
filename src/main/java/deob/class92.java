package deob;

@ObfuscatedName("dn")
public final class class92 extends class96 {

    @ObfuscatedName("dn.am")
    public class554 field1117;

    @ObfuscatedName("dn.ap")
    public class344 field1099;

    @ObfuscatedName("dn.af")
    public int field1100 = -1;

    @ObfuscatedName("dn.aj")
    public int field1101 = -1;

    @ObfuscatedName("dn.ar")
    public String[] field1103 = new String[3];

    @ObfuscatedName("dn.ag")
    public int field1104;

    @ObfuscatedName("dn.ao")
    public int field1107;

    @ObfuscatedName("dn.ae")
    public int field1106;

    @ObfuscatedName("dn.aa")
    public int field1098;

    @ObfuscatedName("dn.au")
    public int field1108;

    @ObfuscatedName("dn.ad")
    public int field1109;

    @ObfuscatedName("dn.ax")
    public int field1110;

    @ObfuscatedName("dn.aw")
    public int field1121;

    @ObfuscatedName("dn.az")
    public class283 field1112;

    @ObfuscatedName("dn.av")
    public int field1113;

    @ObfuscatedName("dn.ak")
    public int field1105;

    @ObfuscatedName("dn.ay")
    public int field1115;

    @ObfuscatedName("dn.as")
    public int field1116;

    @ObfuscatedName("dn.ab")
    public boolean field1126;

    @ObfuscatedName("dn.ah")
    public int field1118;

    @ObfuscatedName("dn.ai")
    public boolean field1119;

    @ObfuscatedName("dn.ac")
    public int field1111;

    @ObfuscatedName("dn.al")
    public int field1120;

    @ObfuscatedName("dn.at")
    public class454 field1122;

    @ObfuscatedName("dn.bj")
    public class454 field1123;

    @ObfuscatedName("dn.bd")
    public class454 field1124;

    @ObfuscatedName("dn.bg")
    public boolean field1125;

    @ObfuscatedName("dn.bt")
    public int field1114;

    @ObfuscatedName("dn.br")
    public int field1127;

    public class92() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1103[var1] = "";
        }
        this.field1104 = 0;
        this.field1107 = 0;
        this.field1098 = 0;
        this.field1108 = 0;
        this.field1126 = false;
        this.field1118 = 0;
        this.field1119 = false;
        this.field1122 = class454.field4749;
        this.field1123 = class454.field4749;
        this.field1124 = class454.field4749;
        this.field1125 = false;
    }

    @ObfuscatedName("dn.am(Luk;I)V")
    public final void method2324(class531 arg0) {
        arg0.field5181 = 0;
        byte var2 = arg0.method8562();
        boolean var3 = true;
        this.field1100 = arg0.method8562();
        this.field1101 = arg0.method8562();
        int var4 = -1;
        this.field1118 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method8561();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8561();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8775();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class203.method5762(var5[var6] - 512).field2158;
                    if (var9 != 0) {
                        this.field1118 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[12];
        for (int var11 = 0; var11 < 12; var11++) {
            int var12 = arg0.method8561();
            if (var12 == 0) {
                var10[var11] = 0;
            } else {
                int var13 = arg0.method8561();
                var10[var11] = (var12 << 8) + var13;
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg0.method8561();
            if (var16 < 0 || var16 >= Statics.field3647[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1178 = arg0.method8775();
        if (this.field1178 == 65535) {
            this.field1178 = -1;
        }
        this.field1237 = arg0.method8775();
        if (this.field1237 == 65535) {
            this.field1237 = -1;
        }
        this.field1180 = this.field1237;
        this.field1247 = arg0.method8775();
        if (this.field1247 == 65535) {
            this.field1247 = -1;
        }
        this.field1182 = arg0.method8775();
        if (this.field1182 == 65535) {
            this.field1182 = -1;
        }
        this.field1245 = arg0.method8775();
        if (this.field1245 == 65535) {
            this.field1245 = -1;
        }
        this.field1233 = arg0.method8775();
        if (this.field1233 == 65535) {
            this.field1233 = -1;
        }
        this.field1185 = arg0.method8775();
        if (this.field1185 == 65535) {
            this.field1185 = -1;
        }
        this.field1117 = new class554(arg0.method8641(), Statics.field1465);
        this.method2293();
        this.method2298();
        this.method2301();
        if (Statics.field133 == this) {
            Statics.field5336 = this.field1117.method9164();
        }
        this.field1104 = arg0.method8561();
        this.field1107 = arg0.method8775();
        this.field1119 = arg0.method8561() == 1;
        if (client.field638 == 0 && client.field679 >= 2) {
            this.field1119 = false;
        }
        class169[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8775();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class169[12];
            for (int var21 = 0; var21 < 12; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    var17[var21] = class169.method6834(var5[var21] - 512, arg0);
                }
            }
        }
        for (int var23 = 0; var23 < 3; var23++) {
            this.field1103[var23] = arg0.method8641();
        }
        byte var24 = arg0.method8562();
        if (this.field1099 == null) {
            this.field1099 = new class344();
        }
        this.field1099.method5766(var10, var5, var17, var20, var14, var2, var4, var24);
    }

    @ObfuscatedName("dn.af(S)Z")
    public boolean method2294() {
        if (class454.field4749 == this.field1122) {
            this.method2296();
        }
        return class454.field4746 == this.field1122;
    }

    @ObfuscatedName("dn.aj(I)V")
    public void method2293() {
        this.field1122 = class454.field4749;
    }

    @ObfuscatedName("dn.aq(I)V")
    public void method2296() {
        this.field1122 = Statics.field3588.method1833(this.field1117) ? class454.field4746 : class454.field4745;
    }

    @ObfuscatedName("dn.ae(I)Z")
    public boolean method2297() {
        if (class454.field4749 == this.field1123) {
            this.method2305();
        }
        return class454.field4746 == this.field1123;
    }

    @ObfuscatedName("dn.aa(B)V")
    public void method2298() {
        this.field1123 = class454.field4749;
    }

    @ObfuscatedName("dn.au(I)V")
    public void method2305() {
        this.field1123 = Statics.field1292 != null && Statics.field1292.method7574(this.field1117) ? class454.field4746 : class454.field4745;
    }

    @ObfuscatedName("dn.an(B)V")
    public void method2300() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field743[var1] != null && client.field743[var1].method3163(this.field1117.method9164()) != -1 && var1 != 2) {
                this.field1124 = class454.field4746;
                return;
            }
        }
        this.field1124 = class454.field4745;
    }

    @ObfuscatedName("dn.ad(B)V")
    public void method2301() {
        this.field1124 = class454.field4749;
    }

    @ObfuscatedName("dn.ax(I)Z")
    public boolean method2331() {
        if (class454.field4749 == this.field1124) {
            this.method2300();
        }
        return class454.field4746 == this.field1124;
    }

    @ObfuscatedName("dn.aw(I)I")
    public int method2303() {
        return this.field1099 == null || this.field1099.field3642 == -1 ? 1 : class189.method2165(this.field1099.field3642).field1980;
    }

    @ObfuscatedName("dn.ap(I)Lko;")
    public final class283 method2053() {
        if (this.field1099 == null) {
            return null;
        }
        class205 var1 = this.field1236 != -1 && this.field1230 == 0 ? class205.method73(this.field1236) : null;
        class205 var2 = this.field1210 == -1 || this.field1126 || this.field1210 == this.field1178 && var1 != null ? null : class205.method73(this.field1210);
        class283 var3 = this.field1099.method5776(var1, this.field1218, var2, this.field1183);
        if (var3 == null) {
            return null;
        }
        var3.method5136();
        this.field1190 = var3.field2910;
        int var4 = var3.field2983;
        if (!this.field1126) {
            var3 = this.method2385(var3);
        }
        if (!this.field1126 && this.field1112 != null) {
            if (client.field677 >= this.field1108) {
                this.field1112 = null;
            }
            if (client.field677 >= this.field1098 && client.field677 < this.field1108) {
                class283 var5 = this.field1112;
                var5.method5152(this.field1109 - this.field1232, this.field1110 - this.field1106, this.field1121 - this.field1173);
                if (this.field1239 == 512) {
                    var5.method5148();
                    var5.method5148();
                    var5.method5148();
                } else if (this.field1239 == 1024) {
                    var5.method5148();
                    var5.method5148();
                } else if (this.field1239 == 1536) {
                    var5.method5148();
                }
                class283[] var6 = new class283[] { var3, var5 };
                var3 = new class283(var6, 2);
                if (this.field1239 == 512) {
                    var5.method5148();
                } else if (this.field1239 == 1024) {
                    var5.method5148();
                    var5.method5148();
                } else if (this.field1239 == 1536) {
                    var5.method5148();
                    var5.method5148();
                    var5.method5148();
                }
                var5.method5152(this.field1232 - this.field1109, this.field1106 - this.field1110, this.field1173 - this.field1121);
            }
        }
        var3.field3003 = true;
        if (this.field1238 == 0 || client.field677 < this.field1181 || client.field677 >= this.field1234) {
            var3.field3048 = 0;
        } else {
            var3.field3045 = this.field1235;
            var3.field3046 = this.field1194;
            var3.field3047 = this.field1205;
            var3.field3048 = this.field1238;
            var3.field2996 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("dn.az(IILir;I)V")
    public final void method2332(int arg0, int arg1, class232 arg2) {
        if (this.field1236 != -1 && class205.method73(this.field1236).field2227 == 1) {
            this.field1236 = -1;
        }
        this.method2360();
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2306(arg0, arg1);
        } else if (this.field1243[0] >= 0 && this.field1243[0] < 104 && this.field1244[0] >= 0 && this.field1244[0] < 104) {
            if (class232.field2460 == arg2) {
                client.method2052(this, arg0, arg1, class232.field2460);
            }
            this.method2318(arg0, arg1, arg2);
        } else {
            this.method2306(arg0, arg1);
        }
    }

    @ObfuscatedName("dn.av(IIB)V")
    public void method2306(int arg0, int arg1) {
        this.field1242 = 0;
        this.field1216 = 0;
        this.field1246 = 0;
        this.field1243[0] = arg0;
        this.field1244[0] = arg1;
        int var3 = this.method2303();
        this.field1232 = this.field1243[0] * 128 + var3 * 64;
        this.field1173 = this.field1244[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("dn.ak(IILir;B)V")
    public final void method2318(int arg0, int arg1, class232 arg2) {
        if (this.field1242 < 9) {
            this.field1242++;
        }
        for (int var4 = this.field1242; var4 > 0; var4--) {
            this.field1243[var4] = this.field1243[var4 - 1];
            this.field1244[var4] = this.field1244[var4 - 1];
            this.field1220[var4] = this.field1220[var4 - 1];
        }
        this.field1243[0] = arg0;
        this.field1244[0] = arg1;
        this.field1220[0] = arg2;
    }

    @ObfuscatedName("dn.ay(B)Z")
    public final boolean method2307() {
        return this.field1099 != null;
    }
}

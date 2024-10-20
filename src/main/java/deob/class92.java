package deob;

@ObfuscatedName("ds")
public final class class92 extends class96 {

    @ObfuscatedName("ds.at")
    public class550 field1103;

    @ObfuscatedName("ds.ah")
    public class341 field1100;

    @ObfuscatedName("ds.ar")
    public int field1096 = -1;

    @ObfuscatedName("ds.ao")
    public int field1097 = -1;

    @ObfuscatedName("ds.au")
    public String[] field1101 = new String[3];

    @ObfuscatedName("ds.aa")
    public int field1117;

    @ObfuscatedName("ds.ac")
    public int field1102;

    @ObfuscatedName("ds.al")
    public int field1104;

    @ObfuscatedName("ds.az")
    public int field1105;

    @ObfuscatedName("ds.ap")
    public int field1106;

    @ObfuscatedName("ds.av")
    public int field1107;

    @ObfuscatedName("ds.ax")
    public int field1119;

    @ObfuscatedName("ds.as")
    public int field1109;

    @ObfuscatedName("ds.ay")
    public class280 field1110;

    @ObfuscatedName("ds.ak")
    public int field1120;

    @ObfuscatedName("ds.aj")
    public int field1112;

    @ObfuscatedName("ds.am")
    public int field1113;

    @ObfuscatedName("ds.aq")
    public int field1114;

    @ObfuscatedName("ds.ai")
    public boolean field1115;

    @ObfuscatedName("ds.aw")
    public int field1116;

    @ObfuscatedName("ds.ae")
    public boolean field1098;

    @ObfuscatedName("ds.ag")
    public int field1118;

    @ObfuscatedName("ds.ad")
    public int field1108;

    @ObfuscatedName("ds.af")
    public class450 field1125;

    @ObfuscatedName("ds.be")
    public class450 field1121;

    @ObfuscatedName("ds.bd")
    public class450 field1122;

    @ObfuscatedName("ds.bl")
    public boolean field1123;

    @ObfuscatedName("ds.bi")
    public int field1124;

    @ObfuscatedName("ds.bv")
    public int field1111;

    public class92() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1101[var1] = "";
        }
        this.field1117 = 0;
        this.field1102 = 0;
        this.field1105 = 0;
        this.field1106 = 0;
        this.field1115 = false;
        this.field1116 = 0;
        this.field1098 = false;
        this.field1125 = class450.field4705;
        this.field1121 = class450.field4705;
        this.field1122 = class450.field4705;
        this.field1123 = false;
    }

    @ObfuscatedName("ds.at(Luj;I)V")
    public final void method2267(class527 arg0) {
        arg0.field5137 = 0;
        int var2 = arg0.method8410();
        boolean var3 = true;
        this.field1096 = arg0.method8616();
        this.field1097 = arg0.method8616();
        int var4 = -1;
        this.field1116 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method8410();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8410();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8412();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class203.method3907(var5[var6] - 512).field2155;
                    if (var9 != 0) {
                        this.field1116 = var9;
                    }
                }
            }
        }
        int[] var10 = null;
        if (client.field493 >= 213) {
            var10 = new int[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = arg0.method8410();
                if (var12 == 0) {
                    var10[var11] = 0;
                } else {
                    int var13 = arg0.method8410();
                    var10[var11] = (var12 << 8) + var13;
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg0.method8410();
            if (var16 < 0 || var16 >= Statics.field1095[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1178 = arg0.method8412();
        if (this.field1178 == 65535) {
            this.field1178 = -1;
        }
        this.field1192 = arg0.method8412();
        if (this.field1192 == 65535) {
            this.field1192 = -1;
        }
        this.field1208 = this.field1192;
        this.field1181 = arg0.method8412();
        if (this.field1181 == 65535) {
            this.field1181 = -1;
        }
        this.field1182 = arg0.method8412();
        if (this.field1182 == 65535) {
            this.field1182 = -1;
        }
        this.field1183 = arg0.method8412();
        if (this.field1183 == 65535) {
            this.field1183 = -1;
        }
        this.field1227 = arg0.method8412();
        if (this.field1227 == 65535) {
            this.field1227 = -1;
        }
        this.field1185 = arg0.method8412();
        if (this.field1185 == 65535) {
            this.field1185 = -1;
        }
        this.field1103 = new class550(arg0.method8535(), Statics.field1079);
        this.method2297();
        this.method2298();
        this.method2274();
        if (Statics.field2420 == this) {
            Statics.field78 = this.field1103.method9073();
        }
        this.field1117 = arg0.method8410();
        this.field1102 = arg0.method8412();
        this.field1098 = arg0.method8410() == 1;
        if (client.field652 == 0 && client.field567 >= 2) {
            this.field1098 = false;
        }
        class170[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8412();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class170[12];
            for (int var21 = 0; var21 < 12; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    var17[var21] = class170.method5314(var5[var21] - 512, arg0);
                }
            }
        }
        for (int var23 = 0; var23 < 3; var23++) {
            this.field1101[var23] = arg0.method8535();
        }
        int var24 = arg0.method8410();
        if (this.field1100 == null) {
            this.field1100 = new class341();
        }
        this.field1100.method5664(var10, var5, var17, var20, var14, var2, var4, var24);
    }

    @ObfuscatedName("ds.ar(I)Z")
    public boolean method2268() {
        if (class450.field4705 == this.field1125) {
            this.method2270();
        }
        return class450.field4706 == this.field1125;
    }

    @ObfuscatedName("ds.ao(B)V")
    public void method2297() {
        this.field1125 = class450.field4705;
    }

    @ObfuscatedName("ds.ab(B)V")
    public void method2270() {
        this.field1125 = Statics.field52.method1809(this.field1103) ? class450.field4706 : class450.field4707;
    }

    @ObfuscatedName("ds.az(B)Z")
    public boolean method2271() {
        if (class450.field4705 == this.field1121) {
            this.method2272();
        }
        return class450.field4706 == this.field1121;
    }

    @ObfuscatedName("ds.ap(I)V")
    public void method2298() {
        this.field1121 = class450.field4705;
    }

    @ObfuscatedName("ds.av(I)V")
    public void method2272() {
        this.field1121 = Statics.field106 != null && Statics.field106.method7439(this.field1103) ? class450.field4706 : class450.field4707;
    }

    @ObfuscatedName("ds.ax(B)V")
    public void method2273() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field731[var1] != null && client.field731[var1].method3084(this.field1103.method9073()) != -1 && var1 != 2) {
                this.field1122 = class450.field4706;
                return;
            }
        }
        this.field1122 = class450.field4707;
    }

    @ObfuscatedName("ds.as(B)V")
    public void method2274() {
        this.field1122 = class450.field4705;
    }

    @ObfuscatedName("ds.ay(I)Z")
    public boolean method2275() {
        if (class450.field4705 == this.field1122) {
            this.method2273();
        }
        return class450.field4706 == this.field1122;
    }

    @ObfuscatedName("ds.ak(I)I")
    public int method2269() {
        return this.field1100 == null || this.field1100.field3606 == -1 ? 1 : class189.method3442(this.field1100.field3606).field1927;
    }

    @ObfuscatedName("ds.ah(B)Lka;")
    public final class280 method2019() {
        if (this.field1100 == null) {
            return null;
        }
        class205 var1 = this.field1229 != -1 && this.field1220 == 0 ? class205.method2129(this.field1229) : null;
        class205 var2 = this.field1213 == -1 || this.field1115 || this.field1213 == this.field1178 && var1 != null ? null : class205.method2129(this.field1213);
        class280 var3 = this.field1100.method5671(var1, this.field1218, var2, this.field1214);
        if (var3 == null) {
            return null;
        }
        var3.method5033();
        this.field1232 = var3.field2874;
        int var4 = var3.field2941;
        if (!this.field1115) {
            var3 = this.method2343(var3);
        }
        if (!this.field1115 && this.field1110 != null) {
            if (client.field500 >= this.field1106) {
                this.field1110 = null;
            }
            if (client.field500 >= this.field1105 && client.field500 < this.field1106) {
                class280 var5 = this.field1110;
                var5.method5133(this.field1107 - this.field1247, this.field1119 - this.field1104, this.field1109 - this.field1173);
                if (this.field1239 == 512) {
                    var5.method5068();
                    var5.method5068();
                    var5.method5068();
                } else if (this.field1239 == 1024) {
                    var5.method5068();
                    var5.method5068();
                } else if (this.field1239 == 1536) {
                    var5.method5068();
                }
                class280[] var6 = new class280[] { var3, var5 };
                var3 = new class280(var6, 2);
                if (this.field1239 == 512) {
                    var5.method5068();
                } else if (this.field1239 == 1024) {
                    var5.method5068();
                    var5.method5068();
                } else if (this.field1239 == 1536) {
                    var5.method5068();
                    var5.method5068();
                    var5.method5068();
                }
                var5.method5133(this.field1247 - this.field1107, this.field1104 - this.field1119, this.field1173 - this.field1109);
            }
        }
        var3.field2990 = true;
        if (this.field1238 == 0 || client.field500 < this.field1233 || client.field500 >= this.field1216) {
            var3.field2967 = 0;
        } else {
            var3.field3003 = this.field1235;
            var3.field3004 = this.field1236;
            var3.field2999 = this.field1172;
            var3.field2967 = this.field1238;
            var3.field3007 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("ds.aj(IILiz;I)V")
    public final void method2277(int arg0, int arg1, class229 arg2) {
        if (this.field1229 != -1 && class205.method2129(this.field1229).field2206 == 1) {
            this.field1229 = -1;
        }
        this.method2352();
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2278(arg0, arg1);
        } else if (this.field1243[0] >= 0 && this.field1243[0] < 104 && this.field1244[0] >= 0 && this.field1244[0] < 104) {
            if (class229.field2411 == arg2) {
                client.method4504(this, arg0, arg1, class229.field2411);
            }
            this.method2279(arg0, arg1, arg2);
        } else {
            this.method2278(arg0, arg1);
        }
    }

    @ObfuscatedName("ds.am(III)V")
    public void method2278(int arg0, int arg1) {
        this.field1242 = 0;
        this.field1221 = 0;
        this.field1246 = 0;
        this.field1243[0] = arg0;
        this.field1244[0] = arg1;
        int var3 = this.method2269();
        this.field1247 = this.field1243[0] * 128 + var3 * 64;
        this.field1173 = this.field1244[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("ds.aq(IILiz;I)V")
    public final void method2279(int arg0, int arg1, class229 arg2) {
        if (this.field1242 < 9) {
            this.field1242++;
        }
        for (int var4 = this.field1242; var4 > 0; var4--) {
            this.field1243[var4] = this.field1243[var4 - 1];
            this.field1244[var4] = this.field1244[var4 - 1];
            this.field1245[var4] = this.field1245[var4 - 1];
        }
        this.field1243[0] = arg0;
        this.field1244[0] = arg1;
        this.field1245[0] = arg2;
    }

    @ObfuscatedName("ds.ai(I)Z")
    public final boolean method2280() {
        return this.field1100 != null;
    }
}

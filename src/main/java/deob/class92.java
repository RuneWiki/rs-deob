package deob;

@ObfuscatedName("dh")
public final class class92 extends class95 {

    @ObfuscatedName("dh.at")
    public class525 field1112;

    @ObfuscatedName("dh.av")
    public class327 field1100;

    @ObfuscatedName("dh.as")
    public int field1107 = -1;

    @ObfuscatedName("dh.ax")
    public int field1102 = -1;

    @ObfuscatedName("dh.ab")
    public String[] field1120 = new String[3];

    @ObfuscatedName("dh.ak")
    public int field1104;

    @ObfuscatedName("dh.ae")
    public int field1105;

    @ObfuscatedName("dh.af")
    public int field1106;

    @ObfuscatedName("dh.ao")
    public int field1109;

    @ObfuscatedName("dh.aa")
    public int field1111;

    @ObfuscatedName("dh.aj")
    public int field1108;

    @ObfuscatedName("dh.ad")
    public int field1110;

    @ObfuscatedName("dh.ac")
    public int field1123;

    @ObfuscatedName("dh.ag")
    public class239 field1119;

    @ObfuscatedName("dh.ar")
    public int field1113;

    @ObfuscatedName("dh.ah")
    public int field1114;

    @ObfuscatedName("dh.az")
    public int field1122;

    @ObfuscatedName("dh.au")
    public int field1116;

    @ObfuscatedName("dh.ai")
    public boolean field1117;

    @ObfuscatedName("dh.aq")
    public int field1118;

    @ObfuscatedName("dh.aw")
    public boolean field1115;

    @ObfuscatedName("dh.ay")
    public int field1103;

    @ObfuscatedName("dh.al")
    public int field1121;

    @ObfuscatedName("dh.am")
    public class426 field1099;

    @ObfuscatedName("dh.bs")
    public class426 field1101;

    @ObfuscatedName("dh.bc")
    public class426 field1124;

    @ObfuscatedName("dh.bj")
    public boolean field1125;

    @ObfuscatedName("dh.bo")
    public int field1126;

    @ObfuscatedName("dh.bq")
    public int field1127;

    public class92() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1120[var1] = "";
        }
        this.field1104 = 0;
        this.field1105 = 0;
        this.field1109 = 0;
        this.field1111 = 0;
        this.field1117 = false;
        this.field1118 = 0;
        this.field1115 = false;
        this.field1099 = class426.field4619;
        this.field1101 = class426.field4619;
        this.field1124 = class426.field4619;
        this.field1125 = false;
    }

    @ObfuscatedName("dh.at(Ltz;B)V")
    public final void method2176(class501 arg0) {
        arg0.field5017 = 0;
        int var2 = arg0.method8129();
        boolean var3 = true;
        this.field1107 = arg0.method8130();
        this.field1102 = arg0.method8130();
        int var4 = -1;
        this.field1118 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method8129();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8129();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8195();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class206.method5155(var5[var6] - 512).field2249;
                    if (var9 != 0) {
                        this.field1118 = var9;
                    }
                }
            }
        }
        int[] var10 = null;
        if (client.field513 >= 213) {
            var10 = new int[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = arg0.method8129();
                if (var12 == 0) {
                    var10[var11] = 0;
                } else {
                    int var13 = arg0.method8129();
                    var10[var11] = (var12 << 8) + var13;
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg0.method8129();
            if (var16 < 0 || var16 >= Statics.field66[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1158 = arg0.method8195();
        if (this.field1158 == 65535) {
            this.field1158 = -1;
        }
        this.field1200 = arg0.method8195();
        if (this.field1200 == 65535) {
            this.field1200 = -1;
        }
        this.field1160 = this.field1200;
        this.field1159 = arg0.method8195();
        if (this.field1159 == 65535) {
            this.field1159 = -1;
        }
        this.field1162 = arg0.method8195();
        if (this.field1162 == 65535) {
            this.field1162 = -1;
        }
        this.field1154 = arg0.method8195();
        if (this.field1154 == 65535) {
            this.field1154 = -1;
        }
        this.field1189 = arg0.method8195();
        if (this.field1189 == 65535) {
            this.field1189 = -1;
        }
        this.field1203 = arg0.method8195();
        if (this.field1203 == 65535) {
            this.field1203 = -1;
        }
        this.field1112 = new class525(arg0.method8253(), Statics.field3059);
        this.method2175();
        this.method2178();
        this.method2181();
        if (Statics.field971 == this) {
            Statics.field5177 = this.field1112.method8756();
        }
        this.field1104 = arg0.method8129();
        this.field1105 = arg0.method8195();
        this.field1115 = arg0.method8129() == 1;
        if (client.field566 == 0 && client.field682 >= 2) {
            this.field1115 = false;
        }
        class183[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8195();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class183[12];
            for (int var21 = 0; var21 < 12; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    var17[var21] = class183.method3062(var5[var21] - 512, arg0);
                }
            }
        }
        for (int var23 = 0; var23 < 3; var23++) {
            this.field1120[var23] = arg0.method8253();
        }
        int var24 = arg0.method8129();
        if (this.field1100 == null) {
            this.field1100 = new class327();
        }
        this.field1100.method5433(var10, var5, var17, var20, var14, var2, var4, var24);
    }

    @ObfuscatedName("dh.av(I)Z")
    public boolean method2199() {
        if (class426.field4619 == this.field1099) {
            this.method2188();
        }
        return class426.field4617 == this.field1099;
    }

    @ObfuscatedName("dh.as(I)V")
    public void method2175() {
        this.field1099 = class426.field4619;
    }

    @ObfuscatedName("dh.ax(B)V")
    public void method2188() {
        this.field1099 = Statics.field497.method1764(this.field1112) ? class426.field4617 : class426.field4616;
    }

    @ObfuscatedName("dh.ae(B)Z")
    public boolean method2177() {
        if (class426.field4619 == this.field1101) {
            this.method2196();
        }
        return class426.field4617 == this.field1101;
    }

    @ObfuscatedName("dh.af(B)V")
    public void method2178() {
        this.field1101 = class426.field4619;
    }

    @ObfuscatedName("dh.ao(B)V")
    public void method2196() {
        this.field1101 = Statics.field4535 != null && Statics.field4535.method7176(this.field1112) ? class426.field4617 : class426.field4616;
    }

    @ObfuscatedName("dh.aa(I)V")
    public void method2180() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field593[var1] != null && client.field593[var1].method2973(this.field1112.method8756()) != -1 && var1 != 2) {
                this.field1124 = class426.field4617;
                return;
            }
        }
        this.field1124 = class426.field4616;
    }

    @ObfuscatedName("dh.aj(I)V")
    public void method2181() {
        this.field1124 = class426.field4619;
    }

    @ObfuscatedName("dh.ad(B)Z")
    public boolean method2182() {
        if (class426.field4619 == this.field1124) {
            this.method2180();
        }
        return class426.field4617 == this.field1124;
    }

    @ObfuscatedName("dh.ac(I)I")
    public int method2183() {
        return this.field1100 == null || this.field1100.field3544 == -1 ? 1 : class195.method7336(this.field1100.field3544).field2029;
    }

    @ObfuscatedName("dh.an(I)Ljd;")
    public final class239 method1952() {
        if (this.field1100 == null) {
            return null;
        }
        class208 var1 = this.field1217 != -1 && this.field1208 == 0 ? class208.method4648(this.field1217) : null;
        class208 var2 = this.field1152 == -1 || this.field1117 || this.field1158 == this.field1152 && var1 != null ? null : class208.method4648(this.field1152);
        class239 var3 = this.field1100.method5441(var1, this.field1198, var2, this.field1161);
        if (var3 == null) {
            return null;
        }
        var3.method4492();
        this.field1205 = var3.field2621;
        int var4 = var3.field2696;
        if (!this.field1117) {
            var3 = this.method2252(var3);
        }
        if (!this.field1117 && this.field1119 != null) {
            if (client.field506 >= this.field1111) {
                this.field1119 = null;
            }
            if (client.field506 >= this.field1109 && client.field506 < this.field1111) {
                class239 var5 = this.field1119;
                var5.method4431(this.field1108 - this.field1163, this.field1110 - this.field1106, this.field1123 - this.field1153);
                if (this.field1219 == 512) {
                    var5.method4427();
                    var5.method4427();
                    var5.method4427();
                } else if (this.field1219 == 1024) {
                    var5.method4427();
                    var5.method4427();
                } else if (this.field1219 == 1536) {
                    var5.method4427();
                }
                class239[] var6 = new class239[] { var3, var5 };
                var3 = new class239(var6, 2);
                if (this.field1219 == 512) {
                    var5.method4427();
                } else if (this.field1219 == 1024) {
                    var5.method4427();
                    var5.method4427();
                } else if (this.field1219 == 1536) {
                    var5.method4427();
                    var5.method4427();
                    var5.method4427();
                }
                var5.method4431(this.field1163 - this.field1108, this.field1106 - this.field1110, this.field1153 - this.field1123);
            }
        }
        var3.field2737 = true;
        if (this.field1218 == 0 || client.field506 < this.field1171 || client.field506 >= this.field1214) {
            var3.field2761 = 0;
        } else {
            var3.field2758 = this.field1165;
            var3.field2759 = this.field1216;
            var3.field2743 = this.field1197;
            var3.field2761 = this.field1218;
            var3.field2762 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("dh.ag(IILie;I)V")
    public final void method2189(int arg0, int arg1, class217 arg2) {
        if (this.field1217 != -1 && class208.method4648(this.field1217).field2275 == 1) {
            this.field1217 = -1;
        }
        this.method2258();
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2185(arg0, arg1);
        } else if (this.field1223[0] >= 0 && this.field1223[0] < 104 && this.field1193[0] >= 0 && this.field1193[0] < 104) {
            if (class217.field2397 == arg2) {
                client.method5432(this, arg0, arg1, class217.field2397);
            }
            this.method2186(arg0, arg1, arg2);
        } else {
            this.method2185(arg0, arg1);
        }
    }

    @ObfuscatedName("dh.ar(III)V")
    public void method2185(int arg0, int arg1) {
        this.field1222 = 0;
        this.field1227 = 0;
        this.field1226 = 0;
        this.field1223[0] = arg0;
        this.field1193[0] = arg1;
        int var3 = this.method2183();
        this.field1163 = this.field1223[0] * 128 + var3 * 64;
        this.field1153 = this.field1193[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("dh.ah(IILie;I)V")
    public final void method2186(int arg0, int arg1, class217 arg2) {
        if (this.field1222 < 9) {
            this.field1222++;
        }
        for (int var4 = this.field1222; var4 > 0; var4--) {
            this.field1223[var4] = this.field1223[var4 - 1];
            this.field1193[var4] = this.field1193[var4 - 1];
            this.field1213[var4] = this.field1213[var4 - 1];
        }
        this.field1223[0] = arg0;
        this.field1193[0] = arg1;
        this.field1213[0] = arg2;
    }

    @ObfuscatedName("dh.az(B)Z")
    public final boolean method2192() {
        return this.field1100 != null;
    }
}

package deob;

@ObfuscatedName("dv")
public final class class88 extends class91 {

    @ObfuscatedName("dv.af")
    public class513 field1089;

    @ObfuscatedName("dv.aw")
    public class314 field1097;

    @ObfuscatedName("dv.ac")
    public int field1090 = -1;

    @ObfuscatedName("dv.au")
    public int field1108 = -1;

    @ObfuscatedName("dv.aq")
    public String[] field1103 = new String[3];

    @ObfuscatedName("dv.al")
    public int field1102;

    @ObfuscatedName("dv.at")
    public int field1085;

    @ObfuscatedName("dv.aa")
    public int field1092;

    @ObfuscatedName("dv.ay")
    public int field1093;

    @ObfuscatedName("dv.ao")
    public int field1094;

    @ObfuscatedName("dv.ax")
    public int field1095;

    @ObfuscatedName("dv.ai")
    public int field1086;

    @ObfuscatedName("dv.ag")
    public int field1099;

    @ObfuscatedName("dv.ah")
    public class232 field1098;

    @ObfuscatedName("dv.av")
    public int field1100;

    @ObfuscatedName("dv.ar")
    public int field1087;

    @ObfuscatedName("dv.am")
    public int field1091;

    @ObfuscatedName("dv.as")
    public int field1101;

    @ObfuscatedName("dv.aj")
    public boolean field1096;

    @ObfuscatedName("dv.ak")
    public int field1104;

    @ObfuscatedName("dv.az")
    public boolean field1105;

    @ObfuscatedName("dv.ad")
    public int field1106;

    @ObfuscatedName("dv.ae")
    public int field1107;

    @ObfuscatedName("dv.ap")
    public class413 field1084;

    @ObfuscatedName("dv.by")
    public class413 field1109;

    @ObfuscatedName("dv.bb")
    public class413 field1110;

    @ObfuscatedName("dv.bi")
    public boolean field1111;

    @ObfuscatedName("dv.be")
    public int field1112;

    @ObfuscatedName("dv.bk")
    public int field1113;

    public class88() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1103[var1] = "";
        }
        this.field1102 = 0;
        this.field1085 = 0;
        this.field1093 = 0;
        this.field1094 = 0;
        this.field1096 = false;
        this.field1104 = 0;
        this.field1105 = false;
        this.field1084 = class413.field4605;
        this.field1109 = class413.field4605;
        this.field1110 = class413.field4605;
        this.field1111 = false;
    }

    @ObfuscatedName("dv.af(Lsg;I)V")
    public final void method2174(class489 arg0) {
        arg0.field4989 = 0;
        int var2 = arg0.method8248();
        boolean var3 = true;
        this.field1090 = arg0.method8249();
        this.field1108 = arg0.method8249();
        int var4 = -1;
        this.field1104 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method8248();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8248();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8250();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class202.method2286(var5[var6] - 512).field2255;
                    if (var9 != 0) {
                        this.field1104 = var9;
                    }
                }
            }
        }
        int[] var10 = null;
        if (client.field498 >= 213) {
            var10 = new int[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = arg0.method8248();
                if (var12 == 0) {
                    var10[var11] = 0;
                } else {
                    int var13 = arg0.method8248();
                    var10[var11] = (var12 << 8) + var13;
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg0.method8248();
            if (var16 < 0 || var16 >= Statics.field3508[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1139 = arg0.method8250();
        if (this.field1139 == 65535) {
            this.field1139 = -1;
        }
        this.field1137 = arg0.method8250();
        if (this.field1137 == 65535) {
            this.field1137 = -1;
        }
        this.field1167 = this.field1137;
        this.field1146 = arg0.method8250();
        if (this.field1146 == 65535) {
            this.field1146 = -1;
        }
        this.field1147 = arg0.method8250();
        if (this.field1147 == 65535) {
            this.field1147 = -1;
        }
        this.field1148 = arg0.method8250();
        if (this.field1148 == 65535) {
            this.field1148 = -1;
        }
        this.field1155 = arg0.method8250();
        if (this.field1155 == 65535) {
            this.field1155 = -1;
        }
        this.field1150 = arg0.method8250();
        if (this.field1150 == 65535) {
            this.field1150 = -1;
        }
        this.field1089 = new class513(arg0.method8259(), Statics.field889);
        this.method2184();
        this.method2179();
        this.method2182();
        if (Statics.field3454 == this) {
            Statics.field5159 = this.field1089.method8841();
        }
        this.field1102 = arg0.method8248();
        this.field1085 = arg0.method8250();
        this.field1105 = arg0.method8248() == 1;
        if (client.field490 == 0 && client.field682 >= 2) {
            this.field1105 = false;
        }
        class180[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8250();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class180[12];
            for (int var21 = 0; var21 < 12; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    var17[var21] = class180.method2015(var5[var21] - 512, arg0);
                }
            }
        }
        for (int var23 = 0; var23 < 3; var23++) {
            this.field1103[var23] = arg0.method8259();
        }
        int var24 = arg0.method8248();
        if (this.field1097 == null) {
            this.field1097 = new class314();
        }
        this.field1097.method5442(var10, var5, var17, var20, var14, var2, var4, var24);
    }

    @ObfuscatedName("dv.aw(I)Z")
    public boolean method2175() {
        if (class413.field4605 == this.field1084) {
            this.method2208();
        }
        return class413.field4602 == this.field1084;
    }

    @ObfuscatedName("dv.ac(B)V")
    public void method2184() {
        this.field1084 = class413.field4605;
    }

    @ObfuscatedName("dv.at(B)V")
    public void method2208() {
        this.field1084 = Statics.field804.method1748(this.field1089) ? class413.field4602 : class413.field4603;
    }

    @ObfuscatedName("dv.aa(B)Z")
    public boolean method2213() {
        if (class413.field4605 == this.field1109) {
            this.method2180();
        }
        return class413.field4602 == this.field1109;
    }

    @ObfuscatedName("dv.ay(I)V")
    public void method2179() {
        this.field1109 = class413.field4605;
    }

    @ObfuscatedName("dv.ao(B)V")
    public void method2180() {
        this.field1109 = Statics.field1426 != null && Statics.field1426.method7218(this.field1089) ? class413.field4602 : class413.field4603;
    }

    @ObfuscatedName("dv.ax(B)V")
    public void method2181() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field750[var1] != null && client.field750[var1].method3082(this.field1089.method8841()) != -1 && var1 != 2) {
                this.field1110 = class413.field4602;
                return;
            }
        }
        this.field1110 = class413.field4603;
    }

    @ObfuscatedName("dv.ai(I)V")
    public void method2182() {
        this.field1110 = class413.field4605;
    }

    @ObfuscatedName("dv.ag(B)Z")
    public boolean method2183() {
        if (class413.field4605 == this.field1110) {
            this.method2181();
        }
        return class413.field4602 == this.field1110;
    }

    @ObfuscatedName("dv.ah(B)I")
    public int method2200() {
        return this.field1097 == null || this.field1097.field3513 == -1 ? 1 : class191.method6098(this.field1097.field3513).field2042;
    }

    @ObfuscatedName("dv.an(B)Lit;")
    public final class232 method1921() {
        if (this.field1097 == null) {
            return null;
        }
        class204 var1 = this.field1202 != -1 && this.field1184 == 0 ? class204.method2139(this.field1202) : null;
        class204 var2 = this.field1187 == -1 || this.field1096 || this.field1187 == this.field1139 && var1 != null ? null : class204.method2139(this.field1187);
        class232 var3 = this.field1097.method5450(var1, this.field1182, var2, this.field1178);
        if (var3 == null) {
            return null;
        }
        var3.method4451();
        this.field1196 = var3.field2619;
        int var4 = var3.field2697;
        if (!this.field1096) {
            var3 = this.method2254(var3);
        }
        if (!this.field1096 && this.field1098 != null) {
            if (client.field602 >= this.field1094) {
                this.field1098 = null;
            }
            if (client.field602 >= this.field1093 && client.field602 < this.field1094) {
                class232 var5 = this.field1098;
                var5.method4408(this.field1095 - this.field1171, this.field1086 - this.field1092, this.field1099 - this.field1138);
                if (this.field1168 == 512) {
                    var5.method4481();
                    var5.method4481();
                    var5.method4481();
                } else if (this.field1168 == 1024) {
                    var5.method4481();
                    var5.method4481();
                } else if (this.field1168 == 1536) {
                    var5.method4481();
                }
                class232[] var6 = new class232[] { var3, var5 };
                var3 = new class232(var6, 2);
                if (this.field1168 == 512) {
                    var5.method4481();
                } else if (this.field1168 == 1024) {
                    var5.method4481();
                    var5.method4481();
                } else if (this.field1168 == 1536) {
                    var5.method4481();
                    var5.method4481();
                    var5.method4481();
                }
                var5.method4408(this.field1171 - this.field1095, this.field1092 - this.field1086, this.field1138 - this.field1099);
            }
        }
        var3.field2714 = true;
        if (this.field1209 == 0 || client.field602 < this.field1169 || client.field602 >= this.field1157) {
            var3.field2762 = 0;
        } else {
            var3.field2757 = this.field1181;
            var3.field2715 = this.field1200;
            var3.field2754 = this.field1201;
            var3.field2762 = this.field1209;
            var3.field2756 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("dv.av(IILiu;B)V")
    public final void method2191(int arg0, int arg1, class211 arg2) {
        if (this.field1202 != -1 && class204.method2139(this.field1202).field2314 == 1) {
            this.field1202 = -1;
        }
        this.method2251();
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2186(arg0, arg1);
        } else if (this.field1174[0] >= 0 && this.field1174[0] < 104 && this.field1176[0] >= 0 && this.field1176[0] < 104) {
            if (class211.field2388 == arg2) {
                client.method1053(this, arg0, arg1, class211.field2388);
            }
            this.method2187(arg0, arg1, arg2);
        } else {
            this.method2186(arg0, arg1);
        }
    }

    @ObfuscatedName("dv.ar(III)V")
    public void method2186(int arg0, int arg1) {
        this.field1206 = 0;
        this.field1211 = 0;
        this.field1210 = 0;
        this.field1174[0] = arg0;
        this.field1176[0] = arg1;
        int var3 = this.method2200();
        this.field1171 = this.field1174[0] * 128 + var3 * 64;
        this.field1138 = this.field1176[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("dv.am(IILiu;I)V")
    public final void method2187(int arg0, int arg1, class211 arg2) {
        if (this.field1206 < 9) {
            this.field1206++;
        }
        for (int var4 = this.field1206; var4 > 0; var4--) {
            this.field1174[var4] = this.field1174[var4 - 1];
            this.field1176[var4] = this.field1176[var4 - 1];
            this.field1199[var4] = this.field1199[var4 - 1];
        }
        this.field1174[0] = arg0;
        this.field1176[0] = arg1;
        this.field1199[0] = arg2;
    }

    @ObfuscatedName("dv.as(I)Z")
    public final boolean method2188() {
        return this.field1097 != null;
    }
}

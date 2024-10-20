package deob;

@ObfuscatedName("dh")
public final class class90 extends class93 {

    @ObfuscatedName("dh.aj")
    public class501 field1104;

    @ObfuscatedName("dh.al")
    public class310 field1086;

    @ObfuscatedName("dh.ac")
    public int field1088 = -1;

    @ObfuscatedName("dh.ab")
    public int field1089 = -1;

    @ObfuscatedName("dh.av")
    public String[] field1090 = new String[3];

    @ObfuscatedName("dh.aq")
    public int field1091;

    @ObfuscatedName("dh.ap")
    public int field1092;

    @ObfuscatedName("dh.ar")
    public int field1105;

    @ObfuscatedName("dh.ak")
    public int field1094;

    @ObfuscatedName("dh.ax")
    public int field1095;

    @ObfuscatedName("dh.as")
    public int field1096;

    @ObfuscatedName("dh.ay")
    public int field1097;

    @ObfuscatedName("dh.am")
    public int field1098;

    @ObfuscatedName("dh.az")
    public class231 field1099;

    @ObfuscatedName("dh.ae")
    public int field1100;

    @ObfuscatedName("dh.au")
    public int field1101;

    @ObfuscatedName("dh.ag")
    public int field1103;

    @ObfuscatedName("dh.at")
    public int field1087;

    @ObfuscatedName("dh.af")
    public boolean field1093;

    @ObfuscatedName("dh.ai")
    public int field1109;

    @ObfuscatedName("dh.aw")
    public boolean field1107;

    @ObfuscatedName("dh.aa")
    public int field1102;

    @ObfuscatedName("dh.ah")
    public int field1108;

    @ObfuscatedName("dh.ad")
    public class409 field1110;

    @ObfuscatedName("dh.bm")
    public class409 field1106;

    @ObfuscatedName("dh.bv")
    public class409 field1111;

    @ObfuscatedName("dh.bo")
    public boolean field1112;

    @ObfuscatedName("dh.bs")
    public int field1113;

    @ObfuscatedName("dh.bg")
    public int field1114;

    public class90() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1090[var1] = "";
        }
        this.field1091 = 0;
        this.field1092 = 0;
        this.field1094 = 0;
        this.field1095 = 0;
        this.field1093 = false;
        this.field1109 = 0;
        this.field1107 = false;
        this.field1110 = class409.field4539;
        this.field1106 = class409.field4539;
        this.field1111 = class409.field4539;
        this.field1112 = false;
    }

    @ObfuscatedName("dh.aj(Lsy;I)V")
    public final void method2189(class478 arg0) {
        arg0.field4904 = 0;
        int var2 = arg0.method7909();
        boolean var3 = true;
        this.field1088 = arg0.method8163();
        this.field1089 = arg0.method8163();
        int var4 = -1;
        this.field1109 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method7909();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method7909();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method7905();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class204.method3453(var5[var6] - 512).field2227;
                    if (var9 != 0) {
                        this.field1109 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[5];
        for (int var11 = 0; var11 < 5; var11++) {
            int var12 = arg0.method7909();
            if (var12 < 0 || var12 >= Statics.field2316[var11].length) {
                var12 = 0;
            }
            var10[var11] = var12;
        }
        this.field1145 = arg0.method7905();
        if (this.field1145 == 65535) {
            this.field1145 = -1;
        }
        this.field1146 = arg0.method7905();
        if (this.field1146 == 65535) {
            this.field1146 = -1;
        }
        this.field1147 = this.field1146;
        this.field1167 = arg0.method7905();
        if (this.field1167 == 65535) {
            this.field1167 = -1;
        }
        this.field1149 = arg0.method7905();
        if (this.field1149 == 65535) {
            this.field1149 = -1;
        }
        this.field1150 = arg0.method7905();
        if (this.field1150 == 65535) {
            this.field1150 = -1;
        }
        this.field1151 = arg0.method7905();
        if (this.field1151 == 65535) {
            this.field1151 = -1;
        }
        this.field1152 = arg0.method7905();
        if (this.field1152 == 65535) {
            this.field1152 = -1;
        }
        this.field1104 = new class501(arg0.method7950(), Statics.field2619);
        this.method2188();
        this.method2194();
        this.method2199();
        if (Statics.field1440 == this) {
            Statics.field5054 = this.field1104.method8490();
        }
        this.field1091 = arg0.method7909();
        this.field1092 = arg0.method7905();
        this.field1107 = arg0.method7909() == 1;
        if (client.field484 == 0 && client.field655 >= 2) {
            this.field1107 = false;
        }
        class181[] var13 = null;
        boolean var14 = false;
        int var15 = arg0.method7905();
        boolean var16 = (var15 >> 15 & 0x1) == 1;
        if (var15 > 0 && var15 != 32768) {
            var13 = new class181[12];
            for (int var17 = 0; var17 < 12; var17++) {
                int var18 = var15 >> 12 - var17 & 0x1;
                if (var18 == 1) {
                    var13[var17] = class181.method5260(var5[var17] - 512, arg0);
                }
            }
        }
        for (int var19 = 0; var19 < 3; var19++) {
            this.field1090[var19] = arg0.method7950();
        }
        int var20 = arg0.method7909();
        if (this.field1086 == null) {
            this.field1086 = new class310();
        }
        this.field1086.method5240(var5, var13, var16, var10, var2, var4, var20);
    }

    @ObfuscatedName("dh.ac(B)Z")
    public boolean method2190() {
        if (class409.field4539 == this.field1110) {
            this.method2192();
        }
        return class409.field4537 == this.field1110;
    }

    @ObfuscatedName("dh.ab(B)V")
    public void method2188() {
        this.field1110 = class409.field4539;
    }

    @ObfuscatedName("dh.an(B)V")
    public void method2192() {
        this.field1110 = Statics.field16.method1753(this.field1104) ? class409.field4537 : class409.field4538;
    }

    @ObfuscatedName("dh.ao(I)Z")
    public boolean method2193() {
        if (class409.field4539 == this.field1106) {
            this.method2224();
        }
        return class409.field4537 == this.field1106;
    }

    @ObfuscatedName("dh.ap(I)V")
    public void method2194() {
        this.field1106 = class409.field4539;
    }

    @ObfuscatedName("dh.ar(I)V")
    public void method2224() {
        this.field1106 = Statics.field251 != null && Statics.field251.method6953(this.field1104) ? class409.field4537 : class409.field4538;
    }

    @ObfuscatedName("dh.ak(S)V")
    public void method2196() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field775[var1] != null && client.field775[var1].method3038(this.field1104.method8490()) != -1 && var1 != 2) {
                this.field1111 = class409.field4537;
                return;
            }
        }
        this.field1111 = class409.field4538;
    }

    @ObfuscatedName("dh.ax(I)V")
    public void method2199() {
        this.field1111 = class409.field4539;
    }

    @ObfuscatedName("dh.as(I)Z")
    public boolean method2198() {
        if (class409.field4539 == this.field1111) {
            this.method2196();
        }
        return class409.field4537 == this.field1111;
    }

    @ObfuscatedName("dh.ay(B)I")
    public int method2197() {
        return this.field1086 == null || this.field1086.field3466 == -1 ? 1 : class193.method3331(this.field1086.field3466).field1994;
    }

    @ObfuscatedName("dh.al(I)Lix;")
    public final class231 method1936() {
        if (this.field1086 == null) {
            return null;
        }
        class206 var1 = this.field1183 != -1 && this.field1189 == 0 ? class206.method5217(this.field1183) : null;
        class206 var2 = this.field1179 == -1 || this.field1093 || this.field1179 == this.field1145 && var1 != null ? null : class206.method5217(this.field1179);
        class231 var3 = this.field1086.method5233(var1, this.field1184, var2, this.field1180);
        if (var3 == null) {
            return null;
        }
        var3.method4242();
        this.field1178 = var3.field2587;
        int var4 = var3.field2691;
        if (!this.field1093 && this.field1148 != -1 && this.field1188 != -1) {
            class231 var5 = class195.method298(this.field1148).method3405(this.field1188);
            if (var5 != null) {
                var5.method4258(0, -this.field1192, 0);
                class231[] var6 = new class231[] { var3, var5 };
                var3 = new class231(var6, 2);
            }
        }
        if (!this.field1093 && this.field1099 != null) {
            if (client.field494 >= this.field1095) {
                this.field1099 = null;
            }
            if (client.field494 >= this.field1094 && client.field494 < this.field1095) {
                class231 var7 = this.field1099;
                var7.method4258(this.field1096 - this.field1200, this.field1097 - this.field1105, this.field1098 - this.field1205);
                if (this.field1208 == 512) {
                    var7.method4254();
                    var7.method4254();
                    var7.method4254();
                } else if (this.field1208 == 1024) {
                    var7.method4254();
                    var7.method4254();
                } else if (this.field1208 == 1536) {
                    var7.method4254();
                }
                class231[] var8 = new class231[] { var3, var7 };
                var3 = new class231(var8, 2);
                if (this.field1208 == 512) {
                    var7.method4254();
                } else if (this.field1208 == 1024) {
                    var7.method4254();
                    var7.method4254();
                } else if (this.field1208 == 1536) {
                    var7.method4254();
                    var7.method4254();
                    var7.method4254();
                }
                var7.method4258(this.field1200 - this.field1096, this.field1105 - this.field1097, this.field1205 - this.field1098);
            }
        }
        var3.field2683 = true;
        if (this.field1207 == 0 || client.field494 < this.field1202 || client.field494 >= this.field1160) {
            var3.field2708 = 0;
        } else {
            var3.field2709 = this.field1204;
            var3.field2723 = this.field1186;
            var3.field2666 = this.field1166;
            var3.field2708 = this.field1207;
            var3.field2726 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("dh.am(IILis;I)V")
    public final void method2227(int arg0, int arg1, class212 arg2) {
        if (this.field1183 != -1 && class206.method5217(this.field1183).field2256 == 1) {
            this.field1183 = -1;
        }
        this.method2251();
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2202(arg0, arg1);
        } else if (this.field1212[0] >= 0 && this.field1212[0] < 104 && this.field1171[0] >= 0 && this.field1171[0] < 104) {
            if (class212.field2336 == arg2) {
                client.method4886(this, arg0, arg1, class212.field2336);
            }
            this.method2203(arg0, arg1, arg2);
        } else {
            this.method2202(arg0, arg1);
        }
    }

    @ObfuscatedName("dh.az(IIB)V")
    public void method2202(int arg0, int arg1) {
        this.field1211 = 0;
        this.field1216 = 0;
        this.field1215 = 0;
        this.field1212[0] = arg0;
        this.field1171[0] = arg1;
        int var3 = this.method2197();
        this.field1200 = this.field1212[0] * 128 + var3 * 64;
        this.field1205 = this.field1171[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("dh.ae(IILis;S)V")
    public final void method2203(int arg0, int arg1, class212 arg2) {
        if (this.field1211 < 9) {
            this.field1211++;
        }
        for (int var4 = this.field1211; var4 > 0; var4--) {
            this.field1212[var4] = this.field1212[var4 - 1];
            this.field1171[var4] = this.field1171[var4 - 1];
            this.field1214[var4] = this.field1214[var4 - 1];
        }
        this.field1212[0] = arg0;
        this.field1171[0] = arg1;
        this.field1214[0] = arg2;
    }

    @ObfuscatedName("dh.au(I)Z")
    public final boolean method2204() {
        return this.field1086 != null;
    }
}

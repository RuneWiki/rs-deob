package deob;

@ObfuscatedName("dj")
public final class class94 extends class98 {

    @ObfuscatedName("dj.ac")
    public class553 field1136;

    @ObfuscatedName("dj.al")
    public class344 field1120;

    @ObfuscatedName("dj.ak")
    public int field1131 = -1;

    @ObfuscatedName("dj.ax")
    public int field1119 = -1;

    @ObfuscatedName("dj.ah")
    public String[] field1123 = new String[3];

    @ObfuscatedName("dj.ar")
    public int field1124;

    @ObfuscatedName("dj.ab")
    public int field1130;

    @ObfuscatedName("dj.am")
    public int field1126;

    @ObfuscatedName("dj.av")
    public int field1127;

    @ObfuscatedName("dj.ag")
    public int field1142;

    @ObfuscatedName("dj.aa")
    public int field1129;

    @ObfuscatedName("dj.ap")
    public int field1128;

    @ObfuscatedName("dj.ay")
    public int field1121;

    @ObfuscatedName("dj.as")
    public class254 field1122;

    @ObfuscatedName("dj.aj")
    public int field1146;

    @ObfuscatedName("dj.au")
    public int field1134;

    @ObfuscatedName("dj.ai")
    public int field1135;

    @ObfuscatedName("dj.ae")
    public int field1145;

    @ObfuscatedName("dj.aw")
    public boolean field1137;

    @ObfuscatedName("dj.aq")
    public int field1138;

    @ObfuscatedName("dj.az")
    public boolean field1139;

    @ObfuscatedName("dj.at")
    public int field1140;

    @ObfuscatedName("dj.af")
    public int field1132;

    @ObfuscatedName("dj.ad")
    public class453 field1133;

    @ObfuscatedName("dj.bn")
    public class453 field1143;

    @ObfuscatedName("dj.bk")
    public class453 field1144;

    @ObfuscatedName("dj.by")
    public boolean field1125;

    @ObfuscatedName("dj.bd")
    public int field1141;

    @ObfuscatedName("dj.be")
    public int field1147;

    public class94() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1123[var1] = "";
        }
        this.field1124 = 0;
        this.field1130 = 0;
        this.field1127 = 0;
        this.field1142 = 0;
        this.field1137 = false;
        this.field1138 = 0;
        this.field1139 = false;
        this.field1133 = class453.field4716;
        this.field1143 = class453.field4716;
        this.field1144 = class453.field4716;
        this.field1125 = false;
    }

    @ObfuscatedName("dj.ac(Lul;B)V")
    public final void method2251(class530 arg0) {
        arg0.field5140 = 0;
        int var2 = arg0.method8365();
        boolean var3 = true;
        this.field1131 = arg0.method8366();
        this.field1119 = arg0.method8366();
        int var4 = -1;
        this.field1138 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method8365();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8365();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8598();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class221.method3594(var5[var6] - 512).field2292;
                    if (var9 != 0) {
                        this.field1138 = var9;
                    }
                }
            }
        }
        int[] var10 = null;
        if (client.field528 >= 213) {
            var10 = new int[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = arg0.method8365();
                if (var12 == 0) {
                    var10[var11] = 0;
                } else {
                    int var13 = arg0.method8365();
                    var10[var11] = (var12 << 8) + var13;
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg0.method8365();
            if (var16 < 0 || var16 >= Statics.field1343[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1242 = arg0.method8598();
        if (this.field1242 == 65535) {
            this.field1242 = -1;
        }
        this.field1193 = arg0.method8598();
        if (this.field1193 == 65535) {
            this.field1193 = -1;
        }
        this.field1194 = this.field1193;
        this.field1189 = arg0.method8598();
        if (this.field1189 == 65535) {
            this.field1189 = -1;
        }
        this.field1196 = arg0.method8598();
        if (this.field1196 == 65535) {
            this.field1196 = -1;
        }
        this.field1199 = arg0.method8598();
        if (this.field1199 == 65535) {
            this.field1199 = -1;
        }
        this.field1198 = arg0.method8598();
        if (this.field1198 == 65535) {
            this.field1198 = -1;
        }
        this.field1260 = arg0.method8598();
        if (this.field1260 == 65535) {
            this.field1260 = -1;
        }
        this.field1136 = new class553(arg0.method8588(), Statics.field1781);
        this.method2253();
        this.method2271();
        this.method2283();
        if (Statics.field2696 == this) {
            Statics.field5297 = this.field1136.method8985();
        }
        this.field1124 = arg0.method8365();
        this.field1130 = arg0.method8598();
        this.field1139 = arg0.method8365() == 1;
        if (client.field529 == 0 && client.field776 >= 2) {
            this.field1139 = false;
        }
        class186[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8598();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class186[12];
            for (int var21 = 0; var21 < 12; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    int var25 = var5[var21] - 512;
                    int var26 = arg0.method8365();
                    boolean var27 = (var26 & 0x1) != 0;
                    boolean var28 = (var26 & 0x2) != 0;
                    class186 var29 = new class186(var25);
                    if (var27) {
                        int var30 = arg0.method8365();
                        int[] var31 = new int[] { var30 & 0xF, var30 >> 4 & 0xF };
                        boolean var32 = var29.field1895 != null && var29.field1895.length == var31.length;
                        for (int var33 = 0; var33 < 2; var33++) {
                            if (var31[var33] != 15) {
                                short var34 = (short) arg0.method8598();
                                if (var32) {
                                    var29.field1895[var31[var33]] = var34;
                                }
                            }
                        }
                    }
                    if (var28) {
                        int var35 = arg0.method8365();
                        int[] var36 = new int[] { var35 & 0xF, var35 >> 4 & 0xF };
                        boolean var37 = var29.field1894 != null && var29.field1894.length == var36.length;
                        for (int var38 = 0; var38 < 2; var38++) {
                            if (var36[var38] != 15) {
                                short var39 = (short) arg0.method8598();
                                if (var37) {
                                    var29.field1894[var36[var38]] = var39;
                                }
                            }
                        }
                    }
                    var17[var21] = var29;
                }
            }
        }
        for (int var41 = 0; var41 < 3; var41++) {
            this.field1123[var41] = arg0.method8588();
        }
        int var42 = arg0.method8365();
        if (this.field1120 == null) {
            this.field1120 = new class344();
        }
        this.field1120.method5665(var10, var5, var17, var20, var14, var2, var4, var42);
    }

    @ObfuscatedName("dj.ak(I)Z")
    public boolean method2252() {
        if (class453.field4716 == this.field1133) {
            this.method2293();
        }
        return class453.field4720 == this.field1133;
    }

    @ObfuscatedName("dj.ax(B)V")
    public void method2253() {
        this.field1133 = class453.field4716;
    }

    @ObfuscatedName("dj.ao(S)V")
    public void method2293() {
        this.field1133 = Statics.field1907.method1807(this.field1136) ? class453.field4720 : class453.field4717;
    }

    @ObfuscatedName("dj.ar(B)Z")
    public boolean method2255() {
        if (class453.field4716 == this.field1143) {
            this.method2256();
        }
        return class453.field4720 == this.field1143;
    }

    @ObfuscatedName("dj.ab(B)V")
    public void method2271() {
        this.field1143 = class453.field4716;
    }

    @ObfuscatedName("dj.am(S)V")
    public void method2256() {
        this.field1143 = Statics.field3897 != null && Statics.field3897.method7359(this.field1136) ? class453.field4720 : class453.field4717;
    }

    @ObfuscatedName("dj.av(I)V")
    public void method2258() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field607[var1] != null && client.field607[var1].method3017(this.field1136.method8985()) != -1 && var1 != 2) {
                this.field1144 = class453.field4720;
                return;
            }
        }
        this.field1144 = class453.field4717;
    }

    @ObfuscatedName("dj.ag(B)V")
    public void method2283() {
        this.field1144 = class453.field4716;
    }

    @ObfuscatedName("dj.aa(B)Z")
    public boolean method2288() {
        if (class453.field4716 == this.field1144) {
            this.method2258();
        }
        return class453.field4720 == this.field1144;
    }

    @ObfuscatedName("dj.ap(I)I")
    public int method2261() {
        return this.field1120 == null || this.field1120.field3617 == -1 ? 1 : class206.method3320(this.field1120.field3617).field2050;
    }

    @ObfuscatedName("dj.al(B)Ljn;")
    public final class254 method2007() {
        if (this.field1120 == null) {
            return null;
        }
        class223 var1 = this.field1232 != -1 && this.field1235 == 0 ? class223.method687(this.field1232) : null;
        class223 var2 = this.field1228 == -1 || this.field1137 || this.field1242 == this.field1228 && var1 != null ? null : class223.method687(this.field1228);
        class254 var3 = this.field1120.method5679(var1, this.field1192, var2, this.field1229);
        if (var3 == null) {
            return null;
        }
        var3.method4543();
        this.field1211 = var3.field2662;
        int var4 = var3.field2750;
        if (!this.field1137) {
            var3 = this.method2332(var3);
        }
        if (!this.field1137 && this.field1122 != null) {
            if (client.field533 >= this.field1142) {
                this.field1122 = null;
            }
            if (client.field533 >= this.field1127 && client.field533 < this.field1142) {
                class254 var5 = this.field1122;
                var5.method4558(this.field1129 - this.field1227, this.field1128 - this.field1126, this.field1121 - this.field1187);
                if (this.field1209 == 512) {
                    var5.method4636();
                    var5.method4636();
                    var5.method4636();
                } else if (this.field1209 == 1024) {
                    var5.method4636();
                    var5.method4636();
                } else if (this.field1209 == 1536) {
                    var5.method4636();
                }
                class254[] var6 = new class254[] { var3, var5 };
                var3 = new class254(var6, 2);
                if (this.field1209 == 512) {
                    var5.method4636();
                } else if (this.field1209 == 1024) {
                    var5.method4636();
                    var5.method4636();
                } else if (this.field1209 == 1536) {
                    var5.method4636();
                    var5.method4636();
                    var5.method4636();
                }
                var5.method4558(this.field1227 - this.field1129, this.field1126 - this.field1128, this.field1187 - this.field1121);
            }
        }
        var3.field2756 = true;
        if (this.field1253 == 0 || client.field533 < this.field1248 || client.field533 >= this.field1249) {
            var3.field2801 = 0;
        } else {
            var3.field2798 = this.field1250;
            var3.field2770 = this.field1251;
            var3.field2800 = this.field1252;
            var3.field2801 = this.field1253;
            var3.field2802 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("dj.ay(IILip;I)V")
    public final void method2262(int arg0, int arg1, class232 arg2) {
        if (this.field1232 != -1 && class223.method687(this.field1232).field2340 == 1) {
            this.field1232 = -1;
        }
        this.method2316();
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2291(arg0, arg1);
        } else if (this.field1258[0] >= 0 && this.field1258[0] < 104 && this.field1259[0] >= 0 && this.field1259[0] < 104) {
            if (class232.field2428 == arg2) {
                client.method3275(this, arg0, arg1, class232.field2428);
            }
            this.method2264(arg0, arg1, arg2);
        } else {
            this.method2291(arg0, arg1);
        }
    }

    @ObfuscatedName("dj.as(IIB)V")
    public void method2291(int arg0, int arg1) {
        this.field1219 = 0;
        this.field1262 = 0;
        this.field1234 = 0;
        this.field1258[0] = arg0;
        this.field1259[0] = arg1;
        int var3 = this.method2261();
        this.field1227 = this.field1258[0] * 128 + var3 * 64;
        this.field1187 = this.field1259[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("dj.aj(IILip;B)V")
    public final void method2264(int arg0, int arg1, class232 arg2) {
        if (this.field1219 < 9) {
            this.field1219++;
        }
        for (int var4 = this.field1219; var4 > 0; var4--) {
            this.field1258[var4] = this.field1258[var4 - 1];
            this.field1259[var4] = this.field1259[var4 - 1];
            this.field1200[var4] = this.field1200[var4 - 1];
        }
        this.field1258[0] = arg0;
        this.field1259[0] = arg1;
        this.field1200[0] = arg2;
    }

    @ObfuscatedName("dj.an(B)Z")
    public final boolean method2265() {
        return this.field1120 != null;
    }
}

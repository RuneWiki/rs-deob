package deob;

@ObfuscatedName("df")
public final class class92 extends class96 {

    @ObfuscatedName("df.au")
    public class538 field1146;

    @ObfuscatedName("df.ae")
    public class329 field1129;

    @ObfuscatedName("df.ao")
    public int field1130 = -1;

    @ObfuscatedName("df.at")
    public int field1131 = -1;

    @ObfuscatedName("df.ai")
    public String[] field1132 = new String[3];

    @ObfuscatedName("df.az")
    public int field1134;

    @ObfuscatedName("df.ap")
    public int field1143;

    @ObfuscatedName("df.aa")
    public int field1135;

    @ObfuscatedName("df.af")
    public int field1137;

    @ObfuscatedName("df.ad")
    public int field1148;

    @ObfuscatedName("df.aq")
    public int field1139;

    @ObfuscatedName("df.al")
    public int field1140;

    @ObfuscatedName("df.ar")
    public int field1141;

    @ObfuscatedName("df.ab")
    public class240 field1142;

    @ObfuscatedName("df.ag")
    public int field1154;

    @ObfuscatedName("df.am")
    public int field1144;

    @ObfuscatedName("df.ax")
    public int field1145;

    @ObfuscatedName("df.ah")
    public int field1133;

    @ObfuscatedName("df.as")
    public boolean field1147;

    @ObfuscatedName("df.ay")
    public int field1156;

    @ObfuscatedName("df.aj")
    public boolean field1149;

    @ObfuscatedName("df.av")
    public int field1150;

    @ObfuscatedName("df.aw")
    public int field1128;

    @ObfuscatedName("df.ak")
    public class438 field1152;

    @ObfuscatedName("df.bh")
    public class438 field1153;

    @ObfuscatedName("df.bj")
    public class438 field1136;

    @ObfuscatedName("df.bk")
    public boolean field1155;

    @ObfuscatedName("df.bv")
    public int field1151;

    @ObfuscatedName("df.bt")
    public int field1157;

    public class92() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1132[var1] = "";
        }
        this.field1134 = 0;
        this.field1143 = 0;
        this.field1137 = 0;
        this.field1148 = 0;
        this.field1147 = false;
        this.field1156 = 0;
        this.field1149 = false;
        this.field1152 = class438.field4675;
        this.field1153 = class438.field4675;
        this.field1136 = class438.field4675;
        this.field1155 = false;
    }

    @ObfuscatedName("df.au(Ltm;I)V")
    public final void method2207(class515 arg0) {
        arg0.field5111 = 0;
        int var2 = arg0.method8300();
        boolean var3 = true;
        this.field1130 = arg0.method8301();
        this.field1131 = arg0.method8301();
        int var4 = -1;
        this.field1156 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method8300();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8300();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8448();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class207.method3280(var5[var6] - 512).field2276;
                    if (var9 != 0) {
                        this.field1156 = var9;
                    }
                }
            }
        }
        int[] var10 = null;
        if (client.field709 >= 213) {
            var10 = new int[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = arg0.method8300();
                if (var12 == 0) {
                    var10[var11] = 0;
                } else {
                    int var13 = arg0.method8300();
                    var10[var11] = (var12 << 8) + var13;
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg0.method8300();
            if (var16 < 0 || var16 >= Statics.field1660[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1204 = arg0.method8448();
        if (this.field1204 == 65535) {
            this.field1204 = -1;
        }
        this.field1205 = arg0.method8448();
        if (this.field1205 == 65535) {
            this.field1205 = -1;
        }
        this.field1266 = this.field1205;
        this.field1207 = arg0.method8448();
        if (this.field1207 == 65535) {
            this.field1207 = -1;
        }
        this.field1208 = arg0.method8448();
        if (this.field1208 == 65535) {
            this.field1208 = -1;
        }
        this.field1209 = arg0.method8448();
        if (this.field1209 == 65535) {
            this.field1209 = -1;
        }
        this.field1257 = arg0.method8448();
        if (this.field1257 == 65535) {
            this.field1257 = -1;
        }
        this.field1268 = arg0.method8448();
        if (this.field1268 == 65535) {
            this.field1268 = -1;
        }
        this.field1146 = new class538(arg0.method8311(), Statics.field4388);
        this.method2209();
        this.method2212();
        this.method2253();
        if (Statics.field2132 == this) {
            Statics.field5264 = this.field1146.method8917();
        }
        this.field1134 = arg0.method8300();
        this.field1143 = arg0.method8448();
        this.field1149 = arg0.method8300() == 1;
        if (client.field552 == 0 && client.field615 >= 2) {
            this.field1149 = false;
        }
        class184[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8448();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class184[12];
            for (int var21 = 0; var21 < 12; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    int var25 = var5[var21] - 512;
                    int var26 = arg0.method8300();
                    boolean var27 = (var26 & 0x1) != 0;
                    boolean var28 = (var26 & 0x2) != 0;
                    class184 var29 = new class184(var25);
                    if (var27) {
                        int var30 = arg0.method8300();
                        int[] var31 = new int[] { var30 & 0xF, var30 >> 4 & 0xF };
                        boolean var32 = var29.field1919 != null && var29.field1919.length == var31.length;
                        for (int var33 = 0; var33 < 2; var33++) {
                            if (var31[var33] != 15) {
                                short var34 = (short) arg0.method8448();
                                if (var32) {
                                    var29.field1919[var31[var33]] = var34;
                                }
                            }
                        }
                    }
                    if (var28) {
                        int var35 = arg0.method8300();
                        int[] var36 = new int[] { var35 & 0xF, var35 >> 4 & 0xF };
                        boolean var37 = var29.field1920 != null && var29.field1920.length == var36.length;
                        for (int var38 = 0; var38 < 2; var38++) {
                            if (var36[var38] != 15) {
                                short var39 = (short) arg0.method8448();
                                if (var37) {
                                    var29.field1920[var36[var38]] = var39;
                                }
                            }
                        }
                    }
                    var17[var21] = var29;
                }
            }
        }
        for (int var41 = 0; var41 < 3; var41++) {
            this.field1132[var41] = arg0.method8311();
        }
        int var42 = arg0.method8300();
        if (this.field1129 == null) {
            this.field1129 = new class329();
        }
        this.field1129.method5517(var10, var5, var17, var20, var14, var2, var4, var42);
    }

    @ObfuscatedName("df.ao(I)Z")
    public boolean method2208() {
        if (class438.field4675 == this.field1152) {
            this.method2210();
        }
        return class438.field4674 == this.field1152;
    }

    @ObfuscatedName("df.at(I)V")
    public void method2209() {
        this.field1152 = class438.field4675;
    }

    @ObfuscatedName("df.az(I)V")
    public void method2210() {
        this.field1152 = Statics.field3367.method1822(this.field1146) ? class438.field4674 : class438.field4673;
    }

    @ObfuscatedName("df.ap(I)Z")
    public boolean method2211() {
        if (class438.field4675 == this.field1153) {
            this.method2215();
        }
        return class438.field4674 == this.field1153;
    }

    @ObfuscatedName("df.aa(I)V")
    public void method2212() {
        this.field1153 = class438.field4675;
    }

    @ObfuscatedName("df.af(I)V")
    public void method2215() {
        this.field1153 = Statics.field265 != null && Statics.field265.method7307(this.field1146) ? class438.field4674 : class438.field4673;
    }

    @ObfuscatedName("df.ad(I)V")
    public void method2214() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field771[var1] != null && client.field771[var1].method2999(this.field1146.method8917()) != -1 && var1 != 2) {
                this.field1136 = class438.field4674;
                return;
            }
        }
        this.field1136 = class438.field4673;
    }

    @ObfuscatedName("df.aq(I)V")
    public void method2253() {
        this.field1136 = class438.field4675;
    }

    @ObfuscatedName("df.al(I)Z")
    public boolean method2219() {
        if (class438.field4675 == this.field1136) {
            this.method2214();
        }
        return class438.field4674 == this.field1136;
    }

    @ObfuscatedName("df.an(I)I")
    public int method2213() {
        return this.field1129 == null || this.field1129.field3569 == -1 ? 1 : class196.method2202(this.field1129.field3569).field2038;
    }

    @ObfuscatedName("df.ae(I)Ljr;")
    public final class240 method1990() {
        if (this.field1129 == null) {
            return null;
        }
        class209 var1 = this.field1243 != -1 && this.field1260 == 0 ? class209.method3394(this.field1243) : null;
        class209 var2 = this.field1211 == -1 || this.field1147 || this.field1211 == this.field1204 && var1 != null ? null : class209.method3394(this.field1211);
        class240 var3 = this.field1129.method5543(var1, this.field1244, var2, this.field1198);
        if (var3 == null) {
            return null;
        }
        var3.method4450();
        this.field1258 = var3.field2638;
        int var4 = var3.field2712;
        if (!this.field1147) {
            var3 = this.method2277(var3);
        }
        if (!this.field1147 && this.field1142 != null) {
            if (client.field833 >= this.field1148) {
                this.field1142 = null;
            }
            if (client.field833 >= this.field1137 && client.field833 < this.field1148) {
                class240 var5 = this.field1142;
                var5.method4451(this.field1139 - this.field1228, this.field1140 - this.field1135, this.field1141 - this.field1199);
                if (this.field1239 == 512) {
                    var5.method4462();
                    var5.method4462();
                    var5.method4462();
                } else if (this.field1239 == 1024) {
                    var5.method4462();
                    var5.method4462();
                } else if (this.field1239 == 1536) {
                    var5.method4462();
                }
                class240[] var6 = new class240[] { var3, var5 };
                var3 = new class240(var6, 2);
                if (this.field1239 == 512) {
                    var5.method4462();
                } else if (this.field1239 == 1024) {
                    var5.method4462();
                    var5.method4462();
                } else if (this.field1239 == 1536) {
                    var5.method4462();
                    var5.method4462();
                    var5.method4462();
                }
                var5.method4451(this.field1228 - this.field1139, this.field1135 - this.field1140, this.field1199 - this.field1141);
            }
        }
        var3.field2713 = true;
        if (this.field1251 == 0 || client.field833 < this.field1259 || client.field833 >= this.field1201) {
            var3.field2778 = 0;
        } else {
            var3.field2772 = this.field1261;
            var3.field2740 = this.field1219;
            var3.field2738 = this.field1213;
            var3.field2778 = this.field1251;
            var3.field2779 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("df.ar(IILin;I)V")
    public final void method2245(int arg0, int arg1, class218 arg2) {
        if (this.field1243 != -1 && class209.method3394(this.field1243).field2327 == 1) {
            this.field1243 = -1;
        }
        this.method2288();
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2218(arg0, arg1);
        } else if (this.field1273[0] >= 0 && this.field1273[0] < 104 && this.field1270[0] >= 0 && this.field1270[0] < 104) {
            if (class218.field2408 == arg2) {
                class92 var4 = this;
                class218 var5 = class218.field2408;
                int var6 = this.field1273[0];
                int var7 = this.field1270[0];
                int var8 = this.method2213();
                if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && arg0 >= var8 && arg0 < 104 - var8 && arg1 >= var8 && arg1 < 104 - var8) {
                    int var9 = this.method2213();
                    class216 var10 = client.method5209(arg0, arg1);
                    class214 var11 = client.field602[this.field1150];
                    int[] var12 = client.field830;
                    int[] var13 = client.field831;
                    int var14 = class219.method10(var6, var7, var9, var10, var11, true, var12, var13, Statics.field2413[0]);
                    int var15 = var14;
                    if (var14 >= 1) {
                        for (int var16 = 0; var16 < var15 - 1; var16++) {
                            var4.method2234(client.field830[var16], client.field831[var16], var5);
                        }
                    }
                }
            }
            this.method2234(arg0, arg1, arg2);
        } else {
            this.method2218(arg0, arg1);
        }
    }

    @ObfuscatedName("df.ab(III)V")
    public void method2218(int arg0, int arg1) {
        this.field1246 = 0;
        this.field1262 = 0;
        this.field1272 = 0;
        this.field1273[0] = arg0;
        this.field1270[0] = arg1;
        int var3 = this.method2213();
        this.field1228 = this.field1273[0] * 128 + var3 * 64;
        this.field1199 = this.field1270[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("df.ag(IILin;I)V")
    public final void method2234(int arg0, int arg1, class218 arg2) {
        if (this.field1246 < 9) {
            this.field1246++;
        }
        for (int var4 = this.field1246; var4 > 0; var4--) {
            this.field1273[var4] = this.field1273[var4 - 1];
            this.field1270[var4] = this.field1270[var4 - 1];
            this.field1271[var4] = this.field1271[var4 - 1];
        }
        this.field1273[0] = arg0;
        this.field1270[0] = arg1;
        this.field1271[0] = arg2;
    }

    @ObfuscatedName("df.am(I)Z")
    public final boolean method2220() {
        return this.field1129 != null;
    }
}

package deob;

@ObfuscatedName("dj")
public final class class93 extends class97 {

    @ObfuscatedName("dj.aq")
    public class557 field1162;

    @ObfuscatedName("dj.aw")
    public class347 field1158;

    @ObfuscatedName("dj.al")
    public int field1136 = -1;

    @ObfuscatedName("dj.ai")
    public int field1160 = -1;

    @ObfuscatedName("dj.as")
    public String[] field1139 = new String[3];

    @ObfuscatedName("dj.aa")
    public int field1140;

    @ObfuscatedName("dj.az")
    public int field1141;

    @ObfuscatedName("dj.ao")
    public int field1142;

    @ObfuscatedName("dj.au")
    public int field1161;

    @ObfuscatedName("dj.ak")
    public int field1144;

    @ObfuscatedName("dj.ah")
    public int field1145;

    @ObfuscatedName("dj.aj")
    public int field1146;

    @ObfuscatedName("dj.af")
    public int field1147;

    @ObfuscatedName("dj.ax")
    public class285 field1154;

    @ObfuscatedName("dj.ag")
    public int field1149;

    @ObfuscatedName("dj.am")
    public int field1134;

    @ObfuscatedName("dj.ad")
    public int field1151;

    @ObfuscatedName("dj.at")
    public int field1152;

    @ObfuscatedName("dj.ay")
    public boolean field1137;

    @ObfuscatedName("dj.ae")
    public int field1163;

    @ObfuscatedName("dj.ac")
    public boolean field1155;

    @ObfuscatedName("dj.ab")
    public int field1156;

    @ObfuscatedName("dj.av")
    public int field1157;

    @ObfuscatedName("dj.ap")
    public class457 field1135;

    @ObfuscatedName("dj.bu")
    public class457 field1159;

    @ObfuscatedName("dj.bo")
    public class457 field1153;

    @ObfuscatedName("dj.bd")
    public boolean field1148;

    @ObfuscatedName("dj.bi")
    public int field1150;

    @ObfuscatedName("dj.bq")
    public int field1143;

    public class93() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1139[var1] = "";
        }
        this.field1140 = 0;
        this.field1141 = 0;
        this.field1161 = 0;
        this.field1144 = 0;
        this.field1137 = false;
        this.field1163 = 0;
        this.field1155 = false;
        this.field1135 = class457.field4776;
        this.field1159 = class457.field4776;
        this.field1153 = class457.field4776;
        this.field1148 = false;
    }

    @ObfuscatedName("dj.aq(Luq;B)V")
    public final void method2293(class534 arg0) {
        arg0.field5200 = 0;
        byte var2 = arg0.method8592();
        boolean var3 = true;
        this.field1136 = arg0.method8592();
        this.field1160 = arg0.method8592();
        int var4 = -1;
        this.field1163 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method8591();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8591();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8593();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class205.method6353(var5[var6] - 512).field2224;
                    if (var9 != 0) {
                        this.field1163 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[12];
        for (int var11 = 0; var11 < 12; var11++) {
            int var12 = arg0.method8591();
            if (var12 == 0) {
                var10[var11] = 0;
            } else {
                int var13 = arg0.method8591();
                var10[var11] = (var12 << 8) + var13;
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg0.method8591();
            if (var16 < 0 || var16 >= Statics.field4548[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1212 = arg0.method8593();
        if (this.field1212 == 65535) {
            this.field1212 = -1;
        }
        this.field1267 = arg0.method8593();
        if (this.field1267 == 65535) {
            this.field1267 = -1;
        }
        this.field1214 = this.field1267;
        this.field1215 = arg0.method8593();
        if (this.field1215 == 65535) {
            this.field1215 = -1;
        }
        this.field1216 = arg0.method8593();
        if (this.field1216 == 65535) {
            this.field1216 = -1;
        }
        this.field1282 = arg0.method8593();
        if (this.field1282 == 65535) {
            this.field1282 = -1;
        }
        this.field1218 = arg0.method8593();
        if (this.field1218 == 65535) {
            this.field1218 = -1;
        }
        this.field1219 = arg0.method8593();
        if (this.field1219 == 65535) {
            this.field1219 = -1;
        }
        this.field1162 = new class557(arg0.method8741(), Statics.field4750);
        this.method2277();
        this.method2280();
        this.method2278();
        if (Statics.field1858 == this) {
            Statics.field5365 = this.field1162.method9185();
        }
        this.field1140 = arg0.method8591();
        this.field1141 = arg0.method8593();
        this.field1155 = arg0.method8591() == 1;
        if (client.field821 == 0 && client.field676 >= 2) {
            this.field1155 = false;
        }
        class171[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8593();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class171[12];
            for (int var21 = 0; var21 < 12; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    int var25 = var5[var21] - 512;
                    int var26 = arg0.method8591();
                    boolean var27 = (var26 & 0x1) != 0;
                    boolean var28 = (var26 & 0x2) != 0;
                    class171 var29 = new class171(var25);
                    if (var27) {
                        int var30 = arg0.method8591();
                        int[] var31 = new int[] { var30 & 0xF, var30 >> 4 & 0xF };
                        boolean var32 = var29.field1835 != null && var29.field1835.length == var31.length;
                        for (int var33 = 0; var33 < 2; var33++) {
                            if (var31[var33] != 15) {
                                short var34 = (short) arg0.method8593();
                                if (var32) {
                                    var29.field1835[var31[var33]] = var34;
                                }
                            }
                        }
                    }
                    if (var28) {
                        int var35 = arg0.method8591();
                        int[] var36 = new int[] { var35 & 0xF, var35 >> 4 & 0xF };
                        boolean var37 = var29.field1836 != null && var29.field1836.length == var36.length;
                        for (int var38 = 0; var38 < 2; var38++) {
                            if (var36[var38] != 15) {
                                short var39 = (short) arg0.method8593();
                                if (var37) {
                                    var29.field1836[var36[var38]] = var39;
                                }
                            }
                        }
                    }
                    var17[var21] = var29;
                }
            }
        }
        for (int var41 = 0; var41 < 3; var41++) {
            this.field1139[var41] = arg0.method8741();
        }
        byte var42 = arg0.method8592();
        if (this.field1158 == null) {
            this.field1158 = new class347();
        }
        this.field1158.method5813(var10, var5, var17, var20, var14, var2, var4, var42);
    }

    @ObfuscatedName("dj.al(I)Z")
    public boolean method2276() {
        if (class457.field4776 == this.field1135) {
            this.method2286();
        }
        return class457.field4773 == this.field1135;
    }

    @ObfuscatedName("dj.ai(I)V")
    public void method2277() {
        this.field1135 = class457.field4776;
    }

    @ObfuscatedName("dj.az(I)V")
    public void method2286() {
        this.field1135 = Statics.field1091.method1839(this.field1162) ? class457.field4773 : class457.field4775;
    }

    @ObfuscatedName("dj.ao(I)Z")
    public boolean method2279() {
        if (class457.field4776 == this.field1159) {
            this.method2287();
        }
        return class457.field4773 == this.field1159;
    }

    @ObfuscatedName("dj.au(I)V")
    public void method2280() {
        this.field1159 = class457.field4776;
    }

    @ObfuscatedName("dj.ak(I)V")
    public void method2287() {
        this.field1159 = Statics.field1010 != null && Statics.field1010.method7590(this.field1162) ? class457.field4773 : class457.field4775;
    }

    @ObfuscatedName("dj.ah(B)V")
    public void method2282() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field771[var1] != null && client.field771[var1].method3143(this.field1162.method9185()) != -1 && var1 != 2) {
                this.field1153 = class457.field4773;
                return;
            }
        }
        this.field1153 = class457.field4775;
    }

    @ObfuscatedName("dj.aj(B)V")
    public void method2278() {
        this.field1153 = class457.field4776;
    }

    @ObfuscatedName("dj.af(I)Z")
    public boolean method2307() {
        if (class457.field4776 == this.field1153) {
            this.method2282();
        }
        return class457.field4773 == this.field1153;
    }

    @ObfuscatedName("dj.ax(B)I")
    public int method2285() {
        return this.field1158 == null || this.field1158.field3663 == -1 ? 1 : class190.method3274(this.field1158.field3663).field1986;
    }

    @ObfuscatedName("dj.aw(I)Lkz;")
    public final class285 method2016() {
        if (this.field1158 == null) {
            return null;
        }
        class207 var1 = this.field1251 != -1 && this.field1254 == 0 ? class207.method3902(this.field1251) : null;
        class207 var2 = this.field1247 == -1 || this.field1137 || this.field1247 == this.field1212 && var1 != null ? null : class207.method3902(this.field1247);
        class285 var3 = this.field1158.method5837(var1, this.field1231, var2, this.field1248);
        if (var3 == null) {
            return null;
        }
        var3.method5204();
        this.field1207 = var3.field2924;
        int var4 = var3.field2994;
        if (!this.field1137) {
            var3 = this.method2355(var3);
        }
        if (!this.field1137 && this.field1154 != null) {
            if (client.field536 >= this.field1144) {
                this.field1154 = null;
            }
            if (client.field536 >= this.field1161 && client.field536 < this.field1144) {
                class285 var5 = this.field1154;
                var5.method5170(this.field1145 - this.field1208, this.field1146 - this.field1142, this.field1147 - this.field1253);
                if (this.field1273 == 512) {
                    var5.method5251();
                    var5.method5251();
                    var5.method5251();
                } else if (this.field1273 == 1024) {
                    var5.method5251();
                    var5.method5251();
                } else if (this.field1273 == 1536) {
                    var5.method5251();
                }
                class285[] var6 = new class285[] { var3, var5 };
                var3 = new class285(var6, 2);
                if (this.field1273 == 512) {
                    var5.method5251();
                } else if (this.field1273 == 1024) {
                    var5.method5251();
                    var5.method5251();
                } else if (this.field1273 == 1536) {
                    var5.method5251();
                    var5.method5251();
                    var5.method5251();
                }
                var5.method5170(this.field1208 - this.field1145, this.field1142 - this.field1146, this.field1253 - this.field1147);
            }
        }
        var3.field3028 = true;
        if (this.field1256 == 0 || client.field536 < this.field1263 || client.field536 >= this.field1279) {
            var3.field3059 = 0;
        } else {
            var3.field3056 = this.field1269;
            var3.field3057 = this.field1270;
            var3.field3058 = this.field1277;
            var3.field3059 = this.field1256;
            var3.field3060 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("dj.an(IILip;I)V")
    public final void method2319(int arg0, int arg1, class234 arg2) {
        if (this.field1251 != -1 && class207.method3902(this.field1251).field2274 == 1) {
            this.field1251 = -1;
        }
        this.method2356();
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2288(arg0, arg1);
        } else if (this.field1235[0] >= 0 && this.field1235[0] < 104 && this.field1278[0] >= 0 && this.field1278[0] < 104) {
            if (class234.field2473 == arg2) {
                class93 var4 = this;
                class234 var5 = class234.field2473;
                int var6 = this.field1235[0];
                int var7 = this.field1278[0];
                int var8 = this.method2285();
                if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && arg0 >= var8 && arg0 < 104 - var8 && arg1 >= var8 && arg1 < 104 - var8) {
                    int var9 = client.field828.method4160(var6, var7, this.method2285(), client.method6664(arg0, arg1), client.field600[this.field1156], true, client.field748, client.field834);
                    if (var9 >= 1) {
                        for (int var10 = 0; var10 < var9 - 1; var10++) {
                            var4.method2321(client.field748[var10], client.field834[var10], var5);
                        }
                    }
                }
            }
            this.method2321(arg0, arg1, arg2);
        } else {
            this.method2288(arg0, arg1);
        }
    }

    @ObfuscatedName("dj.ag(III)V")
    public void method2288(int arg0, int arg1) {
        this.field1276 = 0;
        this.field1281 = 0;
        this.field1280 = 0;
        this.field1235[0] = arg0;
        this.field1278[0] = arg1;
        int var3 = this.method2285();
        this.field1208 = this.field1235[0] * 128 + var3 * 64;
        this.field1253 = this.field1278[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("dj.am(IILip;I)V")
    public final void method2321(int arg0, int arg1, class234 arg2) {
        if (this.field1276 < 9) {
            this.field1276++;
        }
        for (int var4 = this.field1276; var4 > 0; var4--) {
            this.field1235[var4] = this.field1235[var4 - 1];
            this.field1278[var4] = this.field1278[var4 - 1];
            this.field1274[var4] = this.field1274[var4 - 1];
        }
        this.field1235[0] = arg0;
        this.field1278[0] = arg1;
        this.field1274[0] = arg2;
    }

    @ObfuscatedName("dj.ad(S)Z")
    public final boolean method2289() {
        return this.field1158 != null;
    }
}

package deob;

@ObfuscatedName("de")
public final class class94 extends class98 {

    @ObfuscatedName("de.ak")
    public class568 field1153;

    @ObfuscatedName("de.al")
    public class355 field1157;

    @ObfuscatedName("de.aj")
    public int field1137 = -1;

    @ObfuscatedName("de.az")
    public int field1138 = -1;

    @ObfuscatedName("de.aa")
    public String[] field1140 = new String[3];

    @ObfuscatedName("de.at")
    public int field1148;

    @ObfuscatedName("de.ab")
    public int field1142;

    @ObfuscatedName("de.ac")
    public int field1149;

    @ObfuscatedName("de.ao")
    public int field1144;

    @ObfuscatedName("de.ah")
    public int field1145;

    @ObfuscatedName("de.av")
    public int field1146;

    @ObfuscatedName("de.aq")
    public int field1147;

    @ObfuscatedName("de.ap")
    public int field1155;

    @ObfuscatedName("de.ae")
    public class264 field1159;

    @ObfuscatedName("de.ax")
    public int field1150;

    @ObfuscatedName("de.ay")
    public int field1156;

    @ObfuscatedName("de.au")
    public int field1152;

    @ObfuscatedName("de.as")
    public int field1141;

    @ObfuscatedName("de.aw")
    public boolean field1154;

    @ObfuscatedName("de.ad")
    public int field1165;

    @ObfuscatedName("de.ai")
    public boolean field1143;

    @ObfuscatedName("de.am")
    public int field1151;

    @ObfuscatedName("de.ar")
    public int field1158;

    @ObfuscatedName("de.ag")
    public class475 field1136;

    @ObfuscatedName("de.bs")
    public class475 field1160;

    @ObfuscatedName("de.bf")
    public class475 field1161;

    @ObfuscatedName("de.bo")
    public boolean field1162;

    @ObfuscatedName("de.bi")
    public int field1163;

    @ObfuscatedName("de.bt")
    public int field1164;

    @ObfuscatedName("de.bn")
    public class102 field1135;

    public class94() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1140[var1] = "";
        }
        this.field1148 = 0;
        this.field1142 = 0;
        this.field1144 = 0;
        this.field1145 = 0;
        this.field1154 = false;
        this.field1165 = 0;
        this.field1143 = false;
        this.field1136 = class475.field4937;
        this.field1160 = class475.field4937;
        this.field1161 = class475.field4937;
        this.field1162 = false;
        this.field1135 = Statics.field3967;
    }

    @ObfuscatedName("de.aq(Lua;I)V")
    public final void method2278(class546 arg0) {
        arg0.field5344 = 0;
        byte var2 = arg0.method8797();
        boolean var3 = true;
        this.field1137 = arg0.method8797();
        this.field1138 = arg0.method8797();
        int var4 = -1;
        this.field1165 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method8796();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8796();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8798();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class225.method369(var5[var6] - 512).field2381;
                    if (var9 != 0) {
                        this.field1165 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[12];
        for (int var11 = 0; var11 < 12; var11++) {
            int var12 = arg0.method8796();
            if (var12 == 0) {
                var10[var11] = 0;
            } else {
                int var13 = arg0.method8796();
                var10[var11] = (var12 << 8) + var13;
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg0.method8796();
            if (var16 < 0 || var16 >= Statics.field4781[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1211 = arg0.method8798();
        if (this.field1211 == 65535) {
            this.field1211 = -1;
        }
        this.field1242 = arg0.method8798();
        if (this.field1242 == 65535) {
            this.field1242 = -1;
        }
        this.field1213 = this.field1242;
        this.field1214 = arg0.method8798();
        if (this.field1214 == 65535) {
            this.field1214 = -1;
        }
        this.field1223 = arg0.method8798();
        if (this.field1223 == 65535) {
            this.field1223 = -1;
        }
        this.field1206 = arg0.method8798();
        if (this.field1206 == 65535) {
            this.field1206 = -1;
        }
        this.field1217 = arg0.method8798();
        if (this.field1217 == 65535) {
            this.field1217 = -1;
        }
        this.field1218 = arg0.method8798();
        if (this.field1218 == 65535) {
            this.field1218 = -1;
        }
        this.field1153 = new class568(arg0.method8806(), Statics.field2521);
        this.method2260();
        this.method2263();
        this.method2266();
        if (Statics.field84 == this) {
            Statics.field5487 = this.field1153.method9385();
        }
        this.field1148 = arg0.method8796();
        this.field1142 = arg0.method8798();
        this.field1143 = arg0.method8796() == 1;
        if (client.field575 == 0 && client.field669 >= 2) {
            this.field1143 = false;
        }
        class191[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8798();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class191[12];
            for (int var21 = 0; var21 < 12; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    int var25 = var5[var21] - 512;
                    int var26 = arg0.method8796();
                    boolean var27 = (var26 & 0x1) != 0;
                    boolean var28 = (var26 & 0x2) != 0;
                    class191 var29 = new class191(var25);
                    if (var27) {
                        int var30 = arg0.method8796();
                        int[] var31 = new int[] { var30 & 0xF, var30 >> 4 & 0xF };
                        boolean var32 = var29.field1977 != null && var29.field1977.length == var31.length;
                        for (int var33 = 0; var33 < 2; var33++) {
                            if (var31[var33] != 15) {
                                short var34 = (short) arg0.method8798();
                                if (var32) {
                                    var29.field1977[var31[var33]] = var34;
                                }
                            }
                        }
                    }
                    if (var28) {
                        int var35 = arg0.method8796();
                        int[] var36 = new int[] { var35 & 0xF, var35 >> 4 & 0xF };
                        boolean var37 = var29.field1975 != null && var29.field1975.length == var36.length;
                        for (int var38 = 0; var38 < 2; var38++) {
                            if (var36[var38] != 15) {
                                short var39 = (short) arg0.method8798();
                                if (var37) {
                                    var29.field1975[var36[var38]] = var39;
                                }
                            }
                        }
                    }
                    var17[var21] = var29;
                }
            }
        }
        for (int var41 = 0; var41 < 3; var41++) {
            this.field1140[var41] = arg0.method8806();
        }
        byte var42 = arg0.method8797();
        if (this.field1157 == null) {
            this.field1157 = new class355();
        }
        this.field1157.method5967(var10, var5, var17, var20, var14, var2, var4, var42);
    }

    @ObfuscatedName("de.ap(I)Z")
    public boolean method2259() {
        if (class475.field4937 == this.field1136) {
            this.method2261();
        }
        return class475.field4936 == this.field1136;
    }

    @ObfuscatedName("de.ae(I)V")
    public void method2260() {
        this.field1136 = class475.field4937;
    }

    @ObfuscatedName("de.ax(B)V")
    public void method2261() {
        this.field1136 = Statics.field182.method1813(this.field1153) ? class475.field4936 : class475.field4935;
    }

    @ObfuscatedName("de.ay(B)Z")
    public boolean method2262() {
        if (class475.field4937 == this.field1160) {
            this.method2264();
        }
        return class475.field4936 == this.field1160;
    }

    @ObfuscatedName("de.au(B)V")
    public void method2263() {
        this.field1160 = class475.field4937;
    }

    @ObfuscatedName("de.as(B)V")
    public void method2264() {
        this.field1160 = Statics.field1404 != null && Statics.field1404.method7908(this.field1153) ? class475.field4936 : class475.field4935;
    }

    @ObfuscatedName("de.aw(I)V")
    public void method2265() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field713[var1] != null && client.field713[var1].method3127(this.field1153.method9385()) != -1 && var1 != 2) {
                this.field1161 = class475.field4936;
                return;
            }
        }
        this.field1161 = class475.field4935;
    }

    @ObfuscatedName("de.ad(I)V")
    public void method2266() {
        this.field1161 = class475.field4937;
    }

    @ObfuscatedName("de.ai(I)Z")
    public boolean method2300() {
        if (class475.field4937 == this.field1161) {
            this.method2265();
        }
        return class475.field4936 == this.field1161;
    }

    @ObfuscatedName("de.an(B)I")
    public int method2267() {
        return this.field1157 == null || this.field1157.field3764 == -1 ? 1 : class210.method2967(this.field1157.field3764).field2121;
    }

    @ObfuscatedName("de.ah(I)Lkb;")
    public final class264 method2007() {
        if (this.field1157 == null) {
            return null;
        }
        class227 var1 = this.field1224 != -1 && this.field1253 == 0 ? class227.method4744(this.field1224) : null;
        class227 var2 = this.field1246 == -1 || this.field1154 || this.field1246 == this.field1211 && var1 != null ? null : class227.method4744(this.field1246);
        class264 var3 = this.field1157.method5977(var1, this.field1251, var2, this.field1272);
        if (var3 == null) {
            return null;
        }
        var3.method4806();
        this.field1280 = var3.field2801;
        int var4 = var3.field2878;
        if (!this.field1154) {
            var3 = this.method2334(var3);
        }
        if (!this.field1154 && this.field1159 != null) {
            if (client.field821 >= this.field1145) {
                this.field1159 = null;
            }
            if (client.field821 >= this.field1144 && client.field821 < this.field1145) {
                class264 var5 = this.field1159;
                var5.method4821(this.field1146 - this.field1215, this.field1147 - this.field1149, this.field1155 - this.field1276);
                if (this.field1283 == 512) {
                    var5.method4871();
                    var5.method4871();
                    var5.method4871();
                } else if (this.field1283 == 1024) {
                    var5.method4871();
                    var5.method4871();
                } else if (this.field1283 == 1536) {
                    var5.method4871();
                }
                class264[] var6 = new class264[] { var3, var5 };
                var3 = new class264(var6, 2);
                if (this.field1283 == 512) {
                    var5.method4871();
                } else if (this.field1283 == 1024) {
                    var5.method4871();
                    var5.method4871();
                } else if (this.field1283 == 1536) {
                    var5.method4871();
                    var5.method4871();
                    var5.method4871();
                }
                var5.method4821(this.field1215 - this.field1146, this.field1149 - this.field1147, this.field1276 - this.field1155);
            }
        }
        var3.field2898 = true;
        if (this.field1271 == 0 || client.field821 < this.field1266 || client.field821 >= this.field1267) {
            var3.field2942 = 0;
        } else {
            var3.field2867 = this.field1268;
            var3.field2940 = this.field1269;
            var3.field2941 = this.field1270;
            var3.field2942 = this.field1271;
            var3.field2892 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("de.am(Ldt;IILjv;B)V")
    public final void method2269(class102 arg0, int arg1, int arg2, class238 arg3) {
        if (this.field1224 != -1 && class227.method4744(this.field1224).field2423 == 1) {
            this.field1224 = -1;
        }
        this.method2330();
        if (arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
            this.method2258(arg1, arg2);
        } else if (this.field1230[0] >= 0 && this.field1230[0] < 104 && this.field1277[0] >= 0 && this.field1277[0] < 104) {
            if (class238.field2530 == arg3) {
                client.method3037(arg0, this, arg1, arg2, class238.field2530);
            }
            this.method2271(arg1, arg2, arg3);
        } else {
            this.method2258(arg1, arg2);
        }
    }

    @ObfuscatedName("de.ar(III)V")
    public void method2258(int arg0, int arg1) {
        this.field1275 = 0;
        this.field1227 = 0;
        this.field1279 = 0;
        this.field1230[0] = arg0;
        this.field1277[0] = arg1;
        int var3 = this.method2267();
        this.field1215 = this.field1230[0] * 128 + var3 * 64;
        this.field1276 = this.field1277[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("de.ag(IILjv;I)V")
    public final void method2271(int arg0, int arg1, class238 arg2) {
        if (this.field1275 < 9) {
            this.field1275++;
        }
        for (int var4 = this.field1275; var4 > 0; var4--) {
            this.field1230[var4] = this.field1230[var4 - 1];
            this.field1277[var4] = this.field1277[var4 - 1];
            this.field1278[var4] = this.field1278[var4 - 1];
        }
        this.field1230[0] = arg0;
        this.field1277[0] = arg1;
        this.field1278[0] = arg2;
    }

    @ObfuscatedName("de.bs(I)Z")
    public final boolean method2272() {
        return this.field1157 != null;
    }
}

package deob;

@ObfuscatedName("di")
public final class class93 extends class97 {

    @ObfuscatedName("di.az")
    public class558 field1142;

    @ObfuscatedName("di.ah")
    public class347 field1123;

    @ObfuscatedName("di.af")
    public int field1124 = -1;

    @ObfuscatedName("di.at")
    public int field1125 = -1;

    @ObfuscatedName("di.ab")
    public String[] field1126 = new String[3];

    @ObfuscatedName("di.aw")
    public int field1127;

    @ObfuscatedName("di.ad")
    public int field1128;

    @ObfuscatedName("di.al")
    public int field1129;

    @ObfuscatedName("di.as")
    public int field1130;

    @ObfuscatedName("di.ag")
    public int field1140;

    @ObfuscatedName("di.ai")
    public int field1141;

    @ObfuscatedName("di.ax")
    public int field1133;

    @ObfuscatedName("di.ar")
    public int field1138;

    @ObfuscatedName("di.aj")
    public class256 field1134;

    @ObfuscatedName("di.au")
    public int field1136;

    @ObfuscatedName("di.ay")
    public int field1137;

    @ObfuscatedName("di.ap")
    public int field1135;

    @ObfuscatedName("di.av")
    public int field1139;

    @ObfuscatedName("di.aa")
    public boolean field1150;

    @ObfuscatedName("di.aq")
    public int field1151;

    @ObfuscatedName("di.am")
    public boolean field1122;

    @ObfuscatedName("di.ac")
    public int field1143;

    @ObfuscatedName("di.ae")
    public int field1144;

    @ObfuscatedName("di.ak")
    public class458 field1145;

    @ObfuscatedName("di.bp")
    public class458 field1146;

    @ObfuscatedName("di.bz")
    public class458 field1147;

    @ObfuscatedName("di.bc")
    public boolean field1148;

    @ObfuscatedName("di.bf")
    public int field1149;

    @ObfuscatedName("di.be")
    public int field1152;

    public class93() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1126[var1] = "";
        }
        this.field1127 = 0;
        this.field1128 = 0;
        this.field1130 = 0;
        this.field1140 = 0;
        this.field1150 = false;
        this.field1151 = 0;
        this.field1122 = false;
        this.field1145 = class458.field4813;
        this.field1146 = class458.field4813;
        this.field1147 = class458.field4813;
        this.field1148 = false;
    }

    @ObfuscatedName("di.az(Lur;I)V")
    public final void method2245(class535 arg0) {
        arg0.field5233 = 0;
        byte var2 = arg0.method8463();
        boolean var3 = true;
        this.field1124 = arg0.method8463();
        this.field1125 = arg0.method8463();
        int var4 = -1;
        this.field1151 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method8462();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8462();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8670();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class223.method87(var5[var6] - 512).field2353;
                    if (var9 != 0) {
                        this.field1151 = var9;
                    }
                }
            }
        }
        int[] var10 = new int[12];
        for (int var11 = 0; var11 < 12; var11++) {
            int var12 = arg0.method8462();
            if (var12 == 0) {
                var10[var11] = 0;
            } else {
                int var13 = arg0.method8462();
                var10[var11] = (var12 << 8) + var13;
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg0.method8462();
            if (var16 < 0 || var16 >= Statics.field1455[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1206 = arg0.method8670();
        if (this.field1206 == 65535) {
            this.field1206 = -1;
        }
        this.field1207 = arg0.method8670();
        if (this.field1207 == 65535) {
            this.field1207 = -1;
        }
        this.field1208 = this.field1207;
        this.field1245 = arg0.method8670();
        if (this.field1245 == 65535) {
            this.field1245 = -1;
        }
        this.field1210 = arg0.method8670();
        if (this.field1210 == 65535) {
            this.field1210 = -1;
        }
        this.field1218 = arg0.method8670();
        if (this.field1218 == 65535) {
            this.field1218 = -1;
        }
        this.field1212 = arg0.method8670();
        if (this.field1212 == 65535) {
            this.field1212 = -1;
        }
        this.field1213 = arg0.method8670();
        if (this.field1213 == 65535) {
            this.field1213 = -1;
        }
        this.field1142 = new class558(arg0.method8473(), Statics.field1527);
        this.method2228();
        this.method2231();
        this.method2234();
        if (Statics.field1608 == this) {
            Statics.field5390 = this.field1142.method9077();
        }
        this.field1127 = arg0.method8462();
        this.field1128 = arg0.method8670();
        this.field1122 = arg0.method8462() == 1;
        if (client.field511 == 0 && client.field691 >= 2) {
            this.field1122 = false;
        }
        class188[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8670();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class188[12];
            for (int var21 = 0; var21 < 12; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    int var25 = var5[var21] - 512;
                    int var26 = arg0.method8462();
                    boolean var27 = (var26 & 0x1) != 0;
                    boolean var28 = (var26 & 0x2) != 0;
                    class188 var29 = new class188(var25);
                    if (var27) {
                        int var30 = arg0.method8462();
                        int[] var31 = new int[] { var30 & 0xF, var30 >> 4 & 0xF };
                        boolean var32 = var29.field1960 != null && var29.field1960.length == var31.length;
                        for (int var33 = 0; var33 < 2; var33++) {
                            if (var31[var33] != 15) {
                                short var34 = (short) arg0.method8670();
                                if (var32) {
                                    var29.field1960[var31[var33]] = var34;
                                }
                            }
                        }
                    }
                    if (var28) {
                        int var35 = arg0.method8462();
                        int[] var36 = new int[] { var35 & 0xF, var35 >> 4 & 0xF };
                        boolean var37 = var29.field1962 != null && var29.field1962.length == var36.length;
                        for (int var38 = 0; var38 < 2; var38++) {
                            if (var36[var38] != 15) {
                                short var39 = (short) arg0.method8670();
                                if (var37) {
                                    var29.field1962[var36[var38]] = var39;
                                }
                            }
                        }
                    }
                    var17[var21] = var29;
                }
            }
        }
        for (int var41 = 0; var41 < 3; var41++) {
            this.field1126[var41] = arg0.method8473();
        }
        byte var42 = arg0.method8463();
        if (this.field1123 == null) {
            this.field1123 = new class347();
        }
        this.field1123.method5721(var10, var5, var17, var20, var14, var2, var4, var42);
    }

    @ObfuscatedName("di.af(B)Z")
    public boolean method2227() {
        if (class458.field4813 == this.field1145) {
            this.method2229();
        }
        return class458.field4809 == this.field1145;
    }

    @ObfuscatedName("di.at(I)V")
    public void method2228() {
        this.field1145 = class458.field4813;
    }

    @ObfuscatedName("di.an(I)V")
    public void method2229() {
        this.field1145 = Statics.field3621.method1769(this.field1142) ? class458.field4809 : class458.field4810;
    }

    @ObfuscatedName("di.aw(I)Z")
    public boolean method2259() {
        if (class458.field4813 == this.field1146) {
            this.method2232();
        }
        return class458.field4809 == this.field1146;
    }

    @ObfuscatedName("di.ad(I)V")
    public void method2231() {
        this.field1146 = class458.field4813;
    }

    @ObfuscatedName("di.al(B)V")
    public void method2232() {
        this.field1146 = Statics.field1674 != null && Statics.field1674.method7475(this.field1142) ? class458.field4809 : class458.field4810;
    }

    @ObfuscatedName("di.as(B)V")
    public void method2233() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field755[var1] != null && client.field755[var1].method3022(this.field1142.method9077()) != -1 && var1 != 2) {
                this.field1147 = class458.field4809;
                return;
            }
        }
        this.field1147 = class458.field4810;
    }

    @ObfuscatedName("di.ag(I)V")
    public void method2234() {
        this.field1147 = class458.field4813;
    }

    @ObfuscatedName("di.ai(B)Z")
    public boolean method2271() {
        if (class458.field4813 == this.field1147) {
            this.method2233();
        }
        return class458.field4809 == this.field1147;
    }

    @ObfuscatedName("di.ax(I)I")
    public int method2236() {
        return this.field1123 == null || this.field1123.field3693 == -1 ? 1 : class208.method2790(this.field1123.field3693).field2144;
    }

    @ObfuscatedName("di.ah(I)Ljn;")
    public final class256 method1979() {
        if (this.field1123 == null) {
            return null;
        }
        class225 var1 = this.field1201 != -1 && this.field1248 == 0 ? class225.method288(this.field1201) : null;
        class225 var2 = this.field1241 == -1 || this.field1150 || this.field1241 == this.field1206 && var1 != null ? null : class225.method288(this.field1241);
        class256 var3 = this.field1123.method5729(var1, this.field1246, var2, this.field1242);
        if (var3 == null) {
            return null;
        }
        var3.method4590();
        this.field1222 = var3.field2716;
        int var4 = var3.field2839;
        if (!this.field1150) {
            var3 = this.method2292(var3);
        }
        if (!this.field1150 && this.field1134 != null) {
            if (client.field523 >= this.field1140) {
                this.field1134 = null;
            }
            if (client.field523 >= this.field1130 && client.field523 < this.field1140) {
                class256 var5 = this.field1134;
                var5.method4605(this.field1141 - this.field1220, this.field1133 - this.field1129, this.field1138 - this.field1260);
                if (this.field1267 == 512) {
                    var5.method4689();
                    var5.method4689();
                    var5.method4689();
                } else if (this.field1267 == 1024) {
                    var5.method4689();
                    var5.method4689();
                } else if (this.field1267 == 1536) {
                    var5.method4689();
                }
                class256[] var6 = new class256[] { var3, var5 };
                var3 = new class256(var6, 2);
                if (this.field1267 == 512) {
                    var5.method4689();
                } else if (this.field1267 == 1024) {
                    var5.method4689();
                    var5.method4689();
                } else if (this.field1267 == 1536) {
                    var5.method4689();
                    var5.method4689();
                    var5.method4689();
                }
                var5.method4605(this.field1220 - this.field1141, this.field1129 - this.field1133, this.field1260 - this.field1138);
            }
        }
        var3.field2809 = true;
        if (this.field1266 == 0 || client.field523 < this.field1261 || client.field523 >= this.field1237) {
            var3.field2826 = 0;
        } else {
            var3.field2829 = this.field1262;
            var3.field2852 = this.field1264;
            var3.field2853 = this.field1236;
            var3.field2826 = this.field1266;
            var3.field2785 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("di.ar(IILiu;B)V")
    public final void method2237(int arg0, int arg1, class234 arg2) {
        if (this.field1201 != -1 && class225.method288(this.field1201).field2400 == 1) {
            this.field1201 = -1;
        }
        this.method2308();
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2238(arg0, arg1);
        } else if (this.field1271[0] >= 0 && this.field1271[0] < 104 && this.field1272[0] >= 0 && this.field1272[0] < 104) {
            if (class234.field2486 == arg2) {
                client.method12(this, arg0, arg1, class234.field2486);
            }
            this.method2239(arg0, arg1, arg2);
        } else {
            this.method2238(arg0, arg1);
        }
    }

    @ObfuscatedName("di.aj(III)V")
    public void method2238(int arg0, int arg1) {
        this.field1274 = 0;
        this.field1275 = 0;
        this.field1258 = 0;
        this.field1271[0] = arg0;
        this.field1272[0] = arg1;
        int var3 = this.method2236();
        this.field1220 = this.field1271[0] * 128 + var3 * 64;
        this.field1260 = this.field1272[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("di.au(IILiu;I)V")
    public final void method2239(int arg0, int arg1, class234 arg2) {
        if (this.field1274 < 9) {
            this.field1274++;
        }
        for (int var4 = this.field1274; var4 > 0; var4--) {
            this.field1271[var4] = this.field1271[var4 - 1];
            this.field1272[var4] = this.field1272[var4 - 1];
            this.field1209[var4] = this.field1209[var4 - 1];
        }
        this.field1271[0] = arg0;
        this.field1272[0] = arg1;
        this.field1209[0] = arg2;
    }

    @ObfuscatedName("di.ay(I)Z")
    public final boolean method2240() {
        return this.field1123 != null;
    }
}

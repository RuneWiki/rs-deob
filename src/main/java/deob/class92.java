package deob;

@ObfuscatedName("df")
public final class class92 extends class96 {

    @ObfuscatedName("df.aw")
    public class538 field1115;

    @ObfuscatedName("df.ay")
    public class330 field1139;

    @ObfuscatedName("df.ar")
    public int field1114 = -1;

    @ObfuscatedName("df.am")
    public int field1127 = -1;

    @ObfuscatedName("df.aj")
    public String[] field1117 = new String[3];

    @ObfuscatedName("df.ag")
    public int field1118;

    @ObfuscatedName("df.az")
    public int field1136;

    @ObfuscatedName("df.av")
    public int field1140;

    @ObfuscatedName("df.ap")
    public int field1112;

    @ObfuscatedName("df.aq")
    public int field1122;

    @ObfuscatedName("df.at")
    public int field1123;

    @ObfuscatedName("df.ah")
    public int field1124;

    @ObfuscatedName("df.ax")
    public int field1120;

    @ObfuscatedName("df.aa")
    public class241 field1126;

    @ObfuscatedName("df.au")
    public int field1125;

    @ObfuscatedName("df.ae")
    public int field1128;

    @ObfuscatedName("df.ab")
    public int field1129;

    @ObfuscatedName("df.ad")
    public int field1138;

    @ObfuscatedName("df.ao")
    public boolean field1131;

    @ObfuscatedName("df.ac")
    public int field1132;

    @ObfuscatedName("df.ak")
    public boolean field1135;

    @ObfuscatedName("df.af")
    public int field1134;

    @ObfuscatedName("df.ai")
    public int field1130;

    @ObfuscatedName("df.al")
    public class439 field1113;

    @ObfuscatedName("df.bd")
    public class439 field1121;

    @ObfuscatedName("df.bb")
    public class439 field1137;

    @ObfuscatedName("df.bn")
    public boolean field1119;

    @ObfuscatedName("df.ba")
    public int field1133;

    @ObfuscatedName("df.bf")
    public int field1141;

    public class92() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1117[var1] = "";
        }
        this.field1118 = 0;
        this.field1136 = 0;
        this.field1112 = 0;
        this.field1122 = 0;
        this.field1131 = false;
        this.field1132 = 0;
        this.field1135 = false;
        this.field1113 = class439.field4675;
        this.field1121 = class439.field4675;
        this.field1137 = class439.field4675;
        this.field1119 = false;
    }

    @ObfuscatedName("df.aw(Lty;B)V")
    public final void method2219(class514 arg0) {
        arg0.field5072 = 0;
        int var2 = arg0.method8244();
        boolean var3 = true;
        this.field1114 = arg0.method8264();
        this.field1127 = arg0.method8264();
        int var4 = -1;
        this.field1132 = 0;
        int[] var5 = new int[12];
        for (int var6 = 0; var6 < 12; var6++) {
            int var7 = arg0.method8244();
            if (var7 == 0) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method8244();
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method8246();
                    break;
                }
                if (var5[var6] >= 512) {
                    int var9 = class208.method2788(var5[var6] - 512).field2235;
                    if (var9 != 0) {
                        this.field1132 = var9;
                    }
                }
            }
        }
        int[] var10 = null;
        if (client.field526 >= 213) {
            var10 = new int[12];
            for (int var11 = 0; var11 < 12; var11++) {
                int var12 = arg0.method8244();
                if (var12 == 0) {
                    var10[var11] = 0;
                } else {
                    int var13 = arg0.method8244();
                    var10[var11] = (var12 << 8) + var13;
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; var15 < 5; var15++) {
            int var16 = arg0.method8244();
            if (var16 < 0 || var16 >= Statics.field1777[var15].length) {
                var16 = 0;
            }
            var14[var15] = var16;
        }
        this.field1232 = arg0.method8246();
        if (this.field1232 == 65535) {
            this.field1232 = -1;
        }
        this.field1238 = arg0.method8246();
        if (this.field1238 == 65535) {
            this.field1238 = -1;
        }
        this.field1191 = this.field1238;
        this.field1236 = arg0.method8246();
        if (this.field1236 == 65535) {
            this.field1236 = -1;
        }
        this.field1247 = arg0.method8246();
        if (this.field1247 == 65535) {
            this.field1247 = -1;
        }
        this.field1244 = arg0.method8246();
        if (this.field1244 == 65535) {
            this.field1244 = -1;
        }
        this.field1227 = arg0.method8246();
        if (this.field1227 == 65535) {
            this.field1227 = -1;
        }
        this.field1196 = arg0.method8246();
        if (this.field1196 == 65535) {
            this.field1196 = -1;
        }
        this.field1115 = new class538(arg0.method8369(), Statics.field4771);
        this.method2245();
        this.method2220();
        this.method2238();
        if (Statics.field1605 == this) {
            Statics.field5235 = this.field1115.method8881();
        }
        this.field1118 = arg0.method8244();
        this.field1136 = arg0.method8246();
        this.field1135 = arg0.method8244() == 1;
        if (client.field519 == 0 && client.field693 >= 2) {
            this.field1135 = false;
        }
        class184[] var17 = null;
        boolean var18 = false;
        int var19 = arg0.method8246();
        boolean var20 = (var19 >> 15 & 0x1) == 1;
        if (var19 > 0 && var19 != 32768) {
            var17 = new class184[12];
            for (int var21 = 0; var21 < 12; var21++) {
                int var22 = var19 >> 12 - var21 & 0x1;
                if (var22 == 1) {
                    int var25 = var5[var21] - 512;
                    int var26 = arg0.method8244();
                    boolean var27 = (var26 & 0x1) != 0;
                    boolean var28 = (var26 & 0x2) != 0;
                    class184 var29 = new class184(var25);
                    if (var27) {
                        int var30 = arg0.method8244();
                        int[] var31 = new int[] { var30 & 0xF, var30 >> 4 & 0xF };
                        boolean var32 = var29.field1889 != null && var29.field1889.length == var31.length;
                        for (int var33 = 0; var33 < 2; var33++) {
                            if (var31[var33] != 15) {
                                short var34 = (short) arg0.method8246();
                                if (var32) {
                                    var29.field1889[var31[var33]] = var34;
                                }
                            }
                        }
                    }
                    if (var28) {
                        int var35 = arg0.method8244();
                        int[] var36 = new int[] { var35 & 0xF, var35 >> 4 & 0xF };
                        boolean var37 = var29.field1892 != null && var29.field1892.length == var36.length;
                        for (int var38 = 0; var38 < 2; var38++) {
                            if (var36[var38] != 15) {
                                short var39 = (short) arg0.method8246();
                                if (var37) {
                                    var29.field1892[var36[var38]] = var39;
                                }
                            }
                        }
                    }
                    var17[var21] = var29;
                }
            }
        }
        for (int var41 = 0; var41 < 3; var41++) {
            this.field1117[var41] = arg0.method8369();
        }
        int var42 = arg0.method8244();
        if (this.field1139 == null) {
            this.field1139 = new class330();
        }
        this.field1139.method5516(var10, var5, var17, var20, var14, var2, var4, var42);
    }

    @ObfuscatedName("df.ar(S)Z")
    public boolean method2214() {
        if (class439.field4675 == this.field1113) {
            this.method2216();
        }
        return class439.field4676 == this.field1113;
    }

    @ObfuscatedName("df.am(B)V")
    public void method2245() {
        this.field1113 = class439.field4675;
    }

    @ObfuscatedName("df.as(B)V")
    public void method2216() {
        this.field1113 = Statics.field1858.method1786(this.field1115) ? class439.field4676 : class439.field4677;
    }

    @ObfuscatedName("df.ag(B)Z")
    public boolean method2225() {
        if (class439.field4675 == this.field1121) {
            this.method2251();
        }
        return class439.field4676 == this.field1121;
    }

    @ObfuscatedName("df.az(I)V")
    public void method2220() {
        this.field1121 = class439.field4675;
    }

    @ObfuscatedName("df.av(I)V")
    public void method2251() {
        this.field1121 = Statics.field128 != null && Statics.field128.method7262(this.field1115) ? class439.field4676 : class439.field4677;
    }

    @ObfuscatedName("df.ap(I)V")
    public void method2215() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field713[var1] != null && client.field713[var1].method3015(this.field1115.method8881()) != -1 && var1 != 2) {
                this.field1137 = class439.field4676;
                return;
            }
        }
        this.field1137 = class439.field4677;
    }

    @ObfuscatedName("df.aq(I)V")
    public void method2238() {
        this.field1137 = class439.field4675;
    }

    @ObfuscatedName("df.at(I)Z")
    public boolean method2222() {
        if (class439.field4675 == this.field1137) {
            this.method2215();
        }
        return class439.field4676 == this.field1137;
    }

    @ObfuscatedName("df.ah(I)I")
    public int method2223() {
        return this.field1139 == null || this.field1139.field3573 == -1 ? 1 : class196.method4032(this.field1139.field3573).field2003;
    }

    @ObfuscatedName("df.ay(I)Ljo;")
    public final class241 method1986() {
        if (this.field1139 == null) {
            return null;
        }
        class210 var1 = this.field1211 != -1 && this.field1231 == 0 ? class210.method2904(this.field1211) : null;
        class210 var2 = this.field1256 == -1 || this.field1131 || this.field1256 == this.field1232 && var1 != null ? null : class210.method2904(this.field1256);
        class241 var3 = this.field1139.method5523(var1, this.field1229, var2, this.field1254);
        if (var3 == null) {
            return null;
        }
        var3.method4427();
        this.field1243 = var3.field2613;
        int var4 = var3.field2705;
        if (!this.field1131) {
            var3 = this.method2283(var3);
        }
        if (!this.field1131 && this.field1126 != null) {
            if (client.field530 >= this.field1122) {
                this.field1126 = null;
            }
            if (client.field530 >= this.field1112 && client.field530 < this.field1122) {
                class241 var5 = this.field1126;
                var5.method4494(this.field1123 - this.field1192, this.field1124 - this.field1140, this.field1120 - this.field1206);
                if (this.field1250 == 512) {
                    var5.method4438();
                    var5.method4438();
                    var5.method4438();
                } else if (this.field1250 == 1024) {
                    var5.method4438();
                    var5.method4438();
                } else if (this.field1250 == 1536) {
                    var5.method4438();
                }
                class241[] var6 = new class241[] { var3, var5 };
                var3 = new class241(var6, 2);
                if (this.field1250 == 512) {
                    var5.method4438();
                } else if (this.field1250 == 1024) {
                    var5.method4438();
                    var5.method4438();
                } else if (this.field1250 == 1536) {
                    var5.method4438();
                    var5.method4438();
                    var5.method4438();
                }
                var5.method4494(this.field1192 - this.field1123, this.field1140 - this.field1124, this.field1206 - this.field1120);
            }
        }
        var3.field2704 = true;
        if (this.field1249 == 0 || client.field530 < this.field1184 || client.field530 >= this.field1245) {
            var3.field2675 = 0;
        } else {
            var3.field2716 = this.field1246;
            var3.field2747 = this.field1239;
            var3.field2748 = this.field1248;
            var3.field2675 = this.field1249;
            var3.field2685 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("df.ax(IILio;I)V")
    public final void method2221(int arg0, int arg1, class219 arg2) {
        if (this.field1211 != -1 && class210.method2904(this.field1211).field2285 == 1) {
            this.field1211 = -1;
        }
        this.method2284();
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method2229(arg0, arg1);
        } else if (this.field1188[0] >= 0 && this.field1188[0] < 104 && this.field1255[0] >= 0 && this.field1255[0] < 104) {
            if (class219.field2378 == arg2) {
                client.method1769(this, arg0, arg1, class219.field2378);
            }
            this.method2227(arg0, arg1, arg2);
        } else {
            this.method2229(arg0, arg1);
        }
    }

    @ObfuscatedName("df.aa(IIB)V")
    public void method2229(int arg0, int arg1) {
        this.field1253 = 0;
        this.field1258 = 0;
        this.field1257 = 0;
        this.field1188[0] = arg0;
        this.field1255[0] = arg1;
        int var3 = this.method2223();
        this.field1192 = this.field1188[0] * 128 + var3 * 64;
        this.field1206 = this.field1255[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("df.au(IILio;I)V")
    public final void method2227(int arg0, int arg1, class219 arg2) {
        if (this.field1253 < 9) {
            this.field1253++;
        }
        for (int var4 = this.field1253; var4 > 0; var4--) {
            this.field1188[var4] = this.field1188[var4 - 1];
            this.field1255[var4] = this.field1255[var4 - 1];
            this.field1241[var4] = this.field1241[var4 - 1];
        }
        this.field1188[0] = arg0;
        this.field1255[0] = arg1;
        this.field1241[0] = arg2;
    }

    @ObfuscatedName("df.ae(B)Z")
    public final boolean method2228() {
        return this.field1139 != null;
    }
}

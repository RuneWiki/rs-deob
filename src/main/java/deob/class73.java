package deob;

@ObfuscatedName("bd")
public final class class73 extends class76 {

    @ObfuscatedName("bd.g")
    public class306 field829;

    @ObfuscatedName("bd.e")
    public class240 field817;

    @ObfuscatedName("bd.b")
    public int field833 = -1;

    @ObfuscatedName("bd.z")
    public int field828 = -1;

    @ObfuscatedName("bd.l")
    public String[] field820 = new String[3];

    @ObfuscatedName("bd.s")
    public int field821;

    @ObfuscatedName("bd.y")
    public int field822;

    @ObfuscatedName("bd.c")
    public int field823;

    @ObfuscatedName("bd.h")
    public int field824;

    @ObfuscatedName("bd.i")
    public int field842;

    @ObfuscatedName("bd.o")
    public int field826;

    @ObfuscatedName("bd.d")
    public int field827;

    @ObfuscatedName("bd.r")
    public int field838;

    @ObfuscatedName("bd.p")
    public class132 field825;

    @ObfuscatedName("bd.q")
    public int field830;

    @ObfuscatedName("bd.f")
    public int field831;

    @ObfuscatedName("bd.j")
    public int field819;

    @ObfuscatedName("bd.v")
    public int field837;

    @ObfuscatedName("bd.u")
    public boolean field834;

    @ObfuscatedName("bd.k")
    public int field835;

    @ObfuscatedName("bd.w")
    public boolean field836;

    @ObfuscatedName("bd.m")
    public int field832;

    @ObfuscatedName("bd.a")
    public int field818;

    @ObfuscatedName("bd.x")
    public class304 field839;

    @ObfuscatedName("bd.t")
    public class304 field816;

    @ObfuscatedName("bd.ax")
    public boolean field841;

    @ObfuscatedName("bd.ai")
    public int field843;

    @ObfuscatedName("bd.aj")
    public int field840;

    public class73() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field820[var1] = "";
        }
        this.field821 = 0;
        this.field822 = 0;
        this.field824 = 0;
        this.field842 = 0;
        this.field834 = false;
        this.field835 = 0;
        this.field836 = false;
        this.field839 = class304.field3857;
        this.field816 = class304.field3857;
        this.field841 = false;
    }

    @ObfuscatedName("bd.g(Lgg;B)V")
    public final void method1111(class195 arg0) {
        arg0.field2562 = 0;
        int var2 = arg0.method3332();
        this.field833 = arg0.method3309();
        this.field828 = arg0.method3309();
        int var3 = -1;
        this.field835 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method3332();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method3332();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3310();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class284.method2027(var4[var5] - 512).field3691;
                    if (var8 != 0) {
                        this.field835 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method3332();
            if (var11 < 0 || var11 >= Statics.field2700[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1146 = arg0.method3310();
        if (this.field1146 == 65535) {
            this.field1146 = -1;
        }
        this.field1190 = arg0.method3310();
        if (this.field1190 == 65535) {
            this.field1190 = -1;
        }
        this.field1158 = this.field1190;
        this.field1149 = arg0.method3310();
        if (this.field1149 == 65535) {
            this.field1149 = -1;
        }
        this.field1150 = arg0.method3310();
        if (this.field1150 == 65535) {
            this.field1150 = -1;
        }
        this.field1151 = arg0.method3310();
        if (this.field1151 == 65535) {
            this.field1151 = -1;
        }
        this.field1181 = arg0.method3310();
        if (this.field1181 == 65535) {
            this.field1181 = -1;
        }
        this.field1153 = arg0.method3310();
        if (this.field1153 == 65535) {
            this.field1153 = -1;
        }
        this.field829 = new class306(arg0.method3429(), Statics.field2078);
        this.method1134();
        this.method1117();
        if (Statics.field3435 == this) {
            Statics.field2170 = this.field829.method5060();
        }
        this.field821 = arg0.method3332();
        this.field822 = arg0.method3310();
        this.field836 = arg0.method3332() == 1;
        if (client.field855 == 0 && client.field997 >= 2) {
            this.field836 = false;
        }
        if (this.field817 == null) {
            this.field817 = new class240();
        }
        this.field817.method4157(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bd.e(B)Z")
    public boolean method1113() {
        if (class304.field3857 == this.field839) {
            this.method1151();
        }
        return class304.field3859 == this.field839;
    }

    @ObfuscatedName("bd.b(I)V")
    public void method1134() {
        this.field839 = class304.field3857;
    }

    @ObfuscatedName("bd.z(I)V")
    public void method1151() {
        this.field839 = Statics.field1666.method1675(this.field829) ? class304.field3859 : class304.field3856;
    }

    @ObfuscatedName("bd.n(B)Z")
    public boolean method1136() {
        if (class304.field3857 == this.field816) {
            this.method1118();
        }
        return class304.field3859 == this.field816;
    }

    @ObfuscatedName("bd.l(I)V")
    public void method1117() {
        this.field816 = class304.field3857;
    }

    @ObfuscatedName("bd.s(I)V")
    public void method1118() {
        this.field816 = Statics.field2474 != null && Statics.field2474.method4972(this.field829) ? class304.field3859 : class304.field3856;
    }

    @ObfuscatedName("bd.y(I)I")
    public int method1130() {
        return this.field817 == null || this.field817.field2798 == -1 ? 1 : Statics.method2738(this.field817.field2798).field3727;
    }

    @ObfuscatedName("bd.c(I)Lee;")
    public final class132 method1120() {
        if (this.field817 == null) {
            return null;
        }
        class288 var1 = this.field1173 != -1 && this.field1176 == 0 ? class288.method1825(this.field1173) : null;
        class288 var2 = this.field1170 == -1 || this.field834 || this.field1170 == this.field1146 && var1 != null ? null : class288.method1825(this.field1170);
        class132 var3 = this.field817.method4138(var1, this.field1174, var2, this.field1200);
        if (var3 == null) {
            return null;
        }
        var3.method2581();
        this.field1191 = var3.field2025;
        if (!this.field834 && this.field1142 != -1 && this.field1163 != -1) {
            class132 var4 = class273.method1058(this.field1142).method4518(this.field1163);
            if (var4 != null) {
                var4.method2648(0, -this.field1188, 0);
                class132[] var5 = new class132[] { var3, var4 };
                var3 = new class132(var5, 2);
            }
        }
        if (!this.field834 && this.field825 != null) {
            if (client.field913 >= this.field842) {
                this.field825 = null;
            }
            if (client.field913 >= this.field824 && client.field913 < this.field842) {
                class132 var6 = this.field825;
                var6.method2648(this.field826 - this.field1154, this.field827 - this.field823, this.field838 - this.field1148);
                if (this.field1152 == 512) {
                    var6.method2588();
                    var6.method2588();
                    var6.method2588();
                } else if (this.field1152 == 1024) {
                    var6.method2588();
                    var6.method2588();
                } else if (this.field1152 == 1536) {
                    var6.method2588();
                }
                class132[] var7 = new class132[] { var3, var6 };
                var3 = new class132(var7, 2);
                if (this.field1152 == 512) {
                    var6.method2588();
                } else if (this.field1152 == 1024) {
                    var6.method2588();
                    var6.method2588();
                } else if (this.field1152 == 1536) {
                    var6.method2588();
                    var6.method2588();
                    var6.method2588();
                }
                var6.method2648(this.field1154 - this.field826, this.field823 - this.field827, this.field1148 - this.field838);
            }
        }
        var3.field1848 = true;
        return var3;
    }

    @ObfuscatedName("bd.o(IIBB)V")
    public final void method1121(int arg0, int arg1, byte arg2) {
        if (this.field1173 != -1 && class288.method1825(this.field1173).field3774 == 1) {
            this.field1173 = -1;
        }
        this.field1169 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1155(arg0, arg1);
        } else if (this.field1196[0] >= 0 && this.field1196[0] < 104 && this.field1197[0] >= 0 && this.field1197[0] < 104) {
            if (arg2 == 2) {
                class73 var4 = this;
                int var5 = this.field1196[0];
                int var6 = this.field1197[0];
                int var7 = this.method1130();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method1130();
                    client.field1123.field2276 = arg0;
                    client.field1123.field2274 = arg1;
                    client.field1123.field2277 = 1;
                    client.field1123.field2275 = 1;
                    class72 var9 = client.field1123;
                    class72 var10 = var9;
                    class177 var11 = client.field910[this.field832];
                    int[] var12 = client.field1124;
                    int[] var13 = client.field1125;
                    int var14 = 0;
                    label707: while (true) {
                        if (var14 >= 128) {
                            boolean var31;
                            if (var8 == 1) {
                                int var16 = var5;
                                int var17 = var6;
                                byte var18 = 64;
                                byte var19 = 64;
                                int var20 = var5 - var18;
                                int var21 = var6 - var19;
                                class178.field2267[var18][var19] = 99;
                                class178.field2265[var18][var19] = 0;
                                byte var22 = 0;
                                int var23 = 0;
                                class178.field2271[var22] = var5;
                                int var95 = var22 + 1;
                                class178.field2270[var22] = var6;
                                int[][] var24 = var11.field2252;
                                boolean var29;
                                while (true) {
                                    if (var95 == var23) {
                                        Statics.field2269 = var16;
                                        Statics.field2272 = var17;
                                        var29 = false;
                                        break;
                                    }
                                    var16 = class178.field2271[var23];
                                    var17 = class178.field2270[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    int var25 = var16 - var20;
                                    int var26 = var17 - var21;
                                    int var27 = var16 - var11.field2260;
                                    int var28 = var17 - var11.field2256;
                                    if (var10.method1104(1, var16, var17, var11)) {
                                        Statics.field2269 = var16;
                                        Statics.field2272 = var17;
                                        var29 = true;
                                        break;
                                    }
                                    int var30 = class178.field2265[var25][var26] + 1;
                                    if (var25 > 0 && class178.field2267[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0) {
                                        class178.field2271[var95] = var16 - 1;
                                        class178.field2270[var95] = var17;
                                        var95 = var95 + 1 & 0xFFF;
                                        class178.field2267[var25 - 1][var26] = 2;
                                        class178.field2265[var25 - 1][var26] = var30;
                                    }
                                    if (var25 < 127 && class178.field2267[var25 + 1][var26] == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0) {
                                        class178.field2271[var95] = var16 + 1;
                                        class178.field2270[var95] = var17;
                                        var95 = var95 + 1 & 0xFFF;
                                        class178.field2267[var25 + 1][var26] = 8;
                                        class178.field2265[var25 + 1][var26] = var30;
                                    }
                                    if (var26 > 0 && class178.field2267[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class178.field2271[var95] = var16;
                                        class178.field2270[var95] = var17 - 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class178.field2267[var25][var26 - 1] = 1;
                                        class178.field2265[var25][var26 - 1] = var30;
                                    }
                                    if (var26 < 127 && class178.field2267[var25][var26 + 1] == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class178.field2271[var95] = var16;
                                        class178.field2270[var95] = var17 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class178.field2267[var25][var26 + 1] = 4;
                                        class178.field2265[var25][var26 + 1] = var30;
                                    }
                                    if (var25 > 0 && var26 > 0 && class178.field2267[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class178.field2271[var95] = var16 - 1;
                                        class178.field2270[var95] = var17 - 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class178.field2267[var25 - 1][var26 - 1] = 3;
                                        class178.field2265[var25 - 1][var26 - 1] = var30;
                                    }
                                    if (var25 < 127 && var26 > 0 && class178.field2267[var25 + 1][var26 - 1] == 0 && (var24[var27 + 1][var28 - 1] & 0x1240183) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class178.field2271[var95] = var16 + 1;
                                        class178.field2270[var95] = var17 - 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class178.field2267[var25 + 1][var26 - 1] = 9;
                                        class178.field2265[var25 + 1][var26 - 1] = var30;
                                    }
                                    if (var25 > 0 && var26 < 127 && class178.field2267[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var28 + 1] & 0x1240138) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class178.field2271[var95] = var16 - 1;
                                        class178.field2270[var95] = var17 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class178.field2267[var25 - 1][var26 + 1] = 6;
                                        class178.field2265[var25 - 1][var26 + 1] = var30;
                                    }
                                    if (var25 < 127 && var26 < 127 && class178.field2267[var25 + 1][var26 + 1] == 0 && (var24[var27 + 1][var28 + 1] & 0x12401E0) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class178.field2271[var95] = var16 + 1;
                                        class178.field2270[var95] = var17 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class178.field2267[var25 + 1][var26 + 1] = 12;
                                        class178.field2265[var25 + 1][var26 + 1] = var30;
                                    }
                                }
                                var31 = var29;
                            } else if (var8 == 2) {
                                int var32 = var5;
                                int var33 = var6;
                                byte var34 = 64;
                                byte var35 = 64;
                                int var36 = var5 - var34;
                                int var37 = var6 - var35;
                                class178.field2267[var34][var35] = 99;
                                class178.field2265[var34][var35] = 0;
                                byte var38 = 0;
                                int var39 = 0;
                                class178.field2271[var38] = var5;
                                int var96 = var38 + 1;
                                class178.field2270[var38] = var6;
                                int[][] var40 = var11.field2252;
                                boolean var45;
                                while (true) {
                                    if (var96 == var39) {
                                        Statics.field2269 = var32;
                                        Statics.field2272 = var33;
                                        var45 = false;
                                        break;
                                    }
                                    var32 = class178.field2271[var39];
                                    var33 = class178.field2270[var39];
                                    var39 = var39 + 1 & 0xFFF;
                                    int var41 = var32 - var36;
                                    int var42 = var33 - var37;
                                    int var43 = var32 - var11.field2260;
                                    int var44 = var33 - var11.field2256;
                                    if (var10.method1104(2, var32, var33, var11)) {
                                        Statics.field2269 = var32;
                                        Statics.field2272 = var33;
                                        var45 = true;
                                        break;
                                    }
                                    int var46 = class178.field2265[var41][var42] + 1;
                                    if (var41 > 0 && class178.field2267[var41 - 1][var42] == 0 && (var40[var43 - 1][var44] & 0x124010E) == 0 && (var40[var43 - 1][var44 + 1] & 0x1240138) == 0) {
                                        class178.field2271[var96] = var32 - 1;
                                        class178.field2270[var96] = var33;
                                        var96 = var96 + 1 & 0xFFF;
                                        class178.field2267[var41 - 1][var42] = 2;
                                        class178.field2265[var41 - 1][var42] = var46;
                                    }
                                    if (var41 < 126 && class178.field2267[var41 + 1][var42] == 0 && (var40[var43 + 2][var44] & 0x1240183) == 0 && (var40[var43 + 2][var44 + 1] & 0x12401E0) == 0) {
                                        class178.field2271[var96] = var32 + 1;
                                        class178.field2270[var96] = var33;
                                        var96 = var96 + 1 & 0xFFF;
                                        class178.field2267[var41 + 1][var42] = 8;
                                        class178.field2265[var41 + 1][var42] = var46;
                                    }
                                    if (var42 > 0 && class178.field2267[var41][var42 - 1] == 0 && (var40[var43][var44 - 1] & 0x124010E) == 0 && (var40[var43 + 1][var44 - 1] & 0x1240183) == 0) {
                                        class178.field2271[var96] = var32;
                                        class178.field2270[var96] = var33 - 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class178.field2267[var41][var42 - 1] = 1;
                                        class178.field2265[var41][var42 - 1] = var46;
                                    }
                                    if (var42 < 126 && class178.field2267[var41][var42 + 1] == 0 && (var40[var43][var44 + 2] & 0x1240138) == 0 && (var40[var43 + 1][var44 + 2] & 0x12401E0) == 0) {
                                        class178.field2271[var96] = var32;
                                        class178.field2270[var96] = var33 + 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class178.field2267[var41][var42 + 1] = 4;
                                        class178.field2265[var41][var42 + 1] = var46;
                                    }
                                    if (var41 > 0 && var42 > 0 && class178.field2267[var41 - 1][var42 - 1] == 0 && (var40[var43 - 1][var44] & 0x124013E) == 0 && (var40[var43 - 1][var44 - 1] & 0x124010E) == 0 && (var40[var43][var44 - 1] & 0x124018F) == 0) {
                                        class178.field2271[var96] = var32 - 1;
                                        class178.field2270[var96] = var33 - 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class178.field2267[var41 - 1][var42 - 1] = 3;
                                        class178.field2265[var41 - 1][var42 - 1] = var46;
                                    }
                                    if (var41 < 126 && var42 > 0 && class178.field2267[var41 + 1][var42 - 1] == 0 && (var40[var43 + 1][var44 - 1] & 0x124018F) == 0 && (var40[var43 + 2][var44 - 1] & 0x1240183) == 0 && (var40[var43 + 2][var44] & 0x12401E3) == 0) {
                                        class178.field2271[var96] = var32 + 1;
                                        class178.field2270[var96] = var33 - 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class178.field2267[var41 + 1][var42 - 1] = 9;
                                        class178.field2265[var41 + 1][var42 - 1] = var46;
                                    }
                                    if (var41 > 0 && var42 < 126 && class178.field2267[var41 - 1][var42 + 1] == 0 && (var40[var43 - 1][var44 + 1] & 0x124013E) == 0 && (var40[var43 - 1][var44 + 2] & 0x1240138) == 0 && (var40[var43][var44 + 2] & 0x12401F8) == 0) {
                                        class178.field2271[var96] = var32 - 1;
                                        class178.field2270[var96] = var33 + 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class178.field2267[var41 - 1][var42 + 1] = 6;
                                        class178.field2265[var41 - 1][var42 + 1] = var46;
                                    }
                                    if (var41 < 126 && var42 < 126 && class178.field2267[var41 + 1][var42 + 1] == 0 && (var40[var43 + 1][var44 + 2] & 0x12401F8) == 0 && (var40[var43 + 2][var44 + 2] & 0x12401E0) == 0 && (var40[var43 + 2][var44 + 1] & 0x12401E3) == 0) {
                                        class178.field2271[var96] = var32 + 1;
                                        class178.field2270[var96] = var33 + 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class178.field2267[var41 + 1][var42 + 1] = 12;
                                        class178.field2265[var41 + 1][var42 + 1] = var46;
                                    }
                                }
                                var31 = var45;
                            } else {
                                int var47 = var5;
                                int var48 = var6;
                                byte var49 = 64;
                                byte var50 = 64;
                                int var51 = var5 - var49;
                                int var52 = var6 - var50;
                                class178.field2267[var49][var50] = 99;
                                class178.field2265[var49][var50] = 0;
                                byte var53 = 0;
                                int var54 = 0;
                                class178.field2271[var53] = var5;
                                int var97 = var53 + 1;
                                class178.field2270[var53] = var6;
                                int[][] var55 = var11.field2252;
                                boolean var60;
                                label677: while (true) {
                                    label675: while (true) {
                                        int var56;
                                        int var57;
                                        int var58;
                                        int var59;
                                        int var61;
                                        do {
                                            do {
                                                do {
                                                    label652: do {
                                                        if (var97 == var54) {
                                                            Statics.field2269 = var47;
                                                            Statics.field2272 = var48;
                                                            var60 = false;
                                                            break label677;
                                                        }
                                                        var47 = class178.field2271[var54];
                                                        var48 = class178.field2270[var54];
                                                        var54 = var54 + 1 & 0xFFF;
                                                        var56 = var47 - var51;
                                                        var57 = var48 - var52;
                                                        var58 = var47 - var11.field2260;
                                                        var59 = var48 - var11.field2256;
                                                        if (var10.method1104(var8, var47, var48, var11)) {
                                                            Statics.field2269 = var47;
                                                            Statics.field2272 = var48;
                                                            var60 = true;
                                                            break label677;
                                                        }
                                                        var61 = class178.field2265[var56][var57] + 1;
                                                        if (var56 > 0 && class178.field2267[var56 - 1][var57] == 0 && (var55[var58 - 1][var59] & 0x124010E) == 0 && (var55[var58 - 1][var8 + var59 - 1] & 0x1240138) == 0) {
                                                            int var62 = 1;
                                                            while (true) {
                                                                if (var62 >= var8 - 1) {
                                                                    class178.field2271[var97] = var47 - 1;
                                                                    class178.field2270[var97] = var48;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class178.field2267[var56 - 1][var57] = 2;
                                                                    class178.field2265[var56 - 1][var57] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var58 - 1][var59 + var62] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var62++;
                                                            }
                                                        }
                                                        if (var56 < 128 - var8 && class178.field2267[var56 + 1][var57] == 0 && (var55[var8 + var58][var59] & 0x1240183) == 0 && (var55[var8 + var58][var8 + var59 - 1] & 0x12401E0) == 0) {
                                                            int var63 = 1;
                                                            while (true) {
                                                                if (var63 >= var8 - 1) {
                                                                    class178.field2271[var97] = var47 + 1;
                                                                    class178.field2270[var97] = var48;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class178.field2267[var56 + 1][var57] = 8;
                                                                    class178.field2265[var56 + 1][var57] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var8 + var58][var59 + var63] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var63++;
                                                            }
                                                        }
                                                        if (var57 > 0 && class178.field2267[var56][var57 - 1] == 0 && (var55[var58][var59 - 1] & 0x124010E) == 0 && (var55[var8 + var58 - 1][var59 - 1] & 0x1240183) == 0) {
                                                            int var64 = 1;
                                                            while (true) {
                                                                if (var64 >= var8 - 1) {
                                                                    class178.field2271[var97] = var47;
                                                                    class178.field2270[var97] = var48 - 1;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class178.field2267[var56][var57 - 1] = 1;
                                                                    class178.field2265[var56][var57 - 1] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var58 + var64][var59 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var64++;
                                                            }
                                                        }
                                                        if (var57 < 128 - var8 && class178.field2267[var56][var57 + 1] == 0 && (var55[var58][var8 + var59] & 0x1240138) == 0 && (var55[var8 + var58 - 1][var8 + var59] & 0x12401E0) == 0) {
                                                            int var65 = 1;
                                                            while (true) {
                                                                if (var65 >= var8 - 1) {
                                                                    class178.field2271[var97] = var47;
                                                                    class178.field2270[var97] = var48 + 1;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class178.field2267[var56][var57 + 1] = 4;
                                                                    class178.field2265[var56][var57 + 1] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var58 + var65][var8 + var59] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var65++;
                                                            }
                                                        }
                                                        if (var56 > 0 && var57 > 0 && class178.field2267[var56 - 1][var57 - 1] == 0 && (var55[var58 - 1][var59 - 1] & 0x124010E) == 0) {
                                                            int var66 = 1;
                                                            while (true) {
                                                                if (var66 >= var8) {
                                                                    class178.field2271[var97] = var47 - 1;
                                                                    class178.field2270[var97] = var48 - 1;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class178.field2267[var56 - 1][var57 - 1] = 3;
                                                                    class178.field2265[var56 - 1][var57 - 1] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var58 - 1][var59 - 1 + var66] & 0x124013E) != 0 || (var55[var58 - 1 + var66][var59 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var66++;
                                                            }
                                                        }
                                                        if (var56 < 128 - var8 && var57 > 0 && class178.field2267[var56 + 1][var57 - 1] == 0 && (var55[var8 + var58][var59 - 1] & 0x1240183) == 0) {
                                                            int var67 = 1;
                                                            while (true) {
                                                                if (var67 >= var8) {
                                                                    class178.field2271[var97] = var47 + 1;
                                                                    class178.field2270[var97] = var48 - 1;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class178.field2267[var56 + 1][var57 - 1] = 9;
                                                                    class178.field2265[var56 + 1][var57 - 1] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var8 + var58][var59 - 1 + var67] & 0x12401E3) != 0 || (var55[var58 + var67][var59 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var67++;
                                                            }
                                                        }
                                                        if (var56 > 0 && var57 < 128 - var8 && class178.field2267[var56 - 1][var57 + 1] == 0 && (var55[var58 - 1][var8 + var59] & 0x1240138) == 0) {
                                                            for (int var68 = 1; var68 < var8; var68++) {
                                                                if ((var55[var58 - 1][var59 + var68] & 0x124013E) != 0 || (var55[var58 - 1 + var68][var8 + var59] & 0x12401F8) != 0) {
                                                                    continue label652;
                                                                }
                                                            }
                                                            class178.field2271[var97] = var47 - 1;
                                                            class178.field2270[var97] = var48 + 1;
                                                            var97 = var97 + 1 & 0xFFF;
                                                            class178.field2267[var56 - 1][var57 + 1] = 6;
                                                            class178.field2265[var56 - 1][var57 + 1] = var61;
                                                        }
                                                    } while (var56 >= 128 - var8);
                                                } while (var57 >= 128 - var8);
                                            } while (class178.field2267[var56 + 1][var57 + 1] != 0);
                                        } while ((var55[var8 + var58][var8 + var59] & 0x12401E0) != 0);
                                        for (int var69 = 1; var69 < var8; var69++) {
                                            if ((var55[var58 + var69][var8 + var59] & 0x12401F8) != 0 || (var55[var8 + var58][var59 + var69] & 0x12401E3) != 0) {
                                                continue label675;
                                            }
                                        }
                                        class178.field2271[var97] = var47 + 1;
                                        class178.field2270[var97] = var48 + 1;
                                        var97 = var97 + 1 & 0xFFF;
                                        class178.field2267[var56 + 1][var57 + 1] = 12;
                                        class178.field2265[var56 + 1][var57 + 1] = var61;
                                    }
                                }
                                var31 = var60;
                            }
                            int var88;
                            label750: {
                                int var70 = var5 - 64;
                                int var71 = var6 - 64;
                                int var72 = Statics.field2269;
                                int var73 = Statics.field2272;
                                if (!var31) {
                                    int var74 = Integer.MAX_VALUE;
                                    int var75 = Integer.MAX_VALUE;
                                    byte var76 = 10;
                                    int var77 = var10.field2276;
                                    int var78 = var10.field2274;
                                    int var79 = var10.field2277;
                                    int var80 = var10.field2275;
                                    for (int var81 = var77 - var76; var81 <= var76 + var77; var81++) {
                                        for (int var82 = var78 - var76; var82 <= var76 + var78; var82++) {
                                            int var83 = var81 - var70;
                                            int var84 = var82 - var71;
                                            if (var83 >= 0 && var84 >= 0 && var83 < 128 && var84 < 128 && class178.field2265[var83][var84] < 100) {
                                                int var85 = 0;
                                                if (var81 < var77) {
                                                    var85 = var77 - var81;
                                                } else if (var81 > var77 + var79 - 1) {
                                                    var85 = var81 - (var77 + var79 - 1);
                                                }
                                                int var86 = 0;
                                                if (var82 < var78) {
                                                    var86 = var78 - var82;
                                                } else if (var82 > var78 + var80 - 1) {
                                                    var86 = var82 - (var78 + var80 - 1);
                                                }
                                                int var87 = var85 * var85 + var86 * var86;
                                                if (var87 < var74 || var74 == var87 && class178.field2265[var83][var84] < var75) {
                                                    var74 = var87;
                                                    var75 = class178.field2265[var83][var84];
                                                    var72 = var81;
                                                    var73 = var82;
                                                }
                                            }
                                        }
                                    }
                                    if (var74 == Integer.MAX_VALUE) {
                                        var88 = -1;
                                        break label750;
                                    }
                                }
                                if (var5 == var72 && var6 == var73) {
                                    var88 = 0;
                                } else {
                                    byte var89 = 0;
                                    class178.field2271[var89] = var72;
                                    int var98 = var89 + 1;
                                    class178.field2270[var89] = var73;
                                    int var90;
                                    int var91 = var90 = class178.field2267[var72 - var70][var73 - var71];
                                    while (var5 != var72 || var6 != var73) {
                                        if (var90 != var91) {
                                            var90 = var91;
                                            class178.field2271[var98] = var72;
                                            class178.field2270[var98++] = var73;
                                        }
                                        if ((var91 & 0x2) != 0) {
                                            var72++;
                                        } else if ((var91 & 0x8) != 0) {
                                            var72--;
                                        }
                                        if ((var91 & 0x1) != 0) {
                                            var73++;
                                        } else if ((var91 & 0x4) != 0) {
                                            var73--;
                                        }
                                        var91 = class178.field2267[var72 - var70][var73 - var71];
                                    }
                                    int var92 = 0;
                                    while (var98-- > 0) {
                                        var12[var92] = class178.field2271[var98];
                                        var13[var92++] = class178.field2270[var98];
                                        if (var92 >= var12.length) {
                                            break;
                                        }
                                    }
                                    var88 = var92;
                                }
                            }
                            int var93 = var88;
                            if (var88 < 1) {
                                break;
                            }
                            int var94 = 0;
                            while (true) {
                                if (var94 >= var93 - 1) {
                                    break label707;
                                }
                                var4.method1122(client.field1124[var94], client.field1125[var94], (byte) 2);
                                var94++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class178.field2267[var14][var15] = 0;
                            class178.field2265[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method1122(arg0, arg1, arg2);
        } else {
            this.method1155(arg0, arg1);
        }
    }

    @ObfuscatedName("bd.d(III)V")
    public void method1155(int arg0, int arg1) {
        this.field1199 = 0;
        this.field1179 = 0;
        this.field1193 = 0;
        this.field1196[0] = arg0;
        this.field1197[0] = arg1;
        int var3 = this.method1130();
        this.field1154 = this.field1196[0] * 128 + var3 * 64;
        this.field1148 = this.field1197[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bd.r(IIBB)V")
    public final void method1122(int arg0, int arg1, byte arg2) {
        if (this.field1199 < 9) {
            this.field1199++;
        }
        for (int var4 = this.field1199; var4 > 0; var4--) {
            this.field1196[var4] = this.field1196[var4 - 1];
            this.field1197[var4] = this.field1197[var4 - 1];
            this.field1198[var4] = this.field1198[var4 - 1];
        }
        this.field1196[0] = arg0;
        this.field1197[0] = arg1;
        this.field1198[0] = arg2;
    }

    @ObfuscatedName("bd.p(B)Z")
    public final boolean method1123() {
        return this.field817 != null;
    }
}

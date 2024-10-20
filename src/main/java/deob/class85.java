package deob;

@ObfuscatedName("cq")
public final class class85 extends class87 {

    @ObfuscatedName("cq.s")
    public class465 field1110;

    @ObfuscatedName("cq.h")
    public class293 field1084;

    @ObfuscatedName("cq.w")
    public int field1093 = -1;

    @ObfuscatedName("cq.v")
    public int field1086 = -1;

    @ObfuscatedName("cq.q")
    public String[] field1088 = new String[3];

    @ObfuscatedName("cq.i")
    public int field1089;

    @ObfuscatedName("cq.k")
    public int field1083;

    @ObfuscatedName("cq.o")
    public int field1091;

    @ObfuscatedName("cq.n")
    public int field1092;

    @ObfuscatedName("cq.d")
    public int field1107;

    @ObfuscatedName("cq.a")
    public int field1094;

    @ObfuscatedName("cq.m")
    public int field1095;

    @ObfuscatedName("cq.u")
    public int field1098;

    @ObfuscatedName("cq.l")
    public class211 field1097;

    @ObfuscatedName("cq.z")
    public int field1090;

    @ObfuscatedName("cq.r")
    public int field1099;

    @ObfuscatedName("cq.y")
    public int field1100;

    @ObfuscatedName("cq.p")
    public int field1101;

    @ObfuscatedName("cq.e")
    public boolean field1102;

    @ObfuscatedName("cq.b")
    public int field1103;

    @ObfuscatedName("cq.x")
    public boolean field1104;

    @ObfuscatedName("cq.f")
    public int field1105;

    @ObfuscatedName("cq.t")
    public int field1085;

    @ObfuscatedName("cq.j")
    public class377 field1113;

    @ObfuscatedName("cq.g")
    public class377 field1108;

    @ObfuscatedName("cq.ar")
    public class377 field1109;

    @ObfuscatedName("cq.aq")
    public boolean field1112;

    @ObfuscatedName("cq.av")
    public int field1111;

    @ObfuscatedName("cq.aj")
    public int field1096;

    public class85() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field1088[var1] = "";
        }
        this.field1089 = 0;
        this.field1083 = 0;
        this.field1092 = 0;
        this.field1107 = 0;
        this.field1102 = false;
        this.field1103 = 0;
        this.field1104 = false;
        this.field1113 = class377.field4329;
        this.field1108 = class377.field4329;
        this.field1109 = class377.field4329;
        this.field1112 = false;
    }

    @ObfuscatedName("cq.s(Lqr;I)V")
    public final void method2019(class444 arg0) {
        arg0.field4708 = 0;
        int var2 = arg0.method6929();
        this.field1093 = arg0.method6930();
        this.field1086 = arg0.method6930();
        int var3 = -1;
        this.field1103 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method6929();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method6929();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method7120();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class188.method2231(var4[var5] - 512).field2094;
                    if (var8 != 0) {
                        this.field1103 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method6929();
            if (var11 < 0 || var11 >= Statics.field2276[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1133 = arg0.method7120();
        if (this.field1133 == 65535) {
            this.field1133 = -1;
        }
        this.field1134 = arg0.method7120();
        if (this.field1134 == 65535) {
            this.field1134 = -1;
        }
        this.field1135 = this.field1134;
        this.field1136 = arg0.method7120();
        if (this.field1136 == 65535) {
            this.field1136 = -1;
        }
        this.field1129 = arg0.method7120();
        if (this.field1129 == 65535) {
            this.field1129 = -1;
        }
        this.field1138 = arg0.method7120();
        if (this.field1138 == 65535) {
            this.field1138 = -1;
        }
        this.field1139 = arg0.method7120();
        if (this.field1139 == 65535) {
            this.field1139 = -1;
        }
        this.field1140 = arg0.method7120();
        if (this.field1140 == 65535) {
            this.field1140 = -1;
        }
        this.field1110 = new class465(arg0.method6975(), Statics.field2008);
        this.method1982();
        this.method1985();
        this.method2018();
        if (Statics.field454 == this) {
            Statics.field4846 = this.field1110.method7491();
        }
        this.field1089 = arg0.method6929();
        this.field1083 = arg0.method7120();
        this.field1104 = arg0.method6929() == 1;
        if (client.field662 == 0 && client.field757 >= 2) {
            this.field1104 = false;
        }
        class168[] var12 = null;
        boolean var13 = false;
        int var14 = arg0.method7120();
        boolean var15 = (var14 >> 15 & 0x1) == 1;
        if (var14 > 0 && var14 != 32768) {
            var12 = new class168[12];
            for (int var16 = 0; var16 < 12; var16++) {
                int var17 = var14 >> 12 - var16 & 0x1;
                if (var17 == 1) {
                    var12[var16] = class168.method2416(var4[var16] - 512, arg0);
                }
            }
        }
        if (arg0.field4708 < arg0.field4707.length) {
            for (int var18 = 0; var18 < 3; var18++) {
                this.field1088[var18] = arg0.method6975();
            }
        }
        if (this.field1084 == null) {
            this.field1084 = new class293();
        }
        this.field1084.method4934(var4, var12, var15, var9, var2 == 1, var3);
    }

    @ObfuscatedName("cq.w(B)Z")
    public boolean method1981() {
        if (class377.field4329 == this.field1113) {
            this.method1983();
        }
        return class377.field4330 == this.field1113;
    }

    @ObfuscatedName("cq.v(S)V")
    public void method1982() {
        this.field1113 = class377.field4329;
    }

    @ObfuscatedName("cq.k(I)V")
    public void method1983() {
        this.field1113 = Statics.field4063.method1541(this.field1110) ? class377.field4330 : class377.field4331;
    }

    @ObfuscatedName("cq.o(I)Z")
    public boolean method1984() {
        if (class377.field4329 == this.field1108) {
            this.method1986();
        }
        return class377.field4330 == this.field1108;
    }

    @ObfuscatedName("cq.n(I)V")
    public void method1985() {
        this.field1108 = class377.field4329;
    }

    @ObfuscatedName("cq.d(B)V")
    public void method1986() {
        this.field1108 = Statics.field105 != null && Statics.field105.method6022(this.field1110) ? class377.field4330 : class377.field4331;
    }

    @ObfuscatedName("cq.a(I)V")
    public void method1988() {
        for (int var1 = 0; var1 < 4; var1++) {
            if (client.field719[var1] != null && client.field719[var1].method2673(this.field1110.method7491()) != -1 && var1 != 2) {
                this.field1109 = class377.field4330;
                return;
            }
        }
        this.field1109 = class377.field4331;
    }

    @ObfuscatedName("cq.m(I)V")
    public void method2018() {
        this.field1109 = class377.field4329;
    }

    @ObfuscatedName("cq.u(I)Z")
    public boolean method2016() {
        if (class377.field4329 == this.field1109) {
            this.method1988();
        }
        return class377.field4330 == this.field1109;
    }

    @ObfuscatedName("cq.l(I)I")
    public int method1990() {
        return this.field1084 == null || this.field1084.field3329 == -1 ? 1 : class178.method2587(this.field1084.field3329).field1907;
    }

    @ObfuscatedName("cq.h(B)Lhp;")
    public final class211 method1748() {
        if (this.field1084 == null) {
            return null;
        }
        class190 var1 = this.field1169 != -1 && this.field1127 == 0 ? class190.method5853(this.field1169) : null;
        class190 var2 = this.field1156 == -1 || this.field1102 || this.field1156 == this.field1133 && var1 != null ? null : class190.method5853(this.field1156);
        class211 var3 = this.field1084.method4965(var1, this.field1170, var2, this.field1166);
        if (var3 == null) {
            return null;
        }
        var3.method3930();
        this.field1187 = var3.field2449;
        int var4 = var3.field2521;
        if (!this.field1102 && this.field1174 != -1 && this.field1175 != -1) {
            class211 var5 = class180.method6177(this.field1174).method3109(this.field1175);
            if (var5 != null) {
                var5.method4031(0, -this.field1196, 0);
                class211[] var6 = new class211[] { var3, var5 };
                var3 = new class211(var6, 2);
            }
        }
        if (!this.field1102 && this.field1097 != null) {
            if (client.field487 >= this.field1107) {
                this.field1097 = null;
            }
            if (client.field487 >= this.field1092 && client.field487 < this.field1107) {
                class211 var7 = this.field1097;
                var7.method4031(this.field1094 - this.field1172, this.field1095 - this.field1091, this.field1098 - this.field1155);
                if (this.field1194 == 512) {
                    var7.method3942();
                    var7.method3942();
                    var7.method3942();
                } else if (this.field1194 == 1024) {
                    var7.method3942();
                    var7.method3942();
                } else if (this.field1194 == 1536) {
                    var7.method3942();
                }
                class211[] var8 = new class211[] { var3, var7 };
                var3 = new class211(var8, 2);
                if (this.field1194 == 512) {
                    var7.method3942();
                } else if (this.field1194 == 1024) {
                    var7.method3942();
                    var7.method3942();
                } else if (this.field1194 == 1536) {
                    var7.method3942();
                    var7.method3942();
                    var7.method3942();
                }
                var7.method4031(this.field1172 - this.field1094, this.field1091 - this.field1095, this.field1155 - this.field1098);
            }
        }
        var3.field2541 = true;
        if (this.field1193 == 0 || client.field487 < this.field1188 || client.field487 >= this.field1189) {
            var3.field2588 = 0;
        } else {
            var3.field2550 = this.field1190;
            var3.field2525 = this.field1132;
            var3.field2589 = this.field1192;
            var3.field2588 = this.field1193;
            var3.field2528 = (short) var4;
        }
        return var3;
    }

    @ObfuscatedName("cq.z(IILgi;I)V")
    public final void method2015(int arg0, int arg1, class193 arg2) {
        if (this.field1169 != -1 && class190.method5853(this.field1169).field2181 == 1) {
            this.field1169 = -1;
        }
        this.field1163 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1991(arg0, arg1);
        } else if (this.field1198[0] >= 0 && this.field1198[0] < 104 && this.field1199[0] >= 0 && this.field1199[0] < 104) {
            if (class193.field2208 == arg2) {
                class85 var4 = this;
                class193 var5 = class193.field2208;
                int var6 = this.field1198[0];
                int var7 = this.field1199[0];
                int var8 = this.method1990();
                if (var6 >= var8 && var6 < 104 - var8 && var7 >= var8 && var7 < 104 - var8 && arg0 >= var8 && arg0 < 104 - var8 && arg1 >= var8 && arg1 < 104 - var8) {
                    int var9 = this.method1990();
                    class192 var10 = client.method159(arg0, arg1);
                    class191 var11 = client.field597[this.field1105];
                    int[] var12 = client.field548;
                    int[] var13 = client.field772;
                    int var14 = 0;
                    label707: while (true) {
                        if (var14 >= 128) {
                            boolean var31;
                            if (var9 == 1) {
                                int var16 = var6;
                                int var17 = var7;
                                byte var18 = 64;
                                byte var19 = 64;
                                int var20 = var6 - var18;
                                int var21 = var7 - var19;
                                class194.field2216[var18][var19] = 99;
                                class194.field2219[var18][var19] = 0;
                                byte var22 = 0;
                                int var23 = 0;
                                class194.field2217[var22] = var6;
                                int var95 = var22 + 1;
                                class194.field2218[var22] = var7;
                                int[][] var24 = var11.field2189;
                                boolean var29;
                                while (true) {
                                    if (var95 == var23) {
                                        Statics.field3289 = var16;
                                        Statics.field2213 = var17;
                                        var29 = false;
                                        break;
                                    }
                                    var16 = class194.field2217[var23];
                                    var17 = class194.field2218[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    int var25 = var16 - var20;
                                    int var26 = var17 - var21;
                                    int var27 = var16 - var11.field2192;
                                    int var28 = var17 - var11.field2196;
                                    if (var10.method990(1, var16, var17, var11)) {
                                        Statics.field3289 = var16;
                                        Statics.field2213 = var17;
                                        var29 = true;
                                        break;
                                    }
                                    int var30 = class194.field2219[var25][var26] + 1;
                                    if (var25 > 0 && class194.field2216[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0) {
                                        class194.field2217[var95] = var16 - 1;
                                        class194.field2218[var95] = var17;
                                        var95 = var95 + 1 & 0xFFF;
                                        class194.field2216[var25 - 1][var26] = 2;
                                        class194.field2219[var25 - 1][var26] = var30;
                                    }
                                    if (var25 < 127 && class194.field2216[var25 + 1][var26] == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0) {
                                        class194.field2217[var95] = var16 + 1;
                                        class194.field2218[var95] = var17;
                                        var95 = var95 + 1 & 0xFFF;
                                        class194.field2216[var25 + 1][var26] = 8;
                                        class194.field2219[var25 + 1][var26] = var30;
                                    }
                                    if (var26 > 0 && class194.field2216[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class194.field2217[var95] = var16;
                                        class194.field2218[var95] = var17 - 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class194.field2216[var25][var26 - 1] = 1;
                                        class194.field2219[var25][var26 - 1] = var30;
                                    }
                                    if (var26 < 127 && class194.field2216[var25][var26 + 1] == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class194.field2217[var95] = var16;
                                        class194.field2218[var95] = var17 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class194.field2216[var25][var26 + 1] = 4;
                                        class194.field2219[var25][var26 + 1] = var30;
                                    }
                                    if (var25 > 0 && var26 > 0 && class194.field2216[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class194.field2217[var95] = var16 - 1;
                                        class194.field2218[var95] = var17 - 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class194.field2216[var25 - 1][var26 - 1] = 3;
                                        class194.field2219[var25 - 1][var26 - 1] = var30;
                                    }
                                    if (var25 < 127 && var26 > 0 && class194.field2216[var25 + 1][var26 - 1] == 0 && (var24[var27 + 1][var28 - 1] & 0x1240183) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 - 1] & 0x1240102) == 0) {
                                        class194.field2217[var95] = var16 + 1;
                                        class194.field2218[var95] = var17 - 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class194.field2216[var25 + 1][var26 - 1] = 9;
                                        class194.field2219[var25 + 1][var26 - 1] = var30;
                                    }
                                    if (var25 > 0 && var26 < 127 && class194.field2216[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var28 + 1] & 0x1240138) == 0 && (var24[var27 - 1][var28] & 0x1240108) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class194.field2217[var95] = var16 - 1;
                                        class194.field2218[var95] = var17 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class194.field2216[var25 - 1][var26 + 1] = 6;
                                        class194.field2219[var25 - 1][var26 + 1] = var30;
                                    }
                                    if (var25 < 127 && var26 < 127 && class194.field2216[var25 + 1][var26 + 1] == 0 && (var24[var27 + 1][var28 + 1] & 0x12401E0) == 0 && (var24[var27 + 1][var28] & 0x1240180) == 0 && (var24[var27][var28 + 1] & 0x1240120) == 0) {
                                        class194.field2217[var95] = var16 + 1;
                                        class194.field2218[var95] = var17 + 1;
                                        var95 = var95 + 1 & 0xFFF;
                                        class194.field2216[var25 + 1][var26 + 1] = 12;
                                        class194.field2219[var25 + 1][var26 + 1] = var30;
                                    }
                                }
                                var31 = var29;
                            } else if (var9 == 2) {
                                int var32 = var6;
                                int var33 = var7;
                                byte var34 = 64;
                                byte var35 = 64;
                                int var36 = var6 - var34;
                                int var37 = var7 - var35;
                                class194.field2216[var34][var35] = 99;
                                class194.field2219[var34][var35] = 0;
                                byte var38 = 0;
                                int var39 = 0;
                                class194.field2217[var38] = var6;
                                int var96 = var38 + 1;
                                class194.field2218[var38] = var7;
                                int[][] var40 = var11.field2189;
                                boolean var45;
                                while (true) {
                                    if (var96 == var39) {
                                        Statics.field3289 = var32;
                                        Statics.field2213 = var33;
                                        var45 = false;
                                        break;
                                    }
                                    var32 = class194.field2217[var39];
                                    var33 = class194.field2218[var39];
                                    var39 = var39 + 1 & 0xFFF;
                                    int var41 = var32 - var36;
                                    int var42 = var33 - var37;
                                    int var43 = var32 - var11.field2192;
                                    int var44 = var33 - var11.field2196;
                                    if (var10.method990(2, var32, var33, var11)) {
                                        Statics.field3289 = var32;
                                        Statics.field2213 = var33;
                                        var45 = true;
                                        break;
                                    }
                                    int var46 = class194.field2219[var41][var42] + 1;
                                    if (var41 > 0 && class194.field2216[var41 - 1][var42] == 0 && (var40[var43 - 1][var44] & 0x124010E) == 0 && (var40[var43 - 1][var44 + 1] & 0x1240138) == 0) {
                                        class194.field2217[var96] = var32 - 1;
                                        class194.field2218[var96] = var33;
                                        var96 = var96 + 1 & 0xFFF;
                                        class194.field2216[var41 - 1][var42] = 2;
                                        class194.field2219[var41 - 1][var42] = var46;
                                    }
                                    if (var41 < 126 && class194.field2216[var41 + 1][var42] == 0 && (var40[var43 + 2][var44] & 0x1240183) == 0 && (var40[var43 + 2][var44 + 1] & 0x12401E0) == 0) {
                                        class194.field2217[var96] = var32 + 1;
                                        class194.field2218[var96] = var33;
                                        var96 = var96 + 1 & 0xFFF;
                                        class194.field2216[var41 + 1][var42] = 8;
                                        class194.field2219[var41 + 1][var42] = var46;
                                    }
                                    if (var42 > 0 && class194.field2216[var41][var42 - 1] == 0 && (var40[var43][var44 - 1] & 0x124010E) == 0 && (var40[var43 + 1][var44 - 1] & 0x1240183) == 0) {
                                        class194.field2217[var96] = var32;
                                        class194.field2218[var96] = var33 - 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class194.field2216[var41][var42 - 1] = 1;
                                        class194.field2219[var41][var42 - 1] = var46;
                                    }
                                    if (var42 < 126 && class194.field2216[var41][var42 + 1] == 0 && (var40[var43][var44 + 2] & 0x1240138) == 0 && (var40[var43 + 1][var44 + 2] & 0x12401E0) == 0) {
                                        class194.field2217[var96] = var32;
                                        class194.field2218[var96] = var33 + 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class194.field2216[var41][var42 + 1] = 4;
                                        class194.field2219[var41][var42 + 1] = var46;
                                    }
                                    if (var41 > 0 && var42 > 0 && class194.field2216[var41 - 1][var42 - 1] == 0 && (var40[var43 - 1][var44] & 0x124013E) == 0 && (var40[var43 - 1][var44 - 1] & 0x124010E) == 0 && (var40[var43][var44 - 1] & 0x124018F) == 0) {
                                        class194.field2217[var96] = var32 - 1;
                                        class194.field2218[var96] = var33 - 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class194.field2216[var41 - 1][var42 - 1] = 3;
                                        class194.field2219[var41 - 1][var42 - 1] = var46;
                                    }
                                    if (var41 < 126 && var42 > 0 && class194.field2216[var41 + 1][var42 - 1] == 0 && (var40[var43 + 1][var44 - 1] & 0x124018F) == 0 && (var40[var43 + 2][var44 - 1] & 0x1240183) == 0 && (var40[var43 + 2][var44] & 0x12401E3) == 0) {
                                        class194.field2217[var96] = var32 + 1;
                                        class194.field2218[var96] = var33 - 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class194.field2216[var41 + 1][var42 - 1] = 9;
                                        class194.field2219[var41 + 1][var42 - 1] = var46;
                                    }
                                    if (var41 > 0 && var42 < 126 && class194.field2216[var41 - 1][var42 + 1] == 0 && (var40[var43 - 1][var44 + 1] & 0x124013E) == 0 && (var40[var43 - 1][var44 + 2] & 0x1240138) == 0 && (var40[var43][var44 + 2] & 0x12401F8) == 0) {
                                        class194.field2217[var96] = var32 - 1;
                                        class194.field2218[var96] = var33 + 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class194.field2216[var41 - 1][var42 + 1] = 6;
                                        class194.field2219[var41 - 1][var42 + 1] = var46;
                                    }
                                    if (var41 < 126 && var42 < 126 && class194.field2216[var41 + 1][var42 + 1] == 0 && (var40[var43 + 1][var44 + 2] & 0x12401F8) == 0 && (var40[var43 + 2][var44 + 2] & 0x12401E0) == 0 && (var40[var43 + 2][var44 + 1] & 0x12401E3) == 0) {
                                        class194.field2217[var96] = var32 + 1;
                                        class194.field2218[var96] = var33 + 1;
                                        var96 = var96 + 1 & 0xFFF;
                                        class194.field2216[var41 + 1][var42 + 1] = 12;
                                        class194.field2219[var41 + 1][var42 + 1] = var46;
                                    }
                                }
                                var31 = var45;
                            } else {
                                int var47 = var6;
                                int var48 = var7;
                                byte var49 = 64;
                                byte var50 = 64;
                                int var51 = var6 - var49;
                                int var52 = var7 - var50;
                                class194.field2216[var49][var50] = 99;
                                class194.field2219[var49][var50] = 0;
                                byte var53 = 0;
                                int var54 = 0;
                                class194.field2217[var53] = var6;
                                int var97 = var53 + 1;
                                class194.field2218[var53] = var7;
                                int[][] var55 = var11.field2189;
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
                                                            Statics.field3289 = var47;
                                                            Statics.field2213 = var48;
                                                            var60 = false;
                                                            break label677;
                                                        }
                                                        var47 = class194.field2217[var54];
                                                        var48 = class194.field2218[var54];
                                                        var54 = var54 + 1 & 0xFFF;
                                                        var56 = var47 - var51;
                                                        var57 = var48 - var52;
                                                        var58 = var47 - var11.field2192;
                                                        var59 = var48 - var11.field2196;
                                                        if (var10.method990(var9, var47, var48, var11)) {
                                                            Statics.field3289 = var47;
                                                            Statics.field2213 = var48;
                                                            var60 = true;
                                                            break label677;
                                                        }
                                                        var61 = class194.field2219[var56][var57] + 1;
                                                        if (var56 > 0 && class194.field2216[var56 - 1][var57] == 0 && (var55[var58 - 1][var59] & 0x124010E) == 0 && (var55[var58 - 1][var9 + var59 - 1] & 0x1240138) == 0) {
                                                            int var62 = 1;
                                                            while (true) {
                                                                if (var62 >= var9 - 1) {
                                                                    class194.field2217[var97] = var47 - 1;
                                                                    class194.field2218[var97] = var48;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class194.field2216[var56 - 1][var57] = 2;
                                                                    class194.field2219[var56 - 1][var57] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var58 - 1][var59 + var62] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var62++;
                                                            }
                                                        }
                                                        if (var56 < 128 - var9 && class194.field2216[var56 + 1][var57] == 0 && (var55[var9 + var58][var59] & 0x1240183) == 0 && (var55[var9 + var58][var9 + var59 - 1] & 0x12401E0) == 0) {
                                                            int var63 = 1;
                                                            while (true) {
                                                                if (var63 >= var9 - 1) {
                                                                    class194.field2217[var97] = var47 + 1;
                                                                    class194.field2218[var97] = var48;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class194.field2216[var56 + 1][var57] = 8;
                                                                    class194.field2219[var56 + 1][var57] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var9 + var58][var59 + var63] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var63++;
                                                            }
                                                        }
                                                        if (var57 > 0 && class194.field2216[var56][var57 - 1] == 0 && (var55[var58][var59 - 1] & 0x124010E) == 0 && (var55[var9 + var58 - 1][var59 - 1] & 0x1240183) == 0) {
                                                            int var64 = 1;
                                                            while (true) {
                                                                if (var64 >= var9 - 1) {
                                                                    class194.field2217[var97] = var47;
                                                                    class194.field2218[var97] = var48 - 1;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class194.field2216[var56][var57 - 1] = 1;
                                                                    class194.field2219[var56][var57 - 1] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var58 + var64][var59 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var64++;
                                                            }
                                                        }
                                                        if (var57 < 128 - var9 && class194.field2216[var56][var57 + 1] == 0 && (var55[var58][var9 + var59] & 0x1240138) == 0 && (var55[var9 + var58 - 1][var9 + var59] & 0x12401E0) == 0) {
                                                            int var65 = 1;
                                                            while (true) {
                                                                if (var65 >= var9 - 1) {
                                                                    class194.field2217[var97] = var47;
                                                                    class194.field2218[var97] = var48 + 1;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class194.field2216[var56][var57 + 1] = 4;
                                                                    class194.field2219[var56][var57 + 1] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var58 + var65][var9 + var59] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var65++;
                                                            }
                                                        }
                                                        if (var56 > 0 && var57 > 0 && class194.field2216[var56 - 1][var57 - 1] == 0 && (var55[var58 - 1][var59 - 1] & 0x124010E) == 0) {
                                                            int var66 = 1;
                                                            while (true) {
                                                                if (var66 >= var9) {
                                                                    class194.field2217[var97] = var47 - 1;
                                                                    class194.field2218[var97] = var48 - 1;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class194.field2216[var56 - 1][var57 - 1] = 3;
                                                                    class194.field2219[var56 - 1][var57 - 1] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var58 - 1][var59 - 1 + var66] & 0x124013E) != 0 || (var55[var58 - 1 + var66][var59 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var66++;
                                                            }
                                                        }
                                                        if (var56 < 128 - var9 && var57 > 0 && class194.field2216[var56 + 1][var57 - 1] == 0 && (var55[var9 + var58][var59 - 1] & 0x1240183) == 0) {
                                                            int var67 = 1;
                                                            while (true) {
                                                                if (var67 >= var9) {
                                                                    class194.field2217[var97] = var47 + 1;
                                                                    class194.field2218[var97] = var48 - 1;
                                                                    var97 = var97 + 1 & 0xFFF;
                                                                    class194.field2216[var56 + 1][var57 - 1] = 9;
                                                                    class194.field2219[var56 + 1][var57 - 1] = var61;
                                                                    break;
                                                                }
                                                                if ((var55[var9 + var58][var59 - 1 + var67] & 0x12401E3) != 0 || (var55[var58 + var67][var59 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var67++;
                                                            }
                                                        }
                                                        if (var56 > 0 && var57 < 128 - var9 && class194.field2216[var56 - 1][var57 + 1] == 0 && (var55[var58 - 1][var9 + var59] & 0x1240138) == 0) {
                                                            for (int var68 = 1; var68 < var9; var68++) {
                                                                if ((var55[var58 - 1][var59 + var68] & 0x124013E) != 0 || (var55[var58 - 1 + var68][var9 + var59] & 0x12401F8) != 0) {
                                                                    continue label652;
                                                                }
                                                            }
                                                            class194.field2217[var97] = var47 - 1;
                                                            class194.field2218[var97] = var48 + 1;
                                                            var97 = var97 + 1 & 0xFFF;
                                                            class194.field2216[var56 - 1][var57 + 1] = 6;
                                                            class194.field2219[var56 - 1][var57 + 1] = var61;
                                                        }
                                                    } while (var56 >= 128 - var9);
                                                } while (var57 >= 128 - var9);
                                            } while (class194.field2216[var56 + 1][var57 + 1] != 0);
                                        } while ((var55[var9 + var58][var9 + var59] & 0x12401E0) != 0);
                                        for (int var69 = 1; var69 < var9; var69++) {
                                            if ((var55[var58 + var69][var9 + var59] & 0x12401F8) != 0 || (var55[var9 + var58][var59 + var69] & 0x12401E3) != 0) {
                                                continue label675;
                                            }
                                        }
                                        class194.field2217[var97] = var47 + 1;
                                        class194.field2218[var97] = var48 + 1;
                                        var97 = var97 + 1 & 0xFFF;
                                        class194.field2216[var56 + 1][var57 + 1] = 12;
                                        class194.field2219[var56 + 1][var57 + 1] = var61;
                                    }
                                }
                                var31 = var60;
                            }
                            int var88;
                            label750: {
                                int var70 = var6 - 64;
                                int var71 = var7 - 64;
                                int var72 = Statics.field3289;
                                int var73 = Statics.field2213;
                                if (!var31) {
                                    int var74 = Integer.MAX_VALUE;
                                    int var75 = Integer.MAX_VALUE;
                                    byte var76 = 10;
                                    int var77 = var10.field2200;
                                    int var78 = var10.field2198;
                                    int var79 = var10.field2202;
                                    int var80 = var10.field2201;
                                    for (int var81 = var77 - var76; var81 <= var76 + var77; var81++) {
                                        for (int var82 = var78 - var76; var82 <= var76 + var78; var82++) {
                                            int var83 = var81 - var70;
                                            int var84 = var82 - var71;
                                            if (var83 >= 0 && var84 >= 0 && var83 < 128 && var84 < 128 && class194.field2219[var83][var84] < 100) {
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
                                                if (var87 < var74 || var74 == var87 && class194.field2219[var83][var84] < var75) {
                                                    var74 = var87;
                                                    var75 = class194.field2219[var83][var84];
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
                                if (var6 == var72 && var7 == var73) {
                                    var12[0] = var72;
                                    var13[0] = var73;
                                    var88 = 0;
                                } else {
                                    byte var89 = 0;
                                    class194.field2217[var89] = var72;
                                    int var98 = var89 + 1;
                                    class194.field2218[var89] = var73;
                                    int var90;
                                    int var91 = var90 = class194.field2216[var72 - var70][var73 - var71];
                                    while (var6 != var72 || var7 != var73) {
                                        if (var90 != var91) {
                                            var90 = var91;
                                            class194.field2217[var98] = var72;
                                            class194.field2218[var98++] = var73;
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
                                        var91 = class194.field2216[var72 - var70][var73 - var71];
                                    }
                                    int var92 = 0;
                                    while (var98-- > 0) {
                                        var12[var92] = class194.field2217[var98];
                                        var13[var92++] = class194.field2218[var98];
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
                                var4.method1992(client.field548[var94], client.field772[var94], var5);
                                var94++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class194.field2216[var14][var15] = 0;
                            class194.field2219[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method1992(arg0, arg1, arg2);
        } else {
            this.method1991(arg0, arg1);
        }
    }

    @ObfuscatedName("cq.r(III)V")
    public void method1991(int arg0, int arg1) {
        this.field1197 = 0;
        this.field1202 = 0;
        this.field1201 = 0;
        this.field1198[0] = arg0;
        this.field1199[0] = arg1;
        int var3 = this.method1990();
        this.field1172 = this.field1198[0] * 128 + var3 * 64;
        this.field1155 = this.field1199[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("cq.y(IILgi;B)V")
    public final void method1992(int arg0, int arg1, class193 arg2) {
        if (this.field1197 < 9) {
            this.field1197++;
        }
        for (int var4 = this.field1197; var4 > 0; var4--) {
            this.field1198[var4] = this.field1198[var4 - 1];
            this.field1199[var4] = this.field1199[var4 - 1];
            this.field1145[var4] = this.field1145[var4 - 1];
        }
        this.field1198[0] = arg0;
        this.field1199[0] = arg1;
        this.field1145[0] = arg2;
    }

    @ObfuscatedName("cq.p(B)Z")
    public final boolean method1993() {
        return this.field1084 != null;
    }
}

package deob;

@ObfuscatedName("be")
public final class class75 extends class79 {

    @ObfuscatedName("be.a")
    public String field878;

    @ObfuscatedName("be.j")
    public class214 field869;

    @ObfuscatedName("be.n")
    public int field877 = -1;

    @ObfuscatedName("be.r")
    public int field897 = -1;

    @ObfuscatedName("be.e")
    public String[] field873 = new String[3];

    @ObfuscatedName("be.l")
    public int field874;

    @ObfuscatedName("be.s")
    public int field875;

    @ObfuscatedName("be.w")
    public int field887;

    @ObfuscatedName("be.p")
    public int field879;

    @ObfuscatedName("be.m")
    public int field885;

    @ObfuscatedName("be.u")
    public int field896;

    @ObfuscatedName("be.g")
    public int field880;

    @ObfuscatedName("be.k")
    public int field881;

    @ObfuscatedName("be.t")
    public class134 field891;

    @ObfuscatedName("be.c")
    public int field883;

    @ObfuscatedName("be.o")
    public int field884;

    @ObfuscatedName("be.x")
    public int field868;

    @ObfuscatedName("be.f")
    public int field886;

    @ObfuscatedName("be.h")
    public boolean field870;

    @ObfuscatedName("be.z")
    public int field888;

    @ObfuscatedName("be.i")
    public boolean field889;

    @ObfuscatedName("be.d")
    public int field890;

    @ObfuscatedName("be.b")
    public int field871;

    @ObfuscatedName("be.q")
    public boolean field892;

    @ObfuscatedName("be.y")
    public int field893;

    @ObfuscatedName("be.ai")
    public int field894;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field873[var1] = "";
        }
        this.field874 = 0;
        this.field875 = 0;
        this.field879 = 0;
        this.field885 = 0;
        this.field870 = false;
        this.field888 = 0;
        this.field889 = false;
        this.field892 = false;
    }

    @ObfuscatedName("be.a(Lfe;I)V")
    public final void method1017(class174 arg0) {
        arg0.field2394 = 0;
        int var2 = arg0.method2871();
        this.field877 = arg0.method2872();
        this.field897 = arg0.method2872();
        int var3 = -1;
        this.field888 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2871();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2871();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2873();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class257.method1498(var4[var5] - 512).field3537;
                    if (var8 != 0) {
                        this.field888 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2871();
            if (var11 < 0 || var11 >= Statics.field2508[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1271 = arg0.method2873();
        if (this.field1271 == 65535) {
            this.field1271 = -1;
        }
        this.field1221 = arg0.method2873();
        if (this.field1221 == 65535) {
            this.field1221 = -1;
        }
        this.field1245 = this.field1221;
        this.field1252 = arg0.method2873();
        if (this.field1252 == 65535) {
            this.field1252 = -1;
        }
        this.field1224 = arg0.method2873();
        if (this.field1224 == 65535) {
            this.field1224 = -1;
        }
        this.field1225 = arg0.method2873();
        if (this.field1225 == 65535) {
            this.field1225 = -1;
        }
        this.field1226 = arg0.method2873();
        if (this.field1226 == 65535) {
            this.field1226 = -1;
        }
        this.field1222 = arg0.method2873();
        if (this.field1222 == 65535) {
            this.field1222 = -1;
        }
        this.field878 = arg0.method2879();
        if (Statics.field1537 == this) {
            Statics.field2209 = this.field878;
        }
        this.field874 = arg0.method2871();
        this.field875 = arg0.method2873();
        this.field889 = arg0.method2871() == 1;
        if (client.field1021 == 0 && client.field1074 >= 2) {
            this.field889 = false;
        }
        if (this.field869 == null) {
            this.field869 = new class214();
        }
        this.field869.method3624(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("be.j(I)I")
    public int method996() {
        return this.field869 == null || this.field869.field2619 == -1 ? 1 : class259.method3748(this.field869.field2619).field3558;
    }

    @ObfuscatedName("be.n(B)Lej;")
    public final class134 method1018() {
        if (this.field869 == null) {
            return null;
        }
        class261 var1 = this.field1247 != -1 && this.field1227 == 0 ? class261.method1884(this.field1247) : null;
        class261 var2 = this.field1244 == -1 || this.field870 || this.field1271 == this.field1244 && var1 != null ? null : class261.method1884(this.field1244);
        class134 var3 = this.field869.method3630(var1, this.field1248, var2, this.field1253);
        if (var3 == null) {
            return null;
        }
        var3.method2319();
        this.field1236 = var3.field2119;
        if (!this.field870 && this.field1215 != -1 && this.field1251 != -1) {
            class134 var4 = class246.method3901(this.field1215).method3954(this.field1251);
            if (var4 != null) {
                var4.method2352(0, -this.field1256, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (!this.field870 && this.field891 != null) {
            if (client.field934 >= this.field885) {
                this.field891 = null;
            }
            if (client.field934 >= this.field879 && client.field934 < this.field885) {
                class134 var6 = this.field891;
                var6.method2352(this.field896 - this.field1233, this.field880 - this.field887, this.field881 - this.field1265);
                if (this.field1266 == 512) {
                    var6.method2283();
                    var6.method2283();
                    var6.method2283();
                } else if (this.field1266 == 1024) {
                    var6.method2283();
                    var6.method2283();
                } else if (this.field1266 == 1536) {
                    var6.method2283();
                }
                class134[] var7 = new class134[] { var3, var6 };
                var3 = new class134(var7, 2);
                if (this.field1266 == 512) {
                    var6.method2283();
                } else if (this.field1266 == 1024) {
                    var6.method2283();
                    var6.method2283();
                } else if (this.field1266 == 1536) {
                    var6.method2283();
                    var6.method2283();
                    var6.method2283();
                }
                var6.method2352(this.field1233 - this.field896, this.field887 - this.field880, this.field1265 - this.field881);
            }
        }
        var3.field1976 = true;
        return var3;
    }

    @ObfuscatedName("be.r(IIBB)V")
    public final void method998(int arg0, int arg1, byte arg2) {
        if (this.field1247 != -1 && class261.method1884(this.field1247).field3621 == 1) {
            this.field1247 = -1;
        }
        this.field1243 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method999(arg0, arg1);
        } else if (this.field1270[0] >= 0 && this.field1270[0] < 104 && this.field1255[0] >= 0 && this.field1255[0] < 104) {
            if (arg2 == 2) {
                class75 var4 = this;
                int var5 = this.field1270[0];
                int var6 = this.field1255[0];
                int var7 = this.method996();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method996();
                    class164 var9 = client.method679(arg0, arg1);
                    class162 var10 = client.field967[this.field890];
                    int[] var11 = client.field1186;
                    int[] var12 = client.field1092;
                    int var13 = 0;
                    label606: while (true) {
                        if (var13 >= 128) {
                            boolean var15;
                            if (var8 == 1) {
                                var15 = class163.method166(var5, var6, var9, var10);
                            } else if (var8 == 2) {
                                int var16 = var5;
                                int var17 = var6;
                                byte var18 = 64;
                                byte var19 = 64;
                                int var20 = var5 - var18;
                                int var21 = var6 - var19;
                                class163.field2305[var18][var19] = 99;
                                class163.field2300[var18][var19] = 0;
                                byte var22 = 0;
                                int var23 = 0;
                                class163.field2302[var22] = var5;
                                int var79 = var22 + 1;
                                class163.field2304[var22] = var6;
                                int[][] var24 = var10.field2295;
                                boolean var29;
                                while (true) {
                                    if (var79 == var23) {
                                        Statics.field2303 = var16;
                                        Statics.field2135 = var17;
                                        var29 = false;
                                        break;
                                    }
                                    var16 = class163.field2302[var23];
                                    var17 = class163.field2304[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    int var25 = var16 - var20;
                                    int var26 = var17 - var21;
                                    int var27 = var16 - var10.field2281;
                                    int var28 = var17 - var10.field2292;
                                    if (var9.method991(2, var16, var17, var10)) {
                                        Statics.field2303 = var16;
                                        Statics.field2135 = var17;
                                        var29 = true;
                                        break;
                                    }
                                    int var30 = class163.field2300[var25][var26] + 1;
                                    if (var25 > 0 && class163.field2305[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x124010E) == 0 && (var24[var27 - 1][var28 + 1] & 0x1240138) == 0) {
                                        class163.field2302[var79] = var16 - 1;
                                        class163.field2304[var79] = var17;
                                        var79 = var79 + 1 & 0xFFF;
                                        class163.field2305[var25 - 1][var26] = 2;
                                        class163.field2300[var25 - 1][var26] = var30;
                                    }
                                    if (var25 < 126 && class163.field2305[var25 + 1][var26] == 0 && (var24[var27 + 2][var28] & 0x1240183) == 0 && (var24[var27 + 2][var28 + 1] & 0x12401E0) == 0) {
                                        class163.field2302[var79] = var16 + 1;
                                        class163.field2304[var79] = var17;
                                        var79 = var79 + 1 & 0xFFF;
                                        class163.field2305[var25 + 1][var26] = 8;
                                        class163.field2300[var25 + 1][var26] = var30;
                                    }
                                    if (var26 > 0 && class163.field2305[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x124010E) == 0 && (var24[var27 + 1][var28 - 1] & 0x1240183) == 0) {
                                        class163.field2302[var79] = var16;
                                        class163.field2304[var79] = var17 - 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class163.field2305[var25][var26 - 1] = 1;
                                        class163.field2300[var25][var26 - 1] = var30;
                                    }
                                    if (var26 < 126 && class163.field2305[var25][var26 + 1] == 0 && (var24[var27][var28 + 2] & 0x1240138) == 0 && (var24[var27 + 1][var28 + 2] & 0x12401E0) == 0) {
                                        class163.field2302[var79] = var16;
                                        class163.field2304[var79] = var17 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class163.field2305[var25][var26 + 1] = 4;
                                        class163.field2300[var25][var26 + 1] = var30;
                                    }
                                    if (var25 > 0 && var26 > 0 && class163.field2305[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28] & 0x124013E) == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0 && (var24[var27][var28 - 1] & 0x124018F) == 0) {
                                        class163.field2302[var79] = var16 - 1;
                                        class163.field2304[var79] = var17 - 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class163.field2305[var25 - 1][var26 - 1] = 3;
                                        class163.field2300[var25 - 1][var26 - 1] = var30;
                                    }
                                    if (var25 < 126 && var26 > 0 && class163.field2305[var25 + 1][var26 - 1] == 0 && (var24[var27 + 1][var28 - 1] & 0x124018F) == 0 && (var24[var27 + 2][var28 - 1] & 0x1240183) == 0 && (var24[var27 + 2][var28] & 0x12401E3) == 0) {
                                        class163.field2302[var79] = var16 + 1;
                                        class163.field2304[var79] = var17 - 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class163.field2305[var25 + 1][var26 - 1] = 9;
                                        class163.field2300[var25 + 1][var26 - 1] = var30;
                                    }
                                    if (var25 > 0 && var26 < 126 && class163.field2305[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var28 + 1] & 0x124013E) == 0 && (var24[var27 - 1][var28 + 2] & 0x1240138) == 0 && (var24[var27][var28 + 2] & 0x12401F8) == 0) {
                                        class163.field2302[var79] = var16 - 1;
                                        class163.field2304[var79] = var17 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class163.field2305[var25 - 1][var26 + 1] = 6;
                                        class163.field2300[var25 - 1][var26 + 1] = var30;
                                    }
                                    if (var25 < 126 && var26 < 126 && class163.field2305[var25 + 1][var26 + 1] == 0 && (var24[var27 + 1][var28 + 2] & 0x12401F8) == 0 && (var24[var27 + 2][var28 + 2] & 0x12401E0) == 0 && (var24[var27 + 2][var28 + 1] & 0x12401E3) == 0) {
                                        class163.field2302[var79] = var16 + 1;
                                        class163.field2304[var79] = var17 + 1;
                                        var79 = var79 + 1 & 0xFFF;
                                        class163.field2305[var25 + 1][var26 + 1] = 12;
                                        class163.field2300[var25 + 1][var26 + 1] = var30;
                                    }
                                }
                                var15 = var29;
                            } else {
                                int var31 = var5;
                                int var32 = var6;
                                byte var33 = 64;
                                byte var34 = 64;
                                int var35 = var5 - var33;
                                int var36 = var6 - var34;
                                class163.field2305[var33][var34] = 99;
                                class163.field2300[var33][var34] = 0;
                                byte var37 = 0;
                                int var38 = 0;
                                class163.field2302[var37] = var5;
                                int var80 = var37 + 1;
                                class163.field2304[var37] = var6;
                                int[][] var39 = var10.field2295;
                                boolean var44;
                                label584: while (true) {
                                    label582: while (true) {
                                        int var40;
                                        int var41;
                                        int var42;
                                        int var43;
                                        int var45;
                                        do {
                                            do {
                                                do {
                                                    label559: do {
                                                        if (var80 == var38) {
                                                            Statics.field2303 = var31;
                                                            Statics.field2135 = var32;
                                                            var44 = false;
                                                            break label584;
                                                        }
                                                        var31 = class163.field2302[var38];
                                                        var32 = class163.field2304[var38];
                                                        var38 = var38 + 1 & 0xFFF;
                                                        var40 = var31 - var35;
                                                        var41 = var32 - var36;
                                                        var42 = var31 - var10.field2281;
                                                        var43 = var32 - var10.field2292;
                                                        if (var9.method991(var8, var31, var32, var10)) {
                                                            Statics.field2303 = var31;
                                                            Statics.field2135 = var32;
                                                            var44 = true;
                                                            break label584;
                                                        }
                                                        var45 = class163.field2300[var40][var41] + 1;
                                                        if (var40 > 0 && class163.field2305[var40 - 1][var41] == 0 && (var39[var42 - 1][var43] & 0x124010E) == 0 && (var39[var42 - 1][var8 + var43 - 1] & 0x1240138) == 0) {
                                                            int var46 = 1;
                                                            while (true) {
                                                                if (var46 >= var8 - 1) {
                                                                    class163.field2302[var80] = var31 - 1;
                                                                    class163.field2304[var80] = var32;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class163.field2305[var40 - 1][var41] = 2;
                                                                    class163.field2300[var40 - 1][var41] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var42 - 1][var43 + var46] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var46++;
                                                            }
                                                        }
                                                        if (var40 < 128 - var8 && class163.field2305[var40 + 1][var41] == 0 && (var39[var8 + var42][var43] & 0x1240183) == 0 && (var39[var8 + var42][var8 + var43 - 1] & 0x12401E0) == 0) {
                                                            int var47 = 1;
                                                            while (true) {
                                                                if (var47 >= var8 - 1) {
                                                                    class163.field2302[var80] = var31 + 1;
                                                                    class163.field2304[var80] = var32;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class163.field2305[var40 + 1][var41] = 8;
                                                                    class163.field2300[var40 + 1][var41] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var8 + var42][var43 + var47] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var47++;
                                                            }
                                                        }
                                                        if (var41 > 0 && class163.field2305[var40][var41 - 1] == 0 && (var39[var42][var43 - 1] & 0x124010E) == 0 && (var39[var8 + var42 - 1][var43 - 1] & 0x1240183) == 0) {
                                                            int var48 = 1;
                                                            while (true) {
                                                                if (var48 >= var8 - 1) {
                                                                    class163.field2302[var80] = var31;
                                                                    class163.field2304[var80] = var32 - 1;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class163.field2305[var40][var41 - 1] = 1;
                                                                    class163.field2300[var40][var41 - 1] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var42 + var48][var43 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var48++;
                                                            }
                                                        }
                                                        if (var41 < 128 - var8 && class163.field2305[var40][var41 + 1] == 0 && (var39[var42][var8 + var43] & 0x1240138) == 0 && (var39[var8 + var42 - 1][var8 + var43] & 0x12401E0) == 0) {
                                                            int var49 = 1;
                                                            while (true) {
                                                                if (var49 >= var8 - 1) {
                                                                    class163.field2302[var80] = var31;
                                                                    class163.field2304[var80] = var32 + 1;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class163.field2305[var40][var41 + 1] = 4;
                                                                    class163.field2300[var40][var41 + 1] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var42 + var49][var8 + var43] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var49++;
                                                            }
                                                        }
                                                        if (var40 > 0 && var41 > 0 && class163.field2305[var40 - 1][var41 - 1] == 0 && (var39[var42 - 1][var43 - 1] & 0x124010E) == 0) {
                                                            int var50 = 1;
                                                            while (true) {
                                                                if (var50 >= var8) {
                                                                    class163.field2302[var80] = var31 - 1;
                                                                    class163.field2304[var80] = var32 - 1;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class163.field2305[var40 - 1][var41 - 1] = 3;
                                                                    class163.field2300[var40 - 1][var41 - 1] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var42 - 1][var43 - 1 + var50] & 0x124013E) != 0 || (var39[var42 - 1 + var50][var43 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var50++;
                                                            }
                                                        }
                                                        if (var40 < 128 - var8 && var41 > 0 && class163.field2305[var40 + 1][var41 - 1] == 0 && (var39[var8 + var42][var43 - 1] & 0x1240183) == 0) {
                                                            int var51 = 1;
                                                            while (true) {
                                                                if (var51 >= var8) {
                                                                    class163.field2302[var80] = var31 + 1;
                                                                    class163.field2304[var80] = var32 - 1;
                                                                    var80 = var80 + 1 & 0xFFF;
                                                                    class163.field2305[var40 + 1][var41 - 1] = 9;
                                                                    class163.field2300[var40 + 1][var41 - 1] = var45;
                                                                    break;
                                                                }
                                                                if ((var39[var8 + var42][var43 - 1 + var51] & 0x12401E3) != 0 || (var39[var42 + var51][var43 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var51++;
                                                            }
                                                        }
                                                        if (var40 > 0 && var41 < 128 - var8 && class163.field2305[var40 - 1][var41 + 1] == 0 && (var39[var42 - 1][var8 + var43] & 0x1240138) == 0) {
                                                            for (int var52 = 1; var52 < var8; var52++) {
                                                                if ((var39[var42 - 1][var43 + var52] & 0x124013E) != 0 || (var39[var42 - 1 + var52][var8 + var43] & 0x12401F8) != 0) {
                                                                    continue label559;
                                                                }
                                                            }
                                                            class163.field2302[var80] = var31 - 1;
                                                            class163.field2304[var80] = var32 + 1;
                                                            var80 = var80 + 1 & 0xFFF;
                                                            class163.field2305[var40 - 1][var41 + 1] = 6;
                                                            class163.field2300[var40 - 1][var41 + 1] = var45;
                                                        }
                                                    } while (var40 >= 128 - var8);
                                                } while (var41 >= 128 - var8);
                                            } while (class163.field2305[var40 + 1][var41 + 1] != 0);
                                        } while ((var39[var8 + var42][var8 + var43] & 0x12401E0) != 0);
                                        for (int var53 = 1; var53 < var8; var53++) {
                                            if ((var39[var42 + var53][var8 + var43] & 0x12401F8) != 0 || (var39[var8 + var42][var43 + var53] & 0x12401E3) != 0) {
                                                continue label582;
                                            }
                                        }
                                        class163.field2302[var80] = var31 + 1;
                                        class163.field2304[var80] = var32 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class163.field2305[var40 + 1][var41 + 1] = 12;
                                        class163.field2300[var40 + 1][var41 + 1] = var45;
                                    }
                                }
                                var15 = var44;
                            }
                            int var72;
                            label647: {
                                int var54 = var5 - 64;
                                int var55 = var6 - 64;
                                int var56 = Statics.field2303;
                                int var57 = Statics.field2135;
                                if (!var15) {
                                    int var58 = Integer.MAX_VALUE;
                                    int var59 = Integer.MAX_VALUE;
                                    byte var60 = 10;
                                    int var61 = var9.field2309;
                                    int var62 = var9.field2312;
                                    int var63 = var9.field2308;
                                    int var64 = var9.field2307;
                                    for (int var65 = var61 - var60; var65 <= var60 + var61; var65++) {
                                        for (int var66 = var62 - var60; var66 <= var60 + var62; var66++) {
                                            int var67 = var65 - var54;
                                            int var68 = var66 - var55;
                                            if (var67 >= 0 && var68 >= 0 && var67 < 128 && var68 < 128 && class163.field2300[var67][var68] < 100) {
                                                int var69 = 0;
                                                if (var65 < var61) {
                                                    var69 = var61 - var65;
                                                } else if (var65 > var61 + var63 - 1) {
                                                    var69 = var65 - (var61 + var63 - 1);
                                                }
                                                int var70 = 0;
                                                if (var66 < var62) {
                                                    var70 = var62 - var66;
                                                } else if (var66 > var62 + var64 - 1) {
                                                    var70 = var66 - (var62 + var64 - 1);
                                                }
                                                int var71 = var69 * var69 + var70 * var70;
                                                if (var71 < var58 || var58 == var71 && class163.field2300[var67][var68] < var59) {
                                                    var58 = var71;
                                                    var59 = class163.field2300[var67][var68];
                                                    var56 = var65;
                                                    var57 = var66;
                                                }
                                            }
                                        }
                                    }
                                    if (var58 == Integer.MAX_VALUE) {
                                        var72 = -1;
                                        break label647;
                                    }
                                }
                                if (var5 == var56 && var6 == var57) {
                                    var72 = 0;
                                } else {
                                    byte var73 = 0;
                                    class163.field2302[var73] = var56;
                                    int var81 = var73 + 1;
                                    class163.field2304[var73] = var57;
                                    int var74;
                                    int var75 = var74 = class163.field2305[var56 - var54][var57 - var55];
                                    while (var5 != var56 || var6 != var57) {
                                        if (var74 != var75) {
                                            var74 = var75;
                                            class163.field2302[var81] = var56;
                                            class163.field2304[var81++] = var57;
                                        }
                                        if ((var75 & 0x2) != 0) {
                                            var56++;
                                        } else if ((var75 & 0x8) != 0) {
                                            var56--;
                                        }
                                        if ((var75 & 0x1) != 0) {
                                            var57++;
                                        } else if ((var75 & 0x4) != 0) {
                                            var57--;
                                        }
                                        var75 = class163.field2305[var56 - var54][var57 - var55];
                                    }
                                    int var76 = 0;
                                    while (var81-- > 0) {
                                        var11[var76] = class163.field2302[var81];
                                        var12[var76++] = class163.field2304[var81];
                                        if (var76 >= var11.length) {
                                            break;
                                        }
                                    }
                                    var72 = var76;
                                }
                            }
                            int var77 = var72;
                            if (var72 < 1) {
                                break;
                            }
                            int var78 = 0;
                            while (true) {
                                if (var78 >= var77 - 1) {
                                    break label606;
                                }
                                var4.method997(client.field1186[var78], client.field1092[var78], (byte) 2);
                                var78++;
                            }
                        }
                        for (int var14 = 0; var14 < 128; var14++) {
                            class163.field2305[var13][var14] = 0;
                            class163.field2300[var13][var14] = 99999999;
                        }
                        var13++;
                    }
                }
            }
            this.method997(arg0, arg1, arg2);
        } else {
            this.method999(arg0, arg1);
        }
    }

    @ObfuscatedName("be.v(III)V")
    public void method999(int arg0, int arg1) {
        this.field1269 = 0;
        this.field1274 = 0;
        this.field1273 = 0;
        this.field1270[0] = arg0;
        this.field1255[0] = arg1;
        int var3 = this.method996();
        this.field1233 = this.field1270[0] * 128 + var3 * 64;
        this.field1265 = this.field1255[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("be.e(IIBI)V")
    public final void method997(int arg0, int arg1, byte arg2) {
        if (this.field1269 < 9) {
            this.field1269++;
        }
        for (int var4 = this.field1269; var4 > 0; var4--) {
            this.field1270[var4] = this.field1270[var4 - 1];
            this.field1255[var4] = this.field1255[var4 - 1];
            this.field1240[var4] = this.field1240[var4 - 1];
        }
        this.field1270[0] = arg0;
        this.field1255[0] = arg1;
        this.field1240[0] = arg2;
    }

    @ObfuscatedName("be.l(B)Z")
    public final boolean method1001() {
        return this.field869 != null;
    }
}

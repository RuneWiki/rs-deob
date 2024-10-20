package deob;

@ObfuscatedName("bw")
public final class class75 extends class79 {

    @ObfuscatedName("bw.n")
    public String field888;

    @ObfuscatedName("bw.p")
    public class214 field886;

    @ObfuscatedName("bw.i")
    public int field873 = -1;

    @ObfuscatedName("bw.j")
    public int field874 = -1;

    @ObfuscatedName("bw.m")
    public String[] field875 = new String[3];

    @ObfuscatedName("bw.c")
    public int field884;

    @ObfuscatedName("bw.z")
    public int field877;

    @ObfuscatedName("bw.h")
    public int field878;

    @ObfuscatedName("bw.g")
    public int field879;

    @ObfuscatedName("bw.e")
    public int field880;

    @ObfuscatedName("bw.o")
    public int field881;

    @ObfuscatedName("bw.x")
    public int field882;

    @ObfuscatedName("bw.a")
    public int field883;

    @ObfuscatedName("bw.y")
    public class134 field885;

    @ObfuscatedName("bw.r")
    public int field889;

    @ObfuscatedName("bw.b")
    public int field890;

    @ObfuscatedName("bw.s")
    public int field887;

    @ObfuscatedName("bw.v")
    public int field871;

    @ObfuscatedName("bw.t")
    public boolean field896;

    @ObfuscatedName("bw.w")
    public int field872;

    @ObfuscatedName("bw.l")
    public boolean field891;

    @ObfuscatedName("bw.q")
    public int field892;

    @ObfuscatedName("bw.k")
    public int field893;

    @ObfuscatedName("bw.d")
    public boolean field894;

    @ObfuscatedName("bw.u")
    public int field895;

    @ObfuscatedName("bw.ae")
    public int field876;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field875[var1] = "";
        }
        this.field884 = 0;
        this.field877 = 0;
        this.field879 = 0;
        this.field880 = 0;
        this.field896 = false;
        this.field872 = 0;
        this.field891 = false;
        this.field894 = false;
    }

    @ObfuscatedName("bw.n(Lfl;I)V")
    public final void method1022(class174 arg0) {
        arg0.field2400 = 0;
        int var2 = arg0.method2925();
        this.field873 = arg0.method2922();
        this.field874 = arg0.method2922();
        int var3 = -1;
        this.field872 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2925();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2925();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3065();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class257.method4344(var4[var5] - 512).field3551;
                    if (var8 != 0) {
                        this.field872 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2925();
            if (var11 < 0 || var11 >= Statics.field2622[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1232 = arg0.method3065();
        if (this.field1232 == 65535) {
            this.field1232 = -1;
        }
        this.field1233 = arg0.method3065();
        if (this.field1233 == 65535) {
            this.field1233 = -1;
        }
        this.field1249 = this.field1233;
        this.field1235 = arg0.method3065();
        if (this.field1235 == 65535) {
            this.field1235 = -1;
        }
        this.field1236 = arg0.method3065();
        if (this.field1236 == 65535) {
            this.field1236 = -1;
        }
        this.field1266 = arg0.method3065();
        if (this.field1266 == 65535) {
            this.field1266 = -1;
        }
        this.field1238 = arg0.method3065();
        if (this.field1238 == 65535) {
            this.field1238 = -1;
        }
        this.field1239 = arg0.method3065();
        if (this.field1239 == 65535) {
            this.field1239 = -1;
        }
        this.field888 = arg0.method3098();
        if (Statics.field2350 == this) {
            Statics.field2230 = this.field888;
        }
        this.field884 = arg0.method2925();
        this.field877 = arg0.method3065();
        this.field891 = arg0.method2925() == 1;
        if (client.field916 == 0 && client.field1133 >= 2) {
            this.field891 = false;
        }
        if (this.field886 == null) {
            this.field886 = new class214();
        }
        this.field886.method3711(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bw.p(I)I")
    public int method1024() {
        return this.field886 == null || this.field886.field2632 == -1 ? 1 : Statics.method3798(this.field886.field2632).field3578;
    }

    @ObfuscatedName("bw.i(S)Lek;")
    public final class134 method1012() {
        if (this.field886 == null) {
            return null;
        }
        class261 var1 = this.field1228 != -1 && this.field1278 == 0 ? class261.method2887(this.field1228) : null;
        class261 var2 = this.field1256 == -1 || this.field896 || this.field1256 == this.field1232 && var1 != null ? null : class261.method2887(this.field1256);
        class134 var3 = this.field886.method3698(var1, this.field1260, var2, this.field1240);
        if (var3 == null) {
            return null;
        }
        var3.method2324();
        this.field1277 = var3.field2130;
        if (!this.field896 && this.field1246 != -1 && this.field1265 != -1) {
            class134 var4 = class246.method1711(this.field1246).method4048(this.field1265);
            if (var4 != null) {
                var4.method2328(0, -this.field1280, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (!this.field896 && this.field885 != null) {
            if (client.field923 >= this.field880) {
                this.field885 = null;
            }
            if (client.field923 >= this.field879 && client.field923 < this.field880) {
                class134 var6 = this.field885;
                var6.method2328(this.field881 - this.field1234, this.field882 - this.field878, this.field883 - this.field1276);
                if (this.field1253 == 512) {
                    var6.method2331();
                    var6.method2331();
                    var6.method2331();
                } else if (this.field1253 == 1024) {
                    var6.method2331();
                    var6.method2331();
                } else if (this.field1253 == 1536) {
                    var6.method2331();
                }
                class134[] var7 = new class134[] { var3, var6 };
                var3 = new class134(var7, 2);
                if (this.field1253 == 512) {
                    var6.method2331();
                } else if (this.field1253 == 1024) {
                    var6.method2331();
                    var6.method2331();
                } else if (this.field1253 == 1536) {
                    var6.method2331();
                    var6.method2331();
                    var6.method2331();
                }
                var6.method2328(this.field1234 - this.field881, this.field878 - this.field882, this.field1276 - this.field883);
            }
        }
        var3.field1958 = true;
        return var3;
    }

    @ObfuscatedName("bw.j(IIBI)V")
    public final void method1009(int arg0, int arg1, byte arg2) {
        if (this.field1228 != -1 && class261.method2887(this.field1228).field3625 == 1) {
            this.field1228 = -1;
        }
        this.field1255 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1036(arg0, arg1);
        } else if (this.field1282[0] >= 0 && this.field1282[0] < 104 && this.field1283[0] >= 0 && this.field1283[0] < 104) {
            if (arg2 == 2) {
                class75 var4 = this;
                int var5 = this.field1282[0];
                int var6 = this.field1283[0];
                int var7 = this.method1024();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method1024();
                    class164 var9 = client.method2694(arg0, arg1);
                    class162 var10 = client.field975[this.field892];
                    int[] var11 = client.field1071;
                    int[] var12 = client.field1197;
                    int var13 = 0;
                    label339: while (true) {
                        if (var13 >= 128) {
                            boolean var15;
                            if (var8 == 1) {
                                var15 = class163.method93(var5, var6, var9, var10);
                            } else if (var8 == 2) {
                                int var16 = var5;
                                int var17 = var6;
                                byte var18 = 64;
                                byte var19 = 64;
                                int var20 = var5 - var18;
                                int var21 = var6 - var19;
                                class163.field2312[var18][var19] = 99;
                                class163.field2319[var18][var19] = 0;
                                byte var22 = 0;
                                int var23 = 0;
                                class163.field2315[var22] = var5;
                                int var56 = var22 + 1;
                                class163.field2313[var22] = var6;
                                int[][] var24 = var10.field2308;
                                boolean var29;
                                while (true) {
                                    if (var56 == var23) {
                                        Statics.field2311 = var16;
                                        Statics.field18 = var17;
                                        var29 = false;
                                        break;
                                    }
                                    var16 = class163.field2315[var23];
                                    var17 = class163.field2313[var23];
                                    var23 = var23 + 1 & 0xFFF;
                                    int var25 = var16 - var20;
                                    int var26 = var17 - var21;
                                    int var27 = var16 - var10.field2301;
                                    int var28 = var17 - var10.field2305;
                                    if (var9.method1003(2, var16, var17, var10)) {
                                        Statics.field2311 = var16;
                                        Statics.field18 = var17;
                                        var29 = true;
                                        break;
                                    }
                                    int var30 = class163.field2319[var25][var26] + 1;
                                    if (var25 > 0 && class163.field2312[var25 - 1][var26] == 0 && (var24[var27 - 1][var28] & 0x124010E) == 0 && (var24[var27 - 1][var28 + 1] & 0x1240138) == 0) {
                                        class163.field2315[var56] = var16 - 1;
                                        class163.field2313[var56] = var17;
                                        var56 = var56 + 1 & 0xFFF;
                                        class163.field2312[var25 - 1][var26] = 2;
                                        class163.field2319[var25 - 1][var26] = var30;
                                    }
                                    if (var25 < 126 && class163.field2312[var25 + 1][var26] == 0 && (var24[var27 + 2][var28] & 0x1240183) == 0 && (var24[var27 + 2][var28 + 1] & 0x12401E0) == 0) {
                                        class163.field2315[var56] = var16 + 1;
                                        class163.field2313[var56] = var17;
                                        var56 = var56 + 1 & 0xFFF;
                                        class163.field2312[var25 + 1][var26] = 8;
                                        class163.field2319[var25 + 1][var26] = var30;
                                    }
                                    if (var26 > 0 && class163.field2312[var25][var26 - 1] == 0 && (var24[var27][var28 - 1] & 0x124010E) == 0 && (var24[var27 + 1][var28 - 1] & 0x1240183) == 0) {
                                        class163.field2315[var56] = var16;
                                        class163.field2313[var56] = var17 - 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class163.field2312[var25][var26 - 1] = 1;
                                        class163.field2319[var25][var26 - 1] = var30;
                                    }
                                    if (var26 < 126 && class163.field2312[var25][var26 + 1] == 0 && (var24[var27][var28 + 2] & 0x1240138) == 0 && (var24[var27 + 1][var28 + 2] & 0x12401E0) == 0) {
                                        class163.field2315[var56] = var16;
                                        class163.field2313[var56] = var17 + 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class163.field2312[var25][var26 + 1] = 4;
                                        class163.field2319[var25][var26 + 1] = var30;
                                    }
                                    if (var25 > 0 && var26 > 0 && class163.field2312[var25 - 1][var26 - 1] == 0 && (var24[var27 - 1][var28] & 0x124013E) == 0 && (var24[var27 - 1][var28 - 1] & 0x124010E) == 0 && (var24[var27][var28 - 1] & 0x124018F) == 0) {
                                        class163.field2315[var56] = var16 - 1;
                                        class163.field2313[var56] = var17 - 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class163.field2312[var25 - 1][var26 - 1] = 3;
                                        class163.field2319[var25 - 1][var26 - 1] = var30;
                                    }
                                    if (var25 < 126 && var26 > 0 && class163.field2312[var25 + 1][var26 - 1] == 0 && (var24[var27 + 1][var28 - 1] & 0x124018F) == 0 && (var24[var27 + 2][var28 - 1] & 0x1240183) == 0 && (var24[var27 + 2][var28] & 0x12401E3) == 0) {
                                        class163.field2315[var56] = var16 + 1;
                                        class163.field2313[var56] = var17 - 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class163.field2312[var25 + 1][var26 - 1] = 9;
                                        class163.field2319[var25 + 1][var26 - 1] = var30;
                                    }
                                    if (var25 > 0 && var26 < 126 && class163.field2312[var25 - 1][var26 + 1] == 0 && (var24[var27 - 1][var28 + 1] & 0x124013E) == 0 && (var24[var27 - 1][var28 + 2] & 0x1240138) == 0 && (var24[var27][var28 + 2] & 0x12401F8) == 0) {
                                        class163.field2315[var56] = var16 - 1;
                                        class163.field2313[var56] = var17 + 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class163.field2312[var25 - 1][var26 + 1] = 6;
                                        class163.field2319[var25 - 1][var26 + 1] = var30;
                                    }
                                    if (var25 < 126 && var26 < 126 && class163.field2312[var25 + 1][var26 + 1] == 0 && (var24[var27 + 1][var28 + 2] & 0x12401F8) == 0 && (var24[var27 + 2][var28 + 2] & 0x12401E0) == 0 && (var24[var27 + 2][var28 + 1] & 0x12401E3) == 0) {
                                        class163.field2315[var56] = var16 + 1;
                                        class163.field2313[var56] = var17 + 1;
                                        var56 = var56 + 1 & 0xFFF;
                                        class163.field2312[var25 + 1][var26 + 1] = 12;
                                        class163.field2319[var25 + 1][var26 + 1] = var30;
                                    }
                                }
                                var15 = var29;
                            } else {
                                var15 = class163.method3728(var5, var6, var8, var9, var10);
                            }
                            int var49;
                            label362: {
                                int var31 = var5 - 64;
                                int var32 = var6 - 64;
                                int var33 = Statics.field2311;
                                int var34 = Statics.field18;
                                if (!var15) {
                                    int var35 = Integer.MAX_VALUE;
                                    int var36 = Integer.MAX_VALUE;
                                    byte var37 = 10;
                                    int var38 = var9.field2320;
                                    int var39 = var9.field2321;
                                    int var40 = var9.field2322;
                                    int var41 = var9.field2325;
                                    for (int var42 = var38 - var37; var42 <= var37 + var38; var42++) {
                                        for (int var43 = var39 - var37; var43 <= var37 + var39; var43++) {
                                            int var44 = var42 - var31;
                                            int var45 = var43 - var32;
                                            if (var44 >= 0 && var45 >= 0 && var44 < 128 && var45 < 128 && class163.field2319[var44][var45] < 100) {
                                                int var46 = 0;
                                                if (var42 < var38) {
                                                    var46 = var38 - var42;
                                                } else if (var42 > var38 + var40 - 1) {
                                                    var46 = var42 - (var38 + var40 - 1);
                                                }
                                                int var47 = 0;
                                                if (var43 < var39) {
                                                    var47 = var39 - var43;
                                                } else if (var43 > var39 + var41 - 1) {
                                                    var47 = var43 - (var39 + var41 - 1);
                                                }
                                                int var48 = var46 * var46 + var47 * var47;
                                                if (var48 < var35 || var35 == var48 && class163.field2319[var44][var45] < var36) {
                                                    var35 = var48;
                                                    var36 = class163.field2319[var44][var45];
                                                    var33 = var42;
                                                    var34 = var43;
                                                }
                                            }
                                        }
                                    }
                                    if (var35 == Integer.MAX_VALUE) {
                                        var49 = -1;
                                        break label362;
                                    }
                                }
                                if (var5 == var33 && var6 == var34) {
                                    var49 = 0;
                                } else {
                                    byte var50 = 0;
                                    class163.field2315[var50] = var33;
                                    int var57 = var50 + 1;
                                    class163.field2313[var50] = var34;
                                    int var51;
                                    int var52 = var51 = class163.field2312[var33 - var31][var34 - var32];
                                    while (var5 != var33 || var6 != var34) {
                                        if (var51 != var52) {
                                            var51 = var52;
                                            class163.field2315[var57] = var33;
                                            class163.field2313[var57++] = var34;
                                        }
                                        if ((var52 & 0x2) != 0) {
                                            var33++;
                                        } else if ((var52 & 0x8) != 0) {
                                            var33--;
                                        }
                                        if ((var52 & 0x1) != 0) {
                                            var34++;
                                        } else if ((var52 & 0x4) != 0) {
                                            var34--;
                                        }
                                        var52 = class163.field2312[var33 - var31][var34 - var32];
                                    }
                                    int var53 = 0;
                                    while (var57-- > 0) {
                                        var11[var53] = class163.field2315[var57];
                                        var12[var53++] = class163.field2313[var57];
                                        if (var53 >= var11.length) {
                                            break;
                                        }
                                    }
                                    var49 = var53;
                                }
                            }
                            int var54 = var49;
                            if (var49 < 1) {
                                break;
                            }
                            int var55 = 0;
                            while (true) {
                                if (var55 >= var54 - 1) {
                                    break label339;
                                }
                                var4.method1016(client.field1071[var55], client.field1197[var55], (byte) 2);
                                var55++;
                            }
                        }
                        for (int var14 = 0; var14 < 128; var14++) {
                            class163.field2312[var13][var14] = 0;
                            class163.field2319[var13][var14] = 99999999;
                        }
                        var13++;
                    }
                }
            }
            this.method1016(arg0, arg1, arg2);
        } else {
            this.method1036(arg0, arg1);
        }
    }

    @ObfuscatedName("bw.f(III)V")
    public void method1036(int arg0, int arg1) {
        this.field1281 = 0;
        this.field1286 = 0;
        this.field1259 = 0;
        this.field1282[0] = arg0;
        this.field1283[0] = arg1;
        int var3 = this.method1024();
        this.field1234 = this.field1282[0] * 128 + var3 * 64;
        this.field1276 = this.field1283[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bw.m(IIBI)V")
    public final void method1016(int arg0, int arg1, byte arg2) {
        if (this.field1281 < 9) {
            this.field1281++;
        }
        for (int var4 = this.field1281; var4 > 0; var4--) {
            this.field1282[var4] = this.field1282[var4 - 1];
            this.field1283[var4] = this.field1283[var4 - 1];
            this.field1284[var4] = this.field1284[var4 - 1];
        }
        this.field1282[0] = arg0;
        this.field1283[0] = arg1;
        this.field1284[0] = arg2;
    }

    @ObfuscatedName("bw.c(B)Z")
    public final boolean method1015() {
        return this.field886 != null;
    }
}

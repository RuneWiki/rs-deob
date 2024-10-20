package deob;

@ObfuscatedName("bk")
public final class class76 extends class79 {

    @ObfuscatedName("bk.e")
    public String field896;

    @ObfuscatedName("bk.n")
    public class215 field881;

    @ObfuscatedName("bk.g")
    public int field894 = -1;

    @ObfuscatedName("bk.y")
    public int field883 = -1;

    @ObfuscatedName("bk.k")
    public String[] field898 = new String[3];

    @ObfuscatedName("bk.v")
    public int field885;

    @ObfuscatedName("bk.z")
    public int field886;

    @ObfuscatedName("bk.r")
    public int field887;

    @ObfuscatedName("bk.u")
    public int field884;

    @ObfuscatedName("bk.d")
    public int field882;

    @ObfuscatedName("bk.o")
    public int field890;

    @ObfuscatedName("bk.l")
    public int field891;

    @ObfuscatedName("bk.h")
    public int field892;

    @ObfuscatedName("bk.s")
    public class135 field893;

    @ObfuscatedName("bk.c")
    public int field904;

    @ObfuscatedName("bk.m")
    public int field895;

    @ObfuscatedName("bk.a")
    public int field880;

    @ObfuscatedName("bk.t")
    public int field888;

    @ObfuscatedName("bk.p")
    public boolean field899;

    @ObfuscatedName("bk.f")
    public int field905;

    @ObfuscatedName("bk.b")
    public boolean field900;

    @ObfuscatedName("bk.x")
    public int field901;

    @ObfuscatedName("bk.i")
    public int field902;

    @ObfuscatedName("bk.j")
    public boolean field903;

    @ObfuscatedName("bk.q")
    public int field897;

    @ObfuscatedName("bk.ag")
    public int field889;

    public class76() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field898[var1] = "";
        }
        this.field885 = 0;
        this.field886 = 0;
        this.field884 = 0;
        this.field882 = 0;
        this.field899 = false;
        this.field905 = 0;
        this.field900 = false;
        this.field903 = false;
    }

    @ObfuscatedName("bk.e(Lfh;I)V")
    public final void method1051(class175 arg0) {
        arg0.field2381 = 0;
        int var2 = arg0.method2928();
        this.field894 = arg0.method2998();
        this.field883 = arg0.method2998();
        int var3 = -1;
        this.field905 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2928();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2928();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method3091();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class258.method4627(var4[var5] - 512).field3525;
                    if (var8 != 0) {
                        this.field905 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2928();
            if (var11 < 0 || var11 >= Statics.field2595[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1211 = arg0.method3091();
        if (this.field1211 == 65535) {
            this.field1211 = -1;
        }
        this.field1228 = arg0.method3091();
        if (this.field1228 == 65535) {
            this.field1228 = -1;
        }
        this.field1213 = this.field1228;
        this.field1242 = arg0.method3091();
        if (this.field1242 == 65535) {
            this.field1242 = -1;
        }
        this.field1215 = arg0.method3091();
        if (this.field1215 == 65535) {
            this.field1215 = -1;
        }
        this.field1250 = arg0.method3091();
        if (this.field1250 == 65535) {
            this.field1250 = -1;
        }
        this.field1212 = arg0.method3091();
        if (this.field1212 == 65535) {
            this.field1212 = -1;
        }
        this.field1257 = arg0.method3091();
        if (this.field1257 == 65535) {
            this.field1257 = -1;
        }
        this.field896 = arg0.method3113();
        if (Statics.field655 == this) {
            Statics.field2201 = this.field896;
        }
        this.field885 = arg0.method2928();
        this.field886 = arg0.method3091();
        this.field900 = arg0.method2928() == 1;
        if (client.field919 == 0 && client.field1070 >= 2) {
            this.field900 = false;
        }
        if (this.field881 == null) {
            this.field881 = new class215();
        }
        this.field881.method3669(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bk.n(B)I")
    public int method1052() {
        return this.field881 == null || this.field881.field2594 == -1 ? 1 : class260.method137(this.field881.field2594).field3548;
    }

    @ObfuscatedName("bk.g(I)Lew;")
    public final class135 method1081() {
        if (this.field881 == null) {
            return null;
        }
        class262 var1 = this.field1238 != -1 && this.field1241 == 0 ? class262.method1025(this.field1238) : null;
        class262 var2 = this.field1235 == -1 || this.field899 || this.field1235 == this.field1211 && var1 != null ? null : class262.method1025(this.field1235);
        class135 var3 = this.field881.method3694(var1, this.field1218, var2, this.field1236);
        if (var3 == null) {
            return null;
        }
        var3.method2320();
        this.field1256 = var3.field2113;
        if (!this.field899 && this.field1234 != -1 && this.field1210 != -1) {
            class135 var4 = class247.method891(this.field1234).method4024(this.field1210);
            if (var4 != null) {
                var4.method2327(0, -this.field1266, 0);
                class135[] var5 = new class135[] { var3, var4 };
                var3 = new class135(var5, 2);
            }
        }
        if (!this.field899 && this.field893 != null) {
            if (client.field925 >= this.field882) {
                this.field893 = null;
            }
            if (client.field925 >= this.field884 && client.field925 < this.field882) {
                class135 var6 = this.field893;
                var6.method2327(this.field890 - this.field1221, this.field891 - this.field887, this.field892 - this.field1207);
                if (this.field1217 == 512) {
                    var6.method2357();
                    var6.method2357();
                    var6.method2357();
                } else if (this.field1217 == 1024) {
                    var6.method2357();
                    var6.method2357();
                } else if (this.field1217 == 1536) {
                    var6.method2357();
                }
                class135[] var7 = new class135[] { var3, var6 };
                var3 = new class135(var7, 2);
                if (this.field1217 == 512) {
                    var6.method2357();
                } else if (this.field1217 == 1024) {
                    var6.method2357();
                    var6.method2357();
                } else if (this.field1217 == 1536) {
                    var6.method2357();
                    var6.method2357();
                    var6.method2357();
                }
                var6.method2327(this.field1221 - this.field890, this.field887 - this.field891, this.field1207 - this.field892);
            }
        }
        var3.field1939 = true;
        return var3;
    }

    @ObfuscatedName("bk.y(IIBI)V")
    public final void method1054(int arg0, int arg1, byte arg2) {
        if (this.field1238 != -1 && class262.method1025(this.field1238).field3609 == 1) {
            this.field1238 = -1;
        }
        this.field1206 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1075(arg0, arg1);
        } else if (this.field1261[0] >= 0 && this.field1261[0] < 104 && this.field1262[0] >= 0 && this.field1262[0] < 104) {
            if (arg2 == 2) {
                class76 var4 = this;
                int var5 = this.field1261[0];
                int var6 = this.field1262[0];
                int var7 = this.method1052();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method1052();
                    client.field1008.field2295 = arg0;
                    client.field1008.field2294 = arg1;
                    client.field1008.field2293 = 1;
                    client.field1008.field2296 = 1;
                    class75 var9 = client.field1008;
                    class75 var10 = var9;
                    class163 var11 = client.field975[this.field901];
                    int[] var12 = client.field1181;
                    int[] var13 = client.field1140;
                    int var14 = 0;
                    label606: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var8 == 1) {
                                var16 = Statics.method890(var5, var6, var9, var11);
                            } else if (var8 == 2) {
                                int var17 = var5;
                                int var18 = var6;
                                byte var19 = 64;
                                byte var20 = 64;
                                int var21 = var5 - var19;
                                int var22 = var6 - var20;
                                class164.field2286[var19][var20] = 99;
                                class164.field2290[var19][var20] = 0;
                                byte var23 = 0;
                                int var24 = 0;
                                class164.field2284[var23] = var5;
                                int var80 = var23 + 1;
                                class164.field2285[var23] = var6;
                                int[][] var25 = var11.field2280;
                                boolean var30;
                                while (true) {
                                    if (var80 == var24) {
                                        Statics.field2288 = var17;
                                        Statics.field859 = var18;
                                        var30 = false;
                                        break;
                                    }
                                    var17 = class164.field2284[var24];
                                    var18 = class164.field2285[var24];
                                    var24 = var24 + 1 & 0xFFF;
                                    int var26 = var17 - var21;
                                    int var27 = var18 - var22;
                                    int var28 = var17 - var11.field2275;
                                    int var29 = var18 - var11.field2269;
                                    if (var10.method1043(2, var17, var18, var11)) {
                                        Statics.field2288 = var17;
                                        Statics.field859 = var18;
                                        var30 = true;
                                        break;
                                    }
                                    int var31 = class164.field2290[var26][var27] + 1;
                                    if (var26 > 0 && class164.field2286[var26 - 1][var27] == 0 && (var25[var28 - 1][var29] & 0x124010E) == 0 && (var25[var28 - 1][var29 + 1] & 0x1240138) == 0) {
                                        class164.field2284[var80] = var17 - 1;
                                        class164.field2285[var80] = var18;
                                        var80 = var80 + 1 & 0xFFF;
                                        class164.field2286[var26 - 1][var27] = 2;
                                        class164.field2290[var26 - 1][var27] = var31;
                                    }
                                    if (var26 < 126 && class164.field2286[var26 + 1][var27] == 0 && (var25[var28 + 2][var29] & 0x1240183) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E0) == 0) {
                                        class164.field2284[var80] = var17 + 1;
                                        class164.field2285[var80] = var18;
                                        var80 = var80 + 1 & 0xFFF;
                                        class164.field2286[var26 + 1][var27] = 8;
                                        class164.field2290[var26 + 1][var27] = var31;
                                    }
                                    if (var27 > 0 && class164.field2286[var26][var27 - 1] == 0 && (var25[var28][var29 - 1] & 0x124010E) == 0 && (var25[var28 + 1][var29 - 1] & 0x1240183) == 0) {
                                        class164.field2284[var80] = var17;
                                        class164.field2285[var80] = var18 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class164.field2286[var26][var27 - 1] = 1;
                                        class164.field2290[var26][var27 - 1] = var31;
                                    }
                                    if (var27 < 126 && class164.field2286[var26][var27 + 1] == 0 && (var25[var28][var29 + 2] & 0x1240138) == 0 && (var25[var28 + 1][var29 + 2] & 0x12401E0) == 0) {
                                        class164.field2284[var80] = var17;
                                        class164.field2285[var80] = var18 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class164.field2286[var26][var27 + 1] = 4;
                                        class164.field2290[var26][var27 + 1] = var31;
                                    }
                                    if (var26 > 0 && var27 > 0 && class164.field2286[var26 - 1][var27 - 1] == 0 && (var25[var28 - 1][var29] & 0x124013E) == 0 && (var25[var28 - 1][var29 - 1] & 0x124010E) == 0 && (var25[var28][var29 - 1] & 0x124018F) == 0) {
                                        class164.field2284[var80] = var17 - 1;
                                        class164.field2285[var80] = var18 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class164.field2286[var26 - 1][var27 - 1] = 3;
                                        class164.field2290[var26 - 1][var27 - 1] = var31;
                                    }
                                    if (var26 < 126 && var27 > 0 && class164.field2286[var26 + 1][var27 - 1] == 0 && (var25[var28 + 1][var29 - 1] & 0x124018F) == 0 && (var25[var28 + 2][var29 - 1] & 0x1240183) == 0 && (var25[var28 + 2][var29] & 0x12401E3) == 0) {
                                        class164.field2284[var80] = var17 + 1;
                                        class164.field2285[var80] = var18 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class164.field2286[var26 + 1][var27 - 1] = 9;
                                        class164.field2290[var26 + 1][var27 - 1] = var31;
                                    }
                                    if (var26 > 0 && var27 < 126 && class164.field2286[var26 - 1][var27 + 1] == 0 && (var25[var28 - 1][var29 + 1] & 0x124013E) == 0 && (var25[var28 - 1][var29 + 2] & 0x1240138) == 0 && (var25[var28][var29 + 2] & 0x12401F8) == 0) {
                                        class164.field2284[var80] = var17 - 1;
                                        class164.field2285[var80] = var18 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class164.field2286[var26 - 1][var27 + 1] = 6;
                                        class164.field2290[var26 - 1][var27 + 1] = var31;
                                    }
                                    if (var26 < 126 && var27 < 126 && class164.field2286[var26 + 1][var27 + 1] == 0 && (var25[var28 + 1][var29 + 2] & 0x12401F8) == 0 && (var25[var28 + 2][var29 + 2] & 0x12401E0) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E3) == 0) {
                                        class164.field2284[var80] = var17 + 1;
                                        class164.field2285[var80] = var18 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class164.field2286[var26 + 1][var27 + 1] = 12;
                                        class164.field2290[var26 + 1][var27 + 1] = var31;
                                    }
                                }
                                var16 = var30;
                            } else {
                                int var32 = var5;
                                int var33 = var6;
                                byte var34 = 64;
                                byte var35 = 64;
                                int var36 = var5 - var34;
                                int var37 = var6 - var35;
                                class164.field2286[var34][var35] = 99;
                                class164.field2290[var34][var35] = 0;
                                byte var38 = 0;
                                int var39 = 0;
                                class164.field2284[var38] = var5;
                                int var81 = var38 + 1;
                                class164.field2285[var38] = var6;
                                int[][] var40 = var11.field2280;
                                boolean var45;
                                label584: while (true) {
                                    label582: while (true) {
                                        int var41;
                                        int var42;
                                        int var43;
                                        int var44;
                                        int var46;
                                        do {
                                            do {
                                                do {
                                                    label559: do {
                                                        if (var81 == var39) {
                                                            Statics.field2288 = var32;
                                                            Statics.field859 = var33;
                                                            var45 = false;
                                                            break label584;
                                                        }
                                                        var32 = class164.field2284[var39];
                                                        var33 = class164.field2285[var39];
                                                        var39 = var39 + 1 & 0xFFF;
                                                        var41 = var32 - var36;
                                                        var42 = var33 - var37;
                                                        var43 = var32 - var11.field2275;
                                                        var44 = var33 - var11.field2269;
                                                        if (var10.method1043(var8, var32, var33, var11)) {
                                                            Statics.field2288 = var32;
                                                            Statics.field859 = var33;
                                                            var45 = true;
                                                            break label584;
                                                        }
                                                        var46 = class164.field2290[var41][var42] + 1;
                                                        if (var41 > 0 && class164.field2286[var41 - 1][var42] == 0 && (var40[var43 - 1][var44] & 0x124010E) == 0 && (var40[var43 - 1][var8 + var44 - 1] & 0x1240138) == 0) {
                                                            int var47 = 1;
                                                            while (true) {
                                                                if (var47 >= var8 - 1) {
                                                                    class164.field2284[var81] = var32 - 1;
                                                                    class164.field2285[var81] = var33;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class164.field2286[var41 - 1][var42] = 2;
                                                                    class164.field2290[var41 - 1][var42] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 - 1][var44 + var47] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var47++;
                                                            }
                                                        }
                                                        if (var41 < 128 - var8 && class164.field2286[var41 + 1][var42] == 0 && (var40[var8 + var43][var44] & 0x1240183) == 0 && (var40[var8 + var43][var8 + var44 - 1] & 0x12401E0) == 0) {
                                                            int var48 = 1;
                                                            while (true) {
                                                                if (var48 >= var8 - 1) {
                                                                    class164.field2284[var81] = var32 + 1;
                                                                    class164.field2285[var81] = var33;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class164.field2286[var41 + 1][var42] = 8;
                                                                    class164.field2290[var41 + 1][var42] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var8 + var43][var44 + var48] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var48++;
                                                            }
                                                        }
                                                        if (var42 > 0 && class164.field2286[var41][var42 - 1] == 0 && (var40[var43][var44 - 1] & 0x124010E) == 0 && (var40[var8 + var43 - 1][var44 - 1] & 0x1240183) == 0) {
                                                            int var49 = 1;
                                                            while (true) {
                                                                if (var49 >= var8 - 1) {
                                                                    class164.field2284[var81] = var32;
                                                                    class164.field2285[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class164.field2286[var41][var42 - 1] = 1;
                                                                    class164.field2290[var41][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 + var49][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var49++;
                                                            }
                                                        }
                                                        if (var42 < 128 - var8 && class164.field2286[var41][var42 + 1] == 0 && (var40[var43][var8 + var44] & 0x1240138) == 0 && (var40[var8 + var43 - 1][var8 + var44] & 0x12401E0) == 0) {
                                                            int var50 = 1;
                                                            while (true) {
                                                                if (var50 >= var8 - 1) {
                                                                    class164.field2284[var81] = var32;
                                                                    class164.field2285[var81] = var33 + 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class164.field2286[var41][var42 + 1] = 4;
                                                                    class164.field2290[var41][var42 + 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 + var50][var8 + var44] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var50++;
                                                            }
                                                        }
                                                        if (var41 > 0 && var42 > 0 && class164.field2286[var41 - 1][var42 - 1] == 0 && (var40[var43 - 1][var44 - 1] & 0x124010E) == 0) {
                                                            int var51 = 1;
                                                            while (true) {
                                                                if (var51 >= var8) {
                                                                    class164.field2284[var81] = var32 - 1;
                                                                    class164.field2285[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class164.field2286[var41 - 1][var42 - 1] = 3;
                                                                    class164.field2290[var41 - 1][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 - 1][var44 - 1 + var51] & 0x124013E) != 0 || (var40[var43 - 1 + var51][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var51++;
                                                            }
                                                        }
                                                        if (var41 < 128 - var8 && var42 > 0 && class164.field2286[var41 + 1][var42 - 1] == 0 && (var40[var8 + var43][var44 - 1] & 0x1240183) == 0) {
                                                            int var52 = 1;
                                                            while (true) {
                                                                if (var52 >= var8) {
                                                                    class164.field2284[var81] = var32 + 1;
                                                                    class164.field2285[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class164.field2286[var41 + 1][var42 - 1] = 9;
                                                                    class164.field2290[var41 + 1][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var8 + var43][var44 - 1 + var52] & 0x12401E3) != 0 || (var40[var43 + var52][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var52++;
                                                            }
                                                        }
                                                        if (var41 > 0 && var42 < 128 - var8 && class164.field2286[var41 - 1][var42 + 1] == 0 && (var40[var43 - 1][var8 + var44] & 0x1240138) == 0) {
                                                            for (int var53 = 1; var53 < var8; var53++) {
                                                                if ((var40[var43 - 1][var44 + var53] & 0x124013E) != 0 || (var40[var43 - 1 + var53][var8 + var44] & 0x12401F8) != 0) {
                                                                    continue label559;
                                                                }
                                                            }
                                                            class164.field2284[var81] = var32 - 1;
                                                            class164.field2285[var81] = var33 + 1;
                                                            var81 = var81 + 1 & 0xFFF;
                                                            class164.field2286[var41 - 1][var42 + 1] = 6;
                                                            class164.field2290[var41 - 1][var42 + 1] = var46;
                                                        }
                                                    } while (var41 >= 128 - var8);
                                                } while (var42 >= 128 - var8);
                                            } while (class164.field2286[var41 + 1][var42 + 1] != 0);
                                        } while ((var40[var8 + var43][var8 + var44] & 0x12401E0) != 0);
                                        for (int var54 = 1; var54 < var8; var54++) {
                                            if ((var40[var43 + var54][var8 + var44] & 0x12401F8) != 0 || (var40[var8 + var43][var44 + var54] & 0x12401E3) != 0) {
                                                continue label582;
                                            }
                                        }
                                        class164.field2284[var81] = var32 + 1;
                                        class164.field2285[var81] = var33 + 1;
                                        var81 = var81 + 1 & 0xFFF;
                                        class164.field2286[var41 + 1][var42 + 1] = 12;
                                        class164.field2290[var41 + 1][var42 + 1] = var46;
                                    }
                                }
                                var16 = var45;
                            }
                            int var73;
                            label647: {
                                int var55 = var5 - 64;
                                int var56 = var6 - 64;
                                int var57 = Statics.field2288;
                                int var58 = Statics.field859;
                                if (!var16) {
                                    int var59 = Integer.MAX_VALUE;
                                    int var60 = Integer.MAX_VALUE;
                                    byte var61 = 10;
                                    int var62 = var10.field2295;
                                    int var63 = var10.field2294;
                                    int var64 = var10.field2293;
                                    int var65 = var10.field2296;
                                    for (int var66 = var62 - var61; var66 <= var61 + var62; var66++) {
                                        for (int var67 = var63 - var61; var67 <= var61 + var63; var67++) {
                                            int var68 = var66 - var55;
                                            int var69 = var67 - var56;
                                            if (var68 >= 0 && var69 >= 0 && var68 < 128 && var69 < 128 && class164.field2290[var68][var69] < 100) {
                                                int var70 = 0;
                                                if (var66 < var62) {
                                                    var70 = var62 - var66;
                                                } else if (var66 > var62 + var64 - 1) {
                                                    var70 = var66 - (var62 + var64 - 1);
                                                }
                                                int var71 = 0;
                                                if (var67 < var63) {
                                                    var71 = var63 - var67;
                                                } else if (var67 > var63 + var65 - 1) {
                                                    var71 = var67 - (var63 + var65 - 1);
                                                }
                                                int var72 = var70 * var70 + var71 * var71;
                                                if (var72 < var59 || var59 == var72 && class164.field2290[var68][var69] < var60) {
                                                    var59 = var72;
                                                    var60 = class164.field2290[var68][var69];
                                                    var57 = var66;
                                                    var58 = var67;
                                                }
                                            }
                                        }
                                    }
                                    if (var59 == Integer.MAX_VALUE) {
                                        var73 = -1;
                                        break label647;
                                    }
                                }
                                if (var5 == var57 && var6 == var58) {
                                    var73 = 0;
                                } else {
                                    byte var74 = 0;
                                    class164.field2284[var74] = var57;
                                    int var82 = var74 + 1;
                                    class164.field2285[var74] = var58;
                                    int var75;
                                    int var76 = var75 = class164.field2286[var57 - var55][var58 - var56];
                                    while (var5 != var57 || var6 != var58) {
                                        if (var75 != var76) {
                                            var75 = var76;
                                            class164.field2284[var82] = var57;
                                            class164.field2285[var82++] = var58;
                                        }
                                        if ((var76 & 0x2) != 0) {
                                            var57++;
                                        } else if ((var76 & 0x8) != 0) {
                                            var57--;
                                        }
                                        if ((var76 & 0x1) != 0) {
                                            var58++;
                                        } else if ((var76 & 0x4) != 0) {
                                            var58--;
                                        }
                                        var76 = class164.field2286[var57 - var55][var58 - var56];
                                    }
                                    int var77 = 0;
                                    while (var82-- > 0) {
                                        var12[var77] = class164.field2284[var82];
                                        var13[var77++] = class164.field2285[var82];
                                        if (var77 >= var12.length) {
                                            break;
                                        }
                                    }
                                    var73 = var77;
                                }
                            }
                            int var78 = var73;
                            if (var73 < 1) {
                                break;
                            }
                            int var79 = 0;
                            while (true) {
                                if (var79 >= var78 - 1) {
                                    break label606;
                                }
                                var4.method1056(client.field1181[var79], client.field1140[var79], (byte) 2);
                                var79++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class164.field2286[var14][var15] = 0;
                            class164.field2290[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method1056(arg0, arg1, arg2);
        } else {
            this.method1075(arg0, arg1);
        }
    }

    @ObfuscatedName("bk.w(III)V")
    public void method1075(int arg0, int arg1) {
        this.field1260 = 0;
        this.field1265 = 0;
        this.field1264 = 0;
        this.field1261[0] = arg0;
        this.field1262[0] = arg1;
        int var3 = this.method1052();
        this.field1221 = this.field1261[0] * 128 + var3 * 64;
        this.field1207 = this.field1262[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bk.k(IIBI)V")
    public final void method1056(int arg0, int arg1, byte arg2) {
        if (this.field1260 < 9) {
            this.field1260++;
        }
        for (int var4 = this.field1260; var4 > 0; var4--) {
            this.field1261[var4] = this.field1261[var4 - 1];
            this.field1262[var4] = this.field1262[var4 - 1];
            this.field1263[var4] = this.field1263[var4 - 1];
        }
        this.field1261[0] = arg0;
        this.field1262[0] = arg1;
        this.field1263[0] = arg2;
    }

    @ObfuscatedName("bk.v(I)Z")
    public final boolean method1057() {
        return this.field881 != null;
    }
}

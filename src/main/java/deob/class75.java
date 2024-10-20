package deob;

@ObfuscatedName("bo")
public final class class75 extends class79 {

    @ObfuscatedName("bo.s")
    public String field891;

    @ObfuscatedName("bo.c")
    public class217 field898;

    @ObfuscatedName("bo.f")
    public int field881 = -1;

    @ObfuscatedName("bo.m")
    public int field879 = -1;

    @ObfuscatedName("bo.t")
    public String[] field884 = new String[3];

    @ObfuscatedName("bo.p")
    public int field885;

    @ObfuscatedName("bo.d")
    public int field890;

    @ObfuscatedName("bo.n")
    public int field899;

    @ObfuscatedName("bo.z")
    public int field888;

    @ObfuscatedName("bo.o")
    public int field889;

    @ObfuscatedName("bo.q")
    public int field880;

    @ObfuscatedName("bo.u")
    public int field887;

    @ObfuscatedName("bo.k")
    public int field892;

    @ObfuscatedName("bo.e")
    public class134 field893;

    @ObfuscatedName("bo.r")
    public int field901;

    @ObfuscatedName("bo.l")
    public int field895;

    @ObfuscatedName("bo.y")
    public int field896;

    @ObfuscatedName("bo.w")
    public int field897;

    @ObfuscatedName("bo.i")
    public boolean field886;

    @ObfuscatedName("bo.g")
    public int field882;

    @ObfuscatedName("bo.a")
    public boolean field900;

    @ObfuscatedName("bo.x")
    public int field894;

    @ObfuscatedName("bo.b")
    public int field902;

    @ObfuscatedName("bo.j")
    public boolean field903;

    @ObfuscatedName("bo.v")
    public int field904;

    @ObfuscatedName("bo.ap")
    public int field905;

    public class75() {
        for (int var1 = 0; var1 < 3; var1++) {
            this.field884[var1] = "";
        }
        this.field885 = 0;
        this.field890 = 0;
        this.field888 = 0;
        this.field889 = 0;
        this.field886 = false;
        this.field882 = 0;
        this.field900 = false;
        this.field903 = false;
    }

    @ObfuscatedName("bo.s(Lfs;I)V")
    public final void method1030(class177 arg0) {
        arg0.field2402 = 0;
        int var2 = arg0.method2965();
        this.field881 = arg0.method2966();
        this.field879 = arg0.method2966();
        int var3 = -1;
        this.field882 = 0;
        int[] var4 = new int[12];
        for (int var5 = 0; var5 < 12; var5++) {
            int var6 = arg0.method2965();
            if (var6 == 0) {
                var4[var5] = 0;
            } else {
                int var7 = arg0.method2965();
                var4[var5] = (var6 << 8) + var7;
                if (var5 == 0 && var4[0] == 65535) {
                    var3 = arg0.method2967();
                    break;
                }
                if (var4[var5] >= 512) {
                    int var8 = class260.method3655(var4[var5] - 512).field3550;
                    if (var8 != 0) {
                        this.field882 = var8;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; var10++) {
            int var11 = arg0.method2965();
            if (var11 < 0 || var11 >= Statics.field817[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        this.field1229 = arg0.method2967();
        if (this.field1229 == 65535) {
            this.field1229 = -1;
        }
        this.field1230 = arg0.method2967();
        if (this.field1230 == 65535) {
            this.field1230 = -1;
        }
        this.field1242 = this.field1230;
        this.field1232 = arg0.method2967();
        if (this.field1232 == 65535) {
            this.field1232 = -1;
        }
        this.field1233 = arg0.method2967();
        if (this.field1233 == 65535) {
            this.field1233 = -1;
        }
        this.field1268 = arg0.method2967();
        if (this.field1268 == 65535) {
            this.field1268 = -1;
        }
        this.field1239 = arg0.method2967();
        if (this.field1239 == 65535) {
            this.field1239 = -1;
        }
        this.field1236 = arg0.method2967();
        if (this.field1236 == 65535) {
            this.field1236 = -1;
        }
        this.field891 = arg0.method2973();
        if (Statics.field300 == this) {
            Statics.field1480 = this.field891;
        }
        this.field885 = arg0.method2965();
        this.field890 = arg0.method2967();
        this.field900 = arg0.method2965() == 1;
        if (client.field920 == 0 && client.field1083 >= 2) {
            this.field900 = false;
        }
        if (this.field898 == null) {
            this.field898 = new class217();
        }
        this.field898.method3723(var4, var9, var2 == 1, var3);
    }

    @ObfuscatedName("bo.c(I)I")
    public int method1007() {
        return this.field898 == null || this.field898.field2638 == -1 ? 1 : class262.method4152(this.field898.field2638).field3581;
    }

    @ObfuscatedName("bo.f(B)Leb;")
    public final class134 method1016() {
        if (this.field898 == null) {
            return null;
        }
        class264 var1 = this.field1256 != -1 && this.field1266 == 0 ? class264.method341(this.field1256) : null;
        class264 var2 = this.field1253 == -1 || this.field886 || this.field1253 == this.field1229 && var1 != null ? null : class264.method341(this.field1253);
        class134 var3 = this.field898.method3702(var1, this.field1241, var2, this.field1252);
        if (var3 == null) {
            return null;
        }
        var3.method2346();
        this.field1274 = var3.field2117;
        if (!this.field886 && this.field1254 != -1 && this.field1262 != -1) {
            class134 var4 = class249.method3835(this.field1254).method4051(this.field1262);
            if (var4 != null) {
                var4.method2357(0, -this.field1265, 0);
                class134[] var5 = new class134[] { var3, var4 };
                var3 = new class134(var5, 2);
            }
        }
        if (!this.field886 && this.field893 != null) {
            if (client.field948 >= this.field889) {
                this.field893 = null;
            }
            if (client.field948 >= this.field888 && client.field948 < this.field889) {
                class134 var6 = this.field893;
                var6.method2357(this.field880 - this.field1282, this.field887 - this.field899, this.field892 - this.field1225);
                if (this.field1275 == 512) {
                    var6.method2353();
                    var6.method2353();
                    var6.method2353();
                } else if (this.field1275 == 1024) {
                    var6.method2353();
                    var6.method2353();
                } else if (this.field1275 == 1536) {
                    var6.method2353();
                }
                class134[] var7 = new class134[] { var3, var6 };
                var3 = new class134(var7, 2);
                if (this.field1275 == 512) {
                    var6.method2353();
                } else if (this.field1275 == 1024) {
                    var6.method2353();
                    var6.method2353();
                } else if (this.field1275 == 1536) {
                    var6.method2353();
                    var6.method2353();
                    var6.method2353();
                }
                var6.method2357(this.field1282 - this.field880, this.field899 - this.field887, this.field1225 - this.field892);
            }
        }
        var3.field1950 = true;
        return var3;
    }

    @ObfuscatedName("bo.m(IIBI)V")
    public final void method1011(int arg0, int arg1, byte arg2) {
        if (this.field1256 != -1 && class264.method341(this.field1256).field3629 == 1) {
            this.field1256 = -1;
        }
        this.field1234 = -1;
        if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
            this.method1012(arg0, arg1);
        } else if (this.field1279[0] >= 0 && this.field1279[0] < 104 && this.field1280[0] >= 0 && this.field1280[0] < 104) {
            if (arg2 == 2) {
                class75 var4 = this;
                int var5 = this.field1279[0];
                int var6 = this.field1280[0];
                int var7 = this.method1007();
                if (var5 >= var7 && var5 < 104 - var7 && var6 >= var7 && var6 < 104 - var7 && arg0 >= var7 && arg0 < 104 - var7 && arg1 >= var7 && arg1 < 104 - var7) {
                    int var8 = this.method1007();
                    client.field1193.field2325 = arg0;
                    client.field1193.field2329 = arg1;
                    client.field1193.field2324 = 1;
                    client.field1193.field2326 = 1;
                    class74 var9 = client.field1193;
                    class74 var10 = var9;
                    class165 var11 = client.field1053[this.field894];
                    int[] var12 = client.field1194;
                    int[] var13 = client.field1195;
                    int var14 = 0;
                    label606: while (true) {
                        if (var14 >= 128) {
                            boolean var16;
                            if (var8 == 1) {
                                var16 = class166.method1573(var5, var6, var9, var11);
                            } else if (var8 == 2) {
                                int var17 = var5;
                                int var18 = var6;
                                byte var19 = 64;
                                byte var20 = 64;
                                int var21 = var5 - var19;
                                int var22 = var6 - var20;
                                class166.field2319[var19][var20] = 99;
                                class166.field2320[var19][var20] = 0;
                                byte var23 = 0;
                                int var24 = 0;
                                class166.field2321[var23] = var5;
                                int var80 = var23 + 1;
                                class166.field2322[var23] = var6;
                                int[][] var25 = var11.field2305;
                                boolean var30;
                                while (true) {
                                    if (var80 == var24) {
                                        Statics.field3231 = var17;
                                        Statics.field2356 = var18;
                                        var30 = false;
                                        break;
                                    }
                                    var17 = class166.field2321[var24];
                                    var18 = class166.field2322[var24];
                                    var24 = var24 + 1 & 0xFFF;
                                    int var26 = var17 - var21;
                                    int var27 = var18 - var22;
                                    int var28 = var17 - var11.field2310;
                                    int var29 = var18 - var11.field2313;
                                    if (var10.method1002(2, var17, var18, var11)) {
                                        Statics.field3231 = var17;
                                        Statics.field2356 = var18;
                                        var30 = true;
                                        break;
                                    }
                                    int var31 = class166.field2320[var26][var27] + 1;
                                    if (var26 > 0 && class166.field2319[var26 - 1][var27] == 0 && (var25[var28 - 1][var29] & 0x124010E) == 0 && (var25[var28 - 1][var29 + 1] & 0x1240138) == 0) {
                                        class166.field2321[var80] = var17 - 1;
                                        class166.field2322[var80] = var18;
                                        var80 = var80 + 1 & 0xFFF;
                                        class166.field2319[var26 - 1][var27] = 2;
                                        class166.field2320[var26 - 1][var27] = var31;
                                    }
                                    if (var26 < 126 && class166.field2319[var26 + 1][var27] == 0 && (var25[var28 + 2][var29] & 0x1240183) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E0) == 0) {
                                        class166.field2321[var80] = var17 + 1;
                                        class166.field2322[var80] = var18;
                                        var80 = var80 + 1 & 0xFFF;
                                        class166.field2319[var26 + 1][var27] = 8;
                                        class166.field2320[var26 + 1][var27] = var31;
                                    }
                                    if (var27 > 0 && class166.field2319[var26][var27 - 1] == 0 && (var25[var28][var29 - 1] & 0x124010E) == 0 && (var25[var28 + 1][var29 - 1] & 0x1240183) == 0) {
                                        class166.field2321[var80] = var17;
                                        class166.field2322[var80] = var18 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class166.field2319[var26][var27 - 1] = 1;
                                        class166.field2320[var26][var27 - 1] = var31;
                                    }
                                    if (var27 < 126 && class166.field2319[var26][var27 + 1] == 0 && (var25[var28][var29 + 2] & 0x1240138) == 0 && (var25[var28 + 1][var29 + 2] & 0x12401E0) == 0) {
                                        class166.field2321[var80] = var17;
                                        class166.field2322[var80] = var18 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class166.field2319[var26][var27 + 1] = 4;
                                        class166.field2320[var26][var27 + 1] = var31;
                                    }
                                    if (var26 > 0 && var27 > 0 && class166.field2319[var26 - 1][var27 - 1] == 0 && (var25[var28 - 1][var29] & 0x124013E) == 0 && (var25[var28 - 1][var29 - 1] & 0x124010E) == 0 && (var25[var28][var29 - 1] & 0x124018F) == 0) {
                                        class166.field2321[var80] = var17 - 1;
                                        class166.field2322[var80] = var18 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class166.field2319[var26 - 1][var27 - 1] = 3;
                                        class166.field2320[var26 - 1][var27 - 1] = var31;
                                    }
                                    if (var26 < 126 && var27 > 0 && class166.field2319[var26 + 1][var27 - 1] == 0 && (var25[var28 + 1][var29 - 1] & 0x124018F) == 0 && (var25[var28 + 2][var29 - 1] & 0x1240183) == 0 && (var25[var28 + 2][var29] & 0x12401E3) == 0) {
                                        class166.field2321[var80] = var17 + 1;
                                        class166.field2322[var80] = var18 - 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class166.field2319[var26 + 1][var27 - 1] = 9;
                                        class166.field2320[var26 + 1][var27 - 1] = var31;
                                    }
                                    if (var26 > 0 && var27 < 126 && class166.field2319[var26 - 1][var27 + 1] == 0 && (var25[var28 - 1][var29 + 1] & 0x124013E) == 0 && (var25[var28 - 1][var29 + 2] & 0x1240138) == 0 && (var25[var28][var29 + 2] & 0x12401F8) == 0) {
                                        class166.field2321[var80] = var17 - 1;
                                        class166.field2322[var80] = var18 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class166.field2319[var26 - 1][var27 + 1] = 6;
                                        class166.field2320[var26 - 1][var27 + 1] = var31;
                                    }
                                    if (var26 < 126 && var27 < 126 && class166.field2319[var26 + 1][var27 + 1] == 0 && (var25[var28 + 1][var29 + 2] & 0x12401F8) == 0 && (var25[var28 + 2][var29 + 2] & 0x12401E0) == 0 && (var25[var28 + 2][var29 + 1] & 0x12401E3) == 0) {
                                        class166.field2321[var80] = var17 + 1;
                                        class166.field2322[var80] = var18 + 1;
                                        var80 = var80 + 1 & 0xFFF;
                                        class166.field2319[var26 + 1][var27 + 1] = 12;
                                        class166.field2320[var26 + 1][var27 + 1] = var31;
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
                                class166.field2319[var34][var35] = 99;
                                class166.field2320[var34][var35] = 0;
                                byte var38 = 0;
                                int var39 = 0;
                                class166.field2321[var38] = var5;
                                int var81 = var38 + 1;
                                class166.field2322[var38] = var6;
                                int[][] var40 = var11.field2305;
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
                                                            Statics.field3231 = var32;
                                                            Statics.field2356 = var33;
                                                            var45 = false;
                                                            break label584;
                                                        }
                                                        var32 = class166.field2321[var39];
                                                        var33 = class166.field2322[var39];
                                                        var39 = var39 + 1 & 0xFFF;
                                                        var41 = var32 - var36;
                                                        var42 = var33 - var37;
                                                        var43 = var32 - var11.field2310;
                                                        var44 = var33 - var11.field2313;
                                                        if (var10.method1002(var8, var32, var33, var11)) {
                                                            Statics.field3231 = var32;
                                                            Statics.field2356 = var33;
                                                            var45 = true;
                                                            break label584;
                                                        }
                                                        var46 = class166.field2320[var41][var42] + 1;
                                                        if (var41 > 0 && class166.field2319[var41 - 1][var42] == 0 && (var40[var43 - 1][var44] & 0x124010E) == 0 && (var40[var43 - 1][var8 + var44 - 1] & 0x1240138) == 0) {
                                                            int var47 = 1;
                                                            while (true) {
                                                                if (var47 >= var8 - 1) {
                                                                    class166.field2321[var81] = var32 - 1;
                                                                    class166.field2322[var81] = var33;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class166.field2319[var41 - 1][var42] = 2;
                                                                    class166.field2320[var41 - 1][var42] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 - 1][var44 + var47] & 0x124013E) != 0) {
                                                                    break;
                                                                }
                                                                var47++;
                                                            }
                                                        }
                                                        if (var41 < 128 - var8 && class166.field2319[var41 + 1][var42] == 0 && (var40[var8 + var43][var44] & 0x1240183) == 0 && (var40[var8 + var43][var8 + var44 - 1] & 0x12401E0) == 0) {
                                                            int var48 = 1;
                                                            while (true) {
                                                                if (var48 >= var8 - 1) {
                                                                    class166.field2321[var81] = var32 + 1;
                                                                    class166.field2322[var81] = var33;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class166.field2319[var41 + 1][var42] = 8;
                                                                    class166.field2320[var41 + 1][var42] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var8 + var43][var44 + var48] & 0x12401E3) != 0) {
                                                                    break;
                                                                }
                                                                var48++;
                                                            }
                                                        }
                                                        if (var42 > 0 && class166.field2319[var41][var42 - 1] == 0 && (var40[var43][var44 - 1] & 0x124010E) == 0 && (var40[var8 + var43 - 1][var44 - 1] & 0x1240183) == 0) {
                                                            int var49 = 1;
                                                            while (true) {
                                                                if (var49 >= var8 - 1) {
                                                                    class166.field2321[var81] = var32;
                                                                    class166.field2322[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class166.field2319[var41][var42 - 1] = 1;
                                                                    class166.field2320[var41][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 + var49][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var49++;
                                                            }
                                                        }
                                                        if (var42 < 128 - var8 && class166.field2319[var41][var42 + 1] == 0 && (var40[var43][var8 + var44] & 0x1240138) == 0 && (var40[var8 + var43 - 1][var8 + var44] & 0x12401E0) == 0) {
                                                            int var50 = 1;
                                                            while (true) {
                                                                if (var50 >= var8 - 1) {
                                                                    class166.field2321[var81] = var32;
                                                                    class166.field2322[var81] = var33 + 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class166.field2319[var41][var42 + 1] = 4;
                                                                    class166.field2320[var41][var42 + 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 + var50][var8 + var44] & 0x12401F8) != 0) {
                                                                    break;
                                                                }
                                                                var50++;
                                                            }
                                                        }
                                                        if (var41 > 0 && var42 > 0 && class166.field2319[var41 - 1][var42 - 1] == 0 && (var40[var43 - 1][var44 - 1] & 0x124010E) == 0) {
                                                            int var51 = 1;
                                                            while (true) {
                                                                if (var51 >= var8) {
                                                                    class166.field2321[var81] = var32 - 1;
                                                                    class166.field2322[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class166.field2319[var41 - 1][var42 - 1] = 3;
                                                                    class166.field2320[var41 - 1][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var43 - 1][var44 - 1 + var51] & 0x124013E) != 0 || (var40[var43 - 1 + var51][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var51++;
                                                            }
                                                        }
                                                        if (var41 < 128 - var8 && var42 > 0 && class166.field2319[var41 + 1][var42 - 1] == 0 && (var40[var8 + var43][var44 - 1] & 0x1240183) == 0) {
                                                            int var52 = 1;
                                                            while (true) {
                                                                if (var52 >= var8) {
                                                                    class166.field2321[var81] = var32 + 1;
                                                                    class166.field2322[var81] = var33 - 1;
                                                                    var81 = var81 + 1 & 0xFFF;
                                                                    class166.field2319[var41 + 1][var42 - 1] = 9;
                                                                    class166.field2320[var41 + 1][var42 - 1] = var46;
                                                                    break;
                                                                }
                                                                if ((var40[var8 + var43][var44 - 1 + var52] & 0x12401E3) != 0 || (var40[var43 + var52][var44 - 1] & 0x124018F) != 0) {
                                                                    break;
                                                                }
                                                                var52++;
                                                            }
                                                        }
                                                        if (var41 > 0 && var42 < 128 - var8 && class166.field2319[var41 - 1][var42 + 1] == 0 && (var40[var43 - 1][var8 + var44] & 0x1240138) == 0) {
                                                            for (int var53 = 1; var53 < var8; var53++) {
                                                                if ((var40[var43 - 1][var44 + var53] & 0x124013E) != 0 || (var40[var43 - 1 + var53][var8 + var44] & 0x12401F8) != 0) {
                                                                    continue label559;
                                                                }
                                                            }
                                                            class166.field2321[var81] = var32 - 1;
                                                            class166.field2322[var81] = var33 + 1;
                                                            var81 = var81 + 1 & 0xFFF;
                                                            class166.field2319[var41 - 1][var42 + 1] = 6;
                                                            class166.field2320[var41 - 1][var42 + 1] = var46;
                                                        }
                                                    } while (var41 >= 128 - var8);
                                                } while (var42 >= 128 - var8);
                                            } while (class166.field2319[var41 + 1][var42 + 1] != 0);
                                        } while ((var40[var8 + var43][var8 + var44] & 0x12401E0) != 0);
                                        for (int var54 = 1; var54 < var8; var54++) {
                                            if ((var40[var43 + var54][var8 + var44] & 0x12401F8) != 0 || (var40[var8 + var43][var44 + var54] & 0x12401E3) != 0) {
                                                continue label582;
                                            }
                                        }
                                        class166.field2321[var81] = var32 + 1;
                                        class166.field2322[var81] = var33 + 1;
                                        var81 = var81 + 1 & 0xFFF;
                                        class166.field2319[var41 + 1][var42 + 1] = 12;
                                        class166.field2320[var41 + 1][var42 + 1] = var46;
                                    }
                                }
                                var16 = var45;
                            }
                            int var73;
                            label647: {
                                int var55 = var5 - 64;
                                int var56 = var6 - 64;
                                int var57 = Statics.field3231;
                                int var58 = Statics.field2356;
                                if (!var16) {
                                    int var59 = Integer.MAX_VALUE;
                                    int var60 = Integer.MAX_VALUE;
                                    byte var61 = 10;
                                    int var62 = var10.field2325;
                                    int var63 = var10.field2329;
                                    int var64 = var10.field2324;
                                    int var65 = var10.field2326;
                                    for (int var66 = var62 - var61; var66 <= var61 + var62; var66++) {
                                        for (int var67 = var63 - var61; var67 <= var61 + var63; var67++) {
                                            int var68 = var66 - var55;
                                            int var69 = var67 - var56;
                                            if (var68 >= 0 && var69 >= 0 && var68 < 128 && var69 < 128 && class166.field2320[var68][var69] < 100) {
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
                                                if (var72 < var59 || var59 == var72 && class166.field2320[var68][var69] < var60) {
                                                    var59 = var72;
                                                    var60 = class166.field2320[var68][var69];
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
                                    class166.field2321[var74] = var57;
                                    int var82 = var74 + 1;
                                    class166.field2322[var74] = var58;
                                    int var75;
                                    int var76 = var75 = class166.field2319[var57 - var55][var58 - var56];
                                    while (var5 != var57 || var6 != var58) {
                                        if (var75 != var76) {
                                            var75 = var76;
                                            class166.field2321[var82] = var57;
                                            class166.field2322[var82++] = var58;
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
                                        var76 = class166.field2319[var57 - var55][var58 - var56];
                                    }
                                    int var77 = 0;
                                    while (var82-- > 0) {
                                        var12[var77] = class166.field2321[var82];
                                        var13[var77++] = class166.field2322[var82];
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
                                var4.method1019(client.field1194[var79], client.field1195[var79], (byte) 2);
                                var79++;
                            }
                        }
                        for (int var15 = 0; var15 < 128; var15++) {
                            class166.field2319[var14][var15] = 0;
                            class166.field2320[var14][var15] = 99999999;
                        }
                        var14++;
                    }
                }
            }
            this.method1019(arg0, arg1, arg2);
        } else {
            this.method1012(arg0, arg1);
        }
    }

    @ObfuscatedName("bo.h(IIS)V")
    public void method1012(int arg0, int arg1) {
        this.field1278 = 0;
        this.field1283 = 0;
        this.field1228 = 0;
        this.field1279[0] = arg0;
        this.field1280[0] = arg1;
        int var3 = this.method1007();
        this.field1282 = this.field1279[0] * 128 + var3 * 64;
        this.field1225 = this.field1280[0] * 128 + var3 * 64;
    }

    @ObfuscatedName("bo.t(IIBI)V")
    public final void method1019(int arg0, int arg1, byte arg2) {
        if (this.field1278 < 9) {
            this.field1278++;
        }
        for (int var4 = this.field1278; var4 > 0; var4--) {
            this.field1279[var4] = this.field1279[var4 - 1];
            this.field1280[var4] = this.field1280[var4 - 1];
            this.field1235[var4] = this.field1235[var4 - 1];
        }
        this.field1279[0] = arg0;
        this.field1280[0] = arg1;
        this.field1235[0] = arg2;
    }

    @ObfuscatedName("bo.p(B)Z")
    public final boolean method1014() {
        return this.field898 != null;
    }
}

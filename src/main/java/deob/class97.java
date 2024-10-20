package deob;

@ObfuscatedName("cu")
public class class97 {

    @ObfuscatedName("cu.e")
    public static byte[] field1490 = new byte[2048];

    @ObfuscatedName("cu.t")
    public static byte[] field1495 = new byte[2048];

    @ObfuscatedName("cu.w")
    public static class174[] field1499 = new class174[2048];

    @ObfuscatedName("cu.z")
    public static int field1488 = 0;

    @ObfuscatedName("cu.j")
    public static int[] field1492 = new int[2048];

    @ObfuscatedName("cu.i")
    public static int field1500 = 0;

    @ObfuscatedName("cu.f")
    public static int[] field1496 = new int[2048];

    @ObfuscatedName("cu.c")
    public static int[] field1491 = new int[2048];

    @ObfuscatedName("cu.o")
    public static int[] field1498 = new int[2048];

    @ObfuscatedName("cu.q")
    public static int[] field1493 = new int[2048];

    @ObfuscatedName("cu.n")
    public static int field1494 = 0;

    @ObfuscatedName("cu.a")
    public static int[] field1501 = new int[2048];

    @ObfuscatedName("cu.g")
    public static class174 field1502 = new class174(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.p(Lff;B)V")
    public static final void method896(class180 arg0) {
        arg0.method3056();
        int var1 = client.field1028;
        class75 var2 = Statics.field341 = client.field1049[var1] = new class75();
        var2.field891 = var1;
        int var3 = arg0.method3055(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1264[0] = var5 - Statics.field340;
        var2.field1234 = (var2.field1264[0] << 7) + (var2.method1003() << 6);
        var2.field1265[0] = var6 - Statics.field356;
        var2.field1210 = (var2.field1265[0] << 7) + (var2.method1003() << 6);
        Statics.field890 = var2.field885 = var4;
        if (field1499[var1] != null) {
            var2.method1022(field1499[var1]);
        }
        field1488 = 0;
        field1492[++field1488 - 1] = var1;
        field1490[var1] = 0;
        field1500 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3055(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1491[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1498[var7] = 0;
                field1493[var7] = -1;
                field1496[++field1500 - 1] = var7;
                field1490[var7] = 0;
            }
        }
        arg0.method3057();
    }

    @ObfuscatedName("ch.m(Lff;I)I")
    public static int method1381(class180 arg0) {
        int var1 = arg0.method3055(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3055(5);
        } else if (var1 == 2) {
            var2 = arg0.method3055(8);
        } else {
            var2 = arg0.method3055(11);
        }
        return var2;
    }

    @ObfuscatedName("e.e(Lff;II)V")
    public static void method5(class180 arg0, int arg1) {
        boolean var2 = arg0.method3055(1) == 1;
        if (var2) {
            field1501[++field1494 - 1] = arg1;
        }
        int var3 = arg0.method3055(2);
        class75 var4 = client.field1049[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field878 = false;
            } else if (client.field1028 == arg1) {
                throw new RuntimeException();
            } else {
                field1491[arg1] = (Statics.field356 + var4.field1265[0] >> 13) + (Statics.field340 + var4.field1264[0] >> 13 << 14) + (var4.field885 << 28);
                if (var4.field1237 == -1) {
                    field1498[arg1] = var4.field1250;
                } else {
                    field1498[arg1] = var4.field1237;
                }
                field1493[arg1] = var4.field1209;
                client.field1049[arg1] = null;
                if (arg0.method3055(1) != 0) {
                    method240(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3055(3);
            int var6 = var4.field1264[0];
            int var7 = var4.field1265[0];
            if (var5 == 0) {
                var6--;
                var7--;
            } else if (var5 == 1) {
                var7--;
            } else if (var5 == 2) {
                var6++;
                var7--;
            } else if (var5 == 3) {
                var6--;
            } else if (var5 == 4) {
                var6++;
            } else if (var5 == 5) {
                var6--;
                var7++;
            } else if (var5 == 6) {
                var7++;
            } else if (var5 == 7) {
                var6++;
                var7++;
            }
            if (client.field1028 == arg1 && var4.field1234 < 1536 || var4.field1210 < 1536 || var4.field1234 >= 11776 || var4.field1210 >= 11776) {
                var4.method1014(var6, var7);
                var4.field878 = false;
            } else if (var2) {
                var4.field878 = true;
                var4.field888 = var6;
                var4.field889 = var7;
            } else {
                var4.field878 = false;
                var4.method1002(var6, var7, field1495[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3055(4);
            int var9 = var4.field1264[0];
            int var10 = var4.field1265[0];
            if (var8 == 0) {
                var9 -= 2;
                var10 -= 2;
            } else if (var8 == 1) {
                var9--;
                var10 -= 2;
            } else if (var8 == 2) {
                var10 -= 2;
            } else if (var8 == 3) {
                var9++;
                var10 -= 2;
            } else if (var8 == 4) {
                var9 += 2;
                var10 -= 2;
            } else if (var8 == 5) {
                var9 -= 2;
                var10--;
            } else if (var8 == 6) {
                var9 += 2;
                var10--;
            } else if (var8 == 7) {
                var9 -= 2;
            } else if (var8 == 8) {
                var9 += 2;
            } else if (var8 == 9) {
                var9 -= 2;
                var10++;
            } else if (var8 == 10) {
                var9 += 2;
                var10++;
            } else if (var8 == 11) {
                var9 -= 2;
                var10 += 2;
            } else if (var8 == 12) {
                var9--;
                var10 += 2;
            } else if (var8 == 13) {
                var10 += 2;
            } else if (var8 == 14) {
                var9++;
                var10 += 2;
            } else if (var8 == 15) {
                var9 += 2;
                var10 += 2;
            }
            if (client.field1028 == arg1 && var4.field1234 < 1536 || var4.field1210 < 1536 || var4.field1234 >= 11776 || var4.field1210 >= 11776) {
                var4.method1014(var9, var10);
                var4.field878 = false;
            } else if (var2) {
                var4.field878 = true;
                var4.field888 = var9;
                var4.field889 = var10;
            } else {
                var4.field878 = false;
                var4.method1002(var9, var10, field1495[arg1]);
            }
        } else {
            int var11 = arg0.method3055(1);
            if (var11 == 0) {
                int var12 = arg0.method3055(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1264[0] + var14;
                int var17 = var4.field1265[0] + var15;
                if (client.field1028 == arg1 && var4.field1234 < 1536 || var4.field1210 < 1536 || var4.field1234 >= 11776 || var4.field1210 >= 11776) {
                    var4.method1014(var16, var17);
                    var4.field878 = false;
                } else if (var2) {
                    var4.field878 = true;
                    var4.field888 = var16;
                    var4.field889 = var17;
                } else {
                    var4.field878 = false;
                    var4.method1002(var16, var17, field1495[arg1]);
                }
                var4.field885 = (byte) (var4.field885 + var13 & 0x3);
                if (client.field1028 == arg1) {
                    Statics.field890 = var4.field885;
                }
            } else {
                int var18 = arg0.method3055(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field340 + var4.field1264[0] + var20 & 0x3FFF) - Statics.field340;
                int var23 = (Statics.field356 + var4.field1265[0] + var21 & 0x3FFF) - Statics.field356;
                if (client.field1028 == arg1 && var4.field1234 < 1536 || var4.field1210 < 1536 || var4.field1234 >= 11776 || var4.field1210 >= 11776) {
                    var4.method1014(var22, var23);
                    var4.field878 = false;
                } else if (var2) {
                    var4.field878 = true;
                    var4.field888 = var22;
                    var4.field889 = var23;
                } else {
                    var4.field878 = false;
                    var4.method1002(var22, var23, field1495[arg1]);
                }
                var4.field885 = (byte) (var4.field885 + var19 & 0x3);
                if (client.field1028 == arg1) {
                    Statics.field890 = var4.field885;
                }
            }
        }
    }

    @ObfuscatedName("ae.t(Lff;IS)Z")
    public static boolean method240(class180 arg0, int arg1) {
        int var2 = arg0.method3055(2);
        if (var2 == 0) {
            if (arg0.method3055(1) != 0) {
                method240(arg0, arg1);
            }
            int var3 = arg0.method3055(13);
            int var4 = arg0.method3055(13);
            boolean var5 = arg0.method3055(1) == 1;
            if (var5) {
                field1501[++field1494 - 1] = arg1;
            }
            if (client.field1049[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field1049[arg1] = new class75();
            var6.field891 = arg1;
            if (field1499[arg1] != null) {
                var6.method1022(field1499[arg1]);
            }
            var6.field1250 = field1498[arg1];
            var6.field1209 = field1493[arg1];
            int var7 = field1491[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1266[0] = field1495[arg1];
            var6.field885 = (byte) var8;
            var6.method1014((var9 << 13) + var3 - Statics.field340, (var10 << 13) + var4 - Statics.field356);
            var6.field878 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3055(2);
            int var12 = field1491[arg1];
            field1491[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3055(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1491[arg1];
            int var17 = (var16 >> 28) + var14 & 0x3;
            int var18 = var16 >> 14 & 0xFF;
            int var19 = var16 & 0xFF;
            if (var15 == 0) {
                var18--;
                var19--;
            }
            if (var15 == 1) {
                var19--;
            }
            if (var15 == 2) {
                var18++;
                var19--;
            }
            if (var15 == 3) {
                var18--;
            }
            if (var15 == 4) {
                var18++;
            }
            if (var15 == 5) {
                var18--;
                var19++;
            }
            if (var15 == 6) {
                var19++;
            }
            if (var15 == 7) {
                var18++;
                var19++;
            }
            field1491[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3055(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1491[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1491[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("cr.w(Lff;B)V")
    public static final void method1555(class180 arg0) {
        for (int var1 = 0; var1 < field1494; var1++) {
            int var2 = field1501[var1];
            class75 var3 = client.field1049[var2];
            int var4 = arg0.method2810();
            if ((var4 & 0x1) != 0) {
                var4 += arg0.method2810() << 8;
            }
            method531(arg0, var2, var3, var4);
        }
    }

    @ObfuscatedName("ag.z(Lff;ILbh;IS)V")
    public static final void method531(class180 arg0, int arg1, class75 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x4) != 0) {
            int var5 = arg0.method2810();
            byte[] var6 = new byte[var5];
            class174 var7 = new class174(var6);
            arg0.method3022(var6, 0, var5);
            field1499[arg1] = var7;
            arg2.method1022(var7);
        }
        if ((arg3 & 0x40) != 0) {
            int var8 = arg0.method2824();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2810();
            client.method48(arg2, var8, var9);
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1209 = arg0.method2824();
            if (arg2.field1209 == 65535) {
                arg2.field1209 = -1;
            }
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1236 = arg0.method2818();
            if (arg2.field1236.charAt(0) == '~') {
                arg2.field1236 = arg2.field1236.substring(1);
                Statics.method19(2, arg2.field873, arg2.field1236);
            } else if (Statics.field341 == arg2) {
                Statics.method19(2, arg2.field873, arg2.field1236);
            }
            arg2.field1223 = false;
            arg2.field1226 = 0;
            arg2.field1263 = 0;
            arg2.field1235 = 150;
        }
        if ((arg3 & 0x2) != 0) {
            int var10 = arg0.method2810();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2823();
                    if (var15 == 32767) {
                        var15 = arg0.method2823();
                        var13 = arg0.method2823();
                        var12 = arg0.method2823();
                        var14 = arg0.method2823();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2823();
                    }
                    int var16 = arg0.method2823();
                    arg2.method1352(var15, var13, var12, var14, client.field960, var16);
                }
            }
            int var17 = arg0.method2810();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2823();
                    int var20 = arg0.method2823();
                    if (var20 == 32767) {
                        arg2.method1355(var19);
                    } else {
                        int var21 = arg0.method2823();
                        int var22 = arg0.method2810();
                        int var23 = var20 > 0 ? arg0.method2810() : var22;
                        arg2.method1354(var19, client.field960, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1237 = arg0.method2824();
            if (arg2.field1211 == 0) {
                arg2.field1250 = arg2.field1237;
                arg2.field1237 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var24 = arg0.method2824();
            class231[] var25 = new class231[] { class231.field3181, class231.field3179, class231.field3188, class231.field3183, class231.field3180, class231.field3182 };
            class231 var26 = (class231) Statics.method666(var25, arg0.method2810());
            boolean var27 = arg0.method2810() == 1;
            int var28 = arg0.method2810();
            int var29 = arg0.field2408;
            if (arg2.field873 != null && arg2.field864 != null) {
                boolean var30 = false;
                if (var26.field3187 && client.method1501(arg2.field873)) {
                    var30 = true;
                }
                if (!var30 && client.field1026 == 0 && !arg2.field884) {
                    field1502.field2408 = 0;
                    arg0.method3022(field1502.field2415, 0, var28);
                    field1502.field2408 = 0;
                    class174 var31 = field1502;
                    String var32 = class266.method2730(var31, 32767);
                    String var33 = class265.method4323(Statics.method3545(var32));
                    arg2.field1236 = var33.trim();
                    arg2.field1226 = var24 >> 8;
                    arg2.field1263 = var24 & 0xFF;
                    arg2.field1235 = 150;
                    arg2.field1223 = var27;
                    arg2.field1224 = Statics.field341 != arg2 && var26.field3187 && client.field1125 != "" && var33.toLowerCase().indexOf(client.field1125) == -1;
                    int var34;
                    if (var26.field3186) {
                        var34 = var27 ? 91 : 1;
                    } else {
                        var34 = var27 ? 90 : 2;
                    }
                    if (var26.field3185 == -1) {
                        Statics.method19(var34, arg2.field873, var33);
                    } else {
                        Statics.method19(var34, class89.method672(var26.field3185) + arg2.field873, var33);
                    }
                }
            }
            arg0.field2408 = var28 + var29;
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1246 = arg0.method2824();
            int var35 = arg0.method2803();
            arg2.field1240 = var35 >> 16;
            arg2.field1249 = (var35 & 0xFFFF) + client.field960;
            arg2.field1222 = 0;
            arg2.field1248 = 0;
            if (arg2.field1249 > client.field960) {
                arg2.field1222 = -1;
            }
            if (arg2.field1246 == 65535) {
                arg2.field1246 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1251 = arg0.method2811();
            arg2.field1214 = arg0.method2811();
            arg2.field1257 = arg0.method2811();
            arg2.field1254 = arg0.method2811();
            arg2.field1255 = arg0.method2824() + client.field960;
            arg2.field1260 = arg0.method2824() + client.field960;
            arg2.field1262 = arg0.method2824();
            if (arg2.field878) {
                arg2.field1251 += arg2.field888;
                arg2.field1214 += arg2.field889;
                arg2.field1257 += arg2.field888;
                arg2.field1254 += arg2.field889;
                arg2.field1211 = 0;
            } else {
                arg2.field1251 += arg2.field1264[0];
                arg2.field1214 += arg2.field1265[0];
                arg2.field1257 += arg2.field1264[0];
                arg2.field1254 += arg2.field1265[0];
                arg2.field1211 = 1;
            }
            arg2.field1268 = 0;
        }
        if ((arg3 & 0x100) != 0) {
            field1495[arg1] = arg0.method2811();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method2811();
        }
        if ((arg3 & 0x200) != 0) {
            for (int var36 = 0; var36 < 3; var36++) {
                arg2.field868[var36] = arg0.method2818();
            }
        }
        if (!arg2.field878) {
            return;
        }
        if (var4 == 127) {
            arg2.method1014(arg2.field888, arg2.field889);
            return;
        }
        byte var37;
        if (var4 == -1) {
            var37 = field1495[arg1];
        } else {
            var37 = var4;
        }
        arg2.method1002(arg2.field888, arg2.field889, var37);
    }

    @ObfuscatedName("cg.j(I)V")
    public static void method1654() {
        field1488 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1499[var0] = null;
            field1495[var0] = 1;
        }
    }
}

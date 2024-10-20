package deob;

@ObfuscatedName("cu")
public class class97 {

    @ObfuscatedName("cu.a")
    public static byte[] field1517 = new byte[2048];

    @ObfuscatedName("cu.t")
    public static byte[] field1520 = new byte[2048];

    @ObfuscatedName("cu.s")
    public static class174[] field1521 = new class174[2048];

    @ObfuscatedName("cu.r")
    public static int field1522 = 0;

    @ObfuscatedName("cu.v")
    public static int[] field1532 = new int[2048];

    @ObfuscatedName("cu.y")
    public static int field1524 = 0;

    @ObfuscatedName("cu.j")
    public static int[] field1525 = new int[2048];

    @ObfuscatedName("cu.k")
    public static int[] field1523 = new int[2048];

    @ObfuscatedName("cu.e")
    public static int[] field1527 = new int[2048];

    @ObfuscatedName("cu.o")
    public static int[] field1528 = new int[2048];

    @ObfuscatedName("cu.z")
    public static int field1526 = 0;

    @ObfuscatedName("cu.l")
    public static int[] field1530 = new int[2048];

    @ObfuscatedName("cu.c")
    public static class174 field1534 = new class174(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.i(Lfr;I)V")
    public static final void method111(class180 arg0) {
        arg0.method3129();
        int var1 = client.field1049;
        class75 var2 = Statics.field803 = client.field967[var1] = new class75();
        var2.field915 = var1;
        int var3 = arg0.method3107(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1294[0] = var5 - Statics.field669;
        var2.field1273 = (var2.field1294[0] << 7) + (var2.method1047() << 6);
        var2.field1296[0] = var6 - Statics.field3674;
        var2.field1240 = (var2.field1296[0] << 7) + (var2.method1047() << 6);
        Statics.field2137 = var2.field912 = var4;
        if (field1521[var1] != null) {
            var2.method1045(field1521[var1]);
        }
        field1522 = 0;
        field1532[++field1522 - 1] = var1;
        field1517[var1] = 0;
        field1524 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3107(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1523[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1527[var7] = 0;
                field1528[var7] = -1;
                field1525[++field1524 - 1] = var7;
                field1517[var7] = 0;
            }
        }
        arg0.method3103();
    }

    @ObfuscatedName("cc.w(Lfr;I)V")
    public static final void method1579(class180 arg0) {
        int var1 = 0;
        arg0.method3129();
        for (int var2 = 0; var2 < field1522; var2++) {
            int var3 = field1532[var2];
            if ((field1517[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1517[var3] = (byte) (field1517[var3] | 0x2);
                } else {
                    int var4 = arg0.method3107(1);
                    if (var4 == 0) {
                        var1 = method2804(arg0);
                        field1517[var3] = (byte) (field1517[var3] | 0x2);
                    } else {
                        method468(arg0, var3);
                    }
                }
            }
        }
        arg0.method3103();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3129();
        for (int var5 = 0; var5 < field1522; var5++) {
            int var6 = field1532[var5];
            if ((field1517[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1517[var6] = (byte) (field1517[var6] | 0x2);
                } else {
                    int var7 = arg0.method3107(1);
                    if (var7 == 0) {
                        var1 = method2804(arg0);
                        field1517[var6] = (byte) (field1517[var6] | 0x2);
                    } else {
                        method468(arg0, var6);
                    }
                }
            }
        }
        arg0.method3103();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3129();
        for (int var8 = 0; var8 < field1524; var8++) {
            int var9 = field1525[var8];
            if ((field1517[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1517[var9] = (byte) (field1517[var9] | 0x2);
                } else {
                    int var10 = arg0.method3107(1);
                    if (var10 == 0) {
                        var1 = method2804(arg0);
                        field1517[var9] = (byte) (field1517[var9] | 0x2);
                    } else if (method2651(arg0, var9)) {
                        field1517[var9] = (byte) (field1517[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3103();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3129();
        for (int var11 = 0; var11 < field1524; var11++) {
            int var12 = field1525[var11];
            if ((field1517[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1517[var12] = (byte) (field1517[var12] | 0x2);
                } else {
                    int var13 = arg0.method3107(1);
                    if (var13 == 0) {
                        var1 = method2804(arg0);
                        field1517[var12] = (byte) (field1517[var12] | 0x2);
                    } else if (method2651(arg0, var12)) {
                        field1517[var12] = (byte) (field1517[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3103();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1522 = 0;
        field1524 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1517[var14] = (byte) (field1517[var14] >> 1);
            class75 var15 = client.field967[var14];
            if (var15 == null) {
                field1525[++field1524 - 1] = var14;
            } else {
                field1532[++field1522 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("fq.a(Lfr;I)I")
    public static int method2804(class180 arg0) {
        int var1 = arg0.method3107(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3107(5);
        } else if (var1 == 2) {
            var2 = arg0.method3107(8);
        } else {
            var2 = arg0.method3107(11);
        }
        return var2;
    }

    @ObfuscatedName("ao.t(Lfr;IS)V")
    public static void method468(class180 arg0, int arg1) {
        boolean var2 = arg0.method3107(1) == 1;
        if (var2) {
            field1530[++field1526 - 1] = arg1;
        }
        int var3 = arg0.method3107(2);
        class75 var4 = client.field967[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field914 = false;
            } else if (client.field1049 == arg1) {
                throw new RuntimeException();
            } else {
                field1523[arg1] = (Statics.field3674 + var4.field1296[0] >> 13) + (Statics.field669 + var4.field1294[0] >> 13 << 14) + (var4.field912 << 28);
                if (var4.field1267 == -1) {
                    field1527[arg1] = var4.field1290;
                } else {
                    field1527[arg1] = var4.field1267;
                }
                field1528[arg1] = var4.field1277;
                client.field967[arg1] = null;
                if (arg0.method3107(1) != 0) {
                    method2651(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3107(3);
            int var6 = var4.field1294[0];
            int var7 = var4.field1296[0];
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
            if (client.field1049 == arg1 && var4.field1273 < 1536 || var4.field1240 < 1536 || var4.field1273 >= 11776 || var4.field1240 >= 11776) {
                var4.method1067(var6, var7);
                var4.field914 = false;
            } else if (var2) {
                var4.field914 = true;
                var4.field918 = var6;
                var4.field916 = var7;
            } else {
                var4.field914 = false;
                var4.method1049(var6, var7, field1520[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3107(4);
            int var9 = var4.field1294[0];
            int var10 = var4.field1296[0];
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
            if (client.field1049 == arg1 && var4.field1273 < 1536 || var4.field1240 < 1536 || var4.field1273 >= 11776 || var4.field1240 >= 11776) {
                var4.method1067(var9, var10);
                var4.field914 = false;
            } else if (var2) {
                var4.field914 = true;
                var4.field918 = var9;
                var4.field916 = var10;
            } else {
                var4.field914 = false;
                var4.method1049(var9, var10, field1520[arg1]);
            }
        } else {
            int var11 = arg0.method3107(1);
            if (var11 == 0) {
                int var12 = arg0.method3107(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1294[0] + var14;
                int var17 = var4.field1296[0] + var15;
                if (client.field1049 == arg1 && var4.field1273 < 1536 || var4.field1240 < 1536 || var4.field1273 >= 11776 || var4.field1240 >= 11776) {
                    var4.method1067(var16, var17);
                    var4.field914 = false;
                } else if (var2) {
                    var4.field914 = true;
                    var4.field918 = var16;
                    var4.field916 = var17;
                } else {
                    var4.field914 = false;
                    var4.method1049(var16, var17, field1520[arg1]);
                }
                var4.field912 = (byte) (var4.field912 + var13 & 0x3);
                if (client.field1049 == arg1) {
                    Statics.field2137 = var4.field912;
                }
            } else {
                int var18 = arg0.method3107(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field669 + var4.field1294[0] + var20 & 0x3FFF) - Statics.field669;
                int var23 = (Statics.field3674 + var4.field1296[0] + var21 & 0x3FFF) - Statics.field3674;
                if (client.field1049 == arg1 && var4.field1273 < 1536 || var4.field1240 < 1536 || var4.field1273 >= 11776 || var4.field1240 >= 11776) {
                    var4.method1067(var22, var23);
                    var4.field914 = false;
                } else if (var2) {
                    var4.field914 = true;
                    var4.field918 = var22;
                    var4.field916 = var23;
                } else {
                    var4.field914 = false;
                    var4.method1049(var22, var23, field1520[arg1]);
                }
                var4.field912 = (byte) (var4.field912 + var19 & 0x3);
                if (client.field1049 == arg1) {
                    Statics.field2137 = var4.field912;
                }
            }
        }
    }

    @ObfuscatedName("es.s(Lfr;II)Z")
    public static boolean method2651(class180 arg0, int arg1) {
        int var2 = arg0.method3107(2);
        if (var2 == 0) {
            if (arg0.method3107(1) != 0) {
                method2651(arg0, arg1);
            }
            int var3 = arg0.method3107(13);
            int var4 = arg0.method3107(13);
            boolean var5 = arg0.method3107(1) == 1;
            if (var5) {
                field1530[++field1526 - 1] = arg1;
            }
            if (client.field967[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field967[arg1] = new class75();
            var6.field915 = arg1;
            if (field1521[arg1] != null) {
                var6.method1045(field1521[arg1]);
            }
            var6.field1290 = field1527[arg1];
            var6.field1277 = field1528[arg1];
            int var7 = field1523[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1298[0] = field1520[arg1];
            var6.field912 = (byte) var8;
            var6.method1067((var9 << 13) + var3 - Statics.field669, (var10 << 13) + var4 - Statics.field3674);
            var6.field914 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3107(2);
            int var12 = field1523[arg1];
            field1523[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3107(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1523[arg1];
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
            field1523[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3107(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1523[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1523[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("cl.r(Lfr;B)V")
    public static final void method1480(class180 arg0) {
        for (int var1 = 0; var1 < field1526; var1++) {
            int var2 = field1530[var1];
            class75 var3 = client.field967[var2];
            int var4 = arg0.method3061();
            if ((var4 & 0x4) != 0) {
                var4 += arg0.method3061() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x10) != 0) {
                int var6 = arg0.method3061();
                byte[] var7 = new byte[var6];
                class174 var8 = new class174(var7);
                arg0.method2891(var7, 0, var6);
                field1521[var2] = var8;
                var3.method1045(var8);
            }
            if ((var4 & 0x2) != 0) {
                int var9 = arg0.method2882();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = arg0.method3061();
                client.method701(var3, var9, var10);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1277 = arg0.method2882();
                if (var3.field1277 == 65535) {
                    var3.field1277 = -1;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field1252 = arg0.method2884();
                if (var3.field1252.charAt(0) == '~') {
                    var3.field1252 = var3.field1252.substring(1);
                    class99.method2665(2, var3.field913, var3.field1252);
                } else if (Statics.field803 == var3) {
                    class99.method2665(2, var3.field913, var3.field1252);
                }
                var3.field1285 = false;
                var3.field1256 = 0;
                var3.field1257 = 0;
                var3.field1265 = 150;
            }
            if ((var4 & 0x40) != 0) {
                int var11 = arg0.method3061();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg0.method2893();
                        if (var16 == 32767) {
                            var16 = arg0.method2893();
                            var14 = arg0.method2893();
                            var13 = arg0.method2893();
                            var15 = arg0.method2893();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg0.method2893();
                        }
                        int var17 = arg0.method2893();
                        var3.method1406(var16, var14, var13, var15, client.field936, var17);
                    }
                }
                int var18 = arg0.method3061();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg0.method2893();
                        int var21 = arg0.method2893();
                        if (var21 == 32767) {
                            var3.method1417(var20);
                        } else {
                            int var22 = arg0.method2893();
                            int var23 = arg0.method3061();
                            int var24 = var21 > 0 ? arg0.method3061() : var23;
                            var3.method1407(var20, client.field936, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1267 = arg0.method2882();
                if (var3.field1293 == 0) {
                    var3.field1290 = var3.field1267;
                    var3.field1267 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var25 = arg0.method2882();
                class231 var26 = (class231) class169.method2353(class231.method3711(), arg0.method3061());
                boolean var27 = arg0.method3061() == 1;
                int var28 = arg0.method3061();
                int var29 = arg0.field2399;
                if (var3.field913 != null && var3.field917 != null) {
                    boolean var30 = false;
                    if (var26.field3189 && client.method3(var3.field913)) {
                        var30 = true;
                    }
                    if (!var30 && client.field1046 == 0 && !var3.field911) {
                        field1534.field2399 = 0;
                        arg0.method2891(field1534.field2405, 0, var28);
                        field1534.field2399 = 0;
                        class174 var31 = field1534;
                        String var35;
                        try {
                            int var32 = var31.method2893();
                            if (var32 > 32767) {
                                var32 = 32767;
                            }
                            byte[] var33 = new byte[var32];
                            var31.field2399 += Statics.field3666.method2796(var31.field2405, var31.field2399, var33, 0, var32);
                            String var34 = class267.method647(var33, 0, var32);
                            var35 = var34;
                        } catch (Exception var43) {
                            var35 = "Cabbage";
                        }
                        String var38 = class265.method4466(class271.method2640(var35));
                        var3.field1252 = var38.trim();
                        var3.field1256 = var25 >> 8;
                        var3.field1257 = var25 & 0xFF;
                        var3.field1265 = 150;
                        var3.field1285 = var27;
                        var3.field1254 = Statics.field803 != var3 && var26.field3189 && client.field1146 != "" && var38.toLowerCase().indexOf(client.field1146) == -1;
                        int var39;
                        if (var26.field3185) {
                            var39 = var27 ? 91 : 1;
                        } else {
                            var39 = var27 ? 90 : 2;
                        }
                        if (var26.field3187 == -1) {
                            class99.method2665(var39, var3.field913, var38);
                        } else {
                            class99.method2665(var39, class89.method548(var26.field3187) + var3.field913, var38);
                        }
                    }
                }
                arg0.field2399 = var28 + var29;
            }
            if ((var4 & 0x1000) != 0) {
                var3.field1249 = arg0.method2882();
                int var40 = arg0.method2885();
                var3.field1239 = var40 >> 16;
                var3.field1279 = (var40 & 0xFFFF) + client.field936;
                var3.field1245 = 0;
                var3.field1278 = 0;
                if (var3.field1279 > client.field936) {
                    var3.field1245 = -1;
                }
                if (var3.field1249 == 65535) {
                    var3.field1249 = -1;
                }
            }
            if ((var4 & 0x100) != 0) {
                var3.field1281 = arg0.method2930();
                var3.field1283 = arg0.method2930();
                var3.field1297 = arg0.method2930();
                var3.field1242 = arg0.method2930();
                var3.field1275 = arg0.method2882() + client.field936;
                var3.field1286 = arg0.method2882() + client.field936;
                var3.field1287 = arg0.method2882();
                if (var3.field914) {
                    var3.field1281 += var3.field918;
                    var3.field1283 += var3.field916;
                    var3.field1297 += var3.field918;
                    var3.field1242 += var3.field916;
                    var3.field1293 = 0;
                } else {
                    var3.field1281 += var3.field1294[0];
                    var3.field1283 += var3.field1296[0];
                    var3.field1297 += var3.field1294[0];
                    var3.field1242 += var3.field1296[0];
                    var3.field1293 = 1;
                }
                var3.field1270 = 0;
            }
            if ((var4 & 0x200) != 0) {
                field1520[var2] = arg0.method2930();
            }
            if ((var4 & 0x400) != 0) {
                var5 = arg0.method2930();
            }
            if ((var4 & 0x800) != 0) {
                for (int var41 = 0; var41 < 3; var41++) {
                    var3.field905[var41] = arg0.method2884();
                }
            }
            if (var3.field914) {
                if (var5 == 127) {
                    var3.method1067(var3.field918, var3.field916);
                } else {
                    byte var42;
                    if (var5 == -1) {
                        var42 = field1520[var2];
                    } else {
                        var42 = var5;
                    }
                    var3.method1049(var3.field918, var3.field916, var42);
                }
            }
        }
    }

    @ObfuscatedName("client.v(B)V")
    public static void method1396() {
        field1522 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1521[var0] = null;
            field1520[var0] = 1;
        }
    }
}

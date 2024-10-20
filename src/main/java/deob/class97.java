package deob;

@ObfuscatedName("cp")
public class class97 {

    @ObfuscatedName("cp.n")
    public static byte[] field1492 = new byte[2048];

    @ObfuscatedName("cp.r")
    public static byte[] field1488 = new byte[2048];

    @ObfuscatedName("cp.v")
    public static class174[] field1491 = new class174[2048];

    @ObfuscatedName("cp.e")
    public static int field1500 = 0;

    @ObfuscatedName("cp.l")
    public static int[] field1493 = new int[2048];

    @ObfuscatedName("cp.s")
    public static int field1490 = 0;

    @ObfuscatedName("cp.w")
    public static int[] field1495 = new int[2048];

    @ObfuscatedName("cp.p")
    public static int[] field1496 = new int[2048];

    @ObfuscatedName("cp.m")
    public static int[] field1497 = new int[2048];

    @ObfuscatedName("cp.u")
    public static int[] field1498 = new int[2048];

    @ObfuscatedName("cp.g")
    public static int field1499 = 0;

    @ObfuscatedName("cp.k")
    public static int[] field1494 = new int[2048];

    @ObfuscatedName("cp.t")
    public static class174 field1501 = new class174(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.a(Lff;B)V")
    public static final void method1542(class180 arg0) {
        arg0.method3115();
        int var1 = client.field1028;
        class75 var2 = Statics.field1537 = client.field1130[var1] = new class75();
        var2.field871 = var1;
        int var3 = arg0.method3122(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1270[0] = var5 - Statics.field2316;
        var2.field1233 = (var2.field1270[0] << 7) + (var2.method996() << 6);
        var2.field1255[0] = var6 - Statics.field265;
        var2.field1265 = (var2.field1255[0] << 7) + (var2.method996() << 6);
        Statics.field579 = var2.field890 = var4;
        if (field1491[var1] != null) {
            var2.method1017(field1491[var1]);
        }
        field1500 = 0;
        field1493[++field1500 - 1] = var1;
        field1492[var1] = 0;
        field1490 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3122(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1496[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1497[var7] = 0;
                field1498[var7] = -1;
                field1495[++field1490 - 1] = var7;
                field1492[var7] = 0;
            }
        }
        arg0.method3114();
    }

    @ObfuscatedName("dq.j(Lff;II)V")
    public static final void method2254(class180 arg0, int arg1) {
        int var2 = arg0.field2394;
        field1499 = 0;
        int var3 = 0;
        arg0.method3115();
        for (int var4 = 0; var4 < field1500; var4++) {
            int var5 = field1493[var4];
            if ((field1492[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1492[var5] = (byte) (field1492[var5] | 0x2);
                } else {
                    int var6 = arg0.method3122(1);
                    if (var6 == 0) {
                        var3 = method454(arg0);
                        field1492[var5] = (byte) (field1492[var5] | 0x2);
                    } else {
                        method711(arg0, var5);
                    }
                }
            }
        }
        arg0.method3114();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3115();
        for (int var7 = 0; var7 < field1500; var7++) {
            int var8 = field1493[var7];
            if ((field1492[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1492[var8] = (byte) (field1492[var8] | 0x2);
                } else {
                    int var9 = arg0.method3122(1);
                    if (var9 == 0) {
                        var3 = method454(arg0);
                        field1492[var8] = (byte) (field1492[var8] | 0x2);
                    } else {
                        method711(arg0, var8);
                    }
                }
            }
        }
        arg0.method3114();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3115();
        for (int var10 = 0; var10 < field1490; var10++) {
            int var11 = field1495[var10];
            if ((field1492[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1492[var11] = (byte) (field1492[var11] | 0x2);
                } else {
                    int var12 = arg0.method3122(1);
                    if (var12 == 0) {
                        var3 = method454(arg0);
                        field1492[var11] = (byte) (field1492[var11] | 0x2);
                    } else if (method2709(arg0, var11)) {
                        field1492[var11] = (byte) (field1492[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method3114();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3115();
        for (int var13 = 0; var13 < field1490; var13++) {
            int var14 = field1495[var13];
            if ((field1492[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1492[var14] = (byte) (field1492[var14] | 0x2);
                } else {
                    int var15 = arg0.method3122(1);
                    if (var15 == 0) {
                        var3 = method454(arg0);
                        field1492[var14] = (byte) (field1492[var14] | 0x2);
                    } else if (method2709(arg0, var14)) {
                        field1492[var14] = (byte) (field1492[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method3114();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1500 = 0;
        field1490 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1492[var16] = (byte) (field1492[var16] >> 1);
            class75 var17 = client.field1130[var16];
            if (var17 == null) {
                field1495[++field1490 - 1] = var16;
            } else {
                field1493[++field1500 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1499; var18++) {
            int var19 = field1494[var18];
            class75 var20 = client.field1130[var19];
            int var21 = arg0.method2871();
            if ((var21 & 0x2) != 0) {
                var21 += arg0.method2871() << 8;
            }
            byte var22 = -1;
            if ((var21 & 0x40) != 0) {
                int var23 = arg0.method2871();
                byte[] var24 = new byte[var23];
                class174 var25 = new class174(var24);
                arg0.method3054(var24, 0, var23);
                field1491[var19] = var25;
                var20.method1017(var25);
            }
            if ((var21 & 0x1) != 0) {
                int var26 = arg0.method2873();
                if (var26 == 65535) {
                    var26 = -1;
                }
                int var27 = arg0.method2871();
                client.method2717(var20, var26, var27);
            }
            if ((var21 & 0x20) != 0) {
                var20.field1250 = arg0.method2873();
                if (var20.field1250 == 65535) {
                    var20.field1250 = -1;
                }
            }
            if ((var21 & 0x10) != 0) {
                var20.field1228 = arg0.method2879();
                if (var20.field1228.charAt(0) == '~') {
                    var20.field1228 = var20.field1228.substring(1);
                    class99.method973(2, var20.field878, var20.field1228);
                } else if (Statics.field1537 == var20) {
                    class99.method973(2, var20.field878, var20.field1228);
                }
                var20.field1229 = false;
                var20.field1232 = 0;
                var20.field1242 = 0;
                var20.field1231 = 150;
            }
            if ((var21 & 0x8) != 0) {
                int var28 = arg0.method2871();
                if (var28 > 0) {
                    for (int var29 = 0; var29 < var28; var29++) {
                        int var30 = -1;
                        int var31 = -1;
                        int var32 = -1;
                        int var33 = arg0.method2884();
                        if (var33 == 32767) {
                            var33 = arg0.method2884();
                            var31 = arg0.method2884();
                            var30 = arg0.method2884();
                            var32 = arg0.method2884();
                        } else if (var33 == 32766) {
                            var33 = -1;
                        } else {
                            var31 = arg0.method2884();
                        }
                        int var34 = arg0.method2884();
                        var20.method1348(var33, var31, var30, var32, client.field934, var34);
                    }
                }
                int var35 = arg0.method2871();
                if (var35 > 0) {
                    for (int var36 = 0; var36 < var35; var36++) {
                        int var37 = arg0.method2884();
                        int var38 = arg0.method2884();
                        if (var38 == 32767) {
                            var20.method1350(var37);
                        } else {
                            int var39 = arg0.method2884();
                            int var40 = arg0.method2871();
                            int var41 = var38 > 0 ? arg0.method2871() : var40;
                            var20.method1349(var37, client.field934, var38, var39, var40, var41);
                        }
                    }
                }
            }
            if ((var21 & 0x80) != 0) {
                var20.field1243 = arg0.method2873();
                if (var20.field1269 == 0) {
                    var20.field1266 = var20.field1243;
                    var20.field1243 = -1;
                }
            }
            if ((var21 & 0x4) != 0) {
                int var42 = arg0.method2873();
                class231[] var43 = new class231[] { class231.field3177, class231.field3176, class231.field3175, class231.field3181, class231.field3178, class231.field3180 };
                class231 var44 = (class231) class169.method1334(var43, arg0.method2871());
                boolean var45 = arg0.method2871() == 1;
                int var46 = arg0.method2871();
                int var47 = arg0.field2394;
                if (var20.field878 != null && var20.field869 != null) {
                    boolean var48 = false;
                    if (var44.field3183 && client.method2655(var20.field878)) {
                        var48 = true;
                    }
                    if (!var48 && client.field1026 == 0 && !var20.field889) {
                        field1501.field2394 = 0;
                        arg0.method3054(field1501.field2391, 0, var46);
                        field1501.field2394 = 0;
                        class174 var49 = field1501;
                        String var53;
                        try {
                            int var50 = var49.method2884();
                            if (var50 > 32767) {
                                var50 = 32767;
                            }
                            byte[] var51 = new byte[var50];
                            var49.field2394 += Statics.field3658.method2799(var49.field2391, var49.field2394, var51, 0, var50);
                            String var52 = class267.method36(var51, 0, var50);
                            var53 = var52;
                        } catch (Exception var61) {
                            var53 = "Cabbage";
                        }
                        String var56 = class265.method4344(class271.method109(var53));
                        var20.field1228 = var56.trim();
                        var20.field1232 = var42 >> 8;
                        var20.field1242 = var42 & 0xFF;
                        var20.field1231 = 150;
                        var20.field1229 = var45;
                        var20.field1230 = Statics.field1537 != var20 && var44.field3183 && client.field1125 != "" && var56.toLowerCase().indexOf(client.field1125) == -1;
                        int var57;
                        if (var44.field3182) {
                            var57 = var45 ? 91 : 1;
                        } else {
                            var57 = var45 ? 90 : 2;
                        }
                        if (var44.field3179 == -1) {
                            class99.method973(var57, var20.field878, var56);
                        } else {
                            class99.method973(var57, class89.method1373(var44.field3179) + var20.field878, var56);
                        }
                    }
                }
                arg0.field2394 = var46 + var47;
            }
            if ((var21 & 0x200) != 0) {
                var20.field1215 = arg0.method2873();
                int var58 = arg0.method2876();
                var20.field1256 = var58 >> 16;
                var20.field1217 = (var58 & 0xFFFF) + client.field934;
                var20.field1251 = 0;
                var20.field1254 = 0;
                if (var20.field1217 > client.field934) {
                    var20.field1251 = -1;
                }
                if (var20.field1215 == 65535) {
                    var20.field1215 = -1;
                }
            }
            if ((var21 & 0x400) != 0) {
                var20.field1257 = arg0.method2872();
                var20.field1259 = arg0.method2872();
                var20.field1258 = arg0.method2872();
                var20.field1223 = arg0.method2872();
                var20.field1261 = arg0.method2873() + client.field934;
                var20.field1262 = arg0.method2873() + client.field934;
                var20.field1263 = arg0.method2873();
                if (var20.field892) {
                    var20.field1257 += var20.field893;
                    var20.field1259 += var20.field894;
                    var20.field1258 += var20.field893;
                    var20.field1223 += var20.field894;
                    var20.field1269 = 0;
                } else {
                    var20.field1257 += var20.field1270[0];
                    var20.field1259 += var20.field1255[0];
                    var20.field1258 += var20.field1270[0];
                    var20.field1223 += var20.field1255[0];
                    var20.field1269 = 1;
                }
                var20.field1274 = 0;
            }
            if ((var21 & 0x100) != 0) {
                field1488[var19] = arg0.method2872();
            }
            if ((var21 & 0x1000) != 0) {
                var22 = arg0.method2872();
            }
            if ((var21 & 0x800) != 0) {
                for (int var59 = 0; var59 < 3; var59++) {
                    var20.field873[var59] = arg0.method2879();
                }
            }
            if (var20.field892) {
                if (var22 == 127) {
                    var20.method999(var20.field893, var20.field894);
                } else {
                    byte var60;
                    if (var22 == -1) {
                        var60 = field1488[var19];
                    } else {
                        var60 = var22;
                    }
                    var20.method998(var20.field893, var20.field894, var60);
                }
            }
        }
        if (arg0.field2394 - var2 != arg1) {
            throw new RuntimeException(arg0.field2394 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("aj.n(Lff;B)I")
    public static int method454(class180 arg0) {
        int var1 = arg0.method3122(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3122(5);
        } else if (var1 == 2) {
            var2 = arg0.method3122(8);
        } else {
            var2 = arg0.method3122(11);
        }
        return var2;
    }

    @ObfuscatedName("bl.r(Lff;II)V")
    public static void method711(class180 arg0, int arg1) {
        boolean var2 = arg0.method3122(1) == 1;
        if (var2) {
            field1494[++field1499 - 1] = arg1;
        }
        int var3 = arg0.method3122(2);
        class75 var4 = client.field1130[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field892 = false;
            } else if (client.field1028 == arg1) {
                throw new RuntimeException();
            } else {
                field1496[arg1] = (Statics.field265 + var4.field1255[0] >> 13) + (Statics.field2316 + var4.field1270[0] >> 13 << 14) + (var4.field890 << 28);
                if (var4.field1243 == -1) {
                    field1497[arg1] = var4.field1266;
                } else {
                    field1497[arg1] = var4.field1243;
                }
                field1498[arg1] = var4.field1250;
                client.field1130[arg1] = null;
                if (arg0.method3122(1) != 0) {
                    method2709(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3122(3);
            int var6 = var4.field1270[0];
            int var7 = var4.field1255[0];
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
            if (client.field1028 == arg1 && var4.field1233 < 1536 || var4.field1265 < 1536 || var4.field1233 >= 11776 || var4.field1265 >= 11776) {
                var4.method999(var6, var7);
                var4.field892 = false;
            } else if (var2) {
                var4.field892 = true;
                var4.field893 = var6;
                var4.field894 = var7;
            } else {
                var4.field892 = false;
                var4.method998(var6, var7, field1488[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3122(4);
            int var9 = var4.field1270[0];
            int var10 = var4.field1255[0];
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
            if (client.field1028 == arg1 && var4.field1233 < 1536 || var4.field1265 < 1536 || var4.field1233 >= 11776 || var4.field1265 >= 11776) {
                var4.method999(var9, var10);
                var4.field892 = false;
            } else if (var2) {
                var4.field892 = true;
                var4.field893 = var9;
                var4.field894 = var10;
            } else {
                var4.field892 = false;
                var4.method998(var9, var10, field1488[arg1]);
            }
        } else {
            int var11 = arg0.method3122(1);
            if (var11 == 0) {
                int var12 = arg0.method3122(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1270[0] + var14;
                int var17 = var4.field1255[0] + var15;
                if (client.field1028 == arg1 && var4.field1233 < 1536 || var4.field1265 < 1536 || var4.field1233 >= 11776 || var4.field1265 >= 11776) {
                    var4.method999(var16, var17);
                    var4.field892 = false;
                } else if (var2) {
                    var4.field892 = true;
                    var4.field893 = var16;
                    var4.field894 = var17;
                } else {
                    var4.field892 = false;
                    var4.method998(var16, var17, field1488[arg1]);
                }
                var4.field890 = (byte) (var4.field890 + var13 & 0x3);
                if (client.field1028 == arg1) {
                    Statics.field579 = var4.field890;
                }
            } else {
                int var18 = arg0.method3122(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2316 + var4.field1270[0] + var20 & 0x3FFF) - Statics.field2316;
                int var23 = (Statics.field265 + var4.field1255[0] + var21 & 0x3FFF) - Statics.field265;
                if (client.field1028 == arg1 && var4.field1233 < 1536 || var4.field1265 < 1536 || var4.field1233 >= 11776 || var4.field1265 >= 11776) {
                    var4.method999(var22, var23);
                    var4.field892 = false;
                } else if (var2) {
                    var4.field892 = true;
                    var4.field893 = var22;
                    var4.field894 = var23;
                } else {
                    var4.field892 = false;
                    var4.method998(var22, var23, field1488[arg1]);
                }
                var4.field890 = (byte) (var4.field890 + var19 & 0x3);
                if (client.field1028 == arg1) {
                    Statics.field579 = var4.field890;
                }
            }
        }
    }

    @ObfuscatedName("fd.v(Lff;II)Z")
    public static boolean method2709(class180 arg0, int arg1) {
        int var2 = arg0.method3122(2);
        if (var2 == 0) {
            if (arg0.method3122(1) != 0) {
                method2709(arg0, arg1);
            }
            int var3 = arg0.method3122(13);
            int var4 = arg0.method3122(13);
            boolean var5 = arg0.method3122(1) == 1;
            if (var5) {
                field1494[++field1499 - 1] = arg1;
            }
            if (client.field1130[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field1130[arg1] = new class75();
            var6.field871 = arg1;
            if (field1491[arg1] != null) {
                var6.method1017(field1491[arg1]);
            }
            var6.field1266 = field1497[arg1];
            var6.field1250 = field1498[arg1];
            int var7 = field1496[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1240[0] = field1488[arg1];
            var6.field890 = (byte) var8;
            var6.method999((var9 << 13) + var3 - Statics.field2316, (var10 << 13) + var4 - Statics.field265);
            var6.field892 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3122(2);
            int var12 = field1496[arg1];
            field1496[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3122(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1496[arg1];
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
            field1496[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3122(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1496[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1496[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }
}

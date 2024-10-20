package deob;

@ObfuscatedName("cv")
public class class97 {

    @ObfuscatedName("cv.e")
    public static byte[] field1505 = new byte[2048];

    @ObfuscatedName("cv.v")
    public static byte[] field1504 = new byte[2048];

    @ObfuscatedName("cv.b")
    public static class174[] field1507 = new class174[2048];

    @ObfuscatedName("cv.y")
    public static int field1508 = 0;

    @ObfuscatedName("cv.h")
    public static int[] field1509 = new int[2048];

    @ObfuscatedName("cv.x")
    public static int field1503 = 0;

    @ObfuscatedName("cv.f")
    public static int[] field1516 = new int[2048];

    @ObfuscatedName("cv.n")
    public static int[] field1512 = new int[2048];

    @ObfuscatedName("cv.a")
    public static int[] field1513 = new int[2048];

    @ObfuscatedName("cv.o")
    public static int[] field1514 = new int[2048];

    @ObfuscatedName("cv.z")
    public static int field1515 = 0;

    @ObfuscatedName("cv.q")
    public static int[] field1518 = new int[2048];

    @ObfuscatedName("cv.j")
    public static class174 field1517 = new class174(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("l.i(Lfb;I)V")
    public static final void method150(class180 arg0) {
        arg0.method3107();
        int var1 = client.field1214;
        class75 var2 = Statics.field1321 = client.field1051[var1] = new class75();
        var2.field913 = var1;
        int var3 = arg0.method3115(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1298[0] = var5 - Statics.field562;
        var2.field1275 = (var2.field1298[0] << 7) + (var2.method1022() << 6);
        var2.field1299[0] = var6 - Statics.field387;
        var2.field1244 = (var2.field1299[0] << 7) + (var2.method1022() << 6);
        Statics.field2158 = var2.field912 = var4;
        if (field1507[var1] != null) {
            var2.method1007(field1507[var1]);
        }
        field1508 = 0;
        field1509[++field1508 - 1] = var1;
        field1505[var1] = 0;
        field1503 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3115(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1512[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1513[var7] = 0;
                field1514[var7] = -1;
                field1516[++field1503 - 1] = var7;
                field1505[var7] = 0;
            }
        }
        arg0.method3109();
    }

    @ObfuscatedName("as.c(Lfb;II)V")
    public static final void method473(class180 arg0, int arg1) {
        int var2 = arg0.field2407;
        field1515 = 0;
        method987(arg0);
        for (int var3 = 0; var3 < field1515; var3++) {
            int var4 = field1518[var3];
            class75 var5 = client.field1051[var4];
            int var6 = arg0.method2870();
            if ((var6 & 0x8) != 0) {
                var6 += arg0.method2870() << 8;
            }
            method696(arg0, var4, var5, var6);
        }
        if (arg0.field2407 - var2 != arg1) {
            throw new RuntimeException(arg0.field2407 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bd.e(Lfb;I)V")
    public static final void method987(class180 arg0) {
        int var1 = 0;
        arg0.method3107();
        for (int var2 = 0; var2 < field1508; var2++) {
            int var3 = field1509[var2];
            if ((field1505[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1505[var3] = (byte) (field1505[var3] | 0x2);
                } else {
                    int var4 = arg0.method3115(1);
                    if (var4 == 0) {
                        var1 = method3745(arg0);
                        field1505[var3] = (byte) (field1505[var3] | 0x2);
                    } else {
                        method72(arg0, var3);
                    }
                }
            }
        }
        arg0.method3109();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3107();
        for (int var5 = 0; var5 < field1508; var5++) {
            int var6 = field1509[var5];
            if ((field1505[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1505[var6] = (byte) (field1505[var6] | 0x2);
                } else {
                    int var7 = arg0.method3115(1);
                    if (var7 == 0) {
                        var1 = method3745(arg0);
                        field1505[var6] = (byte) (field1505[var6] | 0x2);
                    } else {
                        method72(arg0, var6);
                    }
                }
            }
        }
        arg0.method3109();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3107();
        for (int var8 = 0; var8 < field1503; var8++) {
            int var9 = field1516[var8];
            if ((field1505[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1505[var9] = (byte) (field1505[var9] | 0x2);
                } else {
                    int var10 = arg0.method3115(1);
                    if (var10 == 0) {
                        var1 = method3745(arg0);
                        field1505[var9] = (byte) (field1505[var9] | 0x2);
                    } else if (method650(arg0, var9)) {
                        field1505[var9] = (byte) (field1505[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3109();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3107();
        for (int var11 = 0; var11 < field1503; var11++) {
            int var12 = field1516[var11];
            if ((field1505[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1505[var12] = (byte) (field1505[var12] | 0x2);
                } else {
                    int var13 = arg0.method3115(1);
                    if (var13 == 0) {
                        var1 = method3745(arg0);
                        field1505[var12] = (byte) (field1505[var12] | 0x2);
                    } else if (method650(arg0, var12)) {
                        field1505[var12] = (byte) (field1505[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3109();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1508 = 0;
        field1503 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1505[var14] = (byte) (field1505[var14] >> 1);
            class75 var15 = client.field1051[var14];
            if (var15 == null) {
                field1516[++field1503 - 1] = var14;
            } else {
                field1509[++field1508 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("hr.v(Lfb;I)I")
    public static int method3745(class180 arg0) {
        int var1 = arg0.method3115(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3115(5);
        } else if (var1 == 2) {
            var2 = arg0.method3115(8);
        } else {
            var2 = arg0.method3115(11);
        }
        return var2;
    }

    @ObfuscatedName("k.b(Lfb;II)V")
    public static void method72(class180 arg0, int arg1) {
        boolean var2 = arg0.method3115(1) == 1;
        if (var2) {
            field1518[++field1515 - 1] = arg1;
        }
        int var3 = arg0.method3115(2);
        class75 var4 = client.field1051[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field891 = false;
            } else if (client.field1214 == arg1) {
                throw new RuntimeException();
            } else {
                field1512[arg1] = (Statics.field387 + var4.field1299[0] >> 13) + (Statics.field562 + var4.field1298[0] >> 13 << 14) + (var4.field912 << 28);
                if (var4.field1271 == -1) {
                    field1513[arg1] = var4.field1260;
                } else {
                    field1513[arg1] = var4.field1271;
                }
                field1514[arg1] = var4.field1294;
                client.field1051[arg1] = null;
                if (arg0.method3115(1) != 0) {
                    method650(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3115(3);
            int var6 = var4.field1298[0];
            int var7 = var4.field1299[0];
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
            if (client.field1214 == arg1 && var4.field1275 < 1536 || var4.field1244 < 1536 || var4.field1275 >= 11776 || var4.field1244 >= 11776) {
                var4.method1011(var6, var7);
                var4.field891 = false;
            } else if (var2) {
                var4.field891 = true;
                var4.field915 = var6;
                var4.field916 = var7;
            } else {
                var4.field891 = false;
                var4.method1010(var6, var7, field1504[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3115(4);
            int var9 = var4.field1298[0];
            int var10 = var4.field1299[0];
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
            if (client.field1214 == arg1 && var4.field1275 < 1536 || var4.field1244 < 1536 || var4.field1275 >= 11776 || var4.field1244 >= 11776) {
                var4.method1011(var9, var10);
                var4.field891 = false;
            } else if (var2) {
                var4.field891 = true;
                var4.field915 = var9;
                var4.field916 = var10;
            } else {
                var4.field891 = false;
                var4.method1010(var9, var10, field1504[arg1]);
            }
        } else {
            int var11 = arg0.method3115(1);
            if (var11 == 0) {
                int var12 = arg0.method3115(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1298[0] + var14;
                int var17 = var4.field1299[0] + var15;
                if (client.field1214 == arg1 && var4.field1275 < 1536 || var4.field1244 < 1536 || var4.field1275 >= 11776 || var4.field1244 >= 11776) {
                    var4.method1011(var16, var17);
                    var4.field891 = false;
                } else if (var2) {
                    var4.field891 = true;
                    var4.field915 = var16;
                    var4.field916 = var17;
                } else {
                    var4.field891 = false;
                    var4.method1010(var16, var17, field1504[arg1]);
                }
                var4.field912 = (byte) (var4.field912 + var13 & 0x3);
                if (client.field1214 == arg1) {
                    Statics.field2158 = var4.field912;
                }
            } else {
                int var18 = arg0.method3115(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field562 + var4.field1298[0] + var20 & 0x3FFF) - Statics.field562;
                int var23 = (Statics.field387 + var4.field1299[0] + var21 & 0x3FFF) - Statics.field387;
                if (client.field1214 == arg1 && var4.field1275 < 1536 || var4.field1244 < 1536 || var4.field1275 >= 11776 || var4.field1244 >= 11776) {
                    var4.method1011(var22, var23);
                    var4.field891 = false;
                } else if (var2) {
                    var4.field891 = true;
                    var4.field915 = var22;
                    var4.field916 = var23;
                } else {
                    var4.field891 = false;
                    var4.method1010(var22, var23, field1504[arg1]);
                }
                var4.field912 = (byte) (var4.field912 + var19 & 0x3);
                if (client.field1214 == arg1) {
                    Statics.field2158 = var4.field912;
                }
            }
        }
    }

    @ObfuscatedName("am.y(Lfb;II)Z")
    public static boolean method650(class180 arg0, int arg1) {
        int var2 = arg0.method3115(2);
        if (var2 == 0) {
            if (arg0.method3115(1) != 0) {
                method650(arg0, arg1);
            }
            int var3 = arg0.method3115(13);
            int var4 = arg0.method3115(13);
            boolean var5 = arg0.method3115(1) == 1;
            if (var5) {
                field1518[++field1515 - 1] = arg1;
            }
            if (client.field1051[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field1051[arg1] = new class75();
            var6.field913 = arg1;
            if (field1507[arg1] != null) {
                var6.method1007(field1507[arg1]);
            }
            var6.field1260 = field1513[arg1];
            var6.field1294 = field1514[arg1];
            int var7 = field1512[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1258[0] = field1504[arg1];
            var6.field912 = (byte) var8;
            var6.method1011((var9 << 13) + var3 - Statics.field562, (var10 << 13) + var4 - Statics.field387);
            var6.field891 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3115(2);
            int var12 = field1512[arg1];
            field1512[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3115(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1512[arg1];
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
            field1512[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3115(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1512[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1512[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bj.h(Lfb;ILbm;II)V")
    public static final void method696(class180 arg0, int arg1, class75 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x10) != 0) {
            int var5 = arg0.method2870();
            byte[] var6 = new byte[var5];
            class174 var7 = new class174(var6);
            arg0.method2881(var6, 0, var5);
            field1507[arg1] = var7;
            arg2.method1007(var7);
        }
        if ((arg3 & 0x1) != 0) {
            int var8 = arg0.method2872();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2870();
            Statics.method44(arg2, var8, var9);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1294 = arg0.method2872();
            if (arg2.field1294 == 65535) {
                arg2.field1294 = -1;
            }
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1256 = arg0.method2878();
            if (arg2.field1256.charAt(0) == '~') {
                arg2.field1256 = arg2.field1256.substring(1);
                class99.method107(2, arg2.field906, arg2.field1256);
            } else if (Statics.field1321 == arg2) {
                class99.method107(2, arg2.field906, arg2.field1256);
            }
            arg2.field1257 = false;
            arg2.field1246 = 0;
            arg2.field1295 = 0;
            arg2.field1259 = 150;
        }
        if ((arg3 & 0x2) != 0) {
            int var10 = arg0.method2870();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2883();
                    if (var15 == 32767) {
                        var15 = arg0.method2883();
                        var13 = arg0.method2883();
                        var12 = arg0.method2883();
                        var14 = arg0.method2883();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2883();
                    }
                    int var16 = arg0.method2883();
                    arg2.method1387(var15, var13, var12, var14, client.field938, var16);
                }
            }
            int var17 = arg0.method2870();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2883();
                    int var20 = arg0.method2883();
                    if (var20 == 32767) {
                        arg2.method1394(var19);
                    } else {
                        int var21 = arg0.method2883();
                        int var22 = arg0.method2870();
                        int var23 = var20 > 0 ? arg0.method2870() : var22;
                        arg2.method1399(var19, client.field938, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1271 = arg0.method2872();
            if (arg2.field1264 == 0) {
                arg2.field1260 = arg2.field1271;
                arg2.field1271 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var24 = arg0.method2872();
            class231 var25 = (class231) class169.method1610(class231.method1713(), arg0.method2870());
            boolean var26 = arg0.method2870() == 1;
            int var27 = arg0.method2870();
            int var28 = arg0.field2407;
            if (arg2.field906 != null && arg2.field902 != null) {
                boolean var29 = false;
                if (var25.field3172 && client.method3580(arg2.field906)) {
                    var29 = true;
                }
                if (!var29 && client.field986 == 0 && !arg2.field914) {
                    field1517.field2407 = 0;
                    arg0.method2881(field1517.field2415, 0, var27);
                    field1517.field2407 = 0;
                    class174 var30 = field1517;
                    String var34;
                    try {
                        int var31 = var30.method2883();
                        if (var31 > 32767) {
                            var31 = 32767;
                        }
                        byte[] var32 = new byte[var31];
                        var30.field2407 += Statics.field3655.method2806(var30.field2415, var30.field2407, var32, 0, var31);
                        String var33 = class267.method3975(var32, 0, var31);
                        var34 = var33;
                    } catch (Exception var45) {
                        var34 = "Cabbage";
                    }
                    String var37 = class265.method4415(class271.method1930(var34));
                    arg2.field1256 = var37.trim();
                    arg2.field1246 = var24 >> 8;
                    arg2.field1295 = var24 & 0xFF;
                    arg2.field1259 = 150;
                    arg2.field1257 = var26;
                    arg2.field1248 = Statics.field1321 != arg2 && var25.field3172 && client.field1149 != "" && var37.toLowerCase().indexOf(client.field1149) == -1;
                    int var38;
                    if (var25.field3174) {
                        var38 = var26 ? 91 : 1;
                    } else {
                        var38 = var26 ? 90 : 2;
                    }
                    if (var25.field3175 == -1) {
                        class99.method107(var38, arg2.field906, var37);
                    } else {
                        int var40 = var25.field3175;
                        String var41 = "<img=" + var40 + ">";
                        class99.method107(var38, var41 + arg2.field906, var37);
                    }
                }
            }
            arg0.field2407 = var27 + var28;
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1280 = arg0.method2872();
            int var42 = arg0.method2875();
            arg2.field1303 = var42 >> 16;
            arg2.field1297 = (var42 & 0xFFFF) + client.field938;
            arg2.field1281 = 0;
            arg2.field1282 = 0;
            if (arg2.field1297 > client.field938) {
                arg2.field1281 = -1;
            }
            if (arg2.field1280 == 65535) {
                arg2.field1280 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field1285 = arg0.method2938();
            arg2.field1287 = arg0.method2938();
            arg2.field1286 = arg0.method2938();
            arg2.field1288 = arg0.method2938();
            arg2.field1251 = arg0.method2872() + client.field938;
            arg2.field1290 = arg0.method2872() + client.field938;
            arg2.field1291 = arg0.method2872();
            if (arg2.field891) {
                arg2.field1285 += arg2.field915;
                arg2.field1287 += arg2.field916;
                arg2.field1286 += arg2.field915;
                arg2.field1288 += arg2.field916;
                arg2.field1264 = 0;
            } else {
                arg2.field1285 += arg2.field1298[0];
                arg2.field1287 += arg2.field1299[0];
                arg2.field1286 += arg2.field1298[0];
                arg2.field1288 += arg2.field1299[0];
                arg2.field1264 = 1;
            }
            arg2.field1302 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            field1504[arg1] = arg0.method2938();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method2938();
        }
        if ((arg3 & 0x200) != 0) {
            for (int var43 = 0; var43 < 3; var43++) {
                arg2.field893[var43] = arg0.method2878();
            }
        }
        if (!arg2.field891) {
            return;
        }
        if (var4 == 127) {
            arg2.method1011(arg2.field915, arg2.field916);
            return;
        }
        byte var44;
        if (var4 == -1) {
            var44 = field1504[arg1];
        } else {
            var44 = var4;
        }
        arg2.method1010(arg2.field915, arg2.field916, var44);
    }
}

package deob;

@ObfuscatedName("cm")
public class class96 {

    @ObfuscatedName("cm.a")
    public static byte[] field1505 = new byte[2048];

    @ObfuscatedName("cm.r")
    public static byte[] field1514 = new byte[2048];

    @ObfuscatedName("cm.o")
    public static class175[] field1507 = new class175[2048];

    @ObfuscatedName("cm.n")
    public static int field1508 = 0;

    @ObfuscatedName("cm.q")
    public static int[] field1512 = new int[2048];

    @ObfuscatedName("cm.b")
    public static int field1510 = 0;

    @ObfuscatedName("cm.k")
    public static int[] field1516 = new int[2048];

    @ObfuscatedName("cm.s")
    public static int[] field1503 = new int[2048];

    @ObfuscatedName("cm.d")
    public static int[] field1513 = new int[2048];

    @ObfuscatedName("cm.l")
    public static int[] field1509 = new int[2048];

    @ObfuscatedName("cm.t")
    public static int field1515 = 0;

    @ObfuscatedName("cm.y")
    public static int[] field1511 = new int[2048];

    @ObfuscatedName("cm.v")
    public static class175 field1517 = new class175(new byte[5000]);

    public class96() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gc.i(Lfn;B)V")
    public static final void method3268(class181 arg0) {
        arg0.method3226();
        int var1 = client.field1028;
        class75 var2 = Statics.field908 = client.field1106[var1] = new class75();
        var2.field924 = var1;
        int var3 = arg0.method3230(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1248[0] = var5 - Statics.field2202;
        var2.field1233 = (var2.field1248[0] << 7) + (var2.method1053() << 6);
        var2.field1242[0] = var6 - Statics.field840;
        var2.field1232 = (var2.field1242[0] << 7) + (var2.method1053() << 6);
        Statics.field409 = var2.field911 = var4;
        if (field1507[var1] != null) {
            var2.method1036(field1507[var1]);
        }
        field1508 = 0;
        field1512[++field1508 - 1] = var1;
        field1505[var1] = 0;
        field1510 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3230(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1503[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1513[var7] = 0;
                field1509[var7] = -1;
                field1516[++field1510 - 1] = var7;
                field1505[var7] = 0;
            }
        }
        arg0.method3231();
    }

    @ObfuscatedName("ah.j(Lfn;II)V")
    public static final void method555(class181 arg0, int arg1) {
        int var2 = arg0.field2395;
        field1515 = 0;
        method2290(arg0);
        for (int var3 = 0; var3 < field1515; var3++) {
            int var4 = field1511[var3];
            class75 var5 = client.field1106[var4];
            int var6 = arg0.method2999();
            if ((var6 & 0x4) != 0) {
                var6 += arg0.method2999() << 8;
            }
            method3809(arg0, var4, var5, var6);
        }
        if (arg0.field2395 - var2 != arg1) {
            throw new RuntimeException(arg0.field2395 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("do.a(Lfn;I)V")
    public static final void method2290(class181 arg0) {
        int var1 = 0;
        arg0.method3226();
        for (int var2 = 0; var2 < field1508; var2++) {
            int var3 = field1512[var2];
            if ((field1505[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1505[var3] = (byte) (field1505[var3] | 0x2);
                } else {
                    int var4 = arg0.method3230(1);
                    if (var4 == 0) {
                        var1 = method652(arg0);
                        field1505[var3] = (byte) (field1505[var3] | 0x2);
                    } else {
                        method11(arg0, var3);
                    }
                }
            }
        }
        arg0.method3231();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3226();
        for (int var5 = 0; var5 < field1508; var5++) {
            int var6 = field1512[var5];
            if ((field1505[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1505[var6] = (byte) (field1505[var6] | 0x2);
                } else {
                    int var7 = arg0.method3230(1);
                    if (var7 == 0) {
                        var1 = method652(arg0);
                        field1505[var6] = (byte) (field1505[var6] | 0x2);
                    } else {
                        method11(arg0, var6);
                    }
                }
            }
        }
        arg0.method3231();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3226();
        for (int var8 = 0; var8 < field1510; var8++) {
            int var9 = field1516[var8];
            if ((field1505[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1505[var9] = (byte) (field1505[var9] | 0x2);
                } else {
                    int var10 = arg0.method3230(1);
                    if (var10 == 0) {
                        var1 = method652(arg0);
                        field1505[var9] = (byte) (field1505[var9] | 0x2);
                    } else if (method992(arg0, var9)) {
                        field1505[var9] = (byte) (field1505[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3231();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3226();
        for (int var11 = 0; var11 < field1510; var11++) {
            int var12 = field1516[var11];
            if ((field1505[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1505[var12] = (byte) (field1505[var12] | 0x2);
                } else {
                    int var13 = arg0.method3230(1);
                    if (var13 == 0) {
                        var1 = method652(arg0);
                        field1505[var12] = (byte) (field1505[var12] | 0x2);
                    } else if (method992(arg0, var12)) {
                        field1505[var12] = (byte) (field1505[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3231();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1508 = 0;
        field1510 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1505[var14] = (byte) (field1505[var14] >> 1);
            class75 var15 = client.field1106[var14];
            if (var15 == null) {
                field1516[++field1510 - 1] = var14;
            } else {
                field1512[++field1508 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("as.r(Lfn;B)I")
    public static int method652(class181 arg0) {
        int var1 = arg0.method3230(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3230(5);
        } else if (var1 == 2) {
            var2 = arg0.method3230(8);
        } else {
            var2 = arg0.method3230(11);
        }
        return var2;
    }

    @ObfuscatedName("n.o(Lfn;II)V")
    public static void method11(class181 arg0, int arg1) {
        boolean var2 = arg0.method3230(1) == 1;
        if (var2) {
            field1511[++field1515 - 1] = arg1;
        }
        int var3 = arg0.method3230(2);
        class75 var4 = client.field1106[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field910 = false;
            } else if (client.field1028 == arg1) {
                throw new RuntimeException();
            } else {
                field1503[arg1] = (Statics.field840 + var4.field1242[0] >> 13) + (Statics.field2202 + var4.field1248[0] >> 13 << 14) + (var4.field911 << 28);
                if (var4.field1258 == -1) {
                    field1513[arg1] = var4.field1281;
                } else {
                    field1513[arg1] = var4.field1258;
                }
                field1509[arg1] = var4.field1256;
                client.field1106[arg1] = null;
                if (arg0.method3230(1) != 0) {
                    method992(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3230(3);
            int var6 = var4.field1248[0];
            int var7 = var4.field1242[0];
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
            if (client.field1028 == arg1 && var4.field1233 < 1536 || var4.field1232 < 1536 || var4.field1233 >= 11776 || var4.field1232 >= 11776) {
                var4.method1040(var6, var7);
                var4.field910 = false;
            } else if (var2) {
                var4.field910 = true;
                var4.field906 = var6;
                var4.field927 = var7;
            } else {
                var4.field910 = false;
                var4.method1039(var6, var7, field1514[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3230(4);
            int var9 = var4.field1248[0];
            int var10 = var4.field1242[0];
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
            if (client.field1028 == arg1 && var4.field1233 < 1536 || var4.field1232 < 1536 || var4.field1233 >= 11776 || var4.field1232 >= 11776) {
                var4.method1040(var9, var10);
                var4.field910 = false;
            } else if (var2) {
                var4.field910 = true;
                var4.field906 = var9;
                var4.field927 = var10;
            } else {
                var4.field910 = false;
                var4.method1039(var9, var10, field1514[arg1]);
            }
        } else {
            int var11 = arg0.method3230(1);
            if (var11 == 0) {
                int var12 = arg0.method3230(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1248[0] + var14;
                int var17 = var4.field1242[0] + var15;
                if (client.field1028 == arg1 && var4.field1233 < 1536 || var4.field1232 < 1536 || var4.field1233 >= 11776 || var4.field1232 >= 11776) {
                    var4.method1040(var16, var17);
                    var4.field910 = false;
                } else if (var2) {
                    var4.field910 = true;
                    var4.field906 = var16;
                    var4.field927 = var17;
                } else {
                    var4.field910 = false;
                    var4.method1039(var16, var17, field1514[arg1]);
                }
                var4.field911 = (byte) (var4.field911 + var13 & 0x3);
                if (client.field1028 == arg1) {
                    Statics.field409 = var4.field911;
                }
            } else {
                int var18 = arg0.method3230(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2202 + var4.field1248[0] + var20 & 0x3FFF) - Statics.field2202;
                int var23 = (Statics.field840 + var4.field1242[0] + var21 & 0x3FFF) - Statics.field840;
                if (client.field1028 == arg1 && var4.field1233 < 1536 || var4.field1232 < 1536 || var4.field1233 >= 11776 || var4.field1232 >= 11776) {
                    var4.method1040(var22, var23);
                    var4.field910 = false;
                } else if (var2) {
                    var4.field910 = true;
                    var4.field906 = var22;
                    var4.field927 = var23;
                } else {
                    var4.field910 = false;
                    var4.method1039(var22, var23, field1514[arg1]);
                }
                var4.field911 = (byte) (var4.field911 + var19 & 0x3);
                if (client.field1028 == arg1) {
                    Statics.field409 = var4.field911;
                }
            }
        }
    }

    @ObfuscatedName("bh.n(Lfn;II)Z")
    public static boolean method992(class181 arg0, int arg1) {
        int var2 = arg0.method3230(2);
        if (var2 == 0) {
            if (arg0.method3230(1) != 0) {
                method992(arg0, arg1);
            }
            int var3 = arg0.method3230(13);
            int var4 = arg0.method3230(13);
            boolean var5 = arg0.method3230(1) == 1;
            if (var5) {
                field1511[++field1515 - 1] = arg1;
            }
            if (client.field1106[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field1106[arg1] = new class75();
            var6.field924 = arg1;
            if (field1507[arg1] != null) {
                var6.method1036(field1507[arg1]);
            }
            var6.field1281 = field1513[arg1];
            var6.field1256 = field1509[arg1];
            int var7 = field1503[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1287[0] = field1514[arg1];
            var6.field911 = (byte) var8;
            var6.method1040((var9 << 13) + var3 - Statics.field2202, (var10 << 13) + var4 - Statics.field840);
            var6.field910 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3230(2);
            int var12 = field1503[arg1];
            field1503[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3230(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1503[arg1];
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
            field1503[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3230(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1503[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1503[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("hr.q(Lfn;ILbo;II)V")
    public static final void method3809(class181 arg0, int arg1, class75 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x10) != 0) {
            int var5 = arg0.method2999();
            byte[] var6 = new byte[var5];
            class175 var7 = new class175(var6);
            arg0.method3005(var6, 0, var5);
            field1507[arg1] = var7;
            arg2.method1036(var7);
        }
        if ((arg3 & 0x40) != 0) {
            int var8 = arg0.method2995();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2999();
            client.method82(arg2, var8, var9);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1256 = arg0.method2995();
            if (arg2.field1256 == 65535) {
                arg2.field1256 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field1243 = arg0.method3002();
            if (arg2.field1243.charAt(0) == '~') {
                arg2.field1243 = arg2.field1243.substring(1);
                class98.method1380(2, arg2.field925, arg2.field1243);
            } else if (Statics.field908 == arg2) {
                class98.method1380(2, arg2.field925, arg2.field1243);
            }
            arg2.field1244 = false;
            arg2.field1247 = 0;
            arg2.field1238 = 0;
            arg2.field1246 = 150;
        }
        if ((arg3 & 0x8) != 0) {
            int var10 = arg0.method2999();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method3007();
                    if (var15 == 32767) {
                        var15 = arg0.method3007();
                        var13 = arg0.method3007();
                        var12 = arg0.method3007();
                        var14 = arg0.method3007();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method3007();
                    }
                    int var16 = arg0.method3007();
                    arg2.method1387(var15, var13, var12, var14, client.field973, var16);
                }
            }
            int var17 = arg0.method2999();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method3007();
                    int var20 = arg0.method3007();
                    if (var20 == 32767) {
                        arg2.method1389(var19);
                    } else {
                        int var21 = arg0.method3007();
                        int var22 = arg0.method2999();
                        int var23 = var20 > 0 ? arg0.method2999() : var22;
                        arg2.method1386(var19, client.field973, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1258 = arg0.method2995();
            if (arg2.field1284 == 0) {
                arg2.field1281 = arg2.field1258;
                arg2.field1258 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            int var24 = arg0.method2995();
            class232[] var25 = new class232[] { class232.field3176, class232.field3175, class232.field3178, class232.field3180, class232.field3179, class232.field3182 };
            class232 var26 = (class232) class170.method1570(var25, arg0.method2999());
            boolean var27 = arg0.method2999() == 1;
            int var28 = arg0.method2999();
            int var29 = arg0.field2395;
            if (arg2.field925 != null && arg2.field902 != null) {
                boolean var30 = false;
                if (var26.field3184 && client.method187(arg2.field925)) {
                    var30 = true;
                }
                if (!var30 && client.field1051 == 0 && !arg2.field926) {
                    field1517.field2395 = 0;
                    arg0.method3005(field1517.field2392, 0, var28);
                    field1517.field2395 = 0;
                    String var31 = class266.method4463(class272.method987(class267.method2898(field1517)));
                    arg2.field1243 = var31.trim();
                    arg2.field1247 = var24 >> 8;
                    arg2.field1238 = var24 & 0xFF;
                    arg2.field1246 = 150;
                    arg2.field1244 = var27;
                    arg2.field1245 = Statics.field908 != arg2 && var26.field3184 && client.field1151 != "" && var31.toLowerCase().indexOf(client.field1151) == -1;
                    int var32;
                    if (var26.field3183) {
                        var32 = var27 ? 91 : 1;
                    } else {
                        var32 = var27 ? 90 : 2;
                    }
                    if (var26.field3177 == -1) {
                        class98.method1380(var32, arg2.field925, var31);
                    } else {
                        int var34 = var26.field3177;
                        String var35 = "<img=" + var34 + ">";
                        class98.method1380(var32, var35 + arg2.field925, var31);
                    }
                }
            }
            arg0.field2395 = var28 + var29;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1267 = arg0.method2995();
            int var36 = arg0.method2998();
            arg2.field1271 = var36 >> 16;
            arg2.field1270 = (var36 & 0xFFFF) + client.field973;
            arg2.field1268 = 0;
            arg2.field1241 = 0;
            if (arg2.field1270 > client.field973) {
                arg2.field1268 = -1;
            }
            if (arg2.field1267 == 65535) {
                arg2.field1267 = -1;
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1272 = arg0.method3172();
            arg2.field1230 = arg0.method3172();
            arg2.field1240 = arg0.method3172();
            arg2.field1275 = arg0.method3172();
            arg2.field1276 = arg0.method2995() + client.field973;
            arg2.field1277 = arg0.method2995() + client.field973;
            arg2.field1278 = arg0.method2995();
            if (arg2.field910) {
                arg2.field1272 += arg2.field906;
                arg2.field1230 += arg2.field927;
                arg2.field1240 += arg2.field906;
                arg2.field1275 += arg2.field927;
                arg2.field1284 = 0;
            } else {
                arg2.field1272 += arg2.field1248[0];
                arg2.field1230 += arg2.field1242[0];
                arg2.field1240 += arg2.field1248[0];
                arg2.field1275 += arg2.field1242[0];
                arg2.field1284 = 1;
            }
            arg2.field1250 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            field1514[arg1] = arg0.method3172();
        }
        if ((arg3 & 0x800) != 0) {
            var4 = arg0.method3172();
        }
        if ((arg3 & 0x100) != 0) {
            for (int var37 = 0; var37 < 3; var37++) {
                arg2.field905[var37] = arg0.method3002();
            }
        }
        if (!arg2.field910) {
            return;
        }
        if (var4 == 127) {
            arg2.method1040(arg2.field906, arg2.field927);
            return;
        }
        byte var38;
        if (var4 == -1) {
            var38 = field1514[arg1];
        } else {
            var38 = var4;
        }
        arg2.method1039(arg2.field906, arg2.field927, var38);
    }
}

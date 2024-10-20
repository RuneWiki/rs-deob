package deob;

@ObfuscatedName("cm")
public class class97 {

    @ObfuscatedName("cm.f")
    public static byte[] field1485 = new byte[2048];

    @ObfuscatedName("cm.m")
    public static byte[] field1489 = new byte[2048];

    @ObfuscatedName("cm.h")
    public static class177[] field1487 = new class177[2048];

    @ObfuscatedName("cm.t")
    public static int field1488 = 0;

    @ObfuscatedName("cm.p")
    public static int[] field1491 = new int[2048];

    @ObfuscatedName("cm.d")
    public static int field1490 = 0;

    @ObfuscatedName("cm.n")
    public static int[] field1502 = new int[2048];

    @ObfuscatedName("cm.z")
    public static int[] field1501 = new int[2048];

    @ObfuscatedName("cm.o")
    public static int[] field1495 = new int[2048];

    @ObfuscatedName("cm.q")
    public static int[] field1494 = new int[2048];

    @ObfuscatedName("cm.u")
    public static int field1500 = 0;

    @ObfuscatedName("cm.k")
    public static int[] field1492 = new int[2048];

    @ObfuscatedName("cm.e")
    public static class177 field1497 = new class177(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.s(Lgd;I)V")
    public static final void method579(class183 arg0) {
        arg0.method3197();
        int var1 = client.field1037;
        class75 var2 = Statics.field300 = client.field970[var1] = new class75();
        var2.field902 = var1;
        int var3 = arg0.method3198(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1279[0] = var5 - Statics.field590;
        var2.field1282 = (var2.field1279[0] << 7) + (var2.method1007() << 6);
        var2.field1280[0] = var6 - Statics.field617;
        var2.field1225 = (var2.field1280[0] << 7) + (var2.method1007() << 6);
        Statics.field2342 = var2.field894 = var4;
        if (field1487[var1] != null) {
            var2.method1030(field1487[var1]);
        }
        field1488 = 0;
        field1491[++field1488 - 1] = var1;
        field1485[var1] = 0;
        field1490 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3198(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1501[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1495[var7] = 0;
                field1494[var7] = -1;
                field1502[++field1490 - 1] = var7;
                field1485[var7] = 0;
            }
        }
        arg0.method3199();
    }

    @ObfuscatedName("fa.c(Lgd;II)V")
    public static final void method2783(class183 arg0, int arg1) {
        int var2 = arg0.field2402;
        field1500 = 0;
        method324(arg0);
        for (int var3 = 0; var3 < field1500; var3++) {
            int var4 = field1492[var3];
            class75 var5 = client.field970[var4];
            int var6 = arg0.method2965();
            if ((var6 & 0x8) != 0) {
                var6 += arg0.method2965() << 8;
            }
            method2519(arg0, var4, var5, var6);
        }
        if (arg0.field2402 - var2 != arg1) {
            throw new RuntimeException(arg0.field2402 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("aj.f(Lgd;I)V")
    public static final void method324(class183 arg0) {
        int var1 = 0;
        arg0.method3197();
        for (int var2 = 0; var2 < field1488; var2++) {
            int var3 = field1491[var2];
            if ((field1485[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1485[var3] = (byte) (field1485[var3] | 0x2);
                } else {
                    int var4 = arg0.method3198(1);
                    if (var4 == 0) {
                        var1 = method1762(arg0);
                        field1485[var3] = (byte) (field1485[var3] | 0x2);
                    } else {
                        method1590(arg0, var3);
                    }
                }
            }
        }
        arg0.method3199();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3197();
        for (int var5 = 0; var5 < field1488; var5++) {
            int var6 = field1491[var5];
            if ((field1485[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1485[var6] = (byte) (field1485[var6] | 0x2);
                } else {
                    int var7 = arg0.method3198(1);
                    if (var7 == 0) {
                        var1 = method1762(arg0);
                        field1485[var6] = (byte) (field1485[var6] | 0x2);
                    } else {
                        method1590(arg0, var6);
                    }
                }
            }
        }
        arg0.method3199();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3197();
        for (int var8 = 0; var8 < field1490; var8++) {
            int var9 = field1502[var8];
            if ((field1485[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1485[var9] = (byte) (field1485[var9] | 0x2);
                } else {
                    int var10 = arg0.method3198(1);
                    if (var10 == 0) {
                        var1 = method1762(arg0);
                        field1485[var9] = (byte) (field1485[var9] | 0x2);
                    } else if (method241(arg0, var9)) {
                        field1485[var9] = (byte) (field1485[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3199();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3197();
        for (int var11 = 0; var11 < field1490; var11++) {
            int var12 = field1502[var11];
            if ((field1485[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1485[var12] = (byte) (field1485[var12] | 0x2);
                } else {
                    int var13 = arg0.method3198(1);
                    if (var13 == 0) {
                        var1 = method1762(arg0);
                        field1485[var12] = (byte) (field1485[var12] | 0x2);
                    } else if (method241(arg0, var12)) {
                        field1485[var12] = (byte) (field1485[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3199();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1488 = 0;
        field1490 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1485[var14] = (byte) (field1485[var14] >> 1);
            class75 var15 = client.field970[var14];
            if (var15 == null) {
                field1502[++field1490 - 1] = var14;
            } else {
                field1491[++field1488 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("ca.m(Lgd;B)I")
    public static int method1762(class183 arg0) {
        int var1 = arg0.method3198(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3198(5);
        } else if (var1 == 2) {
            var2 = arg0.method3198(8);
        } else {
            var2 = arg0.method3198(11);
        }
        return var2;
    }

    @ObfuscatedName("cw.h(Lgd;IB)V")
    public static void method1590(class183 arg0, int arg1) {
        boolean var2 = arg0.method3198(1) == 1;
        if (var2) {
            field1492[++field1500 - 1] = arg1;
        }
        int var3 = arg0.method3198(2);
        class75 var4 = client.field970[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field903 = false;
            } else if (client.field1037 == arg1) {
                throw new RuntimeException();
            } else {
                field1501[arg1] = (Statics.field617 + var4.field1280[0] >> 13) + (Statics.field590 + var4.field1279[0] >> 13 << 14) + (var4.field894 << 28);
                if (var4.field1234 == -1) {
                    field1495[arg1] = var4.field1275;
                } else {
                    field1495[arg1] = var4.field1234;
                }
                field1494[arg1] = var4.field1250;
                client.field970[arg1] = null;
                if (arg0.method3198(1) != 0) {
                    method241(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3198(3);
            int var6 = var4.field1279[0];
            int var7 = var4.field1280[0];
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
            if (client.field1037 == arg1 && var4.field1282 < 1536 || var4.field1225 < 1536 || var4.field1282 >= 11776 || var4.field1225 >= 11776) {
                var4.method1012(var6, var7);
                var4.field903 = false;
            } else if (var2) {
                var4.field903 = true;
                var4.field904 = var6;
                var4.field905 = var7;
            } else {
                var4.field903 = false;
                var4.method1011(var6, var7, field1489[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3198(4);
            int var9 = var4.field1279[0];
            int var10 = var4.field1280[0];
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
            if (client.field1037 == arg1 && var4.field1282 < 1536 || var4.field1225 < 1536 || var4.field1282 >= 11776 || var4.field1225 >= 11776) {
                var4.method1012(var9, var10);
                var4.field903 = false;
            } else if (var2) {
                var4.field903 = true;
                var4.field904 = var9;
                var4.field905 = var10;
            } else {
                var4.field903 = false;
                var4.method1011(var9, var10, field1489[arg1]);
            }
        } else {
            int var11 = arg0.method3198(1);
            if (var11 == 0) {
                int var12 = arg0.method3198(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1279[0] + var14;
                int var17 = var4.field1280[0] + var15;
                if (client.field1037 == arg1 && var4.field1282 < 1536 || var4.field1225 < 1536 || var4.field1282 >= 11776 || var4.field1225 >= 11776) {
                    var4.method1012(var16, var17);
                    var4.field903 = false;
                } else if (var2) {
                    var4.field903 = true;
                    var4.field904 = var16;
                    var4.field905 = var17;
                } else {
                    var4.field903 = false;
                    var4.method1011(var16, var17, field1489[arg1]);
                }
                var4.field894 = (byte) (var4.field894 + var13 & 0x3);
                if (client.field1037 == arg1) {
                    Statics.field2342 = var4.field894;
                }
            } else {
                int var18 = arg0.method3198(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field590 + var4.field1279[0] + var20 & 0x3FFF) - Statics.field590;
                int var23 = (Statics.field617 + var4.field1280[0] + var21 & 0x3FFF) - Statics.field617;
                if (client.field1037 == arg1 && var4.field1282 < 1536 || var4.field1225 < 1536 || var4.field1282 >= 11776 || var4.field1225 >= 11776) {
                    var4.method1012(var22, var23);
                    var4.field903 = false;
                } else if (var2) {
                    var4.field903 = true;
                    var4.field904 = var22;
                    var4.field905 = var23;
                } else {
                    var4.field903 = false;
                    var4.method1011(var22, var23, field1489[arg1]);
                }
                var4.field894 = (byte) (var4.field894 + var19 & 0x3);
                if (client.field1037 == arg1) {
                    Statics.field2342 = var4.field894;
                }
            }
        }
    }

    @ObfuscatedName("am.t(Lgd;IB)Z")
    public static boolean method241(class183 arg0, int arg1) {
        int var2 = arg0.method3198(2);
        if (var2 == 0) {
            if (arg0.method3198(1) != 0) {
                method241(arg0, arg1);
            }
            int var3 = arg0.method3198(13);
            int var4 = arg0.method3198(13);
            boolean var5 = arg0.method3198(1) == 1;
            if (var5) {
                field1492[++field1500 - 1] = arg1;
            }
            if (client.field970[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field970[arg1] = new class75();
            var6.field902 = arg1;
            if (field1487[arg1] != null) {
                var6.method1030(field1487[arg1]);
            }
            var6.field1275 = field1495[arg1];
            var6.field1250 = field1494[arg1];
            int var7 = field1501[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1235[0] = field1489[arg1];
            var6.field894 = (byte) var8;
            var6.method1012((var9 << 13) + var3 - Statics.field590, (var10 << 13) + var4 - Statics.field617);
            var6.field903 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3198(2);
            int var12 = field1501[arg1];
            field1501[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3198(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1501[arg1];
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
            field1501[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3198(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1501[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1501[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("em.p(Lgd;ILbo;IB)V")
    public static final void method2519(class183 arg0, int arg1, class75 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x40) != 0) {
            int var5 = arg0.method2965();
            byte[] var6 = new byte[var5];
            class177 var7 = new class177(var6);
            arg0.method3065(var6, 0, var5);
            field1487[arg1] = var7;
            arg2.method1030(var7);
        }
        if ((arg3 & 0x1) != 0) {
            int var8 = arg0.method2967();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2965();
            client.method948(arg2, var8, var9);
        }
        if ((arg3 & 0x4) != 0) {
            arg2.field1250 = arg0.method2967();
            if (arg2.field1250 == 65535) {
                arg2.field1250 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            arg2.field1237 = arg0.method2973();
            if (arg2.field1237.charAt(0) == '~') {
                arg2.field1237 = arg2.field1237.substring(1);
                class99.method968(2, arg2.field891, arg2.field1237);
            } else if (Statics.field300 == arg2) {
                class99.method968(2, arg2.field891, arg2.field1237);
            }
            arg2.field1238 = false;
            arg2.field1263 = 0;
            arg2.field1281 = 0;
            arg2.field1251 = 150;
        }
        if ((arg3 & 0x80) != 0) {
            int var10 = arg0.method2965();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2978();
                    if (var15 == 32767) {
                        var15 = arg0.method2978();
                        var13 = arg0.method2978();
                        var12 = arg0.method2978();
                        var14 = arg0.method2978();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2978();
                    }
                    int var16 = arg0.method2978();
                    arg2.method1397(var15, var13, var12, var14, client.field948, var16);
                }
            }
            int var17 = arg0.method2965();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2978();
                    int var20 = arg0.method2978();
                    if (var20 == 32767) {
                        arg2.method1399(var19);
                    } else {
                        int var21 = arg0.method2978();
                        int var22 = arg0.method2965();
                        int var23 = var20 > 0 ? arg0.method2965() : var22;
                        arg2.method1398(var19, client.field948, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1234 = arg0.method2967();
            if (arg2.field1278 == 0) {
                arg2.field1275 = arg2.field1234;
                arg2.field1234 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var24 = arg0.method2967();
            class234[] var25 = new class234[] { class234.field3193, class234.field3195, class234.field3199, class234.field3202, class234.field3194, class234.field3192 };
            class234 var26 = (class234) class172.method1577(var25, arg0.method2965());
            boolean var27 = arg0.method2965() == 1;
            int var28 = arg0.method2965();
            int var29 = arg0.field2402;
            if (arg2.field891 != null && arg2.field898 != null) {
                boolean var30 = false;
                if (var26.field3200 && client.method4625(arg2.field891)) {
                    var30 = true;
                }
                if (!var30 && client.field1035 == 0 && !arg2.field900) {
                    field1497.field2402 = 0;
                    arg0.method3065(field1497.field2403, 0, var28);
                    field1497.field2402 = 0;
                    String var31 = class268.method4486(class274.method3483(class269.method1407(field1497)));
                    arg2.field1237 = var31.trim();
                    arg2.field1263 = var24 >> 8;
                    arg2.field1281 = var24 & 0xFF;
                    arg2.field1251 = 150;
                    arg2.field1238 = var27;
                    arg2.field1245 = Statics.field300 != arg2 && var26.field3200 && client.field1134 != "" && var31.toLowerCase().indexOf(client.field1134) == -1;
                    int var32;
                    if (var26.field3196) {
                        var32 = var27 ? 91 : 1;
                    } else {
                        var32 = var27 ? 90 : 2;
                    }
                    if (var26.field3198 == -1) {
                        class99.method968(var32, arg2.field891, var31);
                    } else {
                        class99.method968(var32, class89.method3799(var26.field3198) + arg2.field891, var31);
                    }
                }
            }
            arg0.field2402 = var28 + var29;
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1254 = arg0.method2967();
            int var33 = arg0.method2970();
            arg2.field1265 = var33 >> 16;
            arg2.field1264 = (var33 & 0xFFFF) + client.field948;
            arg2.field1262 = 0;
            arg2.field1231 = 0;
            if (arg2.field1264 > client.field948) {
                arg2.field1262 = -1;
            }
            if (arg2.field1254 == 65535) {
                arg2.field1254 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1261 = arg0.method2966();
            arg2.field1248 = arg0.method2966();
            arg2.field1267 = arg0.method2966();
            arg2.field1224 = arg0.method2966();
            arg2.field1270 = arg0.method2967() + client.field948;
            arg2.field1240 = arg0.method2967() + client.field948;
            arg2.field1272 = arg0.method2967();
            if (arg2.field903) {
                arg2.field1261 += arg2.field904;
                arg2.field1248 += arg2.field905;
                arg2.field1267 += arg2.field904;
                arg2.field1224 += arg2.field905;
                arg2.field1278 = 0;
            } else {
                arg2.field1261 += arg2.field1279[0];
                arg2.field1248 += arg2.field1280[0];
                arg2.field1267 += arg2.field1279[0];
                arg2.field1224 += arg2.field1280[0];
                arg2.field1278 = 1;
            }
            arg2.field1283 = 0;
        }
        if ((arg3 & 0x1000) != 0) {
            field1489[arg1] = arg0.method2966();
        }
        if ((arg3 & 0x400) != 0) {
            var4 = arg0.method2966();
        }
        if ((arg3 & 0x100) != 0) {
            for (int var34 = 0; var34 < 3; var34++) {
                arg2.field884[var34] = arg0.method2973();
            }
        }
        if (!arg2.field903) {
            return;
        }
        if (var4 == 127) {
            arg2.method1012(arg2.field904, arg2.field905);
            return;
        }
        byte var35;
        if (var4 == -1) {
            var35 = field1489[arg1];
        } else {
            var35 = var4;
        }
        arg2.method1011(arg2.field904, arg2.field905, var35);
    }
}

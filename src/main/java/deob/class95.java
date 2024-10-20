package deob;

@ObfuscatedName("cq")
public class class95 {

    @ObfuscatedName("cq.q")
    public static byte[] field1498 = new byte[2048];

    @ObfuscatedName("cq.o")
    public static byte[] field1488 = new byte[2048];

    @ObfuscatedName("cq.g")
    public static class174[] field1489 = new class174[2048];

    @ObfuscatedName("cq.v")
    public static int field1500 = 0;

    @ObfuscatedName("cq.p")
    public static int[] field1491 = new int[2048];

    @ObfuscatedName("cq.e")
    public static int field1492 = 0;

    @ObfuscatedName("cq.d")
    public static int[] field1493 = new int[2048];

    @ObfuscatedName("cq.x")
    public static int[] field1494 = new int[2048];

    @ObfuscatedName("cq.z")
    public static int[] field1495 = new int[2048];

    @ObfuscatedName("cq.n")
    public static int[] field1496 = new int[2048];

    @ObfuscatedName("cq.u")
    public static int field1497 = 0;

    @ObfuscatedName("cq.t")
    public static int[] field1487 = new int[2048];

    @ObfuscatedName("cq.a")
    public static class174 field1485 = new class174(new byte[5000]);

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("n.w(Lfg;I)V")
    public static final void method50(class180 arg0) {
        arg0.method3238();
        int var1 = client.field1036;
        class74 var2 = Statics.field832 = client.field1035[var1] = new class74();
        var2.field914 = var1;
        int var3 = arg0.method3239(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1265[0] = var5 - Statics.field352;
        var2.field1225 = (var2.field1265[0] << 7) + (var2.method1029() << 6);
        var2.field1266[0] = var6 - Statics.field3706;
        var2.field1211 = (var2.field1266[0] << 7) + (var2.method1029() << 6);
        Statics.field609 = var2.field909 = var4;
        if (field1489[var1] != null) {
            var2.method1033(field1489[var1]);
        }
        field1500 = 0;
        field1491[++field1500 - 1] = var1;
        field1498[var1] = 0;
        field1492 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3239(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1494[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1495[var7] = 0;
                field1496[var7] = -1;
                field1493[++field1492 - 1] = var7;
                field1498[var7] = 0;
            }
        }
        arg0.method3255();
    }

    @ObfuscatedName("ce.s(Lfg;IB)V")
    public static final void method1551(class180 arg0, int arg1) {
        int var2 = arg0.field2390;
        field1497 = 0;
        method1049(arg0);
        for (int var3 = 0; var3 < field1497; var3++) {
            int var4 = field1487[var3];
            class74 var5 = client.field1035[var4];
            int var6 = arg0.method2971();
            if ((var6 & 0x1) != 0) {
                var6 += arg0.method2971() << 8;
            }
            byte var7 = -1;
            if ((var6 & 0x40) != 0) {
                int var8 = arg0.method2971();
                byte[] var9 = new byte[var8];
                class174 var10 = new class174(var9);
                arg0.method3022(var9, 0, var8);
                field1489[var4] = var10;
                var5.method1033(var10);
            }
            if ((var6 & 0x200) != 0) {
                var5.field1252 = arg0.method3003();
                var5.field1212 = arg0.method3004();
                var5.field1253 = arg0.method3002();
                var5.field1255 = arg0.method3002();
                var5.field1241 = arg0.method3178() + client.field933;
                var5.field1257 = arg0.method3178() + client.field933;
                var5.field1258 = arg0.method3010();
                if (var5.field887) {
                    var5.field1252 += var5.field912;
                    var5.field1212 += var5.field900;
                    var5.field1253 += var5.field912;
                    var5.field1255 += var5.field900;
                    var5.field1264 = 0;
                } else {
                    var5.field1252 += var5.field1265[0];
                    var5.field1212 += var5.field1266[0];
                    var5.field1253 += var5.field1265[0];
                    var5.field1255 += var5.field1266[0];
                    var5.field1264 = 1;
                }
                var5.field1214 = 0;
            }
            if ((var6 & 0x10) != 0) {
                var5.field1223 = arg0.method3111();
                if (var5.field1223.charAt(0) == '~') {
                    var5.field1223 = var5.field1223.substring(1);
                    class97.method3203(2, var5.field913, var5.field1223);
                } else if (Statics.field832 == var5) {
                    class97.method3203(2, var5.field913, var5.field1223);
                }
                var5.field1224 = false;
                var5.field1227 = 0;
                var5.field1248 = 0;
                var5.field1226 = 150;
            }
            if ((var6 & 0x4) != 0) {
                int var11 = arg0.method3010();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg0.method2971();
                client.method25(var5, var11, var12);
            }
            if ((var6 & 0x100) != 0) {
                var7 = arg0.method3002();
            }
            if ((var6 & 0x20) != 0) {
                var5.field1250 = arg0.method3178();
                if (var5.field1264 == 0) {
                    var5.field1261 = var5.field1250;
                    var5.field1250 = -1;
                }
            }
            if ((var6 & 0x1000) != 0) {
                var5.field1215 = arg0.method3009();
                int var13 = arg0.method3018();
                var5.field1251 = var13 >> 16;
                var5.field1247 = (var13 & 0xFFFF) + client.field933;
                var5.field1216 = 0;
                var5.field1249 = 0;
                if (var5.field1247 > client.field933) {
                    var5.field1216 = -1;
                }
                if (var5.field1215 == 65535) {
                    var5.field1215 = -1;
                }
            }
            if ((var6 & 0x8) != 0) {
                int var14 = arg0.method3009();
                class231[] var15 = new class231[] { class231.field3172, class231.field3171, class231.field3175, class231.field3179, class231.field3174, class231.field3178 };
                class231 var16 = (class231) class169.method233(var15, arg0.method2971());
                boolean var17 = arg0.method2971() == 1;
                int var18 = arg0.method2999();
                int var19 = arg0.field2390;
                if (var5.field913 != null && var5.field888 != null) {
                    boolean var20 = false;
                    if (var16.field3173 && client.method999(var5.field913)) {
                        var20 = true;
                    }
                    if (!var20 && client.field1034 == 0 && !var5.field908) {
                        field1485.field2390 = 0;
                        arg0.method3021(field1485.field2389, 0, var18);
                        field1485.field2390 = 0;
                        String var21 = class265.method4522(class271.method1574(class266.method8(field1485)));
                        var5.field1223 = var21.trim();
                        var5.field1227 = var14 >> 8;
                        var5.field1248 = var14 & 0xFF;
                        var5.field1226 = 150;
                        var5.field1224 = var17;
                        var5.field1233 = Statics.field832 != var5 && var16.field3173 && client.field991 != "" && var21.toLowerCase().indexOf(client.field991) == -1;
                        int var22;
                        if (var16.field3180) {
                            var22 = var17 ? 91 : 1;
                        } else {
                            var22 = var17 ? 90 : 2;
                        }
                        if (var16.field3177 == -1) {
                            class97.method3203(var22, var5.field913, var21);
                        } else {
                            class97.method3203(var22, Statics.method3220(var16.field3177) + var5.field913, var21);
                        }
                    }
                }
                arg0.field2390 = var18 + var19;
            }
            if ((var6 & 0x800) != 0) {
                field1488[var4] = arg0.method3002();
            }
            if ((var6 & 0x2) != 0) {
                int var23 = arg0.method3000();
                if (var23 > 0) {
                    for (int var24 = 0; var24 < var23; var24++) {
                        int var25 = -1;
                        int var26 = -1;
                        int var27 = -1;
                        int var28 = arg0.method2985();
                        if (var28 == 32767) {
                            var28 = arg0.method2985();
                            var26 = arg0.method2985();
                            var25 = arg0.method2985();
                            var27 = arg0.method2985();
                        } else if (var28 == 32766) {
                            var28 = -1;
                        } else {
                            var26 = arg0.method2985();
                        }
                        int var29 = arg0.method2985();
                        var5.method1415(var28, var26, var25, var27, client.field933, var29);
                    }
                }
                int var30 = arg0.method2999();
                if (var30 > 0) {
                    for (int var31 = 0; var31 < var30; var31++) {
                        int var32 = arg0.method2985();
                        int var33 = arg0.method2985();
                        if (var33 == 32767) {
                            var5.method1418(var32);
                        } else {
                            int var34 = arg0.method2985();
                            int var35 = arg0.method2999();
                            int var36 = var33 > 0 ? arg0.method2999() : var35;
                            var5.method1416(var32, client.field933, var33, var34, var35, var36);
                        }
                    }
                }
            }
            if ((var6 & 0x80) != 0) {
                var5.field1236 = arg0.method3009();
                if (var5.field1236 == 65535) {
                    var5.field1236 = -1;
                }
            }
            if ((var6 & 0x400) != 0) {
                for (int var37 = 0; var37 < 3; var37++) {
                    var5.field892[var37] = arg0.method3111();
                }
            }
            if (var5.field887) {
                if (var7 == 127) {
                    var5.method1027(var5.field912, var5.field900);
                } else {
                    byte var38;
                    if (var7 == -1) {
                        var38 = field1488[var4];
                    } else {
                        var38 = var7;
                    }
                    var5.method1031(var5.field912, var5.field900, var38);
                }
            }
        }
        if (arg0.field2390 - var2 != arg1) {
            throw new RuntimeException(arg0.field2390 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("bk.q(Lfg;I)V")
    public static final void method1049(class180 arg0) {
        int var1 = 0;
        arg0.method3238();
        for (int var2 = 0; var2 < field1500; var2++) {
            int var3 = field1491[var2];
            if ((field1498[var3] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1498[var3] = (byte) (field1498[var3] | 0x2);
                } else {
                    int var4 = arg0.method3239(1);
                    if (var4 == 0) {
                        var1 = method1760(arg0);
                        field1498[var3] = (byte) (field1498[var3] | 0x2);
                    } else {
                        method2433(arg0, var3);
                    }
                }
            }
        }
        arg0.method3255();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3238();
        for (int var5 = 0; var5 < field1500; var5++) {
            int var6 = field1491[var5];
            if ((field1498[var6] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1498[var6] = (byte) (field1498[var6] | 0x2);
                } else {
                    int var7 = arg0.method3239(1);
                    if (var7 == 0) {
                        var1 = method1760(arg0);
                        field1498[var6] = (byte) (field1498[var6] | 0x2);
                    } else {
                        method2433(arg0, var6);
                    }
                }
            }
        }
        arg0.method3255();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3238();
        for (int var8 = 0; var8 < field1492; var8++) {
            int var9 = field1493[var8];
            if ((field1498[var9] & 0x1) != 0) {
                if (var1 > 0) {
                    var1--;
                    field1498[var9] = (byte) (field1498[var9] | 0x2);
                } else {
                    int var10 = arg0.method3239(1);
                    if (var10 == 0) {
                        var1 = method1760(arg0);
                        field1498[var9] = (byte) (field1498[var9] | 0x2);
                    } else if (method2901(arg0, var9)) {
                        field1498[var9] = (byte) (field1498[var9] | 0x2);
                    }
                }
            }
        }
        arg0.method3255();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        arg0.method3238();
        for (int var11 = 0; var11 < field1492; var11++) {
            int var12 = field1493[var11];
            if ((field1498[var12] & 0x1) == 0) {
                if (var1 > 0) {
                    var1--;
                    field1498[var12] = (byte) (field1498[var12] | 0x2);
                } else {
                    int var13 = arg0.method3239(1);
                    if (var13 == 0) {
                        var1 = method1760(arg0);
                        field1498[var12] = (byte) (field1498[var12] | 0x2);
                    } else if (method2901(arg0, var12)) {
                        field1498[var12] = (byte) (field1498[var12] | 0x2);
                    }
                }
            }
        }
        arg0.method3255();
        if (var1 != 0) {
            throw new RuntimeException();
        }
        field1500 = 0;
        field1492 = 0;
        for (int var14 = 1; var14 < 2048; var14++) {
            field1498[var14] = (byte) (field1498[var14] >> 1);
            class74 var15 = client.field1035[var14];
            if (var15 == null) {
                field1493[++field1492 - 1] = var14;
            } else {
                field1491[++field1500 - 1] = var14;
            }
        }
    }

    @ObfuscatedName("ct.o(Lfg;I)I")
    public static int method1760(class180 arg0) {
        int var1 = arg0.method3239(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3239(5);
        } else if (var1 == 2) {
            var2 = arg0.method3239(8);
        } else {
            var2 = arg0.method3239(11);
        }
        return var2;
    }

    @ObfuscatedName("ea.g(Lfg;II)V")
    public static void method2433(class180 arg0, int arg1) {
        boolean var2 = arg0.method3239(1) == 1;
        if (var2) {
            field1487[++field1497 - 1] = arg1;
        }
        int var3 = arg0.method3239(2);
        class74 var4 = client.field1035[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field887 = false;
            } else if (client.field1036 == arg1) {
                throw new RuntimeException();
            } else {
                field1494[arg1] = (Statics.field3706 + var4.field1266[0] >> 13) + (Statics.field352 + var4.field1265[0] >> 13 << 14) + (var4.field909 << 28);
                if (var4.field1250 == -1) {
                    field1495[arg1] = var4.field1261;
                } else {
                    field1495[arg1] = var4.field1250;
                }
                field1496[arg1] = var4.field1236;
                client.field1035[arg1] = null;
                if (arg0.method3239(1) != 0) {
                    method2901(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3239(3);
            int var6 = var4.field1265[0];
            int var7 = var4.field1266[0];
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
            if (client.field1036 == arg1 && var4.field1225 < 1536 || var4.field1211 < 1536 || var4.field1225 >= 11776 || var4.field1211 >= 11776) {
                var4.method1027(var6, var7);
                var4.field887 = false;
            } else if (var2) {
                var4.field887 = true;
                var4.field912 = var6;
                var4.field900 = var7;
            } else {
                var4.field887 = false;
                var4.method1031(var6, var7, field1488[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3239(4);
            int var9 = var4.field1265[0];
            int var10 = var4.field1266[0];
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
            if (client.field1036 == arg1 && var4.field1225 < 1536 || var4.field1211 < 1536 || var4.field1225 >= 11776 || var4.field1211 >= 11776) {
                var4.method1027(var9, var10);
                var4.field887 = false;
            } else if (var2) {
                var4.field887 = true;
                var4.field912 = var9;
                var4.field900 = var10;
            } else {
                var4.field887 = false;
                var4.method1031(var9, var10, field1488[arg1]);
            }
        } else {
            int var11 = arg0.method3239(1);
            if (var11 == 0) {
                int var12 = arg0.method3239(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1265[0] + var14;
                int var17 = var4.field1266[0] + var15;
                if (client.field1036 == arg1 && var4.field1225 < 1536 || var4.field1211 < 1536 || var4.field1225 >= 11776 || var4.field1211 >= 11776) {
                    var4.method1027(var16, var17);
                    var4.field887 = false;
                } else if (var2) {
                    var4.field887 = true;
                    var4.field912 = var16;
                    var4.field900 = var17;
                } else {
                    var4.field887 = false;
                    var4.method1031(var16, var17, field1488[arg1]);
                }
                var4.field909 = (byte) (var4.field909 + var13 & 0x3);
                if (client.field1036 == arg1) {
                    Statics.field609 = var4.field909;
                }
            } else {
                int var18 = arg0.method3239(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field352 + var4.field1265[0] + var20 & 0x3FFF) - Statics.field352;
                int var23 = (Statics.field3706 + var4.field1266[0] + var21 & 0x3FFF) - Statics.field3706;
                if (client.field1036 == arg1 && var4.field1225 < 1536 || var4.field1211 < 1536 || var4.field1225 >= 11776 || var4.field1211 >= 11776) {
                    var4.method1027(var22, var23);
                    var4.field887 = false;
                } else if (var2) {
                    var4.field887 = true;
                    var4.field912 = var22;
                    var4.field900 = var23;
                } else {
                    var4.field887 = false;
                    var4.method1031(var22, var23, field1488[arg1]);
                }
                var4.field909 = (byte) (var4.field909 + var19 & 0x3);
                if (client.field1036 == arg1) {
                    Statics.field609 = var4.field909;
                }
            }
        }
    }

    @ObfuscatedName("fo.v(Lfg;II)Z")
    public static boolean method2901(class180 arg0, int arg1) {
        int var2 = arg0.method3239(2);
        if (var2 == 0) {
            if (arg0.method3239(1) != 0) {
                method2901(arg0, arg1);
            }
            int var3 = arg0.method3239(13);
            int var4 = arg0.method3239(13);
            boolean var5 = arg0.method3239(1) == 1;
            if (var5) {
                field1487[++field1497 - 1] = arg1;
            }
            if (client.field1035[arg1] != null) {
                throw new RuntimeException();
            }
            class74 var6 = client.field1035[arg1] = new class74();
            var6.field914 = arg1;
            if (field1489[arg1] != null) {
                var6.method1033(field1489[arg1]);
            }
            var6.field1261 = field1495[arg1];
            var6.field1236 = field1496[arg1];
            int var7 = field1494[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1259[0] = field1488[arg1];
            var6.field909 = (byte) var8;
            var6.method1027((var9 << 13) + var3 - Statics.field352, (var10 << 13) + var4 - Statics.field3706);
            var6.field887 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3239(2);
            int var12 = field1494[arg1];
            field1494[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3239(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1494[arg1];
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
            field1494[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3239(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1494[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1494[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bh.p(I)V")
    public static void method1053() {
        field1500 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1489[var0] = null;
            field1488[var0] = 1;
        }
    }
}

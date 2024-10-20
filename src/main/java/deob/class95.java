package deob;

@ObfuscatedName("ci")
public class class95 {

    @ObfuscatedName("ci.e")
    public static byte[] field1477 = new byte[2048];

    @ObfuscatedName("ci.p")
    public static byte[] field1478 = new byte[2048];

    @ObfuscatedName("ci.q")
    public static class174[] field1479 = new class174[2048];

    @ObfuscatedName("ci.s")
    public static int field1486 = 0;

    @ObfuscatedName("ci.r")
    public static int[] field1481 = new int[2048];

    @ObfuscatedName("ci.g")
    public static int field1475 = 0;

    @ObfuscatedName("ci.v")
    public static int[] field1483 = new int[2048];

    @ObfuscatedName("ci.t")
    public static int[] field1484 = new int[2048];

    @ObfuscatedName("ci.y")
    public static int[] field1476 = new int[2048];

    @ObfuscatedName("ci.o")
    public static int[] field1482 = new int[2048];

    @ObfuscatedName("ci.i")
    public static int field1487 = 0;

    @ObfuscatedName("ci.u")
    public static int[] field1488 = new int[2048];

    @ObfuscatedName("ci.b")
    public static class174 field1489 = new class174(new byte[5000]);

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.d(Lfd;I)V")
    public static final void method233(class180 arg0) {
        arg0.method3212();
        int var1 = client.field1179;
        class74 var2 = Statics.field2427 = client.field1034[var1] = new class74();
        var2.field887 = var1;
        int var3 = arg0.method3213(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1263[0] = var5 - Statics.field2122;
        var2.field1243 = (var2.field1263[0] << 7) + (var2.method1071() << 6);
        var2.field1264[0] = var6 - Statics.field1505;
        var2.field1209 = (var2.field1264[0] << 7) + (var2.method1071() << 6);
        Statics.field44 = var2.field895 = var4;
        if (field1479[var1] != null) {
            var2.method1068(field1479[var1]);
        }
        field1486 = 0;
        field1481[++field1486 - 1] = var1;
        field1477[var1] = 0;
        field1475 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3213(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1484[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1476[var7] = 0;
                field1482[var7] = -1;
                field1483[++field1475 - 1] = var7;
                field1477[var7] = 0;
            }
        }
        arg0.method3208();
    }

    @ObfuscatedName("az.k(Lfd;IB)V")
    public static final void method455(class180 arg0, int arg1) {
        int var2 = arg0.field2405;
        field1487 = 0;
        int var3 = 0;
        arg0.method3212();
        for (int var4 = 0; var4 < field1486; var4++) {
            int var5 = field1481[var4];
            if ((field1477[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1477[var5] = (byte) (field1477[var5] | 0x2);
                } else {
                    int var6 = arg0.method3213(1);
                    if (var6 == 0) {
                        var3 = method684(arg0);
                        field1477[var5] = (byte) (field1477[var5] | 0x2);
                    } else {
                        method1634(arg0, var5);
                    }
                }
            }
        }
        arg0.method3208();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3212();
        for (int var7 = 0; var7 < field1486; var7++) {
            int var8 = field1481[var7];
            if ((field1477[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1477[var8] = (byte) (field1477[var8] | 0x2);
                } else {
                    int var9 = arg0.method3213(1);
                    if (var9 == 0) {
                        var3 = method684(arg0);
                        field1477[var8] = (byte) (field1477[var8] | 0x2);
                    } else {
                        method1634(arg0, var8);
                    }
                }
            }
        }
        arg0.method3208();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3212();
        for (int var10 = 0; var10 < field1475; var10++) {
            int var11 = field1483[var10];
            if ((field1477[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1477[var11] = (byte) (field1477[var11] | 0x2);
                } else {
                    int var12 = arg0.method3213(1);
                    if (var12 == 0) {
                        var3 = method684(arg0);
                        field1477[var11] = (byte) (field1477[var11] | 0x2);
                    } else if (method2814(arg0, var11)) {
                        field1477[var11] = (byte) (field1477[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method3208();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3212();
        for (int var13 = 0; var13 < field1475; var13++) {
            int var14 = field1483[var13];
            if ((field1477[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1477[var14] = (byte) (field1477[var14] | 0x2);
                } else {
                    int var15 = arg0.method3213(1);
                    if (var15 == 0) {
                        var3 = method684(arg0);
                        field1477[var14] = (byte) (field1477[var14] | 0x2);
                    } else if (method2814(arg0, var14)) {
                        field1477[var14] = (byte) (field1477[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method3208();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1486 = 0;
        field1475 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1477[var16] = (byte) (field1477[var16] >> 1);
            class74 var17 = client.field1034[var16];
            if (var17 == null) {
                field1483[++field1475 - 1] = var16;
            } else {
                field1481[++field1486 - 1] = var16;
            }
        }
        method964(arg0);
        if (arg0.field2405 - var2 != arg1) {
            throw new RuntimeException(arg0.field2405 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ay.e(Lfd;I)I")
    public static int method684(class180 arg0) {
        int var1 = arg0.method3213(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3213(5);
        } else if (var1 == 2) {
            var2 = arg0.method3213(8);
        } else {
            var2 = arg0.method3213(11);
        }
        return var2;
    }

    @ObfuscatedName("ck.p(Lfd;IB)V")
    public static void method1634(class180 arg0, int arg1) {
        boolean var2 = arg0.method3213(1) == 1;
        if (var2) {
            field1488[++field1487 - 1] = arg1;
        }
        int var3 = arg0.method3213(2);
        class74 var4 = client.field1034[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field888 = false;
            } else if (client.field1179 == arg1) {
                throw new RuntimeException();
            } else {
                field1484[arg1] = (Statics.field1505 + var4.field1264[0] >> 13) + (Statics.field2122 + var4.field1263[0] >> 13 << 14) + (var4.field895 << 28);
                if (var4.field1236 == -1) {
                    field1476[arg1] = var4.field1259;
                } else {
                    field1476[arg1] = var4.field1236;
                }
                field1482[arg1] = var4.field1234;
                client.field1034[arg1] = null;
                if (arg0.method3213(1) != 0) {
                    method2814(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3213(3);
            int var6 = var4.field1263[0];
            int var7 = var4.field1264[0];
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
            if (client.field1179 == arg1 && var4.field1243 < 1536 || var4.field1209 < 1536 || var4.field1243 >= 11776 || var4.field1209 >= 11776) {
                var4.method1072(var6, var7);
                var4.field888 = false;
            } else if (var2) {
                var4.field888 = true;
                var4.field908 = var6;
                var4.field909 = var7;
            } else {
                var4.field888 = false;
                var4.method1067(var6, var7, field1478[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3213(4);
            int var9 = var4.field1263[0];
            int var10 = var4.field1264[0];
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
            if (client.field1179 == arg1 && var4.field1243 < 1536 || var4.field1209 < 1536 || var4.field1243 >= 11776 || var4.field1209 >= 11776) {
                var4.method1072(var9, var10);
                var4.field888 = false;
            } else if (var2) {
                var4.field888 = true;
                var4.field908 = var9;
                var4.field909 = var10;
            } else {
                var4.field888 = false;
                var4.method1067(var9, var10, field1478[arg1]);
            }
        } else {
            int var11 = arg0.method3213(1);
            if (var11 == 0) {
                int var12 = arg0.method3213(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1263[0] + var14;
                int var17 = var4.field1264[0] + var15;
                if (client.field1179 == arg1 && var4.field1243 < 1536 || var4.field1209 < 1536 || var4.field1243 >= 11776 || var4.field1209 >= 11776) {
                    var4.method1072(var16, var17);
                    var4.field888 = false;
                } else if (var2) {
                    var4.field888 = true;
                    var4.field908 = var16;
                    var4.field909 = var17;
                } else {
                    var4.field888 = false;
                    var4.method1067(var16, var17, field1478[arg1]);
                }
                var4.field895 = (byte) (var4.field895 + var13 & 0x3);
                if (client.field1179 == arg1) {
                    Statics.field44 = var4.field895;
                }
            } else {
                int var18 = arg0.method3213(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2122 + var4.field1263[0] + var20 & 0x3FFF) - Statics.field2122;
                int var23 = (Statics.field1505 + var4.field1264[0] + var21 & 0x3FFF) - Statics.field1505;
                if (client.field1179 == arg1 && var4.field1243 < 1536 || var4.field1209 < 1536 || var4.field1243 >= 11776 || var4.field1209 >= 11776) {
                    var4.method1072(var22, var23);
                    var4.field888 = false;
                } else if (var2) {
                    var4.field888 = true;
                    var4.field908 = var22;
                    var4.field909 = var23;
                } else {
                    var4.field888 = false;
                    var4.method1067(var22, var23, field1478[arg1]);
                }
                var4.field895 = (byte) (var4.field895 + var19 & 0x3);
                if (client.field1179 == arg1) {
                    Statics.field44 = var4.field895;
                }
            }
        }
    }

    @ObfuscatedName("fi.q(Lfd;IB)Z")
    public static boolean method2814(class180 arg0, int arg1) {
        int var2 = arg0.method3213(2);
        if (var2 == 0) {
            if (arg0.method3213(1) != 0) {
                method2814(arg0, arg1);
            }
            int var3 = arg0.method3213(13);
            int var4 = arg0.method3213(13);
            boolean var5 = arg0.method3213(1) == 1;
            if (var5) {
                field1488[++field1487 - 1] = arg1;
            }
            if (client.field1034[arg1] != null) {
                throw new RuntimeException();
            }
            class74 var6 = client.field1034[arg1] = new class74();
            var6.field887 = arg1;
            if (field1479[arg1] != null) {
                var6.method1068(field1479[arg1]);
            }
            var6.field1259 = field1476[arg1];
            var6.field1234 = field1482[arg1];
            int var7 = field1484[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1265[0] = field1478[arg1];
            var6.field895 = (byte) var8;
            var6.method1072((var9 << 13) + var3 - Statics.field2122, (var10 << 13) + var4 - Statics.field1505);
            var6.field888 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3213(2);
            int var12 = field1484[arg1];
            field1484[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3213(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1484[arg1];
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
            field1484[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3213(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1484[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1484[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bl.s(Lfd;I)V")
    public static final void method964(class180 arg0) {
        for (int var1 = 0; var1 < field1487; var1++) {
            int var2 = field1488[var1];
            class74 var3 = client.field1034[var2];
            int var4 = arg0.method2955();
            if ((var4 & 0x4) != 0) {
                var4 += arg0.method2955() << 8;
            }
            byte var5 = -1;
            if ((var4 & 0x80) != 0) {
                var3.field1234 = arg0.method2991();
                if (var3.field1234 == 65535) {
                    var3.field1234 = -1;
                }
            }
            if ((var4 & 0x800) != 0) {
                var3.field1260 = arg0.method2993();
                int var6 = arg0.method3028();
                var3.field1215 = var6 >> 16;
                var3.field1248 = (var6 & 0xFFFF) + client.field931;
                var3.field1250 = 0;
                var3.field1247 = 0;
                if (var3.field1248 > client.field931) {
                    var3.field1250 = -1;
                }
                if (var3.field1260 == 65535) {
                    var3.field1260 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                int var7 = arg0.method2983();
                byte[] var8 = new byte[var7];
                class174 var9 = new class174(var8);
                arg0.method3010(var8, 0, var7);
                field1479[var2] = var9;
                var3.method1068(var9);
            }
            if ((var4 & 0x1000) != 0) {
                var5 = arg0.method2956();
            }
            if ((var4 & 0x400) != 0) {
                field1478[var2] = arg0.method2987();
            }
            if ((var4 & 0x100) != 0) {
                for (int var10 = 0; var10 < 3; var10++) {
                    var3.field900[var10] = arg0.method2964();
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field1237 = arg0.method2986();
                var3.field1230 = arg0.method2986();
                var3.field1251 = arg0.method3021();
                var3.field1217 = arg0.method3021();
                var3.field1256 = arg0.method2993() + client.field931;
                var3.field1255 = arg0.method2991() + client.field931;
                var3.field1262 = arg0.method2993();
                if (var3.field888) {
                    var3.field1237 += var3.field908;
                    var3.field1230 += var3.field909;
                    var3.field1251 += var3.field908;
                    var3.field1217 += var3.field909;
                    var3.field1213 = 0;
                } else {
                    var3.field1237 += var3.field1263[0];
                    var3.field1230 += var3.field1264[0];
                    var3.field1251 += var3.field1263[0];
                    var3.field1217 += var3.field1264[0];
                    var3.field1213 = 1;
                }
                var3.field1242 = 0;
            }
            if ((var4 & 0x20) != 0) {
                int var11 = arg0.method3137();
                if (var11 > 0) {
                    for (int var12 = 0; var12 < var11; var12++) {
                        int var13 = -1;
                        int var14 = -1;
                        int var15 = -1;
                        int var16 = arg0.method2969();
                        if (var16 == 32767) {
                            var16 = arg0.method2969();
                            var14 = arg0.method2969();
                            var13 = arg0.method2969();
                            var15 = arg0.method2969();
                        } else if (var16 == 32766) {
                            var16 = -1;
                        } else {
                            var14 = arg0.method2969();
                        }
                        int var17 = arg0.method2969();
                        var3.method1458(var16, var14, var13, var15, client.field931, var17);
                    }
                }
                int var18 = arg0.method2955();
                if (var18 > 0) {
                    for (int var19 = 0; var19 < var18; var19++) {
                        int var20 = arg0.method2969();
                        int var21 = arg0.method2969();
                        if (var21 == 32767) {
                            var3.method1459(var20);
                        } else {
                            int var22 = arg0.method2969();
                            int var23 = arg0.method3137();
                            int var24 = var21 > 0 ? arg0.method3137() : var23;
                            var3.method1467(var20, client.field931, var21, var22, var23, var24);
                        }
                    }
                }
            }
            if ((var4 & 0x8) != 0) {
                int var25 = arg0.method3018();
                if (var25 == 65535) {
                    var25 = -1;
                }
                int var26 = arg0.method2955();
                client.method6(var3, var25, var26);
            }
            if ((var4 & 0x10) != 0) {
                int var27 = arg0.method2991();
                class231 var28 = (class231) class169.method648(class231.method1094(), arg0.method2955());
                boolean var29 = arg0.method2983() == 1;
                int var30 = arg0.method2984();
                int var31 = arg0.field2405;
                if (var3.field896 != null && var3.field906 != null) {
                    boolean var32 = false;
                    if (var28.field3184 && client.method2868(var3.field896)) {
                        var32 = true;
                    }
                    if (!var32 && client.field1176 == 0 && !var3.field904) {
                        field1489.field2405 = 0;
                        arg0.method2945(field1489.field2409, 0, var30);
                        field1489.field2405 = 0;
                        String var33 = class265.method4563(class271.method2713(class266.method3865(field1489)));
                        var3.field1221 = var33.trim();
                        var3.field1225 = var27 >> 8;
                        var3.field1226 = var27 & 0xFF;
                        var3.field1224 = 150;
                        var3.field1222 = var29;
                        var3.field1223 = Statics.field2427 != var3 && var28.field3184 && client.field1132 != "" && var33.toLowerCase().indexOf(client.field1132) == -1;
                        int var34;
                        if (var28.field3183) {
                            var34 = var29 ? 91 : 1;
                        } else {
                            var34 = var29 ? 90 : 2;
                        }
                        if (var28.field3182 == -1) {
                            class97.method1053(var34, var3.field896, var33);
                        } else {
                            int var36 = var28.field3182;
                            String var37 = "<img=" + var36 + ">";
                            class97.method1053(var34, var37 + var3.field896, var33);
                        }
                    }
                }
                arg0.field2405 = var30 + var31;
            }
            if ((var4 & 0x40) != 0) {
                var3.field1236 = arg0.method2993();
                if (var3.field1213 == 0) {
                    var3.field1259 = var3.field1236;
                    var3.field1236 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field1221 = arg0.method2964();
                if (var3.field1221.charAt(0) == '~') {
                    var3.field1221 = var3.field1221.substring(1);
                    class97.method1053(2, var3.field896, var3.field1221);
                } else if (Statics.field2427 == var3) {
                    class97.method1053(2, var3.field896, var3.field1221);
                }
                var3.field1222 = false;
                var3.field1225 = 0;
                var3.field1226 = 0;
                var3.field1224 = 150;
            }
            if (var3.field888) {
                if (var5 == 127) {
                    var3.method1072(var3.field908, var3.field909);
                } else {
                    byte var38;
                    if (var5 == -1) {
                        var38 = field1478[var2];
                    } else {
                        var38 = var5;
                    }
                    var3.method1067(var3.field908, var3.field909, var38);
                }
            }
        }
    }
}

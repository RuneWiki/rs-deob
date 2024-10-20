package deob;

@ObfuscatedName("ca")
public class class97 {

    @ObfuscatedName("ca.x")
    public static byte[] field1472 = new byte[2048];

    @ObfuscatedName("ca.y")
    public static byte[] field1468 = new byte[2048];

    @ObfuscatedName("ca.e")
    public static class174[] field1470 = new class174[2048];

    @ObfuscatedName("ca.f")
    public static int field1471 = 0;

    @ObfuscatedName("ca.v")
    public static int[] field1469 = new int[2048];

    @ObfuscatedName("ca.t")
    public static int field1473 = 0;

    @ObfuscatedName("ca.i")
    public static int[] field1481 = new int[2048];

    @ObfuscatedName("ca.r")
    public static int[] field1477 = new int[2048];

    @ObfuscatedName("ca.g")
    public static int[] field1476 = new int[2048];

    @ObfuscatedName("ca.s")
    public static int[] field1467 = new int[2048];

    @ObfuscatedName("ca.o")
    public static int field1478 = 0;

    @ObfuscatedName("ca.p")
    public static int[] field1479 = new int[2048];

    @ObfuscatedName("ca.u")
    public static class174 field1480 = new class174(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cx.d(Lfy;I)V")
    public static final void method1617(class180 arg0) {
        arg0.method3135();
        int var1 = client.field1005;
        class75 var2 = Statics.field2829 = client.field1004[var1] = new class75();
        var2.field866 = var1;
        int var3 = arg0.method3136(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1245[0] = var5 - Statics.field448;
        var2.field1232 = (var2.field1245[0] << 7) + (var2.method1033() << 6);
        var2.field1246[0] = var6 - Statics.field301;
        var2.field1191 = (var2.field1246[0] << 7) + (var2.method1033() << 6);
        Statics.field237 = var2.field882 = var4;
        if (field1470[var1] != null) {
            var2.method1031(field1470[var1]);
        }
        field1471 = 0;
        field1469[++field1471 - 1] = var1;
        field1472[var1] = 0;
        field1473 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3136(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1477[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1476[var7] = 0;
                field1467[var7] = -1;
                field1481[++field1473 - 1] = var7;
                field1472[var7] = 0;
            }
        }
        arg0.method3137();
    }

    @ObfuscatedName("ab.q(Lfy;II)V")
    public static final void method669(class180 arg0, int arg1) {
        int var2 = arg0.field2364;
        field1478 = 0;
        int var3 = 0;
        arg0.method3135();
        for (int var4 = 0; var4 < field1471; var4++) {
            int var5 = field1469[var4];
            if ((field1472[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1472[var5] = (byte) (field1472[var5] | 0x2);
                } else {
                    int var6 = arg0.method3136(1);
                    if (var6 == 0) {
                        var3 = method3865(arg0);
                        field1472[var5] = (byte) (field1472[var5] | 0x2);
                    } else {
                        method1(arg0, var5);
                    }
                }
            }
        }
        arg0.method3137();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3135();
        for (int var7 = 0; var7 < field1471; var7++) {
            int var8 = field1469[var7];
            if ((field1472[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1472[var8] = (byte) (field1472[var8] | 0x2);
                } else {
                    int var9 = arg0.method3136(1);
                    if (var9 == 0) {
                        var3 = method3865(arg0);
                        field1472[var8] = (byte) (field1472[var8] | 0x2);
                    } else {
                        method1(arg0, var8);
                    }
                }
            }
        }
        arg0.method3137();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3135();
        for (int var10 = 0; var10 < field1473; var10++) {
            int var11 = field1481[var10];
            if ((field1472[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1472[var11] = (byte) (field1472[var11] | 0x2);
                } else {
                    int var12 = arg0.method3136(1);
                    if (var12 == 0) {
                        var3 = method3865(arg0);
                        field1472[var11] = (byte) (field1472[var11] | 0x2);
                    } else if (method1562(arg0, var11)) {
                        field1472[var11] = (byte) (field1472[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method3137();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3135();
        for (int var13 = 0; var13 < field1473; var13++) {
            int var14 = field1481[var13];
            if ((field1472[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1472[var14] = (byte) (field1472[var14] | 0x2);
                } else {
                    int var15 = arg0.method3136(1);
                    if (var15 == 0) {
                        var3 = method3865(arg0);
                        field1472[var14] = (byte) (field1472[var14] | 0x2);
                    } else if (method1562(arg0, var14)) {
                        field1472[var14] = (byte) (field1472[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method3137();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1471 = 0;
        field1473 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1472[var16] = (byte) (field1472[var16] >> 1);
            class75 var17 = client.field1004[var16];
            if (var17 == null) {
                field1481[++field1473 - 1] = var16;
            } else {
                field1469[++field1471 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1478; var18++) {
            int var19 = field1479[var18];
            class75 var20 = client.field1004[var19];
            int var21 = arg0.method2921();
            if ((var21 & 0x4) != 0) {
                var21 += arg0.method2921() << 8;
            }
            method1473(arg0, var19, var20, var21);
        }
        if (arg0.field2364 - var2 != arg1) {
            throw new RuntimeException(arg0.field2364 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("ih.x(Lfy;I)I")
    public static int method3865(class180 arg0) {
        int var1 = arg0.method3136(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3136(5);
        } else if (var1 == 2) {
            var2 = arg0.method3136(8);
        } else {
            var2 = arg0.method3136(11);
        }
        return var2;
    }

    @ObfuscatedName("q.y(Lfy;II)V")
    public static void method1(class180 arg0, int arg1) {
        boolean var2 = arg0.method3136(1) == 1;
        if (var2) {
            field1479[++field1478 - 1] = arg1;
        }
        int var3 = arg0.method3136(2);
        class75 var4 = client.field1004[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field880 = false;
            } else if (client.field1005 == arg1) {
                throw new RuntimeException();
            } else {
                field1477[arg1] = (Statics.field301 + var4.field1246[0] >> 13) + (Statics.field448 + var4.field1245[0] >> 13 << 14) + (var4.field882 << 28);
                if (var4.field1210 == -1) {
                    field1476[arg1] = var4.field1241;
                } else {
                    field1476[arg1] = var4.field1210;
                }
                field1467[arg1] = var4.field1216;
                client.field1004[arg1] = null;
                if (arg0.method3136(1) != 0) {
                    method1562(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3136(3);
            int var6 = var4.field1245[0];
            int var7 = var4.field1246[0];
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
            if (client.field1005 == arg1 && var4.field1232 < 1536 || var4.field1191 < 1536 || var4.field1232 >= 11776 || var4.field1191 >= 11776) {
                var4.method1054(var6, var7);
                var4.field880 = false;
            } else if (var2) {
                var4.field880 = true;
                var4.field869 = var6;
                var4.field883 = var7;
            } else {
                var4.field880 = false;
                var4.method1034(var6, var7, field1468[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3136(4);
            int var9 = var4.field1245[0];
            int var10 = var4.field1246[0];
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
            if (client.field1005 == arg1 && var4.field1232 < 1536 || var4.field1191 < 1536 || var4.field1232 >= 11776 || var4.field1191 >= 11776) {
                var4.method1054(var9, var10);
                var4.field880 = false;
            } else if (var2) {
                var4.field880 = true;
                var4.field869 = var9;
                var4.field883 = var10;
            } else {
                var4.field880 = false;
                var4.method1034(var9, var10, field1468[arg1]);
            }
        } else {
            int var11 = arg0.method3136(1);
            if (var11 == 0) {
                int var12 = arg0.method3136(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1245[0] + var14;
                int var17 = var4.field1246[0] + var15;
                if (client.field1005 == arg1 && var4.field1232 < 1536 || var4.field1191 < 1536 || var4.field1232 >= 11776 || var4.field1191 >= 11776) {
                    var4.method1054(var16, var17);
                    var4.field880 = false;
                } else if (var2) {
                    var4.field880 = true;
                    var4.field869 = var16;
                    var4.field883 = var17;
                } else {
                    var4.field880 = false;
                    var4.method1034(var16, var17, field1468[arg1]);
                }
                var4.field882 = (byte) (var4.field882 + var13 & 0x3);
                if (client.field1005 == arg1) {
                    Statics.field237 = var4.field882;
                }
            } else {
                int var18 = arg0.method3136(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field448 + var4.field1245[0] + var20 & 0x3FFF) - Statics.field448;
                int var23 = (Statics.field301 + var4.field1246[0] + var21 & 0x3FFF) - Statics.field301;
                if (client.field1005 == arg1 && var4.field1232 < 1536 || var4.field1191 < 1536 || var4.field1232 >= 11776 || var4.field1191 >= 11776) {
                    var4.method1054(var22, var23);
                    var4.field880 = false;
                } else if (var2) {
                    var4.field880 = true;
                    var4.field869 = var22;
                    var4.field883 = var23;
                } else {
                    var4.field880 = false;
                    var4.method1034(var22, var23, field1468[arg1]);
                }
                var4.field882 = (byte) (var4.field882 + var19 & 0x3);
                if (client.field1005 == arg1) {
                    Statics.field237 = var4.field882;
                }
            }
        }
    }

    @ObfuscatedName("cs.e(Lfy;IB)Z")
    public static boolean method1562(class180 arg0, int arg1) {
        int var2 = arg0.method3136(2);
        if (var2 == 0) {
            if (arg0.method3136(1) != 0) {
                method1562(arg0, arg1);
            }
            int var3 = arg0.method3136(13);
            int var4 = arg0.method3136(13);
            boolean var5 = arg0.method3136(1) == 1;
            if (var5) {
                field1479[++field1478 - 1] = arg1;
            }
            if (client.field1004[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field1004[arg1] = new class75();
            var6.field866 = arg1;
            if (field1470[arg1] != null) {
                var6.method1031(field1470[arg1]);
            }
            var6.field1241 = field1476[arg1];
            var6.field1216 = field1467[arg1];
            int var7 = field1477[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1247[0] = field1468[arg1];
            var6.field882 = (byte) var8;
            var6.method1054((var9 << 13) + var3 - Statics.field448, (var10 << 13) + var4 - Statics.field301);
            var6.field880 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3136(2);
            int var12 = field1477[arg1];
            field1477[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3136(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1477[arg1];
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
            field1477[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3136(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1477[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1477[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("cu.f(Lfy;ILbg;II)V")
    public static final void method1473(class180 arg0, int arg1, class75 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x1) != 0) {
            int var5 = arg0.method2921();
            byte[] var6 = new byte[var5];
            class174 var7 = new class174(var6);
            arg0.method3102(var6, 0, var5);
            field1470[arg1] = var7;
            arg2.method1031(var7);
        }
        if ((arg3 & 0x8) != 0) {
            int var8 = arg0.method2916();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2921();
            client.method678(arg2, var8, var9);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1216 = arg0.method2916();
            if (arg2.field1216 == 65535) {
                arg2.field1216 = -1;
            }
        }
        if ((arg3 & 0x10) != 0) {
            arg2.field1226 = arg0.method2922();
            if (arg2.field1226.charAt(0) == '~') {
                arg2.field1226 = arg2.field1226.substring(1);
                class99.method3389(2, arg2.field875, arg2.field1226);
            } else if (Statics.field2829 == arg2) {
                class99.method3389(2, arg2.field875, arg2.field1226);
            }
            arg2.field1204 = false;
            arg2.field1207 = 0;
            arg2.field1212 = 0;
            arg2.field1214 = 150;
        }
        if ((arg3 & 0x20) != 0) {
            int var10 = arg0.method2921();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method2927();
                    if (var15 == 32767) {
                        var15 = arg0.method2927();
                        var13 = arg0.method2927();
                        var12 = arg0.method2927();
                        var14 = arg0.method2927();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method2927();
                    }
                    int var16 = arg0.method2927();
                    arg2.method1404(var15, var13, var12, var14, client.field902, var16);
                }
            }
            int var17 = arg0.method2921();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method2927();
                    int var20 = arg0.method2927();
                    if (var20 == 32767) {
                        arg2.method1396(var19);
                    } else {
                        int var21 = arg0.method2927();
                        int var22 = arg0.method2921();
                        int var23 = var20 > 0 ? arg0.method2921() : var22;
                        arg2.method1395(var19, client.field902, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1210 = arg0.method2916();
            if (arg2.field1235 == 0) {
                arg2.field1241 = arg2.field1210;
                arg2.field1210 = -1;
            }
        }
        if ((arg3 & 0x2) != 0) {
            int var24 = arg0.method2916();
            class231[] var25 = new class231[] { class231.field3157, class231.field3155, class231.field3158, class231.field3154, class231.field3156, class231.field3153 };
            class231 var26 = (class231) class169.method2811(var25, arg0.method2921());
            boolean var27 = arg0.method2921() == 1;
            int var28 = arg0.method2921();
            int var29 = arg0.field2364;
            if (arg2.field875 != null && arg2.field858 != null) {
                boolean var30 = false;
                if (var26.field3162 && client.method986(arg2.field875)) {
                    var30 = true;
                }
                if (!var30 && client.field1003 == 0 && !arg2.field878) {
                    field1480.field2364 = 0;
                    arg0.method3102(field1480.field2367, 0, var28);
                    field1480.field2364 = 0;
                    class174 var31 = field1480;
                    String var32 = class266.method2456(var31, 32767);
                    String var33 = class265.method4360(class271.method4333(var32));
                    arg2.field1226 = var33.trim();
                    arg2.field1207 = var24 >> 8;
                    arg2.field1212 = var24 & 0xFF;
                    arg2.field1214 = 150;
                    arg2.field1204 = var27;
                    arg2.field1194 = Statics.field2829 != arg2 && var26.field3162 && client.field1103 != "" && var33.toLowerCase().indexOf(client.field1103) == -1;
                    int var34;
                    if (var26.field3161) {
                        var34 = var27 ? 91 : 1;
                    } else {
                        var34 = var27 ? 90 : 2;
                    }
                    if (var26.field3160 == -1) {
                        class99.method3389(var34, arg2.field875, var33);
                    } else {
                        int var36 = var26.field3160;
                        String var37 = "<img=" + var36 + ">";
                        class99.method3389(var34, var37 + arg2.field875, var33);
                    }
                }
            }
            arg0.field2364 = var28 + var29;
        }
        if ((arg3 & 0x400) != 0) {
            arg2.field1227 = arg0.method2916();
            int var38 = arg0.method2935();
            arg2.field1231 = var38 >> 16;
            arg2.field1230 = (var38 & 0xFFFF) + client.field902;
            arg2.field1228 = 0;
            arg2.field1229 = 0;
            if (arg2.field1230 > client.field902) {
                arg2.field1228 = -1;
            }
            if (arg2.field1227 == 65535) {
                arg2.field1227 = -1;
            }
        }
        if ((arg3 & 0x100) != 0) {
            arg2.field1205 = arg0.method3082();
            arg2.field1234 = arg0.method3082();
            arg2.field1233 = arg0.method3082();
            arg2.field1202 = arg0.method3082();
            arg2.field1236 = arg0.method2916() + client.field902;
            arg2.field1208 = arg0.method2916() + client.field902;
            arg2.field1209 = arg0.method2916();
            if (arg2.field880) {
                arg2.field1205 += arg2.field869;
                arg2.field1234 += arg2.field883;
                arg2.field1233 += arg2.field869;
                arg2.field1202 += arg2.field883;
                arg2.field1235 = 0;
            } else {
                arg2.field1205 += arg2.field1245[0];
                arg2.field1234 += arg2.field1246[0];
                arg2.field1233 += arg2.field1245[0];
                arg2.field1202 += arg2.field1246[0];
                arg2.field1235 = 1;
            }
            arg2.field1249 = 0;
        }
        if ((arg3 & 0x800) != 0) {
            field1468[arg1] = arg0.method3082();
        }
        if ((arg3 & 0x1000) != 0) {
            var4 = arg0.method3082();
        }
        if ((arg3 & 0x200) != 0) {
            for (int var39 = 0; var39 < 3; var39++) {
                arg2.field862[var39] = arg0.method2922();
            }
        }
        if (!arg2.field880) {
            return;
        }
        if (var4 == 127) {
            arg2.method1054(arg2.field869, arg2.field883);
            return;
        }
        byte var40;
        if (var4 == -1) {
            var40 = field1468[arg1];
        } else {
            var40 = var4;
        }
        arg2.method1034(arg2.field869, arg2.field883, var40);
    }

    @ObfuscatedName("aq.v(I)V")
    public static void method491() {
        field1471 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1470[var0] = null;
            field1468[var0] = 1;
        }
    }
}

package deob;

@ObfuscatedName("cs")
public class class97 {

    @ObfuscatedName("cs.i")
    public static byte[] field1467 = new byte[2048];

    @ObfuscatedName("cs.u")
    public static byte[] field1468 = new byte[2048];

    @ObfuscatedName("cs.g")
    public static class174[] field1476 = new class174[2048];

    @ObfuscatedName("cs.m")
    public static int field1470 = 0;

    @ObfuscatedName("cs.s")
    public static int[] field1471 = new int[2048];

    @ObfuscatedName("cs.x")
    public static int field1477 = 0;

    @ObfuscatedName("cs.p")
    public static int[] field1473 = new int[2048];

    @ObfuscatedName("cs.k")
    public static int[] field1474 = new int[2048];

    @ObfuscatedName("cs.r")
    public static int[] field1475 = new int[2048];

    @ObfuscatedName("cs.w")
    public static int[] field1472 = new int[2048];

    @ObfuscatedName("cs.v")
    public static int field1481 = 0;

    @ObfuscatedName("cs.h")
    public static int[] field1466 = new int[2048];

    @ObfuscatedName("cs.t")
    public static class174 field1465 = new class174(new byte[5000]);

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ju.c(Lfv;S)V")
    public static final void method4595(class180 arg0) {
        arg0.method3098();
        int var1 = client.field1026;
        class75 var2 = Statics.field3110 = client.field1070[var1] = new class75();
        var2.field902 = var1;
        int var3 = arg0.method3108(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1210[0] = var5 - Statics.field329;
        var2.field1211 = (var2.field1210[0] << 7) + (var2.method982() << 6);
        var2.field1264[0] = var6 - Statics.field2282;
        var2.field1219 = (var2.field1264[0] << 7) + (var2.method982() << 6);
        Statics.field251 = var2.field897 = var4;
        if (field1476[var1] != null) {
            var2.method1001(field1476[var1]);
        }
        field1470 = 0;
        field1471[++field1470 - 1] = var1;
        field1467[var1] = 0;
        field1477 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3108(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1474[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1475[var7] = 0;
                field1472[var7] = -1;
                field1473[++field1477 - 1] = var7;
                field1467[var7] = 0;
            }
        }
        arg0.method3100();
    }

    @ObfuscatedName("bn.i(Lfv;B)I")
    public static int method888(class180 arg0) {
        int var1 = arg0.method3108(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3108(5);
        } else if (var1 == 2) {
            var2 = arg0.method3108(8);
        } else {
            var2 = arg0.method3108(11);
        }
        return var2;
    }

    @ObfuscatedName("cn.u(Lfv;II)V")
    public static void method1633(class180 arg0, int arg1) {
        boolean var2 = arg0.method3108(1) == 1;
        if (var2) {
            field1466[++field1481 - 1] = arg1;
        }
        int var3 = arg0.method3108(2);
        class75 var4 = client.field1070[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field899 = false;
            } else if (client.field1026 == arg1) {
                throw new RuntimeException();
            } else {
                field1474[arg1] = (Statics.field2282 + var4.field1264[0] >> 13) + (Statics.field329 + var4.field1210[0] >> 13 << 14) + (var4.field897 << 28);
                if (var4.field1238 == -1) {
                    field1475[arg1] = var4.field1257;
                } else {
                    field1475[arg1] = var4.field1238;
                }
                field1472[arg1] = var4.field1236;
                client.field1070[arg1] = null;
                if (arg0.method3108(1) != 0) {
                    method159(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3108(3);
            int var6 = var4.field1210[0];
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
            if (client.field1026 == arg1 && var4.field1211 < 1536 || var4.field1219 < 1536 || var4.field1211 >= 11776 || var4.field1219 >= 11776) {
                var4.method985(var6, var7);
                var4.field899 = false;
            } else if (var2) {
                var4.field899 = true;
                var4.field900 = var6;
                var4.field901 = var7;
            } else {
                var4.field899 = false;
                var4.method984(var6, var7, field1468[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3108(4);
            int var9 = var4.field1210[0];
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
            if (client.field1026 == arg1 && var4.field1211 < 1536 || var4.field1219 < 1536 || var4.field1211 >= 11776 || var4.field1219 >= 11776) {
                var4.method985(var9, var10);
                var4.field899 = false;
            } else if (var2) {
                var4.field899 = true;
                var4.field900 = var9;
                var4.field901 = var10;
            } else {
                var4.field899 = false;
                var4.method984(var9, var10, field1468[arg1]);
            }
        } else {
            int var11 = arg0.method3108(1);
            if (var11 == 0) {
                int var12 = arg0.method3108(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1210[0] + var14;
                int var17 = var4.field1264[0] + var15;
                if (client.field1026 == arg1 && var4.field1211 < 1536 || var4.field1219 < 1536 || var4.field1211 >= 11776 || var4.field1219 >= 11776) {
                    var4.method985(var16, var17);
                    var4.field899 = false;
                } else if (var2) {
                    var4.field899 = true;
                    var4.field900 = var16;
                    var4.field901 = var17;
                } else {
                    var4.field899 = false;
                    var4.method984(var16, var17, field1468[arg1]);
                }
                var4.field897 = (byte) (var4.field897 + var13 & 0x3);
                if (client.field1026 == arg1) {
                    Statics.field251 = var4.field897;
                }
            } else {
                int var18 = arg0.method3108(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field329 + var4.field1210[0] + var20 & 0x3FFF) - Statics.field329;
                int var23 = (Statics.field2282 + var4.field1264[0] + var21 & 0x3FFF) - Statics.field2282;
                if (client.field1026 == arg1 && var4.field1211 < 1536 || var4.field1219 < 1536 || var4.field1211 >= 11776 || var4.field1219 >= 11776) {
                    var4.method985(var22, var23);
                    var4.field899 = false;
                } else if (var2) {
                    var4.field899 = true;
                    var4.field900 = var22;
                    var4.field901 = var23;
                } else {
                    var4.field899 = false;
                    var4.method984(var22, var23, field1468[arg1]);
                }
                var4.field897 = (byte) (var4.field897 + var19 & 0x3);
                if (client.field1026 == arg1) {
                    Statics.field251 = var4.field897;
                }
            }
        }
    }

    @ObfuscatedName("z.g(Lfv;II)Z")
    public static boolean method159(class180 arg0, int arg1) {
        int var2 = arg0.method3108(2);
        if (var2 == 0) {
            if (arg0.method3108(1) != 0) {
                method159(arg0, arg1);
            }
            int var3 = arg0.method3108(13);
            int var4 = arg0.method3108(13);
            boolean var5 = arg0.method3108(1) == 1;
            if (var5) {
                field1466[++field1481 - 1] = arg1;
            }
            if (client.field1070[arg1] != null) {
                throw new RuntimeException();
            }
            class75 var6 = client.field1070[arg1] = new class75();
            var6.field902 = arg1;
            if (field1476[arg1] != null) {
                var6.method1001(field1476[arg1]);
            }
            var6.field1257 = field1475[arg1];
            var6.field1236 = field1472[arg1];
            int var7 = field1474[arg1];
            int var8 = var7 >> 28;
            int var9 = var7 >> 14 & 0xFF;
            int var10 = var7 & 0xFF;
            var6.field1267[0] = field1468[arg1];
            var6.field897 = (byte) var8;
            var6.method985((var9 << 13) + var3 - Statics.field329, (var10 << 13) + var4 - Statics.field2282);
            var6.field899 = false;
            return true;
        } else if (var2 == 1) {
            int var11 = arg0.method3108(2);
            int var12 = field1474[arg1];
            field1474[arg1] = (((var12 >> 28) + var11 & 0x3) << 28) + (var12 & 0xFFFFFFF);
            return false;
        } else if (var2 == 2) {
            int var13 = arg0.method3108(5);
            int var14 = var13 >> 3;
            int var15 = var13 & 0x7;
            int var16 = field1474[arg1];
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
            field1474[arg1] = (var17 << 28) + (var18 << 14) + var19;
            return false;
        } else {
            int var20 = arg0.method3108(18);
            int var21 = var20 >> 16;
            int var22 = var20 >> 8 & 0xFF;
            int var23 = var20 & 0xFF;
            int var24 = field1474[arg1];
            int var25 = (var24 >> 28) + var21 & 0x3;
            int var26 = (var24 >> 14) + var22 & 0xFF;
            int var27 = var23 + var24 & 0xFF;
            field1474[arg1] = (var25 << 28) + (var26 << 14) + var27;
            return false;
        }
    }

    @ObfuscatedName("bb.m(Lfv;ILbt;II)V")
    public static final void method977(class180 arg0, int arg1, class75 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x4) != 0) {
            int var5 = arg0.method2843();
            byte[] var6 = new byte[var5];
            class174 var7 = new class174(var6);
            arg0.method2870(var6, 0, var5);
            field1476[arg1] = var7;
            arg2.method1001(var7);
        }
        if ((arg3 & 0x10) != 0) {
            int var8 = arg0.method2861();
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg0.method2843();
            client.method73(arg2, var8, var9);
        }
        if ((arg3 & 0x80) != 0) {
            arg2.field1236 = arg0.method2861();
            if (arg2.field1236 == 65535) {
                arg2.field1236 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            arg2.field1223 = arg0.method2867();
            if (arg2.field1223.charAt(0) == '~') {
                arg2.field1223 = arg2.field1223.substring(1);
                class99.method1574(2, arg2.field884, arg2.field1223);
            } else if (Statics.field3110 == arg2) {
                class99.method1574(2, arg2.field884, arg2.field1223);
            }
            arg2.field1224 = false;
            arg2.field1227 = 0;
            arg2.field1228 = 0;
            arg2.field1226 = 150;
        }
        if ((arg3 & 0x2) != 0) {
            int var10 = arg0.method2843();
            if (var10 > 0) {
                for (int var11 = 0; var11 < var10; var11++) {
                    int var12 = -1;
                    int var13 = -1;
                    int var14 = -1;
                    int var15 = arg0.method3016();
                    if (var15 == 32767) {
                        var15 = arg0.method3016();
                        var13 = arg0.method3016();
                        var12 = arg0.method3016();
                        var14 = arg0.method3016();
                    } else if (var15 == 32766) {
                        var15 = -1;
                    } else {
                        var13 = arg0.method3016();
                    }
                    int var16 = arg0.method3016();
                    arg2.method1372(var15, var13, var12, var14, client.field929, var16);
                }
            }
            int var17 = arg0.method2843();
            if (var17 > 0) {
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = arg0.method3016();
                    int var20 = arg0.method3016();
                    if (var20 == 32767) {
                        arg2.method1365(var19);
                    } else {
                        int var21 = arg0.method3016();
                        int var22 = arg0.method2843();
                        int var23 = var20 > 0 ? arg0.method2843() : var22;
                        arg2.method1364(var19, client.field929, var20, var21, var22, var23);
                    }
                }
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1238 = arg0.method2861();
            if (arg2.field1252 == 0) {
                arg2.field1257 = arg2.field1238;
                arg2.field1238 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            int var24 = arg0.method2861();
            class231 var25 = (class231) class169.method454(class231.method4044(), arg0.method2843());
            boolean var26 = arg0.method2843() == 1;
            int var27 = arg0.method2843();
            int var28 = arg0.field2357;
            if (arg2.field884 != null && arg2.field888 != null) {
                boolean var29 = false;
                if (var25.field3140 && client.method645(arg2.field884)) {
                    var29 = true;
                }
                if (!var29 && client.field1024 == 0 && !arg2.field894) {
                    field1465.field2357 = 0;
                    arg0.method2870(field1465.field2355, 0, var27);
                    field1465.field2357 = 0;
                    class174 var30 = field1465;
                    String var31 = class266.method228(var30, 32767);
                    String var32 = class265.method4330(class271.method3577(var31));
                    arg2.field1223 = var32.trim();
                    arg2.field1227 = var24 >> 8;
                    arg2.field1228 = var24 & 0xFF;
                    arg2.field1226 = 150;
                    arg2.field1224 = var26;
                    arg2.field1225 = Statics.field3110 != arg2 && var25.field3140 && client.field1123 != "" && var32.toLowerCase().indexOf(client.field1123) == -1;
                    int var33;
                    if (var25.field3148) {
                        var33 = var26 ? 91 : 1;
                    } else {
                        var33 = var26 ? 90 : 2;
                    }
                    if (var25.field3147 == -1) {
                        class99.method1574(var33, arg2.field884, var32);
                    } else {
                        int var35 = var25.field3147;
                        String var36 = "<img=" + var35 + ">";
                        class99.method1574(var33, var36 + arg2.field884, var32);
                    }
                }
            }
            arg0.field2357 = var27 + var28;
        }
        if ((arg3 & 0x200) != 0) {
            arg2.field1247 = arg0.method2861();
            int var37 = arg0.method2987();
            arg2.field1251 = var37 >> 16;
            arg2.field1213 = (var37 & 0xFFFF) + client.field929;
            arg2.field1248 = 0;
            arg2.field1249 = 0;
            if (arg2.field1213 > client.field929) {
                arg2.field1248 = -1;
            }
            if (arg2.field1247 == 65535) {
                arg2.field1247 = -1;
            }
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1237 = arg0.method3014();
            arg2.field1254 = arg0.method3014();
            arg2.field1266 = arg0.method3014();
            arg2.field1255 = arg0.method3014();
            arg2.field1256 = arg0.method2861() + client.field929;
            arg2.field1269 = arg0.method2861() + client.field929;
            arg2.field1258 = arg0.method2861();
            if (arg2.field899) {
                arg2.field1237 += arg2.field900;
                arg2.field1254 += arg2.field901;
                arg2.field1266 += arg2.field900;
                arg2.field1255 += arg2.field901;
                arg2.field1252 = 0;
            } else {
                arg2.field1237 += arg2.field1210[0];
                arg2.field1254 += arg2.field1264[0];
                arg2.field1266 += arg2.field1210[0];
                arg2.field1255 += arg2.field1264[0];
                arg2.field1252 = 1;
            }
            arg2.field1220 = 0;
        }
        if ((arg3 & 0x400) != 0) {
            field1468[arg1] = arg0.method3014();
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method3014();
        }
        if ((arg3 & 0x1000) != 0) {
            for (int var38 = 0; var38 < 3; var38++) {
                arg2.field881[var38] = arg0.method2867();
            }
        }
        if (!arg2.field899) {
            return;
        }
        if (var4 == 127) {
            arg2.method985(arg2.field900, arg2.field901);
            return;
        }
        byte var39;
        if (var4 == -1) {
            var39 = field1468[arg1];
        } else {
            var39 = var4;
        }
        arg2.method984(arg2.field900, arg2.field901, var39);
    }

    @ObfuscatedName("ai.s(I)V")
    public static void method533() {
        field1470 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field1476[var0] = null;
            field1468[var0] = 1;
        }
    }
}

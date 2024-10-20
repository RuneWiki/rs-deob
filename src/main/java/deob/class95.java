package deob;

@ObfuscatedName("cp")
public class class95 {

    @ObfuscatedName("cp.y")
    public static byte[] field1403 = new byte[2048];

    @ObfuscatedName("cp.r")
    public static byte[] field1402 = new byte[2048];

    @ObfuscatedName("cp.h")
    public static class185[] field1405 = new class185[2048];

    @ObfuscatedName("cp.d")
    public static int field1406 = 0;

    @ObfuscatedName("cp.s")
    public static int[] field1410 = new int[2048];

    @ObfuscatedName("cp.b")
    public static int field1408 = 0;

    @ObfuscatedName("cp.e")
    public static int[] field1413 = new int[2048];

    @ObfuscatedName("cp.f")
    public static int[] field1407 = new int[2048];

    @ObfuscatedName("cp.z")
    public static int[] field1411 = new int[2048];

    @ObfuscatedName("cp.u")
    public static int[] field1412 = new int[2048];

    @ObfuscatedName("cp.p")
    public static int field1404 = 0;

    @ObfuscatedName("cp.w")
    public static int[] field1414 = new int[2048];

    @ObfuscatedName("cp.t")
    public static class185 field1415 = new class185(new byte[5000]);

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jf.n(Lgr;I)V")
    public static final void method4522(class191 arg0) {
        arg0.method3285();
        int var1 = client.field977;
        class74 var2 = Statics.field289 = client.field900[var1] = new class74();
        var2.field843 = var1;
        int var3 = arg0.method3286(30);
        byte var4 = (byte) (var3 >> 28);
        int var5 = var3 >> 14 & 0x3FFF;
        int var6 = var3 & 0x3FFF;
        var2.field1199[0] = var5 - Statics.field2458;
        var2.field1155 = (var2.field1199[0] << 7) + (var2.method1052() << 6);
        var2.field1164[0] = var6 - Statics.field1288;
        var2.field1151 = (var2.field1164[0] << 7) + (var2.method1052() << 6);
        Statics.field226 = var2.field857 = var4;
        if (field1405[var1] != null) {
            var2.method1039(field1405[var1]);
        }
        field1406 = 0;
        field1410[++field1406 - 1] = var1;
        field1403[var1] = 0;
        field1408 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            if (var1 != var7) {
                int var8 = arg0.method3286(18);
                int var9 = var8 >> 16;
                int var10 = var8 >> 8 & 0x255;
                int var11 = var8 & 0x255;
                field1407[var7] = (var9 << 28) + (var10 << 14) + var11;
                field1411[var7] = 0;
                field1412[var7] = -1;
                field1413[++field1408 - 1] = var7;
                field1403[var7] = 0;
            }
        }
        arg0.method3287();
    }

    @ObfuscatedName("at.v(Lgr;II)V")
    public static final void method221(class191 arg0, int arg1) {
        int var2 = arg0.field2529;
        field1404 = 0;
        int var3 = 0;
        arg0.method3285();
        for (int var4 = 0; var4 < field1406; var4++) {
            int var5 = field1410[var4];
            if ((field1403[var5] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1403[var5] = (byte) (field1403[var5] | 0x2);
                } else {
                    int var6 = arg0.method3286(1);
                    if (var6 == 0) {
                        var3 = method1704(arg0);
                        field1403[var5] = (byte) (field1403[var5] | 0x2);
                    } else {
                        method2930(arg0, var5);
                    }
                }
            }
        }
        arg0.method3287();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3285();
        for (int var7 = 0; var7 < field1406; var7++) {
            int var8 = field1410[var7];
            if ((field1403[var8] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1403[var8] = (byte) (field1403[var8] | 0x2);
                } else {
                    int var9 = arg0.method3286(1);
                    if (var9 == 0) {
                        var3 = method1704(arg0);
                        field1403[var8] = (byte) (field1403[var8] | 0x2);
                    } else {
                        method2930(arg0, var8);
                    }
                }
            }
        }
        arg0.method3287();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3285();
        for (int var10 = 0; var10 < field1408; var10++) {
            int var11 = field1413[var10];
            if ((field1403[var11] & 0x1) != 0) {
                if (var3 > 0) {
                    var3--;
                    field1403[var11] = (byte) (field1403[var11] | 0x2);
                } else {
                    int var12 = arg0.method3286(1);
                    if (var12 == 0) {
                        var3 = method1704(arg0);
                        field1403[var11] = (byte) (field1403[var11] | 0x2);
                    } else if (Statics.method78(arg0, var11)) {
                        field1403[var11] = (byte) (field1403[var11] | 0x2);
                    }
                }
            }
        }
        arg0.method3287();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        arg0.method3285();
        for (int var13 = 0; var13 < field1408; var13++) {
            int var14 = field1413[var13];
            if ((field1403[var14] & 0x1) == 0) {
                if (var3 > 0) {
                    var3--;
                    field1403[var14] = (byte) (field1403[var14] | 0x2);
                } else {
                    int var15 = arg0.method3286(1);
                    if (var15 == 0) {
                        var3 = method1704(arg0);
                        field1403[var14] = (byte) (field1403[var14] | 0x2);
                    } else if (Statics.method78(arg0, var14)) {
                        field1403[var14] = (byte) (field1403[var14] | 0x2);
                    }
                }
            }
        }
        arg0.method3287();
        if (var3 != 0) {
            throw new RuntimeException();
        }
        field1406 = 0;
        field1408 = 0;
        for (int var16 = 1; var16 < 2048; var16++) {
            field1403[var16] = (byte) (field1403[var16] >> 1);
            class74 var17 = client.field900[var16];
            if (var17 == null) {
                field1413[++field1408 - 1] = var16;
            } else {
                field1410[++field1406 - 1] = var16;
            }
        }
        for (int var18 = 0; var18 < field1404; var18++) {
            int var19 = field1414[var18];
            class74 var20 = client.field900[var19];
            int var21 = arg0.method3021();
            if ((var21 & 0x80) != 0) {
                var21 += arg0.method3021() << 8;
            }
            method658(arg0, var19, var20, var21);
        }
        if (arg0.field2529 - var2 != arg1) {
            throw new RuntimeException(arg0.field2529 - var2 + " " + arg1);
        }
    }

    @ObfuscatedName("cn.y(Lgr;B)I")
    public static int method1704(class191 arg0) {
        int var1 = arg0.method3286(2);
        int var2;
        if (var1 == 0) {
            var2 = 0;
        } else if (var1 == 1) {
            var2 = arg0.method3286(5);
        } else if (var1 == 2) {
            var2 = arg0.method3286(8);
        } else {
            var2 = arg0.method3286(11);
        }
        return var2;
    }

    @ObfuscatedName("fn.r(Lgr;II)V")
    public static void method2930(class191 arg0, int arg1) {
        boolean var2 = arg0.method3286(1) == 1;
        if (var2) {
            field1414[++field1404 - 1] = arg1;
        }
        int var3 = arg0.method3286(2);
        class74 var4 = client.field900[arg1];
        if (var3 == 0) {
            if (var2) {
                var4.field859 = false;
            } else if (client.field977 == arg1) {
                throw new RuntimeException();
            } else {
                field1407[arg1] = (Statics.field1288 + var4.field1164[0] >> 13) + (Statics.field2458 + var4.field1199[0] >> 13 << 14) + (var4.field857 << 28);
                if (var4.field1178 == -1) {
                    field1411[arg1] = var4.field1166;
                } else {
                    field1411[arg1] = var4.field1178;
                }
                field1412[arg1] = var4.field1195;
                client.field900[arg1] = null;
                if (arg0.method3286(1) != 0) {
                    Statics.method78(arg0, arg1);
                }
            }
        } else if (var3 == 1) {
            int var5 = arg0.method3286(3);
            int var6 = var4.field1199[0];
            int var7 = var4.field1164[0];
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
            if (client.field977 == arg1 && var4.field1155 < 1536 || var4.field1151 < 1536 || var4.field1155 >= 11776 || var4.field1151 >= 11776) {
                var4.method1057(var6, var7);
                var4.field859 = false;
            } else if (var2) {
                var4.field859 = true;
                var4.field840 = var6;
                var4.field836 = var7;
            } else {
                var4.field859 = false;
                var4.method1054(var6, var7, field1402[arg1]);
            }
        } else if (var3 == 2) {
            int var8 = arg0.method3286(4);
            int var9 = var4.field1199[0];
            int var10 = var4.field1164[0];
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
            if (client.field977 == arg1 && var4.field1155 < 1536 || var4.field1151 < 1536 || var4.field1155 >= 11776 || var4.field1151 >= 11776) {
                var4.method1057(var9, var10);
                var4.field859 = false;
            } else if (var2) {
                var4.field859 = true;
                var4.field840 = var9;
                var4.field836 = var10;
            } else {
                var4.field859 = false;
                var4.method1054(var9, var10, field1402[arg1]);
            }
        } else {
            int var11 = arg0.method3286(1);
            if (var11 == 0) {
                int var12 = arg0.method3286(12);
                int var13 = var12 >> 10;
                int var14 = var12 >> 5 & 0x1F;
                if (var14 > 15) {
                    var14 -= 32;
                }
                int var15 = var12 & 0x1F;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var4.field1199[0] + var14;
                int var17 = var4.field1164[0] + var15;
                if (client.field977 == arg1 && var4.field1155 < 1536 || var4.field1151 < 1536 || var4.field1155 >= 11776 || var4.field1151 >= 11776) {
                    var4.method1057(var16, var17);
                    var4.field859 = false;
                } else if (var2) {
                    var4.field859 = true;
                    var4.field840 = var16;
                    var4.field836 = var17;
                } else {
                    var4.field859 = false;
                    var4.method1054(var16, var17, field1402[arg1]);
                }
                var4.field857 = (byte) (var4.field857 + var13 & 0x3);
                if (client.field977 == arg1) {
                    Statics.field226 = var4.field857;
                }
            } else {
                int var18 = arg0.method3286(30);
                int var19 = var18 >> 28;
                int var20 = var18 >> 14 & 0x3FFF;
                int var21 = var18 & 0x3FFF;
                int var22 = (Statics.field2458 + var4.field1199[0] + var20 & 0x3FFF) - Statics.field2458;
                int var23 = (Statics.field1288 + var4.field1164[0] + var21 & 0x3FFF) - Statics.field1288;
                if (client.field977 == arg1 && var4.field1155 < 1536 || var4.field1151 < 1536 || var4.field1155 >= 11776 || var4.field1151 >= 11776) {
                    var4.method1057(var22, var23);
                    var4.field859 = false;
                } else if (var2) {
                    var4.field859 = true;
                    var4.field840 = var22;
                    var4.field836 = var23;
                } else {
                    var4.field859 = false;
                    var4.method1054(var22, var23, field1402[arg1]);
                }
                var4.field857 = (byte) (var4.field857 + var19 & 0x3);
                if (client.field977 == arg1) {
                    Statics.field226 = var4.field857;
                }
            }
        }
    }

    @ObfuscatedName("ap.d(Lgr;ILbf;IB)V")
    public static final void method658(class191 arg0, int arg1, class74 arg2, int arg3) {
        byte var4 = -1;
        if ((arg3 & 0x1000) != 0) {
            arg2.field1187 = arg0.method3204();
            int var5 = arg0.method3026();
            arg2.field1191 = var5 >> 16;
            arg2.field1190 = (var5 & 0xFFFF) + client.field883;
            arg2.field1188 = 0;
            arg2.field1189 = 0;
            if (arg2.field1190 > client.field883) {
                arg2.field1188 = -1;
            }
            if (arg2.field1187 == 65535) {
                arg2.field1187 = -1;
            }
        }
        if ((arg3 & 0x20) != 0) {
            arg2.field1195 = arg0.method3023();
            if (arg2.field1195 == 65535) {
                arg2.field1195 = -1;
            }
        }
        if ((arg3 & 0x200) != 0) {
            for (int var6 = 0; var6 < 3; var6++) {
                arg2.field861[var6] = arg0.method3030();
            }
        }
        if ((arg3 & 0x10) != 0) {
            int var7 = arg0.method3204();
            class242[] var8 = new class242[] { class242.field3274, class242.field3276, class242.field3283, class242.field3279, class242.field3273, class242.field3277 };
            class242 var9 = (class242) class180.method455(var8, arg0.method3049());
            boolean var10 = arg0.method3121() == 1;
            int var11 = arg0.method3021();
            int var12 = arg0.field2529;
            if (arg2.field860 != null && arg2.field858 != null) {
                boolean var13 = false;
                if (var9.field3282 && client.method314(arg2.field860)) {
                    var13 = true;
                }
                if (!var13 && client.field891 == 0 && !arg2.field856) {
                    field1415.field2529 = 0;
                    arg0.method3165(field1415.field2528, 0, var11);
                    field1415.field2529 = 0;
                    String var14 = class276.method4581(class282.method2834(class277.method2724(field1415)));
                    arg2.field1163 = var14.trim();
                    arg2.field1167 = var7 >> 8;
                    arg2.field1168 = var7 & 0xFF;
                    arg2.field1170 = 150;
                    arg2.field1196 = var10;
                    arg2.field1165 = Statics.field289 != arg2 && var9.field3282 && client.field886 != "" && var14.toLowerCase().indexOf(client.field886) == -1;
                    int var15;
                    if (var9.field3281) {
                        var15 = var10 ? 91 : 1;
                    } else {
                        var15 = var10 ? 90 : 2;
                    }
                    if (var9.field3280 == -1) {
                        class97.method1495(var15, arg2.field860, var14);
                    } else {
                        class97.method1495(var15, class88.method1575(var9.field3280) + arg2.field860, var14);
                    }
                }
            }
            arg0.field2529 = var11 + var12;
        }
        if ((arg3 & 0x2) != 0) {
            int var16 = arg0.method3121();
            byte[] var17 = new byte[var16];
            class185 var18 = new class185(var17);
            arg0.method3165(var17, 0, var16);
            field1405[arg1] = var18;
            arg2.method1039(var18);
        }
        if ((arg3 & 0x400) != 0) {
            field1402[arg1] = arg0.method3054();
        }
        if ((arg3 & 0x800) != 0) {
            arg2.field1192 = arg0.method3053();
            arg2.field1194 = arg0.method3081();
            arg2.field1175 = arg0.method3053();
            arg2.field1207 = arg0.method3081();
            arg2.field1201 = arg0.method3023() + client.field883;
            arg2.field1197 = arg0.method3023() + client.field883;
            arg2.field1198 = arg0.method3204();
            if (arg2.field859) {
                arg2.field1192 += arg2.field840;
                arg2.field1194 += arg2.field836;
                arg2.field1175 += arg2.field840;
                arg2.field1207 += arg2.field836;
                arg2.field1204 = 0;
            } else {
                arg2.field1192 += arg2.field1199[0];
                arg2.field1194 += arg2.field1164[0];
                arg2.field1175 += arg2.field1199[0];
                arg2.field1207 += arg2.field1164[0];
                arg2.field1204 = 1;
            }
            arg2.field1209 = 0;
        }
        if ((arg3 & 0x4) != 0) {
            int var19 = arg0.method3204();
            if (var19 == 65535) {
                var19 = -1;
            }
            int var20 = arg0.method3021();
            client.method199(arg2, var19, var20);
        }
        if ((arg3 & 0x100) != 0) {
            var4 = arg0.method3053();
        }
        if ((arg3 & 0x40) != 0) {
            int var21 = arg0.method3049();
            if (var21 > 0) {
                for (int var22 = 0; var22 < var21; var22++) {
                    int var23 = -1;
                    int var24 = -1;
                    int var25 = -1;
                    int var26 = arg0.method3232();
                    if (var26 == 32767) {
                        var26 = arg0.method3232();
                        var24 = arg0.method3232();
                        var23 = arg0.method3232();
                        var25 = arg0.method3232();
                    } else if (var26 == 32766) {
                        var26 = -1;
                    } else {
                        var24 = arg0.method3232();
                    }
                    int var27 = arg0.method3232();
                    arg2.method1434(var26, var24, var23, var25, client.field883, var27);
                }
            }
            int var28 = arg0.method3121();
            if (var28 > 0) {
                for (int var29 = 0; var29 < var28; var29++) {
                    int var30 = arg0.method3232();
                    int var31 = arg0.method3232();
                    if (var31 == 32767) {
                        arg2.method1433(var30);
                    } else {
                        int var32 = arg0.method3232();
                        int var33 = arg0.method3060();
                        int var34 = var31 > 0 ? arg0.method3060() : var33;
                        arg2.method1432(var30, client.field883, var31, var32, var33, var34);
                    }
                }
            }
        }
        if ((arg3 & 0x1) != 0) {
            arg2.field1178 = arg0.method3023();
            if (arg2.field1204 == 0) {
                arg2.field1166 = arg2.field1178;
                arg2.field1178 = -1;
            }
        }
        if ((arg3 & 0x8) != 0) {
            arg2.field1163 = arg0.method3030();
            if (arg2.field1163.charAt(0) == '~') {
                arg2.field1163 = arg2.field1163.substring(1);
                class97.method1495(2, arg2.field860, arg2.field1163);
            } else if (Statics.field289 == arg2) {
                class97.method1495(2, arg2.field860, arg2.field1163);
            }
            arg2.field1196 = false;
            arg2.field1167 = 0;
            arg2.field1168 = 0;
            arg2.field1170 = 150;
        }
        if (!arg2.field859) {
            return;
        }
        if (var4 == 127) {
            arg2.method1057(arg2.field840, arg2.field836);
            return;
        }
        byte var35;
        if (var4 == -1) {
            var35 = field1402[arg1];
        } else {
            var35 = var4;
        }
        arg2.method1054(arg2.field840, arg2.field836, var35);
    }
}

package deob;

@ObfuscatedName("cb")
public class class93 {

    @ObfuscatedName("cb.c")
    public static int field1419 = 0;

    @ObfuscatedName("cb.r")
    public static int field1426 = field1419 + 202;

    @ObfuscatedName("cb.y")
    public static int[] field1424 = new int[256];

    @ObfuscatedName("cb.x")
    public static int field1425 = 0;

    @ObfuscatedName("cb.b")
    public static int field1440 = 0;

    @ObfuscatedName("cb.am")
    public static int field1427 = 0;

    @ObfuscatedName("cb.ab")
    public static int field1428 = 0;

    @ObfuscatedName("cb.af")
    public static int field1422 = 0;

    @ObfuscatedName("cb.aa")
    public static int field1431 = 0;

    @ObfuscatedName("cb.aq")
    public static int field1436 = 10;

    @ObfuscatedName("cb.aj")
    public static String field1432 = "";

    @ObfuscatedName("cb.as")
    public static int field1433 = 0;

    @ObfuscatedName("cb.av")
    public static String field1434 = "";

    @ObfuscatedName("cb.ao")
    public static String field1423 = "";

    @ObfuscatedName("cb.ag")
    public static String field1429 = "";

    @ObfuscatedName("cb.ay")
    public static String field1445 = "";

    @ObfuscatedName("cb.ax")
    public static String field1438 = "";

    @ObfuscatedName("cb.ad")
    public static String field1435 = "";

    @ObfuscatedName("cb.ae")
    public static class150 field1418 = class150.field2194;

    @ObfuscatedName("cb.ah")
    public static boolean field1430 = true;

    @ObfuscatedName("cb.at")
    public static int field1442 = 0;

    @ObfuscatedName("cb.al")
    public static String field1443 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cb.au")
    public static String field1444 = "1234567890";

    @ObfuscatedName("cb.aw")
    public static boolean field1437 = false;

    @ObfuscatedName("cb.bf")
    public static int field1446 = -1;

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.s(I)I")
    public static int method628() {
        return 9;
    }

    @ObfuscatedName("ai.c(Liw;Liw;ZII)V")
    public static void method661(class239 arg0, class239 arg1, boolean arg2, int arg3) {
        if (!Statics.field1441) {
            field1433 = arg3;
            class285.method4659();
            byte[] var4 = arg0.method3899("title.jpg", "");
            Statics.field3327 = class55.method4291(var4);
            Statics.field1439 = Statics.field3327.method4764();
            if ((client.field950 & 0x20000000) == 0) {
                Statics.field1477 = class290.method150(arg1, "logo", "");
            } else {
                Statics.field1477 = class290.method150(arg1, "logo_deadman_mode", "");
            }
            Statics.field1420 = class290.method150(arg1, "titlebox", "");
            Statics.field1421 = class290.method150(arg1, "titlebutton", "");
            Statics.field2861 = class290.method1401(arg1, "runes", "");
            Statics.field3905 = class290.method1401(arg1, "title_mute", "");
            Statics.field864 = class290.method150(arg1, "options_radio_buttons,0", "");
            Statics.field3224 = class290.method150(arg1, "options_radio_buttons,2", "");
            Statics.field1392 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field1392[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1392[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1392[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1392[var8 + 192] = 16777215;
            }
            Statics.field33 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field33[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field33[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field33[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field33[var12 + 192] = 16777215;
            }
            Statics.field341 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field341[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field341[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field341[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field341[var16 + 192] = 16777215;
            }
            Statics.field350 = new int[256];
            Statics.field2128 = new int[32768];
            Statics.field3161 = new int[32768];
            method4623((class288) null);
            Statics.field301 = new int[32768];
            Statics.field311 = new int[32768];
            if (arg2) {
                field1438 = "";
                field1435 = "";
            }
            Statics.field1351 = 0;
            Statics.field844 = "";
            field1430 = true;
            field1437 = false;
            if (Statics.field1375.field1315) {
                class207.field2523 = 1;
                Statics.field3408 = null;
                Statics.field1408 = -1;
                Statics.field3684 = -1;
                Statics.field2526 = 0;
                Statics.field353 = false;
                Statics.field2525 = 2;
            } else {
                class207.method1556(2, Statics.field666, "scape main", "", 255, false);
            }
            class242.method2885(false);
            Statics.field1441 = true;
            field1419 = (Statics.field35 - 765) / 2;
            field1426 = field1419 + 202;
            Statics.field3327.method4773(field1419, 0);
            Statics.field1439.method4773(field1419 + 382, 0);
            Statics.field1477.method4744(field1419 + 382 - Statics.field1477.field3782 / 2, 18);
        } else if (arg3 == 4) {
            field1433 = 4;
        }
    }

    @ObfuscatedName("o.f(I)V")
    public static void method48() {
        if (!Statics.field1441) {
            return;
        }
        Statics.field1420 = null;
        Statics.field1421 = null;
        Statics.field2861 = null;
        Statics.field3327 = null;
        Statics.field1439 = null;
        Statics.field1477 = null;
        Statics.field3905 = null;
        Statics.field864 = null;
        Statics.field3224 = null;
        Statics.field332 = null;
        Statics.field3691 = null;
        Statics.field339 = null;
        Statics.field906 = null;
        Statics.field1550 = null;
        Statics.field1392 = null;
        Statics.field33 = null;
        Statics.field341 = null;
        Statics.field350 = null;
        Statics.field2128 = null;
        Statics.field3161 = null;
        Statics.field301 = null;
        Statics.field311 = null;
        class207.field2523 = 1;
        Statics.field3408 = null;
        Statics.field1408 = -1;
        Statics.field3684 = -1;
        Statics.field2526 = 0;
        Statics.field353 = false;
        Statics.field2525 = 2;
        class242.method2885(true);
        Statics.field1441 = false;
    }

    @ObfuscatedName("ff.m(Lbc;I)V")
    public static void method2905(class59 arg0) {
        if (!field1437) {
            if ((class60.field735 == 1 || !Statics.field242 && class60.field735 == 4) && class60.field736 >= field1419 + 765 - 50 && class60.field724 >= 453) {
                Statics.field1375.field1315 = !Statics.field1375.field1315;
                class82.method221();
                if (Statics.field1375.field1315) {
                    class207.method2821();
                } else {
                    class241 var6 = Statics.field666;
                    int var7 = var6.method3855("scape main");
                    int var8 = var6.method3856(var7, "");
                    class207.method1045(var6, var7, var8, 255, false);
                }
            }
            if (client.field1175 != 5) {
                field1422++;
                if (client.field1175 == 10 || client.field1175 == 11) {
                    if (client.field1129 == 0) {
                        if (class60.field735 == 1 || !Statics.field242 && class60.field735 == 4) {
                            int var9 = field1419 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class60.field736 >= var9 && class60.field736 <= var9 + var11 && class60.field724 >= var10 && class60.field724 <= var10 + var12) {
                                method1034();
                                return;
                            }
                        }
                        if (Statics.field14 != null) {
                            method1034();
                        }
                    }
                    int var13 = class60.field735;
                    int var14 = class60.field736;
                    int var15 = class60.field724;
                    if (!Statics.field242 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field1433 == 0) {
                        boolean var16 = false;
                        while (Statics.method4403()) {
                            if (Statics.field2115 == 84) {
                                var16 = true;
                            }
                        }
                        int var17 = field1426 + 180 - 80;
                        short var18 = 291;
                        if (var13 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                            String var19 = client.method3235("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class57.method116(var19, true, "openjs", false);
                        }
                        int var20 = field1426 + 180 + 80;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20 || var16) {
                            if ((client.field950 & 0x2000000) != 0) {
                                field1434 = "";
                                field1423 = class229.field3095;
                                field1429 = class229.field3096;
                                field1445 = class229.field3044;
                                field1433 = 1;
                                field1442 = 0;
                            } else if ((client.field950 & 0x4) != 0) {
                                if ((client.field950 & 0x400) == 0) {
                                    field1423 = class229.field2981;
                                    field1429 = class229.field3087;
                                    field1445 = class229.field3106;
                                } else {
                                    field1423 = class229.field3026;
                                    field1429 = class229.field3093;
                                    field1445 = class229.field3094;
                                }
                                field1434 = class229.field3085;
                                field1433 = 1;
                                field1442 = 0;
                            } else if ((client.field950 & 0x400) == 0) {
                                field1423 = class229.field3082;
                                field1429 = class229.field3090;
                                field1445 = class229.field3084;
                                field1433 = 2;
                                field1442 = 0;
                            } else {
                                field1423 = class229.field3024;
                                field1429 = class229.field2892;
                                field1445 = class229.field3091;
                                field1434 = class229.field3085;
                                field1433 = 1;
                                field1442 = 0;
                            }
                        }
                    } else if (field1433 == 1) {
                        while (Statics.method4403()) {
                            if (Statics.field2115 == 84) {
                                field1423 = class229.field3082;
                                field1429 = class229.field3090;
                                field1445 = class229.field3084;
                                field1433 = 2;
                                field1442 = 0;
                            } else if (Statics.field2115 == 13) {
                                field1433 = 0;
                            }
                        }
                        int var21 = field1426 + 180 - 80;
                        short var22 = 321;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field1423 = class229.field3082;
                            field1429 = class229.field3090;
                            field1445 = class229.field3084;
                            field1433 = 2;
                            field1442 = 0;
                        }
                        int var23 = field1426 + 180 + 80;
                        if (var13 == 1 && var14 >= var23 - 75 && var14 <= var23 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field1433 = 0;
                        }
                    } else if (field1433 == 2) {
                        short var24 = 231;
                        int var47 = var24 + 30;
                        if (var13 == 1 && var15 >= var47 - 15 && var15 < var47) {
                            field1442 = 0;
                        }
                        var47 += 15;
                        if (var13 == 1 && var15 >= var47 - 15 && var15 < var47) {
                            field1442 = 1;
                        }
                        var47 += 15;
                        short var25 = 361;
                        if (var13 == 1 && var15 >= var25 - 15 && var15 < var25) {
                            Statics.method164(class229.field3129, class229.field3122, class229.field3145);
                            field1433 = 5;
                            return;
                        }
                        int var26 = field1426 + 180 - 80;
                        short var27 = 321;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field1438 = field1438.trim();
                            if (field1438.length() == 0) {
                                Statics.method164(class229.field2958, class229.field2989, class229.field2990);
                                return;
                            }
                            if (field1435.length() == 0) {
                                Statics.method164(class229.field2991, class229.field2992, class229.field2993);
                                return;
                            }
                            Statics.method164(class229.field3063, class229.field3105, class229.field3102);
                            field1418 = Statics.field1375.field1312.containsKey(class274.method3695(field1438)) ? class150.field2193 : class150.field2194;
                            client.method4463(20);
                            return;
                        }
                        int var28 = field1426 + 180 + 80;
                        if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field1433 = 0;
                            field1438 = "";
                            field1435 = "";
                            Statics.field1351 = 0;
                            Statics.field844 = "";
                            field1430 = true;
                        }
                        while (true) {
                            while (Statics.method4403()) {
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field1443.length(); var30++) {
                                    if (Statics.field442 == field1443.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2115 == 13) {
                                    field1433 = 0;
                                    field1438 = "";
                                    field1435 = "";
                                    Statics.field1351 = 0;
                                    Statics.field844 = "";
                                    field1430 = true;
                                } else if (field1442 == 0) {
                                    if (Statics.field2115 == 85 && field1438.length() > 0) {
                                        field1438 = field1438.substring(0, field1438.length() - 1);
                                    }
                                    if (Statics.field2115 == 84 || Statics.field2115 == 80) {
                                        field1442 = 1;
                                    }
                                    if (var29 && field1438.length() < 320) {
                                        field1438 = field1438 + Statics.field442;
                                    }
                                } else if (field1442 == 1) {
                                    if (Statics.field2115 == 85 && field1435.length() > 0) {
                                        field1435 = field1435.substring(0, field1435.length() - 1);
                                    }
                                    if (Statics.field2115 == 84 || Statics.field2115 == 80) {
                                        field1442 = 0;
                                    }
                                    if (Statics.field2115 == 84) {
                                        field1438 = field1438.trim();
                                        if (field1438.length() == 0) {
                                            Statics.method164(class229.field2958, class229.field2989, class229.field2990);
                                            return;
                                        }
                                        if (field1435.length() == 0) {
                                            Statics.method164(class229.field2991, class229.field2992, class229.field2993);
                                            return;
                                        }
                                        Statics.method164(class229.field3063, class229.field3105, class229.field3102);
                                        field1418 = Statics.field1375.field1312.containsKey(class274.method3695(field1438)) ? class150.field2193 : class150.field2194;
                                        client.method4463(20);
                                        return;
                                    }
                                    if (var29 && field1435.length() < 20) {
                                        field1435 = field1435 + Statics.field442;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1433 == 3) {
                        int var31 = field1426 + 180;
                        short var32 = 276;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            field1423 = class229.field3082;
                            field1429 = class229.field3090;
                            field1445 = class229.field3084;
                            field1433 = 2;
                            field1442 = 0;
                        }
                        int var33 = field1426 + 180;
                        short var34 = 326;
                        if (var13 == 1 && var14 >= var33 - 75 && var14 <= var33 + 75 && var15 >= var34 - 20 && var15 <= var34 + 20) {
                            Statics.method164(class229.field3129, class229.field3122, class229.field3145);
                            field1433 = 5;
                            return;
                        }
                    } else if (field1433 == 4) {
                        int var35 = field1426 + 180 - 80;
                        short var36 = 321;
                        if (var13 == 1 && var14 >= var35 - 75 && var14 <= var35 + 75 && var15 >= var36 - 20 && var15 <= var36 + 20) {
                            Statics.field844.trim();
                            if (Statics.field844.length() != 6) {
                                Statics.method164(class229.field2907, class229.field2951, class229.field2909);
                                return;
                            }
                            Statics.field1351 = Integer.parseInt(Statics.field844);
                            Statics.field844 = "";
                            field1418 = field1430 ? class150.field2197 : class150.field2195;
                            Statics.method164(class229.field3063, class229.field3105, class229.field3102);
                            client.method4463(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field1426 + 180 - 9 && var14 <= field1426 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field1430 = !field1430;
                        }
                        if (var13 == 1 && var14 >= field1426 + 180 - 34 && var14 <= field1426 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            String var37 = client.method3235("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class57.method116(var37, true, "openjs", false);
                        }
                        int var38 = field1426 + 180 + 80;
                        if (var13 == 1 && var14 >= var38 - 75 && var14 <= var38 + 75 && var15 >= var36 - 20 && var15 <= var36 + 20) {
                            field1433 = 0;
                            field1438 = "";
                            field1435 = "";
                            Statics.field1351 = 0;
                            Statics.field844 = "";
                        }
                        while (Statics.method4403()) {
                            boolean var39 = false;
                            for (int var40 = 0; var40 < field1444.length(); var40++) {
                                if (Statics.field442 == field1444.charAt(var40)) {
                                    var39 = true;
                                    break;
                                }
                            }
                            if (Statics.field2115 == 13) {
                                field1433 = 0;
                                field1438 = "";
                                field1435 = "";
                                Statics.field1351 = 0;
                                Statics.field844 = "";
                            } else {
                                if (Statics.field2115 == 85 && Statics.field844.length() > 0) {
                                    Statics.field844 = Statics.field844.substring(0, Statics.field844.length() - 1);
                                }
                                if (Statics.field2115 == 84) {
                                    Statics.field844.trim();
                                    if (Statics.field844.length() != 6) {
                                        Statics.method164(class229.field2907, class229.field2951, class229.field2909);
                                        return;
                                    }
                                    Statics.field1351 = Integer.parseInt(Statics.field844);
                                    Statics.field844 = "";
                                    field1418 = field1430 ? class150.field2197 : class150.field2195;
                                    Statics.method164(class229.field3063, class229.field3105, class229.field3102);
                                    client.method4463(20);
                                    return;
                                }
                                if (var39 && Statics.field844.length() < 6) {
                                    Statics.field844 = Statics.field844 + Statics.field442;
                                }
                            }
                        }
                    } else if (field1433 == 5) {
                        int var41 = field1426 + 180 - 80;
                        short var42 = 321;
                        if (var13 == 1 && var14 >= var41 - 75 && var14 <= var41 + 75 && var15 >= var42 - 20 && var15 <= var42 + 20) {
                            method1005();
                            return;
                        }
                        int var43 = field1426 + 180 + 80;
                        if (var13 == 1 && var14 >= var43 - 75 && var14 <= var43 + 75 && var15 >= var42 - 20 && var15 <= var42 + 20) {
                            field1423 = class229.field3082;
                            field1429 = class229.field3090;
                            field1445 = class229.field3084;
                            field1433 = 2;
                            field1442 = 0;
                            field1435 = "";
                        }
                        while (Statics.method4403()) {
                            boolean var44 = false;
                            for (int var45 = 0; var45 < field1443.length(); var45++) {
                                if (Statics.field442 == field1443.charAt(var45)) {
                                    var44 = true;
                                    break;
                                }
                            }
                            if (Statics.field2115 == 13) {
                                field1423 = class229.field3082;
                                field1429 = class229.field3090;
                                field1445 = class229.field3084;
                                field1433 = 2;
                                field1442 = 0;
                                field1435 = "";
                            } else {
                                if (Statics.field2115 == 85 && field1438.length() > 0) {
                                    field1438 = field1438.substring(0, field1438.length() - 1);
                                }
                                if (Statics.field2115 == 84) {
                                    method1005();
                                    return;
                                }
                                if (var44 && field1438.length() < 320) {
                                    field1438 = field1438 + Statics.field442;
                                }
                            }
                        }
                    } else if (field1433 == 6) {
                        while (true) {
                            do {
                                if (!Statics.method4403()) {
                                    short var46 = 321;
                                    if (var13 == 1 && var15 >= var46 - 20 && var15 <= var46 + 20) {
                                        field1423 = class229.field3082;
                                        field1429 = class229.field3090;
                                        field1445 = class229.field3084;
                                        field1433 = 2;
                                        field1442 = 0;
                                        field1435 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2115 != 84 && Statics.field2115 != 13);
                            field1423 = class229.field3082;
                            field1429 = class229.field3090;
                            field1445 = class229.field3084;
                            field1433 = 2;
                            field1442 = 0;
                            field1435 = "";
                        }
                    }
                }
            }
        } else if (class60.field735 == 1 || !Statics.field242 && class60.field735 == 4) {
            int var1 = field1419 + 280;
            if (class60.field736 >= var1 && class60.field736 <= var1 + 14 && class60.field724 >= 4 && class60.field724 <= 18) {
                class81.method2810(0, 0);
            } else if (class60.field736 >= var1 + 15 && class60.field736 <= var1 + 80 && class60.field724 >= 4 && class60.field724 <= 18) {
                class81.method2810(0, 1);
            } else {
                int var2 = field1419 + 390;
                if (class60.field736 >= var2 && class60.field736 <= var2 + 14 && class60.field724 >= 4 && class60.field724 <= 18) {
                    class81.method2810(1, 0);
                } else if (class60.field736 >= var2 + 15 && class60.field736 <= var2 + 80 && class60.field724 >= 4 && class60.field724 <= 18) {
                    class81.method2810(1, 1);
                } else {
                    int var3 = field1419 + 500;
                    if (class60.field736 >= var3 && class60.field736 <= var3 + 14 && class60.field724 >= 4 && class60.field724 <= 18) {
                        class81.method2810(2, 0);
                    } else if (class60.field736 >= var3 + 15 && class60.field736 <= var3 + 80 && class60.field724 >= 4 && class60.field724 <= 18) {
                        class81.method2810(2, 1);
                    } else {
                        int var4 = field1419 + 610;
                        if (class60.field736 >= var4 && class60.field736 <= var4 + 14 && class60.field724 >= 4 && class60.field724 <= 18) {
                            class81.method2810(3, 0);
                        } else if (class60.field736 >= var4 + 15 && class60.field736 <= var4 + 80 && class60.field724 >= 4 && class60.field724 <= 18) {
                            class81.method2810(3, 1);
                        } else if (class60.field736 >= field1419 + 708 && class60.field724 >= 4 && class60.field736 <= field1419 + 708 + 50 && class60.field724 <= 20) {
                            field1437 = false;
                            Statics.field3327.method4773(field1419, 0);
                            Statics.field1439.method4773(field1419 + 382, 0);
                            Statics.field1477.method4744(field1419 + 382 - Statics.field1477.field3782 / 2, 18);
                        } else if (field1446 != -1) {
                            class81 var5 = Statics.field1294[field1446];
                            method806(var5);
                            field1437 = false;
                            Statics.field3327.method4773(field1419, 0);
                            Statics.field1439.method4773(field1419 + 382, 0);
                            Statics.field1477.method4744(field1419 + 382 - Statics.field1477.field3782 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bt.h(I)V")
    public static void method1005() {
        field1438 = field1438.trim();
        if (field1438.length() == 0) {
            Statics.method164(class229.field3129, class229.field3122, class229.field3145);
            return;
        }
        long var0 = class88.method3736();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class88.method169(var0, field1438);
        }
        switch(var2) {
            case 2:
                Statics.method164(class229.field2940, class229.field3125, class229.field3126);
                field1433 = 6;
                break;
            case 3:
                Statics.method164(class229.field2930, class229.field3134, class229.field3127);
                break;
            case 4:
                Statics.method164(class229.field2908, class229.field3007, class229.field3132);
                break;
            case 5:
                Statics.method164(class229.field2955, class229.field2986, class229.field3135);
                break;
            case 6:
                Statics.method164(class229.field3136, class229.field3137, class229.field3138);
                break;
            case 7:
                Statics.method164(class229.field3139, class229.field3029, class229.field3141);
        }
    }

    @ObfuscatedName("bs.t(Ljb;Ljb;Ljb;ZB)V")
    public static void method906(class267 arg0, class267 arg1, class267 arg2, boolean arg3) {
        if (arg3) {
            field1419 = (Statics.field35 - 765) / 2;
            field1426 = field1419 + 202;
        }
        if (field1437) {
            if (Statics.field332 == null) {
                Statics.field332 = class290.method1672(Statics.field3399, "sl_back", "");
            }
            if (Statics.field3691 == null) {
                Statics.field3691 = class290.method1401(Statics.field3399, "sl_flags", "");
            }
            if (Statics.field339 == null) {
                Statics.field339 = class290.method1401(Statics.field3399, "sl_arrows", "");
            }
            if (Statics.field906 == null) {
                Statics.field906 = class290.method1401(Statics.field3399, "sl_stars", "");
            }
            class285.method4701(field1419, 23, 765, 480, 0);
            class285.method4668(field1419, 0, 125, 23, 12425273, 9135624);
            class285.method4668(field1419 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4490(class229.field3142, field1419 + 62, 15, 0, -1);
            if (Statics.field906 != null) {
                Statics.field906[1].method4744(field1419 + 140, 1);
                arg1.method4503(class229.field2945, field1419 + 152, 10, 16777215, -1);
                Statics.field906[0].method4744(field1419 + 140, 12);
                arg1.method4503(class229.field3144, field1419 + 152, 21, 16777215, -1);
            }
            if (Statics.field339 != null) {
                int var4 = field1419 + 280;
                if (class81.field1302[0] == 0 && class81.field1307[0] == 0) {
                    Statics.field339[2].method4744(var4, 4);
                } else {
                    Statics.field339[0].method4744(var4, 4);
                }
                if (class81.field1302[0] == 0 && class81.field1307[0] == 1) {
                    Statics.field339[3].method4744(var4 + 15, 4);
                } else {
                    Statics.field339[1].method4744(var4 + 15, 4);
                }
                arg0.method4503(class229.field3010, var4 + 32, 17, 16777215, -1);
                int var5 = field1419 + 390;
                if (class81.field1302[0] == 1 && class81.field1307[0] == 0) {
                    Statics.field339[2].method4744(var5, 4);
                } else {
                    Statics.field339[0].method4744(var5, 4);
                }
                if (class81.field1302[0] == 1 && class81.field1307[0] == 1) {
                    Statics.field339[3].method4744(var5 + 15, 4);
                } else {
                    Statics.field339[1].method4744(var5 + 15, 4);
                }
                arg0.method4503(class229.field3146, var5 + 32, 17, 16777215, -1);
                int var6 = field1419 + 500;
                if (class81.field1302[0] == 2 && class81.field1307[0] == 0) {
                    Statics.field339[2].method4744(var6, 4);
                } else {
                    Statics.field339[0].method4744(var6, 4);
                }
                if (class81.field1302[0] == 2 && class81.field1307[0] == 1) {
                    Statics.field339[3].method4744(var6 + 15, 4);
                } else {
                    Statics.field339[1].method4744(var6 + 15, 4);
                }
                arg0.method4503(class229.field2966, var6 + 32, 17, 16777215, -1);
                int var7 = field1419 + 610;
                if (class81.field1302[0] == 3 && class81.field1307[0] == 0) {
                    Statics.field339[2].method4744(var7, 4);
                } else {
                    Statics.field339[0].method4744(var7, 4);
                }
                if (class81.field1302[0] == 3 && class81.field1307[0] == 1) {
                    Statics.field339[3].method4744(var7 + 15, 4);
                } else {
                    Statics.field339[1].method4744(var7 + 15, 4);
                }
                arg0.method4503(class229.field3148, var7 + 32, 17, 16777215, -1);
            }
            class285.method4701(field1419 + 708, 4, 50, 16, 0);
            arg1.method4490(class229.field3108, field1419 + 708 + 25, 16, 16777215, -1);
            field1446 = -1;
            if (Statics.field332 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class81.field1299) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1299) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1299) {
                        var11--;
                    }
                } while (var11 != var12 || var10 != var13);
                int var14 = (765 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (480 - var9 * var11) / (var11 + 1);
                if (var15 > 5) {
                    var15 = 5;
                }
                int var16 = (765 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = (480 - var9 * var11 - (var11 - 1) * var15) / 2;
                int var18 = var17 + 23;
                int var19 = field1419 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class81.field1299; var22++) {
                    class81 var23 = Statics.field1294[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1305);
                    if (var23.field1305 == -1) {
                        var25 = class229.field3120;
                        var24 = false;
                    } else if (var23.field1305 > 1980) {
                        var25 = class229.field3124;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1430()) {
                        if (var23.method1441()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1426()) {
                        var26 = 16711680;
                        if (var23.method1441()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1418()) {
                        if (var23.method1441()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1441()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field742 >= var19 && class60.field738 >= var18 && class60.field742 < var8 + var19 && class60.field738 < var9 + var18 && var24) {
                        field1446 = var22;
                        Statics.field332[var27].method4775(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field332[var27].method4773(var19, var18);
                    }
                    if (Statics.field3691 != null) {
                        Statics.field3691[(var23.method1441() ? 8 : 0) + var23.field1308].method4744(var19 + 29, var18);
                    }
                    arg0.method4490(Integer.toString(var23.field1303), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4490(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4487(Statics.field1294[field1446].field1304) + 6;
                    int var29 = arg1.field3659 + 8;
                    class285.method4701(class60.field742 - var28 / 2, class60.field738 + 20 + 5, var28, var29, 16777120);
                    class285.method4734(class60.field742 - var28 / 2, class60.field738 + 20 + 5, var28, var29, 0);
                    arg1.method4490(Statics.field1294[field1446].field1304, class60.field742, class60.field738 + 20 + 5 + arg1.field3659 + 4, 0, -1);
                }
            }
            Statics.field715.method731(0, 0);
            return;
        }
        if (arg3) {
            Statics.field3327.method4773(field1419, 0);
            Statics.field1439.method4773(field1419 + 382, 0);
            Statics.field1477.method4744(field1419 + 382 - Statics.field1477.field3782 / 2, 18);
        }
        if (client.field1175 == 0 || client.field1175 == 5) {
            byte var30 = 20;
            arg0.method4490(class229.field3081, field1426 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class285.method4734(field1426 + 180 - 152, var31, 304, 34, 9179409);
            class285.method4734(field1426 + 180 - 151, var31 + 1, 302, 32, 0);
            class285.method4701(field1426 + 180 - 150, var31 + 2, field1436 * 3, 30, 9179409);
            class285.method4701(field1436 * 3 + (field1426 + 180 - 150), var31 + 2, 300 - field1436 * 3, 30, 0);
            arg0.method4490(field1432, field1426 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field1175 == 20) {
            Statics.field1420.method4744(field1426 + 180 - Statics.field1420.field3782 / 2, 271 - Statics.field1420.field3785 / 2);
            short var32 = 211;
            arg0.method4490(field1423, field1426 + 180, var32, 16776960, 0);
            int var126 = var32 + 15;
            arg0.method4490(field1429, field1426 + 180, var126, 16776960, 0);
            int var127 = var126 + 15;
            arg0.method4490(field1445, field1426 + 180, var127, 16776960, 0);
            int var128 = var127 + 15;
            int var129 = var128 + 10;
            if (field1433 != 4) {
                arg0.method4503(class229.field3103, field1426 + 180 - 110, var129, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = field1438; arg0.method4487(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method4503(class268.method4486(var34), field1426 + 180 - 70, var129, 16777215, 0);
                var126 = var129 + 15;
                String var36 = class229.field3104;
                String var37 = field1435;
                int var38 = var37.length();
                char[] var39 = new char[var38];
                for (int var40 = 0; var40 < var38; var40++) {
                    var39[var40] = '*';
                }
                String var41 = new String(var39);
                arg0.method4503(var36 + var41, field1426 + 180 - 108, var126, 16777215, 0);
                var126 += 15;
            }
        }
        if (client.field1175 == 10 || client.field1175 == 11) {
            Statics.field1420.method4744(field1426, 171);
            if (field1433 == 0) {
                short var43 = 251;
                arg0.method4490(class229.field2937, field1426 + 180, var43, 16776960, 0);
                int var130 = var43 + 30;
                int var44 = field1426 + 180 - 80;
                short var45 = 291;
                Statics.field1421.method4744(var44 - 73, var45 - 20);
                arg0.method4491(class229.field3110, var44 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var46 = field1426 + 180 + 80;
                Statics.field1421.method4744(var46 - 73, var45 - 20);
                arg0.method4491(class229.field3072, var46 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1433 == 1) {
                arg0.method4490(field1434, field1426 + 180, 211, 16776960, 0);
                short var47 = 236;
                arg0.method4490(field1423, field1426 + 180, var47, 16777215, 0);
                int var131 = var47 + 15;
                arg0.method4490(field1429, field1426 + 180, var131, 16777215, 0);
                int var132 = var131 + 15;
                arg0.method4490(field1445, field1426 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                int var48 = field1426 + 180 - 80;
                short var49 = 321;
                Statics.field1421.method4744(var48 - 73, var49 - 20);
                arg0.method4490(class229.field2877, var48, var49 + 5, 16777215, 0);
                int var50 = field1426 + 180 + 80;
                Statics.field1421.method4744(var50 - 73, var49 - 20);
                arg0.method4490(class229.field3108, var50, var49 + 5, 16777215, 0);
            } else if (field1433 == 2) {
                short var51 = 211;
                arg0.method4490(field1423, field1426 + 180, var51, 16776960, 0);
                int var134 = var51 + 15;
                arg0.method4490(field1429, field1426 + 180, var134, 16776960, 0);
                int var135 = var134 + 15;
                arg0.method4490(field1445, field1426 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                int var137 = var136 + 10;
                arg0.method4503(class229.field3103, field1426 + 180 - 110, var137, 16777215, 0);
                short var52 = 200;
                String var53;
                for (var53 = field1438; arg0.method4487(var53) > var52; var53 = var53.substring(1)) {
                }
                arg0.method4503(class268.method4486(var53) + (field1442 == 0 & client.field948 % 40 < 20 ? class89.method72(16776960) + class89.field1394 : ""), field1426 + 180 - 70, var137, 16777215, 0);
                var134 = var137 + 15;
                String var55 = class229.field3104;
                String var56 = field1435;
                int var57 = var56.length();
                char[] var58 = new char[var57];
                for (int var59 = 0; var59 < var57; var59++) {
                    var58[var59] = '*';
                }
                String var60 = new String(var58);
                arg0.method4503(var55 + var60 + (field1442 == 1 & client.field948 % 40 < 20 ? class89.method72(16776960) + class89.field1394 : ""), field1426 + 180 - 108, var134, 16777215, 0);
                var134 += 15;
                int var62 = field1426 + 180 - 80;
                short var63 = 321;
                Statics.field1421.method4744(var62 - 73, var63 - 20);
                arg0.method4490(class229.field2882, var62, var63 + 5, 16777215, 0);
                int var64 = field1426 + 180 + 80;
                Statics.field1421.method4744(var64 - 73, var63 - 20);
                arg0.method4490(class229.field3108, var64, var63 + 5, 16777215, 0);
                short var65 = 357;
                arg1.method4490(class229.field2999, field1426 + 180, var65, 16776960, 0);
            } else if (field1433 == 3) {
                short var66 = 201;
                arg0.method4490(class229.field3149, field1426 + 180, var66, 16776960, 0);
                int var138 = var66 + 20;
                arg1.method4490(class229.field3112, field1426 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg1.method4490(class229.field3113, field1426 + 180, var139, 16776960, 0);
                int var140 = var139 + 15;
                int var67 = field1426 + 180;
                short var68 = 276;
                Statics.field1421.method4744(var67 - 73, var68 - 20);
                arg2.method4490(class229.field3114, var67, var68 + 5, 16777215, 0);
                int var69 = field1426 + 180;
                short var70 = 326;
                Statics.field1421.method4744(var69 - 73, var70 - 20);
                arg2.method4490(class229.field3088, var69, var70 + 5, 16777215, 0);
            } else if (field1433 == 4) {
                arg0.method4490(class229.field3098, field1426 + 180, 211, 16776960, 0);
                short var71 = 236;
                arg0.method4490(field1423, field1426 + 180, var71, 16777215, 0);
                int var141 = var71 + 15;
                arg0.method4490(field1429, field1426 + 180, var141, 16777215, 0);
                int var142 = var141 + 15;
                arg0.method4490(field1445, field1426 + 180, var142, 16777215, 0);
                int var143 = var142 + 15;
                String var73 = class229.field3067;
                String var74 = Statics.field844;
                int var75 = var74.length();
                char[] var76 = new char[var75];
                for (int var77 = 0; var77 < var75; var77++) {
                    var76[var77] = '*';
                }
                String var78 = new String(var76);
                arg0.method4503(var73 + var78 + (client.field948 % 40 < 20 ? class89.method72(16776960) + class89.field1394 : ""), field1426 + 180 - 108, var143, 16777215, 0);
                var141 = var143 - 8;
                arg0.method4503(class229.field2965, field1426 + 180 - 9, var141, 16776960, 0);
                var141 += 15;
                arg0.method4503(class229.field3111, field1426 + 180 - 9, var141, 16776960, 0);
                int var80 = field1426 + 180 - 9 + arg0.method4487(class229.field3111) + 15;
                int var81 = var141 - arg0.field3659;
                class288 var82;
                if (field1430) {
                    var82 = Statics.field3224;
                } else {
                    var82 = Statics.field864;
                }
                var82.method4744(var80, var81);
                var141 += 15;
                int var83 = field1426 + 180 - 80;
                short var84 = 321;
                Statics.field1421.method4744(var83 - 73, var84 - 20);
                arg0.method4490(class229.field2877, var83, var84 + 5, 16777215, 0);
                int var85 = field1426 + 180 + 80;
                Statics.field1421.method4744(var85 - 73, var84 - 20);
                arg0.method4490(class229.field3108, var85, var84 + 5, 16777215, 0);
                arg1.method4490(class229.field3099, field1426 + 180, var84 + 36, 255, 0);
            } else if (field1433 == 5) {
                arg0.method4490(class229.field2891, field1426 + 180, 201, 16776960, 0);
                short var86 = 221;
                arg2.method4490(field1423, field1426 + 180, var86, 16776960, 0);
                int var144 = var86 + 15;
                arg2.method4490(field1429, field1426 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                arg2.method4490(field1445, field1426 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                int var147 = var146 + 14;
                arg0.method4503(class229.field2947, field1426 + 180 - 145, var147, 16777215, 0);
                short var87 = 174;
                String var88;
                for (var88 = field1438; arg0.method4487(var88) > var87; var88 = var88.substring(1)) {
                }
                arg0.method4503(class268.method4486(var88) + (client.field948 % 40 < 20 ? class89.method72(16776960) + class89.field1394 : ""), field1426 + 180 - 34, var147, 16777215, 0);
                var144 = var147 + 15;
                int var89 = field1426 + 180 - 80;
                short var90 = 321;
                Statics.field1421.method4744(var89 - 73, var90 - 20);
                arg0.method4490(class229.field3119, var89, var90 + 5, 16777215, 0);
                int var91 = field1426 + 180 + 80;
                Statics.field1421.method4744(var91 - 73, var90 - 20);
                arg0.method4490(class229.field3118, var91, var90 + 5, 16777215, 0);
            } else if (field1433 == 6) {
                short var92 = 211;
                arg0.method4490(field1423, field1426 + 180, var92, 16776960, 0);
                int var148 = var92 + 15;
                arg0.method4490(field1429, field1426 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                arg0.method4490(field1445, field1426 + 180, var149, 16776960, 0);
                int var150 = var149 + 15;
                int var93 = field1426 + 180;
                short var94 = 321;
                Statics.field1421.method4744(var93 - 73, var94 - 20);
                arg0.method4490(class229.field3118, var93, var94 + 5, 16777215, 0);
            }
        }
        if (field1422 > 0) {
            int var95 = field1422;
            short var96 = 256;
            field1427 += var95 * 128;
            if (field1427 > Statics.field2128.length) {
                field1427 -= Statics.field2128.length;
                int var97 = (int) (Math.random() * 12.0D);
                method4623(Statics.field2861[var97]);
            }
            int var98 = 0;
            int var99 = var95 * 128;
            int var100 = (var96 - var95) * 128;
            for (int var101 = 0; var101 < var100; var101++) {
                int var102 = Statics.field301[var98 + var99] - Statics.field2128[field1427 + var98 & Statics.field2128.length - 1] * var95 / 6;
                if (var102 < 0) {
                    var102 = 0;
                }
                Statics.field301[var98++] = var102;
            }
            for (int var103 = var96 - var95; var103 < var96; var103++) {
                int var104 = var103 * 128;
                for (int var105 = 0; var105 < 128; var105++) {
                    int var106 = (int) (Math.random() * 100.0D);
                    if (var106 < 50 && var105 > 10 && var105 < 118) {
                        Statics.field301[var104 + var105] = 255;
                    } else {
                        Statics.field301[var104 + var105] = 0;
                    }
                }
            }
            if (field1425 > 0) {
                field1425 -= var95 * 4;
            }
            if (field1440 > 0) {
                field1440 -= var95 * 4;
            }
            if (field1425 == 0 && field1440 == 0) {
                int var107 = (int) (Math.random() * (double) (2000 / var95));
                if (var107 == 0) {
                    field1425 = 1024;
                }
                if (var107 == 1) {
                    field1440 = 1024;
                }
            }
            for (int var108 = 0; var108 < var96 - var95; var108++) {
                field1424[var108] = field1424[var95 + var108];
            }
            for (int var109 = var96 - var95; var109 < var96; var109++) {
                field1424[var109] = (int) (Math.sin((double) field1431 / 14.0D) * 16.0D + Math.sin((double) field1431 / 15.0D) * 14.0D + Math.sin((double) field1431 / 16.0D) * 12.0D);
                field1431++;
            }
            field1428 += var95 * 1109203753;
            int var110 = ((client.field948 & 0x1) + var95) / 2;
            if (var110 > 0) {
                for (int var111 = 0; var111 < field1428 * 1133063620; var111++) {
                    int var112 = (int) (Math.random() * 124.0D) + 2;
                    int var113 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field301[(var113 << 7) + var112] = 192;
                }
                field1428 = 0;
                int var114 = 0;
                label427: while (true) {
                    if (var114 >= var96) {
                        int var118 = 0;
                        while (true) {
                            if (var118 >= 128) {
                                break label427;
                            }
                            int var119 = 0;
                            for (int var120 = -var110; var120 < var96; var120++) {
                                int var121 = var120 * 128;
                                if (var110 + var120 < var96) {
                                    var119 += Statics.field311[var110 * 128 + var118 + var121];
                                }
                                if (var120 - (var110 + 1) >= 0) {
                                    var119 -= Statics.field311[var118 + var121 - (var110 + 1) * 128];
                                }
                                if (var120 >= 0) {
                                    Statics.field301[var118 + var121] = var119 / (var110 * 2 + 1);
                                }
                            }
                            var118++;
                        }
                    }
                    int var115 = 0;
                    int var116 = var114 * 128;
                    for (int var117 = -var110; var117 < 128; var117++) {
                        if (var110 + var117 < 128) {
                            var115 += Statics.field301[var116 + var117 + var110];
                        }
                        if (var117 - (var110 + 1) >= 0) {
                            var115 -= Statics.field301[var116 + var117 - (var110 + 1)];
                        }
                        if (var117 >= 0) {
                            Statics.field311[var116 + var117] = var115 / (var110 * 2 + 1);
                        }
                    }
                    var114++;
                }
            }
            field1422 = 0;
        }
        method1454();
        Statics.field3905[Statics.field1375.field1315 ? 1 : 0].method4744(field1419 + 765 - 40, 463);
        if (client.field1175 <= 5 || client.field1129 != 0) {
            return;
        }
        if (Statics.field1550 == null) {
            Statics.field1550 = class290.method150(Statics.field3399, "sl_button", "");
            return;
        }
        int var122 = field1419 + 5;
        short var123 = 463;
        byte var124 = 100;
        byte var125 = 35;
        Statics.field1550.method4744(var122, var123);
        arg0.method4490(class229.field3036 + " " + client.field1007, var124 / 2 + var122, var125 / 2 + var123 - 2, 16777215, 0);
        if (Statics.field14 == null) {
            arg1.method4490(class229.field3152, var124 / 2 + var122, var125 / 2 + var123 + 12, 16777215, 0);
        } else {
            arg1.method4490(class229.field3151, var124 / 2 + var122, var125 / 2 + var123 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("jr.d(Lkc;B)V")
    public static final void method4623(class288 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2128.length; var2++) {
            Statics.field2128[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2128[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field3161[var8] = (Statics.field2128[var8 - 1] + Statics.field2128[var8 + 1] + Statics.field2128[var8 - 128] + Statics.field2128[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2128;
            Statics.field2128 = Statics.field3161;
            Statics.field3161 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3785; var11++) {
            for (int var12 = 0; var12 < arg0.field3782; var12++) {
                if (arg0.field3787[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3786;
                    int var14 = var11 + 16 + arg0.field3784;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2128[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ei.n(IIII)I")
    public static final int method2743(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ci.z(I)V")
    public static final void method1454() {
        short var0 = 256;
        if (field1425 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1425 > 768) {
                    Statics.field350[var1] = method2743(Statics.field1392[var1], Statics.field33[var1], 1024 - field1425);
                } else if (field1425 > 256) {
                    Statics.field350[var1] = Statics.field33[var1];
                } else {
                    Statics.field350[var1] = method2743(Statics.field33[var1], Statics.field1392[var1], 256 - field1425);
                }
            }
        } else if (field1440 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1440 > 768) {
                    Statics.field350[var2] = method2743(Statics.field1392[var2], Statics.field341[var2], 1024 - field1440);
                } else if (field1440 > 256) {
                    Statics.field350[var2] = Statics.field341[var2];
                } else {
                    Statics.field350[var2] = method2743(Statics.field341[var2], Statics.field1392[var2], 256 - field1440);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field350[var3] = Statics.field1392[var3];
            }
        }
        class285.method4655(field1419, 9, field1419 + 128, var0 + 7);
        Statics.field3327.method4773(field1419, 0);
        class285.method4707();
        int var4 = 0;
        int var5 = field1419 + Statics.field715.field3772 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1424[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field301[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field350[var10];
                    int var14 = Statics.field715.field3773[var5];
                    Statics.field715.field3773[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field715.field3772 + var8 - 128;
        }
        class285.method4655(field1419 + 765 - 128, 9, field1419 + 765, var0 + 7);
        Statics.field1439.method4773(field1419 + 382, 0);
        class285.method4707();
        int var15 = 0;
        int var16 = field1419 + Statics.field715.field3772 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1424[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field301[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field350[var22];
                    int var26 = Statics.field715.field3773[var20];
                    Statics.field715.field3773[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field715.field3772 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("bc.o(Lci;B)V")
    public static void method806(class81 arg0) {
        if (arg0.method1441() != client.field1136) {
            client.field1136 = arg0.method1441();
            class260.method533(arg0.method1441());
        }
        Statics.field510 = arg0.field1311;
        client.field1007 = arg0.field1303;
        client.field950 = arg0.field1300;
        Statics.field819 = client.field920 == 0 ? 43594 : arg0.field1303 + 40000;
        Statics.field2633 = client.field920 == 0 ? 443 : arg0.field1303 + 50000;
        Statics.field685 = Statics.field819;
    }

    @ObfuscatedName("bo.u(I)V")
    public static void method1034() {
        if (class81.method1641()) {
            field1437 = true;
        }
    }
}

package deob;

@ObfuscatedName("cj")
public class class93 {

    @ObfuscatedName("cj.w")
    public static int field1471 = 0;

    @ObfuscatedName("cj.m")
    public static int field1456 = field1471 + 202;

    @ObfuscatedName("cj.f")
    public static int[] field1460 = new int[256];

    @ObfuscatedName("cj.d")
    public static int field1458 = 0;

    @ObfuscatedName("cj.h")
    public static int field1459 = 0;

    @ObfuscatedName("cj.aw")
    public static int field1453 = 0;

    @ObfuscatedName("cj.ai")
    public static int field1466 = 0;

    @ObfuscatedName("cj.an")
    public static int field1457 = 0;

    @ObfuscatedName("cj.au")
    public static int field1463 = 0;

    @ObfuscatedName("cj.ar")
    public static int field1464 = 10;

    @ObfuscatedName("cj.ay")
    public static String field1465 = "";

    @ObfuscatedName("cj.ao")
    public static int field1455 = 0;

    @ObfuscatedName("cj.as")
    public static String field1467 = "";

    @ObfuscatedName("cj.ak")
    public static String field1468 = "";

    @ObfuscatedName("cj.aq")
    public static String field1461 = "";

    @ObfuscatedName("cj.ax")
    public static String field1470 = "";

    @ObfuscatedName("cj.ac")
    public static String field1472 = "";

    @ObfuscatedName("cj.at")
    public static String field1475 = "";

    @ObfuscatedName("cj.av")
    public static class150 field1473 = class150.field2214;

    @ObfuscatedName("cj.az")
    public static boolean field1474 = true;

    @ObfuscatedName("cj.al")
    public static int field1454 = 0;

    @ObfuscatedName("cj.ad")
    public static String field1469 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cj.ae")
    public static String field1477 = "1234567890";

    @ObfuscatedName("cj.ap")
    public static boolean field1479 = false;

    @ObfuscatedName("cj.bv")
    public static int field1480 = -1;

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.i(Liq;Liq;I)I")
    public static int method2646(class236 arg0, class236 arg1) {
        int var2 = 0;
        if (arg0.method3788("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3788("logo", "")) {
            var2++;
        }
        if (arg1.method3788("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3788("titlebox", "")) {
            var2++;
        }
        if (arg1.method3788("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3788("runes", "")) {
            var2++;
        }
        if (arg1.method3788("title_mute", "")) {
            var2++;
        }
        if (arg1.method3788("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3788("options_radio_buttons,2", "")) {
            var2++;
        }
        arg1.method3788("sl_back", "");
        arg1.method3788("sl_flags", "");
        arg1.method3788("sl_arrows", "");
        arg1.method3788("sl_stars", "");
        arg1.method3788("sl_button", "");
        return var2;
    }

    @ObfuscatedName("cu.w(B)I")
    public static int method1647() {
        return 9;
    }

    @ObfuscatedName("dt.t(B)V")
    public static void method1917() {
        if (!Statics.field318) {
            return;
        }
        Statics.field1462 = null;
        Statics.field1476 = null;
        Statics.field3670 = null;
        Statics.field1452 = null;
        Statics.field20 = null;
        Statics.field1370 = null;
        Statics.field544 = null;
        Statics.field41 = null;
        Statics.field2856 = null;
        Statics.field3368 = null;
        Statics.field652 = null;
        Statics.field2423 = null;
        Statics.field769 = null;
        Statics.field1446 = null;
        Statics.field587 = null;
        Statics.field3327 = null;
        Statics.field1371 = null;
        Statics.field376 = null;
        Statics.field1383 = null;
        Statics.field294 = null;
        Statics.field271 = null;
        Statics.field865 = null;
        class204.method3077(2);
        class239.method2849(true);
        Statics.field318 = false;
    }

    @ObfuscatedName("id.s(Lbp;I)V")
    public static void method4274(class59 arg0) {
        if (!field1479) {
            if ((class60.field743 == 1 || !Statics.field500 && class60.field743 == 4) && class60.field748 >= field1471 + 765 - 50 && class60.field757 >= 453) {
                Statics.field248.field1329 = !Statics.field248.field1329;
                Statics.method4();
                if (Statics.field248.field1329) {
                    Statics.field2510.method3443();
                    class204.field2509 = 1;
                    Statics.field786 = null;
                } else {
                    Statics.method1705(Statics.field606, "scape main", "", 255, false);
                }
            }
            if (client.field934 != 5) {
                field1457++;
                if (client.field934 == 10 || client.field934 == 11) {
                    if (client.field932 == 0) {
                        if (class60.field743 == 1 || !Statics.field500 && class60.field743 == 4) {
                            int var6 = field1471 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class60.field748 >= var6 && class60.field748 <= var6 + var8 && class60.field757 >= var7 && class60.field757 <= var7 + var9) {
                                method1492();
                                return;
                            }
                        }
                        if (Statics.field1312 != null) {
                            method1492();
                        }
                    }
                    int var10 = class60.field743;
                    int var11 = class60.field748;
                    int var12 = class60.field757;
                    if (!Statics.field500 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field1455 == 0) {
                        boolean var13 = false;
                        while (class51.method69()) {
                            if (Statics.field2347 == 84) {
                                var13 = true;
                            }
                        }
                        int var14 = field1456 + 180 - 80;
                        short var15 = 291;
                        if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                            String var16 = client.method226("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class57.method123(var16, true, "openjs", false);
                        }
                        int var17 = field1456 + 180 + 80;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                            if ((client.field927 & 0x2000000) != 0) {
                                field1467 = "";
                                field1468 = class226.field3084;
                                field1461 = class226.field3085;
                                field1470 = class226.field3068;
                                field1455 = 1;
                                field1454 = 0;
                            } else if ((client.field927 & 0x4) != 0) {
                                if ((client.field927 & 0x400) == 0) {
                                    field1468 = class226.field3075;
                                    field1461 = class226.field3076;
                                    field1470 = class226.field3077;
                                } else {
                                    field1468 = class226.field3081;
                                    field1461 = class226.field3127;
                                    field1470 = class226.field3083;
                                }
                                field1467 = class226.field3056;
                                field1455 = 1;
                                field1454 = 0;
                            } else if ((client.field927 & 0x400) == 0) {
                                field1468 = class226.field3071;
                                field1461 = class226.field3072;
                                field1470 = class226.field3073;
                                field1455 = 2;
                                field1454 = 0;
                            } else {
                                field1468 = class226.field3010;
                                field1461 = class226.field3079;
                                field1470 = class226.field3057;
                                field1467 = class226.field3056;
                                field1455 = 1;
                                field1454 = 0;
                            }
                        }
                    } else if (field1455 == 1) {
                        while (class51.method69()) {
                            if (Statics.field2347 == 84) {
                                field1468 = class226.field3071;
                                field1461 = class226.field3072;
                                field1470 = class226.field3073;
                                field1455 = 2;
                                field1454 = 0;
                            } else if (Statics.field2347 == 13) {
                                field1455 = 0;
                            }
                        }
                        int var18 = field1456 + 180 - 80;
                        short var19 = 321;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var19 - 20 && var12 <= var19 + 20) {
                            field1468 = class226.field3071;
                            field1461 = class226.field3072;
                            field1470 = class226.field3073;
                            field1455 = 2;
                            field1454 = 0;
                        }
                        int var20 = field1456 + 180 + 80;
                        if (var10 == 1 && var11 >= var20 - 75 && var11 <= var20 + 75 && var12 >= var19 - 20 && var12 <= var19 + 20) {
                            field1455 = 0;
                        }
                    } else if (field1455 == 2) {
                        short var21 = 231;
                        int var43 = var21 + 30;
                        if (var10 == 1 && var12 >= var43 - 15 && var12 < var43) {
                            field1454 = 0;
                        }
                        var43 += 15;
                        if (var10 == 1 && var12 >= var43 - 15 && var12 < var43) {
                            field1454 = 1;
                        }
                        var43 += 15;
                        short var22 = 361;
                        if (var10 == 1 && var12 >= var22 - 15 && var12 < var22) {
                            method56(class226.field3082, class226.field3111, class226.field3112);
                            field1455 = 5;
                            return;
                        }
                        int var23 = field1456 + 180 - 80;
                        short var24 = 321;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                            field1472 = field1472.trim();
                            if (field1472.length() == 0) {
                                method56(class226.field3067, class226.field2958, class226.field3142);
                                return;
                            }
                            if (field1475.length() == 0) {
                                method56(class226.field2977, class226.field3049, class226.field2982);
                                return;
                            }
                            method56(class226.field3015, class226.field3090, class226.field3104);
                            field1473 = Statics.field248.field1331.containsKey(class271.method26(field1472)) ? class150.field2216 : class150.field2214;
                            client.method2180(20);
                            return;
                        }
                        int var25 = field1456 + 180 + 80;
                        if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                            field1455 = 0;
                            field1472 = "";
                            field1475 = "";
                            Statics.field1560 = 0;
                            Statics.field516 = "";
                            field1474 = true;
                        }
                        while (true) {
                            while (class51.method69()) {
                                boolean var26 = false;
                                for (int var27 = 0; var27 < field1469.length(); var27++) {
                                    if (Statics.field3239 == field1469.charAt(var27)) {
                                        var26 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2347 == 13) {
                                    field1455 = 0;
                                    field1472 = "";
                                    field1475 = "";
                                    Statics.field1560 = 0;
                                    Statics.field516 = "";
                                    field1474 = true;
                                } else if (field1454 == 0) {
                                    if (Statics.field2347 == 85 && field1472.length() > 0) {
                                        field1472 = field1472.substring(0, field1472.length() - 1);
                                    }
                                    if (Statics.field2347 == 84 || Statics.field2347 == 80) {
                                        field1454 = 1;
                                    }
                                    if (var26 && field1472.length() < 320) {
                                        field1472 = field1472 + Statics.field3239;
                                    }
                                } else if (field1454 == 1) {
                                    if (Statics.field2347 == 85 && field1475.length() > 0) {
                                        field1475 = field1475.substring(0, field1475.length() - 1);
                                    }
                                    if (Statics.field2347 == 84 || Statics.field2347 == 80) {
                                        field1454 = 0;
                                    }
                                    if (Statics.field2347 == 84) {
                                        field1472 = field1472.trim();
                                        if (field1472.length() == 0) {
                                            method56(class226.field3067, class226.field2958, class226.field3142);
                                            return;
                                        }
                                        if (field1475.length() == 0) {
                                            method56(class226.field2977, class226.field3049, class226.field2982);
                                            return;
                                        }
                                        method56(class226.field3015, class226.field3090, class226.field3104);
                                        field1473 = Statics.field248.field1331.containsKey(class271.method26(field1472)) ? class150.field2216 : class150.field2214;
                                        client.method2180(20);
                                        return;
                                    }
                                    if (var26 && field1475.length() < 20) {
                                        field1475 = field1475 + Statics.field3239;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1455 == 3) {
                        int var28 = field1456 + 180;
                        short var29 = 276;
                        if (var10 == 1 && var11 >= var28 - 75 && var11 <= var28 + 75 && var12 >= var29 - 20 && var12 <= var29 + 20) {
                            field1468 = class226.field3071;
                            field1461 = class226.field3072;
                            field1470 = class226.field3073;
                            field1455 = 2;
                            field1454 = 0;
                        }
                        int var30 = field1456 + 180;
                        short var31 = 326;
                        if (var10 == 1 && var11 >= var30 - 75 && var11 <= var30 + 75 && var12 >= var31 - 20 && var12 <= var31 + 20) {
                            method56(class226.field3082, class226.field3111, class226.field3112);
                            field1455 = 5;
                            return;
                        }
                    } else if (field1455 == 4) {
                        int var32 = field1456 + 180 - 80;
                        short var33 = 321;
                        if (var10 == 1 && var11 >= var32 - 75 && var11 <= var32 + 75 && var12 >= var33 - 20 && var12 <= var33 + 20) {
                            Statics.field516.trim();
                            if (Statics.field516.length() != 6) {
                                method56(class226.field2896, class226.field2979, class226.field2926);
                                return;
                            }
                            Statics.field1560 = Integer.parseInt(Statics.field516);
                            Statics.field516 = "";
                            field1473 = field1474 ? class150.field2215 : class150.field2220;
                            method56(class226.field3015, class226.field3090, class226.field3104);
                            client.method2180(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field1456 + 180 - 9 && var11 <= field1456 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field1474 = !field1474;
                        }
                        if (var10 == 1 && var11 >= field1456 + 180 - 34 && var11 <= field1456 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class57.method1066(client.method226("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var34 = field1456 + 180 + 80;
                        if (var10 == 1 && var11 >= var34 - 75 && var11 <= var34 + 75 && var12 >= var33 - 20 && var12 <= var33 + 20) {
                            field1455 = 0;
                            field1472 = "";
                            field1475 = "";
                            Statics.field1560 = 0;
                            Statics.field516 = "";
                        }
                        while (class51.method69()) {
                            boolean var35 = false;
                            for (int var36 = 0; var36 < field1477.length(); var36++) {
                                if (Statics.field3239 == field1477.charAt(var36)) {
                                    var35 = true;
                                    break;
                                }
                            }
                            if (Statics.field2347 == 13) {
                                field1455 = 0;
                                field1472 = "";
                                field1475 = "";
                                Statics.field1560 = 0;
                                Statics.field516 = "";
                            } else {
                                if (Statics.field2347 == 85 && Statics.field516.length() > 0) {
                                    Statics.field516 = Statics.field516.substring(0, Statics.field516.length() - 1);
                                }
                                if (Statics.field2347 == 84) {
                                    Statics.field516.trim();
                                    if (Statics.field516.length() != 6) {
                                        method56(class226.field2896, class226.field2979, class226.field2926);
                                        return;
                                    }
                                    Statics.field1560 = Integer.parseInt(Statics.field516);
                                    Statics.field516 = "";
                                    field1473 = field1474 ? class150.field2215 : class150.field2220;
                                    method56(class226.field3015, class226.field3090, class226.field3104);
                                    client.method2180(20);
                                    return;
                                }
                                if (var35 && Statics.field516.length() < 6) {
                                    Statics.field516 = Statics.field516 + Statics.field3239;
                                }
                            }
                        }
                    } else if (field1455 == 5) {
                        int var37 = field1456 + 180 - 80;
                        short var38 = 321;
                        if (var10 == 1 && var11 >= var37 - 75 && var11 <= var37 + 75 && var12 >= var38 - 20 && var12 <= var38 + 20) {
                            method2650();
                            return;
                        }
                        int var39 = field1456 + 180 + 80;
                        if (var10 == 1 && var11 >= var39 - 75 && var11 <= var39 + 75 && var12 >= var38 - 20 && var12 <= var38 + 20) {
                            field1468 = class226.field3071;
                            field1461 = class226.field3072;
                            field1470 = class226.field3073;
                            field1455 = 2;
                            field1454 = 0;
                            field1475 = "";
                        }
                        while (class51.method69()) {
                            boolean var40 = false;
                            for (int var41 = 0; var41 < field1469.length(); var41++) {
                                if (Statics.field3239 == field1469.charAt(var41)) {
                                    var40 = true;
                                    break;
                                }
                            }
                            if (Statics.field2347 == 13) {
                                field1468 = class226.field3071;
                                field1461 = class226.field3072;
                                field1470 = class226.field3073;
                                field1455 = 2;
                                field1454 = 0;
                                field1475 = "";
                            } else {
                                if (Statics.field2347 == 85 && field1472.length() > 0) {
                                    field1472 = field1472.substring(0, field1472.length() - 1);
                                }
                                if (Statics.field2347 == 84) {
                                    method2650();
                                    return;
                                }
                                if (var40 && field1472.length() < 320) {
                                    field1472 = field1472 + Statics.field3239;
                                }
                            }
                        }
                    } else if (field1455 == 6) {
                        while (true) {
                            do {
                                if (!class51.method69()) {
                                    short var42 = 321;
                                    if (var10 == 1 && var12 >= var42 - 20 && var12 <= var42 + 20) {
                                        field1468 = class226.field3071;
                                        field1461 = class226.field3072;
                                        field1470 = class226.field3073;
                                        field1455 = 2;
                                        field1454 = 0;
                                        field1475 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2347 != 84 && Statics.field2347 != 13);
                            field1468 = class226.field3071;
                            field1461 = class226.field3072;
                            field1470 = class226.field3073;
                            field1455 = 2;
                            field1454 = 0;
                            field1475 = "";
                        }
                    }
                }
            }
        } else if (class60.field743 == 1 || !Statics.field500 && class60.field743 == 4) {
            int var1 = field1471 + 280;
            if (class60.field748 >= var1 && class60.field748 <= var1 + 14 && class60.field757 >= 4 && class60.field757 <= 18) {
                class81.method1616(0, 0);
            } else if (class60.field748 >= var1 + 15 && class60.field748 <= var1 + 80 && class60.field757 >= 4 && class60.field757 <= 18) {
                class81.method1616(0, 1);
            } else {
                int var2 = field1471 + 390;
                if (class60.field748 >= var2 && class60.field748 <= var2 + 14 && class60.field757 >= 4 && class60.field757 <= 18) {
                    class81.method1616(1, 0);
                } else if (class60.field748 >= var2 + 15 && class60.field748 <= var2 + 80 && class60.field757 >= 4 && class60.field757 <= 18) {
                    class81.method1616(1, 1);
                } else {
                    int var3 = field1471 + 500;
                    if (class60.field748 >= var3 && class60.field748 <= var3 + 14 && class60.field757 >= 4 && class60.field757 <= 18) {
                        class81.method1616(2, 0);
                    } else if (class60.field748 >= var3 + 15 && class60.field748 <= var3 + 80 && class60.field757 >= 4 && class60.field757 <= 18) {
                        class81.method1616(2, 1);
                    } else {
                        int var4 = field1471 + 610;
                        if (class60.field748 >= var4 && class60.field748 <= var4 + 14 && class60.field757 >= 4 && class60.field757 <= 18) {
                            class81.method1616(3, 0);
                        } else if (class60.field748 >= var4 + 15 && class60.field748 <= var4 + 80 && class60.field757 >= 4 && class60.field757 <= 18) {
                            class81.method1616(3, 1);
                        } else if (class60.field748 >= field1471 + 708 && class60.field757 >= 4 && class60.field748 <= field1471 + 708 + 50 && class60.field757 <= 20) {
                            field1479 = false;
                            Statics.field1452.method4691(field1471, 0);
                            Statics.field20.method4691(field1471 + 382, 0);
                            Statics.field1370.method4642(field1471 + 382 - Statics.field1370.field3779 / 2, 18);
                        } else if (field1480 != -1) {
                            class81 var5 = Statics.field1309[field1480];
                            method1576(var5);
                            field1479 = false;
                            Statics.field1452.method4691(field1471, 0);
                            Statics.field20.method4691(field1471 + 382, 0);
                            Statics.field1370.method4642(field1471 + 382 - Statics.field1370.field3779 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ey.r(I)V")
    public static void method2650() {
        field1472 = field1472.trim();
        if (field1472.length() == 0) {
            method56(class226.field3082, class226.field3111, class226.field3112);
            return;
        }
        long var0 = class88.method3908();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class88.method2352(var0, field1472);
        }
        switch(var2) {
            case 2:
                method56(class226.field3113, class226.field3114, class226.field2909);
                field1455 = 6;
                break;
            case 3:
                method56(class226.field2986, class226.field3117, class226.field3044);
                break;
            case 4:
                method56(class226.field3119, class226.field3120, class226.field3121);
                break;
            case 5:
                method56(class226.field3000, class226.field3123, class226.field3124);
                break;
            case 6:
                method56(class226.field2901, class226.field3126, class226.field3101);
                break;
            case 7:
                method56(class226.field3128, class226.field3129, class226.field3089);
        }
    }

    @ObfuscatedName("cf.v(Ljf;Ljf;Ljf;ZI)V")
    public static void method1577(class264 arg0, class264 arg1, class264 arg2, boolean arg3) {
        if (arg3) {
            field1471 = (Statics.field618 - 765) / 2;
            field1456 = field1471 + 202;
        }
        if (field1479) {
            if (Statics.field3368 == null) {
                Statics.field3368 = class287.method9(Statics.field323, "sl_back", "");
            }
            if (Statics.field652 == null) {
                Statics.field652 = class287.method1008(Statics.field323, "sl_flags", "");
            }
            if (Statics.field2423 == null) {
                Statics.field2423 = class287.method1008(Statics.field323, "sl_arrows", "");
            }
            if (Statics.field769 == null) {
                Statics.field769 = class287.method1008(Statics.field323, "sl_stars", "");
            }
            class282.method4614(field1471, 23, 765, 480, 0);
            class282.method4568(field1471, 0, 125, 23, 12425273, 9135624);
            class282.method4568(field1471 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4393(class226.field3131, field1471 + 62, 15, 0, -1);
            if (Statics.field769 != null) {
                Statics.field769[1].method4642(field1471 + 140, 1);
                arg1.method4422(class226.field3132, field1471 + 152, 10, 16777215, -1);
                Statics.field769[0].method4642(field1471 + 140, 12);
                arg1.method4422(class226.field3133, field1471 + 152, 21, 16777215, -1);
            }
            if (Statics.field2423 != null) {
                int var4 = field1471 + 280;
                if (class81.field1313[0] == 0 && class81.field1319[0] == 0) {
                    Statics.field2423[2].method4642(var4, 4);
                } else {
                    Statics.field2423[0].method4642(var4, 4);
                }
                if (class81.field1313[0] == 0 && class81.field1319[0] == 1) {
                    Statics.field2423[3].method4642(var4 + 15, 4);
                } else {
                    Statics.field2423[1].method4642(var4 + 15, 4);
                }
                arg0.method4422(class226.field3022, var4 + 32, 17, 16777215, -1);
                int var5 = field1471 + 390;
                if (class81.field1313[0] == 1 && class81.field1319[0] == 0) {
                    Statics.field2423[2].method4642(var5, 4);
                } else {
                    Statics.field2423[0].method4642(var5, 4);
                }
                if (class81.field1313[0] == 1 && class81.field1319[0] == 1) {
                    Statics.field2423[3].method4642(var5 + 15, 4);
                } else {
                    Statics.field2423[1].method4642(var5 + 15, 4);
                }
                arg0.method4422(class226.field3135, var5 + 32, 17, 16777215, -1);
                int var6 = field1471 + 500;
                if (class81.field1313[0] == 2 && class81.field1319[0] == 0) {
                    Statics.field2423[2].method4642(var6, 4);
                } else {
                    Statics.field2423[0].method4642(var6, 4);
                }
                if (class81.field1313[0] == 2 && class81.field1319[0] == 1) {
                    Statics.field2423[3].method4642(var6 + 15, 4);
                } else {
                    Statics.field2423[1].method4642(var6 + 15, 4);
                }
                arg0.method4422(class226.field3136, var6 + 32, 17, 16777215, -1);
                int var7 = field1471 + 610;
                if (class81.field1313[0] == 3 && class81.field1319[0] == 0) {
                    Statics.field2423[2].method4642(var7, 4);
                } else {
                    Statics.field2423[0].method4642(var7, 4);
                }
                if (class81.field1313[0] == 3 && class81.field1319[0] == 1) {
                    Statics.field2423[3].method4642(var7 + 15, 4);
                } else {
                    Statics.field2423[1].method4642(var7 + 15, 4);
                }
                arg0.method4422(class226.field3137, var7 + 32, 17, 16777215, -1);
            }
            class282.method4614(field1471 + 708, 4, 50, 16, 0);
            arg1.method4393(class226.field3099, field1471 + 708 + 25, 16, 16777215, -1);
            field1480 = -1;
            if (Statics.field3368 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class81.field1310) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1310) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1310) {
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
                int var19 = field1471 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class81.field1310; var22++) {
                    class81 var23 = Statics.field1309[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1317);
                    if (var23.field1317 == -1) {
                        var25 = class226.field3078;
                        var24 = false;
                    } else if (var23.field1317 > 1980) {
                        var25 = class226.field3139;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1438()) {
                        if (var23.method1433()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1444()) {
                        var26 = 16711680;
                        if (var23.method1433()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1432()) {
                        if (var23.method1433()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1433()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field749 >= var19 && class60.field750 >= var18 && class60.field749 < var8 + var19 && class60.field750 < var9 + var18 && var24) {
                        field1480 = var22;
                        Statics.field3368[var27].method4666(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field3368[var27].method4691(var19, var18);
                    }
                    if (Statics.field652 != null) {
                        Statics.field652[(var23.method1433() ? 8 : 0) + var23.field1320].method4642(var19 + 29, var18);
                    }
                    arg0.method4393(Integer.toString(var23.field1315), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4393(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4408(Statics.field1309[field1480].field1325) + 6;
                    int var29 = arg1.field3650 + 8;
                    class282.method4614(class60.field749 - var28 / 2, class60.field750 + 20 + 5, var28, var29, 16777120);
                    class282.method4589(class60.field749 - var28 / 2, class60.field750 + 20 + 5, var28, var29, 0);
                    arg1.method4393(Statics.field1309[field1480].field1325, class60.field749, class60.field750 + 20 + 5 + arg1.field3650 + 4, 0, -1);
                }
            }
            Statics.field603.method744(0, 0);
            return;
        }
        if (arg3) {
            Statics.field1452.method4691(field1471, 0);
            Statics.field20.method4691(field1471 + 382, 0);
            Statics.field1370.method4642(field1471 + 382 - Statics.field1370.field3779 / 2, 18);
        }
        if (client.field934 == 0 || client.field934 == 5) {
            byte var30 = 20;
            arg0.method4393(class226.field3070, field1456 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class282.method4589(field1456 + 180 - 152, var31, 304, 34, 9179409);
            class282.method4589(field1456 + 180 - 151, var31 + 1, 302, 32, 0);
            class282.method4614(field1456 + 180 - 150, var31 + 2, field1464 * 3, 30, 9179409);
            class282.method4614(field1464 * 3 + (field1456 + 180 - 150), var31 + 2, 300 - field1464 * 3, 30, 0);
            arg0.method4393(field1465, field1456 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field934 == 20) {
            Statics.field1462.method4642(field1456 + 180 - Statics.field1462.field3779 / 2, 271 - Statics.field1462.field3784 / 2);
            short var32 = 211;
            arg0.method4393(field1468, field1456 + 180, var32, 16776960, 0);
            int var114 = var32 + 15;
            arg0.method4393(field1461, field1456 + 180, var114, 16776960, 0);
            int var115 = var114 + 15;
            arg0.method4393(field1470, field1456 + 180, var115, 16776960, 0);
            int var116 = var115 + 15;
            int var117 = var116 + 10;
            if (field1455 != 4) {
                arg0.method4422(class226.field3092, field1456 + 180 - 110, var117, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = field1472; arg0.method4408(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method4422(class265.method4466(var34), field1456 + 180 - 70, var117, 16777215, 0);
                var114 = var117 + 15;
                String var36 = class226.field3086;
                String var37 = field1475;
                String var38 = class271.method4467('*', var37.length());
                arg0.method4422(var36 + var38, field1456 + 180 - 108, var114, 16777215, 0);
                var114 += 15;
            }
        }
        if (client.field934 == 10 || client.field934 == 11) {
            Statics.field1462.method4642(field1456, 171);
            if (field1455 == 0) {
                short var39 = 251;
                arg0.method4393(class226.field3095, field1456 + 180, var39, 16776960, 0);
                int var118 = var39 + 30;
                int var40 = field1456 + 180 - 80;
                short var41 = 291;
                Statics.field1476.method4642(var40 - 73, var41 - 20);
                arg0.method4420(class226.field3017, var40 - 73, var41 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var42 = field1456 + 180 + 80;
                Statics.field1476.method4642(var42 - 73, var41 - 20);
                arg0.method4420(class226.field3036, var42 - 73, var41 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1455 == 1) {
                arg0.method4393(field1467, field1456 + 180, 211, 16776960, 0);
                short var43 = 236;
                arg0.method4393(field1468, field1456 + 180, var43, 16777215, 0);
                int var119 = var43 + 15;
                arg0.method4393(field1461, field1456 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method4393(field1470, field1456 + 180, var120, 16777215, 0);
                int var121 = var120 + 15;
                int var44 = field1456 + 180 - 80;
                short var45 = 321;
                Statics.field1476.method4642(var44 - 73, var45 - 20);
                arg0.method4393(class226.field3041, var44, var45 + 5, 16777215, 0);
                int var46 = field1456 + 180 + 80;
                Statics.field1476.method4642(var46 - 73, var45 - 20);
                arg0.method4393(class226.field3099, var46, var45 + 5, 16777215, 0);
            } else if (field1455 == 2) {
                short var47 = 211;
                arg0.method4393(field1468, field1456 + 180, var47, 16776960, 0);
                int var122 = var47 + 15;
                arg0.method4393(field1461, field1456 + 180, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method4393(field1470, field1456 + 180, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var125 = var124 + 10;
                arg0.method4422(class226.field3092, field1456 + 180 - 110, var125, 16777215, 0);
                short var48 = 200;
                String var49;
                for (var49 = field1472; arg0.method4408(var49) > var48; var49 = var49.substring(1)) {
                }
                arg0.method4422(class265.method4466(var49) + (field1454 == 0 & client.field936 % 40 < 20 ? class89.method3729(16776960) + class89.field1416 : ""), field1456 + 180 - 70, var125, 16777215, 0);
                var122 = var125 + 15;
                String var51 = class226.field3086;
                String var52 = field1475;
                String var53 = class271.method4467('*', var52.length());
                arg0.method4422(var51 + var53 + (field1454 == 1 & client.field936 % 40 < 20 ? class89.method3729(16776960) + class89.field1416 : ""), field1456 + 180 - 108, var122, 16777215, 0);
                var122 += 15;
                int var54 = field1456 + 180 - 80;
                short var55 = 321;
                Statics.field1476.method4642(var54 - 73, var55 - 20);
                arg0.method4393(class226.field3018, var54, var55 + 5, 16777215, 0);
                int var56 = field1456 + 180 + 80;
                Statics.field1476.method4642(var56 - 73, var55 - 20);
                arg0.method4393(class226.field3099, var56, var55 + 5, 16777215, 0);
                short var57 = 357;
                arg1.method4393(class226.field3105, field1456 + 180, var57, 16776960, 0);
            } else if (field1455 == 3) {
                short var58 = 201;
                arg0.method4393(class226.field3100, field1456 + 180, var58, 16776960, 0);
                int var126 = var58 + 20;
                arg1.method4393(class226.field2991, field1456 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg1.method4393(class226.field3102, field1456 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                int var59 = field1456 + 180;
                short var60 = 276;
                Statics.field1476.method4642(var59 - 73, var60 - 20);
                arg2.method4393(class226.field3103, var59, var60 + 5, 16777215, 0);
                int var61 = field1456 + 180;
                short var62 = 326;
                Statics.field1476.method4642(var61 - 73, var62 - 20);
                arg2.method4393(class226.field2904, var61, var62 + 5, 16777215, 0);
            } else if (field1455 == 4) {
                arg0.method4393(class226.field3087, field1456 + 180, 211, 16776960, 0);
                short var63 = 236;
                arg0.method4393(field1468, field1456 + 180, var63, 16777215, 0);
                int var129 = var63 + 15;
                arg0.method4393(field1461, field1456 + 180, var129, 16777215, 0);
                int var130 = var129 + 15;
                arg0.method4393(field1470, field1456 + 180, var130, 16777215, 0);
                int var131 = var130 + 15;
                String var65 = class226.field3094;
                String var66 = Statics.field516;
                String var67 = class271.method4467('*', var66.length());
                arg0.method4422(var65 + var67 + (client.field936 % 40 < 20 ? class89.method3729(16776960) + class89.field1416 : ""), field1456 + 180 - 108, var131, 16777215, 0);
                int var132 = var131 - 8;
                arg0.method4422(class226.field2868, field1456 + 180 - 9, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg0.method4422(class226.field2869, field1456 + 180 - 9, var133, 16776960, 0);
                int var68 = field1456 + 180 - 9 + arg0.method4408(class226.field2869) + 15;
                int var69 = var133 - arg0.field3650;
                class285 var70;
                if (field1474) {
                    var70 = Statics.field2856;
                } else {
                    var70 = Statics.field41;
                }
                var70.method4642(var68, var69);
                var129 = var133 + 15;
                int var71 = field1456 + 180 - 80;
                short var72 = 321;
                Statics.field1476.method4642(var71 - 73, var72 - 20);
                arg0.method4393(class226.field3041, var71, var72 + 5, 16777215, 0);
                int var73 = field1456 + 180 + 80;
                Statics.field1476.method4642(var73 - 73, var72 - 20);
                arg0.method4393(class226.field3099, var73, var72 + 5, 16777215, 0);
                arg1.method4393(class226.field3088, field1456 + 180, var72 + 36, 255, 0);
            } else if (field1455 == 5) {
                arg0.method4393(class226.field3097, field1456 + 180, 201, 16776960, 0);
                short var74 = 221;
                arg2.method4393(field1468, field1456 + 180, var74, 16776960, 0);
                int var134 = var74 + 15;
                arg2.method4393(field1461, field1456 + 180, var134, 16776960, 0);
                int var135 = var134 + 15;
                arg2.method4393(field1470, field1456 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                int var137 = var136 + 14;
                arg0.method4422(class226.field3074, field1456 + 180 - 145, var137, 16777215, 0);
                short var75 = 174;
                String var76;
                for (var76 = field1472; arg0.method4408(var76) > var75; var76 = var76.substring(1)) {
                }
                arg0.method4422(class265.method4466(var76) + (client.field936 % 40 < 20 ? class89.method3729(16776960) + class89.field1416 : ""), field1456 + 180 - 34, var137, 16777215, 0);
                var134 = var137 + 15;
                int var77 = field1456 + 180 - 80;
                short var78 = 321;
                Statics.field1476.method4642(var77 - 73, var78 - 20);
                arg0.method4393(class226.field3108, var77, var78 + 5, 16777215, 0);
                int var79 = field1456 + 180 + 80;
                Statics.field1476.method4642(var79 - 73, var78 - 20);
                arg0.method4393(class226.field2886, var79, var78 + 5, 16777215, 0);
            } else if (field1455 == 6) {
                short var80 = 211;
                arg0.method4393(field1468, field1456 + 180, var80, 16776960, 0);
                int var138 = var80 + 15;
                arg0.method4393(field1461, field1456 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg0.method4393(field1470, field1456 + 180, var139, 16776960, 0);
                int var140 = var139 + 15;
                int var81 = field1456 + 180;
                short var82 = 321;
                Statics.field1476.method4642(var81 - 73, var82 - 20);
                arg0.method4393(class226.field2886, var81, var82 + 5, 16777215, 0);
            }
        }
        if (field1457 > 0) {
            int var83 = field1457;
            short var84 = 256;
            field1453 += var83 * 128;
            if (field1453 > Statics.field1383.length) {
                field1453 -= Statics.field1383.length;
                int var85 = (int) (Math.random() * 12.0D);
                method2122(Statics.field3670[var85]);
            }
            int var86 = 0;
            int var87 = var83 * 128;
            int var88 = (var84 - var83) * 128;
            for (int var89 = 0; var89 < var88; var89++) {
                int var90 = Statics.field271[var86 + var87] - Statics.field1383[field1453 + var86 & Statics.field1383.length - 1] * var83 / 6;
                if (var90 < 0) {
                    var90 = 0;
                }
                Statics.field271[var86++] = var90;
            }
            for (int var91 = var84 - var83; var91 < var84; var91++) {
                int var92 = var91 * 128;
                for (int var93 = 0; var93 < 128; var93++) {
                    int var94 = (int) (Math.random() * 100.0D);
                    if (var94 < 50 && var93 > 10 && var93 < 118) {
                        Statics.field271[var92 + var93] = 255;
                    } else {
                        Statics.field271[var92 + var93] = 0;
                    }
                }
            }
            if (field1458 > 0) {
                field1458 -= var83 * 4;
            }
            if (field1459 > 0) {
                field1459 -= var83 * 4;
            }
            if (field1458 == 0 && field1459 == 0) {
                int var95 = (int) (Math.random() * (double) (2000 / var83));
                if (var95 == 0) {
                    field1458 = 1024;
                }
                if (var95 == 1) {
                    field1459 = 1024;
                }
            }
            for (int var96 = 0; var96 < var84 - var83; var96++) {
                field1460[var96] = field1460[var83 + var96];
            }
            for (int var97 = var84 - var83; var97 < var84; var97++) {
                field1460[var97] = (int) (Math.sin((double) field1463 / 14.0D) * 16.0D + Math.sin((double) field1463 / 15.0D) * 14.0D + Math.sin((double) field1463 / 16.0D) * 12.0D);
                field1463++;
            }
            field1466 += var83 * 1414996199;
            int var98 = ((client.field936 & 0x1) + var83) / 2;
            if (var98 > 0) {
                for (int var99 = 0; var99 < field1466 * -981804036; var99++) {
                    int var100 = (int) (Math.random() * 124.0D) + 2;
                    int var101 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field271[(var101 << 7) + var100] = 192;
                }
                field1466 = 0;
                int var102 = 0;
                label418: while (true) {
                    if (var102 >= var84) {
                        int var106 = 0;
                        while (true) {
                            if (var106 >= 128) {
                                break label418;
                            }
                            int var107 = 0;
                            for (int var108 = -var98; var108 < var84; var108++) {
                                int var109 = var108 * 128;
                                if (var98 + var108 < var84) {
                                    var107 += Statics.field865[var98 * 128 + var106 + var109];
                                }
                                if (var108 - (var98 + 1) >= 0) {
                                    var107 -= Statics.field865[var106 + var109 - (var98 + 1) * 128];
                                }
                                if (var108 >= 0) {
                                    Statics.field271[var106 + var109] = var107 / (var98 * 2 + 1);
                                }
                            }
                            var106++;
                        }
                    }
                    int var103 = 0;
                    int var104 = var102 * 128;
                    for (int var105 = -var98; var105 < 128; var105++) {
                        if (var98 + var105 < 128) {
                            var103 += Statics.field271[var104 + var105 + var98];
                        }
                        if (var105 - (var98 + 1) >= 0) {
                            var103 -= Statics.field271[var104 + var105 - (var98 + 1)];
                        }
                        if (var105 >= 0) {
                            Statics.field865[var104 + var105] = var103 / (var98 * 2 + 1);
                        }
                    }
                    var102++;
                }
            }
            field1457 = 0;
        }
        method3910();
        Statics.field544[Statics.field248.field1329 ? 1 : 0].method4642(field1471 + 765 - 40, 463);
        if (client.field934 <= 5 || client.field932 != 0) {
            return;
        }
        if (Statics.field1446 == null) {
            Statics.field1446 = class287.method2863(Statics.field323, "sl_button", "");
            return;
        }
        int var110 = field1471 + 5;
        short var111 = 463;
        byte var112 = 100;
        byte var113 = 35;
        Statics.field1446.method4642(var110, var111);
        arg0.method4393(class226.field3059 + " " + client.field1168, var112 / 2 + var110, var113 / 2 + var111 - 2, 16777215, 0);
        if (Statics.field1312 == null) {
            arg1.method4393(class226.field3141, var112 / 2 + var110, var113 / 2 + var111 + 12, 16777215, 0);
        } else {
            arg1.method4393(class226.field3140, var112 / 2 + var110, var113 / 2 + var111 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("l.y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method56(String arg0, String arg1, String arg2) {
        field1468 = arg0;
        field1461 = arg1;
        field1470 = arg2;
    }

    @ObfuscatedName("dh.j(Ljz;B)V")
    public static final void method2122(class285 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1383.length; var2++) {
            Statics.field1383[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1383[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field294[var8] = (Statics.field1383[var8 - 1] + Statics.field1383[var8 + 1] + Statics.field1383[var8 - 128] + Statics.field1383[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1383;
            Statics.field1383 = Statics.field294;
            Statics.field294 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3784; var11++) {
            for (int var12 = 0; var12 < arg0.field3779; var12++) {
                if (arg0.field3781[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3780;
                    int var14 = var11 + 16 + arg0.field3782;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1383[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("fl.k(IIIB)I")
    public static final int method3082(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("im.e(B)V")
    public static final void method3910() {
        short var0 = 256;
        if (field1458 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1458 > 768) {
                    Statics.field376[var1] = method3082(Statics.field587[var1], Statics.field3327[var1], 1024 - field1458);
                } else if (field1458 > 256) {
                    Statics.field376[var1] = Statics.field3327[var1];
                } else {
                    Statics.field376[var1] = method3082(Statics.field3327[var1], Statics.field587[var1], 256 - field1458);
                }
            }
        } else if (field1459 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1459 > 768) {
                    Statics.field376[var2] = method3082(Statics.field587[var2], Statics.field1371[var2], 1024 - field1459);
                } else if (field1459 > 256) {
                    Statics.field376[var2] = Statics.field1371[var2];
                } else {
                    Statics.field376[var2] = method3082(Statics.field1371[var2], Statics.field587[var2], 256 - field1459);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field376[var3] = Statics.field587[var3];
            }
        }
        class282.method4630(field1471, 9, field1471 + 128, var0 + 7);
        Statics.field1452.method4691(field1471, 0);
        class282.method4554();
        int var4 = 0;
        int var5 = field1471 + Statics.field603.field3765 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1460[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field271[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field376[var10];
                    int var14 = Statics.field603.field3767[var5];
                    Statics.field603.field3767[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field603.field3765 + var8 - 128;
        }
        class282.method4630(field1471 + 765 - 128, 9, field1471 + 765, var0 + 7);
        Statics.field20.method4691(field1471 + 382, 0);
        class282.method4554();
        int var15 = 0;
        int var16 = field1471 + Statics.field603.field3765 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1460[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field271[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field376[var22];
                    int var26 = Statics.field603.field3767[var20];
                    Statics.field603.field3767[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field603.field3765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("cf.o(Lcw;I)V")
    public static void method1576(class81 arg0) {
        if (arg0.method1433() != client.field930) {
            client.field930 = arg0.method1433();
            boolean var1 = arg0.method1433();
            if (Statics.field808 != var1) {
                class257.field3498.method3232();
                class257.field3501.method3232();
                class257.field3549.method3232();
                Statics.field808 = var1;
            }
        }
        Statics.field2362 = arg0.field1318;
        client.field1168 = arg0.field1315;
        client.field927 = arg0.field1316;
        Statics.field482 = client.field1203 == 0 ? 43594 : arg0.field1315 + 40000;
        Statics.field530 = client.field1203 == 0 ? 443 : arg0.field1315 + 50000;
        Statics.field1531 = Statics.field482;
    }

    @ObfuscatedName("cq.z(B)V")
    public static void method1492() {
        if (class81.method5()) {
            field1479 = true;
        }
    }
}

package deob;

@ObfuscatedName("cx")
public class class94 {

    @ObfuscatedName("cx.h")
    public static int field1435 = 0;

    @ObfuscatedName("cx.e")
    public static int field1446 = field1435 + 202;

    @ObfuscatedName("cx.v")
    public static int[] field1440 = new int[256];

    @ObfuscatedName("cx.k")
    public static int field1442 = 0;

    @ObfuscatedName("cx.q")
    public static int field1443 = 0;

    @ObfuscatedName("cx.an")
    public static int field1465 = 0;

    @ObfuscatedName("cx.ar")
    public static int field1439 = 0;

    @ObfuscatedName("cx.ag")
    public static int field1434 = 0;

    @ObfuscatedName("cx.av")
    public static int field1459 = 0;

    @ObfuscatedName("cx.ab")
    public static int field1450 = 10;

    @ObfuscatedName("cx.aj")
    public static String field1451 = "";

    @ObfuscatedName("cx.ae")
    public static int field1452 = 0;

    @ObfuscatedName("cx.at")
    public static String field1453 = "";

    @ObfuscatedName("cx.as")
    public static String field1454 = "";

    @ObfuscatedName("cx.af")
    public static String field1455 = "";

    @ObfuscatedName("cx.au")
    public static String field1456 = "";

    @ObfuscatedName("cx.az")
    public static String field1460 = "";

    @ObfuscatedName("cx.al")
    public static String field1458 = "";

    @ObfuscatedName("cx.am")
    public static class151 field1444 = class151.field2202;

    @ObfuscatedName("cx.ad")
    public static boolean field1436 = true;

    @ObfuscatedName("cx.aa")
    public static int field1461 = 0;

    @ObfuscatedName("cx.aw")
    public static String field1462 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cx.aq")
    public static String field1463 = "1234567890";

    @ObfuscatedName("cx.ak")
    public static boolean field1449 = false;

    @ObfuscatedName("cx.bn")
    public static int field1464 = -1;

    public class94() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.j(Lia;Lia;I)I")
    public static int method15(class237 arg0, class237 arg1) {
        int var2 = 0;
        if (arg0.method3793("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3793("logo", "")) {
            var2++;
        }
        if (arg1.method3793("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3793("titlebox", "")) {
            var2++;
        }
        if (arg1.method3793("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3793("runes", "")) {
            var2++;
        }
        if (arg1.method3793("title_mute", "")) {
            var2++;
        }
        if (arg1.method3793("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3793("options_radio_buttons,2", "")) {
            var2++;
        }
        arg1.method3793("sl_back", "");
        arg1.method3793("sl_flags", "");
        arg1.method3793("sl_arrows", "");
        arg1.method3793("sl_stars", "");
        arg1.method3793("sl_button", "");
        return var2;
    }

    @ObfuscatedName("aa.h(I)I")
    public static int method602() {
        return 9;
    }

    @ObfuscatedName("bl.f(Lia;Lia;ZII)V")
    public static void method1037(class237 arg0, class237 arg1, boolean arg2, int arg3) {
        if (!Statics.field1466) {
            field1452 = arg3;
            class283.method4619();
            byte[] var4 = arg0.method3866("title.jpg", "");
            Statics.field3301 = class55.method1696(var4);
            Statics.field1426 = Statics.field3301.method4704();
            if ((client.field1006 & 0x20000000) == 0) {
                Statics.field269 = class288.method1621(arg1, "logo", "");
            } else {
                Statics.field269 = class288.method1621(arg1, "logo_deadman_mode", "");
            }
            Statics.field1447 = class288.method1621(arg1, "titlebox", "");
            Statics.field1437 = class288.method1621(arg1, "titlebutton", "");
            Statics.field1438 = class288.method186(arg1, "runes", "");
            Statics.field3192 = class288.method186(arg1, "title_mute", "");
            Statics.field602 = class288.method1621(arg1, "options_radio_buttons,0", "");
            Statics.field18 = class288.method1621(arg1, "options_radio_buttons,2", "");
            Statics.field474 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field474[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field474[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field474[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field474[var8 + 192] = 16777215;
            }
            Statics.field400 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field400[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field400[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field400[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field400[var12 + 192] = 16777215;
            }
            Statics.field1441 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1441[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1441[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1441[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1441[var16 + 192] = 16777215;
            }
            Statics.field29 = new int[256];
            Statics.field1457 = new int[32768];
            Statics.field3137 = new int[32768];
            method567((class286) null);
            Statics.field872 = new int[32768];
            Statics.field1445 = new int[32768];
            if (arg2) {
                field1460 = "";
                field1458 = "";
            }
            Statics.field3730 = 0;
            Statics.field1314 = "";
            field1436 = true;
            field1449 = false;
            if (Statics.field22.field1310) {
                class205.field2508 = 1;
                Statics.field2503 = null;
                Statics.field2206 = -1;
                Statics.field2223 = -1;
                Statics.field2505 = 0;
                Statics.field1533 = false;
                Statics.field2506 = 2;
            } else {
                class205.method155(2, Statics.field3387, "scape main", "", 255, false);
            }
            class240.method564(false);
            Statics.field1466 = true;
            field1435 = (Statics.field710 - 765) / 2;
            field1446 = field1435 + 202;
            Statics.field3301.method4730(field1435, 0);
            Statics.field1426.method4730(field1435 + 382, 0);
            Statics.field269.method4681(field1435 + 382 - Statics.field269.field3762 / 2, 18);
        } else if (arg3 == 4) {
            field1452 = 4;
        }
    }

    @ObfuscatedName("ce.p(I)V")
    public static void method1574() {
        if (!Statics.field1466) {
            return;
        }
        Statics.field1447 = null;
        Statics.field1437 = null;
        Statics.field1438 = null;
        Statics.field3301 = null;
        Statics.field1426 = null;
        Statics.field269 = null;
        Statics.field3192 = null;
        Statics.field602 = null;
        Statics.field18 = null;
        Statics.field535 = null;
        Statics.field1467 = null;
        Statics.field539 = null;
        Statics.field1373 = null;
        Statics.field591 = null;
        Statics.field474 = null;
        Statics.field400 = null;
        Statics.field1441 = null;
        Statics.field29 = null;
        Statics.field1457 = null;
        Statics.field3137 = null;
        Statics.field872 = null;
        Statics.field1445 = null;
        class205.field2508 = 1;
        Statics.field2503 = null;
        Statics.field2206 = -1;
        Statics.field2223 = -1;
        Statics.field2505 = 0;
        Statics.field1533 = false;
        Statics.field2506 = 2;
        class240.method564(true);
        Statics.field1466 = false;
    }

    @ObfuscatedName("ch.x(Lbh;I)V")
    public static void method1443(class59 arg0) {
        if (field1449) {
            method490(arg0);
            return;
        }
        if ((class60.field741 == 1 || !Statics.field303 && class60.field741 == 4) && class60.field742 >= field1435 + 765 - 50 && class60.field743 >= 453) {
            Statics.field22.field1310 = !Statics.field22.field1310;
            class82.method333();
            if (Statics.field22.field1310) {
                Statics.field2502.method3460();
                class205.field2508 = 1;
                Statics.field2503 = null;
            } else {
                class205.method657(Statics.field3387, "scape main", "", 255, false);
            }
        }
        if (client.field942 == 5) {
            return;
        }
        field1434++;
        if (client.field942 != 10 && client.field942 != 11) {
            return;
        }
        if (client.field940 == 0) {
            if (class60.field741 == 1 || !Statics.field303 && class60.field741 == 4) {
                int var1 = field1435 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class60.field742 >= var1 && class60.field742 <= var1 + var3 && class60.field743 >= var2 && class60.field743 <= var2 + var4) {
                    if (class81.method1058()) {
                        field1449 = true;
                    }
                    return;
                }
            }
            if (Statics.field835 != null && class81.method1058()) {
                field1449 = true;
            }
        }
        int var5 = class60.field741;
        int var6 = class60.field742;
        int var7 = class60.field743;
        if (!Statics.field303 && var5 == 4) {
            var5 = 1;
        }
        if (field1452 == 0) {
            boolean var8 = false;
            while (class51.method1096()) {
                if (Statics.field626 == 84) {
                    var8 = true;
                }
            }
            int var9 = field1446 + 180 - 80;
            short var10 = 291;
            if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                String var11 = client.method1415("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class57.method59(var11, true, "openjs", false);
            }
            int var12 = field1446 + 180 + 80;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20 || var8) {
                if ((client.field1006 & 0x2000000) != 0) {
                    field1453 = "";
                    field1454 = class227.field3037;
                    field1455 = class227.field3076;
                    field1456 = class227.field3077;
                    field1452 = 1;
                    field1461 = 0;
                } else if ((client.field1006 & 0x4) != 0) {
                    if ((client.field1006 & 0x400) == 0) {
                        field1454 = class227.field3066;
                        field1455 = class227.field3065;
                        field1456 = class227.field3109;
                    } else {
                        field1454 = class227.field3072;
                        field1455 = class227.field3073;
                        field1456 = class227.field3074;
                    }
                    field1453 = class227.field3090;
                    field1452 = 1;
                    field1461 = 0;
                } else if ((client.field1006 & 0x400) == 0) {
                    field1454 = class227.field3062;
                    field1455 = class227.field3063;
                    field1456 = class227.field2994;
                    field1452 = 2;
                    field1461 = 0;
                } else {
                    field1454 = class227.field3069;
                    field1455 = class227.field3070;
                    field1456 = class227.field3071;
                    field1453 = class227.field3090;
                    field1452 = 1;
                    field1461 = 0;
                }
            }
        } else if (field1452 == 1) {
            while (class51.method1096()) {
                if (Statics.field626 == 84) {
                    field1454 = class227.field3062;
                    field1455 = class227.field3063;
                    field1456 = class227.field2994;
                    field1452 = 2;
                    field1461 = 0;
                } else if (Statics.field626 == 13) {
                    field1452 = 0;
                }
            }
            int var13 = field1446 + 180 - 80;
            short var14 = 321;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field1454 = class227.field3062;
                field1455 = class227.field3063;
                field1456 = class227.field2994;
                field1452 = 2;
                field1461 = 0;
            }
            int var15 = field1446 + 180 + 80;
            if (var5 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field1452 = 0;
            }
        } else if (field1452 == 2) {
            short var16 = 231;
            int var38 = var16 + 30;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field1461 = 0;
            }
            var38 += 15;
            if (var5 == 1 && var7 >= var38 - 15 && var7 < var38) {
                field1461 = 1;
            }
            var38 += 15;
            short var17 = 361;
            if (var5 == 1 && var7 >= var17 - 15 && var7 < var17) {
                method1048(class227.field3101, class227.field3102, class227.field3103);
                field1452 = 5;
                return;
            }
            int var18 = field1446 + 180 - 80;
            short var19 = 321;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field1460 = field1460.trim();
                if (field1460.length() == 0) {
                    method1048(class227.field3105, class227.field2969, class227.field3023);
                    return;
                }
                if (field1458.length() == 0) {
                    method1048(class227.field3082, class227.field2972, class227.field2966);
                    return;
                }
                method1048(class227.field3120, class227.field2877, class227.field2912);
                field1444 = Statics.field22.field1312.containsKey(class272.method2670(field1460)) ? class151.field2203 : class151.field2202;
                Statics.method953(20);
                return;
            }
            int var20 = field1446 + 180 + 80;
            if (var5 == 1 && var6 >= var20 - 75 && var6 <= var20 + 75 && var7 >= var19 - 20 && var7 <= var19 + 20) {
                field1452 = 0;
                field1460 = "";
                field1458 = "";
                Statics.field3730 = 0;
                Statics.field1314 = "";
                field1436 = true;
            }
            while (true) {
                while (class51.method1096()) {
                    boolean var21 = false;
                    for (int var22 = 0; var22 < field1462.length(); var22++) {
                        if (Statics.field2808 == field1462.charAt(var22)) {
                            var21 = true;
                            break;
                        }
                    }
                    if (Statics.field626 == 13) {
                        field1452 = 0;
                        field1460 = "";
                        field1458 = "";
                        Statics.field3730 = 0;
                        Statics.field1314 = "";
                        field1436 = true;
                    } else if (field1461 == 0) {
                        if (Statics.field626 == 85 && field1460.length() > 0) {
                            field1460 = field1460.substring(0, field1460.length() - 1);
                        }
                        if (Statics.field626 == 84 || Statics.field626 == 80) {
                            field1461 = 1;
                        }
                        if (var21 && field1460.length() < 320) {
                            field1460 = field1460 + Statics.field2808;
                        }
                    } else if (field1461 == 1) {
                        if (Statics.field626 == 85 && field1458.length() > 0) {
                            field1458 = field1458.substring(0, field1458.length() - 1);
                        }
                        if (Statics.field626 == 84 || Statics.field626 == 80) {
                            field1461 = 0;
                        }
                        if (Statics.field626 == 84) {
                            field1460 = field1460.trim();
                            if (field1460.length() == 0) {
                                method1048(class227.field3105, class227.field2969, class227.field3023);
                                return;
                            }
                            if (field1458.length() == 0) {
                                method1048(class227.field3082, class227.field2972, class227.field2966);
                                return;
                            }
                            method1048(class227.field3120, class227.field2877, class227.field2912);
                            field1444 = Statics.field22.field1312.containsKey(class272.method2670(field1460)) ? class151.field2203 : class151.field2202;
                            Statics.method953(20);
                            return;
                        }
                        if (var21 && field1458.length() < 20) {
                            field1458 = field1458 + Statics.field2808;
                        }
                    }
                }
                return;
            }
        } else if (field1452 == 3) {
            int var23 = field1446 + 180;
            short var24 = 276;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var24 - 20 && var7 <= var24 + 20) {
                field1454 = class227.field3062;
                field1455 = class227.field3063;
                field1456 = class227.field2994;
                field1452 = 2;
                field1461 = 0;
            }
            int var25 = field1446 + 180;
            short var26 = 326;
            if (var5 == 1 && var6 >= var25 - 75 && var6 <= var25 + 75 && var7 >= var26 - 20 && var7 <= var26 + 20) {
                method1048(class227.field3101, class227.field3102, class227.field3103);
                field1452 = 5;
                return;
            }
        } else if (field1452 == 4) {
            int var27 = field1446 + 180 - 80;
            short var28 = 321;
            if (var5 == 1 && var6 >= var27 - 75 && var6 <= var27 + 75 && var7 >= var28 - 20 && var7 <= var28 + 20) {
                Statics.field1314.trim();
                if (Statics.field1314.length() != 6) {
                    method1048(class227.field2887, class227.field2888, class227.field2889);
                    return;
                }
                Statics.field3730 = Integer.parseInt(Statics.field1314);
                Statics.field1314 = "";
                field1444 = field1436 ? class151.field2204 : class151.field2205;
                method1048(class227.field3120, class227.field2877, class227.field2912);
                Statics.method953(20);
                return;
            }
            if (var5 == 1 && var6 >= field1446 + 180 - 9 && var6 <= field1446 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field1436 = !field1436;
            }
            if (var5 == 1 && var6 >= field1446 + 180 - 34 && var6 <= field1446 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class57.method253(client.method1415("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var29 = field1446 + 180 + 80;
            if (var5 == 1 && var6 >= var29 - 75 && var6 <= var29 + 75 && var7 >= var28 - 20 && var7 <= var28 + 20) {
                field1452 = 0;
                field1460 = "";
                field1458 = "";
                Statics.field3730 = 0;
                Statics.field1314 = "";
            }
            while (class51.method1096()) {
                boolean var30 = false;
                for (int var31 = 0; var31 < field1463.length(); var31++) {
                    if (Statics.field2808 == field1463.charAt(var31)) {
                        var30 = true;
                        break;
                    }
                }
                if (Statics.field626 == 13) {
                    field1452 = 0;
                    field1460 = "";
                    field1458 = "";
                    Statics.field3730 = 0;
                    Statics.field1314 = "";
                } else {
                    if (Statics.field626 == 85 && Statics.field1314.length() > 0) {
                        Statics.field1314 = Statics.field1314.substring(0, Statics.field1314.length() - 1);
                    }
                    if (Statics.field626 == 84) {
                        Statics.field1314.trim();
                        if (Statics.field1314.length() != 6) {
                            method1048(class227.field2887, class227.field2888, class227.field2889);
                            return;
                        }
                        Statics.field3730 = Integer.parseInt(Statics.field1314);
                        Statics.field1314 = "";
                        field1444 = field1436 ? class151.field2204 : class151.field2205;
                        method1048(class227.field3120, class227.field2877, class227.field2912);
                        Statics.method953(20);
                        return;
                    }
                    if (var30 && Statics.field1314.length() < 6) {
                        Statics.field1314 = Statics.field1314 + Statics.field2808;
                    }
                }
            }
        } else if (field1452 == 5) {
            int var32 = field1446 + 180 - 80;
            short var33 = 321;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                method1501();
                return;
            }
            int var34 = field1446 + 180 + 80;
            if (var5 == 1 && var6 >= var34 - 75 && var6 <= var34 + 75 && var7 >= var33 - 20 && var7 <= var33 + 20) {
                field1454 = class227.field3062;
                field1455 = class227.field3063;
                field1456 = class227.field2994;
                field1452 = 2;
                field1461 = 0;
                field1458 = "";
            }
            while (class51.method1096()) {
                boolean var35 = false;
                for (int var36 = 0; var36 < field1462.length(); var36++) {
                    if (Statics.field2808 == field1462.charAt(var36)) {
                        var35 = true;
                        break;
                    }
                }
                if (Statics.field626 == 13) {
                    field1454 = class227.field3062;
                    field1455 = class227.field3063;
                    field1456 = class227.field2994;
                    field1452 = 2;
                    field1461 = 0;
                    field1458 = "";
                } else {
                    if (Statics.field626 == 85 && field1460.length() > 0) {
                        field1460 = field1460.substring(0, field1460.length() - 1);
                    }
                    if (Statics.field626 == 84) {
                        method1501();
                        return;
                    }
                    if (var35 && field1460.length() < 320) {
                        field1460 = field1460 + Statics.field2808;
                    }
                }
            }
        } else if (field1452 == 6) {
            while (true) {
                do {
                    if (!class51.method1096()) {
                        short var37 = 321;
                        if (var5 == 1 && var7 >= var37 - 20 && var7 <= var37 + 20) {
                            field1454 = class227.field3062;
                            field1455 = class227.field3063;
                            field1456 = class227.field2994;
                            field1452 = 2;
                            field1461 = 0;
                            field1458 = "";
                        }
                        return;
                    }
                } while (Statics.field626 != 84 && Statics.field626 != 13);
                field1454 = class227.field3062;
                field1455 = class227.field3063;
                field1456 = class227.field2994;
                field1452 = 2;
                field1461 = 0;
                field1458 = "";
            }
        }
    }

    @ObfuscatedName("cg.g(I)V")
    public static void method1501() {
        field1460 = field1460.trim();
        if (field1460.length() == 0) {
            method1048(class227.field3101, class227.field3102, class227.field3103);
            return;
        }
        long var0 = class89.method1716();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class89.method173(var0, field1460);
        }
        switch(var2) {
            case 2:
                method1048(class227.field3104, class227.field2976, class227.field3106);
                field1452 = 6;
                break;
            case 3:
                method1048(class227.field3107, class227.field2902, class227.field2858);
                break;
            case 4:
                method1048(class227.field2989, class227.field3111, class227.field3112);
                break;
            case 5:
                method1048(class227.field3113, class227.field3114, class227.field3115);
                break;
            case 6:
                method1048(class227.field3127, class227.field2897, class227.field2872);
                break;
            case 7:
                method1048(class227.field3119, class227.field2941, class227.field3015);
        }
    }

    @ObfuscatedName("ht.c(Ljh;Ljh;Ljh;ZB)V")
    public static void method3593(class265 arg0, class265 arg1, class265 arg2, boolean arg3) {
        if (arg3) {
            field1435 = (Statics.field710 - 765) / 2;
            field1446 = field1435 + 202;
        }
        if (field1449) {
            if (Statics.field535 == null) {
                Statics.field535 = class288.method722(Statics.field2410, "sl_back", "");
            }
            if (Statics.field1467 == null) {
                Statics.field1467 = class288.method186(Statics.field2410, "sl_flags", "");
            }
            if (Statics.field539 == null) {
                Statics.field539 = class288.method186(Statics.field2410, "sl_arrows", "");
            }
            if (Statics.field1373 == null) {
                Statics.field1373 = class288.method186(Statics.field2410, "sl_stars", "");
            }
            class283.method4601(field1435, 23, 765, 480, 0);
            class283.method4606(field1435, 0, 125, 23, 12425273, 9135624);
            class283.method4606(field1435 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4476(class227.field2903, field1435 + 62, 15, 0, -1);
            if (Statics.field1373 != null) {
                Statics.field1373[1].method4681(field1435 + 140, 1);
                arg1.method4420(class227.field3121, field1435 + 152, 10, 16777215, -1);
                Statics.field1373[0].method4681(field1435 + 140, 12);
                arg1.method4420(class227.field3124, field1435 + 152, 21, 16777215, -1);
            }
            if (Statics.field539 != null) {
                int var4 = field1435 + 280;
                if (class81.field1294[0] == 0 && class81.field1293[0] == 0) {
                    Statics.field539[2].method4681(var4, 4);
                } else {
                    Statics.field539[0].method4681(var4, 4);
                }
                if (class81.field1294[0] == 0 && class81.field1293[0] == 1) {
                    Statics.field539[3].method4681(var4 + 15, 4);
                } else {
                    Statics.field539[1].method4681(var4 + 15, 4);
                }
                arg0.method4420(class227.field3125, var4 + 32, 17, 16777215, -1);
                int var5 = field1435 + 390;
                if (class81.field1294[0] == 1 && class81.field1293[0] == 0) {
                    Statics.field539[2].method4681(var5, 4);
                } else {
                    Statics.field539[0].method4681(var5, 4);
                }
                if (class81.field1294[0] == 1 && class81.field1293[0] == 1) {
                    Statics.field539[3].method4681(var5 + 15, 4);
                } else {
                    Statics.field539[1].method4681(var5 + 15, 4);
                }
                arg0.method4420(class227.field3126, var5 + 32, 17, 16777215, -1);
                int var6 = field1435 + 500;
                if (class81.field1294[0] == 2 && class81.field1293[0] == 0) {
                    Statics.field539[2].method4681(var6, 4);
                } else {
                    Statics.field539[0].method4681(var6, 4);
                }
                if (class81.field1294[0] == 2 && class81.field1293[0] == 1) {
                    Statics.field539[3].method4681(var6 + 15, 4);
                } else {
                    Statics.field539[1].method4681(var6 + 15, 4);
                }
                arg0.method4420(class227.field3034, var6 + 32, 17, 16777215, -1);
                int var7 = field1435 + 610;
                if (class81.field1294[0] == 3 && class81.field1293[0] == 0) {
                    Statics.field539[2].method4681(var7, 4);
                } else {
                    Statics.field539[0].method4681(var7, 4);
                }
                if (class81.field1294[0] == 3 && class81.field1293[0] == 1) {
                    Statics.field539[3].method4681(var7 + 15, 4);
                } else {
                    Statics.field539[1].method4681(var7 + 15, 4);
                }
                arg0.method4420(class227.field3128, var7 + 32, 17, 16777215, -1);
            }
            class283.method4601(field1435 + 708, 4, 50, 16, 0);
            arg1.method4476(class227.field2993, field1435 + 708 + 25, 16, 16777215, -1);
            field1464 = -1;
            if (Statics.field535 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class81.field1291) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1291) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1291) {
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
                int var19 = field1435 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class81.field1291; var22++) {
                    class81 var23 = Statics.field1290[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1296);
                    if (var23.field1296 == -1) {
                        var25 = class227.field3129;
                        var24 = false;
                    } else if (var23.field1296 > 1980) {
                        var25 = class227.field2892;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1422()) {
                        if (var23.method1441()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1421()) {
                        var26 = 16711680;
                        if (var23.method1441()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1419()) {
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
                    if (class60.field735 >= var19 && class60.field736 * -261504029 >= var18 && class60.field735 < var8 + var19 && class60.field736 * -261504029 < var9 + var18 && var24) {
                        field1464 = var22;
                        Statics.field535[var27].method4783(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field535[var27].method4730(var19, var18);
                    }
                    if (Statics.field1467 != null) {
                        Statics.field1467[(var23.method1441() ? 8 : 0) + var23.field1300].method4681(var19 + 29, var18);
                    }
                    arg0.method4476(Integer.toString(var23.field1304), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4476(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4415(Statics.field1290[field1464].field1299) + 6;
                    int var29 = arg1.field3632 + 8;
                    class283.method4601(class60.field735 - var28 / 2, class60.field736 * -261504029 + 20 + 5, var28, var29, 16777120);
                    class283.method4608(class60.field735 - var28 / 2, class60.field736 * -261504029 + 20 + 5, var28, var29, 0);
                    arg1.method4476(Statics.field1290[field1464].field1299, class60.field735, class60.field736 * -261504029 + 20 + 5 + arg1.field3632 + 4, 0, -1);
                }
            }
            Statics.field2287.method761(0, 0);
            return;
        }
        if (arg3) {
            Statics.field3301.method4730(field1435, 0);
            Statics.field1426.method4730(field1435 + 382, 0);
            Statics.field269.method4681(field1435 + 382 - Statics.field269.field3762 / 2, 18);
        }
        if (client.field942 == 0 || client.field942 == 5) {
            byte var30 = 20;
            arg0.method4476(class227.field3061, field1446 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class283.method4608(field1446 + 180 - 152, var31, 304, 34, 9179409);
            class283.method4608(field1446 + 180 - 151, var31 + 1, 302, 32, 0);
            class283.method4601(field1446 + 180 - 150, var31 + 2, field1450 * 3, 30, 9179409);
            class283.method4601(field1450 * 3 + (field1446 + 180 - 150), var31 + 2, 300 - field1450 * 3, 30, 0);
            arg0.method4476(field1451, field1446 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field942 == 20) {
            Statics.field1447.method4681(field1446 + 180 - Statics.field1447.field3762 / 2, 271 - Statics.field1447.field3765 / 2);
            short var32 = 211;
            arg0.method4476(field1454, field1446 + 180, var32, 16776960, 0);
            int var126 = var32 + 15;
            arg0.method4476(field1455, field1446 + 180, var126, 16776960, 0);
            int var127 = var126 + 15;
            arg0.method4476(field1456, field1446 + 180, var127, 16776960, 0);
            int var128 = var127 + 15;
            int var129 = var128 + 10;
            if (field1452 != 4) {
                arg0.method4420(class227.field2939, field1446 + 180 - 110, var129, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = field1460; arg0.method4415(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method4420(class266.method4419(var34), field1446 + 180 - 70, var129, 16777215, 0);
                var126 = var129 + 15;
                String var36 = class227.field3084;
                String var37 = field1458;
                int var38 = var37.length();
                char[] var39 = new char[var38];
                for (int var40 = 0; var40 < var38; var40++) {
                    var39[var40] = '*';
                }
                String var41 = new String(var39);
                arg0.method4420(var36 + var41, field1446 + 180 - 108, var126, 16777215, 0);
                var126 += 15;
            }
        }
        if (client.field942 == 10 || client.field942 == 11) {
            Statics.field1447.method4681(field1446, 171);
            if (field1452 == 0) {
                short var43 = 251;
                arg0.method4476(class227.field3086, field1446 + 180, var43, 16776960, 0);
                int var130 = var43 + 30;
                int var44 = field1446 + 180 - 80;
                short var45 = 291;
                Statics.field1437.method4681(var44 - 73, var45 - 20);
                arg0.method4424(class227.field3087, var44 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var46 = field1446 + 180 + 80;
                Statics.field1437.method4681(var46 - 73, var45 - 20);
                arg0.method4424(class227.field3088, var46 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1452 == 1) {
                arg0.method4476(field1453, field1446 + 180, 211, 16776960, 0);
                short var47 = 236;
                arg0.method4476(field1454, field1446 + 180, var47, 16777215, 0);
                int var131 = var47 + 15;
                arg0.method4476(field1455, field1446 + 180, var131, 16777215, 0);
                int var132 = var131 + 15;
                arg0.method4476(field1456, field1446 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                int var48 = field1446 + 180 - 80;
                short var49 = 321;
                Statics.field1437.method4681(var48 - 73, var49 - 20);
                arg0.method4476(class227.field2857, var48, var49 + 5, 16777215, 0);
                int var50 = field1446 + 180 + 80;
                Statics.field1437.method4681(var50 - 73, var49 - 20);
                arg0.method4476(class227.field2993, var50, var49 + 5, 16777215, 0);
            } else if (field1452 == 2) {
                short var51 = 211;
                arg0.method4476(field1454, field1446 + 180, var51, 16776960, 0);
                int var134 = var51 + 15;
                arg0.method4476(field1455, field1446 + 180, var134, 16776960, 0);
                int var135 = var134 + 15;
                arg0.method4476(field1456, field1446 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                int var137 = var136 + 10;
                arg0.method4420(class227.field2939, field1446 + 180 - 110, var137, 16777215, 0);
                short var52 = 200;
                String var53;
                for (var53 = field1460; arg0.method4415(var53) > var52; var53 = var53.substring(1)) {
                }
                arg0.method4420(class266.method4419(var53) + (field1461 == 0 & client.field944 % 40 < 20 ? class90.method2296(16776960) + class90.field1402 : ""), field1446 + 180 - 70, var137, 16777215, 0);
                var134 = var137 + 15;
                String var55 = class227.field3084;
                String var56 = field1458;
                int var57 = var56.length();
                char[] var58 = new char[var57];
                for (int var59 = 0; var59 < var57; var59++) {
                    var58[var59] = '*';
                }
                String var60 = new String(var58);
                arg0.method4420(var55 + var60 + (field1461 == 1 & client.field944 % 40 < 20 ? class90.method2296(16776960) + class90.field1402 : ""), field1446 + 180 - 108, var134, 16777215, 0);
                var134 += 15;
                int var62 = field1446 + 180 - 80;
                short var63 = 321;
                Statics.field1437.method4681(var62 - 73, var63 - 20);
                arg0.method4476(class227.field3089, var62, var63 + 5, 16777215, 0);
                int var64 = field1446 + 180 + 80;
                Statics.field1437.method4681(var64 - 73, var63 - 20);
                arg0.method4476(class227.field2993, var64, var63 + 5, 16777215, 0);
                short var65 = 357;
                arg1.method4476(class227.field3096, field1446 + 180, var65, 16776960, 0);
            } else if (field1452 == 3) {
                short var66 = 201;
                arg0.method4476(class227.field3091, field1446 + 180, var66, 16776960, 0);
                int var138 = var66 + 20;
                arg1.method4476(class227.field3092, field1446 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg1.method4476(class227.field2909, field1446 + 180, var139, 16776960, 0);
                int var140 = var139 + 15;
                int var67 = field1446 + 180;
                short var68 = 276;
                Statics.field1437.method4681(var67 - 73, var68 - 20);
                arg2.method4476(class227.field3094, var67, var68 + 5, 16777215, 0);
                int var69 = field1446 + 180;
                short var70 = 326;
                Statics.field1437.method4681(var69 - 73, var70 - 20);
                arg2.method4476(class227.field3095, var69, var70 + 5, 16777215, 0);
            } else if (field1452 == 4) {
                arg0.method4476(class227.field3078, field1446 + 180, 211, 16776960, 0);
                short var71 = 236;
                arg0.method4476(field1454, field1446 + 180, var71, 16777215, 0);
                int var141 = var71 + 15;
                arg0.method4476(field1455, field1446 + 180, var141, 16777215, 0);
                int var142 = var141 + 15;
                arg0.method4476(field1456, field1446 + 180, var142, 16777215, 0);
                int var143 = var142 + 15;
                String var73 = class227.field3131;
                String var74 = Statics.field1314;
                int var75 = var74.length();
                char[] var76 = new char[var75];
                for (int var77 = 0; var77 < var75; var77++) {
                    var76[var77] = '*';
                }
                String var78 = new String(var76);
                arg0.method4420(var73 + var78 + (client.field944 % 40 < 20 ? class90.method2296(16776960) + class90.field1402 : ""), field1446 + 180 - 108, var143, 16777215, 0);
                var141 = var143 - 8;
                arg0.method4420(class227.field3007, field1446 + 180 - 9, var141, 16776960, 0);
                var141 += 15;
                arg0.method4420(class227.field3028, field1446 + 180 - 9, var141, 16776960, 0);
                int var80 = field1446 + 180 - 9 + arg0.method4415(class227.field3028) + 15;
                int var81 = var141 - arg0.field3632;
                class286 var82;
                if (field1436) {
                    var82 = Statics.field18;
                } else {
                    var82 = Statics.field602;
                }
                var82.method4681(var80, var81);
                var141 += 15;
                int var83 = field1446 + 180 - 80;
                short var84 = 321;
                Statics.field1437.method4681(var83 - 73, var84 - 20);
                arg0.method4476(class227.field2857, var83, var84 + 5, 16777215, 0);
                int var85 = field1446 + 180 + 80;
                Statics.field1437.method4681(var85 - 73, var84 - 20);
                arg0.method4476(class227.field2993, var85, var84 + 5, 16777215, 0);
                arg1.method4476(class227.field3079, field1446 + 180, var84 + 36, 255, 0);
            } else if (field1452 == 5) {
                arg0.method4476(class227.field3097, field1446 + 180, 201, 16776960, 0);
                short var86 = 221;
                arg2.method4476(field1454, field1446 + 180, var86, 16776960, 0);
                int var144 = var86 + 15;
                arg2.method4476(field1455, field1446 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                arg2.method4476(field1456, field1446 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                int var147 = var146 + 14;
                arg0.method4420(class227.field3035, field1446 + 180 - 145, var147, 16777215, 0);
                short var87 = 174;
                String var88;
                for (var88 = field1460; arg0.method4415(var88) > var87; var88 = var88.substring(1)) {
                }
                arg0.method4420(class266.method4419(var88) + (client.field944 % 40 < 20 ? class90.method2296(16776960) + class90.field1402 : ""), field1446 + 180 - 34, var147, 16777215, 0);
                var144 = var147 + 15;
                int var89 = field1446 + 180 - 80;
                short var90 = 321;
                Statics.field1437.method4681(var89 - 73, var90 - 20);
                arg0.method4476(class227.field3001, var89, var90 + 5, 16777215, 0);
                int var91 = field1446 + 180 + 80;
                Statics.field1437.method4681(var91 - 73, var90 - 20);
                arg0.method4476(class227.field3100, var91, var90 + 5, 16777215, 0);
            } else if (field1452 == 6) {
                short var92 = 211;
                arg0.method4476(field1454, field1446 + 180, var92, 16776960, 0);
                int var148 = var92 + 15;
                arg0.method4476(field1455, field1446 + 180, var148, 16776960, 0);
                int var149 = var148 + 15;
                arg0.method4476(field1456, field1446 + 180, var149, 16776960, 0);
                int var150 = var149 + 15;
                int var93 = field1446 + 180;
                short var94 = 321;
                Statics.field1437.method4681(var93 - 73, var94 - 20);
                arg0.method4476(class227.field3100, var93, var94 + 5, 16777215, 0);
            }
        }
        if (field1434 > 0) {
            method1388(field1434);
            field1434 = 0;
        }
        short var95 = 256;
        if (field1442 > 0) {
            for (int var96 = 0; var96 < 256; var96++) {
                if (field1442 > 768) {
                    Statics.field29[var96] = method44(Statics.field474[var96], Statics.field400[var96], 1024 - field1442);
                } else if (field1442 > 256) {
                    Statics.field29[var96] = Statics.field400[var96];
                } else {
                    Statics.field29[var96] = method44(Statics.field400[var96], Statics.field474[var96], 256 - field1442);
                }
            }
        } else if (field1443 > 0) {
            for (int var97 = 0; var97 < 256; var97++) {
                if (field1443 > 768) {
                    Statics.field29[var97] = method44(Statics.field474[var97], Statics.field1441[var97], 1024 - field1443);
                } else if (field1443 > 256) {
                    Statics.field29[var97] = Statics.field1441[var97];
                } else {
                    Statics.field29[var97] = method44(Statics.field1441[var97], Statics.field474[var97], 256 - field1443);
                }
            }
        } else {
            for (int var98 = 0; var98 < 256; var98++) {
                Statics.field29[var98] = Statics.field474[var98];
            }
        }
        class283.method4628(field1435, 9, field1435 + 128, var95 + 7);
        Statics.field3301.method4730(field1435, 0);
        class283.method4592();
        int var99 = 0;
        int var100 = field1435 + Statics.field2287.field3751 * 9;
        for (int var101 = 1; var101 < var95 - 1; var101++) {
            int var102 = (var95 - var101) * field1440[var101] / var95;
            int var103 = var102 + 22;
            if (var103 < 0) {
                var103 = 0;
            }
            var99 += var103;
            for (int var104 = var103; var104 < 128; var104++) {
                int var105 = Statics.field872[var99++];
                if (var105 == 0) {
                    var100++;
                } else {
                    int var107 = 256 - var105;
                    int var108 = Statics.field29[var105];
                    int var109 = Statics.field2287.field3750[var100];
                    Statics.field2287.field3750[var100++] = ((var108 & 0xFF00FF) * var105 + (var109 & 0xFF00FF) * var107 & 0xFF00FF00) + ((var108 & 0xFF00) * var105 + (var109 & 0xFF00) * var107 & 0xFF0000) >> 8;
                }
            }
            var100 += Statics.field2287.field3751 + var103 - 128;
        }
        class283.method4628(field1435 + 765 - 128, 9, field1435 + 765, var95 + 7);
        Statics.field1426.method4730(field1435 + 382, 0);
        class283.method4592();
        int var110 = 0;
        int var111 = field1435 + Statics.field2287.field3751 * 9 + 24 + 637;
        for (int var112 = 1; var112 < var95 - 1; var112++) {
            int var113 = (var95 - var112) * field1440[var112] / var95;
            int var114 = 103 - var113;
            int var115 = var111 + var113;
            for (int var116 = 0; var116 < var114; var116++) {
                int var117 = Statics.field872[var110++];
                if (var117 == 0) {
                    var115++;
                } else {
                    int var119 = 256 - var117;
                    int var120 = Statics.field29[var117];
                    int var121 = Statics.field2287.field3750[var115];
                    Statics.field2287.field3750[var115++] = ((var120 & 0xFF00) * var117 + (var121 & 0xFF00) * var119 & 0xFF0000) + ((var120 & 0xFF00FF) * var117 + (var121 & 0xFF00FF) * var119 & 0xFF00FF00) >> 8;
                }
            }
            var110 += 128 - var114;
            var111 = Statics.field2287.field3751 - var114 - var113 + var115;
        }
        Statics.field3192[Statics.field22.field1310 ? 1 : 0].method4681(field1435 + 765 - 40, 463);
        if (client.field942 <= 5 || client.field940 != 0) {
            return;
        }
        if (Statics.field591 == null) {
            Statics.field591 = class288.method1621(Statics.field2410, "sl_button", "");
            return;
        }
        int var122 = field1435 + 5;
        short var123 = 463;
        byte var124 = 100;
        byte var125 = 35;
        Statics.field591.method4681(var122, var123);
        arg0.method4476(class227.field2915 + " " + client.field935, var124 / 2 + var122, var125 / 2 + var123 - 2, 16777215, 0);
        if (Statics.field835 == null) {
            arg1.method4476(class227.field3132, var124 / 2 + var122, var125 / 2 + var123 + 12, 16777215, 0);
        } else {
            arg1.method4476(class227.field2985, var124 / 2 + var122, var125 / 2 + var123 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("bt.l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1048(String arg0, String arg1, String arg2) {
        field1454 = arg0;
        field1455 = arg1;
        field1456 = arg2;
    }

    @ObfuscatedName("ad.w(Ljr;S)V")
    public static final void method567(class286 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1457.length; var2++) {
            Statics.field1457[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1457[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field3137[var8] = (Statics.field1457[var8 - 1] + Statics.field1457[var8 + 1] + Statics.field1457[var8 - 128] + Statics.field1457[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1457;
            Statics.field1457 = Statics.field3137;
            Statics.field3137 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3765; var11++) {
            for (int var12 = 0; var12 < arg0.field3762; var12++) {
                if (arg0.field3761[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3764;
                    int var14 = var11 + 16 + arg0.field3763;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1457[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("bs.b(II)V")
    public static final void method1388(int arg0) {
        short var1 = 256;
        field1465 += arg0 * 128;
        if (field1465 > Statics.field1457.length) {
            field1465 -= Statics.field1457.length;
            int var2 = (int) (Math.random() * 12.0D);
            method567(Statics.field1438[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field872[var3 + var4] - Statics.field1457[field1465 + var3 & Statics.field1457.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field872[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field872[var9 + var10] = 255;
                } else {
                    Statics.field872[var9 + var10] = 0;
                }
            }
        }
        if (field1442 > 0) {
            field1442 -= arg0 * 4;
        }
        if (field1443 > 0) {
            field1443 -= arg0 * 4;
        }
        if (field1442 == 0 && field1443 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1442 = 1024;
            }
            if (var12 == 1) {
                field1443 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1440[var13] = field1440[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1440[var14] = (int) (Math.sin((double) field1459 / 14.0D) * 16.0D + Math.sin((double) field1459 / 15.0D) * 14.0D + Math.sin((double) field1459 / 16.0D) * 12.0D);
            field1459++;
        }
        field1439 += arg0 * 1549863487;
        int var15 = ((client.field944 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1439 * -1308770660; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field872[(var18 << 7) + var17] = 192;
        }
        field1439 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field872[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field872[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1445[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1445[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1445[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field872[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("m.o(IIIB)I")
    public static final int method44(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("au.m(Lbh;B)V")
    public static void method490(class59 arg0) {
        if (class60.field741 != 1 && Statics.field303 || class60.field741 != 4) {
            return;
        }
        int var1 = field1435 + 280;
        if (class60.field742 >= var1 && class60.field742 <= var1 + 14 && class60.field743 >= 4 && class60.field743 <= 18) {
            class81.method46(0, 0);
            return;
        }
        if (class60.field742 >= var1 + 15 && class60.field742 <= var1 + 80 && class60.field743 >= 4 && class60.field743 <= 18) {
            class81.method46(0, 1);
            return;
        }
        int var2 = field1435 + 390;
        if (class60.field742 >= var2 && class60.field742 <= var2 + 14 && class60.field743 >= 4 && class60.field743 <= 18) {
            class81.method46(1, 0);
            return;
        }
        if (class60.field742 >= var2 + 15 && class60.field742 <= var2 + 80 && class60.field743 >= 4 && class60.field743 <= 18) {
            class81.method46(1, 1);
            return;
        }
        int var3 = field1435 + 500;
        if (class60.field742 >= var3 && class60.field742 <= var3 + 14 && class60.field743 >= 4 && class60.field743 <= 18) {
            class81.method46(2, 0);
            return;
        }
        if (class60.field742 >= var3 + 15 && class60.field742 <= var3 + 80 && class60.field743 >= 4 && class60.field743 <= 18) {
            class81.method46(2, 1);
            return;
        }
        int var4 = field1435 + 610;
        if (class60.field742 >= var4 && class60.field742 <= var4 + 14 && class60.field743 >= 4 && class60.field743 <= 18) {
            class81.method46(3, 0);
            return;
        }
        if (class60.field742 >= var4 + 15 && class60.field742 <= var4 + 80 && class60.field743 >= 4 && class60.field743 <= 18) {
            class81.method46(3, 1);
            return;
        }
        if (class60.field742 >= field1435 + 708 && class60.field743 >= 4 && class60.field742 <= field1435 + 708 + 50 && class60.field743 <= 20) {
            field1449 = false;
            Statics.field3301.method4730(field1435, 0);
            Statics.field1426.method4730(field1435 + 382, 0);
            Statics.field269.method4681(field1435 + 382 - Statics.field269.field3762 / 2, 18);
            return;
        }
        if (field1464 == -1) {
            return;
        }
        class81 var5 = Statics.field1290[field1464];
        method1921(var5);
        field1449 = false;
        Statics.field3301.method4730(field1435, 0);
        Statics.field1426.method4730(field1435 + 382, 0);
        Statics.field269.method4681(field1435 + 382 - Statics.field269.field3762 / 2, 18);
        return;
    }

    @ObfuscatedName("dx.e(Lch;I)V")
    public static void method1921(class81 arg0) {
        if (arg0.method1441() != client.field1104) {
            client.field1104 = arg0.method1441();
            boolean var1 = arg0.method1441();
            if (Statics.field3480 != var1) {
                class258.field3493.method3259();
                class258.field3481.method3259();
                class258.field3484.method3259();
                Statics.field3480 = var1;
            }
        }
        Statics.field2322 = arg0.field1297;
        client.field935 = arg0.field1304;
        client.field1006 = arg0.field1302;
        Statics.field3742 = client.field1183 == 0 ? 43594 : arg0.field1304 + 40000;
        Statics.field378 = client.field1183 == 0 ? 443 : arg0.field1304 + 50000;
        Statics.field844 = Statics.field3742;
    }
}

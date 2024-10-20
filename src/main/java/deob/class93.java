package deob;

@ObfuscatedName("cw")
public class class93 {

    @ObfuscatedName("cw.o")
    public static int field1436 = 0;

    @ObfuscatedName("cw.l")
    public static int field1439 = field1436 + 202;

    @ObfuscatedName("cw.n")
    public static int[] field1442 = new int[256];

    @ObfuscatedName("cw.y")
    public static int field1435 = 0;

    @ObfuscatedName("cw.t")
    public static int field1445 = 0;

    @ObfuscatedName("cw.af")
    public static int field1447 = 0;

    @ObfuscatedName("cw.ai")
    public static int field1446 = 0;

    @ObfuscatedName("cw.ad")
    public static int field1438 = 0;

    @ObfuscatedName("cw.ar")
    public static int field1448 = 0;

    @ObfuscatedName("cw.aq")
    public static int field1449 = 10;

    @ObfuscatedName("cw.ag")
    public static String field1453 = "";

    @ObfuscatedName("cw.ak")
    public static int field1451 = 0;

    @ObfuscatedName("cw.ae")
    public static String field1452 = "";

    @ObfuscatedName("cw.am")
    public static String field1454 = "";

    @ObfuscatedName("cw.az")
    public static String field1467 = "";

    @ObfuscatedName("cw.ay")
    public static String field1455 = "";

    @ObfuscatedName("cw.as")
    public static String field1459 = "";

    @ObfuscatedName("cw.aw")
    public static String field1457 = "";

    @ObfuscatedName("cw.at")
    public static class150 field1458 = class150.field2206;

    @ObfuscatedName("cw.an")
    public static boolean field1443 = true;

    @ObfuscatedName("cw.ab")
    public static int field1460 = 0;

    @ObfuscatedName("cw.av")
    public static String field1461 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cw.al")
    public static String field1462 = "1234567890";

    @ObfuscatedName("cw.au")
    public static boolean field1463 = false;

    @ObfuscatedName("cw.by")
    public static int field1450 = -1;

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.w(Liq;Liq;I)I")
    public static int method149(class239 arg0, class239 arg1) {
        int var2 = 0;
        if (arg0.method3723("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3723("logo", "")) {
            var2++;
        }
        if (arg1.method3723("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3723("titlebox", "")) {
            var2++;
        }
        if (arg1.method3723("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3723("runes", "")) {
            var2++;
        }
        if (arg1.method3723("title_mute", "")) {
            var2++;
        }
        if (arg1.method3723("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3723("options_radio_buttons,2", "")) {
            var2++;
        }
        arg1.method3723("sl_back", "");
        arg1.method3723("sl_flags", "");
        arg1.method3723("sl_arrows", "");
        arg1.method3723("sl_stars", "");
        arg1.method3723("sl_button", "");
        return var2;
    }

    @ObfuscatedName("hu.o(B)I")
    public static int method3689() {
        return 9;
    }

    @ObfuscatedName("jx.x(Liq;Liq;ZII)V")
    public static void method4272(class239 arg0, class239 arg1, boolean arg2, int arg3) {
        if (!Statics.field1441) {
            field1451 = arg3;
            class285.method4597();
            byte[] var4 = arg0.method3745("title.jpg", "");
            Statics.field843 = class55.method1567(var4);
            Statics.field1465 = Statics.field843.method4689();
            if ((client.field929 & 0x20000000) == 0) {
                Statics.field1456 = class290.method3891(arg1, "logo", "");
            } else {
                Statics.field1456 = class290.method3891(arg1, "logo_deadman_mode", "");
            }
            Statics.field621 = class290.method3891(arg1, "titlebox", "");
            Statics.field1444 = class290.method3891(arg1, "titlebutton", "");
            Statics.field3211 = class290.method3638(arg1, "runes", "");
            Statics.field873 = class290.method3638(arg1, "title_mute", "");
            Statics.field263 = class290.method3891(arg1, "options_radio_buttons,0", "");
            Statics.field299 = class290.method3891(arg1, "options_radio_buttons,2", "");
            Statics.field588 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field588[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field588[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field588[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field588[var8 + 192] = 16777215;
            }
            Statics.field1566 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1566[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1566[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1566[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1566[var12 + 192] = 16777215;
            }
            Statics.field3386 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field3386[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field3386[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field3386[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field3386[var16 + 192] = 16777215;
            }
            Statics.field1796 = new int[256];
            Statics.field610 = new int[32768];
            Statics.field34 = new int[32768];
            method237((class288) null);
            Statics.field2337 = new int[32768];
            Statics.field2443 = new int[32768];
            if (arg2) {
                field1459 = "";
                field1457 = "";
            }
            Statics.field760 = 0;
            Statics.field862 = "";
            field1443 = true;
            field1463 = false;
            if (Statics.field3187.field1321) {
                class207.field2521 = 1;
                Statics.field15 = null;
                Statics.field630 = -1;
                Statics.field2522 = -1;
                Statics.field2523 = 0;
                Statics.field2307 = false;
                Statics.field2524 = 2;
            } else {
                class207.method2700(2, Statics.field1, "scape main", "", 255, false);
            }
            class242.method2132(false);
            Statics.field1441 = true;
            field1436 = (Statics.field2287 - 765) / 2;
            field1439 = field1436 + 202;
            Statics.field843.method4697(field1436, 0);
            Statics.field1465.method4697(field1436 + 382, 0);
            Statics.field1456.method4672(field1436 + 382 - Statics.field1456.field3782 / 2, 18);
        } else if (arg3 == 4) {
            field1451 = 4;
        }
    }

    @ObfuscatedName("fj.k(Lbv;I)V")
    public static void method2736(class59 arg0) {
        if (!field1463) {
            if ((class60.field744 == 1 || !Statics.field684 && class60.field744 == 4) && class60.field756 >= field1436 + 765 - 50 && class60.field755 >= 453) {
                Statics.field3187.field1321 = !Statics.field3187.field1321;
                class82.method1005();
                if (Statics.field3187.field1321) {
                    Statics.method1462();
                } else {
                    class241 var6 = Statics.field1;
                    int var7 = var6.method3742("scape main");
                    int var8 = var6.method3743(var7, "");
                    class207.method913(var6, var7, var8, 255, false);
                }
            }
            if (client.field1189 != 5) {
                field1438++;
                if (client.field1189 == 10 || client.field1189 == 11) {
                    if (client.field1111 == 0) {
                        if (class60.field744 == 1 || !Statics.field684 && class60.field744 == 4) {
                            int var9 = field1436 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class60.field756 >= var9 && class60.field756 <= var9 + var11 && class60.field755 >= var10 && class60.field755 <= var10 + var12) {
                                method1382();
                                return;
                            }
                        }
                        if (Statics.field1312 != null) {
                            method1382();
                        }
                    }
                    int var13 = class60.field744;
                    int var14 = class60.field756;
                    int var15 = class60.field755;
                    if (!Statics.field684 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field1451 == 0) {
                        boolean var16 = false;
                        while (class51.method24()) {
                            if (Statics.field2153 == 84) {
                                var16 = true;
                            }
                        }
                        int var17 = field1439 + 180 - 80;
                        short var18 = 291;
                        if (var13 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                            String var19 = client.method1881("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class57.method627(var19, true, "openjs", false);
                        }
                        int var20 = field1439 + 180 + 80;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20 || var16) {
                            if ((client.field929 & 0x2000000) != 0) {
                                field1452 = "";
                                field1454 = class229.field2860;
                                field1467 = class229.field2946;
                                field1455 = class229.field3081;
                                field1451 = 1;
                                field1460 = 0;
                            } else if ((client.field929 & 0x4) != 0) {
                                if ((client.field929 & 0x400) == 0) {
                                    field1454 = class229.field3070;
                                    field1467 = class229.field3038;
                                    field1455 = class229.field3072;
                                } else {
                                    field1454 = class229.field3092;
                                    field1467 = class229.field2964;
                                    field1455 = class229.field3078;
                                }
                                field1452 = class229.field3114;
                                field1451 = 1;
                                field1460 = 0;
                            } else if ((client.field929 & 0x400) == 0) {
                                field1454 = class229.field3066;
                                field1467 = class229.field3067;
                                field1455 = class229.field3068;
                                field1451 = 2;
                                field1460 = 0;
                            } else {
                                field1454 = class229.field3073;
                                field1467 = class229.field3071;
                                field1455 = class229.field3075;
                                field1452 = class229.field3114;
                                field1451 = 1;
                                field1460 = 0;
                            }
                        }
                    } else if (field1451 == 1) {
                        while (class51.method24()) {
                            if (Statics.field2153 == 84) {
                                field1454 = class229.field3066;
                                field1467 = class229.field3067;
                                field1455 = class229.field3068;
                                field1451 = 2;
                                field1460 = 0;
                            } else if (Statics.field2153 == 13) {
                                field1451 = 0;
                            }
                        }
                        int var21 = field1439 + 180 - 80;
                        short var22 = 321;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field1454 = class229.field3066;
                            field1467 = class229.field3067;
                            field1455 = class229.field3068;
                            field1451 = 2;
                            field1460 = 0;
                        }
                        int var23 = field1439 + 180 + 80;
                        if (var13 == 1 && var14 >= var23 - 75 && var14 <= var23 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field1451 = 0;
                        }
                    } else if (field1451 == 2) {
                        short var24 = 231;
                        int var47 = var24 + 30;
                        if (var13 == 1 && var15 >= var47 - 15 && var15 < var47) {
                            field1460 = 0;
                        }
                        var47 += 15;
                        if (var13 == 1 && var15 >= var47 - 15 && var15 < var47) {
                            field1460 = 1;
                        }
                        var47 += 15;
                        short var25 = 361;
                        if (var13 == 1 && var15 >= var25 - 15 && var15 < var25) {
                            method1268(class229.field3013, class229.field3039, class229.field3107);
                            field1451 = 5;
                            return;
                        }
                        int var26 = field1439 + 180 - 80;
                        short var27 = 321;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field1459 = field1459.trim();
                            if (field1459.length() == 0) {
                                method1268(class229.field2972, class229.field2913, class229.field2974);
                                return;
                            }
                            if (field1457.length() == 0) {
                                method1268(class229.field2876, class229.field2976, class229.field2977);
                                return;
                            }
                            method1268(class229.field2992, class229.field3085, class229.field3086);
                            field1458 = Statics.field3187.field1323.containsKey(class274.method583(field1459)) ? class150.field2205 : class150.field2206;
                            client.method2347(20);
                            return;
                        }
                        int var28 = field1439 + 180 + 80;
                        if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field1451 = 0;
                            field1459 = "";
                            field1457 = "";
                            Statics.field760 = 0;
                            Statics.field862 = "";
                            field1443 = true;
                        }
                        while (true) {
                            while (class51.method24()) {
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field1461.length(); var30++) {
                                    if (Statics.field3693 == field1461.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2153 == 13) {
                                    field1451 = 0;
                                    field1459 = "";
                                    field1457 = "";
                                    Statics.field760 = 0;
                                    Statics.field862 = "";
                                    field1443 = true;
                                } else if (field1460 == 0) {
                                    if (Statics.field2153 == 85 && field1459.length() > 0) {
                                        field1459 = field1459.substring(0, field1459.length() - 1);
                                    }
                                    if (Statics.field2153 == 84 || Statics.field2153 == 80) {
                                        field1460 = 1;
                                    }
                                    if (var29 && field1459.length() < 320) {
                                        field1459 = field1459 + Statics.field3693;
                                    }
                                } else if (field1460 == 1) {
                                    if (Statics.field2153 == 85 && field1457.length() > 0) {
                                        field1457 = field1457.substring(0, field1457.length() - 1);
                                    }
                                    if (Statics.field2153 == 84 || Statics.field2153 == 80) {
                                        field1460 = 0;
                                    }
                                    if (Statics.field2153 == 84) {
                                        field1459 = field1459.trim();
                                        if (field1459.length() == 0) {
                                            method1268(class229.field2972, class229.field2913, class229.field2974);
                                            return;
                                        }
                                        if (field1457.length() == 0) {
                                            method1268(class229.field2876, class229.field2976, class229.field2977);
                                            return;
                                        }
                                        method1268(class229.field2992, class229.field3085, class229.field3086);
                                        field1458 = Statics.field3187.field1323.containsKey(class274.method583(field1459)) ? class150.field2205 : class150.field2206;
                                        client.method2347(20);
                                        return;
                                    }
                                    if (var29 && field1457.length() < 20) {
                                        field1457 = field1457 + Statics.field3693;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1451 == 3) {
                        int var31 = field1439 + 180;
                        short var32 = 276;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            field1454 = class229.field3066;
                            field1467 = class229.field3067;
                            field1455 = class229.field3068;
                            field1451 = 2;
                            field1460 = 0;
                        }
                        int var33 = field1439 + 180;
                        short var34 = 326;
                        if (var13 == 1 && var14 >= var33 - 75 && var14 <= var33 + 75 && var15 >= var34 - 20 && var15 <= var34 + 20) {
                            method1268(class229.field3013, class229.field3039, class229.field3107);
                            field1451 = 5;
                            return;
                        }
                    } else if (field1451 == 4) {
                        int var35 = field1439 + 180 - 80;
                        short var36 = 321;
                        if (var13 == 1 && var14 >= var35 - 75 && var14 <= var35 + 75 && var15 >= var36 - 20 && var15 <= var36 + 20) {
                            Statics.field862.trim();
                            if (Statics.field862.length() != 6) {
                                method1268(class229.field3089, class229.field3091, class229.field2893);
                                return;
                            }
                            Statics.field760 = Integer.parseInt(Statics.field862);
                            Statics.field862 = "";
                            field1458 = field1443 ? class150.field2209 : class150.field2207;
                            method1268(class229.field2992, class229.field3085, class229.field3086);
                            client.method2347(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field1439 + 180 - 9 && var14 <= field1439 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field1443 = !field1443;
                        }
                        if (var13 == 1 && var14 >= field1439 + 180 - 34 && var14 <= field1439 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            String var37 = client.method1881("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class57.method627(var37, true, "openjs", false);
                        }
                        int var38 = field1439 + 180 + 80;
                        if (var13 == 1 && var14 >= var38 - 75 && var14 <= var38 + 75 && var15 >= var36 - 20 && var15 <= var36 + 20) {
                            field1451 = 0;
                            field1459 = "";
                            field1457 = "";
                            Statics.field760 = 0;
                            Statics.field862 = "";
                        }
                        while (class51.method24()) {
                            boolean var39 = false;
                            for (int var40 = 0; var40 < field1462.length(); var40++) {
                                if (Statics.field3693 == field1462.charAt(var40)) {
                                    var39 = true;
                                    break;
                                }
                            }
                            if (Statics.field2153 == 13) {
                                field1451 = 0;
                                field1459 = "";
                                field1457 = "";
                                Statics.field760 = 0;
                                Statics.field862 = "";
                            } else {
                                if (Statics.field2153 == 85 && Statics.field862.length() > 0) {
                                    Statics.field862 = Statics.field862.substring(0, Statics.field862.length() - 1);
                                }
                                if (Statics.field2153 == 84) {
                                    Statics.field862.trim();
                                    if (Statics.field862.length() != 6) {
                                        method1268(class229.field3089, class229.field3091, class229.field2893);
                                        return;
                                    }
                                    Statics.field760 = Integer.parseInt(Statics.field862);
                                    Statics.field862 = "";
                                    field1458 = field1443 ? class150.field2209 : class150.field2207;
                                    method1268(class229.field2992, class229.field3085, class229.field3086);
                                    client.method2347(20);
                                    return;
                                }
                                if (var39 && Statics.field862.length() < 6) {
                                    Statics.field862 = Statics.field862 + Statics.field3693;
                                }
                            }
                        }
                    } else if (field1451 == 5) {
                        int var41 = field1439 + 180 - 80;
                        short var42 = 321;
                        if (var13 == 1 && var14 >= var41 - 75 && var14 <= var41 + 75 && var15 >= var42 - 20 && var15 <= var42 + 20) {
                            method323();
                            return;
                        }
                        int var43 = field1439 + 180 + 80;
                        if (var13 == 1 && var14 >= var43 - 75 && var14 <= var43 + 75 && var15 >= var42 - 20 && var15 <= var42 + 20) {
                            field1454 = class229.field3066;
                            field1467 = class229.field3067;
                            field1455 = class229.field3068;
                            field1451 = 2;
                            field1460 = 0;
                            field1457 = "";
                        }
                        while (class51.method24()) {
                            boolean var44 = false;
                            for (int var45 = 0; var45 < field1461.length(); var45++) {
                                if (Statics.field3693 == field1461.charAt(var45)) {
                                    var44 = true;
                                    break;
                                }
                            }
                            if (Statics.field2153 == 13) {
                                field1454 = class229.field3066;
                                field1467 = class229.field3067;
                                field1455 = class229.field3068;
                                field1451 = 2;
                                field1460 = 0;
                                field1457 = "";
                            } else {
                                if (Statics.field2153 == 85 && field1459.length() > 0) {
                                    field1459 = field1459.substring(0, field1459.length() - 1);
                                }
                                if (Statics.field2153 == 84) {
                                    method323();
                                    return;
                                }
                                if (var44 && field1459.length() < 320) {
                                    field1459 = field1459 + Statics.field3693;
                                }
                            }
                        }
                    } else if (field1451 == 6) {
                        while (true) {
                            do {
                                if (!class51.method24()) {
                                    short var46 = 321;
                                    if (var13 == 1 && var15 >= var46 - 20 && var15 <= var46 + 20) {
                                        field1454 = class229.field3066;
                                        field1467 = class229.field3067;
                                        field1455 = class229.field3068;
                                        field1451 = 2;
                                        field1460 = 0;
                                        field1457 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2153 != 84 && Statics.field2153 != 13);
                            field1454 = class229.field3066;
                            field1467 = class229.field3067;
                            field1455 = class229.field3068;
                            field1451 = 2;
                            field1460 = 0;
                            field1457 = "";
                        }
                    }
                }
            }
        } else if (class60.field744 == 1 || !Statics.field684 && class60.field744 == 4) {
            int var1 = field1436 + 280;
            if (class60.field756 >= var1 && class60.field756 <= var1 + 14 && class60.field755 >= 4 && class60.field755 <= 18) {
                class81.method975(0, 0);
            } else if (class60.field756 >= var1 + 15 && class60.field756 <= var1 + 80 && class60.field755 >= 4 && class60.field755 <= 18) {
                class81.method975(0, 1);
            } else {
                int var2 = field1436 + 390;
                if (class60.field756 >= var2 && class60.field756 <= var2 + 14 && class60.field755 >= 4 && class60.field755 <= 18) {
                    class81.method975(1, 0);
                } else if (class60.field756 >= var2 + 15 && class60.field756 <= var2 + 80 && class60.field755 >= 4 && class60.field755 <= 18) {
                    class81.method975(1, 1);
                } else {
                    int var3 = field1436 + 500;
                    if (class60.field756 >= var3 && class60.field756 <= var3 + 14 && class60.field755 >= 4 && class60.field755 <= 18) {
                        class81.method975(2, 0);
                    } else if (class60.field756 >= var3 + 15 && class60.field756 <= var3 + 80 && class60.field755 >= 4 && class60.field755 <= 18) {
                        class81.method975(2, 1);
                    } else {
                        int var4 = field1436 + 610;
                        if (class60.field756 >= var4 && class60.field756 <= var4 + 14 && class60.field755 >= 4 && class60.field755 <= 18) {
                            class81.method975(3, 0);
                        } else if (class60.field756 >= var4 + 15 && class60.field756 <= var4 + 80 && class60.field755 >= 4 && class60.field755 <= 18) {
                            class81.method975(3, 1);
                        } else if (class60.field756 >= field1436 + 708 && class60.field755 >= 4 && class60.field756 <= field1436 + 708 + 50 && class60.field755 <= 20) {
                            field1463 = false;
                            Statics.field843.method4697(field1436, 0);
                            Statics.field1465.method4697(field1436 + 382, 0);
                            Statics.field1456.method4672(field1436 + 382 - Statics.field1456.field3782 / 2, 18);
                        } else if (field1450 != -1) {
                            class81 var5 = Statics.field520[field1450];
                            method247(var5);
                            field1463 = false;
                            Statics.field843.method4697(field1436, 0);
                            Statics.field1465.method4697(field1436 + 382, 0);
                            Statics.field1456.method4672(field1436 + 382 - Statics.field1456.field3782 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ag.f(I)V")
    public static void method323() {
        field1459 = field1459.trim();
        if (field1459.length() == 0) {
            method1268(class229.field3013, class229.field3039, class229.field3107);
            return;
        }
        long var0 = class88.method471();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class88.method549(var0, field1459);
        }
        switch(var2) {
            case 2:
                method1268(class229.field3108, class229.field2902, class229.field3110);
                field1451 = 6;
                break;
            case 3:
                method1268(class229.field2959, class229.field3112, class229.field3096);
                break;
            case 4:
                method1268(class229.field2986, class229.field2925, class229.field2966);
                break;
            case 5:
                method1268(class229.field3117, class229.field3118, class229.field3119);
                break;
            case 6:
                method1268(class229.field3120, class229.field3121, class229.field3043);
                break;
            case 7:
                method1268(class229.field3123, class229.field3124, class229.field2905);
        }
    }

    @ObfuscatedName("je.i(Ljt;Ljt;Ljt;ZI)V")
    public static void method4522(class267 arg0, class267 arg1, class267 arg2, boolean arg3) {
        if (arg3) {
            field1436 = (Statics.field2287 - 765) / 2;
            field1439 = field1436 + 202;
        }
        if (field1463) {
            if (Statics.field1370 == null) {
                Statics.field1370 = class290.method1389(Statics.field958, "sl_back", "");
            }
            if (Statics.field286 == null) {
                Statics.field286 = class290.method3638(Statics.field958, "sl_flags", "");
            }
            if (Statics.field820 == null) {
                Statics.field820 = class290.method3638(Statics.field958, "sl_arrows", "");
            }
            if (Statics.field1464 == null) {
                Statics.field1464 = class290.method3638(Statics.field958, "sl_stars", "");
            }
            class285.method4623(field1436, 23, 765, 480, 0);
            class285.method4587(field1436, 0, 125, 23, 12425273, 9135624);
            class285.method4587(field1436 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4410(class229.field3126, field1436 + 62, 15, 0, -1);
            if (Statics.field1464 != null) {
                Statics.field1464[1].method4672(field1436 + 140, 1);
                arg1.method4407(class229.field3127, field1436 + 152, 10, 16777215, -1);
                Statics.field1464[0].method4672(field1436 + 140, 12);
                arg1.method4407(class229.field3128, field1436 + 152, 21, 16777215, -1);
            }
            if (Statics.field820 != null) {
                int var4 = field1436 + 280;
                if (class81.field1308[0] == 0 && class81.field1304[0] == 0) {
                    Statics.field820[2].method4672(var4, 4);
                } else {
                    Statics.field820[0].method4672(var4, 4);
                }
                if (class81.field1308[0] == 0 && class81.field1304[0] == 1) {
                    Statics.field820[3].method4672(var4 + 15, 4);
                } else {
                    Statics.field820[1].method4672(var4 + 15, 4);
                }
                arg0.method4407(class229.field2920, var4 + 32, 17, 16777215, -1);
                int var5 = field1436 + 390;
                if (class81.field1308[0] == 1 && class81.field1304[0] == 0) {
                    Statics.field820[2].method4672(var5, 4);
                } else {
                    Statics.field820[0].method4672(var5, 4);
                }
                if (class81.field1308[0] == 1 && class81.field1304[0] == 1) {
                    Statics.field820[3].method4672(var5 + 15, 4);
                } else {
                    Statics.field820[1].method4672(var5 + 15, 4);
                }
                arg0.method4407(class229.field3130, var5 + 32, 17, 16777215, -1);
                int var6 = field1436 + 500;
                if (class81.field1308[0] == 2 && class81.field1304[0] == 0) {
                    Statics.field820[2].method4672(var6, 4);
                } else {
                    Statics.field820[0].method4672(var6, 4);
                }
                if (class81.field1308[0] == 2 && class81.field1304[0] == 1) {
                    Statics.field820[3].method4672(var6 + 15, 4);
                } else {
                    Statics.field820[1].method4672(var6 + 15, 4);
                }
                arg0.method4407(class229.field3131, var6 + 32, 17, 16777215, -1);
                int var7 = field1436 + 610;
                if (class81.field1308[0] == 3 && class81.field1304[0] == 0) {
                    Statics.field820[2].method4672(var7, 4);
                } else {
                    Statics.field820[0].method4672(var7, 4);
                }
                if (class81.field1308[0] == 3 && class81.field1304[0] == 1) {
                    Statics.field820[3].method4672(var7 + 15, 4);
                } else {
                    Statics.field820[1].method4672(var7 + 15, 4);
                }
                arg0.method4407(class229.field2910, var7 + 32, 17, 16777215, -1);
            }
            class285.method4623(field1436 + 708, 4, 50, 16, 0);
            arg1.method4410(class229.field3026, field1436 + 708 + 25, 16, 16777215, -1);
            field1450 = -1;
            if (Statics.field1370 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class81.field1305) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1305) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class81.field1305) {
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
                int var19 = field1436 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class81.field1305; var22++) {
                    class81 var23 = Statics.field520[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1310);
                    if (var23.field1310 == -1) {
                        var25 = class229.field3133;
                        var24 = false;
                    } else if (var23.field1310 > 1980) {
                        var25 = class229.field3134;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1414()) {
                        if (var23.method1442()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1413()) {
                        var26 = 16711680;
                        if (var23.method1442()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1411()) {
                        if (var23.method1442()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1442()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field750 >= var19 && class60.field758 * 939681921 >= var18 && class60.field750 < var8 + var19 && class60.field758 * 939681921 < var9 + var18 && var24) {
                        field1450 = var22;
                        Statics.field1370[var27].method4703(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1370[var27].method4697(var19, var18);
                    }
                    if (Statics.field286 != null) {
                        Statics.field286[(var23.method1442() ? 8 : 0) + var23.field1315].method4672(var19 + 29, var18);
                    }
                    arg0.method4410(Integer.toString(var23.field1314), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4410(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4402(Statics.field520[field1450].field1317) + 6;
                    int var29 = arg1.field3657 + 8;
                    class285.method4623(class60.field750 - var28 / 2, class60.field758 * 939681921 + 20 + 5, var28, var29, 16777120);
                    class285.method4615(class60.field750 - var28 / 2, class60.field758 * 939681921 + 20 + 5, var28, var29, 0);
                    arg1.method4410(Statics.field520[field1450].field1317, class60.field750, class60.field758 * 939681921 + 20 + 5 + arg1.field3657 + 4, 0, -1);
                }
            }
            Statics.field3327.method720(0, 0);
            return;
        }
        if (arg3) {
            Statics.field843.method4697(field1436, 0);
            Statics.field1465.method4697(field1436 + 382, 0);
            Statics.field1456.method4672(field1436 + 382 - Statics.field1456.field3782 / 2, 18);
        }
        if (client.field1189 == 0 || client.field1189 == 5) {
            byte var30 = 20;
            arg0.method4410(class229.field3065, field1439 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class285.method4615(field1439 + 180 - 152, var31, 304, 34, 9179409);
            class285.method4615(field1439 + 180 - 151, var31 + 1, 302, 32, 0);
            class285.method4623(field1439 + 180 - 150, var31 + 2, field1449 * 3, 30, 9179409);
            class285.method4623(field1449 * 3 + (field1439 + 180 - 150), var31 + 2, 300 - field1449 * 3, 30, 0);
            arg0.method4410(field1453, field1439 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field1189 == 20) {
            Statics.field621.method4672(field1439 + 180 - Statics.field621.field3782 / 2, 271 - Statics.field621.field3780 / 2);
            short var32 = 211;
            arg0.method4410(field1454, field1439 + 180, var32, 16776960, 0);
            int var118 = var32 + 15;
            arg0.method4410(field1467, field1439 + 180, var118, 16776960, 0);
            int var119 = var118 + 15;
            arg0.method4410(field1455, field1439 + 180, var119, 16776960, 0);
            int var120 = var119 + 15;
            int var121 = var120 + 10;
            if (field1451 != 4) {
                arg0.method4407(class229.field2862, field1439 + 180 - 110, var121, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = field1459; arg0.method4402(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method4407(class268.method4480(var34), field1439 + 180 - 70, var121, 16777215, 0);
                var118 = var121 + 15;
                arg0.method4407(class229.field3088 + class274.method2923(field1457), field1439 + 180 - 108, var118, 16777215, 0);
                var118 += 15;
            }
        }
        if (client.field1189 == 10 || client.field1189 == 11) {
            Statics.field621.method4672(field1439, 171);
            if (field1451 == 0) {
                short var35 = 251;
                arg0.method4410(class229.field2960, field1439 + 180, var35, 16776960, 0);
                int var122 = var35 + 30;
                int var36 = field1439 + 180 - 80;
                short var37 = 291;
                Statics.field1444.method4672(var36 - 73, var37 - 20);
                arg0.method4413(class229.field3030, var36 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var38 = field1439 + 180 + 80;
                Statics.field1444.method4672(var38 - 73, var37 - 20);
                arg0.method4413(class229.field3009, var38 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1451 == 1) {
                arg0.method4410(field1452, field1439 + 180, 211, 16776960, 0);
                short var39 = 236;
                arg0.method4410(field1454, field1439 + 180, var39, 16777215, 0);
                int var123 = var39 + 15;
                arg0.method4410(field1467, field1439 + 180, var123, 16777215, 0);
                int var124 = var123 + 15;
                arg0.method4410(field1455, field1439 + 180, var124, 16777215, 0);
                int var125 = var124 + 15;
                int var40 = field1439 + 180 - 80;
                short var41 = 321;
                Statics.field1444.method4672(var40 - 73, var41 - 20);
                arg0.method4410(class229.field2973, var40, var41 + 5, 16777215, 0);
                int var42 = field1439 + 180 + 80;
                Statics.field1444.method4672(var42 - 73, var41 - 20);
                arg0.method4410(class229.field3026, var42, var41 + 5, 16777215, 0);
            } else if (field1451 == 2) {
                short var43 = 211;
                arg0.method4410(field1454, field1439 + 180, var43, 16776960, 0);
                int var126 = var43 + 15;
                arg0.method4410(field1467, field1439 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg0.method4410(field1455, field1439 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                int var129 = var128 + 10;
                arg0.method4407(class229.field2862, field1439 + 180 - 110, var129, 16777215, 0);
                short var44 = 200;
                String var45;
                for (var45 = field1459; arg0.method4402(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method4407(class268.method4480(var45) + (field1460 == 0 & client.field936 % 40 < 20 ? class89.method2636(16776960) + class89.field1399 : ""), field1439 + 180 - 70, var129, 16777215, 0);
                var126 = var129 + 15;
                String var47 = class229.field3088;
                String var48 = field1457;
                int var49 = var48.length();
                char[] var50 = new char[var49];
                for (int var51 = 0; var51 < var49; var51++) {
                    var50[var51] = '*';
                }
                String var52 = new String(var50);
                arg0.method4407(var47 + var52 + (field1460 == 1 & client.field936 % 40 < 20 ? class89.method2636(16776960) + class89.field1399 : ""), field1439 + 180 - 108, var126, 16777215, 0);
                var126 += 15;
                int var54 = field1439 + 180 - 80;
                short var55 = 321;
                Statics.field1444.method4672(var54 - 73, var55 - 20);
                arg0.method4410(class229.field3040, var54, var55 + 5, 16777215, 0);
                int var56 = field1439 + 180 + 80;
                Statics.field1444.method4672(var56 - 73, var55 - 20);
                arg0.method4410(class229.field3026, var56, var55 + 5, 16777215, 0);
                short var57 = 357;
                arg1.method4410(class229.field3100, field1439 + 180, var57, 16776960, 0);
            } else if (field1451 == 3) {
                short var58 = 201;
                arg0.method4410(class229.field3095, field1439 + 180, var58, 16776960, 0);
                int var130 = var58 + 20;
                arg1.method4410(class229.field2906, field1439 + 180, var130, 16776960, 0);
                int var131 = var130 + 15;
                arg1.method4410(class229.field3097, field1439 + 180, var131, 16776960, 0);
                int var132 = var131 + 15;
                int var59 = field1439 + 180;
                short var60 = 276;
                Statics.field1444.method4672(var59 - 73, var60 - 20);
                arg2.method4410(class229.field3098, var59, var60 + 5, 16777215, 0);
                int var61 = field1439 + 180;
                short var62 = 326;
                Statics.field1444.method4672(var61 - 73, var62 - 20);
                arg2.method4410(class229.field3099, var61, var62 + 5, 16777215, 0);
            } else if (field1451 == 4) {
                arg0.method4410(class229.field3082, field1439 + 180, 211, 16776960, 0);
                short var63 = 236;
                arg0.method4410(field1454, field1439 + 180, var63, 16777215, 0);
                int var133 = var63 + 15;
                arg0.method4410(field1467, field1439 + 180, var133, 16777215, 0);
                int var134 = var133 + 15;
                arg0.method4410(field1455, field1439 + 180, var134, 16777215, 0);
                int var135 = var134 + 15;
                String var65 = class229.field3033;
                String var66 = Statics.field862;
                int var67 = var66.length();
                char[] var68 = new char[var67];
                for (int var69 = 0; var69 < var67; var69++) {
                    var68[var69] = '*';
                }
                String var70 = new String(var68);
                arg0.method4407(var65 + var70 + (client.field936 % 40 < 20 ? class89.method2636(16776960) + class89.field1399 : ""), field1439 + 180 - 108, var135, 16777215, 0);
                var133 = var135 - 8;
                arg0.method4407(class229.field2863, field1439 + 180 - 9, var133, 16776960, 0);
                var133 += 15;
                arg0.method4407(class229.field2864, field1439 + 180 - 9, var133, 16776960, 0);
                int var72 = field1439 + 180 - 9 + arg0.method4402(class229.field2864) + 15;
                int var73 = var133 - arg0.field3657;
                class288 var74;
                if (field1443) {
                    var74 = Statics.field299;
                } else {
                    var74 = Statics.field263;
                }
                var74.method4672(var72, var73);
                var133 += 15;
                int var75 = field1439 + 180 - 80;
                short var76 = 321;
                Statics.field1444.method4672(var75 - 73, var76 - 20);
                arg0.method4410(class229.field2973, var75, var76 + 5, 16777215, 0);
                int var77 = field1439 + 180 + 80;
                Statics.field1444.method4672(var77 - 73, var76 - 20);
                arg0.method4410(class229.field3026, var77, var76 + 5, 16777215, 0);
                arg1.method4410(class229.field3125, field1439 + 180, var76 + 36, 255, 0);
            } else if (field1451 == 5) {
                arg0.method4410(class229.field3101, field1439 + 180, 201, 16776960, 0);
                short var78 = 221;
                arg2.method4410(field1454, field1439 + 180, var78, 16776960, 0);
                int var136 = var78 + 15;
                arg2.method4410(field1467, field1439 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                arg2.method4410(field1455, field1439 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                int var139 = var138 + 14;
                arg0.method4407(class229.field3102, field1439 + 180 - 145, var139, 16777215, 0);
                short var79 = 174;
                String var80;
                for (var80 = field1459; arg0.method4402(var80) > var79; var80 = var80.substring(1)) {
                }
                arg0.method4407(class268.method4480(var80) + (client.field936 % 40 < 20 ? class89.method2636(16776960) + class89.field1399 : ""), field1439 + 180 - 34, var139, 16777215, 0);
                var136 = var139 + 15;
                int var81 = field1439 + 180 - 80;
                short var82 = 321;
                Statics.field1444.method4672(var81 - 73, var82 - 20);
                arg0.method4410(class229.field3103, var81, var82 + 5, 16777215, 0);
                int var83 = field1439 + 180 + 80;
                Statics.field1444.method4672(var83 - 73, var82 - 20);
                arg0.method4410(class229.field2975, var83, var82 + 5, 16777215, 0);
            } else if (field1451 == 6) {
                short var84 = 211;
                arg0.method4410(field1454, field1439 + 180, var84, 16776960, 0);
                int var140 = var84 + 15;
                arg0.method4410(field1467, field1439 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg0.method4410(field1455, field1439 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var85 = field1439 + 180;
                short var86 = 321;
                Statics.field1444.method4672(var85 - 73, var86 - 20);
                arg0.method4410(class229.field2975, var85, var86 + 5, 16777215, 0);
            }
        }
        if (field1438 > 0) {
            method240(field1438);
            field1438 = 0;
        }
        short var87 = 256;
        if (field1435 > 0) {
            for (int var88 = 0; var88 < 256; var88++) {
                if (field1435 > 768) {
                    Statics.field1796[var88] = method3697(Statics.field588[var88], Statics.field1566[var88], 1024 - field1435);
                } else if (field1435 > 256) {
                    Statics.field1796[var88] = Statics.field1566[var88];
                } else {
                    Statics.field1796[var88] = method3697(Statics.field1566[var88], Statics.field588[var88], 256 - field1435);
                }
            }
        } else if (field1445 > 0) {
            for (int var89 = 0; var89 < 256; var89++) {
                if (field1445 > 768) {
                    Statics.field1796[var89] = method3697(Statics.field588[var89], Statics.field3386[var89], 1024 - field1445);
                } else if (field1445 > 256) {
                    Statics.field1796[var89] = Statics.field3386[var89];
                } else {
                    Statics.field1796[var89] = method3697(Statics.field3386[var89], Statics.field588[var89], 256 - field1445);
                }
            }
        } else {
            for (int var90 = 0; var90 < 256; var90++) {
                Statics.field1796[var90] = Statics.field588[var90];
            }
        }
        class285.method4574(field1436, 9, field1436 + 128, var87 + 7);
        Statics.field843.method4697(field1436, 0);
        class285.method4573();
        int var91 = 0;
        int var92 = field1436 + Statics.field3327.field3767 * 9;
        for (int var93 = 1; var93 < var87 - 1; var93++) {
            int var94 = (var87 - var93) * field1442[var93] / var87;
            int var95 = var94 + 22;
            if (var95 < 0) {
                var95 = 0;
            }
            var91 += var95;
            for (int var96 = var95; var96 < 128; var96++) {
                int var97 = Statics.field2337[var91++];
                if (var97 == 0) {
                    var92++;
                } else {
                    int var99 = 256 - var97;
                    int var100 = Statics.field1796[var97];
                    int var101 = Statics.field3327.field3769[var92];
                    Statics.field3327.field3769[var92++] = ((var100 & 0xFF00FF) * var97 + (var101 & 0xFF00FF) * var99 & 0xFF00FF00) + ((var100 & 0xFF00) * var97 + (var101 & 0xFF00) * var99 & 0xFF0000) >> 8;
                }
            }
            var92 += Statics.field3327.field3767 + var95 - 128;
        }
        class285.method4574(field1436 + 765 - 128, 9, field1436 + 765, var87 + 7);
        Statics.field1465.method4697(field1436 + 382, 0);
        class285.method4573();
        int var102 = 0;
        int var103 = field1436 + Statics.field3327.field3767 * 9 + 24 + 637;
        for (int var104 = 1; var104 < var87 - 1; var104++) {
            int var105 = (var87 - var104) * field1442[var104] / var87;
            int var106 = 103 - var105;
            int var107 = var103 + var105;
            for (int var108 = 0; var108 < var106; var108++) {
                int var109 = Statics.field2337[var102++];
                if (var109 == 0) {
                    var107++;
                } else {
                    int var111 = 256 - var109;
                    int var112 = Statics.field1796[var109];
                    int var113 = Statics.field3327.field3769[var107];
                    Statics.field3327.field3769[var107++] = ((var112 & 0xFF00) * var109 + (var113 & 0xFF00) * var111 & 0xFF0000) + ((var112 & 0xFF00FF) * var109 + (var113 & 0xFF00FF) * var111 & 0xFF00FF00) >> 8;
                }
            }
            var102 += 128 - var106;
            var103 = Statics.field3327.field3767 - var106 - var105 + var107;
        }
        Statics.field873[Statics.field3187.field1321 ? 1 : 0].method4672(field1436 + 765 - 40, 463);
        if (client.field1189 <= 5 || client.field1111 != 0) {
            return;
        }
        if (Statics.field836 == null) {
            Statics.field836 = class290.method3891(Statics.field958, "sl_button", "");
            return;
        }
        int var114 = field1436 + 5;
        short var115 = 463;
        byte var116 = 100;
        byte var117 = 35;
        Statics.field836.method4672(var114, var115);
        arg0.method4410(class229.field3020 + " " + client.field1106, var116 / 2 + var114, var117 / 2 + var115 - 2, 16777215, 0);
        if (Statics.field1312 == null) {
            arg1.method4410(class229.field3136, var116 / 2 + var114, var117 / 2 + var115 + 12, 16777215, 0);
        } else {
            arg1.method4410(class229.field3135, var116 / 2 + var114, var117 / 2 + var115 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("client.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1268(String arg0, String arg1, String arg2) {
        field1454 = arg0;
        field1467 = arg1;
        field1455 = arg2;
    }

    @ObfuscatedName("ai.m(Lki;I)V")
    public static final void method237(class288 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field610.length; var2++) {
            Statics.field610[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field610[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field34[var8] = (Statics.field610[var8 - 1] + Statics.field610[var8 + 1] + Statics.field610[var8 - 128] + Statics.field610[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field610;
            Statics.field610 = Statics.field34;
            Statics.field34 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3780; var11++) {
            for (int var12 = 0; var12 < arg0.field3782; var12++) {
                if (arg0.field3783[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3784;
                    int var14 = var11 + 16 + arg0.field3785;
                    int var15 = (var14 << 7) + var13;
                    Statics.field610[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ai.u(II)V")
    public static final void method240(int arg0) {
        short var1 = 256;
        field1447 += arg0 * 128;
        if (field1447 > Statics.field610.length) {
            field1447 -= Statics.field610.length;
            int var2 = (int) (Math.random() * 12.0D);
            method237(Statics.field3211[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field2337[var3 + var4] - Statics.field610[field1447 + var3 & Statics.field610.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field2337[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field2337[var9 + var10] = 255;
                } else {
                    Statics.field2337[var9 + var10] = 0;
                }
            }
        }
        if (field1435 > 0) {
            field1435 -= arg0 * 4;
        }
        if (field1445 > 0) {
            field1445 -= arg0 * 4;
        }
        if (field1435 == 0 && field1445 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1435 = 1024;
            }
            if (var12 == 1) {
                field1445 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1442[var13] = field1442[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1442[var14] = (int) (Math.sin((double) field1448 / 14.0D) * 16.0D + Math.sin((double) field1448 / 15.0D) * 14.0D + Math.sin((double) field1448 / 16.0D) * 12.0D);
            field1448++;
        }
        field1446 += arg0 * 790486285;
        int var15 = ((client.field936 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1446 * -8744716; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field2337[(var18 << 7) + var17] = 192;
        }
        field1446 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field2337[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field2337[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2443[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2443[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2443[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field2337[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("hy.h(IIII)I")
    public static final int method3697(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ar.a(Lcg;I)V")
    public static void method247(class81 arg0) {
        if (arg0.method1442() != client.field1175) {
            client.field1175 = arg0.method1442();
            class260.method1608(arg0.method1442());
        }
        Statics.field411 = arg0.field1313;
        client.field1106 = arg0.field1314;
        client.field929 = arg0.field1303;
        Statics.field484 = client.field930 == 0 ? 43594 : arg0.field1314 + 40000;
        Statics.field2854 = client.field930 == 0 ? 443 : arg0.field1314 + 50000;
        Statics.field761 = Statics.field484;
    }

    @ObfuscatedName("bh.p(I)V")
    public static void method1382() {
        if (class81.method104()) {
            field1463 = true;
        }
    }
}

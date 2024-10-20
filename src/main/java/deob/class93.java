package deob;

@ObfuscatedName("cb")
public class class93 {

    @ObfuscatedName("cb.q")
    public static int field1417 = 0;

    @ObfuscatedName("cb.b")
    public static int field1402 = field1417 + 202;

    @ObfuscatedName("cb.k")
    public static int[] field1428 = new int[256];

    @ObfuscatedName("cb.a")
    public static int field1404 = 0;

    @ObfuscatedName("cb.h")
    public static int field1403 = 0;

    @ObfuscatedName("cb.ax")
    public static int field1406 = 0;

    @ObfuscatedName("cb.at")
    public static int field1407 = 0;

    @ObfuscatedName("cb.ag")
    public static int field1414 = 0;

    @ObfuscatedName("cb.ar")
    public static int field1409 = 0;

    @ObfuscatedName("cb.ae")
    public static int field1410 = 10;

    @ObfuscatedName("cb.ai")
    public static String field1427 = "";

    @ObfuscatedName("cb.au")
    public static int field1424 = 0;

    @ObfuscatedName("cb.ad")
    public static String field1413 = "";

    @ObfuscatedName("cb.ah")
    public static String field1395 = "";

    @ObfuscatedName("cb.ao")
    public static String field1416 = "";

    @ObfuscatedName("cb.av")
    public static String field1411 = "";

    @ObfuscatedName("cb.az")
    public static String field1396 = "";

    @ObfuscatedName("cb.aq")
    public static String field1418 = "";

    @ObfuscatedName("cb.ay")
    public static class150 field1419 = class150.field2175;

    @ObfuscatedName("cb.aa")
    public static boolean field1420 = true;

    @ObfuscatedName("cb.ak")
    public static int field1426 = 0;

    @ObfuscatedName("cb.as")
    public static String field1422 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cb.ap")
    public static String field1415 = "1234567890";

    @ObfuscatedName("cb.al")
    public static boolean field1408 = false;

    @ObfuscatedName("cb.bq")
    public static int field1405 = -1;

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.d(I)I")
    public static int method50() {
        return 9;
    }

    @ObfuscatedName("aq.q(Lim;Lim;ZII)V")
    public static void method490(class236 arg0, class236 arg1, boolean arg2, int arg3) {
        if (!Statics.field1421) {
            field1424 = arg3;
            class282.method4547();
            byte[] var4 = arg0.method3769("title.jpg", "");
            Statics.field1412 = Statics.method988(var4);
            Statics.field1400 = Statics.field1412.method4660();
            if ((client.field961 & 0x20000000) == 0) {
                Statics.field256 = class287.method2817(arg1, "logo", "");
            } else {
                Statics.field256 = class287.method2817(arg1, "logo_deadman_mode", "");
            }
            Statics.field1397 = class287.method2817(arg1, "titlebox", "");
            Statics.field1398 = class287.method2817(arg1, "titlebutton", "");
            Statics.field2294 = class287.method3595(arg1, "runes", "");
            Statics.field484 = class287.method3595(arg1, "title_mute", "");
            Statics.field1379 = class287.method2817(arg1, "options_radio_buttons,0", "");
            Statics.field2179 = class287.method2817(arg1, "options_radio_buttons,2", "");
            Statics.field2405 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field2405[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field2405[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field2405[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field2405[var8 + 192] = 16777215;
            }
            Statics.field434 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field434[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field434[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field434[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field434[var12 + 192] = 16777215;
            }
            Statics.field567 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field567[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field567[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field567[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field567[var16 + 192] = 16777215;
            }
            Statics.field720 = new int[256];
            Statics.field2374 = new int[32768];
            Statics.field3658 = new int[32768];
            method223((class285) null);
            Statics.field890 = new int[32768];
            Statics.field325 = new int[32768];
            if (arg2) {
                field1396 = "";
                field1418 = "";
            }
            Statics.field535 = 0;
            Statics.field298 = "";
            field1420 = true;
            field1408 = false;
            if (Statics.field2320.field1277) {
                class204.method199(2);
            } else {
                class204.method3727(2, Statics.field18, "scape main", "", 255, false);
            }
            class239.method2254(false);
            Statics.field1421 = true;
            field1417 = (Statics.field419 - 765) / 2;
            field1402 = field1417 + 202;
            Statics.field1412.method4669(field1417, 0);
            Statics.field1400.method4669(field1417 + 382, 0);
            Statics.field256.method4636(field1417 + 382 - Statics.field256.field3760 / 2, 18);
        } else if (arg3 == 4) {
            field1424 = 4;
        }
    }

    @ObfuscatedName("bx.x(I)V")
    public static void method932() {
        if (!Statics.field1421) {
            return;
        }
        Statics.field1397 = null;
        Statics.field1398 = null;
        Statics.field2294 = null;
        Statics.field1412 = null;
        Statics.field1400 = null;
        Statics.field256 = null;
        Statics.field484 = null;
        Statics.field1379 = null;
        Statics.field2179 = null;
        Statics.field1425 = null;
        Statics.field401 = null;
        Statics.field518 = null;
        Statics.field1360 = null;
        Statics.field789 = null;
        Statics.field2405 = null;
        Statics.field434 = null;
        Statics.field567 = null;
        Statics.field720 = null;
        Statics.field2374 = null;
        Statics.field3658 = null;
        Statics.field890 = null;
        Statics.field325 = null;
        class204.method199(2);
        class239.method2254(true);
        Statics.field1421 = false;
    }

    @ObfuscatedName("av.y(Lbh;I)V")
    public static void method479(class59 arg0) {
        if (!field1408) {
            if ((class60.field698 == 1 || !Statics.field793 && class60.field698 == 4) && class60.field710 >= field1417 + 765 - 50 && class60.field714 >= 453) {
                Statics.field2320.field1277 = !Statics.field2320.field1277;
                class82.method1605();
                if (Statics.field2320.field1277) {
                    class204.method624();
                } else {
                    class204.method197(Statics.field18, "scape main", "", 255, false);
                }
            }
            if (client.field900 != 5) {
                field1414++;
                if (client.field900 == 10 || client.field900 == 11) {
                    if (client.field899 == 0) {
                        if (class60.field698 == 1 || !Statics.field793 && class60.field698 == 4) {
                            int var6 = field1417 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class60.field710 >= var6 && class60.field710 <= var6 + var8 && class60.field714 >= var7 && class60.field714 <= var7 + var9) {
                                if (class81.method1559()) {
                                    field1408 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field1268 != null && class81.method1559()) {
                            field1408 = true;
                        }
                    }
                    int var10 = class60.field698;
                    int var11 = class60.field710;
                    int var12 = class60.field714;
                    if (!Statics.field793 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field1424 == 0) {
                        boolean var13 = false;
                        while (class51.method64()) {
                            if (Statics.field2349 == 84) {
                                var13 = true;
                            }
                        }
                        int var14 = field1402 + 180 - 80;
                        short var15 = 291;
                        if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                            class57.method1708(client.method1016("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var16 = field1402 + 180 + 80;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                            if ((client.field961 & 0x2000000) != 0) {
                                field1413 = "";
                                field1395 = class226.field3058;
                                field1416 = class226.field3105;
                                field1411 = class226.field2946;
                                field1424 = 1;
                                field1426 = 0;
                            } else if ((client.field961 & 0x4) != 0) {
                                if ((client.field961 & 0x400) == 0) {
                                    field1395 = class226.field3049;
                                    field1416 = class226.field3050;
                                    field1411 = class226.field3051;
                                } else {
                                    field1395 = class226.field3055;
                                    field1416 = class226.field3019;
                                    field1411 = class226.field3057;
                                }
                                field1413 = class226.field3048;
                                field1424 = 1;
                                field1426 = 0;
                            } else if ((client.field961 & 0x400) == 0) {
                                field1395 = class226.field3045;
                                field1416 = class226.field3046;
                                field1411 = class226.field3047;
                                field1424 = 2;
                                field1426 = 0;
                            } else {
                                field1395 = class226.field3056;
                                field1416 = class226.field3080;
                                field1411 = class226.field3054;
                                field1413 = class226.field3048;
                                field1424 = 1;
                                field1426 = 0;
                            }
                        }
                    } else if (field1424 == 1) {
                        while (class51.method64()) {
                            if (Statics.field2349 == 84) {
                                field1395 = class226.field3045;
                                field1416 = class226.field3046;
                                field1411 = class226.field3047;
                                field1424 = 2;
                                field1426 = 0;
                            } else if (Statics.field2349 == 13) {
                                field1424 = 0;
                            }
                        }
                        int var17 = field1402 + 180 - 80;
                        short var18 = 321;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field1395 = class226.field3045;
                            field1416 = class226.field3046;
                            field1411 = class226.field3047;
                            field1424 = 2;
                            field1426 = 0;
                        }
                        int var19 = field1402 + 180 + 80;
                        if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field1424 = 0;
                        }
                    } else if (field1424 == 2) {
                        short var20 = 231;
                        int var42 = var20 + 30;
                        if (var10 == 1 && var12 >= var42 - 15 && var12 < var42) {
                            field1426 = 0;
                        }
                        var42 += 15;
                        if (var10 == 1 && var12 >= var42 - 15 && var12 < var42) {
                            field1426 = 1;
                        }
                        var42 += 15;
                        short var21 = 361;
                        if (var10 == 1 && var12 >= var21 - 15 && var12 < var21) {
                            method1385(class226.field3039, class226.field3085, class226.field2864);
                            field1424 = 5;
                            return;
                        }
                        int var22 = field1402 + 180 - 80;
                        short var23 = 321;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field1396 = field1396.trim();
                            if (field1396.length() == 0) {
                                method1385(class226.field2951, class226.field2952, class226.field2953);
                                return;
                            }
                            if (field1418.length() == 0) {
                                method1385(class226.field2931, class226.field3090, class226.field2907);
                                return;
                            }
                            method1385(class226.field3063, class226.field2882, class226.field3065);
                            field1419 = Statics.field2320.field1281.containsKey(class271.method1715(field1396)) ? class150.field2178 : class150.field2175;
                            client.method6(20);
                            return;
                        }
                        int var24 = field1402 + 180 + 80;
                        if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field1424 = 0;
                            field1396 = "";
                            field1418 = "";
                            Statics.field535 = 0;
                            Statics.field298 = "";
                            field1420 = true;
                        }
                        while (true) {
                            while (class51.method64()) {
                                boolean var25 = false;
                                for (int var26 = 0; var26 < field1422.length(); var26++) {
                                    if (Statics.field9 == field1422.charAt(var26)) {
                                        var25 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2349 == 13) {
                                    field1424 = 0;
                                    field1396 = "";
                                    field1418 = "";
                                    Statics.field535 = 0;
                                    Statics.field298 = "";
                                    field1420 = true;
                                } else if (field1426 == 0) {
                                    if (Statics.field2349 == 85 && field1396.length() > 0) {
                                        field1396 = field1396.substring(0, field1396.length() - 1);
                                    }
                                    if (Statics.field2349 == 84 || Statics.field2349 == 80) {
                                        field1426 = 1;
                                    }
                                    if (var25 && field1396.length() < 320) {
                                        field1396 = field1396 + Statics.field9;
                                    }
                                } else if (field1426 == 1) {
                                    if (Statics.field2349 == 85 && field1418.length() > 0) {
                                        field1418 = field1418.substring(0, field1418.length() - 1);
                                    }
                                    if (Statics.field2349 == 84 || Statics.field2349 == 80) {
                                        field1426 = 0;
                                    }
                                    if (Statics.field2349 == 84) {
                                        field1396 = field1396.trim();
                                        if (field1396.length() == 0) {
                                            method1385(class226.field2951, class226.field2952, class226.field2953);
                                            return;
                                        }
                                        if (field1418.length() == 0) {
                                            method1385(class226.field2931, class226.field3090, class226.field2907);
                                            return;
                                        }
                                        method1385(class226.field3063, class226.field2882, class226.field3065);
                                        field1419 = Statics.field2320.field1281.containsKey(class271.method1715(field1396)) ? class150.field2178 : class150.field2175;
                                        client.method6(20);
                                        return;
                                    }
                                    if (var25 && field1418.length() < 20) {
                                        field1418 = field1418 + Statics.field9;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1424 == 3) {
                        int var27 = field1402 + 180;
                        short var28 = 276;
                        if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var28 - 20 && var12 <= var28 + 20) {
                            field1395 = class226.field3045;
                            field1416 = class226.field3046;
                            field1411 = class226.field3047;
                            field1424 = 2;
                            field1426 = 0;
                        }
                        int var29 = field1402 + 180;
                        short var30 = 326;
                        if (var10 == 1 && var11 >= var29 - 75 && var11 <= var29 + 75 && var12 >= var30 - 20 && var12 <= var30 + 20) {
                            method1385(class226.field3039, class226.field3085, class226.field2864);
                            field1424 = 5;
                            return;
                        }
                    } else if (field1424 == 4) {
                        int var31 = field1402 + 180 - 80;
                        short var32 = 321;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            Statics.field298.trim();
                            if (Statics.field298.length() != 6) {
                                method1385(class226.field2870, class226.field3034, class226.field2872);
                                return;
                            }
                            Statics.field535 = Integer.parseInt(Statics.field298);
                            Statics.field298 = "";
                            field1419 = field1420 ? class150.field2177 : class150.field2176;
                            method1385(class226.field3063, class226.field2882, class226.field3065);
                            client.method6(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field1402 + 180 - 9 && var11 <= field1402 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field1420 = !field1420;
                        }
                        if (var10 == 1 && var11 >= field1402 + 180 - 34 && var11 <= field1402 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class57.method1708(client.method1016("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var33 = field1402 + 180 + 80;
                        if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            field1424 = 0;
                            field1396 = "";
                            field1418 = "";
                            Statics.field535 = 0;
                            Statics.field298 = "";
                        }
                        while (class51.method64()) {
                            boolean var34 = false;
                            for (int var35 = 0; var35 < field1415.length(); var35++) {
                                if (Statics.field9 == field1415.charAt(var35)) {
                                    var34 = true;
                                    break;
                                }
                            }
                            if (Statics.field2349 == 13) {
                                field1424 = 0;
                                field1396 = "";
                                field1418 = "";
                                Statics.field535 = 0;
                                Statics.field298 = "";
                            } else {
                                if (Statics.field2349 == 85 && Statics.field298.length() > 0) {
                                    Statics.field298 = Statics.field298.substring(0, Statics.field298.length() - 1);
                                }
                                if (Statics.field2349 == 84) {
                                    Statics.field298.trim();
                                    if (Statics.field298.length() != 6) {
                                        method1385(class226.field2870, class226.field3034, class226.field2872);
                                        return;
                                    }
                                    Statics.field535 = Integer.parseInt(Statics.field298);
                                    Statics.field298 = "";
                                    field1419 = field1420 ? class150.field2177 : class150.field2176;
                                    method1385(class226.field3063, class226.field2882, class226.field3065);
                                    client.method6(20);
                                    return;
                                }
                                if (var34 && Statics.field298.length() < 6) {
                                    Statics.field298 = Statics.field298 + Statics.field9;
                                }
                            }
                        }
                    } else if (field1424 == 5) {
                        int var36 = field1402 + 180 - 80;
                        short var37 = 321;
                        if (var10 == 1 && var11 >= var36 - 75 && var11 <= var36 + 75 && var12 >= var37 - 20 && var12 <= var37 + 20) {
                            method45();
                            return;
                        }
                        int var38 = field1402 + 180 + 80;
                        if (var10 == 1 && var11 >= var38 - 75 && var11 <= var38 + 75 && var12 >= var37 - 20 && var12 <= var37 + 20) {
                            field1395 = class226.field3045;
                            field1416 = class226.field3046;
                            field1411 = class226.field3047;
                            field1424 = 2;
                            field1426 = 0;
                            field1418 = "";
                        }
                        while (class51.method64()) {
                            boolean var39 = false;
                            for (int var40 = 0; var40 < field1422.length(); var40++) {
                                if (Statics.field9 == field1422.charAt(var40)) {
                                    var39 = true;
                                    break;
                                }
                            }
                            if (Statics.field2349 == 13) {
                                field1395 = class226.field3045;
                                field1416 = class226.field3046;
                                field1411 = class226.field3047;
                                field1424 = 2;
                                field1426 = 0;
                                field1418 = "";
                            } else {
                                if (Statics.field2349 == 85 && field1396.length() > 0) {
                                    field1396 = field1396.substring(0, field1396.length() - 1);
                                }
                                if (Statics.field2349 == 84) {
                                    method45();
                                    return;
                                }
                                if (var39 && field1396.length() < 320) {
                                    field1396 = field1396 + Statics.field9;
                                }
                            }
                        }
                    } else if (field1424 == 6) {
                        while (true) {
                            do {
                                if (!class51.method64()) {
                                    short var41 = 321;
                                    if (var10 == 1 && var12 >= var41 - 20 && var12 <= var41 + 20) {
                                        field1395 = class226.field3045;
                                        field1416 = class226.field3046;
                                        field1411 = class226.field3047;
                                        field1424 = 2;
                                        field1426 = 0;
                                        field1418 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2349 != 84 && Statics.field2349 != 13);
                            field1395 = class226.field3045;
                            field1416 = class226.field3046;
                            field1411 = class226.field3047;
                            field1424 = 2;
                            field1426 = 0;
                            field1418 = "";
                        }
                    }
                }
            }
        } else if (class60.field698 == 1 || !Statics.field793 && class60.field698 == 4) {
            int var1 = field1417 + 280;
            if (class60.field710 >= var1 && class60.field710 <= var1 + 14 && class60.field714 >= 4 && class60.field714 <= 18) {
                class81.method139(0, 0);
            } else if (class60.field710 >= var1 + 15 && class60.field710 <= var1 + 80 && class60.field714 >= 4 && class60.field714 <= 18) {
                class81.method139(0, 1);
            } else {
                int var2 = field1417 + 390;
                if (class60.field710 >= var2 && class60.field710 <= var2 + 14 && class60.field714 >= 4 && class60.field714 <= 18) {
                    class81.method139(1, 0);
                } else if (class60.field710 >= var2 + 15 && class60.field710 <= var2 + 80 && class60.field714 >= 4 && class60.field714 <= 18) {
                    class81.method139(1, 1);
                } else {
                    int var3 = field1417 + 500;
                    if (class60.field710 >= var3 && class60.field710 <= var3 + 14 && class60.field714 >= 4 && class60.field714 <= 18) {
                        class81.method139(2, 0);
                    } else if (class60.field710 >= var3 + 15 && class60.field710 <= var3 + 80 && class60.field714 >= 4 && class60.field714 <= 18) {
                        class81.method139(2, 1);
                    } else {
                        int var4 = field1417 + 610;
                        if (class60.field710 >= var4 && class60.field710 <= var4 + 14 && class60.field714 >= 4 && class60.field714 <= 18) {
                            class81.method139(3, 0);
                        } else if (class60.field710 >= var4 + 15 && class60.field710 <= var4 + 80 && class60.field714 >= 4 && class60.field714 <= 18) {
                            class81.method139(3, 1);
                        } else if (class60.field710 >= field1417 + 708 && class60.field714 >= 4 && class60.field710 <= field1417 + 708 + 50 && class60.field714 <= 20) {
                            field1408 = false;
                            Statics.field1412.method4669(field1417, 0);
                            Statics.field1400.method4669(field1417 + 382, 0);
                            Statics.field256.method4636(field1417 + 382 - Statics.field256.field3760 / 2, 18);
                        } else if (field1405 != -1) {
                            class81 var5 = Statics.field1263[field1405];
                            method196(var5);
                            field1408 = false;
                            Statics.field1412.method4669(field1417, 0);
                            Statics.field1400.method4669(field1417 + 382, 0);
                            Statics.field256.method4636(field1417 + 382 - Statics.field256.field3760 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("g.e(I)V")
    public static void method45() {
        field1396 = field1396.trim();
        if (field1396.length() == 0) {
            method1385(class226.field3039, class226.field3085, class226.field2864);
            return;
        }
        long var0 = class88.method4();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class88.method4519(var0, field1396);
        }
        switch(var2) {
            case 2:
                method1385(class226.field2854, class226.field3088, class226.field3089);
                field1424 = 6;
                break;
            case 3:
                method1385(class226.field3107, class226.field3091, class226.field3092);
                break;
            case 4:
                method1385(class226.field3093, class226.field3094, class226.field3095);
                break;
            case 5:
                method1385(class226.field2860, class226.field3097, class226.field3098);
                break;
            case 6:
                method1385(class226.field3099, class226.field3100, class226.field3061);
                break;
            case 7:
                method1385(class226.field2897, class226.field3103, class226.field3104);
        }
    }

    @ObfuscatedName("a.f(Ljt;Ljt;Ljt;ZI)V")
    public static void method148(class264 arg0, class264 arg1, class264 arg2, boolean arg3) {
        if (arg3) {
            field1417 = (Statics.field419 - 765) / 2;
            field1402 = field1417 + 202;
        }
        if (field1408) {
            method156(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1412.method4669(field1417, 0);
            Statics.field1400.method4669(field1417 + 382, 0);
            Statics.field256.method4636(field1417 + 382 - Statics.field256.field3760 / 2, 18);
        }
        if (client.field900 == 0 || client.field900 == 5) {
            byte var4 = 20;
            arg0.method4363(class226.field3077, field1402 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class282.method4545(field1402 + 180 - 152, var5, 304, 34, 9179409);
            class282.method4545(field1402 + 180 - 151, var5 + 1, 302, 32, 0);
            class282.method4551(field1402 + 180 - 150, var5 + 2, field1410 * 3, 30, 9179409);
            class282.method4551(field1410 * 3 + (field1402 + 180 - 150), var5 + 2, 300 - field1410 * 3, 30, 0);
            arg0.method4363(field1427, field1402 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field900 == 20) {
            Statics.field1397.method4636(field1402 + 180 - Statics.field1397.field3760 / 2, 271 - Statics.field1397.field3758 / 2);
            short var6 = 211;
            arg0.method4363(field1395, field1402 + 180, var6, 16776960, 0);
            int var49 = var6 + 15;
            arg0.method4363(field1416, field1402 + 180, var49, 16776960, 0);
            int var50 = var49 + 15;
            arg0.method4363(field1411, field1402 + 180, var50, 16776960, 0);
            int var51 = var50 + 15;
            int var52 = var51 + 10;
            if (field1424 != 4) {
                arg0.method4371(class226.field3066, field1402 + 180 - 110, var52, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field1396; arg0.method4434(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method4371(class265.method4360(var8), field1402 + 180 - 70, var52, 16777215, 0);
                var49 = var52 + 15;
                arg0.method4371(class226.field3035 + class271.method3612(field1418), field1402 + 180 - 108, var49, 16777215, 0);
                var49 += 15;
            }
        }
        if (client.field900 == 10 || client.field900 == 11) {
            Statics.field1397.method4636(field1402, 171);
            if (field1424 == 0) {
                short var9 = 251;
                arg0.method4363(class226.field3113, field1402 + 180, var9, 16776960, 0);
                int var53 = var9 + 30;
                int var10 = field1402 + 180 - 80;
                short var11 = 291;
                Statics.field1398.method4636(var10 - 73, var11 - 20);
                arg0.method4447(class226.field3070, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1402 + 180 + 80;
                Statics.field1398.method4636(var12 - 73, var11 - 20);
                arg0.method4447(class226.field3071, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1424 == 1) {
                arg0.method4363(field1413, field1402 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method4363(field1395, field1402 + 180, var13, 16777215, 0);
                int var54 = var13 + 15;
                arg0.method4363(field1416, field1402 + 180, var54, 16777215, 0);
                int var55 = var54 + 15;
                arg0.method4363(field1411, field1402 + 180, var55, 16777215, 0);
                int var56 = var55 + 15;
                int var14 = field1402 + 180 - 80;
                short var15 = 321;
                Statics.field1398.method4636(var14 - 73, var15 - 20);
                arg0.method4363(class226.field2928, var14, var15 + 5, 16777215, 0);
                int var16 = field1402 + 180 + 80;
                Statics.field1398.method4636(var16 - 73, var15 - 20);
                arg0.method4363(class226.field3073, var16, var15 + 5, 16777215, 0);
            } else if (field1424 == 2) {
                short var17 = 211;
                arg0.method4363(field1395, field1402 + 180, var17, 16776960, 0);
                int var57 = var17 + 15;
                arg0.method4363(field1416, field1402 + 180, var57, 16776960, 0);
                int var58 = var57 + 15;
                arg0.method4363(field1411, field1402 + 180, var58, 16776960, 0);
                int var59 = var58 + 15;
                int var60 = var59 + 10;
                arg0.method4371(class226.field3066, field1402 + 180 - 110, var60, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field1396; arg0.method4434(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method4371(class265.method4360(var19) + (field1426 == 0 & client.field902 % 40 < 20 ? class89.method1751(16776960) + class89.field1357 : ""), field1402 + 180 - 70, var60, 16777215, 0);
                var57 = var60 + 15;
                arg0.method4371(class226.field3035 + class271.method3612(field1418) + (field1426 == 1 & client.field902 % 40 < 20 ? class89.method1751(16776960) + class89.field1357 : ""), field1402 + 180 - 108, var57, 16777215, 0);
                var57 += 15;
                int var20 = field1402 + 180 - 80;
                short var21 = 321;
                Statics.field1398.method4636(var20 - 73, var21 - 20);
                arg0.method4363(class226.field2852, var20, var21 + 5, 16777215, 0);
                int var22 = field1402 + 180 + 80;
                Statics.field1398.method4636(var22 - 73, var21 - 20);
                arg0.method4363(class226.field3073, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method4363(class226.field2836, field1402 + 180, var23, 16776960, 0);
            } else if (field1424 == 3) {
                short var24 = 201;
                arg0.method4363(class226.field2878, field1402 + 180, var24, 16776960, 0);
                int var61 = var24 + 20;
                arg1.method4363(class226.field3075, field1402 + 180, var61, 16776960, 0);
                int var62 = var61 + 15;
                arg1.method4363(class226.field3076, field1402 + 180, var62, 16776960, 0);
                int var63 = var62 + 15;
                int var25 = field1402 + 180;
                short var26 = 276;
                Statics.field1398.method4636(var25 - 73, var26 - 20);
                arg2.method4363(class226.field2863, var25, var26 + 5, 16777215, 0);
                int var27 = field1402 + 180;
                short var28 = 326;
                Statics.field1398.method4636(var27 - 73, var28 - 20);
                arg2.method4363(class226.field3102, var27, var28 + 5, 16777215, 0);
            } else if (field1424 == 4) {
                arg0.method4363(class226.field2879, field1402 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method4363(field1395, field1402 + 180, var29, 16777215, 0);
                int var64 = var29 + 15;
                arg0.method4363(field1416, field1402 + 180, var64, 16777215, 0);
                int var65 = var64 + 15;
                arg0.method4363(field1411, field1402 + 180, var65, 16777215, 0);
                int var66 = var65 + 15;
                arg0.method4371(class226.field3068 + class271.method3612(Statics.field298) + (client.field902 % 40 < 20 ? class89.method1751(16776960) + class89.field1357 : ""), field1402 + 180 - 108, var66, 16777215, 0);
                int var67 = var66 - 8;
                arg0.method4371(class226.field2842, field1402 + 180 - 9, var67, 16776960, 0);
                int var68 = var67 + 15;
                arg0.method4371(class226.field3003, field1402 + 180 - 9, var68, 16776960, 0);
                int var30 = field1402 + 180 - 9 + arg0.method4434(class226.field3003) + 15;
                int var31 = var68 - arg0.field3623;
                class285 var32;
                if (field1420) {
                    var32 = Statics.field2179;
                } else {
                    var32 = Statics.field1379;
                }
                var32.method4636(var30, var31);
                var64 = var68 + 15;
                int var33 = field1402 + 180 - 80;
                short var34 = 321;
                Statics.field1398.method4636(var33 - 73, var34 - 20);
                arg0.method4363(class226.field2928, var33, var34 + 5, 16777215, 0);
                int var35 = field1402 + 180 + 80;
                Statics.field1398.method4636(var35 - 73, var34 - 20);
                arg0.method4363(class226.field3073, var35, var34 + 5, 16777215, 0);
                arg1.method4363(class226.field3062, field1402 + 180, var34 + 36, 255, 0);
            } else if (field1424 == 5) {
                arg0.method4363(class226.field2975, field1402 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method4363(field1395, field1402 + 180, var36, 16776960, 0);
                int var69 = var36 + 15;
                arg2.method4363(field1416, field1402 + 180, var69, 16776960, 0);
                int var70 = var69 + 15;
                arg2.method4363(field1411, field1402 + 180, var70, 16776960, 0);
                int var71 = var70 + 15;
                int var72 = var71 + 14;
                arg0.method4371(class226.field3081, field1402 + 180 - 145, var72, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field1396; arg0.method4434(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method4371(class265.method4360(var38) + (client.field902 % 40 < 20 ? class89.method1751(16776960) + class89.field1357 : ""), field1402 + 180 - 34, var72, 16777215, 0);
                var69 = var72 + 15;
                int var39 = field1402 + 180 - 80;
                short var40 = 321;
                Statics.field1398.method4636(var39 - 73, var40 - 20);
                arg0.method4363(class226.field3082, var39, var40 + 5, 16777215, 0);
                int var41 = field1402 + 180 + 80;
                Statics.field1398.method4636(var41 - 73, var40 - 20);
                arg0.method4363(class226.field2881, var41, var40 + 5, 16777215, 0);
            } else if (field1424 == 6) {
                short var42 = 211;
                arg0.method4363(field1395, field1402 + 180, var42, 16776960, 0);
                int var73 = var42 + 15;
                arg0.method4363(field1416, field1402 + 180, var73, 16776960, 0);
                int var74 = var73 + 15;
                arg0.method4363(field1411, field1402 + 180, var74, 16776960, 0);
                int var75 = var74 + 15;
                int var43 = field1402 + 180;
                short var44 = 321;
                Statics.field1398.method4636(var43 - 73, var44 - 20);
                arg0.method4363(class226.field2881, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field1414 > 0) {
            method2252(field1414);
            field1414 = 0;
        }
        method1565();
        Statics.field484[Statics.field2320.field1277 ? 1 : 0].method4636(field1417 + 765 - 40, 463);
        if (client.field900 <= 5 || client.field899 != 0) {
            return;
        }
        if (Statics.field789 == null) {
            Statics.field789 = class287.method2817(Statics.field1256, "sl_button", "");
            return;
        }
        int var45 = field1417 + 5;
        short var46 = 463;
        byte var47 = 100;
        byte var48 = 35;
        Statics.field789.method4636(var45, var46);
        arg0.method4363(class226.field2999 + " " + client.field893, var47 / 2 + var45, var48 / 2 + var46 - 2, 16777215, 0);
        if (Statics.field1268 == null) {
            arg1.method4363(class226.field3115, var47 / 2 + var45, var48 / 2 + var46 + 12, 16777215, 0);
        } else {
            arg1.method4363(class226.field3114, var47 / 2 + var45, var48 / 2 + var46 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("be.v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1385(String arg0, String arg1, String arg2) {
        field1395 = arg0;
        field1416 = arg1;
        field1411 = arg2;
    }

    @ObfuscatedName("ax.t(Ljw;I)V")
    public static final void method223(class285 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field2374.length; var2++) {
            Statics.field2374[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field2374[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field3658[var8] = (Statics.field2374[var8 - 1] + Statics.field2374[var8 + 1] + Statics.field2374[var8 - 128] + Statics.field2374[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field2374;
            Statics.field2374 = Statics.field3658;
            Statics.field3658 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3758; var11++) {
            for (int var12 = 0; var12 < arg0.field3760; var12++) {
                if (arg0.field3761[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3762;
                    int var14 = var11 + 16 + arg0.field3763;
                    int var15 = (var14 << 7) + var13;
                    Statics.field2374[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ds.i(II)V")
    public static final void method2252(int arg0) {
        short var1 = 256;
        field1406 += arg0 * 128;
        if (field1406 > Statics.field2374.length) {
            field1406 -= Statics.field2374.length;
            int var2 = (int) (Math.random() * 12.0D);
            method223(Statics.field2294[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field890[var3 + var4] - Statics.field2374[field1406 + var3 & Statics.field2374.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field890[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field890[var9 + var10] = 255;
                } else {
                    Statics.field890[var9 + var10] = 0;
                }
            }
        }
        if (field1404 > 0) {
            field1404 -= arg0 * 4;
        }
        if (field1403 > 0) {
            field1403 -= arg0 * 4;
        }
        if (field1404 == 0 && field1403 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field1404 = 1024;
            }
            if (var12 == 1) {
                field1403 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field1428[var13] = field1428[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field1428[var14] = (int) (Math.sin((double) field1409 / 14.0D) * 16.0D + Math.sin((double) field1409 / 15.0D) * 14.0D + Math.sin((double) field1409 / 16.0D) * 12.0D);
            field1409++;
        }
        field1407 += arg0 * 1748418101;
        int var15 = ((client.field902 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field1407 * 257039188; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field890[(var18 << 7) + var17] = 192;
        }
        field1407 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field890[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field890[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field325[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field325[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field325[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field890[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("t.r(IIII)I")
    public static final int method35(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("cz.g(I)V")
    public static final void method1565() {
        short var0 = 256;
        if (field1404 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1404 > 768) {
                    Statics.field720[var1] = method35(Statics.field2405[var1], Statics.field434[var1], 1024 - field1404);
                } else if (field1404 > 256) {
                    Statics.field720[var1] = Statics.field434[var1];
                } else {
                    Statics.field720[var1] = method35(Statics.field434[var1], Statics.field2405[var1], 256 - field1404);
                }
            }
        } else if (field1403 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1403 > 768) {
                    Statics.field720[var2] = method35(Statics.field2405[var2], Statics.field567[var2], 1024 - field1403);
                } else if (field1403 > 256) {
                    Statics.field720[var2] = Statics.field567[var2];
                } else {
                    Statics.field720[var2] = method35(Statics.field567[var2], Statics.field2405[var2], 256 - field1403);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field720[var3] = Statics.field2405[var3];
            }
        }
        class282.method4560(field1417, 9, field1417 + 128, var0 + 7);
        Statics.field1412.method4669(field1417, 0);
        class282.method4542();
        int var4 = 0;
        int var5 = field1417 + Statics.field583.field3748 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1428[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field890[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field720[var10];
                    int var14 = Statics.field583.field3747[var5];
                    Statics.field583.field3747[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field583.field3748 + var8 - 128;
        }
        class282.method4560(field1417 + 765 - 128, 9, field1417 + 765, var0 + 7);
        Statics.field1400.method4669(field1417 + 382, 0);
        class282.method4542();
        int var15 = 0;
        int var16 = field1417 + Statics.field583.field3748 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1428[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field890[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field720[var22];
                    int var26 = Statics.field583.field3747[var20];
                    Statics.field583.field3747[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field583.field3748 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("h.s(Ljt;Ljt;B)V")
    public static void method156(class264 arg0, class264 arg1) {
        if (Statics.field1425 == null) {
            Statics.field1425 = class287.method4481(Statics.field1256, "sl_back", "");
        }
        if (Statics.field401 == null) {
            Statics.field401 = class287.method3595(Statics.field1256, "sl_flags", "");
        }
        if (Statics.field518 == null) {
            Statics.field518 = class287.method3595(Statics.field1256, "sl_arrows", "");
        }
        if (Statics.field1360 == null) {
            Statics.field1360 = class287.method3595(Statics.field1256, "sl_stars", "");
        }
        class282.method4551(field1417, 23, 765, 480, 0);
        class282.method4556(field1417, 0, 125, 23, 12425273, 9135624);
        class282.method4556(field1417 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4363(class226.field3074, field1417 + 62, 15, 0, -1);
        if (Statics.field1360 != null) {
            Statics.field1360[1].method4636(field1417 + 140, 1);
            arg1.method4371(class226.field2976, field1417 + 152, 10, 16777215, -1);
            Statics.field1360[0].method4636(field1417 + 140, 12);
            arg1.method4371(class226.field2997, field1417 + 152, 21, 16777215, -1);
        }
        if (Statics.field518 != null) {
            int var2 = field1417 + 280;
            if (class81.field1267[0] == 0 && class81.field1266[0] == 0) {
                Statics.field518[2].method4636(var2, 4);
            } else {
                Statics.field518[0].method4636(var2, 4);
            }
            if (class81.field1267[0] == 0 && class81.field1266[0] == 1) {
                Statics.field518[3].method4636(var2 + 15, 4);
            } else {
                Statics.field518[1].method4636(var2 + 15, 4);
            }
            arg0.method4371(class226.field3108, var2 + 32, 17, 16777215, -1);
            int var3 = field1417 + 390;
            if (class81.field1267[0] == 1 && class81.field1266[0] == 0) {
                Statics.field518[2].method4636(var3, 4);
            } else {
                Statics.field518[0].method4636(var3, 4);
            }
            if (class81.field1267[0] == 1 && class81.field1266[0] == 1) {
                Statics.field518[3].method4636(var3 + 15, 4);
            } else {
                Statics.field518[1].method4636(var3 + 15, 4);
            }
            arg0.method4371(class226.field3109, var3 + 32, 17, 16777215, -1);
            int var4 = field1417 + 500;
            if (class81.field1267[0] == 2 && class81.field1266[0] == 0) {
                Statics.field518[2].method4636(var4, 4);
            } else {
                Statics.field518[0].method4636(var4, 4);
            }
            if (class81.field1267[0] == 2 && class81.field1266[0] == 1) {
                Statics.field518[3].method4636(var4 + 15, 4);
            } else {
                Statics.field518[1].method4636(var4 + 15, 4);
            }
            arg0.method4371(class226.field3110, var4 + 32, 17, 16777215, -1);
            int var5 = field1417 + 610;
            if (class81.field1267[0] == 3 && class81.field1266[0] == 0) {
                Statics.field518[2].method4636(var5, 4);
            } else {
                Statics.field518[0].method4636(var5, 4);
            }
            if (class81.field1267[0] == 3 && class81.field1266[0] == 1) {
                Statics.field518[3].method4636(var5 + 15, 4);
            } else {
                Statics.field518[1].method4636(var5 + 15, 4);
            }
            arg0.method4371(class226.field2911, var5 + 32, 17, 16777215, -1);
        }
        class282.method4551(field1417 + 708, 4, 50, 16, 0);
        arg1.method4363(class226.field3073, field1417 + 708 + 25, 16, 16777215, -1);
        field1405 = -1;
        if (Statics.field1425 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class81.field1264) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class81.field1264) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class81.field1264) {
                    var9--;
                }
            } while (var9 != var10 || var8 != var11);
            int var12 = (765 - var6 * var8) / (var8 + 1);
            if (var12 > 5) {
                var12 = 5;
            }
            int var13 = (480 - var7 * var9) / (var9 + 1);
            if (var13 > 5) {
                var13 = 5;
            }
            int var14 = (765 - var6 * var8 - (var8 - 1) * var12) / 2;
            int var15 = (480 - var7 * var9 - (var9 - 1) * var13) / 2;
            int var16 = var15 + 23;
            int var17 = field1417 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class81.field1264; var20++) {
                class81 var21 = Statics.field1263[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1261);
                if (var21.field1261 == -1) {
                    var23 = class226.field3112;
                    var22 = false;
                } else if (var21.field1261 > 1980) {
                    var23 = class226.field2934;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1415()) {
                    if (var21.method1451()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1418()) {
                    var24 = 16711680;
                    if (var21.method1451()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1439()) {
                    if (var21.method1451()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1451()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class60.field697 >= var17 && class60.field706 * -119379047 >= var16 && class60.field697 < var6 + var17 && class60.field706 * -119379047 < var7 + var16 && var22) {
                    field1405 = var20;
                    Statics.field1425[var25].method4675(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1425[var25].method4669(var17, var16);
                }
                if (Statics.field401 != null) {
                    Statics.field401[(var21.method1451() ? 8 : 0) + var21.field1265].method4636(var17 + 29, var16);
                }
                arg0.method4363(Integer.toString(var21.field1269), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method4363(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method4434(Statics.field1263[field1405].field1273) + 6;
                int var27 = arg1.field3623 + 8;
                class282.method4551(class60.field697 - var26 / 2, class60.field706 * -119379047 + 20 + 5, var26, var27, 16777120);
                class282.method4545(class60.field697 - var26 / 2, class60.field706 * -119379047 + 20 + 5, var26, var27, 0);
                arg1.method4363(Statics.field1263[field1405].field1273, class60.field697, class60.field706 * -119379047 + 20 + 5 + arg1.field3623 + 4, 0, -1);
            }
        }
        Statics.field583.method722(0, 0);
    }

    @ObfuscatedName("am.o(Lcc;I)V")
    public static void method196(class81 arg0) {
        if (arg0.method1451() != client.field892) {
            client.field892 = arg0.method1451();
            class257.method149(arg0.method1451());
        }
        Statics.field10 = arg0.field1275;
        client.field893 = arg0.field1269;
        client.field961 = arg0.field1270;
        Statics.field3150 = client.field895 == 0 ? 43594 : arg0.field1269 + 40000;
        Statics.field255 = client.field895 == 0 ? 443 : arg0.field1269 + 50000;
        Statics.field660 = Statics.field3150;
    }
}

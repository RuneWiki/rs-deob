package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("ct")
public class class91 {

    @ObfuscatedName("ct.k")
    public static int field1420 = 0;

    @ObfuscatedName("ct.x")
    public static int field1418 = field1420 + 202;

    @ObfuscatedName("ct.a")
    public static int[] field1419 = new int[256];

    @ObfuscatedName("ct.m")
    public static int field1424 = 0;

    @ObfuscatedName("ct.ae")
    public static int field1421 = 0;

    @ObfuscatedName("ct.ag")
    public static int field1422 = 0;

    @ObfuscatedName("ct.as")
    public static int field1442 = 0;

    @ObfuscatedName("ct.af")
    public static int field1414 = 0;

    @ObfuscatedName("ct.aq")
    public static int field1423 = 0;

    @ObfuscatedName("ct.am")
    public static int field1426 = 10;

    @ObfuscatedName("ct.az")
    public static String field1427 = "";

    @ObfuscatedName("ct.av")
    public static int field1434 = 0;

    @ObfuscatedName("ct.an")
    public static String field1429 = "";

    @ObfuscatedName("ct.ar")
    public static String field1411 = "";

    @ObfuscatedName("ct.aa")
    public static String field1431 = "";

    @ObfuscatedName("ct.aj")
    public static String field1444 = "";

    @ObfuscatedName("ct.ap")
    public static String field1432 = "";

    @ObfuscatedName("ct.ao")
    public static String field1433 = "";

    @ObfuscatedName("ct.at")
    public static boolean field1415 = false;

    @ObfuscatedName("ct.ak")
    public static boolean field1436 = false;

    @ObfuscatedName("ct.bj")
    public static boolean field1437 = false;

    @ObfuscatedName("ct.bc")
    public static boolean field1439 = true;

    @ObfuscatedName("ct.by")
    public static int field1440 = 0;

    @ObfuscatedName("ct.bb")
    public static String field1441 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ct.bn")
    public static String field1425 = "1234567890";

    @ObfuscatedName("ct.bl")
    public static boolean field1443 = false;

    @ObfuscatedName("ct.bv")
    public static int field1430 = -1;

    public class91() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.d(Lit;Lit;ZII)V")
    public static void method691(class236 arg0, class236 arg1, boolean arg2, int arg3) {
        if (!Statics.field1410) {
            field1434 = arg3;
            class283.method4683();
            byte[] var4 = arg0.method3962("title.jpg", "");
            Statics.field2604 = class55.method3824(var4);
            Statics.field792 = Statics.field2604.method4844();
            if ((client.field955 & 0x20000000) == 0) {
                Statics.field1428 = class288.method1049(arg1, "logo", "");
            } else {
                Statics.field1428 = class288.method1049(arg1, "logo_deadman_mode", "");
            }
            Statics.field1412 = class288.method1049(arg1, "titlebox", "");
            Statics.field1413 = class288.method1049(arg1, "titlebutton", "");
            Statics.field3667 = class288.method1046(arg1, "runes", "");
            Statics.field1435 = class288.method1046(arg1, "title_mute", "");
            Statics.field1759 = class288.method1049(arg1, "options_radio_buttons,0", "");
            Statics.field432 = class288.method1049(arg1, "options_radio_buttons,4", "");
            Statics.field1416 = class288.method1049(arg1, "options_radio_buttons,2", "");
            Statics.field528 = class288.method1049(arg1, "options_radio_buttons,6", "");
            Statics.field1751 = Statics.field1759.field3791;
            Statics.field3337 = Statics.field1759.field3790;
            Statics.field838 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field838[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field838[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field838[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field838[var8 + 192] = 16777215;
            }
            Statics.field42 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field42[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field42[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field42[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field42[var12 + 192] = 16777215;
            }
            Statics.field11 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field11[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field11[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field11[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field11[var16 + 192] = 16777215;
            }
            Statics.field578 = new int[256];
            Statics.field793 = new int[32768];
            Statics.field3384 = new int[32768];
            method3862((class286) null);
            Statics.field918 = new int[32768];
            Statics.field2855 = new int[32768];
            if (arg2) {
                field1432 = "";
                field1433 = "";
            }
            Statics.field2043 = 0;
            Statics.field1438 = "";
            field1439 = true;
            field1443 = false;
            if (Statics.field355.field1303) {
                class204.method2697(2);
            } else {
                class204.method226(2, Statics.field3677, "scape main", "", 255, false);
            }
            class239.method3940(false);
            Statics.field1410 = true;
            field1420 = (Statics.field762 - 765) / 2;
            field1418 = field1420 + 202;
            Statics.field540 = field1418 + 180;
            Statics.field2604.method4795(field1420, 0);
            Statics.field792.method4795(field1420 + 382, 0);
            Statics.field1428.method4769(field1420 + 382 - Statics.field1428.field3791 / 2, 18);
        } else if (arg3 == 4) {
            field1434 = 4;
        }
    }

    @ObfuscatedName("e.k(ZZB)Ljz;")
    public static class286 method9(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field528 : Statics.field1416) : (arg1 ? Statics.field432 : Statics.field1759);
    }

    @ObfuscatedName("dh.e(I)V")
    public static void method2263() {
        if (field1432 != null && field1432.length() > 0) {
            return;
        }
        if (Statics.field355.field1307 == null) {
            field1415 = false;
        } else {
            field1432 = Statics.field355.field1307;
            field1415 = true;
        }
    }

    @ObfuscatedName("bz.p(I)V")
    public static void method1453() {
        if (!Statics.field1410) {
            return;
        }
        Statics.field1412 = null;
        Statics.field1413 = null;
        Statics.field3667 = null;
        Statics.field2604 = null;
        Statics.field792 = null;
        Statics.field1428 = null;
        Statics.field1435 = null;
        Statics.field1759 = null;
        Statics.field1416 = null;
        Statics.field917 = null;
        Statics.field489 = null;
        Statics.field2432 = null;
        Statics.field2215 = null;
        Statics.field817 = null;
        Statics.field838 = null;
        Statics.field42 = null;
        Statics.field11 = null;
        Statics.field578 = null;
        Statics.field793 = null;
        Statics.field3384 = null;
        Statics.field918 = null;
        Statics.field2855 = null;
        class204.method2697(2);
        class239.method3940(true);
        Statics.field1410 = false;
    }

    @ObfuscatedName("ao.q(B)V")
    public static void method544() {
        if (field1415 && field1432 != null && field1432.length() > 0) {
            field1440 = 1;
        } else {
            field1440 = 0;
        }
    }

    @ObfuscatedName("dj.s(Lbn;I)V")
    public static void method2266(class59 arg0) {
        if (!field1443) {
            if ((class60.field742 == 1 || !Statics.field1651 && class60.field742 == 4) && class60.field753 >= field1420 + 765 - 50 && class60.field754 >= 453) {
                Statics.field355.field1303 = !Statics.field355.field1303;
                class80.method51();
                if (Statics.field355.field1303) {
                    class204.method1612();
                } else {
                    class238 var6 = Statics.field3677;
                    int var7 = var6.method3896("scape main");
                    int var8 = var6.method3892(var7, "");
                    class204.method2819(var6, var7, var8, 255, false);
                }
            }
            if (client.field929 != 5) {
                field1414++;
                if (client.field929 == 10 || client.field929 == 11) {
                    if (client.field927 == 0) {
                        if (class60.field742 == 1 || !Statics.field1651 && class60.field742 == 4) {
                            int var9 = field1420 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class60.field753 >= var9 && class60.field753 <= var9 + var11 && class60.field754 >= var10 && class60.field754 <= var10 + var12) {
                                if (class79.method64()) {
                                    field1443 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field1293 != null && class79.method64()) {
                            field1443 = true;
                        }
                    }
                    int var13 = class60.field742;
                    int var14 = class60.field753;
                    int var15 = class60.field754;
                    if (var13 == 0) {
                        var14 = class60.field746;
                        var15 = class60.field747;
                    }
                    if (!Statics.field1651 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field1434 == 0) {
                        boolean var16 = false;
                        while (class51.method1()) {
                            if (Statics.field1492 == 84) {
                                var16 = true;
                            }
                        }
                        int var17 = Statics.field540 - 80;
                        short var18 = 291;
                        if (var13 == 1 && var14 >= var17 - 75 && var14 <= var17 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20) {
                            class57.method1096(client.method559("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var19 = Statics.field540 + 80;
                        if (var13 == 1 && var14 >= var19 - 75 && var14 <= var19 + 75 && var15 >= var18 - 20 && var15 <= var18 + 20 || var16) {
                            if ((client.field955 & 0x2000000) != 0) {
                                field1429 = "";
                                field1411 = class226.field3081;
                                field1431 = class226.field3082;
                                field1444 = class226.field3083;
                                field1434 = 1;
                                method544();
                            } else if ((client.field955 & 0x4) != 0) {
                                if ((client.field955 & 0x400) == 0) {
                                    field1411 = class226.field2967;
                                    field1431 = class226.field3073;
                                    field1444 = class226.field3074;
                                } else {
                                    field1411 = class226.field2863;
                                    field1431 = class226.field3079;
                                    field1444 = class226.field3080;
                                }
                                field1429 = class226.field3071;
                                field1434 = 1;
                                method544();
                            } else if ((client.field955 & 0x400) == 0) {
                                method636(false);
                            } else {
                                field1411 = class226.field3075;
                                field1431 = class226.field3076;
                                field1444 = class226.field3077;
                                field1429 = class226.field3071;
                                field1434 = 1;
                                method544();
                            }
                        }
                    } else if (field1434 == 1) {
                        while (class51.method1()) {
                            if (Statics.field1492 == 84) {
                                method636(false);
                            } else if (Statics.field1492 == 13) {
                                field1434 = 0;
                            }
                        }
                        int var20 = Statics.field540 - 80;
                        short var21 = 321;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            method636(false);
                        }
                        int var22 = Statics.field540 + 80;
                        if (var13 == 1 && var14 >= var22 - 75 && var14 <= var22 + 75 && var15 >= var21 - 20 && var15 <= var21 + 20) {
                            field1434 = 0;
                        }
                    } else if (field1434 == 2) {
                        short var23 = 201;
                        int var49 = var23 + 52;
                        if (var13 == 1 && var15 >= var49 - 12 && var15 < var49 + 2) {
                            field1440 = 0;
                        }
                        var49 += 15;
                        if (var13 == 1 && var15 >= var49 - 12 && var15 < var49 + 2) {
                            field1440 = 1;
                        }
                        var49 += 15;
                        short var24 = 361;
                        if (var13 == 1 && var15 >= var24 - 15 && var15 < var24) {
                            method4(class226.field3109, class226.field3110, class226.field3111);
                            field1434 = 5;
                            return;
                        }
                        int var25 = Statics.field540 - 80;
                        short var26 = 321;
                        if (var13 == 1 && var14 >= var25 - 75 && var14 <= var25 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field1432 = field1432.trim();
                            if (field1432.length() == 0) {
                                method4(class226.field3136, class226.field2975, class226.field2912);
                                return;
                            }
                            if (field1433.length() == 0) {
                                method4(class226.field3000, class226.field2882, class226.field3052);
                                return;
                            }
                            method4(class226.field2866, class226.field3087, class226.field3088);
                            client.method3612(false);
                            client.method2525(20);
                            return;
                        }
                        int var27 = field1418 + 180 + 80;
                        if (var13 == 1 && var14 >= var27 - 75 && var14 <= var27 + 75 && var15 >= var26 - 20 && var15 <= var26 + 20) {
                            field1434 = 0;
                            field1432 = "";
                            field1433 = "";
                            Statics.field2043 = 0;
                            Statics.field1438 = "";
                            field1439 = true;
                        }
                        int var28 = Statics.field540 + -117;
                        short var29 = 277;
                        field1436 = var14 >= var28 && var14 < Statics.field1751 + var28 && var15 >= var29 && var15 < Statics.field3337 + var29;
                        if (var13 == 1 && field1436) {
                            field1415 = !field1415;
                            if (!field1415 && Statics.field355.field1307 != null) {
                                Statics.field355.field1307 = null;
                                class80.method51();
                            }
                        }
                        int var30 = Statics.field540 + 24;
                        short var31 = 277;
                        field1437 = var14 >= var30 && var14 < Statics.field1751 + var30 && var15 >= var31 && var15 < Statics.field3337 + var31;
                        if (var13 == 1 && field1437) {
                            Statics.field355.field1305 = !Statics.field355.field1305;
                            if (!Statics.field355.field1305) {
                                field1432 = "";
                                Statics.field355.field1307 = null;
                                method544();
                            }
                            class80.method51();
                        }
                        while (true) {
                            while (class51.method1()) {
                                boolean var32 = false;
                                for (int var33 = 0; var33 < field1441.length(); var33++) {
                                    if (Statics.field1547 == field1441.charAt(var33)) {
                                        var32 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1492 == 13) {
                                    field1434 = 0;
                                    field1432 = "";
                                    field1433 = "";
                                    Statics.field2043 = 0;
                                    Statics.field1438 = "";
                                    field1439 = true;
                                } else if (field1440 == 0) {
                                    if (Statics.field1492 == 85 && field1432.length() > 0) {
                                        field1432 = field1432.substring(0, field1432.length() - 1);
                                    }
                                    if (Statics.field1492 == 84 || Statics.field1492 == 80) {
                                        field1440 = 1;
                                    }
                                    if (var32 && field1432.length() < 320) {
                                        field1432 = field1432 + Statics.field1547;
                                    }
                                } else if (field1440 == 1) {
                                    if (Statics.field1492 == 85 && field1433.length() > 0) {
                                        field1433 = field1433.substring(0, field1433.length() - 1);
                                    }
                                    if (Statics.field1492 == 84 || Statics.field1492 == 80) {
                                        field1440 = 0;
                                    }
                                    if (Statics.field1492 == 84) {
                                        field1432 = field1432.trim();
                                        if (field1432.length() == 0) {
                                            method4(class226.field3136, class226.field2975, class226.field2912);
                                            return;
                                        }
                                        if (field1433.length() == 0) {
                                            method4(class226.field3000, class226.field2882, class226.field3052);
                                            return;
                                        }
                                        method4(class226.field2866, class226.field3087, class226.field3088);
                                        client.method3612(false);
                                        client.method2525(20);
                                        return;
                                    }
                                    if (var32 && field1433.length() < 20) {
                                        field1433 = field1433 + Statics.field1547;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1434 == 3) {
                        int var34 = field1418 + 180;
                        short var35 = 276;
                        if (var13 == 1 && var14 >= var34 - 75 && var14 <= var34 + 75 && var15 >= var35 - 20 && var15 <= var35 + 20) {
                            method636(false);
                        }
                        int var36 = field1418 + 180;
                        short var37 = 326;
                        if (var13 == 1 && var14 >= var36 - 75 && var14 <= var36 + 75 && var15 >= var37 - 20 && var15 <= var37 + 20) {
                            method4(class226.field3109, class226.field3110, class226.field3111);
                            field1434 = 5;
                            return;
                        }
                    } else if (field1434 == 4) {
                        int var38 = field1418 + 180 - 80;
                        short var39 = 321;
                        if (var13 == 1 && var14 >= var38 - 75 && var14 <= var38 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            Statics.field1438.trim();
                            if (Statics.field1438.length() != 6) {
                                method4(class226.field2893, class226.field2894, class226.field3066);
                                return;
                            }
                            Statics.field2043 = Integer.parseInt(Statics.field1438);
                            Statics.field1438 = "";
                            client.method3612(true);
                            method4(class226.field2866, class226.field3087, class226.field3088);
                            client.method2525(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field1418 + 180 - 9 && var14 <= field1418 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field1439 = !field1439;
                        }
                        if (var13 == 1 && var14 >= field1418 + 180 - 34 && var14 <= field1418 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            class57.method1096(client.method559("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var40 = field1418 + 180 + 80;
                        if (var13 == 1 && var14 >= var40 - 75 && var14 <= var40 + 75 && var15 >= var39 - 20 && var15 <= var39 + 20) {
                            field1434 = 0;
                            field1432 = "";
                            field1433 = "";
                            Statics.field2043 = 0;
                            Statics.field1438 = "";
                        }
                        while (class51.method1()) {
                            boolean var41 = false;
                            for (int var42 = 0; var42 < field1425.length(); var42++) {
                                if (Statics.field1547 == field1425.charAt(var42)) {
                                    var41 = true;
                                    break;
                                }
                            }
                            if (Statics.field1492 == 13) {
                                field1434 = 0;
                                field1432 = "";
                                field1433 = "";
                                Statics.field2043 = 0;
                                Statics.field1438 = "";
                            } else {
                                if (Statics.field1492 == 85 && Statics.field1438.length() > 0) {
                                    Statics.field1438 = Statics.field1438.substring(0, Statics.field1438.length() - 1);
                                }
                                if (Statics.field1492 == 84) {
                                    Statics.field1438.trim();
                                    if (Statics.field1438.length() != 6) {
                                        method4(class226.field2893, class226.field2894, class226.field3066);
                                        return;
                                    }
                                    Statics.field2043 = Integer.parseInt(Statics.field1438);
                                    Statics.field1438 = "";
                                    client.method3612(true);
                                    method4(class226.field2866, class226.field3087, class226.field3088);
                                    client.method2525(20);
                                    return;
                                }
                                if (var41 && Statics.field1438.length() < 6) {
                                    Statics.field1438 = Statics.field1438 + Statics.field1547;
                                }
                            }
                        }
                    } else if (field1434 == 5) {
                        int var43 = field1418 + 180 - 80;
                        short var44 = 321;
                        if (var13 == 1 && var14 >= var43 - 75 && var14 <= var43 + 75 && var15 >= var44 - 20 && var15 <= var44 + 20) {
                            method1608();
                            return;
                        }
                        int var45 = field1418 + 180 + 80;
                        if (var13 == 1 && var14 >= var45 - 75 && var14 <= var45 + 75 && var15 >= var44 - 20 && var15 <= var44 + 20) {
                            method636(true);
                        }
                        while (class51.method1()) {
                            boolean var46 = false;
                            for (int var47 = 0; var47 < field1441.length(); var47++) {
                                if (Statics.field1547 == field1441.charAt(var47)) {
                                    var46 = true;
                                    break;
                                }
                            }
                            if (Statics.field1492 == 13) {
                                method636(true);
                            } else {
                                if (Statics.field1492 == 85 && field1432.length() > 0) {
                                    field1432 = field1432.substring(0, field1432.length() - 1);
                                }
                                if (Statics.field1492 == 84) {
                                    method1608();
                                    return;
                                }
                                if (var46 && field1432.length() < 320) {
                                    field1432 = field1432 + Statics.field1547;
                                }
                            }
                        }
                    } else if (field1434 == 6) {
                        while (true) {
                            do {
                                if (!class51.method1()) {
                                    short var48 = 321;
                                    if (var13 == 1 && var15 >= var48 - 20 && var15 <= var48 + 20) {
                                        method636(true);
                                    }
                                    return;
                                }
                            } while (Statics.field1492 != 84 && Statics.field1492 != 13);
                            method636(true);
                        }
                    }
                }
            }
        } else if (class60.field742 == 1 || !Statics.field1651 && class60.field742 == 4) {
            int var1 = field1420 + 280;
            if (class60.field753 >= var1 && class60.field753 <= var1 + 14 && class60.field754 >= 4 && class60.field754 <= 18) {
                class79.method600(0, 0);
            } else if (class60.field753 >= var1 + 15 && class60.field753 <= var1 + 80 && class60.field754 >= 4 && class60.field754 <= 18) {
                class79.method600(0, 1);
            } else {
                int var2 = field1420 + 390;
                if (class60.field753 >= var2 && class60.field753 <= var2 + 14 && class60.field754 >= 4 && class60.field754 <= 18) {
                    class79.method600(1, 0);
                } else if (class60.field753 >= var2 + 15 && class60.field753 <= var2 + 80 && class60.field754 >= 4 && class60.field754 <= 18) {
                    class79.method600(1, 1);
                } else {
                    int var3 = field1420 + 500;
                    if (class60.field753 >= var3 && class60.field753 <= var3 + 14 && class60.field754 >= 4 && class60.field754 <= 18) {
                        class79.method600(2, 0);
                    } else if (class60.field753 >= var3 + 15 && class60.field753 <= var3 + 80 && class60.field754 >= 4 && class60.field754 <= 18) {
                        class79.method600(2, 1);
                    } else {
                        int var4 = field1420 + 610;
                        if (class60.field753 >= var4 && class60.field753 <= var4 + 14 && class60.field754 >= 4 && class60.field754 <= 18) {
                            class79.method600(3, 0);
                        } else if (class60.field753 >= var4 + 15 && class60.field753 <= var4 + 80 && class60.field754 >= 4 && class60.field754 <= 18) {
                            class79.method600(3, 1);
                        } else if (class60.field753 >= field1420 + 708 && class60.field754 >= 4 && class60.field753 <= field1420 + 708 + 50 && class60.field754 <= 20) {
                            field1443 = false;
                            Statics.field2604.method4795(field1420, 0);
                            Statics.field792.method4795(field1420 + 382, 0);
                            Statics.field1428.method4769(field1420 + 382 - Statics.field1428.field3791 / 2, 18);
                        } else if (field1430 != -1) {
                            class79 var5 = Statics.field2110[field1430];
                            method1631(var5);
                            field1443 = false;
                            Statics.field2604.method4795(field1420, 0);
                            Statics.field792.method4795(field1420 + 382, 0);
                            Statics.field1428.method4769(field1420 + 382 - Statics.field1428.field3791 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.r(ZB)V")
    public static void method636(boolean arg0) {
        field1411 = class226.field3068;
        field1431 = class226.field3069;
        field1444 = class226.field3130;
        field1434 = 2;
        if (arg0) {
            field1433 = "";
        }
        method2263();
        method544();
    }

    @ObfuscatedName("cx.g(B)V")
    public static void method1608() {
        field1432 = field1432.trim();
        if (field1432.length() == 0) {
            method4(class226.field3109, class226.field3110, class226.field3111);
            return;
        }
        long var0 = class86.method224();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1432;
            Random var4 = new Random();
            class174 var5 = new class174(128);
            class174 var6 = new class174(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2970(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2942(var4.nextInt());
            }
            var5.method2942(var7[0]);
            var5.method2942(var7[1]);
            var5.method2944(var0);
            var5.method2944(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2942(var4.nextInt());
            }
            var5.method3149(class86.field1377, class86.field1374);
            var6.method2970(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2942(var4.nextInt());
            }
            var6.method2944(var4.nextLong());
            var6.method2943(var4.nextLong());
            if (client.field982 == null) {
                byte[] var11 = class156.method2711();
                var6.method2949(var11, 0, var11.length);
            } else {
                var6.method2949(client.field982, 0, client.field982.length);
            }
            var6.method2944(var4.nextLong());
            var6.method3149(class86.field1377, class86.field1374);
            int var12 = class174.method2869(var3);
            if (var12 % 8 != 0) {
                var12 += 8 - var12 % 8;
            }
            class174 var13 = new class174(var12);
            var13.method3041(var3);
            var13.field2405 = var12;
            var13.method2939(var7);
            class174 var14 = new class174(var13.field2405 + var6.field2405 + var5.field2405 + 5);
            var14.method2970(2);
            var14.method2970(var5.field2405);
            var14.method2949(var5.field2409, 0, var5.field2405);
            var14.method2970(var6.field2405);
            var14.method2949(var6.field2409, 0, var6.field2405);
            var14.method2940(var13.field2405);
            var14.method2949(var13.field2409, 0, var13.field2405);
            String var15 = class270.method1628(var14.field2409);
            byte var22;
            try {
                URL var16 = new URL(client.method559("services", false) + "m=accountappeal/login.ws");
                URLConnection var17 = var16.openConnection();
                var17.setDoInput(true);
                var17.setDoOutput(true);
                var17.setConnectTimeout(5000);
                OutputStreamWriter var18 = new OutputStreamWriter(var17.getOutputStream());
                var18.write("data2=" + class295.method2855(var15) + "&dest=" + class295.method2855("passwordchoice.ws"));
                var18.flush();
                InputStream var19 = var17.getInputStream();
                class174 var20 = new class174(new byte[1000]);
                while (true) {
                    int var21 = var19.read(var20.field2409, var20.field2405, 1000 - var20.field2405);
                    if (var21 == -1) {
                        var18.close();
                        var19.close();
                        String var23 = new String(var20.field2409);
                        if (var23.startsWith("OFFLINE")) {
                            var22 = 4;
                        } else if (var23.startsWith("WRONG")) {
                            var22 = 7;
                        } else if (var23.startsWith("RELOAD")) {
                            var22 = 3;
                        } else if (var23.startsWith("Not permitted for social network accounts.")) {
                            var22 = 6;
                        } else {
                            var20.method3166(var7);
                            while (var20.field2405 > 0 && var20.field2409[var20.field2405 - 1] == 0) {
                                var20.field2405--;
                            }
                            String var24 = new String(var20.field2409, 0, var20.field2405);
                            boolean var25;
                            if (var24 == null) {
                                var25 = false;
                            } else {
                                label93: {
                                    try {
                                        new URL(var24);
                                    } catch (MalformedURLException var28) {
                                        var25 = false;
                                        break label93;
                                    }
                                    var25 = true;
                                }
                            }
                            if (var25) {
                                class57.method1096(var24, true, false);
                                var22 = 2;
                            } else {
                                var22 = 5;
                            }
                        }
                        break;
                    }
                    var20.field2405 += var21;
                    if (var20.field2405 >= 1000) {
                        var22 = 5;
                        break;
                    }
                }
            } catch (Throwable var29) {
                var29.printStackTrace();
                var22 = 5;
            }
            var2 = var22;
        }
        switch(var2) {
            case 2:
                method4(class226.field2880, class226.field3113, class226.field3114);
                field1434 = 6;
                break;
            case 3:
                method4(class226.field2979, class226.field3116, class226.field2857);
                break;
            case 4:
                method4(class226.field3118, class226.field3119, class226.field3120);
                break;
            case 5:
                method4(class226.field2873, class226.field3122, class226.field3123);
                break;
            case 6:
                method4(class226.field3132, class226.field3125, class226.field2974);
                break;
            case 7:
                method4(class226.field3127, class226.field3128, class226.field2879);
        }
    }

    @ObfuscatedName("bz.v(Lju;Lju;Lju;ZI)V")
    public static void method1451(class264 arg0, class264 arg1, class264 arg2, boolean arg3) {
        if (arg3) {
            field1420 = (Statics.field762 - 765) / 2;
            field1418 = field1420 + 202;
            Statics.field540 = field1418 + 180;
        }
        if (field1443) {
            method166(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field2604.method4795(field1420, 0);
            Statics.field792.method4795(field1420 + 382, 0);
            Statics.field1428.method4769(field1420 + 382 - Statics.field1428.field3791 / 2, 18);
        }
        if (client.field929 == 0 || client.field929 == 5) {
            byte var4 = 20;
            arg0.method4483(class226.field2957, field1418 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class283.method4698(field1418 + 180 - 152, var5, 304, 34, 9179409);
            class283.method4698(field1418 + 180 - 151, var5 + 1, 302, 32, 0);
            class283.method4762(field1418 + 180 - 150, var5 + 2, field1426 * 3, 30, 9179409);
            class283.method4762(field1426 * 3 + (field1418 + 180 - 150), var5 + 2, 300 - field1426 * 3, 30, 0);
            arg0.method4483(field1427, field1418 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field929 == 20) {
            Statics.field1412.method4769(field1418 + 180 - Statics.field1412.field3791 / 2, 271 - Statics.field1412.field3790 / 2);
            short var6 = 201;
            arg0.method4483(field1411, field1418 + 180, var6, 16776960, 0);
            int var158 = var6 + 15;
            arg0.method4483(field1431, field1418 + 180, var158, 16776960, 0);
            int var159 = var158 + 15;
            arg0.method4483(field1444, field1418 + 180, var159, 16776960, 0);
            int var160 = var159 + 15;
            int var161 = var160 + 7;
            if (field1434 != 4) {
                arg0.method4480(class226.field2862, field1418 + 180 - 110, var161, 16777215, 0);
                short var7 = 200;
                String var14;
                if (Statics.field355.field1305) {
                    String var8 = field1432;
                    int var9 = var8.length();
                    char[] var10 = new char[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = '*';
                    }
                    String var12 = new String(var10);
                    var14 = var12;
                } else {
                    var14 = field1432;
                }
                String var16;
                for (var16 = var14; arg0.method4552(var16) > var7; var16 = var16.substring(0, var16.length() - 1)) {
                }
                arg0.method4480(class265.method4563(var16), field1418 + 180 - 70, var161, 16777215, 0);
                var158 = var161 + 15;
                String var18 = class226.field2966;
                String var19 = field1433;
                int var20 = var19.length();
                char[] var21 = new char[var20];
                for (int var22 = 0; var22 < var20; var22++) {
                    var21[var22] = '*';
                }
                String var23 = new String(var21);
                arg0.method4480(var18 + var23, field1418 + 180 - 108, var158, 16777215, 0);
                var158 += 15;
            }
        }
        if (client.field929 == 10 || client.field929 == 11) {
            Statics.field1412.method4769(field1418, 171);
            if (field1434 == 0) {
                short var25 = 251;
                arg0.method4483(class226.field3092, field1418 + 180, var25, 16776960, 0);
                int var162 = var25 + 30;
                int var26 = field1418 + 180 - 80;
                short var27 = 291;
                Statics.field1413.method4769(var26 - 73, var27 - 20);
                arg0.method4484(class226.field3093, var26 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var28 = field1418 + 180 + 80;
                Statics.field1413.method4769(var28 - 73, var27 - 20);
                arg0.method4484(class226.field3094, var28 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1434 == 1) {
                arg0.method4483(field1429, field1418 + 180, 201, 16776960, 0);
                short var29 = 236;
                arg0.method4483(field1411, field1418 + 180, var29, 16777215, 0);
                int var163 = var29 + 15;
                arg0.method4483(field1431, field1418 + 180, var163, 16777215, 0);
                int var164 = var163 + 15;
                arg0.method4483(field1444, field1418 + 180, var164, 16777215, 0);
                int var165 = var164 + 15;
                int var30 = field1418 + 180 - 80;
                short var31 = 321;
                Statics.field1413.method4769(var30 - 73, var31 - 20);
                arg0.method4483(class226.field2982, var30, var31 + 5, 16777215, 0);
                int var32 = field1418 + 180 + 80;
                Statics.field1413.method4769(var32 - 73, var31 - 20);
                arg0.method4483(class226.field3096, var32, var31 + 5, 16777215, 0);
            } else if (field1434 == 2) {
                short var33 = 201;
                arg0.method4483(field1411, Statics.field540, var33, 16776960, 0);
                int var166 = var33 + 15;
                arg0.method4483(field1431, Statics.field540, var166, 16776960, 0);
                int var167 = var166 + 15;
                arg0.method4483(field1444, Statics.field540, var167, 16776960, 0);
                int var168 = var167 + 15;
                int var169 = var168 + 7;
                arg0.method4480(class226.field2862, Statics.field540 - 110, var169, 16777215, 0);
                short var34 = 200;
                String var41;
                if (Statics.field355.field1305) {
                    String var35 = field1432;
                    int var36 = var35.length();
                    char[] var37 = new char[var36];
                    for (int var38 = 0; var38 < var36; var38++) {
                        var37[var38] = '*';
                    }
                    String var39 = new String(var37);
                    var41 = var39;
                } else {
                    var41 = field1432;
                }
                String var43;
                for (var43 = var41; arg0.method4552(var43) > var34; var43 = var43.substring(1)) {
                }
                arg0.method4480(class265.method4563(var43) + (field1440 == 0 & client.field931 % 40 < 20 ? class87.method961(16776960) + class87.field1382 : ""), Statics.field540 - 70, var169, 16777215, 0);
                var166 = var169 + 15;
                String var45 = class226.field2966;
                String var46 = field1433;
                int var47 = var46.length();
                char[] var48 = new char[var47];
                for (int var49 = 0; var49 < var47; var49++) {
                    var48[var49] = '*';
                }
                String var50 = new String(var48);
                arg0.method4480(var45 + var50 + (field1440 == 1 & client.field931 % 40 < 20 ? class87.method961(16776960) + class87.field1382 : ""), Statics.field540 - 108, var166, 16777215, 0);
                var166 += 15;
                short var52 = 277;
                int var53 = Statics.field540 + -117;
                class286 var54 = method9(field1415, field1436);
                var54.method4769(var53, var52);
                int var55 = var54.field3791 + 5 + var53;
                arg1.method4480(class226.field3091, var55, var52 + 13, 16776960, 0);
                int var56 = Statics.field540 + 24;
                class286 var57 = method9(Statics.field355.field1305, field1437);
                var57.method4769(var56, var52);
                int var58 = var57.field3791 + 5 + var56;
                arg1.method4480(class226.field3098, var58, var52 + 13, 16776960, 0);
                int var170 = var52 + 15;
                int var59 = Statics.field540 - 80;
                short var60 = 321;
                Statics.field1413.method4769(var59 - 73, var60 - 20);
                arg0.method4483(class226.field2890, var59, var60 + 5, 16777215, 0);
                int var61 = Statics.field540 + 80;
                Statics.field1413.method4769(var61 - 73, var60 - 20);
                arg0.method4483(class226.field3096, var61, var60 + 5, 16777215, 0);
                short var62 = 357;
                arg1.method4483(class226.field3043, Statics.field540, var62, 16776960, 0);
            } else if (field1434 == 3) {
                short var63 = 201;
                arg0.method4483(class226.field3099, field1418 + 180, var63, 16776960, 0);
                int var171 = var63 + 20;
                arg1.method4483(class226.field3126, field1418 + 180, var171, 16776960, 0);
                int var172 = var171 + 15;
                arg1.method4483(class226.field3028, field1418 + 180, var172, 16776960, 0);
                int var173 = var172 + 15;
                int var64 = field1418 + 180;
                short var65 = 276;
                Statics.field1413.method4769(var64 - 73, var65 - 20);
                arg2.method4483(class226.field3102, var64, var65 + 5, 16777215, 0);
                int var66 = field1418 + 180;
                short var67 = 326;
                Statics.field1413.method4769(var66 - 73, var67 - 20);
                arg2.method4483(class226.field3103, var66, var67 + 5, 16777215, 0);
            } else if (field1434 == 4) {
                arg0.method4483(class226.field3084, field1418 + 180, 201, 16776960, 0);
                short var68 = 236;
                arg0.method4483(field1411, field1418 + 180, var68, 16777215, 0);
                int var174 = var68 + 15;
                arg0.method4483(field1431, field1418 + 180, var174, 16777215, 0);
                int var175 = var174 + 15;
                arg0.method4483(field1444, field1418 + 180, var175, 16777215, 0);
                int var176 = var175 + 15;
                String var70 = class226.field2871;
                String var71 = Statics.field1438;
                int var72 = var71.length();
                char[] var73 = new char[var72];
                for (int var74 = 0; var74 < var72; var74++) {
                    var73[var74] = '*';
                }
                String var75 = new String(var73);
                arg0.method4480(var70 + var75 + (client.field931 % 40 < 20 ? class87.method961(16776960) + class87.field1382 : ""), field1418 + 180 - 108, var176, 16777215, 0);
                var174 = var176 - 8;
                arg0.method4480(class226.field2865, field1418 + 180 - 9, var174, 16776960, 0);
                var174 += 15;
                arg0.method4480(class226.field3067, field1418 + 180 - 9, var174, 16776960, 0);
                int var77 = field1418 + 180 - 9 + arg0.method4552(class226.field3067) + 15;
                int var78 = var174 - arg0.field3642;
                class286 var79;
                if (field1439) {
                    var79 = Statics.field1416;
                } else {
                    var79 = Statics.field1759;
                }
                var79.method4769(var77, var78);
                var174 += 15;
                int var80 = field1418 + 180 - 80;
                short var81 = 321;
                Statics.field1413.method4769(var80 - 73, var81 - 20);
                arg0.method4483(class226.field2982, var80, var81 + 5, 16777215, 0);
                int var82 = field1418 + 180 + 80;
                Statics.field1413.method4769(var82 - 73, var81 - 20);
                arg0.method4483(class226.field3096, var82, var81 + 5, 16777215, 0);
                arg1.method4483(class226.field3085, field1418 + 180, var81 + 36, 255, 0);
            } else if (field1434 == 5) {
                arg0.method4483(class226.field3105, field1418 + 180, 201, 16776960, 0);
                short var83 = 221;
                arg2.method4483(field1411, field1418 + 180, var83, 16776960, 0);
                int var177 = var83 + 15;
                arg2.method4483(field1431, field1418 + 180, var177, 16776960, 0);
                int var178 = var177 + 15;
                arg2.method4483(field1444, field1418 + 180, var178, 16776960, 0);
                int var179 = var178 + 15;
                int var180 = var179 + 14;
                arg0.method4480(class226.field3008, field1418 + 180 - 145, var180, 16777215, 0);
                short var84 = 174;
                String var91;
                if (Statics.field355.field1305) {
                    String var85 = field1432;
                    int var86 = var85.length();
                    char[] var87 = new char[var86];
                    for (int var88 = 0; var88 < var86; var88++) {
                        var87[var88] = '*';
                    }
                    String var89 = new String(var87);
                    var91 = var89;
                } else {
                    var91 = field1432;
                }
                String var93;
                for (var93 = var91; arg0.method4552(var93) > var84; var93 = var93.substring(1)) {
                }
                arg0.method4480(class265.method4563(var93) + (client.field931 % 40 < 20 ? class87.method961(16776960) + class87.field1382 : ""), field1418 + 180 - 34, var180, 16777215, 0);
                var177 = var180 + 15;
                int var94 = field1418 + 180 - 80;
                short var95 = 321;
                Statics.field1413.method4769(var94 - 73, var95 - 20);
                arg0.method4483(class226.field3107, var94, var95 + 5, 16777215, 0);
                int var96 = field1418 + 180 + 80;
                Statics.field1413.method4769(var96 - 73, var95 - 20);
                arg0.method4483(class226.field3108, var96, var95 + 5, 16777215, 0);
            } else if (field1434 == 6) {
                short var97 = 201;
                arg0.method4483(field1411, field1418 + 180, var97, 16776960, 0);
                int var181 = var97 + 15;
                arg0.method4483(field1431, field1418 + 180, var181, 16776960, 0);
                int var182 = var181 + 15;
                arg0.method4483(field1444, field1418 + 180, var182, 16776960, 0);
                int var183 = var182 + 15;
                int var98 = field1418 + 180;
                short var99 = 321;
                Statics.field1413.method4769(var98 - 73, var99 - 20);
                arg0.method4483(class226.field3108, var98, var99 + 5, 16777215, 0);
            }
        }
        if (field1414 > 0) {
            int var100 = field1414;
            short var101 = 256;
            field1422 += var100 * 128;
            if (field1422 > Statics.field793.length) {
                field1422 -= Statics.field793.length;
                int var102 = (int) (Math.random() * 12.0D);
                method3862(Statics.field3667[var102]);
            }
            int var103 = 0;
            int var104 = var100 * 128;
            int var105 = (var101 - var100) * 128;
            for (int var106 = 0; var106 < var105; var106++) {
                int var107 = Statics.field918[var103 + var104] - Statics.field793[field1422 + var103 & Statics.field793.length - 1] * var100 / 6;
                if (var107 < 0) {
                    var107 = 0;
                }
                Statics.field918[var103++] = var107;
            }
            for (int var108 = var101 - var100; var108 < var101; var108++) {
                int var109 = var108 * 128;
                for (int var110 = 0; var110 < 128; var110++) {
                    int var111 = (int) (Math.random() * 100.0D);
                    if (var111 < 50 && var110 > 10 && var110 < 118) {
                        Statics.field918[var109 + var110] = 255;
                    } else {
                        Statics.field918[var109 + var110] = 0;
                    }
                }
            }
            if (field1424 > 0) {
                field1424 -= var100 * 4;
            }
            if (field1421 > 0) {
                field1421 -= var100 * 4;
            }
            if (field1424 == 0 && field1421 == 0) {
                int var112 = (int) (Math.random() * (double) (2000 / var100));
                if (var112 == 0) {
                    field1424 = 1024;
                }
                if (var112 == 1) {
                    field1421 = 1024;
                }
            }
            for (int var113 = 0; var113 < var101 - var100; var113++) {
                field1419[var113] = field1419[var100 + var113];
            }
            for (int var114 = var101 - var100; var114 < var101; var114++) {
                field1419[var114] = (int) (Math.sin((double) field1423 / 14.0D) * 16.0D + Math.sin((double) field1423 / 15.0D) * 14.0D + Math.sin((double) field1423 / 16.0D) * 12.0D);
                field1423++;
            }
            field1442 += var100 * 545806199;
            int var115 = ((client.field931 & 0x1) + var100) / 2;
            if (var115 > 0) {
                for (int var116 = 0; var116 < field1442 * -821451844; var116++) {
                    int var117 = (int) (Math.random() * 124.0D) + 2;
                    int var118 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field918[(var118 << 7) + var117] = 192;
                }
                field1442 = 0;
                int var119 = 0;
                label339: while (true) {
                    if (var119 >= var101) {
                        int var123 = 0;
                        while (true) {
                            if (var123 >= 128) {
                                break label339;
                            }
                            int var124 = 0;
                            for (int var125 = -var115; var125 < var101; var125++) {
                                int var126 = var125 * 128;
                                if (var115 + var125 < var101) {
                                    var124 += Statics.field2855[var115 * 128 + var123 + var126];
                                }
                                if (var125 - (var115 + 1) >= 0) {
                                    var124 -= Statics.field2855[var123 + var126 - (var115 + 1) * 128];
                                }
                                if (var125 >= 0) {
                                    Statics.field918[var123 + var126] = var124 / (var115 * 2 + 1);
                                }
                            }
                            var123++;
                        }
                    }
                    int var120 = 0;
                    int var121 = var119 * 128;
                    for (int var122 = -var115; var122 < 128; var122++) {
                        if (var115 + var122 < 128) {
                            var120 += Statics.field918[var121 + var122 + var115];
                        }
                        if (var122 - (var115 + 1) >= 0) {
                            var120 -= Statics.field918[var121 + var122 - (var115 + 1)];
                        }
                        if (var122 >= 0) {
                            Statics.field2855[var121 + var122] = var120 / (var115 * 2 + 1);
                        }
                    }
                    var119++;
                }
            }
            field1414 = 0;
        }
        short var127 = 256;
        if (field1424 > 0) {
            for (int var128 = 0; var128 < 256; var128++) {
                if (field1424 > 768) {
                    Statics.field578[var128] = method1513(Statics.field838[var128], Statics.field42[var128], 1024 - field1424);
                } else if (field1424 > 256) {
                    Statics.field578[var128] = Statics.field42[var128];
                } else {
                    Statics.field578[var128] = method1513(Statics.field42[var128], Statics.field838[var128], 256 - field1424);
                }
            }
        } else if (field1421 > 0) {
            for (int var129 = 0; var129 < 256; var129++) {
                if (field1421 > 768) {
                    Statics.field578[var129] = method1513(Statics.field838[var129], Statics.field11[var129], 1024 - field1421);
                } else if (field1421 > 256) {
                    Statics.field578[var129] = Statics.field11[var129];
                } else {
                    Statics.field578[var129] = method1513(Statics.field11[var129], Statics.field838[var129], 256 - field1421);
                }
            }
        } else {
            for (int var130 = 0; var130 < 256; var130++) {
                Statics.field578[var130] = Statics.field838[var130];
            }
        }
        class283.method4679(field1420, 9, field1420 + 128, var127 + 7);
        Statics.field2604.method4795(field1420, 0);
        class283.method4713();
        int var131 = 0;
        int var132 = field1420 + Statics.field276.field3776 * 9;
        for (int var133 = 1; var133 < var127 - 1; var133++) {
            int var134 = (var127 - var133) * field1419[var133] / var127;
            int var135 = var134 + 22;
            if (var135 < 0) {
                var135 = 0;
            }
            var131 += var135;
            for (int var136 = var135; var136 < 128; var136++) {
                int var137 = Statics.field918[var131++];
                if (var137 == 0) {
                    var132++;
                } else {
                    int var139 = 256 - var137;
                    int var140 = Statics.field578[var137];
                    int var141 = Statics.field276.field3778[var132];
                    Statics.field276.field3778[var132++] = ((var140 & 0xFF00) * var137 + (var141 & 0xFF00) * var139 & 0xFF0000) + ((var140 & 0xFF00FF) * var137 + (var141 & 0xFF00FF) * var139 & 0xFF00FF00) >> 8;
                }
            }
            var132 += Statics.field276.field3776 + var135 - 128;
        }
        class283.method4679(field1420 + 765 - 128, 9, field1420 + 765, var127 + 7);
        Statics.field792.method4795(field1420 + 382, 0);
        class283.method4713();
        int var142 = 0;
        int var143 = field1420 + Statics.field276.field3776 * 9 + 24 + 637;
        for (int var144 = 1; var144 < var127 - 1; var144++) {
            int var145 = (var127 - var144) * field1419[var144] / var127;
            int var146 = 103 - var145;
            int var147 = var143 + var145;
            for (int var148 = 0; var148 < var146; var148++) {
                int var149 = Statics.field918[var142++];
                if (var149 == 0) {
                    var147++;
                } else {
                    int var151 = 256 - var149;
                    int var152 = Statics.field578[var149];
                    int var153 = Statics.field276.field3778[var147];
                    Statics.field276.field3778[var147++] = ((var152 & 0xFF00) * var149 + (var153 & 0xFF00) * var151 & 0xFF0000) + ((var152 & 0xFF00FF) * var149 + (var153 & 0xFF00FF) * var151 & 0xFF00FF00) >> 8;
                }
            }
            var142 += 128 - var146;
            var143 = Statics.field276.field3776 - var146 - var145 + var147;
        }
        Statics.field1435[Statics.field355.field1303 ? 1 : 0].method4769(field1420 + 765 - 40, 463);
        if (client.field929 <= 5 || client.field927 != 0) {
            return;
        }
        if (Statics.field817 == null) {
            Statics.field817 = class288.method1049(Statics.field526, "sl_button", "");
            return;
        }
        int var154 = field1420 + 5;
        short var155 = 463;
        byte var156 = 100;
        byte var157 = 35;
        Statics.field817.method4769(var154, var155);
        arg0.method4483(class226.field3022 + " " + client.field1121, var156 / 2 + var154, var157 / 2 + var155 - 2, 16777215, 0);
        if (Statics.field1293 == null) {
            arg1.method4483(class226.field2988, var156 / 2 + var154, var157 / 2 + var155 + 12, 16777215, 0);
        } else {
            arg1.method4483(class226.field3139, var156 / 2 + var154, var157 / 2 + var155 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("k.t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method4(String arg0, String arg1, String arg2) {
        field1411 = arg0;
        field1431 = arg1;
        field1444 = arg2;
    }

    @ObfuscatedName("ha.y(Ljz;I)V")
    public static final void method3862(class286 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field793.length; var2++) {
            Statics.field793[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field793[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field3384[var8] = (Statics.field793[var8 - 1] + Statics.field793[var8 + 1] + Statics.field793[var8 - 128] + Statics.field793[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field793;
            Statics.field793 = Statics.field3384;
            Statics.field3384 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3790; var11++) {
            for (int var12 = 0; var12 < arg0.field3791; var12++) {
                if (arg0.field3789[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3787;
                    int var14 = var11 + 16 + arg0.field3792;
                    int var15 = (var14 << 7) + var13;
                    Statics.field793[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("co.o(IIIS)I")
    public static final int method1513(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("m.i(Lju;Lju;B)V")
    public static void method166(class264 arg0, class264 arg1) {
        if (Statics.field917 == null) {
            Statics.field917 = class288.method588(Statics.field526, "sl_back", "");
        }
        if (Statics.field489 == null) {
            Statics.field489 = class288.method1046(Statics.field526, "sl_flags", "");
        }
        if (Statics.field2432 == null) {
            Statics.field2432 = class288.method1046(Statics.field526, "sl_arrows", "");
        }
        if (Statics.field2215 == null) {
            Statics.field2215 = class288.method1046(Statics.field526, "sl_stars", "");
        }
        class283.method4762(field1420, 23, 765, 480, 0);
        class283.method4692(field1420, 0, 125, 23, 12425273, 9135624);
        class283.method4692(field1420 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4483(class226.field2858, field1420 + 62, 15, 0, -1);
        if (Statics.field2215 != null) {
            Statics.field2215[1].method4769(field1420 + 140, 1);
            arg1.method4480(class226.field3131, field1420 + 152, 10, 16777215, -1);
            Statics.field2215[0].method4769(field1420 + 140, 12);
            arg1.method4480(class226.field2972, field1420 + 152, 21, 16777215, -1);
        }
        if (Statics.field2432 != null) {
            int var2 = field1420 + 280;
            if (class79.field1281[0] == 0 && class79.field1286[0] == 0) {
                Statics.field2432[2].method4769(var2, 4);
            } else {
                Statics.field2432[0].method4769(var2, 4);
            }
            if (class79.field1281[0] == 0 && class79.field1286[0] == 1) {
                Statics.field2432[3].method4769(var2 + 15, 4);
            } else {
                Statics.field2432[1].method4769(var2 + 15, 4);
            }
            arg0.method4480(class226.field3133, var2 + 32, 17, 16777215, -1);
            int var3 = field1420 + 390;
            if (class79.field1281[0] == 1 && class79.field1286[0] == 0) {
                Statics.field2432[2].method4769(var3, 4);
            } else {
                Statics.field2432[0].method4769(var3, 4);
            }
            if (class79.field1281[0] == 1 && class79.field1286[0] == 1) {
                Statics.field2432[3].method4769(var3 + 15, 4);
            } else {
                Statics.field2432[1].method4769(var3 + 15, 4);
            }
            arg0.method4480(class226.field3134, var3 + 32, 17, 16777215, -1);
            int var4 = field1420 + 500;
            if (class79.field1281[0] == 2 && class79.field1286[0] == 0) {
                Statics.field2432[2].method4769(var4, 4);
            } else {
                Statics.field2432[0].method4769(var4, 4);
            }
            if (class79.field1281[0] == 2 && class79.field1286[0] == 1) {
                Statics.field2432[3].method4769(var4 + 15, 4);
            } else {
                Statics.field2432[1].method4769(var4 + 15, 4);
            }
            arg0.method4480(class226.field3135, var4 + 32, 17, 16777215, -1);
            int var5 = field1420 + 610;
            if (class79.field1281[0] == 3 && class79.field1286[0] == 0) {
                Statics.field2432[2].method4769(var5, 4);
            } else {
                Statics.field2432[0].method4769(var5, 4);
            }
            if (class79.field1281[0] == 3 && class79.field1286[0] == 1) {
                Statics.field2432[3].method4769(var5 + 15, 4);
            } else {
                Statics.field2432[1].method4769(var5 + 15, 4);
            }
            arg0.method4480(class226.field2978, var5 + 32, 17, 16777215, -1);
        }
        class283.method4762(field1420 + 708, 4, 50, 16, 0);
        arg1.method4483(class226.field3096, field1420 + 708 + 25, 16, 16777215, -1);
        field1430 = -1;
        if (Statics.field917 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class79.field1284) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class79.field1284) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class79.field1284) {
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
            int var17 = field1420 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class79.field1284; var20++) {
                class79 var21 = Statics.field2110[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1291);
                if (var21.field1291 == -1) {
                    var23 = class226.field2916;
                    var22 = false;
                } else if (var21.field1291 > 1980) {
                    var23 = class226.field3138;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1501()) {
                    if (var21.method1504()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1483()) {
                    var24 = 16711680;
                    if (var21.method1504()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1481()) {
                    if (var21.method1504()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1504()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class60.field746 >= var17 && class60.field747 >= var16 && class60.field746 < var6 + var17 && class60.field747 < var7 + var16 && var22) {
                    field1430 = var20;
                    Statics.field917[var25].method4801(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field917[var25].method4795(var17, var16);
                }
                if (Statics.field489 != null) {
                    Statics.field489[(var21.method1504() ? 8 : 0) + var21.field1294].method4769(var17 + 29, var16);
                }
                arg0.method4483(Integer.toString(var21.field1289), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method4483(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method4552(Statics.field2110[field1430].field1296) + 6;
                int var27 = arg1.field3642 + 8;
                class283.method4762(class60.field746 - var26 / 2, class60.field747 + 20 + 5, var26, var27, 16777120);
                class283.method4698(class60.field746 - var26 / 2, class60.field747 + 20 + 5, var26, var27, 0);
                arg1.method4483(Statics.field2110[field1430].field1296, class60.field746, class60.field747 + 20 + 5 + arg1.field3642 + 4, 0, -1);
            }
        }
        Statics.field276.method753(0, 0);
    }

    @ObfuscatedName("cq.u(Lcg;I)V")
    public static void method1631(class79 arg0) {
        if (arg0.method1504() != client.field925) {
            client.field925 = arg0.method1504();
            boolean var1 = arg0.method1504();
            if (Statics.field617 != var1) {
                class257.field3493.method3345();
                class257.field3494.method3345();
                class257.field3510.method3345();
                Statics.field617 = var1;
            }
        }
        Statics.field703 = arg0.field1292;
        client.field1121 = arg0.field1289;
        client.field955 = arg0.field1290;
        Statics.field2024 = client.field923 == 0 ? 43594 : arg0.field1289 + 40000;
        Statics.field1632 = client.field923 == 0 ? 443 : arg0.field1289 + 50000;
        Statics.field327 = Statics.field2024;
    }
}

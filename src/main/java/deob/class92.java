package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cb")
public class class92 {

    @ObfuscatedName("cb.j")
    public static int field1436 = 0;

    @ObfuscatedName("cb.u")
    public static int field1441 = field1436 + 202;

    @ObfuscatedName("cb.m")
    public static int[] field1435 = new int[256];

    @ObfuscatedName("cb.w")
    public static int field1443 = 0;

    @ObfuscatedName("cb.ar")
    public static int field1449 = 0;

    @ObfuscatedName("cb.ab")
    public static int field1442 = 0;

    @ObfuscatedName("cb.am")
    public static int field1459 = 0;

    @ObfuscatedName("cb.aq")
    public static int field1447 = 0;

    @ObfuscatedName("cb.at")
    public static int field1451 = 0;

    @ObfuscatedName("cb.az")
    public static int field1461 = 10;

    @ObfuscatedName("cb.ac")
    public static String field1450 = "";

    @ObfuscatedName("cb.aa")
    public static int field1445 = 0;

    @ObfuscatedName("cb.aj")
    public static String field1452 = "";

    @ObfuscatedName("cb.ay")
    public static String field1453 = "";

    @ObfuscatedName("cb.av")
    public static String field1454 = "";

    @ObfuscatedName("cb.ao")
    public static String field1446 = "";

    @ObfuscatedName("cb.aw")
    public static String field1456 = "";

    @ObfuscatedName("cb.ah")
    public static String field1457 = "";

    @ObfuscatedName("cb.an")
    public static boolean field1458 = false;

    @ObfuscatedName("cb.au")
    public static boolean field1439 = false;

    @ObfuscatedName("cb.bp")
    public static boolean field1460 = false;

    @ObfuscatedName("cb.bc")
    public static boolean field1448 = true;

    @ObfuscatedName("cb.bv")
    public static int field1462 = 0;

    @ObfuscatedName("cb.bw")
    public static String field1463 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cb.bx")
    public static String field1464 = "1234567890";

    @ObfuscatedName("cb.by")
    public static boolean field1455 = false;

    @ObfuscatedName("cb.bn")
    public static int field1466 = -1;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.i(Lii;Lii;S)I")
    public static int method132(class237 arg0, class237 arg1) {
        int var2 = 0;
        if (arg0.method3844("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3844("logo", "")) {
            var2++;
        }
        if (arg1.method3844("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3844("titlebox", "")) {
            var2++;
        }
        if (arg1.method3844("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3844("runes", "")) {
            var2++;
        }
        if (arg1.method3844("title_mute", "")) {
            var2++;
        }
        if (arg1.method3844("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3844("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method3844("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method3844("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method3844("sl_back", "");
        arg1.method3844("sl_flags", "");
        arg1.method3844("sl_arrows", "");
        arg1.method3844("sl_stars", "");
        arg1.method3844("sl_button", "");
        return var2;
    }

    @ObfuscatedName("cb.j(Lii;Lii;ZII)V")
    public static void method1609(class237 arg0, class237 arg1, boolean arg2, int arg3) {
        if (!Statics.field1444) {
            field1445 = arg3;
            class283.method4553();
            byte[] var4 = arg0.method3843("title.jpg", "");
            Statics.field337 = class55.method173(var4);
            Statics.field1406 = Statics.field337.method4724();
            if ((client.field943 & 0x20000000) == 0) {
                Statics.field586 = Statics.method1074(arg1, "logo", "");
            } else {
                Statics.field586 = Statics.method1074(arg1, "logo_deadman_mode", "");
            }
            Statics.field1465 = Statics.method1074(arg1, "titlebox", "");
            Statics.field318 = Statics.method1074(arg1, "titlebutton", "");
            Statics.field1438 = class288.method2704(arg1, "runes", "");
            Statics.field1437 = class288.method2704(arg1, "title_mute", "");
            Statics.field3625 = Statics.method1074(arg1, "options_radio_buttons,0", "");
            Statics.field410 = Statics.method1074(arg1, "options_radio_buttons,4", "");
            Statics.field1791 = Statics.method1074(arg1, "options_radio_buttons,2", "");
            Statics.field1440 = Statics.method1074(arg1, "options_radio_buttons,6", "");
            Statics.field1392 = Statics.field3625.field3777;
            Statics.field434 = Statics.field3625.field3782;
            Statics.field1380 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field1380[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1380[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1380[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1380[var8 + 192] = 16777215;
            }
            Statics.field2847 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field2847[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2847[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2847[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2847[var12 + 192] = 16777215;
            }
            Statics.field533 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field533[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field533[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field533[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field533[var16 + 192] = 16777215;
            }
            Statics.field1341 = new int[256];
            Statics.field1342 = new int[32768];
            Statics.field336 = new int[32768];
            Statics.method1905((class286) null);
            Statics.field2616 = new int[32768];
            Statics.field38 = new int[32768];
            if (arg2) {
                field1456 = "";
                field1457 = "";
            }
            Statics.field1876 = 0;
            Statics.field283 = "";
            field1448 = true;
            field1455 = false;
            if (Statics.field2396.field1318) {
                class205.method2963(2);
            } else {
                class239 var17 = Statics.field601;
                int var18 = var17.method3840("scape main");
                int var19 = var17.method3841(var18, "");
                class205.method647(2, var17, var18, var19, 255, false);
            }
            class240.method146(false);
            Statics.field1444 = true;
            field1436 = (Statics.field1467 - 765) / 2;
            field1441 = field1436 + 202;
            Statics.field875 = field1441 + 180;
            Statics.field337.method4671(field1436, 0);
            Statics.field1406.method4671(field1436 + 382, 0);
            Statics.field586.method4637(field1436 + 382 - Statics.field586.field3777 / 2, 18);
        } else if (arg3 == 4) {
            field1445 = 4;
        }
    }

    @ObfuscatedName("an.a(I)Ljava/lang/String;")
    public static String method570() {
        return Statics.field2396.field1321 ? class272.method4377(field1456) : field1456;
    }

    @ObfuscatedName("av.r(I)V")
    public static void method510() {
        if (field1458 && field1456 != null && field1456.length() > 0) {
            field1462 = 1;
        } else {
            field1462 = 0;
        }
    }

    @ObfuscatedName("hz.o(Lbx;B)V")
    public static void method3803(class59 arg0) {
        if (field1455) {
            method956(arg0);
            return;
        }
        if ((class60.field755 == 1 || !Statics.field952 && class60.field755 == 4) && class60.field754 >= field1436 + 765 - 50 && class60.field740 >= 453) {
            Statics.field2396.field1318 = !Statics.field2396.field1318;
            class81.method163();
            if (Statics.field2396.field1318) {
                class205.method2905();
            } else {
                class239 var1 = Statics.field601;
                int var2 = var1.method3840("scape main");
                int var3 = var1.method3841(var2, "");
                class205.method2134(var1, var2, var3, 255, false);
            }
        }
        if (client.field948 == 5) {
            return;
        }
        field1447++;
        if (client.field948 != 10 && client.field948 != 11) {
            return;
        }
        if (client.field950 == 0) {
            if (class60.field755 == 1 || !Statics.field952 && class60.field755 == 4) {
                int var4 = field1436 + 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class60.field754 >= var4 && class60.field754 <= var4 + var6 && class60.field740 >= var5 && class60.field740 <= var5 + var7) {
                    method95();
                    return;
                }
            }
            if (Statics.field897 != null) {
                method95();
            }
        }
        int var8 = class60.field755;
        int var9 = class60.field754;
        int var10 = class60.field740;
        if (var8 == 0) {
            var9 = class60.field753;
            var10 = class60.field748;
        }
        if (!Statics.field952 && var8 == 4) {
            var8 = 1;
        }
        if (field1445 == 0) {
            boolean var11 = false;
            while (class51.method162()) {
                if (Statics.field2494 == 84) {
                    var11 = true;
                }
            }
            int var12 = Statics.field875 - 80;
            short var13 = 291;
            if (var8 == 1 && var9 >= var12 - 75 && var9 <= var12 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20) {
                class57.method476(Statics.method1565("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var14 = Statics.field875 + 80;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var13 - 20 && var10 <= var13 + 20 || var11) {
                if ((client.field943 & 0x2000000) != 0) {
                    field1452 = "";
                    field1453 = class227.field3083;
                    field1454 = class227.field3017;
                    field1446 = class227.field3085;
                    field1445 = 1;
                    method510();
                } else if ((client.field943 & 0x4) != 0) {
                    if ((client.field943 & 0x400) == 0) {
                        field1453 = class227.field3053;
                        field1454 = class227.field3075;
                        field1446 = class227.field2935;
                    } else {
                        field1453 = class227.field3080;
                        field1454 = class227.field3081;
                        field1446 = class227.field3082;
                    }
                    field1452 = class227.field3073;
                    field1445 = 1;
                    method510();
                } else if ((client.field943 & 0x400) == 0) {
                    method508(false);
                } else {
                    field1453 = class227.field2893;
                    field1454 = class227.field3078;
                    field1446 = class227.field3079;
                    field1452 = class227.field3073;
                    field1445 = 1;
                    method510();
                }
            }
        } else if (field1445 == 1) {
            while (class51.method162()) {
                if (Statics.field2494 == 84) {
                    method508(false);
                } else if (Statics.field2494 == 13) {
                    field1445 = 0;
                }
            }
            int var15 = Statics.field875 - 80;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                method508(false);
            }
            int var17 = Statics.field875 + 80;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field1445 = 0;
            }
        } else if (field1445 == 2) {
            short var18 = 201;
            int var42 = var18 + 52;
            if (var8 == 1 && var10 >= var42 - 12 && var10 < var42 + 2) {
                field1462 = 0;
            }
            var42 += 15;
            if (var8 == 1 && var10 >= var42 - 12 && var10 < var42 + 2) {
                field1462 = 1;
            }
            var42 += 15;
            short var19 = 361;
            if (var8 == 1 && var10 >= var19 - 15 && var10 < var19) {
                method3813(class227.field3055, class227.field2928, class227.field3018);
                field1445 = 5;
                return;
            }
            int var20 = Statics.field875 - 80;
            short var21 = 321;
            if (var8 == 1 && var9 >= var20 - 75 && var9 <= var20 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field1456 = field1456.trim();
                if (field1456.length() == 0) {
                    method3813(class227.field2976, class227.field2963, class227.field2978);
                    return;
                }
                if (field1457.length() == 0) {
                    method3813(class227.field2979, class227.field3109, class227.field2873);
                    return;
                }
                method3813(class227.field3006, class227.field3089, class227.field3090);
                client.method1477(false);
                client.method492(20);
                return;
            }
            int var22 = field1441 + 180 + 80;
            if (var8 == 1 && var9 >= var22 - 75 && var9 <= var22 + 75 && var10 >= var21 - 20 && var10 <= var21 + 20) {
                field1445 = 0;
                field1456 = "";
                field1457 = "";
                Statics.field1876 = 0;
                Statics.field283 = "";
                field1448 = true;
            }
            int var23 = Statics.field875 + -117;
            field1439 = var9 >= var23 && var9 < Statics.field1392 + var23 && var10 >= 277 && var10 < Statics.field434 + 277;
            if (var8 == 1 && field1439) {
                field1458 = !field1458;
                if (!field1458 && Statics.field2396.field1320 != null) {
                    Statics.field2396.field1320 = null;
                    class81.method163();
                }
            }
            int var24 = Statics.field875 + 24;
            field1460 = var9 >= var24 && var9 < Statics.field1392 + var24 && var10 >= 277 && var10 < Statics.field434 + 277;
            if (var8 == 1 && field1460) {
                Statics.field2396.field1321 = !Statics.field2396.field1321;
                if (!Statics.field2396.field1321) {
                    field1456 = "";
                    Statics.field2396.field1320 = null;
                    method510();
                }
                class81.method163();
            }
            while (true) {
                while (class51.method162()) {
                    boolean var25 = false;
                    for (int var26 = 0; var26 < field1463.length(); var26++) {
                        if (Statics.field445 == field1463.charAt(var26)) {
                            var25 = true;
                            break;
                        }
                    }
                    if (Statics.field2494 == 13) {
                        field1445 = 0;
                        field1456 = "";
                        field1457 = "";
                        Statics.field1876 = 0;
                        Statics.field283 = "";
                        field1448 = true;
                    } else if (field1462 == 0) {
                        if (Statics.field2494 == 85 && field1456.length() > 0) {
                            field1456 = field1456.substring(0, field1456.length() - 1);
                        }
                        if (Statics.field2494 == 84 || Statics.field2494 == 80) {
                            field1462 = 1;
                        }
                        if (var25 && field1456.length() < 320) {
                            field1456 = field1456 + Statics.field445;
                        }
                    } else if (field1462 == 1) {
                        if (Statics.field2494 == 85 && field1457.length() > 0) {
                            field1457 = field1457.substring(0, field1457.length() - 1);
                        }
                        if (Statics.field2494 == 84 || Statics.field2494 == 80) {
                            field1462 = 0;
                        }
                        if (Statics.field2494 == 84) {
                            field1456 = field1456.trim();
                            if (field1456.length() == 0) {
                                method3813(class227.field2976, class227.field2963, class227.field2978);
                                return;
                            }
                            if (field1457.length() == 0) {
                                method3813(class227.field2979, class227.field3109, class227.field2873);
                                return;
                            }
                            method3813(class227.field3006, class227.field3089, class227.field3090);
                            client.method1477(false);
                            client.method492(20);
                            return;
                        }
                        if (var25 && field1457.length() < 20) {
                            field1457 = field1457 + Statics.field445;
                        }
                    }
                }
                return;
            }
        } else if (field1445 == 3) {
            int var27 = field1441 + 180;
            short var28 = 276;
            if (var8 == 1 && var9 >= var27 - 75 && var9 <= var27 + 75 && var10 >= var28 - 20 && var10 <= var28 + 20) {
                method508(false);
            }
            int var29 = field1441 + 180;
            short var30 = 326;
            if (var8 == 1 && var9 >= var29 - 75 && var9 <= var29 + 75 && var10 >= var30 - 20 && var10 <= var30 + 20) {
                method3813(class227.field3055, class227.field2928, class227.field3018);
                field1445 = 5;
                return;
            }
        } else if (field1445 == 4) {
            int var31 = field1441 + 180 - 80;
            short var32 = 321;
            if (var8 == 1 && var9 >= var31 - 75 && var9 <= var31 + 75 && var10 >= var32 - 20 && var10 <= var32 + 20) {
                Statics.field283.trim();
                if (Statics.field283.length() != 6) {
                    method3813(class227.field2895, class227.field3100, class227.field2897);
                    return;
                }
                Statics.field1876 = Integer.parseInt(Statics.field283);
                Statics.field283 = "";
                client.method1477(true);
                method3813(class227.field3006, class227.field3089, class227.field3090);
                client.method492(20);
                return;
            }
            if (var8 == 1 && var9 >= field1441 + 180 - 9 && var9 <= field1441 + 180 + 130 && var10 >= 263 && var10 <= 296) {
                field1448 = !field1448;
            }
            if (var8 == 1 && var9 >= field1441 + 180 - 34 && var9 <= field1441 + 180 + 34 && var10 >= 351 && var10 <= 363) {
                class57.method476(Statics.method1565("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var33 = field1441 + 180 + 80;
            if (var8 == 1 && var9 >= var33 - 75 && var9 <= var33 + 75 && var10 >= var32 - 20 && var10 <= var32 + 20) {
                field1445 = 0;
                field1456 = "";
                field1457 = "";
                Statics.field1876 = 0;
                Statics.field283 = "";
            }
            while (class51.method162()) {
                boolean var34 = false;
                for (int var35 = 0; var35 < field1464.length(); var35++) {
                    if (Statics.field445 == field1464.charAt(var35)) {
                        var34 = true;
                        break;
                    }
                }
                if (Statics.field2494 == 13) {
                    field1445 = 0;
                    field1456 = "";
                    field1457 = "";
                    Statics.field1876 = 0;
                    Statics.field283 = "";
                } else {
                    if (Statics.field2494 == 85 && Statics.field283.length() > 0) {
                        Statics.field283 = Statics.field283.substring(0, Statics.field283.length() - 1);
                    }
                    if (Statics.field2494 == 84) {
                        Statics.field283.trim();
                        if (Statics.field283.length() != 6) {
                            method3813(class227.field2895, class227.field3100, class227.field2897);
                            return;
                        }
                        Statics.field1876 = Integer.parseInt(Statics.field283);
                        Statics.field283 = "";
                        client.method1477(true);
                        method3813(class227.field3006, class227.field3089, class227.field3090);
                        client.method492(20);
                        return;
                    }
                    if (var34 && Statics.field283.length() < 6) {
                        Statics.field283 = Statics.field283 + Statics.field445;
                    }
                }
            }
        } else if (field1445 == 5) {
            int var36 = field1441 + 180 - 80;
            short var37 = 321;
            if (var8 == 1 && var9 >= var36 - 75 && var9 <= var36 + 75 && var10 >= var37 - 20 && var10 <= var37 + 20) {
                method2501();
                return;
            }
            int var38 = field1441 + 180 + 80;
            if (var8 == 1 && var9 >= var38 - 75 && var9 <= var38 + 75 && var10 >= var37 - 20 && var10 <= var37 + 20) {
                method508(true);
            }
            while (class51.method162()) {
                boolean var39 = false;
                for (int var40 = 0; var40 < field1463.length(); var40++) {
                    if (Statics.field445 == field1463.charAt(var40)) {
                        var39 = true;
                        break;
                    }
                }
                if (Statics.field2494 == 13) {
                    method508(true);
                } else {
                    if (Statics.field2494 == 85 && field1456.length() > 0) {
                        field1456 = field1456.substring(0, field1456.length() - 1);
                    }
                    if (Statics.field2494 == 84) {
                        method2501();
                        return;
                    }
                    if (var39 && field1456.length() < 320) {
                        field1456 = field1456 + Statics.field445;
                    }
                }
            }
        } else if (field1445 == 6) {
            while (true) {
                do {
                    if (!class51.method162()) {
                        short var41 = 321;
                        if (var8 == 1 && var10 >= var41 - 20 && var10 <= var41 + 20) {
                            method508(true);
                        }
                        return;
                    }
                } while (Statics.field2494 != 84 && Statics.field2494 != 13);
                method508(true);
            }
        }
    }

    @ObfuscatedName("ay.n(ZI)V")
    public static void method508(boolean arg0) {
        field1453 = class227.field3105;
        field1454 = class227.field3071;
        field1446 = class227.field3072;
        field1445 = 2;
        if (arg0) {
            field1457 = "";
        }
        if (field1456 == null || field1456.length() <= 0) {
            if (Statics.field2396.field1320 == null) {
                field1458 = false;
            } else {
                field1456 = Statics.field2396.field1320;
                field1458 = true;
            }
        }
        method510();
    }

    @ObfuscatedName("ed.q(B)V")
    public static void method2501() {
        field1456 = field1456.trim();
        if (field1456.length() == 0) {
            method3813(class227.field3055, class227.field2928, class227.field3018);
            return;
        }
        long var0 = class87.method2502();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1456;
            Random var4 = new Random();
            class175 var5 = new class175(128);
            class175 var6 = new class175(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method3102(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method3136(var4.nextInt());
            }
            var5.method3136(var7[0]);
            var5.method3136(var7[1]);
            var5.method2982(var0);
            var5.method2982(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method3136(var4.nextInt());
            }
            var5.method3171(class87.field1388, class87.field1384);
            var6.method3102(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method3136(var4.nextInt());
            }
            var6.method2982(var4.nextLong());
            var6.method3047(var4.nextLong());
            if (client.field980 == null) {
                byte[] var11 = class157.method3784();
                var6.method2987(var11, 0, var11.length);
            } else {
                var6.method2987(client.field980, 0, client.field980.length);
            }
            var6.method2982(var4.nextLong());
            var6.method3171(class87.field1388, class87.field1384);
            int var12 = class175.method1055(var3);
            if (var12 % 8 != 0) {
                var12 += 8 - var12 % 8;
            }
            class175 var13 = new class175(var12);
            var13.method2984(var3);
            var13.field2395 = var12;
            var13.method3011(var7);
            class175 var14 = new class175(var13.field2395 + var6.field2395 + var5.field2395 + 5);
            var14.method3102(2);
            var14.method3102(var5.field2395);
            var14.method2987(var5.field2392, 0, var5.field2395);
            var14.method3102(var6.field2395);
            var14.method2987(var6.field2392, 0, var6.field2395);
            var14.method2978(var13.field2395);
            var14.method2987(var13.field2392, 0, var13.field2395);
            byte[] var15 = var14.field2392;
            int var16 = var15.length;
            StringBuilder var17 = new StringBuilder();
            for (int var18 = 0; var18 < var16; var18 += 3) {
                int var19 = var15[var18] & 0xFF;
                var17.append(class271.field3676[var19 >>> 2]);
                if (var18 < var16 - 1) {
                    int var20 = var15[var18 + 1] & 0xFF;
                    var17.append(class271.field3676[(var19 & 0x3) << 4 | var20 >>> 4]);
                    if (var18 < var16 - 2) {
                        int var21 = var15[var18 + 2] & 0xFF;
                        var17.append(class271.field3676[(var20 & 0xF) << 2 | var21 >>> 6]).append(class271.field3676[var21 & 0x3F]);
                    } else {
                        var17.append(class271.field3676[(var20 & 0xF) << 2]).append("=");
                    }
                } else {
                    var17.append(class271.field3676[(var19 & 0x3) << 4]).append("==");
                }
            }
            String var22 = var17.toString();
            String var24 = var22;
            byte var31;
            try {
                URL var25 = new URL(Statics.method1565("services", false) + "m=accountappeal/login.ws");
                URLConnection var26 = var25.openConnection();
                var26.setDoInput(true);
                var26.setDoOutput(true);
                var26.setConnectTimeout(5000);
                OutputStreamWriter var27 = new OutputStreamWriter(var26.getOutputStream());
                var27.write("data2=" + class295.method1384(var24) + "&dest=" + class295.method1384("passwordchoice.ws"));
                var27.flush();
                InputStream var28 = var26.getInputStream();
                class175 var29 = new class175(new byte[1000]);
                while (true) {
                    int var30 = var28.read(var29.field2392, var29.field2395, 1000 - var29.field2395);
                    if (var30 == -1) {
                        var27.close();
                        var28.close();
                        String var32 = new String(var29.field2392);
                        if (var32.startsWith("OFFLINE")) {
                            var31 = 4;
                        } else if (var32.startsWith("WRONG")) {
                            var31 = 7;
                        } else if (var32.startsWith("RELOAD")) {
                            var31 = 3;
                        } else if (var32.startsWith("Not permitted for social network accounts.")) {
                            var31 = 6;
                        } else {
                            var29.method3042(var7);
                            while (var29.field2395 > 0 && var29.field2392[var29.field2395 - 1] == 0) {
                                var29.field2395--;
                            }
                            String var33 = new String(var29.field2392, 0, var29.field2395);
                            boolean var34;
                            if (var33 == null) {
                                var34 = false;
                            } else {
                                label108: {
                                    try {
                                        new URL(var33);
                                    } catch (MalformedURLException var37) {
                                        var34 = false;
                                        break label108;
                                    }
                                    var34 = true;
                                }
                            }
                            if (var34) {
                                class57.method476(var33, true, false);
                                var31 = 2;
                            } else {
                                var31 = 5;
                            }
                        }
                        break;
                    }
                    var29.field2395 += var30;
                    if (var29.field2395 >= 1000) {
                        var31 = 5;
                        break;
                    }
                }
            } catch (Throwable var38) {
                var38.printStackTrace();
                var31 = 5;
            }
            var2 = var31;
        }
        switch(var2) {
            case 2:
                method3813(class227.field3114, class227.field3115, class227.field3116);
                field1445 = 6;
                break;
            case 3:
                method3813(class227.field3117, class227.field3013, class227.field3119);
                break;
            case 4:
                method3813(class227.field3120, class227.field3118, class227.field2980);
                break;
            case 5:
                method3813(class227.field3123, class227.field3124, class227.field3125);
                break;
            case 6:
                method3813(class227.field3126, class227.field3098, class227.field3128);
                break;
            case 7:
                method3813(class227.field2998, class227.field2930, class227.field3131);
        }
    }

    @ObfuscatedName("dx.b(Ljm;Ljm;Ljm;ZI)V")
    public static void method1900(class265 arg0, class265 arg1, class265 arg2, boolean arg3) {
        if (arg3) {
            field1436 = (Statics.field1467 - 765) / 2;
            field1441 = field1436 + 202;
            Statics.field875 = field1441 + 180;
        }
        if (field1455) {
            if (Statics.field573 == null) {
                Statics.field573 = class288.method49(Statics.field307, "sl_back", "");
            }
            if (Statics.field1550 == null) {
                Statics.field1550 = class288.method2704(Statics.field307, "sl_flags", "");
            }
            if (Statics.field384 == null) {
                Statics.field384 = class288.method2704(Statics.field307, "sl_arrows", "");
            }
            if (Statics.field896 == null) {
                Statics.field896 = class288.method2704(Statics.field307, "sl_stars", "");
            }
            class283.method4557(field1436, 23, 765, 480, 0);
            class283.method4552(field1436, 0, 125, 23, 12425273, 9135624);
            class283.method4552(field1436 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method4423(class227.field3132, field1436 + 62, 15, 0, -1);
            if (Statics.field896 != null) {
                Statics.field896[1].method4637(field1436 + 140, 1);
                arg1.method4440(class227.field3133, field1436 + 152, 10, 16777215, -1);
                Statics.field896[0].method4637(field1436 + 140, 12);
                arg1.method4440(class227.field3134, field1436 + 152, 21, 16777215, -1);
            }
            if (Statics.field384 != null) {
                int var4 = field1436 + 280;
                if (class80.field1304[0] == 0 && class80.field1303[0] == 0) {
                    Statics.field384[2].method4637(var4, 4);
                } else {
                    Statics.field384[0].method4637(var4, 4);
                }
                if (class80.field1304[0] == 0 && class80.field1303[0] == 1) {
                    Statics.field384[3].method4637(var4 + 15, 4);
                } else {
                    Statics.field384[1].method4637(var4 + 15, 4);
                }
                arg0.method4440(class227.field3088, var4 + 32, 17, 16777215, -1);
                int var5 = field1436 + 390;
                if (class80.field1304[0] == 1 && class80.field1303[0] == 0) {
                    Statics.field384[2].method4637(var5, 4);
                } else {
                    Statics.field384[0].method4637(var5, 4);
                }
                if (class80.field1304[0] == 1 && class80.field1303[0] == 1) {
                    Statics.field384[3].method4637(var5 + 15, 4);
                } else {
                    Statics.field384[1].method4637(var5 + 15, 4);
                }
                arg0.method4440(class227.field3136, var5 + 32, 17, 16777215, -1);
                int var6 = field1436 + 500;
                if (class80.field1304[0] == 2 && class80.field1303[0] == 0) {
                    Statics.field384[2].method4637(var6, 4);
                } else {
                    Statics.field384[0].method4637(var6, 4);
                }
                if (class80.field1304[0] == 2 && class80.field1303[0] == 1) {
                    Statics.field384[3].method4637(var6 + 15, 4);
                } else {
                    Statics.field384[1].method4637(var6 + 15, 4);
                }
                arg0.method4440(class227.field2995, var6 + 32, 17, 16777215, -1);
                int var7 = field1436 + 610;
                if (class80.field1304[0] == 3 && class80.field1303[0] == 0) {
                    Statics.field384[2].method4637(var7, 4);
                } else {
                    Statics.field384[0].method4637(var7, 4);
                }
                if (class80.field1304[0] == 3 && class80.field1303[0] == 1) {
                    Statics.field384[3].method4637(var7 + 15, 4);
                } else {
                    Statics.field384[1].method4637(var7 + 15, 4);
                }
                arg0.method4440(class227.field3138, var7 + 32, 17, 16777215, -1);
            }
            class283.method4557(field1436 + 708, 4, 50, 16, 0);
            arg1.method4423(class227.field2946, field1436 + 708 + 25, 16, 16777215, -1);
            field1466 = -1;
            if (Statics.field573 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class80.field1309) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class80.field1309) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class80.field1309) {
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
                for (int var22 = 0; var22 < class80.field1309; var22++) {
                    class80 var23 = Statics.field1301[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field1307);
                    if (var23.field1307 == -1) {
                        var25 = class227.field3139;
                        var24 = false;
                    } else if (var23.field1307 > 1980) {
                        var25 = class227.field3004;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method1413()) {
                        if (var23.method1412()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method1416()) {
                        var26 = 16711680;
                        if (var23.method1412()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method1414()) {
                        if (var23.method1412()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method1412()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class60.field753 >= var19 && class60.field748 >= var18 && class60.field753 < var8 + var19 && class60.field748 < var9 + var18 && var24) {
                        field1466 = var22;
                        Statics.field573[var27].method4677(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field573[var27].method4671(var19, var18);
                    }
                    if (Statics.field1550 != null) {
                        Statics.field1550[(var23.method1412() ? 8 : 0) + var23.field1310].method4637(var19 + 29, var18);
                    }
                    arg0.method4423(Integer.toString(var23.field1300), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method4423(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method4442(Statics.field1301[field1466].field1297) + 6;
                    int var29 = arg1.field3637 + 8;
                    class283.method4557(class60.field753 - var28 / 2, class60.field748 + 20 + 5, var28, var29, 16777120);
                    class283.method4588(class60.field753 - var28 / 2, class60.field748 + 20 + 5, var28, var29, 0);
                    arg1.method4423(Statics.field1301[field1466].field1297, class60.field753, class60.field748 + 20 + 5 + arg1.field3637 + 4, 0, -1);
                }
            }
            Statics.field343.method760(0, 0);
            return;
        }
        if (arg3) {
            Statics.field337.method4671(field1436, 0);
            Statics.field1406.method4671(field1436 + 382, 0);
            Statics.field586.method4637(field1436 + 382 - Statics.field586.field3777 / 2, 18);
        }
        if (client.field948 == 0 || client.field948 == 5) {
            byte var30 = 20;
            arg0.method4423(class227.field3069, field1441 + 180, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class283.method4588(field1441 + 180 - 152, var31, 304, 34, 9179409);
            class283.method4588(field1441 + 180 - 151, var31 + 1, 302, 32, 0);
            class283.method4557(field1441 + 180 - 150, var31 + 2, field1461 * 3, 30, 9179409);
            class283.method4557(field1461 * 3 + (field1441 + 180 - 150), var31 + 2, 300 - field1461 * 3, 30, 0);
            arg0.method4423(field1450, field1441 + 180, 276 - var30, 16777215, -1);
        }
        if (client.field948 == 20) {
            Statics.field1465.method4637(field1441 + 180 - Statics.field1465.field3777 / 2, 271 - Statics.field1465.field3782 / 2);
            short var32 = 201;
            arg0.method4423(field1453, field1441 + 180, var32, 16776960, 0);
            int var115 = var32 + 15;
            arg0.method4423(field1454, field1441 + 180, var115, 16776960, 0);
            int var116 = var115 + 15;
            arg0.method4423(field1446, field1441 + 180, var116, 16776960, 0);
            int var117 = var116 + 15;
            int var118 = var117 + 7;
            if (field1445 != 4) {
                arg0.method4440(class227.field3104, field1441 + 180 - 110, var118, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = method570(); arg0.method4442(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method4440(class266.method4463(var34), field1441 + 180 - 70, var118, 16777215, 0);
                var115 = var118 + 15;
                arg0.method4440(class227.field3092 + class272.method4377(field1457), field1441 + 180 - 108, var115, 16777215, 0);
                var115 += 15;
            }
        }
        if (client.field948 == 10 || client.field948 == 11) {
            Statics.field1465.method4637(field1441, 171);
            if (field1445 == 0) {
                short var35 = 251;
                arg0.method4423(class227.field2921, field1441 + 180, var35, 16776960, 0);
                int var119 = var35 + 30;
                int var36 = field1441 + 180 - 80;
                short var37 = 291;
                Statics.field318.method4637(var36 - 73, var37 - 20);
                arg0.method4456(class227.field2902, var36 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var38 = field1441 + 180 + 80;
                Statics.field318.method4637(var38 - 73, var37 - 20);
                arg0.method4456(class227.field3096, var38 - 73, var37 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1445 == 1) {
                arg0.method4423(field1452, field1441 + 180, 201, 16776960, 0);
                short var39 = 236;
                arg0.method4423(field1453, field1441 + 180, var39, 16777215, 0);
                int var120 = var39 + 15;
                arg0.method4423(field1454, field1441 + 180, var120, 16777215, 0);
                int var121 = var120 + 15;
                arg0.method4423(field1446, field1441 + 180, var121, 16777215, 0);
                int var122 = var121 + 15;
                int var40 = field1441 + 180 - 80;
                short var41 = 321;
                Statics.field318.method4637(var40 - 73, var41 - 20);
                arg0.method4423(class227.field3039, var40, var41 + 5, 16777215, 0);
                int var42 = field1441 + 180 + 80;
                Statics.field318.method4637(var42 - 73, var41 - 20);
                arg0.method4423(class227.field2946, var42, var41 + 5, 16777215, 0);
            } else if (field1445 == 2) {
                short var43 = 201;
                arg0.method4423(field1453, Statics.field875, var43, 16776960, 0);
                int var123 = var43 + 15;
                arg0.method4423(field1454, Statics.field875, var123, 16776960, 0);
                int var124 = var123 + 15;
                arg0.method4423(field1446, Statics.field875, var124, 16776960, 0);
                int var125 = var124 + 15;
                int var126 = var125 + 7;
                arg0.method4440(class227.field3104, Statics.field875 - 110, var126, 16777215, 0);
                short var44 = 200;
                String var45;
                for (var45 = method570(); arg0.method4442(var45) > var44; var45 = var45.substring(1)) {
                }
                arg0.method4440(class266.method4463(var45) + (field1462 == 0 & client.field973 % 40 < 20 ? class88.method1003(16776960) + class88.field1396 : ""), Statics.field875 - 70, var126, 16777215, 0);
                var123 = var126 + 15;
                arg0.method4440(class227.field3092 + class272.method4377(field1457) + (field1462 == 1 & client.field973 % 40 < 20 ? class88.method1003(16776960) + class88.field1396 : ""), Statics.field875 - 108, var123, 16777215, 0);
                var123 += 15;
                short var46 = 277;
                int var47 = Statics.field875 + -117;
                boolean var48 = field1458;
                boolean var49 = field1439;
                class286 var50 = var48 ? (var49 ? Statics.field1440 : Statics.field1791) : (var49 ? Statics.field410 : Statics.field3625);
                var50.method4637(var47, 277);
                int var52 = var50.field3777 + 5 + var47;
                arg1.method4440(class227.field2904, var52, var46 + 13, 16776960, 0);
                int var53 = Statics.field875 + 24;
                boolean var54 = Statics.field2396.field1321;
                boolean var55 = field1460;
                class286 var56 = var54 ? (var55 ? Statics.field1440 : Statics.field1791) : (var55 ? Statics.field410 : Statics.field3625);
                var56.method4637(var53, 277);
                int var58 = var56.field3777 + 5 + var53;
                arg1.method4440(class227.field2922, var58, var46 + 13, 16776960, 0);
                int var127 = var46 + 15;
                int var59 = Statics.field875 - 80;
                short var60 = 321;
                Statics.field318.method4637(var59 - 73, var60 - 20);
                arg0.method4423(class227.field2865, var59, var60 + 5, 16777215, 0);
                int var61 = Statics.field875 + 80;
                Statics.field318.method4637(var61 - 73, var60 - 20);
                arg0.method4423(class227.field2946, var61, var60 + 5, 16777215, 0);
                short var62 = 357;
                arg1.method4423(class227.field3106, Statics.field875, var62, 16776960, 0);
            } else if (field1445 == 3) {
                short var63 = 201;
                arg0.method4423(class227.field3129, field1441 + 180, var63, 16776960, 0);
                int var128 = var63 + 20;
                arg1.method4423(class227.field3102, field1441 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg1.method4423(class227.field3103, field1441 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var64 = field1441 + 180;
                short var65 = 276;
                Statics.field318.method4637(var64 - 73, var65 - 20);
                arg2.method4423(class227.field3110, var64, var65 + 5, 16777215, 0);
                int var66 = field1441 + 180;
                short var67 = 326;
                Statics.field318.method4637(var66 - 73, var67 - 20);
                arg2.method4423(class227.field2884, var66, var67 + 5, 16777215, 0);
            } else if (field1445 == 4) {
                arg0.method4423(class227.field3086, field1441 + 180, 201, 16776960, 0);
                short var68 = 236;
                arg0.method4423(field1453, field1441 + 180, var68, 16777215, 0);
                int var131 = var68 + 15;
                arg0.method4423(field1454, field1441 + 180, var131, 16777215, 0);
                int var132 = var131 + 15;
                arg0.method4423(field1446, field1441 + 180, var132, 16777215, 0);
                int var133 = var132 + 15;
                arg0.method4440(class227.field2891 + class272.method4377(Statics.field283) + (client.field973 % 40 < 20 ? class88.method1003(16776960) + class88.field1396 : ""), field1441 + 180 - 108, var133, 16777215, 0);
                int var134 = var133 - 8;
                arg0.method4440(class227.field3000, field1441 + 180 - 9, var134, 16776960, 0);
                int var135 = var134 + 15;
                arg0.method4440(class227.field2868, field1441 + 180 - 9, var135, 16776960, 0);
                int var69 = field1441 + 180 - 9 + arg0.method4442(class227.field2868) + 15;
                int var70 = var135 - arg0.field3637;
                class286 var71;
                if (field1448) {
                    var71 = Statics.field1791;
                } else {
                    var71 = Statics.field3625;
                }
                var71.method4637(var69, var70);
                var131 = var135 + 15;
                int var72 = field1441 + 180 - 80;
                short var73 = 321;
                Statics.field318.method4637(var72 - 73, var73 - 20);
                arg0.method4423(class227.field3039, var72, var73 + 5, 16777215, 0);
                int var74 = field1441 + 180 + 80;
                Statics.field318.method4637(var74 - 73, var73 - 20);
                arg0.method4423(class227.field2946, var74, var73 + 5, 16777215, 0);
                arg1.method4423(class227.field3087, field1441 + 180, var73 + 36, 255, 0);
            } else if (field1445 == 5) {
                arg0.method4423(class227.field3107, field1441 + 180, 201, 16776960, 0);
                short var75 = 221;
                arg2.method4423(field1453, field1441 + 180, var75, 16776960, 0);
                int var136 = var75 + 15;
                arg2.method4423(field1454, field1441 + 180, var136, 16776960, 0);
                int var137 = var136 + 15;
                arg2.method4423(field1446, field1441 + 180, var137, 16776960, 0);
                int var138 = var137 + 15;
                int var139 = var138 + 14;
                arg0.method4440(class227.field2944, field1441 + 180 - 145, var139, 16777215, 0);
                short var76 = 174;
                String var77;
                for (var77 = method570(); arg0.method4442(var77) > var76; var77 = var77.substring(1)) {
                }
                arg0.method4440(class266.method4463(var77) + (client.field973 % 40 < 20 ? class88.method1003(16776960) + class88.field1396 : ""), field1441 + 180 - 34, var139, 16777215, 0);
                var136 = var139 + 15;
                int var78 = field1441 + 180 - 80;
                short var79 = 321;
                Statics.field318.method4637(var78 - 73, var79 - 20);
                arg0.method4423(class227.field2896, var78, var79 + 5, 16777215, 0);
                int var80 = field1441 + 180 + 80;
                Statics.field318.method4637(var80 - 73, var79 - 20);
                arg0.method4423(class227.field3101, var80, var79 + 5, 16777215, 0);
            } else if (field1445 == 6) {
                short var81 = 201;
                arg0.method4423(field1453, field1441 + 180, var81, 16776960, 0);
                int var140 = var81 + 15;
                arg0.method4423(field1454, field1441 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg0.method4423(field1446, field1441 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var82 = field1441 + 180;
                short var83 = 321;
                Statics.field318.method4637(var82 - 73, var83 - 20);
                arg0.method4423(class227.field3101, var82, var83 + 5, 16777215, 0);
            }
        }
        if (field1447 > 0) {
            int var84 = field1447;
            short var85 = 256;
            field1442 += var84 * 128;
            if (field1442 > Statics.field1342.length) {
                field1442 -= Statics.field1342.length;
                int var86 = (int) (Math.random() * 12.0D);
                Statics.method1905(Statics.field1438[var86]);
            }
            int var87 = 0;
            int var88 = var84 * 128;
            int var89 = (var85 - var84) * 128;
            for (int var90 = 0; var90 < var89; var90++) {
                int var91 = Statics.field2616[var87 + var88] - Statics.field1342[field1442 + var87 & Statics.field1342.length - 1] * var84 / 6;
                if (var91 < 0) {
                    var91 = 0;
                }
                Statics.field2616[var87++] = var91;
            }
            for (int var92 = var85 - var84; var92 < var85; var92++) {
                int var93 = var92 * 128;
                for (int var94 = 0; var94 < 128; var94++) {
                    int var95 = (int) (Math.random() * 100.0D);
                    if (var95 < 50 && var94 > 10 && var94 < 118) {
                        Statics.field2616[var93 + var94] = 255;
                    } else {
                        Statics.field2616[var93 + var94] = 0;
                    }
                }
            }
            if (field1443 > 0) {
                field1443 -= var84 * 4;
            }
            if (field1449 > 0) {
                field1449 -= var84 * 4;
            }
            if (field1443 == 0 && field1449 == 0) {
                int var96 = (int) (Math.random() * (double) (2000 / var84));
                if (var96 == 0) {
                    field1443 = 1024;
                }
                if (var96 == 1) {
                    field1449 = 1024;
                }
            }
            for (int var97 = 0; var97 < var85 - var84; var97++) {
                field1435[var97] = field1435[var84 + var97];
            }
            for (int var98 = var85 - var84; var98 < var85; var98++) {
                field1435[var98] = (int) (Math.sin((double) field1451 / 14.0D) * 16.0D + Math.sin((double) field1451 / 15.0D) * 14.0D + Math.sin((double) field1451 / 16.0D) * 12.0D);
                field1451++;
            }
            field1459 += var84 * 1745248487;
            int var99 = ((client.field973 & 0x1) + var84) / 2;
            if (var99 > 0) {
                for (int var100 = 0; var100 < field1459 * -1556751364; var100++) {
                    int var101 = (int) (Math.random() * 124.0D) + 2;
                    int var102 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field2616[(var102 << 7) + var101] = 192;
                }
                field1459 = 0;
                int var103 = 0;
                label440: while (true) {
                    if (var103 >= var85) {
                        int var107 = 0;
                        while (true) {
                            if (var107 >= 128) {
                                break label440;
                            }
                            int var108 = 0;
                            for (int var109 = -var99; var109 < var85; var109++) {
                                int var110 = var109 * 128;
                                if (var99 + var109 < var85) {
                                    var108 += Statics.field38[var99 * 128 + var107 + var110];
                                }
                                if (var109 - (var99 + 1) >= 0) {
                                    var108 -= Statics.field38[var107 + var110 - (var99 + 1) * 128];
                                }
                                if (var109 >= 0) {
                                    Statics.field2616[var107 + var110] = var108 / (var99 * 2 + 1);
                                }
                            }
                            var107++;
                        }
                    }
                    int var104 = 0;
                    int var105 = var103 * 128;
                    for (int var106 = -var99; var106 < 128; var106++) {
                        if (var99 + var106 < 128) {
                            var104 += Statics.field2616[var105 + var106 + var99];
                        }
                        if (var106 - (var99 + 1) >= 0) {
                            var104 -= Statics.field2616[var105 + var106 - (var99 + 1)];
                        }
                        if (var106 >= 0) {
                            Statics.field38[var105 + var106] = var104 / (var99 * 2 + 1);
                        }
                    }
                    var103++;
                }
            }
            field1447 = 0;
        }
        method2705();
        Statics.field1437[Statics.field2396.field1318 ? 1 : 0].method4637(field1436 + 765 - 40, 463);
        if (client.field948 <= 5 || client.field950 != 0) {
            return;
        }
        if (Statics.field447 == null) {
            Statics.field447 = Statics.method1074(Statics.field307, "sl_button", "");
            return;
        }
        int var111 = field1436 + 5;
        short var112 = 463;
        byte var113 = 100;
        byte var114 = 35;
        Statics.field447.method4637(var111, var112);
        arg0.method4423(class227.field2862 + " " + client.field942, var113 / 2 + var111, var114 / 2 + var112 - 2, 16777215, 0);
        if (Statics.field897 == null) {
            arg1.method4423(class227.field3142, var113 / 2 + var111, var114 / 2 + var112 + 12, 16777215, 0);
        } else {
            arg1.method4423(class227.field2882, var113 / 2 + var111, var114 / 2 + var112 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("hq.k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3813(String arg0, String arg1, String arg2) {
        field1453 = arg0;
        field1454 = arg1;
        field1446 = arg2;
    }

    @ObfuscatedName("as.d(IIII)I")
    public static final int method651(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("ej.l(B)V")
    public static final void method2705() {
        short var0 = 256;
        if (field1443 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1443 > 768) {
                    Statics.field1341[var1] = method651(Statics.field1380[var1], Statics.field2847[var1], 1024 - field1443);
                } else if (field1443 > 256) {
                    Statics.field1341[var1] = Statics.field2847[var1];
                } else {
                    Statics.field1341[var1] = method651(Statics.field2847[var1], Statics.field1380[var1], 256 - field1443);
                }
            }
        } else if (field1449 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1449 > 768) {
                    Statics.field1341[var2] = method651(Statics.field1380[var2], Statics.field533[var2], 1024 - field1449);
                } else if (field1449 > 256) {
                    Statics.field1341[var2] = Statics.field533[var2];
                } else {
                    Statics.field1341[var2] = method651(Statics.field533[var2], Statics.field1380[var2], 256 - field1449);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1341[var3] = Statics.field1380[var3];
            }
        }
        class283.method4549(field1436, 9, field1436 + 128, var0 + 7);
        Statics.field337.method4671(field1436, 0);
        class283.method4548();
        int var4 = 0;
        int var5 = field1436 + Statics.field343.field3767 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1435[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field2616[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1341[var10];
                    int var14 = Statics.field343.field3768[var5];
                    Statics.field343.field3768[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field343.field3767 + var8 - 128;
        }
        class283.method4549(field1436 + 765 - 128, 9, field1436 + 765, var0 + 7);
        Statics.field1406.method4671(field1436 + 382, 0);
        class283.method4548();
        int var15 = 0;
        int var16 = field1436 + Statics.field343.field3767 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1435[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field2616[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1341[var22];
                    int var26 = Statics.field343.field3768[var20];
                    Statics.field343.field3768[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field343.field3767 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("by.c(Lbx;I)V")
    public static void method956(class59 arg0) {
        if (class60.field755 != 1 && Statics.field952 || class60.field755 != 4) {
            return;
        }
        int var1 = field1436 + 280;
        if (class60.field754 >= var1 && class60.field754 <= var1 + 14 && class60.field740 >= 4 && class60.field740 <= 18) {
            class80.method16(0, 0);
            return;
        }
        if (class60.field754 >= var1 + 15 && class60.field754 <= var1 + 80 && class60.field740 >= 4 && class60.field740 <= 18) {
            class80.method16(0, 1);
            return;
        }
        int var2 = field1436 + 390;
        if (class60.field754 >= var2 && class60.field754 <= var2 + 14 && class60.field740 >= 4 && class60.field740 <= 18) {
            class80.method16(1, 0);
            return;
        }
        if (class60.field754 >= var2 + 15 && class60.field754 <= var2 + 80 && class60.field740 >= 4 && class60.field740 <= 18) {
            class80.method16(1, 1);
            return;
        }
        int var3 = field1436 + 500;
        if (class60.field754 >= var3 && class60.field754 <= var3 + 14 && class60.field740 >= 4 && class60.field740 <= 18) {
            class80.method16(2, 0);
            return;
        }
        if (class60.field754 >= var3 + 15 && class60.field754 <= var3 + 80 && class60.field740 >= 4 && class60.field740 <= 18) {
            class80.method16(2, 1);
            return;
        }
        int var4 = field1436 + 610;
        if (class60.field754 >= var4 && class60.field754 <= var4 + 14 && class60.field740 >= 4 && class60.field740 <= 18) {
            class80.method16(3, 0);
            return;
        }
        if (class60.field754 >= var4 + 15 && class60.field754 <= var4 + 80 && class60.field740 >= 4 && class60.field740 <= 18) {
            class80.method16(3, 1);
            return;
        }
        if (class60.field754 >= field1436 + 708 && class60.field740 >= 4 && class60.field754 <= field1436 + 708 + 50 && class60.field740 <= 20) {
            field1455 = false;
            Statics.field337.method4671(field1436, 0);
            Statics.field1406.method4671(field1436 + 382, 0);
            Statics.field586.method4637(field1436 + 382 - Statics.field586.field3777 / 2, 18);
            return;
        }
        if (field1466 == -1) {
            return;
        }
        class80 var5 = Statics.field1301[field1466];
        method1711(var5);
        field1455 = false;
        Statics.field337.method4671(field1436, 0);
        Statics.field1406.method4671(field1436 + 382, 0);
        Statics.field586.method4637(field1436 + 382 - Statics.field586.field3777 / 2, 18);
        return;
    }

    @ObfuscatedName("cn.u(Lcp;I)V")
    public static void method1711(class80 arg0) {
        if (arg0.method1412() != client.field945) {
            client.field945 = arg0.method1412();
            class258.method165(arg0.method1412());
        }
        Statics.field358 = arg0.field1305;
        client.field942 = arg0.field1300;
        client.field943 = arg0.field1312;
        Statics.field3629 = client.field944 == 0 ? 43594 : arg0.field1300 + 40000;
        Statics.field473 = client.field944 == 0 ? 443 : arg0.field1300 + 50000;
        Statics.field1679 = Statics.field3629;
    }

    @ObfuscatedName("c.e(I)V")
    public static void method95() {
        if (class80.method1400()) {
            field1455 = true;
        }
    }
}

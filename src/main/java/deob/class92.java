package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

@ObfuscatedName("cb")
public class class92 {

    @ObfuscatedName("cb.p")
    public static int field1333 = 0;

    @ObfuscatedName("cb.u")
    public static int field1341 = field1333 + 202;

    @ObfuscatedName("cb.z")
    public static int[] field1370 = new int[256];

    @ObfuscatedName("cb.q")
    public static int field1332 = 0;

    @ObfuscatedName("cb.al")
    public static int field1344 = 0;

    @ObfuscatedName("cb.ag")
    public static int field1345 = 0;

    @ObfuscatedName("cb.ap")
    public static int field1346 = 0;

    @ObfuscatedName("cb.av")
    public static int field1367 = 0;

    @ObfuscatedName("cb.ak")
    public static int field1348 = 0;

    @ObfuscatedName("cb.at")
    public static int field1349 = 10;

    @ObfuscatedName("cb.an")
    public static String field1350 = "";

    @ObfuscatedName("cb.ah")
    public static int field1338 = 0;

    @ObfuscatedName("cb.am")
    public static String field1352 = "";

    @ObfuscatedName("cb.ay")
    public static String field1353 = "";

    @ObfuscatedName("cb.az")
    public static String field1354 = "";

    @ObfuscatedName("cb.aw")
    public static String field1355 = "";

    @ObfuscatedName("cb.au")
    public static String field1343 = "";

    @ObfuscatedName("cb.ac")
    public static String field1364 = "";

    @ObfuscatedName("cb.ai")
    public static boolean field1358 = false;

    @ObfuscatedName("cb.ar")
    public static boolean field1360 = false;

    @ObfuscatedName("cb.bu")
    public static boolean field1361 = false;

    @ObfuscatedName("cb.bl")
    public static boolean field1339 = true;

    @ObfuscatedName("cb.bw")
    public static int field1351 = 0;

    @ObfuscatedName("cb.bj")
    public static String field1366 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cb.bn")
    public static String field1347 = "1234567890";

    @ObfuscatedName("cb.bz")
    public static boolean field1357 = false;

    @ObfuscatedName("cb.bc")
    public static int field1356 = -1;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ff.m(Lik;Lik;B)I")
    public static int method2825(class243 arg0, class243 arg1) {
        int var2 = 0;
        if (arg0.method3946("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3946("logo", "")) {
            var2++;
        }
        if (arg1.method3946("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3946("titlebox", "")) {
            var2++;
        }
        if (arg1.method3946("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3946("runes", "")) {
            var2++;
        }
        if (arg1.method3946("title_mute", "")) {
            var2++;
        }
        if (arg1.method3946("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3946("options_radio_buttons,2", "")) {
            var2++;
        }
        if (arg1.method3946("options_radio_buttons,4", "")) {
            var2++;
        }
        if (arg1.method3946("options_radio_buttons,6", "")) {
            var2++;
        }
        arg1.method3946("sl_back", "");
        arg1.method3946("sl_flags", "");
        arg1.method3946("sl_arrows", "");
        arg1.method3946("sl_stars", "");
        arg1.method3946("sl_button", "");
        return var2;
    }

    @ObfuscatedName("bx.p(Lik;Lik;ZII)V")
    public static void method1053(class243 arg0, class243 arg1, boolean arg2, int arg3) {
        if (!Statics.field1362) {
            field1338 = arg3;
            class291.method4797();
            byte[] var4 = arg0.method3959("title.jpg", "");
            Statics.field1337 = class55.method3905(var4);
            Statics.field1369 = Statics.field1337.method4881();
            if ((client.field872 & 0x20000000) == 0) {
                Statics.field1342 = class296.method4138(arg1, "logo", "");
            } else {
                Statics.field1342 = class296.method4138(arg1, "logo_deadman_mode", "");
            }
            Statics.field1334 = class296.method4138(arg1, "titlebox", "");
            Statics.field1335 = class296.method4138(arg1, "titlebutton", "");
            Statics.field1336 = class296.method2775(arg1, "runes", "");
            Statics.field1340 = class296.method2775(arg1, "title_mute", "");
            Statics.field2047 = class296.method4138(arg1, "options_radio_buttons,0", "");
            Statics.field1236 = class296.method4138(arg1, "options_radio_buttons,4", "");
            Statics.field3860 = class296.method4138(arg1, "options_radio_buttons,2", "");
            Statics.field1266 = class296.method4138(arg1, "options_radio_buttons,6", "");
            Statics.field562 = Statics.field2047.field3834;
            Statics.field1359 = Statics.field2047.field3833;
            Statics.field868 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field868[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field868[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field868[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field868[var8 + 192] = 16777215;
            }
            Statics.field1459 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1459[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1459[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1459[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1459[var12 + 192] = 16777215;
            }
            Statics.field822 = new int[256];
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field822[var13] = var13 * 4;
            }
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field822[var14 + 64] = var14 * 262144 + 255;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field822[var15 + 128] = var15 * 1024 + 16711935;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field822[var16 + 192] = 16777215;
            }
            Statics.field3654 = new int[256];
            Statics.field3244 = new int[32768];
            Statics.field467 = new int[32768];
            method1029((class294) null);
            Statics.field1289 = new int[32768];
            Statics.field282 = new int[32768];
            if (arg2) {
                field1343 = "";
                field1364 = "";
            }
            Statics.field1430 = 0;
            Statics.field3686 = "";
            field1339 = true;
            field1357 = false;
            if (Statics.field2494.field1229) {
                class211.method511(2);
            } else {
                class245 var17 = Statics.field334;
                int var18 = var17.method3985("scape main");
                int var19 = var17.method3947(var18, "");
                class211.field2595 = 1;
                Statics.field2517 = var17;
                Statics.field2599 = var18;
                Statics.field2600 = var19;
                Statics.field486 = 255;
                Statics.field2596 = false;
                Statics.field585 = 2;
            }
            class246.method255(false);
            Statics.field1362 = true;
            field1333 = (Statics.field1842 - 765) / 2;
            field1341 = field1333 + 202;
            Statics.field3210 = field1341 + 180;
            Statics.field1337.method4890(field1333, 0);
            Statics.field1369.method4890(field1333 + 382, 0);
            Statics.field1342.method4860(field1333 + 382 - Statics.field1342.field3834 / 2, 18);
        } else if (arg3 == 4) {
            field1338 = 4;
        }
    }

    @ObfuscatedName("u.i(ZZI)Lko;")
    public static class294 method134(boolean arg0, boolean arg1) {
        return arg0 ? (arg1 ? Statics.field1266 : Statics.field3860) : (arg1 ? Statics.field1236 : Statics.field2047);
    }

    @ObfuscatedName("s.j(I)V")
    public static void method180() {
        if (field1343 != null && field1343.length() > 0) {
            return;
        }
        if (Statics.field2494.field1232 == null) {
            field1358 = false;
        } else {
            field1343 = Statics.field2494.field1232;
            field1358 = true;
        }
    }

    @ObfuscatedName("ez.x(Lbn;I)V")
    public static void method2743(class59 arg0) {
        if (field1357) {
            method163(arg0);
            return;
        }
        if ((class60.field714 == 1 || !Statics.field1400 && class60.field714 == 4) && class60.field715 >= field1333 + 765 - 50 && class60.field716 >= 453) {
            Statics.field2494.field1229 = !Statics.field2494.field1229;
            class81.method2914();
            if (Statics.field2494.field1229) {
                class211.method2290();
            } else {
                class211.method46(Statics.field334, "scape main", "", 255, false);
            }
        }
        if (client.field877 == 5) {
            return;
        }
        field1367++;
        if (client.field877 != 10 && client.field877 != 11) {
            return;
        }
        if (client.field1061 == 0) {
            if (class60.field714 == 1 || !Statics.field1400 && class60.field714 == 4) {
                int var1 = field1333 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class60.field715 >= var1 && class60.field715 <= var1 + var3 && class60.field716 >= var2 && class60.field716 <= var2 + var4) {
                    if (class80.method36()) {
                        field1357 = true;
                    }
                    return;
                }
            }
            if (Statics.field826 != null && class80.method36()) {
                field1357 = true;
            }
        }
        int var5 = class60.field714;
        int var6 = class60.field715;
        int var7 = class60.field716;
        if (var5 == 0) {
            var6 = class60.field705;
            var7 = class60.field709;
        }
        if (!Statics.field1400 && var5 == 4) {
            var5 = 1;
        }
        if (field1338 == 0) {
            boolean var8 = false;
            while (class51.method720()) {
                if (Statics.field1290 == 84) {
                    var8 = true;
                }
            }
            int var9 = Statics.field3210 - 80;
            short var10 = 291;
            if (var5 == 1 && var6 >= var9 - 75 && var6 <= var9 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                class57.method2736(client.method188("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var11 = Statics.field3210 + 80;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20 || var8) {
                if ((client.field872 & 0x2000000) != 0) {
                    field1352 = "";
                    field1353 = class233.field3147;
                    field1354 = class233.field3148;
                    field1355 = class233.field3072;
                    field1338 = 1;
                    Statics.method1064();
                } else if ((client.field872 & 0x4) != 0) {
                    if ((client.field872 & 0x400) == 0) {
                        field1353 = class233.field3138;
                        field1354 = class233.field2980;
                        field1355 = class233.field3140;
                    } else {
                        field1353 = class233.field3144;
                        field1354 = class233.field2948;
                        field1355 = class233.field3146;
                    }
                    field1352 = class233.field3137;
                    field1338 = 1;
                    Statics.method1064();
                } else if ((client.field872 & 0x400) == 0) {
                    method259(false);
                } else {
                    field1353 = class233.field2977;
                    field1354 = class233.field3142;
                    field1355 = class233.field3143;
                    field1352 = class233.field3137;
                    field1338 = 1;
                    Statics.method1064();
                }
            }
        } else if (field1338 == 1) {
            while (class51.method720()) {
                if (Statics.field1290 == 84) {
                    method259(false);
                } else if (Statics.field1290 == 13) {
                    field1338 = 0;
                }
            }
            int var12 = Statics.field3210 - 80;
            short var13 = 321;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                method259(false);
            }
            int var14 = Statics.field3210 + 80;
            if (var5 == 1 && var6 >= var14 - 75 && var6 <= var14 + 75 && var7 >= var13 - 20 && var7 <= var13 + 20) {
                field1338 = 0;
            }
        } else if (field1338 == 2) {
            short var15 = 201;
            int var41 = var15 + 52;
            if (var5 == 1 && var7 >= var41 - 12 && var7 < var41 + 2) {
                field1351 = 0;
            }
            var41 += 15;
            if (var5 == 1 && var7 >= var41 - 12 && var7 < var41 + 2) {
                field1351 = 1;
            }
            var41 += 15;
            short var16 = 361;
            if (var5 == 1 && var7 >= var16 - 15 && var7 < var16) {
                method39(class233.field3066, class233.field3176, class233.field3177);
                field1338 = 5;
                return;
            }
            int var17 = Statics.field3210 - 80;
            short var18 = 321;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field1343 = field1343.trim();
                if (field1343.length() == 0) {
                    method39(class233.field3040, class233.field3041, class233.field3042);
                    return;
                }
                if (field1364.length() == 0) {
                    method39(class233.field3158, class233.field3044, class233.field3022);
                    return;
                }
                method39(class233.field3152, class233.field3153, class233.field3154);
                client.method3914(false);
                client.method4762(20);
                return;
            }
            int var19 = field1341 + 180 + 80;
            if (var5 == 1 && var6 >= var19 - 75 && var6 <= var19 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field1338 = 0;
                field1343 = "";
                field1364 = "";
                Statics.field1430 = 0;
                Statics.field3686 = "";
                field1339 = true;
            }
            int var20 = Statics.field3210 + -117;
            short var21 = 277;
            field1360 = var6 >= var20 && var6 < Statics.field562 + var20 && var7 >= var21 && var7 < Statics.field1359 + var21;
            if (var5 == 1 && field1360) {
                field1358 = !field1358;
                if (!field1358 && Statics.field2494.field1232 != null) {
                    Statics.field2494.field1232 = null;
                    class81.method2914();
                }
            }
            int var22 = Statics.field3210 + 24;
            short var23 = 277;
            field1361 = var6 >= var22 && var6 < Statics.field562 + var22 && var7 >= var23 && var7 < Statics.field1359 + var23;
            if (var5 == 1 && field1361) {
                Statics.field2494.field1233 = !Statics.field2494.field1233;
                if (!Statics.field2494.field1233) {
                    field1343 = "";
                    Statics.field2494.field1232 = null;
                    Statics.method1064();
                }
                class81.method2914();
            }
            while (true) {
                while (class51.method720()) {
                    boolean var24 = false;
                    for (int var25 = 0; var25 < field1366.length(); var25++) {
                        if (Statics.field3793 == field1366.charAt(var25)) {
                            var24 = true;
                            break;
                        }
                    }
                    if (Statics.field1290 == 13) {
                        field1338 = 0;
                        field1343 = "";
                        field1364 = "";
                        Statics.field1430 = 0;
                        Statics.field3686 = "";
                        field1339 = true;
                    } else if (field1351 == 0) {
                        if (Statics.field1290 == 85 && field1343.length() > 0) {
                            field1343 = field1343.substring(0, field1343.length() - 1);
                        }
                        if (Statics.field1290 == 84 || Statics.field1290 == 80) {
                            field1351 = 1;
                        }
                        if (var24 && field1343.length() < 320) {
                            field1343 = field1343 + Statics.field3793;
                        }
                    } else if (field1351 == 1) {
                        if (Statics.field1290 == 85 && field1364.length() > 0) {
                            field1364 = field1364.substring(0, field1364.length() - 1);
                        }
                        if (Statics.field1290 == 84 || Statics.field1290 == 80) {
                            field1351 = 0;
                        }
                        if (Statics.field1290 == 84) {
                            field1343 = field1343.trim();
                            if (field1343.length() == 0) {
                                method39(class233.field3040, class233.field3041, class233.field3042);
                                return;
                            }
                            if (field1364.length() == 0) {
                                method39(class233.field3158, class233.field3044, class233.field3022);
                                return;
                            }
                            method39(class233.field3152, class233.field3153, class233.field3154);
                            client.method3914(false);
                            client.method4762(20);
                            return;
                        }
                        if (var24 && field1364.length() < 20) {
                            field1364 = field1364 + Statics.field3793;
                        }
                    }
                }
                return;
            }
        } else if (field1338 == 3) {
            int var26 = field1341 + 180;
            short var27 = 276;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                method259(false);
            }
            int var28 = field1341 + 180;
            short var29 = 326;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var29 - 20 && var7 <= var29 + 20) {
                method39(class233.field3066, class233.field3176, class233.field3177);
                field1338 = 5;
                return;
            }
        } else if (field1338 == 4) {
            int var30 = field1341 + 180 - 80;
            short var31 = 321;
            if (var5 == 1 && var6 >= var30 - 75 && var6 <= var30 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                Statics.field3686.trim();
                if (Statics.field3686.length() != 6) {
                    method39(class233.field2959, class233.field2960, class233.field3068);
                    return;
                }
                Statics.field1430 = Integer.parseInt(Statics.field3686);
                Statics.field3686 = "";
                client.method3914(true);
                method39(class233.field3152, class233.field3153, class233.field3154);
                client.method4762(20);
                return;
            }
            if (var5 == 1 && var6 >= field1341 + 180 - 9 && var6 <= field1341 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field1339 = !field1339;
            }
            if (var5 == 1 && var6 >= field1341 + 180 - 34 && var6 <= field1341 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class57.method2736(client.method188("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var32 = field1341 + 180 + 80;
            if (var5 == 1 && var6 >= var32 - 75 && var6 <= var32 + 75 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                field1338 = 0;
                field1343 = "";
                field1364 = "";
                Statics.field1430 = 0;
                Statics.field3686 = "";
            }
            while (class51.method720()) {
                boolean var33 = false;
                for (int var34 = 0; var34 < field1347.length(); var34++) {
                    if (Statics.field3793 == field1347.charAt(var34)) {
                        var33 = true;
                        break;
                    }
                }
                if (Statics.field1290 == 13) {
                    field1338 = 0;
                    field1343 = "";
                    field1364 = "";
                    Statics.field1430 = 0;
                    Statics.field3686 = "";
                } else {
                    if (Statics.field1290 == 85 && Statics.field3686.length() > 0) {
                        Statics.field3686 = Statics.field3686.substring(0, Statics.field3686.length() - 1);
                    }
                    if (Statics.field1290 == 84) {
                        Statics.field3686.trim();
                        if (Statics.field3686.length() != 6) {
                            method39(class233.field2959, class233.field2960, class233.field3068);
                            return;
                        }
                        Statics.field1430 = Integer.parseInt(Statics.field3686);
                        Statics.field3686 = "";
                        client.method3914(true);
                        method39(class233.field3152, class233.field3153, class233.field3154);
                        client.method4762(20);
                        return;
                    }
                    if (var33 && Statics.field3686.length() < 6) {
                        Statics.field3686 = Statics.field3686 + Statics.field3793;
                    }
                }
            }
        } else if (field1338 == 5) {
            int var35 = field1341 + 180 - 80;
            short var36 = 321;
            if (var5 == 1 && var6 >= var35 - 75 && var6 <= var35 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20) {
                method1613();
                return;
            }
            int var37 = field1341 + 180 + 80;
            if (var5 == 1 && var6 >= var37 - 75 && var6 <= var37 + 75 && var7 >= var36 - 20 && var7 <= var36 + 20) {
                method259(true);
            }
            while (class51.method720()) {
                boolean var38 = false;
                for (int var39 = 0; var39 < field1366.length(); var39++) {
                    if (Statics.field3793 == field1366.charAt(var39)) {
                        var38 = true;
                        break;
                    }
                }
                if (Statics.field1290 == 13) {
                    method259(true);
                } else {
                    if (Statics.field1290 == 85 && field1343.length() > 0) {
                        field1343 = field1343.substring(0, field1343.length() - 1);
                    }
                    if (Statics.field1290 == 84) {
                        method1613();
                        return;
                    }
                    if (var38 && field1343.length() < 320) {
                        field1343 = field1343 + Statics.field3793;
                    }
                }
            }
        } else if (field1338 == 6) {
            while (true) {
                do {
                    if (!class51.method720()) {
                        short var40 = 321;
                        if (var5 == 1 && var7 >= var40 - 20 && var7 <= var40 + 20) {
                            method259(true);
                        }
                        return;
                    }
                } while (Statics.field1290 != 84 && Statics.field1290 != 13);
                method259(true);
            }
        }
    }

    @ObfuscatedName("as.e(ZI)V")
    public static void method259(boolean arg0) {
        field1353 = class233.field3134;
        field1354 = class233.field3062;
        field1355 = class233.field3136;
        field1338 = 2;
        if (arg0) {
            field1364 = "";
        }
        method180();
        Statics.method1064();
    }

    @ObfuscatedName("cy.l(I)V")
    public static void method1613() {
        field1343 = field1343.trim();
        if (field1343.length() == 0) {
            method39(class233.field3066, class233.field3176, class233.field3177);
            return;
        }
        long var0 = class87.method2741();
        byte var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            String var3 = field1343;
            Random var4 = new Random();
            class181 var5 = new class181(128);
            class181 var6 = new class181(128);
            int[] var7 = new int[] { var4.nextInt(), var4.nextInt(), (int) (var0 >> 32), (int) var0 };
            var5.method2996(10);
            for (int var8 = 0; var8 < 4; var8++) {
                var5.method2999(var4.nextInt());
            }
            var5.method2999(var7[0]);
            var5.method2999(var7[1]);
            var5.method3170(var0);
            var5.method3170(0L);
            for (int var9 = 0; var9 < 4; var9++) {
                var5.method2999(var4.nextInt());
            }
            var5.method3034(class87.field1305, class87.field1300);
            var6.method2996(10);
            for (int var10 = 0; var10 < 3; var10++) {
                var6.method2999(var4.nextInt());
            }
            var6.method3170(var4.nextLong());
            var6.method3000(var4.nextLong());
            client.method3739(var6);
            var6.method3170(var4.nextLong());
            var6.method3034(class87.field1305, class87.field1300);
            int var11 = class181.method1683(var3);
            if (var11 % 8 != 0) {
                var11 += 8 - var11 % 8;
            }
            class181 var12 = new class181(var11);
            var12.method3003(var3);
            var12.field2498 = var11;
            var12.method3030(var7);
            class181 var13 = new class181(var12.field2498 + var6.field2498 + var5.field2498 + 5);
            var13.method2996(2);
            var13.method2996(var5.field2498);
            var13.method3006(var5.field2499, 0, var5.field2498);
            var13.method2996(var6.field2498);
            var13.method3006(var6.field2499, 0, var6.field2498);
            var13.method2997(var12.field2498);
            var13.method3006(var12.field2499, 0, var12.field2498);
            byte[] var14 = var13.field2499;
            int var15 = var14.length;
            StringBuilder var16 = new StringBuilder();
            for (int var17 = 0; var17 < var15; var17 += 3) {
                int var18 = var14[var17] & 0xFF;
                var16.append(class277.field3732[var18 >>> 2]);
                if (var17 < var15 - 1) {
                    int var19 = var14[var17 + 1] & 0xFF;
                    var16.append(class277.field3732[(var18 & 0x3) << 4 | var19 >>> 4]);
                    if (var17 < var15 - 2) {
                        int var20 = var14[var17 + 2] & 0xFF;
                        var16.append(class277.field3732[(var19 & 0xF) << 2 | var20 >>> 6]).append(class277.field3732[var20 & 0x3F]);
                    } else {
                        var16.append(class277.field3732[(var19 & 0xF) << 2]).append("=");
                    }
                } else {
                    var16.append(class277.field3732[(var18 & 0x3) << 4]).append("==");
                }
            }
            String var21 = var16.toString();
            String var23 = var21;
            byte var30;
            try {
                URL var24 = new URL(client.method188("services", false) + "m=accountappeal/login.ws");
                URLConnection var25 = var24.openConnection();
                var25.setDoInput(true);
                var25.setDoOutput(true);
                var25.setConnectTimeout(5000);
                OutputStreamWriter var26 = new OutputStreamWriter(var25.getOutputStream());
                var26.write("data2=" + class303.method6(var23) + "&dest=" + class303.method6("passwordchoice.ws"));
                var26.flush();
                InputStream var27 = var25.getInputStream();
                class181 var28 = new class181(new byte[1000]);
                while (true) {
                    int var29 = var27.read(var28.field2499, var28.field2498, 1000 - var28.field2498);
                    if (var29 == -1) {
                        var26.close();
                        var27.close();
                        String var31 = new String(var28.field2499);
                        if (var31.startsWith("OFFLINE")) {
                            var30 = 4;
                        } else if (var31.startsWith("WRONG")) {
                            var30 = 7;
                        } else if (var31.startsWith("RELOAD")) {
                            var30 = 3;
                        } else if (var31.startsWith("Not permitted for social network accounts.")) {
                            var30 = 6;
                        } else {
                            var28.method3031(var7);
                            while (var28.field2498 > 0 && var28.field2499[var28.field2498 - 1] == 0) {
                                var28.field2498--;
                            }
                            String var32 = new String(var28.field2499, 0, var28.field2498);
                            if (class87.method265(var32)) {
                                class57.method2736(var32, true, false);
                                var30 = 2;
                            } else {
                                var30 = 5;
                            }
                        }
                        break;
                    }
                    var28.field2498 += var29;
                    if (var28.field2498 >= 1000) {
                        var30 = 5;
                        break;
                    }
                }
            } catch (Throwable var34) {
                var34.printStackTrace();
                var30 = 5;
            }
            var2 = var30;
        }
        switch(var2) {
            case 2:
                method39(class233.field3178, class233.field3102, class233.field3180);
                field1338 = 6;
                break;
            case 3:
                method39(class233.field3181, class233.field3182, class233.field3183);
                break;
            case 4:
                method39(class233.field2968, class233.field3185, class233.field3038);
                break;
            case 5:
                method39(class233.field3094, class233.field3092, class233.field3189);
                break;
            case 6:
                method39(class233.field3190, class233.field3191, class233.field3192);
                break;
            case 7:
                method39(class233.field3064, class233.field2929, class233.field3195);
        }
    }

    @ObfuscatedName("dj.b(Ljt;Ljt;Ljt;ZI)V")
    public static void method2262(class271 arg0, class271 arg1, class271 arg2, boolean arg3) {
        if (arg3) {
            field1333 = (Statics.field1842 - 765) / 2;
            field1341 = field1333 + 202;
            Statics.field3210 = field1341 + 180;
        }
        if (field1357) {
            method499(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1337.method4890(field1333, 0);
            Statics.field1369.method4890(field1333 + 382, 0);
            Statics.field1342.method4860(field1333 + 382 - Statics.field1342.field3834 / 2, 18);
        }
        if (client.field877 == 0 || client.field877 == 5) {
            byte var4 = 20;
            arg0.method4563(class233.field3133, field1341 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class291.method4782(field1341 + 180 - 152, var5, 304, 34, 9179409);
            class291.method4782(field1341 + 180 - 151, var5 + 1, 302, 32, 0);
            class291.method4776(field1341 + 180 - 150, var5 + 2, field1349 * 3, 30, 9179409);
            class291.method4776(field1349 * 3 + (field1341 + 180 - 150), var5 + 2, 300 - field1349 * 3, 30, 0);
            arg0.method4563(field1350, field1341 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field877 == 20) {
            Statics.field1334.method4860(field1341 + 180 - Statics.field1334.field3834 / 2, 271 - Statics.field1334.field3833 / 2);
            short var6 = 201;
            arg0.method4563(field1353, field1341 + 180, var6, 16776960, 0);
            int var86 = var6 + 15;
            arg0.method4563(field1354, field1341 + 180, var86, 16776960, 0);
            int var87 = var86 + 15;
            arg0.method4563(field1355, field1341 + 180, var87, 16776960, 0);
            int var88 = var87 + 15;
            int var89 = var88 + 7;
            if (field1338 != 4) {
                arg0.method4560(class233.field2949, field1341 + 180 - 110, var89, 16777215, 0);
                short var7 = 200;
                String var8 = Statics.field2494.field1233 ? class278.method3551(field1343) : field1343;
                String var9;
                for (var9 = var8; arg0.method4555(var9) > var7; var9 = var9.substring(0, var9.length() - 1)) {
                }
                arg0.method4560(class272.method4559(var9), field1341 + 180 - 70, var89, 16777215, 0);
                var86 = var89 + 15;
                arg0.method4560(class233.field3156 + class278.method3551(field1364), field1341 + 180 - 108, var86, 16777215, 0);
                var86 += 15;
            }
        }
        if (client.field877 == 10 || client.field877 == 11) {
            Statics.field1334.method4860(field1341, 171);
            if (field1338 == 0) {
                short var10 = 251;
                arg0.method4563(class233.field3009, field1341 + 180, var10, 16776960, 0);
                int var90 = var10 + 30;
                int var11 = field1341 + 180 - 80;
                short var12 = 291;
                Statics.field1335.method4860(var11 - 73, var12 - 20);
                arg0.method4564(class233.field2967, var11 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var13 = field1341 + 180 + 80;
                Statics.field1335.method4860(var13 - 73, var12 - 20);
                arg0.method4564(class233.field3160, var13 - 73, var12 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1338 == 1) {
                arg0.method4563(field1352, field1341 + 180, 201, 16776960, 0);
                short var14 = 236;
                arg0.method4563(field1353, field1341 + 180, var14, 16777215, 0);
                int var91 = var14 + 15;
                arg0.method4563(field1354, field1341 + 180, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method4563(field1355, field1341 + 180, var92, 16777215, 0);
                int var93 = var92 + 15;
                int var15 = field1341 + 180 - 80;
                short var16 = 321;
                Statics.field1335.method4860(var15 - 73, var16 - 20);
                arg0.method4563(class233.field3173, var15, var16 + 5, 16777215, 0);
                int var17 = field1341 + 180 + 80;
                Statics.field1335.method4860(var17 - 73, var16 - 20);
                arg0.method4563(class233.field3162, var17, var16 + 5, 16777215, 0);
            } else if (field1338 == 2) {
                short var18 = 201;
                arg0.method4563(field1353, Statics.field3210, var18, 16776960, 0);
                int var94 = var18 + 15;
                arg0.method4563(field1354, Statics.field3210, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method4563(field1355, Statics.field3210, var95, 16776960, 0);
                int var96 = var95 + 15;
                int var97 = var96 + 7;
                arg0.method4560(class233.field2949, Statics.field3210 - 110, var97, 16777215, 0);
                short var19 = 200;
                String var20 = Statics.field2494.field1233 ? class278.method3551(field1343) : field1343;
                String var21;
                for (var21 = var20; arg0.method4555(var21) > var19; var21 = var21.substring(1)) {
                }
                arg0.method4560(class272.method4559(var21) + (field1351 == 0 & client.field1054 % 40 < 20 ? class88.method2738(16776960) + class88.field1312 : ""), Statics.field3210 - 70, var97, 16777215, 0);
                var94 = var97 + 15;
                arg0.method4560(class233.field3156 + class278.method3551(field1364) + (field1351 == 1 & client.field1054 % 40 < 20 ? class88.method2738(16776960) + class88.field1312 : ""), Statics.field3210 - 108, var94, 16777215, 0);
                var94 += 15;
                short var22 = 277;
                int var23 = Statics.field3210 + -117;
                class294 var24 = method134(field1358, field1360);
                var24.method4860(var23, var22);
                int var25 = var24.field3834 + 5 + var23;
                arg1.method4560(class233.field2950, var25, var22 + 13, 16776960, 0);
                int var26 = Statics.field3210 + 24;
                class294 var27 = method134(Statics.field2494.field1233, field1361);
                var27.method4860(var26, var22);
                int var28 = var27.field3834 + 5 + var26;
                arg1.method4560(class233.field3011, var28, var22 + 13, 16776960, 0);
                int var98 = var22 + 15;
                int var29 = Statics.field3210 - 80;
                short var30 = 321;
                Statics.field1335.method4860(var29 - 73, var30 - 20);
                arg0.method4563(class233.field3161, var29, var30 + 5, 16777215, 0);
                int var31 = Statics.field3210 + 80;
                Statics.field1335.method4860(var31 - 73, var30 - 20);
                arg0.method4563(class233.field3162, var31, var30 + 5, 16777215, 0);
                short var32 = 357;
                arg1.method4563(class233.field3170, Statics.field3210, var32, 16776960, 0);
            } else if (field1338 == 3) {
                short var33 = 201;
                arg0.method4563(class233.field3165, field1341 + 180, var33, 16776960, 0);
                int var99 = var33 + 20;
                arg1.method4563(class233.field3166, field1341 + 180, var99, 16776960, 0);
                int var100 = var99 + 15;
                arg1.method4563(class233.field3085, field1341 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                int var34 = field1341 + 180;
                short var35 = 276;
                Statics.field1335.method4860(var34 - 73, var35 - 20);
                arg2.method4563(class233.field3168, var34, var35 + 5, 16777215, 0);
                int var36 = field1341 + 180;
                short var37 = 326;
                Statics.field1335.method4860(var36 - 73, var37 - 20);
                arg2.method4563(class233.field2954, var36, var37 + 5, 16777215, 0);
            } else if (field1338 == 4) {
                arg0.method4563(class233.field3151, field1341 + 180, 201, 16776960, 0);
                short var38 = 236;
                arg0.method4563(field1353, field1341 + 180, var38, 16777215, 0);
                int var102 = var38 + 15;
                arg0.method4563(field1354, field1341 + 180, var102, 16777215, 0);
                int var103 = var102 + 15;
                arg0.method4563(field1355, field1341 + 180, var103, 16777215, 0);
                int var104 = var103 + 15;
                arg0.method4560(class233.field2997 + class278.method3551(Statics.field3686) + (client.field1054 % 40 < 20 ? class88.method2738(16776960) + class88.field1312 : ""), field1341 + 180 - 108, var104, 16777215, 0);
                int var105 = var104 - 8;
                arg0.method4560(class233.field2931, field1341 + 180 - 9, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg0.method4560(class233.field2932, field1341 + 180 - 9, var106, 16776960, 0);
                int var39 = field1341 + 180 - 9 + arg0.method4555(class233.field2932) + 15;
                int var40 = var106 - arg0.field3698;
                class294 var41;
                if (field1339) {
                    var41 = Statics.field3860;
                } else {
                    var41 = Statics.field2047;
                }
                var41.method4860(var39, var40);
                var102 = var106 + 15;
                int var42 = field1341 + 180 - 80;
                short var43 = 321;
                Statics.field1335.method4860(var42 - 73, var43 - 20);
                arg0.method4563(class233.field3173, var42, var43 + 5, 16777215, 0);
                int var44 = field1341 + 180 + 80;
                Statics.field1335.method4860(var44 - 73, var43 - 20);
                arg0.method4563(class233.field3162, var44, var43 + 5, 16777215, 0);
                arg1.method4563(class233.field2966, field1341 + 180, var43 + 36, 255, 0);
            } else if (field1338 == 5) {
                arg0.method4563(class233.field3087, field1341 + 180, 201, 16776960, 0);
                short var45 = 221;
                arg2.method4563(field1353, field1341 + 180, var45, 16776960, 0);
                int var107 = var45 + 15;
                arg2.method4563(field1354, field1341 + 180, var107, 16776960, 0);
                int var108 = var107 + 15;
                arg2.method4563(field1355, field1341 + 180, var108, 16776960, 0);
                int var109 = var108 + 15;
                int var110 = var109 + 14;
                arg0.method4560(class233.field3097, field1341 + 180 - 145, var110, 16777215, 0);
                short var46 = 174;
                String var47 = Statics.field2494.field1233 ? class278.method3551(field1343) : field1343;
                String var48;
                for (var48 = var47; arg0.method4555(var48) > var46; var48 = var48.substring(1)) {
                }
                arg0.method4560(class272.method4559(var48) + (client.field1054 % 40 < 20 ? class88.method2738(16776960) + class88.field1312 : ""), field1341 + 180 - 34, var110, 16777215, 0);
                var107 = var110 + 15;
                int var49 = field1341 + 180 - 80;
                short var50 = 321;
                Statics.field1335.method4860(var49 - 73, var50 - 20);
                arg0.method4563(class233.field3049, var49, var50 + 5, 16777215, 0);
                int var51 = field1341 + 180 + 80;
                Statics.field1335.method4860(var51 - 73, var50 - 20);
                arg0.method4563(class233.field3174, var51, var50 + 5, 16777215, 0);
            } else if (field1338 == 6) {
                short var52 = 201;
                arg0.method4563(field1353, field1341 + 180, var52, 16776960, 0);
                int var111 = var52 + 15;
                arg0.method4563(field1354, field1341 + 180, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg0.method4563(field1355, field1341 + 180, var112, 16776960, 0);
                int var113 = var112 + 15;
                int var53 = field1341 + 180;
                short var54 = 321;
                Statics.field1335.method4860(var53 - 73, var54 - 20);
                arg0.method4563(class233.field3174, var53, var54 + 5, 16777215, 0);
            }
        }
        if (field1367 > 0) {
            int var55 = field1367;
            short var56 = 256;
            field1345 += var55 * 128;
            if (field1345 > Statics.field3244.length) {
                field1345 -= Statics.field3244.length;
                int var57 = (int) (Math.random() * 12.0D);
                method1029(Statics.field1336[var57]);
            }
            int var58 = 0;
            int var59 = var55 * 128;
            int var60 = (var56 - var55) * 128;
            for (int var61 = 0; var61 < var60; var61++) {
                int var62 = Statics.field1289[var58 + var59] - Statics.field3244[field1345 + var58 & Statics.field3244.length - 1] * var55 / 6;
                if (var62 < 0) {
                    var62 = 0;
                }
                Statics.field1289[var58++] = var62;
            }
            for (int var63 = var56 - var55; var63 < var56; var63++) {
                int var64 = var63 * 128;
                for (int var65 = 0; var65 < 128; var65++) {
                    int var66 = (int) (Math.random() * 100.0D);
                    if (var66 < 50 && var65 > 10 && var65 < 118) {
                        Statics.field1289[var64 + var65] = 255;
                    } else {
                        Statics.field1289[var64 + var65] = 0;
                    }
                }
            }
            if (field1332 > 0) {
                field1332 -= var55 * 4;
            }
            if (field1344 > 0) {
                field1344 -= var55 * 4;
            }
            if (field1332 == 0 && field1344 == 0) {
                int var67 = (int) (Math.random() * (double) (2000 / var55));
                if (var67 == 0) {
                    field1332 = 1024;
                }
                if (var67 == 1) {
                    field1344 = 1024;
                }
            }
            for (int var68 = 0; var68 < var56 - var55; var68++) {
                field1370[var68] = field1370[var55 + var68];
            }
            for (int var69 = var56 - var55; var69 < var56; var69++) {
                field1370[var69] = (int) (Math.sin((double) field1348 / 14.0D) * 16.0D + Math.sin((double) field1348 / 15.0D) * 14.0D + Math.sin((double) field1348 / 16.0D) * 12.0D);
                field1348++;
            }
            field1346 += var55 * -1016978053;
            int var70 = ((client.field1054 & 0x1) + var55) / 2;
            if (var70 > 0) {
                for (int var71 = 0; var71 < field1346 * -1064146452; var71++) {
                    int var72 = (int) (Math.random() * 124.0D) + 2;
                    int var73 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1289[(var73 << 7) + var72] = 192;
                }
                field1346 = 0;
                int var74 = 0;
                label234: while (true) {
                    if (var74 >= var56) {
                        int var78 = 0;
                        while (true) {
                            if (var78 >= 128) {
                                break label234;
                            }
                            int var79 = 0;
                            for (int var80 = -var70; var80 < var56; var80++) {
                                int var81 = var80 * 128;
                                if (var70 + var80 < var56) {
                                    var79 += Statics.field282[var70 * 128 + var78 + var81];
                                }
                                if (var80 - (var70 + 1) >= 0) {
                                    var79 -= Statics.field282[var78 + var81 - (var70 + 1) * 128];
                                }
                                if (var80 >= 0) {
                                    Statics.field1289[var78 + var81] = var79 / (var70 * 2 + 1);
                                }
                            }
                            var78++;
                        }
                    }
                    int var75 = 0;
                    int var76 = var74 * 128;
                    for (int var77 = -var70; var77 < 128; var77++) {
                        if (var70 + var77 < 128) {
                            var75 += Statics.field1289[var76 + var77 + var70];
                        }
                        if (var77 - (var70 + 1) >= 0) {
                            var75 -= Statics.field1289[var76 + var77 - (var70 + 1)];
                        }
                        if (var77 >= 0) {
                            Statics.field282[var76 + var77] = var75 / (var70 * 2 + 1);
                        }
                    }
                    var74++;
                }
            }
            field1367 = 0;
        }
        method3764();
        Statics.field1340[Statics.field2494.field1229 ? 1 : 0].method4860(field1333 + 765 - 40, 463);
        if (client.field877 <= 5 || client.field1061 != 0) {
            return;
        }
        if (Statics.field751 == null) {
            Statics.field751 = class296.method4138(Statics.field1426, "sl_button", "");
            return;
        }
        int var82 = field1333 + 5;
        short var83 = 463;
        byte var84 = 100;
        byte var85 = 35;
        Statics.field751.method4860(var82, var83);
        arg0.method4563(class233.field3088 + " " + client.field871, var84 / 2 + var82, var85 / 2 + var83 - 2, 16777215, 0);
        if (Statics.field826 == null) {
            arg1.method4563(class233.field3206, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
        } else {
            arg1.method4563(class233.field3205, var84 / 2 + var82, var85 / 2 + var83 + 12, 16777215, 0);
        }
    }

    @ObfuscatedName("b.n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method39(String arg0, String arg1, String arg2) {
        field1353 = arg0;
        field1354 = arg1;
        field1355 = arg2;
    }

    @ObfuscatedName("ba.c(Lko;I)V")
    public static final void method1029(class294 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field3244.length; var2++) {
            Statics.field3244[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field3244[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field467[var8] = (Statics.field3244[var8 - 1] + Statics.field3244[var8 + 1] + Statics.field3244[var8 - 128] + Statics.field3244[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field3244;
            Statics.field3244 = Statics.field467;
            Statics.field467 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field3833; var11++) {
            for (int var12 = 0; var12 < arg0.field3834; var12++) {
                if (arg0.field3838[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field3835;
                    int var14 = var11 + 16 + arg0.field3831;
                    int var15 = (var14 << 7) + var13;
                    Statics.field3244[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("df.a(IIIS)I")
    public static final int method2020(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("hc.y(I)V")
    public static final void method3764() {
        short var0 = 256;
        if (field1332 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1332 > 768) {
                    Statics.field3654[var1] = method2020(Statics.field868[var1], Statics.field1459[var1], 1024 - field1332);
                } else if (field1332 > 256) {
                    Statics.field3654[var1] = Statics.field1459[var1];
                } else {
                    Statics.field3654[var1] = method2020(Statics.field1459[var1], Statics.field868[var1], 256 - field1332);
                }
            }
        } else if (field1344 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1344 > 768) {
                    Statics.field3654[var2] = method2020(Statics.field868[var2], Statics.field822[var2], 1024 - field1344);
                } else if (field1344 > 256) {
                    Statics.field3654[var2] = Statics.field822[var2];
                } else {
                    Statics.field3654[var2] = method2020(Statics.field822[var2], Statics.field868[var2], 256 - field1344);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field3654[var3] = Statics.field868[var3];
            }
        }
        class291.method4833(field1333, 9, field1333 + 128, var0 + 7);
        Statics.field1337.method4890(field1333, 0);
        class291.method4768();
        int var4 = 0;
        int var5 = field1333 + Statics.field780.field3821 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1370[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1289[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field3654[var10];
                    int var14 = Statics.field780.field3822[var5];
                    Statics.field780.field3822[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field780.field3821 + var8 - 128;
        }
        class291.method4833(field1333 + 765 - 128, 9, field1333 + 765, var0 + 7);
        Statics.field1369.method4890(field1333 + 382, 0);
        class291.method4768();
        int var15 = 0;
        int var16 = field1333 + Statics.field780.field3821 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1370[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1289[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field3654[var22];
                    int var26 = Statics.field780.field3822[var20];
                    Statics.field780.field3822[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field780.field3821 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("at.w(Ljt;Ljt;I)V")
    public static void method499(class271 arg0, class271 arg1) {
        if (Statics.field411 == null) {
            Statics.field411 = class296.method3223(Statics.field1426, "sl_back", "");
        }
        if (Statics.field3432 == null) {
            Statics.field3432 = class296.method2775(Statics.field1426, "sl_flags", "");
        }
        if (Statics.field652 == null) {
            Statics.field652 = class296.method2775(Statics.field1426, "sl_arrows", "");
        }
        if (Statics.field351 == null) {
            Statics.field351 = class296.method2775(Statics.field1426, "sl_stars", "");
        }
        class291.method4776(field1333, 23, 765, 480, 0);
        class291.method4780(field1333, 0, 125, 23, 12425273, 9135624);
        class291.method4780(field1333 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4563(class233.field3196, field1333 + 62, 15, 0, -1);
        if (Statics.field351 != null) {
            Statics.field351[1].method4860(field1333 + 140, 1);
            arg1.method4560(class233.field3197, field1333 + 152, 10, 16777215, -1);
            Statics.field351[0].method4860(field1333 + 140, 12);
            arg1.method4560(class233.field3198, field1333 + 152, 21, 16777215, -1);
        }
        if (Statics.field652 != null) {
            int var2 = field1333 + 280;
            if (class80.field1214[0] == 0 && class80.field1220[0] == 0) {
                Statics.field652[2].method4860(var2, 4);
            } else {
                Statics.field652[0].method4860(var2, 4);
            }
            if (class80.field1214[0] == 0 && class80.field1220[0] == 1) {
                Statics.field652[3].method4860(var2 + 15, 4);
            } else {
                Statics.field652[1].method4860(var2 + 15, 4);
            }
            arg0.method4560(class233.field3199, var2 + 32, 17, 16777215, -1);
            int var3 = field1333 + 390;
            if (class80.field1214[0] == 1 && class80.field1220[0] == 0) {
                Statics.field652[2].method4860(var3, 4);
            } else {
                Statics.field652[0].method4860(var3, 4);
            }
            if (class80.field1214[0] == 1 && class80.field1220[0] == 1) {
                Statics.field652[3].method4860(var3 + 15, 4);
            } else {
                Statics.field652[1].method4860(var3 + 15, 4);
            }
            arg0.method4560(class233.field3200, var3 + 32, 17, 16777215, -1);
            int var4 = field1333 + 500;
            if (class80.field1214[0] == 2 && class80.field1220[0] == 0) {
                Statics.field652[2].method4860(var4, 4);
            } else {
                Statics.field652[0].method4860(var4, 4);
            }
            if (class80.field1214[0] == 2 && class80.field1220[0] == 1) {
                Statics.field652[3].method4860(var4 + 15, 4);
            } else {
                Statics.field652[1].method4860(var4 + 15, 4);
            }
            arg0.method4560(class233.field3201, var4 + 32, 17, 16777215, -1);
            int var5 = field1333 + 610;
            if (class80.field1214[0] == 3 && class80.field1220[0] == 0) {
                Statics.field652[2].method4860(var5, 4);
            } else {
                Statics.field652[0].method4860(var5, 4);
            }
            if (class80.field1214[0] == 3 && class80.field1220[0] == 1) {
                Statics.field652[3].method4860(var5 + 15, 4);
            } else {
                Statics.field652[1].method4860(var5 + 15, 4);
            }
            arg0.method4560(class233.field3202, var5 + 32, 17, 16777215, -1);
        }
        class291.method4776(field1333 + 708, 4, 50, 16, 0);
        arg1.method4563(class233.field3162, field1333 + 708 + 25, 16, 16777215, -1);
        field1356 = -1;
        if (Statics.field411 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class80.field1216) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class80.field1216) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class80.field1216) {
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
            int var17 = field1333 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class80.field1216; var20++) {
                class80 var21 = Statics.field2694[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1222);
                if (var21.field1222 == -1) {
                    var23 = class233.field3139;
                    var22 = false;
                } else if (var21.field1222 > 1980) {
                    var23 = class233.field3204;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1493()) {
                    if (var21.method1494()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1510()) {
                    var24 = 16711680;
                    if (var21.method1494()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1491()) {
                    if (var21.method1494()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1494()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class60.field705 >= var17 && class60.field709 >= var16 && class60.field705 < var6 + var17 && class60.field709 < var7 + var16 && var22) {
                    field1356 = var20;
                    Statics.field411[var25].method4896(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field411[var25].method4890(var17, var16);
                }
                if (Statics.field3432 != null) {
                    Statics.field3432[(var21.method1494() ? 8 : 0) + var21.field1225].method4860(var17 + 29, var16);
                }
                arg0.method4563(Integer.toString(var21.field1219), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method4563(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method4555(Statics.field2694[field1356].field1224) + 6;
                int var27 = arg1.field3698 + 8;
                class291.method4776(class60.field705 - var26 / 2, class60.field709 + 20 + 5, var26, var27, 16777120);
                class291.method4782(class60.field705 - var26 / 2, class60.field709 + 20 + 5, var26, var27, 0);
                arg1.method4563(Statics.field2694[field1356].field1224, class60.field705, class60.field709 + 20 + 5 + arg1.field3698 + 4, 0, -1);
            }
        }
        Statics.field780.method776(0, 0);
    }

    @ObfuscatedName("z.k(Lbn;B)V")
    public static void method163(class59 arg0) {
        if (class60.field714 != 1 && Statics.field1400 || class60.field714 != 4) {
            return;
        }
        int var1 = field1333 + 280;
        if (class60.field715 >= var1 && class60.field715 <= var1 + 14 && class60.field716 >= 4 && class60.field716 <= 18) {
            class80.method677(0, 0);
            return;
        }
        if (class60.field715 >= var1 + 15 && class60.field715 <= var1 + 80 && class60.field716 >= 4 && class60.field716 <= 18) {
            class80.method677(0, 1);
            return;
        }
        int var2 = field1333 + 390;
        if (class60.field715 >= var2 && class60.field715 <= var2 + 14 && class60.field716 >= 4 && class60.field716 <= 18) {
            class80.method677(1, 0);
            return;
        }
        if (class60.field715 >= var2 + 15 && class60.field715 <= var2 + 80 && class60.field716 >= 4 && class60.field716 <= 18) {
            class80.method677(1, 1);
            return;
        }
        int var3 = field1333 + 500;
        if (class60.field715 >= var3 && class60.field715 <= var3 + 14 && class60.field716 >= 4 && class60.field716 <= 18) {
            class80.method677(2, 0);
            return;
        }
        if (class60.field715 >= var3 + 15 && class60.field715 <= var3 + 80 && class60.field716 >= 4 && class60.field716 <= 18) {
            class80.method677(2, 1);
            return;
        }
        int var4 = field1333 + 610;
        if (class60.field715 >= var4 && class60.field715 <= var4 + 14 && class60.field716 >= 4 && class60.field716 <= 18) {
            class80.method677(3, 0);
            return;
        }
        if (class60.field715 >= var4 + 15 && class60.field715 <= var4 + 80 && class60.field716 >= 4 && class60.field716 <= 18) {
            class80.method677(3, 1);
            return;
        }
        if (class60.field715 >= field1333 + 708 && class60.field716 >= 4 && class60.field715 <= field1333 + 708 + 50 && class60.field716 <= 20) {
            field1357 = false;
            Statics.field1337.method4890(field1333, 0);
            Statics.field1369.method4890(field1333 + 382, 0);
            Statics.field1342.method4860(field1333 + 382 - Statics.field1342.field3834 / 2, 18);
            return;
        }
        if (field1356 == -1) {
            return;
        }
        class80 var5 = Statics.field2694[field1356];
        method1103(var5);
        field1357 = false;
        Statics.field1337.method4890(field1333, 0);
        Statics.field1369.method4890(field1333 + 382, 0);
        Statics.field1342.method4860(field1333 + 382 - Statics.field1342.field3834 / 2, 18);
        return;
    }

    @ObfuscatedName("bh.t(Lcd;I)V")
    public static void method1103(class80 arg0) {
        if (arg0.method1494() != client.field874) {
            client.field874 = arg0.method1494();
            boolean var1 = arg0.method1494();
            if (Statics.field3334 != var1) {
                class264.method1359();
                Statics.field3334 = var1;
            }
        }
        Statics.field2130 = arg0.field1223;
        client.field871 = arg0.field1219;
        client.field872 = arg0.field1212;
        Statics.field1457 = client.field873 == 0 ? 43594 : arg0.field1219 + 40000;
        Statics.field816 = client.field873 == 0 ? 443 : arg0.field1219 + 50000;
        Statics.field251 = Statics.field1457;
    }
}

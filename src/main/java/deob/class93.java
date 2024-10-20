package deob;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("cr")
public class class93 {

    @ObfuscatedName("cr.h")
    public static int field1417 = 0;

    @ObfuscatedName("cr.j")
    public static int field1423 = field1417 + 202;

    @ObfuscatedName("cr.d")
    public static int[] field1424 = new int[256];

    @ObfuscatedName("cr.w")
    public static int field1425 = 0;

    @ObfuscatedName("cr.f")
    public static int field1420 = 0;

    @ObfuscatedName("cr.az")
    public static int field1427 = 0;

    @ObfuscatedName("cr.ac")
    public static int field1419 = 0;

    @ObfuscatedName("cr.aq")
    public static int field1446 = 0;

    @ObfuscatedName("cr.af")
    public static int field1416 = 0;

    @ObfuscatedName("cr.aj")
    public static int field1431 = 10;

    @ObfuscatedName("cr.ax")
    public static String field1432 = "";

    @ObfuscatedName("cr.ad")
    public static int field1433 = 0;

    @ObfuscatedName("cr.av")
    public static String field1429 = "";

    @ObfuscatedName("cr.ae")
    public static String field1435 = "";

    @ObfuscatedName("cr.ar")
    public static String field1436 = "";

    @ObfuscatedName("cr.ag")
    public static String field1440 = "";

    @ObfuscatedName("cr.at")
    public static String field1438 = "";

    @ObfuscatedName("cr.ai")
    public static String field1439 = "";

    @ObfuscatedName("cr.ao")
    public static class150 field1437 = class150.field2180;

    @ObfuscatedName("cr.as")
    public static boolean field1441 = true;

    @ObfuscatedName("cr.aw")
    public static int field1442 = 0;

    @ObfuscatedName("cr.al")
    public static String field1422 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("cr.ak")
    public static String field1444 = "1234567890";

    @ObfuscatedName("cr.an")
    public static boolean field1445 = false;

    @ObfuscatedName("cr.bf")
    public static int field1447 = -1;

    public class93() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bo.i(Liy;Liy;B)I")
    public static int method1010(class236 arg0, class236 arg1) {
        int var2 = 0;
        if (arg0.method3855("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3855("logo", "")) {
            var2++;
        }
        if (arg1.method3855("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3855("titlebox", "")) {
            var2++;
        }
        if (arg1.method3855("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3855("runes", "")) {
            var2++;
        }
        if (arg1.method3855("title_mute", "")) {
            var2++;
        }
        if (arg1.method3855("options_radio_buttons,0", "")) {
            var2++;
        }
        if (arg1.method3855("options_radio_buttons,2", "")) {
            var2++;
        }
        arg1.method3855("sl_back", "");
        arg1.method3855("sl_flags", "");
        arg1.method3855("sl_arrows", "");
        arg1.method3855("sl_stars", "");
        arg1.method3855("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ic.h(Liy;Liy;ZIB)V")
    public static void method3986(class236 arg0, class236 arg1, boolean arg2, int arg3) {
        if (!Statics.field1428) {
            field1433 = arg3;
            class282.method4636();
            byte[] var4 = arg0.method3854("title.jpg", "");
            Statics.field1430 = class55.method2726(var4);
            Statics.field3673 = Statics.field1430.method4802();
            if ((client.field893 & 0x20000000) == 0) {
                Statics.field3671 = class287.method3985(arg1, "logo", "");
            } else {
                Statics.field3671 = class287.method3985(arg1, "logo_deadman_mode", "");
            }
            Statics.field1418 = class287.method3985(arg1, "titlebox", "");
            Statics.field1426 = class287.method3985(arg1, "titlebutton", "");
            Statics.field420 = class287.method735(arg1, "runes", "");
            Statics.field1393 = class287.method735(arg1, "title_mute", "");
            Statics.field1421 = class287.method3985(arg1, "options_radio_buttons,0", "");
            Statics.field677 = class287.method3985(arg1, "options_radio_buttons,2", "");
            Statics.field1266 = new int[256];
            for (int var5 = 0; var5 < 64; var5++) {
                Statics.field1266[var5] = var5 * 262144;
            }
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1266[var6 + 64] = var6 * 1024 + 16711680;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1266[var7 + 128] = var7 * 4 + 16776960;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1266[var8 + 192] = 16777215;
            }
            Statics.field366 = new int[256];
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field366[var9] = var9 * 1024;
            }
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field366[var10 + 64] = var10 * 4 + 65280;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field366[var11 + 128] = var11 * 262144 + 65535;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field366[var12 + 192] = 16777215;
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
            Statics.field431 = new int[256];
            Statics.field438 = new int[32768];
            Statics.field1290 = new int[32768];
            Statics.method1003((class285) null);
            Statics.field34 = new int[32768];
            Statics.field1848 = new int[32768];
            if (arg2) {
                field1438 = "";
                field1439 = "";
            }
            Statics.field2399 = 0;
            Statics.field1776 = "";
            field1441 = true;
            field1445 = false;
            if (Statics.field1990.field1286) {
                class204.field2499 = 1;
                Statics.field3381 = null;
                Statics.field2326 = -1;
                Statics.field2500 = -1;
                Statics.field2501 = 0;
                Statics.field2496 = false;
                Statics.field2502 = 2;
            } else {
                class238 var17 = Statics.field575;
                int var18 = var17.method3851("scape main");
                int var19 = var17.method3852(var18, "");
                class204.method55(2, var17, var18, var19, 255, false);
            }
            class239.method1613(false);
            Statics.field1428 = true;
            field1417 = (Statics.field3627 - 765) / 2;
            field1423 = field1417 + 202;
            Statics.field1430.method4754(field1417, 0);
            Statics.field3673.method4754(field1417 + 382, 0);
            Statics.field3671.method4725(field1417 + 382 - Statics.field3671.field3766 / 2, 18);
        } else if (arg3 == 4) {
            field1433 = 4;
        }
    }

    @ObfuscatedName("cb.u(I)V")
    public static void method1467() {
        if (!Statics.field1428) {
            return;
        }
        Statics.field1418 = null;
        Statics.field1426 = null;
        Statics.field420 = null;
        Statics.field1430 = null;
        Statics.field3673 = null;
        Statics.field3671 = null;
        Statics.field1393 = null;
        Statics.field1421 = null;
        Statics.field677 = null;
        Statics.field2258 = null;
        Statics.field2379 = null;
        Statics.field585 = null;
        Statics.field1545 = null;
        Statics.field519 = null;
        Statics.field1266 = null;
        Statics.field366 = null;
        Statics.field11 = null;
        Statics.field431 = null;
        Statics.field438 = null;
        Statics.field1290 = null;
        Statics.field34 = null;
        Statics.field1848 = null;
        class204.field2499 = 1;
        Statics.field3381 = null;
        Statics.field2326 = -1;
        Statics.field2500 = -1;
        Statics.field2501 = 0;
        Statics.field2496 = false;
        Statics.field2502 = 2;
        class239.method1613(true);
        Statics.field1428 = false;
    }

    @ObfuscatedName("dn.q(Lbh;I)V")
    public static void method2223(class59 arg0) {
        if (!field1445) {
            if ((class60.field728 == 1 || !Statics.field2179 && class60.field728 == 4) && class60.field718 >= field1417 + 765 - 50 && class60.field730 >= 453) {
                Statics.field1990.field1286 = !Statics.field1990.field1286;
                class82.method2307();
                if (Statics.field1990.field1286) {
                    Statics.field502.method3508();
                    class204.field2499 = 1;
                    Statics.field3381 = null;
                } else {
                    class204.method2198(Statics.field575, "scape main", "", 255, false);
                }
            }
            if (client.field898 != 5) {
                field1446++;
                if (client.field898 == 10 || client.field898 == 11) {
                    if (client.field897 == 0) {
                        if (class60.field728 == 1 || !Statics.field2179 && class60.field728 == 4) {
                            int var6 = field1417 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class60.field718 >= var6 && class60.field718 <= var6 + var8 && class60.field730 >= var7 && class60.field730 <= var7 + var9) {
                                method114();
                                return;
                            }
                        }
                        if (Statics.field1280 != null) {
                            method114();
                        }
                    }
                    int var10 = class60.field728;
                    int var11 = class60.field718;
                    int var12 = class60.field730;
                    if (!Statics.field2179 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field1433 == 0) {
                        boolean var13 = false;
                        while (Statics.method62()) {
                            if (Statics.field626 == 84) {
                                var13 = true;
                            }
                        }
                        int var14 = field1423 + 180 - 80;
                        short var15 = 291;
                        if (var10 == 1 && var11 >= var14 - 75 && var11 <= var14 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20) {
                            class57.method40(client.method172("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var16 = field1423 + 180 + 80;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var15 - 20 && var12 <= var15 + 20 || var13) {
                            if ((client.field893 & 0x2000000) != 0) {
                                field1429 = "";
                                field1435 = class226.field3066;
                                field1436 = class226.field2930;
                                field1440 = class226.field3068;
                                field1433 = 1;
                                field1442 = 0;
                            } else if ((client.field893 & 0x4) != 0) {
                                if ((client.field893 & 0x400) == 0) {
                                    field1435 = class226.field3057;
                                    field1436 = class226.field3058;
                                    field1440 = class226.field3059;
                                } else {
                                    field1435 = class226.field3063;
                                    field1436 = class226.field3064;
                                    field1440 = class226.field3065;
                                }
                                field1429 = class226.field3056;
                                field1433 = 1;
                                field1442 = 0;
                            } else if ((client.field893 & 0x400) == 0) {
                                field1435 = class226.field2978;
                                field1436 = class226.field3054;
                                field1440 = class226.field3055;
                                field1433 = 2;
                                field1442 = 0;
                            } else {
                                field1435 = class226.field3060;
                                field1436 = class226.field3061;
                                field1440 = class226.field3062;
                                field1429 = class226.field3056;
                                field1433 = 1;
                                field1442 = 0;
                            }
                        }
                    } else if (field1433 == 1) {
                        while (Statics.method62()) {
                            if (Statics.field626 == 84) {
                                field1435 = class226.field2978;
                                field1436 = class226.field3054;
                                field1440 = class226.field3055;
                                field1433 = 2;
                                field1442 = 0;
                            } else if (Statics.field626 == 13) {
                                field1433 = 0;
                            }
                        }
                        int var17 = field1423 + 180 - 80;
                        short var18 = 321;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field1435 = class226.field2978;
                            field1436 = class226.field3054;
                            field1440 = class226.field3055;
                            field1433 = 2;
                            field1442 = 0;
                        }
                        int var19 = field1423 + 180 + 80;
                        if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field1433 = 0;
                        }
                    } else if (field1433 == 2) {
                        short var20 = 231;
                        int var42 = var20 + 30;
                        if (var10 == 1 && var12 >= var42 - 15 && var12 < var42) {
                            field1442 = 0;
                        }
                        var42 += 15;
                        if (var10 == 1 && var12 >= var42 - 15 && var12 < var42) {
                            field1442 = 1;
                        }
                        var42 += 15;
                        short var21 = 361;
                        if (var10 == 1 && var12 >= var21 - 15 && var12 < var21) {
                            method3114(class226.field3092, class226.field3093, class226.field3094);
                            field1433 = 5;
                            return;
                        }
                        int var22 = field1423 + 180 - 80;
                        short var23 = 321;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field1438 = field1438.trim();
                            if (field1438.length() == 0) {
                                method3114(class226.field3015, class226.field2960, class226.field2961);
                                return;
                            }
                            if (field1439.length() == 0) {
                                method3114(class226.field2962, class226.field2963, class226.field2964);
                                return;
                            }
                            method3114(class226.field3084, class226.field3072, class226.field2846);
                            field1437 = Statics.field1990.field1288.containsKey(class271.method3824(field1438)) ? class150.field2182 : class150.field2180;
                            client.method54(20);
                            return;
                        }
                        int var24 = field1423 + 180 + 80;
                        if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field1433 = 0;
                            field1438 = "";
                            field1439 = "";
                            Statics.field2399 = 0;
                            Statics.field1776 = "";
                            field1441 = true;
                        }
                        while (true) {
                            while (Statics.method62()) {
                                boolean var25 = false;
                                for (int var26 = 0; var26 < field1422.length(); var26++) {
                                    if (Statics.field342 == field1422.charAt(var26)) {
                                        var25 = true;
                                        break;
                                    }
                                }
                                if (Statics.field626 == 13) {
                                    field1433 = 0;
                                    field1438 = "";
                                    field1439 = "";
                                    Statics.field2399 = 0;
                                    Statics.field1776 = "";
                                    field1441 = true;
                                } else if (field1442 == 0) {
                                    if (Statics.field626 == 85 && field1438.length() > 0) {
                                        field1438 = field1438.substring(0, field1438.length() - 1);
                                    }
                                    if (Statics.field626 == 84 || Statics.field626 == 80) {
                                        field1442 = 1;
                                    }
                                    if (var25 && field1438.length() < 320) {
                                        field1438 = field1438 + Statics.field342;
                                    }
                                } else if (field1442 == 1) {
                                    if (Statics.field626 == 85 && field1439.length() > 0) {
                                        field1439 = field1439.substring(0, field1439.length() - 1);
                                    }
                                    if (Statics.field626 == 84 || Statics.field626 == 80) {
                                        field1442 = 0;
                                    }
                                    if (Statics.field626 == 84) {
                                        field1438 = field1438.trim();
                                        if (field1438.length() == 0) {
                                            method3114(class226.field3015, class226.field2960, class226.field2961);
                                            return;
                                        }
                                        if (field1439.length() == 0) {
                                            method3114(class226.field2962, class226.field2963, class226.field2964);
                                            return;
                                        }
                                        method3114(class226.field3084, class226.field3072, class226.field2846);
                                        field1437 = Statics.field1990.field1288.containsKey(class271.method3824(field1438)) ? class150.field2182 : class150.field2180;
                                        client.method54(20);
                                        return;
                                    }
                                    if (var25 && field1439.length() < 20) {
                                        field1439 = field1439 + Statics.field342;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field1433 == 3) {
                        int var27 = field1423 + 180;
                        short var28 = 276;
                        if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var28 - 20 && var12 <= var28 + 20) {
                            field1435 = class226.field2978;
                            field1436 = class226.field3054;
                            field1440 = class226.field3055;
                            field1433 = 2;
                            field1442 = 0;
                        }
                        int var29 = field1423 + 180;
                        short var30 = 326;
                        if (var10 == 1 && var11 >= var29 - 75 && var11 <= var29 + 75 && var12 >= var30 - 20 && var12 <= var30 + 20) {
                            method3114(class226.field3092, class226.field3093, class226.field3094);
                            field1433 = 5;
                            return;
                        }
                    } else if (field1433 == 4) {
                        int var31 = field1423 + 180 - 80;
                        short var32 = 321;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            Statics.field1776.trim();
                            if (Statics.field1776.length() != 6) {
                                method3114(class226.field3078, class226.field2879, class226.field2880);
                                return;
                            }
                            Statics.field2399 = Integer.parseInt(Statics.field1776);
                            Statics.field1776 = "";
                            field1437 = field1441 ? class150.field2187 : class150.field2181;
                            method3114(class226.field3084, class226.field3072, class226.field2846);
                            client.method54(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field1423 + 180 - 9 && var11 <= field1423 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field1441 = !field1441;
                        }
                        if (var10 == 1 && var11 >= field1423 + 180 - 34 && var11 <= field1423 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class57.method40(client.method172("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var33 = field1423 + 180 + 80;
                        if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var32 - 20 && var12 <= var32 + 20) {
                            field1433 = 0;
                            field1438 = "";
                            field1439 = "";
                            Statics.field2399 = 0;
                            Statics.field1776 = "";
                        }
                        while (Statics.method62()) {
                            boolean var34 = false;
                            for (int var35 = 0; var35 < field1444.length(); var35++) {
                                if (Statics.field342 == field1444.charAt(var35)) {
                                    var34 = true;
                                    break;
                                }
                            }
                            if (Statics.field626 == 13) {
                                field1433 = 0;
                                field1438 = "";
                                field1439 = "";
                                Statics.field2399 = 0;
                                Statics.field1776 = "";
                            } else {
                                if (Statics.field626 == 85 && Statics.field1776.length() > 0) {
                                    Statics.field1776 = Statics.field1776.substring(0, Statics.field1776.length() - 1);
                                }
                                if (Statics.field626 == 84) {
                                    Statics.field1776.trim();
                                    if (Statics.field1776.length() != 6) {
                                        method3114(class226.field3078, class226.field2879, class226.field2880);
                                        return;
                                    }
                                    Statics.field2399 = Integer.parseInt(Statics.field1776);
                                    Statics.field1776 = "";
                                    field1437 = field1441 ? class150.field2187 : class150.field2181;
                                    method3114(class226.field3084, class226.field3072, class226.field2846);
                                    client.method54(20);
                                    return;
                                }
                                if (var34 && Statics.field1776.length() < 6) {
                                    Statics.field1776 = Statics.field1776 + Statics.field342;
                                }
                            }
                        }
                    } else if (field1433 == 5) {
                        int var36 = field1423 + 180 - 80;
                        short var37 = 321;
                        if (var10 == 1 && var11 >= var36 - 75 && var11 <= var36 + 75 && var12 >= var37 - 20 && var12 <= var37 + 20) {
                            method1403();
                            return;
                        }
                        int var38 = field1423 + 180 + 80;
                        if (var10 == 1 && var11 >= var38 - 75 && var11 <= var38 + 75 && var12 >= var37 - 20 && var12 <= var37 + 20) {
                            field1435 = class226.field2978;
                            field1436 = class226.field3054;
                            field1440 = class226.field3055;
                            field1433 = 2;
                            field1442 = 0;
                            field1439 = "";
                        }
                        while (Statics.method62()) {
                            boolean var39 = false;
                            for (int var40 = 0; var40 < field1422.length(); var40++) {
                                if (Statics.field342 == field1422.charAt(var40)) {
                                    var39 = true;
                                    break;
                                }
                            }
                            if (Statics.field626 == 13) {
                                field1435 = class226.field2978;
                                field1436 = class226.field3054;
                                field1440 = class226.field3055;
                                field1433 = 2;
                                field1442 = 0;
                                field1439 = "";
                            } else {
                                if (Statics.field626 == 85 && field1438.length() > 0) {
                                    field1438 = field1438.substring(0, field1438.length() - 1);
                                }
                                if (Statics.field626 == 84) {
                                    method1403();
                                    return;
                                }
                                if (var39 && field1438.length() < 320) {
                                    field1438 = field1438 + Statics.field342;
                                }
                            }
                        }
                    } else if (field1433 == 6) {
                        while (true) {
                            do {
                                if (!Statics.method62()) {
                                    short var41 = 321;
                                    if (var10 == 1 && var12 >= var41 - 20 && var12 <= var41 + 20) {
                                        field1435 = class226.field2978;
                                        field1436 = class226.field3054;
                                        field1440 = class226.field3055;
                                        field1433 = 2;
                                        field1442 = 0;
                                        field1439 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field626 != 84 && Statics.field626 != 13);
                            field1435 = class226.field2978;
                            field1436 = class226.field3054;
                            field1440 = class226.field3055;
                            field1433 = 2;
                            field1442 = 0;
                            field1439 = "";
                        }
                    }
                }
            }
        } else if (class60.field728 == 1 || !Statics.field2179 && class60.field728 == 4) {
            int var1 = field1417 + 280;
            if (class60.field718 >= var1 && class60.field718 <= var1 + 14 && class60.field730 >= 4 && class60.field730 <= 18) {
                class81.method464(0, 0);
            } else if (class60.field718 >= var1 + 15 && class60.field718 <= var1 + 80 && class60.field730 >= 4 && class60.field730 <= 18) {
                class81.method464(0, 1);
            } else {
                int var2 = field1417 + 390;
                if (class60.field718 >= var2 && class60.field718 <= var2 + 14 && class60.field730 >= 4 && class60.field730 <= 18) {
                    class81.method464(1, 0);
                } else if (class60.field718 >= var2 + 15 && class60.field718 <= var2 + 80 && class60.field730 >= 4 && class60.field730 <= 18) {
                    class81.method464(1, 1);
                } else {
                    int var3 = field1417 + 500;
                    if (class60.field718 >= var3 && class60.field718 <= var3 + 14 && class60.field730 >= 4 && class60.field730 <= 18) {
                        class81.method464(2, 0);
                    } else if (class60.field718 >= var3 + 15 && class60.field718 <= var3 + 80 && class60.field730 >= 4 && class60.field730 <= 18) {
                        class81.method464(2, 1);
                    } else {
                        int var4 = field1417 + 610;
                        if (class60.field718 >= var4 && class60.field718 <= var4 + 14 && class60.field730 >= 4 && class60.field730 <= 18) {
                            class81.method464(3, 0);
                        } else if (class60.field718 >= var4 + 15 && class60.field718 <= var4 + 80 && class60.field730 >= 4 && class60.field730 <= 18) {
                            class81.method464(3, 1);
                        } else if (class60.field718 >= field1417 + 708 && class60.field730 >= 4 && class60.field718 <= field1417 + 708 + 50 && class60.field730 <= 20) {
                            field1445 = false;
                            Statics.field1430.method4754(field1417, 0);
                            Statics.field3673.method4754(field1417 + 382, 0);
                            Statics.field3671.method4725(field1417 + 382 - Statics.field3671.field3766 / 2, 18);
                        } else if (field1447 != -1) {
                            class81 var5 = Statics.field1277[field1447];
                            method1602(var5);
                            field1445 = false;
                            Statics.field1430.method4754(field1417, 0);
                            Statics.field3673.method4754(field1417 + 382, 0);
                            Statics.field3671.method4725(field1417 + 382 - Statics.field3671.field3766 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.g(I)V")
    public static void method1403() {
        field1438 = field1438.trim();
        if (field1438.length() == 0) {
            method3114(class226.field3092, class226.field3093, class226.field3094);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method172("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class174 var4 = new class174(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field2387, var4.field2384, 1000 - var4.field2384);
                if (var5 == -1) {
                    var4.field2384 = 0;
                    long var8 = var4.method2949();
                    var6 = var8;
                    break;
                }
                var4.field2384 += var5;
                if (var4.field2384 >= 1000) {
                    var6 = 0L;
                    break;
                }
            }
        } catch (Exception var14) {
            var6 = 0L;
        }
        int var13;
        if (var6 == 0L) {
            var13 = 5;
        } else {
            var13 = class88.method1594(var6, field1438);
        }
        switch(var13) {
            case 2:
                method3114(class226.field2999, class226.field3096, class226.field3097);
                field1433 = 6;
                break;
            case 3:
                method3114(class226.field2920, class226.field3099, class226.field2921);
                break;
            case 4:
                method3114(class226.field3052, class226.field3102, class226.field3103);
                break;
            case 5:
                method3114(class226.field3098, class226.field3019, class226.field3106);
                break;
            case 6:
                method3114(class226.field2991, class226.field3025, class226.field2870);
                break;
            case 7:
                method3114(class226.field2966, class226.field3111, class226.field2888);
        }
    }

    @ObfuscatedName("bx.v(Ljj;Ljj;Ljj;ZI)V")
    public static void method1030(class264 arg0, class264 arg1, class264 arg2, boolean arg3) {
        if (arg3) {
            field1417 = (Statics.field3627 - 765) / 2;
            field1423 = field1417 + 202;
        }
        if (field1445) {
            method1611(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field1430.method4754(field1417, 0);
            Statics.field3673.method4754(field1417 + 382, 0);
            Statics.field3671.method4725(field1417 + 382 - Statics.field3671.field3766 / 2, 18);
        }
        if (client.field898 == 0 || client.field898 == 5) {
            byte var4 = 20;
            arg0.method4456(class226.field3002, field1423 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class282.method4646(field1423 + 180 - 152, var5, 304, 34, 9179409);
            class282.method4646(field1423 + 180 - 151, var5 + 1, 302, 32, 0);
            class282.method4676(field1423 + 180 - 150, var5 + 2, field1431 * 3, 30, 9179409);
            class282.method4676(field1431 * 3 + (field1423 + 180 - 150), var5 + 2, 300 - field1431 * 3, 30, 0);
            arg0.method4456(field1432, field1423 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field898 == 20) {
            Statics.field1418.method4725(field1423 + 180 - Statics.field1418.field3766 / 2, 271 - Statics.field1418.field3764 / 2);
            short var6 = 211;
            arg0.method4456(field1435, field1423 + 180, var6, 16776960, 0);
            int var76 = var6 + 15;
            arg0.method4456(field1436, field1423 + 180, var76, 16776960, 0);
            int var77 = var76 + 15;
            arg0.method4456(field1440, field1423 + 180, var77, 16776960, 0);
            int var78 = var77 + 15;
            int var79 = var78 + 10;
            if (field1433 != 4) {
                arg0.method4523(class226.field3074, field1423 + 180 - 110, var79, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field1438; arg0.method4448(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method4523(class265.method4452(var8), field1423 + 180 - 70, var79, 16777215, 0);
                var76 = var79 + 15;
                arg0.method4523(class226.field3075 + Statics.method2403(field1439), field1423 + 180 - 108, var76, 16777215, 0);
                var76 += 15;
            }
        }
        if (client.field898 == 10 || client.field898 == 11) {
            Statics.field1418.method4725(field1423, 171);
            if (field1433 == 0) {
                short var9 = 251;
                arg0.method4456(class226.field3077, field1423 + 180, var9, 16776960, 0);
                int var80 = var9 + 30;
                int var10 = field1423 + 180 - 80;
                short var11 = 291;
                Statics.field1426.method4725(var10 - 73, var11 - 20);
                arg0.method4457(class226.field2975, var10 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var12 = field1423 + 180 + 80;
                Statics.field1426.method4725(var12 - 73, var11 - 20);
                arg0.method4457(class226.field2878, var12 - 73, var11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field1433 == 1) {
                arg0.method4456(field1429, field1423 + 180, 211, 16776960, 0);
                short var13 = 236;
                arg0.method4456(field1435, field1423 + 180, var13, 16777215, 0);
                int var81 = var13 + 15;
                arg0.method4456(field1436, field1423 + 180, var81, 16777215, 0);
                int var82 = var81 + 15;
                arg0.method4456(field1440, field1423 + 180, var82, 16777215, 0);
                int var83 = var82 + 15;
                int var14 = field1423 + 180 - 80;
                short var15 = 321;
                Statics.field1426.method4725(var14 - 73, var15 - 20);
                arg0.method4456(class226.field3110, var14, var15 + 5, 16777215, 0);
                int var16 = field1423 + 180 + 80;
                Statics.field1426.method4725(var16 - 73, var15 - 20);
                arg0.method4456(class226.field2853, var16, var15 + 5, 16777215, 0);
            } else if (field1433 == 2) {
                short var17 = 211;
                arg0.method4456(field1435, field1423 + 180, var17, 16776960, 0);
                int var84 = var17 + 15;
                arg0.method4456(field1436, field1423 + 180, var84, 16776960, 0);
                int var85 = var84 + 15;
                arg0.method4456(field1440, field1423 + 180, var85, 16776960, 0);
                int var86 = var85 + 15;
                int var87 = var86 + 10;
                arg0.method4523(class226.field3074, field1423 + 180 - 110, var87, 16777215, 0);
                short var18 = 200;
                String var19;
                for (var19 = field1438; arg0.method4448(var19) > var18; var19 = var19.substring(1)) {
                }
                arg0.method4523(class265.method4452(var19) + (field1442 == 0 & client.field900 % 40 < 20 ? class89.method1488(16776960) + class89.field1371 : ""), field1423 + 180 - 70, var87, 16777215, 0);
                var84 = var87 + 15;
                arg0.method4523(class226.field3075 + Statics.method2403(field1439) + (field1442 == 1 & client.field900 % 40 < 20 ? class89.method1488(16776960) + class89.field1371 : ""), field1423 + 180 - 108, var84, 16777215, 0);
                var84 += 15;
                int var20 = field1423 + 180 - 80;
                short var21 = 321;
                Statics.field1426.method4725(var20 - 73, var21 - 20);
                arg0.method4456(class226.field3080, var20, var21 + 5, 16777215, 0);
                int var22 = field1423 + 180 + 80;
                Statics.field1426.method4725(var22 - 73, var21 - 20);
                arg0.method4456(class226.field2853, var22, var21 + 5, 16777215, 0);
                short var23 = 357;
                arg1.method4456(class226.field2945, field1423 + 180, var23, 16776960, 0);
            } else if (field1433 == 3) {
                short var24 = 201;
                arg0.method4456(class226.field3027, field1423 + 180, var24, 16776960, 0);
                int var88 = var24 + 20;
                arg1.method4456(class226.field3083, field1423 + 180, var88, 16776960, 0);
                int var89 = var88 + 15;
                arg1.method4456(class226.field3109, field1423 + 180, var89, 16776960, 0);
                int var90 = var89 + 15;
                int var25 = field1423 + 180;
                short var26 = 276;
                Statics.field1426.method4725(var25 - 73, var26 - 20);
                arg2.method4456(class226.field3085, var25, var26 + 5, 16777215, 0);
                int var27 = field1423 + 180;
                short var28 = 326;
                Statics.field1426.method4725(var27 - 73, var28 - 20);
                arg2.method4456(class226.field3086, var27, var28 + 5, 16777215, 0);
            } else if (field1433 == 4) {
                arg0.method4456(class226.field3069, field1423 + 180, 211, 16776960, 0);
                short var29 = 236;
                arg0.method4456(field1435, field1423 + 180, var29, 16777215, 0);
                int var91 = var29 + 15;
                arg0.method4456(field1436, field1423 + 180, var91, 16777215, 0);
                int var92 = var91 + 15;
                arg0.method4456(field1440, field1423 + 180, var92, 16777215, 0);
                int var93 = var92 + 15;
                arg0.method4523(class226.field3076 + Statics.method2403(Statics.field1776) + (client.field900 % 40 < 20 ? class89.method1488(16776960) + class89.field1371 : ""), field1423 + 180 - 108, var93, 16777215, 0);
                int var94 = var93 - 8;
                arg0.method4523(class226.field3081, field1423 + 180 - 9, var94, 16776960, 0);
                int var95 = var94 + 15;
                arg0.method4523(class226.field2851, field1423 + 180 - 9, var95, 16776960, 0);
                int var30 = field1423 + 180 - 9 + arg0.method4448(class226.field2851) + 15;
                int var31 = var95 - arg0.field3639;
                class285 var32;
                if (field1441) {
                    var32 = Statics.field677;
                } else {
                    var32 = Statics.field1421;
                }
                var32.method4725(var30, var31);
                var91 = var95 + 15;
                int var33 = field1423 + 180 - 80;
                short var34 = 321;
                Statics.field1426.method4725(var33 - 73, var34 - 20);
                arg0.method4456(class226.field3110, var33, var34 + 5, 16777215, 0);
                int var35 = field1423 + 180 + 80;
                Statics.field1426.method4725(var35 - 73, var34 - 20);
                arg0.method4456(class226.field2853, var35, var34 + 5, 16777215, 0);
                arg1.method4456(class226.field2956, field1423 + 180, var34 + 36, 255, 0);
            } else if (field1433 == 5) {
                arg0.method4456(class226.field3073, field1423 + 180, 201, 16776960, 0);
                short var36 = 221;
                arg2.method4456(field1435, field1423 + 180, var36, 16776960, 0);
                int var96 = var36 + 15;
                arg2.method4456(field1436, field1423 + 180, var96, 16776960, 0);
                int var97 = var96 + 15;
                arg2.method4456(field1440, field1423 + 180, var97, 16776960, 0);
                int var98 = var97 + 15;
                int var99 = var98 + 14;
                arg0.method4523(class226.field3089, field1423 + 180 - 145, var99, 16777215, 0);
                short var37 = 174;
                String var38;
                for (var38 = field1438; arg0.method4448(var38) > var37; var38 = var38.substring(1)) {
                }
                arg0.method4523(class265.method4452(var38) + (client.field900 % 40 < 20 ? class89.method1488(16776960) + class89.field1371 : ""), field1423 + 180 - 34, var99, 16777215, 0);
                var96 = var99 + 15;
                int var39 = field1423 + 180 - 80;
                short var40 = 321;
                Statics.field1426.method4725(var39 - 73, var40 - 20);
                arg0.method4456(class226.field2993, var39, var40 + 5, 16777215, 0);
                int var41 = field1423 + 180 + 80;
                Statics.field1426.method4725(var41 - 73, var40 - 20);
                arg0.method4456(class226.field3091, var41, var40 + 5, 16777215, 0);
            } else if (field1433 == 6) {
                short var42 = 211;
                arg0.method4456(field1435, field1423 + 180, var42, 16776960, 0);
                int var100 = var42 + 15;
                arg0.method4456(field1436, field1423 + 180, var100, 16776960, 0);
                int var101 = var100 + 15;
                arg0.method4456(field1440, field1423 + 180, var101, 16776960, 0);
                int var102 = var101 + 15;
                int var43 = field1423 + 180;
                short var44 = 321;
                Statics.field1426.method4725(var43 - 73, var44 - 20);
                arg0.method4456(class226.field3091, var43, var44 + 5, 16777215, 0);
            }
        }
        if (field1446 > 0) {
            int var45 = field1446;
            short var46 = 256;
            field1427 += var45 * 128;
            if (field1427 > Statics.field438.length) {
                field1427 -= Statics.field438.length;
                int var47 = (int) (Math.random() * 12.0D);
                Statics.method1003(Statics.field420[var47]);
            }
            int var48 = 0;
            int var49 = var45 * 128;
            int var50 = (var46 - var45) * 128;
            for (int var51 = 0; var51 < var50; var51++) {
                int var52 = Statics.field34[var48 + var49] - Statics.field438[field1427 + var48 & Statics.field438.length - 1] * var45 / 6;
                if (var52 < 0) {
                    var52 = 0;
                }
                Statics.field34[var48++] = var52;
            }
            for (int var53 = var46 - var45; var53 < var46; var53++) {
                int var54 = var53 * 128;
                for (int var55 = 0; var55 < 128; var55++) {
                    int var56 = (int) (Math.random() * 100.0D);
                    if (var56 < 50 && var55 > 10 && var55 < 118) {
                        Statics.field34[var54 + var55] = 255;
                    } else {
                        Statics.field34[var54 + var55] = 0;
                    }
                }
            }
            if (field1425 > 0) {
                field1425 -= var45 * 4;
            }
            if (field1420 > 0) {
                field1420 -= var45 * 4;
            }
            if (field1425 == 0 && field1420 == 0) {
                int var57 = (int) (Math.random() * (double) (2000 / var45));
                if (var57 == 0) {
                    field1425 = 1024;
                }
                if (var57 == 1) {
                    field1420 = 1024;
                }
            }
            for (int var58 = 0; var58 < var46 - var45; var58++) {
                field1424[var58] = field1424[var45 + var58];
            }
            for (int var59 = var46 - var45; var59 < var46; var59++) {
                field1424[var59] = (int) (Math.sin((double) field1416 / 14.0D) * 16.0D + Math.sin((double) field1416 / 15.0D) * 14.0D + Math.sin((double) field1416 / 16.0D) * 12.0D);
                field1416++;
            }
            field1419 += var45 * 274724487;
            int var60 = ((client.field900 & 0x1) + var45) / 2;
            if (var60 > 0) {
                for (int var61 = 0; var61 < field1419 * 645230972; var61++) {
                    int var62 = (int) (Math.random() * 124.0D) + 2;
                    int var63 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field34[(var63 << 7) + var62] = 192;
                }
                field1419 = 0;
                int var64 = 0;
                label219: while (true) {
                    if (var64 >= var46) {
                        int var68 = 0;
                        while (true) {
                            if (var68 >= 128) {
                                break label219;
                            }
                            int var69 = 0;
                            for (int var70 = -var60; var70 < var46; var70++) {
                                int var71 = var70 * 128;
                                if (var60 + var70 < var46) {
                                    var69 += Statics.field1848[var60 * 128 + var68 + var71];
                                }
                                if (var70 - (var60 + 1) >= 0) {
                                    var69 -= Statics.field1848[var68 + var71 - (var60 + 1) * 128];
                                }
                                if (var70 >= 0) {
                                    Statics.field34[var68 + var71] = var69 / (var60 * 2 + 1);
                                }
                            }
                            var68++;
                        }
                    }
                    int var65 = 0;
                    int var66 = var64 * 128;
                    for (int var67 = -var60; var67 < 128; var67++) {
                        if (var60 + var67 < 128) {
                            var65 += Statics.field34[var66 + var67 + var60];
                        }
                        if (var67 - (var60 + 1) >= 0) {
                            var65 -= Statics.field34[var66 + var67 - (var60 + 1)];
                        }
                        if (var67 >= 0) {
                            Statics.field1848[var66 + var67] = var65 / (var60 * 2 + 1);
                        }
                    }
                    var64++;
                }
            }
            field1446 = 0;
        }
        method2801();
        Statics.field1393[Statics.field1990.field1286 ? 1 : 0].method4725(field1417 + 765 - 40, 463);
        if (client.field898 > 5 && client.field897 == 0) {
            if (Statics.field519 == null) {
                Statics.field519 = class287.method3985(Statics.field1197, "sl_button", "");
            } else {
                int var72 = field1417 + 5;
                short var73 = 463;
                byte var74 = 100;
                byte var75 = 35;
                Statics.field519.method4725(var72, var73);
                arg0.method4456(class226.field3007 + " " + client.field1079, var74 / 2 + var72, var75 / 2 + var73 - 2, 16777215, 0);
                if (Statics.field1280 == null) {
                    arg1.method4456(class226.field3123, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                } else {
                    arg1.method4456(class226.field3122, var74 / 2 + var72, var75 / 2 + var73 + 12, 16777215, 0);
                }
            }
        }
        Statics.field542.method738(0, 0);
    }

    @ObfuscatedName("fv.t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3114(String arg0, String arg1, String arg2) {
        field1435 = arg0;
        field1436 = arg1;
        field1440 = arg2;
    }

    @ObfuscatedName("ax.l(IIIB)I")
    public static final int method323(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("fr.a(B)V")
    public static final void method2801() {
        short var0 = 256;
        if (field1425 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field1425 > 768) {
                    Statics.field431[var1] = method323(Statics.field1266[var1], Statics.field366[var1], 1024 - field1425);
                } else if (field1425 > 256) {
                    Statics.field431[var1] = Statics.field366[var1];
                } else {
                    Statics.field431[var1] = method323(Statics.field366[var1], Statics.field1266[var1], 256 - field1425);
                }
            }
        } else if (field1420 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field1420 > 768) {
                    Statics.field431[var2] = method323(Statics.field1266[var2], Statics.field11[var2], 1024 - field1420);
                } else if (field1420 > 256) {
                    Statics.field431[var2] = Statics.field11[var2];
                } else {
                    Statics.field431[var2] = method323(Statics.field11[var2], Statics.field1266[var2], 256 - field1420);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field431[var3] = Statics.field1266[var3];
            }
        }
        class282.method4632(field1417, 9, field1417 + 128, var0 + 7);
        Statics.field1430.method4754(field1417, 0);
        class282.method4643();
        int var4 = 0;
        int var5 = field1417 + Statics.field542.field3754 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field1424[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field34[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field431[var10];
                    int var14 = Statics.field542.field3755[var5];
                    Statics.field542.field3755[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += Statics.field542.field3754 + var8 - 128;
        }
        class282.method4632(field1417 + 765 - 128, 9, field1417 + 765, var0 + 7);
        Statics.field3673.method4754(field1417 + 382, 0);
        class282.method4643();
        int var15 = 0;
        int var16 = field1417 + Statics.field542.field3754 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field1424[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field34[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field431[var22];
                    int var26 = Statics.field542.field3755[var20];
                    Statics.field542.field3755[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field542.field3754 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("cw.k(Ljj;Ljj;I)V")
    public static void method1611(class264 arg0, class264 arg1) {
        if (Statics.field2258 == null) {
            Statics.field2258 = class287.method992(Statics.field1197, "sl_back", "");
        }
        if (Statics.field2379 == null) {
            Statics.field2379 = class287.method735(Statics.field1197, "sl_flags", "");
        }
        if (Statics.field585 == null) {
            Statics.field585 = class287.method735(Statics.field1197, "sl_arrows", "");
        }
        if (Statics.field1545 == null) {
            Statics.field1545 = class287.method735(Statics.field1197, "sl_stars", "");
        }
        class282.method4676(field1417, 23, 765, 480, 0);
        class282.method4644(field1417, 0, 125, 23, 12425273, 9135624);
        class282.method4644(field1417 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method4456(class226.field3067, field1417 + 62, 15, 0, -1);
        if (Statics.field1545 != null) {
            Statics.field1545[1].method4725(field1417 + 140, 1);
            arg1.method4523(class226.field3114, field1417 + 152, 10, 16777215, -1);
            Statics.field1545[0].method4725(field1417 + 140, 12);
            arg1.method4523(class226.field2927, field1417 + 152, 21, 16777215, -1);
        }
        if (Statics.field585 != null) {
            int var2 = field1417 + 280;
            if (class81.field1271[0] == 0 && class81.field1270[0] == 0) {
                Statics.field585[2].method4725(var2, 4);
            } else {
                Statics.field585[0].method4725(var2, 4);
            }
            if (class81.field1271[0] == 0 && class81.field1270[0] == 1) {
                Statics.field585[3].method4725(var2 + 15, 4);
            } else {
                Statics.field585[1].method4725(var2 + 15, 4);
            }
            arg0.method4523(class226.field3116, var2 + 32, 17, 16777215, -1);
            int var3 = field1417 + 390;
            if (class81.field1271[0] == 1 && class81.field1270[0] == 0) {
                Statics.field585[2].method4725(var3, 4);
            } else {
                Statics.field585[0].method4725(var3, 4);
            }
            if (class81.field1271[0] == 1 && class81.field1270[0] == 1) {
                Statics.field585[3].method4725(var3 + 15, 4);
            } else {
                Statics.field585[1].method4725(var3 + 15, 4);
            }
            arg0.method4523(class226.field3088, var3 + 32, 17, 16777215, -1);
            int var4 = field1417 + 500;
            if (class81.field1271[0] == 2 && class81.field1270[0] == 0) {
                Statics.field585[2].method4725(var4, 4);
            } else {
                Statics.field585[0].method4725(var4, 4);
            }
            if (class81.field1271[0] == 2 && class81.field1270[0] == 1) {
                Statics.field585[3].method4725(var4 + 15, 4);
            } else {
                Statics.field585[1].method4725(var4 + 15, 4);
            }
            arg0.method4523(class226.field3041, var4 + 32, 17, 16777215, -1);
            int var5 = field1417 + 610;
            if (class81.field1271[0] == 3 && class81.field1270[0] == 0) {
                Statics.field585[2].method4725(var5, 4);
            } else {
                Statics.field585[0].method4725(var5, 4);
            }
            if (class81.field1271[0] == 3 && class81.field1270[0] == 1) {
                Statics.field585[3].method4725(var5 + 15, 4);
            } else {
                Statics.field585[1].method4725(var5 + 15, 4);
            }
            arg0.method4523(class226.field3090, var5 + 32, 17, 16777215, -1);
        }
        class282.method4676(field1417 + 708, 4, 50, 16, 0);
        arg1.method4456(class226.field2853, field1417 + 708 + 25, 16, 16777215, -1);
        field1447 = -1;
        if (Statics.field2258 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class81.field1268) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class81.field1268) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class81.field1268) {
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
            for (int var20 = 0; var20 < class81.field1268; var20++) {
                class81 var21 = Statics.field1277[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field1273);
                if (var21.field1273 == -1) {
                    var23 = class226.field3120;
                    var22 = false;
                } else if (var21.field1273 > 1980) {
                    var23 = class226.field3121;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method1433()) {
                    if (var21.method1427()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method1432()) {
                    var24 = 16711680;
                    if (var21.method1427()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method1430()) {
                    if (var21.method1427()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method1427()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class60.field722 >= var17 && class60.field723 * -113761157 >= var16 && class60.field722 < var6 + var17 && class60.field723 * -113761157 < var7 + var16 && var22) {
                    field1447 = var20;
                    Statics.field2258[var25].method4760(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2258[var25].method4754(var17, var16);
                }
                if (Statics.field2379 != null) {
                    Statics.field2379[(var21.method1427() ? 8 : 0) + var21.field1272].method4725(var17 + 29, var16);
                }
                arg0.method4456(Integer.toString(var21.field1278), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method4456(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method4448(Statics.field1277[field1447].field1267) + 6;
                int var27 = arg1.field3639 + 8;
                class282.method4676(class60.field722 - var26 / 2, class60.field723 * -113761157 + 20 + 5, var26, var27, 16777120);
                class282.method4646(class60.field722 - var26 / 2, class60.field723 * -113761157 + 20 + 5, var26, var27, 0);
                arg1.method4456(Statics.field1277[field1447].field1267, class60.field722, class60.field723 * -113761157 + 20 + 5 + arg1.field3639 + 4, 0, -1);
            }
        }
        Statics.field542.method738(0, 0);
    }

    @ObfuscatedName("ck.b(Lcb;I)V")
    public static void method1602(class81 arg0) {
        if (arg0.method1427() != client.field1147) {
            client.field1147 = arg0.method1427();
            boolean var1 = arg0.method1427();
            if (Statics.field3175 != var1) {
                class257.field3486.method3311();
                class257.field3507.method3311();
                class257.field3503.method3311();
                Statics.field3175 = var1;
            }
        }
        Statics.field1479 = arg0.field1276;
        client.field1079 = arg0.field1278;
        client.field893 = arg0.field1274;
        Statics.field341 = client.field927 == 0 ? 43594 : arg0.field1278 + 40000;
        Statics.field2184 = client.field927 == 0 ? 443 : arg0.field1278 + 50000;
        Statics.field1511 = Statics.field341;
    }

    @ObfuscatedName("d.x(I)V")
    public static void method114() {
        if (class81.method552()) {
            field1445 = true;
        }
    }
}

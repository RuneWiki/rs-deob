package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("ah")
public class class32 {

    @ObfuscatedName("ah.l")
    public static int field680 = 0;

    @ObfuscatedName("ah.r")
    public static int field683 = field680 + 202;

    @ObfuscatedName("ah.n")
    public static int[] field697 = new int[256];

    @ObfuscatedName("ah.o")
    public static int field711 = 0;

    @ObfuscatedName("ah.w")
    public static int field688 = 0;

    @ObfuscatedName("ah.av")
    public static int field690 = 0;

    @ObfuscatedName("ah.ac")
    public static int field691 = 0;

    @ObfuscatedName("ah.ar")
    public static int field692 = 0;

    @ObfuscatedName("ah.ah")
    public static int field699 = 0;

    @ObfuscatedName("ah.ab")
    public static int field694 = 10;

    @ObfuscatedName("ah.au")
    public static String field710 = "";

    @ObfuscatedName("ah.ao")
    public static int field696 = 0;

    @ObfuscatedName("ah.am")
    public static String field708 = "";

    @ObfuscatedName("ah.aa")
    public static String field695 = "";

    @ObfuscatedName("ah.aj")
    public static String field686 = "";

    @ObfuscatedName("ah.ap")
    public static String field700 = "";

    @ObfuscatedName("ah.at")
    public static String field693 = "";

    @ObfuscatedName("ah.az")
    public static class159 field698 = class159.field2570;

    @ObfuscatedName("ah.aw")
    public static boolean field703 = true;

    @ObfuscatedName("ah.al")
    public static int field704 = 0;

    @ObfuscatedName("ah.ax")
    public static String field705 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ah.ag")
    public static String field713 = "1234567890";

    @ObfuscatedName("ah.ad")
    public static boolean field707 = false;

    @ObfuscatedName("ah.bq")
    public static int field687 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("an.m(Lfx;Lfx;I)I")
    public static int method669(class167 arg0, class167 arg1) {
        int var2 = 0;
        if (arg0.method3132("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3132("logo", "")) {
            var2++;
        }
        if (arg1.method3132("titlebox", "")) {
            var2++;
        }
        if (arg1.method3132("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3132("runes", "")) {
            var2++;
        }
        if (arg1.method3132("title_mute", "")) {
            var2++;
        }
        if (arg1.method3099("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3099("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3132("sl_back", "");
        arg1.method3132("sl_flags", "");
        arg1.method3132("sl_arrows", "");
        arg1.method3132("sl_stars", "");
        arg1.method3132("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ay.l(B)I")
    public static int method1074() {
        return 8;
    }

    @ObfuscatedName("e.y(Ljava/awt/Component;Lfx;Lfx;ZII)V")
    public static void method116(Component arg0, class167 arg1, class167 arg2, boolean arg3, int arg4) {
        if (!Statics.field701) {
            field696 = arg4;
            class80.method1729();
            byte[] var5 = arg1.method3097("title.jpg", "");
            Statics.field744 = new class79(var5, arg0);
            Statics.field56 = Statics.field744.method1647();
            Statics.field2140 = class77.method3190(arg2, "logo", "");
            Statics.field681 = class77.method3190(arg2, "titlebox", "");
            Statics.field550 = class77.method3190(arg2, "titlebutton", "");
            Statics.field651 = class77.method990(arg2, "runes", "");
            Statics.field1032 = class77.method990(arg2, "title_mute", "");
            Statics.field756 = class77.method3190(arg2, "options_radio_buttons,0", "");
            Statics.field645 = class77.method3190(arg2, "options_radio_buttons,2", "");
            Statics.field5 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field5[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field5[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field5[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field5[var9 + 192] = 16777215;
            }
            Statics.field2246 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2246[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2246[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2246[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2246[var13 + 192] = 16777215;
            }
            Statics.field702 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field702[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field702[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field702[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field702[var17 + 192] = 16777215;
            }
            Statics.field1057 = new int[256];
            Statics.field1033 = new int[32768];
            Statics.field689 = new int[32768];
            method46((class81) null);
            Statics.field250 = new int[32768];
            Statics.field631 = new int[32768];
            if (arg3) {
                field700 = "";
                field693 = "";
            }
            Statics.field1052 = 0;
            Statics.field553 = "";
            field703 = true;
            field707 = false;
            if (Statics.field2665.field133) {
                class183.method743(2);
            } else {
                class168 var18 = Statics.field773;
                int var19 = var18.method3081("scape main");
                int var20 = var18.method3116(var19, "");
                class183.method2182(2, var18, var19, var20, 255, false);
            }
            class171.method662(false);
            Statics.field701 = true;
            field680 = (Statics.field942 - client.field472) / 2;
            field683 = field680 + 202;
            Statics.field744.method1644(field680, 0);
            Statics.field56.method1644(field680 + 382, 0);
            Statics.field2140.method1790(field680 + 382 - Statics.field2140.field1376 / 2, 18);
        } else if (arg4 == 4) {
            field696 = 4;
        }
    }

    @ObfuscatedName("ek.u(B)V")
    public static void method2987() {
        if (!Statics.field701) {
            return;
        }
        Statics.field681 = null;
        Statics.field550 = null;
        Statics.field651 = null;
        Statics.field744 = null;
        Statics.field56 = null;
        Statics.field2140 = null;
        Statics.field1032 = null;
        Statics.field756 = null;
        Statics.field645 = null;
        Statics.field540 = null;
        Statics.field1405 = null;
        Statics.field2565 = null;
        Statics.field216 = null;
        Statics.field253 = null;
        Statics.field5 = null;
        Statics.field2246 = null;
        Statics.field702 = null;
        Statics.field1057 = null;
        Statics.field1033 = null;
        Statics.field689 = null;
        Statics.field250 = null;
        Statics.field631 = null;
        class183.method743(2);
        class171.method662(true);
        Statics.field701 = false;
    }

    @ObfuscatedName("s.k(Lea;I)V")
    public static void method171(class144 arg0) {
        if (!field707) {
            if ((class140.field2130 == 1 || !Statics.field2882 && class140.field2130 == 4) && class140.field2128 >= field680 + 765 - 50 && class140.field2129 >= 453) {
                Statics.field2665.field133 = !Statics.field2665.field133;
                class9.method3224();
                if (Statics.field2665.field133) {
                    Statics.field2930.method3514();
                    class183.field2933 = 1;
                    Statics.field2932 = null;
                } else {
                    class183.method2965(Statics.field773, "scape main", "", 255, false);
                }
            }
            if (client.field382 != 5) {
                field692++;
                if (client.field382 == 10 || client.field382 == 11) {
                    if (client.field265 == 0) {
                        if (class140.field2130 == 1 || !Statics.field2882 && class140.field2130 == 4) {
                            int var6 = field680 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class140.field2128 >= var6 && class140.field2128 <= var6 + var8 && class140.field2129 >= var7 && class140.field2129 <= var7 + var9) {
                                method1526();
                                return;
                            }
                        }
                        if (Statics.field1641 != null) {
                            method1526();
                        }
                    }
                    int var10 = class140.field2130;
                    int var11 = class140.field2128;
                    int var12 = class140.field2129;
                    if (!Statics.field2882 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field696 == 0) {
                        int var13 = field683 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            String var15 = client.method112("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                            class138.method193(var15, true, "openjs", false);
                        }
                        int var16 = field683 + 180 + 80;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field461 & 0x4) != 0) {
                                if ((client.field461 & 0x400) == 0) {
                                    field708 = class157.field2499;
                                    field695 = class157.field2384;
                                    field686 = class157.field2430;
                                } else {
                                    field708 = class157.field2505;
                                    field695 = class157.field2511;
                                    field686 = class157.field2507;
                                }
                                field696 = 1;
                                field704 = 0;
                            } else if ((client.field461 & 0x400) == 0) {
                                field708 = class157.field2495;
                                field695 = class157.field2496;
                                field686 = class157.field2497;
                                field696 = 2;
                                field704 = 0;
                            } else {
                                field708 = class157.field2502;
                                field695 = class157.field2503;
                                field686 = class157.field2346;
                                field696 = 1;
                                field704 = 0;
                            }
                        }
                    } else if (field696 == 1) {
                        while (class137.method135()) {
                            if (Statics.field1573 == 84) {
                                field708 = class157.field2495;
                                field695 = class157.field2496;
                                field686 = class157.field2497;
                                field696 = 2;
                                field704 = 0;
                            } else if (Statics.field1573 == 13) {
                                field696 = 0;
                            }
                        }
                        int var17 = field683 + 180 - 80;
                        short var18 = 321;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field708 = class157.field2495;
                            field695 = class157.field2496;
                            field686 = class157.field2497;
                            field696 = 2;
                            field704 = 0;
                        }
                        int var19 = field683 + 180 + 80;
                        if (var10 == 1 && var11 >= var19 - 75 && var11 <= var19 + 75 && var12 >= var18 - 20 && var12 <= var18 + 20) {
                            field696 = 0;
                        }
                    } else if (field696 == 2) {
                        short var20 = 231;
                        int var39 = var20 + 30;
                        if (var10 == 1 && var12 >= var39 - 15 && var12 < var39) {
                            field704 = 0;
                        }
                        var39 += 15;
                        if (var10 == 1 && var12 >= var39 - 15 && var12 < var39) {
                            field704 = 1;
                        }
                        var39 += 15;
                        short var21 = 361;
                        if (var10 == 1 && var12 >= var21 - 15 && var12 < var21) {
                            method768(class157.field2447, class157.field2527, class157.field2528);
                            field696 = 5;
                            return;
                        }
                        int var22 = field683 + 180 - 80;
                        short var23 = 321;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field700 = field700.trim();
                            if (field700.length() == 0) {
                                method768(class157.field2401, class157.field2402, class157.field2403);
                                return;
                            }
                            if (field693.length() == 0) {
                                method768(class157.field2404, class157.field2406, class157.field2361);
                                return;
                            }
                            method768(class157.field2431, class157.field2533, class157.field2512);
                            field698 = Statics.field2665.field136.containsKey(class163.method2079(field700)) ? class159.field2569 : class159.field2570;
                            client.method781(20);
                            return;
                        }
                        int var24 = field683 + 180 + 80;
                        if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field696 = 0;
                            field700 = "";
                            field693 = "";
                            Statics.field1052 = 0;
                            Statics.field553 = "";
                            field703 = true;
                        }
                        while (true) {
                            while (class137.method135()) {
                                boolean var25 = false;
                                for (int var26 = 0; var26 < field705.length(); var26++) {
                                    if (Statics.field2644 == field705.charAt(var26)) {
                                        var25 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1573 == 13) {
                                    field696 = 0;
                                    field700 = "";
                                    field693 = "";
                                    Statics.field1052 = 0;
                                    Statics.field553 = "";
                                    field703 = true;
                                } else if (field704 == 0) {
                                    if (Statics.field1573 == 85 && field700.length() > 0) {
                                        field700 = field700.substring(0, field700.length() - 1);
                                    }
                                    if (Statics.field1573 == 84 || Statics.field1573 == 80) {
                                        field704 = 1;
                                    }
                                    if (var25 && field700.length() < 320) {
                                        field700 = field700 + Statics.field2644;
                                    }
                                } else if (field704 == 1) {
                                    if (Statics.field1573 == 85 && field693.length() > 0) {
                                        field693 = field693.substring(0, field693.length() - 1);
                                    }
                                    if (Statics.field1573 == 84 || Statics.field1573 == 80) {
                                        field704 = 0;
                                    }
                                    if (Statics.field1573 == 84) {
                                        field700 = field700.trim();
                                        if (field700.length() == 0) {
                                            method768(class157.field2401, class157.field2402, class157.field2403);
                                            return;
                                        }
                                        if (field693.length() == 0) {
                                            method768(class157.field2404, class157.field2406, class157.field2361);
                                            return;
                                        }
                                        method768(class157.field2431, class157.field2533, class157.field2512);
                                        field698 = Statics.field2665.field136.containsKey(class163.method2079(field700)) ? class159.field2569 : class159.field2570;
                                        client.method781(20);
                                        return;
                                    }
                                    if (var25 && field693.length() < 20) {
                                        field693 = field693 + Statics.field2644;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field696 == 4) {
                        int var27 = field683 + 180 - 80;
                        short var28 = 321;
                        if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var28 - 20 && var12 <= var28 + 20) {
                            Statics.field553.trim();
                            if (Statics.field553.length() != 6) {
                                method768(class157.field2317, class157.field2318, class157.field2319);
                                return;
                            }
                            Statics.field1052 = Integer.parseInt(Statics.field553);
                            Statics.field553 = "";
                            field698 = field703 ? class159.field2571 : class159.field2576;
                            method768(class157.field2431, class157.field2533, class157.field2512);
                            client.method781(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field683 + 180 - 9 && var11 <= field683 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field703 = !field703;
                        }
                        if (var10 == 1 && var11 >= field683 + 180 - 34 && var11 <= field683 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            String var29 = client.method112("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                            class138.method193(var29, true, "openjs", false);
                        }
                        int var30 = field683 + 180 + 80;
                        if (var10 == 1 && var11 >= var30 - 75 && var11 <= var30 + 75 && var12 >= var28 - 20 && var12 <= var28 + 20) {
                            field696 = 0;
                            field700 = "";
                            field693 = "";
                            Statics.field1052 = 0;
                            Statics.field553 = "";
                        }
                        while (class137.method135()) {
                            boolean var31 = false;
                            for (int var32 = 0; var32 < field713.length(); var32++) {
                                if (Statics.field2644 == field713.charAt(var32)) {
                                    var31 = true;
                                    break;
                                }
                            }
                            if (Statics.field1573 == 13) {
                                field696 = 0;
                                field700 = "";
                                field693 = "";
                                Statics.field1052 = 0;
                                Statics.field553 = "";
                            } else {
                                if (Statics.field1573 == 85 && Statics.field553.length() > 0) {
                                    Statics.field553 = Statics.field553.substring(0, Statics.field553.length() - 1);
                                }
                                if (Statics.field1573 == 84) {
                                    Statics.field553.trim();
                                    if (Statics.field553.length() != 6) {
                                        method768(class157.field2317, class157.field2318, class157.field2319);
                                        return;
                                    }
                                    Statics.field1052 = Integer.parseInt(Statics.field553);
                                    Statics.field553 = "";
                                    field698 = field703 ? class159.field2571 : class159.field2576;
                                    method768(class157.field2431, class157.field2533, class157.field2512);
                                    client.method781(20);
                                    return;
                                }
                                if (var31 && Statics.field553.length() < 6) {
                                    Statics.field553 = Statics.field553 + Statics.field2644;
                                }
                            }
                        }
                    } else if (field696 == 5) {
                        int var33 = field683 + 180 - 80;
                        short var34 = 321;
                        if (var10 == 1 && var11 >= var33 - 75 && var11 <= var33 + 75 && var12 >= var34 - 20 && var12 <= var34 + 20) {
                            method124();
                            return;
                        }
                        int var35 = field683 + 180 + 80;
                        if (var10 == 1 && var11 >= var35 - 75 && var11 <= var35 + 75 && var12 >= var34 - 20 && var12 <= var34 + 20) {
                            field708 = class157.field2495;
                            field695 = class157.field2496;
                            field686 = class157.field2497;
                            field696 = 2;
                            field704 = 0;
                            field693 = "";
                        }
                        while (class137.method135()) {
                            boolean var36 = false;
                            for (int var37 = 0; var37 < field705.length(); var37++) {
                                if (Statics.field2644 == field705.charAt(var37)) {
                                    var36 = true;
                                    break;
                                }
                            }
                            if (Statics.field1573 == 13) {
                                field708 = class157.field2495;
                                field695 = class157.field2496;
                                field686 = class157.field2497;
                                field696 = 2;
                                field704 = 0;
                                field693 = "";
                            } else {
                                if (Statics.field1573 == 85 && field700.length() > 0) {
                                    field700 = field700.substring(0, field700.length() - 1);
                                }
                                if (Statics.field1573 == 84) {
                                    method124();
                                    return;
                                }
                                if (var36 && field700.length() < 320) {
                                    field700 = field700 + Statics.field2644;
                                }
                            }
                        }
                    } else if (field696 == 6) {
                        while (true) {
                            do {
                                if (!class137.method135()) {
                                    short var38 = 321;
                                    if (var10 == 1 && var12 >= var38 - 20 && var12 <= var38 + 20) {
                                        field708 = class157.field2495;
                                        field695 = class157.field2496;
                                        field686 = class157.field2497;
                                        field696 = 2;
                                        field704 = 0;
                                        field693 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field1573 != 84 && Statics.field1573 != 13);
                            field708 = class157.field2495;
                            field695 = class157.field2496;
                            field686 = class157.field2497;
                            field696 = 2;
                            field704 = 0;
                            field693 = "";
                        }
                    }
                }
            }
        } else if (class140.field2130 == 1 || !Statics.field2882 && class140.field2130 == 4) {
            int var1 = field680 + 280;
            if (class140.field2128 >= var1 && class140.field2128 <= var1 + 14 && class140.field2129 >= 4 && class140.field2129 <= 18) {
                class26.method166(0, 0);
            } else if (class140.field2128 >= var1 + 15 && class140.field2128 <= var1 + 80 && class140.field2129 >= 4 && class140.field2129 <= 18) {
                class26.method166(0, 1);
            } else {
                int var2 = field680 + 390;
                if (class140.field2128 >= var2 && class140.field2128 <= var2 + 14 && class140.field2129 >= 4 && class140.field2129 <= 18) {
                    class26.method166(1, 0);
                } else if (class140.field2128 >= var2 + 15 && class140.field2128 <= var2 + 80 && class140.field2129 >= 4 && class140.field2129 <= 18) {
                    class26.method166(1, 1);
                } else {
                    int var3 = field680 + 500;
                    if (class140.field2128 >= var3 && class140.field2128 <= var3 + 14 && class140.field2129 >= 4 && class140.field2129 <= 18) {
                        class26.method166(2, 0);
                    } else if (class140.field2128 >= var3 + 15 && class140.field2128 <= var3 + 80 && class140.field2129 >= 4 && class140.field2129 <= 18) {
                        class26.method166(2, 1);
                    } else {
                        int var4 = field680 + 610;
                        if (class140.field2128 >= var4 && class140.field2128 <= var4 + 14 && class140.field2129 >= 4 && class140.field2129 <= 18) {
                            class26.method166(3, 0);
                        } else if (class140.field2128 >= var4 + 15 && class140.field2128 <= var4 + 80 && class140.field2129 >= 4 && class140.field2129 <= 18) {
                            class26.method166(3, 1);
                        } else if (class140.field2128 >= field680 + 708 && class140.field2129 >= 4 && class140.field2128 <= field680 + 708 + 50 && class140.field2129 <= 20) {
                            field707 = false;
                            Statics.field744.method1644(field680, 0);
                            Statics.field56.method1644(field680 + 382, 0);
                            Statics.field2140.method1790(field680 + 382 - Statics.field2140.field1376 / 2, 18);
                        } else if (field687 != -1) {
                            class26 var5 = Statics.field602[field687];
                            method675(var5);
                            field707 = false;
                            Statics.field744.method1644(field680, 0);
                            Statics.field56.method1644(field680 + 382, 0);
                            Statics.field2140.method1790(field680 + 382 - Statics.field2140.field1376 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("e.j(I)V")
    public static void method124() {
        field700 = field700.trim();
        if (field700.length() == 0) {
            method768(class157.field2447, class157.field2527, class157.field2528);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method112("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class119 var4 = new class119(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field1959, var4.field1955, 1000 - var4.field1955);
                if (var5 == -1) {
                    var4.field1955 = 0;
                    long var8 = var4.method2387();
                    var6 = var8;
                    break;
                }
                var4.field1955 += var5;
                if (var4.field1955 >= 1000) {
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
            var13 = class10.method658(var6, field700);
        }
        switch(var13) {
            case 2:
                method768(class157.field2529, class157.field2530, class157.field2531);
                field696 = 6;
                break;
            case 3:
                method768(class157.field2532, class157.field2436, class157.field2534);
                break;
            case 4:
                method768(class157.field2535, class157.field2536, class157.field2537);
                break;
            case 5:
                method768(class157.field2538, class157.field2353, class157.field2479);
                break;
            case 6:
                method768(class157.field2541, class157.field2542, class157.field2543);
                break;
            case 7:
                method768(class157.field2519, class157.field2545, class157.field2546);
        }
    }

    @ObfuscatedName("ar.i(Lht;Lht;Lht;ZI)V")
    public static void method683(class224 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg3) {
            field680 = (Statics.field942 - client.field472) / 2;
            field683 = field680 + 202;
        }
        if (field707) {
            method111(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field744.method1644(field680, 0);
            Statics.field56.method1644(field680 + 382, 0);
            Statics.field2140.method1790(field680 + 382 - Statics.field2140.field1376 / 2, 18);
        }
        if (client.field382 == 0 || client.field382 == 5) {
            byte var4 = 20;
            arg0.method3828(class157.field2458, field683 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class80.method1737(field683 + 180 - 152, var5, 304, 34, 9179409);
            class80.method1737(field683 + 180 - 151, var5 + 1, 302, 32, 0);
            class80.method1735(field683 + 180 - 150, var5 + 2, field694 * 3, 30, 9179409);
            class80.method1735(field694 * 3 + (field683 + 180 - 150), var5 + 2, 300 - field694 * 3, 30, 0);
            arg0.method3828(field710, field683 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field382 == 20) {
            Statics.field681.method1790(field683 + 180 - Statics.field681.field1376 / 2, 271 - Statics.field681.field1374 / 2);
            short var6 = 211;
            arg0.method3828(field708, field683 + 180, var6, 16776960, 0);
            int var125 = var6 + 15;
            arg0.method3828(field695, field683 + 180, var125, 16776960, 0);
            int var126 = var125 + 15;
            arg0.method3828(field686, field683 + 180, var126, 16776960, 0);
            int var127 = var126 + 15;
            int var128 = var127 + 10;
            if (field696 != 4) {
                arg0.method3826(class157.field2423, field683 + 180 - 110, var128, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field700; arg0.method3821(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3826(class223.method3825(var8), field683 + 180 - 70, var128, 16777215, 0);
                var125 = var128 + 15;
                String var10 = class157.field2514;
                String var11 = field693;
                int var12 = var11.length();
                char[] var13 = new char[var12];
                for (int var14 = 0; var14 < var12; var14++) {
                    var13[var14] = '*';
                }
                String var15 = new String(var13);
                arg0.method3826(var10 + var15, field683 + 180 - 108, var125, 16777215, 0);
                var125 += 15;
            }
        }
        if (client.field382 == 10 || client.field382 == 11) {
            Statics.field681.method1790(field683, 171);
            if (field696 == 0) {
                short var17 = 251;
                arg0.method3828(class157.field2516, field683 + 180, var17, 16776960, 0);
                int var129 = var17 + 30;
                int var18 = field683 + 180 - 80;
                short var19 = 291;
                Statics.field550.method1790(var18 - 73, var19 - 20);
                arg0.method3829(class157.field2517, var18 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var20 = field683 + 180 + 80;
                Statics.field550.method1790(var20 - 73, var19 - 20);
                arg0.method3829(class157.field2518, var20 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field696 == 1) {
                arg0.method3828(class157.field2298, field683 + 180, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3828(field708, field683 + 180, var21, 16777215, 0);
                int var130 = var21 + 15;
                arg0.method3828(field695, field683 + 180, var130, 16777215, 0);
                int var131 = var130 + 15;
                arg0.method3828(field686, field683 + 180, var131, 16777215, 0);
                int var132 = var131 + 15;
                int var22 = field683 + 180 - 80;
                short var23 = 321;
                Statics.field550.method1790(var22 - 73, var23 - 20);
                arg0.method3828(class157.field2287, var22, var23 + 5, 16777215, 0);
                int var24 = field683 + 180 + 80;
                Statics.field550.method1790(var24 - 73, var23 - 20);
                arg0.method3828(class157.field2468, var24, var23 + 5, 16777215, 0);
            } else if (field696 == 2) {
                short var25 = 211;
                arg0.method3828(field708, field683 + 180, var25, 16776960, 0);
                int var133 = var25 + 15;
                arg0.method3828(field695, field683 + 180, var133, 16776960, 0);
                int var134 = var133 + 15;
                arg0.method3828(field686, field683 + 180, var134, 16776960, 0);
                int var135 = var134 + 15;
                int var136 = var135 + 10;
                arg0.method3826(class157.field2423, field683 + 180 - 110, var136, 16777215, 0);
                short var26 = 200;
                String var27;
                for (var27 = field700; arg0.method3821(var27) > var26; var27 = var27.substring(1)) {
                }
                arg0.method3826(class223.method3825(var27) + (field704 == 0 & client.field423 % 40 < 20 ? class2.method2885(16776960) + class2.field20 : ""), field683 + 180 - 70, var136, 16777215, 0);
                var133 = var136 + 15;
                String var29 = class157.field2514;
                String var30 = field693;
                int var31 = var30.length();
                char[] var32 = new char[var31];
                for (int var33 = 0; var33 < var31; var33++) {
                    var32[var33] = '*';
                }
                String var34 = new String(var32);
                arg0.method3826(var29 + var34 + (field704 == 1 & client.field423 % 40 < 20 ? class2.method2885(16776960) + class2.field20 : ""), field683 + 180 - 108, var133, 16777215, 0);
                var133 += 15;
                int var36 = field683 + 180 - 80;
                short var37 = 321;
                Statics.field550.method1790(var36 - 73, var37 - 20);
                arg0.method3828(class157.field2362, var36, var37 + 5, 16777215, 0);
                int var38 = field683 + 180 + 80;
                Statics.field550.method1790(var38 - 73, var37 - 20);
                arg0.method3828(class157.field2468, var38, var37 + 5, 16777215, 0);
                short var39 = 357;
                arg1.method3828(class157.field2521, field683 + 180, var39, 16776960, 0);
            } else if (field696 == 4) {
                arg0.method3828(class157.field2508, field683 + 180, 211, 16776960, 0);
                short var40 = 236;
                arg0.method3828(field708, field683 + 180, var40, 16777215, 0);
                int var137 = var40 + 15;
                arg0.method3828(field695, field683 + 180, var137, 16777215, 0);
                int var138 = var137 + 15;
                arg0.method3828(field686, field683 + 180, var138, 16777215, 0);
                int var139 = var138 + 15;
                String var42 = class157.field2526;
                String var43 = Statics.field553;
                int var44 = var43.length();
                char[] var45 = new char[var44];
                for (int var46 = 0; var46 < var44; var46++) {
                    var45[var46] = '*';
                }
                String var47 = new String(var45);
                arg0.method3826(var42 + var47 + (client.field423 % 40 < 20 ? class2.method2885(16776960) + class2.field20 : ""), field683 + 180 - 108, var139, 16777215, 0);
                var137 = var139 - 8;
                arg0.method3826(class157.field2434, field683 + 180 - 9, var137, 16776960, 0);
                var137 += 15;
                arg0.method3826(class157.field2292, field683 + 180 - 9, var137, 16776960, 0);
                int var49 = field683 + 180 - 9 + arg0.method3821(class157.field2292) + 15;
                int var50 = var137 - arg0.field3165;
                class81 var51;
                if (field703) {
                    var51 = Statics.field645;
                } else {
                    var51 = Statics.field756;
                }
                var51.method1790(var49, var50);
                var137 += 15;
                int var52 = field683 + 180 - 80;
                short var53 = 321;
                Statics.field550.method1790(var52 - 73, var53 - 20);
                arg0.method3828(class157.field2287, var52, var53 + 5, 16777215, 0);
                int var54 = field683 + 180 + 80;
                Statics.field550.method1790(var54 - 73, var53 - 20);
                arg0.method3828(class157.field2468, var54, var53 + 5, 16777215, 0);
                arg1.method3828(class157.field2303, field683 + 180, var53 + 36, 255, 0);
            } else if (field696 == 5) {
                arg0.method3828(class157.field2522, field683 + 180, 201, 16776960, 0);
                short var55 = 221;
                arg2.method3828(field708, field683 + 180, var55, 16776960, 0);
                int var140 = var55 + 15;
                arg2.method3828(field695, field683 + 180, var140, 16776960, 0);
                int var141 = var140 + 15;
                arg2.method3828(field686, field683 + 180, var141, 16776960, 0);
                int var142 = var141 + 15;
                int var143 = var142 + 14;
                arg0.method3826(class157.field2428, field683 + 180 - 145, var143, 16777215, 0);
                short var56 = 174;
                String var57;
                for (var57 = field700; arg0.method3821(var57) > var56; var57 = var57.substring(1)) {
                }
                arg0.method3826(class223.method3825(var57) + (client.field423 % 40 < 20 ? class2.method2885(16776960) + class2.field20 : ""), field683 + 180 - 34, var143, 16777215, 0);
                var140 = var143 + 15;
                int var58 = field683 + 180 - 80;
                short var59 = 321;
                Statics.field550.method1790(var58 - 73, var59 - 20);
                arg0.method3828(class157.field2349, var58, var59 + 5, 16777215, 0);
                int var60 = field683 + 180 + 80;
                Statics.field550.method1790(var60 - 73, var59 - 20);
                arg0.method3828(class157.field2525, var60, var59 + 5, 16777215, 0);
            } else if (field696 == 6) {
                short var61 = 211;
                arg0.method3828(field708, field683 + 180, var61, 16776960, 0);
                int var144 = var61 + 15;
                arg0.method3828(field695, field683 + 180, var144, 16776960, 0);
                int var145 = var144 + 15;
                arg0.method3828(field686, field683 + 180, var145, 16776960, 0);
                int var146 = var145 + 15;
                int var62 = field683 + 180;
                short var63 = 321;
                Statics.field550.method1790(var62 - 73, var63 - 20);
                arg0.method3828(class157.field2525, var62, var63 + 5, 16777215, 0);
            }
        }
        if (field692 > 0) {
            int var64 = field692;
            short var65 = 256;
            field690 += var64 * 128;
            if (field690 > Statics.field1033.length) {
                field690 -= Statics.field1033.length;
                int var66 = (int) (Math.random() * 12.0D);
                method46(Statics.field651[var66]);
            }
            int var67 = 0;
            int var68 = var64 * 128;
            int var69 = (var65 - var64) * 128;
            for (int var70 = 0; var70 < var69; var70++) {
                int var71 = Statics.field250[var67 + var68] - Statics.field1033[field690 + var67 & Statics.field1033.length - 1] * var64 / 6;
                if (var71 < 0) {
                    var71 = 0;
                }
                Statics.field250[var67++] = var71;
            }
            for (int var72 = var65 - var64; var72 < var65; var72++) {
                int var73 = var72 * 128;
                for (int var74 = 0; var74 < 128; var74++) {
                    int var75 = (int) (Math.random() * 100.0D);
                    if (var75 < 50 && var74 > 10 && var74 < 118) {
                        Statics.field250[var73 + var74] = 255;
                    } else {
                        Statics.field250[var73 + var74] = 0;
                    }
                }
            }
            if (field711 > 0) {
                field711 -= var64 * 4;
            }
            if (field688 > 0) {
                field688 -= var64 * 4;
            }
            if (field711 == 0 && field688 == 0) {
                int var76 = (int) (Math.random() * (double) (2000 / var64));
                if (var76 == 0) {
                    field711 = 1024;
                }
                if (var76 == 1) {
                    field688 = 1024;
                }
            }
            for (int var77 = 0; var77 < var65 - var64; var77++) {
                field697[var77] = field697[var64 + var77];
            }
            for (int var78 = var65 - var64; var78 < var65; var78++) {
                field697[var78] = (int) (Math.sin((double) field699 / 14.0D) * 16.0D + Math.sin((double) field699 / 15.0D) * 14.0D + Math.sin((double) field699 / 16.0D) * 12.0D);
                field699++;
            }
            field691 += var64 * 1157359945;
            int var79 = ((client.field423 & 0x1) + var64) / 2;
            if (var79 > 0) {
                for (int var80 = 0; var80 < field691 * 1988542788; var80++) {
                    int var81 = (int) (Math.random() * 124.0D) + 2;
                    int var82 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field250[(var82 << 7) + var81] = 192;
                }
                field691 = 0;
                int var83 = 0;
                label326: while (true) {
                    if (var83 >= var65) {
                        int var87 = 0;
                        while (true) {
                            if (var87 >= 128) {
                                break label326;
                            }
                            int var88 = 0;
                            for (int var89 = -var79; var89 < var65; var89++) {
                                int var90 = var89 * 128;
                                if (var79 + var89 < var65) {
                                    var88 += Statics.field631[var79 * 128 + var87 + var90];
                                }
                                if (var89 - (var79 + 1) >= 0) {
                                    var88 -= Statics.field631[var87 + var90 - (var79 + 1) * 128];
                                }
                                if (var89 >= 0) {
                                    Statics.field250[var87 + var90] = var88 / (var79 * 2 + 1);
                                }
                            }
                            var87++;
                        }
                    }
                    int var84 = 0;
                    int var85 = var83 * 128;
                    for (int var86 = -var79; var86 < 128; var86++) {
                        if (var79 + var86 < 128) {
                            var84 += Statics.field250[var85 + var86 + var79];
                        }
                        if (var86 - (var79 + 1) >= 0) {
                            var84 -= Statics.field250[var85 + var86 - (var79 + 1)];
                        }
                        if (var86 >= 0) {
                            Statics.field631[var85 + var86] = var84 / (var79 * 2 + 1);
                        }
                    }
                    var83++;
                }
            }
            field692 = 0;
        }
        short var91 = 256;
        if (field711 > 0) {
            for (int var92 = 0; var92 < 256; var92++) {
                if (field711 > 768) {
                    Statics.field1057[var92] = method184(Statics.field5[var92], Statics.field2246[var92], 1024 - field711);
                } else if (field711 > 256) {
                    Statics.field1057[var92] = Statics.field2246[var92];
                } else {
                    Statics.field1057[var92] = method184(Statics.field2246[var92], Statics.field5[var92], 256 - field711);
                }
            }
        } else if (field688 > 0) {
            for (int var93 = 0; var93 < 256; var93++) {
                if (field688 > 768) {
                    Statics.field1057[var93] = method184(Statics.field5[var93], Statics.field702[var93], 1024 - field688);
                } else if (field688 > 256) {
                    Statics.field1057[var93] = Statics.field702[var93];
                } else {
                    Statics.field1057[var93] = method184(Statics.field702[var93], Statics.field5[var93], 256 - field688);
                }
            }
        } else {
            for (int var94 = 0; var94 < 256; var94++) {
                Statics.field1057[var94] = Statics.field5[var94];
            }
        }
        class80.method1784(field680, 9, field680 + 128, var91 + 7);
        Statics.field744.method1644(field680, 0);
        class80.method1751();
        int var95 = 0;
        int var96 = field680 + Statics.field2145.field1348 * 9;
        for (int var97 = 1; var97 < var91 - 1; var97++) {
            int var98 = (var91 - var97) * field697[var97] / var91;
            int var99 = var98 + 22;
            if (var99 < 0) {
                var99 = 0;
            }
            var95 += var99;
            for (int var100 = var99; var100 < 128; var100++) {
                int var101 = Statics.field250[var95++];
                if (var101 == 0) {
                    var96++;
                } else {
                    int var103 = 256 - var101;
                    int var104 = Statics.field1057[var101];
                    int var105 = Statics.field2145.field1349[var96];
                    Statics.field2145.field1349[var96++] = ((var104 & 0xFF00) * var101 + (var105 & 0xFF00) * var103 & 0xFF0000) + ((var104 & 0xFF00FF) * var101 + (var105 & 0xFF00FF) * var103 & 0xFF00FF00) >> 8;
                }
            }
            var96 += Statics.field2145.field1348 + var99 - 128;
        }
        class80.method1784(field680 + 765 - 128, 9, field680 + 765, var91 + 7);
        Statics.field56.method1644(field680 + 382, 0);
        class80.method1751();
        int var106 = 0;
        int var107 = field680 + Statics.field2145.field1348 * 9 + 24 + 637;
        for (int var108 = 1; var108 < var91 - 1; var108++) {
            int var109 = (var91 - var108) * field697[var108] / var91;
            int var110 = 103 - var109;
            int var111 = var107 + var109;
            for (int var112 = 0; var112 < var110; var112++) {
                int var113 = Statics.field250[var106++];
                if (var113 == 0) {
                    var111++;
                } else {
                    int var115 = 256 - var113;
                    int var116 = Statics.field1057[var113];
                    int var117 = Statics.field2145.field1349[var111];
                    Statics.field2145.field1349[var111++] = ((var116 & 0xFF00FF) * var113 + (var117 & 0xFF00FF) * var115 & 0xFF00FF00) + ((var116 & 0xFF00) * var113 + (var117 & 0xFF00) * var115 & 0xFF0000) >> 8;
                }
            }
            var106 += 128 - var110;
            var107 = Statics.field2145.field1348 - var110 - var109 + var111;
        }
        Statics.field1032[Statics.field2665.field133 ? 1 : 0].method1790(field680 + 765 - 40, 463);
        if (client.field382 > 5 && client.field265 == 0) {
            if (Statics.field253 == null) {
                Statics.field253 = class77.method3190(Statics.field2023, "sl_button", "");
            } else {
                int var118 = field680 + 5;
                short var119 = 463;
                byte var120 = 100;
                byte var121 = 35;
                Statics.field253.method1790(var118, var119);
                arg0.method3828(class157.field2449 + " " + client.field260, var120 / 2 + var118, var121 / 2 + var119 - 2, 16777215, 0);
                if (Statics.field1641 == null) {
                    arg1.method3828(class157.field2557, var120 / 2 + var118, var121 / 2 + var119 + 12, 16777215, 0);
                } else {
                    arg1.method3828(class157.field2348, var120 / 2 + var118, var121 / 2 + var119 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var122 = Statics.field1559.getGraphics();
            Statics.field2145.method1557(var122, 0, 0);
        } catch (Exception var124) {
            Statics.field1559.repaint();
        }
    }

    @ObfuscatedName("aj.x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method768(String arg0, String arg1, String arg2) {
        field708 = arg0;
        field695 = arg1;
        field686 = arg2;
    }

    @ObfuscatedName("u.g(Lcc;I)V")
    public static final void method46(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1033.length; var2++) {
            Statics.field1033[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1033[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field689[var8] = (Statics.field1033[var8 - 1] + Statics.field1033[var8 + 1] + Statics.field1033[var8 - 128] + Statics.field1033[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1033;
            Statics.field1033 = Statics.field689;
            Statics.field689 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1374; var11++) {
            for (int var12 = 0; var12 < arg0.field1376; var12++) {
                if (arg0.field1380[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1377;
                    int var14 = var11 + 16 + arg0.field1378;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1033[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("h.e(IIII)I")
    public static final int method184(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("g.p(Lht;Lht;I)V")
    public static void method111(class224 arg0, class224 arg1) {
        if (Statics.field540 == null) {
            Statics.field540 = class77.method774(Statics.field2023, "sl_back", "");
        }
        if (Statics.field1405 == null) {
            Statics.field1405 = class77.method990(Statics.field2023, "sl_flags", "");
        }
        if (Statics.field2565 == null) {
            Statics.field2565 = class77.method990(Statics.field2023, "sl_arrows", "");
        }
        if (Statics.field216 == null) {
            Statics.field216 = class77.method990(Statics.field2023, "sl_stars", "");
        }
        class80.method1735(field680, 23, 765, 480, 0);
        class80.method1747(field680, 0, 125, 23, 12425273, 9135624);
        class80.method1747(field680 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3828(class157.field2547, field680 + 62, 15, 0, -1);
        if (Statics.field216 != null) {
            Statics.field216[1].method1790(field680 + 140, 1);
            arg1.method3826(class157.field2548, field680 + 152, 10, 16777215, -1);
            Statics.field216[0].method1790(field680 + 140, 12);
            arg1.method3826(class157.field2283, field680 + 152, 21, 16777215, -1);
        }
        if (Statics.field2565 != null) {
            int var2 = field680 + 280;
            if (class26.field601[0] == 0 && class26.field605[0] == 0) {
                Statics.field2565[2].method1790(var2, 4);
            } else {
                Statics.field2565[0].method1790(var2, 4);
            }
            if (class26.field601[0] == 0 && class26.field605[0] == 1) {
                Statics.field2565[3].method1790(var2 + 15, 4);
            } else {
                Statics.field2565[1].method1790(var2 + 15, 4);
            }
            arg0.method3826(class157.field2455, var2 + 32, 17, 16777215, -1);
            int var3 = field680 + 390;
            if (class26.field601[0] == 1 && class26.field605[0] == 0) {
                Statics.field2565[2].method1790(var3, 4);
            } else {
                Statics.field2565[0].method1790(var3, 4);
            }
            if (class26.field601[0] == 1 && class26.field605[0] == 1) {
                Statics.field2565[3].method1790(var3 + 15, 4);
            } else {
                Statics.field2565[1].method1790(var3 + 15, 4);
            }
            arg0.method3826(class157.field2551, var3 + 32, 17, 16777215, -1);
            int var4 = field680 + 500;
            if (class26.field601[0] == 2 && class26.field605[0] == 0) {
                Statics.field2565[2].method1790(var4, 4);
            } else {
                Statics.field2565[0].method1790(var4, 4);
            }
            if (class26.field601[0] == 2 && class26.field605[0] == 1) {
                Statics.field2565[3].method1790(var4 + 15, 4);
            } else {
                Statics.field2565[1].method1790(var4 + 15, 4);
            }
            arg0.method3826(class157.field2552, var4 + 32, 17, 16777215, -1);
            int var5 = field680 + 610;
            if (class26.field601[0] == 3 && class26.field605[0] == 0) {
                Statics.field2565[2].method1790(var5, 4);
            } else {
                Statics.field2565[0].method1790(var5, 4);
            }
            if (class26.field601[0] == 3 && class26.field605[0] == 1) {
                Statics.field2565[3].method1790(var5 + 15, 4);
            } else {
                Statics.field2565[1].method1790(var5 + 15, 4);
            }
            arg0.method3826(class157.field2425, var5 + 32, 17, 16777215, -1);
        }
        class80.method1735(field680 + 708, 4, 50, 16, 0);
        arg1.method3828(class157.field2468, field680 + 708 + 25, 16, 16777215, -1);
        int var6 = 0;
        int var7 = 33554432;
        int var8 = client.field461 & var7;
        for (int var9 = 0; var9 < class26.field603; var9++) {
            class26 var10 = Statics.field602[var9];
            if ((var10.field608 & var7) == var8 || (var10.field608 & var7) == 0) {
                var6++;
            }
        }
        field687 = -1;
        if (Statics.field540 != null) {
            byte var11 = 88;
            byte var12 = 19;
            int var13 = 765 / (var11 + 1);
            int var14 = 480 / (var12 + 1);
            int var15;
            int var16;
            do {
                var15 = var14;
                var16 = var13;
                if ((var13 - 1) * var14 >= var6) {
                    var13--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
                if ((var14 - 1) * var13 >= var6) {
                    var14--;
                }
            } while (var14 != var15 || var13 != var16);
            int var17 = (765 - var11 * var13) / (var13 + 1);
            if (var17 > 5) {
                var17 = 5;
            }
            int var18 = (480 - var12 * var14) / (var14 + 1);
            if (var18 > 5) {
                var18 = 5;
            }
            int var19 = (765 - var11 * var13 - (var13 - 1) * var17) / 2;
            int var20 = (480 - var12 * var14 - (var14 - 1) * var18) / 2;
            int var21 = var20 + 23;
            int var22 = field680 + var19;
            int var23 = 0;
            boolean var24 = false;
            for (int var25 = 0; var25 < class26.field603; var25++) {
                class26 var26 = Statics.field602[var25];
                if ((var26.field608 & var7) == var8 || (var26.field608 & var7) == 0) {
                    boolean var27 = true;
                    String var28 = Integer.toString(var26.field617);
                    if (var26.field617 == -1) {
                        var28 = class157.field2554;
                        var27 = false;
                    } else if (var26.field617 > 1980) {
                        var28 = class157.field2555;
                        var27 = false;
                    }
                    byte var29;
                    if (var26.method632()) {
                        if (var26.method621()) {
                            var29 = 3;
                        } else {
                            var29 = 2;
                        }
                    } else if (var26.method621()) {
                        var29 = 1;
                    } else {
                        var29 = 0;
                    }
                    if (class140.field2121 >= var22 && class140.field2122 >= var21 && class140.field2121 < var11 + var22 && class140.field2122 < var12 + var21 && var27) {
                        field687 = var25;
                        Statics.field540[var29].method1654(var22, var21, 128, 16777215);
                        var24 = true;
                    } else {
                        Statics.field540[var29].method1644(var22, var21);
                    }
                    if (Statics.field1405 != null) {
                        Statics.field1405[(var26.method621() ? 8 : 0) + var26.field612].method1790(var22 + 29, var21);
                    }
                    arg0.method3828(Integer.toString(var26.field607), var22 + 15, var12 / 2 + var21 + 5, 0, -1);
                    arg1.method3828(var28, var22 + 60, var12 / 2 + var21 + 5, 268435455, -1);
                    var21 += var12 + var18;
                    var23++;
                    if (var23 >= var14) {
                        var21 = var20 + 23;
                        var22 += var11 + var17;
                        var23 = 0;
                    }
                }
            }
            if (var24) {
                int var30 = arg1.method3821(Statics.field602[field687].field614) + 6;
                int var31 = arg1.field3165 + 8;
                class80.method1735(class140.field2121 - var30 / 2, class140.field2122 + 20 + 5, var30, var31, 16777120);
                class80.method1737(class140.field2121 - var30 / 2, class140.field2122 + 20 + 5, var30, var31, 0);
                arg1.method3828(Statics.field602[field687].field614, class140.field2121, class140.field2122 + 20 + 5 + arg1.field3165 + 4, 0, -1);
            }
        }
        try {
            Graphics var32 = Statics.field1559.getGraphics();
            Statics.field2145.method1557(var32, 0, 0);
        } catch (Exception var34) {
            Statics.field1559.repaint();
        }
    }

    @ObfuscatedName("ac.a(Lt;I)V")
    public static void method675(class26 arg0) {
        if (arg0.method621() != client.field263) {
            client.field263 = arg0.method621();
            class52.method2266(arg0.method621());
        }
        Statics.field212 = arg0.field610;
        client.field260 = arg0.field607;
        client.field461 = arg0.field608;
        Statics.field295 = client.field520 == 0 ? 43594 : arg0.field607 + 40000;
        Statics.field1979 = client.field520 == 0 ? 443 : arg0.field607 + 50000;
        Statics.field3188 = Statics.field295;
    }

    @ObfuscatedName("bs.v(B)V")
    public static void method1526() {
        if (class26.method157()) {
            field707 = true;
        }
    }
}

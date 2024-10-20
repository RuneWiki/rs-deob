package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

@ObfuscatedName("ab")
public class class30 {

    @ObfuscatedName("ab.k")
    public static int field701 = 0;

    @ObfuscatedName("ab.s")
    public static int field686 = field701 + 202;

    @ObfuscatedName("ab.h")
    public static int[] field697 = new int[256];

    @ObfuscatedName("ab.c")
    public static int field693 = 0;

    @ObfuscatedName("ab.u")
    public static int field694 = 0;

    @ObfuscatedName("ab.ah")
    public static int field695 = 0;

    @ObfuscatedName("ab.ab")
    public static int field696 = 0;

    @ObfuscatedName("ab.am")
    public static int field717 = 0;

    @ObfuscatedName("ab.ar")
    public static int field711 = 0;

    @ObfuscatedName("ab.an")
    public static int field699 = 10;

    @ObfuscatedName("ab.az")
    public static String field700 = "";

    @ObfuscatedName("ab.at")
    public static int field707 = 0;

    @ObfuscatedName("ab.ag")
    public static String field692 = "";

    @ObfuscatedName("ab.as")
    public static String field714 = "";

    @ObfuscatedName("ab.ao")
    public static String field703 = "";

    @ObfuscatedName("ab.af")
    public static String field705 = "";

    @ObfuscatedName("ab.ay")
    public static String field706 = "";

    @ObfuscatedName("ab.aq")
    public static class150 field715 = class150.field2505;

    @ObfuscatedName("ab.ap")
    public static boolean field710 = true;

    @ObfuscatedName("ab.ac")
    public static int field702 = 0;

    @ObfuscatedName("ab.av")
    public static String field698 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ab.ai")
    public static String field713 = "1234567890";

    @ObfuscatedName("ab.ae")
    public static boolean field691 = false;

    @ObfuscatedName("ab.bn")
    public static int field704 = -1;

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.y(Lfd;Lfd;B)I")
    public static int method812(class158 arg0, class158 arg1) {
        int var2 = 0;
        if (arg0.method2919("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2919("logo", "")) {
            var2++;
        }
        if (arg1.method2919("titlebox", "")) {
            var2++;
        }
        if (arg1.method2919("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2919("runes", "")) {
            var2++;
        }
        if (arg1.method2919("title_mute", "")) {
            var2++;
        }
        if (arg1.method2892("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2892("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2919("sl_back", "");
        arg1.method2919("sl_flags", "");
        arg1.method2919("sl_arrows", "");
        arg1.method2919("sl_stars", "");
        arg1.method2919("sl_button", "");
        return var2;
    }

    @ObfuscatedName("client.k(B)I")
    public static int method482() {
        return 8;
    }

    @ObfuscatedName("au.g(Ljava/awt/Component;Lfd;Lfd;ZII)V")
    public static void method605(Component arg0, class158 arg1, class158 arg2, boolean arg3, int arg4) {
        if (!Statics.field712) {
            field707 = arg4;
            class75.method1553();
            byte[] var5 = arg1.method2890("title.jpg", "");
            Statics.field2811 = new class74(var5, arg0);
            Statics.field1005 = Statics.field2811.method1447();
            Statics.field689 = Statics.method946(arg2, "logo", "");
            Statics.field687 = Statics.method946(arg2, "titlebox", "");
            Statics.field688 = Statics.method946(arg2, "titlebutton", "");
            Statics.field1382 = class72.method127(arg2, "runes", "");
            Statics.field2627 = class72.method127(arg2, "title_mute", "");
            Statics.field2184 = Statics.method946(arg2, "options_radio_buttons,0", "");
            Statics.field1091 = Statics.method946(arg2, "options_radio_buttons,2", "");
            Statics.field682 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field682[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field682[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field682[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field682[var9 + 192] = 16777215;
            }
            Statics.field1314 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1314[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1314[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1314[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1314[var13 + 192] = 16777215;
            }
            Statics.field576 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field576[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field576[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field576[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field576[var17 + 192] = 16777215;
            }
            Statics.field1306 = new int[256];
            Statics.field3027 = new int[32768];
            Statics.field173 = new int[32768];
            method2776((class76) null);
            Statics.field719 = new int[32768];
            Statics.field1097 = new int[32768];
            if (arg3) {
                field705 = "";
                field706 = "";
            }
            Statics.field708 = 0;
            Statics.field709 = "";
            field710 = true;
            field691 = false;
            if (Statics.field2828.field133) {
                class174.method115(2);
            } else {
                class159 var18 = Statics.field830;
                int var19 = var18.method2888("scape main");
                int var20 = var18.method2889(var19, "");
                class174.method2788(2, var18, var19, var20, 255, false);
            }
            class162.method3528(false);
            Statics.field712 = true;
            field701 = (Statics.field178 - client.field485) / 2;
            field686 = field701 + 202;
            Statics.field2811.method1457(field701, 0);
            Statics.field1005.method1457(field701 + 382, 0);
            Statics.field689.method1613(field701 + 382 - Statics.field689.field1348 / 2, 18);
        } else if (arg4 == 4) {
            field707 = 4;
        }
    }

    @ObfuscatedName("ef.n(Lef;B)V")
    public static void method2736(class136 arg0) {
        if (!field691) {
            if ((class132.field2068 == 1 || !Statics.field213 && class132.field2068 == 4) && class132.field2077 >= field701 + 765 - 50 && class132.field2079 >= 453) {
                Statics.field2828.field133 = !Statics.field2828.field133;
                class9.method2780();
                if (Statics.field2828.field133) {
                    class174.method2786();
                } else {
                    class174.method2735(Statics.field830, "scape main", "", 255, false);
                }
            }
            if (client.field269 != 5) {
                field717++;
                if (client.field269 == 10 || client.field269 == 11) {
                    if (client.field492 == 0) {
                        if (class132.field2068 == 1 || !Statics.field213 && class132.field2068 == 4) {
                            int var6 = field701 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class132.field2077 >= var6 && class132.field2077 <= var6 + var8 && class132.field2079 >= var7 && class132.field2079 <= var7 + var9) {
                                method908();
                                return;
                            }
                        }
                        if (Statics.field615 != null) {
                            method908();
                        }
                    }
                    int var10 = class132.field2068;
                    int var11 = class132.field2077;
                    int var12 = class132.field2079;
                    if (!Statics.field213 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field707 == 0) {
                        int var13 = field686 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            label692: {
                                String var15 = client.method31("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var15));
                                        break label692;
                                    } catch (Exception var41) {
                                    }
                                }
                                if (class130.field2051.startsWith("win")) {
                                    class130.method861(var15, 0, "openjs");
                                } else if (class130.field2051.startsWith("mac")) {
                                    class130.method861(var15, 1, "openjs");
                                } else {
                                    class130.method861(var15, 2, "openjs");
                                }
                            }
                        }
                        int var17 = field686 + 180 + 80;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field262 & 0x4) != 0) {
                                if ((client.field262 & 0x400) == 0) {
                                    field692 = class148.field2438;
                                    field714 = class148.field2439;
                                    field703 = class148.field2440;
                                } else {
                                    field692 = class148.field2428;
                                    field714 = class148.field2459;
                                    field703 = class148.field2446;
                                }
                                field707 = 1;
                                field702 = 0;
                            } else if ((client.field262 & 0x400) == 0) {
                                field692 = class148.field2434;
                                field714 = class148.field2435;
                                field703 = class148.field2436;
                                field707 = 2;
                                field702 = 0;
                            } else {
                                field692 = class148.field2448;
                                field714 = class148.field2287;
                                field703 = class148.field2472;
                                field707 = 1;
                                field702 = 0;
                            }
                        }
                    } else if (field707 == 1) {
                        while (class129.method862()) {
                            if (Statics.field1471 == 84) {
                                field692 = class148.field2434;
                                field714 = class148.field2435;
                                field703 = class148.field2436;
                                field707 = 2;
                                field702 = 0;
                            } else if (Statics.field1471 == 13) {
                                field707 = 0;
                            }
                        }
                        int var18 = field686 + 180 - 80;
                        short var19 = 321;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var19 - 20 && var12 <= var19 + 20) {
                            field692 = class148.field2434;
                            field714 = class148.field2435;
                            field703 = class148.field2436;
                            field707 = 2;
                            field702 = 0;
                        }
                        int var20 = field686 + 180 + 80;
                        if (var10 == 1 && var11 >= var20 - 75 && var11 <= var20 + 75 && var12 >= var19 - 20 && var12 <= var19 + 20) {
                            field707 = 0;
                        }
                    } else if (field707 == 2) {
                        short var21 = 231;
                        int var43 = var21 + 30;
                        if (var10 == 1 && var12 >= var43 - 15 && var12 < var43) {
                            field702 = 0;
                        }
                        var43 += 15;
                        if (var10 == 1 && var12 >= var43 - 15 && var12 < var43) {
                            field702 = 1;
                        }
                        var43 += 15;
                        short var22 = 361;
                        if (var10 == 1 && var12 >= var22 - 15 && var12 < var22) {
                            method640(class148.field2465, class148.field2466, class148.field2467);
                            field707 = 5;
                            return;
                        }
                        int var23 = field686 + 180 - 80;
                        short var24 = 321;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                            field705 = field705.trim();
                            if (field705.length() == 0) {
                                method640(class148.field2273, class148.field2266, class148.field2342);
                                return;
                            }
                            if (field706.length() == 0) {
                                method640(class148.field2343, class148.field2295, class148.field2345);
                                return;
                            }
                            method640(class148.field2478, class148.field2450, class148.field2451);
                            field715 = Statics.field2828.field141.containsKey(class154.method576(field705)) ? class150.field2508 : class150.field2505;
                            client.method165(20);
                            return;
                        }
                        int var25 = field686 + 180 + 80;
                        if (var10 == 1 && var11 >= var25 - 75 && var11 <= var25 + 75 && var12 >= var24 - 20 && var12 <= var24 + 20) {
                            field707 = 0;
                            field705 = "";
                            field706 = "";
                            Statics.field708 = 0;
                            Statics.field709 = "";
                            field710 = true;
                        }
                        while (true) {
                            while (class129.method862()) {
                                boolean var26 = false;
                                for (int var27 = 0; var27 < field698.length(); var27++) {
                                    if (Statics.field2033 == field698.charAt(var27)) {
                                        var26 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1471 == 13) {
                                    field707 = 0;
                                    field705 = "";
                                    field706 = "";
                                    Statics.field708 = 0;
                                    Statics.field709 = "";
                                    field710 = true;
                                } else if (field702 == 0) {
                                    if (Statics.field1471 == 85 && field705.length() > 0) {
                                        field705 = field705.substring(0, field705.length() - 1);
                                    }
                                    if (Statics.field1471 == 84 || Statics.field1471 == 80) {
                                        field702 = 1;
                                    }
                                    if (var26 && field705.length() < 320) {
                                        field705 = field705 + Statics.field2033;
                                    }
                                } else if (field702 == 1) {
                                    if (Statics.field1471 == 85 && field706.length() > 0) {
                                        field706 = field706.substring(0, field706.length() - 1);
                                    }
                                    if (Statics.field1471 == 84 || Statics.field1471 == 80) {
                                        field702 = 0;
                                    }
                                    if (Statics.field1471 == 84) {
                                        field705 = field705.trim();
                                        if (field705.length() == 0) {
                                            method640(class148.field2273, class148.field2266, class148.field2342);
                                            return;
                                        }
                                        if (field706.length() == 0) {
                                            method640(class148.field2343, class148.field2295, class148.field2345);
                                            return;
                                        }
                                        method640(class148.field2478, class148.field2450, class148.field2451);
                                        field715 = Statics.field2828.field141.containsKey(class154.method576(field705)) ? class150.field2508 : class150.field2505;
                                        client.method165(20);
                                        return;
                                    }
                                    if (var26 && field706.length() < 20) {
                                        field706 = field706 + Statics.field2033;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field707 == 4) {
                        int var28 = field686 + 180 - 80;
                        short var29 = 321;
                        if (var10 == 1 && var11 >= var28 - 75 && var11 <= var28 + 75 && var12 >= var29 - 20 && var12 <= var29 + 20) {
                            Statics.field709.trim();
                            if (Statics.field709.length() != 6) {
                                method640(class148.field2256, class148.field2257, class148.field2258);
                                return;
                            }
                            Statics.field708 = Integer.parseInt(Statics.field709);
                            Statics.field709 = "";
                            field715 = field710 ? class150.field2504 : class150.field2506;
                            method640(class148.field2478, class148.field2450, class148.field2451);
                            client.method165(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field686 + 180 - 9 && var11 <= field686 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field710 = !field710;
                        }
                        if (var10 == 1 && var11 >= field686 + 180 - 34 && var11 <= field686 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            label707: {
                                String var30 = client.method31("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var30));
                                        break label707;
                                    } catch (Exception var42) {
                                    }
                                }
                                if (class130.field2051.startsWith("win")) {
                                    class130.method861(var30, 0, "openjs");
                                } else if (class130.field2051.startsWith("mac")) {
                                    class130.method861(var30, 1, "openjs");
                                } else {
                                    class130.method861(var30, 2, "openjs");
                                }
                            }
                        }
                        int var32 = field686 + 180 + 80;
                        if (var10 == 1 && var11 >= var32 - 75 && var11 <= var32 + 75 && var12 >= var29 - 20 && var12 <= var29 + 20) {
                            field707 = 0;
                            field705 = "";
                            field706 = "";
                            Statics.field708 = 0;
                            Statics.field709 = "";
                        }
                        while (class129.method862()) {
                            boolean var33 = false;
                            for (int var34 = 0; var34 < field713.length(); var34++) {
                                if (Statics.field2033 == field713.charAt(var34)) {
                                    var33 = true;
                                    break;
                                }
                            }
                            if (Statics.field1471 == 13) {
                                field707 = 0;
                                field705 = "";
                                field706 = "";
                                Statics.field708 = 0;
                                Statics.field709 = "";
                            } else {
                                if (Statics.field1471 == 85 && Statics.field709.length() > 0) {
                                    Statics.field709 = Statics.field709.substring(0, Statics.field709.length() - 1);
                                }
                                if (Statics.field1471 == 84) {
                                    Statics.field709.trim();
                                    if (Statics.field709.length() != 6) {
                                        method640(class148.field2256, class148.field2257, class148.field2258);
                                        return;
                                    }
                                    Statics.field708 = Integer.parseInt(Statics.field709);
                                    Statics.field709 = "";
                                    field715 = field710 ? class150.field2504 : class150.field2506;
                                    method640(class148.field2478, class148.field2450, class148.field2451);
                                    client.method165(20);
                                    return;
                                }
                                if (var33 && Statics.field709.length() < 6) {
                                    Statics.field709 = Statics.field709 + Statics.field2033;
                                }
                            }
                        }
                    } else if (field707 == 5) {
                        int var35 = field686 + 180 - 80;
                        short var36 = 321;
                        if (var10 == 1 && var11 >= var35 - 75 && var11 <= var35 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            method12();
                            return;
                        }
                        int var37 = field686 + 180 + 80;
                        if (var10 == 1 && var11 >= var37 - 75 && var11 <= var37 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            field692 = class148.field2434;
                            field714 = class148.field2435;
                            field703 = class148.field2436;
                            field707 = 2;
                            field702 = 0;
                            field706 = "";
                        }
                        while (class129.method862()) {
                            boolean var38 = false;
                            for (int var39 = 0; var39 < field698.length(); var39++) {
                                if (Statics.field2033 == field698.charAt(var39)) {
                                    var38 = true;
                                    break;
                                }
                            }
                            if (Statics.field1471 == 13) {
                                field692 = class148.field2434;
                                field714 = class148.field2435;
                                field703 = class148.field2436;
                                field707 = 2;
                                field702 = 0;
                                field706 = "";
                            } else {
                                if (Statics.field1471 == 85 && field705.length() > 0) {
                                    field705 = field705.substring(0, field705.length() - 1);
                                }
                                if (Statics.field1471 == 84) {
                                    method12();
                                    return;
                                }
                                if (var38 && field705.length() < 320) {
                                    field705 = field705 + Statics.field2033;
                                }
                            }
                        }
                    } else if (field707 == 6) {
                        while (true) {
                            do {
                                if (!class129.method862()) {
                                    short var40 = 321;
                                    if (var10 == 1 && var12 >= var40 - 20 && var12 <= var40 + 20) {
                                        field692 = class148.field2434;
                                        field714 = class148.field2435;
                                        field703 = class148.field2436;
                                        field707 = 2;
                                        field702 = 0;
                                        field706 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field1471 != 84 && Statics.field1471 != 13);
                            field692 = class148.field2434;
                            field714 = class148.field2435;
                            field703 = class148.field2436;
                            field707 = 2;
                            field702 = 0;
                            field706 = "";
                        }
                    }
                }
            }
        } else if (class132.field2068 == 1 || !Statics.field213 && class132.field2068 == 4) {
            int var1 = field701 + 280;
            if (class132.field2077 >= var1 && class132.field2077 <= var1 + 14 && class132.field2079 >= 4 && class132.field2079 <= 18) {
                class24.method3309(0, 0);
            } else if (class132.field2077 >= var1 + 15 && class132.field2077 <= var1 + 80 && class132.field2079 >= 4 && class132.field2079 <= 18) {
                class24.method3309(0, 1);
            } else {
                int var2 = field701 + 390;
                if (class132.field2077 >= var2 && class132.field2077 <= var2 + 14 && class132.field2079 >= 4 && class132.field2079 <= 18) {
                    class24.method3309(1, 0);
                } else if (class132.field2077 >= var2 + 15 && class132.field2077 <= var2 + 80 && class132.field2079 >= 4 && class132.field2079 <= 18) {
                    class24.method3309(1, 1);
                } else {
                    int var3 = field701 + 500;
                    if (class132.field2077 >= var3 && class132.field2077 <= var3 + 14 && class132.field2079 >= 4 && class132.field2079 <= 18) {
                        class24.method3309(2, 0);
                    } else if (class132.field2077 >= var3 + 15 && class132.field2077 <= var3 + 80 && class132.field2079 >= 4 && class132.field2079 <= 18) {
                        class24.method3309(2, 1);
                    } else {
                        int var4 = field701 + 610;
                        if (class132.field2077 >= var4 && class132.field2077 <= var4 + 14 && class132.field2079 >= 4 && class132.field2079 <= 18) {
                            class24.method3309(3, 0);
                        } else if (class132.field2077 >= var4 + 15 && class132.field2077 <= var4 + 80 && class132.field2079 >= 4 && class132.field2079 <= 18) {
                            class24.method3309(3, 1);
                        } else if (class132.field2077 >= field701 + 708 && class132.field2079 >= 4 && class132.field2077 <= field701 + 708 + 50 && class132.field2079 <= 20) {
                            field691 = false;
                            Statics.field2811.method1457(field701, 0);
                            Statics.field1005.method1457(field701 + 382, 0);
                            Statics.field689.method1613(field701 + 382 - Statics.field689.field1348 / 2, 18);
                        } else if (field704 != -1) {
                            class24 var5 = Statics.field610[field704];
                            method144(var5);
                            field691 = false;
                            Statics.field2811.method1457(field701, 0);
                            Statics.field1005.method1457(field701 + 382, 0);
                            Statics.field689.method1613(field701 + 382 - Statics.field689.field1348 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.t(I)V")
    public static void method12() {
        field705 = field705.trim();
        if (field705.length() == 0) {
            method640(class148.field2465, class148.field2466, class148.field2467);
            return;
        }
        long var6;
        try {
            URL var0 = new URL(client.method31("services", false) + "m=accountappeal/login.ws");
            URLConnection var1 = var0.openConnection();
            var1.setRequestProperty("connection", "close");
            var1.setDoInput(true);
            var1.setDoOutput(true);
            var1.setConnectTimeout(5000);
            OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
            var2.write("data1=req");
            var2.flush();
            InputStream var3 = var1.getInputStream();
            class111 var4 = new class111(new byte[1000]);
            while (true) {
                int var5 = var3.read(var4.field1897, var4.field1902, 1000 - var4.field1902);
                if (var5 == -1) {
                    var4.field1902 = 0;
                    long var8 = var4.method2166();
                    var6 = var8;
                    break;
                }
                var4.field1902 += var5;
                if (var4.field1902 >= 1000) {
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
            var13 = Statics.method1989(var6, field705);
        }
        switch(var13) {
            case 2:
                method640(class148.field2468, class148.field2469, class148.field2340);
                field707 = 6;
                break;
            case 3:
                method640(class148.field2445, class148.field2263, class148.field2473);
                break;
            case 4:
                method640(class148.field2242, class148.field2492, class148.field2330);
                break;
            case 5:
                method640(class148.field2354, class148.field2358, class148.field2479);
                break;
            case 6:
                method640(class148.field2416, class148.field2481, class148.field2482);
                break;
            case 7:
                method640(class148.field2483, class148.field2484, class148.field2245);
        }
    }

    @ObfuscatedName("bv.e(Lhe;Lhe;Lhe;ZI)V")
    public static void method1445(class215 arg0, class215 arg1, class215 arg2, boolean arg3) {
        if (arg3) {
            field701 = (Statics.field178 - client.field485) / 2;
            field686 = field701 + 202;
        }
        if (field691) {
            if (Statics.field2150 == null) {
                Statics.field2150 = class72.method156(Statics.field14, "sl_back", "");
            }
            if (Statics.field2577 == null) {
                Statics.field2577 = class72.method127(Statics.field14, "sl_flags", "");
            }
            if (Statics.field2157 == null) {
                Statics.field2157 = class72.method127(Statics.field14, "sl_arrows", "");
            }
            if (Statics.field1026 == null) {
                Statics.field1026 = class72.method127(Statics.field14, "sl_stars", "");
            }
            class75.method1575(field701, 23, 765, 480, 0);
            class75.method1556(field701, 0, 125, 23, 12425273, 9135624);
            class75.method1556(field701 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3667(class148.field2388, field701 + 62, 15, 0, -1);
            if (Statics.field1026 != null) {
                Statics.field1026[1].method1613(field701 + 140, 1);
                arg1.method3616(class148.field2487, field701 + 152, 10, 16777215, -1);
                Statics.field1026[0].method1613(field701 + 140, 12);
                arg1.method3616(class148.field2488, field701 + 152, 21, 16777215, -1);
            }
            if (Statics.field2157 != null) {
                int var4 = field701 + 280;
                if (class24.field607[0] == 0 && class24.field627[0] == 0) {
                    Statics.field2157[2].method1613(var4, 4);
                } else {
                    Statics.field2157[0].method1613(var4, 4);
                }
                if (class24.field607[0] == 0 && class24.field627[0] == 1) {
                    Statics.field2157[3].method1613(var4 + 15, 4);
                } else {
                    Statics.field2157[1].method1613(var4 + 15, 4);
                }
                arg0.method3616(class148.field2489, var4 + 32, 17, 16777215, -1);
                int var5 = field701 + 390;
                if (class24.field607[0] == 1 && class24.field627[0] == 0) {
                    Statics.field2157[2].method1613(var5, 4);
                } else {
                    Statics.field2157[0].method1613(var5, 4);
                }
                if (class24.field607[0] == 1 && class24.field627[0] == 1) {
                    Statics.field2157[3].method1613(var5 + 15, 4);
                } else {
                    Statics.field2157[1].method1613(var5 + 15, 4);
                }
                arg0.method3616(class148.field2490, var5 + 32, 17, 16777215, -1);
                int var6 = field701 + 500;
                if (class24.field607[0] == 2 && class24.field627[0] == 0) {
                    Statics.field2157[2].method1613(var6, 4);
                } else {
                    Statics.field2157[0].method1613(var6, 4);
                }
                if (class24.field607[0] == 2 && class24.field627[0] == 1) {
                    Statics.field2157[3].method1613(var6 + 15, 4);
                } else {
                    Statics.field2157[1].method1613(var6 + 15, 4);
                }
                arg0.method3616(class148.field2357, var6 + 32, 17, 16777215, -1);
                int var7 = field701 + 610;
                if (class24.field607[0] == 3 && class24.field627[0] == 0) {
                    Statics.field2157[2].method1613(var7, 4);
                } else {
                    Statics.field2157[0].method1613(var7, 4);
                }
                if (class24.field607[0] == 3 && class24.field627[0] == 1) {
                    Statics.field2157[3].method1613(var7 + 15, 4);
                } else {
                    Statics.field2157[1].method1613(var7 + 15, 4);
                }
                arg0.method3616(class148.field2392, var7 + 32, 17, 16777215, -1);
            }
            class75.method1575(field701 + 708, 4, 50, 16, 0);
            arg1.method3667(class148.field2393, field701 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field262 & var9;
            for (int var11 = 0; var11 < class24.field611; var11++) {
                class24 var12 = Statics.field610[var11];
                if ((var12.field617 & var9) == var10 || (var12.field617 & var9) == 0) {
                    var8++;
                }
            }
            field704 = -1;
            if (Statics.field2150 != null) {
                byte var13 = 88;
                byte var14 = 19;
                int var15 = 765 / (var13 + 1);
                int var16 = 480 / (var14 + 1);
                int var17;
                int var18;
                do {
                    var17 = var16;
                    var18 = var15;
                    if ((var15 - 1) * var16 >= var8) {
                        var15--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                    if ((var16 - 1) * var15 >= var8) {
                        var16--;
                    }
                } while (var16 != var17 || var15 != var18);
                int var19 = (765 - var13 * var15) / (var15 + 1);
                if (var19 > 5) {
                    var19 = 5;
                }
                int var20 = (480 - var14 * var16) / (var16 + 1);
                if (var20 > 5) {
                    var20 = 5;
                }
                int var21 = (765 - var13 * var15 - (var15 - 1) * var19) / 2;
                int var22 = (480 - var14 * var16 - (var16 - 1) * var20) / 2;
                int var23 = var22 + 23;
                int var24 = field701 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class24.field611; var27++) {
                    class24 var28 = Statics.field610[var27];
                    if ((var28.field617 & var9) == var10 || (var28.field617 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field609);
                        if (var28.field609 == -1) {
                            var30 = class148.field2329;
                            var29 = false;
                        } else if (var28.field609 > 1980) {
                            var30 = class148.field2494;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method536()) {
                            if (var28.method534()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method534()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class132.field2071 >= var24 && class132.field2072 * 76101137 >= var23 && class132.field2071 < var13 + var24 && class132.field2072 * 76101137 < var14 + var23 && var29) {
                            field704 = var27;
                            Statics.field2150[var31].method1463(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field2150[var31].method1457(var24, var23);
                        }
                        if (Statics.field2577 != null) {
                            Statics.field2577[(var28.method534() ? 8 : 0) + var28.field608].method1613(var24 + 29, var23);
                        }
                        arg0.method3667(Integer.toString(var28.field616), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3667(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
                        var23 += var14 + var20;
                        var25++;
                        if (var25 >= var16) {
                            var23 = var22 + 23;
                            var24 += var13 + var19;
                            var25 = 0;
                        }
                    }
                }
                if (var26) {
                    int var32 = arg1.method3611(Statics.field610[field704].field625) + 6;
                    int var33 = arg1.field3088 + 8;
                    class75.method1575(class132.field2071 - var32 / 2, class132.field2072 * 76101137 + 20 + 5, var32, var33, 16777120);
                    class75.method1557(class132.field2071 - var32 / 2, class132.field2072 * 76101137 + 20 + 5, var32, var33, 0);
                    arg1.method3667(Statics.field610[field704].field625, class132.field2071, class132.field2072 * 76101137 + 20 + 5 + arg1.field3088 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = Statics.field1094.getGraphics();
                Statics.field1376.method1393(var34, 0, 0);
            } catch (Exception var105) {
                Statics.field1094.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field2811.method1457(field701, 0);
            Statics.field1005.method1457(field701 + 382, 0);
            Statics.field689.method1613(field701 + 382 - Statics.field689.field1348 / 2, 18);
        }
        if (client.field269 == 0 || client.field269 == 5) {
            byte var36 = 20;
            arg0.method3667(class148.field2493, field686 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class75.method1557(field686 + 180 - 152, var37, 304, 34, 9179409);
            class75.method1557(field686 + 180 - 151, var37 + 1, 302, 32, 0);
            class75.method1575(field686 + 180 - 150, var37 + 2, field699 * 3, 30, 9179409);
            class75.method1575(field699 * 3 + (field686 + 180 - 150), var37 + 2, 300 - field699 * 3, 30, 0);
            arg0.method3667(field700, field686 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field269 == 20) {
            Statics.field687.method1613(field686 + 180 - Statics.field687.field1348 / 2, 271 - Statics.field687.field1351 / 2);
            short var38 = 211;
            arg0.method3667(field692, field686 + 180, var38, 16776960, 0);
            int var107 = var38 + 15;
            arg0.method3667(field714, field686 + 180, var107, 16776960, 0);
            int var108 = var107 + 15;
            arg0.method3667(field703, field686 + 180, var108, 16776960, 0);
            int var109 = var108 + 15;
            int var110 = var109 + 10;
            if (field707 != 4) {
                arg0.method3616(class148.field2452, field686 + 180 - 110, var110, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field705; arg0.method3611(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3616(class214.method3615(var40), field686 + 180 - 70, var110, 16777215, 0);
                var107 = var110 + 15;
                arg0.method3616(class148.field2453 + class154.method671(field706), field686 + 180 - 108, var107, 16777215, 0);
                var107 += 15;
            }
        }
        if (client.field269 == 10 || client.field269 == 11) {
            Statics.field687.method1613(field686, 171);
            if (field707 == 0) {
                short var41 = 251;
                arg0.method3667(class148.field2455, field686 + 180, var41, 16776960, 0);
                int var111 = var41 + 30;
                int var42 = field686 + 180 - 80;
                short var43 = 291;
                Statics.field688.method1613(var42 - 73, var43 - 20);
                arg0.method3619(class148.field2456, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field686 + 180 + 80;
                Statics.field688.method1613(var44 - 73, var43 - 20);
                arg0.method3619(class148.field2457, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field707 == 1) {
                arg0.method3667(class148.field2437, field686 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3667(field692, field686 + 180, var45, 16777215, 0);
                int var112 = var45 + 15;
                arg0.method3667(field714, field686 + 180, var112, 16777215, 0);
                int var113 = var112 + 15;
                arg0.method3667(field703, field686 + 180, var113, 16777215, 0);
                int var114 = var113 + 15;
                int var46 = field686 + 180 - 80;
                short var47 = 321;
                Statics.field688.method1613(var46 - 73, var47 - 20);
                arg0.method3667(class148.field2228, var46, var47 + 5, 16777215, 0);
                int var48 = field686 + 180 + 80;
                Statics.field688.method1613(var48 - 73, var47 - 20);
                arg0.method3667(class148.field2393, var48, var47 + 5, 16777215, 0);
            } else if (field707 == 2) {
                short var49 = 211;
                arg0.method3667(field692, field686 + 180, var49, 16776960, 0);
                int var115 = var49 + 15;
                arg0.method3667(field714, field686 + 180, var115, 16776960, 0);
                int var116 = var115 + 15;
                arg0.method3667(field703, field686 + 180, var116, 16776960, 0);
                int var117 = var116 + 15;
                int var118 = var117 + 10;
                arg0.method3616(class148.field2452, field686 + 180 - 110, var118, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field705; arg0.method3611(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3616(class214.method3615(var51) + (field702 == 0 & client.field423 % 40 < 20 ? class2.method2969(16776960) + class2.field20 : ""), field686 + 180 - 70, var118, 16777215, 0);
                var115 = var118 + 15;
                arg0.method3616(class148.field2453 + class154.method671(field706) + (field702 == 1 & client.field423 % 40 < 20 ? class2.method2969(16776960) + class2.field20 : ""), field686 + 180 - 108, var115, 16777215, 0);
                var115 += 15;
                int var52 = field686 + 180 - 80;
                short var53 = 321;
                Statics.field688.method1613(var52 - 73, var53 - 20);
                arg0.method3667(class148.field2264, var52, var53 + 5, 16777215, 0);
                int var54 = field686 + 180 + 80;
                Statics.field688.method1613(var54 - 73, var53 - 20);
                arg0.method3667(class148.field2393, var54, var53 + 5, 16777215, 0);
                short var55 = 357;
                arg1.method3667(class148.field2460, field686 + 180, var55, 16776960, 0);
            } else if (field707 == 4) {
                arg0.method3667(class148.field2474, field686 + 180, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3667(field692, field686 + 180, var56, 16777215, 0);
                int var119 = var56 + 15;
                arg0.method3667(field714, field686 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3667(field703, field686 + 180, var120, 16777215, 0);
                int var121 = var120 + 15;
                arg0.method3616(class148.field2454 + class154.method671(Statics.field709) + (client.field423 % 40 < 20 ? class2.method2969(16776960) + class2.field20 : ""), field686 + 180 - 108, var121, 16777215, 0);
                int var122 = var121 - 8;
                arg0.method3616(class148.field2230, field686 + 180 - 9, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3616(class148.field2470, field686 + 180 - 9, var123, 16776960, 0);
                int var57 = field686 + 180 - 9 + arg0.method3611(class148.field2470) + 15;
                int var58 = var123 - arg0.field3088;
                class76 var59;
                if (field710) {
                    var59 = Statics.field1091;
                } else {
                    var59 = Statics.field2184;
                }
                var59.method1613(var57, var58);
                var119 = var123 + 15;
                int var60 = field686 + 180 - 80;
                short var61 = 321;
                Statics.field688.method1613(var60 - 73, var61 - 20);
                arg0.method3667(class148.field2228, var60, var61 + 5, 16777215, 0);
                int var62 = field686 + 180 + 80;
                Statics.field688.method1613(var62 - 73, var61 - 20);
                arg0.method3667(class148.field2393, var62, var61 + 5, 16777215, 0);
                arg1.method3667(class148.field2408, field686 + 180, var61 + 36, 255, 0);
            } else if (field707 == 5) {
                arg0.method3667(class148.field2461, field686 + 180, 201, 16776960, 0);
                short var63 = 221;
                arg2.method3667(field692, field686 + 180, var63, 16776960, 0);
                int var124 = var63 + 15;
                arg2.method3667(field714, field686 + 180, var124, 16776960, 0);
                int var125 = var124 + 15;
                arg2.method3667(field703, field686 + 180, var125, 16776960, 0);
                int var126 = var125 + 15;
                int var127 = var126 + 14;
                arg0.method3616(class148.field2462, field686 + 180 - 145, var127, 16777215, 0);
                short var64 = 174;
                String var65;
                for (var65 = field705; arg0.method3611(var65) > var64; var65 = var65.substring(1)) {
                }
                arg0.method3616(class214.method3615(var65) + (client.field423 % 40 < 20 ? class2.method2969(16776960) + class2.field20 : ""), field686 + 180 - 34, var127, 16777215, 0);
                var124 = var127 + 15;
                int var66 = field686 + 180 - 80;
                short var67 = 321;
                Statics.field688.method1613(var66 - 73, var67 - 20);
                arg0.method3667(class148.field2321, var66, var67 + 5, 16777215, 0);
                int var68 = field686 + 180 + 80;
                Statics.field688.method1613(var68 - 73, var67 - 20);
                arg0.method3667(class148.field2464, var68, var67 + 5, 16777215, 0);
            } else if (field707 == 6) {
                short var69 = 211;
                arg0.method3667(field692, field686 + 180, var69, 16776960, 0);
                int var128 = var69 + 15;
                arg0.method3667(field714, field686 + 180, var128, 16776960, 0);
                int var129 = var128 + 15;
                arg0.method3667(field703, field686 + 180, var129, 16776960, 0);
                int var130 = var129 + 15;
                int var70 = field686 + 180;
                short var71 = 321;
                Statics.field688.method1613(var70 - 73, var71 - 20);
                arg0.method3667(class148.field2464, var70, var71 + 5, 16777215, 0);
            }
        }
        if (field717 > 0) {
            int var72 = field717;
            short var73 = 256;
            field695 += var72 * 128;
            if (field695 > Statics.field3027.length) {
                field695 -= Statics.field3027.length;
                int var74 = (int) (Math.random() * 12.0D);
                method2776(Statics.field1382[var74]);
            }
            int var75 = 0;
            int var76 = var72 * 128;
            int var77 = (var73 - var72) * 128;
            for (int var78 = 0; var78 < var77; var78++) {
                int var79 = Statics.field719[var75 + var76] - Statics.field3027[field695 + var75 & Statics.field3027.length - 1] * var72 / 6;
                if (var79 < 0) {
                    var79 = 0;
                }
                Statics.field719[var75++] = var79;
            }
            for (int var80 = var73 - var72; var80 < var73; var80++) {
                int var81 = var80 * 128;
                for (int var82 = 0; var82 < 128; var82++) {
                    int var83 = (int) (Math.random() * 100.0D);
                    if (var83 < 50 && var82 > 10 && var82 < 118) {
                        Statics.field719[var81 + var82] = 255;
                    } else {
                        Statics.field719[var81 + var82] = 0;
                    }
                }
            }
            if (field693 > 0) {
                field693 -= var72 * 4;
            }
            if (field694 > 0) {
                field694 -= var72 * 4;
            }
            if (field693 == 0 && field694 == 0) {
                int var84 = (int) (Math.random() * (double) (2000 / var72));
                if (var84 == 0) {
                    field693 = 1024;
                }
                if (var84 == 1) {
                    field694 = 1024;
                }
            }
            for (int var85 = 0; var85 < var73 - var72; var85++) {
                field697[var85] = field697[var72 + var85];
            }
            for (int var86 = var73 - var72; var86 < var73; var86++) {
                field697[var86] = (int) (Math.sin((double) field711 / 14.0D) * 16.0D + Math.sin((double) field711 / 15.0D) * 14.0D + Math.sin((double) field711 / 16.0D) * 12.0D);
                field711++;
            }
            field696 += var72 * 1915970155;
            int var87 = ((client.field423 & 0x1) + var72) / 2;
            if (var87 > 0) {
                for (int var88 = 0; var88 < field696 * -314392020; var88++) {
                    int var89 = (int) (Math.random() * 124.0D) + 2;
                    int var90 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field719[(var90 << 7) + var89] = 192;
                }
                field696 = 0;
                int var91 = 0;
                label440: while (true) {
                    if (var91 >= var73) {
                        int var95 = 0;
                        while (true) {
                            if (var95 >= 128) {
                                break label440;
                            }
                            int var96 = 0;
                            for (int var97 = -var87; var97 < var73; var97++) {
                                int var98 = var97 * 128;
                                if (var87 + var97 < var73) {
                                    var96 += Statics.field1097[var87 * 128 + var95 + var98];
                                }
                                if (var97 - (var87 + 1) >= 0) {
                                    var96 -= Statics.field1097[var95 + var98 - (var87 + 1) * 128];
                                }
                                if (var97 >= 0) {
                                    Statics.field719[var95 + var98] = var96 / (var87 * 2 + 1);
                                }
                            }
                            var95++;
                        }
                    }
                    int var92 = 0;
                    int var93 = var91 * 128;
                    for (int var94 = -var87; var94 < 128; var94++) {
                        if (var87 + var94 < 128) {
                            var92 += Statics.field719[var93 + var94 + var87];
                        }
                        if (var94 - (var87 + 1) >= 0) {
                            var92 -= Statics.field719[var93 + var94 - (var87 + 1)];
                        }
                        if (var94 >= 0) {
                            Statics.field1097[var93 + var94] = var92 / (var87 * 2 + 1);
                        }
                    }
                    var91++;
                }
            }
            field717 = 0;
        }
        method1802();
        Statics.field2627[Statics.field2828.field133 ? 1 : 0].method1613(field701 + 765 - 40, 463);
        if (client.field269 > 5 && client.field492 == 0) {
            if (Statics.field934 == null) {
                Statics.field934 = Statics.method946(Statics.field14, "sl_button", "");
            } else {
                int var99 = field701 + 5;
                short var100 = 463;
                byte var101 = 100;
                byte var102 = 35;
                Statics.field934.method1613(var99, var100);
                arg0.method3667(class148.field2447 + " " + client.field261, var101 / 2 + var99, var102 / 2 + var100 - 2, 16777215, 0);
                if (Statics.field615 == null) {
                    arg1.method3667(class148.field2496, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                } else {
                    arg1.method3667(class148.field2495, var101 / 2 + var99, var102 / 2 + var100 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var103 = Statics.field1094.getGraphics();
            Statics.field1376.method1393(var103, 0, 0);
        } catch (Exception var106) {
            Statics.field1094.repaint();
        }
    }

    @ObfuscatedName("ar.q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method640(String arg0, String arg1, String arg2) {
        field692 = arg0;
        field714 = arg1;
        field703 = arg2;
    }

    @ObfuscatedName("eq.z(Lbz;I)V")
    public static final void method2776(class76 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field3027.length; var2++) {
            Statics.field3027[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field3027[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field173[var8] = (Statics.field3027[var8 - 1] + Statics.field3027[var8 + 1] + Statics.field3027[var8 - 128] + Statics.field3027[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field3027;
            Statics.field3027 = Statics.field173;
            Statics.field173 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1351; var11++) {
            for (int var12 = 0; var12 < arg0.field1348; var12++) {
                if (arg0.field1353[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1350;
                    int var14 = var11 + 16 + arg0.field1352;
                    int var15 = (var14 << 7) + var13;
                    Statics.field3027[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("ah.v(IIII)I")
    public static final int method609(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("cd.b(I)V")
    public static final void method1802() {
        short var0 = 256;
        if (field693 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field693 > 768) {
                    Statics.field1306[var1] = method609(Statics.field682[var1], Statics.field1314[var1], 1024 - field693);
                } else if (field693 > 256) {
                    Statics.field1306[var1] = Statics.field1314[var1];
                } else {
                    Statics.field1306[var1] = method609(Statics.field1314[var1], Statics.field682[var1], 256 - field693);
                }
            }
        } else if (field694 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field694 > 768) {
                    Statics.field1306[var2] = method609(Statics.field682[var2], Statics.field576[var2], 1024 - field694);
                } else if (field694 > 256) {
                    Statics.field1306[var2] = Statics.field576[var2];
                } else {
                    Statics.field1306[var2] = method609(Statics.field576[var2], Statics.field682[var2], 256 - field694);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1306[var3] = Statics.field682[var3];
            }
        }
        class75.method1549(field701, 9, field701 + 128, var0 + 7);
        Statics.field2811.method1457(field701, 0);
        class75.method1580();
        int var4 = 0;
        int var5 = field701 + Statics.field1376.field1320 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field697[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field719[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1306[var10];
                    int var14 = Statics.field1376.field1319[var5];
                    Statics.field1376.field1319[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field1376.field1320 + var8 - 128;
        }
        class75.method1549(field701 + 765 - 128, 9, field701 + 765, var0 + 7);
        Statics.field1005.method1457(field701 + 382, 0);
        class75.method1580();
        int var15 = 0;
        int var16 = field701 + Statics.field1376.field1320 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field697[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field719[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1306[var22];
                    int var26 = Statics.field1376.field1319[var20];
                    Statics.field1376.field1319[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field1376.field1320 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("s.f(Lu;I)V")
    public static void method144(class24 arg0) {
        if (arg0.method534() != client.field265) {
            client.field265 = arg0.method534();
            class47.method574(arg0.method534());
        }
        Statics.field2165 = arg0.field618;
        client.field261 = arg0.field616;
        client.field262 = arg0.field617;
        Statics.field1713 = client.field264 == 0 ? 43594 : arg0.field616 + 40000;
        Statics.field1920 = client.field264 == 0 ? 443 : arg0.field616 + 50000;
        Statics.field298 = Statics.field1713;
    }

    @ObfuscatedName("ai.i(I)V")
    public static void method908() {
        if (class24.method758()) {
            field691 = true;
        }
    }
}

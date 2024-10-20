package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.net.URI;

@ObfuscatedName("ab")
public class class32 {

    @ObfuscatedName("ab.x")
    public static int field721 = 0;

    @ObfuscatedName("ab.d")
    public static int field719 = field721 + 202;

    @ObfuscatedName("ab.i")
    public static int[] field720 = new int[256];

    @ObfuscatedName("ab.r")
    public static int field717 = 0;

    @ObfuscatedName("ab.n")
    public static int field722 = 0;

    @ObfuscatedName("ab.ar")
    public static int field724 = 0;

    @ObfuscatedName("ab.ay")
    public static int field734 = 0;

    @ObfuscatedName("ab.ai")
    public static int field726 = 0;

    @ObfuscatedName("ab.ab")
    public static int field727 = 0;

    @ObfuscatedName("ab.av")
    public static int field728 = 10;

    @ObfuscatedName("ab.ac")
    public static String field729 = "";

    @ObfuscatedName("ab.ah")
    public static int field730 = 0;

    @ObfuscatedName("ab.ae")
    public static String field731 = "";

    @ObfuscatedName("ab.aj")
    public static String field715 = "";

    @ObfuscatedName("ab.az")
    public static String field733 = "";

    @ObfuscatedName("ab.al")
    public static String field740 = "";

    @ObfuscatedName("ab.ag")
    public static String field735 = "";

    @ObfuscatedName("ab.ad")
    public static String field736 = "";

    @ObfuscatedName("ab.au")
    public static class160 field737 = class160.field2627;

    @ObfuscatedName("ab.at")
    public static boolean field723 = true;

    @ObfuscatedName("ab.aw")
    public static int field739 = 0;

    @ObfuscatedName("ab.as")
    public static String field725 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ab.aq")
    public static String field741 = "1234567890";

    @ObfuscatedName("ab.an")
    public static boolean field742 = false;

    @ObfuscatedName("ab.bf")
    public static int field743 = -1;

    public class32() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.w(Lfx;Lfx;B)I")
    public static int method8(class168 arg0, class168 arg1) {
        int var2 = 0;
        if (arg0.method3104("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3104("logo", "")) {
            var2++;
        }
        if (arg1.method3104("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3104("titlebox", "")) {
            var2++;
        }
        if (arg1.method3104("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3104("runes", "")) {
            var2++;
        }
        if (arg1.method3104("title_mute", "")) {
            var2++;
        }
        if (arg1.method3123("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3123("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3104("sl_back", "");
        arg1.method3104("sl_flags", "");
        arg1.method3104("sl_arrows", "");
        arg1.method3104("sl_stars", "");
        arg1.method3104("sl_button", "");
        return var2;
    }

    @ObfuscatedName("fb.x(B)I")
    public static int method3062() {
        return 9;
    }

    @ObfuscatedName("o.t(Ljava/awt/Component;Lfx;Lfx;ZII)V")
    public static void method191(Component arg0, class168 arg1, class168 arg2, boolean arg3, int arg4) {
        if (!Statics.field716) {
            field730 = arg4;
            class80.method1670();
            byte[] var5 = arg1.method3144("title.jpg", "");
            Statics.field2669 = new class79(var5, arg0);
            Statics.field3153 = Statics.field2669.method1611();
            if ((client.field504 & 0x20000000) == 0) {
                Statics.field2157 = class77.method2668(arg2, "logo", "");
            } else {
                Statics.field2157 = class77.method2668(arg2, "logo_deadman_mode", "");
            }
            Statics.field732 = class77.method2668(arg2, "titlebox", "");
            Statics.field718 = class77.method2668(arg2, "titlebutton", "");
            Statics.field2163 = class77.method1199(arg2, "runes", "");
            Statics.field780 = class77.method1199(arg2, "title_mute", "");
            Statics.field3062 = class77.method2668(arg2, "options_radio_buttons,0", "");
            Statics.field1567 = class77.method2668(arg2, "options_radio_buttons,2", "");
            Statics.field1646 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1646[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1646[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1646[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1646[var9 + 192] = 16777215;
            }
            Statics.field2026 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2026[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2026[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2026[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2026[var13 + 192] = 16777215;
            }
            Statics.field1884 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1884[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1884[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1884[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1884[var17 + 192] = 16777215;
            }
            Statics.field3233 = new int[256];
            Statics.field88 = new int[32768];
            Statics.field738 = new int[32768];
            method852((class81) null);
            Statics.field1098 = new int[32768];
            Statics.field685 = new int[32768];
            if (arg3) {
                field735 = "";
                field736 = "";
            }
            Statics.field779 = 0;
            Statics.field669 = "";
            field723 = true;
            field742 = false;
            if (Statics.field990.field158) {
                class184.method1097(2);
            } else {
                Statics.method767(2, Statics.field290, "scape main", "", 255, false);
            }
            class172.method1578(false);
            Statics.field716 = true;
            field721 = (Statics.field236 - client.field510) / 2;
            field719 = field721 + 202;
            Statics.field2669.method1590(field721, 0);
            Statics.field3153.method1590(field721 + 382, 0);
            Statics.field2157.method1748(field721 + 382 - Statics.field2157.field1426 / 2, 18);
        } else if (arg4 == 4) {
            field730 = 4;
        }
    }

    @ObfuscatedName("au.p(Lek;I)V")
    public static void method877(class145 arg0) {
        if (!field742) {
            if ((class141.field2178 == 1 || !Statics.field923 && class141.field2178 == 4) && class141.field2177 >= field721 + 765 - 50 && class141.field2168 >= 453) {
                Statics.field990.field158 = !Statics.field990.field158;
                class9.method151();
                if (Statics.field990.field158) {
                    Statics.field2968.method3431();
                    class184.field2969 = 1;
                    Statics.field2280 = null;
                } else {
                    class169 var6 = Statics.field290;
                    int var7 = var6.method3095("scape main");
                    int var8 = var6.method3081(var7, "");
                    class184.method800(var6, var7, var8, 255, false);
                }
            }
            if (client.field304 != 5) {
                field726++;
                if (client.field304 == 10 || client.field304 == 11) {
                    if (client.field303 == 0) {
                        if (class141.field2178 == 1 || !Statics.field923 && class141.field2178 == 4) {
                            int var9 = field721 + 5;
                            short var10 = 463;
                            byte var11 = 100;
                            byte var12 = 35;
                            if (class141.field2177 >= var9 && class141.field2177 <= var9 + var11 && class141.field2168 >= var10 && class141.field2168 <= var10 + var12) {
                                if (Statics.method128()) {
                                    field742 = true;
                                }
                                return;
                            }
                        }
                        if (Statics.field1081 != null && Statics.method128()) {
                            field742 = true;
                        }
                    }
                    int var13 = class141.field2178;
                    int var14 = class141.field2177;
                    int var15 = class141.field2168;
                    if (!Statics.field923 && var13 == 4) {
                        var13 = 1;
                    }
                    if (field730 == 0) {
                        int var16 = field719 + 180 - 80;
                        short var17 = 291;
                        if (var13 == 1 && var14 >= var16 - 75 && var14 <= var16 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            label727: {
                                String var18 = client.method749("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var18));
                                        break label727;
                                    } catch (Exception var48) {
                                    }
                                }
                                if (class139.field2152.startsWith("win")) {
                                    Statics.method735(var18, 0, "openjs");
                                } else if (class139.field2152.startsWith("mac")) {
                                    Statics.method735(var18, 1, "openjs");
                                } else {
                                    Statics.method735(var18, 2, "openjs");
                                }
                            }
                        }
                        int var20 = field719 + 180 + 80;
                        if (var13 == 1 && var14 >= var20 - 75 && var14 <= var20 + 75 && var15 >= var17 - 20 && var15 <= var17 + 20) {
                            if ((client.field504 & 0x2000000) != 0) {
                                field731 = "";
                                field715 = class158.field2577;
                                field733 = class158.field2609;
                                field740 = class158.field2559;
                                field730 = 1;
                                field739 = 0;
                            } else if ((client.field504 & 0x4) != 0) {
                                if ((client.field504 & 0x400) == 0) {
                                    field715 = class158.field2548;
                                    field733 = class158.field2549;
                                    field740 = class158.field2550;
                                } else {
                                    field715 = class158.field2415;
                                    field733 = class158.field2555;
                                    field740 = class158.field2505;
                                }
                                field731 = class158.field2394;
                                field730 = 1;
                                field739 = 0;
                            } else if ((client.field504 & 0x400) == 0) {
                                field715 = class158.field2544;
                                field733 = class158.field2545;
                                field740 = class158.field2546;
                                field730 = 2;
                                field739 = 0;
                            } else {
                                field715 = class158.field2551;
                                field733 = class158.field2552;
                                field740 = class158.field2455;
                                field731 = class158.field2394;
                                field730 = 1;
                                field739 = 0;
                            }
                        }
                    } else if (field730 == 1) {
                        while (class138.method2647()) {
                            if (Statics.field2119 == 84) {
                                field715 = class158.field2544;
                                field733 = class158.field2545;
                                field740 = class158.field2546;
                                field730 = 2;
                                field739 = 0;
                            } else if (Statics.field2119 == 13) {
                                field730 = 0;
                            }
                        }
                        int var21 = field719 + 180 - 80;
                        short var22 = 321;
                        if (var13 == 1 && var14 >= var21 - 75 && var14 <= var21 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field715 = class158.field2544;
                            field733 = class158.field2545;
                            field740 = class158.field2546;
                            field730 = 2;
                            field739 = 0;
                        }
                        int var23 = field719 + 180 + 80;
                        if (var13 == 1 && var14 >= var23 - 75 && var14 <= var23 + 75 && var15 >= var22 - 20 && var15 <= var22 + 20) {
                            field730 = 0;
                        }
                    } else if (field730 == 2) {
                        short var24 = 231;
                        int var50 = var24 + 30;
                        if (var13 == 1 && var15 >= var50 - 15 && var15 < var50) {
                            field739 = 0;
                        }
                        var50 += 15;
                        if (var13 == 1 && var15 >= var50 - 15 && var15 < var50) {
                            field739 = 1;
                        }
                        var50 += 15;
                        short var25 = 361;
                        if (var13 == 1 && var15 >= var25 - 15 && var15 < var25) {
                            method587(class158.field2583, class158.field2389, class158.field2585);
                            field730 = 5;
                            return;
                        }
                        int var26 = field719 + 180 - 80;
                        short var27 = 321;
                        if (var13 == 1 && var14 >= var26 - 75 && var14 <= var26 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field735 = field735.trim();
                            if (field735.length() == 0) {
                                method587(class158.field2450, class158.field2353, class158.field2589);
                                return;
                            }
                            if (field736.length() == 0) {
                                method587(class158.field2453, class158.field2454, class158.field2578);
                                return;
                            }
                            method587(class158.field2562, class158.field2563, class158.field2564);
                            field737 = Statics.field990.field157.containsKey(class164.method1952(field735)) ? class160.field2630 : class160.field2627;
                            client.method2787(20);
                            return;
                        }
                        int var28 = field719 + 180 + 80;
                        if (var13 == 1 && var14 >= var28 - 75 && var14 <= var28 + 75 && var15 >= var27 - 20 && var15 <= var27 + 20) {
                            field730 = 0;
                            field735 = "";
                            field736 = "";
                            Statics.field779 = 0;
                            Statics.field669 = "";
                            field723 = true;
                        }
                        while (true) {
                            while (class138.method2647()) {
                                boolean var29 = false;
                                for (int var30 = 0; var30 < field725.length(); var30++) {
                                    if (Statics.field773 == field725.charAt(var30)) {
                                        var29 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2119 == 13) {
                                    field730 = 0;
                                    field735 = "";
                                    field736 = "";
                                    Statics.field779 = 0;
                                    Statics.field669 = "";
                                    field723 = true;
                                } else if (field739 == 0) {
                                    if (Statics.field2119 == 85 && field735.length() > 0) {
                                        field735 = field735.substring(0, field735.length() - 1);
                                    }
                                    if (Statics.field2119 == 84 || Statics.field2119 == 80) {
                                        field739 = 1;
                                    }
                                    if (var29 && field735.length() < 320) {
                                        field735 = field735 + Statics.field773;
                                    }
                                } else if (field739 == 1) {
                                    if (Statics.field2119 == 85 && field736.length() > 0) {
                                        field736 = field736.substring(0, field736.length() - 1);
                                    }
                                    if (Statics.field2119 == 84 || Statics.field2119 == 80) {
                                        field739 = 0;
                                    }
                                    if (Statics.field2119 == 84) {
                                        field735 = field735.trim();
                                        if (field735.length() == 0) {
                                            method587(class158.field2450, class158.field2353, class158.field2589);
                                            return;
                                        }
                                        if (field736.length() == 0) {
                                            method587(class158.field2453, class158.field2454, class158.field2578);
                                            return;
                                        }
                                        method587(class158.field2562, class158.field2563, class158.field2564);
                                        field737 = Statics.field990.field157.containsKey(class164.method1952(field735)) ? class160.field2630 : class160.field2627;
                                        client.method2787(20);
                                        return;
                                    }
                                    if (var29 && field736.length() < 20) {
                                        field736 = field736 + Statics.field773;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field730 == 3) {
                        int var31 = field719 + 180;
                        short var32 = 276;
                        if (var13 == 1 && var14 >= var31 - 75 && var14 <= var31 + 75 && var15 >= var32 - 20 && var15 <= var32 + 20) {
                            field715 = class158.field2544;
                            field733 = class158.field2545;
                            field740 = class158.field2546;
                            field730 = 2;
                            field739 = 0;
                        }
                        int var33 = field719 + 180;
                        short var34 = 326;
                        if (var13 == 1 && var14 >= var33 - 75 && var14 <= var33 + 75 && var15 >= var34 - 20 && var15 <= var34 + 20) {
                            method587(class158.field2583, class158.field2389, class158.field2585);
                            field730 = 5;
                            return;
                        }
                    } else if (field730 == 4) {
                        int var35 = field719 + 180 - 80;
                        short var36 = 321;
                        if (var13 == 1 && var14 >= var35 - 75 && var14 <= var35 + 75 && var15 >= var36 - 20 && var15 <= var36 + 20) {
                            Statics.field669.trim();
                            if (Statics.field669.length() != 6) {
                                method587(class158.field2369, class158.field2370, class158.field2595);
                                return;
                            }
                            Statics.field779 = Integer.parseInt(Statics.field669);
                            Statics.field669 = "";
                            field737 = field723 ? class160.field2625 : class160.field2626;
                            method587(class158.field2562, class158.field2563, class158.field2564);
                            client.method2787(20);
                            return;
                        }
                        if (var13 == 1 && var14 >= field719 + 180 - 9 && var14 <= field719 + 180 + 130 && var15 >= 263 && var15 <= 296) {
                            field723 = !field723;
                        }
                        if (var13 == 1 && var14 >= field719 + 180 - 34 && var14 <= field719 + 180 + 34 && var15 >= 351 && var15 <= 363) {
                            label742: {
                                String var37 = client.method749("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var37));
                                        break label742;
                                    } catch (Exception var49) {
                                    }
                                }
                                if (class139.field2152.startsWith("win")) {
                                    Statics.method735(var37, 0, "openjs");
                                } else if (class139.field2152.startsWith("mac")) {
                                    Statics.method735(var37, 1, "openjs");
                                } else {
                                    Statics.method735(var37, 2, "openjs");
                                }
                            }
                        }
                        int var39 = field719 + 180 + 80;
                        if (var13 == 1 && var14 >= var39 - 75 && var14 <= var39 + 75 && var15 >= var36 - 20 && var15 <= var36 + 20) {
                            field730 = 0;
                            field735 = "";
                            field736 = "";
                            Statics.field779 = 0;
                            Statics.field669 = "";
                        }
                        while (class138.method2647()) {
                            boolean var40 = false;
                            for (int var41 = 0; var41 < field741.length(); var41++) {
                                if (Statics.field773 == field741.charAt(var41)) {
                                    var40 = true;
                                    break;
                                }
                            }
                            if (Statics.field2119 == 13) {
                                field730 = 0;
                                field735 = "";
                                field736 = "";
                                Statics.field779 = 0;
                                Statics.field669 = "";
                            } else {
                                if (Statics.field2119 == 85 && Statics.field669.length() > 0) {
                                    Statics.field669 = Statics.field669.substring(0, Statics.field669.length() - 1);
                                }
                                if (Statics.field2119 == 84) {
                                    Statics.field669.trim();
                                    if (Statics.field669.length() != 6) {
                                        method587(class158.field2369, class158.field2370, class158.field2595);
                                        return;
                                    }
                                    Statics.field779 = Integer.parseInt(Statics.field669);
                                    Statics.field669 = "";
                                    field737 = field723 ? class160.field2625 : class160.field2626;
                                    method587(class158.field2562, class158.field2563, class158.field2564);
                                    client.method2787(20);
                                    return;
                                }
                                if (var40 && Statics.field669.length() < 6) {
                                    Statics.field669 = Statics.field669 + Statics.field773;
                                }
                            }
                        }
                    } else if (field730 == 5) {
                        int var42 = field719 + 180 - 80;
                        short var43 = 321;
                        if (var13 == 1 && var14 >= var42 - 75 && var14 <= var42 + 75 && var15 >= var43 - 20 && var15 <= var43 + 20) {
                            method164();
                            return;
                        }
                        int var44 = field719 + 180 + 80;
                        if (var13 == 1 && var14 >= var44 - 75 && var14 <= var44 + 75 && var15 >= var43 - 20 && var15 <= var43 + 20) {
                            field715 = class158.field2544;
                            field733 = class158.field2545;
                            field740 = class158.field2546;
                            field730 = 2;
                            field739 = 0;
                            field736 = "";
                        }
                        while (class138.method2647()) {
                            boolean var45 = false;
                            for (int var46 = 0; var46 < field725.length(); var46++) {
                                if (Statics.field773 == field725.charAt(var46)) {
                                    var45 = true;
                                    break;
                                }
                            }
                            if (Statics.field2119 == 13) {
                                field715 = class158.field2544;
                                field733 = class158.field2545;
                                field740 = class158.field2546;
                                field730 = 2;
                                field739 = 0;
                                field736 = "";
                            } else {
                                if (Statics.field2119 == 85 && field735.length() > 0) {
                                    field735 = field735.substring(0, field735.length() - 1);
                                }
                                if (Statics.field2119 == 84) {
                                    method164();
                                    return;
                                }
                                if (var45 && field735.length() < 320) {
                                    field735 = field735 + Statics.field773;
                                }
                            }
                        }
                    } else if (field730 == 6) {
                        while (true) {
                            do {
                                if (!class138.method2647()) {
                                    short var47 = 321;
                                    if (var13 == 1 && var15 >= var47 - 20 && var15 <= var47 + 20) {
                                        field715 = class158.field2544;
                                        field733 = class158.field2545;
                                        field740 = class158.field2546;
                                        field730 = 2;
                                        field739 = 0;
                                        field736 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2119 != 84 && Statics.field2119 != 13);
                            field715 = class158.field2544;
                            field733 = class158.field2545;
                            field740 = class158.field2546;
                            field730 = 2;
                            field739 = 0;
                            field736 = "";
                        }
                    }
                }
            }
        } else if (class141.field2178 == 1 || !Statics.field923 && class141.field2178 == 4) {
            int var1 = field721 + 280;
            if (class141.field2177 >= var1 && class141.field2177 <= var1 + 14 && class141.field2168 >= 4 && class141.field2168 <= 18) {
                class26.method157(0, 0);
            } else if (class141.field2177 >= var1 + 15 && class141.field2177 <= var1 + 80 && class141.field2168 >= 4 && class141.field2168 <= 18) {
                class26.method157(0, 1);
            } else {
                int var2 = field721 + 390;
                if (class141.field2177 >= var2 && class141.field2177 <= var2 + 14 && class141.field2168 >= 4 && class141.field2168 <= 18) {
                    class26.method157(1, 0);
                } else if (class141.field2177 >= var2 + 15 && class141.field2177 <= var2 + 80 && class141.field2168 >= 4 && class141.field2168 <= 18) {
                    class26.method157(1, 1);
                } else {
                    int var3 = field721 + 500;
                    if (class141.field2177 >= var3 && class141.field2177 <= var3 + 14 && class141.field2168 >= 4 && class141.field2168 <= 18) {
                        class26.method157(2, 0);
                    } else if (class141.field2177 >= var3 + 15 && class141.field2177 <= var3 + 80 && class141.field2168 >= 4 && class141.field2168 <= 18) {
                        class26.method157(2, 1);
                    } else {
                        int var4 = field721 + 610;
                        if (class141.field2177 >= var4 && class141.field2177 <= var4 + 14 && class141.field2168 >= 4 && class141.field2168 <= 18) {
                            class26.method157(3, 0);
                        } else if (class141.field2177 >= var4 + 15 && class141.field2177 <= var4 + 80 && class141.field2168 >= 4 && class141.field2168 <= 18) {
                            class26.method157(3, 1);
                        } else if (class141.field2177 >= field721 + 708 && class141.field2168 >= 4 && class141.field2177 <= field721 + 708 + 50 && class141.field2168 <= 20) {
                            field742 = false;
                            Statics.field2669.method1590(field721, 0);
                            Statics.field3153.method1590(field721 + 382, 0);
                            Statics.field2157.method1748(field721 + 382 - Statics.field2157.field1426 / 2, 18);
                        } else if (field743 != -1) {
                            class26 var5 = Statics.field3063[field743];
                            method2304(var5);
                            field742 = false;
                            Statics.field2669.method1590(field721, 0);
                            Statics.field3153.method1590(field721 + 382, 0);
                            Statics.field2157.method1748(field721 + 382 - Statics.field2157.field1426 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.e(B)V")
    public static void method164() {
        field735 = field735.trim();
        if (field735.length() == 0) {
            method587(class158.field2583, class158.field2389, class158.field2585);
            return;
        }
        long var0 = class10.method742();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method1093(var0, field735);
        }
        switch(var2) {
            case 2:
                method587(class158.field2586, class158.field2587, class158.field2358);
                field730 = 6;
                break;
            case 3:
                method587(class158.field2379, class158.field2590, class158.field2378);
                break;
            case 4:
                method587(class158.field2592, class158.field2408, class158.field2594);
                break;
            case 5:
                method587(class158.field2400, class158.field2596, class158.field2597);
                break;
            case 6:
                method587(class158.field2598, class158.field2599, class158.field2357);
                break;
            case 7:
                method587(class158.field2554, class158.field2602, class158.field2603);
        }
    }

    @ObfuscatedName("ax.y(Lhg;Lhg;Lhg;ZI)V")
    public static void method1007(class225 arg0, class225 arg1, class225 arg2, boolean arg3) {
        if (arg3) {
            field721 = (Statics.field236 - client.field510) / 2;
            field719 = field721 + 202;
        }
        if (field742) {
            if (Statics.field1394 == null) {
                Statics.field1394 = class77.method595(Statics.field796, "sl_back", "");
            }
            if (Statics.field713 == null) {
                Statics.field713 = class77.method1199(Statics.field796, "sl_flags", "");
            }
            if (Statics.field2090 == null) {
                Statics.field2090 = class77.method1199(Statics.field796, "sl_arrows", "");
            }
            if (Statics.field2064 == null) {
                Statics.field2064 = class77.method1199(Statics.field796, "sl_stars", "");
            }
            class80.method1693(field721, 23, 765, 480, 0);
            class80.method1677(field721, 0, 125, 23, 12425273, 9135624);
            class80.method1677(field721 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3788(class158.field2547, field721 + 62, 15, 0, -1);
            if (Statics.field2064 != null) {
                Statics.field2064[1].method1748(field721 + 140, 1);
                arg1.method3786(class158.field2342, field721 + 152, 10, 16777215, -1);
                Statics.field2064[0].method1748(field721 + 140, 12);
                arg1.method3786(class158.field2606, field721 + 152, 21, 16777215, -1);
            }
            if (Statics.field2090 != null) {
                int var4 = field721 + 280;
                if (class26.field646[0] == 0 && class26.field645[0] == 0) {
                    Statics.field2090[2].method1748(var4, 4);
                } else {
                    Statics.field2090[0].method1748(var4, 4);
                }
                if (class26.field646[0] == 0 && class26.field645[0] == 1) {
                    Statics.field2090[3].method1748(var4 + 15, 4);
                } else {
                    Statics.field2090[1].method1748(var4 + 15, 4);
                }
                arg0.method3786(class158.field2537, var4 + 32, 17, 16777215, -1);
                int var5 = field721 + 390;
                if (class26.field646[0] == 1 && class26.field645[0] == 0) {
                    Statics.field2090[2].method1748(var5, 4);
                } else {
                    Statics.field2090[0].method1748(var5, 4);
                }
                if (class26.field646[0] == 1 && class26.field645[0] == 1) {
                    Statics.field2090[3].method1748(var5 + 15, 4);
                } else {
                    Statics.field2090[1].method1748(var5 + 15, 4);
                }
                arg0.method3786(class158.field2608, var5 + 32, 17, 16777215, -1);
                int var6 = field721 + 500;
                if (class26.field646[0] == 2 && class26.field645[0] == 0) {
                    Statics.field2090[2].method1748(var6, 4);
                } else {
                    Statics.field2090[0].method1748(var6, 4);
                }
                if (class26.field646[0] == 2 && class26.field645[0] == 1) {
                    Statics.field2090[3].method1748(var6 + 15, 4);
                } else {
                    Statics.field2090[1].method1748(var6 + 15, 4);
                }
                arg0.method3786(class158.field2558, var6 + 32, 17, 16777215, -1);
                int var7 = field721 + 610;
                if (class26.field646[0] == 3 && class26.field645[0] == 0) {
                    Statics.field2090[2].method1748(var7, 4);
                } else {
                    Statics.field2090[0].method1748(var7, 4);
                }
                if (class26.field646[0] == 3 && class26.field645[0] == 1) {
                    Statics.field2090[3].method1748(var7 + 15, 4);
                } else {
                    Statics.field2090[1].method1748(var7 + 15, 4);
                }
                arg0.method3786(class158.field2610, var7 + 32, 17, 16777215, -1);
            }
            class80.method1693(field721 + 708, 4, 50, 16, 0);
            arg1.method3788(class158.field2572, field721 + 708 + 25, 16, 16777215, -1);
            field743 = -1;
            if (Statics.field1394 != null) {
                byte var8 = 88;
                byte var9 = 19;
                int var10 = 765 / (var8 + 1);
                int var11 = 480 / (var9 + 1);
                int var12;
                int var13;
                do {
                    var12 = var11;
                    var13 = var10;
                    if ((var10 - 1) * var11 >= class26.field643) {
                        var10--;
                    }
                    if ((var11 - 1) * var10 >= class26.field643) {
                        var11--;
                    }
                    if ((var11 - 1) * var10 >= class26.field643) {
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
                int var19 = field721 + var16;
                int var20 = 0;
                boolean var21 = false;
                for (int var22 = 0; var22 < class26.field643; var22++) {
                    class26 var23 = Statics.field3063[var22];
                    boolean var24 = true;
                    String var25 = Integer.toString(var23.field639);
                    if (var23.field639 == -1) {
                        var25 = class158.field2611;
                        var24 = false;
                    } else if (var23.field639 > 1980) {
                        var25 = class158.field2612;
                        var24 = false;
                    }
                    int var26 = 0;
                    byte var27;
                    if (var23.method623()) {
                        if (var23.method632()) {
                            var27 = 7;
                        } else {
                            var27 = 6;
                        }
                    } else if (var23.method614()) {
                        var26 = 16711680;
                        if (var23.method632()) {
                            var27 = 5;
                        } else {
                            var27 = 4;
                        }
                    } else if (var23.method619()) {
                        if (var23.method632()) {
                            var27 = 3;
                        } else {
                            var27 = 2;
                        }
                    } else if (var23.method632()) {
                        var27 = 1;
                    } else {
                        var27 = 0;
                    }
                    if (class141.field2169 >= var19 && class141.field2183 >= var18 && class141.field2169 < var8 + var19 && class141.field2183 < var9 + var18 && var24) {
                        field743 = var22;
                        Statics.field1394[var27].method1605(var19, var18, 128, 16777215);
                        var21 = true;
                    } else {
                        Statics.field1394[var27].method1590(var19, var18);
                    }
                    if (Statics.field713 != null) {
                        Statics.field713[(var23.method632() ? 8 : 0) + var23.field649].method1748(var19 + 29, var18);
                    }
                    arg0.method3788(Integer.toString(var23.field651), var19 + 15, var9 / 2 + var18 + 5, var26, -1);
                    arg1.method3788(var25, var19 + 60, var9 / 2 + var18 + 5, 268435455, -1);
                    var18 += var9 + var15;
                    var20++;
                    if (var20 >= var11) {
                        var18 = var17 + 23;
                        var19 += var8 + var14;
                        var20 = 0;
                    }
                }
                if (var21) {
                    int var28 = arg1.method3781(Statics.field3063[field743].field640) + 6;
                    int var29 = arg1.field3195 + 8;
                    class80.method1693(class141.field2169 - var28 / 2, class141.field2183 + 20 + 5, var28, var29, 16777120);
                    class80.method1683(class141.field2169 - var28 / 2, class141.field2183 + 20 + 5, var28, var29, 0);
                    arg1.method3788(Statics.field3063[field743].field640, class141.field2169, class141.field2183 + 20 + 5 + arg1.field3195 + 4, 0, -1);
                }
            }
            try {
                Graphics var30 = Statics.field1538.getGraphics();
                Statics.field992.method1503(var30, 0, 0);
            } catch (Exception var91) {
                Statics.field1538.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field2669.method1590(field721, 0);
            Statics.field3153.method1590(field721 + 382, 0);
            Statics.field2157.method1748(field721 + 382 - Statics.field2157.field1426 / 2, 18);
        }
        if (client.field304 == 0 || client.field304 == 5) {
            byte var32 = 20;
            arg0.method3788(class158.field2543, field719 + 180, 245 - var32, 16777215, -1);
            int var33 = 253 - var32;
            class80.method1683(field719 + 180 - 152, var33, 304, 34, 9179409);
            class80.method1683(field719 + 180 - 151, var33 + 1, 302, 32, 0);
            class80.method1693(field719 + 180 - 150, var33 + 2, field728 * 3, 30, 9179409);
            class80.method1693(field728 * 3 + (field719 + 180 - 150), var33 + 2, 300 - field728 * 3, 30, 0);
            arg0.method3788(field729, field719 + 180, 276 - var32, 16777215, -1);
        }
        if (client.field304 == 20) {
            Statics.field732.method1748(field719 + 180 - Statics.field732.field1426 / 2, 271 - Statics.field732.field1424 / 2);
            short var34 = 211;
            arg0.method3788(field715, field719 + 180, var34, 16776960, 0);
            int var93 = var34 + 15;
            arg0.method3788(field733, field719 + 180, var93, 16776960, 0);
            int var94 = var93 + 15;
            arg0.method3788(field740, field719 + 180, var94, 16776960, 0);
            int var95 = var94 + 15;
            int var96 = var95 + 10;
            if (field730 != 4) {
                arg0.method3786(class158.field2565, field719 + 180 - 110, var96, 16777215, 0);
                short var35 = 200;
                String var36;
                for (var36 = field735; arg0.method3781(var36) > var35; var36 = var36.substring(0, var36.length() - 1)) {
                }
                arg0.method3786(class224.method3852(var36), field719 + 180 - 70, var96, 16777215, 0);
                var93 = var96 + 15;
                String var38 = class158.field2566;
                String var39 = field736;
                String var40 = class164.method833('*', var39.length());
                arg0.method3786(var38 + var40, field719 + 180 - 108, var93, 16777215, 0);
                var93 += 15;
            }
        }
        if (client.field304 == 10 || client.field304 == 11) {
            Statics.field732.method1748(field719, 171);
            if (field730 == 0) {
                short var41 = 251;
                arg0.method3788(class158.field2568, field719 + 180, var41, 16776960, 0);
                int var97 = var41 + 30;
                int var42 = field719 + 180 - 80;
                short var43 = 291;
                Statics.field718.method1748(var42 - 73, var43 - 20);
                arg0.method3815(class158.field2569, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field719 + 180 + 80;
                Statics.field718.method1748(var44 - 73, var43 - 20);
                arg0.method3815(class158.field2570, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field730 == 1) {
                arg0.method3788(field731, field719 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3788(field715, field719 + 180, var45, 16777215, 0);
                int var98 = var45 + 15;
                arg0.method3788(field733, field719 + 180, var98, 16777215, 0);
                int var99 = var98 + 15;
                arg0.method3788(field740, field719 + 180, var99, 16777215, 0);
                int var100 = var99 + 15;
                int var46 = field719 + 180 - 80;
                short var47 = 321;
                Statics.field718.method1748(var46 - 73, var47 - 20);
                arg0.method3788(class158.field2341, var46, var47 + 5, 16777215, 0);
                int var48 = field719 + 180 + 80;
                Statics.field718.method1748(var48 - 73, var47 - 20);
                arg0.method3788(class158.field2572, var48, var47 + 5, 16777215, 0);
            } else if (field730 == 2) {
                short var49 = 211;
                arg0.method3788(field715, field719 + 180, var49, 16776960, 0);
                int var101 = var49 + 15;
                arg0.method3788(field733, field719 + 180, var101, 16776960, 0);
                int var102 = var101 + 15;
                arg0.method3788(field740, field719 + 180, var102, 16776960, 0);
                int var103 = var102 + 15;
                int var104 = var103 + 10;
                arg0.method3786(class158.field2565, field719 + 180 - 110, var104, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field735; arg0.method3781(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3786(class224.method3852(var51) + (field739 == 0 & client.field306 % 40 < 20 ? class2.method1476(16776960) + class2.field23 : ""), field719 + 180 - 70, var104, 16777215, 0);
                var101 = var104 + 15;
                String var53 = class158.field2566;
                String var54 = field736;
                String var55 = class164.method833('*', var54.length());
                arg0.method3786(var53 + var55 + (field739 == 1 & client.field306 % 40 < 20 ? class2.method1476(16776960) + class2.field23 : ""), field719 + 180 - 108, var101, 16777215, 0);
                var101 += 15;
                int var56 = field719 + 180 - 80;
                short var57 = 321;
                Statics.field718.method1748(var56 - 73, var57 - 20);
                arg0.method3788(class158.field2519, var56, var57 + 5, 16777215, 0);
                int var58 = field719 + 180 + 80;
                Statics.field718.method1748(var58 - 73, var57 - 20);
                arg0.method3788(class158.field2572, var58, var57 + 5, 16777215, 0);
                short var59 = 357;
                arg1.method3788(class158.field2352, field719 + 180, var59, 16776960, 0);
            } else if (field730 == 3) {
                short var60 = 201;
                arg0.method3788(class158.field2573, field719 + 180, var60, 16776960, 0);
                int var105 = var60 + 20;
                arg1.method3788(class158.field2574, field719 + 180, var105, 16776960, 0);
                int var106 = var105 + 15;
                arg1.method3788(class158.field2575, field719 + 180, var106, 16776960, 0);
                int var107 = var106 + 15;
                int var61 = field719 + 180;
                short var62 = 276;
                Statics.field718.method1748(var61 - 73, var62 - 20);
                arg2.method3788(class158.field2403, var61, var62 + 5, 16777215, 0);
                int var63 = field719 + 180;
                short var64 = 326;
                Statics.field718.method1748(var63 - 73, var64 - 20);
                arg2.method3788(class158.field2361, var63, var64 + 5, 16777215, 0);
            } else if (field730 == 4) {
                arg0.method3788(class158.field2560, field719 + 180, 211, 16776960, 0);
                short var65 = 236;
                arg0.method3788(field715, field719 + 180, var65, 16777215, 0);
                int var108 = var65 + 15;
                arg0.method3788(field733, field719 + 180, var108, 16777215, 0);
                int var109 = var108 + 15;
                arg0.method3788(field740, field719 + 180, var109, 16777215, 0);
                int var110 = var109 + 15;
                String var67 = class158.field2567;
                String var68 = Statics.field669;
                String var69 = class164.method833('*', var68.length());
                arg0.method3786(var67 + var69 + (client.field306 % 40 < 20 ? class2.method1476(16776960) + class2.field23 : ""), field719 + 180 - 108, var110, 16777215, 0);
                int var111 = var110 - 8;
                arg0.method3786(class158.field2343, field719 + 180 - 9, var111, 16776960, 0);
                int var112 = var111 + 15;
                arg0.method3786(class158.field2344, field719 + 180 - 9, var112, 16776960, 0);
                int var70 = field719 + 180 - 9 + arg0.method3781(class158.field2344) + 15;
                int var71 = var112 - arg0.field3195;
                class81 var72;
                if (field723) {
                    var72 = Statics.field1567;
                } else {
                    var72 = Statics.field3062;
                }
                var72.method1748(var70, var71);
                var108 = var112 + 15;
                int var73 = field719 + 180 - 80;
                short var74 = 321;
                Statics.field718.method1748(var73 - 73, var74 - 20);
                arg0.method3788(class158.field2341, var73, var74 + 5, 16777215, 0);
                int var75 = field719 + 180 + 80;
                Statics.field718.method1748(var75 - 73, var74 - 20);
                arg0.method3788(class158.field2572, var75, var74 + 5, 16777215, 0);
                arg1.method3788(class158.field2457, field719 + 180, var74 + 36, 255, 0);
            } else if (field730 == 5) {
                arg0.method3788(class158.field2601, field719 + 180, 201, 16776960, 0);
                short var76 = 221;
                arg2.method3788(field715, field719 + 180, var76, 16776960, 0);
                int var113 = var76 + 15;
                arg2.method3788(field733, field719 + 180, var113, 16776960, 0);
                int var114 = var113 + 15;
                arg2.method3788(field740, field719 + 180, var114, 16776960, 0);
                int var115 = var114 + 15;
                int var116 = var115 + 14;
                arg0.method3786(class158.field2604, field719 + 180 - 145, var116, 16777215, 0);
                short var77 = 174;
                String var78;
                for (var78 = field735; arg0.method3781(var78) > var77; var78 = var78.substring(1)) {
                }
                arg0.method3786(class224.method3852(var78) + (client.field306 % 40 < 20 ? class2.method1476(16776960) + class2.field23 : ""), field719 + 180 - 34, var116, 16777215, 0);
                var113 = var116 + 15;
                int var79 = field719 + 180 - 80;
                short var80 = 321;
                Statics.field718.method1748(var79 - 73, var80 - 20);
                arg0.method3788(class158.field2581, var79, var80 + 5, 16777215, 0);
                int var81 = field719 + 180 + 80;
                Statics.field718.method1748(var81 - 73, var80 - 20);
                arg0.method3788(class158.field2582, var81, var80 + 5, 16777215, 0);
            } else if (field730 == 6) {
                short var82 = 211;
                arg0.method3788(field715, field719 + 180, var82, 16776960, 0);
                int var117 = var82 + 15;
                arg0.method3788(field733, field719 + 180, var117, 16776960, 0);
                int var118 = var117 + 15;
                arg0.method3788(field740, field719 + 180, var118, 16776960, 0);
                int var119 = var118 + 15;
                int var83 = field719 + 180;
                short var84 = 321;
                Statics.field718.method1748(var83 - 73, var84 - 20);
                arg0.method3788(class158.field2582, var83, var84 + 5, 16777215, 0);
            }
        }
        if (field726 > 0) {
            method765(field726);
            field726 = 0;
        }
        method3();
        Statics.field780[Statics.field990.field158 ? 1 : 0].method1748(field721 + 765 - 40, 463);
        if (client.field304 > 5 && client.field303 == 0) {
            if (Statics.field1628 == null) {
                Statics.field1628 = class77.method2668(Statics.field796, "sl_button", "");
            } else {
                int var85 = field721 + 5;
                short var86 = 463;
                byte var87 = 100;
                byte var88 = 35;
                Statics.field1628.method1748(var85, var86);
                arg0.method3788(class158.field2498 + " " + client.field297, var87 / 2 + var85, var88 / 2 + var86 - 2, 16777215, 0);
                if (Statics.field1081 == null) {
                    arg1.method3788(class158.field2614, var87 / 2 + var85, var88 / 2 + var86 + 12, 16777215, 0);
                } else {
                    arg1.method3788(class158.field2365, var87 / 2 + var85, var88 / 2 + var86 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var89 = Statics.field1538.getGraphics();
            Statics.field992.method1503(var89, 0, 0);
        } catch (Exception var92) {
            Statics.field1538.repaint();
        }
    }

    @ObfuscatedName("f.m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method587(String arg0, String arg1, String arg2) {
        field715 = arg0;
        field733 = arg1;
        field740 = arg2;
    }

    @ObfuscatedName("ad.c(Lca;B)V")
    public static final void method852(class81 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field88.length; var2++) {
            Statics.field88[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field88[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field738[var8] = (Statics.field88[var8 - 1] + Statics.field88[var8 + 1] + Statics.field88[var8 - 128] + Statics.field88[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field88;
            Statics.field88 = Statics.field738;
            Statics.field738 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1424; var11++) {
            for (int var12 = 0; var12 < arg0.field1426; var12++) {
                if (arg0.field1428[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1425;
                    int var14 = var11 + 16 + arg0.field1421;
                    int var15 = (var14 << 7) + var13;
                    Statics.field88[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("al.v(IS)V")
    public static final void method765(int arg0) {
        short var1 = 256;
        field724 += arg0 * 128;
        if (field724 > Statics.field88.length) {
            field724 -= Statics.field88.length;
            int var2 = (int) (Math.random() * 12.0D);
            method852(Statics.field2163[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field1098[var3 + var4] - Statics.field88[field724 + var3 & Statics.field88.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field1098[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field1098[var9 + var10] = 255;
                } else {
                    Statics.field1098[var9 + var10] = 0;
                }
            }
        }
        if (field717 > 0) {
            field717 -= arg0 * 4;
        }
        if (field722 > 0) {
            field722 -= arg0 * 4;
        }
        if (field717 == 0 && field722 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field717 = 1024;
            }
            if (var12 == 1) {
                field722 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field720[var13] = field720[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field720[var14] = (int) (Math.sin((double) field727 / 14.0D) * 16.0D + Math.sin((double) field727 / 15.0D) * 14.0D + Math.sin((double) field727 / 16.0D) * 12.0D);
            field727++;
        }
        field734 += arg0 * -553814807;
        int var15 = ((client.field306 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field734 * 1938280132; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field1098[(var18 << 7) + var17] = 192;
        }
        field734 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field1098[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field1098[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field685[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field685[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field685[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field1098[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("de.l(IIII)I")
    public static final int method2562(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("w.z(I)V")
    public static final void method3() {
        short var0 = 256;
        if (field717 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field717 > 768) {
                    Statics.field3233[var1] = method2562(Statics.field1646[var1], Statics.field2026[var1], 1024 - field717);
                } else if (field717 > 256) {
                    Statics.field3233[var1] = Statics.field2026[var1];
                } else {
                    Statics.field3233[var1] = method2562(Statics.field2026[var1], Statics.field1646[var1], 256 - field717);
                }
            }
        } else if (field722 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field722 > 768) {
                    Statics.field3233[var2] = method2562(Statics.field1646[var2], Statics.field1884[var2], 1024 - field722);
                } else if (field722 > 256) {
                    Statics.field3233[var2] = Statics.field1884[var2];
                } else {
                    Statics.field3233[var2] = method2562(Statics.field1884[var2], Statics.field1646[var2], 256 - field722);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field3233[var3] = Statics.field1646[var3];
            }
        }
        class80.method1666(field721, 9, field721 + 128, var0 + 7);
        Statics.field2669.method1590(field721, 0);
        class80.method1665();
        int var4 = 0;
        int var5 = field721 + Statics.field992.field1397 * 9;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field720[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1098[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field3233[var10];
                    int var14 = Statics.field992.field1396[var5];
                    Statics.field992.field1396[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += Statics.field992.field1397 + var8 - 128;
        }
        class80.method1666(field721 + 765 - 128, 9, field721 + 765, var0 + 7);
        Statics.field3153.method1590(field721 + 382, 0);
        class80.method1665();
        int var15 = 0;
        int var16 = field721 + Statics.field992.field1397 * 9 + 24 + 637;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field720[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1098[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field3233[var22];
                    int var26 = Statics.field992.field1396[var20];
                    Statics.field992.field1396[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = Statics.field992.field1397 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("dn.s(Lb;I)V")
    public static void method2304(class26 arg0) {
        if (arg0.method632() != client.field301) {
            client.field301 = arg0.method632();
            class52.method845(arg0.method632());
        }
        Statics.field1892 = arg0.field650;
        client.field297 = arg0.field651;
        client.field504 = arg0.field648;
        Statics.field593 = client.field300 == 0 ? 43594 : arg0.field651 + 40000;
        Statics.field268 = client.field300 == 0 ? 443 : arg0.field651 + 50000;
        Statics.field1608 = Statics.field593;
    }
}

package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("al")
public class class28 {

    @ObfuscatedName("al.t")
    public static int[] field655 = new int[256];

    @ObfuscatedName("al.b")
    public static int field644 = 0;

    @ObfuscatedName("al.x")
    public static int field650 = 0;

    @ObfuscatedName("al.ab")
    public static int field646 = 0;

    @ObfuscatedName("al.al")
    public static int field652 = 0;

    @ObfuscatedName("al.an")
    public static int field642 = 0;

    @ObfuscatedName("al.aw")
    public static int field649 = 0;

    @ObfuscatedName("al.ar")
    public static int field647 = 10;

    @ObfuscatedName("al.ai")
    public static String field651 = "";

    @ObfuscatedName("al.aj")
    public static int field656 = 0;

    @ObfuscatedName("al.ao")
    public static String field653 = "";

    @ObfuscatedName("al.ap")
    public static String field636 = "";

    @ObfuscatedName("al.as")
    public static String field662 = "";

    @ObfuscatedName("al.au")
    public static String field637 = "";

    @ObfuscatedName("al.ac")
    public static String field641 = "";

    @ObfuscatedName("al.ay")
    public static class145 field658 = class145.field2424;

    @ObfuscatedName("al.ae")
    public static boolean field660 = true;

    @ObfuscatedName("al.at")
    public static int field663 = 0;

    @ObfuscatedName("al.az")
    public static String field657 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("al.ag")
    public static String field648 = "1234567890";

    @ObfuscatedName("al.am")
    public static boolean field664 = false;

    @ObfuscatedName("al.bg")
    public static int field665 = 0;

    @ObfuscatedName("al.bl")
    public static int[] field666 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("al.bj")
    public static int[] field645 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("al.bn")
    public static int field668 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dj.k(Lei;Lei;B)I")
    public static int method2406(class147 arg0, class147 arg1) {
        int var2 = 0;
        if (arg0.method2745("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2745("logo", "")) {
            var2++;
        }
        if (arg1.method2745("titlebox", "")) {
            var2++;
        }
        if (arg1.method2745("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2745("runes", "")) {
            var2++;
        }
        if (arg1.method2745("title_mute", "")) {
            var2++;
        }
        if (arg1.method2747("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2747("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2745("sl_back", "");
        arg1.method2745("sl_flags", "");
        arg1.method2745("sl_arrows", "");
        arg1.method2745("sl_stars", "");
        arg1.method2745("sl_button", "");
        return var2;
    }

    @ObfuscatedName("cq.y(Ljava/awt/Component;Lei;Lei;ZII)V")
    public static void method1983(Component arg0, class147 arg1, class147 arg2, boolean arg3, int arg4) {
        if (!Statics.field661) {
            field656 = arg4;
            class73.method1561();
            byte[] var5 = arg1.method2758("title.jpg", "");
            Statics.field635 = new class72(var5, arg0);
            Statics.field632 = Statics.field635.method1428();
            Statics.field667 = class70.method2874(arg2, "logo", "");
            Statics.field1888 = class70.method2874(arg2, "titlebox", "");
            Statics.field633 = class70.method2874(arg2, "titlebutton", "");
            Statics.field634 = class70.method15(arg2, "runes", "");
            Statics.field1822 = class70.method15(arg2, "title_mute", "");
            Statics.field1560 = class70.method2874(arg2, "options_radio_buttons,0", "");
            Statics.field638 = class70.method2874(arg2, "options_radio_buttons,2", "");
            Statics.field712 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field712[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field712[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field712[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field712[var9 + 192] = 16777215;
            }
            Statics.field2030 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field2030[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field2030[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field2030[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field2030[var13 + 192] = 16777215;
            }
            Statics.field177 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field177[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field177[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field177[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field177[var17 + 192] = 16777215;
            }
            Statics.field643 = new int[256];
            Statics.field1812 = new int[32768];
            Statics.field1754 = new int[32768];
            method434((class74) null);
            Statics.field135 = new int[32768];
            Statics.field2793 = new int[32768];
            if (arg3) {
                field637 = "";
                field641 = "";
            }
            Statics.field1919 = 0;
            Statics.field659 = "";
            field660 = true;
            field664 = false;
            if (Statics.field2674.field130) {
                class162.method860(2);
            } else {
                class148 var18 = Statics.field1550;
                int var19 = var18.method2743("scape main");
                int var20 = var18.method2744(var19, "");
                class162.field2723 = 1;
                Statics.field2725 = var18;
                Statics.field2718 = var19;
                Statics.field139 = var20;
                Statics.field1807 = 255;
                Statics.field1904 = false;
                Statics.field2724 = 2;
            }
            class151.method2405(false);
            Statics.field661 = true;
            Statics.field635.method1487(0, 0);
            Statics.field632.method1487(382, 0);
            Statics.field667.method1584(382 - Statics.field667.field1302 / 2, 18);
        } else if (arg4 == 4) {
            field656 = 4;
        }
    }

    @ObfuscatedName("ao.s(Les;I)V")
    public static void method572(class131 arg0) {
        if (field664) {
            method1335(arg0);
            return;
        }
        if ((class127.field2004 == 1 || !Statics.field697 && class127.field2004 == 4) && class127.field2013 >= 715 && class127.field2015 >= 453) {
            Statics.field2674.field130 = !Statics.field2674.field130;
            class9.method466();
            if (Statics.field2674.field130) {
                class162.method464();
            } else {
                class162.method2503(Statics.field1550, "scape main", "", 255, false);
            }
        }
        if (client.field416 == 5) {
            return;
        }
        field642++;
        if (client.field416 != 10 && client.field416 != 11) {
            return;
        }
        if (client.field247 == 0) {
            if (class127.field2004 == 1 || !Statics.field697 && class127.field2004 == 4) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class127.field2013 >= var1 && class127.field2013 <= var1 + var3 && class127.field2015 >= var2 && class127.field2015 <= var2 + var4) {
                    method460();
                    return;
                }
            }
            if (Statics.field1748 != null) {
                method460();
            }
        }
        int var5 = class127.field2004;
        int var6 = class127.field2013;
        int var7 = class127.field2015;
        if (!Statics.field697 && var5 == 4) {
            var5 = 1;
        }
        if (field656 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                label477: {
                    String var10 = client.method147("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var10));
                            break label477;
                        } catch (Exception var29) {
                        }
                    }
                    if (class125.field1983.startsWith("win")) {
                        class125.method118(var10, 0, "openjs");
                    } else if (class125.field1983.startsWith("mac")) {
                        class125.method118(var10, 1, "openjs");
                    } else {
                        class125.method118(var10, 2, "openjs");
                    }
                }
            }
            short var12 = 462;
            if (var5 == 1 && var6 >= var12 - 75 && var6 <= var12 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field423 & 0x4) != 0) {
                    if ((client.field423 & 0x400) == 0) {
                        field653 = class143.field2380;
                        field636 = class143.field2381;
                        field662 = class143.field2267;
                    } else {
                        field653 = class143.field2386;
                        field636 = class143.field2387;
                        field662 = class143.field2219;
                    }
                    field656 = 1;
                    field663 = 0;
                } else if ((client.field423 & 0x400) == 0) {
                    field653 = class143.field2262;
                    field636 = class143.field2377;
                    field662 = class143.field2378;
                    field656 = 2;
                    field663 = 0;
                } else {
                    field653 = class143.field2383;
                    field636 = class143.field2205;
                    field662 = class143.field2183;
                    field656 = 1;
                    field663 = 0;
                }
            }
        } else if (field656 == 1) {
            while (class124.method2430()) {
                if (Statics.field1922 == 84) {
                    field653 = class143.field2262;
                    field636 = class143.field2377;
                    field662 = class143.field2378;
                    field656 = 2;
                    field663 = 0;
                } else if (Statics.field1922 == 13) {
                    field656 = 0;
                }
            }
            short var13 = 302;
            short var14 = 321;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field653 = class143.field2262;
                field636 = class143.field2377;
                field662 = class143.field2378;
                field656 = 2;
                field663 = 0;
            }
            short var15 = 462;
            if (var5 == 1 && var6 >= var15 - 75 && var6 <= var15 + 75 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                field656 = 0;
            }
        } else if (field656 == 2) {
            short var16 = 231;
            int var31 = var16 + 30;
            if (var5 == 1 && var7 >= var31 - 15 && var7 < var31) {
                field663 = 0;
            }
            var31 += 15;
            if (var5 == 1 && var7 >= var31 - 15 && var7 < var31) {
                field663 = 1;
            }
            var31 += 15;
            short var17 = 302;
            short var18 = 321;
            if (var5 == 1 && var6 >= var17 - 75 && var6 <= var17 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field637 = field637.trim();
                if (field637.length() == 0) {
                    method444(class143.field2282, class143.field2337, class143.field2284);
                    return;
                }
                if (field641.length() == 0) {
                    method444(class143.field2255, class143.field2286, class143.field2287);
                    return;
                }
                method444(class143.field2250, class143.field2328, class143.field2393);
                field658 = Statics.field2674.field131.containsKey(class200.method3193(field637)) ? class145.field2427 : class145.field2424;
                client.method645(20);
                return;
            }
            short var19 = 462;
            if (var5 == 1 && var6 >= var19 - 75 && var6 <= var19 + 75 && var7 >= var18 - 20 && var7 <= var18 + 20) {
                field656 = 0;
                field637 = "";
                field641 = "";
                Statics.field1919 = 0;
                Statics.field659 = "";
                field660 = true;
            }
            while (true) {
                while (class124.method2430()) {
                    boolean var20 = false;
                    for (int var21 = 0; var21 < field657.length(); var21++) {
                        if (Statics.field1805 == field657.charAt(var21)) {
                            var20 = true;
                            break;
                        }
                    }
                    if (Statics.field1922 == 13) {
                        field656 = 0;
                        field637 = "";
                        field641 = "";
                        Statics.field1919 = 0;
                        Statics.field659 = "";
                        field660 = true;
                    } else if (field663 == 0) {
                        if (Statics.field1922 == 85 && field637.length() > 0) {
                            field637 = field637.substring(0, field637.length() - 1);
                        }
                        if (Statics.field1922 == 84 || Statics.field1922 == 80) {
                            field663 = 1;
                        }
                        if (var20 && field637.length() < 320) {
                            field637 = field637 + Statics.field1805;
                        }
                    } else if (field663 == 1) {
                        if (Statics.field1922 == 85 && field641.length() > 0) {
                            field641 = field641.substring(0, field641.length() - 1);
                        }
                        if (Statics.field1922 == 84 || Statics.field1922 == 80) {
                            field663 = 0;
                        }
                        if (Statics.field1922 == 84) {
                            field637 = field637.trim();
                            if (field637.length() == 0) {
                                method444(class143.field2282, class143.field2337, class143.field2284);
                                return;
                            }
                            if (field641.length() == 0) {
                                method444(class143.field2255, class143.field2286, class143.field2287);
                                return;
                            }
                            method444(class143.field2250, class143.field2328, class143.field2393);
                            field658 = Statics.field2674.field131.containsKey(class200.method3193(field637)) ? class145.field2427 : class145.field2424;
                            client.method645(20);
                            return;
                        }
                        if (var20 && field641.length() < 20) {
                            field641 = field641 + Statics.field1805;
                        }
                    }
                }
                return;
            }
        } else if (field656 == 4) {
            short var22 = 302;
            short var23 = 321;
            if (var5 == 1 && var6 >= var22 - 75 && var6 <= var22 + 75 && var7 >= var23 - 20 && var7 <= var23 + 20) {
                Statics.field659.trim();
                if (Statics.field659.length() != 6) {
                    method444(class143.field2198, class143.field2199, class143.field2200);
                    return;
                }
                Statics.field1919 = Integer.parseInt(Statics.field659);
                Statics.field659 = "";
                field658 = field660 ? class145.field2423 : class145.field2422;
                method444(class143.field2250, class143.field2328, class143.field2393);
                client.method645(20);
                return;
            }
            if (var5 == 1 && var6 >= 373 && var6 <= 512 && var7 >= 263 && var7 <= 296) {
                field660 = !field660;
            }
            if (var5 == 1 && var6 >= 348 && var6 <= 416 && var7 >= 351 && var7 <= 363) {
                label492: {
                    String var24 = client.method147("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                    if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                        try {
                            Desktop.getDesktop().browse(new URI(var24));
                            break label492;
                        } catch (Exception var30) {
                        }
                    }
                    if (class125.field1983.startsWith("win")) {
                        class125.method118(var24, 0, "openjs");
                    } else if (class125.field1983.startsWith("mac")) {
                        class125.method118(var24, 1, "openjs");
                    } else {
                        class125.method118(var24, 2, "openjs");
                    }
                }
            }
            short var26 = 462;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var23 - 20 && var7 <= var23 + 20) {
                field656 = 0;
                field637 = "";
                field641 = "";
                Statics.field1919 = 0;
                Statics.field659 = "";
            }
            while (class124.method2430()) {
                boolean var27 = false;
                for (int var28 = 0; var28 < field648.length(); var28++) {
                    if (Statics.field1805 == field648.charAt(var28)) {
                        var27 = true;
                        break;
                    }
                }
                if (Statics.field1922 == 13) {
                    field656 = 0;
                    field637 = "";
                    field641 = "";
                    Statics.field1919 = 0;
                    Statics.field659 = "";
                } else {
                    if (Statics.field1922 == 85 && Statics.field659.length() > 0) {
                        Statics.field659 = Statics.field659.substring(0, Statics.field659.length() - 1);
                    }
                    if (Statics.field1922 == 84) {
                        Statics.field659.trim();
                        if (Statics.field659.length() != 6) {
                            method444(class143.field2198, class143.field2199, class143.field2200);
                            return;
                        }
                        Statics.field1919 = Integer.parseInt(Statics.field659);
                        Statics.field659 = "";
                        field658 = field660 ? class145.field2423 : class145.field2422;
                        method444(class143.field2250, class143.field2328, class143.field2393);
                        client.method645(20);
                        return;
                    }
                    if (var27 && Statics.field659.length() < 6) {
                        Statics.field659 = Statics.field659 + Statics.field1805;
                    }
                }
            }
        }
    }

    @ObfuscatedName("by.g(Lgn;Lgn;I)V")
    public static void method1371(class194 arg0, class194 arg1) {
        if (field664) {
            if (Statics.field1753 == null) {
                Statics.field1753 = class70.method1603(Statics.field1071, "sl_back", "");
            }
            if (Statics.field1095 == null) {
                Statics.field1095 = class70.method15(Statics.field1071, "sl_flags", "");
            }
            if (Statics.field1250 == null) {
                Statics.field1250 = class70.method15(Statics.field1071, "sl_arrows", "");
            }
            if (Statics.field983 == null) {
                Statics.field983 = class70.method15(Statics.field1071, "sl_stars", "");
            }
            class73.method1518(0, 23, 765, 480, 0);
            class73.method1511(0, 0, 125, 23, 12425273, 9135624);
            class73.method1511(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3407(class143.field2402, 62, 15, 0, -1);
            if (Statics.field983 != null) {
                Statics.field983[1].method1584(140, 1);
                arg1.method3405(class143.field2403, 152, 10, 16777215, -1);
                Statics.field983[0].method1584(140, 12);
                arg1.method3405(class143.field2283, 152, 21, 16777215, -1);
            }
            if (Statics.field1250 != null) {
                short var2 = 280;
                if (field666[0] == 0 && field645[0] == 0) {
                    Statics.field1250[2].method1584(var2, 4);
                } else {
                    Statics.field1250[0].method1584(var2, 4);
                }
                if (field666[0] == 0 && field645[0] == 1) {
                    Statics.field1250[3].method1584(var2 + 15, 4);
                } else {
                    Statics.field1250[1].method1584(var2 + 15, 4);
                }
                arg0.method3405(class143.field2318, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field666[0] == 1 && field645[0] == 0) {
                    Statics.field1250[2].method1584(var3, 4);
                } else {
                    Statics.field1250[0].method1584(var3, 4);
                }
                if (field666[0] == 1 && field645[0] == 1) {
                    Statics.field1250[3].method1584(var3 + 15, 4);
                } else {
                    Statics.field1250[1].method1584(var3 + 15, 4);
                }
                arg0.method3405(class143.field2406, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field666[0] == 2 && field645[0] == 0) {
                    Statics.field1250[2].method1584(var4, 4);
                } else {
                    Statics.field1250[0].method1584(var4, 4);
                }
                if (field666[0] == 2 && field645[0] == 1) {
                    Statics.field1250[3].method1584(var4 + 15, 4);
                } else {
                    Statics.field1250[1].method1584(var4 + 15, 4);
                }
                arg0.method3405(class143.field2191, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field666[0] == 3 && field645[0] == 0) {
                    Statics.field1250[2].method1584(var5, 4);
                } else {
                    Statics.field1250[0].method1584(var5, 4);
                }
                if (field666[0] == 3 && field645[0] == 1) {
                    Statics.field1250[3].method1584(var5 + 15, 4);
                } else {
                    Statics.field1250[1].method1584(var5 + 15, 4);
                }
                arg0.method3405(class143.field2333, var5 + 32, 17, 16777215, -1);
            }
            class73.method1518(708, 4, 50, 16, 0);
            arg1.method3407(class143.field2401, 733, 16, 16777215, -1);
            field668 = -1;
            if (Statics.field1753 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field665) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field665) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field665) {
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
                int var17 = var14;
                int var18 = 0;
                boolean var19 = false;
                for (int var20 = 0; var20 < field665; var20++) {
                    class22 var21 = Statics.field546[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field562);
                    if (var21.field562 == -1) {
                        var23 = class143.field2409;
                        var22 = false;
                    } else if (var21.field562 > 1980) {
                        var23 = class143.field2410;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method458()) {
                        if (var21.method457()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method457()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class127.field2007 >= var17 && class127.field2008 >= var16 && class127.field2007 < var6 + var17 && class127.field2008 < var7 + var16 && var22) {
                        field668 = var20;
                        Statics.field1753[var24].method1465(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field1753[var24].method1487(var17, var16);
                    }
                    if (Statics.field1095 != null) {
                        Statics.field1095[(var21.method457() ? 8 : 0) + var21.field570].method1584(var17 + 29, var16);
                    }
                    arg0.method3407(Integer.toString(var21.field560), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3407(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3400(Statics.field546[field668].field564) + 6;
                    int var26 = arg1.field2915 + 8;
                    class73.method1518(class127.field2007 - var25 / 2, class127.field2008 + 20 + 5, var25, var26, 16777120);
                    class73.method1519(class127.field2007 - var25 / 2, class127.field2008 + 20 + 5, var25, var26, 0);
                    arg1.method3407(Statics.field546[field668].field564, class127.field2007, class127.field2008 + 20 + 5 + arg1.field2915 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field208.getGraphics();
                Statics.field2431.method1345(var27, 0, 0);
            } catch (Exception var115) {
                Statics.field208.repaint();
            }
            return;
        }
        if (client.field416 == 0 || client.field416 == 5) {
            byte var29 = 20;
            arg0.method3407(class143.field2375, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class73.method1519(230, var30, 304, 34, 9179409);
            class73.method1519(231, var30 + 1, 302, 32, 0);
            class73.method1518(232, var30 + 2, field647 * 3, 30, 9179409);
            class73.method1518(field647 * 3 + 232, var30 + 2, 300 - field647 * 3, 30, 0);
            arg0.method3407(field651, 382, 276 - var29, 16777215, -1);
        }
        if (client.field416 == 20) {
            Statics.field1888.method1584(382 - Statics.field1888.field1302 / 2, 271 - Statics.field1888.field1303 / 2);
            short var31 = 211;
            arg0.method3407(field653, 382, var31, 16776960, 0);
            int var117 = var31 + 15;
            arg0.method3407(field636, 382, var117, 16776960, 0);
            int var118 = var117 + 15;
            arg0.method3407(field662, 382, var118, 16776960, 0);
            int var119 = var118 + 15;
            int var120 = var119 + 10;
            if (field656 != 4) {
                arg0.method3405(class143.field2186, 272, var120, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field637; arg0.method3400(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3405(class193.method3404(var33), 312, var120, 16777215, 0);
                var117 = var120 + 15;
                arg0.method3405(class143.field2395 + class200.method492(field641), 274, var117, 16777215, 0);
                var117 += 15;
            }
        }
        if (client.field416 == 10 || client.field416 == 11) {
            Statics.field1888.method1584(202, 171);
            if (field656 == 0) {
                short var34 = 251;
                arg0.method3407(class143.field2397, 382, var34, 16776960, 0);
                int var121 = var34 + 30;
                short var35 = 302;
                short var36 = 291;
                Statics.field633.method1584(var35 - 73, var36 - 20);
                arg0.method3475(class143.field2389, var35 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var37 = 462;
                Statics.field633.method1584(var37 - 73, var36 - 20);
                arg0.method3475(class143.field2365, var37 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field656 == 1) {
                arg0.method3407(class143.field2379, 382, 211, 16776960, 0);
                short var38 = 236;
                arg0.method3407(field653, 382, var38, 16777215, 0);
                int var122 = var38 + 15;
                arg0.method3407(field636, 382, var122, 16777215, 0);
                int var123 = var122 + 15;
                arg0.method3407(field662, 382, var123, 16777215, 0);
                int var124 = var123 + 15;
                short var39 = 302;
                short var40 = 321;
                Statics.field633.method1584(var39 - 73, var40 - 20);
                arg0.method3407(class143.field2171, var39, var40 + 5, 16777215, 0);
                short var41 = 462;
                Statics.field633.method1584(var41 - 73, var40 - 20);
                arg0.method3407(class143.field2401, var41, var40 + 5, 16777215, 0);
            } else if (field656 == 2) {
                short var42 = 211;
                arg0.method3407(field653, 382, var42, 16776960, 0);
                int var125 = var42 + 15;
                arg0.method3407(field636, 382, var125, 16776960, 0);
                int var126 = var125 + 15;
                arg0.method3407(field662, 382, var126, 16776960, 0);
                int var127 = var126 + 15;
                int var128 = var127 + 10;
                arg0.method3405(class143.field2186, 272, var128, 16777215, 0);
                short var43 = 200;
                String var44;
                for (var44 = field637; arg0.method3400(var44) > var43; var44 = var44.substring(1)) {
                }
                arg0.method3405(class193.method3404(var44) + (field663 == 0 & client.field245 % 40 < 20 ? class2.method49(16776960) + class2.field21 : ""), 312, var128, 16777215, 0);
                var125 = var128 + 15;
                arg0.method3405(class143.field2395 + class200.method492(field641) + (field663 == 1 & client.field245 % 40 < 20 ? class2.method49(16776960) + class2.field21 : ""), 274, var125, 16777215, 0);
                var125 += 15;
                short var45 = 302;
                short var46 = 321;
                Statics.field633.method1584(var45 - 73, var46 - 20);
                arg0.method3407(class143.field2400, var45, var46 + 5, 16777215, 0);
                short var47 = 462;
                Statics.field633.method1584(var47 - 73, var46 - 20);
                arg0.method3407(class143.field2401, var47, var46 + 5, 16777215, 0);
            } else if (field656 == 4) {
                arg0.method3407(class143.field2332, 382, 211, 16776960, 0);
                short var48 = 236;
                arg0.method3407(field653, 382, var48, 16777215, 0);
                int var129 = var48 + 15;
                arg0.method3407(field636, 382, var129, 16777215, 0);
                int var130 = var129 + 15;
                arg0.method3407(field662, 382, var130, 16777215, 0);
                int var131 = var130 + 15;
                arg0.method3405(class143.field2396 + class200.method492(Statics.field659) + (client.field245 % 40 < 20 ? class2.method49(16776960) + class2.field21 : ""), 274, var131, 16777215, 0);
                int var132 = var131 - 8;
                arg0.method3405(class143.field2172, 373, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg0.method3405(class143.field2195, 373, var133, 16776960, 0);
                int var49 = 373 + arg0.method3400(class143.field2195) + 15;
                int var50 = var133 - arg0.field2915;
                class74 var51;
                if (field660) {
                    var51 = Statics.field638;
                } else {
                    var51 = Statics.field1560;
                }
                var51.method1584(var49, var50);
                var129 = var133 + 15;
                short var52 = 302;
                short var53 = 321;
                Statics.field633.method1584(var52 - 73, var53 - 20);
                arg0.method3407(class143.field2171, var52, var53 + 5, 16777215, 0);
                short var54 = 462;
                Statics.field633.method1584(var54 - 73, var53 - 20);
                arg0.method3407(class143.field2401, var54, var53 + 5, 16777215, 0);
                arg1.method3407(class143.field2390, 382, var53 + 36, 255, 0);
            }
        }
        if (field642 > 0) {
            int var55 = field642;
            short var56 = 256;
            field646 += var55 * 128;
            if (field646 > Statics.field1812.length) {
                field646 -= Statics.field1812.length;
                int var57 = (int) (Math.random() * 12.0D);
                method434(Statics.field634[var57]);
            }
            int var58 = 0;
            int var59 = var55 * 128;
            int var60 = (var56 - var55) * 128;
            for (int var61 = 0; var61 < var60; var61++) {
                int var62 = Statics.field135[var58 + var59] - Statics.field1812[field646 + var58 & Statics.field1812.length - 1] * var55 / 6;
                if (var62 < 0) {
                    var62 = 0;
                }
                Statics.field135[var58++] = var62;
            }
            for (int var63 = var56 - var55; var63 < var56; var63++) {
                int var64 = var63 * 128;
                for (int var65 = 0; var65 < 128; var65++) {
                    int var66 = (int) (Math.random() * 100.0D);
                    if (var66 < 50 && var65 > 10 && var65 < 118) {
                        Statics.field135[var64 + var65] = 255;
                    } else {
                        Statics.field135[var64 + var65] = 0;
                    }
                }
            }
            if (field644 > 0) {
                field644 -= var55 * 4;
            }
            if (field650 > 0) {
                field650 -= var55 * 4;
            }
            if (field644 == 0 && field650 == 0) {
                int var67 = (int) (Math.random() * (double) (2000 / var55));
                if (var67 == 0) {
                    field644 = 1024;
                }
                if (var67 == 1) {
                    field650 = 1024;
                }
            }
            for (int var68 = 0; var68 < var56 - var55; var68++) {
                field655[var68] = field655[var55 + var68];
            }
            for (int var69 = var56 - var55; var69 < var56; var69++) {
                field655[var69] = (int) (Math.sin((double) field649 / 14.0D) * 16.0D + Math.sin((double) field649 / 15.0D) * 14.0D + Math.sin((double) field649 / 16.0D) * 12.0D);
                field649++;
            }
            field652 += var55 * -493819295;
            int var70 = ((client.field245 & 0x1) + var55) / 2;
            if (var70 > 0) {
                for (int var71 = 0; var71 < field652 * -1406500124; var71++) {
                    int var72 = (int) (Math.random() * 124.0D) + 2;
                    int var73 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field135[(var73 << 7) + var72] = 192;
                }
                field652 = 0;
                int var74 = 0;
                label494: while (true) {
                    if (var74 >= var56) {
                        int var78 = 0;
                        while (true) {
                            if (var78 >= 128) {
                                break label494;
                            }
                            int var79 = 0;
                            for (int var80 = -var70; var80 < var56; var80++) {
                                int var81 = var80 * 128;
                                if (var70 + var80 < var56) {
                                    var79 += Statics.field2793[var70 * 128 + var78 + var81];
                                }
                                if (var80 - (var70 + 1) >= 0) {
                                    var79 -= Statics.field2793[var78 + var81 - (var70 + 1) * 128];
                                }
                                if (var80 >= 0) {
                                    Statics.field135[var78 + var81] = var79 / (var70 * 2 + 1);
                                }
                            }
                            var78++;
                        }
                    }
                    int var75 = 0;
                    int var76 = var74 * 128;
                    for (int var77 = -var70; var77 < 128; var77++) {
                        if (var70 + var77 < 128) {
                            var75 += Statics.field135[var76 + var77 + var70];
                        }
                        if (var77 - (var70 + 1) >= 0) {
                            var75 -= Statics.field135[var76 + var77 - (var70 + 1)];
                        }
                        if (var77 >= 0) {
                            Statics.field2793[var76 + var77] = var75 / (var70 * 2 + 1);
                        }
                    }
                    var74++;
                }
            }
            field642 = 0;
        }
        short var82 = 256;
        if (field644 > 0) {
            for (int var83 = 0; var83 < 256; var83++) {
                if (field644 > 768) {
                    Statics.field643[var83] = method802(Statics.field712[var83], Statics.field2030[var83], 1024 - field644);
                } else if (field644 > 256) {
                    Statics.field643[var83] = Statics.field2030[var83];
                } else {
                    Statics.field643[var83] = method802(Statics.field2030[var83], Statics.field712[var83], 256 - field644);
                }
            }
        } else if (field650 > 0) {
            for (int var84 = 0; var84 < 256; var84++) {
                if (field650 > 768) {
                    Statics.field643[var84] = method802(Statics.field712[var84], Statics.field177[var84], 1024 - field650);
                } else if (field650 > 256) {
                    Statics.field643[var84] = Statics.field177[var84];
                } else {
                    Statics.field643[var84] = method802(Statics.field177[var84], Statics.field712[var84], 256 - field650);
                }
            }
        } else {
            for (int var85 = 0; var85 < 256; var85++) {
                Statics.field643[var85] = Statics.field712[var85];
            }
        }
        class73.method1512(0, 9, 128, var82 + 7);
        Statics.field635.method1487(0, 0);
        class73.method1531();
        int var86 = 0;
        int var87 = 6885;
        for (int var88 = 1; var88 < var82 - 1; var88++) {
            int var89 = (var82 - var88) * field655[var88] / var82;
            int var90 = var89 + 22;
            if (var90 < 0) {
                var90 = 0;
            }
            var86 += var90;
            for (int var91 = var90; var91 < 128; var91++) {
                int var92 = Statics.field135[var86++];
                if (var92 == 0) {
                    var87++;
                } else {
                    int var94 = 256 - var92;
                    int var95 = Statics.field643[var92];
                    int var96 = Statics.field2431.field1272[var87];
                    Statics.field2431.field1272[var87++] = ((var95 & 0xFF00) * var92 + (var96 & 0xFF00) * var94 & 0xFF0000) + ((var95 & 0xFF00FF) * var92 + (var96 & 0xFF00FF) * var94 & 0xFF00FF00) >> 8;
                }
            }
            var87 += var90 + 765 - 128;
        }
        class73.method1512(637, 9, 765, var82 + 7);
        Statics.field632.method1487(382, 0);
        class73.method1531();
        int var97 = 0;
        int var98 = 7546;
        for (int var99 = 1; var99 < var82 - 1; var99++) {
            int var100 = (var82 - var99) * field655[var99] / var82;
            int var101 = 103 - var100;
            int var102 = var98 + var100;
            for (int var103 = 0; var103 < var101; var103++) {
                int var104 = Statics.field135[var97++];
                if (var104 == 0) {
                    var102++;
                } else {
                    int var106 = 256 - var104;
                    int var107 = Statics.field643[var104];
                    int var108 = Statics.field2431.field1272[var102];
                    Statics.field2431.field1272[var102++] = ((var107 & 0xFF00FF) * var104 + (var108 & 0xFF00FF) * var106 & 0xFF00FF00) + ((var107 & 0xFF00) * var104 + (var108 & 0xFF00) * var106 & 0xFF0000) >> 8;
                }
            }
            var97 += 128 - var101;
            var98 = 765 - var101 - var100 + var102;
        }
        Statics.field1822[Statics.field2674.field130 ? 1 : 0].method1584(725, 463);
        if (client.field416 > 5 && client.field247 == 0) {
            if (Statics.field27 == null) {
                Statics.field27 = class70.method2874(Statics.field1071, "sl_button", "");
            } else {
                byte var109 = 5;
                short var110 = 463;
                byte var111 = 100;
                byte var112 = 35;
                Statics.field27.method1584(var109, var110);
                arg0.method3407(class143.field2169 + " " + client.field241, var111 / 2 + var109, var112 / 2 + var110 - 2, 16777215, 0);
                if (Statics.field1748 == null) {
                    arg1.method3407(class143.field2412, var111 / 2 + var109, var112 / 2 + var110 + 12, 16777215, 0);
                } else {
                    arg1.method3407(class143.field2411, var111 / 2 + var109, var112 / 2 + var110 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var113 = Statics.field208.getGraphics();
            Statics.field2431.method1345(var113, 0, 0);
        } catch (Exception var116) {
            Statics.field208.repaint();
        }
    }

    @ObfuscatedName("r.h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method444(String arg0, String arg1, String arg2) {
        field653 = arg0;
        field636 = arg1;
        field662 = arg2;
    }

    @ObfuscatedName("i.l(Lbz;I)V")
    public static final void method434(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1812.length; var2++) {
            Statics.field1812[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1812[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1754[var8] = (Statics.field1812[var8 - 1] + Statics.field1812[var8 + 1] + Statics.field1812[var8 - 128] + Statics.field1812[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1812;
            Statics.field1812 = Statics.field1754;
            Statics.field1754 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1303; var11++) {
            for (int var12 = 0; var12 < arg0.field1302; var12++) {
                if (arg0.field1300[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1304;
                    int var14 = var11 + 16 + arg0.field1305;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1812[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("at.e(IIII)I")
    public static final int method802(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ba.u(Les;S)V")
    public static void method1335(class131 arg0) {
        if (class127.field2004 != 1 && Statics.field697 || class127.field2004 != 4) {
            return;
        }
        short var1 = 280;
        if (class127.field2013 >= var1 && class127.field2013 <= var1 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method1598(0, 0);
            return;
        }
        if (class127.field2013 >= var1 + 15 && class127.field2013 <= var1 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method1598(0, 1);
            return;
        }
        short var2 = 390;
        if (class127.field2013 >= var2 && class127.field2013 <= var2 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method1598(1, 0);
            return;
        }
        if (class127.field2013 >= var2 + 15 && class127.field2013 <= var2 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method1598(1, 1);
            return;
        }
        short var3 = 500;
        if (class127.field2013 >= var3 && class127.field2013 <= var3 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method1598(2, 0);
            return;
        }
        if (class127.field2013 >= var3 + 15 && class127.field2013 <= var3 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method1598(2, 1);
            return;
        }
        short var4 = 610;
        if (class127.field2013 >= var4 && class127.field2013 <= var4 + 14 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method1598(3, 0);
            return;
        }
        if (class127.field2013 >= var4 + 15 && class127.field2013 <= var4 + 80 && class127.field2015 >= 4 && class127.field2015 <= 18) {
            method1598(3, 1);
            return;
        }
        if (class127.field2013 >= 708 && class127.field2015 >= 4 && class127.field2013 <= 758 && class127.field2015 <= 20) {
            field664 = false;
            Statics.field635.method1487(0, 0);
            Statics.field632.method1487(382, 0);
            Statics.field667.method1584(382 - Statics.field667.field1302 / 2, 18);
            return;
        }
        if (field668 == -1) {
            return;
        }
        class22 var5 = Statics.field546[field668];
        method2359(var5);
        field664 = false;
        Statics.field635.method1487(0, 0);
        Statics.field632.method1487(382, 0);
        Statics.field667.method1584(382 - Statics.field667.field1302 / 2, 18);
        return;
    }

    @ObfuscatedName("ds.j(Lx;I)V")
    public static void method2359(class22 arg0) {
        if (arg0.method457() != client.field361) {
            client.field361 = arg0.method457();
            boolean var1 = arg0.method457();
            if (Statics.field1013 != var1) {
                class45.method821();
                Statics.field1013 = var1;
            }
        }
        Statics.field1747 = arg0.field565;
        client.field241 = arg0.field560;
        client.field423 = arg0.field561;
        Statics.field1944 = client.field384 == 0 ? 43594 : arg0.field560 + 40000;
        Statics.field2968 = client.field384 == 0 ? 443 : arg0.field560 + 50000;
        Statics.field204 = Statics.field1944;
    }

    @ObfuscatedName("x.c(I)V")
    public static void method460() {
        try {
            if (Statics.field1748 == null) {
                Statics.field1748 = new class17(Statics.field1752, new URL(Statics.field336));
            } else {
                byte[] var0 = Statics.field1748.method154();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field665 = var1.method2239();
                    Statics.field546 = new class22[field665];
                    int var2 = 0;
                    while (var2 < field665) {
                        class22 var3 = Statics.field546[var2] = new class22();
                        var3.field560 = var1.method2239();
                        var3.field561 = var1.method2143();
                        var3.field565 = var1.method2146();
                        var3.field564 = var1.method2146();
                        var3.field570 = var1.method2138();
                        var3.field562 = var1.method2283();
                        var3.field563 = var2++;
                    }
                    method2364(Statics.field546, 0, Statics.field546.length - 1, field666, field645);
                    field664 = true;
                    Statics.field1748 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1748 = null;
        }
    }

    @ObfuscatedName("bu.d(III)V")
    public static void method1598(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field666[var5] != arg0) {
                var2[var4] = field666[var5];
                var3[var4] = field645[var5];
                var4++;
            }
        }
        field666 = var2;
        field645 = var3;
        method2364(Statics.field546, 0, Statics.field546.length - 1, field666, field645);
    }

    @ObfuscatedName("dw.v([Lx;II[I[II)V")
    public static void method2364(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class22 var8 = arg0[var7];
        arg0[var7] = arg0[arg1];
        arg0[arg1] = var8;
        while (var5 < var6) {
            boolean var9 = true;
            do {
                var6--;
                for (int var10 = 0; var10 < 4; var10++) {
                    int var11;
                    int var12;
                    if (arg3[var10] == 2) {
                        var11 = arg0[var6].field563;
                        var12 = var8.field563;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field562;
                        var12 = var8.field562;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method457() ? 1 : 0;
                        var12 = var8.method457() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field560;
                        var12 = var8.field560;
                    }
                    if (var11 != var12) {
                        if ((arg4[var10] != 1 || var11 <= var12) && (arg4[var10] != 0 || var11 >= var12)) {
                            var9 = false;
                        }
                        break;
                    }
                    if (var10 == 3) {
                        var9 = false;
                    }
                }
            } while (var9);
            boolean var13 = true;
            do {
                var5++;
                for (int var14 = 0; var14 < 4; var14++) {
                    int var15;
                    int var16;
                    if (arg3[var14] == 2) {
                        var15 = arg0[var5].field563;
                        var16 = var8.field563;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field562;
                        var16 = var8.field562;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method457() ? 1 : 0;
                        var16 = var8.method457() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field560;
                        var16 = var8.field560;
                    }
                    if (var15 != var16) {
                        if ((arg4[var14] != 1 || var15 >= var16) && (arg4[var14] != 0 || var15 <= var16)) {
                            var13 = false;
                        }
                        break;
                    }
                    if (var14 == 3) {
                        var13 = false;
                    }
                }
            } while (var13);
            if (var5 < var6) {
                class22 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method2364(arg0, arg1, var6, arg3, arg4);
        method2364(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

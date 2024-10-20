package deob;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Graphics;
import java.awt.Desktop.Action;
import java.net.URI;
import java.net.URL;

@ObfuscatedName("ac")
public class class28 {

    @ObfuscatedName("ac.t")
    public static int[] field656 = new int[256];

    @ObfuscatedName("ac.v")
    public static int field667 = 0;

    @ObfuscatedName("ac.f")
    public static int field689 = 0;

    @ObfuscatedName("ac.ar")
    public static int field670 = 0;

    @ObfuscatedName("ac.ac")
    public static int field680 = 0;

    @ObfuscatedName("ac.ah")
    public static int field672 = 0;

    @ObfuscatedName("ac.ap")
    public static int field673 = 0;

    @ObfuscatedName("ac.aj")
    public static int field674 = 10;

    @ObfuscatedName("ac.as")
    public static String field675 = "";

    @ObfuscatedName("ac.aa")
    public static int field676 = 0;

    @ObfuscatedName("ac.am")
    public static String field658 = "";

    @ObfuscatedName("ac.ae")
    public static String field678 = "";

    @ObfuscatedName("ac.ai")
    public static String field679 = "";

    @ObfuscatedName("ac.ay")
    public static String field668 = "";

    @ObfuscatedName("ac.ax")
    public static String field681 = "";

    @ObfuscatedName("ac.au")
    public static class145 field682 = class145.field2430;

    @ObfuscatedName("ac.ag")
    public static boolean field684 = true;

    @ObfuscatedName("ac.ao")
    public static int field685 = 0;

    @ObfuscatedName("ac.aq")
    public static String field686 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ac.ak")
    public static String field687 = "1234567890";

    @ObfuscatedName("ac.at")
    public static boolean field688 = false;

    @ObfuscatedName("ac.bd")
    public static int field669 = 0;

    @ObfuscatedName("ac.bz")
    public static int[] field691 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ac.be")
    public static int[] field665 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ac.bc")
    public static int field693 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.g(Leo;Leo;I)I")
    public static int method2043(class147 arg0, class147 arg1) {
        int var2 = 0;
        if (arg0.method2735("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2735("logo", "")) {
            var2++;
        }
        if (arg1.method2735("titlebox", "")) {
            var2++;
        }
        if (arg1.method2735("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2735("runes", "")) {
            var2++;
        }
        if (arg1.method2735("title_mute", "")) {
            var2++;
        }
        if (arg1.method2731("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2731("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2735("sl_back", "");
        arg1.method2735("sl_flags", "");
        arg1.method2735("sl_arrows", "");
        arg1.method2735("sl_stars", "");
        arg1.method2735("sl_button", "");
        return var2;
    }

    @ObfuscatedName("p.i(I)I")
    public static int method490() {
        return 8;
    }

    @ObfuscatedName("o.k(Ljava/awt/Component;Leo;Leo;ZII)V")
    public static void method112(Component arg0, class147 arg1, class147 arg2, boolean arg3, int arg4) {
        if (!Statics.field659) {
            field676 = arg4;
            class73.method1490();
            byte[] var5 = arg1.method2732("title.jpg", "");
            Statics.field671 = new class72(var5, arg0);
            Statics.field131 = Statics.field671.method1393();
            Statics.field660 = Statics.method1571(arg2, "logo", "");
            Statics.field663 = Statics.method1571(arg2, "titlebox", "");
            Statics.field657 = Statics.method1571(arg2, "titlebutton", "");
            Statics.field692 = class70.method2655(arg2, "runes", "");
            Statics.field800 = class70.method2655(arg2, "title_mute", "");
            Statics.field1905 = Statics.method1571(arg2, "options_radio_buttons,0", "");
            Statics.field144 = Statics.method1571(arg2, "options_radio_buttons,2", "");
            Statics.field664 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field664[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field664[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field664[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field664[var9 + 192] = 16777215;
            }
            Statics.field690 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field690[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field690[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field690[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field690[var13 + 192] = 16777215;
            }
            Statics.field655 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field655[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field655[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field655[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field655[var17 + 192] = 16777215;
            }
            Statics.field2538 = new int[256];
            Statics.field1281 = new int[32768];
            Statics.field666 = new int[32768];
            method1345((class74) null);
            Statics.field562 = new int[32768];
            Statics.field1120 = new int[32768];
            if (arg3) {
                field668 = "";
                field681 = "";
            }
            Statics.field683 = 0;
            Statics.field194 = "";
            field684 = true;
            field688 = false;
            if (Statics.field1459.field141) {
                class162.method2508(2);
            } else {
                class148 var18 = Statics.field1684;
                int var19 = var18.method2699("scape main");
                int var20 = var18.method2700(var19, "");
                class162.field2729 = 1;
                Statics.field2726 = var18;
                Statics.field1247 = var19;
                Statics.field2731 = var20;
                Statics.field134 = 255;
                Statics.field2730 = false;
                Statics.field1063 = 2;
            }
            class151.method1851(false);
            Statics.field659 = true;
            Statics.field671.method1433(0, 0);
            Statics.field131.method1433(382, 0);
            Statics.field660.method1547(382 - Statics.field660.field1327 / 2, 18);
        } else if (arg4 == 4) {
            field676 = 4;
        }
    }

    @ObfuscatedName("dl.e(Lee;I)V")
    public static void method2495(class131 arg0) {
        if (!field688) {
            if ((class127.field2018 == 1 || !Statics.field235 && class127.field2018 == 4) && class127.field2017 >= 715 && class127.field2020 >= 453) {
                Statics.field1459.field141 = !Statics.field1459.field141;
                class9.method8();
                if (Statics.field1459.field141) {
                    Statics.field2473.method3024();
                    class162.field2729 = 1;
                    Statics.field2726 = null;
                } else {
                    class162.method2666(Statics.field1684, "scape main", "", 255, false);
                }
            }
            if (client.field267 != 5) {
                field672++;
                if (client.field267 == 10 || client.field267 == 11) {
                    if (client.field266 == 0) {
                        if (class127.field2018 == 1 || !Statics.field235 && class127.field2018 == 4) {
                            byte var6 = 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class127.field2017 >= var6 && class127.field2017 <= var6 + var8 && class127.field2020 >= var7 && class127.field2020 <= var7 + var9) {
                                method486();
                                return;
                            }
                        }
                        if (Statics.field1944 != null) {
                            method486();
                        }
                    }
                    int var10 = class127.field2018;
                    int var11 = class127.field2017;
                    int var12 = class127.field2020;
                    if (!Statics.field235 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field676 == 0) {
                        short var13 = 302;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            label590: {
                                String var15 = client.method712("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var15));
                                        break label590;
                                    } catch (Exception var34) {
                                    }
                                }
                                if (class125.field1994.startsWith("win")) {
                                    class125.method661(var15, 0);
                                } else if (class125.field1994.startsWith("mac")) {
                                    class125.method1950(var15, 1, "openjs");
                                } else {
                                    class125.method661(var15, 2);
                                }
                            }
                        }
                        short var17 = 462;
                        if (var10 == 1 && var11 >= var17 - 75 && var11 <= var17 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field259 & 0x4) != 0) {
                                if ((client.field259 & 0x400) == 0) {
                                    field658 = class143.field2385;
                                    field678 = class143.field2411;
                                    field679 = class143.field2387;
                                } else {
                                    field658 = class143.field2257;
                                    field678 = class143.field2392;
                                    field679 = class143.field2393;
                                }
                                field676 = 1;
                                field685 = 0;
                            } else if ((client.field259 & 0x400) == 0) {
                                field658 = class143.field2191;
                                field678 = class143.field2285;
                                field679 = class143.field2353;
                                field676 = 2;
                                field685 = 0;
                            } else {
                                field658 = class143.field2388;
                                field678 = class143.field2389;
                                field679 = class143.field2390;
                                field676 = 1;
                                field685 = 0;
                            }
                        }
                    } else if (field676 == 1) {
                        while (class124.method3()) {
                            if (Statics.field1935 == 84) {
                                field658 = class143.field2191;
                                field678 = class143.field2285;
                                field679 = class143.field2353;
                                field676 = 2;
                                field685 = 0;
                            } else if (Statics.field1935 == 13) {
                                field676 = 0;
                            }
                        }
                        short var18 = 302;
                        short var19 = 321;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var19 - 20 && var12 <= var19 + 20) {
                            field658 = class143.field2191;
                            field678 = class143.field2285;
                            field679 = class143.field2353;
                            field676 = 2;
                            field685 = 0;
                        }
                        short var20 = 462;
                        if (var10 == 1 && var11 >= var20 - 75 && var11 <= var20 + 75 && var12 >= var19 - 20 && var12 <= var19 + 20) {
                            field676 = 0;
                        }
                    } else if (field676 == 2) {
                        short var21 = 231;
                        int var36 = var21 + 30;
                        if (var10 == 1 && var12 >= var36 - 15 && var12 < var36) {
                            field685 = 0;
                        }
                        var36 += 15;
                        if (var10 == 1 && var12 >= var36 - 15 && var12 < var36) {
                            field685 = 1;
                        }
                        var36 += 15;
                        short var22 = 302;
                        short var23 = 321;
                        if (var10 == 1 && var11 >= var22 - 75 && var11 <= var22 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field668 = field668.trim();
                            if (field668.length() == 0) {
                                method1949(class143.field2290, class143.field2288, class143.field2289);
                                return;
                            }
                            if (field681.length() == 0) {
                                method1949(class143.field2331, class143.field2349, class143.field2292);
                                return;
                            }
                            method1949(class143.field2357, class143.field2185, class143.field2398);
                            field682 = Statics.field1459.field142.containsKey(class200.method1279(field668)) ? class145.field2435 : class145.field2430;
                            client.method2382(20);
                            return;
                        }
                        short var24 = 462;
                        if (var10 == 1 && var11 >= var24 - 75 && var11 <= var24 + 75 && var12 >= var23 - 20 && var12 <= var23 + 20) {
                            field676 = 0;
                            field668 = "";
                            field681 = "";
                            Statics.field683 = 0;
                            Statics.field194 = "";
                            field684 = true;
                        }
                        while (true) {
                            while (class124.method3()) {
                                boolean var25 = false;
                                for (int var26 = 0; var26 < field686.length(); var26++) {
                                    if (Statics.field1808 == field686.charAt(var26)) {
                                        var25 = true;
                                        break;
                                    }
                                }
                                if (Statics.field1935 == 13) {
                                    field676 = 0;
                                    field668 = "";
                                    field681 = "";
                                    Statics.field683 = 0;
                                    Statics.field194 = "";
                                    field684 = true;
                                } else if (field685 == 0) {
                                    if (Statics.field1935 == 85 && field668.length() > 0) {
                                        field668 = field668.substring(0, field668.length() - 1);
                                    }
                                    if (Statics.field1935 == 84 || Statics.field1935 == 80) {
                                        field685 = 1;
                                    }
                                    if (var25 && field668.length() < 320) {
                                        field668 = field668 + Statics.field1808;
                                    }
                                } else if (field685 == 1) {
                                    if (Statics.field1935 == 85 && field681.length() > 0) {
                                        field681 = field681.substring(0, field681.length() - 1);
                                    }
                                    if (Statics.field1935 == 84 || Statics.field1935 == 80) {
                                        field685 = 0;
                                    }
                                    if (Statics.field1935 == 84) {
                                        field668 = field668.trim();
                                        if (field668.length() == 0) {
                                            method1949(class143.field2290, class143.field2288, class143.field2289);
                                            return;
                                        }
                                        if (field681.length() == 0) {
                                            method1949(class143.field2331, class143.field2349, class143.field2292);
                                            return;
                                        }
                                        method1949(class143.field2357, class143.field2185, class143.field2398);
                                        field682 = Statics.field1459.field142.containsKey(class200.method1279(field668)) ? class145.field2435 : class145.field2430;
                                        client.method2382(20);
                                        return;
                                    }
                                    if (var25 && field681.length() < 20) {
                                        field681 = field681 + Statics.field1808;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field676 == 4) {
                        short var27 = 302;
                        short var28 = 321;
                        if (var10 == 1 && var11 >= var27 - 75 && var11 <= var27 + 75 && var12 >= var28 - 20 && var12 <= var28 + 20) {
                            Statics.field194.trim();
                            if (Statics.field194.length() != 6) {
                                method1949(class143.field2203, class143.field2399, class143.field2205);
                                return;
                            }
                            Statics.field683 = Integer.parseInt(Statics.field194);
                            Statics.field194 = "";
                            field682 = field684 ? class145.field2427 : class145.field2429;
                            method1949(class143.field2357, class143.field2185, class143.field2398);
                            client.method2382(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= 373 && var11 <= 512 && var12 >= 263 && var12 <= 296) {
                            field684 = !field684;
                        }
                        if (var10 == 1 && var11 >= 348 && var11 <= 416 && var12 >= 351 && var12 <= 363) {
                            label605: {
                                String var29 = client.method712("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
                                    try {
                                        Desktop.getDesktop().browse(new URI(var29));
                                        break label605;
                                    } catch (Exception var35) {
                                    }
                                }
                                if (class125.field1994.startsWith("win")) {
                                    class125.method661(var29, 0);
                                } else if (class125.field1994.startsWith("mac")) {
                                    class125.method1950(var29, 1, "openjs");
                                } else {
                                    class125.method661(var29, 2);
                                }
                            }
                        }
                        short var31 = 462;
                        if (var10 == 1 && var11 >= var31 - 75 && var11 <= var31 + 75 && var12 >= var28 - 20 && var12 <= var28 + 20) {
                            field676 = 0;
                            field668 = "";
                            field681 = "";
                            Statics.field683 = 0;
                            Statics.field194 = "";
                        }
                        while (class124.method3()) {
                            boolean var32 = false;
                            for (int var33 = 0; var33 < field687.length(); var33++) {
                                if (Statics.field1808 == field687.charAt(var33)) {
                                    var32 = true;
                                    break;
                                }
                            }
                            if (Statics.field1935 == 13) {
                                field676 = 0;
                                field668 = "";
                                field681 = "";
                                Statics.field683 = 0;
                                Statics.field194 = "";
                            } else {
                                if (Statics.field1935 == 85 && Statics.field194.length() > 0) {
                                    Statics.field194 = Statics.field194.substring(0, Statics.field194.length() - 1);
                                }
                                if (Statics.field1935 == 84) {
                                    Statics.field194.trim();
                                    if (Statics.field194.length() != 6) {
                                        method1949(class143.field2203, class143.field2399, class143.field2205);
                                        return;
                                    }
                                    Statics.field683 = Integer.parseInt(Statics.field194);
                                    Statics.field194 = "";
                                    field682 = field684 ? class145.field2427 : class145.field2429;
                                    method1949(class143.field2357, class143.field2185, class143.field2398);
                                    client.method2382(20);
                                    return;
                                }
                                if (var32 && Statics.field194.length() < 6) {
                                    Statics.field194 = Statics.field194 + Statics.field1808;
                                }
                            }
                        }
                    }
                }
            }
        } else if (class127.field2018 == 1 || !Statics.field235 && class127.field2018 == 4) {
            short var1 = 280;
            if (class127.field2017 >= var1 && class127.field2017 <= var1 + 14 && class127.field2020 >= 4 && class127.field2020 <= 18) {
                method137(0, 0);
            } else if (class127.field2017 >= var1 + 15 && class127.field2017 <= var1 + 80 && class127.field2020 >= 4 && class127.field2020 <= 18) {
                method137(0, 1);
            } else {
                short var2 = 390;
                if (class127.field2017 >= var2 && class127.field2017 <= var2 + 14 && class127.field2020 >= 4 && class127.field2020 <= 18) {
                    method137(1, 0);
                } else if (class127.field2017 >= var2 + 15 && class127.field2017 <= var2 + 80 && class127.field2020 >= 4 && class127.field2020 <= 18) {
                    method137(1, 1);
                } else {
                    short var3 = 500;
                    if (class127.field2017 >= var3 && class127.field2017 <= var3 + 14 && class127.field2020 >= 4 && class127.field2020 <= 18) {
                        method137(2, 0);
                    } else if (class127.field2017 >= var3 + 15 && class127.field2017 <= var3 + 80 && class127.field2020 >= 4 && class127.field2020 <= 18) {
                        method137(2, 1);
                    } else {
                        short var4 = 610;
                        if (class127.field2017 >= var4 && class127.field2017 <= var4 + 14 && class127.field2020 >= 4 && class127.field2020 <= 18) {
                            method137(3, 0);
                        } else if (class127.field2017 >= var4 + 15 && class127.field2017 <= var4 + 80 && class127.field2020 >= 4 && class127.field2020 <= 18) {
                            method137(3, 1);
                        } else if (class127.field2017 >= 708 && class127.field2020 >= 4 && class127.field2017 <= 758 && class127.field2020 <= 20) {
                            field688 = false;
                            Statics.field671.method1433(0, 0);
                            Statics.field131.method1433(382, 0);
                            Statics.field660.method1547(382 - Statics.field660.field1327 / 2, 18);
                        } else if (field693 != -1) {
                            class22 var5 = Statics.field694[field693];
                            method548(var5);
                            field688 = false;
                            Statics.field671.method1433(0, 0);
                            Statics.field131.method1433(382, 0);
                            Statics.field660.method1547(382 - Statics.field660.field1327 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("cv.w(Lge;Lge;I)V")
    public static void method1852(class194 arg0, class194 arg1) {
        if (field688) {
            if (Statics.field611 == null) {
                Statics.field611 = class70.method1848(Statics.field1517, "sl_back", "");
            }
            if (Statics.field523 == null) {
                Statics.field523 = class70.method2655(Statics.field1517, "sl_flags", "");
            }
            if (Statics.field859 == null) {
                Statics.field859 = class70.method2655(Statics.field1517, "sl_arrows", "");
            }
            if (Statics.field961 == null) {
                Statics.field961 = class70.method2655(Statics.field1517, "sl_stars", "");
            }
            class73.method1492(0, 23, 765, 480, 0);
            class73.method1493(0, 0, 125, 23, 12425273, 9135624);
            class73.method1493(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3393(class143.field2360, 62, 15, 0, -1);
            if (Statics.field961 != null) {
                Statics.field961[1].method1547(140, 1);
                arg1.method3361(class143.field2408, 152, 10, 16777215, -1);
                Statics.field961[0].method1547(140, 12);
                arg1.method3361(class143.field2409, 152, 21, 16777215, -1);
            }
            if (Statics.field859 != null) {
                short var2 = 280;
                if (field691[0] == 0 && field665[0] == 0) {
                    Statics.field859[2].method1547(var2, 4);
                } else {
                    Statics.field859[0].method1547(var2, 4);
                }
                if (field691[0] == 0 && field665[0] == 1) {
                    Statics.field859[3].method1547(var2 + 15, 4);
                } else {
                    Statics.field859[1].method1547(var2 + 15, 4);
                }
                arg0.method3361(class143.field2410, var2 + 32, 17, 16777215, -1);
                short var3 = 390;
                if (field691[0] == 1 && field665[0] == 0) {
                    Statics.field859[2].method1547(var3, 4);
                } else {
                    Statics.field859[0].method1547(var3, 4);
                }
                if (field691[0] == 1 && field665[0] == 1) {
                    Statics.field859[3].method1547(var3 + 15, 4);
                } else {
                    Statics.field859[1].method1547(var3 + 15, 4);
                }
                arg0.method3361(class143.field2381, var3 + 32, 17, 16777215, -1);
                short var4 = 500;
                if (field691[0] == 2 && field665[0] == 0) {
                    Statics.field859[2].method1547(var4, 4);
                } else {
                    Statics.field859[0].method1547(var4, 4);
                }
                if (field691[0] == 2 && field665[0] == 1) {
                    Statics.field859[3].method1547(var4 + 15, 4);
                } else {
                    Statics.field859[1].method1547(var4 + 15, 4);
                }
                arg0.method3361(class143.field2412, var4 + 32, 17, 16777215, -1);
                short var5 = 610;
                if (field691[0] == 3 && field665[0] == 0) {
                    Statics.field859[2].method1547(var5, 4);
                } else {
                    Statics.field859[0].method1547(var5, 4);
                }
                if (field691[0] == 3 && field665[0] == 1) {
                    Statics.field859[3].method1547(var5 + 15, 4);
                } else {
                    Statics.field859[1].method1547(var5 + 15, 4);
                }
                arg0.method3361(class143.field2303, var5 + 32, 17, 16777215, -1);
            }
            class73.method1492(708, 4, 50, 16, 0);
            arg1.method3393(class143.field2406, 733, 16, 16777215, -1);
            field693 = -1;
            if (Statics.field611 != null) {
                byte var6 = 88;
                byte var7 = 19;
                int var8 = 765 / (var6 + 1);
                int var9 = 480 / (var7 + 1);
                int var10;
                int var11;
                do {
                    var10 = var9;
                    var11 = var8;
                    if ((var8 - 1) * var9 >= field669) {
                        var8--;
                    }
                    if ((var9 - 1) * var8 >= field669) {
                        var9--;
                    }
                    if ((var9 - 1) * var8 >= field669) {
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
                for (int var20 = 0; var20 < field669; var20++) {
                    class22 var21 = Statics.field694[var20];
                    boolean var22 = true;
                    String var23 = Integer.toString(var21.field573);
                    if (var21.field573 == -1) {
                        var23 = class143.field2414;
                        var22 = false;
                    } else if (var21.field573 > 1980) {
                        var23 = class143.field2415;
                        var22 = false;
                    }
                    byte var24;
                    if (var21.method483()) {
                        if (var21.method488()) {
                            var24 = 3;
                        } else {
                            var24 = 2;
                        }
                    } else if (var21.method488()) {
                        var24 = 1;
                    } else {
                        var24 = 0;
                    }
                    if (class127.field2008 >= var17 && class127.field2013 >= var16 && class127.field2008 < var6 + var17 && class127.field2013 < var7 + var16 && var22) {
                        field693 = var20;
                        Statics.field611[var24].method1408(var17, var16, 128, 16777215);
                        var19 = true;
                    } else {
                        Statics.field611[var24].method1433(var17, var16);
                    }
                    if (Statics.field523 != null) {
                        Statics.field523[(var21.method488() ? 8 : 0) + var21.field582].method1547(var17 + 29, var16);
                    }
                    arg0.method3393(Integer.toString(var21.field578), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                    arg1.method3393(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                    var16 += var7 + var13;
                    var18++;
                    if (var18 >= var9) {
                        var16 = var15 + 23;
                        var17 += var6 + var12;
                        var18 = 0;
                    }
                }
                if (var19) {
                    int var25 = arg1.method3337(Statics.field694[field693].field577) + 6;
                    int var26 = arg1.field2930 + 8;
                    class73.method1492(class127.field2008 - var25 / 2, class127.field2013 + 20 + 5, var25, var26, 16777120);
                    class73.method1494(class127.field2008 - var25 / 2, class127.field2013 + 20 + 5, var25, var26, 0);
                    arg1.method3393(Statics.field694[field693].field577, class127.field2008, class127.field2013 + 20 + 5 + arg1.field2930 + 4, 0, -1);
                }
            }
            try {
                Graphics var27 = Statics.field1255.getGraphics();
                Statics.field1849.method1314(var27, 0, 0);
            } catch (Exception var112) {
                Statics.field1255.repaint();
            }
            return;
        }
        if (client.field267 == 0 || client.field267 == 5) {
            byte var29 = 20;
            arg0.method3393(class143.field2380, 382, 245 - var29, 16777215, -1);
            int var30 = 253 - var29;
            class73.method1494(230, var30, 304, 34, 9179409);
            class73.method1494(231, var30 + 1, 302, 32, 0);
            class73.method1492(232, var30 + 2, field674 * 3, 30, 9179409);
            class73.method1492(field674 * 3 + 232, var30 + 2, 300 - field674 * 3, 30, 0);
            arg0.method3393(field675, 382, 276 - var29, 16777215, -1);
        }
        if (client.field267 == 20) {
            Statics.field663.method1547(382 - Statics.field663.field1327 / 2, 271 - Statics.field663.field1325 / 2);
            short var31 = 211;
            arg0.method3393(field658, 382, var31, 16776960, 0);
            int var114 = var31 + 15;
            arg0.method3393(field678, 382, var114, 16776960, 0);
            int var115 = var114 + 15;
            arg0.method3393(field679, 382, var115, 16776960, 0);
            int var116 = var115 + 15;
            int var117 = var116 + 10;
            if (field676 != 4) {
                arg0.method3361(class143.field2317, 272, var117, 16777215, 0);
                short var32 = 200;
                String var33;
                for (var33 = field668; arg0.method3337(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                }
                arg0.method3361(class193.method3334(var33), 312, var117, 16777215, 0);
                var114 = var117 + 15;
                String var35 = class143.field2400;
                String var36 = field681;
                int var37 = var36.length();
                char[] var38 = new char[var37];
                for (int var39 = 0; var39 < var37; var39++) {
                    var38[var39] = '*';
                }
                String var40 = new String(var38);
                arg0.method3361(var35 + var40, 274, var114, 16777215, 0);
                var114 += 15;
            }
        }
        if (client.field267 == 10 || client.field267 == 11) {
            Statics.field663.method1547(202, 171);
            if (field676 == 0) {
                short var42 = 251;
                arg0.method3393(class143.field2397, 382, var42, 16776960, 0);
                int var118 = var42 + 30;
                short var43 = 302;
                short var44 = 291;
                Statics.field657.method1547(var43 - 73, var44 - 20);
                arg0.method3348(class143.field2403, var43 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var45 = 462;
                Statics.field657.method1547(var45 - 73, var44 - 20);
                arg0.method3348(class143.field2404, var45 - 73, var44 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field676 == 1) {
                arg0.method3393(class143.field2384, 382, 211, 16776960, 0);
                short var46 = 236;
                arg0.method3393(field658, 382, var46, 16777215, 0);
                int var119 = var46 + 15;
                arg0.method3393(field678, 382, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3393(field679, 382, var120, 16777215, 0);
                int var121 = var120 + 15;
                short var47 = 302;
                short var48 = 321;
                Statics.field657.method1547(var47 - 73, var48 - 20);
                arg0.method3393(class143.field2176, var47, var48 + 5, 16777215, 0);
                short var49 = 462;
                Statics.field657.method1547(var49 - 73, var48 - 20);
                arg0.method3393(class143.field2406, var49, var48 + 5, 16777215, 0);
            } else if (field676 == 2) {
                short var50 = 211;
                arg0.method3393(field658, 382, var50, 16776960, 0);
                int var122 = var50 + 15;
                arg0.method3393(field678, 382, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3393(field679, 382, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var125 = var124 + 10;
                arg0.method3361(class143.field2317, 272, var125, 16777215, 0);
                short var51 = 200;
                String var52;
                for (var52 = field668; arg0.method3337(var52) > var51; var52 = var52.substring(1)) {
                }
                arg0.method3361(class193.method3334(var52) + (field685 == 0 & client.field269 % 40 < 20 ? class2.method1850(16776960) + class2.field17 : ""), 312, var125, 16777215, 0);
                var122 = var125 + 15;
                String var54 = class143.field2400;
                String var55 = field681;
                int var56 = var55.length();
                char[] var57 = new char[var56];
                for (int var58 = 0; var58 < var56; var58++) {
                    var57[var58] = '*';
                }
                String var59 = new String(var57);
                arg0.method3361(var54 + var59 + (field685 == 1 & client.field269 % 40 < 20 ? class2.method1850(16776960) + class2.field17 : ""), 274, var122, 16777215, 0);
                var122 += 15;
                short var61 = 302;
                short var62 = 321;
                Statics.field657.method1547(var61 - 73, var62 - 20);
                arg0.method3393(class143.field2405, var61, var62 + 5, 16777215, 0);
                short var63 = 462;
                Statics.field657.method1547(var63 - 73, var62 - 20);
                arg0.method3393(class143.field2406, var63, var62 + 5, 16777215, 0);
            } else if (field676 == 4) {
                arg0.method3393(class143.field2394, 382, 211, 16776960, 0);
                short var64 = 236;
                arg0.method3393(field658, 382, var64, 16777215, 0);
                int var126 = var64 + 15;
                arg0.method3393(field678, 382, var126, 16777215, 0);
                int var127 = var126 + 15;
                arg0.method3393(field679, 382, var127, 16777215, 0);
                int var128 = var127 + 15;
                String var66 = class143.field2370;
                String var67 = Statics.field194;
                int var68 = var67.length();
                char[] var69 = new char[var68];
                for (int var70 = 0; var70 < var68; var70++) {
                    var69[var70] = '*';
                }
                String var71 = new String(var69);
                arg0.method3361(var66 + var71 + (client.field269 % 40 < 20 ? class2.method1850(16776960) + class2.field17 : ""), 274, var128, 16777215, 0);
                var126 = var128 - 8;
                arg0.method3361(class143.field2177, 373, var126, 16776960, 0);
                var126 += 15;
                arg0.method3361(class143.field2178, 373, var126, 16776960, 0);
                int var73 = 373 + arg0.method3337(class143.field2178) + 15;
                int var74 = var126 - arg0.field2930;
                class74 var75;
                if (field684) {
                    var75 = Statics.field144;
                } else {
                    var75 = Statics.field1905;
                }
                var75.method1547(var73, var74);
                var126 += 15;
                short var76 = 302;
                short var77 = 321;
                Statics.field657.method1547(var76 - 73, var77 - 20);
                arg0.method3393(class143.field2176, var76, var77 + 5, 16777215, 0);
                short var78 = 462;
                Statics.field657.method1547(var78 - 73, var77 - 20);
                arg0.method3393(class143.field2406, var78, var77 + 5, 16777215, 0);
                arg1.method3393(class143.field2199, 382, var77 + 36, 255, 0);
            }
        }
        if (field672 > 0) {
            int var79 = field672;
            short var80 = 256;
            field670 += var79 * 128;
            if (field670 > Statics.field1281.length) {
                field670 -= Statics.field1281.length;
                int var81 = (int) (Math.random() * 12.0D);
                method1345(Statics.field692[var81]);
            }
            int var82 = 0;
            int var83 = var79 * 128;
            int var84 = (var80 - var79) * 128;
            for (int var85 = 0; var85 < var84; var85++) {
                int var86 = Statics.field562[var82 + var83] - Statics.field1281[field670 + var82 & Statics.field1281.length - 1] * var79 / 6;
                if (var86 < 0) {
                    var86 = 0;
                }
                Statics.field562[var82++] = var86;
            }
            for (int var87 = var80 - var79; var87 < var80; var87++) {
                int var88 = var87 * 128;
                for (int var89 = 0; var89 < 128; var89++) {
                    int var90 = (int) (Math.random() * 100.0D);
                    if (var90 < 50 && var89 > 10 && var89 < 118) {
                        Statics.field562[var88 + var89] = 255;
                    } else {
                        Statics.field562[var88 + var89] = 0;
                    }
                }
            }
            if (field667 > 0) {
                field667 -= var79 * 4;
            }
            if (field689 > 0) {
                field689 -= var79 * 4;
            }
            if (field667 == 0 && field689 == 0) {
                int var91 = (int) (Math.random() * (double) (2000 / var79));
                if (var91 == 0) {
                    field667 = 1024;
                }
                if (var91 == 1) {
                    field689 = 1024;
                }
            }
            for (int var92 = 0; var92 < var80 - var79; var92++) {
                field656[var92] = field656[var79 + var92];
            }
            for (int var93 = var80 - var79; var93 < var80; var93++) {
                field656[var93] = (int) (Math.sin((double) field673 / 14.0D) * 16.0D + Math.sin((double) field673 / 15.0D) * 14.0D + Math.sin((double) field673 / 16.0D) * 12.0D);
                field673++;
            }
            field680 += var79 * -449567495;
            int var94 = ((client.field269 & 0x1) + var79) / 2;
            if (var94 > 0) {
                for (int var95 = 0; var95 < field680 * 1953525892; var95++) {
                    int var96 = (int) (Math.random() * 124.0D) + 2;
                    int var97 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field562[(var97 << 7) + var96] = 192;
                }
                field680 = 0;
                int var98 = 0;
                label409: while (true) {
                    if (var98 >= var80) {
                        int var102 = 0;
                        while (true) {
                            if (var102 >= 128) {
                                break label409;
                            }
                            int var103 = 0;
                            for (int var104 = -var94; var104 < var80; var104++) {
                                int var105 = var104 * 128;
                                if (var94 + var104 < var80) {
                                    var103 += Statics.field1120[var94 * 128 + var102 + var105];
                                }
                                if (var104 - (var94 + 1) >= 0) {
                                    var103 -= Statics.field1120[var102 + var105 - (var94 + 1) * 128];
                                }
                                if (var104 >= 0) {
                                    Statics.field562[var102 + var105] = var103 / (var94 * 2 + 1);
                                }
                            }
                            var102++;
                        }
                    }
                    int var99 = 0;
                    int var100 = var98 * 128;
                    for (int var101 = -var94; var101 < 128; var101++) {
                        if (var94 + var101 < 128) {
                            var99 += Statics.field562[var100 + var101 + var94];
                        }
                        if (var101 - (var94 + 1) >= 0) {
                            var99 -= Statics.field562[var100 + var101 - (var94 + 1)];
                        }
                        if (var101 >= 0) {
                            Statics.field1120[var100 + var101] = var99 / (var94 * 2 + 1);
                        }
                    }
                    var98++;
                }
            }
            field672 = 0;
        }
        method100();
        Statics.field800[Statics.field1459.field141 ? 1 : 0].method1547(725, 463);
        if (client.field267 > 5 && client.field266 == 0) {
            if (Statics.field643 == null) {
                Statics.field643 = Statics.method1571(Statics.field1517, "sl_button", "");
            } else {
                byte var106 = 5;
                short var107 = 463;
                byte var108 = 100;
                byte var109 = 35;
                Statics.field643.method1547(var106, var107);
                arg0.method3393(class143.field2209 + " " + client.field258, var108 / 2 + var106, var109 / 2 + var107 - 2, 16777215, 0);
                if (Statics.field1944 == null) {
                    arg1.method3393(class143.field2417, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                } else {
                    arg1.method3393(class143.field2416, var108 / 2 + var106, var109 / 2 + var107 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var110 = Statics.field1255.getGraphics();
            Statics.field1849.method1314(var110, 0, 0);
        } catch (Exception var113) {
            Statics.field1255.repaint();
        }
    }

    @ObfuscatedName("ch.m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1949(String arg0, String arg1, String arg2) {
        field658 = arg0;
        field678 = arg1;
        field679 = arg2;
    }

    @ObfuscatedName("bh.u(Lbr;I)V")
    public static final void method1345(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1281.length; var2++) {
            Statics.field1281[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1281[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field666[var8] = (Statics.field1281[var8 - 1] + Statics.field1281[var8 + 1] + Statics.field1281[var8 - 128] + Statics.field1281[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1281;
            Statics.field1281 = Statics.field666;
            Statics.field666 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1325; var11++) {
            for (int var12 = 0; var12 < arg0.field1327; var12++) {
                if (arg0.field1329[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1326;
                    int var14 = var11 + 16 + arg0.field1330;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1281[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("j.o(I)V")
    public static final void method100() {
        short var0 = 256;
        if (field667 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field667 > 768) {
                    Statics.field2538[var1] = Statics.method1(Statics.field664[var1], Statics.field690[var1], 1024 - field667);
                } else if (field667 > 256) {
                    Statics.field2538[var1] = Statics.field690[var1];
                } else {
                    Statics.field2538[var1] = Statics.method1(Statics.field690[var1], Statics.field664[var1], 256 - field667);
                }
            }
        } else if (field689 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field689 > 768) {
                    Statics.field2538[var2] = Statics.method1(Statics.field664[var2], Statics.field655[var2], 1024 - field689);
                } else if (field689 > 256) {
                    Statics.field2538[var2] = Statics.field655[var2];
                } else {
                    Statics.field2538[var2] = Statics.method1(Statics.field655[var2], Statics.field664[var2], 256 - field689);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2538[var3] = Statics.field664[var3];
            }
        }
        class73.method1486(0, 9, 128, var0 + 7);
        Statics.field671.method1433(0, 0);
        class73.method1485();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field656[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field562[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2538[var10];
                    int var14 = Statics.field1849.field1299[var5];
                    Statics.field1849.field1299[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class73.method1486(637, 9, 765, var0 + 7);
        Statics.field131.method1433(382, 0);
        class73.method1485();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field656[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field562[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2538[var22];
                    int var26 = Statics.field1849.field1299[var20];
                    Statics.field1849.field1299[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ac.h(Lf;I)V")
    public static void method548(class22 arg0) {
        if (arg0.method488() != client.field264) {
            client.field264 = arg0.method488();
            class45.method600(arg0.method488());
        }
        Statics.field1062 = arg0.field576;
        client.field258 = arg0.field578;
        client.field259 = arg0.field574;
        Statics.field2828 = client.field396 == 0 ? 43594 : arg0.field578 + 40000;
        Statics.field68 = client.field396 == 0 ? 443 : arg0.field578 + 50000;
        Statics.field1280 = Statics.field2828;
    }

    @ObfuscatedName("f.b(B)V")
    public static void method486() {
        try {
            if (Statics.field1944 == null) {
                Statics.field1944 = new class17(Statics.field1064, new URL(Statics.field2517));
            } else {
                byte[] var0 = Statics.field1944.method163();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field669 = var1.method2094();
                    Statics.field694 = new class22[field669];
                    int var2 = 0;
                    while (var2 < field669) {
                        class22 var3 = Statics.field694[var2] = new class22();
                        var3.field578 = var1.method2094();
                        var3.field574 = var1.method2112();
                        var3.field576 = var1.method2251();
                        var3.field577 = var1.method2251();
                        var3.field582 = var1.method2092();
                        var3.field573 = var1.method2099();
                        var3.field580 = var2++;
                    }
                    method154(Statics.field694, 0, Statics.field694.length - 1, field691, field665);
                    field688 = true;
                    Statics.field1944 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1944 = null;
        }
    }

    @ObfuscatedName("r.r(III)V")
    public static void method137(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field691[var5] != arg0) {
                var2[var4] = field691[var5];
                var3[var4] = field665[var5];
                var4++;
            }
        }
        field691 = var2;
        field665 = var3;
        method154(Statics.field694, 0, Statics.field694.length - 1, field691, field665);
    }

    @ObfuscatedName("q.l([Lf;II[I[IB)V")
    public static void method154(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field580;
                        var12 = var8.field580;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field573;
                        var12 = var8.field573;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method488() ? 1 : 0;
                        var12 = var8.method488() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field578;
                        var12 = var8.field578;
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
                        var15 = arg0[var5].field580;
                        var16 = var8.field580;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field573;
                        var16 = var8.field573;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method488() ? 1 : 0;
                        var16 = var8.method488() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field578;
                        var16 = var8.field578;
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
        method154(arg0, arg1, var6, arg3, arg4);
        method154(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

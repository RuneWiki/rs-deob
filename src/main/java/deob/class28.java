package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ak")
public class class28 {

    @ObfuscatedName("ak.t")
    public static int[] field683 = new int[256];

    @ObfuscatedName("ak.e")
    public static int field653 = 0;

    @ObfuscatedName("ak.a")
    public static int field654 = 0;

    @ObfuscatedName("ak.aa")
    public static int field656 = 0;

    @ObfuscatedName("ak.ak")
    public static int field657 = 0;

    @ObfuscatedName("ak.al")
    public static int field672 = 0;

    @ObfuscatedName("ak.aw")
    public static int field659 = 0;

    @ObfuscatedName("ak.ai")
    public static int field664 = 10;

    @ObfuscatedName("ak.av")
    public static String field661 = "";

    @ObfuscatedName("ak.an")
    public static int field662 = 0;

    @ObfuscatedName("ak.aq")
    public static String field666 = "";

    @ObfuscatedName("ak.aj")
    public static String field648 = "";

    @ObfuscatedName("ak.az")
    public static String field682 = "";

    @ObfuscatedName("ak.ax")
    public static String field647 = "";

    @ObfuscatedName("ak.ap")
    public static String field667 = "";

    @ObfuscatedName("ak.ar")
    public static class144 field680 = class144.field2405;

    @ObfuscatedName("ak.as")
    public static boolean field660 = true;

    @ObfuscatedName("ak.ad")
    public static int field671 = 0;

    @ObfuscatedName("ak.af")
    public static String field668 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ak.ab")
    public static String field673 = "1234567890";

    @ObfuscatedName("ak.ag")
    public static boolean field681 = false;

    @ObfuscatedName("ak.bf")
    public static int field676 = 0;

    @ObfuscatedName("ak.bz")
    public static int[] field679 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ak.bq")
    public static int[] field644 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ak.bu")
    public static int field651 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.k(Lee;Lee;B)I")
    public static int method695(class146 arg0, class146 arg1) {
        int var2 = 0;
        if (arg0.method2750("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2750("logo", "")) {
            var2++;
        }
        if (arg1.method2750("titlebox", "")) {
            var2++;
        }
        if (arg1.method2750("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2750("runes", "")) {
            var2++;
        }
        if (arg1.method2750("title_mute", "")) {
            var2++;
        }
        if (arg1.method2697("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2697("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2750("sl_back", "");
        arg1.method2750("sl_flags", "");
        arg1.method2750("sl_arrows", "");
        arg1.method2750("sl_stars", "");
        arg1.method2750("sl_button", "");
        return var2;
    }

    @ObfuscatedName("ez.r(B)I")
    public static int method2643() {
        return 8;
    }

    @ObfuscatedName("b.y(Ljava/awt/Component;Lee;Lee;ZIB)V")
    public static void method108(Component arg0, class146 arg1, class146 arg2, boolean arg3, int arg4) {
        if (!Statics.field658) {
            field662 = arg4;
            class73.method1524();
            byte[] var5 = arg1.method2695("title.jpg", "");
            Statics.field645 = new class72(var5, arg0);
            Statics.field646 = Statics.field645.method1439();
            Statics.field1934 = class70.method519(arg2, "logo", "");
            Statics.field642 = class70.method519(arg2, "titlebox", "");
            Statics.field643 = class70.method519(arg2, "titlebutton", "");
            Statics.field641 = class70.method566(arg2, "runes", "");
            Statics.field663 = class70.method566(arg2, "title_mute", "");
            Statics.field638 = class70.method519(arg2, "options_radio_buttons,0", "");
            Statics.field650 = class70.method519(arg2, "options_radio_buttons,2", "");
            Statics.field1911 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1911[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1911[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1911[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1911[var9 + 192] = 16777215;
            }
            Statics.field1962 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1962[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1962[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1962[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1962[var13 + 192] = 16777215;
            }
            Statics.field652 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field652[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field652[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field652[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field652[var17 + 192] = 16777215;
            }
            Statics.field2128 = new int[256];
            Statics.field655 = new int[32768];
            Statics.field161 = new int[32768];
            method3126((class74) null);
            Statics.field53 = new int[32768];
            Statics.field2660 = new int[32768];
            if (arg3) {
                field647 = "";
                field667 = "";
            }
            Statics.field669 = 0;
            Statics.field1866 = "";
            field660 = true;
            field681 = false;
            if (Statics.field1087.field137) {
                class161.method2819(2);
            } else {
                class147 var18 = Statics.field2112;
                int var19 = var18.method2738("scape main");
                int var20 = var18.method2694(var19, "");
                class161.method2805(2, var18, var19, var20, 255, false);
            }
            class150.method2662(false);
            Statics.field658 = true;
            Statics.field645.method1444(0, 0);
            Statics.field646.method1444(382, 0);
            Statics.field1934.method1576(382 - Statics.field1934.field1317 / 2, 18);
        } else if (arg4 == 4) {
            field662 = 4;
        }
    }

    @ObfuscatedName("x.w(Ler;S)V")
    public static void method112(class131 arg0) {
        if (field681) {
            method152(arg0);
            return;
        }
        if ((class127.field2017 == 1 || !Statics.field1294 && class127.field2017 == 4) && class127.field2014 >= 715 && class127.field2019 >= 453) {
            Statics.field1087.field137 = !Statics.field1087.field137;
            class9.method2790();
            if (Statics.field1087.field137) {
                Statics.method413();
            } else {
                class147 var1 = Statics.field2112;
                int var2 = var1.method2738("scape main");
                int var3 = var1.method2694(var2, "");
                class161.method839(var1, var2, var3, 255, false);
            }
        }
        if (client.field259 == 5) {
            return;
        }
        field672++;
        if (client.field259 != 10 && client.field259 != 11) {
            return;
        }
        if (client.field258 == 0) {
            if (class127.field2017 == 1 || !Statics.field1294 && class127.field2017 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class127.field2014 >= var4 && class127.field2014 <= var4 + var6 && class127.field2019 >= var5 && class127.field2019 <= var5 + var7) {
                    method514();
                    return;
                }
            }
            if (Statics.field634 != null) {
                method514();
            }
        }
        int var8 = class127.field2017;
        int var9 = class127.field2014;
        int var10 = class127.field2019;
        if (!Statics.field1294 && var8 == 4) {
            var8 = 1;
        }
        if (field662 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                String var13 = client.method451("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class125.method769(var13, true, "openjs", false);
            }
            short var14 = 462;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field309 & 0x4) != 0) {
                    if ((client.field309 & 0x400) == 0) {
                        field666 = class142.field2363;
                        field648 = class142.field2165;
                        field682 = class142.field2201;
                    } else {
                        field666 = class142.field2369;
                        field648 = class142.field2298;
                        field682 = class142.field2371;
                    }
                    field662 = 1;
                    field671 = 0;
                } else if ((client.field309 & 0x400) == 0) {
                    field666 = class142.field2293;
                    field648 = class142.field2184;
                    field682 = class142.field2353;
                    field662 = 2;
                    field671 = 0;
                } else {
                    field666 = class142.field2169;
                    field648 = class142.field2367;
                    field682 = class142.field2368;
                    field662 = 1;
                    field671 = 0;
                }
            }
        } else if (field662 == 1) {
            while (class124.method438()) {
                if (Statics.field578 == 84) {
                    field666 = class142.field2293;
                    field648 = class142.field2184;
                    field682 = class142.field2353;
                    field662 = 2;
                    field671 = 0;
                } else if (Statics.field578 == 13) {
                    field662 = 0;
                }
            }
            short var15 = 302;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field666 = class142.field2293;
                field648 = class142.field2184;
                field682 = class142.field2353;
                field662 = 2;
                field671 = 0;
            }
            short var17 = 462;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field662 = 0;
            }
        } else if (field662 == 2) {
            short var18 = 231;
            int var30 = var18 + 30;
            if (var8 == 1 && var10 >= var30 - 15 && var10 < var30) {
                field671 = 0;
            }
            var30 += 15;
            if (var8 == 1 && var10 >= var30 - 15 && var10 < var30) {
                field671 = 1;
            }
            var30 += 15;
            short var19 = 302;
            short var20 = 321;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field647 = field647.trim();
                if (field647.length() == 0) {
                    method1851(class142.field2265, class142.field2266, class142.field2373);
                    return;
                }
                if (field667.length() == 0) {
                    method1851(class142.field2268, class142.field2204, class142.field2270);
                    return;
                }
                method1851(class142.field2362, class142.field2375, class142.field2376);
                field680 = Statics.field1087.field139.containsKey(class199.method2480(field647)) ? class144.field2407 : class144.field2405;
                client.method762(20);
                return;
            }
            short var21 = 462;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field662 = 0;
                field647 = "";
                field667 = "";
                Statics.field669 = 0;
                Statics.field1866 = "";
                field660 = true;
            }
            while (true) {
                while (class124.method438()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < field668.length(); var23++) {
                        if (Statics.field1536 == field668.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (Statics.field578 == 13) {
                        field662 = 0;
                        field647 = "";
                        field667 = "";
                        Statics.field669 = 0;
                        Statics.field1866 = "";
                        field660 = true;
                    } else if (field671 == 0) {
                        if (Statics.field578 == 85 && field647.length() > 0) {
                            field647 = field647.substring(0, field647.length() - 1);
                        }
                        if (Statics.field578 == 84 || Statics.field578 == 80) {
                            field671 = 1;
                        }
                        if (var22 && field647.length() < 320) {
                            field647 = field647 + Statics.field1536;
                        }
                    } else if (field671 == 1) {
                        if (Statics.field578 == 85 && field667.length() > 0) {
                            field667 = field667.substring(0, field667.length() - 1);
                        }
                        if (Statics.field578 == 84 || Statics.field578 == 80) {
                            field671 = 0;
                        }
                        if (Statics.field578 == 84) {
                            field647 = field647.trim();
                            if (field647.length() == 0) {
                                method1851(class142.field2265, class142.field2266, class142.field2373);
                                return;
                            }
                            if (field667.length() == 0) {
                                method1851(class142.field2268, class142.field2204, class142.field2270);
                                return;
                            }
                            method1851(class142.field2362, class142.field2375, class142.field2376);
                            field680 = Statics.field1087.field139.containsKey(class199.method2480(field647)) ? class144.field2407 : class144.field2405;
                            client.method762(20);
                            return;
                        }
                        if (var22 && field667.length() < 20) {
                            field667 = field667 + Statics.field1536;
                        }
                    }
                }
                return;
            }
        } else if (field662 == 4) {
            short var24 = 302;
            short var25 = 321;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                Statics.field1866.trim();
                if (Statics.field1866.length() != 6) {
                    method1851(class142.field2243, class142.field2182, class142.field2183);
                    return;
                }
                Statics.field669 = Integer.parseInt(Statics.field1866);
                Statics.field1866 = "";
                field680 = field660 ? class144.field2406 : class144.field2408;
                method1851(class142.field2362, class142.field2375, class142.field2376);
                client.method762(20);
                return;
            }
            if (var8 == 1 && var9 >= 373 && var9 <= 512 && var10 >= 263 && var10 <= 296) {
                field660 = !field660;
            }
            if (var8 == 1 && var9 >= 348 && var9 <= 416 && var10 >= 351 && var10 <= 363) {
                String var26 = client.method451("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class125.method769(var26, true, "openjs", false);
            }
            short var27 = 462;
            if (var8 == 1 && var9 >= var27 - 75 && var9 <= var27 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                field662 = 0;
                field647 = "";
                field667 = "";
                Statics.field669 = 0;
                Statics.field1866 = "";
            }
            while (class124.method438()) {
                boolean var28 = false;
                for (int var29 = 0; var29 < field673.length(); var29++) {
                    if (Statics.field1536 == field673.charAt(var29)) {
                        var28 = true;
                        break;
                    }
                }
                if (Statics.field578 == 13) {
                    field662 = 0;
                    field647 = "";
                    field667 = "";
                    Statics.field669 = 0;
                    Statics.field1866 = "";
                } else {
                    if (Statics.field578 == 85 && Statics.field1866.length() > 0) {
                        Statics.field1866 = Statics.field1866.substring(0, Statics.field1866.length() - 1);
                    }
                    if (Statics.field578 == 84) {
                        Statics.field1866.trim();
                        if (Statics.field1866.length() != 6) {
                            method1851(class142.field2243, class142.field2182, class142.field2183);
                            return;
                        }
                        Statics.field669 = Integer.parseInt(Statics.field1866);
                        Statics.field1866 = "";
                        field680 = field660 ? class144.field2406 : class144.field2408;
                        method1851(class142.field2362, class142.field2375, class142.field2376);
                        client.method762(20);
                        return;
                    }
                    if (var28 && Statics.field1866.length() < 6) {
                        Statics.field1866 = Statics.field1866 + Statics.field1536;
                    }
                }
            }
        }
    }

    @ObfuscatedName("cm.m(Lgl;Lgl;I)V")
    public static void method1969(class193 arg0, class193 arg1) {
        if (!field681) {
            if (client.field259 == 0 || client.field259 == 5) {
                byte var29 = 20;
                arg0.method3323(class142.field2358, 382, 245 - var29, 16777215, -1);
                int var30 = 253 - var29;
                class73.method1544(230, var30, 304, 34, 9179409);
                class73.method1544(231, var30 + 1, 302, 32, 0);
                class73.method1527(232, var30 + 2, field664 * 3, 30, 9179409);
                class73.method1527(field664 * 3 + 232, var30 + 2, 300 - field664 * 3, 30, 0);
                arg0.method3323(field661, 382, 276 - var29, 16777215, -1);
            }
            if (client.field259 == 20) {
                Statics.field642.method1576(382 - Statics.field642.field1317 / 2, 271 - Statics.field642.field1320 / 2);
                short var31 = 211;
                arg0.method3323(field666, 382, var31, 16776960, 0);
                int var63 = var31 + 15;
                arg0.method3323(field648, 382, var63, 16776960, 0);
                int var64 = var63 + 15;
                arg0.method3323(field682, 382, var64, 16776960, 0);
                int var65 = var64 + 15;
                int var66 = var65 + 10;
                if (field662 != 4) {
                    arg0.method3321(class142.field2377, 272, var66, 16777215, 0);
                    short var32 = 200;
                    String var33;
                    for (var33 = field647; arg0.method3375(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                    }
                    arg0.method3321(class192.method3354(var33), 312, var66, 16777215, 0);
                    var63 = var66 + 15;
                    arg0.method3321(class142.field2378 + class199.method2423(field667), 274, var63, 16777215, 0);
                    var63 += 15;
                }
            }
            if (client.field259 == 10 || client.field259 == 11) {
                Statics.field642.method1576(202, 171);
                if (field662 == 0) {
                    short var34 = 251;
                    arg0.method3323(class142.field2380, 382, var34, 16776960, 0);
                    int var67 = var34 + 30;
                    short var35 = 302;
                    short var36 = 291;
                    Statics.field643.method1576(var35 - 73, var36 - 20);
                    arg0.method3352(class142.field2381, var35 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var37 = 462;
                    Statics.field643.method1576(var37 - 73, var36 - 20);
                    arg0.method3352(class142.field2355, var37 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (field662 == 1) {
                    arg0.method3323(class142.field2389, 382, 211, 16776960, 0);
                    short var38 = 236;
                    arg0.method3323(field666, 382, var38, 16777215, 0);
                    int var68 = var38 + 15;
                    arg0.method3323(field648, 382, var68, 16777215, 0);
                    int var69 = var68 + 15;
                    arg0.method3323(field682, 382, var69, 16777215, 0);
                    int var70 = var69 + 15;
                    short var39 = 302;
                    short var40 = 321;
                    Statics.field643.method1576(var39 - 73, var40 - 20);
                    arg0.method3323(class142.field2232, var39, var40 + 5, 16777215, 0);
                    short var41 = 462;
                    Statics.field643.method1576(var41 - 73, var40 - 20);
                    arg0.method3323(class142.field2284, var41, var40 + 5, 16777215, 0);
                } else if (field662 == 2) {
                    short var42 = 211;
                    arg0.method3323(field666, 382, var42, 16776960, 0);
                    int var71 = var42 + 15;
                    arg0.method3323(field648, 382, var71, 16776960, 0);
                    int var72 = var71 + 15;
                    arg0.method3323(field682, 382, var72, 16776960, 0);
                    int var73 = var72 + 15;
                    int var74 = var73 + 10;
                    arg0.method3321(class142.field2377, 272, var74, 16777215, 0);
                    short var43 = 200;
                    String var44;
                    for (var44 = field647; arg0.method3375(var44) > var43; var44 = var44.substring(1)) {
                    }
                    arg0.method3321(class192.method3354(var44) + (field671 == 0 & client.field261 % 40 < 20 ? class2.method3305(16776960) + class2.field18 : ""), 312, var74, 16777215, 0);
                    var71 = var74 + 15;
                    arg0.method3321(class142.field2378 + class199.method2423(field667) + (field671 == 1 & client.field261 % 40 < 20 ? class2.method3305(16776960) + class2.field18 : ""), 274, var71, 16777215, 0);
                    var71 += 15;
                    short var45 = 302;
                    short var46 = 321;
                    Statics.field643.method1576(var45 - 73, var46 - 20);
                    arg0.method3323(class142.field2383, var45, var46 + 5, 16777215, 0);
                    short var47 = 462;
                    Statics.field643.method1576(var47 - 73, var46 - 20);
                    arg0.method3323(class142.field2284, var47, var46 + 5, 16777215, 0);
                } else if (field662 == 4) {
                    arg0.method3323(class142.field2250, 382, 211, 16776960, 0);
                    short var48 = 236;
                    arg0.method3323(field666, 382, var48, 16777215, 0);
                    int var75 = var48 + 15;
                    arg0.method3323(field648, 382, var75, 16777215, 0);
                    int var76 = var75 + 15;
                    arg0.method3323(field682, 382, var76, 16777215, 0);
                    int var77 = var76 + 15;
                    arg0.method3321(class142.field2245 + class199.method2423(Statics.field1866) + (client.field261 % 40 < 20 ? class2.method3305(16776960) + class2.field18 : ""), 274, var77, 16777215, 0);
                    int var78 = var77 - 8;
                    arg0.method3321(class142.field2155, 373, var78, 16776960, 0);
                    int var79 = var78 + 15;
                    arg0.method3321(class142.field2156, 373, var79, 16776960, 0);
                    int var49 = 373 + arg0.method3375(class142.field2156) + 15;
                    int var50 = var79 - arg0.field2919;
                    class74 var51;
                    if (field660) {
                        var51 = Statics.field650;
                    } else {
                        var51 = Statics.field638;
                    }
                    var51.method1576(var49, var50);
                    var75 = var79 + 15;
                    short var52 = 302;
                    short var53 = 321;
                    Statics.field643.method1576(var52 - 73, var53 - 20);
                    arg0.method3323(class142.field2232, var52, var53 + 5, 16777215, 0);
                    short var54 = 462;
                    Statics.field643.method1576(var54 - 73, var53 - 20);
                    arg0.method3323(class142.field2284, var54, var53 + 5, 16777215, 0);
                    arg1.method3323(class142.field2332, 382, var53 + 36, 255, 0);
                }
            }
            if (field672 > 0) {
                method104(field672);
                field672 = 0;
            }
            method455();
            Statics.field663[Statics.field1087.field137 ? 1 : 0].method1576(725, 463);
            if (client.field259 > 5 && client.field258 == 0) {
                if (Statics.field77 == null) {
                    Statics.field77 = class70.method519(Statics.field216, "sl_button", "");
                } else {
                    byte var55 = 5;
                    short var56 = 463;
                    byte var57 = 100;
                    byte var58 = 35;
                    Statics.field77.method1576(var55, var56);
                    arg0.method3323(class142.field2313 + " " + client.field253, var57 / 2 + var55, var58 / 2 + var56 - 2, 16777215, 0);
                    if (Statics.field634 == null) {
                        arg1.method3323(class142.field2211, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                    } else {
                        arg1.method3323(class142.field2394, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                    }
                }
            }
            try {
                Graphics var59 = Statics.field1589.getGraphics();
                Statics.field582.method1365(var59, 0, 0);
            } catch (Exception var62) {
                Statics.field1589.repaint();
            }
            return;
        }
        if (Statics.field564 == null) {
            Statics.field564 = class70.method834(Statics.field216, "sl_back", "");
        }
        if (Statics.field675 == null) {
            Statics.field675 = class70.method566(Statics.field216, "sl_flags", "");
        }
        if (Statics.field612 == null) {
            Statics.field612 = class70.method566(Statics.field216, "sl_arrows", "");
        }
        if (Statics.field2030 == null) {
            Statics.field2030 = class70.method566(Statics.field216, "sl_stars", "");
        }
        class73.method1527(0, 23, 765, 480, 0);
        class73.method1556(0, 0, 125, 23, 12425273, 9135624);
        class73.method1556(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3323(class142.field2252, 62, 15, 0, -1);
        if (Statics.field2030 != null) {
            Statics.field2030[1].method1576(140, 1);
            arg1.method3321(class142.field2395, 152, 10, 16777215, -1);
            Statics.field2030[0].method1576(140, 12);
            arg1.method3321(class142.field2387, 152, 21, 16777215, -1);
        }
        if (Statics.field612 != null) {
            short var2 = 280;
            if (field679[0] == 0 && field644[0] == 0) {
                Statics.field612[2].method1576(var2, 4);
            } else {
                Statics.field612[0].method1576(var2, 4);
            }
            if (field679[0] == 0 && field644[0] == 1) {
                Statics.field612[3].method1576(var2 + 15, 4);
            } else {
                Statics.field612[1].method1576(var2 + 15, 4);
            }
            arg0.method3321(class142.field2388, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field679[0] == 1 && field644[0] == 0) {
                Statics.field612[2].method1576(var3, 4);
            } else {
                Statics.field612[0].method1576(var3, 4);
            }
            if (field679[0] == 1 && field644[0] == 1) {
                Statics.field612[3].method1576(var3 + 15, 4);
            } else {
                Statics.field612[1].method1576(var3 + 15, 4);
            }
            arg0.method3321(class142.field2384, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field679[0] == 2 && field644[0] == 0) {
                Statics.field612[2].method1576(var4, 4);
            } else {
                Statics.field612[0].method1576(var4, 4);
            }
            if (field679[0] == 2 && field644[0] == 1) {
                Statics.field612[3].method1576(var4 + 15, 4);
            } else {
                Statics.field612[1].method1576(var4 + 15, 4);
            }
            arg0.method3321(class142.field2390, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field679[0] == 3 && field644[0] == 0) {
                Statics.field612[2].method1576(var5, 4);
            } else {
                Statics.field612[0].method1576(var5, 4);
            }
            if (field679[0] == 3 && field644[0] == 1) {
                Statics.field612[3].method1576(var5 + 15, 4);
            } else {
                Statics.field612[1].method1576(var5 + 15, 4);
            }
            arg0.method3321(class142.field2364, var5 + 32, 17, 16777215, -1);
        }
        class73.method1527(708, 4, 50, 16, 0);
        arg1.method3323(class142.field2284, 733, 16, 16777215, -1);
        field651 = -1;
        if (Statics.field564 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field676) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field676) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field676) {
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
            for (int var20 = 0; var20 < field676; var20++) {
                class22 var21 = Statics.field677[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field580);
                if (var21.field580 == -1) {
                    var23 = class142.field2392;
                    var22 = false;
                } else if (var21.field580 > 1980) {
                    var23 = class142.field2356;
                    var22 = false;
                }
                byte var24;
                if (var21.method475()) {
                    if (var21.method485()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method485()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class127.field2011 >= var17 && class127.field2008 * -391950985 >= var16 && class127.field2011 < var6 + var17 && class127.field2008 * -391950985 < var7 + var16 && var22) {
                    field651 = var20;
                    Statics.field564[var24].method1475(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field564[var24].method1444(var17, var16);
                }
                if (Statics.field675 != null) {
                    Statics.field675[(var21.method485() ? 8 : 0) + var21.field570].method1576(var17 + 29, var16);
                }
                arg0.method3323(Integer.toString(var21.field574), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3323(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3375(Statics.field677[field651].field572) + 6;
                int var26 = arg1.field2919 + 8;
                class73.method1527(class127.field2011 - var25 / 2, class127.field2008 * -391950985 + 20 + 5, var25, var26, 16777120);
                class73.method1544(class127.field2011 - var25 / 2, class127.field2008 * -391950985 + 20 + 5, var25, var26, 0);
                arg1.method3323(Statics.field677[field651].field572, class127.field2011, class127.field2008 * -391950985 + 20 + 5 + arg1.field2919 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field1589.getGraphics();
            Statics.field582.method1365(var27, 0, 0);
        } catch (Exception var61) {
            Statics.field1589.repaint();
        }
    }

    @ObfuscatedName("ca.j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1851(String arg0, String arg1, String arg2) {
        field666 = arg0;
        field648 = arg1;
        field682 = arg2;
    }

    @ObfuscatedName("fe.g(Lby;I)V")
    public static final void method3126(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field655.length; var2++) {
            Statics.field655[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field655[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field161[var8] = (Statics.field655[var8 - 1] + Statics.field655[var8 + 1] + Statics.field655[var8 - 128] + Statics.field655[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field655;
            Statics.field655 = Statics.field161;
            Statics.field161 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1320; var11++) {
            for (int var12 = 0; var12 < arg0.field1317; var12++) {
                if (arg0.field1324[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1321;
                    int var14 = var11 + 16 + arg0.field1322;
                    int var15 = (var14 << 7) + var13;
                    Statics.field655[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("b.p(II)V")
    public static final void method104(int arg0) {
        short var1 = 256;
        field656 += arg0 * 128;
        if (field656 > Statics.field655.length) {
            field656 -= Statics.field655.length;
            int var2 = (int) (Math.random() * 12.0D);
            method3126(Statics.field641[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field53[var3 + var4] - Statics.field655[field656 + var3 & Statics.field655.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field53[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field53[var9 + var10] = 255;
                } else {
                    Statics.field53[var9 + var10] = 0;
                }
            }
        }
        if (field653 > 0) {
            field653 -= arg0 * 4;
        }
        if (field654 > 0) {
            field654 -= arg0 * 4;
        }
        if (field653 == 0 && field654 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field653 = 1024;
            }
            if (var12 == 1) {
                field654 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field683[var13] = field683[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field683[var14] = (int) (Math.sin((double) field659 / 14.0D) * 16.0D + Math.sin((double) field659 / 15.0D) * 14.0D + Math.sin((double) field659 / 16.0D) * 12.0D);
            field659++;
        }
        field657 += arg0 * -1365535849;
        int var15 = ((client.field261 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field657 * -647299268; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field53[(var18 << 7) + var17] = 192;
        }
        field657 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field53[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field53[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field2660[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field2660[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field2660[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field53[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("d.o(IIIB)I")
    public static final int method128(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("i.b(I)V")
    public static final void method455() {
        short var0 = 256;
        if (field653 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field653 > 768) {
                    Statics.field2128[var1] = method128(Statics.field1911[var1], Statics.field1962[var1], 1024 - field653);
                } else if (field653 > 256) {
                    Statics.field2128[var1] = Statics.field1962[var1];
                } else {
                    Statics.field2128[var1] = method128(Statics.field1962[var1], Statics.field1911[var1], 256 - field653);
                }
            }
        } else if (field654 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field654 > 768) {
                    Statics.field2128[var2] = method128(Statics.field1911[var2], Statics.field652[var2], 1024 - field654);
                } else if (field654 > 256) {
                    Statics.field2128[var2] = Statics.field652[var2];
                } else {
                    Statics.field2128[var2] = method128(Statics.field652[var2], Statics.field1911[var2], 256 - field654);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field2128[var3] = Statics.field1911[var3];
            }
        }
        class73.method1520(0, 9, 128, var0 + 7);
        Statics.field645.method1444(0, 0);
        class73.method1519();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field683[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field53[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field2128[var10];
                    int var14 = Statics.field582.field1292[var5];
                    Statics.field582.field1292[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class73.method1520(637, 9, 765, var0 + 7);
        Statics.field646.method1444(382, 0);
        class73.method1519();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field683[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field53[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field2128[var22];
                    int var26 = Statics.field582.field1292[var20];
                    Statics.field582.field1292[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("u.x(Ler;I)V")
    public static void method152(class131 arg0) {
        if (class127.field2017 != 1 && Statics.field1294 || class127.field2017 != 4) {
            return;
        }
        short var1 = 280;
        if (class127.field2014 >= var1 && class127.field2014 <= var1 + 14 && class127.field2019 >= 4 && class127.field2019 <= 18) {
            method508(0, 0);
            return;
        }
        if (class127.field2014 >= var1 + 15 && class127.field2014 <= var1 + 80 && class127.field2019 >= 4 && class127.field2019 <= 18) {
            method508(0, 1);
            return;
        }
        short var2 = 390;
        if (class127.field2014 >= var2 && class127.field2014 <= var2 + 14 && class127.field2019 >= 4 && class127.field2019 <= 18) {
            method508(1, 0);
            return;
        }
        if (class127.field2014 >= var2 + 15 && class127.field2014 <= var2 + 80 && class127.field2019 >= 4 && class127.field2019 <= 18) {
            method508(1, 1);
            return;
        }
        short var3 = 500;
        if (class127.field2014 >= var3 && class127.field2014 <= var3 + 14 && class127.field2019 >= 4 && class127.field2019 <= 18) {
            method508(2, 0);
            return;
        }
        if (class127.field2014 >= var3 + 15 && class127.field2014 <= var3 + 80 && class127.field2019 >= 4 && class127.field2019 <= 18) {
            method508(2, 1);
            return;
        }
        short var4 = 610;
        if (class127.field2014 >= var4 && class127.field2014 <= var4 + 14 && class127.field2019 >= 4 && class127.field2019 <= 18) {
            method508(3, 0);
            return;
        }
        if (class127.field2014 >= var4 + 15 && class127.field2014 <= var4 + 80 && class127.field2019 >= 4 && class127.field2019 <= 18) {
            method508(3, 1);
            return;
        }
        if (class127.field2014 >= 708 && class127.field2019 >= 4 && class127.field2014 <= 758 && class127.field2019 <= 20) {
            field681 = false;
            Statics.field645.method1444(0, 0);
            Statics.field646.method1444(382, 0);
            Statics.field1934.method1576(382 - Statics.field1934.field1317 / 2, 18);
            return;
        }
        if (field651 == -1) {
            return;
        }
        class22 var5 = Statics.field677[field651];
        method114(var5);
        field681 = false;
        Statics.field645.method1444(0, 0);
        Statics.field646.method1444(382, 0);
        Statics.field1934.method1576(382 - Statics.field1934.field1317 / 2, 18);
        return;
    }

    @ObfuscatedName("x.n(La;I)V")
    public static void method114(class22 arg0) {
        if (arg0.method485() != client.field256) {
            client.field256 = arg0.method485();
            class45.method490(arg0.method485());
        }
        Statics.field151 = arg0.field573;
        client.field253 = arg0.field574;
        client.field309 = arg0.field571;
        Statics.field998 = client.field255 == 0 ? 43594 : arg0.field574 + 40000;
        Statics.field2679 = client.field255 == 0 ? 443 : arg0.field574 + 50000;
        Statics.field1000 = Statics.field998;
    }

    @ObfuscatedName("z.d(I)V")
    public static void method514() {
        try {
            if (Statics.field634 == null) {
                Statics.field634 = new class17(Statics.field1680, new URL(Statics.field2890));
            } else {
                byte[] var0 = Statics.field634.method149();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field676 = var1.method2232();
                    Statics.field677 = new class22[field676];
                    int var2 = 0;
                    while (var2 < field676) {
                        class22 var3 = Statics.field677[var2] = new class22();
                        var3.field574 = var1.method2232();
                        var3.field571 = var1.method2116();
                        var3.field573 = var1.method2119();
                        var3.field572 = var1.method2119();
                        var3.field570 = var1.method2111();
                        var3.field580 = var1.method2240();
                        var3.field575 = var2++;
                    }
                    Statics.method926(Statics.field677, 0, Statics.field677.length - 1, field679, field644);
                    field681 = true;
                    Statics.field634 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field634 = null;
        }
    }

    @ObfuscatedName("q.s(IIB)V")
    public static void method508(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field679[var5] != arg0) {
                var2[var4] = field679[var5];
                var3[var4] = field644[var5];
                var4++;
            }
        }
        field679 = var2;
        field644 = var3;
        Statics.method926(Statics.field677, 0, Statics.field677.length - 1, field679, field644);
    }
}

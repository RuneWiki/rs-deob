package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("aa")
public class class28 {

    @ObfuscatedName("aa.c")
    public static int[] field657 = new int[256];

    @ObfuscatedName("aa.g")
    public static int field659 = 0;

    @ObfuscatedName("aa.s")
    public static int field660 = 0;

    @ObfuscatedName("aa.al")
    public static int field662 = 0;

    @ObfuscatedName("aa.aa")
    public static int field663 = 0;

    @ObfuscatedName("aa.ar")
    public static int field664 = 0;

    @ObfuscatedName("aa.ak")
    public static int field665 = 0;

    @ObfuscatedName("aa.ay")
    public static int field666 = 10;

    @ObfuscatedName("aa.aw")
    public static String field667 = "";

    @ObfuscatedName("aa.av")
    public static int field668 = 0;

    @ObfuscatedName("aa.at")
    public static String field669 = "";

    @ObfuscatedName("aa.af")
    public static String field677 = "";

    @ObfuscatedName("aa.ae")
    public static String field672 = "";

    @ObfuscatedName("aa.ai")
    public static String field671 = "";

    @ObfuscatedName("aa.as")
    public static String field673 = "";

    @ObfuscatedName("aa.aj")
    public static class145 field658 = class145.field2396;

    @ObfuscatedName("aa.ao")
    public static boolean field676 = true;

    @ObfuscatedName("aa.ag")
    public static int field682 = 0;

    @ObfuscatedName("aa.aq")
    public static String field678 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("aa.an")
    public static String field653 = "1234567890";

    @ObfuscatedName("aa.ap")
    public static boolean field681 = false;

    @ObfuscatedName("aa.bx")
    public static int field656 = 0;

    @ObfuscatedName("aa.bn")
    public static int[] field670 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("aa.bo")
    public static int[] field683 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("aa.br")
    public static int field684 = -1;

    public class28() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("db.n(Lej;Lej;I)I")
    public static int method2442(class147 arg0, class147 arg1) {
        int var2 = 0;
        if (arg0.method2692("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2692("logo", "")) {
            var2++;
        }
        if (arg1.method2692("titlebox", "")) {
            var2++;
        }
        if (arg1.method2692("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2692("runes", "")) {
            var2++;
        }
        if (arg1.method2692("title_mute", "")) {
            var2++;
        }
        if (arg1.method2693("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2693("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2692("sl_back", "");
        arg1.method2692("sl_flags", "");
        arg1.method2692("sl_arrows", "");
        arg1.method2692("sl_stars", "");
        arg1.method2692("sl_button", "");
        return var2;
    }

    @ObfuscatedName("aj.x(Ljava/awt/Component;Lej;Lej;ZII)V")
    public static void method748(Component arg0, class147 arg1, class147 arg2, boolean arg3, int arg4) {
        if (!Statics.field674) {
            field668 = arg4;
            class73.method1532();
            byte[] var5 = arg1.method2691("title.jpg", "");
            Statics.field652 = new class72(var5, arg0);
            Statics.field680 = Statics.field652.method1434();
            Statics.field190 = class70.method1319(arg2, "logo", "");
            Statics.field650 = class70.method1319(arg2, "titlebox", "");
            Statics.field651 = class70.method1319(arg2, "titlebutton", "");
            Statics.field1883 = Statics.method488(arg2, "runes", "");
            Statics.field1646 = Statics.method488(arg2, "title_mute", "");
            Statics.field654 = class70.method1319(arg2, "options_radio_buttons,0", "");
            Statics.field655 = class70.method1319(arg2, "options_radio_buttons,2", "");
            Statics.field713 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field713[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field713[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field713[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field713[var9 + 192] = 16777215;
            }
            Statics.field591 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field591[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field591[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field591[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field591[var13 + 192] = 16777215;
            }
            Statics.field2721 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2721[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2721[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2721[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2721[var17 + 192] = 16777215;
            }
            Statics.field675 = new int[256];
            Statics.field71 = new int[32768];
            Statics.field661 = new int[32768];
            method1853((class74) null);
            Statics.field921 = new int[32768];
            Statics.field1676 = new int[32768];
            if (arg3) {
                field671 = "";
                field673 = "";
            }
            Statics.field144 = 0;
            Statics.field686 = "";
            field676 = true;
            field681 = false;
            if (Statics.field2430.field138) {
                class162.method546(2);
            } else {
                class162.method771(2, Statics.field154, "scape main", "", 255, false);
            }
            class151.method695(false);
            Statics.field674 = true;
            Statics.field652.method1443(0, 0);
            Statics.field680.method1443(382, 0);
            Statics.field190.method1590(382 - Statics.field190.field1307 / 2, 18);
        } else if (arg4 == 4) {
            field668 = 4;
        }
    }

    @ObfuscatedName("cw.k(Leg;I)V")
    public static void method1859(class131 arg0) {
        if (field681) {
            method1854(arg0);
            return;
        }
        if ((class127.field1998 == 1 || !Statics.field285 && class127.field1998 == 4) && class127.field1996 >= 715 && class127.field1997 >= 453) {
            Statics.field2430.field138 = !Statics.field2430.field138;
            Statics.method910();
            if (Statics.field2430.field138) {
                class162.method2782();
            } else {
                class148 var1 = Statics.field154;
                int var2 = var1.method2729("scape main");
                int var3 = var1.method2690(var2, "");
                class162.method2519(var1, var2, var3, 255, false);
            }
        }
        if (client.field265 == 5) {
            return;
        }
        field664++;
        if (client.field265 != 10 && client.field265 != 11) {
            return;
        }
        if (client.field263 == 0) {
            if (class127.field1998 == 1 || !Statics.field285 && class127.field1998 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class127.field1996 >= var4 && class127.field1996 <= var4 + var6 && class127.field1997 >= var5 && class127.field1997 <= var5 + var7) {
                    method487();
                    return;
                }
            }
            if (Statics.field15 != null) {
                method487();
            }
        }
        int var8 = class127.field1998;
        int var9 = class127.field1996;
        int var10 = class127.field1997;
        if (!Statics.field285 && var8 == 4) {
            var8 = 1;
        }
        if (field668 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                String var13 = client.method2069("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class125.method1320(var13, true, "openjs", false);
            }
            short var14 = 462;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field258 & 0x4) != 0) {
                    if ((client.field258 & 0x400) == 0) {
                        field669 = class143.field2356;
                        field677 = class143.field2357;
                        field672 = class143.field2293;
                    } else {
                        field669 = class143.field2362;
                        field677 = class143.field2374;
                        field672 = class143.field2364;
                    }
                    field668 = 1;
                    field682 = 0;
                } else if ((client.field258 & 0x400) == 0) {
                    field669 = class143.field2352;
                    field677 = class143.field2278;
                    field672 = class143.field2325;
                    field668 = 2;
                    field682 = 0;
                } else {
                    field669 = class143.field2359;
                    field677 = class143.field2360;
                    field672 = class143.field2361;
                    field668 = 1;
                    field682 = 0;
                }
            }
        } else if (field668 == 1) {
            while (class124.method483()) {
                if (Statics.field1903 == 84) {
                    field669 = class143.field2352;
                    field677 = class143.field2278;
                    field672 = class143.field2325;
                    field668 = 2;
                    field682 = 0;
                } else if (Statics.field1903 == 13) {
                    field668 = 0;
                }
            }
            short var15 = 302;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field669 = class143.field2352;
                field677 = class143.field2278;
                field672 = class143.field2325;
                field668 = 2;
                field682 = 0;
            }
            short var17 = 462;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field668 = 0;
            }
        } else if (field668 == 2) {
            short var18 = 231;
            int var30 = var18 + 30;
            if (var8 == 1 && var10 >= var30 - 15 && var10 < var30) {
                field682 = 0;
            }
            var30 += 15;
            if (var8 == 1 && var10 >= var30 - 15 && var10 < var30) {
                field682 = 1;
            }
            var30 += 15;
            short var19 = 302;
            short var20 = 321;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field671 = field671.trim();
                if (field671.length() == 0) {
                    method2070(class143.field2174, class143.field2169, class143.field2260);
                    return;
                }
                if (field673.length() == 0) {
                    method2070(class143.field2319, class143.field2273, class143.field2263);
                    return;
                }
                method2070(class143.field2367, class143.field2387, class143.field2333);
                field658 = Statics.field2430.field142.containsKey(class200.method3106(field671)) ? class145.field2400 : class145.field2396;
                Statics.method26(20);
                return;
            }
            short var21 = 462;
            if (var8 == 1 && var9 >= var21 - 75 && var9 <= var21 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field668 = 0;
                field671 = "";
                field673 = "";
                Statics.field144 = 0;
                Statics.field686 = "";
                field676 = true;
            }
            while (true) {
                while (class124.method483()) {
                    boolean var22 = false;
                    for (int var23 = 0; var23 < field678.length(); var23++) {
                        if (Statics.field980 == field678.charAt(var23)) {
                            var22 = true;
                            break;
                        }
                    }
                    if (Statics.field1903 == 13) {
                        field668 = 0;
                        field671 = "";
                        field673 = "";
                        Statics.field144 = 0;
                        Statics.field686 = "";
                        field676 = true;
                    } else if (field682 == 0) {
                        if (Statics.field1903 == 85 && field671.length() > 0) {
                            field671 = field671.substring(0, field671.length() - 1);
                        }
                        if (Statics.field1903 == 84 || Statics.field1903 == 80) {
                            field682 = 1;
                        }
                        if (var22 && field671.length() < 320) {
                            field671 = field671 + Statics.field980;
                        }
                    } else if (field682 == 1) {
                        if (Statics.field1903 == 85 && field673.length() > 0) {
                            field673 = field673.substring(0, field673.length() - 1);
                        }
                        if (Statics.field1903 == 84 || Statics.field1903 == 80) {
                            field682 = 0;
                        }
                        if (Statics.field1903 == 84) {
                            field671 = field671.trim();
                            if (field671.length() == 0) {
                                method2070(class143.field2174, class143.field2169, class143.field2260);
                                return;
                            }
                            if (field673.length() == 0) {
                                method2070(class143.field2319, class143.field2273, class143.field2263);
                                return;
                            }
                            method2070(class143.field2367, class143.field2387, class143.field2333);
                            field658 = Statics.field2430.field142.containsKey(class200.method3106(field671)) ? class145.field2400 : class145.field2396;
                            Statics.method26(20);
                            return;
                        }
                        if (var22 && field673.length() < 20) {
                            field673 = field673 + Statics.field980;
                        }
                    }
                }
                return;
            }
        } else if (field668 == 4) {
            short var24 = 302;
            short var25 = 321;
            if (var8 == 1 && var9 >= var24 - 75 && var9 <= var24 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                Statics.field686.trim();
                if (Statics.field686.length() != 6) {
                    method2070(class143.field2144, class143.field2175, class143.field2176);
                    return;
                }
                Statics.field144 = Integer.parseInt(Statics.field686);
                Statics.field686 = "";
                field658 = field676 ? class145.field2401 : class145.field2399;
                method2070(class143.field2367, class143.field2387, class143.field2333);
                Statics.method26(20);
                return;
            }
            if (var8 == 1 && var9 >= 373 && var9 <= 512 && var10 >= 263 && var10 <= 296) {
                field676 = !field676;
            }
            if (var8 == 1 && var9 >= 348 && var9 <= 416 && var10 >= 351 && var10 <= 363) {
                String var26 = client.method2069("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class125.method1320(var26, true, "openjs", false);
            }
            short var27 = 462;
            if (var8 == 1 && var9 >= var27 - 75 && var9 <= var27 + 75 && var10 >= var25 - 20 && var10 <= var25 + 20) {
                field668 = 0;
                field671 = "";
                field673 = "";
                Statics.field144 = 0;
                Statics.field686 = "";
            }
            while (class124.method483()) {
                boolean var28 = false;
                for (int var29 = 0; var29 < field653.length(); var29++) {
                    if (Statics.field980 == field653.charAt(var29)) {
                        var28 = true;
                        break;
                    }
                }
                if (Statics.field1903 == 13) {
                    field668 = 0;
                    field671 = "";
                    field673 = "";
                    Statics.field144 = 0;
                    Statics.field686 = "";
                } else {
                    if (Statics.field1903 == 85 && Statics.field686.length() > 0) {
                        Statics.field686 = Statics.field686.substring(0, Statics.field686.length() - 1);
                    }
                    if (Statics.field1903 == 84) {
                        Statics.field686.trim();
                        if (Statics.field686.length() != 6) {
                            method2070(class143.field2144, class143.field2175, class143.field2176);
                            return;
                        }
                        Statics.field144 = Integer.parseInt(Statics.field686);
                        Statics.field686 = "";
                        field658 = field676 ? class145.field2401 : class145.field2399;
                        method2070(class143.field2367, class143.field2387, class143.field2333);
                        Statics.method26(20);
                        return;
                    }
                    if (var28 && Statics.field686.length() < 6) {
                        Statics.field686 = Statics.field686 + Statics.field980;
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.i(Lgu;Lgu;B)V")
    public static void method580(class194 arg0, class194 arg1) {
        if (!field681) {
            if (client.field265 == 0 || client.field265 == 5) {
                byte var29 = 20;
                arg0.method3306(class143.field2305, 382, 245 - var29, 16777215, -1);
                int var30 = 253 - var29;
                class73.method1536(230, var30, 304, 34, 9179409);
                class73.method1536(231, var30 + 1, 302, 32, 0);
                class73.method1534(232, var30 + 2, field666 * 3, 30, 9179409);
                class73.method1534(field666 * 3 + 232, var30 + 2, 300 - field666 * 3, 30, 0);
                arg0.method3306(field667, 382, 276 - var29, 16777215, -1);
            }
            if (client.field265 == 20) {
                Statics.field650.method1590(382 - Statics.field650.field1307 / 2, 271 - Statics.field650.field1310 / 2);
                short var31 = 211;
                arg0.method3306(field669, 382, var31, 16776960, 0);
                int var63 = var31 + 15;
                arg0.method3306(field677, 382, var63, 16776960, 0);
                int var64 = var63 + 15;
                arg0.method3306(field672, 382, var64, 16776960, 0);
                int var65 = var64 + 15;
                int var66 = var65 + 10;
                if (field668 != 4) {
                    arg0.method3344(class143.field2193, 272, var66, 16777215, 0);
                    short var32 = 200;
                    String var33;
                    for (var33 = field671; arg0.method3299(var33) > var32; var33 = var33.substring(0, var33.length() - 1)) {
                    }
                    arg0.method3344(class193.method3303(var33), 312, var66, 16777215, 0);
                    var63 = var66 + 15;
                    arg0.method3344(class143.field2371 + class200.method2310(field673), 274, var63, 16777215, 0);
                    var63 += 15;
                }
            }
            if (client.field265 == 10 || client.field265 == 11) {
                Statics.field650.method1590(202, 171);
                if (field668 == 0) {
                    short var34 = 251;
                    arg0.method3306(class143.field2373, 382, var34, 16776960, 0);
                    int var67 = var34 + 30;
                    short var35 = 302;
                    short var36 = 291;
                    Statics.field651.method1590(var35 - 73, var36 - 20);
                    arg0.method3307(class143.field2354, var35 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    short var37 = 462;
                    Statics.field651.method1590(var37 - 73, var36 - 20);
                    arg0.method3307(class143.field2345, var37 - 73, var36 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                } else if (field668 == 1) {
                    arg0.method3306(class143.field2355, 382, 211, 16776960, 0);
                    short var38 = 236;
                    arg0.method3306(field669, 382, var38, 16777215, 0);
                    int var68 = var38 + 15;
                    arg0.method3306(field677, 382, var68, 16777215, 0);
                    int var69 = var68 + 15;
                    arg0.method3306(field672, 382, var69, 16777215, 0);
                    int var70 = var69 + 15;
                    short var39 = 302;
                    short var40 = 321;
                    Statics.field651.method1590(var39 - 73, var40 - 20);
                    arg0.method3306(class143.field2147, var39, var40 + 5, 16777215, 0);
                    short var41 = 462;
                    Statics.field651.method1590(var41 - 73, var40 - 20);
                    arg0.method3306(class143.field2377, var41, var40 + 5, 16777215, 0);
                } else if (field668 == 2) {
                    short var42 = 211;
                    arg0.method3306(field669, 382, var42, 16776960, 0);
                    int var71 = var42 + 15;
                    arg0.method3306(field677, 382, var71, 16776960, 0);
                    int var72 = var71 + 15;
                    arg0.method3306(field672, 382, var72, 16776960, 0);
                    int var73 = var72 + 15;
                    int var74 = var73 + 10;
                    arg0.method3344(class143.field2193, 272, var74, 16777215, 0);
                    short var43 = 200;
                    String var44;
                    for (var44 = field671; arg0.method3299(var44) > var43; var44 = var44.substring(1)) {
                    }
                    arg0.method3344(class193.method3303(var44) + (field682 == 0 & client.field440 % 40 < 20 ? class2.method836(16776960) + class2.field33 : ""), 312, var74, 16777215, 0);
                    var71 = var74 + 15;
                    arg0.method3344(class143.field2371 + class200.method2310(field673) + (field682 == 1 & client.field440 % 40 < 20 ? class2.method836(16776960) + class2.field33 : ""), 274, var71, 16777215, 0);
                    var71 += 15;
                    short var45 = 302;
                    short var46 = 321;
                    Statics.field651.method1590(var45 - 73, var46 - 20);
                    arg0.method3306(class143.field2302, var45, var46 + 5, 16777215, 0);
                    short var47 = 462;
                    Statics.field651.method1590(var47 - 73, var46 - 20);
                    arg0.method3306(class143.field2377, var47, var46 + 5, 16777215, 0);
                } else if (field668 == 4) {
                    arg0.method3306(class143.field2365, 382, 211, 16776960, 0);
                    short var48 = 236;
                    arg0.method3306(field669, 382, var48, 16777215, 0);
                    int var75 = var48 + 15;
                    arg0.method3306(field677, 382, var75, 16777215, 0);
                    int var76 = var75 + 15;
                    arg0.method3306(field672, 382, var76, 16777215, 0);
                    int var77 = var76 + 15;
                    arg0.method3344(class143.field2372 + class200.method2310(Statics.field686) + (client.field440 % 40 < 20 ? class2.method836(16776960) + class2.field33 : ""), 274, var77, 16777215, 0);
                    int var78 = var77 - 8;
                    arg0.method3344(class143.field2148, 373, var78, 16776960, 0);
                    int var79 = var78 + 15;
                    arg0.method3344(class143.field2149, 373, var79, 16776960, 0);
                    int var49 = 373 + arg0.method3299(class143.field2149) + 15;
                    int var50 = var79 - arg0.field2916;
                    class74 var51;
                    if (field676) {
                        var51 = Statics.field655;
                    } else {
                        var51 = Statics.field654;
                    }
                    var51.method1590(var49, var50);
                    var75 = var79 + 15;
                    short var52 = 302;
                    short var53 = 321;
                    Statics.field651.method1590(var52 - 73, var53 - 20);
                    arg0.method3306(class143.field2147, var52, var53 + 5, 16777215, 0);
                    short var54 = 462;
                    Statics.field651.method1590(var54 - 73, var53 - 20);
                    arg0.method3306(class143.field2377, var54, var53 + 5, 16777215, 0);
                    arg1.method3306(class143.field2314, 382, var53 + 36, 255, 0);
                }
            }
            if (field664 > 0) {
                method2541(field664);
                field664 = 0;
            }
            method508();
            Statics.field1646[Statics.field2430.field138 ? 1 : 0].method1590(725, 463);
            if (client.field265 > 5 && client.field263 == 0) {
                if (Statics.field2939 == null) {
                    Statics.field2939 = class70.method1319(Statics.field2403, "sl_button", "");
                } else {
                    byte var55 = 5;
                    short var56 = 463;
                    byte var57 = 100;
                    byte var58 = 35;
                    Statics.field2939.method1590(var55, var56);
                    arg0.method3306(class143.field2298 + " " + client.field257, var57 / 2 + var55, var58 / 2 + var56 - 2, 16777215, 0);
                    if (Statics.field15 == null) {
                        arg1.method3306(class143.field2388, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                    } else {
                        arg1.method3306(class143.field2281, var57 / 2 + var55, var58 / 2 + var56 + 12, 16777215, 0);
                    }
                }
            }
            try {
                Graphics var59 = Statics.field131.getGraphics();
                Statics.field1668.method1348(var59, 0, 0);
            } catch (Exception var62) {
                Statics.field131.repaint();
            }
            return;
        }
        if (Statics.field2464 == null) {
            Statics.field2464 = class70.method822(Statics.field2403, "sl_back", "");
        }
        if (Statics.field912 == null) {
            Statics.field912 = Statics.method488(Statics.field2403, "sl_flags", "");
        }
        if (Statics.field2482 == null) {
            Statics.field2482 = Statics.method488(Statics.field2403, "sl_arrows", "");
        }
        if (Statics.field546 == null) {
            Statics.field546 = Statics.method488(Statics.field2403, "sl_stars", "");
        }
        class73.method1534(0, 23, 765, 480, 0);
        class73.method1581(0, 0, 125, 23, 12425273, 9135624);
        class73.method1581(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3306(class143.field2378, 62, 15, 0, -1);
        if (Statics.field546 != null) {
            Statics.field546[1].method1590(140, 1);
            arg1.method3344(class143.field2379, 152, 10, 16777215, -1);
            Statics.field546[0].method1590(140, 12);
            arg1.method3344(class143.field2366, 152, 21, 16777215, -1);
        }
        if (Statics.field2482 != null) {
            short var2 = 280;
            if (field670[0] == 0 && field683[0] == 0) {
                Statics.field2482[2].method1590(var2, 4);
            } else {
                Statics.field2482[0].method1590(var2, 4);
            }
            if (field670[0] == 0 && field683[0] == 1) {
                Statics.field2482[3].method1590(var2 + 15, 4);
            } else {
                Statics.field2482[1].method1590(var2 + 15, 4);
            }
            arg0.method3344(class143.field2381, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field670[0] == 1 && field683[0] == 0) {
                Statics.field2482[2].method1590(var3, 4);
            } else {
                Statics.field2482[0].method1590(var3, 4);
            }
            if (field670[0] == 1 && field683[0] == 1) {
                Statics.field2482[3].method1590(var3 + 15, 4);
            } else {
                Statics.field2482[1].method1590(var3 + 15, 4);
            }
            arg0.method3344(class143.field2382, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field670[0] == 2 && field683[0] == 0) {
                Statics.field2482[2].method1590(var4, 4);
            } else {
                Statics.field2482[0].method1590(var4, 4);
            }
            if (field670[0] == 2 && field683[0] == 1) {
                Statics.field2482[3].method1590(var4 + 15, 4);
            } else {
                Statics.field2482[1].method1590(var4 + 15, 4);
            }
            arg0.method3344(class143.field2383, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field670[0] == 3 && field683[0] == 0) {
                Statics.field2482[2].method1590(var5, 4);
            } else {
                Statics.field2482[0].method1590(var5, 4);
            }
            if (field670[0] == 3 && field683[0] == 1) {
                Statics.field2482[3].method1590(var5 + 15, 4);
            } else {
                Statics.field2482[1].method1590(var5 + 15, 4);
            }
            arg0.method3344(class143.field2195, var5 + 32, 17, 16777215, -1);
        }
        class73.method1534(708, 4, 50, 16, 0);
        arg1.method3306(class143.field2377, 733, 16, 16777215, -1);
        field684 = -1;
        if (Statics.field2464 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field656) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field656) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field656) {
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
            for (int var20 = 0; var20 < field656; var20++) {
                class22 var21 = Statics.field1678[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field584);
                if (var21.field584 == -1) {
                    var23 = class143.field2385;
                    var22 = false;
                } else if (var21.field584 > 1980) {
                    var23 = class143.field2386;
                    var22 = false;
                }
                byte var24;
                if (var21.method520()) {
                    if (var21.method512()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method512()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class127.field1989 >= var17 && class127.field1990 >= var16 && class127.field1989 < var6 + var17 && class127.field1990 < var7 + var16 && var22) {
                    field684 = var20;
                    Statics.field2464[var24].method1449(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field2464[var24].method1443(var17, var16);
                }
                if (Statics.field912 != null) {
                    Statics.field912[(var21.method512() ? 8 : 0) + var21.field586].method1590(var17 + 29, var16);
                }
                arg0.method3306(Integer.toString(var21.field594), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3306(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3299(Statics.field1678[field684].field585) + 6;
                int var26 = arg1.field2916 + 8;
                class73.method1534(class127.field1989 - var25 / 2, class127.field1990 + 20 + 5, var25, var26, 16777120);
                class73.method1536(class127.field1989 - var25 / 2, class127.field1990 + 20 + 5, var25, var26, 0);
                arg1.method3306(Statics.field1678[field684].field585, class127.field1989, class127.field1990 + 20 + 5 + arg1.field2916 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field131.getGraphics();
            Statics.field1668.method1348(var27, 0, 0);
        } catch (Exception var61) {
            Statics.field131.repaint();
        }
    }

    @ObfuscatedName("cz.d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2070(String arg0, String arg1, String arg2) {
        field669 = arg0;
        field677 = arg1;
        field672 = arg2;
    }

    @ObfuscatedName("ch.q(Lby;B)V")
    public static final void method1853(class74 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field71.length; var2++) {
            Statics.field71[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field71[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field661[var8] = (Statics.field71[var8 - 1] + Statics.field71[var8 + 1] + Statics.field71[var8 - 128] + Statics.field71[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field71;
            Statics.field71 = Statics.field661;
            Statics.field661 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1310; var11++) {
            for (int var12 = 0; var12 < arg0.field1307; var12++) {
                if (arg0.field1312[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1311;
                    int var14 = var11 + 16 + arg0.field1309;
                    int var15 = (var14 << 7) + var13;
                    Statics.field71[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("dy.m(IS)V")
    public static final void method2541(int arg0) {
        short var1 = 256;
        field662 += arg0 * 128;
        if (field662 > Statics.field71.length) {
            field662 -= Statics.field71.length;
            int var2 = (int) (Math.random() * 12.0D);
            method1853(Statics.field1883[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field921[var3 + var4] - Statics.field71[field662 + var3 & Statics.field71.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field921[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field921[var9 + var10] = 255;
                } else {
                    Statics.field921[var9 + var10] = 0;
                }
            }
        }
        if (field659 > 0) {
            field659 -= arg0 * 4;
        }
        if (field660 > 0) {
            field660 -= arg0 * 4;
        }
        if (field659 == 0 && field660 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field659 = 1024;
            }
            if (var12 == 1) {
                field660 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field657[var13] = field657[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field657[var14] = (int) (Math.sin((double) field665 / 14.0D) * 16.0D + Math.sin((double) field665 / 15.0D) * 14.0D + Math.sin((double) field665 / 16.0D) * 12.0D);
            field665++;
        }
        field663 += arg0 * -1835262761;
        int var15 = ((client.field440 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field663 * -699731396; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field921[(var18 << 7) + var17] = 192;
        }
        field663 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field921[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field921[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field1676[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field1676[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field1676[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field921[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("cn.a(IIII)I")
    public static final int method1874(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("f.w(I)V")
    public static final void method508() {
        short var0 = 256;
        if (field659 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field659 > 768) {
                    Statics.field675[var1] = method1874(Statics.field713[var1], Statics.field591[var1], 1024 - field659);
                } else if (field659 > 256) {
                    Statics.field675[var1] = Statics.field591[var1];
                } else {
                    Statics.field675[var1] = method1874(Statics.field591[var1], Statics.field713[var1], 256 - field659);
                }
            }
        } else if (field660 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field660 > 768) {
                    Statics.field675[var2] = method1874(Statics.field713[var2], Statics.field2721[var2], 1024 - field660);
                } else if (field660 > 256) {
                    Statics.field675[var2] = Statics.field2721[var2];
                } else {
                    Statics.field675[var2] = method1874(Statics.field2721[var2], Statics.field713[var2], 256 - field660);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field675[var3] = Statics.field713[var3];
            }
        }
        class73.method1528(0, 9, 128, var0 + 7);
        Statics.field652.method1443(0, 0);
        class73.method1527();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field657[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field921[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field675[var10];
                    int var14 = Statics.field1668.field1283[var5];
                    Statics.field1668.field1283[var5++] = ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) + ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class73.method1528(637, 9, 765, var0 + 7);
        Statics.field680.method1443(382, 0);
        class73.method1527();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field657[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field921[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field675[var22];
                    int var26 = Statics.field1668.field1283[var20];
                    Statics.field1668.field1283[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("ch.e(Leg;I)V")
    public static void method1854(class131 arg0) {
        if (class127.field1998 != 1 && Statics.field285 || class127.field1998 != 4) {
            return;
        }
        short var1 = 280;
        if (class127.field1996 >= var1 && class127.field1996 <= var1 + 14 && class127.field1997 >= 4 && class127.field1997 <= 18) {
            method1879(0, 0);
            return;
        }
        if (class127.field1996 >= var1 + 15 && class127.field1996 <= var1 + 80 && class127.field1997 >= 4 && class127.field1997 <= 18) {
            method1879(0, 1);
            return;
        }
        short var2 = 390;
        if (class127.field1996 >= var2 && class127.field1996 <= var2 + 14 && class127.field1997 >= 4 && class127.field1997 <= 18) {
            method1879(1, 0);
            return;
        }
        if (class127.field1996 >= var2 + 15 && class127.field1996 <= var2 + 80 && class127.field1997 >= 4 && class127.field1997 <= 18) {
            method1879(1, 1);
            return;
        }
        short var3 = 500;
        if (class127.field1996 >= var3 && class127.field1996 <= var3 + 14 && class127.field1997 >= 4 && class127.field1997 <= 18) {
            method1879(2, 0);
            return;
        }
        if (class127.field1996 >= var3 + 15 && class127.field1996 <= var3 + 80 && class127.field1997 >= 4 && class127.field1997 <= 18) {
            method1879(2, 1);
            return;
        }
        short var4 = 610;
        if (class127.field1996 >= var4 && class127.field1996 <= var4 + 14 && class127.field1997 >= 4 && class127.field1997 <= 18) {
            method1879(3, 0);
            return;
        }
        if (class127.field1996 >= var4 + 15 && class127.field1996 <= var4 + 80 && class127.field1997 >= 4 && class127.field1997 <= 18) {
            method1879(3, 1);
            return;
        }
        if (class127.field1996 >= 708 && class127.field1997 >= 4 && class127.field1996 <= 758 && class127.field1997 <= 20) {
            field681 = false;
            Statics.field652.method1443(0, 0);
            Statics.field680.method1443(382, 0);
            Statics.field190.method1590(382 - Statics.field190.field1307 / 2, 18);
            return;
        }
        if (field684 == -1) {
            return;
        }
        class22 var5 = Statics.field1678[field684];
        method3109(var5);
        field681 = false;
        Statics.field652.method1443(0, 0);
        Statics.field680.method1443(382, 0);
        Statics.field190.method1590(382 - Statics.field190.field1307 / 2, 18);
        return;
    }

    @ObfuscatedName("fp.o(Ls;I)V")
    public static void method3109(class22 arg0) {
        if (arg0.method512() != client.field261) {
            client.field261 = arg0.method512();
            boolean var1 = arg0.method512();
            if (Statics.field1016 != var1) {
                class45.field1009.method3124();
                class45.field1027.method3124();
                class45.field1011.method3124();
                Statics.field1016 = var1;
            }
        }
        Statics.field531 = arg0.field590;
        client.field257 = arg0.field594;
        client.field258 = arg0.field582;
        Statics.field296 = client.field259 == 0 ? 43594 : arg0.field594 + 40000;
        Statics.field533 = client.field259 == 0 ? 443 : arg0.field594 + 50000;
        Statics.field174 = Statics.field296;
    }

    @ObfuscatedName("h.v(I)V")
    public static void method487() {
        try {
            if (Statics.field15 == null) {
                Statics.field15 = new class17(Statics.field1932, new URL(Statics.field310));
            } else {
                byte[] var0 = Statics.field15.method163();
                if (var0 != null) {
                    class107 var1 = new class107(var0);
                    field656 = var1.method2140();
                    Statics.field1678 = new class22[field656];
                    int var2 = 0;
                    while (var2 < field656) {
                        class22 var3 = Statics.field1678[var2] = new class22();
                        var3.field594 = var1.method2140();
                        var3.field582 = var1.method2183();
                        var3.field590 = var1.method2182();
                        var3.field585 = var1.method2182();
                        var3.field586 = var1.method2148();
                        var3.field584 = var1.method2141();
                        var3.field587 = var2++;
                    }
                    method587(Statics.field1678, 0, Statics.field1678.length - 1, field670, field683);
                    field681 = true;
                    Statics.field15 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field15 = null;
        }
    }

    @ObfuscatedName("cu.z(IIB)V")
    public static void method1879(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field670[var5] != arg0) {
                var2[var4] = field670[var5];
                var3[var4] = field683[var5];
                var4++;
            }
        }
        field670 = var2;
        field683 = var3;
        method587(Statics.field1678, 0, Statics.field1678.length - 1, field670, field683);
    }

    @ObfuscatedName("ak.j([Ls;II[I[IB)V")
    public static void method587(class22[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
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
                        var11 = arg0[var6].field587;
                        var12 = var8.field587;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field584;
                        var12 = var8.field584;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method512() ? 1 : 0;
                        var12 = var8.method512() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field594;
                        var12 = var8.field594;
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
                        var15 = arg0[var5].field587;
                        var16 = var8.field587;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field584;
                        var16 = var8.field584;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method512() ? 1 : 0;
                        var16 = var8.method512() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field594;
                        var16 = var8.field594;
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
        method587(arg0, arg1, var6, arg3, arg4);
        method587(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

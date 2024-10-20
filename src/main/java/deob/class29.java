package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;
import java.util.LinkedHashMap;

@ObfuscatedName("ac")
public class class29 {

    @ObfuscatedName("ac.s")
    public static int[] field661 = new int[256];

    @ObfuscatedName("ac.o")
    public static int field660 = 0;

    @ObfuscatedName("ac.z")
    public static int field674 = 0;

    @ObfuscatedName("ac.ae")
    public static int field666 = 0;

    @ObfuscatedName("ac.ay")
    public static int field667 = 0;

    @ObfuscatedName("ac.ac")
    public static int field668 = 0;

    @ObfuscatedName("ac.ag")
    public static int field663 = 0;

    @ObfuscatedName("ac.am")
    public static int field683 = 10;

    @ObfuscatedName("ac.au")
    public static String field671 = "";

    @ObfuscatedName("ac.ai")
    public static int field672 = 0;

    @ObfuscatedName("ac.ab")
    public static String field686 = "";

    @ObfuscatedName("ac.az")
    public static String field678 = "";

    @ObfuscatedName("ac.as")
    public static String field665 = "";

    @ObfuscatedName("ac.ah")
    public static String field676 = "";

    @ObfuscatedName("ac.aw")
    public static String field677 = "";

    @ObfuscatedName("ac.ar")
    public static class147 field664 = class147.field2417;

    @ObfuscatedName("ac.ak")
    public static boolean field679 = true;

    @ObfuscatedName("ac.aa")
    public static int field680 = 0;

    @ObfuscatedName("ac.av")
    public static String field681 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ac.al")
    public static String field669 = "1234567890";

    @ObfuscatedName("ac.aj")
    public static boolean field658 = false;

    @ObfuscatedName("ac.by")
    public static int field684 = 0;

    @ObfuscatedName("ac.bj")
    public static int[] field685 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ac.bh")
    public static int[] field670 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ac.bw")
    public static int field687 = -1;

    public class29() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.x(Ley;Ley;I)I")
    public static int method664(class149 arg0, class149 arg1) {
        int var2 = 0;
        if (arg0.method2749("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2749("logo", "")) {
            var2++;
        }
        if (arg1.method2749("titlebox", "")) {
            var2++;
        }
        if (arg1.method2749("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2749("runes", "")) {
            var2++;
        }
        if (arg1.method2749("title_mute", "")) {
            var2++;
        }
        if (arg1.method2750("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2750("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2749("sl_back", "");
        arg1.method2749("sl_flags", "");
        arg1.method2749("sl_arrows", "");
        arg1.method2749("sl_stars", "");
        arg1.method2749("sl_button", "");
        return var2;
    }

    @ObfuscatedName("de.v(Ljava/awt/Component;Ley;Ley;ZIB)V")
    public static void method2436(Component arg0, class149 arg1, class149 arg2, boolean arg3, int arg4) {
        if (!Statics.field1886) {
            field672 = arg4;
            class74.method1542();
            byte[] var5 = arg1.method2748("title.jpg", "");
            Statics.field2808 = new class73(var5, arg0);
            Statics.field659 = Statics.field2808.method1463();
            Statics.field2490 = class71.method550(arg2, "logo", "");
            Statics.field675 = class71.method550(arg2, "titlebox", "");
            Statics.field2031 = class71.method550(arg2, "titlebutton", "");
            Statics.field657 = class71.method1353(arg2, "runes", "");
            Statics.field673 = class71.method1353(arg2, "title_mute", "");
            Statics.field985 = class71.method550(arg2, "options_radio_buttons,0", "");
            Statics.field504 = class71.method550(arg2, "options_radio_buttons,2", "");
            Statics.field656 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field656[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field656[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field656[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field656[var9 + 192] = 16777215;
            }
            Statics.field799 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field799[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field799[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field799[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field799[var13 + 192] = 16777215;
            }
            Statics.field2835 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field2835[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field2835[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field2835[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field2835[var17 + 192] = 16777215;
            }
            Statics.field662 = new int[256];
            Statics.field1883 = new int[32768];
            Statics.field119 = new int[32768];
            method1628((class75) null);
            Statics.field2042 = new int[32768];
            Statics.field159 = new int[32768];
            if (arg3) {
                field676 = "";
                field677 = "";
            }
            Statics.field1463 = 0;
            Statics.field845 = "";
            field679 = true;
            field658 = false;
            if (Statics.field140.field129) {
                class164.method1787(2);
            } else {
                class150 var18 = Statics.field2800;
                int var19 = var18.method2746("scape main");
                int var20 = var18.method2747(var19, "");
                class164.method141(2, var18, var19, var20, 255, false);
            }
            class153.method123(false);
            Statics.field1886 = true;
            Statics.field2808.method1461(0, 0);
            Statics.field659.method1461(382, 0);
            Statics.field2490.method1598(382 - Statics.field2490.field1323 / 2, 18);
        } else if (arg4 == 4) {
            field672 = 4;
        }
    }

    @ObfuscatedName("cj.m(Leb;B)V")
    public static void method1627(class133 arg0) {
        if (field658) {
            method511(arg0);
            return;
        }
        if ((class129.field2007 == 1 || !Statics.field1896 && class129.field2007 == 4) && class129.field2008 >= 715 && class129.field1999 >= 453) {
            Statics.field140.field129 = !Statics.field140.field129;
            class9.method62();
            if (Statics.field140.field129) {
                class164.method2904();
            } else {
                class150 var1 = Statics.field2800;
                int var2 = var1.method2746("scape main");
                int var3 = var1.method2747(var2, "");
                class164.method2618(var1, var2, var3, 255, false);
            }
        }
        if (client.field411 == 5) {
            return;
        }
        field668++;
        if (client.field411 != 10 && client.field411 != 11) {
            return;
        }
        if (client.field245 == 0) {
            if (class129.field2007 == 1 || !Statics.field1896 && class129.field2007 == 4) {
                byte var4 = 5;
                short var5 = 463;
                byte var6 = 100;
                byte var7 = 35;
                if (class129.field2008 >= var4 && class129.field2008 <= var4 + var6 && class129.field1999 >= var5 && class129.field1999 <= var5 + var7) {
                    method1098();
                    return;
                }
            }
            if (Statics.field2928 != null) {
                method1098();
            }
        }
        int var8 = class129.field2007;
        int var9 = class129.field2008;
        int var10 = class129.field1999;
        if (!Statics.field1896 && var8 == 4) {
            var8 = 1;
        }
        if (field672 == 0) {
            short var11 = 302;
            short var12 = 291;
            if (var8 == 1 && var9 >= var11 - 75 && var9 <= var11 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                String var13 = client.method2711("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws";
                class127.method2494(var13, true, "openjs", false);
            }
            short var14 = 462;
            if (var8 == 1 && var9 >= var14 - 75 && var9 <= var14 + 75 && var10 >= var12 - 20 && var10 <= var12 + 20) {
                if ((client.field239 & 0x4) != 0) {
                    if ((client.field239 & 0x400) == 0) {
                        field686 = class145.field2353;
                        field678 = class145.field2362;
                        field665 = class145.field2377;
                    } else {
                        field686 = class145.field2291;
                        field678 = class145.field2382;
                        field665 = class145.field2190;
                    }
                    field672 = 1;
                    field680 = 0;
                } else if ((client.field239 & 0x400) == 0) {
                    field686 = class145.field2339;
                    field678 = class145.field2372;
                    field665 = class145.field2223;
                    field672 = 2;
                    field680 = 0;
                } else {
                    field686 = class145.field2378;
                    field678 = class145.field2369;
                    field665 = class145.field2380;
                    field672 = 1;
                    field680 = 0;
                }
            }
        } else if (field672 == 1) {
            while (class126.method3399()) {
                if (Statics.field2838 == 84) {
                    field686 = class145.field2339;
                    field678 = class145.field2372;
                    field665 = class145.field2223;
                    field672 = 2;
                    field680 = 0;
                } else if (Statics.field2838 == 13) {
                    field672 = 0;
                }
            }
            short var15 = 302;
            short var16 = 321;
            if (var8 == 1 && var9 >= var15 - 75 && var9 <= var15 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field686 = class145.field2339;
                field678 = class145.field2372;
                field665 = class145.field2223;
                field672 = 2;
                field680 = 0;
            }
            short var17 = 462;
            if (var8 == 1 && var9 >= var17 - 75 && var9 <= var17 + 75 && var10 >= var16 - 20 && var10 <= var16 + 20) {
                field672 = 0;
            }
        } else if (field672 == 2) {
            short var18 = 231;
            int var42 = var18 + 30;
            if (var8 == 1 && var10 >= var42 - 15 && var10 < var42) {
                field680 = 0;
            }
            var42 += 15;
            if (var8 == 1 && var10 >= var42 - 15 && var10 < var42) {
                field680 = 1;
            }
            var42 += 15;
            short var19 = 302;
            short var20 = 321;
            if (var8 == 1 && var9 >= var19 - 75 && var9 <= var19 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field676 = field676.trim();
                if (field676.length() == 0) {
                    method1449(class145.field2233, class145.field2278, class145.field2214);
                    return;
                }
                if (field677.length() == 0) {
                    method1449(class145.field2280, class145.field2281, class145.field2354);
                    return;
                }
                method1449(class145.field2386, class145.field2387, class145.field2388);
                LinkedHashMap var21 = Statics.field140.field130;
                String var22 = field676;
                int var23 = var22.length();
                int var24 = 0;
                for (int var25 = 0; var25 < var23; var25++) {
                    var24 = (var24 << 5) - var24 + var22.charAt(var25);
                }
                field664 = var21.containsKey(var24) ? class147.field2418 : class147.field2417;
                client.method469(20);
                return;
            }
            short var27 = 462;
            if (var8 == 1 && var9 >= var27 - 75 && var9 <= var27 + 75 && var10 >= var20 - 20 && var10 <= var20 + 20) {
                field672 = 0;
                field676 = "";
                field677 = "";
                Statics.field1463 = 0;
                Statics.field845 = "";
                field679 = true;
            }
            while (true) {
                while (class126.method3399()) {
                    boolean var28 = false;
                    for (int var29 = 0; var29 < field681.length(); var29++) {
                        if (Statics.field2006 == field681.charAt(var29)) {
                            var28 = true;
                            break;
                        }
                    }
                    if (Statics.field2838 == 13) {
                        field672 = 0;
                        field676 = "";
                        field677 = "";
                        Statics.field1463 = 0;
                        Statics.field845 = "";
                        field679 = true;
                    } else if (field680 == 0) {
                        if (Statics.field2838 == 85 && field676.length() > 0) {
                            field676 = field676.substring(0, field676.length() - 1);
                        }
                        if (Statics.field2838 == 84 || Statics.field2838 == 80) {
                            field680 = 1;
                        }
                        if (var28 && field676.length() < 320) {
                            field676 = field676 + Statics.field2006;
                        }
                    } else if (field680 == 1) {
                        if (Statics.field2838 == 85 && field677.length() > 0) {
                            field677 = field677.substring(0, field677.length() - 1);
                        }
                        if (Statics.field2838 == 84 || Statics.field2838 == 80) {
                            field680 = 0;
                        }
                        if (Statics.field2838 == 84) {
                            field676 = field676.trim();
                            if (field676.length() == 0) {
                                method1449(class145.field2233, class145.field2278, class145.field2214);
                                return;
                            }
                            if (field677.length() == 0) {
                                method1449(class145.field2280, class145.field2281, class145.field2354);
                                return;
                            }
                            method1449(class145.field2386, class145.field2387, class145.field2388);
                            LinkedHashMap var30 = Statics.field140.field130;
                            String var31 = field676;
                            int var32 = var31.length();
                            int var33 = 0;
                            for (int var34 = 0; var34 < var32; var34++) {
                                var33 = (var33 << 5) - var33 + var31.charAt(var34);
                            }
                            field664 = var30.containsKey(var33) ? class147.field2418 : class147.field2417;
                            client.method469(20);
                            return;
                        }
                        if (var28 && field677.length() < 20) {
                            field677 = field677 + Statics.field2006;
                        }
                    }
                }
                return;
            }
        } else if (field672 == 4) {
            short var36 = 302;
            short var37 = 321;
            if (var8 == 1 && var9 >= var36 - 75 && var9 <= var36 + 75 && var10 >= var37 - 20 && var10 <= var37 + 20) {
                Statics.field845.trim();
                if (Statics.field845.length() != 6) {
                    method1449(class145.field2381, class145.field2194, class145.field2195);
                    return;
                }
                Statics.field1463 = Integer.parseInt(Statics.field845);
                Statics.field845 = "";
                field664 = field679 ? class147.field2416 : class147.field2419;
                method1449(class145.field2386, class145.field2387, class145.field2388);
                client.method469(20);
                return;
            }
            if (var8 == 1 && var9 >= 373 && var9 <= 512 && var10 >= 263 && var10 <= 296) {
                field679 = !field679;
            }
            if (var8 == 1 && var9 >= 348 && var9 <= 416 && var10 >= 351 && var10 <= 363) {
                String var38 = client.method2711("secure", true) + "m=totp-authenticator/disableTOTPRequest";
                class127.method2494(var38, true, "openjs", false);
            }
            short var39 = 462;
            if (var8 == 1 && var9 >= var39 - 75 && var9 <= var39 + 75 && var10 >= var37 - 20 && var10 <= var37 + 20) {
                field672 = 0;
                field676 = "";
                field677 = "";
                Statics.field1463 = 0;
                Statics.field845 = "";
            }
            while (class126.method3399()) {
                boolean var40 = false;
                for (int var41 = 0; var41 < field669.length(); var41++) {
                    if (Statics.field2006 == field669.charAt(var41)) {
                        var40 = true;
                        break;
                    }
                }
                if (Statics.field2838 == 13) {
                    field672 = 0;
                    field676 = "";
                    field677 = "";
                    Statics.field1463 = 0;
                    Statics.field845 = "";
                } else {
                    if (Statics.field2838 == 85 && Statics.field845.length() > 0) {
                        Statics.field845 = Statics.field845.substring(0, Statics.field845.length() - 1);
                    }
                    if (Statics.field2838 == 84) {
                        Statics.field845.trim();
                        if (Statics.field845.length() != 6) {
                            method1449(class145.field2381, class145.field2194, class145.field2195);
                            return;
                        }
                        Statics.field1463 = Integer.parseInt(Statics.field845);
                        Statics.field845 = "";
                        field664 = field679 ? class147.field2416 : class147.field2419;
                        method1449(class145.field2386, class145.field2387, class145.field2388);
                        client.method469(20);
                        return;
                    }
                    if (var40 && Statics.field845.length() < 6) {
                        Statics.field845 = Statics.field845 + Statics.field2006;
                    }
                }
            }
        }
    }

    @ObfuscatedName("fc.e(Lgf;Lgf;I)V")
    public static void method2907(class205 arg0, class205 arg1) {
        if (field658) {
            method147(arg0, arg1);
            return;
        }
        if (client.field411 == 0 || client.field411 == 5) {
            byte var2 = 20;
            arg0.method3475(class145.field2231, 382, 245 - var2, 16777215, -1);
            int var3 = 253 - var2;
            class74.method1546(230, var3, 304, 34, 9179409);
            class74.method1546(231, var3 + 1, 302, 32, 0);
            class74.method1544(232, var3 + 2, field683 * 3, 30, 9179409);
            class74.method1544(field683 * 3 + 232, var3 + 2, 300 - field683 * 3, 30, 0);
            arg0.method3475(field671, 382, 276 - var2, 16777215, -1);
        }
        if (client.field411 == 20) {
            Statics.field675.method1598(382 - Statics.field675.field1323 / 2, 271 - Statics.field675.field1324 / 2);
            short var4 = 211;
            arg0.method3475(field686, 382, var4, 16776960, 0);
            int var47 = var4 + 15;
            arg0.method3475(field678, 382, var47, 16776960, 0);
            int var48 = var47 + 15;
            arg0.method3475(field665, 382, var48, 16776960, 0);
            int var49 = var48 + 15;
            int var50 = var49 + 10;
            if (field672 != 4) {
                arg0.method3477(class145.field2389, 272, var50, 16777215, 0);
                short var5 = 200;
                String var6;
                for (var6 = field676; arg0.method3472(var6) > var5; var6 = var6.substring(0, var6.length() - 1)) {
                }
                arg0.method3477(class204.method3502(var6), 312, var50, 16777215, 0);
                var47 = var50 + 15;
                String var8 = class145.field2390;
                String var9 = field677;
                String var10 = class211.method2703('*', var9.length());
                arg0.method3477(var8 + var10, 274, var47, 16777215, 0);
                var47 += 15;
            }
        }
        if (client.field411 == 10 || client.field411 == 11) {
            Statics.field675.method1598(202, 171);
            if (field672 == 0) {
                short var11 = 251;
                arg0.method3475(class145.field2392, 382, var11, 16776960, 0);
                int var51 = var11 + 30;
                short var12 = 302;
                short var13 = 291;
                Statics.field2031.method1598(var12 - 73, var13 - 20);
                arg0.method3525(class145.field2393, var12 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var14 = 462;
                Statics.field2031.method1598(var14 - 73, var13 - 20);
                arg0.method3525(class145.field2394, var14 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field672 == 1) {
                arg0.method3475(class145.field2173, 382, 211, 16776960, 0);
                short var15 = 236;
                arg0.method3475(field686, 382, var15, 16777215, 0);
                int var52 = var15 + 15;
                arg0.method3475(field678, 382, var52, 16777215, 0);
                int var53 = var52 + 15;
                arg0.method3475(field665, 382, var53, 16777215, 0);
                int var54 = var53 + 15;
                short var16 = 302;
                short var17 = 321;
                Statics.field2031.method1598(var16 - 73, var17 - 20);
                arg0.method3475(class145.field2191, var16, var17 + 5, 16777215, 0);
                short var18 = 462;
                Statics.field2031.method1598(var18 - 73, var17 - 20);
                arg0.method3475(class145.field2396, var18, var17 + 5, 16777215, 0);
            } else if (field672 == 2) {
                short var19 = 211;
                arg0.method3475(field686, 382, var19, 16776960, 0);
                int var55 = var19 + 15;
                arg0.method3475(field678, 382, var55, 16776960, 0);
                int var56 = var55 + 15;
                arg0.method3475(field665, 382, var56, 16776960, 0);
                int var57 = var56 + 15;
                int var58 = var57 + 10;
                arg0.method3477(class145.field2389, 272, var58, 16777215, 0);
                short var20 = 200;
                String var21;
                for (var21 = field676; arg0.method3472(var21) > var20; var21 = var21.substring(1)) {
                }
                arg0.method3477(class204.method3502(var21) + (field680 == 0 & client.field348 % 40 < 20 ? Statics.method121(16776960) + class2.field22 : ""), 312, var58, 16777215, 0);
                var55 = var58 + 15;
                String var23 = class145.field2390;
                String var24 = field677;
                String var25 = class211.method2703('*', var24.length());
                arg0.method3477(var23 + var25 + (field680 == 1 & client.field348 % 40 < 20 ? Statics.method121(16776960) + class2.field22 : ""), 274, var55, 16777215, 0);
                var55 += 15;
                short var26 = 302;
                short var27 = 321;
                Statics.field2031.method1598(var26 - 73, var27 - 20);
                arg0.method3475(class145.field2395, var26, var27 + 5, 16777215, 0);
                short var28 = 462;
                Statics.field2031.method1598(var28 - 73, var27 - 20);
                arg0.method3475(class145.field2396, var28, var27 + 5, 16777215, 0);
            } else if (field672 == 4) {
                arg0.method3475(class145.field2384, 382, 211, 16776960, 0);
                short var29 = 236;
                arg0.method3475(field686, 382, var29, 16777215, 0);
                int var59 = var29 + 15;
                arg0.method3475(field678, 382, var59, 16777215, 0);
                int var60 = var59 + 15;
                arg0.method3475(field665, 382, var60, 16777215, 0);
                int var61 = var60 + 15;
                String var31 = class145.field2391;
                String var32 = Statics.field845;
                String var33 = class211.method2703('*', var32.length());
                arg0.method3477(var31 + var33 + (client.field348 % 40 < 20 ? Statics.method121(16776960) + class2.field22 : ""), 274, var61, 16777215, 0);
                int var62 = var61 - 8;
                arg0.method3477(class145.field2167, 373, var62, 16776960, 0);
                int var63 = var62 + 15;
                arg0.method3477(class145.field2399, 373, var63, 16776960, 0);
                int var34 = 373 + arg0.method3472(class145.field2399) + 15;
                int var35 = var63 - arg0.field2948;
                class75 var36;
                if (field679) {
                    var36 = Statics.field504;
                } else {
                    var36 = Statics.field985;
                }
                var36.method1598(var34, var35);
                var59 = var63 + 15;
                short var37 = 302;
                short var38 = 321;
                Statics.field2031.method1598(var37 - 73, var38 - 20);
                arg0.method3475(class145.field2191, var37, var38 + 5, 16777215, 0);
                short var39 = 462;
                Statics.field2031.method1598(var39 - 73, var38 - 20);
                arg0.method3475(class145.field2396, var39, var38 + 5, 16777215, 0);
                arg1.method3475(class145.field2385, 382, var38 + 36, 255, 0);
            }
        }
        if (field668 > 0) {
            method142(field668);
            field668 = 0;
        }
        method542();
        Statics.field673[Statics.field140.field129 ? 1 : 0].method1598(725, 463);
        if (client.field411 > 5 && client.field245 == 0) {
            if (Statics.field573 == null) {
                Statics.field573 = class71.method550(Statics.field974, "sl_button", "");
            } else {
                byte var40 = 5;
                short var41 = 463;
                byte var42 = 100;
                byte var43 = 35;
                Statics.field573.method1598(var40, var41);
                arg0.method3475(class145.field2370 + " " + client.field238, var42 / 2 + var40, var43 / 2 + var41 - 2, 16777215, 0);
                if (Statics.field2928 == null) {
                    arg1.method3475(class145.field2309, var42 / 2 + var40, var43 / 2 + var41 + 12, 16777215, 0);
                } else {
                    arg1.method3475(class145.field2406, var42 / 2 + var40, var43 / 2 + var41 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var44 = Statics.field1929.getGraphics();
            Statics.field60.method1366(var44, 0, 0);
        } catch (Exception var46) {
            Statics.field1929.repaint();
        }
    }

    @ObfuscatedName("bv.h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1449(String arg0, String arg1, String arg2) {
        field686 = arg0;
        field678 = arg1;
        field665 = arg2;
    }

    @ObfuscatedName("cj.p(Lbg;I)V")
    public static final void method1628(class75 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1883.length; var2++) {
            Statics.field1883[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1883[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field119[var8] = (Statics.field1883[var8 - 1] + Statics.field1883[var8 + 1] + Statics.field1883[var8 - 128] + Statics.field1883[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1883;
            Statics.field1883 = Statics.field119;
            Statics.field119 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1324; var11++) {
            for (int var12 = 0; var12 < arg0.field1323; var12++) {
                if (arg0.field1326[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1325;
                    int var14 = var11 + 16 + arg0.field1327;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1883[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("g.j(IB)V")
    public static final void method142(int arg0) {
        short var1 = 256;
        field666 += arg0 * 128;
        if (field666 > Statics.field1883.length) {
            field666 -= Statics.field1883.length;
            int var2 = (int) (Math.random() * 12.0D);
            method1628(Statics.field657[var2]);
        }
        int var3 = 0;
        int var4 = arg0 * 128;
        int var5 = (var1 - arg0) * 128;
        for (int var6 = 0; var6 < var5; var6++) {
            int var7 = Statics.field2042[var3 + var4] - Statics.field1883[field666 + var3 & Statics.field1883.length - 1] * arg0 / 6;
            if (var7 < 0) {
                var7 = 0;
            }
            Statics.field2042[var3++] = var7;
        }
        for (int var8 = var1 - arg0; var8 < var1; var8++) {
            int var9 = var8 * 128;
            for (int var10 = 0; var10 < 128; var10++) {
                int var11 = (int) (Math.random() * 100.0D);
                if (var11 < 50 && var10 > 10 && var10 < 118) {
                    Statics.field2042[var9 + var10] = 255;
                } else {
                    Statics.field2042[var9 + var10] = 0;
                }
            }
        }
        if (field660 > 0) {
            field660 -= arg0 * 4;
        }
        if (field674 > 0) {
            field674 -= arg0 * 4;
        }
        if (field660 == 0 && field674 == 0) {
            int var12 = (int) (Math.random() * (double) (2000 / arg0));
            if (var12 == 0) {
                field660 = 1024;
            }
            if (var12 == 1) {
                field674 = 1024;
            }
        }
        for (int var13 = 0; var13 < var1 - arg0; var13++) {
            field661[var13] = field661[arg0 + var13];
        }
        for (int var14 = var1 - arg0; var14 < var1; var14++) {
            field661[var14] = (int) (Math.sin((double) field663 / 14.0D) * 16.0D + Math.sin((double) field663 / 15.0D) * 14.0D + Math.sin((double) field663 / 16.0D) * 12.0D);
            field663++;
        }
        field667 += arg0 * 1205014829;
        int var15 = ((client.field348 & 0x1) + arg0) / 2;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < field667 * -1916790668; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            Statics.field2042[(var18 << 7) + var17] = 192;
        }
        field667 = 0;
        for (int var19 = 0; var19 < var1; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += Statics.field2042[var21 + var22 + var15];
                }
                if (var22 - (var15 + 1) >= 0) {
                    var20 -= Statics.field2042[var21 + var22 - (var15 + 1)];
                }
                if (var22 >= 0) {
                    Statics.field159[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var1; var25++) {
                int var26 = var25 * 128;
                if (var15 + var25 < var1) {
                    var24 += Statics.field159[var15 * 128 + var23 + var26];
                }
                if (var25 - (var15 + 1) >= 0) {
                    var24 -= Statics.field159[var23 + var26 - (var15 + 1) * 128];
                }
                if (var25 >= 0) {
                    Statics.field2042[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @ObfuscatedName("en.i(IIIS)I")
    public static final int method2706(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("ae.u(I)V")
    public static final void method542() {
        short var0 = 256;
        if (field660 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field660 > 768) {
                    Statics.field662[var1] = method2706(Statics.field656[var1], Statics.field799[var1], 1024 - field660);
                } else if (field660 > 256) {
                    Statics.field662[var1] = Statics.field799[var1];
                } else {
                    Statics.field662[var1] = method2706(Statics.field799[var1], Statics.field656[var1], 256 - field660);
                }
            }
        } else if (field674 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field674 > 768) {
                    Statics.field662[var2] = method2706(Statics.field656[var2], Statics.field2835[var2], 1024 - field674);
                } else if (field674 > 256) {
                    Statics.field662[var2] = Statics.field2835[var2];
                } else {
                    Statics.field662[var2] = method2706(Statics.field2835[var2], Statics.field656[var2], 256 - field674);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field662[var3] = Statics.field656[var3];
            }
        }
        class74.method1538(0, 9, 128, var0 + 7);
        Statics.field2808.method1461(0, 0);
        class74.method1568();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field661[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field2042[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field662[var10];
                    int var14 = Statics.field60.field1299[var5];
                    Statics.field60.field1299[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class74.method1538(637, 9, 765, var0 + 7);
        Statics.field659.method1461(382, 0);
        class74.method1568();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field661[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field2042[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field662[var22];
                    int var26 = Statics.field60.field1299[var20];
                    Statics.field60.field1299[var20++] = ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) + ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("c.l(Lgf;Lgf;I)V")
    public static void method147(class205 arg0, class205 arg1) {
        if (Statics.field1925 == null) {
            Statics.field1925 = class71.method74(Statics.field974, "sl_back", "");
        }
        if (Statics.field1011 == null) {
            Statics.field1011 = class71.method1353(Statics.field974, "sl_flags", "");
        }
        if (Statics.field1129 == null) {
            Statics.field1129 = class71.method1353(Statics.field974, "sl_arrows", "");
        }
        if (Statics.field231 == null) {
            Statics.field231 = class71.method1353(Statics.field974, "sl_stars", "");
        }
        class74.method1544(0, 23, 765, 480, 0);
        class74.method1545(0, 0, 125, 23, 12425273, 9135624);
        class74.method1545(125, 0, 640, 23, 5197647, 2697513);
        arg0.method3475(class145.field2397, 62, 15, 0, -1);
        if (Statics.field231 != null) {
            Statics.field231[1].method1598(140, 1);
            arg1.method3477(class145.field2183, 152, 10, 16777215, -1);
            Statics.field231[0].method1598(140, 12);
            arg1.method3477(class145.field2235, 152, 21, 16777215, -1);
        }
        if (Statics.field1129 != null) {
            short var2 = 280;
            if (field685[0] == 0 && field670[0] == 0) {
                Statics.field1129[2].method1598(var2, 4);
            } else {
                Statics.field1129[0].method1598(var2, 4);
            }
            if (field685[0] == 0 && field670[0] == 1) {
                Statics.field1129[3].method1598(var2 + 15, 4);
            } else {
                Statics.field1129[1].method1598(var2 + 15, 4);
            }
            arg0.method3477(class145.field2400, var2 + 32, 17, 16777215, -1);
            short var3 = 390;
            if (field685[0] == 1 && field670[0] == 0) {
                Statics.field1129[2].method1598(var3, 4);
            } else {
                Statics.field1129[0].method1598(var3, 4);
            }
            if (field685[0] == 1 && field670[0] == 1) {
                Statics.field1129[3].method1598(var3 + 15, 4);
            } else {
                Statics.field1129[1].method1598(var3 + 15, 4);
            }
            arg0.method3477(class145.field2401, var3 + 32, 17, 16777215, -1);
            short var4 = 500;
            if (field685[0] == 2 && field670[0] == 0) {
                Statics.field1129[2].method1598(var4, 4);
            } else {
                Statics.field1129[0].method1598(var4, 4);
            }
            if (field685[0] == 2 && field670[0] == 1) {
                Statics.field1129[3].method1598(var4 + 15, 4);
            } else {
                Statics.field1129[1].method1598(var4 + 15, 4);
            }
            arg0.method3477(class145.field2193, var4 + 32, 17, 16777215, -1);
            short var5 = 610;
            if (field685[0] == 3 && field670[0] == 0) {
                Statics.field1129[2].method1598(var5, 4);
            } else {
                Statics.field1129[0].method1598(var5, 4);
            }
            if (field685[0] == 3 && field670[0] == 1) {
                Statics.field1129[3].method1598(var5 + 15, 4);
            } else {
                Statics.field1129[1].method1598(var5 + 15, 4);
            }
            arg0.method3477(class145.field2403, var5 + 32, 17, 16777215, -1);
        }
        class74.method1544(708, 4, 50, 16, 0);
        arg1.method3475(class145.field2396, 733, 16, 16777215, -1);
        field687 = -1;
        if (Statics.field1925 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= field684) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= field684) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= field684) {
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
            for (int var20 = 0; var20 < field684; var20++) {
                class23 var21 = Statics.field2760[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field587);
                if (var21.field587 == -1) {
                    var23 = class145.field2404;
                    var22 = false;
                } else if (var21.field587 > 1980) {
                    var23 = class145.field2344;
                    var22 = false;
                }
                byte var24;
                if (var21.method504()) {
                    if (var21.method503()) {
                        var24 = 3;
                    } else {
                        var24 = 2;
                    }
                } else if (var21.method503()) {
                    var24 = 1;
                } else {
                    var24 = 0;
                }
                if (class129.field2001 >= var17 && class129.field2002 >= var16 && class129.field2001 < var6 + var17 && class129.field2002 < var7 + var16 && var22) {
                    field687 = var20;
                    Statics.field1925[var24].method1515(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field1925[var24].method1461(var17, var16);
                }
                if (Statics.field1011 != null) {
                    Statics.field1011[(var21.method503() ? 8 : 0) + var21.field575].method1598(var17 + 29, var16);
                }
                arg0.method3475(Integer.toString(var21.field584), var17 + 15, var7 / 2 + var16 + 5, 0, -1);
                arg1.method3475(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var25 = arg1.method3472(Statics.field2760[field687].field574) + 6;
                int var26 = arg1.field2948 + 8;
                class74.method1544(class129.field2001 - var25 / 2, class129.field2002 + 20 + 5, var25, var26, 16777120);
                class74.method1546(class129.field2001 - var25 / 2, class129.field2002 + 20 + 5, var25, var26, 0);
                arg1.method3475(Statics.field2760[field687].field574, class129.field2001, class129.field2002 + 20 + 5 + arg1.field2948 + 4, 0, -1);
            }
        }
        try {
            Graphics var27 = Statics.field1929.getGraphics();
            Statics.field60.method1366(var27, 0, 0);
        } catch (Exception var29) {
            Statics.field1929.repaint();
        }
    }

    @ObfuscatedName("d.k(Leb;I)V")
    public static void method511(class133 arg0) {
        if (class129.field2007 != 1 && Statics.field1896 || class129.field2007 != 4) {
            return;
        }
        short var1 = 280;
        if (class129.field2008 >= var1 && class129.field2008 <= var1 + 14 && class129.field1999 >= 4 && class129.field1999 <= 18) {
            method128(0, 0);
            return;
        }
        if (class129.field2008 >= var1 + 15 && class129.field2008 <= var1 + 80 && class129.field1999 >= 4 && class129.field1999 <= 18) {
            method128(0, 1);
            return;
        }
        short var2 = 390;
        if (class129.field2008 >= var2 && class129.field2008 <= var2 + 14 && class129.field1999 >= 4 && class129.field1999 <= 18) {
            method128(1, 0);
            return;
        }
        if (class129.field2008 >= var2 + 15 && class129.field2008 <= var2 + 80 && class129.field1999 >= 4 && class129.field1999 <= 18) {
            method128(1, 1);
            return;
        }
        short var3 = 500;
        if (class129.field2008 >= var3 && class129.field2008 <= var3 + 14 && class129.field1999 >= 4 && class129.field1999 <= 18) {
            method128(2, 0);
            return;
        }
        if (class129.field2008 >= var3 + 15 && class129.field2008 <= var3 + 80 && class129.field1999 >= 4 && class129.field1999 <= 18) {
            method128(2, 1);
            return;
        }
        short var4 = 610;
        if (class129.field2008 >= var4 && class129.field2008 <= var4 + 14 && class129.field1999 >= 4 && class129.field1999 <= 18) {
            method128(3, 0);
            return;
        }
        if (class129.field2008 >= var4 + 15 && class129.field2008 <= var4 + 80 && class129.field1999 >= 4 && class129.field1999 <= 18) {
            method128(3, 1);
            return;
        }
        if (class129.field2008 >= 708 && class129.field1999 >= 4 && class129.field2008 <= 758 && class129.field1999 <= 20) {
            field658 = false;
            Statics.field2808.method1461(0, 0);
            Statics.field659.method1461(382, 0);
            Statics.field2490.method1598(382 - Statics.field2490.field1323 / 2, 18);
            return;
        }
        if (field687 == -1) {
            return;
        }
        class23 var5 = Statics.field2760[field687];
        method3362(var5);
        field658 = false;
        Statics.field2808.method1461(0, 0);
        Statics.field659.method1461(382, 0);
        Statics.field2490.method1598(382 - Statics.field2490.field1323 / 2, 18);
        return;
    }

    @ObfuscatedName("gd.q(Ld;I)V")
    public static void method3362(class23 arg0) {
        if (arg0.method503() != client.field243) {
            client.field243 = arg0.method503();
            class46.method2071(arg0.method503());
        }
        Statics.field185 = arg0.field571;
        client.field238 = arg0.field584;
        client.field239 = arg0.field583;
        Statics.field1919 = client.field241 == 0 ? 43594 : arg0.field584 + 40000;
        Statics.field2706 = client.field241 == 0 ? 443 : arg0.field584 + 50000;
        Statics.field2476 = Statics.field1919;
    }

    @ObfuscatedName("by.b(I)V")
    public static void method1098() {
        try {
            if (Statics.field2928 == null) {
                Statics.field2928 = new class17(Statics.field1891, new URL(Statics.field11));
            } else {
                byte[] var0 = Statics.field2928.method146();
                if (var0 != null) {
                    class108 var1 = new class108(var0);
                    field684 = var1.method2129();
                    Statics.field2760 = new class23[field684];
                    int var2 = 0;
                    while (var2 < field684) {
                        class23 var3 = Statics.field2760[var2] = new class23();
                        var3.field584 = var1.method2129();
                        var3.field583 = var1.method2132();
                        var3.field571 = var1.method2270();
                        var3.field574 = var1.method2270();
                        var3.field575 = var1.method2299();
                        var3.field587 = var1.method2130();
                        var3.field576 = var2++;
                    }
                    method3389(Statics.field2760, 0, Statics.field2760.length - 1, field685, field670);
                    field658 = true;
                    Statics.field2928 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2928 = null;
        }
    }

    @ObfuscatedName("q.w(IIB)V")
    public static void method128(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field685[var5] != arg0) {
                var2[var4] = field685[var5];
                var3[var4] = field670[var5];
                var4++;
            }
        }
        field685 = var2;
        field670 = var3;
        method3389(Statics.field2760, 0, Statics.field2760.length - 1, field685, field670);
    }

    @ObfuscatedName("gy.g([Ld;II[I[IB)V")
    public static void method3389(class23[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class23 var8 = arg0[var7];
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
                        var11 = arg0[var6].field576;
                        var12 = var8.field576;
                    } else if (arg3[var10] == 1) {
                        var11 = arg0[var6].field587;
                        var12 = var8.field587;
                        if (var11 == -1 && arg4[var10] == 1) {
                            var11 = 2001;
                        }
                        if (var12 == -1 && arg4[var10] == 1) {
                            var12 = 2001;
                        }
                    } else if (arg3[var10] == 3) {
                        var11 = arg0[var6].method503() ? 1 : 0;
                        var12 = var8.method503() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field584;
                        var12 = var8.field584;
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
                        var15 = arg0[var5].field576;
                        var16 = var8.field576;
                    } else if (arg3[var14] == 1) {
                        var15 = arg0[var5].field587;
                        var16 = var8.field587;
                        if (var15 == -1 && arg4[var14] == 1) {
                            var15 = 2001;
                        }
                        if (var16 == -1 && arg4[var14] == 1) {
                            var16 = 2001;
                        }
                    } else if (arg3[var14] == 3) {
                        var15 = arg0[var5].method503() ? 1 : 0;
                        var16 = var8.method503() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field584;
                        var16 = var8.field584;
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
                class23 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method3389(arg0, arg1, var6, arg3, arg4);
        method3389(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

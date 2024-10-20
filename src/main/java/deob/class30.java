package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

@ObfuscatedName("ai")
public class class30 {

    @ObfuscatedName("ai.t")
    public static int[] field651 = new int[256];

    @ObfuscatedName("ai.b")
    public static int field664 = 0;

    @ObfuscatedName("ai.x")
    public static int field653 = 0;

    @ObfuscatedName("ai.ax")
    public static int field654 = 0;

    @ObfuscatedName("ai.ap")
    public static int field655 = 0;

    @ObfuscatedName("ai.ao")
    public static int field643 = 0;

    @ObfuscatedName("ai.ai")
    public static int field657 = 0;

    @ObfuscatedName("ai.aw")
    public static int field658 = 10;

    @ObfuscatedName("ai.am")
    public static String field659 = "";

    @ObfuscatedName("ai.au")
    public static int field660 = 0;

    @ObfuscatedName("ai.ae")
    public static String field661 = "";

    @ObfuscatedName("ai.ab")
    public static String field662 = "";

    @ObfuscatedName("ai.av")
    public static String field676 = "";

    @ObfuscatedName("ai.ay")
    public static String field652 = "";

    @ObfuscatedName("ai.ag")
    public static String field665 = "";

    @ObfuscatedName("ai.aj")
    public static class150 field666 = class150.field2444;

    @ObfuscatedName("ai.al")
    public static boolean field667 = true;

    @ObfuscatedName("ai.ak")
    public static int field668 = 0;

    @ObfuscatedName("ai.ar")
    public static String field663 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ai.aq")
    public static String field646 = "1234567890";

    @ObfuscatedName("ai.ad")
    public static boolean field671 = false;

    @ObfuscatedName("ai.bk")
    public static int field673 = 0;

    @ObfuscatedName("ai.bc")
    public static int[] field674 = new int[] { 0, 1, 2, 3 };

    @ObfuscatedName("ai.br")
    public static int[] field679 = new int[] { 1, 1, 1, 1 };

    @ObfuscatedName("ai.bu")
    public static int field675 = -1;

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.e(Lfv;Lfv;I)I")
    public static int method615(class158 arg0, class158 arg1) {
        int var2 = 0;
        if (arg0.method2860("title.jpg", "")) {
            var2++;
        }
        if (arg1.method2860("logo", "")) {
            var2++;
        }
        if (arg1.method2860("titlebox", "")) {
            var2++;
        }
        if (arg1.method2860("titlebutton", "")) {
            var2++;
        }
        if (arg1.method2860("runes", "")) {
            var2++;
        }
        if (arg1.method2860("title_mute", "")) {
            var2++;
        }
        if (arg1.method2861("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method2861("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method2860("sl_back", "");
        arg1.method2860("sl_flags", "");
        arg1.method2860("sl_arrows", "");
        arg1.method2860("sl_stars", "");
        arg1.method2860("sl_button", "");
        return var2;
    }

    @ObfuscatedName("client.a(Ljava/awt/Component;Lfv;Lfv;ZIS)V")
    public static void method498(Component arg0, class158 arg1, class158 arg2, boolean arg3, int arg4) {
        if (!Statics.field678) {
            field660 = arg4;
            class75.method1588();
            byte[] var5 = arg1.method2859("title.jpg", "");
            Statics.field2745 = new class74(var5, arg0);
            Statics.field647 = Statics.field2745.method1479();
            Statics.field2491 = class72.method951(arg2, "logo", "");
            Statics.field670 = class72.method951(arg2, "titlebox", "");
            Statics.field645 = class72.method951(arg2, "titlebutton", "");
            Statics.field650 = class72.method172(arg2, "runes", "");
            Statics.field2499 = class72.method172(arg2, "title_mute", "");
            Statics.field237 = class72.method951(arg2, "options_radio_buttons,0", "");
            Statics.field506 = class72.method951(arg2, "options_radio_buttons,2", "");
            Statics.field888 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field888[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field888[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field888[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field888[var9 + 192] = 16777215;
            }
            Statics.field1791 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field1791[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field1791[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field1791[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field1791[var13 + 192] = 16777215;
            }
            Statics.field619 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field619[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field619[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field619[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field619[var17 + 192] = 16777215;
            }
            Statics.field1546 = new int[256];
            Statics.field1992 = new int[32768];
            Statics.field1928 = new int[32768];
            method199((class76) null);
            Statics.field1251 = new int[32768];
            Statics.field2103 = new int[32768];
            if (arg3) {
                field652 = "";
                field665 = "";
            }
            Statics.field983 = 0;
            Statics.field1895 = "";
            field667 = true;
            field671 = false;
            if (Statics.field1806.field130) {
                class173.field2799 = 1;
                Statics.field2800 = null;
                Statics.field2896 = -1;
                Statics.field2801 = -1;
                Statics.field2572 = 0;
                Statics.field2440 = false;
                Statics.field2802 = 2;
            } else {
                class159 var18 = Statics.field2042;
                int var19 = var18.method2912("scape main");
                int var20 = var18.method2853(var19, "");
                class173.field2799 = 1;
                Statics.field2800 = var18;
                Statics.field2896 = var19;
                Statics.field2801 = var20;
                Statics.field2572 = 255;
                Statics.field2440 = false;
                Statics.field2802 = 2;
            }
            class162.method203(false);
            Statics.field678 = true;
            Statics.field2745.method1488(0, 0);
            Statics.field647.method1488(382, 0);
            Statics.field2491.method1637(382 - Statics.field2491.field1297 / 2, 18);
        } else if (arg4 == 4) {
            field660 = 4;
        }
    }

    @ObfuscatedName("ap.l(Lew;I)V")
    public static void method572(class136 arg0) {
        if (field671) {
            method114(arg0);
            return;
        }
        if ((class132.field2013 == 1 || !Statics.field517 && class132.field2013 == 4) && class132.field2014 >= 715 && class132.field2006 >= 453) {
            Statics.field1806.field130 = !Statics.field1806.field130;
            class9.method1068();
            if (Statics.field1806.field130) {
                class173.method32();
            } else {
                class173.method501(Statics.field2042, "scape main", "", 255, false);
            }
        }
        if (client.field254 == 5) {
            return;
        }
        field643++;
        if (client.field254 != 10 && client.field254 != 11) {
            return;
        }
        if (client.field251 == 0) {
            if (class132.field2013 == 1 || !Statics.field517 && class132.field2013 == 4) {
                byte var1 = 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class132.field2014 >= var1 && class132.field2014 <= var1 + var3 && class132.field2006 >= var2 && class132.field2006 <= var2 + var4) {
                    method2089();
                    return;
                }
            }
            if (Statics.field1917 != null) {
                method2089();
            }
        }
        int var5 = class132.field2013;
        int var6 = class132.field2014;
        int var7 = class132.field2006;
        if (!Statics.field517 && var5 == 4) {
            var5 = 1;
        }
        if (field660 == 0) {
            short var8 = 302;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class130.method2942(client.method881("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            short var10 = 462;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field245 & 0x4) != 0) {
                    if ((client.field245 & 0x400) == 0) {
                        field661 = class148.field2328;
                        field662 = class148.field2376;
                        field676 = class148.field2377;
                    } else {
                        field661 = class148.field2375;
                        field662 = class148.field2392;
                        field676 = class148.field2383;
                    }
                    field660 = 1;
                    field668 = 0;
                } else if ((client.field245 & 0x400) == 0) {
                    field661 = class148.field2250;
                    field662 = class148.field2372;
                    field676 = class148.field2305;
                    field660 = 2;
                    field668 = 0;
                } else {
                    field661 = class148.field2378;
                    field662 = class148.field2379;
                    field676 = class148.field2181;
                    field660 = 1;
                    field668 = 0;
                }
            }
        } else if (field660 == 1) {
            while (class129.method1906()) {
                if (Statics.field222 == 84) {
                    field661 = class148.field2250;
                    field662 = class148.field2372;
                    field676 = class148.field2305;
                    field660 = 2;
                    field668 = 0;
                } else if (Statics.field222 == 13) {
                    field660 = 0;
                }
            }
            short var11 = 302;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field661 = class148.field2250;
                field662 = class148.field2372;
                field676 = class148.field2305;
                field660 = 2;
                field668 = 0;
            }
            short var13 = 462;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field660 = 0;
            }
        } else if (field660 == 2) {
            short var14 = 231;
            int var32 = var14 + 30;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field668 = 0;
            }
            var32 += 15;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field668 = 1;
            }
            var32 += 15;
            short var15 = 361;
            if (var5 == 1 && var7 >= var15 - 15 && var7 < var15) {
                method2110(class148.field2222, class148.field2403, class148.field2404);
                field660 = 5;
                return;
            }
            short var16 = 302;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field652 = field652.trim();
                if (field652.length() == 0) {
                    method2110(class148.field2277, class148.field2278, class148.field2279);
                    return;
                }
                if (field665.length() == 0) {
                    method2110(class148.field2280, class148.field2281, class148.field2282);
                    return;
                }
                method2110(class148.field2386, class148.field2346, class148.field2388);
                field666 = Statics.field1806.field132.containsKey(class154.method613(field652)) ? class150.field2450 : class150.field2444;
                client.method2387(20);
                return;
            }
            short var18 = 462;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field660 = 0;
                field652 = "";
                field665 = "";
                Statics.field983 = 0;
                Statics.field1895 = "";
                field667 = true;
            }
            while (true) {
                while (class129.method1906()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field663.length(); var20++) {
                        if (Statics.field553 == field663.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field222 == 13) {
                        field660 = 0;
                        field652 = "";
                        field665 = "";
                        Statics.field983 = 0;
                        Statics.field1895 = "";
                        field667 = true;
                    } else if (field668 == 0) {
                        if (Statics.field222 == 85 && field652.length() > 0) {
                            field652 = field652.substring(0, field652.length() - 1);
                        }
                        if (Statics.field222 == 84 || Statics.field222 == 80) {
                            field668 = 1;
                        }
                        if (var19 && field652.length() < 320) {
                            field652 = field652 + Statics.field553;
                        }
                    } else if (field668 == 1) {
                        if (Statics.field222 == 85 && field665.length() > 0) {
                            field665 = field665.substring(0, field665.length() - 1);
                        }
                        if (Statics.field222 == 84 || Statics.field222 == 80) {
                            field668 = 0;
                        }
                        if (Statics.field222 == 84) {
                            field652 = field652.trim();
                            if (field652.length() == 0) {
                                method2110(class148.field2277, class148.field2278, class148.field2279);
                                return;
                            }
                            if (field665.length() == 0) {
                                method2110(class148.field2280, class148.field2281, class148.field2282);
                                return;
                            }
                            method2110(class148.field2386, class148.field2346, class148.field2388);
                            field666 = Statics.field1806.field132.containsKey(class154.method613(field652)) ? class150.field2450 : class150.field2444;
                            client.method2387(20);
                            return;
                        }
                        if (var19 && field665.length() < 20) {
                            field665 = field665 + Statics.field553;
                        }
                    }
                }
                return;
            }
        } else if (field660 == 4) {
            short var21 = 302;
            short var22 = 321;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                Statics.field1895.trim();
                if (Statics.field1895.length() != 6) {
                    method2110(class148.field2211, class148.field2335, class148.field2195);
                    return;
                }
                Statics.field983 = Integer.parseInt(Statics.field1895);
                Statics.field1895 = "";
                field666 = field667 ? class150.field2451 : class150.field2445;
                method2110(class148.field2386, class148.field2346, class148.field2388);
                client.method2387(20);
                return;
            }
            if (var5 == 1 && var6 >= 373 && var6 <= 512 && var7 >= 263 && var7 <= 296) {
                field667 = !field667;
            }
            if (var5 == 1 && var6 >= 348 && var6 <= 416 && var7 >= 351 && var7 <= 363) {
                class130.method2942(client.method881("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            short var23 = 462;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field660 = 0;
                field652 = "";
                field665 = "";
                Statics.field983 = 0;
                Statics.field1895 = "";
            }
            while (class129.method1906()) {
                boolean var24 = false;
                for (int var25 = 0; var25 < field646.length(); var25++) {
                    if (Statics.field553 == field646.charAt(var25)) {
                        var24 = true;
                        break;
                    }
                }
                if (Statics.field222 == 13) {
                    field660 = 0;
                    field652 = "";
                    field665 = "";
                    Statics.field983 = 0;
                    Statics.field1895 = "";
                } else {
                    if (Statics.field222 == 85 && Statics.field1895.length() > 0) {
                        Statics.field1895 = Statics.field1895.substring(0, Statics.field1895.length() - 1);
                    }
                    if (Statics.field222 == 84) {
                        Statics.field1895.trim();
                        if (Statics.field1895.length() != 6) {
                            method2110(class148.field2211, class148.field2335, class148.field2195);
                            return;
                        }
                        Statics.field983 = Integer.parseInt(Statics.field1895);
                        Statics.field1895 = "";
                        field666 = field667 ? class150.field2451 : class150.field2445;
                        method2110(class148.field2386, class148.field2346, class148.field2388);
                        client.method2387(20);
                        return;
                    }
                    if (var24 && Statics.field1895.length() < 6) {
                        Statics.field1895 = Statics.field1895 + Statics.field553;
                    }
                }
            }
        } else if (field660 == 5) {
            short var26 = 302;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                method619();
                return;
            }
            short var28 = 462;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field661 = class148.field2250;
                field662 = class148.field2372;
                field676 = class148.field2305;
                field660 = 2;
                field668 = 0;
                field665 = "";
            }
            while (class129.method1906()) {
                boolean var29 = false;
                for (int var30 = 0; var30 < field663.length(); var30++) {
                    if (Statics.field553 == field663.charAt(var30)) {
                        var29 = true;
                        break;
                    }
                }
                if (Statics.field222 == 13) {
                    field661 = class148.field2250;
                    field662 = class148.field2372;
                    field676 = class148.field2305;
                    field660 = 2;
                    field668 = 0;
                    field665 = "";
                } else {
                    if (Statics.field222 == 85 && field652.length() > 0) {
                        field652 = field652.substring(0, field652.length() - 1);
                    }
                    if (Statics.field222 == 84) {
                        method619();
                        return;
                    }
                    if (var29 && field652.length() < 320) {
                        field652 = field652 + Statics.field553;
                    }
                }
            }
        } else if (field660 == 6) {
            while (true) {
                do {
                    if (!class129.method1906()) {
                        short var31 = 321;
                        if (var5 == 1 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                            field661 = class148.field2250;
                            field662 = class148.field2372;
                            field676 = class148.field2305;
                            field660 = 2;
                            field668 = 0;
                            field665 = "";
                        }
                        return;
                    }
                } while (Statics.field222 != 84 && Statics.field222 != 13);
                field661 = class148.field2250;
                field662 = class148.field2372;
                field676 = class148.field2305;
                field660 = 2;
                field668 = 0;
                field665 = "";
            }
        }
    }

    @ObfuscatedName("am.c(B)V")
    public static void method619() {
        field652 = field652.trim();
        if (field652.length() == 0) {
            method2110(class148.field2222, class148.field2403, class148.field2404);
            return;
        }
        long var0 = class10.method2486();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method136(var0, field652);
        }
        switch(var2) {
            case 2:
                method2110(class148.field2405, class148.field2217, class148.field2407);
                field660 = 6;
                break;
            case 3:
                method2110(class148.field2408, class148.field2409, class148.field2410);
                break;
            case 4:
                method2110(class148.field2400, class148.field2159, class148.field2320);
                break;
            case 5:
                method2110(class148.field2395, class148.field2415, class148.field2298);
                break;
            case 6:
                method2110(class148.field2417, class148.field2418, class148.field2419);
                break;
            case 7:
                method2110(class148.field2206, class148.field2421, class148.field2422);
        }
    }

    @ObfuscatedName("i.u(Lhh;Lhh;Lhh;I)V")
    public static void method109(class214 arg0, class214 arg1, class214 arg2) {
        if (field671) {
            if (Statics.field2804 == null) {
                Statics.field2804 = class72.method1112(Statics.field205, "sl_back", "");
            }
            if (Statics.field620 == null) {
                Statics.field620 = class72.method172(Statics.field205, "sl_flags", "");
            }
            if (Statics.field784 == null) {
                Statics.field784 = class72.method172(Statics.field205, "sl_arrows", "");
            }
            if (Statics.field672 == null) {
                Statics.field672 = class72.method172(Statics.field205, "sl_stars", "");
            }
            class75.method1575(0, 23, 765, 480, 0);
            class75.method1579(0, 0, 125, 23, 12425273, 9135624);
            class75.method1579(125, 0, 640, 23, 5197647, 2697513);
            arg0.method3566(class148.field2423, 62, 15, 0, -1);
            if (Statics.field672 != null) {
                Statics.field672[1].method1637(140, 1);
                arg1.method3622(class148.field2424, 152, 10, 16777215, -1);
                Statics.field672[0].method1637(140, 12);
                arg1.method3622(class148.field2425, 152, 21, 16777215, -1);
            }
            if (Statics.field784 != null) {
                short var3 = 280;
                if (field674[0] == 0 && field679[0] == 0) {
                    Statics.field784[2].method1637(var3, 4);
                } else {
                    Statics.field784[0].method1637(var3, 4);
                }
                if (field674[0] == 0 && field679[0] == 1) {
                    Statics.field784[3].method1637(var3 + 15, 4);
                } else {
                    Statics.field784[1].method1637(var3 + 15, 4);
                }
                arg0.method3622(class148.field2286, var3 + 32, 17, 16777215, -1);
                short var4 = 390;
                if (field674[0] == 1 && field679[0] == 0) {
                    Statics.field784[2].method1637(var4, 4);
                } else {
                    Statics.field784[0].method1637(var4, 4);
                }
                if (field674[0] == 1 && field679[0] == 1) {
                    Statics.field784[3].method1637(var4 + 15, 4);
                } else {
                    Statics.field784[1].method1637(var4 + 15, 4);
                }
                arg0.method3622(class148.field2173, var4 + 32, 17, 16777215, -1);
                short var5 = 500;
                if (field674[0] == 2 && field679[0] == 0) {
                    Statics.field784[2].method1637(var5, 4);
                } else {
                    Statics.field784[0].method1637(var5, 4);
                }
                if (field674[0] == 2 && field679[0] == 1) {
                    Statics.field784[3].method1637(var5 + 15, 4);
                } else {
                    Statics.field784[1].method1637(var5 + 15, 4);
                }
                arg0.method3622(class148.field2428, var5 + 32, 17, 16777215, -1);
                short var6 = 610;
                if (field674[0] == 3 && field679[0] == 0) {
                    Statics.field784[2].method1637(var6, 4);
                } else {
                    Statics.field784[0].method1637(var6, 4);
                }
                if (field674[0] == 3 && field679[0] == 1) {
                    Statics.field784[3].method1637(var6 + 15, 4);
                } else {
                    Statics.field784[1].method1637(var6 + 15, 4);
                }
                arg0.method3622(class148.field2429, var6 + 32, 17, 16777215, -1);
            }
            class75.method1575(708, 4, 50, 16, 0);
            arg1.method3566(class148.field2396, 733, 16, 16777215, -1);
            field675 = -1;
            if (Statics.field2804 != null) {
                byte var7 = 88;
                byte var8 = 19;
                int var9 = 765 / (var7 + 1);
                int var10 = 480 / (var8 + 1);
                int var11;
                int var12;
                do {
                    var11 = var10;
                    var12 = var9;
                    if ((var9 - 1) * var10 >= field673) {
                        var9--;
                    }
                    if ((var10 - 1) * var9 >= field673) {
                        var10--;
                    }
                    if ((var10 - 1) * var9 >= field673) {
                        var10--;
                    }
                } while (var10 != var11 || var9 != var12);
                int var13 = (765 - var7 * var9) / (var9 + 1);
                if (var13 > 5) {
                    var13 = 5;
                }
                int var14 = (480 - var8 * var10) / (var10 + 1);
                if (var14 > 5) {
                    var14 = 5;
                }
                int var15 = (765 - var7 * var9 - (var9 - 1) * var13) / 2;
                int var16 = (480 - var8 * var10 - (var10 - 1) * var14) / 2;
                int var17 = var16 + 23;
                int var18 = var15;
                int var19 = 0;
                boolean var20 = false;
                for (int var21 = 0; var21 < field673; var21++) {
                    class24 var22 = Statics.field531[var21];
                    boolean var23 = true;
                    String var24 = Integer.toString(var22.field573);
                    if (var22.field573 == -1) {
                        var24 = class148.field2234;
                        var23 = false;
                    } else if (var22.field573 > 1980) {
                        var24 = class148.field2221;
                        var23 = false;
                    }
                    byte var25;
                    if (var22.method542()) {
                        if (var22.method540()) {
                            var25 = 3;
                        } else {
                            var25 = 2;
                        }
                    } else if (var22.method540()) {
                        var25 = 1;
                    } else {
                        var25 = 0;
                    }
                    if (class132.field2007 >= var18 && class132.field2008 >= var17 && class132.field2007 < var7 + var18 && class132.field2008 < var8 + var17 && var23) {
                        field675 = var21;
                        Statics.field2804[var25].method1552(var18, var17, 128, 16777215);
                        var20 = true;
                    } else {
                        Statics.field2804[var25].method1488(var18, var17);
                    }
                    if (Statics.field620 != null) {
                        Statics.field620[(var22.method540() ? 8 : 0) + var22.field576].method1637(var18 + 29, var17);
                    }
                    arg0.method3566(Integer.toString(var22.field574), var18 + 15, var8 / 2 + var17 + 5, 0, -1);
                    arg1.method3566(var24, var18 + 60, var8 / 2 + var17 + 5, 268435455, -1);
                    var17 += var8 + var14;
                    var19++;
                    if (var19 >= var10) {
                        var17 = var16 + 23;
                        var18 += var7 + var13;
                        var19 = 0;
                    }
                }
                if (var20) {
                    int var26 = arg1.method3592(Statics.field531[field675].field575) + 6;
                    int var27 = arg1.field3050 + 8;
                    class75.method1575(class132.field2007 - var26 / 2, class132.field2008 + 20 + 5, var26, var27, 16777120);
                    class75.method1580(class132.field2007 - var26 / 2, class132.field2008 + 20 + 5, var26, var27, 0);
                    arg1.method3566(Statics.field531[field675].field575, class132.field2007, class132.field2008 + 20 + 5 + arg1.field3050 + 4, 0, -1);
                }
            }
            try {
                Graphics var28 = Statics.field2498.getGraphics();
                Statics.field580.method1395(var28, 0, 0);
            } catch (Exception var115) {
                Statics.field2498.repaint();
            }
            return;
        }
        if (client.field254 == 0 || client.field254 == 5) {
            byte var30 = 20;
            arg0.method3566(class148.field2366, 382, 245 - var30, 16777215, -1);
            int var31 = 253 - var30;
            class75.method1580(230, var31, 304, 34, 9179409);
            class75.method1580(231, var31 + 1, 302, 32, 0);
            class75.method1575(232, var31 + 2, field658 * 3, 30, 9179409);
            class75.method1575(field658 * 3 + 232, var31 + 2, 300 - field658 * 3, 30, 0);
            arg0.method3566(field659, 382, 276 - var30, 16777215, -1);
        }
        if (client.field254 == 20) {
            Statics.field670.method1637(382 - Statics.field670.field1297 / 2, 271 - Statics.field670.field1293 / 2);
            short var32 = 211;
            arg0.method3566(field661, 382, var32, 16776960, 0);
            int var117 = var32 + 15;
            arg0.method3566(field662, 382, var117, 16776960, 0);
            int var118 = var117 + 15;
            arg0.method3566(field676, 382, var118, 16776960, 0);
            int var119 = var118 + 15;
            int var120 = var119 + 10;
            if (field660 != 4) {
                arg0.method3622(class148.field2389, 272, var120, 16777215, 0);
                short var33 = 200;
                String var34;
                for (var34 = field652; arg0.method3592(var34) > var33; var34 = var34.substring(0, var34.length() - 1)) {
                }
                arg0.method3622(class213.method3565(var34), 312, var120, 16777215, 0);
                var117 = var120 + 15;
                String var36 = class148.field2390;
                String var37 = field665;
                int var38 = var37.length();
                char[] var39 = new char[var38];
                for (int var40 = 0; var40 < var38; var40++) {
                    var39[var40] = '*';
                }
                String var41 = new String(var39);
                arg0.method3622(var36 + var41, 274, var117, 16777215, 0);
                var117 += 15;
            }
        }
        if (client.field254 == 10 || client.field254 == 11) {
            Statics.field670.method1637(202, 171);
            if (field660 == 0) {
                short var43 = 251;
                arg0.method3566(class148.field2247, 382, var43, 16776960, 0);
                int var121 = var43 + 30;
                short var44 = 302;
                short var45 = 291;
                Statics.field645.method1637(var44 - 73, var45 - 20);
                arg0.method3569(class148.field2180, var44 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                short var46 = 462;
                Statics.field645.method1637(var46 - 73, var45 - 20);
                arg0.method3569(class148.field2394, var46 - 73, var45 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field660 == 1) {
                arg0.method3566(class148.field2374, 382, 211, 16776960, 0);
                short var47 = 236;
                arg0.method3566(field661, 382, var47, 16777215, 0);
                int var122 = var47 + 15;
                arg0.method3566(field662, 382, var122, 16777215, 0);
                int var123 = var122 + 15;
                arg0.method3566(field676, 382, var123, 16777215, 0);
                int var124 = var123 + 15;
                short var48 = 302;
                short var49 = 321;
                Statics.field645.method1637(var48 - 73, var49 - 20);
                arg0.method3566(class148.field2420, var48, var49 + 5, 16777215, 0);
                short var50 = 462;
                Statics.field645.method1637(var50 - 73, var49 - 20);
                arg0.method3566(class148.field2396, var50, var49 + 5, 16777215, 0);
            } else if (field660 == 2) {
                short var51 = 211;
                arg0.method3566(field661, 382, var51, 16776960, 0);
                int var125 = var51 + 15;
                arg0.method3566(field662, 382, var125, 16776960, 0);
                int var126 = var125 + 15;
                arg0.method3566(field676, 382, var126, 16776960, 0);
                int var127 = var126 + 15;
                int var128 = var127 + 10;
                arg0.method3622(class148.field2389, 272, var128, 16777215, 0);
                short var52 = 200;
                String var53;
                for (var53 = field652; arg0.method3592(var53) > var52; var53 = var53.substring(1)) {
                }
                arg0.method3622(class213.method3565(var53) + (field668 == 0 & client.field256 % 40 < 20 ? class2.method550(16776960) + class2.field21 : ""), 312, var128, 16777215, 0);
                var125 = var128 + 15;
                String var55 = class148.field2390;
                String var56 = field665;
                int var57 = var56.length();
                char[] var58 = new char[var57];
                for (int var59 = 0; var59 < var57; var59++) {
                    var58[var59] = '*';
                }
                String var60 = new String(var58);
                arg0.method3622(var55 + var60 + (field668 == 1 & client.field256 % 40 < 20 ? class2.method550(16776960) + class2.field21 : ""), 274, var125, 16777215, 0);
                var125 += 15;
                short var62 = 302;
                short var63 = 321;
                Statics.field645.method1637(var62 - 73, var63 - 20);
                arg0.method3566(class148.field2413, var62, var63 + 5, 16777215, 0);
                short var64 = 462;
                Statics.field645.method1637(var64 - 73, var63 - 20);
                arg0.method3566(class148.field2396, var64, var63 + 5, 16777215, 0);
                short var65 = 357;
                arg1.method3566(class148.field2236, 382, var65, 16776960, 0);
            } else if (field660 == 4) {
                arg0.method3566(class148.field2384, 382, 211, 16776960, 0);
                short var66 = 236;
                arg0.method3566(field661, 382, var66, 16777215, 0);
                int var129 = var66 + 15;
                arg0.method3566(field662, 382, var129, 16777215, 0);
                int var130 = var129 + 15;
                arg0.method3566(field676, 382, var130, 16777215, 0);
                int var131 = var130 + 15;
                arg0.method3622(class148.field2334 + class154.method2782(Statics.field1895) + (client.field256 % 40 < 20 ? class2.method550(16776960) + class2.field21 : ""), 274, var131, 16777215, 0);
                int var132 = var131 - 8;
                arg0.method3622(class148.field2167, 373, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg0.method3622(class148.field2168, 373, var133, 16776960, 0);
                int var67 = 373 + arg0.method3592(class148.field2168) + 15;
                int var68 = var133 - arg0.field3050;
                class76 var69;
                if (field667) {
                    var69 = Statics.field506;
                } else {
                    var69 = Statics.field237;
                }
                var69.method1637(var67, var68);
                var129 = var133 + 15;
                short var70 = 302;
                short var71 = 321;
                Statics.field645.method1637(var70 - 73, var71 - 20);
                arg0.method3566(class148.field2420, var70, var71 + 5, 16777215, 0);
                short var72 = 462;
                Statics.field645.method1637(var72 - 73, var71 - 20);
                arg0.method3566(class148.field2396, var72, var71 + 5, 16777215, 0);
                arg1.method3566(class148.field2385, 382, var71 + 36, 255, 0);
            } else if (field660 == 5) {
                arg0.method3566(class148.field2398, 382, 201, 16776960, 0);
                short var73 = 221;
                arg2.method3566(field661, 382, var73, 16776960, 0);
                int var134 = var73 + 15;
                arg2.method3566(field662, 382, var134, 16776960, 0);
                int var135 = var134 + 15;
                arg2.method3566(field676, 382, var135, 16776960, 0);
                int var136 = var135 + 15;
                int var137 = var136 + 14;
                arg0.method3622(class148.field2399, 237, var137, 16777215, 0);
                short var74 = 174;
                String var75;
                for (var75 = field652; arg0.method3592(var75) > var74; var75 = var75.substring(1)) {
                }
                arg0.method3622(class213.method3565(var75) + (client.field256 % 40 < 20 ? class2.method550(16776960) + class2.field21 : ""), 348, var137, 16777215, 0);
                var134 = var137 + 15;
                short var76 = 302;
                short var77 = 321;
                Statics.field645.method1637(var76 - 73, var77 - 20);
                arg0.method3566(class148.field2348, var76, var77 + 5, 16777215, 0);
                short var78 = 462;
                Statics.field645.method1637(var78 - 73, var77 - 20);
                arg0.method3566(class148.field2371, var78, var77 + 5, 16777215, 0);
            } else if (field660 == 6) {
                short var79 = 211;
                arg0.method3566(field661, 382, var79, 16776960, 0);
                int var138 = var79 + 15;
                arg0.method3566(field662, 382, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg0.method3566(field676, 382, var139, 16776960, 0);
                int var140 = var139 + 15;
                short var80 = 382;
                short var81 = 321;
                Statics.field645.method1637(var80 - 73, var81 - 20);
                arg0.method3566(class148.field2371, var80, var81 + 5, 16777215, 0);
            }
        }
        if (field643 > 0) {
            int var82 = field643;
            short var83 = 256;
            field654 += var82 * 128;
            if (field654 > Statics.field1992.length) {
                field654 -= Statics.field1992.length;
                int var84 = (int) (Math.random() * 12.0D);
                method199(Statics.field650[var84]);
            }
            int var85 = 0;
            int var86 = var82 * 128;
            int var87 = (var83 - var82) * 128;
            for (int var88 = 0; var88 < var87; var88++) {
                int var89 = Statics.field1251[var85 + var86] - Statics.field1992[field654 + var85 & Statics.field1992.length - 1] * var82 / 6;
                if (var89 < 0) {
                    var89 = 0;
                }
                Statics.field1251[var85++] = var89;
            }
            for (int var90 = var83 - var82; var90 < var83; var90++) {
                int var91 = var90 * 128;
                for (int var92 = 0; var92 < 128; var92++) {
                    int var93 = (int) (Math.random() * 100.0D);
                    if (var93 < 50 && var92 > 10 && var92 < 118) {
                        Statics.field1251[var91 + var92] = 255;
                    } else {
                        Statics.field1251[var91 + var92] = 0;
                    }
                }
            }
            if (field664 > 0) {
                field664 -= var82 * 4;
            }
            if (field653 > 0) {
                field653 -= var82 * 4;
            }
            if (field664 == 0 && field653 == 0) {
                int var94 = (int) (Math.random() * (double) (2000 / var82));
                if (var94 == 0) {
                    field664 = 1024;
                }
                if (var94 == 1) {
                    field653 = 1024;
                }
            }
            for (int var95 = 0; var95 < var83 - var82; var95++) {
                field651[var95] = field651[var82 + var95];
            }
            for (int var96 = var83 - var82; var96 < var83; var96++) {
                field651[var96] = (int) (Math.sin((double) field657 / 14.0D) * 16.0D + Math.sin((double) field657 / 15.0D) * 14.0D + Math.sin((double) field657 / 16.0D) * 12.0D);
                field657++;
            }
            field655 += var82 * -956820343;
            int var97 = ((client.field256 & 0x1) + var82) / 2;
            if (var97 > 0) {
                for (int var98 = 0; var98 < field655 * -818205628; var98++) {
                    int var99 = (int) (Math.random() * 124.0D) + 2;
                    int var100 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field1251[(var100 << 7) + var99] = 192;
                }
                field655 = 0;
                int var101 = 0;
                label419: while (true) {
                    if (var101 >= var83) {
                        int var105 = 0;
                        while (true) {
                            if (var105 >= 128) {
                                break label419;
                            }
                            int var106 = 0;
                            for (int var107 = -var97; var107 < var83; var107++) {
                                int var108 = var107 * 128;
                                if (var97 + var107 < var83) {
                                    var106 += Statics.field2103[var97 * 128 + var105 + var108];
                                }
                                if (var107 - (var97 + 1) >= 0) {
                                    var106 -= Statics.field2103[var105 + var108 - (var97 + 1) * 128];
                                }
                                if (var107 >= 0) {
                                    Statics.field1251[var105 + var108] = var106 / (var97 * 2 + 1);
                                }
                            }
                            var105++;
                        }
                    }
                    int var102 = 0;
                    int var103 = var101 * 128;
                    for (int var104 = -var97; var104 < 128; var104++) {
                        if (var97 + var104 < 128) {
                            var102 += Statics.field1251[var103 + var104 + var97];
                        }
                        if (var104 - (var97 + 1) >= 0) {
                            var102 -= Statics.field1251[var103 + var104 - (var97 + 1)];
                        }
                        if (var104 >= 0) {
                            Statics.field2103[var103 + var104] = var102 / (var97 * 2 + 1);
                        }
                    }
                    var101++;
                }
            }
            field643 = 0;
        }
        method2674();
        Statics.field2499[Statics.field1806.field130 ? 1 : 0].method1637(725, 463);
        if (client.field254 > 5 && client.field251 == 0) {
            if (Statics.field147 == null) {
                Statics.field147 = class72.method951(Statics.field205, "sl_button", "");
            } else {
                byte var109 = 5;
                short var110 = 463;
                byte var111 = 100;
                byte var112 = 35;
                Statics.field147.method1637(var109, var110);
                arg0.method3566(class148.field2325 + " " + client.field244, var111 / 2 + var109, var112 / 2 + var110 - 2, 16777215, 0);
                if (Statics.field1917 == null) {
                    arg1.method3566(class148.field2433, var111 / 2 + var109, var112 / 2 + var110 + 12, 16777215, 0);
                } else {
                    arg1.method3566(class148.field2432, var111 / 2 + var109, var112 / 2 + var110 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var113 = Statics.field2498.getGraphics();
            Statics.field580.method1395(var113, 0, 0);
        } catch (Exception var116) {
            Statics.field2498.repaint();
        }
    }

    @ObfuscatedName("dd.w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method2110(String arg0, String arg1, String arg2) {
        field661 = arg0;
        field662 = arg1;
        field676 = arg2;
    }

    @ObfuscatedName("z.i(Lbs;B)V")
    public static final void method199(class76 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field1992.length; var2++) {
            Statics.field1992[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field1992[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1928[var8] = (Statics.field1992[var8 - 1] + Statics.field1992[var8 + 1] + Statics.field1992[var8 - 128] + Statics.field1992[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field1992;
            Statics.field1992 = Statics.field1928;
            Statics.field1928 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1293; var11++) {
            for (int var12 = 0; var12 < arg0.field1297; var12++) {
                if (arg0.field1290[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1294;
                    int var14 = var11 + 16 + arg0.field1295;
                    int var15 = (var14 << 7) + var13;
                    Statics.field1992[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("t.r(IIII)I")
    public static final int method192(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("eo.f(B)V")
    public static final void method2674() {
        short var0 = 256;
        if (field664 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (field664 > 768) {
                    Statics.field1546[var1] = method192(Statics.field888[var1], Statics.field1791[var1], 1024 - field664);
                } else if (field664 > 256) {
                    Statics.field1546[var1] = Statics.field1791[var1];
                } else {
                    Statics.field1546[var1] = method192(Statics.field1791[var1], Statics.field888[var1], 256 - field664);
                }
            }
        } else if (field653 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (field653 > 768) {
                    Statics.field1546[var2] = method192(Statics.field888[var2], Statics.field619[var2], 1024 - field653);
                } else if (field653 > 256) {
                    Statics.field1546[var2] = Statics.field619[var2];
                } else {
                    Statics.field1546[var2] = method192(Statics.field619[var2], Statics.field888[var2], 256 - field653);
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                Statics.field1546[var3] = Statics.field888[var3];
            }
        }
        class75.method1612(0, 9, 128, var0 + 7);
        Statics.field2745.method1488(0, 0);
        class75.method1598();
        int var4 = 0;
        int var5 = 6885;
        for (int var6 = 1; var6 < var0 - 1; var6++) {
            int var7 = (var0 - var6) * field651[var6] / var0;
            int var8 = var7 + 22;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = Statics.field1251[var4++];
                if (var10 == 0) {
                    var5++;
                } else {
                    int var12 = 256 - var10;
                    int var13 = Statics.field1546[var10];
                    int var14 = Statics.field580.field1267[var5];
                    Statics.field580.field1267[var5++] = ((var13 & 0xFF00) * var10 + (var14 & 0xFF00) * var12 & 0xFF0000) + ((var13 & 0xFF00FF) * var10 + (var14 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
                }
            }
            var5 += var8 + 765 - 128;
        }
        class75.method1612(637, 9, 765, var0 + 7);
        Statics.field647.method1488(382, 0);
        class75.method1598();
        int var15 = 0;
        int var16 = 7546;
        for (int var17 = 1; var17 < var0 - 1; var17++) {
            int var18 = (var0 - var17) * field651[var17] / var0;
            int var19 = 103 - var18;
            int var20 = var16 + var18;
            for (int var21 = 0; var21 < var19; var21++) {
                int var22 = Statics.field1251[var15++];
                if (var22 == 0) {
                    var20++;
                } else {
                    int var24 = 256 - var22;
                    int var25 = Statics.field1546[var22];
                    int var26 = Statics.field580.field1267[var20];
                    Statics.field580.field1267[var20++] = ((var25 & 0xFF00FF) * var22 + (var26 & 0xFF00FF) * var24 & 0xFF00FF00) + ((var25 & 0xFF00) * var22 + (var26 & 0xFF00) * var24 & 0xFF0000) >> 8;
                }
            }
            var15 += 128 - var19;
            var16 = 765 - var19 - var18 + var20;
        }
    }

    @ObfuscatedName("r.g(Lew;B)V")
    public static void method114(class136 arg0) {
        if (class132.field2013 != 1 && Statics.field517 || class132.field2013 != 4) {
            return;
        }
        short var1 = 280;
        if (class132.field2014 >= var1 && class132.field2014 <= var1 + 14 && class132.field2006 >= 4 && class132.field2006 <= 18) {
            method105(0, 0);
            return;
        }
        if (class132.field2014 >= var1 + 15 && class132.field2014 <= var1 + 80 && class132.field2006 >= 4 && class132.field2006 <= 18) {
            method105(0, 1);
            return;
        }
        short var2 = 390;
        if (class132.field2014 >= var2 && class132.field2014 <= var2 + 14 && class132.field2006 >= 4 && class132.field2006 <= 18) {
            method105(1, 0);
            return;
        }
        if (class132.field2014 >= var2 + 15 && class132.field2014 <= var2 + 80 && class132.field2006 >= 4 && class132.field2006 <= 18) {
            method105(1, 1);
            return;
        }
        short var3 = 500;
        if (class132.field2014 >= var3 && class132.field2014 <= var3 + 14 && class132.field2006 >= 4 && class132.field2006 <= 18) {
            method105(2, 0);
            return;
        }
        if (class132.field2014 >= var3 + 15 && class132.field2014 <= var3 + 80 && class132.field2006 >= 4 && class132.field2006 <= 18) {
            method105(2, 1);
            return;
        }
        short var4 = 610;
        if (class132.field2014 >= var4 && class132.field2014 <= var4 + 14 && class132.field2006 >= 4 && class132.field2006 <= 18) {
            method105(3, 0);
            return;
        }
        if (class132.field2014 >= var4 + 15 && class132.field2014 <= var4 + 80 && class132.field2006 >= 4 && class132.field2006 <= 18) {
            method105(3, 1);
            return;
        }
        if (class132.field2014 >= 708 && class132.field2006 >= 4 && class132.field2014 <= 758 && class132.field2006 <= 20) {
            field671 = false;
            Statics.field2745.method1488(0, 0);
            Statics.field647.method1488(382, 0);
            Statics.field2491.method1637(382 - Statics.field2491.field1297 / 2, 18);
            return;
        }
        if (field675 == -1) {
            return;
        }
        class24 var5 = Statics.field531[field675];
        method839(var5);
        field671 = false;
        Statics.field2745.method1488(0, 0);
        Statics.field647.method1488(382, 0);
        Statics.field2491.method1637(382 - Statics.field2491.field1297 / 2, 18);
        return;
    }

    @ObfuscatedName("ak.o(Lv;I)V")
    public static void method839(class24 arg0) {
        if (arg0.method540() != client.field249) {
            client.field249 = arg0.method540();
            boolean var1 = arg0.method540();
            if (Statics.field1904 != var1) {
                class47.field995.method3303();
                class47.field1023.method3303();
                class47.field997.method3303();
                Statics.field1904 = var1;
            }
        }
        Statics.field606 = arg0.field578;
        client.field244 = arg0.field574;
        client.field245 = arg0.field571;
        Statics.field152 = client.field247 == 0 ? 43594 : arg0.field574 + 40000;
        Statics.field705 = client.field247 == 0 ? 443 : arg0.field574 + 50000;
        Statics.field1558 = Statics.field152;
    }

    @ObfuscatedName("cc.h(S)V")
    public static void method2089() {
        try {
            if (Statics.field1917 == null) {
                Statics.field1917 = new class18(Statics.field879, new URL(Statics.field1434));
            } else {
                byte[] var0 = Statics.field1917.method207();
                if (var0 != null) {
                    class111 var1 = new class111(var0);
                    field673 = var1.method2178();
                    Statics.field531 = new class24[field673];
                    int var2 = 0;
                    while (var2 < field673) {
                        class24 var3 = Statics.field531[var2] = new class24();
                        var3.field574 = var1.method2178();
                        var3.field571 = var1.method2378();
                        var3.field578 = var1.method2167();
                        var3.field575 = var1.method2167();
                        var3.field576 = var1.method2176();
                        var3.field573 = var1.method2236();
                        var3.field582 = var2++;
                    }
                    method96(Statics.field531, 0, Statics.field531.length - 1, field674, field679);
                    field671 = true;
                    Statics.field1917 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field1917 = null;
        }
    }

    @ObfuscatedName("i.s(IIB)V")
    public static void method105(int arg0, int arg1) {
        int[] var2 = new int[4];
        int[] var3 = new int[4];
        var2[0] = arg0;
        var3[0] = arg1;
        int var4 = 1;
        for (int var5 = 0; var5 < 4; var5++) {
            if (field674[var5] != arg0) {
                var2[var4] = field674[var5];
                var3[var4] = field679[var5];
                var4++;
            }
        }
        field674 = var2;
        field679 = var3;
        method96(Statics.field531, 0, Statics.field531.length - 1, field674, field679);
    }

    @ObfuscatedName("w.j([Lv;II[I[IB)V")
    public static void method96(class24[] arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg1 >= arg2) {
            return;
        }
        int var5 = arg1 - 1;
        int var6 = arg2 + 1;
        int var7 = (arg1 + arg2) / 2;
        class24 var8 = arg0[var7];
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
                        var11 = arg0[var6].field582;
                        var12 = var8.field582;
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
                        var11 = arg0[var6].method540() ? 1 : 0;
                        var12 = var8.method540() ? 1 : 0;
                    } else {
                        var11 = arg0[var6].field574;
                        var12 = var8.field574;
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
                        var15 = arg0[var5].field582;
                        var16 = var8.field582;
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
                        var15 = arg0[var5].method540() ? 1 : 0;
                        var16 = var8.method540() ? 1 : 0;
                    } else {
                        var15 = arg0[var5].field574;
                        var16 = var8.field574;
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
                class24 var17 = arg0[var5];
                arg0[var5] = arg0[var6];
                arg0[var6] = var17;
            }
        }
        method96(arg0, arg1, var6, arg3, arg4);
        method96(arg0, var6 + 1, arg2, arg3, arg4);
    }
}

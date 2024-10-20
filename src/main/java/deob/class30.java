package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("ax")
public class class30 {

    @ObfuscatedName("ax.d")
    public static int field661 = 0;

    @ObfuscatedName("ax.r")
    public static int field686 = field661 + 202;

    @ObfuscatedName("ax.s")
    public static int[] field669 = new int[256];

    @ObfuscatedName("ax.b")
    public static int field672 = 0;

    @ObfuscatedName("ax.t")
    public static int field663 = 0;

    @ObfuscatedName("ax.ae")
    public static int field668 = 0;

    @ObfuscatedName("ax.ax")
    public static int field671 = 0;

    @ObfuscatedName("ax.al")
    public static int field675 = 0;

    @ObfuscatedName("ax.ar")
    public static int field690 = 0;

    @ObfuscatedName("ax.as")
    public static int field676 = 10;

    @ObfuscatedName("ax.ab")
    public static String field677 = "";

    @ObfuscatedName("ax.ao")
    public static int field678 = 0;

    @ObfuscatedName("ax.ac")
    public static String field679 = "";

    @ObfuscatedName("ax.az")
    public static String field680 = "";

    @ObfuscatedName("ax.at")
    public static String field681 = "";

    @ObfuscatedName("ax.aa")
    public static String field682 = "";

    @ObfuscatedName("ax.an")
    public static String field683 = "";

    @ObfuscatedName("ax.aw")
    public static class150 field684 = class150.field2494;

    @ObfuscatedName("ax.aq")
    public static boolean field685 = true;

    @ObfuscatedName("ax.ay")
    public static int field694 = 0;

    @ObfuscatedName("ax.am")
    public static String field674 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("ax.aj")
    public static String field688 = "1234567890";

    @ObfuscatedName("ax.ap")
    public static boolean field689 = false;

    @ObfuscatedName("ax.bw")
    public static int field691 = -1;

    public class30() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("g.n(Ljava/awt/Component;Lfs;Lfs;ZII)V")
    public static void method77(Component arg0, class158 arg1, class158 arg2, boolean arg3, int arg4) {
        if (!Statics.field687) {
            field678 = arg4;
            class75.method1616();
            byte[] var5 = arg1.method2982("title.jpg", "");
            Statics.field529 = new class74(var5, arg0);
            Statics.field1311 = Statics.field529.method1543();
            Statics.field665 = class72.method3076(arg2, "logo", "");
            Statics.field673 = class72.method3076(arg2, "titlebox", "");
            Statics.field662 = class72.method3076(arg2, "titlebutton", "");
            Statics.field2552 = class72.method589(arg2, "runes", "");
            Statics.field666 = class72.method589(arg2, "title_mute", "");
            Statics.field667 = class72.method3076(arg2, "options_radio_buttons,0", "");
            Statics.field222 = class72.method3076(arg2, "options_radio_buttons,2", "");
            Statics.field1983 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1983[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1983[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1983[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1983[var9 + 192] = 16777215;
            }
            Statics.field631 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field631[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field631[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field631[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field631[var13 + 192] = 16777215;
            }
            Statics.field1926 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field1926[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field1926[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field1926[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field1926[var17 + 192] = 16777215;
            }
            Statics.field54 = new int[256];
            Statics.field703 = new int[32768];
            Statics.field1693 = new int[32768];
            method2876((class76) null);
            Statics.field568 = new int[32768];
            Statics.field146 = new int[32768];
            if (arg3) {
                field682 = "";
                field683 = "";
            }
            Statics.field1038 = 0;
            Statics.field547 = "";
            field685 = true;
            field689 = false;
            if (Statics.field608.field128) {
                class174.field2856 = 1;
                Statics.field87 = null;
                Statics.field2194 = -1;
                Statics.field717 = -1;
                Statics.field2151 = 0;
                Statics.field63 = false;
                Statics.field1994 = 2;
            } else {
                class159 var18 = Statics.field593;
                int var19 = var18.method2963("scape main");
                int var20 = var18.method2964(var19, "");
                class174.field2856 = 1;
                Statics.field87 = var18;
                Statics.field2194 = var19;
                Statics.field717 = var20;
                Statics.field2151 = 255;
                Statics.field63 = false;
                Statics.field1994 = 2;
            }
            Statics.method611(false);
            Statics.field687 = true;
            field661 = (Statics.field1461 - client.field458) / 2;
            field686 = field661 + 202;
            Statics.field529.method1508(field661, 0);
            Statics.field1311.method1508(field661 + 382, 0);
            Statics.field665.method1647(field661 + 382 - Statics.field665.field1356 / 2, 18);
        } else if (arg4 == 4) {
            field678 = 4;
        }
    }

    @ObfuscatedName("cb.d(B)V")
    public static void method1671() {
        if (!Statics.field687) {
            return;
        }
        Statics.field673 = null;
        Statics.field662 = null;
        Statics.field2552 = null;
        Statics.field529 = null;
        Statics.field1311 = null;
        Statics.field665 = null;
        Statics.field666 = null;
        Statics.field667 = null;
        Statics.field222 = null;
        Statics.field706 = null;
        Statics.field624 = null;
        Statics.field133 = null;
        Statics.field664 = null;
        Statics.field2190 = null;
        Statics.field1983 = null;
        Statics.field631 = null;
        Statics.field1926 = null;
        Statics.field54 = null;
        Statics.field703 = null;
        Statics.field1693 = null;
        Statics.field568 = null;
        Statics.field146 = null;
        class174.field2856 = 1;
        Statics.field87 = null;
        Statics.field2194 = -1;
        Statics.field717 = -1;
        Statics.field2151 = 0;
        Statics.field63 = false;
        Statics.field1994 = 2;
        Statics.method611(true);
        Statics.field687 = false;
    }

    @ObfuscatedName("ch.z(Lej;I)V")
    public static void method1960(class136 arg0) {
        if (field689) {
            method1869(arg0);
            return;
        }
        if ((class132.field2067 == 1 || !Statics.field699 && class132.field2067 == 4) && class132.field2069 >= field661 + 765 - 50 && class132.field2063 >= 453) {
            Statics.field608.field128 = !Statics.field608.field128;
            class9.method1415();
            if (Statics.field608.field128) {
                class174.method2548();
            } else {
                class174.method628(Statics.field593, "scape main", "", 255, false);
            }
        }
        if (client.field453 == 5) {
            return;
        }
        field675++;
        if (client.field453 != 10 && client.field453 != 11) {
            return;
        }
        if (client.field323 == 0) {
            if (class132.field2067 == 1 || !Statics.field699 && class132.field2067 == 4) {
                int var1 = field661 + 5;
                short var2 = 463;
                byte var3 = 100;
                byte var4 = 35;
                if (class132.field2069 >= var1 && class132.field2069 <= var1 + var3 && class132.field2063 >= var2 && class132.field2063 <= var2 + var4) {
                    if (class24.method30()) {
                        field689 = true;
                    }
                    return;
                }
            }
            if (Statics.field2796 != null && class24.method30()) {
                field689 = true;
            }
        }
        int var5 = class132.field2067;
        int var6 = class132.field2069;
        int var7 = class132.field2063;
        if (!Statics.field699 && var5 == 4) {
            var5 = 1;
        }
        if (field678 == 0) {
            int var8 = field686 + 180 - 80;
            short var9 = 291;
            if (var5 == 1 && var6 >= var8 - 75 && var6 <= var8 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class130.method133(client.method604("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
            }
            int var10 = field686 + 180 + 80;
            if (var5 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                if ((client.field241 & 0x4) != 0) {
                    if ((client.field241 & 0x400) == 0) {
                        field679 = class148.field2325;
                        field680 = class148.field2205;
                        field681 = class148.field2263;
                    } else {
                        field679 = class148.field2262;
                        field680 = class148.field2427;
                        field681 = class148.field2309;
                    }
                    field678 = 1;
                    field694 = 0;
                } else if ((client.field241 & 0x400) == 0) {
                    field679 = class148.field2424;
                    field680 = class148.field2417;
                    field681 = class148.field2418;
                    field678 = 2;
                    field694 = 0;
                } else {
                    field679 = class148.field2423;
                    field680 = class148.field2350;
                    field681 = class148.field2425;
                    field678 = 1;
                    field694 = 0;
                }
            }
        } else if (field678 == 1) {
            while (class129.method2556()) {
                if (Statics.field700 == 84) {
                    field679 = class148.field2424;
                    field680 = class148.field2417;
                    field681 = class148.field2418;
                    field678 = 2;
                    field694 = 0;
                } else if (Statics.field700 == 13) {
                    field678 = 0;
                }
            }
            int var11 = field686 + 180 - 80;
            short var12 = 321;
            if (var5 == 1 && var6 >= var11 - 75 && var6 <= var11 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field679 = class148.field2424;
                field680 = class148.field2417;
                field681 = class148.field2418;
                field678 = 2;
                field694 = 0;
            }
            int var13 = field686 + 180 + 80;
            if (var5 == 1 && var6 >= var13 - 75 && var6 <= var13 + 75 && var7 >= var12 - 20 && var7 <= var12 + 20) {
                field678 = 0;
            }
        } else if (field678 == 2) {
            short var14 = 231;
            int var32 = var14 + 30;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field694 = 0;
            }
            var32 += 15;
            if (var5 == 1 && var7 >= var32 - 15 && var7 < var32) {
                field694 = 1;
            }
            var32 += 15;
            short var15 = 361;
            if (var5 == 1 && var7 >= var15 - 15 && var7 < var15) {
                method2943(class148.field2447, class148.field2220, class148.field2449);
                field678 = 5;
                return;
            }
            int var16 = field686 + 180 - 80;
            short var17 = 321;
            if (var5 == 1 && var6 >= var16 - 75 && var6 <= var16 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field682 = field682.trim();
                if (field682.length() == 0) {
                    method2943(class148.field2322, class148.field2316, class148.field2324);
                    return;
                }
                if (field683.length() == 0) {
                    method2943(class148.field2232, class148.field2326, class148.field2327);
                    return;
                }
                method2943(class148.field2431, class148.field2448, class148.field2367);
                field684 = Statics.field608.field135.containsKey(class154.method167(field682)) ? class150.field2491 : class150.field2494;
                client.method2731(20);
                return;
            }
            int var18 = field686 + 180 + 80;
            if (var5 == 1 && var6 >= var18 - 75 && var6 <= var18 + 75 && var7 >= var17 - 20 && var7 <= var17 + 20) {
                field678 = 0;
                field682 = "";
                field683 = "";
                Statics.field1038 = 0;
                Statics.field547 = "";
                field685 = true;
            }
            while (true) {
                while (class129.method2556()) {
                    boolean var19 = false;
                    for (int var20 = 0; var20 < field674.length(); var20++) {
                        if (Statics.field1972 == field674.charAt(var20)) {
                            var19 = true;
                            break;
                        }
                    }
                    if (Statics.field700 == 13) {
                        field678 = 0;
                        field682 = "";
                        field683 = "";
                        Statics.field1038 = 0;
                        Statics.field547 = "";
                        field685 = true;
                    } else if (field694 == 0) {
                        if (Statics.field700 == 85 && field682.length() > 0) {
                            field682 = field682.substring(0, field682.length() - 1);
                        }
                        if (Statics.field700 == 84 || Statics.field700 == 80) {
                            field694 = 1;
                        }
                        if (var19 && field682.length() < 320) {
                            field682 = field682 + Statics.field1972;
                        }
                    } else if (field694 == 1) {
                        if (Statics.field700 == 85 && field683.length() > 0) {
                            field683 = field683.substring(0, field683.length() - 1);
                        }
                        if (Statics.field700 == 84 || Statics.field700 == 80) {
                            field694 = 0;
                        }
                        if (Statics.field700 == 84) {
                            field682 = field682.trim();
                            if (field682.length() == 0) {
                                method2943(class148.field2322, class148.field2316, class148.field2324);
                                return;
                            }
                            if (field683.length() == 0) {
                                method2943(class148.field2232, class148.field2326, class148.field2327);
                                return;
                            }
                            method2943(class148.field2431, class148.field2448, class148.field2367);
                            field684 = Statics.field608.field135.containsKey(class154.method167(field682)) ? class150.field2491 : class150.field2494;
                            client.method2731(20);
                            return;
                        }
                        if (var19 && field683.length() < 20) {
                            field683 = field683 + Statics.field1972;
                        }
                    }
                }
                return;
            }
        } else if (field678 == 4) {
            int var21 = field686 + 180 - 80;
            short var22 = 321;
            if (var5 == 1 && var6 >= var21 - 75 && var6 <= var21 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                Statics.field547.trim();
                if (Statics.field547.length() != 6) {
                    method2943(class148.field2238, class148.field2467, class148.field2389);
                    return;
                }
                Statics.field1038 = Integer.parseInt(Statics.field547);
                Statics.field547 = "";
                field684 = field685 ? class150.field2490 : class150.field2492;
                method2943(class148.field2431, class148.field2448, class148.field2367);
                client.method2731(20);
                return;
            }
            if (var5 == 1 && var6 >= field686 + 180 - 9 && var6 <= field686 + 180 + 130 && var7 >= 263 && var7 <= 296) {
                field685 = !field685;
            }
            if (var5 == 1 && var6 >= field686 + 180 - 34 && var6 <= field686 + 180 + 34 && var7 >= 351 && var7 <= 363) {
                class130.method133(client.method604("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
            }
            int var23 = field686 + 180 + 80;
            if (var5 == 1 && var6 >= var23 - 75 && var6 <= var23 + 75 && var7 >= var22 - 20 && var7 <= var22 + 20) {
                field678 = 0;
                field682 = "";
                field683 = "";
                Statics.field1038 = 0;
                Statics.field547 = "";
            }
            while (class129.method2556()) {
                boolean var24 = false;
                for (int var25 = 0; var25 < field688.length(); var25++) {
                    if (Statics.field1972 == field688.charAt(var25)) {
                        var24 = true;
                        break;
                    }
                }
                if (Statics.field700 == 13) {
                    field678 = 0;
                    field682 = "";
                    field683 = "";
                    Statics.field1038 = 0;
                    Statics.field547 = "";
                } else {
                    if (Statics.field700 == 85 && Statics.field547.length() > 0) {
                        Statics.field547 = Statics.field547.substring(0, Statics.field547.length() - 1);
                    }
                    if (Statics.field700 == 84) {
                        Statics.field547.trim();
                        if (Statics.field547.length() != 6) {
                            method2943(class148.field2238, class148.field2467, class148.field2389);
                            return;
                        }
                        Statics.field1038 = Integer.parseInt(Statics.field547);
                        Statics.field547 = "";
                        field684 = field685 ? class150.field2490 : class150.field2492;
                        method2943(class148.field2431, class148.field2448, class148.field2367);
                        client.method2731(20);
                        return;
                    }
                    if (var24 && Statics.field547.length() < 6) {
                        Statics.field547 = Statics.field547 + Statics.field1972;
                    }
                }
            }
        } else if (field678 == 5) {
            int var26 = field686 + 180 - 80;
            short var27 = 321;
            if (var5 == 1 && var6 >= var26 - 75 && var6 <= var26 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                method644();
                return;
            }
            int var28 = field686 + 180 + 80;
            if (var5 == 1 && var6 >= var28 - 75 && var6 <= var28 + 75 && var7 >= var27 - 20 && var7 <= var27 + 20) {
                field679 = class148.field2424;
                field680 = class148.field2417;
                field681 = class148.field2418;
                field678 = 2;
                field694 = 0;
                field683 = "";
            }
            while (class129.method2556()) {
                boolean var29 = false;
                for (int var30 = 0; var30 < field674.length(); var30++) {
                    if (Statics.field1972 == field674.charAt(var30)) {
                        var29 = true;
                        break;
                    }
                }
                if (Statics.field700 == 13) {
                    field679 = class148.field2424;
                    field680 = class148.field2417;
                    field681 = class148.field2418;
                    field678 = 2;
                    field694 = 0;
                    field683 = "";
                } else {
                    if (Statics.field700 == 85 && field682.length() > 0) {
                        field682 = field682.substring(0, field682.length() - 1);
                    }
                    if (Statics.field700 == 84) {
                        method644();
                        return;
                    }
                    if (var29 && field682.length() < 320) {
                        field682 = field682 + Statics.field1972;
                    }
                }
            }
        } else if (field678 == 6) {
            while (true) {
                do {
                    if (!class129.method2556()) {
                        short var31 = 321;
                        if (var5 == 1 && var7 >= var31 - 20 && var7 <= var31 + 20) {
                            field679 = class148.field2424;
                            field680 = class148.field2417;
                            field681 = class148.field2418;
                            field678 = 2;
                            field694 = 0;
                            field683 = "";
                        }
                        return;
                    }
                } while (Statics.field700 != 84 && Statics.field700 != 13);
                field679 = class148.field2424;
                field680 = class148.field2417;
                field681 = class148.field2418;
                field678 = 2;
                field694 = 0;
                field683 = "";
            }
        }
    }

    @ObfuscatedName("as.y(I)V")
    public static void method644() {
        field682 = field682.trim();
        if (field682.length() == 0) {
            method2943(class148.field2447, class148.field2220, class148.field2449);
            return;
        }
        long var0 = class10.method2442();
        int var2;
        if (var0 == 0L) {
            var2 = 5;
        } else {
            var2 = class10.method3181(var0, field682);
        }
        switch(var2) {
            case 2:
                method2943(class148.field2450, class148.field2451, class148.field2421);
                field678 = 6;
                break;
            case 3:
                method2943(class148.field2245, class148.field2456, class148.field2455);
                break;
            case 4:
                method2943(class148.field2434, class148.field2337, class148.field2458);
                break;
            case 5:
                method2943(class148.field2302, class148.field2460, class148.field2461);
                break;
            case 6:
                method2943(class148.field2462, class148.field2463, class148.field2464);
                break;
            case 7:
                method2943(class148.field2465, class148.field2342, class148.field2386);
        }
    }

    @ObfuscatedName("ao.e(Lhd;Lhd;Lhd;ZI)V")
    public static void method674(class215 arg0, class215 arg1, class215 arg2, boolean arg3) {
        if (arg3) {
            field661 = (Statics.field1461 - client.field458) / 2;
            field686 = field661 + 202;
        }
        if (field689) {
            if (Statics.field706 == null) {
                Statics.field706 = class72.method2519(Statics.field1381, "sl_back", "");
            }
            if (Statics.field624 == null) {
                Statics.field624 = class72.method589(Statics.field1381, "sl_flags", "");
            }
            if (Statics.field133 == null) {
                Statics.field133 = class72.method589(Statics.field1381, "sl_arrows", "");
            }
            if (Statics.field664 == null) {
                Statics.field664 = class72.method589(Statics.field1381, "sl_stars", "");
            }
            class75.method1593(field661, 23, 765, 480, 0);
            class75.method1594(field661, 0, 125, 23, 12425273, 9135624);
            class75.method1594(field661 + 125, 0, 640, 23, 5197647, 2697513);
            arg0.method3662(class148.field2439, field661 + 62, 15, 0, -1);
            if (Statics.field664 != null) {
                Statics.field664[1].method1647(field661 + 140, 1);
                arg1.method3660(class148.field2413, field661 + 152, 10, 16777215, -1);
                Statics.field664[0].method1647(field661 + 140, 12);
                arg1.method3660(class148.field2468, field661 + 152, 21, 16777215, -1);
            }
            if (Statics.field133 != null) {
                int var4 = field661 + 280;
                if (class24.field590[0] == 0 && class24.field589[0] == 0) {
                    Statics.field133[2].method1647(var4, 4);
                } else {
                    Statics.field133[0].method1647(var4, 4);
                }
                if (class24.field590[0] == 0 && class24.field589[0] == 1) {
                    Statics.field133[3].method1647(var4 + 15, 4);
                } else {
                    Statics.field133[1].method1647(var4 + 15, 4);
                }
                arg0.method3660(class148.field2471, var4 + 32, 17, 16777215, -1);
                int var5 = field661 + 390;
                if (class24.field590[0] == 1 && class24.field589[0] == 0) {
                    Statics.field133[2].method1647(var5, 4);
                } else {
                    Statics.field133[0].method1647(var5, 4);
                }
                if (class24.field590[0] == 1 && class24.field589[0] == 1) {
                    Statics.field133[3].method1647(var5 + 15, 4);
                } else {
                    Statics.field133[1].method1647(var5 + 15, 4);
                }
                arg0.method3660(class148.field2472, var5 + 32, 17, 16777215, -1);
                int var6 = field661 + 500;
                if (class24.field590[0] == 2 && class24.field589[0] == 0) {
                    Statics.field133[2].method1647(var6, 4);
                } else {
                    Statics.field133[0].method1647(var6, 4);
                }
                if (class24.field590[0] == 2 && class24.field589[0] == 1) {
                    Statics.field133[3].method1647(var6 + 15, 4);
                } else {
                    Statics.field133[1].method1647(var6 + 15, 4);
                }
                arg0.method3660(class148.field2272, var6 + 32, 17, 16777215, -1);
                int var7 = field661 + 610;
                if (class24.field590[0] == 3 && class24.field589[0] == 0) {
                    Statics.field133[2].method1647(var7, 4);
                } else {
                    Statics.field133[0].method1647(var7, 4);
                }
                if (class24.field590[0] == 3 && class24.field589[0] == 1) {
                    Statics.field133[3].method1647(var7 + 15, 4);
                } else {
                    Statics.field133[1].method1647(var7 + 15, 4);
                }
                arg0.method3660(class148.field2404, var7 + 32, 17, 16777215, -1);
            }
            class75.method1593(field661 + 708, 4, 50, 16, 0);
            arg1.method3662(class148.field2441, field661 + 708 + 25, 16, 16777215, -1);
            int var8 = 0;
            int var9 = 33554432;
            int var10 = client.field241 & var9;
            for (int var11 = 0; var11 < class24.field587; var11++) {
                class24 var12 = Statics.field591[var11];
                if ((var12.field586 & var9) == var10 || (var12.field586 & var9) == 0) {
                    var8++;
                }
            }
            field691 = -1;
            if (Statics.field706 != null) {
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
                int var24 = field661 + var21;
                int var25 = 0;
                boolean var26 = false;
                for (int var27 = 0; var27 < class24.field587; var27++) {
                    class24 var28 = Statics.field591[var27];
                    if ((var28.field586 & var9) == var10 || (var28.field586 & var9) == 0) {
                        boolean var29 = true;
                        String var30 = Integer.toString(var28.field583);
                        if (var28.field583 == -1) {
                            var30 = class148.field2475;
                            var29 = false;
                        } else if (var28.field583 > 1980) {
                            var30 = class148.field2476;
                            var29 = false;
                        }
                        byte var31;
                        if (var28.method586()) {
                            if (var28.method560()) {
                                var31 = 3;
                            } else {
                                var31 = 2;
                            }
                        } else if (var28.method560()) {
                            var31 = 1;
                        } else {
                            var31 = 0;
                        }
                        if (class132.field2061 >= var24 && class132.field2062 * 130670055 >= var23 && class132.field2061 < var13 + var24 && class132.field2062 * 130670055 < var14 + var23 && var29) {
                            field691 = var27;
                            Statics.field706[var31].method1514(var24, var23, 128, 16777215);
                            var26 = true;
                        } else {
                            Statics.field706[var31].method1508(var24, var23);
                        }
                        if (Statics.field624 != null) {
                            Statics.field624[(var28.method560() ? 8 : 0) + var28.field596].method1647(var24 + 29, var23);
                        }
                        arg0.method3662(Integer.toString(var28.field601), var24 + 15, var14 / 2 + var23 + 5, 0, -1);
                        arg1.method3662(var30, var24 + 60, var14 / 2 + var23 + 5, 268435455, -1);
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
                    int var32 = arg1.method3655(Statics.field591[field691].field595) + 6;
                    int var33 = arg1.field3085 + 8;
                    class75.method1593(class132.field2061 - var32 / 2, class132.field2062 * 130670055 + 20 + 5, var32, var33, 16777120);
                    class75.method1595(class132.field2061 - var32 / 2, class132.field2062 * 130670055 + 20 + 5, var32, var33, 0);
                    arg1.method3662(Statics.field591[field691].field595, class132.field2061, class132.field2062 * 130670055 + 20 + 5 + arg1.field3085 + 4, 0, -1);
                }
            }
            try {
                Graphics var34 = Statics.field910.getGraphics();
                Statics.field233.method1419(var34, 0, 0);
            } catch (Exception var132) {
                Statics.field910.repaint();
            }
            return;
        }
        if (arg3) {
            Statics.field529.method1508(field661, 0);
            Statics.field1311.method1508(field661 + 382, 0);
            Statics.field665.method1647(field661 + 382 - Statics.field665.field1356 / 2, 18);
        }
        if (client.field453 == 0 || client.field453 == 5) {
            byte var36 = 20;
            arg0.method3662(class148.field2415, field686 + 180, 245 - var36, 16777215, -1);
            int var37 = 253 - var36;
            class75.method1595(field686 + 180 - 152, var37, 304, 34, 9179409);
            class75.method1595(field686 + 180 - 151, var37 + 1, 302, 32, 0);
            class75.method1593(field686 + 180 - 150, var37 + 2, field676 * 3, 30, 9179409);
            class75.method1593(field676 * 3 + (field686 + 180 - 150), var37 + 2, 300 - field676 * 3, 30, 0);
            arg0.method3662(field677, field686 + 180, 276 - var36, 16777215, -1);
        }
        if (client.field453 == 20) {
            Statics.field673.method1647(field686 + 180 - Statics.field673.field1356 / 2, 271 - Statics.field673.field1357 / 2);
            short var38 = 211;
            arg0.method3662(field679, field686 + 180, var38, 16776960, 0);
            int var134 = var38 + 15;
            arg0.method3662(field680, field686 + 180, var134, 16776960, 0);
            int var135 = var134 + 15;
            arg0.method3662(field681, field686 + 180, var135, 16776960, 0);
            int var136 = var135 + 15;
            int var137 = var136 + 10;
            if (field678 != 4) {
                arg0.method3660(class148.field2271, field686 + 180 - 110, var137, 16777215, 0);
                short var39 = 200;
                String var40;
                for (var40 = field682; arg0.method3655(var40) > var39; var40 = var40.substring(0, var40.length() - 1)) {
                }
                arg0.method3660(class214.method3659(var40), field686 + 180 - 70, var137, 16777215, 0);
                var134 = var137 + 15;
                arg0.method3660(class148.field2435 + Statics.method532(field683), field686 + 180 - 108, var134, 16777215, 0);
                var134 += 15;
            }
        }
        if (client.field453 == 10 || client.field453 == 11) {
            Statics.field673.method1647(field686, 171);
            if (field678 == 0) {
                short var41 = 251;
                arg0.method3662(class148.field2437, field686 + 180, var41, 16776960, 0);
                int var138 = var41 + 30;
                int var42 = field686 + 180 - 80;
                short var43 = 291;
                Statics.field662.method1647(var42 - 73, var43 - 20);
                arg0.method3663(class148.field2438, var42 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var44 = field686 + 180 + 80;
                Statics.field662.method1647(var44 - 73, var43 - 20);
                arg0.method3663(class148.field2419, var44 - 73, var43 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field678 == 1) {
                arg0.method3662(class148.field2236, field686 + 180, 211, 16776960, 0);
                short var45 = 236;
                arg0.method3662(field679, field686 + 180, var45, 16777215, 0);
                int var139 = var45 + 15;
                arg0.method3662(field680, field686 + 180, var139, 16777215, 0);
                int var140 = var139 + 15;
                arg0.method3662(field681, field686 + 180, var140, 16777215, 0);
                int var141 = var140 + 15;
                int var46 = field686 + 180 - 80;
                short var47 = 321;
                Statics.field662.method1647(var46 - 73, var47 - 20);
                arg0.method3662(class148.field2401, var46, var47 + 5, 16777215, 0);
                int var48 = field686 + 180 + 80;
                Statics.field662.method1647(var48 - 73, var47 - 20);
                arg0.method3662(class148.field2441, var48, var47 + 5, 16777215, 0);
            } else if (field678 == 2) {
                short var49 = 211;
                arg0.method3662(field679, field686 + 180, var49, 16776960, 0);
                int var142 = var49 + 15;
                arg0.method3662(field680, field686 + 180, var142, 16776960, 0);
                int var143 = var142 + 15;
                arg0.method3662(field681, field686 + 180, var143, 16776960, 0);
                int var144 = var143 + 15;
                int var145 = var144 + 10;
                arg0.method3660(class148.field2271, field686 + 180 - 110, var145, 16777215, 0);
                short var50 = 200;
                String var51;
                for (var51 = field682; arg0.method3655(var51) > var50; var51 = var51.substring(1)) {
                }
                arg0.method3660(class214.method3659(var51) + (field694 == 0 & client.field249 % 40 < 20 ? class2.method155(16776960) + class2.field21 : ""), field686 + 180 - 70, var145, 16777215, 0);
                var142 = var145 + 15;
                arg0.method3660(class148.field2435 + Statics.method532(field683) + (field694 == 1 & client.field249 % 40 < 20 ? class2.method155(16776960) + class2.field21 : ""), field686 + 180 - 108, var142, 16777215, 0);
                var142 += 15;
                int var52 = field686 + 180 - 80;
                short var53 = 321;
                Statics.field662.method1647(var52 - 73, var53 - 20);
                arg0.method3662(class148.field2440, var52, var53 + 5, 16777215, 0);
                int var54 = field686 + 180 + 80;
                Statics.field662.method1647(var54 - 73, var53 - 20);
                arg0.method3662(class148.field2441, var54, var53 + 5, 16777215, 0);
                short var55 = 357;
                arg1.method3662(class148.field2442, field686 + 180, var55, 16776960, 0);
            } else if (field678 == 4) {
                arg0.method3662(class148.field2429, field686 + 180, 211, 16776960, 0);
                short var56 = 236;
                arg0.method3662(field679, field686 + 180, var56, 16777215, 0);
                int var146 = var56 + 15;
                arg0.method3662(field680, field686 + 180, var146, 16777215, 0);
                int var147 = var146 + 15;
                arg0.method3662(field681, field686 + 180, var147, 16777215, 0);
                int var148 = var147 + 15;
                arg0.method3660(class148.field2370 + Statics.method532(Statics.field547) + (client.field249 % 40 < 20 ? class2.method155(16776960) + class2.field21 : ""), field686 + 180 - 108, var148, 16777215, 0);
                int var149 = var148 - 8;
                arg0.method3660(class148.field2212, field686 + 180 - 9, var149, 16776960, 0);
                int var150 = var149 + 15;
                arg0.method3660(class148.field2213, field686 + 180 - 9, var150, 16776960, 0);
                int var57 = field686 + 180 - 9 + arg0.method3655(class148.field2213) + 15;
                int var58 = var150 - arg0.field3085;
                class76 var59;
                if (field685) {
                    var59 = Statics.field222;
                } else {
                    var59 = Statics.field667;
                }
                var59.method1647(var57, var58);
                var146 = var150 + 15;
                int var60 = field686 + 180 - 80;
                short var61 = 321;
                Statics.field662.method1647(var60 - 73, var61 - 20);
                arg0.method3662(class148.field2401, var60, var61 + 5, 16777215, 0);
                int var62 = field686 + 180 + 80;
                Statics.field662.method1647(var62 - 73, var61 - 20);
                arg0.method3662(class148.field2441, var62, var61 + 5, 16777215, 0);
                arg1.method3662(class148.field2430, field686 + 180, var61 + 36, 255, 0);
            } else if (field678 == 5) {
                arg0.method3662(class148.field2459, field686 + 180, 201, 16776960, 0);
                short var63 = 221;
                arg2.method3662(field679, field686 + 180, var63, 16776960, 0);
                int var151 = var63 + 15;
                arg2.method3662(field680, field686 + 180, var151, 16776960, 0);
                int var152 = var151 + 15;
                arg2.method3662(field681, field686 + 180, var152, 16776960, 0);
                int var153 = var152 + 15;
                int var154 = var153 + 14;
                arg0.method3660(class148.field2444, field686 + 180 - 145, var154, 16777215, 0);
                short var64 = 174;
                String var65;
                for (var65 = field682; arg0.method3655(var65) > var64; var65 = var65.substring(1)) {
                }
                arg0.method3660(class214.method3659(var65) + (client.field249 % 40 < 20 ? class2.method155(16776960) + class2.field21 : ""), field686 + 180 - 34, var154, 16777215, 0);
                var151 = var154 + 15;
                int var66 = field686 + 180 - 80;
                short var67 = 321;
                Statics.field662.method1647(var66 - 73, var67 - 20);
                arg0.method3662(class148.field2445, var66, var67 + 5, 16777215, 0);
                int var68 = field686 + 180 + 80;
                Statics.field662.method1647(var68 - 73, var67 - 20);
                arg0.method3662(class148.field2446, var68, var67 + 5, 16777215, 0);
            } else if (field678 == 6) {
                short var69 = 211;
                arg0.method3662(field679, field686 + 180, var69, 16776960, 0);
                int var155 = var69 + 15;
                arg0.method3662(field680, field686 + 180, var155, 16776960, 0);
                int var156 = var155 + 15;
                arg0.method3662(field681, field686 + 180, var156, 16776960, 0);
                int var157 = var156 + 15;
                int var70 = field686 + 180;
                short var71 = 321;
                Statics.field662.method1647(var70 - 73, var71 - 20);
                arg0.method3662(class148.field2446, var70, var71 + 5, 16777215, 0);
            }
        }
        if (field675 > 0) {
            int var72 = field675;
            short var73 = 256;
            field668 += var72 * 128;
            if (field668 > Statics.field703.length) {
                field668 -= Statics.field703.length;
                int var74 = (int) (Math.random() * 12.0D);
                method2876(Statics.field2552[var74]);
            }
            int var75 = 0;
            int var76 = var72 * 128;
            int var77 = (var73 - var72) * 128;
            for (int var78 = 0; var78 < var77; var78++) {
                int var79 = Statics.field568[var75 + var76] - Statics.field703[field668 + var75 & Statics.field703.length - 1] * var72 / 6;
                if (var79 < 0) {
                    var79 = 0;
                }
                Statics.field568[var75++] = var79;
            }
            for (int var80 = var73 - var72; var80 < var73; var80++) {
                int var81 = var80 * 128;
                for (int var82 = 0; var82 < 128; var82++) {
                    int var83 = (int) (Math.random() * 100.0D);
                    if (var83 < 50 && var82 > 10 && var82 < 118) {
                        Statics.field568[var81 + var82] = 255;
                    } else {
                        Statics.field568[var81 + var82] = 0;
                    }
                }
            }
            if (field672 > 0) {
                field672 -= var72 * 4;
            }
            if (field663 > 0) {
                field663 -= var72 * 4;
            }
            if (field672 == 0 && field663 == 0) {
                int var84 = (int) (Math.random() * (double) (2000 / var72));
                if (var84 == 0) {
                    field672 = 1024;
                }
                if (var84 == 1) {
                    field663 = 1024;
                }
            }
            for (int var85 = 0; var85 < var73 - var72; var85++) {
                field669[var85] = field669[var72 + var85];
            }
            for (int var86 = var73 - var72; var86 < var73; var86++) {
                field669[var86] = (int) (Math.sin((double) field690 / 14.0D) * 16.0D + Math.sin((double) field690 / 15.0D) * 14.0D + Math.sin((double) field690 / 16.0D) * 12.0D);
                field690++;
            }
            field671 += var72 * -256811247;
            int var87 = ((client.field249 & 0x1) + var72) / 2;
            if (var87 > 0) {
                for (int var88 = 0; var88 < field671 * -666336732; var88++) {
                    int var89 = (int) (Math.random() * 124.0D) + 2;
                    int var90 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field568[(var90 << 7) + var89] = 192;
                }
                field671 = 0;
                int var91 = 0;
                label533: while (true) {
                    if (var91 >= var73) {
                        int var95 = 0;
                        while (true) {
                            if (var95 >= 128) {
                                break label533;
                            }
                            int var96 = 0;
                            for (int var97 = -var87; var97 < var73; var97++) {
                                int var98 = var97 * 128;
                                if (var87 + var97 < var73) {
                                    var96 += Statics.field146[var87 * 128 + var95 + var98];
                                }
                                if (var97 - (var87 + 1) >= 0) {
                                    var96 -= Statics.field146[var95 + var98 - (var87 + 1) * 128];
                                }
                                if (var97 >= 0) {
                                    Statics.field568[var95 + var98] = var96 / (var87 * 2 + 1);
                                }
                            }
                            var95++;
                        }
                    }
                    int var92 = 0;
                    int var93 = var91 * 128;
                    for (int var94 = -var87; var94 < 128; var94++) {
                        if (var87 + var94 < 128) {
                            var92 += Statics.field568[var93 + var94 + var87];
                        }
                        if (var94 - (var87 + 1) >= 0) {
                            var92 -= Statics.field568[var93 + var94 - (var87 + 1)];
                        }
                        if (var94 >= 0) {
                            Statics.field146[var93 + var94] = var92 / (var87 * 2 + 1);
                        }
                    }
                    var91++;
                }
            }
            field675 = 0;
        }
        short var99 = 256;
        if (field672 > 0) {
            for (int var100 = 0; var100 < 256; var100++) {
                if (field672 > 768) {
                    Statics.field54[var100] = method2477(Statics.field1983[var100], Statics.field631[var100], 1024 - field672);
                } else if (field672 > 256) {
                    Statics.field54[var100] = Statics.field631[var100];
                } else {
                    Statics.field54[var100] = method2477(Statics.field631[var100], Statics.field1983[var100], 256 - field672);
                }
            }
        } else if (field663 > 0) {
            for (int var101 = 0; var101 < 256; var101++) {
                if (field663 > 768) {
                    Statics.field54[var101] = method2477(Statics.field1983[var101], Statics.field1926[var101], 1024 - field663);
                } else if (field663 > 256) {
                    Statics.field54[var101] = Statics.field1926[var101];
                } else {
                    Statics.field54[var101] = method2477(Statics.field1926[var101], Statics.field1983[var101], 256 - field663);
                }
            }
        } else {
            for (int var102 = 0; var102 < 256; var102++) {
                Statics.field54[var102] = Statics.field1983[var102];
            }
        }
        class75.method1620(field661, 9, field661 + 128, var99 + 7);
        Statics.field529.method1508(field661, 0);
        class75.method1643();
        int var103 = 0;
        int var104 = field661 + Statics.field233.field1332 * 9;
        for (int var105 = 1; var105 < var99 - 1; var105++) {
            int var106 = (var99 - var105) * field669[var105] / var99;
            int var107 = var106 + 22;
            if (var107 < 0) {
                var107 = 0;
            }
            var103 += var107;
            for (int var108 = var107; var108 < 128; var108++) {
                int var109 = Statics.field568[var103++];
                if (var109 == 0) {
                    var104++;
                } else {
                    int var111 = 256 - var109;
                    int var112 = Statics.field54[var109];
                    int var113 = Statics.field233.field1333[var104];
                    Statics.field233.field1333[var104++] = ((var112 & 0xFF00) * var109 + (var113 & 0xFF00) * var111 & 0xFF0000) + ((var112 & 0xFF00FF) * var109 + (var113 & 0xFF00FF) * var111 & 0xFF00FF00) >> 8;
                }
            }
            var104 += Statics.field233.field1332 + var107 - 128;
        }
        class75.method1620(field661 + 765 - 128, 9, field661 + 765, var99 + 7);
        Statics.field1311.method1508(field661 + 382, 0);
        class75.method1643();
        int var114 = 0;
        int var115 = field661 + Statics.field233.field1332 * 9 + 24 + 637;
        for (int var116 = 1; var116 < var99 - 1; var116++) {
            int var117 = (var99 - var116) * field669[var116] / var99;
            int var118 = 103 - var117;
            int var119 = var115 + var117;
            for (int var120 = 0; var120 < var118; var120++) {
                int var121 = Statics.field568[var114++];
                if (var121 == 0) {
                    var119++;
                } else {
                    int var123 = 256 - var121;
                    int var124 = Statics.field54[var121];
                    int var125 = Statics.field233.field1333[var119];
                    Statics.field233.field1333[var119++] = ((var124 & 0xFF00) * var121 + (var125 & 0xFF00) * var123 & 0xFF0000) + ((var124 & 0xFF00FF) * var121 + (var125 & 0xFF00FF) * var123 & 0xFF00FF00) >> 8;
                }
            }
            var114 += 128 - var118;
            var115 = Statics.field233.field1332 - var118 - var117 + var119;
        }
        Statics.field666[Statics.field608.field128 ? 1 : 0].method1647(field661 + 765 - 40, 463);
        if (client.field453 > 5 && client.field323 == 0) {
            if (Statics.field2190 == null) {
                Statics.field2190 = class72.method3076(Statics.field1381, "sl_button", "");
            } else {
                int var126 = field661 + 5;
                short var127 = 463;
                byte var128 = 100;
                byte var129 = 35;
                Statics.field2190.method1647(var126, var127);
                arg0.method3662(class148.field2267 + " " + client.field240, var128 / 2 + var126, var129 / 2 + var127 - 2, 16777215, 0);
                if (Statics.field2796 == null) {
                    arg1.method3662(class148.field2478, var128 / 2 + var126, var129 / 2 + var127 + 12, 16777215, 0);
                } else {
                    arg1.method3662(class148.field2477, var128 / 2 + var126, var129 / 2 + var127 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var130 = Statics.field910.getGraphics();
            Statics.field233.method1419(var130, 0, 0);
        } catch (Exception var133) {
            Statics.field910.repaint();
        }
    }

    @ObfuscatedName("fl.g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2943(String arg0, String arg1, String arg2) {
        field679 = arg0;
        field680 = arg1;
        field681 = arg2;
    }

    @ObfuscatedName("ei.f(Lbe;B)V")
    public static final void method2876(class76 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field703.length; var2++) {
            Statics.field703[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field703[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field1693[var8] = (Statics.field703[var8 - 1] + Statics.field703[var8 + 1] + Statics.field703[var8 - 128] + Statics.field703[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field703;
            Statics.field703 = Statics.field1693;
            Statics.field1693 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1357; var11++) {
            for (int var12 = 0; var12 < arg0.field1356; var12++) {
                if (arg0.field1354[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1358;
                    int var14 = var11 + 16 + arg0.field1360;
                    int var15 = (var14 << 7) + var13;
                    Statics.field703[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("dm.m(IIII)I")
    public static final int method2477(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) >> 8;
    }

    @ObfuscatedName("cw.a(Lej;I)V")
    public static void method1869(class136 arg0) {
        if (class132.field2067 != 1 && Statics.field699 || class132.field2067 != 4) {
            return;
        }
        int var1 = field661 + 280;
        if (class132.field2069 >= var1 && class132.field2069 <= var1 + 14 && class132.field2063 >= 4 && class132.field2063 <= 18) {
            class24.method12(0, 0);
            return;
        }
        if (class132.field2069 >= var1 + 15 && class132.field2069 <= var1 + 80 && class132.field2063 >= 4 && class132.field2063 <= 18) {
            class24.method12(0, 1);
            return;
        }
        int var2 = field661 + 390;
        if (class132.field2069 >= var2 && class132.field2069 <= var2 + 14 && class132.field2063 >= 4 && class132.field2063 <= 18) {
            class24.method12(1, 0);
            return;
        }
        if (class132.field2069 >= var2 + 15 && class132.field2069 <= var2 + 80 && class132.field2063 >= 4 && class132.field2063 <= 18) {
            class24.method12(1, 1);
            return;
        }
        int var3 = field661 + 500;
        if (class132.field2069 >= var3 && class132.field2069 <= var3 + 14 && class132.field2063 >= 4 && class132.field2063 <= 18) {
            class24.method12(2, 0);
            return;
        }
        if (class132.field2069 >= var3 + 15 && class132.field2069 <= var3 + 80 && class132.field2063 >= 4 && class132.field2063 <= 18) {
            class24.method12(2, 1);
            return;
        }
        int var4 = field661 + 610;
        if (class132.field2069 >= var4 && class132.field2069 <= var4 + 14 && class132.field2063 >= 4 && class132.field2063 <= 18) {
            class24.method12(3, 0);
            return;
        }
        if (class132.field2069 >= var4 + 15 && class132.field2069 <= var4 + 80 && class132.field2063 >= 4 && class132.field2063 <= 18) {
            class24.method12(3, 1);
            return;
        }
        if (class132.field2069 >= field661 + 708 && class132.field2063 >= 4 && class132.field2069 <= field661 + 708 + 50 && class132.field2063 <= 20) {
            field689 = false;
            Statics.field529.method1508(field661, 0);
            Statics.field1311.method1508(field661 + 382, 0);
            Statics.field665.method1647(field661 + 382 - Statics.field665.field1356 / 2, 18);
            return;
        }
        if (field691 == -1) {
            return;
        }
        class24 var5 = Statics.field591[field691];
        if (var5.method560() != client.field244) {
            client.field244 = var5.method560();
            class47.method587(var5.method560());
        }
        Statics.field3 = var5.field594;
        client.field240 = var5.field601;
        client.field241 = var5.field586;
        Statics.field1546 = client.field242 == 0 ? 43594 : var5.field601 + 40000;
        Statics.field660 = client.field242 == 0 ? 443 : var5.field601 + 50000;
        Statics.field221 = Statics.field1546;
        field689 = false;
        Statics.field529.method1508(field661, 0);
        Statics.field1311.method1508(field661 + 382, 0);
        Statics.field665.method1647(field661 + 382 - Statics.field665.field1356 / 2, 18);
        return;
    }
}

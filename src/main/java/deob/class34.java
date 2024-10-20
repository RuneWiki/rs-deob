package deob;

import java.awt.Component;
import java.awt.Graphics;

@ObfuscatedName("an")
public class class34 {

    @ObfuscatedName("an.z")
    public static int field716 = 0;

    @ObfuscatedName("an.a")
    public static int field708 = field716 + 202;

    @ObfuscatedName("an.q")
    public static int[] field709 = new int[256];

    @ObfuscatedName("an.v")
    public static int field721 = 0;

    @ObfuscatedName("an.l")
    public static int field712 = 0;

    @ObfuscatedName("an.am")
    public static int field715 = 0;

    @ObfuscatedName("an.aa")
    public static int field718 = 0;

    @ObfuscatedName("an.ax")
    public static int field717 = 0;

    @ObfuscatedName("an.ac")
    public static int field734 = 0;

    @ObfuscatedName("an.ar")
    public static int field719 = 10;

    @ObfuscatedName("an.an")
    public static String field720 = "";

    @ObfuscatedName("an.ag")
    public static int field714 = 0;

    @ObfuscatedName("an.ab")
    public static String field710 = "";

    @ObfuscatedName("an.ao")
    public static String field723 = "";

    @ObfuscatedName("an.av")
    public static String field713 = "";

    @ObfuscatedName("an.ap")
    public static String field725 = "";

    @ObfuscatedName("an.au")
    public static String field707 = "";

    @ObfuscatedName("an.ad")
    public static String field727 = "";

    @ObfuscatedName("an.aj")
    public static class163 field737 = class163.field2644;

    @ObfuscatedName("an.ay")
    public static boolean field729 = true;

    @ObfuscatedName("an.at")
    public static int field730 = 0;

    @ObfuscatedName("an.al")
    public static String field731 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @ObfuscatedName("an.aw")
    public static String field732 = "1234567890";

    @ObfuscatedName("an.as")
    public static boolean field704 = false;

    @ObfuscatedName("an.bg")
    public static int field735 = -1;

    public class34() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.s(Lfu;Lfu;I)I")
    public static int method23(class171 arg0, class171 arg1) {
        int var2 = 0;
        if (arg0.method3087("title.jpg", "")) {
            var2++;
        }
        if (arg1.method3087("logo", "")) {
            var2++;
        }
        if (arg1.method3087("logo_deadman_mode", "")) {
            var2++;
        }
        if (arg1.method3087("titlebox", "")) {
            var2++;
        }
        if (arg1.method3087("titlebutton", "")) {
            var2++;
        }
        if (arg1.method3087("runes", "")) {
            var2++;
        }
        if (arg1.method3087("title_mute", "")) {
            var2++;
        }
        if (arg1.method3088("options_radio_buttons,0")) {
            var2++;
        }
        if (arg1.method3088("options_radio_buttons,2")) {
            var2++;
        }
        arg1.method3087("sl_back", "");
        arg1.method3087("sl_flags", "");
        arg1.method3087("sl_arrows", "");
        arg1.method3087("sl_stars", "");
        arg1.method3087("sl_button", "");
        return var2;
    }

    @ObfuscatedName("v.z(Ljava/awt/Component;Lfu;Lfu;ZII)V")
    public static void method563(Component arg0, class171 arg1, class171 arg2, boolean arg3, int arg4) {
        if (!Statics.field3196) {
            field714 = arg4;
            class83.method1787();
            byte[] var5 = arg1.method3092("title.jpg", "");
            Statics.field726 = new class82(var5, arg0);
            Statics.field2079 = Statics.field726.method1690();
            if ((client.field267 & 0x20000000) == 0) {
                Statics.field705 = class80.method3801(arg2, "logo", "");
            } else {
                Statics.field705 = class80.method3801(arg2, "logo_deadman_mode", "");
            }
            Statics.field722 = class80.method3801(arg2, "titlebox", "");
            Statics.field1996 = class80.method3801(arg2, "titlebutton", "");
            Statics.field703 = Statics.method667(arg2, "runes", "");
            Statics.field706 = Statics.method667(arg2, "title_mute", "");
            Statics.field1031 = class80.method3801(arg2, "options_radio_buttons,0", "");
            Statics.field2046 = class80.method3801(arg2, "options_radio_buttons,2", "");
            Statics.field1115 = new int[256];
            for (int var6 = 0; var6 < 64; var6++) {
                Statics.field1115[var6] = var6 * 262144;
            }
            for (int var7 = 0; var7 < 64; var7++) {
                Statics.field1115[var7 + 64] = var7 * 1024 + 16711680;
            }
            for (int var8 = 0; var8 < 64; var8++) {
                Statics.field1115[var8 + 128] = var8 * 4 + 16776960;
            }
            for (int var9 = 0; var9 < 64; var9++) {
                Statics.field1115[var9 + 192] = 16777215;
            }
            Statics.field728 = new int[256];
            for (int var10 = 0; var10 < 64; var10++) {
                Statics.field728[var10] = var10 * 1024;
            }
            for (int var11 = 0; var11 < 64; var11++) {
                Statics.field728[var11 + 64] = var11 * 4 + 65280;
            }
            for (int var12 = 0; var12 < 64; var12++) {
                Statics.field728[var12 + 128] = var12 * 262144 + 65535;
            }
            for (int var13 = 0; var13 < 64; var13++) {
                Statics.field728[var13 + 192] = 16777215;
            }
            Statics.field781 = new int[256];
            for (int var14 = 0; var14 < 64; var14++) {
                Statics.field781[var14] = var14 * 4;
            }
            for (int var15 = 0; var15 < 64; var15++) {
                Statics.field781[var15 + 64] = var15 * 262144 + 255;
            }
            for (int var16 = 0; var16 < 64; var16++) {
                Statics.field781[var16 + 128] = var16 * 1024 + 16711935;
            }
            for (int var17 = 0; var17 < 64; var17++) {
                Statics.field781[var17 + 192] = 16777215;
            }
            Statics.field666 = new int[256];
            Statics.field711 = new int[32768];
            Statics.field702 = new int[32768];
            method179((class84) null);
            Statics.field800 = new int[32768];
            Statics.field192 = new int[32768];
            if (arg3) {
                field707 = "";
                field727 = "";
            }
            Statics.field1788 = 0;
            Statics.field1099 = "";
            field729 = true;
            field704 = false;
            if (Statics.field985.field125) {
                class187.method1029(2);
            } else {
                class172 var18 = Statics.field1025;
                int var19 = var18.method3084("scape main");
                int var20 = var18.method3085(var19, "");
                class187.method1544(2, var18, var19, var20, 255, false);
            }
            class175.method2978(false);
            Statics.field3196 = true;
            field716 = (Statics.field1070 - client.field484) / 2;
            field708 = field716 + 202;
            Statics.field726.method1630(field716, 0);
            Statics.field2079.method1630(field716 + 382, 0);
            Statics.field705.method1791(field716 + 382 - Statics.field705.field1462 / 2, 18);
        } else if (arg4 == 4) {
            field714 = 4;
        }
    }

    @ObfuscatedName("ga.t(I)V")
    public static void method3376() {
        if (!Statics.field3196) {
            return;
        }
        Statics.field722 = null;
        Statics.field1996 = null;
        Statics.field703 = null;
        Statics.field726 = null;
        Statics.field2079 = null;
        Statics.field705 = null;
        Statics.field706 = null;
        Statics.field1031 = null;
        Statics.field2046 = null;
        Statics.field652 = null;
        Statics.field2115 = null;
        Statics.field196 = null;
        Statics.field1984 = null;
        Statics.field1065 = null;
        Statics.field1115 = null;
        Statics.field728 = null;
        Statics.field781 = null;
        Statics.field666 = null;
        Statics.field711 = null;
        Statics.field702 = null;
        Statics.field800 = null;
        Statics.field192 = null;
        class187.method1029(2);
        class175.method2978(true);
        Statics.field3196 = false;
    }

    @ObfuscatedName("i.y(Lek;B)V")
    public static void method535(class148 arg0) {
        if (!field704) {
            if ((class144.field2199 == 1 || !Statics.field246 && class144.field2199 == 4) && class144.field2189 >= field716 + 765 - 50 && class144.field2197 >= 453) {
                Statics.field985.field125 = !Statics.field985.field125;
                class9.method2692();
                if (Statics.field985.field125) {
                    Statics.field3008.method3397();
                    class187.field3003 = 1;
                    Statics.field201 = null;
                } else {
                    class187.method670(Statics.field1025, "scape main", "", 255, false);
                }
            }
            if (client.field275 != 5) {
                field717++;
                if (client.field275 == 10 || client.field275 == 11) {
                    if (client.field347 == 0) {
                        if (class144.field2199 == 1 || !Statics.field246 && class144.field2199 == 4) {
                            int var6 = field716 + 5;
                            short var7 = 463;
                            byte var8 = 100;
                            byte var9 = 35;
                            if (class144.field2189 >= var6 && class144.field2189 <= var6 + var8 && class144.field2197 >= var7 && class144.field2197 <= var7 + var9) {
                                Statics.method574();
                                return;
                            }
                        }
                        if (Statics.field3171 != null) {
                            Statics.method574();
                        }
                    }
                    int var10 = class144.field2199;
                    int var11 = class144.field2189;
                    int var12 = class144.field2197;
                    if (!Statics.field246 && var10 == 4) {
                        var10 = 1;
                    }
                    if (field714 == 0) {
                        int var13 = field708 + 180 - 80;
                        short var14 = 291;
                        if (var10 == 1 && var11 >= var13 - 75 && var11 <= var13 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            class142.method151(client.method896("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                        }
                        int var15 = field708 + 180 + 80;
                        if (var10 == 1 && var11 >= var15 - 75 && var11 <= var15 + 75 && var12 >= var14 - 20 && var12 <= var14 + 20) {
                            if ((client.field267 & 0x2000000) != 0) {
                                field710 = "";
                                field723 = class161.field2578;
                                field713 = class161.field2507;
                                field725 = class161.field2580;
                                field714 = 1;
                                field730 = 0;
                            } else if ((client.field267 & 0x4) != 0) {
                                if ((client.field267 & 0x400) == 0) {
                                    field723 = class161.field2569;
                                    field713 = class161.field2570;
                                    field725 = class161.field2516;
                                } else {
                                    field723 = class161.field2536;
                                    field713 = class161.field2528;
                                    field725 = class161.field2582;
                                }
                                field710 = class161.field2568;
                                field714 = 1;
                                field730 = 0;
                            } else if ((client.field267 & 0x400) == 0) {
                                field723 = class161.field2427;
                                field713 = class161.field2566;
                                field725 = class161.field2567;
                                field714 = 2;
                                field730 = 0;
                            } else {
                                field723 = class161.field2572;
                                field713 = class161.field2573;
                                field725 = class161.field2574;
                                field710 = class161.field2568;
                                field714 = 1;
                                field730 = 0;
                            }
                        }
                    } else if (field714 == 1) {
                        while (class141.method45()) {
                            if (Statics.field2651 == 84) {
                                field723 = class161.field2427;
                                field713 = class161.field2566;
                                field725 = class161.field2567;
                                field714 = 2;
                                field730 = 0;
                            } else if (Statics.field2651 == 13) {
                                field714 = 0;
                            }
                        }
                        int var16 = field708 + 180 - 80;
                        short var17 = 321;
                        if (var10 == 1 && var11 >= var16 - 75 && var11 <= var16 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field723 = class161.field2427;
                            field713 = class161.field2566;
                            field725 = class161.field2567;
                            field714 = 2;
                            field730 = 0;
                        }
                        int var18 = field708 + 180 + 80;
                        if (var10 == 1 && var11 >= var18 - 75 && var11 <= var18 + 75 && var12 >= var17 - 20 && var12 <= var17 + 20) {
                            field714 = 0;
                        }
                    } else if (field714 == 2) {
                        short var19 = 231;
                        int var41 = var19 + 30;
                        if (var10 == 1 && var12 >= var41 - 15 && var12 < var41) {
                            field730 = 0;
                        }
                        var41 += 15;
                        if (var10 == 1 && var12 >= var41 - 15 && var12 < var41) {
                            field730 = 1;
                        }
                        var41 += 15;
                        short var20 = 361;
                        if (var10 == 1 && var12 >= var20 - 15 && var12 < var20) {
                            method1611(class161.field2562, class161.field2571, class161.field2389);
                            field714 = 5;
                            return;
                        }
                        int var21 = field708 + 180 - 80;
                        short var22 = 321;
                        if (var10 == 1 && var11 >= var21 - 75 && var11 <= var21 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field707 = field707.trim();
                            if (field707.length() == 0) {
                                method1611(class161.field2471, class161.field2472, class161.field2473);
                                return;
                            }
                            if (field727.length() == 0) {
                                method1611(class161.field2474, class161.field2539, class161.field2476);
                                return;
                            }
                            method1611(class161.field2589, class161.field2621, class161.field2585);
                            field737 = Statics.field985.field127.containsKey(class167.method1811(field707)) ? class163.field2649 : class163.field2644;
                            client.method2278(20);
                            return;
                        }
                        int var23 = field708 + 180 + 80;
                        if (var10 == 1 && var11 >= var23 - 75 && var11 <= var23 + 75 && var12 >= var22 - 20 && var12 <= var22 + 20) {
                            field714 = 0;
                            field707 = "";
                            field727 = "";
                            Statics.field1788 = 0;
                            Statics.field1099 = "";
                            field729 = true;
                        }
                        while (true) {
                            while (class141.method45()) {
                                boolean var24 = false;
                                for (int var25 = 0; var25 < field731.length(); var25++) {
                                    if (Statics.field2085 == field731.charAt(var25)) {
                                        var24 = true;
                                        break;
                                    }
                                }
                                if (Statics.field2651 == 13) {
                                    field714 = 0;
                                    field707 = "";
                                    field727 = "";
                                    Statics.field1788 = 0;
                                    Statics.field1099 = "";
                                    field729 = true;
                                } else if (field730 == 0) {
                                    if (Statics.field2651 == 85 && field707.length() > 0) {
                                        field707 = field707.substring(0, field707.length() - 1);
                                    }
                                    if (Statics.field2651 == 84 || Statics.field2651 == 80) {
                                        field730 = 1;
                                    }
                                    if (var24 && field707.length() < 320) {
                                        field707 = field707 + Statics.field2085;
                                    }
                                } else if (field730 == 1) {
                                    if (Statics.field2651 == 85 && field727.length() > 0) {
                                        field727 = field727.substring(0, field727.length() - 1);
                                    }
                                    if (Statics.field2651 == 84 || Statics.field2651 == 80) {
                                        field730 = 0;
                                    }
                                    if (Statics.field2651 == 84) {
                                        field707 = field707.trim();
                                        if (field707.length() == 0) {
                                            method1611(class161.field2471, class161.field2472, class161.field2473);
                                            return;
                                        }
                                        if (field727.length() == 0) {
                                            method1611(class161.field2474, class161.field2539, class161.field2476);
                                            return;
                                        }
                                        method1611(class161.field2589, class161.field2621, class161.field2585);
                                        field737 = Statics.field985.field127.containsKey(class167.method1811(field707)) ? class163.field2649 : class163.field2644;
                                        client.method2278(20);
                                        return;
                                    }
                                    if (var24 && field727.length() < 20) {
                                        field727 = field727 + Statics.field2085;
                                    }
                                }
                            }
                            return;
                        }
                    } else if (field714 == 3) {
                        int var26 = field708 + 180;
                        short var27 = 276;
                        if (var10 == 1 && var11 >= var26 - 75 && var11 <= var26 + 75 && var12 >= var27 - 20 && var12 <= var27 + 20) {
                            field723 = class161.field2427;
                            field713 = class161.field2566;
                            field725 = class161.field2567;
                            field714 = 2;
                            field730 = 0;
                        }
                        int var28 = field708 + 180;
                        short var29 = 326;
                        if (var10 == 1 && var11 >= var28 - 75 && var11 <= var28 + 75 && var12 >= var29 - 20 && var12 <= var29 + 20) {
                            method1611(class161.field2562, class161.field2571, class161.field2389);
                            field714 = 5;
                            return;
                        }
                    } else if (field714 == 4) {
                        int var30 = field708 + 180 - 80;
                        short var31 = 321;
                        if (var10 == 1 && var11 >= var30 - 75 && var11 <= var30 + 75 && var12 >= var31 - 20 && var12 <= var31 + 20) {
                            Statics.field1099.trim();
                            if (Statics.field1099.length() != 6) {
                                method1611(class161.field2390, class161.field2466, class161.field2392);
                                return;
                            }
                            Statics.field1788 = Integer.parseInt(Statics.field1099);
                            Statics.field1099 = "";
                            field737 = field729 ? class163.field2645 : class163.field2652;
                            method1611(class161.field2589, class161.field2621, class161.field2585);
                            client.method2278(20);
                            return;
                        }
                        if (var10 == 1 && var11 >= field708 + 180 - 9 && var11 <= field708 + 180 + 130 && var12 >= 263 && var12 <= 296) {
                            field729 = !field729;
                        }
                        if (var10 == 1 && var11 >= field708 + 180 - 34 && var11 <= field708 + 180 + 34 && var12 >= 351 && var12 <= 363) {
                            class142.method151(client.method896("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                        }
                        int var32 = field708 + 180 + 80;
                        if (var10 == 1 && var11 >= var32 - 75 && var11 <= var32 + 75 && var12 >= var31 - 20 && var12 <= var31 + 20) {
                            field714 = 0;
                            field707 = "";
                            field727 = "";
                            Statics.field1788 = 0;
                            Statics.field1099 = "";
                        }
                        while (class141.method45()) {
                            boolean var33 = false;
                            for (int var34 = 0; var34 < field732.length(); var34++) {
                                if (Statics.field2085 == field732.charAt(var34)) {
                                    var33 = true;
                                    break;
                                }
                            }
                            if (Statics.field2651 == 13) {
                                field714 = 0;
                                field707 = "";
                                field727 = "";
                                Statics.field1788 = 0;
                                Statics.field1099 = "";
                            } else {
                                if (Statics.field2651 == 85 && Statics.field1099.length() > 0) {
                                    Statics.field1099 = Statics.field1099.substring(0, Statics.field1099.length() - 1);
                                }
                                if (Statics.field2651 == 84) {
                                    Statics.field1099.trim();
                                    if (Statics.field1099.length() != 6) {
                                        method1611(class161.field2390, class161.field2466, class161.field2392);
                                        return;
                                    }
                                    Statics.field1788 = Integer.parseInt(Statics.field1099);
                                    Statics.field1099 = "";
                                    field737 = field729 ? class163.field2645 : class163.field2652;
                                    method1611(class161.field2589, class161.field2621, class161.field2585);
                                    client.method2278(20);
                                    return;
                                }
                                if (var33 && Statics.field1099.length() < 6) {
                                    Statics.field1099 = Statics.field1099 + Statics.field2085;
                                }
                            }
                        }
                    } else if (field714 == 5) {
                        int var35 = field708 + 180 - 80;
                        short var36 = 321;
                        if (var10 == 1 && var11 >= var35 - 75 && var11 <= var35 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            Statics.method1983();
                            return;
                        }
                        int var37 = field708 + 180 + 80;
                        if (var10 == 1 && var11 >= var37 - 75 && var11 <= var37 + 75 && var12 >= var36 - 20 && var12 <= var36 + 20) {
                            field723 = class161.field2427;
                            field713 = class161.field2566;
                            field725 = class161.field2567;
                            field714 = 2;
                            field730 = 0;
                            field727 = "";
                        }
                        while (class141.method45()) {
                            boolean var38 = false;
                            for (int var39 = 0; var39 < field731.length(); var39++) {
                                if (Statics.field2085 == field731.charAt(var39)) {
                                    var38 = true;
                                    break;
                                }
                            }
                            if (Statics.field2651 == 13) {
                                field723 = class161.field2427;
                                field713 = class161.field2566;
                                field725 = class161.field2567;
                                field714 = 2;
                                field730 = 0;
                                field727 = "";
                            } else {
                                if (Statics.field2651 == 85 && field707.length() > 0) {
                                    field707 = field707.substring(0, field707.length() - 1);
                                }
                                if (Statics.field2651 == 84) {
                                    Statics.method1983();
                                    return;
                                }
                                if (var38 && field707.length() < 320) {
                                    field707 = field707 + Statics.field2085;
                                }
                            }
                        }
                    } else if (field714 == 6) {
                        while (true) {
                            do {
                                if (!class141.method45()) {
                                    short var40 = 321;
                                    if (var10 == 1 && var12 >= var40 - 20 && var12 <= var40 + 20) {
                                        field723 = class161.field2427;
                                        field713 = class161.field2566;
                                        field725 = class161.field2567;
                                        field714 = 2;
                                        field730 = 0;
                                        field727 = "";
                                    }
                                    return;
                                }
                            } while (Statics.field2651 != 84 && Statics.field2651 != 13);
                            field723 = class161.field2427;
                            field713 = class161.field2566;
                            field725 = class161.field2567;
                            field714 = 2;
                            field730 = 0;
                            field727 = "";
                        }
                    }
                }
            }
        } else if (class144.field2199 == 1 || !Statics.field246 && class144.field2199 == 4) {
            int var1 = field716 + 280;
            if (class144.field2189 >= var1 && class144.field2189 <= var1 + 14 && class144.field2197 >= 4 && class144.field2197 <= 18) {
                class28.method533(0, 0);
            } else if (class144.field2189 >= var1 + 15 && class144.field2189 <= var1 + 80 && class144.field2197 >= 4 && class144.field2197 <= 18) {
                class28.method533(0, 1);
            } else {
                int var2 = field716 + 390;
                if (class144.field2189 >= var2 && class144.field2189 <= var2 + 14 && class144.field2197 >= 4 && class144.field2197 <= 18) {
                    class28.method533(1, 0);
                } else if (class144.field2189 >= var2 + 15 && class144.field2189 <= var2 + 80 && class144.field2197 >= 4 && class144.field2197 <= 18) {
                    class28.method533(1, 1);
                } else {
                    int var3 = field716 + 500;
                    if (class144.field2189 >= var3 && class144.field2189 <= var3 + 14 && class144.field2197 >= 4 && class144.field2197 <= 18) {
                        class28.method533(2, 0);
                    } else if (class144.field2189 >= var3 + 15 && class144.field2189 <= var3 + 80 && class144.field2197 >= 4 && class144.field2197 <= 18) {
                        class28.method533(2, 1);
                    } else {
                        int var4 = field716 + 610;
                        if (class144.field2189 >= var4 && class144.field2189 <= var4 + 14 && class144.field2197 >= 4 && class144.field2197 <= 18) {
                            class28.method533(3, 0);
                        } else if (class144.field2189 >= var4 + 15 && class144.field2189 <= var4 + 80 && class144.field2197 >= 4 && class144.field2197 <= 18) {
                            class28.method533(3, 1);
                        } else if (class144.field2189 >= field716 + 708 && class144.field2197 >= 4 && class144.field2189 <= field716 + 708 + 50 && class144.field2197 <= 20) {
                            field704 = false;
                            Statics.field726.method1630(field716, 0);
                            Statics.field2079.method1630(field716 + 382, 0);
                            Statics.field705.method1791(field716 + 382 - Statics.field705.field1462 / 2, 18);
                        } else if (field735 != -1) {
                            class28 var5 = Statics.field630[field735];
                            method560(var5);
                            field704 = false;
                            Statics.field726.method1630(field716, 0);
                            Statics.field2079.method1630(field716 + 382, 0);
                            Statics.field705.method1791(field716 + 382 - Statics.field705.field1462 / 2, 18);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.g(Lhq;Lhq;Lhq;ZI)V")
    public static void method977(class228 arg0, class228 arg1, class228 arg2, boolean arg3) {
        if (arg3) {
            field716 = (Statics.field1070 - client.field484) / 2;
            field708 = field716 + 202;
        }
        if (field704) {
            method936(arg0, arg1);
            return;
        }
        if (arg3) {
            Statics.field726.method1630(field716, 0);
            Statics.field2079.method1630(field716 + 382, 0);
            Statics.field705.method1791(field716 + 382 - Statics.field705.field1462 / 2, 18);
        }
        if (client.field275 == 0 || client.field275 == 5) {
            byte var4 = 20;
            arg0.method3852(class161.field2442, field708 + 180, 245 - var4, 16777215, -1);
            int var5 = 253 - var4;
            class83.method1735(field708 + 180 - 152, var5, 304, 34, 9179409);
            class83.method1735(field708 + 180 - 151, var5 + 1, 302, 32, 0);
            class83.method1721(field708 + 180 - 150, var5 + 2, field719 * 3, 30, 9179409);
            class83.method1721(field719 * 3 + (field708 + 180 - 150), var5 + 2, 300 - field719 * 3, 30, 0);
            arg0.method3852(field720, field708 + 180, 276 - var4, 16777215, -1);
        }
        if (client.field275 == 20) {
            Statics.field722.method1791(field708 + 180 - Statics.field722.field1462 / 2, 271 - Statics.field722.field1459 / 2);
            short var6 = 211;
            arg0.method3852(field723, field708 + 180, var6, 16776960, 0);
            int var114 = var6 + 15;
            arg0.method3852(field713, field708 + 180, var114, 16776960, 0);
            int var115 = var114 + 15;
            arg0.method3852(field725, field708 + 180, var115, 16776960, 0);
            int var116 = var115 + 15;
            int var117 = var116 + 10;
            if (field714 != 4) {
                arg0.method3812(class161.field2586, field708 + 180 - 110, var117, 16777215, 0);
                short var7 = 200;
                String var8;
                for (var8 = field707; arg0.method3807(var8) > var7; var8 = var8.substring(0, var8.length() - 1)) {
                }
                arg0.method3812(class227.method3833(var8), field708 + 180 - 70, var117, 16777215, 0);
                var114 = var117 + 15;
                String var10 = class161.field2587;
                String var11 = field727;
                int var12 = var11.length();
                char[] var13 = new char[var12];
                for (int var14 = 0; var14 < var12; var14++) {
                    var13[var14] = '*';
                }
                String var15 = new String(var13);
                arg0.method3812(var10 + var15, field708 + 180 - 108, var114, 16777215, 0);
                var114 += 15;
            }
        }
        if (client.field275 == 10 || client.field275 == 11) {
            Statics.field722.method1791(field708, 171);
            if (field714 == 0) {
                short var17 = 251;
                arg0.method3852(class161.field2462, field708 + 180, var17, 16776960, 0);
                int var118 = var17 + 30;
                int var18 = field708 + 180 - 80;
                short var19 = 291;
                Statics.field1996.method1791(var18 - 73, var19 - 20);
                arg0.method3815(class161.field2590, var18 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                int var20 = field708 + 180 + 80;
                Statics.field1996.method1791(var20 - 73, var19 - 20);
                arg0.method3815(class161.field2591, var20 - 73, var19 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (field714 == 1) {
                arg0.method3852(field710, field708 + 180, 211, 16776960, 0);
                short var21 = 236;
                arg0.method3852(field723, field708 + 180, var21, 16777215, 0);
                int var119 = var21 + 15;
                arg0.method3852(field713, field708 + 180, var119, 16777215, 0);
                int var120 = var119 + 15;
                arg0.method3852(field725, field708 + 180, var120, 16777215, 0);
                int var121 = var120 + 15;
                int var22 = field708 + 180 - 80;
                short var23 = 321;
                Statics.field1996.method1791(var22 - 73, var23 - 20);
                arg0.method3852(class161.field2362, var22, var23 + 5, 16777215, 0);
                int var24 = field708 + 180 + 80;
                Statics.field1996.method1791(var24 - 73, var23 - 20);
                arg0.method3852(class161.field2593, var24, var23 + 5, 16777215, 0);
            } else if (field714 == 2) {
                short var25 = 211;
                arg0.method3852(field723, field708 + 180, var25, 16776960, 0);
                int var122 = var25 + 15;
                arg0.method3852(field713, field708 + 180, var122, 16776960, 0);
                int var123 = var122 + 15;
                arg0.method3852(field725, field708 + 180, var123, 16776960, 0);
                int var124 = var123 + 15;
                int var125 = var124 + 10;
                arg0.method3812(class161.field2586, field708 + 180 - 110, var125, 16777215, 0);
                short var26 = 200;
                String var27;
                for (var27 = field707; arg0.method3807(var27) > var26; var27 = var27.substring(1)) {
                }
                arg0.method3812(class227.method3833(var27) + (field730 == 0 & client.field326 % 40 < 20 ? class2.method3501(16776960) + class2.field17 : ""), field708 + 180 - 70, var125, 16777215, 0);
                var122 = var125 + 15;
                arg0.method3812(class161.field2587 + class167.method2965(field727) + (field730 == 1 & client.field326 % 40 < 20 ? class2.method3501(16776960) + class2.field17 : ""), field708 + 180 - 108, var122, 16777215, 0);
                var122 += 15;
                int var28 = field708 + 180 - 80;
                short var29 = 321;
                Statics.field1996.method1791(var28 - 73, var29 - 20);
                arg0.method3852(class161.field2380, var28, var29 + 5, 16777215, 0);
                int var30 = field708 + 180 + 80;
                Statics.field1996.method1791(var30 - 73, var29 - 20);
                arg0.method3852(class161.field2593, var30, var29 + 5, 16777215, 0);
                short var31 = 357;
                arg1.method3852(class161.field2599, field708 + 180, var31, 16776960, 0);
            } else if (field714 == 3) {
                short var32 = 201;
                arg0.method3852(class161.field2594, field708 + 180, var32, 16776960, 0);
                int var126 = var32 + 20;
                arg1.method3852(class161.field2595, field708 + 180, var126, 16776960, 0);
                int var127 = var126 + 15;
                arg1.method3852(class161.field2596, field708 + 180, var127, 16776960, 0);
                int var128 = var127 + 15;
                int var33 = field708 + 180;
                short var34 = 276;
                Statics.field1996.method1791(var33 - 73, var34 - 20);
                arg2.method3852(class161.field2597, var33, var34 + 5, 16777215, 0);
                int var35 = field708 + 180;
                short var36 = 326;
                Statics.field1996.method1791(var35 - 73, var36 - 20);
                arg2.method3852(class161.field2598, var35, var36 + 5, 16777215, 0);
            } else if (field714 == 4) {
                arg0.method3852(class161.field2522, field708 + 180, 211, 16776960, 0);
                short var37 = 236;
                arg0.method3852(field723, field708 + 180, var37, 16777215, 0);
                int var129 = var37 + 15;
                arg0.method3852(field713, field708 + 180, var129, 16777215, 0);
                int var130 = var129 + 15;
                arg0.method3852(field725, field708 + 180, var130, 16777215, 0);
                int var131 = var130 + 15;
                arg0.method3812(class161.field2588 + class167.method2965(Statics.field1099) + (client.field326 % 40 < 20 ? class2.method3501(16776960) + class2.field17 : ""), field708 + 180 - 108, var131, 16777215, 0);
                int var132 = var131 - 8;
                arg0.method3812(class161.field2418, field708 + 180 - 9, var132, 16776960, 0);
                int var133 = var132 + 15;
                arg0.method3812(class161.field2446, field708 + 180 - 9, var133, 16776960, 0);
                int var38 = field708 + 180 - 9 + arg0.method3807(class161.field2446) + 15;
                int var39 = var133 - arg0.field3239;
                class84 var40;
                if (field729) {
                    var40 = Statics.field2046;
                } else {
                    var40 = Statics.field1031;
                }
                var40.method1791(var38, var39);
                var129 = var133 + 15;
                int var41 = field708 + 180 - 80;
                short var42 = 321;
                Statics.field1996.method1791(var41 - 73, var42 - 20);
                arg0.method3852(class161.field2362, var41, var42 + 5, 16777215, 0);
                int var43 = field708 + 180 + 80;
                Statics.field1996.method1791(var43 - 73, var42 - 20);
                arg0.method3852(class161.field2593, var43, var42 + 5, 16777215, 0);
                arg1.method3852(class161.field2617, field708 + 180, var42 + 36, 255, 0);
            } else if (field714 == 5) {
                arg0.method3852(class161.field2600, field708 + 180, 201, 16776960, 0);
                short var44 = 221;
                arg2.method3852(field723, field708 + 180, var44, 16776960, 0);
                int var134 = var44 + 15;
                arg2.method3852(field713, field708 + 180, var134, 16776960, 0);
                int var135 = var134 + 15;
                arg2.method3852(field725, field708 + 180, var135, 16776960, 0);
                int var136 = var135 + 15;
                int var137 = var136 + 14;
                arg0.method3812(class161.field2601, field708 + 180 - 145, var137, 16777215, 0);
                short var45 = 174;
                String var46;
                for (var46 = field707; arg0.method3807(var46) > var45; var46 = var46.substring(1)) {
                }
                arg0.method3812(class227.method3833(var46) + (client.field326 % 40 < 20 ? class2.method3501(16776960) + class2.field17 : ""), field708 + 180 - 34, var137, 16777215, 0);
                var134 = var137 + 15;
                int var47 = field708 + 180 - 80;
                short var48 = 321;
                Statics.field1996.method1791(var47 - 73, var48 - 20);
                arg0.method3852(class161.field2602, var47, var48 + 5, 16777215, 0);
                int var49 = field708 + 180 + 80;
                Statics.field1996.method1791(var49 - 73, var48 - 20);
                arg0.method3852(class161.field2603, var49, var48 + 5, 16777215, 0);
            } else if (field714 == 6) {
                short var50 = 211;
                arg0.method3852(field723, field708 + 180, var50, 16776960, 0);
                int var138 = var50 + 15;
                arg0.method3852(field713, field708 + 180, var138, 16776960, 0);
                int var139 = var138 + 15;
                arg0.method3852(field725, field708 + 180, var139, 16776960, 0);
                int var140 = var139 + 15;
                int var51 = field708 + 180;
                short var52 = 321;
                Statics.field1996.method1791(var51 - 73, var52 - 20);
                arg0.method3852(class161.field2603, var51, var52 + 5, 16777215, 0);
            }
        }
        if (field717 > 0) {
            int var53 = field717;
            short var54 = 256;
            field715 += var53 * 128;
            if (field715 > Statics.field711.length) {
                field715 -= Statics.field711.length;
                int var55 = (int) (Math.random() * 12.0D);
                method179(Statics.field703[var55]);
            }
            int var56 = 0;
            int var57 = var53 * 128;
            int var58 = (var54 - var53) * 128;
            for (int var59 = 0; var59 < var58; var59++) {
                int var60 = Statics.field800[var56 + var57] - Statics.field711[field715 + var56 & Statics.field711.length - 1] * var53 / 6;
                if (var60 < 0) {
                    var60 = 0;
                }
                Statics.field800[var56++] = var60;
            }
            for (int var61 = var54 - var53; var61 < var54; var61++) {
                int var62 = var61 * 128;
                for (int var63 = 0; var63 < 128; var63++) {
                    int var64 = (int) (Math.random() * 100.0D);
                    if (var64 < 50 && var63 > 10 && var63 < 118) {
                        Statics.field800[var62 + var63] = 255;
                    } else {
                        Statics.field800[var62 + var63] = 0;
                    }
                }
            }
            if (field721 > 0) {
                field721 -= var53 * 4;
            }
            if (field712 > 0) {
                field712 -= var53 * 4;
            }
            if (field721 == 0 && field712 == 0) {
                int var65 = (int) (Math.random() * (double) (2000 / var53));
                if (var65 == 0) {
                    field721 = 1024;
                }
                if (var65 == 1) {
                    field712 = 1024;
                }
            }
            for (int var66 = 0; var66 < var54 - var53; var66++) {
                field709[var66] = field709[var53 + var66];
            }
            for (int var67 = var54 - var53; var67 < var54; var67++) {
                field709[var67] = (int) (Math.sin((double) field734 / 14.0D) * 16.0D + Math.sin((double) field734 / 15.0D) * 14.0D + Math.sin((double) field734 / 16.0D) * 12.0D);
                field734++;
            }
            field718 += var53 * -260696477;
            int var68 = ((client.field326 & 0x1) + var53) / 2;
            if (var68 > 0) {
                for (int var69 = 0; var69 < field718 * -1303467700; var69++) {
                    int var70 = (int) (Math.random() * 124.0D) + 2;
                    int var71 = (int) (Math.random() * 128.0D) + 128;
                    Statics.field800[(var71 << 7) + var70] = 192;
                }
                field718 = 0;
                int var72 = 0;
                label322: while (true) {
                    if (var72 >= var54) {
                        int var76 = 0;
                        while (true) {
                            if (var76 >= 128) {
                                break label322;
                            }
                            int var77 = 0;
                            for (int var78 = -var68; var78 < var54; var78++) {
                                int var79 = var78 * 128;
                                if (var68 + var78 < var54) {
                                    var77 += Statics.field192[var68 * 128 + var76 + var79];
                                }
                                if (var78 - (var68 + 1) >= 0) {
                                    var77 -= Statics.field192[var76 + var79 - (var68 + 1) * 128];
                                }
                                if (var78 >= 0) {
                                    Statics.field800[var76 + var79] = var77 / (var68 * 2 + 1);
                                }
                            }
                            var76++;
                        }
                    }
                    int var73 = 0;
                    int var74 = var72 * 128;
                    for (int var75 = -var68; var75 < 128; var75++) {
                        if (var68 + var75 < 128) {
                            var73 += Statics.field800[var74 + var75 + var68];
                        }
                        if (var75 - (var68 + 1) >= 0) {
                            var73 -= Statics.field800[var74 + var75 - (var68 + 1)];
                        }
                        if (var75 >= 0) {
                            Statics.field192[var74 + var75] = var73 / (var68 * 2 + 1);
                        }
                    }
                    var72++;
                }
            }
            field717 = 0;
        }
        short var80 = 256;
        if (field721 > 0) {
            for (int var81 = 0; var81 < 256; var81++) {
                if (field721 > 768) {
                    Statics.field666[var81] = method850(Statics.field1115[var81], Statics.field728[var81], 1024 - field721);
                } else if (field721 > 256) {
                    Statics.field666[var81] = Statics.field728[var81];
                } else {
                    Statics.field666[var81] = method850(Statics.field728[var81], Statics.field1115[var81], 256 - field721);
                }
            }
        } else if (field712 > 0) {
            for (int var82 = 0; var82 < 256; var82++) {
                if (field712 > 768) {
                    Statics.field666[var82] = method850(Statics.field1115[var82], Statics.field781[var82], 1024 - field712);
                } else if (field712 > 256) {
                    Statics.field666[var82] = Statics.field781[var82];
                } else {
                    Statics.field666[var82] = method850(Statics.field781[var82], Statics.field1115[var82], 256 - field712);
                }
            }
        } else {
            for (int var83 = 0; var83 < 256; var83++) {
                Statics.field666[var83] = Statics.field1115[var83];
            }
        }
        class83.method1715(field716, 9, field716 + 128, var80 + 7);
        Statics.field726.method1630(field716, 0);
        class83.method1714();
        int var84 = 0;
        int var85 = field716 + Statics.field50.field1432 * 9;
        for (int var86 = 1; var86 < var80 - 1; var86++) {
            int var87 = (var80 - var86) * field709[var86] / var80;
            int var88 = var87 + 22;
            if (var88 < 0) {
                var88 = 0;
            }
            var84 += var88;
            for (int var89 = var88; var89 < 128; var89++) {
                int var90 = Statics.field800[var84++];
                if (var90 == 0) {
                    var85++;
                } else {
                    int var92 = 256 - var90;
                    int var93 = Statics.field666[var90];
                    int var94 = Statics.field50.field1436[var85];
                    Statics.field50.field1436[var85++] = ((var93 & 0xFF00) * var90 + (var94 & 0xFF00) * var92 & 0xFF0000) + ((var93 & 0xFF00FF) * var90 + (var94 & 0xFF00FF) * var92 & 0xFF00FF00) >> 8;
                }
            }
            var85 += Statics.field50.field1432 + var88 - 128;
        }
        class83.method1715(field716 + 765 - 128, 9, field716 + 765, var80 + 7);
        Statics.field2079.method1630(field716 + 382, 0);
        class83.method1714();
        int var95 = 0;
        int var96 = field716 + Statics.field50.field1432 * 9 + 24 + 637;
        for (int var97 = 1; var97 < var80 - 1; var97++) {
            int var98 = (var80 - var97) * field709[var97] / var80;
            int var99 = 103 - var98;
            int var100 = var96 + var98;
            for (int var101 = 0; var101 < var99; var101++) {
                int var102 = Statics.field800[var95++];
                if (var102 == 0) {
                    var100++;
                } else {
                    int var104 = 256 - var102;
                    int var105 = Statics.field666[var102];
                    int var106 = Statics.field50.field1436[var100];
                    Statics.field50.field1436[var100++] = ((var105 & 0xFF00FF) * var102 + (var106 & 0xFF00FF) * var104 & 0xFF00FF00) + ((var105 & 0xFF00) * var102 + (var106 & 0xFF00) * var104 & 0xFF0000) >> 8;
                }
            }
            var95 += 128 - var99;
            var96 = Statics.field50.field1432 - var99 - var98 + var100;
        }
        Statics.field706[Statics.field985.field125 ? 1 : 0].method1791(field716 + 765 - 40, 463);
        if (client.field275 > 5 && client.field347 == 0) {
            if (Statics.field1065 == null) {
                Statics.field1065 = class80.method3801(Statics.field2282, "sl_button", "");
            } else {
                int var107 = field716 + 5;
                short var108 = 463;
                byte var109 = 100;
                byte var110 = 35;
                Statics.field1065.method1791(var107, var108);
                arg0.method3852(class161.field2628 + " " + client.field266, var109 / 2 + var107, var110 / 2 + var108 - 2, 16777215, 0);
                if (Statics.field3171 == null) {
                    arg1.method3852(class161.field2475, var109 / 2 + var107, var110 / 2 + var108 + 12, 16777215, 0);
                } else {
                    arg1.method3852(class161.field2448, var109 / 2 + var107, var110 / 2 + var108 + 12, 16777215, 0);
                }
            }
        }
        try {
            Graphics var111 = Statics.field1812.getGraphics();
            Statics.field50.method1547(var111, 0, 0);
        } catch (Exception var113) {
            Statics.field1812.repaint();
        }
    }

    @ObfuscatedName("cg.m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method1611(String arg0, String arg1, String arg2) {
        field723 = arg0;
        field713 = arg1;
        field725 = arg2;
    }

    @ObfuscatedName("a.f(Lcb;I)V")
    public static final void method179(class84 arg0) {
        short var1 = 256;
        for (int var2 = 0; var2 < Statics.field711.length; var2++) {
            Statics.field711[var2] = 0;
        }
        for (int var3 = 0; var3 < 5000; var3++) {
            int var4 = (int) (Math.random() * 128.0D * (double) var1);
            Statics.field711[var4] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var6 = 1; var6 < var1 - 1; var6++) {
                for (int var7 = 1; var7 < 127; var7++) {
                    int var8 = (var6 << 7) + var7;
                    Statics.field702[var8] = (Statics.field711[var8 - 1] + Statics.field711[var8 + 1] + Statics.field711[var8 - 128] + Statics.field711[var8 + 128]) / 4;
                }
            }
            int[] var9 = Statics.field711;
            Statics.field711 = Statics.field702;
            Statics.field702 = var9;
        }
        if (arg0 == null) {
            return;
        }
        int var10 = 0;
        for (int var11 = 0; var11 < arg0.field1459; var11++) {
            for (int var12 = 0; var12 < arg0.field1462; var12++) {
                if (arg0.field1463[var10++] != 0) {
                    int var13 = var12 + 16 + arg0.field1461;
                    int var14 = var11 + 16 + arg0.field1464;
                    int var15 = (var14 << 7) + var13;
                    Statics.field711[var15] = 0;
                }
            }
        }
    }

    @ObfuscatedName("az.k(IIII)I")
    public static final int method850(int arg0, int arg1, int arg2) {
        int var3 = 256 - arg2;
        return ((arg0 & 0xFF00) * var3 + (arg1 & 0xFF00) * arg2 & 0xFF0000) + ((arg0 & 0xFF00FF) * var3 + (arg1 & 0xFF00FF) * arg2 & 0xFF00FF00) >> 8;
    }

    @ObfuscatedName("aw.h(Lhq;Lhq;B)V")
    public static void method936(class228 arg0, class228 arg1) {
        if (Statics.field652 == null) {
            Statics.field652 = Statics.method490(Statics.field2282, "sl_back", "");
        }
        if (Statics.field2115 == null) {
            Statics.field2115 = Statics.method667(Statics.field2282, "sl_flags", "");
        }
        if (Statics.field196 == null) {
            Statics.field196 = Statics.method667(Statics.field2282, "sl_arrows", "");
        }
        if (Statics.field1984 == null) {
            Statics.field1984 = Statics.method667(Statics.field2282, "sl_stars", "");
        }
        class83.method1721(field716, 23, 765, 480, 0);
        class83.method1726(field716, 0, 125, 23, 12425273, 9135624);
        class83.method1726(field716 + 125, 0, 640, 23, 5197647, 2697513);
        arg0.method3852(class161.field2577, field716 + 62, 15, 0, -1);
        if (Statics.field1984 != null) {
            Statics.field1984[1].method1791(field716 + 140, 1);
            arg1.method3812(class161.field2626, field716 + 152, 10, 16777215, -1);
            Statics.field1984[0].method1791(field716 + 140, 12);
            arg1.method3812(class161.field2627, field716 + 152, 21, 16777215, -1);
        }
        if (Statics.field196 != null) {
            int var2 = field716 + 280;
            if (class28.field634[0] == 0 && class28.field633[0] == 0) {
                Statics.field196[2].method1791(var2, 4);
            } else {
                Statics.field196[0].method1791(var2, 4);
            }
            if (class28.field634[0] == 0 && class28.field633[0] == 1) {
                Statics.field196[3].method1791(var2 + 15, 4);
            } else {
                Statics.field196[1].method1791(var2 + 15, 4);
            }
            arg0.method3812(class161.field2356, var2 + 32, 17, 16777215, -1);
            int var3 = field716 + 390;
            if (class28.field634[0] == 1 && class28.field633[0] == 0) {
                Statics.field196[2].method1791(var3, 4);
            } else {
                Statics.field196[0].method1791(var3, 4);
            }
            if (class28.field634[0] == 1 && class28.field633[0] == 1) {
                Statics.field196[3].method1791(var3 + 15, 4);
            } else {
                Statics.field196[1].method1791(var3 + 15, 4);
            }
            arg0.method3812(class161.field2629, var3 + 32, 17, 16777215, -1);
            int var4 = field716 + 500;
            if (class28.field634[0] == 2 && class28.field633[0] == 0) {
                Statics.field196[2].method1791(var4, 4);
            } else {
                Statics.field196[0].method1791(var4, 4);
            }
            if (class28.field634[0] == 2 && class28.field633[0] == 1) {
                Statics.field196[3].method1791(var4 + 15, 4);
            } else {
                Statics.field196[1].method1791(var4 + 15, 4);
            }
            arg0.method3812(class161.field2630, var4 + 32, 17, 16777215, -1);
            int var5 = field716 + 610;
            if (class28.field634[0] == 3 && class28.field633[0] == 0) {
                Statics.field196[2].method1791(var5, 4);
            } else {
                Statics.field196[0].method1791(var5, 4);
            }
            if (class28.field634[0] == 3 && class28.field633[0] == 1) {
                Statics.field196[3].method1791(var5 + 15, 4);
            } else {
                Statics.field196[1].method1791(var5 + 15, 4);
            }
            arg0.method3812(class161.field2444, var5 + 32, 17, 16777215, -1);
        }
        class83.method1721(field716 + 708, 4, 50, 16, 0);
        arg1.method3852(class161.field2593, field716 + 708 + 25, 16, 16777215, -1);
        field735 = -1;
        if (Statics.field652 != null) {
            byte var6 = 88;
            byte var7 = 19;
            int var8 = 765 / (var6 + 1);
            int var9 = 480 / (var7 + 1);
            int var10;
            int var11;
            do {
                var10 = var9;
                var11 = var8;
                if ((var8 - 1) * var9 >= class28.field631) {
                    var8--;
                }
                if ((var9 - 1) * var8 >= class28.field631) {
                    var9--;
                }
                if ((var9 - 1) * var8 >= class28.field631) {
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
            int var17 = field716 + var14;
            int var18 = 0;
            boolean var19 = false;
            for (int var20 = 0; var20 < class28.field631; var20++) {
                class28 var21 = Statics.field630[var20];
                boolean var22 = true;
                String var23 = Integer.toString(var21.field637);
                if (var21.field637 == -1) {
                    var23 = class161.field2609;
                    var22 = false;
                } else if (var21.field637 > 1980) {
                    var23 = class161.field2633;
                    var22 = false;
                }
                int var24 = 0;
                byte var25;
                if (var21.method639()) {
                    if (var21.method604()) {
                        var25 = 7;
                    } else {
                        var25 = 6;
                    }
                } else if (var21.method628()) {
                    var24 = 16711680;
                    if (var21.method604()) {
                        var25 = 5;
                    } else {
                        var25 = 4;
                    }
                } else if (var21.method606()) {
                    if (var21.method604()) {
                        var25 = 3;
                    } else {
                        var25 = 2;
                    }
                } else if (var21.method604()) {
                    var25 = 1;
                } else {
                    var25 = 0;
                }
                if (class144.field2193 >= var17 && class144.field2190 >= var16 && class144.field2193 < var6 + var17 && class144.field2190 < var7 + var16 && var22) {
                    field735 = var20;
                    Statics.field652[var25].method1636(var17, var16, 128, 16777215);
                    var19 = true;
                } else {
                    Statics.field652[var25].method1630(var17, var16);
                }
                if (Statics.field2115 != null) {
                    Statics.field2115[(var21.method604() ? 8 : 0) + var21.field640].method1791(var17 + 29, var16);
                }
                arg0.method3852(Integer.toString(var21.field627), var17 + 15, var7 / 2 + var16 + 5, var24, -1);
                arg1.method3852(var23, var17 + 60, var7 / 2 + var16 + 5, 268435455, -1);
                var16 += var7 + var13;
                var18++;
                if (var18 >= var9) {
                    var16 = var15 + 23;
                    var17 += var6 + var12;
                    var18 = 0;
                }
            }
            if (var19) {
                int var26 = arg1.method3807(Statics.field630[field735].field639) + 6;
                int var27 = arg1.field3239 + 8;
                class83.method1721(class144.field2193 - var26 / 2, class144.field2190 + 20 + 5, var26, var27, 16777120);
                class83.method1735(class144.field2193 - var26 / 2, class144.field2190 + 20 + 5, var26, var27, 0);
                arg1.method3852(Statics.field630[field735].field639, class144.field2193, class144.field2190 + 20 + 5 + arg1.field3239 + 4, 0, -1);
            }
        }
        try {
            Graphics var28 = Statics.field1812.getGraphics();
            Statics.field50.method1547(var28, 0, 0);
        } catch (Exception var30) {
            Statics.field1812.repaint();
        }
    }

    @ObfuscatedName("v.r(Lah;B)V")
    public static void method560(class28 arg0) {
        if (arg0.method604() != client.field487) {
            client.field487 = arg0.method604();
            boolean var1 = arg0.method604();
            if (Statics.field1052 != var1) {
                Statics.method3043();
                Statics.field1052 = var1;
            }
        }
        Statics.field797 = arg0.field635;
        client.field266 = arg0.field627;
        client.field267 = arg0.field638;
        Statics.field559 = client.field268 == 0 ? 43594 : arg0.field627 + 40000;
        Statics.field2319 = client.field268 == 0 ? 443 : arg0.field627 + 50000;
        Statics.field1727 = Statics.field559;
    }
}
